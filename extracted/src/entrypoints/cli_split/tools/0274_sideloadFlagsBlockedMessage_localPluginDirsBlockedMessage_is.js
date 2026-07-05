  __export(zAa, {
    sideloadFlagsBlockedMessage: () => sideloadFlagsBlockedMessage,
    localPluginDirsBlockedMessage: () => localPluginDirsBlockedMessage,
    isSourceInBlocklist: () => isSourceInBlocklist,
    isSourceAllowedByPolicy: () => isSourceAllowedByPolicy,
    isPluginBlockedByPolicy: () => isPluginBlockedByPolicy,
    isMarketplaceSourceDeclaredByPolicy: () => isMarketplaceSourceDeclaredByPolicy,
    isGitUrlHostAmbiguous: () => isGitUrlHostAmbiguous,
    getStrictKnownMarketplaces: () => getStrictKnownMarketplaces,
    getPluginTrustMessage: () => getPluginTrustMessage,
    getPluginSuggestionMarketplaces: () => getPluginSuggestionMarketplaces,
    getHostPatternsFromAllowlist: () => getHostPatternsFromAllowlist,
    getBlockedMarketplaces: () => getBlockedMarketplaces,
    extractHostFromSource: () => extractHostFromSource,
    areSideloadFlagsDisabledByPolicy: () => areSideloadFlagsDisabledByPolicy,
    areLocalPluginDirsAllowedByPolicy: () => areLocalPluginDirsAllowedByPolicy
  });
  function isPluginBlockedByPolicy(e) {
    return getSettingsForSource("policySettings")?.enabledPlugins?.[e] === false;
  }
  function getStrictKnownMarketplaces() {
    let e = getSettingsForSource("policySettings");
    if (!e?.strictKnownMarketplaces) {
      return null;
    }
    return e.strictKnownMarketplaces;
  }
  function areLocalPluginDirsAllowedByPolicy() {
    if (getBlockedMarketplaces()?.some(t => t.source === "skills-dir")) {
      return false;
    }
    let e = getStrictKnownMarketplaces();
    return e === null || e.some(t => t.source === "skills-dir");
  }
  function localPluginDirsBlockedMessage(e) {
    return `Plugins from ${e}/ are blocked by your organization's managed settings (strictKnownMarketplaces or blockedMarketplaces). Ask your administrator to add {"source":"skills-dir"} to strictKnownMarketplaces, or remove it from blockedMarketplaces.`;
  }
  function areSideloadFlagsDisabledByPolicy() {
    return getSettingsForSource("policySettings")?.disableSideloadFlags === true;
  }
  function sideloadFlagsBlockedMessage(e) {
    return `${e.join(", ")} ${e.length === 1 ? "is" : "are"} disabled by your organization's managed settings (disableSideloadFlags). Plugins, custom agents, and MCP servers can only be loaded from sources your administrator has approved. Ask your administrator to remove disableSideloadFlags from managed settings, or use an approved marketplace / settings file instead.`;
  }
  function getBlockedMarketplaces() {
    let e = getSettingsForSource("policySettings");
    if (!e?.blockedMarketplaces) {
      return null;
    }
    return e.blockedMarketplaces;
  }
  function getPluginTrustMessage() {
    return getSettingsForSource("policySettings")?.pluginTrustMessage;
  }
  function getPluginSuggestionMarketplaces() {
    return getSettingsForSource("policySettings")?.pluginSuggestionMarketplaces ?? [];
  }
  function isMarketplaceSourceDeclaredByPolicy(e, t) {
    let n = getSettingsForSource("policySettings");
    let r = n?.extraKnownMarketplaces?.[e]?.source;
    if (r && qAa(t, r)) {
      return true;
    }
    return n?.strictKnownMarketplaces?.some(o => VAa(t, o)) ?? false;
  }
  function qAa(e, t) {
    if (e.source !== t.source) {
      return false;
    }
    switch (e.source) {
      case "url":
        return Yjn(e.url) === Yjn(t.url);
      case "github":
        return e.repo === t.repo && (e.ref || undefined) === (t.ref || undefined) && (e.path || undefined) === (t.path || undefined);
      case "git":
        return jAa(e.url) === jAa(t.url) && (e.ref || undefined) === (t.ref || undefined) && (e.path || undefined) === (t.path || undefined);
      case "npm":
        return e.package === t.package;
      case "file":
        return e.path === t.path;
      case "directory":
        return e.path === t.path;
      case "settings":
        return e.name === t.name && gbu(e.plugins, t.plugins);
      default:
        return false;
    }
  }
  function isGitUrlHostAmbiguous(e) {
    let t = e.indexOf("://");
    if (t === -1) {
      return false;
    }
    let n = e.slice(t + 3);
    let r = n.search(/[/?#]/);
    return (r === -1 ? n : n.slice(0, r)).includes("\\");
  }
  function extractHostFromSource(e) {
    let t = hIp(e);
    return t === null ? null : GWt(t);
  }
  function hIp(e) {
    switch (e.source) {
      case "github":
        return "github.com";
      case "git":
        {
          if (e.url.includes("://")) {
            if (isGitUrlHostAmbiguous(e.url)) {
              return null;
            }
            try {
              return new URL(e.url).hostname || null;
            } catch {
              return null;
            }
          }
          return e.url.match(/^[^@]+@([^:]+):/)?.[1] ?? null;
        }
      case "url":
        try {
          return new URL(e.url).hostname;
        } catch {
          return null;
        }
      default:
        return null;
    }
  }
  function WAa(e, t) {
    let n = extractHostFromSource(e);
    if (!n) {
      return false;
    }
    try {
      return new RegExp(t.hostPattern).test(n);
    } catch {
      logForDebugging(`Invalid hostPattern regex in policy settings: ${t.hostPattern}`, {
        level: "error"
      });
      return false;
    }
  }
  function GAa(e, t) {
    if (e.source !== "file" && e.source !== "directory") {
      return false;
    }
    try {
      return new RegExp(t.pathPattern).test(e.path);
    } catch {
      logForDebugging(`Invalid pathPattern regex in policy settings strictKnownMarketplaces: ${t.pathPattern}`, {
        level: "error"
      });
      return false;
    }
  }
  function getHostPatternsFromAllowlist() {
    let e = getStrictKnownMarketplaces();
    if (!e) {
      return [];
    }
    return e.filter(t => t.source === "hostPattern").map(t => t.hostPattern);
  }
  function $Aa(e) {
    let t;
    let n;
    if (e.includes("://")) {
      if (isGitUrlHostAmbiguous(e)) {
        return null;
      }
      try {
        let o = new URL(e);
        t = o.hostname;
        n = o.pathname.replace(/^\/+/, "");
      } catch {
        return null;
      }
    } else {
      let o = e.match(/^[^@]+@([^:]+):(.+)$/);
      if (!o) {
        return null;
      }
      t = o[1];
      n = o[2];
    }
    if (!t || !n || !ef(t)) {
      return null;
    }
    return n.match(/^([^/]+\/[^/]+?)(?:\.git)?\/?$/)?.[1] ?? null;
  }
  function HAa(e) {
    if (e.includes("://")) {
      try {
        let n = new URL(e);
        n.hostname = GWt(n.hostname);
        n.username = "";
        n.password = "";
        return n.toString();
      } catch {
        return e;
      }
    }
    let t = e.match(/^[^@]+@([^:]+)(:.*)$/s);
    return t ? `${GWt(t[1] ?? "")}${t[2]}` : e;
  }
  function jAa(e) {
    if (sMt(e)) {
      return e;
    }
    if (e.includes("://")) {
      try {
        let r = new URL(e);
        if (r.hostname = GWt(r.hostname), gIp.vZc(r.protocol) || ef(r.hostname)) {
          r.username = "";
          r.password = "";
        }
        return r.toString();
      } catch {
        return e;
      }
    }
    let t = e.match(/^([^@]+)@([^:]+)(:.*)$/s);
    if (!t) {
      return e;
    }
    let n = (t[2] ?? "").toLowerCase().replace(/\.+$/, "");
    return ef(n) ? `${"github.com"}${t[3]}` : `${t[1]}@${n}${t[3]}`;
  }
  function Yjn(e) {
    try {
      let t = new URL(e);
      t.hostname = GWt(t.hostname);
      return t.toString();
    } catch {
      return e;
    }
  }
  function GWt(e) {
    let t = rMt(e);
    return ef(t) ? "github.com" : t;
  }
  function nMe(e, t) {
    if (!e) {
      return true;
    }
    return (e || undefined) === (t || undefined);
  }
  function yIp(e, t) {
    if (e.source === t.source) {
      switch (e.source) {
        case "github":
          {
            let n = t;
            if (e.repo !== n.repo) {
              return false;
            }
            return nMe(n.ref, e.ref) && nMe(n.path, e.path);
          }
        case "git":
          {
            let n = t;
            if (HAa(e.url) !== HAa(n.url)) {
              return false;
            }
            return nMe(n.ref, e.ref) && nMe(n.path, e.path);
          }
        case "url":
          return Yjn(e.url) === Yjn(t.url);
        case "npm":
          return e.package === t.package;
        case "file":
          return e.path === t.path;
        case "directory":
          return e.path === t.path;
        case "settings":
          return e.name === t.name;
        default:
          return false;
      }
    }
    if (e.source === "git" && t.source === "github") {
      if ($Aa(e.url) === t.repo) {
        return nMe(t.ref, e.ref) && nMe(t.path, e.path);
      }
    }
    if (e.source === "github" && t.source === "git") {
      if ($Aa(t.url) === e.repo) {
        return nMe(t.ref, e.ref) && nMe(t.path, e.path);
      }
    }
    return false;
  }
  function isSourceInBlocklist(e) {
    let t = getBlockedMarketplaces();
    if (t === null) {
      return false;
    }
    return t.some(n => {
      if (n.source === "hostPattern") {
        return WAa(e, n);
      }
      if (n.source === "pathPattern") {
        return GAa(e, n);
      }
      return yIp(e, n);
    });
  }
  function isSourceAllowedByPolicy(e) {
    if (e.source === "git" && isGitUrlHostAmbiguous(e.url)) {
      return false;
    }
    if (isSourceInBlocklist(e)) {
      return false;
    }
    let t = getStrictKnownMarketplaces();
    if (t === null) {
      return true;
    }
    return t.some(n => VAa(e, n));
  }
  function VAa(e, t) {
    if (e.source === "git" && sMt(e.url)) {
      return false;
    }
    if (t.source === "hostPattern") {
      return WAa(e, t);
    }
    if (t.source === "pathPattern") {
      return GAa(e, t);
    }
    if (t.source === "skills-dir") {
      return false;
    }
    return qAa(e, t);
  }
  var gIp;
  var Xk = __lazy(() => {
    je();
    fk();
    gIp = new Set(["http:", "https:", "git:", "git+http:", "git+https:"]);
  });
  function JWt(e) {
    if (Jj()) {
      return;
    }
    if (pAa()) {
      return;
    }
    let t = getGlobalConfig().claudeCodeHints;
    if (t?.disabled) {
      return;
    }
    let n = t?.plugin ?? [];
    if (n.length >= 100) {
      return;
    }
    let r = e.value;
    let {
      name: o,
      marketplace: s
    } = Yo(r);
    if (!o || !s) {
      return;
    }
    if (!BI(s)) {
      return;
    }
    if (n.includes(r)) {
      return;
    }
    if (qG(r)) {
      return;
    }
    if (isPluginBlockedByPolicy(r)) {
      return;
    }
    if (KAa.vZc(r)) {
      return;
    }
    KAa.add(r);
    lAa(e);
  }
  async function YAa(e) {
    let t = e.value;
    let {
      name: n,
      marketplace: r
    } = Yo(t);
    let o = await xO(t);
    if (logEvent("tengu_plugin_hint_detected", {
      _PROTO_plugin_name: n ?? "",
      _PROTO_marketplace_name: r ?? "",
      result: o ? "passed" : "not_in_cache"
    }), !o) {
      logForDebugging(`[hintRecommendation] ${t} not found in marketplace cache`);
      return null;
    }
    return {
      pluginId: t,
      pluginName: ES(o.entry),
      marketplaceName: r ?? "",
      pluginDescription: o.entry.description,
      sourceCommand: e.sourceCommand
    };
  }
  function JAa(e) {
    saveGlobalConfig(t => {
      let n = t.claudeCodeHints?.plugin ?? [];
      if (n.includes(e)) {
        return t;
      }
      return {
        ...t,
        claudeCodeHints: {
          ...t.claudeCodeHints,
          plugin: [...n, e]
        }
      };
    });
  }
  function XAa() {
    saveGlobalConfig(e => {
      if (e.claudeCodeHints?.disabled) {
        return e;
      }
      return {
        ...e,
        claudeCodeHints: {
          ...e.claudeCodeHints,
          disabled: true
        }
      };
    });
  }
  var KAa;
  var Qjn = __lazy(() => {
    KW();
    Ot();
    pmt();
    je();
    Qk();
    yT();
    Kf();
    Xk();
    KAa = new Set();
  });
  function eqn(e) {
    let t = e.find(n => n.name === "simplify");
    return {
      codeReview: e.some(n => n.name === "code-review"),
      verify: e.some(n => n.name === "verify"),
      simplify: t !== undefined && t.loadedFrom !== "bundled",
      commit: e.some(n => n.name === "commit"),
      pr: e.some(n => n.name === "pr")
    };
  }
  function QWt(e, t) {
    return "";
  }
  var ZWt = __lazy(() => {
    Ot();
  });
  class hho {
    capacity;
    buffer;
    head = 0;
    size = 0;
    constructor(e) {
      this.capacity = e;
      this.buffer = Array(e);
    }
    add(e) {
      if (this.buffer[this.head] = e, this.head = (this.head + 1) % this.capacity, this.size < this.capacity) {
        this.size++;
      }
    }
    addAll(e) {
      for (let t of e) {
        this.add(t);
      }
    }
    getRecent(e) {
      let t = [];
      let n = this.size < this.capacity ? 0 : this.head;
      let r = Math.min(e, this.size);
      for (let o = 0; o < r; o++) {
        let s = (n + this.size - r + o) % this.capacity;
        t.push(this.buffer[s]);
      }
      return t;
    }
    toArray() {
      if (this.size === 0) {
        return [];
      }
      let e = [];
      let t = this.size < this.capacity ? 0 : this.head;
      for (let n = 0; n < this.size; n++) {
        let r = (t + n) % this.capacity;
        e.push(this.buffer[r]);
      }
      return e;
    }
    clear() {
      this.buffer.length = 0;
      this.head = 0;
      this.size = 0;
    }
    length() {
      return this.size;
    }
  }
  function _mt() {
    return wde("BASH_MAX_OUTPUT_LENGTH", process.env.BASH_MAX_OUTPUT_LENGTH, 30000, 150000).effective;
  }
  var eGt = __lazy(() => {
    Xdt();
  });
  var e0a;
  var Db;
  var w5e = __lazy(() => {
    je();
    eGt();
    Zn();
    cE();
    e0a = require("fs/promises");
    Db = class Db {
      taskId;
      path;
      stdoutToFile;
      #e = "";
      #t = "";
      #n = null;
      #r = new hho(1000);
      #o = 0;
      #l = 0;
      #s;
      #a;
      #c = false;
      #u = 0;
      static #i = new Map();
      static #p = new Map();
      static #g = null;
      constructor(e, t, n = false, r = 8388608) {
        if (this.taskId = e, this.path = getTaskOutputPath(e), this.stdoutToFile = n, this.#s = r, this.#a = t, n && t) {
          Db.#i.set(e, this);
        }
      }
      static startPolling(e) {
        let t = Db.#i.get(e);
        if (!t || !t.#a) {
          return;
        }
        if (Db.#p.set(e, t), !Db.#g) {
          Db.#g = setInterval(Db.#f, 1000);
          Db.#g.unref();
        }
      }
      static stopPolling(e) {
        if (Db.#p.delete(e), Db.#p.size === 0 && Db.#g) {
          clearInterval(Db.#g);
          Db.#g = null;
        }
      }
      static #f() {
        for (let [, e] of Db.#p) {
          if (!e.#a) {
            continue;
          }
          LA(e.path, 4096).then(({
            content: t,
            bytesRead: n,
            bytesTotal: r
          }) => {
            if (!e.#a) {
              return;
            }
            if (!t) {
              e.#a("", "", e.#o, r, false);
              return;
            }
            let o = t.length;
            let s = 0;
            let i = 0;
            let a = 0;
            while (o > 0) {
              if (o = t.lastIndexOf(`
`, o - 1), a++, a === 5) {
                s = o <= 0 ? 0 : o + 1;
              }
              if (a === 100) {
                i = o <= 0 ? 0 : o + 1;
              }
            }
            let l = n >= r ? a : Math.max(e.#o, Math.round(r / n * a));
            e.#o = l;
            e.#l = r;
            e.#a(t.slice(s), t.slice(i), l, r, n < r);
          }, () => {});
        }
      }
      writeStdout(e) {
        this.#d(e, false);
      }
      writeStderr(e) {
        this.#d(e, true);
      }
      #d(e, t) {
        if (this.#l += e.length, this.#y(e), this.#n) {
          this.#n.append(t ? `[stderr] ${e}` : e);
          return;
        }
        if (this.#e.length + this.#t.length + e.length > this.#s) {
          this.#h(t ? e : null, t ? null : e);
          return;
        }
        if (t) {
          this.#t += e;
        } else {
          this.#e += e;
        }
      }
      #y(e) {
        let r = 0;
        let o = [];
        let s = 0;
        let i = e.length;
        while (i > 0) {
          let a = e.lastIndexOf(`
`, i - 1);
          if (a === -1) {
            break;
          }
          if (r++, o.length < 100 && s < 4096) {
            let l = i - a - 1;
            if (l > 0 && l <= 4096 - s) {
              let c = e.slice(a + 1, i);
              if (c.trim()) {
                o.push(Buffer.from(c).toString());
                s += l;
              }
            }
          }
          i = a;
        }
        this.#o += r;
        for (let a = o.length - 1; a >= 0; a--) {
          this.#r.add(o[a]);
        }
        if (this.#a && o.length > 0) {
          let a = this.#r.getRecent(5);
          this.#a(tun(a, `
`), tun(this.#r.getRecent(100), `
`), this.#o, this.#l, this.#n !== null);
        }
      }
      #h(e, t) {
        if (this.#n = new DiskTaskOutput(this.taskId), this.#e) {
          this.#n.append(this.#e);
          this.#e = "";
        }
        if (this.#t) {
          this.#n.append(`[stderr] ${this.#t}`);
          this.#t = "";
        }
        if (t) {
          this.#n.append(t);
        }
        if (e) {
          this.#n.append(`[stderr] ${e}`);
        }
      }
      async getStdout() {
        if (this.stdoutToFile) {
          return this.#b();
        }
        if (this.#n) {
          let e = this.#r.getRecent(5);
          let t = tun(e, `
`);
          let r = `
Output truncated (${Math.round(this.#l / 1024)}KB total). Full output saved to: ${this.path}`;
          return t ? t + r : r.trimStart();
        }
        return this.#e;
      }
      async #b() {
        let e = _mt();
        try {
          let t = await Ycn(this.path, 0, e);
          if (!t) {
            this.#c = true;
            return "";
          }
          let {
            content: n,
            bytesRead: r,
            bytesTotal: o
          } = t;
          this.#u = o;
          this.#c = o <= r;
          return n;
        } catch (t) {
          let n = t instanceof Error && "code" in t ? String(t.code) : "unknown";
          logForDebugging(`TaskOutput.#readStdoutFromFile: failed to read ${this.path} (${n}): ${t}`);
          return `<bash output unavailable: output file ${this.path} could not be read (${n}). This usually means another Claude Code process in the same project deleted it during startup cleanup.>`;
        }
      }
      getStderr() {
        if (this.#n) {
          return "";
        }
        return this.#t;
      }
      get isOverflowed() {
        return this.#n !== null;
      }
      get totalLines() {
        return this.#o;
      }
      get totalBytes() {
        return this.#l;
      }
      get outputFileRedundant() {
        return this.#c;
      }
      get outputFileSize() {
        return this.#u;
      }
      spillToDisk() {
        if (!this.#n) {
          this.#h(null, null);
        }
      }
      async flush() {
        await this.#n?.flush();
      }
      async deleteOutputFile() {
        try {
          await e0a.unlink(this.path);
        } catch {}
      }
      clear() {
        this.#e = "";
        this.#t = "";
        this.#r.clear();
        this.#a = null;
        this.#n?.cancel();
        Db.stopPolling(this.taskId);
        Db.#i.delete(this.taskId);
      }
    };
  });
  function _ho(e, t) {
    if (!t?.subcommands?.length) {
      return false;
    }
    let n = e.toLowerCase();
    return t.subcommands.some(r => Array.isArray(r.name) ? r.name.some(o => o.toLowerCase() === n) : r.name.toLowerCase() === n);
  }
  function t0a(e, t, n) {
    if (n?.options) {
      let r = n.options.find(o => Array.isArray(o.name) ? o.name.includes(e) : o.name === e);
      if (r) {
        return !!r.args;
      }
    }
    if (n?.subcommands?.length && t && !t.startsWith("-")) {
      return !_ho(t, n);
    }
    return false;
  }
  function vIp(e, t) {
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (!r) {
        continue;
      }
      if (r.startsWith("-")) {
        if (t0a(r, e[n + 1], t)) {
          n++;
        }
        continue;
      }
      if (!t?.subcommands?.length) {
        return r;
      }
      if (_ho(r, t)) {
        return r;
      }
    }
    return;
  }
  async function tqn(e, t, n) {
    let r = await wIp(e, t, n);
    let o = [e];
    let s = !!n?.subcommands?.length;
    let i = false;
    for (let a = 0; a < t.length; a++) {
      let l = t[a];
      if (!l || o.length >= r) {
        break;
      }
      if (l.startsWith("-")) {
        if (l === "-c" && ["python", "python3"].includes(e.toLowerCase())) {
          break;
        }
        if (n?.options) {
          let c = n.options.find(u => Array.isArray(u.name) ? u.name.includes(l) : u.name === l);
          if (c?.args && bmt(c.args).some(u => u?.isCommand || u?.isModule)) {
            o.push(l);
            continue;
          }
        }
        if (s && !i) {
          if (t0a(l, t[a + 1], n)) {
            a++;
          }
          continue;
        }
        break;
      }
      if (await CIp(l, t.slice(0, a), n)) {
        break;
      }
      if (s && !i) {
        i = _ho(l, n);
      }
      o.push(l);
    }
    return o.join(" ");
  }
  async function wIp(e, t, n) {
    let r = vIp(t, n);
    let o = e.toLowerCase();
    let s = r ? `${o} ${r.toLowerCase()}` : o;
    if (C5e[s]) {
      return C5e[s];
    }
    if (C5e[o]) {
      return C5e[o];
    }
    if (!n) {
      return 2;
    }
    if (n.options && t.some(i => i?.startsWith("-"))) {
      for (let i of t) {
        if (!i?.startsWith("-")) {
          continue;
        }
        let a = n.options.find(l => Array.isArray(l.name) ? l.name.includes(i) : l.name === i);
        if (a?.args && bmt(a.args).some(l => l?.isCommand || l?.isModule)) {
          return 3;
        }
      }
    }
    if (r && n.subcommands?.length) {
      let i = r.toLowerCase();
      let a = n.subcommands.find(l => Array.isArray(l.name) ? l.name.some(c => c.toLowerCase() === i) : l.name.toLowerCase() === i);
      if (a) {
        if (a.args) {
          let l = bmt(a.args);
          if (l.some(c => c?.isCommand)) {
            return 3;
          }
          if (l.some(c => c?.isVariadic)) {
            return 2;
          }
        }
        if (a.subcommands?.length) {
          return 4;
        }
        if (!a.args) {
          return 2;
        }
        return 3;
      }
    }
    if (n.args) {
      let i = bmt(n.args);
      if (i.some(a => a?.isCommand)) {
        return !Array.isArray(n.args) && n.args.isCommand ? 2 : Math.min(2 + i.findIndex(a => a?.isCommand), 3);
      }
      if (!n.subcommands?.length) {
        if (i.some(a => a?.isVariadic)) {
          return 1;
        }
        if (i[0] && !i[0].isOptional) {
          return 2;
        }
      }
    }
    return n.args && bmt(n.args).some(i => i?.isDangerous) ? 3 : 2;
  }
  async function CIp(e, t, n) {
    if (e.startsWith("-")) {
      return true;
    }
    let r = e.lastIndexOf(".");
    let o = r > 0 && r < e.length - 1 && !e.substring(r + 1).includes(":");
    let s = e.includes("/") || o;
    let i = EIp.some(a => e.startsWith(a));
    if (!s && !i) {
      return false;
    }
    if (n?.options && t.length > 0 && t[t.length - 1] === "-m") {
      let a = n.options.find(l => Array.isArray(l.name) ? l.name.includes("-m") : l.name === "-m");
      if (a?.args && bmt(a.args).some(l => l?.isModule)) {
        return false;
      }
    }
    return true;
  }
  var EIp;
  var C5e;
  var bmt = e => Array.isArray(e) ? e : [e];
  var bho = __lazy(() => {
    EIp = ["http://", "https://", "ftp://"];
    C5e = {
      rg: 2,
      "pre-commit": 2,
      gcloud: 4,
      "gcloud compute": 6,
      "gcloud beta": 6,
      aws: 4,
      az: 4,
      kubectl: 3,
      docker: 3,
      dotnet: 3,
      "git push": 2
    };
  });
  var RIp;
  var xIp;
  var i0a;
  var a0a = __lazy(() => {
    i0a = {
      name: "pyright",
      description: "Type checker for Python",
      options: [{
        name: ["--help", "-h"],
        description: "Show help message"
      }, {
        name: "--version",
        description: "Print pyright version and exit"
      }, {
        name: ["--watch", "-w"],
        description: "Continue to run and watch for changes"
      }, {
        name: ["--project", "-p"],
        description: "Use the configuration file at this location",
        args: {
          name: "FILE OR DIRECTORY"
        }
      }, {
        name: "-",
        description: "Read file or directory list from stdin"
      }, {
        name: "--createstub",
        description: "Create type stub file(s) for import",
        args: {
          name: "IMPORT"
        }
      }, {
        name: ["--typeshedpath", "-t"],
        description: "Use typeshed type stubs at this location",
        args: {
          name: "DIRECTORY"
        }
      }, {
        name: "--verifytypes",
        description: "Verify completeness of types in py.typed package",
        args: {
          name: "IMPORT"
        }
      }, {
        name: "--ignoreexternal",
        description: "Ignore external imports for --verifytypes"
      }, {
        name: "--pythonpath",
        description: "Path to the Python interpreter",
        args: {
          name: "FILE"
        }
      }, {
        name: "--pythonplatform",
        description: "Analyze for platform",
        args: {
          name: "PLATFORM"
        }
      }, {
        name: "--pythonversion",
        description: "Analyze for Python version",
        args: {
          name: "VERSION"
        }
      }, {
        name: ["--venvpath", "-v"],
        description: "Directory that contains virtual environments",
        args: {
          name: "DIRECTORY"
        }
      }, {
        name: "--outputjson",
        description: "Output results in JSON format"
      }, {
        name: "--verbose",
        description: "Emit verbose diagnostics"
      }, {
        name: "--stats",
        description: "Print detailed performance stats"
      }, {
        name: "--dependencies",
        description: "Emit import dependency information"
      }, {
        name: "--level",
        description: "Minimum diagnostic level",
        args: {
          name: "LEVEL"
        }
      }, {
        name: "--skipunannotated",
        description: "Skip type analysis of unannotated functions"
      }, {
        name: "--warnings",
        description: "Use exit code of 1 if warnings are reported"
      }, {
        name: "--threads",
        description: "Use up to N threads to parallelize type checking",
        args: {
          name: "N",
          isOptional: true
        }
      }],
      args: {
        name: "files",
        description: "Specify files or directories to analyze (overrides config file)",
        isVariadic: true,
        isOptional: true
      }
    };
  });
  var kIp;
  var AIp;
  var IIp;
  var PIp;
  var Sho;
  var g0a = __lazy(() => {
    a0a();
    Sho = [i0a, PIp, kIp, RIp, xIp, IIp, AIp];
  });
  async function OIp(e) {
    if (!e || e.includes("/") || e.includes("\\")) {
      return null;
    }
    if (e.includes("..")) {
      return null;
    }
    if (e.startsWith("-") && e !== "-") {
      return null;
    }
    if (X4() && rm()) {
      return null;
    }
    try {
      let t = await import(`@withfig/autocomplete/build/${e}.js`);
      return t.default || t;
    } catch {
      return null;
    }
  }
  var oMe;
  var Tho = __lazy(() => {
    nW();
    g0a();
    oMe = mk(async e => Sho.find(n => n.name === e) || (await OIp(e)) || null, e => e);
  });
  function MIp(e, t) {
    if (!t?.subcommands?.length) {
      return false;
    }
    return t.subcommands.some(n => Array.isArray(n.name) ? n.name.includes(e) : n.name === e);
  }
  async function nGt(e, t = 0, n = 0) {
    if (n > 2 || t > 10) {
      return null;
    }
    let r = await parseCommand(e);
    if (!r) {
      return null;
    }
    if (!r.commandNode) {
      return {
        commandPrefix: null
      };
    }
    let {
      envVars: o,
      commandNode: s
    } = r;
    let i = extractCommandArguments(s);
    let [a, ...l] = i;
    if (!a) {
      return {
        commandPrefix: null
      };
    }
    let c = await oMe(a);
    let u = DIp.vZc(a) || c?.args && nqn(c.args).some(m => m?.isCommand);
    if (u && l[0] && MIp(l[0], c)) {
      u = false;
    }
    let d = u ? await NIp(a, l, t, n) : await tqn(a, l, c);
    if (d === null && t === 0 && u) {
      return null;
    }
    let p = o.length ? `${o.join(" ")} ` : "";
    return {
      commandPrefix: d ? p + d : null
    };
  }
  async function NIp(e, t, n, r) {
    let o = await oMe(e);
    if (o?.args) {
      let a = nqn(o.args).findIndex(l => l?.isCommand);
      if (a !== -1) {
        let l = [e];
        for (let c = 0; c < t.length && c <= a; c++) {
          if (c === a) {
            let u = await nGt(t.slice(c).join(" "), n + 1, r + 1);
            if (u?.commandPrefix) {
              l.push(...u.commandPrefix.split(" "));
              return l.join(" ");
            }
            break;
          } else if (t[c] && !t[c].startsWith("-") && !y0a.test(t[c])) {
            l.push(t[c]);
          }
        }
      }
    }
    let s = t.find(a => !a.startsWith("-") && !_0a.test(a) && !y0a.test(a));
    if (!s) {
      return e;
    }
    let i = await nGt(t.slice(t.indexOf(s)).join(" "), n + 1, r + 1);
    return !i?.commandPrefix ? null : `${e} ${i.commandPrefix}`;
  }
  async function b0a(e, t) {
    let n = Uy(e);
    if (n.length <= 1) {
      let i = await nGt(e);
      return i?.commandPrefix ? [i.commandPrefix] : [];
    }
    let r = [];
    for (let i of n) {
      let a = i.trim();
      if (t?.(a)) {
        continue;
      }
      let l = await nGt(a);
      if (l?.commandPrefix) {
        r.push(l.commandPrefix);
      }
    }
    if (r.length === 0) {
      return [];
    }
    let o = new Map();
    for (let i of r) {
      let a = ii(i, " ");
      let l = o.get(a);
      if (l) {
        l.push(i);
      } else {
        o.set(a, [i]);
      }
    }
    let s = [];
    for (let [, i] of o) {
      s.push(LIp(i));
    }
    return s;
  }
  function LIp(e) {
    if (e.length === 0) {
      return "";
    }
    if (e.length === 1) {
      return e[0];
    }
    let n = e[0].split(" ");
    let r = n.length;
    for (let o = 1; o < e.length; o++) {
      let s = e[o].split(" ");
      let i = 0;
      while (i < r && i < s.length && n[i] === s[i]) {
        i++;
      }
      r = i;
    }
    return n.slice(0, Math.max(1, r)).join(" ");
  }
  async function S0a(e) {
    let t = new Set();
    for (let n of Uy(e)) {
      let r = n.trim();
      let o = await nGt(r);
      if (!o?.commandPrefix) {
        continue;
      }
      let s = await Eho(r, o.commandPrefix);
      let i = await FIp(s);
      if (i) {
        t.add(i);
      }
    }
    return [...t];
  }
  async function Eho(e, t) {
    let n = await parseCommand(e);
    if (n?.envVars.length) {
      let r = `${n.envVars.join(" ")} `;
      if (t.startsWith(r)) {
        return t.slice(r.length);
      }
    }
    return t;
  }
  async function FIp(e) {
    let t = e.split(" ").filter(Boolean);
    if (t.length <= 1) {
      return e;
    }
    let n = [t[0]];
    let r = await oMe(t[0]);
    for (let o = 1; o < t.length; o++) {
      let s = t[o];
      if (s.startsWith("-")) {
        break;
      }
      if (r?.args && nqn(r.args).some(a => a?.isCommand)) {
        if (_0a.test(s)) {
          continue;
        }
        n.push(s);
        r = await oMe(s);
        continue;
      }
      let i = UIp(r, s);
      if (!i) {
        break;
      }
      n.push(s);
      r = i;
    }
    return n.join(" ");
  }
  function UIp(e, t) {
    if (!e?.subcommands?.length) {
      return null;
    }
    let n = t.toLowerCase();
    return e.subcommands.find(r => nqn(r.name).some(o => o.toLowerCase() === n)) ?? null;
  }
  var _0a;
  var y0a;
  var DIp;
  var nqn = e => Array.isArray(e) ? e : [e];
  var vho = __lazy(() => {
    bho();
    Zn();
    bU();
    VOe();
    Tho();
    _0a = /^\d+$/;
    y0a = /^[A-Za-z_][A-Za-z0-9_]*=/;
    DIp = new Set(["nice"]);
  });
  class v0a {
    als = new E0a.AsyncLocalStorage();
    active() {
      return this.als.getStore() ?? T0a.ROOT_CONTEXT;
    }
    with(e, t, n, ...r) {
      let o = n == null ? t : t.bind(n);
      return this.als.run(e, o, ...r);
    }
    enterWith(e) {
      this.als.enterWith(e);
    }
    bind(e, t) {
      if (typeof t === "function") {
        let n = (...r) => this.with(e, () => t(...r));
        Object.defineProperty(n, "length", {
          configurable: true,
          enumerable: false,
          writable: false,
          value: t.length
        });
        return n;
      }
      return t;
    }
    enable() {
      return this;
    }
    disable() {
      this.als.disable();
      return this;
    }
  }
  var T0a;
  var E0a;
  var WTe;
  var who = __lazy(() => {
    T0a = __toESM(Ji(), 1);
    E0a = require("async_hooks");
    WTe = new v0a();
  });
  function C0a(e) {
    return Math.abs(ike(e)) || 1;
  }
  function R0a(e) {
    let t = xho.get(e);
    if (t !== undefined) {
      return t;
    }
    Rho++;
    xho.set(e, Rho);
    return Rho;
  }
  function rGt() {
    let e = getAgentId() ?? getSessionId();
    let t = getAgentName() ?? "main";
    let n = getParentSessionId_export();
    let r = rqn.get(e);
    if (r) {
      return r;
    }
    let o = {
      agentId: e,
      agentName: t,
      parentAgentId: n,
      processId: e === getSessionId() ? 1 : R0a(e),
      threadId: C0a(t)
    };
    rqn.set(e, o);
    w0a++;
    return o;
  }
  function GTe() {
    return (Date.now() - 0) * 1000;
  }
  function oqn() {
    return `span_${++$Ip}`;
  }
  function x0a() {
    let e = process.env.CLAUDE_CODE_PERFETTO_TRACE;
    logForDebugging(`[Perfetto] initializePerfettoTracing called, env value: ${e}`);
  }
  function HIp(e) {
    if (!false) {
      return;
    }
    if (Cho.push({
      name: "process_name",
      cat: "__metadata",
      ph: "M",
      ts: 0,
      pid: e.processId,
      tid: 0,
      args: {
        name: e.agentName
      }
    }), Cho.push({
      name: "thread_name",
      cat: "__metadata",
      ph: "M",
      ts: 0,
      pid: e.processId,
      tid: e.threadId,
      args: {
        name: e.agentName
      }
    }), e.parentAgentId) {
      Cho.push({
        name: "parent_agent",
        cat: "__metadata",
        ph: "M",
        ts: 0,
        pid: e.processId,
        tid: 0,
        args: {
          parent_agent_id: e.parentAgentId
        }
      });
    }
  }
  function VTe() {
    return false;
  }
  function sqn(e, t, n) {
    if (!false) {
      return;
    }
    let r = {
      agentId: e,
      agentName: t,
      parentAgentId: n,
      processId: R0a(e),
      threadId: C0a(t)
    };
    rqn.set(e, r);
    w0a++;
    HIp(r);
  }
  function R5e(e) {
    if (!false) {
      return;
    }
    rqn.delete(e);
    xho.delete(e);
  }
  function k0a(e) {
    if (!false) {
      return "";
    }
    let t = oqn();
    let n = rGt();
    kO.set(t, {
      name: "API Call",
      category: "api",
      startTime: GTe(),
      agentInfo: n,
      args: {
        model: e.model,
        prompt_tokens: e.promptTokens,
        message_id: e.messageId,
        query_source: e.querySource
      }
    });
    SU.push({
      name: "API Call",
      cat: "api",
      ph: "B",
      ts: kO.get(t).startTime,
      pid: n.processId,
      tid: n.threadId,
      args: kO.get(t).args
    });
    return t;
  }
  function A0a(e, t) {
    if (!false || !e) {
      return;
    }
    let n = kO.get(e);
    if (!n) {
      return;
    }
    let r = GTe();
    let o = r - n.startTime;
    let s = t.promptTokens ?? n.args.prompt_tokens;
    let i = t.ttftMs;
    let a = t.ttltMs;
    let l = t.outputTokens;
    let c = t.cacheReadTokens;
    let u = i !== undefined && s !== undefined && i > 0 ? Math.round(s / (i / 1000) * 100) / 100 : undefined;
    let d = a !== undefined && i !== undefined ? a - i : undefined;
    let p = d !== undefined && l !== undefined && d > 0 ? Math.round(l / (d / 1000) * 100) / 100 : undefined;
    let m = c !== undefined && s !== undefined && s > 0 ? Math.round(c / s * 1e4) / 100 : undefined;
    let f = t.requestSetupMs;
    let h = t.attemptStartTimes;
    let g = {
      ...n.args,
      ttft_ms: i,
      ttlt_ms: a,
      prompt_tokens: s,
      output_tokens: l,
      cache_read_tokens: c,
      cache_creation_tokens: t.cacheCreationTokens,
      message_id: t.messageId ?? n.args.message_id,
      request_id: t.requestId,
      client_request_id: t.clientRequestId,
      success: t.success ?? true,
      error: t.error,
      duration_ms: o / 1000,
      request_setup_ms: f,
      itps: u,
      otps: p,
      cache_hit_rate_pct: m
    };
    let y = f !== undefined && f > 0 ? f * 1000 : 0;
    if (y > 0) {
      let _ = n.startTime + y;
      if (SU.push({
        name: "Request Setup",
        cat: "api,setup",
        ph: "B",
        ts: n.startTime,
        pid: n.agentInfo.processId,
        tid: n.agentInfo.threadId,
        args: {
          request_setup_ms: f,
          attempt_count: h?.length ?? 1
        }
      }), h && h.length > 1) {
        let b = h[0];
        for (let S = 0; S < h.length - 1; S++) {
          let E = n.startTime + (h[S] - b) * 1000;
          let C = n.startTime + (h[S + 1] - b) * 1000;
          SU.push({
            name: `Attempt ${S + 1} (retry)`,
            cat: "api,retry",
            ph: "B",
            ts: E,
            pid: n.agentInfo.processId,
            tid: n.agentInfo.threadId,
            args: {
              attempt: S + 1
            }
          });
          SU.push({
            name: `Attempt ${S + 1} (retry)`,
            cat: "api,retry",
            ph: "E",
            ts: C,
            pid: n.agentInfo.processId,
            tid: n.agentInfo.threadId
          });
        }
      }
      SU.push({
        name: "Request Setup",
        cat: "api,setup",
        ph: "E",
        ts: _,
        pid: n.agentInfo.processId,
        tid: n.agentInfo.threadId
      });
    }
    if (i !== undefined) {
      let _ = n.startTime + y;
      let b = _ + i * 1000;
      SU.push({
        name: "First Token",
        cat: "api,ttft",
        ph: "B",
        ts: _,
        pid: n.agentInfo.processId,
        tid: n.agentInfo.threadId,
        args: {
          ttft_ms: i,
          prompt_tokens: s,
          itps: u,
          cache_hit_rate_pct: m
        }
      });
      SU.push({
        name: "First Token",
        cat: "api,ttft",
        ph: "E",
        ts: b,
        pid: n.agentInfo.processId,
        tid: n.agentInfo.threadId
      });
      let S = a !== undefined ? a - i - y / 1000 : undefined;
      if (S !== undefined && S > 0) {
        SU.push({
          name: "Sampling",
          cat: "api,sampling",
          ph: "B",
          ts: b,
          pid: n.agentInfo.processId,
          tid: n.agentInfo.threadId,
          args: {
            sampling_ms: S,
            output_tokens: l,
            otps: p
          }
        });
        SU.push({
          name: "Sampling",
          cat: "api,sampling",
          ph: "E",
          ts: b + S * 1000,
          pid: n.agentInfo.processId,
          tid: n.agentInfo.threadId
        });
      }
    }
    SU.push({
      name: n.name,
      cat: n.category,
      ph: "E",
      ts: r,
      pid: n.agentInfo.processId,
      tid: n.agentInfo.threadId,
      args: g
    });
    kO.delete(e);
  }
  function I0a(e, t) {
    if (!false) {
      return "";
    }
    let n = oqn();
    let r = rGt();
    kO.set(n, {
      name: `Tool: ${e}`,
      category: "tool",
      startTime: GTe(),
      agentInfo: r,
      args: {
        tool_name: e,
        ...t
      }
    });
    SU.push({
      name: `Tool: ${e}`,
      cat: "tool",
      ph: "B",
      ts: kO.get(n).startTime,
      pid: r.processId,
      tid: r.threadId,
      args: kO.get(n).args
    });
    return n;
  }
  function P0a(e, t) {
    if (!false || !e) {
      return;
    }
    let n = kO.get(e);
    if (!n) {
      return;
    }
    let r = GTe();
    let o = r - n.startTime;
    let s = {
      ...n.args,
      success: t?.success ?? true,
      error: t?.error,
      result_tokens: t?.resultTokens,
      duration_ms: o / 1000
    };
    SU.push({
      name: n.name,
      cat: n.category,
      ph: "E",
      ts: r,
      pid: n.agentInfo.processId,
      tid: n.agentInfo.threadId,
      args: s
    });
    kO.delete(e);
  }
  function O0a(e) {
    if (!false) {
      return "";
    }
    let t = oqn();
    let n = rGt();
    kO.set(t, {
      name: "Waiting for User Input",
      category: "user_input",
      startTime: GTe(),
      agentInfo: n,
      args: {
        context: e
      }
    });
    SU.push({
      name: "Waiting for User Input",
      cat: "user_input",
      ph: "B",
      ts: kO.get(t).startTime,
      pid: n.processId,
      tid: n.threadId,
      args: kO.get(t).args
    });
    return t;
  }
  function D0a(e, t) {
    if (!false || !e) {
      return;
    }
    let n = kO.get(e);
    if (!n) {
      return;
    }
    let r = GTe();
    let o = r - n.startTime;
    let s = {
      ...n.args,
      decision: t?.decision,
      source: t?.source,
      duration_ms: o / 1000
    };
    SU.push({
      name: n.name,
      cat: n.category,
      ph: "E",
      ts: r,
      pid: n.agentInfo.processId,
      tid: n.agentInfo.threadId,
      args: s
    });
    kO.delete(e);
  }
  function M0a(e, t, n) {
    if (!false) {
      return;
    }
    let r = rGt();
    SU.push({
      name: e,
      cat: t,
      ph: "i",
      ts: GTe(),
      pid: r.processId,
      tid: r.threadId,
      args: n
    });
  }
  function N0a(e) {
    if (!false) {
      return "";
    }
    let t = oqn();
    let n = rGt();
    kO.set(t, {
      name: "Interaction",
      category: "interaction",
      startTime: GTe(),
      agentInfo: n,
      args: {
        user_prompt_length: e?.length
      }
    });
    SU.push({
      name: "Interaction",
      cat: "interaction",
      ph: "B",
      ts: kO.get(t).startTime,
      pid: n.processId,
      tid: n.threadId,
      args: kO.get(t).args
    });
    return t;
  }
  function L0a(e) {
    if (!false || !e) {
      return;
    }
    let t = kO.get(e);
    if (!t) {
      return;
    }
    let n = GTe();
    let r = n - t.startTime;
    SU.push({
      name: t.name,
      cat: t.category,
      ph: "E",
      ts: n,
      pid: t.agentInfo.processId,
      tid: t.agentInfo.threadId,
      args: {
        ...t.args,
        duration_ms: r / 1000
      }
    });
    kO.delete(e);
  }
  var Cho;
  var SU;
  var kO;
  var rqn;
  var w0a = 0;
  var $Ip = 0;
  var Rho = 1;
  var xho;
  var Smt = __lazy(() => {
    at();
    hd();
    je();
    gn();
    dt();
    qp();
    Cho = [];
    SU = [];
    kO = new Map();
    rqn = new Map();
    xho = new Map();
  });
  function Aho() {
    let e = process.env.CLAUDE_CODE_ENHANCED_TELEMETRY_BETA ?? process.env.ENABLE_ENHANCED_TELEMETRY_BETA;
    if (st(e)) {
      return true;
    }
    if (Pl(e)) {
      return false;
    }
    return false;
  }
  function WG() {
    return Aho() || Tx();
  }
  function Gde() {
    return false;
  }
  function iGt(e, t) {
    return;
  }
  function k5e(e, t) {
    e.setStatus({
      code: Ch.SpanStatusCode.ERROR,
      ...(t && {
        message: t
      })
    });
  }
  function $0a(e, t) {
    if (!t) {
      return;
    }
    e.setAttribute("tool_use_id", t);
    e.setAttribute("gen_ai.tool.call.id", t);
  }
  function F1() {
    return Ch.trace.getTracer("com.anthropic.claude_code.tracing", "1.0.0");
  }
  function E$() {
    let e = WTe.active();
    return e === Ch.ROOT_CONTEXT && sGt ? sGt : e;
  }
  function Tmt(e) {
    let t = E$().getValue(e);
    return t && !t.ended ? t : undefined;
  }
  function aMe(e, t) {
    iMe.set(t.span, t);
    let n = Ch.trace.setSpan(t.priorContext, t.span).setValue(e, t);
    if (WTe.enterWith(n), e === sMe) {
      sGt = n;
    }
  }
  function lMe(e, t) {
    if (t.ended = true, e === sMe && sGt?.getValue(e) === t) {
      sGt = undefined;
    }
    if (E$().getValue(e) === t) {
      WTe.enterWith(t.priorContext);
    }
  }
  function A5e(e, t = {}) {
    return {
      ...RGe(),
      "span.type": e,
      ...t
    };
  }
  function jIp(e) {
    let t = VTe() ? N0a(e) : undefined;
    let n = E$();
    if (!WG()) {
      if (t) {
        let c = Ch.trace.getActiveSpan() || F1().startSpan("dummy");
        aMe(sMe, {
          span: c,
          startTime: performance.now(),
          attributes: {
            "span.type": "interaction"
          },
          perfettoSpanId: t,
          priorContext: n
        });
        return c;
      }
      return Ch.trace.getActiveSpan() || F1().startSpan("dummy");
    }
    let r = F1();
    let s = st(process.env.OTEL_LOG_USER_PROMPTS) ? e : "<REDACTED>";
    F0a++;
    let i = A5e("interaction", {
      user_prompt: s,
      user_prompt_length: e.length,
      "interaction.sequence": F0a
    });
    let a = getIsNonInteractiveSession() && process.env.TRACEPARENT ? Ch.propagation.extract(n, {
      traceparent: process.env.TRACEPARENT,
      tracestate: process.env.TRACESTATE
    }) : n;
    let l = r.startSpan("claude_code.interaction", {
      attributes: i
    }, a);
    Aya(l, e);
    aMe(sMe, {
      span: l,
      startTime: performance.now(),
      attributes: i,
      perfettoSpanId: t,
      priorContext: n
    });
    return l;
  }
  function iqn(e, t) {
    let n = E$();
    jIp(e);
    let r = E$();
    try {
      return WTe.with(r, t);
    } finally {
      if (E$() === r) {
        WTe.enterWith(n);
      }
    }
  }
  function Vde() {
    let e = Tmt(sMe);
    if (!e) {
      return;
    }
    if (e.perfettoSpanId) {
      L0a(e.perfettoSpanId);
    }
    if (!WG()) {
      lMe(sMe, e);
      return;
    }
    let t = Math.max(0, Math.round(performance.now() - e.startTime));
    e.span.setAttributes({
      "interaction.duration_ms": t
    });
    e.span.end();
    lMe(sMe, e);
  }
  function H0a(e, t, n, r, o) {
    let s = VTe() ? k0a({
      model: e,
      querySource: n?.querySource,
      messageId: undefined
    }) : undefined;
    let i = E$();
    if (!WG()) {
      if (s) {
        let d = Ch.trace.getActiveSpan() || F1().startSpan("dummy");
        iMe.set(d, {
          span: d,
          startTime: performance.now(),
          attributes: {
            model: e
          },
          perfettoSpanId: s,
          priorContext: i
        });
        return d;
      }
      return Ch.trace.getActiveSpan() || F1().startSpan("dummy");
    }
    let a = F1();
    let l = E$().getValue(x5e);
    let c = A5e("llm_request", {
      model: e,
      "gen_ai.system": "anthropic",
      "gen_ai.request.model": e,
      "llm_request.context": l ? "tool" : Tmt(sMe) ? "interaction" : "standalone",
      speed: o ? "fast" : "normal"
    });
    let u = a.startSpan("claude_code.llm_request", {
      attributes: c
    }, i);
    if (n?.querySource) {
      u.setAttribute("query_source", n.querySource);
    }
    if (t && !qY(t)) {
      if (t.agentId) {
        u.setAttribute("agent_id", t.agentId);
      }
      if (t.parentAgentId) {
        u.setAttribute("parent_agent_id", t.parentAgentId);
      }
    }
    Iya(u, n, r);
    iMe.set(u, {
      span: u,
      startTime: performance.now(),
      attributes: c,
      perfettoSpanId: s,
      priorContext: i
    });
    return u;
  }
  function j0a(e, {
    attempt: t,
    clientRequestId: n
  }) {
    let r = {
      attempt: t
    };
    if (n !== undefined) {
      r.client_request_id = n;
    }
    if (e && WG()) {
      e.addEvent("gen_ai.request.attempt", r);
    }
    M0a("LLM Attempt", "api,attempt", r);
  }
  function WIp(e) {
    let t = qIp.extract(Ch.ROOT_CONTEXT, {
      traceparent: e
    }, Ch.defaultTextMapGetter);
    return Ch.trace.getSpanContext(t);
  }
  function Iho(e, t) {
    if (!e) {
      return;
    }
    let n = iMe.get(e);
    if (!n || n.ended) {
      return;
    }
    n.ended = true;
    let r = Math.max(0, Math.round(performance.now() - n.startTime));
    if (n.perfettoSpanId) {
      A0a(n.perfettoSpanId, {
        ttftMs: t?.ttftMs,
        ttltMs: r,
        promptTokens: t?.inputTokens,
        outputTokens: t?.outputTokens,
        cacheReadTokens: t?.cacheReadTokens,
        cacheCreationTokens: t?.cacheCreationTokens,
        success: t?.success,
        error: t?.error,
        requestSetupMs: t?.requestSetupMs,
        attemptStartTimes: t?.attemptStartTimes,
        requestId: t?.requestId,
        clientRequestId: t?.clientRequestId
      });
    }
    if (!WG()) {
      return;
    }
    let o = {
      duration_ms: r
    };
    if (t) {
      if (t.inputTokens !== undefined) {
        o.input_tokens = t.inputTokens;
      }
      if (t.outputTokens !== undefined) {
        o.output_tokens = t.outputTokens;
      }
      if (t.cacheReadTokens !== undefined) {
        o.cache_read_tokens = t.cacheReadTokens;
      }
      if (t.cacheCreationTokens !== undefined) {
        o.cache_creation_tokens = t.cacheCreationTokens;
      }
      if (t.success !== undefined) {
        o.success = t.success;
      }
      if (t.statusCode !== undefined) {
        o.status_code = t.statusCode;
      }
      if (t.error !== undefined) {
        o.error = t.error;
      }
      if (t.attempt !== undefined) {
        o.attempt = t.attempt;
      }
      if (t.hasToolCall !== undefined) {
        o["response.has_tool_call"] = t.hasToolCall;
      }
      if (t.requestId !== undefined) {
        o.request_id = t.requestId;
        o["gen_ai.response.id"] = t.requestId;
      }
      if (t.clientRequestId !== undefined) {
        o.client_request_id = t.clientRequestId;
      }
      if (t.ttftMs !== undefined) {
        o.ttft_ms = t.ttftMs;
      }
      Pya(o, t);
    }
    if (n.span.setAttributes(o), t?.stopReason !== undefined) {
      n.span.setAttribute("stop_reason", t.stopReason);
      n.span.setAttribute("gen_ai.response.finish_reasons", [t.stopReason]);
    }
    if (t?.success === false) {
      n.span.setStatus({
        code: Ch.SpanStatusCode.ERROR,
        message: t.error
      });
    }
    if (t?.traceresponse) {
      let s = WIp(t.traceresponse);
      if (s) {
        n.span.addLink({
          context: s,
          attributes: {
            "link.type": "parent_of"
          }
        });
      }
    }
    n.span.end();
  }
  function q0a(e, t, n, r, o) {
    let s = VTe() ? I0a(e, n) : undefined;
    let i = E$();
    if (!WG()) {
      if (s) {
        let u = Ch.trace.getActiveSpan() || F1().startSpan("dummy");
        aMe(x5e, {
          span: u,
          startTime: performance.now(),
          attributes: {
            "span.type": "tool",
            tool_name: e
          },
          perfettoSpanId: s,
          priorContext: i
        });
        return u;
      }
      return Ch.trace.getActiveSpan() || F1().startSpan("dummy");
    }
    let a = F1();
    let l = A5e("tool", {
      tool_name: e,
      ...n
    });
    let c = a.startSpan("claude_code.tool", {
      attributes: l
    }, i);
    if (t && !qY(t)) {
      if (t.agentId) {
        c.setAttribute("agent_id", t.agentId);
      }
      if (t.parentAgentId) {
        c.setAttribute("parent_agent_id", t.parentAgentId);
      }
    }
    if ($0a(c, o), r) {
      Oya(c, e, r);
    }
    aMe(x5e, {
      span: c,
      startTime: performance.now(),
      attributes: l,
      perfettoSpanId: s,
      priorContext: i
    });
    return c;
  }
  function W0a() {
    let e = VTe() ? O0a("tool_permission") : undefined;
    let t = E$();
    if (!WG()) {
      if (e) {
        let s = Ch.trace.getActiveSpan() || F1().startSpan("dummy");
        aMe(oGt, {
          span: s,
          startTime: performance.now(),
          attributes: {
            "span.type": "tool.blocked_on_user"
          },
          perfettoSpanId: e,
          priorContext: t
        });
        return s;
      }
      return Ch.trace.getActiveSpan() || F1().startSpan("dummy");
    }
    let n = F1();
    let r = A5e("tool.blocked_on_user");
    let o = n.startSpan("claude_code.tool.blocked_on_user", {
      attributes: r
    }, t);
    aMe(oGt, {
      span: o,
      startTime: performance.now(),
      attributes: r,
      perfettoSpanId: e,
      priorContext: t
    });
    return o;
  }
  function aGt(e, t) {
    let n = Tmt(oGt);
    if (!n) {
      return;
    }
    if (n.perfettoSpanId) {
      D0a(n.perfettoSpanId, {
        decision: e,
        source: t
      });
    }
    if (!WG()) {
      lMe(oGt, n);
      return;
    }
    let o = {
      duration_ms: Math.max(0, Math.round(performance.now() - n.startTime))
    };
    if (e) {
      o.decision = e;
    }
    if (t) {
      o.source = t;
    }
    n.span.setAttributes(o);
    n.span.end();
    lMe(oGt, n);
  }
  function G0a(e) {
    let t = E$();
    if (!WG()) {
      return Ch.trace.getActiveSpan() || F1().startSpan("dummy");
    }
    let n = F1();
    let r = A5e("tool.execution");
    let o = n.startSpan("claude_code.tool.execution", {
      attributes: r
    }, t);
    $0a(o, e);
    aMe(kho, {
      span: o,
      startTime: performance.now(),
      attributes: r,
      priorContext: t
    });
    return o;
  }
  function Pho(e) {
    if (!WG()) {
      return;
    }
    let t = Tmt(kho);
    if (!t) {
      return;
    }
    let r = {
      duration_ms: Math.max(0, Math.round(performance.now() - t.startTime))
    };
    if (e) {
      if (e.success !== undefined) {
        r.success = e.success;
      }
      if (e.error !== undefined) {
        r.error = e.error;
      }
    }
    if (t.span.setAttributes(r), e?.success === false) {
      t.span.setStatus({
        code: Ch.SpanStatusCode.ERROR,
        message: e.error
      });
    }
    t.span.end();
    lMe(kho, t);
  }
  function Emt(e, t, n) {
    let r = e ? iMe.get(e) : Tmt(x5e);
    if (!r || r.ended) {
      return;
    }
    if (r.perfettoSpanId) {
      P0a(r.perfettoSpanId, {
        success: true,
        resultTokens: n
      });
    }
    if (!WG()) {
      lMe(x5e, r);
      return;
    }
    let s = {
      duration_ms: Math.max(0, Math.round(performance.now() - r.startTime))
    };
    if (t) {
      let i = r.attributes.tool_name || "unknown";
      Dya(s, i, t);
    }
    if (n !== undefined) {
      s.result_tokens = n;
    }
    r.span.setAttributes(s);
    r.span.end();
    lMe(x5e, r);
  }
  function V0a(e, t) {
    if (!WG() || !$at()) {
      return;
    }
    let n = Tmt(x5e);
    if (!n) {
      return;
    }
    let r = {};
    for (let [o, s] of Object.entries(t)) {
      if (typeof s === "string") {
        let {
          content: i,
          truncated: a
        } = yM(s);
        if (r[o] = i, a) {
          r[`${o}_truncated`] = true;
          r[`${o}_original_length`] = s.length;
        }
      } else {
        r[o] = s;
      }
    }
    n.span.addEvent(e, r);
  }
  function Oho(e) {
    if (!WG()) {
      return;
    }
    let t = e.spanContext();
    if (!t.traceId || t.traceId === "00000000000000000000000000000000") {
      return;
    }
    let n = Ch.trace.setSpan(Ch.context.active(), e);
    let r = {};
    Ch.propagation.inject(n, r);
    return r.traceparent;
  }
  function aqn() {
    if (!WG()) {
      return;
    }
    let e = Ch.trace.getSpan(E$());
    if (!e) {
      return;
    }
    return Oho(e);
  }
  function lGt(e, t) {
    if (!Gde()) {
      return;
    }
    return F1().startSpan(e, {
      attributes: {
        ...RGe(),
        "span.type": t.spanType,
        ...t.attrs
      }
    }, E$());
  }
  async function z0a(e, t, n) {
    let r = lGt(e, t);
    if (!r) {
      return n(undefined);
    }
    let o = Ch.trace.setSpan(E$(), r);
    return WTe.with(o, async () => {
      try {
        return await n(r);
      } catch (s) {
        if (!t.isExpectedError?.(s)) {
          if (s instanceof Error) {
            r.recordException(s);
          }
          k5e(r, s instanceof Error ? s.message : String(s));
        }
        throw s;
      } finally {
        r.end();
      }
    });
  }
  function K0a(e) {
    if (!Gde()) {
      return;
    }
    let t = E$();
    let n = A5e("subagent.spawn", {
      agent_id: e.agentId,
      agent_type: e.agentType,
      ...(e.parentAgentId && {
        parent_agent_id: e.parentAgentId
      })
    });
    let r = F1().startSpan("claude_code.subagent.spawn", {
      attributes: n
    }, t);
    aMe(B0a, {
      span: r,
      startTime: performance.now(),
      attributes: n,
      priorContext: t
    });
    return r;
  }
  function Y0a(e, t) {
    if (!e) {
      return;
    }
    let n = iMe.get(e);
    if (!n || n.ended) {
      return;
    }
    if (t?.success !== undefined) {
      e.setAttribute("success", t.success);
    }
    if (t?.error) {
      e.setAttribute("error", t.error);
      k5e(e, t.error);
    }
    e.end();
    lMe(B0a, n);
  }
  function J0a() {
    return Tx() || Gde();
  }
  function X0a(e, t, n, r) {
    if (!J0a()) {
      return Ch.trace.getActiveSpan() || F1().startSpan("dummy");
    }
    let o = F1();
    let s = E$();
    let {
      content: i
    } = yM(r);
    let a = A5e("hook", {
      hook_event: e,
      hook_name: t,
      num_hooks: n,
      ...(bh() && {
        hook_definitions: i
      })
    });
    let l = o.startSpan("claude_code.hook", {
      attributes: a
    }, s);
    iMe.set(l, {
      span: l,
      startTime: performance.now(),
      attributes: a,
      priorContext: s
    });
    return l;
  }
  function Q0a(e, t) {
    if (!J0a()) {
      return;
    }
    let n = iMe.get(e);
    if (!n || n.ended) {
      return;
    }
    n.ended = true;
    let o = {
      duration_ms: Math.max(0, Math.round(performance.now() - n.startTime))
    };
    if (t) {
      if (t.numSuccess !== undefined) {
        o.num_success = t.numSuccess;
      }
      if (t.numBlocking !== undefined) {
        o.num_blocking = t.numBlocking;
      }
      if (t.numNonBlockingError !== undefined) {
        o.num_non_blocking_error = t.numNonBlockingError;
      }
      if (t.numCancelled !== undefined) {
        o.num_cancelled = t.numCancelled;
      }
    }
    if (n.span.setAttributes(o), t && (t.numNonBlockingError ?? 0) > 0) {
      n.span.setStatus({
        code: Ch.SpanStatusCode.ERROR,
        message: `${t.numNonBlockingError} hook(s) failed`
      });
    }
    n.span.end();
  }
  var Ch;
  var U0a;
  var iMe;
  var sMe;
  var x5e;
  var oGt;
  var kho;
  var B0a;
  var F0a = 0;
  var sGt;
  var qIp;
  var GG = __lazy(() => {
    at();
    Gu();
    _h();
    gn();
    xFn();
    kTe();
    who();
    Smt();
    Ch = __toESM(Ji(), 1);
    U0a = __toESM(Gg(), 1);
    iMe = new WeakMap();
    sMe = Ch.createContextKey("cc.interaction_state");
    x5e = Ch.createContextKey("cc.tool_state");
    oGt = Ch.createContextKey("cc.blocked_state");
    kho = Ch.createContextKey("cc.execution_state");
    B0a = Ch.createContextKey("cc.subagent_state");
    qIp = new U0a.W3CTraceContextPropagator();
  });
  function vmt(e) {
    let t = {
      CLAUDECODE: "1",
      CLAUDE_CODE_SESSION_ID: e.sessionId,
      CLAUDE_CODE_CHILD_SESSION: "1"
    };
    if (e.source === "agent") {
      t.AI_AGENT = tEr("agent");
    }
    if (e.effortLevel !== undefined) {
      t.CLAUDE_EFFORT = e.effortLevel;
    }
    if (shouldPropagateTraceContext()) {
      let n = aqn();
      if (n !== undefined) {
        t.TRACEPARENT = n;
      }
    }
    return t;
  }
  function I5e(e) {
    return {
      sessionId: e.session_id,
      effortLevel: e.effort?.level,
      source: "harness"
    };
  }
  var lqn = __lazy(() => {
    Ds();
    GG();
  });
  function Z0a(e) {
    return GIp(e) + " < /dev/null";
  }
  function GIp(e) {
    return "'" + e.replaceAll("'", `'"'"'`) + "'";
  }
  function Rx() {
    if (!st("true")) {
      return false;
    }
    if (getSearchToolsOptIn()) {
      return false;
    }
    return process.env.CLAUDE_CODE_ENTRYPOINT !== "local-agent";
  }
  function wmt() {
    if (!Rx() || !Pu()) {
      return VIp;
    }
    return zIp;
  }
  var VIp;
  var zIp;
  var jV = __lazy(() => {
    at();
    Fk();
    _x();
    gn();
    Jf();
    VIp = new Set();
    zIp = new Set(["Glob", "Grep"]);
  });
  function cqn(e) {
    return {
      env: e?.env ?? process.env,
      home: e?.homedir ?? process.env.HOME ?? eIa.homedir()
    };
  }
  function uqn(e) {
    let {
      env: t,
      home: n
    } = cqn(e);
    return t.XDG_STATE_HOME ?? cGt.join(n, ".local", "state");
  }
  function tIa(e) {
    let {
      env: t,
      home: n
    } = cqn(e);
    return t.XDG_CACHE_HOME ?? cGt.join(n, ".cache");
  }
  function boe(e) {
    let {
      env: t,
      home: n
    } = cqn(e);
    return t.XDG_DATA_HOME ?? cGt.join(n, ".local", "share");
  }
  function zde(e) {
    let {
      home: t
    } = cqn(e);
    return cGt.join(t, ".local", "bin");
  }
  var eIa;
  var cGt;
  var zTe = __lazy(() => {
    eIa = require("os");
    cGt = require("path");
  });
  function dqn(e) {
    nIa = e;
  }
  function oIa(e) {
    rIa = new Set(e);
  }
  function pqn(e) {
    Dho = e === null ? null : new Set(e);
  }
  function uGt() {
    if (!nIa || Dho === null) {
      return null;
    }
    let e = new Set(Object.keys(subprocessEnv()));
    for (let t of KIp) {
      e.add(t);
    }
    for (let t of rIa) {
      e.add(t);
    }
    for (let t of Dho) {
      e.add(t);
    }
    return e;
  }
  var nIa = false;
  var rIa;
  var Dho = null;
  var KIp;
  var dGt = __lazy(() => {
    s1();
    rIa = new Set();
    KIp = ["SHELL", "GIT_EDITOR", "CLAUDECODE", "AI_AGENT", "CLAUDE_CODE_SESSION_ID", "CLAUDE_CODE_CHILD_SESSION", "TRACEPARENT", "CLAUDE_CODE_EXECPATH", "TMUX", "TMPDIR", "CLAUDE_CODE_TMPDIR", "TMPPREFIX", "BUN_OPTIONS", "TEMP", "TMP", "CLAUDE_EFFORT"];
  });
  function Nho(e, t, n = [], r = []) {
    let o = n.length > 0 ? `${n.join(" ")} \${1+"$@"}` : '${1+"$@"}';
    let s = Wt() === "windows";
    let i = pGt.join(zde(), s ? "claude.exe" : "claude");
    let a = s ? UD(i) : i;
    let l = r.length > 0 ? ["  local _cc_a", '  for _cc_a in ${1+"$@"}; do', `    case "$_cc_a" in ${r.join("|")}) command ${e} \${1+"$@"}; return ;; esac`, "  done"] : [];
    return [`function ${e} {`, ...l, `  local _cc_bin="\${${"CLAUDE_CODE_EXECPATH"}:-}"`, `  [[ -x $_cc_bin ]] || _cc_bin=${Ja([a])}`, `  if [[ ! -x $_cc_bin ]]; then command ${e} \${1+"$@"}; return; fi`, "  if [[ -n ${ZSH_VERSION:-} ]]; then", `    ARGV0=${t} "$_cc_bin" ${o}`, '  elif [[ "$OSTYPE" == "msys" ]] || [[ "$OSTYPE" == "cygwin" ]] || [[ "$OSTYPE" == "win32" ]]; then', `    ARGV0=${t} "$_cc_bin" ${o}`, "  else", `    (exec -a ${t} "$_cc_bin" ${o})`, "  fi", "}"].join(`
`);
  }
  function JIp() {
    let e = i9e();
    if (e.argv0) {
      return {
        type: "function",
        snippet: Nho("rg", e.argv0)
      };
    }
    let t = Ja([e.rgPath]);
    let n = e.rgArgs.map(o => Ja([o]));
    return {
      type: "alias",
      snippet: e.rgArgs.length > 0 ? `${t} ${n.join(" ")}` : t
    };
  }
  function QIp() {
    if (!Rx()) {
      return null;
    }
    return ["unalias find 2>/dev/null || true", "unalias grep 2>/dev/null || true", Nho("find", "bfs", ["-S", "dfs", "-regextype", "findutils-default"]), Nho("grep", "ugrep", ["-G", "--ignore-files", "--hidden", "-I", ...XIp.map(e => `--exclude-dir=${e}`)], ["-*-filter*", "-*-pager*", "-*-view*", "-*-format-open*", "-*-config*", "---*", "-@*", "-*-save-config*", "-[Zz]*", "-[!-]*[Zz]*", "--null", "--null-data"])].join(`
`);
  }
  function ZIp() {
    return null;
  }
  function Lho(e) {
    let t = e.includes("zsh") ? ".zshrc" : e.includes("bash") ? ".bashrc" : ".profile";
    return pGt.join(hqn.homedir(), t);
  }
  function ePp(e) {
    let t = e.endsWith(".zshrc");
    let n = "";
    if (t) {
      n += `
      echo "# Functions" >> "$SNAPSHOT_FILE"

      # Force autoload all functions first
      typeset -f > /dev/null 2>&1

      # Now get user function names - filter completion functions (single underscore prefix)
      # but keep double-underscore helpers (e.g. __zsh_like_cd from mise, __pyenv_init)
      typeset +f | grep -vE '^_[^_]' | while read func; do
        typeset -f "$func" >> "$SNAPSHOT_FILE"
      done
    `;
    } else {
      n += `
      echo "# Functions" >> "$SNAPSHOT_FILE"

      # Force autoload all functions first
      declare -f > /dev/null 2>&1

      # Now get user function names - filter completion functions (single underscore prefix)
      # but keep double-underscore helpers (e.g. __zsh_like_cd from mise, __pyenv_init)
      declare -F | cut -d' ' -f3 | grep -vE '^_[^_]' | while read func; do
        # Encode the function to base64, preserving all special characters
        encoded_func=$(declare -f "$func" | base64 )
        # Write the function definition to the snapshot
        echo "eval ${"\\"}"${"\\"}$(echo '$encoded_func' | base64 -d)${"\\"}" > /dev/null 2>&1" >> "$SNAPSHOT_FILE"
      done
    `;
    }
    if (t) {
      n += `
      echo "# Shell Options" >> "$SNAPSHOT_FILE"
      setopt | sed 's/^/setopt /' | head -n 1000 >> "$SNAPSHOT_FILE"
    `;
    } else {
      n += `
      echo "# Shell Options" >> "$SNAPSHOT_FILE"
      shopt -p | head -n 1000 >> "$SNAPSHOT_FILE"
      set -o | grep "on" | awk '{print "set -o " $1}' | head -n 1000 >> "$SNAPSHOT_FILE"
      echo "shopt -s expand_aliases" >> "$SNAPSHOT_FILE"
    `;
    }
    n += `
      echo "# Aliases" >> "$SNAPSHOT_FILE"
      # Filter out winpty aliases on Windows to avoid "stdin is not a tty" errors
      # Git Bash automatically creates aliases like "alias node='winpty node.exe'" for
      # programs that need Win32 Console in mintty, but winpty fails when there's no TTY
      if [[ "$OSTYPE" == "msys" ]] || [[ "$OSTYPE" == "cygwin" ]]; then
        alias | grep -v "='winpty " | sed 's/^alias //g' | sed 's/^/alias -- /' | head -n 1000 >> "$SNAPSHOT_FILE"
      else
        alias | sed 's/^alias //g' | sed 's/^/alias -- /' | head -n 1000 >> "$SNAPSHOT_FILE"
      fi
  `;
    return n;
  }
  async function tPp(e) {
    let t = process.env.PATH;
    if (Wt() === "windows") {
      let l = await _C(e, ["-lc", 'echo "$PATH"'], {
        reject: false,
        timeout: 1e4
      });
      if (l.exitCode === 0 && l.stdout) {
        t = l.stdout.trim();
      }
    }
    let n = await getEnabledPluginBinPaths();
    if (n.length > 0) {
      let l = Wt() === "windows" ? n.map(UD) : n;
      t = [t, ...l].filter(Boolean).join(":");
    }
    let r = JIp();
    let o = "";
    if (o += `
      # Check for rg availability
      echo "# Check for rg availability" >> "$SNAPSHOT_FILE"
      echo "if ! (unalias rg 2>/dev/null; command -v rg) >/dev/null 2>&1; then" >> "$SNAPSHOT_FILE"
  `, r.type === "function") {
      o += `
      cat >> "$SNAPSHOT_FILE" << 'RIPGREP_FUNC_END'
  ${r.snippet}
RIPGREP_FUNC_END
    `;
    } else {
      let l = r.snippet.replaceAll("'", "'\\''");
      o += `
      echo '  alias rg='"'${l}'" >> "$SNAPSHOT_FILE"
    `;
    }
    o += `
      echo "fi" >> "$SNAPSHOT_FILE"
  `;
    let s = QIp();
    if (s !== null) {
      o += `
      # Shadow find/grep with embedded bfs/ugrep (ant-native only)
      echo "# Shadow find/grep with embedded bfs/ugrep" >> "$SNAPSHOT_FILE"
      cat >> "$SNAPSHOT_FILE" << 'FIND_GREP_FUNC_END'
${s}
FIND_GREP_FUNC_END
    `;
    }
    let i = ZIp();
    if (i !== null) {
      o += `
      echo "# Shadow bq to label query jobs with source=claude_code" >> "$SNAPSHOT_FILE"
      cat >> "$SNAPSHOT_FILE" << 'BQ_FUNC_END'
${i}
BQ_FUNC_END
    `;
    }
    let a = `PATH_END_${Math.random().toString(36).substring(2, 18)}`;
    o += `

      # Add PATH to the file
      cat >> "$SNAPSHOT_FILE" << '${a}'
export PATH=${Ja([t || ""])}
${a}
  `;
    return o;
  }
  async function nPp(e, t, n) {
    let r = Lho(e);
    let o = r.endsWith(".zshrc");
    let s = n ? ePp(r) : !o ? 'echo "shopt -s expand_aliases" >> "$SNAPSHOT_FILE"' : "";
    let i = await tPp(e);
    return `SNAPSHOT_FILE=${Ja([t])}
      ${n ? `source "${r}" < /dev/null` : "# No user config file to source"}

      # First, create/clear the snapshot file
      echo "# Snapshot file" >| "$SNAPSHOT_FILE"

      # When this file is sourced, we first unalias to avoid conflicts
      # This is necessary because aliases get "frozen" inside function definitions at definition time,
      # which can cause unexpected behavior when functions use commands that conflict with aliases
      echo "# Unset all aliases to avoid conflicts with functions" >> "$SNAPSHOT_FILE"
      echo "unalias -a 2>/dev/null || true" >> "$SNAPSHOT_FILE"

      ${s}

      ${i}

      # Exit silently on success, only report errors
      if [ ! -f "$SNAPSHOT_FILE" ]; then
        echo "Error: Snapshot file was not created at $SNAPSHOT_FILE" >&2
        exit 1
      fi
    `;
  }
  async function aIa(e) {
    try {
      let t = await _C(e, ["-c", "env"], {
        reject: false,
        timeout: 1e4,
        maxBuffer: 1048576,
        env: {
          ...(process.env.CLAUDE_CODE_DONT_INHERIT_ENV ? {} : subprocessEnv()),
          SHELL: e,
          GIT_EDITOR: "true",
          CLAUDECODE: "1"
        }
      });
      if (t.exitCode !== 0 || !t.stdout) {
        logForDebugging(`Spawn-env probe failed: exit=${t.exitCode} stderr=${t.stderr?.slice(0, 200)}`);
        pqn(null);
        return;
      }
      let n = [];
      for (let r of t.stdout.split(`
`)) {
        let o = r.match(rPp);
        if (o) {
          n.push(o[1]);
        }
      }
      logForDebugging(`Spawn-env probe captured ${n.length} keys`);
      pqn(n);
    } catch (t) {
      logForDebugging(`Spawn-env probe error: ${t}`);
      pqn(null);
    }
  }
  var sIa;
  var fqn;
  var hqn;
  var pGt;
  var XIp;
  var iIa = async e => {
    let t = e.includes("zsh") ? "zsh" : e.includes("bash") ? "bash" : "sh";
    logForDebugging(`Creating shell snapshot for ${t} (${e})`);
    return new Promise(async n => {
      try {
        let r = Lho(e);
        logForDebugging(`Looking for shell config file: ${r}`);
        let o = await ad(r);
        if (!o) {
          logForDebugging(`Shell config file not found: ${r}, creating snapshot with Claude Code defaults only`);
        }
        let s = Date.now();
        let i = Math.random().toString(36).substring(2, 8);
        let a = pGt.join(er(), "shell-snapshots");
        logForDebugging(`Snapshots directory: ${a}`);
        let l = pGt.join(a, `snapshot-${t}-${s}-${i}.sh`);
        await fqn.mkdir(a, {
          recursive: true
        });
        let c = await nPp(e, l, o);
        logForDebugging(`Creating snapshot at: ${l}`);
        logForDebugging(`Execution timeout: ${1e4}ms`);
        sIa.execFile(e, ["-c", "-l", c], {
          env: {
            ...(process.env.CLAUDE_CODE_DONT_INHERIT_ENV ? {} : subprocessEnv()),
            SHELL: e,
            GIT_EDITOR: "true",
            CLAUDECODE: "1"
          },
          timeout: 1e4,
          maxBuffer: 1048576,
          encoding: "utf8",
          windowsHide: true
        }, async (u, d, p) => {
          if (u) {
            let m = u;
            if (logForDebugging(`Shell snapshot creation failed: ${u.message}`), logForDebugging("Error details:"), logForDebugging(`  - Error code: ${m?.code}`), logForDebugging(`  - Error signal: ${m?.signal}`), logForDebugging(`  - Error killed: ${m?.killed}`), logForDebugging(`  - Shell path: ${e}`), logForDebugging(`  - Config file: ${Lho(e)}`), logForDebugging(`  - Config file exists: ${o}`), logForDebugging(`  - Working directory: ${Nt()}`), logForDebugging(`  - Claude home: ${er()}`), logForDebugging(`Full snapshot script:
${c}`), d) {
              logForDebugging(`stdout output (${d.length} chars):
${d}`);
            } else {
              logForDebugging("No stdout output captured");
            }
            if (p) {
              logForDebugging(`stderr output (${p.length} chars): ${p}`);
            } else {
              logForDebugging("No stderr output captured");
            }
            logForDebugging(`Failed to create shell snapshot: ${u.message}`, {
              level: "error"
            });
            let f = m?.signal ? hqn.constants.signals[m.signal] : undefined;
            logEvent("tengu_shell_snapshot_failed", {
              stderr_length: p?.length || 0,
              has_error_code: !!m?.code,
              error_signal_number: f,
              error_killed: m?.killed
            });
            n(undefined);
          } else {
            let m;
            try {
              m = (await fqn.stat(l)).size;
            } catch {}
            if (m !== undefined) {
              logForDebugging(`Shell snapshot created successfully (${m} bytes)`);
              Ti(async () => {
                try {
                  await zt().unlink(l);
                  logForDebugging(`Cleaned up session snapshot: ${l}`);
                } catch (f) {
                  logForDebugging(`Error cleaning up session snapshot: ${f}`);
                }
              });
              n(l);
            } else {
              logForDebugging(`Shell snapshot file not found after creation: ${l}`);
              logForDebugging(`Checking if parent directory still exists: ${a}`);
              try {
                let f = await zt().readdir(a);
                logForDebugging(`Directory contains ${f.length} files`);
              } catch {
                logForDebugging(`Parent directory does not exist or is not accessible: ${a}`);
              }
              logEvent("tengu_shell_unknown_error", {});
              n(undefined);
            }
          }
        });
      } catch (r) {
        if (logForDebugging(`Unexpected error during snapshot creation: ${r}`, {
          level: "error"
        }), r instanceof Error) {
          logForDebugging(`Error stack trace: ${r.stack}`);
        }
        logEvent("tengu_shell_snapshot_error", {});
        n(undefined);
      }
    });
  };
  var rPp;
  var lIa = __lazy(() => {
    Ot();
    hd();
    vo();
    je();
    jV();
    pr();
    gn();
    Zl();
    Cs();
    xg();
    eoe();
    oF();
    s1();
    wj();
    zTe();
    dGt();
    sIa = require("child_process");
    fqn = require("fs/promises");
    hqn = __toESM(require("os"));
    pGt = require("path");
    XIp = [".git", ".svn", ".hg", ".bzr", ".jj", ".sl"];
    rPp = /^([A-Za-z_][A-Za-z0-9_]*)=/;
  });
  function gqn(e, t) {
    let n = e.lastIndexOf(" -");
    if (n > 0) {
      let r = e.substring(0, n);
      let o = e.substring(n + 1);
      return `${Ja([r])} ${o} ${Ja([t])}`;
    } else {
      return `${Ja([e])} ${Ja([t])}`;
    }
  }
  var Bho = () => {};
  function $ho(e) {
    if (/\d\s*<<\s*\d/.test(e) || /\[\[\s*\d+\s*<<\s*\d+\s*\]\]/.test(e) || /\$\(\(.*<<.*\)\)/.test(e)) {
      return false;
    }
    return /<<-?\s*(?:(['"]?)(\w+)\1|\\(\w+))/.test(e);
  }
  function oPp(e) {
    let t = /'(?:[^'\\]|\\.)*\n(?:[^'\\]|\\.)*'/;
    let n = /"(?:[^"\\]|\\.)*\n(?:[^"\\]|\\.)*"/;
    return t.test(e) || n.test(e);
  }
  function cIa(e, t = true) {
    if ($ho(e) || oPp(e)) {
      let o = `'${e.replaceAll("'", `'"'"'`)}'`;
      if ($ho(e)) {
        return o;
      }
      return t ? `${o} < /dev/null` : o;
    }
    let n = Ja([e]);
    return t ? `${n} < /dev/null` : n;
  }
  function sPp(e) {
    return /(?:^|[\s;&|])<(?![<(])\s*\S+/.test(e);
  }
  function uIa(e) {
    if ($ho(e)) {
      return false;
    }
    if (sPp(e)) {
      return false;
    }
    return true;
  }
  function dIa(e) {
    if (e.includes("<") || e.includes("$") || e.includes("`")) {
      return e;
    }
    return e.replace(iPp, "$1/dev/null");
  }
  var iPp;
  var pIa = __lazy(() => {
    iPp = /(\d?&?>+[ \t]*)[Nn][Uu][Ll](?=\s|$|[|&;)\n])/g;
  });
  function aPp(e) {
    if (process.env.CLAUDE_CODE_SHELL_PREFIX) {
      return "{ shopt -u extglob || setopt NO_EXTENDED_GLOB NO_BARE_GLOB_QUAL; } >/dev/null 2>&1 || true";
    }
    if (e.includes("bash")) {
      return "shopt -u extglob 2>/dev/null || true";
    } else if (e.includes("zsh")) {
      return "setopt NO_EXTENDED_GLOB NO_BARE_GLOB_QUAL 2>/dev/null || true";
    }
    return null;
  }
  async function hIa(e, t) {
    let n;
    let r = t?.skipSnapshot ? Promise.resolve(undefined) : iIa(e).then(i => (Pe("shell_snapshot_create"), dqn(i !== undefined), i)).catch(i => {
      logForDebugging(`Failed to create shell snapshot: ${i}`);
      Et("shell_snapshot_create", "snapshot_failed");
      dqn(false);
      return;
    });
    if (!t?.skipSnapshot) {
      aIa(e).catch(() => {});
    }
    let o;
    let s = false;
    return {
      type: "bash",
      shellPath: e,
      detached: true,
      async buildExecCommand(i, a) {
        let l = await r;
        if (l) {
          try {
            await mIa.access(l);
          } catch {
            if (logForDebugging(`Snapshot file missing, falling back to login shell: ${l}`), !s) {
              s = true;
              Et("shell_snapshot_create", "snapshot_missing_at_exec");
            }
            l = undefined;
          }
        }
        o = l;
        dqn(l !== undefined);
        n = a.sandboxTmpDir;
        let c = F2();
        let u = Wt() === "windows";
        let d = u ? UD(c) : c;
        let p = a.useSandbox && a.sandboxTmpDir;
        let m = p ? mGt.join(a.sandboxTmpDir, `cwd-${a.id}`) : mGt.join(d, `claude-${a.id}-cwd`);
        let f = p ? mGt.join(a.sandboxTmpDir, `cwd-${a.id}`) : fIa.join(c, `claude-${a.id}-cwd`);
        let h = dIa(i);
        let g = uIa(h);
        let y = cIa(h, g);
        if (h.includes("|") && g) {
          y = Z0a(h);
        }
        let _ = [];
        if (l) {
          let C = Wt() === "windows" ? UD(l) : l;
          _.push(`source ${Ja([C])} 2>/dev/null || true`);
        }
        if (u) {
          _.push(`export TEMP=${Ja([c])} TMP=${Ja([c])}`);
        }
        let b = await tya();
        if (b) {
          _.push(`${b}
:`);
        }
        if (st(process.env.CLAUDE_CODE_REMOTE)) {
          _.push('export BUN_OPTIONS="--smol${BUN_OPTIONS:+ $BUN_OPTIONS}"');
        }
        let S = aPp(e);
        if (S) {
          _.push(S);
        }
        _.push(`eval ${y}`);
        _.push(`pwd -P >| ${Ja([m])}`);
        let E = _.join(" && ");
        if (process.env.CLAUDE_CODE_SHELL_PREFIX) {
          E = gqn(process.env.CLAUDE_CODE_SHELL_PREFIX, E);
        }
        return {
          commandString: E,
          cwdFilePath: f
        };
      },
      getSpawnArgs(i) {
        let a = o !== undefined;
        if (a) {
          logForDebugging("Spawning shell without login (-l flag skipped)");
        }
        return ["-c", ...(a ? [] : ["-l"]), i];
      },
      async getEnvironmentOverrides(i, a) {
        let l = null;
        let c = {};
        if (c["CLAUDE_CODE_EXECPATH"] = process.execPath, l) {
          c.TMUX = l;
        }
        if (a) {
          for (let [u, d] of a) {
            c[u] = d;
          }
        }
        if (n) {
          let u = n;
          if (Wt() === "windows") {
            u = UD(u);
          }
          c.TMPDIR = u;
          c.CLAUDE_CODE_TMPDIR = pT();
          c.TMPPREFIX = mGt.join(u, "zsh");
        }
        return c;
      }
    };
  }
  var mIa;
  var fIa;
  var mGt;
  var gIa = __lazy(() => {
    at();
    ln();
    lIa();
    Bho();
    pIa();
    dGt();
    je();
    gn();
    Cs();
    K9e();
    BC();
    wj();
    mIa = require("fs/promises");
    fIa = require("path");
    mGt = require("path/posix");
  });
  async function fGt(e) {
    try {
      return (await P5e.stat(e)).isFile() ? e : null;
    } catch {
      return null;
    }
  }
  async function lPp(e) {
    let t;
    try {
      t = await P5e.readlink(e);
    } catch {
      return null;
    }
    return fGt(t);
  }
  async function cPp() {
    let e = await Qm("pwsh");
    if (e) {
      if (Wt() === "linux") {
        let n = await P5e.realpath(e).catch(() => e);
        if (e.startsWith("/snap/") || n.startsWith("/snap/")) {
          let r = (await fGt("/opt/microsoft/powershell/7/pwsh")) ?? (await fGt("/usr/bin/pwsh"));
          if (r) {
            let o = await P5e.realpath(r).catch(() => r);
            if (!r.startsWith("/snap/") && !o.startsWith("/snap/")) {
              Et("shell_powershell_detect", "snap_workaround");
              return r;
            }
          }
        }
      }
      Pe("shell_powershell_detect");
      return e;
    }
    if (Wt() === "windows") {
      let n = process.env.ProgramFiles;
      let r = process.env.LOCALAPPDATA;
      let o = process.env.USERPROFILE;
      let s = (n ? await fGt(yqn.join(n, "PowerShell", "7", "pwsh.exe")) : null) ?? (r ? await lPp(yqn.join(r, "Microsoft", "WindowsApps", "pwsh.exe")) : null) ?? (o ? await fGt(yqn.join(o, ".dotnet", "tools", "pwsh.exe")) : null);
      if (s) {
        Et("shell_powershell_detect", "windows_fallback_path");
        return s;
      }
    }
    let t = await Qm("powershell");
    if (t) {
      Et("shell_powershell_detect", "fell_back_to_powershell_5");
      return t;
    }
    return null;
  }
  function qV() {
    if (!Hho) {
      Hho = cPp();
    }
    return Hho;
  }
  async function hGt() {
    let e = await qV();
    if (!e) {
      return null;
    }
    return e.split(/[/\\]/).pop().toLowerCase().replace(/\.exe$/, "") === "pwsh" ? "core" : "desktop";
  }
  var P5e;
  var yqn;
  var Hho = null;
  var cMe = __lazy(() => {
    ln();
    Cs();
    P5e = require("fs/promises");
    yqn = require("path");
  });
  function SIa() {
    let e = ["-NoProfile", "-NonInteractive"];
    if (!st(process.env.CLAUDE_CODE_POWERSHELL_RESPECT_EXECUTION_POLICY)) {
      e.push("-ExecutionPolicy", "Bypass");
    }
    return e;
  }
  function gGt(e) {
    return [...SIa(), "-Command", e];
  }
  function uPp(e) {
    return Buffer.from(e, "utf16le").toString("base64");
  }
  function TIa(e) {
    let t;
    return {
      type: "powershell",
      shellPath: e,
      detached: false,
      async buildExecCommand(n, r) {
        t = r.useSandbox ? r.sandboxTmpDir : undefined;
        let o;
        if (r.useSandbox && r.sandboxTmpDir) {
          o = bIa.join(r.sandboxTmpDir, `claude-pwd-ps-${r.id}`);
        } else {
          let c = pT();
          await yIa.mkdir(c, {
            recursive: true,
            mode: 448
          }).catch(() => {});
          o = _Ia.join(c, `claude-pwd-ps-${r.id}`);
        }
        let i = `
; $_ec = if ($null -ne $LASTEXITCODE) { $LASTEXITCODE } elseif ($?) { 0 } else { 1 }
; (Get-Location).Path | Out-File -FilePath ${Xct(o, "the temp-directory path (override with CLAUDE_CODE_TMPDIR)")} -Encoding utf8 -NoNewline
; if ($ExecutionContext.SessionState.LanguageMode -eq 'FullLanguage') { $host.SetShouldExit($_ec) } else { exit $_ec }`;
        let a = n + i;
        return {
          commandString: r.useSandbox ? [`'${e.replace(/'/g, "'\\''")}'`, ...SIa(), "-EncodedCommand", uPp(a)].join(" ") : a,
          cwdFilePath: o
        };
      },
      getSpawnArgs(n) {
        return gGt(n);
      },
      async getEnvironmentOverrides(n, r) {
        let o = {};
        if (r) {
          for (let [s, i] of r) {
            o[s] = i;
          }
        }
        if (t) {
          o.TMPDIR = t;
          o.CLAUDE_CODE_TMPDIR = pT();
        }
        return o;
      }
    };
  }
  var yIa;
  var _Ia;
  var bIa;
  var _qn = __lazy(() => {
    gn();
    BC();
    _jt();
    yIa = require("fs/promises");
    _Ia = require("path");
    bIa = require("path/posix");
  });
  async function jho(e) {
    try {
      CIa.accessSync(e, KTe.constants.X_OK);
      return true;
    } catch (t) {
      let {
        code: n
      } = await execFileNoThrow(e, ["--version"], {
        timeout: 1000,
        useCwd: false
      });
      return n === 0;
    }
  }
  async function pPp() {
    let e = process.env.CLAUDE_CODE_SHELL;
    if (e) {
      if ((e.includes("bash") || e.includes("zsh")) && (await jho(e))) {
        logForDebugging(`Using shell override: ${e}`);
        return e;
      } else {
        logForDebugging(`CLAUDE_CODE_SHELL="${e}" is not a valid bash/zsh path, falling back to detection`);
      }
    }
    let t = process.env.SHELL;
    let n = t && (t.includes("bash") || t.includes("zsh"));
    let r = t?.includes("bash");
    let [o, s] = await Promise.all([Qm("zsh"), Qm("bash")]);
    let i = ["/bin", "/usr/bin", "/usr/local/bin", "/opt/homebrew/bin"];
    let l = (r ? ["bash", "zsh"] : ["zsh", "bash"]).flatMap(u => i.map(d => `${d}/${u}`));
    if (r) {
      if (s) {
        l.unshift(s);
      }
      if (o) {
        l.push(o);
      }
    } else {
      if (o) {
        l.unshift(o);
      }
      if (s) {
        l.push(s);
      }
    }
    if (n && (await jho(t))) {
      l.unshift(t);
    }
    let c;
    for (let u of l) {
      if (u && (await jho(u))) {
        c = u;
        break;
      }
    }
    if (!c) {
      let u = "No suitable shell found. Claude CLI requires a Posix shell environment. Please ensure you have a valid shell installed and the SHELL environment variable set.";
      throw logForDebugging(u, {
        level: "error"
      }), Error(u);
    }
    return c;
  }
  async function mPp() {
    let e = await pPp();
    return {
      provider: await hIa(e)
    };
  }
  async function Who() {
    try {
      let {
        provider: e
      } = await qho();
      return xhn(e.shellPath);
    } catch {
      return "none";
    }
  }
  function RIa() {
    qho.cache?.clear?.();
  }
  async function Kde(e, t, n, r) {
    let {
      timeout: o,
      onProgress: s,
      preventCwdChanges: i,
      shouldUseSandbox: a,
      shouldAutoBackground: l,
      onStdout: c,
      sessionEnvVars: u,
      effortLevel: d
    } = r ?? {};
    let p = o || 1800000;
    let m = await hPp[n]();
    let f = Math.floor(Math.random() * 65536).toString(16).padStart(4, "0");
    let h = a && getEffectiveFilesystemPolicy() !== "relaxed" ? rlt() : undefined;
    if (h !== undefined && !EIa) {
      let H = pT();
      if (h !== H) {
        EIa = true;
        logForDebugging(`CLAUDE_CODE_TMPDIR makes the per-uid temp dir ${Buffer.byteLength(H)} bytes, too long for AF_UNIX sockets; child-process $TMPDIR falls back to ${h}. ` + "Shorten CLAUDE_CODE_TMPDIR to \u2264~30 bytes if child processes should use your override.", {
          level: "warn"
        });
      }
    }
    let {
      commandString: g,
      cwdFilePath: y
    } = await m.buildExecCommand(e, {
      id: f,
      sandboxTmpDir: h,
      useSandbox: a ?? false
    });
    let _ = g;
    let b = Vhn();
    let S = false;
    try {
      await O5e.realpath(b);
    } catch (H) {
      S = fn(H);
    }
    if (S) {
      let H = [getOriginalCwd(), wIa.homedir(), F2()];
      let U = null;
      let N = -1;
      for (let [W, j] of H.entries()) {
        try {
          U = await O5e.realpath(j);
          N = W;
          break;
        } catch {}
      }
      if (U === null) {
        return bqn(`Working directory "${b}" no longer exists. Please restart Claude from an existing directory.`);
      }
      if (logForDebugging(`Shell CWD "${b}" no longer exists, recovering to "${U}"`), OMr(U), N > 0) {
        return bqn(`Working directory "${b}" was deleted; shell cwd recovered to "${U}". Re-issue your command (it will run from the recovered directory).`);
      }
      b = U;
    }
    if (t.aborted) {
      return xIa();
    }
    let E = m.shellPath;
    let C = a && n === "powershell";
    let x = C ? "/bin/sh" : E;
    if (isScrubEnabled()) {
      let H = await wdt(e);
      enforceScriptCaps(H.kind === "simple" ? H.commands.map(U => U.text).join(`
`) : e);
    }
    if (a) {
      let H;
      if (isScrubEnabled() && isScrubSandboxAvailable()) {
        let U = scrubSandboxConfig();
        let N = U.filesystem.denyWrite;
        let W = U.filesystem.allowWrite;
        let j = SandboxManager.getFsWriteConfig();
        let z = SandboxManager.getConfig()?.filesystem;
        let V = z?.allowWrite ?? [];
        let K = Ro([...W, ...V.filter(Q => Q !== "/" && Q.length > 0)]);
        let J = j.denyWithinAllow.filter(Q => K.some(Z => Q === Z || Q.startsWith(`${Z}/`)) && !N.some(Z => Q === Z || Q.startsWith(`${Z}/`)));
        H = {
          ...U,
          filesystem: {
            allowWrite: K,
            denyWrite: Ro([...N, ...J]),
            denyRead: Ro([...U.filesystem.denyRead, ...(z?.denyRead ?? [])])
          }
        };
      }
      if (h && !process.env.CLAUDE_TMPDIR) {
        process.env.CLAUDE_TMPDIR = h;
      }
      _ = await SandboxManager.wrapWithSandbox(_, x, H, t);
    }
    let A = C ? "/bin/sh" : E;
    let k = C ? ["-c", _] : m.getSpawnArgs(_);
    let I = await m.getEnvironmentOverrides(e, u);
    let O = !!c;
    let M = TU("local_bash");
    let L = new Db(M, s ?? null, !O);
    await O5e.mkdir(getTaskOutputDir(), {
      recursive: true
    });
    let P;
    let F;
    if (!O) {
      let H = KTe.constants.O_NOFOLLOW ?? 0;
      P = await O5e.open(L.path, KTe.constants.O_WRONLY | KTe.constants.O_CREAT | KTe.constants.O_APPEND | H);
    }
    try {
      F = a ? await dua() : undefined;
      let H = vIa.spawn(A, k, {
        env: {
          ...subprocessEnv(),
          SHELL: n === "bash" ? E : undefined,
          GIT_EDITOR: "true",
          ...I,
          ...vmt({
            sessionId: getSessionId(),
            effortLevel: d,
            source: "agent"
          })
        },
        cwd: b,
        stdio: gPp(O, P?.fd, F),
        detached: m.detached,
        windowsHide: true
      });
      let U = Tqn(H, t, p, L, l);
      let N = lGt("claude_code.bash.subprocess", {
        spanType: "bash.subprocess",
        attrs: {
          "shell.type": n,
          command_length: e.length,
          timeout_ms: p,
          command: yM(e).content
        }
      });
      if (N) {
        let j = S0a(e).catch(() => []);
        U.result.then(async z => {
          let V = await j;
          if (V.length > 0) {
            iGt(N, {
              command_prefix: V.map(K => yM(K).content)
            });
          }
          if (iGt(N, {
            exit_code: z.code,
            stdout_bytes: z.outputFileSize ?? Buffer.byteLength(z.stdout),
            stderr_bytes: Buffer.byteLength(z.stderr),
            interrupted: z.interrupted,
            ...(z.backgroundTaskId && {
              backgrounded: true
            })
          }), z.interrupted) {
            k5e(N, `interrupted (exit ${z.code})`);
          }
        }).catch(z => {
          k5e(N, he(z));
        }).finally(() => N.end()).catch(() => {});
      }
      if (P !== undefined) {
        try {
          await P.close();
        } catch {}
      }
      if (F !== undefined) {
        try {
          KTe.closeSync(F);
        } catch {}
      }
      if (H.stdout && c) {
        H.stdout.on("data", j => {
          c(typeof j === "string" ? j : j.toString());
        });
      }
      let W = Wt() === "windows" ? nje(y) : y;
      U.result = U.result.then(async j => {
        if (a) {
          try {
            SandboxManager.cleanupAfterCommand();
          } catch (z) {
            logForDebugging(`sandbox cleanupAfterCommand failed: ${z}`, {
              level: "warn"
            });
          }
        }
        if (j && !i && !j.backgroundTaskId) {
          try {
            let z = (await zt().readFile(W, {
              encoding: "utf8"
            })).trim();
            if (Wt() === "windows") {
              z = nje(z);
            }
            if (z !== b) {
              if (By(z, b), !XHe()) {
                Rpt();
                oya(b, z);
              }
            }
          } catch {
            logEvent("tengu_shell_set_cwd", {
              success: false
            });
          }
        }
        try {
          await zt().unlink(W);
        } catch {}
        return j;
      });
      return U;
    } catch (H) {
      if (P !== undefined) {
        try {
          await P.close();
        } catch {}
      }
      if (F !== undefined) {
        try {
          KTe.closeSync(F);
        } catch {}
      }
      L.clear();
      logForDebugging(`Shell exec error: ${he(H)}`);
      return bqn(he(H));
    }
  }
  function By(e, t) {
    let n = Sqn.isAbsolute(e) ? e : Sqn.resolve(t || zt().cwd(), e);
    let r;
    try {
      r = zt().realpathSync(n);
    } catch (o) {
      if (fn(o)) {
        throw Error(`Path "${n}" does not exist`);
      }
      r = n;
    }
    OMr(r);
    try {
      logEvent("tengu_shell_set_cwd", {
        success: true
      });
    } catch (o) {}
  }
  function Gho(e, t) {
    addSandboxAllowWriteDirectory(e, t);
  }
  function gPp(e, t, n) {
    let r = e ? ["pipe", "pipe", "pipe"] : ["pipe", t, t];
    if (n !== undefined) {
      r[3] = n;
    }
    return r;
  }
  var vIa;
  var KTe;
  var O5e;
  var wIa;
  var Sqn;
  var CIa;
  var EIa = false;
  var qho;
  var fPp;
  var hPp;
  var U1 = __lazy(() => {
    Ot();
    at();
    Cx();
    mm();
    vo();
    je();
    dt();
    ji();
    Eqn();
    cE();
    w5e();
    BC();
    noe();
    vho();
    lqn();
    pr();
    q4t();
    Cs();
    Th();
    Olo();
    K9e();
    gIa();
    cMe();
    _qn();
    s1();
    kTe();
    GG();
    wj();
    vIa = require("child_process");
    KTe = require("fs");
    O5e = require("fs/promises");
    wIa = require("os");
    Sqn = require("path");
    CIa = require("fs");
    qho = TEr(mPp);
    fPp = TEr(async () => {
      let e = await qV();
      if (!e) {
        throw Error("PowerShell is not available");
      }
      return TIa(e);
    });
    hPp = {
      bash: async () => (await qho()).provider,
      powershell: fPp
    };
  });
  function VI(e = v.boolean()) {
    return v.preprocess(t => t === "true" ? true : t === "false" ? false : t, e);
  }
  var uMe = __lazy(() => {});
  function v$(e = v.number()) {
    return v.preprocess(t => {
      if (typeof t === "string") {
        let n = t.trim();
        if (/^[-+]?\d+(\.\d+)?$/.test(n)) {
          let r = Number(n);
          if (Number.isFinite(r)) {
            return r;
          }
        }
      }
      return t;
    }, e);
  }
  var Cmt = __lazy(() => {});
  var kIa;
  var dMe;
  var yGt = __lazy(() => {
    kIa = __toESM(ot(), 1);
    dMe = kIa.createContext(false);
  });
  function _Gt(e) {
    let t = zho.c(2);
    let {
      children: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = vqn.jsx(IIa.Provider, {
        value: true,
        children: n
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  function wv() {
    let e = zho.c(3);
    let t = Vho.useContext(IIa);
    let n = Vho.useContext(dMe);
    let r = NI("app:toggleTranscript", "Global", "ctrl+o");
    if (t || n) {
      return null;
    }
    let o;
    if (e[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = {
        keyCase: "lower"
      };
      e[0] = o;
    } else {
      o = e[0];
    }
    let s;
    if (e[1] !== r) {
      s = vqn.jsx(Text, {
        dimColor: true,
        children: vqn.jsx(xt, {
          chord: r,
          action: "expand",
          parens: true,
          format: o
        })
      });
      e[1] = r;
      e[2] = s;
    } else {
      s = e[2];
    }
    return s;
  }
  function PIa() {
    let e = dx("app:toggleTranscript", "Global", "ctrl+o");
    return _$u.dim(`(${e} to expand)`);
  }
  var zho;
  var AIa;
  var Vho;
  var vqn;
  var IIa;
  var Xq = __lazy(() => {
    et();
    kre();
    eOe();
    bs();
    yGt();
    zho = __toESM(pt(), 1);
    AIa = __toESM(ot(), 1);
    Vho = __toESM(ot(), 1);
    vqn = __toESM(ie(), 1);
    IIa = AIa.createContext(false);
  });
  function B1(e) {
    let t = OIa.c(8);
    let {
      count: n,
      unit: r,
      expandable: o
    } = e;
    let s = r === undefined ? "line" : r;
    let i = o === undefined ? false : o;
    if (n <= 0) {
      return null;
    }
    let a;
    if (t[0] !== n || t[1] !== s) {
      a = bGt(n, s);
      t[0] = n;
      t[1] = s;
      t[2] = a;
    } else {
      a = t[2];
    }
    let l;
    if (t[3] !== i) {
      l = i && M5e.jsxs(M5e.Fragment, {
        children: [" ", M5e.jsx(wv, {})]
      });
      t[3] = i;
      t[4] = l;
    } else {
      l = t[4];
    }
    let c;
    if (t[5] !== a || t[6] !== l) {
      c = M5e.jsxs(Text, {
        dimColor: true,
        children: [a, l]
      });
      t[5] = a;
      t[6] = l;
      t[7] = c;
    } else {
      c = t[7];
    }
    return c;
  }
  function bGt(e, t = "line") {
    if (e <= 0) {
      return "";
    }
    return `\u2026 +${e} ${un(e, t)}`;
  }
  var OIa;
  var M5e;
  var YX = __lazy(() => {
    et();
    Zn();
    Xq();
    OIa = __toESM(pt(), 1);
    M5e = __toESM(ie(), 1);
  });
  function _Pp(e, t) {
    let n = e.split(`
`);
    let r = [];
    for (let s of n) {
      let i = an(s);
      if (i <= t) {
        r.push(s.trimEnd());
      } else {
        let a = 0;
        while (a < i) {
          let l = KF(s, a, a + t);
          r.push(l.trimEnd());
          a += t;
        }
      }
    }
    let o = r.length - 3;
    if (o === 1) {
      return {
        aboveTheFold: r.slice(0, 3 + 1).join(`
`).trimEnd(),
        remainingLines: 0
      };
    }
    return {
      aboveTheFold: r.slice(0, 3).join(`
`).trimEnd(),
      remainingLines: Math.max(0, o)
    };
  }
  function MIa(e, t, n = false) {
    let r = e.trimEnd();
    if (!r) {
      return "";
    }
    let o = Math.max(t - 10, 10);
    let s = 3 * o * 4;
    let i = r.length > s;
    let a = i ? r.slice(0, s) : r;
    let {
      aboveTheFold: l,
      remainingLines: c
    } = _Pp(a, o);
    let u = c;
    if (i) {
      let d = 0;
      let p = -1;
      for (;;) {
        if (p = r.indexOf(`
`, p + 1), p === -1) {
          break;
        }
        d++;
      }
      let m = Math.max(d + 1, Math.ceil(r.length / o));
      u = Math.max(c, m - 3);
    }
    return [l, u > 0 ? _$u.dim(bGt(u) + (n ? "" : ` ${PIa()}`)) : ""].filter(Boolean).join(`
`);
  }
  function EU(e, t) {
    if (typeof e !== "string") {
      return false;
    }
    let n = e.trimEnd();
    let r = 0;
    let o = 0;
    for (let c = 0; c <= 3; c++) {
      if (r = n.indexOf(`
`, r), r === -1) {
        break;
      }
      o++;
      r++;
    }
    if (r !== -1 && r < n.length) {
      return true;
    }
    if (t === undefined) {
      return false;
    }
    let s = Math.max(t - 10, 10);
    let i = 3 + 1;
    let a = 3 * s * 4;
    if (n.length > a) {
      return true;
    }
    if (o === 0) {
      let c = i * s;
      if (n.length <= c) {
        return false;
      }
      return an(n) > c;
    }
    let l = 0;
    for (let c of n.split(`
`)) {
      if (l += Math.max(1, Math.ceil(an(c) / s)), l > i) {
        return true;
      }
    }
    return false;
  }
  var mMe = __lazy(() => {
    Xq();
    YX();
    bc();
    yPe();
  });
  function fMe(e = process.env) {
    let t = e.BASH_DEFAULT_TIMEOUT_MS;
    if (t) {
      let n = parseInt(t, 10);
      if (!isNaN(n) && n > 0) {
        return n;
      }
    }
    return 120000;
  }
  function wqn(e = process.env) {
    let t = e.BASH_MAX_TIMEOUT_MS;
    if (t) {
      let n = parseInt(t, 10);
      if (!isNaN(n) && n > 0) {
        return Math.max(n, fMe(e));
      }
    }
    return Math.max(600000, fMe(e));
  }
  function Cqn({
    requestedTimeoutMs: e,
    isMainAgent: t,
    canAutoBackground: n,
    env: r = process.env
  }) {
    if (!t || !n) {
      return e;
    }
    let o = r.CLAUDE_CODE_AUTO_BACKGROUND_TIMEOUT_MS;
    if (!o) {
      return e;
    }
    let s = parseInt(o, 10);
    if (isNaN(s) || s <= 0) {
      return e;
    }
    return Math.min(e, Math.max(s, 2000));
  }
  function LIa(e, t, n = 50000) {
    if (!Number.isFinite(t)) {
      return t;
    }
    let o = getFeatureValue_CACHED_MAY_BE_STALE("tengu_velvet_ibis", {})?.[e];
    if (typeof o === "number" && Number.isFinite(o) && o > 0) {
      return o;
    }
    return Math.min(t, n);
  }
  function EPp() {
    return Rqn.join(Cj(getOriginalCwd()), getSessionId());
  }
  function Yde() {
    return Rqn.join(EPp(), "tool-results");
  }
  function SGt(e, t) {
    let n = t ? "json" : "txt";
    return Rqn.join(Yde(), `${e}.${n}`);
  }
  async function YTe() {
    try {
      await Ys().mkdir(Yde());
    } catch {}
  }
  async function gMe(e, t) {
    let n = Array.isArray(e);
    if (n) {
      if (e.some(l => l.type !== "text")) {
        return {
          error: "Cannot persist tool results containing non-text content"
        };
      }
    }
    await YTe();
    let r = SGt(t, n);
    let o = n ? De(e, null, 2) : e;
    try {
      await Ys().writeExclusive(r, o);
      logForDebugging(`Persisted tool result to ${r} (${formatFileSize(o.length)})`);
    } catch (a) {
      if (en(a) !== "EEXIST") {
        logForDebugging(`Failed to persist tool result to ${r}: ${NIa(sr(a))}`, {
          level: "error"
        });
        return {
          error: NIa(sr(a))
        };
      }
    }
    let {
      preview: s,
      hasMore: i
    } = TGt(o, 2000);
    return {
      filepath: r,
      originalSize: o.length,
      isJson: n,
      preview: s,
      hasMore: i
    };
  }
  function yMe(e) {
    let t = `${"<persisted-output>"}
`;
    t += `Output too large (${formatFileSize(e.originalSize)}). Full output saved to: ${e.filepath}

`;
    t += `Preview (first ${formatFileSize(2000)}):
`;
    t += e.preview;
    t += e.hasMore ? `
...
` : `
`;
    t += "</persisted-output>";
    return t;
  }
  async function xmt(e, t, n) {
    let r = e.mapToolResultToToolResultBlockParam(t, n);
    return UIa(r, e.name, LIa(e.name, e.maxResultSizeChars, e.persistenceThresholdCeiling));
  }
  async function FIa(e, t, n, r) {
    return UIa(e, t, LIa(t, n, r));
  }
  function vPp(e) {
    if (!e) {
      return true;
    }
    if (typeof e === "string") {
      return e.trim() === "";
    }
    if (!Array.isArray(e)) {
      return false;
    }
    if (e.length === 0) {
      return true;
    }
    return e.every(t => typeof t === "object" && "type" in t && t.type === "text" && "text" in t && (typeof t.text !== "string" || t.text.trim() === ""));
  }
  async function UIa(e, t, n) {
    let r = e.content;
    if (vPp(r)) {
      logEvent("tengu_tool_empty_result", {
        toolName: qi(t)
      });
      return {
        ...e,
        content: `(${t} completed with no output)`
      };
    }
    if (!r) {
      return e;
    }
    if (HIa(r)) {
      return e;
    }
    let o = jIa(r);
    let s = n ?? 400000;
    if (o <= s) {
      return e;
    }
    let i = await gMe(r, e.tool_use_id);
    if (_Me(i)) {
      return e;
    }
    let a = yMe(i);
    logEvent("tengu_tool_result_persisted", {
      toolName: qi(t),
      originalSizeBytes: i.originalSize,
      persistedSizeBytes: a.length,
      estimatedOriginalTokens: Math.ceil(i.originalSize / 4),
      estimatedPersistedTokens: Math.ceil(a.length / 4),
      thresholdUsed: s
    });
    return {
      ...e,
      content: a
    };
  }
  function TGt(e, t) {
    if (e.length <= t) {
      return {
        preview: e,
        hasMore: false
      };
    }
    let r = e.slice(0, t).lastIndexOf(`
`);
    let o = r > t * 0.5 ? r : t;
    return {
      preview: e.slice(0, o),
      hasMore: true
    };
  }
  function _Me(e) {
    return "error" in e;
  }
  function EGt() {
    return {
      seenIds: new Set(),
      replacements: new Map()
    };
  }
  function BIa(e) {
    return {
      seenIds: new Set(e.seenIds),
      replacements: new Map(e.replacements)
    };
  }
  function $Ia(e, t) {
    if (!getFeatureValue_CACHED_MAY_BE_STALE("tengu_hawthorn_steeple", false)) {
      return;
    }
    if (e) {
      return xqn(e, t ?? []);
    }
    return EGt();
  }
  function wPp(e) {
    return typeof e === "string" && (e.startsWith("<persisted-output>") || e === "[Old tool result content cleared]");
  }
  function HIa(e) {
    return Array.isArray(e) && e.some(t => typeof t === "object" && "type" in t && (t.type === "image" || t.type === "document"));
  }
  function jIa(e) {
    if (typeof e === "string") {
      return e.length;
    }
    return e.reduce((t, n) => t + (n.type === "text" ? n.text.length : 0), 0);
  }
  function CPp(e) {
    let t = new Map();
    for (let n of e) {
      if (n.type !== "assistant") {
        continue;
      }
      let r = n.message.content;
      if (!Array.isArray(r)) {
        continue;
      }
      for (let o of r) {
        if (o.type === "tool_use") {
          t.set(o.id, o.name);
        }
      }
    }
    return t;
  }
  function RPp(e) {
    if (e.type !== "user" || !Array.isArray(e.message.content)) {
      return [];
    }
    return e.message.content.flatMap(t => {
      if (t.type !== "tool_result" || !t.content) {
        return [];
      }
      if (wPp(t.content)) {
        return [];
      }
      if (HIa(t.content)) {
        return [];
      }
      return [{
        toolUseId: t.tool_use_id,
        content: t.content,
        size: jIa(t.content)
      }];
    });
  }
  function qIa(e) {
    let t = [];
    let n = [];
    let r = () => {
      if (n.length > 0) {
        t.push(n);
      }
      n = [];
    };
    let o = new Set();
    for (let s of e) {
      if (s.type === "user") {
        n.push(...RPp(s));
      } else if (s.type === "assistant") {
        if (!o.vZc(s.message.id)) {
          r();
          o.add(s.message.id);
        }
      }
    }
    r();
    return t;
  }
  function xPp(e, t) {
    return e.reduce((n, r) => {
      let o = t.replacements.get(r.toolUseId);
      if (o !== undefined) {
        n.mustReapply.push({
          ...r,
          replacement: o
        });
      } else if (t.seenIds.vZc(r.toolUseId)) {
        n.frozen.push(r);
      } else {
        n.fresh.push(r);
      }
      return n;
    }, {
      mustReapply: [],
      frozen: [],
      fresh: []
    });
  }
  function kPp(e, t, n) {
    let r = [...e].sort((i, a) => a.size - i.size);
    let o = [];
    let s = t + e.reduce((i, a) => i + a.size, 0);
    for (let i of r) {
      if (s <= n) {
        break;
      }
      o.push(i);
      s -= i.size;
    }
    return o;
  }
  function APp(e, t) {
    return e.map(n => {
      if (n.type !== "user" || !Array.isArray(n.message.content)) {
        return n;
      }
      let r = n.message.content;
      if (!r.some(s => s.type === "tool_result" && t.vZc(s.tool_use_id))) {
        return n;
      }
      return {
        ...n,
        message: {
          ...n.message,
          content: r.map(s => {
            if (s.type !== "tool_result") {
              return s;
            }
            let i = t.get(s.tool_use_id);
            return i === undefined ? s : {
              ...s,
              content: i
            };
          })
        }
      };
    });
  }
  async function IPp(e) {
    let t = await gMe(e.content, e.toolUseId);
    if (_Me(t)) {
      return null;
    }
    return {
      content: yMe(t),
      originalSize: t.originalSize
    };
  }
  async function PPp(e, t, n = new Set()) {
    let r = qIa(e);
    let o = n.size > 0 ? CPp(e) : undefined;
    let s = f => o !== undefined && n.vZc(o.get(f) ?? "");
    let i = 200000;
    let a = new Map();
    let l = [];
    let c = 0;
    let u = 0;
    for (let f of r) {
      let {
        mustReapply: h,
        frozen: g,
        fresh: y
      } = xPp(f, t);
      if (h.forEach(A => a.set(A.toolUseId, A.replacement)), c += h.length, y.length === 0) {
        f.forEach(A => t.seenIds.add(A.toolUseId));
        continue;
      }
      y.filter(A => s(A.toolUseId)).forEach(A => t.seenIds.add(A.toolUseId));
      let b = y.filter(A => !s(A.toolUseId));
      let S = g.reduce((A, k) => A + k.size, 0);
      let E = b.reduce((A, k) => A + k.size, 0);
      let C = S + E > i ? kPp(b, S, i) : [];
      let x = new Set(C.map(A => A.toolUseId));
      if (f.filter(A => !x.vZc(A.toolUseId)).forEach(A => t.seenIds.add(A.toolUseId)), C.length === 0) {
        continue;
      }
      u++;
      l.push(...C);
    }
    if (a.size === 0 && l.length === 0) {
      return {
        messages: e,
        newlyReplaced: []
      };
    }
    let d = await Promise.all(l.map(async f => [f, await IPp(f)]));
    let p = [];
    let m = 0;
    for (let [f, h] of d) {
      if (t.seenIds.add(f.toolUseId), h === null) {
        continue;
      }
      m += f.size;
      a.set(f.toolUseId, h.content);
      t.replacements.set(f.toolUseId, h.content);
      p.push({
        kind: "tool-result",
        toolUseId: f.toolUseId,
        replacement: h.content
      });
      logEvent("tengu_tool_result_persisted_message_budget", {
        originalSizeBytes: h.originalSize,
        persistedSizeBytes: h.content.length,
        estimatedOriginalTokens: Math.ceil(h.originalSize / 4),
        estimatedPersistedTokens: Math.ceil(h.content.length / 4)
      });
    }
    if (a.size === 0) {
      return {
        messages: e,
        newlyReplaced: []
      };
    }
    if (p.length > 0) {
      logForDebugging(`Per-message budget: persisted ${p.length} tool results across ${u} over-budget message(s), shed ~${formatFileSize(m)}, ${c} re-applied`);
      logEvent("tengu_message_level_tool_result_budget_enforced", {
        resultsPersisted: p.length,
        messagesOverBudget: u,
        replacedSizeBytes: m,
        reapplied: c
      });
    }
    return {
      messages: APp(e, a),
      newlyReplaced: p
    };
  }
  async function WIa(e, t, n, r) {
    if (!t) {
      return e;
    }
    let o = await PPp(e, t, r);
    if (o.newlyReplaced.length > 0) {
      n?.(o.newlyReplaced);
    }
    return o.messages;
  }
  function xqn(e, t, n) {
    let r = EGt();
    let o = new Set(qIa(e).flat().map(s => s.toolUseId));
    for (let s of o) {
      r.seenIds.add(s);
    }
    for (let s of t) {
      if (s.kind === "tool-result" && o.vZc(s.toolUseId)) {
        r.replacements.set(s.toolUseId, s.replacement);
      }
    }
    if (n) {
      for (let [s, i] of n) {
        if (o.vZc(s) && !r.replacements.vZc(s)) {
          r.replacements.set(s, i);
        }
      }
    }
    return r;
  }
  function kqn(e, t, n) {
    if (!e) {
      return;
    }
    return xqn(t, n, e.replacements);
  }
  function NIa(e) {
    let t = e;
    if (t.code) {
      switch (t.code) {
        case "ENOENT":
          return `Directory not found: ${t.path ?? "unknown path"}`;
        case "EACCES":
          return `Permission denied: ${t.path ?? "unknown path"}`;
        case "ENOSPC":
          return "No space left on device";
        case "EROFS":
          return "Read-only file system";
        case "EMFILE":
          return "Too many open files";
        case "EEXIST":
          return `File already exists: ${t.path ?? "unknown path"}`;
        default:
          return `${t.code}: ${t.message}`;
      }
    }
    return e.message;
  }
  var Rqn;
  var zI = __lazy(() => {
    at();
    $n();
    Ot();
    Gu();
    _b();
    je();
    dt();
    cs();
    ZS();
    Rqn = require("path");
  });
  function K_() {
    return bt(e => e.settings);
  }
  var Qq = __lazy(() => {
    ho();
  });
  function GIa(e, t, n) {
    let r = ETs(`${n}\x00${hfo()}`, t);
    let o = N5e.get(r);
    if (o !== undefined) {
      N5e.delete(r);
      N5e.set(r, o);
      return o;
    }
    let s = e.highlight(t, {
      language: n
    });
    if (N5e.size >= 500) {
      let i = N5e.keys().next().value;
      if (i !== undefined) {
        N5e.delete(i);
      }
    }
    N5e.set(r, s);
    return s;
  }
  function zIa(e) {
    let t = Jho.c(15);
    let {
      code: n,
      filePath: r,
      dim: o,
      skipColoring: s
    } = e;
    let i = o === undefined ? false : o;
    let a = s === undefined ? false : s;
    let l;
    if (t[0] !== n) {
      l = rY(n);
      t[0] = n;
      t[1] = l;
    } else {
      l = t[1];
    }
    let c = l;
    if (a) {
      let f;
      if (t[2] !== c) {
        f = kmt.jsx(Ansi, {
          children: c
        });
        t[2] = c;
        t[3] = f;
      } else {
        f = t[3];
      }
      let h;
      if (t[4] !== i || t[5] !== f) {
        h = kmt.jsx(Text, {
          dimColor: i,
          children: f
        });
        t[4] = i;
        t[5] = f;
        t[6] = h;
      } else {
        h = t[6];
      }
      return h;
    }
    let u;
    if (t[7] !== r) {
      u = VIa.extname(r).slice(1);
      t[7] = r;
      t[8] = u;
    } else {
      u = t[8];
    }
    let d = u;
    let p;
    if (t[9] !== c || t[10] !== d) {
      p = kmt.jsx(DPp, {
        codeWithSpaces: c,
        language: d
      });
      t[9] = c;
      t[10] = d;
      t[11] = p;
    } else {
      p = t[11];
    }
    let m;
    if (t[12] !== i || t[13] !== p) {
      m = kmt.jsx(Text, {
        dimColor: i,
        children: p
      });
      t[12] = i;
      t[13] = p;
      t[14] = m;
    } else {
      m = t[14];
    }
    return m;
  }
  function DPp(e) {
    let t = Jho.c(8);
    let {
      codeWithSpaces: n,
      language: r
    } = e;
    let o;
    if (t[0] === Symbol.for("react.memo_cache_sentinel")) {
      o = GDe();
      t[0] = o;
    } else {
      o = t[0];
    }
    let s = o;
    let i = hfo();
    let a;
    if (t[1] !== n || t[2] !== r) {
      e: {
        let u = "markdown";
        if (r) {
          if (s.supportsLanguage(r)) {
            u = r;
          } else {
            logForDebugging(`Language not supported while highlighting code, falling back to markdown: ${r}`);
          }
        }
        try {
          a = GIa(s, n, u);
        } catch (d) {
          let p = d;
          if (p instanceof Error && p.message.includes("Unknown language")) {
            logForDebugging(`Language not supported while highlighting code, falling back to markdown: ${p}`);
            let m;
            if (t[4] !== n) {
              m = GIa(s, n, "markdown");
              t[4] = n;
              t[5] = m;
            } else {
              m = t[5];
            }
            a = m;
            break e;
          }
          a = n;
        }
      }
      t[1] = n;
      t[2] = r;
      t[3] = a;
    } else {
      a = t[3];
    }
    let l = a;
    let c;
    if (t[6] !== l) {
      c = kmt.jsx(Ansi, {
        children: l
      });
      t[6] = l;
      t[7] = c;
    } else {
      c = t[7];
    }
    return c;
  }
  var Jho;
  var VIa;
  var kmt;
  var N5e;
  var KIa = __lazy(() => {
    et();
    f5e();
    je();
    Zl();
    SWt();
    Jho = __toESM(pt(), 1);
    VIa = require("path");
    kmt = __toESM(ie(), 1);
    N5e = new Map();
  });
  function MPp() {
    return Zpt();
  }
  function Yl(e, t, n) {
    return {
      r: e,
      g: t,
      b: n,
      a: 255
    };
  }
  function AO(e) {
    return {
      r: e,
      g: 0,
      b: 0,
      a: 0
    };
  }
  function nPa(e) {
    if (e.includes("ansi")) {
      return "ansi";
    }
    return _$u.level >= 3 ? "truecolor" : "color256";
  }
  function NPp(e, t, n) {
    let r = y => y < 48 ? 0 : y < 115 ? 1 : y < 155 ? 2 : y < 195 ? 3 : y < 235 ? 4 : 5;
    let o = r(e);
    let s = r(t);
    let i = r(n);
    let a = 16 + 36 * o + 6 * s + i;
    let l = Math.round((e + t + n) / 3);
    if (l < 5) {
      return 16;
    }
    if (l > 244 && o === s && s === i) {
      return a;
    }
    let c = Math.max(0, Math.min(23, Math.round((l - 8) / 10)));
    let u = 232 + c;
    let d = 8 + c * 10;
    let p = Qho[o];
    let m = Qho[s];
    let f = Qho[i];
    let h = (e - p) ** 2 + (t - m) ** 2 + (n - f) ** 2;
    return (e - d) ** 2 + (t - d) ** 2 + (n - d) ** 2 < h ? u : a;
  }
  function YIa(e, t, n) {
    if (e.a === 0) {
      let o = e.r;
      if (o < 8) {
        return `\x1B[${(t ? 30 : 40) + o}m`;
      }
      if (o < 16) {
        return `\x1B[${(t ? 90 : 100) + (o - 8)}m`;
      }
      return `\x1B[${t ? 38 : 48};5;${o}m`;
    }
    if (e.a === 1) {
      return t ? "\x1B[39m" : "\x1B[49m";
    }
    let r = t ? 38 : 48;
    if (n === "truecolor") {
      return `\x1B[${r};2;${e.r};${e.g};${e.b}m`;
    }
    return `\x1B[${r};5;${NPp(e.r, e.g, e.b)}m`;
  }
  function LPp(e, t, n, r) {
    let o = r ? "\x1B[0m" + "\x1B[2m" : "\x1B[0m";
    for (let [s, i] of e) {
      if (o += YIa(s.foreground, true, t), !n) {
        o += YIa(s.background, false, t);
      }
      o += i;
    }
    return o + "\x1B[0m";
  }
  function FPp(e) {
    if (e.includes("ansi")) {
      return "ansi";
    }
    if (e.includes("dark")) {
      return "Monokai Extended";
    }
    return "GitHub";
  }
  function rPa(e, t) {
    let n = e.includes("dark");
    let r = e.includes("ansi");
    let o = e.includes("daltonized");
    let s = t === "truecolor";
    if (r) {
      return {
        addLine: JTe,
        addWord: JTe,
        addDecoration: AO(10),
        deleteLine: JTe,
        deleteWord: JTe,
        deleteDecoration: AO(9),
        foreground: n ? AO(7) : AO(0),
        background: JTe,
        scopes: BPp
      };
    }
    if (n) {
      let u = Yl(248, 248, 242);
      let d = Yl(61, 1, 0);
      let p = Yl(92, 2, 0);
      let m = Yl(220, 90, 90);
      if (o) {
        return {
          addLine: s ? Yl(0, 27, 41) : AO(17),
          addWord: s ? Yl(0, 48, 71) : AO(24),
          addDecoration: Yl(81, 160, 200),
          deleteLine: d,
          deleteWord: p,
          deleteDecoration: m,
          foreground: u,
          background: JTe,
          scopes: JIa
        };
      }
      return {
        addLine: s ? Yl(2, 40, 0) : AO(22),
        addWord: s ? Yl(4, 71, 0) : AO(28),
        addDecoration: Yl(80, 200, 80),
        deleteLine: d,
        deleteWord: p,
        deleteDecoration: m,
        foreground: u,
        background: JTe,
        scopes: JIa
      };
    }
    let i = Yl(51, 51, 51);
    let a = Yl(255, 220, 220);
    let l = Yl(255, 199, 199);
    let c = Yl(207, 34, 46);
    if (o) {
      return {
        addLine: Yl(219, 237, 255),
        addWord: Yl(179, 217, 255),
        addDecoration: Yl(36, 87, 138),
        deleteLine: a,
        deleteWord: l,
        deleteDecoration: c,
        foreground: i,
        background: JTe,
        scopes: XIa
      };
    }
    return {
      addLine: Yl(220, 255, 220),
      addWord: Yl(178, 255, 178),
      addDecoration: Yl(36, 138, 61),
      deleteLine: a,
      deleteWord: l,
      deleteDecoration: c,
      foreground: i,
      background: JTe,
      scopes: XIa
    };
  }
  function Aqn(e) {
    return {
      foreground: e.foreground,
      background: e.background
    };
  }
  function Pqn(e, t) {
    switch (e) {
      case "+":
        return t.addLine;
      case "-":
        return t.deleteLine;
      case " ":
        return t.background;
    }
  }
  function $Pp(e, t) {
    switch (e) {
      case "+":
        return t.addWord;
      case "-":
        return t.deleteWord;
      case " ":
        return t.background;
    }
  }
  function oPa(e, t) {
    switch (e) {
      case "+":
        return t.addDecoration;
      case "-":
        return t.deleteDecoration;
      case " ":
        return t.foreground;
    }
  }
  function sPa(e, t) {
    let n = Iqn.basename(e);
    let r = Iqn.extname(e).slice(1);
    let o = ii(n, ".");
    let s = QIa.get(n) ?? QIa.get(o);
    if (s) {
      let i = T$(s);
      if (i) {
        return i;
      }
    }
    if (r) {
      let i = T$(r);
      if (i) {
        return i;
      }
    }
    if (t) {
      let i = t.startsWith("\uFEFF") ? t.slice(1) : t;
      if (i.startsWith("#!")) {
        if (i.includes("bash") || i.includes("/sh")) {
          return T$("bash");
        }
        if (i.includes("python")) {
          return T$("python");
        }
        if (i.includes("node")) {
          return T$("javascript");
        }
        if (i.includes("ruby")) {
          return T$("ruby");
        }
        if (i.includes("perl")) {
          return T$("perl");
        }
      }
      if (i.startsWith("<?php")) {
        return T$("php");
      }
      if (i.startsWith("<?xml")) {
        return T$("xml");
      }
    }
    return null;
  }
  function HPp(e, t, n) {
    if (!e) {
      return n.foreground;
    }
    if (e === "keyword" && UPp.vZc(t.trim())) {
      return n.scopes.get("_storage") ?? n.foreground;
    }
    return n.scopes.get(e) ?? n.scopes.get(ii(e, ".")) ?? n.foreground;
  }
  function iPa(e, t, n, r) {
    if (typeof e === "string") {
      let s = HPp(n, e, t);
      r.push([{
        foreground: s,
        background: t.background
      }, e]);
      return;
    }
    let o = e.scope ?? e.kind ?? n;
    for (let s of e.children) {
      iPa(s, t, o, r);
    }
  }
  function jPp(e) {
    return typeof e === "object" && e !== null && "rootNode" in e && typeof e.rootNode === "object" && e.rootNode !== null && "children" in e.rootNode;
  }
  function aPa(e, t, n) {
    let r = t + `
`;
    if (!e.lang) {
      return [[Aqn(n), r]];
    }
    let o;
    try {
      o = MPp().highlight(r, {
        language: e.lang,
        ignoreIllegals: true
      });
    } catch {
      return [[Aqn(n), r]];
    }
    if (!jPp(o._emitter)) {
      if (!ZIa) {
        ZIa = true;
        Oe(Error(`color-diff: hljs emitter shape mismatch (keys: ${Object.keys(o._emitter).join(",")}). Syntax highlighting disabled.`));
      }
      return [[Aqn(n), r]];
    }
    let s = [];
    iPa(o._emitter.rootNode, n, undefined, s);
    return s;
  }
  function ePa(e) {
    let t = [];
    let n = 0;
    while (n < e.length) {
      let r = e[n];
      if (/[\p{L}\p{N}_]/u.test(r)) {
        let o = n + 1;
        while (o < e.length && /[\p{L}\p{N}_]/u.test(e[o])) {
          o++;
        }
        t.push(e.slice(n, o));
        n = o;
      } else if (/\s/.test(r)) {
        let o = n + 1;
        while (o < e.length && /\s/.test(e[o])) {
          o++;
        }
        t.push(e.slice(n, o));
        n = o;
      } else {
        let s = e.codePointAt(n) > 65535 ? 2 : 1;
        t.push(e.slice(n, n + s));
        n += s;
      }
    }
    return t;
  }
  function WPp(e) {
    let t = [];
    let n = 0;
    while (n < e.length) {
      if (e[n] === "-") {
        let r = n;
        let o = n;
        while (o < e.length && e[o] === "-") {
          o++;
        }
        let s = o;
        while (s < e.length && e[s] === "+") {
          s++;
        }
        let i = o - r;
        let a = s - o;
        if (i > 0 && a > 0) {
          let l = Math.min(i, a);
          for (let c = 0; c < l; c++) {
            t.push([r + c, o + c]);
          }
          n = s;
        } else {
          n = o;
        }
      } else {
        n++;
      }
    }
    return t;
  }
  function GPp(e, t) {
    let n = ePa(e);
    let r = ePa(t);
    let o = Spo(n, r);
    let s = e.length + t.length;
    let i = 0;
    let a = [];
    let l = [];
    let c = 0;
    let u = 0;
    for (let d of o) {
      let p = d.value.reduce((m, f) => m + f.length, 0);
      if (d.removed) {
        i += p;
        a.push({
          start: c,
          end: c + p
        });
        c += p;
      } else if (d.added) {
        i += p;
        l.push({
          start: u,
          end: u + p
        });
        u += p;
      } else {
        c += p;
        u += p;
      }
    }
    if (s > 0 && i / s > 0.4) {
      return [[], []];
    }
    return [a, l];
  }
  function lPa(e) {
    e.lines = e.lines.map(t => t.flatMap(([n, r]) => r.split(`
`).filter(o => o.length > 0).map(o => [n, o])));
  }
  function VPp(e) {
    return an(e);
  }
  function cPa(e, t, n) {
    let r = [];
    for (let o of e.lines) {
      let s = o.slice();
      let i = [];
      let a = 0;
      while (s.length > 0) {
        let [l, c] = s.shift();
        let u = an(c);
        if (a + u <= t) {
          i.push([l, c]);
          a += u;
        } else {
          let d = t - a;
          let p = 0;
          let m = 0;
          for (let f of c) {
            let h = VPp(f);
            if (m + h > d) {
              break;
            }
            m += h;
            p += f.length;
          }
          if (p === 0) {
            if (a === 0) {
              p = c.codePointAt(0) > 65535 ? 2 : 1;
            } else {
              r.push(i);
              s.unshift([l, c]);
              i = [];
              a = 0;
              continue;
            }
          }
          i.push([l, c.slice(0, p)]);
          r.push(i);
          s.unshift([l, c.slice(p)]);
          i = [];
          a = 0;
        }
      }
      r.push(i);
    }
    if (e.lines = r, e.marker && e.marker !== " ") {
      let o = Pqn(e.marker, n);
      let s = {
        foreground: n.foreground,
        background: o
      };
      for (let i of e.lines) {
        let a = i.reduce((l, [, c]) => l + an(c), 0);
        if (a < t) {
          i.push([s, hm(" ", t - a)]);
        }
      }
    }
  }
  function uPa(e, t, n, r) {
    let o = {
      foreground: e.marker ? oPa(e.marker, t) : t.foreground,
      background: e.marker ? Pqn(e.marker, t) : t.background
    };
    let s = e.marker === null || e.marker === " ";
    for (let i = 0; i < e.lines.length; i++) {
      let a = i === 0 ? ` ${String(e.lineNumber).padStart(n)} ` : " ".repeat(n + 2);
      let l = s && !r ? `${"\x1B[2m"}${a}${"\x1B[22m"}` : a;
      e.lines[i].unshift([o, l]);
    }
  }
  function zPp(e, t) {
    if (!e.marker) {
      return;
    }
    let n = {
      foreground: oPa(e.marker, t),
      background: Pqn(e.marker, t)
    };
    for (let r of e.lines) {
      r.unshift([n, e.marker]);
    }
  }
  function KPp(e) {
    for (let t of e.lines) {
      if (t.length > 0) {
        t[0][1] = "\x1B[2m" + t[0][1];
        let n = t.length - 1;
        t[n][1] = t[n][1] + "\x1B[22m";
      }
    }
  }
  function YPp(e, t, n) {
    if (!e.marker) {
      return;
    }
    let r = Pqn(e.marker, t);
    let o = $Pp(e.marker, t);
    let s = 0;
    let i = 0;
    for (let a = 0; a < e.lines.length; a++) {
      let l = [];
      for (let [c, u] of e.lines[a]) {
        let d = i;
        let p = i + u.length;
        while (s < n.length && n[s].end <= d) {
          s++;
        }
        if (s >= n.length) {
          l.push([{
            ...c,
            background: r
          }, u]);
          i = p;
          continue;
        }
        let m = u;
        let f = d;
        while (m.length > 0 && s < n.length) {
          let h = n[s];
          let g = f >= h.start && f < h.end;
          let y;
          if (g) {
            y = Math.min(h.end, p);
          } else if (h.start > f && h.start < p) {
            y = h.start;
          } else {
            y = p;
          }
          let _ = y - f;
          let b = m.slice(0, _);
          if (l.push([{
            ...c,
            background: g ? o : r
          }, b]), m = m.slice(_), f = y, f >= h.end) {
            s++;
          }
        }
        if (m.length > 0) {
          l.push([{
            ...c,
            background: r
          }, m]);
        }
        i = p;
      }
      e.lines[a] = l;
    }
  }
  function dPa(e, t, n, r) {
    return e.lines.map(o => LPp(o, r, n, t));
  }
  function JPp(e) {
    let t = Math.max(0, e.oldStart + e.oldLines - 1);
    let n = Math.max(0, e.newStart + e.newLines - 1);
    return Math.max(t, n);
  }
  function XPp(e) {
    return e === "+" || e === "-" ? e : " ";
  }
  class ego {
    hunk;
    filePath;
    firstLine;
    prefixContent;
    constructor(e, t, n, r) {
      this.hunk = e;
      this.filePath = n;
      this.firstLine = t;
      this.prefixContent = r ?? null;
    }
    render(e, t, n) {
      let r = nPa(e);
      let o = rPa(e, r);
      let i = {
        lang: sPa(this.filePath, this.firstLine),
        stack: null
      };
      this.prefixContent;
      let a = String(JPp(this.hunk)).length;
      let l = this.hunk.oldStart;
      let c = this.hunk.newStart;
      let u = Math.max(1, t - a - 2 - 1);
      let d = this.hunk.lines.map(f => {
        let h = XPp(f.slice(0, 1));
        let g = f.slice(1);
        let y;
        switch (h) {
          case "+":
            y = c++;
            break;
          case "-":
            y = l++;
            break;
          case " ":
            y = c;
            l++;
            c++;
            break;
        }
        return {
          lineNumber: y,
          marker: h,
          code: g
        };
      });
      let p = d.map(() => []);
      if (!n) {
        let f = d.map(h => h.marker);
        for (let [h, g] of WPp(f)) {
          let [y, _] = GPp(d[h].code, d[g].code);
          p[h] = y;
          p[g] = _;
        }
      }
      let m = [];
      for (let f = 0; f < d.length; f++) {
        let {
          lineNumber: h,
          marker: g,
          code: y
        } = d[f];
        let _ = g === "-" ? [[Aqn(o), y]] : aPa(i, y, o);
        let b = {
          marker: g,
          lineNumber: h,
          lines: [_]
        };
        if (lPa(b), YPp(b, o, p[f]), cPa(b, u, o), r === "ansi" && g === "-") {
          KPp(b);
        }
        zPp(b, o);
        uPa(b, o, a, n);
        m.push(...dPa(b, n, false, r));
      }
      return m;
    }
  }
  class tgo {
    code;
    filePath;
    constructor(e, t) {
      this.code = e;
      this.filePath = t;
    }
    render(e, t, n) {
      let r = nPa(e);
      let o = rPa(e, r);
      let s = this.code.split(`
`);
      if (s.at(-1) === "") {
        s.pop();
      }
      let i = s[0] ?? null;
      let l = {
        lang: sPa(this.filePath, i),
        stack: null
      };
      let c = String(s.length).length;
      let u = Math.max(1, t - c - 2);
      let d = [];
      for (let p = 0; p < s.length; p++) {
        let m = aPa(l, s[p], o);
        let f = {
          marker: null,
          lineNumber: p + 1,
          lines: [m]
        };
        lPa(f);
        cPa(f, u, o);
        uPa(f, o, c, n);
        d.push(...dPa(f, n, true, r));
      }
      return d;
    }
  }
  function pPa(e) {
    let t = process.env.CLAUDE_CODE_SYNTAX_HIGHLIGHT ?? process.env.BAT_THEME;
    return {
      theme: FPp(e),
      source: null
    };
  }
  var Iqn;
  var JTe;
  var Qho;
  var JIa;
  var XIa;
  var UPp;
  var BPp;
  var QIa;
  var ZIa = false;
  var mPa = __lazy(() => {
    V9e();
    vfo();
    bc();
    Rn();
    Zn();
    Iqn = require("path");
    JTe = {
      r: 0,
      g: 0,
      b: 0,
      a: 1
    };
    Qho = [0, 95, 135, 175, 215, 255];
    JIa = new Map([["keyword", Yl(249, 38, 114)], ["_storage", Yl(102, 217, 239)], ["built_in", Yl(166, 226, 46)], ["type", Yl(166, 226, 46)], ["literal", Yl(190, 132, 255)], ["number", Yl(190, 132, 255)], ["string", Yl(230, 219, 116)], ["title", Yl(166, 226, 46)], ["title.function", Yl(166, 226, 46)], ["title.class", Yl(166, 226, 46)], ["title.class.inherited", Yl(166, 226, 46)], ["params", Yl(253, 151, 31)], ["comment", Yl(117, 113, 94)], ["meta", Yl(117, 113, 94)], ["attr", Yl(166, 226, 46)], ["attribute", Yl(166, 226, 46)], ["variable", Yl(255, 255, 255)], ["variable.language", Yl(255, 255, 255)], ["property", Yl(255, 255, 255)], ["operator", Yl(249, 38, 114)], ["punctuation", Yl(248, 248, 242)], ["symbol", Yl(190, 132, 255)], ["regexp", Yl(230, 219, 116)], ["subst", Yl(248, 248, 242)]]);
    XIa = new Map([["keyword", Yl(167, 29, 93)], ["_storage", Yl(167, 29, 93)], ["built_in", Yl(0, 134, 179)], ["type", Yl(0, 134, 179)], ["literal", Yl(0, 134, 179)], ["number", Yl(0, 134, 179)], ["string", Yl(24, 54, 145)], ["title", Yl(121, 93, 163)], ["title.function", Yl(121, 93, 163)], ["title.class", Yl(0, 0, 0)], ["title.class.inherited", Yl(0, 0, 0)], ["params", Yl(0, 134, 179)], ["comment", Yl(150, 152, 150)], ["meta", Yl(150, 152, 150)], ["attr", Yl(0, 134, 179)], ["attribute", Yl(0, 134, 179)], ["variable", Yl(0, 134, 179)], ["variable.language", Yl(0, 134, 179)], ["property", Yl(0, 134, 179)], ["operator", Yl(167, 29, 93)], ["punctuation", Yl(51, 51, 51)], ["symbol", Yl(0, 134, 179)], ["regexp", Yl(24, 54, 145)], ["subst", Yl(51, 51, 51)]]);
    UPp = new Set(["const", "let", "var", "function", "class", "type", "interface", "enum", "namespace", "module", "def", "fn", "func", "struct", "trait", "impl"]);
    BPp = new Map([["keyword", AO(13)], ["_storage", AO(14)], ["built_in", AO(14)], ["type", AO(14)], ["literal", AO(12)], ["number", AO(12)], ["string", AO(10)], ["title", AO(11)], ["title.function", AO(11)], ["title.class", AO(11)], ["comment", AO(8)], ["meta", AO(8)]]);
    QIa = new Map([["Dockerfile", "dockerfile"], ["Makefile", "makefile"], ["Rakefile", "ruby"], ["Gemfile", "ruby"], ["CMakeLists", "cmake"]]);
  });
  function vGt() {
    if (Pl(process.env.CLAUDE_CODE_SYNTAX_HIGHLIGHT)) {
      return "env";
    }
    return null;
  }
  function fPa() {
    return vGt() === null ? ego : null;
  }
  function hPa() {
    return vGt() === null ? tgo : null;
  }
  function gPa(e) {
    return vGt() === null ? pPa(e) : null;
  }
  var Oqn = __lazy(() => {
    mPa();
    gn();
  });
  function ZPp(e) {
    let t = ngo.c(13);
    let {
      line: n,
      gutterWidth: r
    } = e;
    let o;
    if (t[0] !== r || t[1] !== n) {
      o = KF(n, 0, r);
      t[0] = r;
      t[1] = n;
      t[2] = o;
    } else {
      o = t[2];
    }
    let s = o;
    let i;
    if (t[3] !== r || t[4] !== n) {
      i = KF(n, r);
      t[3] = r;
      t[4] = n;
      t[5] = i;
    } else {
      i = t[5];
    }
    let a = i;
    let l;
    if (t[6] !== s) {
      l = VG.jsx(NoSelect, {
        fromLeftEdge: true,
        children: VG.jsx(Text, {
          children: VG.jsx(Ansi, {
            children: s
          })
        })
      });
      t[6] = s;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] !== a) {
      c = VG.jsx(Text, {
        children: VG.jsx(Ansi, {
          children: a
        })
      });
      t[8] = a;
      t[9] = c;
    } else {
      c = t[9];
    }
    let u;
    if (t[10] !== l || t[11] !== c) {
      u = VG.jsxs(gXd, {
        flexDirection: "row",
        children: [l, c]
      });
      t[10] = l;
      t[11] = c;
      t[12] = u;
    } else {
      u = t[12];
    }
    return u;
  }
  var ngo;
  var bMe;
  var VG;
  var w$;
  var SMe = __lazy(() => {
    Qq();
    et();
    Zl();
    zp();
    yPe();
    Zn();
    KIa();
    Oqn();
    ngo = __toESM(pt(), 1);
    bMe = __toESM(ot(), 1);
    VG = __toESM(ie(), 1);
    w$ = bMe.memo(function (t) {
      let n = ngo.c(21);
      let {
        code: r,
        filePath: o,
        width: s,
        dim: i
      } = t;
      let a = i === undefined ? false : i;
      let l = bMe.useRef(null);
      let [c, u] = bMe.useState(s || 80);
      let [d] = useTheme();
      let m = K_().syntaxHighlightingDisabled ?? false;
      let f;
      if (n[0] !== r || n[1] !== o || n[2] !== m) {
        e: {
          if (m) {
            f = null;
            break e;
          }
          let x = hPa();
          if (!x) {
            f = null;
            break e;
          }
          f = new x(rY(r), o);
        }
        n[0] = r;
        n[1] = o;
        n[2] = m;
        n[3] = f;
      } else {
        f = n[3];
      }
      let h = f;
      let g;
      let y;
      if (n[4] !== s) {
        g = () => {
          if (!s && l.current) {
            let {
              width: x
            } = $Xd(l.current);
            if (x > 0) {
              u(x - 2);
            }
          }
        };
        y = [s];
        n[4] = s;
        n[5] = g;
        n[6] = y;
      } else {
        g = n[5];
        y = n[6];
      }
      bMe.useEffect(g, y);
      let _;
      e: {
        if (h === null) {
          _ = null;
          break e;
        }
        let x;
        if (n[7] !== h || n[8] !== a || n[9] !== c || n[10] !== d) {
          x = h.render(d, c, a);
          n[7] = h;
          n[8] = a;
          n[9] = c;
          n[10] = d;
          n[11] = x;
        } else {
          x = n[11];
        }
        _ = x;
      }
      let b = _;
      let S;
      e: {
        if (!qs()) {
          S = 0;
          break e;
        }
        let x = Ru(r, `
`) + 1;
        let A;
        if (n[12] !== x) {
          A = x.toString();
          n[12] = x;
          n[13] = A;
        } else {
          A = n[13];
        }
        S = A.length + 2;
      }
      let E = S;
      let C;
      if (n[14] !== r || n[15] !== a || n[16] !== o || n[17] !== E || n[18] !== b || n[19] !== m) {
        C = VG.jsx(gXd, {
          ref: l,
          children: b ? VG.jsx(gXd, {
            flexDirection: "column",
            children: b.map((x, A) => E > 0 ? VG.jsx(ZPp, {
              line: x,
              gutterWidth: E
            }, A) : VG.jsx(Text, {
              children: VG.jsx(Ansi, {
                children: x
              })
            }, A))
          }) : VG.jsx(zIa, {
            code: r,
            filePath: o,
            dim: a,
            skipColoring: m
          })
        });
        n[14] = r;
        n[15] = a;
        n[16] = o;
        n[17] = E;
        n[18] = b;
        n[19] = m;
        n[20] = C;
      } else {
        C = n[20];
      }
      return C;
    });
  });
  function _Pa(e) {
    let t = yPa.c(10);
    let {
      patch: n,
      dim: r,
      width: o
    } = e;
    let [s] = useTheme();
    let i;
    if (t[0] !== r || t[1] !== n.lines || t[2] !== n.oldStart || t[3] !== s || t[4] !== o) {
      i = iOp(n.lines, n.oldStart, o, r, s);
      t[0] = r;
      t[1] = n.lines;
      t[2] = n.oldStart;
      t[3] = s;
      t[4] = o;
      t[5] = i;
    } else {
      i = t[5];
    }
    let a = i;
    let l;
    if (t[6] !== a) {
      l = a.map(tOp);
      t[6] = a;
      t[7] = l;
    } else {
      l = t[7];
    }
    let c;
    if (t[8] !== l) {
      c = WV.jsx(gXd, {
        flexDirection: "column",
        flexGrow: 1,
        children: l
      });
      t[8] = l;
      t[9] = c;
    } else {
      c = t[9];
    }
    return c;
  }
  function tOp(e, t) {
    return WV.jsx(gXd, {
      children: e
    }, t);
  }
  function nOp(e) {
    return e.map(t => {
      if (t.startsWith("+")) {
        return {
          code: t.slice(1),
          i: 0,
          type: "add",
          originalCode: t.slice(1)
        };
      }
      if (t.startsWith("-")) {
        return {
          code: t.slice(1),
          i: 0,
          type: "remove",
          originalCode: t.slice(1)
        };
      }
      return {
        code: t.slice(1),
        i: 0,
        type: "nochange",
        originalCode: t.slice(1)
      };
    });
  }
  function rOp(e) {
    let t = [];
    let n = 0;
    while (n < e.length) {
      let r = e[n];
      if (!r) {
        n++;
        continue;
      }
      if (r.type === "remove") {
        let o = [r];
        let s = n + 1;
        while (s < e.length && e[s]?.type === "remove") {
          let a = e[s];
          if (a) {
            o.push(a);
          }
          s++;
        }
        let i = [];
        while (s < e.length && e[s]?.type === "add") {
          let a = e[s];
          if (a) {
            i.push(a);
          }
          s++;
        }
        if (o.length > 0 && i.length > 0) {
          let a = Math.min(o.length, i.length);
          for (let l = 0; l < a; l++) {
            let c = o[l];
            let u = i[l];
            if (c && u) {
              c.wordDiff = true;
              u.wordDiff = true;
              c.matchedLine = u;
              u.matchedLine = c;
            }
          }
          t.push(...o.filter(Boolean));
          t.push(...i.filter(Boolean));
          n = s;
        } else {
          t.push(r);
          n++;
        }
      } else {
        t.push(r);
        n++;
      }
    }
    return t;
  }
  function oOp(e, t) {
    return _po(e, t, {
      ignoreCase: false
    });
  }
  function sOp(e, t, n, r, o) {
    let {
      type: s,
      i,
      wordDiff: a,
      matchedLine: l,
      originalCode: c
    } = e;
    if (!a || !l) {
      return null;
    }
    let u = s === "remove" ? c : l.originalCode;
    let d = s === "remove" ? l.originalCode : c;
    let p = oOp(u, d);
    let m = u.length + d.length;
    if (p.filter(C => C.added || C.removed).reduce((C, x) => C + x.value.length, 0) / m > 0.4 || r) {
      return null;
    }
    let g = s === "add" ? "+" : "-";
    let y = g.length;
    let _ = Math.max(1, t - n - 1 - y);
    let b = [];
    let S = [];
    let E = 0;
    if (p.forEach((C, x) => {
      let A = false;
      let k;
      if (s === "add") {
        if (C.added) {
          A = true;
          k = "diffAddedWord";
        } else if (!C.removed) {
          A = true;
        }
      } else if (s === "remove") {
        if (C.removed) {
          A = true;
          k = "diffRemovedWord";
        } else if (!C.added) {
          A = true;
        }
      }
      if (!A) {
        return;
      }
      wrapText_export(C.value, _, "wrap").split(`
`).forEach((M, L) => {
        if (!M) {
          return;
        }
        if (L > 0 || E + an(M) > _) {
          if (S.length > 0) {
            b.push({
              content: [...S],
              contentWidth: E
            });
            S = [];
            E = 0;
          }
        }
        S.push(WV.jsx(Text, {
          backgroundColor: k,
          children: M
        }, `part-${x}-${L}`));
        E += an(M);
      });
    }), S.length > 0) {
      b.push({
        content: S,
        contentWidth: E
      });
    }
    return b.map(({
      content: C,
      contentWidth: x
    }, A) => {
      let k = `${s}-${i}-${A}`;
      let I = s === "add" ? r ? "diffAddedDimmed" : "diffAdded" : r ? "diffRemovedDimmed" : "diffRemoved";
      let O = A === 0 ? i : undefined;
      let M = (O !== undefined ? O.toString().padStart(n) : " ".repeat(n)) + " ";
      let L = M.length + y + x;
      let P = Math.max(0, t - L);
      return WV.jsxs(gXd, {
        flexDirection: "row",
        children: [WV.jsx(NoSelect, {
          fromLeftEdge: true,
          children: WV.jsxs(Text, {
            color: o ? "text" : undefined,
            backgroundColor: I,
            dimColor: r,
            children: [M, g]
          })
        }), WV.jsxs(Text, {
          color: o ? "text" : undefined,
          backgroundColor: I,
          dimColor: r,
          children: [C, " ".repeat(P)]
        })]
      }, k);
    });
  }
  function iOp(e, t, n, r, o) {
    let s = Math.max(1, Math.floor(n));
    let i = nOp(e);
    let a = rOp(i);
    let l = aOp(a, t);
    let c = Math.max(...l.map(({
      i: d
    }) => d), 0);
    let u = Math.max(c.toString().length + 1, 0);
    return l.flatMap(d => {
      let {
        type: p,
        code: m,
        i: f,
        wordDiff: h,
        matchedLine: g
      } = d;
      if (h && g) {
        let E = sOp(d, s, u, r, o);
        if (E !== null) {
          return E;
        }
      }
      let y = 2;
      let _ = Math.max(1, s - u - 1 - y);
      return wrapText_export(m, _, "wrap").split(`
`).map((E, C) => {
        let x = `${p}-${f}-${C}`;
        let A = C === 0 ? f : undefined;
        let k = (A !== undefined ? A.toString().padStart(u) : " ".repeat(u)) + " ";
        let I = p === "add" ? "+" : p === "remove" ? "-" : " ";
        let O = k.length + 1 + an(E);
        let M = Math.max(0, s - O);
        let L = p === "add" ? r ? "diffAddedDimmed" : "diffAdded" : p === "remove" ? r ? "diffRemovedDimmed" : "diffRemoved" : undefined;
        return WV.jsxs(gXd, {
          flexDirection: "row",
          children: [WV.jsx(NoSelect, {
            fromLeftEdge: true,
            children: WV.jsxs(Text, {
              color: o ? "text" : undefined,
              backgroundColor: L,
              dimColor: r || p === "nochange",
              children: [k, I]
            })
          }), WV.jsxs(Text, {
            color: o ? "text" : undefined,
            backgroundColor: L,
            dimColor: r,
            children: [E, " ".repeat(M)]
          })]
        }, x);
      });
    });
  }
  function aOp(e, t) {
    let n = t;
    let r = [];
    let o = [...e];
    while (o.length > 0) {
      let s = o.shift();
      let {
        code: i,
        type: a,
        originalCode: l,
        wordDiff: c,
        matchedLine: u
      } = s;
      let d = {
        code: i,
        type: a,
        i: n,
        originalCode: l,
        wordDiff: c,
        matchedLine: u
      };
      switch (a) {
        case "nochange":
          n++;
          r.push(d);
          break;
        case "add":
          n++;
          r.push(d);
          break;
        case "remove":
          {
            r.push(d);
            let p = 0;
            while (o[0]?.type === "remove") {
              n++;
              let m = o.shift();
              let {
                code: f,
                type: h,
                originalCode: g,
                wordDiff: y,
                matchedLine: _
              } = m;
              let b = {
                code: f,
                type: h,
                i: n,
                originalCode: g,
                wordDiff: y,
                matchedLine: _
              };
              r.push(b);
              p++;
            }
            n -= p;
            break;
          }
      }
    }
    return r;
  }
  var yPa;
  var WV;
  var bPa = __lazy(() => {
    V9e();
    bc();
    et();
    yPa = __toESM(pt(), 1);
    WV = __toESM(ie(), 1);
  });
  function lOp(e) {
    return Math.max(e.oldStart + e.oldLines - 1, e.newStart + e.newLines - 1, 1).toString().length + 3;
  }
  function cOp(e, t, n, r, o, s, i, a) {
    let l = fPa();
    if (!l) {
      return null;
    }
    let c = a ? lOp(e) : 0;
    let u = c > 0 && c < s ? c : 0;
    let d = `${o}|${s}|${i ? 1 : 0}|${u}|${_$u.level}|${t ?? ""}|${n}`;
    let p = SPa.get(e);
    let m = p?.get(d);
    if (m) {
      return m;
    }
    let f = new l(e, t, n, r).render(o, s, i);
    if (f === null) {
      return null;
    }
    let h = null;
    let g = null;
    if (u > 0) {
      h = Array(f.length);
      g = Array(f.length);
      for (let _ = 0; _ < f.length; _++) {
        let [b, S] = q8i(f[_] ?? "", u);
        h[_] = b;
        g[_] = S;
      }
    }
    let y = {
      lines: f,
      gutterWidth: u,
      gutters: h,
      contents: g
    };
    if (!p) {
      p = new Map();
      SPa.set(e, p);
    }
    if (p.size >= 4) {
      p.clear();
    }
    p.set(d, y);
    return y;
  }
  var TPa;
  var EPa;
  var Jde;
  var SPa;
  var Xde;
  var Amt = __lazy(() => {
    Qq();
    et();
    zp();
    yPe();
    Oqn();
    bPa();
    TPa = __toESM(pt(), 1);
    EPa = __toESM(ot(), 1);
    Jde = __toESM(ie(), 1);
    SPa = new WeakMap();
    Xde = EPa.memo(function (t) {
      let n = TPa.c(26);
      let {
        patch: r,
        dim: o,
        filePath: s,
        firstLine: i,
        fileContent: a,
        width: l,
        skipHighlighting: c
      } = t;
      let u = c === undefined ? false : c;
      let [d] = useTheme();
      let m = K_().syntaxHighlightingDisabled ?? false;
      let f = Math.max(1, Math.floor(l));
      let h;
      if (n[0] !== o || n[1] !== a || n[2] !== s || n[3] !== i || n[4] !== r || n[5] !== f || n[6] !== u || n[7] !== m || n[8] !== d) {
        let C = qs();
        h = u || m ? null : cOp(r, i, s, a ?? null, d, f, o, C);
        n[0] = o;
        n[1] = a;
        n[2] = s;
        n[3] = i;
        n[4] = r;
        n[5] = f;
        n[6] = u;
        n[7] = m;
        n[8] = d;
        n[9] = h;
      } else {
        h = n[9];
      }
      let g = h;
      if (!g) {
        let C;
        if (n[10] !== o || n[11] !== r || n[12] !== l) {
          C = Jde.jsx(gXd, {
            children: Jde.jsx(_Pa, {
              patch: r,
              dim: o,
              width: l
            })
          });
          n[10] = o;
          n[11] = r;
          n[12] = l;
          n[13] = C;
        } else {
          C = n[13];
        }
        return C;
      }
      let {
        lines: y,
        gutterWidth: _,
        gutters: b,
        contents: S
      } = g;
      if (_ > 0 && b && S) {
        let C;
        if (n[14] !== _ || n[15] !== b) {
          C = Jde.jsx(NoSelect, {
            fromLeftEdge: true,
            children: Jde.jsx(RawAnsi, {
              lines: b,
              width: _
            })
          });
          n[14] = _;
          n[15] = b;
          n[16] = C;
        } else {
          C = n[16];
        }
        let x = f - _;
        let A;
        if (n[17] !== S || n[18] !== x) {
          A = Jde.jsx(RawAnsi, {
            lines: S,
            width: x
          });
          n[17] = S;
          n[18] = x;
          n[19] = A;
        } else {
          A = n[19];
        }
        let k;
        if (n[20] !== C || n[21] !== A) {
          k = Jde.jsxs(gXd, {
            flexDirection: "row",
            children: [C, A]
          });
          n[20] = C;
          n[21] = A;
          n[22] = k;
        } else {
          k = n[22];
        }
        return k;
      }
      let E;
      if (n[23] !== y || n[24] !== f) {
        E = Jde.jsx(gXd, {
          children: Jde.jsx(RawAnsi, {
            lines: y,
            width: f
          })
        });
        n[23] = y;
        n[24] = f;
        n[25] = E;
      } else {
        E = n[25];
      }
      return E;
    });
  });
  function L5e({
    hunks: e,
    dim: t,
    width: n,
    filePath: r,
    firstLine: o,
    fileContent: s
  }) {
    return eke(e.map(i => wGt.jsx(gXd, {
      flexDirection: "column",
      children: wGt.jsx(Xde, {
        patch: i,
        dim: t,
        width: n,
        filePath: r,
        firstLine: o,
        fileContent: s
      })
    }, i.newStart)), i => wGt.jsx(NoSelect, {
      fromLeftEdge: true,
      children: wGt.jsx(Text, {
        dimColor: true,
        children: "..."
      })
    }, `ellipsis-${i}`));
  }
  var wGt;
  var CGt = __lazy(() => {
    et();
    Amt();
    wGt = __toESM(ie(), 1);
  });
  function TMe(e) {
    let t = wPa.c(38);
    let {
      file_path: n,
      operation: r,
      patch: o,
      firstLine: s,
      fileContent: i,
      content: a,
      style: l,
      verbose: c
    } = e;
    let {
      columns: u
    } = Sr();
    let d;
    if (t[0] !== r) {
      d = zG.jsxs(Text, {
        color: "subtle",
        children: ["User rejected ", r, " to "]
      });
      t[0] = r;
      t[1] = d;
    } else {
      d = t[1];
    }
    let p;
    if (t[2] !== n || t[3] !== c) {
      p = c ? n : CPa.relative(Nt(), n);
      t[2] = n;
      t[3] = c;
      t[4] = p;
    } else {
      p = t[4];
    }
    let m;
    if (t[5] !== p) {
      m = zG.jsx(Text, {
        bold: true,
        color: "subtle",
        children: p
      });
      t[5] = p;
      t[6] = m;
    } else {
      m = t[6];
    }
    let f;
    if (t[7] !== d || t[8] !== m) {
      f = zG.jsxs(gXd, {
        flexDirection: "row",
        children: [d, m]
      });
      t[7] = d;
      t[8] = m;
      t[9] = f;
    } else {
      f = t[9];
    }
    let h = f;
    if (l === "condensed" && !c) {
      let b;
      if (t[10] !== h) {
        b = zG.jsx(Vn, {
          children: h
        });
        t[10] = h;
        t[11] = b;
      } else {
        b = t[11];
      }
      return b;
    }
    if (r === "write" && a !== undefined) {
      let b;
      let S;
      if (t[12] !== a || t[13] !== c) {
        let O = a.split(`
`);
        b = O.length - 10;
        S = c ? a : O.slice(0, 10).join(`
`);
        t[12] = a;
        t[13] = c;
        t[14] = b;
        t[15] = S;
      } else {
        b = t[14];
        S = t[15];
      }
      let C = S || "(No content)";
      let x = u - 12;
      let A;
      if (t[16] !== n || t[17] !== C || t[18] !== x) {
        A = zG.jsx(w$, {
          code: C,
          filePath: n,
          width: x,
          dim: true
        });
        t[16] = n;
        t[17] = C;
        t[18] = x;
        t[19] = A;
      } else {
        A = t[19];
      }
      let k;
      if (t[20] !== b || t[21] !== c) {
        k = !c && zG.jsx(B1, {
          count: b
        });
        t[20] = b;
        t[21] = c;
        t[22] = k;
      } else {
        k = t[22];
      }
      let I;
      if (t[23] !== A || t[24] !== k || t[25] !== h) {
        I = zG.jsx(Vn, {
          children: zG.jsxs(gXd, {
            flexDirection: "column",
            children: [h, A, k]
          })
        });
        t[23] = A;
        t[24] = k;
        t[25] = h;
        t[26] = I;
      } else {
        I = t[26];
      }
      return I;
    }
    if (!o || o.length === 0) {
      let b;
      if (t[27] !== h) {
        b = zG.jsx(Vn, {
          children: h
        });
        t[27] = h;
        t[28] = b;
      } else {
        b = t[28];
      }
      return b;
    }
    let g = u - 12;
    let y;
    if (t[29] !== i || t[30] !== n || t[31] !== s || t[32] !== o || t[33] !== g) {
      y = zG.jsx(L5e, {
        hunks: o,
        dim: true,
        width: g,
        filePath: n,
        firstLine: s,
        fileContent: i
      });
      t[29] = i;
      t[30] = n;
      t[31] = s;
      t[32] = o;
      t[33] = g;
      t[34] = y;
    } else {
      y = t[34];
    }
    let _;
    if (t[35] !== y || t[36] !== h) {
      _ = zG.jsx(Vn, {
        children: zG.jsxs(gXd, {
          flexDirection: "column",
          children: [h, y]
        })
      });
      t[35] = y;
      t[36] = h;
      t[37] = _;
    } else {
      _ = t[37];
    }
    return _;
  }
  var wPa;
  var CPa;
  var zG;
  var rgo = __lazy(() => {
    ki();
    vo();
    et();
    YX();
    SMe();
    Wl();
    CGt();
    wPa = __toESM(pt(), 1);
    CPa = require("path");
    zG = __toESM(ie(), 1);
  });
  function TM(e, t, n) {
    if (!(n?.supportsHyperlinks ?? Hk())) {
      if (t !== undefined) {
        let c = Li(t);
        if (c !== e && e !== `http://${c}` && e !== `https://${c}`) {
          return `${t} (${e})`;
        }
      }
      return e;
    }
    let l = ((n?.themeName ? yMn(n.themeName) : false) ? _$u.blue : _$u.blueBright)(t ?? e);
    return `${"\x1B]8;;"}${e}${"\x07"}${l}${"\x1B]8;;"}${"\x07"}`;
  }
  var EMe = __lazy(() => {
    uG();
    Xbe();
  });
  function OPa(e) {
    let t = kPa.c(2);
    let {
      children: n
    } = e;
    let r;
    if (t[0] !== n) {
      r = MPa.jsx(PPa.Provider, {
        value: true,
        children: n
      });
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    return r;
  }
  function DPa() {
    return IPa.useContext(PPa);
  }
  var kPa;
  var APa;
  var IPa;
  var MPa;
  var PPa;
  var ogo = __lazy(() => {
    kPa = __toESM(pt(), 1);
    APa = __toESM(ot(), 1);
    IPa = __toESM(ot(), 1);
    MPa = __toESM(ie(), 1);
    PPa = APa.createContext(false);
  });
  function uOp(e) {
    try {
      let t = qt(e);
      let n = De(t);
      let r = e.replaceAll("\\/", "/").replace(/\s+/g, "");
      let o = n.replace(/\s+/g, "");
      if (r !== o) {
        return e;
      }
      return De(t, null, 2);
    } catch {
      return e;
    }
  }
  function pOp(e) {
    if (e.length > 1e4) {
      return e;
    }
    return e.split(`
`).map(uOp).join(`
`);
  }
  function FPa(e, t) {
    if (e.length > 1e5) {
      return e;
    }
    let n = r => r.replace(mOp, o => TM(o, undefined, {
      themeName: t
    }));
    if (!e.includes(TPe)) {
      return n(e);
    }
    return e.split(`
`).map(r => r.includes(TPe) ? r : n(r)).join(`
`);
  }
  function vU(e) {
    let t = NPa.c(14);
    let {
      content: n,
      verbose: r,
      isError: o,
      isWarning: s
    } = e;
    let {
      columns: i
    } = Sr();
    let [a] = useTheme();
    let l = DPa();
    let c = LPa.useContext(dMe);
    let u = r || l;
    let d;
    if (t[0] !== n || t[1] !== a) {
      d = FPa(pOp(n), a);
      t[0] = n;
      t[1] = a;
      t[2] = d;
    } else {
      d = t[2];
    }
    let p = d;
    let m;
    e: {
      if (u) {
        let b;
        if (t[3] !== p) {
          b = Mqn(p);
          t[3] = p;
          t[4] = b;
        } else {
          b = t[4];
        }
        m = b;
        break e;
      }
      let _;
      if (t[5] !== i || t[6] !== p || t[7] !== c) {
        _ = Mqn(MIa(p, i, c));
        t[5] = i;
        t[6] = p;
        t[7] = c;
        t[8] = _;
      } else {
        _ = t[8];
      }
      m = _;
    }
    let f = m;
    let h = o ? "error" : s ? "warning" : undefined;
    let g;
    if (t[9] !== f) {
      g = Dqn.jsx(Ansi, {
        children: f
      });
      t[9] = f;
      t[10] = g;
    } else {
      g = t[10];
    }
    let y;
    if (t[11] !== h || t[12] !== g) {
      y = Dqn.jsx(Vn, {
        children: Dqn.jsx(Text, {
          color: h,
          children: g
        })
      });
      t[11] = h;
      t[12] = g;
      t[13] = y;
    } else {
      y = t[13];
    }
    return y;
  }
  function Mqn(e) {
    return e.replace(/\u001b\[([0-9]+;)*4(;[0-9]+)*m|\u001b\[4(;[0-9]+)*m|\u001b\[([0-9]+;)*4m/g, "");
  }
  var NPa;
  var LPa;
  var Dqn;
  var mOp;
  var vMe = __lazy(() => {
    ki();
    iG();
    et();
    EMe();
    mMe();
    FJ();
    Wl();
    yGt();
    ogo();
    NPa = __toESM(pt(), 1);
    LPa = __toESM(ot(), 1);
    Dqn = __toESM(ie(), 1);
    mOp = /https?:\/\/[^\s"'<>\\\x00-\x1f]+/g;
  });
  function UPa(e) {
    if (typeof e === "string") {
      return hOp(e, 9);
    }
    if (!Array.isArray(e)) {
      return false;
    }
    let t = 0;
    for (let n of e) {
      if (t += 1, t > 10) {
        return true;
      }
      if (n.type !== "text") {
        continue;
      }
      let r = n.text;
      let o = 0;
      while (t <= 10) {
        if (o = r.indexOf(`
`, o), o === -1) {
          break;
        }
        o++;
        t++;
      }
      if (t > 10) {
        return true;
      }
    }
    return false;
  }
  function hOp(e, t) {
    let n = 0;
    for (let r = 0; r <= t; r++) {
      if (n = e.indexOf(`
`, n), n === -1) {
        return false;
      }
      n++;
    }
    return true;
  }
  function Nqn(e) {
    return e.replace(/<sandbox_violations>[\s\S]*?<\/sandbox_violations>/g, "");
  }
  function Rw(e) {
    let t = BPa.c(24);
    let {
      result: n,
      verbose: r
    } = e;
    let o;
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    if (t[0] !== n || t[1] !== r) {
      let h;
      if (typeof n !== "string") {
        h = "Tool execution failed";
      } else {
        let g = Nl(n, "tool_use_error") ?? n;
        let b = Nqn(g).replace(/<\/?error>/g, "").trim();
        if (!r && b.includes("InputValidationError: ")) {
          h = "Invalid tool parameters";
        } else if (b.startsWith("Error: ") || b.startsWith("Cancelled: ")) {
          h = b;
        } else {
          h = `Error: ${b}`;
        }
      }
      a = Ru(h, `
`) + 1 - 10;
      i = Vn;
      s = gXd;
      u = "column";
      o = Text;
      l = "error";
      c = Mqn(r ? h : h.split(`
`).slice(0, 10).join(`
`));
      t[0] = n;
      t[1] = r;
      t[2] = o;
      t[3] = s;
      t[4] = i;
      t[5] = a;
      t[6] = l;
      t[7] = c;
      t[8] = u;
    } else {
      o = t[2];
      s = t[3];
      i = t[4];
      a = t[5];
      l = t[6];
      c = t[7];
      u = t[8];
    }
    let d;
    if (t[9] !== o || t[10] !== l || t[11] !== c) {
      d = Imt.jsx(o, {
        color: l,
        children: c
      });
      t[9] = o;
      t[10] = l;
      t[11] = c;
      t[12] = d;
    } else {
      d = t[12];
    }
    let p;
    if (t[13] !== a || t[14] !== r) {
      p = !r && Imt.jsx(B1, {
        count: a,
        expandable: true
      });
      t[13] = a;
      t[14] = r;
      t[15] = p;
    } else {
      p = t[15];
    }
    let m;
    if (t[16] !== s || t[17] !== u || t[18] !== d || t[19] !== p) {
      m = Imt.jsxs(s, {
        flexDirection: u,
        children: [d, p]
      });
      t[16] = s;
      t[17] = u;
      t[18] = d;
      t[19] = p;
      t[20] = m;
    } else {
      m = t[20];
    }
    let f;
    if (t[21] !== i || t[22] !== m) {
      f = Imt.jsx(i, {
        children: m
      });
      t[21] = i;
      t[22] = m;
      t[23] = f;
    } else {
      f = t[23];
    }
    return f;
  }
  var BPa;
  var Imt;
  var KG = __lazy(() => {
    vMe();
    ro();
    et();
    Zn();
    YX();
    Wl();
    BPa = __toESM(pt(), 1);
    Imt = __toESM(ie(), 1);
  });
  function Lqn(e) {
    let t = $Pa.c(25);
    let {
      filePath: n,
      structuredPatch: r,
      firstLine: o,
      fileContent: s,
      style: i,
      verbose: a,
      previewHint: l,
      collapsed: c
    } = e;
    let {
      columns: u
    } = Sr();
    let d = r.reduce(_Op, 0);
    let p = r.reduce(gOp, 0);
    let m;
    if (t[0] !== d) {
      m = d > 0 ? EM.jsxs(EM.Fragment, {
        children: ["Added ", EM.jsx(Text, {
          bold: true,
          children: d
        }), " ", d > 1 ? "lines" : "line"]
      }) : null;
      t[0] = d;
      t[1] = m;
    } else {
      m = t[1];
    }
    let f = d > 0 && p > 0 ? ", " : null;
    let h;
    if (t[2] !== d || t[3] !== p) {
      h = p > 0 ? EM.jsxs(EM.Fragment, {
        children: [d === 0 ? "R" : "r", "emoved ", EM.jsx(Text, {
          bold: true,
          children: p
        }), " ", p > 1 ? "lines" : "line"]
      }) : null;
      t[2] = d;
      t[3] = p;
      t[4] = h;
    } else {
      h = t[4];
    }
    let g;
    if (t[5] !== m || t[6] !== f || t[7] !== h) {
      g = EM.jsxs(Text, {
        children: [m, f, h]
      });
      t[5] = m;
      t[6] = f;
      t[7] = h;
      t[8] = g;
    } else {
      g = t[8];
    }
    let y = g;
    if (l) {
      if (i !== "condensed" && !a) {
        let C;
        if (t[9] !== l) {
          C = EM.jsx(Vn, {
            children: EM.jsx(Text, {
              dimColor: true,
              children: l
            })
          });
          t[9] = l;
          t[10] = C;
        } else {
          C = t[10];
        }
        return C;
      }
    } else if (i === "condensed" && !a) {
      return y;
    } else if (c && !a && d + p > 0) {
      let C;
      if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
        C = EM.jsx(wv, {});
        t[11] = C;
      } else {
        C = t[11];
      }
      let x;
      if (t[12] !== y) {
        x = EM.jsx(Vn, {
          children: EM.jsxs(Text, {
            children: [y, " ", C]
          })
        });
        t[12] = y;
        t[13] = x;
      } else {
        x = t[13];
      }
      return x;
    }
    let _;
    if (t[14] !== y) {
      _ = EM.jsx(Text, {
        children: y
      });
      t[14] = y;
      t[15] = _;
    } else {
      _ = t[15];
    }
    let b = u - 12;
    let S;
    if (t[16] !== s || t[17] !== n || t[18] !== o || t[19] !== r || t[20] !== b) {
      S = EM.jsx(L5e, {
        hunks: r,
        dim: false,
        width: b,
        filePath: n,
        firstLine: o,
        fileContent: s
      });
      t[16] = s;
      t[17] = n;
      t[18] = o;
      t[19] = r;
      t[20] = b;
      t[21] = S;
    } else {
      S = t[21];
    }
    let E;
    if (t[22] !== _ || t[23] !== S) {
      E = EM.jsx(Vn, {
        children: EM.jsxs(gXd, {
          flexDirection: "column",
          children: [_, S]
        })
      });
      t[22] = _;
      t[23] = S;
      t[24] = E;
    } else {
      E = t[24];
    }
    return E;
  }
  function gOp(e, t) {
    return e + Bn(t.lines, yOp);
  }
  function yOp(e) {
    return e.startsWith("-");
  }
  function _Op(e, t) {
    return e + Bn(t.lines, bOp);
  }
  function bOp(e) {
    return e.startsWith("+");
  }
  var $Pa;
  var EM;
  var igo = __lazy(() => {
    ki();
    et();
    Xq();
    Wl();
    CGt();
    $Pa = __toESM(pt(), 1);
    EM = __toESM(ie(), 1);
  });
  function vM(e) {
    let t = HPa.c(5);
    let {
      filePath: n,
      children: r
    } = e;
    let o;
    if (t[0] !== n) {
      o = jPa.pathToFileURL(n);
      t[0] = n;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = r ?? n;
    let i;
    if (t[2] !== o.href || t[3] !== s) {
      i = qPa.jsx(Link, {
        url: o.href,
        children: s
      });
      t[2] = o.href;
      t[3] = s;
      t[4] = i;
    } else {
      i = t[4];
    }
    return i;
  }
  var HPa;
  var jPa;
  var qPa;
  var XTe = __lazy(() => {
    _ue();
    HPa = __toESM(pt(), 1);
    jPa = require("url");
    qPa = __toESM(ie(), 1);
  });
  function WPa(e) {
    ago.add(e);
    e.finally(() => ago.delete(e));
  }
  async function GPa() {
    await Promise.allSettled(Array.from(ago));
  }
  var ago;
  var lgo = __lazy(() => {
    ago = new Set();
  });
  var KPa = {};