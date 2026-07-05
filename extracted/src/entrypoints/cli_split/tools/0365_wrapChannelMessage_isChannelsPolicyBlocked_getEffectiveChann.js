  __export(mLo, {
    lxl: () => lxl,
    SKILL_FILES: () => SKILL_FILES,
    pLo: () => pLo
  });
  var SKILL_FILES;
  function mxl(e) {
    let t;
    try {
      t = ixl(e);
    } catch {
      return null;
    }
    let n = 0;
    let r = 0;
    while (t[n]?.type === "space") {
      r += t[n]?.raw.length ?? 0;
      n++;
    }
    let o = t[n];
    if (!o || !e.startsWith(o.raw, r)) {
      return null;
    }
    return {
      token: o,
      offset: r
    };
  }
  function eAm(e = "") {
    return e.replace(/[*_`~]/g, "").replace(/\s+/g, " ").trim() || "Plan";
  }
  function hLo(e) {
    return [...e].slice(0, 120).join("").trim() || "Plan";
  }
  async function fxl(e) {
    let t = e.replace(pxl, `
`);
    let n = mxl(t);
    let r = n?.token;
    let o = n && r?.type === "heading" ? {
      token: r,
      offset: n.offset
    } : null;
    let s = eAm(o ? o.token.text : t.match(Qkm)?.[1]);
    let i;
    try {
      ({
        pLo: i
      } = await Promise.resolve().then(() => (fLo(), mLo)));
    } catch (d) {
      Et("artifact_publish", "plan_template_load_failed");
      logForDebugging(`plan artifact: template load failed (${he(d)}); falling back to markdown stylesheet`, {
        level: "warn"
      });
    }
    if (!i) {
      return {
        html: xYt(t),
        title: hLo(s)
      };
    }
    let a = o ? t.slice(0, o.offset) + t.slice(o.offset + o.token.raw.length) : t;
    let {
      summary: l,
      rest: c
    } = rAm(a);
    let u = tAm(i, {
      title: s,
      eyebrow: `Plan \xB7 ${dxl.basename(Nt())}`,
      summary: l,
      body: uLo(c)
    });
    if (u === null) {
      Et("artifact_publish", "plan_template_shape_drift");
      logForDebugging("plan artifact: bundled template has no placeholder-section run; falling back to markdown stylesheet", {
        level: "warn"
      });
      return {
        html: xYt(t),
        title: hLo(s)
      };
    }
    return {
      html: u,
      title: hLo(s)
    };
  }
  function tAm(e, t) {
    let n = e.replace(Zkm, "");
    if (!uxl.test(n)) {
      return null;
    }
    let r = {
      TITLE: t.title,
      EYEBROW: t.eyebrow,
      SUMMARY: t.summary
    };
    return n.replace(/\{\{(TITLE|EYEBROW|SUMMARY)\}\}/g, (o, s) => Yd(r[s] ?? "")).replace(uxl, () => `<section>${t.body}</section>`);
  }
  function rAm(e) {
    let t = e.replace(pxl, `
`);
    let n = mxl(t);
    let r = n?.token;
    if (!n || r?.type !== "paragraph") {
      return {
        summary: "",
        rest: t
      };
    }
    let o = r.text.replace(/\s+/g, " ").replace(/!?\[([^\]]*)\]\([^)]*\)/g, "$1").replace(/[*_`~]/g, "").trim();
    if (!o || o.length > 300) {
      return {
        summary: "",
        rest: t
      };
    }
    return {
      summary: o,
      rest: t.slice(0, n.offset) + t.slice(n.offset + r.raw.length)
    };
  }
  var dxl;
  var Qkm;
  var pxl;
  var Zkm;
  var uxl;
  var hxl = __lazy(() => {
    ln();
    vo();
    je();
    dt();
    wx();
    dLo();
    dxl = require("path");
    Qkm = /^ {0,3}#{1,6}[ \t]+(.+?)\s*#*\s*$/m;
    pxl = /\r\n|\r/g;
    Zkm = /^\uFEFF?<!--[\s\S]*?-->\s*/;
    uxl = /<section\b[\s\S]*<\/section>/;
  });
  var vLo = {};
  __export(vLo, {
    trackFrameEvent: () => trackFrameEvent,
    surfacedViaForEntrypoint: () => surfacedViaForEntrypoint,
    stripStaleInjections: () => stripStaleInjections,
    readFrameDecl: () => readFrameDecl,
    publishPlanArtifact: () => publishPlanArtifact,
    publishArtifact: () => publishArtifact,
    makeSetArtifactReadVersion: () => makeSetArtifactReadVersion,
    isShareAwarePublishEnabled: () => isShareAwarePublishEnabled,
    isFrameSignedPutHeaderCheckEnabled: () => isFrameSignedPutHeaderCheckEnabled,
    isFrameReaderPersistEnabled: () => isFrameReaderPersistEnabled,
    isFramePublishContextEnabled: () => isFramePublishContextEnabled,
    isFrameLiveSubscribeEnabled: () => isFrameLiveSubscribeEnabled,
    isFrameBaseVersionEnabled: () => isFrameBaseVersionEnabled,
    goCpHeaders: () => goCpHeaders,
    artifactViewerUrl: () => artifactViewerUrl,
    MAX_ARTIFACT_BYTES: () => 16777216,
    FRAME_RUNTIME_END: () => "<!-- /frame-runtime -->",
    FRAME_RUNTIME_BEGIN: () => "<!-- frame-runtime -->"
  });
  function isFrameBaseVersionEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_plinth_fern", false);
  }
  function isShareAwarePublishEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_saffron_anchor", false);
  }
  function isFrameReaderPersistEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_plinth_reader_persist", false);
  }
  function isFrameLiveSubscribeEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_slate_lantern", false);
  }
  function isFrameSignedPutHeaderCheckEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_plinth_putguard", true);
  }
  function isFramePublishContextEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_frame_publish_context", false);
  }
  function makeSetArtifactReadVersion(e) {
    return (t, n) => e(r => ({
      ...r,
      artifactReadVersions: {
        ...r.artifactReadVersions,
        [t]: n
      }
    }));
  }
  function bxl(e) {
    return {
      ...(e.slug && {
        slug: e.slug
      }),
      title: e.title,
      favicon: e.favicon,
      ...(e.label && {
        label: e.label
      }),
      ...(e.description && {
        description: e.description
      }),
      ...(isFramePublishContextEnabled() && e.publishContext && {
        publish_context: e.publishContext
      })
    };
  }
  function Sxl(e) {
    return e === undefined ? {} : {
      contract: "0.0.0",
      capabilities: e
    };
  }
  function dAm(e) {
    let t = e.trim();
    let n = t.match(/^<base\s+href="\/_f\/[^">]*"\s*\/?>/);
    if (!n) {
      return false;
    }
    t = t.slice(n[0].length).trimStart();
    while (t.length) {
      let r = t.match(/^<script\b[^>]*>/);
      if (!r) {
        return false;
      }
      let o = t.indexOf("</script>", r[0].length);
      if (o < 0) {
        return false;
      }
      t = t.slice(o + 9).trimStart();
    }
    return true;
  }
  function stripStaleInjections(e) {
    let t = e.indexOf("<!-- frame-runtime -->");
    if (t >= 0 && t < 8192) {
      let n = t + ("<!-- frame-runtime -->").length;
      let r = e.indexOf("<!-- /frame-runtime -->", n);
      if (r >= 0 && r - t < 300000 && dAm(e.slice(n, r))) {
        let o = r + ("<!-- /frame-runtime -->").length;
        if (e[o] === `
`) {
          o++;
        }
        e = e.slice(0, t) + e.slice(o);
      }
    }
    return e.replace(/<base\s+href="\/_f\/[^">]*"\s*\/?>\n?/gi, "").replace(/\sdata-frame-runtime="[^">]*"/gi, "");
  }
  async function readFrameDecl(e, t) {
    try {
      let n = await _s.get(`/api/frame/read/${encodeURIComponent(e)}`, {
        host: "frame",
        auth: "required",
        refreshOAuth: true,
        headers: goCpHeaders(),
        timeout: 15000,
        validateStatus: () => true,
        ...(t && {
          signal: t
        })
      });
      if (!n.ok) {
        return {
          err: `read-back unavailable: ${n.reason}`
        };
      }
      if (n.status === 404) {
        return null;
      }
      if (n.status < 200 || n.status >= 300) {
        return {
          err: `read-back ${n.status}: ${PTt(n.data)}`,
          status: n.status
        };
      }
      let r = lAm().safeParse(n.data);
      if (!r.success) {
        return {
          err: `malformed read-back body: ${r.error.message}`
        };
      }
      let {
        contract: o,
        capabilities: s
      } = r.data;
      return {
        contract: o,
        ...(s != null && {
          capabilities: s
        })
      };
    } catch (n) {
      return {
        err: n instanceof Error ? n.message : String(n)
      };
    }
  }
  async function gLo(e, t) {
    let n = await e;
    if (n.err !== null || t === undefined) {
      return n;
    }
    let r = await readFrameDecl(t);
    if (r === null || "err" in r) {
      if (r !== null) {
        logForDebugging(`[artifact] read-back skipped: ${r.err}`);
      }
      return n;
    }
    if (!(r.capabilities != null && Object.keys(r.capabilities).length > 0) && (r.contract === "" || r.contract === "0.0.0")) {
      return n;
    }
    return {
      ...n,
      stored: r
    };
  }
  function Exl() {
    let e = NN();
    return e ? {
      entrypoint: e.toLowerCase().slice(0, 64)
    } : {};
  }
  function vxl() {
    let e = Me.CLAUDE_CODE_REMOTE_SESSION_ID;
    return e && pAm.test(e) ? {
      session_id: e
    } : {};
  }
  function goCpHeaders() {
    return {
      "X-Frame-CP": "go",
      "X-Frame-Surface": "code",
      "X-Frame-Platform": L6() ? "desktop" : "cli"
    };
  }
  async function publishArtifact(e, t) {
    let n = performance.now();
    let {
      slug: r,
      title: o,
      favicon: s,
      label: i,
      description: a,
      capabilities: l,
      readBack: c,
      publishContext: u
    } = t;
    let d = !!r;
    let p = l !== undefined;
    let m = isFrameBaseVersionEnabled();
    let f = m ? t.baseVersion : undefined;
    let h = {
      slug: r,
      title: o,
      favicon: s,
      label: i,
      description: a,
      publishContext: u
    };
    let g = stripStaleInjections(e);
    let y = `<!doctype html><html><head><meta charset=utf8><meta name=viewport content="width=device-width,initial-scale=1">${"<style>:root{color-scheme:light}body{margin:0;padding:0;font:14px -apple-system,BlinkMacSystemFont,sans-serif;background:#faf9f5;color:#141413}img{max-width:100%}</style>"}</head><body>
${g}
</body></html>`;
    let _ = Buffer.byteLength(y, "utf8");
    if (_ > 16777216) {
      Ae("artifact_publish", "too_large", {
        page_bytes: _
      });
      return tK(`too large: rendered page is ${Math.ceil(_ / 1024 / 1024)}MB (max ${16777216 / 1024 / 1024}MB)`);
    }
    let b = Me.CLAUDE_CODE_ENTRYPOINT ?? "";
    if (sAm.vZc(b) || Me.CLAUDE_CODE_ARTIFACT_DIRECT_UPLOAD || getFeatureValue_CACHED_MAY_BE_STALE("tengu_cobalt_plinth_direct", false)) {
      return gLo(yxl(y, h, l, f, {
        t0: n,
        pageBytes: _,
        lane: "inline",
        isRedeploy: d,
        hasCaps: p
      }), c ? r : undefined);
    }
    let S = {
      page_bytes: _,
      lane: "signed"
    };
    try {
      let E = () => _s.post("/api/frame/deploy/init", {
        ...bxl(h),
        ...Exl(),
        ...vxl(),
        ...Sxl(l),
        ...(f && {
          baseVersion: f
        })
      }, {
        host: "frame",
        auth: "required",
        refreshOAuth: true,
        headers: goCpHeaders(),
        timeout: 15000,
        validateStatus: () => true
      });
      let C = await E();
      if (C.ok && C.status === 503) {
        await sleep(2000);
        C = await E();
      }
      if (!C.ok) {
        Ae("artifact_publish", C.reason, S);
        return tK(C.reason === "no-auth" ? `not authenticated \u2014 run /login (${C.detail})` : `publish unavailable: ${C.reason}`);
      }
      if (m && C.status === 409) {
        let H = Cxl(C.data);
        if (H) {
          Ae("artifact_publish", "conflict", S);
          return {
            ...tK("conflict: another session published a newer version of this artifact. Re-read the current content (WebFetch the URL), reconcile your edits, then publish again."),
            liveVersion: H,
            conflict: true
          };
        }
      }
      if (C.status < 200 || C.status >= 300) {
        let H = Rxl(C.status, C.data, d);
        Ae("artifact_publish", H.code ?? "init_failed", {
          ...S,
          init_status: C.status,
          ...H.extra
        });
        return tK(H.msg ?? `init ${C.status}: ${PTt(C.data)}`);
      }
      let {
        slug: x,
        version: A,
        putURL: k,
        putHeaders: I,
        read: O,
        shared: M
      } = C.data ?? {};
      if (!x || !A || !k) {
        Ae("artifact_publish", "init_incomplete", S);
        return tK("init returned incomplete response");
      }
      let L = performance.now();
      let P = await hAm(k, y, 16777216, I);
      let F = Math.round(performance.now() - L);
      if (P) {
        let H = P.status === 0 || iAm.vZc(P.status);
        if (await gxl(x, A, false, u, {
          httpStatus: P.status,
          error: P.err,
          fallback: H
        }), H) {
          let U = await yxl(y, {
            ...h,
            slug: x
          }, l, f ? A : undefined, {
            t0: n,
            pageBytes: _,
            lane: "fallback_inline",
            isRedeploy: d,
            hasCaps: p
          });
          if (U.err === null) {
            Et("artifact_publish", P.intercepted ? "upload_intercepted_fallback" : P.status === 0 ? "upload_unreachable_fallback" : P.status === 403 ? "upload_blocked_fallback" : "upload_proxy_fallback", {
              ...S,
              put_ms: F,
              put_status: P.status
            });
            return gLo(Promise.resolve(U), c ? r : undefined);
          }
          let N = P.intercepted || P.status === 0 ? P.err : `blocked (${P.status})`;
          let W = U.conflict ? U : {
            ...U,
            err: `signed upload to storage.googleapis.com failed (${N}); inline fallback via api.anthropic.com also failed: ${U.err}`
          };
          return m ? {
            ...W,
            liveVersion: U.liveVersion ?? A
          } : W;
        }
        Ae("artifact_publish", P.precondition ? "upload_precondition" : "upload_failed", {
          ...S,
          put_ms: F,
          put_status: P.status
        });
        return m ? {
          ...tK(P.err),
          liveVersion: A
        } : tK(P.err);
      }
      await gxl(x, A, true, u);
      Pe("artifact_publish", {
        ...S,
        put_ms: F,
        e2e_ms: Math.round(performance.now() - n),
        is_redeploy: d,
        has_caps: p
      });
      return gLo(Promise.resolve({
        url: artifactViewerUrl(x),
        slug: x,
        version: A,
        err: null,
        ...(O !== undefined && {
          read: O
        }),
        ...(M !== undefined && {
          shared: M
        })
      }), c ? r : undefined);
    } catch (E) {
      Ae("artifact_publish", "request_error", S);
      return tK(E instanceof Error ? E.message : String(E));
    }
  }
  function fAm(e) {
    if (ITt.delete(e), ITt.add(e), ITt.size > 64) {
      let t = ITt.values().next().value;
      if (t !== undefined) {
        ITt.delete(t);
      }
    }
  }
  async function hAm(e, t, n, r) {
    let o = r && Object.keys(r).length > 0 ? r : {
      "Content-Type": "text/html; charset=utf-8",
      "x-goog-content-length-range": `0,${n}`,
      "Cache-Control": "public, max-age=31536000, immutable"
    };
    let s = ITt.vZc(e);
    let i;
    try {
      i = await externalHttp.put(e, t, {
        headers: o,
        validateStatus: () => true,
        timeout: 30000,
        maxBodyLength: n + 4096
      });
    } catch (a) {
      return {
        status: 0,
        err: a instanceof Error ? a.message : String(a),
        precondition: false
      };
    }
    if (fAm(e), i.status === 412) {
      if (s) {
        return null;
      }
      return {
        status: 412,
        err: "upload 412: this version was already written (create-only precondition). Re-run publish to mint a fresh version.",
        precondition: true
      };
    }
    if (typeof i.status !== "number" || i.status < 200 || i.status >= 300) {
      return {
        status: i.status,
        err: `upload ${i.status}: ${PTt(i.data)}`,
        precondition: false
      };
    }
    if (isFrameSignedPutHeaderCheckEnabled() && !i.headers?.["x-goog-generation"]) {
      return {
        status: 403,
        err: "upload intercepted: 2xx without x-goog-generation \u2014 a proxy answered in place of GCS",
        precondition: false,
        intercepted: true
      };
    }
    return null;
  }
  async function gxl(e, t, n, r, o) {
    try {
      let s = await _s.post("/api/frame/deploy/complete", {
        slug: e,
        version: t,
        ok: n,
        ...o,
        ...(isFramePublishContextEnabled() && r && {
          publish_context: r
        })
      }, {
        host: "frame",
        auth: "required",
        refreshOAuth: true,
        headers: goCpHeaders(),
        timeout: 15000,
        validateStatus: () => true
      });
      if (!s.ok) {
        logForDebugging(`[artifact] deploy/complete skipped: ${s.reason}`);
      } else if (s.status !== 204) {
        logForDebugging(`[artifact] deploy/complete ${s.status}: ${PTt(s.data)}`);
      }
    } catch (s) {
      logForDebugging(`[artifact] deploy/complete failed: ${s instanceof Error ? s.message : String(s)}`);
    }
  }
  function surfacedViaForEntrypoint() {
    if (NN() === "claude-vscode") {
      return "epitaxy_pane";
    }
    if (L6()) {
      return "desktop_pane";
    }
    return "terminal_link";
  }
  async function trackFrameEvent(e, t) {
    try {
      let n = await _s.post("/api/frame/track", {
        event_name: e,
        ...(t.slug && {
          slug: t.slug
        }),
        ...(t.via && {
          via: t.via
        }),
        ...(t.mode && {
          mode: t.mode
        })
      }, {
        host: "frame",
        auth: "required",
        refreshOAuth: true,
        headers: goCpHeaders(),
        timeout: 5000,
        validateStatus: () => true
      });
      if (!n.ok) {
        logForDebugging(`[artifact] /track skipped: ${n.reason}`);
      } else if (n.status !== 204) {
        logForDebugging(`[artifact] /track ${n.status}: ${PTt(n.data)}`);
      }
    } catch (n) {
      logForDebugging(`[artifact] /track failed: ${n instanceof Error ? n.message : String(n)}`);
    }
  }
  async function yxl(e, t, n, r, o) {
    let s = {
      page_bytes: o.pageBytes,
      lane: o.lane
    };
    try {
      let a = await (async () => {
        let p = () => _s.post("/api/frame/deploy/direct", {
          ...bxl(t),
          ...Exl(),
          ...vxl(),
          ...Sxl(n),
          ...(r && {
            baseVersion: r
          }),
          content: e
        }, {
          host: "frame",
          auth: "required",
          refreshOAuth: true,
          headers: goCpHeaders(),
          timeout: 60000,
          validateStatus: () => true,
          maxBodyLength: 2 * 16777216
        });
        let m = await p();
        if (m.ok && m.status === 429) {
          let f = _5n(m.response?.headers?.["retry-after"]) ?? 2000;
          await sleep(Math.min(f, 30000));
          m = await p();
        }
        return m;
      })();
      if (!a.ok) {
        Ae("artifact_publish", a.reason, s);
        return tK(a.reason === "no-auth" ? `not authenticated \u2014 run /login (${a.detail})` : `publish unavailable: ${a.reason}`);
      }
      if (r && a.status === 409) {
        let p = Cxl(a.data);
        if (p) {
          Ae("artifact_publish", "conflict", s);
          return {
            ...tK("conflict: another session published a newer version of this artifact. Re-read the current content (WebFetch the URL), reconcile your edits, then publish again."),
            liveVersion: p,
            conflict: true
          };
        }
      }
      if (a.status < 200 || a.status >= 300) {
        let p = Rxl(a.status, a.data, o.isRedeploy);
        Ae("artifact_publish", p.code ?? "deploy_failed", {
          ...s,
          deploy_status: a.status,
          ...p.extra
        });
        return tK(p.msg ?? `deploy ${a.status}: ${PTt(a.data)}`);
      }
      let {
        slug: l,
        version: c,
        read: u,
        shared: d
      } = a.data ?? {};
      if (!l || !c) {
        Ae("artifact_publish", "deploy_incomplete", s);
        return tK("deploy returned incomplete response");
      }
      Pe("artifact_publish", {
        ...s,
        e2e_ms: Math.round(performance.now() - o.t0),
        is_redeploy: o.isRedeploy,
        has_caps: o.hasCaps
      });
      return {
        url: artifactViewerUrl(l),
        slug: l,
        version: c,
        err: null,
        ...(u !== undefined && {
          read: u
        }),
        ...(d !== undefined && {
          shared: d
        })
      };
    } catch (i) {
      Ae("artifact_publish", "request_error", s);
      return tK(i instanceof Error ? i.message : String(i));
    }
  }
  function artifactViewerUrl(e) {
    return new URL(`/code/artifact/${e}`, getOauthConfig().CLAUDE_AI_ORIGIN).toString();
  }
  async function publishPlanArtifact(e) {
    let {
      html: t,
      title: n
    } = await fxl(e);
    return publishArtifact(t, {
      title: n,
      favicon: "\uD83D\uDCCB"
    });
  }
  function tK(e) {
    return {
      url: null,
      slug: null,
      version: null,
      err: e
    };
  }
  function Cxl(e) {
    if (e && typeof e === "object" && "conflict" in e && e.conflict === true && "live" in e && typeof e.live === "string") {
      return e.live;
    }
    return null;
  }
  function gAm(e) {
    if (e && typeof e === "object" && "error" in e && typeof e.error === "string" && "reason" in e && typeof e.reason === "string") {
      return {
        error: e.error,
        reason: e.reason
      };
    }
    return null;
  }
  function _Am(e) {
    let t = yAm.find(n => n === e);
    return t ? t : undefined;
  }
  function Rxl(e, t, n) {
    if (e === 403) {
      let r = gAm(t);
      if (r) {
        let o = _Am(r.reason);
        return {
          code: "publish_denied",
          ...(o && {
            extra: {
              deny_reason: o
            }
          }),
          msg: `publish denied: ${r.error}`
        };
      }
    }
    if (e === 404 && n) {
      return {
        code: "slug_gone",
        msg: "the artifact you're updating was deleted, or you no longer have write access to it"
      };
    }
    return {};
  }
  function PTt(e) {
    if (typeof e === "string") {
      return e.slice(0, 200);
    }
    if (e && typeof e === "object") {
      if ("error" in e && typeof e.error === "string") {
        let t = "reason" in e && typeof e.reason === "string" ? ` [${e.reason}]` : "";
        return (e.error + t).slice(0, 200);
      }
      return (De(e) ?? "").slice(0, 200);
    }
    return "";
  }
  var sAm;
  var iAm;
  var lAm;
  var pAm;
  var ITt;
  var yAm;
  var nwe = __lazy(() => {
    Ipe();
    Uc();
    ln();
    $n();
    pk();
    bg();
    je();
    $A();
    d_();
    oxl();
    hxl();
    sAm = new Set(["remote", "remote_cowork"]);
    iAm = new Set([403, 407, 451, 502, 503, 504, 511]);
    lAm = we(() => v.object({
      contract: v.string().max(64),
      capabilities: v.record(v.string().max(64), v.unknown()).nullish()
    }));
    pAm = /^(?:session_|cse_)[A-Za-z0-9_-]{1,184}$/;
    ITt = new Set();
    yAm = ["compliance_restricted", "org_mismatch", "org_toggle_disabled", "user_entitlement_denied", "write_gate_disabled"];
  });
  var kxl = {};
  __export(kxl, {
    readArtifactContent: () => readArtifactContent,
    liveChannelToken: () => liveChannelToken,
    getFrameShareStatus: () => getFrameShareStatus
  });
  function liveChannelToken(e) {
    if (!isFrameLiveSubscribeEnabled()) {
      return;
    }
    return e.subscriptionToken || e.wsToken || undefined;
  }
  async function xxl({
    slug: e,
    env: t
  }, n, r) {
    let o = getOauthConfig().CLAUDE_AI_ORIGIN.includes("staging") ? "staging" : "prod";
    if (t !== o) {
      Ae(n, "env_mismatch");
      return {
        err: `that artifact URL is for ${t} claude.ai, but this session targets ${o}`
      };
    }
    let s;
    try {
      s = await _s.get(`/api/frame/${e}?via=model_read`, {
        host: "frame",
        auth: "required",
        refreshOAuth: true,
        headers: goCpHeaders(),
        timeout: 15000,
        validateStatus: () => true,
        signal: r
      });
    } catch (c) {
      if (isCancel(c)) {
        throw c;
      }
      Ae(n, "boot_request_error");
      return {
        err: "artifact read failed (network error)"
      };
    }
    if (!s.ok) {
      Ae(n, s.reason);
      return {
        err: s.reason === "no-auth" ? `not authenticated \u2014 run /login (${s.detail})` : `artifact read unavailable: ${s.reason}`
      };
    }
    if (s.status === 404) {
      Ae(n, "boot_404");
      return {
        err: "artifact not found \u2014 it may have been deleted, or it has not been shared with you",
        status: 404
      };
    }
    if (s.status < 200 || s.status >= 300) {
      Ae(n, "boot_failed");
      return {
        err: `artifact read failed (HTTP ${s.status})`,
        status: s.status
      };
    }
    let i = s.data ?? {};
    let {
      ver: a,
      assetToken: l
    } = i;
    if (!a || !l) {
      Ae(n, "boot_incomplete");
      return {
        err: "artifact read failed: incomplete boot response"
      };
    }
    return {
      err: null,
      data: i,
      ver: a,
      assetToken: l
    };
  }
  async function getFrameShareStatus(e, t) {
    let n = await xxl(e, "artifact_share_status", t);
    if (n.err !== null) {
      return {
        err: n.err
      };
    }
    return {
      err: null,
      mode: n.data.perm?.mode,
      shared: n.data.shared
    };
  }
  async function readArtifactContent(e, t) {
    let n = await xxl(e, "artifact_webfetch_read", t);
    if (n.err !== null) {
      return n;
    }
    let {
      ver: r,
      assetToken: o
    } = n;
    let {
      title: s,
      perm: i
    } = n.data;
    let a = i?.role === "owner" ? "owner" : "reader";
    let l = `${e.slug}.frame.${e.env === "staging" ? "staging." : ""}claudeusercontent.com`;
    let c;
    try {
      c = await externalHttp.get(`https://${l}/_f/${r}/?__frame_t=${encodeURIComponent(o)}`, {
        signal: t,
        timeout: 30000,
        responseType: "arraybuffer",
        maxRedirects: 0,
        maxContentLength: 16777216 + 4096,
        validateStatus: () => true
      });
    } catch (p) {
      if (isCancel(p)) {
        throw p;
      }
      Ae("artifact_webfetch_read", "asset_request_error");
      return {
        err: "artifact content fetch failed (network error)"
      };
    }
    if (c.status === 403 && c.headers["x-proxy-error"] === "blocked-by-allowlist") {
      Ae("artifact_webfetch_read", "asset_egress_blocked");
      return {
        err: `the network egress proxy in this environment blocks ${l} \u2014 your access to the artifact itself is fine (the boot check passed)`,
        status: 403
      };
    }
    if (c.status < 200 || c.status >= 300) {
      Ae("artifact_webfetch_read", "asset_failed");
      return {
        err: `artifact content fetch failed (HTTP ${c.status})`,
        status: c.status
      };
    }
    let u = Buffer.from(c.data);
    Pe("artifact_webfetch_read");
    return {
      err: null,
      html: u.toString("utf-8").replace(`<base href="/_f/${r}/">`, ""),
      role: a,
      bytes: u.length,
      title: s ?? "",
      ver: r
    };
  }
  var CLo = __lazy(() => {
    Uc();
    ln();
    pk();
    bg();
    nwe();
  });
  function ker(e) {
    return Pxl.STATUS_CODES[e] ?? "Unknown Status";
  }
  function vAm(e) {
    let t = ker(e.statusCode);
    let n = e.retryAfter ? `
Retry-After: ${e.retryAfter}` : "";
    return `The server returned HTTP ${e.statusCode} ${t}.${n}

The response body was not retrieved. If this URL requires authentication, use an authenticated tool (e.g. \`gh\` for GitHub, or an MCP-provided fetch tool) instead of WebFetch.`;
  }
  function Ixl(e) {
    try {
      let t = s5.inputSchema.safeParse(e);
      if (!t.success) {
        return `input:${e.toString()}`;
      }
      let {
        url: n
      } = t.data;
      return `domain:${new URL(n).hostname}`;
    } catch {
      return `input:${e.toString()}`;
    }
  }
  function RLo(e) {
    return [{
      type: "addRules",
      destination: "localSettings",
      rules: [{
        toolName: "WebFetch",
        ruleContent: e
      }],
      behavior: "allow"
    }];
  }
  async function RAm(e, t) {
    {
      let [{
        ARTIFACT_TOOL_NAME: n,
        parseArtifactUrl: r
      }, {
        isArtifactToolEnabled: o
      }] = await Promise.all([Promise.resolve().then(() => (t1(), z2t)), Promise.resolve().then(() => (M1(), U2n))]);
      if (Cl(t.options.tools ?? [], n) && o()) {
        return r(e);
      }
    }
    return null;
  }
  var Pxl;
  var EAm;
  var wAm;
  var CAm;
  var s5;
  var Aer = __lazy(() => {
    Ot();
    Kc();
    ci();
    Sl();
    cs();
    oy();
    Zn();
    EX();
    PNo();
    Avl();
    lLo();
    Pxl = require("http");
    EAm = 50000 - 2000;
    wAm = we(() => v.strictObject({
      url: v.string().url().describe("The URL to fetch content from"),
      prompt: v.string().describe("The prompt to run on the fetched content")
    }));
    CAm = we(() => v.object({
      bytes: v.number().describe("Size of the fetched content in bytes"),
      code: v.number().describe("HTTP response code"),
      codeText: v.string().describe("HTTP response code text"),
      result: v.string().describe("Processed result from applying the prompt to the content"),
      durationMs: v.number().describe("Time taken to fetch and process the content"),
      url: v.string().describe("The URL that was fetched"),
      artifactRead: v.object({
        slug: v.string(),
        ver: v.string()
      }).optional()
    }));
    s5 = Xs({
      name: "WebFetch",
      ruleContentField: "url",
      searchHint: "fetch and extract content from a URL",
      maxResultSizeChars: 1e5,
      shouldDefer: true,
      async description(e) {
        let {
          url: t
        } = e;
        try {
          return `Claude wants to fetch content from ${new URL(t).hostname}`;
        } catch {
          return "Claude wants to fetch content from this URL";
        }
      },
      userFacingName() {
        return "Fetch";
      },
      getToolUseSummary: ONo,
      getActivityDescription(e) {
        let t = ONo(e);
        return t ? `Fetching ${t}` : "Fetching web page";
      },
      get inputSchema() {
        return wAm();
      },
      get outputSchema() {
        return CAm();
      },
      isEnabled() {
        return isPolicyAllowed("allow_web_fetch");
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.prompt ? `${e.url}: ${e.prompt}` : e.url;
      },
      async checkPermissions(e, t) {
        let n = getToolPermissionContext(t);
        let r = Ixl(e);
        let o = HBn(getRuleByContentsForTool(n, s5, "deny"), r);
        if (o) {
          return {
            behavior: "deny",
            message: `${s5.name} denied access to ${r}.`,
            decisionReason: {
              type: "rule",
              rule: o
            }
          };
        }
        let s = HBn(getRuleByContentsForTool(n, s5, "ask"), r);
        if (s) {
          return {
            behavior: "ask",
            message: `Claude requested permissions to use ${s5.name}, but you haven't granted it yet.`,
            decisionReason: {
              type: "rule",
              rule: s
            },
            suggestions: RLo(r)
          };
        }
        let i = HBn(getRuleByContentsForTool(n, s5, "allow"), r);
        if (i) {
          return {
            behavior: "allow",
            updatedInput: e,
            decisionReason: {
              type: "rule",
              rule: i
            }
          };
        }
        if (isPreapprovedUrl(e.url)) {
          return {
            behavior: "allow",
            updatedInput: e,
            decisionReason: {
              type: "other",
              reason: "Preapproved host"
            }
          };
        }
        return {
          behavior: "ask",
          message: `Claude requested permissions to use ${s5.name}, but you haven't granted it yet.`,
          suggestions: RLo(r)
        };
      },
      renderToolUseMessage: Rvl,
      renderToolUseProgressMessage: xvl,
      renderToolResultMessage: kvl,
      async validateInput(e) {
        let {
          url: t
        } = e;
        try {
          new URL(t);
        } catch {
          return {
            result: false,
            message: `Error: Invalid URL "${t}". The URL provided could not be parsed.`,
            meta: {
              reason: "invalid_url"
            },
            errorCode: 1
          };
        }
        return {
          result: true
        };
      },
      async prompt({
        model: e,
        tools: t
      }) {
        let n = false;
        {
          let [{
            ARTIFACT_TOOL_NAME: r
          }, {
            isArtifactToolEnabled: o
          }] = await Promise.all([Promise.resolve().then(() => (t1(), z2t)), Promise.resolve().then(() => (M1(), U2n))]);
          n = !!Cl(t ?? [], r) && o();
        }
        return Zca(e, n);
      },
      async call(e, t, n, r) {
        let {
          url: o,
          prompt: s
        } = e;
        let {
          abortController: i,
          options: {
            isNonInteractiveSession: a
          }
        } = t;
        let l = Date.now();
        {
          let S = o;
          try {
            let C = new URL(o);
            if (C.protocol === "http:") {
              C.protocol = "https:";
            }
            S = C.href;
          } catch {}
          let E = await RAm(S, t);
          if (E) {
            let {
              readArtifactContent: C
            } = await Promise.resolve().then(() => (CLo(), kxl));
            let x = await C(E, i.signal);
            if (x.err !== null) {
              if (x.status === undefined) {
                throw new WebFetchTransportError(`Artifact ${E.slug}: ${x.err}`);
              }
              return {
                data: {
                  bytes: 0,
                  code: x.status,
                  codeText: ker(x.status),
                  result: `Artifact ${E.slug}: ${x.err}`,
                  durationMs: Date.now() - l,
                  url: o
                }
              };
            }
            let A;
            if (x.role === "owner") {
              let O = pC(x.title, 200);
              let M = `[Artifact ${E.slug}${O ? ` "${O}"` : ""} \u2014 owned by you`;
              let L;
              let P;
              if (x.html.length > EAm) {
                let {
                  persistBinaryContent: F
                } = await Promise.resolve().then(() => (eht(), $So));
                let H = N => N.replace(/[^\w-]/g, "");
                let U = await F(Buffer.from(x.html), "text/html", `artifact-${H(E.slug).slice(0, 8)}-${H(x.ver)}`);
                if ("error" in U) {
                  L = `${formatFileSize(x.bytes)} total \u2014 saving the full HTML to disk failed; raw HTML (may be truncated) follows`;
                  P = pC(x.html, 1e5);
                } else {
                  L = `${formatFileSize(x.bytes)} total \u2014 full HTML saved to ${U.filepath}; head follows`;
                  let N = M.length + L.length + 4;
                  P = pC(x.html, Math.max(0, 50000 - N));
                }
              } else {
                L = "raw HTML follows";
                P = x.html;
              }
              A = `${M}; ${L}]
${P}`;
            } else {
              let {
                isFrameReaderPersistEnabled: O
              } = await Promise.resolve().then(() => (nwe(), vLo));
              if (O()) {
                let M = U => U.replace(/[^\w-]/g, "");
                let L = `artifact-${M(E.slug).slice(0, 8)}-${M(x.ver)}`;
                let [P, F] = await Promise.all([Promise.resolve().then(() => (eht(), $So)).then(U => U.persistBinaryContent(Buffer.from(x.html), "text/html", L)), convertHtmlToMarkdown(x.html).then(U => applyPromptToMarkdown(s, U, i.signal, a, false, t.agentContext))]);
                let H = "error" in P ? "saving the raw HTML to disk failed" : `raw HTML saved to ${P.filepath}`;
                A = `[Artifact ${E.slug} \u2014 shared with you; summary below, ${H}]
${F}`;
              } else {
                A = await applyPromptToMarkdown(s, await convertHtmlToMarkdown(x.html), i.signal, a, false, t.agentContext);
              }
            }
            let k;
            if (x.role === "owner") {
              let {
                isFrameBaseVersionEnabled: O
              } = await Promise.resolve().then(() => (nwe(), vLo));
              if (O()) {
                t.setArtifactReadVersion(E.slug, x.ver);
                k = {
                  slug: E.slug,
                  ver: x.ver
                };
              }
            }
            return {
              data: {
                bytes: x.bytes,
                code: 200,
                codeText: "OK",
                result: A,
                durationMs: Date.now() - l,
                url: o,
                ...(k && {
                  artifactRead: k
                })
              }
            };
          }
        }
        let c = await getURLMarkdownContent(o, i);
        if ("type" in c && c.type === "provenance_denied") {
          if (!n || !r) {
            throw nYt(c.errorMessage);
          }
          let S = c.url;
          c = await Cvl({
            denial: c,
            prompt: s,
            tool: s5,
            context: t,
            canUseTool: n,
            parentMessage: r,
            suggestions: RLo(Ixl({
              url: S,
              prompt: s
            })),
            refetch: E => getURLMarkdownContent(E, i),
            onOutcome: E => {
              logEvent("tengu_web_fetch_provenance_prompt", {
                outcome: E
              });
            }
          });
        }
        if ("type" in c && c.type === "http_error") {
          logEvent("tengu_web_fetch_http_error", {
            statusCode: c.statusCode
          });
          let S = vAm(c);
          return {
            data: {
              bytes: 0,
              code: c.statusCode,
              codeText: ker(c.statusCode),
              result: S,
              durationMs: Date.now() - l,
              url: o
            }
          };
        }
        if ("type" in c && c.type === "redirect") {
          let S = ker(c.statusCode);
          let E = `REDIRECT DETECTED: The URL redirects to a different host.

Original URL: ${c.originalUrl}
Redirect URL: ${c.redirectUrl}
Status: ${c.statusCode} ${S}

To complete your request, I need to fetch content from the redirected URL. Please use WebFetch again with these parameters:
- url: "${c.redirectUrl}"
- prompt: "${s}"`;
          return {
            data: {
              bytes: Buffer.byteLength(E),
              code: c.statusCode,
              codeText: S,
              result: E,
              durationMs: Date.now() - l,
              url: o
            }
          };
        }
        let {
          content: u,
          bytes: d,
          code: p,
          codeText: m,
          contentType: f,
          persistedPath: h,
          persistedSize: g
        } = c;
        let y = isPreapprovedUrl(o);
        let _;
        if (y && f.includes("text/markdown") && u.length < 1e5) {
          _ = u;
        } else {
          _ = await applyPromptToMarkdown(s, u, i.signal, a, y, t.agentContext);
        }
        if (h) {
          _ += `

[Binary content (${f}, ${formatFileSize(g ?? d)}) also saved to ${h}]`;
        }
        return {
          data: {
            bytes: d,
            code: p,
            codeText: m,
            result: _,
            durationMs: Date.now() - l,
            url: o
          }
        };
      },
      mapToolResultToToolResultBlockParam({
        result: e
      }, t) {
        return {
          tool_use_id: t,
          type: "tool_result",
          content: e
        };
      }
    });
  });
  async function xLo(e) {
    logEvent("tengu_unary_event", {
      event: e.event,
      completion_type: e.completion_type,
      language_name: await e.metadata.language_name,
      message_id: br(e.metadata.message_id),
      platform: L8(e.metadata.platform),
      ...(e.metadata.hasFeedback !== undefined && {
        hasFeedback: e.metadata.hasFeedback
      })
    });
  }
  var Oxl = __lazy(() => {
    Ot();
    Gu();
    B_();
  });
  function Dxl(e, t, n, r) {
    let o = r === "single";
    let s = xMe({
      filePath: e,
      oldContent: t,
      newContent: n,
      singleHunk: o
    });
    if (s.length === 0) {
      return [];
    }
    if (o && s.length > 1) {
      Oe(Error(`Unexpected number of hunks: ${s.length}. Expected 1 hunk.`));
    }
    return HOa(s);
  }
  async function Mxl(e, t, n, r) {
    let o = false;
    let s = us(e);
    let i = "";
    try {
      i = LP(s);
    } catch (c) {
      if (!fn(c) && !ZHe(c)) {
        throw c;
      }
    }
    async function a() {
      if (o) {
        return;
      }
      o = true;
      try {
        await kLo(r, l);
      } catch (c) {
        logForDebugging(`Failed to close diff tab in IDE: ${c instanceof Error ? c.message : String(c)}`, {
          level: "error"
        });
      }
      process.off("beforeExit", a);
      n.abortController.signal.removeEventListener("abort", a);
    }
    n.abortController.signal.addEventListener("abort", a);
    process.on("beforeExit", a);
    let l = p9(n.options.mcpClients);
    try {
      let {
        updatedFile: c
      } = Wgo({
        filePath: s,
        fileContents: i,
        edits: t
      });
      if (!l || l.type !== "connected") {
        throw Error("IDE client not available");
      }
      let u = s;
      let d = l.config.ideRunningInWindows === true;
      if (Wt() === "wsl" && d && process.env.WSL_DISTRO_NAME) {
        u = await new WPe(process.env.WSL_DISTRO_NAME).toIDEPath(s);
      }
      let p = await Uoe("openDiff", {
        old_file_path: u,
        new_file_path: u,
        new_file_contents: c,
        tab_name: r
      }, l);
      let m = Array.isArray(p) ? p : [p];
      if (AAm(m)) {
        a();
        return {
          oldContent: i,
          newContent: m[1].text
        };
      } else if (xAm(m)) {
        a();
        return {
          oldContent: i,
          newContent: c
        };
      } else if (kAm(m)) {
        a();
        return {
          oldContent: i,
          newContent: i
        };
      }
      throw Error("Not accepted");
    } catch (c) {
      throw logForDebugging(`Failed to show diff in IDE: ${c instanceof Error ? c.message : String(c)}`, {
        level: "error"
      }), a(), c;
    }
  }
  async function kLo(e, t) {
    try {
      if (!t || t.type !== "connected") {
        throw Error("IDE client not available");
      }
      await Uoe("close_tab", {
        tab_name: e
      }, t);
      Pe("ide_close_diff_tab");
    } catch (n) {
      logForDebugging(`Failed to close diff tab in IDE: ${n instanceof Error ? n.message : String(n)}`, {
        level: "error"
      });
      Et("ide_close_diff_tab", "ide_close_diff_tab_failed");
    }
  }
  function xAm(e) {
    return Array.isArray(e) && typeof e[0] === "object" && e[0] !== null && "type" in e[0] && e[0].type === "text" && "text" in e[0] && e[0].text === "TAB_CLOSED";
  }
  function kAm(e) {
    return Array.isArray(e) && typeof e[0] === "object" && e[0] !== null && "type" in e[0] && e[0].type === "text" && "text" in e[0] && e[0].text === "DIFF_REJECTED";
  }
  function AAm(e) {
    return Array.isArray(e) && e[0]?.type === "text" && e[0].text === "FILE_SAVED" && typeof e[1].text === "string";
  }
  var Ier;
  var Nxl = __lazy(() => {
    Ot();
    Gu();
    KB();
    ku();
    ln();
    IMe();
    je();
    Qde();
    dt();
    bT();
    oLn();
    Rn();
    Cs();
    Ier = __toESM(ot(), 1);
  });
  function IAm(e, t) {
    if (e === iR) {
      let n = iR.inputSchema.parse(t);
      return {
        filePath: n.file_path,
        edits: [{
          old_string: n.old_string,
          new_string: n.new_string,
          replace_all: n.replace_all || false
        }]
      };
    }
    if (e === Nw) {
      let n = Nw.inputSchema.parse(t);
      let r = us(n.file_path);
      let o = "";
      if ((!(Rc(n.file_path) || Rc(r)) || Pp(n.file_path) || Pp(r)) && !zS(n.file_path) && !zS(r)) {
        try {
          o = LP(n.file_path);
        } catch (s) {
          if (!fn(s) && !ZHe(s)) {
            throw s;
          }
        }
      }
      return {
        filePath: n.file_path,
        edits: [{
          old_string: o,
          new_string: n.content,
          replace_all: false
        }]
      };
    }
    return null;
  }
  function PAm(e, t, n) {
    let r = n[0];
    if (!r) {
      return t;
    }
    if (e === iR) {
      return {
        ...t,
        old_string: r.old_string,
        new_string: r.new_string,
        replace_all: r.replace_all || false
      };
    }
    if (e === Nw) {
      return {
        ...t,
        content: r.new_string
      };
    }
    return t;
  }
  function Uxl(e, t, n) {
    if (e !== iR && e !== Nw) {
      return null;
    }
    let r = n.options.mcpClients;
    if (!B6e(r)) {
      return null;
    }
    if (getGlobalConfig().diffTool !== "auto") {
      return null;
    }
    let o = IAm(e, t);
    if (o === null) {
      return null;
    }
    let s = us(o.filePath);
    if ((Rc(o.filePath) || Rc(s)) && !(Pp(o.filePath) || Pp(s)) || zS(o.filePath) || zS(s)) {
      return null;
    }
    if (o.filePath.endsWith(".ipynb")) {
      return null;
    }
    let i = p9(r);
    if (!i) {
      return null;
    }
    return {
      ideName: g5t(r) ?? "IDE",
      ideClient: i,
      filePath: o.filePath,
      edits: o.edits
    };
  }
  function Bxl(e) {
    let {
      ctx: t,
      tool: n,
      input: r,
      permissionResult: o,
      permissionPromptStartTimeMs: s,
      eligibility: i,
      claim: a,
      notifyBridge: l,
      dismissAndTeardown: c,
      resolveOnce: u
    } = e;
    let {
      filePath: d,
      edits: p,
      ideName: m,
      ideClient: f
    } = i;
    let h = Lxl.randomUUID().slice(0, 6);
    let g = `\u273B [Claude Code] ${Fxl.basename(d)} (${h}) \u29C9`;
    let y = false;
    function _() {
      if (y) {
        return;
      }
      y = true;
      kLo(g, f).catch(S => {
        logForDebugging(`closeTabInIDE failed: ${S}`, {
          level: "error"
        });
      });
    }
    let b = {
      ideName: m,
      toolName: qi(n.name),
      editCount: p.length
    };
    logEvent("tengu_ext_will_show_diff", {});
    Mxl(d, p, t.toolUseContext, g).then(({
      oldContent: S,
      newContent: E
    }) => {
      let C = Dxl(d, S, E, "single");
      let A = {
        ...b,
        isNewFile: S === ""
      };
      if (C.length === 0) {
        if (!a()) {
          return;
        }
        _();
        logEvent("tengu_ext_diff_rejected", A);
        Pe("ide_diff_view");
        l({
          behavior: "deny",
          message: "User denied via IDE"
        });
        c();
        t.logDecision({
          decision: "reject",
          source: {
            type: "user_reject",
            hasFeedback: false
          }
        }, {
          permissionPromptStartTimeMs: s
        });
        u(t.cancelAndAbort(undefined));
        return;
      }
      if (!a()) {
        return;
      }
      _();
      let k = PAm(n, r, C);
      logEvent("tengu_ext_diff_accepted", A);
      Pe("ide_diff_view");
      l({
        behavior: "allow",
        updatedInput: k,
        updatedPermissions: []
      });
      c();
      t.logDecision({
        decision: "accept",
        source: {
          type: "user",
          permanent: false
        }
      }, {
        permissionPromptStartTimeMs: s
      });
      u(t.handleUserAllow(k, [], undefined, s, undefined, o.decisionReason));
    }).catch(S => {
      if (t.toolUseContext.abortController.signal.aborted) {
        return;
      }
      logForDebugging(`IDE diff view failed: ${S instanceof Error ? S.message : String(S)}`, {
        level: "error"
      });
      Et("ide_diff_view", "ide_diff_view_failed");
    });
    return {
      closeTab: _
    };
  }
  var Lxl;
  var Fxl;
  var $xl = __lazy(() => {
    Nxl();
    ln();
    Ot();
    Gu();
    v8e();
    DEe();
    mm();
    je();
    dt();
    KB();
    bT();
    ku();
    Lxl = require("crypto");
    Fxl = require("path");
  });
  function Per({
    feedback: e,
    contentBlocks: t,
    isSubagent: n
  }) {
    return !e && !t?.length && !n;
  }
  function isDangerousBashPermission(e, t) {
    if (e !== "Bash") {
      return false;
    }
    if (t === undefined || t === "") {
      return true;
    }
    if (/^[\s*]+$/.test(t)) {
      return true;
    }
    return IYt(t, d9a);
  }
  function IYt(e, t) {
    let n = e.trim().toLowerCase();
    if (n === "*") {
      return true;
    }
    for (let r of t) {
      let o = r.toLowerCase();
      if (n === o) {
        return true;
      }
      if (n === `${o}:*` || n === `${o} *`) {
        return true;
      }
      if (n === `${o}*`) {
        return true;
      }
      if (n.startsWith(`${o} `) && n.endsWith("*")) {
        let s = n.slice(o.length + 1);
        if (c9a.vZc(o)) {
          if (/[$`]/.test(s)) {
            return true;
          }
          let i = u9a[o];
          if (i === "all") {
            return true;
          }
          let a = s.replace(/[\s:*]+$/, "").split(/\s+/).filter(Boolean);
          let l = 0;
          for (; l < a.length; l++) {
            let u = a[l];
            if (!u.startsWith("-")) {
              break;
            }
            if (!u.includes("=") && l + 1 < a.length && !a[l + 1].startsWith("-")) {
              l++;
            }
          }
          let c = a[l];
          if (c === undefined) {
            if ((o === "curl" || o === "wget") && a.some(u => u.includes("://"))) {
              continue;
            }
            return true;
          }
          if (i?.vZc(c)) {
            return true;
          }
          continue;
        }
        if (s.startsWith("-")) {
          let i = s.slice(0, -1);
          if (!(/^python[\d.]*$/.test(o) && /^-m\s+\w+\.[\w.]+(\s*:|\s+)$/.test(i))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  function isDangerousPowerShellPermission(e, t) {
    if (e !== "PowerShell") {
      return false;
    }
    if (t === undefined || t === "") {
      return true;
    }
    if (/^[\s*]+$/.test(t)) {
      return true;
    }
    let n = t.trim().toLowerCase();
    if (n === "*") {
      return true;
    }
    let r = [...u6t, "pwsh", "powershell", "cmd", "wsl", "iex", "invoke-expression", "icm", "invoke-command", "start-process", "saps", "start", "start-job", "sajb", "start-threadjob", "invoke-wmimethod", "iwmi", "invoke-cimmethod", "icim", "wmic", "register-objectevent", "register-engineevent", "register-wmievent", "register-scheduledjob", "new-pssession", "nsn", "enter-pssession", "etsn", "add-type", "new-object"];
    for (let o of r) {
      if (n === o) {
        return true;
      }
      if (n === `${o}:*`) {
        return true;
      }
      if (n === `${o}*`) {
        return true;
      }
      if (n === `${o} *`) {
        return true;
      }
      if (n.startsWith(`${o} -`) && n.endsWith("*")) {
        return true;
      }
      let s = o.indexOf(" ");
      let i = s === -1 ? `${o}.exe` : `${o.slice(0, s)}.exe${o.slice(s)}`;
      if (n === i) {
        return true;
      }
      if (n === `${i}:*`) {
        return true;
      }
      if (n === `${i}*`) {
        return true;
      }
      if (n === `${i} *`) {
        return true;
      }
      if (n.startsWith(`${i} -`) && n.endsWith("*")) {
        return true;
      }
    }
    return false;
  }
  function isDangerousTaskPermission(e, t) {
    return jD(e) === "Agent";
  }
  function ILo() {
    return isAutoModeClassifyAllShellEnabled();
  }
  function isDangerousClassifierPermission(e, t) {
    if ((e === "Bash" || e === "PowerShell") && ILo()) {
      return true;
    }
    let n = `${e}\x00${t ?? ""}`;
    let r = Hxl.get(n);
    if (r !== undefined) {
      return r;
    }
    let o = isDangerousBashPermission(e, t) || isDangerousPowerShellPermission(e, t) || isDangerousTaskPermission(e, t);
    Hxl.set(n, o);
    return o;
  }
  var Hxl;
  var Oer = __lazy(() => {
    Sh();
    N9n();
    EC();
    Hxl = new Map();
  });
  function PLo(e) {
    if (e === "Bash") {
      return "Bash";
    }
    if (e === "PowerShell") {
      return "PowerShell";
    }
    return null;
  }
  function jxl(e, t) {
    let n = PLo(e);
    if (n === null) {
      return null;
    }
    if (t === undefined || t === "" || /^[\s*]+$/.test(t)) {
      return "bare";
    }
    return (n === "Bash" ? isDangerousBashPermission(n, t) : isDangerousPowerShellPermission(n, t)) ? "dangerous_prefix" : "scoped";
  }
  function DAm(e) {
    let t = {};
    let n = 0;
    for (let r of OAm) {
      for (let o of e[r] ?? []) {
        let {
          toolName: s,
          ruleContent: i
        } = Nh(o);
        let a = PLo(s);
        if (a === null) {
          continue;
        }
        let l = jxl(a, i);
        if (l === null) {
          continue;
        }
        let c = `${r}_${a}_${l}`;
        t[c] = (t[c] ?? 0) + 1;
        n++;
      }
    }
    t.total_shell_allow_rules = n;
    return t;
  }
  function qxl(e) {
    logEvent("tengu_shell_allow_rules_at_init", DAm(e));
  }
  function Der(e) {
    for (let t of e) {
      if (t.type !== "addRules" || t.behavior !== "allow") {
        continue;
      }
      for (let n of t.rules) {
        let r = PLo(n.toolName);
        if (r === null) {
          continue;
        }
        let o = jxl(n.toolName, n.ruleContent);
        if (o === null) {
          continue;
        }
        logEvent("tengu_shell_allow_rule_added", {
          toolName: r,
          category: o,
          destination: t.destination
        });
      }
    }
  }
  var OAm;
  var Mer = __lazy(() => {
    Ot();
    Oer();
    EC();
    OAm = ["userSettings", "projectSettings", "localSettings", "flagSettings", "cliArg", "session"];
  });
  function UAm(e) {
    return FAm.vZc(e);
  }
  function mf(e, t) {
    if (e.length <= t) {
      return e;
    }
    let n = t - 1;
    if (BAm(e.charCodeAt(n - 1))) {
      n--;
    }
    return e.slice(0, n) + "\u2026";
  }
  function BAm(e) {
    return e >= 55296 && e <= 56319;
  }
  function WLe(e, t) {
    let n = null;
    let r = 0;
    let o = 0;
    while (o < t) {
      let s = e.indexOf("```", o);
      let i = e.indexOf("~~~", o);
      let a = s === -1 ? i : i === -1 ? s : Math.min(s, i);
      if (a === -1 || a >= t) {
        break;
      }
      let l = e[a];
      let c = a - 1;
      let u = 0;
      while (c >= 0 && e[c] === " " && u < 3) {
        c--;
        u++;
      }
      let d = c < 0 || e[c] === `
`;
      let p = 3;
      o = a + 3;
      while (e[o] === l) {
        o++;
        p++;
      }
      if (!d) {
        continue;
      }
      if (n === null) {
        n = l;
        r = p;
      } else if (n === l && p >= r) {
        n = null;
        r = 0;
      }
    }
    return n !== null;
  }
  function Gxl(e, t = "") {
    switch (e) {
      case "authentication_failed":
        return {
          state: "blocked",
          needs: "login required \u2014 run /login"
        };
      case "oauth_org_not_allowed":
        return {
          state: "blocked",
          needs: "org disabled OAuth \u2014 use API key or ask admin"
        };
      case "billing_error":
        return {
          state: "blocked",
          needs: "usage limit reached \u2014 check plan"
        };
      case "rate_limit":
        return {
          state: "blocked",
          needs: "rate limited \u2014 wait and retry"
        };
      case "overloaded":
        return {
          state: "blocked",
          needs: "API overloaded \u2014 wait and retry"
        };
      case "server_error":
        return {
          state: "blocked",
          needs: "API unavailable \u2014 retry"
        };
      case "invalid_request":
        return /\b(too long|too large|exceeds|token limit|prompt is too long)\b/i.test(t) ? {
          state: "blocked",
          needs: "request too large \u2014 /compact or trim"
        } : {
          state: "blocked",
          needs: "invalid API request \u2014 see detail"
        };
      case "max_output_tokens":
        return null;
      case undefined:
        return {
          state: "blocked",
          needs: "API error \u2014 see detail"
        };
      case "unknown":
      default:
        return {
          state: "failed",
          needs: "API error"
        };
    }
  }
  function WAm(e, t, n) {
    let r;
    for (let [o, s] of [["failed", $Am], ["blocked", HAm], ["blocked", jAm], ["blocked", qAm]]) {
      for (let i of t.matchAll(s)) {
        if (WLe(e, n + i.index)) {
          continue;
        }
        if (!r || i.index > r.index) {
          r = {
            state: o,
            capture: i[1].trim(),
            index: i.index,
            end: i.index + i[0].length
          };
        }
      }
    }
    return r;
  }
  function Vxl(e) {
    let t = e.trim();
    if (!t) {
      return "empty";
    }
    if (WLe(t, t.length)) {
      return "code-fence";
    }
    let n = t.slice(-800);
    let r = t.length - n.length;
    for (let s of n.matchAll(/(?:^|\n)\s*result:\s*\S/gi)) {
      if (!WLe(t, r + s.index)) {
        return "result-line";
      }
    }
    for (let s of n.matchAll(/(?:^|\n)\s*failed:\s*\S/gi)) {
      if (!WLe(t, r + s.index)) {
        return "failed-line";
      }
    }
    if (/[?\uFF1F]\s*$/.test(t)) {
      return "trailing-q";
    }
    let o = t.slice(-200);
    if (/(?:^|\n)\s*(?:[-*\u2022]|\d+\.|[|])\s/.test(o)) {
      return "list-or-table";
    }
    return "declarative";
  }
  function zxl(e) {
    let t = e.trim();
    if (!t) {
      return null;
    }
    let n = t.slice(-800);
    let r;
    for (let m of n.matchAll(/(?:^|\n)\s*result:\s*(.+?)\s*(?:\n|$)/gi)) {
      if (!WLe(t, t.length - n.length + m.index)) {
        r = m;
      }
    }
    let o = n;
    let s = t.length - n.length;
    if (r) {
      let m = r.index + r[0].length;
      o = n.slice(m);
      s = t.length - n.length + m;
    }
    let i = WAm(t, o, s);
    if (r && !i) {
      let m = mf(r[1], 800);
      if ([...o.matchAll(/(?:^|\n)\s*next:\s*\S/gi)].some(h => !WLe(t, s + h.index))) {
        return {
          branch: "result-then-next",
          state: "working",
          tempo: "idle",
          detail: m,
          output: {
            result: m
          }
        };
      }
      return {
        branch: "result-marker",
        state: "done",
        tempo: "idle",
        detail: m,
        output: {
          result: m
        }
      };
    }
    if (i?.state === "failed") {
      return {
        branch: "failed-marker",
        state: "failed",
        tempo: "idle",
        detail: mf(i.capture, 800),
        output: {}
      };
    }
    if (i?.state === "blocked") {
      let m = o.slice(i.end);
      if (Bn(m.split(/\n\s*\n/), f => f.trim().length > 0) >= 3) {
        return null;
      }
      if (!/\bnothing (?:needed|required) from you\b|\bno(?: user)? action (?:needed|required)\b/i.test(o)) {
        let f = mf(i.capture, 800);
        return {
          branch: "blocked-marker",
          state: "blocked",
          tempo: "blocked",
          needs: f,
          detail: f
        };
      }
      if (r) {
        let f = mf(r[1], 800);
        return {
          branch: "blocked-disclaimed",
          state: "done",
          tempo: "idle",
          detail: f,
          output: {
            result: f
          }
        };
      }
      return null;
    }
    if (/[?\uFF1F]\s*$/.test(n) && n.replace(/[?\uFF1F\s]+$/, "").length >= 4) {
      let m = Math.max(n.lastIndexOf(`
`), n.lastIndexOf(". "), n.lastIndexOf("! "), n.lastIndexOf("? ", n.length - 2));
      if (!WLe(t, t.length - n.length + m)) {
        let f = mf(n.slice(m + 1).trim(), 800);
        if (GAm.test(f)) {
          return null;
        }
        return {
          branch: "trailing-q",
          state: "blocked",
          tempo: "blocked",
          needs: f,
          detail: f
        };
      }
    }
    let a = Math.max(0, n.lastIndexOf(". "), n.lastIndexOf("! "), n.lastIndexOf("? "), n.lastIndexOf(`
`));
    let l = n.slice(a).replace(/^[.!?\s]+/, "");
    let c = WLe(t, t.length - n.length + a);
    let u = /\b(?:waiting (?:for|on)|pending)\s+(?:the\s+)?(?:CI|build|tests?|reviewer|deploy(?:ment)?|workflow|checks?|rollout|merge queue)\b/i.exec(l);
    if (u && !c) {
      return {
        branch: "wait-external",
        state: "working",
        tempo: "idle",
        detail: mf(u[0], 800),
        output: {}
      };
    }
    let d = /\b(?:awaiting|waiting (?:for|on)|pending)\s+(?:your\s+(?:feedback|input|decision|response|approval|direction|guidance|go-ahead)|you\b|the user\b)/i.exec(l);
    if (d && !c) {
      let m = mf(l.slice(d.index).trim(), 800);
      return {
        branch: "awaiting-user",
        state: "blocked",
        tempo: "blocked",
        needs: m,
        detail: m
      };
    }
    let p = /\b(please (?:run|provide|confirm|clarify|choose|let me know)|let me know (?:which|what|how|when)|which (?:option|approach|one)|should I (?:proceed|continue|use))\b/i.exec(l);
    if (p && !c) {
      let m = mf(l.slice(p.index).trim(), 800);
      return {
        branch: "ask-verb",
        state: "blocked",
        tempo: "blocked",
        needs: m,
        detail: m
      };
    }
    if (!c && /\b(not logged in|please run \/login|authentication failed|invalid api key|oauth token (?:expired|revoked)|credit balance (?:is )?too low|usage limit reached|mcp (?:server )?(?:authentication|auth|authorization|unauthorized)|mcp (?:server )?(?:credential|token) (?:missing|expired|invalid)|401 unauthorized|403 forbidden|token (?:has )?expired|bad credentials|gh auth login|gcloud auth login|aws (?:sso )?login)\b/i.test(l)) {
      return {
        branch: "auth-prose",
        state: "blocked",
        tempo: "blocked",
        needs: mf(l, 800),
        detail: "authentication required"
      };
    }
    if (!c && VAm.test(l) && !zAm.test(l)) {
      return {
        branch: "working-verb",
        state: "working",
        tempo: "active",
        detail: mf(l, 800),
        output: {}
      };
    }
    if (!c && KAm.test(l)) {
      return {
        branch: "agents-status",
        state: "working",
        tempo: "idle",
        detail: mf(l, 800)
      };
    }
    if (!c && YAm.test(l)) {
      return {
        branch: "will-check-back",
        state: "working",
        tempo: "idle",
        detail: mf(l, 800)
      };
    }
    if (!c && JAm.test(l)) {
      let m = mf(l, 800);
      return {
        branch: "cant-proceed",
        state: "blocked",
        tempo: "blocked",
        detail: m,
        needs: m
      };
    }
    if (!c && XAm.test(l)) {
      return {
        branch: "giving-up",
        state: "failed",
        tempo: "idle",
        detail: mf(l, 800)
      };
    }
    if (!c && QAm.test(l)) {
      let m = mf(l, 800);
      return {
        branch: "pushed-committed",
        state: "done",
        tempo: "idle",
        detail: m,
        output: {
          result: m
        }
      };
    }
    if (!c && ZAm.test(l)) {
      return {
        branch: "ready-for",
        state: "done",
        tempo: "idle",
        detail: mf(l, 800)
      };
    }
    if (!c && e0m.test(l)) {
      let m = mf(l, 800);
      return {
        branch: "verdict-marker",
        state: "done",
        tempo: "idle",
        detail: m,
        output: {
          result: m
        }
      };
    }
    if (!c && t0m.test(l)) {
      let m = mf(l, 800);
      return {
        branch: "please-do-x",
        state: "blocked",
        tempo: "blocked",
        detail: m,
        needs: m
      };
    }
    if (!c && n0m.test(l)) {
      let m = mf(l, 800);
      return {
        branch: "stopping-here",
        state: "blocked",
        tempo: "blocked",
        detail: m,
        needs: m
      };
    }
    return null;
  }
  function OLo(e) {
    let t = e.split(`
`).map(n => n.trim()).findLast(Boolean);
    return {
      branch: "heuristic",
      state: "working",
      tempo: "idle",
      detail: t ? mf(t, 800) : "\u2014"
    };
  }
  function Yxl(e) {
    let {
      tail: t,
      prev: n,
      latestAsk: r,
      toolSummary: o,
      minsInState: s
    } = e;
    return `Current state: ${n} (for ${s}m)
Tool calls so far: ${o || "none"}${r ? `
User's most recent ask: "${r}"` : ""}

Assistant message tail (last ${t.length} chars):
${t}`;
  }
  function Jxl(e) {
    let t = e.replace(/^```(?:json)?\s*/i, "").replace(/\s*```\s*$/, "");
    let n = t.indexOf("{");
    let r = t.lastIndexOf("}");
    if (n < 0 || r < 0) {
      return null;
    }
    let o;
    try {
      o = qt(t.slice(n, r + 1));
    } catch {
      return null;
    }
    let s = MAm().safeParse(o);
    return s.success ? s.data : null;
  }
  function OYt(e) {
    return typeof e === "string" && e ? e : undefined;
  }
  function DYt(e, t, n) {
    let r = OYt(e.state);
    let o = r && Object.hasOwn(NAm, r) ? r : n?.state ?? t;
    let s = OYt(e.tempo);
    let i = UAm(o) ? "idle" : s === "active" || s === "idle" || s === "blocked" ? s : n?.tempo ?? "active";
    let a = {};
    let l = e.output ?? n?.output;
    if (l && typeof l === "object") {
      for (let [u, d] of Object.entries(l)) {
        let p = OYt(d);
        if (p && Object.hasOwn(LAm, u)) {
          a[u] = mf(p, 800);
        }
      }
    }
    let c = OYt(e.needs) ?? (i === "blocked" ? n?.needs : undefined);
    return {
      state: o,
      detail: OYt(e.detail) ?? n?.detail ?? "",
      tempo: i,
      needs: c,
      output: a,
      branch: n?.branch
    };
  }
  var MAm;
  var NAm;
  var LAm;
  var FAm;
  var $Am;
  var HAm;
  var jAm;
  var qAm;
  var GAm;
  var VAm;
  var zAm;
  var KAm;
  var YAm;
  var JAm;
  var XAm;
  var QAm;
  var ZAm;
  var e0m;
  var t0m;
  var n0m;
  var Kxl = `A user kicked off a Claude Code agent to do a coding task and walked away. Read the tail of what the agent just said and decide which of four states it's in, so the system knows whether to notify the user.

The classification drives a phone notification: "blocked" pings the user to come back; everything else doesn't. So the question you're really answering is: does the user need to come back right now, and if not, is the work finished or still going? A false "blocked" is an annoying interruption for nothing. A false "done" or "working" when the agent is actually stuck waiting on the user means the work sits idle until they happen to check.

THE FOUR STATES

  "done" \u2014 the agent answered the ask or delivered the thing, and isn't planning to do anything else unprompted. This is the most common end-of-turn state in interactive sessions. There doesn't have to be a PR, commit, or file \u2014 if the user asked a question and the tail is the answer (not a plan to find one), that's done. Explanations, analyses, recommendations, "here's what I found", "the cause is X", "no change needed", and "files at <path>" closings are all done.

  "working" \u2014 the agent intends to keep going without being asked: it said "now let me\u2026", "next I'll\u2026", "running\u2026", "checking\u2026", or it's waiting on something it kicked off (CI, build, subagent, deploy, timer). Look for explicit forward intent or a named external wait.

  "blocked" \u2014 the agent cannot continue without the user. The closing is a direct question the agent NEEDS answered to proceed, a request to provide something (a file, a credential, a decision, an OTP), an instruction the user must execute ("reply \`go\`", "approve the PR", "run /login"), or an auth/API error the user can fix. Test: would the user replying or acting unblock it?

  "failed" \u2014 the agent gave up because the task is structurally impossible as framed: wrong repo, the feature doesn't exist, the premise is false, every approach exhausted with nothing the user could hand over to unblock it. Rare. If the agent names a specific missing resource, that's "blocked", not "failed" \u2014 the user CAN unblock it.

THE HARD BOUNDARIES

Done vs working: a closing that explains, summarizes, reports findings, or shows what was changed \u2014 without saying it's about to do more \u2014 is "done". Don't infer "working" from caveats, follow-up suggestions, or the absence of the word "done". Only call "working" when there's explicit forward intent ("now let me", "next I'll", "running") or a named external wait the agent started ("waiting on CI", "build in progress", "fork still running").

Done vs blocked \u2014 optional offers vs gates: after delivering, agents often close with an offer to do more: "let me know if you want X", "if you'd like, I can also Y", "ping me and I'll Z", "say the word and I'll update", "want me to dig into that?", "tell me the IDs and I'll re-home", "happy to do the latter if you want", "shall I also\u2026?". These are "done" \u2014 the deliverable shipped; the offer is extra. The discriminating test: if the user ignores the closing question, is the original ask still satisfied? Yes \u2192 done. No \u2192 blocked.

The exception is when the question is about WHETHER or HOW to ship the work the user asked for \u2014 which PR to put it in, apply it or not, push or hold, which approach to take. Then the deliverable isn't landed without the answer, so that's "blocked". "Found the fix. Want me to add it to this PR or open a new one?" \u2192 blocked (delivery isn't decided). "Fixed it in this PR. Want me to also clean up the old helper while I'm here?" \u2192 done (delivery is complete; the extra is tangential).

Working vs done vs blocked \u2014 when the closing mentions waiting on something: the discriminator is whether the AGENT ITSELF will do more.
  \u2022 Agent says it will act ("I'll report when X lands", "next check in 5 min", "shepherding CI", "will re-poll", "checking back", "N agents in flight \u2014 I'll consolidate") \u2192 "working". The agent owns the next step, regardless of what it's waiting on.
  \u2022 Agent won't act, and there's a user-addressed gate with no re-poll ("reply \`go\` to merge", "awaiting your approval", "which approach do you want?") \u2192 "blocked". Only the user can move it forward.
  \u2022 Agent won't act, and the wait is on a third party or passive trigger ("auto-merge armed, awaiting stamp", "posted to #stamps", "CI will run") \u2192 "done". The agent's part is over; whatever happens next happens without it.
A closing with both ("Awaiting your \`go\`. Next check in 20m") is "working" \u2014 the agent will re-check on its own; \`go\` is an optional accelerator, not a hard gate.

Stickiness: you're told the previous state. Don't move done\u2192working or failed\u2192working unless the agent explicitly restarted. Moving working\u2192done is the normal end-of-turn outcome \u2014 lean "done" when the closing is declarative with no future-tense plan.

EXPLICIT MARKERS \u2014 these are unambiguous, treat them as ground truth:
  \u2022 "No response requested." / "No action needed." / "Nothing needed from you." \u2192 done
  \u2022 "result: <text>" on its own line \u2192 done (and <text> is output.result)
  \u2022 "Next check in <time>" / "Shepherding CI" / "I'll report when X lands" / "checking back" \u2192 working
  \u2022 "Reply \`go\` to <verb>" / "Awaiting your \`go\`" (with no re-poll mentioned) \u2192 blocked
  \u2022 "Giving up." / "The task is not actionable." \u2192 failed
  \u2022 "blocked: <reason>" / "I'm blocked: <reason>" on its own line \u2192 blocked

API/AUTH/INFRA ERRORS \u2192 always "blocked" (transient or user-fixable), never "failed". Set needs to the fix. Covers:
  \u2022 Anthropic API: "401", "Invalid API key", "Please run /login", "rate limited", "overloaded", "529", "credit balance too low", "usage limit reached"
  \u2022 MCP servers: "OAuth token expired/revoked", "vault credential missing", "MCP authentication failed", "MCP unauthorized"
  \u2022 External services: "gh auth login", "gcloud auth login", "aws sso login", "bad credentials", "token expired", GitLab/GitHub PAT errors, Stripe/Slack 401
  \u2022 Any prose naming a specific re-auth or re-login step

OTHER DISAMBIGUATION:
  \u2022 Agent hit an error but is retrying or investigating ("let me try again", "checking the logs") \u2192 "working"
  \u2022 Agent stopped and names a SPECIFIC missing thing the user could supply (file, env var, credential, OTP, path, decision) \u2192 "blocked", even if phrased as "can't proceed" or "stopping here"
  \u2022 Scope notes, caveats, or FYIs after a delivered finding ("note: Y is untested", "out of scope but worth flagging") \u2192 "done"
  \u2022 A summary of options or a recommendation ("B is the right call", "I'd take option 1") with no question \u2192 "done" (the recommendation IS the deliverable)
  \u2022 Imperative to the user that's a recommendation, not a gate ("Ship the seek + scale.", "Run the migration when ready.") \u2192 "done" \u2014 the agent isn't waiting on it

EXAMPLES (tail \u2192 classification)

"Reading config files to understand the setup."
\u2192 {"state":"working","detail":"reading config files to map the setup","tempo":"active","output":{}}

"Found it in auth.ts:88. Now let me check if the same pattern appears elsewhere."
\u2192 {"state":"working","detail":"found pattern at auth.ts:88; scanning for other occurrences","tempo":"active","output":{}}

"Waiting for CI to finish (~8 min)."
\u2192 {"state":"working","detail":"waiting on CI (~8 min)","tempo":"idle","output":{}}

"CI green on PR #31030. Reply \`go\` to merge."
\u2192 {"state":"blocked","detail":"PR #31030 CI green; awaiting user go-ahead to merge","tempo":"blocked","needs":"reply \`go\` to merge","output":{}}
  (no agent re-poll; only the user's \`go\` moves it forward \u2192 blocked)

"Awaiting your \`go\`. Next check in 20m."
\u2192 {"state":"working","detail":"PR awaiting go-ahead; agent re-checking in 20m","tempo":"idle","output":{}}
  (agent will re-poll on its own; \`go\` is an optional accelerator \u2192 working)

"Auto-merge armed on PR #4821. Posted to #stamps. Awaiting stamp."
\u2192 {"state":"done","detail":"PR #4821 auto-merge armed; posted to #stamps","tempo":"idle","output":{"result":"PR #4821 ready, auto-merge armed"}}
  (GitHub merges, not the agent; agent's part is over \u2192 done)

"Babysit tick \u2014 PR #40689. All CI green, threads resolved. Awaiting human approval. Next check via cron in ~5 min."
\u2192 {"state":"working","detail":"PR #40689 green, awaiting approval; next cron check ~5 min","tempo":"idle","output":{}}
  ("next check via cron" = agent will re-poll \u2192 working)

"Here's how the auth flow works: the token is validated in middleware.ts:42 before each request."
\u2192 {"state":"done","detail":"auth flow: token validated in middleware.ts:42 per request","tempo":"idle","output":{"result":"token validated in middleware.ts:42"}}
  (answered a question \u2014 no PR/commit/file required for "done")

"Indentation is now consistent at all four call sites (RepoPicker, both EnvironmentPicker sites, BranchPicker, SessionView). CI's swift-format should find nothing left to reflow."
\u2192 {"state":"done","detail":"indentation fixed at 4 call sites; swift-format clean","tempo":"idle","output":{"result":"indentation consistent across RepoPicker/EnvironmentPicker/BranchPicker/SessionView"}}

"At 30-40k rows there's no hint that gets you there without a new index \u2014 and at that point the column is strictly cheaper than a (session_uuid, source, sequence_num DESC) index."
\u2192 {"state":"done","detail":"analysis: dedicated column cheaper than composite index at 30-40k rows","tempo":"idle","output":{"result":"recommend dedicated column over composite index"}}
  (pure analysis closing, no question, no forward intent \u2014 done)

"No response requested."
\u2192 {"state":"done","detail":"completed; no response requested","tempo":"idle","output":{}}

"Both PRs remain bot-clean. Continue your e2e test on the restarted localhost:4000 (now pointed at local CCR)."
\u2192 {"state":"done","detail":"both PRs bot-clean; localhost:4000 restarted pointing at local CCR","tempo":"idle","output":{}}
  ("Continue your test" is advice TO the user, not the agent's plan \u2192 done)

"Both subagents updated to use \`ack_seq\`. They're still running \u2014 I'll report PR URLs when each completes."
\u2192 {"state":"working","detail":"2 subagents running with ack_seq rename; will report PR URLs","tempo":"idle","output":{}}
  ("I'll report when each completes" = agent will act on results \u2192 working)

"Searching internal knowledge for the org ID \u2014 I'll report back when the search completes."
\u2192 {"state":"working","detail":"searching internal KB for org ID","tempo":"active","output":{}}

"Wrote the chart to plots/venn.png; script is at scripts/venn.R."
\u2192 {"state":"done","detail":"venn chart written to plots/venn.png (script: scripts/venn.R)","tempo":"idle","output":{"result":"plots/venn.png + scripts/venn.R"}}

"Fixed the regex; tests pass. If you want, I can also open a follow-up PR to clean up the old helper."
\u2192 {"state":"done","detail":"regex fixed in parser.ts, all tests green","tempo":"idle","output":{"result":"regex fixed, tests pass"}}
  (deliverable shipped; offer is tangential extra \u2192 done)

"Throughput drop confirmed \u2014 ~16K/min notifications being dropped from pod capacity. Ship the seek + scale. Want me to dig into the upstream volume change too?"
\u2192 {"state":"done","detail":"confirmed ~16K/min notif drop from pod capacity; recommend seek+scale","tempo":"idle","output":{"result":"~16K/min drop, pod capacity \u2014 ship seek+scale"}}
  (finding + recommendation delivered; trailing question is optional extra \u2192 done)

"Not applied \u2014 say the word and I'll update both widgets."
\u2192 {"state":"done","detail":"widget query change drafted; not applied pending go-ahead","tempo":"idle","output":{}}
  ("say the word and I'll" = optional offer \u2192 done)

"B is the right call \u2014 it lands in the table the chart already reads, and avoids the migration."
\u2192 {"state":"done","detail":"recommend option B (reuses existing table, avoids migration)","tempo":"idle","output":{"result":"recommendation: option B"}}

"PR opened: https://github.com/acme/repo/pull/123\\nresult: fixed auth race in auth.ts, PR #123"
\u2192 {"state":"done","detail":"opened PR #123: fixed auth race","tempo":"idle","output":{"result":"fixed auth race in auth.ts, PR #123"}}

"I found the bug in auth.ts:42. Want me to fix it or just report?"
\u2192 {"state":"blocked","detail":"found null-check bug at auth.ts:42; awaiting fix-vs-report","tempo":"blocked","needs":"fix it or just report?","output":{}}
  (agent has NOT delivered the fix; can't proceed without the answer \u2192 blocked)

"Found the fix \u2014 it's a 3-line change to the retry handler. Want me to add it to this PR or open a new one?"
\u2192 {"state":"blocked","detail":"3-line retry-handler fix ready; awaiting which PR","tempo":"blocked","needs":"add to this PR or open a new one?","output":{}}
  (question is about HOW to ship the asked-for work \u2192 blocked)

"Added the analytics enum + conditional at the .withScreenAnalyticsLogging call site. Want me to also add the missing screen tag for the empty-state view while I'm here? It's a ~5-line change."
\u2192 {"state":"done","detail":"analytics enum + conditional added at .withScreenAnalyticsLogging","tempo":"idle","output":{"result":"analytics logging wired at SessionView"}}
  (asked-for work delivered; the "while I'm here" extra is tangential \u2192 done)

"I can't proceed \u2014 the repo requires GITHUB_TOKEN and it's not set."
\u2192 {"state":"blocked","detail":"missing GITHUB_TOKEN; cannot clone","tempo":"blocked","needs":"set GITHUB_TOKEN env var","output":{}}

"Can't run the tests \u2014 needs the openapi.yaml file which isn't in this checkout. Stopping here."
\u2192 {"state":"blocked","detail":"missing openapi.yaml; cannot run tests","tempo":"blocked","needs":"provide config/openapi.yaml","output":{}}
  ("stopping" + names a specific missing resource \u2192 blocked, not failed)

"API Error: 401 Invalid API key \xB7 Please run /login"
\u2192 {"state":"blocked","detail":"API auth failed (401)","tempo":"blocked","needs":"run /login","output":{}}

"The build is broken on main and I can't reproduce locally. Giving up."
\u2192 {"state":"failed","detail":"cannot reproduce build failure; logs uninformative","tempo":"idle","output":{}}
  (no specific resource would unblock; exhausted approaches \u2192 failed)

CONTRASTIVE PAIRS \u2014 same surface shape, different state

  "Tests pass. Let me know if you also want the docs updated."  \u2192 done
  "Tests written but I haven't run them. Let me know which env to use."  \u2192 blocked
  (first: deliverable shipped, offer is extra. second: deliverable not verified, needs the env to proceed)

  "Waiting for CI (~8 min)."  \u2192 working
  "CI green. Awaiting your \`go\` to merge."  \u2192 blocked
  (first: only external wait. second: user gate)

  "Want me to also clean up the old helper?"  \u2192 done
  "Want me to apply this fix or just report it?"  \u2192 blocked
  (first: tangential extra after delivery. second: how to deliver the asked-for work)

  "I'll re-pull metrics when the timer fires and confirm it drained."  \u2192 working
  "I'll re-pull metrics once you confirm the timer fired."  \u2192 blocked
  (first: agent owns the next step. second: user owns it)

OUTPUT \u2014 respond with ONLY this JSON, no code fences:
{"state":"<working|blocked|done|failed>","detail":"<one line>","tempo":"<active|idle|blocked>","needs":"<when blocked: the exact ask; omit otherwise>","output":{"result":"<one-sentence deliverable headline, \u2264180 chars; omit when working>"}}

"detail" is what shows on the user's phone lock screen \u2014 write it like a colleague's Slack message: name the concrete thing (file, function, error, number, finding) and what happened to it. "fixed auth race in middleware.ts, tests green" not "completed task"; "waiting on CI for #4821" not "working"; "confirmed 16K/min drop from pod capacity" not "investigated issue".

"tempo": "active" = computing; "idle" = waiting on external (CI, timer, reviewer); "blocked" = waiting on user.

"needs": when blocked, the exact action the user should take, copied as closely as possible from the tail \u2014 they'll act on this text without reading the transcript. Omit otherwise.

"output.result": one-sentence headline naming a finished deliverable (direct answer, URL/path the agent produced, command the user should run). If the tail has \`result:\` on its own line, that line IS the result. Omit ({}) when still working, or when it would just restate the state.
`;
  var Qme = __lazy(() => {
    qg();
    MAm = we(() => Ke.object({
      state: Ke.string().nullish(),
      detail: Ke.string().nullish(),
      tempo: Ke.string().nullish(),
      needs: Ke.string().nullish(),
      output: Ke.record(Ke.string(), Ke.unknown()).nullish()
    }));
    NAm = {
      working: "actively progressing on the task \u2014 narrating plans, calling tools, or writing code; no pending question for the user",
      blocked: 'the last message ends on a direct question or explicit request for the user ("want me to\u2026?", "which do you prefer?", "approve this?", "needs input: \u2026") \u2014 nothing will happen until the user replies',
      done: 'the task the user asked for is fully delivered and there is no further work the agent plans to do \u2014 not just a progress update, not "almost done", not "let me know what you think"',
      failed: "the agent has given up or hit something unrecoverable \u2014 missing credential, broken build it cannot fix, wrong repo, task impossible as framed; distinct from blocked (user can unblock) and done (succeeded)"
    };
    LAm = {
      result: "one short sentence naming the finished deliverable \u2014 no sub-clauses or bullet summaries"
    };
    FAm = new Set(["done", "failed", "stopped"]);
    $Am = /(?:^|\n)\s*failed\s*[:\u2014\u2013-]\s*(.{3,200}?)(?=\n|$)/gi;
    HAm = /(?:^|\n)\s*needs input\s*[:\u2014\u2013-]\s*(.{3,200}?)(?=\n|$)/gi;
    jAm = /(?:^|\n)\s*blocked\s*[:\u2014\u2013-]\s*(.{3,200}?)(?=\n|$)/gi;
    qAm = /\bI'?m blocked\s*[:\u2014\u2013-]\s*(.{3,200}?)(?=\n|$)/gi;
    GAm = /\b(?:want|like) me to\b|\b(?:shall|should) I also\b/i;
    VAm = /^(?:(?:Now|Next|Then|Alright|OK|Okay|Right|Good|First|Also),?\s+)?(?:Let me (?!know\b)|(?:I(?:'?ll| will) |I'?m going to |Going to )(?!need\b|require\b|wait\b|leave\b|hold\b|skip\b|stop\b)|Proceeding |Moving (?:on|to)\b|Continuing |Starting |Trying |Checking |Looking |Searching |Reading |Investigating |Running |Re-?running |Building |Rebuilding |Installing |Fetching |Applying |Fixing |Patching |Updating |Adding |Removing |Deleting |Importing |Refactoring |Rewriting |Writing |Grepping |Scanning |Wrapping |Switching |Testing |Verifying |Regenerating |Pushing |Pulling |Reviewing |Examining |Loading |Compiling |Parsing |Analyzing |Tracing |Exploring )/i;
    zAm = /\b(?:once |when |after |until |as soon as )(?:you|it|the|that|this|they)\b|\bagain in\b|\bcheck back\b|\bin ~?\d+\s*(?:s(?:ec(?:ond)?s?)?|m(?:in(?:ute)?s?)?|h(?:ours?|rs?)?)\b|\bthen\.?\s*$|\bwhichever you\b|\bhold(?:ing)? for your\b|\b(?:to|and) wait for\b|\bgive it (?:more |some )?time\b|\bif (?:you(?:'d| want| prefer| need|'re)?|that(?:'s| helps| works)?|useful|needed|helpful|desired)\b|\b(?:isn'?t|not|won'?t) going to work\b/i;
    KAm = /^(?:(?:\*\*)?[1-9]\d* (?:agent|cron|task|fork|job|worker|PR|check)s? (?:in flight|remaining|active|still (?:running|working)|pending|running|launched)\b|(?:Continuous )?(?:[Ll]oop|[Cc]rons?|[Bb]abysit) (?:active|healthy|continuing|running|will keep|continues)\b|Waiting for (?:the )?(?:agent|cron|task|fork|worker|job|remaining|them)s?\b|Agents? will report back\b|Waiting\.?$)/;
    YAm = /^(?:I will|I'll|Will) (?:check back|re-?check|poll|look again|retry|re-?run|try again) (?:(?:when|once|after|until) (?!your?\b)|in\b|again\b)/i;
    JAm = /^I (?:can(?:'?t|not)|am unable to) (?:proceed|continue|make (?:any )?progress|complete|fix this)\b/i;
    XAm = /^(?:Giving up|I(?:'m| am) giving up|The task is not actionable)\b/i;
    QAm = /^(?:Pushed (?:to `|`[0-9a-f]{7,})|Committed as `?[0-9a-f]{7,}\b|Commit: `?[0-9a-f]{7,}\b|(?:Opened|Created) PR #?\d)/;
    ZAm = /^Ready (?:for review|to (?:upload|merge|ship|land))\b/;
    e0m = /^VERDICT: (?:PASS|FAIL)\b/;
    t0m = /^Please (?:start|run|provide|grant|export|add|install|configure|give me|paste|point me|set (?:the |up |`?[A-Z][A-Z0-9_]+\b))/;
    n0m = /^(?:Stopping here|I've stopped here|Parked (?:the|this) branch|Paused here)(?:\.|$| \u2014| -| until| pending| since| because)/i;
  });
  function Ner(e) {
    let t = typeof e === "object" && e !== null ? e : undefined;
    let n = Array.isArray(t?.questions) ? t.questions : [];
    let r = [];
    let o = "";
    for (let a of n) {
      let l = a;
      if (typeof l?.question !== "string") {
        continue;
      }
      o ||= l.question;
      let c = Array.isArray(l.options) ? l.options.flatMap(u => {
        let d = u;
        return typeof d?.label === "string" ? [{
          label: d.label,
          description: typeof d.description === "string" ? d.description : ""
        }] : [];
      }) : [];
      if (c.length > 0) {
        r.push({
          question: l.question,
          options: c
        });
      }
    }
    let s = r[0]?.options.map(a => a.label).join(" \xB7 ");
    return {
      text: o ? MYt(`answer: ${o}${s ? ` (${s})` : ""}`) : "answer question",
      questions: r.length > 0 ? r : undefined
    };
  }
  function MYt(e) {
    return mf(e.replace(/\s+/g, " ").trim(), 800);
  }
  var r0m;
  var _Z;
  var OTt = __lazy(() => {
    Qme();
    ph();
    r0m = ["sandbox", "permission", "worker-sandbox", "elicitation", "dialog"];
    _Z = (() => {
      let e = Si();
      let t = {
        sandbox: null,
        permission: null,
        "worker-sandbox": null,
        elicitation: null,
        dialog: null
      };
      let n = null;
      function r() {
        let o = null;
        for (let s of r0m) {
          let i = t[s];
          if (i) {
            o = i;
            break;
          }
        }
        if (o?.text === n?.text) {
          return;
        }
        n = o;
        e.emit(o);
      }
      return {
        subscribe: e.subscribe,
        emit(o, s = "permission") {
          let i = o === null ? null : typeof o === "string" ? {
            text: o
          } : o;
          if (t[s]?.text === i?.text) {
            return;
          }
          t[s] = i;
          r();
        }
      };
    })();
  });
  function Ler(e) {
    let t = false;
    let n = false;
    return {
      resolve(r) {
        if (n) {
          return;
        }
        n = true;
        t = true;
        e(r);
      },
      isResolved() {
        return t;
      },
      claim() {
        if (t) {
          return false;
        }
        t = true;
        return true;
      }
    };
  }
  function Fer(e, t, n, r, o, s, i) {
    let a = r.message.id;
    let l = getToolPermissionContext(n).mode;
    function c(d, p) {
      rka({
        tool: e,
        input: p?.input ?? t,
        toolUseContext: n,
        messageId: a,
        toolUseID: o,
        permissionMode: l
      }, d, p?.permissionPromptStartTimeMs);
    }
    return Object.freeze({
      tool: e,
      input: t,
      toolUseContext: n,
      assistantMessage: r,
      messageId: a,
      toolUseID: o,
      setClassifierApprovals: i,
      permissionMode: l,
      logDecision: c,
      logCancelled() {
        logEvent("tengu_tool_use_cancelled", {
          messageID: br(a),
          toolName: qi(e.name)
        });
      },
      persistPermissions(d) {
        if (d.length === 0) {
          return false;
        }
        zV(d);
        s(Zq(getToolPermissionContext(n), d));
        return d.some(p => Xgo(p.destination));
      },
      setModeFromBridge(d) {
        return setPermissionModeWithGuards(d, getToolPermissionContext(n), n.setToolPermissionContext);
      },
      resolveIfAborted(d) {
        if (!n.abortController.signal.aborted) {
          return false;
        }
        this.logCancelled();
        d(this.cancelAndAbort(undefined, true));
        return true;
      },
      cancelAndAbort(d, p, m) {
        let f = !!n.agentId;
        let h = d ? `${f ? Uer : tTt}${d}` : f ? "Permission for this tool use was denied. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). Try a different approach or report the limitation to complete your task." : "The user doesn't want to proceed with this tool use. The tool use was rejected (eg. if it was a file edit, the new_string was NOT written to the file). STOP what you are doing and wait for the user to tell you how to proceed.";
        let g = f ? h : VLe(h);
        if (p || Per({
          feedback: d,
          contentBlocks: m,
          isSubagent: f
        })) {
          logForDebugging(`Aborting: tool=${e.name} isAbort=${p} hasFeedback=${!!d} isSubagent=${f}`);
          n.abortController.abort();
        }
        return {
          behavior: "ask",
          message: g,
          contentBlocks: m
        };
      },
      async runHooks(d, p, m, f) {
        for await (let h of executePermissionRequestHooks(e.name, o, t, n, d, p, n.abortController.signal)) {
          if (h.permissionRequestResult) {
            let g = h.permissionRequestResult;
            if (g.behavior === "allow") {
              let y = g.updatedInput ?? m ?? t;
              if (g.updatedInput) {
                let _ = guardHookUpdatedInput(await checkRuleBasedPermissions(e, y, {
                  ...n,
                  toolUseId: o
                }), e.name);
                if (_?.behavior === "deny") {
                  this.logDecision({
                    decision: "reject",
                    source: "config"
                  }, {
                    input: y,
                    permissionPromptStartTimeMs: f
                  });
                  return {
                    ..._,
                    decideLocation: "ask-path"
                  };
                }
                if (_?.behavior === "ask") {
                  return {
                    reprompted: _,
                    finalInput: y
                  };
                }
              }
              return this.handleHookAllow(y, g.updatedPermissions ?? [], f);
            } else if (g.behavior === "deny") {
              if (this.logDecision({
                decision: "reject",
                source: {
                  type: "hook"
                }
              }, {
                permissionPromptStartTimeMs: f
              }), g.interrupt) {
                logForDebugging(`Hook interrupt: tool=${e.name} hookMessage=${g.message}`);
                n.abortController.abort();
              }
              return this.buildDeny(g.message || "Permission denied by hook", {
                type: "hook",
                hookName: "PermissionRequest",
                reason: g.message
              });
            }
          }
        }
        return null;
      },
      buildAllow(d, p) {
        return {
          behavior: "allow",
          updatedInput: d,
          userModified: p?.userModified ?? false,
          ...(p?.decisionReason && {
            decisionReason: p.decisionReason
          }),
          ...(p?.acceptFeedback && {
            acceptFeedback: p.acceptFeedback
          }),
          ...(p?.contentBlocks && p.contentBlocks.length > 0 && {
            contentBlocks: p.contentBlocks
          })
        };
      },
      buildDeny(d, p) {
        return {
          behavior: "deny",
          message: d,
          decisionReason: p,
          decideLocation: "ask-path"
        };
      },
      handleUserAllow(d, p, m, f, h, g) {
        let y = this.persistPermissions(p);
        Der(p);
        this.logDecision({
          decision: "accept",
          source: {
            type: "user",
            permanent: y
          }
        }, {
          input: d,
          permissionPromptStartTimeMs: f
        });
        let _ = e.inputsEquivalent ? !e.inputsEquivalent(t, d) : false;
        let b = m?.trim();
        return this.buildAllow(d, {
          userModified: _,
          decisionReason: g,
          acceptFeedback: b || undefined,
          contentBlocks: h
        });
      },
      handleHookAllow(d, p, m) {
        let f = this.persistPermissions(p);
        this.logDecision({
          decision: "accept",
          source: {
            type: "hook",
            permanent: f
          }
        }, {
          input: d,
          permissionPromptStartTimeMs: m
        });
        return this.buildAllow(d, {
          decisionReason: {
            type: "hook",
            hookName: "PermissionRequest"
          }
        });
      }
    });
  }
  function Xxl(e) {
    let t = e.input;
    if (e.tool.name === "AskUserQuestion") {
      return Ner(t);
    }
    if (e.tool.name === "ExitPlanMode") {
      return {
        text: "approve plan"
      };
    }
    let n = e.tool.userFacingName(e.input).trim();
    let r = typeof t?.command === "string" ? t.command : typeof t?.file_path === "string" ? t.file_path : typeof t?.url === "string" ? t.url : "";
    let o = n || e.tool.name;
    return {
      text: r && !o.includes(r) ? MYt(`approve ${o}: ${r}`) : `approve ${o}`
    };
  }
  var NYt = __lazy(() => {
    Ot();
    Gu();
    cU();
    Sl();
    je();
    Sp();
    ro();
    Zk();
    S_();
    oy();
    Mer();
    Rfo();
    OTt();
  });
  var Qxl = {};
  __export(Qxl, {
    isChannelsEnabled: () => isChannelsEnabled,
    isChannelAllowlisted: () => isChannelAllowlisted,
    getChannelAllowlist: () => getChannelAllowlist
  });
  function getChannelAllowlist() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_harbor_ledger", []);
    let t = o0m().safeParse(e);
    return t.success ? t.data : [];
  }
  function isChannelsEnabled() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_harbor", false);
  }
  function isChannelAllowlisted(e) {
    if (!e) {
      return false;
    }
    let {
      name: t,
      marketplace: n
    } = Yo(e);
    if (!n) {
      return false;
    }
    return getChannelAllowlist().some(r => r.plugin === t && r.marketplace === n);
  }
  var o0m;
  var MTt = __lazy(() => {
    Kf();
    $n();
    o0m = we(() => v.array(v.object({
      marketplace: v.string(),
      plugin: v.string()
    })));
  });
  var ekl = {};
  __export(ekl, {
    wrapChannelMessage: () => wrapChannelMessage,
    isChannelsPolicyBlocked: () => isChannelsPolicyBlocked,
    getEffectiveChannelAllowlist: () => getEffectiveChannelAllowlist,
    gateChannelServer: () => gateChannelServer,
    findChannelEntry: () => findChannelEntry,
    ChannelPermissionNotificationSchema: () => ChannelPermissionNotificationSchema,
    ChannelMessageNotificationSchema: () => ChannelMessageNotificationSchema,
    CHANNEL_PERMISSION_REQUEST_METHOD: () => "notifications/claude/channel/permission_request",
    CHANNEL_PERMISSION_METHOD: () => "notifications/claude/channel/permission"
  });
  function wrapChannelMessage(e, t, n) {
    let r = Object.entries(n ?? {});
    let [o, s] = s0m(r, ([l]) => Zxl.test(l));
    if (s.length > 0) {
      logForDebugging(`[channel] ${e}: dropped ${s.length} meta key(s) that don't match ${Zxl.source}: ${s.map(([l]) => l).join(", ")}`, {
        level: "warn"
      });
    }
    let i = o.map(([l, c]) => ` ${l}="${Yd(c)}"`).join("");
    let a = YDe("channel", t);
    return `<${"channel"} source="${Yd(e)}"${i}>
${a}
</${"channel"}>`;
  }
  function s0m(e, t) {
    let n = [];
    let r = [];
    for (let o of e) {
      (t(o) ? n : r).push(o);
    }
    return [n, r];
  }
  function getEffectiveChannelAllowlist(e) {
    if (e) {
      return {
        entries: e,
        source: "org"
      };
    }
    return {
      entries: getChannelAllowlist(),
      source: "ledger"
    };
  }
  function isChannelsPolicyBlocked(e) {
    if (isClaudeAISubscriber()) {
      let t = getSubscriptionType();
      return (t === "team" || t === "enterprise") && e?.channelsEnabled !== true;
    }
    return e !== null && e.channelsEnabled !== true;
  }
  function findChannelEntry(e, t) {
    let n = e.split(":");
    return t.find(r => r.kind === "server" ? e === r.name : n[0] === "plugin" && n[1] === r.name);
  }
  function gateChannelServer(e, t, n) {
    if (!t?.experimental?.["claude/channel"]) {
      return {
        action: "skip",
        kind: "capability",
        reason: "server did not declare claude/channel capability"
      };
    }
    if (getAPIProvider() !== "firstParty") {
      return {
        action: "skip",
        kind: "provider",
        reason: "channels are not available on third-party providers"
      };
    }
    if (!isChannelsEnabled()) {
      return {
        action: "skip",
        kind: "disabled",
        reason: "channels feature is not currently available"
      };
    }
    let r = getSettingsForSource("policySettings");
    if (isChannelsPolicyBlocked(r)) {
      return {
        action: "skip",
        kind: "policy",
        reason: "channels not enabled by org policy (set channelsEnabled: true in managed settings)"
      };
    }
    let o = findChannelEntry(e, getAllowedChannels());
    if (!o) {
      return {
        action: "skip",
        kind: "session",
        reason: `server ${e} not in --channels list for this session`
      };
    }
    if (o.kind === "plugin") {
      let s = n ? Yo(n).marketplace : undefined;
      if (s !== o.marketplace) {
        return {
          action: "skip",
          kind: "marketplace",
          reason: `you asked for plugin:${o.name}@${o.marketplace} but the installed ${o.name} plugin is from ${s ?? "an unknown source"}`
        };
      }
      if (!o.dev) {
        let {
          entries: i,
          source: a
        } = getEffectiveChannelAllowlist(r?.allowedChannelPlugins);
        if (!i.some(l => l.plugin === o.name && l.marketplace === o.marketplace)) {
          return {
            action: "skip",
            kind: "allowlist",
            reason: a === "org" ? `plugin ${o.name}@${o.marketplace} is not on your org's approved channels list (set allowedChannelPlugins in managed settings)` : `plugin ${o.name}@${o.marketplace} is not on the approved channels allowlist (use --dangerously-load-development-channels for local dev)`
          };
        }
      }
    } else if (!o.dev) {
      return {
        action: "skip",
        kind: "allowlist",
        reason: `server ${o.name} is not on the approved channels allowlist (use --dangerously-load-development-channels for local dev)`
      };
    }
    return {
      action: "register"
    };
  }
  var ChannelMessageNotificationSchema;
  var ChannelPermissionNotificationSchema;
  var Zxl;
  var qKe = __lazy(() => {
    at();
    np();
    no();
    je();
    Ds();
    Kf();
    wx();
    MTt();
    ChannelMessageNotificationSchema = we(() => v.object({
      method: v.literal("notifications/claude/channel"),
      params: v.object({
        content: v.string(),
        meta: v.record(v.string(), v.string()).optional()
      })
    }));
    ChannelPermissionNotificationSchema = we(() => v.object({
      method: v.literal("notifications/claude/channel/permission"),
      params: v.object({
        request_id: v.string(),
        behavior: v.enum(["allow", "deny"])
      })
    }));
    Zxl = /^[a-zA-Z_][a-zA-Z0-9_]*$/;
  });
  function nkl() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_harbor_permissions", false);
  }
  function tkl(e) {
    let t = 2166136261;
    for (let r = 0; r < e.length; r++) {
      t ^= e.charCodeAt(r);
      t = Math.imul(t, 16777619);
    }
    t = t >>> 0;
    let n = "";
    for (let r = 0; r < 5; r++) {
      n += ("abcdefghijkmnopqrstuvwxyz")[t % 25];
      t = Math.floor(t / 25);
    }
    return n;
  }
  function rkl(e) {
    let t = tkl(e);
    for (let n = 0; n < 10; n++) {
      if (!a0m.some(r => t.includes(r))) {
        return t;
      }
      t = tkl(`${e}:${n}`);
    }
    return t;
  }
  function okl(e) {
    try {
      let t = De(e);
      return t.length > 200 ? t.slice(0, 200) + "\u2026" : t;
    } catch {
      return "(unserializable)";
    }
  }
  function skl(e, t) {
    return e.filter(n => n.type === "connected" && t(n.name) && n.capabilities?.experimental?.["claude/channel"] !== undefined && n.capabilities?.experimental?.["claude/channel/permission"] !== undefined);
  }
  function ikl() {
    let e = new Map();
    return {
      onResponse(t, n) {
        let r = t.toLowerCase();
        e.set(r, n);
        return () => {
          e.delete(r);
        };
      },
      resolve(t, n, r) {
        let o = t.toLowerCase();
        let s = e.get(o);
        if (!s) {
          return false;
        }
        e.delete(o);
        s({
          behavior: n,
          fromServer: r
        });
        return true;
      }
    };
  }
  var a0m;
  var LLo = __lazy(() => {
    $n();
    a0m = ["fuck", "shit", "cunt", "cock", "dick", "twat", "piss", "crap", "bitch", "whore", "ass", "tit", "cum", "fag", "dyke", "nig", "kike", "rape", "nazi", "damn", "poo", "pee", "wank", "anus"];
  });
  function l0m(e, t) {
    if (t.length === 0) {
      return;
    }
    let n = [];
    for (let r of t) {
      if (r.type === "setMode") {
        let o = e.setModeFromBridge(r.mode);
        if (!o.ok) {
          logForDebugging(`bridge setMode '${r.mode}' rejected (${o.error}); falling back to 'default'`);
          e.setModeFromBridge("default");
        }
      } else {
        n.push(r);
      }
    }
    if (n.length > 0) {
      e.persistPermissions(n);
    }
  }
  function lkl(e) {
    let {
      ctx: t,
      description: n,
      result: r,
      displayInput: o,
      permissionPromptStartTimeMs: s,
      awaitAutomatedChecksBeforeDialog: i,
      bridgeCallbacks: a,
      channelCallbacks: l,
      claim: c,
      isResolved: u,
      onWin: d,
      onReprompt: p
    } = e;
    let {
      setClassifierApprovals: m
    } = t;
    let f = a ? akl.randomUUID() : undefined;
    let h;
    let g;
    function y(_) {
      if (a && f) {
        if (_) {
          a.sendResponse(f, _);
        }
        a.cancelRequest(f);
      }
      h?.();
      g?.();
    }
    if (a && f) {
      let _ = "";
      if (t.tool.name !== "Bash" && t.tool.name !== "PowerShell") {
        try {
          _ = t.tool.getToolUseSummary?.(o) ?? t.tool.getActivityDescription?.(o) ?? "";
        } catch {
          _ = "";
        }
      }
      a.sendRequest(f, t.tool.name, o, t.toolUseID, _, r.suggestions, r.blockedPath);
      let b = t.toolUseContext.abortController.signal;
      h = a.onResponse(f, S => {
        if (!c()) {
          return;
        }
        if (Pe("permission_bridge_relay"), h) {
          b.removeEventListener("abort", h);
        }
        if (LDe(m, t.toolUseID), g?.(), S.behavior === "allow") {
          if (l0m(t, S.updatedPermissions ?? []), S.updatedPermissions?.length) {
            Der(S.updatedPermissions);
          }
          t.logDecision({
            decision: "accept",
            source: {
              type: "user",
              permanent: !!S.updatedPermissions?.length
            }
          }, {
            input: S.updatedInput ?? o,
            permissionPromptStartTimeMs: s
          });
          d(t.buildAllow(S.updatedInput ?? o));
        } else {
          t.logDecision({
            decision: "reject",
            source: {
              type: "user_reject",
              hasFeedback: !!S.message
            }
          }, {
            permissionPromptStartTimeMs: s
          });
          d(t.cancelAndAbort(S.message));
        }
      });
      b.addEventListener("abort", h, {
        once: true
      });
    }
    if (l && !t.tool.requiresUserInteraction?.()) {
      let _ = rkl(t.toolUseID);
      let b = getAllowedChannels();
      let S = skl(t.toolUseContext.getMcp().clients, E => findChannelEntry(E, b) !== undefined);
      if (S.length > 0) {
        let E = {
          request_id: _,
          tool_name: t.tool.name,
          description: n,
          input_preview: okl(o)
        };
        for (let A of S) {
          if (A.type !== "connected") {
            continue;
          }
          A.client.notification({
            method: "notifications/claude/channel/permission_request",
            params: E
          }).catch(k => {
            Ae("permission_channel_relay", "permission_channel_relay_send_failed");
            logForDebugging(`Channel permission_request failed for ${A.name}: ${he(k)}`, {
              level: "error"
            });
          });
        }
        let C = t.toolUseContext.abortController.signal;
        let x = l.onResponse(_, A => {
          if (!c()) {
            return;
          }
          if (Pe("permission_channel_relay"), g?.(), LDe(m, t.toolUseID), a && f) {
            a.cancelRequest(f);
          }
          if (h?.(), A.behavior === "allow") {
            t.logDecision({
              decision: "accept",
              source: {
                type: "user",
                permanent: false
              }
            }, {
              permissionPromptStartTimeMs: s
            });
            d(t.buildAllow(o));
          } else {
            t.logDecision({
              decision: "reject",
              source: {
                type: "user_reject",
                hasFeedback: false
              }
            }, {
              permissionPromptStartTimeMs: s
            });
            d(t.cancelAndAbort(`Denied via channel ${A.fromServer}`));
          }
        });
        g = () => {
          x();
          C.removeEventListener("abort", g);
        };
        C.addEventListener("abort", g, {
          once: true
        });
      }
    }
    if (!i) {
      (async () => {
        if (u()) {
          return;
        }
        let _ = await t.runHooks(getToolPermissionContext(t.toolUseContext).mode, r.suggestions, r.updatedInput, s);
        if (_ && "reprompted" in _) {
          if (u()) {
            return;
          }
          if (LDe(m, t.toolUseID), a && f) {
            a.cancelRequest(f);
            f = undefined;
          }
          h?.();
          g?.();
          p(_.finalInput, _.reprompted.decisionReason, _.reprompted);
          return;
        }
        if (!_ || !c()) {
          return;
        }
        if (a && f) {
          a.cancelRequest(f);
        }
        h?.();
        g?.();
        d(_);
      })();
    }
    return {
      notifyBridgeAndTeardown: y
    };
  }
  var akl;
  var ckl = __lazy(() => {
    at();
    ln();
    qKe();
    LLo();
    Sl();
    je();
    dt();
    Mer();
    akl = require("crypto");
  });
  function WKe(e) {
    SZ.runInContext(`(() => {
    Object.defineProperty(Error, 'prepareStackTrace', {
      value: (err, sites) => String(err.stack ?? err),
      writable: false, configurable: false,
    });
    // Delete globals with no REPL use case that either run callbacks on the
    // host event loop outside any try/catch (FinalizationRegistry \u2014 same
    // DoS shape as a throwing setTimeout callback) or expose shared-memory
    // primitives (Atomics/SharedArrayBuffer \u2014 no cross-realm use, pure
    // attack-surface reduction).
    for (const g of ['ShadowRealm', 'WebAssembly', 'FinalizationRegistry',
                     'WeakRef', 'Atomics', 'SharedArrayBuffer',
                     'queueMicrotask',
                     // eval is NOT deleted here \u2014 hardenVMIntrinsics is
                     // shared with REPLTool (codeGeneration:{strings:true}).
                     // WorkflowTool blocks eval via codeGeneration:false.
                     // JSC debug/shell globals \u2014 present only if
                     // JSC_useDollarVM=1 or similar, but $vm is a full
                     // escape (createGlobalObject, addressOf, runScript).
                     '$vm', 'gc', 'edenGC', 'fullGC', 'print', 'readFile',
                     'Loader']) {
      delete globalThis[g];
    }
    // SES-style enable-property-override: convert common shadowed data props
    // to accessors whose setter defineProperty's onto the receiver. Otherwise
    // freezing makes them non-writable, and [[Set]] on an instance (e.g.
    // "this.name='X'" in an Error subclass ctor) throws in strict / no-ops in
    // sloppy \u2014 the TC39 "override mistake".
    function enableOverride(proto, key) {
      const d = Object.getOwnPropertyDescriptor(proto, key);
      if (!d || 'get' in d) return;
      const v = d.value;
      Object.defineProperty(proto, key, {
        get() { return v },
        set(nv) {
          if (this === proto) return;
          Object.defineProperty(this, key, { value: nv, writable: true, enumerable: true, configurable: true });
        },
        enumerable: d.enumerable, configurable: true,
      });
    }
    const errorCtors = [Error, EvalError, RangeError, ReferenceError, SyntaxError, TypeError, URIError, AggregateError, globalThis.SuppressedError].filter(Boolean);
    const errorProtos = errorCtors.map(C => C.prototype);
    for (const [proto, keys] of [
      // All Object.prototype data props \u2014 Object.assign({}, {propertyIsEnumerable:x})
      // and friends would otherwise throw post-freeze. Accessor props (__proto__,
      // __define/lookupGetter__) are skipped by the 'get' in d guard above.
      [Object.prototype, Object.getOwnPropertyNames(Object.prototype)],
      [Function.prototype, ['toString', 'constructor', 'name', 'length']],
      [Array.prototype, ['toString', 'constructor']],
      [Date.prototype, ['toString', 'toLocaleString', 'valueOf', 'constructor']],
      ...errorProtos.map(p => [p, ['name', 'message', 'toString', 'constructor']]),
    ]) for (const k of keys) enableOverride(proto, k);
    // Error subclasses each have their own .prototype; freezing only Error
    // leaves TypeError.prototype.then etc. writable. SuppressedError is
    // from the explicit-resource-management proposal (bun/JSC ship it).
    for (const C of [Promise, Object, Array, Function, globalThis.Iterator,
                     Map, Set, WeakMap, WeakSet,
                     String, Number, Boolean, Symbol, BigInt,
                     Date, RegExp, ArrayBuffer, DataView,
                     ...errorCtors,
                     typeof URL !== 'undefined' ? URL : undefined,
                    ].filter(Boolean)) {
      Object.freeze(C);
      Object.freeze(C.prototype);
    }
    // %TypedArray% (shared prototype of all typed arrays) + each concrete.
    for (const C of [Object.getPrototypeOf(Int8Array),
                     Int8Array, Uint8Array, Uint8ClampedArray,
                     Int16Array, Uint16Array, Int32Array, Uint32Array,
                     globalThis.Float16Array, Float32Array, Float64Array,
                     BigInt64Array, BigUint64Array].filter(Boolean)) {
      Object.freeze(C);
      Object.freeze(C.prototype);
    }
    // %AsyncFunction%, %GeneratorFunction%, %AsyncGeneratorFunction% and
    // their .prototype are not reachable as globals \u2014 walk from instances.
    for (const f of [async()=>{}, function*(){}, async function*(){}]) {
      Object.freeze(f.constructor);
      Object.freeze(f.constructor.prototype);
    }
    for (const C of [globalThis.DisposableStack, globalThis.AsyncDisposableStack,
                     globalThis.Intl].filter(Boolean)) {
      Object.freeze(C);
      if (C.prototype) Object.freeze(C.prototype);
    }
    // Namespace objects (no .prototype) \u2014 VM code could otherwise set
    // JSON.then/Math.then/Reflect.then and any host await on the namespace
    // object (or on a VM value that aliases it) becomes a thenable escape.
    // Proxy has no .prototype but freeze closes Proxy.revocable tampering.
    for (const ns of [JSON, Math, Reflect, Proxy]) Object.freeze(ns);
    // globalThis can't be frozen (populateContext writes to it), but pinning
    // .then as non-configurable undefined prevents the sandbox object itself
    // from becoming a thenable via direct assignment, defineProperty, or
    // registerTool('then',...).
    Object.defineProperty(globalThis, 'then', {
      value: undefined, writable: false, configurable: false,
    });
    // Intl.* sub-constructors each have their own .prototype \u2014 freezing the
    // Intl namespace above does NOT freeze Intl.Collator.prototype etc.
    // Same own-property-.then escape shape as Promise.prototype.then if any
    // host code ever awaits an Intl.* instance.
    if (typeof Intl !== 'undefined') {
      for (const k of Object.getOwnPropertyNames(Intl)) {
        const C = Intl[k];
        if (typeof C === 'function') {
          Object.freeze(C);
          if (C.prototype) Object.freeze(C.prototype);
        }
      }
    }
    for (const it of [
      [][Symbol.iterator](),
      ''[Symbol.iterator](),
      new Map()[Symbol.iterator](),
      new Set()[Symbol.iterator](),
      'a'.matchAll(/a/g),
      // Iterator helpers (map/from) are stage-4 but guard for older runtimes.
      ...(typeof Iterator !== 'undefined' && Iterator.from ? [
        [].values().map(x=>x),
        // %WrapForValidIteratorPrototype% \u2014 Iterator.from(non-Iterator) wraps
        // via a distinct intrinsic prototype not reachable from any other path.
        Iterator.from({next:()=>({done:true})}),
      ] : []),
      (function*(){})(),
      (async function*(){})(),
      // %SegmentsPrototype% + %SegmentIteratorPrototype% \u2014 host for..of on a
      // VM Segments object would otherwise see a writable .then on the chain.
      ...(typeof Intl !== 'undefined' && Intl.Segmenter ? (s => [s, s[Symbol.iterator]()])(new Intl.Segmenter().segment('a')) : []),
    ]) {
      for (let p = Object.getPrototypeOf(it); p; p = Object.getPrototypeOf(p)) {
        Object.freeze(p);
      }
    }
    })()`, e);
  }
  function BTt(e) {
    return SZ.runInContext("(async v => ({__proto__: null, v: await v}))", e);
  }
  function pkl(e) {
    return SZ.runInContext("((fn, ...args) => fn(...args))", e);
  }
  function jer(e) {
    return SZ.runInContext(`(e => {
      let name = 'Error', message = '', stack = ''
      try { const v = e?.name; if (typeof v === 'string') name = v } catch {}
      try {
        const v = e?.message
        if (typeof v === 'string') message = v
        else if (typeof e === 'string') message = e
        else if (typeof e === 'number' || typeof e === 'boolean' || typeof e === 'bigint') {
          const s = \`\${e}\`
          if (typeof s === 'string') message = s
        }
      } catch {}
      try { const v = e?.stack; if (typeof v === 'string') stack = v } catch {}
      return { __proto__: null, name, message, stack }
    })`, e);
  }
  function qer(e) {
    return SZ.runInContext(`(() => {
      const _WeakMap = WeakMap, _WeakSet = WeakSet, _isArray = Array.isArray,
            _keys = Object.keys, _defineProperty = Object.defineProperty,
            _Error = Error, _isSafeInteger = Number.isSafeInteger
      // Closure-private registry of clone-created boundary-cap errors, so
      // the per-element/per-key catch blocks below can tell them apart from
      // an INCIDENTAL throw (a hostile getter / Proxy trap on a single
      // value). The cap error must propagate out of the whole clone at any
      // nesting depth; incidental throws still degrade that one slot to
      // undefined. Membership, NOT a tag property: childWorkflow feeds this
      // cloner parent-VM (attacker-reachable) values as childArgs, and a
      // thrown Proxy whose get trap answers true for any key would
      // fake-match a property-based check \u2014 the walker would then rethrow
      // the ATTACKER'S object to the host, whose error extraction reads
      // .message on it host-side. WeakSet.has is identity-based and runs
      // no attacker code.
      const _capSet = new _WeakSet()
      function capErr(msg) {
        const e = new _Error(msg)
        _capSet.add(e)
        return e
      }
      function isCap(e) {
        try { return _capSet.has(e) } catch { return false }
      }
      return (hostVal) => {
        const seen = new _WeakMap()
        function c(v) {
          if (typeof v === 'function') return undefined
          if (v === null || typeof v !== 'object') return v
          const hit = seen.get(v); if (hit !== undefined) return hit
          if (_isArray(v)) {
            // Read length ONCE \u2014 re-reading v.length per iteration lets a
            // Proxy length getter that increments make i < len never false
            // (infinite host-thread hang outside the VM sync-timeout). The
            // read is guarded: at the ROOT of the clone there is no
            // enclosing per-slot catch, so an unguarded read would let a
            // length getter throw an ATTACKER value out to host error
            // extraction with identity preserved \u2014 defeating the
            // only-walker-created-errors-propagate invariant (childArgs /
            // child-result inputs are attacker-reachable).
            let len
            try { len = v.length } catch {
              throw new _Error('unable to read array length across the workflow VM boundary')
            }
            if (typeof len !== 'number' || !_isSafeInteger(len)) {
              throw capErr('array length is not a safe integer across the workflow VM boundary')
            }
            if (len > ${4096}) {
              throw capErr('array length ' + len + ' exceeds the maximum of ${4096} supported across the workflow VM boundary')
            }
            const out = []; seen.set(v, out)
            for (let i = 0; i < len; i++) {
              try { out[i] = c(v[i]) } catch (e) { if (isCap(e)) throw e; out[i] = undefined }
            }
            return out
          }
          const out = {}; seen.set(v, out)
          let ks; try { ks = _keys(v) } catch { return out }
          for (const k of ks) {
            if (k === '__proto__') continue
            try {
              const vk = v[k]
              if (typeof vk === 'function') continue
              _defineProperty(out, k, { value: c(vk), writable: true, enumerable: true, configurable: true })
            } catch (e) { if (isCap(e)) throw e }
          }
          return out
        }
        return c(hostVal)
      }
    })()`, e);
  }
  function Wer(e) {
    return SZ.runInContext("(hostFn => async (...a) => hostFn(...a))", e);
  }
  function efe(e, t = "Error", n) {
    let r = () => `${t}: ${e}`;
    Object.setPrototypeOf(r, null);
    Object.freeze(r);
    let o = Object.freeze({
      __proto__: null,
      name: t,
      message: e,
      stack: n ?? `${t}: ${e}`,
      toString: r
    });
    c0m.add(o);
    return o;
  }
  function u0m() {
    if (!FLo) {
      let e = SZ.createContext({
        __proto__: null
      }, {
        codeGeneration: {
          strings: false,
          wasm: false
        }
      });
      WKe(e);
      FLo = SZ.runInContext(`(e => {
        // Independent try blocks \u2014 a throwing .name getter must not discard
        // an already-validated .message (and vice versa).
        let msg, name = 'Error', stack
        try {
          const m = e?.message
          msg = typeof m === 'string' ? m : typeof e === 'string' ? e : '<non-string error>'
        } catch { msg = '<unprintable thrown value>' }
        try {
          const n = e?.name
          if (typeof n === 'string') name = n
        } catch {}
        try {
          const s = e?.stack
          if (typeof s === 'string') stack = s
        } catch {}
        return { __proto__: null, msg, name, stack }
      })`, e);
    }
    return FLo;
  }
  function FYt(e) {
    try {
      let t = u0m()(e);
      return {
        msg: typeof t.msg === "string" ? t.msg : "<unprintable thrown value>",
        name: typeof t.name === "string" ? t.name : "Error",
        stack: typeof t.stack === "string" ? t.stack : undefined
      };
    } catch {
      return {
        msg: "<unprintable thrown value>",
        name: "Error"
      };
    }
  }
  function Ger(e) {
    if (e == null || typeof e !== "object" && typeof e !== "function") {
      return String(e);
    }
    return `[${typeof e}]`;
  }
  function TZ(e) {
    let t = (...n) => {
      try {
        return e(...n);
      } catch (r) {
        let {
          msg: o,
          name: s,
          stack: i
        } = FYt(r);
        throw efe(o, s, i);
      }
    };
    Object.setPrototypeOf(t, null);
    return t;
  }
  function Ver(e) {
    let t = async (...n) => {
      try {
        return await e(...n);
      } catch (r) {
        let {
          msg: o,
          name: s,
          stack: i
        } = FYt(r);
        throw efe(o, s, i);
      }
    };
    Object.setPrototypeOf(t, null);
    return t;
  }
  function ukl(e) {
    let t = Error(e);
    mkl.add(t);
    return t;
  }
  function dkl(e) {
    return typeof e === "object" && e !== null && mkl.vZc(e);
  }
  function fkl(e) {
    let t;
    try {
      t = e.length;
    } catch {
      throw Error("unable to read array length across the workflow VM boundary");
    }
    if (typeof t !== "number" || !Number.isSafeInteger(t)) {
      throw ukl("array length is not a safe integer across the workflow VM boundary");
    }
    if (t > 4096) {
      throw ukl(`array length ${t} exceeds the maximum of ${4096} supported across the workflow VM boundary`);
    }
    return t;
  }
  function LYt(e, t = new WeakMap()) {
    if (typeof e === "function") {
      return;
    }
    if (e === null || typeof e !== "object") {
      return e;
    }
    let n = t.get(e);
    if (n !== undefined) {
      return n;
    }
    if (Array.isArray(e)) {
      let s = [];
      t.set(e, s);
      let i = fkl(e);
      for (let a = 0; a < i; a++) {
        try {
          s[a] = LYt(e[a], t);
        } catch (l) {
          if (dkl(l)) {
            throw l;
          }
          s[a] = undefined;
        }
      }
      return s;
    }
    let r = {};
    t.set(e, r);
    let o;
    try {
      o = Object.keys(e);
    } catch {
      return r;
    }
    for (let s of o) {
      if (s === "__proto__") {
        continue;
      }
      try {
        let i = e[s];
        if (typeof i === "function") {
          continue;
        }
        r[s] = LYt(i, t);
      } catch (i) {
        if (dkl(i)) {
          throw i;
        }
      }
    }
    return r;
  }
  function zer(e) {
    if (e === null || typeof e !== "object") {
      return [];
    }
    let t = fkl(e);
    let n = [];
    for (let r = 0; r < t; r++) {
      try {
        n[r] = e[r];
      } catch {
        n[r] = undefined;
      }
    }
    return n;
  }
  function Ker(e) {
    return SZ.runInContext(`((S, JS) => ({
      vmToStr: v => { try { return S(v) } catch { return '<unprintable>' } },
      vmStringify: v => JS(v),
      vmOwnString: (o, k) => {
        try { const v = o == null ? undefined : o[k]; return typeof v === 'string' ? v : undefined }
        catch { return undefined }
      },
    }))(String, JSON.stringify)`, e);
  }
  function Yer(e) {
    return SZ.runInContext(`(() => {
      const _WeakMap = WeakMap, _WeakSet = WeakSet, _isArray = Array.isArray,
            _keys = Object.keys, _defineProperty = Object.defineProperty,
            _Error = Error, _isSafeInteger = Number.isSafeInteger
      // Closure-private registry of walker-created boundary-cap errors: the
      // cap error must propagate out of the whole walk at any nesting depth,
      // while incidental trap throws degrade one slot. Membership, NOT a
      // tag property: the input here is attacker-controlled, so a thrown
      // value can be a Proxy whose get trap answers true for ANY key \u2014 a
      // property-based isCap would fake-match and the walker would rethrow
      // the ATTACKER'S object to the host, whose error extraction then
      // reads .message on it host-side (the very escape this walker
      // exists to close). WeakSet.has is identity-based and runs no
      // attacker code, so only errors we created here ever propagate.
      const _capSet = new _WeakSet()
      function capErr(msg) {
        const e = new _Error(msg)
        _capSet.add(e)
        return e
      }
      function isCap(e) {
        try { return _capSet.has(e) } catch { return false }
      }
      function checkedLength(v) {
        let len
        try { len = v.length } catch {
          throw new _Error('unable to read array length across the workflow VM boundary')
        }
        if (typeof len !== 'number' || !_isSafeInteger(len)) {
          throw capErr('array length is not a safe integer across the workflow VM boundary')
        }
        if (len > ${4096}) {
          throw capErr('array length ' + len + ' exceeds the maximum of ${4096} supported across the workflow VM boundary')
        }
        return len
      }
      return { __proto__: null,
        sanitize: (inputV) => {
          const seen = new _WeakMap()
          function c(v) {
            if (typeof v === 'function') return undefined
            if (v === null || typeof v !== 'object') return v
            const hit = seen.get(v); if (hit !== undefined) return hit
            if (_isArray(v)) {
              const out = []; seen.set(v, out)
              const len = checkedLength(v)
              for (let i = 0; i < len; i++) {
                try { out[i] = c(v[i]) } catch (e) { if (isCap(e)) throw e; out[i] = undefined }
              }
              return out
            }
            const out = {}; seen.set(v, out)
            let ks; try { ks = _keys(v) } catch { return out }
            for (const k of ks) {
              if (k === '__proto__') continue
              try {
                const vk = v[k]
                if (typeof vk === 'function') continue
                _defineProperty(out, k, { value: c(vk), writable: true, enumerable: true, configurable: true })
              } catch (e) { if (isCap(e)) throw e }
            }
            return out
          }
          return c(inputV)
        },
        snapshot: (v) => {
          if (v === null || typeof v !== 'object') return []
          const len = checkedLength(v)
          const out = []
          for (let i = 0; i < len; i++) {
            try { out[i] = v[i] } catch { out[i] = undefined }
          }
          return out
        },
        getProp: (o, k) => {
          try { return o === null || o === undefined ? undefined : o[k] } catch { return undefined }
        },
      }
    })()`, e);
  }
  function $Tt(e) {
    if (typeof e === "string") {
      return e;
    }
    if (e === null || typeof e !== "object" && typeof e !== "function") {
      return String(e);
    }
    return typeof e === "function" ? "[function]" : "[object]";
  }
  var SZ;
  var c0m;
  var FLo;
  var mkl;
  var swe = __lazy(() => {
    SZ = __toESM(require("vm"));
    c0m = new WeakSet();
    mkl = new WeakSet();
  });