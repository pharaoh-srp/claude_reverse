  __export(QJc, {
    startGateway: () => startGateway,
    collectBootWarnings: () => collectBootWarnings
  });
  function eae(e, t = 400) {
    return Response.json({
      error: e
    }, {
      status: t,
      headers: xin
    });
  }
  function V6f() {
    if (typeof Bun > "u") {
      throw Error("claude gateway requires the native binary. Install via https://claude.ai/install.sh instead of npm.");
    }
  }
  function JJc(e, t) {
    for (let [n, r] of Object.entries(z6f)) {
      if (!e.headers.vZc(n)) {
        e.headers.set(n, r);
      }
    }
    if (t && !e.headers.vZc("Strict-Transport-Security")) {
      e.headers.set("Strict-Transport-Security", "max-age=31536000; includeSubDomains");
    }
    return e;
  }
  function X6f(e) {
    let t = e.headers.get("x-client-request-id");
    return t && J6f.test(t) ? t : Zhe.randomUUID();
  }
  async function startGateway(e) {
    V6f();
    let t = await tJc(e);
    Qhe("config.load", {
      path: e,
      sha256: Zhe.createHash("sha256").update(JSON.stringify(t)).digest("hex")
    });
    let n = LSr(t.listen.trusted_proxies);
    let r = LSr(t.access_control.allow_cidrs);
    let o = LSr(t.access_control.deny_cidrs);
    let s = await KJc(t.store.postgres_url, {
      auditRetentionDays: t.admin?.audit_retention_days,
      maxConnections: t.store.max_connections,
      username: t.store.username,
      password: t.store.password,
      spendRetentionMonths: t.admin?.spend_retention_months,
      identityRetentionDays: t.admin?.identity_retention_days
    }).catch(L => {
      let P = he(L);
      if (/connect|ECONNREFUSED|ENOTFOUND|ETIMEDOUT/i.test(P)) {
        throw Error(`could not connect to Postgres: ${P}. Check store.postgres_url in ${e}`);
      }
      throw L;
    });
    let i = {
      readKeys: t.admin?.read_keys ?? [],
      writeKeys: t.admin?.write_keys ?? []
    };
    let a = LJc(s.sql, t);
    let l = wYc(t.session.jwt_secret);
    let c = t.listen.public_url;
    let u = t.oidc.groups_claim;
    let d = t.oidc.email_claim;
    let p;
    function m(L) {
      return typeof L === "string" && L.length > 0 ? L : undefined;
    }
    function f(L) {
      let P = DSr(L, u);
      if (typeof P === "string") {
        return [P];
      }
      if (!Array.isArray(P)) {
        return;
      }
      let F = P.filter(H => typeof H === "string");
      return F.length > 0 ? F : undefined;
    }
    async function h(L, P, F, H, U) {
      vu("debug", `oidc id_token claim names request_id=${H}: ${Object.keys(L).sort().join(",")}` + (U ? `; userinfo claim names: ${Object.keys(U).sort().join(",")}` : ""));
      let N = MSr(L, d) ?? (U ? MSr(U, d) : undefined);
      WYc({
        email: N,
        email_verified: L.email_verified ?? U?.email_verified
      }, t.oidc.allowed_email_domains);
      let W = m(L.sub);
      if (W === undefined) {
        throw Error("IdP claims missing required `sub`");
      }
      let j = typeof N === "string" ? N : undefined;
      let z;
      if (p) {
        if (j === undefined) {
          throw Object.assign(Error("oidc.google_groups is configured but the id_token has no email \u2014 check oidc.email_claim and that the email scope is requested"), {
            code: "GOOGLE_GROUPS_UNAVAILABLE"
          });
        }
        z = await p(j);
      } else {
        z = f(L) ?? (U ? f(U) : undefined);
      }
      GYc(z, t.oidc.allowed_groups);
      let V = m(L.name) ?? m(U?.name);
      let K = await AYc({
        sub: W,
        email: j,
        name: V,
        groups: z
      }, l, t.session.ttl_hours, c);
      Qhe(P, {
        request_id: H,
        result: "success",
        sub: W,
        email: j,
        client_ip: F,
        ttl_hours: t.session.ttl_hours
      });
      return K;
    }
    if (t.oidc.google_groups) {
      p = await FYc(t.oidc.google_groups);
    }
    let g = t.listen.Aeu;
    let [y, _, b, S] = await Promise.all([qYc(t.oidc), pJc(t.upstreams), nJc(t), g ? Promise.all([Qss.readFile(g.cert, "utf8"), Qss.readFile(g.key, "utf8")]).then(([L, P]) => ({
      cert: L,
      key: P
    })) : Promise.resolve(undefined)]);
    async function E(L, P) {
      if (!t.oidc.userinfo_fallback || !P) {
        return;
      }
      let F = MSr(L, d) != null;
      let H = DSr(L, u) != null;
      if (F && H) {
        return;
      }
      let U = await y.userinfo(P);
      if (typeof U.sub !== "string" || U.sub !== L.sub) {
        throw Error("userinfo sub missing or does not match id_token sub");
      }
      return U;
    }
    if (t.oidc.scopes && !t.oidc.scopes.includes("offline_access") && Array.isArray(y.issuer.metadata.scopes_supported) && y.issuer.metadata.scopes_supported.includes("offline_access")) {
      vu("warn", "oidc.scopes omits offline_access but the IdP advertises it \u2014 refresh tokens " + `will not be issued; developers re-run the browser login every ${t.session.ttl_hours}h (session.ttl_hours)`);
    }
    if ((y.issuer.metadata.issuer ?? "").startsWith("https://accounts.google.com") && (t.oidc.extra_auth_params.access_type !== "offline" || !(t.oidc.extra_auth_params.prompt ?? "").split(" ").includes("consent"))) {
      vu("warn", "oidc.issuer is accounts.google.com \u2014 Google ignores offline_access and needs " + `extra_auth_params: { access_type: offline, prompt: consent } and scopes: [openid, profile, email] for refresh tokens. Without both params developers re-run the browser login every ${t.session.ttl_hours}h (session.ttl_hours); without prompt: consent specifically, refresh tokens ` + "are issued only on each user\u2019s first login.");
    }
    if ((y.issuer.metadata.issuer ?? "").startsWith("https://accounts.google.com") && (t.oidc.allowed_groups?.length ?? 0) > 0 && !t.oidc.google_groups) {
      vu("warn", "oidc.allowed_groups is set but Google ID tokens do not carry a groups claim \u2014 " + "every login will be denied. Set oidc.google_groups to fetch Workspace groups via the Admin SDK, or use allowed_email_domains instead.");
    }
    if (t.oidc.google_groups && !(y.issuer.metadata.issuer ?? "").startsWith("https://accounts.google.com")) {
      vu("warn", "oidc.google_groups is set but oidc.issuer is not accounts.google.com \u2014 " + "the Directory API only returns groups for Google Workspace users, so every login will be refused");
    }
    let C = Ro([new URL(y.issuer.metadata.authorization_endpoint ?? t.oidc.issuer).origin, ...t.oidc.form_action_origins]).join(" ");
    let x = Boolean(S) || t.listen.public_url !== undefined && new URL(t.listen.public_url).protocol === "https:";
    let A = x ? "__Host-gw_dev" : "gw_dev";
    let k = `HttpOnly; SameSite=Lax; Path=/${x ? "; Secure" : ""}`;
    function I(L) {
      let P = L.headers.get("cookie") ?? "";
      for (let F of P.split(";")) {
        let H = F.indexOf("=");
        if (H > 0 && F.slice(0, H).trim() === A) {
          return F.slice(H + 1).trim();
        }
      }
      return null;
    }
    async function O(L, P, F) {
      let H = (Z, ne) => Qhe(Z, {
        request_id: F,
        ...ne
      });
      let {
        pathname: U
      } = new URL(L.url);
      if (Oss(P, o)) {
        H("access.denied", {
          reason: "ip_denylist",
          client_ip: P
        });
        return new Response("forbidden", {
          status: 403
        });
      }
      if (L.method === "GET" && U === "/healthz") {
        return new Response("ok", {
          status: 200
        });
      }
      if (L.method === "GET" && U === "/readyz") {
        try {
          await s.get("__readyz_probe__");
          return new Response("ready", {
            status: 200
          });
        } catch {
          return new Response("store unavailable", {
            status: 503
          });
        }
      }
      if (r.length > 0 && !Oss(P, r)) {
        H("access.denied", {
          reason: "ip_not_allowlisted",
          client_ip: P
        });
        return new Response("forbidden", {
          status: 403
        });
      }
      let N = t.limits;
      if (N.max_url_length !== undefined && L.url.length > N.max_url_length) {
        return new Response("uri too long", {
          status: 414
        });
      }
      if (N.max_request_header_bytes !== undefined) {
        let Z = 0;
        for (let [ne, oe] of L.headers) {
          Z += ne.length + oe.length + 4;
        }
        if (Z > N.max_request_header_bytes) {
          return new Response("request header fields too large", {
            status: 431
          });
        }
      }
      let W = new URL(L.url);
      let j = W.pathname;
      let z = t.listen.public_url ?? W.origin;
      if (j === "/" && L.method === "GET") {
        return KYc(z, t.oidc.issuer, {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION);
      }
      if (j === "/.well-known/oauth-authorization-server") {
        return Response.json({
          issuer: z,
          device_authorization_endpoint: `${z}/oauth/device_authorization`,
          token_endpoint: `${z}/oauth/token`,
          grant_types_supported: ["urn:ietf:params:oauth:grant-type:device_code", "refresh_token"],
          response_types_supported: [],
          token_endpoint_auth_methods_supported: ["none"],
          scopes_supported: ["openid", "profile", "email"],
          gateway_protocol_version: 1
        });
      }
      if (j === "/protocol" && L.method === "GET") {
        return new Response(qJc, {
          headers: {
            "content-type": "text/markdown; charset=utf-8"
          }
        });
      }
      let V = L.headers.get("content-length");
      if (V === null && L.headers.get("transfer-encoding")) {
        return new Response("length required", {
          status: 411
        });
      }
      if (V !== null) {
        let Z = Number(V);
        if (!Number.isFinite(Z) || Z < 0 || Z > t.limits.max_request_bytes) {
          return new Response("payload too large", {
            status: 413
          });
        }
      }
      if (t.admin && qss(j)) {
        let Z = t.admin;
        let ne = L.headers.get("authorization");
        let oe = null;
        if (Z.admin_groups.length > 0 && !L.headers.get("x-api-key") && ne?.startsWith("Bearer ")) {
          let re = await _ss(ne.slice(7), l, c);
          if (re && Kss(re.groups, Z)) {
            oe = {
              sub: re.sub
            };
          }
        }
        let ee = await RJc(L, W, s.sql, i, oe, P, Z.group_limit_mode);
        if (ee) {
          return ee;
        }
      }
      if (j === "/oauth/device_authorization" && L.method === "POST") {
        if ((await s.incr(kSr("devauth", P ?? "unknown"), t.rate_limits.device_authorization.window_seconds)) > t.rate_limits.device_authorization.max) {
          H("device.authorize", {
            result: "rate_limited",
            client_ip: P
          });
          return eae("slow_down", 429);
        }
        let ne = OYc();
        let oe = PYc();
        let ee = {
          status: "pending",
          user_code: oe,
          created_at: Date.now(),
          client_ip: P
        };
        let re = Css(ne);
        await Promise.all([s.set(re, await vss(ee, l), 600), s.set(xSr(oe), re, 600)]);
        H("device.authorize", {
          result: "success",
          client_ip: P
        });
        return Response.json({
          device_code: ne,
          user_code: oe,
          verification_uri: `${z}/device`,
          verification_uri_complete: `${z}/device?user_code=${encodeURIComponent(oe)}`,
          expires_in: 600,
          interval: 5
        }, {
          headers: xin
        });
      }
      if (j === "/device" && L.method === "GET") {
        let Z = W.searchParams.get("user_code") ?? undefined;
        return Tin({
          prefill: Z,
          idpOrigin: C
        });
      }
      if (j === "/device" && L.method === "POST") {
        let Z = L.headers.get("origin");
        let ne = L.headers.get("sec-fetch-site");
        if (!(ne !== null ? ne === "same-origin" || ne === "none" : Z !== null && Z === z)) {
          H("device.verify", {
            result: "csrf_rejected",
            client_ip: P
          });
          return Tin({
            idpOrigin: C,
            error: "This request came from another site and was blocked. Open the verification link directly."
          });
        }
        if ((await s.incr(kSr("device", P ?? "unknown"), t.rate_limits.device_verify.window_seconds)) > t.rate_limits.device_verify.max) {
          H("device.verify", {
            result: "rate_limited",
            client_ip: P
          });
          return Tin({
            idpOrigin: C,
            error: "Too many attempts. Wait a few minutes and try again."
          });
        }
        let re;
        try {
          re = (await L.formData()).get("user_code")?.toString() ?? null;
        } catch {
          re = null;
        }
        let se = re ? await s.get(xSr(re)) : null;
        if (!se) {
          H("device.verify", {
            result: "unknown_code",
            client_ip: P
          });
          return Tin({
            idpOrigin: C,
            error: "That code was not recognized \u2014 it may have expired. Check your device and try again."
          });
        }
        let ae = vkt.codeVerifier();
        let de = vkt.nonce();
        let be = Zhe.randomBytes(32).toString("base64url");
        let fe = Zhe.createHash("sha256").update(be).digest("hex");
        let me = await RYc({
          deviceCodeKey: se,
          idpCodeVerifier: ae,
          nonce: de,
          browserHash: fe
        }, l);
        let Te = Ro(t.oidc.scopes ?? ["openid", "profile", "email", "offline_access"]).join(" ");
        H("device.verify", {
          result: "redirect",
          client_ip: P
        });
        return new Response(null, {
          status: 302,
          headers: {
            "Set-Cookie": `${A}=${be}; Max-Age=600; ${k}`,
            Location: y.authorizationUrl({
              ...t.oidc.extra_auth_params,
              redirect_uri: `${z}/oauth/callback`,
              state: me,
              nonce: de,
              ...(t.oidc.use_pkce && {
                code_challenge: vkt.codeChallenge(ae),
                code_challenge_method: "S256"
              }),
              scope: Te,
              response_mode: "query"
            })
          }
        });
      }
      if (j === "/oauth/callback") {
        let Z = W.searchParams.get("error");
        if (Z) {
          let ue = W.searchParams.get("error_description");
          return sQe(ue ? `${Z}: ${ue}` : `Identity provider returned: ${Z}`);
        }
        let ne = W.searchParams.get("code");
        let oe = W.searchParams.get("state");
        let ee = oe ? await xYc(oe, l) : null;
        if (!ne || !ee) {
          return sQe("This sign-in link has expired. Try again from your device.");
        }
        let re = `${A}=; Max-Age=0; ${k}`;
        let se = I(L);
        let ae = Buffer.from(ee.browserHash ?? "", "hex");
        let de = se ? Zhe.createHash("sha256").update(se).digest() : Buffer.alloc(0);
        if (ae.length !== 32 || de.length !== ae.length || !Zhe.timingSafeEqual(de, ae)) {
          H("device.callback", {
            result: "browser_mismatch",
            client_ip: P
          });
          let ue = sQe("This sign-in link was started in a different browser. Open the verification link on the same device that showed the code.");
          ue.headers.set("Set-Cookie", re);
          return ue;
        }
        let be = ee.deviceCodeKey;
        let fe = await s.get(be);
        let me = fe ? await wss(fe, l) : null;
        if (!me || me.status !== "pending") {
          return sQe("This device code has already been used or has expired.");
        }
        async function Te(ue) {
          await Promise.all([s.set(be, await vss(ue, l), 600), s.del(xSr(ue.user_code))]);
        }
        try {
          let ue = W.searchParams.get("iss");
          let ce = await y.callback(`${z}/oauth/callback`, {
            code: ne,
            ...(ue && {
              iss: ue
            })
          }, {
            ...(t.oidc.use_pkce && {
              code_verifier: ee.idpCodeVerifier
            }),
            nonce: ee.nonce
          });
          let le = ce.claims();
          let pe = await h(le, "session.mint", P, F, await E(le, ce.access_token));
          await Te({
            status: "complete",
            user_code: me.user_code,
            created_at: me.created_at,
            access_token: pe,
            ...(ce.refresh_token && {
              refresh_token: ce.refresh_token
            }),
            expires_in: t.session.ttl_hours * 3600
          });
          let ve = sQe(null);
          ve.headers.set("Set-Cookie", re);
          return ve;
        } catch (ue) {
          let ce = he(ue);
          vu("warn", `token exchange failed request_id=${F}: ${ce}`);
          H("session.mint", {
            result: "fail",
            client_ip: P,
            err: ce
          });
          await Te({
            status: "denied",
            user_code: me.user_code,
            created_at: me.created_at
          });
          return sQe("Sign-in could not be completed.");
        }
      }
      if (j === "/oauth/token" && L.method === "POST") {
        let Z;
        try {
          Z = await L.formData();
        } catch {
          return eae("invalid_request");
        }
        let ne = Z.get("grant_type")?.toString();
        if (ne === "urn:ietf:params:oauth:grant-type:device_code") {
          let oe = Z.get("device_code")?.toString();
          if (!oe) {
            return eae("invalid_request");
          }
          let ee = Css(oe);
          let re = await s.get(ee);
          let se = re ? await wss(re, l) : null;
          if (!se) {
            return eae("expired_token");
          }
          if (se.status === "pending") {
            if ((await s.incr(kSr("poll", ee), 5 - 1)) > 1) {
              return eae("slow_down", 429);
            }
            return eae("authorization_pending");
          }
          if (se.status === "denied") {
            await s.del(ee);
            return eae("access_denied");
          }
          await s.del(ee);
          return Response.json({
            access_token: se.access_token,
            refresh_token: se.refresh_token,
            token_type: "Bearer",
            expires_in: se.expires_in
          }, {
            headers: xin
          });
        }
        if (ne === "refresh_token") {
          let oe = Z.get("refresh_token")?.toString();
          if (!oe) {
            return eae("invalid_request");
          }
          try {
            let ee = await y.refresh(oe);
            let re;
            try {
              re = ee.claims();
            } catch {
              re = undefined;
            }
            let se;
            let ae;
            if (re === undefined) {
              if (!ee.access_token) {
                throw Error("IdP refresh response had neither id_token nor access_token");
              }
              se = await y.userinfo(ee.access_token);
            } else {
              se = re;
              ae = await E(re, ee.access_token);
            }
            let de = await h(se, "session.refresh", P, F, ae);
            return Response.json({
              access_token: de,
              refresh_token: ee.refresh_token ?? oe,
              token_type: "Bearer",
              expires_in: t.session.ttl_hours * 3600
            }, {
              headers: xin
            });
          } catch (ee) {
            let re = he(ee);
            vu("warn", `refresh failed request_id=${F}: ${re}`);
            H("session.refresh", {
              result: "fail",
              client_ip: P,
              err: re
            });
            let se = ee.response !== undefined || typeof ee.code === "string" || ee.name === "RPError";
            let ae = ee.error === "invalid_grant";
            if (se && !ae) {
              return eae("temporarily_unavailable", 503);
            }
            return eae("invalid_grant", 401);
          }
        }
        return eae("unsupported_grant_type");
      }
      let K = L.headers.get("authorization");
      let J = K?.startsWith("Bearer ") ? await _ss(K.slice(7), l, c) : null;
      if (!J) {
        H("auth.denied", {
          reason: K ? "invalid_token" : "missing_token",
          path: j,
          client_ip: P
        });
        return Response.json({
          type: "error",
          request_id: F,
          error: {
            type: "authentication_error",
            message: "invalid token"
          }
        }, {
          status: 401
        });
      }
      if (j === "/managed/settings") {
        if (!b) {
          return new Response("not configured", {
            status: 404
          });
        }
        let Z = USr(b, J);
        if (!Z) {
          vu("warn", `no managed policy matched for sub=${J.sub} (groups: ${(J.groups ?? []).join(",") || "none"}) request_id=${F}`);
          return new Response("no policy matched", {
            status: 404
          });
        }
        let {
          payload: ne
        } = Z.policy;
        let oe = `"${ne.checksum}"`;
        let ee = {
          "x-cc-gateway-version": {
            ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
            PACKAGE_URL: "@anthropic-ai/claude-code",
            README_URL: "https://code.claude.com/docs/en/overview",
            VERSION: "2.1.198",
            FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
            BUILD_TIME: "2026-07-01T06:09:31Z",
            GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
          }.VERSION
        };
        if (L.headers.get("if-none-match") === oe) {
          return new Response(null, {
            status: 304,
            headers: ee
          });
        }
        H("managed.serve", {
          sub: J.sub,
          email: J.email,
          policy_index: Z.index,
          checksum: ne.checksum
        });
        return Response.json(ne, {
          headers: {
            ETag: oe,
            ...ee
          }
        });
      }
      if (j === "/user/bootstrap" && L.method === "GET") {
        let Z = b ? USr(b, J) : null;
        let ne = UJc(t, Z?.policy ?? null, J, z);
        let oe = Kss(J.groups, t.admin);
        H("desktop_bootstrap.serve", {
          sub: J.sub,
          email: J.email,
          policy_index: Z?.index ?? null
        });
        return Response.json(ne, {
          headers: {
            ...xin,
            "x-gateway-spend-admin": String(oe)
          }
        });
      }
      if (j in Jss && L.method === "POST") {
        let Z = Jss[j];
        let ne = t.telemetry.forward_to.filter(se => se[Z]);
        if (ne.length === 0) {
          return new Response(null, {
            status: 200
          });
        }
        let oe = await L.arrayBuffer();
        let ee = L.headers.get("content-type") ?? "application/x-protobuf";
        let re = L.headers.get("content-encoding");
        HJc(j, oe, ee, re, ne);
        return new Response(null, {
          status: 200
        });
      }
      let Q = b ? USr(b, J)?.policy.availableModels : undefined;
      if (j === "/v1/models" && L.method === "GET") {
        return gJc(t.models, _, t.auto_include_builtin_models, Q);
      }
      if (dJc(j) && L.method === "POST") {
        if (a && j === "/v1/messages") {
          let ae = await a.precheck(J, F);
          if (ae) {
            return ae;
          }
        }
        let Z = performance.now();
        let ne = null;
        let oe;
        let ee = await mJc(L, j, _, t.models, t.auto_include_builtin_models, Q, t.timeouts.upstream_ttfb_ms, F, a && j === "/v1/messages" ? ae => {
          if (ae.stream !== true) {
            ne = ae;
            oe = ae.speed === "fast" ? "fast" : undefined;
          }
        } : undefined);
        let re = ee.headers.get("x-gateway-model");
        let se = ee.headers.get("x-gateway-upstream-model");
        if (H("inference", {
          sub: J.sub,
          email: J.email,
          path: j,
          model: re,
          upstream: ee.headers.get("x-gateway-upstream"),
          status: ee.status,
          ms: Math.round(performance.now() - Z)
        }), ee.headers.delete("x-gateway-upstream"), ee.headers.delete("x-gateway-model"), ee.headers.delete("x-gateway-upstream-model"), ee.status >= 500) {
          vu("warn", `upstream ${ee.status} on ${j} request_id=${F}`);
        }
        if (a && j === "/v1/messages") {
          let ae = ne;
          return a.meter(ee, J, se, ae ? () => uJc(ae, _, t.models, t.auto_include_builtin_models) : null, oe);
        }
        return ee;
      }
      return new Response("not found", {
        status: 404
      });
    }
    let M = Bun.serve({
      hostname: t.listen.host,
      port: t.listen.port,
      idleTimeout: 0,
      development: false,
      ...(S && {
        Aeu: S
      }),
      fetch: async (L, P) => {
        let F = JYc(P.requestIP(L)?.address, L.headers.get("x-forwarded-for"), n);
        let H = X6f(L);
        let U;
        try {
          U = await O(L, F, H);
        } catch (N) {
          vu("error", `unhandled request_id=${H}: ${he(N)}`);
          U = Response.json({
            type: "error",
            request_id: H,
            error: {
              type: "api_error",
              message: "internal server error"
            }
          }, {
            status: 500
          });
        }
        U.headers.set("x-request-id", H);
        return JJc(U, !!S);
      },
      error: L => (vu("error", `unhandled: ${he(L)}`), JJc(Response.json({
        type: "error",
        error: {
          type: "api_error",
          message: "internal server error"
        }
      }, {
        status: 500
      }), !!S))
    });
    MYc(t, {
      Aeu: !!S,
      hostname: M.hostname ?? t.listen.host,
      port: M.port ?? t.listen.port,
      managed: !!b
    });
    Z6f(t, b);
    jYc();
    return {
      port: M.port ?? t.listen.port,
      stop: () => {
        M.stop(true);
        s.close();
      }
    };
  }
  function Z6f(e, t) {
    for (let n of collectBootWarnings(e, t)) {
      vu("warn", n);
    }
  }
  function collectBootWarnings(e, t = null) {
    let n = [];
    let r = new Set(e.upstreams.filter(o => o.provider === "vertex").map(o => o.name));
    if (r.size > 0) {
      let o = [xa.sonnet45, xa.sonnet40];
      let s = [];
      for (let i of e.models) {
        for (let [a, l] of Object.entries(i.upstream_model)) {
          let c = t8(l);
          if (r.vZc(a) && c && o.includes(c)) {
            s.push(i.id);
          }
        }
      }
      if (e.auto_include_builtin_models) {
        s.push("claude-sonnet-4-5 (via auto_include_builtin_models)");
      }
      if (s.length > 0) {
        n.push(`vertex upstream serves ${Ro(s).join(", ")}: Sonnet 4.5/Sonnet 4 do not support 1M context on Vertex \u2014 requests with the context-1m beta (the [1m] model suffix) for these models will be rejected with a 400. Vertex 1M lineup: Opus 4.6+/Sonnet 4.6.`);
      }
    }
    for (let [o, s] of (t ?? []).entries()) {
      let i = s.availableModels;
      if (!i) {
        continue;
      }
      let a = i.filter(l => Sk(l.trim().toLowerCase()) && !s2(l.trim().toLowerCase()));
      if (a.length > 0) {
        let l = a.length === i.length ? "so every inference request for this role will be rejected" : "so these entries never match (other entries in the list still do)";
        n.push(`managed policy ${o} availableModels contains ${a.map(c => `'${c}'`).join(", ")} \u2014 the CLI resolves these aliases when picking a model, but the gateway matches the raw request string, ${l}. List concrete model ids or family aliases (fable/opus/sonnet/haiku) instead.`);
      }
    }
    if (e.admin) {
      let o = [];
      for (let s of e.models) {
        for (let i of Object.values(s.upstream_model)) {
          if (!Rin(i)) {
            o.push(`${s.id} (${i})`);
          }
        }
      }
      if (o.length > 0) {
        n.push(`spend meter has no exact rates for ${Ro(o).join(", ")} \u2014 these will be metered at the unknown-model default tier`);
      }
    }
    return n;
  }
  var Zhe;
  var Qss;
  var xin;
  var z6f;
  var J6f;
  var ZJc = __lazy(() => {
    mSr();
    dt();
    Tk();
    zN();
    DYc();
    UYc();
    VYc();
    bss();
    YYc();
    Dss();
    sJc();
    Uss();
    xJc();
    FJc();
    Gss();
    Fee();
    $Jc();
    jJc();
    Nkt();
    YJc();
    Zhe = require("crypto");
    Qss = require("fs/promises");
    xin = {
      "Cache-Control": "no-store",
      Pragma: "no-cache"
    };
    z6f = {
      "X-Content-Type-Options": "nosniff",
      "X-Frame-Options": "DENY",
      "Referrer-Policy": "no-referrer",
      "Cross-Origin-Opener-Policy": "same-origin"
    };
    J6f = /^[A-Za-z0-9._-]{1,64}$/;
  });
  var iXc = {};
  __export(iXc, {
    scanHistoryFile: () => scanHistoryFile,
    purgeProjectHandler: () => purgeProjectHandler
  });
  function Zss(e = "") {
    process.stdout.write(`${e}
`);
  }
  function eXc(e) {
    let t = () => {};
    let n = new Promise(o => {
      t = o;
    });
    let r = WSr.createInterface({
      input: process.stdin,
      output: process.stdout
    });
    r.question(`${e} [y/N] `, o => {
      r.close();
      let s = o.trim().toLowerCase();
      t(s === "y" || s === "yes");
    });
    return n;
  }
  async function _Re(e) {
    try {
      await bRe.stat(e);
      return true;
    } catch {
      return false;
    }
  }
  async function nXc(e, t, n) {
    let r = () => {};
    let o = new Promise(a => {
      r = a;
    });
    let {
      unmount: s,
      waitUntilExit: i
    } = await render(aQe.jsx(AppStateProvider, {
      children: aQe.jsx(KeybindingSetup, {
        children: aQe.jsxs(gXd, {
          flexDirection: "column",
          gap: 1,
          paddingY: 1,
          children: [aQe.jsx(Text, {
            bold: true,
            children: e
          }), aQe.jsx(xr, {
            options: t,
            defaultValue: n,
            visibleOptionCount: 10,
            onChange: a => {
              r(a);
              s();
            },
            onCancel: () => {
              r(null);
              s();
            }
          })]
        })
      })
    }), {
      exitOnCtrlC: false
    });
    await i();
    return o;
  }
  function rXc() {
    return Object.keys(getGlobalConfig().projects ?? {});
  }
  async function t8f() {
    let e = OL.resolve(getOriginalCwd());
    let t = rXc();
    let n = new Set([e]);
    let r = [{
      label: e,
      value: e,
      description: "current directory"
    }];
    for (let o of t) {
      if (n.vZc(o)) {
        continue;
      }
      n.add(o);
      r.push({
        label: o,
        value: o
      });
    }
    return nXc("Select a project to purge:", r, e);
  }
  function oXc(e, t) {
    for (let n of t) {
      if (e === n || e.startsWith(n + OL.sep)) {
        return true;
      }
    }
    return false;
  }
  function n8f(e, t) {
    if (!e) {
      return false;
    }
    try {
      let n = qt(e);
      return typeof n.project === "string" && oXc(n.project, t);
    } catch {
      return false;
    }
  }
  async function r8f(e, t) {
    let n;
    try {
      n = (await bRe.readdir(e)).filter(r => r.endsWith(".jsonl")).sort();
    } catch {
      return false;
    }
    for (let r of n) {
      let o = nis.createReadStream(OL.join(e, r), {
        encoding: "utf8"
      });
      let s = WSr.createInterface({
        input: o,
        crlfDelay: 1 / 0
      });
      let i = 0;
      try {
        for await (let a of s) {
          if (++i > 50) {
            break;
          }
          try {
            let l = qt(a);
            if (typeof l.cwd === "string") {
              return oXc(l.cwd, t);
            }
          } catch {}
        }
      } catch {} finally {
        s.close();
        o.close();
      }
    }
    return false;
  }
  async function scanHistoryFile(e, t, n) {
    let r = WSr.createInterface({
      input: nis.createReadStream(e, {
        encoding: "utf8"
      }),
      crlfDelay: 1 / 0
    });
    let o = [];
    let s = 0;
    try {
      for await (let i of r) {
        if (n8f(i, t)) {
          s++;
        } else if (n === "filter") {
          o.push(i);
        }
      }
    } catch (i) {
      if (fn(i)) {
        return 0;
      }
      throw i;
    }
    if (n === "filter" && s > 0) {
      await Fm(e, o.length ? `${o.join(`
`)}
` : "");
    }
    return s;
  }
  async function o8f(e) {
    let t;
    try {
      t = await bRe.readdir(e);
    } catch {
      return [];
    }
    return t.filter(n => n.endsWith(".jsonl")).map(n => n.slice(0, -6)).filter(n => e8f.test(n));
  }
  async function s8f(e) {
    let t = er();
    let n = OL.resolve(e);
    let r = await YE(n);
    let o = new Set([n, r]);
    let s = [];
    try {
      await bRe.stat(n);
      for (let b of o) {
        let S = findCanonicalGitRoot(b);
        if (S) {
          s.push(S);
        }
      }
    } catch {}
    let i = [];
    let a = [];
    let l = new Set();
    for (let b of o) {
      for (let S of await jA(b)) {
        l.add(S);
      }
    }
    let c = nF();
    let u = [...o].map(b => $T(b) + "-");
    try {
      for (let b of await bRe.readdir(c, {
        withFileTypes: true
      })) {
        let S = OL.join(c, b.name);
        if (b.isDirectory() && !l.vZc(S) && u.some(E => b.name.startsWith(E)) && (await r8f(S, o))) {
          l.add(S);
        }
      }
    } catch {}
    let d = [...l];
    let p = new Set();
    for (let b of d) {
      for (let S of await o8f(b)) {
        p.add(S);
      }
    }
    for (let b of p) {
      let S = w9(b);
      if (await _Re(S)) {
        i.push({
          path: S,
          kind: "dir",
          reason: `tasks for session ${b}`
        });
      }
      let E = OL.join(t, "debug", `${b}.txt`);
      if (await _Re(E)) {
        i.push({
          path: E,
          kind: "file",
          reason: `debug log for session ${b}`
        });
      }
      let C = OL.join(t, "file-history", b);
      if (await _Re(C)) {
        i.push({
          path: C,
          kind: "dir",
          reason: `file edit history for session ${b}`
        });
      }
    }
    for (let b of d) {
      i.push({
        path: b,
        kind: "dir",
        reason: "project transcripts (.jsonl) and memory/"
      });
    }
    let m = b => $6(b).replace(/\/+$/, "") || "/";
    let f = getGlobalConfig();
    let h = new Set([...o, ...s].map(m));
    for (let b of Object.keys(f.projects ?? {})) {
      if (h.vZc(m(b))) {
        i.push({
          path: b,
          kind: "config-key",
          reason: "project entry in ~/.claude.json (trust, history, MCP servers)"
        });
      }
    }
    let g = OL.join(t, "history.jsonl");
    let y = await scanHistoryFile(g, o, "count");
    if (y > 0) {
      i.push({
        path: g,
        kind: "history-lines",
        reason: `${y} prompt(s) typed in this project`,
        matchPaths: o
      });
    }
    if (await _Re(OL.join(t, "shell-snapshots"))) {
      a.push("shell-snapshots/ are not project-scoped and will not be touched");
    }
    let _ = OL.join(t, "backups");
    if (await _Re(_)) {
      a.push(`backups/ may still contain this project entry in old .claude.json snapshots (${_}); at most 5 are kept and they rotate out automatically`);
    }
    return {
      items: i,
      warnings: a
    };
  }
  async function i8f() {
    let e = er();
    let t = [];
    let n = [];
    let r = [["projects", "all project transcripts (.jsonl) and memory/"], ["tasks", "all session task lists"], ["debug", "all session debug logs"], ["file-history", "all session file edit history"]];
    for (let [i, a] of r) {
      let l = OL.join(e, i);
      if (await _Re(l)) {
        t.push({
          path: l,
          kind: "dir",
          reason: a
        });
      }
    }
    let o = OL.join(e, "history.jsonl");
    if (await _Re(o)) {
      t.push({
        path: o,
        kind: "file",
        reason: "prompt history across all projects"
      });
    }
    for (let i of rXc()) {
      t.push({
        path: i,
        kind: "config-key",
        reason: "project entry in ~/.claude.json (trust, history, MCP servers)"
      });
    }
    if (await _Re(OL.join(e, "shell-snapshots"))) {
      n.push("shell-snapshots/ are not project-scoped and will not be touched");
    }
    let s = OL.join(e, "backups");
    if (await _Re(s)) {
      n.push(`backups/ may still contain project entries in old .claude.json snapshots (${s}); at most 5 are kept and they rotate out automatically`);
    }
    return {
      items: t,
      warnings: n
    };
  }
  async function eis(e) {
    switch (e.kind) {
      case "config-key":
        if (!deleteProjectConfig(e.path)) {
          return `Failed to remove projects["${e.path}"] from .claude.json \u2014 is your config directory writable?`;
        }
        return null;
      case "history-lines":
        await scanHistoryFile(e.path, e.matchPaths ?? new Set(), "filter");
        return null;
      case "file":
      case "dir":
        await bRe.rm(e.path, {
          recursive: e.kind === "dir",
          force: true
        });
        return null;
    }
  }
  function tis(e, t) {
    if (e.length > 0) {
      Ae("cli_purge_project", "config_write_failed");
      Es(`${e.length} item(s) failed:
  ${e.join(`
  `)}`);
    }
    Pe("cli_purge_project");
    W0(t);
  }
  function sXc(e) {
    let t;
    switch (e.kind) {
      case "config-key":
        t = `config: projects["${e.path}"]`;
        break;
      case "history-lines":
        t = `filter: ${e.path}`;
        break;
      case "file":
      case "dir":
        t = `${e.kind}:    ${e.path}`;
        break;
    }
    return `${t}
           ${e.reason}`;
  }
  function tXc(e, t, n) {
    Zss(`
Purge plan for ${e}:
`);
    for (let r of t) {
      Zss(`  ${sXc(r)}`);
    }
    if (n.length) {
      Zss();
      for (let r of n) {
        Y3(r);
      }
    }
  }
  async function purgeProjectHandler(e, t) {
    if (t.all) {
      if (e) {
        Es("Cannot specify both a path and --all.");
      }
      if (t.interactive) {
        Es("Cannot use -i/--interactive with --all.");
      }
      let {
        items: i,
        warnings: a
      } = await i8f();
      if (i.length === 0) {
        Ae("cli_purge_project", "cli_purge_project_nothing_found");
        Es(`No Claude Code project state found under ${er()}.`);
      }
      if (tXc("all projects", i, a), t.dryRun) {
        W0(`Dry run: ${i.length} item(s) would be deleted.`);
      }
      if (!t.yes) {
        if (!(await eXc(`Delete ${i.length} item(s) for ALL projects? This cannot be undone.`))) {
          Es("Aborted.");
        }
      }
      let l = [];
      for (let c of i) {
        let u = await eis(c);
        if (u) {
          l.push(u);
        }
      }
      tis(l, `Purged ${i.length} item(s) across all projects.`);
    }
    let n;
    if (e) {
      n = OL.resolve(e);
    } else {
      let i = await t8f();
      if (i === null) {
        Es("Aborted.");
      }
      n = i;
    }
    let {
      items: r,
      warnings: o
    } = await s8f(n);
    if (r.length === 0) {
      Ae("cli_purge_project", "cli_purge_project_nothing_found");
      Es(`No Claude Code project state found for ${n} under ${er()}.`);
    }
    if (tXc(n, r, o), t.dryRun) {
      W0(`Dry run: ${r.length} item(s) would be deleted.`);
    }
    if (t.interactive) {
      let i = 0;
      let a = false;
      let l = [];
      for (let [c, u] of r.entries()) {
        let d = "delete";
        if (!a) {
          d = (await nXc(`[${c + 1}/${r.length}] ${sXc(u)}`, [{
            label: "Delete",
            value: "delete"
          }, {
            label: "Skip",
            value: "skip"
          }, {
            label: "Delete this and all remaining",
            value: "all"
          }, {
            label: "Abort",
            value: "abort"
          }])) ?? "abort";
        }
        if (d === "abort") {
          Es(`Aborted. ${i} item(s) deleted.`);
        }
        if (d === "skip") {
          continue;
        }
        if (d === "all") {
          a = true;
        }
        let p = await eis(u);
        if (p) {
          l.push(p);
          continue;
        }
        i++;
      }
      tis(l, `Purged ${i}/${r.length} item(s) for ${n}.`);
    }
    if (!t.yes) {
      if (!(await eXc(`Delete ${r.length} item(s) for ${n}? This cannot be undone.`))) {
        Es("Aborted.");
      }
    }
    let s = [];
    for (let i of r) {
      let a = await eis(i);
      if (a) {
        s.push(a);
      }
    }
    tis(s, `Purged ${r.length} item(s) for ${n}.`);
  }
  var nis;
  var bRe;
  var OL;
  var WSr;
  var aQe;
  var e8f;
  var aXc = __lazy(() => {
    at();
    OS();
    et();
    C9();
    ln();
    _3();
    BT();
    gn();
    dt();
    na();
    ku();
    ZS();
    YI();
    SL();
    nis = require("fs");
    bRe = require("fs/promises");
    OL = require("path");
    WSr = require("readline");
    aQe = __toESM(ie(), 1);
    e8f = /^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$/i;
  });
  var uXc = {};
  __export(uXc, {
    printAgentsJson: () => printAgentsJson
  });
  async function printAgentsJson(e, t) {
    let n = e ? await YE(Fkt.resolve(e)) : undefined;
    function r(d) {
      if (!n) {
        return true;
      }
      let p = Fkt.relative(n, d);
      return p.split(/[/\\]/, 1)[0] !== ".." && !Fkt.isAbsolute(p);
    }
    let [o, s, i] = await Promise.all([listAllLiveSessions(), sX(), Our()]);
    let a = new Map();
    for (let d of o) {
      if (d.kind === "bg" && d.jobId) {
        a.set(d.jobId, d);
      }
    }
    let l = new Set(i.shorts);
    for (let d of a.keys()) {
      l.add(d);
    }
    let c = [];
    let u = new Set();
    for (let d of Wjt(s, l)) {
      let p = a.get(d.id);
      if (p) {
        u.add(p.pid);
      }
      if (!r(xSe(d.state))) {
        continue;
      }
      let m = c8f(d.state, p?.status);
      if (!t && !p && m !== "working" && m !== "blocked") {
        continue;
      }
      let f = lXc(p?.name ?? d.state.name ?? Lc(d.state.displayIntent ?? d.state.intent));
      c.push({
        ...(p && {
          pid: p.pid
        }),
        id: d.id,
        cwd: p?.cwd ?? d.state.cwd,
        kind: "background",
        startedAt: p?.startedAt ?? Date.parse(d.state.createdAt),
        sessionId: p?.sessionId ?? d.state.sessionId,
        ...(f && {
          name: f
        }),
        ...(p?.status && {
          status: cXc(p.status)
        }),
        ...(p?.status === "waiting" && p.waitingFor && {
          waitingFor: p.waitingFor
        }),
        state: m
      });
    }
    for (let d of o) {
      if (d.kind !== "interactive" && d.kind !== "bg" || u.vZc(d.pid)) {
        continue;
      }
      if (d.kind === "bg" && d.jobId) {
        continue;
      }
      if (!r(d.cwd)) {
        continue;
      }
      let p = d.name && lXc(d.name);
      c.push({
        pid: d.pid,
        cwd: d.cwd,
        kind: d.kind === "bg" ? "background" : "interactive",
        startedAt: d.startedAt,
        ...(d.sessionId && {
          sessionId: d.sessionId
        }),
        ...(p && {
          name: p
        }),
        ...(d.status && {
          status: cXc(d.status)
        }),
        ...(d.status === "waiting" && d.waitingFor && {
          waitingFor: d.waitingFor
        })
      });
    }
    c.sort((d, p) => d.startedAt - p.startedAt);
    await F5(De(c, null, 2) + `
`);
    Pe("cli_agents_json");
  }
  function lXc(e) {
    return e.replace(/[\x00-\x08\x0E-\x1F\x7F-\x9F]/g, "").replace(/\s+/g, " ").trim();
  }
  function cXc(e) {
    return e === "idle" ? "idle" : e === "waiting" ? "waiting" : "busy";
  }
  function c8f(e, t) {
    if (t === "busy") {
      return "working";
    }
    let n = Fre(e.state);
    if (Xg(e) && !(n === "success" && lOe(e))) {
      return n === "success" ? "done" : n === "failure" ? "failed" : "stopped";
    }
    if (e.tempo === "blocked" || t === "waiting") {
      return "blocked";
    }
    return "working";
  }
  var Fkt;
  var dXc = __lazy(() => {
    TCt();
    zf();
    ln();
    Kv();
    ZS();
    wze();
    SL();
    Fkt = require("path");
  });
  var sis = {};