  __export(EWa, {
    createLSPClient: () => createLSPClient
  });
  function createLSPClient(e, t) {
    let n;
    let r;
    let o;
    let s = false;
    let i = false;
    let a;
    let l = false;
    let c;
    let u;
    let d;
    let p;
    let m = [];
    let f = [];
    function h() {
      if (i) {
        throw a || Error(`LSP server ${e} failed to start`);
      }
    }
    return {
      get capabilities() {
        return o;
      },
      get isInitialized() {
        return s;
      },
      async start(g, y, _) {
        try {
          if (n = dIs(g, y, {
            stdio: ["pipe", "pipe", "pipe"],
            env: {
              ...subprocessEnv(),
              ..._?.env
            },
            extendEnv: false,
            cwd: _?.cwd,
            windowsHide: true
          }), !n.stdout || !n.stdin) {
            throw Error("LSP server process stdio not available");
          }
          let b = n;
          if (await new Promise((C, x) => {
            let A = () => {
              I();
              C();
            };
            let k = O => {
              I();
              x(O);
            };
            let I = () => {
              b.removeListener("spawn", A);
              b.removeListener("error", k);
            };
            b.once("spawn", A);
            b.once("error", k);
          }), b.pid) {
            OOn("lsp", b.pid);
            b.once("close", () => {
              if (b.pid) {
                wji(b.pid);
              }
            });
          }
          if (n.stderr) {
            p = C => {
              let x = C.toString().trim();
              if (x) {
                logForDebugging(`[LSP SERVER ${e}] ${x}`);
              }
            };
            n.stderr.on("data", p);
          }
          c = C => {
            if (!l) {
              i = true;
              a = C;
              logForDebugging(`LSP server ${e} failed to start: ${C.message}`, {
                level: "error"
              });
            }
          };
          n.on("error", c);
          u = (C, x) => {
            if (C !== 0 && C !== null && !l) {
              s = false;
              i = false;
              a = undefined;
              let A = Error(`LSP server ${e} crashed with exit code ${C}`);
              logForDebugging(`LSP server ${e} crashed with exit code ${C}`, {
                level: "error"
              });
              t?.(A);
            }
          };
          n.on("exit", u);
          d = C => {
            if (!l) {
              logForDebugging(`LSP server ${e} stdin error: ${C.message}`);
            }
          };
          n.stdin.on("error", d);
          let S = new ENe.StreamMessageReader(n.stdout);
          let E = new ENe.StreamMessageWriter(n.stdin);
          r = ENe.createMessageConnection(S, E);
          r.onError(([C, x, A]) => {
            if (!l) {
              i = true;
              a = C;
              logForDebugging(`LSP server ${e} connection error: ${C.message}`, {
                level: "error"
              });
            }
          });
          r.onClose(() => {
            if (!l) {
              s = false;
              logForDebugging(`LSP server ${e} connection closed`);
            }
          });
          r.listen();
          r.trace(ENe.Trace.Verbose, {
            log: C => {
              logForDebugging(`[LSP PROTOCOL ${e}] ${C}`);
            }
          }).catch(C => {
            logForDebugging(`Failed to enable tracing for ${e}: ${C.message}`);
          });
          for (let {
            method: C,
            handler: x
          } of m) {
            r.onNotification(C, x);
            logForDebugging(`Applied queued notification handler for ${e}.${C}`);
          }
          m.length = 0;
          for (let {
            method: C,
            handler: x
          } of f) {
            r.onRequest(C, x);
            logForDebugging(`Applied queued request handler for ${e}.${C}`);
          }
          f.length = 0;
          logForDebugging(`LSP client started for ${e}`);
        } catch (b) {
          if (Io(b)) {
            logForDebugging(`LSP server ${e} failed to start: ${he(b)}`, {
              level: "error"
            });
          } else {
            tz(Error(`LSP server ${e} failed to start: ${he(b)}`), "LSP server failed to start");
          }
          throw b;
        }
      },
      async initialize(g) {
        if (!r) {
          throw Error("LSP client not started");
        }
        h();
        try {
          let y = await r.sendRequest("initialize", g);
          o = y.capabilities;
          await r.sendNotification("initialized", {});
          s = true;
          logForDebugging(`LSP server ${e} initialized`);
          return y;
        } catch (y) {
          throw logForDebugging(`LSP server ${e} initialize failed: ${y.message}`, {
            level: "error"
          }), y;
        }
      },
      async sendRequest(g, y) {
        if (!r) {
          throw Error("LSP client not started");
        }
        if (h(), !s) {
          throw Error("LSP server not initialized");
        }
        try {
          return await r.sendRequest(g, y);
        } catch (_) {
          throw logForDebugging(`LSP server ${e} request ${g} failed: ${_.message}`, {
            level: "error"
          }), _;
        }
      },
      async sendNotification(g, y) {
        if (!r) {
          throw Error("LSP client not started");
        }
        h();
        try {
          await r.sendNotification(g, y);
        } catch (_) {
          logForDebugging(`LSP server ${e} notification ${g} failed (continuing): ${_.message}`, {
            level: "error"
          });
        }
      },
      onNotification(g, y) {
        if (!r) {
          m.push({
            method: g,
            handler: y
          });
          logForDebugging(`Queued notification handler for ${e}.${g} (connection not ready)`);
          return;
        }
        h();
        r.onNotification(g, y);
      },
      onRequest(g, y) {
        if (!r) {
          f.push({
            method: g,
            handler: y
          });
          logForDebugging(`Queued request handler for ${e}.${g} (connection not ready)`);
          return;
        }
        h();
        r.onRequest(g, y);
      },
      async stop() {
        let g;
        l = true;
        try {
          if (r) {
            await r.sendRequest("shutdown", {});
            await r.sendNotification("exit", {});
          }
        } catch (y) {
          let _ = y;
          logForDebugging(`LSP server ${e} stop failed: ${_.message}`, {
            level: "error"
          });
          g = _;
        } finally {
          if (r) {
            try {
              r.dispose();
            } catch (y) {
              logForDebugging(`Connection disposal failed for ${e}: ${he(y)}`);
            }
            r = undefined;
          }
          if (n) {
            if (c) {
              n.removeListener("error", c);
            }
            if (u) {
              n.removeListener("exit", u);
            }
            if (n.stdin && d) {
              n.stdin.removeListener("error", d);
            }
            if (n.stderr && p) {
              n.stderr.removeListener("data", p);
            }
            c = undefined;
            u = undefined;
            d = undefined;
            p = undefined;
            try {
              if (globalThis.process.platform === "win32" && n.pid) {
                $6e(n.pid);
              } else {
                n.kill();
              }
            } catch (y) {
              logForDebugging(`Process kill failed for ${e} (may already be dead): ${he(y)}`);
            }
            n = undefined;
          }
          if (s = false, o = undefined, l = false, g) {
            i = true;
            a = g;
          }
          logForDebugging(`LSP client stopped for ${e}`);
        }
        if (g) {
          throw g;
        }
      }
    };
  }
  var ENe;
  var vWa = __lazy(() => {
    je();
    dt();
    y5t();
    oF();
    Fat();
    s1();
    yht();
    ENe = __toESM(TWa(), 1);
  });
  function I4p(e, t) {
    if (e == null) {
      return null;
    }
    if (t === undefined || t === "") {
      return e;
    }
    let n = e;
    for (let r of t.split(".")) {
      if (n === null || typeof n !== "object" || !Object.prototype.hasOwnProperty.call(n, r)) {
        return null;
      }
      n = n[r];
    }
    return n ?? null;
  }
  function RWa(e, t) {
    if (t.restartOnCrash !== undefined) {
      throw Error(`LSP server '${e}': restartOnCrash is not yet implemented. Remove this field from the configuration.`);
    }
    if (t.shutdownTimeout !== undefined) {
      throw Error(`LSP server '${e}': shutdownTimeout is not yet implemented. Remove this field from the configuration.`);
    }
    vWa();
    let {
      createLSPClient: n
    } = __toCommonJS(EWa);
    let r = "stopped";
    let o;
    let s;
    let i = 0;
    let a = 0;
    let l = false;
    let c = n(e, _ => {
      r = "error";
      s = _;
      a++;
      Et("lsp_server_start", "lsp_server_crashed");
    });
    async function u() {
      if (r === "running" || r === "starting") {
        return;
      }
      let _ = t.maxRestarts ?? 3;
      if (r === "error" && a > _) {
        if (!l) {
          l = true;
          s = Error(`LSP server '${e}' exceeded max crash recovery attempts (${_})`);
          logForDebugging(s.message, {
            level: "error"
          });
          Ae("lsp_server_start", "lsp_server_max_crash_recovery");
        }
        throw s;
      }
      let b;
      try {
        r = "starting";
        logForDebugging(`Starting LSP server instance: ${e}`);
        await c.start(t.command, t.args || [], {
          env: t.env,
          cwd: t.workspaceFolder
        });
        c.onRequest("workspace/configuration", x => (logForDebugging(`LSP: Received workspace/configuration request from ${e} for sections: ${x.items.map(A => A.section ?? "<root>").join(", ")}`), x.items.map(A => I4p(t.settings, A.section))));
        let S = t.workspaceFolder || Nt();
        let E = CWa.pathToFileURL(S).href;
        let C = {
          processId: process.pid,
          clientInfo: {
            name: "Claude Code",
            version: {
              ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
              PACKAGE_URL: "@anthropic-ai/claude-code",
              README_URL: "https://code.claude.com/docs/en/overview",
              VERSION: "2.1.198",
              FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
              BUILD_TIME: "2026-07-01T06:09:31Z",
              GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
            }.VERSION
          },
          initializationOptions: t.initializationOptions ?? {},
          workspaceFolders: [{
            uri: E,
            name: wWa.basename(S)
          }],
          rootPath: S,
          rootUri: E,
          capabilities: {
            workspace: {
              configuration: t.settings != null,
              workspaceFolders: false
            },
            textDocument: {
              synchronization: {
                dynamicRegistration: false,
                willSave: false,
                willSaveWaitUntil: false,
                didSave: true
              },
              publishDiagnostics: {
                relatedInformation: true,
                tagSupport: {
                  valueSet: [1, 2]
                },
                versionSupport: false,
                codeDescriptionSupport: true,
                dataSupport: false
              },
              hover: {
                dynamicRegistration: false,
                contentFormat: ["markdown", "plaintext"]
              },
              definition: {
                dynamicRegistration: false,
                linkSupport: true
              },
              references: {
                dynamicRegistration: false
              },
              documentSymbol: {
                dynamicRegistration: false,
                hierarchicalDocumentSymbolSupport: true
              },
              callHierarchy: {
                dynamicRegistration: false
              }
            },
            general: {
              positionEncodings: ["utf-16"]
            }
          }
        };
        if (b = c.initialize(C), t.startupTimeout !== undefined) {
          await D4p(b, t.startupTimeout, `LSP server '${e}' timed out after ${t.startupTimeout}ms during initialization`);
        } else {
          await b;
        }
        if (r = "running", o = new Date(), a = 0, l = false, t.settings != null) {
          c.sendNotification("workspace/didChangeConfiguration", {
            settings: t.settings
          }).catch(x => {
            logForDebugging(`LSP: workspace/didChangeConfiguration push failed for ${e}: ${he(x)}`, {
              level: "warn"
            });
          });
        }
        logForDebugging(`LSP server instance started: ${e}`);
        Pe("lsp_server_start");
      } catch (S) {
        throw c.stop().catch(() => {}), b?.catch(() => {}), r = "error", s = S, logForDebugging(`Failed to start LSP server '${e}': ${he(S)}`, {
          level: "error"
        }), Ae("lsp_server_start", "lsp_server_start_failed"), S;
      }
    }
    async function d() {
      if (r === "stopped" || r === "stopping") {
        return;
      }
      try {
        r = "stopping";
        await c.stop();
        r = "stopped";
        logForDebugging(`LSP server instance stopped: ${e}`);
        Pe("lsp_server_stop");
      } catch (_) {
        throw r = "error", s = _, logForDebugging(`Failed to stop LSP server '${e}': ${he(_)}`, {
          level: "error"
        }), Et("lsp_server_stop", "lsp_server_stop_failed"), _;
      }
    }
    async function p() {
      try {
        await d();
      } catch (b) {
        let S = Error(`Failed to stop LSP server '${e}' during restart: ${he(b)}`);
        throw logForDebugging(`Failed to stop LSP server '${e}' during restart: ${he(b)}`, {
          level: "error"
        }), S;
      }
      i++;
      let _ = t.maxRestarts ?? 3;
      if (i > _) {
        let b = Error(`Max restart attempts (${_}) exceeded for server '${e}'`);
        throw logForDebugging(b.message, {
          level: "error"
        }), b;
      }
      try {
        await u();
      } catch (b) {
        let S = Error(`Failed to start LSP server '${e}' during restart (attempt ${i}/${_}): ${he(b)}`);
        throw logForDebugging(S.message, {
          level: "error"
        }), S;
      }
    }
    function m() {
      return r === "running" && c.isInitialized;
    }
    async function f(_, b) {
      if (!m()) {
        let C = Error(`Cannot send request to LSP server '${e}': server is ${r}${s ? `, last error: ${s.message}` : ""}`);
        throw logForDebugging(`Cannot send request to LSP server '${e}': server is ${r}${s ? `, last error: ${s.message}` : ""}`, {
          level: "error"
        }), C;
      }
      let S;
      for (let C = 0; C <= 3; C++) {
        try {
          return await c.sendRequest(_, b);
        } catch (x) {
          S = x;
          let A = x.code;
          if (typeof A === "number" && A === P4p && C < 3) {
            let I = 500 * Math.pow(2, C);
            logForDebugging(`LSP request '${_}' to '${e}' got ContentModified error, retrying in ${I}ms (attempt ${C + 1}/${3})\u2026`);
            await sleep(I);
            continue;
          }
          break;
        }
      }
      let E = Object.assign(Error(`LSP request '${_}' failed for server '${e}': ${S?.message ?? "unknown error"}`, {
        cause: S
      }), {
        code: S?.code
      });
      throw logForDebugging(E.message, {
        level: "error"
      }), E;
    }
    async function h(_, b) {
      if (!m()) {
        let S = Error(`Cannot send notification to LSP server '${e}': server is ${r}`);
        throw logForDebugging(`Cannot send notification to LSP server '${e}': server is ${r}`, {
          level: "error"
        }), S;
      }
      try {
        await c.sendNotification(_, b);
      } catch (S) {
        let E = Error(`LSP notification '${_}' failed for server '${e}': ${he(S)}`);
        throw logForDebugging(E.message, {
          level: "error"
        }), E;
      }
    }
    function g(_, b) {
      c.onNotification(_, b);
    }
    function y(_, b) {
      c.onRequest(_, b);
    }
    return {
      name: e,
      config: t,
      get state() {
        return r;
      },
      get startTime() {
        return o;
      },
      get lastError() {
        return s;
      },
      get restartCount() {
        return i;
      },
      start: u,
      stop: d,
      restart: p,
      isHealthy: m,
      sendRequest: f,
      sendNotification: h,
      onNotification: g,
      onRequest: y
    };
  }
  function D4p(e, t, n) {
    let r;
    let o = new Promise((s, i) => {
      r = setTimeout((a, l) => a(Error(l)), t, i, n);
    });
    return Promise.race([e, o]).finally(() => clearTimeout(r));
  }
  var wWa;
  var CWa;
  var P4p = -32801;
  var xWa = __lazy(() => {
    vo();
    je();
    dt();
    ln();
    wWa = __toESM(require("path"));
    CWa = require("url");
  });
  function kWa() {
    let e = new Map();
    let t = new Map();
    let n = new Map();
    let r = new Map();
    function o(_) {
      let b = (r.get(_) ?? 0) + 1;
      r.set(_, b);
      return b;
    }
    async function s() {
      let _;
      try {
        _ = (await n4a()).servers;
        logForDebugging(`[LSP SERVER MANAGER] getAllLspServers returned ${Object.keys(_).length} server(s)`);
      } catch (S) {
        throw tz(Error(`Failed to load LSP server configuration: ${he(S)}`), "Failed to load LSP server configuration"), Ae("lsp_config_load", "lsp_config_load_failed"), S;
      }
      let b = false;
      for (let [S, E] of Object.entries(_)) {
        try {
          if (!E.command) {
            throw Error(`Server ${S} missing required 'command' field`);
          }
          if (!E.extensionToLanguage || Object.keys(E.extensionToLanguage).length === 0) {
            throw Error(`Server ${S} missing required 'extensionToLanguage' field`);
          }
          let C = Object.keys(E.extensionToLanguage);
          for (let A of C) {
            let k = A.toLowerCase();
            if (!t.vZc(k)) {
              t.set(k, []);
            }
            let I = t.get(k);
            if (I) {
              if (I.length > 0 && I[0] !== S) {
                logForDebugging(`LSP: extension ${k} already handled by "${I[0]}"; "${S}" will not be used for ${k} files`, {
                  level: "warn"
                });
              }
              I.push(S);
            }
          }
          let x = RWa(S, E);
          e.set(S, x);
        } catch (C) {
          logForDebugging(`Failed to initialize LSP server ${S}: ${C.message}`, {
            level: "error"
          });
          b = true;
        }
      }
      if (logForDebugging(`LSP manager initialized with ${e.size} servers`), b) {
        Et("lsp_config_load", "lsp_server_config_invalid");
      } else {
        Pe("lsp_config_load");
      }
    }
    async function i() {
      let _ = Array.from(e.entries()).filter(([, E]) => E.state === "running" || E.state === "error");
      let b = await Promise.allSettled(_.map(([, E]) => E.stop()));
      e.clear();
      t.clear();
      n.clear();
      r.clear();
      let S = b.map((E, C) => E.status === "rejected" ? `${_[C][0]}: ${he(E.reason)}` : null).filter(E => E !== null);
      if (S.length > 0) {
        let E = Error(`Failed to stop ${S.length} LSP server(s): ${S.join("; ")}`);
        throw logForDebugging(`Failed to stop ${S.length} LSP server(s): ${S.join("; ")}`, {
          level: "error"
        }), E;
      }
    }
    function a(_) {
      let b = CEe.extname(_).toLowerCase();
      let S = t.get(b);
      if (!S || S.length === 0) {
        return;
      }
      let E = S[0];
      if (!E) {
        return;
      }
      return e.get(E);
    }
    async function l(_) {
      let b = a(_);
      if (!b) {
        return;
      }
      if (b.state === "stopped" || b.state === "error") {
        try {
          await b.start();
        } catch (S) {
          throw logForDebugging(`Failed to start LSP server for file ${_}: ${S.message}`, {
            level: "error"
          }), S;
        }
      }
      return b;
    }
    async function c(_, b, S) {
      let E = await l(_);
      if (!E) {
        return;
      }
      try {
        return await E.sendRequest(b, S);
      } catch (C) {
        throw logForDebugging(`LSP request failed for file ${_}, method '${b}': ${C.message}`, {
          level: "error"
        }), C;
      }
    }
    function u() {
      return e;
    }
    function d() {
      return Array.from(t.keys()).sort();
    }
    async function p(_, b) {
      let S = await l(_);
      if (!S) {
        return;
      }
      let E = Aht.pathToFileURL(CEe.resolve(_)).href;
      if (n.get(E) === S.name) {
        logForDebugging(`LSP: File already open, skipping didOpen for ${_}`);
        return;
      }
      let C = CEe.extname(_).toLowerCase();
      let x = S.config.extensionToLanguage[C] || "plaintext";
      try {
        let A = o(E);
        await S.sendNotification("textDocument/didOpen", {
          textDocument: {
            uri: E,
            languageId: x,
            version: A,
            text: b
          }
        });
        n.set(E, S.name);
        logForDebugging(`LSP: Sent didOpen for ${_} (languageId: ${x})`);
      } catch (A) {
        let k = Error(`Failed to sync file open ${_}: ${he(A)}`);
        throw logForDebugging(k.message, {
          level: "error"
        }), k;
      }
    }
    async function m(_, b) {
      let S = a(_);
      if (!S || S.state !== "running") {
        return p(_, b);
      }
      let E = Aht.pathToFileURL(CEe.resolve(_)).href;
      if (n.get(E) !== S.name) {
        return p(_, b);
      }
      try {
        let C = o(E);
        await S.sendNotification("textDocument/didChange", {
          textDocument: {
            uri: E,
            version: C
          },
          contentChanges: [{
            text: b
          }]
        });
        logForDebugging(`LSP: Sent didChange for ${_} (v${C})`);
      } catch (C) {
        let x = Error(`Failed to sync file change ${_}: ${he(C)}`);
        throw logForDebugging(`Failed to sync file change ${_}: ${he(C)}`, {
          level: "error"
        }), x;
      }
    }
    async function f(_) {
      let b = a(_);
      if (!b || b.state !== "running") {
        return;
      }
      try {
        await b.sendNotification("textDocument/didSave", {
          textDocument: {
            uri: Aht.pathToFileURL(CEe.resolve(_)).href
          }
        });
        logForDebugging(`LSP: Sent didSave for ${_}`);
      } catch (S) {
        let E = Error(`Failed to sync file save ${_}: ${he(S)}`);
        throw logForDebugging(E.message, {
          level: "error"
        }), E;
      }
    }
    async function h(_) {
      let b = a(_);
      if (!b || b.state !== "running") {
        return;
      }
      let S = Aht.pathToFileURL(CEe.resolve(_)).href;
      try {
        await b.sendNotification("textDocument/didClose", {
          textDocument: {
            uri: S
          }
        });
        n.delete(S);
        r.delete(S);
        logForDebugging(`LSP: Sent didClose for ${_}`);
      } catch (E) {
        let C = Error(`Failed to sync file close ${_}: ${he(E)}`);
        throw logForDebugging(C.message, {
          level: "error"
        }), C;
      }
    }
    function g(_) {
      let b = Aht.pathToFileURL(CEe.resolve(_)).href;
      return n.vZc(b);
    }
    function y(_) {
      return r.get(_);
    }
    return {
      initialize: s,
      shutdown: i,
      getServerForFile: a,
      ensureServerStarted: l,
      sendRequest: c,
      getAllServers: u,
      getSupportedExtensions: d,
      openFile: p,
      changeFile: m,
      saveFile: f,
      closeFile: h,
      isFileOpen: g,
      getDocumentVersion: y
    };
  }
  var CEe;
  var Aht;
  var AWa = __lazy(() => {
    je();
    dt();
    ln();
    r4a();
    xWa();
    yht();
    CEe = __toESM(require("path"));
    Aht = require("url");
  });
  function M4p(e) {
    switch (e) {
      case 1:
        return "Error";
      case 2:
        return "Warning";
      case 3:
        return "Info";
      case 4:
        return "Hint";
      default:
        return "Error";
    }
  }
  function N4p(e) {
    let t;
    try {
      t = e.uri.startsWith("file://") ? IWa.fileURLToPath(e.uri) : e.uri;
    } catch (r) {
      let o = sr(r);
      logForDebugging(`Failed to convert URI to file path: ${e.uri}. Error: ${o.message}. Using original URI as fallback.`, {
        level: "error"
      });
      t = e.uri;
    }
    let n = e.diagnostics.map(r => ({
      message: r.message,
      severity: M4p(r.severity),
      range: {
        start: {
          line: r.range.start.line,
          character: r.range.start.character
        },
        end: {
          line: r.range.end.line,
          character: r.range.end.character
        }
      },
      source: r.source,
      code: r.code !== undefined && r.code !== null ? String(r.code) : undefined
    }));
    return [{
      uri: t,
      diagnostics: n
    }];
  }
  function PWa(e) {
    let t = e.getAllServers();
    let n = [];
    let r = 0;
    let o = new Map();
    let s = 0;
    for (let [a, l] of t.entries()) {
      try {
        if (l?.config?.diagnostics === false) {
          logForDebugging(`Diagnostics disabled for ${a}, skipping`);
          s++;
          continue;
        }
        if (!l || typeof l.onNotification !== "function") {
          let c = !l ? "Server instance is null/undefined" : "Server instance has no onNotification method";
          n.push({
            serverName: a,
            error: c
          });
          tz(Error(`${c} for ${a}`), c);
          logForDebugging(`Skipping handler registration for ${a}: ${c}`);
          continue;
        }
        l.onNotification("textDocument/publishDiagnostics", c => {
          logForDebugging(`[PASSIVE DIAGNOSTICS] Handler invoked for ${a}! Params type: ${typeof c}`);
          try {
            if (!c || typeof c !== "object" || !("uri" in c) || !("diagnostics" in c)) {
              logForDebugging(`LSP server ${a} sent invalid diagnostic params (missing uri or diagnostics): ${De(c)}`, {
                level: "error"
              });
              return;
            }
            let u = c;
            if (logForDebugging(`Received diagnostics from ${a}: ${u.diagnostics.length} diagnostic(s) for ${u.uri}`), u.version !== undefined) {
              let m = e.getDocumentVersion(u.uri);
              if (m !== undefined && u.version < m) {
                logForDebugging(`LSP Diagnostics: Dropping stale publishDiagnostics from ${a} for ${u.uri} (server v${u.version} < current v${m})`);
                return;
              }
            }
            let d = N4p(u);
            let p = d[0];
            if (!p || d.length === 0 || p.diagnostics.length === 0) {
              logForDebugging(`Skipping empty diagnostics from ${a} for ${u.uri}`);
              return;
            }
            try {
              J3a({
                serverName: a,
                files: d
              });
              logForDebugging(`LSP Diagnostics: Registered ${d.length} diagnostic file(s) from ${a} for async delivery`);
              o.delete(a);
            } catch (m) {
              let f = sr(m);
              tz(f, "Error registering LSP diagnostics");
              logForDebugging(`Error registering LSP diagnostics from ${a}: URI: ${u.uri}, Diagnostic count: ${p.diagnostics.length}, Error: ${f.message}`);
              let h = o.get(a) || {
                count: 0,
                lastError: ""
              };
              if (h.count++, h.lastError = f.message, o.set(a, h), h.count >= 3) {
                logForDebugging(`WARNING: LSP diagnostic handler for ${a} has failed ${h.count} times consecutively. Last error: ${h.lastError}. This may indicate a problem with the LSP server or diagnostic processing. Check logs for details.`);
              }
            }
          } catch (u) {
            let d = sr(u);
            logForDebugging(`Unexpected error processing diagnostics from ${a}: ${d.message}`, {
              level: "error"
            });
            let p = o.get(a) || {
              count: 0,
              lastError: ""
            };
            if (p.count++, p.lastError = d.message, o.set(a, p), p.count >= 3) {
              logForDebugging(`WARNING: LSP diagnostic handler for ${a} has failed ${p.count} times consecutively. Last error: ${p.lastError}. This may indicate a problem with the LSP server or diagnostic processing. Check logs for details.`);
            }
          }
        });
        logForDebugging(`Registered diagnostics handler for ${a}`);
        r++;
      } catch (c) {
        let u = sr(c);
        n.push({
          serverName: a,
          error: u.message
        });
        logForDebugging(`Failed to register diagnostics handler for ${a}: Error: ${u.message}`, {
          level: "error"
        });
        Ae("lsp_diagnostics_register", "lsp_diagnostics_register_failed");
      }
    }
    let i = t.size;
    if (s > 0) {
      logEvent("tengu_lsp_diagnostics_disabled", {
        disabled_count: s,
        total_servers: i
      });
    }
    if (n.length > 0) {
      let a = n.map(l => `${l.serverName} (${l.error})`).join(", ");
      logForDebugging(`LSP notification handler registration: ${r}/${i} succeeded. Failed servers: ${a}. Diagnostics from failed servers will not be delivered.`, {
        level: "error"
      });
    } else {
      logForDebugging(`LSP notification handlers registered successfully for all ${i} server(s)`);
      Pe("lsp_diagnostics_register");
    }
    return {
      totalServers: i,
      successCount: r,
      registrationErrors: n,
      diagnosticFailures: o
    };
  }
  var IWa;
  var OWa = __lazy(() => {
    je();
    dt();
    ln();
    Ot();
    _ht();
    yht();
    IWa = require("url");
  });
  function L4p() {
    let e;
    let t = "not-started";
    let n;
    let r = 0;
    let o;
    function s() {
      if (t === "failed") {
        return;
      }
      return e;
    }
    function i() {
      if (t === "failed") {
        return {
          status: "failed",
          error: n || Error("Initialization failed")
        };
      }
      if (t === "not-started") {
        return {
          status: "not-started"
        };
      }
      if (t === "pending") {
        return {
          status: "pending"
        };
      }
      return {
        status: "success"
      };
    }
    function a() {
      if (t === "failed") {
        return false;
      }
      let p = s();
      if (!p) {
        return false;
      }
      let m = p.getAllServers();
      if (m.size === 0) {
        return false;
      }
      for (let f of m.values()) {
        if (f.state !== "error") {
          return true;
        }
      }
      return false;
    }
    async function l() {
      if (t === "success" || t === "failed") {
        return;
      }
      if (t === "pending" && o) {
        await o;
      }
    }
    function c() {
      if (Pc("lspServers")) {
        return;
      }
      if (logForDebugging("[LSP MANAGER] initializeLspServerManager() called"), e !== undefined && t !== "failed") {
        logForDebugging("[LSP MANAGER] Already initialized or initializing, skipping");
        return;
      }
      if (t === "failed") {
        e = undefined;
        n = undefined;
      }
      e = kWa();
      t = "pending";
      logForDebugging("[LSP MANAGER] Created manager instance, state=pending");
      let p = ++r;
      logForDebugging(`[LSP MANAGER] Starting async initialization (generation ${p})`);
      o = e.initialize().then(() => {
        if (p === r) {
          if (t = "success", logForDebugging("LSP server manager initialized successfully"), Pe("lsp_init"), e) {
            PWa(e);
          }
        }
      }).catch(m => {
        if (p === r) {
          t = "failed";
          n = m;
          e = undefined;
          tz(m, "Failed to initialize LSP server manager");
          logForDebugging(`Failed to initialize LSP server manager: ${he(m)}`);
          Ae("lsp_init", "lsp_init_failed");
        }
      });
    }
    function u() {
      if (t === "not-started") {
        return;
      }
      if (logForDebugging("[LSP MANAGER] reinitializeLspServerManager() called"), e) {
        e.shutdown().catch(p => {
          logForDebugging(`[LSP MANAGER] old instance shutdown during reinit failed: ${he(p)}`);
        });
      }
      e = undefined;
      t = "not-started";
      n = undefined;
      c();
    }
    async function d() {
      if (e === undefined) {
        return;
      }
      try {
        await e.shutdown();
        logForDebugging("LSP server manager shut down successfully");
        Pe("lsp_shutdown");
      } catch (p) {
        Et("lsp_shutdown", "lsp_shutdown_failed");
        logForDebugging(`Failed to shutdown LSP server manager: ${he(p)}`, {
          level: "error"
        });
      } finally {
        e = undefined;
        t = "not-started";
        n = undefined;
        o = undefined;
        r++;
      }
    }
    return {
      get: s,
      getStatus: i,
      isConnected: a,
      waitForInitialization: l,
      initialize: c,
      reinitialize: u,
      shutdown: d
    };
  }
  var X6e;
  var vNe;
  var Iht;
  var DWa;
  var MWa;
  var NWa;
  var QGn;
  var LWa;
  var Tpe = __lazy(() => {
    wb();
    je();
    dt();
    ln();
    AWa();
    yht();
    OWa();
    X6e = L4p();
    vNe = X6e.get;
    Iht = X6e.getStatus;
    DWa = X6e.isConnected;
    MWa = X6e.waitForInitialization;
    NWa = X6e.initialize;
    QGn = X6e.reinitialize;
    LWa = X6e.shutdown;
  });
  function ZGn(e, t) {
    let n = Gbe(e);
    let r = !n && e6e() && _Ma(e);
    if (!n && !r) {
      return null;
    }
    let o = ZZe(t);
    if (o.length === 0) {
      return null;
    }
    let s = o.map(i => i.label).join(", ");
    if (n) {
      return `Content contains potential secrets (${s}) and cannot be written to team memory. Team memory is shared with all repository collaborators. Remove the sensitive content and try again.`;
    }
    return `Content contains potential secrets (${s}) and cannot be written to memory. Memory is synced to your account. Remove the sensitive content and try again.`;
  }
  var MEo = __lazy(() => {
    n9t();
    a1();
    Kv();
  });
  function e9n(e) {
    return e.replace(/`[^`\n]+`/g, (t, n) => {
      let r = e[n - 1];
      return r === "!" || r === "`" ? t : "`" + hm(" ", t.length - 2) + "`";
    });
  }
  function oz(e) {
    return e.replace(/`!/g, "` !").replace(/!`/g, "! `").replace(/(^|\s)!/gm, "$1\\!");
  }
  var Q6e = __lazy(() => {
    Zn();
  });
  function LEo(e) {
    if (!e || !e.trim()) {
      return [];
    }
    let t = uE(e);
    return t.length > 0 ? t : e.split(/\s+/).filter(Boolean);
  }
  function t9n(e) {
    if (!e) {
      return [];
    }
    let t = n => typeof n === "string" && n.trim() !== "" && !/^\d+$/.test(n);
    if (Array.isArray(e)) {
      return e.filter(t);
    }
    if (typeof e === "string") {
      return e.split(/\s+/).filter(t);
    }
    return [];
  }
  function FWa(e, t) {
    let n = e.slice(t.length);
    if (n.length === 0) {
      return;
    }
    return n.map(r => `[${r}]`).join(" ");
  }
  function Pht(e, t, n = true, r = [], o) {
    if (t === undefined || t === null) {
      return e;
    }
    let s = p => {
      let m = (p ?? "").replaceAll("\uFFFF", "");
      return o ? o(m) : m;
    };
    let i = LEo(t);
    let a = r.map((p, m) => ({
      name: p,
      i: m
    })).filter(p => Boolean(p.name)).sort((p, m) => m.name.length - p.name.length);
    let l = ["\\d", "ARGUMENTS", ...a.map(({
      name: p
    }) => `${FA(p)}(?![\\[\\w])`)].join("|");
    let c = e.replace(new RegExp(`(?<!\\\\)\\\\\\$(?=${l})`, "g"), "\uFFFF");
    let u = c !== e;
    e = c;
    let d = false;
    for (let {
      name: p,
      i: m
    } of a) {
      e = e.replace(new RegExp(`\\$${FA(p)}(?![\\[\\w])`, "g"), () => (d = true, s(i[m])));
    }
    if (e = e.replace(/\$ARGUMENTS\[(\d+)\]/g, (p, m) => {
      d = true;
      let f = parseInt(m, 10);
      return s(i[f]);
    }), e = e.replace(/\$(\d+)(?!\w)/g, (p, m) => {
      d = true;
      let f = parseInt(m, 10);
      return s(i[f]);
    }), e = e.replaceAll("$ARGUMENTS", () => (d = true, s(t))), !d && n && t) {
      e = e + `

ARGUMENTS: ${s(t)}`;
    }
    if (u) {
      e = e.replaceAll("\uFFFF", "$");
    }
    return e;
  }
  var J5t = __lazy(() => {
    bU();
    Zn();
    Q6e();
  });
  function F4p(e) {
    let t = sz.relative(sz.join(er(), "skills"), e);
    return t !== "" && t !== ".." && !t.startsWith(`..${sz.sep}`) && !sz.isAbsolute(t);
  }
  async function BWa(e, t) {
    let n = sz.join(e, "SKILL.md");
    let r;
    try {
      r = F4p(n) ? await Ys().read(n) : await Oht.readFile(n, {
        encoding: "utf-8"
      });
    } catch (l) {
      if (!fn(l)) {
        logForDebugging(`[skill-as-plugin] failed to read ${n}: ${l}`, {
          level: "warn"
        });
      }
      return null;
    }
    let {
      frontmatter: o
    } = sf(r, n, {
      normalizeKeys: true
    });
    let s = {
      name: t,
      displayName: tMe(o.displayName) ?? tMe(o.name),
      description: typeof o.description === "string" ? o.description : undefined,
      version: typeof o.version === "string" ? o.version : undefined
    };
    for (let [l, c] of Object.entries(B4p)) {
      if (c(o[l])) {
        s[l] = o[l];
      }
    }
    let i = false;
    for (let l of U4p) {
      if (o[l] !== undefined && o[l] !== null) {
        s[l] = o[l];
        i = true;
      }
    }
    if (!i) {
      return null;
    }
    let a = IGe(s, "skill-md", {
      pluginName: t,
      manifestPath: n
    });
    if (!a.ok) {
      throw Error(a.error);
    }
    return {
      manifest: a.manifest,
      manifestPath: n,
      rawCandidate: a.rawCandidate
    };
  }
  function $Wa(e, t) {
    if (t) {
      return true;
    }
    return false;
  }
  async function HWa() {
    if (Pc("skills") || Hke.some(r => ZT(r)) || !areLocalPluginDirsAllowedByPolicy()) {
      return [];
    }
    let e = [];
    let t = sz.join(er(), "skills");
    if (qf("userSettings")) {
      e.push({
        dir: t,
        scope: "user"
      });
    }
    if (qf("projectSettings")) {
      let r = sz.join(getOriginalCwd(), ".claude", "skills");
      let o = s => Oht.realpath(s).catch(() => s);
      if (r !== t && (await o(r)) !== (await o(t))) {
        e.push({
          dir: r,
          scope: "project"
        });
      }
    }
    let n = [];
    for (let {
      dir: r,
      scope: o
    } of e) {
      try {
        if (o === "user") {
          let s = await Ys().listEntries(r);
          for (let i of s) {
            if (!i.isFile) {
              n.push({
                dir: sz.join(r, i.name),
                scope: o
              });
            }
          }
        } else {
          let s = await Oht.readdir(r, {
            withFileTypes: true
          });
          for (let i of s) {
            if (i.isDirectory() || i.isSymbolicLink()) {
              n.push({
                dir: sz.join(r, i.name),
                scope: o
              });
            }
          }
        }
      } catch (s) {
        if (!Io(s)) {
          logForDebugging(`[skill-as-plugin] readdir ${r} failed: ${s}`, {
            level: "warn"
          });
        }
      }
    }
    return n;
  }
  var Oht;
  var sz;
  var U4p;
  var B4p;
  var FEo = __lazy(() => {
    at();
    _b();
    wb();
    je();
    gn();
    dt();
    fv();
    nf();
    IJ();
    Rj();
    PFn();
    Xk();
    TC();
    Oht = require("fs/promises");
    sz = require("path");
    U4p = ["mcpServers", "lspServers", "agents", "outputStyles", "themes", "workflows", "channels", "monitors", "settings", "userConfig", "experimental"];
    B4p = {
      defaultEnabled: e => typeof e === "boolean",
      author: e => FMt().safeParse(e).success,
      homepage: e => {
        if (typeof e !== "string") {
          return false;
        }
        try {
          let {
            protocol: t
          } = new URL(e);
          return t === "http:" || t === "https:";
        } catch {
          return false;
        }
      },
      repository: e => typeof e === "string",
      license: e => typeof e === "string",
      keywords: e => Array.isArray(e) && e.every(t => typeof t === "string")
    };
  });
  function H4p() {
    let e = process.env.CLAUDE_CODE_PWSH_PARSE_TIMEOUT_MS;
    if (e) {
      let t = parseInt(e, 10);
      if (!isNaN(t) && t > 0) {
        return t;
      }
    }
    return 5000;
  }
  function W4p(e) {
    return e + Math.min(e, 1e4);
  }
  function wNe(e, t, n) {
    return {
      ...Q4p,
      errors: [{
        message: t,
        errorId: n
      }],
      originalCommand: e
    };
  }
  function joe(e) {
    return e.replace(/[\u2013\u2014\u2015]/g, "-");
  }
  function Z4p(e) {
    if (typeof Buffer < "u") {
      return Buffer.from(e, "utf16le").toString("base64");
    }
    let t = [];
    for (let n = 0; n < e.length; n++) {
      let r = e.charCodeAt(n);
      t.push(r & 255, r >> 8 & 255);
    }
    return btoa(t.map(n => String.fromCharCode(n)).join(""));
  }
  function eWp(e) {
    return `$EncodedCommand = '${typeof Buffer < "u" ? Buffer.from(e, "utf8").toString("base64") : btoa(new TextEncoder().HS(e).reduce((n, r) => n + String.fromCharCode(r), ""))}'
${qWa}`;
  }
  function iz(e) {
    if (e === undefined || e === null) {
      return [];
    }
    return Array.isArray(e) ? e : [e];
  }
  function tWp(e) {
    switch (e) {
      case "PipelineAst":
        return "PipelineAst";
      case "PipelineChainAst":
        return "PipelineChainAst";
      case "AssignmentStatementAst":
        return "AssignmentStatementAst";
      case "IfStatementAst":
        return "IfStatementAst";
      case "ForStatementAst":
        return "ForStatementAst";
      case "ForEachStatementAst":
        return "ForEachStatementAst";
      case "WhileStatementAst":
        return "WhileStatementAst";
      case "DoWhileStatementAst":
        return "DoWhileStatementAst";
      case "DoUntilStatementAst":
        return "DoUntilStatementAst";
      case "SwitchStatementAst":
        return "SwitchStatementAst";
      case "TryStatementAst":
        return "TryStatementAst";
      case "TrapStatementAst":
        return "TrapStatementAst";
      case "FunctionDefinitionAst":
        return "FunctionDefinitionAst";
      case "DataStatementAst":
        return "DataStatementAst";
      default:
        return "UnknownStatementAst";
    }
  }
  function Q5t(e, t) {
    switch (e) {
      case "ScriptBlockExpressionAst":
        return "ScriptBlock";
      case "SubExpressionAst":
      case "ArrayExpressionAst":
        return "SubExpression";
      case "ExpandableStringExpressionAst":
        return "ExpandableString";
      case "InvokeMemberExpressionAst":
      case "MemberExpressionAst":
        return "MemberInvocation";
      case "VariableExpressionAst":
        return "Variable";
      case "StringConstantExpressionAst":
      case "ConstantExpressionAst":
        return "StringConstant";
      case "CommandParameterAst":
        return "Parameter";
      case "ParenExpressionAst":
        return "SubExpression";
      case "CommandExpressionAst":
        if (t) {
          return Q5t(t);
        }
        return "Other";
      default:
        return "Other";
    }
  }
  function BEo(e) {
    if (/^[A-Za-z]+-[A-Za-z][A-Za-z0-9_]*$/.test(e)) {
      return "cmdlet";
    }
    if (/[.\\/]/.test(e)) {
      return "application";
    }
    return "unknown";
  }
  function n9n(e) {
    let t = e.lastIndexOf("\\");
    if (t < 0) {
      return e;
    }
    if (/^[A-Za-z]:/.test(e) || e.startsWith("\\\\") || e.startsWith(".\\") || e.startsWith("..\\")) {
      return e;
    }
    let n = e.substring(t + 1);
    if (n === "") {
      return e;
    }
    return n;
  }
  function jWa(e) {
    let t = iz(e.commandElements);
    let n = "";
    let r = [];
    let o = [];
    let s = [];
    let i = false;
    let a = "unknown";
    if (t.length > 0) {
      let u = t[0];
      let m = ((u.type === "StringConstantExpressionAst" || u.type === "ExpandableStringExpressionAst") && typeof u.value === "string" ? u.value : u.text).replace(/^['"]|['"]$/g, "");
      if (/[\u0080-\uFFFF]/.test(m)) {
        a = "application";
      } else {
        a = BEo(m);
      }
      n = joe(n9n(m));
      o.push(Q5t(u.type, u.expressionType));
      for (let f = 1; f < t.length; f++) {
        let h = t[f];
        let g = h.type === "StringConstantExpressionAst" || h.type === "ExpandableStringExpressionAst";
        r.push(joe(g && h.value != null ? h.value : h.text));
        o.push(Q5t(h.type, h.expressionType));
        let y = iz(h.children);
        if (y.length > 0) {
          i = true;
          s.push(y.map(_ => ({
            type: Q5t(_.type),
            text: joe(_.text)
          })));
        } else {
          s.push(undefined);
        }
      }
    }
    let l = {
      name: n,
      nameType: a,
      elementType: "CommandAst",
      args: r,
      text: joe(e.text),
      elementTypes: o,
      ...(i && {
        children: s
      })
    };
    let c = iz(e.redirections);
    if (c.length > 0) {
      l.redirections = c.map(X5t);
    }
    return l;
  }
  function nWp(e) {
    let t = e.type === "ParenExpressionAst" ? "ParenExpressionAst" : "CommandExpressionAst";
    let n = [Q5t(e.type, e.expressionType)];
    return {
      name: joe(e.text),
      nameType: "unknown",
      elementType: t,
      args: [],
      text: joe(e.text),
      elementTypes: n
    };
  }
  function X5t(e) {
    if (e.type === "MergingRedirectionAst") {
      return {
        operator: "2>&1",
        target: "",
        isMerging: true
      };
    }
    let t = e.append ?? false;
    let n = e.fromStream ?? "Output";
    let r;
    if (t) {
      switch (n) {
        case "Error":
          r = "2>>";
          break;
        case "All":
          r = "*>>";
          break;
        default:
          r = ">>";
          break;
      }
    } else {
      switch (n) {
        case "Error":
          r = "2>";
          break;
        case "All":
          r = "*>";
          break;
        default:
          r = ">";
          break;
      }
    }
    return {
      operator: r,
      target: e.locationText ?? "",
      isMerging: false
    };
  }
  function rWp(e) {
    let t = tWp(e.type);
    let n = [];
    let r = [];
    if (e.elements) {
      for (let l of iz(e.elements)) {
        if (l.type === "CommandAst") {
          n.push(jWa(l));
          for (let c of iz(l.redirections)) {
            r.push(X5t(c));
          }
        } else {
          n.push(nWp(l));
          for (let c of iz(l.redirections)) {
            r.push(X5t(c));
          }
        }
      }
      let a = new Set(r.map(l => `${l.operator}\x00${l.target}`));
      for (let l of iz(e.redirections)) {
        let c = X5t(l);
        let u = `${c.operator}\x00${c.target}`;
        if (!a.vZc(u)) {
          a.add(u);
          r.push(c);
        }
      }
    } else {
      n.push({
        name: joe(e.text),
        nameType: "unknown",
        elementType: "CommandExpressionAst",
        args: [],
        text: joe(e.text)
      });
      for (let a of iz(e.redirections)) {
        r.push(X5t(a));
      }
    }
    let o;
    let s = iz(e.nestedCommands);
    if (s.length > 0) {
      o = s.map(jWa);
    }
    let i = {
      statementType: t,
      commands: n,
      redirections: r,
      text: joe(e.text),
      nestedCommands: o
    };
    if (e.securityPatterns) {
      i.securityPatterns = e.securityPatterns;
    }
    return i;
  }
  function oWp(e) {
    let t = {
      valid: e.valid,
      errors: iz(e.errors),
      statements: iz(e.statements).map(rWp),
      variables: iz(e.variables),
      hasStopParsing: e.hasStopParsing,
      originalCommand: e.originalCommand
    };
    let n = iz(e.typeLiterals);
    if (n.length > 0) {
      t.typeLiterals = n;
    }
    if (e.hasUsingStatements) {
      t.hasUsingStatements = true;
    }
    if (e.hasScriptRequirements) {
      t.hasScriptRequirements = true;
    }
    if (e.hasBackgroundJob) {
      t.hasBackgroundJob = true;
    }
    return t;
  }
  async function sWp(e) {
    let t = Buffer.byteLength(e, "utf8");
    if (t > 4500) {
      logForDebugging(`PowerShell parser: command too long (${t} bytes, max ${4500})`);
      return wNe(e, `Command too long for parsing (${t} bytes). Maximum supported length is ${4500} bytes.`, "CommandTooLong");
    }
    if (/`u\{[0-9A-Fa-f]/.test(e)) {
      return wNe(e, "PowerShell `u{HEX} codepoint escape is runtime-resolved and cannot be statically validated.", "UnicodeCodepointEscape");
    }
    let n = await qV();
    if (!n) {
      return wNe(e, "PowerShell is not available", "NoPowerShell");
    }
    let r = eWp(e);
    let s = ["-NoProfile", "-NonInteractive", "-NoLogo", "-EncodedCommand", Z4p(r)];
    let i = H4p();
    let a = W4p(i);
    let l = "";
    let c = "";
    let u = null;
    let d = false;
    let p = null;
    for (let f = 0; f < 2; f++) {
      p = null;
      d = false;
      let h;
      try {
        let g = _C(n, s, {
          timeout: i,
          reject: false
        });
        let y = await Promise.race([g, new Promise(_ => {
          h = setTimeout(b => b(null), a, _);
        })]);
        if (y === null) {
          g.catch(() => {});
          d = true;
          u = 1;
        } else {
          l = y.stdout;
          c = y.stderr;
          d = y.timedOut;
          u = y.failed ? y.exitCode ?? 1 : 0;
        }
      } catch (g) {
        p = g instanceof Error ? g.message : String(g);
        u = null;
      } finally {
        clearTimeout(h);
      }
      if (u === 0) {
        break;
      }
      logForDebugging(`PowerShell parser: ${p ? `failed to spawn pwsh: ${p}` : d ? `pwsh timed out after ${i}ms` : `pwsh exited ${u}: ${c}`} (attempt ${f + 1})`);
    }
    if (p) {
      return wNe(e, `Failed to spawn PowerShell: ${p}`, "PwshSpawnError");
    }
    if (d) {
      return wNe(e, `pwsh timed out after ${i}ms (2 attempts)`, "PwshTimeout");
    }
    if (u !== 0) {
      logForDebugging(`PowerShell parser: pwsh exited with code ${u}, stderr: ${c}`);
      return wNe(e, `pwsh exited with code ${u}: ${c}`, "PwshError");
    }
    let m = l.trim();
    if (!m) {
      logForDebugging("PowerShell parser: empty stdout from pwsh");
      return wNe(e, "No output from PowerShell parser", "EmptyOutput");
    }
    try {
      let f = qt(m);
      return oWp(f);
    } catch {
      logForDebugging(`PowerShell parser: invalid JSON output: ${m.slice(0, 200)}`);
      return wNe(e, "Invalid JSON from PowerShell parser", "InvalidJson");
    }
  }
  function $Eo(e) {
    let t = [];
    for (let n of e.statements) {
      for (let r of n.commands) {
        t.push(r.name.toLowerCase());
      }
      if (n.nestedCommands) {
        for (let r of n.nestedCommands) {
          t.push(r.name.toLowerCase());
        }
      }
    }
    return t;
  }
  function PO(e) {
    let t = [];
    for (let n of e.statements) {
      for (let r of n.commands) {
        t.push(r);
      }
      if (n.nestedCommands) {
        for (let r of n.nestedCommands) {
          t.push(r);
        }
      }
    }
    return t;
  }
  function aWp(e) {
    let t = [];
    for (let n of e.statements) {
      for (let r of n.redirections) {
        t.push(r);
      }
      if (n.nestedCommands) {
        for (let r of n.nestedCommands) {
          if (r.redirections) {
            for (let o of r.redirections) {
              t.push(o);
            }
          }
        }
      }
    }
    return t;
  }
  function WWa(e, t) {
    let n = t.toLowerCase() + ":";
    return e.variables.filter(r => r.path.toLowerCase().startsWith(n));
  }
  function HEo(e, t) {
    let n = t.toLowerCase();
    let r = _Q[n]?.toLowerCase();
    for (let o of $Eo(e)) {
      if (o === n) {
        return true;
      }
      let s = _Q[o]?.toLowerCase();
      if (s === n) {
        return true;
      }
      if (r && o === r) {
        return true;
      }
      if (s && r && s === r) {
        return true;
      }
    }
    return false;
  }
  function CNe(e, t) {
    if (t !== undefined) {
      return t === "Parameter";
    }
    return e.length > 0 && f3.vZc(e[0]);
  }
  function jEo(e, t, n) {
    let r = t.toLowerCase();
    let o = n.toLowerCase();
    return e.args.some(s => {
      let i = s.indexOf(":", 1);
      let l = (i > 0 ? s.slice(0, i) : s).replace(/`[\r\n]+\s*/g, "").replaceAll("`", "").toLowerCase();
      return l.startsWith(o) && r.startsWith(l) && l.length <= r.length;
    });
  }
  function r9n(e) {
    return e.statements;
  }
  function Dht(e) {
    let t = e.trim().toLowerCase();
    return t === "$null" || t === "${null}";
  }
  function Z5t(e) {
    return aWp(e).filter(t => !t.isMerging && !Dht(t.target));
  }
  function y9(e) {
    let t = {
      hasSubExpressions: false,
      hasScriptBlocks: false,
      hasSplatting: false,
      hasExpandableStrings: false,
      hasMemberInvocations: false,
      hasAssignments: false,
      hasStopParsing: e.hasStopParsing
    };
    function n(r) {
      if (!r.elementTypes) {
        return;
      }
      for (let o of r.elementTypes) {
        switch (o) {
          case "ScriptBlock":
            t.hasScriptBlocks = true;
            break;
          case "SubExpression":
            t.hasSubExpressions = true;
            break;
          case "ExpandableString":
            t.hasExpandableStrings = true;
            break;
          case "MemberInvocation":
            t.hasMemberInvocations = true;
            break;
        }
      }
    }
    for (let r of e.statements) {
      if (r.statementType === "AssignmentStatementAst") {
        t.hasAssignments = true;
      }
      for (let o of r.commands) {
        n(o);
      }
      if (r.nestedCommands) {
        for (let o of r.nestedCommands) {
          n(o);
        }
      }
      if (r.securityPatterns) {
        if (r.securityPatterns.hasMemberInvocations) {
          t.hasMemberInvocations = true;
        }
        if (r.securityPatterns.hasSubExpressions) {
          t.hasSubExpressions = true;
        }
        if (r.securityPatterns.hasExpandableStrings) {
          t.hasExpandableStrings = true;
        }
        if (r.securityPatterns.hasScriptBlocks) {
          t.hasScriptBlocks = true;
        }
      }
    }
    for (let r of e.variables) {
      if (r.isSplatted) {
        t.hasSplatting = true;
        break;
      }
    }
    return t;
  }
  var qWa = `
if (-not $EncodedCommand) {
    Write-Output '{"valid":false,"errors":[{"message":"No command provided","errorId":"NoInput"}],"statements":[],"variables":[],"hasStopParsing":false,"originalCommand":""}'
    exit 0
}

$Command = [System.Text.Encoding]::UTF8.GetString([System.Convert]::FromBase64String($EncodedCommand))

$tokens = $null
$parseErrors = $null
$ast = [System.Management.Automation.Language.Parser]::ParseInput(
    $Command,
    [ref]$tokens,
    [ref]$parseErrors
)

$allVariables = [System.Collections.ArrayList]::new()

function Get-RawCommandElements {
    param([System.Management.Automation.Language.CommandAst]$CmdAst)
    $elems = [System.Collections.ArrayList]::new()
    foreach ($ce in $CmdAst.CommandElements) {
        $ceData = @{ type = $ce.GetType().Name; text = $ce.Extent.Text }
        if ($ce.PSObject.Properties['Value'] -and $null -ne $ce.Value -and $ce.Value -is [string]) {
            $ceData.value = $ce.Value
        }
        if ($ce -is [System.Management.Automation.Language.CommandExpressionAst]) {
            $ceData.expressionType = $ce.Expression.GetType().Name
        }
        $a=$ce.Argument;if($a){$ceData.children=@(@{type=$a.GetType().Name;text=$a.Extent.Text})}
        [void]$elems.Add($ceData)
    }
    return $elems
}

function Get-RawRedirections {
    param($Redirections)
    $result = [System.Collections.ArrayList]::new()
    foreach ($redir in $Redirections) {
        $redirData = @{ type = $redir.GetType().Name }
        if ($redir -is [System.Management.Automation.Language.FileRedirectionAst]) {
            $redirData.append = [bool]$redir.Append
            $redirData.fromStream = $redir.FromStream.ToString()
            $redirData.locationText = $redir.Location.Extent.Text
        }
        [void]$result.Add($redirData)
    }
    return $result
}

function Get-SecurityPatterns($A) {
    $p = @{}
    foreach ($n in $A.FindAll({ param($x)
        $x -is [System.Management.Automation.Language.MemberExpressionAst] -or
        $x -is [System.Management.Automation.Language.SubExpressionAst] -or
        $x -is [System.Management.Automation.Language.ArrayExpressionAst] -or
        $x -is [System.Management.Automation.Language.ExpandableStringExpressionAst] -or
        $x -is [System.Management.Automation.Language.ScriptBlockExpressionAst] -or
        $x -is [System.Management.Automation.Language.ParenExpressionAst]
    }, $true)) { switch ($n.GetType().Name) {
        'InvokeMemberExpressionAst' { $p.hasMemberInvocations = $true }
        'MemberExpressionAst' { $p.hasMemberInvocations = $true }
        'SubExpressionAst' { $p.hasSubExpressions = $true }
        'ArrayExpressionAst' { $p.hasSubExpressions = $true }
        'ParenExpressionAst' { $p.hasSubExpressions = $true }
        'ExpandableStringExpressionAst' { $p.hasExpandableStrings = $true }
        'ScriptBlockExpressionAst' { $p.hasScriptBlocks = $true }
    }}
    if ($p.Count -gt 0) { return $p }
    return $null
}

$varExprs = $ast.FindAll({ param($node) $node -is [System.Management.Automation.Language.VariableExpressionAst] }, $true)
foreach ($v in $varExprs) {
    [void]$allVariables.Add(@{
        path = $v.VariablePath.ToString()
        isSplatted = [bool]$v.Splatted
    })
}

$typeLiterals = [System.Collections.ArrayList]::new()
foreach ($t in $ast.FindAll({ param($n)
    $n -is [System.Management.Automation.Language.TypeExpressionAst] -or
    $n -is [System.Management.Automation.Language.TypeConstraintAst]
}, $true)) { [void]$typeLiterals.Add($t.TypeName.FullName) }

$hasStopParsing = $false
foreach ($tok in $tokens) {
    $norm = $tok.Text -replace '[\\u2013\\u2014\\u2015]','-' -replace '[\`''""\\u2018-\\u201f]',''
    if ($norm -eq '--%') {
        $hasStopParsing = $true; break
    }
}

$statements = [System.Collections.ArrayList]::new()
$script:hasBg = $false
foreach ($p in $ast.FindAll({param($n) $n -is [System.Management.Automation.Language.PipelineBaseAst]}, $true)) {
    if ($p.PSObject.Properties['Background'] -and $p.Background) { $script:hasBg = $true; break }
}

function Process-BlockStatements {
    param($Block)
    if (-not $Block) { return }

    foreach ($stmt in $Block.Statements) {
        $statement = @{
            type = $stmt.GetType().Name
            text = $stmt.Extent.Text
        }

        if ($stmt -is [System.Management.Automation.Language.PipelineAst]) {
            $elements = [System.Collections.ArrayList]::new()
            foreach ($element in $stmt.PipelineElements) {
                $elemData = @{
                    type = $element.GetType().Name
                    text = $element.Extent.Text
                }

                if ($element -is [System.Management.Automation.Language.CommandAst]) {
                    $elemData.commandElements = @(Get-RawCommandElements -CmdAst $element)
                    $elemData.redirections = @(Get-RawRedirections -Redirections $element.Redirections)
                } elseif ($element -is [System.Management.Automation.Language.CommandExpressionAst]) {
                    $elemData.expressionType = $element.Expression.GetType().Name
                    $elemData.redirections = @(Get-RawRedirections -Redirections $element.Redirections)
                }

                [void]$elements.Add($elemData)
            }
            $statement.elements = @($elements)

            $allNestedCmds = $stmt.FindAll(
                { param($node) $node -is [System.Management.Automation.Language.CommandAst] },
                $true
            )
            $nestedCmds = [System.Collections.ArrayList]::new()
            foreach ($cmd in $allNestedCmds) {
                if ($cmd.Parent -eq $stmt) { continue }
                $nested = @{
                    type = $cmd.GetType().Name
                    text = $cmd.Extent.Text
                    commandElements = @(Get-RawCommandElements -CmdAst $cmd)
                    redirections = @(Get-RawRedirections -Redirections $cmd.Redirections)
                }
                [void]$nestedCmds.Add($nested)
            }
            if ($nestedCmds.Count -gt 0) {
                $statement.nestedCommands = @($nestedCmds)
            }
            $r = $stmt.FindAll({param($n) $n -is [System.Management.Automation.Language.FileRedirectionAst]}, $true)
            if ($r.Count -gt 0) {
                $rr = @(Get-RawRedirections -Redirections $r)
                $statement.redirections = if ($statement.redirections) { @($statement.redirections) + $rr } else { $rr }
            }
        } else {
            $nestedCmdAsts = $stmt.FindAll(
                { param($node) $node -is [System.Management.Automation.Language.CommandAst] },
                $true
            )
            $nested = [System.Collections.ArrayList]::new()
            foreach ($cmd in $nestedCmdAsts) {
                [void]$nested.Add(@{
                    type = 'CommandAst'
                    text = $cmd.Extent.Text
                    commandElements = @(Get-RawCommandElements -CmdAst $cmd)
                    redirections = @(Get-RawRedirections -Redirections $cmd.Redirections)
                })
            }
            if ($nested.Count -gt 0) {
                $statement.nestedCommands = @($nested)
            }
            $r = $stmt.FindAll({param($n) $n -is [System.Management.Automation.Language.FileRedirectionAst]}, $true)
            if ($r.Count -gt 0) { $statement.redirections = @(Get-RawRedirections -Redirections $r) }
        }

        $sp = Get-SecurityPatterns $stmt
        if ($sp) { $statement.securityPatterns = $sp }

        [void]$statements.Add($statement)
    }

    if ($Block.Traps) {
        foreach ($trap in $Block.Traps) {
            $statement = @{
                type = 'TrapStatementAst'
                text = $trap.Extent.Text
            }
            $nestedCmdAsts = $trap.FindAll(
                { param($node) $node -is [System.Management.Automation.Language.CommandAst] },
                $true
            )
            $nestedCmds = [System.Collections.ArrayList]::new()
            foreach ($cmd in $nestedCmdAsts) {
                $nested = @{
                    type = $cmd.GetType().Name
                    text = $cmd.Extent.Text
                    commandElements = @(Get-RawCommandElements -CmdAst $cmd)
                    redirections = @(Get-RawRedirections -Redirections $cmd.Redirections)
                }
                [void]$nestedCmds.Add($nested)
            }
            if ($nestedCmds.Count -gt 0) {
                $statement.nestedCommands = @($nestedCmds)
            }
            $r = $trap.FindAll({param($n) $n -is [System.Management.Automation.Language.FileRedirectionAst]}, $true)
            if ($r.Count -gt 0) { $statement.redirections = @(Get-RawRedirections -Redirections $r) }
            $sp = Get-SecurityPatterns $trap
            if ($sp) { $statement.securityPatterns = $sp }
            [void]$statements.Add($statement)
        }
    }
}

Process-BlockStatements -Block $ast.BeginBlock
Process-BlockStatements -Block $ast.ProcessBlock
Process-BlockStatements -Block $ast.EndBlock
Process-BlockStatements -Block $ast.CleanBlock
Process-BlockStatements -Block $ast.DynamicParamBlock

if ($ast.ParamBlock) {
  $pb = $ast.ParamBlock
  $pn = [System.Collections.ArrayList]::new()
  foreach ($c in $pb.FindAll({param($n) $n -is [System.Management.Automation.Language.CommandAst]}, $true)) {
    [void]$pn.Add(@{type='CommandAst';text=$c.Extent.Text;commandElements=@(Get-RawCommandElements -CmdAst $c);redirections=@(Get-RawRedirections -Redirections $c.Redirections)})
  }
  $pr = $pb.FindAll({param($n) $n -is [System.Management.Automation.Language.FileRedirectionAst]}, $true)
  $ps = Get-SecurityPatterns $pb
  if ($pn.Count -gt 0 -or $pr.Count -gt 0 -or $ps) {
    $st = @{type='ParamBlockAst';text=$pb.Extent.Text}
    if ($pn.Count -gt 0) { $st.nestedCommands = @($pn) }
    if ($pr.Count -gt 0) { $st.redirections = @(Get-RawRedirections -Redirections $pr) }
    if ($ps) { $st.securityPatterns = $ps }
    [void]$statements.Add($st)
  }
}

$hasUsingStatements = $ast.UsingStatements -and $ast.UsingStatements.Count -gt 0
$hasScriptRequirements = $ast.ScriptRequirements -ne $null

$output = @{
    valid = ($parseErrors.Count -eq 0)
    errors = @($parseErrors | ForEach-Object {
        @{
            message = $_.Message
            errorId = $_.ErrorId
        }
    })
    statements = @($statements)
    variables = @($allVariables)
    hasStopParsing = $hasStopParsing
    originalCommand = $Command
    typeLiterals = @($typeLiterals)
    hasUsingStatements = [bool]$hasUsingStatements
    hasScriptRequirements = [bool]$hasScriptRequirements
    hasBackgroundJob = [bool]$script:hasBg
}

$output | ConvertTo-Json -Depth 10 -Compress
`;
  var Y4p;
  var J4p;
  var dD_;
  var Q4p;
  var iWp;
  var REe;
  var _Q;
  var f3;
  function IM({
    children: e
  }) {
    let t = o9n.useContext(dMe);
    let [n, r,, o] = useTerminalViewport();
    let s = o9n.useRef(e);
    if ((o() ?? r.isVisible) || t) {
      s.current = e;
    }
    return GWa.jsx(gXd, {
      ref: n,
      children: s.current
    });
  }
  var o9n;
  var GWa;
  var xEe = __lazy(() => {
    ZHt();
    et();
    yGt();
    o9n = __toESM(ot(), 1);
    GWa = __toESM(ie(), 1);
  });
  function Z6e(e) {
    let t = VWa.c(10);
    let {
      elapsedTimeSeconds: n,
      timeoutMs: r
    } = e;
    if (n === undefined && !r) {
      return null;
    }
    let o;
    if (t[0] !== r) {
      o = r ? formatDuration(r, {
        hideTrailingZeros: true
      }) : undefined;
      t[0] = r;
      t[1] = o;
    } else {
      o = t[1];
    }
    let s = o;
    if (n === undefined) {
      let d = `(timeout ${s})`;
      let p;
      if (t[2] !== d) {
        p = s9n.jsx(Text, {
          dimColor: true,
          children: d
        });
        t[2] = d;
        t[3] = p;
      } else {
        p = t[3];
      }
      return p;
    }
    let i = n * 1000;
    let a;
    if (t[4] !== i) {
      a = formatDuration(i);
      t[4] = i;
      t[5] = a;
    } else {
      a = t[5];
    }
    let l = a;
    if (s) {
      let d = `(${l} \xB7 timeout ${s})`;
      let p;
      if (t[6] !== d) {
        p = s9n.jsx(Text, {
          dimColor: true,
          children: d
        });
        t[6] = d;
        t[7] = p;
      } else {
        p = t[7];
      }
      return p;
    }
    let c = `(${l})`;
    let u;
    if (t[8] !== c) {
      u = s9n.jsx(Text, {
        dimColor: true,
        children: c
      });
      t[8] = c;
      t[9] = u;
    } else {
      u = t[9];
    }
    return u;
  }
  var VWa;
  var s9n;
  var i9n = __lazy(() => {
    et();
    cs();
    VWa = __toESM(pt(), 1);
    s9n = __toESM(ie(), 1);
  });
  function Mht(e) {
    let t = zWa.c(30);
    let {
      output: n,
      fullOutput: r,
      elapsedTimeSeconds: o,
      totalLines: s,
      totalBytes: i,
      timeoutMs: a,
      verbose: l
    } = e;
    let c;
    if (t[0] !== r) {
      c = Li(r.trim());
      t[0] = r;
      t[1] = c;
    } else {
      c = t[1];
    }
    let u = c;
    let d;
    let p;
    if (t[2] !== n || t[3] !== u || t[4] !== l) {
      d = Li(n.trim()).split(`
`).filter(lWp);
      p = l ? u : d.slice(-5).join(`
`);
      t[2] = n;
      t[3] = u;
      t[4] = l;
      t[5] = d;
      t[6] = p;
    } else {
      d = t[5];
      p = t[6];
    }
    let m = p;
    if (!d.length) {
      let A;
      if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
        A = h3.jsx(Text, {
          dimColor: true,
          children: "Running\u2026 "
        });
        t[7] = A;
      } else {
        A = t[7];
      }
      let k;
      if (t[8] !== o || t[9] !== a) {
        k = h3.jsx(Vn, {
          children: h3.jsxs(IM, {
            children: [A, h3.jsx(Z6e, {
              elapsedTimeSeconds: o,
              timeoutMs: a
            })]
          })
        });
        t[8] = o;
        t[9] = a;
        t[10] = k;
      } else {
        k = t[10];
      }
      return k;
    }
    let f = s ? Math.max(0, s - 5) : 0;
    let h = "";
    if (!l && i && s) {
      h = `~${s} lines`;
    } else if (!l && f > 0) {
      h = `+${f} lines`;
    }
    let g = l ? undefined : Math.min(5, d.length);
    let y;
    if (t[11] !== m) {
      y = h3.jsx(Text, {
        dimColor: true,
        children: m
      });
      t[11] = m;
      t[12] = y;
    } else {
      y = t[12];
    }
    let _;
    if (t[13] !== g || t[14] !== y) {
      _ = h3.jsx(gXd, {
        height: g,
        flexDirection: "column",
        overflow: "hidden",
        children: y
      });
      t[13] = g;
      t[14] = y;
      t[15] = _;
    } else {
      _ = t[15];
    }
    let b;
    if (t[16] !== h) {
      b = h ? h3.jsx(Text, {
        dimColor: true,
        children: h
      }) : null;
      t[16] = h;
      t[17] = b;
    } else {
      b = t[17];
    }
    let S;
    if (t[18] !== o || t[19] !== a) {
      S = h3.jsx(Z6e, {
        elapsedTimeSeconds: o,
        timeoutMs: a
      });
      t[18] = o;
      t[19] = a;
      t[20] = S;
    } else {
      S = t[20];
    }
    let E;
    if (t[21] !== i) {
      E = i ? h3.jsx(Text, {
        dimColor: true,
        children: formatFileSize(i)
      }) : null;
      t[21] = i;
      t[22] = E;
    } else {
      E = t[22];
    }
    let C;
    if (t[23] !== b || t[24] !== S || t[25] !== E) {
      C = h3.jsxs(gXd, {
        flexDirection: "row",
        gap: 1,
        children: [b, S, E]
      });
      t[23] = b;
      t[24] = S;
      t[25] = E;
      t[26] = C;
    } else {
      C = t[26];
    }
    let x;
    if (t[27] !== _ || t[28] !== C) {
      x = h3.jsx(Vn, {
        children: h3.jsx(IM, {
          children: h3.jsxs(gXd, {
            flexDirection: "column",
            children: [_, C]
          })
        })
      });
      t[27] = _;
      t[28] = C;
      t[29] = x;
    } else {
      x = t[29];
    }
    return x;
  }
  function lWp(e) {
    return e;
  }
  var zWa;
  var h3;
  var a9n = __lazy(() => {
    et();
    cs();
    Wl();
    xEe();
    i9n();
    zWa = __toESM(pt(), 1);
    h3 = __toESM(ie(), 1);
  });
  function cWp(e) {
    for (let t of e) {
      if (t.context !== "Task") {
        continue;
      }
      let n = ZJ(t.chord);
      if (t.action === "task:background") {
        if (!KWa.vZc(n)) {
          return true;
        }
      } else if (t.action === null && KWa.vZc(n)) {
        return true;
      }
    }
    return false;
  }
  function l9n({
    handler: e,
    isActive: t
  }) {
    let n = bq();
    let r = Zu("task:background", "Task", "ctrl+b");
    let o = tE();
    let s = o?.bindings;
    let i = Nht.useMemo(() => s ? cWp(s) : false, [s]);
    let a = Nht.useRef(e);
    a.current = e;
    let l = !(n && !i);
    Nht.useEffect(() => {
      if (!o || !t) {
        return;
      }
      return o.registerHandler({
        action: "task:background",
        context: "Task",
        handler: () => a.current(),
        singleKey: l
      });
    }, [o, t, l]);
    let c = i ? r : "ctrl+x ctrl+b";
    let u = r === "" ? "" : Me.terminal === "tmux" ? c.split(" ").map(d => d === "ctrl+b" ? `${"ctrl+b"} ${"ctrl+b"}` : d).join(" ") : c;
    return {
      cohesionFixes: n,
      gateOnShortcut: u,
      resolvedShortcut: r
    };
  }
  var Nht;
  var KWa;
  var qEo = __lazy(() => {
    yq();
    c0();
    pr();
    mut();
    Nht = __toESM(ot(), 1);
    KWa = new Set(["ctrl+b", "ctrl+x ctrl+b"].map(e => ZJ(hG(e))));
  });
  function pWp(e, t) {
    return e + uWp(dWp() * (t - e + 1));
  }
  var uWp;
  var dWp;
  function mWp(e) {
    var t = e.length;
    return t ? e[pWp(0, t - 1)] : undefined;
  }
  function fWp(e, t) {
    return vnu(t, function (n) {
      return e[n];
    });
  }
  function hWp(e) {
    return e == null ? [] : fWp(e, $tu(e));
  }
  function gWp(e) {
    return mWp(hWp(e));
  }
  function yWp(e) {
    var t = Peu(e) ? mWp : gWp;
    return t(e);
  }
  function Lht() {
    let t = getInitialSettings().spinnerVerbs;
    if (!t) {
      return GEo;
    }
    if (t.mode === "replace") {
      return t.verbs.length > 0 ? t.verbs : GEo;
    }
    return [...GEo, ...t.verbs];
  }
  var GEo;
  var VEo = __lazy(() => {
    GEo = ["Accomplishing", "Actioning", "Actualizing", "Architecting", "Baking", "Beaming", "Beboppin'", "Befuddling", "Billowing", "Blanching", "Bloviating", "Boogieing", "Boondoggling", "Booping", "Bootstrapping", "Brewing", "Bunning", "Burrowing", "Calculating", "Canoodling", "Caramelizing", "Cascading", "Catapulting", "Cerebrating", "Channeling", "Channelling", "Choreographing", "Churning", "Clauding", "Coalescing", "Cogitating", "Combobulating", "Composing", "Computing", "Concocting", "Considering", "Contemplating", "Cooking", "Crafting", "Creating", "Crunching", "Crystallizing", "Cultivating", "Deciphering", "Deliberating", "Determining", "Dilly-dallying", "Discombobulating", "Doing", "Doodling", "Drizzling", "Ebbing", "Effecting", "Elucidating", "Embellishing", "Enchanting", "Envisioning", "Fermenting", "Fiddle-faddling", "Finagling", "Flamb\xE9ing", "Flibbertigibbeting", "Flowing", "Flummoxing", "Fluttering", "Forging", "Forming", "Frolicking", "Frosting", "Gallivanting", "Galloping", "Garnishing", "Generating", "Gesticulating", "Germinating", "Gitifying", "Grooving", "Gusting", "Harmonizing", "Hashing", "Hatching", "Herding", "Honking", "Hullaballooing", "Hyperspacing", "Ideating", "Imagining", "Improvising", "Incubating", "Inferring", "Infusing", "Ionizing", "Jitterbugging", "Julienning", "Kneading", "Leavening", "Levitating", "Lollygagging", "Manifesting", "Marinating", "Meandering", "Metamorphosing", "Misting", "Moonwalking", "Moseying", "Mulling", "Mustering", "Musing", "Nebulizing", "Nesting", "Newspapering", "Noodling", "Nucleating", "Orbiting", "Orchestrating", "Osmosing", "Perambulating", "Percolating", "Perusing", "Philosophising", "Photosynthesizing", "Pollinating", "Pondering", "Pontificating", "Pouncing", "Precipitating", "Prestidigitating", "Processing", "Proofing", "Propagating", "Puttering", "Puzzling", "Quantumizing", "Razzle-dazzling", "Razzmatazzing", "Recombobulating", "Reticulating", "Roosting", "Ruminating", "Saut\xE9ing", "Scampering", "Schlepping", "Scurrying", "Seasoning", "Shenaniganing", "Shimmying", "Simmering", "Skedaddling", "Sketching", "Slithering", "Smooshing", "Sock-hopping", "Spelunking", "Spinning", "Sprouting", "Stewing", "Sublimating", "Swirling", "Swooping", "Symbioting", "Synthesizing", "Tempering", "Thinking", "Thundering", "Tinkering", "Tomfoolering", "Topsy-turvying", "Transfiguring", "Transmuting", "Twisting", "Undulating", "Unfurling", "Unravelling", "Vibing", "Waddling", "Wandering", "Warping", "Whatchamacalliting", "Whirlpooling", "Whirring", "Whisking", "Wibbling", "Working", "Wrangling", "Zesting", "Zigzagging"];
  });
  function IEe(e) {
    return AEe.getState()[e ?? mainAgentId()] ?? t6t;
  }
  function oGa(e) {
    let t = e ?? mainAgentId();
    return u9n.useSyncExternalStore(AEe.subscribe, () => AEe.getState()[t] ?? t6t);
  }
  function sGa(e) {
    return u9n.useSyncExternalStore(AEe.subscribe, () => (AEe.getState()[e] ?? t6t).thinkingStartedAt);
  }
  function RNe(e, t) {
    AEe.setState(n => {
      let r = e in n;
      let o = n[e] ?? {
        ...t6t,
        defaultVerb: yWp(Lht()) ?? ""
      };
      let s = t(o);
      if (s === o && r) {
        return n;
      }
      return {
        ...n,
        [e]: s
      };
    });
  }
  function d9n(e) {
    AEe.setState(t => {
      if (!(e in t)) {
        return t;
      }
      let {
        [e]: n,
        ...r
      } = t;
      return r;
    });
  }
  function Epe(e) {
    function t(u) {
      let d = Date.now();
      RNe(e, p => p.mode === u ? p : {
        ...p,
        mode: u,
        thinkingStartedAt: u === "thinking" ? d : null
      });
    }
    function n(u) {
      RNe(e, d => d.overrideMessage === u ? d : {
        ...d,
        overrideMessage: u
      });
    }
    function r(u, d) {
      RNe(e, p => p.overrideColor === u && p.overrideShimmerColor === d ? p : {
        ...p,
        overrideColor: u,
        overrideShimmerColor: d
      });
    }
    function o(u) {
      RNe(e, d => d.turnEffort === u ? d : {
        ...d,
        turnEffort: u
      });
    }
    function s(u) {
      RNe(e, d => d.retryStatus === u ? d : {
        ...d,
        retryStatus: u
      });
    }
    function i(u, d = null) {
      let p = Date.now();
      RNe(e, m => {
        if (m.isCompacting === u && m.compactingHintText === d) {
          return m;
        }
        let f = u ? m.compactingStartTime ?? p : null;
        return {
          ...m,
          isCompacting: u,
          compactingHintText: d,
          compactingStartTime: f
        };
      });
    }
    function a() {
      RNe(e, u => u.overrideMessage === null && u.overrideColor === null && u.overrideShimmerColor === null && !u.isCompacting && u.compactingHintText === null && u.compactingStartTime === null ? u : {
        ...u,
        overrideMessage: null,
        overrideColor: null,
        overrideShimmerColor: null,
        isCompacting: false,
        compactingHintText: null,
        compactingStartTime: null
      });
    }
    function l() {
      let u = yWp(Lht()) ?? "";
      RNe(e, d => ({
        ...d,
        overrideMessage: null,
        overrideColor: null,
        overrideShimmerColor: null,
        isCompacting: false,
        compactingHintText: null,
        compactingStartTime: null,
        turnEffort: null,
        retryStatus: null,
        defaultVerb: u
      }));
    }
    function c(u) {
      switch (u.type) {
        case "hooks_start":
          r("claudeBlue_FOR_SYSTEM_SPINNER", "claudeBlueShimmer_FOR_SYSTEM_SPINNER");
          n(u.hookType === "pre_compact" ? "Running PreCompact hooks\u2026" : u.hookType === "post_compact" ? "Running PostCompact hooks\u2026" : "Running SessionStart hooks\u2026");
          return;
        case "compact_start":
          n("Compacting conversation");
          i(true, u.hintText ?? null);
          return;
        case "compact_end":
          a();
          return;
      }
    }
    return {
      setMode: t,
      setMessage: n,
      setColors: r,
      setTurnEffort: o,
      setRetryStatus: s,
      setCompacting: i,
      resetCompactionState: a,
      resetOverrides: l,
      applyCompactProgress: c
    };
  }
  function n6t(e) {
    Epe(mainAgentId()).setMode(e);
  }
  function zEo(e) {
    Epe(mainAgentId()).setMessage(e);
  }
  function iGa(e) {
    Epe(mainAgentId()).setTurnEffort(e);
  }
  function aGa(e) {
    Epe(mainAgentId()).setRetryStatus(e);
  }
  function lGa(e) {
    return u9n.useSyncExternalStore(AEe.subscribe, () => (AEe.getState()[e] ?? t6t).retryStatus);
  }
  function cGa() {
    Epe(mainAgentId()).resetOverrides();
  }
  function uGa(e) {
    Epe(mainAgentId()).applyCompactProgress(e);
  }
  var u9n;
  var t6t;
  var AEe;
  var vpe = __lazy(() => {
    at();
    VEo();
    tre();
    u9n = __toESM(ot(), 1);
    t6t = Object.freeze({
      mode: "responding",
      overrideMessage: null,
      overrideColor: null,
      overrideShimmerColor: null,
      isCompacting: false,
      compactingHintText: null,
      compactingStartTime: null,
      turnEffort: null,
      retryStatus: null,
      thinkingStartedAt: null,
      defaultVerb: ""
    });
    AEe = dO({});
  });
  function KEo(e, t) {
    if (e === undefined || e.size === 0) {
      return e;
    }
    let n;
    for (let [r, o] of e) {
      if (o === t) {
        (n ??= new Map(e)).delete(r);
      }
    }
    return n ?? e;
  }
  function DO(e, t) {
    return {
      register(n) {
        SWp(n, t);
      },
      update(n, r) {
        _Wp(n, t, r);
      },
      updateTranscript(n, r) {
        t(o => {
          let s = o.transcripts?.[n] ?? {
            messages: [],
            inProgressToolUseIDs: new Set()
          };
          let i = r(s);
          if (i === s) {
            return o;
          }
          return {
            ...o,
            transcripts: {
              ...o.transcripts,
              [n]: i
            }
          };
        });
      },
      getTranscript(n) {
        return e().transcripts[n];
      },
      remove(n) {
        d9n(n);
        t(r => {
          if (!(n in r.tasks)) {
            return r;
          }
          let {
            [n]: o,
            ...s
          } = r.tasks;
          let i = r.transcripts ?? {};
          let {
            [n]: a,
            ...l
          } = i;
          return {
            ...r,
            tasks: s,
            transcripts: n in i ? l : i,
            agentNameRegistry: KEo(r.agentNameRegistry, n)
          };
        });
      },
      evictTerminal(n) {
        TWp(n, t);
      },
      applyOffsetsAndEvict(n, r) {
        EWp(t, n, r);
      },
      get(n) {
        return e().tasks[n];
      },
      all() {
        return e().tasks;
      }
    };
  }
  function _Wp(e, t, n) {
    let r = null;
    let o = null;
    if (t(s => {
      let i = s.tasks?.[e];
      if (!i) {
        return s;
      }
      let a = n(i);
      if (a === i) {
        return s;
      }
      if (r = bWp(i, a), !Mw(i.status) && Mw(a.status)) {
        o = {
          status: a.status === "completed" ? "completed" : a.status === "failed" ? "failed" : "stopped",
          opts: {
            toolUseId: a.toolUseId,
            summary: a.terminal?.summary ?? a.description,
            outputFile: a.terminal?.output_file ?? a.outputFile,
            usage: a.terminal?.usage,
            skipTranscript: a.skipTranscript
          }
        };
      }
      return {
        ...s,
        tasks: {
          ...s.tasks,
          [e]: a
        }
      };
    }), r !== null) {
      vw({
        type: "system",
        subtype: "task_updated",
        task_id: e,
        patch: r
      });
    }
    if (o !== null) {
      zu(e, o.status, o.opts);
    }
  }
  function bWp(e, t) {
    let n = {};
    if (t.status !== e.status) {
      n.status = t.status;
    }
    if (t.description !== e.description) {
      n.description = t.description;
    }
    if (t.endTime !== e.endTime) {
      n.end_time = t.endTime;
    }
    if (t.totalPausedMs !== e.totalPausedMs) {
      n.total_paused_ms = t.totalPausedMs;
    }
    let r = "error" in e ? e.error : undefined;
    let o = "error" in t ? t.error : undefined;
    if (o !== r && o !== undefined) {
      n.error = o;
    }
    let s = "isBackgrounded" in e ? e.isBackgrounded : undefined;
    let i = "isBackgrounded" in t ? t.isBackgrounded : undefined;
    if (i !== s && i !== undefined) {
      n.is_backgrounded = i;
    }
    return Object.keys(n).length > 0 ? n : null;
  }
  function SWp(e, t) {
    $fo(e.id);
    let n = false;
    if (t(r => {
      let o = r.tasks[e.id];
      n = o !== undefined;
      let s = o && "retain" in o ? {
        ...e,
        retain: o.retain,
        startTime: o.startTime,
        diskLoaded: o.diskLoaded,
        pendingMessages: o.pendingMessages,
        keepaliveReasons: o.keepaliveReasons,
        ownerAgentId: o.ownerAgentId,
        parentAgentId: o.parentAgentId,
        spawnDepth: o.spawnDepth
      } : e;
      return {
        ...r,
        tasks: {
          ...r.tasks,
          [e.id]: s
        }
      };
    }), n) {
      return;
    }
    vw({
      type: "system",
      subtype: "task_started",
      task_id: e.id,
      tool_use_id: e.toolUseId,
      description: e.description,
      subagent_type: "agentType" in e ? e.agentType : undefined,
      task_type: e.type,
      workflow_name: "workflowName" in e ? e.workflowName : undefined,
      prompt: "prompt" in e ? e.prompt : undefined,
      skip_transcript: e.skipTranscript
    });
  }
  function TWp(e, t) {
    let n = false;
    if (t(r => {
      let o = r.tasks?.[e];
      if (!o) {
        return r;
      }
      if (!Mw(o.status)) {
        return r;
      }
      if (!o.notified) {
        return r;
      }
      if ("retain" in o && (o.evictAfter ?? 1 / 0) > Date.now()) {
        return r;
      }
      if ("retain" in o && (o.keepaliveReasons?.size ?? 0) > 0) {
        return r;
      }
      if (o.type === "local_workflow" && (o.evictAfter ?? 0) > Date.now()) {
        return r;
      }
      n = true;
      let {
        [e]: s,
        ...i
      } = r.tasks;
      let a = r.transcripts ?? {};
      let {
        [e]: l,
        ...c
      } = a;
      return {
        ...r,
        tasks: i,
        transcripts: e in a ? c : a,
        agentNameRegistry: KEo(r.agentNameRegistry, e)
      };
    }), n) {
      d9n(e);
    }
  }
  function Uht(e) {
    let t = e.tasks ?? {};
    return Object.values(t).filter(n => n.status === "running");
  }
  async function pGa(e) {
    let t = [];
    let n = {};
    let r = [];
    for (let o of Object.values(e)) {
      if (o.notified) {
        switch (o.status) {
          case "completed":
          case "failed":
          case "killed":
            r.push(o.id);
            continue;
          case "pending":
            continue;
          case "running":
            break;
        }
      }
      if (o.status === "running") {
        let s = await getTaskOutputDelta(o.id, o.outputOffset);
        if (s.content) {
          n[o.id] = s.newOffset;
        }
      }
    }
    return {
      attachments: t,
      updatedTaskOffsets: n,
      evictedTaskIds: r
    };
  }
  function EWp(e, t, n) {
    let r = Object.keys(t);
    if (r.length === 0 && n.length === 0) {
      return;
    }
    let o = [];
    e(s => {
      let i = false;
      let a = {
        ...s.tasks
      };
      for (let u of r) {
        let d = a[u];
        if (d?.status === "running") {
          a[u] = {
            ...d,
            outputOffset: t[u]
          };
          i = true;
        }
      }
      for (let u of n) {
        let d = a[u];
        if (!d || !Mw(d.status) || !d.notified) {
          continue;
        }
        if ("retain" in d && (d.evictAfter ?? 1 / 0) > Date.now()) {
          continue;
        }
        if ("retain" in d && (d.keepaliveReasons?.size ?? 0) > 0) {
          continue;
        }
        if (d.type === "local_workflow" && (d.evictAfter ?? 0) > Date.now()) {
          continue;
        }
        delete a[u];
        $fo(u);
        o.push(u);
        i = true;
      }
      if (!i) {
        return s;
      }
      let l = s.agentNameRegistry;
      let c;
      for (let u of o) {
        if (l = KEo(l, u), s.transcripts && u in s.transcripts) {
          c ??= {
            ...s.transcripts
          };
          delete c[u];
        }
      }
      return {
        ...s,
        tasks: a,
        agentNameRegistry: l,
        ...(c && {
          transcripts: c
        })
      };
    });
    for (let s of o) {
      d9n(s);
    }
  }
  var U$ = __lazy(() => {
    at();
    vpe();
    np();
    Cx();
    Rf();
    cE();
    Hfo();
  });
  function Rv() {
    let e = Ec();
    return mGa.useMemo(() => DO(() => e.getState(), e.setState), [e]);
  }
  var mGa;
  var _9 = __lazy(() => {
    U$();
    ho();
    mGa = __toESM(ot(), 1);
  });
  function vWp(e) {
    if (!e.match(/<sandbox_violations>([\s\S]*?)<\/sandbox_violations>/)) {
      return {
        cleanedStderr: e
      };
    }
    return {
      cleanedStderr: Nqn(e).trim()
    };
  }
  function wWp(e) {
    let t = e.match(fGa);
    if (!t) {
      return {
        cleanedStderr: e,
        cwdResetWarning: null
      };
    }
    let n = t[1] ?? null;
    return {
      cleanedStderr: e.replace(fGa, "").trim(),
      cwdResetWarning: n
    };
  }
  function e8e(e) {
    let t = hGa.c(34);
    let {
      content: n,
      verbose: r,
      timeoutMs: o
    } = e;
    let {
      stdout: s,
      stderr: i,
      isImage: a,
      returnCodeInterpretation: l,
      noOutputExpected: c,
      backgroundTaskId: u
    } = n;
    let d = s === undefined ? "" : s;
    let p = i === undefined ? "" : i;
    let m;
    let f;
    let h;
    let g;
    let y;
    let _;
    let b;
    if (t[0] !== a || t[1] !== p || t[2] !== d || t[3] !== r) {
      b = Symbol.for("react.early_return_sentinel");
      e: {
        let {
          cleanedStderr: A
        } = vWp(p);
        if ({
          cleanedStderr: h,
          cwdResetWarning: f
        } = wWp(A), a) {
          let k;
          if (t[11] === Symbol.for("react.memo_cache_sentinel")) {
            k = kU.jsx(Vn, {
              height: 1,
              children: kU.jsx(Text, {
                dimColor: true,
                children: "[Image data detected and sent to Claude]"
              })
            });
            t[11] = k;
          } else {
            k = t[11];
          }
          b = k;
          break e;
        }
        if (m = gXd, g = "column", t[12] !== d || t[13] !== r) {
          y = d !== "" ? kU.jsx(vU, {
            content: d,
            verbose: r
          }) : null;
          t[12] = d;
          t[13] = r;
          t[14] = y;
        } else {
          y = t[14];
        }
        _ = h.trim() !== "" ? kU.jsx(vU, {
          content: h,
          verbose: r,
          isError: true
        }) : null;
      }
      t[0] = a;
      t[1] = p;
      t[2] = d;
      t[3] = r;
      t[4] = m;
      t[5] = f;
      t[6] = h;
      t[7] = g;
      t[8] = y;
      t[9] = _;
      t[10] = b;
    } else {
      m = t[4];
      f = t[5];
      h = t[6];
      g = t[7];
      y = t[8];
      _ = t[9];
      b = t[10];
    }
    if (b !== Symbol.for("react.early_return_sentinel")) {
      return b;
    }
    let S;
    if (t[15] !== f) {
      S = f ? kU.jsx(Vn, {
        children: kU.jsx(Text, {
          dimColor: true,
          children: f
        })
      }) : null;
      t[15] = f;
      t[16] = S;
    } else {
      S = t[16];
    }
    let E;
    if (t[17] !== u || t[18] !== f || t[19] !== c || t[20] !== l || t[21] !== h || t[22] !== d) {
      E = d === "" && h.trim() === "" && !f ? kU.jsx(Vn, {
        height: 1,
        children: kU.jsx(Text, {
          dimColor: true,
          children: u ? kU.jsxs(kU.Fragment, {
            children: ["Running in the background", " ", kU.jsx(xt, {
              chord: "down",
              action: "manage",
              parens: true
            })]
          }) : l || (c ? "Done" : "(No output)")
        })
      }) : null;
      t[17] = u;
      t[18] = f;
      t[19] = c;
      t[20] = l;
      t[21] = h;
      t[22] = d;
      t[23] = E;
    } else {
      E = t[23];
    }
    let C;
    if (t[24] !== o) {
      C = o && kU.jsx(Vn, {
        children: kU.jsx(Z6e, {
          timeoutMs: o
        })
      });
      t[24] = o;
      t[25] = C;
    } else {
      C = t[25];
    }
    let x;
    if (t[26] !== m || t[27] !== C || t[28] !== g || t[29] !== y || t[30] !== _ || t[31] !== S || t[32] !== E) {
      x = kU.jsxs(m, {
        flexDirection: g,
        children: [y, _, S, E, C]
      });
      t[26] = m;
      t[27] = C;
      t[28] = g;
      t[29] = y;
      t[30] = _;
      t[31] = S;
      t[32] = E;
      t[33] = x;
    } else {
      x = t[33];
    }
    return x;
  }
  var hGa;
  var kU;
  var fGa;
  var p9n = __lazy(() => {
    bs();
    Wl();
    vMe();
    i9n();
    et();
    hGa = __toESM(pt(), 1);
    kU = __toESM(ie(), 1);
    fGa = /(?:^|\n)(Shell cwd was reset to .+)$/;
  });
  function t8e(e) {
    let t = e.trim();
    if (m3n(t)) {
      return null;
    }
    let r = _O()?.parse(t)?.children.filter(b => b.type !== "comment") ?? [];
    if (r.length !== 1 || r[0].type !== "command" || r[0].children.some(b => !CWp.vZc(b.type))) {
      return null;
    }
    let o = uE(t);
    if (o[0] !== "sed") {
      return null;
    }
    let s = o.slice(1);
    let i = false;
    let a = false;
    let l = null;
    let c = null;
    let u = 0;
    while (u < s.length) {
      let b = s[u];
      if (b === "-i" || b === "--in-place") {
        if (i = true, u++, u < s.length) {
          let S = s[u];
          if (typeof S === "string" && !S.startsWith("-") && (S === "" || S.startsWith("."))) {
            u++;
          }
        }
        continue;
      }
      if (b.startsWith("-i")) {
        i = true;
        u++;
        continue;
      }
      if (b === "-E" || b === "-r" || b === "--regexp-extended") {
        a = true;
        u++;
        continue;
      }
      if (b === "-e" || b === "--expression") {
        if (u + 1 < s.length && typeof s[u + 1] === "string") {
          if (l !== null) {
            return null;
          }
          l = s[u + 1];
          u += 2;
          continue;
        }
        return null;
      }
      if (b.startsWith("--expression=")) {
        if (l !== null) {
          return null;
        }
        l = b.slice(13);
        u++;
        continue;
      }
      if (b.startsWith("-")) {
        return null;
      }
      if (l === null) {
        l = b;
      } else if (c === null) {
        c = b;
      } else {
        return null;
      }
      u++;
    }
    if (!i || !l || !c) {
      return null;
    }
    if (HI(c, true) || Wt() === "windows" && /(?<!:)[\\/]{2,}[^ \t\r\n\f\v\\/]/.test(c)) {
      return null;
    }
    if (!l.match(/^s\//)) {
      return null;
    }
    let p = l.slice(2);
    let m = "";
    let f = "";
    let h = "";
    let g = "pattern";
    let y = 0;
    while (y < p.length) {
      let b = p[y];
      if (b === "\\" && y + 1 < p.length) {
        if (g === "pattern") {
          m += b + p[y + 1];
        } else if (g === "replacement") {
          f += b + p[y + 1];
        } else {
          h += b + p[y + 1];
        }
        y += 2;
        continue;
      }
      if (b === "/") {
        if (g === "pattern") {
          g = "replacement";
        } else if (g === "replacement") {
          g = "flags";
        } else {
          return null;
        }
        y++;
        continue;
      }
      if (g === "pattern") {
        m += b;
      } else if (g === "replacement") {
        f += b;
      } else {
        h += b;
      }
      y++;
    }
    if (g !== "flags") {
      return null;
    }
    if (!/^[gpimIM1-9]*$/.test(h)) {
      return null;
    }
    return {
      filePath: c,
      pattern: m,
      replacement: f,
      flags: h,
      extendedRegex: a
    };
  }
  function vGa(e, t) {
    let n = "";
    if (t.flags.includes("g")) {
      n += "g";
    }
    if (t.flags.includes("i") || t.flags.includes("I")) {
      n += "i";
    }
    if (t.flags.includes("m") || t.flags.includes("M")) {
      n += "m";
    }
    let r = t.pattern.replace(/\\\//g, "/");
    if (!t.extendedRegex) {
      r = r.replace(/\\\\/g, "\x00BACKSLASH\x00").replace(/\\\+/g, "\x00PLUS\x00").replace(/\\\?/g, "\x00QUESTION\x00").replace(/\\\|/g, "\x00PIPE\x00").replace(/\\\(/g, "\x00LPAREN\x00").replace(/\\\)/g, "\x00RPAREN\x00").replace(/\+/g, "\\+").replace(/\?/g, "\\?").replace(/\|/g, "\\|").replace(/\(/g, "\\(").replace(/\)/g, "\\)").replace(RWp, "\\\\").replace(xWp, "+").replace(kWp, "?").replace(AWp, "|").replace(IWp, "(").replace(PWp, ")");
    }
    let s = `___ESCAPED_AMPERSAND_${gGa.randomBytes(8).toString("hex")}___`;
    let i = t.replacement.replace(/\\\//g, "/").replace(/\\&/g, s).replace(/&/g, "$$&").replace(new RegExp(s, "g"), "&");
    try {
      let a = new RegExp(r, n);
      return e.replace(a, i);
    } catch {
      return e;
    }
  }
  var gGa;
  var CWp;
  var RWp;
  var xWp;
  var kWp;
  var AWp;
  var IWp;
  var PWp;
  var r6t = __lazy(() => {
    iTe();
    bU();
    Cs();
    pde();
    gGa = require("crypto");
    CWp = new Set(["command_name", "word", "string", "raw_string", "number", "concatenation"]);
    RWp = new RegExp("\x00BACKSLASH\x00", "g");
    xWp = new RegExp("\x00PLUS\x00", "g");
    kWp = new RegExp("\x00QUESTION\x00", "g");
    AWp = new RegExp("\x00PIPE\x00", "g");
    IWp = new RegExp("\x00LPAREN\x00", "g");
    PWp = new RegExp("\x00RPAREN\x00", "g");
  });