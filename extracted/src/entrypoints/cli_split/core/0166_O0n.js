  var $Ii = __commonJS(C8 => {
    Object.defineProperty(C8, "__esModule", {
      value: true
    });
    C8.CertificateSubjectTokenSupplier = C8.InvalidConfigurationError = C8.CertificateSourceUnavailableError = C8.CERTIFICATE_CONFIGURATION_ENV_VARIABLE = undefined;
    var O0n = Dne();
    var D0n = require("fs");
    var M0n = require("crypto");
    var XUd = require("https");
    C8.CERTIFICATE_CONFIGURATION_ENV_VARIABLE = "GOOGLE_API_CERTIFICATE_CONFIG";
    class abe extends Error {
      constructor(e) {
        super(e);
        this.name = "CertificateSourceUnavailableError";
      }
    }
    C8.CertificateSourceUnavailableError = abe;
    class Nne extends Error {
      constructor(e) {
        super(e);
        this.name = "InvalidConfigurationError";
      }
    }
    C8.InvalidConfigurationError = Nne;
    class BIi {
      certificateConfigPath;
      trustChainPath;
      cert;
      key;
      constructor(e) {
        if (!e.useDefaultCertificateConfig && !e.certificateConfigLocation) {
          throw new Nne("Either `useDefaultCertificateConfig` must be true or a `certificateConfigLocation` must be provided.");
        }
        if (e.useDefaultCertificateConfig && e.certificateConfigLocation) {
          throw new Nne("Both `useDefaultCertificateConfig` and `certificateConfigLocation` cannot be provided.");
        }
        this.trustChainPath = e.trustChainPath;
        this.certificateConfigPath = e.certificateConfigLocation ?? "";
      }
      async createMtlsHttpsAgent() {
        if (!this.key || !this.cert) {
          throw new Nne("Cannot create mTLS Agent with missing certificate or key");
        }
        return new XUd.Agent({
          key: this.key,
          cert: this.cert
        });
      }
      async getSubjectToken() {
        this.certificateConfigPath = await this.#e();
        let {
          certPath: e,
          keyPath: t
        } = await this.#t();
        ({
          cert: this.cert,
          key: this.key
        } = await this.#n(e, t));
        return await this.#r(this.cert);
      }
      async #e() {
        let e = this.certificateConfigPath;
        if (e) {
          if (await (0, O0n.isValidFile)(e)) {
            return e;
          }
          throw new abe(`Provided certificate config path is invalid: ${e}`);
        }
        let t = process.env[C8.CERTIFICATE_CONFIGURATION_ENV_VARIABLE];
        if (t) {
          if (await (0, O0n.isValidFile)(t)) {
            return t;
          }
          throw new abe(`Path from environment variable "${C8.CERTIFICATE_CONFIGURATION_ENV_VARIABLE}" is invalid: ${t}`);
        }
        let n = (0, O0n.getWellKnownCertificateConfigFileLocation)();
        if (await (0, O0n.isValidFile)(n)) {
          return n;
        }
        throw new abe(`Could not find certificate configuration file. Searched override path, the "${C8.CERTIFICATE_CONFIGURATION_ENV_VARIABLE}" env var, and the gcloud path (${n}).`);
      }
      async #t() {
        let e = this.certificateConfigPath;
        let t;
        try {
          t = await D0n.promises.readFile(e, "utf8");
        } catch (n) {
          throw new abe(`Failed to read certificate config file at: ${e}`);
        }
        try {
          let n = JSON.parse(t);
          let r = n?.cert_configs?.workload?.cert_path;
          let o = n?.cert_configs?.workload?.key_path;
          if (!r || !o) {
            throw new Nne(`Certificate config file (${e}) is missing required "cert_path" or "key_path" in the workload config.`);
          }
          return {
            certPath: r,
            keyPath: o
          };
        } catch (n) {
          if (n instanceof Nne) {
            throw n;
          }
          throw new Nne(`Failed to parse certificate config from ${e}: ${n.message}`);
        }
      }
      async #n(e, t) {
        let n;
        let r;
        try {
          n = await D0n.promises.readFile(e);
          new M0n.X509Certificate(n);
        } catch (o) {
          let s = o instanceof Error ? o.message : String(o);
          throw new abe(`Failed to read certificate file at ${e}: ${s}`);
        }
        try {
          r = await D0n.promises.readFile(t);
          (0, M0n.createPrivateKey)(r);
        } catch (o) {
          let s = o instanceof Error ? o.message : String(o);
          throw new abe(`Failed to read private key file at ${t}: ${s}`);
        }
        return {
          cert: n,
          key: r
        };
      }
      async #r(e) {
        let t = new M0n.X509Certificate(e);
        if (!this.trustChainPath) {
          return JSON.stringify([t.raw.toString("base64")]);
        }
        try {
          let o = ((await D0n.promises.readFile(this.trustChainPath, "utf8")).match(/-----BEGIN CERTIFICATE-----[^-]+-----END CERTIFICATE-----/g) ?? []).map((a, l) => {
            try {
              return new M0n.X509Certificate(a);
            } catch (c) {
              let u = c instanceof Error ? c.message : String(c);
              throw new Nne(`Failed to parse certificate at index ${l} in trust chain file ${this.trustChainPath}: ${u}`);
            }
          });
          let s = o.findIndex(a => t.raw.equals(a.raw));
          let i;
          if (s === -1) {
            i = [t, ...o];
          } else if (s === 0) {
            i = o;
          } else {
            throw new Nne(`Leaf certificate exists in the trust chain but is not the first entry (found at index ${s}).`);
          }
          return JSON.stringify(i.map(a => a.raw.toString("base64")));
        } catch (n) {
          if (n instanceof Nne) {
            throw n;
          }
          let r = n instanceof Error ? n.message : String(n);
          throw new abe(`Failed to process certificate chain from ${this.trustChainPath}: ${r}`);
        }
      }
    }
    C8.CertificateSubjectTokenSupplier = BIi;
  });