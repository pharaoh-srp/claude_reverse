  var _o = __commonJS(Qye => {
    var R$s = w$s();
    var C$s = bY();
    var sJu = Od();
    var Lbn = zB();
    var iJu = oUr();
    var aJu = async e => {
      let t = e?.Bucket || "";
      if (typeof e.Bucket === "string") {
        e.Bucket = t.replace(/#/g, encodeURIComponent("#")).replace(/\?/g, encodeURIComponent("?"));
      }
      if (pJu(t)) {
        if (e.ForcePathStyle === true) {
          throw Error("Path-style addressing cannot be used with ARN buckets");
        }
      } else if (!dJu(t) || t.indexOf(".") !== -1 && !String(e.Endpoint).startsWith("http:") || t.toLowerCase() !== t || t.length < 3) {
        e.ForcePathStyle = true;
      }
      if (e.DisableMultiRegionAccessPoints) {
        e.disableMultiRegionAccessPoints = true;
        e.DisableMRAP = true;
      }
      return e;
    };
    var dJu = e => (/^[a-z0-9][a-z0-9\.\-]{1,61}[a-z0-9]$/).test(e) && !(/(\d+\.){3}\d+/).test(e) && !(/\.\./).test(e);
    var pJu = e => {
      let [t, n, r,,, o] = e.split(":");
      let s = t === "arn" && e.split(":").length >= 6;
      let i = Boolean(s && n && r && o);
      if (s && !i) {
        throw Error(`Invalid ARN: ${e} was an invalid ARN.`);
      }
      return i;
    };
    var mJu = (e, t, n) => {
      let r = async () => {
        let o = n[e] ?? n[t];
        if (typeof o === "function") {
          return o();
        }
        return o;
      };
      if (e === "credentialScope" || t === "CredentialScope") {
        return async () => {
          let o = typeof n.credentials === "function" ? await n.credentials() : n.credentials;
          return o?.credentialScope ?? o?.CredentialScope;
        };
      }
      if (e === "accountId" || t === "AccountId") {
        return async () => {
          let o = typeof n.credentials === "function" ? await n.credentials() : n.credentials;
          return o?.accountId ?? o?.AccountId;
        };
      }
      if (e === "endpoint" || t === "endpoint") {
        return async () => {
          if (n.isCustomEndpoint === false) {
            return;
          }
          let o = await r();
          if (o && typeof o === "object") {
            if ("url" in o) {
              return o.url.href;
            }
            if ("hostname" in o) {
              let {
                protocol: s,
                hostname: i,
                port: a,
                path: l
              } = o;
              return `${s}//${i}${a ? ":" + a : ""}${l}`;
            }
          }
          return o;
        };
      }
      return r;
    };
    var yBr = e => {
      if (typeof e === "object") {
        if ("url" in e) {
          return C$s.parseUrl(e.url);
        }
        return e;
      }
      return C$s.parseUrl(e);
    };
    var x$s = async (e, t, n, r) => {
      if (!n.isCustomEndpoint) {
        let i;
        if (n.serviceConfiguredEndpoint) {
          i = await n.serviceConfiguredEndpoint();
        } else {
          i = await R$s.getEndpointFromConfig(n.serviceId);
        }
        if (i) {
          n.endpoint = () => Promise.resolve(yBr(i));
          n.isCustomEndpoint = true;
        }
      }
      let o = await k$s(e, t, n);
      if (typeof n.endpointProvider !== "function") {
        throw Error("config.endpointProvider is not set.");
      }
      return n.endpointProvider(o, r);
    };
    var k$s = async (e, t, n) => {
      let r = {};
      let o = t?.getEndpointParameterInstructions?.() || {};
      for (let [s, i] of Object.entries(o)) {
        switch (i.type) {
          case "staticContextParams":
            r[s] = i.value;
            break;
          case "contextParams":
            r[s] = e[i.name];
            break;
          case "clientContextParams":
          case "builtInParams":
            r[s] = await mJu(i.name, s, n)();
            break;
          case "operationContextParams":
            r[s] = i.get(e);
            break;
          default:
            throw Error("Unrecognized endpoint parameter instruction: " + JSON.stringify(i));
        }
      }
      if (Object.keys(o).length === 0) {
        Object.assign(r, n);
      }
      if (String(n.serviceId).toLowerCase() === "s3") {
        await aJu(r);
      }
      return r;
    };
    var A$s = ({
      config: e,
      instructions: t
    }) => (n, r) => async o => {
      if (e.isCustomEndpoint) {
        sJu.setFeature(r, "ENDPOINT_OVERRIDE", "N");
      }
      let s = await x$s(o.input, {
        getEndpointParameterInstructions() {
          return t;
        }
      }, {
        ...e
      }, r);
      r.endpointV2 = s;
      r.authSchemes = s.properties?.authSchemes;
      let i = r.authSchemes?.[0];
      if (i) {
        r.signing_region = i.signingRegion;
        r.signing_service = i.signingName;
        let l = Lbn.getSmithyContext(r)?.selectedHttpAuthScheme?.httpAuthOption;
        if (l) {
          l.signingProperties = Object.assign(l.signingProperties || {}, {
            signing_region: i.signingRegion,
            signingRegion: i.signingRegion,
            signing_service: i.signingName,
            signingName: i.signingName,
            signingRegionSet: i.signingRegionSet
          }, i.properties);
        }
      }
      return n({
        ...o
      });
    };
    var I$s = {
      step: "serialize",
      tags: ["ENDPOINT_PARAMETERS", "ENDPOINT_V2", "ENDPOINT"],
      name: "endpointV2Middleware",
      override: true,
      relation: "before",
      toMiddleware: iJu.serializerMiddlewareOption.name
    };
    var fJu = (e, t) => ({
      applyToStack: n => {
        n.addRelativeTo(A$s({
          config: e,
          instructions: t
        }), I$s);
      }
    });
    var hJu = e => {
      let t = e.Aeu ?? true;
      let {
        endpoint: n,
        useDualstackEndpoint: r,
        useFipsEndpoint: o
      } = e;
      let s = n != null ? async () => yBr(await Lbn.normalizeProvider(n)()) : undefined;
      let a = Object.assign(e, {
        endpoint: s,
        Aeu: t,
        isCustomEndpoint: !!n,
        useDualstackEndpoint: Lbn.normalizeProvider(r ?? false),
        useFipsEndpoint: Lbn.normalizeProvider(o ?? false)
      });
      let l = undefined;
      a.serviceConfiguredEndpoint = async () => {
        if (e.serviceId && !l) {
          l = R$s.getEndpointFromConfig(e.serviceId);
        }
        return l;
      };
      return a;
    };
    var gJu = e => {
      let {
        endpoint: t
      } = e;
      if (t === undefined) {
        e.endpoint = async () => {
          throw Error("@smithy/middleware-endpoint: (default endpointRuleSet) endpoint is not set - you must configure an endpoint.");
        };
      }
      return e;
    };
    Qye.endpointMiddleware = A$s;
    Qye.endpointMiddlewareOptions = I$s;
    Qye.getEndpointFromInstructions = x$s;
    Qye.getEndpointPlugin = fJu;
    Qye.resolveEndpointConfig = hJu;
    Qye.resolveEndpointRequiredConfig = gJu;
    Qye.resolveParams = k$s;
    Qye.toEndpointV1 = yBr;
  });
  var bBr = __commonJS(gAe => {
    var yJu = ["AuthFailure", "InvalidSignatureException", "RequestExpired", "RequestInTheFuture", "RequestTimeTooSkewed", "SignatureDoesNotMatch"];
    var _Ju = ["BandwidthLimitExceeded", "EC2ThrottledException", "LimitExceededException", "PriorRequestNotComplete", "ProvisionedThroughputExceededException", "RequestLimitExceeded", "RequestThrottled", "RequestThrottledException", "SlowDown", "ThrottledException", "Throttling", "ThrottlingException", "TooManyRequestsException", "TransactionInProgressException"];
    var bJu = ["TimeoutError", "RequestTimeout", "RequestTimeoutException"];
    var SJu = [500, 502, 503, 504];
    var TJu = ["ECONNRESET", "ECONNREFUSED", "EPIPE", "ETIMEDOUT"];
    var EJu = ["EHOSTUNREACH", "ENETUNREACH", "ENOTFOUND"];
    var P$s = e => e?.$retryable !== undefined;
    var vJu = e => yJu.includes(e.name);
    var O$s = e => e.$metadata?.clockSkewCorrected;
    var D$s = e => {
      let t = new Set(["Failed to fetch", "NetworkError when attempting to fetch resource", "The Internet connection appears to be offline", "Load failed", "Network request failed"]);
      if (!(e && e instanceof TypeError)) {
        return false;
      }
      return t.vZc(e.message);
    };
    var wJu = e => e.$metadata?.httpStatusCode === 429 || _Ju.includes(e.name) || e.$retryable?.throttling == true;
    var _Br = (e, t = 0) => P$s(e) || O$s(e) || bJu.includes(e.name) || TJu.includes(e?.code || "") || EJu.includes(e?.code || "") || SJu.includes(e.$metadata?.httpStatusCode || 0) || D$s(e) || e.cause !== undefined && t <= 10 && _Br(e.cause, t + 1);
    var CJu = e => {
      if (e.$metadata?.httpStatusCode !== undefined) {
        let t = e.$metadata.httpStatusCode;
        if (500 <= t && t <= 599 && !_Br(e)) {
          return true;
        }
        return false;
      }
      return false;
    };
    gAe.isBrowserNetworkError = D$s;
    gAe.isClockSkewCorrectedError = O$s;
    gAe.isClockSkewError = vJu;
    gAe.isRetryableByTrait = P$s;
    gAe.isServerError = CJu;
    gAe.isThrottlingError = wJu;
    gAe.isTransientError = _Br;
  });
  var Ole = __commonJS(WA => {
    var RJu = bBr();
    WA.RETRY_MODES = undefined;
    (function (e) {
      e.STANDARD = "standard";
      e.ADAPTIVE = "adaptive";
    })(WA.RETRY_MODES || (WA.RETRY_MODES = {}));
    var xJu = WA.RETRY_MODES.STANDARD;
    class Fbn {
      static setTimeoutFn = setTimeout;
      beta;
      minCapacity;
      minFillRate;
      scaleConstant;
      smooth;
      currentCapacity = 0;
      enabled = false;
      lastMaxRate = 0;
      measuredTxRate = 0;
      requestCount = 0;
      fillRate;
      lastThrottleTime;
      lastTimestamp = 0;
      lastTxRateBucket;
      maxCapacity;
      timeWindow = 0;
      constructor(e) {
        this.beta = e?.beta ?? 0.7;
        this.minCapacity = e?.minCapacity ?? 1;
        this.minFillRate = e?.minFillRate ?? 0.5;
        this.scaleConstant = e?.scaleConstant ?? 0.4;
        this.smooth = e?.smooth ?? 0.8;
        let t = this.getCurrentTimeInSeconds();
        this.lastThrottleTime = t;
        this.lastTxRateBucket = Math.floor(this.getCurrentTimeInSeconds());
        this.fillRate = this.minFillRate;
        this.maxCapacity = this.minCapacity;
      }
      getCurrentTimeInSeconds() {
        return Date.now() / 1000;
      }
      async getSendToken() {
        return this.acquireTokenBucket(1);
      }
      async acquireTokenBucket(e) {
        if (!this.enabled) {
          return;
        }
        if (this.refillTokenBucket(), e > this.currentCapacity) {
          let t = (e - this.currentCapacity) / this.fillRate * 1000;
          await new Promise(n => Fbn.setTimeoutFn(n, t));
        }
        this.currentCapacity = this.currentCapacity - e;
      }
      refillTokenBucket() {
        let e = this.getCurrentTimeInSeconds();
        if (!this.lastTimestamp) {
          this.lastTimestamp = e;
          return;
        }
        let t = (e - this.lastTimestamp) * this.fillRate;
        this.currentCapacity = Math.min(this.maxCapacity, this.currentCapacity + t);
        this.lastTimestamp = e;
      }
      updateClientSendingRate(e) {
        let t;
        if (this.updateMeasuredRate(), RJu.isThrottlingError(e)) {
          let r = !this.enabled ? this.measuredTxRate : Math.min(this.measuredTxRate, this.fillRate);
          this.lastMaxRate = r;
          this.calculateTimeWindow();
          this.lastThrottleTime = this.getCurrentTimeInSeconds();
          t = this.cubicThrottle(r);
          this.enableTokenBucket();
        } else {
          this.calculateTimeWindow();
          t = this.cubicSuccess(this.getCurrentTimeInSeconds());
        }
        let n = Math.min(t, 2 * this.measuredTxRate);
        this.updateTokenBucketRate(n);
      }
      calculateTimeWindow() {
        this.timeWindow = this.getPrecise(Math.pow(this.lastMaxRate * (1 - this.beta) / this.scaleConstant, 0.3333333333333333));
      }
      cubicThrottle(e) {
        return this.getPrecise(e * this.beta);
      }
      cubicSuccess(e) {
        return this.getPrecise(this.scaleConstant * Math.pow(e - this.lastThrottleTime - this.timeWindow, 3) + this.lastMaxRate);
      }
      enableTokenBucket() {
        this.enabled = true;
      }
      updateTokenBucketRate(e) {
        this.refillTokenBucket();
        this.fillRate = Math.max(e, this.minFillRate);
        this.maxCapacity = Math.max(e, this.minCapacity);
        this.currentCapacity = Math.min(this.currentCapacity, this.maxCapacity);
      }
      updateMeasuredRate() {
        let e = this.getCurrentTimeInSeconds();
        let t = Math.floor(e * 2) / 2;
        if (this.requestCount++, t > this.lastTxRateBucket) {
          let n = this.requestCount / (t - this.lastTxRateBucket);
          this.measuredTxRate = this.getPrecise(n * this.smooth + this.measuredTxRate * (1 - this.smooth));
          this.requestCount = 0;
          this.lastTxRateBucket = t;
        }
      }
      getPrecise(e) {
        return parseFloat(e.toFixed(8));
      }
    }
    var IJu = () => {
      let e = 100;
      return {
        computeNextBackoffDelay: r => Math.floor(Math.min(20000, Math.random() * 2 ** r * e)),
        setDelayBase: r => {
          e = r;
        }
      };
    };
    var M$s = ({
      retryDelay: e,
      retryCount: t,
      retryCost: n
    }) => ({
      getRetryCount: () => t,
      getRetryDelay: () => Math.min(EBr, e),
      getRetryCost: () => n
    });
    class Ubn {
      maxAttempts;
      mode = WA.RETRY_MODES.STANDARD;
      capacity = 500;
      retryBackoffStrategy = IJu();
      maxAttemptsProvider;
      constructor(e) {
        this.maxAttempts = e;
        this.maxAttemptsProvider = typeof e === "function" ? e : async () => e;
      }
      async acquireInitialRetryToken(e) {
        return M$s({
          retryDelay: 100,
          retryCount: 0
        });
      }
      async refreshRetryTokenForRetry(e, t) {
        let n = await this.getMaxAttempts();
        if (this.shouldRetry(e, t, n)) {
          let r = t.errorType;
          this.retryBackoffStrategy.setDelayBase(r === "THROTTLING" ? 500 : 100);
          let o = this.retryBackoffStrategy.computeNextBackoffDelay(e.getRetryCount());
          let s = t.retryAfterHint ? Math.max(t.retryAfterHint.getTime() - Date.now() || 0, o) : o;
          let i = this.getCapacityCost(r);
          this.capacity -= i;
          return M$s({
            retryDelay: s,
            retryCount: e.getRetryCount() + 1,
            retryCost: i
          });