  __export(nrs, {
    reportPrefetchOutcome: () => reportPrefetchOutcome,
    prefetchRemoteHistory: () => prefetchRemoteHistory,
    historyPageToSeed: () => historyPageToSeed,
    consumePrefetchedHistory: () => consumePrefetchedHistory
  });
  function Z4f() {
    if (Psn === null) {
      Psn = ers.join(C8c.tmpdir(), `cc-history-prefetch-${process.pid}`);
      Ti(() => Psn === null ? undefined : qhe.rm(Psn, {
        recursive: true,
        force: true
      }).catch(() => {}));
    }
    return Psn;
  }
  function prefetchRemoteHistory(e) {
    if (getAPIProvider() !== "firstParty") {
      return;
    }
    if (!Con.test(e)) {
      logForDebugging(`[historyPrefetch] ${e} fails CCR_SESSION_ID_RE \u2014 refusing`, {
        level: "warn"
      });
      return;
    }
    let t = Osn.get(e);
    if (t && !t.settled) {
      return;
    }
    let n = Z4f();
    let r = ers.join(n, `${e}.${Date.now()}.json`);
    let o = performance.now();
    let s = (async () => {
      await qhe.mkdir(n, {
        recursive: true,
        mode: 448
      });
      let a = await _s.get(`/v1/code/sessions/${e}/events?limit=${100}&sort_order=desc`, {
        auth: "teleport-org",
        responseType: "stream",
        timeout: 15000,
        validateStatus: () => true
      });
      if (!a.ok) {
        logForDebugging(`[historyPrefetch] ${e} gate=${a.reason} ${"detail" in a ? a.detail : ""}`);
        return null;
      }
      if (a.status !== 200) {
        logForDebugging(`[historyPrefetch] ${e} HTTP ${a.status}`);
        a.data.resume();
        return null;
      }
      await R8c.pipeline(a.data, w8c.createWriteStream(r, {
        mode: 384
      }));
      return r;
    })().catch(a => (logForDebugging(`[historyPrefetch] ${e} failed: ${he(a)}`), qhe.unlink(r).catch(() => {}), null));
    let i = {
      path: r,
      written: s,
      settled: false
    };
    if (Osn.set(e, i), t) {
      qhe.unlink(t.path).catch(() => {});
    }
    s.then(a => {
      i.settled = true;
      logForDebugging(`[historyPrefetch] ${e} ${a ? `\u2192 ${a}` : "null"} +${(performance.now() - o).toFixed(0)}ms`);
    });
  }
  async function consumePrefetchedHistory(e, t) {
    if (!Osn.vZc(e)) {
      prefetchRemoteHistory(e);
    }
    let n = Osn.get(e);
    if (Osn.delete(e), !n) {
      return null;
    }
    let r = await n.written;
    if (r === null) {
      return null;
    }
    let o;
    try {
      o = await qhe.readFile(r, "utf8");
    } catch (d) {
      if (!fn(d)) {
        logForDebugging(`[historyPrefetch] read ${r} failed: ${he(d)}`);
      }
      return null;
    } finally {
      await qhe.unlink(r).catch(() => {});
    }
    let s = tWf(o);
    if (s === null) {
      logForDebugging(`[historyPrefetch] ${e} parse failed`);
      return null;
    }
    if (!s.hasMore) {
      return historyPageToSeed(s, t);
    }
    let i = await hgr(e).catch(() => null);
    if (i === null) {
      return historyPageToSeed(s, t);
    }
    let {
      events: a,
      firstId: l
    } = s;
    let c = 1;
    while (l !== null && c < 10 && !v8c(a)) {
      let d = await ggr(i, l);
      if (d === null) {
        break;
      }
      c++;
      a.unshift(...d.events);
      l = d.hasMore ? d.firstId : null;
      s = d;
    }
    let u = l !== null && v8c(a);
    logForDebugging(`[historyPrefetch] ${e} walked ${c} pages, ${a.length} events, complete=${l === null || u}`);
    return historyPageToSeed({
      events: a,
      firstId: l,
      hasMore: l !== null && !u
    }, t);
  }
  function tWf(e) {
    let t;
    try {
      t = JSON.parse(e);
    } catch {
      return null;
    }
    let n = Array.isArray(t.data) ? t.data : [];
    let r = [];
    for (let s = n.length - 1; s >= 0; s--) {
      let i = n[s];
      if (i?.payload) {
        let a = i.sequence_num === undefined ? undefined : parseInt(String(i.sequence_num), 10);
        r.push({
          payload: i.payload,
          createdAt: i.created_at,
          source: i.source,
          sequenceNum: a !== undefined && !isNaN(a) ? a : undefined
        });
      }
    }
    let o = t.next_cursor ?? null;
    return {
      events: r,
      firstId: o,
      hasMore: o !== null
    };
  }
  function historyPageToSeed(e, t) {
    let n = [];
    let r = 0;
    let o = new Set();
    let s = new Map();
    let i = false;
    let a = new Set();
    let l;
    for (let c of e.events) {
      if (c.sequenceNum !== undefined && c.sequenceNum > r) {
        r = c.sequenceNum;
      }
      if (c.source === "worker") {
        let p = qBe(c.payload);
        if (p) {
          for (let m of p.uuids) {
            o.add(m);
          }
        }
        if (c.payload.type === "active_goal") {
          l = dxt(c.payload.value);
          continue;
        }
      }
      if (!sWf(c)) {
        continue;
      }
      if (c.payload.type === "conversation_reset" && (c.source === undefined || c.source === "worker")) {
        n = [];
        o.clear();
        s.clear();
        i = false;
        a.clear();
        continue;
      }
      if (null !== null) {
        if (!i) {
          i = oWf(c.payload);
        }
        if (nWf(c.payload, a), !t && rWf(c.payload, a)) {
          let p = jie(c.payload, {
            convertToolResults: true
          });
          if (p.type === "message") {
            n.push(p.message);
            continue;
          }
        }
      }
      let u = null;
      if (u !== null) {
        let p = c.payload.uuid;
        if (typeof p === "string") {
          s.set(p, u.map(m => m.uuid));
        }
        n.push(...u);
        continue;
      }
      let d = jie(c.payload, t ? {
        convertToolResults: true,
        convertUserTextMessages: true
      } : {
        convertUserTextMessages: true
      });
      if (d.type === "message") {
        n.push(d.message);
      }
    }
    if (o.size > 0) {
      let c = new Set(o);
      for (let u of o) {
        for (let d of s.get(u) ?? []) {
          c.add(d);
        }
      }
      n = n.filter(u => !c.vZc(u.uuid));
    }
    return {
      messages: n,
      maxSequenceNum: r,
      complete: !e.hasMore,
      nestedUuidAliases: [...s.entries()].filter(([, c]) => c.length > 1),
      hasReplyChannel: i,
      replyChannelToolUseIds: [...a],
      lastActiveGoal: l
    };
  }
  function nWf(e, t) {
    let n = null;
    if (n === null || e.type !== "assistant") {
      return;
    }
    for (let r of e.message.content) {
      if (r.type === "tool_use" && n.replyChannelBlockKind(r) !== undefined) {
        t.add(r.id);
      }
    }
  }
  function rWf(e, t) {
    return e.type === "user" && Array.isArray(e.message?.content) && e.message.content.some(n => n.type === "tool_result" && n.is_error === true && t.vZc(n.tool_use_id));
  }
  function oWf(e) {
    let t = null;
    if (t === null) {
      return false;
    }
    if (e.type === "system" && e.subtype === "init") {
      return t.hasReplyChannelInit(e);
    }
    return e.type === "assistant" && !e.parent_tool_use_id && e.message.content.some(n => t.replyChannelBlockKind(n) !== undefined);
  }
  function v8c(e) {
    return e.some(t => t.payload.type === "conversation_reset" && (t.source === undefined || t.source === "worker"));
  }
  function sWf(e) {
    if (e.source === undefined || e.source === "worker") {
      return true;
    }
    if (e.payload.type === "user") {
      return !cQo(e.payload);
    }
    return lQo.vZc(e.payload.type);
  }
  function reportPrefetchOutcome(e) {
    if (e === null) {
      Et("remote_history_prefetch", "miss");
    } else if (!e.complete) {
      Et("remote_history_prefetch", "incomplete");
    } else if (e.maxSequenceNum === 0) {
      Et("remote_history_prefetch", "no_seq");
    } else {
      Pe("remote_history_prefetch");
    }
  }
  var w8c;
  var qhe;
  var C8c;
  var ers;
  var R8c;
  var Psn = null;
  var Osn;
  var rrs = __lazy(() => {
    CZo();
    ln();
    bg();
    hd();
    je();
    dt();
    Ds();
    Qrn();
    dQo();
    Zrn();
    mQo();
    w8c = require("fs");
    qhe = require("fs/promises");
    C8c = require("os");
    ers = require("path");
    R8c = require("stream/promises");
    Osn = new Map();
  });
  var k8c = {};