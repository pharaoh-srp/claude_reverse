  __export(p_c, {
    sendChromeMessage: () => sendChromeMessage,
    runChromeNativeHost: () => runChromeNativeHost
  });
  function TR(e, ...t) {
    if (undefined) {
      let n = new Date().toISOString();
      let r = t.length > 0 ? " " + De(t) : "";
      let o = `[${n}] [Claude Chrome Native Host] ${e}${r}
`;
      DH.appendFile(undefined, o).catch(() => {});
    }
    console.error(`[Claude Chrome Native Host] ${e}`, ...t);
  }
  function sendChromeMessage(e) {
    let t = Buffer.from(e, "utf-8");
    let n = Buffer.alloc(4);
    n.writeUInt32LE(t.length, 0);
    process.stdout.write(n);
    process.stdout.write(t);
  }
  async function runChromeNativeHost() {
    return vl("chrome_native_host_run", async () => {
      TR("Initializing...");
      let e = new u_c();
      let t = new d_c();
      await e.start();
      while (true) {
        let n = await t.read();
        if (n === null) {
          break;
        }
        await e.handleMessage(n);
      }
      await e.stop();
    });
  }
  class u_c {
    mcpClients = new Map();
    nextClientId = 1;
    server = null;
    running = false;
    socketPath = null;
    async start() {
      if (this.running) {
        return;
      }
      if (this.socketPath = getSecureSocketPath(), qmr.platform() !== "win32") {
        let e = getSocketDir();
        await DH.unlink(e).catch(() => {});
        await DH.mkdir(e, {
          recursive: true,
          mode: 448
        });
        await DH.chmod(e, 448).catch(() => {});
        try {
          let t = await DH.readdir(e);
          for (let n of t) {
            if (!n.endsWith(".sock")) {
              continue;
            }
            let r = parseInt(n.replace(".sock", ""), 10);
            if (isNaN(r)) {
              continue;
            }
            try {
              process.kill(r, 0);
            } catch {
              await DH.unlink(c_c.join(e, n)).catch(() => {});
              TR(`Removed stale socket for PID ${r}`);
            }
          }
        } catch {}
      }
      if (TR(`Creating socket listener: ${this.socketPath}`), this.server = l_c.createServer(e => this.handleMcpClient(e)), await new Promise((e, t) => {
        this.server.listen(this.socketPath, () => {
          TR("Socket server listening for connections");
          this.running = true;
          e();
        });
        this.server.on("error", n => {
          TR("Socket server error:", n);
          t(n);
        });
      }), qmr.platform() !== "win32") {
        try {
          await DH.chmod(this.socketPath, 384);
          TR("Socket permissions set to 0600");
        } catch (e) {
          TR("Failed to set socket permissions:", e);
        }
      }
    }
    async stop() {
      if (!this.running) {
        return;
      }
      for (let [, e] of this.mcpClients) {
        e.socket.destroy();
      }
      if (this.mcpClients.clear(), this.server) {
        await new Promise(e => {
          this.server.close(() => e());
        });
        this.server = null;
      }
      if (qmr.platform() !== "win32" && this.socketPath) {
        try {
          await DH.unlink(this.socketPath);
          TR("Cleaned up socket file");
        } catch {}
        try {
          let e = getSocketDir();
          if ((await DH.readdir(e)).length === 0) {
            await DH.rmdir(e);
            TR("Removed empty socket directory");
          }
        } catch {}
      }
      this.running = false;
    }
    async isRunning() {
      return this.running;
    }
    async getClientCount() {
      return this.mcpClients.size;
    }
    async handleMessage(e) {
      let t;
      try {
        t = qt(e);
      } catch (o) {
        TR("Invalid JSON from Chrome:", o.message);
        sendChromeMessage(De({
          type: "error",
          error: "Invalid message format"
        }));
        return;
      }
      let n = c_f().safeParse(t);
      if (!n.success) {
        TR("Invalid message from Chrome:", n.error.message);
        sendChromeMessage(De({
          type: "error",
          error: "Invalid message format"
        }));
        return;
      }
      let r = n.data;
      switch (TR(`Handling Chrome message type: ${r.type}`), r.type) {
        case "ping":
          TR("Responding to ping");
          sendChromeMessage(De({
            type: "pong",
            timestamp: Date.now()
          }));
          break;
        case "get_status":
          sendChromeMessage(De({
            type: "status_response",
            native_host_version: "1.0.0"
          }));
          break;
        case "tool_response":
          {
            if (this.mcpClients.size > 0) {
              TR(`Forwarding tool response to ${this.mcpClients.size} MCP clients`);
              let {
                type: o,
                ...s
              } = r;
              let i = Buffer.from(De(s), "utf-8");
              let a = Buffer.alloc(4);
              a.writeUInt32LE(i.length, 0);
              let l = Buffer.concat([a, i]);
              for (let [c, u] of this.mcpClients) {
                try {
                  u.socket.write(l);
                } catch (d) {
                  TR(`Failed to send to MCP client ${c}:`, d);
                }
              }
            }
            break;
          }
        case "notification":
          {
            if (this.mcpClients.size > 0) {
              TR(`Forwarding notification to ${this.mcpClients.size} MCP clients`);
              let {
                type: o,
                ...s
              } = r;
              let i = Buffer.from(De(s), "utf-8");
              let a = Buffer.alloc(4);
              a.writeUInt32LE(i.length, 0);
              let l = Buffer.concat([a, i]);
              for (let [c, u] of this.mcpClients) {
                try {
                  u.socket.write(l);
                } catch (d) {
                  TR(`Failed to send notification to MCP client ${c}:`, d);
                }
              }
            }
            break;
          }
        default:
          TR(`Unknown message type: ${r.type}`);
          sendChromeMessage(De({
            type: "error",
            error: `Unknown message type: ${r.type}`
          }));
      }
    }
    handleMcpClient(e) {
      let t = this.nextClientId++;
      let n = {
        id: t,
        socket: e,
        buffer: Buffer.alloc(0)
      };
      this.mcpClients.set(t, n);
      TR(`MCP client ${t} connected. Total clients: ${this.mcpClients.size}`);
      sendChromeMessage(De({
        type: "mcp_connected"
      }));
      e.on("data", r => {
        n.buffer = Buffer.concat([n.buffer, r]);
        while (n.buffer.length >= 4) {
          let o = n.buffer.readUInt32LE(0);
          if (o === 0 || o > 1048576) {
            TR(`Invalid message length from MCP client ${t}: ${o}`);
            e.destroy();
            return;
          }
          if (n.buffer.length < 4 + o) {
            break;
          }
          let s = n.buffer.slice(4, 4 + o);
          n.buffer = n.buffer.slice(4 + o);
          try {
            let i = qt(s.toString("utf-8"));
            TR(`Forwarding tool request from MCP client ${t}: ${i.method}`);
            sendChromeMessage(De({
              type: "tool_request",
              method: i.method,
              params: i.params
            }));
          } catch (i) {
            TR(`Failed to parse tool request from MCP client ${t}:`, i);
          }
        }
      });
      e.on("error", r => {
        TR(`MCP client ${t} error: ${r}`);
      });
      e.on("close", () => {
        TR(`MCP client ${t} disconnected. Remaining clients: ${this.mcpClients.size - 1}`);
        this.mcpClients.delete(t);
        sendChromeMessage(De({
          type: "mcp_disconnected"
        }));
      });
    }
  }
  class d_c {
    buffer = Buffer.alloc(0);
    pendingResolve = null;
    closed = false;
    constructor() {
      process.stdin.on("data", e => {
        this.buffer = Buffer.concat([this.buffer, e]);
        this.tryProcessMessage();
      });
      process.stdin.on("end", () => {
        if (this.closed = true, this.pendingResolve) {
          this.pendingResolve(null);
          this.pendingResolve = null;
        }
      });
      process.stdin.on("error", () => {
        if (this.closed = true, this.pendingResolve) {
          this.pendingResolve(null);
          this.pendingResolve = null;
        }
      });
    }
    tryProcessMessage() {
      if (!this.pendingResolve) {
        return;
      }
      if (this.buffer.length < 4) {
        return;
      }
      let e = this.buffer.readUInt32LE(0);
      if (e === 0 || e > 1048576) {
        TR(`Invalid message length: ${e}`);
        this.pendingResolve(null);
        this.pendingResolve = null;
        return;
      }
      if (this.buffer.length < 4 + e) {
        return;
      }
      let t = this.buffer.subarray(4, 4 + e);
      this.buffer = this.buffer.subarray(4 + e);
      let n = t.toString("utf-8");
      this.pendingResolve(n);
      this.pendingResolve = null;
    }
    async read() {
      if (this.closed) {
        return null;
      }
      if (this.buffer.length >= 4) {
        let e = this.buffer.readUInt32LE(0);
        if (e > 0 && e <= 1048576 && this.buffer.length >= 4 + e) {
          let t = this.buffer.subarray(4, 4 + e);
          this.buffer = this.buffer.subarray(4 + e);
          return t.toString("utf-8");
        }
      }
      return new Promise(e => {
        this.pendingResolve = e;
        this.tryProcessMessage();
      });
    }
  }
  var DH;
  var l_c;
  var qmr;
  var c_c;
  var c_f;
  var m_c = __lazy(() => {
    qg();
    ln();
    b1();
    DH = require("fs/promises");
    l_c = require("net");
    qmr = require("os");
    c_c = require("path");
    c_f = we(() => Ke.object({
      type: Ke.string()
    }).passthrough());
  });
  function f_c({
    currentVersion: e,
    requiredMinimumVersion: t,
    requiredMaximumVersion: n,
    topLevelCommand: r
  }) {
    if (!t && !n) {
      return null;
    }
    if (r !== undefined && u_f.vZc(r)) {
      return null;
    }
    if (!Wmr.parse(e)) {
      return null;
    }
    if (t) {
      let o = Wmr.parse(t)?.version;
      if (!o) {
        logForDebugging(`requiredMinimumVersion '${t}' is not a valid semver version \u2014 ignoring`, {
          level: "error"
        });
      } else if (!iO(e, o)) {
        return `Claude Code ${e} is older than the minimum version required by your organization (${t}).
Update Claude Code using your organization's approved method, then try again. If automatic updates are available, \`claude update\` may also work.`;
      }
    }
    if (n) {
      let o = Wmr.parse(n)?.version;
      if (!o) {
        logForDebugging(`requiredMaximumVersion '${n}' is not a valid semver version \u2014 ignoring`, {
          level: "error"
        });
      } else if (!Yat(e, o)) {
        return `Claude Code ${e} is newer than the maximum version allowed by your organization (${n}).
Your organization requires version ${n} or older. Install an approved version using your organization's approved method. \`claude install <version>\` may also work.`;
      }
    }
    return null;
  }
  function h_c(e) {
    try {
      let t = e.parent ? e : null;
      while (t?.parent?.parent) {
        t = t.parent;
      }
      let n = getSettingsForSource("policySettings");
      return f_c({
        currentVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        requiredMinimumVersion: n?.requiredMinimumVersion,
        requiredMaximumVersion: n?.requiredMaximumVersion,
        topLevelCommand: t?.name()
      });
    } catch (t) {
      Oe(t);
      return null;
    }
  }
  function g_c() {
    try {
      let e = getSettingsForSource("policySettings");
      return f_c({
        currentVersion: {
          ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
          PACKAGE_URL: "@anthropic-ai/claude-code",
          README_URL: "https://code.claude.com/docs/en/overview",
          VERSION: "2.1.198",
          FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
          BUILD_TIME: "2026-07-01T06:09:31Z",
          GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
        }.VERSION,
        requiredMinimumVersion: e?.requiredMinimumVersion,
        requiredMaximumVersion: e?.requiredMaximumVersion,
        topLevelCommand: undefined
      });
    } catch (e) {
      Oe(e);
      return null;
    }
  }
  var Wmr;
  var u_f;
  var B7o = __lazy(() => {
    je();
    Rn();
    Wmr = __toESM(lq(), 1);
    u_f = new Set(["update", "install", "doctor"]);
  });
  var UCe = {};