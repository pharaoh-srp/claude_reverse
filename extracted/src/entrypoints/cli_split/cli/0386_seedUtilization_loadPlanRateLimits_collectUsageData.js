  __export(SHl, {
    call: () => call_export12
  });
  var call_export12 = async (e, t) => {
    let n = e.trim() || undefined;
    for await (let r of clearConversation({
      ...t,
      clearedSessionTitle: n
    })) {
      t.onQueryEvent?.(r);
    }
    return {
      type: "text",
      value: ""
    };
  };
  var THl = __lazy(() => {
    msr();
  });
  var Q$m;
  function vHl(e) {
    if (getTeamName()) {
      return;
    }
    return e.standaloneAgentContext?.name;
  }
  function hsr(e, t) {
    let n = e.standaloneAgentContext;
    if (!Object.keys(t).some(o => n?.[o] !== t[o])) {
      return e;
    }
    return {
      ...e,
      standaloneAgentContext: {
        ...n,
        name: n?.name ?? "",
        ...t
      }
    };
  }
  var gsr = __lazy(() => {
    qp();
  });
  var wHl = {};
  __export(wHl, {
    performSetColor: () => performSetColor,
    call: () => call_export13
  });
  async function call_export13(e, t, n) {
    e(await performSetColor(n, t), {
      display: "system"
    });
    return null;
  }
  async function performSetColor(e, t) {
    if (isTeammate()) {
      return "Cannot set color: This session is a teammate. Teammate colors are assigned by the team leader.";
    }
    let n = e?.trim() ?? "";
    let r = n === "" ? eb[Math.floor(Math.random() * eb.length)] : n.toLowerCase();
    let o = Z$m.includes(r);
    if (!o && !eb.includes(r)) {
      let d = eb.join(", ");
      return `Invalid color "${r}". Available colors: ${d}, default`;
    }
    let s = getSessionId();
    let i = wh();
    let a = o ? "default" : r;
    let l = o ? undefined : r;
    await saveAgentColor(s, a, i);
    t.setAppState(d => hsr(d, {
      color: l
    }));
    let c = t.getAppState();
    let u = c.agent ? c.agentDefinitions.activeAgents.find(d => d.agentType === c.agent) : undefined;
    fFn(fT(), Rbt({
      userOverride: l,
      agentDefinitionColor: u?.color
    }));
    tHm(a);
    return o ? "Session color reset to default" : `Session color set to: ${r}`;
  }
  function tHm(e) {
    let t = vS()?.bridgeSessionId;
    if (!t) {
      return;
    }
    let n = getBridgeTokenOverride();
    Promise.resolve().then(() => (TFe(), S7e)).then(({
      updateBridgeSessionColorTag: r
    }) => r(t, e, eb, {
      baseUrl: getBridgeBaseUrlOverride(),
      getAccessToken: n ? () => n : undefined
    }).catch(() => {}));
  }
  var Z$m;
  var LHo = __lazy(() => {
    at();
    wZ();
    x$();
    zf();
    $U();
    Fy();
    fa();
    gsr();
    qp();
    Z$m = ["default", "reset", "none", "gray", "grey"];
  });
  var CHl = {};
  __export(CHl, {
    call: () => call_export14
  });
  async function call_export14(e, t) {
    return {
      type: "text",
      value: await performSetColor(e, t)
    };
  }
  var RHl = __lazy(() => {
    LHo();
  });
  var rHm;
  var xHl;
  var $Hl = {};
  __export($Hl, {
    tableTokenToMarkdown: () => tableTokenToMarkdown,
    normalizeTablesInMarkdown: () => normalizeTablesInMarkdown,
    fileExtension: () => fileExtension,
    collectRecentAssistantTexts: () => collectRecentAssistantTexts,
    call: () => call_export15
  });
  function sHm(e) {
    let t = vh.lexer(fLe(e));
    let n = [];
    for (let r of t) {
      if (r.type === "code") {
        let o = r;
        n.push({
          code: o.text,
          lang: o.lang
        });
      }
    }
    return n;
  }
  function AHl(e) {
    return e.tokens.map(t => t.raw).join("");
  }
  function iHm(e) {
    return [e.header.map(AHl), ...e.rows.map(t => t.map(AHl))];
  }
  function tableTokenToMarkdown(e) {
    let t = iHm(e).map(l => l.map(c => c.replace(/\|/g, "\\|").replace(/[\r\n]/g, " ")));
    let n = t[0].map((l, c) => Math.max(3, ...t.map(u => an(u[c] ?? ""))));
    let r = l => `| ${l.map((c, u) => c + " ".repeat(Math.max(0, n[u] - an(c)))).join(" | ")} |`;
    let o = (l, c) => {
      switch (c) {
        case "center":
          return `:${hm("-", l - 2)}:`;
        case "right":
          return `${hm("-", l - 1)}:`;
        case "left":
          return `:${hm("-", l - 1)}`;
        default:
          return "-".repeat(l);
      }
    };
    let s = `| ${n.map((l, c) => o(l, e.align[c] ?? null)).join(" | ")} |`;
    let [i, ...a] = t;
    return [r(i), s, ...a.map(r)].join(`
`);
  }
  function normalizeTablesInMarkdown(e) {
    let t = vh.lexer(e);
    let n = e;
    let r = 0;
    let o = 0;
    for (let s of t) {
      let i = e.indexOf(s.raw, r);
      if (i === -1) {
        continue;
      }
      if (r = i + s.raw.length, s.type !== "table") {
        continue;
      }
      let a = s.raw.match(/\n*$/)?.[0] ?? "";
      let l = tableTokenToMarkdown(s) + a;
      n = n.slice(0, i + o) + l + n.slice(i + s.raw.length + o);
      o += l.length - s.raw.length;
    }
    return n;
  }
  function collectRecentAssistantTexts(e) {
    let t = [];
    for (let n = e.length - 1; n >= 0 && t.length < 20; n--) {
      let r = e[n];
      if (r?.type !== "assistant" || r.isApiErrorMessage) {
        continue;
      }
      let o = r.message.content;
      if (!Array.isArray(o)) {
        continue;
      }
      let s = Tl(o, `

`);
      if (s) {
        t.push(s);
      }
    }
    return t;
  }
  function fileExtension(e) {
    if (e) {
      let t = e.replace(/[^a-zA-Z0-9]/g, "");
      if (t && t !== "plaintext") {
        return `.${t}`;
      }
    }
    return ".txt";
  }
  async function BHl(e, t) {
    let n = pT();
    let r = OHl.join(n, t);
    await PHl.mkdir(n, {
      recursive: true,
      mode: 448
    });
    await jDt(r, e, {
      encoding: "utf-8"
    });
    return r;
  }
  async function UHo(e, t) {
    let n = await Uk(e);
    if (n) {
      process.stdout.write(n);
    }
    let r = Ru(e, `
`) + 1;
    let s = `Copied to clipboard (${e.length} characters, ${r} lines)`;
    let i = kMn(e);
    try {
      let a = await BHl(e, t);
      let l = i ? `
\u26A0 ${i}; the file below is unaffected` : "";
      return `${s}${l}
Also written to ${a}`;
    } catch {
      let a = i ? `
\u26A0 ${i}` : "";
      return `${s}${a}`;
    }
  }
  function aHm(e, t) {
    let n = Ad(e);
    if (an(n) <= t) {
      return n;
    }
    let r = "";
    let o = 0;
    let s = t - 1;
    for (let i of n) {
      let a = an(i);
      if (o + a > s) {
        break;
      }
      r += i;
      o += a;
    }
    return r + "\u2026";
  }
  function lHm(e) {
    let t = IHl.c(35);
    let {
      fullText: n,
      codeBlocks: r,
      messageAge: o,
      onDone: s
    } = e;
    let i = DHl.useRef("full");
    let a = `${n.length} chars, ${Ru(n, `
`) + 1} lines`;
    let l;
    if (t[0] !== a) {
      l = {
        label: "Full response",
        value: "full",
        description: a
      };
      t[0] = a;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c;
    if (t[2] !== r || t[3] !== l) {
      let I;
      if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
        I = {
          label: "Always copy full response",
          value: "always",
          description: "Skip this picker in the future (revert via /config)"
        };
        t[5] = I;
      } else {
        I = t[5];
      }
      c = [l, ...r.map(uHm), I];
      t[2] = r;
      t[3] = l;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u = c;
    let d;
    if (t[6] !== r || t[7] !== n) {
      d = function (O) {
        if (O === "full" || O === "always") {
          return {
            text: n,
            filename: "response.md"
          };
        }
        let M = r[O];
        return {
          text: M.code,
          filename: `copy${fileExtension(M.lang)}`,
          blockIndex: O
        };
      };
      t[6] = r;
      t[7] = n;
      t[8] = d;
    } else {
      d = t[8];
    }
    let p = d;
    let m;
    if (t[9] !== r.length || t[10] !== p || t[11] !== o || t[12] !== s) {
      m = async function (O) {
        let M = p(O);
        if (O === "always") {
          if (!getGlobalConfig().copyFullResponse) {
            saveGlobalConfig(cHm);
          }
          logEvent("tengu_copy", {
            block_count: r.length,
            always: true,
            message_age: o
          });
          let P = await UHo(M.text, M.filename);
          s(`${P}
Preference saved. Use /config to change copyFullResponse`);
          return;
        }
        logEvent("tengu_copy", {
          selected_block: M.blockIndex,
          block_count: r.length,
          message_age: o
        });
        let L = await UHo(M.text, M.filename);
        s(L);
      };
      t[9] = r.length;
      t[10] = p;
      t[11] = o;
      t[12] = s;
      t[13] = m;
    } else {
      m = t[13];
    }
    let f = m;
    let h;
    if (t[14] !== r.length || t[15] !== p || t[16] !== o || t[17] !== s) {
      let I = async function (M) {
        let L = p(M);
        logEvent("tengu_copy", {
          selected_block: L.blockIndex,
          block_count: r.length,
          message_age: o,
          write_shortcut: true
        });
        try {
          let P = await BHl(L.text, L.filename);
          s(`Written to ${P}`);
        } catch (P) {
          let F = P;
          s(`Failed to write file: ${F instanceof Error ? F.message : F}`);
        }
      };
      h = function (M) {
        if (M.key === "w" && !M.ctrl && !M.meta) {
          M.preventDefault();
          I(i.current);
        }
      };
      t[14] = r.length;
      t[15] = p;
      t[16] = o;
      t[17] = s;
      t[18] = h;
    } else {
      h = t[18];
    }
    let g = h;
    let y;
    if (t[19] === Symbol.for("react.memo_cache_sentinel")) {
      y = LZ.jsx(Text, {
        dimColor: true,
        children: "Select content to copy:"
      });
      t[19] = y;
    } else {
      y = t[19];
    }
    let _;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      _ = I => {
        i.current = I;
      };
      t[20] = _;
    } else {
      _ = t[20];
    }
    let b;
    if (t[21] !== f) {
      b = I => {
        f(I);
      };
      t[21] = f;
      t[22] = b;
    } else {
      b = t[22];
    }
    let S;
    if (t[23] !== s) {
      S = () => {
        s("Copy cancelled", {
          display: "system"
        });
      };
      t[23] = s;
      t[24] = S;
    } else {
      S = t[24];
    }
    let E;
    if (t[25] !== u || t[26] !== S || t[27] !== b) {
      E = LZ.jsx(xr, {
        options: u,
        hideIndexes: false,
        onFocus: _,
        onChange: b,
        onCancel: S
      });
      t[25] = u;
      t[26] = S;
      t[27] = b;
      t[28] = E;
    } else {
      E = t[28];
    }
    let C;
    let x;
    if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
      C = LZ.jsx(xt, {
        chord: "enter",
        action: "copy",
        format: {
          keyCase: "lower"
        }
      });
      x = LZ.jsx(xt, {
        chord: "w",
        action: "write to file"
      });
      t[29] = C;
      t[30] = x;
    } else {
      C = t[29];
      x = t[30];
    }
    let A;
    if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
      A = LZ.jsx(Lw, {
        children: LZ.jsxs(Hn, {
          children: [C, x, LZ.jsx(xt, {
            chord: "escape",
            action: "cancel",
            format: {
              keyCase: "lower"
            }
          })]
        })
      });
      t[31] = A;
    } else {
      A = t[31];
    }
    let k;
    if (t[32] !== g || t[33] !== E) {
      k = LZ.jsx(Td, {
        children: LZ.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          tabIndex: 0,
          autoFocus: true,
          onKeyDown: g,
          children: [y, E, A]
        })
      });
      t[32] = g;
      t[33] = E;
      t[34] = k;
    } else {
      k = t[34];
    }
    return k;
  }
  function cHm(e) {
    return {
      ...e,
      copyFullResponse: true
    };
  }
  function uHm(e, t) {
    let n = Ru(e.code, `
`) + 1;
    return {
      label: aHm(e.code, 60),
      value: t,
      description: [e.lang, n > 1 ? `${n} lines` : undefined].filter(Boolean).join(", ") || undefined
    };
  }
  var IHl;
  var PHl;
  var OHl;
  var DHl;
  var LZ;
  var call_export15 = async (e, t, n) => {
    let r = collectRecentAssistantTexts(t.messages);
    if (r.length === 0) {
      e("No assistant message to copy");
      return null;
    }
    let o = 0;
    let s = n?.trim();
    if (s) {
      let c = Number(s);
      if (!Number.isInteger(c) || c < 1) {
        e(`Usage: /copy [N] where N is 1 (latest), 2, 3, \u2026 Got: ${s}`);
        return null;
      }
      if (c > r.length) {
        e(`Only ${r.length} assistant ${r.length === 1 ? "message" : "messages"} available to copy`);
        return null;
      }
      o = c - 1;
    }
    let i = normalizeTablesInMarkdown(r[o]);
    let a = sHm(i);
    let l = getGlobalConfig();
    if (a.length === 0 || l.copyFullResponse) {
      logEvent("tengu_copy", {
        always: l.copyFullResponse,
        block_count: a.length,
        message_age: o
      });
      let c = await UHo(i, "response.md");
      e(c);
      return null;
    }
    return LZ.jsx(lHm, {
      fullText: i,
      codeBlocks: a,
      messageAge: o,
      onDone: e
    });
  };
  var HHl = __lazy(() => {
    Gdt();
    $c();
    Ai();
    fz();
    bs();
    oE();
    bc();
    Tg();
    et();
    Ot();
    Zl();
    ro();
    Zn();
    BC();
    IHl = __toESM(pt(), 1);
    PHl = require("fs/promises");
    OHl = require("path");
    DHl = __toESM(ot(), 1);
    LZ = __toESM(ie(), 1);
  });
  var pHm;
  function _Qt(e) {
    let t = typeof e === "string" ? Buffer.from(e, "utf8") : e;
    let n = Buffer.allocUnsafe(5 + t.length);
    n.writeUInt32BE(t.length, 0);
    n.writeUInt8(0, 4);
    t.copy(n, 5);
    return n;
  }
  function YO(e) {
    let t = Buffer.from(De(e), "utf8");
    let n = Buffer.allocUnsafe(5 + t.length);
    n.writeUInt32BE(t.length, 0);
    n.writeUInt8(1, 4);
    t.copy(n, 5);
    return n;
  }
  function _sr(e, t) {
    let n = Buffer.alloc(0);
    let r = false;
    return o => {
      if (r) {
        return;
      }
      n = n.length === 0 ? o : Buffer.concat([n, o]);
      while (n.length >= 5) {
        let s = n.readUInt32BE(0);
        if (s > 1048576) {
          r = true;
          t(`frame too large (${s} > ${1048576})`);
          return;
        }
        let i = 5 + s;
        if (n.length < i) {
          return;
        }
        let a = n.readUInt8(4);
        let l = n.subarray(5, i);
        if (n = n.subarray(i), a === 0) {
          e({
            kind: 0,
            payload: Buffer.from(l)
          });
        } else if (a === 1) {
          let c;
          try {
            c = qt(l.toString("utf8"));
          } catch {
            r = true;
            t("bad ctrl json");
            return;
          }
          e({
            kind: 1,
            ctrl: c
          });
        } else {
          r = true;
          t(`unknown frame kind ${a}`);
          return;
        }
      }
    };
  }
  var X7e = __lazy(() => {});
  function Tfe(e) {
    if (!e) {
      return "\x1B_cc-daemon-detach\x1B\\";
    }
    return "\x1B_cc-detach-msg;" + e + "\x1B\\" + "\x1B_cc-daemon-detach\x1B\\";
  }
  function WHl(e) {
    let t = e.indexOf("\x1B_cc-detach-msg;");
    if (t < 0) {
      return;
    }
    let n = t + ("\x1B_cc-detach-msg;").length;
    let r = e.indexOf("\x1B\\", n);
    if (r < 0) {
      return;
    }
    return e.subarray(n, r).toString("utf8");
  }
  function $Ho() {
    return v.string().refine(Sse, "remote IPC path");
  }
  var zFe;
  var bsr;
  var Svt;
  var SQt;
  var TQt;
  var mHm;
  var GHl;
  var VHl;
  var pL = __lazy(() => {
    SGe();
    mm();
    X7e();
    zFe = /^[a-f0-9]{8}$/;
    bsr = we(() => v.object({
      proto: v.number().int().min(1).max(1),
      short: v.string().regex(zFe),
      nonce: v.string().regex(zFe).optional(),
      sessionId: v.string().transform(lC),
      createdAt: v.number(),
      source: v.enum(["shell", "slash", "fleet", "spare", "respawn"]).catch("fleet"),
      cwd: v.string().transform(lC),
      launch: v.discriminatedUnion("mode", [v.object({
        mode: v.literal("prompt"),
        args: v.array(v.string()).transform(aV)
      }), v.object({
        mode: v.literal("resume"),
        sessionId: v.string().transform(lC),
        transcriptPath: v.string().transform(lC).optional(),
        fork: v.boolean(),
        flagArgs: v.array(v.string()).transform(aV)
      }), v.object({
        mode: v.literal("exec"),
        cmd: v.string().transform(lC),
        args: v.array(v.string()).transform(e => e.map(lC))
      })]),
      env: v.record(v.string(), v.string()).default({}),
      reattachEnv: v.record(v.string(), v.string()).optional(),
      worktree: v.object({
        path: v.string().transform(lC),
        ownershipToken: v.string()
      }).optional(),
      isolation: v.enum(["none", "worktree"]).default("none"),
      respawnFlags: v.array(v.string()).default([]).transform(aV),
      attachStallRespawns: v.number().int().optional(),
      agent: v.string().optional(),
      routine: v.string().optional(),
      seed: v.object({
        intent: v.string(),
        name: v.string().optional()
      }).optional(),
      cols: v.number().int().positive().max(1e4).optional(),
      rows: v.number().int().positive().max(1e4).optional()
    }));
    Svt = /ERESPAWNING|ESTARTING/;
    SQt = /ESTALLED|EUNVERIFIED/;
    TQt = /^EKICKED:\s*/;
    mHm = we(() => v.object({
      pid: v.number(),
      procStart: v.string().optional(),
      sessionId: v.string().transform(lC),
      rendezvousSock: $Ho(),
      ptySock: $Ho().optional(),
      messagingSock: $Ho().optional(),
      cliVersion: v.string().optional(),
      startedAt: v.number(),
      attempt: v.number(),
      cwd: v.string().transform(lC),
      worktreePath: v.string().transform(lC).optional(),
      dispatch: bsr(),
      pendingRespawn: v.literal("upgrade").optional(),
      decModes: v.array(v.number()).optional(),
      rvAuth: v.string().optional(),
      ptyAuth: v.string().optional()
    }));
    GHl = we(() => v.object({
      proto: v.number().int().min(1).max(1),
      supervisorPid: v.number(),
      updatedAt: v.number(),
      workers: v.record(v.string().regex(zFe), mHm())
    }));
    VHl = we(() => {
      let e = v.string().regex(zFe);
      let t = v.number().int().min(1).max(1);
      return v.discriminatedUnion("op", [v.object({
        proto: t,
        op: v.literal("ping")
      }), v.object({
        proto: t,
        op: v.literal("nudge")
      }), v.object({
        proto: t,
        op: v.literal("yield")
      }), v.object({
        proto: t,
        op: v.literal("lease"),
        client: v.object({
          label: v.string(),
          cwd: v.string(),
          pid: v.number()
        }).optional()
      }), v.object({
        proto: t,
        op: v.literal("leases")
      }), v.object({
        proto: t,
        op: v.literal("await-ack"),
        short: e,
        nonce: e.optional(),
        timeoutMs: v.number()
      }), v.object({
        proto: t,
        op: v.literal("dispatch"),
        d: bsr(),
        timeoutMs: v.number(),
        auth: v.string().optional()
      }), v.object({
        proto: t,
        op: v.literal("list")
      }), v.object({
        proto: t,
        op: v.literal("has"),
        short: e
      }), v.object({
        proto: t,
        op: v.literal("kill"),
        short: e,
        signal: v.enum(["SIGTERM", "SIGKILL"]).optional(),
        handoff: v.boolean().optional()
      }), v.object({
        proto: t,
        op: v.literal("reply"),
        short: e,
        text: v.string(),
        auth: v.string().optional()
      }), v.object({
        proto: t,
        op: v.literal("subscribe"),
        short: e,
        tail: v.number().optional()
      }), v.object({
        proto: t,
        op: v.literal("attach"),
        short: e,
        auth: v.string().optional(),
        cols: v.number().int().min(1).max(1e4),
        rows: v.number().int().min(1).max(1e4),
        attachId: v.string().optional(),
        caps: v.object({
          terminal: v.string().nullable(),
          mux: v.enum(["tmux", "screen", "zellij"]).nullable(),
          ssh: v.boolean(),
          wheelFlood: v.boolean().optional(),
          hyperlinks: v.boolean().optional(),
          progressReporting: v.boolean().optional(),
          wtSession: v.boolean().optional(),
          isVscodeTerm: v.boolean().optional(),
          browser: v.string().nullable().optional(),
          colorLevel: v.union([v.literal(0), v.literal(1), v.literal(2), v.literal(3)]).optional(),
          syncOutput: v.boolean().optional(),
          editor: v.string().nullable().optional(),
          systemTheme: v.enum(["dark", "light"]).optional()
        }).optional(),
        holdingFrame: v.boolean().optional()
      }), v.object({
        proto: t,
        op: v.literal("resize"),
        short: e,
        cols: v.number().int().min(1).max(1e4),
        rows: v.number().int().min(1).max(1e4),
        attachId: v.string().optional()
      }), v.object({
        proto: t,
        op: v.literal("ensure-spare"),
        cwd: v.string()
      }), v.object({
        proto: t,
        op: v.literal("permission-response"),
        short: e,
        requestId: v.string(),
        allow: v.boolean(),
        auth: v.string().optional()
      }), v.object({
        proto: t,
        op: v.literal("respawn-stale"),
        short: e
      }), v.object({
        proto: t,
        op: v.literal("shutdown"),
        reapWorkers: v.boolean().optional()
      })]);
    });
  });
  function Iwe(e) {
    if (!uRn()) {
      return;
    }
    let t = kVa();
    if (sendRv({
      type: "detach-request",
      msg: t,
      broadcast: e?.broadcast
    })) {
      return;
    }
    process.stdout.write(Tfe(t));
  }
  var EQt = __lazy(() => {
    w7e();
    yd();
    U8e();
    pL();
  });
  function KHl() {
    let e = [process.argv[1] || "", process.execPath || ""];
    let t = ["/build-ant/", "/build-ant-native/", "/build-external/", "/build-external-native/"];
    return e.some(n => t.some(r => n.includes(r)));
  }
  function fHm(e) {
    let t = KHl() ? "claude-dev" : "claude";
    let n = new URL(`${t}://resume`);
    n.searchParams.set("session", e);
    return n.toString();
  }
  async function jHo() {
    if (KHl()) {
      return true;
    }
    let e = "linux";
    if (e === "darwin") {
      return ad("/Applications/Claude.app");
    } else if (e === "linux") {
      let {
        code: t,
        stdout: n
      } = await execFileNoThrow("xdg-mime", ["query", "default", "x-scheme-handler/claude"]);
      return t === 0 && n.trim().length > 0;
    } else if (e === "win32") {
      let {
        code: t
      } = await execFileNoThrow("reg", ["query", "HKEY_CLASSES_ROOT\\claude", "/ve"]);
      return t === 0;
    }
    return false;
  }
  async function hHm() {
    return null;
  }
  async function qHo() {
    if (!(await jHo())) {
      return {
        status: "not-installed"
      };
    }
    let t;
    try {
      t = await hHm();
    } catch {
      return {
        status: "ready",
        version: "unknown"
      };
    }
    if (!t) {
      return {
        status: "ready",
        version: "unknown"
      };
    }
    let n = zHl.coerce(t);
    if (!n || !iO(n.version, "1.1.9669")) {
      return {
        status: "version-too-old",
        version: t
      };
    }
    return {
      status: "ready",
      version: t
    };
  }
  async function gHm(e) {
    logForDebugging(`Opening deep link: ${e}`);
    {
      let {
        code: n
      } = await execFileNoThrow("xdg-open", [e]);
      return n === 0;
    }
    return false;
  }
  async function YHl() {
    let e = getSessionId();
    let t = await qHo();
    if (t.status === "not-installed") {
      return {
        success: false,
        error: "Claude Desktop is not installed. Install it from https://claude.ai/download"
      };
    }
    if (t.status === "version-too-old") {
      return {
        success: false,
        error: `Claude Desktop ${t.version} is too old to resume this session. Please update to ${"1.1.9669"} or later.`
      };
    }
    let n = fHm(e);
    if (!(await gHm(n))) {
      return {
        success: false,
        error: "Failed to open Claude Desktop. Please try opening it manually.",
        deepLinkUrl: n
      };
    }
    return {
      success: true,
      deepLinkUrl: n
    };
  }
  var zHl;
  var WHo = __lazy(() => {
    at();
    je();
    ji();
    Zl();
    zHl = __toESM(lq(), 1);
  });
  function yHm() {
    switch ("linux") {
      case "win32":
        return "https://claude.ai/api/desktop/win32/x64/exe/latest/redirect";
      default:
        return "https://claude.ai/api/desktop/darwin/universal/dmg/latest/redirect";
    }
  }
  function JHl({
    onDone: e
  }) {
    let [t, n] = Q7e.useState(gH?.state ?? "checking");
    let [r, o] = Q7e.useState(gH?.error ?? null);
    let [s, i] = Q7e.useState(gH?.downloadMessage ?? "");
    let a = useClock();
    Q7e.useEffect(() => {
      if (gH) {
        gH.setters = {
          setState: n,
          setError: o,
          setDownloadMessage: i
        };
        n(gH.state);
        o(gH.error);
        i(gH.downloadMessage);
      }
      return () => {
        if (gH?.setters?.setState === n) {
          gH.setters = null;
        }
      };
    }, []);
    function l(d, p) {
      gH = null;
      e(d, p);
    }
    function c(d) {
      if (d.key === "escape" || (d.ctrl || d.meta) && (d.key === "c" || d.key === "d")) {
        d.preventDefault();
        l(`Cancelled. Learn more about Claude Desktop at ${"https://clau.de/desktop"}`, {
          display: "system"
        });
        return;
      }
      if (d.ctrl || d.meta) {
        return;
      }
      if (t === "error") {
        d.preventDefault();
        l(r ?? "Unknown error", {
          display: "system"
        });
        return;
      }
      if (t === "prompt-download") {
        if (d.key === "y" || d.key === "Y") {
          d.preventDefault();
          Ac(yHm()).catch(() => {});
          l(`Starting download. Re-run /desktop once you\u2019ve installed the app.
Learn more at ${"https://clau.de/desktop"}`, {
            display: "system"
          });
        } else if (d.key === "n" || d.key === "N") {
          d.preventDefault();
          l(`The desktop app is required for /desktop. Learn more at ${"https://clau.de/desktop"}`, {
            display: "system"
          });
        }
      }
    }
    if (Q7e.useEffect(() => {
      if (gH) {
        return;
      }
      gH = {
        state: "checking",
        error: null,
        downloadMessage: "",
        setters: {
          setState: n,
          setError: o,
          setDownloadMessage: i
        }
      };
      function d(m) {
        if (!gH) {
          return;
        }
        Object.assign(gH, m);
        let f = gH.setters;
        if (m.state !== undefined) {
          f?.setState(m.state);
        }
        if (m.error !== undefined) {
          f?.setError(m.error);
        }
        if (m.downloadMessage !== undefined) {
          f?.setDownloadMessage(m.downloadMessage);
        }
      }
      async function p() {
        d({
          state: "checking"
        });
        let m = await qHo();
        if (m.status === "not-installed") {
          d({
            state: "prompt-download",
            downloadMessage: "Claude Desktop is not installed."
          });
          return;
        }
        if (m.status === "version-too-old") {
          d({
            state: "prompt-download",
            downloadMessage: `Claude Desktop needs to be updated (found v${m.version}, need v${"1.1.9669"}+).`
          });
          return;
        }
        d({
          state: "flushing"
        });
        await flushSessionStorage();
        d({
          state: "opening"
        });
        let f = await YHl();
        if (!f.success) {
          d({
            state: "error",
            error: f.error
          });
          return;
        }
        d({
          state: "success"
        });
        a.setTimeout(async () => {
          if (l("Session transferred to Claude Desktop", {
            display: "system"
          }), li()) {
            Iwe({
              broadcast: true
            });
          }
          await gracefulShutdown(0, "other");
        }, 500);
      }
      p().catch(m => {
        d({
          state: "error",
          error: he(m)
        });
      });
    }, []), t === "error") {
      return Efe.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: c,
        children: [Efe.jsxs(Text, {
          color: "error",
          children: ["Error: ", r]
        }), Efe.jsx(Text, {
          dimColor: true,
          children: "Press any key to continue\u2026"
        })]
      });
    }
    if (t === "prompt-download") {
      return Efe.jsxs(gXd, {
        flexDirection: "column",
        paddingX: 2,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: c,
        children: [Efe.jsx(Text, {
          children: s
        }), Efe.jsx(Text, {
          children: "Download now? (y/n)"
        })]
      });
    }
    return Efe.jsx(gXd, {
      paddingX: 2,
      children: Efe.jsx(Xc, {
        message: {
          checking: "Checking for Claude Desktop\u2026",
          flushing: "Saving session\u2026",
          opening: "Opening Claude Desktop\u2026",
          success: "Opening in Claude Desktop\u2026"
        }[t]
      })
    });
  }
  var Q7e;
  var Efe;
  var gH = null;
  var XHl = __lazy(() => {
    EQt();
    et();
    ky();
    yd();
    WHo();
    dt();
    lm();
    fa();
    Pv();
    Q7e = __toESM(ot(), 1);
    Efe = __toESM(ie(), 1);
  });
  var QHl = {};
  __export(QHl, {
    call: () => call_export16
  });
  async function call_export16(e) {
    return ZHl.jsx(JHl, {
      onDone: e
    });
  }
  var ZHl;
  var ejl = __lazy(() => {
    XHl();
    ZHl = __toESM(ie(), 1);
  });
  function bHm() {
    return false;
  }
  function Tvt() {
    return bHm() && isPolicyAllowed("allow_desktop_handoff");
  }
  var SHm;
  function rjl(e, t, n) {
    let {
      commit: r,
      pr: o
    } = b8e();
    let s = oz(r);
    let i = oz(n ?? o);
    let a = ojl(process.env.SAFEUSER || "");
    let l = ojl(process.env.USER || "");
    let c = "";
    let u = "";
    let d = "";
    let p = "";
    let m = `

5. After creating/updating the PR, check if the user's CLAUDE.md mentions posting to Slack channels. If it does, use ToolSearch to search for "slack send message" tools. If ToolSearch finds a Slack tool, ask the user if they'd like you to post the PR URL to the relevant Slack channel. Only post if the user confirms. If ToolSearch returns no results or errors, skip this step silently\u2014do not mention the failure, do not attempt workarounds, and do not try alternative approaches.`;
    return `${c}## Context

- \`SAFEUSER\`: ${a}
- \`whoami\`: ${l}
- \`git status\`: !\`git status\`
- \`git diff HEAD\`: !\`git diff HEAD\`
- \`git branch --show-current\`: !\`git branch --show-current\`
- \`git diff ${e}...HEAD\`: !\`git diff ${e}...HEAD\`
- \`gh pr view --json number\`: !\`${Pu() ? "gh pr view --json number 2>/dev/null || true" : 'gh pr view --json number 2>$null; if (-not $?) { "" }'}\`

## Git Safety Protocol

- NEVER update the git config
- NEVER run destructive/irreversible git commands (like push --force, hard reset, etc) unless the user explicitly requests them
- NEVER skip hooks (--no-verify, --no-gpg-sign, etc) unless the user explicitly requests it
- NEVER run force push to main/master, warn the user if they request it
- Do not commit files that likely contain secrets (.env, credentials.json, etc)
- Never use git commands with the -i flag (like git rebase -i or git add -i) since they require interactive input which is not supported

## Your task

Analyze all changes that will be included in the pull request, making sure to look at all relevant commits (NOT just the latest commit, but ALL commits that will be included in the pull request from the git diff ${e}...HEAD output above).

Based on the above changes:
1. Create a new branch if on ${e} (use SAFEUSER from context above for the branch name prefix, falling back to whoami if SAFEUSER is empty, e.g., \`username/feature-name\`)
2. Create a single commit with an appropriate message${s ? ", ending with the attribution text shown in the example below" : ""}:
${Pu() ? `\`\`\`
git commit -m "$(cat <<'EOF'
Commit message here.${s ? `

${s}` : ""}
EOF
)"
\`\`\`` : `\`\`\`
git commit -m @'
Commit message here.${s ? `

${s}` : ""}
'@
\`\`\`
The closing \`'@\` MUST be at column 0 with no leading whitespace.`}
3. Push the branch to origin
4. If a PR already exists for this branch (check the gh pr view output above), update the PR title and body using \`gh pr edit\` to reflect the current diff${d}. Otherwise, create a pull request using \`gh pr create\` with the multi-line body syntax shown below${u}.
   - IMPORTANT: Keep PR titles short (under 70 characters). Use the body for details.
${Pu() ? `\`\`\`
gh pr create --title "Short, descriptive title" --body "$(cat <<'EOF'
## Summary
<1-3 bullet points>

## Test plan
[Bulleted markdown checklist of TODOs for testing the pull request...]${p}${i ? `

${i}` : ""}
EOF
)"
\`\`\`` : `\`\`\`
gh pr create --title "Short, descriptive title" --body @'
## Summary
<1-3 bullet points>

## Test plan
[Bulleted markdown checklist of TODOs for testing the pull request...]${p}${i ? `

${i}` : ""}
'@
\`\`\``}

You have the capability to call multiple tools in a single response. You MUST do all of the above in a single message.${m}

Return the PR URL when you're done, so the user can see it.`;
  }
  function ojl(e) {
    return e.replace(/[^a-zA-Z0-9._-]/g, "");
  }
  var THm;
  var njl;
  var EHm;
  var ajl = {};
  __export(ajl, {
    call: () => call_export17
  });
  async function wHm(e, t, n) {
    t.onCompactEvent?.({
      type: "compact_progress",
      event: {
        type: "hooks_start",
        hookType: "pre_compact"
      }
    });
    t.onCompactEvent?.({
      type: "sdk_status",
      status: "compacting"
    });
    let r = performance.now();
    let o;
    let s = nR(e);
    let i;
    let a;
    try {
      let [l, c] = await Promise.all([executePreCompactHooks({
        trigger: "manual",
        customInstructions: n || null
      }, t.abortController.signal), xHm(t, e)]);
      Drr(l, h => t.onQueryEvent?.({
        type: "notification",
        notification: h
      }));
      let u = S2o(n, l.newCustomInstructions);
      t.onCompactEvent?.({
        type: "stream_mode",
        mode: "requesting"
      });
      t.onQueryEvent?.({
        type: "response_length",
        op: "reset"
      });
      t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_start"
        }
      });
      let d = await CHm(n, l.newCustomInstructions, e, t.abortController.signal);
      a = d.reuse;
      let p = await (d.hit ? RHn({
        ...d.finalize,
        startTime: r,
        cacheSafeParams: c
      }) : cmo(e, c, {
        customInstructions: u,
        trigger: "manual",
        manualPrecomputeReuse: d.reuse,
        userWaitStartedAt: r,
        precomputedKind: d.precomputedKind,
        precomputedFailureCause: d.precomputedFailureCause
      })).catch(h => (Oe(h), {
        ok: false,
        reason: "error",
        detail: he(h)
      }));
      if (!p.ok) {
        switch (p.reason) {
          case "too_few_groups":
            throw Error("Not enough messages to compact.");
          case "aborted":
            throw Error("API Error: Request was aborted.");
          case "exhausted":
            throw new d5("Compaction failed \xB7 conversation could not be reduced below the context limit");
          case "media_unstrippable":
            throw new d5("Compaction failed \xB7 attached media exceeds size limits");
          case "error":
            throw new d5(`Error during compaction: ${p.detail || "unknown error"}`);
        }
      }
      let m = p.result.boundaryMarker;
      if (m.subtype === "compact_boundary" && "compactMetadata" in m) {
        i = m.compactMetadata.postTokens;
      }
      Mde(undefined, t.setAppState);
      Spt();
      iE.cache.clear?.();
      let f = [l.userDisplayMessage, p.result.userDisplayMessage].filter(Boolean).join(`
`) || undefined;
      return {
        type: "compact",
        compactionResult: {
          ...p.result,
          userDisplayMessage: f
        },
        displayText: RHm(t, f)
      };
    } catch (l) {
      throw o = l instanceof Error ? l.message : "reactive compaction failed", l;
    } finally {
      t.onCompactEvent?.({
        type: "stream_mode",
        mode: "requesting"
      });
      t.onQueryEvent?.({
        type: "response_length",
        op: "reset"
      });
      t.onCompactEvent?.({
        type: "compact_progress",
        event: {
          type: "compact_end"
        }
      });
      fOe({
        trigger: "manual",
        success: !o,
        durationMs: performance.now() - r,
        preTokens: s,
        postTokens: i,
        error: o,
        precomputeReuse: a
      });
      t.onCompactEvent?.({
        type: "sdk_status",
        status: null,
        metadata: {
          compactResult: o ? "failed" : "success",
          ...(o && {
            compactError: o
          })
        }
      });
    }
  }
  async function CHm(e, t, n, r) {
    if (e) {
      return {
        hit: false,
        reuse: "miss_custom_instructions"
      };
    }
    if (t) {
      return {
        hit: false,
        reuse: "miss_hook"
      };
    }
    let o = performance.now();
    let s = await nmo(undefined, r);
    let i = performance.now() - o;
    if (s === null) {
      Mpt("none", s, i);
      return {
        hit: false,
        reuse: "miss_not_ready",
        precomputedKind: "none"
      };
    }
    if (s.kind === "turn_aborted") {
      throw Mpt("aborted", s, i), Error("API Error: Request was aborted.");
    }
    if (s.kind === "failed") {
      Mpt("failed", s, i);
      return {
        hit: false,
        reuse: "miss_not_ready",
        precomputedKind: "failed",
        precomputedFailureCause: s.failure.cause
      };
    }
    let a = omo(n, s.ready.precomputedAtUuid);
    if (a === null) {
      Mpt("none", s, i);
      EHn(s.ready, "boundary_uuid_missing", undefined);
      return {
        hit: false,
        reuse: "miss_not_ready",
        precomputedKind: "none"
      };
    }
    Mpt("applied", s, i);
    return {
      hit: true,
      reuse: "hit",
      finalize: {
        compactResult: s.ready.result,
        messagesToPreserve: [...s.ready.result.messagesToPreserve, ...a],
        preCompactMessages: n,
        querySource: undefined,
        trigger: "manual",
        precomputed: true,
        manualPrecomputeReuse: "hit",
        precomputeTelemetry: {
          statusAtPTL: s.statusAtPTL === "ready" ? "ready" : "pending",
          leadMs: o - s.ready.startedAt,
          totalMs: s.ready.readyDurationMs,
          borrowed: false,
          messagesSinceTokens: nR(a)
        }
      }
    };
  }
  function RHm(e, t) {
    let n = hKe("tip");
    let r = dx("app:toggleTranscript", "Global", "ctrl+o");
    let o = [...(e.options.verbose ? [] : [`(${r} to see full summary)`]), ...(t ? [t] : []), ...(n ? [n] : [])];
    return _$u.dim("Compacted " + o.join(`
`));
  }
  async function xHm(e, t) {
    let n = e.getAppState();
    let r = await GO(e.options.tools, e.options.mainLoopModel, Array.from(getToolPermissionContext(e).additionalWorkingDirectories.keys()));
    let o = J9({
      mainThreadAgentDefinition: undefined,
      toolUseContext: e,
      customSystemPrompt: e.options.customSystemPrompt,
      defaultSystemPrompt: r,
      appendSystemPrompt: e.options.appendSystemPrompt
    });
    let [s, i] = await Promise.all([iE(), Tv(n.cacheBreakerPhrase)]);
    return {
      systemPrompt: o,
      userContext: s,
      systemContext: i,
      toolUseContext: e,
      forkContextMessages: t
    };
  }
  var call_export17 = async (e, t) => {
    let {
      abortController: n
    } = t;
    let {
      messages: r
    } = t;
    if (r = kg(r), r.length === 0) {
      throw Error("No messages to compact");
    }
    let o = e.trim();
    try {
      return await wHm(r, t, o);
    } catch (s) {
      if (n.signal.aborted) {
        throw new xc("Compaction canceled.");
      } else if (Mae(s, "Not enough messages to compact.")) {
        return {
          type: "text",
          value: "Not enough messages to compact."
        };
      } else if (s instanceof d5) {
        return {
          type: "text",
          value: s.message
        };
      } else {
        throw Oe(s), Error(`Error during compaction: ${s instanceof Error ? s.message : String(s)}`, {
          cause: s
        });
      }
    }
  };
  var ljl = __lazy(() => {
    dz();
    LG();
    kre();
    Dde();
    Tpt();
    Npt();
    wHn();
    t5e();
    IV();
    Sl();
    Eve();
    dt();
    Sp();
    Cde();
    Rn();
    ro();
    fQn();
    Nze();
    yS();
  });
  var kHm;
  var ujl = {};
  __export(ujl, {
    call: () => call_export18,
    applyAutoCompactWindow: () => applyAutoCompactWindow
  });
  function AHm(e, t) {
    let {
      window: n,
      configured: r,
      source: o
    } = jq(e, t);
    let s = r > n ? ` \xB7 capped to ${formatTokens(n)} by model` : "";
    let a = [`Auto-compact window: ${o === "auto" ? "auto" : o === "experiment" || o === "clientdata" ? `auto (${formatTokens(r)} tokens)${s}` : o === "env" ? `${formatTokens(r)} tokens (from CLAUDE_CODE_AUTO_COMPACT_WINDOW)${s}` : `${formatTokens(r)} tokens (from settings)${s}`}`];
    if (!Sx()) {
      a.push("Auto-compact is currently disabled (see /config)");
    }
    if (a.push("Auto-compact summarizes the conversation when context usage approaches this limit. The actual threshold is the minimum of this setting and your model's maximum context window."), a.push("The auto setting picks a window tuned for your model and is strongly recommended for the best cost and performance."), o === "env" || o === "settings") {
      a.push("Overriding auto may result in high token usage, especially when resuming long sessions.");
    }
    return a.join(`
`);
  }
  function applyAutoCompactWindow(e, t) {
    let n = t.options.mainLoopModel;
    if (jq(n, undefined).source === "env") {
      return "CLAUDE_CODE_AUTO_COMPACT_WINDOW is set and takes precedence. Unset it to change this setting.";
    }
    let r = e.trim().toLowerCase();
    let s = r === "reset" || r === "unset" || r === "default" ? "auto" : odo(r);
    if (s === undefined) {
      return `Couldn't parse '${e}'. Expected 'auto' or 100k\u20131M tokens (e.g. 500k, 200000, or 200 as shorthand)`;
    }
    let i = s === "auto" ? undefined : s;
    let {
      error: a
    } = updateSettingsForSource("userSettings", {
      autoCompactWindow: i
    });
    if (a) {
      return `Couldn't save setting: ${a.message}`;
    }
    let l = getInitialSettings().autoCompactWindow;
    let {
      window: c,
      source: u
    } = jq(n, l);
    let d = u === "env" || l !== i;
    let p = d ? l : i;
    if (t.onQueryEvent?.({
      type: "apply_flag_settings",
      settings: {
        autoCompactWindow: p ?? null
      }
    }), logEvent("tengu_autocompact_command", {
      action: s === "auto" ? "auto" : "set",
      ...(i !== undefined && {
        tokens: i
      })
    }), s === "auto") {
      return d ? `Auto-compact window set to auto in settings, but a higher-priority override is active (${formatTokens(c)} tokens)` : "Auto-compact window set to auto";
    }
    let m = "";
    if (d) {
      m = `, but a higher-priority override is active (${formatTokens(c)} tokens)`;
    } else if (c < s) {
      m = ` (capped to model limit of ${formatTokens(c)})`;
    }
    return `Auto-compact window set to ${formatTokens(s)} tokens${m}`;
  }
  var call_export18 = async (e, t) => {
    let n = e.trim();
    if (!n) {
      return {
        type: "text",
        value: AHm(t.options.mainLoopModel, t.options.autoCompactWindow)
      };
    }
    return {
      type: "text",
      value: applyAutoCompactWindow(n, t)
    };
  };
  var zHo = __lazy(() => {
    Ot();
    d$();
    cs();
  });
  var pjl = {};
  __export(pjl, {
    call: () => call_export19
  });
  function PHm(e) {
    let t = djl.c(52);
    let {
      onDone: n,
      context: r
    } = e;
    let o = bt(OHm);
    let s = dR();
    let i;
    if (t[0] !== o || t[1] !== s) {
      i = jq(s, o);
      t[0] = o;
      t[1] = s;
      t[2] = i;
    } else {
      i = t[2];
    }
    let {
      window: a,
      configured: l,
      source: c
    } = i;
    let u;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      u = Sx();
      t[3] = u;
    } else {
      u = t[3];
    }
    let d = u;
    let p = l > a;
    let m = c === "env";
    let f = c === "env" ? "from CLAUDE_CODE_AUTO_COMPACT_WINDOW" : c === "settings" ? "from settings" : "auto";
    let h = c === "auto" || c === "experiment" || c === "clientdata" ? 0 : Math.min(1e6, Math.max(1e5, Math.round(l / 1e5) * 1e5));
    let [g, y] = XHo.useState(h);
    let [_, b] = XHo.useState(false);
    let S;
    if (t[4] !== m) {
      S = function (se) {
        if (m) {
          return;
        }
        b(true);
        y(ae => {
          if (ae === 0) {
            return se > 0 ? 1e5 : 1e6;
          }
          let de = ae + se * 1e5;
          if (de < 1e5) {
            return 0;
          }
          if (de > 1e6) {
            return 0;
          }
          return de;
        });
      };
      t[4] = m;
      t[5] = S;
    } else {
      S = t[5];
    }
    let E = S;
    let C;
    if (t[6] !== p || t[7] !== a) {
      C = p ? ` \xB7 capped to ${formatTokens(a)} by model` : "";
      t[6] = p;
      t[7] = a;
      t[8] = C;
    } else {
      C = t[8];
    }
    let x = C;
    let A;
    if (t[9] !== x || t[10] !== l || t[11] !== c || t[12] !== f) {
      A = c === "auto" ? "auto" : c === "experiment" || c === "clientdata" ? `auto (${formatTokens(l)} tokens)${x}` : `${formatTokens(l)} tokens (${f})${x}`;
      t[9] = x;
      t[10] = l;
      t[11] = c;
      t[12] = f;
      t[13] = A;
    } else {
      A = t[13];
    }
    let k = A;
    let I;
    if (t[14] !== _ || t[15] !== r || t[16] !== k || t[17] !== n || t[18] !== g) {
      I = function () {
        if (!_) {
          n(`Auto-compact window unchanged: ${k}`);
          return;
        }
        let se = g === 0 ? "auto" : String(g);
        n(applyAutoCompactWindow(se, r));
      };
      t[14] = _;
      t[15] = r;
      t[16] = k;
      t[17] = n;
      t[18] = g;
      t[19] = I;
    } else {
      I = t[19];
    }
    let O = I;
    let M;
    let L;
    if (t[20] !== E) {
      M = () => E(1);
      L = () => E(-1);
      t[20] = E;
      t[21] = M;
      t[22] = L;
    } else {
      M = t[21];
      L = t[22];
    }
    let P;
    if (t[23] !== O || t[24] !== M || t[25] !== L) {
      P = {
        "select:previous": M,
        "select:next": L,
        "select:accept": O
      };
      t[23] = O;
      t[24] = M;
      t[25] = L;
      t[26] = P;
    } else {
      P = t[26];
    }
    let F;
    if (t[27] === Symbol.for("react.memo_cache_sentinel")) {
      F = {
        context: "Select"
      };
      t[27] = F;
    } else {
      F = t[27];
    }
    jo(P, F);
    let H;
    if (t[28] !== E) {
      H = {
        "tabs:next": () => E(1),
        "tabs:previous": () => E(-1)
      };
      t[28] = E;
      t[29] = H;
    } else {
      H = t[29];
    }
    let U;
    if (t[30] === Symbol.for("react.memo_cache_sentinel")) {
      U = {
        context: "Tabs"
      };
      t[30] = U;
    } else {
      U = t[30];
    }
    jo(H, U);
    let N;
    if (t[31] !== g) {
      N = g === 0 ? "auto" : `${formatTokens(g)} tokens`;
      t[31] = g;
      t[32] = N;
    } else {
      N = t[32];
    }
    let W = N;
    let j = `Current setting: ${k}`;
    let z;
    if (t[33] !== k || t[34] !== n) {
      z = () => n(`Auto-compact window unchanged: ${k}`);
      t[33] = k;
      t[34] = n;
      t[35] = z;
    } else {
      z = t[35];
    }
    let V;
    if (t[36] === Symbol.for("react.memo_cache_sentinel")) {
      V = GM.jsx(Text, {
        dimColor: true,
        children: GM.jsxs(Hn, {
          children: [GM.jsx(xt, {
            chord: ["up", "down"],
            action: "change"
          }), GM.jsx(xt, {
            chord: "enter",
            action: "apply"
          }), GM.jsx(xt, {
            chord: "escape",
            action: "cancel"
          })]
        })
      });
      t[36] = V;
    } else {
      V = t[36];
    }
    let K;
    if (t[37] === Symbol.for("react.memo_cache_sentinel")) {
      K = GM.jsx(Text, {
        children: "This command configures when auto-compaction happens. The actual threshold is the minimum of this setting and your model's maximum context window."
      });
      t[37] = K;
    } else {
      K = t[37];
    }
    let J;
    let Q;
    if (t[38] === Symbol.for("react.memo_cache_sentinel")) {
      J = GM.jsxs(Text, {
        children: ["The auto setting picks a window tuned for your model and is", " ", GM.jsx(Text, {
          bold: true,
          children: "strongly recommended"
        }), " for the best cost and performance. You can override it below."]
      });
      Q = !d && GM.jsx(Text, {
        color: "warning",
        children: "Auto-compact is currently disabled (see /config)"
      });
      t[38] = J;
      t[39] = Q;
    } else {
      J = t[38];
      Q = t[39];
    }
    let Z;
    if (t[40] !== g) {
      Z = g !== 0 && GM.jsx(Text, {
        color: "warning",
        children: "Overriding auto may result in high token usage, especially when resuming long sessions."
      });
      t[40] = g;
      t[41] = Z;
    } else {
      Z = t[41];
    }
    let ne;
    if (t[42] !== W || t[43] !== m) {
      ne = m ? GM.jsx(Text, {
        color: "warning",
        children: "CLAUDE_CODE_AUTO_COMPACT_WINDOW is set and takes precedence. Unset it to change this setting here."
      }) : GM.jsxs(gXd, {
        children: [GM.jsx(Text, {
          children: "Select auto-compact window: "
        }), GM.jsx(Text, {
          bold: true,
          color: "suggestion",
          children: W
        })]
      });
      t[42] = W;
      t[43] = m;
      t[44] = ne;
    } else {
      ne = t[44];
    }
    let oe;
    if (t[45] !== Z || t[46] !== ne) {
      oe = GM.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [K, J, Q, Z, ne]
      });
      t[45] = Z;
      t[46] = ne;
      t[47] = oe;
    } else {
      oe = t[47];
    }
    let ee;
    if (t[48] !== j || t[49] !== z || t[50] !== oe) {
      ee = GM.jsx(or, {
        title: "Auto-compact window",
        subtitle: j,
        onCancel: z,
        inputGuide: V,
        children: oe
      });
      t[48] = j;
      t[49] = z;
      t[50] = oe;
      t[51] = ee;
    } else {
      ee = t[51];
    }
    return ee;
  }
  function OHm(e) {
    return e.autoCompactWindow;
  }
  var djl;
  var XHo;
  var GM;
  var call_export19 = async (e, t, n) => {
    let r = n?.trim() || "";
    if (r) {
      let o = applyAutoCompactWindow(r, t);
      e(o);
      return null;
    }
    logEvent("tengu_autocompact_dialog_opened", {
      source: "dialog"
    });
    return GM.jsx(PHm, {
      onDone: e,
      context: t
    });
  };
  var mjl = __lazy(() => {
    Ai();
    Ii();
    bs();
    iH();
    et();
    Bs();
    Ot();
    d$();
    ho();
    cs();
    zHo();
    djl = __toESM(pt(), 1);
    XHo = __toESM(ot(), 1);
    GM = __toESM(ie(), 1);
  });
  function fjl() {
    return !!Z2n();
  }
  var hjl;
  var Esr;
  var gjl = __lazy(() => {
    at();
    d$();
    hjl = {
      type: "local-jsx",
      name: "autocompact",
      description: "Set how full the context gets before auto-summarizing",
      isEnabled: () => fjl() && !getIsNonInteractiveSession(),
      isHidden: false,
      argumentHint: "[auto|<tokens>]",
      load: () => Promise.resolve().then(() => (mjl(), pjl)),
      userFacingName() {
        return "autocompact";
      }
    };
    Esr = {
      type: "local",
      name: "autocompact",
      supportsNonInteractive: true,
      thinClientDispatch: "post-text",
      description: "Configure the auto-compact window size",
      get isHidden() {
        return !getIsNonInteractiveSession() && !getIsRemoteMode();
      },
      isEnabled() {
        return fjl() && (getIsNonInteractiveSession() || getIsRemoteMode());
      },
      argumentHint: "[auto|<tokens>]",
      load: () => Promise.resolve().then(() => (zHo(), ujl)),
      userFacingName() {
        return "autocompact";
      }
    };
  });
  function KFe(e, t, n) {
    if (!isClaudeAISubscriber()) {
      return false;
    }
    let r = e !== null ? parseUserSpecifiedModel(e) : getDefaultMainLoopModel();
    let o = r.toLowerCase();
    let s = o.includes("opus") || o.includes("fable");
    let i = o.includes("opus-4-6");
    let a = o.includes("sonnet-4-6");
    if (t && yh(e)) {
      return true;
    }
    if ((o.includes("fable") || isPinnedFableModel(r)) && !m$() && (_Te() || kde())) {
      return true;
    }
    if (!hg(o)) {
      return false;
    }
    if (s && n) {
      return false;
    }
    return i || a;
  }
  var wQt = __lazy(() => {
    no();
    VT();
    GT();
    PV();
    Eo();
  });
  async function CQt(e) {
    let t = e === "default" ? null : e;
    if (t && isModelDenied(t, getModelEntitlementDenySet())) {
      Ae("model_switch", "denied_by_entitlement");
      return {
        ok: false,
        message: `Model '${t}' is restricted by your organization's settings. Run /model to choose a different model.`
      };
    }
    if (t && !isModelAllowed(t)) {
      Ae("model_switch", "not_allowed");
      return {
        ok: false,
        message: `Model '${t}' is not available. Your organization restricts model selection.`
      };
    }
    if (t && ZHo(t)) {
      Ae("model_switch", "opus_1m_unavailable");
      return {
        ok: false,
        message: "Opus with 1M context is not available for your account. Learn more: https://code.claude.com/docs/en/model-config#extended-context-with-1m"
      };
    }
    if (t && ejo(t)) {
      Ae("model_switch", "sonnet_1m_unavailable");
      return {
        ok: false,
        message: "Sonnet with 1M context is not available for your account. Learn more: https://code.claude.com/docs/en/model-config#extended-context-with-1m"
      };
    }
    if (t) {
      let n = getModelUnavailabilityReason(t);
      if (n) {
        switch (n.reason) {
          case "disabled":
            Ae("model_switch", "disabled_by_org");
            return {
              ok: false,
              message: `Model '${t}' is not currently available for your account${n.description ? `. ${n.description}` : "."}`
            };
          case "absent":
            {
              let r = await x7t(yjl(t) ? parseUserSpecifiedModel(t) : t, {
                forceServerProbe: true
              });
              if (!r.valid) {
                Ae("model_switch", r.notFound ? "fable_unavailable" : "fable_probe_failed");
                return {
                  ok: false,
                  message: r.notFound ? `${n.displayName} isn't available for your account yet. Run /model to pick another model.` : r.error
                };
              }
              fetchBootstrapData();
              return {
                ok: true,
                model: t
              };
            }
        }
      }
    }
    if (!t || yjl(t)) {
      return {
        ok: true,
        model: t
      };
    }
    try {
      let n = await x7t(t);
      if (!n.valid) {
        Ae("model_switch", "invalid_model");
        return {
          ok: false,
          message: n.error
        };
      }
      return {
        ok: true,
        model: t
      };
    } catch (n) {
      Ae("model_switch", "validate_exception");
      return {
        ok: false,
        message: `Failed to validate model: ${he(n)}`
      };
    }
  }
  function wsr(e, t, n, r) {
    let o = t().fastMode;
    if (clearRefusalFallbackModelLatch(), n(a => ({
      ...a,
      mainLoopModel: e,
      mainLoopModelForSession: null
    })), r) {
      RQt(e);
    }
    Pe("model_switch");
    let s = `Set model to ${_$u.bold(JO(e))}${r ? " and saved as your default for new sessions" : " for this session only"}`;
    let i = undefined;
    if (lc()) {
      if (u0e(), !yh(e) && o) {
        n(a => ({
          ...a,
          fastMode: false
        }));
        i = false;
      } else if (yh(e) && o) {
        s += " \xB7 Fast mode ON";
        i = true;
      }
    }
    if (KFe(e, i === true, isOpus1mMergeEnabled())) {
      s += " \xB7 Draws from usage credits";
    }
    if (i === false) {
      s += " \xB7 Fast mode OFF";
    }
    s += QHo(e);
    return s;
  }
  function RQt(e) {
    updateSettingsForSource("userSettings", {
      model: e ?? undefined
    });
    Pe("model_set_default");
  }
  function QHo(e) {
    let t = getEffectiveSettingSource("model");
    if (t !== "projectSettings" && t !== "localSettings" && t !== "policySettings") {
      let o = Jle();
      let s = getResolvedOrgDefaultModel();
      if (o?.override_user_selection && s !== null && e !== null && t !== "flagSettings" && !Me.ANTHROPIC_MODEL) {
        let i = parseUserSpecifiedModel(e);
        let a = getCanonicalName(s);
        let l = getCanonicalName(i);
        let c = /\[1m\]$/i.test(i) !== /\[1m\]$/i.test(s);
        if (isModeDependentModelSetting(e) || l !== a || c) {
          return _$u.dim(`
     Your organization's default (${_$u.bold(renderModelSetting(s))}) applies on restart`);
        }
      }
      return "";
    }
    if (t !== "policySettings") {
      let o = Jle();
      let s = getResolvedOrgDefaultModel();
      if (o?.override_user_selection && s !== null && !Me.ANTHROPIC_MODEL) {
        if (e === null) {
          return "";
        }
        let i = parseUserSpecifiedModel(e);
        let a = getCanonicalName(s);
        let l = getCanonicalName(i);
        let c = /\[1m\]$/i.test(i) !== /\[1m\]$/i.test(s);
        if (isModeDependentModelSetting(e) || l !== a || c) {
          return _$u.dim(`
     Your organization's default (${_$u.bold(renderModelSetting(s))}) applies on restart`);
        }
        return "";
      }
    }
    let n = getSettingsForSource(t)?.model;
    if (n === undefined || e === n) {
      return "";
    }
    let r = t === "policySettings" ? "Managed settings" : getRelativeSettingsFilePathForSource(t);
    return _$u.dim(`
     ${r} pins ${_$u.bold(renderModelSetting(n))} \u2014 that applies on restart`);
  }
  function yjl(e) {
    return Sk(e.toLowerCase().trim());
  }
  function ZHo(e) {
    let t = e.toLowerCase();
    return !poe() && !isOpus1mMergeEnabled() && t.includes("opus") && t.includes("[1m]");
  }
  function ejo(e) {
    let t = e.toLowerCase();
    if (!(t.includes("sonnet[1m]") || t.includes("sonnet-4-6[1m]") || t.includes("sonnet-5[1m]"))) {
      return false;
    }
    if (modelHasNative1MContext(parseUserSpecifiedModel(e))) {
      return false;
    }
    return !Rde();
  }
  function JO(e) {
    let t = renderDefaultModelSetting(e ?? getDefaultMainLoopModelSetting());
    return e === null ? `${t} (default)` : t;
  }
  function vsr(e) {
    return parseUserSpecifiedModel(e ?? getDefaultMainLoopModelSetting());
  }
  function tjo(e, t, n, r) {
    let o = getTotalOutputTokens();
    if (o === 0 || o === r) {
      return false;
    }
    return normalizeModelStringForAPI(vsr(e)) !== normalizeModelStringForAPI(vsr(n ?? t));
  }
  function Csr(e, t = n => n) {
    let n = JO(e.mainLoopModel);
    let r = e.effortValue !== undefined ? ` (effort: ${e.effortValue})` : "";
    if (e.mainLoopModelForSession) {
      return `Current model: ${t(JO(e.mainLoopModelForSession))} (session override from plan mode)
Base model: ${n}${r}`;
    }
    return `Current model: ${n}${r}`;
  }
  function njo(e) {
    let t = e ?? getDefaultMainLoopModelSetting();
    if (!isFableFamilyOrPinnedModel(parseUserSpecifiedModel(t))) {
      return false;
    }
    return kfa();
  }
  function FZ(e) {
    if (e === null) {
      return false;
    }
    return isFableFamilyOrPinnedModel(parseUserSpecifiedModel(e)) && w4t();
  }
  var Pwe = __lazy(() => {
    at();
    ln();
    x_t();
    d_();
    dt();
    wQt();
    GT();
    Tk();
    c$n();
    PV();
    Eo();
    YN();
    EQn();
  });
  var _jl;
  var bjl = __lazy(() => {
    _jl = we(() => {
      let e = v.object({
        enable_email: v.boolean().nullish(),
        enable_push: v.boolean().nullish()
      });
      let t = v.object({
        bogosort: e.nullish(),
        code_requires_action: e.nullish()
      });
      let n = v.object({
        has_active_channel: v.boolean(),
        platforms: v.array(v.string()).nullish().transform(r => r ?? []),
        most_recent_token_refresh: v.string().nullish()
      });
      return v.object({
        account_id: v.number().nullish(),
        organization_id: v.number().nullish(),
        preferences: v.object({
          feature_preference: t.nullish()
        }).nullish(),
        push_reachability: n.nullish()
      });
    });
  });
  function Cjl() {
    let e = getInitialSettings();
    let t = getGlobalConfig();
    return {
      agentPushNotifEnabled: e.agentPushNotifEnabled ?? t.agentPushNotifEnabled,
      inputNeededNotifEnabled: e.inputNeededNotifEnabled ?? t.inputNeededNotifEnabled
    };
  }
  function rjo() {
    return isClaudeAISubscriber();
  }
  async function MHm() {
    if (!rjo()) {
      return {
        ok: false,
        reason: "no_auth"
      };
    }
    try {
      let e = await _s.get("/api/claude_code/notification/preferences", {
        timeout: 1e4
      });
      if (!e.ok) {
        return {
          ok: false,
          reason: "fetch_failed"
        };
      }
      let t = _jl().safeParse(e.data);
      if (!t.success) {
        wn("warn", "notif_prefs_fetch_parse_failed", {
          issues: t.error.issues.map(n => n.path.join(".")).join(",")
        });
        return {
          ok: false,
          reason: "parse_failed"
        };
      }
      return {
        ok: true,
        prefs: t.data
      };
    } catch (e) {
      let {
        kind: t
      } = YS(e);
      wn("warn", "notif_prefs_fetch_failed", {
        kind: t
      });
      return {
        ok: false,
        reason: "fetch_failed"
      };
    }
  }
  async function NHm(e) {
    if (!rjo()) {
      return;
    }
    try {
      if (!(await _s.patch("/api/claude_code/notification/preferences", e, {
        timeout: 1e4
      })).ok) {
        Et("notif_prefs_patch", "no_auth");
        return;
      }
      wn("info", "notif_prefs_patch_ok", {});
      Pe("notif_prefs_patch");
    } catch (t) {
      let {
        kind: n
      } = YS(t);
      wn("warn", "notif_prefs_patch_failed", {
        kind: n
      });
      Ae("notif_prefs_patch", "http_error");
    }
  }
  function ojo() {
    let e = Cjl();
    let t = {};
    if (typeof e.agentPushNotifEnabled === "boolean") {
      t.bogosort = {
        enable_push: e.agentPushNotifEnabled
      };
    }
    if (typeof e.inputNeededNotifEnabled === "boolean") {
      t.code_requires_action = {
        enable_push: e.inputNeededNotifEnabled
      };
    }
    if (Object.keys(t).length === 0) {
      return;
    }
    NHm({
      preferences: {
        feature_preference: t
      }
    });
  }
  async function xjl() {
    if (!rjo()) {
      Et("notif_prefs_hydrate", "no_auth");
      xQt.setState(() => null);
      wn("info", "notif_prefs_hydrate_skipped", {
        reason: "no_auth"
      });
      return;
    }
    let e = await MHm();
    if (!e.ok) {
      Ae("notif_prefs_hydrate", e.reason);
      xQt.setState(() => null);
      wn("info", "notif_prefs_hydrate_skipped", {
        reason: e.reason
      });
      return;
    }
    let t = e.prefs;
    let n = t.push_reachability ?? null;
    if (xQt.setState(() => n), n) {
      logEvent("tengu_push_reachability", {
        has_active_channel: n.has_active_channel,
        platform_count: n.platforms.length
      });
    }
    let r = t.preferences?.feature_preference;
    let o = r?.bogosort?.enable_push;
    let s = r?.code_requires_action?.enable_push;
    let i = Cjl();
    let a = {};
    if (i.agentPushNotifEnabled === undefined && typeof o === "boolean") {
      a.agentPushNotifEnabled = o;
    }
    if (i.inputNeededNotifEnabled === undefined && typeof s === "boolean") {
      a.inputNeededNotifEnabled = s;
    }
    if (wn("info", "notif_prefs_hydrate_result", {
      has_active_channel: n?.has_active_channel,
      server_bogosort: o,
      server_code_requires_action: s,
      seeded: Object.keys(a).length > 0
    }), Object.keys(a).length === 0) {
      Pe("notif_prefs_hydrate");
      return;
    }
    updateSettingsForSource("userSettings", a);
    Tjl.emit();
    Pe("notif_prefs_hydrate");
  }
  var xQt;
  var Tjl;
  var Ejl;
  var vjl;
  var wjl;
  var kQt = __lazy(() => {
    tre();
    no();
    Zm();
    dt();
    ph();
    ln();
    Ot();
    bg();
    bjl();
    xQt = dO(undefined);
    Tjl = Si();
    Ejl = xQt.getState;
    vjl = xQt.subscribe;
    wjl = Tjl.subscribe;
  });
  function ijo(e) {
    switch (e) {
      case "terminal_bell":
        return "bell";
      case "iterm2_with_bell":
        return "iterm2+bell";
      case "notifications_disabled":
        return "none";
      default:
        return e;
    }
  }
  function kjl(e) {
    let t = sjo.c(43);
    let {
      channel: n,
      showInputNeededRow: r,
      showDoneRow: o,
      inputNeededEnabled: s,
      doneEnabled: i,
      onCycleChannel: a,
      onToggleInputNeeded: l,
      onToggleDone: c,
      onClose: u
    } = e;
    let [d, p] = Evt.useState(0);
    let m = Evt.useRef(null);
    MI(m, true);
    let f;
    if (t[0] !== n) {
      f = ijo(n);
      t[0] = n;
      t[1] = f;
    } else {
      f = t[1];
    }
    let h = `\u2039 ${f} \u203A`;
    let g;
    if (t[2] !== a || t[3] !== h) {
      g = {
        id: "channel",
        label: "Channel",
        value: h,
        activate: a
      };
      t[2] = a;
      t[3] = h;
      t[4] = g;
    } else {
      g = t[4];
    }
    let y;
    if (t[5] !== s || t[6] !== l || t[7] !== r) {
      y = r ? [{
        id: "inputNeeded",
        label: "Notify when Claude needs you",
        value: String(s),
        activate: l
      }] : [];
      t[5] = s;
      t[6] = l;
      t[7] = r;
      t[8] = y;
    } else {
      y = t[8];
    }
    let _;
    if (t[9] !== i || t[10] !== c || t[11] !== o) {
      _ = o ? [{
        id: "done",
        label: "Notify when Claude is done",
        value: String(i),
        activate: c
      }] : [];
      t[9] = i;
      t[10] = c;
      t[11] = o;
      t[12] = _;
    } else {
      _ = t[12];
    }
    let b;
    if (t[13] !== g || t[14] !== y || t[15] !== _) {
      b = [g, ...y, ..._];
      t[13] = g;
      t[14] = y;
      t[15] = _;
      t[16] = b;
    } else {
      b = t[16];
    }
    let S = b;
    let E;
    if (t[17] !== d || t[18] !== S) {
      E = function () {
        S[d]?.activate();
      };
      t[17] = d;
      t[18] = S;
      t[19] = E;
    } else {
      E = t[19];
    }
    let C = E;
    let x;
    if (t[20] === Symbol.for("react.memo_cache_sentinel")) {
      x = () => p(LHm);
      t[20] = x;
    } else {
      x = t[20];
    }
    let A;
    if (t[21] !== S.length) {
      A = () => p(N => Math.min(S.length - 1, N + 1));
      t[21] = S.length;
      t[22] = A;
    } else {
      A = t[22];
    }
    let k;
    if (t[23] !== C || t[24] !== A) {
      k = {
        "select:previous": x,
        "select:next": A,
        "select:accept": C
      };
      t[23] = C;
      t[24] = A;
      t[25] = k;
    } else {
      k = t[25];
    }
    let I;
    if (t[26] === Symbol.for("react.memo_cache_sentinel")) {
      I = {
        context: "Select",
        isActive: true
      };
      t[26] = I;
    } else {
      I = t[26];
    }
    jo(k, I);
    let O;
    if (t[27] !== C) {
      O = function (W) {
        if (W.key === " ") {
          W.preventDefault();
          C();
        }
      };
      t[27] = C;
      t[28] = O;
    } else {
      O = t[28];
    }
    let M = O;
    let L;
    if (t[29] === Symbol.for("react.memo_cache_sentinel")) {
      L = $3.jsxs(Hn, {
        children: [$3.jsx(xt, {
          chord: ["up", "down"],
          action: "navigate"
        }), $3.jsx(xt, {
          chord: "enter",
          action: "change"
        }), $3.jsx(Wr, {
          action: "confirm:no",
          context: "Confirmation",
          fallback: "Esc",
          description: "close"
        })]
      });
      t[29] = L;
    } else {
      L = t[29];
    }
    let P;
    if (t[30] !== d || t[31] !== S) {
      P = S.map((N, W) => {
        let j = W === d;
        return $3.jsxs(gXd, {
          children: [$3.jsx(gXd, {
            width: 34,
            flexShrink: 0,
            marginRight: 1,
            children: $3.jsxs(Text, {
              color: j ? "suggestion" : undefined,
              wrap: "truncate-end",
              children: [j ? vGd.pointer : " ", " ", N.label]
            })
          }), $3.jsx(Text, {
            color: j ? "suggestion" : undefined,
            wrap: "truncate-end",
            children: N.value
          })]
        }, N.id);
      });
      t[30] = d;
      t[31] = S;
      t[32] = P;
    } else {
      P = t[32];
    }
    let F;
    if (t[33] !== o || t[34] !== r) {
      F = (r || o) && $3.jsx(Rsr, {});
      t[33] = o;
      t[34] = r;
      t[35] = F;
    } else {
      F = t[35];
    }
    let H;
    if (t[36] !== M || t[37] !== P || t[38] !== F) {
      H = $3.jsxs(gXd, {
        flexDirection: "column",
        ref: m,
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: M,
        children: [P, F]
      });
      t[36] = M;
      t[37] = P;
      t[38] = F;
      t[39] = H;
    } else {
      H = t[39];
    }
    let U;
    if (t[40] !== u || t[41] !== H) {
      U = $3.jsx(or, {
        title: "Notifications",
        onCancel: u,
        hideBorder: true,
        inputGuide: L,
        children: H
      });
      t[40] = u;
      t[41] = H;
      t[42] = U;
    } else {
      U = t[42];
    }
    return U;
  }
  function LHm(e) {
    return Math.max(0, e - 1);
  }
  function Rsr() {
    let e = sjo.c(1);
    if (Evt.useSyncExternalStore(vjl, Ejl, FHm)?.has_active_channel !== false) {
      return null;
    }
    let n;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      n = $3.jsxs(Text, {
        color: "warning",
        wrap: "truncate-end",
        children: ["  ", "\u26A0", " No mobile registered \xB7", " ", $3.jsx(Link, {
          url: "https://claude.com/download#mobile",
          children: "get the app"
        }), " and turn on notif"]
      });
      e[0] = n;
    } else {
      n = e[0];
    }
    return n;
  }
  function FHm() {}
  var sjo;
  var Evt;
  var $3;
  var eYe;
  var ajo = __lazy(() => {
    wl();
    _ue();
    Oue();
    et();
    Bs();
    kQt();
    Sd();
    Ai();
    Ii();
    bs();
    sjo = __toESM(pt(), 1);
    Evt = __toESM(ot(), 1);
    $3 = __toESM(ie(), 1);
    eYe = ["auto", "iterm2", "terminal_bell", "iterm2_with_bell", "kitty", "ghostty", "notifications_disabled"];
  });
  function YFe() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_maple_sundial", false);
  }
  var xsr = __lazy(() => {
    $n();
  });
  function vvt(e, t) {
    return YFe() ? t : e;
  }
  function wvt() {
    let e = getGlobalConfig();
    let t = getInitialSettings();
    return {
      ...e,
      theme: t.theme ?? e.theme,
      editorMode: t.editorMode ?? e.editorMode,
      verbose: t.verbose ?? e.verbose,
      preferredNotifChannel: t.preferredNotifChannel ?? e.preferredNotifChannel,
      autoCompactEnabled: t.autoCompactEnabled ?? e.autoCompactEnabled,
      autoScrollEnabled: t.autoScrollEnabled ?? e.autoScrollEnabled,
      fileCheckpointingEnabled: t.fileCheckpointingEnabled ?? e.fileCheckpointingEnabled,
      showTurnDuration: t.showTurnDuration ?? e.showTurnDuration,
      showMessageTimestamps: t.showMessageTimestamps ?? e.showMessageTimestamps,
      terminalProgressBarEnabled: t.terminalProgressBarEnabled ?? e.terminalProgressBarEnabled,
      todoFeatureEnabled: t.todoFeatureEnabled ?? e.todoFeatureEnabled,
      teammateMode: t.teammateMode ?? e.teammateMode,
      remoteControlAtStartup: t.remoteControlAtStartup ?? e.remoteControlAtStartup,
      autoUploadSessions: t.autoUploadSessions ?? e.autoUploadSessions,
      inputNeededNotifEnabled: t.inputNeededNotifEnabled ?? e.inputNeededNotifEnabled,
      agentPushNotifEnabled: t.agentPushNotifEnabled ?? e.agentPushNotifEnabled
    };
  }
  function Ajl() {
    let e = isFableAvailable();
    return ["default", ...u_e.filter(t => (e || !t.includes("fable")) && !ZHo(t) && !ejo(t) && isModelAllowed(t))];
  }
  function BHm(e) {
    let t = e.trim();
    if (!t || t.toLowerCase() === "default") {
      return "default";
    }
    if (t.length <= 3) {
      let n = t.toLowerCase();
      let r = UHm.get(n) ?? n;
      try {
        let o = rms().of(r);
        if (o && o !== r) {
          return o;
        }
      } catch {}
    }
    return t.split(/\s+/).map(n => n.charAt(0).toUpperCase() + n.slice(1).toLowerCase()).join(" ");
  }
  function ksr(e) {
    if (e === undefined) {
      return modelDisplayString(rJt());
    }
    if (e === null) {
      return "Default (leader's model)";
    }
    return modelDisplayString(e);
  }
  function Cvt(e) {
    let {
      globalConfig: t,
      settingsData: n,
      themeSetting: r,
      currentOutputStyle: o,
      currentLanguage: s,
      externalIncludesApproved: i,
      thinkingEnabled: a,
      verbose: l,
      mainLoopModel: c,
      isFastMode: u,
      promptSuggestionEnabled: d,
      awaySummaryEnabled: p,
      showAutoInDefaultModePicker: m,
      showDefaultViewPicker: f,
      pushTogglesVisible: h,
      isConnectedToIde: g,
      isFileCheckpointingAvailable: y,
      workflowsToggleable: _,
      artifactToggleable: b,
      shouldShowExternalIncludesToggle: S,
      autoUpdaterDisabledReason: E,
      setAppState: C,
      setTheme: x,
      setGlobalConfig: A,
      setSettingsData: k,
      setChanges: I
    } = e;
    function O(U) {
      logEvent("tengu_config_model_changed", {
        from_model: c,
        to_model: U
      });
      let W = FZ(U);
      let j = W ? undefined : updateSettingsForSource("userSettings", {
        model: U ?? undefined
      });
      if (clearRefusalFallbackModelLatch(), C(z => ({
        ...z,
        mainLoopModel: U,
        mainLoopModelForSession: null
      })), I(z => {
        let V = modelDisplayString(U) + (KFe(U, false, isOpus1mMergeEnabled()) ? " \xB7 Draws from usage credits" : "") + (W ? " \xB7 this session only \u2014 /model to set up" : "");
        if ("model" in z) {
          let {
            model: K,
            ...J
          } = z;
          return {
            ...J,
            model: V
          };
        }
        return {
          ...z,
          model: V
        };
      }), j?.error) {
        return {
          error: j.error
        };
      }
    }
    function M(U) {
      Mk("verbose", U);
      A(N => ({
        ...N,
        verbose: U
      }));
      C(N => ({
        ...N,
        verbose: U
      }));
      I(N => {
        if ("verbose" in N) {
          let {
            verbose: W,
            ...j
          } = N;
          return j;
        }
        return {
          ...N,
          verbose: U
        };
      });
    }
    function L(U) {
      Mk("preferredNotifChannel", U);
      A(N => ({
        ...N,
        preferredNotifChannel: U
      }));
    }
    function P(U) {
      Mk("inputNeededNotifEnabled", U);
      A(N => ({
        ...N,
        inputNeededNotifEnabled: U
      }));
      ojo();
      logEvent("tengu_push_notif_pref_changed", {
        key: "inputNeededNotifEnabled",
        value: String(U)
      });
    }
    function F(U) {
      Mk("agentPushNotifEnabled", U);
      A(N => ({
        ...N,
        agentPushNotifEnabled: U
      }));
      ojo();
      logEvent("tengu_push_notif_pref_changed", {
        key: "agentPushNotifEnabled",
        value: String(U)
      });
    }
    return {
      settings: [{
        id: "autoCompact",
        label: "Auto-compact",
        value: t.autoCompactEnabled,
        type: "boolean",
        onChange(U) {
          Mk("autoCompactEnabled", U);
          A(N => ({
            ...N,
            autoCompactEnabled: U
          }));
          logEvent("tengu_auto_compact_setting_changed", {
            enabled: U
          });
        }
      }, ...(T$n() ? [{
        id: "switchModelsOnFlag",
        label: "Switch models when a message is flagged",
        value: n?.switchModelsOnFlag ?? true,
        type: "boolean",
        onChange(U) {
          updateSettingsForSource("userSettings", {
            switchModelsOnFlag: U
          });
          k(N => ({
            ...N,
            switchModelsOnFlag: U
          }));
          logEvent("tengu_refusal_fallback_setting_changed", {
            enabled: U
          });
        }
      }] : []), {
        id: "tips",
        label: "Show tips",
        value: n?.spinnerTipsEnabled ?? true,
        type: "boolean",
        onChange(U) {
          updateSettingsForSource("localSettings", {
            spinnerTipsEnabled: U
          });
          k(N => ({
            ...N,
            spinnerTipsEnabled: U
          }));
          logEvent("tengu_tips_setting_changed", {
            enabled: U
          });
        }
      }, {
        id: "reduceMotion",
        label: "Reduce motion",
        value: n?.prefersReducedMotion ?? false,
        type: "boolean",
        onChange(U) {
          updateSettingsForSource("localSettings", {
            prefersReducedMotion: U
          });
          k(N => ({
            ...N,
            prefersReducedMotion: U
          }));
          C(N => ({
            ...N,
            settings: {
              ...N.settings,
              prefersReducedMotion: U
            }
          }));
          logEvent("tengu_reduce_motion_setting_changed", {
            enabled: U
          });
        }
      }, {
        id: "thinking",
        label: "Thinking mode",
        value: a ?? true,
        type: "boolean",
        onChange(U) {
          C(N => ({
            ...N,
            thinkingEnabled: U
          }));
          updateSettingsForSource("userSettings", {
            alwaysThinkingEnabled: U ? undefined : false
          });
          logEvent("tengu_thinking_toggled", {
            enabled: U
          });
          Pe("thinking_toggle");
        }
      }, ...(lc() && zA() ? [{
        id: "fast",
        label: `Fast mode (${vW()})`,
        value: !!u,
        type: "boolean",
        onChange(U) {
          if (u0e(), updateSettingsForSource("userSettings", {
            fastMode: U ? true : undefined
          }), U) {
            let N = !yh(c);
            C(W => ({
              ...W,
              ...(N && {
                mainLoopModel: Eqe(),
                mainLoopModelForSession: null
              }),
              fastMode: true
            }));
            I(W => ({
              ...W,
              ...(N && {
                model: Eqe()
              }),
              "Fast mode": "ON"
            }));
          } else {
            C(N => ({
              ...N,
              fastMode: false
            }));
            I(N => ({
              ...N,
              "Fast mode": "OFF"
            }));
          }
        }
      }] : []), ...(getFeatureValue_CACHED_MAY_BE_STALE("tengu_chomp_inflection", false) ? [{
        id: "promptSuggestionEnabled",
        label: "Prompt suggestions",
        value: d,
        type: "boolean",
        onChange(U) {
          C(N => ({
            ...N,
            promptSuggestionEnabled: U
          }));
          updateSettingsForSource("userSettings", {
            promptSuggestionEnabled: U ? undefined : false
          });
        }
      }] : []), ...(getFeatureValue_CACHED_MAY_BE_STALE("tengu_sedge_lantern", true) ? [{
        id: "recap",
        label: "Session recap",
        value: p,
        type: "boolean",
        onChange(U) {
          C(N => ({
            ...N,
            awaySummaryEnabled: U
          }));
          updateSettingsForSource("userSettings", {
            awaySummaryEnabled: U ? undefined : false
          });
          k(N => ({
            ...N,
            awaySummaryEnabled: U ? undefined : false
          }));
        }
      }] : []), ...(y ? [{
        id: "checkpoints",
        label: "Rewind code (checkpoints)",
        value: t.fileCheckpointingEnabled,
        type: "boolean",
        onChange(U) {
          Mk("fileCheckpointingEnabled", U);
          A(N => ({
            ...N,
            fileCheckpointingEnabled: U
          }));
          logEvent("tengu_file_history_snapshots_setting_changed", {
            enabled: U
          });
        }
      }] : []), ...(_ ? [{
        id: "workflows",
        label: "Dynamic workflows",
        value: n?.disableWorkflows === true ? false : n?.enableWorkflows ?? uQr(),
        type: "boolean",
        onChange(U) {
          let N = U === uQr() ? undefined : U;
          updateSettingsForSource("userSettings", {
            enableWorkflows: N,
            disableWorkflows: undefined
          });
          k(W => ({
            ...W,
            enableWorkflows: N,
            disableWorkflows: undefined
          }));
          I(W => ({
            ...W,
            workflows: U ? "on" : "off"
          }));
        }
      }, {
        id: "workflowKeywordTriggerEnabled",
        label: "Ultracode keyword trigger",
        value: n?.workflowKeywordTriggerEnabled ?? true,
        type: "boolean",
        onChange(U) {
          let N = U ? undefined : false;
          updateSettingsForSource("userSettings", {
            workflowKeywordTriggerEnabled: N
          });
          k(W => ({
            ...W,
            workflowKeywordTriggerEnabled: N
          }));
          I(W => ({
            ...W,
            ultracodeKeywordTrigger: U ? "on" : "off"
          }));
        }
      }] : []), ...(b ? [{
        id: "artifacts",
        label: "Artifacts",
        value: n?.disableArtifact === true ? false : getEnableArtifactPref() ?? getArtifactDefaultOn(),
        type: "boolean",
        onChange(U) {
          let N = U === getArtifactDefaultOn() ? undefined : U;
          updateSettingsForSource("userSettings", {
            enableArtifact: N,
            disableArtifact: undefined
          });
          k(W => ({
            ...W,
            enableArtifact: N,
            disableArtifact: undefined
          }));
          I(W => ({
            ...W,
            artifacts: U ? "on" : "off"
          }));
        }
      }] : []), {
        id: "verbose",
        label: vvt("Verbose output", "Verbose"),
        value: l,
        type: "boolean",
        onChange: M
      }, {
        id: "progressBar",
        label: "Terminal progress bar",
        value: t.terminalProgressBarEnabled,
        type: "boolean",
        onChange(U) {
          Mk("terminalProgressBarEnabled", U);
          A(N => ({
            ...N,
            terminalProgressBarEnabled: U
          }));
          logEvent("tengu_terminal_progress_bar_setting_changed", {
            enabled: U
          });
        }
      }, ...(getFeatureValue_CACHED_MAY_BE_STALE("tengu_terminal_sidebar", false) ? [{
        id: "showStatusInTerminalTab",
        label: "Show status in terminal tab",
        value: t.showStatusInTerminalTab ?? false,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            showStatusInTerminalTab: U
          }));
          A(N => ({
            ...N,
            showStatusInTerminalTab: U
          }));
          logEvent("tengu_terminal_tab_status_setting_changed", {
            enabled: U
          });
        }
      }] : []), {
        id: "turnDuration",
        label: "Show turn duration",
        value: t.showTurnDuration,
        type: "boolean",
        onChange(U) {
          Mk("showTurnDuration", U);
          A(N => ({
            ...N,
            showTurnDuration: U
          }));
          logEvent("tengu_show_turn_duration_setting_changed", {
            enabled: U
          });
        }
      }, ...(getFeatureValue_CACHED_MAY_BE_STALE("tengu_sepia_moth", false) ? [{
        id: "precomputeCompactionEnabled",
        label: "Precompute compaction",
        value: n?.precomputeCompactionEnabled ?? true,
        type: "boolean",
        onChange(U) {
          updateSettingsForSource("userSettings", {
            precomputeCompactionEnabled: U
          });
          k(N => ({
            ...N,
            precomputeCompactionEnabled: U
          }));
          logEvent("tengu_precompute_compaction_setting_changed", {
            enabled: U
          });
        }
      }] : []), ...(getFeatureValue_CACHED_MAY_BE_STALE("tengu_silk_hinge", false) ? [{
        id: "timestamps",
        label: "Show message timestamps",
        value: t.showMessageTimestamps,
        type: "boolean",
        onChange(U) {
          Mk("showMessageTimestamps", U);
          A(N => ({
            ...N,
            showMessageTimestamps: U
          }));
          C(N => ({
            ...N,
            showMessageTimestamps: U
          }));
          logEvent("tengu_show_message_timestamps_setting_changed", {
            enabled: U
          });
        }
      }] : []), {
        id: "permissionMode",
        label: "Default permission mode",
        value: n?.permissions?.defaultMode || "default",
        options: (() => {
          let U = ["default", "plan"];
          let N = INTERNAL_PERMISSION_MODES;
          let W = ["bypassPermissions"];
          if (!m) {
            W.push("auto");
          }
          return [...U, ...N.filter(j => !U.includes(j) && !W.includes(j))];
        })(),
        type: "enum",
        onChange(U) {
          let N = uF(U);
          let W = Mnt(N) ? qA(N) : N;
          let j = updateSettingsForSource("userSettings", {
            permissions: {
              ...getSettingsForSource("userSettings")?.permissions,
              defaultMode: W
            }
          });
          if (j.error) {
            logForDebugging(`Failed to update default permission mode setting: ${j.error.message}`, {
              level: "error"
            });
            return {
              error: j.error
            };
          }
          k(z => ({
            ...z,
            permissions: {
              ...z?.permissions,
              defaultMode: W
            }
          }));
          I(z => ({
            ...z,
            permissionMode: U
          }));
        }
      }, {
        id: "worktreeBaseRef",
        label: "Worktree base ref",
        value: n?.worktree?.baseRef ?? "fresh",
        options: ["fresh", "head"],
        type: "enum",
        onChange(U) {
          let N = U;
          let W = updateSettingsForSource("userSettings", {
            worktree: {
              ...getSettingsForSource("userSettings")?.worktree,
              baseRef: N
            }
          });
          if (W.error) {
            logForDebugging(`Failed to update worktree.baseRef in user settings: ${W.error.message}`, {
              level: "error"
            });
            return {
              error: W.error
            };
          }
          k(j => ({
            ...j,
            worktree: {
              ...j?.worktree,
              baseRef: N
            }
          }));
          I(j => ({
            ...j,
            worktreeBaseRef: N
          }));
        }
      }, ...(m ? [{
        id: "useAutoModeDuringPlan",
        label: "Use auto mode during plan",
        value: n?.useAutoModeDuringPlan ?? true,
        type: "boolean",
        onChange(U) {
          updateSettingsForSource("userSettings", {
            useAutoModeDuringPlan: U
          });
          k(N => ({
            ...N,
            useAutoModeDuringPlan: U
          }));
          C(N => {
            let W = transitionPlanAutoMode(N.toolPermissionContext);
            if (W === N.toolPermissionContext) {
              return N;
            }
            return {
              ...N,
              toolPermissionContext: W
            };
          });
          I(N => ({
            ...N,
            "Use auto mode during plan": U
          }));
        }
      }] : []), {
        id: "gitignore",
        label: "Respect .gitignore in file picker",
        value: t.respectGitignore,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            respectGitignore: U
          }));
          A(N => ({
            ...N,
            respectGitignore: U
          }));
          logEvent("tengu_respect_gitignore_setting_changed", {
            enabled: U
          });
        }
      }, {
        id: "copyFullResponse",
        label: "Skip the /copy picker",
        value: t.copyFullResponse,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            copyFullResponse: U
          }));
          A(N => ({
            ...N,
            copyFullResponse: U
          }));
        }
      }, ...(qs() ? [{
        id: "copyOnSelect",
        label: "Copy on select",
        value: t.copyOnSelect ?? true,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            copyOnSelect: U
          }));
          A(N => ({
            ...N,
            copyOnSelect: U
          }));
        }
      }, {
        id: "autoScroll",
        label: vvt("Auto-scroll", "Auto-scroll output"),
        value: t.autoScrollEnabled,
        type: "boolean",
        onChange(U) {
          Mk("autoScrollEnabled", U);
          A(N => ({
            ...N,
            autoScrollEnabled: U
          }));
        }
      }] : []), ...(YFe() ? isAgentsFleetEnabled() || hFe() ? [{
        id: "agentsView",
        label: "Agents view",
        value: hFe() && (t.leftArrowOpensAgents ?? true) || isAgentsFleetEnabled() && (t.defaultToAgentsView ?? false) ? "on" : "off",
        type: "managedEnum",
        onChange() {}
      }] : [] : [...(isAgentsFleetEnabled() ? [{
        id: "defaultToAgentsView",
        label: "Open agents view by default",
        value: t.defaultToAgentsView ?? false,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            defaultToAgentsView: U
          }));
          A(N => ({
            ...N,
            defaultToAgentsView: U
          }));
        }
      }] : []), ...(hFe() ? [{
        id: "leftArrowOpensAgents",
        label: `${"\u2190"} opens agents`,
        value: t.leftArrowOpensAgents ?? true,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            leftArrowOpensAgents: U
          }));
          A(N => ({
            ...N,
            leftArrowOpensAgents: U
          }));
        }
      }] : [])]), E ? {
        id: "autoUpdatesChannel",
        label: "Auto-update channel",
        value: "disabled",
        type: "managedEnum",
        onChange() {}
      } : {
        id: "autoUpdatesChannel",
        label: "Auto-update channel",
        value: n?.autoUpdatesChannel === "rc" ? "slow" : n?.autoUpdatesChannel ?? "latest",
        type: "managedEnum",
        onChange() {}
      }, {
        id: "theme",
        label: "Theme",
        value: Pc("themes") && tG(r) ? `${r} (disabled in safe mode)` : r,
        type: "managedEnum",
        options: EMt,
        optionsHint: "For custom themes, use /theme.",
        onChange: x
      }, ...(YFe() ? [{
        id: "notifChannel",
        label: "Notifications",
        value: ijo(t.preferredNotifChannel),
        type: "managedEnum",
        options: [...eYe],
        onChange: L
      }] : [{
        id: "notifChannel",
        label: "Local notifications",
        value: t.preferredNotifChannel,
        options: [...eYe],
        type: "enum",
        onChange: L
      }, ...(h ? [...(I2n() ? [{
        id: "inputNeededNotifEnabled",
        label: "Push when actions required",
        value: t.inputNeededNotifEnabled ?? false,
        type: "boolean",
        onChange: P
      }] : []), {
        id: "agentPushNotifEnabled",
        label: "Push when Claude decides",
        value: t.agentPushNotifEnabled ?? false,
        type: "boolean",
        onChange: F
      }] : [])]), {
        id: "outputStyle",
        label: "Output style",
        value: Pc("outputStyles") && !Object.hasOwn(GX, o) ? `${o} (disabled in safe mode)` : o,
        type: "managedEnum",
        options: Object.keys(GX),
        optionsHint: "For custom styles, open /config.",
        onChange(U) {
          let N = updateSettingsForSource("localSettings", {
            outputStyle: U
          });
          if (k(W => ({
            ...W,
            outputStyle: U
          })), N?.error) {
            return {
              error: N.error
            };
          }
        }
      }, ...(f ? [{
        id: "defaultView",
        label: "Default view",
        value: n?.defaultView === undefined ? "default" : String(n.defaultView),
        options: ["transcript", "chat", "default"],
        type: "enum",
        onChange(U) {
          let N = U === "default" ? undefined : U;
          updateSettingsForSource("localSettings", {
            defaultView: N
          });
          k(j => ({
            ...j,
            defaultView: N
          }));
          let W = N === "chat";
          C(j => {
            if (j.isBriefOnly === W) {
              return j;
            }
            return {
              ...j,
              isBriefOnly: W
            };
          });
          setUserMsgOptIn(W);
          I(j => ({
            ...j,
            "Default view": U
          }));
          logEvent("tengu_default_view_setting_changed", {
            value: N ?? "unset"
          });
        }
      }] : []), {
        id: "language",
        label: "Language",
        value: s ?? "Default (English)",
        type: "managedEnum",
        coerce: BHm,
        optionsHint: "Any language name or ISO code (e.g. 'ja'); use 'default' for English.",
        onChange(U) {
          let N = U.toLowerCase() === "default" ? undefined : U;
          let W = updateSettingsForSource("userSettings", {
            language: N
          });
          if (k(j => ({
            ...j,
            language: N
          })), W?.error) {
            return {
              error: W.error
            };
          }
        }
      }, {
        id: "editor",
        label: "Editor mode",
        value: t.editorMode === "emacs" ? "normal" : t.editorMode || "normal",
        options: ["normal", "vim"],
        type: "enum",
        onChange(U) {
          Mk("editorMode", U);
          A(N => ({
            ...N,
            editorMode: U
          }));
          logEvent("tengu_editor_mode_changed", {
            mode: U,
            source: "config_panel"
          });
        }
      }, {
        id: "externalEditorContext",
        label: vvt("Show last response in external editor", "Show responses in IDE"),
        value: t.externalEditorContext ?? false,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            externalEditorContext: U
          }));
          A(N => ({
            ...N,
            externalEditorContext: U
          }));
          logEvent("tengu_external_editor_context_changed", {
            enabled: U
          });
        }
      }, {
        id: "prStatus",
        label: vvt("Show PR status footer", "Show PR status"),
        value: t.prStatusFooterEnabled ?? true,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => {
            if (N.prStatusFooterEnabled === U) {
              return N;
            }
            return {
              ...N,
              prStatusFooterEnabled: U
            };
          });
          A(N => ({
            ...N,
            prStatusFooterEnabled: U
          }));
          logEvent("tengu_pr_status_footer_setting_changed", {
            enabled: U
          });
        }
      }, {
        id: "model",
        label: "Model",
        value: c === null ? "Default (recommended)" : c,
        type: "managedEnum",
        options: Ajl(),
        optionsHint: "For a specific model ID, use /model.",
        onChange(U) {
          let N = U === "default" ? null : U;
          if (FZ(N)) {
            Et("model_fable_consent", "config_shorthand_blocked");
            return {
              error: Error("needs usage-credits consent \u2014 run /model first")
            };
          }
          return O(N);
        }
      }, ...(g ? [{
        id: "diffTool",
        label: "Diff tool",
        value: t.diffTool ?? "auto",
        options: ["terminal", "auto"],
        type: "enum",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            diffTool: U
          }));
          A(N => ({
            ...N,
            diffTool: U
          }));
          logEvent("tengu_diff_tool_changed", {
            tool: U,
            source: "config_panel"
          });
        }
      }] : []), ...(!M$() ? [{
        id: "autoConnectIde",
        label: "Auto-connect to IDE (external terminal)",
        value: t.autoConnectIde ?? false,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            autoConnectIde: U
          }));
          A(N => ({
            ...N,
            autoConnectIde: U
          }));
          logEvent("tengu_auto_connect_ide_changed", {
            enabled: U,
            source: "config_panel"
          });
        }
      }] : []), ...(M$() ? [{
        id: "autoInstallIdeExtension",
        label: "Auto-install IDE extension",
        value: t.autoInstallIdeExtension ?? true,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            autoInstallIdeExtension: U
          }));
          A(N => ({
            ...N,
            autoInstallIdeExtension: U
          }));
          logEvent("tengu_auto_install_ide_extension_changed", {
            enabled: U,
            source: "config_panel"
          });
        }
      }] : []), {
        id: "chrome",
        label: vvt("Claude in Chrome enabled by default", "Claude in Chrome"),
        value: t.claudeInChromeDefaultEnabled ?? false,
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => ({
            ...N,
            claudeInChromeDefaultEnabled: U
          }));
          A(N => ({
            ...N,
            claudeInChromeDefaultEnabled: U
          }));
          logEvent("tengu_claude_in_chrome_setting_changed", {
            enabled: U
          });
        }
      }, ...(isAgentSwarmsEnabled() ? (() => {
        let U = getCliTeammateModeOverride();
        return [{
          id: "teammateMode",
          label: U ? `Teammate mode [overridden: ${U}]` : "Teammate mode",
          value: t.teammateMode ?? "in-process",
          options: ["auto", "tmux", "iterm2", "in-process"],
          type: "enum",
          onChange(W) {
            if (W !== "auto" && W !== "tmux" && W !== "iterm2" && W !== "in-process") {
              return;
            }
            clearCliTeammateModeOverride(W);
            resetBackendDetection();
            Mk("teammateMode", W);
            A(j => ({
              ...j,
              teammateMode: W
            }));
            logEvent("tengu_teammate_mode_changed", {
              mode: W
            });
          }
        }, {
          id: "teammateDefaultModel",
          label: "Default teammate model",
          value: ksr(t.teammateDefaultModel),
          type: "managedEnum",
          options: Ajl(),
          optionsHint: "For a specific model ID, open /config.",
          onChange(W) {
            let j = W === "default" ? null : W;
            if (FZ(j)) {
              Et("model_fable_consent", "config_teammate_blocked");
              return {
                error: Error("needs usage-credits consent \u2014 run /model first")
              };
            }
            saveGlobalConfig(z => z.teammateDefaultModel === j ? z : {
              ...z,
              teammateDefaultModel: j
            });
            A(z => ({
              ...z,
              teammateDefaultModel: j
            }));
          }
        }];
      })() : []), ...(isBridgeEnabled() ? [{
        id: "remoteControl",
        label: "Enable Remote Control for all sessions",
        value: t.remoteControlAtStartup === undefined ? "default" : String(t.remoteControlAtStartup),
        options: ["true", "false", "default"],
        type: "enum",
        onChange(U) {
          if (U === "default") {
            Mk("remoteControlAtStartup", undefined);
            saveGlobalConfig(W => {
              if (W.remoteControlAtStartup === undefined) {
                return W;
              }
              let j = {
                ...W
              };
              delete j.remoteControlAtStartup;
              return j;
            });
            A(W => ({
              ...W,
              remoteControlAtStartup: undefined
            }));
          } else {
            let W = U === "true";
            Mk("remoteControlAtStartup", W);
            A(j => ({
              ...j,
              remoteControlAtStartup: W
            }));
          }
          let N = getRemoteControlAtStartup();
          C(W => applyRemoteControlToAppState(W, N));
        }
      }] : []), ...[], ...(isBridgeEnabled(), []), ...[], ...(S ? [{
        id: "showExternalIncludesDialog",
        label: vvt("External CLAUDE.md includes", "External CLAUDE.md files"),
        value: i ? "true" : "false",
        type: "managedEnum",
        onChange() {}
      }] : []), ...(process.env.ANTHROPIC_API_KEY && !cC() ? [{
        id: "apiKey",
        consentGated: true,
        label: cjo.createElement(Text, null, "Use custom API key: ", cjo.createElement(Text, {
          bold: true
        }, a2(process.env.ANTHROPIC_API_KEY))),
        searchText: "Use custom API key",
        value: Boolean(process.env.ANTHROPIC_API_KEY && t.customApiKeyResponses?.approved?.includes(a2(process.env.ANTHROPIC_API_KEY))),
        type: "boolean",
        onChange(U) {
          saveGlobalConfig(N => {
            let W = {
              ...N
            };
            if (!W.customApiKeyResponses) {
              W.customApiKeyResponses = {
                approved: [],
                rejected: []
              };
            }
            if (!W.customApiKeyResponses.approved) {
              W.customApiKeyResponses = {
                ...W.customApiKeyResponses,
                approved: []
              };
            }
            if (!W.customApiKeyResponses.rejected) {
              W.customApiKeyResponses = {
                ...W.customApiKeyResponses,
                rejected: []
              };
            }
            if (process.env.ANTHROPIC_API_KEY) {
              let j = a2(process.env.ANTHROPIC_API_KEY);
              if (U) {
                W.customApiKeyResponses = {
                  ...W.customApiKeyResponses,
                  approved: [...(W.customApiKeyResponses.approved ?? []).filter(z => z !== j), j],
                  rejected: (W.customApiKeyResponses.rejected ?? []).filter(z => z !== j)
                };
              } else {
                W.customApiKeyResponses = {
                  ...W.customApiKeyResponses,
                  approved: (W.customApiKeyResponses.approved ?? []).filter(z => z !== j),
                  rejected: [...(W.customApiKeyResponses.rejected ?? []).filter(z => z !== j), j]
                };
              }
            }
            return W;
          });
          A(wvt());
        }
      }] : [])],
      helpers: {
        onChangeMainModelConfig: O,
        onChangeVerbose: M,
        changeNotifChannel: L,
        changeInputNeededNotif: P,
        changeAgentPushNotif: F
      }
    };
  }
  var cjo;
  var UHm;
  var ljo = () => {};
  var Ijl;
  var ujo = __lazy(() => {
    et();
    Lot();
    zg();
    HT();
    S_();
    je();
    Ot();
    ln();
    Ox();
    Pwe();
    Tk();
    YN();
    Eo();
    wQt();
    wb();
    Qbe();
    vMt();
    PP();
    bT();
    N2();
    M1();
    at();
    LX();
    Kq();
    gn();
    $n();
    uT();
    p7e();
    kQt();
    ajo();
    soe();
    mE();
    YNe();
    Ive();
    IFo();
    GT();
    zp();
    xsr();
    wl();
    cjo = __toESM(ot(), 1);
    UHm = new Map([["jp", "ja"], ["kr", "ko"], ["cn", "zh"], ["tw", "zh-Hant"]]);
    Ijl = {
      setGlobalConfig: ljo,
      setSettingsData: ljo,
      setChanges: ljo
    };
  });
  var Pjl = {};
  __export(Pjl, {
    parseConfigShorthand: () => parseConfigShorthand,
    listConfigKeys: () => listConfigKeys,
    getConfigArgumentCompletions: () => getConfigArgumentCompletions,
    applyConfigShorthand: () => applyConfigShorthand,
    _resetSettableConfigKeysForTesting: () => _resetSettableConfigKeysForTesting
  });
  function parseConfigShorthand(e) {
    let t = e.trim();
    if (!t || !t.includes("=")) {
      return null;
    }
    let n = t.split(/\s+/);
    if (Bn(n, o => o.includes("=")) === 1) {
      let o = t.indexOf("=");
      let s = t.slice(0, o);
      if (!s || /\s/.test(s)) {
        return null;
      }
      return [{
        key: s,
        raw: t.slice(o + 1)
      }];
    }
    let r = [];
    for (let o of n) {
      let s = o.indexOf("=");
      if (s <= 0) {
        return null;
      }
      r.push({
        key: o.slice(0, s),
        raw: o.slice(s + 1)
      });
    }
    return r;
  }
  function $Hm(e, t) {
    let n = e.toLowerCase();
    return t.find(r => r.id.toLowerCase() === n);
  }
  function applyConfigShorthand(e, t, n) {
    let {
      settings: r
    } = Cvt(pjo(t, n));
    return e.map(({
      key: o,
      raw: s
    }) => jHm(o, s, r));
  }
  function jHm(e, t, n) {
    let r = $Hm(e, n);
    if (logEvent("tengu_config_shorthand", {
      key_hash: i3i.createHash("sha256").update(e).digest("hex").slice(0, 12),
      matched: r !== undefined
    }), !r) {
      return {
        ok: false,
        message: `${e} isn't a /config setting. Run /config to see what's available.`
      };
    }
    let o = "searchText" in r ? r.searchText : r.label;
    if (r.consentGated) {
      return {
        ok: false,
        message: `${o} can't be set with key=value \u2014 open /config to change it from the panel.`
      };
    }
    switch (r.type) {
      case "boolean":
        {
          let s = t.toLowerCase();
          let i = ["true", "1", "on", "yes"].includes(s);
          let a = ["false", "0", "off", "no"].includes(s);
          if (!i && !a) {
            return {
              ok: false,
              message: `${o} takes true or false, not "${t}".`
            };
          }
          let l = r.onChange(i);
          if (l?.error) {
            return {
              ok: false,
              message: `Couldn't save ${o}: ${l.error.message}`
            };
          }
          return {
            ok: true,
            message: `Set ${o} to ${i ? "true" : "false"}`
          };
        }
      case "enum":
      case "managedEnum":
        {
          let s = r.type === "managedEnum" ? r.coerce : undefined;
          if (!r.options && !s) {
            return {
              ok: false,
              message: `${o} can't be set with key=value \u2014 use ${HHm.get(r.id) ?? "/config"}.`
            };
          }
          let i = s ? s(t) : r.options?.find(l => l.toLowerCase() === t.toLowerCase());
          if (i === undefined) {
            let l = r.type === "managedEnum" && r.optionsHint ? ` ${r.optionsHint}` : "";
            return {
              ok: false,
              message: r.options ? `${o} takes one of: ${r.options.join(", ")}.${l}` : `${o} doesn't accept "${t}".${l}`
            };
          }
          let a = r.onChange(i);
          if (a?.error) {
            return {
              ok: false,
              message: `Couldn't save ${o}: ${a.error.message}`
            };
          }
          return {
            ok: true,
            message: `Set ${o} to ${i}`
          };
        }
    }
  }
  function listConfigKeys(e) {
    let {
      settings: t
    } = Cvt(pjo(e));
    return t.flatMap(n => {
      if (n.consentGated) {
        return [];
      }
      let r = n.type === "boolean" ? "true|false" : n.options ? n.options.join("|") : n.type === "managedEnum" && n.coerce ? "<value>" : null;
      return r ? [`  ${n.id}=${r}`] : [];
    }).sort().join(`
`);
  }
  function getConfigArgumentCompletions(e, t) {
    let n = WHm();
    let r = t.indexOf("=");
    if (r === -1) {
      let a = t.toLowerCase();
      return n.filter(l => l.id.toLowerCase().startsWith(a)).sort((l, c) => l.id.localeCompare(c.id)).map(l => ({
        value: `${l.id}=`,
        description: l.options?.slice(0, 4).join(" | ") ?? l.hint,
        isFinal: false,
        appendSpace: false
      }));
    }
    let o = t.slice(0, r);
    let s = t.slice(r + 1).toLowerCase();
    let i = n.find(a => a.id.toLowerCase() === o.toLowerCase());
    if (!i?.options) {
      return [];
    }
    return i.options.filter(a => a.toLowerCase().startsWith(s)).map(a => ({
      value: `${i.id}=${a}`,
      isFinal: true
    }));
  }
  function WHm() {
    if (AQt) {
      return AQt;
    }
    let e = {
      getAppState: () => ({
        thinkingEnabled: false,
        verbose: false,
        mainLoopModel: null,
        fastMode: false,
        promptSuggestionEnabled: false,
        awaySummaryEnabled: false
      }),
      setAppState: () => {},
      options: {
        mcpClients: []
      }
    };
    let {
      settings: t
    } = Cvt(pjo(e));
    AQt = t.flatMap(n => {
      if (n.consentGated) {
        return [];
      }
      let r = n.type === "boolean" ? ["true", "false"] : "options" in n && n.options ? n.options : undefined;
      if (r || n.type === "managedEnum" && n.coerce) {
        return [{
          id: n.id,
          options: r,
          hint: n.type === "managedEnum" ? n.optionsHint : undefined
        }];
      }
      return [];
    });
    return AQt;
  }
  function _resetSettableConfigKeysForTesting() {
    AQt = undefined;
  }
  function pjo(e, t) {
    let n = e.getAppState();
    let r = getInitialSettings();
    let o = wvt();
    let s = uc("disableWorkflows", false);
    let i = uc("enableWorkflows", false);
    let a = CDn() && (s.value !== true || s.source === "userSettings") && (i.source === "default" || i.source === "userSettings");
    let l = uc("disableArtifact", false);
    let c = isArtifactConfigurable() && (l.value !== true || l.source === "userSettings") && isEnableArtifactUserControllable();
    let u = (D3(), __toCommonJS(CZ)).isBriefEntitled();
    return {
      globalConfig: o,
      settingsData: r,
      themeSetting: o.theme,
      currentOutputStyle: r?.outputStyle || "default",
      currentLanguage: r?.language,
      externalIncludesApproved: false,
      thinkingEnabled: n.thinkingEnabled,
      verbose: n.verbose,
      mainLoopModel: n.mainLoopModel,
      isFastMode: lc() ? n.fastMode : false,
      promptSuggestionEnabled: n.promptSuggestionEnabled,
      awaySummaryEnabled: n.awaySummaryEnabled,
      showAutoInDefaultModePicker: hasAutoModeOptInAnySource() || getAutoModeEnabledState() === "enabled",
      showDefaultViewPicker: u,
      pushTogglesVisible: _de() && !Vi() && hasStoredOAuthToken(),
      isConnectedToIde: B6e(e.options.mcpClients),
      isFileCheckpointingAvailable: !Me.CLAUDE_CODE_DISABLE_FILE_CHECKPOINTING,
      workflowsToggleable: a,
      artifactToggleable: c,
      shouldShowExternalIncludesToggle: false,
      autoUpdaterDisabledReason: getAutoUpdaterDisabledReason(),
      setAppState: d => e.setAppState(d),
      setTheme: t?.setTheme ?? (d => Mk("theme", d)),
      ...Ijl
    };
  }
  var HHm;
  var AQt;
  var Asr = __lazy(() => {
    ujo();
    Kq();
    Ot();
    M1();
    soe();
    N2();
    no();
    pr();
    dw();
    GT();
    bT();
    S_();
    Wd();
    zg();
    HHm = new Map([["agentsView", "/config (Agents view row)"], ["autoUpdatesChannel", "/channel"], ["showExternalIncludesDialog", "/config (External CLAUDE.md row)"]]);
  });
  function VM(e) {
    let t = DQt.c(46);
    let {
      title: n,
      color: r,
      defaultTab: o,
      children: s,
      hidden: i,
      useFullWidth: a,
      selectedTab: l,
      onTabChange: c,
      banner: u,
      disableNavigation: d,
      initialHeaderFocused: p,
      contentHeight: m,
      navFromContent: f
    } = e;
    let h = p === undefined ? true : p;
    let g = f === undefined ? false : f;
    let {
      columns: y
    } = Sr();
    let _ = s.map(YHm);
    let b = o ? _.findIndex(Sn => o === Sn[0]) : 0;
    let S = l !== undefined;
    let [E, C] = XO.useState(b !== -1 ? b : 0);
    let x = S ? _.findIndex(Sn => Sn[0] === l) : -1;
    let A = S ? x !== -1 ? x : 0 : E;
    let k = XO.useContext(_q);
    let I = uut();
    let O = eFn();
    let M = XO.useRef(null);
    let [L, P] = XO.useState(0);
    let F;
    if (t[0] !== L) {
      F = () => {
        let Sn = M.current ? $Xd(M.current).height : 0;
        if (Sn !== L) {
          P(Sn);
        }
      };
      t[0] = L;
      t[1] = F;
    } else {
      F = t[1];
    }
    XO.useLayoutEffect(F);
    let H = (i ? 0 : 2) + L;
    let U;
    let N;
    if (t[2] !== O || t[3] !== H) {
      U = () => {
        if (!O) {
          return;
        }
        O(H);
        return () => O(null);
      };
      N = [O, H];
      t[2] = O;
      t[3] = H;
      t[4] = U;
      t[5] = N;
    } else {
      U = t[4];
      N = t[5];
    }
    XO.useLayoutEffect(U, N);
    let W;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      W = {
        rows: 0,
        columns: 0
      };
      t[6] = W;
    } else {
      W = t[6];
    }
    let {
      rows: j
    } = h_(W);
    let z = O !== null && I !== null;
    let V = z ? j - H : undefined;
    let K;
    if (t[7] !== k || t[8] !== z) {
      K = k && z ? {
        ...k,
        claimScrollBox: null
      } : null;
      t[7] = k;
      t[8] = z;
      t[9] = K;
    } else {
      K = t[9];
    }
    let J = K;
    let Q = false;
    let Z = XO.useRef(null);
    let {
      focus: ne,
      focusDirection: oe,
      blur: ee
    } = useFocus();
    let [re, se] = XO.useState(h);
    let ae;
    if (t[10] !== ne) {
      ae = () => {
        if (Q && Z.current) {
          ne(Z.current);
        }
        se(true);
      };
      t[10] = ne;
      t[11] = ae;
    } else {
      ae = t[11];
    }
    let de = ae;
    let be;
    if (t[12] !== ee) {
      be = () => {
        if (Q) {
          ee();
        }
        se(false);
      };
      t[12] = ee;
      t[13] = be;
    } else {
      be = t[13];
    }
    let fe = be;
    let [me, Te] = XO.useState(0);
    let ue;
    if (t[14] === Symbol.for("react.memo_cache_sentinel")) {
      ue = () => (Te(KHm), () => Te(zHm));
      t[14] = ue;
    } else {
      ue = t[14];
    }
    let ce = ue;
    let le = me > 0;
    let pe = re || !le;
    let ve = Sn => {
      let jn = _[Sn]?.[0];
      if (S && c && jn) {
        c(jn);
      } else {
        C(Sn);
      }
      de();
    };
    let _e = Sn => {
      ve((A + _.length + Sn) % _.length);
    };
    let xe = !i && !d && pe;
    let ke;
    if (t[15] !== xe) {
      ke = {
        context: "Tabs",
        isActive: xe
      };
      t[15] = xe;
      t[16] = ke;
    } else {
      ke = t[16];
    }
    jo({
      "tabs:next": () => _e(1),
      "tabs:previous": () => _e(-1)
    }, ke);
    let Ie;
    if (t[17] !== d || t[18] !== oe || t[19] !== re || t[20] !== i || t[21] !== le) {
      Ie = Sn => {
        if (i || d) {
          return;
        }
        if (Q) {
          if (!re) {
            if (Sn.key === "left" || Sn.key === "right" || Sn.key === "tab" || le && (Sn.key === "up" || Sn.key === "down")) {
              Sn.preventDefault();
            }
            return;
          }
          if (Sn.key === "left" || Sn.key === "right" || Sn.key === "tab") {
            Sn.preventDefault();
          } else if (Sn.key === "down" && le) {
            Sn.preventDefault();
            oe("down");
            se(false);
          }
          return;
        }
        if (!le) {
          return;
        }
        if (Sn.key === "up" || Sn.key === "down") {
          if (Sn.preventDefault(), re && Sn.key === "down") {
            se(false);
          }
        }
      };
      t[17] = d;
      t[18] = oe;
      t[19] = re;
      t[20] = i;
      t[21] = le;
      t[22] = Ie;
    } else {
      Ie = t[22];
    }
    let Ue = Ie;
    let Ge = !Q && g && !re && le && !i && !d;
    let Be;
    if (t[23] !== Ge) {
      Be = {
        context: "Tabs",
        isActive: Ge
      };
      t[23] = Ge;
      t[24] = Be;
    } else {
      Be = t[24];
    }
    jo({
      "tabs:next": () => _e(1),
      "tabs:previous": () => _e(-1)
    }, Be);
    let We = n ? an(n) + 1 : 0;
    let Ze = _.reduce(VHm, 0);
    let Tt = We + Ze;
    let kt = a ? Math.max(0, y - Tt) : 0;
    let Ye = a ? y : undefined;
    let ht = gXd;
    let It = "column";
    let Rt = Q ? undefined : 0;
    let wt = Q ? undefined : h;
    let vt = Q ? undefined : Ue;
    let yt = I ? 0 : undefined;
    let gt = !i && nB.jsxs(gXd, {
      ref: Q ? Z : undefined,
      tabIndex: Q ? 0 : undefined,
      autoFocus: Q ? h : undefined,
      onFocus: Q ? () => se(true) : undefined,
      onBlur: Q ? () => se(false) : undefined,
      onKeyDown: Q ? Ue : undefined,
      flexDirection: "row",
      gap: 1,
      flexShrink: I ? 0 : undefined,
      alignSelf: Q && !a ? "flex-start" : undefined,
      children: [n !== undefined && nB.jsx(Text, {
        bold: true,
        color: r,
        children: n
      }), _.map((Sn, jn) => {
        let [Xr, co] = Sn;
        return nB.jsx(JHm, {
          title: co,
          isCurrent: A === jn,
          headerFocused: pe && !d,
          color: r,
          onClick: d ? undefined : () => ve(jn)
        }, Xr);
      }), kt > 0 && nB.jsx(Text, {
        children: " ".repeat(kt)
      })]
    });
    let Ft;
    if (t[25] !== u) {
      Ft = u != null && nB.jsx(gXd, {
        ref: M,
        flexDirection: "column",
        flexShrink: 0,
        children: u
      });
      t[25] = u;
      t[26] = Ft;
    } else {
      Ft = t[26];
    }
    let on;
    if (t[27] !== J || t[28] !== s || t[29] !== m || t[30] !== Ye || t[31] !== i || t[32] !== I || t[33] !== z || t[34] !== V || t[35] !== A) {
      on = z ? nB.jsx(gXd, {
        width: Ye,
        marginTop: i ? 0 : 1,
        flexShrink: 0,
        children: nB.jsx(B2m, {
          ref: I,
          flexDirection: "column",
          flexShrink: 0,
          maxHeight: V,
          stickyScroll: false,
          children: nB.jsx(_q, {
            value: J,
            children: s
          })
        }, A)
      }) : nB.jsx(gXd, {
        width: Ye,
        marginTop: i ? 0 : 1,
        height: m,
        overflowY: m !== undefined ? "hidden" : undefined,
        flexShrink: I ? 0 : undefined,
        children: s
      });
      t[27] = J;
      t[28] = s;
      t[29] = m;
      t[30] = Ye;
      t[31] = i;
      t[32] = I;
      t[33] = z;
      t[34] = V;
      t[35] = A;
      t[36] = on;
    } else {
      on = t[36];
    }
    let rn;
    if (t[37] !== ht || t[38] !== Rt || t[39] !== wt || t[40] !== vt || t[41] !== yt || t[42] !== gt || t[43] !== Ft || t[44] !== on) {
      rn = nB.jsxs(ht, {
        flexDirection: It,
        tabIndex: Rt,
        autoFocus: wt,
        onKeyDown: vt,
        flexShrink: yt,
        children: [gt, Ft, on]
      });
      t[37] = ht;
      t[38] = Rt;
      t[39] = wt;
      t[40] = vt;
      t[41] = yt;
      t[42] = gt;
      t[43] = Ft;
      t[44] = on;
      t[45] = rn;
    } else {
      rn = t[45];
    }
    return nB.jsx(Isr.Provider, {
      value: {
        selectedTab: _[A][0],
        width: Ye,
        headerFocused: re,
        focusHeader: de,
        blurHeader: fe,
        registerOptIn: ce
      },
      children: rn
    });
  }
  function VHm(e, t) {
    let [, n] = t;
    return e + (n ? an(n) : 0) + 2 + 1;
  }
  function zHm(e) {
    return e - 1;
  }
  function KHm(e) {
    return e + 1;
  }
  function YHm(e) {
    return [e.props.id ?? e.props.title, e.props.title];
  }
  function JHm(e) {
    let t = DQt.c(15);
    let {
      title: n,
      isCurrent: r,
      headerFocused: o,
      color: s,
      onClick: i
    } = e;
    let [a, l] = XO.useState(false);
    let c = i !== undefined;
    let u = r && o;
    let d;
    if (t[0] !== u) {
      d = {
        line: 0,
        column: 1,
        active: u
      };
      t[0] = u;
      t[1] = d;
    } else {
      d = t[1];
    }
    let p = SG(d);
    let m = s && r && o;
    let f;
    let h;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      f = () => l(true);
      h = () => l(false);
      t[2] = f;
      t[3] = h;
    } else {
      f = t[2];
      h = t[3];
    }
    let g;
    if (t[4] !== c || t[5] !== s || t[6] !== m || t[7] !== a || t[8] !== r || t[9] !== n) {
      g = m ? nB.jsx(Mx, {
        color: s,
        bold: true,
        padded: true,
        children: n
      }) : nB.jsxs(Text, {
        inverse: r,
        bold: r,
        underline: a && c,
        children: [" ", n, " "]
      });
      t[4] = c;
      t[5] = s;
      t[6] = m;
      t[7] = a;
      t[8] = r;
      t[9] = n;
      t[10] = g;
    } else {
      g = t[10];
    }
    let y;
    if (t[11] !== p || t[12] !== i || t[13] !== g) {
      y = nB.jsx(gXd, {
        ref: p,
        onClick: i,
        onMouseEnter: f,
        onMouseLeave: h,
        children: g
      });
      t[11] = p;
      t[12] = i;
      t[13] = g;
      t[14] = y;
    } else {
      y = t[14];
    }
    return y;
  }
  function kh(e) {
    let t = DQt.c(4);
    let {
      title: n,
      id: r,
      children: o
    } = e;
    let {
      selectedTab: s,
      width: i
    } = XO.useContext(Isr);
    let a = nE();
    if (s !== (r ?? n)) {
      return null;
    }
    let l = a ? 0 : undefined;
    let c;
    if (t[0] !== o || t[1] !== l || t[2] !== i) {
      c = nB.jsx(gXd, {
        width: i,
        flexShrink: l,
        children: o
      });
      t[0] = o;
      t[1] = l;
      t[2] = i;
      t[3] = c;
    } else {
      c = t[3];
    }
    return c;
  }
  function Ojl() {
    let {
      width: e
    } = XO.useContext(Isr);
    return e;
  }
  function zM() {
    let e = DQt.c(6);
    let {
      headerFocused: t,
      focusHeader: n,
      blurHeader: r,
      registerOptIn: o
    } = XO.useContext(Isr);
    let s;
    if (e[0] !== o) {
      s = [o];
      e[0] = o;
      e[1] = s;
    } else {
      s = e[1];
    }
    XO.useLayoutEffect(o, s);
    let i;
    if (e[2] !== r || e[3] !== n || e[4] !== t) {
      i = {
        headerFocused: t,
        focusHeader: n,
        blurHeader: r
      };
      e[2] = r;
      e[3] = n;
      e[4] = t;
      e[5] = i;
    } else {
      i = e[5];
    }
    return i;
  }
  var DQt;
  var XO;
  var nB;
  var Isr;
  var yH = __lazy(() => {
    rE();
    ki();
    dGe();
    y1n();
    bc();
    et();
    Bs();
    qve();
    DQt = __toESM(pt(), 1);
    XO = __toESM(ot(), 1);
    nB = __toESM(ie(), 1);
    Isr = XO.createContext({
      selectedTab: undefined,
      width: undefined,
      headerFocused: false,
      focusHeader: () => {},
      blurHeader: () => {},
      registerOptIn: () => () => {}
    });
  });
  function Rvt(e) {
    switch (e) {
      case "hipaa":
        return "HIPAA";
      case "zdr":
        return "ZDR (Zero Data Retention)";
      default:
        logForDebugging(`Unknown compliance_taint '${e}' from policyLimits`, {
          level: "warn"
        });
        return e;
    }
  }
  var Psr = __lazy(() => {
    je();
  });
  function UZ() {
    let e = getInitialSettings()?.autoUpdatesChannel;
    if (e && e !== "latest") {
      return e;
    }
    return "latest";
  }
  var XFe = __lazy(() => {
    $n();
  });
  function QHm(e, t) {
    switch (e) {
      case "grid":
        return 3 * t + 1;
      case "simple":
        return 3 * t - 1;
      case "minimal":
      case "plain":
        return 2 * (t - 1);
    }
  }
  function ZHm(e) {
    if (typeof e === "string" || typeof e === "number") {
      return true;
    }
    if (QFe.isValidElement(e) && e.type === QFe.Fragment) {
      return true;
    }
    return false;
  }
  function ejm(e, t, n) {
    if (!ZHm(e)) {
      return e;
    }
    return EE.jsx(Text, {
      dimColor: t.dim && !n,
      bold: t.bold || n,
      children: e
    });
  }
  function Djl(e) {
    return an(e$(e));
  }
  function tjm(e, t, n, r, o) {
    let s = e.length;
    let i = e.map((c, u) => {
      let d = n ? Djl(c.header) : 0;
      for (let p of t) {
        d = Math.max(d, Djl(p[u]));
      }
      return d;
    });
    let a = Array(s);
    let l = [];
    for (let c = 0; c < s; c++) {
      let u = e[c].width;
      if (typeof u === "number") {
        a[c] = u;
      } else if (u && "ratio" in u && u.ratio !== undefined) {
        l.push(c);
        a[c] = 0;
      } else if (u) {
        a[c] = j_(i[c], u.min ?? 0, u.max ?? 1 / 0);
      } else {
        a[c] = i[c];
      }
    }
    if (l.length > 0) {
      let c = a.reduce((p, m) => p + m, 0);
      let u = Math.max(0, r - QHm(o, s) - c);
      let d = l.reduce((p, m) => p + (e[m].width.ratio ?? 0), 0);
      for (let p of l) {
        let m = e[p].width;
        let f = d > 0 ? Math.floor(u * (m.ratio ?? 0) / d) : 0;
        a[p] = j_(f, m.min ?? 1, m.max ?? 1 / 0);
      }
    }
    return a;
  }
  function njm(e) {
    let t = rYe.c(2);
    let {
      box: n
    } = e;
    if (n === "grid" || n === "simple") {
      let o;
      if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
        o = EE.jsx(Text, {
          dimColor: true,
          children: " \u2502 "
        });
        t[0] = o;
      } else {
        o = t[0];
      }
      return o;
    }
    let r;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      r = EE.jsx(gXd, {
        width: 2,
        flexShrink: 0
      });
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  function Mjl(e) {
    let t = rYe.c(3);
    let {
      box: n,
      side: r
    } = e;
    if (n === "grid") {
      let o = r === "left" ? "\u2502 " : " \u2502";
      let s;
      if (t[0] !== o) {
        s = EE.jsx(Text, {
          dimColor: true,
          children: o
        });
        t[0] = o;
        t[1] = s;
      } else {
        s = t[1];
      }
      return s;
    }
    if (n === "simple") {
      let o;
      if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
        o = EE.jsx(Text, {
          children: " "
        });
        t[2] = o;
      } else {
        o = t[2];
      }
      return o;
    }
    return null;
  }
  function mjo(e) {
    let t = rYe.c(19);
    let {
      box: n,
      type: r,
      widths: o
    } = e;
    if (n === "minimal") {
      let p;
      if (t[0] !== o) {
        p = o.map(ojm);
        t[0] = o;
        t[1] = p;
      } else {
        p = t[1];
      }
      let m;
      if (t[2] !== p) {
        m = EE.jsx(gXd, {
          flexDirection: "row",
          children: p
        });
        t[2] = p;
        t[3] = m;
      } else {
        m = t[3];
      }
      return m;
    }
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    if (t[4] !== n || t[5] !== r || t[6] !== o) {
      u = Symbol.for("react.early_return_sentinel");
      e: {
        let p = o.map(rjm);
        if (n === "simple") {
          u = EE.jsx(Text, {
            dimColor: true,
            children: p.join("\u253C")
          });
          break e;
        }
        let [m, f, h] = r === "top" ? ["\u250C", "\u252C", "\u2510"] : r === "bottom" ? ["\u2514", "\u2534", "\u2518"] : ["\u251C", "\u253C", "\u2524"];
        i = h;
        s = Text;
        a = true;
        l = m;
        c = p.join(f);
      }
      t[4] = n;
      t[5] = r;
      t[6] = o;
      t[7] = s;
      t[8] = i;
      t[9] = a;
      t[10] = l;
      t[11] = c;
      t[12] = u;
    } else {
      s = t[7];
      i = t[8];
      a = t[9];
      l = t[10];
      c = t[11];
      u = t[12];
    }
    if (u !== Symbol.for("react.early_return_sentinel")) {
      return u;
    }
    let d;
    if (t[13] !== s || t[14] !== i || t[15] !== a || t[16] !== l || t[17] !== c) {
      d = EE.jsxs(s, {
        dimColor: a,
        children: [l, c, i]
      });
      t[13] = s;
      t[14] = i;
      t[15] = a;
      t[16] = l;
      t[17] = c;
      t[18] = d;
    } else {
      d = t[18];
    }
    return d;
  }
  function rjm(e) {
    return "\u2500".repeat(e + 2);
  }
  function ojm(e, t) {
    return EE.jsxs(fjo.Fragment, {
      children: [t > 0 && EE.jsx(gXd, {
        width: 2,
        flexShrink: 0
      }), EE.jsx(Text, {
        dimColor: true,
        children: "\u2500".repeat(e)
      })]
    }, t);
  }
  function Njl(e) {
    let t = rYe.c(19);
    let {
      cells: n,
      columns: r,
      widths: o,
      box: s,
      isHeader: i
    } = e;
    let a;
    if (t[0] !== s) {
      a = EE.jsx(Mjl, {
        box: s,
        side: "left"
      });
      t[0] = s;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l;
    if (t[2] !== s || t[3] !== n || t[4] !== r || t[5] !== i || t[6] !== o) {
      let d;
      if (t[8] !== s || t[9] !== n || t[10] !== i || t[11] !== o) {
        d = (p, m) => EE.jsxs(fjo.Fragment, {
          children: [m > 0 && EE.jsx(njm, {
            box: s
          }), EE.jsx(gXd, {
            width: o[m] || undefined,
            flexShrink: 0,
            justifyContent: XHm[p.align ?? "start"],
            children: ejm(n[m], p, i)
          })]
        }, m);
        t[8] = s;
        t[9] = n;
        t[10] = i;
        t[11] = o;
        t[12] = d;
      } else {
        d = t[12];
      }
      l = r.map(d);
      t[2] = s;
      t[3] = n;
      t[4] = r;
      t[5] = i;
      t[6] = o;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[13] !== s) {
      c = EE.jsx(Mjl, {
        box: s,
        side: "right"
      });
      t[13] = s;
      t[14] = c;
    } else {
      c = t[14];
    }
    let u;
    if (t[15] !== a || t[16] !== l || t[17] !== c) {
      u = EE.jsxs(gXd, {
        flexDirection: "row",
        children: [a, l, c]
      });
      t[15] = a;
      t[16] = l;
      t[17] = c;
      t[18] = u;
    } else {
      u = t[18];
    }
    return u;
  }
  function sjm(e) {
    let t = rYe.c(2);
    let {
      children: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = EE.jsx(EE.Fragment, {
        children: n
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  function ijm(e) {
    let t = rYe.c(22);
    let {
      box: n,
      columns: r,
      children: o,
      forceWidth: s
    } = e;
    let i = n === undefined ? "plain" : n;
    let {
      columns: a
    } = Sr();
    let l = s ?? a;
    let c;
    let u;
    let d;
    let p;
    let m;
    let f;
    let h;
    if (t[0] !== i || t[1] !== o || t[2] !== r || t[3] !== l) {
      let _ = QFe.Children.toArray(o).filter(QFe.isValidElement);
      let b = _.map(cjm);
      let S = r.some(ljm);
      h = tjm(r, b, S, l, i);
      c = gXd;
      u = "column";
      d = i === "grid" && EE.jsx(mjo, {
        box: i,
        type: "top",
        widths: h
      });
      p = S && EE.jsx(Njl, {
        cells: r.map(ajm),
        columns: r,
        widths: h,
        box: i,
        isHeader: true
      });
      m = S && i !== "plain" && EE.jsx(mjo, {
        box: i,
        type: "header",
        widths: h
      });
      f = b.map((E, C) => EE.jsx(Njl, {
        cells: E,
        columns: r,
        widths: h,
        box: i,
        isHeader: false
      }, _[C].key ?? C));
      t[0] = i;
      t[1] = o;
      t[2] = r;
      t[3] = l;
      t[4] = c;
      t[5] = u;
      t[6] = d;
      t[7] = p;
      t[8] = m;
      t[9] = f;
      t[10] = h;
    } else {
      c = t[4];
      u = t[5];
      d = t[6];
      p = t[7];
      m = t[8];
      f = t[9];
      h = t[10];
    }
    let g;
    if (t[11] !== i || t[12] !== h) {
      g = i === "grid" && EE.jsx(mjo, {
        box: i,
        type: "bottom",
        widths: h
      });
      t[11] = i;
      t[12] = h;
      t[13] = g;
    } else {
      g = t[13];
    }
    let y;
    if (t[14] !== c || t[15] !== u || t[16] !== d || t[17] !== p || t[18] !== m || t[19] !== f || t[20] !== g) {
      y = EE.jsxs(c, {
        flexDirection: u,
        children: [d, p, m, f, g]
      });
      t[14] = c;
      t[15] = u;
      t[16] = d;
      t[17] = p;
      t[18] = m;
      t[19] = f;
      t[20] = g;
      t[21] = y;
    } else {
      y = t[21];
    }
    return y;
  }
  function ajm(e) {
    return e.header;
  }
  function ljm(e) {
    return e.header !== undefined;
  }
  function cjm(e) {
    return QFe.Children.toArray(e.props.children);
  }
  var rYe;
  var fjo;
  var QFe;
  var EE;
  var XHm;
  var ih;
  var oYe = __lazy(() => {
    ki();
    Q8();
    bc();
    et();
    Djt();
    rYe = __toESM(pt(), 1);
    fjo = __toESM(ot(), 1);
    QFe = __toESM(ot(), 1);
    EE = __toESM(ie(), 1);
    XHm = {
      start: "flex-start",
      center: "center",
      end: "flex-end"
    };
    ih = Object.assign(ijm, {
      Row: sjm
    });
  });
  function ujm() {
    let e = getSessionId();
    let t = Me.CLAUDE_CODE_TMUX_SESSION;
    let r = getCurrentSessionTitle(e) ?? getCurrentSessionAiTitle(e) ?? vE.jsx(Text, {
      dimColor: true,
      children: "/rename to add a name"
    });
    let o = getAllowedChannels();
    let s = "";
    if (o.length > 0) {
      let i = o.map(l => l.kind === "plugin" ? `plugin:${l.name}@${l.marketplace}` : `server:${l.name}`).join(", ");
      let a = getAPIProvider() !== "firstParty" ? "not available on third-party providers" : !isChannelsEnabled() ? "not currently available" : isChannelsPolicyBlocked(getSettingsForSource("policySettings")) ? "blocked by org policy" : undefined;
      s = a ? `Configured but not active (${a}): ${i}` : `Listening for messages from ${i}`;
    }
    return [{
      label: "Version",
      value: `${{
        ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
        PACKAGE_URL: "@anthropic-ai/claude-code",
        README_URL: "https://code.claude.com/docs/en/overview",
        VERSION: "2.1.198",
        FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
        BUILD_TIME: "2026-07-01T06:09:31Z",
        GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
      }.VERSION}${ej()}`
    }, ...[], {
      label: "Session name",
      value: r
    }, {
      label: "Session ID",
      value: e
    }, ...(t ? [{
      label: "tmux session",
      value: t
    }] : []), ...(s ? [{
      label: "Channels",
      value: s
    }] : []), ...[], ...(getMemoryToggledOff() ? [{
      label: "Memory",
      value: "Paused for this session \xB7 /pause-memory to resume"
    }] : []), {
      label: "cwd",
      value: Nt()
    }, ...vYn(), ...djm(), ...wYn()];
  }
  function djm() {
    let e = Gle();
    return e.length > 0 ? [{
      label: "Compliance",
      value: e.map(Rvt)
    }] : [];
  }
  function pjm({
    mainLoopModel: e,
    mcp: t,
    theme: n,
    context: r
  }) {
    return [{
      label: "Model",
      value: _cl(e)
    }, ...pcl(t.clients, r.options.ideInstallationStatus, n), ...mcl(t.clients, n), ...dcl(), ...hcl()];
  }
  async function Ljl() {
    return [...(await gcl()), ...(await ycl()), ...(await fcl())];
  }
  function mjm(e) {
    let t = Osr.c(8);
    let {
      value: n
    } = e;
    if (Array.isArray(n)) {
      let r;
      if (t[0] !== n) {
        let s;
        if (t[2] !== n.length) {
          s = (i, a) => vE.jsxs(Text, {
            children: [i, a < n.length - 1 ? "," : ""]
          }, a);
          t[2] = n.length;
          t[3] = s;
        } else {
          s = t[3];
        }
        r = n.map(s);
        t[0] = n;
        t[1] = r;
      } else {
        r = t[1];
      }
      let o;
      if (t[4] !== r) {
        o = vE.jsx(gXd, {
          flexWrap: "wrap",
          columnGap: 1,
          flexShrink: 99,
          children: r
        });
        t[4] = r;
        t[5] = o;
      } else {
        o = t[5];
      }
      return o;
    }
    if (typeof n === "string") {
      let r;
      if (t[6] !== n) {
        r = vE.jsx(Text, {
          children: n
        });
        t[6] = n;
        t[7] = r;
      } else {
        r = t[7];
      }
      return r;
    }
    return n;
  }
  function Fjl(e) {
    let t = Osr.c(20);
    let {
      context: n,
      diagnosticsPromise: r
    } = e;
    let o = bt(yjm);
    let s = bt(gjm);
    let [i] = useTheme();
    let a;
    if (t[0] !== n || t[1] !== o || t[2] !== s || t[3] !== i) {
      a = EYn([ujm(), pjm({
        mainLoopModel: o,
        mcp: s,
        theme: i,
        context: n
      })]);
      t[0] = n;
      t[1] = o;
      t[2] = s;
      t[3] = i;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l = a;
    let c = nE() ? 1 : undefined;
    let u;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      u = [{
        bold: true
      }, {}];
      t[5] = u;
    } else {
      u = t[5];
    }
    let d;
    if (t[6] !== l) {
      d = l.filter(hjm).flatMap(fjm);
      t[6] = l;
      t[7] = d;
    } else {
      d = t[7];
    }
    let p;
    if (t[8] !== d) {
      p = vE.jsx(ih, {
        box: "plain",
        columns: u,
        children: d
      });
      t[8] = d;
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== r) {
      m = vE.jsx(Dsr.Suspense, {
        fallback: null,
        children: vE.jsx(_jm, {
          promise: r
        })
      });
      t[10] = r;
      t[11] = m;
    } else {
      m = t[11];
    }
    let f;
    if (t[12] !== c || t[13] !== p || t[14] !== m) {
      f = vE.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        flexGrow: c,
        children: [p, m]
      });
      t[12] = c;
      t[13] = p;
      t[14] = m;
      t[15] = f;
    } else {
      f = t[15];
    }
    let h;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      h = vE.jsx(Text, {
        dimColor: true,
        children: vE.jsx(Wr, {
          action: "confirm:no",
          context: "Settings",
          fallback: "Esc",
          description: "cancel"
        })
      });
      t[16] = h;
    } else {
      h = t[16];
    }
    let g;
    if (t[17] !== c || t[18] !== f) {
      g = vE.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        flexGrow: c,
        children: [f, h]
      });
      t[17] = c;
      t[18] = f;
      t[19] = g;
    } else {
      g = t[19];
    }
    return g;
  }
  function fjm(e, t) {
    return [t > 0 && vE.jsxs(ih.Row, {
      children: [vE.jsx(vE.Fragment, {
        children: " "
      }), vE.jsx(vE.Fragment, {
        children: ""
      })]
    }, `gap-${t}`), ...e.map((n, r) => {
      let {
        label: o,
        value: s
      } = n;
      return vE.jsxs(ih.Row, {
        children: [vE.jsx(vE.Fragment, {
          children: o !== undefined ? `${o}:` : ""
        }), vE.jsx(mjm, {
          value: s
        })]
      }, `${t}-${r}`);
    })];
  }
  function hjm(e) {
    return e.length > 0;
  }
  function gjm(e) {
    return e.mcp;
  }
  function yjm(e) {
    return e.mainLoopModel;
  }
  function _jm(e) {
    let t = Osr.c(5);
    let {
      promise: n
    } = e;
    let r = Dsr.use(n);
    if (r.length === 0) {
      return null;
    }
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = vE.jsx(Text, {
        bold: true,
        children: "System diagnostics"
      });
      t[0] = o;
    } else {
      o = t[0];
    }
    let s;
    if (t[1] !== r) {
      s = r.map(bjm);
      t[1] = r;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i;
    if (t[3] !== s) {
      i = vE.jsxs(gXd, {
        flexDirection: "column",
        paddingBottom: 1,
        children: [o, s]
      });
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  function bjm(e, t) {
    return vE.jsxs(gXd, {
      flexDirection: "row",
      gap: 1,
      paddingX: 1,
      children: [vE.jsx(Ps, {
        status: "warning"
      }), typeof e === "string" ? vE.jsx(Text, {
        wrap: "wrap",
        children: e
      }) : e]
    }, t);
  }
  var Osr;
  var Dsr;
  var vE;
  var Ujl = __lazy(() => {
    at();
    rE();
    et();
    MTt();
    qKe();
    $Y();
    Psr();
    ho();
    vo();
    je();
    pr();
    Zl();
    Ds();
    XFe();
    fa();
    lIo();
    Sd();
    Vf();
    oYe();
    Osr = __toESM(pt(), 1);
    Dsr = __toESM(ot(), 1);
    vE = __toESM(ie(), 1);
  });
  function $jl({
    isDisabled: e = false,
    visibleOptionCount: t = 5,
    options: n,
    defaultValue: r = [],
    onChange: o,
    onCancel: s,
    onFocus: i,
    focusValue: a,
    submitButtonText: l,
    onSubmit: c,
    onDownFromLastItem: u,
    onUpFromFirstItem: d,
    initialFocusLast: p,
    hideIndexes: m = false
  }) {
    let [f, h] = ZFe.useState(r);
    let [g, y] = ZFe.useState(false);
    let [_, b] = ZFe.useState(n);
    if (n !== _ && !Bjl.isDeepStrictEqual(n, _)) {
      h(r);
      b(n);
    }
    let [S, E] = ZFe.useState(() => {
      let I = new Map();
      n.forEach(O => {
        if (O.type === "input" && O.initialValue) {
          I.set(O.value, O.initialValue);
        }
      });
      return I;
    });
    let C = ZFe.useCallback(I => {
      let O = typeof I === "function" ? I(f) : I;
      h(O);
      o?.(O);
    }, [f, o]);
    let x = aFn({
      visibleOptionCount: t,
      options: n,
      initialFocusValue: p ? n[n.length - 1]?.value : undefined,
      onFocus: i,
      focusValue: a
    });
    Jg("multi-select");
    let A = ZFe.useCallback((I, O) => {
      E(L => {
        let P = new Map(L);
        P.set(I, O);
        return P;
      });
      let M = n.find(L => L.value === I);
      if (M && M.type === "input") {
        M.onChange(O);
      }
      C(L => {
        if (O) {
          if (!L.includes(I)) {
            return [...L, I];
          }
          return L;
        } else {
          return L.filter(P => P !== I);
        }
      });
    }, [n, C]);
    return {
      ...x,
      selectedValues: f,
      inputValues: S,
      isSubmitFocused: g,
      updateInputValue: A,
      onCancel: s,
      handleKeyDown: I => {
        if (e) {
          return;
        }
        let O = N7(I.key);
        let L = n.find(F => F.value === x.focusedValue)?.type === "input";
        if (L) {
          if (!(I.key === "up" || I.key === "down" || I.key === "escape" || I.key === "tab" || I.key === "return" || I.ctrl && (I.key === "n" || I.key === "p" || I.key === "return"))) {
            return;
          }
        }
        let P = n[n.length - 1]?.value;
        if (I.key === "tab" && !I.shift) {
          if (I.preventDefault(), l && c && x.focusedValue === P && !g) {
            y(true);
          } else if (!g) {
            x.focusNextOption();
          }
          return;
        }
        if (I.key === "tab" && I.shift) {
          if (I.preventDefault(), l && c && g) {
            y(false);
            x.focusOption(P);
          } else {
            x.focusPreviousOption();
          }
          return;
        }
        if (I.key === "down" || I.ctrl && I.key === "n" || !I.ctrl && !I.shift && I.key === "j") {
          if (I.preventDefault(), g && u) {
            u();
          } else if (l && c && x.focusedValue === P && !g) {
            y(true);
          } else if (!l && u && x.focusedValue === P) {
            u();
          } else if (!g) {
            x.focusNextOption();
          }
          return;
        }
        if (I.key === "up" || I.ctrl && I.key === "p" || !I.ctrl && !I.shift && I.key === "k") {
          if (I.preventDefault(), l && c && g) {
            y(false);
            x.focusOption(P);
          } else if (d && x.focusedValue === n[0]?.value) {
            d();
          } else {
            x.focusPreviousOption();
          }
          return;
        }
        if (I.key === "pagedown") {
          I.preventDefault();
          x.focusNextPage();
          return;
        }
        if (I.key === "pageup") {
          I.preventDefault();
          x.focusPreviousPage();
          return;
        }
        if (I.key === "return" || Bae(I.key) === " ") {
          if (I.preventDefault(), I.ctrl && I.key === "return" && L && c) {
            c(f);
            return;
          }
          if (g && c) {
            c(f);
            return;
          }
          if (I.key === "return" && !l && c) {
            c(f);
            return;
          }
          if (x.focusedValue !== undefined) {
            let F = f.includes(x.focusedValue) ? f.filter(H => H !== x.focusedValue) : [...f, x.focusedValue];
            C(F);
          }
          return;
        }
        if (!m && /^[0-9]$/.test(O)) {
          I.preventDefault();
          let F = parseInt(O) - 1;
          if (F >= 0 && F < n.length) {
            let H = n[F].value;
            let U = f.includes(H) ? f.filter(N => N !== H) : [...f, H];
            C(U);
          }
          return;
        }
        if (I.key === "escape") {
          s();
          I.stopImmediatePropagation();
        }
      }
    };
  }
  var ZFe;
  var Bjl;
  var Hjl = __lazy(() => {
    px();
    Zn();
    Moo();
    ZFe = __toESM(ot(), 1);
    Bjl = require("util");
  });
  function eUe(e) {
    let t = gjo.c(11);
    if (useIsScreenReaderEnabled()) {
      let o;
      if (t[0] !== e.defaultValue || t[1] !== e.isDisabled || t[2] !== e.onCancel || t[3] !== e.onChange || t[4] !== e.onFocus || t[5] !== e.onSubmit || t[6] !== e.options || t[7] !== e.submitButtonText) {
        o = KM.jsx(kZi, {
          options: e.options,
          defaultValue: e.defaultValue,
          onChange: e.onChange,
          onSubmit: e.onSubmit,
          onFocus: e.onFocus,
          onCancel: e.onCancel,
          isDisabled: e.isDisabled,
          submitButtonText: e.submitButtonText
        });
        t[0] = e.defaultValue;
        t[1] = e.isDisabled;
        t[2] = e.onCancel;
        t[3] = e.onChange;
        t[4] = e.onFocus;
        t[5] = e.onSubmit;
        t[6] = e.options;
        t[7] = e.submitButtonText;
        t[8] = o;
      } else {
        o = t[8];
      }
      return o;
    }
    let r;
    if (t[9] !== e) {
      r = KM.jsx(Sjm, {
        ...e
      });
      t[9] = e;
      t[10] = r;
    } else {
      r = t[10];
    }
    return r;
  }
  function Sjm(e) {
    let t = gjo.c(51);
    let {
      isDisabled: n,
      visibleOptionCount: r,
      options: o,
      defaultValue: s,
      onCancel: i,
      onChange: a,
      onFocus: l,
      focusValue: c,
      submitButtonText: u,
      onSubmit: d,
      onDownFromLastItem: p,
      onUpFromFirstItem: m,
      initialFocusLast: f,
      onOpenEditor: h,
      hideIndexes: g,
      onImagePaste: y,
      pastedContents: _,
      onRemoveImage: b
    } = e;
    let S = n === undefined ? false : n;
    let E = r === undefined ? 5 : r;
    let C;
    if (t[0] !== s) {
      C = s === undefined ? [] : s;
      t[0] = s;
      t[1] = C;
    } else {
      C = t[1];
    }
    let x = C;
    let A = g === undefined ? false : g;
    let k = o.some(Ejm);
    let I = Noo(E, k ? "compact-vertical" : "compact");
    let O;
    if (t[2] !== x || t[3] !== c || t[4] !== A || t[5] !== f || t[6] !== S || t[7] !== i || t[8] !== a || t[9] !== p || t[10] !== l || t[11] !== d || t[12] !== m || t[13] !== o || t[14] !== u || t[15] !== I) {
      O = {
        isDisabled: S,
        visibleOptionCount: I,
        options: o,
        defaultValue: x,
        onChange: a,
        onCancel: i,
        onFocus: l,
        focusValue: c,
        submitButtonText: u,
        onSubmit: d,
        onDownFromLastItem: p,
        onUpFromFirstItem: m,
        initialFocusLast: f,
        hideIndexes: A
      };
      t[2] = x;
      t[3] = c;
      t[4] = A;
      t[5] = f;
      t[6] = S;
      t[7] = i;
      t[8] = a;
      t[9] = p;
      t[10] = l;
      t[11] = d;
      t[12] = m;
      t[13] = o;
      t[14] = u;
      t[15] = I;
      t[16] = O;
    } else {
      O = t[16];
    }
    let M = $jl(O);
    let L = jjl.useRef(null);
    MI(L, !S);
    let P;
    let F;
    let H;
    let U;
    let N;
    let W;
    let j;
    if (t[17] !== A || t[18] !== S || t[19] !== i || t[20] !== y || t[21] !== h || t[22] !== b || t[23] !== o.length || t[24] !== _ || t[25] !== M) {
      let J = o.length.toString().length;
      if (F = gXd, H = "column", U = L, t[33] !== S || t[34] !== M.handleKeyDown) {
        N = S ? {} : {
          tabIndex: 0,
          onKeyDown: M.handleKeyDown
        };
        t[33] = S;
        t[34] = M.handleKeyDown;
        t[35] = N;
      } else {
        N = t[35];
      }
      P = gXd;
      W = "column";
      j = M.visibleOptions.map((Q, Z) => {
        let ne = !S && M.focusedValue === Q.value && !M.isSubmitFocused;
        let oe = M.selectedValues.includes(Q.value);
        let ee = Q.index === M.visibleFromIndex;
        let re = Q.index === M.visibleToIndex - 1;
        let se = M.visibleToIndex < o.length;
        let ae = M.visibleFromIndex > 0;
        let de = M.visibleFromIndex + Z + 1;
        if (Q.type === "input") {
          let be = M.inputValues.get(Q.value) || "";
          return KM.jsx(gXd, {
            gap: 1,
            children: KM.jsx(put, {
              option: Q,
              isFocused: ne,
              isSelected: false,
              shouldShowDownArrow: se && re,
              shouldShowUpArrow: ae && ee,
              maxIndexWidth: J,
              index: de,
              inputValue: be,
              onInputChange: fe => {
                M.updateInputValue(Q.value, fe);
              },
              onSubmit: Tjm,
              onExit: () => {
                i();
              },
              layout: "compact",
              onOpenEditor: h,
              onImagePaste: y,
              pastedContents: _,
              onRemoveImage: b,
              extraChromeWidth: 4,
              children: KM.jsxs(Text, {
                color: oe ? "success" : undefined,
                children: ["[", oe ? vGd.tick : " ", "]", " "]
              })
            })
          }, String(Q.value));
        }
        return KM.jsx(gXd, {
          gap: 1,
          children: KM.jsxs(nOe, {
            isFocused: ne,
            isSelected: false,
            shouldShowDownArrow: se && re,
            shouldShowUpArrow: ae && ee,
            description: Q.description,
            children: [!A && KM.jsx(Text, {
              dimColor: true,
              children: `${de}.`.padEnd(J)
            }), KM.jsxs(Text, {
              color: oe ? "success" : undefined,
              children: ["[", oe ? vGd.tick : " ", "]"]
            }), KM.jsx(Text, {
              color: ne ? "suggestion" : undefined,
              children: Q.label
            })]
          })
        }, String(Q.value));
      });
      t[17] = A;
      t[18] = S;
      t[19] = i;
      t[20] = y;
      t[21] = h;
      t[22] = b;
      t[23] = o.length;
      t[24] = _;
      t[25] = M;
      t[26] = P;
      t[27] = F;
      t[28] = H;
      t[29] = U;
      t[30] = N;
      t[31] = W;
      t[32] = j;
    } else {
      P = t[26];
      F = t[27];
      H = t[28];
      U = t[29];
      N = t[30];
      W = t[31];
      j = t[32];
    }
    let z;
    if (t[36] !== P || t[37] !== W || t[38] !== j) {
      z = KM.jsx(P, {
        flexDirection: W,
        children: j
      });
      t[36] = P;
      t[37] = W;
      t[38] = j;
      t[39] = z;
    } else {
      z = t[39];
    }
    let V;
    if (t[40] !== d || t[41] !== M.isSubmitFocused || t[42] !== u) {
      V = u && d && KM.jsxs(gXd, {
        marginTop: 0,
        gap: 1,
        children: [M.isSubmitFocused ? KM.jsx(Text, {
          color: "suggestion",
          children: vGd.pointer
        }) : KM.jsx(Text, {
          children: " "
        }), KM.jsx(gXd, {
          marginLeft: 3,
          children: KM.jsx(Text, {
            color: M.isSubmitFocused ? "suggestion" : undefined,
            bold: true,
            children: u
          })
        })]
      });
      t[40] = d;
      t[41] = M.isSubmitFocused;
      t[42] = u;
      t[43] = V;
    } else {
      V = t[43];
    }
    let K;
    if (t[44] !== F || t[45] !== H || t[46] !== U || t[47] !== N || t[48] !== z || t[49] !== V) {
      K = KM.jsxs(F, {
        flexDirection: H,
        ref: U,
        ...N,
        children: [z, V]
      });
      t[44] = F;
      t[45] = H;
      t[46] = U;
      t[47] = N;
      t[48] = z;
      t[49] = V;
      t[50] = K;
    } else {
      K = t[50];
    }
    return K;
  }
  function Tjm() {}
  function Ejm(e) {
    return e.description;
  }
  var gjo;
  var jjl;
  var KM;
  var MQt = __lazy(() => {
    Oue();
    et();
    rFn();
    $c();
    Ooo();
    sFn();
    Hjl();
    gjo = __toESM(pt(), 1);
    jjl = __toESM(ot(), 1);
    KM = __toESM(ie(), 1);
  });
  var OS = __lazy(() => {
    MQt();
    $c();
  });
  function xvt(e) {
    let t = qjl.c(88);
    let {
      onThemeSelect: n,
      showIntroText: r,
      helpText: o,
      showHelpTextBelow: s,
      hideEscToCancel: i,
      skipExitHandling: a,
      onCancel: l,
      onCustomTheme: c
    } = e;
    let u = r === undefined ? false : r;
    let d = o === undefined ? "" : o;
    let p = s === undefined ? false : s;
    let m = i === undefined ? false : i;
    let f = a === undefined ? false : a;
    let [h] = useTheme();
    let g = useThemeSetting();
    let {
      columns: y
    } = Sr();
    let _;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      _ = vGt();
      t[0] = _;
    } else {
      _ = t[0];
    }
    let b = _;
    let S;
    if (t[1] !== h) {
      S = b === null ? gPa(h) : null;
      t[1] = h;
      t[2] = S;
    } else {
      S = t[2];
    }
    let E = S;
    let {
      setPreviewTheme: C,
      savePreview: x,
      cancelPreview: A
    } = usePreviewTheme();
    let k = bt(Cjm) ?? false;
    let I = Lo();
    KLn("ThemePicker");
    let O = Zu("theme:toggleSyntaxHighlighting", "ThemePicker", "ctrl+t");
    let M;
    if (t[3] !== I || t[4] !== k) {
      M = () => {
        if (b === null) {
          let Ze = !k;
          updateSettingsForSource("userSettings", {
            syntaxHighlightingDisabled: Ze
          });
          I(Tt => ({
            ...Tt,
            settings: {
              ...Tt.settings,
              syntaxHighlightingDisabled: Ze
            }
          }));
        }
      };
      t[3] = I;
      t[4] = k;
      t[5] = M;
    } else {
      M = t[5];
    }
    let L;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      L = {
        context: "ThemePicker"
      };
      t[6] = L;
    } else {
      L = t[6];
    }
    uo("theme:toggleSyntaxHighlighting", M, L);
    let P = Eg(f ? wjm : undefined);
    let {
      customThemes: F
    } = useCustomThemes();
    let [H, U] = Wjl.useState(g);
    let N;
    if (t[7] !== H) {
      N = tG(H);
      t[7] = H;
      t[8] = N;
    } else {
      N = t[8];
    }
    let W = N;
    let j;
    if (t[9] !== F || t[10] !== W) {
      j = W ? F.find(Ze => Ze.slug === W) : undefined;
      t[9] = F;
      t[10] = W;
      t[11] = j;
    } else {
      j = t[11];
    }
    let z = j;
    let V = Zu("theme:editCustom", "ThemePicker", "ctrl+e");
    let K;
    if (t[12] !== z || t[13] !== c || t[14] !== x) {
      K = () => {
        if (z && c) {
          x();
          c(z);
        }
      };
      t[12] = z;
      t[13] = c;
      t[14] = x;
      t[15] = K;
    } else {
      K = t[15];
    }
    let J;
    if (t[16] === Symbol.for("react.memo_cache_sentinel")) {
      J = {
        context: "ThemePicker"
      };
      t[16] = J;
    } else {
      J = t[16];
    }
    uo("theme:editCustom", K, J);
    let Q;
    let Z;
    let ne;
    let oe;
    let ee;
    let re;
    let se;
    if (t[17] === Symbol.for("react.memo_cache_sentinel")) {
      Q = {
        label: "Auto (match terminal)",
        value: "auto"
      };
      Z = {
        label: "Dark mode",
        value: "dark"
      };
      ne = {
        label: "Light mode",
        value: "light"
      };
      oe = {
        label: "Dark mode (colorblind-friendly)",
        value: "dark-daltonized"
      };
      ee = {
        label: "Light mode (colorblind-friendly)",
        value: "light-daltonized"
      };
      re = {
        label: "Dark mode (ANSI colors only)",
        value: "dark-ansi"
      };
      se = {
        label: "Light mode (ANSI colors only)",
        value: "light-ansi"
      };
      t[17] = Q;
      t[18] = Z;
      t[19] = ne;
      t[20] = oe;
      t[21] = ee;
      t[22] = re;
      t[23] = se;
    } else {
      Q = t[17];
      Z = t[18];
      ne = t[19];
      oe = t[20];
      ee = t[21];
      re = t[22];
      se = t[23];
    }
    let ae;
    if (t[24] !== F || t[25] !== c) {
      let Ze;
      if (t[27] !== c) {
        Ze = c ? [{
          label: "New custom theme\u2026",
          value: "__new_custom_theme__"
        }] : [];
        t[27] = c;
        t[28] = Ze;
      } else {
        Ze = t[28];
      }
      ae = [Q, Z, ne, oe, ee, re, se, ...F.map(vjm), ...Ze];
      t[24] = F;
      t[25] = c;
      t[26] = ae;
    } else {
      ae = t[26];
    }
    let de = ae;
    let be;
    if (t[29] !== u) {
      be = u ? wT.jsx(Text, {
        children: "Let's get started."
      }) : wT.jsx(Text, {
        bold: true,
        color: "permission",
        children: "Theme"
      });
      t[29] = u;
      t[30] = be;
    } else {
      be = t[30];
    }
    let fe;
    if (t[31] === Symbol.for("react.memo_cache_sentinel")) {
      fe = wT.jsx(Text, {
        bold: true,
        children: "Choose the text style that looks best with your terminal"
      });
      t[31] = fe;
    } else {
      fe = t[31];
    }
    let me;
    if (t[32] !== d || t[33] !== p) {
      me = d && !p && wT.jsx(Text, {
        dimColor: true,
        children: d
      });
      t[32] = d;
      t[33] = p;
      t[34] = me;
    } else {
      me = t[34];
    }
    let Te;
    if (t[35] !== me) {
      Te = wT.jsxs(gXd, {
        flexDirection: "column",
        children: [fe, me]
      });
      t[35] = me;
      t[36] = Te;
    } else {
      Te = t[36];
    }
    let ue;
    if (t[37] !== A || t[38] !== C) {
      ue = Ze => {
        if (U(Ze), Ze === "__new_custom_theme__") {
          A();
        } else {
          C(Ze);
        }
      };
      t[37] = A;
      t[38] = C;
      t[39] = ue;
    } else {
      ue = t[39];
    }
    let ce;
    if (t[40] !== A || t[41] !== c || t[42] !== n || t[43] !== x) {
      ce = Ze => {
        if (Ze === "__new_custom_theme__") {
          A();
          c?.(undefined);
          return;
        }
        x();
        n(Ze);
      };
      t[40] = A;
      t[41] = c;
      t[42] = n;
      t[43] = x;
      t[44] = ce;
    } else {
      ce = t[44];
    }
    let le;
    if (t[45] !== A || t[46] !== l || t[47] !== f) {
      le = f ? () => {
        A();
        l?.();
      } : async () => {
        A();
        await gracefulShutdown(0);
      };
      t[45] = A;
      t[46] = l;
      t[47] = f;
      t[48] = le;
    } else {
      le = t[48];
    }
    let pe = Math.min(de.length, 12);
    let ve;
    if (t[49] !== ue || t[50] !== ce || t[51] !== le || t[52] !== pe || t[53] !== de || t[54] !== g) {
      ve = wT.jsx(xr, {
        options: de,
        onFocus: ue,
        onChange: ce,
        onCancel: le,
        visibleOptionCount: pe,
        defaultValue: g,
        defaultFocusValue: g
      });
      t[49] = ue;
      t[50] = ce;
      t[51] = le;
      t[52] = pe;
      t[53] = de;
      t[54] = g;
      t[55] = ve;
    } else {
      ve = t[55];
    }
    let _e;
    if (t[56] !== be || t[57] !== Te || t[58] !== ve) {
      _e = wT.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [be, Te, ve]
      });
      t[56] = be;
      t[57] = Te;
      t[58] = ve;
      t[59] = _e;
    } else {
      _e = t[59];
    }
    let xe;
    if (t[60] === Symbol.for("react.memo_cache_sentinel")) {
      xe = {
        oldStart: 1,
        newStart: 1,
        oldLines: 3,
        newLines: 3,
        lines: [" function greet() {", '-  console.log("Hello, World!");', '+  console.log("Hello, Claude!");', " }"]
      };
      t[60] = xe;
    } else {
      xe = t[60];
    }
    let ke;
    if (t[61] !== y) {
      ke = wT.jsx(x3, {
        paddingX: 0,
        children: wT.jsx(Xde, {
          patch: xe,
          dim: false,
          filePath: "demo.js",
          firstLine: null,
          width: y
        })
      });
      t[61] = y;
      t[62] = ke;
    } else {
      ke = t[62];
    }
    let Ie = b === "env" ? `Syntax highlighting disabled (via CLAUDE_CODE_SYNTAX_HIGHLIGHT=${process.env.CLAUDE_CODE_SYNTAX_HIGHLIGHT})` : k ? `Syntax highlighting disabled (${O} to enable)` : E ? `Syntax theme: ${E.theme}${E.source ? ` (from ${E.source})` : ""} (${O} to disable)` : `Syntax highlighting enabled (${O} to disable)`;
    let Ue;
    if (t[63] !== Ie) {
      Ue = wT.jsxs(Text, {
        dimColor: true,
        children: [" ", Ie]
      });
      t[63] = Ie;
      t[64] = Ue;
    } else {
      Ue = t[64];
    }
    let Ge;
    if (t[65] !== ke || t[66] !== Ue) {
      Ge = wT.jsxs(gXd, {
        flexDirection: "column",
        width: "100%",
        children: [ke, Ue]
      });
      t[65] = ke;
      t[66] = Ue;
      t[67] = Ge;
    } else {
      Ge = t[67];
    }
    let Be;
    if (t[68] !== _e || t[69] !== Ge) {
      Be = wT.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [_e, Ge]
      });
      t[68] = _e;
      t[69] = Ge;
      t[70] = Be;
    } else {
      Be = t[70];
    }
    let We = Be;
    if (!u) {
      let Ze;
      if (t[71] !== We) {
        Ze = wT.jsx(gXd, {
          flexDirection: "column",
          children: We
        });
        t[71] = We;
        t[72] = Ze;
      } else {
        Ze = t[72];
      }
      let Tt;
      if (t[73] !== d || t[74] !== p) {
        Tt = p && d && wT.jsx(gXd, {
          marginLeft: 3,
          children: wT.jsx(Text, {
            dimColor: true,
            children: d
          })
        });
        t[73] = d;
        t[74] = p;
        t[75] = Tt;
      } else {
        Tt = t[75];
      }
      let kt;
      if (t[76] !== V || t[77] !== P || t[78] !== z || t[79] !== m || t[80] !== c) {
        kt = !m && wT.jsx(gXd, {
          children: wT.jsx(Text, {
            dimColor: true,
            italic: true,
            children: P.pending ? wT.jsxs(wT.Fragment, {
              children: ["Press ", P.keyName, " again to exit"]
            }) : wT.jsxs(Hn, {
              children: [wT.jsx(xt, {
                chord: "enter",
                action: "select"
              }), z && c && wT.jsx(xt, {
                chord: V,
                action: "edit"
              }), wT.jsx(xt, {
                chord: "escape",
                action: "cancel"
              })]
            })
          })
        });
        t[76] = V;
        t[77] = P;
        t[78] = z;
        t[79] = m;
        t[80] = c;
        t[81] = kt;
      } else {
        kt = t[81];
      }
      let Ye;
      if (t[82] !== Tt || t[83] !== kt) {
        Ye = wT.jsxs(gXd, {
          marginTop: 1,
          children: [Tt, kt]
        });
        t[82] = Tt;
        t[83] = kt;
        t[84] = Ye;
      } else {
        Ye = t[84];
      }
      let ht;
      if (t[85] !== Ze || t[86] !== Ye) {
        ht = wT.jsxs(wT.Fragment, {
          children: [Ze, Ye]
        });
        t[85] = Ze;
        t[86] = Ye;
        t[87] = ht;
      } else {
        ht = t[87];
      }
      return ht;
    }
    return We;
  }
  function vjm(e) {
    return {
      label: e.source === "user" ? `${e.name} (custom)` : `${e.name} (from ${e.source.plugin})`,
      value: SWe(e.slug)
    };
  }
  function wjm() {}
  function Cjm(e) {
    return e.settings.syntaxHighlightingDisabled;
  }
  var qjl;
  var Wjl;
  var wT;
  var Msr = __lazy(() => {
    mO();
    ki();
    et();
    yq();
    Bs();
    c0();
    ho();
    Qbe();
    lm();
    OS();
    Ai();
    Vze();
    bs();
    Oqn();
    Amt();
    qjl = __toESM(pt(), 1);
    Wjl = __toESM(ot(), 1);
    wT = __toESM(ie(), 1);
  });
  function Rjm() {
    let e = getCachedClientData()?.model_notices;
    if (typeof e !== "object" || e === null || Array.isArray(e)) {
      return {};
    }
    let t = {};
    for (let [n, r] of Object.entries(e)) {
      if (n.trim().length > 0 && typeof r === "string" && r.length > 0) {
        t[n] = r;
      }
    }
    return t;
  }
  function Gjl(e) {
    let t = Rjm();
    if (Object.keys(t).length === 0) {
      return;
    }
    let n = e.toLowerCase();
    let r = parseUserSpecifiedModel(e).toLowerCase();
    let o = getCanonicalName(r).toLowerCase();
    for (let [s, i] of Object.entries(t)) {
      let a = s.toLowerCase();
      if (a === n || a === r || a === o || r.includes(a)) {
        return i;
      }
    }
    return;
  }
  var Vjl = __lazy(() => {
    Eo();
  });
  function zjl(e, t, n) {
    if (n || !sx(t)) {
      return;
    }
    return r1(t, e);
  }
  function Kjl(e, t = false) {
    if (!e) {
      return;
    }
    if (t) {
      return `${"\u2726"} ultracode \xB7 xhigh effort + dynamic workflows for maximum thoroughness`;
    }
    return `${_jo(e)} ${e} \xB7 /effort`;
  }
  function _jo(e) {
    switch (e) {
      case "low":
        return "\u25CB";
      case "medium":
        return "\u25D0";
      case "high":
        return "\u25CF";
      case "xhigh":
        return "\u25C9";
      case "max":
        return "\u25C8";
      default:
        return "\u25CF";
    }
  }
  function Yjl(e) {
    if (e) {
      let t = B2(uc("theme", "dark").value);
      return color("effortUltra", t)("ultracode");
    }
    return;
  }
  function Jjl(e) {
    let t = e.filter(Boolean).join("  ") || undefined;
    return t ? {
      content: ` ${t} `,
      position: "top",
      align: "end",
      offset: 0
    } : undefined;
  }
  var bjo = __lazy(() => {
    wl();
    Fp();
    zg();
    NJ();
    APe();
  });
  function nUe(e) {
    let t = Tjo.c(113);
    let {
      initial: n,
      sessionModel: r,
      onSelect: o,
      onSetDefault: s,
      onCancel: i,
      isStandaloneCommand: a,
      showFastModeNotice: l,
      headerText: c,
      options: u,
      skipSettingsWrite: d
    } = e;
    let p = Lo();
    let m = bt(Djm);
    let f;
    if (t[0] !== m || t[1] !== u) {
      f = u ?? F9e(m ?? false);
      t[0] = m;
      t[1] = u;
      t[2] = f;
    } else {
      f = t[2];
    }
    let h = f;
    let g;
    if (t[3] !== n || t[4] !== h) {
      g = n === null ? "__NO_PREFERENCE__" : tha(h, n) ?? n;
      t[3] = n;
      t[4] = h;
      t[5] = g;
    } else {
      g = t[5];
    }
    let y = g;
    let [_, b] = tUe.useState(y);
    let [S] = useTheme();
    let [E, C] = tUe.useState(false);
    let x = bt(Ojm);
    let A = bt(Pjm);
    let k;
    if (t[6] !== x || t[7] !== A) {
      k = A ? "ultracode" : x !== undefined ? Fbe(x) : undefined;
      t[6] = x;
      t[7] = A;
      t[8] = k;
    } else {
      k = t[8];
    }
    let [I, O] = tUe.useState(k);
    let M;
    if (t[9] !== n || t[10] !== y || t[11] !== h) {
      e: {
        if (n !== null && !h.some(Re => Re.value === y) && isModelAllowed(n)) {
          let Re = {
            value: n,
            label: modelDisplayString(n),
            description: "Current model"
          };
          let Ce = h.findIndex(Ijm);
          if (Ce === -1) {
            M = [...h, Re];
            break e;
          }
          M = [...h.slice(0, Ce), Re, ...h.slice(Ce)];
          break e;
        }
        M = h;
      }
      t[9] = n;
      t[10] = y;
      t[11] = h;
      t[12] = M;
    } else {
      M = t[12];
    }
    let L = M;
    let P;
    if (t[13] !== L || t[14] !== S) {
      let Re;
      if (t[16] !== S) {
        Re = Ce => {
          let Fe = Ce.value === null ? "__NO_PREFERENCE__" : Ce.value;
          let Xe = Nsr(Fe);
          let He = Xe ? Gjl(Xe) : undefined;
          let mt = ((He ? Ce.description ? `${Ce.description} \xB7 ${He}` : He : Ce.description) ?? "").replaceAll("Fable 5", color("claude", S)("Fable 5")).replaceAll("Mythos 5", color("claude", S)("Mythos 5")).replaceAll("Sonnet 5", color("claude", S)("Sonnet 5")).replace(/\$[\d.]+\/\$[\d.]+ per Mtok/, Dt => Ce.promoListPrice ? `${_$u.dim.strikethrough(Ce.promoListPrice)} ${Dt}` : Dt);
          return {
            ...Ce,
            value: Fe,
            description: mt
          };
        };
        t[16] = S;
        t[17] = Re;
      } else {
        Re = t[17];
      }
      P = L.map(Re);
      t[13] = L;
      t[14] = S;
      t[15] = P;
    } else {
      P = t[15];
    }
    let F = P;
    let H;
    if (t[18] !== y || t[19] !== F) {
      H = F.some(Re => Re.value === y) ? y : F[0]?.value ?? undefined;
      t[18] = y;
      t[19] = F;
      t[20] = H;
    } else {
      H = t[20];
    }
    let U = H;
    let N = Math.min(10, F.length);
    let W = Math.max(0, F.length - N);
    let j;
    if (t[21] !== _ || t[22] !== F) {
      let Re;
      if (t[24] !== _) {
        Re = Ce => Ce.value === _;
        t[24] = _;
        t[25] = Re;
      } else {
        Re = t[25];
      }
      j = F.find(Re);
      t[21] = _;
      t[22] = F;
      t[23] = j;
    } else {
      j = t[23];
    }
    let z = j;
    let V = z?.label;
    let K = z?.disabled === true;
    let J;
    if (t[26] !== _) {
      J = Nsr(_);
      t[26] = _;
      t[27] = J;
    } else {
      J = t[27];
    }
    let Q = J;
    let [, Z] = tUe.useReducer(Ajm, 0);
    let ne;
    if (t[28] !== Z || t[29] !== Q) {
      ne = () => {
        if (!Q?.includes("application-inference-profile")) {
          return;
        }
        let Re = false;
        QAe(Q).then(() => {
          if (!Re) {
            Z();
          }
        });
        return () => {
          Re = true;
        };
      };
      t[28] = Z;
      t[29] = Q;
      t[30] = ne;
    } else {
      ne = t[30];
    }
    let oe;
    if (t[31] !== Q) {
      oe = [Q];
      t[31] = Q;
      t[32] = oe;
    } else {
      oe = t[32];
    }
    tUe.useEffect(ne, oe);
    let ee;
    if (t[33] !== Q) {
      ee = Q ? sx(Q) : false;
      t[33] = Q;
      t[34] = ee;
    } else {
      ee = t[34];
    }
    let re = ee;
    let se;
    if (t[35] !== Q) {
      se = Q ? BIe(Q) && tWe("max", Q) : false;
      t[35] = Q;
      t[36] = se;
    } else {
      se = t[36];
    }
    let ae = se;
    let de;
    if (t[37] !== Q) {
      de = Q ? Yne(Q) && tWe("xhigh", Q) : false;
      t[37] = Q;
      t[38] = de;
    } else {
      de = t[38];
    }
    let be = de;
    let fe;
    if (t[39] !== Q) {
      fe = Q ? B8(Q) : false;
      t[39] = Q;
      t[40] = fe;
    } else {
      fe = t[40];
    }
    let me = fe;
    let Te;
    if (t[41] !== Q) {
      Te = Q ? Lbe(Q) : ["low", "medium", "high"];
      t[41] = Q;
      t[42] = Te;
    } else {
      Te = t[42];
    }
    let ue = Te;
    let ce;
    if (t[43] !== Q || t[44] !== _) {
      let Re = Sjo(_);
      ce = Q ? $Ie(Re, Q) : Re;
      t[43] = Q;
      t[44] = _;
      t[45] = ce;
    } else {
      ce = t[45];
    }
    let le = ce;
    let pe;
    if (t[46] !== Q || t[47] !== E) {
      pe = !E && !!Q && rWe(Q);
      t[46] = Q;
      t[47] = E;
      t[48] = pe;
    } else {
      pe = t[48];
    }
    let ve = pe;
    let _e = ve ? le : I === "ultracode" && !me ? ae ? "max" : "high" : I === "max" && !ae || I === "xhigh" && !be ? "high" : I;
    let xe;
    if (t[49] !== Q || t[50] !== _e) {
      xe = Q && _e !== undefined && _e !== "ultracode" ? $Ie(_e, Q) : _e;
      t[49] = Q;
      t[50] = _e;
      t[51] = xe;
    } else {
      xe = t[51];
    }
    let ke = xe;
    let Ie;
    if (t[52] !== x || t[53] !== E) {
      Ie = Re => {
        if (b(Re), !E && x === undefined) {
          O(Sjo(Re));
        }
      };
      t[52] = x;
      t[53] = E;
      t[54] = Ie;
    } else {
      Ie = t[54];
    }
    let Ue = Ie;
    let Ge;
    if (t[55] !== ue || t[56] !== le || t[57] !== ve || t[58] !== K || t[59] !== re || t[60] !== ae || t[61] !== me || t[62] !== be) {
      Ge = Re => {
        if (!re || K) {
          return;
        }
        O(Ce => Mjm(ve ? le : Ce ?? le, Re, ue, ae, be, me));
        C(true);
      };
      t[55] = ue;
      t[56] = le;
      t[57] = ve;
      t[58] = K;
      t[59] = re;
      t[60] = ae;
      t[61] = me;
      t[62] = be;
      t[63] = Ge;
    } else {
      Ge = t[63];
    }
    let Be = Ge;
    let We;
    let Ze;
    if (t[64] !== Be) {
      We = () => Be("left");
      Ze = () => Be("right");
      t[64] = Be;
      t[65] = We;
      t[66] = Ze;
    } else {
      We = t[65];
      Ze = t[66];
    }
    let Tt;
    if (t[67] === Symbol.for("react.memo_cache_sentinel")) {
      Tt = {
        context: "ModelPicker"
      };
      t[67] = Tt;
    } else {
      Tt = t[67];
    }
    jo({
      "modelPicker:decreaseEffort": We,
      "modelPicker:increaseEffort": Ze,
      "modelPicker:thisSessionOnly": () => {
        if (!s || _ === undefined) {
          return;
        }
        if (K) {
          return;
        }
        kt(_);
      }
    }, Tt);
    function kt(Re) {
      let Ce = Nsr(Re);
      let Fe = Ce && I !== undefined && I !== "ultracode" ? $Ie(I, Ce) : I;
      if (logEvent("tengu_model_command_menu_effort", {
        effort: Fe == null ? undefined : Fe
      }), Fe === "ultracode" && E && !d) {
        eq();
        p(kjm);
      } else if (!d && E) {
        let He = o3i(Fe === "ultracode" ? "xhigh" : Fe, Sjo(Re), getSettingsForSource("userSettings")?.effortLevel, E);
        let Gt = HIe(He);
        if (Gt !== undefined) {
          updateSettingsForSource("userSettings", {
            effortLevel: Gt
          });
        }
        eq();
        p(mt => ({
          ...mt,
          effortValue: He,
          ultracode: false
        }));
      }
      let Xe = E && Ce && sx(Ce) && Fe !== "ultracode" ? Fe : undefined;
      if (Re === "__NO_PREFERENCE__") {
        o(null, Xe);
        return;
      }
      o(Re, Xe);
    }
    let Ye;
    if (t[68] === Symbol.for("react.memo_cache_sentinel")) {
      Ye = rg.jsx(Text, {
        color: "remember",
        bold: true,
        children: "Select model"
      });
      t[68] = Ye;
    } else {
      Ye = t[68];
    }
    let ht = c ?? "Switch between Claude models. Your pick becomes the default for new sessions. For other/previous model names, specify with --model.";
    let It;
    if (t[69] !== ht) {
      It = rg.jsx(Text, {
        dimColor: true,
        children: ht
      });
      t[69] = ht;
      t[70] = It;
    } else {
      It = t[70];
    }
    let Rt;
    if (t[71] !== r) {
      Rt = r && rg.jsxs(Text, {
        dimColor: true,
        children: ["Currently using ", modelDisplayString(r), " for this session only. Selecting a model will undo this."]
      });
      t[71] = r;
      t[72] = Rt;
    } else {
      Rt = t[72];
    }
    let wt;
    if (t[73] !== It || t[74] !== Rt) {
      wt = rg.jsxs(gXd, {
        marginBottom: 1,
        flexDirection: "column",
        children: [Ye, It, Rt]
      });
      t[73] = It;
      t[74] = Rt;
      t[75] = wt;
    } else {
      wt = t[75];
    }
    let vt;
    if (t[76] !== kt || t[77] !== s) {
      vt = Re => {
        if (s) {
          s(Re === "__NO_PREFERENCE__" ? null : Re);
        }
        kt(Re);
      };
      t[76] = kt;
      t[77] = s;
      t[78] = vt;
    } else {
      vt = t[78];
    }
    let yt = i ?? xjm;
    let gt;
    if (t[79] !== Ue || t[80] !== U || t[81] !== y || t[82] !== F || t[83] !== vt || t[84] !== yt || t[85] !== N) {
      gt = rg.jsx(gXd, {
        flexDirection: "column",
        children: rg.jsx(xr, {
          defaultValue: y,
          defaultFocusValue: U,
          options: F,
          onChange: vt,
          onFocus: Ue,
          onCancel: yt,
          visibleOptionCount: N
        })
      });
      t[79] = Ue;
      t[80] = U;
      t[81] = y;
      t[82] = F;
      t[83] = vt;
      t[84] = yt;
      t[85] = N;
      t[86] = gt;
    } else {
      gt = t[86];
    }
    let Ft;
    if (t[87] !== W) {
      Ft = W > 0 && rg.jsx(gXd, {
        paddingLeft: 3,
        children: rg.jsx(B1, {
          count: W,
          unit: "model"
        })
      });
      t[87] = W;
      t[88] = Ft;
    } else {
      Ft = t[88];
    }
    let on;
    if (t[89] !== gt || t[90] !== Ft) {
      on = rg.jsxs(gXd, {
        flexDirection: "column",
        marginBottom: 1,
        children: [gt, Ft]
      });
      t[89] = gt;
      t[90] = Ft;
      t[91] = on;
    } else {
      on = t[91];
    }
    let rn;
    if (t[92] !== ke || t[93] !== le || t[94] !== V || t[95] !== K || t[96] !== re) {
      rn = !K && rg.jsx(gXd, {
        marginBottom: 1,
        flexDirection: "column",
        children: re ? rg.jsxs(rg.Fragment, {
          children: [rg.jsxs(Text, {
            dimColor: true,
            children: [rg.jsx(Xjl, {
              effort: ke
            }), " ", ke === "xhigh" ? "xHigh" : ke ? bjp(ke) : "", " ", "effort", ke === le ? " (default)" : "", " ", rg.jsx(Text, {
              color: "subtle",
              children: rg.jsx(xt, {
                chord: ["left", "right"],
                action: "adjust"
              })
            })]
          }), ke === "max" ? rg.jsx(Text, {
            color: "subtle",
            children: "May use excessive tokens resulting in long response times or overthinking. Use sparingly for the hardest tasks."
          }) : null]
        }) : rg.jsxs(Text, {
          color: "subtle",
          children: [rg.jsx(Xjl, {
            effort: undefined
          }), " Effort not supported", V ? ` for ${V}` : ""]
        })
      });
      t[92] = ke;
      t[93] = le;
      t[94] = V;
      t[95] = K;
      t[96] = re;
      t[97] = rn;
    } else {
      rn = t[97];
    }
    let Sn;
    if (t[98] !== l) {
      Sn = lc() ? l ? rg.jsx(gXd, {
        marginBottom: 1,
        children: rg.jsxs(Text, {
          dimColor: true,
          children: ["Fast mode is ", rg.jsx(Text, {
            bold: true,
            children: "ON"
          }), " and available with", " ", vW(), " (/fast). Switching to other models turns off fast mode."]
        })
      }) : zA() && !zle() ? rg.jsx(gXd, {
        marginBottom: 1,
        children: rg.jsxs(Text, {
          dimColor: true,
          children: ["Use ", rg.jsx(Text, {
            bold: true,
            children: "/fast"
          }), " to turn on Fast mode (", vW(), ")."]
        })
      }) : null : null;
      t[98] = l;
      t[99] = Sn;
    } else {
      Sn = t[99];
    }
    let jn;
    if (t[100] !== wt || t[101] !== on || t[102] !== rn || t[103] !== Sn) {
      jn = rg.jsxs(gXd, {
        flexDirection: "column",
        children: [wt, on, rn, Sn]
      });
      t[100] = wt;
      t[101] = on;
      t[102] = rn;
      t[103] = Sn;
      t[104] = jn;
    } else {
      jn = t[104];
    }
    let Xr;
    if (t[105] !== a || t[106] !== s) {
      Xr = a && rg.jsx(Lw, {
        children: rg.jsxs(Hn, {
          children: [rg.jsx(xt, {
            chord: "enter",
            action: s ? "set as default" : "confirm"
          }), s && rg.jsx(xt, {
            chord: "s",
            action: "use this session only"
          }), rg.jsx(Wr, {
            action: "select:cancel",
            context: "Select",
            fallback: "Esc",
            description: "cancel"
          })]
        })
      });
      t[105] = a;
      t[106] = s;
      t[107] = Xr;
    } else {
      Xr = t[107];
    }
    let co;
    if (t[108] !== jn || t[109] !== Xr) {
      co = rg.jsxs(gXd, {
        flexDirection: "column",
        children: [jn, Xr]
      });
      t[108] = jn;
      t[109] = Xr;
      t[110] = co;
    } else {
      co = t[110];
    }
    let Yt = co;
    if (!a) {
      return Yt;
    }
    let Ee;
    if (t[111] !== Yt) {
      Ee = rg.jsx(Td, {
        color: "permission",
        children: Yt
      });
      t[111] = Yt;
      t[112] = Ee;
    } else {
      Ee = t[112];
    }
    return Ee;
  }
  function xjm() {}
  function kjm(e) {
    return {
      ...e,
      effortValue: "xhigh",
      ultracode: true
    };
  }
  function Ajm(e) {
    return e + 1;
  }
  function Ijm(e) {
    return e.disabled === true;
  }
  function Pjm(e) {
    return e.ultracode;
  }
  function Ojm(e) {
    return e.effortValue;
  }
  function Djm(e) {
    return lc() ? e.fastMode : false;
  }
  function Nsr(e) {
    if (!e) {
      return;
    }
    return e === "__NO_PREFERENCE__" ? getDefaultMainLoopModel() : parseUserSpecifiedModel(e);
  }
  function Xjl(e) {
    let t = Tjo.c(5);
    let {
      effort: n
    } = e;
    let r = n ? "claude" : "subtle";
    let o;
    if (t[0] !== n) {
      o = n === "ultracode" ? "\u2726" : _jo(n ?? "low");
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== r || t[3] !== o) {
      s = rg.jsx(Text, {
        color: r,
        children: o
      });
      t[2] = r;
      t[3] = o;
      t[4] = s;
    } else {
      s = t[4];
    }
    return s;
  }
  function Mjm(e, t, n, r, o, s) {
    let i = n.filter(u => (u !== "max" || r) && (u !== "xhigh" || o));
    if (s) {
      i.push("ultracode");
    }
    let a = e === "ultracode" && !s ? r ? "max" : "high" : e === "max" && !r || e === "xhigh" && !o ? "high" : e;
    let l = i.indexOf(a);
    let c = l !== -1 ? l : i.length - 1;
    if (t === "right") {
      return i[(c + 1) % i.length];
    } else {
      return i[(c - 1 + i.length) % i.length];
    }
  }
  function Sjo(e) {
    let t = Nsr(e) ?? getDefaultMainLoopModel();
    return Fbe(T$t(t));
  }
  var Tjo;
  var tUe;
  var rg;
  var Lsr = __lazy(() => {
    fz();
    Ot();
    GT();
    wl();
    et();
    Bs();
    ho();
    Fp();
    Hle();
    Eo();
    Vjl();
    STe();
    Sd();
    OS();
    Ai();
    bs();
    YX();
    oE();
    bjo();
    Tjo = __toESM(pt(), 1);
    tUe = __toESM(ot(), 1);
    rg = __toESM(ie(), 1);
  });
  var eql = {};
  __export(eql, {
    recordExternalIncludesDecision: () => recordExternalIncludesDecision,
    ClaudeMdExternalIncludesDialog: () => ClaudeMdExternalIncludesDialog
  });
  function recordExternalIncludesDecision(e, t) {
    saveCurrentProjectConfig(n => ({
      ...n,
      hasClaudeMdExternalIncludesApproved: e,
      hasClaudeMdExternalIncludesWarningShown: true
    }));
    logEvent(e ? "tengu_claude_md_external_includes_dialog_accepted" : "tengu_claude_md_external_includes_dialog_declined", {
      source: t
    });
  }
  function ClaudeMdExternalIncludesDialog(e) {
    let t = Qjl.c(17);
    let {
      onDone: n,
      isStandaloneDialog: r,
      externalIncludes: o
    } = e;
    let s;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      s = [];
      t[0] = s;
    } else {
      s = t[0];
    }
    Zjl.useEffect(Ljm, s);
    let i;
    if (t[1] !== n) {
      i = y => {
        recordExternalIncludesDecision(y === "yes", "dialog");
        n();
      };
      t[1] = n;
      t[2] = i;
    } else {
      i = t[2];
    }
    let a = i;
    let l;
    if (t[3] !== a) {
      l = () => {
        a("no");
      };
      t[3] = a;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c = l;
    let u = !r;
    let d = !r;
    let p;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      p = wfe.jsx(Text, {
        children: "This project's CLAUDE.md imports files outside the current working directory. Never allow this for third-party repositories."
      });
      t[5] = p;
    } else {
      p = t[5];
    }
    let m;
    if (t[6] !== o) {
      m = o && o.length > 0 && wfe.jsxs(gXd, {
        flexDirection: "column",
        children: [wfe.jsx(Text, {
          dimColor: true,
          children: "External imports:"
        }), o.map(Njm)]
      });
      t[6] = o;
      t[7] = m;
    } else {
      m = t[7];
    }
    let f;
    if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
      f = wfe.jsxs(Text, {
        dimColor: true,
        children: ["Important: Only use Claude Code with files you trust. Accessing untrusted files may pose security risks", " ", wfe.jsx(Link, {
          url: "https://code.claude.com/docs/en/security"
        }), " "]
      });
      t[8] = f;
    } else {
      f = t[8];
    }
    let h;
    if (t[9] !== a) {
      h = wfe.jsx(mc, {
        confirmLabel: "Yes, allow external imports",
        cancelLabel: "No, disable external imports",
        onConfirm: () => a("yes"),
        onCancel: () => a("no")
      });
      t[9] = a;
      t[10] = h;
    } else {
      h = t[10];
    }
    let g;
    if (t[11] !== c || t[12] !== u || t[13] !== d || t[14] !== m || t[15] !== h) {
      g = wfe.jsxs(or, {
        title: "Allow external CLAUDE.md file imports?",
        color: "warning",
        onCancel: c,
        hideBorder: u,
        hideInputGuide: d,
        children: [p, m, f, h]
      });
      t[11] = c;
      t[12] = u;
      t[13] = d;
      t[14] = m;
      t[15] = h;
      t[16] = g;
    } else {
      g = t[16];
    }
    return g;
  }
  function Njm(e, t) {
    return wfe.jsxs(Text, {
      dimColor: true,
      children: ["  ", e.path]
    }, t);
  }
  function Ljm() {
    logEvent("tengu_claude_md_includes_dialog_shown", {});
  }
  var Qjl;
  var Zjl;
  var wfe;
  var vjo = __lazy(() => {
    Ot();
    et();
    b_();
    Ii();
    Qjl = __toESM(pt(), 1);
    Zjl = __toESM(ot(), 1);
    wfe = __toESM(ie(), 1);
  });
  function nql(e) {
    let t = tql.c(17);
    let {
      currentVersion: n,
      onChoice: r
    } = e;
    let o;
    if (t[0] !== r) {
      o = function (g) {
        r(g);
      };
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    let i;
    if (t[2] !== r) {
      i = function () {
        r("cancel");
      };
      t[2] = r;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a = i;
    let l;
    if (t[4] !== n) {
      l = kvt.jsxs(Text, {
        children: ["The stable channel may have an older version than what you're currently running (", n, ")."]
      });
      t[4] = n;
      t[5] = l;
    } else {
      l = t[5];
    }
    let c;
    if (t[6] === Symbol.for("react.memo_cache_sentinel")) {
      c = kvt.jsx(Text, {
        dimColor: true,
        children: "How would you like to handle this?"
      });
      t[6] = c;
    } else {
      c = t[6];
    }
    let u;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      u = {
        label: "Allow possible downgrade to stable version",
        value: "downgrade"
      };
      t[7] = u;
    } else {
      u = t[7];
    }
    let d = `Stay on current version (${n}) until stable catches up`;
    let p;
    if (t[8] !== d) {
      p = [u, {
        label: d,
        value: "stay"
      }];
      t[8] = d;
      t[9] = p;
    } else {
      p = t[9];
    }
    let m;
    if (t[10] !== s || t[11] !== p) {
      m = kvt.jsx(xr, {
        options: p,
        onChange: s
      });
      t[10] = s;
      t[11] = p;
      t[12] = m;
    } else {
      m = t[12];
    }
    let f;
    if (t[13] !== a || t[14] !== l || t[15] !== m) {
      f = kvt.jsxs(or, {
        title: "Switch to Stable Channel",
        onCancel: a,
        color: "permission",
        hideBorder: true,
        hideInputGuide: true,
        children: [l, c, m]
      });
      t[13] = a;
      t[14] = l;
      t[15] = m;
      t[16] = f;
    } else {
      f = t[16];
    }
    return f;
  }
  var tql;
  var kvt;
  var rql = __lazy(() => {
    et();
    OS();
    Ii();
    tql = __toESM(pt(), 1);
    kvt = __toESM(ie(), 1);
  });
  function oql(e) {
    return Object.entries(e).map(([t, n]) => ({
      label: n?.name ?? Fjm,
      value: t,
      description: n?.description ?? Ujm
    }));
  }
  function iql(e) {
    let t = sql.c(26);
    let {
      initialStyle: n,
      onComplete: r,
      onCancel: o,
      isStandaloneCommand: s
    } = e;
    let i;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      i = [];
      t[0] = i;
    } else {
      i = t[0];
    }
    let [a, l] = LQt.useState(i);
    let [c, u] = LQt.useState(true);
    let d;
    let p;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      d = () => {
        Avt(Nt()).then(A => {
          let k = oql(A);
          l(k);
          u(false);
        }).catch(() => {
          let A = oql(GX);
          l(A);
          u(false);
        });
      };
      p = [];
      t[1] = d;
      t[2] = p;
    } else {
      d = t[1];
      p = t[2];
    }
    LQt.useEffect(d, p);
    let m;
    if (t[3] !== r) {
      m = A => {
        r(A);
      };
      t[3] = r;
      t[4] = m;
    } else {
      m = t[4];
    }
    let f = m;
    let h;
    if (t[5] !== n || t[6] !== c || t[7] !== a) {
      h = !c && Pc("outputStyles") && !a.some(A => A.value === n);
      t[5] = n;
      t[6] = c;
      t[7] = a;
      t[8] = h;
    } else {
      h = t[8];
    }
    let g = h;
    let y = !s;
    let _ = !s;
    let b;
    if (t[9] === Symbol.for("react.memo_cache_sentinel")) {
      b = Owe.jsx(gXd, {
        marginTop: 1,
        children: Owe.jsx(Text, {
          dimColor: true,
          children: "This changes how Claude Code communicates with you"
        })
      });
      t[9] = b;
    } else {
      b = t[9];
    }
    let S;
    if (t[10] !== n || t[11] !== g) {
      S = g && Owe.jsx(Text, {
        dimColor: true,
        children: `Your saved output style "${n}" is a custom style disabled in safe mode \u2014 ${UR()} to use it; selecting a style here replaces it`
      });
      t[10] = n;
      t[11] = g;
      t[12] = S;
    } else {
      S = t[12];
    }
    let E;
    if (t[13] !== f || t[14] !== n || t[15] !== c || t[16] !== a) {
      E = c ? Owe.jsx(Text, {
        dimColor: true,
        children: "Loading output styles\u2026"
      }) : Owe.jsx(xr, {
        options: a,
        onChange: f,
        visibleOptionCount: 10,
        defaultValue: n
      });
      t[13] = f;
      t[14] = n;
      t[15] = c;
      t[16] = a;
      t[17] = E;
    } else {
      E = t[17];
    }
    let C;
    if (t[18] !== E || t[19] !== S) {
      C = Owe.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [b, S, E]
      });
      t[18] = E;
      t[19] = S;
      t[20] = C;
    } else {
      C = t[20];
    }
    let x;
    if (t[21] !== o || t[22] !== C || t[23] !== y || t[24] !== _) {
      x = Owe.jsx(or, {
        title: "Preferred output style",
        onCancel: o,
        hideInputGuide: y,
        hideBorder: _,
        children: C
      });
      t[21] = o;
      t[22] = C;
      t[23] = y;
      t[24] = _;
      t[25] = x;
    } else {
      x = t[25];
    }
    return x;
  }
  var sql;
  var LQt;
  var Owe;
  var aql = __lazy(() => {
    Kq();
    et();
    wb();
    vo();
    gn();
    $c();
    Ii();
    sql = __toESM(pt(), 1);
    LQt = __toESM(ot(), 1);
    Owe = __toESM(ie(), 1);
  });
  function cql(e) {
    let t = lql.c(13);
    let {
      initialLanguage: n,
      onComplete: r,
      onCancel: o
    } = e;
    let [s, i] = wjo.useState(n);
    let [a, l] = wjo.useState((n ?? "").length);
    let c;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      c = {
        context: "Settings"
      };
      t[0] = c;
    } else {
      c = t[0];
    }
    uo("confirm:no", o, c);
    let u;
    if (t[1] !== s || t[2] !== r) {
      u = function () {
        let b = s?.trim();
        r(b || undefined);
      };
      t[1] = s;
      t[2] = r;
      t[3] = u;
    } else {
      u = t[3];
    }
    let d = u;
    let p;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      p = rUe.jsx(Text, {
        children: "Enter your preferred response and voice language:"
      });
      t[4] = p;
    } else {
      p = t[4];
    }
    let m;
    if (t[5] === Symbol.for("react.memo_cache_sentinel")) {
      m = rUe.jsx(Text, {
        children: vGd.pointer
      });
      t[5] = m;
    } else {
      m = t[5];
    }
    let f = s ?? "";
    let h;
    if (t[6] !== a || t[7] !== d || t[8] !== f) {
      h = rUe.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        children: [m, rUe.jsx(Dl, {
          value: f,
          onChange: i,
          onSubmit: d,
          focus: true,
          showCursor: true,
          placeholder: `e.g., Japanese, \u65E5\u672C\u8A9E, Espa\xF1ol${vGd.ellipsis}`,
          columns: 60,
          cursorOffset: a,
          onChangeCursorOffset: l
        })]
      });
      t[6] = a;
      t[7] = d;
      t[8] = f;
      t[9] = h;
    } else {
      h = t[9];
    }
    let g;
    if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
      g = rUe.jsx(Text, {
        dimColor: true,
        children: "Leave empty for default (English)"
      });
      t[10] = g;
    } else {
      g = t[10];
    }
    let y;
    if (t[11] !== h) {
      y = rUe.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [p, h, g]
      });
      t[11] = h;
      t[12] = y;
    } else {
      y = t[12];
    }
    return y;
  }
  var lql;
  var wjo;
  var rUe;
  var uql = __lazy(() => {
    et();
    Bs();
    q_();
    lql = __toESM(pt(), 1);
    wjo = __toESM(ot(), 1);
    rUe = __toESM(ie(), 1);
  });
  function pql(e, t) {
    let n = Math.max(1, Math.floor(t) || 1);
    let r = t > 0 ? MB(e, n, {
      hard: true,
      trim: false
    }) : e;
    let o = [];
    let s = 0;
    let i = -1;
    let a = r.split(`
`);
    for (let l = 0; l < a.length; l++) {
      let c = a[l] ?? "";
      if (c.length === 0) {
        if (i = e.indexOf(`
`, i + 1), i !== -1) {
          let m = i;
          o.push(Bsr({
            text: c,
            startOffset: m,
            isPrecededByNewline: Usr(e, m, l === 0),
            endsWithNewline: true
          }));
        } else {
          let m = e.length;
          o.push(Bsr({
            text: c,
            startOffset: m,
            isPrecededByNewline: Usr(e, m, l === 0),
            endsWithNewline: false
          }));
        }
        continue;
      }
      let u = e.indexOf(c, s);
      if (u === -1) {
        let m = s;
        o.push(Bsr({
          text: c,
          startOffset: m,
          isPrecededByNewline: Usr(e, m, l === 0),
          endsWithNewline: false
        }));
        s = m + c.length;
        continue;
      }
      s = u + c.length;
      let d = u + c.length;
      let p = d < e.length && e[d] === `
`;
      if (p) {
        i = d;
      }
      o.push(Bsr({
        text: c,
        startOffset: u,
        isPrecededByNewline: Usr(e, u, l === 0),
        endsWithNewline: p
      }));
    }
    return Object.freeze({
      text: e,
      columns: n,
      lines: Object.freeze(o)
    });
  }
  function Bjm(e, t) {
    let n = hql(t, 0, Math.max(0, e.lines.length - 1));
    return e.lines[n] ?? {
      text: "",
      startOffset: 0,
      isPrecededByNewline: true,
      endsWithNewline: false
    };
  }
  function mql(e, t) {
    if (e.lines.length === 0) {
      return {
        line: 0,
        column: 0
      };
    }
    let n = hql(t, 0, e.text.length);
    for (let s = 0; s < e.lines.length; s++) {
      let i = e.lines[s];
      let a = e.lines[s + 1];
      if (n >= i.startOffset && (!a || n < a.startOffset)) {
        let l = n - i.startOffset;
        let c;
        if (i.isPrecededByNewline) {
          c = dql(i.text, l);
        } else {
          let u = i.text.length - i.text.trimStart().length;
          if (l < u) {
            c = 0;
          } else {
            c = dql(i.text.slice(u), l - u);
          }
        }
        return {
          line: s,
          column: c
        };
      }
    }
    let r = e.lines.length - 1;
    let o = e.lines[r];
    return {
      line: r,
      column: an(o.text)
    };
  }
  function fql(e, t, n) {
    if (e.lines.length === 0) {
      return 0;
    }
    let r = Bjm(e, t);
    if (r.text.length === 0 && r.endsWithNewline) {
      return r.startOffset;
    }
    let o = r.isPrecededByNewline ? 0 : r.text.length - r.text.trimStart().length;
    let s = $jm(r.text.slice(o), Math.max(0, n)) + o;
    return r.startOffset + s;
  }
  function dql(e, t) {
    if (t <= 0) {
      return 0;
    }
    if (t >= e.length) {
      return an(e);
    }
    return an(e.slice(0, t));
  }
  function $jm(e, t) {
    if (t <= 0 || e.length === 0) {
      return 0;
    }
    let n = 0;
    let r = 0;
    for (let o of e) {
      let s = an(o);
      if (n + s > t) {
        break;
      }
      n += s;
      r += o.length;
    }
    return r;
  }
  function Usr(e, t, n) {
    if (n) {
      return true;
    }
    return t > 0 && e[t - 1] === `
`;
  }
  function Bsr(e) {
    return Object.freeze(e);
  }
  function hql(e, t, n) {
    return e < t ? t : e > n ? n : e;
  }
  var gql = __lazy(() => {
    bc();
    Kge();
  });
  function YM({
    query: e,
    placeholder: t = "Search\u2026",
    isFocused: n,
    isTerminalFocused: r,
    prefix: o = DPs,
    width: s,
    cursorOffset: i,
    borderless: a = false,
    highlights: l = [],
    dimRange: c,
    cursorChar: u,
    prefixDim: d = false,
    prefixColor: p,
    onCursorOffsetChange: m,
    onFocus: f,
    wrapColumns: h
  }) {
    let g = i ?? e.length;
    let y = a ? 0 : 2;
    let _ = a ? 0 : 1;
    let b = `${o} ${e}`;
    let S = o.length + 1;
    let E = Cjo.useMemo(() => pql(b, h ?? 0), [b, h]);
    let C = Cjo.useMemo(wre, []);
    let x = Me.CLAUDE_CODE_ALT_SCREEN_FULL_REPAINT && Me.CLAUDE_CODE_SESSION_KIND !== "bg";
    let A = mql(E, S + g);
    let k = SG({
      line: _ + A.line,
      column: y + A.column,
      active: n,
      visible: u === undefined && !x
    });
    let I = r && !(C && !x && u === undefined);
    return H3.jsx(gXd, {
      ref: k,
      flexShrink: 0,
      borderStyle: a ? undefined : "round",
      borderColor: n ? "suggestion" : undefined,
      borderDimColor: !n,
      paddingX: a ? 0 : 1,
      width: s,
      onClick: m || f ? M => {
        if (!n) {
          f?.();
          return;
        }
        if (!e || !m) {
          return;
        }
        let L = M.localRow - _;
        if (L < 0) {
          return;
        }
        let P = Math.max(0, M.localCol - y);
        let F = fql(E, L, P);
        m(Math.max(0, Math.min(e.length, F - S)));
      } : undefined,
      children: H3.jsxs(Text, {
        dimColor: !n,
        children: [H3.jsx(Text, {
          dimColor: d,
          color: p,
          children: o
        }), " ", n ? e ? Hjm(e, l, c, I ? g : -1, u) : I ? H3.jsxs(H3.Fragment, {
          children: [u ?? H3.jsx(Text, {
            inverse: true,
            children: t.charAt(0)
          }), H3.jsx(Text, {
            dimColor: true,
            children: u ? t : t.slice(1)
          })]
        }) : H3.jsx(Text, {
          dimColor: true,
          children: t
        }) : e ? H3.jsx(Text, {
          children: e
        }) : H3.jsx(Text, {
          children: t
        })]
      })
    });
  }
  function Hjm(e, t, n, r, o) {
    let s = u => t.some(([d, p]) => u >= d && u < p);
    let i = u => !!n && u >= n[0] && u < n[1];
    let a = new Set([0, e.length]);
    for (let [u, d] of t) {
      a.add(u);
      a.add(d);
    }
    if (n) {
      a.add(n[0]);
      a.add(n[1]);
    }
    if (r >= 0) {
      a.add(r);
      a.add(r + 1);
    }
    let l = [...a].sort((u, d) => u - d);
    let c = [];
    for (let u = 0; u < l.length - 1; u++) {
      let d = l[u];
      let p = l[u + 1];
      let m = d < e.length ? e.slice(d, p) : " ";
      if (!m) {
        continue;
      }
      let f = d === r;
      let h = f && m === `
`;
      c.push(f && o ? H3.jsxs(Text, {
        children: [o, h ? `
` : null]
      }, d) : H3.jsx(Text, {
        color: s(d) ? "suggestion" : undefined,
        dimColor: i(d),
        inverse: f,
        children: h ? ` 
` : m
      }, d));
    }
    return c;
  }
  var Cjo;
  var H3;
  var Cfe = __lazy(() => {
    wl();
    dGe();
    et();
    pr();
    GWe();
    gql();
    Cjo = __toESM(ot(), 1);
    H3 = __toESM(ie(), 1);
  });
  function mL() {
    return uc("editorMode", "normal").value === "vim";
  }
  function yql() {
    if (Me.terminal, isShiftEnterKeyBindingInstalled()) {
      return "shift + \u23CE for newline";
    }
    return hasUsedBackslashReturn() ? "\\\u23CE for newline" : "backslash (\\) + return (\u23CE) for newline";
  }
  function _ql(e, t) {
    if (t.ctrl || t.meta) {
      return false;
    }
    if (jjm.vZc(e)) {
      return false;
    }
    return e.length > 0 && !/^\s/.test(e);
  }
  function bql(e) {
    return e.length > 0 && ".,?!:;)]".includes(e.charAt(0));
  }
  var jjm;
  var oUe = __lazy(() => {
    zPe();
    pr();
    zg();
    jjm = new Set(["escape", "return", "enter", "tab", "backspace", "delete", "up", "down", "left", "right", "pageup", "pagedown", "home", "end", "insert", "clear", "center", "undefined", "mouse", "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8", "f9", "f10", "f11", "f12"]);
  });
  function sYe(e, t, n) {
    let r = t;
    for (let o = 0; o < n; o++) {
      let s = qjm(e, r);
      if (s.equals(r)) {
        break;
      }
      r = s;
    }
    return r;
  }
  function qjm(e, t) {
    switch (e) {
      case "h":
        return t.left();
      case "l":
      case " ":
        return t.right();
      case "j":
        return t.downLogicalLine();
      case "k":
        return t.upLogicalLine();
      case "gj":
        return t.down();
      case "gk":
        return t.up();
      case "w":
        return t.nextVimWord();
      case "b":
        return t.prevVimWord();
      case "e":
        return t.endOfVimWord();
      case "W":
        return t.nextWORD();
      case "B":
        return t.prevWORD();
      case "E":
        return t.endOfWORD();
      case "0":
        return t.startOfLogicalLine();
      case "^":
        return t.firstNonBlankInLogicalLine();
      case "$":
        return t.lastCharInLogicalLine();
      case "G":
        return t.startOfLastLine();
      default:
        return t;
    }
  }
  function Rjo(e) {
    return "eE$".includes(e);
  }
  function Sql(e) {
    return "jkG".includes(e) || e === "gg";
  }
  function $sr(e, t, n, r) {
    if (n === "w") {
      return Tql(e, t, r, _Se);
    }
    if (n === "W") {
      return Tql(e, t, r, s => !NLn(s));
    }
    let o = Wjm[n];
    if (o) {
      let [s, i] = o;
      return s === i ? Gjm(e, t, s, r) : Vjm(e, t, s, i, r);
    }
    return null;
  }
  function Tql(e, t, n, r) {
    let o = [];
    for (let {
      segment: m,
      index: f
    } of JS().segment(e)) {
      o.push({
        segment: m,
        index: f
      });
    }
    if (o.length === 0) {
      return null;
    }
    let s = o.length - 1;
    for (let m = 0; m < o.length; m++) {
      let f = o[m];
      let h = m + 1 < o.length ? o[m + 1].index : e.length;
      if (t >= f.index && t < h) {
        s = m;
        break;
      }
    }
    let i = m => o[m]?.segment ?? "";
    let a = m => m < o.length ? o[m].index : e.length;
    let l = m => NLn(i(m));
    let c = m => r(i(m));
    let u = m => YPe(i(m));
    let d = s;
    let p = s;
    if (c(s)) {
      while (d > 0 && c(d - 1)) {
        d--;
      }
      while (p < o.length && c(p)) {
        p++;
      }
    } else if (l(s)) {
      while (d > 0 && l(d - 1)) {
        d--;
      }
      while (p < o.length && l(p)) {
        p++;
      }
      return {
        start: a(d),
        end: a(p)
      };
    } else if (u(s)) {
      while (d > 0 && u(d - 1)) {
        d--;
      }
      while (p < o.length && u(p)) {
        p++;
      }
    }
    if (!n) {
      if (p < o.length && l(p)) {
        while (p < o.length && l(p)) {
          p++;
        }
      } else if (d > 0 && l(d - 1)) {
        while (d > 0 && l(d - 1)) {
          d--;
        }
      }
    }
    return {
      start: a(d),
      end: a(p)
    };
  }
  function Gjm(e, t, n, r) {
    let o = e.lastIndexOf(`
`, t - 1) + 1;
    let s = e.indexOf(`
`, t);
    let i = s === -1 ? e.length : s;
    let a = e.slice(o, i);
    let l = t - o;
    let c = [];
    for (let u = 0; u < a.length; u++) {
      if (a[u] === n) {
        c.push(u);
      }
    }
    for (let u = 0; u < c.length - 1; u += 2) {
      let d = c[u];
      let p = c[u + 1];
      if (d <= l && l <= p) {
        return r ? {
          start: o + d + 1,
          end: o + p
        } : {
          start: o + d,
          end: o + p + 1
        };
      }
    }
    return null;
  }
  function Vjm(e, t, n, r, o) {
    let s = 0;
    let i = -1;
    for (let l = t; l >= 0; l--) {
      if (e[l] === r && l !== t) {
        s++;
      } else if (e[l] === n) {
        if (s === 0) {
          i = l;
          break;
        }
        s--;
      }
    }
    if (i === -1) {
      return null;
    }
    s = 0;
    let a = -1;
    for (let l = i + 1; l < e.length; l++) {
      if (e[l] === n) {
        s++;
      } else if (e[l] === r) {
        if (s === 0) {
          a = l;
          break;
        }
        s--;
      }
    }
    if (a === -1) {
      return null;
    }
    return o ? {
      start: i + 1,
      end: a
    } : {
      start: i,
      end: a + 1
    };
  }
  var Wjm;
  var xjo = __lazy(() => {
    uGe();
    PP();
    Wjm = {
      "(": ["(", ")"],
      ")": ["(", ")"],
      b: ["(", ")"],
      "[": ["[", "]"],
      "]": ["[", "]"],
      "{": ["{", "}"],
      "}": ["{", "}"],
      B: ["{", "}"],
      "<": ["<", ">"],
      ">": ["<", ">"],
      '"': ['"', '"'],
      "'": ["'", "'"],
      "`": ["`", "`"]
    };
  });
  function iYe(e, t, n, r) {
    let o = sYe(t, r.cursor, n);
    if (o.equals(r.cursor) && !Rjo(t)) {
      return;
    }
    let s = Ajo(r.cursor, o, t, e, n);
    if (s.from === s.to) {
      if (e === "change" || e === "yank") {
        r.setRegister("", false);
      }
      if (e === "change") {
        r.enterInsert(s.from);
      }
      return;
    }
    Ivt(e, s.from, s.to, r, s.linewise);
    r.recordChange({
      type: "operator",
      op: e,
      motion: t,
      count: n
    });
  }
  function Hsr(e, t, n, r, o) {
    let s = o.cursor.findCharacter(n, t, r);
    if (s === null) {
      return;
    }
    let i = new zl(o.cursor.measuredText, s);
    let a = zjm(o.cursor, i, t);
    Ivt(e, a.from, a.to, o);
    o.setLastFind(t, n);
    o.recordChange({
      type: "operatorFind",
      op: e,
      find: t,
      char: n,
      count: r
    });
  }
  function jsr(e, t, n, r, o) {
    let s = $sr(o.text, o.cursor.offset, n, t === "inner");
    if (!s) {
      return;
    }
    Ivt(e, s.start, s.end, o);
    o.recordChange({
      type: "operatorTextObj",
      op: e,
      objType: n,
      scope: t,
      count: r
    });
  }
  function kjo(e, t, n) {
    let r = n.text;
    let o = r.split(`
`);
    let s = Ru(r.slice(0, n.cursor.offset), `
`);
    let i = Math.min(t, o.length - s);
    let a = n.cursor.startOfLogicalLine().offset;
    let l = a;
    for (let u = 0; u < i; u++) {
      let d = r.indexOf(`
`, l);
      l = d === -1 ? r.length : d + 1;
    }
    let c = r.slice(a, l);
    if (!c.endsWith(`
`)) {
      c = c + `
`;
    }
    if (n.setRegister(c, true), e === "yank") {
      n.setOffset(a);
    } else if (e === "delete") {
      let u = a;
      let d = l;
      if (d === r.length && u > 0 && r[u - 1] === `
`) {
        u -= 1;
      }
      let p = r.slice(0, u) + r.slice(d);
      n.setText(p || "");
      let m = Math.max(0, p.length - (L7(p).length || 1));
      n.setOffset(Math.min(u, m));
    } else if (e === "change") {
      if (o.length === 1) {
        n.setText("");
        n.enterInsert(0);
      } else {
        let u = o.slice(0, s);
        let d = o.slice(s + i);
        let p = [...u, "", ...d].join(`
`);
        n.setText(p);
        n.enterInsert(a);
      }
    }
    n.recordChange({
      type: "operator",
      op: e,
      motion: e[0],
      count: t
    });
  }
  function qsr(e, t) {
    let n = t.cursor.offset;
    if (n >= t.text.length) {
      return;
    }
    let r = t.cursor;
    for (let a = 0; a < e && !r.isAtEnd(); a++) {
      r = r.right();
    }
    let o = r.offset;
    let s = t.text.slice(n, o);
    let i = t.text.slice(0, n) + t.text.slice(o);
    t.setRegister(s, false);
    t.setText(i);
    t.setOffset(Ijo(i, n));
    t.recordChange({
      type: "x",
      count: e
    });
  }
  function Wsr(e, t, n) {
    let r = n.cursor.offset;
    let o = n.text;
    for (let s = 0; s < t && r < o.length; s++) {
      let i = CIt(o.slice(r)).length || 1;
      o = o.slice(0, r) + e + o.slice(r + i);
      r += e.length;
    }
    n.setText(o);
    n.setOffset(Math.max(0, r - e.length));
    n.recordChange({
      type: "replace",
      char: e,
      count: t
    });
  }
  function Gsr(e, t) {
    let n = t.cursor.offset;
    if (n >= t.text.length) {
      return;
    }
    let r = t.text;
    let o = n;
    let s = 0;
    while (o < r.length && s < e) {
      let i = CIt(r.slice(o));
      let a = i.length;
      let l = i === i.toUpperCase() ? i.toLowerCase() : i.toUpperCase();
      r = r.slice(0, o) + l + r.slice(o + a);
      o += l.length;
      s++;
    }
    t.setText(r);
    t.setOffset(o);
    t.recordChange({
      type: "toggleCase",
      count: e
    });
  }
  function Vsr(e, t) {
    let r = t.text.split(`
`);
    let {
      line: o
    } = t.cursor.getPosition();
    if (o >= r.length - 1) {
      return;
    }
    let s = Math.min(e, r.length - o - 1);
    let i = r[o];
    let a = i.length;
    for (let u = 1; u <= s; u++) {
      let d = (r[o + u] ?? "").trimStart();
      if (d.length > 0) {
        if (!i.endsWith(" ") && i.length > 0) {
          i += " ";
        }
        i += d;
      }
    }
    let l = [...r.slice(0, o), i, ...r.slice(o + s + 1)];
    let c = l.join(`
`);
    t.setText(c);
    t.setOffset(aYe(l, o) + a);
    t.recordChange({
      type: "join",
      count: e
    });
  }
  function Eql(e, t, n) {
    let r = n.getRegister();
    if (!r) {
      return;
    }
    let o = n.getRegisterIsLinewise();
    let s = o && r.endsWith(`
`) ? r.slice(0, -1) : r;
    if (o) {
      let a = n.text.split(`
`);
      let {
        line: l
      } = n.cursor.getPosition();
      let c = e ? l + 1 : l;
      let u = s.split(`
`);
      let d = [];
      for (let f = 0; f < t; f++) {
        d.push(...u);
      }
      let p = [...a.slice(0, c), ...d, ...a.slice(c)];
      let m = p.join(`
`);
      n.setText(m);
      n.setOffset(aYe(p, c));
    } else {
      let i = s.repeat(t);
      let a = n.cursor.offset;
      let l = n.text[a] === `
` && (a === 0 || n.text[a - 1] === `
`);
      let c = e && a < n.text.length && !l ? n.cursor.measuredText.nextOffset(a) : a;
      let u = n.text.slice(0, c) + i + n.text.slice(c);
      let d = i.includes(`
`) ? Ijo(u, c) : c + i.length - (L7(i).length || 1);
      n.setText(u);
      n.setOffset(d);
    }
  }
  function zsr(e, t, n) {
    let o = n.text.split(`
`);
    let {
      line: s
    } = n.cursor.getPosition();
    let i = Math.min(t, o.length - s);
    Pjo(o, s, s + i - 1, e);
    let a = o.join(`
`);
    let c = ((o[s] ?? "").match(/^\s*/)?.[0] ?? "").length;
    n.setText(a);
    n.setOffset(aYe(o, s) + c);
    n.recordChange({
      type: "indent",
      dir: e,
      count: t
    });
  }
  function FQt(e, t) {
    let r = t.text.split(`
`);
    let {
      line: o
    } = t.cursor.getPosition();
    let s = e === "below" ? o + 1 : o;
    let i = [...r.slice(0, s), "", ...r.slice(s)];
    let a = i.join(`
`);
    t.setText(a);
    t.enterInsert(aYe(i, s));
    t.recordChange({
      type: "openLine",
      direction: e
    });
  }
  function aYe(e, t) {
    return e.slice(0, t).join(`
`).length + (t > 0 ? 1 : 0);
  }
  function Ajo(e, t, n, r, o) {
    let s = Math.min(e.offset, t.offset);
    let i = Math.max(e.offset, t.offset);
    let a = false;
    if (r === "change" && (n === "w" || n === "W")) {
      let l = e;
      for (let u = 0; u < o - 1; u++) {
        l = n === "w" ? l.nextVimWord() : l.nextWORD();
      }
      let c = n === "w" ? l.endOfVimWord() : l.endOfWORD();
      i = e.measuredText.nextOffset(c.offset);
    } else if (Sql(n)) {
      a = true;
      let l = e.text;
      let c = l.indexOf(`
`, i);
      if (c === -1) {
        if (i = l.length, s > 0 && l[s - 1] === `
`) {
          s -= 1;
        }
      } else {
        i = c + 1;
      }
    } else if (Rjo(n) && e.offset <= t.offset && e.text[i] !== `
`) {
      i = e.measuredText.nextOffset(i);
    }
    s = e.snapOutOfPlaceholder(s, "start");
    i = e.snapOutOfPlaceholder(i, "end");
    return {
      from: s,
      to: i,
      linewise: a
    };
  }
  function zjm(e, t, n) {
    let r = Math.min(e.offset, t.offset);
    let o = Math.max(e.offset, t.offset);
    let s = e.measuredText.nextOffset(o);
    return {
      from: r,
      to: s
    };
  }
  function Ivt(e, t, n, r, o = false) {
    let s = r.text.slice(t, n);
    if (o && !s.endsWith(`
`)) {
      s = s + `
`;
    }
    if (r.setRegister(s, o), e === "yank") {
      r.setOffset(t);
    } else if (e === "delete") {
      let i = r.text.slice(0, t) + r.text.slice(n);
      r.setText(i);
      r.setOffset(Ijo(i, t));
    } else if (e === "change") {
      let i = r.text.slice(0, t) + r.text.slice(n);
      r.setText(i);
      r.enterInsert(t);
    }
  }
  function Ijo(e, t) {
    if (e[t] === `
` && t > 0 && e[t - 1] !== `
`) {
      return t - (L7(e.slice(0, t)).length || 1);
    }
    if (t >= e.length && !e.endsWith(`
`)) {
      return Math.max(0, e.length - (L7(e).length || 1));
    }
    return t;
  }
  function vql(e, t) {
    if (t === 0) {
      return 0;
    }
    let n = e.lastIndexOf(`
`, t - 1);
    return n === -1 ? 0 : n + 1;
  }
  function Ksr(e, t) {
    if (t) {
      let n = Ru(e, `
`);
      return e.endsWith(`
`) ? n : n + 1;
    }
    return $$e(e);
  }
  function UQt(e, t, n) {
    let r = e.text;
    if (n) {
      let i = vql(r, e.cursor.offset);
      let a = i;
      for (let l = 0; l < t; l++) {
        let c = r.indexOf(`
`, a);
        if (c === -1) {
          a = r.length;
          break;
        }
        a = c + 1;
      }
      return {
        from: i,
        to: a
      };
    }
    let o = e.cursor.offset;
    let s = o;
    for (let i = 0; i < t && s < r.length; i++) {
      s = e.cursor.measuredText.nextOffset(s);
    }
    return {
      from: o,
      to: s
    };
  }
  function Ysr(e, t, n) {
    let r = Math.min(e, t.cursor.offset);
    let o = Math.max(e, t.cursor.offset);
    if (!n) {
      return {
        from: r,
        to: t.cursor.measuredText.nextOffset(o)
      };
    }
    let s = t.text;
    let i = vql(s, r);
    let a = s.indexOf(`
`, o);
    let l = a === -1 ? s.length : a + 1;
    return {
      from: i,
      to: l
    };
  }
  function Pjo(e, t, n, r) {
    for (let s = t; s <= n; s++) {
      let i = e[s] ?? "";
      if (r === ">") {
        e[s] = "  " + i;
      } else if (i.startsWith("  ")) {
        e[s] = i.slice(2);
      } else if (i.startsWith("\t")) {
        e[s] = i.slice(1);
      } else {
        let a = 0;
        while (a < i.length && a < 2 && /\s/.test(i[a])) {
          a++;
        }
        e[s] = i.slice(a);
      }
    }
  }
  function wql(e, t) {
    let n = Math.min(e, t.cursor.offset);
    let r = Math.max(e, t.cursor.offset);
    let o = t.text;
    let s = Ru(o.slice(0, n), `
`);
    let i = Ru(o.slice(n, r), `
`) + 1;
    let a = o.split(`
`);
    let l = Math.max(1, Math.min(i - 1, a.length - s - 1));
    if (s >= a.length - 1) {
      return;
    }
    let c = a[s];
    let u = c.length;
    for (let p = 1; p <= l; p++) {
      let m = (a[s + p] ?? "").trimStart();
      if (m.length > 0) {
        if (!c.endsWith(" ") && c.length > 0) {
          c += " ";
        }
        c += m;
      }
    }
    let d = [...a.slice(0, s), c, ...a.slice(s + l + 1)];
    t.setText(d.join(`
`));
    t.setOffset(aYe(d, s) + u);
    t.recordChange({
      type: "join",
      count: l
    });
  }
  function Cql(e, t, n, r) {
    let o = Math.min(n, r.cursor.offset);
    let s = Math.max(n, r.cursor.offset);
    let i = r.text;
    let a = Ru(i.slice(0, o), `
`);
    let l = a + Ru(i.slice(o, s), `
`);
    let c = i.split(`
`);
    for (let m = 0; m < t; m++) {
      Pjo(c, a, l, e);
    }
    let u = c.join(`
`);
    let p = ((c[a] ?? "").match(/^\s*/)?.[0] ?? "").length;
    r.setText(u);
    r.setOffset(aYe(c, a) + p);
    r.recordChange({
      type: "visualIndent",
      dir: e,
      count: t,
      lines: l - a + 1
    });
  }
  function Rql(e, t, n, r) {
    let o = r.text;
    let s = o.split(`
`);
    let i = Ru(o.slice(0, r.cursor.offset), `
`);
    let a = Math.min(i + n - 1, s.length - 1);
    for (let u = 0; u < t; u++) {
      Pjo(s, i, a, e);
    }
    let l = s.join(`
`);
    let c = ((s[i] ?? "").match(/^\s*/)?.[0] ?? "").length;
    r.setText(l);
    r.setOffset(aYe(s, i) + c);
  }
  function xql(e, t, n, r, o) {
    if (o && e === "change") {
      let s = r.text.slice(t, n);
      if (!s.endsWith(`
`)) {
        s += `
`;
      }
      r.setRegister(s, true);
      let i = r.text.slice(0, t);
      let a = r.text.slice(n);
      let l = a !== "";
      r.setText(i + (l ? `
` : "") + a);
      r.enterInsert(t);
      return;
    }
    if (o && e === "delete") {
      let s = r.text.slice(t, n);
      if (!s.endsWith(`
`)) {
        s += `
`;
      }
      r.setRegister(s, true);
      let i = t;
      if (n === r.text.length && t > 0 && r.text[t - 1] === `
`) {
        i -= 1;
      }
      let a = r.text.slice(0, i) + r.text.slice(n);
      r.setText(a);
      let l = Math.max(0, a.length - (L7(a).length || 1));
      r.setOffset(Math.min(i, l));
      return;
    }
    Ivt(e, t, n, r, o);
  }
  function kql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = Ysr(t, n, r);
    let i = Ksr(n.text.slice(o, s), r);
    if (xql(e, o, s, n, r), e !== "yank") {
      n.recordChange({
        type: "visualOp",
        op: e,
        span: i,
        linewise: r
      });
    }
  }
  function Aql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = UQt(r, t, n);
    if (o === s) {
      return;
    }
    xql(e, o, s, r, n);
  }
  function Iql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = UQt(r, e, t);
    if (o === s && !t) {
      return;
    }
    let i = r.text.slice(o, s);
    if (t && !i.endsWith(`
`)) {
      i += `
`;
    }
    r.setRegister(i, t);
    let a = r.text.slice(s);
    let l = t && a !== "" ? `
` + a : a;
    let c = r.text.slice(0, o) + n + l;
    r.setText(c);
    let u = L7(n);
    r.setOffset(Math.max(o, o + n.length - (u.length || 1)));
  }
  function Pql(e, t, n, r) {
    let o = r.text.slice(t, n);
    let s = "";
    for (let {
      segment: a
    } of JS().segment(o)) {
      s += a === `
` ? `
` : e;
    }
    let i = r.text.slice(0, t) + s + r.text.slice(n);
    r.setText(i);
    r.setOffset(t);
  }
  function Oql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = Ysr(t, n, r);
    let i = Ksr(n.text.slice(o, s), r);
    Pql(e, o, s, n);
    n.recordChange({
      type: "visualReplace",
      char: e,
      span: i,
      linewise: r
    });
  }
  function Dql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = UQt(r, t, n);
    if (o === s) {
      return;
    }
    Pql(e, o, s, r);
  }
  function Mql(e, t, n, r) {
    let o = r.text.slice(t, n);
    let s = "";
    for (let {
      segment: a
    } of JS().segment(o)) {
      if (e === "upper") {
        s += a.toUpperCase();
      } else if (e === "lower") {
        s += a.toLowerCase();
      } else {
        s += a === a.toUpperCase() ? a.toLowerCase() : a.toUpperCase();
      }
    }
    let i = r.text.slice(0, t) + s + r.text.slice(n);
    r.setText(i);
    r.setOffset(t);
  }
  function Nql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = Ysr(t, n, r);
    let i = Ksr(n.text.slice(o, s), r);
    Mql(e, o, s, n);
    n.recordChange({
      type: "visualCase",
      caseOp: e,
      span: i,
      linewise: r
    });
  }
  function Lql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = UQt(r, t, n);
    if (o === s) {
      return;
    }
    Mql(e, o, s, r);
  }
  function Fql(e, t, n) {
    let r = t.getRegister();
    if (!r) {
      return;
    }
    let {
      from: o,
      to: s
    } = Ysr(e, t, n);
    let i = Ksr(t.text.slice(o, s), n);
    let a = Bql(r, o, s, t, n);
    t.recordChange({
      type: "visualPaste",
      content: a,
      span: i,
      linewise: n
    });
  }
  function Uql(e, t, n, r) {
    let {
      from: o,
      to: s
    } = UQt(r, t, n);
    if (o === s && !n) {
      return;
    }
    Bql(e, o, s, r, n);
  }
  function Bql(e, t, n, r, o) {
    let s = r.text.slice(t, n).endsWith(`
`);
    let i = e.endsWith(`
`) ? e.slice(0, -1) : e;
    if (s && !i.endsWith(`
`)) {
      i += `
`;
    }
    let a = r.text.slice(t, n);
    if (o && !a.endsWith(`
`)) {
      a += `
`;
    }
    r.setRegister(a, o);
    let l = r.text.slice(0, t) + i + r.text.slice(n);
    if (r.setText(l), o || i.endsWith(`
`)) {
      r.setOffset(t);
    } else {
      let c = L7(i);
      r.setOffset(Math.max(t, t + i.length - (c.length || 1)));
    }
    return i;
  }
  function $ql(e, t, n) {
    let r = t === 1 ? n.cursor.startOfLastLine() : n.cursor.goToLine(t);
    if (r.equals(n.cursor)) {
      return;
    }
    let o = Ajo(n.cursor, r, "G", e, t);
    Ivt(e, o.from, o.to, n, o.linewise);
    n.recordChange({
      type: "operator",
      op: e,
      motion: "G",
      count: t
    });
  }
  function Hql(e, t, n) {
    let r = t === 1 ? n.cursor.startOfFirstLine() : n.cursor.goToLine(t);
    if (r.equals(n.cursor)) {
      return;
    }
    let o = Ajo(n.cursor, r, "gg", e, t);
    Ivt(e, o.from, o.to, n, o.linewise);
    n.recordChange({
      type: "operator",
      op: e,
      motion: "gg",
      count: t
    });
  }
  var Ojo = __lazy(() => {
    uGe();
    PP();
    Zn();
    xjo();
  });
  function Djo(e) {
    return e in Jsr;
  }
  function Mjo(e) {
    return e in Zsr;
  }
  function jql() {
    return {
      mode: "INSERT",
      insertedText: ""
    };
  }
  function qql() {
    return {
      lastChange: null,
      lastFind: null,
      register: "",
      registerIsLinewise: false
    };
  }
  var Jsr;
  var Xsr;
  var Qsr;
  var Zsr;
  var Njo;
  var Ljo = __lazy(() => {
    Jsr = {
      d: "delete",
      c: "change",
      y: "yank"
    };
    Xsr = new Set(["h", "l", " ", "j", "k", "w", "b", "e", "W", "B", "E", "0", "^", "$"]);
    Qsr = new Set(["f", "F", "t", "T"]);
    Zsr = {
      i: "inner",
      a: "around"
    };
    Njo = new Set(["w", "W", '"', "'", "`", "(", ")", "b", "[", "]", "{", "}", "B", "<", ">"]);
  });
  function Fjo(e, t, n) {
    switch (e.type) {
      case "idle":
        return Kjm(t, n);
      case "count":
        return Yjm(e, t, n);
      case "operator":
        return Jjm(e, t, n);
      case "operatorCount":
        return Xjm(e, t, n);
      case "operatorFind":
        return Qjm(e, t, n);
      case "operatorTextObj":
        return Zjm(e, t, n);
      case "find":
        return eqm(e, t, n);
      case "g":
        return tqm(e, t, n);
      case "operatorG":
        return nqm(e, t, n);
      case "replace":
        return rqm(e, t, n);
      case "indent":
        return oqm(e, t, n);
    }
  }
  function Wql(e, t, n) {
    if (Djo(e)) {
      return {
        next: {
          type: "operator",
          op: Jsr[e],
          count: t
        }
      };
    }
    if (Xsr.vZc(e)) {
      return {
        execute: () => {
          let r = sYe(e, n.cursor, t);
          n.setOffset(r.offset);
        }
      };
    }
    if (Qsr.vZc(e)) {
      return {
        next: {
          type: "find",
          find: e,
          count: t
        }
      };
    }
    if (e === "g") {
      return {
        next: {
          type: "g",
          count: t
        }
      };
    }
    if (e === "r") {
      return {
        next: {
          type: "replace",
          count: t
        }
      };
    }
    if (e === ">" || e === "<") {
      return {
        next: {
          type: "indent",
          dir: e,
          count: t
        }
      };
    }
    if (e === "~") {
      return {
        execute: () => Gsr(t, n)
      };
    }
    if (e === "x") {
      return {
        execute: () => qsr(t, n)
      };
    }
    if (e === "J") {
      return {
        execute: () => Vsr(t, n)
      };
    }
    if (e === "p" || e === "P") {
      return {
        execute: () => Eql(e === "p", t, n)
      };
    }
    if (e === "D") {
      return {
        execute: () => iYe("delete", "$", 1, n)
      };
    }
    if (e === "C") {
      return {
        execute: () => iYe("change", "$", 1, n)
      };
    }
    if (e === "Y") {
      return {
        execute: () => kjo("yank", t, n)
      };
    }
    if (e === "G") {
      return {
        execute: () => {
          if (t === 1) {
            n.setOffset(n.cursor.startOfLastLine().offset);
          } else {
            n.setOffset(n.cursor.goToLine(t).offset);
          }
        }
      };
    }
    if (e === ".") {
      return {
        execute: () => n.onDotRepeat?.()
      };
    }
    if (e === ";" || e === ",") {
      return {
        execute: () => Vql(e === ",", t, n)
      };
    }
    if (e === "u") {
      return {
        execute: () => n.onUndo?.()
      };
    }
    if (e === "i") {
      return {
        execute: () => n.enterInsert(n.cursor.offset)
      };
    }
    if (e === "I") {
      return {
        execute: () => n.enterInsert(n.cursor.firstNonBlankInLogicalLine().offset)
      };
    }
    if (e === "a") {
      return {
        execute: () => {
          let r = n.cursor.isAtEnd() ? n.cursor.offset : n.cursor.right().offset;
          n.enterInsert(r);
        }
      };
    }
    if (e === "A") {
      return {
        execute: () => n.enterInsert(n.cursor.endOfLogicalLine().offset)
      };
    }
    if (e === "o") {
      return {
        execute: () => FQt("below", n)
      };
    }
    if (e === "O") {
      return {
        execute: () => FQt("above", n)
      };
    }
    return null;
  }
  function Gql(e, t, n, r) {
    if (Mjo(n)) {
      return {
        next: {
          type: "operatorTextObj",
          op: e,
          count: t,
          scope: Zsr[n]
        }
      };
    }
    if (Qsr.vZc(n)) {
      return {
        next: {
          type: "operatorFind",
          op: e,
          count: t,
          find: n
        }
      };
    }
    if (Xsr.vZc(n)) {
      return {
        execute: () => iYe(e, n, t, r)
      };
    }
    if (n === "G") {
      return {
        execute: () => $ql(e, t, r)
      };
    }
    if (n === "g") {
      return {
        next: {
          type: "operatorG",
          op: e,
          count: t
        }
      };
    }
    return null;
  }
  function Kjm(e, t) {
    if (/[1-9]/.test(e)) {
      return {
        next: {
          type: "count",
          digits: e
        }
      };
    }
    if (e === "0") {
      return {
        execute: () => t.setOffset(t.cursor.startOfLogicalLine().offset)
      };
    }
    let n = Wql(e, 1, t);
    if (n) {
      return n;
    }
    return {};
  }
  function Yjm(e, t, n) {
    if (/[0-9]/.test(t)) {
      let s = e.digits + t;
      let i = Math.min(parseInt(s, 10), 1e4);
      return {
        next: {
          type: "count",
          digits: String(i)
        }
      };
    }
    let r = parseInt(e.digits, 10);
    let o = Wql(t, r, n);
    if (o) {
      return o;
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function Jjm(e, t, n) {
    if (t === e.op[0]) {
      return {
        execute: () => kjo(e.op, e.count, n)
      };
    }
    if (/[0-9]/.test(t)) {
      return {
        next: {
          type: "operatorCount",
          op: e.op,
          count: e.count,
          digits: t
        }
      };
    }
    let r = Gql(e.op, e.count, t, n);
    if (r) {
      return r;
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function Xjm(e, t, n) {
    if (/[0-9]/.test(t)) {
      let i = e.digits + t;
      let a = Math.min(parseInt(i, 10), 1e4);
      return {
        next: {
          ...e,
          digits: String(a)
        }
      };
    }
    let r = parseInt(e.digits, 10);
    let o = e.count * r;
    let s = Gql(e.op, o, t, n);
    if (s) {
      return s;
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function Qjm(e, t, n) {
    return {
      execute: () => Hsr(e.op, e.find, t, e.count, n)
    };
  }
  function Zjm(e, t, n) {
    if (Njo.vZc(t)) {
      return {
        execute: () => jsr(e.op, e.scope, t, e.count, n)
      };
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function eqm(e, t, n) {
    return {
      execute: () => {
        let r = n.cursor.findCharacter(t, e.find, e.count);
        if (r !== null) {
          n.setOffset(r);
          n.setLastFind(e.find, t);
        }
      }
    };
  }
  function tqm(e, t, n) {
    if (t === "j" || t === "k") {
      return {
        execute: () => {
          let r = sYe(`g${t}`, n.cursor, e.count);
          n.setOffset(r.offset);
        }
      };
    }
    if (t === "g") {
      if (e.count > 1) {
        return {
          execute: () => {
            let r = n.text.split(`
`);
            let o = Math.min(e.count - 1, r.length - 1);
            let s = 0;
            for (let i = 0; i < o; i++) {
              s += (r[i]?.length ?? 0) + 1;
            }
            n.setOffset(s);
          }
        };
      }
      return {
        execute: () => n.setOffset(n.cursor.startOfFirstLine().offset)
      };
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function nqm(e, t, n) {
    if (t === "j" || t === "k") {
      return {
        execute: () => iYe(e.op, `g${t}`, e.count, n)
      };
    }
    if (t === "g") {
      return {
        execute: () => Hql(e.op, e.count, n)
      };
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function rqm(e, t, n) {
    if (t === "") {
      return {
        next: {
          type: "idle"
        }
      };
    }
    return {
      execute: () => Wsr(t, e.count, n)
    };
  }
  function oqm(e, t, n) {
    if (t === e.dir) {
      return {
        execute: () => zsr(e.dir, e.count, n)
      };
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function Vql(e, t, n) {
    let r = n.getLastFind();
    if (!r) {
      return;
    }
    let o = r.type;
    if (e) {
      o = {
        f: "F",
        F: "f",
        t: "T",
        T: "t"
      }[o];
    }
    let s = n.cursor.findCharacter(r.char, o, t);
    if (s !== null) {
      n.setOffset(s);
    }
  }
  function zql(e, t, n) {
    switch (e.type) {
      case "idle":
        return sqm(t, n);
      case "count":
        return iqm(e, t, n);
      case "find":
        return aqm(e, t, n);
      case "g":
        return lqm(e, t, n);
      case "replace":
        if (t === "") {
          return {
            next: {
              type: "idle"
            }
          };
        }
        return {
          exit: "replace",
          char: t
        };
      case "textObject":
        return cqm(e, t, n);
    }
  }
  function Kql(e, t, n) {
    if (Djo(e)) {
      return {
        exit: "operator",
        op: Jsr[e]
      };
    }
    if (e === "x") {
      return {
        exit: "operator",
        op: "delete"
      };
    }
    if (e === "s") {
      return {
        exit: "operator",
        op: "change"
      };
    }
    if (e === "X" || e === "D") {
      return {
        exit: "operator",
        op: "delete",
        forceLinewise: true
      };
    }
    if (e === "C" || e === "S" || e === "R") {
      return {
        exit: "operator",
        op: "change",
        forceLinewise: true
      };
    }
    if (e === "Y") {
      return {
        exit: "operator",
        op: "yank",
        forceLinewise: true
      };
    }
    if (e === "r") {
      return {
        next: {
          type: "replace"
        }
      };
    }
    if (e === "~") {
      return {
        exit: "case",
        op: "toggle"
      };
    }
    if (e === "u") {
      return {
        exit: "case",
        op: "lower"
      };
    }
    if (e === "U") {
      return {
        exit: "case",
        op: "upper"
      };
    }
    if (e === "p" || e === "P") {
      return {
        exit: "paste"
      };
    }
    if (e === ">" || e === "<") {
      return {
        exit: "indent",
        dir: e,
        count: t
      };
    }
    if (e === "v" || e === "V") {
      return {
        exit: "toggleKind",
        key: e
      };
    }
    if (e === "o") {
      return {
        exit: "swap"
      };
    }
    if (e === "J") {
      return {
        exit: "join"
      };
    }
    if (Mjo(e)) {
      return {
        next: {
          type: "textObject",
          scope: Zsr[e],
          count: t
        }
      };
    }
    if (e === "$") {
      return {
        next: {
          type: "idle"
        },
        move: () => n.setOffset(n.cursor.endOfLogicalLine().offset)
      };
    }
    if (Xsr.vZc(e)) {
      return {
        next: {
          type: "idle"
        },
        move: () => n.setOffset(sYe(e, n.cursor, t).offset)
      };
    }
    if (Qsr.vZc(e)) {
      return {
        next: {
          type: "find",
          find: e,
          count: t
        }
      };
    }
    if (e === "g") {
      return {
        next: {
          type: "g",
          count: t
        }
      };
    }
    if (e === "G") {
      return {
        next: {
          type: "idle"
        },
        move: () => {
          let r = t === 1 ? n.cursor.startOfLastLine() : n.cursor.goToLine(t);
          n.setOffset(r.offset);
        }
      };
    }
    if (e === ";" || e === ",") {
      return {
        next: {
          type: "idle"
        },
        move: () => Vql(e === ",", t, n)
      };
    }
    return null;
  }
  function sqm(e, t) {
    if (/[1-9]/.test(e)) {
      return {
        next: {
          type: "count",
          digits: e
        }
      };
    }
    if (e === "0") {
      return {
        next: {
          type: "idle"
        },
        move: () => t.setOffset(t.cursor.startOfLogicalLine().offset)
      };
    }
    return Kql(e, 1, t) ?? {
      next: {
        type: "idle"
      }
    };
  }
  function iqm(e, t, n) {
    if (/[0-9]/.test(t)) {
      let o = e.digits + t;
      let s = Math.min(parseInt(o, 10), 1e4);
      return {
        next: {
          type: "count",
          digits: String(s)
        }
      };
    }
    let r = parseInt(e.digits, 10);
    return Kql(t, r, n) ?? {
      next: {
        type: "idle"
      }
    };
  }
  function aqm(e, t, n) {
    return {
      next: {
        type: "idle"
      },
      move: () => {
        let r = n.cursor.findCharacter(t, e.find, e.count);
        if (r !== null) {
          n.setOffset(r);
          n.setLastFind(e.find, t);
        }
      }
    };
  }
  function lqm(e, t, n) {
    if (t === "j" || t === "k") {
      return {
        next: {
          type: "idle"
        },
        move: () => n.setOffset(sYe(`g${t}`, n.cursor, e.count).offset)
      };
    }
    if (t === "g") {
      return {
        next: {
          type: "idle"
        },
        move: () => {
          let r = e.count > 1 ? n.cursor.goToLine(e.count) : n.cursor.startOfFirstLine();
          n.setOffset(r.offset);
        }
      };
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  function cqm(e, t, n) {
    if (Njo.vZc(t)) {
      let r = $sr(n.text, n.cursor.offset, t, e.scope === "inner");
      if (r) {
        return {
          exit: "selectRange",
          start: r.start,
          end: r.end
        };
      }
    }
    return {
      next: {
        type: "idle"
      }
    };
  }
  var Yql = __lazy(() => {
    Ojo();
    xjo();
    Ljo();
  });
  function Ujo(e) {
    let {
      value: t,
      onChange: n,
      columns: r,
      disableEscapeDoublePress: o,
      onModeChange: s,
      onUndo: i,
      onOpenHistorySearch: a,
      onHistoryUp: l,
      onHistoryDown: c,
      inputFilter: u
    } = e;
    let d = BZ.useRef(null);
    let p = BZ.useRef(jql());
    let [m, f] = BZ.useState("INSERT");
    let [h, g] = BZ.useState(null);
    let y = BZ.useRef(qql());
    function _(M, L) {
      let P = p.current;
      if (P.mode === "INSERT" && !L.ctrl && !L.meta && [...L.key].length === 1) {
        p.current = {
          mode: "INSERT",
          insertedText: P.insertedText + M
        };
      }
    }
    let b = BZ.useCallback(M => {
      if (M !== undefined) {
        d.current?.setOffset(M);
      }
      p.current = {
        mode: "INSERT",
        insertedText: ""
      };
      f("INSERT");
      g(null);
      s?.("INSERT");
    }, [s]);
    let S = BZ.useCallback(() => {
      let M = p.current;
      if (M.mode === "INSERT") {
        let L = y.current.lastChange;
        if (L?.type === "visualOp" && L.op === "change") {
          y.current.lastChange = {
            type: "visualChange",
            span: L.span,
            linewise: L.linewise,
            text: M.insertedText ?? ""
          };
        } else if (M.insertedText) {
          y.current.lastChange = {
            type: "insert",
            text: M.insertedText
          };
        }
        let P = d.current;
        if (P) {
          let F = P.offset;
          if (F > 0 && t.normalize("NFC")[F - 1] !== `
`) {
            P.setOffset(F - 1);
          }
        }
      }
      p.current = {
        mode: "NORMAL",
        command: {
          type: "idle"
        }
      };
      f("NORMAL");
      g(null);
      s?.("NORMAL");
    }, [s, t]);
    let E = BZ.useCallback((M, L) => {
      p.current = {
        mode: "VISUAL",
        kind: L,
        anchor: M,
        command: {
          type: "idle"
        }
      };
      let P = L === "line" ? "VISUAL LINE" : "VISUAL";
      f(P);
      g(M);
      s?.(P);
    }, [s]);
    function C(M, L, P = false) {
      return {
        cursor: M,
        text: M.text,
        setText: F => n(F),
        setOffset: F => L.setOffset(F),
        enterInsert: F => b(F),
        getRegister: () => y.current.register,
        getRegisterIsLinewise: () => y.current.registerIsLinewise,
        setRegister: (F, H) => {
          y.current.register = F;
          y.current.registerIsLinewise = H;
        },
        getLastFind: () => y.current.lastFind,
        setLastFind: (F, H) => {
          y.current.lastFind = {
            type: F,
            char: H
          };
        },
        recordChange: P ? () => {} : F => {
          y.current.lastChange = F;
        }
      };
    }
    function x(M, L, P) {
      switch (M.type) {
        case "insert":
          if (M.text) {
            let F = L.insert(M.text);
            P.setText(F.text);
            P.setOffset(F.offset);
          }
          break;
        case "x":
          qsr(M.count, P);
          break;
        case "replace":
          Wsr(M.char, M.count, P);
          break;
        case "toggleCase":
          Gsr(M.count, P);
          break;
        case "indent":
          zsr(M.dir, M.count, P);
          break;
        case "join":
          Vsr(M.count, P);
          break;
        case "openLine":
          FQt(M.direction, P);
          break;
        case "operator":
          iYe(M.op, M.motion, M.count, P);
          break;
        case "operatorFind":
          Hsr(M.op, M.find, M.char, M.count, P);
          break;
        case "operatorTextObj":
          jsr(M.op, M.scope, M.objType, M.count, P);
          break;
        case "visualOp":
          Aql(M.op, M.span, M.linewise, P);
          break;
        case "visualReplace":
          Dql(M.char, M.span, M.linewise, P);
          break;
        case "visualCase":
          Lql(M.caseOp, M.span, M.linewise, P);
          break;
        case "visualPaste":
          Uql(M.content, M.span, M.linewise, P);
          break;
        case "visualIndent":
          Rql(M.dir, M.count, M.lines, P);
          break;
        case "visualChange":
          Iql(M.span, M.linewise, M.text, P);
          break;
      }
    }
    function A() {
      let M = y.current.lastChange;
      let L = d.current;
      if (!M || !L) {
        return;
      }
      let P = zl.fromText(t, r, L.offset);
      x(M, P, C(P, L, true));
    }
    function k(M, L) {
      let P = t.normalize("NFC");
      let F = L.offset;
      let H = () => {
        let N = y.current.lastChange;
        if (!N) {
          return;
        }
        let W = zl.fromText(P, r, F);
        x(N, W, {
          ...C(W, L, true),
          text: P,
          setText: j => {
            P = j;
            n(j);
          },
          setOffset: j => {
            F = j;
            L.setOffset(j);
          },
          enterInsert: j => {
            F = j;
            b(j);
          }
        });
      };
      let U = [...M];
      for (let N = 0; N < U.length; N++) {
        if (p.current.mode === "INSERT") {
          let J = U.slice(N).join("");
          let Q = zl.fromText(P, r, F).insert(J);
          n(Q.text);
          L.setOffset(Q.offset);
          p.current = {
            mode: "INSERT",
            insertedText: p.current.insertedText + J
          };
          return;
        }
        let W = p.current;
        if (W.mode !== "NORMAL") {
          return;
        }
        let j = U[N];
        if ((j === "v" || j === "V") && (W.command.type === "idle" || W.command.type === "count")) {
          E(F, j === "V" ? "line" : "char");
          return;
        }
        let z = zl.fromText(P, r, F);
        let V = {
          ...C(z, L, false),
          text: P,
          setText: J => {
            P = J;
            n(J);
          },
          setOffset: J => {
            F = J;
            L.setOffset(J);
          },
          enterInsert: J => {
            F = J;
            b(J);
          },
          onDotRepeat: H
        };
        let K = Fjo(W.command, j, V);
        if (K.execute) {
          K.execute();
        }
        if (p.current.mode === "NORMAL") {
          if (K.next) {
            p.current = {
              mode: "NORMAL",
              command: K.next
            };
          } else if (K.execute) {
            p.current = {
              mode: "NORMAL",
              command: {
                type: "idle"
              }
            };
          }
        }
      }
    }
    function I(M) {
      let L = d.current;
      if (!L) {
        return;
      }
      let P = p.current;
      let F = zl.fromText(t, r, L.offset);
      let H = () => u?.(M.key, M);
      if (M.ctrl || M.meta) {
        if (P.mode === "VISUAL") {
          H();
          S();
          M.preventDefault();
          return;
        }
        L.handleKeyDown(M);
        return;
      }
      if (M.name === "escape" && P.mode === "INSERT") {
        if (H(), S(), !o) {
          M.preventDefault();
        }
        return;
      }
      if (M.name === "escape" && P.mode === "NORMAL") {
        if (H(), p.current = {
          mode: "NORMAL",
          command: {
            type: "idle"
          }
        }, !o) {
          M.preventDefault();
        }
        return;
      }
      if (M.name === "escape" && P.mode === "VISUAL") {
        if (H(), P.command.type !== "idle") {
          p.current = {
            ...P,
            command: {
              type: "idle"
            }
          };
        } else {
          S();
        }
        if (!o) {
          M.preventDefault();
        }
        return;
      }
      if (M.name === "return" && P.mode !== "VISUAL") {
        L.handleKeyDown(M);
        return;
      }
      if (P.mode === "INSERT") {
        if (M.name === "backspace" || M.name === "delete") {
          if (P.insertedText.length > 0) {
            p.current = {
              mode: "INSERT",
              insertedText: P.insertedText.slice(0, -(L7(P.insertedText).length || 1))
            };
          }
        }
        L.handleKeyDown(M);
        return;
      }
      if (P.mode === "VISUAL") {
        let z = {
          ...C(F, L, false),
          onUndo: i,
          onDotRepeat: A
        };
        let V = P.command.type === "idle" || P.command.type === "count";
        let K = M.key;
        if (M.name === "left") {
          K = V ? "h" : "";
        } else if (M.name === "right") {
          K = V ? "l" : "";
        } else if (M.name === "up") {
          K = V ? "k" : "";
        } else if (M.name === "down") {
          K = V ? "j" : "";
        } else if (M.name === "return") {
          K = V ? "j" : `
`;
        } else if (M.name === "backspace") {
          K = V ? "h" : "";
        } else if (M.name === "delete") {
          K = V && P.command.type !== "count" ? "x" : "";
        } else if (M.key === "" || Jql.vZc(M.name)) {
          M.preventDefault();
          return;
        } else if ([...M.key].length > 1) {
          M.preventDefault();
          return;
        }
        H();
        let J = zql(P.command, K, z);
        let Q = P.kind === "line";
        if ("next" in J) {
          J.move?.();
          p.current = {
            mode: "VISUAL",
            kind: P.kind,
            anchor: P.anchor,
            command: J.next
          };
        } else if (J.exit === "operator") {
          if (kql(J.op, P.anchor, z, Q || J.forceLinewise === true), p.current.mode === "VISUAL") {
            S();
          }
        } else if (J.exit === "replace") {
          Oql(J.char, P.anchor, z, Q);
          S();
        } else if (J.exit === "case") {
          Nql(J.op, P.anchor, z, Q);
          S();
        } else if (J.exit === "paste") {
          if (z.getRegister()) {
            Fql(P.anchor, z, Q);
            S();
          } else {
            p.current = {
              ...P,
              command: {
                type: "idle"
              }
            };
          }
        } else if (J.exit === "join") {
          wql(P.anchor, z);
          S();
        } else if (J.exit === "indent") {
          Cql(J.dir, J.count, P.anchor, z);
          S();
        } else if (J.exit === "swap") {
          let Z = F.offset;
          L.setOffset(P.anchor);
          p.current = {
            mode: "VISUAL",
            kind: P.kind,
            anchor: Z,
            command: {
              type: "idle"
            }
          };
          g(Z);
        } else if (J.exit === "selectRange") {
          let Z = J.end > J.start ? F.measuredText.prevOffset(J.end) : J.start;
          L.setOffset(Z);
          p.current = {
            mode: "VISUAL",
            kind: P.kind,
            anchor: J.start,
            command: {
              type: "idle"
            }
          };
          g(J.start);
        } else {
          let Z = J.key === "V" ? "line" : "char";
          if (Z === P.kind) {
            S();
          } else {
            E(P.anchor, Z);
          }
        }
        M.preventDefault();
        return;
      }
      if (P.mode !== "NORMAL") {
        return;
      }
      if (P.command.type === "idle" && (M.name === "up" || M.name === "down") && !M.shift) {
        L.handleKeyDown(M);
        return;
      }
      if (H(), P.command.type === "idle" && M.key === "/" && a) {
        a();
        M.preventDefault();
        return;
      }
      if (P.command.type === "idle") {
        if (M.key === "k") {
          let z = F.text.indexOf(`
`);
          if (z === -1 || F.offset <= z) {
            l?.();
            M.preventDefault();
            return;
          }
        }
        if (M.key === "j") {
          let z = F.text.lastIndexOf(`
`);
          if (z === -1 || F.offset > z) {
            c?.();
            M.preventDefault();
            return;
          }
        }
      }
      let U = {
        ...C(F, L, false),
        onUndo: i,
        onDotRepeat: A
      };
      let N = P.command.type === "idle" || P.command.type === "count" || P.command.type === "operator" || P.command.type === "operatorCount";
      let W = M.key;
      if (M.name === "left") {
        W = "h";
      } else if (M.name === "right") {
        W = "l";
      } else if (M.name === "up") {
        W = "k";
      } else if (M.name === "down") {
        W = "j";
      } else if (N && M.name === "backspace") {
        W = "h";
      } else if (N && P.command.type !== "count" && M.name === "delete") {
        W = "x";
      } else if (M.key === "" || Jql.vZc(M.name)) {
        return;
      } else if ([...M.key].length > 1) {
        k(M.key, L);
        M.preventDefault();
        return;
      }
      if ((W === "v" || W === "V") && (P.command.type === "idle" || P.command.type === "count")) {
        E(F.offset, W === "V" ? "line" : "char");
        return;
      }
      let j = Fjo(P.command, W, U);
      if (j.execute) {
        j.execute();
      }
      if (p.current.mode === "NORMAL") {
        if (j.next) {
          p.current = {
            mode: "NORMAL",
            command: j.next
          };
        } else if (j.execute) {
          p.current = {
            mode: "NORMAL",
            command: {
              type: "idle"
            }
          };
        }
      }
      if (M.key === "?" && P.mode === "NORMAL" && P.command.type === "idle") {
        n("?");
      }
      M.preventDefault();
    }
    let O = BZ.useCallback(M => {
      if (M === "INSERT") {
        p.current = {
          mode: "INSERT",
          insertedText: ""
        };
        g(null);
      } else if (M === "NORMAL") {
        p.current = {
          mode: "NORMAL",
          command: {
            type: "idle"
          }
        };
        g(null);
      } else {
        let L = M === "VISUAL LINE" ? "line" : "char";
        let P = d.current?.offset ?? 0;
        p.current = {
          mode: "VISUAL",
          kind: L,
          anchor: P,
          command: {
            type: "idle"
          }
        };
        g(P);
      }
      f(M);
      s?.(M);
    }, [s]);
    return {
      handleKeyDown: I,
      mode: m,
      setMode: O,
      visualAnchor: h,
      baseRef: d,
      recordInsertedText: _
    };
  }
  function Xql(e) {
    let {
      inputFilter: t
    } = e;
    let n = Ujo({
      value: e.value,
      onChange: e.onChange,
      columns: e.columns,
      disableEscapeDoublePress: e.disableEscapeDoublePress,
      onModeChange: e.onModeChange,
      onUndo: e.onUndo,
      onOpenHistorySearch: e.onOpenHistorySearch,
      onHistoryUp: e.onHistoryUp,
      onHistoryDown: e.onHistoryDown,
      inputFilter: t
    });
    let r = ULn({
      ...e,
      selectionAnchor: n.visualAnchor,
      selectionLinewise: n.mode === "VISUAL LINE",
      inputFilter: (o, s) => {
        let i = t ? t(o, s) : o;
        n.recordInsertedText(i, s);
        return i;
      }
    });
    n.baseRef.current = r;
    return {
      ...r,
      handleKeyDown: n.handleKeyDown,
      mode: n.mode,
      setMode: n.setMode
    };
  }
  var BZ;
  var Jql;
  var Bjo = __lazy(() => {
    uGe();
    PP();
    Ojo();
    Yql();
    Ljo();
    yoo();
    BZ = __toESM(ot(), 1);
    Jql = new Set(["backspace", "delete", "tab", "home", "end", "pageup", "pagedown", "insert", "clear", "enter", "center", "undefined", "mouse", "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8", "f9", "f10", "f11", "f12"]);
  });
  function uqm(e) {
    if (e.ctrl && (e.key === "k" || e.key === "u" || e.key === "w")) {
      return true;
    }
    if (e.meta && e.key === "backspace") {
      return true;
    }
    return false;
  }
  function dqm(e) {
    return (e.ctrl || e.meta) && e.key === "y";
  }
  function U0({
    isActive: e,
    onExit: t,
    onCancel: n,
    onExitUp: r,
    onExitDown: o,
    columns: s,
    passthroughCtrlKeys: i = [],
    initialQuery: a = "",
    backspaceExitsOnEmpty: l = true,
    multiline: c = false,
    onSpaceOnEmpty: u,
    onTabOnEmpty: d,
    killRing: p,
    onChange: m,
    honorEditorMode: f = false
  }) {
    let h = TLn();
    let g = p ?? h;
    let {
      columns: y
    } = Sr();
    let _ = s ?? y;
    let [b, S] = oie.useState(a);
    let [E, C] = oie.useState(a.length);
    let x = oie.useRef(b);
    let A = oie.useRef(E);
    let k = oie.useRef(m);
    k.current = m;
    let I = oie.useCallback(N => {
      x.current = N;
      S(N);
      k.current?.(N);
    }, []);
    let O = oie.useCallback(N => {
      A.current = N;
      C(N);
    }, []);
    let M = oie.useCallback(N => {
      I(N);
      O(N.length);
    }, [I, O]);
    let L = N => {
      if (!e) {
        return;
      }
      let W = x.current;
      let j = A.current;
      let z = zl.fromText(W, _, j);
      if (N.ctrl && i.includes(N.key.toLowerCase())) {
        return;
      }
      if (!uqm(N) && !dqm(N)) {
        g.dispatch({
          type: "interrupt"
        });
      }
      if (N.name === "return") {
        if (N.preventDefault(), c) {
          if (j > 0 && W[j - 1] === "\\") {
            I(W.slice(0, j - 1) + `
` + W.slice(j));
            return;
          }
          if (N.shift || N.meta) {
            I(W.slice(0, j) + `
` + W.slice(j));
            O(j + 1);
            return;
          }
        }
        t();
        return;
      }
      if (c && N.name === "enter") {
        N.preventDefault();
        let V = z.insert(`
`);
        I(V.text);
        O(V.offset);
        return;
      }
      if (N.name === "down") {
        if (N.preventDefault(), c) {
          let V = z.down();
          if (!V.equals(z)) {
            O(V.offset);
            return;
          }
        }
        if (o) {
          o();
        } else if (!c) {
          t();
        }
        return;
      }
      if (N.name === "up") {
        if (N.preventDefault(), c) {
          let V = z.up();
          if (!V.equals(z)) {
            O(V.offset);
            return;
          }
        }
        if (r) {
          r();
        }
        return;
      }
      if (N.name === "escape") {
        if (N.preventDefault(), n) {
          n();
        } else if (W.length > 0) {
          I("");
          O(0);
        } else {
          t();
        }
        return;
      }
      if (N.name === "backspace") {
        if (N.preventDefault(), N.meta) {
          let {
            cursor: K,
            killed: J
          } = z.deleteWordBefore();
          g.dispatch({
            type: "kill",
            text: J,
            direction: "prepend"
          });
          I(K.text);
          O(K.offset);
          return;
        }
        if (W.length === 0) {
          if (l) {
            (n ?? t)();
          }
          return;
        }
        let V = z.backspace();
        I(V.text);
        O(V.offset);
        return;
      }
      if (N.name === "delete") {
        N.preventDefault();
        let V = z.del();
        I(V.text);
        O(V.offset);
        return;
      }
      if (N.name === "left" && (N.ctrl || N.meta || N.fn)) {
        N.preventDefault();
        let V = z.prevWord();
        O(V.offset);
        return;
      }
      if (N.name === "right" && (N.ctrl || N.meta || N.fn)) {
        N.preventDefault();
        let V = z.nextWord();
        O(V.offset);
        return;
      }
      if (N.name === "left") {
        N.preventDefault();
        let V = z.left();
        O(V.offset);
        return;
      }
      if (N.name === "right") {
        N.preventDefault();
        let V = z.right();
        O(V.offset);
        return;
      }
      if (N.name === "home") {
        N.preventDefault();
        O(z.startOfLine().offset);
        return;
      }
      if (N.name === "end") {
        N.preventDefault();
        O(z.endOfLine().offset);
        return;
      }
      if (N.ctrl) {
        switch (N.preventDefault(), N.key.toLowerCase()) {
          case "a":
            O(z.startOfLogicalLine().offset);
            return;
          case "e":
            O(z.endOfLogicalLine().offset);
            return;
          case "b":
            O(z.left().offset);
            return;
          case "f":
            O(z.right().offset);
            return;
          case "d":
            {
              if (W.length === 0) {
                (n ?? t)();
                return;
              }
              let V = z.del();
              I(V.text);
              O(V.offset);
              return;
            }
          case "h":
            {
              if (W.length === 0) {
                if (l) {
                  (n ?? t)();
                }
                return;
              }
              let V = z.backspace();
              I(V.text);
              O(V.offset);
              return;
            }
          case "k":
            {
              let {
                cursor: V,
                killed: K
              } = z.deleteToLineEnd();
              g.dispatch({
                type: "kill",
                text: K,
                direction: "append"
              });
              I(V.text);
              O(V.offset);
              return;
            }
          case "u":
            {
              let {
                cursor: V,
                killed: K
              } = z.deleteToLineStart();
              g.dispatch({
                type: "kill",
                text: K,
                direction: "prepend"
              });
              I(V.text);
              O(V.offset);
              return;
            }
          case "w":
            {
              let {
                cursor: V,
                killed: K
              } = z.deleteWordBefore();
              g.dispatch({
                type: "kill",
                text: K,
                direction: "prepend"
              });
              I(V.text);
              O(V.offset);
              return;
            }
          case "y":
            {
              let V = bLn(g.state);
              if (V.length > 0) {
                let K = z.offset;
                let J = z.insert(V);
                g.dispatch({
                  type: "yank",
                  start: K,
                  length: V.length
                });
                I(J.text);
                O(J.offset);
              }
              return;
            }
          case "g":
          case "c":
            if (n) {
              n();
              return;
            }
        }
        return;
      }
      if (N.meta) {
        switch (N.preventDefault(), N.key.toLowerCase()) {
          case "b":
            O(z.prevWord().offset);
            return;
          case "f":
            O(z.nextWord().offset);
            return;
          case "d":
            {
              let V = z.deleteWordAfter();
              I(V.text);
              O(V.offset);
              return;
            }
          case "y":
            {
              let V = SLn(g.state);
              if (V) {
                let {
                  text: K,
                  start: J,
                  length: Q
                } = V;
                g.dispatch({
                  type: "yankPop"
                });
                let Z = W.slice(0, J);
                let ne = W.slice(J + Q);
                let oe = Z + K + ne;
                let ee = J + K.length;
                g.dispatch({
                  type: "updateYankLength",
                  length: K.length
                });
                I(oe);
                O(ee);
              }
              return;
            }
        }
        return;
      }
      if (N.name === "tab") {
        if (N.preventDefault(), d && W === "") {
          d();
        }
        return;
      }
      if (u && N.key === " " && W === "") {
        N.preventDefault();
        u();
        return;
      }
      if (N.key.length >= 1 && !pqm.vZc(N.name)) {
        N.preventDefault();
        let V = z.insert(N.key);
        I(V.text);
        O(V.offset);
      }
    };
    let P = f && mL();
    let F = Ujo({
      value: b,
      onChange: I,
      columns: _,
      onHistoryUp: r,
      onHistoryDown: o
    });
    F.baseRef.current = {
      handleKeyDown: L,
      offset: E,
      setOffset: O
    };
    return {
      query: b,
      queryRef: x,
      setQuery: M,
      cursorOffset: E,
      setCursorOffset: O,
      handleKeyDown: N => {
        if (!P) {
          L(N);
          return;
        }
        if (!e) {
          return;
        }
        if (N.name === "escape" && F.mode === "NORMAL") {
          F.handleKeyDown(N);
          L(N);
          return;
        }
        F.handleKeyDown(N);
      },
      handlePaste: N => {
        if (!e || N.text.length === 0) {
          return;
        }
        N.preventDefault();
        let W = c ? N.text.replace(/\r\n|\r/g, `
`) : N.text.split(/\r\n|\r|\n/, 2)[0] ?? "";
        if (W.length === 0) {
          return;
        }
        let z = zl.fromText(x.current, _, A.current).insert(W);
        I(z.text);
        O(z.offset);
      },
      vimMode: P ? F.mode : undefined
    };
  }
  var oie;
  var pqm;
  var sie = __lazy(() => {
    oUe();
    ELn();
    uGe();
    ki();
    Bjo();
    oie = __toESM(ot(), 1);
    pqm = new Set(["pageup", "pagedown", "insert", "wheelup", "wheeldown", "mouse", "clear", "enter", "f1", "f2", "f3", "f4", "f5", "f6", "f7", "f8", "f9", "f10", "f11", "f12"]);
  });
  function Hjo(e) {
    return mqm.vZc(e);
  }
  function t3l(e, t) {
    return e === "Advanced" ? Hjo(t) ? "ADVANCED \u2014 MOVING TO SETTINGS.JSON" : "ADVANCED" : e.toUpperCase();
  }
  function jjo(e) {
    return fqm.get(e) ?? "Advanced";
  }
  function r3l(e) {
    return e.map((t, n) => ({
      item: t,
      i: n
    })).sort((t, n) => {
      let r = (Qql.get(t.item.id) ?? Zql) - (Qql.get(n.item.id) ?? Zql);
      return r !== 0 ? r : t.i - n.i;
    }).map(({
      item: t
    }) => t);
  }
  var $jo;
  var e3l;
  var tir;
  var mqm;
  var n3l;
  var fqm;
  var Qql;
  var Zql;
  var o3l = __lazy(() => {
    $jo = ["Appearance", "Model & output", "Display", "Input & controls", "Connections", "Advanced", "Experimental", "Internal"];
    e3l = new Set(["Advanced", "Experimental", "Internal"]);
    tir = [{
      id: "autoUpdatesChannel",
      isSet: ({
        settingsData: e
      }) => e?.autoUpdatesChannel !== undefined
    }, {
      id: "worktreeBaseRef",
      isSet: ({
        settingsData: e
      }) => e?.worktree?.baseRef !== undefined
    }, {
      id: "gitignore",
      isSet: ({
        globalConfig: e
      }) => e.respectGitignore !== DEFAULT_GLOBAL_CONFIG.respectGitignore
    }, {
      id: "copyFullResponse",
      isSet: ({
        globalConfig: e
      }) => e.copyFullResponse !== DEFAULT_GLOBAL_CONFIG.copyFullResponse
    }, {
      id: "recap",
      isSet: ({
        settingsData: e
      }) => e?.awaySummaryEnabled !== undefined
    }];
    mqm = new Set(tir.map(e => e.id));
    n3l = {
      Appearance: ["theme", "language", "reduceMotion"],
      "Model & output": ["model", "fast", "switchModelsOnFlag", "outputStyle", "defaultView", "verbose", "autoCompact", "thinking", "permissionMode", "useAutoModeDuringPlan"],
      Display: ["autoScroll", "progressBar", "tips", "turnDuration", "prStatus", "externalEditorContext"],
      "Input & controls": ["editor", "copyOnSelect", "promptSuggestionEnabled", "agentsView", "checkpoints", "workflows", "workflowKeywordTriggerEnabled", "artifacts"],
      Connections: ["notifChannel", "inputNeededNotifEnabled", "agentPushNotifEnabled", "autoConnectIde", "autoInstallIdeExtension", "diffTool", "chrome", "remoteControl", "showExternalIncludesDialog", "apiKey"],
      Advanced: tir.map(e => e.id),
      Experimental: ["precomputeCompactionEnabled", "timestamps", "showStatusInTerminalTab", "teammateMode", "teammateDefaultModel"],
      Internal: [...[], "snipEnabled", "snipDebug", "doneMeansMerged", "autoUploadSessions", "autoAddRemoteControlDaemonWorker", "autofixPrMode"]
    };
    fqm = new Map($jo.flatMap(e => n3l[e].map(t => [t, e])));
    Qql = new Map($jo.flatMap((e, t) => n3l[e].map((n, r) => [n, t * 1000 + r])));
    Zql = $jo.indexOf("Advanced") * 1000 + 999;
  });
  function l3l({
    onClose: e,
    context: t,
    setTabsHidden: n,
    onIsSearchModeChange: r,
    contentHeight: o
  }) {
    let {
      headerFocused: s,
      focusHeader: i
    } = zM();
    let a = nE();
    let [, l] = useTheme();
    let c = useThemeSetting();
    let [u, d] = kf.useState(wvt);
    let p = kf.useRef(u);
    let [m, f] = kf.useState(getInitialSettings());
    let h = kf.useRef(getInitialSettings());
    let [g, y] = kf.useState(m?.outputStyle || "default");
    let _ = kf.useRef(g);
    let [b, S] = kf.useState(() => getCurrentProjectConfig().hasClaudeMdExternalIncludesApproved === true);
    let [E, C] = kf.useState(m?.language);
    let x = kf.useRef(E);
    let [A, k] = kf.useState(0);
    let [I, O] = kf.useState(0);
    let M = useIsScreenReaderEnabled();
    let [L, P] = kf.useState(!M);
    let F = useTerminalFocus();
    let {
      rows: H,
      columns: U
    } = Sr();
    let N = Math.min(44, Math.max(14, U - 16));
    let W = o ?? Math.min(Math.floor(H * 0.8), 30);
    let j = Math.max(5, W - 10);
    let z = bt(Ce => Ce.mainLoopModel);
    let V = bt(Ce => Ce.verbose);
    let K = bt(Ce => Ce.thinkingEnabled);
    let J = bt(Ce => lc() ? Ce.fastMode : false);
    let Q = bt(Ce => Ce.promptSuggestionEnabled);
    let Z = bt(Ce => Ce.awaySummaryEnabled);
    let ne = hasAutoModeOptInAnySource() || getAutoModeEnabledState() === "enabled";
    let oe = (D3(), __toCommonJS(CZ)).isBriefEntitled();
    let ee = Lo();
    let [re, se] = kf.useState({});
    let ae = kf.useRef(K);
    kf.useEffect(() => wjl(() => d(wvt())), []);
    let [de, be] = kf.useState(false);
    let [fe, me] = kf.useState(null);
    let [Te, ue] = kf.useState(0);
    let {
      query: ce,
      setQuery: le,
      cursorOffset: pe,
      handleKeyDown: ve,
      handlePaste: _e
    } = U0({
      isActive: L && fe === null && !s,
      onExit: () => P(false),
      onExitUp: i,
      passthroughCtrlKeys: ["c", "d"]
    });
    let xe = !s;
    kf.useEffect(() => {
      r(xe);
    }, [xe, r]);
    let ke = B6e(t.options.mcpClients);
    let Ie = !Me.CLAUDE_CODE_DISABLE_FILE_CHECKPOINTING;
    let Ue = uc("disableWorkflows", false);
    let Ge = uc("enableWorkflows", false);
    let Be = CDn() && (Ue.value !== true || Ue.source === "userSettings") && (Ge.source === "default" || Ge.source === "userSettings");
    let We = uc("disableArtifact", false);
    let Ze = isArtifactConfigurable() && (We.value !== true || We.source === "userSettings") && isEnableArtifactUserControllable();
    let Tt = kf.use(getMemoryFiles(true));
    let kt = hasExternalClaudeMdIncludes(Tt);
    let Ye = getAutoUpdaterDisabledReason();
    let ht = _de() && !Vi() && hasStoredOAuthToken();
    let {
      settings: It,
      helpers: {
        onChangeMainModelConfig: Rt,
        changeNotifChannel: wt,
        changeInputNeededNotif: vt,
        changeAgentPushNotif: yt
      }
    } = Cvt({
      globalConfig: u,
      settingsData: m,
      themeSetting: c,
      currentOutputStyle: g,
      currentLanguage: E,
      externalIncludesApproved: b,
      thinkingEnabled: K,
      verbose: V,
      mainLoopModel: z,
      isFastMode: J,
      promptSuggestionEnabled: Q,
      awaySummaryEnabled: Z,
      showAutoInDefaultModePicker: ne,
      showDefaultViewPicker: oe,
      pushTogglesVisible: ht,
      isConnectedToIde: ke,
      isFileCheckpointingAvailable: Ie,
      workflowsToggleable: Be,
      artifactToggleable: Ze,
      shouldShowExternalIncludesToggle: kt,
      autoUpdaterDisabledReason: Ye,
      setAppState: ee,
      setTheme: l,
      setGlobalConfig: d,
      setSettingsData: f,
      setChanges: se
    });
    let gt = YFe();
    let Ft = kf.useMemo(() => {
      let Ce = gt ? r3l(It) : It;
      if (!ce) {
        return Ce;
      }
      let Fe = ce.toLowerCase();
      return Ce.filter(Xe => {
        if (Xe.id.toLowerCase().includes(Fe)) {
          return true;
        }
        if (("searchText" in Xe ? Xe.searchText : Xe.label).toLowerCase().includes(Fe)) {
          return true;
        }
        if (Xe.type === "enum") {
          return Xe.options.some(Gt => Gt.toLowerCase().includes(Fe));
        }
        return false;
      });
    }, [It, ce, gt]);
    kf.useEffect(() => {
      if (A >= Ft.length) {
        let Ce = Math.max(0, Ft.length - 1);
        k(Ce);
        O(Math.max(0, Ce - j + 1));
        return;
      }
      O(Ce => {
        if (A < Ce) {
          return A;
        }
        if (A >= Ce + j) {
          return A - j + 1;
        }
        return Ce;
      });
    }, [Ft.length, A, j]);
    let on = kf.useCallback(Ce => {
      O(Fe => {
        if (Ce < Fe) {
          return Ce;
        }
        if (Ce >= Fe + j) {
          return Ce - j + 1;
        }
        return Fe;
      });
    }, [j]);
    let rn = kf.useCallback(() => {
      if (fe !== null) {
        return;
      }
      let Ce = Object.entries(re).map(([Gt, mt]) => (logEvent("tengu_config_changed", {
        key: Gt,
        setting: Gt,
        value: i3i.createHash("sha256").update(String(mt)).digest("hex").slice(0, 12)
      }), `Set ${Gt} to ${_$u.bold(mt)}`));
      let Fe = cC() ? undefined : process.env.ANTHROPIC_API_KEY;
      let Xe = Boolean(Fe && p.current.customApiKeyResponses?.approved?.includes(a2(Fe)));
      let He = Boolean(Fe && u.customApiKeyResponses?.approved?.includes(a2(Fe)));
      if (Xe !== He) {
        Ce.push(`${He ? "Enabled" : "Disabled"} custom API key`);
        logEvent("tengu_config_changed", {
          key: "env.ANTHROPIC_API_KEY",
          setting: "env.ANTHROPIC_API_KEY",
          value: He
        });
      }
      if (u.theme !== p.current.theme) {
        Ce.push(`Set theme to ${_$u.bold(u.theme)}`);
      }
      if (u.preferredNotifChannel !== p.current.preferredNotifChannel) {
        Ce.push(`Set notifications to ${_$u.bold(u.preferredNotifChannel)}`);
      }
      if (g !== _.current) {
        Ce.push(`Set output style to ${_$u.bold(g)}`);
      }
      if (E !== x.current) {
        Ce.push(`Set response language to ${_$u.bold(E ?? "Default (English)")}`);
      }
      if (u.editorMode !== p.current.editorMode) {
        Ce.push(`Set editor mode to ${_$u.bold(u.editorMode || "emacs")}`);
      }
      if (u.diffTool !== p.current.diffTool) {
        Ce.push(`Set diff tool to ${_$u.bold(u.diffTool)}`);
      }
      if (u.autoConnectIde !== p.current.autoConnectIde) {
        Ce.push(`${u.autoConnectIde ? "Enabled" : "Disabled"} auto-connect to IDE`);
      }
      if (u.autoInstallIdeExtension !== p.current.autoInstallIdeExtension) {
        Ce.push(`${u.autoInstallIdeExtension ? "Enabled" : "Disabled"} auto-install IDE extension`);
      }
      if (u.autoCompactEnabled !== p.current.autoCompactEnabled) {
        Ce.push(`${u.autoCompactEnabled ? "Enabled" : "Disabled"} auto-compact`);
      }
      if (u.autoScrollEnabled !== p.current.autoScrollEnabled) {
        Ce.push(`${u.autoScrollEnabled ? "Enabled" : "Disabled"} auto-scroll`);
      }
      if (u.respectGitignore !== p.current.respectGitignore) {
        Ce.push(`${u.respectGitignore ? "Enabled" : "Disabled"} respect .gitignore in file picker`);
      }
      if (u.copyFullResponse !== p.current.copyFullResponse) {
        Ce.push(`${u.copyFullResponse ? "Enabled" : "Disabled"} always copy full response`);
      }
      if (u.copyOnSelect !== p.current.copyOnSelect) {
        Ce.push(`${u.copyOnSelect ? "Enabled" : "Disabled"} copy on select`);
      }
      if (u.leftArrowOpensAgents !== p.current.leftArrowOpensAgents) {
        Ce.push(`${u.leftArrowOpensAgents ?? true ? "Enabled" : "Disabled"} ${"\u2190"} opens agents`);
      }
      if (u.defaultToAgentsView !== p.current.defaultToAgentsView) {
        Ce.push(`${u.defaultToAgentsView ? "Enabled" : "Disabled"} open agents view by default`);
      }
      if (u.terminalProgressBarEnabled !== p.current.terminalProgressBarEnabled) {
        Ce.push(`${u.terminalProgressBarEnabled ? "Enabled" : "Disabled"} terminal progress bar`);
      }
      if (u.showStatusInTerminalTab !== p.current.showStatusInTerminalTab) {
        Ce.push(`${u.showStatusInTerminalTab ? "Enabled" : "Disabled"} terminal tab status`);
      }
      if (u.showTurnDuration !== p.current.showTurnDuration) {
        Ce.push(`${u.showTurnDuration ? "Enabled" : "Disabled"} turn duration`);
      }
      if (u.showMessageTimestamps !== p.current.showMessageTimestamps) {
        Ce.push(`${u.showMessageTimestamps ? "Enabled" : "Disabled"} message timestamps`);
      }
      if (u.remoteControlAtStartup !== p.current.remoteControlAtStartup) {
        let Gt = u.remoteControlAtStartup === undefined ? "Reset Remote Control to default" : `${u.remoteControlAtStartup ? "Enabled" : "Disabled"} Remote Control for all sessions`;
        Ce.push(Gt);
      }
      if (m?.autoUpdatesChannel !== h.current?.autoUpdatesChannel) {
        Ce.push(`Set auto-update channel to ${_$u.bold(m?.autoUpdatesChannel === "rc" ? "slow" : m?.autoUpdatesChannel ?? "latest")}`);
      }
      if (Ce.length > 0) {
        e(Ce.join(`
`));
      } else {
        e("Config dialog dismissed", {
          display: "system"
        });
      }
    }, [fe, re, u, z, g, E, m?.autoUpdatesChannel, lc() ? m?.fastMode : undefined, e]);
    uo("confirm:no", rn, {
      context: "Settings",
      isActive: fe === null && !L && !s && !M
    });
    let Sn = kf.useCallback(Ce => gt && Ce.type === "managedEnum" && Ce.id === "showExternalIncludesDialog" && b, [gt, b]);
    let jn = kf.useCallback(Ce => tir.find(Fe => Fe.id === Ce)?.isSet({
      settingsData: m,
      globalConfig: u
    }) ?? false, [m, u]);
    let Xr = kf.useCallback(Ce => {
      let Xe = Ft[Ce ?? A];
      if (!Xe || !Xe.onChange) {
        return;
      }
      if (Xe.type === "boolean") {
        let He = !Xe.value;
        if (Xe.onChange(He), logEvent("tengu_config_changed", {
          setting: Xe.id,
          value: String(He)
        }), Xe.id === "thinking") {
          if (He === ae.current) {
            be(false);
          } else if (t.messages.some(mt => mt.type === "assistant")) {
            be(true);
          }
        }
        return;
      }
      if (Sn(Xe)) {
        recordExternalIncludesDecision(false, "config_toggle");
        S(false);
        return;
      }
      if (Xe.id === "agentsView") {
        ue(0);
        me("AgentsView");
        n(true);
        return;
      }
      if (Xe.id === "notifChannel" && Xe.type === "managedEnum") {
        me("Notifications");
        n(true);
        return;
      }
      if (Xe.id === "theme" || Xe.id === "model" || Xe.id === "teammateDefaultModel" || Xe.id === "showExternalIncludesDialog" || Xe.id === "outputStyle" || Xe.id === "language") {
        switch (Xe.id) {
          case "theme":
            me("Theme");
            n(true);
            return;
          case "model":
            me("Model");
            n(true);
            return;
          case "teammateDefaultModel":
            me("TeammateModel");
            n(true);
            return;
          case "showExternalIncludesDialog":
            me("ExternalIncludes");
            n(true);
            return;
          case "outputStyle":
            me("OutputStyle");
            n(true);
            return;
          case "language":
            me("Language");
            n(true);
            return;
        }
      }
      if (Xe.id === "autoUpdatesChannel") {
        if (Ye) {
          me("EnableAutoUpdates");
          n(true);
          return;
        }
        if ((m?.autoUpdatesChannel ?? "latest") === "latest") {
          me("ChannelDowngrade");
          n(true);
        } else {
          updateSettingsForSource("userSettings", {
            autoUpdatesChannel: undefined,
            minimumVersion: undefined
          });
          f(Gt => ({
            ...Gt,
            autoUpdatesChannel: undefined,
            minimumVersion: undefined
          }));
          logEvent("tengu_autoupdate_channel_changed", {
            channel: "latest"
          });
        }
        return;
      }
      if (Xe.type === "enum") {
        let Gt = (Xe.options.indexOf(Xe.value) + 1) % Xe.options.length;
        let mt = Xe.options[Gt];
        Xe.onChange(mt);
        logEvent("tengu_config_changed", {
          setting: Xe.id,
          value: mt
        });
        return;
      }
    }, [Ye, Sn, Ft, A, m?.autoUpdatesChannel, n]);
    let co = Ce => {
      be(false);
      let Fe = Math.max(0, Math.min(Ft.length - 1, A + Ce));
      k(Fe);
      on(Fe);
    };
    jo({
      "select:previous": () => {
        if (A === 0) {
          be(false);
          P(true);
          O(0);
        } else {
          co(-1);
        }
      },
      "select:next": () => co(1),
      "scroll:lineUp": () => co(-1),
      "scroll:lineDown": () => co(1),
      "select:accept": () => Xr(),
      "settings:search": () => {
        P(true);
        le("");
      }
    }, {
      context: "Settings",
      isActive: fe === null && !L && !s && !M
    });
    let Yt = kf.useMemo(() => [...(hFe() ? [{
      id: "leftArrowOpensAgents",
      label: `${"\u2190"} opens agents`,
      value: u.leftArrowOpensAgents ?? true
    }] : []), ...(isAgentsFleetEnabled() ? [{
      id: "defaultToAgentsView",
      label: "Start in agent view",
      value: u.defaultToAgentsView ?? false
    }] : [])], [u.leftArrowOpensAgents, u.defaultToAgentsView]);
    let Ee = kf.useCallback(Ce => {
      let Fe = Yt[Ce ?? Te];
      if (!Fe) {
        return;
      }
      let Xe = !Fe.value;
      if (Fe.id === "leftArrowOpensAgents") {
        saveGlobalConfig(He => ({
          ...He,
          leftArrowOpensAgents: Xe
        }));
        d(He => ({
          ...He,
          leftArrowOpensAgents: Xe
        }));
      } else {
        saveGlobalConfig(He => ({
          ...He,
          defaultToAgentsView: Xe
        }));
        d(He => ({
          ...He,
          defaultToAgentsView: Xe
        }));
      }
      logEvent("tengu_config_changed", {
        setting: Fe.id,
        value: Xe ? "true" : "false"
      });
    }, [Yt, Te]);
    jo({
      "select:previous": () => ue(Ce => Math.max(0, Ce - 1)),
      "select:next": () => ue(Ce => Math.min(Yt.length - 1, Ce + 1)),
      "select:accept": () => Ee()
    }, {
      context: "Settings",
      isActive: fe === "AgentsView" && !M
    });
    let Re = kf.useCallback(Ce => {
      if (fe !== null) {
        return;
      }
      if (s) {
        return;
      }
      if (L) {
        if (ve(Ce), Ce.key === "escape") {
          if (Ce.preventDefault(), ce.length > 0) {
            le("");
          } else {
            P(false);
          }
          return;
        }
        if (Ce.key === "return" || Ce.key === "down") {
          Ce.preventDefault();
          P(false);
          k(0);
          O(0);
        }
        return;
      }
      if (Ce.key === "left" || Ce.key === "right" || Ce.key === "tab") {
        Ce.preventDefault();
        Xr();
        return;
      }
      if (Ce.ctrl || Ce.meta) {
        return;
      }
      if (Ce.key.length === 1 && Ce.key !== " ") {
        Ce.preventDefault();
        P(true);
        le(Ce.key === "/" ? "" : Ce.key);
      }
    }, [fe, s, L, ce, le, ve, Xr]);
    return ns.jsx(gXd, {
      flexDirection: "column",
      width: "100%",
      ...(M ? {} : {
        tabIndex: 0,
        autoFocus: !s,
        onKeyDown: Re,
        onPaste: _e
      }),
      children: fe === "Theme" ? ns.jsxs(ns.Fragment, {
        children: [ns.jsx(xvt, {
          onThemeSelect: Ce => {
            l(Ce);
            me(null);
            n(false);
          },
          onCancel: () => {
            me(null);
            n(false);
          },
          helpText: Pc("themes") ? `Custom themes are disabled in safe mode \u2014 ${UR()} to load them${tG(c) ? `. Your saved theme "${tG(c)}" is a custom theme; selecting a preset here replaces it` : ""}` : "",
          hideEscToCancel: true,
          skipExitHandling: true
        }), ns.jsx(gXd, {
          children: ns.jsx(Text, {
            dimColor: true,
            italic: true,
            children: ns.jsxs(Hn, {
              children: [ns.jsx(xt, {
                chord: "enter",
                action: "select"
              }), ns.jsx(Wr, {
                action: "confirm:no",
                context: "Confirmation",
                fallback: "Esc",
                description: "cancel"
              })]
            })
          })
        })]
      }) : fe === "Model" ? ns.jsxs(ns.Fragment, {
        children: [ns.jsx(nUe, {
          initial: z,
          onSelect: (Ce, Fe) => {
            Rt(Ce);
            me(null);
            n(false);
          },
          onCancel: () => {
            me(null);
            n(false);
          },
          showFastModeNotice: lc() ? J && yh(z) && zA() : false
        }), ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })]
      }) : fe === "TeammateModel" ? ns.jsxs(ns.Fragment, {
        children: [ns.jsx(nUe, {
          initial: u.teammateDefaultModel ?? null,
          skipSettingsWrite: true,
          headerText: "Default model for newly spawned teammates. The leader can override via the tool call's model parameter.",
          onSelect: (Ce, Fe) => {
            if (me(null), n(false), u.teammateDefaultModel === undefined && Ce === null) {
              return;
            }
            if (FZ(Ce)) {
              Et("model_fable_consent", "config_teammate_blocked");
              se(Xe => ({
                ...Xe,
                teammateDefaultModel: `${ksr(u.teammateDefaultModel)} (Fable 5 needs usage-credits consent \u2014 /model to set up)`
              }));
              return;
            }
            saveGlobalConfig(Xe => Xe.teammateDefaultModel === Ce ? Xe : {
              ...Xe,
              teammateDefaultModel: Ce
            });
            d(Xe => ({
              ...Xe,
              teammateDefaultModel: Ce
            }));
            se(Xe => ({
              ...Xe,
              teammateDefaultModel: ksr(Ce)
            }));
            logEvent("tengu_teammate_default_model_changed", {
              model: Ce
            });
          },
          onCancel: () => {
            me(null);
            n(false);
          }
        }), ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })]
      }) : fe === "ExternalIncludes" ? ns.jsxs(ns.Fragment, {
        children: [ns.jsx(ClaudeMdExternalIncludesDialog, {
          onDone: () => {
            S(getCurrentProjectConfig().hasClaudeMdExternalIncludesApproved === true);
            me(null);
            n(false);
          },
          externalIncludes: getExternalClaudeMdIncludes(Tt)
        }), ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "disable external includes"
            })]
          })
        })]
      }) : fe === "OutputStyle" ? ns.jsxs(ns.Fragment, {
        children: [ns.jsx(iql, {
          initialStyle: g,
          onComplete: Ce => {
            y(Ce ?? "default");
            me(null);
            n(false);
            updateSettingsForSource("localSettings", {
              outputStyle: Ce
            });
            logEvent("tengu_output_style_changed", {
              style: Ce ?? "default",
              source: "config_panel",
              settings_source: "localSettings"
            });
          },
          onCancel: () => {
            me(null);
            n(false);
          }
        }), ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })]
      }) : fe === "Language" ? ns.jsxs(ns.Fragment, {
        children: [ns.jsx(cql, {
          initialLanguage: E,
          onComplete: Ce => {
            C(Ce);
            me(null);
            n(false);
            updateSettingsForSource("userSettings", {
              language: Ce
            });
            logEvent("tengu_language_changed", {
              language: Ce ?? "default",
              source: "config_panel"
            });
          },
          onCancel: () => {
            me(null);
            n(false);
          }
        }), ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })]
      }) : fe === "AgentsView" ? ns.jsxs(or, {
        title: "Agents view",
        onCancel: () => {
          me(null);
          n(false);
        },
        hideBorder: true,
        hideInputGuide: true,
        children: [M ? ns.jsx(i3l, {
          rows: Yt.map(Ce => ({
            id: Ce.id,
            label: Ce.label,
            value: String(Ce.value)
          })),
          onSelect: Ce => Ee(Ce),
          onCancel: () => {
            me(null);
            n(false);
          },
          cancelHint: "Escape to close"
        }) : ns.jsx(gXd, {
          flexDirection: "column",
          children: Yt.map((Ce, Fe) => {
            let Xe = Fe === Te;
            return ns.jsxs(gXd, {
              children: [ns.jsx(gXd, {
                width: N,
                flexShrink: 0,
                marginRight: 1,
                children: ns.jsxs(Text, {
                  color: Xe ? "suggestion" : undefined,
                  wrap: "truncate-end",
                  children: [Xe ? vGd.pointer : " ", " ", Ce.label]
                })
              }), ns.jsx(Text, {
                color: Xe ? "suggestion" : undefined,
                children: String(Ce.value)
              })]
            }, Ce.id);
          })
        }), !M && ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: ["enter", "space"],
              action: "toggle"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "close"
            })]
          })
        })]
      }) : fe === "EnableAutoUpdates" ? ns.jsx(or, {
        title: "Enable Auto-Updates",
        onCancel: () => {
          me(null);
          n(false);
        },
        hideBorder: true,
        hideInputGuide: true,
        children: Ye?.type !== "config" ? ns.jsxs(ns.Fragment, {
          children: [ns.jsx(Text, {
            children: Ye?.type === "env" ? "Auto-updates are controlled by an environment variable and cannot be changed here." : "Auto-updates are disabled in development builds."
          }), Ye?.type === "env" && ns.jsxs(Text, {
            dimColor: true,
            children: ["Unset ", Ye.envVar, " to re-enable auto-updates."]
          })]
        }) : ns.jsx(xr, {
          options: [{
            label: "Enable with latest channel",
            value: "latest"
          }, {
            label: "Enable with stable channel",
            value: "stable"
          }],
          onChange: Ce => {
            me(null);
            n(false);
            saveGlobalConfig(Fe => ({
              ...Fe,
              autoUpdates: true
            }));
            d(Fe => ({
              ...Fe,
              autoUpdates: true
            }));
            updateSettingsForSource("userSettings", {
              autoUpdatesChannel: Ce,
              minimumVersion: undefined
            });
            f(Fe => ({
              ...Fe,
              autoUpdatesChannel: Ce,
              minimumVersion: undefined
            }));
            logEvent("tengu_autoupdate_enabled", {
              channel: Ce
            });
          }
        })
      }) : fe === "ChannelDowngrade" ? ns.jsx(nql, {
        currentVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        onChoice: Ce => {
          if (me(null), n(false), Ce === "cancel") {
            return;
          }
          let Fe = {
            autoUpdatesChannel: "stable"
          };
          if (Ce === "stay") {
            Fe.minimumVersion = {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION;
          }
          updateSettingsForSource("userSettings", Fe);
          f(Xe => ({
            ...Xe,
            ...Fe
          }));
          logEvent("tengu_autoupdate_channel_changed", {
            channel: "stable",
            minimum_version_set: Ce === "stay"
          });
        }
      }) : fe === "Notifications" ? ns.jsx(kjl, {
        channel: u.preferredNotifChannel,
        showInputNeededRow: ht && I2n(),
        showDoneRow: ht,
        inputNeededEnabled: u.inputNeededNotifEnabled ?? false,
        doneEnabled: u.agentPushNotifEnabled ?? false,
        onCycleChannel: () => {
          let Ce = eYe.indexOf(u.preferredNotifChannel);
          let Fe = eYe[(Ce + 1) % eYe.length];
          wt(Fe);
          logEvent("tengu_config_changed", {
            setting: "notifChannel",
            value: Fe
          });
        },
        onToggleInputNeeded: () => {
          let Ce = !(u.inputNeededNotifEnabled ?? false);
          vt(Ce);
          logEvent("tengu_config_changed", {
            setting: "inputNeededNotifEnabled",
            value: Ce ? "true" : "false"
          });
        },
        onToggleDone: () => {
          let Ce = !(u.agentPushNotifEnabled ?? false);
          yt(Ce);
          logEvent("tengu_config_changed", {
            setting: "agentPushNotifEnabled",
            value: Ce ? "true" : "false"
          });
        },
        onClose: () => {
          me(null);
          n(false);
        }
      }) : M ? ns.jsxs(gXd, {
        flexDirection: "column",
        children: [ns.jsx(i3l, {
          rows: Ft.map(Ce => ({
            id: Ce.id,
            label: typeof Ce.label === "string" ? Ce.label : e$(Ce.label),
            value: hqm(Ce, {
              autoUpdaterDisabledReason: Ye,
              revampSections: gt
            })
          })),
          onSelect: Ce => {
            k(Ce);
            Xr(Ce);
          },
          onCancel: rn,
          cancelHint: "Escape to save and close"
        }), de && ns.jsx(Text, {
          children: "Changing thinking mode mid-conversation will increase latency and may reduce quality."
        }), Ft.some(Ce => Ce.id === "inputNeededNotifEnabled" || Ce.id === "agentPushNotifEnabled") && ns.jsx(Rsr, {})]
      }) : ns.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        marginY: a ? undefined : 1,
        children: [ns.jsx(YM, {
          query: ce,
          isFocused: L && !s,
          isTerminalFocused: F,
          cursorOffset: pe,
          placeholder: "Search settings\u2026"
        }), ns.jsx(gXd, {
          flexDirection: "column",
          children: Ft.length === 0 ? ns.jsxs(Text, {
            dimColor: true,
            italic: true,
            children: ['No settings match "', ce, '"']
          }) : ns.jsxs(ns.Fragment, {
            children: [I > 0 && ns.jsxs(Text, {
              dimColor: true,
              children: [vGd.arrowUp, " ", I, " more above"]
            }), Ft.slice(I, I + j).map((Ce, Fe) => {
              let Xe = I + Fe;
              let He = Xe === A && !s && !L;
              let Gt = gt ? jjo(Ce.id) : undefined;
              let mt = Gt !== undefined && (Xe === 0 || jjo(Ft[Xe - 1]?.id ?? "") !== Gt);
              let Dt = Gt !== undefined && e3l.vZc(Gt) && (Gt !== "Advanced" || Hjo(Ce.id)) && !He;
              return ns.jsxs(a3l.Fragment, {
                children: [mt && ns.jsx(gXd, {
                  marginTop: Xe === I ? 0 : 1,
                  children: ns.jsx(Text, {
                    dimColor: true,
                    children: t3l(Gt, Ce.id)
                  })
                }), ns.jsxs(gXd, {
                  children: [ns.jsx(gXd, {
                    width: N,
                    flexShrink: 0,
                    marginRight: 1,
                    children: ns.jsxs(Text, {
                      color: He ? "suggestion" : undefined,
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: [He ? vGd.pointer : " ", " ", Ce.label]
                    })
                  }), ns.jsxs(gXd, {
                    flexGrow: 1,
                    minWidth: 0,
                    children: [Gt === "Advanced" && jn(Ce.id) && ns.jsx(Text, {
                      color: "warning",
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: "\u2192 settings.json "
                    }), Ce.type === "boolean" ? ns.jsx(Text, {
                      color: He ? "suggestion" : undefined,
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: Ce.value.toString()
                    }) : Ce.id === "theme" ? ns.jsx(Text, {
                      color: He ? "suggestion" : undefined,
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: c3l[Ce.value.toString()] ?? Ce.value.toString()
                    }) : !gt && Ce.id === "notifChannel" ? ns.jsx(Text, {
                      color: He ? "suggestion" : undefined,
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: ns.jsx(u3l, {
                        value: Ce.value.toString()
                      })
                    }) : Ce.id === "permissionMode" ? ns.jsx(Text, {
                      color: He ? "suggestion" : undefined,
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: mY(Ce.value)
                    }) : Ce.id === "autoUpdatesChannel" && Ye ? ns.jsxs(Text, {
                      color: He ? "suggestion" : undefined,
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: ["disabled", " ", ns.jsxs(Text, {
                        dimColor: true,
                        children: ["(", formatAutoUpdaterDisabledReason(Ye), ")"]
                      })]
                    }) : ns.jsx(Text, {
                      color: He ? "suggestion" : undefined,
                      dimColor: Dt,
                      wrap: "truncate-end",
                      children: Ce.value.toString()
                    }), gt && Ce.type === "managedEnum" && !Sn(Ce) && (Ce.id !== "autoUpdatesChannel" || Ye !== null || (m?.autoUpdatesChannel ?? "latest") === "latest") && ns.jsx(Text, {
                      color: He ? "suggestion" : "permission",
                      dimColor: Dt,
                      children: ` ${vGd.pointerSmall}`
                    })]
                  }, He ? "selected" : "unselected")]
                }), (Ce.id === "inputNeededNotifEnabled" || Ce.id === "agentPushNotifEnabled") && ns.jsx(Rsr, {}), de && Ce.id === "thinking" && ns.jsx(gXd, {
                  paddingLeft: 2,
                  children: ns.jsx(Text, {
                    color: "warning",
                    children: "Changing thinking mode mid-conversation will increase latency and may reduce quality."
                  })
                })]
              }, Ce.id);
            }), I + j < Ft.length && ns.jsxs(Text, {
              dimColor: true,
              children: [vGd.arrowDown, " ", Ft.length - I - j, " ", "more below"]
            })]
          })
        }), s ? ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: ["left", "right", "tab"],
              action: "switch",
              format: {
                keyCase: "lower"
              }
            }), ns.jsx(xt, {
              chord: "down",
              action: "return"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "close"
            })]
          })
        }) : L ? ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(Text, {
              children: "Type to filter"
            }), ns.jsx(xt, {
              chord: ["enter", "down"],
              action: "select"
            }), ns.jsx(xt, {
              chord: "up",
              action: "tabs"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "clear"
            })]
          })
        }) : ns.jsx(Text, {
          dimColor: true,
          children: ns.jsxs(Hn, {
            children: [ns.jsx(xt, {
              chord: ["enter", "space"],
              action: "change"
            }), ns.jsx(Wr, {
              action: "settings:search",
              context: "Settings",
              fallback: "/",
              description: "search"
            }), ns.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "close"
            })]
          })
        })]
      })
    });
  }
  function u3l(e) {
    let t = qjo.c(4);
    let {
      value: n
    } = e;
    switch (n) {
      case "auto":
        return "Auto";
      case "iterm2":
        {
          let r;
          if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
            r = ns.jsxs(Text, {
              children: ["iTerm2 ", ns.jsx(Text, {
                dimColor: true,
                children: "(OSC 9)"
              })]
            });
            t[0] = r;
          } else {
            r = t[0];
          }
          return r;
        }
      case "terminal_bell":
        {
          let r;
          if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
            r = ns.jsxs(Text, {
              children: ["Terminal Bell ", ns.jsx(Text, {
                dimColor: true,
                children: "(\\a)"
              })]
            });
            t[1] = r;
          } else {
            r = t[1];
          }
          return r;
        }
      case "kitty":
        {
          let r;
          if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
            r = ns.jsxs(Text, {
              children: ["Kitty ", ns.jsx(Text, {
                dimColor: true,
                children: "(OSC 99)"
              })]
            });
            t[2] = r;
          } else {
            r = t[2];
          }
          return r;
        }
      case "ghostty":
        {
          let r;
          if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
            r = ns.jsxs(Text, {
              children: ["Ghostty ", ns.jsx(Text, {
                dimColor: true,
                children: "(OSC 777)"
              })]
            });
            t[3] = r;
          } else {
            r = t[3];
          }
          return r;
        }
      case "iterm2_with_bell":
        return "iTerm2 w/ Bell";
      case "notifications_disabled":
        return "Disabled";
      default:
        return n;
    }
  }
  function hqm(e, t) {
    let n = String(e.value);
    if (e.id === "theme") {
      return c3l[n] ?? n;
    }
    if (e.id === "permissionMode") {
      return mY(e.value);
    }
    if (e.id === "autoUpdatesChannel" && t.autoUpdaterDisabledReason) {
      return `disabled (${formatAutoUpdaterDisabledReason(t.autoUpdaterDisabledReason)})`;
    }
    if (e.id === "notifChannel" && !t.revampSections) {
      return e$(u3l({
        value: n
      }));
    }
    return n;
  }
  function i3l(e) {
    let t = qjo.c(20);
    let {
      rows: n,
      onSelect: r,
      onCancel: o,
      cancelHint: s
    } = e;
    let [i, a] = kf.useState("");
    let l = kf.useRef("");
    let [c, u] = kf.useState(null);
    let d = kf.useRef(null);
    MI(d, true);
    let p;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      p = C => {
        l.current = C(l.current);
        a(l.current);
      };
      t[0] = p;
    } else {
      p = t[0];
    }
    let m = p;
    let f;
    if (t[1] !== r || t[2] !== n.length) {
      f = C => {
        let x = Number.parseInt(C, 10);
        if (!Number.isFinite(x) || x < 1 || x > n.length) {
          u(`Invalid selection "${C}". Enter a number between 1 and ${n.length}.`);
          m(bqm);
          return;
        }
        u(null);
        m(_qm);
        r(x - 1);
      };
      t[1] = r;
      t[2] = n.length;
      t[3] = f;
    } else {
      f = t[3];
    }
    let h = f;
    let g;
    if (t[4] !== o || t[5] !== h) {
      g = C => {
        if (C.key === "escape") {
          C.preventDefault();
          o();
          return;
        }
        if (C.key === "return") {
          if (C.preventDefault(), l.current.length > 0) {
            h(l.current);
          }
          return;
        }
        if (C.key === "backspace" || C.key === "delete") {
          C.preventDefault();
          m(yqm);
          return;
        }
        let x = N7(C.key);
        if (/^[0-9]$/.test(x) && !C.ctrl && !C.meta) {
          C.preventDefault();
          u(null);
          m(A => A + x);
        }
      };
      t[4] = o;
      t[5] = h;
      t[6] = g;
    } else {
      g = t[6];
    }
    let y = g;
    let _;
    if (t[7] !== n) {
      _ = n.map(gqm);
      t[7] = n;
      t[8] = _;
    } else {
      _ = t[8];
    }
    let b;
    if (t[9] !== c) {
      b = c && ns.jsx(Text, {
        children: c
      });
      t[9] = c;
      t[10] = b;
    } else {
      b = t[10];
    }
    let S;
    if (t[11] !== i || t[12] !== s || t[13] !== n.length) {
      S = ns.jsxs(Text, {
        children: ["Enter a number to change [1-", n.length, "], or ", s, ": ", i]
      });
      t[11] = i;
      t[12] = s;
      t[13] = n.length;
      t[14] = S;
    } else {
      S = t[14];
    }
    let E;
    if (t[15] !== y || t[16] !== _ || t[17] !== b || t[18] !== S) {
      E = ns.jsxs(gXd, {
        ref: d,
        flexDirection: "column",
        tabIndex: 0,
        autoFocus: true,
        onKeyDown: y,
        children: [_, b, S]
      });
      t[15] = y;
      t[16] = _;
      t[17] = b;
      t[18] = S;
      t[19] = E;
    } else {
      E = t[19];
    }
    return E;
  }
  function gqm(e, t) {
    return ns.jsxs(Text, {
      children: [t + 1, ". ", e.label, ": ", e.value]
    }, e.id);
  }
  function yqm(e) {
    return e.slice(0, -1);
  }
  function _qm() {
    return "";
  }
  function bqm() {
    return "";
  }
  var qjo;
  var a3l;
  var kf;
  var ns;
  var c3l;
  var d3l = __lazy(() => {
    et();
    Oue();
    Djt();
    Zn();
    Bs();
    wl();
    Lot();
    zg();
    dw();
    HT();
    S_();
    Ot();
    ln();
    Msr();
    ho();
    Pwe();
    Lsr();
    vjo();
    rql();
    Ii();
    OS();
    aql();
    uql();
    bx();
    wb();
    Qbe();
    bs();
    Sd();
    Ai();
    yH();
    rE();
    Cfe();
    bT();
    N2();
    M1();
    Kq();
    pr();
    gn();
    uT();
    p7e();
    kQt();
    ajo();
    soe();
    no();
    Wd();
    sie();
    ki();
    GT();
    xsr();
    o3l();
    ujo();
    qjo = __toESM(pt(), 1);
    a3l = __toESM(ot(), 1);
    kf = __toESM(ot(), 1);
    ns = __toESM(ie(), 1);
    c3l = {
      auto: "Auto (match terminal)",
      dark: "Dark mode",
      light: "Light mode",
      "dark-daltonized": "Dark mode (colorblind-friendly)",
      "light-daltonized": "Light mode (colorblind-friendly)",
      "dark-ansi": "Dark mode (ANSI colors only)",
      "light-ansi": "Light mode (ANSI colors only)"
    };
  });
  function Mwe(e, t, n, r) {
    let o = e.subarray(n, r).indexOf(t);
    return o < 0 ? -1 : n + o;
  }
  function Dwe(e, t, n, r) {
    let o = Mwe(e, t, n, r);
    if (o < 0) {
      return;
    }
    let s = o + t.length;
    let i = s;
    while (i < r && e[i] !== 34) {
      i++;
    }
    return e.toString("utf8", s, i);
  }
  function zqm(e, t, n) {
    let r = t;
    while (true) {
      if (r = Mwe(e, m3l, r, n), r < 0) {
        return;
      }
      let o = r + m3l.length;
      if (Mwe(e, Dqm, o, o + 4) === o) {
        let s = o;
        while (s < n && e[s] !== 34) {
          s++;
        }
        return e.toString("utf8", o, s);
      }
      r = o;
    }
  }
  function rir(e, t, n, r) {
    let o = Mwe(e, t, n, r);
    if (o < 0) {
      return 0;
    }
    let s = o + t.length;
    let i = 0;
    while (s < r && e[s] >= 48 && e[s] <= 57) {
      i = i * 10 + (e[s] - 48);
      s++;
    }
    return i;
  }
  function Kqm(e) {
    if (!e) {
      return 3;
    }
    let t = e.toLowerCase();
    if (t.includes("fable")) {
      return 10;
    }
    if (t.includes("opus")) {
      return 5;
    }
    if (t.includes("haiku")) {
      return 1;
    }
    return 3;
  }
  function Yqm(e) {
    return (e.cached + e.uncached * 10 + e.cacheCreate * 12.5 + e.output * 50) * e.modelTier;
  }
  async function iir() {
    let e = Date.now() - 604800000;
    let t = Date.now() - 86400000;
    let n = nF();
    let r;
    try {
      r = await Pvt.readdir(n);
    } catch (c) {
      if (Io(c)) {
        return {
          day: g3l(),
          week: g3l()
        };
      }
      throw c;
    }
    let s = (await Promise.all(r.map(c => Jqm(sUe.join(n, c))))).flat();
    let i = Wjo();
    let a = Wjo();
    let l = new Set();
    for (let c = 0; c < s.length; c += 4) {
      let u = s.slice(c, c + 4);
      let d = await Promise.all(u.map(p => Xqm(p, e)));
      for (let p of d) {
        for (let m of p) {
          if (m.uuid) {
            if (l.vZc(m.uuid)) {
              continue;
            }
            l.add(m.uuid);
          }
          if (h3l(a, m), m.ts >= t) {
            h3l(i, m);
          }
        }
      }
    }
    return {
      day: Gjo(i),
      week: Gjo(a)
    };
  }
  async function Jqm(e) {
    let t;
    try {
      t = await Pvt.readdir(e, {
        withFileTypes: true
      });
    } catch (s) {
      if (Io(s)) {
        return [];
      }
      throw s;
    }
    let n = [];
    let r = [];
    for (let s of t) {
      if (s.isFile() && sUe.extname(s.name) === ".jsonl") {
        n.push(sUe.join(e, s.name));
      } else if (s.isDirectory()) {
        r.push(s.name);
      }
    }
    let o = await Promise.all(r.map(async s => {
      let i = sUe.join(e, s, "subagents");
      try {
        return (await Pvt.readdir(i, {
          recursive: true
        })).filter(l => sUe.extname(l) === ".jsonl").map(l => sUe.join(i, l));
      } catch (a) {
        if (Io(a)) {
          return [];
        }
        throw a;
      }
    }));
    for (let s of o) {
      for (let i of s) {
        n.push(i);
      }
    }
    return n;
  }
  async function Xqm(e, t) {
    let n;
    try {
      n = await Pvt.stat(e);
    } catch (o) {
      if (Io(o)) {
        return [];
      }
      throw o;
    }
    if (!n.isFile() || n.mtimeMs < t) {
      return [];
    }
    let r = [];
    try {
      for await (let o of Ops(e)) {
        let s = Qqm(o, 0, o.length, t);
        if (s) {
          r.push(s);
        }
      }
    } catch (o) {
      if (Io(o)) {
        return r;
      }
      throw o;
    }
    return r;
  }
  function Qqm(e, t, n, r) {
    if (Mwe(e, xqm, t, n) < 0) {
      return;
    }
    if (Mwe(e, kqm, t, n) < 0) {
      return;
    }
    let o = Dwe(e, Aqm, t, n);
    let s = Dwe(e, Iqm, t, n);
    if (!o || !s) {
      return;
    }
    let i = Date.parse(o);
    if (Number.isNaN(i) || i < r) {
      return;
    }
    let a = rir(e, Nqm, t, n);
    let l = rir(e, Lqm, t, n);
    let c = rir(e, Fqm, t, n);
    let u = rir(e, Uqm, t, n);
    if (a + l + c + u === 0) {
      return;
    }
    let d = Mwe(e, Hqm, t, n) >= 0;
    return {
      ts: i,
      sessionId: s,
      cached: u,
      cacheCreate: c,
      uncached: a,
      output: l,
      isSubagent: Mwe(e, Bqm, t, n) >= 0 || Mwe(e, $qm, t, n) >= 0,
      modelTier: Kqm(Dwe(e, Pqm, t, n)),
      uuid: Dwe(e, Oqm, t, n) ?? zqm(e, t, n) ?? Dwe(e, Mqm, t, n) ?? "",
      ...(d && {
        attributionAgent: Dwe(e, jqm, t, n),
        attributionSkill: Dwe(e, qqm, t, n),
        attributionPlugin: Dwe(e, Wqm, t, n),
        attributionMcpServer: Dwe(e, Gqm, t, n)
      })
    };
  }
  function Wjo() {
    return {
      totalCost: 0,
      requestCount: 0,
      cacheMissCost: 0,
      cacheMissCount: 0,
      longCtxCost: 0,
      longCtxCount: 0,
      sessions: new Map(),
      buckets: new Map(),
      byAgent: new Map(),
      bySkill: new Map(),
      byPlugin: new Map(),
      byMcpServer: new Map()
    };
  }
  function oir(e, t, n) {
    if (t) {
      e.set(t, (e.get(t) ?? 0) + n);
    }
  }
  function h3l(e, t) {
    let n = Yqm(t);
    if (e.totalCost += n, e.requestCount++, t.attributionAgent) {
      oir(e.byAgent, t.attributionSkill ?? t.attributionAgent, n);
    } else {
      oir(e.bySkill, t.attributionSkill, n);
    }
    oir(e.byPlugin, t.attributionPlugin, n);
    oir(e.byMcpServer, t.attributionMcpServer, n);
    let r = t.cached + t.cacheCreate + t.uncached;
    if (t.uncached > 1e5) {
      e.cacheMissCost += n;
      e.cacheMissCount++;
    }
    if (r > 150000) {
      e.longCtxCost += n;
      e.longCtxCount++;
    }
    let o = e.sessions.get(t.sessionId);
    if (!o) {
      o = {
        cost: 0,
        subCost: 0,
        subCount: 0,
        hours: new Set()
      };
      e.sessions.set(t.sessionId, o);
    }
    if (o.cost += n, t.isSubagent) {
      o.subCost += n;
      o.subCount++;
    }
    o.hours.add(Math.floor(t.ts / 3600000));
    let s = Math.floor(t.ts / 300000);
    let i = e.buckets.get(s);
    if (!i) {
      i = {
        sids: new Set(),
        cost: 0,
        count: 0
      };
      e.buckets.set(s, i);
    }
    i.sids.add(t.sessionId);
    i.cost += n;
    i.count++;
  }
  function Gjo(e) {
    let t = 0;
    let n = 0;
    for (let l of e.buckets.values()) {
      if (l.sids.size >= 4) {
        t += l.cost;
        n += l.count;
      }
    }
    let r = 0;
    let o = 0;
    let s = 0;
    let i = 0;
    for (let l of e.sessions.values()) {
      if (l.subCount >= 3 || l.cost > 0 && l.subCost / l.cost > 0.5) {
        r += l.cost;
        o++;
      }
      if (l.hours.size >= 8) {
        s += l.cost;
        i++;
      }
    }
    let a = [{
      key: "cache_miss",
      cost: e.cacheMissCost,
      count: e.cacheMissCount
    }, {
      key: "long_context",
      cost: e.longCtxCost,
      count: e.longCtxCount
    }, {
      key: "subagent_heavy",
      cost: r,
      count: o
    }, {
      key: "high_parallel",
      cost: t,
      count: n
    }, {
      key: "cron",
      cost: s,
      count: i
    }];
    a.sort((l, c) => c.cost - l.cost);
    return {
      totalCost: e.totalCost,
      requestCount: e.requestCount,
      sessionCount: e.sessions.size,
      behaviors: a,
      agents: sir(e.byAgent, e.totalCost),
      skills: sir(e.bySkill, e.totalCost),
      plugins: sir(e.byPlugin, e.totalCost),
      mcpServers: sir(e.byMcpServer, e.totalCost)
    };
  }
  function g3l() {
    return Gjo(Wjo());
  }
  function sir(e, t) {
    if (e.size === 0 || t === 0) {
      return [];
    }
    return [...e.entries()].sort((n, r) => r[1] - n[1]).map(([n, r]) => ({
      name: n,
      pct: Math.round(r / t * 100)
    })).filter(n => n.pct > 0);
  }
  var Pvt;
  var sUe;
  var QO;
  var xqm;
  var kqm;
  var Aqm;
  var Iqm;
  var Pqm;
  var Oqm;
  var m3l;
  var Dqm;
  var Mqm;
  var Nqm;
  var Lqm;
  var Fqm;
  var Uqm;
  var Bqm;
  var $qm;
  var Hqm;
  var jqm;
  var qqm;
  var Wqm;
  var Gqm;
  var Vjo = __lazy(() => {
    dt();
    ZS();
    Pvt = require("fs/promises");
    sUe = require("path");
    QO = new TextEncoder();
    xqm = QO.HS('"type":"assistant"');
    kqm = QO.HS('"usage":{');
    Aqm = QO.HS('"timestamp":"');
    Iqm = QO.HS('"sessionId":"');
    Pqm = QO.HS('"model":"');
    Oqm = QO.HS('"requestId":"');
    m3l = QO.HS('"id":"');
    Dqm = QO.HS("msg_");
    Mqm = QO.HS('"uuid":"');
    Nqm = QO.HS('"input_tokens":');
    Lqm = QO.HS('"output_tokens":');
    Fqm = QO.HS('"cache_creation_input_tokens":');
    Uqm = QO.HS('"cache_read_input_tokens":');
    Bqm = QO.HS('"isSidechain":true');
    $qm = QO.HS('"isSidechain": true');
    Hqm = QO.HS('"attribution');
    jqm = QO.HS('"attributionAgent":"');
    qqm = QO.HS('"attributionSkill":"');
    Wqm = QO.HS('"attributionPlugin":"');
    Gqm = QO.HS('"attributionMcpServer":"');
  });
  var b3l = {};
  __export(b3l, {
    seedUtilization: () => seedUtilization,
    loadPlanRateLimits: () => loadPlanRateLimits,
    collectUsageData: () => collectUsageData,
    MIN_BEHAVIOR_PCT: () => 10
  });
  function seedUtilization() {
    let e = $9e();
    if (!e.five_hour && !e.seven_day) {
      return null;
    }
    let t = n => n ? {
      utilization: n.utilization * 100,
      resets_at: new Date(n.resets_at * 1000).toISOString()
    } : undefined;
    return {
      five_hour: t(e.five_hour),
      seven_day: t(e.seven_day)
    };
  }
  async function loadPlanRateLimits() {
    try {
      let e = await Ide();
      if (!e) {
        return {
          status: "empty_response"
        };
      }
      if (isClaudeAISubscriber() && hasProfileScope() && !Zqm.some(n => n in e)) {
        logForDebugging("Usage fetch returned a fieldless body (in-band error envelope)", {
          level: "error"
        });
        let n = "error" in e ? e.error : undefined;
        let r = typeof n === "object" && n !== null && "type" in n && n.type === "rate_limit_error";
        let o = seedUtilization();
        if (o) {
          return {
            status: "seeded",
            utilization: o,
            isRateLimited: r
          };
        }
        return {
          status: "unavailable",
          isRateLimited: r,
          responseBody: De(e)
        };
      }
      return {
        status: "ok",
        utilization: e
      };
    } catch (e) {
      if (M_(e)) {
        logForDebugging(`Failed to load usage data: ${he(e)}`, {
          level: "error"
        });
      } else {
        Oe(e);
      }
      let t = e;
      let n = t.response?.status === 429;
      let r = seedUtilization();
      if (r) {
        return {
          status: "seeded",
          utilization: r,
          isRateLimited: n
        };
      }
      return {
        status: "unavailable",
        isRateLimited: n,
        responseBody: t.response?.data ? De(t.response.data) : undefined
      };
    }
  }
  function _3l(e) {
    return {
      request_count: e.requestCount,
      session_count: e.sessionCount,
      behaviors: e.behaviors.filter(t => e.totalCost > 0 && t.cost / e.totalCost * 100 >= 10).map(t => ({
        key: t.key,
        pct: Math.round(t.cost / e.totalCost * 100),
        count: t.count
      })),
      agents: e.agents,
      skills: e.skills,
      plugins: e.plugins,
      mcp_servers: e.mcpServers
    };
  }
  async function collectUsageData({
    includeBehaviors: e = true
  } = {}) {
    let t = isClaudeAISubscriber();
    let n = t && hasProfileScope();
    let [r, o] = await Promise.all([n ? loadPlanRateLimits().then(i => i.status === "ok" || i.status === "seeded" ? i.utilization : null) : Promise.resolve(null), e && t ? iir().then(i => ({
      day: _3l(i.day),
      week: _3l(i.week)
    }), i => (Oe(i), null)) : Promise.resolve(null)]);
    let s;
    if (r !== null) {
      try {
        s = lpt(r.limits, vDe()).map(i => ({
          display_name: i.title.replace(/^Current week \((.+)\)$/, "$1"),
          utilization: i.limit.utilization ?? null,
          resets_at: typeof i.limit.resets_at === "number" ? new Date(i.limit.resets_at * 1000).toISOString() : i.limit.resets_at ?? null
        }));
      } catch (i) {
        logForDebugging(`model_scoped projection failed: ${he(i)}`, {
          level: "error"
        });
      }
    }
    return {
      session: {
        total_cost_usd: getTotalCostUSD(),
        total_api_duration_ms: getTotalAPIDuration(),
        total_duration_ms: getTotalDuration(),
        total_lines_added: getTotalLinesAdded(),
        total_lines_removed: getTotalLinesRemoved(),
        model_usage: getModelUsage()
      },
      subscription_type: getSubscriptionType(),
      rate_limits_available: n,
      rate_limits: r === null ? null : s !== undefined && s.length > 0 ? {
        ...r,
        model_scoped: s
      } : r,
      behaviors: o
    };
  }
  var Zqm;
  var HQt = __lazy(() => {
    at();
    ETe();
    pU();
    no();
    Vjo();
    je();
    dt();
    Rn();
    Zqm = ["five_hour", "seven_day", "seven_day_oauth_apps", "seven_day_opus", "seven_day_sonnet", "cinder_cove", "extra_usage", "limits"];
  });
  function Dv(e) {
    let t = S3l.c(7);
    let {
      children: n,
      subtitle: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = jQt.jsx(Text, {
        bold: true,
        children: n
      });
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s;
    if (t[2] !== r) {
      s = r && jQt.jsx(Text, {
        dimColor: true,
        children: r
      });
      t[2] = r;
      t[3] = s;
    } else {
      s = t[3];
    }
    let i;
    if (t[4] !== o || t[5] !== s) {
      i = jQt.jsxs(gXd, {
        flexDirection: "column",
        children: [o, s]
      });
      t[4] = o;
      t[5] = s;
      t[6] = i;
    } else {
      i = t[6];
    }
    return i;
  }
  var S3l;
  var jQt;
  var uK = __lazy(() => {
    et();
    S3l = __toESM(pt(), 1);
    jQt = __toESM(ie(), 1);
  });
  function e3m(e) {
    let t = b9e(e);
    let n = Math.min(t.length, cTe());
    return 2 + e.name.length + 2 + n + 1;
  }
  function cir(e, t, n) {
    let r = new Map();
    for (let c of e) {
      if (c.type !== "prompt" || c.disableModelInvocation) {
        continue;
      }
      let u = c.pluginInfo?.pluginManifest.name;
      if (!u) {
        continue;
      }
      let d = e3m(c);
      let p = r.get(u) ?? [];
      p.push({
        name: c.name,
        chars: d,
        approxTokens: Math.round(d / t)
      });
      r.set(u, p);
    }
    let o = [...r.entries()].map(([c, u]) => {
      u.sort((p, m) => m.chars - p.chars);
      let d = u.reduce((p, m) => p + m.chars, 0);
      return {
        pluginName: c,
        skillCount: u.length,
        chars: d,
        approxTokens: Math.round(d / t),
        skills: u
      };
    }).sort((c, u) => u.chars - c.chars);
    let s = o.reduce((c, u) => c + u.chars, 0);
    let i = _9e(n, t);
    let a = s > i;
    let l = a ? i : s;
    return {
      byPlugin: o,
      totalChars: l,
      totalTokens: Math.round(l / t),
      overBudget: a,
      budgetTokens: Math.round(i / t)
    };
  }
  var zjo = __lazy(() => {
    S9e();
  });
  function E3l() {
    let e = T3l.c(15);
    let t = bt(o3m);
    let n = bt(r3m);
    let r = bt(n3m);
    let o;
    if (e[0] !== n || e[1] !== r || e[2] !== t) {
      o = cir([...t, ...n], bytesPerTokenForModel(r ?? undefined));
      e[0] = n;
      e[1] = r;
      e[2] = t;
      e[3] = o;
    } else {
      o = e[3];
    }
    let s = o;
    if (s.byPlugin.length === 0) {
      return null;
    }
    let i;
    let a;
    if (e[4] === Symbol.for("react.memo_cache_sentinel")) {
      i = b5.jsx(Text, {
        bold: true,
        children: "Plugin skill-listing footprint"
      });
      a = b5.jsx(Text, {
        dimColor: true,
        wrap: "wrap",
        children: "What each plugin's skill descriptions add to the system prompt (cached input after the first turn). Agents and MCP tools not yet counted."
      });
      e[4] = i;
      e[5] = a;
    } else {
      i = e[4];
      a = e[5];
    }
    let l;
    if (e[6] !== s.byPlugin) {
      l = s.byPlugin.map(t3m);
      e[6] = s.byPlugin;
      e[7] = l;
    } else {
      l = e[7];
    }
    let c;
    if (e[8] === Symbol.for("react.memo_cache_sentinel")) {
      c = b5.jsx(gXd, {
        width: 28,
        children: b5.jsx(Text, {
          children: "Total"
        })
      });
      e[8] = c;
    } else {
      c = e[8];
    }
    let u = s.overBudget ? " (capped at the listing budget; per-plugin figures above are pre-truncation)" : "";
    let d;
    if (e[9] !== s.totalTokens || e[10] !== u) {
      d = b5.jsxs(gXd, {
        flexDirection: "row",
        marginTop: 1,
        children: [c, b5.jsxs(Text, {
          children: ["~", s.totalTokens, " tok/turn", u]
        })]
      });
      e[9] = s.totalTokens;
      e[10] = u;
      e[11] = d;
    } else {
      d = e[11];
    }
    let p;
    if (e[12] !== l || e[13] !== d) {
      p = b5.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: [i, a, b5.jsxs(gXd, {
          flexDirection: "column",
          marginTop: 1,
          children: [l, d]
        })]
      });
      e[12] = l;
      e[13] = d;
      e[14] = p;
    } else {
      p = e[14];
    }
    return p;
  }
  function t3m(e) {
    return b5.jsxs(gXd, {
      flexDirection: "row",
      children: [b5.jsx(gXd, {
        width: 28,
        children: b5.jsx(Text, {
          dimColor: true,
          children: e.pluginName
        })
      }), b5.jsxs(Text, {
        dimColor: true,
        children: [e.skillCount, " ", un(e.skillCount, "skill"), " \xB7 ~", e.approxTokens, " ", "tok/turn"]
      })]
    }, e.pluginName);
  }
  function n3m(e) {
    return e.mainLoopModel;
  }
  function r3m(e) {
    return e.mcp.commands;
  }
  function o3m(e) {
    return e.plugins.commands;
  }
  var T3l;
  var b5;
  var v3l = __lazy(() => {
    zjo();
    et();
    ho();
    Eo();
    Zn();
    T3l = __toESM(pt(), 1);
    b5 = __toESM(ie(), 1);
  });
  function k3l(e) {
    let t = iUe.c(2);
    let {
      maxWidth: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = _u.jsx(i3m, {
        maxWidth: n
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  function i3m(e) {
    let t = iUe.c(5);
    let {
      maxWidth: n
    } = e;
    let [r] = lYe.useState(a3m);
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = _u.jsx(A3l, {});
      t[0] = o;
    } else {
      o = t[0];
    }
    let s;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      s = _u.jsxs(gXd, {
        flexDirection: "column",
        children: [o, _u.jsx(gXd, {
          marginTop: 1,
          children: _u.jsx(Text, {
            dimColor: true,
            children: "Scanning local sessions\u2026"
          })
        })]
      });
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a;
    if (t[2] !== n || t[3] !== r) {
      a = _u.jsx(lYe.Suspense, {
        fallback: i,
        children: _u.jsx(c3m, {
          maxWidth: n,
          scanPromise: r
        })
      });
      t[2] = n;
      t[3] = r;
      t[4] = a;
    } else {
      a = t[4];
    }
    return a;
  }
  function a3m() {
    return iir().catch(l3m);
  }
  function l3m(e) {
    Oe(e);
    return {
      day: w3l,
      week: w3l
    };
  }
  function Kjo(e) {
    if (e.totalCost === 0) {
      return [];
    }
    return e.behaviors.filter(t => t.cost / e.totalCost * 100 >= 10);
  }
  function uir(e) {
    return e.agents.length > 0 || e.skills.length > 0 || e.plugins.length > 0 || e.mcpServers.length > 0;
  }
  function c3m(e) {
    let t = iUe.c(35);
    let {
      maxWidth: n,
      scanPromise: r
    } = e;
    let o = lYe.use(r);
    let [s, i] = lYe.useState("day");
    let a;
    if (t[0] !== o.day) {
      a = Kjo(o.day).length > 0 || uir(o.day);
      t[0] = o.day;
      t[1] = a;
    } else {
      a = t[1];
    }
    let l = a;
    let c;
    if (t[2] !== o.week) {
      c = Kjo(o.week).length > 0 || uir(o.week);
      t[2] = o.week;
      t[3] = c;
    } else {
      c = t[3];
    }
    let u = c;
    let d = l || u;
    let p;
    if (t[4] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        "settings:periodDay": () => i("day"),
        "settings:periodWeek": () => i("week")
      };
      t[4] = p;
    } else {
      p = t[4];
    }
    let m;
    if (t[5] !== d) {
      m = {
        context: "Settings",
        isActive: d
      };
      t[5] = d;
      t[6] = m;
    } else {
      m = t[6];
    }
    if (jo(p, m), !l && !u) {
      return null;
    }
    let f = s === "day" ? o.day : o.week;
    let h;
    let g;
    let y;
    let _;
    let b;
    let S;
    let E;
    let C;
    let x;
    if (t[7] !== n || t[8] !== s || t[9] !== f) {
      let O = Kjo(f);
      if (g = gXd, x = "column", t[19] === Symbol.for("react.memo_cache_sentinel")) {
        y = _u.jsx(A3l, {});
        t[19] = y;
      } else {
        y = t[19];
      }
      let M = s === "day" ? "24h" : "7d";
      if (t[20] !== M) {
        _ = _u.jsx(gXd, {
          marginTop: 1,
          children: _u.jsxs(Text, {
            dimColor: true,
            wrap: "wrap",
            children: ["Last ", M, " \xB7 these are independent characteristics of your usage, not a breakdown"]
          })
        });
        t[20] = M;
        t[21] = _;
      } else {
        _ = t[21];
      }
      h = gXd;
      b = 1;
      S = "column";
      E = 1;
      C = O.length === 0 && !uir(f) ? _u.jsxs(Text, {
        dimColor: true,
        children: ["Nothing over ", 10, "% in this period \u2014 try the other window."]
      }) : _u.jsxs(_u.Fragment, {
        children: [O.map(L => _u.jsx(h3m, {
          stat: L,
          totalCost: f.totalCost,
          maxWidth: n
        }, L.key)), _u.jsx(pir, {
          top: f.agents[0],
          maxWidth: n,
          headline: f3m,
          body: "If this runs frequently, consider configuring its subagents with a cheaper model or tightening their prompts."
        }), _u.jsx(pir, {
          top: f.skills[0],
          maxWidth: n,
          headline: m3m,
          body: "Heavy skills can be scoped down or run with a cheaper model via skill frontmatter."
        }), _u.jsx(pir, {
          top: f.plugins[0],
          maxWidth: n,
          headline: p3m,
          body: "Review what this plugin contributes \u2014 its agents, skills, and MCP tools all count toward your limit."
        }), _u.jsx(pir, {
          top: f.mcpServers[0],
          maxWidth: n,
          headline: d3m,
          body: "MCP tool results stay in context for the rest of the session. /compact to flush them, or disable servers you don't need."
        }), !uir(f) ? _u.jsxs(gXd, {
          flexDirection: "column",
          children: [_u.jsx(Text, {
            bold: true,
            children: "Skills, subagents, plugins, and MCP servers"
          }), _u.jsx(Text, {
            dimColor: true,
            wrap: "wrap",
            children: "No attribution data yet \xB7 accumulates as you use Claude"
          })]
        }) : _u.jsxs(_u.Fragment, {
          children: [_u.jsx(dir, {
            title: "Skills",
            rows: f.skills,
            label: u3m
          }), _u.jsx(dir, {
            title: "Subagents",
            rows: f.agents
          }), _u.jsx(dir, {
            title: "Plugins",
            rows: f.plugins
          }), _u.jsx(dir, {
            title: "MCP servers",
            rows: f.mcpServers
          })]
        })]
      });
      t[7] = n;
      t[8] = s;
      t[9] = f;
      t[10] = h;
      t[11] = g;
      t[12] = y;
      t[13] = _;
      t[14] = b;
      t[15] = S;
      t[16] = E;
      t[17] = C;
      t[18] = x;
    } else {
      h = t[10];
      g = t[11];
      y = t[12];
      _ = t[13];
      b = t[14];
      S = t[15];
      E = t[16];
      C = t[17];
      x = t[18];
    }
    let A;
    if (t[22] !== h || t[23] !== b || t[24] !== S || t[25] !== E || t[26] !== C) {
      A = _u.jsx(h, {
        marginTop: b,
        flexDirection: S,
        gap: E,
        children: C
      });
      t[22] = h;
      t[23] = b;
      t[24] = S;
      t[25] = E;
      t[26] = C;
      t[27] = A;
    } else {
      A = t[27];
    }
    let k;
    if (t[28] === Symbol.for("react.memo_cache_sentinel")) {
      k = _u.jsx(gXd, {
        marginTop: 1,
        children: _u.jsx(Text, {
          dimColor: true,
          children: _u.jsxs(Hn, {
            children: [_u.jsx(Wr, {
              action: "settings:periodDay",
              context: "Settings",
              fallback: "d",
              description: "day"
            }), _u.jsx(Wr, {
              action: "settings:periodWeek",
              context: "Settings",
              fallback: "w",
              description: "week"
            })]
          })
        })
      });
      t[28] = k;
    } else {
      k = t[28];
    }
    let I;
    if (t[29] !== g || t[30] !== y || t[31] !== _ || t[32] !== A || t[33] !== x) {
      I = _u.jsxs(g, {
        flexDirection: x,
        children: [y, _, A, k]
      });
      t[29] = g;
      t[30] = y;
      t[31] = _;
      t[32] = A;
      t[33] = x;
      t[34] = I;
    } else {
      I = t[34];
    }
    return I;
  }
  function u3m(e) {
    return `/${e}`;
  }
  function d3m(e, t) {
    return `${e}% of your usage came from MCP server "${t}"`;
  }
  function p3m(e, t) {
    return `${e}% of your usage came from plugin "${t}"`;
  }
  function m3m(e, t) {
    return `${e}% of your usage came from /${t}`;
  }
  function f3m(e, t) {
    return `${e}% of your usage came from subagents under "${t}"`;
  }
  function A3l() {
    let e = iUe.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = _u.jsxs(gXd, {
        flexDirection: "column",
        children: [_u.jsx(Text, {
          bold: true,
          wrap: "wrap",
          children: "What's contributing to your limits usage?"
        }), _u.jsx(Text, {
          dimColor: true,
          wrap: "wrap",
          children: "Approximate, based on local sessions on this machine \u2014 does not include other devices or claude.ai"
        })]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  function dir(e) {
    let t = iUe.c(23);
    let {
      title: n,
      rows: r,
      label: o
    } = e;
    if (r.length === 0) {
      return null;
    }
    let s;
    let i;
    let a;
    let l;
    let c;
    if (t[0] !== o || t[1] !== r || t[2] !== n) {
      let p = r.slice(0, 8);
      c = r.length - 8;
      s = gXd;
      i = "column";
      let m;
      if (t[8] !== n) {
        m = _u.jsx(Text, {
          children: n
        });
        t[8] = n;
        t[9] = m;
      } else {
        m = t[9];
      }
      let f;
      if (t[10] === Symbol.for("react.memo_cache_sentinel")) {
        f = _u.jsx(Text, {
          dimColor: true,
          children: "% of usage"
        });
        t[10] = f;
      } else {
        f = t[10];
      }
      if (t[11] !== m) {
        a = _u.jsxs(gXd, {
          width: 28 + 6,
          justifyContent: "space-between",
          children: [m, f]
        });
        t[11] = m;
        t[12] = a;
      } else {
        a = t[12];
      }
      let h;
      if (t[13] !== o) {
        h = g => _u.jsxs(gXd, {
          children: [_u.jsx(gXd, {
            width: 28,
            children: _u.jsx(Text, {
              dimColor: true,
              wrap: "truncate-end",
              children: o ? o(g.name) : g.name
            })
          }), _u.jsx(gXd, {
            width: 6,
            justifyContent: "flex-end",
            children: _u.jsxs(Text, {
              dimColor: true,
              children: [g.pct, "%"]
            })
          })]
        }, g.name);
        t[13] = o;
        t[14] = h;
      } else {
        h = t[14];
      }
      l = p.map(h);
      t[0] = o;
      t[1] = r;
      t[2] = n;
      t[3] = s;
      t[4] = i;
      t[5] = a;
      t[6] = l;
      t[7] = c;
    } else {
      s = t[3];
      i = t[4];
      a = t[5];
      l = t[6];
      c = t[7];
    }
    let u;
    if (t[15] !== c) {
      u = c > 0 && _u.jsxs(Text, {
        dimColor: true,
        children: ["\u2026 ", c, " more"]
      });
      t[15] = c;
      t[16] = u;
    } else {
      u = t[16];
    }
    let d;
    if (t[17] !== s || t[18] !== i || t[19] !== a || t[20] !== l || t[21] !== u) {
      d = _u.jsxs(s, {
        flexDirection: i,
        children: [a, l, u]
      });
      t[17] = s;
      t[18] = i;
      t[19] = a;
      t[20] = l;
      t[21] = u;
      t[22] = d;
    } else {
      d = t[22];
    }
    return d;
  }
  function pir(e) {
    let t = iUe.c(12);
    let {
      top: n,
      maxWidth: r,
      headline: o,
      body: s
    } = e;
    if (!n || n.pct < 10) {
      return null;
    }
    let i;
    if (t[0] !== o || t[1] !== n.name || t[2] !== n.pct) {
      i = o(n.pct, n.name);
      t[0] = o;
      t[1] = n.name;
      t[2] = n.pct;
      t[3] = i;
    } else {
      i = t[3];
    }
    let a;
    if (t[4] !== i) {
      a = _u.jsx(Text, {
        wrap: "wrap",
        children: i
      });
      t[4] = i;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== s) {
      l = _u.jsx(gXd, {
        paddingLeft: 1,
        children: _u.jsx(Text, {
          dimColor: true,
          wrap: "wrap",
          children: s
        })
      });
      t[6] = s;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] !== r || t[9] !== a || t[10] !== l) {
      c = _u.jsxs(gXd, {
        flexDirection: "column",
        width: r,
        children: [a, l]
      });
      t[8] = r;
      t[9] = a;
      t[10] = l;
      t[11] = c;
    } else {
      c = t[11];
    }
    return c;
  }
  function h3m(e) {
    let t = iUe.c(22);
    let {
      stat: n,
      totalCost: r,
      maxWidth: o
    } = e;
    let s = s3m[n.key];
    let i;
    let a;
    let l;
    let c;
    let u;
    let d;
    if (t[0] !== o || t[1] !== s || t[2] !== n.cost || t[3] !== r) {
      let h = Math.round(n.cost / r * 100);
      a = gXd;
      u = "column";
      d = o;
      i = Text;
      l = "wrap";
      c = s.headline(h);
      t[0] = o;
      t[1] = s;
      t[2] = n.cost;
      t[3] = r;
      t[4] = i;
      t[5] = a;
      t[6] = l;
      t[7] = c;
      t[8] = u;
      t[9] = d;
    } else {
      i = t[4];
      a = t[5];
      l = t[6];
      c = t[7];
      u = t[8];
      d = t[9];
    }
    let p;
    if (t[10] !== i || t[11] !== l || t[12] !== c) {
      p = _u.jsx(i, {
        wrap: l,
        children: c
      });
      t[10] = i;
      t[11] = l;
      t[12] = c;
      t[13] = p;
    } else {
      p = t[13];
    }
    let m;
    if (t[14] !== s.body) {
      m = _u.jsx(gXd, {
        paddingLeft: 1,
        children: _u.jsx(Text, {
          dimColor: true,
          wrap: "wrap",
          children: s.body
        })
      });
      t[14] = s.body;
      t[15] = m;
    } else {
      m = t[15];
    }
    let f;
    if (t[16] !== a || t[17] !== u || t[18] !== d || t[19] !== p || t[20] !== m) {
      f = _u.jsxs(a, {
        flexDirection: u,
        width: d,
        children: [p, m]
      });
      t[16] = a;
      t[17] = u;
      t[18] = d;
      t[19] = p;
      t[20] = m;
      t[21] = f;
    } else {
      f = t[21];
    }
    return f;
  }
  var iUe;
  var lYe;
  var _u;
  var s3m;
  var w3l;
  var I3l = __lazy(() => {
    et();
    Bs();
    Vjo();
    Rn();
    Sd();
    Ai();
    iUe = __toESM(pt(), 1);
    lYe = __toESM(ot(), 1);
    _u = __toESM(ie(), 1);
    s3m = {
      cache_miss: {
        headline: e => `${e}% of your usage hit a >100k-token cache miss`,
        body: "Uncached input is expensive, and often happens when sending a message to a session that has gone idle. /compact before stepping away keeps the cold-start small."
      },
      long_context: {
        headline: e => `${e}% of your usage was at >150k context`,
        body: "Longer sessions are more expensive even when cached. /compact mid-task, /clear when switching to new tasks."
      },
      subagent_heavy: {
        headline: e => `${e}% of your usage came from subagent-heavy sessions`,
        body: "Each subagent runs its own requests. Be deliberate about spawning them \u2014 and consider configuring a cheaper model for simpler subagents."
      },
      high_parallel: {
        headline: e => `${e}% of your usage was while 4+ sessions ran in parallel`,
        body: "All sessions share one limit. If you don't need them all at once, queueing uses it more evenly."
      },
      cron: {
        headline: e => `${e}% of your usage came from sessions active for 8+ hours`,
        body: "These are often background/loop sessions. Continuous usage can add up quickly so make sure it is intentional."
      }
    };
    w3l = {
      totalCost: 0,
      requestCount: 0,
      sessionCount: 0,
      behaviors: [],
      agents: [],
      skills: [],
      plugins: [],
      mcpServers: []
    };
  });
  function Qjo(e) {
    let t = cYe.c(35);
    let {
      title: n,
      limit: r,
      maxWidth: o,
      showTimeInReset: s,
      alwaysShowDateInReset: i,
      extraSubtext: a,
      subtextOverride: l
    } = e;
    let c = s === undefined ? true : s;
    let u = i === undefined ? false : i;
    let {
      utilization: d,
      resets_at: p
    } = r;
    if (d === null) {
      return null;
    }
    let m = `${Math.floor(d)}% used`;
    let f;
    if (p) {
      let h;
      if (t[0] !== u || t[1] !== p || t[2] !== c) {
        h = formatResetText(p, true, c, u);
        t[0] = u;
        t[1] = p;
        t[2] = c;
        t[3] = h;
      } else {
        h = t[3];
      }
      f = `Resets ${h}`;
    }
    if (a) {
      if (f) {
        f = `${a} \xB7 ${f}`;
      } else {
        f = a;
      }
    }
    if (l !== undefined) {
      f = l;
    }
    if (o >= 62) {
      let h;
      if (t[4] !== n) {
        h = Cd.jsx(Text, {
          bold: true,
          children: n
        });
        t[4] = n;
        t[5] = h;
      } else {
        h = t[5];
      }
      let g = d / 100;
      let y;
      if (t[6] !== g) {
        y = Cd.jsx(e9, {
          ratio: g,
          width: 50,
          fillColor: "rate_limit_fill",
          emptyColor: "rate_limit_empty"
        });
        t[6] = g;
        t[7] = y;
      } else {
        y = t[7];
      }
      let _;
      if (t[8] !== m) {
        _ = Cd.jsx(Text, {
          children: m
        });
        t[8] = m;
        t[9] = _;
      } else {
        _ = t[9];
      }
      let b;
      if (t[10] !== y || t[11] !== _) {
        b = Cd.jsxs(gXd, {
          flexDirection: "row",
          gap: 1,
          children: [y, _]
        });
        t[10] = y;
        t[11] = _;
        t[12] = b;
      } else {
        b = t[12];
      }
      let S;
      if (t[13] !== f) {
        S = f && Cd.jsx(Text, {
          dimColor: true,
          children: f
        });
        t[13] = f;
        t[14] = S;
      } else {
        S = t[14];
      }
      let E;
      if (t[15] !== h || t[16] !== b || t[17] !== S) {
        E = Cd.jsxs(gXd, {
          flexDirection: "column",
          flexShrink: 0,
          children: [h, b, S]
        });
        t[15] = h;
        t[16] = b;
        t[17] = S;
        t[18] = E;
      } else {
        E = t[18];
      }
      return E;
    } else {
      let h;
      if (t[19] !== n) {
        h = Cd.jsx(Text, {
          bold: true,
          children: n
        });
        t[19] = n;
        t[20] = h;
      } else {
        h = t[20];
      }
      let g;
      if (t[21] !== f) {
        g = f && Cd.jsxs(Cd.Fragment, {
          children: [Cd.jsx(Text, {
            children: " "
          }), Cd.jsxs(Text, {
            dimColor: true,
            children: ["\xB7 ", f]
          })]
        });
        t[21] = f;
        t[22] = g;
      } else {
        g = t[22];
      }
      let y;
      if (t[23] !== h || t[24] !== g) {
        y = Cd.jsxs(Text, {
          children: [h, g]
        });
        t[23] = h;
        t[24] = g;
        t[25] = y;
      } else {
        y = t[25];
      }
      let _ = d / 100;
      let b;
      if (t[26] !== o || t[27] !== _) {
        b = Cd.jsx(e9, {
          ratio: _,
          width: o,
          fillColor: "rate_limit_fill",
          emptyColor: "rate_limit_empty"
        });
        t[26] = o;
        t[27] = _;
        t[28] = b;
      } else {
        b = t[28];
      }
      let S;
      if (t[29] !== m) {
        S = Cd.jsx(Text, {
          children: m
        });
        t[29] = m;
        t[30] = S;
      } else {
        S = t[30];
      }
      let E;
      if (t[31] !== y || t[32] !== b || t[33] !== S) {
        E = Cd.jsxs(gXd, {
          flexDirection: "column",
          flexShrink: 0,
          children: [y, b, S]
        });
        t[31] = y;
        t[32] = b;
        t[33] = S;
        t[34] = E;
      } else {
        E = t[34];
      }
      return E;
    }
  }
  function P3l() {
    let e = cYe.c(6);
    let {
      columns: t
    } = Sr();
    let n = t - 2;
    let r = Math.min(n, 80);
    let o;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = isClaudeAISubscriber();
      e[0] = o;
    } else {
      o = e[0];
    }
    let s = o;
    let i;
    if (e[1] === Symbol.for("react.memo_cache_sentinel")) {
      i = Ul();
      e[1] = i;
    } else {
      i = e[1];
    }
    let a = i !== null;
    let l;
    let c;
    if (e[2] === Symbol.for("react.memo_cache_sentinel")) {
      l = Cd.jsx(g3m, {
        isThinClient: a
      });
      c = getFeatureValue_CACHED_MAY_BE_STALE("tengu_lantern_prism", false) ? Cd.jsx(E3l, {}) : null;
      e[2] = l;
      e[3] = c;
    } else {
      l = e[2];
      c = e[3];
    }
    let u;
    if (e[4] !== r) {
      u = Cd.jsx(gXd, {
        flexDirection: "column",
        width: "100%",
        children: Cd.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          flexShrink: 0,
          children: [l, c, s ? Cd.jsx(_3m, {
            maxWidth: r
          }) : Cd.jsx(Text, {
            dimColor: true,
            children: Cd.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "cancel"
            })
          })]
        })
      });
      e[4] = r;
      e[5] = u;
    } else {
      u = e[5];
    }
    return u;
  }
  function g3m(e) {
    let t = cYe.c(8);
    let {
      isThinClient: n
    } = e;
    let r;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      r = Li(RMe());
      t[0] = r;
    } else {
      r = t[0];
    }
    let o = r;
    let s = y3m(n);
    let i = n ? " (remote)" : "";
    let a;
    if (t[1] !== i) {
      a = Cd.jsxs(Dv, {
        children: ["Session", i]
      });
      t[1] = i;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l = n ? s : o;
    let c;
    if (t[3] !== l) {
      c = Cd.jsx(Text, {
        dimColor: true,
        children: l
      });
      t[3] = l;
      t[4] = c;
    } else {
      c = t[4];
    }
    let u;
    if (t[5] !== a || t[6] !== c) {
      u = Cd.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [a, c]
      });
      t[5] = a;
      t[6] = c;
      t[7] = u;
    } else {
      u = t[7];
    }
    return u;
  }
  function y3m(e) {
    let t = cYe.c(3);
    let [n, r] = Nwe.useState("Loading remote cost\u2026");
    let o;
    let s;
    if (t[0] !== e) {
      o = () => {
        if (!e) {
          return;
        }
        let i = false;
        let a = Ul();
        if (!a) {
          r("Remote cost unavailable");
          return;
        }
        a.sendControlRequest({
          subtype: "get_session_cost"
        }).then(l => {
          if (!i) {
            r(l.text);
          }
        }).catch(l => {
          if (!i) {
            r(`Remote cost unavailable (${he(l)})`);
          }
        });
        return () => {
          i = true;
        };
      };
      s = [e];
      t[0] = e;
      t[1] = o;
      t[2] = s;
    } else {
      o = t[1];
      s = t[2];
    }
    Nwe.useEffect(o, s);
    return n;
  }
  function _3m(e) {
    let t = cYe.c(54);
    let {
      maxWidth: n
    } = e;
    let [r, o] = Nwe.useState(seedUtilization);
    let [s, i] = Nwe.useState(null);
    let [a, l] = Nwe.useState(null);
    let [c, u] = Nwe.useState(true);
    let d;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      d = async () => {
        u(true);
        i(null);
        l(null);
        let j = await loadPlanRateLimits();
        e: switch (j.status) {
          case "ok":
            {
              o(j.utilization);
              Pe("usage_plan_limits");
              break e;
            }
          case "empty_response":
            {
              Ae("usage_plan_limits", "empty_response");
              i("Failed to load usage data");
              break e;
            }
          case "seeded":
            {
              o(z => z ?? j.utilization);
              l(j.isRateLimited ? "Per-model breakdown unavailable (rate limited \u2014 try again in a moment)" : "Could not refresh usage data");
              Et("usage_plan_limits", j.isRateLimited ? "rate_limited_seeded" : "refresh_failed_seeded");
              break e;
            }
          case "unavailable":
            if (j.isRateLimited) {
              i("Usage endpoint is rate limited. Please try again in a moment.");
              Ae("usage_plan_limits", "rate_limited");
            } else {
              i(j.responseBody ? `${"Failed to load usage data"}: ${j.responseBody}` : "Failed to load usage data");
              Ae("usage_plan_limits", "load_failed");
            }
        }
        u(false);
      };
      t[0] = d;
    } else {
      d = t[0];
    }
    let p = d;
    let m;
    let f;
    if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
      m = () => {
        p();
      };
      f = [p];
      t[1] = m;
      t[2] = f;
    } else {
      m = t[1];
      f = t[2];
    }
    Nwe.useEffect(m, f);
    let h;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      h = () => {
        p();
      };
      t[3] = h;
    } else {
      h = t[3];
    }
    let g = (!!s || !!a) && !c;
    let y;
    if (t[4] !== g) {
      y = {
        context: "Settings",
        isActive: g
      };
      t[4] = g;
      t[5] = y;
    } else {
      y = t[5];
    }
    if (uo("settings:retry", h, y), s) {
      let j;
      if (t[6] !== s) {
        j = Cd.jsxs(Text, {
          color: "error",
          children: ["Error: ", s]
        });
        t[6] = s;
        t[7] = j;
      } else {
        j = t[7];
      }
      let z;
      if (t[8] === Symbol.for("react.memo_cache_sentinel")) {
        z = Cd.jsx(Text, {
          dimColor: true,
          children: Cd.jsxs(Hn, {
            children: [Cd.jsx(Wr, {
              action: "settings:retry",
              context: "Settings",
              fallback: "r",
              description: "retry"
            }), Cd.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        });
        t[8] = z;
      } else {
        z = t[8];
      }
      let V;
      if (t[9] !== j) {
        V = Cd.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [j, z]
        });
        t[9] = j;
        t[10] = V;
      } else {
        V = t[10];
      }
      return V;
    }
    if (!r) {
      let j;
      if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
        j = Cd.jsx(Text, {
          dimColor: true,
          children: "Loading usage data\u2026"
        });
        t[11] = j;
      } else {
        j = t[11];
      }
      let z;
      if (t[12] === Symbol.for("react.memo_cache_sentinel")) {
        z = Cd.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          children: [j, Cd.jsx(Text, {
            dimColor: true,
            children: Cd.jsx(Wr, {
              action: "confirm:no",
              context: "Settings",
              fallback: "Esc",
              description: "cancel"
            })
          })]
        });
        t[12] = z;
      } else {
        z = t[12];
      }
      return z;
    }
    let _;
    if (t[13] === Symbol.for("react.memo_cache_sentinel")) {
      _ = getSubscriptionType();
      t[13] = _;
    } else {
      _ = t[13];
    }
    let b = _;
    let S = b === "max" || b === "team" || b === null;
    let E;
    if (t[14] !== r.five_hour) {
      E = {
        title: "Current session",
        limit: r.five_hour,
        alwaysShowDateInReset: false
      };
      t[14] = r.five_hour;
      t[15] = E;
    } else {
      E = t[15];
    }
    let C;
    if (t[16] !== r.seven_day) {
      C = {
        title: "Current week (all models)",
        limit: r.seven_day,
        alwaysShowDateInReset: true
      };
      t[16] = r.seven_day;
      t[17] = C;
    } else {
      C = t[17];
    }
    let x;
    if (t[18] !== r.seven_day_sonnet) {
      x = S ? [{
        title: "Current week (Sonnet only)",
        limit: r.seven_day_sonnet,
        alwaysShowDateInReset: true
      }] : [];
      t[18] = r.seven_day_sonnet;
      t[19] = x;
    } else {
      x = t[19];
    }
    let A;
    if (t[20] !== x || t[21] !== E || t[22] !== C || t[23] !== r.limits) {
      A = [E, C, ...x, ...lpt(r.limits, vDe()).map(b3m)];
      t[20] = x;
      t[21] = E;
      t[22] = C;
      t[23] = r.limits;
      t[24] = A;
    } else {
      A = t[24];
    }
    let k = A;
    let I;
    if (t[25] !== k || t[26] !== n) {
      I = k.map(j => {
        let {
          title: z,
          limit: V,
          alwaysShowDateInReset: K
        } = j;
        return V && Cd.jsx(Qjo, {
          title: z,
          limit: V,
          maxWidth: n,
          alwaysShowDateInReset: K
        }, z);
      });
      t[25] = k;
      t[26] = n;
      t[27] = I;
    } else {
      I = t[27];
    }
    let O;
    if (t[28] !== n || t[29] !== r.cinder_cove) {
      O = r.cinder_cove && Cd.jsx(Qjo, {
        title: "Claude Code and Cowork credit",
        limit: r.cinder_cove,
        maxWidth: n,
        subtextOverride: r.cinder_cove.resets_at ? `One-time credit \xB7 Expires ${new Date(r.cinder_cove.resets_at).toLocaleDateString("en-US", {
          month: "long",
          day: "numeric"
        })}` : "One-time credit"
      });
      t[28] = n;
      t[29] = r.cinder_cove;
      t[30] = O;
    } else {
      O = t[30];
    }
    let M;
    if (t[31] !== n) {
      M = Cd.jsx(k3l, {
        maxWidth: n
      });
      t[31] = n;
      t[32] = M;
    } else {
      M = t[32];
    }
    let L;
    if (t[33] !== n || t[34] !== r.extra_usage) {
      L = r.extra_usage && Cd.jsx(S3m, {
        extraUsage: r.extra_usage,
        maxWidth: n
      });
      t[33] = n;
      t[34] = r.extra_usage;
      t[35] = L;
    } else {
      L = t[35];
    }
    let P;
    if (t[36] !== a) {
      P = a && Cd.jsx(Text, {
        dimColor: true,
        children: a
      });
      t[36] = a;
      t[37] = P;
    } else {
      P = t[37];
    }
    let F;
    if (t[38] !== a || t[39] !== c) {
      F = c && !a && Cd.jsx(Text, {
        dimColor: true,
        children: "Refreshing\u2026"
      });
      t[38] = a;
      t[39] = c;
      t[40] = F;
    } else {
      F = t[40];
    }
    let H;
    if (t[41] !== a) {
      H = a && Cd.jsx(Wr, {
        action: "settings:retry",
        context: "Settings",
        fallback: "r",
        description: "retry"
      });
      t[41] = a;
      t[42] = H;
    } else {
      H = t[42];
    }
    let U;
    if (t[43] === Symbol.for("react.memo_cache_sentinel")) {
      U = Cd.jsx(Wr, {
        action: "confirm:no",
        context: "Settings",
        fallback: "Esc",
        description: "cancel"
      });
      t[43] = U;
    } else {
      U = t[43];
    }
    let N;
    if (t[44] !== H) {
      N = Cd.jsx(Text, {
        dimColor: true,
        children: Cd.jsxs(Hn, {
          children: [H, U]
        })
      });
      t[44] = H;
      t[45] = N;
    } else {
      N = t[45];
    }
    let W;
    if (t[46] !== I || t[47] !== O || t[48] !== M || t[49] !== L || t[50] !== P || t[51] !== F || t[52] !== N) {
      W = Cd.jsxs(gXd, {
        flexDirection: "column",
        gap: 1,
        children: [I, O, M, L, P, F, N]
      });
      t[46] = I;
      t[47] = O;
      t[48] = M;
      t[49] = L;
      t[50] = P;
      t[51] = F;
      t[52] = N;
      t[53] = W;
    } else {
      W = t[53];
    }
    return W;
  }
  function b3m(e) {
    return {
      ...e,
      alwaysShowDateInReset: true
    };
  }
  function S3m(e) {
    let t = cYe.c(22);
    let {
      extraUsage: n,
      maxWidth: r
    } = e;
    let o = getSubscriptionType();
    if (!(o === "pro" || o === "max")) {
      return false;
    }
    if (!n.is_enabled) {
      if (Mse.isEnabled()) {
        let _;
        if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
          _ = Cd.jsx(Dv, {
            subtitle: "Usage credits are off \xB7 /usage-credits to turn them on",
            children: "Usage credits"
          });
          t[0] = _;
        } else {
          _ = t[0];
        }
        return _;
      }
      return null;
    }
    if (n.monthly_limit === null) {
      let _;
      if (t[1] === Symbol.for("react.memo_cache_sentinel")) {
        _ = Cd.jsx(Dv, {
          subtitle: "Unlimited",
          children: "Usage credits"
        });
        t[1] = _;
      } else {
        _ = t[1];
      }
      return _;
    }
    if (typeof n.used_credits !== "number" || typeof n.utilization !== "number") {
      return null;
    }
    let i = n.currency ?? "USD";
    let a;
    if (t[2] !== i || t[3] !== n.used_credits) {
      a = Ky(n.used_credits, i);
      t[2] = i;
      t[3] = n.used_credits;
      t[4] = a;
    } else {
      a = t[4];
    }
    let l = a;
    let c;
    if (t[5] !== i || t[6] !== n.monthly_limit) {
      c = Ky(n.monthly_limit, i);
      t[5] = i;
      t[6] = n.monthly_limit;
      t[7] = c;
    } else {
      c = t[7];
    }
    let u = c;
    let d;
    let p;
    let m;
    let f;
    if (t[8] !== n.utilization) {
      let _ = new Date();
      let b = new Date(_.getFullYear(), _.getMonth() + 1, 1);
      d = Qjo;
      f = "Usage credits";
      p = n.utilization;
      m = b.toISOString();
      t[8] = n.utilization;
      t[9] = d;
      t[10] = p;
      t[11] = m;
      t[12] = f;
    } else {
      d = t[9];
      p = t[10];
      m = t[11];
      f = t[12];
    }
    let h;
    if (t[13] !== p || t[14] !== m) {
      h = {
        utilization: p,
        resets_at: m
      };
      t[13] = p;
      t[14] = m;
      t[15] = h;
    } else {
      h = t[15];
    }
    let g = `${l} / ${u} spent`;
    let y;
    if (t[16] !== d || t[17] !== r || t[18] !== f || t[19] !== h || t[20] !== g) {
      y = Cd.jsx(d, {
        title: f,
        limit: h,
        showTimeInReset: false,
        alwaysShowDateInReset: true,
        extraSubtext: g,
        maxWidth: r
      });
      t[16] = d;
      t[17] = r;
      t[18] = f;
      t[19] = h;
      t[20] = g;
      t[21] = y;
    } else {
      y = t[21];
    }
    return y;
  }
  var cYe;
  var Nwe;
  var Cd;
  var O3l = __lazy(() => {
    HSt();
    HQt();
    C$();
    ru();
    $n();
    no();
    Wve();
    dt();
    ki();
    et();
    Bs();
    ln();
    ETe();
    cs();
    Sd();
    Ai();
    uK();
    LMe();
    v3l();
    I3l();
    cYe = __toESM(pt(), 1);
    Nwe = __toESM(ot(), 1);
    Cd = __toESM(ie(), 1);
  });