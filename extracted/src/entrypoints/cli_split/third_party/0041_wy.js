  var wy = __commonJS(VHe => {
    class Qtt extends Error {
      name = "ProviderError";
      tryNextLink;
      constructor(e, t = true) {
        let n;
        let r = true;
        if (typeof t === "boolean") {
          n = undefined;
          r = t;
        } else if (t != null && typeof t === "object") {
          n = t.logger;
          r = t.tryNextLink ?? true;
        }
        super(e);
        this.tryNextLink = r;
        Object.setPrototypeOf(this, Qtt.prototype);
        n?.debug?.(`@smithy/property-provider ${r ? "->" : "(!)"} ${e}`);
      }
      static from(e, t = true) {
        return Object.assign(new this(e.message, t), e);
      }
    }
    class mMr extends Qtt {
      name = "CredentialsProviderError";
      constructor(e, t = true) {
        super(e, t);
        Object.setPrototypeOf(this, mMr.prototype);
      }
    }
    class fMr extends Qtt {
      name = "TokenProviderError";
      constructor(e, t = true) {
        super(e, t);
        Object.setPrototypeOf(this, fMr.prototype);
      }
    }
    var cHu = (...e) => async () => {
      if (e.length === 0) {
        throw new Qtt("No providers in chain");
      }
      let t;
      for (let n of e) {
        try {
          return await n();
        } catch (r) {
          if (t = r, r?.tryNextLink) {
            continue;
          }
          throw r;
        }
      }
      throw t;
    };
    var uHu = e => () => Promise.resolve(e);
    var dHu = (e, t, n) => {
      let r;
      let o;
      let s;
      let i = false;
      let a = async () => {
        if (!o) {
          o = e();
        }
        try {
          r = await o;
          s = true;
          i = false;
        } finally {
          o = undefined;
        }
        return r;
      };
      if (t === undefined) {
        return async l => {
          if (!s || l?.forceRefresh) {
            r = await a();
          }
          return r;
        };
      }
      return async l => {
        if (!s || l?.forceRefresh) {
          r = await a();
        }
        if (i) {
          return r;
        }
        if (n && !n(r)) {
          i = true;
          return r;
        }
        if (t(r)) {
          await a();
          return r;
        }
        return r;
      };
    };
    VHe.CredentialsProviderError = mMr;
    VHe.ProviderError = Qtt;
    VHe.TokenProviderError = fMr;
    VHe.chain = cHu;
    VHe.fromStatic = uHu;
    VHe.memoize = dHu;
  });
  var gMr = __commonJS(Nhn => {
    Object.defineProperty(Nhn, "__esModule", {
      value: true
    });
    Nhn.getHomeDir = undefined;
    var pHu = require("os");
    var mHu = require("path");
    var hMr = {};
    var fHu = () => {
      if (process && process.geteuid) {
        return `${process.geteuid()}`;
      }
      return "DEFAULT";
    };
    var hHu = () => {
      let {
        HOME: e,
        USERPROFILE: t,
        HOMEPATH: n,
        HOMEDRIVE: r = `C:${mHu.sep}`
      } = process.env;
      if (e) {
        return e;
      }
      if (t) {
        return t;
      }
      if (n) {
        return `${r}${n}`;
      }
      let o = fHu();
      if (!hMr[o]) {
        hMr[o] = (0, pHu.homedir)();
      }
      return hMr[o];
    };
    Nhn.getHomeDir = hHu;
  });
  var yMr = __commonJS(Lhn => {
    Object.defineProperty(Lhn, "__esModule", {
      value: true
    });
    Lhn.getSSOTokenFilepath = undefined;
    var gHu = require("crypto");
    var yHu = require("path");
    var _Hu = gMr();
    var bHu = e => {
      let n = (0, gHu.createHash)("sha1").update(e).digest("hex");
      return (0, yHu.join)((0, _Hu.getHomeDir)(), ".aws", "sso", "cache", `${n}.json`);
    };
    Lhn.getSSOTokenFilepath = bHu;
  });
  var axs = __commonJS(dke => {
    Object.defineProperty(dke, "__esModule", {
      value: true
    });
    dke.getSSOTokenFromFile = dke.tokenIntercept = undefined;
    var SHu = require("fs/promises");
    var THu = yMr();
    dke.tokenIntercept = {};
    var EHu = async e => {
      if (dke.tokenIntercept[e]) {
        return dke.tokenIntercept[e];
      }
      let t = (0, THu.getSSOTokenFilepath)(e);
      let n = await (0, SHu.readFile)(t, "utf8");
      return JSON.parse(n);
    };
    dke.getSSOTokenFromFile = EHu;
  });
  var lxs = __commonJS(VE => {
    VE.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(VE.HttpAuthLocation || (VE.HttpAuthLocation = {}));
    VE.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(VE.HttpApiKeyAuthLocation || (VE.HttpApiKeyAuthLocation = {}));
    VE.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(VE.EndpointURLScheme || (VE.EndpointURLScheme = {}));
    VE.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(VE.AlgorithmId || (VE.AlgorithmId = {}));
    var vHu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => VE.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => VE.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
        });
      }
      return {
        addChecksumAlgorithm(n) {
          t.push(n);
        },
        checksumAlgorithms() {
          return t;
        }
      };
    };
    var wHu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var CHu = e => vHu(e);
    var RHu = e => wHu(e);
    VE.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(VE.FieldPosition || (VE.FieldPosition = {}));
    VE.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(VE.IniSectionType || (VE.IniSectionType = {}));
    VE.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(VE.RequestHandlerProtocol || (VE.RequestHandlerProtocol = {}));
    VE.SMITHY_CONTEXT_KEY = "__smithy_context";
    VE.getDefaultExtensionConfiguration = CHu;
    VE.resolveDefaultRuntimeConfig = RHu;
  });
  var cxs = __commonJS(F6 => {
    Object.defineProperty(F6, "__esModule", {
      value: true
    });
    F6.readFile = F6.fileIntercept = F6.filePromises = undefined;
    var kHu = require("fs/promises");
    F6.filePromises = {};
    F6.fileIntercept = {};
    var AHu = (e, t) => {
      if (F6.fileIntercept[e] !== undefined) {
        return F6.fileIntercept[e];
      }
      if (!F6.filePromises[e] || t?.ignoreCache) {
        F6.filePromises[e] = (0, kHu.readFile)(e, "utf8");
      }
      return F6.filePromises[e];
    };
    F6.readFile = AHu;
  });
  var Sj = __commonJS(bj => {
    var PDt = gMr();
    var uxs = yMr();
    var _Mr = axs();
    var Fhn = require("path");
    var Uhn = lxs();
    var Ztt = cxs();
    var IHu = e => e.profile || process.env["AWS_PROFILE"] || "default";
    var PHu = e => Object.entries(e).filter(([t]) => {
      let n = t.indexOf(".");
      if (n === -1) {
        return false;
      }
      return Object.values(Uhn.IniSectionType).includes(t.substring(0, n));
    }).reduce((t, [n, r]) => {
      let o = n.indexOf(".");
      let s = n.substring(0, o) === Uhn.IniSectionType.PROFILE ? n.substring(o + 1) : n;
      t[s] = r;
      return t;
    }, {
      ...(e.default && {
        default: e.default
      })
    });
    var fxs = () => process.env["AWS_CONFIG_FILE"] || Fhn.join(PDt.getHomeDir(), ".aws", "config");
    var MHu = () => process.env["AWS_SHARED_CREDENTIALS_FILE"] || Fhn.join(PDt.getHomeDir(), ".aws", "credentials");
    var LHu = ["__proto__", "profile __proto__"];
    var bMr = e => {
      let t = {};
      let n;
      let r;
      for (let o of e.split(/\r?\n/)) {
        let s = o.split(/(^|\s)[;#]/)[0].trim();
        if (s[0] === "[" && s[s.length - 1] === "]") {
          n = undefined;
          r = undefined;
          let a = s.substring(1, s.length - 1);
          let l = (/^([\w-]+)\s(["'])?([\w-@\+\.%:/]+)\2$/).exec(a);
          if (l) {
            let [, c,, u] = l;
            if (Object.values(Uhn.IniSectionType).includes(c)) {
              n = [c, u].join(".");
            }
          } else {
            n = a;
          }
          if (LHu.includes(a)) {
            throw Error(`Found invalid profile name "${a}"`);
          }
        } else if (n) {
          let a = s.indexOf("=");
          if (![0, -1].includes(a)) {
            let [l, c] = [s.substring(0, a).trim(), s.substring(a + 1).trim()];
            if (c === "") {
              r = l;
            } else {
              if (r && o.trimStart() === o) {
                r = undefined;
              }
              t[n] = t[n] || {};
              let u = r ? [r, l].join(".") : l;
              t[n][u] = c;
            }
          }
        }
      }
      return t;
    };
    var dxs = () => ({});
    var hxs = async (e = {}) => {
      let {
        filepath: t = MHu(),
        configFilepath: n = fxs()
      } = e;
      let r = PDt.getHomeDir();
      let o = "~/";
      let s = t;
      if (t.startsWith("~/")) {
        s = Fhn.join(r, t.slice(2));
      }
      let i = n;
      if (n.startsWith("~/")) {
        i = Fhn.join(r, n.slice(2));
      }
      let a = await Promise.all([Ztt.readFile(i, {
        ignoreCache: e.ignoreCache
      }).then(bMr).then(PHu).catch(dxs), Ztt.readFile(s, {
        ignoreCache: e.ignoreCache
      }).then(bMr).catch(dxs)]);
      return {
        configFile: a[0],
        credentialsFile: a[1]
      };
    };
    var FHu = e => Object.entries(e).filter(([t]) => t.startsWith(Uhn.IniSectionType.SSO_SESSION + ".")).reduce((t, [n, r]) => ({
      ...t,
      [n.substring(n.indexOf(".") + 1)]: r
    }), {});
    var UHu = () => ({});
    var BHu = async (e = {}) => Ztt.readFile(e.configFilepath ?? fxs()).then(bMr).then(FHu).catch(UHu);
    var $Hu = (...e) => {
      let t = {};
      for (let n of e) {
        for (let [r, o] of Object.entries(n)) {
          if (t[r] !== undefined) {
            Object.assign(t[r], o);
          } else {
            t[r] = o;
          }
        }
      }
      return t;
    };
    var HHu = async e => {
      let t = await hxs(e);
      return $Hu(t.configFile, t.credentialsFile);
    };
    var jHu = {
      getFileRecord() {
        return Ztt.fileIntercept;
      },
      interceptFile(e, t) {
        Ztt.fileIntercept[e] = Promise.resolve(t);
      },
      getTokenRecord() {
        return _Mr.tokenIntercept;
      },
      interceptToken(e, t) {
        _Mr.tokenIntercept[e] = t;
      }
    };
    Object.defineProperty(bj, "getSSOTokenFromFile", {
      enumerable: true,
      get: function () {
        return _Mr.getSSOTokenFromFile;
      }
    });
    Object.defineProperty(bj, "readFile", {
      enumerable: true,
      get: function () {
        return Ztt.readFile;
      }
    });
    bj.CONFIG_PREFIX_SEPARATOR = ".";
    bj.DEFAULT_PROFILE = "default";
    bj.ENV_PROFILE = "AWS_PROFILE";
    bj.externalDataInterceptor = jHu;
    bj.getProfileName = IHu;
    bj.loadSharedConfigFiles = hxs;
    bj.loadSsoSessionData = BHu;
    bj.parseKnownFiles = HHu;
    Object.keys(PDt).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(bj, e)) {
        Object.defineProperty(bj, e, {
          enumerable: true,
          get: function () {
            return PDt[e];
          }
        });
      }
    });
    Object.keys(uxs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(bj, e)) {
        Object.defineProperty(bj, e, {
          enumerable: true,
          get: function () {
            return uxs[e];
          }
        });
      }
    });
  });
  var VB = __commonJS(_xs => {
    var ODt = wy();
    var gxs = Sj();
    function yxs(e) {
      try {
        let t = new Set(Array.from(e.match(/([A-Z_]){3,}/g) ?? []));
        t.delete("CONFIG");
        t.delete("CONFIG_PREFIX_SEPARATOR");
        t.delete("ENV");
        return [...t].join(", ");
      } catch (t) {
        return e;
      }
    }
    var qHu = (e, t) => async () => {
      try {
        let n = e(process.env, t);
        if (n === undefined) {
          throw Error();
        }
        return n;
      } catch (n) {
        throw new ODt.CredentialsProviderError(n.message || `Not found in ENV: ${yxs(e.toString())}`, {
          logger: t?.logger
        });
      }
    };
    var WHu = (e, {
      preferredFile: t = "config",
      ...n
    } = {}) => async () => {
      let r = gxs.getProfileName(n);
      let {
        configFile: o,
        credentialsFile: s
      } = await gxs.loadSharedConfigFiles(n);
      let i = s[r] || {};
      let a = o[r] || {};
      let l = t === "config" ? {
        ...i,
        ...a
      } : {
        ...a,
        ...i
      };
      try {
        let u = e(l, t === "config" ? o : s);
        if (u === undefined) {
          throw Error();
        }
        return u;
      } catch (c) {
        throw new ODt.CredentialsProviderError(c.message || `Not found in config files w/ profile [${r}]: ${yxs(e.toString())}`, {
          logger: n.logger
        });
      }
    };
    var GHu = e => typeof e === "function";
    var VHu = e => GHu(e) ? async () => await e() : ODt.fromStatic(e);
    var zHu = ({
      environmentVariableSelector: e,
      configFileSelector: t,
      default: n
    }, r = {}) => {
      let {
        signingName: o,
        logger: s
      } = r;
      let i = {
        signingName: o,
        logger: s
      };
      return ODt.memoize(ODt.chain(qHu(e, i), WHu(t, r), VHu(n)));
    };
    _xs.loadConfig = zHu;
  });
  var bxs = __commonJS(ent => {
    var KHu = (e, t, n) => {
      if (!(t in e)) {
        return;
      }
      if (e[t] === "true") {
        return true;
      }
      if (e[t] === "false") {
        return false;
      }
      throw Error(`Cannot load ${n} "${t}". Expected "true" or "false", got ${e[t]}.`);
    };
    var YHu = (e, t, n) => {
      if (!(t in e)) {
        return;
      }
      let r = parseInt(e[t], 10);
      if (Number.isNaN(r)) {
        throw TypeError(`Cannot load ${n} '${t}'. Expected number, got '${e[t]}'.`);
      }
      return r;
    };
    ent.SelectorType = undefined;
    (function (e) {
      e.ENV = "env";
      e.CONFIG = "shared config entry";
    })(ent.SelectorType || (ent.SelectorType = {}));
    ent.booleanSelector = KHu;
    ent.numberSelector = YHu;
  });
  var Sxs = __commonJS(zE => {
    zE.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(zE.HttpAuthLocation || (zE.HttpAuthLocation = {}));
    zE.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(zE.HttpApiKeyAuthLocation || (zE.HttpApiKeyAuthLocation = {}));
    zE.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(zE.EndpointURLScheme || (zE.EndpointURLScheme = {}));
    zE.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(zE.AlgorithmId || (zE.AlgorithmId = {}));
    var JHu = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => zE.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => zE.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
        });
      }
      return {
        addChecksumAlgorithm(n) {
          t.push(n);
        },
        checksumAlgorithms() {
          return t;
        }
      };
    };
    var XHu = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var QHu = e => JHu(e);
    var ZHu = e => XHu(e);
    zE.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(zE.FieldPosition || (zE.FieldPosition = {}));
    zE.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(zE.IniSectionType || (zE.IniSectionType = {}));
    zE.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(zE.RequestHandlerProtocol || (zE.RequestHandlerProtocol = {}));
    zE.SMITHY_CONTEXT_KEY = "__smithy_context";
    zE.getDefaultExtensionConfiguration = QHu;
    zE.resolveDefaultRuntimeConfig = ZHu;
  });
  var zB = __commonJS(SMr => {
    var Txs = Sxs();
    var tju = e => e[Txs.SMITHY_CONTEXT_KEY] || (e[Txs.SMITHY_CONTEXT_KEY] = {});
    var nju = e => {
      if (typeof e === "function") {
        return e;
      }
      let t = Promise.resolve(e);
      return () => t;
    };
    SMr.getSmithyContext = tju;
    SMr.normalizeProvider = nju;
  });
  var Exs = __commonJS(KE => {
    KE.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(KE.HttpAuthLocation || (KE.HttpAuthLocation = {}));
    KE.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(KE.HttpApiKeyAuthLocation || (KE.HttpApiKeyAuthLocation = {}));
    KE.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(KE.EndpointURLScheme || (KE.EndpointURLScheme = {}));
    KE.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(KE.AlgorithmId || (KE.AlgorithmId = {}));
    var rju = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => KE.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => KE.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
        });
      }
      return {
        addChecksumAlgorithm(n) {
          t.push(n);
        },
        checksumAlgorithms() {
          return t;
        }
      };
    };
    var oju = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var sju = e => rju(e);
    var iju = e => oju(e);
    KE.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(KE.FieldPosition || (KE.FieldPosition = {}));
    KE.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(KE.IniSectionType || (KE.IniSectionType = {}));
    KE.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(KE.RequestHandlerProtocol || (KE.RequestHandlerProtocol = {}));
    KE.SMITHY_CONTEXT_KEY = "__smithy_context";
    KE.getDefaultExtensionConfiguration = sju;
    KE.resolveDefaultRuntimeConfig = iju;
  });
  var Lte = __commonJS(KHe => {
    var EMr = Exs();
    class vxs {
      capacity;
      data = new Map();
      parameters = [];
      constructor({
        size: e,
        params: t
      }) {
        if (this.capacity = e ?? 50, t) {
          this.parameters = t;
        }
      }
      get(e, t) {
        let n = this.hash(e);
        if (n === false) {
          return t();
        }
        if (!this.data.vZc(n)) {
          if (this.data.size > this.capacity + 10) {
            let r = this.data.keys();
            let o = 0;
            while (true) {
              let {
                value: s,
                done: i
              } = r.next();
              if (this.data.delete(s), i || ++o > 10) {
                break;
              }
            }
          }
          this.data.set(n, t());
        }
        return this.data.get(n);
      }
      size() {
        return this.data.size;
      }
      hash(e) {
        let t = "";
        let {
          parameters: n
        } = this;
        if (n.length === 0) {
          return false;
        }
        for (let r of n) {
          let o = String(e[r] ?? "");
          if (o.includes("|;")) {
            return false;
          }
          t += o + "|;";
        }
        return t;
      }
    }
    var lju = new RegExp("^(?:25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)(?:\\.(?:25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)){3}$");
    var wxs = e => lju.test(e) || e.startsWith("[") && e.endsWith("]");
    var cju = new RegExp("^(?!.*-$)(?!-)[a-zA-Z0-9-]{1,63}$");
    var wMr = (e, t = false) => {
      if (!t) {
        return cju.test(e);
      }
      let n = e.split(".");
      for (let r of n) {
        if (!wMr(r)) {
          return false;
        }
      }
      return true;
    };
    var vMr = {};
    function pke(e) {
      if (typeof e !== "object" || e == null) {
        return e;
      }
      if ("ref" in e) {
        return `$${pke(e.ref)}`;
      }
      if ("fn" in e) {
        return `${e.fn}(${(e.argv || []).map(pke).join(", ")})`;
      }
      return JSON.stringify(e, null, 2);
    }
    class Tj extends Error {
      constructor(e) {
        super(e);
        this.name = "EndpointError";
      }
    }
    var uju = (e, t) => e === t;
    var dju = e => {
      let t = e.split(".");
      let n = [];
      for (let r of t) {
        let o = r.indexOf("[");
        if (o !== -1) {
          if (r.indexOf("]") !== r.length - 1) {
            throw new Tj(`Path: '${e}' does not end with ']'`);
          }
          let s = r.slice(o + 1, -1);
          if (Number.isNaN(parseInt(s))) {
            throw new Tj(`Invalid array index: '${s}' in path: '${e}'`);
          }
          if (o !== 0) {
            n.push(r.slice(0, o));
          }
          n.push(s);
        } else {
          n.push(r);
        }
      }
      return n;
    };
    var Cxs = (e, t) => dju(t).reduce((n, r) => {
      if (typeof n !== "object") {
        throw new Tj(`Index '${r}' in '${t}' not found in '${JSON.stringify(e)}'`);
      } else if (Array.isArray(n)) {
        return n[parseInt(r)];
      }
      return n[r];
    }, e);
    var pju = e => e != null;
    var mju = e => !e;
    var TMr = {
      [EMr.EndpointURLScheme.HTTP]: 80,
      [EMr.EndpointURLScheme.HTTPS]: 443
    };
    var fju = e => {
      let t = (() => {
        try {
          if (e instanceof URL) {
            return e;
          }
          if (typeof e === "object" && "hostname" in e) {
            let {
              hostname: p,
              port: m,
              protocol: f = "",
              path: h = "",
              query: g = {}
            } = e;
            let y = new URL(`${f}//${p}${m ? `:${m}` : ""}${h}`);
            y.search = Object.entries(g).map(([_, b]) => `${_}=${b}`).join("&");
            return y;
          }
          return new URL(e);
        } catch (p) {
          return null;
        }
      })();
      if (!t) {
        console.error(`Unable to parse ${JSON.stringify(e)} as a whatwg URL.`);
        return null;
      }
      let n = t.href;
      let {
        host: r,
        hostname: o,
        pathname: s,
        protocol: i,
        search: a
      } = t;
      if (a) {
        return null;
      }
      let l = i.slice(0, -1);
      if (!Object.values(EMr.EndpointURLScheme).includes(l)) {
        return null;
      }
      let c = wxs(o);
      let u = n.includes(`${r}:${TMr[l]}`) || typeof e === "string" && e.includes(`${r}:${TMr[l]}`);
      let d = `${r}${u ? `:${TMr[l]}` : ""}`;
      return {
        scheme: l,
        authority: d,
        path: s,
        normalizedPath: s.endsWith("/") ? s : `${s}/`,
        isIp: c
      };
    };
    var hju = (e, t) => e === t;
    var gju = (e, t, n, r) => {
      if (t >= n || e.length < n) {
        return null;
      }
      if (!r) {
        return e.substring(t, n);
      }
      return e.substring(e.length - n, e.length - t);
    };
    var yju = e => encodeURIComponent(e).replace(/[!*'()]/g, t => `%${t.charCodeAt(0).toString(16).toUpperCase()}`);
    var _ju = {
      booleanEquals: uju,
      getAttr: Cxs,
      isSet: pju,
      isValidHostLabel: wMr,
      not: mju,
      parseURL: fju,
      stringEquals: hju,
      substring: gju,
      uriEncode: yju
    };
    var Rxs = (e, t) => {
      let n = [];
      let r = {
        ...t.endpointParams,
        ...t.referenceRecord
      };
      let o = 0;
      while (o < e.length) {
        let s = e.indexOf("{", o);
        if (s === -1) {
          n.push(e.slice(o));
          break;
        }
        n.push(e.slice(o, s));
        let i = e.indexOf("}", s);
        if (i === -1) {
          n.push(e.slice(s));
          break;
        }
        if (e[s + 1] === "{" && e[i + 1] === "}") {
          n.push(e.slice(s + 1, i));
          o = i + 2;
        }
        let a = e.substring(s + 1, i);
        if (a.includes("#")) {
          let [l, c] = a.split("#");
          n.push(Cxs(r[l], c));
        } else {
          n.push(r[a]);
        }
        o = i + 1;
      }
      return n.join("");
    };
    var bju = ({
      ref: e
    }, t) => ({
      ...t.endpointParams,
      ...t.referenceRecord
    })[e];
    var Bhn = (e, t, n) => {
      if (typeof e === "string") {
        return Rxs(e, n);
      } else if (e.fn) {
        return kxs.callFunction(e, n);
      } else if (e.ref) {
        return bju(e, n);
      }
      throw new Tj(`'${t}': ${String(e)} is not a string, function or reference.`);
    };
    var xxs = ({
      fn: e,
      argv: t
    }, n) => {
      let r = t.map(s => ["boolean", "number"].includes(typeof s) ? s : kxs.evaluateExpression(s, "arg", n));
      let o = e.split(".");
      if (o[0] in vMr && o[1] != null) {
        return vMr[o[0]][o[1]](...r);
      }
      return _ju[e](...r);
    };
    var kxs = {
      evaluateExpression: Bhn,
      callFunction: xxs
    };
    var Sju = ({
      assign: e,
      ...t
    }, n) => {
      if (e && e in n.referenceRecord) {
        throw new Tj(`'${e}' is already defined in Reference Record.`);
      }
      let r = xxs(t, n);
      n.logger?.debug?.(`${"endpoints"} evaluateCondition: ${pke(t)} = ${pke(r)}`);
      return {
        result: r === "" ? true : !!r,
        ...(e != null && {
          toAssign: {
            name: e,
            value: r
          }
        })
      };
    };
    var CMr = (e = [], t) => {
      let n = {};
      for (let r of e) {
        let {
          result: o,
          toAssign: s
        } = Sju(r, {
          ...t,
          referenceRecord: {
            ...t.referenceRecord,
            ...n
          }
        });
        if (!o) {
          return {
            result: o
          };
        }
        if (s) {
          n[s.name] = s.value;
          t.logger?.debug?.(`${"endpoints"} assign: ${s.name} := ${pke(s.value)}`);
        }
      }
      return {
        result: true,
        referenceRecord: n
      };
    };
    var Tju = (e, t) => Object.entries(e).reduce((n, [r, o]) => ({
      ...n,
      [r]: o.map(s => {
        let i = Bhn(s, "Header value entry", t);
        if (typeof i !== "string") {
          throw new Tj(`Header '${r}' value '${i}' is not a string`);
        }
        return i;
      })
    }), {});
    var Axs = (e, t) => Object.entries(e).reduce((n, [r, o]) => ({
      ...n,
      [r]: Pxs.getEndpointProperty(o, t)
    }), {});
    var Ixs = (e, t) => {
      if (Array.isArray(e)) {
        return e.map(n => Ixs(n, t));
      }
      switch (typeof e) {
        case "string":
          return Rxs(e, t);
        case "object":
          if (e === null) {
            throw new Tj(`Unexpected endpoint property: ${e}`);
          }
          return Pxs.getEndpointProperties(e, t);
        case "boolean":
          return e;
        default:
          throw new Tj(`Unexpected endpoint property type: ${typeof e}`);
      }
    };
    var Pxs = {
      getEndpointProperty: Ixs,
      getEndpointProperties: Axs
    };
    var Eju = (e, t) => {
      let n = Bhn(e, "Endpoint URL", t);
      if (typeof n === "string") {
        try {
          return new URL(n);
        } catch (r) {
          throw console.error(`Failed to construct URL with ${n}`, r), r;
        }
      }
      throw new Tj(`Endpoint URL must be a string, got ${typeof n}`);
    };
    var vju = (e, t) => {
      let {
        conditions: n,
        endpoint: r
      } = e;
      let {
        result: o,
        referenceRecord: s
      } = CMr(n, t);
      if (!o) {
        return;
      }
      let i = {
        ...t,
        referenceRecord: {
          ...t.referenceRecord,
          ...s
        }
      };
      let {
        url: a,
        properties: l,
        headers: c
      } = r;
      t.logger?.debug?.(`${"endpoints"} Resolving endpoint from template: ${pke(r)}`);
      return {
        ...(c != null && {
          headers: Tju(c, i)
        }),
        ...(l != null && {
          properties: Axs(l, i)
        }),
        url: Eju(a, i)
      };
    };
    var wju = (e, t) => {
      let {
        conditions: n,
        error: r
      } = e;
      let {
        result: o,
        referenceRecord: s
      } = CMr(n, t);
      if (!o) {
        return;
      }
      throw new Tj(Bhn(r, "Error", {
        ...t,
        referenceRecord: {
          ...t.referenceRecord,
          ...s
        }
      }));
    };
    var Oxs = (e, t) => {
      for (let n of e) {
        if (n.type === "endpoint") {
          let r = vju(n, t);
          if (r) {
            return r;
          }
        } else if (n.type === "error") {
          wju(n, t);
        } else if (n.type === "tree") {
          let r = Dxs.evaluateTreeRule(n, t);
          if (r) {
            return r;
          }
        } else {
          throw new Tj(`Unknown endpoint rule: ${n}`);
        }
      }
      throw new Tj("Rules evaluation failed");
    };
    var Cju = (e, t) => {
      let {
        conditions: n,
        rules: r
      } = e;
      let {
        result: o,
        referenceRecord: s
      } = CMr(n, t);
      if (!o) {
        return;
      }
      return Dxs.evaluateRules(r, {
        ...t,
        referenceRecord: {
          ...t.referenceRecord,
          ...s
        }
      });
    };
    var Dxs = {
      evaluateRules: Oxs,
      evaluateTreeRule: Cju
    };
    var Rju = (e, t) => {
      let {
        endpointParams: n,
        logger: r
      } = t;
      let {
        parameters: o,
        rules: s
      } = e;
      t.logger?.debug?.(`${"endpoints"} Initial EndpointParams: ${pke(n)}`);
      let i = Object.entries(o).filter(([, c]) => c.default != null).map(([c, u]) => [c, u.default]);
      if (i.length > 0) {
        for (let [c, u] of i) {
          n[c] = n[c] ?? u;
        }
      }
      let a = Object.entries(o).filter(([, c]) => c.required).map(([c]) => c);
      for (let c of a) {
        if (n[c] == null) {
          throw new Tj(`Missing required parameter: '${c}'`);
        }
      }
      let l = Oxs(s, {
        endpointParams: n,
        logger: r,
        referenceRecord: {}
      });
      t.logger?.debug?.(`${"endpoints"} Resolved endpoint: ${pke(l)}`);
      return l;
    };
    KHe.EndpointCache = vxs;
    KHe.EndpointError = Tj;
    KHe.customEndpointFunctions = vMr;
    KHe.isIpAddress = wxs;
    KHe.isValidHostLabel = wMr;
    KHe.resolveEndpoint = Rju;
  });