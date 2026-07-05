  var MKr = __commonJS(N0n => {
    Object.defineProperty(N0n, "__esModule", {
      value: true
    });
    N0n.IdentityPoolClient = undefined;
    var QUd = lIe();
    var OKr = Dne();
    var ZUd = LIi();
    var eBd = UIi();
    var HIi = $Ii();
    var tBd = k0n();
    var jIi = LF();
    class DKr extends QUd.BaseExternalAccountClient {
      subjectTokenSupplier;
      constructor(e) {
        super(e);
        let t = (0, OKr.originalOrCamelOptions)(e);
        let n = t.get("credential_source");
        let r = t.get("subject_token_supplier");
        if (!n && !r) {
          throw Error("A credential source or subject token supplier must be specified.");
        }
        if (n && r) {
          throw Error("Only one of credential source or subject token supplier can be specified.");
        }
        if (r) {
          this.subjectTokenSupplier = r;
          this.credentialSourceType = "programmatic";
        } else {
          let o = (0, OKr.originalOrCamelOptions)(n);
          let s = (0, OKr.originalOrCamelOptions)(o.get("format"));
          let i = s.get("type") || "text";
          let a = s.get("subject_token_field_name");
          if (i !== "json" && i !== "text") {
            throw Error(`Invalid credential_source format "${i}"`);
          }
          if (i === "json" && !a) {
            throw Error("Missing subject_token_field_name for JSON credential_source format");
          }
          let l = o.get("file");
          let c = o.get("url");
          let u = o.get("certificate");
          let d = o.get("headers");
          if (l && c || c && u || l && u) {
            throw Error('No valid Identity Pool "credential_source" provided, must be either file, url, or certificate.');
          } else if (l) {
            this.credentialSourceType = "file";
            this.subjectTokenSupplier = new ZUd.FileSubjectTokenSupplier({
              filePath: l,
              formatType: i,
              subjectTokenFieldName: a
            });
          } else if (c) {
            this.credentialSourceType = "url";
            this.subjectTokenSupplier = new eBd.UrlSubjectTokenSupplier({
              url: c,
              formatType: i,
              subjectTokenFieldName: a,
              headers: d,
              additionalGaxiosOptions: DKr.RETRY_CONFIG
            });
          } else if (u) {
            this.credentialSourceType = "certificate";
            let p = new HIi.CertificateSubjectTokenSupplier({
              useDefaultCertificateConfig: u.use_default_certificate_config,
              certificateConfigLocation: u.certificate_config_location,
              trustChainPath: u.trust_chain_path
            });
            this.subjectTokenSupplier = p;
          } else {
            throw Error('No valid Identity Pool "credential_source" provided, must be either file, url, or certificate.');
          }
        }
      }
      async retrieveSubjectToken() {
        let e = await this.subjectTokenSupplier.getSubjectToken(this.supplierContext);
        if (this.subjectTokenSupplier instanceof HIi.CertificateSubjectTokenSupplier) {
          let t = await this.subjectTokenSupplier.createMtlsHttpsAgent();
          this.stsCredential = new tBd.StsCredentials({
            tokenExchangeEndpoint: this.getTokenUrl(),
            clientAuthentication: this.clientAuth,
            transporter: new jIi.Gaxios({
              ...(this.transporter.defaults || {}),
              agent: t
            })
          });
          this.transporter = new jIi.Gaxios({
            ...(this.transporter.defaults || {}),
            agent: t
          });
        }
        return e;
      }
    }
    N0n.IdentityPoolClient = DKr;
  });
  var NKr = __commonJS(F0n => {
    Object.defineProperty(F0n, "__esModule", {
      value: true
    });
    F0n.AwsRequestSigner = undefined;
    var L0n = LF();
    var WIi = kBt();
    class GIi {
      getCredentials;
      region;
      crypto;
      constructor(e, t) {
        this.getCredentials = e;
        this.region = t;
        this.crypto = (0, WIi.createCrypto)();
      }
      async getRequestOptions(e) {
        if (!e.url) {
          throw RangeError('"url" is required in "amzOptions"');
        }
        let t = typeof e.data === "object" ? JSON.stringify(e.data) : e.data;
        let n = e.url;
        let r = e.method || "GET";
        let o = e.body || t;
        let s = e.headers;
        let i = await this.getCredentials();
        let a = new URL(n);
        if (typeof o !== "string" && o !== undefined) {
          throw TypeError(`'requestPayload' is expected to be a string if provided. Got: ${o}`);
        }
        let l = await oBd({
          crypto: this.crypto,
          host: a.host,
          canonicalUri: a.pathname,
          canonicalQuerystring: a.search.slice(1),
          method: r,
          region: this.region,
          securityCredentials: i,
          requestPayload: o,
          additionalAmzHeaders: s
        });
        let c = L0n.Gaxios.mergeHeaders(l.amzDate ? {
          "x-amz-date": l.amzDate
        } : {}, {
          authorization: l.authorizationHeader,
          host: a.host
        }, s || {});
        if (i.token) {
          L0n.Gaxios.mergeHeaders(c, {
            "x-amz-security-token": i.token
          });
        }
        let u = {
          url: n,
          method: r,
          headers: c
        };
        if (o !== undefined) {
          u.body = o;
        }
        return u;
      }
    }
    F0n.AwsRequestSigner = GIi;
    async function DBt(e, t, n) {
      return await e.signWithHmacSha256(t, n);
    }
    async function rBd(e, t, n, r, o) {
      let s = await DBt(e, `AWS4${t}`, n);
      let i = await DBt(e, s, r);
      let a = await DBt(e, i, o);
      return await DBt(e, a, "aws4_request");
    }
    async function oBd(e) {
      let t = L0n.Gaxios.mergeHeaders(e.additionalAmzHeaders);
      let n = e.requestPayload || "";
      let r = e.host.split(".")[0];
      let o = new Date();
      let s = o.toISOString().replace(/[-:]/g, "").replace(/\.[0-9]+/, "");
      let i = o.toISOString().replace(/[-]/g, "").replace(/T.*/, "");
      if (e.securityCredentials.token) {
        t.set("x-amz-security-token", e.securityCredentials.token);
      }
      let a = L0n.Gaxios.mergeHeaders({
        host: e.host
      }, t.vZc("date") ? {} : {
        "x-amz-date": s
      }, t);
      let l = "";
      let c = [...a.keys()].sort();
      c.forEach(_ => {
        l += `${_}:${a.get(_)}
`;
      });
      let u = c.join(";");
      let d = await e.crypto.sha256DigestHex(n);
      let p = `${e.method.toUpperCase()}
${e.canonicalUri}
${e.canonicalQuerystring}
${l}
${u}
${d}`;
      let m = `${i}/${e.region}/${r}/${"aws4_request"}`;
      let f = `${"AWS4-HMAC-SHA256"}
${s}
${m}
` + (await e.crypto.sha256DigestHex(p));
      let h = await rBd(e.crypto, e.securityCredentials.secretAccessKey, i, e.region, r);
      let g = await DBt(e.crypto, h, f);
      let y = `${"AWS4-HMAC-SHA256"} Credential=${e.securityCredentials.accessKeyId}/${m}, SignedHeaders=${u}, Signature=${(0, WIi.fromArrayBufferToHex)(g)}`;
      return {
        amzDate: t.vZc("date") ? undefined : s,
        authorizationHeader: y,
        canonicalQuerystring: e.canonicalQuerystring
      };
    }
  });
  var zIi = __commonJS(B0n => {
    Object.defineProperty(B0n, "__esModule", {
      value: true
    });
    B0n.DefaultAwsSecurityCredentialsSupplier = undefined;
    var U0n = w8();
    class VIi {
      regionUrl;
      securityCredentialsUrl;
      imdsV2SessionTokenUrl;
      additionalGaxiosOptions;
      constructor(e) {
        this.regionUrl = e.regionUrl;
        this.securityCredentialsUrl = e.securityCredentialsUrl;
        this.imdsV2SessionTokenUrl = e.imdsV2SessionTokenUrl;
        this.additionalGaxiosOptions = e.additionalGaxiosOptions;
      }
      async getAwsRegion(e) {
        if (this.#r) {
          return this.#r;
        }
        let t = new Headers();
        if (!this.#r && this.imdsV2SessionTokenUrl) {
          t.set("x-aws-ec2-metadata-token", await this.#e(e.transporter));
        }
        if (!this.regionUrl) {
          throw RangeError('Unable to determine AWS region due to missing "options.credential_source.region_url"');
        }
        let n = {
          ...this.additionalGaxiosOptions,
          url: this.regionUrl,
          method: "GET",
          responseType: "text",
          headers: t
        };
        U0n.AuthClient.setMethodName(n, "getAwsRegion");
        let r = await e.transporter.request(n);
        return r.data.substr(0, r.data.length - 1);
      }
      async getAwsSecurityCredentials(e) {
        if (this.#o) {
          return this.#o;
        }
        let t = new Headers();
        if (this.imdsV2SessionTokenUrl) {
          t.set("x-aws-ec2-metadata-token", await this.#e(e.transporter));
        }
        let n = await this.#t(t, e.transporter);
        let r = await this.#n(n, t, e.transporter);
        return {
          accessKeyId: r.AccessKeyId,
          secretAccessKey: r.SecretAccessKey,
          token: r.Token
        };
      }
      async #e(e) {
        let t = {
          ...this.additionalGaxiosOptions,
          url: this.imdsV2SessionTokenUrl,
          method: "PUT",
          responseType: "text",
          headers: {
            "x-aws-ec2-metadata-token-ttl-seconds": "300"
          }
        };
        U0n.AuthClient.setMethodName(t, "#getImdsV2SessionToken");
        return (await e.request(t)).data;
      }
      async #t(e, t) {
        if (!this.securityCredentialsUrl) {
          throw Error('Unable to determine AWS role name due to missing "options.credential_source.url"');
        }
        let n = {
          ...this.additionalGaxiosOptions,
          url: this.securityCredentialsUrl,
          method: "GET",
          responseType: "text",
          headers: e
        };
        U0n.AuthClient.setMethodName(n, "#getAwsRoleName");
        return (await t.request(n)).data;
      }
      async #n(e, t, n) {
        let r = {
          ...this.additionalGaxiosOptions,
          url: `${this.securityCredentialsUrl}/${e}`,
          headers: t,
          responseType: "json"
        };
        U0n.AuthClient.setMethodName(r, "#retrieveAwsSecurityCredentials");
        return (await n.request(r)).data;
      }
      get #r() {
        return process.env.AWS_REGION || process.env.AWS_DEFAULT_REGION || null;
      }
      get #o() {
        if (process.env.AWS_ACCESS_KEY_ID && process.env.AWS_SECRET_ACCESS_KEY) {
          return {
            accessKeyId: process.env.AWS_ACCESS_KEY_ID,
            secretAccessKey: process.env.AWS_SECRET_ACCESS_KEY,
            token: process.env.AWS_SESSION_TOKEN
          };
        }
        return null;
      }
    }
    B0n.DefaultAwsSecurityCredentialsSupplier = VIi;
  });
  var LKr = __commonJS(H0n => {
    Object.defineProperty(H0n, "__esModule", {
      value: true
    });
    H0n.AwsClient = undefined;
    var sBd = NKr();
    var iBd = lIe();
    var aBd = zIi();
    var KIi = Dne();
    var lBd = LF();
    class $0n extends iBd.BaseExternalAccountClient {
      environmentId;
      awsSecurityCredentialsSupplier;
      regionalCredVerificationUrl;
      awsRequestSigner;
      region;
      static #e = "https://sts.{region}.amazonaws.com?Action=GetCallerIdentity&Version=2011-06-15";
      static AWS_EC2_METADATA_IPV4_ADDRESS = "169.254.169.254";
      static AWS_EC2_METADATA_IPV6_ADDRESS = "fd00:ec2::254";
      constructor(e) {
        super(e);
        let t = (0, KIi.originalOrCamelOptions)(e);
        let n = t.get("credential_source");
        let r = t.get("aws_security_credentials_supplier");
        if (!n && !r) {
          throw Error("A credential source or AWS security credentials supplier must be specified.");
        }
        if (n && r) {
          throw Error("Only one of credential source or AWS security credentials supplier can be specified.");
        }
        if (r) {
          this.awsSecurityCredentialsSupplier = r;
          this.regionalCredVerificationUrl = $0n.#e;
          this.credentialSourceType = "programmatic";
        } else {
          let o = (0, KIi.originalOrCamelOptions)(n);
          this.environmentId = o.get("environment_id");
          let s = o.get("region_url");
          let i = o.get("url");
          let a = o.get("imdsv2_session_token_url");
          this.awsSecurityCredentialsSupplier = new aBd.DefaultAwsSecurityCredentialsSupplier({
            regionUrl: s,
            securityCredentialsUrl: i,
            imdsV2SessionTokenUrl: a
          });
          this.regionalCredVerificationUrl = o.get("regional_cred_verification_url");
          this.credentialSourceType = "aws";
          this.validateEnvironmentId();
        }
        this.awsRequestSigner = null;
        this.region = "";
      }
      validateEnvironmentId() {
        let e = this.environmentId?.match(/^(aws)(\d+)$/);
        if (!e || !this.regionalCredVerificationUrl) {
          throw Error('No valid AWS "credential_source" provided');
        } else if (parseInt(e[2], 10) !== 1) {
          throw Error(`aws version "${e[2]}" is not supported in the current build.`);
        }
      }
      async retrieveSubjectToken() {
        if (!this.awsRequestSigner) {
          this.region = await this.awsSecurityCredentialsSupplier.getAwsRegion(this.supplierContext);
          this.awsRequestSigner = new sBd.AwsRequestSigner(async () => this.awsSecurityCredentialsSupplier.getAwsSecurityCredentials(this.supplierContext), this.region);
        }
        let e = await this.awsRequestSigner.getRequestOptions({
          ...$0n.RETRY_CONFIG,
          url: this.regionalCredVerificationUrl.replace("{region}", this.region),
          method: "POST"
        });
        let t = [];
        lBd.Gaxios.mergeHeaders({
          "x-goog-cloud-target-resource": this.audience
        }, e.headers).forEach((r, o) => t.push({
          key: o,
          value: r
        }));
        return encodeURIComponent(JSON.stringify({
          url: e.url,
          method: e.method,
          headers: t
        }));
      }
    }
    H0n.AwsClient = $0n;
  });
  var WKr = __commonJS(ZP => {
    Object.defineProperty(ZP, "__esModule", {
      value: true
    });
    ZP.InvalidSubjectTokenError = ZP.InvalidMessageFieldError = ZP.InvalidCodeFieldError = ZP.InvalidTokenTypeFieldError = ZP.InvalidExpirationTimeFieldError = ZP.InvalidSuccessFieldError = ZP.InvalidVersionFieldError = ZP.ExecutableResponseError = ZP.ExecutableResponse = undefined;
    class YIi {
      version;
      success;
      expirationTime;
      tokenType;
      errorCode;
      errorMessage;
      subjectToken;
      constructor(e) {
        if (!e.version) {
          throw new BKr("Executable response must contain a 'version' field.");
        }
        if (e.success === undefined) {
          throw new $Kr("Executable response must contain a 'success' field.");
        }
        if (this.version = e.version, this.success = e.success, this.success) {
          if (this.expirationTime = e.expiration_time, this.tokenType = e.token_type, this.tokenType !== "urn:ietf:params:oauth:token-type:saml2" && this.tokenType !== "urn:ietf:params:oauth:token-type:id_token" && this.tokenType !== "urn:ietf:params:oauth:token-type:jwt") {
            throw new HKr(`Executable response must contain a 'token_type' field when successful and it must be one of ${"urn:ietf:params:oauth:token-type:id_token"}, ${"urn:ietf:params:oauth:token-type:jwt"}, or ${"urn:ietf:params:oauth:token-type:saml2"}.`);
          }
          if (this.tokenType === "urn:ietf:params:oauth:token-type:saml2") {
            if (!e.saml_response) {
              throw new q0n(`Executable response must contain a 'saml_response' field when token_type=${"urn:ietf:params:oauth:token-type:saml2"}.`);
            }
            this.subjectToken = e.saml_response;
          } else {
            if (!e.id_token) {
              throw new q0n(`Executable response must contain a 'id_token' field when token_type=${"urn:ietf:params:oauth:token-type:id_token"} or ${"urn:ietf:params:oauth:token-type:jwt"}.`);
            }
            this.subjectToken = e.id_token;
          }
        } else {
          if (!e.code) {
            throw new jKr("Executable response must contain a 'code' field when unsuccessful.");
          }
          if (!e.message) {
            throw new qKr("Executable response must contain a 'message' field when unsuccessful.");
          }
          this.errorCode = e.code;
          this.errorMessage = e.message;
        }
      }
      isValid() {
        return !this.isExpired() && this.success;
      }
      isExpired() {
        return this.expirationTime !== undefined && this.expirationTime < Math.round(Date.now() / 1000);
      }
    }
    ZP.ExecutableResponse = YIi;
    class lbe extends Error {
      constructor(e) {
        super(e);
        Object.setPrototypeOf(this, new.target.prototype);
      }
    }
    ZP.ExecutableResponseError = lbe;
    class BKr extends lbe {}
    ZP.InvalidVersionFieldError = BKr;
    class $Kr extends lbe {}
    ZP.InvalidSuccessFieldError = $Kr;
    class JIi extends lbe {}
    ZP.InvalidExpirationTimeFieldError = JIi;
    class HKr extends lbe {}
    ZP.InvalidTokenTypeFieldError = HKr;
    class jKr extends lbe {}
    ZP.InvalidCodeFieldError = jKr;
    class qKr extends lbe {}
    ZP.InvalidMessageFieldError = qKr;
    class q0n extends lbe {}
    ZP.InvalidSubjectTokenError = q0n;
  });
  var KKr = __commonJS(Fit => {
    Object.defineProperty(Fit, "__esModule", {
      value: true
    });
    Fit.PluggableAuthHandler = Fit.ExecutableError = undefined;
    var a4e = WKr();
    var cBd = require("child_process");
    var GKr = require("fs");
    class VKr extends Error {
      code;
      constructor(e, t) {
        super(`The executable failed with exit code: ${t} and error message: ${e}.`);
        this.code = t;
        Object.setPrototypeOf(this, new.target.prototype);
      }
    }
    Fit.ExecutableError = VKr;
    class zKr {
      commandComponents;
      timeoutMillis;
      outputFile;
      constructor(e) {
        if (!e.command) {
          throw Error("No command provided.");
        }
        if (this.commandComponents = zKr.parseCommand(e.command), this.timeoutMillis = e.timeoutMillis, !this.timeoutMillis) {
          throw Error("No timeoutMillis provided.");
        }
        this.outputFile = e.outputFile;
      }
      retrieveResponseFromExecutable(e) {
        return new Promise((t, n) => {
          let r = cBd.spawn(this.commandComponents[0], this.commandComponents.slice(1), {
            env: {
              ...process.env,
              ...Object.fromEntries(e)
            }
          });
          let o = "";
          r.stdout.on("data", i => {
            o += i;
          });
          r.stderr.on("data", i => {
            o += i;
          });
          let s = setTimeout(() => (r.removeAllListeners(), r.kill(), n(Error("The executable failed to finish within the timeout specified."))), this.timeoutMillis);
          r.on("close", i => {
            if (clearTimeout(s), i === 0) {
              try {
                let a = JSON.parse(o);
                let l = new a4e.ExecutableResponse(a);
                return t(l);
              } catch (a) {
                if (a instanceof a4e.ExecutableResponseError) {
                  return n(a);
                }
                return n(new a4e.ExecutableResponseError(`The executable returned an invalid response: ${o}`));
              }
            } else {
              return n(new VKr(o, i.toString()));
            }
          });
        });
      }
      async retrieveCachedResponse() {
        if (!this.outputFile || this.outputFile.length === 0) {
          return;
        }
        let e;
        try {
          e = await GKr.promises.realpath(this.outputFile);
        } catch {
          return;
        }
        if (!(await GKr.promises.lstat(e)).isFile()) {
          return;
        }
        let t = await GKr.promises.readFile(e, {
          encoding: "utf8"
        });
        if (t === "") {
          return;
        }
        try {
          let n = JSON.parse(t);
          if (new a4e.ExecutableResponse(n).isValid()) {
            return new a4e.ExecutableResponse(n);
          }
          return;
        } catch (n) {
          if (n instanceof a4e.ExecutableResponseError) {
            throw n;
          }
          throw new a4e.ExecutableResponseError(`The output file contained an invalid response: ${t}`);
        }
      }
      static parseCommand(e) {
        let t = e.match(/(?:[^\s"]+|"[^"]*")+/g);
        if (!t) {
          throw Error(`Provided command: "${e}" could not be parsed.`);
        }
        for (let n = 0; n < t.length; n++) {
          if (t[n][0] === '"' && t[n].slice(-1) === '"') {
            t[n] = t[n].slice(1, -1);
          }
        }
        return t;
      }
    }
    Fit.PluggableAuthHandler = zKr;
  });
  var YKr = __commonJS(Uit => {
    Object.defineProperty(Uit, "__esModule", {
      value: true
    });
    Uit.PluggableAuthClient = Uit.ExecutableError = undefined;
    var uBd = lIe();
    var dBd = WKr();
    var XIi = KKr();
    var pBd = KKr();
    Object.defineProperty(Uit, "ExecutableError", {
      enumerable: true,
      get: function () {
        return pBd.ExecutableError;
      }
    });
    class tPi extends uBd.BaseExternalAccountClient {
      command;
      timeoutMillis;
      outputFile;
      handler;
      constructor(e) {
        super(e);
        if (!e.credential_source.executable) {
          throw Error('No valid Pluggable Auth "credential_source" provided.');
        }
        if (this.command = e.credential_source.executable.command, !this.command) {
          throw Error('No valid Pluggable Auth "credential_source" provided.');
        }
        if (e.credential_source.executable.timeout_millis === undefined) {
          this.timeoutMillis = 30000;
        } else if (this.timeoutMillis = e.credential_source.executable.timeout_millis, this.timeoutMillis < 5000 || this.timeoutMillis > 120000) {
          throw Error(`Timeout must be between ${5000} and ${120000} milliseconds.`);
        }
        this.outputFile = e.credential_source.executable.output_file;
        this.handler = new XIi.PluggableAuthHandler({
          command: this.command,
          timeoutMillis: this.timeoutMillis,
          outputFile: this.outputFile
        });
        this.credentialSourceType = "executable";
      }
      async retrieveSubjectToken() {
        if (process.env["GOOGLE_EXTERNAL_ACCOUNT_ALLOW_EXECUTABLES"] !== "1") {
          throw Error("Pluggable Auth executables need to be explicitly allowed to run by setting the GOOGLE_EXTERNAL_ACCOUNT_ALLOW_EXECUTABLES environment Variable to 1.");
        }
        let e = undefined;
        if (this.outputFile) {
          e = await this.handler.retrieveCachedResponse();
        }
        if (!e) {
          let t = new Map();
          if (t.set("GOOGLE_EXTERNAL_ACCOUNT_AUDIENCE", this.audience), t.set("GOOGLE_EXTERNAL_ACCOUNT_TOKEN_TYPE", this.subjectTokenType), t.set("GOOGLE_EXTERNAL_ACCOUNT_INTERACTIVE", "0"), this.outputFile) {
            t.set("GOOGLE_EXTERNAL_ACCOUNT_OUTPUT_FILE", this.outputFile);
          }
          let n = this.getServiceAccountEmail();
          if (n) {
            t.set("GOOGLE_EXTERNAL_ACCOUNT_IMPERSONATED_EMAIL", n);
          }
          e = await this.handler.retrieveResponseFromExecutable(t);
        }
        if (e.version > 1) {
          throw Error(`Version of executable is not currently supported, maximum supported version is ${1}.`);
        }
        if (!e.success) {
          throw new XIi.ExecutableError(e.errorMessage, e.errorCode);
        }
        if (this.outputFile) {
          if (!e.expirationTime) {
            throw new dBd.InvalidExpirationTimeFieldError("The executable response must contain the `expiration_time` field for successful responses when an output_file has been specified in the configuration.");
          }
        }
        if (e.isExpired()) {
          throw Error("Executable response is expired.");
        }
        return e.subjectToken;
      }
    }
    Uit.PluggableAuthClient = tPi;
  });
  var JKr = __commonJS(W0n => {
    Object.defineProperty(W0n, "__esModule", {
      value: true
    });
    W0n.ExternalAccountClient = undefined;
    var hBd = lIe();
    var gBd = MKr();
    var yBd = LKr();
    var _Bd = YKr();
    class nPi {
      constructor() {
        throw Error("ExternalAccountClients should be initialized via: ExternalAccountClient.fromJSON(), directly via explicit constructors, eg. new AwsClient(options), new IdentityPoolClient(options), newPluggableAuthClientOptions, or via new GoogleAuth(options).getClient()");
      }
      static fromJSON(e) {
        if (e && e.type === hBd.EXTERNAL_ACCOUNT_TYPE) {
          if (e.credential_source?.environment_id) {
            return new yBd.AwsClient(e);
          } else if (e.credential_source?.executable) {
            return new _Bd.PluggableAuthClient(e);
          } else {
            return new gBd.IdentityPoolClient(e);
          }
        } else {
          return null;
        }
      }
    }
    W0n.ExternalAccountClient = nPi;
  });
  var QKr = __commonJS(Bit => {
    Object.defineProperty(Bit, "__esModule", {
      value: true
    });
    Bit.ExternalAccountAuthorizedUserClient = Bit.EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE = undefined;
    var oPi = w8();
    var rPi = RKr();
    var sPi = LF();
    var bBd = require("stream");
    var SBd = lIe();
    Bit.EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE = "external_account_authorized_user";
    class XKr extends rPi.OAuthClientAuthHandler {
      #e;
      constructor(e) {
        super(e);
        this.#e = e.tokenRefreshEndpoint;
      }
      async refreshToken(e, t) {
        let n = {
          ...XKr.RETRY_CONFIG,
          url: this.#e,
          method: "POST",
          headers: t,
          data: new URLSearchParams({
            grant_type: "refresh_token",
            refresh_token: e
          }),
          responseType: "json"
        };
        oPi.AuthClient.setMethodName(n, "refreshToken");
        this.applyClientAuthenticationOptions(n);
        try {
          let r = await this.transporter.request(n);
          let o = r.data;
          o.res = r;
          return o;
        } catch (r) {
          if (r instanceof sPi.GaxiosError && r.response) {
            throw (0, rPi.getErrorFromOAuthErrorResponse)(r.response.data, r);
          }
          throw r;
        }
      }
    }
    class iPi extends oPi.AuthClient {
      cachedAccessToken;
      externalAccountAuthorizedUserHandler;
      refreshToken;
      constructor(e) {
        super(e);
        if (e.universe_domain) {
          this.universeDomain = e.universe_domain;
        }
        this.refreshToken = e.refresh_token;
        let t = {
          confidentialClientType: "basic",
          clientId: e.client_id,
          clientSecret: e.client_secret
        };
        if (this.externalAccountAuthorizedUserHandler = new XKr({
          tokenRefreshEndpoint: e.token_url ?? ("https://sts.{universeDomain}/v1/oauthtoken").replace("{universeDomain}", this.universeDomain),
          transporter: this.transporter,
          clientAuthentication: t
        }), this.cachedAccessToken = null, this.quotaProjectId = e.quota_project_id, typeof e?.eagerRefreshThresholdMillis !== "number") {
          this.eagerRefreshThresholdMillis = SBd.EXPIRATION_TIME_OFFSET;
        } else {
          this.eagerRefreshThresholdMillis = e.eagerRefreshThresholdMillis;
        }
        this.forceRefreshOnFailure = !!e?.forceRefreshOnFailure;
      }
      async getAccessToken() {
        if (!this.cachedAccessToken || this.isExpired(this.cachedAccessToken)) {
          await this.refreshAccessTokenAsync();
        }
        return {
          token: this.cachedAccessToken.access_token,
          res: this.cachedAccessToken.res
        };
      }
      async getRequestHeaders() {
        let e = await this.getAccessToken();
        let t = new Headers({
          authorization: `Bearer ${e.token}`
        });
        return this.addSharedMetadataHeaders(t);
      }
      request(e, t) {
        if (t) {
          this.requestAsync(e).then(n => t(null, n), n => t(n, n.response));
        } else {
          return this.requestAsync(e);
        }
      }
      async requestAsync(e, t = false) {
        let n;
        try {
          let r = await this.getRequestHeaders();
          e.headers = sPi.Gaxios.mergeHeaders(e.headers);
          this.addUserProjectAndAuthHeaders(e.headers, r);
          n = await this.transporter.request(e);
        } catch (r) {
          let o = r.response;
          if (o) {
            let s = o.status;
            let i = o.config.data instanceof bBd.Readable;
            if (!t && (s === 401 || s === 403) && !i && this.forceRefreshOnFailure) {
              await this.refreshAccessTokenAsync();
              return await this.requestAsync(e, true);
            }
          }
          throw r;
        }
        return n;
      }
      async refreshAccessTokenAsync() {
        let e = await this.externalAccountAuthorizedUserHandler.refreshToken(this.refreshToken);
        if (this.cachedAccessToken = {
          access_token: e.access_token,
          expiry_date: new Date().getTime() + e.expires_in * 1000,
          res: e.res
        }, e.refresh_token !== undefined) {
          this.refreshToken = e.refresh_token;
        }
        return this.cachedAccessToken;
      }
      isExpired(e) {
        let t = new Date().getTime();
        return e.expiry_date ? t >= e.expiry_date - this.eagerRefreshThresholdMillis : false;
      }
    }
    Bit.ExternalAccountAuthorizedUserClient = iPi;
  });
  var dPi = __commonJS(Lne => {
    Object.defineProperty(Lne, "__esModule", {
      value: true
    });
    Lne.GoogleAuth = Lne.GoogleAuthExceptionMessages = undefined;
    var EBd = require("child_process");
    var MBt = require("fs");
    var vBd = LF();
    var NBt = xBt();
    var wBd = require("os");
    var ZKr = require("path");
    var CBd = kBt();
    var RBd = pKr();
    var xBd = mKr();
    var kBd = fKr();
    var $it = vKr();
    var aPi = wKr();
    var Hit = CKr();
    var ABd = JKr();
    var LBt = lIe();
    var e7r = w8();
    var lPi = QKr();
    var cPi = Dne();
    Lne.GoogleAuthExceptionMessages = {
      API_KEY_WITH_CREDENTIALS: "API Keys and Credentials are mutually exclusive authentication methods and cannot be used together.",
      NO_PROJECT_ID_FOUND: `Unable to detect a Project Id in the current environment. 
To learn more about authentication and Google APIs, visit: 
https://cloud.google.com/docs/authentication/getting-started`,
      NO_CREDENTIALS_FOUND: `Unable to find credentials in current environment. 
To learn more about authentication and Google APIs, visit: 
https://cloud.google.com/docs/authentication/getting-started`,
      NO_ADC_FOUND: "Could not load the default credentials. Browse to https://cloud.google.com/docs/authentication/getting-started for more information.",
      NO_UNIVERSE_DOMAIN_FOUND: `Unable to detect a Universe Domain in the current environment.
To learn more about Universe Domain retrieval, visit: 
https://cloud.google.com/compute/docs/metadata/predefined-metadata-keys`
    };
    class uPi {
      checkIsGCE = undefined;
      useJWTAccessWithScope;
      defaultServicePath;
      get isGCE() {
        return this.checkIsGCE;
      }
      _findProjectIdPromise;
      _cachedProjectId;
      jsonContent = null;
      apiKey;
      cachedCredential = null;
      #e = null;
      defaultScopes;
      keyFilename;
      scopes;
      clientOptions = {};
      constructor(e = {}) {
        if (this._cachedProjectId = e.projectId || null, this.cachedCredential = e.authClient || null, this.keyFilename = e.keyFilename || e.keyFile, this.scopes = e.scopes, this.clientOptions = e.clientOptions || {}, this.jsonContent = e.credentials || null, this.apiKey = e.apiKey || this.clientOptions.apiKey || null, this.apiKey && (this.jsonContent || this.clientOptions.credentials)) {
          throw RangeError(Lne.GoogleAuthExceptionMessages.API_KEY_WITH_CREDENTIALS);
        }
        if (e.universeDomain) {
          this.clientOptions.universeDomain = e.universeDomain;
        }
      }
      setGapicJWTValues(e) {
        e.defaultServicePath = this.defaultServicePath;
        e.useJWTAccessWithScope = this.useJWTAccessWithScope;
        e.defaultScopes = this.defaultScopes;
      }
      getProjectId(e) {
        if (e) {
          this.getProjectIdAsync().then(t => e(null, t), e);
        } else {
          return this.getProjectIdAsync();
        }
      }
      async getProjectIdOptional() {
        try {
          return await this.getProjectId();
        } catch (e) {
          if (e instanceof Error && e.message === Lne.GoogleAuthExceptionMessages.NO_PROJECT_ID_FOUND) {
            return null;
          } else {
            throw e;
          }
        }
      }
      async findAndCacheProjectId() {
        let e = null;
        if (e ||= await this.getProductionProjectId(), e ||= await this.getFileProjectId(), e ||= await this.getDefaultServiceProjectId(), e ||= await this.getGCEProjectId(), e ||= await this.getExternalAccountClientProjectId(), e) {
          this._cachedProjectId = e;
          return e;
        } else {
          throw Error(Lne.GoogleAuthExceptionMessages.NO_PROJECT_ID_FOUND);
        }
      }
      async getProjectIdAsync() {
        if (this._cachedProjectId) {
          return this._cachedProjectId;
        }
        if (!this._findProjectIdPromise) {
          this._findProjectIdPromise = this.findAndCacheProjectId();
        }
        return this._findProjectIdPromise;
      }
      async getUniverseDomainFromMetadataServer() {
        let e;
        try {
          e = await NBt.universe("universe-domain");
          e ||= e7r.DEFAULT_UNIVERSE;
        } catch (t) {
          if (t && t?.response?.status === 404) {
            e = e7r.DEFAULT_UNIVERSE;
          } else {
            throw t;
          }
        }
        return e;
      }
      async getUniverseDomain() {
        let e = (0, cPi.originalOrCamelOptions)(this.clientOptions).get("universe_domain");
        try {
          e ??= (await this.getClient()).universeDomain;
        } catch {
          e ??= e7r.DEFAULT_UNIVERSE;
        }
        return e;
      }
      getAnyScopes() {
        return this.scopes || this.defaultScopes;
      }
      getApplicationDefault(e = {}, t) {
        let n;
        if (typeof e === "function") {
          t = e;
        } else {
          n = e;
        }
        if (t) {
          this.getApplicationDefaultAsync(n).then(r => t(null, r.credential, r.projectId), t);
        } else {
          return this.getApplicationDefaultAsync(n);
        }
      }
      async getApplicationDefaultAsync(e = {}) {
        if (this.cachedCredential) {
          return await this.#t(this.cachedCredential, null);
        }
        let t;
        if (t = await this._tryGetApplicationCredentialsFromEnvironmentVariable(e), t) {
          if (t instanceof $it.JWT) {
            t.scopes = this.scopes;
          } else if (t instanceof LBt.BaseExternalAccountClient) {
            t.scopes = this.getAnyScopes();
          }
          return await this.#t(t);
        }
        if (t = await this._tryGetApplicationCredentialsFromWellKnownFile(e), t) {
          if (t instanceof $it.JWT) {
            t.scopes = this.scopes;
          } else if (t instanceof LBt.BaseExternalAccountClient) {
            t.scopes = this.getAnyScopes();
          }
          return await this.#t(t);
        }
        if (await this._checkIsGCE()) {
          e.scopes = this.getAnyScopes();
          return await this.#t(new RBd.Compute(e));
        }
        throw Error(Lne.GoogleAuthExceptionMessages.NO_ADC_FOUND);
      }
      async #t(e, t = process.env.GOOGLE_CLOUD_QUOTA_PROJECT || null) {
        let n = await this.getProjectIdOptional();
        if (t) {
          e.quotaProjectId = t;
        }
        this.cachedCredential = e;
        return {
          credential: e,
          projectId: n
        };
      }
      async _checkIsGCE() {
        if (this.checkIsGCE === undefined) {
          this.checkIsGCE = NBt.getGCPResidency() || (await NBt.isAvailable());
        }
        return this.checkIsGCE;
      }
      async _tryGetApplicationCredentialsFromEnvironmentVariable(e) {
        let t = process.env.GOOGLE_APPLICATION_CREDENTIALS || process.env.google_application_credentials;
        if (!t || t.length === 0) {
          return null;
        }
        try {
          return this._getApplicationCredentialsFromFilePath(t, e);
        } catch (n) {
          if (n instanceof Error) {
            n.message = `Unable to read the credential file specified by the GOOGLE_APPLICATION_CREDENTIALS environment variable: ${n.message}`;
          }
          throw n;
        }
      }
      async _tryGetApplicationCredentialsFromWellKnownFile(e) {
        let t = null;
        if (this._isWindows()) {
          t = process.env.APPDATA;
        } else {
          let r = process.env.HOME;
          if (r) {
            t = ZKr.join(r, ".config");
          }
        }
        if (t) {
          if (t = ZKr.join(t, "gcloud", "application_default_credentials.json"), !MBt.existsSync(t)) {
            t = null;
          }
        }
        if (!t) {
          return null;
        }
        return await this._getApplicationCredentialsFromFilePath(t, e);
      }
      async _getApplicationCredentialsFromFilePath(e, t = {}) {
        if (!e || e.length === 0) {
          throw Error("The file path is invalid.");
        }
        try {
          if (e = MBt.realpathSync(e), !MBt.lstatSync(e).isFile()) {
            throw Error();
          }
        } catch (r) {
          if (r instanceof Error) {
            r.message = `The file at ${e} does not exist, or it is not a file. ${r.message}`;
          }
          throw r;
        }
        let n = MBt.createReadStream(e);
        return this.fromStream(n, t);
      }
      fromImpersonatedJSON(e) {
        if (!e) {
          throw Error("Must pass in a JSON object containing an  impersonated refresh token");
        }
        if (e.type !== Hit.IMPERSONATED_ACCOUNT_TYPE) {
          throw Error(`The incoming JSON object does not have the "${Hit.IMPERSONATED_ACCOUNT_TYPE}" type`);
        }
        if (!e.source_credentials) {
          throw Error("The incoming JSON object does not contain a source_credentials field");
        }
        if (!e.service_account_impersonation_url) {
          throw Error("The incoming JSON object does not contain a service_account_impersonation_url field");
        }
        let t = this.fromJSON(e.source_credentials);
        if (e.service_account_impersonation_url?.length > 256) {
          throw RangeError(`Target principal is too long: ${e.service_account_impersonation_url}`);
        }
        let n = /(?<target>[^/]+):(generateAccessToken|generateIdToken)$/.exec(e.service_account_impersonation_url)?.groups?.target;
        if (!n) {
          throw RangeError(`Cannot extract target principal from ${e.service_account_impersonation_url}`);
        }
        let r = (this.scopes || e.scopes || this.defaultScopes) ?? [];
        return new Hit.Impersonated({
          ...e,
          sourceClient: t,
          targetPrincipal: n,
          targetScopes: Array.isArray(r) ? r : [r]
        });
      }
      fromJSON(e, t = {}) {
        let n;
        let r = (0, cPi.originalOrCamelOptions)(t).get("universe_domain");
        if (e.type === aPi.USER_REFRESH_ACCOUNT_TYPE) {
          n = new aPi.UserRefreshClient(t);
          n.fromJSON(e);
        } else if (e.type === Hit.IMPERSONATED_ACCOUNT_TYPE) {
          n = this.fromImpersonatedJSON(e);
        } else if (e.type === LBt.EXTERNAL_ACCOUNT_TYPE) {
          n = ABd.ExternalAccountClient.fromJSON({
            ...e,
            ...t
          });
          n.scopes = this.getAnyScopes();
        } else if (e.type === lPi.EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE) {
          n = new lPi.ExternalAccountAuthorizedUserClient({
            ...e,
            ...t
          });
        } else {
          t.scopes = this.scopes;
          n = new $it.JWT(t);
          this.setGapicJWTValues(n);
          n.fromJSON(e);
        }
        if (r) {
          n.universeDomain = r;
        }
        return n;
      }
      _cacheClientFromJSON(e, t) {
        let n = this.fromJSON(e, t);
        this.jsonContent = e;
        this.cachedCredential = n;
        return n;
      }
      fromStream(e, t = {}, n) {
        let r = {};
        if (typeof t === "function") {
          n = t;
        } else {
          r = t;
        }
        if (n) {
          this.fromStreamAsync(e, r).then(o => n(null, o), n);
        } else {
          return this.fromStreamAsync(e, r);
        }
      }
      fromStreamAsync(e, t) {
        return new Promise((n, r) => {
          if (!e) {
            throw Error("Must pass in a stream containing the Google auth settings.");
          }
          let o = [];
          e.setEncoding("utf8").on("error", r).on("data", s => o.push(s)).on("end", () => {
            try {
              try {
                let s = JSON.parse(o.join(""));
                let i = this._cacheClientFromJSON(s, t);
                return n(i);
              } catch (s) {
                if (!this.keyFilename) {
                  throw s;
                }
                let i = new $it.JWT({
                  ...this.clientOptions,
                  keyFile: this.keyFilename
                });
                this.cachedCredential = i;
                this.setGapicJWTValues(i);
                return n(i);
              }
            } catch (s) {
              return r(s);
            }
          });
        });
      }
      fromAPIKey(e, t = {}) {
        return new $it.JWT({
          ...t,
          apiKey: e
        });
      }
      _isWindows() {
        let e = wBd.platform();
        if (e && e.length >= 3) {
          if (e.substring(0, 3).toLowerCase() === "win") {
            return true;
          }
        }
        return false;
      }
      async getDefaultServiceProjectId() {
        return new Promise(e => {
          (0, EBd.exec)("gcloud config config-helper --format json", (t, n) => {
            if (!t && n) {
              try {
                let r = JSON.parse(n).configuration.properties.core.project;
                e(r);
                return;
              } catch (r) {}
            }
            e(null);
          });
        });
      }
      getProductionProjectId() {
        return process.env.GCLOUD_PROJECT || process.env.GOOGLE_CLOUD_PROJECT || process.env.gcloud_project || process.env.google_cloud_project;
      }
      async getFileProjectId() {
        if (this.cachedCredential) {
          return this.cachedCredential.projectId;
        }
        if (this.keyFilename) {
          let t = await this.getClient();
          if (t && t.projectId) {
            return t.projectId;
          }
        }
        let e = await this._tryGetApplicationCredentialsFromEnvironmentVariable();
        if (e) {
          return e.projectId;
        } else {
          return null;
        }
      }
      async getExternalAccountClientProjectId() {
        if (!this.jsonContent || this.jsonContent.type !== LBt.EXTERNAL_ACCOUNT_TYPE) {
          return null;
        }
        return await (await this.getClient()).getProjectId();
      }
      async getGCEProjectId() {
        try {
          return await NBt.project("project-id");
        } catch (e) {
          return null;
        }
      }
      getCredentials(e) {
        if (e) {
          this.getCredentialsAsync().then(t => e(null, t), e);
        } else {
          return this.getCredentialsAsync();
        }
      }
      async getCredentialsAsync() {
        let e = await this.getClient();
        if (e instanceof Hit.Impersonated) {
          return {
            client_email: e.getTargetPrincipal()
          };
        }
        if (e instanceof LBt.BaseExternalAccountClient) {
          let t = e.getServiceAccountEmail();
          if (t) {
            return {
              client_email: t,
              universe_domain: e.universeDomain
            };
          }
        }
        if (this.jsonContent) {
          return {
            client_email: this.jsonContent.client_email,
            private_key: this.jsonContent.private_key,
            universe_domain: this.jsonContent.universe_domain
          };
        }
        if (await this._checkIsGCE()) {
          let [t, n] = await Promise.all([NBt.instance("service-accounts/default/email"), this.getUniverseDomain()]);
          return {
            client_email: t,
            universe_domain: n
          };
        }
        throw Error(Lne.GoogleAuthExceptionMessages.NO_CREDENTIALS_FOUND);
      }
      async getClient() {
        if (this.cachedCredential) {
          return this.cachedCredential;
        }
        this.#e = this.#e || this.#n();
        try {
          return await this.#e;
        } finally {
          this.#e = null;
        }
      }
      async #n() {
        if (this.jsonContent) {
          return this._cacheClientFromJSON(this.jsonContent, this.clientOptions);
        } else if (this.keyFilename) {
          let e = ZKr.resolve(this.keyFilename);
          let t = MBt.createReadStream(e);
          return await this.fromStreamAsync(t, this.clientOptions);
        } else if (this.apiKey) {
          let e = await this.fromAPIKey(this.apiKey, this.clientOptions);
          e.scopes = this.scopes;
          let {
            credential: t
          } = await this.#t(e);
          return t;
        } else {
          let {
            credential: e
          } = await this.getApplicationDefaultAsync(this.clientOptions);
          return e;
        }
      }
      async getIdTokenClient(e) {
        let t = await this.getClient();
        if (!("fetchIdToken" in t)) {
          throw Error("Cannot fetch ID token in this environment, use GCE or set the GOOGLE_APPLICATION_CREDENTIALS environment variable to a service account credentials JSON file.");
        }
        return new xBd.IdTokenClient({
          targetAudience: e,
          idTokenProvider: t
        });
      }
      async getAccessToken() {
        return (await (await this.getClient()).getAccessToken()).token;
      }
      async getRequestHeaders(e) {
        return (await this.getClient()).getRequestHeaders(e);
      }
      async authorizeRequest(e = {}) {
        let t = e.url;
        let r = await (await this.getClient()).getRequestHeaders(t);
        e.headers = vBd.Gaxios.mergeHeaders(e.headers, r);
        return e;
      }
      async fetch(...e) {
        return (await this.getClient()).fetch(...e);
      }
      async request(e) {
        return (await this.getClient()).request(e);
      }
      getEnv() {
        return (0, kBd.getEnv)();
      }
      async sign(e, t) {
        let n = await this.getClient();
        let r = await this.getUniverseDomain();
        if (t = t || `https://iamcredentials.${r}/v1/projects/-/serviceAccounts/`, n instanceof Hit.Impersonated) {
          return (await n.sign(e)).signedBlob;
        }
        let o = (0, CBd.createCrypto)();
        if (n instanceof $it.JWT && n.key) {
          return await o.sign(n.key, e);
        }
        let s = await this.getCredentials();
        if (!s.client_email) {
          throw Error("Cannot sign data without `client_email`.");
        }
        return this.signBlob(o, s.client_email, e, t);
      }
      async signBlob(e, t, n, r) {
        let o = new URL(r + `${t}:signBlob`);
        return (await this.request({
          method: "POST",
          url: o.href,
          data: {
            payload: e.encodeBase64StringUtf8(n)
          },
          retry: true,
          retryConfig: {
            httpMethodsToRetry: ["POST"]
          }
        })).data.signedBlob;
      }
    }
    Lne.GoogleAuth = uPi;
  });
  var mPi = __commonJS(G0n => {
    Object.defineProperty(G0n, "__esModule", {
      value: true
    });
    G0n.IAMAuth = undefined;
    class pPi {
      selector;
      token;
      constructor(e, t) {
        this.selector = e;
        this.token = t;
        this.selector = e;
        this.token = t;
      }
      getRequestHeaders() {
        return {
          "x-goog-iam-authority-selector": this.selector,
          "x-goog-iam-authorization-token": this.token
        };
      }
    }
    G0n.IAMAuth = pPi;
  });
  var hPi = __commonJS(vce => {
    Object.defineProperty(vce, "__esModule", {
      value: true
    });
    vce.DownscopedClient = vce.EXPIRATION_TIME_OFFSET = vce.MAX_ACCESS_BOUNDARY_RULES_COUNT = undefined;
    var IBd = LF();
    var PBd = require("stream");
    var t7r = w8();
    var OBd = k0n();
    vce.MAX_ACCESS_BOUNDARY_RULES_COUNT = 10;
    vce.EXPIRATION_TIME_OFFSET = 300000;
    class fPi extends t7r.AuthClient {
      authClient;
      credentialAccessBoundary;
      cachedDownscopedAccessToken;
      stsCredential;
      constructor(e, t = {
        accessBoundary: {
          accessBoundaryRules: []
        }
      }) {
        super(e instanceof t7r.AuthClient ? {} : e);
        if (e instanceof t7r.AuthClient) {
          this.authClient = e;
          this.credentialAccessBoundary = t;
        } else {
          this.authClient = e.authClient;
          this.credentialAccessBoundary = e.credentialAccessBoundary;
        }
        if (this.credentialAccessBoundary.accessBoundary.accessBoundaryRules.length === 0) {
          throw Error("At least one access boundary rule needs to be defined.");
        } else if (this.credentialAccessBoundary.accessBoundary.accessBoundaryRules.length > vce.MAX_ACCESS_BOUNDARY_RULES_COUNT) {
          throw Error(`The provided access boundary has more than ${vce.MAX_ACCESS_BOUNDARY_RULES_COUNT} access boundary rules.`);
        }
        for (let n of this.credentialAccessBoundary.accessBoundary.accessBoundaryRules) {
          if (n.availablePermissions.length === 0) {
            throw Error("At least one permission should be defined in access boundary rules.");
          }
        }
        this.stsCredential = new OBd.StsCredentials({
          tokenExchangeEndpoint: `https://sts.${this.universeDomain}/v1/token`
        });
        this.cachedDownscopedAccessToken = null;
      }
      setCredentials(e) {
        if (!e.expiry_date) {
          throw Error("The access token expiry_date field is missing in the provided credentials.");
        }
        super.setCredentials(e);
        this.cachedDownscopedAccessToken = e;
      }
      async getAccessToken() {
        if (!this.cachedDownscopedAccessToken || this.isExpired(this.cachedDownscopedAccessToken)) {
          await this.refreshAccessTokenAsync();
        }
        return {
          token: this.cachedDownscopedAccessToken.access_token,
          expirationTime: this.cachedDownscopedAccessToken.expiry_date,
          res: this.cachedDownscopedAccessToken.res
        };
      }
      async getRequestHeaders() {
        let e = await this.getAccessToken();
        let t = new Headers({
          authorization: `Bearer ${e.token}`
        });
        return this.addSharedMetadataHeaders(t);
      }
      request(e, t) {
        if (t) {
          this.requestAsync(e).then(n => t(null, n), n => t(n, n.response));
        } else {
          return this.requestAsync(e);
        }
      }
      async requestAsync(e, t = false) {
        let n;
        try {
          let r = await this.getRequestHeaders();
          e.headers = IBd.Gaxios.mergeHeaders(e.headers);
          this.addUserProjectAndAuthHeaders(e.headers, r);
          n = await this.transporter.request(e);
        } catch (r) {
          let o = r.response;
          if (o) {
            let s = o.status;
            let i = o.config.data instanceof PBd.Readable;
            if (!t && (s === 401 || s === 403) && !i && this.forceRefreshOnFailure) {
              await this.refreshAccessTokenAsync();
              return await this.requestAsync(e, true);
            }
          }
          throw r;
        }
        return n;
      }
      async refreshAccessTokenAsync() {
        let e = (await this.authClient.getAccessToken()).token;
        let t = {
          grantType: "urn:ietf:params:oauth:grant-type:token-exchange",
          requestedTokenType: "urn:ietf:params:oauth:token-type:access_token",
          subjectToken: e,
          subjectTokenType: "urn:ietf:params:oauth:token-type:access_token"
        };
        let n = await this.stsCredential.exchangeToken(t, undefined, this.credentialAccessBoundary);
        let r = this.authClient.credentials?.expiry_date || null;
        let o = n.expires_in ? new Date().getTime() + n.expires_in * 1000 : r;
        this.cachedDownscopedAccessToken = {
          access_token: n.access_token,
          expiry_date: o,
          res: n.res
        };
        this.credentials = {};
        Object.assign(this.credentials, this.cachedDownscopedAccessToken);
        delete this.credentials.res;
        this.emit("tokens", {
          refresh_token: null,
          expiry_date: this.cachedDownscopedAccessToken.expiry_date,
          access_token: this.cachedDownscopedAccessToken.access_token,
          token_type: "Bearer",
          id_token: null
        });
        return this.cachedDownscopedAccessToken;
      }
      isExpired(e) {
        let t = new Date().getTime();
        return e.expiry_date ? t >= e.expiry_date - this.eagerRefreshThresholdMillis : false;
      }
    }
    vce.DownscopedClient = fPi;
  });
  var yPi = __commonJS(V0n => {
    Object.defineProperty(V0n, "__esModule", {
      value: true
    });
    V0n.PassThroughClient = undefined;
    var LBd = w8();
    class gPi extends LBd.AuthClient {
      async request(e) {
        return this.transporter.request(e);
      }
      async getAccessToken() {
        return {};
      }
      async getRequestHeaders() {
        return new Headers();
      }
    }
    V0n.PassThroughClient = gPi;
  });
  var FBt = __commonJS(cc => {
    var FBd = cc && cc.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var UBd = cc && cc.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          FBd(t, e, n);
        }
      }
    };
    Object.defineProperty(cc, "__esModule", {
      value: true
    });
    cc.GoogleAuth = cc.auth = cc.PassThroughClient = cc.ExternalAccountAuthorizedUserClient = cc.EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE = cc.ExecutableError = cc.PluggableAuthClient = cc.DownscopedClient = cc.BaseExternalAccountClient = cc.ExternalAccountClient = cc.IdentityPoolClient = cc.AwsRequestSigner = cc.AwsClient = cc.UserRefreshClient = cc.LoginTicket = cc.ClientAuthentication = cc.OAuth2Client = cc.CodeChallengeMethod = cc.Impersonated = cc.JWT = cc.JWTAccess = cc.IdTokenClient = cc.IAMAuth = cc.GCPEnv = cc.Compute = cc.DEFAULT_UNIVERSE = cc.AuthClient = cc.gaxios = cc.gcpMetadata = undefined;
    var _Pi = dPi();
    Object.defineProperty(cc, "GoogleAuth", {
      enumerable: true,
      get: function () {
        return _Pi.GoogleAuth;
      }
    });
    cc.gcpMetadata = xBt();
    cc.gaxios = LF();
    var bPi = w8();
    Object.defineProperty(cc, "AuthClient", {
      enumerable: true,
      get: function () {
        return bPi.AuthClient;
      }
    });
    Object.defineProperty(cc, "DEFAULT_UNIVERSE", {
      enumerable: true,
      get: function () {
        return bPi.DEFAULT_UNIVERSE;
      }
    });
    var BBd = pKr();
    Object.defineProperty(cc, "Compute", {
      enumerable: true,
      get: function () {
        return BBd.Compute;
      }
    });
    var $Bd = fKr();
    Object.defineProperty(cc, "GCPEnv", {
      enumerable: true,
      get: function () {
        return $Bd.GCPEnv;
      }
    });
    var HBd = mPi();
    Object.defineProperty(cc, "IAMAuth", {
      enumerable: true,
      get: function () {
        return HBd.IAMAuth;
      }
    });
    var jBd = mKr();
    Object.defineProperty(cc, "IdTokenClient", {
      enumerable: true,
      get: function () {
        return jBd.IdTokenClient;
      }
    });
    var qBd = TKr();
    Object.defineProperty(cc, "JWTAccess", {
      enumerable: true,
      get: function () {
        return qBd.JWTAccess;
      }
    });
    var WBd = vKr();
    Object.defineProperty(cc, "JWT", {
      enumerable: true,
      get: function () {
        return WBd.JWT;
      }
    });
    var GBd = CKr();
    Object.defineProperty(cc, "Impersonated", {
      enumerable: true,
      get: function () {
        return GBd.Impersonated;
      }
    });
    var n7r = i4e();
    Object.defineProperty(cc, "CodeChallengeMethod", {
      enumerable: true,
      get: function () {
        return n7r.CodeChallengeMethod;
      }
    });
    Object.defineProperty(cc, "OAuth2Client", {
      enumerable: true,
      get: function () {
        return n7r.OAuth2Client;
      }
    });
    Object.defineProperty(cc, "ClientAuthentication", {
      enumerable: true,
      get: function () {
        return n7r.ClientAuthentication;
      }
    });
    var VBd = uKr();
    Object.defineProperty(cc, "LoginTicket", {
      enumerable: true,
      get: function () {
        return VBd.LoginTicket;
      }
    });
    var zBd = wKr();
    Object.defineProperty(cc, "UserRefreshClient", {
      enumerable: true,
      get: function () {
        return zBd.UserRefreshClient;
      }
    });
    var KBd = LKr();
    Object.defineProperty(cc, "AwsClient", {
      enumerable: true,
      get: function () {
        return KBd.AwsClient;
      }
    });
    var YBd = NKr();
    Object.defineProperty(cc, "AwsRequestSigner", {
      enumerable: true,
      get: function () {
        return YBd.AwsRequestSigner;
      }
    });
    var JBd = MKr();
    Object.defineProperty(cc, "IdentityPoolClient", {
      enumerable: true,
      get: function () {
        return JBd.IdentityPoolClient;
      }
    });
    var XBd = JKr();
    Object.defineProperty(cc, "ExternalAccountClient", {
      enumerable: true,
      get: function () {
        return XBd.ExternalAccountClient;
      }
    });
    var QBd = lIe();
    Object.defineProperty(cc, "BaseExternalAccountClient", {
      enumerable: true,
      get: function () {
        return QBd.BaseExternalAccountClient;
      }
    });
    var ZBd = hPi();
    Object.defineProperty(cc, "DownscopedClient", {
      enumerable: true,
      get: function () {
        return ZBd.DownscopedClient;
      }
    });
    var SPi = YKr();
    Object.defineProperty(cc, "PluggableAuthClient", {
      enumerable: true,
      get: function () {
        return SPi.PluggableAuthClient;
      }
    });
    Object.defineProperty(cc, "ExecutableError", {
      enumerable: true,
      get: function () {
        return SPi.ExecutableError;
      }
    });
    var TPi = QKr();
    Object.defineProperty(cc, "EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE", {
      enumerable: true,
      get: function () {
        return TPi.EXTERNAL_ACCOUNT_AUTHORIZED_USER_TYPE;
      }
    });
    Object.defineProperty(cc, "ExternalAccountAuthorizedUserClient", {
      enumerable: true,
      get: function () {
        return TPi.ExternalAccountAuthorizedUserClient;
      }
    });
    var e2d = yPi();
    Object.defineProperty(cc, "PassThroughClient", {
      enumerable: true,
      get: function () {
        return e2d.PassThroughClient;
      }
    });
    UBd(bKr(), cc);
    var t2d = new _Pi.GoogleAuth();
    cc.auth = t2d;
  });