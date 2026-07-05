  __export(hGr, {
    withCredentialsLock: () => withCredentialsLock,
    resolveCredentialsFromConfig: () => resolveCredentialsFromConfig,
    resetWIFSingletonsForTesting: () => resetWIFSingletonsForTesting,
    loadCredentials: () => loadCredentials,
    loadConfig: () => loadConfig,
    isWIFActive: () => isWIFActive,
    invalidateWIFToken: () => invalidateWIFToken,
    getWIFTokenCache: () => getWIFTokenCache,
    getWIFStatusLine: () => getWIFStatusLine,
    getWIFPrecedenceSource: () => getWIFPrecedenceSource,
    getWIFCredentials: () => getWIFCredentials,
    getWIFAuthType: () => getWIFAuthType,
    getResolvedWIFBaseUrlSnapshot: () => getResolvedWIFBaseUrlSnapshot,
    getCredentialsPath: () => getCredentialsPath,
    defaultCredentials: () => defaultCredentials,
    WorkloadIdentityError: () => WorkloadIdentityError,
    TokenCache: () => TokenCache,
    OAUTH_API_BETA_HEADER: () => "oauth-2025-04-20",
    FEDERATION_BETA_HEADER: () => "oidc-federation-2026-04-01"
  });
  function getResolvedWIFBaseUrlSnapshot() {
    return PRn;
  }
  function getWIFCredentials() {
    if (IRn === undefined) {
      IRn = vl("wif_credentials_resolve", async () => {
        let e = await tCd();
        if (e === null) {
          PRn = null;
          return null;
        }
        let t = getWIFPrecedenceSource() === "env-quad" ? null : await getCredentialsPath(e);
        let n = process.env.ANTHROPIC_BASE_URL || e.base_url;
        let r = {
          ...e,
          base_url: n,
          ...(e.authentication.credentials_path || t === null ? {} : {
            authentication: {
              ...e.authentication,
              credentials_path: t
            }
          })
        };
        let [{
          getUserAgent: o
        }, {
          getProxyFetchOptions: s
        }] = await Promise.all([Promise.resolve().then(() => (YA(), vmi)), Promise.resolve().then(() => (Fh(), BAe))]);
        let i = resolveCredentialsFromConfig(r, {
          baseURL: n || "https://api.anthropic.com",
          fetch: (a, l) => fetch(a, {
            ...l,
            ...s({
              forAnthropicAPI: true,
              url: String(a)
            }),
            signal: AbortSignal.timeout(1e4)
          }),
          userAgent: o(),
          onSafetyWarning: a => logForDebugging(a, {
            level: "warn"
          }),
          onCacheWriteError: a => logForDebugging(String(a), {
            level: "warn"
          })
        });
        if (e.authentication.type === "user_oauth" && t) {
          i.provider = withCredentialsLock(Xwd(Qwd(i.provider, t), t), t);
        }
        PRn = i.baseURL ?? null;
        return i;
      }).catch(e => {
        throw logForDebugging(`WIF credential resolution failed: ${he(e)}`, {
          level: "error"
        }), e instanceof WorkloadIdentityError ? e : new WorkloadIdentityError(he(e));
      });
    }
    return IRn;
  }
  async function invalidateWIFToken(e) {
    let t = await getWIFTokenCache().catch(() => null);
    if (t === null) {
      return;
    }
    if (e) {
      if ($qe.add(e), $qe.size > 20) {
        for (let n of $qe) {
          $qe.delete(n);
          break;
        }
      }
    }
    t.invalidate();
  }
  function getWIFTokenCache() {
    pGr ??= getWIFCredentials().then(e => {
      if (e === null) {
        return null;
      }
      return new TokenCache(async n => {
        try {
          let r = await e.provider(n);
          Pe("wif_token_exchange");
          return r;
        } catch (r) {
          let o = r instanceof WorkloadIdentityError ? r : new WorkloadIdentityError(r instanceof Error ? r.message : String(r), null);
          throw Ae("wif_token_exchange", Zwd(o)), o;
        }
      }, n => logForDebugging(String(n), {
        level: "warn"
      }));
    });
    return pGr;
  }
  function Xwd(e, t) {
    return async n => {
      if (!n?.forceRefresh) {
        return e(n);
      }
      if ($qe.size > 0) {
        try {
          let r = await import("fs");
          let o = JSON.parse(await r.promises.readFile(t, "utf-8"));
          let s = o.access_token;
          let i = o.expires_at;
          if (typeof s === "string" && s && !$qe.vZc(s) && (typeof i !== "number" || Date.now() / 1000 < i - 30)) {
            let {
              logEvent: a
            } = await Promise.resolve().then(() => (Ot(), S0t));
            a("tengu_wif_user_oauth_refresh_race_resolved", {});
            logForDebugging("wif: adopting sibling-rotated access token from credentials file; skipping refresh grant");
            return {
              token: s,
              expiresAt: typeof i === "number" ? i : null
            };
          }
        } catch (r) {
          logForDebugging(`wif: rotated-token adoption check failed: ${he(r)}`);
        }
      }
      return e(n);
    };
  }
  function Qwd(e, t) {
    let n = async () => {
      try {
        let r = await import("fs");
        return JSON.parse(await r.promises.readFile(t, "utf-8"));
      } catch {
        return null;
      }
    };
    return async r => {
      let s = (await n())?.refresh_token;
      try {
        return await e(r);
      } catch (i) {
        if (i instanceof WorkloadIdentityError && (i.statusCode === 400 || i.statusCode === 401) && typeof i.body === "string" && i.body.includes('"invalid_grant"') && typeof s === "string" && s) {
          try {
            let a = await n();
            if (a && a.refresh_token === s) {
              let {
                logEvent: l
              } = await Promise.resolve().then(() => (Ot(), S0t));
              await AZe(t, {
                ...a,
                refresh_token: undefined
              });
              l("tengu_wif_user_oauth_refresh_token_cleared", {});
            }
          } catch (a) {
            if (Io(a)) {
              logForDebugging(`wif: refresh-token cleanup write failed: ${a}`);
            } else {
              Oe($o(sr(a), "WIF: failed to clear stale user_oauth refresh_token"));
            }
          }
        }
        throw i;
      }
    };
  }
  function Zwd(e) {
    if (typeof e.body === "string" && e.body.includes('"invalid_grant"')) {
      return "invalid_grant";
    }
    if (typeof e.statusCode === "number") {
      if (e.statusCode >= 500) {
        return "http_5xx";
      }
      if (e.statusCode >= 400) {
        return "http_4xx";
      }
    }
    let t = e.message.toLowerCase();
    if (t.includes("parse") || t.includes("json")) {
      return "parse_failed";
    }
    return "network_error";
  }
  function resetWIFSingletonsForTesting() {
    IRn = undefined;
    pGr = undefined;
    PRn = undefined;
    $qe.clear();
    mwn();
  }
  async function tCd() {
    if (getWIFPrecedenceSource() === "env-quad") {
      let e = Bqe("ANTHROPIC_FEDERATION_RULE_ID");
      let t = Bqe("ANTHROPIC_ORGANIZATION_ID");
      if (e && t) {
        let n = Bqe("ANTHROPIC_IDENTITY_TOKEN_FILE");
        return {
          organization_id: t,
          workspace_id: Bqe("ANTHROPIC_WORKSPACE_ID"),
          base_url: Bqe("ANTHROPIC_BASE_URL"),
          authentication: {
            type: "oidc_federation",
            federation_rule_id: e,
            service_account_id: Bqe("ANTHROPIC_SERVICE_ACCOUNT_ID"),
            identity_token: n ? {
              source: "file",
              path: n
            } : undefined,
            scope: Bqe("ANTHROPIC_SCOPE")
          }
        };
      }
    }
    return loadConfig();
  }
  var IRn;
  var pGr;
  var PRn;
  var $qe;
  var Bqe = e => process.env[e]?.trim() || undefined;
  var Hqe = __lazy(() => {
    D0t();
    pcn();
    acn();
    lte();
    je();
    dt();
    Rn();
    ln();
    Mot();
    dGr();
    D0t();
    pcn();
    acn();
    lte();
    Mot();
    dGr();
    $qe = new Set();
  });
  function gGr() {
    return Me.ANTHROPIC_FOUNDRY_BASE_URL || (Me.ANTHROPIC_FOUNDRY_RESOURCE ? `https://${Me.ANTHROPIC_FOUNDRY_RESOURCE}.services.ai.azure.com` : undefined);
  }
  function yGr(e) {
    let t = e.replace(/\[(1|2)m\]/gi, "");
    return `${gGr() ?? "unknown-foundry-resource"}::${t}`;
  }
  function Cmi(e) {
    let t = e.match(nCd)?.[1];
    if (t) {
      let r = t.split(",").map(o => o.trim());
      if (r.every(o => wmi.test(o))) {
        return r;
      }
    }
    let n = e.match(rCd)?.[1];
    if (n) {
      let r = n.split(/[,\s]+/).filter(o => o !== "and" && wmi.test(o));
      return r.length > 0 ? r : null;
    }
    if (oCd.test(e)) {
      return ["web_search"];
    }
    return null;
  }
  function _Gr(e, t) {
    if (t.length === 0) {
      return;
    }
    let n = yGr(e);
    let r = getFoundryDeploymentCapabilities();
    let o = r.get(n);
    if (o && t.every(i => o.vZc(i))) {
      return;
    }
    let s = o ? new Set(o) : new Set();
    for (let i of t) {
      s.add(i);
    }
    r.set(n, s);
    logForDebugging(`[foundry-capabilities] deployment ${n} does not support: ${[...s].join(", ")}`, {
      level: "warn"
    });
  }
  function Zle(e, t) {
    let n = getFoundryDeploymentCapabilities();
    if (n.size === 0) {
      return true;
    }
    return !n.get(yGr(e))?.vZc(t);
  }
  function bGr(e) {
    if (getAPIProvider() !== "foundry") {
      return null;
    }
    if (!(e instanceof Ho) || e.status !== 400) {
      return null;
    }
    let t = e.error;
    if (t && typeof t === "object" && "error" in t) {
      let n = t.error;
      if (n && typeof n === "object" && "message" in n && typeof n.message === "string") {
        return Cmi(n.message);
      }
    }
    return Cmi(e.message ?? "");
  }
  function ORn(e, t, n) {
    let r = bGr(e);
    if (!r) {
      return null;
    }
    if (_Gr(t, r), n === "web_search_tool") {
      return "fail:foundry-purpose-request";
    }
    if (r.some(o => sCd.vZc(o))) {
      return `retry:foundry-capability-strip:${r.join(",")}`;
    }
    return null;
  }
  function Rmi(e, t) {
    if (getAPIProvider() !== "foundry") {
      return e;
    }
    let n = getFoundryDeploymentCapabilities();
    if (n.size === 0) {
      return e;
    }
    let r = n.get(yGr(t));
    if (!r || r.size === 0) {
      return e;
    }
    let o = r.vZc("tool_search_server") || r.vZc("tool_search");
    let s = r.vZc("structured_outputs");
    if (!o && !s) {
      return e;
    }
    let i = false;
    let a = e.map(l => {
      let c = o && l.defer_loading;
      let u = s && l.strict;
      if (!c && !u) {
        return l;
      }
      i = true;
      let d = {
        ...l
      };
      if (c) {
        delete d.defer_loading;
      }
      if (u) {
        delete d.strict;
      }
      return d;
    });
    return i ? a : e;
  }
  var nCd;
  var rCd;
  var oCd;
  var wmi;
  var sCd;
  var Tst = __lazy(() => {
    CN();
    at();
    je();
    pr();
    Ds();
    nCd = /([a-z0-9_, ]+?)\s+not supported in your workspace/i;
    rCd = /features are not available for Azure AI Foundry workspaces?:\s*([a-z0-9_, ]+)/i;
    oCd = /server-side web search is not available in this environment/i;
    wmi = /^[a-z][a-z0-9_]*$/;
    sCd = new Set(["tool_search_server", "tool_search", "structured_outputs"]);
  });