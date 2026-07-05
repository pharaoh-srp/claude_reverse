  var Zye = __commonJS(Hje => {
    var IHs = require("os");
    var jBr = require("process");
    var rQu = Ple();
    var PHs = {
      isCrtAvailable: false
    };
    var oQu = () => {
      if (PHs.isCrtAvailable) {
        return ["md/crt-avail"];
      }
      return null;
    };
    var OHs = ({
      serviceId: e,
      clientVersion: t
    }) => async n => {
      let r = [["aws-sdk-js", t], ["ua", "2.1"], [`os/${IHs.platform()}`, IHs.release()], ["lang/js"], ["md/nodejs", `${jBr.versions.node}`]];
      let o = oQu();
      if (o) {
        r.push(o);
      }
      if (e) {
        r.push([`api/${e}`, t]);
      }
      if (jBr.env.AWS_EXECUTION_ENV) {
        r.push([`exec-env/${jBr.env.AWS_EXECUTION_ENV}`]);
      }
      let s = await n?.userAgentAppId?.();
      return s ? [...r, [`app/${s}`]] : [...r];
    };
    var sQu = OHs;
    var aQu = {
      environmentVariableSelector: e => e["AWS_SDK_UA_APP_ID"],
      configFileSelector: e => e["sdk_ua_app_id"] ?? e["sdk-ua-app-id"],
      default: rQu.DEFAULT_UA_APP_ID
    };
    Hje.NODE_APP_ID_CONFIG_OPTIONS = aQu;
    Hje.UA_APP_ID_ENV_NAME = "AWS_SDK_UA_APP_ID";
    Hje.UA_APP_ID_INI_NAME = "sdk_ua_app_id";
    Hje.createDefaultUserAgentProvider = OHs;
    Hje.crtAvailability = PHs;
    Hje.defaultUserAgent = sQu;
  });
  var LHs = __commonJS(NHs => {
    var lQu = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    NHs.isArrayBuffer = lQu;
  });
  var FHs = __commonJS(WBr => {
    var cQu = LHs();
    var qBr = require("buffer");
    var uQu = (e, t = 0, n = e.byteLength - t) => {
      if (!cQu.isArrayBuffer(e)) {
        throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
      }
      return qBr.Buffer.from(e, t, n);
    };
    var dQu = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
      }
      return t ? qBr.Buffer.from(e, t) : qBr.Buffer.from(e);
    };
    WBr.fromArrayBuffer = uQu;
    WBr.fromString = dQu;
  });
  var e_e = __commonJS(HHs => {
    var GBr = FHs();
    var pQu = jT();
    var mQu = require("buffer");
    var UHs = require("crypto");
    class $Hs {
      algorithmIdentifier;
      secret;
      hash;
      constructor(e, t) {
        this.algorithmIdentifier = e;
        this.secret = t;
        this.reset();
      }
      update(e, t) {
        this.hash.update(pQu.toUint8Array(BHs(e, t)));
      }
      digest() {
        return Promise.resolve(this.hash.digest());
      }
      reset() {
        this.hash = this.secret ? UHs.createHmac(this.algorithmIdentifier, BHs(this.secret)) : UHs.createHash(this.algorithmIdentifier);
      }
    }
    function BHs(e, t) {
      if (mQu.Buffer.isBuffer(e)) {
        return e;
      }
      if (typeof e === "string") {
        return GBr.fromString(e, t);
      }
      if (ArrayBuffer.isView(e)) {
        return GBr.fromArrayBuffer(e.buffer, e.byteOffset, e.byteLength);
      }
      return GBr.fromArrayBuffer(e);
    }
    HHs.Hash = $Hs;
  });
  var t_e = __commonJS(jHs => {
    var VBr = require("fs");
    var fQu = e => {
      if (!e) {
        return 0;
      }
      if (typeof e === "string") {
        return Buffer.byteLength(e);
      } else if (typeof e.byteLength === "number") {
        return e.byteLength;
      } else if (typeof e.size === "number") {
        return e.size;
      } else if (typeof e.start === "number" && typeof e.end === "number") {
        return e.end + 1 - e.start;
      } else if (e instanceof VBr.ReadStream) {
        if (e.path != null) {
          return VBr.lstatSync(e.path).size;
        } else if (typeof e.fd === "number") {
          return VBr.fstatSync(e.fd).size;
        }
      }
      throw Error(`Body Length computation failed for ${e}`);
    };
    jHs.calculateBodyLength = fQu;
  });
  var r_e = __commonJS(CC => {
    var qHs = jUr();
    var oT = qT();
    var n_e = YUr();
    var _F = tw();
    var qN = yW();
    var HNt = ZUr();
    var GHs = jT();
    var vY = rBr();
    class Ert {
      queryCompat;
      constructor(e = false) {
        this.queryCompat = e;
      }
      resolveRestContentType(e, t) {
        let n = t.getMemberSchemas();
        let r = Object.values(n).find(o => !!o.getMergedTraits().httpPayload);
        if (r) {
          let o = r.getMergedTraits().mediaType;
          if (o) {
            return o;
          } else if (r.isStringSchema()) {
            return "text/plain";
          } else if (r.isBlobSchema()) {
            return "application/octet-stream";
          } else {
            return e;
          }
        } else if (!t.isUnitSchema()) {
          if (Object.values(n).find(s => {
            let {
              httpQuery: i,
              httpQueryParams: a,
              httpHeader: l,
              httpLabel: c,
              httpPrefixHeaders: u
            } = s.getMergedTraits();
            return !i && !a && !l && !c && u === undefined;
          })) {
            return e;
          }
        }
      }
      async getErrorSchemaOrThrowBaseException(e, t, n, r, o, s) {
        let i = t;
        let a = e;
        if (e.includes("#")) {
          [i, a] = e.split("#");
        }
        let l = {
          $metadata: o,
          $fault: n.statusCode < 500 ? "client" : "server"
        };
        let c = oT.TypeRegistry.for(i);
        try {
          return {
            errorSchema: s?.(c, a) ?? c.getSchema(e),
            errorMetadata: l
          };
        } catch (u) {
          r.message = r.message ?? r.Message ?? "UnknownError";
          let d = oT.TypeRegistry.for("smithy.ts.sdk.synthetic." + i);
          let p = d.getBaseException();
          if (p) {
            let m = d.getErrorCtor(p) ?? Error;
            throw this.decorateServiceException(Object.assign(new m({
              name: a
            }), l), r);
          }
          throw this.decorateServiceException(Object.assign(Error(a), l), r);
        }
      }
      decorateServiceException(e, t = {}) {
        if (this.queryCompat) {
          let n = e.Message ?? t.Message;
          let r = n_e.decorateServiceException(e, t);
          if (n) {
            r.Message = n;
            r.message = n;
          }
          return r;
        }
        return n_e.decorateServiceException(e, t);
      }
      setQueryCompatError(e, t) {
        let n = t.headers?.["x-amzn-query-error"];
        if (e !== undefined && n != null) {
          let [r, o] = n.split(";");
          let s = Object.entries(e);
          let i = {
            Code: r,
            Type: o
          };
          Object.assign(e, i);
          for (let [a, l] of s) {
            i[a] = l;
          }
          delete i.__type;
          e.Error = i;
        }
      }
      queryCompatOutput(e, t) {
        if (e.Error) {
          t.Error = e.Error;
        }
        if (e.Type) {
          t.Type = e.Type;
        }
        if (e.Code) {
          t.Code = e.Code;
        }
      }
    }
    class VHs extends qHs.SmithyRpcV2CborProtocol {
      awsQueryCompatible;
      mixin;
      constructor({
        defaultNamespace: e,
        awsQueryCompatible: t
      }) {
        super({
          defaultNamespace: e
        });
        this.awsQueryCompatible = !!t;
        this.mixin = new Ert(this.awsQueryCompatible);
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        if (this.awsQueryCompatible) {
          r.headers["x-amzn-query-mode"] = "true";
        }
        return r;
      }
      async handleError(e, t, n, r, o) {
        if (this.awsQueryCompatible) {
          this.mixin.setQueryCompatError(r, n);
        }
        let s = qHs.loadSmithyRpcV2CborErrorCode(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = oT.NormalizedSchema.of(i);
        let c = r.message ?? r.Message ?? "Unknown";
        let d = new (oT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          p[m] = this.deserializer.readValue(f, r[m]);
        }
        if (this.awsQueryCompatible) {
          this.mixin.queryCompatOutput(r, p);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
    }
    var hQu = e => {
      if (e == null) {
        return e;
      }
      if (typeof e === "number" || typeof e === "bigint") {
        let t = Error(`Received number ${e} where a string was expected.`);
        t.name = "Warning";
        console.warn(t);
        return String(e);
      }
      if (typeof e === "boolean") {
        let t = Error(`Received boolean ${e} where a string was expected.`);
        t.name = "Warning";
        console.warn(t);
        return String(e);
      }
      return e;
    };
    var gQu = e => {
      if (e == null) {
        return e;
      }
      if (typeof e === "string") {
        let t = e.toLowerCase();
        if (e !== "" && t !== "false" && t !== "true") {
          let n = Error(`Received string "${e}" where a boolean was expected.`);
          n.name = "Warning";
          console.warn(n);
        }
        return e !== "" && t !== "false";
      }
      return e;
    };
    var yQu = e => {
      if (e == null) {
        return e;
      }
      if (typeof e === "string") {
        let t = Number(e);
        if (t.toString() !== e) {
          let n = Error(`Received string "${e}" where a number was expected.`);
          n.name = "Warning";
          console.warn(n);
          return e;
        }
        return t;
      }
      return e;
    };
    class SAe {
      serdeContext;
      setSerdeContext(e) {
        this.serdeContext = e;
      }
    }
    function _Qu(e, t, n) {
      if (n?.source) {
        let r = n.source;
        if (typeof t === "number") {
          if (t > Number.MAX_SAFE_INTEGER || t < Number.MIN_SAFE_INTEGER || r !== String(t)) {
            if (r.includes(".")) {
              return new qN.NumericValue(r, "bigDecimal");
            } else {
              return BigInt(r);
            }
          }
        }
      }
      return t;
    }
    var zHs = (e, t) => n_e.collectBody(e, t).then(n => (t?.utf8Encoder ?? GHs.toUtf8)(n));
    var zBr = (e, t) => zHs(e, t).then(n => {
      if (n.length) {
        try {
          return JSON.parse(n);
        } catch (r) {
          if (r?.name === "SyntaxError") {
            Object.defineProperty(r, "$responseBodyText", {
              value: n
            });
          }
          throw r;
        }
      }
      return {};
    });