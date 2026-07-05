  __export(internals, {
    Serializer: () => Serializer,
    Deserializer: () => Deserializer
  });
  var Uvi = __lazy(() => {
    nkn();
    Gkn(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var C8r;
  var BW;
  var XP;
  var sp;
  var ManagedIdentitySourceNames;
  var Ok;
  var IC;
  var Vkn;
  var qvi;
  var zkn;
  var R8r;
  var Vj;
  var Y_e;
  var ZY;
  var Kkn;
  var PC = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    C8r = `https://login.microsoftonline.com/${"managed_identity"}/`;
    BW = {
      AUTHORIZATION_HEADER_NAME: "Authorization",
      METADATA_HEADER_NAME: "Metadata",
      APP_SERVICE_SECRET_HEADER_NAME: "X-IDENTITY-HEADER",
      ML_AND_SF_SECRET_HEADER_NAME: "secret"
    };
    XP = {
      API_VERSION: "api-version",
      RESOURCE: "resource",
      SHA256_TOKEN_TO_REFRESH: "token_sha256_to_refresh",
      XMS_CC: "xms_cc"
    };
    sp = {
      AZURE_POD_IDENTITY_AUTHORITY_HOST: "AZURE_POD_IDENTITY_AUTHORITY_HOST",
      DEFAULT_IDENTITY_CLIENT_ID: "DEFAULT_IDENTITY_CLIENT_ID",
      IDENTITY_ENDPOINT: "IDENTITY_ENDPOINT",
      IDENTITY_HEADER: "IDENTITY_HEADER",
      IDENTITY_SERVER_THUMBPRINT: "IDENTITY_SERVER_THUMBPRINT",
      IMDS_ENDPOINT: "IMDS_ENDPOINT",
      MSI_ENDPOINT: "MSI_ENDPOINT",
      MSI_SECRET: "MSI_SECRET"
    };
    ManagedIdentitySourceNames = {
      APP_SERVICE: "AppService",
      AZURE_ARC: "AzureArc",
      CLOUD_SHELL: "CloudShell",
      DEFAULT_TO_IMDS: "DefaultToImds",
      IMDS: "Imds",
      MACHINE_LEARNING: "MachineLearning",
      SERVICE_FABRIC: "ServiceFabric"
    };
    Ok = {
      SYSTEM_ASSIGNED: "system-assigned",
      USER_ASSIGNED_CLIENT_ID: "user-assigned-client-id",
      USER_ASSIGNED_RESOURCE_ID: "user-assigned-resource-id",
      USER_ASSIGNED_OBJECT_ID: "user-assigned-object-id"
    };
    IC = {
      GET: "get",
      POST: "post"
    };
    Vkn = {
      SUCCESS_RANGE_START: Wp.SUCCESS_RANGE_START,
      SUCCESS_RANGE_END: Wp.SUCCESS_RANGE_END,
      SERVER_ERROR: Wp.SERVER_ERROR
    };
    qvi = {
      SHA256: "sha256"
    };
    zkn = {
      CV_CHARSET: "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-._~"
    };
    R8r = {
      KEY_SEPARATOR: "-"
    };
    Vj = {
      MSAL_SKU: "msal.js.node",
      JWT_BEARER_ASSERTION_TYPE: "urn:ietf:params:oauth:client-assertion-type:jwt-bearer",
      AUTHORIZATION_PENDING: "authorization_pending",
      HTTP_PROTOCOL: "http://",
      LOCALHOST: "localhost"
    };
    Y_e = {
      acquireTokenSilent: 62,
      acquireTokenByUsernamePassword: 371,
      acquireTokenByDeviceCode: 671,
      acquireTokenByClientCredential: 771,
      acquireTokenByCode: 871,
      acquireTokenByRefreshToken: 872
    };
    ZY = {
      RSA_256: "RS256",
      PSS_256: "PS256",
      X5T_256: "x5t#S256",
      X5T: "x5t",
      X5C: "x5c",
      AUDIENCE: "aud",
      EXPIRATION_TIME: "exp",
      ISSUER: "iss",
      SUBJECT: "sub",
      NOT_BEFORE: "nbf",
      JWT_ID: "jti"
    };
    Kkn = {
      INTERVAL_MS: 100,
      TIMEOUT_MS: 5000
    };
  });
  class NUt {
    static getNetworkResponse(e, t, n) {
      return {
        headers: e,
        body: t,
        status: n
      };
    }
    static urlToHttpOptions(e) {
      let t = {
        protocol: e.protocol,
        hostname: e.hostname && e.hostname.startsWith("[") ? e.hostname.slice(1, -1) : e.hostname,
        hash: e.hash,
        search: e.search,
        pathname: e.pathname,
        path: `${e.pathname || ""}${e.search || ""}`,
        href: e.href
      };
      if (e.port !== "") {
        t.port = Number(e.port);
      }
      if (e.username || e.password) {
        t.auth = `${decodeURIComponent(e.username)}:${decodeURIComponent(e.password)}`;
      }
      return t;
    }
  }
  var Gvi = __lazy(() => {/*! @azure/msal-node v3.8.1 2025-10-29 */});
  class LUt {
    constructor(e, t) {
      this.proxyUrl = e || "";
      this.customAgentOptions = t || {};
    }
    async sendGetRequestAsync(e, t, n) {
      if (this.proxyUrl) {
        return Vvi(e, this.proxyUrl, IC.GET, t, this.customAgentOptions, n);
      } else {
        return zvi(e, IC.GET, t, this.customAgentOptions, n);
      }
    }
    async sendPostRequestAsync(e, t) {
      if (this.proxyUrl) {
        return Vvi(e, this.proxyUrl, IC.POST, t, this.customAgentOptions);
      } else {
        return zvi(e, IC.POST, t, this.customAgentOptions);
      }
    }
  }
  var Ykn;
  var x8r;
  var Vvi = (e, t, n, r, o, s) => {
    let i = new URL(e);
    let a = new URL(t);
    let l = r?.headers || {};
    let c = {
      host: a.hostname,
      port: a.port,
      method: "CONNECT",
      path: i.hostname,
      headers: l
    };
    if (o && Object.keys(o).length) {
      c.agent = new Ykn.default.Agent(o);
    }
    let u = "";
    if (n === IC.POST) {
      let p = r?.body || "";
      u = `Content-Type: application/x-www-form-urlencoded\r
Content-Length: ${p.length}\r
\r
${p}`;
    } else if (s) {
      c.timeout = s;
    }
    let d = `${n.toUpperCase()} ${i.href} HTTP/1.1\r
Host: ${i.host}\r
Connection: close\r
` + u + `\r
`;
    return new Promise((p, m) => {
      let f = Ykn.default.request(c);
      if (s) {
        f.on("timeout", () => {
          f.destroy();
          m(Error("Request time out"));
        });
      }
      f.end();
      f.on("connect", (h, g) => {
        let y = h?.statusCode || Vkn.SERVER_ERROR;
        if (y < Vkn.SUCCESS_RANGE_START || y > Vkn.SUCCESS_RANGE_END) {
          f.destroy();
          g.destroy();
          m(Error(`Error connecting to proxy. Http status code: ${h.statusCode}. Http status message: ${h?.statusMessage || "Unknown"}`));
        }
        g.write(d);
        let _ = [];
        g.on("data", b => {
          _.push(b);
        });
        g.on("end", () => {
          let S = Buffer.concat([..._]).toString().split(`\r
`);
          let E = parseInt(S[0].split(" ")[1]);
          let C = S[0].split(" ").slice(2).join(" ");
          let x = S[S.length - 1];
          let A = S.slice(1, S.length - 2);
          let k = new Map();
          A.forEach(L => {
            let P = L.split(new RegExp(/:\s(.*)/s));
            let F = P[0];
            let H = P[1];
            try {
              let U = JSON.parse(H);
              if (U && typeof U === "object") {
                H = U;
              }
            } catch (U) {}
            k.set(F, H);
          });
          let O = Object.fromEntries(k);
          let M = NUt.getNetworkResponse(O, Kvi(E, C, O, x), E);
          if ((E < Wp.SUCCESS_RANGE_START || E > Wp.SUCCESS_RANGE_END) && M.body.error !== Vj.AUTHORIZATION_PENDING) {
            f.destroy();
          }
          p(M);
        });
        g.on("error", b => {
          f.destroy();
          g.destroy();
          m(Error(b.toString()));
        });
      });
      f.on("error", h => {
        f.destroy();
        m(Error(h.toString()));
      });
    });
  };
  var zvi = (e, t, n, r, o) => {
    let s = t === IC.POST;
    let i = n?.body || "";
    let a = new URL(e);
    let l = n?.headers || {};
    let c = {
      method: t,
      headers: l,
      ...NUt.urlToHttpOptions(a)
    };
    if (r && Object.keys(r).length) {
      c.agent = new x8r.default.Agent(r);
    }
    if (s) {
      c.headers = {
        ...c.headers,
        "Content-Length": i.length
      };
    } else if (o) {
      c.timeout = o;
    }
    return new Promise((u, d) => {
      let p;
      if (c.protocol === "http:") {
        p = Ykn.default.request(c);
      } else {
        p = x8r.default.request(c);
      }
      if (s) {
        p.write(i);
      }
      if (o) {
        p.on("timeout", () => {
          p.destroy();
          d(Error("Request time out"));
        });
      }
      p.end();
      p.on("response", m => {
        let {
          headers: f,
          statusCode: h,
          statusMessage: g
        } = m;
        let y = [];
        m.on("data", _ => {
          y.push(_);
        });
        m.on("end", () => {
          let _ = Buffer.concat([...y]).toString();
          let b = f;
          let S = NUt.getNetworkResponse(b, Kvi(h, g, b, _), h);
          if ((h < Wp.SUCCESS_RANGE_START || h > Wp.SUCCESS_RANGE_END) && S.body.error !== Vj.AUTHORIZATION_PENDING) {
            p.destroy();
          }
          u(S);
        });
      });
      p.on("error", m => {
        p.destroy();
        d(Error(m.toString()));
      });
    });
  };
  var Kvi = (e, t, n, r) => {
    let o;
    try {
      o = JSON.parse(r);
    } catch (s) {
      let i;
      let a;
      if (e >= Wp.CLIENT_ERROR_RANGE_START && e <= Wp.CLIENT_ERROR_RANGE_END) {
        i = "client_error";
        a = "A client";
      } else if (e >= Wp.SERVER_ERROR_RANGE_START && e <= Wp.SERVER_ERROR_RANGE_END) {
        i = "server_error";
        a = "A server";
      } else {
        i = "unknown_error";
        a = "An unknown";
      }
      o = {
        error: i,
        error_description: `${a} error occured.
Http status code: ${e}
Http status message: ${t || "Unknown"}
Headers: ${JSON.stringify(n)}`
      };
    }
    return o;
  };
  var Yvi = __lazy(() => {
    lS();
    PC();
    Gvi();
    Ykn = __toESM(require("http"));
    x8r = __toESM(require("https"));
    /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var U3e;
  var B3e = __lazy(() => {
    PC(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    U3e = {
      [sp.AZURE_POD_IDENTITY_AUTHORITY_HOST]: "azure_pod_identity_authority_host_url_malformed",
      [sp.IDENTITY_ENDPOINT]: "identity_endpoint_url_malformed",
      [sp.IMDS_ENDPOINT]: "imds_endpoint_url_malformed",
      [sp.MSI_ENDPOINT]: "msi_endpoint_url_malformed"
    };
  });
  function xI(e) {
    return new k8r(e);
  }
  var E0d;
  var k8r;
  var mit = __lazy(() => {
    lS();
    B3e();
    PC(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    E0d = {
      ["invalid_file_extension"]: "The file path in the WWW-Authenticate header does not contain a .key file.",
      ["invalid_file_path"]: "The file path in the WWW-Authenticate header is not in a valid Windows or Linux Format.",
      ["invalid_managed_identity_id_type"]: "More than one ManagedIdentityIdType was provided.",
      ["invalid_secret"]: "The secret in the file on the file path in the WWW-Authenticate header is greater than 4096 bytes.",
      ["platform_not_supported"]: "The platform is not supported by Azure Arc. Azure Arc only supports Windows and Linux.",
      ["missing_client_id"]: "A ManagedIdentityId id was not provided.",
      [U3e.AZURE_POD_IDENTITY_AUTHORITY_HOST]: `The Managed Identity's '${sp.AZURE_POD_IDENTITY_AUTHORITY_HOST}' environment variable is malformed.`,
      [U3e.IDENTITY_ENDPOINT]: `The Managed Identity's '${sp.IDENTITY_ENDPOINT}' environment variable is malformed.`,
      [U3e.IMDS_ENDPOINT]: `The Managed Identity's '${sp.IMDS_ENDPOINT}' environment variable is malformed.`,
      [U3e.MSI_ENDPOINT]: `The Managed Identity's '${sp.MSI_ENDPOINT}' environment variable is malformed.`,
      ["network_unavailable"]: "Authentication unavailable. The request to the managed identity endpoint timed out.",
      ["unable_to_create_azure_arc"]: "Azure Arc Managed Identities can only be system assigned.",
      ["unable_to_create_cloud_shell"]: "Cloud Shell Managed Identities can only be system assigned.",
      ["unable_to_create_source"]: "Unable to create a Managed Identity source based on environment variables.",
      ["unable_to_read_secret_file"]: "Unable to read the secret file.",
      ["user_assigned_not_available_at_runtime"]: "Service Fabric user assigned managed identity ClientId or ResourceId is not configurable at runtime.",
      ["www_authenticate_header_missing"]: "A 401 response was received form the Azure Arc Managed Identity, but the www-authenticate header is missing.",
      ["www_authenticate_header_unsupported_format"]: "A 401 response was received form the Azure Arc Managed Identity, but the www-authenticate header is in an unsupported format."
    };
    k8r = class k8r extends AuthError {
      constructor(e) {
        super(e, E0d[e]);
        this.name = "ManagedIdentityError";
        Object.setPrototypeOf(this, k8r.prototype);
      }
    };
  });
  class A8r {
    get id() {
      return this._id;
    }
    set id(e) {
      this._id = e;
    }
    get idType() {
      return this._idType;
    }
    set idType(e) {
      this._idType = e;
    }
    constructor(e) {
      let t = e?.userAssignedClientId;
      let n = e?.userAssignedResourceId;
      let r = e?.userAssignedObjectId;
      if (t) {
        if (n || r) {
          throw xI("invalid_managed_identity_id_type");
        }
        this.id = t;
        this.idType = Ok.USER_ASSIGNED_CLIENT_ID;
      } else if (n) {
        if (t || r) {
          throw xI("invalid_managed_identity_id_type");
        }
        this.id = n;
        this.idType = Ok.USER_ASSIGNED_RESOURCE_ID;
      } else if (r) {
        if (t || n) {
          throw xI("invalid_managed_identity_id_type");
        }
        this.id = r;
        this.idType = Ok.USER_ASSIGNED_OBJECT_ID;
      } else {
        this.id = "system_assigned_managed_identity";
        this.idType = Ok.SYSTEM_ASSIGNED;
      }
    }
  }
  var Zvi = __lazy(() => {
    mit();
    PC();
    B3e(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var QP;
  var nx;
  var UUt = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    QP = {
      invalidLoopbackAddressType: {
        code: "invalid_loopback_server_address_type",
        desc: "Loopback server address is not type string. This is unexpected."
      },
      unableToLoadRedirectUri: {
        code: "unable_to_load_redirectUrl",
        desc: "Loopback server callback was invoked without a url. This is unexpected."
      },
      noAuthCodeInResponse: {
        code: "no_auth_code_in_response",
        desc: "No auth code found in the server response. Please check your network trace to determine what happened."
      },
      noLoopbackServerExists: {
        code: "no_loopback_server_exists",
        desc: "No loopback server exists yet."
      },
      loopbackServerAlreadyExists: {
        code: "loopback_server_already_exists",
        desc: "Loopback server already exists. Cannot create another."
      },
      loopbackServerTimeout: {
        code: "loopback_server_timeout",
        desc: "Timed out waiting for auth code listener to be registered."
      },
      stateNotFoundError: {
        code: "state_not_found",
        desc: "State not found. Please verify that the request originated from msal."
      },
      thumbprintMissing: {
        code: "thumbprint_missing_from_client_certificate",
        desc: "Client certificate does not contain a SHA-1 or SHA-256 thumbprint."
      },
      redirectUriNotSupported: {
        code: "redirect_uri_not_supported",
        desc: "RedirectUri is not supported in this scenario. Please remove redirectUri from the request."
      }
    };
    nx = class nx extends AuthError {
      constructor(e, t) {
        super(e, t);
        this.name = "NodeAuthError";
      }
      static createInvalidLoopbackAddressTypeError() {
        return new nx(QP.invalidLoopbackAddressType.code, `${QP.invalidLoopbackAddressType.desc}`);
      }
      static createUnableToLoadRedirectUrlError() {
        return new nx(QP.unableToLoadRedirectUri.code, `${QP.unableToLoadRedirectUri.desc}`);
      }
      static createNoAuthCodeInResponseError() {
        return new nx(QP.noAuthCodeInResponse.code, `${QP.noAuthCodeInResponse.desc}`);
      }
      static createNoLoopbackServerExistsError() {
        return new nx(QP.noLoopbackServerExists.code, `${QP.noLoopbackServerExists.desc}`);
      }
      static createLoopbackServerAlreadyExistsError() {
        return new nx(QP.loopbackServerAlreadyExists.code, `${QP.loopbackServerAlreadyExists.desc}`);
      }
      static createLoopbackServerTimeoutError() {
        return new nx(QP.loopbackServerTimeout.code, `${QP.loopbackServerTimeout.desc}`);
      }
      static createStateNotFoundError() {
        return new nx(QP.stateNotFoundError.code, QP.stateNotFoundError.desc);
      }
      static createThumbprintMissingError() {
        return new nx(QP.thumbprintMissing.code, QP.thumbprintMissing.desc);
      }
      static createRedirectUriNotSupportedError() {
        return new nx(QP.redirectUriNotSupported.code, QP.redirectUriNotSupported.desc);
      }
    };
  });
  function ewi({
    auth: e,
    broker: t,
    cache: n,
    system: r,
    telemetry: o
  }) {
    let s = {
      ...C0d,
      networkClient: new LUt(r?.proxyUrl, r?.customAgentOptions),
      loggerOptions: r?.loggerOptions || I8r,
      disableInternalRetries: r?.disableInternalRetries || false
    };
    if (!!e.clientCertificate && !e.clientCertificate.thumbprint && !e.clientCertificate.thumbprintSha256) {
      throw nx.createStateNotFoundError();
    }
    return {
      auth: {
        ...v0d,
        ...e
      },
      broker: {
        ...t
      },
      cache: {
        ...w0d,
        ...n
      },
      system: {
        ...s,
        ...r
      },
      telemetry: {
        ...R0d,
        ...o
      }
    };
  }
  function twi({
    clientCapabilities: e,
    managedIdentityIdParams: t,
    system: n
  }) {
    let r = new A8r(t);
    let o = n?.loggerOptions || I8r;
    let s;
    if (n?.networkClient) {
      s = n.networkClient;
    } else {
      s = new LUt(n?.proxyUrl, n?.customAgentOptions);
    }
    return {
      clientCapabilities: e || [],
      managedIdentityId: r,
      system: {
        loggerOptions: o,
        networkClient: s
      },
      disableInternalRetries: n?.disableInternalRetries || false
    };
  }
  var v0d;
  var w0d;
  var I8r;
  var C0d;
  var R0d;
  var P8r = __lazy(() => {
    lS();
    Yvi();
    Zvi();
    UUt(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    v0d = {
      clientId: xo.EMPTY_STRING,
      authority: xo.DEFAULT_AUTHORITY,
      clientSecret: xo.EMPTY_STRING,
      clientAssertion: xo.EMPTY_STRING,
      clientCertificate: {
        thumbprint: xo.EMPTY_STRING,
        thumbprintSha256: xo.EMPTY_STRING,
        privateKey: xo.EMPTY_STRING,
        x5c: xo.EMPTY_STRING
      },
      knownAuthorities: [],
      cloudDiscoveryMetadata: xo.EMPTY_STRING,
      authorityMetadata: xo.EMPTY_STRING,
      clientCapabilities: [],
      protocolMode: ProtocolMode.AAD,
      azureCloudOptions: {
        azureCloudInstance: AzureCloudInstance.None,
        tenant: xo.EMPTY_STRING
      },
      skipAuthorityMetadataCache: false,
      encodeExtraQueryParams: false
    };
    w0d = {
      claimsBasedCachingEnabled: false
    };
    I8r = {
      loggerCallback: () => {},
      piiLoggingEnabled: false,
      logLevel: LogLevel.Info
    };
    C0d = {
      loggerOptions: I8r,
      networkClient: new LUt(),
      proxyUrl: xo.EMPTY_STRING,
      customAgentOptions: {},
      disableInternalRetries: false
    };
    R0d = {
      application: {
        appName: xo.EMPTY_STRING,
        appVersion: xo.EMPTY_STRING
      }
    };
  });
  var nwi;
  var O8r;
  var rwi = __lazy(() => {
    nwi = require("crypto");
    O8r = {
      randomUUID: nwi.randomUUID
    };
  });
  function D8r() {
    if (sAn > iAn.length - 16) {
      owi.randomFillSync(iAn);
      sAn = 0;
    }
    return iAn.slice(sAn, sAn += 16);
  }
  var owi;
  var iAn;
  var sAn;
  var swi = __lazy(() => {
    owi = require("crypto");
    iAn = new Uint8Array(256);
    sAn = iAn.length;
  });
  function iwi(e, t = 0) {
    return (NF[e[t + 0]] + NF[e[t + 1]] + NF[e[t + 2]] + NF[e[t + 3]] + "-" + NF[e[t + 4]] + NF[e[t + 5]] + "-" + NF[e[t + 6]] + NF[e[t + 7]] + "-" + NF[e[t + 8]] + NF[e[t + 9]] + "-" + NF[e[t + 10]] + NF[e[t + 11]] + NF[e[t + 12]] + NF[e[t + 13]] + NF[e[t + 14]] + NF[e[t + 15]]).toLowerCase();
  }
  var NF;
  var awi = __lazy(() => {
    NF = [];
    for (let e = 0; e < 256; ++e) {
      NF.push((e + 256).toString(16).slice(1));
    }
  });
  function x0d(e, t, n) {
    if (O8r.randomUUID && !t && !e) {
      return O8r.randomUUID();
    }
    e = e || {};
    let r = e.random ?? e.rng?.() ?? D8r();
    if (r.length < 16) {
      throw Error("Random bytes length must be >= 16");
    }
    if (r[6] = r[6] & 15 | 64, r[8] = r[8] & 63 | 128, t) {
      if (n = n || 0, n < 0 || n + 16 > t.length) {
        throw RangeError(`UUID byte range ${n}:${n + 15} is out of buffer bounds`);
      }
      for (let o = 0; o < 16; ++o) {
        t[n + o] = r[o];
      }
      return t;
    }
    return iwi(r);
  }
  var cwi = __lazy(() => {});
  class BUt {
    generateGuid() {
      return x0d();
    }
    isGuid(e) {
      return /^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$/i.test(e);
    }
  }
  var N8r = __lazy(() => {
    cwi(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class $W {
    static base64Encode(e, t) {
      return Buffer.from(e, t).toString(DF.BASE64);
    }
    static base64EncodeUrl(e, t) {
      return $W.base64Encode(e, t).replace(/=/g, xo.EMPTY_STRING).replace(/\+/g, "-").replace(/\//g, "_");
    }
    static base64Decode(e) {
      return Buffer.from(e, DF.BASE64).toString("utf8");
    }
    static base64DecodeUrl(e) {
      let t = e.replace(/-/g, "+").replace(/_/g, "/");
      while (t.length % 4) {
        t += "=";
      }
      return $W.base64Decode(t);
    }
  }
  var $Ut = __lazy(() => {
    lS(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class $3e {
    sha256(e) {
      return uwi.default.createHash(qvi.SHA256).update(e).digest();
    }
  }
  var uwi;
  var aAn = __lazy(() => {
    PC();
    uwi = __toESM(require("crypto")); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class L8r {
    constructor() {
      this.hashUtils = new $3e();
    }
    async generatePkceCodes() {
      let e = this.generateCodeVerifier();
      let t = this.generateCodeChallengeFromVerifier(e);
      return {
        verifier: e,
        challenge: t
      };
    }
    generateCodeVerifier() {
      let e = [];
      let t = 256 - 256 % zkn.CV_CHARSET.length;
      while (e.length <= 32) {
        let r = dwi.default.randomBytes(1)[0];
        if (r >= t) {
          continue;
        }
        let o = r % zkn.CV_CHARSET.length;
        e.push(zkn.CV_CHARSET[o]);
      }
      let n = e.join(xo.EMPTY_STRING);
      return $W.base64EncodeUrl(n);
    }
    generateCodeChallengeFromVerifier(e) {
      return $W.base64EncodeUrl(this.hashUtils.sha256(e).toString(DF.BASE64), DF.BASE64);
    }
  }
  var dwi;
  var pwi = __lazy(() => {
    lS();
    PC();
    $Ut();
    aAn();
    dwi = __toESM(require("crypto")); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  class CryptoProvider {
    constructor() {
      this.pkceGenerator = new L8r();
      this.guidGenerator = new BUt();
      this.hashUtils = new $3e();
    }
    base64UrlEncode() {
      throw Error("Method not implemented.");
    }
    encodeKid() {
      throw Error("Method not implemented.");
    }
    createNewGuid() {
      return this.guidGenerator.generateGuid();
    }
    base64Encode(e) {
      return $W.base64Encode(e);
    }
    base64Decode(e) {
      return $W.base64Decode(e);
    }
    generatePkceCodes() {
      return this.pkceGenerator.generatePkceCodes();
    }
    getPublicKeyThumbprint() {
      throw Error("Method not implemented.");
    }
    removeTokenBindingKey() {
      throw Error("Method not implemented.");
    }
    clearKeystore() {
      throw Error("Method not implemented.");
    }
    signJwt() {
      throw Error("Method not implemented.");
    }
    async hashString(e) {
      return $W.base64EncodeUrl(this.hashUtils.sha256(e).toString(DF.BASE64), DF.BASE64);
    }
  }
  var HUt = __lazy(() => {
    lS();
    N8r();
    $Ut();
    pwi();
    aAn(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var lAn = __lazy(() => {
    aw();
    g6r(); /*! @azure/msal-common v15.13.1 2025-10-29 */
  });
  function Swi(e) {
    let t = e.credentialType === aS.REFRESH_TOKEN && e.familyId || e.clientId;
    let n = e.tokenType && e.tokenType.toLowerCase() !== Hh.BEARER.toLowerCase() ? e.tokenType.toLowerCase() : "";
    return [e.homeAccountId, e.environment, e.credentialType, t, e.realm || "", e.target || "", e.requestedClaimsHash || "", n].join(R8r.KEY_SEPARATOR).toLowerCase();
  }
  function Twi(e) {
    let t = e.homeAccountId.split(".")[1];
    return [e.homeAccountId, e.environment, t || e.tenantId || ""].join(R8r.KEY_SEPARATOR).toLowerCase();
  }
  var Ewi = __lazy(() => {
    lS();
    PC(); /*! @azure/msal-node v3.8.1 2025-10-29 */
  });
  var H3e;
  var cAn = __lazy(() => {
    lS();
    Gkn();
    nkn();
    lAn();
    Ewi(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    H3e = class H3e extends k3e {
      constructor(e, t, n, r) {
        super(t, n, e, new rit(), r);
        this.cache = {};
        this.changeEmitters = [];
        this.logger = e;
      }
      registerChangeEmitter(e) {
        this.changeEmitters.push(e);
      }
      emitChange() {
        this.changeEmitters.forEach(e => e.call(null));
      }
      cacheToInMemoryCache(e) {
        let t = {
          accounts: {},
          idTokens: {},
          accessTokens: {},
          refreshTokens: {},
          appMetadata: {}
        };
        for (let n in e) {
          let r = e[n];
          if (typeof r !== "object") {
            continue;
          }
          if (r instanceof JP) {
            t.accounts[n] = r;
          } else if (qj.isIdTokenEntity(r)) {
            t.idTokens[n] = r;
          } else if (qj.isAccessTokenEntity(r)) {
            t.accessTokens[n] = r;
          } else if (qj.isRefreshTokenEntity(r)) {
            t.refreshTokens[n] = r;
          } else if (qj.isAppMetadataEntity(n, r)) {
            t.appMetadata[n] = r;
          } else {
            continue;
          }
        }
        return t;
      }
      inMemoryCacheToCache(e) {
        let t = this.getCache();
        t = {
          ...t,
          ...e.accounts,
          ...e.idTokens,
          ...e.accessTokens,
          ...e.refreshTokens,
          ...e.appMetadata
        };
        return t;
      }
      getInMemoryCache() {
        this.logger.trace("Getting in-memory cache");
        return this.cacheToInMemoryCache(this.getCache());
      }
      setInMemoryCache(e) {
        this.logger.trace("Setting in-memory cache");
        let t = this.inMemoryCacheToCache(e);
        this.setCache(t);
        this.emitChange();
      }
      getCache() {
        this.logger.trace("Getting cache key-value store");
        return this.cache;
      }
      setCache(e) {
        this.logger.trace("Setting cache key value store");
        this.cache = e;
        this.emitChange();
      }
      getItem(e) {
        this.logger.tracePii(`Item key: ${e}`);
        return this.getCache()[e];
      }
      setItem(e, t) {
        this.logger.tracePii(`Item key: ${e}`);
        let n = this.getCache();
        n[e] = t;
        this.setCache(n);
      }
      generateCredentialKey(e) {
        return Swi(e);
      }
      generateAccountKey(e) {
        return Twi(e);
      }
      getAccountKeys() {
        let e = this.getInMemoryCache();
        return Object.keys(e.accounts);
      }
      getTokenKeys() {
        let e = this.getInMemoryCache();
        return {
          idToken: Object.keys(e.idTokens),
          accessToken: Object.keys(e.accessTokens),
          refreshToken: Object.keys(e.refreshTokens)
        };
      }
      getAccount(e) {
        return this.getItem(e) ? Object.assign(new JP(), this.getItem(e)) : null;
      }
      async setAccount(e) {
        let t = this.generateAccountKey(JP.getAccountInfo(e));
        this.setItem(t, e);
      }
      getIdTokenCredential(e) {
        let t = this.getItem(e);
        if (qj.isIdTokenEntity(t)) {
          return t;
        }
        return null;
      }
      async setIdTokenCredential(e) {
        let t = this.generateCredentialKey(e);
        this.setItem(t, e);
      }
      getAccessTokenCredential(e) {
        let t = this.getItem(e);
        if (qj.isAccessTokenEntity(t)) {
          return t;
        }
        return null;
      }
      async setAccessTokenCredential(e) {
        let t = this.generateCredentialKey(e);
        this.setItem(t, e);
      }
      getRefreshTokenCredential(e) {
        let t = this.getItem(e);
        if (qj.isRefreshTokenEntity(t)) {
          return t;
        }
        return null;
      }
      async setRefreshTokenCredential(e) {
        let t = this.generateCredentialKey(e);
        this.setItem(t, e);
      }
      getAppMetadata(e) {
        let t = this.getItem(e);
        if (qj.isAppMetadataEntity(e, t)) {
          return t;
        }
        return null;
      }
      setAppMetadata(e) {
        let t = qj.generateAppMetadataKey(e);
        this.setItem(t, e);
      }
      getServerTelemetry(e) {
        let t = this.getItem(e);
        if (t && qj.isServerTelemetryEntity(e, t)) {
          return t;
        }
        return null;
      }
      setServerTelemetry(e, t) {
        this.setItem(e, t);
      }
      getAuthorityMetadata(e) {
        let t = this.getItem(e);
        if (t && qj.isAuthorityMetadataEntity(e, t)) {
          return t;
        }
        return null;
      }
      getAuthorityMetadataKeys() {
        return this.getKeys().filter(e => this.isAuthorityMetadata(e));
      }
      setAuthorityMetadata(e, t) {
        this.setItem(e, t);
      }
      getThrottlingCache(e) {
        let t = this.getItem(e);
        if (t && qj.isThrottlingEntity(e, t)) {
          return t;
        }
        return null;
      }
      setThrottlingCache(e, t) {
        this.setItem(e, t);
      }
      removeItem(e) {
        this.logger.tracePii(`Item key: ${e}`);
        let t = false;
        let n = this.getCache();
        if (n[e]) {
          delete n[e];
          t = true;
        }
        if (t) {
          this.setCache(n);
          this.emitChange();
        }
        return t;
      }
      removeOutdatedAccount(e) {
        this.removeItem(e);
      }
      containsKey(e) {
        return this.getKeys().includes(e);
      }
      getKeys() {
        this.logger.trace("Retrieving all cache keys");
        let e = this.getCache();
        return [...Object.keys(e)];
      }
      clear() {
        this.logger.trace("Clearing cache entries created by MSAL");
        this.getKeys().forEach(t => {
          this.removeItem(t);
        });
        this.emitChange();
      }
      static generateInMemoryCache(e) {
        return Deserializer.deserializeAllCache(Deserializer.deserializeJSONBlob(e));
      }
      static generateJsonCache(e) {
        return Serializer.serializeAllCache(e);
      }
      updateCredentialCacheKey(e, t) {
        let n = this.generateCredentialKey(t);
        if (e !== n) {
          let r = this.getItem(e);
          if (r) {
            this.removeItem(e);
            this.setItem(n, r);
            this.logger.verbose(`Updated an outdated ${t.credentialType} cache key`);
            return n;
          } else {
            this.logger.error(`Attempted to update an outdated ${t.credentialType} cache key but no item matching the outdated key was found in storage`);
          }
        }
        return e;
      }
    };
  });
  class TokenCache_export {
    constructor(e, t, n) {
      if (this.cacheHasChanged = false, this.storage = e, this.storage.registerChangeEmitter(this.handleChangeEvent.bind(this)), n) {
        this.persistence = n;
      }
      this.logger = t;
    }
    hasChanged() {
      return this.cacheHasChanged;
    }
    serialize() {
      this.logger.trace("Serializing in-memory cache");
      let e = Serializer.serializeAllCache(this.storage.getInMemoryCache());
      if (this.cacheSnapshot) {
        this.logger.trace("Reading cache snapshot from disk");
        e = this.mergeState(JSON.parse(this.cacheSnapshot), e);
      } else {
        this.logger.trace("No cache snapshot to merge");
      }
      this.cacheHasChanged = false;
      return JSON.stringify(e);
    }
    deserialize(e) {
      if (this.logger.trace("Deserializing JSON to in-memory cache"), this.cacheSnapshot = e, this.cacheSnapshot) {
        this.logger.trace("Reading cache snapshot from disk");
        let t = Deserializer.deserializeAllCache(this.overlayDefaults(JSON.parse(this.cacheSnapshot)));
        this.storage.setInMemoryCache(t);
      } else {
        this.logger.trace("No cache snapshot to deserialize");
      }
    }
    getKVStore() {
      return this.storage.getCache();
    }
    getCacheSnapshot() {
      let e = H3e.generateInMemoryCache(this.cacheSnapshot);
      return this.storage.inMemoryCacheToCache(e);
    }
    async getAllAccounts(e = new CryptoProvider().createNewGuid()) {
      this.logger.trace("getAllAccounts called");
      let t;
      try {
        if (this.persistence) {
          t = new TokenCacheContext(this, false);
          await this.persistence.beforeCacheAccess(t);
        }
        return this.storage.getAllAccounts({}, e);
      } finally {
        if (this.persistence && t) {
          await this.persistence.afterCacheAccess(t);
        }
      }
    }
    async getAccountByHomeId(e) {
      let t = await this.getAllAccounts();
      if (e && t && t.length) {
        return t.filter(n => n.homeAccountId === e)[0] || null;
      } else {
        return null;
      }
    }
    async getAccountByLocalId(e) {
      let t = await this.getAllAccounts();
      if (e && t && t.length) {
        return t.filter(n => n.localAccountId === e)[0] || null;
      } else {
        return null;
      }
    }
    async removeAccount(e, t) {
      this.logger.trace("removeAccount called");
      let n;
      try {
        if (this.persistence) {
          n = new TokenCacheContext(this, true);
          await this.persistence.beforeCacheAccess(n);
        }
        this.storage.removeAccount(e, t || new BUt().generateGuid());
      } finally {
        if (this.persistence && n) {
          await this.persistence.afterCacheAccess(n);
        }
      }
    }
    async overwriteCache() {
      if (!this.persistence) {
        this.logger.info("No persistence layer specified, cache cannot be overwritten");
        return;
      }
      this.logger.info("Overwriting in-memory cache with persistent cache");
      this.storage.clear();
      let e = new TokenCacheContext(this, false);
      await this.persistence.beforeCacheAccess(e);
      let t = this.getCacheSnapshot();
      this.storage.setCache(t);
      await this.persistence.afterCacheAccess(e);
    }
    handleChangeEvent() {
      this.cacheHasChanged = true;
    }
    mergeState(e, t) {
      this.logger.trace("Merging in-memory cache with cache snapshot");
      let n = this.mergeRemovals(e, t);
      return this.mergeUpdates(n, t);
    }
    mergeUpdates(e, t) {
      Object.keys(t).forEach(n => {
        let r = t[n];
        if (!e.hasOwnProperty(n)) {
          if (r !== null) {
            e[n] = r;
          }
        } else {
          let o = r !== null;
          let s = typeof r === "object";
          let i = !Array.isArray(r);
          let a = typeof e[n] < "u" && e[n] !== null;
          if (o && s && i && a) {
            this.mergeUpdates(e[n], r);
          } else {
            e[n] = r;
          }
        }
      });
      return e;
    }
    mergeRemovals(e, t) {
      this.logger.trace("Remove updated entries in cache");
      let n = e.Account ? this.mergeRemovalsDict(e.Account, t.Account) : e.Account;
      let r = e.AccessToken ? this.mergeRemovalsDict(e.AccessToken, t.AccessToken) : e.AccessToken;
      let o = e.RefreshToken ? this.mergeRemovalsDict(e.RefreshToken, t.RefreshToken) : e.RefreshToken;
      let s = e.IdToken ? this.mergeRemovalsDict(e.IdToken, t.IdToken) : e.IdToken;
      let i = e.AppMetadata ? this.mergeRemovalsDict(e.AppMetadata, t.AppMetadata) : e.AppMetadata;
      return {
        ...e,
        Account: n,
        AccessToken: r,
        RefreshToken: o,
        IdToken: s,
        AppMetadata: i
      };
    }
    mergeRemovalsDict(e, t) {
      let n = {
        ...e
      };
      Object.keys(e).forEach(r => {
        if (!t || !t.hasOwnProperty(r)) {
          delete n[r];
        }
      });
      return n;
    }
    overlayDefaults(e) {
      this.logger.trace("Overlaying input cache with the default cache");
      return {
        Account: {
          ...jUt.Account,
          ...e.Account
        },
        IdToken: {
          ...jUt.IdToken,
          ...e.IdToken
        },
        AccessToken: {
          ...jUt.AccessToken,
          ...e.AccessToken
        },
        RefreshToken: {
          ...jUt.RefreshToken,
          ...e.RefreshToken
        },
        AppMetadata: {
          ...jUt.AppMetadata,
          ...e.AppMetadata
        }
      };
    }
  }
  var jUt;
  var W8r = __lazy(() => {
    cAn();
    lS();
    Gkn();
    nkn();
    HUt();
    N8r(); /*! @azure/msal-node v3.8.1 2025-10-29 */
    jUt = {
      Account: {},
      IdToken: {},
      AccessToken: {},
      RefreshToken: {},
      AppMetadata: {}
    };
  });