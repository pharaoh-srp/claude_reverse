  __export(jce, {
    updateSessionTitle: () => updateSessionTitle,
    sendEventToRemoteSession: () => sendEventToRemoteSession,
    sendBashCommandToRemoteSession: () => sendBashCommandToRemoteSession,
    reportClientPresence: () => reportClientPresence,
    prepareApiRequest: () => prepareApiRequest,
    markSessionRead: () => markSessionRead,
    isTransientNetworkError: () => isTransientNetworkError,
    getOAuthHeaders: () => getOAuthHeaders,
    getBranchFromSession: () => getBranchFromSession,
    fetchSession: () => fetchSession,
    fetchCodeSessionsFromSessionsAPI: () => fetchCodeSessionsFromSessionsAPI,
    ccrSessionToResource: () => ccrSessionToResource,
    axiosGetWithRetry: () => axiosGetWithRetry,
    CodeSessionSchema: () => CodeSessionSchema,
    CCR_BYOC_BETA: () => "ccr-byoc-2025-07-29"
  });
  function isTransientNetworkError(e) {
    if (!NP.isAxiosError(e)) {
      return false;
    }
    if (!e.response) {
      return true;
    }
    if (e.response.status >= 500) {
      return true;
    }
    return false;
  }
  async function axiosGetWithRetry(e, t) {
    let n;
    for (let r = 0; r <= iXr; r++) {
      try {
        return await NP.get(e, t);
      } catch (o) {
        if (n = o, !isTransientNetworkError(o)) {
          throw o;
        }
        if (r >= iXr) {
          throw logForDebugging(`Teleport request failed after ${r + 1} attempts: ${he(o)}`), o;
        }
        let s = kji[r] ?? 2000;
        logForDebugging(`Teleport request failed (attempt ${r + 1}/${iXr + 1}), retrying in ${s}ms: ${he(o)}`);
        await sleep(s);
      }
    }
    throw n;
  }
  function ccrSessionToResource(e) {
    let t = e.status === "archived" ? "archived" : e.worker_status ?? "idle";
    return {
      type: "session",
      id: e.id,
      title: e.title || null,
      session_status: t,
      environment_id: e.environment_id,
      created_at: e.created_at,
      updated_at: "updated_at" in e ? e.updated_at : e.last_event_at,
      session_context: {
        sources: e.config?.sources ?? [],
        outcomes: e.config?.outcomes ?? null,
        model: e.config?.model ?? null,
        cwd: "",
        custom_system_prompt: null,
        append_system_prompt: null
      }
    };
  }
  async function prepareApiRequest() {
    if (!isFirstPartyProvider()) {
      throw Error("Cloud sessions are only available on the first-party Anthropic API provider.");
    }
    await checkAndRefreshOAuthTokenIfNeeded();
    let e = getClaudeAIOAuthTokens()?.accessToken;
    if (e === undefined) {
      throw Error("Claude Code web sessions require authentication with a Claude.ai account. API key authentication is not sufficient. Please run /login to authenticate, or check your authentication status with /status.");
    }
    let t = await getOrganizationUUID();
    if (!t) {
      throw Error("Unable to get organization UUID");
    }
    return {
      accessToken: e,
      orgUUID: t
    };
  }
  async function fetchCodeSessionsFromSessionsAPI() {
    return vl("teleport_sessions_list", async () => {
      let {
        accessToken: e
      } = await prepareApiRequest();
      let t = `${getOauthConfig().BASE_API_URL}/v1/code/sessions`;
      try {
        let n = await axiosGetWithRetry(t, {
          headers: getOAuthHeaders(e)
        });
        if (n.status !== 200) {
          throw Error(`Failed to fetch code sessions: ${n.statusText}`);
        }
        return n.data.data.map(o => {
          let s = o.config?.sources?.find(a => a.type === "git_repository");
          let i = null;
          if (s?.url) {
            let a = parseGitHubRepository(s.url);
            if (a) {
              let [l, c] = a.split("/");
              if (l && c) {
                i = {
                  name: c,
                  owner: {
                    login: l
                  },
                  default_branch: s.revision || undefined
                };
              }
            }
          }
          return {
            id: o.id,
            title: o.title || "Untitled",
            description: "",
            status: o.status === "archived" ? "archived" : o.worker_status ?? "idle",
            repo: i,
            turns: [],
            created_at: o.created_at,
            updated_at: o.last_event_at
          };
        });
      } catch (n) {
        let r = sr(n);
        if (M_(n)) {
          logForDebugging(`Failed to fetch code sessions: ${r.message}`, {
            level: "error"
          });
        } else {
          Oe(r);
        }
        throw n;
      }
    });
  }
  function getOAuthHeaders(e) {
    return {
      Authorization: `Bearer ${e}`,
      "Content-Type": "application/json",
      "anthropic-version": "2023-06-01",
      "anthropic-client-platform": getClientPlatform()
    };
  }
  async function fetchSession(e, t) {
    if (!isFirstPartyProvider()) {
      throw new eS("Cloud sessions are only available on the first-party Anthropic API provider.", "Cloud sessions are only available on the first-party Anthropic API provider.");
    }
    let {
      accessToken: n
    } = t ?? (await prepareApiRequest());
    let r = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}`;
    let o = await NP.get(r, {
      headers: getOAuthHeaders(n),
      timeout: 15000,
      validateStatus: i => i < 500
    });
    if (o.status !== 200) {
      let i = o.data?.error?.message;
      if (o.status === 404) {
        let a = `Session not found: ${e}`;
        throw new eS(a, a);
      }
      if (o.status === 401) {
        throw new eS("Session expired. Please run /login to sign in again.", "Session expired. Please run /login to sign in again.");
      }
      if (o.status === 400 && i?.startsWith("invalid session ID")) {
        throw new eS(i, i);
      }
      throw Error(i || `Failed to fetch session: ${o.status} ${o.statusText}`);
    }
    let s = o.data.response_shape ?? o.data.session;
    if (!s?.id) {
      throw Error(`Session not found: ${e}`);
    }
    return ccrSessionToResource(s);
  }
  function getBranchFromSession(e) {
    return e.session_context.outcomes?.find(n => n.type === "git_repository")?.git_info?.branches[0];
  }
  async function Iji(e, t, n) {
    if (!isFirstPartyProvider()) {
      return {
        ok: false,
        reason: "Cloud sessions are only available on the first-party Anthropic API provider."
      };
    }
    try {
      let {
        accessToken: r
      } = await prepareApiRequest();
      let o = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}/events`;
      let s = getOAuthHeaders(r);
      logForDebugging(`${n} Sending event to session ${e}`);
      let i = await NP.post(o, {
        events: [{
          payload: t
        }]
      }, {
        headers: s,
        validateStatus: l => l < 500,
        timeout: 30000
      });
      if (i.status === 200 || i.status === 201) {
        logForDebugging(`${n} Successfully sent event to session ${e}`);
        return {
          ok: true
        };
      }
      logForDebugging(`${n} Failed with status ${i.status}: ${De(i.data)}`);
      let a = i.data?.error?.message;
      return {
        ok: false,
        reason: typeof a === "string" ? `${a} (HTTP ${i.status})` : `HTTP ${i.status}`
      };
    } catch (r) {
      logForDebugging(`${n} Error: ${he(r)}`);
      return {
        ok: false,
        reason: he(r)
      };
    }
  }
  async function sendEventToRemoteSession(e, t, n) {
    return Iji(e, {
      uuid: n?.uuid ?? aXr.randomUUID(),
      session_id: e,
      type: "user",
      parent_tool_use_id: null,
      message: {
        role: "user",
        content: t
      }
    }, "[sendEventToRemoteSession]");
  }
  async function sendBashCommandToRemoteSession(e, t, n) {
    return Iji(e, {
      uuid: n?.uuid ?? aXr.randomUUID(),
      session_id: e,
      type: "bash_command",
      command: t.command,
      ...(t.cwd !== undefined && {
        cwd: t.cwd
      })
    }, "[sendBashCommandToRemoteSession]");
  }
  async function updateSessionTitle(e, t) {
    try {
      let {
        accessToken: n
      } = await prepareApiRequest();
      let r = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}`;
      logForDebugging(`[updateSessionTitle] Updating title for session ${e}: "${t}"`);
      let o = await NP.put(r, {
        title: t
      }, {
        headers: getOAuthHeaders(n),
        validateStatus: s => s < 500
      });
      if (o.status === 200) {
        logForDebugging(`[updateSessionTitle] Successfully updated title for session ${e}`);
        return true;
      }
      logForDebugging(`[updateSessionTitle] Failed with status ${o.status}: ${De(o.data)}`);
      return false;
    } catch (n) {
      logForDebugging(`[updateSessionTitle] Error: ${he(n)}`);
      return false;
    }
  }
  async function markSessionRead(e, t) {
    try {
      let {
        accessToken: n
      } = await prepareApiRequest();
      let r = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}/mark_read`;
      let o = await NP.post(r, t ? {
        event_id: t
      } : {}, {
        headers: getOAuthHeaders(n),
        timeout: 1e4,
        validateStatus: s => s < 500
      });
      if (o.status !== 200) {
        logForDebugging(`[markSessionRead] Failed with status ${o.status}: ${De(o.data)}`);
      }
    } catch (n) {
      logForDebugging(`[markSessionRead] Error: ${he(n)}`);
    }
  }
  async function reportClientPresence(e, t, n = false) {
    try {
      let {
        accessToken: r
      } = await prepareApiRequest();
      let o = `${getOauthConfig().BASE_API_URL}/v1/code/sessions/${e}/client/presence`;
      let s = await NP.post(o, {
        client_id: t,
        clear: n
      }, {
        headers: getOAuthHeaders(r),
        timeout: 1e4,
        validateStatus: i => i < 500
      });
      if (s.status !== 200) {
        logForDebugging(`[reportClientPresence] Failed with status ${s.status}: ${De(s.data)}`);
        return null;
      }
      return s.data.refresh_after_seconds ?? null;
    } catch (r) {
      logForDebugging(`[reportClientPresence] Error: ${he(r)}`);
      return null;
    }
  }
  var aXr;
  var kji;
  var iXr;
  var CodeSessionSchema;
  var NC = __lazy(() => {
    Dp();
    Uc();
    qP();
    YA();
    ln();
    no();
    je();
    bI();
    dt();
    Rn();
    Ds();
    aXr = require("crypto");
    kji = [2000, 4000, 8000, 16000];
    iXr = kji.length;
    CodeSessionSchema = we(() => Ghs.object({
      id: Ghs.string(),
      title: Ghs.string(),
      description: Ghs.string(),
      status: Ghs.enum(["idle", "working", "waiting", "completed", "archived", "cancelled", "rejected"]),
      repo: Ghs.object({
        name: Ghs.string(),
        owner: Ghs.object({
          login: Ghs.string()
        }),
        default_branch: Ghs.string().optional()
      }).nullable(),
      turns: Ghs.array(Ghs.string()),
      created_at: Ghs.string(),
      updated_at: Ghs.string()
    }));
  });
  function pWd(e) {
    let t = getOauthConfig();
    switch (e) {
      case "api":
        return t.BASE_API_URL;
      case "claude-ai":
        return t.CLAUDE_AI_ORIGIN;
      case "mcp-proxy":
        return t.MCP_PROXY_URL;
      case "frame":
        return t.BASE_API_URL;
      case "ccr-session":
        {
          let n = process.argv.indexOf("--sdk-url");
          let r = n >= 0 ? process.argv[n + 1] : undefined;
          if (!r) {
            throw Error("ccr-session host requires --sdk-url");
          }
          return r.replace(/\/$/, "");
        }
    }
  }
  async function H4e(e, t, n, r = {}, o = false) {
    if (!r.bypassEssentialTrafficOnly && true && Vi()) {
      return {
        ok: false,
        reason: "essential-traffic-only"
      };
    }
    if (getAPIProvider() !== "firstParty") {
      return {
        ok: false,
        reason: "data-residency"
      };
    }
    let i = {};
    let a = t;
    let l = null;
    if (r.auth === "teleport-org") {
      if (await checkAndRefreshOAuthTokenIfNeeded(), isOAuthRefreshKnownDead()) {
        return {
          ok: false,
          reason: "no-auth",
          detail: "OAuth refresh token is no longer valid; run /login to re-authenticate"
        };
      }
      if (!getClaudeAIOAuthTokens()?.accessToken) {
        return {
          ok: false,
          reason: "no-auth",
          detail: "No OAuth token in keychain"
        };
      }
      let {
        accessToken: u,
        orgUUID: d
      } = await prepareApiRequest();
      l = u;
      i = {
        ...getOAuthHeaders(u),
        "x-organization-uuid": d
      };
      a = t.replace(":orgUUID", d);
    } else if (r.auth === "session-jwt") {
      let u = cT();
      if (!u) {
        return {
          ok: false,
          reason: "no-auth",
          detail: "No session access token"
        };
      }
      i = {
        Authorization: `Bearer ${u}`
      };
    } else if (r.auth !== "none") {
      if (r.refreshOAuth) {
        try {
          await checkAndRefreshOAuthTokenIfNeeded();
        } catch (d) {
          logForDebugging(`firstPartyApi: refreshOAuth failed (${d instanceof Error ? d.message : d}); proceeding with cached token`);
        }
      }
      let u = r.auth === "async" ? await getAuthHeadersAsync() : getAuthHeaders();
      if (u.error && r.auth !== "optional") {
        return {
          ok: false,
          reason: "no-auth",
          detail: u.error
        };
      }
      i = u.headers;
    }
    let c;
    try {
      c = await NP.request({
        method: e,
        baseURL: pWd(r.host ?? "api"),
        url: a,
        data: n,
        timeout: r.timeout ?? 15000,
        signal: r.signal,
        responseType: r.responseType,
        validateStatus: r.validateStatus,
        maxContentLength: r.maxContentLength,
        maxBodyLength: r.maxBodyLength,
        headers: {
          "User-Agent": getUserAgent(),
          ...i,
          ...r.headers
        }
      });
    } catch (u) {
      if (l !== null && !o && !r.isBackground && NP.isAxiosError(u) && u.response?.status === 401) {
        let d = await Pji(l);
        if (d === "retry") {
          LOn(u.response.data);
          return H4e(e, t, n, r, true);
        }
        if (d !== null) {
          LOn(u.response.data);
          return d;
        }
      }
      throw u;
    }
    if (l !== null && c.status === 401 && !o && !r.isBackground) {
      let u = await Pji(l);
      if (u === "retry") {
        LOn(c.data);
        return H4e(e, t, n, r, true);
      }
      if (u !== null) {
        LOn(c.data);
        return u;
      }
    }
    return {
      ok: true,
      data: c.data,
      status: c.status,
      response: c
    };
  }
  function LOn(e) {
    if (e instanceof Oji.Readable) {
      e.destroy();
    }
  }
  async function Pji(e) {
    if (await handleOAuth401Error(e)) {
      return "retry";
    }
    if (isOAuthRefreshKnownDead()) {
      return {
        ok: false,
        reason: "no-auth",
        detail: "OAuth refresh token is no longer valid; run /login to re-authenticate"
      };
    }
    return null;
  }
  var Oji;
  var _s;
  var bg = __lazy(() => {
    Dp();
    Uc();
    no();
    je();
    d_();
    YA();
    Ds();
    Wd();
    e1();
    NC();
    Oji = require("stream");
    _s = {
      get(e, t) {
        return H4e("GET", e, undefined, t);
      },
      post(e, t, n) {
        return H4e("POST", e, t, n);
      },
      put(e, t, n) {
        return H4e("PUT", e, t, n);
      },
      patch(e, t, n) {
        return H4e("PATCH", e, t, n);
      },
      delete(e, t, n) {
        return H4e("DELETE", e, t, n);
      }
    };
  });
  function mWd() {
    return {
      urls: undefined
    };
  }
  function Nji(e) {
    try {
      let t = new URL(e);
      t.search = "";
      t.username = "";
      t.password = "";
      t.hash = "";
      return t.toString().replace(/\/$/, "");
    } catch {
      return;
    }
  }
  function fWd() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_directory_visibility", Dji);
    return Array.isArray(e) && e.every(t => typeof t === "string") ? e.filter(t => t.length > 0) : Dji;
  }
  async function hWd(e) {
    let t = new Set();
    let n = e.join(",");
    let r;
    for (let o = 0; o < 20; o++) {
      let s = new URLSearchParams({
        version: "latest",
        limit: "100",
        visibility: n
      });
      if (r) {
        s.set("cursor", r);
      }
      let i = await _s.get(`/mcp-registry/v0/servers?${s}`, {
        auth: "none",
        timeout: 5000
      });
      if (!i.ok) {
        break;
      }
      for (let a of i.data.servers ?? []) {
        for (let l of a.server?.remotes ?? []) {
          let c = Nji(l.url);
          if (c) {
            t.add(c);
          }
        }
      }
      if (r = i.data.metadata?.nextCursor, !r) {
        break;
      }
    }
    return t;
  }
  async function gWd(e) {
    let t = new Set();
    let n = e.join(",");
    let r;
    for (let o = 0; o < 20; o++) {
      let s = new URLSearchParams({
        limit: "500",
        visibility: n
      });
      if (r) {
        s.set("cursor", r);
      }
      let i = await _s.get(`/api/directory/servers?${s}`, {
        auth: "none",
        timeout: 5000
      });
      if (!i.ok) {
        break;
      }
      for (let a of i.data.servers ?? []) {
        if (a.type !== "remote") {
          continue;
        }
        let l = a.remote?.url;
        if (!l) {
          continue;
        }
        let c = Nji(l);
        if (c) {
          t.add(c);
        }
      }
      if (r = i.data.next_cursor ?? undefined, !r) {
        break;
      }
    }
    return t;
  }
  async function Lji() {
    if (Vi()) {
      return;
    }
    if (getStrictMcpConfig()) {
      return;
    }
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_directory_bff", false);
    let t = e ? "bff" : "legacy";
    let n = fWd();
    if (n.length === 0) {
      pXr.urls = new Set();
      Pe("mcp_registry_fetch");
      logEvent("tengu_mcp_registry_fetch", {
        source: t,
        success: true,
        url_count: 0,
        duration_ms: 0,
        empty_visibility: true
      });
      return;
    }
    let r = Date.now();
    try {
      let o = e ? await gWd(n) : await hWd(n);
      pXr.urls = o;
      logForDebugging(`[mcp-registry] Loaded ${o.size} official MCP URLs (${e ? "bff" : "legacy"})`);
      Pe("mcp_registry_fetch");
      logEvent("tengu_mcp_registry_fetch", {
        source: t,
        success: true,
        url_count: o.size,
        duration_ms: Date.now() - r
      });
    } catch (o) {
      logForDebugging(`Failed to fetch MCP registry: ${he(o)}`, {
        level: "error"
      });
      Et("mcp_registry_fetch", "fetch_failed");
      logEvent("tengu_mcp_registry_fetch", {
        source: t,
        success: false,
        url_count: 0,
        duration_ms: Date.now() - r
      });
    }
  }
  function Fji(e) {
    return pXr.urls?.vZc(e) ?? false;
  }
  var Dji;
  var pXr;
  var mXr = __lazy(() => {
    at();
    je();
    dt();
    Wd();
    ln();
    $n();
    Ot();
    bg();
    Dji = ["commercial", "gsuite", "enterprise", "health"];
    pXr = mWd();
  });
  function Uji() {
    let e = process.env.__CFBundleIdentifier;
    if (e) {
      return e;
    }
    return yWd[Me.terminal ?? ""] ?? null;
  }
  function j4e(e) {
    return Bl(e) === "computer-use";
  }
  var yWd;
  var FOn;
  var Cbe = __lazy(() => {
    pr();
    yWd = {
      "iTerm.app": "com.googlecode.iterm2",
      Apple_Terminal: "com.apple.Terminal",
      ghostty: "com.mitchellh.ghostty",
      kitty: "net.kovidgoyal.kitty",
      WarpTerminal: "dev.warp.Warp-Stable",
      vscode: "com.microsoft.VSCode"
    };
    FOn = {
      screenshotFiltering: "native",
      platform: "darwin"
    };
  });
  function UOn(e) {
    let t = _Wd;
    if (!t) {
      return false;
    }
    let n;
    let r;
    try {
      n = new URL(e);
      r = new URL(t);
    } catch {
      return false;
    }
    if ((n.protocol === "wss:" ? `https://${n.host}` : n.protocol === "ws:" ? `http://${n.host}` : n.origin) !== r.origin) {
      return false;
    }
    return hXr.some(s => n.pathname.includes(s));
  }
  function Bji(e) {
    if (!UOn(e)) {
      return false;
    }
    let t;
    try {
      t = new URL(e);
    } catch {
      return false;
    }
    let n = t.searchParams.get("mcp_url");
    if (!n) {
      return false;
    }
    try {
      let r = new URL(n);
      return bWd.vZc(r.hostname) && r.pathname === "/devices/mcp";
    } catch {
      return false;
    }
  }
  function RIe(e) {
    if (!("url" in e) || typeof e.url !== "string") {
      return;
    }
    try {
      let t = new URL(e.url);
      t.search = "";
      t.username = "";
      t.password = "";
      t.hash = "";
      return t.toString().replace(/\/$/, "");
    } catch {
      return;
    }
  }
  var hXr;
  var _Wd;
  var bWd;
  var Bat = __lazy(() => {
    hXr = ["/v2/session_ingress/shttp/mcp/", "/v2/session_ingress/mcp/ws/", "/v2/ccr-sessions/", "/v1/code/"];
    _Wd = process.env.SESSION_INGRESS_URL ?? process.env.ANTHROPIC_BASE_URL;
    bWd = new Set(["bridge.claudeusercontent.com", "bridge-staging.claudeusercontent.com"]);
  });
  var z2t = {};