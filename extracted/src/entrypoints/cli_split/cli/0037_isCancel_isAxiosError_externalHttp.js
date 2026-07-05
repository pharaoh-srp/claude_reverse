  __export(CDt, {
    toFormData: () => toFormData,
    spread: () => spread,
    mergeConfig: () => mergeConfig,
    isCancel: () => isCancel,
    isAxiosError: () => isAxiosError,
    getAdapter: () => getAdapter,
    formToJSON: () => formToJSON,
    default: () => NP,
    all: () => all_export,
    VERSION: () => VERSION,
    HttpStatusCode: () => HttpStatusCode,
    CanceledError: () => CanceledError,
    CancelToken: () => CancelToken,
    Cancel: () => Cancel,
    AxiosHeaders: () => AxiosHeaders,
    AxiosError: () => AxiosError,
    Axios: () => Axios
  });
  var Axios;
  var AxiosError;
  var CanceledError;
  var isCancel;
  var CancelToken;
  var VERSION;
  var all_export;
  var Cancel;
  var isAxiosError;
  var spread;
  var toFormData;
  var AxiosHeaders;
  var HttpStatusCode;
  var formToJSON;
  var getAdapter;
  var mergeConfig;
  var Dp = __lazy(() => {
    ({
      Axios: JIu,
      AxiosError: XIu,
      CanceledError: QIu,
      isCancel: MN,
      CancelToken: ZIu,
      VERSION: ePu,
      all: tPu,
      Cancel: nPu,
      isAxiosError: hb,
      spread: rPu,
      toFormData: oPu,
      AxiosHeaders: sPu,
      HttpStatusCode: iPu,
      formToJSON: aPu,
      getAdapter: lPu,
      mergeConfig: cPu
    } = NP);
  });
  function WCs(e) {
    let t;
    let n = e.startsWith("//") ? `https:${e}` : e;
    try {
      t = new URL(n).hostname;
    } catch {
      t = e.match(/^[^/:]+/)?.[0] ?? e;
    }
    return t.endsWith(".") ? t.slice(0, -1) : t;
  }
  function Rhn(e) {
    return uPu.test(WCs(e));
  }
  function WHe(e) {
    return dPu.test(WCs(e));
  }
  var uPu;
  var dPu;
  var qtt = __lazy(() => {
    uPu = /(^|\.)(anthropic\.com|claude\.ai|claude\.com)$/i;
    dPu = /(^|\.)downloads\.claude\.ai$/i;
  });
  var GCs = {};
  __export(GCs, {
    isCancel: () => isCancel,
    isAxiosError: () => isAxiosError,
    externalHttp: () => externalHttp
  });
  function Wtt(e, t) {
    for (let n of [e, t?.baseURL]) {
      if (n && Rhn(n)) {
        throw Error(`externalHttp: ${n} is Anthropic-operated. Use firstPartyApi from ` + "src/services/http/firstParty \u2014 it enforces the 3P data-residency gate.");
      }
    }
  }
  var externalHttp;
  var pk = __lazy(() => {
    Dp();
    qtt();
    Dp();
    externalHttp = {
      get(e, t) {
        Wtt(e, t);
        return NP.get(e, t);
      },
      head(e, t) {
        Wtt(e, t);
        return NP.head(e, t);
      },
      post(e, t, n) {
        Wtt(e, n);
        return NP.post(e, t, n);
      },
      put(e, t, n) {
        Wtt(e, n);
        return NP.put(e, t, n);
      },
      patch(e, t, n) {
        Wtt(e, n);
        return NP.patch(e, t, n);
      },
      delete(e, t) {
        Wtt(e, t);
        return NP.delete(e, t);
      }
    };
  });
  async function mPu() {
    return null;
  }
  async function Gtt(e) {
    try {
      return !!(await Qm(e));
    } catch {
      return false;
    }
  }
  async function yPu(e) {
    try {
      return /appinstaller/i.test(await ztt.readlink(e));
    } catch {
      return false;
    }
  }
  async function _Pu(e) {
    let t = Wt() === "windows";
    let n = new Set(KCs);
    let r = t ? (process.env.PATHEXT ?? ".COM;.EXE;.BAT;.CMD").toLowerCase().split(";").filter(Boolean) : [];
    let o = Ro((process.env.PATH ?? "").split(uke.delimiter).map(s => s.replace(/^"|"$/g, "")).filter(Boolean));
    await Promise.all(o.map(async s => {
      let i;
      try {
        i = await ztt.readdir(s, {
          withFileTypes: true
        });
      } catch {
        return;
      }
      let a = t && /[\\/]microsoft[\\/]windowsapps[\\/]?$/i.test(s);
      for (let l of i) {
        if (l.isDirectory()) {
          continue;
        }
        let c = l.name;
        if (t) {
          let u = c.toLowerCase();
          let d = u.lastIndexOf(".");
          if (d <= 0 || !r.includes(u.slice(d))) {
            continue;
          }
          c = u.slice(0, d);
        }
        if (!n.vZc(c) || e.vZc(c)) {
          continue;
        }
        if (t) {
          if (a && (await yPu(uke.join(s, l.name)))) {
            continue;
          }
        } else {
          try {
            await ztt.access(uke.join(s, l.name), VCs.constants.X_OK);
          } catch {
            continue;
          }
        }
        e.add(c);
      }
    }));
  }
  function SPu() {
    return process.env.__CFBundleIdentifier === "com.conductor.app";
  }
  function eMr(e) {
    let t = e.toLowerCase();
    return t.includes("windsurf") || t.includes("devin.app") || t.includes("devin desktop") || t.includes("devin-desktop") || /appdata[\\/]local[\\/](programs[\\/])?devin[\\/]/.test(t);
  }
  function TPu() {
    if (process.env.CURSOR_TRACE_ID) {
      return "cursor";
    }
    let e = process.env.VSCODE_GIT_ASKPASS_MAIN?.toLowerCase() ?? "";
    if (e.includes("cursor")) {
      return "cursor";
    }
    if (eMr(e)) {
      return "windsurf";
    }
    if (e.includes("antigravity")) {
      return "antigravity";
    }
    let t = process.env.__CFBundleIdentifier?.toLowerCase();
    if (t?.includes("vscodium")) {
      return "codium";
    }
    if (t?.includes("windsurf") || t?.includes("devin")) {
      return "windsurf";
    }
    if (t?.includes("com.google.android.studio")) {
      return "androidstudio";
    }
    if (t) {
      for (let n of N6) {
        if (t.includes(n)) {
          return n;
        }
      }
    }
    if (process.env.VisualStudioVersion) {
      return "visualstudio";
    }
    if (process.env.TERMINAL_EMULATOR === "JetBrains-JediTerm") {
      return "pycharm";
    }
    if (process.env.TERM === "xterm-ghostty") {
      return "ghostty";
    }
    if (process.env.TERM?.includes("kitty")) {
      return "kitty";
    }
    if (process.env.TERM_PROGRAM) {
      if (/^devin([ -]desktop)?$/i.test(process.env.TERM_PROGRAM)) {
        return "windsurf";
      }
      return process.env.TERM_PROGRAM;
    }
    if (process.env.TMUX) {
      return "tmux";
    }
    if (process.env.STY) {
      return "screen";
    }
    if (process.env.KONSOLE_VERSION) {
      return "konsole";
    }
    if (process.env.GNOME_TERMINAL_SERVICE) {
      return "gnome-terminal";
    }
    if (process.env.XTERM_VERSION) {
      return "xterm";
    }
    if (process.env.VTE_VERSION) {
      return "vte-based";
    }
    if (process.env.TERMINATOR_UUID) {
      return "terminator";
    }
    if (process.env.KITTY_WINDOW_ID) {
      return "kitty";
    }
    if (process.env.ALACRITTY_LOG) {
      return "alacritty";
    }
    if (process.env.TILIX_ID) {
      return "tilix";
    }
    if (process.env.WT_SESSION) {
      return "windows-terminal";
    }
    if (process.env.SESSIONNAME && process.env.TERM === "cygwin") {
      return "cygwin";
    }
    if (process.env.MSYSTEM) {
      return process.env.MSYSTEM.toLowerCase();
    }
    if (process.env.ConEmuANSI || process.env.ConEmuPID || process.env.ConEmuTask) {
      return "conemu";
    }
    if (process.env.WSL_DISTRO_NAME) {
      return `wsl-${process.env.WSL_DISTRO_NAME}`;
    }
    if (QCs()) {
      return "ssh-session";
    }
    if (process.env.TERM) {
      let n = process.env.TERM;
      if (n.includes("alacritty")) {
        return "alacritty";
      }
      if (n.includes("rxvt")) {
        return "rxvt";
      }
      if (n.includes("termite")) {
        return "termite";
      }
      return process.env.TERM;
    }
    if (!process.stdout.isTTY) {
      return "non-interactive";
    }
    return null;
  }
  function QCs() {
    return !!(process.env.SSH_CONNECTION || process.env.SSH_CLIENT || process.env.SSH_TTY);
  }
  function RDt() {
    let e = process.env.CLAUDE_CODE_HOST_PLATFORM;
    if (e === "win32" || e === "darwin" || e === "linux") {
      return e;
    }
    return Vtt.platform;
  }
  function xhn(e) {
    if (!e) {
      return "none";
    }
    let t = e.split(/[/\\]/).pop().toLowerCase().replace(/\.exe$/, "");
    return EPu.vZc(t) ? t : "other";
  }
  function tMr() {
    return xhn(process.env.SHELL || process.env.COMSPEC || "");
  }
  var VCs;
  var ztt;
  var zCs;
  var uke;
  var hI;
  var pPu;
  var fPu;
  var hPu;
  var KCs;
  var YCs;
  var JCs;
  var bPu;
  var N6;
  var XCs;
  var Vtt;
  var EPu;
  var xDt = __lazy(() => {
    Uc();
    gn();
    Cs();
    VCs = require("fs");
    ztt = require("fs/promises");
    zCs = require("os");
    uke = require("path");
    hI = TEr(() => {
      if (zt().existsSync(uke.join(er(), ".config.json"))) {
        return uke.join(er(), ".config.json");
      }
      let e = `.claude${fileSuffixForOauthConfig()}.json`;
      return uke.join(process.env.CLAUDE_CONFIG_DIR || zCs.homedir(), e);
    });
    pPu = TEr(async () => {
      try {
        let {
          externalHttp: e
        } = await Promise.resolve().then(() => (pk(), GCs));
        await e.head("http://1.1.1.1", {
          signal: AbortSignal.timeout(1000)
        });
        return true;
      } catch {
        return false;
      }
    });
    fPu = TEr(async () => {
      let e = [];
      if (await Gtt("npm")) {
        e.push("npm");
      }
      if (await Gtt("yarn")) {
        e.push("yarn");
      }
      if (await Gtt("pnpm")) {
        e.push("pnpm");
      }
      return e;
    });
    hPu = TEr(async () => {
      let e = [];
      if (await Gtt("bun")) {
        e.push("bun");
      }
      if (await Gtt("deno")) {
        e.push("deno");
      }
      if (await Gtt("node")) {
        e.push("node");
      }
      return e;
    });
    KCs = ["git", "node", "npm", "npx", "yarn", "pnpm", "bun", "deno", "tsc", "python", "python3", "py", "pip", "uv", "poetry", "ruby", "gem", "bundle", "rake", "dotnet", "msbuild", "nuget", "cl", "nmake", "cmake", "ninja", "make", "gcc", "g++", "clang", "cargo", "rustc", "go", "java", "javac", "mvn", "gradle", "docker"];
    YCs = TEr(async () => {
      let e = new Set();
      try {
        await withTimeout(_Pu(e), 1000, "build tool PATH scan timed out");
      } catch {}
      return KCs.filter(t => e.vZc(t));
    });
    JCs = TEr(() => {
      try {
        return zt().existsSync("/proc/sys/fs/binfmt_misc/WSLInterop");
      } catch (e) {
        return false;
      }
    });
    bPu = TEr(() => {
      try {
        if (!JCs()) {
          return false;
        }
        let e = MTs("npm");
        if (e === null) {
          return false;
        }
        return e.startsWith("/mnt/c/");
      } catch (e) {
        return false;
      }
    });
    N6 = ["pycharm", "intellij", "webstorm", "phpstorm", "rubymine", "clion", "goland", "rider", "datagrip", "appcode", "dataspell", "aqua", "gateway", "fleet", "jetbrains", "androidstudio"];
    XCs = TEr(() => {
      if (st(process.env.CODESPACES)) {
        return "codespaces";
      }
      if (process.env.GITPOD_WORKSPACE_ID) {
        return "gitpod";
      }
      if (st(process.env.CODER) || process.env.CODER_WORKSPACE_NAME) {
        return "coder";
      }
      if (st(process.env.DEVPOD) || process.env.DEVPOD_WORKSPACE_UID) {
        return "devpod";
      }
      if (process.env.DAYTONA_WS_ID) {
        return "daytona";
      }
      if (st(process.env.GOOGLE_CLOUD_WORKSTATIONS)) {
        return "gcp-cloud-workstations";
      }
      if (process.env.C9_PID || process.env.C9_USER) {
        return "aws-cloud9";
      }
      if (process.env.REPL_ID || process.env.REPL_SLUG) {
        return "replit";
      }
      if (process.env.PROJECT_DOMAIN) {
        return "glitch";
      }
      if (st(process.env.VERCEL)) {
        return "vercel";
      }
      if (process.env.RAILWAY_ENVIRONMENT_NAME || process.env.RAILWAY_SERVICE_NAME) {
        return "railway";
      }
      if (st(process.env.RENDER)) {
        return "render";
      }
      if (st(process.env.NETLIFY)) {
        return "netlify";
      }
      if (process.env.DYNO) {
        return "heroku";
      }
      if (process.env.FLY_APP_NAME || process.env.FLY_MACHINE_ID) {
        return "fly.io";
      }
      if (st(process.env.CF_PAGES)) {
        return "cloudflare-pages";
      }
      if (process.env.DENO_DEPLOYMENT_ID) {
        return "deno-deploy";
      }
      if (process.env.AWS_LAMBDA_FUNCTION_NAME) {
        return "aws-lambda";
      }
      if (process.env.AWS_EXECUTION_ENV === "AWS_ECS_FARGATE") {
        return "aws-fargate";
      }
      if (process.env.AWS_EXECUTION_ENV === "AWS_ECS_EC2") {
        return "aws-ecs";
      }
      try {
        if (zt().readFileSync("/sys/hypervisor/uuid", {
          encoding: "utf8"
        }).trim().toLowerCase().startsWith("ec2")) {
          return "aws-ec2";
        }
      } catch {}
      if (process.env.K_SERVICE) {
        return "gcp-cloud-run";
      }
      if (process.env.GOOGLE_CLOUD_PROJECT) {
        return "gcp";
      }
      if (process.env.WEBSITE_SITE_NAME || process.env.WEBSITE_SKU) {
        return "azure-app-service";
      }
      if (process.env.AZURE_FUNCTIONS_ENVIRONMENT) {
        return "azure-functions";
      }
      if (process.env.APP_URL?.includes("ondigitalocean.app")) {
        return "digitalocean-app-platform";
      }
      if (process.env.SPACE_CREATOR_USER_ID) {
        return "huggingface-spaces";
      }
      if (st(process.env.GITHUB_ACTIONS)) {
        return "github-actions";
      }
      if (st(process.env.GITLAB_CI)) {
        return "gitlab-ci";
      }
      if (process.env.CIRCLECI) {
        return "circleci";
      }
      if (process.env.BUILDKITE) {
        return "buildkite";
      }
      if (st(false)) {
        return "ci";
      }
      if (process.env.KUBERNETES_SERVICE_HOST) {
        return "kubernetes";
      }
      try {
        if (zt().existsSync("/.dockerenv")) {
          return "docker";
        }
      } catch {}
      if (Vtt.platform === "darwin") {
        return "unknown-darwin";
      }
      if (Vtt.platform === "linux") {
        return "unknown-linux";
      }
      if (Vtt.platform === "win32") {
        return "unknown-win32";
      }
      return "unknown";
    });
    Vtt = {
      hasInternetAccess: pPu,
      probeInternalNetworkAccess: mPu,
      isCI: st(false),
      platform: ["win32", "darwin"].includes("linux") ? "linux" : "linux",
      arch: "arm64",
      nodeVersion: process.version,
      terminal: TPu(),
      isSSH: QCs,
      getPackageManagers: fPu,
      getRuntimes: hPu,
      isRunningWithBun: TEr(X4),
      isWslEnvironment: JCs,
      isNpmFromWindowsPath: bPu,
      isConductor: SPu,
      detectDeploymentEnvironment: XCs
    };
    EPu = new Set(["zsh", "bash", "fish", "sh", "dash", "ash", "ksh", "tcsh", "csh", "nu", "nushell", "pwsh", "powershell", "cmd", "elvish", "xonsh", "ion"]);
  });
  var nMr = {};