  __export(JOt, {
    preservableScopesFrom: () => preservableScopesFrom,
    getOauthConfig: () => getOauthConfig,
    fileSuffixForOauthConfig: () => fileSuffixForOauthConfig,
    PRESERVABLE_EXPANSION_SCOPES: () => PRESERVABLE_EXPANSION_SCOPES,
    OAUTH_BETA_HEADER: () => "oauth-2025-04-20",
    MCP_CLIENT_METADATA_URL: () => "https://claude.ai/oauth/claude-code-client-metadata",
    LONG_LIVED_OAUTH_TOKEN_TTL_SECONDS: () => 31536000,
    DESIGN_OAUTH_SCOPES: () => DESIGN_OAUTH_SCOPES,
    CONSOLE_OAUTH_SCOPES: () => CONSOLE_OAUTH_SCOPES,
    CLAUDE_AI_PROFILE_SCOPE: () => "user:profile",
    CLAUDE_AI_OAUTH_SCOPES: () => CLAUDE_AI_OAUTH_SCOPES,
    CLAUDE_AI_INFERENCE_SCOPE: () => "user:inference",
    ALL_OAUTH_SCOPES: () => ALL_OAUTH_SCOPES,
    ALLOWED_OAUTH_BASE_URLS: () => ALLOWED_OAUTH_BASE_URLS
  });
  function gTs() {
    return "prod";
  }
  function fileSuffixForOauthConfig() {
    if (process.env.CLAUDE_CODE_CUSTOM_OAUTH_URL) {
      return "-custom-oauth";
    }
    switch (gTs()) {
      case "local":
        return "-local-oauth";
      case "staging":
        return "-staging-oauth";
      case "prod":
        return "";
    }
  }
  function preservableScopesFrom(e) {
    if (!Array.isArray(e)) {
      return [];
    }
    let t = PRESERVABLE_EXPANSION_SCOPES;
    return e.filter(n => t.includes(n));
  }
  function Pxu() {
    let e = process.env.CLAUDE_LOCAL_OAUTH_API_BASE?.replace(/\/$/, "") ?? "http://localhost:8000";
    let t = process.env.CLAUDE_LOCAL_OAUTH_APPS_BASE?.replace(/\/$/, "") ?? "http://localhost:4000";
    let n = process.env.CLAUDE_LOCAL_OAUTH_CONSOLE_BASE?.replace(/\/$/, "") ?? "http://localhost:3000";
    return {
      BASE_API_URL: e,
      CONSOLE_AUTHORIZE_URL: `${n}/oauth/authorize`,
      CLAUDE_AI_AUTHORIZE_URL: `${t}/oauth/authorize`,
      CLAUDE_AI_ORIGIN: t,
      TOKEN_URL: `${e}/v1/oauth/token`,
      API_KEY_URL: `${e}/api/oauth/claude_cli/create_api_key`,
      ROLES_URL: `${e}/api/oauth/claude_cli/roles`,
      CONSOLE_SUCCESS_URL: `${n}/buy_credits?returnUrl=/oauth/code/success%3Fapp%3Dclaude-code`,
      CLAUDEAI_SUCCESS_URL: `${n}/oauth/code/success?app=claude-code`,
      MANUAL_REDIRECT_URL: `${n}/oauth/code/callback`,
      CLIENT_ID: "22422756-60c9-4084-8eb7-27705fd5cf9a",
      DESIGN_CLIENT_ID: "00000000-0000-4000-8000-000000000000",
      OAUTH_FILE_SUFFIX: "-local-oauth",
      MCP_PROXY_URL: "http://localhost:8205",
      MCP_PROXY_PATH: "/v1/toolbox/shttp/mcp/{server_id}"
    };
  }
  function getOauthConfig() {
    let e = (() => {
      switch (gTs()) {
        case "local":
          return Pxu();
        case "staging":
          return undefined ?? hTs;
        case "prod":
          return hTs;
      }
    })();
    let t = process.env.CLAUDE_CODE_CUSTOM_OAUTH_URL;
    if (t) {
      let r = t.replace(/\/$/, "");
      if (!ALLOWED_OAUTH_BASE_URLS.includes(r)) {
        throw Error("CLAUDE_CODE_CUSTOM_OAUTH_URL is not an approved endpoint.");
      }
      e = {
        ...e,
        BASE_API_URL: r,
        CONSOLE_AUTHORIZE_URL: `${r}/oauth/authorize`,
        CLAUDE_AI_AUTHORIZE_URL: `${r}/oauth/authorize`,
        CLAUDE_AI_ORIGIN: r,
        TOKEN_URL: `${r}/v1/oauth/token`,
        API_KEY_URL: `${r}/api/oauth/claude_cli/create_api_key`,
        ROLES_URL: `${r}/api/oauth/claude_cli/roles`,
        CONSOLE_SUCCESS_URL: `${r}/oauth/code/success?app=claude-code`,
        CLAUDEAI_SUCCESS_URL: `${r}/oauth/code/success?app=claude-code`,
        MANUAL_REDIRECT_URL: `${r}/oauth/code/callback`,
        OAUTH_FILE_SUFFIX: "-custom-oauth"
      };
    }
    let n = process.env.CLAUDE_CODE_OAUTH_CLIENT_ID;
    if (n) {
      e = {
        ...e,
        CLIENT_ID: n
      };
    }
    return e;
  }
  var CONSOLE_OAUTH_SCOPES;
  var CLAUDE_AI_OAUTH_SCOPES;
  var ALL_OAUTH_SCOPES;
  var DESIGN_OAUTH_SCOPES;
  var PRESERVABLE_EXPANSION_SCOPES;
  var hTs;
  var ALLOWED_OAUTH_BASE_URLS;
  var Uc = __lazy(() => {
    gn();
    CONSOLE_OAUTH_SCOPES = ["org:create_api_key", "user:profile"];
    CLAUDE_AI_OAUTH_SCOPES = ["user:profile", "user:inference", "user:sessions:claude_code", "user:mcp_servers", "user:file_upload", ...[]];
    ALL_OAUTH_SCOPES = Ro([...CONSOLE_OAUTH_SCOPES, ...CLAUDE_AI_OAUTH_SCOPES]);
    DESIGN_OAUTH_SCOPES = ["user:design:read", "user:design:write"];
    PRESERVABLE_EXPANSION_SCOPES = [...DESIGN_OAUTH_SCOPES, "user:projects:read", "user:projects:write"];
    hTs = {
      BASE_API_URL: "https://api.anthropic.com",
      CONSOLE_AUTHORIZE_URL: "https://platform.claude.com/oauth/authorize",
      CLAUDE_AI_AUTHORIZE_URL: "https://claude.com/cai/oauth/authorize",
      CLAUDE_AI_ORIGIN: "https://claude.ai",
      TOKEN_URL: "https://platform.claude.com/v1/oauth/token",
      API_KEY_URL: "https://api.anthropic.com/api/oauth/claude_cli/create_api_key",
      ROLES_URL: "https://api.anthropic.com/api/oauth/claude_cli/roles",
      CONSOLE_SUCCESS_URL: "https://platform.claude.com/buy_credits?returnUrl=/oauth/code/success%3Fapp%3Dclaude-code",
      CLAUDEAI_SUCCESS_URL: "https://platform.claude.com/oauth/code/success?app=claude-code",
      MANUAL_REDIRECT_URL: "https://platform.claude.com/oauth/code/callback",
      CLIENT_ID: "9d1c250a-e61b-44d9-88ed-5944d1962f5e",
      DESIGN_CLIENT_ID: "59637612-477b-4836-a601-b0589eda7704",
      OAUTH_FILE_SUFFIX: "",
      MCP_PROXY_URL: "https://mcp-proxy.anthropic.com",
      MCP_PROXY_PATH: "/v1/mcp/{server_id}"
    };
    ALLOWED_OAUTH_BASE_URLS = ["https://beacon.claude-ai.staging.ant.dev", "https://claude.fedstart.com", "https://claude-staging.fedstart.com"];
  });
  function X4() {
    return true;
  }
  function rm() {
    return Bun.isStandaloneExecutable === true;
  }
  var bTs;
  var Q4;
  var ule;
  var np = __lazy(() => {
    bTs = ["bash-input", "bash-stdout", "bash-stderr", "bash-exit-code", "local-command-stdout", "local-command-stderr", "local-command-caveat"];
    Q4 = ["help", "-h", "--help"];
    ule = ["list", "show", "display", "current", "view", "get", "check", "describe", "print", "version", "about", "status", "?"];
  });
  function AHe(e) {
    return e.sort((t, n) => {
      let r = n.modified.getTime() - t.modified.getTime();
      if (r !== 0) {
        return r;
      }
      return n.created.getTime() - t.created.getTime();
    });
  }
  function DOr(e, {
    suffix: t = "nodejs"
  } = {}) {
    if (typeof e !== "string") {
      throw TypeError(`Expected a string, got ${typeof e}`);
    }
    if (t) {
      e += `-${t}`;
    }
    if (Nfn.default.platform === "darwin") {
      return Oxu(e);
    }
    if (Nfn.default.platform === "win32") {
      return Dxu(e);
    }
    return Mxu(e);
  }
  var WR;
  var POr;
  var Nfn;
  var ske;
  var OOr;
  var vtt;
  var Oxu = e => {
    let t = WR.default.join(ske, "Library");
    return {
      data: WR.default.join(t, "Application Support", e),
      config: WR.default.join(t, "Preferences", e),
      cache: WR.default.join(t, "Caches", e),
      log: WR.default.join(t, "Logs", e),
      temp: WR.default.join(OOr, e)
    };
  };
  var Dxu = e => {
    let t = vtt.APPDATA || WR.default.join(ske, "AppData", "Roaming");
    let n = vtt.LOCALAPPDATA || WR.default.join(ske, "AppData", "Local");
    return {
      data: WR.default.join(n, e, "Data"),
      config: WR.default.join(t, e, "Config"),
      cache: WR.default.join(n, e, "Cache"),
      log: WR.default.join(n, e, "Log"),
      temp: WR.default.join(OOr, e)
    };
  };
  var Mxu = e => {
    let t = WR.default.basename(ske);
    return {
      data: WR.default.join(vtt.XDG_DATA_HOME || WR.default.join(ske, ".local", "share"), e),
      config: WR.default.join(vtt.XDG_CONFIG_HOME || WR.default.join(ske, ".config"), e),
      cache: WR.default.join(vtt.XDG_CACHE_HOME || WR.default.join(ske, ".cache"), e),
      log: WR.default.join(vtt.XDG_STATE_HOME || WR.default.join(ske, ".local", "state"), e),
      temp: WR.default.join(OOr, t, e)
    };
  };
  var STs = __lazy(() => {
    WR = __toESM(require("path"));
    POr = __toESM(require("os"));
    Nfn = __toESM(require("process"));
    ske = POr.default.homedir();
    OOr = POr.default.tmpdir();
    ({
      env: vtt
    } = Nfn.default);
  });
  function ike(e) {
    let t = 0;
    for (let n = 0; n < e.length; n++) {
      t = (t << 5) - t + e.charCodeAt(n) | 0;
    }
    return t;
  }
  function TTs(e) {
    return Bun.hash(e).toString();
  }
  function ETs(e, t) {
    return Bun.hash(t, Bun.hash(e)).toString();
  }
  function wTs(e) {
    let t = e.replace(/[^a-zA-Z0-9]/g, "-");
    if (t.length <= 200) {
      return t;
    }
    return `${t.slice(0, 200)}-${Math.abs(ike(e)).toString(36)}`;
  }
  function Ffn(e) {
    return wTs(e);
  }
  var eDt;
  var Lfn;
  var IHe;
  var Ufn = __lazy(() => {
    STs();
    eDt = require("path");
    Lfn = DOr("claude-cli");
    IHe = {
      baseLogs: () => eDt.join(Lfn.cache, Ffn(zt().cwd())),
      errors: () => eDt.join(Lfn.cache, Ffn(zt().cwd()), "errors"),
      messages: () => eDt.join(Lfn.cache, Ffn(zt().cwd()), "messages"),
      mcpLogs: e => eDt.join(Lfn.cache, Ffn(zt().cwd()), `mcp-logs-${wTs(e)}`)
    };
  });
  function Bfn(e) {
    return e.replace(CTs, "").trim() || e;
  }
  function wtt(e) {
    return e.replace(CTs, "").trim();
  }
  function RTs(e) {
    return e.replace(Nxu, "").trim();
  }
  var CTs;
  var Nxu;
  var Ctt = __lazy(() => {
    CTs = /<([a-z][\w-]*)(?:\s[^>]*)?>[\s\S]*?<\/\1>\n?/g;
    Nxu = /<(ide_opened_file|ide_selection)(?:\s[^>]*)?>[\s\S]*?<\/\1>\n?/g;
  });
  function xTs() {
    if (process.env.CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC) {
      return "essential-traffic";
    }
    if (process.env.DISABLE_TELEMETRY) {
      return "no-telemetry";
    }
    if (st(process.env.DO_NOT_TRACK)) {
      return "no-telemetry";
    }
    return "default";
  }
  function Vi() {
    return xTs() === "essential-traffic";
  }
  function yye() {
    return xTs() !== "default";
  }
  function Rtt() {
    if (process.env.CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC) {
      return "CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC";
    }
    return null;
  }
  function $fn() {
    if (process.env.CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC) {
      return "CLAUDE_CODE_DISABLE_NONESSENTIAL_TRAFFIC";
    }
    if (process.env.DISABLE_TELEMETRY) {
      return "DISABLE_TELEMETRY";
    }
    if (st(process.env.DO_NOT_TRACK)) {
      return "DO_NOT_TRACK";
    }
    return null;
  }
  var Wd = __lazy(() => {
    gn();
  });
  function PHe(e, t) {
    let n = e.firstPrompt?.startsWith(`<${"tick"}>`);
    let r = e.firstPrompt ? wtt(e.firstPrompt) : "";
    let o = r && !n;
    let s = e.agentName || e.customTitle || e.aiTitle || e.summary || (o ? r : undefined) || t || (n ? "Autonomous session" : undefined) || (e.sessionId ? e.sessionId.slice(0, 8) : "") || "";
    return Bfn(s).trim();
  }
  function kTs(e) {
    return e.toISOString().replace(/[:.]/g, "-");
  }
  function Fxu(e) {
    if (Hfn.length >= 100) {
      Hfn.shift();
    }
    Hfn.push(e);
  }
  function ATs(e) {
    if (Ite !== null) {
      return;
    }
    if (Ite = e, xtt.length > 0) {
      let t = [...xtt];
      xtt.length = 0;
      for (let n of t) {
        switch (n.type) {
          case "error":
            Ite.logError(n.error);
            break;
          case "mcpError":
            Ite.logMCPError(n.serverName, n.error);
            break;
          case "mcpDebug":
            Ite.logMCPDebug(n.serverName, n.message);
            break;
        }
      }
    }
  }
  function Oe(e) {
    let t = sr(e);
    try {
      if (st(process.env.CLAUDE_CODE_USE_BEDROCK) || st(process.env.CLAUDE_CODE_USE_VERTEX) || st(process.env.CLAUDE_CODE_USE_FOUNDRY) || st(process.env.CLAUDE_CODE_USE_ANTHROPIC_AWS) || st(process.env.CLAUDE_CODE_USE_MANTLE) || process.env.DISABLE_ERROR_REPORTING || Vi()) {
        return;
      }
      let r = {
        error: t.stack || t.message,
        timestamp: new Date().toISOString()
      };
      if (Fxu(r), Ite === null) {
        xtt.push({
          type: "error",
          error: t
        });
        return;
      }
      Ite.logError(t);
    } catch {}
  }
  function OHe() {
    return [...Hfn];
  }
  function uu(e, t) {
    try {
      if (Ite === null) {
        xtt.push({
          type: "mcpError",
          serverName: e,
          error: t
        });
        return;
      }
      Ite.logMCPError(e, t);
    } catch {}
  }
  function dn(e, t) {
    try {
      if (Ite === null) {
        xtt.push({
          type: "mcpDebug",
          serverName: e,
          message: t
        });
        return;
      }
      Ite.logMCPDebug(e, t);
    } catch {}
  }
  function jfn(e, t) {
    if (!t || !t.startsWith("repl_main_thread")) {
      return;
    }
    let {
      messages: n,
      ...r
    } = e;
    setLastAPIRequest(r);
    setLastAPIRequestMessages(null);
  }
  var Hfn;
  var xtt;
  var Ite = null;
  var Ggh;
  var Rn = __lazy(() => {
    at();
    np();
    Ufn();
    Ctt();
    gn();
    dt();
    Wd();
    Zn();
    Hfn = [];
    xtt = [];
    Ggh = TEr(() => process.argv.includes("--hard-fail"));
  });
  function Wfn(e) {
    switch (e) {
      case "darwin":
        return "macOS";
      case "win32":
        return "Windows";
      case "linux":
        return "Linux";
      default:
        return e;
    }
  }
  async function OTs(e) {
    let t = new Set();
    if (process.env.P4PORT) {
      t.add("perforce");
    }
    try {
      let n = e ?? zt().cwd();
      let r = new Set(await qfn.readdir(n));
      for (let [o, s] of Uxu) {
        if (r.vZc(o)) {
          t.add(s);
        }
      }
    } catch {}
    return [...t];
  }
  var qfn;
  var MOr;
  var NOr;
  var Wt;
  var DHe;
  var ITs;
  var Uxu;
  var PTs;
  var Cs = __lazy(() => {
    je();
    Rn();
    qfn = require("fs/promises");
    MOr = require("os");
    NOr = ["macos", "wsl"];
    Wt = TEr(() => {
      try {
        if (process.env.WSL_DISTRO_NAME || process.env.WSL_INTEROP) {
          return "wsl";
        }
        try {
          let e = zt().readFileSync("/proc/version", {
            encoding: "utf8"
          });
          if (e.toLowerCase().includes("microsoft") || e.toLowerCase().includes("wsl")) {
            return "wsl";
          }
        } catch (e) {
          logForDebugging(`Failed to read /proc/version for WSL detection: ${e}`, {
            level: "error"
          });
        }
        return "linux";
      } catch (e) {
        Oe(e);
        return "unknown";
      }
    });
    DHe = TEr(() => {
      try {
        let e = zt().readFileSync("/proc/version", {
          encoding: "utf8"
        });
        let t = e.match(/WSL(\d+)/i);
        if (t && t[1]) {
          return t[1];
        }
        if (e.toLowerCase().includes("microsoft")) {
          return "1";
        }
        return;
      } catch (e) {
        logForDebugging(`Failed to read /proc/version for WSL detection: ${e}`, {
          level: "error"
        });
        return;
      }
    });
    ITs = TEr(async () => {
      let e = {
        linuxKernel: MOr.release()
      };
      try {
        let t = await qfn.readFile("/etc/os-release", "utf8");
        for (let n of t.split(`
`)) {
          let r = n.match(/^(ID|VERSION_ID)=(.*)$/);
          if (r && r[1] && r[2]) {
            let o = r[2].replace(/^"|"$/g, "");
            if (r[1] === "ID") {
              e.linuxDistroId = o;
            } else {
              e.linuxDistroVersion = o;
            }
          }
        }
      } catch {}
      return e;
    });
    Uxu = [[".git", "git"], [".hg", "mercurial"], [".svn", "svn"], [".p4config", "perforce"], ["$tf", "tfs"], [".tfvc", "tfs"], [".jj", "jujutsu"], [".sl", "sapling"]];
    PTs = TEr(() => {
      return;
    });
  });
  var tDt = {};