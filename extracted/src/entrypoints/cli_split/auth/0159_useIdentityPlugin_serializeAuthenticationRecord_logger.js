  __export(b8, {
    version: () => "3.8.1",
    internals: () => internals,
    UsernamePasswordClient: () => UsernamePasswordClient,
    TokenCacheContext: () => TokenCacheContext,
    TokenCache: () => TokenCache_export,
    ServerError: () => ServerError,
    ResponseMode: () => ResponseMode,
    PublicClientApplication: () => PublicClientApplication,
    ProtocolMode: () => ProtocolMode,
    PromptValue: () => PromptValue,
    OnBehalfOfClient: () => OnBehalfOfClient,
    ManagedIdentitySourceNames: () => ManagedIdentitySourceNames,
    ManagedIdentityApplication: () => ManagedIdentityApplication,
    Logger: () => Logger,
    LogLevel: () => LogLevel,
    InteractionRequiredAuthErrorMessage: () => InteractionRequiredAuthErrorMessage,
    InteractionRequiredAuthErrorCodes: () => InteractionRequiredAuthErrorCodes,
    InteractionRequiredAuthError: () => InteractionRequiredAuthError,
    DistributedCachePlugin: () => DistributedCachePlugin,
    DeviceCodeClient: () => DeviceCodeClient,
    CryptoProvider: () => CryptoProvider,
    ConfidentialClientApplication: () => ConfidentialClientApplication,
    ClientCredentialClient: () => ClientCredentialClient,
    ClientConfigurationErrorMessage: () => ClientConfigurationErrorMessage,
    ClientConfigurationErrorCodes: () => ClientConfigurationErrorCodes,
    ClientConfigurationError: () => ClientConfigurationError,
    ClientAuthErrorMessage: () => ClientAuthErrorMessage,
    ClientAuthErrorCodes: () => ClientAuthErrorCodes,
    ClientAuthError: () => ClientAuthError,
    ClientAssertion: () => ClientAssertion,
    ClientApplication: () => ClientApplication,
    AzureCloudInstance: () => AzureCloudInstance,
    AuthErrorMessage: () => AuthErrorMessage,
    AuthErrorCodes: () => AuthErrorCodes,
    AuthError: () => AuthError
  });
  var qAn = __lazy(() => {
    Uvi();
    oki();
    ski();
    $An();
    HAn();
    PVr();
    OVr();
    Cki();
    AVr();
    UAn();
    W8r();
    Rki();
    PC();
    HUt();
    lS();
    Tit(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var xki = __lazy(() => {
    qAn();
  });
  function Eit(e, t, n) {
    let r = o => (lBt.getToken.info(o), new AuthenticationRequiredError({
      scopes: Array.isArray(e) ? e : [e],
      getTokenOptions: n,
      message: o
    }));
    if (!t) {
      throw r("No response");
    }
    if (!t.expiresOn) {
      throw r('Response had no "expiresOn" property.');
    }
    if (!t.accessToken) {
      throw r('Response had no "accessToken" property.');
    }
  }
  function FVr(e) {
    let t = e === null || e === undefined ? undefined : e.authorityHost;
    if (!t && Bst) {
      t = process.env.AZURE_AUTHORITY_HOST;
    }
    return t !== null && t !== undefined ? t : lFt;
  }
  function UVr(e, t) {
    if (!t) {
      t = lFt;
    }
    if (new RegExp(`${e}/?$`).test(t)) {
      return t;
    }
    if (t.endsWith("/")) {
      return t + e;
    } else {
      return `${t}/${e}`;
    }
  }
  function Aki(e, t, n) {
    if (e === "adfs" && t || n) {
      return [t];
    }
    return [];
  }
  function GAn(e) {
    switch (e) {
      case "error":
        return b8.LogLevel.Error;
      case "info":
        return b8.LogLevel.Info;
      case "verbose":
        return b8.LogLevel.Verbose;
      case "warning":
        return b8.LogLevel.Warning;
      default:
        return b8.LogLevel.Info;
    }
  }
  function e4e(e, t, n) {
    if (t.name === "AuthError" || t.name === "ClientAuthError" || t.name === "BrowserAuthError") {
      let r = t;
      switch (r.errorCode) {
        case "endpoints_resolution_error":
          lBt.info(gg(e, t.message));
          return new CredentialUnavailableError(t.message);
        case "device_code_polling_cancelled":
          return new jst("The authentication has been aborted by the caller.");
        case "consent_required":
        case "interaction_required":
        case "login_required":
          lBt.info(gg(e, `Authentication returned errorCode ${r.errorCode}`));
          break;
        default:
          lBt.info(gg(e, `Failed to acquire token: ${t.message}`));
          break;
      }
    }
    if (t.name === "ClientConfigurationError" || t.name === "BrowserConfigurationAuthError" || t.name === "AbortError" || t.name === "AuthenticationError") {
      return t;
    }
    if (t.name === "NativeAuthError") {
      lBt.info(gg(e, `Error from the native broker: ${t.message} with status code: ${t.statusCode}`));
      return t;
    }
    return new AuthenticationRequiredError({
      scopes: e,
      getTokenOptions: n,
      message: t.message
    });
  }
  function Iki(e) {
    return {
      localAccountId: e.homeAccountId,
      environment: e.authority,
      username: e.username,
      homeAccountId: e.homeAccountId,
      tenantId: e.tenantId
    };
  }
  function Pki(e, t) {
    var n;
    return {
      authority: (n = t.environment) !== null && n !== undefined ? n : "login.microsoftonline.com",
      homeAccountId: t.homeAccountId,
      tenantId: t.tenantId || "common",
      username: t.username,
      clientId: e,
      version: "1.0"
    };
  }
  function serializeAuthenticationRecord(e) {
    return JSON.stringify(e);
  }
  function deserializeAuthenticationRecord(e) {
    let t = JSON.parse(e);
    if (t.version && t.version !== "1.0") {
      throw Error("Unsupported AuthenticationRecord version");
    }
    return t;
  }
  var lBt;
  var WAn = (e, t = Bst ? "Node" : "Browser") => (n, r, o) => {
    if (o) {
      return;
    }
    switch (n) {
      case b8.LogLevel.Error:
        e.info(`MSAL ${t} V2 error: ${r}`);
        return;
      case b8.LogLevel.Info:
        e.info(`MSAL ${t} V2 info message: ${r}`);
        return;
      case b8.LogLevel.Verbose:
        e.info(`MSAL ${t} V2 verbose message: ${r}`);
        return;
      case b8.LogLevel.Warning:
        e.info(`MSAL ${t} V2 warning: ${r}`);
        return;
    }
  };
  var VAn = __lazy(() => {
    XD();
    KT();
    rce();
    M5r();
    xki();
    lBt = om("IdentityUtils");
  });
  function Mki(e) {
    return j5r([{
      name: "imdsRetryPolicy",
      retry: ({
        retryCount: t,
        response: n
      }) => {
        if ((n === null || n === undefined ? undefined : n.status) !== 404) {
          return {
            skipStrategy: true
          };
        }
        return dTi(t, {
          retryDelayInMs: e.startDelayInMs,
          maxRetryDelayInMs: 64000
        });
      }
    }], {
      maxRetries: e.maxRetries
    });
  }
  var Nki = __lazy(() => {
    ace();
  });
  function D1d(e) {
    var t;
    if (!xFt(e)) {
      throw Error(`${"ManagedIdentityCredential - IMDS"}: Multiple scopes are not supported.`);
    }
    let r = new URL("/metadata/identity/oauth2/token", (t = process.env.AZURE_POD_IDENTITY_AUTHORITY_HOST) !== null && t !== undefined ? t : "http://169.254.169.254");
    let o = {
      Accept: "application/json"
    };
    return {
      url: `${r}`,
      method: "GET",
      headers: O_e(o)
    };
  }
  var t4e;
  var BVr;
  var Lki = __lazy(() => {
    ace();
    KT();
    OF();
    t4e = om("ManagedIdentityCredential - IMDS");
    BVr = {
      name: "imdsMsi",
      async isAvailable(e) {
        let {
          scopes: t,
          identityClient: n,
          getTokenOptions: r
        } = e;
        let o = xFt(t);
        if (!o) {
          t4e.info(`${"ManagedIdentityCredential - IMDS"}: Unavailable. Multiple scopes are not supported.`);
          return false;
        }
        if (process.env.AZURE_POD_IDENTITY_AUTHORITY_HOST) {
          return true;
        }
        if (!n) {
          throw Error("Missing IdentityClient");
        }
        let s = D1d(o);
        return xy.withSpan("ManagedIdentityCredential-pingImdsEndpoint", r !== null && r !== undefined ? r : {}, async i => {
          var a;
          var l;
          s.tracingOptions = i.tracingOptions;
          let c = h8(s);
          c.timeout = ((a = i.requestOptions) === null || a === undefined ? undefined : a.timeout) || 1000;
          c.allowInsecureConnection = true;
          let u;
          try {
            t4e.info(`${"ManagedIdentityCredential - IMDS"}: Pinging the Azure IMDS endpoint`);
            u = await n.sendRequest(c);
          } catch (d) {
            if (Wxn(d)) {
              t4e.verbose(`${"ManagedIdentityCredential - IMDS"}: Caught error ${d.name}: ${d.message}`);
            }
            t4e.info(`${"ManagedIdentityCredential - IMDS"}: The Azure IMDS endpoint is unavailable`);
            return false;
          }
          if (u.status === 403) {
            if ((l = u.bodyAsText) === null || l === undefined ? undefined : l.includes("unreachable")) {
              t4e.info(`${"ManagedIdentityCredential - IMDS"}: The Azure IMDS endpoint is unavailable`);
              t4e.info(`${"ManagedIdentityCredential - IMDS"}: ${u.bodyAsText}`);
              return false;
            }
          }
          t4e.info(`${"ManagedIdentityCredential - IMDS"}: The Azure IMDS endpoint is available`);
          return true;
        });
      }
    };
  });
  function zAn(e) {
    var t;
    var n;
    let r = e;
    if (r === undefined && ((n = (t = globalThis.process) === null || t === undefined ? undefined : t.env) === null || n === undefined ? undefined : n.AZURE_REGIONAL_AUTHORITY_NAME) !== undefined) {
      r = process.env.AZURE_REGIONAL_AUTHORITY_NAME;
    }
    if (r === $Vr.AutoDiscoverRegion) {
      return "AUTO_DISCOVER";
    }
    return r;
  }
  var $Vr;
  var Fki = __lazy(() => {
    (function (e) {
      e.AutoDiscoverRegion = "AutoDiscoverRegion";
      e.USWest = "westus";
      e.USWest2 = "westus2";
      e.USCentral = "centralus";
      e.USEast = "eastus";
      e.USEast2 = "eastus2";
      e.USNorthCentral = "northcentralus";
      e.USSouthCentral = "southcentralus";
      e.USWestCentral = "westcentralus";
      e.CanadaCentral = "canadacentral";
      e.CanadaEast = "canadaeast";
      e.BrazilSouth = "brazilsouth";
      e.EuropeNorth = "northeurope";
      e.EuropeWest = "westeurope";
      e.UKSouth = "uksouth";
      e.UKWest = "ukwest";
      e.FranceCentral = "francecentral";
      e.FranceSouth = "francesouth";
      e.SwitzerlandNorth = "switzerlandnorth";
      e.SwitzerlandWest = "switzerlandwest";
      e.GermanyNorth = "germanynorth";
      e.GermanyWestCentral = "germanywestcentral";
      e.NorwayWest = "norwaywest";
      e.NorwayEast = "norwayeast";
      e.AsiaEast = "eastasia";
      e.AsiaSouthEast = "southeastasia";
      e.JapanEast = "japaneast";
      e.JapanWest = "japanwest";
      e.AustraliaEast = "australiaeast";
      e.AustraliaSouthEast = "australiasoutheast";
      e.AustraliaCentral = "australiacentral";
      e.AustraliaCentral2 = "australiacentral2";
      e.IndiaCentral = "centralindia";
      e.IndiaSouth = "southindia";
      e.IndiaWest = "westindia";
      e.KoreaSouth = "koreasouth";
      e.KoreaCentral = "koreacentral";
      e.UAECentral = "uaecentral";
      e.UAENorth = "uaenorth";
      e.SouthAfricaNorth = "southafricanorth";
      e.SouthAfricaWest = "southafricawest";
      e.ChinaNorth = "chinanorth";
      e.ChinaEast = "chinaeast";
      e.ChinaNorth2 = "chinanorth2";
      e.ChinaEast2 = "chinaeast2";
      e.GermanyCentral = "germanycentral";
      e.GermanyNorthEast = "germanynortheast";
      e.GovernmentUSVirginia = "usgovvirginia";
      e.GovernmentUSIowa = "usgoviowa";
      e.GovernmentUSArizona = "usgovarizona";
      e.GovernmentUSTexas = "usgovtexas";
      e.GovernmentUSDodEast = "usdodeast";
      e.GovernmentUSDodCentral = "usdodcentral";
    })($Vr || ($Vr = {}));
  });
  function M1d() {
    try {
      jVr.default.statSync("/.dockerenv");
      return true;
    } catch {
      return false;
    }
  }
  function N1d() {
    try {
      return jVr.default.readFileSync("/proc/self/cgroup", "utf8").includes("docker");
    } catch {
      return false;
    }
  }
  function qVr() {
    if (HVr === undefined) {
      HVr = M1d() || N1d();
    }
    return HVr;
  }
  var jVr;
  var HVr;
  var Uki = __lazy(() => {
    jVr = __toESM(require("fs"));
  });
  function vit() {
    if (WVr === undefined) {
      WVr = L1d() || qVr();
    }
    return WVr;
  }
  var Bki;
  var WVr;
  var L1d = () => {
    try {
      Bki.default.statSync("/run/.containerenv");
      return true;
    } catch {
      return false;
    }
  };
  var GVr = __lazy(() => {
    Uki();
    Bki = __toESM(require("fs"));
  });
  var VVr;
  var Hki;
  var jki;
  var $ki = () => {
    if (VVr.default.platform !== "linux") {
      return false;
    }
    if (Hki.default.release().toLowerCase().includes("microsoft")) {
      if (vit()) {
        return false;
      }
      return true;
    }
    try {
      return jki.default.readFileSync("/proc/version", "utf8").toLowerCase().includes("microsoft") ? !vit() : false;
    } catch {
      return false;
    }
  };
  var eIe;
  var zVr = __lazy(() => {
    GVr();
    VVr = __toESM(require("process"));
    Hki = __toESM(require("os"));
    jki = __toESM(require("fs"));
    eIe = VVr.default.env.__IS_WSL_TEST__ ? $ki : $ki();
  });
  var KVr;
  var cBt;
  var F1d;
  var U1d = async () => `${await F1d()}c/Windows/System32/WindowsPowerShell/v1.0/powershell.exe`;
  var YVr = async () => {
    if (eIe) {
      return U1d();
    }
    return `${KVr.default.env.SYSTEMROOT || KVr.default.env.windir || String.raw`C:\Windows`}\\System32\\WindowsPowerShell\\v1.0\\powershell.exe`;
  };
  var qki = __lazy(() => {
    zVr();
    zVr();
    KVr = __toESM(require("process"));
    cBt = __toESM(require("fs/promises"));
    F1d = (() => {
      let t;
      return async function () {
        if (t) {
          return t;
        }
        let n = "/etc/wsl.conf";
        let r = false;
        try {
          await cBt.default.access(n, cBt.constants.F_OK);
          r = true;
        } catch {}
        if (!r) {
          return "/mnt/";
        }
        let o = await cBt.default.readFile(n, {
          encoding: "utf8"
        });
        let s = /(?<!#.*)root\s*=\s*(?<mountPoint>.*)/g.exec(o);
        if (!s) {
          return "/mnt/";
        }
        t = s.groups.mountPoint.trim();
        t = t.endsWith("/") ? t : `${t}/`;
        return t;
      };
    })();
  });
  function tIe(e, t, n) {
    let r = o => Object.defineProperty(e, t, {
      value: o,
      enumerable: true,
      writable: true
    });
    Object.defineProperty(e, t, {
      configurable: true,
      enumerable: true,
      get() {
        let o = n();
        r(o);
        return o;
      },
      set(o) {
        r(o);
      }
    });
    return e;
  }
  async function JVr() {
    if (Gki.default.platform !== "darwin") {
      throw Error("macOS only");
    }
    let {
      stdout: e
    } = await B1d("defaults", ["read", "com.apple.LaunchServices/com.apple.launchservices.secure", "LSHandlers"]);
    return /LSHandlerRoleAll = "(?!-)(?<id>[^"]+?)";\s+?LSHandlerURLScheme = (?:http|https);/.exec(e)?.groups.id ?? "com.apple.Safari";
  }
  var Wki;
  var Gki;
  var Vki;
  var B1d;
  var zki = __lazy(() => {
    Wki = require("util");
    Gki = __toESM(require("process"));
    Vki = require("child_process");
    B1d = Wki.promisify(Vki.execFile);
  });
  async function Jki(e, {
    humanReadableOutput: t = true,
    signal: n
  } = {}) {
    if (Kki.default.platform !== "darwin") {
      throw Error("macOS only");
    }
    let r = t ? [] : ["-ss"];
    let o = {};
    if (n) {
      o.signal = n;
    }
    let {
      stdout: s
    } = await $1d("osascript", ["-e", e, r], o);
    return s.trim();
  }
  var Kki;
  var Yki;
  var XVr;
  var $1d;
  var Xki = __lazy(() => {
    Kki = __toESM(require("process"));
    Yki = require("util");
    XVr = require("child_process");
    $1d = Yki.promisify(XVr.execFile);
  });
  async function QVr(e) {
    return Jki(`tell application "Finder" to set app_path to application file id "${e}" as string
tell application "System Events" to get value of property list item "CFBundleName" of property list file (app_path & ":Contents:Info.plist")`);
  }
  var Qki = __lazy(() => {
    Xki();
  });
  async function ezr(e = H1d) {
    let {
      stdout: t
    } = await e("reg", ["QUERY", " HKEY_CURRENT_USER\\Software\\Microsoft\\Windows\\Shell\\Associations\\UrlAssociations\\http\\UserChoice", "/v", "ProgId"]);
    let n = /ProgId\s*REG_SZ\s*(?<id>\S+)/.exec(t);
    if (!n) {
      throw new ZVr(`Cannot find Windows browser in stdout: ${JSON.stringify(t)}`);
    }
    let {
      id: r
    } = n.groups;
    let o = j1d[r];
    if (!o) {
      throw new ZVr(`Unknown browser ID: ${r}`);
    }
    return o;
  }
  var Zki;
  var eAi;
  var H1d;
  var j1d;
  var ZVr;
  var tAi = __lazy(() => {
    Zki = require("util");
    eAi = require("child_process");
    H1d = Zki.promisify(eAi.execFile);
    j1d = {
      AppXq0fevzme2pys62n3e0fbqa7peapykr8v: {
        name: "Edge",
        id: "com.microsoft.edge.old"
      },
      MSEdgeDHTML: {
        name: "Edge",
        id: "com.microsoft.edge"
      },
      MSEdgeHTM: {
        name: "Edge",
        id: "com.microsoft.edge"
      },
      "IE.HTTP": {
        name: "Internet Explorer",
        id: "com.microsoft.ie"
      },
      FirefoxURL: {
        name: "Firefox",
        id: "org.mozilla.firefox"
      },
      ChromeHTML: {
        name: "Chrome",
        id: "com.google.chrome"
      },
      BraveHTML: {
        name: "Brave",
        id: "com.brave.Browser"
      },
      BraveBHTML: {
        name: "Brave Beta",
        id: "com.brave.Browser.beta"
      },
      BraveSSHTM: {
        name: "Brave Nightly",
        id: "com.brave.Browser.nightly"
      }
    };
    ZVr = class ZVr extends Error {};
  });
  async function tzr() {
    if (KAn.default.platform === "darwin") {
      let e = await JVr();
      return {
        name: await QVr(e),
        id: e
      };
    }
    if (KAn.default.platform === "linux") {
      let {
        stdout: e
      } = await q1d("xdg-mime", ["query", "default", "x-scheme-handler/http"]);
      let t = e.trim();
      return {
        name: W1d(t.replace(/.desktop$/, "").replace("-", " ")),
        id: t
      };
    }
    if (KAn.default.platform === "win32") {
      return ezr();
    }
    throw Error("Only macOS, Linux, and Windows are supported");
  }
  var nAi;
  var KAn;
  var rAi;
  var q1d;
  var W1d = e => e.toLowerCase().replaceAll(/(?:^|\s|-)\S/g, t => t.toUpperCase());
  var oAi = __lazy(() => {
    zki();
    Qki();
    tAi();
    nAi = require("util");
    KAn = __toESM(require("process"));
    rAi = require("child_process");
    q1d = nAi.promisify(rAi.execFile);
  });
  var dAi = {};
  __export(dAi, {
    openApp: () => openApp,
    default: () => z1d,
    apps: () => apps
  });
  async function V1d() {
    let e = await YVr();
    let t = String.raw`(Get-ItemProperty -Path "HKCU:\Software\Microsoft\Windows\Shell\Associations\UrlAssociations\http\UserChoice").ProgId`;
    let n = rzr.Buffer.from(t, "utf16le").toString("base64");
    let {
      stdout: r
    } = await G1d(e, ["-NoProfile", "-NonInteractive", "-ExecutionPolicy", "Bypass", "-EncodedCommand", n], {
      encoding: "utf8"
    });
    let o = r.trim();
    let s = {
      ChromeHTML: "com.google.chrome",
      BraveHTML: "com.brave.Browser",
      MSEdgeHTM: "com.microsoft.edge",
      FirefoxURL: "org.mozilla.firefox"
    };
    return s[o] ? {
      id: s[o]
    } : {};
  }
  function lAi(e) {
    if (typeof e === "string" || Array.isArray(e)) {
      return e;
    }
    let {
      [iAi]: t
    } = e;
    if (!t) {
      throw Error(`${iAi} is not supported`);
    }
    return t;
  }
  function XAn({
    [wit]: e
  }, {
    wsl: t
  }) {
    if (t && eIe) {
      return lAi(t);
    }
    if (!e) {
      throw Error(`${wit} is not supported`);
    }
    return lAi(e);
  }
  var YAn;
  var rzr;
  var ozr;
  var cAi;
  var uAi;
  var szr;
  var JAn;
  var G1d;
  var nzr;
  var sAi;
  var wit;
  var iAi;
  var aAi = async (e, t) => {
    let n;
    for (let r of e) {
      try {
        return await t(r);
      } catch (o) {
        n = o;
      }
    }
    throw n;
  };
  var uBt = async e => {
    if (e = {
      wait: false,
      background: false,
      newInstance: false,
      allowNonzeroExitCode: false,
      ...e
    }, Array.isArray(e.app)) {
      return aAi(e.app, a => uBt({
        ...e,
        app: a
      }));
    }
    let {
      name: t,
      arguments: n = []
    } = e.app ?? {};
    if (n = [...n], Array.isArray(t)) {
      return aAi(t, a => uBt({
        ...e,
        app: {
          name: a,
          arguments: n
        }
      }));
    }
    if (t === "browser" || t === "browserPrivate") {
      let a = {
        "com.google.chrome": "chrome",
        "google-chrome.desktop": "chrome",
        "com.brave.Browser": "brave",
        "org.mozilla.firefox": "firefox",
        "firefox.desktop": "firefox",
        "com.microsoft.msedge": "edge",
        "com.microsoft.edge": "edge",
        "com.microsoft.edgemac": "edge",
        "microsoft-edge.desktop": "edge"
      };
      let l = {
        chrome: "--incognito",
        brave: "--incognito",
        firefox: "--private-window",
        edge: "--inPrivate"
      };
      let c = eIe ? await V1d() : await tzr();
      if (c.id in a) {
        let u = a[c.id];
        if (t === "browserPrivate") {
          n.push(l[u]);
        }
        return uBt({
          ...e,
          app: {
            name: apps[u],
            arguments: n
          }
        });
      }
      throw Error(`${c.name} is not supported as a default browser`);
    }
    let r;
    let o = [];
    let s = {};
    if (wit === "darwin") {
      if (r = "open", e.wait) {
        o.push("--wait-apps");
      }
      if (e.background) {
        o.push("--background");
      }
      if (e.newInstance) {
        o.push("--new");
      }
      if (t) {
        o.push("-a", t);
      }
    } else if (wit === "win32" || eIe && !vit() && !t) {
      if (r = await YVr(), o.push("-NoProfile", "-NonInteractive", "-ExecutionPolicy", "Bypass", "-EncodedCommand"), !eIe) {
        s.windowsVerbatimArguments = true;
      }
      let a = ["Start"];
      if (e.wait) {
        a.push("-Wait");
      }
      if (t) {
        if (a.push(`"\`"${t}\`""`), e.target) {
          n.push(e.target);
        }
      } else if (e.target) {
        a.push(`"${e.target}"`);
      }
      if (n.length > 0) {
        n = n.map(l => `"\`"${l}\`""`);
        a.push("-ArgumentList", n.join(","));
      }
      e.target = rzr.Buffer.from(a.join(" "), "utf16le").toString("base64");
    } else {
      if (t) {
        r = t;
      } else {
        let a = !nzr || nzr === "/";
        let l = false;
        try {
          await JAn.default.access(sAi, JAn.constants.X_OK);
          l = true;
        } catch {}
        r = YAn.default.versions.electron ?? (wit === "android" || a || !l) ? "xdg-open" : sAi;
      }
      if (n.length > 0) {
        o.push(...n);
      }
      if (!e.wait) {
        s.stdio = "ignore";
        s.detached = true;
      }
    }
    if (wit === "darwin" && n.length > 0) {
      o.push("--args", ...n);
    }
    if (e.target) {
      o.push(e.target);
    }
    let i = szr.default.spawn(r, o, s);
    if (e.wait) {
      return new Promise((a, l) => {
        i.once("error", l);
        i.once("close", c => {
          if (!e.allowNonzeroExitCode && c > 0) {
            l(Error(`Exited with code ${c}`));
            return;
          }
          a(i);
        });
      });
    }
    i.unref();
    return i;
  };
  var z1d = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError("Expected a `target`");
    }
    return uBt({
      ...t,
      target: e
    });
  };
  var openApp = (e, t) => {
    if (typeof e !== "string" && !Array.isArray(e)) {
      throw TypeError("Expected a valid `name`");
    }
    let {
      arguments: n = []
    } = t ?? {};
    if (n !== undefined && n !== null && !Array.isArray(n)) {
      throw TypeError("Expected `appArguments` as Array type");
    }
    return uBt({
      ...t,
      app: {
        name: e,
        arguments: n
      }
    });
  };
  var apps;
  function J1d(e, t, n = {}) {
    var r;
    var o;
    var s;
    let i = Nst((r = n.logger) !== null && r !== undefined ? r : qW, t, e);
    let a = UVr(i, FVr(n));
    let l = new cce(Object.assign(Object.assign({}, n.tokenCredentialOptions), {
      authorityHost: a,
      loggingOptions: n.loggingOptions
    }));
    return {
      auth: {
        clientId: e,
        authority: a,
        knownAuthorities: Aki(i, a, n.disableInstanceDiscovery)
      },
      system: {
        networkClient: l,
        loggerOptions: {
          loggerCallback: WAn((o = n.logger) !== null && o !== undefined ? o : qW),
          logLevel: GAn(xxn()),
          piiLoggingEnabled: (s = n.loggingOptions) === null || s === undefined ? undefined : s.enableUnsafeSupportLogging
        }
      }
    };
  }
  function S2(e, t, n = {}) {
    var r;
    let o = {
      msalConfig: J1d(e, t, n),
      cachedAccount: n.authenticationRecord ? Iki(n.authenticationRecord) : null,
      pluginConfiguration: xbi.generatePluginConfiguration(n),
      logger: (r = n.logger) !== null && r !== undefined ? r : qW
    };
    let s = new Map();
    async function i(E = {}) {
      let C = E.enableCae ? "CAE" : "default";
      let x = s.get(C);
      if (x) {
        o.logger.getToken.info("Existing PublicClientApplication found in cache, returning it.");
        return x;
      }
      o.logger.getToken.info(`Creating new PublicClientApplication with CAE ${E.enableCae ? "enabled" : "disabled"}.`);
      let A = E.enableCae ? o.pluginConfiguration.cache.cachePluginCae : o.pluginConfiguration.cache.cachePlugin;
      o.msalConfig.auth.clientCapabilities = E.enableCae ? ["cp1"] : undefined;
      x = new PublicClientApplication(Object.assign(Object.assign({}, o.msalConfig), {
        broker: {
          nativeBrokerPlugin: o.pluginConfiguration.broker.nativeBrokerPlugin
        },
        cache: {
          cachePlugin: await A
        }
      }));
      s.set(C, x);
      return x;
    }
    let a = new Map();
    async function l(E = {}) {
      let C = E.enableCae ? "CAE" : "default";
      let x = a.get(C);
      if (x) {
        o.logger.getToken.info("Existing ConfidentialClientApplication found in cache, returning it.");
        return x;
      }
      o.logger.getToken.info(`Creating new ConfidentialClientApplication with CAE ${E.enableCae ? "enabled" : "disabled"}.`);
      let A = E.enableCae ? o.pluginConfiguration.cache.cachePluginCae : o.pluginConfiguration.cache.cachePlugin;
      o.msalConfig.auth.clientCapabilities = E.enableCae ? ["cp1"] : undefined;
      x = new ConfidentialClientApplication(Object.assign(Object.assign({}, o.msalConfig), {
        broker: {
          nativeBrokerPlugin: o.pluginConfiguration.broker.nativeBrokerPlugin
        },
        cache: {
          cachePlugin: await A
        }
      }));
      a.set(C, x);
      return x;
    }
    async function c(E, C, x = {}) {
      if (o.cachedAccount === null) {
        throw o.logger.getToken.info("No cached account found in local state."), new AuthenticationRequiredError({
          scopes: C
        });
      }
      if (x.claims) {
        o.cachedClaims = x.claims;
      }
      let A = {
        account: o.cachedAccount,
        scopes: C,
        claims: o.cachedClaims
      };
      if (o.pluginConfiguration.broker.isEnabled) {
        if (A.tokenQueryParameters || (A.tokenQueryParameters = {}), o.pluginConfiguration.broker.enableMsaPassthrough) {
          A.tokenQueryParameters.msal_request_type = "consumer_passthrough";
        }
      }
      if (x.proofOfPossessionOptions) {
        A.shrNonce = x.proofOfPossessionOptions.nonce;
        A.authenticationScheme = "pop";
        A.resourceRequestMethod = x.proofOfPossessionOptions.resourceRequestMethod;
        A.resourceRequestUri = x.proofOfPossessionOptions.resourceRequestUrl;
      }
      o.logger.getToken.info("Attempting to acquire token silently");
      try {
        return await E.acquireTokenSilent(A);
      } catch (k) {
        throw e4e(C, k, x);
      }
    }
    function u(E) {
      if (E === null || E === undefined ? undefined : E.tenantId) {
        return UVr(E.tenantId, FVr(n));
      }
      return o.msalConfig.auth.authority;
    }
    async function d(E, C, x, A) {
      var k;
      var I;
      let O = null;
      try {
        O = await c(E, C, x);
      } catch (M) {
        if (M.name !== "AuthenticationRequiredError") {
          throw M;
        }
        if (x.disableAutomaticAuthentication) {
          throw new AuthenticationRequiredError({
            scopes: C,
            getTokenOptions: x,
            message: "Automatic authentication has been disabled. You may call the authentication() method."
          });
        }
      }
      if (O === null) {
        try {
          O = await A();
        } catch (M) {
          throw e4e(C, M, x);
        }
      }
      Eit(C, O, x);
      o.cachedAccount = (k = O === null || O === undefined ? undefined : O.account) !== null && k !== undefined ? k : null;
      o.logger.getToken.info(zP(C));
      return {
        token: O.accessToken,
        expiresOnTimestamp: O.expiresOn.getTime(),
        refreshAfterTimestamp: (I = O.refreshOn) === null || I === undefined ? undefined : I.getTime(),
        tokenType: O.tokenType
      };
    }
    async function p(E, C, x = {}) {
      var A;
      o.logger.getToken.info("Attempting to acquire token using client secret");
      o.msalConfig.auth.clientSecret = C;
      let k = await l(x);
      try {
        let I = await k.acquireTokenByClientCredential({
          scopes: E,
          authority: u(x),
          azureRegion: zAn(),
          claims: x === null || x === undefined ? undefined : x.claims
        });
        Eit(E, I, x);
        o.logger.getToken.info(zP(E));
        return {
          token: I.accessToken,
          expiresOnTimestamp: I.expiresOn.getTime(),
          refreshAfterTimestamp: (A = I.refreshOn) === null || A === undefined ? undefined : A.getTime(),
          tokenType: I.tokenType
        };
      } catch (I) {
        throw e4e(E, I, x);
      }
    }
    async function m(E, C, x = {}) {
      var A;
      o.logger.getToken.info("Attempting to acquire token using client assertion");
      o.msalConfig.auth.clientAssertion = C;
      let k = await l(x);
      try {
        let I = await k.acquireTokenByClientCredential({
          scopes: E,
          authority: u(x),
          azureRegion: zAn(),
          claims: x === null || x === undefined ? undefined : x.claims,
          clientAssertion: C
        });
        Eit(E, I, x);
        o.logger.getToken.info(zP(E));
        return {
          token: I.accessToken,
          expiresOnTimestamp: I.expiresOn.getTime(),
          refreshAfterTimestamp: (A = I.refreshOn) === null || A === undefined ? undefined : A.getTime(),
          tokenType: I.tokenType
        };
      } catch (I) {
        throw e4e(E, I, x);
      }
    }
    async function f(E, C, x = {}) {
      var A;
      o.logger.getToken.info("Attempting to acquire token using client certificate");
      o.msalConfig.auth.clientCertificate = C;
      let k = await l(x);
      try {
        let I = await k.acquireTokenByClientCredential({
          scopes: E,
          authority: u(x),
          azureRegion: zAn(),
          claims: x === null || x === undefined ? undefined : x.claims
        });
        Eit(E, I, x);
        o.logger.getToken.info(zP(E));
        return {
          token: I.accessToken,
          expiresOnTimestamp: I.expiresOn.getTime(),
          refreshAfterTimestamp: (A = I.refreshOn) === null || A === undefined ? undefined : A.getTime(),
          tokenType: I.tokenType
        };
      } catch (I) {
        throw e4e(E, I, x);
      }
    }
    async function h(E, C, x = {}) {
      o.logger.getToken.info("Attempting to acquire token using device code");
      let A = await i(x);
      return d(A, E, x, () => {
        var k;
        var I;
        let O = {
          scopes: E,
          cancel: (I = (k = x === null || x === undefined ? undefined : x.abortSignal) === null || k === undefined ? undefined : k.aborted) !== null && I !== undefined ? I : false,
          deviceCodeCallback: C,
          authority: u(x),
          claims: x === null || x === undefined ? undefined : x.claims
        };
        let M = A.acquireTokenByDeviceCode(O);
        if (x.abortSignal) {
          x.abortSignal.addEventListener("abort", () => {
            O.cancel = true;
          });
        }
        return M;
      });
    }
    async function g(E, C, x, A = {}) {
      o.logger.getToken.info("Attempting to acquire token using username and password");
      let k = await i(A);
      return d(k, E, A, () => {
        let I = {
          scopes: E,
          username: C,
          password: x,
          authority: u(A),
          claims: A === null || A === undefined ? undefined : A.claims
        };
        return k.acquireTokenByUsernamePassword(I);
      });
    }
    function y() {
      if (!o.cachedAccount) {
        return;
      }
      return Pki(e, o.cachedAccount);
    }
    async function _(E, C, x, A, k = {}) {
      o.logger.getToken.info("Attempting to acquire token using authorization code");
      let I;
      if (A) {
        o.msalConfig.auth.clientSecret = A;
        I = await l(k);
      } else {
        I = await i(k);
      }
      return d(I, E, k, () => I.acquireTokenByCode({
        scopes: E,
        redirectUri: C,
        code: x,
        authority: u(k),
        claims: k === null || k === undefined ? undefined : k.claims
      }));
    }
    async function b(E, C, x, A = {}) {
      var k;
      if (qW.getToken.info("Attempting to acquire token on behalf of another user"), typeof x === "string") {
        qW.getToken.info("Using client secret for on behalf of flow");
        o.msalConfig.auth.clientSecret = x;
      } else if (typeof x === "function") {
        qW.getToken.info("Using client assertion callback for on behalf of flow");
        o.msalConfig.auth.clientAssertion = x;
      } else {
        qW.getToken.info("Using client certificate for on behalf of flow");
        o.msalConfig.auth.clientCertificate = x;
      }
      let I = await l(A);
      try {
        let O = await I.acquireTokenOnBehalfOf({
          scopes: E,
          authority: u(A),
          claims: A.claims,
          oboAssertion: C
        });
        Eit(E, O, A);
        qW.getToken.info(zP(E));
        return {
          token: O.accessToken,
          expiresOnTimestamp: O.expiresOn.getTime(),
          refreshAfterTimestamp: (k = O.refreshOn) === null || k === undefined ? undefined : k.getTime(),
          tokenType: O.tokenType
        };
      } catch (O) {
        throw e4e(E, O, A);
      }
    }
    async function S(E, C = {}) {
      qW.getToken.info("Attempting to acquire token interactively");
      let x = await i(C);
      async function A(I) {
        var O;
        qW.verbose("Authentication will resume through the broker");
        let M = k();
        if (o.pluginConfiguration.broker.parentWindowHandle) {
          M.windowHandle = Buffer.from(o.pluginConfiguration.broker.parentWindowHandle);
        } else {
          qW.warning("Parent window handle is not specified for the broker. This may cause unexpected behavior. Please provide the parentWindowHandle.");
        }
        if (o.pluginConfiguration.broker.enableMsaPassthrough) {
          ((O = M.tokenQueryParameters) !== null && O !== undefined ? O : M.tokenQueryParameters = {}).msal_request_type = "consumer_passthrough";
        }
        if (I) {
          M.prompt = "none";
          qW.verbose("Attempting broker authentication using the default broker account");
        } else {
          qW.verbose("Attempting broker authentication without the default broker account");
        }
        if (C.proofOfPossessionOptions) {
          M.shrNonce = C.proofOfPossessionOptions.nonce;
          M.authenticationScheme = "pop";
          M.resourceRequestMethod = C.proofOfPossessionOptions.resourceRequestMethod;
          M.resourceRequestUri = C.proofOfPossessionOptions.resourceRequestUrl;
        }
        try {
          return await x.acquireTokenInteractive(M);
        } catch (L) {
          if (qW.verbose(`Failed to authenticate through the broker: ${L.message}`), I) {
            return A(false);
          } else {
            throw L;
          }
        }
      }
      function k() {
        var I;
        var O;
        return {
          openBrowser: async M => {
            await (await Promise.resolve().then(() => (pAi(), dAi))).default(M, {
              wait: true,
              newInstance: true
            });
          },
          scopes: E,
          authority: u(C),
          claims: C === null || C === undefined ? undefined : C.claims,
          loginHint: C === null || C === undefined ? undefined : C.loginHint,
          errorTemplate: (I = C === null || C === undefined ? undefined : C.browserCustomizationOptions) === null || I === undefined ? undefined : I.errorMessage,
          successTemplate: (O = C === null || C === undefined ? undefined : C.browserCustomizationOptions) === null || O === undefined ? undefined : O.successMessage,
          prompt: (C === null || C === undefined ? undefined : C.loginHint) ? "login" : "select_account"
        };
      }
      return d(x, E, C, async () => {
        var I;
        let O = k();
        if (o.pluginConfiguration.broker.isEnabled) {
          return A((I = o.pluginConfiguration.broker.useDefaultBrokerAccount) !== null && I !== undefined ? I : false);
        }
        if (C.proofOfPossessionOptions) {
          O.shrNonce = C.proofOfPossessionOptions.nonce;
          O.authenticationScheme = "pop";
          O.resourceRequestMethod = C.proofOfPossessionOptions.resourceRequestMethod;
          O.resourceRequestUri = C.proofOfPossessionOptions.resourceRequestUrl;
        }
        return x.acquireTokenInteractive(O);
      });
    }
    return {
      getActiveAccount: y,
      getTokenByClientSecret: p,
      getTokenByClientAssertion: m,
      getTokenByClientCertificate: f,
      getTokenByDeviceCode: h,
      getTokenByUsernamePassword: g,
      getTokenByAuthorizationCode: _,
      getTokenOnBehalfOf: b,
      getTokenByInteractiveRequest: S
    };
  }
  var qW;
  var ebe = __lazy(() => {
    qAn();
    KT();
    j9r();
    VAn();
    XD();
    AFt();
    Fki();
    Kqe();
    QD();
    qW = om("MsalClient");
  });
  class ClientAssertionCredential {
    constructor(e, t, n, r = {}) {
      if (!e) {
        throw new CredentialUnavailableError("ClientAssertionCredential: tenantId is a required parameter.");
      }
      if (!t) {
        throw new CredentialUnavailableError("ClientAssertionCredential: clientId is a required parameter.");
      }
      if (!n) {
        throw new CredentialUnavailableError("ClientAssertionCredential: clientAssertion is a required parameter.");
      }
      this.tenantId = e;
      this.additionallyAllowedTenantIds = ex(r === null || r === undefined ? undefined : r.additionallyAllowedTenants);
      this.options = r;
      this.getAssertion = n;
      this.msalClient = S2(t, e, Object.assign(Object.assign({}, r), {
        logger: mAi,
        tokenCredentialOptions: this.options
      }));
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async n => {
        n.tenantId = kC(this.tenantId, n, this.additionallyAllowedTenantIds, mAi);
        let r = Array.isArray(e) ? e : [e];
        return this.msalClient.getTokenByClientAssertion(r, this.getAssertion, n);
      });
    }
  }
  var mAi;
  var QAn = __lazy(() => {
    ebe();
    QD();
    XD();
    KT();
    OF();
    mAi = om("ClientAssertionCredential");
  });
  class WorkloadIdentityCredential {
    constructor(e) {
      this.azureFederatedTokenFileContent = undefined;
      this.cacheDate = undefined;
      let t = kxn(X1d).assigned.join(", ");
      dBt.info(`Found the following environment variables: ${t}`);
      let n = e !== null && e !== undefined ? e : {};
      let r = n.tenantId || process.env.AZURE_TENANT_ID;
      let o = n.clientId || process.env.AZURE_CLIENT_ID;
      if (this.federatedTokenFilePath = n.tokenFilePath || process.env.AZURE_FEDERATED_TOKEN_FILE, r) {
        KP(dBt, r);
      }
      if (!o) {
        throw new CredentialUnavailableError(`${"WorkloadIdentityCredential"}: is unavailable. clientId is a required parameter. In DefaultAzureCredential and ManagedIdentityCredential, this can be provided as an environment variable - "AZURE_CLIENT_ID".
        See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/workloadidentitycredential/troubleshoot`);
      }
      if (!r) {
        throw new CredentialUnavailableError(`${"WorkloadIdentityCredential"}: is unavailable. tenantId is a required parameter. In DefaultAzureCredential and ManagedIdentityCredential, this can be provided as an environment variable - "AZURE_TENANT_ID".
        See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/workloadidentitycredential/troubleshoot`);
      }
      if (!this.federatedTokenFilePath) {
        throw new CredentialUnavailableError(`${"WorkloadIdentityCredential"}: is unavailable. federatedTokenFilePath is a required parameter. In DefaultAzureCredential and ManagedIdentityCredential, this can be provided as an environment variable - "AZURE_FEDERATED_TOKEN_FILE".
        See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/workloadidentitycredential/troubleshoot`);
      }
      dBt.info(`Invoking ClientAssertionCredential with tenant ID: ${r}, clientId: ${n.clientId} and federated token path: [REDACTED]`);
      this.client = new ClientAssertionCredential(r, o, this.readFileContents.bind(this), e);
    }
    async getToken(e, t) {
      if (!this.client) {
        let n = `${"WorkloadIdentityCredential"}: is unavailable. tenantId, clientId, and federatedTokenFilePath are required parameters. 
      In DefaultAzureCredential and ManagedIdentityCredential, these can be provided as environment variables - 
      "AZURE_TENANT_ID",
      "AZURE_CLIENT_ID",
      "AZURE_FEDERATED_TOKEN_FILE". See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/workloadidentitycredential/troubleshoot`;
        throw dBt.info(n), new CredentialUnavailableError(n);
      }
      dBt.info("Invoking getToken() of Client Assertion Credential");
      return this.client.getToken(e, t);
    }
    async readFileContents() {
      if (this.cacheDate !== undefined && Date.now() - this.cacheDate >= 300000) {
        this.azureFederatedTokenFileContent = undefined;
      }
      if (!this.federatedTokenFilePath) {
        throw new CredentialUnavailableError(`${"WorkloadIdentityCredential"}: is unavailable. Invalid file path provided ${this.federatedTokenFilePath}.`);
      }
      if (!this.azureFederatedTokenFileContent) {
        let t = (await fAi.readFile(this.federatedTokenFilePath, "utf8")).trim();
        if (!t) {
          throw new CredentialUnavailableError(`${"WorkloadIdentityCredential"}: is unavailable. No content on the file ${this.federatedTokenFilePath}.`);
        } else {
          this.azureFederatedTokenFileContent = t;
          this.cacheDate = Date.now();
        }
      }
      return this.azureFederatedTokenFileContent;
    }
  }
  var fAi;
  var X1d;
  var dBt;
  var ZAn = __lazy(() => {
    KT();
    QAn();
    XD();
    QD();
    fAi = require("fs/promises");
    X1d = ["AZURE_TENANT_ID", "AZURE_CLIENT_ID", "AZURE_FEDERATED_TOKEN_FILE"];
    dBt = om("WorkloadIdentityCredential");
  });
  var Q1d;
  var izr;
  var gAi = __lazy(() => {
    ZAn();
    KT();
    Q1d = om("ManagedIdentityCredential - Token Exchange");
    izr = {
      name: "tokenExchangeMsi",
      async isAvailable(e) {
        let t = process.env;
        let n = Boolean((e || t.AZURE_CLIENT_ID) && t.AZURE_TENANT_ID && process.env.AZURE_FEDERATED_TOKEN_FILE);
        if (!n) {
          Q1d.info(`${"ManagedIdentityCredential - Token Exchange"}: Unavailable. The environment variables needed are: AZURE_CLIENT_ID (or the client ID sent through the parameters), AZURE_TENANT_ID and AZURE_FEDERATED_TOKEN_FILE`);
        }
        return n;
      },
      async getToken(e, t = {}) {
        let {
          scopes: n,
          clientId: r
        } = e;
        let o = {};
        return new WorkloadIdentityCredential(Object.assign(Object.assign({
          clientId: r,
          tenantId: process.env.AZURE_TENANT_ID,
          tokenFilePath: process.env.AZURE_FEDERATED_TOKEN_FILE
        }, o), {
          disableInstanceDiscovery: true
        })).getToken(n, t);
      }
    };
  });
  class ManagedIdentityCredential {
    constructor(e, t) {
      var n;
      var r;
      this.msiRetryConfig = {
        maxRetries: 5,
        startDelayInMs: 800,
        intervalIncrement: 2
      };
      let o;
      if (typeof e === "string") {
        this.clientId = e;
        o = t !== null && t !== undefined ? t : {};
      } else {
        this.clientId = e === null || e === undefined ? undefined : e.clientId;
        o = e !== null && e !== undefined ? e : {};
      }
      this.resourceId = o === null || o === undefined ? undefined : o.resourceId;
      this.objectId = o === null || o === undefined ? undefined : o.objectId;
      let s = [{
        key: "clientId",
        value: this.clientId
      }, {
        key: "resourceId",
        value: this.resourceId
      }, {
        key: "objectId",
        value: this.objectId
      }].filter(a => a.value);
      if (s.length > 1) {
        throw Error(`ManagedIdentityCredential: only one of 'clientId', 'resourceId', or 'objectId' can be provided. Received values: ${JSON.stringify({
          clientId: this.clientId,
          resourceId: this.resourceId,
          objectId: this.objectId
        })}`);
      }
      if (o.allowInsecureConnection = true, ((n = o.retryOptions) === null || n === undefined ? undefined : n.maxRetries) !== undefined) {
        this.msiRetryConfig.maxRetries = o.retryOptions.maxRetries;
      }
      this.identityClient = new cce(Object.assign(Object.assign({}, o), {
        additionalPolicies: [{
          policy: Mki(this.msiRetryConfig),
          position: "perCall"
        }]
      }));
      this.managedIdentityApp = new ManagedIdentityApplication({
        managedIdentityIdParams: {
          userAssignedClientId: this.clientId,
          userAssignedResourceId: this.resourceId,
          userAssignedObjectId: this.objectId
        },
        system: {
          disableInternalRetries: true,
          networkClient: this.identityClient,
          loggerOptions: {
            logLevel: GAn(xxn()),
            piiLoggingEnabled: (r = o.loggingOptions) === null || r === undefined ? undefined : r.enableUnsafeSupportLogging,
            loggerCallback: WAn(S8)
          }
        }
      });
      this.isAvailableIdentityClient = new cce(Object.assign(Object.assign({}, o), {
        retryOptions: {
          maxRetries: 0
        }
      }));
      let i = this.managedIdentityApp.getManagedIdentitySource();
      if (i === "CloudShell") {
        if (this.clientId || this.resourceId || this.objectId) {
          throw S8.warning(`CloudShell MSI detected with user-provided IDs - throwing. Received values: ${JSON.stringify({
            clientId: this.clientId,
            resourceId: this.resourceId,
            objectId: this.objectId
          })}.`), new CredentialUnavailableError("ManagedIdentityCredential: Specifying a user-assigned managed identity is not supported for CloudShell at runtime. When using Managed Identity in CloudShell, omit the clientId, resourceId, and objectId parameters.");
        }
      }
      if (i === "ServiceFabric") {
        if (this.clientId || this.resourceId || this.objectId) {
          throw S8.warning(`Service Fabric detected with user-provided IDs - throwing. Received values: ${JSON.stringify({
            clientId: this.clientId,
            resourceId: this.resourceId,
            objectId: this.objectId
          })}.`), new CredentialUnavailableError(`ManagedIdentityCredential: ${"Specifying a `clientId` or `resourceId` is not supported by the Service Fabric managed identity environment. The managed identity configuration is determined by the Service Fabric cluster resource configuration. See https://aka.ms/servicefabricmi for more information"}`);
        }
      }
      if (S8.info(`Using ${i} managed identity.`), s.length === 1) {
        let {
          key: a,
          value: l
        } = s[0];
        S8.info(`${i} with ${a}: ${l}`);
      }
    }
    async getToken(e, t = {}) {
      S8.getToken.info("Using the MSAL provider for Managed Identity.");
      let n = xFt(e);
      if (!n) {
        throw new CredentialUnavailableError(`ManagedIdentityCredential: Multiple scopes are not supported. Scopes: ${JSON.stringify(e)}`);
      }
      return xy.withSpan("ManagedIdentityCredential.getToken", t, async () => {
        var r;
        try {
          let o = await izr.isAvailable(this.clientId);
          let s = this.managedIdentityApp.getManagedIdentitySource();
          let i = s === "DefaultToImds" || s === "Imds";
          if (S8.getToken.info(`MSAL Identity source: ${s}`), o) {
            S8.getToken.info("Using the token exchange managed identity.");
            let l = await izr.getToken({
              scopes: e,
              clientId: this.clientId,
              identityClient: this.identityClient,
              retryConfig: this.msiRetryConfig,
              resourceId: this.resourceId
            });
            if (l === null) {
              throw new CredentialUnavailableError("Attempted to use the token exchange managed identity, but received a null response.");
            }
            return l;
          } else if (i) {
            if (S8.getToken.info("Using the IMDS endpoint to probe for availability."), !(await BVr.isAvailable({
              scopes: e,
              clientId: this.clientId,
              getTokenOptions: t,
              identityClient: this.isAvailableIdentityClient,
              resourceId: this.resourceId
            }))) {
              throw new CredentialUnavailableError("Attempted to use the IMDS endpoint, but it is not available.");
            }
          }
          S8.getToken.info("Calling into MSAL for managed identity token.");
          let a = await this.managedIdentityApp.acquireToken({
            resource: n
          });
          this.ensureValidMsalToken(e, a, t);
          S8.getToken.info(zP(e));
          return {
            expiresOnTimestamp: a.expiresOn.getTime(),
            token: a.accessToken,
            refreshAfterTimestamp: (r = a.refreshOn) === null || r === undefined ? undefined : r.getTime(),
            tokenType: "Bearer"
          };
        } catch (o) {
          if (S8.getToken.error(gg(e, o)), o.name === "AuthenticationRequiredError") {
            throw o;
          }
          if (Z1d(o)) {
            throw new CredentialUnavailableError(`ManagedIdentityCredential: Network unreachable. Message: ${o.message}`, {
              cause: o
            });
          }
          throw new CredentialUnavailableError(`ManagedIdentityCredential: Authentication failed. Message ${o.message}`, {
            cause: o
          });
        }
      });
    }
    ensureValidMsalToken(e, t, n) {
      let r = o => (S8.getToken.info(o), new AuthenticationRequiredError({
        scopes: Array.isArray(e) ? e : [e],
        getTokenOptions: n,
        message: o
      }));
      if (!t) {
        throw r("No response.");
      }
      if (!t.expiresOn) {
        throw r('Response had no "expiresOn" property.');
      }
      if (!t.accessToken) {
        throw r('Response had no "accessToken" property.');
      }
    }
  }
  function Z1d(e) {
    if (e.errorCode === "network_error") {
      return true;
    }
    if (e.code === "ENETUNREACH" || e.code === "EHOSTUNREACH") {
      return true;
    }
    if (e.statusCode === 403 || e.code === 403) {
      if (e.message.includes("unreachable")) {
        return true;
      }
    }
    return false;
  }
  var S8;
  var azr = __lazy(() => {
    Kqe();
    qAn();
    AFt();
    XD();
    VAn();
    Nki();
    KT();
    OF();
    Lki();
    gAi();
    S8 = om("ManagedIdentityCredential");
  });
  function T8(e) {
    return Array.isArray(e) ? e : [e];
  }
  function Cit(e, t) {
    if (!e.match(/^[0-9a-zA-Z-_.:/]+$/)) {
      let n = Error("Invalid scope was specified by the user or calling client");
      throw t.getToken.info(gg(e, n)), n;
    }
  }
  function e0n(e) {
    return e.replace(/\/.default$/, "");
  }
  var bce = __lazy(() => {
    KT();
  });
  function lzr(e, t) {
    if (!t.match(/^[0-9a-zA-Z-._ ]+$/)) {
      let n = Error("Invalid subscription provided. You can locate your subscription by following the instructions listed here: https://learn.microsoft.com/azure/azure-portal/get-subscription-tenant-id.");
      throw e.info(gg("", n)), n;
    }
  }
  var yAi = __lazy(() => {
    KT();
  });
  class AzureCliCredential {
    constructor(e) {
      if (e === null || e === undefined ? undefined : e.tenantId) {
        KP(Ane, e === null || e === undefined ? undefined : e.tenantId);
        this.tenantId = e === null || e === undefined ? undefined : e.tenantId;
      }
      if (e === null || e === undefined ? undefined : e.subscription) {
        lzr(Ane, e === null || e === undefined ? undefined : e.subscription);
        this.subscription = e === null || e === undefined ? undefined : e.subscription;
      }
      this.additionallyAllowedTenantIds = ex(e === null || e === undefined ? undefined : e.additionallyAllowedTenants);
      this.timeout = e === null || e === undefined ? undefined : e.processTimeoutInMs;
    }
    async getToken(e, t = {}) {
      let n = kC(this.tenantId, t, this.additionallyAllowedTenantIds);
      if (n) {
        KP(Ane, n);
      }
      if (this.subscription) {
        lzr(Ane, this.subscription);
      }
      let r = typeof e === "string" ? e : e[0];
      Ane.getToken.info(`Using the scope ${r}`);
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async () => {
        var o;
        var s;
        var i;
        var a;
        try {
          Cit(r, Ane);
          let l = e0n(r);
          let c = await bAi.getAzureCliAccessToken(l, n, this.subscription, this.timeout);
          let u = (o = c.stderr) === null || o === undefined ? undefined : o.match("(.*)az login --scope(.*)");
          let d = ((s = c.stderr) === null || s === undefined ? undefined : s.match("(.*)az login(.*)")) && !u;
          if (((i = c.stderr) === null || i === undefined ? undefined : i.match("az:(.*)not found")) || ((a = c.stderr) === null || a === undefined ? undefined : a.startsWith("'az' is not recognized"))) {
            let m = new CredentialUnavailableError("Azure CLI could not be found. Please visit https://aka.ms/azure-cli for installation instructions and then, once installed, authenticate to your Azure account using 'az login'.");
            throw Ane.getToken.info(gg(e, m)), m;
          }
          if (d) {
            let m = new CredentialUnavailableError("Please run 'az login' from a command prompt to authenticate before using this credential.");
            throw Ane.getToken.info(gg(e, m)), m;
          }
          try {
            let m = c.stdout;
            let f = this.parseRawResponse(m);
            Ane.getToken.info(zP(e));
            return f;
          } catch (m) {
            if (c.stderr) {
              throw new CredentialUnavailableError(c.stderr);
            }
            throw m;
          }
        } catch (l) {
          let c = l.name === "CredentialUnavailableError" ? l : new CredentialUnavailableError(l.message || "Unknown error while trying to retrieve the access token");
          throw Ane.getToken.info(gg(e, c)), c;
        }
      });
    }
    parseRawResponse(e) {
      let t = JSON.parse(e);
      let n = t.accessToken;
      let r = Number.parseInt(t.expires_on, 10) * 1000;
      if (!isNaN(r)) {
        Ane.getToken.info("expires_on is available and is valid, using it");
        return {
          token: n,
          expiresOnTimestamp: r,
          tokenType: "Bearer"
        };
      }
      if (r = new Date(t.expiresOn).getTime(), isNaN(r)) {
        throw new CredentialUnavailableError(`Unexpected response from Azure CLI when getting token. Expected "expiresOn" to be a RFC3339 date string. Got: "${t.expiresOn}"`);
      }
      return {
        token: n,
        expiresOnTimestamp: r,
        tokenType: "Bearer"
      };
    }
  }
  var _Ai;
  var Ane;
  var bAi;
  var czr = __lazy(() => {
    QD();
    KT();
    bce();
    XD();
    OF();
    yAi();
    _Ai = __toESM(require("child_process"));
    Ane = om("AzureCliCredential");
    bAi = {
      getSafeWorkingDir() {
        return "/bin";
      },
      async getAzureCliAccessToken(e, t, n, r) {
        let o = [];
        let s = [];
        if (t) {
          o = ["--tenant", t];
        }
        if (n) {
          s = ["--subscription", `"${n}"`];
        }
        return new Promise((i, a) => {
          try {
            _Ai.default.execFile("az", ["account", "get-access-token", "--output", "json", "--resource", e, ...o, ...s], {
              cwd: bAi.getSafeWorkingDir(),
              shell: true,
              timeout: r
            }, (l, c, u) => {
              i({
                stdout: c,
                stderr: u,
                error: l
              });
            });
          } catch (l) {
            a(l);
          }
        });
      }
    };
  });
  class AzureDeveloperCliCredential {
    constructor(e) {
      if (e === null || e === undefined ? undefined : e.tenantId) {
        KP(oIe, e === null || e === undefined ? undefined : e.tenantId);
        this.tenantId = e === null || e === undefined ? undefined : e.tenantId;
      }
      this.additionallyAllowedTenantIds = ex(e === null || e === undefined ? undefined : e.additionallyAllowedTenants);
      this.timeout = e === null || e === undefined ? undefined : e.processTimeoutInMs;
    }
    async getToken(e, t = {}) {
      let n = kC(this.tenantId, t, this.additionallyAllowedTenantIds);
      if (n) {
        KP(oIe, n);
      }
      let r;
      if (typeof e === "string") {
        r = [e];
      } else {
        r = e;
      }
      oIe.getToken.info(`Using the scopes ${e}`);
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async () => {
        var o;
        var s;
        var i;
        var a;
        try {
          r.forEach(d => {
            Cit(d, oIe);
          });
          let l = await TAi.getAzdAccessToken(r, n, this.timeout);
          let c = ((o = l.stderr) === null || o === undefined ? undefined : o.match("not logged in, run `azd login` to login")) || ((s = l.stderr) === null || s === undefined ? undefined : s.match("not logged in, run `azd auth login` to login"));
          if (((i = l.stderr) === null || i === undefined ? undefined : i.match("azd:(.*)not found")) || ((a = l.stderr) === null || a === undefined ? undefined : a.startsWith("'azd' is not recognized")) || l.error && l.error.code === "ENOENT") {
            let d = new CredentialUnavailableError("Azure Developer CLI couldn't be found. To mitigate this issue, see the troubleshooting guidelines at https://aka.ms/azsdk/js/identity/azdevclicredential/troubleshoot.");
            throw oIe.getToken.info(gg(e, d)), d;
          }
          if (c) {
            let d = new CredentialUnavailableError("Please run 'azd auth login' from a command prompt to authenticate before using this credential. For more information, see the troubleshooting guidelines at https://aka.ms/azsdk/js/identity/azdevclicredential/troubleshoot.");
            throw oIe.getToken.info(gg(e, d)), d;
          }
          try {
            let d = JSON.parse(l.stdout);
            oIe.getToken.info(zP(e));
            return {
              token: d.token,
              expiresOnTimestamp: new Date(d.expiresOn).getTime(),
              tokenType: "Bearer"
            };
          } catch (d) {
            if (l.stderr) {
              throw new CredentialUnavailableError(l.stderr);
            }
            throw d;
          }
        } catch (l) {
          let c = l.name === "CredentialUnavailableError" ? l : new CredentialUnavailableError(l.message || "Unknown error while trying to retrieve the access token");
          throw oIe.getToken.info(gg(e, c)), c;
        }
      });
    }
  }
  var SAi;
  var oIe;
  var TAi;
  var uzr = __lazy(() => {
    KT();
    XD();
    QD();
    OF();
    bce();
    SAi = __toESM(require("child_process"));
    oIe = om("AzureDeveloperCliCredential");
    TAi = {
      getSafeWorkingDir() {
        return "/bin";
      },
      async getAzdAccessToken(e, t, n) {
        let r = [];
        if (t) {
          r = ["--tenant-id", t];
        }
        return new Promise((o, s) => {
          try {
            SAi.default.execFile("azd", ["auth", "token", "--output", "json", ...e.reduce((i, a) => i.concat("--scope", a), []), ...r], {
              cwd: TAi.getSafeWorkingDir(),
              timeout: n
            }, (i, a, l) => {
              o({
                stdout: a,
                stderr: l,
                error: i
              });
            });
          } catch (i) {
            s(i);
          }
        });
      }
    };
  });
  var EAi;
  var vAi;
  var wAi = __lazy(() => {
    EAi = __toESM(require("child_process"));
    vAi = {
      execFile(e, t, n) {
        return new Promise((r, o) => {
          EAi.execFile(e, t, n, (s, i, a) => {
            if (Buffer.isBuffer(i)) {
              i = i.toString("utf8");
            }
            if (Buffer.isBuffer(a)) {
              a = a.toString("utf8");
            }
            if (a || s) {
              o(a ? Error(a) : s);
            } else {
              r(i);
            }
          });
        });
      }
    };
  });
  function xAi(e) {
    if (false) {
      return `${e}.exe`;
    } else {
      return e;
    }
  }
  async function CAi(e, t) {
    let n = [];
    for (let r of e) {
      let [o, ...s] = r;
      let i = await vAi.execFile(o, s, {
        encoding: "utf8",
        timeout: t
      });
      n.push(i);
    }
    return n;
  }
  class AzurePowerShellCredential {
    constructor(e) {
      if (e === null || e === undefined ? undefined : e.tenantId) {
        KP(nbe, e === null || e === undefined ? undefined : e.tenantId);
        this.tenantId = e === null || e === undefined ? undefined : e.tenantId;
      }
      this.additionallyAllowedTenantIds = ex(e === null || e === undefined ? undefined : e.additionallyAllowedTenants);
      this.timeout = e === null || e === undefined ? undefined : e.processTimeoutInMs;
    }
    async getAzurePowerShellAccessToken(e, t, n) {
      for (let r of [...pzr]) {
        try {
          await CAi([[r, "/?"]], n);
        } catch (i) {
          pzr.shift();
          continue;
        }
        let s = (await CAi([[r, "-NoProfile", "-NonInteractive", "-Command", `
          $tenantId = "${t !== null && t !== undefined ? t : ""}"
          $m = Import-Module Az.Accounts -MinimumVersion 2.2.0 -PassThru
          $useSecureString = $m.Version -ge [version]'2.17.0'

          $params = @{
            ResourceUrl = "${e}"
          }

          if ($tenantId.Length -gt 0) {
            $params["TenantId"] = $tenantId
          }

          if ($useSecureString) {
            $params["AsSecureString"] = $true
          }

          $token = Get-AzAccessToken @params

          $result = New-Object -TypeName PSObject
          $result | Add-Member -MemberType NoteProperty -Name ExpiresOn -Value $token.ExpiresOn
          if ($useSecureString) {
            $result | Add-Member -MemberType NoteProperty -Name Token -Value (ConvertFrom-SecureString -AsPlainText $token.Token)
          } else {
            $result | Add-Member -MemberType NoteProperty -Name Token -Value $token.Token
          }

          Write-Output (ConvertTo-Json $result)
          `]]))[0];
        return nLd(s);
      }
      throw Error("Unable to execute PowerShell. Ensure that it is installed in your system");
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async () => {
        let n = kC(this.tenantId, t, this.additionallyAllowedTenantIds);
        let r = typeof e === "string" ? e : e[0];
        if (n) {
          KP(nbe, n);
        }
        try {
          Cit(r, nbe);
          nbe.getToken.info(`Using the scope ${r}`);
          let o = e0n(r);
          let s = await this.getAzurePowerShellAccessToken(o, n, this.timeout);
          nbe.getToken.info(zP(e));
          return {
            token: s.Token,
            expiresOnTimestamp: new Date(s.ExpiresOn).getTime(),
            tokenType: "Bearer"
          };
        } catch (o) {
          if (tLd(o)) {
            let i = new CredentialUnavailableError(dzr.installed);
            throw nbe.getToken.info(gg(r, i)), i;
          } else if (eLd(o)) {
            let i = new CredentialUnavailableError(dzr.login);
            throw nbe.getToken.info(gg(r, i)), i;
          }
          let s = new CredentialUnavailableError(`${o}. ${dzr.troubleshoot}`);
          throw nbe.getToken.info(gg(r, s)), s;
        }
      });
    }
  }
  async function nLd(e) {
    let t = /{[^{}]*}/g;
    let n = e.match(t);
    let r = e;
    if (n) {
      try {
        for (let o of n) {
          try {
            let s = JSON.parse(o);
            if (s === null || s === undefined ? undefined : s.Token) {
              if (r = r.replace(o, ""), r) {
                nbe.getToken.warning(r);
              }
              return s;
            }
          } catch (s) {
            continue;
          }
        }
      } catch (o) {
        throw Error(`Unable to parse the output of PowerShell. Received output: ${e}`);
      }
    }
    throw Error(`No access token found in the output. Received output: ${e}`);
  }
  var nbe;
  var kAi;
  var dzr;
  var eLd = e => e.message.match(`(.*)${kAi.login}(.*)`);
  var tLd = e => e.message.match(kAi.installed);
  var pzr;
  var mzr = __lazy(() => {
    QD();
    KT();
    bce();
    XD();
    wAi();
    OF();
    nbe = om("AzurePowerShellCredential");
    kAi = {
      login: "Run Connect-AzAccount to login",
      installed: "The specified module 'Az.Accounts' with version '2.2.0' was not loaded because no valid module file was found in any module directory"
    };
    dzr = {
      login: "Please run 'Connect-AzAccount' from PowerShell to authenticate before using this credential.",
      installed: `The 'Az.Account' module >= 2.2.0 is not installed. Install the Azure Az PowerShell module with: "Install-Module -Name Az -Scope CurrentUser -Repository PSGallery -Force".`,
      troubleshoot: "To troubleshoot, visit https://aka.ms/azsdk/js/identity/powershellcredential/troubleshoot."
    };
    pzr = [xAi("pwsh")];
    if (false) {
      pzr.push(xAi("powershell"));
    }
  });
  class ChainedTokenCredential {
    constructor(...e) {
      this._sources = [];
      this._sources = e;
    }
    async getToken(e, t = {}) {
      let {
        token: n
      } = await this.getTokenInternal(e, t);
      return n;
    }
    async getTokenInternal(e, t = {}) {
      let n = null;
      let r;
      let o = [];
      return xy.withSpan("ChainedTokenCredential.getToken", t, async s => {
        for (let i = 0; i < this._sources.length && n === null; i++) {
          try {
            n = await this._sources[i].getToken(e, s);
            r = this._sources[i];
          } catch (a) {
            if (a.name === "CredentialUnavailableError" || a.name === "AuthenticationRequiredError") {
              o.push(a);
            } else {
              throw fzr.getToken.info(gg(e, a)), a;
            }
          }
        }
        if (!n && o.length > 0) {
          let i = new AggregateAuthenticationError(o, "ChainedTokenCredential authentication failed.");
          throw fzr.getToken.info(gg(e, i)), i;
        }
        if (fzr.getToken.info(`Result for ${r.constructor.name}: ${zP(e)}`), n === null) {
          throw new CredentialUnavailableError("Failed to retrieve a valid token");
        }
        return {
          token: n,
          successfulCredential: r
        };
      });
    }
  }
  var fzr;
  var hzr = __lazy(() => {
    XD();
    KT();
    OF();
    fzr = om("ChainedTokenCredential");
  });
  class ClientCertificateCredential {
    constructor(e, t, n, r = {}) {
      if (!e || !t) {
        throw Error(`${"ClientCertificateCredential"}: tenantId and clientId are required parameters.`);
      }
      this.tenantId = e;
      this.additionallyAllowedTenantIds = ex(r === null || r === undefined ? undefined : r.additionallyAllowedTenants);
      this.sendCertificateChain = r.sendCertificateChain;
      this.certificateConfiguration = Object.assign({}, typeof n === "string" ? {
        certificatePath: n
      } : n);
      let o = this.certificateConfiguration.certificate;
      let s = this.certificateConfiguration.certificatePath;
      if (!this.certificateConfiguration || !(o || s)) {
        throw Error(`${"ClientCertificateCredential"}: Provide either a PEM certificate in string form, or the path to that certificate in the filesystem. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.`);
      }
      if (o && s) {
        throw Error(`${"ClientCertificateCredential"}: To avoid unexpected behaviors, providing both the contents of a PEM certificate and the path to a PEM certificate is forbidden. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.`);
      }
      this.msalClient = S2(t, e, Object.assign(Object.assign({}, r), {
        logger: AAi,
        tokenCredentialOptions: r
      }));
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${"ClientCertificateCredential"}.getToken`, t, async n => {
        n.tenantId = kC(this.tenantId, n, this.additionallyAllowedTenantIds, AAi);
        let r = Array.isArray(e) ? e : [e];
        let o = await this.buildClientCertificate();
        return this.msalClient.getTokenByClientCertificate(r, o, n);
      });
    }
    async buildClientCertificate() {
      var e;
      let t = await rLd(this.certificateConfiguration, (e = this.sendCertificateChain) !== null && e !== undefined ? e : false);
      let n;
      if (this.certificateConfiguration.certificatePassword !== undefined) {
        n = yBt.createPrivateKey({
          key: t.certificateContents,
          passphrase: this.certificateConfiguration.certificatePassword,
          format: "pem"
        }).export({
          format: "pem",
          type: "pkcs8"
        }).toString();
      } else {
        n = t.certificateContents;
      }
      return {
        thumbprint: t.thumbprint,
        thumbprintSha256: t.thumbprintSha256,
        privateKey: n,
        x5c: t.x5c
      };
    }
  }
  async function rLd(e, t) {
    let {
      certificate: n,
      certificatePath: r
    } = e;
    let o = n || (await IAi.readFile(r, "utf8"));
    let s = t ? o : undefined;
    let i = /(-+BEGIN CERTIFICATE-+)(\n\r?|\r\n?)([A-Za-z0-9+/\n\r]+=*)(\n\r?|\r\n?)(-+END CERTIFICATE-+)/g;
    let a = [];
    let l;
    do {
      if (l = i.exec(o), l) {
        a.push(l[3]);
      }
    } while (l);
    if (a.length === 0) {
      throw Error("The file at the specified path does not contain a PEM-encoded certificate.");
    }
    let c = yBt.createHash("sha1").update(Buffer.from(a[0], "base64")).digest("hex").toUpperCase();
    let u = yBt.createHash("sha256").update(Buffer.from(a[0], "base64")).digest("hex").toUpperCase();
    return {
      certificateContents: o,
      thumbprintSha256: u,
      thumbprint: c,
      x5c: s
    };
  }
  var yBt;
  var IAi;
  var AAi;
  var gzr = __lazy(() => {
    ebe();
    QD();
    KT();
    OF();
    yBt = require("crypto");
    IAi = require("fs/promises");
    AAi = om("ClientCertificateCredential");
  });
  class ClientSecretCredential {
    constructor(e, t, n, r = {}) {
      if (!e) {
        throw new CredentialUnavailableError("ClientSecretCredential: tenantId is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.");
      }
      if (!t) {
        throw new CredentialUnavailableError("ClientSecretCredential: clientId is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.");
      }
      if (!n) {
        throw new CredentialUnavailableError("ClientSecretCredential: clientSecret is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.");
      }
      this.clientSecret = n;
      this.tenantId = e;
      this.additionallyAllowedTenantIds = ex(r === null || r === undefined ? undefined : r.additionallyAllowedTenants);
      this.msalClient = S2(t, e, Object.assign(Object.assign({}, r), {
        logger: PAi,
        tokenCredentialOptions: r
      }));
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async n => {
        n.tenantId = kC(this.tenantId, n, this.additionallyAllowedTenantIds, PAi);
        let r = T8(e);
        return this.msalClient.getTokenByClientSecret(r, this.clientSecret, n);
      });
    }
  }
  var PAi;
  var yzr = __lazy(() => {
    ebe();
    QD();
    XD();
    KT();
    bce();
    OF();
    PAi = om("ClientSecretCredential");
  });
  class UsernamePasswordCredential {
    constructor(e, t, n, r, o = {}) {
      if (!e) {
        throw new CredentialUnavailableError("UsernamePasswordCredential: tenantId is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/usernamepasswordcredential/troubleshoot.");
      }
      if (!t) {
        throw new CredentialUnavailableError("UsernamePasswordCredential: clientId is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/usernamepasswordcredential/troubleshoot.");
      }
      if (!n) {
        throw new CredentialUnavailableError("UsernamePasswordCredential: username is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/usernamepasswordcredential/troubleshoot.");
      }
      if (!r) {
        throw new CredentialUnavailableError("UsernamePasswordCredential: password is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/usernamepasswordcredential/troubleshoot.");
      }
      this.tenantId = e;
      this.additionallyAllowedTenantIds = ex(o === null || o === undefined ? undefined : o.additionallyAllowedTenants);
      this.username = n;
      this.password = r;
      this.msalClient = S2(t, this.tenantId, Object.assign(Object.assign({}, o), {
        tokenCredentialOptions: o !== null && o !== undefined ? o : {}
      }));
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async n => {
        n.tenantId = kC(this.tenantId, n, this.additionallyAllowedTenantIds, oLd);
        let r = T8(e);
        return this.msalClient.getTokenByUsernamePassword(r, this.username, this.password, n);
      });
    }
  }
  var oLd;
  var _zr = __lazy(() => {
    ebe();
    QD();
    XD();
    KT();
    bce();
    OF();
    oLd = om("UsernamePasswordCredential");
  });
  function iLd() {
    var e;
    return ((e = process.env.AZURE_ADDITIONALLY_ALLOWED_TENANTS) !== null && e !== undefined ? e : "").split(";");
  }
  function aLd() {
    var e;
    let t = ((e = process.env.AZURE_CLIENT_SEND_CERTIFICATE_CHAIN) !== null && e !== undefined ? e : "").toLowerCase();
    let n = t === "true" || t === "1";
    rbe.verbose(`AZURE_CLIENT_SEND_CERTIFICATE_CHAIN: ${process.env.AZURE_CLIENT_SEND_CERTIFICATE_CHAIN}; sendCertificateChain: ${n}`);
    return n;
  }
  class EnvironmentCredential {
    constructor(e) {
      this._credential = undefined;
      let t = kxn(sLd).assigned.join(", ");
      rbe.info(`Found the following environment variables: ${t}`);
      let n = process.env.AZURE_TENANT_ID;
      let r = process.env.AZURE_CLIENT_ID;
      let o = process.env.AZURE_CLIENT_SECRET;
      let s = iLd();
      let i = aLd();
      let a = Object.assign(Object.assign({}, e), {
        additionallyAllowedTenantIds: s,
        sendCertificateChain: i
      });
      if (n) {
        KP(rbe, n);
      }
      if (n && r && o) {
        rbe.info(`Invoking ClientSecretCredential with tenant ID: ${n}, clientId: ${r} and clientSecret: [REDACTED]`);
        this._credential = new ClientSecretCredential(n, r, o, a);
        return;
      }
      let l = process.env.AZURE_CLIENT_CERTIFICATE_PATH;
      let c = process.env.AZURE_CLIENT_CERTIFICATE_PASSWORD;
      if (n && r && l) {
        rbe.info(`Invoking ClientCertificateCredential with tenant ID: ${n}, clientId: ${r} and certificatePath: ${l}`);
        this._credential = new ClientCertificateCredential(n, r, {
          certificatePath: l,
          certificatePassword: c
        }, a);
        return;
      }
      let u = process.env.AZURE_USERNAME;
      let d = process.env.AZURE_PASSWORD;
      if (n && r && u && d) {
        rbe.info(`Invoking UsernamePasswordCredential with tenant ID: ${n}, clientId: ${r} and username: ${u}`);
        rbe.warning("Environment is configured to use username and password authentication. This authentication method is deprecated, as it doesn't support multifactor authentication (MFA). Use a more secure credential. For more details, see https://aka.ms/azsdk/identity/mfa.");
        this._credential = new UsernamePasswordCredential(n, r, u, d, a);
      }
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${"EnvironmentCredential"}.getToken`, t, async n => {
        if (this._credential) {
          try {
            let r = await this._credential.getToken(e, n);
            rbe.getToken.info(zP(e));
            return r;
          } catch (r) {
            let o = new AuthenticationError(400, {
              error: `${"EnvironmentCredential"} authentication failed. To troubleshoot, visit https://aka.ms/azsdk/js/identity/environmentcredential/troubleshoot.`,
              error_description: r.message.toString().split("More details:").join("")
            });
            throw rbe.getToken.info(gg(e, o)), o;
          }
        }
        throw new CredentialUnavailableError(`${"EnvironmentCredential"} is unavailable. No underlying credential could be used. To troubleshoot, visit https://aka.ms/azsdk/js/identity/environmentcredential/troubleshoot.`);
      });
    }
  }
  var sLd;
  var rbe;
  var bzr = __lazy(() => {
    XD();
    KT();
    gzr();
    yzr();
    _zr();
    QD();
    OF();
    sLd = ["AZURE_TENANT_ID", "AZURE_CLIENT_ID", "AZURE_CLIENT_SECRET", "AZURE_CLIENT_CERTIFICATE_PATH", "AZURE_CLIENT_CERTIFICATE_PASSWORD", "AZURE_USERNAME", "AZURE_PASSWORD", "AZURE_ADDITIONALLY_ALLOWED_TENANTS", "AZURE_CLIENT_SEND_CERTIFICATE_CHAIN"];
    rbe = om("EnvironmentCredential");
  });
  function lLd(e = {}) {
    var t;
    var n;
    var r;
    var o;
    (t = e.retryOptions) !== null && t !== undefined || (e.retryOptions = {
      maxRetries: 5,
      retryDelayInMs: 800
    });
    let s = (n = e === null || e === undefined ? undefined : e.managedIdentityClientId) !== null && n !== undefined ? n : process.env.AZURE_CLIENT_ID;
    let i = (r = e === null || e === undefined ? undefined : e.workloadIdentityClientId) !== null && r !== undefined ? r : s;
    let a = e === null || e === undefined ? undefined : e.managedIdentityResourceId;
    let l = process.env.AZURE_FEDERATED_TOKEN_FILE;
    let c = (o = e === null || e === undefined ? undefined : e.tenantId) !== null && o !== undefined ? o : process.env.AZURE_TENANT_ID;
    if (a) {
      let u = Object.assign(Object.assign({}, e), {
        resourceId: a
      });
      return new ManagedIdentityCredential(u);
    }
    if (l && i) {
      let u = Object.assign(Object.assign({}, e), {
        tenantId: c
      });
      return new ManagedIdentityCredential(i, u);
    }
    if (s) {
      let u = Object.assign(Object.assign({}, e), {
        clientId: s
      });
      return new ManagedIdentityCredential(u);
    }
    return new ManagedIdentityCredential(e);
  }
  function cLd(e) {
    var t;
    var n;
    var r;
    let o = (t = e === null || e === undefined ? undefined : e.managedIdentityClientId) !== null && t !== undefined ? t : process.env.AZURE_CLIENT_ID;
    let s = (n = e === null || e === undefined ? undefined : e.workloadIdentityClientId) !== null && n !== undefined ? n : o;
    let i = process.env.AZURE_FEDERATED_TOKEN_FILE;
    let a = (r = e === null || e === undefined ? undefined : e.tenantId) !== null && r !== undefined ? r : process.env.AZURE_TENANT_ID;
    if (i && s) {
      let l = Object.assign(Object.assign({}, e), {
        tenantId: a,
        clientId: s,
        tokenFilePath: i
      });
      return new WorkloadIdentityCredential(l);
    }
    if (a) {
      let l = Object.assign(Object.assign({}, e), {
        tenantId: a
      });
      return new WorkloadIdentityCredential(l);
    }
    return new WorkloadIdentityCredential(e);
  }
  function uLd(e = {}) {
    let t = e.processTimeoutInMs;
    return new AzureDeveloperCliCredential(Object.assign({
      processTimeoutInMs: t
    }, e));
  }
  function dLd(e = {}) {
    let t = e.processTimeoutInMs;
    return new AzureCliCredential(Object.assign({
      processTimeoutInMs: t
    }, e));
  }
  function pLd(e = {}) {
    let t = e.processTimeoutInMs;
    return new AzurePowerShellCredential(Object.assign({
      processTimeoutInMs: t
    }, e));
  }
  function mLd(e = {}) {
    return new EnvironmentCredential(e);
  }
  class OAi {
    constructor(e, t) {
      this.credentialName = e;
      this.credentialUnavailableErrorMessage = t;
    }
    getToken() {
      Szr.getToken.info(`Skipping ${this.credentialName}, reason: ${this.credentialUnavailableErrorMessage}`);
      return Promise.resolve(null);
    }
  }
  var Szr;
  var DefaultAzureCredential;
  var Tzr = __lazy(() => {
    azr();
    czr();
    uzr();
    mzr();
    hzr();
    bzr();
    ZAn();
    KT();
    Szr = om("DefaultAzureCredential");
    DefaultAzureCredential = class EBt extends ChainedTokenCredential {
      constructor(e) {
        let t = process.env.AZURE_TOKEN_CREDENTIALS ? process.env.AZURE_TOKEN_CREDENTIALS.trim().toLowerCase() : undefined;
        let n = [dLd, pLd, uLd];
        let r = [mLd, cLd, lLd];
        let o = [];
        if (t) {
          switch (t) {
            case "dev":
              o = n;
              break;
            case "prod":
              o = r;
              break;
            default:
              {
                let i = `Invalid value for AZURE_TOKEN_CREDENTIALS = ${process.env.AZURE_TOKEN_CREDENTIALS}. Valid values are 'prod' or 'dev'.`;
                throw Szr.warning(i), Error(i);
              }
          }
        } else {
          o = [...r, ...n];
        }
        let s = o.map(i => {
          try {
            return i(e);
          } catch (a) {
            Szr.warning(`Skipped ${i.name} because of an error creating the credential: ${a}`);
            return new OAi(i.name, a.message);
          }
        });
        super(...s);
      }
    };
  });
  class InteractiveBrowserCredential {
    constructor(e) {
      var t;
      var n;
      var r;
      var o;
      var s;
      this.tenantId = Nst(Ezr, e.tenantId, e.clientId);
      this.additionallyAllowedTenantIds = ex(e === null || e === undefined ? undefined : e.additionallyAllowedTenants);
      let i = Object.assign(Object.assign({}, e), {
        tokenCredentialOptions: e,
        logger: Ezr
      });
      let a = e;
      if (this.browserCustomizationOptions = a.browserCustomizationOptions, this.loginHint = a.loginHint, (t = a === null || a === undefined ? undefined : a.brokerOptions) === null || t === undefined ? undefined : t.enabled) {
        if (!((n = a === null || a === undefined ? undefined : a.brokerOptions) === null || n === undefined ? undefined : n.parentWindowHandle)) {
          throw Error("In order to do WAM authentication, `parentWindowHandle` under `brokerOptions` is a required parameter");
        } else {
          i.brokerOptions = {
            enabled: true,
            parentWindowHandle: a.brokerOptions.parentWindowHandle,
            legacyEnableMsaPassthrough: (r = a.brokerOptions) === null || r === undefined ? undefined : r.legacyEnableMsaPassthrough,
            useDefaultBrokerAccount: (o = a.brokerOptions) === null || o === undefined ? undefined : o.useDefaultBrokerAccount
          };
        }
      }
      this.msalClient = S2((s = e.clientId) !== null && s !== undefined ? s : "04b07795-8ddb-461a-bbee-02f9e1bf7b46", this.tenantId, i);
      this.disableAutomaticAuthentication = e === null || e === undefined ? undefined : e.disableAutomaticAuthentication;
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async n => {
        n.tenantId = kC(this.tenantId, n, this.additionallyAllowedTenantIds, Ezr);
        let r = T8(e);
        return this.msalClient.getTokenByInteractiveRequest(r, Object.assign(Object.assign({}, n), {
          disableAutomaticAuthentication: this.disableAutomaticAuthentication,
          browserCustomizationOptions: this.browserCustomizationOptions,
          loginHint: this.loginHint
        }));
      });
    }
    async authenticate(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.authenticate`, t, async n => {
        let r = T8(e);
        await this.msalClient.getTokenByInteractiveRequest(r, Object.assign(Object.assign({}, n), {
          disableAutomaticAuthentication: false,
          browserCustomizationOptions: this.browserCustomizationOptions,
          loginHint: this.loginHint
        }));
        return this.msalClient.getActiveAccount();
      });
    }
  }
  var Ezr;
  var DAi = __lazy(() => {
    QD();
    KT();
    bce();
    OF();
    ebe();
    rce();
    Ezr = om("InteractiveBrowserCredential");
  });
  function fLd(e) {
    console.log(e.message);
  }
  class DeviceCodeCredential {
    constructor(e) {
      var t;
      var n;
      this.tenantId = e === null || e === undefined ? undefined : e.tenantId;
      this.additionallyAllowedTenantIds = ex(e === null || e === undefined ? undefined : e.additionallyAllowedTenants);
      let r = (t = e === null || e === undefined ? undefined : e.clientId) !== null && t !== undefined ? t : "04b07795-8ddb-461a-bbee-02f9e1bf7b46";
      let o = Nst(wzr, e === null || e === undefined ? undefined : e.tenantId, r);
      this.userPromptCallback = (n = e === null || e === undefined ? undefined : e.userPromptCallback) !== null && n !== undefined ? n : fLd;
      this.msalClient = S2(r, o, Object.assign(Object.assign({}, e), {
        logger: wzr,
        tokenCredentialOptions: e || {}
      }));
      this.disableAutomaticAuthentication = e === null || e === undefined ? undefined : e.disableAutomaticAuthentication;
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async n => {
        n.tenantId = kC(this.tenantId, n, this.additionallyAllowedTenantIds, wzr);
        let r = T8(e);
        return this.msalClient.getTokenByDeviceCode(r, this.userPromptCallback, Object.assign(Object.assign({}, n), {
          disableAutomaticAuthentication: this.disableAutomaticAuthentication
        }));
      });
    }
    async authenticate(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.authenticate`, t, async n => {
        let r = Array.isArray(e) ? e : [e];
        await this.msalClient.getTokenByDeviceCode(r, this.userPromptCallback, Object.assign(Object.assign({}, n), {
          disableAutomaticAuthentication: false
        }));
        return this.msalClient.getActiveAccount();
      });
    }
  }
  var wzr;
  var MAi = __lazy(() => {
    QD();
    KT();
    bce();
    OF();
    ebe();
    rce();
    wzr = om("DeviceCodeCredential");
  });
  class AzurePipelinesCredential {
    constructor(e, t, n, r, o = {}) {
      var s;
      var i;
      if (!t) {
        throw new CredentialUnavailableError(`${"AzurePipelinesCredential"}: is unavailable. clientId is a required parameter.`);
      }
      if (!e) {
        throw new CredentialUnavailableError(`${"AzurePipelinesCredential"}: is unavailable. tenantId is a required parameter.`);
      }
      if (!n) {
        throw new CredentialUnavailableError(`${"AzurePipelinesCredential"}: is unavailable. serviceConnectionId is a required parameter.`);
      }
      if (!r) {
        throw new CredentialUnavailableError(`${"AzurePipelinesCredential"}: is unavailable. systemAccessToken is a required parameter.`);
      }
      if (o.loggingOptions = Object.assign(Object.assign({}, o === null || o === undefined ? undefined : o.loggingOptions), {
        additionalAllowedHeaderNames: [...((i = (s = o.loggingOptions) === null || s === undefined ? undefined : s.additionalAllowedHeaderNames) !== null && i !== undefined ? i : []), "x-vss-e2eid", "x-msedge-ref"]
      }), this.identityClient = new cce(o), KP(rJ, e), rJ.info(`Invoking AzurePipelinesCredential with tenant ID: ${e}, client ID: ${t}, and service connection ID: ${n}`), !process.env.SYSTEM_OIDCREQUESTURI) {
        throw new CredentialUnavailableError(`${"AzurePipelinesCredential"}: is unavailable. Ensure that you're running this task in an Azure Pipeline, so that following missing system variable(s) can be defined- "SYSTEM_OIDCREQUESTURI"`);
      }
      let a = `${process.env.SYSTEM_OIDCREQUESTURI}?api-version=${"7.1"}&serviceConnectionId=${n}`;
      rJ.info(`Invoking ClientAssertionCredential with tenant ID: ${e}, client ID: ${t} and service connection ID: ${n}`);
      this.clientAssertionCredential = new ClientAssertionCredential(e, t, this.requestOidcToken.bind(this, a, r), o);
    }
    async getToken(e, t) {
      if (!this.clientAssertionCredential) {
        let n = `${"AzurePipelinesCredential"}: is unavailable. To use Federation Identity in Azure Pipelines, the following parameters are required - 
      tenantId,
      clientId,
      serviceConnectionId,
      systemAccessToken,
      "SYSTEM_OIDCREQUESTURI".      
      See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/azurepipelinescredential/troubleshoot`;
        throw rJ.error(n), new CredentialUnavailableError(n);
      }
      rJ.info("Invoking getToken() of Client Assertion Credential");
      return this.clientAssertionCredential.getToken(e, t);
    }
    async requestOidcToken(e, t) {
      rJ.info("Requesting OIDC token from Azure Pipelines...");
      rJ.info(e);
      let n = h8({
        url: e,
        method: "POST",
        headers: O_e({
          "Content-Type": "application/json",
          Authorization: `Bearer ${t}`,
          "X-TFS-FedAuthRedirect": "Suppress"
        })
      });
      let r = await this.identityClient.sendRequest(n);
      return gLd(r);
    }
  }
  function gLd(e) {
    let t = e.bodyAsText;
    if (!t) {
      throw rJ.error(`${"AzurePipelinesCredential"}: Authentication Failed. Received null token from OIDC request. Response status- ${e.status}. Complete response - ${JSON.stringify(e)}`), new AuthenticationError(e.status, {
        error: `${"AzurePipelinesCredential"}: Authentication Failed. Received null token from OIDC request.`,
        error_description: `${JSON.stringify(e)}. See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/azurepipelinescredential/troubleshoot`
      });
    }
    try {
      let n = JSON.parse(t);
      if (n === null || n === undefined ? undefined : n.oidcToken) {
        return n.oidcToken;
      } else {
        let r = `${"AzurePipelinesCredential"}: Authentication Failed. oidcToken field not detected in the response.`;
        let o = "";
        if (e.status !== 200) {
          o = `Response body = ${t}. Response Headers ["x-vss-e2eid"] = ${e.headers.get("x-vss-e2eid")} and ["x-msedge-ref"] = ${e.headers.get("x-msedge-ref")}. See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/azurepipelinescredential/troubleshoot`;
        }
        throw rJ.error(r), rJ.error(o), new AuthenticationError(e.status, {
          error: r,
          error_description: o
        });
      }
    } catch (n) {
      let r = `${"AzurePipelinesCredential"}: Authentication Failed. oidcToken field not detected in the response.`;
      throw rJ.error(`Response from service = ${t}, Response Headers ["x-vss-e2eid"] = ${e.headers.get("x-vss-e2eid")} 
      and ["x-msedge-ref"] = ${e.headers.get("x-msedge-ref")}, error message = ${n.message}`), rJ.error(r), new AuthenticationError(e.status, {
        error: r,
        error_description: `Response = ${t}. Response headers ["x-vss-e2eid"] = ${e.headers.get("x-vss-e2eid")} and ["x-msedge-ref"] =  ${e.headers.get("x-msedge-ref")}. See the troubleshooting guide for more information: https://aka.ms/azsdk/js/identity/azurepipelinescredential/troubleshoot`
      });
    }
  }
  var rJ;
  var NAi = __lazy(() => {
    XD();
    ace();
    QAn();
    AFt();
    QD();
    KT();
    rJ = om("AzurePipelinesCredential");
  });
  class AuthorizationCodeCredential {
    constructor(e, t, n, r, o, s) {
      if (KP(LAi, e), this.clientSecret = n, typeof o === "string") {
        this.authorizationCode = r;
        this.redirectUri = o;
      } else {
        this.authorizationCode = n;
        this.redirectUri = r;
        this.clientSecret = undefined;
        s = o;
      }
      this.tenantId = e;
      this.additionallyAllowedTenantIds = ex(s === null || s === undefined ? undefined : s.additionallyAllowedTenants);
      this.msalClient = S2(t, e, Object.assign(Object.assign({}, s), {
        logger: LAi,
        tokenCredentialOptions: s !== null && s !== undefined ? s : {}
      }));
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${this.constructor.name}.getToken`, t, async n => {
        let r = kC(this.tenantId, n, this.additionallyAllowedTenantIds);
        n.tenantId = r;
        let o = T8(e);
        return this.msalClient.getTokenByAuthorizationCode(o, this.redirectUri, this.authorizationCode, this.clientSecret, Object.assign(Object.assign({}, n), {
          disableAutomaticAuthentication: this.disableAutomaticAuthentication
        }));
      });
    }
  }
  var LAi;
  var FAi = __lazy(() => {
    QD();
    QD();
    KT();
    bce();
    OF();
    ebe();
    LAi = om("AuthorizationCodeCredential");
  });
  class OnBehalfOfCredential {
    constructor(e) {
      let {
        clientSecret: t
      } = e;
      let {
        certificatePath: n,
        sendCertificateChain: r
      } = e;
      let {
        getAssertion: o
      } = e;
      let {
        tenantId: s,
        clientId: i,
        userAssertionToken: a,
        additionallyAllowedTenants: l
      } = e;
      if (!s) {
        throw new CredentialUnavailableError(`${"OnBehalfOfCredential"}: tenantId is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.`);
      }
      if (!i) {
        throw new CredentialUnavailableError(`${"OnBehalfOfCredential"}: clientId is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.`);
      }
      if (!t && !n && !o) {
        throw new CredentialUnavailableError(`${"OnBehalfOfCredential"}: You must provide one of clientSecret, certificatePath, or a getAssertion callback but none were provided. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.`);
      }
      if (!a) {
        throw new CredentialUnavailableError(`${"OnBehalfOfCredential"}: userAssertionToken is a required parameter. To troubleshoot, visit https://aka.ms/azsdk/js/identity/serviceprincipalauthentication/troubleshoot.`);
      }
      this.certificatePath = n;
      this.clientSecret = t;
      this.userAssertionToken = a;
      this.sendCertificateChain = r;
      this.clientAssertion = o;
      this.tenantId = s;
      this.additionallyAllowedTenantIds = ex(l);
      this.msalClient = S2(i, this.tenantId, Object.assign(Object.assign({}, e), {
        logger: kzr,
        tokenCredentialOptions: e
      }));
    }
    async getToken(e, t = {}) {
      return xy.withSpan(`${"OnBehalfOfCredential"}.getToken`, t, async n => {
        n.tenantId = kC(this.tenantId, n, this.additionallyAllowedTenantIds, kzr);
        let r = T8(e);
        if (this.certificatePath) {
          let o = await this.buildClientCertificate(this.certificatePath);
          return this.msalClient.getTokenOnBehalfOf(r, this.userAssertionToken, o, n);
        } else if (this.clientSecret) {
          return this.msalClient.getTokenOnBehalfOf(r, this.userAssertionToken, this.clientSecret, t);
        } else if (this.clientAssertion) {
          return this.msalClient.getTokenOnBehalfOf(r, this.userAssertionToken, this.clientAssertion, t);
        } else {
          throw Error("Expected either clientSecret or certificatePath or clientAssertion to be defined.");
        }
      });
    }
    async buildClientCertificate(e) {
      try {
        let t = await this.parseCertificate({
          certificatePath: e
        }, this.sendCertificateChain);
        return {
          thumbprint: t.thumbprint,
          thumbprintSha256: t.thumbprintSha256,
          privateKey: t.certificateContents,
          x5c: t.x5c
        };
      } catch (t) {
        throw kzr.info(gg("", t)), t;
      }
    }
    async parseCertificate(e, t) {
      let n = e.certificatePath;
      let r = await UAi.readFile(n, "utf8");
      let o = t ? r : undefined;
      let s = /(-+BEGIN CERTIFICATE-+)(\n\r?|\r\n?)([A-Za-z0-9+/\n\r]+=*)(\n\r?|\r\n?)(-+END CERTIFICATE-+)/g;
      let i = [];
      let a;
      do {
        if (a = s.exec(r), a) {
          i.push(a[3]);
        }
      } while (a);
      if (i.length === 0) {
        throw Error("The file at the specified path does not contain a PEM-encoded certificate.");
      }
      let l = Azr.createHash("sha1").update(Buffer.from(i[0], "base64")).digest("hex").toUpperCase();
      let c = Azr.createHash("sha256").update(Buffer.from(i[0], "base64")).digest("hex").toUpperCase();
      return {
        certificateContents: r,
        thumbprintSha256: c,
        thumbprint: l,
        x5c: o
      };
    }
  }
  var Azr;
  var UAi;
  var kzr;
  var BAi = __lazy(() => {
    ebe();
    KT();
    QD();
    XD();
    bce();
    OF();
    Azr = require("crypto");
    UAi = require("fs/promises");
    kzr = om("OnBehalfOfCredential");
  });
  function getBearerTokenProvider(e, t, n) {
    let {
      abortSignal: r,
      tracingOptions: o
    } = n || {};
    let s = gFt();
    s.addPolicy(CFt({
      credential: e,
      scopes: t
    }));
    async function i() {
      var a;
      let c = (a = (await s.sendRequest({
        sendRequest: u => Promise.resolve({
          request: u,
          status: 200,
          headers: u.headers
        })
      }, h8({
        url: "https://example.com",
        abortSignal: r,
        tracingOptions: o
      }))).headers.get("authorization")) === null || a === undefined ? undefined : a.split(" ")[1];
      if (!c) {
        throw Error("Failed to get access token");
      }
      return c;
    }
    return i;
  }
  var HAi = __lazy(() => {
    ace();
  });
  var Pzr = {};
  __export(Pzr, {
    useIdentityPlugin: () => useIdentityPlugin,
    serializeAuthenticationRecord: () => serializeAuthenticationRecord,
    logger: () => logger,
    getDefaultAzureCredential: () => getDefaultAzureCredential,
    getBearerTokenProvider: () => getBearerTokenProvider,
    deserializeAuthenticationRecord: () => deserializeAuthenticationRecord,
    WorkloadIdentityCredential: () => WorkloadIdentityCredential,
    VisualStudioCodeCredential: () => VisualStudioCodeCredential,
    UsernamePasswordCredential: () => UsernamePasswordCredential,
    OnBehalfOfCredential: () => OnBehalfOfCredential,
    ManagedIdentityCredential: () => ManagedIdentityCredential,
    InteractiveBrowserCredential: () => InteractiveBrowserCredential,
    EnvironmentCredential: () => EnvironmentCredential,
    DeviceCodeCredential: () => DeviceCodeCredential,
    DefaultAzureCredential: () => DefaultAzureCredential,
    CredentialUnavailableErrorName: () => "CredentialUnavailableError",
    CredentialUnavailableError: () => CredentialUnavailableError,
    ClientSecretCredential: () => ClientSecretCredential,
    ClientCertificateCredential: () => ClientCertificateCredential,
    ClientAssertionCredential: () => ClientAssertionCredential,
    ChainedTokenCredential: () => ChainedTokenCredential,
    AzurePowerShellCredential: () => AzurePowerShellCredential,
    AzurePipelinesCredential: () => AzurePipelinesCredential,
    AzureDeveloperCliCredential: () => AzureDeveloperCliCredential,
    AzureCliCredential: () => AzureCliCredential,
    AzureAuthorityHosts: () => AzureAuthorityHosts,
    AuthorizationCodeCredential: () => AuthorizationCodeCredential,
    AuthenticationRequiredError: () => AuthenticationRequiredError,
    AuthenticationErrorName: () => "AuthenticationError",
    AuthenticationError: () => AuthenticationError,
    AggregateAuthenticationErrorName: () => "AggregateAuthenticationError",
    AggregateAuthenticationError: () => AggregateAuthenticationError
  });
  function getDefaultAzureCredential() {
    return new DefaultAzureCredential();
  }
  var Ozr = __lazy(() => {
    Tzr();
    XD();
    VAn();
    hzr();
    yzr();
    Tzr();
    bzr();
    gzr();
    QAn();
    czr();
    uzr();
    DAi();
    azr();
    MAi();
    NAi();
    FAi();
    mzr();
    _zr();
    J5r();
    BAi();
    ZAn();
    KT();
    rce();
    HAi();
    JEi();
  });
  var vBt = __lazy(() => {
    cI();
  });
  var Dzr = e => (Dzr = Array.isArray, Dzr(e));
  function* bLd(e) {
    if (!e) {
      return;
    }
    if (jAi in e) {
      let {
        values: r,
        nulls: o
      } = e;
      yield* r.entries();
      for (let s of o) {
        yield [s, null];
      }
      return;
    }
    let t = false;
    let n;
    if (e instanceof Headers) {
      n = e.entries();
    } else if (Dzr(e)) {
      n = e;
    } else {
      t = true;
      n = Object.entries(e ?? {});
    }
    for (let r of n) {
      let o = r[0];
      if (typeof o !== "string") {
        throw TypeError("expected header name to be a string");
      }
      let s = Dzr(r[1]) ? r[1] : [r[1]];
      let i = false;
      for (let a of s) {
        if (a === undefined) {
          continue;
        }
        if (t && !i) {
          i = true;
          yield [o, null];
        }
        yield [o, a];
      }
    }
  }
  var jAi;
  var Nzr = e => {
    let t = new Headers();
    let n = new Set();
    for (let r of e) {
      let o = new Set();
      for (let [s, i] of bLd(r)) {
        let a = s.toLowerCase();
        if (!o.vZc(a)) {
          t.delete(s);
          o.add(a);
        }
        if (i === null) {
          t.delete(s);
          n.add(a);
        } else {
          t.append(s, i);
          n.delete(a);
        }
      }
    }
    return {
      [jAi]: true,
      values: t,
      nulls: n
    };
  };
  var qAi = __lazy(() => {
    jAi = Symbol.for("brand.privateNullableHeaders");
  });
  var WAi = __lazy(() => {
    vBt();
  });
  var xit = e => {
    if (typeof globalThis.process < "u") {
      return globalThis.process.env?.[e]?.trim() ?? undefined;
    }
    if (typeof globalThis.Deno < "u") {
      return globalThis.Deno.env?.get?.(e)?.trim();
    }
    return;
  };
  var GAi = __lazy(() => {});
  var VAi = __lazy(() => {
    vBt();
  });
  var zAi = __lazy(() => {
    WAi();
    GAi();
    VAi();
  });
  var KAi;
  var YAi;
  var JAi;
  var SLd = e => Promise.resolve().then(() => (zot(), Vot)).then(({
    fromNodeProviderChain: t
  }) => t({
    ...(e != null ? {
      profile: e
    } : {}),
    clientConfig: {
      requestHandler: new YAi.FetchHttpHandler({
        requestInit: n => ({
          ...n
        })
      })
    }
  })).catch(t => {
    throw Error(`Failed to import '@aws-sdk/credential-providers'. You can provide a custom \`providerChainResolver\` in the client options if your runtime does not have access to '@aws-sdk/credential-providers': \`new AnthropicAws({ providerChainResolver })\` Original error: ${t.message}`);
  });
  var XAi = async (e, t) => {
    JAi.default(e.method, "Expected request method property to be set");
    let n;
    if (t.awsAccessKey && t.awsSecretAccessKey) {
      n = {
        accessKeyId: t.awsAccessKey,
        secretAccessKey: t.awsSecretAccessKey,
        ...(t.awsSessionToken != null && {
          sessionToken: t.awsSessionToken
        })
      };
    } else if (t.providerChainResolver) {
      n = await (await t.providerChainResolver())();
    } else {
      n = await (await SLd(t.awsProfile))();
    }
    let r = new qqe({
      service: t.serviceName,
      region: t.regionName,
      credentials: n,
      sha256: KAi.Sha256
    });
    let o = new URL(t.url);
    let s = !e.headers ? {} : Symbol.iterator in e.headers ? Object.fromEntries(Array.from(e.headers).map(c => [...c])) : {
      ...e.headers
    };
    delete s.connection;
    s.host = o.hostname;
    let i = {};
    o.searchParams.forEach((c, u) => {
      i[u] = c;
    });
    let a = new T0e({
      method: e.method.toUpperCase(),
      protocol: o.protocol,
      path: o.pathname,
      query: i,
      headers: s,
      body: e.body
    });
    return (await r.sign(a)).headers;
  };
  var QAi = __lazy(() => {
    Rst();
    ZRn();
    KAi = __toESM(qRn(), 1);
    YAi = __toESM(nrt(), 1);
    JAi = __toESM(require("assert"));
  });
  var AnthropicAws;
  var Fzr = __lazy(() => {
    qAi();
    vBt();
    zAi();
    QAi();
    AnthropicAws = class Lzr extends dj {
      constructor({
        awsRegion: e,
        baseURL: t,
        apiKey: n,
        awsAccessKey: r = null,
        awsSecretAccessKey: o = null,
        awsSessionToken: s = null,
        awsProfile: i,
        providerChainResolver: a = null,
        workspaceId: l,
        skipAuth: c = false,
        ...u
      } = {}) {
        let d = e ?? xit("AWS_REGION") ?? xit("AWS_DEFAULT_REGION");
        let p = t ?? xit("ANTHROPIC_AWS_BASE_URL") ?? (d ? `https://aws-external-anthropic.${d}.api.aws` : undefined);
        if (!p && !c) {
          throw new mi("No AWS region or base URL found. Set `awsRegion` in the constructor, the `AWS_REGION` / `AWS_DEFAULT_REGION` environment variable, or provide a `baseURL` / `ANTHROPIC_AWS_BASE_URL` environment variable.");
        }
        let m = n != null;
        if (r != null !== (o != null)) {
          throw new mi("`awsAccessKey` and `awsSecretAccessKey` must be provided together. You provided only one.");
        }
        let h = r != null && o != null;
        let g = i != null;
        let y;
        if (m) {
          y = n;
        } else if (!h && !g) {
          y = xit("ANTHROPIC_AWS_API_KEY") ?? undefined;
        }
        let _ = l ?? xit("ANTHROPIC_AWS_WORKSPACE_ID");
        if (!_ && !c) {
          throw new mi("No workspace ID found. Set `workspaceId` in the constructor or the `ANTHROPIC_AWS_WORKSPACE_ID` environment variable.");
        }
        super({
          apiKey: y,
          baseURL: p,
          ...u,
          defaultHeaders: Nzr([{
            "anthropic-workspace-id": _
          }, u.defaultHeaders])
        });
        this.skipAuth = false;
        this.awsRegion = d;
        this.awsAccessKey = r;
        this.awsSecretAccessKey = o;
        this.awsSessionToken = s;
        this.awsProfile = i ?? null;
        this.providerChainResolver = a;
        this.workspaceId = _;
        this.skipAuth = c;
        this._useSigV4 = y == null;
      }
      async authHeaders(e) {
        if (this.skipAuth) {
          return;
        }
        if (!this._useSigV4) {
          return super.authHeaders(e);
        }
        return;
      }
      validateHeaders() {}
      async prepareRequest(e, {
        url: t,
        options: n
      }) {
        if (this.skipAuth || !this._useSigV4) {
          return;
        }
        let r = this.awsRegion;
        if (!r) {
          throw new mi("No AWS region found. Set `awsRegion` in the constructor or the `AWS_REGION` / `AWS_DEFAULT_REGION` environment variable.");
        }
        let o = await XAi(e, {
          url: t,
          regionName: r,
          serviceName: "aws-external-anthropic",
          awsAccessKey: this.awsAccessKey,
          awsSecretAccessKey: this.awsSecretAccessKey,
          awsSessionToken: this.awsSessionToken,
          awsProfile: this.awsProfile,
          providerChainResolver: this.providerChainResolver
        });
        e.headers = Nzr([o, e.headers]).values;
      }
    };
  });
  var Uzr = {};