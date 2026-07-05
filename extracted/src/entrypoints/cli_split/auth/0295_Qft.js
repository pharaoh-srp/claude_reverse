  }
  function Qft(e) {
    return LWn.get(e);
  }
  async function NSo(e, t) {
    let n = MC(e, t);
    let r = (await yl().readAsync())?.mcpOAuth?.[n];
    if (!r || r.accessToken || r.refreshToken) {
      return;
    }
    try {
      await yl().mutate(o => {
        let s = o.mcpOAuth?.[n];
        if (!s || s.accessToken || s.refreshToken) {
          return o;
        }
        let i = {
          ...o.mcpOAuth
        };
        delete i[n];
        return {
          ...o,
          mcpOAuth: i
        };
      });
    } catch (o) {
      dn(e, `clear tokenless stub failed: ${he(o)}`);
    }
  }
  async function FHa({
    serverName: e,
    endpoint: t,
    token: n,
    tokenTypeHint: r,
    clientId: o,
    clientSecret: s,
    accessToken: i,
    authMethod: a = "client_secret_basic"
  }) {
    let l = new URLSearchParams();
    l.set("token", n);
    l.set("token_type_hint", r);
    let c = {
      "Content-Type": "application/x-www-form-urlencoded"
    };
    if (o && s) {
      if (a === "client_secret_post") {
        l.set("client_id", o);
        l.set("client_secret", s);
      } else {
        let u = Buffer.from(`${encodeURIComponent(o)}:${encodeURIComponent(s)}`).toString("base64");
        c.Authorization = `Basic ${u}`;
      }
    } else if (o) {
      l.set("client_id", o);
    } else {
      dn(e, `No client_id available for ${r} revocation - server may reject`);
    }
    try {
      await NP.post(t, l, {
        headers: c
      });
      dn(e, `Successfully revoked ${r}`);
    } catch (u) {
      if (NP.isAxiosError(u) && u.response?.status === 401 && i) {
        dn(e, `Got 401, retrying ${r} revocation with Bearer auth`);
        l.delete("client_id");
        l.delete("client_secret");
        await NP.post(t, l, {
          headers: {
            ...c,
            Authorization: `Bearer ${i}`
          }
        });
        dn(e, `Successfully revoked ${r} with Bearer auth`);
      } else {
        throw u;
      }
    }
  }
  async function yEe(e, t, {
    preserveStepUpState: n = false
  } = {}) {
    let r = yl();
    let o = await r.readAsync();
    if (!o?.mcpOAuth) {
      Pe("mcp_oauth_revoke");
      return;
    }
    let s = MC(e, t);
    let i = o.mcpOAuth[s];
    let a;
    if (i?.accessToken || i?.refreshToken) {
      try {
        let l = i.discoveryState?.authorizationServerUrl ?? t.url;
        let c = await UWn(e, l, t.oauth?.authServerMetadataUrl);
        if (!c) {
          dn(e, "No OAuth metadata found");
          a = "no_metadata";
        } else {
          let u = "revocation_endpoint" in c ? c.revocation_endpoint : null;
          if (!u) {
            dn(e, "Server does not support token revocation");
            a = "no_revocation_endpoint";
          } else {
            let d = String(u);
            let p = ("revocation_endpoint_auth_methods_supported" in c ? c.revocation_endpoint_auth_methods_supported : undefined) ?? ("token_endpoint_auth_methods_supported" in c ? c.token_endpoint_auth_methods_supported : undefined);
            let m = p && !p.includes("client_secret_basic") && p.includes("client_secret_post") ? "client_secret_post" : "client_secret_basic";
            if (dn(e, `Revoking tokens via ${d} (${m})`), i.refreshToken) {
              try {
                await FHa({
                  serverName: e,
                  endpoint: d,
                  token: i.refreshToken,
                  tokenTypeHint: "refresh_token",
                  clientId: i.clientId,
                  clientSecret: i.clientSecret,
                  accessToken: i.accessToken,
                  authMethod: m
                });
              } catch (f) {
                dn(e, `Failed to revoke refresh token: ${he(f)}`);
                a = "server_revoke_failed";
              }
            }
            if (i.accessToken) {
              try {
                await FHa({
                  serverName: e,
                  endpoint: d,
                  token: i.accessToken,
                  tokenTypeHint: "access_token",
                  clientId: i.clientId,
                  clientSecret: i.clientSecret,
                  accessToken: i.accessToken,
                  authMethod: m
                });
              } catch (f) {
                dn(e, `Failed to revoke access token: ${he(f)}`);
                a = "server_revoke_failed";
              }
            }
          }
        }
      } catch (l) {
        dn(e, `Failed to revoke tokens: ${he(l)}`);
        a = "server_revoke_failed";
      }
    } else {
      dn(e, "No tokens to revoke");
    }
    try {
      if (n && i && (i.stepUpScope || i.discoveryState || i.clientId)) {
        await r.mutate(l => {
          let c = l.mcpOAuth?.[s];
          if (c?.accessToken !== i.accessToken || c?.clientId !== i.clientId) {
            return l;
          }
          return {
            ...l,
            mcpOAuth: {
              ...l.mcpOAuth,
              [s]: {
                serverName: e,
                serverUrl: t.url,
                accessToken: "",
                refreshToken: undefined,
                expiresAt: undefined,
                ...(i.clientId && {
                  clientId: i.clientId,
                  ...(i.redirectUri && {
                    redirectUri: i.redirectUri
                  }),
                  ...(i.clientSecret !== undefined && {
                    clientSecret: i.clientSecret
                  })
                }),
                ...(i.stepUpScope && {
                  stepUpScope: i.stepUpScope
                }),
                ...(i.discoveryState && {
                  discoveryState: {
                    authorizationServerUrl: i.discoveryState.authorizationServerUrl,
                    resourceMetadataUrl: i.discoveryState.resourceMetadataUrl,
                    oauthMetadataFound: i.discoveryState.oauthMetadataFound
                  }
                })
              }
            }
          };
        });
        dn(e, "Preserved step-up auth state across revocation");
      } else {
        await $Wn(e, t);
      }
    } catch (l) {
      dn(e, `clear local tokens failed: ${he(l)}`);
      a ??= "local_clear_failed";
    }
    if (a) {
      Et("mcp_oauth_revoke", a);
    } else {
      Pe("mcp_oauth_revoke");
    }
  }
  async function $Wn(e, t, n) {
    let r = MC(e, t);
    let o;
    if (await yl().mutate(s => {
      let i = s.mcpOAuth?.[r];
      if (!i) {
        return s;
      }
      let a = {
        ...s.mcpOAuth
      };
      if (n?.preserveClientRegistration && i.clientId) {
        if (!i.accessToken && !i.refreshToken) {
          return s;
        }
        a[r] = {
          ...i,
          accessToken: "",
          refreshToken: undefined,
          expiresAt: 0,
          scope: undefined
        };
        o = "tokens";
      } else {
        delete a[r];
        o = "all";
      }
      return {
        ...s,
        mcpOAuth: a
      };
    }), o) {
      dn(e, o === "tokens" ? "Cleared stored tokens (preserved client registration)" : "Cleared stored tokens");
    }
  }
  function HHa(e, t, n, r) {
    if (n?.success) {
      return;
    }
    let o = r ? "mutate_rejected" : "storage_write_failed";
    let s = r ? he(r) : n?.warning ?? "storage write failed";
    dn(e, `Token persist failed: ${s}`);
    let i = u9(t);
    logEvent("tengu_mcp_oauth_token_persist_failed", {
      transportType: t.type,
      ...(i && {
        mcpServerBaseUrl: i
      }),
      reason: o
    });
  }
  async function wHp(e, t, n, r, o) {
    if (!t.oauth?.xaa) {
      throw Error("XAA: oauth.xaa must be set");
    }
    let s = Pce();
    if (!s) {
      throw Error("XAA: no IdP connection configured. Run 'claude mcp xaa setup --issuer <url> --client-id <id> --client-secret' to configure.");
    }
    let i = t.oauth?.clientId;
    if (!i) {
      throw Error(`XAA: server '${e}' needs an AS client_id. Re-add with --client-id.`);
    }
    let l = (await jWn(e, t))?.clientSecret;
    if (!l) {
      let p = MC(e, t);
      let m = Object.keys((await yl().readAsync())?.mcpOAuthClientConfig ?? {});
      let f = Sbu(t.headers ?? {}, (h, g) => g.toLowerCase() === "authorization" ? "[REDACTED]" : h);
      throw dn(e, `XAA: secret lookup miss. wanted=${p} have=[${m.join(", ")}] configHeaders=${De(f)}`), Error(`XAA: AS client secret not found for '${e}'. Re-add with --client-secret.`);
    }
    dn(e, "XAA: starting cross-app access flow");
    let c = await pat(s.issuer);
    let u = (await T4e(s.issuer)) !== undefined;
    let d = "idp_login";
    try {
      let p;
      try {
        p = await $In({
          idpIssuer: s.issuer,
          idpClientId: s.clientId,
          idpClientSecret: c,
          callbackPort: s.callbackPort,
          onAuthorizationUrl: n,
          skipBrowserOpen: o,
          abortSignal: r
        });
      } catch (_) {
        if (r?.aborted) {
          throw new p3();
        }
        throw _;
      }
      d = "discovery";
      let m = await BIn(s.issuer);
      d = "token_exchange";
      let f;
      try {
        f = await OSo(t.url, {
          clientId: i,
          clientSecret: l,
          idpClientId: s.clientId,
          idpClientSecret: c,
          idpIdToken: p,
          idpTokenEndpoint: m.token_endpoint
        }, e, r);
      } catch (_) {
        if (r?.aborted) {
          throw new p3();
        }
        let b = he(_);
        if (_ instanceof gEe) {
          if (_.shouldClearIdToken) {
            await TIe(s.issuer);
            dn(e, "XAA: cleared cached id_token after token-exchange failure");
          }
        } else if (b.includes("PRM discovery failed") || b.includes("AS metadata discovery failed") || b.includes("no authorization server supports jwt-bearer")) {
          d = "discovery";
        } else if (b.includes("jwt-bearer")) {
          d = "jwt_bearer";
        }
        throw _;
      }
      let h = MC(e, t);
      let g;
      let y;
      try {
        g = await yl().mutate(_ => {
          let b = _.mcpOAuth?.[h];
          return {
            ..._,
            mcpOAuth: {
              ..._.mcpOAuth,
              [h]: {
                ...b,
                serverName: e,
                serverUrl: t.url,
                accessToken: f.access_token,
                refreshToken: f.refresh_token ?? b?.refreshToken,
                expiresAt: f.expires_in != null ? Date.now() + f.expires_in * 1000 : undefined,
                scope: f.scope,
                clientId: i,
                clientSecret: l,
                discoveryState: {
                  authorizationServerUrl: f.authorizationServerUrl
                }
              }
            }
          };
        });
      } catch (_) {
        y = _;
      }
      if (g?.success) {
        dn(e, "XAA: tokens saved");
      } else {
        HHa(e, t, g, y);
      }
      logEvent("tengu_mcp_oauth_flow_success", {
        authMethod: "xaa",
        idTokenCacheHit: u
      });
      Pe("mcp_oauth_flow");
    } catch (p) {
      if (p instanceof p3) {
        throw p;
      }
      throw Ae("mcp_oauth_flow", "mcp_oauth_xaa_failed"), logEvent("tengu_mcp_oauth_flow_failure", {
        authMethod: "xaa",
        xaaFailureStage: d,
        idTokenCacheHit: u
      }), p;
    }
  }
  async function dQ(e, t, n, r, o) {
    if (t.oauth?.xaa) {
      if (!mJ()) {
        throw Error(`XAA is not enabled (set CLAUDE_CODE_ENABLE_XAA=1). Remove 'oauth.xaa' from server '${e}' to use the standard consent flow.`);
      }
      logEvent("tengu_mcp_oauth_flow_start", {
        isOAuthFlow: true,
        authMethod: "xaa",
        transportType: t.type,
        ...(u9(t) && {
          mcpServerBaseUrl: u9(t)
        })
      });
      await wHp(e, t, n, r, o?.skipBrowserOpen);
      return;
    }
    let s = yl();
    let i = MC(e, t);
    let a = (await s.readAsync())?.mcpOAuth?.[i];
    let l = a?.stepUpScope;
    let c = a?.discoveryState?.resourceMetadataUrl;
    let u = a?.clientId && a.redirectUri && MSo(a.redirectUri) === "http://localhost" ? Number(new URL(a.redirectUri).port) || undefined : undefined;
    let d;
    if (c) {
      try {
        d = new URL(c);
      } catch {
        dn(e, `Invalid cached resourceMetadataUrl: ${c}`);
      }
    }
    let p = {
      scope: l,
      resourceMetadataUrl: d
    };
    let m = BWn.randomUUID();
    logEvent("tengu_mcp_oauth_flow_start", {
      flowAttemptId: m,
      isOAuthFlow: true,
      transportType: t.type,
      ...(u9(t) && {
        mcpServerBaseUrl: u9(t)
      })
    });
    let f = false;
    try {
      let h = t.oauth?.callbackPort;
      let g = !!o?.redirectUri;
      let y = g ? 0 : h ?? (await FIn(u));
      let _ = o?.redirectUri ?? f2t(y);
      dn(e, g ? `Using custom redirectUri: ${_} (no localhost listener)` : `Using redirect port: ${y}${h ? " (from config)" : u && y === u ? " (reusing registered port)" : ""}`);
      let b = !a?.clientId || y === u || a.redirectUri === _;
      try {
        await $Wn(e, t, {
          preserveClientRegistration: b
        });
      } catch (F) {
        dn(e, `clear stored credentials failed: ${he(F)}`);
      }
      let S = new AbortController();
      if (!g) {
        MWn.get(y)?.abort();
        MWn.set(y, S);
      }
      let E = new O6e(e, t, _, true, n, o?.skipBrowserOpen);
      let C = Boolean(t.oauth?.scopes || t.oauth?.authServerMetadataUrl);
      if (p.scope && !C) {
        E.markStepUpPending(p.scope);
      }
      try {
        let F = await UWn(e, t.url, t.oauth?.authServerMetadataUrl, undefined, p.resourceMetadataUrl);
        if (F) {
          E.setMetadata(F);
          dn(e, `Fetched OAuth metadata with scope: ${qHa(F) || "NONE"}`);
        }
      } catch (F) {
        dn(e, `Failed to fetch OAuth metadata: ${he(F)}`);
      }
      let x = await E.state();
      let A = null;
      let k = null;
      let I = null;
      let O = null;
      let M = () => {
        if (A) {
          A.removeAllListeners();
          A.on("error", () => {});
          A.close();
          A = null;
        }
        if (k) {
          clearTimeout(k);
          k = null;
        }
        if (I) {
          r?.removeEventListener("abort", I);
          S.signal.removeEventListener("abort", I);
          I = null;
        }
        if (MWn.get(y) === S) {
          MWn.delete(y);
        }
        if (NWn.get(e) === O) {
          NWn.delete(e);
        }
        dn(e, "MCP OAuth server cleaned up");
      };
      let L = await new Promise((F, H) => {
        let U = false;
        let N = z => {
          if (U) {
            return;
          }
          U = true;
          F(z);
        };
        let W = z => {
          if (U) {
            return;
          }
          U = true;
          H(z);
        };
        if (I = () => {
          M();
          W(new p3());
        }, r?.aborted || S.signal.aborted) {
          I();
          return;
        }
        r?.addEventListener("abort", I);
        S.signal.addEventListener("abort", I);
        {
          let z = V => {
            try {
              let K = new URL(V);
              let J = K.searchParams.get("code");
              let Q = K.searchParams.get("state");
              let Z = K.searchParams.get("error");
              if (!J && !Z) {
                return false;
              }
              if (Q !== x) {
                M();
                W(Error("OAuth state mismatch - possible CSRF attack"));
                return true;
              }
              if (Z) {
                let ne = K.searchParams.get("error_description") || "";
                M();
                W(Error(`OAuth error: ${Z} - ${ne}`));
                return true;
              }
              if (!J) {
                return false;
              }
              dn(e, "Received auth code via manual callback URL");
              M();
              N(J);
              return true;
            } catch {
              return false;
            }
          };
          O = z;
          NWn.set(e, z);
          o?.onWaitingForCallback?.(z, y, x);
        }
        let j = async () => {
          try {
            dn(e, "Starting SDK auth");
            dn(e, `Server URL: ${t.url}`);
            let z = await pJ(E, {
              serverUrl: t.url,
              scope: p.scope,
              resourceMetadataUrl: p.resourceMetadataUrl,
              fetchFn: FWn()
            });
            if (dn(e, `Initial auth result: ${z}`), z !== "REDIRECT") {
              dn(e, `Unexpected auth result, expected REDIRECT: ${z}`);
            }
          } catch (z) {
            dn(e, `SDK auth error: ${z}`);
            M();
            W(Error(`SDK auth failed: ${he(z)}`, {
              cause: z
            }));
          }
        };
        if (g) {
          j();
        } else {
          A = UHa.createServer((z, V) => {
            let K = $Ha.parse(z.url || "", true);
            if (K.pathname === "/callback") {
              let J = K.query.code;
              let Q = K.query.state;
              let Z = K.query.error;
              let ne = K.query.error_description;
              let oe = K.query.error_uri;
              if (Q !== x) {
                V.writeHead(400, {
                  "Content-Type": "text/html"
                });
                V.end(Ice({
                  ok: false,
                  heading: "Authentication failed",
                  message: "Invalid state parameter. Close this tab and try again from Claude Code."
                }));
                return;
              }
              if (Z) {
                V.writeHead(200, {
                  "Content-Type": "text/html"
                });
                V.end(Ice({
                  ok: false,
                  heading: "Authentication failed",
                  message: "Close this tab and try again from Claude Code.",
                  detail: `${String(Z)}: ${ne ?? ""}`
                }));
                M();
                let ee = `OAuth error: ${Z}`;
                if (ne) {
                  ee += ` - ${ne}`;
                }
                if (oe) {
                  ee += ` (See: ${oe})`;
                }
                W(Error(ee));
                return;
              }
              if (J) {
                V.writeHead(200, {
                  "Content-Type": "text/html"
                });
                V.end(Ice({
                  ok: true,
                  heading: "Authentication successful",
                  message: "You can close this tab and return to Claude Code."
                }));
                M();
                N(J);
              }
            } else {
              V.writeHead(404, {
                "Content-Type": "text/html"
              });
              V.end(Ice({
                ok: false,
                heading: "Not found",
                message: `This is the Claude Code MCP OAuth callback listener. It only handles /callback. If your OAuth provider redirected here, the registered redirect_uri must be ${_}.`
              }));
            }
          });
          A.on("error", z => {
            if (M(), z.code === "EADDRINUSE") {
              let V = Wt() === "windows" ? `netstat -ano | findstr :${y}` : `lsof -ti:${y} -sTCP:LISTEN`;
              W(Error(`OAuth callback port ${y} is already in use \u2014 another process may be holding it. ` + `Run \`${V}\` to find it.`));
            } else {
              W(Error(`OAuth callback server failed: ${z.message}`));
            }
          });
          A.listen(y, "127.0.0.1", () => void j());
          A.unref();
        }
        k = setTimeout((z, V) => {
          z();
          V(Error("Authentication timeout"));
        }, 300000, M, W);
        k.unref();
      });
      f = true;
      dn(e, "Completing auth flow with authorization code");
      let P = await pJ(E, {
        serverUrl: t.url,
        authorizationCode: L,
        resourceMetadataUrl: p.resourceMetadataUrl,
        fetchFn: FWn()
      });
      if (dn(e, `Auth result: ${P}`), P === "AUTHORIZED") {
        let F = await E.tokens();
        if (dn(e, `Tokens after auth: ${F ? "Present" : "Missing"}`), F) {
          dn(e, `Token access_token length: ${F.access_token?.length}`);
          dn(e, `Token expires_in: ${F.expires_in}`);
        }
        logEvent("tengu_mcp_oauth_flow_success", {
          flowAttemptId: m,
          transportType: t.type,
          ...(u9(t) && {
            mcpServerBaseUrl: u9(t)
          })
        });
        Pe("mcp_oauth_flow");
      } else {
        throw Error("Unexpected auth result: " + P);
      }
    } catch (h) {
      dn(e, `Error during auth completion: ${h}`);
      let g = "unknown";
      let y;
      let _;
      let b = he(h);
      let S = h instanceof Error ? h.cause : undefined;
      if (h instanceof p3) {
        g = "cancelled";
      } else if (/AADSTS\d/.test(b)) {
        g = "entra_specific";
      } else if (/redirect[_ ]uri/i.test(b)) {
        g = "redirect_uri_mismatch";
      } else if (f) {
        g = "token_exchange_failed";
      } else if (b.includes("Authentication timeout")) {
        g = "timeout";
      } else if (b.includes("OAuth state mismatch")) {
        g = "state_mismatch";
      } else if (b.includes("OAuth error:")) {
        g = "provider_denied";
      } else if (b.includes("already in use") || b.includes("EADDRINUSE") || b.includes("callback server failed") || b.includes("No available port")) {
        g = "port_unavailable";
      } else if (b.includes("SDK auth failed")) {
        g = THp(b, S);
      }
      let E = (S instanceof Error ? S : h instanceof Error ? h : null)?.message.match(/^HTTP (\d{3})\b/);
      if (E) {
        _ = Number(E[1]);
      }
      if (S instanceof cw) {
        y = S.errorCode;
      }
      if (h instanceof cw) {
        if (y = h.errorCode, h.errorCode === "invalid_client" || h.errorCode === "unauthorized_client") {
          let C = MC(e, t);
          try {
            await yl().mutate(x => {
              let A = x.mcpOAuth?.[C];
              if (!A) {
                return x;
              }
              return {
                ...x,
                mcpOAuth: {
                  ...x.mcpOAuth,
                  [C]: {
                    ...A,
                    clientId: undefined,
                    clientSecret: undefined
                  }
                }
              };
            });
          } catch (x) {
            dn(e, `clear clientId failed: ${he(x)}`);
          }
        }
      }
      if (g === "timeout" || b.includes("OAuth error:")) {
        let C = MC(e, t);
        await yl().mutate(x => {
          let A = x.mcpOAuth?.[C];
          if (!A?.clientId || A.accessToken || A.refreshToken || A.clientId !== a?.clientId) {
            return x;
          }
          return {
            ...x,
            mcpOAuth: {
              ...x.mcpOAuth,
              [C]: {
                ...A,
                clientId: undefined,
                clientSecret: undefined
              }
            }
          };
        }).catch(x => dn(e, `drop clientId failed: ${he(x)}`));
      }
      if (g !== "cancelled") {
        Ae("mcp_oauth_flow", "mcp_oauth_flow_failed");
      }
      throw logEvent("tengu_mcp_oauth_flow_error", {
        flowAttemptId: m,
        reason: g,
        error_code: y,
        http_status: _?.toString(),
        transportType: t.type,
        ...(u9(t) && {
          mcpServerBaseUrl: u9(t)
        })
      }), h;
    }
  }
  function HWn(e, t) {
    return async (n, r) => {
      let o = await e(n, r);
      if (o.status === 401 || o.status === 403) {
        t.sawAuthChallenge = true;
      }
      if (o.status === 403) {
        let s = o.headers.get("WWW-Authenticate");
        if (s?.includes("insufficient_scope")) {
          let i = s.match(/scope=(?:"([^"]+)"|([^\s,]+))/);
          let a = i?.[1] ?? i?.[2];
          if (a) {
            t.markStepUpPending(a);
          }
        }
      }
      return o;
    };
  }
  class O6e {
    serverName;
    serverConfig;
    redirectUri;
    handleRedirection;
    _codeVerifier;
    _authorizationUrl;
    _state;
    _scopes;
    _metadata;
    _refreshInProgress;
    _pendingStepUpScope;
    _lastServedClientId;
    _lastServedAccessToken;
    _lastServedRefreshToken;
    onAuthorizationUrlCallback;
    skipBrowserOpen;
    constructor(e, t, n = f2t(), r = false, o, s) {
      this.serverName = e;
      this.serverConfig = t;
      this.redirectUri = n;
      this.handleRedirection = r;
      this.onAuthorizationUrlCallback = o;
      this.skipBrowserOpen = s ?? false;
    }
    get redirectUrl() {
      return this.redirectUri;
    }
    get authorizationUrl() {
      return this._authorizationUrl;
    }
    get clientMetadata() {
      let e = {
        client_name: `Claude Code (${this.serverName})`,
        redirect_uris: [this.redirectUri],
        grant_types: ["authorization_code", "refresh_token"],
        response_types: ["code"],
        token_endpoint_auth_method: "none"
      };
      let t = this.getCuratedMetadataScope();
      if (t) {
        e.scope = t;
        dn(this.serverName, `Using scope from metadata: ${e.scope}`);
      }
      return e;
    }
    get clientMetadataUrl() {
      let e = process.env.MCP_OAUTH_CLIENT_METADATA_URL;
      if (e) {
        dn(this.serverName, `Using CIMD URL from env: ${e}`);
        return e;
      }
      return "https://claude.ai/oauth/claude-code-client-metadata";
    }
    setMetadata(e) {
      this._metadata = e;
    }
    getCuratedMetadataScope() {
      let e = qHa(this._metadata);
      if (e !== undefined) {
        return e;
      }
      if (this.serverConfig.oauth?.authServerMetadataUrl && Array.isArray(this._metadata?.scopes_supported)) {
        return this._metadata.scopes_supported.join(" ");
      }
      return;
    }
    markStepUpPending(e) {
      this._pendingStepUpScope = e;
      dn(this.serverName, `Marked step-up pending: ${e}`);
    }
    sawAuthChallenge = false;
    async state() {
      if (!this._state) {
        this._state = BWn.randomBytes(32).toString("base64url");
        dn(this.serverName, "Generated new OAuth state");
      }
      return this._state;
    }
    async clientInformation() {
      let t = await yl().readAsync();
      let n = MC(this.serverName, this.serverConfig);
      let r = t?.mcpOAuthClientConfig?.[n]?.clientSecret;
      let o = this.serverConfig.oauth?.clientId;
      let s = t?.mcpOAuth?.[n];
      if (s?.clientId) {
        let i = s.redirectUri;
        if (this.handleRedirection && (i ? MSo(i) !== MSo(this.redirectUri) : !this.redirectUri.startsWith("http://localhost"))) {
          dn(this.serverName, `Cached client_id was registered for ${i ?? "localhost"}; current redirectUri is ${this.redirectUri} \u2014 forcing re-DCR`);
          return;
        }
        dn(this.serverName, "Found client info");
        this._lastServedClientId = s.clientId;
        return {
          client_id: s.clientId,
          client_secret: s.clientSecret ?? (s.clientId === o ? r : undefined)
        };
      }
      if (o) {
        dn(this.serverName, "Using pre-configured client ID");
        this._lastServedClientId = o;
        return {
          client_id: o,
          client_secret: r
        };
      }
      dn(this.serverName, "No client info found");
      return;
    }
    async saveClientInformation(e) {
      let t = MC(this.serverName, this.serverConfig);
      try {
        if ((await yl().mutate(r => ({
          ...r,
          mcpOAuth: {
            ...r.mcpOAuth,
            [t]: {
              ...r.mcpOAuth?.[t],
              serverName: this.serverName,
              serverUrl: this.serverConfig.url,
              clientId: e.client_id,
              clientSecret: e.client_secret,
              redirectUri: this.redirectUri,
              accessToken: r.mcpOAuth?.[t]?.accessToken || "",
              expiresAt: r.mcpOAuth?.[t]?.expiresAt
            }
          }
        })))?.success) {
          this._lastServedClientId = e.client_id;
        } else {
          dn(this.serverName, "saveClientInformation persist resolved unsuccessful");
        }
      } catch (n) {
        dn(this.serverName, `saveClientInformation persist failed: ${he(n)}`);
      }
    }
    async tokens() {
      let t = await yl().readAsync();
      let n = MC(this.serverName, this.serverConfig);
      let r = t?.mcpOAuth?.[n];
      if (mJ() && this.serverConfig.oauth?.xaa && !r?.refreshToken && (!r?.accessToken || r.expiresAt != null && (r.expiresAt - Date.now()) / 1000 <= 300)) {
        if (!this._refreshInProgress) {
          dn(this.serverName, r ? "XAA: access_token expiring, attempting silent exchange" : "XAA: no access_token yet, attempting silent exchange");
          this._refreshInProgress = this.xaaRefresh().finally(() => {
            this._refreshInProgress = undefined;
          });
        }
        try {
          let a = await this._refreshInProgress;
          if (a) {
            this._lastServedAccessToken = a.access_token;
            this._lastServedRefreshToken = a.refresh_token ?? this._lastServedRefreshToken;
            return a;
          }
        } catch (a) {
          dn(this.serverName, `XAA silent exchange failed: ${he(a)}`);
        }
      }
      if (!r) {
        dn(this.serverName, "No token data found");
        return;
      }
      if (!r.accessToken) {
        dn(this.serverName, "No access token in storage");
        return;
      }
      this._lastServedAccessToken = r.accessToken;
      this._lastServedRefreshToken = r.refreshToken;
      let o = r.expiresAt != null ? (r.expiresAt - Date.now()) / 1000 : undefined;
      let s = this._pendingStepUpScope !== undefined;
      if (s) {
        dn(this.serverName, `Step-up pending (${this._pendingStepUpScope}), omitting refresh_token`);
      }
      if (o != null && o <= 0 && !r.refreshToken) {
        dn(this.serverName, "Token expired without refresh token");
        return;
      }
      if (o != null && o <= 300 && r.refreshToken && !s) {
        if (!this._refreshInProgress) {
          dn(this.serverName, `Token expires in ${Math.floor(o)}s, attempting proactive refresh`);
          this._refreshInProgress = this.refreshAuthorization(r.refreshToken).finally(() => {
            this._refreshInProgress = undefined;
          });
        } else {
          dn(this.serverName, "Token refresh already in progress, reusing existing promise");
        }
        try {
          let a = await this._refreshInProgress;
          if (a) {
            dn(this.serverName, "Token refreshed successfully");
            this._lastServedAccessToken = a.access_token;
            this._lastServedRefreshToken = a.refresh_token ?? this._lastServedRefreshToken;
            return a;
          }
          dn(this.serverName, "Token refresh failed, returning current tokens");
        } catch (a) {
          dn(this.serverName, `Token refresh error: ${he(a)}`);
        }
      }
      let i = {
        access_token: r.accessToken,
        refresh_token: s ? undefined : r.refreshToken,
        expires_in: o,
        scope: r.scope,
        token_type: "Bearer"
      };
      dn(this.serverName, "Returning tokens");
      dn(this.serverName, `Token length: ${i.access_token?.length}`);
      dn(this.serverName, `Has refresh token: ${!!i.refresh_token}`);
      dn(this.serverName, o != null ? `Expires in: ${Math.floor(o)}s` : "No expiration specified");
      return i;
    }
    async saveTokens(e) {
      this._pendingStepUpScope = undefined;
      let t = MC(this.serverName, this.serverConfig);
      dn(this.serverName, "Saving tokens");
      dn(this.serverName, `Token expires in: ${e.expires_in}`);
      dn(this.serverName, `Has refresh token: ${!!e.refresh_token}`);
      let n;
      let r;
      try {
        n = await yl().mutate(o => ({
          ...o,
          mcpOAuth: {
            ...o.mcpOAuth,
            [t]: {
              ...o.mcpOAuth?.[t],
              serverName: this.serverName,
              serverUrl: this.serverConfig.url,
              accessToken: e.access_token,
              refreshToken: e.refresh_token ?? o.mcpOAuth?.[t]?.refreshToken,
              expiresAt: e.expires_in != null ? Date.now() + e.expires_in * 1000 : undefined,
              scope: e.scope
            }
          }
        }));
      } catch (o) {
        r = o;
      }
      if (n?.success) {
        this._lastServedAccessToken = e.access_token;
        this._lastServedRefreshToken = e.refresh_token ?? this._lastServedRefreshToken;
      }
      this.logTokenPersistFailed(n, r);
    }
    logTokenPersistFailed(e, t) {
      HHa(this.serverName, this.serverConfig, e, t);
    }
    async xaaRefresh() {
      let e = Pce();
      if (!e) {
        return;
      }
      let t = await T4e(e.issuer);
      if (!t) {
        dn(this.serverName, "XAA: id_token not cached, needs interactive re-auth");
        return;
      }
      let n = this.serverConfig.oauth?.clientId;
      let r = await jWn(this.serverName, this.serverConfig);
      if (!n || !r?.clientSecret) {
        dn(this.serverName, "XAA: missing clientId or clientSecret in config \u2014 skipping silent refresh");
        return;
      }
      let o = await pat(e.issuer);
      let s;
      try {
        s = await BIn(e.issuer);
      } catch (i) {
        dn(this.serverName, `XAA: OIDC discovery failed in silent refresh: ${he(i)}`);
        return;
      }
      try {
        let i = await OSo(this.serverConfig.url, {
          clientId: n,
          clientSecret: r.clientSecret,
          idpClientId: e.clientId,
          idpClientSecret: o,
          idpIdToken: t,
          idpTokenEndpoint: s.token_endpoint
        }, this.serverName);
        let a = MC(this.serverName, this.serverConfig);
        let l;
        let c;
        try {
          l = await yl().mutate(u => {
            let d = u.mcpOAuth?.[a];
            return {
              ...u,
              mcpOAuth: {
                ...u.mcpOAuth,
                [a]: {
                  ...d,
                  serverName: this.serverName,
                  serverUrl: this.serverConfig.url,
                  accessToken: i.access_token,
                  refreshToken: i.refresh_token ?? d?.refreshToken,
                  expiresAt: i.expires_in != null ? Date.now() + i.expires_in * 1000 : undefined,
                  scope: i.scope,
                  clientId: n,
                  clientSecret: r.clientSecret,
                  discoveryState: {
                    authorizationServerUrl: i.authorizationServerUrl
                  }
                }
              }
            };
          });
        } catch (u) {
          c = u;
        }
        this.logTokenPersistFailed(l, c);
        return {
          access_token: i.access_token,
          token_type: "Bearer",
          expires_in: i.expires_in,
          scope: i.scope,
          refresh_token: i.refresh_token
        };
      } catch (i) {
        if (i instanceof gEe && i.shouldClearIdToken) {
          await TIe(e.issuer);
          dn(this.serverName, "XAA: cleared id_token after exchange failure");
        }
        throw i;
      }
    }
    async redirectToAuthorization(e) {
      let t = this._pendingStepUpScope ? undefined : this.serverConfig.oauth?.scopes || (this.serverConfig.oauth?.authServerMetadataUrl ? this.getCuratedMetadataScope() : undefined);
      let n = e.searchParams.get("scope");
      let r = t ?? n;
      if (r !== n) {
        dn(this.serverName, `Overrode authorization scope from ${n || "NONE"} to configured: ${r}`);
      }
      let o = r === null ? null : CHp(r, this._metadata);
      if (o !== null && o !== n) {
        if (e.searchParams.set("scope", o), o !== t) {
          dn(this.serverName, "Appended offline_access to authorization scope");
        }
      }
      let s = kHp(e);
      let i = e.searchParams.getAll("prompt");
      let a = s ? i.filter(m => m !== "consent") : i;
      if (a.length !== i.length || a.length > 1) {
        if (e.searchParams.delete("prompt"), a.length > 0) {
          e.searchParams.set("prompt", a.includes("consent") ? "consent" : a.at(-1));
        }
      }
      this._authorizationUrl = e.toString();
      let l = e.searchParams.get("scope");
      if (dn(this.serverName, `Authorization URL: ${MHa(e.toString())}`), dn(this.serverName, `Scopes in URL: ${l || "NOT FOUND"}`), l) {
        this._scopes = l;
        dn(this.serverName, `Captured scopes from authorization URL: ${l}`);
      } else {
        let m = this.getCuratedMetadataScope();
        if (m) {
          this._scopes = m;
          dn(this.serverName, `Using scopes from metadata: ${m}`);
        } else {
          dn(this.serverName, "No scopes available from URL or metadata");
        }
      }
      if (this._scopes && !this.handleRedirection && this._pendingStepUpScope) {
        let m = MC(this.serverName, this.serverConfig);
        let f = this._scopes;
        let h = false;
        try {
          await yl().mutate(g => {
            let y = g.mcpOAuth?.[m];
            if (!y) {
              return g;
            }
            h = true;
            return {
              ...g,
              mcpOAuth: {
                ...g.mcpOAuth,
                [m]: {
                  ...y,
                  stepUpScope: f
                }
              }
            };
          });
        } catch (g) {
          dn(this.serverName, `step-up scope persist failed: ${he(g)}`);
        }
        if (h) {
          dn(this.serverName, `Persisted step-up scope: ${f}`);
        }
      }
      if (!this.handleRedirection) {
        dn(this.serverName, "Redirection handling is disabled, skipping redirect");
        return;
      }
      let c = e.toString();
      if (!c.startsWith("http://") && !c.startsWith("https://")) {
        throw Error("Invalid authorization URL: must use http:// or https:// scheme");
      }
      dn(this.serverName, "Redirecting to authorization URL");
      let u = MHa(c);
      if (dn(this.serverName, `Authorization URL: ${u}`), this.onAuthorizationUrlCallback) {
        this.onAuthorizationUrlCallback(c);
      }
      if (this.skipBrowserOpen) {
        dn(this.serverName, `Skipping browser open (skipBrowserOpen=true). URL: ${u}`);
        return;
      }
      let d = ZOi();
      if (d) {
        dn(this.serverName, `Skipping browser open (headless environment). URL: ${u}`);
      } else {
        dn(this.serverName, `Opening authorization URL: ${u}`);
      }
      let p = d ? false : await Ac(c);
      if (logEvent("tengu_mcp_oauth_browser_open", {
        success: p,
        headless: d,
        platform: Wt()
      }), !d && !p) {
        dn(this.serverName, "Browser didn't open automatically. URL is shown in UI.");
      }
    }
    async saveCodeVerifier(e) {
      dn(this.serverName, "Saving code verifier");
      this._codeVerifier = e;
    }
    async codeVerifier() {
      if (!this._codeVerifier) {
        throw dn(this.serverName, "No code verifier saved"), Error("No code verifier saved");
      }
      dn(this.serverName, "Returning code verifier");
      return this._codeVerifier;
    }
    async invalidateCredentials(e) {
      if (e === "verifier") {
        this._codeVerifier = undefined;
        dn(this.serverName, "Invalidated credentials (scope: verifier)");
        return;
      }
      let t = e;
      let n = MC(this.serverName, this.serverConfig);
      let r = false;
      try {
        let o = this._lastServedClientId;
        let s = this._lastServedAccessToken;
        let i = this._lastServedRefreshToken;
        await yl().mutate(a => {
          let l = a.mcpOAuth?.[n];
          if (!l) {
            return a;
          }
          let c = {
            ...a.mcpOAuth
          };
          switch (t) {
            case "all":
              {
                let u = s != null && !!l.accessToken && l.accessToken !== s;
                let d = o != null && l.clientId != null && l.clientId !== o;
                if (u || d) {
                  dn(this.serverName, `invalidateCredentials('all') preserved: ${u ? "foreign token" : "concurrent re-registration"}`);
                  return a;
                }
                if (!l.clientId && !l.refreshToken && l.accessToken === "") {
                  return a;
                }
                c[n] = {
                  serverName: l.serverName,
                  serverUrl: l.serverUrl,
                  accessToken: "",
                  ...(l.discoveryState && {
                    discoveryState: l.discoveryState
                  }),
                  ...(l.stepUpScope && {
                    stepUpScope: l.stepUpScope
                  })
                };
                break;
              }
            case "client":
              c[n] = {
                ...l,
                clientId: undefined,
                clientSecret: undefined
              };
              break;
            case "tokens":
              {
                if (i != null && l.refreshToken && l.refreshToken !== i || s != null && !!l.accessToken && l.accessToken !== s) {
                  dn(this.serverName, "invalidateCredentials('tokens') preserved: concurrent rotation");
                  return a;
                }
                c[n] = {
                  ...l,
                  accessToken: "",
                  refreshToken: undefined,
                  expiresAt: 0
                };
                break;
              }
            case "discovery":
              c[n] = {
                ...l,
                discoveryState: undefined,
                stepUpScope: undefined
              };
              break;
          }
          r = true;
          return {
            ...a,
            mcpOAuth: c
          };
        });
      } catch (o) {
        dn(this.serverName, `invalidateCredentials persist failed: ${he(o)}`);
      }
      if (r) {
        dn(this.serverName, `Invalidated credentials (scope: ${e})`);
      }
    }
    async saveDiscoveryState(e) {
      let t = MC(this.serverName, this.serverConfig);
      dn(this.serverName, `Saving discovery state (authServer: ${e.authorizationServerUrl})`);
      try {
        await yl().mutate(n => ({
          ...n,
          mcpOAuth: {
            ...n.mcpOAuth,
            [t]: {
              ...n.mcpOAuth?.[t],
              serverName: this.serverName,
              serverUrl: this.serverConfig.url,
              accessToken: n.mcpOAuth?.[t]?.accessToken || "",
              expiresAt: n.mcpOAuth?.[t]?.expiresAt,
              discoveryState: {
                authorizationServerUrl: e.authorizationServerUrl,
                resourceMetadataUrl: e.resourceMetadataUrl,
                oauthMetadataFound: !!e.authorizationServerMetadata
              }
            }
          }
        }));
      } catch (n) {
        dn(this.serverName, `saveDiscoveryState persist failed: ${he(n)}`);
      }
    }
    async discoveryState() {
      let e = this.serverConfig.oauth?.authServerMetadataUrl;
      if (e) {
        dn(this.serverName, `Fetching metadata from configured URL: ${e}`);
        try {
          let s = await UWn(this.serverName, this.serverConfig.url, e);
          if (s) {
            return {
              authorizationServerUrl: s.issuer,
              authorizationServerMetadata: s
            };
          }
        } catch (s) {
          dn(this.serverName, `Failed to fetch from configured metadata URL: ${he(s)}`);
        }
        return;
      }
      let n = await yl().readAsync();
      let r = MC(this.serverName, this.serverConfig);
      let o = n?.mcpOAuth?.[r]?.discoveryState;
      if (o?.authorizationServerUrl) {
        dn(this.serverName, `Returning cached discovery state (authServer: ${o.authorizationServerUrl})`);
        return {
          authorizationServerUrl: o.authorizationServerUrl,
          resourceMetadataUrl: o.resourceMetadataUrl,
          resourceMetadata: o.resourceMetadata,
          authorizationServerMetadata: o.authorizationServerMetadata
        };
      }
      return;
    }
    async refreshAuthorization(e) {
      let t = MC(this.serverName, this.serverConfig);
      let n = LY();
      await Ys().mkdir(n);
      let r = t.replace(/[^a-zA-Z0-9]/g, "_");
      let o = BHa.join(n, `mcp-refresh-${r}.lock`);
      let s;
      for (let i = 0; i < 5; i++) {
        try {
          dn(this.serverName, `Acquiring refresh lock (attempt ${i + 1})`);
          s = await Ry(o, {
            realpath: false,
            onCompromised: () => {
              dn(this.serverName, "Refresh lock was compromised");
            }
          });
          dn(this.serverName, "Acquired refresh lock");
          break;
        } catch (a) {
          let l = en(a);
          if (l === "ELOCKED") {
            dn(this.serverName, `Refresh lock held by another process, waiting (attempt ${i + 1}/${5})`);
            await sleep(1000 + Math.random() * 1000);
            continue;
          }
          dn(this.serverName, `Failed to acquire refresh lock: ${l}; skipping refresh`);
          return;
        }
      }
      if (!s) {
        dn(this.serverName, `Could not acquire refresh lock after ${5} retries; skipping refresh`);
        return;
      }
      try {
        m_e();
        let l = (await yl().readAsync())?.mcpOAuth?.[t];
        if (l) {
          let c = l.expiresAt != null ? (l.expiresAt - Date.now()) / 1000 : undefined;
          if (l.accessToken && (c == null || c > 300)) {
            dn(this.serverName, c != null ? `Another process already refreshed tokens (expires in ${Math.floor(c)}s)` : "Another process already refreshed tokens (no expiration)");
            return {
              access_token: l.accessToken,
              refresh_token: l.refreshToken,
              expires_in: c,
              scope: l.scope,
              token_type: "Bearer"
            };
          }
          if (l.refreshToken) {
            e = l.refreshToken;
            this._lastServedRefreshToken = l.refreshToken;
          }
        }
        return await this._doRefresh(e);
      } finally {
        if (s) {
          try {
            await s();
            dn(this.serverName, "Released refresh lock");
          } catch {
            dn(this.serverName, "Failed to release refresh lock");
          }
        }
      }
    }
    async readConcurrentRefreshWinner() {
      m_e();
      let t = (await yl().readAsync())?.mcpOAuth?.[MC(this.serverName, this.serverConfig)];
      let n = t?.expiresAt != null ? (t.expiresAt - Date.now()) / 1000 : undefined;
      if (t?.accessToken && (n == null || n > 300)) {
        dn(this.serverName, "Another process landed fresh tokens; using those");
        let r = {
          access_token: t.accessToken,
          refresh_token: t.refreshToken,
          expires_in: n,
          scope: t.scope,
          token_type: "Bearer"
        };
        return {
          tokenData: t,
          freshTokens: r
        };
      }
      return {
        tokenData: t,
        freshTokens: undefined
      };
    }
    async _doRefresh(e) {
      let n = u9(this.serverConfig);
      let r = (o, s) => {
        logEvent(o === "success" ? "tengu_mcp_oauth_refresh_success" : "tengu_mcp_oauth_refresh_failure", {
          transportType: this.serverConfig.type,
          ...(n && {
            mcpServerBaseUrl: n
          }),
          ...(s && {
            reason: s
          })
        });
      };
      for (let o = 1; o <= 3; o++) {
        let s;
        try {
          dn(this.serverName, "Starting token refresh");
          let i = FWn();
          let a = this._metadata;
          if (!a) {
            let c = await this.discoveryState();
            if (c?.authorizationServerMetadata) {
              a = c.authorizationServerMetadata;
            } else if (c?.authorizationServerUrl) {
              dn(this.serverName, `Re-discovering metadata from persisted auth server URL: ${c.authorizationServerUrl}`);
              a = await S4e(c.authorizationServerUrl, {
                fetchFn: i
              });
            }
          }
          if (!a) {
            a = await UWn(this.serverName, this.serverConfig.url, this.serverConfig.oauth?.authServerMetadataUrl, i);
          }
          if (!a) {
            dn(this.serverName, "Failed to discover OAuth metadata");
            r("failure", "metadata_discovery_failed");
            Ae("mcp_oauth_refresh", "mcp_oauth_refresh_metadata_failed");
            return;
          }
          if (this._metadata = a, s = await this.clientInformation(), !s) {
            dn(this.serverName, "No client information available");
            r("failure", "no_client_info");
            Ae("mcp_oauth_refresh", "mcp_oauth_refresh_no_client_info");
            return;
          }
          let l = await hYr(new URL(this.serverConfig.url), {
            metadata: a,
            clientInformation: s,
            refreshToken: e,
            resource: new URL(this.serverConfig.url),
            fetchFn: i
          });
          if (l) {
            dn(this.serverName, "Token refresh successful");
            await this.saveTokens(l);
            r("success");
            Pe("mcp_oauth_refresh");
            return l;
          }
          dn(this.serverName, "Token refresh returned no tokens");
          r("failure", "no_tokens_returned");
          Ae("mcp_oauth_refresh", "mcp_oauth_refresh_no_tokens");
          return;
        } catch (i) {
          if (i instanceof bIe) {
            dn(this.serverName, `Token refresh failed with invalid_grant: ${i.message}`);
            let {
              freshTokens: d
            } = await this.readConcurrentRefreshWinner();
            if (d) {
              Et("mcp_oauth_refresh", "mcp_oauth_refresh_concurrent_winner");
              return d;
            }
            dn(this.serverName, "No valid tokens in storage, clearing stored tokens");
            r("failure", "invalid_grant");
            Ae("mcp_oauth_refresh", "mcp_oauth_refresh_invalid_grant");
            await this.invalidateCredentials("tokens");
            f9t.emit(this.serverName);
            return;
          }
          if (i instanceof cw && (i.errorCode === "invalid_client" || i.errorCode === "unauthorized_client")) {
            dn(this.serverName, "Token refresh failed: DCR client expired or invalid; clearing stored client registration");
            let {
              tokenData: d,
              freshTokens: p
            } = await this.readConcurrentRefreshWinner();
            if (p) {
              Et("mcp_oauth_refresh", "mcp_oauth_refresh_concurrent_winner");
              return p;
            }
            if (d?.clientId && s && d.clientId !== s.client_id) {
              dn(this.serverName, "Another process re-registered client; preserving");
              r("failure", "concurrent_reregister");
              Et("mcp_oauth_refresh", "mcp_oauth_refresh_concurrent_reregister");
              return;
            }
            r("failure", i.errorCode === "unauthorized_client" ? "unauthorized_client" : "invalid_client");
            Ae("mcp_oauth_refresh", i.errorCode === "unauthorized_client" ? "mcp_oauth_refresh_unauthorized_client" : "mcp_oauth_refresh_invalid_client");
            await this.invalidateCredentials("all");
            f9t.emit(this.serverName);
            return;
          }
          let a = i instanceof Error && /timeout|timed out|etimedout|econnreset/i.test(i.message);
          let l = i instanceof Ace || i instanceof lat || i instanceof cat;
          let c = a || l;
          if (!c || o >= 3) {
            dn(this.serverName, `Token refresh failed: ${he(i)}`);
            r("failure", c ? "transient_retries_exhausted" : "request_failed");
            Ae("mcp_oauth_refresh", "mcp_oauth_refresh_request_failed");
            return;
          }
          let u = 1000 * Math.pow(2, o - 1);
          dn(this.serverName, `Token refresh failed, retrying in ${u}ms (attempt ${o}/3)`);
          await sleep(u);
        }
      }
      return;
    }
  }
  async function a5t() {
    let e = process.env.MCP_CLIENT_SECRET;
    if (e) {
      return e;
    }
    if (!process.stdin.isTTY) {
      throw Error("No TTY available to prompt for client secret. Set MCP_CLIENT_SECRET env var instead.");
    }
    return new Promise((t, n) => {
      process.stderr.write("Enter OAuth client secret: ");
      process.stdin.setRawMode?.(true);
      let r = "";
      let o = s => {
        let i = s.toString();
        if (i === `
` || i === "\r") {
          process.stdin.setRawMode?.(false);
          process.stdin.removeListener("data", o);
          process.stderr.write(`
`);
          t(r);
        } else if (i === "\x03") {
          process.stdin.setRawMode?.(false);
          process.stdin.removeListener("data", o);
          n(Error("Cancelled"));
        } else if (i === "\x7F" || i === "\b") {
          r = r.slice(0, -1);
        } else {
          r += i;
        }
      };
      process.stdin.on("data", o);
    });
  }
  async function l5t(e, t, n) {
    let r = MC(e, t);
    try {
      return await yl().mutate(o => ({
        ...o,
        mcpOAuthClientConfig: {
          ...o.mcpOAuthClientConfig,
          [r]: {
            clientSecret: n
          }
        }
      }));
    } catch (o) {
      return {
        success: false,
        warning: he(o)
      };
    }
  }
  async function jHa(e, t) {
    let n = MC(e, t);
    await yl().mutate(r => {
      if (!r.mcpOAuthClientConfig?.[n]) {
        return r;
      }
      let o = {
        ...r.mcpOAuthClientConfig
      };
      delete o[n];
      return {
        ...r,
        mcpOAuthClientConfig: o
      };
    });
  }
  async function jWn(e, t) {
    let r = await yl().readAsync();
    let o = MC(e, t);
    return r?.mcpOAuthClientConfig?.[o];
  }
  function qHa(e) {
    if (!e) {
      return;
    }
    if ("scope" in e && typeof e.scope === "string") {
      return e.scope;
    }
    if ("default_scope" in e && typeof e.default_scope === "string") {
      return e.default_scope;
    }
    return;
  }
  function CHp(e, t) {
    if (e !== null && e.split(" ").includes("offline_access")) {
      return e;
    }
    if (!t?.scopes_supported?.includes("offline_access")) {
      return e;
    }
    return e === null ? "offline_access" : `${e} offline_access`;
  }
  function kHp(e) {
    try {
      let t = (typeof e === "string" ? new URL(e) : e).hostname;
      return RHp.includes(t) || xHp.some(n => t.endsWith(n));
    } catch {
      return false;
    }
  }
  var BWn;
  var UHa;
  var BHa;
  var $Ha;
  var bHp;
  var EHp;
  var vHp;
  var p3;
  var MWn;
  var NWn;
  var LWn;
  var RHp;
  var xHp;
  var Moe = __lazy(() => {
    SIe();
    iYr();
    m2t();
    Dp();
    Uc();
    _b();
    ky();
    dt();
    Rn();
    Cs();
    Fh();
    DW();
    o8();
    ln();
    Ot();
    vTe();
    m_o();
    Oce();
    bYr();
    EYr();
    G1();
    DHa();
    E4e();
    BWn = require("crypto");
    UHa = require("http");
    BHa = require("path");
    $Ha = require("url");
    bHp = new Set([...Ode, ...Pde, "ETIMEDOUT"]);
    EHp = ["state", "nonce", "code_challenge", "code_verifier", "code"];
    vHp = new Set(["invalid_refresh_token", "expired_refresh_token", "token_expired"]);
    p3 = class p3 extends Error {
      constructor() {
        super("Authentication was cancelled");
        this.name = "AuthenticationCancelledError";
      }
    };
    MWn = new Map();
    NWn = new Map();
    LWn = new Map();
    RHp = ["login.microsoftonline.com", "login.microsoftonline.us", "login.partner.microsoftonline.cn", "login.chinacloudapi.cn"];
    xHp = [".b2clogin.com", ".ciamlogin.com"];
  });
  function GHa(e) {
    return e.toLowerCase().replace(/\.$/, "");
  }
  function AHp() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_local_oauth_blocked_hosts", {
      hosts: WHa
    });
    let t = WHa;
    if (e !== null && typeof e === "object" && "hosts" in e && Array.isArray(e.hosts)) {
      let n = e.hosts.filter(r => typeof r === "string");
      if (n.length > 0) {
        t = n;
      }
    }
    return new Set(t.map(GHa));
  }
  function VHa(e) {
    if (!e) {
      return false;
    }
    try {
      let t = GHa(new URL(e).hostname);
      return AHp().vZc(t);
    } catch {
      return false;
    }
  }
  function zHa(e, t = {}) {
    let n = `"${e}" is Anthropic-hosted and doesn't support local OAuth. ` + "Connect it via Settings \u2192 Connectors on claude.ai (requires " + "`claude login`), then it'll be available here automatically.";
    let o = t.scope === "local" || t.scope === "project" || t.scope === "user" ? Py("mcp remove", e) : null;
    return o ? `${n} Remove the stale entry with: \`${o}\`` : n;
  }
  var WHa;
  var KHa = __lazy(() => {
    $n();
    WHa = ["microsoft365.mcp.claude.com", "gmail.mcp.claude.com", "gcal.mcp.claude.com"];
  });
  function ZV(e, t) {
    if (t.type === "claudeai-proxy") {
      return {
        kind: "claudeai-proxy",
        config: t
      };
    }
    if (t.type !== "sse" && t.type !== "http") {
      return {
        kind: "unsupported-transport",
        transport: t.type ?? "stdio"
      };
    }
    if (VHa(t.url)) {
      return {
        kind: "anthropic-hosted",
        config: t,
        message: zHa(e, {
          scope: t.scope
        })
      };
    }
    return {
      kind: "oauth",
      config: t
    };
  }
  var D6e = __lazy(() => {
    KHa();
  });
  function OHp() {
    return Me.isSSH() || st(process.env.CLAUDE_CODE_REMOTE) || getIsRemoteMode();
  }
  function DHp(e) {
    if ("url" in e) {
      return e.url;
    }
    return;
  }
  function MHp(e) {
    try {
      let t = new URL(e).searchParams.get("redirect_uri");
      if (t) {
        return t;
      }
    } catch {}
    return "http://localhost:<port>/callback";
  }
  function qWn(e, t) {
    if (getIsNonInteractiveSession()) {
      return [];
    }
    return [NHp(e, t), LHp(e)];
  }
  function NHp(e, t) {
    let n = DHp(t);
    let r = t.type ?? "stdio";
    let o = n ? `${r} at ${n}` : r;
    let s = `The \`${e}\` MCP server (${o}) is installed but requires authentication. ` + "Call this tool to start the OAuth flow \u2014 you'll receive an authorization URL to share with the user. " + "Once the user completes authorization in their browser, the server's real tools will become available automatically.";
    return {
      name: W6(e, "authenticate"),
      isMcp: true,
      mcpInfo: {
        serverName: e,
        toolName: "authenticate"
      },
      isEnabled: () => true,
      isConcurrencySafe: () => false,
      isReadOnly: () => false,
      toAutoClassifierInput: () => e,
      userFacingName: () => `${e} - authenticate (MCP)`,
      maxResultSizeChars: 1e4,
      renderToolUseMessage: () => `Authenticate ${e} MCP server`,
      async description() {
        return s;
      },
      async prompt() {
        return s;
      },
      get inputSchema() {
        return IHp();
      },
      async checkPermissions(i) {
        return {
          behavior: "allow",
          updatedInput: i
        };
      },
      async call(i, a) {
        let l = ZV(e, t);
        if (l.kind === "claudeai-proxy") {
          return {
            data: {
              status: "unsupported",
              message: `This is a claude.ai MCP connector. Ask the user to run /mcp and select "${e}" to authenticate.`
            }
          };
        }
        if (l.kind === "unsupported-transport") {
          return {
            data: {
              status: "unsupported",
              message: `Server "${e}" uses ${r} transport which does not support OAuth from this tool. Ask the user to run /mcp and authenticate manually.`
            }
          };
        }
        if (l.kind === "anthropic-hosted") {
          return {
            data: {
              status: "unsupported",
              message: l.message
            }
          };
        }
        let c;
        let u = new Promise(m => {
          c = m;
        });
        let {
          setAppState: d
        } = a;
        let p = dQ(e, l.config, m => c?.(m), undefined, {
          skipBrowserOpen: true
        });
        Xft(e, p);
        p.then(async () => {
          WWn();
          let m = await pQ(e, t);
          let f = uW(e);
          d(h => ({
            ...h,
            mcp: {
              ...h.mcp,
              clients: h.mcp.clients.map(g => g.name === e ? m.client : g),
              tools: [...Y1p(h.mcp.tools, g => g.name?.startsWith(f)), ...m.tools],
              commands: [...Y1p(h.mcp.commands, g => g.name?.startsWith(f)), ...m.commands],
              resources: m.resources ? {
                ...h.mcp.resources,
                [e]: m.resources
              } : h.mcp.resources
            }
          }));
          dn(e, `OAuth complete, reconnected with ${m.tools.length} tool(s)`);
        }).catch(m => {
          uu(e, `OAuth flow failed after tool-triggered start: ${he(m)}`);
        });
        try {
          let m = await Promise.race([u, p.then(() => null)]);
          if (m) {
            let f = W6(e, "complete_authentication");
            let h = MHp(m);
            let g = OHp() ? `

This session is remote, so after authorizing the browser will try to load \`${h}?code=...\` and show a connection error \u2014 that's expected. Ask the user to copy the full URL from the browser's address bar and paste it into chat, then call \`${f}\` with that URL as \`callback_url\`.` : `

If the browser shows a connection error on the redirect page, ask the user to paste the full URL from the address bar and call \`${f}\` with it.`;
            return {
              data: {
                status: "auth_url",
                authUrl: m,
                message: `Ask the user to open this URL in their browser to authorize the ${e} MCP server:

${m}

Once they complete the flow, the server's tools will become available automatically.${g}`
              }
            };
          }
          return {
            data: {
              status: "auth_url",
              message: `Authentication completed silently for ${e}. The server's tools should now be available.`
            }
          };
        } catch (m) {
          return {
            data: {
              status: "error",
              message: `Failed to start OAuth flow for ${e}: ${he(m)}. Ask the user to run /mcp and authenticate manually.`
            }
          };
        }
      },
      mapToolResultToToolResultBlockParam(i, a) {
        return {
          tool_use_id: a,
          type: "tool_result",
          content: i.message
        };
      }
    };
  }
  function LHp(e) {
    let t = W6(e, "authenticate");
    let n = `Complete an in-progress OAuth flow for the \`${e}\` MCP server by submitting the callback URL. Call \`${t}\` first to start the flow and get the authorization URL. ` + "After the user authorizes in their browser, the browser is redirected to a `http://localhost:<port>/callback?code=...&state=...` URL \u2014 " + "on remote sessions that page fails to load, but the URL in the address bar is still valid. Pass that full URL here as `callback_url`.";
    return {
      name: W6(e, "complete_authentication"),
      isMcp: true,
      mcpInfo: {
        serverName: e,
        toolName: "complete_authentication"
      },
      isEnabled: () => true,
      isConcurrencySafe: () => false,
      isReadOnly: () => false,
      toAutoClassifierInput: () => e,
      userFacingName: () => `${e} - complete authentication (MCP)`,
      maxResultSizeChars: 1e4,
      renderToolUseMessage: () => `Complete authentication for ${e} MCP server`,
      async description() {
        return n;
      },
      async prompt() {
        return n;
      },
      get inputSchema() {
        return PHp();
      },
      async checkPermissions(r) {
        return {
          behavior: "allow",
          updatedInput: r
        };
      },
      async call(r) {
        let {
          callback_url: o
        } = r;
        let s = Jft(e);
        if (!s) {
          return {
            data: {
              status: "error",
              message: `No OAuth flow is in progress for ${e}. Call \`${t}\` first, then retry with the callback URL.`
            }
          };
        }
        let i = false;
        try {
          let l = new URL(o);
          i = l.searchParams.vZc("code") || l.searchParams.vZc("error");
        } catch {}
        if (!i) {
          return {
            data: {
              status: "error",
              message: "Invalid callback URL: missing authorization code. Ask the user to paste the full redirect URL from their browser's address bar, including the `?code=...&state=...` query string."
            }
          };
        }
        let a = Qft(e);
        s(o);
        try {
          await a;
          return {
            data: {
              status: "success",
              message: `Authentication complete for ${e}. The server's tools should now be available.`
            }
          };
        } catch (l) {
          if (l instanceof p3) {
            return {
              data: {
                status: "error",
                message: `The OAuth flow for ${e} was cancelled (a newer attempt may have superseded it). Call \`${t}\` again to restart.`
              }
            };
          }
          return {
            data: {
              status: "error",
              message: `Authentication failed for ${e}: ${he(l)}`
            }
          };
        }
      },
      mapToolResultToToolResultBlockParam(r, o) {
        return {
          tool_use_id: o,
          type: "tool_result",
          content: r.message
        };
      }
    };
  }
  var IHp;
  var PHp;
  var YHa = __lazy(() => {
    at();
    Moe();
    D6e();
    eA();
    EI();
    pr();
    gn();
    dt();
    Rn();
    IHp = we(() => v.object({}));
    PHp = we(() => v.object({
      callback_url: v.string().describe("The full callback URL from the browser address bar after authorizing, e.g. http://localhost:<port>/callback?code=...&state=...")
    }));
  });
  function nA() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_skills", false);
  }
  function JHa(e) {
    return e?.extensions?.[LSo] !== undefined;
  }
  var Noe = __lazy(() => {
    $n();
  });
  function ez() {
    let e = Me.MCP_TIMEOUT;
    return e && e > 0 ? e : 30000;
  }
  function XHa() {
    let e = Me.MCP_CONNECT_TIMEOUT_MS;
    return e && e > 0 ? e : 5000;
  }
  var Zft = __lazy(() => {
    pr();
  });
  function M6e(e) {
    let t = e?.extensions?.[LSo];
    return t != null && typeof t === "object" && "directoryRead" in t && t.directoryRead === true;
  }
  async function ZHa(e, t) {
    if (!M6e(e.capabilities)) {
      throw Error("readMcpDirectory called on a server without directoryRead capability");
    }
    let n = [];
    let r;
    let o = 0;
    do {
      let s;
      try {
        s = await e.client.request({
          method: "resources/directory/read",
          params: {
            uri: t,
            ...(r && {
              cursor: r
            })
          }
        }, cHe, {
          timeout: ez()
        });
      } catch (i) {
        if (o === 0 || !(i instanceof yi && i.code === Ei.InvalidParams)) {
          throw i;
        }
        dn(e.name, `resources/directory/read ${t}: page ${o + 1} returned InvalidParams on cursor; returning ${n.length} entries from prior pages`);
        return n;
      }
      n.push(...s.resources);
      r = s.nextCursor;
      o++;
    } while (r && o < 20);
    if (r) {
      dn(e.name, `resources/directory/read ${t}: stopped at ${20} pages with more pending`);
    }
    return n;
  }
  var u5t = __lazy(() => {
    Rn();
    Noe();
    Zft();
  });
  function FHp(e) {
    let t = e.replace(/[\p{Cf}\p{Co}\p{Cn}]/gu, "");
    t = t.replace(/[\u200B-\u200F]/g, "").replace(/[\u202A-\u202E]/g, "").replace(/[\u2066-\u2069]/g, "").replace(/[\uFEFF]/g, "").replace(/[\uE000-\uF8FF]/g, "");
    return t;
  }
  function uNe(e) {
    let t = Ups(e);
    for (let n = 0; n < 10; n++) {
      let r = FHp(t);
      if (r === t) {
        return t;
      }
      t = r;
    }
    return t;
  }
  function FSo(e) {
    let t = e;
    let n = "";
    let r = 0;
    let o = 10;
    while (t !== n && r < o) {
      n = t;
      t = t.normalize("NFKC");
      t = uNe(t);
      r++;
    }
    if (r >= o) {
      throw Error(`Unicode sanitization reached maximum iterations (${o}) for input: ${e.slice(0, 100)}`);
    }
    return t;
  }
  function m3(e) {
    if (typeof e === "string") {
      return FSo(e);
    }
    if (Array.isArray(e)) {
      return e.map(m3);
    }
    if (e !== null && typeof e === "object") {
      let t = {};
      for (let [n, r] of Object.entries(e)) {
        t[m3(n)] = m3(r);
      }
      return t;
    }
    return e;
  }
  var dNe = __lazy(() => {
    Zn();
  });
  var eja = `
Reads a specific resource from an MCP server.
- server: The name of the MCP server to read from
- uri: The URI of the resource to read

Usage examples:
- Read a resource from a server: \`readMcpResource({ server: "myserver", uri: "my-resource-uri" })\`
`;
  var tja = `
Reads a specific resource from an MCP server, identified by server name and resource URI.

Parameters:
- server (required): The name of the MCP server from which to read the resource
- uri (required): The URI of the resource to read
`;
  var nja = `
List the direct children of a directory resource on an MCP server.
- server: The name of the MCP server to read from
- uri: The URI of the directory resource

Only usable against a server that has declared support for directory listing. The listing is not recursive.
`;
  var rja;
  var N6e = __lazy(() => {
    u5t();
    rja = `
List the direct children of a directory resource on an MCP server (\`resources/directory/read\`).

Parameters:
- server (required): The name of the MCP server to read from
- uri (required): The URI of the directory resource

The listing is not recursive. Each entry carries its own \`uri\`; subdirectories appear with mimeType "${"inode/directory"}" \u2014 call this tool again on a subdirectory's \`uri\` to descend.

Only usable against a server that has declared support for directory listing; other servers return an error.
`;
  });
  function oja(e) {
    if (!e.uri || !e.server) {
      return null;
    }
    return `List directory resource "${e.uri}" from server "${e.server}"`;
  }
  function sja() {
    return "readMcpResourceDir";
  }
  function ija(e, t, {
    verbose: n
  }) {
    if (e?.error) {
      return d5t.jsx(vU, {
        content: e.error,
        verbose: n
      });
    }
    if (!e || e.resources.length === 0) {
      return d5t.jsx(Vn, {
        height: 1,
        children: d5t.jsx(sc, {
          children: "(Empty directory)"
        })
      });
    }
    let r = De(e, null, 2);
    return d5t.jsx(vU, {
      content: r,
      verbose: n
    });
  }
  var d5t;
  var aja = __lazy(() => {
    xb();
    Wl();
    vMe();
    d5t = __toESM(ie(), 1);
  });
  var UHp;
  var BHp;
  var _Ee;
  var GWn = __lazy(() => {
    eA();
    u5t();
    Noe();
    o4n();
    ci();
    Rn();
    dNe();
    Zn();
    dV();
    mMe();
    N6e();
    aja();
    UHp = we(() => v.object({
      server: v.string().describe("The MCP server name"),
      uri: v.string().describe("The directory resource URI to list")
    }));
    BHp = we(() => v.object({
      resources: v.array(v.object({
        uri: v.string().describe("Child resource URI"),
        name: v.string().describe("Child resource name"),
        mimeType: v.string().optional().describe("Child MIME type")
      })).describe(`Direct children of the directory resource. Subdirectories appear with mimeType "${"inode/directory"}".`),
      error: v.string().optional().describe("Human-readable error when the server could not list the directory")
    }));
    _Ee = Xs({
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return `${e.server} ${e.uri}`;
      },
      shouldDefer: true,
      name: "ReadMcpResourceDirTool",
      aliases: ["ReadMcpResourceDir"],
      searchHint: "list the children of an MCP directory resource",
      maxResultSizeChars: 1e5,
      async description() {
        return nja;
      },
      async prompt() {
        return rja;
      },
      get inputSchema() {
        return UHp();
      },
      get outputSchema() {
        return BHp();
      },
      async call(e, {
        options: {
          mcpClients: t
        }
      }) {
        let {
          server: n,
          uri: r
        } = e;
        let o = r4n(t, n);
        if (!nA()) {
          return {
            data: {
              resources: [],
              error: "Directory listing is not enabled in this build."
            }
          };
        }
        if (!M6e(o.capabilities)) {
          return {
            data: {
              resources: [],
              error: `Server "${o.name}" does not support directory listing.`
            }
          };
        }
        if (o.config.pluginSource) {
          Tq(o.config.pluginSource);
        }
        let s = await iEe(o);
        let i;
        try {
          i = await ZHa(s, r);
        } catch (l) {
          if (l instanceof yi && l.code === Ei.InvalidParams) {
            uu(o.name, `resources/directory/read returned ${l.code} \u2014 not a directory`);
            return {
              data: {
                resources: [],
                error: `Not a directory resource: ${r}. If it is a file resource, use ${"ReadMcpResourceTool"} instead.`
              }
            };
          }
          throw l;
        }
        return {
          data: {
            resources: i.map(l => ({
              uri: uNe(l.uri),
              name: m3(l.name),
              mimeType: l.mimeType !== undefined ? m3(l.mimeType) : undefined
            }))
          }
        };
      },
      renderToolUseMessage: oja,
      userFacingName: sja,
      renderToolResultMessage: ija,
      isResultTruncated(e, {
        columns: t
      }) {
        if (e.error) {
          return EU(e.error, t);
        }
        return EU(De(e, null, 2), t);
      },
      mapToolResultToToolResultBlockParam(e, t) {
        if (e.error) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: e.error
          };
        }
        let n = e.resources.map(o => `${o.name}${o.mimeType === "inode/directory" ? "/" : ""}`).join(`
`);
        let r = e.resources.length > 0 ? `Directory listing (${e.resources.length} ${un(e.resources.length, "entry", "entries")}):
${n}` : "Directory is empty.";
        return {
          tool_use_id: t,
          type: "tool_result",
          content: `${r}

${De(e)}`
        };
      }
    });
  });
  var $So = {};
  __export($So, {
    persistBinaryContent: () => persistBinaryContent,
    isSubagentTruncationPromptEnabled: () => isSubagentTruncationPromptEnabled,
    isBinaryContentType: () => isBinaryContentType,
    getLargeOutputInstructions: () => getLargeOutputInstructions,
    getFormatDescription: () => getFormatDescription,
    getBinaryBlobSavedMessage: () => getBinaryBlobSavedMessage,
    extensionForMimeType: () => extensionForMimeType
  });
  function isSubagentTruncationPromptEnabled() {
    let e = process.env.MCP_TRUNCATION_PROMPT_OVERRIDE;
    return e ? e !== "legacy" : getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_subagent_prompt", false);
  }
  function getFormatDescription(e, t) {
    switch (e) {
      case "toolResult":
        return "Plain text";
      case "structuredContent":
        return t ? `JSON with schema: ${t}` : "JSON";
      case "contentArray":
        return t ? `JSON array with schema: ${t}` : "JSON array";
    }
  }
  function getLargeOutputInstructions(e, t, n, r, o) {
    let i = `Error: result (${o !== undefined ? `${t.toLocaleString()} characters across ${o.count.toLocaleString()} ${o.count === 1 ? "line" : "lines"}` : `${t.toLocaleString()} characters`}) exceeds maximum allowed tokens. Output has been saved to ${e}.
Format: ${n}
`;
    let a = Math.floor(UTe().maxTokens * 4 * 0.8);
    let l = 8;
    let c = o !== undefined && o.count > 1 && o.maxLen <= a;
    let u = c ? Math.max(1, Math.floor(a / (o.maxLen + 8))) : undefined;
    if (!isSubagentTruncationPromptEnabled()) {
      let f = o !== undefined && !c;
      return i + `Use offset and limit parameters to read specific portions of the file, search within it for specific content, and jq to make structured queries.
REQUIREMENTS FOR SUMMARIZATION/ANALYSIS/REVIEW:
` + $Hp(e, r, f);
    }
    let d;
    let p;
    let m;
    if (o === undefined) {
      d = `- For targeted queries (find a value, filter by field): use jq on the file directly.
`;
      p = `first probe the structure (e.g., jq 'type, length, keys?' ${e}), then extract slices with jq or python \u2014 Read's line-based offset/limit will not chunk this file.`;
      m = `${e} is ${n}; probe the structure with jq (type/length/keys), then extract and read the content in full with jq or python, then summarize and quote any key findings verbatim.`;
    } else if (!c) {
      let f = a.toLocaleString();
      d = `- For targeted searches (find a string): use grep on the file directly.
`;
      p = `the file's lines are too long for Read's offset/limit. Slice by character range via Bash instead \u2014 e.g. python3 -c "print(open('${e}').read()[A:B])" in ~${f}-char spans until you have read 100% of it.`;
      m = `Slice ${e} in ~${f}-char spans via python (read()[A:B]) until you have read all ${t.toLocaleString()} characters, then summarize and quote any key findings verbatim.`;
    } else {
      d = `- For targeted searches (find a line, locate a string): use grep on the file directly.
`;
      p = `read ${e} in chunks of ~${u} lines using offset/limit until you have read 100% of it.`;
      m = `Read ${e} in chunks of ~${u} lines using offset/limit until you have read all ${o.count.toLocaleString()} lines, then summarize and quote any key findings verbatim.`;
    }
    return i + d + `- For analysis or summarization that requires reading the full content: ${p}
- If the ${"Agent"} tool is available, do this inside a subagent so the full output stays out of your main context. Give it the instruction above verbatim, and be explicit about what it must return \u2014 e.g. "${m}" A vague "summarize this" may lose detail.
`;
  }
  function $Hp(e, t, n) {
    let r = t ? `- If you receive truncation warnings when reading the file ("[N lines truncated]"), reduce the chunk size until you have read 100% of the content without truncation ***DO NOT PROCEED UNTIL YOU HAVE DONE THIS***. Bash output is limited to ${t.toLocaleString()} chars.
` : `- If you receive truncation warnings when reading the file, reduce the chunk size until you have read 100% of the content without truncation.
`;
    let o = n ? `- Note: this file's lines are too long for Read's offset/limit chunking. If a shell tool is available, slice by character range (e.g. python read()[A:B], dd, or cut -c) instead.
` : "";
    return `- You MUST read the content from the file at ${e} in sequential chunks until 100% of the content has been read.
` + o + r + `- Before producing ANY summary or analysis, you MUST explicitly describe what portion of the content you have read. ***If you did not read the entire content, you MUST explicitly state this.***
- If after a few attempts you cannot read the file (file not found, lines too long for Read's offset/limit, no shell access), STOP retrying. Summarize what you were able to read, explicitly state which portion you could not read and why, and proceed.
`;
  }
  function extensionForMimeType(e) {
    if (!e) {
      return "bin";
    }
    switch (ii(e, ";").trim().toLowerCase()) {
      case "application/pdf":
        return "pdf";
      case "application/json":
        return "json";
      case "text/csv":
        return "csv";
      case "text/plain":
        return "txt";
      case "text/html":
        return "html";
      case "text/markdown":
        return "md";
      case "application/zip":
        return "zip";
      case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
        return "docx";
      case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
        return "xlsx";
      case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
        return "pptx";
      case "application/msword":
        return "doc";
      case "application/vnd.ms-excel":
        return "xls";
      case "audio/mpeg":
        return "mp3";
      case "audio/wav":
        return "wav";
      case "audio/ogg":
        return "ogg";
      case "video/mp4":
        return "mp4";
      case "video/webm":
        return "webm";
      case "image/png":
        return "png";
      case "image/jpeg":
        return "jpg";
      case "image/gif":
        return "gif";
      case "image/webp":
        return "webp";
      case "image/svg+xml":
        return "svg";
      default:
        return "bin";
    }
  }
  function isBinaryContentType(e) {
    if (!e) {
      return false;
    }
    let t = ii(e, ";").trim().toLowerCase();
    if (t.startsWith("text/")) {
      return false;
    }
    if (t.endsWith("+json") || t === "application/json") {
      return false;
    }
    if (t.endsWith("+xml") || t === "application/xml") {
      return false;
    }
    if (t.startsWith("application/javascript")) {
      return false;
    }
    if (t === "application/x-www-form-urlencoded") {
      return false;
    }
    return true;
  }
  async function persistBinaryContent(e, t, n) {
    await YTe();
    let r = extensionForMimeType(t);
    let o = lja.join(Yde(), `${n}.${r}`);
    try {
      await Ys().writeBytes(o, e);
    } catch (s) {
      let i = sr(s);
      logForDebugging(`Failed to persist binary content to ${o}: ${i.message}`, {
        level: "error"
      });
      return {
        error: i.message
      };
    }
    logEvent("tengu_binary_content_persisted", {
      mimeType: t ?? "unknown",
      sizeBytes: e.length,
      ext: r
    });
    return {
      filepath: o,
      size: e.length,
      ext: r
    };
  }
  function getBinaryBlobSavedMessage(e, t, n, r) {
    return `${r}Binary content (${t || "unknown type"}, ${formatFileSize(n)}) saved to ${e}`;
  }
  var lja;
  var eht = __lazy(() => {
    $n();
    Ot();
    _b();
    Sh();
    VDe();
    je();
    dt();
    cs();
    Zn();
    zI();
    lja = require("path");
  });
  function uja(e) {
    if (!e.uri || !e.server) {
      return null;
    }
    return `Read resource "${e.uri}" from server "${e.server}"`;
  }
  function dja() {
    return "readMcpResource";
  }
  function pja(e, t, {
    verbose: n
  }) {
    if (e?.error) {
      return tht.jsx(vU, {
        content: e.error,
        verbose: n
      });
    }
    if (!e || !e.contents || e.contents.length === 0) {
      return tht.jsx(gXd, {
        justifyContent: "space-between",
        overflowX: "hidden",
        width: "100%",
        children: tht.jsx(Vn, {
          height: 1,
          children: tht.jsx(Text, {
            dimColor: true,
            children: "(No content)"
          })
        })
      });
    }
    let r = De(e, null, 2);
    return tht.jsx(vU, {
      content: r,
      verbose: n
    });
  }
  var tht;
  var mja = __lazy(() => {
    Wl();
    vMe();
    et();
    tht = __toESM(ie(), 1);
  });
  var HHp;
  var jHp;
  var qHp;
  var fQ;
  var KWn = __lazy(() => {
    eA();
    u5t();
    o4n();
    ci();
    Rn();
    eht();
    dV();
    mMe();
    N6e();
    mja();
    HHp = we(() => v.object({
      server: v.string().describe("The MCP server name"),
      uri: v.string().describe("The resource URI to read")
    }));
    jHp = new Set([-32002, Ei.InvalidParams]);
    qHp = we(() => v.object({
      contents: v.array(v.object({
        uri: v.string().describe("Resource URI"),
        mimeType: v.string().optional().describe("MIME type of the content"),
        text: v.string().optional().describe("Text content of the resource"),
        blobSavedTo: v.string().optional().describe("Path where binary blob content was saved")
      })),
      error: v.string().optional().describe("Human-readable error when the server could not read the resource")
    }));
    fQ = Xs({
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return `${e.server} ${e.uri}`;
      },
      shouldDefer: true,
      name: "ReadMcpResourceTool",
      aliases: ["ReadMcpResource"],
      searchHint: "read a specific MCP resource by URI",
      maxResultSizeChars: 1e5,
      async description() {
        return eja;
      },
      async prompt() {
        return tja;
      },
      get inputSchema() {
        return HHp();
      },
      get outputSchema() {
        return qHp();
      },
      async call(e, {
        options: {
          mcpClients: t
        }
      }) {
        let {
          server: n,
          uri: r
        } = e;
        let o = r4n(t, n);
        if (o.config.pluginSource) {
          Tq(o.config.pluginSource);
        }
        let s = await iEe(o);
        let i;
        try {
          i = await s.client.request({
            method: "resources/read",
            params: {
              uri: r
            }
          }, Qae);
        } catch (l) {
          if (l instanceof yi) {
            if (l.code === Ei.MethodNotFound) {
              uu(o.name, "resources/read returned -32601 MethodNotFound \u2014 server advertises resources but does not implement reads");
              return {
                data: {
                  contents: [],
                  error: `Server "${o.name}" advertises resource support but does not implement resource reads.`
                }
              };
            }
            if (jHp.vZc(l.code)) {
              uu(o.name, `resources/read returned ${l.code} \u2014 resource not found`);
              n3.cache.delete(o.name);
              ype.cache.delete(o.name);
              let c = M6e(s.capabilities) ? ` If the URI is a directory resource, use ${"ReadMcpResourceDirTool"} instead.` : "";
              return {
                data: {
                  contents: [],
                  error: `Resource not found: ${r} \u2014 it may have been deleted or the URI is stale. Re-run ${"ListMcpResourcesTool"} to refresh.${c}`
                }
              };
            }
          }
          throw l;
        }
        return {
          data: {
            contents: await Promise.all(i.contents.map(async (l, c) => {
              if ("text" in l) {
                return {
                  uri: l.uri,
                  mimeType: l.mimeType,
                  text: l.text
                };
              }
              if (!("blob" in l) || typeof l.blob !== "string") {
                return {
                  uri: l.uri,
                  mimeType: l.mimeType
                };
              }
              let u = `mcp-resource-${Date.now()}-${c}-${Math.random().toString(36).slice(2, 8)}`;
              let d = await persistBinaryContent(Buffer.from(l.blob, "base64"), l.mimeType, u);
              if ("error" in d) {
                return {
                  uri: l.uri,
                  mimeType: l.mimeType,
                  text: `Binary content could not be saved to disk: ${d.error}`
                };
              }
              return {
                uri: l.uri,
                mimeType: l.mimeType,
                blobSavedTo: d.filepath,
                text: getBinaryBlobSavedMessage(d.filepath, l.mimeType, d.size, `[Resource from ${o.name} at ${l.uri}] `)
              };
            }))
          }
        };
      },
      renderToolUseMessage: uja,
      userFacingName: dja,
      renderToolResultMessage: pja,
      isResultTruncated(e, {
        columns: t
      }) {
        if (e.error) {
          return EU(e.error, t);
        }
        return EU(De(e, null, 2), t);
      },
      mapToolResultToToolResultBlockParam(e, t) {
        if (e.error) {
          return {
            tool_use_id: t,
            type: "tool_result",
            content: e.error
          };
        }
        return {
          tool_use_id: t,
          type: "tool_result",
          content: De(e)
        };
      }
    });
  });
  function fja(e) {
    if (!WHp.test(e)) {
      return;
    }
    logEvent("tengu_git_operation", {
      operation: "pr_create"
    });
    getPrCounter()?.add(1);
  }
  var WHp;
  var hja = __lazy(() => {
    at();
    Ot();
    WHp = /^create[_-]?(pull[_-]?request|merge[_-]?request)$|^(pull[_-]?request|merge[_-]?request)[_-]?create$/i;
  });
  function GHp(e, t, n) {
    var r = -1;
    var o = e.length;
    if (t < 0) {
      t = -t > o ? 0 : o + t;
    }
    if (n = n > o ? o : n, n < 0) {
      n += o;
    }
    o = t > n ? 0 : n - t >>> 0;
    t >>>= 0;
    var s = Array(o);
    while (++r < o) {
      s[r] = e[r + t];
    }
    return s;
  }
  function VHp(e, t, n) {
    var r = e.length;
    n = n === undefined ? r : n;
    return !t && n >= r ? e : GHp(e, t, n);
  }
  function tjp(e) {
    return ejp.test(e);
  }
  var XHp;
  var ejp;
  function njp(e) {
    return e.split("");
  }
  function hjp(e) {
    return e.match(fjp) || [];
  }
  var ijp;
  var ljp;
  var qSo;
  var cjp;
  var Tja;
  var wja;
  var Cja;
  var djp;
  var pjp;
  var mjp;
  var fjp;
  function gjp(e) {
    return tjp(e) ? hjp(e) : njp(e);
  }
  function yjp(e) {
    return function (t) {
      t = Cnu(t);
      var n = tjp(t) ? gjp(t) : undefined;
      var r = n ? n[0] : t.charAt(0);
      var o = n ? VHp(n, 1).join("") : t.slice(1);
      return r[e]() + o;
    };
  }
  var _jp;
  function bjp(e) {
    return _jp(Cnu(e).toLowerCase());
  }
  function Tjp(e) {
    let t = f5t.homedir();
    let n = [];
    let r = Mja[e.toLowerCase()];
    if (!r) {
      return n;
    }
    let o = process.env.APPDATA || RU.join(t, "AppData", "Roaming");
    let s = process.env.LOCALAPPDATA || RU.join(t, "AppData", "Local");
    switch (f5t.platform()) {
      case "darwin":
        if (n.push(RU.join(t, "Library", "Application Support", "JetBrains"), RU.join(t, "Library", "Application Support")), e.toLowerCase() === "androidstudio") {
          n.push(RU.join(t, "Library", "Application Support", "Google"));
        }
        break;
      case "win32":
        if (n.push(RU.join(o, "JetBrains"), RU.join(s, "JetBrains"), RU.join(o)), e.toLowerCase() === "androidstudio") {
          n.push(RU.join(s, "Google"));
        }
        break;
      case "linux":
        n.push(RU.join(t, ".config", "JetBrains"), RU.join(t, ".local", "share", "JetBrains"));
        for (let i of r) {
          n.push(RU.join(t, "." + i));
        }
        if (e.toLowerCase() === "androidstudio") {
          n.push(RU.join(t, ".config", "Google"));
        }
        break;
      default:
        break;
    }
    return n;
  }
  async function Ejp(e) {
    let t = [];
    let n = zt();
    let r = Tjp(e);
    let o = Mja[e.toLowerCase()];
    if (!o) {
      return t;
    }
    let s = o.map(i => new RegExp("^" + i));
    for (let i of r) {
      try {
        let a = await n.readdir(i);
        for (let l of s) {
          for (let c of a) {
            if (!l.test(c.name)) {
              continue;
            }
            if (!c.isDirectory() && !c.isSymbolicLink()) {
              continue;
            }
            let u = RU.join(i, c.name);
            if (f5t.platform() === "linux") {
              t.push(u);
              continue;
            }
            let d = RU.join(u, "plugins");
            try {
              await n.stat(d);
              t.push(d);
            } catch {}
          }
        }
      } catch {
        continue;
      }
    }
    return t.filter((i, a) => t.indexOf(i) === a);
  }
  async function vjp(e) {
    let t = await Ejp(e);
    for (let n of t) {
      let r = RU.join(n, "claude-code-jetbrains-plugin");
      try {
        await zt().stat(r);
        return true;
      } catch {}
    }
    return false;
  }
  async function Nja(e, t = false) {
    if (t) {
      VSo.delete(e);
    }
    let n = VSo.get(e);
    if (n) {
      return n;
    }
    let r = vjp(e);
    VSo.set(e, r);
    return r;
  }
  var f5t;
  var RU;
  var Mja;
  var VSo;
  var Lja = __lazy(() => {
    f5t = require("os");
    RU = require("path");
    Mja = {
      pycharm: ["PyCharm"],
      intellij: ["IntelliJIdea", "IdeaIC"],
      webstorm: ["WebStorm"],
      phpstorm: ["PhpStorm"],
      rubymine: ["RubyMine"],
      clion: ["CLion"],
      goland: ["GoLand"],
      rider: ["Rider"],
      datagrip: ["DataGrip"],
      appcode: ["AppCode"],
      dataspell: ["DataSpell"],
      aqua: ["Aqua"],
      gateway: ["Gateway"],
      fleet: ["Fleet"],
      androidstudio: ["AndroidStudio"]
    };
    VSo = new Map();
  });
  function Pw(e) {
    let t = Fja.c(4);
    let {
      children: n,
      color: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = F6e.jsx(gXd, {
        width: 2,
        flexShrink: 0,
        children: F6e.jsx(Text, {
          children: vGd.bullet
        })
      });
      t[0] = o;
    } else {
      o = t[0];
    }
    let s;
    if (t[1] !== n || t[2] !== r) {
      s = F6e.jsxs(gXd, {
        flexDirection: "row",
        children: [o, F6e.jsx(gXd, {
          flexGrow: 1,
          flexShrink: 1,
          children: F6e.jsx(Text, {
            color: r,
            children: n
          })
        })]
      });
      t[1] = n;
      t[2] = r;
      t[3] = s;
    } else {
      s = t[3];
    }
    return s;
  }
  var Fja;
  var F6e;
  var Loe = __lazy(() => {
    et();
    Fja = __toESM(pt(), 1);
    F6e = __toESM(ie(), 1);
  });
  function d9(e) {
    let t = Uja.c(10);
    let {
      added: n,
      removed: r,
      bold: o
    } = e;
    if (n === 0 && r === 0) {
      return null;
    }
    let s;
    if (t[0] !== n || t[1] !== o) {
      s = n > 0 && XWn.jsxs(Text, {
        color: "diffAddedWord",
        bold: o,
        children: ["+", n]
      });
      t[0] = n;
      t[1] = o;
      t[2] = s;
    } else {
      s = t[2];
    }
    let i = n > 0 && r > 0 && " ";
    let a;
    if (t[3] !== o || t[4] !== r) {
      a = r > 0 && XWn.jsxs(Text, {
        color: "diffRemovedWord",
        bold: o,
        children: ["-", r]
      });
      t[3] = o;
      t[4] = r;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l;
    if (t[6] !== s || t[7] !== i || t[8] !== a) {
      l = XWn.jsxs(Text, {
        children: [s, i, a]
      });
      t[6] = s;
      t[7] = i;
      t[8] = a;
      t[9] = l;
    } else {
      l = t[9];
    }
    return l;
  }
  var Uja;
  var XWn;
  var pNe = __lazy(() => {
    et();
    Uja = __toESM(pt(), 1);
    XWn = __toESM(ie(), 1);
  });
  var Hja = {};