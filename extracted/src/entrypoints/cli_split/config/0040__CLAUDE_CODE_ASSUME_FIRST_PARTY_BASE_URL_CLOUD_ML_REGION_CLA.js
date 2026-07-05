  __export(sMr, {
    FALLBACK_FOR_ALL_PRIMARY_MODELS: () => FALLBACK_FOR_ALL_PRIMARY_MODELS,
    CLAUDE_CONTEXT_COLLAPSE_MODEL: () => CLAUDE_CONTEXT_COLLAPSE_MODEL,
    CLAUDE_CONTEXT_COLLAPSE: () => CLAUDE_CONTEXT_COLLAPSE,
    CLAUDE_CODE_SUBAGENT_MODEL: () => CLAUDE_CODE_SUBAGENT_MODEL,
    CLAUDE_CODE_SKIP_FAST_MODE_ORG_CHECK: () => CLAUDE_CODE_SKIP_FAST_MODE_ORG_CHECK,
    CLAUDE_CODE_SKIP_FAST_MODE_NETWORK_ERRORS: () => CLAUDE_CODE_SKIP_FAST_MODE_NETWORK_ERRORS,
    CLAUDE_CODE_OPUS_4_6_FAST_MODE_OVERRIDE: () => CLAUDE_CODE_OPUS_4_6_FAST_MODE_OVERRIDE,
    CLAUDE_CODE_ENABLE_OPUS_4_7_FAST_MODE: () => CLAUDE_CODE_ENABLE_OPUS_4_7_FAST_MODE,
    CLAUDE_CODE_EFFORT_LEVEL: () => CLAUDE_CODE_EFFORT_LEVEL,
    CLAUDE_CODE_DISABLE_LEGACY_MODEL_REMAP: () => CLAUDE_CODE_DISABLE_LEGACY_MODEL_REMAP,
    CLAUDE_CODE_DISABLE_FAST_MODE: () => CLAUDE_CODE_DISABLE_FAST_MODE,
    CLAUDE_CODE_DISABLE_1M_CONTEXT: () => CLAUDE_CODE_DISABLE_1M_CONTEXT,
    CLAUDE_CODE_BG_CLASSIFIER_MODEL: () => CLAUDE_CODE_BG_CLASSIFIER_MODEL,
    CLAUDE_CODE_AUTO_MODE_MODEL: () => CLAUDE_CODE_AUTO_MODE_MODEL,
    CLAUDE_CODE_ALWAYS_ENABLE_EFFORT: () => CLAUDE_CODE_ALWAYS_ENABLE_EFFORT,
    ANTHROPIC_SMALL_FAST_MODEL: () => ANTHROPIC_SMALL_FAST_MODEL,
    ANTHROPIC_MODEL: () => ANTHROPIC_MODEL,
    ANTHROPIC_DEFAULT_SONNET_MODEL_NAME: () => ANTHROPIC_DEFAULT_SONNET_MODEL_NAME,
    ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION: () => ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION,
    ANTHROPIC_DEFAULT_SONNET_MODEL: () => ANTHROPIC_DEFAULT_SONNET_MODEL,
    ANTHROPIC_DEFAULT_OPUS_MODEL_NAME: () => ANTHROPIC_DEFAULT_OPUS_MODEL_NAME,
    ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION: () => ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION,
    ANTHROPIC_DEFAULT_OPUS_MODEL: () => ANTHROPIC_DEFAULT_OPUS_MODEL,
    ANTHROPIC_DEFAULT_HAIKU_MODEL_NAME: () => ANTHROPIC_DEFAULT_HAIKU_MODEL_NAME,
    ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION: () => ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION,
    ANTHROPIC_DEFAULT_HAIKU_MODEL: () => ANTHROPIC_DEFAULT_HAIKU_MODEL,
    ANTHROPIC_DEFAULT_FABLE_MODEL_NAME: () => ANTHROPIC_DEFAULT_FABLE_MODEL_NAME,
    ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION: () => ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION,
    ANTHROPIC_DEFAULT_FABLE_MODEL: () => ANTHROPIC_DEFAULT_FABLE_MODEL,
    ANTHROPIC_CUSTOM_MODEL_OPTION_NAME: () => ANTHROPIC_CUSTOM_MODEL_OPTION_NAME,
    ANTHROPIC_CUSTOM_MODEL_OPTION_DESCRIPTION: () => ANTHROPIC_CUSTOM_MODEL_OPTION_DESCRIPTION,
    ANTHROPIC_CUSTOM_MODEL_OPTION: () => ANTHROPIC_CUSTOM_MODEL_OPTION
  });
  var ANTHROPIC_MODEL;
  var ANTHROPIC_SMALL_FAST_MODEL;
  var ANTHROPIC_DEFAULT_FABLE_MODEL;
  var ANTHROPIC_DEFAULT_FABLE_MODEL_NAME;
  var ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION;
  var ANTHROPIC_DEFAULT_OPUS_MODEL;
  var ANTHROPIC_DEFAULT_OPUS_MODEL_NAME;
  var ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION;
  var ANTHROPIC_DEFAULT_SONNET_MODEL;
  var ANTHROPIC_DEFAULT_SONNET_MODEL_NAME;
  var ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION;
  var ANTHROPIC_DEFAULT_HAIKU_MODEL;
  var ANTHROPIC_DEFAULT_HAIKU_MODEL_NAME;
  var ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION;
  var ANTHROPIC_CUSTOM_MODEL_OPTION;
  var ANTHROPIC_CUSTOM_MODEL_OPTION_NAME;
  var ANTHROPIC_CUSTOM_MODEL_OPTION_DESCRIPTION;
  var CLAUDE_CODE_SUBAGENT_MODEL;
  var CLAUDE_CODE_AUTO_MODE_MODEL;
  var CLAUDE_CODE_BG_CLASSIFIER_MODEL;
  var CLAUDE_CONTEXT_COLLAPSE_MODEL;
  var CLAUDE_CONTEXT_COLLAPSE;
  var FALLBACK_FOR_ALL_PRIMARY_MODELS;
  var CLAUDE_CODE_DISABLE_LEGACY_MODEL_REMAP;
  var CLAUDE_CODE_EFFORT_LEVEL;
  var CLAUDE_CODE_ALWAYS_ENABLE_EFFORT;
  var CLAUDE_CODE_DISABLE_FAST_MODE;
  var CLAUDE_CODE_ENABLE_OPUS_4_7_FAST_MODE;
  var CLAUDE_CODE_OPUS_4_6_FAST_MODE_OVERRIDE;
  var CLAUDE_CODE_SKIP_FAST_MODE_NETWORK_ERRORS;
  var CLAUDE_CODE_SKIP_FAST_MODE_ORG_CHECK;
  var CLAUDE_CODE_DISABLE_1M_CONTEXT;
  var nRs = __lazy(() => {
    ile();
    ANTHROPIC_MODEL = $e.str();
    ANTHROPIC_SMALL_FAST_MODEL = $e.str();
    ANTHROPIC_DEFAULT_FABLE_MODEL = $e.str();
    ANTHROPIC_DEFAULT_FABLE_MODEL_NAME = $e.str();
    ANTHROPIC_DEFAULT_FABLE_MODEL_DESCRIPTION = $e.str();
    ANTHROPIC_DEFAULT_OPUS_MODEL = $e.str();
    ANTHROPIC_DEFAULT_OPUS_MODEL_NAME = $e.str();
    ANTHROPIC_DEFAULT_OPUS_MODEL_DESCRIPTION = $e.str();
    ANTHROPIC_DEFAULT_SONNET_MODEL = $e.str();
    ANTHROPIC_DEFAULT_SONNET_MODEL_NAME = $e.str();
    ANTHROPIC_DEFAULT_SONNET_MODEL_DESCRIPTION = $e.str();
    ANTHROPIC_DEFAULT_HAIKU_MODEL = $e.str();
    ANTHROPIC_DEFAULT_HAIKU_MODEL_NAME = $e.str();
    ANTHROPIC_DEFAULT_HAIKU_MODEL_DESCRIPTION = $e.str();
    ANTHROPIC_CUSTOM_MODEL_OPTION = $e.str();
    ANTHROPIC_CUSTOM_MODEL_OPTION_NAME = $e.str();
    ANTHROPIC_CUSTOM_MODEL_OPTION_DESCRIPTION = $e.str();
    CLAUDE_CODE_SUBAGENT_MODEL = $e.str();
    CLAUDE_CODE_AUTO_MODE_MODEL = $e.str();
    CLAUDE_CODE_BG_CLASSIFIER_MODEL = $e.str();
    CLAUDE_CONTEXT_COLLAPSE_MODEL = $e.str();
    CLAUDE_CONTEXT_COLLAPSE = $e.bool();
    FALLBACK_FOR_ALL_PRIMARY_MODELS = $e.str();
    CLAUDE_CODE_DISABLE_LEGACY_MODEL_REMAP = $e.bool();
    CLAUDE_CODE_EFFORT_LEVEL = $e.str();
    CLAUDE_CODE_ALWAYS_ENABLE_EFFORT = $e.bool();
    CLAUDE_CODE_DISABLE_FAST_MODE = $e.bool();
    CLAUDE_CODE_ENABLE_OPUS_4_7_FAST_MODE = $e.bool();
    CLAUDE_CODE_OPUS_4_6_FAST_MODE_OVERRIDE = $e.str();
    CLAUDE_CODE_SKIP_FAST_MODE_NETWORK_ERRORS = $e.bool();
    CLAUDE_CODE_SKIP_FAST_MODE_ORG_CHECK = $e.bool();
    CLAUDE_CODE_DISABLE_1M_CONTEXT = $e.bool();
  });
  var iMr = {};
  __export(iMr, {
    NO_PROXY: () => NO_PROXY,
    MAX_THINKING_TOKENS: () => MAX_THINKING_TOKENS,
    MAX_STRUCTURED_OUTPUT_RETRIES: () => MAX_STRUCTURED_OUTPUT_RETRIES,
    MAX_MCP_OUTPUT_TOKENS: () => MAX_MCP_OUTPUT_TOKENS,
    HTTP_PROXY: () => HTTP_PROXY,
    HTTPS_PROXY: () => HTTPS_PROXY,
    CLAUDE_STREAM_IDLE_TIMEOUT_MS: () => CLAUDE_STREAM_IDLE_TIMEOUT_MS,
    CLAUDE_SLOW_FIRST_BYTE_MS: () => CLAUDE_SLOW_FIRST_BYTE_MS,
    CLAUDE_MOCK_HEADERLESS_429: () => CLAUDE_MOCK_HEADERLESS_429,
    CLAUDE_ENABLE_STREAM_WATCHDOG: () => CLAUDE_ENABLE_STREAM_WATCHDOG,
    CLAUDE_ENABLE_BYTE_WATCHDOG: () => CLAUDE_ENABLE_BYTE_WATCHDOG,
    CLAUDE_CODE_SLOW_OPERATION_THRESHOLD_MS: () => CLAUDE_CODE_SLOW_OPERATION_THRESHOLD_MS,
    CLAUDE_CODE_RETRY_WATCHDOG: () => CLAUDE_CODE_RETRY_WATCHDOG,
    CLAUDE_CODE_PRINT_BG_WAIT_CEILING_MS: () => CLAUDE_CODE_PRINT_BG_WAIT_CEILING_MS,
    CLAUDE_CODE_MAX_TURNS: () => CLAUDE_CODE_MAX_TURNS,
    CLAUDE_CODE_MAX_TOOL_USE_CONCURRENCY: () => CLAUDE_CODE_MAX_TOOL_USE_CONCURRENCY,
    CLAUDE_CODE_MAX_RETRIES: () => CLAUDE_CODE_MAX_RETRIES,
    CLAUDE_CODE_MAX_OUTPUT_TOKENS: () => CLAUDE_CODE_MAX_OUTPUT_TOKENS,
    CLAUDE_CODE_MAX_CONTEXT_TOKENS: () => CLAUDE_CODE_MAX_CONTEXT_TOKENS,
    CLAUDE_CODE_FORCE_SYNC_OUTPUT: () => CLAUDE_CODE_FORCE_SYNC_OUTPUT,
    CLAUDE_CODE_FILE_READ_MAX_OUTPUT_TOKENS: () => CLAUDE_CODE_FILE_READ_MAX_OUTPUT_TOKENS,
    CLAUDE_CODE_EXTRA_METADATA: () => CLAUDE_CODE_EXTRA_METADATA,
    CLAUDE_CODE_EXTRA_BODY: () => CLAUDE_CODE_EXTRA_BODY,
    CLAUDE_CODE_EAGER_FLUSH: () => CLAUDE_CODE_EAGER_FLUSH,
    CLAUDE_CODE_CLIENT_KEY_PASSPHRASE: () => CLAUDE_CODE_CLIENT_KEY_PASSPHRASE,
    CLAUDE_CODE_CLIENT_KEY: () => CLAUDE_CODE_CLIENT_KEY,
    CLAUDE_CODE_CLIENT_CERT: () => CLAUDE_CODE_CLIENT_CERT,
    CLAUDE_CODE_CERT_STORE: () => CLAUDE_CODE_CERT_STORE,
    CLAUDE_CODE_ATTRIBUTION_HEADER: () => CLAUDE_CODE_ATTRIBUTION_HEADER,
    API_TIMEOUT_MS: () => API_TIMEOUT_MS,
    API_TARGET_INPUT_TOKENS: () => API_TARGET_INPUT_TOKENS,
    API_MAX_INPUT_TOKENS: () => API_MAX_INPUT_TOKENS,
    API_FORCE_IDLE_TIMEOUT: () => API_FORCE_IDLE_TIMEOUT,
    ANTHROPIC_CUSTOM_HEADERS: () => ANTHROPIC_CUSTOM_HEADERS,
    ANTHROPIC_BETAS: () => ANTHROPIC_BETAS
  });
  var HTTP_PROXY;
  var HTTPS_PROXY;
  var NO_PROXY;
  var CLAUDE_CODE_CLIENT_CERT;
  var CLAUDE_CODE_CLIENT_KEY;
  var CLAUDE_CODE_CLIENT_KEY_PASSPHRASE;
  var CLAUDE_CODE_CERT_STORE;
  var ANTHROPIC_BETAS;
  var ANTHROPIC_CUSTOM_HEADERS;
  var CLAUDE_CODE_EXTRA_BODY;
  var CLAUDE_CODE_EXTRA_METADATA;
  var CLAUDE_CODE_ATTRIBUTION_HEADER;
  var CLAUDE_CODE_MAX_RETRIES;
  var CLAUDE_CODE_MAX_OUTPUT_TOKENS;
  var CLAUDE_CODE_MAX_CONTEXT_TOKENS;
  var CLAUDE_CODE_FILE_READ_MAX_OUTPUT_TOKENS;
  var CLAUDE_CODE_MAX_TOOL_USE_CONCURRENCY;
  var CLAUDE_CODE_MAX_TURNS;
  var MAX_THINKING_TOKENS;
  var MAX_STRUCTURED_OUTPUT_RETRIES;
  var MAX_MCP_OUTPUT_TOKENS;
  var API_TIMEOUT_MS;
  var API_FORCE_IDLE_TIMEOUT;
  var API_MAX_INPUT_TOKENS;
  var API_TARGET_INPUT_TOKENS;
  var CLAUDE_ENABLE_BYTE_WATCHDOG;
  var CLAUDE_ENABLE_STREAM_WATCHDOG;
  var CLAUDE_STREAM_IDLE_TIMEOUT_MS;
  var CLAUDE_SLOW_FIRST_BYTE_MS;
  var CLAUDE_CODE_RETRY_WATCHDOG;
  var CLAUDE_CODE_EAGER_FLUSH;
  var CLAUDE_CODE_FORCE_SYNC_OUTPUT;
  var CLAUDE_MOCK_HEADERLESS_429;
  var CLAUDE_CODE_SLOW_OPERATION_THRESHOLD_MS;
  var CLAUDE_CODE_PRINT_BG_WAIT_CEILING_MS;
  var rRs = __lazy(() => {
    ile();
    HTTP_PROXY = $e.str();
    HTTPS_PROXY = $e.str();
    NO_PROXY = $e.str();
    CLAUDE_CODE_CLIENT_CERT = $e.str();
    CLAUDE_CODE_CLIENT_KEY = $e.str();
    CLAUDE_CODE_CLIENT_KEY_PASSPHRASE = $e.str();
    CLAUDE_CODE_CERT_STORE = $e.str();
    ANTHROPIC_BETAS = $e.str();
    ANTHROPIC_CUSTOM_HEADERS = $e.str();
    CLAUDE_CODE_EXTRA_BODY = $e.str();
    CLAUDE_CODE_EXTRA_METADATA = $e.str();
    CLAUDE_CODE_ATTRIBUTION_HEADER = $e.str();
    CLAUDE_CODE_MAX_RETRIES = $e.int();
    CLAUDE_CODE_MAX_OUTPUT_TOKENS = $e.int();
    CLAUDE_CODE_MAX_CONTEXT_TOKENS = $e.int();
    CLAUDE_CODE_FILE_READ_MAX_OUTPUT_TOKENS = $e.int();
    CLAUDE_CODE_MAX_TOOL_USE_CONCURRENCY = $e.int();
    CLAUDE_CODE_MAX_TURNS = $e.str();
    MAX_THINKING_TOKENS = $e.int();
    MAX_STRUCTURED_OUTPUT_RETRIES = $e.int();
    MAX_MCP_OUTPUT_TOKENS = $e.int();
    API_TIMEOUT_MS = $e.int();
    API_FORCE_IDLE_TIMEOUT = $e.int();
    API_MAX_INPUT_TOKENS = $e.int();
    API_TARGET_INPUT_TOKENS = $e.int();
    CLAUDE_ENABLE_BYTE_WATCHDOG = $e.bool();
    CLAUDE_ENABLE_STREAM_WATCHDOG = $e.triBool();
    CLAUDE_STREAM_IDLE_TIMEOUT_MS = $e.int();
    CLAUDE_SLOW_FIRST_BYTE_MS = $e.int();
    CLAUDE_CODE_RETRY_WATCHDOG = $e.bool();
    CLAUDE_CODE_EAGER_FLUSH = $e.bool();
    CLAUDE_CODE_FORCE_SYNC_OUTPUT = $e.bool();
    CLAUDE_MOCK_HEADERLESS_429 = $e.bool();
    CLAUDE_CODE_SLOW_OPERATION_THRESHOLD_MS = $e.int();
    CLAUDE_CODE_PRINT_BG_WAIT_CEILING_MS = $e.int({
      min: 0
    });
  });
  var aMr = {};
  __export(aMr, {
    _CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL: () => _CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL,
    CLOUD_ML_REGION: () => CLOUD_ML_REGION,
    CLAUDE_GATEWAY_LOG_LEVEL: () => CLAUDE_GATEWAY_LOG_LEVEL,
    CLAUDE_GATEWAY_ALLOW_LOOPBACK: () => CLAUDE_GATEWAY_ALLOW_LOOPBACK,
    CLAUDE_CODE_USE_VERTEX: () => CLAUDE_CODE_USE_VERTEX,
    CLAUDE_CODE_USE_MANTLE: () => CLAUDE_CODE_USE_MANTLE,
    CLAUDE_CODE_USE_FOUNDRY: () => CLAUDE_CODE_USE_FOUNDRY,
    CLAUDE_CODE_USE_CCR_V2: () => CLAUDE_CODE_USE_CCR_V2,
    CLAUDE_CODE_USE_BEDROCK: () => CLAUDE_CODE_USE_BEDROCK,
    CLAUDE_CODE_USE_ANTHROPIC_AWS: () => CLAUDE_CODE_USE_ANTHROPIC_AWS,
    CLAUDE_CODE_SKIP_HFI_VERSION_CHECK: () => CLAUDE_CODE_SKIP_HFI_VERSION_CHECK,
    CLAUDE_CODE_SIMULATE_PROXY_USAGE: () => CLAUDE_CODE_SIMULATE_PROXY_USAGE,
    CLAUDE_CODE_PROXY_RESOLVES_HOSTS: () => CLAUDE_CODE_PROXY_RESOLVES_HOSTS,
    CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST: () => CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST,
    CLAUDE_CODE_GB_REFRESH_INTERVAL_MS: () => CLAUDE_CODE_GB_REFRESH_INTERVAL_MS,
    CLAUDE_CODE_GB_BASE_URL: () => CLAUDE_CODE_GB_BASE_URL,
    CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY: () => CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY,
    CLAUDE_CODE_API_BASE_URL: () => CLAUDE_CODE_API_BASE_URL,
    CCR_FORCE_BUNDLE: () => CCR_FORCE_BUNDLE,
    CCR_ENABLE_BUNDLE: () => CCR_ENABLE_BUNDLE,
    CCR_AGENT_PROXY_ENABLED: () => CCR_AGENT_PROXY_ENABLED,
    AWS_SHARED_CREDENTIALS_FILE: () => AWS_SHARED_CREDENTIALS_FILE,
    AWS_REGION: () => AWS_REGION,
    AWS_PROFILE: () => AWS_PROFILE,
    AWS_DEFAULT_REGION: () => AWS_DEFAULT_REGION,
    AWS_CONFIG_FILE: () => AWS_CONFIG_FILE,
    ANTHROPIC_VERTEX_PROJECT_ID: () => ANTHROPIC_VERTEX_PROJECT_ID,
    ANTHROPIC_VERTEX_BASE_URL: () => ANTHROPIC_VERTEX_BASE_URL,
    ANTHROPIC_UNIX_SOCKET: () => ANTHROPIC_UNIX_SOCKET,
    ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION: () => ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION,
    ANTHROPIC_FOUNDRY_RESOURCE: () => ANTHROPIC_FOUNDRY_RESOURCE,
    ANTHROPIC_FOUNDRY_BASE_URL: () => ANTHROPIC_FOUNDRY_BASE_URL,
    ANTHROPIC_BEDROCK_SERVICE_TIER: () => ANTHROPIC_BEDROCK_SERVICE_TIER,
    ANTHROPIC_BEDROCK_MANTLE_BASE_URL: () => ANTHROPIC_BEDROCK_MANTLE_BASE_URL,
    ANTHROPIC_BEDROCK_BASE_URL: () => ANTHROPIC_BEDROCK_BASE_URL,
    ANTHROPIC_BASE_URL: () => ANTHROPIC_BASE_URL,
    ANTHROPIC_AWS_WORKSPACE_ID: () => ANTHROPIC_AWS_WORKSPACE_ID,
    ANTHROPIC_AWS_BASE_URL: () => ANTHROPIC_AWS_BASE_URL,
    AGENT_PROXY_URL: () => AGENT_PROXY_URL
  });
  var CLAUDE_CODE_USE_BEDROCK;
  var CLAUDE_CODE_USE_VERTEX;
  var CLAUDE_CODE_USE_FOUNDRY;
  var CLAUDE_CODE_USE_ANTHROPIC_AWS;
  var CLAUDE_CODE_USE_MANTLE;
  var CLAUDE_CODE_USE_CCR_V2;
  var ANTHROPIC_BASE_URL;
  var _CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL;
  var CLAUDE_CODE_API_BASE_URL;
  var ANTHROPIC_BEDROCK_BASE_URL;
  var ANTHROPIC_BEDROCK_SERVICE_TIER;
  var ANTHROPIC_BEDROCK_MANTLE_BASE_URL;
  var ANTHROPIC_AWS_BASE_URL;
  var ANTHROPIC_AWS_WORKSPACE_ID;
  var ANTHROPIC_VERTEX_BASE_URL;
  var ANTHROPIC_VERTEX_PROJECT_ID;
  var CLOUD_ML_REGION;
  var ANTHROPIC_FOUNDRY_BASE_URL;
  var ANTHROPIC_FOUNDRY_RESOURCE;
  var AWS_REGION;
  var AWS_DEFAULT_REGION;
  var AWS_PROFILE;
  var AWS_CONFIG_FILE;
  var AWS_SHARED_CREDENTIALS_FILE;
  var ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION;
  var ANTHROPIC_UNIX_SOCKET;
  var CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST;
  var CLAUDE_CODE_SIMULATE_PROXY_USAGE;
  var CLAUDE_CODE_PROXY_RESOLVES_HOSTS;
  var CLAUDE_GATEWAY_ALLOW_LOOPBACK;
  var CLAUDE_GATEWAY_LOG_LEVEL;
  var CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY;
  var CLAUDE_CODE_GB_BASE_URL;
  var CLAUDE_CODE_GB_REFRESH_INTERVAL_MS;
  var CCR_AGENT_PROXY_ENABLED;
  var CCR_ENABLE_BUNDLE;
  var CCR_FORCE_BUNDLE;
  var AGENT_PROXY_URL;
  var CLAUDE_CODE_SKIP_HFI_VERSION_CHECK;
  var oRs = __lazy(() => {
    ile();
    CLAUDE_CODE_USE_BEDROCK = $e.bool();
    CLAUDE_CODE_USE_VERTEX = $e.bool();
    CLAUDE_CODE_USE_FOUNDRY = $e.bool();
    CLAUDE_CODE_USE_ANTHROPIC_AWS = $e.bool();
    CLAUDE_CODE_USE_MANTLE = $e.bool();
    CLAUDE_CODE_USE_CCR_V2 = $e.bool();
    ANTHROPIC_BASE_URL = $e.str();
    _CLAUDE_CODE_ASSUME_FIRST_PARTY_BASE_URL = $e.bool();
    CLAUDE_CODE_API_BASE_URL = $e.str();
    ANTHROPIC_BEDROCK_BASE_URL = $e.str();
    ANTHROPIC_BEDROCK_SERVICE_TIER = $e.str();
    ANTHROPIC_BEDROCK_MANTLE_BASE_URL = $e.str();
    ANTHROPIC_AWS_BASE_URL = $e.str();
    ANTHROPIC_AWS_WORKSPACE_ID = $e.str();
    ANTHROPIC_VERTEX_BASE_URL = $e.str();
    ANTHROPIC_VERTEX_PROJECT_ID = $e.str();
    CLOUD_ML_REGION = $e.str();
    ANTHROPIC_FOUNDRY_BASE_URL = $e.str();
    ANTHROPIC_FOUNDRY_RESOURCE = $e.str();
    AWS_REGION = $e.str();
    AWS_DEFAULT_REGION = $e.str();
    AWS_PROFILE = $e.str();
    AWS_CONFIG_FILE = $e.str();
    AWS_SHARED_CREDENTIALS_FILE = $e.str();
    ANTHROPIC_SMALL_FAST_MODEL_AWS_REGION = $e.str();
    ANTHROPIC_UNIX_SOCKET = $e.str();
    CLAUDE_CODE_PROVIDER_MANAGED_BY_HOST = $e.bool();
    CLAUDE_CODE_SIMULATE_PROXY_USAGE = $e.bool();
    CLAUDE_CODE_PROXY_RESOLVES_HOSTS = $e.bool();
    CLAUDE_GATEWAY_ALLOW_LOOPBACK = $e.bool();
    CLAUDE_GATEWAY_LOG_LEVEL = $e.str();
    CLAUDE_CODE_ENABLE_GATEWAY_MODEL_DISCOVERY = $e.bool();
    CLAUDE_CODE_GB_BASE_URL = $e.str();
    CLAUDE_CODE_GB_REFRESH_INTERVAL_MS = $e.int();
    CCR_AGENT_PROXY_ENABLED = $e.bool();
    CCR_ENABLE_BUNDLE = $e.bool();
    CCR_FORCE_BUNDLE = $e.bool();
    AGENT_PROXY_URL = $e.str();
    CLAUDE_CODE_SKIP_HFI_VERSION_CHECK = $e.bool();
  });
  function sRs(e, t) {
    let n = Object.create(t);
    for (let [r, o] of Object.entries(e)) {
      let s = n;
      let i;
      Object.defineProperty(n, r, {
        get: () => {
          let a = process.env[r];
          if (a !== s) {
            i = o.parse(a);
            s = a;
          }
          return i;
        },
        enumerable: true,
        configurable: true
      });
    }
    Object.defineProperties(n, {
      set: {
        value: (r, o) => {
          process.env[r] = dTs(o);
        }
      },
      unset: {
        value: r => {
          delete process.env[r];
        }
      }
    });
    return n;
  }
  var t$u;
  var Me;
  var n$u;
  var gI;
  var d_ = __lazy(() => {
    mTs();
    fTs();
    xDt();
    ZCs();
    eRs();
    tRs();
    nRs();
    rRs();
    oRs();
    ile();
    xDt();
    t$u = {
      ...vOr,
      ...aMr,
      ...sMr,
      ...nMr,
      ...iMr,
      ...rMr,
      ...wOr,
      ...oMr
    };
    Me = sRs(t$u, Vtt);
    n$u = {};
    gI = sRs(n$u, null);
  });
  var pr = __lazy(() => {
    d_();
  });
  function NN() {
    let e = process.env.CLAUDE_CODE_ENTRYPOINT;
    return e && r$u.vZc(e) ? e : undefined;
  }
  function L6() {
    let e = process.env.CLAUDE_CODE_ENTRYPOINT;
    return e !== undefined && o$u.vZc(e);
  }
  function khn() {
    return process.env.CLAUDE_CODE_ENTRYPOINT === "remote_trigger";
  }
  function iRs() {
    return Me.CLAUDE_CODE_ENTRYPOINT === "remote_cowork";
  }
  function kDt() {
    let e = Me.CLAUDE_CODE_ENTRYPOINT;
    return e === "claude_in_slack" || e === "claude-in-slack";
  }
  function Ahn() {
    return Me.CLAUDE_CODE_ENTRYPOINT === "claude-in-teams";
  }
  function aRs() {
    if (st(Me.CLAUDE_CODE_HIDE_SETTINGS_HINT)) {
      return false;
    }
    let e = Me.CLAUDE_CODE_ENTRYPOINT;
    return e === undefined || !s$u.vZc(e);
  }
  function Ktt() {
    let e = process.env.CLAUDE_CODE_ENTRYPOINT;
    return e === "sdk-ts" || e === "sdk-py" || e === "sdk-cli";
  }
  function lRs(e) {
    if (process.env.CLAUDE_CODE_ENTRYPOINT) {
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "local_agent") {
        process.env.CLAUDE_CODE_ENTRYPOINT = "local-agent";
      }
      if (process.env.CLAUDE_CODE_ENTRYPOINT === "cli" && e) {
        process.env.CLAUDE_CODE_ENTRYPOINT = "sdk-cli";
      }
      return;
    }
    let t = process.argv.slice(2);
    let n = t.indexOf("mcp");
    if (n !== -1 && t[n + 1] === "serve") {
      process.env.CLAUDE_CODE_ENTRYPOINT = "mcp";
      return;
    }
    if (st(process.env.CLAUDE_CODE_ACTION)) {
      process.env.CLAUDE_CODE_ENTRYPOINT = "claude-code-github-action";
      return;
    }
    process.env.CLAUDE_CODE_ENTRYPOINT = e ? "sdk-cli" : "cli";
  }
  function cRs(e) {
    let t = e.indexOf("--");
    let n = t === -1 ? e : e.slice(0, t);
    if (n.includes("-r") || n.includes("--resume") || n.includes("--from-pr") || n.some(r => r.startsWith("--resume=") || r.startsWith("--from-pr="))) {
      return "resume";
    }
    if (n.includes("-c") || n.includes("--continue")) {
      return "continue";
    }
    return "fresh";
  }
  var r$u;
  var o$u;
  var s$u;
  var $A = __lazy(() => {
    pr();
    gn();
    r$u = new Set(["cli", "mcp", "sdk-cli", "sdk-ts", "sdk-py", "bench", "claude-vscode", "claude-code-github-action", "local-agent", "local_agent", "claude-desktop", "remote", "remote_baku", "remote_cowork", "remote_trigger", "remote_desktop", "remote_mobile", "claude_in_slack", "claude-in-slack", "claude-in-teams", "claude-desktop-3p", "claude-security", "ssh-remote"]);
    o$u = new Set(["claude-desktop", "claude-desktop-3p", "local-agent"]);
    s$u = new Set(["claude_in_slack", "claude-in-slack", "claude-in-teams", "remote_trigger", "remote_cowork", "remote_baku"]);
  });
  function l$u() {
    let e = new Map();
    for (let [t, n] of Object.entries(GR)) {
      for (let [r, o] of Object.entries(n)) {
        GR[r] = {
          open: `\x1B[${o[0]}m`,
          close: `\x1B[${o[1]}m`
        };
        n[r] = GR[r];
        e.set(o[0], o[1]);
      }
      Object.defineProperty(GR, t, {
        value: n,
        enumerable: false
      });
    }
    Object.defineProperty(GR, "codes", {
      value: e,
      enumerable: false
    });
    GR.color.close = "\x1B[39m";
    GR.bgColor.close = "\x1B[49m";
    GR.color.ansi = uRs();
    GR.color.ansi256 = dRs();
    GR.color.ansi16m = pRs();
    GR.bgColor.ansi = uRs(10);
    GR.bgColor.ansi256 = dRs(10);
    GR.bgColor.ansi16m = pRs(10);
    Object.defineProperties(GR, {
      rgbToAnsi256: {
        value(t, n, r) {
          if (t === n && n === r) {
            if (t < 8) {
              return 16;
            }
            if (t > 248) {
              return 231;
            }
            return Math.round((t - 8) / 247 * 24) + 232;
          }
          return 16 + 36 * Math.round(t / 255 * 5) + 6 * Math.round(n / 255 * 5) + Math.round(r / 255 * 5);
        },
        enumerable: false
      },
      hexToRgb: {
        value(t) {
          let n = /[a-f\d]{6}|[a-f\d]{3}/i.exec(t.toString(16));
          if (!n) {
            return [0, 0, 0];
          }
          let [r] = n;
          if (r.length === 3) {
            r = [...r].map(s => s + s).join("");
          }
          let o = Number.parseInt(r, 16);
          return [o >> 16 & 255, o >> 8 & 255, o & 255];
        },
        enumerable: false
      },
      hexToAnsi256: {
        value: t => GR.rgbToAnsi256(...GR.hexToRgb(t)),
        enumerable: false
      },
      ansi256ToAnsi: {
        value(t) {
          if (t < 8) {
            return 30 + t;
          }
          if (t < 16) {
            return 90 + (t - 8);
          }
          let n;
          let r;
          let o;
          if (t >= 232) {
            n = ((t - 232) * 10 + 8) / 255;
            r = n;
            o = n;
          } else {
            t -= 16;
            let a = t % 36;
            n = Math.floor(t / 36) / 5;
            r = Math.floor(a / 6) / 5;
            o = a % 6 / 5;
          }
          let s = Math.max(n, r, o) * 2;
          if (s === 0) {
            return 30;
          }
          let i = 30 + (Math.round(o) << 2 | Math.round(r) << 1 | Math.round(n));
          if (s === 2) {
            i += 60;
          }
          return i;
        },
        enumerable: false
      },
      rgbToAnsi: {
        value: (t, n, r) => GR.ansi256ToAnsi(GR.rgbToAnsi256(t, n, r)),
        enumerable: false
      },
      hexToAnsi: {
        value: t => GR.ansi256ToAnsi(GR.hexToAnsi256(t)),
        enumerable: false
      }
    });
    return GR;
  }
  var uRs = (e = 0) => t => `\x1B[${t + e}m`;
  var dRs = (e = 0) => t => `\x1B[${38 + e};5;${t}m`;
  var pRs = (e = 0) => (t, n, r) => `\x1B[${38 + e};2;${t};${n};${r}m`;
  var GR;
  var hEh;
  var i$u;
  var a$u;
  var gEh;
  var c$u;
  function Q7(e, t = globalThis.Deno ? globalThis.Deno.args : Phn.default.argv) {
    let n = e.startsWith("-") ? "" : e.length === 1 ? "-" : "--";
    let r = t.indexOf(n + e);
    let o = t.indexOf("--");
    return r !== -1 && (o === -1 || r < o);
  }
  function u$u() {
    if ("FORCE_COLOR" in VR) {
      if (VR.FORCE_COLOR === "true") {
        return 1;
      }
      if (VR.FORCE_COLOR === "false") {
        return 0;
      }
      return VR.FORCE_COLOR.length === 0 ? 1 : Math.min(Number.parseInt(VR.FORCE_COLOR, 10), 3);
    }
  }
  function d$u(e) {
    if (e === 0) {
      return false;
    }
    return {
      level: e,
      hasBasic: true,
      has256: e >= 2,
      has16m: e >= 3
    };
  }
  function p$u(e, {
    streamIsTTY: t,
    sniffFlags: n = true
  } = {}) {
    let r = u$u();
    if (r !== undefined) {
      Ihn = r;
    }
    let o = n ? Ihn : r;
    if (o === 0) {
      return 0;
    }
    if (n) {
      if (Q7("color=16m") || Q7("color=full") || Q7("color=truecolor")) {
        return 3;
      }
      if (Q7("color=256")) {
        return 2;
      }
    }
    if ("TF_BUILD" in VR && "AGENT_NAME" in VR) {
      return 1;
    }
    if (e && !t && o === undefined) {
      return 0;
    }
    let s = o || 0;
    if (VR.TERM === "dumb") {
      return s;
    }
    if (Phn.default.platform === "win32") {
      let i = hRs.default.release().split(".");
      if (Number(i[0]) >= 10 && Number(i[2]) >= 10586) {
        return Number(i[2]) >= 14931 ? 3 : 2;
      }
      return 1;
    }
    if ("CI" in VR) {
      if (["GITHUB_ACTIONS", "GITEA_ACTIONS", "CIRCLECI"].some(i => i in VR)) {
        return 3;
      }
      if (["TRAVIS", "APPVEYOR", "GITLAB_CI", "BUILDKITE", "DRONE"].some(i => i in VR) || VR.CI_NAME === "codeship") {
        return 1;
      }
      return s;
    }
    if ("TEAMCITY_VERSION" in VR) {
      return /^(9\.(0*[1-9]\d*)\.|\d{2,}\.)/.test(VR.TEAMCITY_VERSION) ? 1 : 0;
    }
    if (VR.COLORTERM === "truecolor") {
      return 3;
    }
    if (VR.TERM === "xterm-kitty") {
      return 3;
    }
    if (VR.TERM === "xterm-ghostty") {
      return 3;
    }
    if (VR.TERM === "wezterm") {
      return 3;
    }
    if ("TERM_PROGRAM" in VR) {
      let i = Number.parseInt((VR.TERM_PROGRAM_VERSION || "").split(".")[0], 10);
      switch (VR.TERM_PROGRAM) {
        case "iTerm.app":
          return i >= 3 ? 3 : 2;
        case "Apple_Terminal":
          return 2;
      }
    }
    if (/-256(color)?$/i.test(VR.TERM)) {
      return 2;
    }
    if (/^screen|^xterm|^vt100|^vt220|^rxvt|color|ansi|cygwin|linux/i.test(VR.TERM)) {
      return 1;
    }
    if ("COLORTERM" in VR) {
      return 1;
    }
    return s;
  }
  function fRs(e, t = {}) {
    let n = p$u(e, {
      streamIsTTY: e && e.isTTY,
      ...t
    });
    return d$u(n);
  }
  var Phn;
  var hRs;
  var lMr;
  var VR;
  var Ihn;
  var m$u;
  function _Rs(e, t, n) {
    let r = e.indexOf(t);
    if (r === -1) {
      return e;
    }
    let o = t.length;
    let s = 0;
    let i = "";
    do {
      i += e.slice(s, r) + t + n;
      s = r + o;
      r = e.indexOf(t, s);
    } while (r !== -1);
    i += e.slice(s);
    return i;
  }
  function bRs(e, t, n, r) {
    let o = 0;
    let s = "";
    do {
      let i = e[r - 1] === "\r";
      s += e.slice(o, i ? r - 1 : r) + t + (i ? `\r
` : `
`) + n;
      o = r + 1;
      r = e.indexOf(`
`, o);
    } while (r !== -1);
    s += e.slice(o);
    return s;
  }
  class pMr {
    constructor(e) {
      return vRs(e);
    }
  }
  function IDt(e) {
    return vRs(e);
  }
  var SRs;
  var TRs;
  var cMr;
  var Ytt;
  var ADt;
  var ERs;
  var Jtt;
  var f$u = (e, t = {}) => {
    if (t.level && !(Number.isInteger(t.level) && t.level >= 0 && t.level <= 3)) {
      throw Error("The `level` option should be an integer from 0 to 3");
    }
    let n = SRs ? SRs.level : 0;
    e.level = t.level === undefined ? n : t.level;
  };
  var vRs = e => {
    let t = (...n) => n.join(" ");
    f$u(t, e);
    Object.setPrototypeOf(t, IDt.prototype);
    return t;
  };
  var uMr = (e, t, n, ...r) => {
    if (e === "rgb") {
      if (t === "ansi16m") {
        return c$u[n].ansi16m(...r);
      }
      if (t === "ansi256") {
        return c$u[n].ansi256(c$u.rgbToAnsi256(...r));
      }
      return c$u[n].ansi(c$u.rgbToAnsi(...r));
    }
    if (e === "hex") {
      return uMr("rgb", t, n, ...c$u.hexToRgb(...r));
    }
    return c$u[n][e](...r);
  };
  var h$u;
  var g$u;
  var dMr = (e, t, n) => {
    let r;
    let o;
    if (n === undefined) {
      r = e;
      o = t;
    } else {
      r = n.openAll + e;
      o = t + n.closeAll;
    }
    return {
      open: e,
      close: t,
      openAll: r,
      closeAll: o,
      parent: n
    };
  };
  var Ohn = (e, t, n) => {
    let r = (...o) => y$u(r, o.length === 1 ? "" + o[0] : o.join(" "));
    Object.setPrototypeOf(r, g$u);
    r[cMr] = e;
    r[Ytt] = t;
    r[ADt] = n;
    return r;
  };
  var y$u = (e, t) => {
    if (e.level <= 0 || !t) {
      return e[ADt] ? "" : t;
    }
    let n = e[Ytt];
    if (n === undefined) {
      return t;
    }
    let {
      openAll: r,
      closeAll: o
    } = n;
    if (t.includes("\x1B")) {
      while (n !== undefined) {
        t = _Rs(t, n.close, n.open);
        n = n.parent;
      }
    }
    let s = t.indexOf(`
`);
    if (s !== -1) {
      t = bRs(t, o, r, s);
    }
    return r + t + o;
  };
  var _$u;
  var vEh;
  function b$u(e, t, n, r) {
    var o = -1;
    var s = e == null ? 0 : e.length;
    if (r && s) {
      n = e[++o];
    }
    while (++o < s) {
      n = t(n, e[o], o, e);
    }
    return n;
  }
  function S$u(e) {
    return function (t) {
      return e == null ? undefined : e[t];
    };
  }
  var T$u;
  var E$u;
  function I$u(e) {
    e = Cnu(e);
    return e && e.replace(v$u, E$u).replace(A$u, "");
  }
  var v$u;
  var x$u;
  var k$u;
  var A$u;
  function O$u(e) {
    return e.match(P$u) || [];
  }
  var P$u;
  function M$u(e) {
    return D$u.test(e);
  }
  var D$u;
  function rHu(e) {
    return e.match(nHu) || [];
  }
  var U$u;
  var WRs;
  var LRs;
  var W$u;
  var G$u;
  var zRs;
  var KRs;
  var z$u;
  var K$u;
  var Xtt;
  var FRs;
  var J$u;
  var URs;
  var BRs;
  var XRs;
  var QRs;
  var X$u;
  var eHu;
  var tHu;
  var nHu;
  function oHu(e, t, n) {
    if (e = Cnu(e), t = n ? undefined : t, t === undefined) {
      return M$u(e) ? rHu(e) : O$u(e);
    }
    return e.match(t) || [];
  }
  function aHu(e) {
    return function (t) {
      return b$u(oHu(I$u(t).replace(iHu, "")), e, "");
    };
  }
  var iHu;
  var lHu;
  function ixs(e) {
    return `tool_${lHu(e)}`;
  }
  function Mhn(e) {
    return `cmd_${lHu(e)}`;
  }
  function GHe(e) {
    return `hook_${lHu(e)}`;
  }
  function Pe(e, t) {
    logEvent("tengu_feature_ok", {
      feature_name: e,
      ...t
    });
  }
  function Ae(e, t, n) {
    logEvent("tengu_feature_bad", {
      ...n,
      feature_name: e,
      error_code: t
    });
  }
  function Et(e, t, n) {
    logEvent("tengu_feature_sad", {
      ...n,
      feature_name: e,
      error_code: t
    });
  }
  async function nS(e, t) {
    await logEventAsync("tengu_feature_ok", {
      feature_name: e,
      ...t
    });
  }
  async function ou(e, t, n) {
    await logEventAsync("tengu_feature_bad", {
      ...n,
      feature_name: e,
      error_code: t
    });
  }
  async function GB(e, t) {
    await logEventAsync("tengu_feature_sad", {
      feature_name: e,
      error_code: t
    });
  }
  async function vl(e, t, n) {
    try {
      let r = await t();
      Pe(e);
      return r;
    } catch (r) {
      throw Ae(e, n?.(r) ?? "error"), r;
    }
  }
  var ln = __lazy(() => {
    Ot();
  });