  var gbc;
  var OvE;
  var DvE;
  var MvE;
  var NvE;
  var LvE;
  var ybc;
  var FvE;
  var _bc;
  var UvE;
  var ic;
  var BvE;
  var efr = __lazy(() => {
    gbc = __toESM(hbc(), 1);
    ({
      program: OvE,
      createCommand: DvE,
      createArgument: MvE,
      createOption: NvE,
      CommanderError: LvE,
      InvalidArgumentError: ybc,
      InvalidOptionArgumentError: FvE,
      Command: _bc,
      Argument: UvE,
      Option: ic,
      Help: BvE
    } = gbc.default);
  });
  function aYo(e, t) {
    let n = Math.max(t, 1);
    let r = [];
    for (let o of e.split(`
`)) {
      let s = o.match(/\s*\S+/g);
      if (!s) {
        r.push("");
        continue;
      }
      let i = "";
      let a = 0;
      let l = false;
      for (let c of s) {
        let u = an(c);
        if (!l) {
          i = c;
          a = u;
          l = true;
        } else if (a + u <= n) {
          i += c;
          a += u;
        } else {
          r.push(i);
          let d = c.replace(/^\s+/, "");
          i = d;
          a = an(d);
        }
      }
      r.push(i);
    }
    return r.join(`
`);
  }
  function tfr(e, t, n, r) {
    let o = " ".repeat(2);
    if (!t) {
      return o + e;
    }
    let s = an(e);
    if (t.includes(`
`)) {
      let u = s <= n ? hm(" ", n - s + 2) : " ".repeat(2);
      return (o + e + u + t).replace(/\n/g, `
` + o);
    }
    let i = r - 2 - n - 2;
    if (s <= n && i >= 30) {
      let u = hm(" ", n - s + 2);
      let d = " ".repeat(2 + n + 2);
      let p = aYo(t, i);
      return o + e + u + p.replace(/\n/g, `
` + d);
    }
    let a = " ".repeat(2 + 4);
    let l = r - 2 - 4;
    let c = aYo(t, l);
    return o + e + `
` + a + c.replace(/\n/g, `
` + a);
  }
  function nfr(e, t, n) {
    if (n.length === 0) {
      return;
    }
    e.push(t, ...n, "");
  }
  function z_f(e, t) {
    let n = t.helpWidth || 80;
    let r = Math.min(t.padWidth(e, t), 36);
    let o = [`Usage: ${t.commandUsage(e)}`, ""];
    let s = t.commandDescription(e);
    if (s.length > 0) {
      o.push(aYo(s, n), "");
    }
    if (nfr(o, "Arguments:", t.visibleArguments(e).map(i => tfr(t.argumentTerm(i), t.argumentDescription(i), r, n))), nfr(o, "Options:", t.visibleOptions(e).map(i => tfr(t.optionTerm(i), t.optionDescription(i), r, n))), t.showGlobalOptions) {
      nfr(o, "Global Options:", t.visibleGlobalOptions(e).map(i => tfr(t.optionTerm(i), t.optionDescription(i), r, n)));
    }
    nfr(o, "Commands:", t.visibleCommands(e).map(i => tfr(t.subcommandTerm(i), t.subcommandDescription(i), r, n)));
    return o.join(`
`);
  }
  function $Ce() {
    let e = t => t.long?.replace(/^--/, "") ?? t.short?.replace(/^-/, "") ?? "";
    return Object.assign({
      sortSubcommands: true,
      sortOptions: true,
      formatHelp: z_f
    }, {
      compareOptions: (t, n) => e(t).localeCompare(e(n))
    });
  }
  var rfr = __lazy(() => {
    bc();
    Zn();
  });
  function Sbc(e) {
    e.command("add <name> <commandOrUrl> [args...]").description(`Add an MCP server to Claude Code.

Examples:
  # Add HTTP server:
  claude mcp add --transport http sentry https://mcp.sentry.dev/mcp

  # Add HTTP server with headers:
  claude mcp add --transport http corridor https://app.corridor.dev/api/mcp --header "Authorization: Bearer ..."

  # Add stdio server with environment variables:
  claude mcp add my-server -e API_KEY=xxx -- npx my-mcp-server

  # Add stdio server with subprocess flags:
  claude mcp add my-server -- my-command --some-flag arg1`).option("-s, --scope <scope>", "Configuration scope (local, user, or project)", "local").option("-t, --transport <transport>", "Transport type (stdio, sse, http). Defaults to stdio if not specified.").option("-e, --env <env...>", "Set environment variables (e.g. -e KEY=value)").option("-H, --header <header...>", 'Set WebSocket headers (e.g. -H "X-Api-Key: abc123" -H "X-Custom: value")').option("--client-id <clientId>", "OAuth client ID for HTTP/SSE servers").option("--client-secret", "Prompt for OAuth client secret (or set MCP_CLIENT_SECRET env var)").option("--callback-port <port>", "Fixed port for OAuth callback (for servers requiring pre-registered redirect URIs)").helpOption("-h, --help", "Display help for command").addOption(new ic("--xaa", "Enable XAA (SEP-990) for this server. Requires 'claude mcp xaa setup' first. Also requires --client-id and --client-secret (for the MCP server's AS).").hideHelp(!mJ())).action(async (t, n, r, o) => {
      let s = n;
      let i = r;
      if (!t) {
        Es(`Error: Server name is required.
Usage: claude mcp add <name> <command> [args...]`);
      } else if (!s) {
        Es(`Error: Command is required when server name is provided.
Usage: claude mcp add <name> <command> [args...]`);
      }
      try {
        let a = Yft(o.scope);
        let l = kHa(o.transport);
        if (o.xaa && !mJ()) {
          Es("Error: --xaa requires CLAUDE_CODE_ENABLE_XAA=1 in your environment");
        }
        let c = Boolean(o.xaa);
        if (c) {
          let p = [];
          if (!o.clientId) {
            p.push("--client-id");
          }
          if (!o.clientSecret) {
            p.push("--client-secret");
          }
          if (!Pce()) {
            p.push("'claude mcp xaa setup' (settings.xaaIdp not configured)");
          }
          if (p.length) {
            Es(`Error: --xaa requires: ${p.join(", ")}`);
          }
        }
        let u = o.transport !== undefined;
        let d = s.startsWith("http://") || s.startsWith("https://") || s.startsWith("localhost") || s.endsWith("/sse") || s.endsWith("/mcp");
        if (await logEventAsync("tengu_mcp_add", {
          type: l,
          scope: a,
          source: "command",
          transport: l,
          transportExplicit: u,
          looksLikeUrl: d
        }), l === "sse") {
          if (!s) {
            return Ih("Error: URL is required for SSE transport.");
          }
          let p = o.header ? ASo(o.header) : undefined;
          let m = o.callbackPort ? parseInt(o.callbackPort, 10) : undefined;
          let f = o.clientId || m || c ? {
            ...(o.clientId && {
              clientId: o.clientId
            }),
            ...(m && {
              callbackPort: m
            }),
            ...(c && {
              xaa: true
            })
          } : undefined;
          let h = o.clientSecret && o.clientId ? await a5t() : undefined;
          let g = {
            type: "sse",
            url: s,
            headers: p,
            oauth: f
          };
          if (await addMcpConfig(t, g, a), h) {
            let y = await l5t(t, g, h);
            if (!y.success) {
              process.stderr.write(`Server added, but the client secret could not be stored${y.warning ? ` (${y.warning})` : ""}. Re-run with --client-secret once secure storage is available.
`);
            }
          }
          if (process.stdout.write(`Added SSE MCP server ${t} with URL: ${Vge(s)} to ${a} config
`), p) {
            process.stdout.write(`Headers: ${De(IRr(p), null, 2)}
`);
          }
        } else if (l === "http") {
          if (!s) {
            return Ih("Error: URL is required for HTTP transport.");
          }
          let p = o.header ? ASo(o.header) : undefined;
          let m = o.callbackPort ? parseInt(o.callbackPort, 10) : undefined;
          let f = o.clientId || m || c ? {
            ...(o.clientId && {
              clientId: o.clientId
            }),
            ...(m && {
              callbackPort: m
            }),
            ...(c && {
              xaa: true
            })
          } : undefined;
          let h = o.clientSecret && o.clientId ? await a5t() : undefined;
          let g = {
            type: "http",
            url: s,
            headers: p,
            oauth: f
          };
          if (await addMcpConfig(t, g, a), h) {
            let y = await l5t(t, g, h);
            if (!y.success) {
              process.stderr.write(`Server added, but the client secret could not be stored${y.warning ? ` (${y.warning})` : ""}. Re-run with --client-secret once secure storage is available.
`);
            }
          }
          if (process.stdout.write(`Added HTTP MCP server ${t} with URL: ${Vge(s)} to ${a} config
`), p) {
            process.stdout.write(`Headers: ${De(IRr(p), null, 2)}
`);
          }
        } else {
          if (o.clientId || o.clientSecret || o.callbackPort || o.xaa) {
            process.stderr.write(`Warning: --client-id, --client-secret, --callback-port, and --xaa are only supported for HTTP/SSE transports and will be ignored for stdio.
`);
          }
          let p = d ? Vge(s) : s;
          if (!u && d) {
            process.stderr.write(`
Warning: The command "${p}" looks like a URL, but is being interpreted as a stdio server as --transport was not specified.
`);
            let f = Py("mcp add --transport http", t);
            let h = Py("mcp add --transport sse", t);
            if (f && h) {
              process.stderr.write(`If this is an HTTP server, use: ${f} ${p}
`);
              process.stderr.write(`If this is an SSE server, use: ${h} ${p}
`);
            } else {
              process.stderr.write(`If this is a remote server, re-run with --transport http (or sse).
`);
            }
          }
          let m = pus(o.env);
          await addMcpConfig(t, {
            type: "stdio",
            command: s,
            args: i,
            env: m
          }, a);
          process.stdout.write(`Added stdio MCP server ${t} with command: ${p} ${i.join(" ")} to ${a} config
`);
        }
        return U5(`File modified: ${D$(a)}`);
      } catch (a) {
        return Ih(he(a));
      }
    });
  }
  var Tbc = __lazy(() => {
    efr();
    SL();
    Ot();
    Moe();
    Iw();
    G1();
    E4e();
    gn();
    dt();
    Kv();
  });
  function Ebc(e) {
    let t = e.command("xaa").description("Manage the XAA (SEP-990) IdP connection");
    t.command("setup").description("Configure the IdP connection (one-time setup for all XAA-enabled servers)").requiredOption("--issuer <url>", "IdP issuer URL (OIDC discovery)").requiredOption("--client-id <id>", "Claude Code's client_id at the IdP").option("--client-secret", "Read IdP client secret from MCP_XAA_IDP_CLIENT_SECRET env var").option("--callback-port <port>", "Fixed loopback callback port (only if IdP does not honor RFC 8252 port-any matching)").action(async n => {
      let r;
      try {
        r = new URL(n.issuer);
      } catch {
        return Es(`Error: --issuer must be a valid URL (got "${n.issuer}")`);
      }
      if (r.protocol !== "https:" && !(r.protocol === "http:" && (r.hostname === "localhost" || r.hostname === "127.0.0.1" || r.hostname === "[::1]"))) {
        return Es(`Error: --issuer must use https:// (got "${r.protocol}//${r.host}")`);
      }
      let o = n.callbackPort ? parseInt(n.callbackPort, 10) : undefined;
      if (o !== undefined && (!Number.isInteger(o) || o <= 0)) {
        return Es("Error: --callback-port must be a positive integer");
      }
      let s = n.clientSecret ? process.env.MCP_XAA_IDP_CLIENT_SECRET : undefined;
      if (n.clientSecret && !s) {
        return Es("Error: --client-secret requires MCP_XAA_IDP_CLIENT_SECRET env var");
      }
      let i = Pce();
      let a = i?.issuer;
      let l = i?.clientId;
      let {
        error: c
      } = updateSettingsForSource("userSettings", {
        xaaIdp: {
          issuer: n.issuer,
          clientId: n.clientId,
          callbackPort: o
        }
      });
      if (c) {
        return Es(`Error writing settings: ${c.message}`);
      }
      if (a) {
        if (ybe(a) !== ybe(n.issuer)) {
          await TIe(a);
          await UIn(a);
        } else if (l !== n.clientId) {
          await TIe(a);
          await UIn(a);
        }
      }
      if (s) {
        let {
          success: u,
          warning: d
        } = await cDi(n.issuer, s);
        if (!u) {
          return Es(`Error: settings written but keychain save failed${d ? ` \u2014 ${d}` : ""}. Re-run with --client-secret once keychain is available.`);
        }
      }
      W0(`XAA IdP connection configured for ${n.issuer}`);
    });
    t.command("login").description("Cache an IdP id_token so XAA-enabled MCP servers authenticate silently. Default: run the OIDC browser login. With --id-token: write a pre-obtained JWT directly (used by conformance/e2e tests where the mock IdP does not serve /authorize).").option("--force", "Ignore any cached id_token and re-login (useful after IdP-side revocation)").option("--id-token <jwt>", "Write this pre-obtained id_token directly to cache, skipping the OIDC browser login").action(async n => {
      let r = Pce();
      if (!r) {
        return Es("Error: no XAA IdP connection. Run 'claude mcp xaa setup' first.");
      }
      if (n.idToken) {
        try {
          let s = await lDi(r.issuer, n.idToken);
          return W0(`id_token cached for ${r.issuer} (expires ${new Date(s).toISOString()})`);
        } catch (s) {
          return Es(`id_token cache write failed: ${he(s)}`);
        }
      }
      if (n.force) {
        await TIe(r.issuer);
      }
      if ((await T4e(r.issuer)) !== undefined) {
        return W0(`Already logged in to ${r.issuer} (cached id_token still valid). Use --force to re-login.`);
      }
      process.stdout.write(`Opening browser for IdP login at ${r.issuer}\u2026
`);
      try {
        await $In({
          idpIssuer: r.issuer,
          idpClientId: r.clientId,
          idpClientSecret: await pat(r.issuer),
          callbackPort: r.callbackPort,
          onAuthorizationUrl: s => {
            process.stdout.write(`If the browser did not open, visit:
  ${s}
`);
          }
        });
        W0("Logged in. MCP servers with --xaa will now authenticate silently.");
      } catch (s) {
        Es(`IdP login failed: ${he(s)}`);
      }
    });
    t.command("show").description("Show the current IdP connection config").action(async () => {
      let n = Pce();
      if (!n) {
        return W0("No XAA IdP connection configured.");
      }
      let r = (await pat(n.issuer)) !== undefined;
      let o = (await T4e(n.issuer)) !== undefined;
      if (process.stdout.write(`Issuer:        ${n.issuer}
`), process.stdout.write(`Client ID:     ${n.clientId}
`), n.callbackPort !== undefined) {
        process.stdout.write(`Callback port: ${n.callbackPort}
`);
      }
      process.stdout.write(`Client secret: ${r ? "(stored in keychain)" : "(not set \u2014 PKCE-only)"}
`);
      process.stdout.write(`Logged in:     ${o ? "yes (id_token cached)" : "no \u2014 run 'claude mcp xaa login'"}
`);
      W0();
    });
    t.command("clear").description("Clear the IdP connection config and cached id_token").action(async () => {
      let n = Pce();
      let {
        error: r
      } = updateSettingsForSource("userSettings", {
        xaaIdp: undefined
      });
      if (r) {
        return Es(`Error writing settings: ${r.message}`);
      }
      if (n) {
        await TIe(n.issuer);
        await UIn(n.issuer);
      }
      W0("XAA IdP connection cleared");
    });
  }
  var vbc = __lazy(() => {
    SL();
    E4e();
    dt();
  });
  function Cbc(e) {
    let t = wbc.c(36);
    let {
      servers: n,
      scope: r,
      onDone: o
    } = e;
    let s;
    if (t[0] !== n) {
      s = Object.keys(n);
      t[0] = n;
      t[1] = s;
    } else {
      s = t[1];
    }
    let i = s;
    let a;
    if (t[2] === Symbol.for("react.memo_cache_sentinel")) {
      a = {};
      t[2] = a;
    } else {
      a = t[2];
    }
    let [l, c] = ofr.useState(a);
    let u;
    let d;
    if (t[3] === Symbol.for("react.memo_cache_sentinel")) {
      u = () => {
        getAllMcpConfigs().then(F => {
          let {
            servers: H
          } = F;
          return c(H);
        });
      };
      d = [];
      t[3] = u;
      t[4] = d;
    } else {
      u = t[3];
      d = t[4];
    }
    ofr.useEffect(u, d);
    let p;
    if (t[5] !== l || t[6] !== i) {
      p = i.filter(F => l[F] !== undefined);
      t[5] = l;
      t[6] = i;
      t[7] = p;
    } else {
      p = t[7];
    }
    let m = p;
    let f = async function (H) {
      let U = 0;
      for (let N of H) {
        let W = n[N];
        if (W) {
          let j = N;
          if (l[j] !== undefined) {
            let z = 1;
            while (l[`${N}_${z}`] !== undefined) {
              z++;
            }
            j = `${N}_${z}`;
          }
          await addMcpConfig(j, W, r);
          U++;
        }
      }
      y(U);
    };
    let [h] = useTheme();
    let g;
    if (t[8] !== o || t[9] !== r || t[10] !== h) {
      g = F => {
        if (F > 0) {
          writeToStdout(`
${color("success", h)(`Successfully imported ${F} MCP ${un(F, "server")} to ${r} config.`)}
`);
        } else {
          writeToStdout(`
No servers were imported.`);
        }
        o();
        gracefulShutdown();
      };
      t[8] = o;
      t[9] = r;
      t[10] = h;
      t[11] = g;
    } else {
      g = t[11];
    }
    let y = g;
    let _;
    if (t[12] !== y) {
      _ = () => {
        y(0);
      };
      t[12] = y;
      t[13] = _;
    } else {
      _ = t[13];
    }
    let b = _;
    let S = i.length;
    let E;
    if (t[14] !== i.length) {
      E = un(i.length, "server");
      t[14] = i.length;
      t[15] = E;
    } else {
      E = t[15];
    }
    let C = `Found ${S} MCP ${E} in Claude Desktop.`;
    let x;
    if (t[16] !== m.length) {
      x = m.length > 0 && Q3.jsx(Text, {
        color: "warning",
        children: "Note: Some servers already exist with the same name. If selected, they will be imported with a numbered suffix."
      });
      t[16] = m.length;
      t[17] = x;
    } else {
      x = t[17];
    }
    let A;
    if (t[18] === Symbol.for("react.memo_cache_sentinel")) {
      A = Q3.jsx(Text, {
        children: "Please select the servers you want to import:"
      });
      t[18] = A;
    } else {
      A = t[18];
    }
    let k;
    let I;
    if (t[19] !== m || t[20] !== i) {
      k = i.map(F => ({
        label: `${F}${m.includes(F) ? " (already exists)" : ""}`,
        value: F
      }));
      I = i.filter(F => !m.includes(F));
      t[19] = m;
      t[20] = i;
      t[21] = k;
      t[22] = I;
    } else {
      k = t[21];
      I = t[22];
    }
    let O;
    if (t[23] !== b || t[24] !== f || t[25] !== k || t[26] !== I) {
      O = Q3.jsx(eUe, {
        options: k,
        defaultValue: I,
        onSubmit: f,
        onCancel: b,
        hideIndexes: true
      });
      t[23] = b;
      t[24] = f;
      t[25] = k;
      t[26] = I;
      t[27] = O;
    } else {
      O = t[27];
    }
    let M;
    if (t[28] !== b || t[29] !== C || t[30] !== x || t[31] !== O) {
      M = Q3.jsxs(or, {
        title: "Import MCP Servers from Claude Desktop",
        subtitle: C,
        color: "success",
        onCancel: b,
        hideInputGuide: true,
        children: [x, A, O]
      });
      t[28] = b;
      t[29] = C;
      t[30] = x;
      t[31] = O;
      t[32] = M;
    } else {
      M = t[32];
    }
    let L;
    if (t[33] === Symbol.for("react.memo_cache_sentinel")) {
      L = Q3.jsx(gXd, {
        paddingX: 1,
        children: Q3.jsx(Text, {
          dimColor: true,
          italic: true,
          children: Q3.jsxs(Hn, {
            children: [Q3.jsx(xt, {
              chord: "space",
              action: "select"
            }), Q3.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), Q3.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "cancel"
            })]
          })
        })
      });
      t[33] = L;
    } else {
      L = t[33];
    }
    let P;
    if (t[34] !== M) {
      P = Q3.jsxs(Q3.Fragment, {
        children: [M, L]
      });
      t[34] = M;
      t[35] = P;
    } else {
      P = t[35];
    }
    return P;
  }
  var wbc;
  var ofr;
  var Q3;
  var Rbc = __lazy(() => {
    lm();
    OD();
    et();
    Iw();
    Zn();
    Sd();
    MQt();
    Ai();
    Ii();
    bs();
    wbc = __toESM(pt(), 1);
    ofr = __toESM(ot(), 1);
    Q3 = __toESM(ie(), 1);
  });
  async function G5(e) {
    if (!xCo()) {
      return;
    }
    if (e.hasDynamicMcpConfig || !e.pluginStateReliable || (await K_f())) {
      logForDebugging("[mcp-policy-cold-start] waiting on remote managed-settings load");
      await G8e();
    } else {
      logForDebugging("[mcp-policy-cold-start] skipped \u2014 no MCP server source visible");
    }
  }
  async function K_f() {
    for (let e of MCP_SETTINGS_SCOPES) {
      if (Object.keys(getMcpConfigsByScope(e, {
        expandVars: false
      }).servers).length > 0) {
        return true;
      }
    }
    if (Object.keys(GIn()).length > 0) {
      return true;
    }
    if (rht()) {
      return true;
    }
    try {
      if ((await loadAllPluginsCacheOnly()).enabled.length > 0) {
        return true;
      }
    } catch {
      return true;
    }
    return hasStoredOAuthToken();
  }
  var RRt = __lazy(() => {
    no();
    je();
    bT();
    xg();
    z8e();
    Iw();
    fat();
  });
  function sfr() {
    let e = xbc.c(1);
    let t;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      t = ifr.jsxs(Text, {
        children: ["MCP servers may execute code or access system resources. All tool calls require approval. Learn more in the", " ", ifr.jsx(Link, {
          url: "https://code.claude.com/docs/en/mcp",
          children: "MCP documentation"
        }), "."]
      });
      e[0] = t;
    } else {
      t = e[0];
    }
    return t;
  }
  var xbc;
  var ifr;
  var lYo = __lazy(() => {
    et();
    xbc = __toESM(pt(), 1);
    ifr = __toESM(ie(), 1);
  });
  function kbc({
    serverName: e,
    isPluginServer: t = false,
    onDone: n
  }) {
    function r(o) {
      switch (logEvent("tengu_mcp_dialog_choice", {
        choice: o
      }), o) {
        case "yes":
        case "yes_all":
          {
            let i = (getSettingsForSource("localSettings") || {}).enabledMcpjsonServers || [];
            let a = false;
            if (!i.includes(e)) {
              let {
                error: l
              } = updateSettingsForSource("localSettings", {
                enabledMcpjsonServers: [...i, e]
              });
              a ||= l != null;
            }
            if (o === "yes_all") {
              let {
                error: l
              } = updateSettingsForSource("localSettings", {
                enableAllProjectMcpServers: true
              });
              a ||= l != null;
            }
            addSessionApprovedMcpServers(getWorkspacePersistedTrustKey(), [e]);
            n({
              persistFailed: a
            });
            break;
          }
        case "no":
          {
            let i = (getSettingsForSource("localSettings") || {}).disabledMcpjsonServers || [];
            let a = false;
            if (!i.includes(e)) {
              let {
                error: l
              } = updateSettingsForSource("localSettings", {
                disabledMcpjsonServers: [...i, e]
              });
              a = l != null;
            }
            n({
              persistFailed: a
            });
            break;
          }
      }
    }
    return Gnn.jsxs(or, {
      title: `New MCP server found in this project: ${Bke(e, t)}`,
      color: "warning",
      onCancel: () => r("no"),
      children: [Gnn.jsx(sfr, {}), Gnn.jsx(xr, {
        options: [{
          label: "Use this MCP server",
          value: "yes"
        }, {
          label: "Use this and all future MCP servers in this project",
          value: "yes_all"
        }, {
          label: "Continue without using this MCP server",
          value: "no"
        }],
        onChange: o => r(o),
        onCancel: () => r("no")
      })]
    });
  }
  var Gnn;
  var Abc = __lazy(() => {
    Ot();
    at();
    EI();
    OS();
    Ii();
    lYo();
    Gnn = __toESM(ie(), 1);
  });
  function Pbc({
    serverNames: e,
    pluginServerNames: t,
    onDone: n
  }) {
    function r(s) {
      let i = getSettingsForSource("localSettings") || {};
      let a = i.enabledMcpjsonServers || [];
      let l = i.disabledMcpjsonServers || [];
      let [c, u] = Abu(e, p => s.includes(p));
      logEvent("tengu_mcp_multidialog_choice", {
        approved: c.length,
        rejected: u.length
      });
      let d = false;
      if (c.length > 0) {
        let p = Ro([...a, ...c]);
        let {
          error: m
        } = updateSettingsForSource("localSettings", {
          enabledMcpjsonServers: p
        });
        d ||= m != null;
      }
      if (addSessionApprovedMcpServers(getWorkspacePersistedTrustKey(), c), u.length > 0) {
        let p = Ro([...l, ...u]);
        let {
          error: m
        } = updateSettingsForSource("localSettings", {
          disabledMcpjsonServers: p
        });
        d ||= m != null;
      }
      n({
        persistFailed: d
      });
    }
    let o = Ibc.useCallback(() => {
      let i = (getSettingsForSource("localSettings") || {}).disabledMcpjsonServers || [];
      let a = Ro([...i, ...e]);
      let {
        error: l
      } = updateSettingsForSource("localSettings", {
        disabledMcpjsonServers: a
      });
      n({
        persistFailed: l != null
      });
    }, [e, n]);
    return V5.jsxs(V5.Fragment, {
      children: [V5.jsxs(or, {
        title: `${e.length} new MCP servers found in this project`,
        subtitle: "Select any you wish to enable.",
        color: "warning",
        onCancel: o,
        hideInputGuide: true,
        children: [V5.jsx(sfr, {}), V5.jsx(eUe, {
          options: e.map(s => ({
            label: Bke(s, t?.vZc(s) ?? false),
            value: s
          })),
          defaultValue: e,
          onSubmit: r,
          onCancel: o,
          hideIndexes: true
        })]
      }), V5.jsx(gXd, {
        paddingX: 1,
        children: V5.jsx(Text, {
          dimColor: true,
          italic: true,
          children: V5.jsxs(Hn, {
            children: [V5.jsx(xt, {
              chord: "space",
              action: "select"
            }), V5.jsx(xt, {
              chord: "enter",
              action: "confirm"
            }), V5.jsx(Wr, {
              action: "confirm:no",
              context: "Confirmation",
              fallback: "Esc",
              description: "reject all"
            })]
          })
        })
      })]
    });
  }
  var Ibc;
  var V5;
  var Obc = __lazy(() => {
    Ot();
    at();
    et();
    EI();
    Sd();
    MQt();
    Ai();
    Ii();
    bs();
    lYo();
    Ibc = __toESM(ot(), 1);
    V5 = __toESM(ie(), 1);
  });
  async function uYo() {
    let {
      serverNames: e,
      pluginServerNames: t
    } = await dYo();
    return {
      pendingServers: e.filter(r => P6e(r) === "pending"),
      pluginServerNames: t
    };
  }
  async function dYo() {
    let {
      servers: e
    } = getMcpConfigsByScope("project");
    let t = Object.keys(e);
    let n = new Set(t);
    let r = new Set();
    let {
      enabled: o
    } = await loadAllPluginsCacheOnly();
    let s = o.filter(xut);
    for (let i of s) {
      let a = await yWn(i);
      if (!a) {
        continue;
      }
      for (let l of Object.keys(a)) {
        if (n.vZc(l) || r.vZc(l)) {
          continue;
        }
        t.push(l);
        r.add(l);
      }
    }
    return {
      serverNames: t,
      pluginServerNames: r,
      rootServers: e
    };
  }
  async function Dbc(e, t) {
    let {
      pendingServers: n,
      pluginServerNames: r
    } = t ?? (await uYo());
    if (n.length === 0) {
      return {
        persistFailed: false
      };
    }
    let o;
    o = await Y_f(n.map(s => Bke(s, r.vZc(s))));
    try {
      return await new Promise(s => {
        let i = a => void s(a);
        if (n.length === 1 && n[0] !== undefined) {
          let a = n[0];
          e.render(qJe.jsx(AppStateProvider, {
            children: qJe.jsx(KeybindingSetup, {
              children: qJe.jsx(kbc, {
                serverName: a,
                isPluginServer: r.vZc(a),
                onDone: i
              })
            })
          }));
        } else {
          e.render(qJe.jsx(AppStateProvider, {
            children: qJe.jsx(KeybindingSetup, {
              children: qJe.jsx(Pbc, {
                serverNames: n,
                pluginServerNames: r,
                onDone: i
              })
            })
          }));
        }
      });
    } finally {
      await J_f(o);
    }
  }
  async function Y_f(e) {
    {
      if (!li()) {
        return;
      }
      let t = process.env.CLAUDE_JOB_DIR;
      if (!t) {
        return;
      }
      let n = await Zi(t);
      if (!n) {
        return;
      }
      let r = e.length;
      let o = un(r, "server");
      let s = un(r, "needs", "need");
      try {
        await ip(t, {
          ...n,
          state: "blocked",
          detail: `${r} new MCP ${o} ${s} approval`,
          tempo: "blocked",
          needs: `approve ${r} new project MCP ${o} (${e.join(", ")}) \u2014 attach to respond`,
          updatedAt: new Date().toISOString()
        });
        return {
          state: n.state,
          tempo: n.tempo,
          needs: n.needs,
          detail: n.detail
        };
      } catch (i) {
        lf(i);
      }
    }
    return;
  }
  async function J_f(e) {
    {
      if (!e || !li()) {
        return;
      }
      let t = process.env.CLAUDE_JOB_DIR;
      if (!t) {
        return;
      }
      let n = await Zi(t);
      if (!n || n.state !== "blocked") {
        return;
      }
      try {
        await ip(t, {
          ...n,
          ...e,
          block: undefined,
          updatedAt: new Date().toISOString()
        });
      } catch (r) {
        lf(r);
      }
    }
  }
  var qJe;
  var pYo = __lazy(() => {
    Abc();
    Obc();
    zf();
    C9();
    _3();
    yd();
    sNe();
    Kf();
    xg();
    Zn();
    Iw();
    EI();
    G1();
    qJe = __toESM(ie(), 1);
  });
  function mYo(e, t) {
    let n = [...t].sort();
    let r = hLe(e, n.map(a => ({
      name: a
    })), {
      maxEditDistance: 2
    });
    if (r) {
      return `No MCP server named "${e}". Did you mean "${r}"? Run \`claude mcp list\` to see all.`;
    }
    if (n.length === 0) {
      return `No MCP server named "${e}". Run \`claude mcp add\` to add one.`;
    }
    let o = 8;
    let s = n.slice(0, o).join(", ");
    let i = n.length > o ? ` (and ${n.length - o} more \u2014 run \`claude mcp list\` to see all)` : "";
    return `No MCP server named "${e}". Configured servers: ${s}${i}`;
  }
  function afr(e, t, n) {
    if (n && t.length === 0) {
      return `No MCP server named "${e}". ${".mcp.json servers are awaiting approval \u2014 run `claude` in this directory to review them."}`;
    }
    return mYo(e, t) + (n ? ` (${".mcp.json servers are awaiting approval \u2014 run `claude` in this directory to review them."})` : "");
  }
  var fYo = () => {};
  function Nbc(e) {
    Mbc.push(e);
  }
  function hYo(e, t) {
    let n = t;
    for (let r of Mbc) {
      try {
        let o = r(e, n);
        if (o) {
          n = {
            ...n,
            ...o
          };
        }
      } catch (o) {
        let s = sr(o);
        logForDebugging(`session rehydrator threw: ${s.stack ?? s.message}`, {
          level: "error"
        });
      }
    }
    return n;
  }
  var Mbc;
  var gYo = __lazy(() => {
    je();
    dt();
    Mbc = [];
  });
  function Bbc(e, t, n) {
    let r = e.find(o => o.key === t);
    if (n === null) {
      return r ? e.filter(o => o.key !== t) : e;
    }
    if (r && r.url === n.url && r.dedupUrl === n.dedupUrl && r.label === n.label && r.prefix === n.prefix && r.color === n.color) {
      return e;
    }
    return [{
      ...n,
      key: t
    }, ...e.filter(o => o.key !== t && (o.key !== undefined || !lfr(o, n)))];
  }
  function yYo(e, t) {
    if (!e || e.length === 0 || !t) {
      return [];
    }
    let n = [];
    for (let r of e) {
      if (r.type !== "regex") {
        continue;
      }
      let {
        pattern: o,
        url: s,
        label: i
      } = r;
      if (typeof o !== "string" || typeof s !== "string" || i !== undefined && typeof i !== "string") {
        Z_f(`${typeof o}/${typeof s}/${typeof i}`);
        continue;
      }
      let a = lbf(o);
      if (!a) {
        continue;
      }
      let l = abf(s);
      if (l === null) {
        continue;
      }
      tbf(`${o}\x00${s}\x00${i ?? ""}`, o, `${s}
${i ?? ""}`);
      let c = 0;
      let u = [];
      let d = false;
      let p = false;
      let m = false;
      let f = performance.now();
      try {
        for (let g of t.matchAll(a)) {
          if (++c > Lbc) {
            logForDebugging(`[footerLinks] pattern ${o} exceeded ${Lbc} matches in one scan; stopping (newest matches beyond the ceiling are not collected)`, {
              level: "warn"
            });
            Et("repl_footer_links", "scan_ceiling");
            break;
          }
          if (u.push(g), u.length > Ubc) {
            u.shift();
          }
        }
        for (let g of u) {
          let y = g.groups ?? {};
          let _ = rbf(s, y);
          if (_ !== null && _.length > 2048) {
            if (!p) {
              p = true;
              logForDebugging(`[footerLinks] dropping over-length url (${_.length} > ${2048} chars) for pattern ${o}`, {
                level: "warn"
              });
              Et("repl_footer_links", "url_too_long");
            }
            continue;
          }
          let b = _ === null ? null : Hbc(_);
          if (_ === null || !b || $bc(b) !== l) {
            if (!d) {
              d = true;
              logForDebugging(`[footerLinks] dropping ${_ === null ? "dot-segment" : b ? "origin-shifted" : "unparseable"} url for pattern ${o}`, {
                level: "warn"
              });
              Et("repl_footer_links", _ === null ? "dot_segment_url" : b ? "origin_shifted" : "unparseable_url");
            }
            continue;
          }
          let S = truncateToWidth(sbf(i ? ibf(i, y) : g[0]).trim(), 28);
          if (S === "") {
            if (!m) {
              m = true;
              logForDebugging(`[footerLinks] dropping match with empty label for pattern ${o}`, {
                level: "warn"
              });
              Et("repl_footer_links", "empty_label");
            }
            continue;
          }
          n.push({
            index: g.index ?? 0,
            match: {
              url: _,
              label: S
            }
          });
        }
      } catch (g) {
        logForDebugging(`[footerLinks] regex exec failed for ${o}: ${he(g)}`, {
          level: "warn"
        });
        Et("repl_footer_links", "regex_exec_failed");
      }
      let h = performance.now() - f;
      if (h > 50) {
        logForDebugging(`[footerLinks] slow pattern (${Math.round(h)}ms): ${o}`, {
          level: "warn"
        });
      }
    }
    return n.sort((r, o) => r.index - o.index).map(r => r.match);
  }
  function rbf(e, t) {
    let n = e.replace(cfr, (s, i) => encodeURIComponent(Zcn(Object.hasOwn(t, i) ? t[i] ?? "" : "")));
    let r = n.search(/[?#]/);
    return (r === -1 ? n : n.slice(0, r)).split(/[/\\]/).some(s => nbf.test(s)) ? null : n;
  }
  function sbf(e) {
    return Li(e).replace(obf, "");
  }
  function ibf(e, t) {
    return e.replace(cfr, (n, r) => Object.hasOwn(t, r) ? t[r] ?? "" : "");
  }
  function $bc(e) {
    return e.origin !== "null" ? e.origin : `${e.protocol}//${e.host}`;
  }
  function Hbc(e) {
    try {
      return new URL(e);
    } catch {
      return null;
    }
  }
  function _Yo(e, t) {
    if (t.length === 0) {
      return e;
    }
    let [n, r] = Abu(e, a => a.key !== undefined);
    let o = [];
    for (let a of t) {
      if (o.some(l => lfr(l, a)) || n.some(l => lfr(l, a))) {
        continue;
      }
      o.push(a);
    }
    if (o.length === 0) {
      return e;
    }
    let s = r.filter(a => !o.some(l => lfr(l, a)));
    let i = [...n, ...[...o, ...s].slice(0, 5)];
    if (i.length === e.length && i.every((a, l) => {
      let c = e[l];
      return a === c || a.url === c.url && a.dedupUrl === c.dedupUrl && a.label === c.label && a.prefix === c.prefix && a.key === c.key && a.color === c.color;
    })) {
      return e;
    }
    return i;
  }
  function lfr(e, t) {
    return e.url === t.url || e.url === t.dedupUrl || e.dedupUrl === t.url || e.dedupUrl !== undefined && e.dedupUrl === t.dedupUrl;
  }
  var Ubc;
  var Lbc;
  var Z_f;
  var cfr;
  var ebf;
  var tbf;
  var nbf;
  var obf;
  var abf;
  var lbf;
  var ufr = __lazy(() => {
    ZL();
    ln();
    ky();
    je();
    dt();
    Zn();
    dI();
    Ubc = 5 * 4;
    Lbc = Ubc * 10;
    Z_f = TEr(e => {
      logForDebugging(`[footerLinks] skipping a 'regex' entry with non-string fields (pattern/url/label types: ${e}); the entry is preserved in settings`, {
        level: "warn"
      });
      Et("repl_footer_links", "unreadable_entry");
    });
    cfr = /\{([^{}]+)\}/g;
    ebf = /\(\?<([^>=!][^>]*)>/g;
    tbf = TEr((e, t, n) => {
      let r = new Set([...t.matchAll(ebf)].map(o => o[1]));
      for (let [, o] of n.matchAll(cfr)) {
        if (o !== undefined && !r.vZc(o)) {
          logForDebugging(`[footerLinks] template references {${o}} but pattern ${t} has no such named capture group`, {
            level: "warn"
          });
        }
      }
    });
    nbf = /^(?:\.|%2e){1,2}$/i;
    obf = /[\x00-\x1f\x7f]/g;
    abf = TEr(e => {
      let t = Hbc(e.replace(cfr, "x"));
      if (!t || !gYr.vZc(t.protocol)) {
        logForDebugging(`[footerLinks] url template "${e}" must have a literal origin with an allowlisted scheme (e.g. https://host/...); skipping`, {
          level: "warn"
        });
        Et("repl_footer_links", "bad_url_template");
        return null;
      }
      return $bc(t);
    });
    lbf = TEr(e => {
      try {
        return new RegExp(e, "g");
      } catch (t) {
        logForDebugging(`[footerLinks] invalid pattern ${e}: ${he(t)}`, {
          level: "warn"
        });
        Et("repl_footer_links", "invalid_pattern");
        return null;
      }
    });
  });
  function Wbc() {
    let e = getSecuritySensitiveSetting("footerLinksRegexes").flat();
    return e.length > 0 ? e : undefined;
  }
  function Gbc() {
    Nbc((e, t) => {
      let n = Wbc();
      let r = t.footerLinks.filter(s => s.key !== undefined);
      let o = !n || n.length === 0 ? r : ubf(e, n, r);
      if (t.footerLinks.length === o.length && t.footerLinks.every((s, i) => {
        let a = o[i];
        return a !== undefined && s.url === a.url && s.dedupUrl === a.dedupUrl && s.label === a.label && s.prefix === a.prefix && s.key === a.key && s.color === a.color;
      })) {
        return null;
      }
      return {
        footerLinks: o
      };
    });
  }
  function Vbc(e, t) {
    try {
      let n = Wbc();
      if (!n || n.length === 0) {
        return;
      }
      let r = zbc(pbf(e));
      let o = r ? yYo(n, r).reverse() : [];
      if (o.length === 0) {
        return;
      }
      Pe("repl_footer_links");
      t(s => {
        let i = _Yo(s.footerLinks, o);
        return i === s.footerLinks ? s : {
          ...s,
          footerLinks: i
        };
      });
    } catch (n) {
      Oe(n);
      Ae("repl_footer_links", "scan_failed");
    }
  }
  function ubf(e, t, n = []) {
    if (!t || t.length === 0) {
      return n;
    }
    let r = zbc(e);
    if (!r) {
      return n;
    }
    return _Yo(n, yYo(t, r).reverse());
  }
  function zbc(e) {
    let t = "";
    let n = 0;
    for (let r = e.length - 1; r >= 0 && t.length < 65536 && n < 256; r--) {
      let o = e[r];
      if (!dbf(o)) {
        continue;
      }
      n++;
      let s = [];
      for (let i of xS([o], true)) {
        let a = hbf(i);
        if (a) {
          s.push(a);
        }
      }
      if (s.length > 0) {
        let i = s.join(`
`);
        t = t ? i + `
` + t : i;
      }
    }
    return t.length > 65536 ? t.slice(-65536) : t;
  }
  function dbf(e) {
    if (e.type === "assistant") {
      return Array.isArray(e.message.content) && e.message.content.some(t => t.type === "text");
    }
    if (e.type === "user") {
      if (e.isMeta || !Array.isArray(e.message.content)) {
        return false;
      }
      return e.message.content.some(t => t.type === "tool_result" && (typeof t.content === "string" || Array.isArray(t.content) && t.content.some(n => n.type === "text")));
    }
    return false;
  }
  function pbf(e) {
    for (let t = e.length - 1; t >= 0; t--) {
      let n = e[t];
      if (n.type === "user" && !n.isMeta && !PZ(n) && !mbf(n) && !fbf(n)) {
        return e.slice(t + 1);
      }
    }
    return e.slice();
  }
  function mbf(e) {
    if (e.type !== "user" || !Array.isArray(e.message.content)) {
      return false;
    }
    let t = e.message.content[0];
    return t?.type === "text" && (t.text === "[Request interrupted by user]" || t.text === "[Request interrupted by user for tool use]");
  }
  function fbf(e) {
    if (e.type !== "user") {
      return false;
    }
    let t = e.message.content;
    let n = typeof t === "string" ? t : Array.isArray(t) && t[0]?.type === "text" ? t[0].text : "";
    let r = n.startsWith(qbc) ? n.slice(qbc.length) : n;
    return r.startsWith(KKo) || r.startsWith(YKo) || r.startsWith(JKo);
  }
  function hbf(e) {
    if (e.type === "assistant") {
      let t = e.message.content[0];
      return t.type === "text" ? SYo(t.text) : "";
    }
    if (e.type === "user") {
      if (e.isMeta) {
        return "";
      }
      let t = e.message.content[0];
      if (t.type !== "tool_result") {
        return "";
      }
      if (typeof t.content === "string") {
        return SYo(t.content);
      }
      if (Array.isArray(t.content)) {
        return SYo(Tl(t.content, `
`));
      }
      return "";
    }
    return "";
  }
  function SYo(e) {
    return e.length > 8192 ? e.slice(-8192) : e;
  }
  var qbc = `<system-reminder>
`;
  var TYo = __lazy(() => {
    gYo();
    ufr();
    Rn();
    ro();
    ln();
  });
  function dfr() {
    saveGlobalConfig(e => ({
      ...e,
      iterm2SetupInProgress: false
    }));
  }
  function gbf() {
    let e = getGlobalConfig();
    return {
      inProgress: e.iterm2SetupInProgress ?? false,
      backupPath: e.iterm2BackupPath || null
    };
  }
  function ybf() {
    return Ybc.join(Kbc.homedir(), "Library", "Preferences", "com.googlecode.iterm2.plist");
  }
  async function Jbc() {
    let {
      inProgress: e,
      backupPath: t
    } = gbf();
    if (!e) {
      return {
        status: "no_backup"
      };
    }
    if (!t) {
      dfr();
      return {
        status: "no_backup"
      };
    }
    try {
      await pfr.stat(t);
    } catch {
      dfr();
      return {
        status: "no_backup"
      };
    }
    try {
      await pfr.copyFile(t, ybf());
      dfr();
      return {
        status: "restored"
      };
    } catch (n) {
      logForDebugging(`Failed to restore iTerm2 settings with: ${n}`, {
        level: "error"
      });
      dfr();
      return {
        status: "failed",
        backupPath: t
      };
    }
  }
  var pfr;
  var Kbc;
  var Ybc;
  var Xbc = __lazy(() => {
    je();
    pfr = require("fs/promises");
    Kbc = require("os");
    Ybc = require("path");
  });
  var mfr = {};