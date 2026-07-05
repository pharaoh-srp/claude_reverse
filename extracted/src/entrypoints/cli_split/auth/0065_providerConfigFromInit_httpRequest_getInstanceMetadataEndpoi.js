  __export(dNt, {
    providerConfigFromInit: () => providerConfigFromInit,
    httpRequest: () => httpRequest,
    getInstanceMetadataEndpoint: () => getInstanceMetadataEndpoint,
    fromInstanceMetadata: () => fromInstanceMetadata,
    fromContainerMetadata: () => fromContainerMetadata,
    Endpoint: () => Endpoint,
    ENV_CMDS_RELATIVE_URI: () => "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI",
    ENV_CMDS_FULL_URI: () => "AWS_CONTAINER_CREDENTIALS_FULL_URI",
    ENV_CMDS_AUTH_TOKEN: () => "AWS_CONTAINER_AUTHORIZATION_TOKEN",
    DEFAULT_TIMEOUT: () => 1000,
    DEFAULT_MAX_RETRIES: () => 0
  });
  var Dje = __lazy(() => {
    s_n();
    JLr();
    zLr();
    aMs();
    CMs();
    RMs();
  });
  var xMs;
  var kMs = (e, t) => {
    if (e.protocol === "https:") {
      return;
    }
    if (e.hostname === "169.254.170.2" || e.hostname === "169.254.170.23" || e.hostname === "[fd00:ec2::23]") {
      return;
    }
    if (e.hostname.includes("[")) {
      if (e.hostname === "[::1]" || e.hostname === "[0000:0000:0000:0000:0000:0000:0000:0001]") {
        return;
      }
    } else {
      if (e.hostname === "localhost") {
        return;
      }
      let n = e.hostname.split(".");
      let r = o => {
        let s = parseInt(o, 10);
        return 0 <= s && s <= 255;
      };
      if (n[0] === "127" && r(n[1]) && r(n[2]) && r(n[3]) && n.length === 4) {
        return;
      }
    }
    throw new xMs.CredentialsProviderError(`URL not accepted. It must either be HTTPS or match one of the following:
  - loopback CIDR 127.0.0.0/8 or [::1/128]
  - ECS container host 169.254.170.2
  - EKS container host 169.254.170.23 or [fd00:ec2::23]`, {
      logger: t
    });
  };
  var AMs = __lazy(() => {
    xMs = __toESM(wy(), 1);
  });
  var IMs = () => {};
  var PMs = () => {};
  var OMs;
  var DMs = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(OMs || (OMs = {}));
  });
  var MMs;
  var NMs = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(MMs || (MMs = {}));
  });
  var LMs = () => {};
  var FMs = () => {};
  var UMs = () => {};
  var BMs = () => {};
  var $Ms = __lazy(() => {
    DMs();
    NMs();
    LMs();
    FMs();
    UMs();
    BMs();
  });
  var HMs = () => {};
  var jMs = () => {};
  var qMs = () => {};
  var WMs = () => {};
  var GMs = () => {};
  var VMs = () => {};
  var zMs = () => {};
  var KMs = __lazy(() => {
    GMs();
    VMs();
    zMs();
  });
  var YMs = () => {};
  var JMs = () => {};
  var XMs;
  var QMs = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(XMs || (XMs = {}));
  });
  var ZMs = () => {};
  var eNs = () => {};
  var tNs = () => {};
  var nNs = () => {};
  var rNs = () => {};
  var oNs = __lazy(() => {
    ZMs();
    eNs();
    tNs();
    nNs();
    rNs();
  });
  var sNs = () => {};
  var Znt;
  var iNs = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(Znt || (Znt = {}));
  });
  var aNs = () => {};
  var lNs = () => {};
  var cNs = __lazy(() => {
    iNs();
    aNs();
    lNs();
  });
  var uNs = () => {};
  var dNs;
  var pNs = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(dNs || (dNs = {}));
  });
  var mNs = () => {};
  var fNs = () => {};
  var hNs = () => {};
  var gNs = () => {};
  var yNs = () => {};
  var _Ns = __lazy(() => {
    fNs();
    hNs();
    gNs();
    yNs();
  });
  var bNs = () => {};
  var TNs = () => {};
  var ENs;
  var vNs = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(ENs || (ENs = {}));
  });
  var wNs = () => {};
  var CNs = () => {};
  var RNs = () => {};
  var xNs = () => {};
  var kNs = () => {};
  var ANs = () => {};
  var INs = () => {};
  var PNs = () => {};
  var ONs = () => {};
  var DNs = () => {};
  var MNs = () => {};
  var NNs = () => {};
  var LNs = () => {};
  var FNs = () => {};
  var UNs;
  var BNs = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(UNs || (UNs = {}));
  });
  var $Ns = () => {};
  var HNs = () => {};
  var jNs = () => {};
  var qNs = () => {};
  var WNs = () => {};
  var GNs = () => {};
  var VNs = () => {};
  var tFr = __lazy(() => {
    PMs();
    $Ms();
    HMs();
    jMs();
    qMs();
    WMs();
    KMs();
    YMs();
    JMs();
    QMs();
    oNs();
    sNs();
    cNs();
    uNs();
    pNs();
    mNs();
    _Ns();
    bNs();
    TNs();
    vNs();
    wNs();
    CNs();
    RNs();
    xNs();
    kNs();
    ANs();
    INs();
    PNs();
    ONs();
    DNs();
    MNs();
    NNs();
    LNs();
    FNs();
    BNs();
    $Ns();
    HNs();
    jNs();
    qNs();
    WNs();
    GNs();
    VNs();
  });
  var zNs = () => {};
  var KNs = () => {};
  class pNt {
    method;
    protocol;
    hostname;
    port;
    path;
    query;
    headers;
    username;
    password;
    fragment;
    body;
    constructor(e) {
      this.method = e.method || "GET";
      this.hostname = e.hostname || "localhost";
      this.port = e.port;
      this.query = e.query || {};
      this.headers = e.headers || {};
      this.body = e.body;
      this.protocol = e.protocol ? e.protocol.slice(-1) !== ":" ? `${e.protocol}:` : e.protocol : "https:";
      this.path = e.path ? e.path.charAt(0) !== "/" ? `/${e.path}` : e.path : "/";
      this.username = e.username;
      this.password = e.password;
      this.fragment = e.fragment;
    }
    static clone(e) {
      let t = new pNt({
        ...e,
        headers: {
          ...e.headers
        }
      });
      if (t.query) {
        t.query = A5u(t.query);
      }
      return t;
    }
    static isInstance(e) {
      if (!e) {
        return false;
      }
      let t = e;
      return "method" in t && "protocol" in t && "hostname" in t && "path" in t && typeof t.query === "object" && typeof t.headers === "object";
    }
    clone() {
      return pNt.clone(this);
    }
  }
  function A5u(e) {
    return Object.keys(e).reduce((t, n) => {
      let r = e[n];
      return {
        ...t,
        [n]: Array.isArray(r) ? [...r] : r
      };
    }, {});
  }
  var YNs = () => {};
  var JNs = __lazy(() => {
    IMs();
    zNs();
    KNs();
    YNs();
  });