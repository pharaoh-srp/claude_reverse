  function G3a(e) {
    let t = e.toLowerCase();
    let n = t.startsWith("file://") ? "file-uri" : t.startsWith("_claude_fs_right:") ? "fs-right" : t.startsWith("_claude_fs_left:") ? "fs-left" : "bare";
    let r = e.includes("\\");
    let o = e.includes("/");
    let s = r && o ? "mixed" : r ? "back" : o ? "fwd" : "none";
    let i = /%[0-9A-Fa-f]{2}/.test(e) ? "pct" : "plain";
    let a = j3p.exec(e)?.[1];
    let l = a === undefined ? "none" : a === a.toUpperCase() ? "upper" : "lower";
    return `scheme=${n} sep=${s} enc=${i} drive=${l}`;
  }
  class g9 {
    static instance;
    baseline = new Map();
    initialized = false;
    mcpClient;
    lastProcessedTimestamps = new Map();
    rightFileDiagnosticsState = new Map();
    static getInstance() {
      if (!g9.instance) {
        g9.instance = new g9();
      }
      return g9.instance;
    }
    initialize(e) {
      if (this.initialized) {
        return;
      }
      this.mcpClient = e;
      this.initialized = true;
    }
    async shutdown() {
      this.initialized = false;
      this.baseline.clear();
      this.rightFileDiagnosticsState.clear();
      this.lastProcessedTimestamps.clear();
    }
    reset() {
      this.baseline.clear();
      this.rightFileDiagnosticsState.clear();
      this.lastProcessedTimestamps.clear();
    }
    normalizeFileUri(e) {
      let t = $3p.find(o => e.startsWith(o));
      let n = t ? e.slice(t.length) : e;
      let r = t !== undefined && H3p.test(n) ? n.slice(1) : n;
      return yC(r);
    }
    async ensureFileOpened(e) {
      if (!this.initialized || !this.mcpClient || this.mcpClient.type !== "connected") {
        return;
      }
      try {
        await Uoe("openFile", {
          filePath: e,
          preview: false,
          startText: "",
          endText: "",
          selectToEndOfLine: false,
          makeFrontmost: false
        }, this.mcpClient);
      } catch (t) {
        logForDebugging(`Failed to open file in IDE via MCP: ${t}`, {
          level: "error"
        });
      }
    }
    async beforeFileEdited(e) {
      if (!this.initialized || !this.mcpClient || this.mcpClient.type !== "connected") {
        return;
      }
      let t = Date.now();
      try {
        let n = await Uoe("getDiagnostics", {
          uri: `file://${e}`
        }, this.mcpClient);
        let r = this.parseDiagnosticResult(n)[0];
        if (r) {
          if (!tAs(this.normalizeFileUri(e), this.normalizeFileUri(r.uri))) {
            Oe($o(new V3a(`Diagnostics file path mismatch: expected ${e}, got ${r.uri}`), `Diagnostics file path mismatch: expected ${G3a(e)}, got ${G3a(r.uri)}`));
            return;
          }
          let o = this.normalizeFileUri(e);
          this.baseline.set(o, r.diagnostics);
          this.lastProcessedTimestamps.set(o, t);
        } else {
          let o = this.normalizeFileUri(e);
          this.baseline.set(o, []);
          this.lastProcessedTimestamps.set(o, t);
        }
      } catch (n) {}
    }
    async getNewDiagnostics() {
      if (!this.initialized || !this.mcpClient || this.mcpClient.type !== "connected") {
        return [];
      }
      let e = [];
      try {
        let o = await Uoe("getDiagnostics", {}, this.mcpClient);
        e = this.parseDiagnosticResult(o);
      } catch (o) {
        return [];
      }
      let t = e.filter(o => this.baseline.vZc(this.normalizeFileUri(o.uri))).filter(o => o.uri.startsWith("file://"));
      let n = new Map();
      e.filter(o => this.baseline.vZc(this.normalizeFileUri(o.uri))).filter(o => o.uri.startsWith("_claude_fs_right:")).forEach(o => {
        n.set(this.normalizeFileUri(o.uri), o);
      });
      let r = [];
      for (let o of t) {
        let s = this.normalizeFileUri(o.uri);
        let i = this.baseline.get(s) || [];
        let a = n.get(s);
        let l = o;
        if (a) {
          let u = this.rightFileDiagnosticsState.get(s);
          if (!u || !this.areDiagnosticArraysEqual(u, a.diagnostics)) {
            l = a;
          }
          this.rightFileDiagnosticsState.set(s, a.diagnostics);
        }
        let c = l.diagnostics.filter(u => !i.some(d => this.areDiagnosticsEqual(u, d)));
        if (c.length > 0) {
          r.push({
            uri: o.uri,
            diagnostics: c
          });
        }
        this.baseline.set(s, l.diagnostics);
      }
      return r;
    }
    parseDiagnosticResult(e) {
      if (Array.isArray(e)) {
        let t = e.find(n => n.type === "text");
        if (t && "text" in t) {
          return qt(t.text);
        }
      }
      return [];
    }
    areDiagnosticsEqual(e, t) {
      return e.message === t.message && e.severity === t.severity && e.source === t.source && e.code === t.code && e.range.start.line === t.range.start.line && e.range.start.character === t.range.start.character && e.range.end.line === t.range.end.line && e.range.end.character === t.range.end.character;
    }
    areDiagnosticArraysEqual(e, t) {
      if (e.length !== t.length) {
        return false;
      }
      return e.every(n => t.some(r => this.areDiagnosticsEqual(n, r))) && t.every(n => e.some(r => this.areDiagnosticsEqual(r, n)));
    }
    async handleQueryStart(e) {
      if (!this.initialized) {
        let t = p9(e);
        if (t) {
          this.initialize(t);
        }
      } else {
        this.reset();
      }
    }
    static formatDiagnosticsSummary(e) {
      let n = e.map(r => {
        let o = r.uri.split("/").pop() || r.uri;
        let s = r.diagnostics.map(i => `  ${g9.getSeveritySymbol(i.severity)} [Line ${i.range.start.line + 1}:${i.range.start.character + 1}] ${i.message}${i.code ? ` [${i.code}]` : ""}${i.source ? ` (${i.source})` : ""}`).join(`
`);
        return `${o}:
${s}`;
      }).join(`

`);
      if (n.length > 4000) {
        return n.slice(0, 4000 - 12) + "\u2026[truncated]";
      }
      return n;
    }
    static formatDiagnosticsBlock(e) {
      return `<new-diagnostics>The following new diagnostic issues were detected:

${g9.formatDiagnosticsSummary(e)}</new-diagnostics>`;
    }
    static getSeveritySymbol(e) {
      return {
        Error: vGd.cross,
        Warning: vGd.warning,
        Info: vGd.info,
        Hint: vGd.star
      }[e] || vGd.bullet;
    }
  }
  var V3a;
  var $3p;
  var H3p;
  var j3p;
  var vEe;
  var K6e = __lazy(() => {
    Rn();
    eA();
    je();
    dt();
    Zl();
    bT();
    V3a = class V3a extends gIt {};
    $3p = ["file://", "_claude_fs_right:", "_claude_fs_left:"];
    H3p = /^[\\/][A-Za-z]:[\\/]/;
    j3p = /(?:^|[\\/])([A-Za-z])(?::|%3[Aa])(?=[\\/]|%5[Cc]|%2[Ff])/;
    vEe = g9.getInstance();
  });
  function tz(e, t) {
    Oe($o(sr(e), t));
  }
  var yht = __lazy(() => {
    dt();
    Rn();
  });
  function J3a({
    serverName: e,
    files: t
  }) {
    let n = Y3a.randomUUID();
    logForDebugging(`LSP Diagnostics: Registering ${t.length} diagnostic file(s) from ${e} (ID: ${n})`);
    $oe.set(n, {
      serverName: e,
      files: t,
      timestamp: Date.now(),
      attachmentSent: false
    });
  }
  function K3a(e) {
    switch (e) {
      case "Error":
        return 1;
      case "Warning":
        return 2;
      case "Info":
        return 3;
      case "Hint":
        return 4;
      default:
        return 4;
    }
  }
  function X3a(e) {
    return De({
      message: e.message,
      severity: e.severity,
      range: e.range,
      source: e.source || null,
      code: e.code || null
    });
  }
  function W3p(e) {
    let t = new Map();
    let n = [];
    for (let r of e) {
      if (!t.vZc(r.uri)) {
        t.set(r.uri, new Set());
        n.push({
          uri: r.uri,
          diagnostics: []
        });
      }
      let o = t.get(r.uri);
      let s = n.find(a => a.uri === r.uri);
      let i = gNe.get(r.uri) || new Set();
      for (let a of r.diagnostics) {
        try {
          let l = X3a(a);
          if (o.vZc(l) || i.vZc(l)) {
            continue;
          }
          o.add(l);
          s.diagnostics.push(a);
        } catch (l) {
          let c = sr(l);
          let u = a.message?.substring(0, 100) || "<no message>";
          tz(Error(`Failed to deduplicate diagnostic in ${r.uri}: ${c.message}. Diagnostic message: ${u}`), "Failed to deduplicate diagnostic");
          s.diagnostics.push(a);
        }
      }
    }
    return n.filter(r => r.diagnostics.length > 0);
  }
  function Q3a() {
    logForDebugging(`LSP Diagnostics: Checking registry - ${$oe.size} pending`);
    let e = [];
    let t = new Set();
    let n = [];
    for (let u of $oe.values()) {
      if (!u.attachmentSent) {
        e.push(...u.files);
        t.add(u.serverName);
        n.push(u);
      }
    }
    if (e.length === 0) {
      return [];
    }
    let r;
    let o = false;
    try {
      r = W3p(e);
    } catch (u) {
      let d = sr(u);
      tz(Error(`Failed to deduplicate LSP diagnostics: ${d.message}`), "Failed to deduplicate LSP diagnostics");
      o = true;
      r = e;
    }
    for (let u of n) {
      u.attachmentSent = true;
    }
    for (let [u, d] of $oe) {
      if (d.attachmentSent) {
        $oe.delete(u);
      }
    }
    let s = e.reduce((u, d) => u + d.diagnostics.length, 0);
    let i = r.reduce((u, d) => u + d.diagnostics.length, 0);
    if (s > i) {
      logForDebugging(`LSP Diagnostics: Deduplication removed ${s - i} duplicate diagnostic(s)`);
    }
    let a = 0;
    let l = 0;
    for (let u of r) {
      if (u.diagnostics.sort((p, m) => K3a(p.severity) - K3a(m.severity)), u.diagnostics.length > 10) {
        l += u.diagnostics.length - 10;
        u.diagnostics = u.diagnostics.slice(0, 10);
      }
      let d = 30 - a;
      if (u.diagnostics.length > d) {
        l += u.diagnostics.length - d;
        u.diagnostics = u.diagnostics.slice(0, d);
      }
      a += u.diagnostics.length;
    }
    if (r = r.filter(u => u.diagnostics.length > 0), l > 0) {
      logForDebugging(`LSP Diagnostics: Volume limiting removed ${l} diagnostic(s) (max ${10}/file, ${30} total)`);
    }
    for (let u of r) {
      if (!gNe.vZc(u.uri)) {
        gNe.set(u.uri, new Set());
      }
      let d = gNe.get(u.uri);
      for (let p of u.diagnostics) {
        try {
          d.add(X3a(p));
        } catch (m) {
          let f = sr(m);
          let h = p.message?.substring(0, 100) || "<no message>";
          tz(Error(`Failed to track delivered diagnostic in ${u.uri}: ${f.message}. Diagnostic message: ${h}`), "Failed to track delivered diagnostic");
        }
      }
    }
    let c = r.reduce((u, d) => u + d.diagnostics.length, 0);
    if (c === 0) {
      logForDebugging("LSP Diagnostics: No new diagnostics to deliver (all filtered by deduplication)");
      return [];
    }
    if (logForDebugging(`LSP Diagnostics: Delivering ${r.length} file(s) with ${c} diagnostic(s) from ${t.size} server(s)`), o) {
      Et("lsp_diagnostics_deliver", "lsp_diagnostics_dedup_failed");
    } else {
      Pe("lsp_diagnostics_deliver");
    }
    return [{
      serverName: Array.from(t).join(", "),
      files: r
    }];
  }
  function Z3a() {
    logForDebugging(`LSP Diagnostics: Clearing ${$oe.size} pending diagnostic(s)`);
    $oe.clear();
  }
  function e4a() {
    logForDebugging(`LSP Diagnostics: Resetting all state (${$oe.size} pending, ${gNe.size} files tracked)`);
    $oe.clear();
    gNe.clear();
  }
  function MGn(e) {
    if (gNe.vZc(e)) {
      logForDebugging(`LSP Diagnostics: Clearing delivered diagnostics for ${e}`);
      gNe.delete(e);
    }
  }
  function NGn(e) {
    let t = 0;
    for (let [n, r] of $oe) {
      let o = r.files.filter(s => s.uri !== e);
      if (o.length === r.files.length) {
        continue;
      }
      if (o.length === 0) {
        $oe.delete(n);
      } else {
        r.files = o;
      }
      t++;
    }
    if (t > 0) {
      logForDebugging(`LSP Diagnostics: Purged ${t} pending entry(ies) referencing ${e}`);
    }
  }
  var Y3a;
  var $oe;
  var gNe;
  var _ht = __lazy(() => {
    snt();
    je();
    dt();
    ln();
    yht();
    Y3a = require("crypto");
    $oe = new Map();
    gNe = new tW({
      max: 500
    });
  });
  function G3p(e, t) {
    let n = yNe.resolve(e);
    let r = yNe.resolve(e, t);
    let o = yNe.relative(n, r);
    if (o.startsWith("..") || yNe.resolve(o) === o) {
      return null;
    }
    return r;
  }
  async function Y6e(e, t = []) {
    let n = {};
    let r = yNe.join(e.path, ".lsp.json");
    try {
      let o = await nEo.readFile(r, "utf-8");
      let s = qt(o);
      let i = v.record(v.string(), Unt()).safeParse(s);
      if (i.success) {
        Object.assign(n, i.data);
      } else {
        let a = `LSP config validation failed for .lsp.json in plugin ${e.name}: ${i.error.message}`;
        logForDebugging(a, {
          level: "error"
        });
        t.push({
          type: "lsp-config-invalid",
          plugin: e.name,
          serverName: ".lsp.json",
          validationError: i.error.message,
          source: e.repository
        });
      }
    } catch (o) {
      if (!fn(o)) {
        let s = o instanceof Error ? `Failed to read/parse .lsp.json in plugin ${e.name}: ${o.message}` : `Failed to read/parse .lsp.json file in plugin ${e.name}`;
        logForDebugging(s, {
          level: "error"
        });
        t.push({
          type: "lsp-config-invalid",
          plugin: e.name,
          serverName: ".lsp.json",
          validationError: o instanceof Error ? `Failed to parse JSON: ${o.message}` : "Failed to parse JSON file",
          source: e.repository
        });
      }
    }
    if (e.manifest.lspServers) {
      let o = await V3p(e.manifest.lspServers, e, t);
      if (o) {
        Object.assign(n, o);
      }
    }
    return Object.keys(n).length > 0 ? n : undefined;
  }
  async function V3p(e, t, n) {
    let r = {};
    let o = Array.isArray(e) ? e : [e];
    for (let s of o) {
      if (typeof s === "string") {
        let i = G3p(t.path, s);
        if (!i) {
          let a = `Security: Path traversal attempt blocked in plugin ${t.name}: ${s}`;
          logForDebugging(a, {
            level: "error"
          });
          n.push({
            type: "lsp-config-invalid",
            plugin: t.name,
            serverName: s,
            validationError: "Invalid path: must be relative and within plugin directory",
            source: t.repository
          });
          continue;
        }
        try {
          let a = await nEo.readFile(i, "utf-8");
          let l = qt(a);
          let c = v.record(v.string(), Unt()).safeParse(l);
          if (c.success) {
            Object.assign(r, c.data);
          } else {
            let u = `LSP config validation failed for ${s} in plugin ${t.name}: ${c.error.message}`;
            logForDebugging(u, {
              level: "error"
            });
            n.push({
              type: "lsp-config-invalid",
              plugin: t.name,
              serverName: s,
              validationError: c.error.message,
              source: t.repository
            });
          }
        } catch (a) {
          let l = a instanceof Error ? `Failed to read/parse LSP config from ${s} in plugin ${t.name}: ${a.message}` : `Failed to read/parse LSP config file ${s} in plugin ${t.name}`;
          logForDebugging(l, {
            level: "error"
          });
          n.push({
            type: "lsp-config-invalid",
            plugin: t.name,
            serverName: s,
            validationError: a instanceof Error ? `Failed to parse JSON: ${a.message}` : "Failed to parse JSON file",
            source: t.repository
          });
        }
      } else {
        for (let [i, a] of Object.entries(s)) {
          let l = Unt().safeParse(a);
          if (l.success) {
            r[i] = l.data;
          } else {
            let c = `LSP config validation failed for inline server "${i}" in plugin ${t.name}: ${l.error.message}`;
            logForDebugging(c, {
              level: "error"
            });
            n.push({
              type: "lsp-config-invalid",
              plugin: t.name,
              serverName: i,
              validationError: l.error.message,
              source: t.repository
            });
          }
        }
      }
    }
    return Object.keys(r).length > 0 ? r : undefined;
  }
  function z3p(e, t, n, r) {
    let o = [];
    let s = l => {
      let c = Ooe(l, t);
      if (n) {
        c = mEe(c, n);
      }
      let {
        expanded: u,
        missingVars: d
      } = Eoe(c);
      o.push(...d);
      return u;
    };
    let i = {
      ...e
    };
    if (i.command) {
      i.command = s(i.command);
    }
    if (i.args) {
      i.args = i.args.map(l => s(l));
    }
    let a = {
      CLAUDE_PLUGIN_ROOT: t.path,
      CLAUDE_PLUGIN_DATA: lTe(t.source),
      CLAUDE_PROJECT_DIR: getProjectRoot(),
      ...(i.env || {})
    };
    for (let [l, c] of Object.entries(a)) {
      if (l !== "CLAUDE_PLUGIN_ROOT" && l !== "CLAUDE_PLUGIN_DATA" && l !== "CLAUDE_PROJECT_DIR") {
        a[l] = s(c);
      }
    }
    if (i.env = a, i.workspaceFolder) {
      i.workspaceFolder = s(i.workspaceFolder);
    }
    if (o.length > 0) {
      let c = `Missing environment variables in plugin LSP config: ${Ro(o).join(", ")}`;
      logForDebugging(c, {
        level: "error"
      });
    }
    return i;
  }
  function LGn(e) {
    let t = [];
    let n = new Map();
    for (let r of e) {
      if (!r.enabled || !r.lspServers) {
        continue;
      }
      for (let [o, s] of Object.entries(r.lspServers)) {
        if (!s.extensionToLanguage) {
          continue;
        }
        let i = `plugin:${r.name}:${o}`;
        for (let a of Object.keys(s.extensionToLanguage)) {
          let l = a.toLowerCase();
          let c = n.get(l);
          if (c === undefined) {
            n.set(l, i);
          } else if (c !== i) {
            t.push({
              type: "lsp-extension-conflict",
              source: r.source,
              plugin: r.name,
              serverName: o,
              extension: l,
              activeServer: c
            });
          }
        }
      }
    }
    return t;
  }
  function K3p(e, t) {
    let n = {};
    for (let [r, o] of Object.entries(e)) {
      let s = `plugin:${t}:${r}`;
      n[s] = {
        ...o,
        scope: "dynamic",
        source: t
      };
    }
    return n;
  }
  async function t4a(e, t = []) {
    if (!e.enabled) {
      return;
    }
    let n = e.lspServers || (await Y6e(e, t));
    if (!n) {
      return;
    }
    let r = e.manifest.userConfig ? W1(Poe(e)) : undefined;
    let o = {};
    for (let [s, i] of Object.entries(n)) {
      o[s] = z3p(i, e, r, t);
    }
    return K3p(o, e.name);
  }
  var nEo;
  var yNe;
  var q5t = __lazy(() => {
    at();
    je();
    dt();
    k1();
    a9();
    TC();
    nEo = require("fs/promises");
    yNe = require("path");
  });
  async function n4a() {
    let e = {};
    try {
      let {
        enabled: t
      } = await loadAllPluginsCacheOnly();
      let n = await Promise.all(t.map(async r => {
        let o = [];
        try {
          let s = await t4a(r, o);
          return {
            plugin: r,
            scopedServers: s,
            errors: o
          };
        } catch (s) {
          logForDebugging(`Failed to load LSP servers for plugin ${r.name}: ${s}`, {
            level: "error"
          });
          return {
            plugin: r,
            scopedServers: undefined,
            errors: o
          };
        }
      }));
      for (let {
        plugin: r,
        scopedServers: o,
        errors: s
      } of n) {
        let i = o ? Object.keys(o).length : 0;
        if (i > 0) {
          Object.assign(e, o);
          logForDebugging(`Loaded ${i} LSP server(s) from plugin: ${r.name}`);
        }
        if (s.length > 0) {
          logForDebugging(`${s.length} error(s) loading LSP servers from plugin: ${r.name}`);
        }
      }
      logForDebugging(`Total LSP servers loaded: ${Object.keys(e).length}`);
    } catch (t) {
      logForDebugging(`Error loading LSP servers: ${he(t)}`, {
        level: "error"
      });
    }
    return {
      servers: e
    };
  }
  var r4a = __lazy(() => {
    je();
    dt();
    q5t();
    xg();
  });