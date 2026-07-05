  __export(ymi, {
    startKeychainPrefetch: () => startKeychainPrefetch,
    setWindowsCredManagerAvailable: () => setWindowsCredManagerAvailable,
    setLastKnown: () => setLastKnown,
    isWindowsCredManagerAvailable: () => isWindowsCredManagerAvailable,
    getLegacyApiKeyPrefetchResult: () => getLegacyApiKeyPrefetchResult,
    getLastKnown: () => getLastKnown,
    ensureKeychainPrefetchCompleted: () => ensureKeychainPrefetchCompleted,
    clearLegacyApiKeyPrefetch: () => clearLegacyApiKeyPrefetch
  });
  function isWindowsCredManagerAvailable() {
    return pmi === true;
  }
  function setWindowsCredManagerAvailable(e) {
    pmi = e;
  }
  function getLastKnown() {
    return fmi;
  }
  function setLastKnown(e) {
    fmi = e;
  }
  function umi(e) {
    return new Promise(t => {
      dmi.execFile("security", ["find-generic-password", "-a", Wle(), "-w", "-s", e], {
        encoding: "utf-8",
        timeout: 1e4,
        windowsHide: true
      }, (n, r) => {
        t({
          stdout: n ? null : r?.trim() || null,
          timedOut: Boolean(n && "killed" in n && n.killed)
        });
      });
    });
  }
  function startKeychainPrefetch() {
    if (null || kd()) {
      return;
    }
    let e = qle.generation;
    return;
  }
  async function ensureKeychainPrefetchCompleted() {
    if (null) {
      await null;
    }
  }
  function getLegacyApiKeyPrefetchResult() {
    return iGr;
  }
  function clearLegacyApiKeyPrefetch() {
    iGr = null;
  }
  var dmi;
  var iGr = null;
  var pmi;
  var fmi = null;
  var _st = __lazy(() => {
    gn();
    o8();
    dmi = require("child_process");
  });
  var _mi = __lazy(() => {
    ln();
    je();
    dt();
    _st();
    o8();
    QLt();
  });
  function yl() {
    return sGr;
  }
  var DW = __lazy(() => {
    Uc();
    gn();
    smi();
    oGr();
    cmi();
    _mi();
  });
  function b0e() {
    let e = getGatewayAuth();
    if (!e?.idpRefreshToken || e.expiresAt - Date.now() >= 300000) {
      return Promise.resolve();
    }
    let t = getGatewayRefreshInFlight();
    if (t) {
      return t;
    }
    let n = Kwd(e, e.idpRefreshToken).finally(() => setGatewayRefreshInFlight(null));
    setGatewayRefreshInFlight(n);
    return n;
  }
  async function Kwd(e, t) {
    try {
      let {
        data: n
      } = await externalHttp.post(e.tokenEndpoint ?? `${e.url}/oauth/token`, new URLSearchParams({
        grant_type: "refresh_token",
        refresh_token: t
      }).toString(), {
        headers: {
          "Content-Type": "application/x-www-form-urlencoded"
        },
        timeout: 1e4
      });
      let r = cGr().safeParse(n);
      if (!r.success) {
        logForDebugging("[gateway-refresh] malformed response; will retry later");
        return;
      }
      if (getGatewayAuth() !== e) {
        logForDebugging("[gateway-refresh] auth changed mid-refresh; discarding");
        return;
      }
      await bmi(e, t, () => ({
        url: e.url,
        jwt: r.data.access_token,
        expiresAt: Date.now() + r.data.expires_in * 1000,
        idpRefreshToken: r.data.refresh_token ?? e.idpRefreshToken,
        ...(e.tokenEndpoint && {
          tokenEndpoint: e.tokenEndpoint
        })
      }));
      logForDebugging("[gateway-refresh] refreshed gateway JWT");
    } catch (n) {
      if (uGr(n) === "invalid_grant") {
        if (getGatewayAuth() !== e) {
          logForDebugging("[gateway-refresh] auth changed mid-refresh; discarding invalid_grant");
          return;
        }
        logForDebugging("[gateway-refresh] IdP rejected refresh token; clearing it", {
          level: "warn"
        });
        try {
          await bmi(e, t, r => ({
            ...r,
            idpRefreshToken: undefined
          }));
        } catch (r) {
          logForDebugging(`[gateway-refresh] secureStorage write failed: ${he(r)}`, {
            level: "warn"
          });
        }
      } else {
        logForDebugging(`[gateway-refresh] transient failure: ${he(n)}`);
      }
    }
  }
  async function bmi(e, t, n) {
    let r = n(e);
    try {
      await yl().mutate(o => {
        let s = o?.enterpriseGateway;
        if (s && s.idpRefreshToken !== t) {
          r = s;
          return o;
        }
        r = n(s ?? e);
        return {
          ...o,
          enterpriseGateway: r
        };
      });
    } catch (o) {
      logForDebugging(`[gateway-refresh] secureStorage write failed; applying refreshed credential in-memory only: ${he(o)}`, {
        level: "warn"
      });
    }
    if (getGatewayAuth() !== e) {
      logForDebugging("[gateway-refresh] auth changed during persist; discarding outcome");
      return;
    }
    setGatewayAuth(r);
  }
  function uGr(e) {
    if (!e || typeof e !== "object" || !("isAxiosError" in e) || !e.isAxiosError) {
      return;
    }
    let t = e.response?.data;
    if (typeof t === "object" && t !== null && "error" in t) {
      let n = t.error;
      return typeof n === "string" ? n : undefined;
    }
    return;
  }
  async function Smi(e) {
    setGatewayAuth(e);
    let t = await yl().mutate(n => ({
      ...n,
      enterpriseGateway: e
    }));
    if (!t.success) {
      throw Error(`Failed to persist gateway credential${t.warning ? `: ${t.warning}` : ""}`);
    }
  }
  var cGr;
  var bst = __lazy(() => {
    qg();
    at();
    pk();
    je();
    dt();
    DW();
    cGr = we(() => Ke.object({
      access_token: Ke.string(),
      expires_in: Ke.number(),
      refresh_token: Ke.string().nullish()
    }));
  });
  function withCredentialsLock(e, t) {
    let n = Emi.dirname(t);
    return async r => {
      let o = await Ywd(n);
      try {
        logEvent("tengu_wif_user_oauth_lock_acquired", {});
        return await e(r);
      } finally {
        logEvent("tengu_wif_user_oauth_lock_released", {});
        try {
          await o();
        } catch (s) {
          if (Zd(s)) {
            logForDebugging(`wif: lock release failed: ${s}`);
          } else {
            Oe(s);
          }
        }
      }
    };
  }
  async function Ywd(e) {
    for (let t = 0;; t++) {
      try {
        return await Ry(e, {
          onCompromised: n => logForDebugging(`WIF credentials lock compromised: ${n}`, {
            level: "error"
          })
        });
      } catch (n) {
        if (n.code !== "ELOCKED") {
          throw n;
        }
        if (t >= 5) {
          throw logEvent("tengu_wif_user_oauth_lock_retry_limit", {
            attempt: t
          }), new WorkloadIdentityError(`Could not acquire credentials lock at ${e} after ${5} retries`);
        }
        logEvent("tengu_wif_user_oauth_lock_retry", {
          attempt: t
        });
        await sleep(1000 + Math.random() * 1000);
      }
    }
  }
  var Emi;
  var dGr = __lazy(() => {
    lte();
    je();
    dt();
    Rn();
    Ot();
    Emi = require("path");
  });
  var hGr = {};