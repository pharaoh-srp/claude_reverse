  __export(aGc, {
    setupComputerUseMCP: () => setupComputerUseMCP
  });
  function setupComputerUseMCP() {
    let e = s5e(FOn, lht()).map(n => W6("computer-use", n.name));
    let t = rm() ? ["--computer-use-mcp"] : [sGc.join(iGc.fileURLToPath("file:///home/runner/work/claude-cli-internal/claude-cli-internal/src/utils/computerUse/setup.ts"), "..", "cli.js"), "--computer-use-mcp"];
    return {
      mcpConfig: {
        ["computer-use"]: {
          type: "stdio",
          command: process.execPath,
          args: t,
          scope: "dynamic"
        }
      },
      allowedTools: e
    };
  }
  var sGc;
  var iGc;
  var lGc = __lazy(() => {
    Hpt();
    EI();
    Cbe();
    cht();
    sGc = require("path");
    iGc = require("url");
  });
  function cGc(e) {
    return {
      skillId: e.id,
      name: e.name,
      description: e.description ?? "",
      source: e.source ?? "custom",
      updatedAt: e.updated_at ?? null
    };
  }
  function uGc(e) {
    return e.enabled !== false;
  }
  async function fGc(e = {}) {
    let t = NN();
    let n = t ? `${"/api/oauth/organizations/:orgUUID/skills/list-skills?include_wiggle_skills=true"}&entrypoint=${encodeURIComponent(t)}` : "/api/oauth/organizations/:orgUUID/skills/list-skills?include_wiggle_skills=true";
    try {
      let r = await _s.get(n, {
        auth: "teleport-org",
        isBackground: e.isBackground,
        timeout: 30000
      });
      if (!r.ok) {
        return {
          success: false,
          error: r.reason === "no-auth" ? r.detail : r.reason
        };
      }
      if (!Array.isArray(r.data?.skills)) {
        let s = mGc().safeParse(r.data);
        if (s.success) {
          let i = s.data.error.type ?? "error_envelope_no_type";
          wn("warn", "skills_sync_list_error", {
            serverError: i,
            status: r.status
          });
          return {
            success: false,
            error: i
          };
        }
        wn("warn", "skills_sync_list_malformed");
        return {
          success: false,
          error: "malformed list-skills response"
        };
      }
      return {
        success: true,
        skills: r.data.skills.filter(uGc).map(cGc)
      };
    } catch (r) {
      let {
        message: o
      } = YS(r);
      return {
        success: false,
        error: o
      };
    }
  }
  async function hGc(e, t, n = {}) {
    let r = NN();
    let o = r ? `?entrypoint=${encodeURIComponent(r)}` : "";
    try {
      let s = await _s.get(`/api/oauth/organizations/:orgUUID/skills/${encodeURIComponent(e)}/download${o}`, {
        auth: "teleport-org",
        isBackground: n.isBackground,
        timeout: 300000,
        responseType: "arraybuffer"
      });
      if (!s.ok || !s.data) {
        wn("warn", "skills_sync_download_not_ok", {
          reason: s.ok ? "empty_body" : s.reason
        });
        return false;
      }
      let i = Buffer.from(s.data);
      if (i.length < 2 || i[0] !== 80 || i[1] !== 75) {
        wn("warn", "skills_sync_download_not_zip", {
          serverError: JHf(i),
          bodyLen: i.length
        });
        return false;
      }
      await pGc.writeFile(t, i);
      return true;
    } catch (s) {
      let {
        kind: i
      } = YS(s);
      wn("warn", "skills_sync_download_exception", {
        kind: i
      });
      return false;
    }
  }
  function JHf(e) {
    try {
      let t = mGc().safeParse(qt(e.toString("utf8", 0, 2048)));
      if (t.success) {
        return t.data.error.type ?? "error_envelope_no_type";
      }
    } catch {}
    return "non_json_body";
  }
  var pGc;
  var mGc;
  var gGc = __lazy(() => {
    qg();
    Zm();
    $A();
    dt();
    bg();
    pGc = require("fs/promises");
    mGc = we(() => Ke.object({
      error: Ke.object({
        type: Ke.string().optional()
      })
    }));
  });
  function SGc() {
    let e = Me.CLAUDE_CODE_SYNC_SKILLS_WAIT_TIMEOUT_MS;
    return e && e > 0 ? e : 5000;
  }
  function TGc() {
    let e = Me.CLAUDE_CODE_SYNC_SKILLS_INSTALL_TIMEOUT_MS;
    return e && e > 0 ? e : 30000;
  }
  function Zts() {
    if (!Xts) {
      let e;
      Xts = {
        promise: new Promise(n => {
          e = n;
        }),
        resolve: e
      };
    }
    return Xts;
  }
  function vGc() {
    if (EGc ??= tbr(), !Qts) {
      Qts = setInterval(() => void tbr(), 600000);
      Qts.unref?.();
    }
  }
  function wGc() {
    let e = Zts();
    EGc ??= tbr();
    return e.promise;
  }
  async function CGc() {
    await Yxt?.catch(() => {});
    return tbr();
  }
  function ZHf() {
    d8e();
    g$.emit();
  }
  function msn() {
    return pD.join(er(), "skills");
  }
  function RGc() {
    return pD.join(msn(), "manifest.json");
  }
  async function ejf() {
    try {
      let e = await HH.readFile(RGc(), "utf8");
      return qt(e);
    } catch {
      return null;
    }
  }
  async function tjf(e) {
    await HH.mkdir(msn(), {
      recursive: true
    });
    await Fm(RGc(), De(e, null, 2));
  }
  function ens() {
    return pD.join(msn(), ".staging");
  }
  function Jxt(e) {
    let t = e.replace(/[<>"|?*\\/]/g, "_");
    let n = msn();
    let r = pD.join(n, t);
    let o = pD.relative(n, r);
    if (!o || pD.isAbsolute(o) || o === ".." || o.startsWith(`..${pD.sep}`)) {
      throw Error(`invalid skill name: ${e}`);
    }
    return r;
  }
  function njf(e, t) {
    let n = new Map(t.map(l => [l.skillId, l]));
    let r = new Set(e.map(l => l.skillId));
    let o = new Set();
    let s = [];
    let i = [];
    for (let l of e) {
      let c = n.get(l.skillId);
      let u;
      try {
        u = Jxt(l.name);
      } catch {
        if (wn("warn", "skills_sync_invalid_name"), c) {
          i.push(c);
        }
        continue;
      }
      if (o.vZc(u)) {
        if (wn("warn", "skills_sync_name_collision"), c) {
          i.push(c);
        }
        continue;
      }
      if (o.add(u), !c || c.updatedAt !== l.updatedAt || c.name !== l.name) {
        s.push({
          skill: l,
          prev: c
        });
      } else {
        i.push(c);
      }
    }
    let a = t.filter(l => !r.vZc(l.skillId));
    return {
      toDownload: s,
      toRemove: a,
      carryover: i,
      liveDirs: o
    };
  }
  function rjf(e) {
    let t = Jxt(e.name);
    let n = pD.basename(t);
    let r = g6t({
      skillName: n,
      displayName: undefined,
      description: e.description,
      hasUserSpecifiedDescription: true,
      markdownContent: "",
      allowedTools: [],
      argumentHint: undefined,
      argumentNames: [],
      whenToUse: undefined,
      version: undefined,
      model: undefined,
      disableModelInvocation: false,
      userInvocable: true,
      source: "userSettings",
      baseDir: t,
      loadedFrom: "skills",
      hooks: undefined,
      executionContext: undefined,
      agent: undefined,
      paths: undefined,
      effort: undefined,
      shell: undefined
    });
    if (r.type === "prompt") {
      r.getPromptForCommand = async (o, s) => {
        let i = await HXn(n);
        if (i.ok) {
          let l = findCommand(n, await getCommands(getProjectRoot()));
          if (l && l.type === "prompt" && l !== r) {
            r.allowedTools = l.allowedTools;
            r.hooks = l.hooks;
            r.model = l.model;
            r.effort = l.effort;
            r.getEffort = l.getEffort;
            r.source = l.source;
            r.skillRoot = l.skillRoot;
            r.contentLength = l.contentLength;
            r.progressMessage = l.progressMessage;
            r.userInvocable = l.userInvocable;
            return l.getPromptForCommand(o, s);
          }
        }
        let a = i.ok ? "skill not found after download" : i.reason;
        return [{
          type: "text",
          text: `Skill ${n} could not be downloaded (${a}). Proceed without it.`
        }];
      };
    }
    return r;
  }
  async function _Gc(e) {
    let t = Jxt(e.name);
    let n = pD.join(ens(), pD.relative(msn(), t));
    let r = pD.join(F2(), `claude-skill-${process.pid}-${Math.random().toString(36).slice(2)}.zip`);
    try {
      if (!(await hGc(e.skillId, r, {
        isBackground: true
      }))) {
        return false;
      }
      await HH.rm(n, {
        recursive: true,
        force: true
      });
      await HH.mkdir(ens(), {
        recursive: true
      });
      await IFe(r, n);
      let s = n;
      let i = await HH.readdir(n, {
        withFileTypes: true
      });
      if (!i.some(a => a.name === "SKILL.md") && i.length === 1 && i[0].isDirectory()) {
        s = pD.join(n, i[0].name);
      }
      await HH.rm(t, {
        recursive: true,
        force: true
      });
      await HH.rename(s, t);
      return true;
    } finally {
      await HH.rm(r, {
        force: true
      }).catch(() => {});
      await HH.rm(n, {
        recursive: true,
        force: true
      }).catch(() => {});
    }
  }
  async function sjf(e) {
    try {
      return await _Gc(e);
    } catch {
      wn("warn", "skills_sync_extract_retry");
      await sleep(500);
      return _Gc(e);
    }
  }
  async function bGc(e, t, n) {
    let r = 0;
    let o = Array.from({
      length: Math.min(t, e.length)
    }, async () => {
      while (true) {
        let s = r++;
        if (s >= e.length) {
          return;
        }
        await n(e[s]);
      }
    });
    await Promise.all(o);
  }
  async function tbr() {
    if (Yxt) {
      return Yxt;
    }
    Yxt = ijf().finally(() => {
      Yxt = null;
    });
    return Yxt;
  }
  async function ijf() {
    let e = Date.now();
    let t = new Map();
    try {
      wn("info", "skills_sync_starting");
      let n = await fGc({
        isBackground: true
      });
      if (!n.success) {
        wn("warn", "skills_sync_list_failed", {
          duration_ms: Date.now() - e
        });
        logEvent("tengu_skills_sync_list_failed", {
          duration_ms: Date.now() - e
        });
        return;
      }
      let r = await ejf();
      let {
        toDownload: o,
        toRemove: s,
        carryover: i,
        liveDirs: a
      } = njf(n.skills, r?.skills ?? []);
      let l = async m => {
        try {
          let f = Jxt(m);
          if (a.vZc(f)) {
            return;
          }
          await HH.rm(f, {
            recursive: true,
            force: true
          });
        } catch {}
      };
      await HH.rm(ens(), {
        recursive: true,
        force: true
      }).catch(() => {});
      let c = new Set(Array.from(a, m => pD.basename(m)));
      if (xyl(c) > 0) {
        clearCommandMemoizationCaches();
        g$.emit();
      }
      if (o.length === 0 && s.length === 0) {
        wn("info", "skills_sync_no_changes", {
          duration_ms: Date.now() - e
        });
        return;
      }
      let u = 0;
      for (let {
        skill: m,
        prev: f
      } of o) {
        if (!f) {
          wyl(rjf(m));
          u++;
          t.set(m.skillId, vyl(pD.basename(Jxt(m.name))));
        }
      }
      if (u > 0) {
        clearCommandMemoizationCaches();
        g$.emit();
      }
      Zts().resolve();
      let d = [];
      let p = [];
      await bGc(o, 15, async ({
        skill: m,
        prev: f
      }) => {
        let h = false;
        try {
          h = await sjf(m);
        } catch {
          wn("warn", "skills_sync_extract_failed");
        }
        if (h) {
          if (d.push(m), f && f.name !== m.name) {
            await l(f.name);
          }
          Cyl(pD.basename(Jxt(m.name)));
          d8e();
          clearCommandMemoizationCaches();
        } else if (f) {
          p.push(f);
        }
        t.get(m.skillId)?.(h ? {
          ok: true
        } : {
          ok: false,
          reason: "download failed"
        });
      });
      await bGc(s, 15, m => l(m.name));
      ZHf();
      await tjf({
        lastUpdated: Date.now(),
        skills: [...i, ...d, ...p]
      });
      wn("info", "skills_sync_complete", {
        downloaded: d.length,
        removed: s.length,
        duration_ms: Date.now() - e
      });
      logEvent("tengu_skills_sync_success", {
        downloaded: d.length,
        removed: s.length,
        total: n.skills.length,
        duration_ms: Date.now() - e
      });
    } catch {
      wn("error", "skills_sync_unexpected_error", {
        duration_ms: Date.now() - e
      });
      logEvent("tengu_skills_sync_error", {
        duration_ms: Date.now() - e
      });
    } finally {
      for (let n of t.values()) {
        n({
          ok: false,
          reason: "skills sync failed"
        });
      }
      Zts().resolve();
    }
  }
  var HH;
  var pD;
  var Yxt = null;
  var EGc = null;
  var Xts = null;
  var Qts = null;
  var xGc = __lazy(() => {
    at();
    Bm();
    T9();
    BT();
    Zm();
    pr();
    gn();
    PFe();
    ODe();
    BC();
    Ot();
    gGc();
    y7t();
    HH = require("fs/promises");
    pD = require("path");
  });
  function kGc(e) {
    return {
      pluginId: e.id,
      name: e.name,
      description: e.description ?? "",
      version: e.version ?? null,
      updatedAt: e.updated_at ?? null
    };
  }
  function AGc(e) {
    return e.enabled !== false;
  }
  function cjf() {
    return Me.CLAUDE_CODE_SYNC_PLUGINS_DOWNLOAD_STALL_MS ?? 60000;
  }
  async function NGc(e) {
    let t = await e();
    if ("success" in t ? t.success : t.ok) {
      return t;
    }
    await sleep(500);
    return e();
  }
  async function LGc(e = {}) {
    return NGc(() => djf(e));
  }
  async function djf(e) {
    let t = [];
    try {
      for (let n = 0; n < 20; n++) {
        let r = n * 100;
        let o = await _s.get(`${"/api/oauth/organizations/:orgUUID/plugins/list-plugins?enabled_only=true&compact=true"}&limit=${100}&offset=${r}`, {
          auth: "teleport-org",
          isBackground: e.isBackground,
          timeout: 1e4
        });
        if (!o.ok) {
          return {
            success: false,
            error: o.reason === "no-auth" ? o.detail : o.reason
          };
        }
        if (!Array.isArray(o.data?.plugins)) {
          let s = MGc().safeParse(o.data);
          if (s.success) {
            let i = s.data.error.type ?? "error_envelope_no_type";
            wn("warn", "plugins_sync_list_error", {
              serverError: i,
              status: o.status
            });
            return {
              success: false,
              error: i
            };
          }
          wn("warn", "plugins_sync_list_malformed");
          return {
            success: false,
            error: "malformed list-plugins response"
          };
        }
        for (let s of o.data.plugins) {
          if (AGc(s)) {
            t.push(kGc(s));
          }
        }
        if (o.data.has_more !== true) {
          return {
            success: true,
            plugins: t
          };
        }
      }
      wn("warn", "plugins_sync_list_page_cap", {
        pages: 20,
        collected: t.length
      });
      return {
        success: false,
        error: `list-plugins page cap (${20}) exceeded`
      };
    } catch (n) {
      let {
        message: r
      } = YS(n);
      return {
        success: false,
        error: r
      };
    }
  }
  async function FGc(e, t, n = {}) {
    return NGc(() => pjf(e, t, n));
  }
  async function pjf(e, t, n) {
    if (Me.CLAUDE_CODE_SYNC_PLUGINS_BUFFERED_DOWNLOAD) {
      return mjf(e, t, n);
    }
    let r = 0;
    let o = false;
    try {
      let c = function () {
        o = true;
        l.destroy(Error("plugin download stream stalled"));
      };
      let s = await _s.get(`/api/oauth/organizations/:orgUUID/plugins/${encodeURIComponent(e)}/download`, {
        auth: "teleport-org",
        isBackground: n.isBackground,
        timeout: 60000,
        responseType: "stream"
      });
      if (!s.ok || !s.data) {
        let m = s.ok ? "empty_body" : s.reason;
        wn("warn", "plugins_sync_download_not_ok", {
          reason: m
        });
        return {
          ok: false,
          reason: m
        };
      }
      let i = cjf();
      let a;
      let l = new OGc.Transform({
        transform(m, f, h) {
          if (clearTimeout(a), a = setTimeout(c, i), r += m.length, r > 268435456) {
            h(Error("plugin zip exceeds download byte cap"));
          } else {
            h(null, m);
          }
        },
        flush(m) {
          clearTimeout(a);
          m();
        }
      });
      a = setTimeout(c, i);
      try {
        await DGc.pipeline(s.data, l, PGc.createWriteStream(t));
      } finally {
        clearTimeout(a);
      }
      let u = Buffer.alloc(2048);
      let d = await LXe.open(t, "r");
      let p;
      try {
        p = (await d.read(u, 0, u.length, 0)).bytesRead;
      } finally {
        await d.close();
      }
      if (p < 2 || u[0] !== 80 || u[1] !== 75) {
        await LXe.rm(t, {
          force: true
        });
        let m = p === 0 ? "empty_body" : UGc(u.subarray(0, p));
        wn("warn", "plugins_sync_download_not_zip", {
          serverError: m,
          bodyLen: r
        });
        return {
          ok: false,
          reason: m
        };
      }
      return {
        ok: true
      };
    } catch (s) {
      await LXe.rm(t, {
        force: true
      }).catch(() => {});
      let i = s?.response?.data;
      if (i !== null && typeof i === "object" && "destroy" in i && typeof i.destroy === "function") {
        i.destroy();
      }
      let a = s !== null && typeof s === "object" && "code" in s ? s.code : undefined;
      let l = o ? "timeout" : r > 268435456 ? "too_large" : a === "ECONNRESET" || a === "EPIPE" || a === "ETIMEDOUT" ? "network" : YS(s).kind;
      wn("warn", "plugins_sync_download_exception", {
        kind: l
      });
      return {
        ok: false,
        reason: l
      };
    }
  }
  async function mjf(e, t, n) {
    try {
      let r = await _s.get(`/api/oauth/organizations/:orgUUID/plugins/${encodeURIComponent(e)}/download`, {
        auth: "teleport-org",
        isBackground: n.isBackground,
        timeout: 60000,
        responseType: "arraybuffer",
        maxContentLength: 268435456
      });
      if (!r.ok || !r.data) {
        let s = r.ok ? "empty_body" : r.reason;
        wn("warn", "plugins_sync_download_not_ok", {
          reason: s
        });
        return {
          ok: false,
          reason: s
        };
      }
      let o = Buffer.from(r.data);
      if (o.length < 2 || o[0] !== 80 || o[1] !== 75) {
        let s = o.length === 0 ? "empty_body" : UGc(o);
        wn("warn", "plugins_sync_download_not_zip", {
          serverError: s,
          bodyLen: o.length
        });
        return {
          ok: false,
          reason: s
        };
      }
      await LXe.writeFile(t, o);
      return {
        ok: true
      };
    } catch (r) {
      let {
        kind: o
      } = YS(r);
      wn("warn", "plugins_sync_download_exception", {
        kind: o
      });
      return {
        ok: false,
        reason: o
      };
    }
  }
  function UGc(e) {
    try {
      let t = MGc().safeParse(qt(e.toString("utf8", 0, 2048)));
      if (t.success) {
        return t.data.error.type ?? "error_envelope_no_type";
      }
    } catch {}
    return "non_json_body";
  }
  var PGc;
  var LXe;
  var OGc;
  var DGc;
  var MGc;
  var BGc = __lazy(() => {
    qg();
    Zm();
    pr();
    dt();
    bg();
    PGc = require("fs");
    LXe = require("fs/promises");
    OGc = require("stream");
    DGc = require("stream/promises");
    MGc = we(() => Ke.object({
      error: Ke.object({
        type: Ke.string().optional()
      })
    }));
  });
  function hsn() {
    return st(process.env.CLAUDE_CODE_SYNC_PLUGINS);
  }
  function gsn() {
    let e = parseInt(process.env.CLAUDE_CODE_SYNC_PLUGINS_INSTALL_TIMEOUT_MS || "", 10);
    return e > 0 ? e : 30000;
  }
  function JGc() {
    let e = process.env.CLAUDE_CODE_SYNC_PLUGINS_MCP_TIMEOUT_MS;
    if (e !== undefined && e !== "") {
      let t = parseInt(e, 10);
      if (Number.isFinite(t) && t >= 0) {
        return t;
      }
    }
    return 1e4;
  }
  function QGc() {
    Xxt ??= ons();
  }
  function ZGc() {
    Xxt ??= ons();
    return Xxt;
  }
  function e9c() {
    Xxt = (Xxt ?? Promise.resolve()).catch(() => {}).then(() => ons());
    return Xxt;
  }
  function t9c() {
    return rbr;
  }
  function ysn() {
    return hB.join(er(), "plugins", "synced");
  }
  function n9c() {
    return hB.join(ysn(), "manifest.json");
  }
  async function r9c() {
    try {
      let e = await _P.readFile(n9c(), "utf8");
      return qt(e);
    } catch {
      return null;
    }
  }
  async function hjf(e) {
    await _P.mkdir(ysn(), {
      recursive: true
    });
    await Fm(n9c(), De(e, null, 2));
  }
  function nbr() {
    return hB.join(ysn(), ".staging");
  }
  function fsn(e) {
    let t = e.replace(/[<>:"|?*\\/]/g, "_");
    let n = t.toLowerCase();
    if (n === "manifest.json" || n === ".staging") {
      throw Error("plugin name resolves to reserved path");
    }
    let r = ysn();
    let o = hB.join(r, t);
    let s = hB.relative(r, o);
    if (!s || hB.isAbsolute(s) || s === ".." || s.startsWith(`..${hB.sep}`)) {
      throw Error(`invalid plugin name: ${e}`);
    }
    return o;
  }
  function gjf(e, t) {
    let n = new Map(t.map(l => [l.pluginId, l]));
    let r = new Set(e.map(l => l.pluginId));
    let o = new Set();
    let s = [];
    let i = [];
    for (let l of e) {
      let c = n.get(l.pluginId);
      let u;
      try {
        u = fsn(l.name);
      } catch {
        if (wn("warn", "plugins_sync_invalid_name"), c) {
          i.push(c);
        }
        continue;
      }
      if (o.vZc(u)) {
        if (wn("warn", "plugins_sync_name_collision"), c) {
          i.push(c);
        }
        continue;
      }
      if (o.add(u), !c || c.updatedAt !== l.updatedAt || c.name !== l.name) {
        s.push({
          plugin: l,
          prev: c
        });
      } else {
        i.push(c);
      }
    }
    let a = t.filter(l => !r.vZc(l.pluginId));
    return {
      toDownload: s,
      toRemove: a,
      carryover: i,
      liveDirs: o
    };
  }
  async function HGc(e, t) {
    let n = fsn(e.name);
    let r = hB.join(nbr(), hB.relative(ysn(), n));
    let o = hB.join(F2(), `claude-plugin-${process.pid}-${Math.random().toString(36).slice(2)}.zip`);
    try {
      let s = Date.now();
      let i = await FGc(e.pluginId, o, {
        isBackground: true
      });
      if (t.downloadMs.push(Date.now() - s), !i.ok) {
        return i;
      }
      let a = Date.now();
      try {
        await _P.rm(r, {
          recursive: true,
          force: true
        });
        await _P.mkdir(nbr(), {
          recursive: true
        });
        let l = await execFileNoThrow("unzip", ["-q", "-o", o, "-d", r]);
        let c = l.code === 0 ? await bjf(r).catch(() => "walk_failed") : "unzip_failed";
        if (c !== "ok") {
          wn("info", "plugins_sync_unzip_fallback", {
            code: l.code,
            verdict: c
          });
          await _P.rm(r, {
            recursive: true,
            force: true
          });
          await IFe(o, r);
        }
        let u = await resolvePluginRoot(r);
        let d = hB.join(nbr(), `.trash-${process.pid}-${Math.random().toString(36).slice(2)}`);
        try {
          await _P.rename(n, d);
          XGc.push(_P.rm(d, {
            recursive: true,
            force: true
          }).catch(() => {}));
        } catch {
          await _P.rm(n, {
            recursive: true,
            force: true
          });
        }
        await _P.rename(u, n);
        return {
          ok: true
        };
      } finally {
        t.extractMs.push(Date.now() - a);
      }
    } finally {
      await _P.rm(o, {
        force: true
      }).catch(() => {});
      await _P.rm(r, {
        recursive: true,
        force: true
      }).catch(() => {});
    }
  }
  async function _jf(e, t) {
    try {
      return await HGc(e, t);
    } catch {
      wn("warn", "plugins_sync_extract_retry");
      await sleep(500);
      return HGc(e, t);
    }
  }
  async function bjf(e, t = 536870912) {
    let n = 0;
    let r;
    async function o(a) {
      for (let l = 0; l < a.length && !r; l += 256) {
        let c = a.slice(l, l + 256);
        for (let u of await Promise.all(c.map(d => _P.lstat(d)))) {
          if (n += u.size, n > t) {
            r = "oversize";
            return;
          }
        }
      }
    }
    async function s(a) {
      for (let l = 0; l < a.length && !r; l += 16) {
        await Promise.all(a.slice(l, l + 16).map(i));
      }
    }
    async function i(a) {
      if (r) {
        return;
      }
      let l = [];
      let c = [];
      for (let u of await _P.readdir(a, {
        withFileTypes: true
      })) {
        if (u.isSymbolicLink()) {
          r = "symlink";
          return;
        }
        if (u.isDirectory()) {
          l.push(hB.join(a, u.name));
        } else {
          c.push(hB.join(a, u.name));
        }
      }
      if (r) {
        return;
      }
      await Promise.all([o(c), s(l)]);
    }
    await i(e);
    return r ?? "ok";
  }
  async function WGc(e, t, n) {
    let r = 0;
    let o = Array.from({
      length: Math.min(t, e.length)
    }, async () => {
      while (true) {
        let s = r++;
        if (s >= e.length) {
          return;
        }
        await n(e[s]);
      }
    });
    await Promise.all(o);
  }
  function GGc(e, t, n) {
    let r = `${e.name}@synced`;
    rbr.push(t === "network-error" ? {
      type: t,
      source: r,
      plugin: e.name,
      url: e.pluginId,
      details: n
    } : {
      type: t,
      source: r,
      plugin: e.name,
      error: n
    });
  }
  async function ons() {
    let e = Date.now();
    rbr = [];
    let t;
    try {
      t = KGc.monitorEventLoopDelay({
        resolution: 20
      });
      t.enable();
    } catch {}
    let n = () => {
      if (!t) {
        return {};
      }
      t.disable();
      return {
        loop_lag_p95_ms: Math.round(t.percentile(95) / 1e6),
        loop_lag_max_ms: Math.round(t.max / 1e6)
      };
    };
    let r;
    let o = {
      downloadMs: [],
      extractMs: []
    };
    try {
      wn("info", "plugins_sync_starting");
      let s = Date.now();
      let i = await LGc({
        isBackground: true
      });
      if (r = Date.now() - s, !i.success) {
        let E = n();
        wn("warn", "plugins_sync_list_failed", {
          duration_ms: Date.now() - e,
          list_ms: r,
          ...E
        });
        logEvent("tengu_plugins_sync_list_failed", {
          duration_ms: Date.now() - e,
          list_ms: r,
          ...E
        });
        await zGc();
        return;
      }
      let a = await r9c();
      let l = a !== null;
      let {
        toDownload: c,
        toRemove: u,
        carryover: d,
        liveDirs: p
      } = gjf(i.plugins, a?.plugins ?? []);
      let m = async E => {
        try {
          let C = fsn(E);
          if (p.vZc(C)) {
            return;
          }
          await _P.rm(C, {
            recursive: true,
            force: true
          });
        } catch {}
      };
      if (await Promise.all(XGc.splice(0)), await _P.rm(nbr(), {
        recursive: true,
        force: true
      }).catch(() => {}), c.length === 0 && u.length === 0) {
        setSyncedPluginDirs([...p]);
        wn("info", "plugins_sync_no_changes", {
          count: d.length,
          duration_ms: Date.now() - e,
          list_ms: r,
          had_manifest: l,
          ...n()
        });
        return;
      }
      let f = [];
      let h = [];
      let g = Date.now();
      await WGc(c, 6, async ({
        plugin: E,
        prev: C
      }) => {
        let x;
        try {
          if (x = await _jf(E, o), !x.ok) {
            wn("warn", "plugins_sync_download_failed");
            GGc(E, "network-error", x.reason);
          }
        } catch (A) {
          x = {
            ok: false,
            reason: he(A)
          };
          wn("warn", "plugins_sync_extract_failed");
          GGc(E, "generic-error", x.reason);
        }
        if (x.ok) {
          if (f.push(E), C && C.name !== E.name) {
            await m(C.name);
          }
        } else if (C) {
          h.push(C);
        }
      });
      let y = Date.now() - g;
      let _ = VGc(o);
      await WGc(u, 6, E => m(E.name));
      let b = [...d, ...f, ...h];
      setSyncedPluginDirs(b.map(E => fsn(E.name)));
      await hjf({
        lastUpdated: Date.now(),
        plugins: b
      });
      let S = n();
      wn("info", "plugins_sync_complete", {
        downloaded: f.length,
        removed: u.length,
        failed: rbr.length,
        duration_ms: Date.now() - e,
        list_ms: r,
        download_extract_ms: y,
        had_manifest: l,
        ..._,
        ...S
      });
      logEvent("tengu_plugins_sync_success", {
        downloaded: f.length,
        removed: u.length,
        total: i.plugins.length,
        duration_ms: Date.now() - e,
        list_ms: r,
        download_extract_ms: y,
        had_manifest: l,
        ..._,
        ...S
      });
    } catch (s) {
      let i = n();
      let a = {
        ...(r !== undefined && {
          list_ms: r
        }),
        ...(o.downloadMs.length > 0 && VGc(o))
      };
      wn("error", "plugins_sync_unexpected_error", {
        kind: s instanceof Error ? s.constructor.name : "unknown",
        duration_ms: Date.now() - e,
        ...a,
        ...i
      });
      logEvent("tengu_plugins_sync_error", {
        duration_ms: Date.now() - e,
        ...a,
        ...i
      });
      await zGc();
    }
  }
  function VGc(e) {
    return {
      download_ms_sum: e.downloadMs.reduce((t, n) => t + n, 0),
      download_ms_max: Math.max(0, ...e.downloadMs),
      extract_ms_sum: e.extractMs.reduce((t, n) => t + n, 0),
      extract_ms_max: Math.max(0, ...e.extractMs)
    };
  }
  async function zGc() {
    let e = await r9c();
    if (!e) {
      return;
    }
    let t = [];
    for (let n of e.plugins) {
      try {
        t.push(fsn(n.name));
      } catch {}
    }
    setSyncedPluginDirs(t);
  }
  var _P;
  var hB;
  var KGc;
  var Xxt = null;
  var rbr;
  var XGc;
  var sns = __lazy(() => {
    at();
    BT();
    Zm();
    gn();
    dt();
    ji();
    xg();
    PFe();
    BC();
    Ot();
    BGc();
    _P = require("fs/promises");
    hB = require("path");
    KGc = require("perf_hooks");
    rbr = [];
    XGc = [];
  });
  var obr;
  var Sjf;
  var AJv;
  var Tjf;
  var IJv;
  var Ejf;
  var PJv;
  var OJv;
  var vjf;
  var wjf;
  var Cjf;
  var DJv;
  var lns;
  var sbr;
  var s9c;
  var Rjf;
  var i9c;
  var xjf;
  var kjf;
  var Ajf;
  var ibr;
  var Ijf;
  var Pjf;
  var cns;
  var MJv;
  var Qxt;
  var ins;
  var Ojf;
  var ans;
  var _sn;
  var o9c;
  var NJv;
  var mRe;
  var Djf;
  var a9c;
  var BS;
  var Mjf;
  var Njf;
  var Ljf;
  var Fjf;
  var Ujf;
  var Bjf;
  var $jf;
  var Hjf;
  var jjf;
  var qjf;
  var Wjf;
  var Gjf;
  var l9c;
  var c9c;
  var Vjf;
  var zjf;
  var Kjf;
  var Yjf;
  var Jjf;
  var Xjf;
  var Qjf;
  var Zjf;
  var eqf;
  var tqf;
  var nqf;
  var rqf;
  var oqf;
  var sqf;
  var iqf;
  var aqf;
  var lqf;
  var cqf;
  var uqf;
  var dqf;
  var pqf;
  var mqf;
  var fqf;
  var hqf;
  var u9c;
  var gqf;
  var yqf;
  var _qf;
  var bqf;
  var Sqf;
  var Tqf;
  var Eqf;
  var vqf;
  var wqf;
  var Cqf;
  var Rqf;
  var xqf;
  var kqf;
  var Aqf;
  var Iqf;
  var Pqf;
  var Oqf;
  var Dqf;
  var Mqf;
  var Nqf;
  var Lqf;
  var Fqf;
  var LJv;
  var bsn;
  var uns;
  var abr;
  var d9c;
  var Uqf;
  var p9c;
  var FJv;
  var UJv;
  var BJv;
  var Bqf;
  var $qf;
  var Hqf;
  var wa;
  var m9c;
  var dns;
  var jqf;
  var pns;
  var f9c;
  var mns;
  var qqf;
  var h9c;
  var Wqf;
  var Gqf;
  var Vqf;
  var g9c;
  var zqf;
  var y9c;
  var Kqf;
  var Yqf;
  var Jqf;
  var _9c;
  var Xqf;
  var Qqf;
  var Zqf;
  var e3f;
  var fns;
  var hns;
  var t3f;
  var $Jv;
  var HJv;
  var jJv;
  var qJv;
  var WJv;
  var GJv;
  var gns;
  var n3f;
  var r3f;
  var o3f;
  var s3f;
  var i3f;
  var VJv;
  var zJv;
  var KJv;
  var YJv;
  var JJv;
  var XJv;
  var a3f;
  var l3f;
  var c3f;
  var u3f;
  var d3f;
  var p3f;
  var m3f;
  var f3f;
  var h3f;
  var g3f;
  var y3f;
  var _3f;
  var b3f;
  var S3f;
  var T3f;
  var E3f;
  var v3f;
  var w3f;
  var C3f;
  var R3f;
  var x3f;
  var k3f;
  var QJv;
  var ZJv;
  var A3f;
  var eXv;
  var tXv;
  var nXv;
  var rXv;
  var oXv;
  var yns;
  var sXv;
  var iXv;
  var aXv;
  var lXv;
  var cXv;
  var uXv;
  var dXv;
  var pXv;
  var mXv;
  var _ns;
  var Ssn;
  var b9c = __lazy(() => {
    Pfr();
    obr = we(() => v.object({
      inputTokens: v.number(),
      outputTokens: v.number(),
      cacheReadInputTokens: v.number(),
      cacheCreationInputTokens: v.number(),
      webSearchRequests: v.number(),
      costUSD: v.number(),
      contextWindow: v.number(),
      maxOutputTokens: v.number()
    }));
    Sjf = we(() => v.literal("json_schema"));
    AJv = we(() => v.object({
      type: Sjf()
    }));
    Tjf = we(() => v.object({
      type: v.literal("json_schema"),
      schema: v.record(v.string(), v.unknown())
    }));
    IJv = we(() => Tjf());
    Ejf = we(() => v.enum(["user", "project", "org", "temporary", "oauth"]));
    PJv = we(() => v.enum(["local", "user", "project"]).describe("Config scope for settings."));
    OJv = we(() => v.literal("context-1m-2025-08-07"));
    vjf = we(() => v.object({
      type: v.literal("adaptive"),
      display: v.enum(["summarized", "omitted"]).optional()
    }).describe("Claude decides when and how much to think (Opus 4.6+)."));
    wjf = we(() => v.object({
      type: v.literal("enabled"),
      budgetTokens: v.number().optional(),
      display: v.enum(["summarized", "omitted"]).optional()
    }).describe("Fixed thinking token budget (older models)"));
    Cjf = we(() => v.object({
      type: v.literal("disabled")
    }).describe("No extended thinking"));
    DJv = we(() => v.union([vjf(), wjf(), Cjf()]).describe("Controls Claude's thinking/reasoning behavior. When set, takes precedence over the deprecated maxThinkingTokens."));
    lns = we(() => v.literal("comms").optional().catch(undefined).describe("@internal Coordinator-mode role for this MCP server. 'comms' marks the server the coordinator uses to address the user; the coordinator tool filter lets comms-roled servers' tools through. Claude Code extension to .mcp.json \u2014 host-side config, not part of the MCP wire protocol. Coordinator mode is activated via the CLAUDE_CODE_COORDINATOR_MODE environment variable; this field only takes effect when coordinator mode is active."));
    sbr = we(() => v.number().int().positive().optional().describe("Per-server tool-call timeout in milliseconds. Overrides the MCP_TOOL_TIMEOUT environment variable for this server. Hard wall-clock limit per call; progress notifications do not extend it. Values below 1000ms are ignored (falls through to MCP_TOOL_TIMEOUT or the default)."));
    s9c = we(() => v.number().int().positive().optional().describe("Per-server HTTP request timeout in milliseconds, set by the host on the mcp_set_servers control event. Raises the per-request fetch first-byte budget and the tool-call watchdog for this server. Capped at 5 minutes. Ignored when `timeout` is also set.\n@internal"));
    Rjf = we(() => v.object({
      type: v.literal("stdio").optional(),
      command: v.string(),
      args: v.array(v.string()).optional(),
      env: v.record(v.string(), v.string()).optional(),
      timeout: sbr(),
      alwaysLoad: v.boolean().optional().describe("When true, all tools from this server are always included in the prompt and never deferred behind tool search. Equivalent to setting defer_loading: false on the API. Default: tools are deferred when tool search is enabled. As a side effect this also blocks startup until the server is connected (capped at the standard 5s connect timeout) even though MCP startup is otherwise non-blocking by default, since the tools must be present when the turn-1 prompt is built."),
      role: lns()
    }));
    i9c = we(() => v.object({
      name: v.string(),
      permission_policy: v.enum(["always_allow", "always_ask", "always_deny"]).optional(),
      org_max_permission: v.enum(["allow", "ask", "blocked"]).optional().describe("Org admin's per-tool ceiling. Drives the auto-mode isOrgAskCeiling gate so an admin 'ask' cap forces a user prompt even in auto mode.")
    }).describe("Per-tool permission policy carried on mcp_set_servers for remote servers."));
    xjf = we(() => v.object({
      type: v.literal("sse"),
      url: v.string(),
      headers: v.record(v.string(), v.string()).optional(),
      tools: v.array(i9c()).optional(),
      timeout: sbr(),
      request_timeout_ms: s9c(),
      alwaysLoad: v.boolean().optional().describe("When true, all tools from this server are always included in the prompt and never deferred behind tool search. Equivalent to setting defer_loading: false on the API. Default: tools are deferred when tool search is enabled. As a side effect this also blocks startup until the server is connected (capped at the standard 5s connect timeout) even though MCP startup is otherwise non-blocking by default, since the tools must be present when the turn-1 prompt is built."),
      role: lns()
    }));
    kjf = we(() => v.object({
      type: v.literal("http"),
      url: v.string(),
      headers: v.record(v.string(), v.string()).optional(),
      tools: v.array(i9c()).optional(),
      timeout: sbr(),
      request_timeout_ms: s9c(),
      alwaysLoad: v.boolean().optional().describe("When true, all tools from this server are always included in the prompt and never deferred behind tool search. Equivalent to setting defer_loading: false on the API. Default: tools are deferred when tool search is enabled. As a side effect this also blocks startup until the server is connected (capped at the standard 5s connect timeout) even though MCP startup is otherwise non-blocking by default, since the tools must be present when the turn-1 prompt is built."),
      role: lns()
    }));
    Ajf = we(() => v.object({
      type: v.literal("sdk"),
      name: v.string()
    }));
    ibr = we(() => v.union([Rjf(), xjf(), kjf(), Ajf()]));
    Ijf = we(() => v.object({
      type: v.literal("claudeai-proxy"),
      url: v.string(),
      id: v.string(),
      timeout: sbr()
    }));
    Pjf = we(() => v.union([ibr(), Ijf()]));
    cns = we(() => v.object({
      name: v.string().describe("Server name as configured"),
      status: v.enum(["connected", "failed", "needs-auth", "pending", "disabled"]).describe("Current connection status"),
      serverInfo: v.object({
        name: v.string(),
        version: v.string()
      }).optional().describe("Server information (available when connected)"),
      error: v.string().optional().describe("Error message (available when status is 'failed')"),
      config: Pjf().optional().describe("Server configuration (includes URL for HTTP/SSE servers)"),
      scope: v.string().optional().describe("Configuration scope (e.g., project, user, local, claudeai, managed)"),
      tools: v.array(v.object({
        name: v.string(),
        description: v.string().optional(),
        annotations: v.object({
          readOnly: v.boolean().optional(),
          destructive: v.boolean().optional(),
          openWorld: v.boolean().optional()
        }).optional()
      })).optional().describe("Tools provided by this server (available when connected)"),
      capabilities: v.object({
        experimental: v.record(v.string(), v.unknown()).optional()
      }).optional().describe("@internal Server capabilities (available when connected). experimental['claude/channel'] is only present if the server's plugin is on the approved channels allowlist \u2014 use its presence to decide whether to show an Enable-channel prompt.")
    }).describe("Status information for an MCP server connection."));
    MJv = we(() => v.object({
      added: v.array(v.string()).describe("Names of servers that were added"),
      removed: v.array(v.string()).describe("Names of servers that were removed"),
      errors: v.record(v.string(), v.string()).describe("Map of server names to error messages for servers that failed to connect")
    }).describe("Result of a setMcpServers operation."));
    Qxt = we(() => v.enum(["userSettings", "projectSettings", "localSettings", "session", "cliArg"]));
    ins = we(() => v.enum(["allow", "deny", "ask"]));
    Ojf = we(() => v.enum(["allow", "deny", "ask", "defer"]));
    ans = we(() => v.object({
      toolName: v.string(),
      ruleContent: v.string().optional()
    }));
    _sn = we(() => v.discriminatedUnion("type", [v.object({
      type: v.literal("addRules"),
      rules: v.array(ans()),
      behavior: ins(),
      destination: Qxt()
    }), v.object({
      type: v.literal("replaceRules"),
      rules: v.array(ans()),
      behavior: ins(),
      destination: Qxt()
    }), v.object({
      type: v.literal("removeRules"),
      rules: v.array(ans()),
      behavior: ins(),
      destination: Qxt()
    }), v.object({
      type: v.literal("setMode"),
      mode: v.lazy(() => mRe()),
      destination: Qxt()
    }), v.object({
      type: v.literal("addDirectories"),
      directories: v.array(v.string()),
      destination: Qxt()
    }), v.object({
      type: v.literal("removeDirectories"),
      directories: v.array(v.string()),
      destination: Qxt()
    })]));
    o9c = we(() => v.enum(["user_temporary", "user_permanent", "user_reject"]).describe("Classification of this permission decision for telemetry. SDK hosts that prompt users (desktop apps, IDEs) should set this to reflect what actually happened: user_temporary for allow-once, user_permanent for always-allow (both the click and later cache hits), user_reject for deny. If unset, the CLI infers conservatively (temporary for allow, reject for deny). The vocabulary matches tool_decision OTel events (monitoring-usage docs)."));
    NJv = we(() => v.union([v.object({
      behavior: v.literal("allow"),
      updatedInput: v.record(v.string(), v.unknown()).optional(),
      updatedPermissions: v.array(_sn()).optional(),
      toolUseID: v.string().optional(),
      decisionClassification: o9c().optional()
    }), v.object({
      behavior: v.literal("deny"),
      message: v.string(),
      interrupt: v.boolean().optional(),
      toolUseID: v.string().optional(),
      decisionClassification: o9c().optional()
    })]));
    mRe = we(() => v.enum(["default", "acceptEdits", "bypassPermissions", "plan", "dontAsk", "auto"]).describe("Permission mode for controlling how tool executions are handled. 'default' - Standard behavior, prompts for dangerous operations. 'acceptEdits' - Auto-accept file edit operations. 'bypassPermissions' - Bypass all permission checks (requires allowDangerouslySkipPermissions). 'plan' - Planning mode, no actual tool execution. 'dontAsk' - Don't prompt for permissions, deny if not pre-approved. 'auto' - Use a model classifier to approve/deny permission prompts."));
    Djf = ["PreToolUse", "PostToolUse", "PostToolUseFailure", "PostToolBatch", "Notification", "UserPromptSubmit", "UserPromptExpansion", "SessionStart", "SessionEnd", "Stop", "StopFailure", "SubagentStart", "SubagentStop", "PreCompact", "PostCompact", "PermissionRequest", "PermissionDenied", "Setup", "TeammateIdle", "TaskCreated", "TaskCompleted", "Elicitation", "ElicitationResult", "ConfigChange", "WorktreeCreate", "WorktreeRemove", "InstructionsLoaded", "CwdChanged", "FileChanged", "MessageDisplay"];
    a9c = we(() => v.enum(Djf));
    BS = we(() => v.object({
      session_id: v.string(),
      transcript_path: v.string(),
      cwd: v.string(),
      prompt_id: v.string().optional().describe("UUID correlating a user prompt with all subsequent events until the next prompt. Same value emitted on OpenTelemetry events as the `prompt.id` attribute, so hook output can be joined to OTel events at prompt grain. Absent until the first user input of the process lifetime."),
      permission_mode: v.string().optional(),
      agent_id: v.string().optional().describe("Subagent identifier. Present only when the hook fires from within a subagent (e.g., a tool called by an AgentTool worker). Absent for the main thread, even in --agent sessions. Use this field (not agent_type) to distinguish subagent calls from main-thread calls."),
      agent_type: v.string().optional().describe('Agent type name (e.g., "general-purpose", "code-reviewer"). Present when the hook fires from within a subagent (alongside agent_id), or on the main thread of a session started with --agent (without agent_id).'),
      effort: v.object({
        level: v.string().describe('Active effort level for the current turn (e.g., "low", "medium", "high", "xhigh", "max"), after any silent downgrade for the selected model. Also exposed to hook commands and Bash as the CLAUDE_EFFORT env var.')
      }).optional().describe("Reasoning effort applied to the current turn. Same shape as StatusLineCommandInput.effort. Present for hooks that fire within a tool-use context (PreToolUse, PostToolUse, Stop, SubagentStop, etc.) on a model that supports the effort parameter; absent for session-lifecycle hooks and models without effort support.")
    }));
    Mjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PreToolUse"),
      tool_name: v.string(),
      tool_input: v.unknown(),
      tool_use_id: v.string()
    })));
    Njf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PermissionRequest"),
      tool_name: v.string(),
      tool_input: v.unknown(),
      permission_suggestions: v.array(_sn()).optional()
    })));
    Ljf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PostToolUse"),
      tool_name: v.string(),
      tool_input: v.unknown(),
      tool_response: v.unknown(),
      tool_use_id: v.string(),
      duration_ms: v.number().optional().describe("Tool execution time in milliseconds. Excludes permission-prompt and hook time.")
    })));
    Fjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PostToolUseFailure"),
      tool_name: v.string(),
      tool_input: v.unknown(),
      tool_use_id: v.string(),
      error: v.string(),
      is_interrupt: v.boolean().optional(),
      duration_ms: v.number().optional().describe("Tool execution time in milliseconds. Excludes permission-prompt and hook time.")
    })));
    Ujf = we(() => v.object({
      tool_name: v.string(),
      tool_input: v.unknown(),
      tool_use_id: v.string(),
      tool_response: v.unknown().optional()
    }));
    Bjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PostToolBatch"),
      tool_calls: v.array(Ujf())
    })).describe("Hook input for the PostToolBatch event. Fired once after every tool call in a batch has resolved, before the next model request. PostToolUse fires per-tool and may run concurrently for parallel tool calls; PostToolBatch fires exactly once with the full batch."));
    $jf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PermissionDenied"),
      tool_name: v.string(),
      tool_input: v.unknown(),
      tool_use_id: v.string(),
      reason: v.string()
    })));
    Hjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("Notification"),
      message: v.string(),
      title: v.string().optional(),
      notification_type: v.string()
    })));
    jjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("UserPromptSubmit"),
      prompt: v.string(),
      session_title: v.string().optional()
    })));
    qjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("UserPromptExpansion"),
      expansion_type: v.enum(["slash_command", "mcp_prompt"]),
      command_name: v.string(),
      command_args: v.string(),
      command_source: v.string().optional(),
      prompt: v.string()
    })));
    Wjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("SessionStart"),
      source: v.enum(["startup", "resume", "clear", "compact"]),
      agent_type: v.string().optional(),
      model: v.string().optional(),
      session_title: v.string().optional()
    })));
    Gjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("Setup"),
      trigger: v.enum(["init", "maintenance"])
    })));
    l9c = we(() => v.object({
      id: v.string(),
      type: v.string().describe("Friendly task-type label (e.g. 'shell', 'subagent', 'monitor', 'workflow'). Falls back to the raw discriminant for unknown types."),
      status: v.string(),
      description: v.string().describe("Free-text description. Capped at 1000 chars; clipped values append " + 'an in-string "\u2026 [+N chars]" marker.'),
      command: v.string().optional().describe("Shell command line. Only present for 'shell' tasks. Capped at 1000 " + 'chars with the same "\u2026 [+N chars]" marker.'),
      agent_type: v.string().optional().describe("Subagent type name. Only present for 'subagent' tasks."),
      server: v.string().optional().describe("MCP server name. Only present for 'monitor' / 'MCP task' tasks."),
      tool: v.string().optional().describe("MCP tool name. Only present for 'monitor' / 'MCP task' tasks."),
      name: v.string().optional().describe("Workflow name. Only present for 'workflow' tasks.")
    }));
    c9c = we(() => v.object({
      id: v.string(),
      schedule: v.string().describe('Cron expression, e.g. "0 9 * * 1-5".'),
      recurring: v.boolean().describe("False for one-shot wakeups whose cron field encodes a single fire time; true for tasks that re-fire on every match."),
      prompt: v.string().describe("Prompt text submitted when the cron fires. Capped at 1000 chars; " + 'clipped values append an in-string "\u2026 [+N chars]" marker.')
    }));
    Vjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("Stop"),
      stop_hook_active: v.boolean(),
      last_assistant_message: v.string().optional().describe("Text content of the last assistant message before stopping. Avoids the need to read and parse the transcript file."),
      background_tasks: v.array(l9c()).optional().describe('In-flight background work (running/pending + backgrounded) registered in this session. Lets hooks distinguish "session is done" from "session is paused waiting for background work to wake it". Empty array when nothing is in flight.'),
      session_crons: v.array(c9c()).optional().describe("Session-scoped cron tasks (CronCreate, ScheduleWakeup, /loop) that will wake this session later. Empty array when none are scheduled.")
    })));
    zjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("StopFailure"),
      error: dns(),
      error_details: v.string().optional(),
      last_assistant_message: v.string().optional()
    })));
    Kjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("SubagentStart"),
      agent_id: v.string(),
      agent_type: v.string()
    })));
    Yjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("SubagentStop"),
      stop_hook_active: v.boolean(),
      agent_id: v.string(),
      agent_transcript_path: v.string(),
      agent_type: v.string(),
      last_assistant_message: v.string().optional().describe("Text content of the last assistant message before stopping. Avoids the need to read and parse the transcript file."),
      background_tasks: v.array(l9c()).optional().describe('In-flight background work (running/pending + backgrounded) registered in this session. Lets hooks distinguish "session is done" from "session is paused waiting for background work to wake it". Empty array when nothing is in flight.'),
      session_crons: v.array(c9c()).optional().describe("Session-scoped cron tasks (CronCreate, ScheduleWakeup, /loop) that will wake this session later. Empty array when none are scheduled.")
    })));
    Jjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PreCompact"),
      trigger: v.enum(["manual", "auto"]),
      custom_instructions: v.string().nullable()
    })));
    Xjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("PostCompact"),
      trigger: v.enum(["manual", "auto"]),
      compact_summary: v.string().describe("The conversation summary produced by compaction")
    })));
    Qjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("TeammateIdle"),
      teammate_name: v.string(),
      team_name: v.string().describe("@deprecated Sessions have a single implicit team; this carries the session-derived team name and will be removed in a future release.")
    })));
    Zjf = we(() => BS().and(v.object({
      hook_event_name: v.literal("TaskCreated"),
      task_id: v.string(),
      task_subject: v.string(),
      task_description: v.string().optional(),
      teammate_name: v.string().optional(),
      team_name: v.string().optional().describe("@deprecated Sessions have a single implicit team; this carries the session-derived team name and will be removed in a future release.")
    })));
    eqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("TaskCompleted"),
      task_id: v.string(),
      task_subject: v.string(),
      task_description: v.string().optional(),
      teammate_name: v.string().optional(),
      team_name: v.string().optional().describe("@deprecated Sessions have a single implicit team; this carries the session-derived team name and will be removed in a future release.")
    })));
    tqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("Elicitation"),
      mcp_server_name: v.string(),
      message: v.string(),
      mode: v.enum(["form", "url"]).optional(),
      url: v.string().optional(),
      elicitation_id: v.string().optional(),
      requested_schema: v.record(v.string(), v.unknown()).optional()
    })).describe("Hook input for the Elicitation event. Fired when an MCP server requests user input. Hooks can auto-respond (accept/decline) instead of showing the dialog."));
    nqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("ElicitationResult"),
      mcp_server_name: v.string(),
      elicitation_id: v.string().optional(),
      mode: v.enum(["form", "url"]).optional(),
      action: v.enum(["accept", "decline", "cancel"]),
      content: v.record(v.string(), v.unknown()).optional()
    })).describe("Hook input for the ElicitationResult event. Fired after the user responds to an MCP elicitation. Hooks can observe or override the response before it is sent to the server."));
    rqf = ["user_settings", "project_settings", "local_settings", "policy_settings", "skills"];
    oqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("ConfigChange"),
      source: v.enum(rqf),
      file_path: v.string().optional()
    })));
    sqf = ["session_start", "nested_traversal", "path_glob_match", "include", "compact"];
    iqf = ["User", "Project", "Local", "Managed"];
    aqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("InstructionsLoaded"),
      file_path: v.string(),
      memory_type: v.enum(iqf),
      load_reason: v.enum(sqf),
      globs: v.array(v.string()).optional(),
      trigger_file_path: v.string().optional(),
      parent_file_path: v.string().optional()
    })));
    lqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("WorktreeCreate"),
      name: v.string()
    })));
    cqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("WorktreeRemove"),
      worktree_path: v.string()
    })));
    uqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("CwdChanged"),
      old_cwd: v.string(),
      new_cwd: v.string()
    })));
    dqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("FileChanged"),
      file_path: v.string(),
      event: v.enum(["change", "add", "unlink"])
    })));
    pqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("MessageDisplay"),
      turn_id: v.string().describe("UUID of the current turn."),
      message_id: v.string().describe("UUID of the assistant message being displayed. Stable across " + "every flush of the same message. Not the API msg_\u2026 id."),
      index: v.number().int().describe("Zero-based index of this delta within the message. Increments by one per flush."),
      final: v.boolean().describe("True on the message's last flush. Exactly one flush per message has it."),
      delta: v.string().describe("The newly completed lines since the prior flush. Always whole lines, except on the final flush which may end mid-line. The delta of the final flush is empty when the message ends on a newline; treat final as the end-of-message signal regardless.")
    })).describe("Hook input for the MessageDisplay event. Fired with each batch of newly completed lines while an assistant message streams. Display-only: the stored message and what the model sees are untouched."));
    mqf = ["clear", "resume", "logout", "prompt_input_exit", "other", "bypass_permissions_disabled"];
    fqf = we(() => v.enum(mqf));
    hqf = we(() => BS().and(v.object({
      hook_event_name: v.literal("SessionEnd"),
      reason: fqf()
    })));
    u9c = we(() => v.union([Mjf(), Ljf(), Fjf(), Bjf(), $jf(), Hjf(), jjf(), qjf(), Wjf(), hqf(), Vjf(), zjf(), Kjf(), Yjf(), Jjf(), Xjf(), Njf(), Gjf(), Qjf(), Zjf(), eqf(), tqf(), nqf(), oqf(), aqf(), lqf(), cqf(), uqf(), dqf(), pqf()]));
    gqf = we(() => v.object({
      async: v.literal(true),
      asyncTimeout: v.number().optional()
    }));
    yqf = we(() => v.object({
      hookEventName: v.literal("PreToolUse"),
      permissionDecision: Ojf().optional(),
      permissionDecisionReason: v.string().optional(),
      updatedInput: v.record(v.string(), v.unknown()).optional(),
      additionalContext: v.string().optional()
    }));
    _qf = we(() => v.object({
      hookEventName: v.literal("UserPromptSubmit"),
      additionalContext: v.string().optional(),
      sessionTitle: v.string().optional(),
      suppressOriginalPrompt: v.boolean().optional().describe('When decision is "block", omit the original prompt from the block message')
    }));
    bqf = we(() => v.object({
      hookEventName: v.literal("UserPromptExpansion"),
      additionalContext: v.string().optional()
    }));
    Sqf = we(() => v.object({
      hookEventName: v.literal("SessionStart"),
      additionalContext: v.string().optional(),
      initialUserMessage: v.string().optional(),
      sessionTitle: v.string().optional(),
      watchPaths: v.array(v.string()).optional(),
      reloadSkills: v.boolean().optional().describe("Re-scan skill and command directories after SessionStart hooks complete, so skills installed by the hook are available in the same session")
    }));
    Tqf = we(() => v.object({
      hookEventName: v.literal("Setup"),
      additionalContext: v.string().optional()
    }));
    Eqf = we(() => v.object({
      hookEventName: v.literal("SubagentStart"),
      additionalContext: v.string().optional()
    }));
    vqf = we(() => v.object({
      hookEventName: v.literal("PostToolUse"),
      additionalContext: v.string().optional(),
      updatedToolOutput: v.unknown().optional().describe("Replaces the tool output before it is sent to the model"),
      updatedMCPToolOutput: v.unknown().optional().describe("Replaces the output for MCP tools only. Prefer updatedToolOutput, which works for all tools")
    }));
    wqf = we(() => v.object({
      hookEventName: v.literal("PostToolBatch"),
      additionalContext: v.string().optional()
    }));
    Cqf = we(() => v.object({
      hookEventName: v.literal("PostToolUseFailure"),
      additionalContext: v.string().optional()
    }));
    Rqf = we(() => v.object({
      hookEventName: v.literal("Stop"),
      additionalContext: v.string().optional()
    }).describe("Hook-specific output for the Stop event. additionalContext is non-error feedback delivered to the model; the conversation continues so the model can act on it."));
    xqf = we(() => v.object({
      hookEventName: v.literal("SubagentStop"),
      additionalContext: v.string().optional()
    }).describe("Hook-specific output for the SubagentStop event. additionalContext is non-error feedback delivered to the subagent; the subagent continues so it can act on it."));
    kqf = we(() => v.object({
      hookEventName: v.literal("PermissionDenied"),
      retry: v.boolean().optional()
    }));
    Aqf = we(() => v.object({
      hookEventName: v.literal("Notification"),
      additionalContext: v.string().optional()
    }));
    Iqf = we(() => v.object({
      hookEventName: v.literal("PermissionRequest"),
      decision: v.union([v.object({
        behavior: v.literal("allow"),
        updatedInput: v.record(v.string(), v.unknown()).optional(),
        updatedPermissions: v.array(_sn()).optional()
      }), v.object({
        behavior: v.literal("deny"),
        message: v.string().optional(),
        interrupt: v.boolean().optional()
      })])
    }));
    Pqf = we(() => v.object({
      hookEventName: v.literal("CwdChanged"),
      watchPaths: v.array(v.string()).optional()
    }));
    Oqf = we(() => v.object({
      hookEventName: v.literal("FileChanged"),
      watchPaths: v.array(v.string()).optional()
    }));
    Dqf = we(() => v.object({
      hookEventName: v.literal("MessageDisplay"),
      displayContent: v.string().optional().describe("Text displayed in place of the delta. Omit (or return the delta unchanged) to display the original.")
    }).describe("Hook-specific output for the MessageDisplay event. Display-only: replaces the delta on screen without changing the stored message."));
    Mqf = we(() => v.object({
      continue: v.boolean().optional(),
      suppressOutput: v.boolean().optional(),
      stopReason: v.string().optional(),
      decision: v.enum(["approve", "block"]).optional(),
      systemMessage: v.string().optional(),
      terminalSequence: v.string().optional().describe("A terminal escape sequence (e.g. OSC 9 / OSC 777 desktop-notification) for Claude Code to emit on your behalf. Only notification/title OSCs (0, 1, 2, 9, 99, 777) and BEL are permitted; anything else is dropped."),
      reason: v.string().optional(),
      hookSpecificOutput: v.union([yqf(), _qf(), bqf(), Sqf(), Tqf(), Eqf(), vqf(), Cqf(), wqf(), Rqf(), xqf(), kqf(), Aqf(), Iqf(), Nqf(), Lqf(), Pqf(), Oqf(), Fqf(), Dqf()]).optional()
    }));
    Nqf = we(() => v.object({
      hookEventName: v.literal("Elicitation"),
      action: v.enum(["accept", "decline", "cancel"]).optional(),
      content: v.record(v.string(), v.unknown()).optional()
    }).describe("Hook-specific output for the Elicitation event. Return this to programmatically accept or decline an MCP elicitation request."));
    Lqf = we(() => v.object({
      hookEventName: v.literal("ElicitationResult"),
      action: v.enum(["accept", "decline", "cancel"]).optional(),
      content: v.record(v.string(), v.unknown()).optional()
    }).describe("Hook-specific output for the ElicitationResult event. Return this to override the action or content before the response is sent to the MCP server."));
    Fqf = we(() => v.object({
      hookEventName: v.literal("WorktreeCreate"),
      worktreePath: v.string()
    }).describe("Hook-specific output for the WorktreeCreate event. Provides the absolute path to the created worktree directory. Command hooks print the path on stdout instead."));
    LJv = we(() => v.union([gqf(), Mqf()]));
    bsn = we(() => v.object({
      name: v.string().describe("Skill name (without the leading slash)"),
      description: v.string().describe("Description of what the skill does"),
      argumentHint: v.string().describe('Hint for skill arguments (e.g., "<file>")'),
      aliases: v.array(v.string()).optional().describe("Alternate names that resolve to this command (e.g., /cost and /stats both resolve to /usage)")
    }).describe("Information about an available skill (invoked via /command syntax)."));
    uns = we(() => v.object({
      name: v.string().describe('Agent type identifier (e.g., "Explore")'),
      description: v.string().describe("Description of when to use this agent"),
      model: v.string().optional().describe("Model alias this agent uses. If omitted, inherits the parent's model")
    }).describe("Information about an available subagent that can be invoked via the Task tool."));
    abr = we(() => v.object({
      value: v.string().describe("Model identifier to use in API calls"),
      resolvedModel: v.string().optional().describe("Canonical wire model id this row's `value` resolves to (e.g. 'sonnet' \u2192 'claude-sonnet-5'). Lets hosts match a persisted explicit id against the alias row that covers it."),
      displayName: v.string().describe("Human-readable display name"),
      description: v.string().describe("Description of the model's capabilities"),
      supportsEffort: v.boolean().optional().describe("Whether this model supports effort levels"),
      supportedEffortLevels: v.array(v.enum(["low", "medium", "high", "xhigh", "max"])).optional().describe("Available effort levels for this model"),
      supportsAdaptiveThinking: v.boolean().optional().describe("Whether this model supports adaptive thinking (Claude decides when and how much to think)"),
      supportsFastMode: v.boolean().optional().describe("Whether this model supports fast mode"),
      supportsAutoMode: v.boolean().optional().describe("Whether this model supports auto mode"),
      disabled: v.boolean().optional().describe("@internal Model is visible but not selectable (e.g. a model the org's Zero Data Retention setting excludes). The human-readable reason is folded into `description`; a structured disabledReason field is the extension point if a consumer ever needs the reason separately."),
      promoListPrice: v.string().optional().describe("@internal List price (e.g. `$3/$15`) for a model currently on a launch promo. `description` carries only the promo price so plain-text consumers read it unambiguously; rich pickers prepend this struck-through before the first `$X/$Y` in `description`. Absent when no promo is active.")
    }).describe("Information about an available model."));
    d9c = we(() => v.object({
      email: v.string().optional(),
      organization: v.string().optional(),
      subscriptionType: v.string().optional(),
      tokenSource: v.string().optional(),
      apiKeySource: v.string().optional(),
      apiProvider: v.enum(["firstParty", "bedrock", "vertex", "foundry", "anthropicAws", "mantle", "gateway"]).optional().describe('Active API backend. Anthropic OAuth login only applies when "firstParty"; for 3P providers the other fields are absent and auth is external (AWS creds, gcloud ADC, etc.). "gateway" means the CLI is authenticated against an enterprise gateway.')
    }).describe("Information about the logged in user's account."));
    Uqf = we(() => v.union([v.string(), v.record(v.string(), ibr())]));
    p9c = we(() => v.object({
      description: v.string().describe("Natural language description of when to use this agent"),
      tools: v.array(v.string()).optional().describe("Array of allowed tool names. If omitted, inherits all tools from parent. Note: passing 'Skill' here is deprecated \u2014 use the `skills` field instead."),
      disallowedTools: v.array(v.string()).optional().describe("Array of tool names to explicitly disallow for this agent. MCP server-level specs (mcp__server, mcp__server__*, mcp__*) remove every tool from the named server (or all MCP tools)."),
      prompt: v.string().describe("The agent's system prompt"),
      model: v.string().optional().describe("Model alias (e.g. 'fable', 'opus', 'sonnet', 'haiku') or full model ID (e.g. 'claude-fable-5'). If omitted or 'inherit', uses the main model"),
      mcpServers: v.array(Uqf()).optional(),
      criticalSystemReminder_EXPERIMENTAL: v.string().optional().describe("Experimental: Critical reminder added to system prompt"),
      skills: v.array(v.string()).optional().describe("Array of skill names to preload into the agent context"),
      initialPrompt: v.string().optional().describe("Auto-submitted as the first user turn when this agent is the main thread agent. Slash commands are processed. Prepended to any user-provided prompt."),
      maxTurns: v.number().int().positive().optional().describe("Maximum number of agentic turns (API round-trips) before stopping"),
      background: v.boolean().optional().describe("Run this agent as a background task (non-blocking, fire-and-forget) when invoked"),
      memory: v.enum(["user", "project", "local"]).optional().describe("Scope for auto-loading agent memory files. 'user' - ~/.claude/agent-memory/<agentType>/, 'project' - .claude/agent-memory/<agentType>/, 'local' - .claude/agent-memory-local/<agentType>/"),
      effort: v.union([v.enum(["low", "medium", "high", "xhigh", "max"]), v.number().int()]).optional().describe("Reasoning effort level for this agent. Either a named level or an integer"),
      permissionMode: mRe().optional().describe("Permission mode controlling how tool executions are handled")
    }).describe("Definition for a custom subagent that can be invoked via the Agent tool."));
    FJv = we(() => v.enum(["user", "project", "local"]).describe("Source for loading filesystem-based settings. 'user' - Global user settings (~/.claude/settings.json). 'project' - Project settings (.claude/settings.json). 'local' - Local settings (.claude/settings.local.json)."));
    UJv = we(() => v.object({
      type: v.literal("local").describe("Plugin type. Currently only 'local' is supported"),
      path: v.string().describe("Absolute or relative path to the plugin directory"),
      skipMcpDiscovery: v.boolean().optional().describe("When true, the engine loads skills/hooks/agents/commands from this plugin but does NOT read its .mcp.json or manifest mcpServers. Use when the SDK host owns this plugin's MCP connections.")
    }).describe("Configuration for loading a plugin."));
    BJv = we(() => v.object({
      canRewind: v.boolean(),
      error: v.string().optional(),
      filesChanged: v.array(v.string()).optional(),
      insertions: v.number().optional(),
      deletions: v.number().optional()
    }).describe("Result of a rewindFiles operation."));
    Bqf = we(() => v.unknown());
    $qf = we(() => v.unknown());
    Hqf = we(() => v.unknown());
    wa = we(() => v.string());
    m9c = we(() => v.unknown());
    dns = we(() => v.enum(["authentication_failed", "oauth_org_not_allowed", "billing_error", "rate_limit", "overloaded", "invalid_request", "model_not_found", "server_error", "unknown", "max_output_tokens"]));
    jqf = we(() => v.union([v.literal("compacting"), v.literal("requesting"), v.null()]));
    pns = we(() => v.discriminatedUnion("kind", [v.object({
      kind: v.literal("human")
    }), v.object({
      kind: v.literal("channel"),
      server: v.string()
    }), v.object({
      kind: v.literal("peer"),
      from: v.string(),
      name: v.string().optional(),
      inbound_origin: v.string().optional().describe("@internal Server-asserted ingest path of the demoted delivery, copied at classification from the message-level `inbound_origin`."),
      senderTaskId: v.string().optional().describe("Task id of the in-process background subagent that sent this message, stamped by the harness from the sending loop (never from tool input). Absent for cross-session peers.")
    }), v.object({
      kind: v.literal("task-notification")
    }), v.object({
      kind: v.literal("coordinator")
    }), v.object({
      kind: v.literal("auto-continuation")
    })]).describe("Provenance of a user-role message (peer session, team lead, channel). Absent or `human` means keyboard input from the user."));
    f9c = we(() => v.object({
      type: v.literal("user"),
      message: Bqf(),
      parent_tool_use_id: v.string().nullable(),
      isSynthetic: v.boolean().optional(),
      tool_use_result: v.unknown().optional(),
      priority: v.enum(["now", "next", "later"]).optional(),
      origin: pns().optional(),
      client_platform: v.string().optional().describe("@internal The `anthropic-client-platform` value of the client that sent this message (e.g. `ios`, `android`, `web_claude_ai`, `desktop_app`). Injected server-side by CCR ingress from the request header."),
      inbound_origin: v.string().optional().describe("@internal Server-asserted ingest path that produced this message. Not settable by clients."),
      shouldQuery: v.boolean().optional().describe("When false, the message is appended to the transcript without triggering an assistant turn. It will be merged into the next user message that does query."),
      timestamp: v.string().optional().describe("ISO timestamp when the message was created on the originating process. Older emitters omit it; consumers should fall back to receive time."),
      is_meta: v.literal(true).optional().describe("@internal True when the message was synthesized by the loop (not user keyboard input). From internal UserMessage.isMeta."),
      is_visible_in_transcript_only: v.literal(true).optional().describe("@internal True when the message is stored in the transcript but not rendered in the live UI."),
      is_virtual: v.literal(true).optional().describe("@internal Display-only: rendered in the UI but filtered before API send."),
      is_compact_summary: v.literal(true).optional().describe("@internal True when this user message is a compact-summary synthetic message."),
      summarize_metadata: v.object({
        messages_summarized: v.number(),
        user_context: v.string().optional(),
        direction: v.enum(["from", "up_to"]).optional()
      }).optional().describe('@internal Metadata for "Summarize from here" / "Summarize up to here" summaries (from internal UserMessage.summarizeMetadata).'),
      mcp_meta: v.object({
        _meta: v.record(v.string(), v.unknown()).optional(),
        structured_content: v.record(v.string(), v.unknown()).optional()
      }).optional().describe("@internal MCP protocol metadata passed through to SDK consumers, never sent to the model (from internal UserMessage.mcpMeta)."),
      source_tool_use_id: v.string().optional().describe("@internal When this message was generated by a tool via newMessages, links it to that tool_use id."),
      source_tool_assistant_uuid: v.string().optional().describe("@internal For tool_result messages: UUID of the assistant message containing the matching tool_use block. Used for parentUuid assignment in transcript."),
      image_paste_ids: v.array(v.number()).optional().describe("@internal Paste IDs for images in this message, in order of appearance. REPL-local state \u2014 candidate for surface-side if daemon has no use for it."),
      plan_content: v.string().optional().describe("@internal Plan to implement (cleared-context flow). When set, the message is rendered with plan styling."),
      permission_mode: mRe().optional().describe("@internal Permission mode active when this message was sent (for rewind restoration)."),
      interrupted_message_id: v.string().optional().describe("@internal For [Request interrupted by user] markers only: the API msg_* id that Esc cancelled.")
    }));
    mns = we(() => f9c().extend({
      uuid: wa().optional(),
      session_id: v.string().optional(),
      subagent_type: v.string().optional().describe("Subagent type that produced this message."),
      task_description: v.string().optional().describe("Description of the subagent task that produced this message.")
    }));
    qqf = we(() => f9c().extend({
      uuid: wa(),
      session_id: v.string(),
      isReplay: v.literal(true),
      file_attachments: v.array(v.unknown()).optional()
    }));
    h9c = we(() => v.object({
      type: v.literal("bash_command"),
      command: v.string().describe("Shell command to execute verbatim via a one-shot `/bin/sh -c` (or `pwsh`) subprocess, bypassing the model. Trust model matches the local TUI `!cmd` path (no sandbox, no per-command prompt); unlike `!cmd`, output is not appended to the conversation transcript and there is no persistent shell state across calls."),
      cwd: v.string().optional().describe("Working directory for the command. Falls back to the session cwd when omitted."),
      uuid: wa().optional(),
      session_id: v.string().optional()
    }).describe("@internal A user-initiated shell command dispatched to a one-shot shell subprocess with no model turn. Input-only \u2014 sent by CCR clients that surface a dedicated terminal UI; never emitted on stdout."));
    Wqf = we(() => v.object({
      status: v.enum(["allowed", "allowed_warning", "rejected"]),
      resetsAt: v.number().optional(),
      rateLimitType: v.enum(["five_hour", "seven_day", "seven_day_opus", "seven_day_sonnet", "seven_day_overage_included", "overage"]).optional(),
      utilization: v.number().optional(),
      overageStatus: v.enum(["allowed", "allowed_warning", "rejected"]).optional(),
      overageResetsAt: v.number().optional(),
      overageDisabledReason: v.enum(["overage_not_provisioned", "org_level_disabled", "org_level_disabled_until", "out_of_credits", "seat_tier_level_disabled", "member_level_disabled", "seat_tier_zero_credit_limit", "group_zero_credit_limit", "member_zero_credit_limit", "org_service_level_disabled", "no_limits_configured", "fetch_error", "unknown"]).optional(),
      isUsingOverage: v.boolean().optional(),
      overageInUse: v.boolean().optional(),
      surpassedThreshold: v.number().optional(),
      overagePeriodMonthly: v.object({
        utilization: v.number()
      }).optional().describe("@internal Monthly service spend-cap telemetry for the Claude-in-Slack surface (CLAUDE_IN_SLACK_V2): utilization is fraction-of-cap."),
      overagePeriodChannel: v.object({
        utilization: v.number()
      }).optional().describe("@internal Per-Slack-channel spend-cap telemetry for the Claude-in-Slack surface (CLAUDE_IN_SLACK_V2): utilization is fraction-of-cap. Absent when the channel has no individual cap."),
      errorCode: v.enum(["credits_required"]).optional(),
      canUserPurchaseCredits: v.boolean().optional(),
      hasChargeableSavedPaymentMethod: v.boolean().optional()
    }).describe("Rate limit information for claude.ai subscription users."));
    Gqf = we(() => v.object({
      type: v.literal("assistant"),
      message: $qf(),
      parent_tool_use_id: v.string().nullable(),
      error: dns().optional(),
      uuid: wa(),
      session_id: v.string(),
      request_id: v.string().optional(),
      supersedes: v.array(wa()).optional().describe("Wire uuids of previously-delivered messages that this message replaces (refusal-fallback supersede). The list can include tombstoned tool_result frames from the refused leg, not only assistant frames. Evict the named messages on arrival and treat this frame as their canonical replacement. Idempotent with the end-of-turn model_refusal_fallback notice, whose retracted_message_uuids remains the complete audit record for the turn."),
      subagent_type: v.string().optional().describe("Subagent type that produced this message."),
      task_description: v.string().optional().describe("Description of the subagent task that produced this message."),
      tool_use_meta: v.array(v.object({
        id: v.string(),
        display_name: v.string(),
        server_display_name: v.string().optional(),
        icon_url: v.string().optional()
      })).optional().describe("@internal Display metadata for this message's tool_use blocks, keyed by block id. display_name is the MCP server's `tool.annotations.title` when provided, otherwise a readable transform of the wire name; server_display_name is the MCP server's own display name; icon_url is the MCP server's directory icon URL (claude.ai connectors only). Omitted for blocks whose display label equals the wire name (built-in tools). Wrapper-level sibling \u2014 never inside `message.content` \u2014 so it is not replayed to the model."),
      timestamp: v.string().optional().describe("@internal ISO timestamp when this message was created (from internal AssistantMessage.timestamp)."),
      is_meta: v.literal(true).optional().describe("@internal True when the message was synthesized by the loop (not a model response)."),
      is_virtual: v.literal(true).optional().describe("@internal Display-only: rendered in the UI but filtered before API send."),
      is_api_error_message: v.boolean().optional().describe("@internal True when this assistant message wraps an API error (from internal AssistantMessage.isApiErrorMessage)."),
      api_error_status: v.number().optional().describe("@internal HTTP status code of the API error when is_api_error_message is true."),
      api_error: v.literal("max_output_tokens").optional().describe("@internal API error code when is_api_error_message is true."),
      error_details: v.string().optional().describe("@internal Raw API error message \u2014 preserves details (e.g. prompt-too-long token counts) that user-facing content discards."),
      advisor_model: v.string().optional().describe("@internal Advisor model that produced this message, when applicable."),
      attribution_agent: v.string().optional().describe("@internal Attribution stamp: agent name parsed from querySource (see messageAttribution.ts). May overlap with subagent_type."),
      attribution_skill: v.string().optional().describe("@internal Skill that produced this message."),
      attribution_plugin: v.string().optional().describe("@internal Plugin that produced this message."),
      attribution_mcp_server: v.string().optional().describe("@internal MCP server that produced this message."),
      attribution_mcp_tool: v.string().optional().describe("@internal MCP tool that produced this message.")
    }));
    Vqf = we(() => v.object({
      type: v.literal("rate_limit_event"),
      rate_limit_info: Wqf(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Rate limit event emitted when rate limit info changes."));
    g9c = we(() => v.object({
      tool_name: v.string(),
      tool_use_id: v.string(),
      tool_input: v.record(v.string(), v.unknown())
    }));
    zqf = we(() => v.object({
      id: v.string(),
      name: v.string(),
      input: v.record(v.string(), v.unknown())
    }));
    y9c = we(() => v.enum(FEc).describe("Why the query loop terminated. Unset when the loop was bypassed (local slash command) or interrupted externally (budget/retry limits checked between yields)."));
    Kqf = we(() => v.object({
      type: v.literal("result"),
      subtype: v.literal("success"),
      duration_ms: v.number(),
      duration_api_ms: v.number(),
      ttft_ms: v.number().optional(),
      ttft_stream_ms: v.number().optional(),
      time_to_request_ms: v.number().optional(),
      time_to_request_from_spawn_ms: v.number().optional(),
      warm_spare_claimed: v.boolean().optional(),
      time_origin_ms: v.number().optional(),
      is_error: v.boolean(),
      api_error_status: v.number().nullable().optional(),
      num_turns: v.number(),
      result: v.string(),
      stop_reason: v.string().nullable(),
      total_cost_usd: v.number(),
      usage: m9c(),
      modelUsage: v.record(v.string(), obr()),
      permission_denials: v.array(g9c()),
      structured_output: v.unknown().optional(),
      deferred_tool_use: zqf().optional(),
      terminal_reason: y9c().optional(),
      fast_mode_state: Ssn().optional(),
      origin: pns().optional(),
      uuid: wa(),
      session_id: v.string()
    }));
    Yqf = we(() => v.object({
      type: v.literal("result"),
      subtype: v.enum(["error_during_execution", "error_max_turns", "error_max_budget_usd", "error_max_structured_output_retries"]),
      duration_ms: v.number(),
      duration_api_ms: v.number(),
      is_error: v.boolean(),
      num_turns: v.number(),
      stop_reason: v.string().nullable(),
      total_cost_usd: v.number(),
      usage: m9c(),
      modelUsage: v.record(v.string(), obr()),
      permission_denials: v.array(g9c()),
      errors: v.array(v.string()),
      terminal_reason: y9c().optional(),
      fast_mode_state: Ssn().optional(),
      origin: pns().optional(),
      uuid: wa(),
      session_id: v.string()
    }));
    Jqf = we(() => v.union([Kqf(), Yqf()]));
    _9c = we(() => v.object({
      file: v.string().optional().describe("Path to the settings file that failed to parse or validate."),
      path: v.string().describe("Dot-notation path to the field with the error, or empty string for whole-file errors."),
      message: v.string().describe("Human-readable error message.")
    }).describe("A settings file parse or validation error. When a settings.json file fails to parse (invalid JSON, JSON comments, schema mismatch), the file is skipped and any rules it contained \u2014 including permission allow/deny lists \u2014 are not applied."));
    Xqf = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("init"),
      agents: v.array(v.string()).optional(),
      apiKeySource: Ejf(),
      betas: v.array(v.string()).optional(),
      claude_code_version: v.string(),
      cwd: v.string(),
      tools: v.array(v.string()),
      mcp_servers: v.array(v.object({
        name: v.string(),
        status: v.string()
      })),
      model: v.string(),
      permissionMode: mRe(),
      slash_commands: v.array(v.string()),
      output_style: v.string(),
      skills: v.array(v.string()),
      plugins: v.array(v.object({
        name: v.string(),
        path: v.string(),
        source: v.string().optional().describe('@internal Plugin source identifier in "name\\@marketplace" format. Sentinels: "name\\@inline" for --plugin-dir, "name\\@builtin" for built-in plugins.')
      })),
      plugin_errors: v.array(v.object({
        plugin: v.string(),
        type: v.string(),
        message: v.string()
      })).optional().describe("@internal Plugin load-time errors (e.g., unsatisfied dependency version). Affected plugins are demoted and absent from `plugins[]`. The key is omitted when there are no errors; CI can fail on `(plugin_errors?.length ?? 0) > 0`."),
      plugin_warnings: v.array(v.object({
        plugin: v.string(),
        type: v.string(),
        message: v.string()
      })).optional().describe("@internal Plugin authoring feedback (e.g., a default folder shadowed by a manifest key). When `plugin` matches an entry in `plugins[]`, that plugin loaded and the warning is advisory; warnings with a synthetic `plugin` source (no matching `plugins[]` entry, e.g. workspace-level suppression notices) describe content that did NOT load. The key is omitted when there are no warnings."),
      fast_mode_state: Ssn().optional(),
      analytics_disabled: v.boolean().optional().describe("@internal True when the CLI has analytics/telemetry disabled (privacy level, DO_NOT_TRACK, or 3P provider). IDE clients use this to hide per-message thumbs feedback UI since the rating event would be a no-op."),
      product_feedback_disabled: v.boolean().optional().describe("@internal True when the org's allow_product_feedback policy is false (ZDR/HIPAA). IDE clients use this to hide feedback surfaces (thumbs, session survey) whose events the CLI would drop at the proxy boundary anyway."),
      memory_paths: v.object({
        auto: v.string().optional(),
        team: v.string().optional()
      }).optional().describe("@internal Absolute directory paths for the auto-memory and team-memory stores. Lets SDK renderers classify Read/Write/Edit tool calls on these paths as memory operations without re-implementing CLI path detection."),
      uuid: wa(),
      session_id: v.string()
    }));
    Qqf = we(() => v.object({
      type: v.literal("stream_event"),
      event: Hqf(),
      parent_tool_use_id: v.string().nullable(),
      uuid: wa(),
      session_id: v.string(),
      ttft_ms: v.number().optional()
    }));
    Zqf = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("compact_boundary"),
      compact_metadata: v.object({
        trigger: v.enum(["manual", "auto"]),
        pre_tokens: v.number(),
        post_tokens: v.number().optional(),
        cumulative_dropped_tokens: v.number().optional().describe("@internal Running total of context tokens compaction has removed so far, across this and every earlier compaction. " + "Each contribution is approximately pre_tokens \u2212 post_tokens."),
        duration_ms: v.number().optional(),
        user_context: v.string().optional().describe('@internal User-provided focus text for manual "summarize from here".'),
        messages_summarized: v.number().optional().describe("@internal Count of messages the compaction summarized."),
        precomputed: v.boolean().optional().describe("@internal The summary was generated in the background at the autocompact threshold and swapped in when prompt-too-long fired; duration_ms measures user-wait from that point."),
        pre_compact_discovered_tools: v.array(v.string()).optional().describe("@internal Deferred-tool names discovered before this compaction. extractDiscoveredToolNames reads this back on the next turn so the tool-schema filter keeps including them after the tool_reference-carrying messages were summarized away."),
        preserved_segment: v.object({
          head_uuid: wa(),
          anchor_uuid: wa(),
          tail_uuid: wa()
        }).optional().describe("Relink info for messagesToKeep. Loaders splice the preserved segment at anchor_uuid (summary for suffix-preserving, boundary for prefix-preserving partial compact) so resume includes preserved content. Unset when compaction summarizes everything (no messagesToKeep)."),
        preserved_messages: v.object({
          anchor_uuid: wa(),
          uuids: v.array(wa()),
          all_uuids: v.array(wa()).optional().describe("@internal Unfiltered messagesToKeep UUIDs. uuids is the on-disk subset (messages recordTranscript writes); all_uuids is the in-memory superset including non-loggable messages an in-process surface still holds for the next turn's API input. Absent from older producers.")
        }).optional().describe("Ordered messagesToKeep UUIDs. Supersedes preserved_segment \u2014 " + "readers look up each UUID directly and relink uuids[i] to uuids[i-1] (uuids[0] to anchor_uuid) instead of walking the parentUuid chain. Unset when compaction summarizes everything.")
      }),
      logical_parent_uuid: wa().nullable().optional().describe("@internal uuid of the last pre-compact message \u2014 the backpointer " + "forkSession follows across the compaction break. Distinct from the session-file chain parent (which is the post-compact summary). Absent from older producers."),
      uuid: wa(),
      session_id: v.string()
    }));
    e3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("status"),
      status: jqf(),
      permissionMode: mRe().optional(),
      compact_result: v.enum(["success", "failed"]).optional(),
      compact_error: v.string().optional(),
      uuid: wa(),
      session_id: v.string()
    }));
    fns = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("post_turn_summary"),
      summarizes_uuid: v.string(),
      status_category: v.string(),
      status_detail: v.string(),
      needs_action: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Background post-turn summary emitted after each assistant turn. summarizes_uuid points to the assistant message this summarizes."));
    hns = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("task_summary"),
      detail: v.string().nullable(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Mid-turn progress line from the debounced classifier. Mirrors external_metadata.task_summary so non-CCR consumers (desktop LocalSessionManager) see the same live phrase. detail is null on the idle clear."));
    t3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("informational"),
      content: v.string(),
      level: v.enum(["info", "notice", "suggestion", "warning"]).describe("Render level. 'info' shows only in transcript mode; 'notice' renders in inactive gray; 'suggestion' and 'warning' are more prominent."),
      tool_use_id: v.string().optional().describe("Dedupes progress messages for the same tool use."),
      prevent_continuation: v.boolean().optional().describe("When true, execution stops after this message (e.g. a Stop hook denied continuation)."),
      uuid: wa(),
      session_id: v.string()
    }).describe("Generic text banner emitted by the loop \u2014 non-error status lines, hook feedback (e.g. a UserPromptSubmit hook's block reason), slash-command output. Hosts render `content` as plaintext at the given level."));
    $Jv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("permission_retry"),
      content: v.string(),
      commands: v.array(v.string()).describe("Display names of the commands that were allowed."),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when tool execution retries after a permission-mode change allowed previously-denied commands. REPL renders a 'retrying with <commands>' banner. From internal SystemMessage 'permission_retry'."));
    HJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("stop_hook_summary"),
      hook_count: v.number(),
      hook_infos: v.array(v.object({
        command: v.string(),
        prompt_text: v.string().optional(),
        duration_ms: v.number().optional()
      })),
      hook_errors: v.array(v.string()),
      hook_additional_context: v.array(v.string()).optional().describe("Non-error feedback from hookSpecificOutput.additionalContext \u2014 kept separate from hook_errors so the sanctioned feedback channel is not labeled an error. Absent in sessions persisted before this field existed."),
      prevented_continuation: v.boolean(),
      stop_reason: v.string().optional(),
      has_output: v.boolean(),
      level: v.enum(["info", "notice", "suggestion", "warning"]),
      tool_use_id: v.string().optional(),
      hook_label: v.string().optional(),
      total_duration_ms: v.number().optional(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Summary of Stop/SubagentStop hook execution at turn end \u2014 which hooks ran, their output, and whether any prevented continuation. From internal SystemMessage 'stop_hook_summary'."));
    jJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("memory_saved"),
      written_paths: v.array(v.string()),
      team_count: v.number().optional(),
      verb: v.string().optional().describe('Renders as "<verb> N memories". Defaults to "Saved".'),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Confirmation that the memory subsystem wrote to the listed paths. REPL renders a '<verb> N memories' banner. From internal SystemMessage 'memory_saved'."));
    qJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("agents_killed"),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when background agents are terminated (e.g. on interrupt). REPL renders an 'agents killed' banner. From internal SystemMessage 'agents_killed'."));
    WJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("away_summary"),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Summary of what happened while the user was away (background tasks completed, notifications accumulated). From internal SystemMessage 'away_summary'."));
    GJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("thinking"),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Rendered thinking content (the text itself, not the running token estimate \u2014 that is SDKThinkingTokensMessage). From internal SystemMessage 'thinking'."));
    gns = we(() => v.object({
      type: v.literal("transcript_mirror"),
      filePath: v.string(),
      entries: v.array(v.unknown())
    }).describe("@internal Emitted after each successful local transcript write. The parent peels these off the stdout stream and batches them to the SessionStore adapter. Not exposed to public SDK consumers."));
    n3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("mirror_error"),
      error: v.string(),
      key: v.object({
        projectKey: v.string(),
        sessionId: v.string(),
        subpath: v.string().optional()
      }),
      uuid: wa(),
      session_id: v.string()
    }).describe("Emitted when SessionStore.append() rejects or times out for a transcript-mirror batch after bounded retry (3 attempts with short backoff; timeouts are not retried). The batch is then dropped; this surfaces the failure so consumers are not silent on data loss."));
    r3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("api_retry"),
      attempt: v.number(),
      max_retries: v.number(),
      retry_delay_ms: v.number(),
      error_status: v.number().nullable(),
      error: dns(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Emitted when an API request fails with a retryable error and will be retried after a delay. error_status is null for connection errors (e.g. timeouts) that had no HTTP response."));
    o3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("control_request_progress"),
      request_id: v.string().describe("request_id of the in-flight control_request this progress belongs to."),
      status: v.enum(["started", "api_retry"]),
      attempt: v.number().optional(),
      max_retries: v.number().optional(),
      retry_delay_ms: v.number().optional(),
      error_status: v.number().nullable().optional(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Progress for a long-running client-originated control_request (currently only side_question), correlated by request_id. status 'started' means the worker accepted the request and launched the work; 'api_retry' carries the same retry counters as SDKAPIRetryMessage and is present only for that status."));
    s3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("model_refusal_fallback"),
      trigger: v.literal("refusal"),
      direction: v.enum(["retry", "revert", "sticky"]),
      original_model: v.string(),
      fallback_model: v.string(),
      request_id: v.string().nullable(),
      api_refusal_category: v.string().nullable().optional().describe("The refusal category ('cyber', 'bio', \u2026): stop_details.category from the refused API response (client lane), or the fallback block's server-gated trigger.category (server lane). Open string \u2014 new categories ship on the wire ahead of schema updates. null when neither source carried a category (normal, not an error). Absent when emitted by an older CLI."),
      api_refusal_explanation: v.string().nullable().optional().describe("stop_details.explanation from the refused API response (client lane only \u2014 the server-lane trigger carries no explanation). Unstable human prose \u2014 display only, never parse. null/absent when the response carried none, and always null on server-lane banners."),
      retracted_message_uuids: v.array(v.string()).optional().describe("Wire uuids of the messages this fallback retracted \u2014 the refused partial as the consumer received it (one uuid per normalized SDK message; multi-block messages carry per-block derived uuids) plus any tombstoned tool_results. Emitted AFTER the retraction, so this is a resolution-time eviction signal: remove these messages from transcript state on receipt. Eviction is idempotent \u2014 unknown or already-removed uuids are a no-op. Absent when emitted by an older CLI."),
      refused_user_message_uuid: v.string().nullable().optional().describe("UUID of the user message the refused request was for \u2014 the rewind target and composer prefill for edit-and-retry. This is the message's own uuid as delivered on the replay ack (not a per-block normalized uuid). null when the refused turn was not human-authored (e.g. a background task notification or auto-continuation \u2014 nothing to edit-and-retry) or otherwise cannot be identified; absent from older CLIs."),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe('Emitted when the primary model ends the stream with stop_reason "refusal" and the turn is retried once on a fallback model with the swap made persistent for the session (direction: "retry"). "revert" and "sticky" are retained in the enum for SDK-consumer compat and are no longer emitted.'));
    i3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("model_refusal_no_fallback"),
      original_model: v.string(),
      request_id: v.string().nullable(),
      api_refusal_category: v.string().nullable().optional(),
      api_refusal_explanation: v.string().nullable().optional(),
      refused_user_message_uuid: v.string().nullable().optional(),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe('Emitted when the model ends the stream with stop_reason "refusal" and no fallback model is configured, so the turn ends as an error. The structured counterpart to detecting stop_reason "refusal" on the assistant error frame. Not emitted when a fallback existed but was declined or gate-failed (model_refusal_fallback covers the retry case). Absent from older CLIs.'));
    VJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("model_fallback"),
      trigger: v.enum(["model_not_found", "permission_denied", "overloaded", "server_error", "last_resort", "model_blocked"]),
      original_model: v.string(),
      fallback_model: v.string(),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe('@internal Emitted when the current turn is switched to the configured fallback model because the primary model failed (trigger "model_not_found": model retired/unknown; "permission_denied": org lacks access; "overloaded": repeated 529s; "server_error": retryable 5xx pivot; "last_resort": non-retryable error on the primary; "model_blocked": primary disabled by the per-model kill switch). Turn-scoped \u2014 the primary is re-tried on the next user turn. Not yet in the public SDKMessage union.'));
    zJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("model_consent_fallback"),
      choice: v.enum(["consent", "switch_default", "cancelled"]).describe("The consent-prompt answer (or no-dialog collapse) that produced the swap. 'consent' appears here only when the gate could not honor it (e.g. usage credits did not end up provisioned \u2014 the loop never enables billing from a bare wire reply)."),
      original_model: v.string(),
      fallback_model: v.string(),
      persisted_as_default: v.boolean().describe("True when the decline also rewrote the saved default model (explicit switch_default with the consent-gated model as the saved default)."),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when a pre-send model consent gate swaps the session off the requested model (consent declined, dismissed, or given without the required entitlement ending up provisioned). Currently emitted by the Fable 5 usage-credit gate (`fable_overage_consent_prompt`). Session-scoped \u2014 the swap persists for the session, and additionally as the saved default when persisted_as_default is true. Absence of this message after the consent dialog resolves means the session stayed on the requested model. Not yet in the public SDKMessage union."));
    KJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("file_snapshot"),
      content: v.string(),
      snapshot_files: v.array(v.object({
        key: v.string().describe("Identifier for the file type (e.g. 'plan', 'todo')."),
        path: v.string().describe("Original file path (for debugging)."),
        content: v.string()
      })),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Snapshot of session files (plan, todo) captured for rewind. From internal SystemMessage 'file_snapshot'."));
    YJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("scheduled_task_fire"),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when a scheduled task (cron) fires. content is the render text. From internal SystemMessage 'scheduled_task_fire'."));
    JJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("turn_duration"),
      duration_ms: v.number(),
      budget_tokens: v.number().optional().describe("Output tokens spent this turn toward the token budget."),
      budget_limit: v.number().optional().describe("Turn token-budget ceiling."),
      budget_nudges: v.number().optional().describe("Budget-nudge count this turn."),
      message_count: v.number().optional().describe("In-memory message count at turn end; used by resume-consistency telemetry to detect write\u2192load round-trip drift."),
      pending_background_agent_count: v.number().optional().describe("Background Agent-tool runs still in flight when the turn finished."),
      pending_workflow_count: v.number().optional().describe("Workflow-tool runs still in flight when the turn finished."),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Per-turn wall-clock duration plus budget and pending-background-work counts. REPL renders the 'Done in Ns' / 'Waiting for N agents' line. From internal SystemMessage 'turn_duration'."));
    XJv = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("api_error"),
      error: v.object({
        message: v.string(),
        status: v.number().optional(),
        request_id: v.string().optional(),
        formatted: v.string().describe("Human-readable display string for the error."),
        connection: v.object({
          code: v.string(),
          message: v.string(),
          is_ssl_error: v.boolean()
        }).nullable().describe("errno/SSL code extracted from the cause chain; null when absent."),
        is_network_down: v.boolean(),
        rate_limits: v.object({
          resets_at: v.number().optional(),
          rate_limit_type: v.string().optional()
        }).nullable().describe("Quota-429 headers surfaced by the retry banner; null when not a quota 429.")
      }).describe("Plain-data snapshot of the APIError \u2014 the class instance cannot cross the wire."),
      retry_in_ms: v.number(),
      retry_attempt: v.number(),
      max_retries: v.number(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Retryable-API-error frame carrying the plain-data error snapshot and retry counters. REPL renders the retry banner from this. Wire twin is SDKAPIRetryMessage ('api_retry'). From internal SystemMessage 'api_error'."));
    a3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("local_command_output"),
      content: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Output from a local slash command (e.g. /voice, /usage). Displayed as assistant-style text in the transcript."));
    l3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("hook_started"),
      hook_id: v.string(),
      hook_name: v.string(),
      hook_event: v.string(),
      uuid: wa(),
      session_id: v.string()
    }));
    c3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("hook_progress"),
      hook_id: v.string(),
      hook_name: v.string(),
      hook_event: v.string(),
      stdout: v.string(),
      stderr: v.string(),
      output: v.string(),
      uuid: wa(),
      session_id: v.string()
    }));
    u3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("hook_response"),
      hook_id: v.string(),
      hook_name: v.string(),
      hook_event: v.string(),
      output: v.string(),
      stdout: v.string(),
      stderr: v.string(),
      exit_code: v.number().optional(),
      outcome: v.enum(["success", "error", "cancelled"]),
      uuid: wa(),
      session_id: v.string()
    }));
    d3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("plugin_install"),
      status: v.enum(["started", "installed", "failed", "completed"]),
      name: v.string().optional(),
      error: v.string().optional(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Headless plugin installation progress (CLAUDE_CODE_SYNC_PLUGIN_INSTALL). started/completed bracket the whole install; installed/failed carry a per-marketplace name."));
    p3f = we(() => v.object({
      type: v.literal("tool_progress"),
      tool_use_id: v.string(),
      tool_name: v.string(),
      parent_tool_use_id: v.string().nullable(),
      elapsed_time_seconds: v.number(),
      task_id: v.string().optional(),
      uuid: wa(),
      session_id: v.string()
    }));
    m3f = we(() => v.object({
      type: v.literal("auth_status"),
      isAuthenticating: v.boolean(),
      output: v.array(v.string()),
      error: v.string().optional(),
      uuid: wa(),
      session_id: v.string()
    }));
    f3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("files_persisted"),
      files: v.array(v.object({
        filename: v.string(),
        file_id: v.string()
      })),
      failed: v.array(v.object({
        filename: v.string(),
        error: v.string()
      })),
      processed_at: v.string(),
      uuid: wa(),
      session_id: v.string()
    }));
    h3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("task_notification"),
      task_id: v.string(),
      tool_use_id: v.string().optional(),
      status: v.enum(["completed", "failed", "stopped"]),
      output_file: v.string(),
      summary: v.string(),
      usage: v.object({
        total_tokens: v.number(),
        tool_uses: v.number(),
        duration_ms: v.number()
      }).optional(),
      skip_transcript: v.boolean().optional(),
      uuid: wa(),
      session_id: v.string()
    }));
    g3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("task_started"),
      task_id: v.string(),
      tool_use_id: v.string().optional(),
      description: v.string(),
      subagent_type: v.string().optional().describe("Subagent type for Task tool subagents."),
      task_type: v.string().optional(),
      workflow_name: v.string().optional().describe("meta.name from the workflow script (e.g. 'spec'). Only set when task_type is 'local_workflow'."),
      prompt: v.string().optional(),
      skip_transcript: v.boolean().optional().describe("Ambient/housekeeping task. Consumers should hide this from the inline transcript; it may still appear in a tasks panel."),
      uuid: wa(),
      session_id: v.string()
    }));
    y3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("task_updated"),
      task_id: v.string(),
      patch: v.object({
        status: v.enum(["pending", "running", "completed", "failed", "killed", "paused"]).optional(),
        description: v.string().optional(),
        end_time: v.number().optional(),
        total_paused_ms: v.number().optional(),
        error: v.string().optional(),
        is_backgrounded: v.boolean().optional()
      }).describe("Wire-safe subset of TaskState fields that changed. Excludes abortController, messages, result. Clients merge into their local task map."),
      uuid: wa(),
      session_id: v.string()
    }));
    _3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("session_state_changed"),
      state: v.enum(["idle", "running", "requires_action"]),
      uuid: wa(),
      session_id: v.string()
    }).describe("Mirrors notifySessionStateChanged. 'idle' fires after heldBackResult flushes and the bg-agent do-while exits \u2014 authoritative turn-over signal."));
    b3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("worker_shutting_down"),
      reason: v.string().describe("Short snake_case reason set by the host CLI (not user input), e.g. 'host_exit', 'remote_control_disabled'."),
      uuid: wa(),
      session_id: v.string()
    }).describe("Emitted by the bridge on opt-in graceful worker teardown (only when the teardown caller supplied a reason), before the heartbeat stops, so remote clients can show why the worker went away instead of waiting for heartbeat timeout. Absence is NOT a dead-host signal: handoffs (/update, /teleport, respawn), auto-disable, mode transitions, and internal fatal-error paths emit nothing by design. A dead host (battery, OOM, kill -9) never reaches teardown and never sends this either. NOTE: this event lands in the durable per-session event stream \u2014 a session that is later resumed may carry historical instances mid-stream. Clients MUST treat it as a live-tail signal only (honored when no further activity follows), not a one-shot session-lifetime fact. CC-2656."));
    S3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("commands_changed"),
      commands: v.array(bsn()),
      uuid: wa(),
      session_id: v.string()
    }).describe("Fire-and-forget push of the full slash-command list after a mid-session change (e.g. skills discovered dynamically as the agent works in a subdirectory). Clients should REPLACE their cached command list with this payload: supportedCommands() is captured once at initialize and never reflects mid-session changes, so a client re-fetch would return the stale init list."));
    T3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("notification"),
      key: v.string(),
      text: v.string(),
      priority: v.enum(["low", "medium", "high", "immediate"]),
      color: v.string().optional(),
      timeout_ms: v.number().optional(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Loop-side text notification. Mirrors the interactive REPL notification queue (key/priority/timeout). JSX notifications are not emitted on this channel."));
    E3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("task_progress"),
      task_id: v.string(),
      tool_use_id: v.string().optional(),
      description: v.string(),
      subagent_type: v.string().optional().describe("Subagent type for Task tool subagents."),
      usage: v.object({
        total_tokens: v.number(),
        tool_uses: v.number(),
        duration_ms: v.number()
      }),
      last_tool_name: v.string().optional(),
      summary: v.string().optional(),
      uuid: wa(),
      session_id: v.string()
    }));
    v3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("thinking_tokens"),
      estimated_tokens: v.number(),
      estimated_tokens_delta: v.number(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Live thinking-token estimate, digested from thinking_delta.estimated_tokens during the redacted-thinking phase (where the API otherwise streams only pings). estimated_tokens is the running total for the current thinking block; estimated_tokens_delta is the increment carried by this frame. Approximate progress for spinners/pills, not the authoritative billed output_tokens."));
    w3f = we(() => v.object({
      type: v.literal("tool_use_summary"),
      summary: v.string(),
      preceding_tool_use_ids: v.array(v.string()),
      uuid: wa(),
      session_id: v.string(),
      timestamp: v.string().optional().describe("@internal ISO timestamp when the summary was created on the originating process. From internal ToolUseSummaryMessage.timestamp.")
    }));
    C3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("memory_recall"),
      mode: v.enum(["select", "synthesize"]).describe("How memories were surfaced: 'select' returns full file bodies chosen by the parallel selector; 'synthesize' returns a Sonnet-authored paragraph distilled from many tiny memories."),
      memories: v.array(v.object({
        path: v.string().describe("Absolute path to the memory file, a synthesis sentinel of the form `<synthesis:DIR>` when mode is 'synthesize', or an https URL when scope is 'organization'."),
        scope: v.enum(["personal", "team", "organization"]),
        content: v.string().optional().describe("The surfaced memory body. Always present for 'synthesize' mode and 'organization' scope (neither has an on-disk path to lazy-load from); absent for file-backed 'select' entries (renderers lazy-load from path).")
      })),
      uuid: wa(),
      session_id: v.string()
    }).describe('Emitted when the memory recall supervisor surfaces relevant memories into the turn. Mirrors the CLI relevant_memories attachment so SDK renderers can show "Recalled from memory" inline.'));
    R3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("elicitation_complete"),
      mcp_server_name: v.string(),
      elicitation_id: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Emitted when an MCP server confirms that a URL-mode elicitation is complete."));
    x3f = we(() => v.object({
      type: v.literal("system"),
      subtype: v.literal("permission_denied"),
      tool_name: v.string(),
      tool_use_id: v.string(),
      agent_id: v.string().optional().describe("Subagent ID when the denied tool call originated inside a subagent. Mirrors can_use_tool for host-side routing."),
      decision_reason_type: v.string().optional().describe("Discriminator from PermissionDecisionReason (e.g. 'classifier', 'asyncAgent', 'mode', 'rule')."),
      decision_reason: v.string().optional().describe("Human-readable reason from the deciding component, when available."),
      message: v.string().describe("The rejection message returned to the model in the tool_result."),
      uuid: wa(),
      session_id: v.string()
    }).describe("Emitted when a tool call is auto-denied without an interactive permission prompt (e.g. auto-mode classifier, dontAsk mode, headless-agent auto-deny, or a deny rule). The 'ask' path surfaces via a can_use_tool control_request; this event covers the 'deny' short-circuit in canUseTool so SDK hosts can render the denial instead of only seeing an is_error tool_result. PreToolUse hook denies bypass canUseTool and are not covered here."));
    k3f = we(() => v.object({
      type: v.literal("prompt_suggestion"),
      suggestion: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("Predicted next user prompt, emitted after each turn when promptSuggestions is enabled."));
    QJv = we(() => v.object({
      type: v.literal("attachment"),
      attachment: v.unknown().describe("Internal Attachment discriminated union (at-mentioned files, IDE selections, pasted images, structured output, deferred tool-use). Wire shape pending a dedicated SDKAttachment schema."),
      timestamp: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when the engine yields an AttachmentMessage into the turn stream. Carries user-attached content (at-mentioned files, IDE selections, pasted media) and loop-attached data (structured output, deferred tool-use payloads). SDKResultMessage.structured_output and .deferred_tool_use are derived from these frames. From internal QueryEvent 'attachment'."));
    ZJv = we(() => v.object({
      type: v.literal("tombstone"),
      message: v.unknown().describe("The internal Message being tombstoned. Wire shape pending a dedicated schema."),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when a previously-yielded message is superseded or removed from the transcript (e.g., streaming\u2192non-streaming fallback removes a partial orphan). Consumers that render or persist the stream should remove the referenced message. From internal QueryEvent 'tombstone'."));
    A3f = we(() => v.object({
      type: v.literal("conversation_reset"),
      new_conversation_id: wa(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted by /clear, plan-mode exit, and fresh-session flows. The surface should mount a fresh transcript under new_conversation_id and reset any cached session title. From internal QueryEvent 'conversation_reset'."));
    eXv = we(() => v.object({
      type: v.literal("api_metrics"),
      event: v.discriminatedUnion("type", [v.object({
        type: v.literal("start"),
        ttft_ms: v.number(),
        id: v.string().optional(),
        message_id: v.string().optional()
      }), v.object({
        type: v.literal("end"),
        output_tokens: v.number(),
        id: v.string().optional()
      }), v.object({
        type: v.literal("content_block_start"),
        id: v.string().optional()
      }), v.object({
        type: v.literal("thinking_progress"),
        estimated_tokens_delta: v.number(),
        id: v.string().optional()
      }), v.object({
        type: v.literal("thinking_signature"),
        chars: v.number(),
        id: v.string().optional()
      })]).describe("Per-API-call OTPS/TTFT lifecycle event. Optional id correlates parallel subagent start/end; serial callers omit it."),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when a subagent's API call reports TTFT or output_tokens for OTPS (output-tokens-per-second) metering. From internal QueryEvent 'api_metrics' (ApiMetricsLifecycleEvent)."));
    tXv = we(() => v.object({
      type: v.literal("os_notification"),
      message: v.string(),
      notification_type: v.string(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when a tool (PushNotificationTool, the Computer Use wrapper) or turn-end cleanup requests a native OS notification. The surface dispatches to its platform notification channel (iTerm2/Kitty/Ghostty/bell in the terminal; native IPC for desktop/IDE). From internal QueryEvent 'os_notification'."));
    nXv = we(() => v.object({
      type: v.literal("apply_flag_settings"),
      settings: v.record(v.string(), v.unknown()).describe("Shallow-merge flag-settings patch \u2014 same shape as SDKControlApplyFlagSettingsRequest.settings."),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Output-direction counterpart to SDKControlApplyFlagSettingsRequest. Emitted when slash commands that toggle flag settings request a batched write that the surface applies to its AppState. From internal QueryEvent 'apply_flag_settings'."));
    rXv = we(() => v.object({
      type: v.literal("command_lifecycle"),
      command_uuid: v.string().describe("The queued command's uuid. Renamed from Engine 'uuid' to avoid collision with the universal message uuid field."),
      state: v.enum(["started", "completed"]),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when a queued slash command starts draining ('started') or finishes ('completed'). Remote transports (mobile/desktop bridge) forward the 'completed' ACK so the client knows its queued command was processed. From internal QueryEvent 'command_lifecycle'."));
    oXv = we(() => v.object({
      type: v.literal("set_expanded_view"),
      expanded_view: v.enum(["none", "tasks", "teammates"]),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Hint to expand a side panel. Enum is a superset of AppState.expandedView for back-compat; do not narrow."));
    yns = we(() => v.object({
      type: v.literal("active_goal"),
      value: v.object({
        condition: v.string(),
        iterations: v.number(),
        set_at: v.number(),
        tokens_at_start: v.number(),
        last_reason: v.string().optional()
      }).nullable(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when the user's /goal Stop hook reports met (clears) or not-yet-met (bumps iterations + last_reason). Any surface with a goal indicator re-renders from this. value is null when the goal is cleared. From internal QueryEvent 'active_goal'."));
    sXv = we(() => v.object({
      type: v.literal("set_in_progress_tool_use_ids"),
      op: v.object({
        action: v.enum(["add", "remove"]),
        ids: v.array(v.string())
      }),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when tool execution adds/removes tool_use ids from the mid-execution set (after permission grant, before result). Surfaces use this to show which tools are running. From internal QueryEvent 'set_in_progress_tool_use_ids'."));
    iXv = we(() => v.object({
      type: v.literal("hint_clears"),
      ids: v.array(v.string()),
      content_by_id: v.record(v.string(), v.string()),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when the server-side context-hint reject path reports cleared tool_use ids after a retry/fallback. The surface re-runs clearToolResultsById on its message list so subsequent turns match the API's view. From internal QueryEvent 'hint_clears'."));
    aXv = we(() => v.object({
      type: v.literal("interruptible_tool_in_progress"),
      in_progress: v.boolean(),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when the set of executing tools transitions in or out of an all-interruptible state. The surface uses this to decide whether a fresh user submit should interrupt the current turn (vs. queue). From internal QueryEvent 'interruptible_tool_in_progress'."));
    lXv = we(() => v.object({
      type: v.literal("open_message_selector"),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted by /rewind to open the message-selector overlay. Fire-and-forget \u2014 the user's selection returns through a separate channel. From internal QueryEvent 'open_message_selector'."));
    cXv = we(() => v.object({
      type: v.literal("compact_progress"),
      event: v.discriminatedUnion("type", [v.object({
        type: v.literal("hooks_start"),
        hook_type: v.enum(["pre_compact", "post_compact", "session_start"])
      }), v.object({
        type: v.literal("compact_start"),
        hint_text: v.string().nullable().optional()
      }), v.object({
        type: v.literal("compact_end")
      })]).describe("In-progress compaction lifecycle event."),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted while compaction is running (hook phase, compact start, compact end). Distinct from system/compact_boundary, which reports the post-compaction transcript boundary after completion. From internal QueryEvent 'compact_progress' (CompactEvent Delta-track arm)."));
    uXv = we(() => v.object({
      type: v.literal("stream_mode"),
      mode: v.enum(["tool-input", "tool-use", "requesting", "responding", "thinking"]),
      uuid: wa(),
      session_id: v.string()
    }).describe("@internal Emitted when the engine's spinner phase changes during compaction. From internal QueryEvent 'stream_mode' (CompactEvent Delta-track arm)."));
    dXv = we(() => v.discriminatedUnion("op", [v.object({
      type: v.literal("response_length"),
      op: v.literal("add"),
      delta: v.number(),
      uuid: wa(),
      session_id: v.string()
    }), v.object({
      type: v.literal("response_length"),
      op: v.literal("reset"),
      uuid: wa(),
      session_id: v.string()
    })]).describe("@internal Emitted to drive the streaming-output character counter in the spinner ('add' accumulates, 'reset' zeroes on compaction-boundary swap). From internal QueryEvent 'response_length' (Delta-track)."));
    pXv = we(() => v.discriminatedUnion("phase", [v.object({
      type: v.literal("refusal_continuation"),
      phase: v.literal("begin"),
      salvage_text: v.string(),
      uuid: wa(),
      session_id: v.string()
    }), v.object({
      type: v.literal("refusal_continuation"),
      phase: v.literal("end"),
      uuid: wa(),
      session_id: v.string()
    })]).describe("@internal Emitted when a refusal-continuation window begins ('begin' with salvage_text to keep visible in the streaming preview) or ends ('end'). From internal QueryEvent 'refusal_continuation'."));
    mXv = we(() => v.object({
      sessionId: v.string().describe("Unique session identifier (UUID)."),
      summary: v.string().describe("Display title for the session: custom title, auto-generated summary, or first prompt."),
      lastModified: v.number().describe("Last modified time in milliseconds since epoch."),
      fileSize: v.number().optional().describe("File size in bytes. Only populated for local JSONL storage."),
      customTitle: v.string().optional().describe("User-set session title via /rename."),
      firstPrompt: v.string().optional().describe("First meaningful user prompt in the session."),
      gitBranch: v.string().optional().describe("Git branch at the end of the session."),
      cwd: v.string().optional().describe("Working directory for the session."),
      tag: v.string().optional().describe("User-set session tag."),
      createdAt: v.number().optional().describe("Creation time in milliseconds since epoch, extracted from the first entry's timestamp.")
    }).describe("Session metadata returned by listSessions and getSessionInfo."));
    _ns = we(() => v.union([Gqf(), mns(), qqf(), Jqf(), Xqf(), Qqf(), Zqf(), e3f(), r3f(), o3f(), s3f(), i3f(), a3f(), l3f(), c3f(), u3f(), d3f(), p3f(), m3f(), h3f(), g3f(), y3f(), E3f(), v3f(), _3f(), b3f(), S3f(), T3f(), f3f(), w3f(), C3f(), Vqf(), R3f(), x3f(), k3f(), n3f(), t3f(), A3f()]));
    Ssn = we(() => v.enum(["off", "cooldown", "on"]).describe("Fast mode state: off, in cooldown after rate limit, or actively enabled."));
  });
  var I3f;
  var P3f;
  var T9c;
  var O3f;
  var bXv;
  var E9c;
  var v9c;
  var w9c;
  var C9c;
  var R9c;
  var x9c;
  var k9c;
  var A9c;
  var SXv;
  var I9c;
  var TXv;
  var P9c;
  var O9c;
  var EXv;
  var D9c;
  var vXv;
  var M9c;
  var Tsn;
  var lbr;
  var S9c;
  var wXv;
  var N9c;
  var CXv;
  var D3f;
  var M3f;
  var RXv;
  var L9c;
  var xXv;
  var F9c;
  var kXv;
  var U9c;
  var AXv;
  var B9c;
  var IXv;
  var N3f;
  var $9c;
  var PXv;
  var H9c;
  var OXv;
  var j9c;
  var q9c;
  var W9c;
  var G9c;
  var DXv;
  var V9c;
  var MXv;
  var z9c;
  var NXv;
  var K9c;
  var Y9c;
  var J9c;
  var X9c;
  var Q9c;
  var Z9c;
  var e5c;
  var t5c;
  var LXv;
  var n5c;
  var r5c;
  var o5c;
  var s5c;
  var i5c;
  var FXv;
  var a5c;
  var l5c;
  var c5c;
  var u5c;
  var d5c;
  var UXv;
  var BXv;
  var $Xv;
  var L3f;
  var cbr;
  var p5c;
  var m5c;
  var F3f;
  var U3f;
  var f5c;
  var h5c;
  var g5c;
  var B3f;
  var HXv;
  var y5c;
  var jXv;
  var _5c = __lazy(() => {
    b9c();
    I3f = we(() => v.unknown());
    P3f = we(() => v.object({
      matcher: v.string().optional(),
      hookCallbackIds: v.array(v.string()),
      timeout: v.number().optional()
    }).describe("Configuration for matching and routing hook callbacks."));
    T9c = we(() => v.object({
      subtype: v.literal("initialize"),
      hooks: v.record(a9c(), v.array(P3f())).optional(),
      sdkMcpServers: v.array(v.string()).optional(),
      jsonSchema: v.record(v.string(), v.unknown()).optional(),
      systemPrompt: v.array(v.string()).optional(),
      appendSystemPrompt: v.string().optional(),
      planModeInstructions: v.string().optional().describe("Custom workflow body for the plan-mode system reminder. Replaces the default code-implementation phases; the CLI still wraps it with the read-only enforcement preamble and the ExitPlanMode protocol footer."),
      appendSubagentSystemPrompt: v.string().optional().describe("@internal Additional system prompt appended to every Task-tool subagent (and propagated to nested subagents). Gated by CLAUDE_CODE_ENABLE_APPEND_SUBAGENT_PROMPT."),
      toolAliases: v.record(v.string(), v.string()).optional().describe("Map of tool-name aliases applied before name resolution. When the model emits a tool_use whose name is a key in this map, the tool execution path resolves the mapped name instead. Single-hop (no chains). See Options.toolAliases."),
      excludeDynamicSections: v.boolean().optional().describe("When true, omit per-user dynamic sections (working directory, auto-memory path) from the cached system prompt and re-inject them as the first user message. Lets cross-user prompt caching hit on a static system prompt prefix. Tradeoff: the model sees this context slightly later in the prompt, so steering on the working directory and memory location is marginally less authoritative. Has no effect when a custom (non-preset) system prompt is in use."),
      agents: v.record(v.string(), p9c()).optional(),
      title: v.string().optional().describe("Custom session title. When provided, the session uses this title and skips automatic title generation. Has no effect on the persisted title when resuming an existing session."),
      skills: v.array(v.string()).optional().describe('When provided, only skills whose names match an entry are loaded into the main session system prompt, using the same rules as AgentDefinition.skills: exact name, plugin-qualified name, or ":name" suffix. Omit to load every discovered skill. Applies to the main session only; subagents use AgentDefinition.skills.'),
      webSearchIsolationExemptMcpServers: v.array(v.string()).optional().describe("@internal Additional MCP server names exempt from the web search / connector isolation latch. Unioned with the built-in infra-server list."),
      promptSuggestions: v.boolean().optional(),
      agentProgressSummaries: v.boolean().optional(),
      forwardSubagentText: v.boolean().optional(),
      supportedDialogKinds: v.array(v.string()).optional().describe("Dialog kinds (request_user_dialog `dialog_kind` values) this consumer's onUserDialog can actually render. The CLI treats ABSENCE as 'cannot display' and fails closed: without the kind declared here, a dialog-gated flow degrades to its no-dialog behavior (for 'refusal_fallback_prompt', the classic refusal error) instead of parking a dialog the consumer may mishandle. First-attached-client-wins on multi-client sessions; later initializes do not change it.")
    }).describe("Initializes the SDK session with hooks, MCP servers, and agent configuration."));
    O3f = we(() => v.object({
      minTimeBeforeFeedbackMs: v.number(),
      minTimeBetweenFeedbackMs: v.number(),
      minTimeBetweenGlobalFeedbackMs: v.number(),
      minUserTurnsBeforeFeedback: v.number(),
      minUserTurnsBetweenFeedback: v.number(),
      hideThanksAfterMs: v.number(),
      onForModels: v.array(v.string()),
      probability: v.number(),
      lastSurveyShownTime: v.number().nullable()
    }).describe("@internal Session feedback-survey configuration for host UIs (VS Code webview, Claude Desktop) that run the survey trigger logic themselves: the same GrowthBook-driven pacing/probability values the terminal survey uses, plus the cross-surface last-shown time the host can't read. Survey responses are proxied back as tengu_feedback_survey_event log_event notifications."));
    bXv = we(() => v.object({
      commands: v.array(bsn()),
      agents: v.array(uns()),
      output_style: v.string(),
      available_output_styles: v.array(v.string()),
      models: v.array(abr()),
      unavailable_models: v.array(abr()).optional().describe("@internal Models the account can see but not select (disabled: true, reason folded into description \u2014 e.g. a model the org's Zero Data Retention setting excludes). Disjoint from `models`, which stays selectable-only so consumers without disabled rendering are unaffected. Populated only for allowlisted 1P hosts that render these rows (currently the VS Code extension \u2014 UNAVAILABLE_MODELS_HOST_ENTRYPOINTS); empty for every other consumer. Omitted when empty."),
      account: d9c(),
      current_model: v.string().optional().describe("@internal The CLI's active model at connect time. Remote Control clients (web/mobile) sync their model dropdown TO this value on connect instead of sending set_model with their own default \u2014 without it, connecting from a phone silently switches the terminal's model (CC-2659)."),
      current_permission_mode: mRe().optional().describe("@internal The CLI's active permission mode at connect time, for the same connect-time sync as current_model."),
      pid: v.number().optional().describe("@internal CLI process PID for tmux socket isolation"),
      fast_mode_state: Ssn().optional(),
      feedback_survey_config: O3f().optional().describe("@internal Present only when the feedback-survey surface is enabled for this host (GrowthBook gate, privacy level, and org policy all allow it). Absent means the host must not show the survey.")
    }).describe("Response from session initialization with available commands, models, and account info."));
    E9c = we(() => v.object({
      subtype: v.literal("interrupt"),
      reason: v.string().optional().describe("@internal Why the turn was interrupted, forwarded to the turn's AbortSignal.reason. Tool implementations branch on it to distinguish a user-driven cancel (which suppresses error output) from other aborts. Known values: `interrupt` (user Esc/Ctrl+C), `user-cancel`, `remote-cancel`, `consumer-error`, `workflow-abort`, `stalled`, `recovery-timeout`. Open set \u2014 consumers must treat unknown values as a generic abort.")
    }).describe("Interrupts the currently running conversation turn."));
    v9c = we(() => v.object({
      subtype: v.literal("can_use_tool"),
      tool_name: v.string(),
      input: v.record(v.string(), v.unknown()),
      permission_suggestions: v.array(_sn()).optional(),
      blocked_path: v.string().optional(),
      decision_reason: v.string().optional(),
      decision_reason_type: v.enum(PERMISSION_DECISION_REASON_TYPES).optional().describe('Structured discriminator for why auto-mode escalated. Lets SDK hosts make policy (e.g. auto-deny safetyCheck) without parsing decision_reason text. For compound bash commands this is "subcommandResults" even when a safetyCheck is nested inside \u2014 check classifier_approvable for that case.'),
      classifier_approvable: v.boolean().optional().describe("Set when a safetyCheck is present anywhere in the decision reason (including nested inside subcommandResults for compound bash). false = at least one safety check requires manual approval (e.g. Windows path bypass, dangerous rm); true = all safety checks MAY be classifier-approved (e.g. sensitive-file paths). Absent when no safetyCheck is involved."),
      title: v.string().optional(),
      display_name: v.string().optional(),
      tool_use_id: v.string(),
      agent_id: v.string().optional(),
      description: v.string().optional()
    }).describe("Requests permission to use a tool with the given input."));
    w9c = we(() => v.object({
      subtype: v.literal("set_permission_mode"),
      mode: mRe(),
      ultraplan: v.boolean().optional().describe("@internal CCR ultraplan session marker.")
    }).describe("Sets the permission mode for tool execution handling."));
    C9c = we(() => v.object({
      subtype: v.literal("set_model"),
      model: v.string().optional()
    }).describe("Sets the model to use for subsequent conversation turns."));
    R9c = we(() => v.object({
      subtype: v.literal("set_max_thinking_tokens"),
      max_thinking_tokens: v.number().nullable(),
      thinking_display: v.enum(["summarized", "omitted"]).nullable().optional()
    }).describe("Sets the maximum number of thinking tokens for extended thinking. thinking_display optionally sets the thinking display mode for the rest of the session: a value replaces the session display mode, null clears it back to the API default, and when omitted the display mode from session start (--thinking-display) is kept."));
    x9c = we(() => v.object({
      subtype: v.literal("rename_session"),
      title: v.string()
    }).describe("Sets the user-facing title for the current session."));
    k9c = we(() => v.object({
      subtype: v.literal("set_color"),
      color: v.string()
    }).describe('Sets the session accent color. Accepts an agent color name or "default" to reset.'));
    A9c = we(() => v.object({
      subtype: v.literal("mcp_status")
    }).describe("Requests the current status of all MCP server connections."));
    SXv = we(() => v.object({
      mcpServers: v.array(cns())
    }).describe("Response containing the current status of all MCP server connections."));
    I9c = we(() => v.object({
      subtype: v.literal("file_suggestions"),
      query: v.string()
    }).describe("Requests at-mention file autocomplete suggestions for a partial path prefix. Returns the same fuzzy-matched results the TUI shows."));
    TXv = we(() => v.object({
      suggestions: v.array(v.object({
        path: v.string(),
        score: v.number().optional()
      }))
    }).describe("Response containing fuzzy-ranked file path suggestions (capped at the same limit as the TUI typeahead)."));
    P9c = we(() => v.object({
      subtype: v.literal("get_context_usage")
    }).describe("Requests a breakdown of current context window usage by category."));
    O9c = we(() => v.object({
      subtype: v.literal("get_session_cost")
    }).describe("Requests the formatted session cost summary (the same text /usage prints in non-interactive mode). Used by the thin-client /usage dialog to show the remote container cost instead of the local $0.00."));
    EXv = we(() => v.object({
      text: v.string()
    }).describe("Formatted session cost text, ANSI-stripped."));
    D9c = we(() => v.object({
      subtype: v.literal("list_models")
    }).describe("Requests the worker's selectable model catalog. Fulfills the caps.modelCatalog capability: in a remote thin-client session the worker's provider, settings cascade, and enforcement policy decide which models the session can run, so the thin client must ask rather than read its own getModelOptions()."));
    vXv = we(() => v.object({
      models: v.array(abr())
    }).describe("The worker's model options serialized via toModelInfos() \u2014 the same ModelInfo shape the initialize response carries. Includes disabled rows (visible but not selectable) so the thin-client picker renders them greyed-out like the local one."));
    M9c = we(() => v.object({
      subtype: v.literal("get_usage")
    }).describe("Requests the structured /usage data: session cost/usage totals plus claude.ai plan rate-limit utilization when available. Experimental \u2014 the response shape may change."));
    Tsn = we(() => v.object({
      utilization: v.number().nullable().describe("Percentage of the window used, 0-100."),
      resets_at: v.string().nullable().describe("ISO 8601 timestamp when the window resets.")
    }));
    lbr = we(() => v.object({
      name: v.string(),
      pct: v.number().describe("Share of the weighted local usage attributed to this item, 0-100.")
    }));
    S9c = we(() => v.object({
      request_count: v.number().describe("API requests found in local transcripts for this window."),
      session_count: v.number().describe("Distinct sessions observed in this window."),
      behaviors: v.array(v.object({
        key: v.enum(["cache_miss", "long_context", "subagent_heavy", "high_parallel", "cron"]),
        pct: v.number().describe("Share of the weighted local usage attributed to this behavior, 0-100."),
        count: v.number().describe("Requests in this window exhibiting the behavior.")
      })).describe("Behavioral characteristics of local usage. Categories overlap \u2014 this is not a partition, so percentages do not sum to 100."),
      agents: v.array(lbr()),
      skills: v.array(lbr()),
      plugins: v.array(lbr()),
      mcp_servers: v.array(lbr())
    }));
    wXv = we(() => v.object({
      session: v.object({
        total_cost_usd: v.number(),
        total_api_duration_ms: v.number(),
        total_duration_ms: v.number(),
        total_lines_added: v.number(),
        total_lines_removed: v.number(),
        model_usage: v.record(v.string(), obr())
      }).describe("Cost and usage accumulated by the current session."),
      subscription_type: v.string().nullable().describe("Claude.ai subscription type ('pro', 'max', 'team', 'enterprise') or null for API key / 3P provider sessions."),
      rate_limits_available: v.boolean().describe("False when plan rate limits do not apply (API key, Bedrock, Vertex, or missing profile scope) \u2014 rate_limits will be null."),
      rate_limits: v.object({
        five_hour: Tsn().nullable().optional(),
        seven_day: Tsn().nullable().optional(),
        seven_day_oauth_apps: Tsn().nullable().optional(),
        seven_day_opus: Tsn().nullable().optional(),
        seven_day_sonnet: Tsn().nullable().optional(),
        model_scoped: v.array(v.object({
          display_name: v.string().describe("Server-supplied label for the model bucket (e.g. 'Fable')."),
          utilization: v.number().nullable(),
          resets_at: v.string().nullable()
        })).optional().describe("Per-model weekly windows from the server limits[] array, filtered by the overage-included-models allowlist. Additive \u2014 present only when the server emits them."),
        extra_usage: v.object({
          is_enabled: v.boolean(),
          monthly_limit: v.number().nullable(),
          used_credits: v.number().nullable(),
          utilization: v.number().nullable(),
          currency: v.string().nullable().optional()
        }).nullable().optional()
      }).nullable().describe("Plan rate-limit utilization windows from the claude.ai usage endpoint, or null when unavailable."),
      behaviors: v.object({
        day: S9c().describe("Last 24 hours."),
        week: S9c().describe("Last 7 days.")
      }).nullable().describe("What's contributing to limits usage, from a scan of local transcripts on this machine (the same data the /usage dialog renders): behavioral characteristics plus per-skill/agent/plugin/MCP-server attribution. Approximate, excludes other devices and claude.ai. Null for non-claude.ai-subscriber sessions (mirrors the dialog) or when the scan fails.")
    }).describe("Structured /usage data: session cost/usage totals plus claude.ai plan rate-limit utilization. Experimental \u2014 the shape may change."));
    N9c = we(() => v.object({
      subtype: v.literal("get_binary_version")
    }).describe("Requests the responder's CLI binary version. Used by /version in --remote mode so the thin client can show both its own and the remote container's version."));
    CXv = we(() => v.object({
      version: v.string(),
      buildTime: v.string().optional()
    }));
    D3f = we(() => v.object({
      name: v.string(),
      tokens: v.number(),
      color: v.string(),
      isDeferred: v.boolean().optional()
    }));
    M3f = we(() => v.object({
      color: v.string(),
      isFilled: v.boolean(),
      categoryName: v.string(),
      tokens: v.number(),
      percentage: v.number(),
      squareFullness: v.number()
    }));
    RXv = we(() => v.object({
      categories: v.array(D3f()),
      totalTokens: v.number(),
      maxTokens: v.number(),
      rawMaxTokens: v.number(),
      percentage: v.number(),
      gridRows: v.array(v.array(M3f())),
      model: v.string(),
      memoryFiles: v.array(v.object({
        path: v.string(),
        type: v.string(),
        tokens: v.number()
      })),
      mcpTools: v.array(v.object({
        name: v.string(),
        serverName: v.string(),
        tokens: v.number(),
        isLoaded: v.boolean().optional()
      })),
      deferredBuiltinTools: v.array(v.object({
        name: v.string(),
        tokens: v.number(),
        isLoaded: v.boolean()
      })).optional(),
      systemTools: v.array(v.object({
        name: v.string(),
        tokens: v.number()
      })).optional(),
      systemPromptSections: v.array(v.object({
        name: v.string(),
        tokens: v.number()
      })).optional(),
      agents: v.array(v.object({
        agentType: v.string(),
        source: v.string(),
        tokens: v.number()
      })),
      slashCommands: v.object({
        totalCommands: v.number(),
        includedCommands: v.number(),
        tokens: v.number()
      }).optional(),
      skills: v.object({
        totalSkills: v.number(),
        includedSkills: v.number(),
        tokens: v.number(),
        skillFrontmatter: v.array(v.object({
          name: v.string(),
          source: v.string(),
          tokens: v.number()
        }))
      }).optional(),
      autoCompactThreshold: v.number().optional(),
      isAutoCompactEnabled: v.boolean(),
      messageBreakdown: v.object({
        toolCallTokens: v.number(),
        toolResultTokens: v.number(),
        attachmentTokens: v.number(),
        assistantMessageTokens: v.number(),
        userMessageTokens: v.number(),
        redirectedContextTokens: v.number(),
        unattributedTokens: v.number(),
        toolCallsByType: v.array(v.object({
          name: v.string(),
          callTokens: v.number(),
          resultTokens: v.number()
        })),
        attachmentsByType: v.array(v.object({
          name: v.string(),
          tokens: v.number()
        }))
      }).optional(),
      apiUsage: v.object({
        input_tokens: v.number(),
        output_tokens: v.number(),
        cache_creation_input_tokens: v.number(),
        cache_read_input_tokens: v.number()
      }).nullable()
    }).describe("Breakdown of current context window usage by category (system prompt, tools, messages, etc.)."));
    L9c = we(() => v.object({
      subtype: v.literal("mcp_call"),
      tool: v.string().describe("Fully-qualified MCP tool name, e.g. mcp__server__tool_name."),
      arguments: v.record(v.string(), v.unknown()).optional()
    }).describe("Invokes an MCP tool via the subprocess MCP client without a model turn. No permission check (control channel is trusted, same as other " + 'subtypes). SDK-type MCP servers (config.type === "sdk") are rejected \u2014 ' + "they are caller-provided, so the caller can invoke them directly without the subprocess round-trip. Result content passes through the same processing as model-turn MCP calls. Session expiry is not retried automatically; callers can mcp_reconnect and retry. UrlElicitationRequired (-32042) tries Elicitation hooks; if no hook " + "resolves, the call errors with the URL in the message \u2014 open it " + "out-of-band, then retry mcp_call."));
    xXv = we(() => v.object({
      content: v.unknown(),
      structuredContent: v.record(v.string(), v.unknown()).optional(),
      _meta: v.record(v.string(), v.unknown()).optional()
    }).describe("MCP tool result \u2014 the content array, structuredContent, and _meta " + "from CallToolResult. Content passes through the same processing as model-turn MCP calls (large results may be truncated or redirected to a file). Caller interprets."));
    F9c = we(() => v.object({
      subtype: v.literal("rewind_files"),
      user_message_id: v.string(),
      dry_run: v.boolean().optional()
    }).describe("Rewinds file changes made since a specific user message."));
    kXv = we(() => v.object({
      canRewind: v.boolean(),
      error: v.string().optional(),
      filesChanged: v.array(v.string()).optional(),
      insertions: v.number().optional(),
      deletions: v.number().optional()
    }).describe("Result of a rewindFiles operation."));
    U9c = we(() => v.object({
      subtype: v.literal("cancel_async_message"),
      message_uuid: v.string()
    }).describe("Drops a pending async user message from the command queue by uuid. No-op if already dequeued for execution."));
    AXv = we(() => v.object({
      cancelled: v.boolean()
    }).describe("Result of a cancel_async_message operation. cancelled=false means the message was not in the queue (already dequeued or never enqueued)."));
    B9c = we(() => v.object({
      subtype: v.literal("read_file"),
      path: v.string(),
      max_bytes: v.number().optional(),
      encoding: v.enum(["utf-8", "base64"]).optional().describe("How to encode the bytes in `contents`. Defaults to utf-8 (lossy for binary); pass 'base64' to read images.")
    }).describe("Read a file from the session filesystem for the remote sidebar viewer. Path is resolved against cwd and gated by the same read-permission rules as the Read tool."));
    IXv = we(() => v.object({
      contents: v.string(),
      absPath: v.string(),
      truncated: v.boolean().optional(),
      encoding: v.literal("base64").optional().describe("Set when the request asked for base64. Absent means utf-8 \u2014 including when an older CLI ignored the request's encoding field.")
    }).describe("File contents for the remote sidebar viewer."));
    N3f = we(() => v.object({
      oldStart: v.number(),
      oldLines: v.number(),
      newStart: v.number(),
      newLines: v.number(),
      lines: v.array(v.string())
    }));
    $9c = we(() => v.object({
      subtype: v.literal("get_workspace_diff")
    }).describe("@internal Requests the workspace git diff for the thin-client /diff dialog. The worker resolves one base ref for both stats and hunks (working tree vs HEAD, falling back to branch-vs-default-merge-base when the tree is clean) and applies the standard caps (5s git timeout, 50 files, 1MB/file)."));
    PXv = we(() => v.object({
      diff: v.object({
        stats: v.object({
          filesCount: v.number(),
          linesAdded: v.number(),
          linesRemoved: v.number()
        }),
        perFileStats: v.array(v.object({
          path: v.string(),
          added: v.number(),
          removed: v.number(),
          isBinary: v.boolean(),
          isUntracked: v.boolean()
        })),
        hunks: v.array(v.object({
          path: v.string(),
          hunks: v.array(N3f())
        })),
        skippedLarge: v.array(v.string()).describe("Paths whose diff text exceeded the per-file or aggregate size cap, so they have stats but no hunks."),
        restricted: v.array(v.string()).describe("Paths whose hunk content was withheld by read-permission rules (same gate as read_file); stats remain visible."),
        source: v.union([v.object({
          kind: v.literal("working-tree")
        }), v.object({
          kind: v.literal("branch"),
          baseBranch: v.string(),
          baseRef: v.string()
        })])
      }).nullable()
    }).describe("@internal Workspace git diff for the thin-client /diff dialog. diff is null when the workspace is not a git repo or is in a transient git state (merge/rebase/cherry-pick). Paths in skippedLarge carry no hunks entry at all \u2014 membership alone marks them as too large. An entirely empty hunks array with non-empty perFileStats is not by itself a failure signal: it is the normal shape when all changes are untracked (stats only \u2014 git diff emits no hunks for untracked files) or every file was withheld, and can also occur when the hunks fetch transiently failed and only stats are available."));
    H9c = we(() => v.object({
      subtype: v.literal("get_plan")
    }).describe("@internal Read the session's current plan-mode plan. Unlike read_file, the caller does not need to know the plan file's path \u2014 the worker resolves its own plan slug. Never creates a plan slug or file."));
    OXv = we(() => v.object({
      exists: v.boolean(),
      content: v.string().optional().describe("Plan markdown. Present iff exists is true."),
      path: v.string().optional().describe("Absolute plan-file path on the session filesystem. Present iff exists is true.")
    }).describe("@internal The current plan, or exists:false when none has been written."));
    j9c = we(() => v.object({
      subtype: v.literal("seed_read_state"),
      path: v.string(),
      mtime: v.number()
    }).describe("Seeds the readFileState cache with a path+mtime entry. Use when a prior Read was removed from context so Edit validation would fail despite the client having observed the Read. The mtime lets the CLI detect if the file changed since the seeded Read \u2014 same staleness check as the normal path."));
    q9c = we(() => v.object({
      subtype: v.literal("hook_callback"),
      callback_id: v.string(),
      input: u9c(),
      tool_use_id: v.string().optional()
    }).describe("Delivers a hook callback with its input data."));
    W9c = we(() => v.object({
      subtype: v.literal("mcp_message"),
      server_name: v.string(),
      message: I3f()
    }).describe("Sends a JSON-RPC message to a specific MCP server."));
    G9c = we(() => v.object({
      subtype: v.literal("mcp_set_servers"),
      servers: v.record(v.string(), ibr())
    }).describe("Replaces the set of dynamically managed MCP servers."));
    DXv = we(() => v.object({
      added: v.array(v.string()),
      removed: v.array(v.string()),
      errors: v.record(v.string(), v.string())
    }).describe("Result of replacing the set of dynamically managed MCP servers."));
    V9c = we(() => v.object({
      subtype: v.literal("reload_plugins")
    }).describe("Reloads plugins from disk and returns the refreshed session components."));
    MXv = we(() => v.object({
      commands: v.array(bsn()),
      agents: v.array(uns()),
      plugins: v.array(v.object({
        name: v.string(),
        path: v.string(),
        source: v.string().optional()
      })),
      mcpServers: v.array(cns()),
      error_count: v.number()
    }).describe("Refreshed commands, agents, plugins, and MCP server status after reload."));
    z9c = we(() => v.object({
      subtype: v.literal("reload_skills")
    }).describe("Reloads skills from disk and returns the refreshed skill list."));
    NXv = we(() => v.object({
      skills: v.array(bsn())
    }).describe("Refreshed skill commands after reload."));
    K9c = we(() => v.object({
      subtype: v.literal("register_repo_root"),
      directory: v.string(),
      reload_claude_md: v.boolean().optional(),
      reload_plugins: v.boolean().optional(),
      reload_skills: v.boolean().optional()
    }).describe("Add a directory as a working-directory root and optionally reload CLAUDE.md, skills, and plugins. The directory must resolve to a subdirectory of cwd."));
    Y9c = we(() => v.object({
      subtype: v.literal("mcp_reconnect"),
      serverName: v.string()
    }).describe("Reconnects a disconnected or failed MCP server."));
    J9c = we(() => v.object({
      subtype: v.literal("mcp_toggle"),
      serverName: v.string(),
      enabled: v.boolean()
    }).describe("Enables or disables an MCP server."));
    X9c = we(() => v.object({
      subtype: v.literal("set_mcp_permission_mode_override"),
      serverName: v.string(),
      mode: mRe().nullable()
    }).describe("@internal Pin (or clear, with mode:null) an MCP server's per-tool permission-mode override. Tighten-only over this channel: only 'default', 'auto', or null are accepted (clampControlChannelOverride); any other mode is rejected without changing state. The override substitutes for the session mode at every per-tool engine decision (effectiveModeForTool) \u2014 and only when the session mode would already auto-allow \u2014 so e.g. a server can be held at 'default' or routed through the auto-mode classifier under global bypassPermissions."));
    Q9c = we(() => v.object({
      subtype: v.literal("stop_task"),
      task_id: v.string()
    }).describe("Stops a running task."));
    Z9c = we(() => v.object({
      subtype: v.literal("background_tasks"),
      tool_use_id: v.string().optional().describe("When set, backgrounds only the task whose originating tool_use block has this id. When omitted, backgrounds all foreground tasks (Ctrl+B semantics).")
    }).describe('Backgrounds in-flight foreground tasks (Bash commands and subagents). With tool_use_id, targets the single task started by that tool_use block; without it, backgrounds all foreground tasks \u2014 the control-request equivalent of pressing Ctrl+B in the terminal. Each blocking tool call returns immediately with a "running in the background" tool_result and the turn continues; the task keeps running and emits a task_notification when it settles.'));
    e5c = we(() => v.object({
      subtype: v.literal("apply_flag_settings"),
      settings: v.record(v.string(), v.unknown())
    }).describe("Merges the provided settings into the flag settings layer, updating the active configuration."));
    t5c = we(() => v.object({
      subtype: v.literal("get_settings")
    }).describe("Returns the effective merged settings and the raw per-source settings."));
    LXv = we(() => v.object({
      effective: v.record(v.string(), v.unknown()),
      sources: v.array(v.object({
        source: v.enum(["userSettings", "projectSettings", "localSettings", "flagSettings", "policySettings"]),
        settings: v.record(v.string(), v.unknown())
      })).describe("Ordered low-to-high priority \u2014 later entries override earlier ones."),
      applied: v.object({
        model: v.string(),
        effort: v.enum(["low", "medium", "high", "xhigh", "max"]).nullable(),
        advisor: v.string().nullable().optional().describe("Advisor model that will be attached to API requests, after enablement, allowlist, and pairing validation. Null when none will be attached; absent on workers that predate the field."),
        ultracode: v.boolean().optional().describe("Whether ultracode (xhigh effort plus standing dynamic-workflow orchestration) is active for the session. Set per session via the `ultracode` settings key (--settings or apply_flag_settings).")
      }).optional().describe("Runtime-resolved values after env overrides, session state, and model-specific defaults are applied. Unlike `effective` (disk merge), these reflect what will actually be sent to the API."),
      errors: v.array(_9c()).optional().describe("Settings parse and validation errors. When non-empty, the listed files were skipped during the merge above \u2014 their settings are not reflected in `effective` or `sources`.")
    }).describe("Effective merged settings plus raw per-source settings in merge order."));
    n5c = we(() => v.object({
      subtype: v.literal("elicitation"),
      mcp_server_name: v.string(),
      message: v.string(),
      mode: v.enum(["form", "url"]).optional(),
      url: v.string().optional(),
      elicitation_id: v.string().optional(),
      requested_schema: v.record(v.string(), v.unknown()).optional(),
      title: v.string().optional().describe("Permission-display title from the MCP server's _meta['anthropic/permissionDisplay']. Mirrors can_use_tool.title so SDK consumers can render elicitation-driven permission prompts with structured headers instead of parsing `message`."),
      display_name: v.string().optional().describe("Short tool/server label from _meta['anthropic/permissionDisplay'].displayName. Mirrors can_use_tool.display_name."),
      description: v.string().optional().describe("Permission-display subtitle from _meta['anthropic/permissionDisplay'].description. Mirrors can_use_tool.description.")
    }).describe("Requests the SDK consumer to handle an MCP elicitation (user input request)."));
    r5c = we(() => v.object({
      action: v.enum(["accept", "decline", "cancel"]),
      content: v.record(v.string(), v.unknown()).optional()
    }).describe("Response from the SDK consumer for an elicitation request."));
    o5c = we(() => v.object({
      subtype: v.literal("request_user_dialog"),
      dialog_kind: v.string().describe('Identifier for the dialog the host should render. Open string union \u2014 new kinds may be added without bumping the protocol; hosts must answer unrecognized kinds with {behavior: "cancelled"}.'),
      payload: v.record(v.string(), v.unknown()).describe("Dialog-specific data passed to the host renderer. Shape is defined per dialog_kind; the protocol transports it opaquely."),
      tool_use_id: v.string().optional()
    }).describe("Requests the SDK consumer to render a tool-driven blocking dialog and return the user choice. Used by tools that previously rendered Ink JSX via setToolJSX with an onDone callback."));
    s5c = we(() => v.object({
      behavior: v.enum(["completed", "cancelled"]),
      result: v.unknown().optional().describe("Dialog-specific result payload. Opaque to the protocol; the caller and dialog renderer agree on the shape per dialog_kind.")
    }).describe("Response from the SDK consumer for a request_user_dialog request."));
    i5c = we(() => v.object({
      subtype: v.literal("submit_feedback"),
      description: v.string(),
      surface: v.enum(["cli", "ccd", "ccr", "ide", "sdk", "cowork"]).optional().describe("Where the feedback flow was initiated. Stamped into the POST body and tengu_bug_report_* analytics so the triage pipeline can distinguish CCD/CCR/IDE/Cowork reports from terminal reports landing in the same claude_cli_feedback table. Defaults to 'sdk'.")
    }).describe("@internal Submits a /feedback report (description + current session transcript + sanitized error log) to api.anthropic.com/api/claude_cli_feedback using the CLI's auth and redaction. Runs the same getFeedbackUnavailableReason() policy checks as the terminal /feedback command \u2014 when feedback is disabled (3P provider, org policy, env kill-switch) the response carries unavailable_reason instead of an error."));
    FXv = we(() => v.object({
      feedback_id: v.string().nullable(),
      unavailable_reason: v.string().optional().describe("Human-readable reason /feedback is disabled in this session (3P provider, org policy, env var). When set, no submission was attempted."),
      is_zdr_org: v.boolean().optional(),
      failure_reason: v.string().optional(),
      status_code: v.number().optional(),
      ccshare_url: v.string().optional().describe("Internal share URL for the conversation. Only set in internal builds when the upload succeeded; absent otherwise.")
    }).describe("@internal Result of a submit_feedback request. feedback_id is set on success; otherwise one of unavailable_reason / failure_reason explains why."));
    a5c = we(() => v.object({
      subtype: v.literal("oauth_token_refresh")
    }).describe("@internal Request from the CLI subprocess to the SDK host for a fresh OAuth access token after a 401 with no local refresh token."));
    l5c = we(() => v.object({
      accessToken: v.string().nullable()
    }).describe("@internal Fresh OAuth access token returned by the SDK host getOAuthToken callback, or null when the host has no token available."));
    c5c = we(() => v.object({
      subtype: v.literal("host_auth_token_refresh")
    }).describe("@internal Request from the CLI subprocess to the SDK host for a fresh provider auth token after a 401 when the host owns the credential (Cowork 3P)."));
    u5c = we(() => v.object({
      authToken: v.string().nullable()
    }).describe("@internal Fresh provider auth token returned by the SDK host getHostAuthToken callback, or null when the host has no token available."));
    d5c = we(() => v.object({
      subtype: v.literal("message_rated"),
      messageUuid: v.string().describe("UUID of the assistant message being rated."),
      sentiment: v.enum(["positive", "negative"]).describe("User rating: positive (thumbs up) or negative (thumbs down)."),
      surface: v.enum(["tool_use", "assistant_text"]).optional().describe("Which in-conversation surface the rating came from. If omitted, logged as tool_use."),
      cleared: v.boolean().optional().describe("True when the caller is un-rating a message (clicking the same control a second time).")
    }).describe("@internal Records a per-message thumbs up/down rating. Logs tengu_message_rated with the same shape as the in-conversation rating controls so Desktop / IDE callers can surface their own native thumbs UI."));
    UXv = we(() => v.object({}).describe("@internal Empty response for message_rated."));
    BXv = we(() => v.union([v9c(), q9c(), W9c(), a5c(), c5c(), n5c(), o5c()]).describe("Control requests the agent loop originates and needs a reply to \u2014 the loop\u2192client RPC slice of SDKControlRequestInner. The remaining members are client\u2192loop commands (set/get/mcp/auth/etc)."));
    $Xv = we(() => v.union([E9c(), T9c(), w9c(), C9c(), R9c(), x9c(), k9c(), A9c(), P9c(), O9c(), D9c(), M9c(), N9c(), L9c(), I9c(), F9c(), U9c(), B9c(), $9c(), H9c(), j9c(), G9c(), K9c(), V9c(), z9c(), Y9c(), J9c(), X9c(), d5c(), Q9c(), Z9c(), e5c(), t5c(), i5c()]).describe("Control requests a client sends to drive the loop \u2014 the client\u2192loop command slice of SDKControlRequestInner. The remaining members are loop\u2192client RPCs that block on a reply (see AgentOriginatedControlRequest)."));
    L3f = we(() => v.union([E9c(), v9c(), T9c(), w9c(), C9c(), R9c(), x9c(), k9c(), A9c(), P9c(), O9c(), D9c(), M9c(), N9c(), L9c(), I9c(), q9c(), W9c(), F9c(), U9c(), B9c(), $9c(), H9c(), j9c(), G9c(), K9c(), V9c(), z9c(), Y9c(), J9c(), X9c(), d5c(), a5c(), c5c(), Q9c(), Z9c(), e5c(), t5c(), n5c(), o5c(), i5c()]));
    cbr = we(() => v.object({
      type: v.literal("control_request"),
      request_id: v.string(),
      request: L3f()
    }));
    p5c = we(() => v.array(v.lazy(() => cbr())).optional().describe("Permission requests still awaiting a response. Sent on the `initialize` response so a client joining an already-initialized session learns about in-flight prompts."));
    m5c = we(() => v.array(v.lazy(() => cbr())).optional().describe("request_user_dialog requests still awaiting a response. Sent on the `initialize` response (sibling of pending_permission_requests) so a client joining an already-initialized session can re-arm in-flight dialogs. Receivers must tolerate the same request_id also arriving as a live or replayed control_request frame and render it once."));
    F3f = we(() => v.object({
      subtype: v.literal("success"),
      request_id: v.string(),
      response: v.record(v.string(), v.unknown()).optional(),
      pending_permission_requests: p5c(),
      pending_user_dialog_requests: m5c()
    }));
    U3f = we(() => v.object({
      subtype: v.literal("error"),
      request_id: v.string(),
      error: v.string(),
      pending_permission_requests: p5c(),
      pending_user_dialog_requests: m5c()
    }));
    f5c = we(() => v.object({
      type: v.literal("control_response"),
      response: v.union([F3f(), U3f()])
    }));
    h5c = we(() => v.object({
      type: v.literal("control_cancel_request"),
      request_id: v.string()
    }).describe("Cancels a currently open control request."));
    g5c = we(() => v.object({
      type: v.literal("keep_alive")
    }).describe("Keep-alive message to maintain WebSocket connection."));
    B3f = we(() => v.object({
      type: v.literal("update_environment_variables"),
      variables: v.record(v.string(), v.string()),
      request_id: v.string().optional()
    }).describe("Updates environment variables at runtime."));
    HXv = we(() => v.union([_ns(), fns(), hns(), gns(), yns()]).describe("Observational messages the agent loop emits \u2014 fire-and-forget, no reply expected. The remaining StdoutMessage members are control-protocol traffic (requests the loop originates and needs a reply to, responses to client-originated requests, keep-alives). This sub-union is the target for QueryEvent convergence so a Transport-shaped REPL can consume events without filtering control noise."));
    y5c = we(() => v.union([_ns(), fns(), hns(), gns(), yns(), f5c(), cbr(), h5c(), g5c()]));
    jXv = we(() => v.union([mns(), h9c(), cbr(), f5c(), h5c(), g5c(), B3f()]));
  });
  function bns() {
    updateLastInteractionTime(true);
  }
  function b5c(e) {
    switch (e.type) {
      case "user":
      case "bash_command":
        return true;
      case "control_request":
        return $3f.vZc(e.request.subtype);
      default:
        return false;
    }
  }
  function S5c(e) {
    return H3f.vZc(e.request.subtype);
  }
  var $3f;
  var H3f;
  var T5c = __lazy(() => {
    at();
    $3f = new Set(["interrupt", "set_permission_mode", "set_model", "set_max_thinking_tokens", "set_color", "mcp_toggle", "message_rated"]);
    H3f = new Set(["can_use_tool", "request_user_dialog", "elicitation"]);
  });
  function Zxt(e, t, n, r) {
    let o = {
      type: "permissionPromptTool",
      permissionPromptToolName: t.name,
      toolResult: e
    };
    if (e.behavior === "allow") {
      let s = e.updatedPermissions;
      if (s) {
        r.setToolPermissionContext(a => Zq(a, s));
        zV(s);
      }
      let i = Object.keys(e.updatedInput).length > 0 ? e.updatedInput : n;
      return {
        ...e,
        updatedInput: i,
        decisionReason: o
      };
    } else if (e.behavior === "deny" && e.interrupt) {
      logForDebugging(`SDK permission prompt deny+interrupt: tool=${t.name} message=${e.message}`);
      r.abortController.abort();
    }
    return {
      ...e,
      decisionReason: o,
      decideLocation: "ask-path"
    };
  }
  var XXv;
  var E5c;
  var j3f;
  var q3f;
  var Esn;
  var Sns = __lazy(() => {
    je();
    Zk();
    Ctr();
    XXv = we(() => Ghs.object({
      tool_name: Ghs.string().describe("The name of the tool requesting permission"),
      input: Ghs.record(Ghs.string(), Ghs.unknown()).describe("The input for the tool"),
      tool_use_id: Ghs.string().optional().describe("The unique tool use request ID")
    }));
    E5c = we(() => Ghs.enum(["user_temporary", "user_permanent", "user_reject"]).optional().catch(undefined));
    j3f = we(() => Ghs.object({
      behavior: Ghs.literal("allow"),
      updatedInput: Ghs.record(Ghs.string(), Ghs.unknown()),
      updatedPermissions: Ghs.array(KTt()).optional().catch(e => {
        logForDebugging(`Malformed updatedPermissions from SDK host ignored: ${e.error.issues[0]?.message ?? "unknown"}`, {
          level: "warn"
        });
        return;
      }),
      toolUseID: Ghs.string().optional(),
      decisionClassification: E5c()
    }));
    q3f = we(() => Ghs.object({
      behavior: Ghs.literal("deny"),
      message: Ghs.string(),
      interrupt: Ghs.boolean().optional(),
      toolUseID: Ghs.string().optional(),
      decisionClassification: E5c()
    }));
    Esn = we(() => Ghs.union([j3f(), q3f()]));
  });
  function v5c(e, t, n, r) {
    return {
      tool_name: `dialog:${e}`,
      display_tool_name: "Claude needs your input",
      action_description: W3f[e] ?? `Respond to the ${e} dialog to continue`,
      raw_command: undefined,
      tool_use_id: r ?? "",
      request_id: n,
      input: {
        dialog_kind: e,
        payload: t
      }
    };
  }
  var W3f;
  var w5c = __lazy(() => {
    W3f = {
      refusal_fallback_prompt: "choose: retry on fallback model or edit prompt"
    };
  });
  function C5c() {
    return Me.CLAUDE_CODE_USER_DIALOG_TIMEOUT_MS ?? 300000;
  }
  var R5c = __lazy(() => {
    pr();
  });
  function z3f(e) {
    return e.replace(V3f, t => t === "\u2028" ? "\\u2028" : "\\u2029");
  }
  function FXe(e) {
    return z3f(De(e));
  }
  var V3f;
  var Tns = __lazy(() => {
    V3f = /\u2028|\u2029/g;
  });
  function x5c(e, t) {
    try {
      return e.getToolUseSummary?.(t) ?? e.getActivityDescription?.(t) ?? "";
    } catch (n) {
      logForDebugging(`describeToolUseForPush failed: ${n}`, {
        level: "error"
      });
      return "";
    }
  }
  function K3f(e, t) {
    if (!e.requiresUserInteraction?.()) {
      return;
    }
    switch (e.name) {
      case "AskUserQuestion":
        {
          let n = Array.isArray(t?.questions) ? t.questions : [];
          let r = n[0];
          let o = r?.header || r?.question;
          let s = n.length > 1 ? ` (+${n.length - 1} more)` : "";
          return {
            label: "Question",
            body: o ? o + s : "Tap to answer"
          };
        }
      case "ExitPlanMode":
        return {
          label: "Plan",
          body: "Plan ready for review"
        };
      case "ConnectGitHub":
        return {
          label: Ume(e.name),
          body: ""
        };
      default:
        return {
          label: Ume(e.name),
          body: ""
        };
    }
  }
  function Y3f(e, t, n, r) {
    let o = K3f(e, t);
    if (o) {
      return {
        tool_name: e.name,
        display_tool_name: o.label,
        action_description: o.body,
        raw_command: undefined,
        tool_use_id: n,
        request_id: "",
        input: t
      };
    }
    let s = (e.name === "Bash" || e.name === "PowerShell") && typeof t.command === "string" ? Lc(t.command) : undefined;
    let i = s !== undefined ? typeof t.description === "string" && t.description ? Lc(t.description) : truncate(s, 50) : Lc(x5c(e, t));
    return {
      tool_name: e.name,
      display_tool_name: Ume(e.name),
      action_description: i,
      raw_command: s,
      tool_use_id: n,
      request_id: r,
      input: t
    };
  }
  class vsn {
    input;
    replayUserMessages;
    structuredInput;
    pendingRequests = new Map();
    publishedPendingActionDetails = new Map();
    timedOutUserDialogs = new Map();
    restoredWorkerState = Promise.resolve(null);
    hydratePrefetch = Promise.resolve(null);
    inputClosed = false;
    unexpectedResponseCallback;
    resolvedToolUseIds = new Set();
    prependedLines = [];
    stallTimer;
    stallFired = false;
    createdAt = Date.now();
    onControlRequestSent;
    onControlRequestResolved;
    onUserDialogParked;
    onCommandLifecycle;
    sessionState;
    outbound = new Hq();
    constructor(e, t, n) {
      this.input = e;
      this.replayUserMessages = t;
      this.input = e;
      this.sessionState = n ?? new dsn();
      this.structuredInput = this.read();
    }
    trackResolvedToolUseId(e) {
      if (e.request.subtype === "can_use_tool") {
        this.resolvedToolUseIds.add(e.request.tool_use_id);
      }
    }
    flushInternalEvents() {
      return Promise.resolve();
    }
    flushDeliveryAcks() {
      return Promise.resolve();
    }
    flushClientEvents() {
      return Promise.resolve(true);
    }
    flushSessionState() {
      return Promise.resolve();
    }
    get internalEventsPending() {
      return 0;
    }
    prependUserMessage(e) {
      this.prependedLines.push(De({
        type: "user",
        session_id: "",
        message: {
          role: "user",
          content: e
        },
        parent_tool_use_id: null
      }) + `
`);
    }
    async *read() {
      let e = "";
      let t = async function* () {
        for (;;) {
          if (this.prependedLines.length > 0) {
            e = this.prependedLines.join("") + e;
            this.prependedLines = [];
          }
          let n = e.indexOf(`
`);
          if (n === -1) {
            break;
          }
          let r = e.slice(0, n);
          e = e.slice(n + 1);
          let o = await this.processLine(r);
          if (o) {
            wn("info", "cli_stdin_message_parsed", {
              type: o.type
            });
            yield o;
          }
        }
      }.bind(this);
      yield* t();
      for await (let n of this.input) {
        e += n;
        yield* t();
      }
      if (e) {
        let n = await this.processLine(e);
        if (n) {
          yield n;
        }
      }
      this.inputClosed = true;
      for (let n of this.pendingRequests.values()) {
        n.reject(Error("Tool permission stream closed before response received"));
      }
    }
    getPendingPermissionRequests() {
      return Array.from(this.pendingRequests.values()).map(e => e.request).filter(e => e.request.subtype === "can_use_tool");
    }
    getPendingUserDialogRequests() {
      return Array.from(this.pendingRequests.values()).map(e => e.request).filter(e => e.request.subtype === "request_user_dialog");
    }
    republishSurvivingPendingAction() {
      let e;
      for (let [t, n] of this.publishedPendingActionDetails) {
        if (this.pendingRequests.vZc(t)) {
          e = n;
        }
      }
      if (!e) {
        return;
      }
      this.sessionState.republishPendingAction(e);
      logEvent("tengu_pending_action_republished", {
        survivor_kind: e.tool_name.startsWith("dialog:") ? "dialog" : "permission",
        pending_permission_requests: this.getPendingPermissionRequests().length,
        pending_dialog_requests: this.getPendingUserDialogRequests().length
      });
    }
    cancelPendingUserDialogs(e, t) {
      let n = 0;
      for (let {
        request: r
      } of Array.from(this.pendingRequests.values())) {
        if (r.request.subtype !== "request_user_dialog" || r.request.dialog_kind !== e) {
          continue;
        }
        logEvent("tengu_request_user_dialog_implicit_cancel", {
          dialog_kind: i3i.createHash("sha256").update(e).digest("hex").slice(0, 12),
          reason: t
        });
        this.injectControlResponse({
          type: "control_response",
          response: {
            subtype: "success",
            request_id: r.request_id,
            response: {
              behavior: "cancelled"
            }
          }
        });
        n += 1;
      }
      return n;
    }
    setUnexpectedResponseCallback(e) {
      this.unexpectedResponseCallback = e;
    }
    ignoresErrorShapedDialogResponse(e, t) {
      if (t.subtype !== "error" || e.request.request.subtype !== "request_user_dialog") {
        return false;
      }
      logEvent("tengu_request_user_dialog_response_ignored", {
        shape: "error",
        dialog_kind: i3i.createHash("sha256").update(e.request.request.dialog_kind).digest("hex").slice(0, 12)
      });
      logForDebugging(`Ignoring error-shaped control_response for parked request_user_dialog request_id=${t.request_id} \u2014 not a human choice; dialog stays parked (error: ${t.error})`);
      return true;
    }
    injectControlResponse(e) {
      let t = e.response?.request_id;
      if (!t) {
        return;
      }
      let n = this.pendingRequests.get(t);
      if (!n) {
        logEvent("tengu_inject_control_response_unknown_id", {
          pending_control_requests: this.pendingRequests.size
        });
        return;
      }
      if (this.ignoresErrorShapedDialogResponse(n, e.response)) {
        return;
      }
      if (this.trackResolvedToolUseId(n.request), this.pendingRequests.delete(t), this.write({
        type: "control_cancel_request",
        request_id: t
      }), e.response.subtype === "error") {
        n.reject(Error(e.response.error));
      } else {
        let r = e.response.response;
        if (n.schema) {
          try {
            n.resolve(n.schema.parse(r));
          } catch (o) {
            n.reject(o);
          }
        } else {
          n.resolve({});
        }
      }
    }
    setOnControlRequestSent(e) {
      this.onControlRequestSent = e;
    }
    setOnControlRequestResolved(e) {
      this.onControlRequestResolved = e;
    }
    async processLine(e) {
      if (!e) {
        return;
      }
      try {
        let t = Jur(qt(e));
        if (t.type === "keep_alive") {
          return;
        }
        if (t.type === "update_environment_variables") {
          let n = [];
          let r = [];
          for (let [o, s] of Object.entries(t.variables)) {
            if (!Q3f.vZc(o)) {
              r.push(o);
              continue;
            }
            process.env[o] = s;
            n.push(o);
          }
          if (r.length > 0) {
            logForDebugging(`[structuredIO] refused update_environment_variables for non-allowlisted keys: ${r.join(", ")}`);
          }
          if (n.includes("CLAUDE_CODE_OAUTH_TOKEN")) {
            clearOAuthTokenCache();
          }
          if (logForDebugging(`[structuredIO] applied update_environment_variables: ${n.join(", ")}`), typeof t.request_id === "string" && t.request_id) {
            this.writeActivityLine(De({
              type: "control_response",
              response: {
                subtype: "success",
                request_id: t.request_id
              }
            }) + `
`);
          }
          return;
        }
        if (t.type === "control_response") {
          let n = "uuid" in t && typeof t.uuid === "string" ? t.uuid : undefined;
          if (n) {
            this.onCommandLifecycle?.(n, "completed");
          }
          let r = this.pendingRequests.get(t.response.request_id);
          if (!r) {
            let s = this.timedOutUserDialogs.get(t.response.request_id);
            if (s) {
              this.timedOutUserDialogs.delete(t.response.request_id);
              let l = t.response.subtype === "success" ? t.response.response?.behavior : undefined;
              let c = t.response.subtype;
              logEvent("tengu_request_user_dialog_late_answer", {
                dialog_kind: i3i.createHash("sha256").update(s.dialogKind).digest("hex").slice(0, 12),
                lateness_ms: Date.now() - s.timedOutAt,
                response_subtype: c === "success" || c === "error" ? c : "other",
                behavior: l === "completed" || l === "cancelled" ? l : l === undefined ? "absent" : "other"
              });
              logForDebugging(`Ignoring late request_user_dialog answer for request_id=${t.response.request_id}: the park deadline already settled this dialog as cancelled ${Date.now() - s.timedOutAt}ms ago`);
              return;
            }
            let a = (t.response.subtype === "success" ? t.response.response : undefined)?.toolUseID;
            if (typeof a === "string" && this.resolvedToolUseIds.vZc(a)) {
              logForDebugging(`Ignoring duplicate control_response for already-resolved toolUseID=${a} request_id=${t.response.request_id}`);
              return;
            }
            if (this.unexpectedResponseCallback) {
              await this.unexpectedResponseCallback(t);
            }
            return;
          }
          if (this.ignoresErrorShapedDialogResponse(r, t.response)) {
            return;
          }
          if (this.trackResolvedToolUseId(r.request), this.pendingRequests.delete(t.response.request_id), r.request.request.subtype === "can_use_tool" && this.onControlRequestResolved) {
            this.onControlRequestResolved(t.response.request_id);
          }
          if (S5c(r.request)) {
            bns();
          }
          if (t.response.subtype === "error") {
            r.reject(Error(t.response.error));
            return;
          }
          let o = t.response.response;
          if (r.schema) {
            try {
              r.resolve(r.schema.parse(o));
            } catch (s) {
              r.reject(s);
            }
          } else {
            r.resolve({});
          }
          if (this.replayUserMessages) {
            return t;
          }
          return;
        }
        if (b5c(t)) {
          bns();
        }
        if (t.type !== "user" && t.type !== "bash_command" && t.type !== "control_request" && t.type !== "control_cancel_request" && t.type !== "assistant" && t.type !== "system") {
          logForDebugging(`Ignoring unknown message type: ${t.type}`, {
            level: "warn"
          });
          return;
        }
        if (t.type === "control_request") {
          if (!t.request) {
            Ens("Error: Missing request on control_request");
          }
          return t;
        }
        if (t.type === "control_cancel_request") {
          return typeof t.request_id === "string" ? t : undefined;
        }
        if (t.type === "assistant" || t.type === "system") {
          return t;
        }
        if (t.type === "bash_command") {
          return t;
        }
        if (t.message.role !== "user") {
          Ens(`Error: Expected message role 'user', got '${t.message.role}'`);
        }
        return t;
      } catch (t) {
        Ens(`Error parsing streaming input line: ${e}: ${t}`);
      }
    }
    resetStallWatchdog() {
      this.stallFired = false;
    }
    trackWrite(e) {
      if (this.stallTimer) {
        clearTimeout(this.stallTimer);
      }
      if (e.type !== "result" && !this.stallFired) {
        this.stallTimer = setTimeout(t => {
          if (this.sessionState.getState() !== "running") {
            return;
          }
          this.stallFired = true;
          logEvent("tengu_sdk_stall", {
            session_age_ms: Date.now() - this.createdAt,
            session_state: this.sessionState.getState(),
            last_message_type: t,
            pending_control_requests: this.pendingRequests.size
          });
        }, 300000, e.type);
        this.stallTimer.unref();
      }
      if (e.type !== "system" && Math.random() < 0.01) {
        let t = y5c().safeParse(e);
        if (!t.success) {
          logEvent("tengu_sdk_schema_violation", {
            message_type: e.type,
            error_path: t.error.issues[0]?.path.join(".") ?? ""
          });
        }
      }
    }
    writeActivityLine(e) {
      writeToStdout(e);
    }
    async write(e) {
      this.trackWrite(e);
      writeToStdout(FXe(e) + `
`);
    }
    async sendRequest(e, t, n, r = ekt.randomUUID()) {
      let o = {
        type: "control_request",
        request_id: r,
        request: e
      };
      if (this.inputClosed) {
        throw Error("Stream closed");
      }
      if (n?.aborted) {
        throw Error("Request aborted");
      }
      if (this.outbound.enqueue(o), e.subtype === "can_use_tool" && this.onControlRequestSent) {
        this.onControlRequestSent(o);
      }
      let s = () => {
        this.outbound.enqueue({
          type: "control_cancel_request",
          request_id: r
        });
        let a = this.pendingRequests.get(r);
        if (a) {
          this.trackResolvedToolUseId(a.request);
          a.reject(new xc());
        }
      };
      if (n) {
        n.addEventListener("abort", s, {
          once: true
        });
      }
      let i = Date.now();
      try {
        return await new Promise((a, l) => {
          this.pendingRequests.set(r, {
            request: {
              type: "control_request",
              request_id: r,
              request: e
            },
            resolve: c => {
              a(c);
            },
            reject: l,
            schema: t
          });
        });
      } finally {
        if (logEvent("tengu_sdk_control_roundtrip", {
          subtype: e.subtype,
          duration_ms: Date.now() - i,
          aborted: n?.aborted ?? false
        }), n) {
          n.removeEventListener("abort", s);
        }
        this.pendingRequests.delete(r);
      }
    }
    createCanUseTool(e) {
      return async (t, n, r, o, s, i) => {
        let a = i ?? (await hasPermissionsToUseTool(t, n, r, o, s));
        if (a.behavior === "allow") {
          return a;
        }
        if (a.behavior === "deny") {
          let f = a.decisionReason;
          this.outbound.enqueue({
            type: "system",
            subtype: "permission_denied",
            tool_name: t.name,
            tool_use_id: s,
            agent_id: r.agentId,
            decision_reason_type: f?.type,
            decision_reason: pJt(f),
            message: a.message,
            uuid: ekt.randomUUID(),
            session_id: getSessionId()
          });
          return a;
        }
        let l = a.updatedInput ?? n;
        let c = a.suggestions;
        if (t.name === "Bash" && typeof l.command === "string" && c?.length && !c.some(f => f.destination !== "session")) {
          c = [...OMe(l.command), ...c];
        }
        let u = new AbortController();
        let d = r.abortController.signal;
        let p = () => u.abort();
        d.addEventListener("abort", p, {
          once: true
        });
        let m = ekt.randomUUID();
        try {
          let f = t4f(t, s, l, r, c).then(E => ({
            source: "hook",
            decision: E
          }));
          if (e) {
            let E = Y3f(t, l, s, m);
            this.publishedPendingActionDetails.set(m, E);
            e(E);
          }
          let h = a.decisionReason;
          let g = findSafetyCheckReason(h);
          let y = t.name === "Bash" || t.name === "PowerShell";
          let _ = (a.metadata && "command" in a.metadata ? a.metadata.command.description : undefined) || (y && typeof l.command === "string" ? typeof l.description === "string" && l.description ? Lc(l.description) : truncate(Lc(l.command), 50) : x5c(t, l)) || undefined;
          let b = this.sendRequest({
            subtype: "can_use_tool",
            tool_name: t.name,
            display_name: Ume(t.name),
            input: l,
            ...(_ && {
              description: _
            }),
            permission_suggestions: c,
            blocked_path: a.blockedPath,
            decision_reason: pJt(h),
            decision_reason_type: h?.type,
            classifier_approvable: g ? !findSafetyCheckReason(h, E => !E.classifierApprovable) : undefined,
            tool_use_id: s,
            agent_id: r.agentId
          }, Esn(), u.signal, m).then(E => ({
            source: "sdk",
            result: E
          }));
          let S = await Promise.race([f, b]);
          if (S.source === "hook") {
            if (S.decision) {
              b.catch(() => {});
              u.abort();
              return S.decision;
            }
            let E = await b;
            return Zxt(E.result, t, l, r);
          }
          return Zxt(S.result, t, l, r);
        } catch (f) {
          return Zxt({
            behavior: "deny",
            message: `Tool permission request failed: ${f}`,
            toolUseID: s
          }, t, l, r);
        } finally {
          if (this.publishedPendingActionDetails.delete(m), this.getPendingPermissionRequests().length === 0 && this.getPendingUserDialogRequests().length === 0) {
            this.sessionState.notifyStateChanged("running");
          } else {
            this.sessionState.reteeWaitingOnUser();
            this.republishSurvivingPendingAction();
          }
          d.removeEventListener("abort", p);
        }
      };
    }
    createHookCallback(e, t) {
      return {
        type: "callback",
        timeout: t,
        callback: async (n, r, o) => {
          try {
            return await this.sendRequest({
              subtype: "hook_callback",
              callback_id: e,
              input: n,
              tool_use_id: r || undefined
            }, pRt(), o);
          } catch (s) {
            if (mg(s)) {
              throw s;
            }
            console.error(`Error in hook callback ${e}:`, s);
            return {};
          }
        }
      };
    }
    async handleElicitation(e, t, n, r, o, s, i, a) {
      try {
        return await this.sendRequest({
          subtype: "elicitation",
          mcp_server_name: e,
          message: t,
          mode: o,
          url: s,
          elicitation_id: i,
          requested_schema: n,
          title: a?.title,
          display_name: a?.displayName,
          description: a?.description
        }, r5c(), r);
      } catch {
        return {
          action: "cancel"
        };
      }
    }
    async requestUserDialog(e, t, n) {
      let r = ekt.randomUUID();
      let o = v5c(e, t, r, n?.toolUseId);
      this.publishedPendingActionDetails.set(r, o);
      this.sessionState.notifyStateChanged("requires_action", o);
      this.onUserDialogParked?.(o);
      logEvent("tengu_request_user_dialog_requires_action", {
        dialog_kind: i3i.createHash("sha256").update(e).digest("hex").slice(0, 12)
      });
      let s = C5c();
      let i;
      if (s > 0) {
        i = setTimeout((a, l, c) => {
          if (!this.pendingRequests.vZc(a)) {
            return;
          }
          this.timedOutUserDialogs.set(a, {
            dialogKind: l,
            timedOutAt: Date.now()
          });
          logEvent("tengu_request_user_dialog_timeout", {
            dialog_kind: i3i.createHash("sha256").update(l).digest("hex").slice(0, 12),
            timeout_ms: c
          });
          this.injectControlResponse({
            type: "control_response",
            response: {
              subtype: "success",
              request_id: a,
              response: {
                behavior: "cancelled"
              }
            }
          });
        }, s, r, e, s);
        i.unref();
      }
      try {
        return await this.sendRequest({
          subtype: "request_user_dialog",
          dialog_kind: e,
          payload: t,
          tool_use_id: n?.toolUseId
        }, s5c(), n?.signal, r);
      } catch {
        return {
          behavior: "cancelled"
        };
      } finally {
        if (i !== undefined) {
          clearTimeout(i);
        }
        if (this.publishedPendingActionDetails.delete(r), this.getPendingUserDialogRequests().length === 0 && this.getPendingPermissionRequests().length === 0) {
          this.sessionState.notifyStateChanged("running");
        } else {
          if (!this.timedOutUserDialogs.vZc(r)) {
            this.sessionState.reteeWaitingOnUser();
          }
          this.republishSurvivingPendingAction();
        }
      }
    }
    createSandboxAskCallback(e) {
      let t = new Map();
      let n = async r => {
        try {
          let o = {
            type: "addRules",
            rules: [{
              toolName: "WebFetch",
              ruleContent: `domain:${r}`
            }],
            behavior: "allow",
            destination: "localSettings"
          };
          let s = await this.sendRequest({
            subtype: "can_use_tool",
            tool_name: "SandboxNetworkAccess",
            display_name: Ume("SandboxNetworkAccess"),
            input: {
              host: r
            },
            permission_suggestions: [o],
            tool_use_id: ekt.randomUUID(),
            description: `Allow network connection to ${r}?`
          }, Esn());
          if (s.behavior !== "allow") {
            return false;
          }
          let i = s.updatedPermissions;
          if (i && i.length > 0) {
            zV(i);
            e?.(a => Zq(a, i));
          }
          SandboxManager.addSessionAllowedHost(r);
          return true;
        } catch {
          return false;
        }
      };
      return r => {
        let o = r.host;
        let s = t.get(o);
        if (s) {
          return s;
        }
        let i = n(o).finally(() => {
          t.delete(o);
        });
        t.set(o, i);
        return i;
      };
    }
    async sendMcpMessage(e, t) {
      return (await this.sendRequest({
        subtype: "mcp_message",
        server_name: e,
        message: t
      }, v.object({
        mcp_response: v.any()
      }))).mcp_response;
    }
    async requestOAuthTokenRefresh() {
      return (await this.sendRequest({
        subtype: "oauth_token_refresh"
      }, l5c(), AbortSignal.timeout(30000))).accessToken;
    }
    async requestHostAuthTokenRefresh(e = 30000) {
      return (await this.sendRequest({
        subtype: "host_auth_token_refresh"
      }, u5c(), AbortSignal.timeout(e))).authToken;
    }
  }
  function Ens(e) {
    console.error(e);
    process.exit(1);
  }
  async function t4f(e, t, n, r, o) {
    let s = getToolPermissionContext(r).mode;
    let i = executePermissionRequestHooks(e.name, t, n, r, s, o, r.abortController.signal);
    for await (let a of i) {
      if (a.permissionRequestResult && (a.permissionRequestResult.behavior === "allow" || a.permissionRequestResult.behavior === "deny")) {
        let l = a.permissionRequestResult;
        if (l.behavior === "allow") {
          let c = l.updatedInput || n;
          if (l.updatedInput) {
            let d = guardHookUpdatedInput(await checkRuleBasedPermissions(e, c, {
              ...r,
              toolUseId: t
            }), e.name);
            if (d) {
              return d.behavior === "ask" ? {
                behavior: "deny",
                message: d.message,
                decisionReason: d.decisionReason ?? HOOK_REWRITE_HEADLESS_DENY_REASON,
                decideLocation: "ask-path"
              } : {
                ...d,
                decideLocation: "ask-path"
              };
            }
          }
          let u = l.updatedPermissions ?? [];
          if (u.length > 0) {
            zV(u);
            r.setToolPermissionContext(d => Zq(d, u));
          }
          return {
            behavior: "allow",
            updatedInput: c,
            userModified: false,
            decisionReason: {
              type: "hook",
              hookName: "PermissionRequest"
            }
          };
        } else {
          return {
            behavior: "deny",
            message: l.message || "Permission denied by PermissionRequest hook",
            decisionReason: {
              type: "hook",
              hookName: "PermissionRequest"
            },
            decideLocation: "ask-path"
          };
        }
      }
    }
    return;
  }
  var ekt;
  var Q3f;
  var vns = __lazy(() => {
    at();
    _5c();
    Ot();
    T5c();
    cU();
    EX();
    vzo();
    no();
    je();
    Zm();
    dt();
    Sns();
    oy();
    OD();
    Kv();
    Th();
    dI();
    GXn();
    Sl();
    w5c();
    dw();
    Sp();
    Zk();
    jz();
    Q_r();
    hDe();
    R5c();
    Tns();
    ekt = require("crypto");
    Q3f = new Set(["CLAUDE_CODE_SESSION_ACCESS_TOKEN", "CLAUDE_CODE_OAUTH_TOKEN"]);
  });
  function ubr() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_ccr_delta_rehydrate", false);
  }
  var wns = __lazy(() => {
    $n();
  });
  function A5c(e, t = {}, n, r) {
    let o = new k5c.URL(e.href);
    if (o.protocol === "wss:") {
      o.protocol = "https:";
    } else if (o.protocol === "ws:") {
      o.protocol = "http:";
    }
    o.pathname = o.pathname.replace(/\/$/, "") + "/worker/events/stream";
    return new Trn(o, t, n, r);
  }
  var k5c;
  var I5c = __lazy(() => {
    LJo();
    k5c = require("url");
  });
  function n4f(e) {
    let t = e;
    let n = t.subtype;
    if (e.type === "result" || e.type === "system" && n === "init") {
      return e.type === "result" ? {
        ...e,
        result: undefined,
        permission_denials: undefined,
        structured_output: undefined,
        deferred_tool_use: undefined,
        errors: undefined
      } : e;
    }
    if (e.type === "system" && n === "task_started") {
      return {
        type: "system",
        subtype: n,
        task_id: t.task_id,
        task_type: t.task_type
      };
    }
    if (e.type === "system" && n === "task_updated") {
      let r = t.patch;
      return {
        type: "system",
        subtype: n,
        task_id: t.task_id,
        patch: {
          status: r?.status
        }
      };
    }
    if (e.type === "system" && n === "task_notification") {
      return {
        type: "system",
        subtype: n,
        task_id: t.task_id
      };
    }
    if (e.type === "system" && n === "hook_response") {
      return {
        type: "system",
        subtype: n,
        hook_event: t.hook_event,
        outcome: t.outcome
      };
    }
    if (e.type === "user") {
      return {
        type: e.type,
        subtype: n
      };
    }
    if (e.type === "assistant") {
      let r = t.message?.content;
      if (Array.isArray(r)) {
        let o = r.find(s => s && typeof s === "object" && s.type === "tool_use" && s.name === "ScheduleWakeup");
        if (o) {
          let s = o.input;
          return {
            type: "assistant",
            subtype: n,
            message: {
              content: [{
                type: "tool_use",
                name: "ScheduleWakeup",
                input: {
                  delaySeconds: s?.delaySeconds
                }
              }]
            }
          };
        }
      }
      return {
        type: e.type,
        subtype: n
      };
    }
    return;
  }
  function r4f(e) {
    for (let t of e) {
      if (t === "--") {
        return false;
      }
      if (t === "--resume" || t === "-r" || t.startsWith("--resume=")) {
        return true;
      }
    }
    return false;
  }
  var dbr;
  var P5c;
  var O5c;
  var tkt;
  var D5c = __lazy(() => {
    at();
    k8e();
    M8o();
    CQ();
    ioe();
    hd();
    je();
    Zm();
    gn();
    dt();
    lm();
    Rn();
    OD();
    g7e();
    e1();
    fa();
    sln();
    R3();
    wns();
    Tns();
    sMn();
    vns();
    NJo();
    I5c();
    dbr = require("fs");
    P5c = require("stream");
    O5c = require("url");
    tkt = class tkt extends vsn {
      url;
      transport;
      inputStream;
      isBridge = false;
      isDebug = false;
      teeStdout = false;
      activityFd;
      ccrClient;
      keepAliveTimer = null;
      permanentCloseCode;
      constructor(e, t, n, r) {
        let o = new P5c.PassThrough({
          encoding: "utf8"
        });
        super(o, n, r);
        if (this.inputStream = o, this.url = new O5c.URL(e), this.url.protocol === "wss:") {
          this.url.protocol = "https:";
        } else if (this.url.protocol === "ws:") {
          this.url.protocol = "http:";
        }
        let s = {
          "anthropic-client-platform": getClientPlatform()
        };
        let i = cT();
        if (i) {
          s.Authorization = `Bearer ${i}`;
        } else {
          logForDebugging("[remote-io] No session ingress token available", {
            level: "error"
          });
        }
        let a = process.env.CLAUDE_CODE_ENVIRONMENT_RUNNER_VERSION;
        if (a) {
          s["x-environment-runner-version"] = a;
        }
        let l = () => {
          let g = {};
          let y = cT();
          if (y) {
            g.Authorization = `Bearer ${y}`;
          }
          let _ = process.env.CLAUDE_CODE_ENVIRONMENT_RUNNER_VERSION;
          if (_) {
            g["x-environment-runner-version"] = _;
          }
          return g;
        };
        this.transport = A5c(this.url, s, getSessionId(), l);
        this.isBridge = process.env.CLAUDE_CODE_ENVIRONMENT_KIND === "bridge";
        this.isDebug = isDebugMode();
        this.teeStdout = st(process.env.CLAUDE_CODE_TEE_SDK_STDOUT);
        let c = process.env.CLAUDE_RUNNER_ACTIVITY_FD;
        let u = c ? Number.parseInt(c, 10) : NaN;
        if (Number.isInteger(u) && u > 2) {
          try {
            let g = dbr.fstatSync(u);
            if (!g.isFIFO() && !g.isSocket()) {
              throw Error("not a pipe");
            }
            let y = dbr.createWriteStream("", {
              fd: u,
              autoClose: false
            });
            y.on("error", _ => {
              logForDebugging(`[remote-io] activity fd ${u} write error (${he(_)}); falling back to stdout`);
              this.activityFd = undefined;
            });
            this.activityFd = y;
          } catch (g) {
            logForDebugging(`[remote-io] activity fd ${u} unavailable (${he(g)}); falling back to stdout`);
          }
        }
        this.transport.setOnData(g => {
          if (this.inputStream.write(g), this.isBridge && this.isDebug) {
            writeToStdout(g.endsWith(`
`) ? g : g + `
`);
          }
        });
        this.transport.setOnClose(g => {
          if (g !== undefined) {
            this.permanentCloseCode = g;
            process.stderr.write(`RemoteIO: transport closed permanently (code ${g})
`);
          }
          this.inputStream.end();
        });
        let d = this.isBridge ? undefined : g => {
          process.stderr.write(`SDKStartup: ${g}
`);
        };
        if (d) {
          this.transport.setOnDiagnostic?.(d);
        }
        this.ccrClient = new _rn(this.transport, this.url, {
          onDiagnostic: d
        });
        let p = this.ccrClient.initialize();
        if (this.restoredWorkerState = p.catch(() => null), p.then(() => d?.("worker registered"), g => {
          let y = g instanceof BBe ? g.reason : he(g);
          wn("error", "cli_worker_lifecycle_init_failed", {
            reason: g instanceof BBe ? g.reason : "unknown"
          });
          let _ = `CCRClient initialization failed: ${he(g)}`;
          if (Pwc(g)) {
            logForDebugging(_, {
              level: "error"
            });
          } else {
            Oe(Error(_));
          }
          d?.(`worker registration failed (${y}), exiting`);
          gracefulShutdown(1, "other");
        }), Ti(async () => this.ccrClient.close()), setInternalEventWriter((g, y, _) => this.ccrClient.writeInternalEvent(g, y, _)), setInternalEventReader(g => this.ccrClient.readInternalEvents(g), () => this.ccrClient.readSubagentInternalEvents()), this.ccrClient.onInternalBatchAcked = updateCCRTipFromAckedBatch, r4f(process.argv)) {
          let g = performance.now();
          let y = this.ccrClient;
          this.hydratePrefetch = (async () => {
            let _ = y.readSubagentInternalEvents();
            let b;
            let S = kAt();
            if (S) {
              b = await getValidatedCCRTip(S, ubr());
            }
            let [E, C] = await Promise.all([y.readInternalEvents(b?.eventId), _]);
            return [E, C, b];
          })().catch(_ => (Oe(_), null));
          this.hydratePrefetch.then(() => {
            au("resume_hydrate_fetch_ms", performance.now() - g, g);
            lhl();
          });
        }
        let m = {
          started: "processing",
          completed: "processed"
        };
        if (this.onCommandLifecycle = (g, y) => {
          this.ccrClient.reportDelivery(g, m[y]);
        }, this.isBridge) {
          vgt(getAttestationFilterPolicy);
          this.transport.setEventFilter(g => {
            let y = C5n(g);
            if (y) {
              this.ccrClient.reportDelivery(g.event_id, "received");
              this.ccrClient.reportDelivery(g.event_id, "processed");
            }
            return y;
          });
        }
        let f = g => {
          if (this.teeStdout && !this.isBridge) {
            try {
              this.teeActivity(FXe({
                type: "system",
                subtype: "session_state_changed",
                state: g,
                waiting_on_user: this.sessionState.waitingOnUser
              }) + `
`);
            } catch {}
          }
        };
        this.sessionState.onStateChanged = (g, y) => {
          this.ccrClient.reportState(g, y);
          f(g);
        };
        this.sessionState.onWaitingOnUserChanged = () => {
          f(this.sessionState.getState());
        };
        this.sessionState.onTurnStarting = () => {
          if (this.teeStdout && !this.isBridge) {
            try {
              this.teeActivity(FXe({
                type: "system",
                subtype: "turn_starting"
              }) + `
`);
            } catch {}
          }
        };
        EBo(g => this.sessionState.setMainLoopRefcount(g));
        this.sessionState.setMainLoopRefcount(w1l());
        this.sessionState.onMetadataChanged = g => {
          this.ccrClient.reportMetadata(g);
        };
        this.sessionState.onInternalMetadataChanged = g => {
          this.ccrClient.reportInternalMetadata(g);
        };
        $4i(g => this.sessionState.notifyMetadataChanged(g));
        this.transport.connect();
        let h = lBe().session_keepalive_interval_v2_ms;
        if (this.isBridge && h > 0) {
          this.keepAliveTimer = setInterval(() => {
            logForDebugging("[remote-io] keep_alive sent");
            this.write({
              type: "keep_alive"
            }).catch(g => {
              logForDebugging(`[remote-io] keep_alive write failed: ${he(g)}`);
            });
          }, h);
          this.keepAliveTimer.unref?.();
        }
        if (Ti(async () => this.close()), t) {
          let g = this.inputStream;
          (async () => {
            for await (let y of t) {
              g.write(String(y).replace(/\n$/, "") + `
`);
            }
          })();
        }
      }
      flushInternalEvents() {
        return this.ccrClient.flushInternalEvents();
      }
      flushDeliveryAcks() {
        return this.ccrClient.flushDeliveryAcks();
      }
      async flushClientEvents() {
        let e = this.ccrClient.droppedDurableBatches;
        await this.ccrClient.flush();
        return this.ccrClient.droppedDurableBatches === e;
      }
      flushSessionState() {
        return this.ccrClient.flushWorkerState();
      }
      get internalEventsPending() {
        return this.ccrClient.internalEventsPending;
      }
      teeActivity(e) {
        if (this.activityFd !== undefined) {
          this.activityFd.write(e);
          return;
        }
        writeToStdout(e);
      }
      writeActivityLine(e) {
        this.teeActivity(e);
      }
      async write(e) {
        if (e.type === "transcript_mirror") {
          return;
        }
        if (this.trackWrite(e), this.teeStdout && !this.isBridge) {
          let t = n4f(e);
          if (t !== undefined) {
            try {
              this.teeActivity(FXe(t) + `
`);
            } catch {}
          }
        }
        if (await this.ccrClient.writeEvent(e), this.isBridge) {
          if (e.type === "control_request" || this.isDebug) {
            writeToStdout(FXe(e) + `
`);
          }
        }
      }
      close() {
        if (EBo(null), this.keepAliveTimer) {
          clearInterval(this.keepAliveTimer);
          this.keepAliveTimer = null;
        }
        this.transport.close();
        this.inputStream.end();
      }
    };
  });
  function N5c(e) {
    if (e.length === 0) {
      return true;
    }
    try {
      qt(e);
      return true;
    } catch {
      return false;
    }
  }
  function L5c() {
    if (Cns) {
      return;
    }
    Cns = true;
    let e = new TextDecoder("utf-8");
    UXe = process.stdout.write.bind(process.stdout);
    process.stdout.write = function (t, n, r) {
      let o = typeof t === "string" ? t : e.oC(t, {
        stream: true
      });
      Jie += o;
      let s;
      let i = true;
      while ((s = Jie.indexOf(`
`)) !== -1) {
        let l = Jie.slice(0, s);
        if (Jie = Jie.slice(s + 1), N5c(l)) {
          i = UXe(l + `
`);
        } else {
          process.stderr.write(`${"[stdout-guard]"} ${l}
`);
          logForDebugging(`streamJsonStdoutGuard diverted non-JSON stdout line: ${l.slice(0, 200)}`);
        }
      }
      let a = typeof n === "function" ? n : r;
      if (a) {
        queueMicrotask(() => a());
      }
      return i;
    };
    Ti(async () => {
      if (Jie += e.oC(), Jie.length > 0) {
        if (UXe && N5c(Jie)) {
          UXe(Jie + `
`);
        } else {
          process.stderr.write(`${"[stdout-guard]"} ${Jie}
`);
        }
        Jie = "";
      }
      if (UXe) {
        process.stdout.write = UXe;
        UXe = null;
      }
      Cns = false;
    });
  }
  var Cns = false;
  var Jie = "";
  var UXe = null;
  var F5c = __lazy(() => {
    hd();
    je();
  });
  function U5c(e, t) {
    let n = t?.external?.pending_action;
    let r = n?.request_id;
    if (!r) {
      return;
    }
    if ([...e.getPendingPermissionRequests(), ...e.getPendingUserDialogRequests()].some(s => s.request_id === r)) {
      logForDebugging(`[resumeStalePromptCancel] pending_action ${r} is owned by this worker \u2014 redelivery handles it, skipping cancel`);
      return;
    }
    logForDebugging(`[resumeStalePromptCancel] cancelling stale parked prompt ${r} from a prior worker`);
    e.write({
      type: "control_cancel_request",
      request_id: r
    });
    logEvent("tengu_resume_stale_prompt_cancel", {
      kind: n.tool_name?.startsWith("dialog:") ? "dialog" : "permission"
    });
  }
  var B5c = __lazy(() => {
    Ot();
    je();
  });
  class H5c {
    config;
    mutableMessages;
    abortController;
    permissionDenials;
    totalUsage;
    hasHandledOrphanedPermission = false;
    hasHandledDeferredToolResume = false;
    thinkingTokenEstimate = 0;
    readFileState;
    loadedNestedMemoryPaths = {};
    sessionEnvVars;
    isolationLatch;
    pendingNestedMemoryTriggers;
    memorySelector = xDe();
    constructor(e) {
      this.config = e;
      this.mutableMessages = e.initialMessages ?? [];
      this.abortController = e.abortController ?? createAbortController();
      this.permissionDenials = [];
      this.readFileState = e.readFileCache;
      this.sessionEnvVars = e.sessionEnvVars ?? new Map();
      this.isolationLatch = e.isolationLatch ?? aFe();
      this.pendingNestedMemoryTriggers = e.pendingNestedMemoryTriggers;
      this.totalUsage = Hb;
    }
    async *submitMessage(e, t) {
      let {
        cwd: n,
        commands: r,
        tools: o,
        refreshTools: s,
        refreshMcpClients: i,
        mcpClients: a,
        verbose: l = false,
        thinkingConfig: c,
        maxTurns: u,
        maxBudgetUsd: d,
        taskBudget: p,
        canUseTool: m,
        customSystemPrompt: f,
        appendSystemPrompt: h,
        planModeInstructions: g,
        appendSubagentSystemPrompt: y,
        toolAliases: _,
        excludeDynamicSections: b,
        userSpecifiedModel: S,
        fallbackModel: E,
        jsonSchema: C,
        getAppState: x,
        setAppState: A,
        replayUserMessages: k = false,
        includePartialMessages: I = false,
        forwardSubagentText: O = false,
        agents: M = [],
        allowedAgentTypes: L,
        setSDKStatus: P,
        orphanedPermission: F,
        deferredToolUse: H
      } = this.config;
      By(n);
      let U = !isSessionPersistenceDisabled();
      let N = performance.now();
      let W = 0;
      let j = 0;
      let z = 0;
      let V = (Ut, Wn, Fr) => {
        if (this.permissionDenials.some(Is => Is.tool_use_id === Wn)) {
          return;
        }
        this.permissionDenials.push({
          tool_name: trn(Ut.name),
          tool_use_id: Wn,
          tool_input: Fr
        });
      };
      let K = async (Ut, Wn, Fr, Is, _r, kn) => {
        let Qn = await m(Ut, Wn, Fr, Is, _r, kn);
        if (Qn.behavior !== "allow") {
          V(Ut, _r, Wn);
        }
        return Qn;
      };
      let J = x();
      let Q = S && (isExemptDefaultResolvingPick(S) || isModelAllowed(S)) ? parseUserSpecifiedModel(S) : getMainLoopModel();
      let Z = getRuntimeMainLoopModel({
        permissionMode: J.toolPermissionContext.mode,
        mainLoopModel: Q
      });
      let ne = c ? c : wce() !== false ? {
        type: "adaptive"
      } : {
        type: "disabled"
      };
      vx("before_getSystemPrompt");
      let oe = performance.now();
      let {
        defaultSystemPrompt: ee,
        userContext: re,
        systemContext: se
      } = await fetchSystemPromptParts({
        tools: o,
        mainLoopModel: Z,
        additionalWorkingDirectories: Array.from(J.toolPermissionContext.additionalWorkingDirectories.keys()),
        customSystemPrompt: f,
        excludeDynamicSections: b,
        cacheBreakerPhrase: J.cacheBreakerPhrase
      });
      au("qe_system_prompt_ms", performance.now() - oe, oe);
      vx("after_getSystemPrompt");
      let ae = {
        ...re,
        ...o4f(a, isScratchpadEnabled() ? getScratchpadDir() ?? undefined : undefined)
      };
      let de = f !== undefined && pDn() ? await U$t(Z) : null;
      let be = [...(typeof f === "string" ? [f] : Array.isArray(f) ? f : ee), ...(de ? [de] : []), ...(h ? [h] : [])];
      let fe = o.some(Ut => bl(Ut, "StructuredOutput"));
      let me = {
        messages: this.mutableMessages,
        messageQueue: Yh,
        turnStartIndex: 0,
        setMessages: Ut => {
          let Wn = Ut(this.mutableMessages);
          if (Wn !== this.mutableMessages) {
            this.mutableMessages.length = 0;
            this.mutableMessages.push(...Wn);
          }
        },
        applyMessageOp: Ut => {
          let Wn = Ugr(this.mutableMessages, Ut);
          if (Wn !== this.mutableMessages) {
            this.mutableMessages.length = 0;
            this.mutableMessages.push(...Wn);
          }
        },
        onChangeAPIKey: () => {},
        onPermissionDenial: V,
        requestDialog: this.config.requestDialog,
        sessionState: this.config.sessionState,
        agentContext: ym(),
        options: {
          commands: r,
          debug: false,
          tools: o,
          refreshTools: s,
          refreshMcpClients: i,
          verbose: l,
          mainLoopModel: Q,
          fallbackModel: E,
          thinkingConfig: ne,
          mcpClients: a,
          mcpResources: {},
          ideInstallationStatus: null,
          isNonInteractiveSession: true,
          customSystemPrompt: f,
          appendSystemPrompt: h,
          planModeInstructions: g,
          appendSubagentSystemPrompt: y,
          toolAliases: _,
          excludeDynamicSections: b,
          agentDefinitions: {
            activeAgents: M,
            allAgents: [],
            allowedAgentTypes: L
          },
          theme: B2(uc("theme", "dark").value),
          maxBudgetUsd: d,
          messageClientPlatform: t?.clientPlatform,
          forwardSubagentText: O,
          requiresStructuredOutput: C !== undefined && fe,
          autoCompactWindow: J.autoCompactWindow,
          fastMode: J.fastMode,
          cacheBreakerPhrase: J.cacheBreakerPhrase,
          activeGoal: J.activeGoal,
          ultraplanSessionUrl: J.ultraplanSessionUrl
        },
        getAppState: x,
        setAppState: A,
        getMcp: () => x().mcp,
        getWebBrowser: () => x().webBrowser,
        setToolPermissionContext: Ut => A(Wn => {
          let Fr = typeof Ut === "function" ? Ut(Wn.toolPermissionContext) : Ut;
          return Wn.toolPermissionContext === Fr ? Wn : {
            ...Wn,
            toolPermissionContext: Fr
          };
        }),
        taskRegistry: DO(x, A),
        sessionHooksRegistry: AKe(A),
        getReplContexts: () => x().replContexts,
        setReplContext: CJe(A),
        setWebBrowserSlice: makeSetWebBrowserSlice(A),
        setArtifactReadVersion: makeSetArtifactReadVersion(A),
        agentLifecycle: VYe(x, A),
        teammateColors: zYe(x, A),
        rootToolSurface: {
          tools: o,
          mainLoopModel: Q
        },
        abortController: this.abortController,
        readFileState: this.readFileState,
        nestedMemoryAttachmentTriggers: [],
        pendingNestedMemoryTriggers: this.pendingNestedMemoryTriggers,
        loadedNestedMemoryPaths: this.loadedNestedMemoryPaths,
        sessionEnvVars: this.sessionEnvVars,
        dynamicSkillDirTriggers: [],
        memorySelector: this.memorySelector,
        isolationLatch: this.isolationLatch,
        getFileHistoryState: () => x().fileHistory,
        applyFileHistoryOp: Ut => {
          A(Wn => {
            let Fr = reduceFileHistoryState(Wn.fileHistory, Ut);
            if (Fr === Wn.fileHistory) {
              return Wn;
            }
            return {
              ...Wn,
              fileHistory: Fr
            };
          });
        },
        applyAttributionOp: Ut => {
          A(Wn => {
            let Fr = Wjn(Wn.attribution, Ut);
            if (Fr === Wn.attribution) {
              return Wn;
            }
            return {
              ...Wn,
              attribution: Fr
            };
          });
        },
        onCompactEvent: Ut => {
          if (Ut.type === "sdk_status") {
            P?.(Ut.status, Ut.metadata);
          }
        },
        onQueryEvent: Ut => {
          if (Ut.type === "apply_flag_settings") {
            QUe(Ut.settings, A);
          } else if (Ut.type === "conversation_reset") {
            vw({
              type: "conversation_reset",
              new_conversation_id: Ut.newConversationId
            });
          }
        }
      };
      if (F && !this.hasHandledOrphanedPermission) {
        this.hasHandledOrphanedPermission = true;
        for await (let Ut of Fyl(F, o, this.mutableMessages, me)) {
          yield Ut;
        }
      }
      if (H && !this.hasHandledDeferredToolResume) {
        if (this.hasHandledDeferredToolResume = true, !Cl(o, H.toolName, _)) {
          logForDebugging(`Deferred tool resume: tool '${H.toolName}' is no longer available (MCP server disconnected or tool removed)`, {
            level: "warn"
          });
          yield {
            type: "result",
            subtype: "success",
            is_error: true,
            duration_ms: Math.max(0, Math.round(performance.now() - N)),
            duration_api_ms: getTotalAPIDuration(),
            num_turns: this.mutableMessages.length,
            result: "",
            stop_reason: "tool_deferred_unavailable",
            session_id: getSessionId(),
            total_cost_usd: getTotalCostUSD(),
            usage: this.totalUsage,
            modelUsage: getModelUsage(),
            permission_denials: this.permissionDenials,
            deferred_tool_use: {
              id: H.toolUseID,
              name: H.toolName,
              input: H.toolInput
            },
            fast_mode_state: u2(Q, J.fastMode),
            origin: t?.origin,
            uuid: OT.randomUUID()
          };
          return;
        }
        let Ut;
        for await (let Wn of Lyl(H, K, this.mutableMessages, me)) {
          let Fr = "attachment" in Wn ? Wn.attachment : undefined;
          if (Fr?.type === "hook_deferred_tool") {
            Ut = Fr;
          }
          yield Wn;
        }
        if (Ut) {
          if (U) {
            await recordTranscript(this.mutableMessages);
          }
          yield {
            type: "result",
            subtype: "success",
            is_error: false,
            duration_ms: Math.max(0, Math.round(performance.now() - N)),
            duration_api_ms: getTotalAPIDuration(),
            num_turns: this.mutableMessages.length,
            result: "",
            stop_reason: "tool_deferred",
            session_id: getSessionId(),
            total_cost_usd: getTotalCostUSD(),
            usage: this.totalUsage,
            modelUsage: getModelUsage(),
            permission_denials: this.permissionDenials,
            deferred_tool_use: {
              id: Ut.toolUseID,
              name: Ut.toolName,
              input: Ut.toolInput
            },
            fast_mode_state: u2(Q, J.fastMode),
            origin: t?.origin,
            uuid: OT.randomUUID()
          };
          return;
        }
      }
      let Te = profileCheckpoint("before_processUserInput", {
        once: true
      });
      let {
        messages: ue,
        shouldQuery: ce,
        allowedTools: le,
        model: pe,
        effort: ve,
        resultText: _e
      } = await BRt({
        input: e,
        mode: "prompt",
        setToolJSX: () => {},
        context: {
          ...me,
          messages: this.mutableMessages
        },
        messages: this.mutableMessages,
        uuid: t?.uuid,
        isMeta: t?.isMeta,
        shouldQuery: t?.shouldQuery,
        querySource: "sdk",
        origin: t?.origin,
        skipSlashCommands: t?.skipSlashCommands,
        bridgeOrigin: t?.bridgeOrigin,
        modelScheduledOrigin: t?.modelScheduledOrigin
      });
      if (Te) {
        profileCheckpoint("after_processUserInput");
      }
      let xe = ce && t?.shouldQuery !== false;
      if (t?.origin) {
        wmr(ue, t.origin);
      }
      if (t?.verifiedSlackHumanTurn) {
        Ngr(ue, t.uuid);
      }
      this.mutableMessages.push(...ue);
      let ke = [...this.mutableMessages];
      let Ie = 0;
      let Ue;
      let Ge = ke.length;
      let Be = (Ut = false) => {
        let Wn = Ie;
        let Fr = transcriptCursorEnd(ke, Math.max(Wn, Ge), !Ut);
        if (Wn >= Fr) {
          return Promise.resolve(null);
        }
        let Is = Wn === 0 && Fr === ke.length ? ke : ke.slice(Wn, Fr);
        Ie = Fr;
        let _r = Ue;
        for (let kn = Is.length - 1; kn >= 0; kn--) {
          let Qn = Is[kn];
          if (isLoggableMessage(Qn) && isChainParticipant(Qn)) {
            Ue = Qn.uuid;
            break;
          }
        }
        return recordTranscript(Is, undefined, _r, ke);
      };
      let We = Ut => {
        let Wn = ke.findLastIndex(Is => Is.uuid === Ut);
        if (Wn !== -1) {
          let Is = ke[Wn];
          if (ke.splice(Wn, 1), Ie > Wn) {
            if (Ie--, U) {
              logEvent("tengu_tombstone_persisted_removal", {
                message_type: Is.type
              });
              removeTranscriptMessage(Ut);
            }
          }
          if (Ge > Wn) {
            Ge--;
          }
        }
        let Fr = this.mutableMessages.findLastIndex(Is => Is.uuid === Ut);
        if (Fr !== -1) {
          this.mutableMessages.splice(Fr, 1);
        }
      };
      if (U && ue.length > 0) {
        let Ut = Be();
        if (kd()) {
          ;
        } else if (await Ut, Me.CLAUDE_CODE_EAGER_FLUSH || Me.CLAUDE_CODE_IS_COWORK) {
          await flushSessionStorage();
        }
      }
      let Ze = ue.filter(Ut => Ut.type === "user" && !Ut.isMeta && !Ut.toolUseResult && $5c().replayableUserMessagesFilter(Ut) || Ut.type === "system" && Ut.subtype === "compact_boundary");
      let Tt = k ? Ze : [];
      A(Ut => ({
        ...Ut,
        toolPermissionContext: {
          ...Ut.toolPermissionContext,
          alwaysAllowRules: {
            ...Ut.toolPermissionContext.alwaysAllowRules,
            command: le
          }
        }
      }));
      let kt = pe != null && (isExemptDefaultResolvingPick(pe) || isModelAllowed(pe));
      if (pe && !kt) {
        logForDebugging(`Skill/command model "${pe}" is not in the availableModels allowlist; keeping the session model`, {
          level: "warn"
        });
      }
      let Ye = kt ? pe : Q;
      let ht = me.options.activeSkill;
      let It = ve !== undefined ? [...(me.permissionLayers ?? []), {
        kind: "effort",
        effort: ve
      }] : me.permissionLayers;
      let Rt = x();
      me = {
        messages: ke,
        messageQueue: Yh,
        turnStartIndex: 0,
        permissionLayers: It,
        setMessages: () => {},
        applyMessageOp: () => {},
        onChangeAPIKey: () => {},
        onPermissionDenial: V,
        requestDialog: this.config.requestDialog,
        sessionState: this.config.sessionState,
        agentContext: ym(),
        options: {
          commands: r,
          debug: false,
          tools: o,
          refreshTools: s,
          refreshMcpClients: i,
          verbose: l,
          mainLoopModel: Ye,
          fallbackModel: E,
          thinkingConfig: ne,
          mcpClients: a,
          mcpResources: {},
          ideInstallationStatus: null,
          isNonInteractiveSession: true,
          customSystemPrompt: f,
          appendSystemPrompt: h,
          planModeInstructions: g,
          appendSubagentSystemPrompt: y,
          toolAliases: _,
          excludeDynamicSections: b,
          theme: B2(uc("theme", "dark").value),
          agentDefinitions: {
            activeAgents: M,
            allAgents: [],
            allowedAgentTypes: L
          },
          maxBudgetUsd: d,
          messageClientPlatform: t?.clientPlatform,
          forwardSubagentText: O,
          activeSkill: ht,
          requiresStructuredOutput: C !== undefined && fe,
          autoCompactWindow: Rt.autoCompactWindow,
          fastMode: Rt.fastMode,
          cacheBreakerPhrase: Rt.cacheBreakerPhrase,
          activeGoal: Rt.activeGoal,
          ultraplanSessionUrl: Rt.ultraplanSessionUrl
        },
        getAppState: x,
        setAppState: A,
        getMcp: () => x().mcp,
        getWebBrowser: () => x().webBrowser,
        setToolPermissionContext: Ut => A(Wn => {
          let Fr = typeof Ut === "function" ? Ut(Wn.toolPermissionContext) : Ut;
          return Wn.toolPermissionContext === Fr ? Wn : {
            ...Wn,
            toolPermissionContext: Fr
          };
        }),
        taskRegistry: DO(x, A),
        sessionHooksRegistry: AKe(A),
        getReplContexts: () => x().replContexts,
        setReplContext: CJe(A),
        setWebBrowserSlice: makeSetWebBrowserSlice(A),
        setArtifactReadVersion: makeSetArtifactReadVersion(A),
        agentLifecycle: VYe(x, A),
        teammateColors: zYe(x, A),
        rootToolSurface: {
          tools: o,
          mainLoopModel: Ye
        },
        abortController: this.abortController,
        readFileState: this.readFileState,
        nestedMemoryAttachmentTriggers: [],
        pendingNestedMemoryTriggers: this.pendingNestedMemoryTriggers,
        loadedNestedMemoryPaths: this.loadedNestedMemoryPaths,
        sessionEnvVars: this.sessionEnvVars,
        dynamicSkillDirTriggers: [],
        memorySelector: this.memorySelector,
        isolationLatch: this.isolationLatch,
        getFileHistoryState: me.getFileHistoryState,
        applyFileHistoryOp: me.applyFileHistoryOp,
        applyAttributionOp: me.applyAttributionOp,
        onCompactEvent: Ut => {
          if (Ut.type === "sdk_status") {
            P?.(Ut.status, Ut.metadata);
          }
        },
        onQueryEvent: Ut => {
          if (Ut.type === "apply_flag_settings") {
            QUe(Ut.settings, A);
          } else if (Ut.type === "conversation_reset") {
            vw({
              type: "conversation_reset",
              new_conversation_id: Ut.newConversationId
            });
          }
        }
      };
      vx("before_skills_plugins");
      let wt = performance.now();
      let [vt, {
        enabled: yt,
        errors: gt,
        warnings: Ft
      }] = await Promise.all([getSlashCommandToolSkills(Nt()), loadAllPluginsCacheOnly()]);
      au("qe_plugin_skills_load_ms", performance.now() - wt, wt);
      vx("after_skills_plugins");
      let on = performance.now();
      let rn = MRt();
      let Sn = NRt({
        ...rn,
        tools: o,
        mcpClients: a,
        model: Ye,
        permissionMode: J.toolPermissionContext.mode,
        commands: r,
        agents: M,
        skills: vt,
        plugins: yt,
        pluginErrors: [...gt, ...t9c()].filter(Wea).map(Ut => ({
          plugin: Ut.source,
          type: Ut.type,
          message: hS(Ut)
        })),
        pluginWarnings: Ft.filter(Ut => Ut.source.endsWith("@inline") || Ut.source.startsWith("inline[") || Ut.source.endsWith(`@${"skills-dir"}`)).map(Ut => ({
          plugin: Ut.source,
          type: Ut.type,
          message: S1(Ut)
        })),
        fastModeState: u2(Ye, J.fastMode)
      });
      if (Dfr(Sn, on), yield Sn, vx("system_message_yielded"), wn("info", "cli_ask_should_query_resolved", {
        should_query: xe,
        from_user_input: ce,
        from_options: t?.shouldQuery
      }), !xe) {
        for (let Ut of ue) {
          if (Ut.type === "user" && typeof Ut.message.content === "string" && (Ut.message.content.includes(`<${"local-command-stdout"}>`) || Ut.message.content.includes(`<${"local-command-stderr"}>`) || Ut.isCompactSummary)) {
            yield {
              type: "user",
              message: {
                ...Ut.message,
                content: Li(Ut.message.content)
              },
              session_id: getSessionId(),
              parent_tool_use_id: null,
              uuid: Ut.uuid,
              timestamp: Ut.timestamp,
              isReplay: !Ut.isCompactSummary,
              isSynthetic: Ut.isMeta || Ut.isVisibleInTranscriptOnly
            };
          }
          if (Ut.type === "system" && Ut.subtype === "local_command" && typeof Ut.content === "string" && (Ut.content.includes(`<${"local-command-stdout"}>`) || Ut.content.includes(`<${"local-command-stderr"}>`))) {
            yield Een(Ut.content, Ut.uuid);
          }
          if (Ut.type === "system" && Ut.subtype === "compact_boundary") {
            yield {
              type: "system",
              subtype: "compact_boundary",
              session_id: getSessionId(),
              uuid: Ut.uuid,
              compact_metadata: tCt(Ut.compactMetadata)
            };
          }
          if (Ut.type === "system" && Ut.subtype === "informational") {
            yield {
              type: "system",
              subtype: "informational",
              content: Li(Ut.content),
              level: Ut.level,
              ...(Ut.toolUseID && {
                tool_use_id: Ut.toolUseID
              }),
              ...(Ut.preventContinuation && {
                prevent_continuation: Ut.preventContinuation
              }),
              uuid: Ut.uuid,
              session_id: getSessionId()
            };
          }
        }
        if (U) {
          if (await Be(), Me.CLAUDE_CODE_EAGER_FLUSH || Me.CLAUDE_CODE_IS_COWORK) {
            await flushSessionStorage();
          }
        }
        for (let Ut of t?.shouldQuery === false ? Tt : []) {
          if (Ut.type === "user") {
            let Fr = t?.uuid && Ut.uuid === t.uuid ? t?.fileAttachments : undefined;
            yield {
              type: "user",
              message: Ut.message,
              session_id: getSessionId(),
              parent_tool_use_id: null,
              uuid: Ut.uuid,
              timestamp: Ut.timestamp,
              isReplay: true,
              ...(Fr && Fr.length > 0 && {
                file_attachments: Fr
              }),
              ...(Ut.origin && {
                origin: Ut.origin
              })
            };
          }
        }
        yield {
          type: "result",
          subtype: "success",
          is_error: false,
          duration_ms: Math.max(0, Math.round(performance.now() - N)),
          duration_api_ms: getTotalAPIDuration(),
          num_turns: 0,
          result: _e ?? "",
          stop_reason: null,
          session_id: getSessionId(),
          total_cost_usd: getTotalCostUSD(),
          usage: this.totalUsage,
          modelUsage: getModelUsage(),
          permission_denials: this.permissionDenials,
          fast_mode_state: u2(Ye, J.fastMode),
          origin: t?.origin,
          uuid: OT.randomUUID()
        };
        return;
      }
      if (fileHistoryEnabled() && U) {
        ue.filter($5c().replayableUserMessagesFilter).forEach(Ut => {
          fileHistoryMakeSnapshot(me.getFileHistoryState, me.applyFileHistoryOp, Ut.uuid);
        });
      }
      let jn = Hb;
      let Xr = 1;
      let co = false;
      let Yt = [];
      let Ee = 0;
      let Re = new Set();
      let Ce;
      let Fe = null;
      let Xe = null;
      let He = null;
      let Gt = false;
      let mt = null;
      let Dt = () => {
        if (mt === null) {
          return [];
        }
        let {
          retracted: Ut
        } = mt;
        if (mt = null, logEvent("tengu_partial_stream_retraction_closed", {
          stop_reason: Ut.stop_reason == null ? undefined : Ut.stop_reason,
          had_open_block: false
        }), !I) {
          return [];
        }
        return [{
          type: "stream_event",
          event: {
            type: "message_delta",
            context_management: null,
            delta: {
              container: null,
              stop_details: null,
              stop_reason: Ut.stop_reason,
              stop_sequence: Ut.stop_sequence
            },
            usage: {
              cache_creation_input_tokens: Ut.usage.cache_creation_input_tokens ?? null,
              cache_read_input_tokens: Ut.usage.cache_read_input_tokens ?? null,
              input_tokens: Ut.usage.input_tokens ?? null,
              iterations: Ut.usage.iterations ?? null,
              output_tokens: Ut.usage.output_tokens,
              server_tool_use: Ut.usage.server_tool_use ?? null
            }
          },
          session_id: getSessionId(),
          parent_tool_use_id: null,
          uuid: OT.randomUUID()
        }, {
          type: "stream_event",
          event: {
            type: "message_stop"
          },
          session_id: getSessionId(),
          parent_tool_use_id: null,
          uuid: OT.randomUUID()
        }];
      };
      let jt = null;
      let bn = OHe().at(-1);
      let Ct = C ? zKo(this.mutableMessages, "StructuredOutput") : 0;
      let hn = {};
      let vn;
      let zn = new Map();
      let Pn = OT.randomUUID();
      try {
        for await (let Ut of s4f(_U({
          messages: ke,
          systemPrompt: be,
          userContext: ae,
          systemContext: se,
          canUseTool: K,
          toolUseContext: me,
          fallbackModel: E,
          querySource: "sdk",
          maxTurns: u,
          taskBudget: p,
          stopHookActive: t?.stopHookActive
        }), hn)) {
          if (Ut.type === "assistant" || Ut.type === "user" || Ut.type === "system" && Ut.subtype === "compact_boundary") {
            if (Ut.type === "assistant" && !W) {
              W = performance.now();
            }
            if (U && Ut.type === "system" && Ut.subtype === "compact_boundary") {
              let Wn = Ut.compactMetadata?.preservedMessages?.uuids.at(-1) ?? Ut.compactMetadata?.preservedSegment?.tailUuid;
              if (Wn) {
                let Fr = this.mutableMessages.findLastIndex(Is => Is.uuid === Wn);
                if (Fr !== -1) {
                  await recordTranscript(this.mutableMessages.slice(0, Fr + 1));
                  Ie = 0;
                  Ue = undefined;
                }
              }
            }
            if (ke.push(Ut), U) {
              if (Ut.type === "assistant") {
                Be();
              } else {
                await Be();
              }
            }
            if (!co && Tt.length > 0) {
              co = true;
              for (let Wn of Tt) {
                if (Wn.type === "user") {
                  let Is = t?.uuid && Wn.uuid === t.uuid ? t?.fileAttachments : undefined;
                  yield {
                    type: "user",
                    message: Wn.message,
                    session_id: getSessionId(),
                    parent_tool_use_id: null,
                    uuid: Wn.uuid,
                    timestamp: Wn.timestamp,
                    isReplay: true,
                    ...(Is && Is.length > 0 && {
                      file_attachments: Is
                    }),
                    ...(Wn.origin && {
                      origin: Wn.origin
                    })
                  };
                }
              }
            }
          }
          if (Ut.type === "user") {
            Xr++;
          }
          switch (Ut.type) {
            case "sdk_status":
              yield {
                type: "system",
                subtype: "status",
                status: Ut.status,
                ...(Ut.metadata?.compactResult !== undefined && {
                  compact_result: Ut.metadata.compactResult
                }),
                ...(Ut.metadata?.compactError !== undefined && {
                  compact_error: Ut.metadata.compactError
                }),
                session_id: getSessionId(),
                uuid: OT.randomUUID()
              };
              continue;
            case "compact_progress":
            case "stream_mode":
            case "response_length":
              continue;
            case "tombstone":
              {
                if (I && Xe !== null && Ut.message.type === "assistant" && Ut.message.message.id === Xe) {
                  if (Ut.displayOnly === true) {
                    logEvent("tengu_partial_stream_retraction_display_only", {
                      had_open_block: He !== null
                    });
                  } else {
                    let Wn = Ut.message.message;
                    if (He === null) {
                      mt = {
                        messageId: Xe,
                        retracted: Wn
                      };
                      Xe = null;
                    } else {
                      yield {
                        type: "stream_event",
                        event: {
                          type: "content_block_stop",
                          index: He
                        },
                        session_id: getSessionId(),
                        parent_tool_use_id: null,
                        uuid: OT.randomUUID()
                      };
                      yield {
                        type: "stream_event",
                        event: {
                          type: "message_delta",
                          context_management: null,
                          delta: {
                            container: null,
                            stop_details: null,
                            stop_reason: Wn.stop_reason,
                            stop_sequence: Wn.stop_sequence
                          },
                          usage: {
                            cache_creation_input_tokens: Wn.usage.cache_creation_input_tokens ?? null,
                            cache_read_input_tokens: Wn.usage.cache_read_input_tokens ?? null,
                            input_tokens: Wn.usage.input_tokens ?? null,
                            iterations: Wn.usage.iterations ?? null,
                            output_tokens: Wn.usage.output_tokens,
                            server_tool_use: Wn.usage.server_tool_use ?? null
                          }
                        },
                        session_id: getSessionId(),
                        parent_tool_use_id: null,
                        uuid: OT.randomUUID()
                      };
                      yield {
                        type: "stream_event",
                        event: {
                          type: "message_stop"
                        },
                        session_id: getSessionId(),
                        parent_tool_use_id: null,
                        uuid: OT.randomUUID()
                      };
                      logEvent("tengu_partial_stream_retraction_closed", {
                        stop_reason: Wn.stop_reason == null ? undefined : Wn.stop_reason,
                        had_open_block: true
                      });
                      Xe = null;
                      He = null;
                    }
                  }
                }
                if (Ut.message.type === "assistant") {
                  let Wn = Ut.message.message.content;
                  let Fr = Array.isArray(Wn) ? Wn.flatMap(Is => Is.type === "tool_use" && Is.name === "StructuredOutput" ? [Is.id] : []) : [];
                  if (Fr.length > 0) {
                    Ee++;
                    for (let kn of Fr) {
                      Re.add(kn);
                    }
                    let Is = kn => kn.toolUseID === undefined || Fr.includes(kn.toolUseID);
                    let _r = Yt.filter(Is);
                    Yt = Yt.filter(kn => !Is(kn));
                    for (let kn of _r) {
                      We(kn.attachmentUuid);
                    }
                    logEvent("tengu_structured_output_retracted", {
                      retracted_results: _r.length,
                      surviving_results: Yt.length,
                      tombstoned_calls: Ee
                    });
                  }
                }
                We(Ut.message.uuid);
                break;
              }
            case "assistant":
              {
                if (Ut.message.stop_reason != null) {
                  Fe = Ut.message.stop_reason;
                }
                this.mutableMessages.push(Ut);
                let Wn = await Mjc(Ut, Pn, x, this.abortController.signal);
                if (Wn !== Ut) {
                  zn.set(Ut, Wn);
                }
                yield* pSt(Wn, s?.() ?? o);
                break;
              }
            case "progress":
              if (this.mutableMessages.push(Ut), U) {
                ke.push(Ut);
                Be();
              }
              yield* pSt(Ut, s?.() ?? o);
              break;
            case "user":
              if (this.mutableMessages.push(Ut), jt?.anchorUuid === Ut.uuid) {
                this.mutableMessages.push(...jt.preserved);
                jt = null;
              }
              yield* pSt(Ut, s?.() ?? o);
              break;
            case "stream_event":
              if (mt !== null) {
                if (Ut.event.type === "ping") {
                  ;
                } else if (Ut.event.type === "message_start") {
                  yield* Dt();
                } else {
                  Xe = mt.messageId;
                  mt = null;
                }
              }
              if (I && Ut.event.type === "message_start" && Xe !== null) {
                let Wn = He !== null;
                if (He !== null) {
                  yield {
                    type: "stream_event",
                    event: {
                      type: "content_block_stop",
                      index: He
                    },
                    session_id: getSessionId(),
                    parent_tool_use_id: null,
                    uuid: OT.randomUUID()
                  };
                }
                yield {
                  type: "stream_event",
                  event: {
                    type: "message_delta",
                    context_management: null,
                    delta: {
                      container: null,
                      stop_details: null,
                      stop_reason: null,
                      stop_sequence: null
                    },
                    usage: {
                      cache_creation_input_tokens: jn.cache_creation_input_tokens,
                      cache_read_input_tokens: jn.cache_read_input_tokens,
                      input_tokens: jn.input_tokens,
                      iterations: jn.iterations ?? null,
                      output_tokens: jn.output_tokens,
                      server_tool_use: jn.server_tool_use ?? null
                    }
                  },
                  session_id: getSessionId(),
                  parent_tool_use_id: null,
                  uuid: OT.randomUUID()
                };
                yield {
                  type: "stream_event",
                  event: {
                    type: "message_stop"
                  },
                  session_id: getSessionId(),
                  parent_tool_use_id: null,
                  uuid: OT.randomUUID()
                };
                logEvent("tengu_partial_stream_retraction_closed", {
                  stop_reason: undefined,
                  had_open_block: Wn,
                  source: "stale_message_start"
                });
                Xe = null;
                He = null;
              }
              if (Ut.event.type === "message_start") {
                Xe = Ut.event.message.id;
                He = null;
                Gt = false;
              } else if (Ut.event.type === "content_block_start") {
                He = Ut.event.index;
              } else if (Ut.event.type === "content_block_stop") {
                He = null;
                Gt = true;
              } else if (Ut.event.type === "message_stop") {
                Xe = null;
                He = null;
              }
              if (Ut.event.type === "message_start") {
                if (!j) {
                  j = performance.now();
                }
                if (!z && Ut.requestSentAtMs) {
                  z = Ut.requestSentAtMs;
                }
                jn = Hb;
                jn = Kse(jn, Ut.event.message.usage);
              }
              if (Ut.event.type === "message_delta") {
                if (jn = pWt(Ut.event.usage)?.servedFallbackModel ? oKo(jn, Ut.event.usage) : Kse(jn, Ut.event.usage), Ut.event.delta.stop_reason != null) {
                  Fe = Ut.event.delta.stop_reason;
                }
                if (U) {
                  Be();
                }
              }
              if (Ut.event.type === "message_stop") {
                this.totalUsage = Irr(this.totalUsage, jn);
              }
              if (Ut.event.type === "content_block_start") {
                this.thinkingTokenEstimate = 0;
              } else if (Ut.event.type === "content_block_delta") {
                let {
                  delta: Wn
                } = Ut.event;
                if (Wn.type === "thinking_delta") {
                  let Fr;
                  if ("estimated_tokens" in Wn && typeof Wn.estimated_tokens === "number") {
                    Fr = Wn.estimated_tokens;
                  } else if (typeof Wn.thinking === "string" && Wn.thinking.length > 0) {
                    Fr = vnn(Wn.thinking);
                  }
                  if (Fr !== undefined) {
                    this.thinkingTokenEstimate += Fr;
                    yield {
                      type: "system",
                      subtype: "thinking_tokens",
                      estimated_tokens: this.thinkingTokenEstimate,
                      estimated_tokens_delta: Fr,
                      uuid: OT.randomUUID(),
                      session_id: getSessionId()
                    };
                  }
                } else if (Wn.type === "signature_delta" && this.thinkingTokenEstimate > 0) {
                  let Fr = Math.ceil(L9e(Wn.signature.length) / 4);
                  if (Fr > this.thinkingTokenEstimate) {
                    let Is = Fr - this.thinkingTokenEstimate;
                    this.thinkingTokenEstimate = Fr;
                    yield {
                      type: "system",
                      subtype: "thinking_tokens",
                      estimated_tokens: this.thinkingTokenEstimate,
                      estimated_tokens_delta: Is,
                      uuid: OT.randomUUID(),
                      session_id: getSessionId()
                    };
                  }
                }
              }
              if (I) {
                yield {
                  type: "stream_event",
                  event: Ut.event,
                  session_id: getSessionId(),
                  parent_tool_use_id: null,
                  uuid: OT.randomUUID(),
                  ...(Ut.ttftMs !== undefined && {
                    ttft_ms: Ut.ttftMs
                  })
                };
              }
              break;
            case "attachment":
              if (this.mutableMessages.push(Ut), U) {
                ke.push(Ut);
                Be();
              }
              if (Ut.attachment.type === "relevant_memories") {
                let Wn = Ofr(Ut.attachment.memories);
                if (Wn) {
                  yield Wn;
                }
              } else if (Ut.attachment.type === "structured_output") {
                if (Ut.attachment.toolUseID !== undefined ? Re.vZc(Ut.attachment.toolUseID) : Re.size > 0) {
                  We(Ut.uuid);
                  logEvent("tengu_structured_output_late_retraction_drop", {});
                } else {
                  Yt = [...Yt, {
                    toolUseID: Ut.attachment.toolUseID,
                    attachmentUuid: Ut.uuid,
                    data: Ut.attachment.data
                  }];
                }
              } else if (Ut.attachment.type === "hook_deferred_tool") {
                Ce = {
                  id: Ut.attachment.toolUseID,
                  name: Ut.attachment.toolName,
                  input: Ut.attachment.toolInput
                };
              } else if (Ut.attachment.type === "max_turns_reached") {
                vn = {
                  turnCount: Ut.attachment.turnCount,
                  maxTurns: Ut.attachment.maxTurns
                };
                continue;
              } else if (k && Ut.attachment.type === "queued_command") {
                let Wn = Ut.attachment;
                yield {
                  type: "user",
                  message: {
                    role: "user",
                    content: Wn.prompt
                  },
                  session_id: getSessionId(),
                  parent_tool_use_id: null,
                  uuid: Wn.source_uuid || Ut.uuid,
                  timestamp: Ut.timestamp,
                  isReplay: true,
                  ...(Wn.fileAttachments?.length && {
                    file_attachments: Wn.fileAttachments
                  }),
                  ...(Wn.origin && {
                    origin: Wn.origin
                  })
                };
              }
              break;
            case "stream_request_start":
              if (I) {
                yield {
                  type: "system",
                  subtype: "status",
                  status: "requesting",
                  uuid: OT.randomUUID(),
                  session_id: getSessionId()
                };
              }
              break;
            case "notification":
              {
                let Wn = Ut.notification;
                yield {
                  type: "system",
                  subtype: "notification",
                  key: Wn.key,
                  text: Wn.text,
                  priority: Wn.priority,
                  ...(Wn.color !== undefined && {
                    color: Wn.color
                  }),
                  ...(Wn.timeoutMs !== undefined && {
                    timeout_ms: Wn.timeoutMs
                  }),
                  uuid: OT.randomUUID(),
                  session_id: getSessionId()
                };
                break;
              }
            case "set_expanded_view":
              break;
            case "post_turn_summary":
              this.config.setAppState(Wn => Wn.postTurnSummary === Ut.value ? Wn : {
                ...Wn,
                postTurnSummary: Ut.value
              });
              break;
            case "active_goal":
              this.config.setAppState(Wn => Wn.activeGoal === Ut.value ? Wn : {
                ...Wn,
                activeGoal: Ut.value
              });
              break;
            case "set_in_progress_tool_use_ids":
              break;
            case "hint_clears":
              break;
            case "refusal_continuation":
              break;
            case "interruptible_tool_in_progress":
              break;
            case "api_metrics":
              break;
            case "os_notification":
              break;
            case "open_message_selector":
              break;
            case "command_lifecycle":
              this.config.onCommandLifecycle?.(Ut.uuid, Ut.state);
              break;
            case "system":
              {
                if (this.mutableMessages.push(Ut), U && Ut.subtype === "model_refusal_fallback") {
                  ke.push(Ut);
                  logEvent("tengu_refusal_fallback_entry_recorded", {
                    request_id: br(Ut.requestId)
                  });
                }
                if (Ut.subtype === "compact_boundary" && Ut.compactMetadata) {
                  let Wn = Ut.compactMetadata.preservedMessages;
                  let Fr = (Wn?.allUuids ?? Wn?.uuids ?? []).map(kn => this.mutableMessages.find(Qn => Qn.uuid === kn)).filter(kn => kn !== undefined).map(e5e);
                  jt = Wn && Fr.length > 0 ? {
                    preserved: Fr,
                    anchorUuid: Wn.anchorUuid
                  } : null;
                  let Is = this.mutableMessages.length - 1;
                  if (Is > 0) {
                    this.mutableMessages.splice(0, Is);
                  }
                  if (jt?.anchorUuid === Ut.uuid) {
                    this.mutableMessages.push(...jt.preserved);
                    jt = null;
                  }
                  let _r = ke.length - 1;
                  if (_r > 0) {
                    ke.splice(0, _r);
                    Ie = ke.length;
                    Ge = ke.length;
                  }
                  yield {
                    type: "system",
                    subtype: "compact_boundary",
                    session_id: getSessionId(),
                    uuid: Ut.uuid,
                    compact_metadata: tCt(Ut.compactMetadata)
                  };
                }
                if (Ut.subtype === "api_error") {
                  yield {
                    type: "system",
                    subtype: "api_retry",
                    attempt: Ut.retryAttempt,
                    max_retries: Ut.maxRetries,
                    retry_delay_ms: Ut.retryInMs,
                    error_status: Ut.error.status ?? null,
                    error: H$n(Ut.error),
                    session_id: getSessionId(),
                    uuid: Ut.uuid
                  };
                }
                if (I && Xe !== null && !Gt && Ut.subtype === "model_refusal_fallback" && Ut.direction === "retry") {
                  let Wn = He !== null;
                  if (He !== null) {
                    yield {
                      type: "stream_event",
                      event: {
                        type: "content_block_stop",
                        index: He
                      },
                      session_id: getSessionId(),
                      parent_tool_use_id: null,
                      uuid: OT.randomUUID()
                    };
                  }
                  yield {
                    type: "stream_event",
                    event: {
                      type: "message_delta",
                      context_management: null,
                      delta: {
                        container: null,
                        stop_details: null,
                        stop_reason: "refusal",
                        stop_sequence: null
                      },
                      usage: {
                        cache_creation_input_tokens: jn.cache_creation_input_tokens,
                        cache_read_input_tokens: jn.cache_read_input_tokens,
                        input_tokens: jn.input_tokens,
                        iterations: jn.iterations ?? null,
                        output_tokens: jn.output_tokens,
                        server_tool_use: jn.server_tool_use ?? null
                      }
                    },
                    session_id: getSessionId(),
                    parent_tool_use_id: null,
                    uuid: OT.randomUUID()
                  };
                  yield {
                    type: "stream_event",
                    event: {
                      type: "message_stop"
                    },
                    session_id: getSessionId(),
                    parent_tool_use_id: null,
                    uuid: OT.randomUUID()
                  };
                  logEvent("tengu_partial_stream_retraction_closed", {
                    stop_reason: "refusal",
                    had_open_block: Wn,
                    source: "refusal_banner"
                  });
                  Xe = null;
                  He = null;
                }
                if (NX() && Ut.subtype === "model_refusal_fallback") {
                  yield {
                    type: "system",
                    subtype: "model_refusal_fallback",
                    trigger: Ut.trigger,
                    direction: Ut.direction,
                    original_model: Ut.originalModel,
                    fallback_model: Ut.fallbackModel,
                    request_id: Ut.requestId,
                    api_refusal_category: Ut.apiRefusalCategory ?? null,
                    api_refusal_explanation: Ut.apiRefusalExplanation ?? null,
                    ...(Ut.retractedMessageUuids !== undefined && {
                      retracted_message_uuids: Ut.retractedMessageUuids
                    }),
                    refused_user_message_uuid: Ut.refusedUserMessageUuid ?? null,
                    content: Ut.content,
                    session_id: getSessionId(),
                    uuid: Ut.uuid
                  };
                }
                if (Ut.subtype === "model_refusal_no_fallback") {
                  yield {
                    type: "system",
                    subtype: "model_refusal_no_fallback",
                    original_model: Ut.originalModel,
                    request_id: Ut.requestId,
                    api_refusal_category: Ut.apiRefusalCategory ?? null,
                    api_refusal_explanation: Ut.apiRefusalExplanation ?? null,
                    refused_user_message_uuid: Ut.refusedUserMessageUuid ?? null,
                    content: Ut.content,
                    session_id: getSessionId(),
                    uuid: Ut.uuid
                  };
                }
                if (Ut.subtype === "model_fallback") {
                  yield {
                    type: "system",
                    subtype: "model_fallback",
                    trigger: Ut.trigger,
                    original_model: Ut.originalModel,
                    fallback_model: Ut.fallbackModel,
                    content: Ut.content,
                    session_id: getSessionId(),
                    uuid: Ut.uuid
                  };
                }
                if (Ut.subtype === "model_consent_fallback") {
                  yield {
                    type: "system",
                    subtype: "model_consent_fallback",
                    choice: Ut.choice,
                    original_model: Ut.originalModel,
                    fallback_model: Ut.fallbackModel,
                    persisted_as_default: Ut.persistedAsDefault,
                    content: Ut.content,
                    session_id: getSessionId(),
                    uuid: Ut.uuid
                  };
                }
                break;
              }
            case "tool_use_summary":
              yield {
                type: "tool_use_summary",
                summary: Ut.summary,
                preceding_tool_use_ids: Ut.precedingToolUseIds,
                session_id: getSessionId(),
                uuid: Ut.uuid
              };
              break;
          }
          if (d !== undefined && getTotalCostUSD() >= d) {
            if (yield* Dt(), U) {
              if (await Be(true), Me.CLAUDE_CODE_EAGER_FLUSH || Me.CLAUDE_CODE_IS_COWORK) {
                await flushSessionStorage();
              }
            }
            yield {
              type: "result",
              subtype: "error_max_budget_usd",
              duration_ms: Math.max(0, Math.round(performance.now() - N)),
              duration_api_ms: getTotalAPIDuration(),
              is_error: true,
              num_turns: Xr,
              stop_reason: Fe,
              session_id: getSessionId(),
              total_cost_usd: getTotalCostUSD(),
              usage: this.totalUsage,
              modelUsage: getModelUsage(),
              permission_denials: this.permissionDenials,
              fast_mode_state: u2(Ye, J.fastMode),
              origin: t?.origin,
              uuid: OT.randomUUID(),
              errors: [`Reached maximum budget ($${d})`]
            };
            return;
          }
          if (Ut.type === "user" && C) {
            let Fr = zKo(this.mutableMessages, "StructuredOutput") + Ee - Ct;
            let Is = parseInt(process.env.MAX_STRUCTURED_OUTPUT_RETRIES || "5", 10);
            if (Fr >= Is && Yt.length === 0) {
              if (U) {
                if (await Be(true), Me.CLAUDE_CODE_EAGER_FLUSH || Me.CLAUDE_CODE_IS_COWORK) {
                  await flushSessionStorage();
                }
              }
              yield* Dt();
              yield {
                type: "result",
                subtype: "error_max_structured_output_retries",
                duration_ms: Math.max(0, Math.round(performance.now() - N)),
                duration_api_ms: getTotalAPIDuration(),
                is_error: true,
                num_turns: Xr,
                stop_reason: Fe,
                session_id: getSessionId(),
                total_cost_usd: getTotalCostUSD(),
                usage: this.totalUsage,
                modelUsage: getModelUsage(),
                permission_denials: this.permissionDenials,
                fast_mode_state: u2(Ye, J.fastMode),
                origin: t?.origin,
                uuid: OT.randomUUID(),
                errors: [Ee > 0 ? `Failed to provide surviving structured output after ${Is} attempts (${Ee} retracted by a model fallback)` : `Failed to provide valid structured output after ${Is} attempts`]
              };
              return;
            }
          }
        }
      } finally {
        if (jt !== null) {
          logEvent("tengu_compact_preserved_unanchored", {
            preservedCount: jt.preserved.length
          });
          this.mutableMessages.push(...jt.preserved);
          jt = null;
        }
      }
      yield* Dt();
      let Lr = ke.findLast(Ut => Ut.type === "assistant" || Ut.type === "user");
      let ao = Lr?.type ?? "undefined";
      let Nn = Lr?.type === "assistant" ? _Gd(Lr.message.content)?.type ?? "none" : "n/a";
      if (U) {
        if (await Be(true), Me.CLAUDE_CODE_EAGER_FLUSH || Me.CLAUDE_CODE_IS_COWORK) {
          await flushSessionStorage();
        }
      }
      if (Ce) {
        yield {
          type: "result",
          subtype: "success",
          is_error: false,
          duration_ms: Math.max(0, Math.round(performance.now() - N)),
          duration_api_ms: getTotalAPIDuration(),
          num_turns: Xr,
          result: "",
          stop_reason: "tool_deferred",
          session_id: getSessionId(),
          total_cost_usd: getTotalCostUSD(),
          usage: this.totalUsage,
          modelUsage: getModelUsage(),
          permission_denials: this.permissionDenials,
          deferred_tool_use: Ce,
          terminal_reason: hn.value?.reason,
          fast_mode_state: u2(Ye, J.fastMode),
          origin: t?.origin,
          uuid: OT.randomUUID()
        };
        return;
      }
      if (vn) {
        yield {
          type: "result",
          subtype: "error_max_turns",
          duration_ms: Math.max(0, Math.round(performance.now() - N)),
          duration_api_ms: getTotalAPIDuration(),
          is_error: true,
          num_turns: vn.turnCount,
          stop_reason: Fe,
          session_id: getSessionId(),
          total_cost_usd: getTotalCostUSD(),
          usage: this.totalUsage,
          modelUsage: getModelUsage(),
          permission_denials: this.permissionDenials,
          terminal_reason: hn.value?.reason,
          fast_mode_state: u2(Ye, J.fastMode),
          origin: t?.origin,
          uuid: OT.randomUUID(),
          errors: [`Reached maximum number of turns (${vn.maxTurns})`]
        };
        return;
      }
      if (!VXn(Lr, Fe)) {
        yield {
          type: "result",
          subtype: "error_during_execution",
          duration_ms: Math.max(0, Math.round(performance.now() - N)),
          duration_api_ms: getTotalAPIDuration(),
          is_error: true,
          num_turns: Xr,
          stop_reason: Fe,
          session_id: getSessionId(),
          total_cost_usd: getTotalCostUSD(),
          usage: this.totalUsage,
          modelUsage: getModelUsage(),
          permission_denials: this.permissionDenials,
          terminal_reason: hn.value?.reason,
          fast_mode_state: u2(Ye, J.fastMode),
          origin: t?.origin,
          uuid: OT.randomUUID(),
          errors: (() => {
            let Ut = OHe();
            let Wn = bn ? Ut.lastIndexOf(bn) + 1 : 0;
            return [`[ede_diagnostic] result_type=${ao} last_content_type=${Nn} stop_reason=${Fe}`, ...Ut.slice(Wn).map(Fr => Fr.error)];
          })()
        };
        return;
      }
      if (C && Yt.length === 0 && Ee > 0 && !(Lr.type === "assistant" && Lr.isApiErrorMessage)) {
        logEvent("tengu_structured_output_retraction_exhausted", {
          tombstoned_calls: Ee,
          num_turns: Xr
        });
        yield {
          type: "result",
          subtype: "error_max_structured_output_retries",
          duration_ms: Math.max(0, Math.round(performance.now() - N)),
          duration_api_ms: getTotalAPIDuration(),
          is_error: true,
          num_turns: Xr,
          stop_reason: Fe,
          session_id: getSessionId(),
          total_cost_usd: getTotalCostUSD(),
          usage: this.totalUsage,
          modelUsage: getModelUsage(),
          permission_denials: this.permissionDenials,
          terminal_reason: hn.value?.reason,
          fast_mode_state: u2(Ye, J.fastMode),
          origin: t?.origin,
          uuid: OT.randomUUID(),
          errors: ["Structured output was retracted by a model fallback and no retry produced a valid result"]
        };
        return;
      }
      let Tr = "";
      let To = false;
      let wr = null;
      if (Lr.type === "assistant") {
        let Ut = zn.get(Lr) ?? Lr;
        let Wn = _Gd(Lr.message.content);
        let Fr = _Gd(Ut.message.content);
        if (Wn?.type === "text" && !bDe.vZc(Wn.text) && Fr?.type === "text") {
          Tr = Fr.text;
        }
        To = Boolean(Lr.isApiErrorMessage);
        wr = Lr.apiErrorStatus ?? null;
      }
      if (Tr === "") {
        let Ut = Yt.at(-1)?.data;
        if (Ut !== undefined) {
          Tr = JSON.stringify(Ut);
        }
      }
      if (!To && W) {
        logEvent("tengu_sdk_ttft", {
          ttft_ms: Math.max(0, Math.round(W - N)),
          model: String(Ye)
        });
      }
      yield {
        type: "result",
        subtype: "success",
        is_error: To,
        api_error_status: wr,
        duration_ms: Math.max(0, Math.round(performance.now() - N)),
        duration_api_ms: getTotalAPIDuration(),
        ttft_ms: !To && W ? Math.max(0, Math.round(W - N)) : undefined,
        ttft_stream_ms: !To && j ? Math.max(0, Math.round(j - N)) : undefined,
        time_to_request_ms: !To && z ? Math.max(0, Math.round(z - N)) : undefined,
        ...(() => {
          let Ut = !To ? hhl() : undefined;
          return Ut ? {
            time_to_request_from_spawn_ms: Ut.ms,
            warm_spare_claimed: Ut.warmSpareClaimed,
            time_origin_ms: Ut.timeOriginMs
          } : {};
        })(),
        num_turns: Xr,
        result: Tr,
        stop_reason: Fe,
        session_id: getSessionId(),
        total_cost_usd: getTotalCostUSD(),
        usage: this.totalUsage,
        modelUsage: getModelUsage(),
        permission_denials: this.permissionDenials,
        structured_output: Yt.at(-1)?.data,
        terminal_reason: hn.value?.reason,
        fast_mode_state: u2(Ye, J.fastMode),
        origin: t?.origin,
        uuid: OT.randomUUID()
      };
    }
    interrupt() {
      this.abortController.abort(userAbortReason("remote-cancel"));
    }
    getMessages() {
      return this.mutableMessages;
    }
    getReadFileState() {
      return this.readFileState;
    }
    getSessionId() {
      return getSessionId();
    }
    setModel(e) {
      this.config.userSpecifiedModel = e;
    }
    getMemoryAttribution() {
      return {
        messages: {
          entries: this.mutableMessages.length
        },
        file_state_cache: {
          entries: this.readFileState.size,
          bytes: this.readFileState.calculatedSize
        }
      };
    }
    dispose() {
      this.mutableMessages.length = 0;
      this.permissionDenials.length = 0;
      this.readFileState.clear();
      this.loadedNestedMemoryPaths = {};
      this.sessionEnvVars.clear();
    }
  }
  async function* j5c({
    commands: e,
    prompt: t,
    promptUuid: n,
    isMeta: r,
    shouldQuery: o,
    stopHookActive: s,
    fileAttachments: i,
    origin: a,
    clientPlatform: l,
    verifiedSlackHumanTurn: c,
    skipSlashCommands: u,
    bridgeOrigin: d,
    modelScheduledOrigin: p,
    cwd: m,
    tools: f,
    refreshTools: h,
    refreshMcpClients: g,
    mcpClients: y,
    verbose: _ = false,
    thinkingConfig: b,
    maxTurns: S,
    maxBudgetUsd: E,
    taskBudget: C,
    canUseTool: x,
    mutableMessages: A = [],
    getReadFileCache: k,
    setReadFileCache: I,
    sessionEnvVars: O,
    isolationLatch: M,
    pendingNestedMemoryTriggers: L,
    customSystemPrompt: P,
    appendSystemPrompt: F,
    planModeInstructions: H,
    appendSubagentSystemPrompt: U,
    toolAliases: N,
    excludeDynamicSections: W,
    userSpecifiedModel: j,
    fallbackModel: z,
    jsonSchema: V,
    getAppState: K,
    setAppState: J,
    abortController: Q,
    replayUserMessages: Z = false,
    includePartialMessages: ne = false,
    forwardSubagentText: oe = false,
    requestDialog: ee,
    onCommandLifecycle: re,
    sessionState: se,
    agents: ae = [],
    allowedAgentTypes: de,
    setSDKStatus: be,
    orphanedPermission: fe,
    deferredToolUse: me
  }) {
    let Te = new H5c({
      cwd: m,
      tools: f,
      refreshTools: h,
      refreshMcpClients: g,
      commands: e,
      mcpClients: y,
      agents: ae,
      allowedAgentTypes: de,
      canUseTool: x,
      getAppState: K,
      setAppState: J,
      initialMessages: A,
      readFileCache: hTe(k()),
      sessionEnvVars: O,
      isolationLatch: M,
      pendingNestedMemoryTriggers: L,
      customSystemPrompt: P,
      appendSystemPrompt: F,
      planModeInstructions: H,
      appendSubagentSystemPrompt: U,
      toolAliases: N,
      excludeDynamicSections: W,
      userSpecifiedModel: j,
      fallbackModel: z,
      thinkingConfig: b,
      maxTurns: S,
      maxBudgetUsd: E,
      taskBudget: C,
      jsonSchema: V,
      verbose: _,
      requestDialog: ee,
      onCommandLifecycle: re,
      sessionState: se,
      replayUserMessages: Z,
      includePartialMessages: ne,
      forwardSubagentText: oe,
      setSDKStatus: be,
      abortController: Q,
      orphanedPermission: fe,
      deferredToolUse: me,
      ...{}
    });
    try {
      yield* Te.submitMessage(t, {
        uuid: n,
        isMeta: r,
        shouldQuery: o,
        stopHookActive: s,
        fileAttachments: i,
        origin: a,
        clientPlatform: l,
        verifiedSlackHumanTurn: c,
        skipSlashCommands: u,
        bridgeOrigin: d,
        modelScheduledOrigin: p
      });
    } finally {
      I(Te.getReadFileState());
    }
  }
  async function* s4f(e, t) {
    t.value = yield* e;
  }
  var OT;
  var $5c = () => (rhr(), __toCommonJS(Kwc));
  var o4f;
  var q5c = __lazy(() => {
    at();
    aE();
    yXt();
    YQo();
    Bm();
    np();
    C$();
    nwe();
    B$t();
    Eb();
    BTe();
    Ot();
    aE();
    vO();
    rjn();
    sns();
    s7e();
    ci();
    O1();
    cV();
    Kp();
    _h();
    Kwt();
    HG();
    vo();
    je();
    Zm();
    pr();
    gn();
    GT();
    Jq();
    qI();
    dWt();
    tts();
    pZ();
    Rn();
    Rf();
    ro();
    Eo();
    YN();
    Kf();
    xg();
    Ufr();
    Ydr();
    LX();
    U1();
    fa();
    zg();
    H4();
    R3();
    Ywt();
    NJ();
    U$();
    XN();
    B_();
    t5e();
    VUe();
    cJo();
    nrn();
    wm();
    mSt();
    OT = require("crypto");
    o4f = (N1(), __toCommonJS(DG)).getCoordinatorUserContext;
  });
  var W5c = __lazy(() => {
    Ot();
    oXn();
    vo();
    dt();
    Rn();
    e1();
    oZr();
  });
  class z5c {
    async snapshot(e, t) {
      return t;
    }
    async restore(e) {
      return {};
    }
    async flush() {}
  }
  function Rns() {
    return i4f.getStore() ?? a4f;
  }
  function xns() {
    return V5c.join(getProjectTempDir(), getSessionId());
  }
  var G5c;
  var V5c;
  var i4f;
  var a4f;
  var K5c = __lazy(() => {
    at();
    wm();
    G5c = require("async_hooks");
    V5c = require("path");
    i4f = new G5c.AsyncLocalStorage();
    a4f = new z5c();
  });
  function Y5c(e) {
    let t = process.env.CLAUDE_CODE_EXIT_AFTER_STOP_DELAY;
    let n = t ? parseInt(t, 10) : null;
    let r = n && !isNaN(n) && n > 0;
    let o = null;
    let s = 0;
    return {
      start() {
        if (o) {
          clearTimeout(o);
          o = null;
        }
        if (r) {
          s = Date.now();
          o = setTimeout(() => {
            let i = Date.now() - s;
            if (e() && i >= n) {
              logForDebugging(`Exiting after ${n}ms of idle time`);
              gracefulShutdownSync();
            }
          }, n);
        }
      },
      stop() {
        if (o) {
          clearTimeout(o);
          o = null;
        }
      }
    };
  }
  var J5c = __lazy(() => {
    je();
    lm();
  });
  function X5c(e, t, n, r) {
    let o = new kXe();
    let s;
    return async i => {
      let a = t();
      if (s !== a) {
        o.clear();
        s = a;
      }
      switch (Nnt(a.mode, a.isBypassPermissionsModeAvailable)) {
        case "allow":
          return true;
        case "deny":
          return false;
        case "classify":
          {
            let c = n();
            return o.getOrClassify(i.host, i.port, Axt(c), () => RSt(i.host, i.port, c, r(), a, new AbortController().signal, {
              isSubagentLoop: isModelDrivenSession(undefined),
              recordPresumed: true
            }));
          }
        case "ask":
          return e(i);
      }
    };
  }
  var Q5c = __lazy(() => {
    HT();
    jz();
    Ayr();
    qp();
  });
  function Z5c() {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_vscode_feedback_survey", false)) {
      return;
    }
    if (Me.CLAUDE_CODE_DISABLE_FEEDBACK_SURVEY) {
      return;
    }
    if (qne()) {
      return;
    }
    if (!isPolicyAllowed("allow_product_feedback")) {
      return;
    }
    let t = getFeatureValue_CACHED_MAY_BE_STALE("tengu_feedback_survey_config", Byr);
    return {
      ...t,
      probability: getInitialSettings().feedbackSurveyRate ?? t.probability,
      lastSurveyShownTime: getGlobalConfig().feedbackSurveyState?.lastShownTime ?? null
    };
  }
  function e6c(e) {
    if (kns(e)) {
      c4f(e);
    }
  }
  function kns(e) {
    if (!isPolicyAllowed("allow_product_feedback")) {
      return false;
    }
    if (qne() || Me.CLAUDE_CODE_DISABLE_FEEDBACK_SURVEY) {
      return false;
    }
    logEvent("tengu_feedback_survey_event", {
      event_type: X5(e.event_type),
      appearance_id: X5(e.appearance_id),
      response: X5(e.response),
      survey_type: X5(e.survey_type),
      last_assistant_message_id: X5(e.last_assistant_message_id),
      surface: X5(e.surface)
    });
    su("feedback_survey", {
      event_type: X5(e.event_type),
      appearance_id: X5(e.appearance_id),
      response: X5(e.response),
      survey_type: X5(e.survey_type),
      enabled_via_override: Ebe()
    });
    return true;
  }
  function c4f(e) {
    if (e.event_type !== "appeared") {
      return;
    }
    let t = getGlobalConfig().feedbackSurveyState?.lastShownTime;
    if (t !== undefined && Date.now() - t < 60000) {
      return;
    }
    saveGlobalConfig(n => ({
      ...n,
      feedbackSurveyState: {
        lastShownTime: Date.now()
      }
    }));
  }
  function X5(e) {
    return e == null ? undefined : String(e);
  }
  var Ans = __lazy(() => {
    kes();
    pr();
    yS();
    KW();
    $n();
    Ot();
    Kc();
  });
  function t6c(e) {
    let t = e.find(n => n.name === "ccd_session");
    if (!t || t.type !== "connected") {
      return;
    }
    t.client.setNotificationHandler(Ufo(), async n => {
      let {
        eventName: r,
        eventData: o
      } = n.params;
      if (!u4f.vZc(r)) {
        return;
      }
      if (!isPolicyAllowed("allow_product_feedback")) {
        return;
      }
      let s = o;
      switch (r) {
        case "tengu_message_rated":
          logEvent(r, {
            message_uuid: X5(s.message_uuid),
            sentiment: X5(s.sentiment),
            surface: X5(s.surface),
            cleared: s.cleared === true
          });
          break;
        case "tengu_feedback_survey_event":
          kns(s);
          break;
      }
    });
  }
  var u4f;
  var n6c = __lazy(() => {
    Ot();
    Kc();
    Ans();
    _5e();
    u4f = new Set(["tengu_message_rated", "tengu_feedback_survey_event"]);
  });
  function r6c({
    requestedAgent: e,
    agents: t,
    systemPrompt: n,
    preAgentSystemPrompt: r
  }) {
    if (e != null && typeof e !== "string") {
      return {
        ok: false,
        error: "agent must be a string or null"
      };
    }
    let o = typeof e === "string" && e !== "" ? e : undefined;
    let s = o ? t.find(p => p.agentType === o) : undefined;
    if (o && !s) {
      return {
        ok: false,
        error: `Agent "${o}" not found`
      };
    }
    let i = getMainThreadAgentType();
    let a = i ? t.find(p => p.agentType === i) : undefined;
    if (a?.model && a.model !== "inherit" && getMainLoopModelOverride() === parseUserSpecifiedModel(a.model)) {
      setMainLoopModelOverride(undefined);
    }
    let l = getRefusalFallbackModelLatch();
    if (l && a?.model && a.model !== "inherit" && l.previousOverride === parseUserSpecifiedModel(a.model)) {
      rewriteRefusalFallbackPreviousOverride(s?.model && s.model !== "inherit" ? parseUserSpecifiedModel(s.model) : undefined);
    }
    if (ZCe(o, undefined, {
      activeAgents: t,
      allAgents: t
    }), s) {
      saveAgentSetting(s.agentType);
    }
    let c = a !== undefined && !isBuiltInAgent(a) && n === a.getSystemPrompt();
    let u = r !== undefined || c;
    let d = s && !isBuiltInAgent(s) ? s.getSystemPrompt() : undefined;
    if (d && (!n || u)) {
      return {
        ok: true,
        agentDefinition: s,
        systemPrompt: d,
        preAgentSystemPrompt: r ?? {
          value: c ? undefined : n
        }
      };
    }
    if (u) {
      return {
        ok: true,
        agentDefinition: s,
        systemPrompt: r ? r.value : undefined,
        preAgentSystemPrompt: undefined
      };
    }
    return {
      ok: true,
      agentDefinition: s,
      systemPrompt: n,
      preAgentSystemPrompt: r
    };
  }
  var o6c = __lazy(() => {
    at();
    kS();
    Eo();
    TXe();
    fa();
  });
  async function d4f() {
    try {
      let e = await Ins.readFile(g$o(), "utf-8");
      let t = $nt().safeParse(qt(e));
      if (!t.success) {
        logForDebugging(`Invalid known_marketplaces.json in zip cache: ${t.error.message}`, {
          level: "error"
        });
        return {};
      }
      return t.data;
    } catch {
      return {};
    }
  }
  async function p4f(e) {
    await _or(g$o(), De(e, null, 2));
  }
  async function m4f(e, t) {
    let n = DXt();
    if (!n) {
      return;
    }
    let r = await f4f(t);
    if (r !== null) {
      let o = bBl(e);
      await _or(pbr.join(n, o), r);
    }
  }
  async function f4f(e) {
    let t = [pbr.join(e, ".claude-plugin", "marketplace.json"), pbr.join(e, "marketplace.json"), e];
    for (let n of t) {
      try {
        return await Ins.readFile(n, "utf-8");
      } catch {}
    }
    return null;
  }
  async function s6c() {
    let e = await qM();
    for (let [r, o] of Object.entries(e)) {
      if (!o.installLocation) {
        continue;
      }
      try {
        await m4f(r, o.installLocation);
      } catch (s) {
        logForDebugging(`Failed to save marketplace JSON for ${r}: ${s}`);
      }
    }
    let n = {
      ...(await d4f()),
      ...e
    };
    await p4f(n);
  }
  var Ins;
  var pbr;
  var i6c = __lazy(() => {
    je();
    yT();
    TC();
    PFe();
    Ins = require("fs/promises");
    pbr = require("path");
  });
  async function Pns(e) {
    let t = iK();
    logForDebugging(`installPluginsForHeadless: starting${t ? " (zip cache mode)" : ""}`);
    let n = await xor();
    if (n) {
      NFe();
      clearPluginCache("headlessPluginInstall: seed marketplaces registered");
    }
    if (t) {
      await zt().mkdir(gBl());
      await zt().mkdir(yBl());
    }
    let r = Object.keys(L3()).length;
    let o = {
      marketplaces_installed: 0,
      delisted_count: 0
    };
    let s = n;
    try {
      if (r === 0) {
        logForDebugging("installPluginsForHeadless: no marketplaces declared");
      } else {
        let a = await bnt("headless_marketplace_reconcile", () => __r({
          skip: t ? (c, u) => !SBl(u) : undefined,
          onProgress: c => {
            if (c.type === "installed") {
              e?.({
                status: "installed",
                name: c.name
              });
              logForDebugging(`installPluginsForHeadless: installed marketplace ${c.name}`);
            } else if (c.type === "failed") {
              e?.({
                status: "failed",
                name: c.name,
                error: c.error
              });
              logForDebugging(`installPluginsForHeadless: failed to install marketplace ${c.name}: ${c.error}`);
            }
          }
        }), c => ({
          installed_count: c.installed.length,
          updated_count: c.updated.length,
          failed_count: c.failed.length,
          skipped_count: c.skipped.length
        }));
        if (a.skipped.length > 0) {
          logForDebugging(`installPluginsForHeadless: skipped ${a.skipped.length} marketplace(s) unsupported by zip cache: ${a.skipped.join(", ")}`);
        }
        let l = a.installed.length + a.updated.length;
        if (l > 0) {
          NFe();
          clearPluginCache("headlessPluginInstall: marketplaces reconciled");
          s = true;
        }
        o.marketplaces_installed = l;
      }
      if (t) {
        await s6c();
      }
      let i = await yfr();
      if (o.delisted_count = i.length, i.length > 0) {
        s = true;
      }
      if (s) {
        clearPluginCache("headlessPluginInstall: plugins changed");
      }
      return s;
    } catch (i) {
      logForDebugging(`installPluginsForHeadless: failed: ${he(i)}`, {
        level: "error"
      });
      return false;
    } finally {
      logEvent("tengu_headless_plugin_install", o);
    }
  }
  var a6c = __lazy(() => {
    Ot();
    je();
    Zm();
    dt();
    yT();
    CYo();
    xg();
    Xes();
    PFe();
    i6c();
  });
  function h4f(e) {
    if (!RQ(e)) {
      return false;
    }
    if ("isBackgrounded" in e && e.isBackgrounded === false) {
      return false;
    }
    if (!Mw(e.status)) {
      return false;
    }
    return !e.notified;
  }
  function Ons({
    tasks: e,
    waits: t,
    now: n
  }) {
    let r = false;
    let o = new Set();
    for (let s of e) {
      if (!h4f(s)) {
        continue;
      }
      o.add(s.id);
      let i = t.get(s.id);
      if (!i) {
        i = {
          firstSeen: n,
          expired: false
        };
        t.set(s.id, i);
      }
      if (i.expired) {
        continue;
      }
      if (n - i.firstSeen >= NDo) {
        i.expired = true;
        logForDebugging(`[print] task ${s.id} is terminal but its completion notification did not enqueue within ${NDo}ms \u2014 exiting without it (enqueue dropped, or post-completion work still in flight)`, {
          level: "warn"
        });
        continue;
      }
      r = true;
    }
    for (let s of t.keys()) {
      if (!o.vZc(s)) {
        t.delete(s);
      }
    }
    return r;
  }
  var l6c = __lazy(() => {
    Cx();
    $ve();
    je();
  });
  function c6c({
    inputClosed: e,
    runningTasks: t
  }) {
    return e && t.some(n => RQ(n) && kv(n));
  }
  function u6c({
    inputClosed: e,
    currentState: t,
    hasRunningBgTasks: n
  }) {
    if (n && Me.CLAUDE_CODE_BG_TASKS_REPORT_RUNNING) {
      return false;
    }
    return !e && t === "running";
  }
  var d6c = __lazy(() => {
    pr();
  });
  function p6c() {
    return Me.CLAUDE_CODE_PRINT_BG_WAIT_CEILING_MS ?? 600000;
  }
  function m6c({
    runningBackgroundTasks: e,
    inputClosed: t,
    hasMainThreadQueued: n,
    hasActiveTeammates: r,
    hasPendingNotification: o,
    ceilingExceeded: s,
    deadline: i,
    swept: a,
    now: l
  }) {
    if (!(t && !n && !r && e.length > 0 && (s || !o && !e.some(RQ)))) {
      return {
        deadline: null,
        swept: false,
        shouldSweep: false
      };
    }
    if (i === null) {
      return {
        deadline: s ? l : l + 5000,
        swept: s,
        shouldSweep: s
      };
    }
    if (l < i) {
      return {
        deadline: i,
        swept: a,
        shouldSweep: false
      };
    }
    return {
      deadline: i,
      swept: true,
      shouldSweep: !a
    };
  }
  function f6c(e, t) {
    for (let n of e) {
      if (Cw(n)) {
        logForDebugging(`print wind-down: killing background shell ${n.id} ("${n.description}") after ${5000}ms grace`);
        $Te(n.id, t);
      } else {
        logForDebugging(`print wind-down: no longer waiting on background ${n.type} task ${n.id} after ${5000}ms grace`);
        zu(n.id, "stopped", {
          toolUseId: n.toolUseId,
          summary: n.description
        });
      }
    }
    if (e.length > 0) {
      Pe("print_wind_down");
    }
  }
  var h6c = __lazy(() => {
    ln();
    OWt();
    je();
    d_();
  });
  function Mns({
    message: e,
    held: t,
    holdBackActive: n,
    emit: r
  }) {
    if (n) {
      t.push(e);
      return;
    }
    Nns(t, r);
    r(e);
  }
  function Nns(e, t) {
    for (let n of e) {
      t(n);
    }
    e.length = 0;
  }
  var skt = {};