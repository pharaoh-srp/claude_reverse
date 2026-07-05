  __export(Dmc, {
    setPlanSlug: () => setPlanSlug,
    persistFileSnapshotIfRemote: () => persistFileSnapshotIfRemote,
    peekPlanSlug: () => peekPlanSlug,
    getPlansDirectory: () => getPlansDirectory,
    getPlanSlug: () => getPlanSlug,
    getPlanFilePath: () => getPlanFilePath,
    getPlan: () => getPlan,
    copyPlanForResume: () => copyPlanForResume,
    copyPlanForFork: () => copyPlanForFork,
    clearPlanSlug: () => clearPlanSlug,
    clearAllPlanSlugs: () => clearAllPlanSlugs
  });
  function getPlanSlug(e, t) {
    let n = e ?? getSessionId();
    let r = getPlanSlugCache();
    let o = r.get(n);
    if (!o) {
      let s = getPlansDirectory();
      let i = t ? FLt(t) : "";
      for (let a = 0; a < 10; a++) {
        o = i ? `${i}-${cst()}` : nRn();
        let l = kK.join(s, `${o}.md`);
        if (!zt().existsSync(l)) {
          break;
        }
      }
      r.set(n, o);
    }
    return o;
  }
  function peekPlanSlug(e) {
    return getPlanSlugCache().get(e ?? getSessionId());
  }
  function setPlanSlug(e, t) {
    getPlanSlugCache().set(e, t);
  }
  function clearPlanSlug(e) {
    let t = e ?? getSessionId();
    getPlanSlugCache().delete(t);
  }
  function clearAllPlanSlugs() {
    getPlanSlugCache().clear();
  }
  function getPlanFilePath(e) {
    let t = getPlanSlug(getSessionId());
    if (!e) {
      return kK.join(getPlansDirectory(), `${t}.md`);
    }
    return kK.join(getPlansDirectory(), `${t}-agent-${e}.md`);
  }
  function getPlan(e) {
    let t = getPlanFilePath(e);
    try {
      return zt().readFileSync(t, {
        encoding: "utf-8"
      });
    } catch (n) {
      if (fn(n)) {
        return null;
      }
      if (Io(n)) {
        logForDebugging(`getPlan: read failed for ${t}: ${n}`);
        return null;
      }
      Oe(n);
      return null;
    }
  }
  function Omc(e) {
    return e.messages.find(t => t.slug)?.slug;
  }
  async function copyPlanForResume(e, t) {
    let n = Omc(e);
    if (!n) {
      return false;
    }
    let r = t ?? getSessionId();
    setPlanSlug(r, n);
    let o = kK.join(getPlansDirectory(), `${n}.md`);
    try {
      await Ys().read(o);
      return true;
    } catch (s) {
      if (!fn(s)) {
        if (Io(s)) {
          logForDebugging(`copyPlanForResume: read failed for ${o}: ${s}`);
          return false;
        }
        Oe(s);
        return false;
      }
      if (rMn() === null) {
        return false;
      }
      logForDebugging(`Plan file missing during resume: ${o}. Attempting recovery.`);
      let i = Tpf(e.messages, "plan");
      let a = null;
      if (i && i.content.length > 0) {
        a = i.content;
        logForDebugging(`Plan recovered from file snapshot, ${a.length} chars`, {
          level: "info"
        });
      } else if (a = Spf(e), a) {
        logForDebugging(`Plan recovered from message history, ${a.length} chars`, {
          level: "info"
        });
      }
      if (a) {
        try {
          await Ys().write(o, a);
          return true;
        } catch (l) {
          if (Io(l)) {
            logForDebugging(`Plan recovery write failed for ${o}: ${l}`);
            return false;
          }
          Oe(l);
          return false;
        }
      }
      logForDebugging("Plan file recovery failed: no file snapshot or plan content found in message history");
      return false;
    }
  }
  async function copyPlanForFork(e, t) {
    let n = Omc(e);
    if (!n) {
      return false;
    }
    let r = getPlansDirectory();
    let o = kK.join(r, `${n}.md`);
    let s = getPlanSlug(t);
    let i = kK.join(r, `${s}.md`);
    try {
      await Ys().copy(o, i);
      return true;
    } catch (a) {
      if (fn(a)) {
        return false;
      }
      if (Io(a)) {
        logForDebugging(`copyPlanForFork: copy failed for ${o}: ${a}`);
        return false;
      }
      Oe(a);
      return false;
    }
  }
  function Spf(e) {
    for (let t = e.messages.length - 1; t >= 0; t--) {
      let n = e.messages[t];
      if (!n) {
        continue;
      }
      if (n.type === "assistant") {
        let {
          content: r
        } = n.message;
        if (Array.isArray(r)) {
          for (let o of r) {
            if (o.type === "tool_use" && o.name === "ExitPlanMode") {
              let i = o.input?.plan;
              if (typeof i === "string" && i.length > 0) {
                return i;
              }
            }
          }
        }
      }
      if (n.type === "user") {
        let r = n;
        if (typeof r.planContent === "string" && r.planContent.length > 0) {
          return r.planContent;
        }
      }
      if (n.type === "attachment") {
        let r = n;
        if (r.attachment?.type === "plan_file_reference") {
          let o = r.attachment.planContent;
          if (typeof o === "string" && o.length > 0) {
            return o;
          }
        }
      }
    }
    return null;
  }
  function Tpf(e, t) {
    for (let n = e.length - 1; n >= 0; n--) {
      let r = e[n];
      if (r?.type === "system" && "subtype" in r && r.subtype === "file_snapshot" && "snapshotFiles" in r) {
        return r.snapshotFiles.find(s => s.key === t);
      }
    }
    return;
  }
  async function persistFileSnapshotIfRemote() {
    if (rMn() === null) {
      return;
    }
    try {
      let e = [];
      let t = getPlan();
      if (t) {
        e.push({
          key: "plan",
          path: getPlanFilePath(),
          content: t
        });
      }
      if (e.length === 0) {
        return;
      }
      let n = {
        type: "system",
        subtype: "file_snapshot",
        content: "File snapshot",
        level: "info",
        isMeta: true,
        timestamp: new Date().toISOString(),
        uuid: Pmc.randomUUID(),
        snapshotFiles: e
      };
      let {
        recordTranscript: r
      } = await Promise.resolve().then(() => (fa(), y5e));
      await r([n]);
    } catch (e) {
      Oe(e);
    }
  }
  var Pmc;
  var kK;
  var getPlansDirectory;
  var xx = __lazy(() => {
    at();
    _b();
    vo();
    je();
    gn();
    dt();
    oZr();
    Rn();
    kqe();
    Pmc = require("crypto");
    kK = require("path");
    getPlansDirectory = TEr(function () {
      let n = getInitialSettings().plansDirectory;
      let r;
      if (n) {
        let o = Nt();
        let s = kK.resolve(o, n);
        if (!s.startsWith(o + kK.sep) && s !== o) {
          logForDebugging(`plansDirectory must be within project root: ${n}`, {
            level: "error"
          });
          r = kK.join(er(), "plans");
        } else {
          r = s;
        }
      } else {
        r = kK.join(er(), "plans");
      }
      try {
        zt().mkdirSync(r);
      } catch (o) {
        logForDebugging(`Failed to create plans directory ${r}: ${o}`, {
          level: "error"
        });
      }
      return r;
    });
  });
  var bpa = {};