        }
        throw Error("No retry token available");
      }
      recordSuccess(e) {
        this.capacity = Math.max(500, this.capacity + (e.getRetryCost() ?? 1));
      }
      getCapacity() {
        return this.capacity;
      }
      async getMaxAttempts() {
        try {
          return await this.maxAttemptsProvider();
        } catch (e) {
          console.warn(`Max attempts provider could not resolve. Using default of ${3}`);
          return 3;
        }
      }
      shouldRetry(e, t, n) {
        return e.getRetryCount() + 1 < n && this.capacity >= this.getCapacityCost(t.errorType) && this.isRetryableError(t.errorType);
      }
      getCapacityCost(e) {
        return e === "TRANSIENT" ? 10 : 5;
      }
      isRetryableError(e) {
        return e === "THROTTLING" || e === "TRANSIENT";
      }
    }
    class B$s {
      maxAttemptsProvider;
      rateLimiter;
      standardRetryStrategy;
      mode = WA.RETRY_MODES.ADAPTIVE;
      constructor(e, t) {
        this.maxAttemptsProvider = e;
        let {
          rateLimiter: n
        } = t ?? {};
        this.rateLimiter = n ?? new Fbn();
        this.standardRetryStrategy = new Ubn(e);
      }
      async acquireInitialRetryToken(e) {
        await this.rateLimiter.getSendToken();
        return this.standardRetryStrategy.acquireInitialRetryToken(e);
      }
      async refreshRetryTokenForRetry(e, t) {
        this.rateLimiter.updateClientSendingRate(t);
        return this.standardRetryStrategy.refreshRetryTokenForRetry(e, t);
      }
      recordSuccess(e) {
        this.rateLimiter.updateClientSendingRate({});
        this.standardRetryStrategy.recordSuccess(e);
      }
    }
    class $$s extends Ubn {
      computeNextBackoffDelay;
      constructor(e, t = 100) {
        super(typeof e === "function" ? e : async () => e);
        if (typeof t === "number") {
          this.computeNextBackoffDelay = () => t;
        } else {
          this.computeNextBackoffDelay = t;
        }
      }
      async refreshRetryTokenForRetry(e, t) {
        let n = await super.refreshRetryTokenForRetry(e, t);
        n.getRetryDelay = () => this.computeNextBackoffDelay(n.getRetryCount());
        return n;
      }
    }
    WA.AdaptiveRetryStrategy = B$s;
    WA.ConfiguredRetryStrategy = $$s;
    WA.DEFAULT_MAX_ATTEMPTS = 3;
    WA.DEFAULT_RETRY_DELAY_BASE = 100;
    WA.DEFAULT_RETRY_MODE = xJu;
    WA.DefaultRateLimiter = Fbn;
    WA.INITIAL_RETRY_TOKENS = 500;
    WA.INVOCATION_ID_HEADER = "amz-sdk-invocation-id";
    WA.MAXIMUM_RETRY_DELAY = 20000;
    WA.NO_RETRY_INCREMENT = 1;
    WA.REQUEST_HEADER = "amz-sdk-request";
    WA.RETRY_COST = 5;
    WA.StandardRetryStrategy = Ubn;
    WA.THROTTLING_RETRY_DELAY_BASE = 500;
    WA.TIMEOUT_RETRY_COST = 10;
  });