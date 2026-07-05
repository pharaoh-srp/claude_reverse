  function Zyu() {
    let e = new Xbs.default({
      strict: false,
      validateFormats: true,
      validateSchema: false,
      allErrors: true
    });
    Qbs.default(e);
    return e;
  }
  class UOt {
    constructor(e) {
      this._ajv = e ?? Zyu();
    }
    getValidator(e) {
      let t = "$id" in e && typeof e.$id === "string" ? this._ajv.getSchema(e.$id) ?? this._ajv.compile(e) : this._ajv.compile(e);
      return n => {
        if (t(n)) {
          return {
            valid: true,
            data: n,
            errorMessage: undefined
          };
        } else {
          return {
            valid: false,
            data: undefined,
            errorMessage: this._ajv.errorsText(t.errors)
          };
        }
      };
    }
  }
  var Xbs;
  var Qbs;
  var KPr = __lazy(() => {
    Xbs = __toESM(Vmn(), 1);
    Qbs = __toESM(Jbs(), 1);
  });
  class YPr {
    constructor(e) {
      this._server = e;
    }
    requestStream(e, t, n) {
      return this._server.requestStream(e, t, n);
    }
    createMessageStream(e, t) {
      let n = this._server.getClientCapabilities();
      if ((e.tools || e.toolChoice) && !n?.sampling?.tools) {
        throw Error("Client does not support sampling tools capability.");
      }
      if (e.messages.length > 0) {
        let r = e.messages[e.messages.length - 1];
        let o = Array.isArray(r.content) ? r.content : [r.content];
        let s = o.some(c => c.type === "tool_result");
        let i = e.messages.length > 1 ? e.messages[e.messages.length - 2] : undefined;
        let a = i ? Array.isArray(i.content) ? i.content : [i.content] : [];
        let l = a.some(c => c.type === "tool_use");
        if (s) {
          if (o.some(c => c.type !== "tool_result")) {
            throw Error("The last message must contain only tool_result content if any is present");
          }
          if (!l) {
            throw Error("tool_result blocks are not matching any tool_use from the previous message");
          }
        }
        if (l) {
          let c = new Set(a.filter(d => d.type === "tool_use").map(d => d.id));
          let u = new Set(o.filter(d => d.type === "tool_result").map(d => d.toolUseId));
          if (c.size !== u.size || ![...c].every(d => u.vZc(d))) {
            throw Error("ids of tool_result blocks and tool_use blocks from previous message do not match");
          }
        }
      }
      return this.requestStream({
        method: "sampling/createMessage",
        params: e
      }, dHe, t);
    }
    elicitInputStream(e, t) {
      let n = this._server.getClientCapabilities();
      let r = e.mode ?? "form";
      switch (r) {
        case "url":
          {
            if (!n?.elicitation?.url) {
              throw Error("Client does not support url elicitation.");
            }
            break;
          }
        case "form":
          {
            if (!n?.elicitation?.form) {
              throw Error("Client does not support form elicitation.");
            }
            break;
          }
      }
      let o = r === "form" && e.mode === undefined ? {
        ...e,
        mode: "form"
      } : e;
      return this.requestStream({
        method: "elicitation/create",
        params: o
      }, Bxe, t);
    }
    async getTask(e, t) {
      return this._server.getTask({
        taskId: e
      }, t);
    }
    async getTaskResult(e, t, n) {
      return this._server.getTaskResult({
        taskId: e
      }, t, n);
    }
    async listTasks(e, t) {
      return this._server.listTasks(e ? {
        cursor: e
      } : undefined, t);
    }
    async cancelTask(e, t) {
      return this._server.cancelTask({
        taskId: e
      }, t);
    }
  }
  var Zbs = __lazy(() => {});
  function Kmn(e, t, n) {
    if (!e) {
      throw Error(`${n} does not support task creation (required for ${t})`);
    }
    switch (t) {
      case "tools/call":
        if (!e.tools?.call) {
          throw Error(`${n} does not support task creation for tools/call (required for ${t})`);
        }
        break;
      default:
        break;
    }
  }
  function Ymn(e, t, n) {
    if (!e) {
      throw Error(`${n} does not support task creation (required for ${t})`);
    }
    switch (t) {
      case "sampling/createMessage":
        if (!e.sampling?.createMessage) {
          throw Error(`${n} does not support task creation for sampling/createMessage (required for ${t})`);
        }
        break;
      case "elicitation/create":
        if (!e.elicitation?.create) {
          throw Error(`${n} does not support task creation for elicitation/create (required for ${t})`);
        }
        break;
      default:
        break;
    }
  }
  var pye;
  var BOt = __lazy(() => {
    dIr();
    KPr();
    qet();
    Zbs();
    pye = class pye extends pOt {
      constructor(e, t) {
        super(t);
        if (this._serverInfo = e, this._loggingLevels = new Map(), this.LOG_LEVEL_SEVERITY = new Map(lOt.options.map((n, r) => [n, r])), this.isMessageIgnored = (n, r) => {
          let o = this._loggingLevels.get(r);
          return o ? this.LOG_LEVEL_SEVERITY.get(n) < this.LOG_LEVEL_SEVERITY.get(o) : false;
        }, this._capabilities = t?.capabilities ?? {}, this._instructions = t?.instructions, this._jsonSchemaValidator = t?.jsonSchemaValidator ?? new UOt(), this.setRequestHandler(b0r, n => this._oninitialize(n)), this.setNotificationHandler($pn, () => this.oninitialized?.()), this._capabilities.logging) {
          this.setRequestHandler(x0r, async (n, r) => {
            let o = r.sessionId || r.requestInfo?.headers["mcp-session-id"] || undefined;
            let {
              level: s
            } = n.params;
            let i = lOt.safeParse(s);
            if (i.success) {
              this._loggingLevels.set(o, i.data);
            }
            return {};
          });
        }
      }
      get experimental() {
        if (!this._experimental) {
          this._experimental = {
            tasks: new YPr(this)
          };
        }
        return this._experimental;
      }
      registerCapabilities(e) {
        if (this.transport) {
          throw Error("Cannot register capabilities after connecting to transport");
        }
        this._capabilities = umn(this._capabilities, e);
      }
      setRequestHandler(e, t) {
        let r = Kae(e)?.method;
        if (!r) {
          throw Error("Schema is missing a method literal");
        }
        let o;
        if (V4(r)) {
          let i = r;
          o = i._zod?.def?.value ?? i.value;
        } else {
          let i = r;
          o = i._def?.value ?? i.value;
        }
        if (typeof o !== "string") {
          throw Error("Schema method literal must be a string");
        }
        if (o === "tools/call") {
          let i = async (a, l) => {
            let c = mj(A6, a);
            if (!c.success) {
              let m = c.error instanceof Error ? c.error.message : String(c.error);
              throw new yi(Ei.InvalidParams, `Invalid tools/call request: ${m}`);
            }
            let {
              params: u
            } = c.data;
            let d = await Promise.resolve(t(a, l));
            if (u.task) {
              let m = mj(aye, d);
              if (!m.success) {
                let f = m.error instanceof Error ? m.error.message : String(m.error);
                throw new yi(Ei.InvalidParams, `Invalid task creation result: ${f}`);
              }
              return m.data;
            }
            let p = mj(hj, d);
            if (!p.success) {
              let m = p.error instanceof Error ? p.error.message : String(p.error);
              throw new yi(Ei.InvalidParams, `Invalid tools/call result: ${m}`);
            }
            return p.data;
          };
          return super.setRequestHandler(e, i);
        }
        return super.setRequestHandler(e, t);
      }
      assertCapabilityForMethod(e) {
        switch (e) {
          case "sampling/createMessage":
            if (!this._clientCapabilities?.sampling) {
              throw Error(`Client does not support sampling (required for ${e})`);
            }
            break;
          case "elicitation/create":
            if (!this._clientCapabilities?.elicitation) {
              throw Error(`Client does not support elicitation (required for ${e})`);
            }
            break;
          case "roots/list":
            if (!this._clientCapabilities?.roots) {
              throw Error(`Client does not support listing roots (required for ${e})`);
            }
            break;
          case "ping":
            break;
        }
      }
      assertNotificationCapability(e) {
        switch (e) {
          case "notifications/message":
            if (!this._capabilities.logging) {
              throw Error(`Server does not support logging (required for ${e})`);
            }
            break;
          case "notifications/resources/updated":
          case "notifications/resources/list_changed":
            if (!this._capabilities.resources) {
              throw Error(`Server does not support notifying about resources (required for ${e})`);
            }
            break;
          case "notifications/tools/list_changed":
            if (!this._capabilities.tools) {
              throw Error(`Server does not support notifying of tool list changes (required for ${e})`);
            }
            break;
          case "notifications/prompts/list_changed":
            if (!this._capabilities.prompts) {
              throw Error(`Server does not support notifying of prompt list changes (required for ${e})`);
            }
            break;
          case "notifications/elicitation/complete":
            if (!this._clientCapabilities?.elicitation?.url) {
              throw Error(`Client does not support URL elicitation (required for ${e})`);
            }
            break;
          case "notifications/cancelled":
            break;
          case "notifications/progress":
            break;
        }
      }
      assertRequestHandlerCapability(e) {
        if (!this._capabilities) {
          return;
        }
        switch (e) {
          case "completion/complete":
            if (!this._capabilities.completions) {
              throw Error(`Server does not support completions (required for ${e})`);
            }
            break;
          case "logging/setLevel":
            if (!this._capabilities.logging) {
              throw Error(`Server does not support logging (required for ${e})`);
            }
            break;
          case "prompts/get":
          case "prompts/list":
            if (!this._capabilities.prompts) {
              throw Error(`Server does not support prompts (required for ${e})`);
            }
            break;
          case "resources/list":
          case "resources/templates/list":
          case "resources/read":
            if (!this._capabilities.resources) {
              throw Error(`Server does not support resources (required for ${e})`);
            }
            break;
          case "tools/call":
          case "tools/list":
            if (!this._capabilities.tools) {
              throw Error(`Server does not support tools (required for ${e})`);
            }
            break;
          case "tasks/get":
          case "tasks/list":
          case "tasks/result":
          case "tasks/cancel":
            if (!this._capabilities.tasks) {
              throw Error(`Server does not support tasks capability (required for ${e})`);
            }
            break;
          case "ping":
          case "initialize":
            break;
        }
      }
      assertTaskCapability(e) {
        Ymn(this._clientCapabilities?.tasks?.requests, e, "Client");
      }
      assertTaskHandlerCapability(e) {
        if (!this._capabilities) {
          return;
        }
        Kmn(this._capabilities.tasks?.requests, e, "Server");
      }
      async _oninitialize(e) {
        let t = e.params.protocolVersion;
        this._clientCapabilities = e.params.capabilities;
        this._clientVersion = e.params.clientInfo;
        return {
          protocolVersion: Npn.includes(t) ? t : "2025-11-25",
          capabilities: this.getCapabilities(),
          serverInfo: this._serverInfo,
          ...(this._instructions && {
            instructions: this._instructions
          })
        };
      }
      getClientCapabilities() {
        return this._clientCapabilities;
      }
      getClientVersion() {
        return this._clientVersion;
      }
      getCapabilities() {
        return this._capabilities;
      }
      async ping() {
        return this.request({
          method: "ping"
        }, iye);
      }
      async createMessage(e, t) {
        if (e.tools || e.toolChoice) {
          if (!this._clientCapabilities?.sampling?.tools) {
            throw Error("Client does not support sampling tools capability.");
          }
        }
        if (e.messages.length > 0) {
          let n = e.messages[e.messages.length - 1];
          let r = Array.isArray(n.content) ? n.content : [n.content];
          let o = r.some(l => l.type === "tool_result");
          let s = e.messages.length > 1 ? e.messages[e.messages.length - 2] : undefined;
          let i = s ? Array.isArray(s.content) ? s.content : [s.content] : [];
          let a = i.some(l => l.type === "tool_use");
          if (o) {
            if (r.some(l => l.type !== "tool_result")) {
              throw Error("The last message must contain only tool_result content if any is present");
            }
            if (!a) {
              throw Error("tool_result blocks are not matching any tool_use from the previous message");
            }
          }
          if (a) {
            let l = new Set(i.filter(u => u.type === "tool_use").map(u => u.id));
            let c = new Set(r.filter(u => u.type === "tool_result").map(u => u.toolUseId));
            if (l.size !== c.size || ![...l].every(u => c.vZc(u))) {
              throw Error("ids of tool_result blocks and tool_use blocks from previous message do not match");
            }
          }
        }
        if (e.tools) {
          return this.request({
            method: "sampling/createMessage",
            params: e
          }, cOt, t);
        }
        return this.request({
          method: "sampling/createMessage",
          params: e
        }, dHe, t);
      }
      async elicitInput(e, t) {
        switch (e.mode ?? "form") {
          case "url":
            {
              if (!this._clientCapabilities?.elicitation?.url) {
                throw Error("Client does not support url elicitation.");
              }
              let r = e;
              return this.request({
                method: "elicitation/create",
                params: r
              }, Bxe, t);
            }
          case "form":
            {
              if (!this._clientCapabilities?.elicitation?.form) {
                throw Error("Client does not support form elicitation.");
              }
              let r = e.mode === "form" ? e : {
                ...e,
                mode: "form"
              };
              let o = await this.request({
                method: "elicitation/create",
                params: r
              }, Bxe, t);
              if (o.action === "accept" && o.content && r.requestedSchema) {
                try {
                  let i = this._jsonSchemaValidator.getValidator(r.requestedSchema)(o.content);
                  if (!i.valid) {
                    throw new yi(Ei.InvalidParams, `Elicitation response content does not match requested schema: ${i.errorMessage}`);
                  }
                } catch (s) {
                  if (s instanceof yi) {
                    throw s;
                  }
                  throw new yi(Ei.InternalError, `Error validating elicitation response: ${s instanceof Error ? s.message : String(s)}`);
                }
              }
              return o;
            }
        }
      }
      createElicitationCompletionNotifier(e, t) {
        if (!this._clientCapabilities?.elicitation?.url) {
          throw Error("Client does not support URL elicitation (required for notifications/elicitation/complete)");
        }
        return () => this.notification({
          method: "notifications/elicitation/complete",
          params: {
            elicitationId: e
          }
        }, t);
      }
      async listRoots(e, t) {
        return this.request({
          method: "roots/list",
          params: e
        }, O0r, t);
      }
      async sendLoggingMessage(e, t) {
        if (this._capabilities.logging) {
          if (!this.isMessageIgnored(e.level, t)) {
            return this.notification({
              method: "notifications/message",
              params: e
            });
          }
        }
      }
      async sendResourceUpdated(e) {
        return this.notification({
          method: "notifications/resources/updated",
          params: e
        });
      }
      async sendResourceListChanged() {
        return this.notification({
          method: "notifications/resources/list_changed"
        });
      }
      async sendToolListChanged() {
        return this.notification({
          method: "notifications/tools/list_changed"
        });
      }
      async sendPromptListChanged() {
        return this.notification({
          method: "notifications/prompts/list_changed"
        });
      }
    };
  });
  class eSs {
    clients = new Map();
    tabRoutes = new Map();
    context;
    notificationHandler = null;
    constructor(e) {
      this.context = e;
    }
    setNotificationHandler(e) {
      this.notificationHandler = e;
      for (let t of this.clients.values()) {
        t.setNotificationHandler(e);
      }
    }
    async ensureConnected() {
      let {
        logger: e,
        serverName: t
      } = this.context;
      this.refreshClients();
      let n = [];
      for (let o of this.clients.values()) {
        if (!o.isConnected()) {
          n.push(o.ensureConnected().catch(() => false));
        }
      }
      if (n.length > 0) {
        await Promise.all(n);
      }
      let r = this.getConnectedClients().length;
      if (r === 0) {
        e.info(`[${t}] No connected sockets in pool`);
        return false;
      }
      e.info(`[${t}] Socket pool: ${r} connected`);
      return true;
    }
    async callTool(e, t, n) {
      if (e === "tabs_context_mcp") {
        return this.callTabsContext(t, n);
      }
      let r = t.tabId;
      if (r !== undefined) {
        let s = this.tabRoutes.get(r);
        if (s) {
          let i = this.clients.get(s);
          if (i?.isConnected()) {
            return i.callTool(e, t, n);
          }
        }
      }
      let o = this.getConnectedClients();
      if (o.length === 0) {
        throw new SocketConnectionError(`[${this.context.serverName}] No connected sockets available`);
      }
      return o[0].callTool(e, t, n);
    }
    isConnected() {
      return this.getConnectedClients().length > 0;
    }
    disconnect() {
      for (let e of this.clients.values()) {
        e.disconnect();
      }
      this.clients.clear();
      this.tabRoutes.clear();
    }
    getConnectedClients() {
      return [...this.clients.values()].filter(e => e.isConnected());
    }
    async callTabsContext(e, t) {
      let {
        logger: n,
        serverName: r
      } = this.context;
      let o = this.getConnectedClients();
      if (o.length === 0) {
        throw new SocketConnectionError(`[${r}] No connected sockets available`);
      }
      if (o.length === 1) {
        let l = await o[0].callTool("tabs_context_mcp", e, t);
        this.updateTabRoutes(l, this.getSocketPathForClient(o[0]));
        return l;
      }
      let s = await Promise.allSettled(o.map(async l => {
        let c = await l.callTool("tabs_context_mcp", e, t);
        let u = this.getSocketPathForClient(l);
        return {
          result: c,
          socketPath: u
        };
      }));
      let i = [];
      let a;
      this.tabRoutes.clear();
      for (let l of s) {
        if (l.status !== "fulfilled") {
          n.info(`[${r}] tabs_context_mcp failed on one socket: ${l.reason}`);
          continue;
        }
        let {
          result: c,
          socketPath: u
        } = l.value;
        this.updateTabRoutes(c, u);
        let d = this.extractTabs(c);
        if (d) {
          i.push(...d);
        }
        if (a === undefined) {
          a = this.extractTabGroupId(c);
        }
      }
      if (i.length > 0) {
        let l = i.map(u => {
          let d = u;
          return `  \u2022 tabId ${d.tabId}: "${d.title}" (${d.url})`;
        }).join(`
`);
        let c = {
          availableTabs: i
        };
        if (a !== undefined) {
          c.tabGroupId = a;
        }
        return {
          result: {
            content: [{
              type: "text",
              text: JSON.stringify(c)
            }, {
              type: "text",
              text: `

Tab Context:
- Available tabs:
${l}`
            }]
          }
        };
      }
      for (let l of s) {
        if (l.status === "fulfilled") {
          return l.value.result;
        }
      }
      throw new SocketConnectionError(`[${r}] All sockets failed for tabs_context_mcp`);
    }
    updateTabRoutes(e, t) {
      let n = this.extractTabs(e);
      if (!n) {
        return;
      }
      for (let r of n) {
        if (typeof r === "object" && r !== null && "tabId" in r) {
          let o = r.tabId;
          this.tabRoutes.set(o, t);
        }
      }
    }
    extractTabs(e) {
      if (!e || typeof e !== "object") {
        return null;
      }
      let n = e.result?.content;
      if (!n || !Array.isArray(n)) {
        return null;
      }
      for (let r of n) {
        if (r.type === "text" && r.text) {
          try {
            let o = JSON.parse(r.text);
            if (Array.isArray(o)) {
              return o;
            }
            if (o && Array.isArray(o.availableTabs)) {
              return o.availableTabs;
            }
          } catch {}
        }
      }
      return null;
    }
    extractTabGroupId(e) {
      if (!e || typeof e !== "object") {
        return;
      }
      let n = e.result?.content;
      if (!n || !Array.isArray(n)) {
        return;
      }
      for (let r of n) {
        if (r.type === "text" && r.text) {
          try {
            let o = JSON.parse(r.text);
            if (typeof o.tabGroupId === "number") {
              return o.tabGroupId;
            }
          } catch {}
        }
      }
      return;
    }
    getSocketPathForClient(e) {
      for (let [t, n] of this.clients.entries()) {
        if (n === e) {
          return t;
        }
      }
      return "";
    }
    refreshClients() {
      let e = this.getAvailableSocketPaths();
      let {
        logger: t,
        serverName: n
      } = this.context;
      for (let r of e) {
        if (!this.clients.vZc(r)) {
          t.info(`[${n}] Adding socket to pool: ${r}`);
          let o = {
            ...this.context,
            socketPath: r,
            getSocketPath: undefined,
            getSocketPaths: undefined
          };
          let s = pun(o);
          if (s.disableAutoReconnect = true, this.notificationHandler) {
            s.setNotificationHandler(this.notificationHandler);
          }
          this.clients.set(r, s);
        }
      }
      for (let [r, o] of this.clients.entries()) {
        if (!e.includes(r)) {
          t.info(`[${n}] Removing stale socket from pool: ${r}`);
          o.disconnect();
          this.clients.delete(r);
          for (let [s, i] of this.tabRoutes.entries()) {
            if (i === r) {
              this.tabRoutes.delete(s);
            }
          }
        }
      }
    }
    getAvailableSocketPaths() {
      return this.context.getSocketPaths?.() ?? [];
    }
  }
  function tSs(e) {
    return new eSs(e);
  }
  var nSs = __lazy(() => {
    set();
  });
  function clearBrowserResolution(e) {
    Xxe.delete(e);
    e.clearSelection?.();
  }
  function Jmn(e, t) {
    let n = (e.name ?? "").replace(/[\r\n\t\u0000-\u001f]/g, " ").trim();
    if (!n) {
      return `Browser ${t + 1}`;
    }
    return n.length > 50 ? `${n.slice(0, 50)}\u2026` : n;
  }
  async function e_u(e, t) {
    if (!t.listConnectedExtensions) {
      Xxe.set(t, true);
      return null;
    }
    if (Xxe.get(t) && t.hasActiveSelection?.()) {
      return null;
    }
    Xxe.delete(t);
    let n = await t.listConnectedExtensions();
    let r = n.map(a => a.deviceId);
    if (n.length === 0) {
      return null;
    }
    if (n.length === 1) {
      Xxe.set(t, true);
      return null;
    }
    let o = t.getSelectedDeviceId?.();
    if (o && n.some(a => a.deviceId === o)) {
      let a = e.getPairedFromDeviceIds?.();
      if (!(a !== undefined && a.length > 0 && r.some(c => !a.includes(c)))) {
        Xxe.set(t, true);
        return null;
      }
    }
    let s = n.slice(0, 8).map((a, l) => `${l + 1}. ${Jmn(a, l)} (${a.osPlatform ?? "unknown OS"}) \u2014 deviceId: ${a.deviceId}`).join(`
`);
    let i = n.length > 8 ? `
\u2026and ${n.length - 8} more` : "";
    return {
      content: [{
        type: "text",
        text: `Multiple Chrome browsers are connected to this account and none has been selected for this session. ${NIt(e.askUserToolName)}

Connected browsers:
${s}${i}`
      }],
      isError: true
    };
  }
  function t_u(e) {
    return JSON.stringify(e, (t, n) => typeof n === "string" && n.length > 256 ? `<${n.length} chars elided>` : n);
  }
  async function n_u(e, t, n) {
    try {
      if (!(await t.ensureConnected())) {
        return;
      }
      let o = (await t.callTool("tabs_context_mcp", {}, n ? {
        ...n,
        permissionMode: "ask"
      } : undefined))?.result?.content;
      let s = Array.isArray(o) ? o.find(c => typeof c === "object" && c !== null && c.type === "text" && typeof c.text === "string")?.text : undefined;
      if (!s) {
        return;
      }
      let i = JSON.parse(s);
      if (!Array.isArray(i.availableTabs)) {
        return;
      }
      let a = i.availableTabs.filter(c => typeof c === "object" && c !== null && typeof c.url === "string");
      let l = typeof i.selectedTabId === "number" ? a.find(c => c.tabId === i.selectedTabId) : a.length === 1 ? a[0] : undefined;
      return l ? new URL(l.url).origin : undefined;
    } catch (r) {
      e.logger.debug(`[${e.serverName}] fetchActiveTabOrigin failed`, r);
      return;
    }
  }
  async function r_u(e, t, n, r, o) {
    let s = await t.callTool(n, r, o);
    if (e.logger.silly(`[${e.serverName}] Received result from socket bridge: ${JSON.stringify(s)}`), s === null || s === undefined) {
      return {
        content: [{
          type: "text",
          text: "Tool execution completed"
        }]
      };
    }
    let {
      result: i,
      error: a
    } = s;
    let l = a || i;
    let c = !!a;
    if (!l) {
      return {
        content: [{
          type: "text",
          text: "Tool execution completed"
        }]
      };
    }
    if (c && l_u(l.content)) {
      e.onAuthenticationError();
    }
    let {
      content: u
    } = l;
    if (u && Array.isArray(u)) {
      if (c) {
        return {
          content: u.map(p => {
            if (typeof p === "object" && p !== null && "type" in p) {
              return p;
            }
            return {
              type: "text",
              text: String(p)
            };
          }),
          isError: true
        };
      }
      return {
        content: u.map(p => {
          if (typeof p === "object" && p !== null && "type" in p && "source" in p) {
            let m = p;
            if (m.type === "image" && typeof m.source === "object" && m.source !== null && "data" in m.source) {
              return {
                type: "image",
                data: m.source.data,
                mimeType: "media_type" in m.source ? m.source.media_type || "image/png" : "image/png"
              };
            }
          }
          if (typeof p === "object" && p !== null && "type" in p) {
            return p;
          }
          return {
            type: "text",
            text: String(p)
          };
        }),
        isError: c
      };
    }
    if (typeof u === "string") {
      return {
        content: [{
          type: "text",
          text: u
        }],
        isError: c
      };
    }
    e.logger.warn(`[${e.serverName}] Unexpected result format from socket bridge`, s);
    return {
      content: [{
        type: "text",
        text: JSON.stringify(s)
      }],
      isError: c
    };
  }
  function $Ot(e) {
    return {
      content: [{
        type: "text",
        text: e.onToolCallDisconnected()
      }]
    };
  }
  async function o_u(e, t) {
    if (!e.bridgeConfig) {
      return {
        content: [{
          type: "text",
          text: "Browser switching is only available with bridge connections."
        }],
        isError: true
      };
    }
    if (!(await t.ensureConnected())) {
      return $Ot(e);
    }
    let r = (await t.switchBrowser?.()) ?? null;
    if (r === "no_other_browsers") {
      return {
        content: [{
          type: "text",
          text: "No other browsers available to switch to. Open Chrome with the Claude extension in another browser to switch."
        }],
        isError: false
      };
    }
    if (r) {
      Xxe.set(t, true);
      return {
        content: [{
          type: "text",
          text: `Connected to browser "${Jmn(r, 0)}".`
        }]
      };
    }
    return {
      content: [{
        type: "text",
        text: "No browser responded within the timeout. Make sure Chrome is open with the Claude extension installed, then try again."
      }],
      isError: true
    };
  }
  async function s_u(e, t) {
    if (!e.bridgeConfig || !t.listConnectedExtensions) {
      return {
        content: [{
          type: "text",
          text: "Listing browsers is only available with bridge connections."
        }],
        isError: true
      };
    }
    if (!(await t.ensureConnected())) {
      return $Ot(e);
    }
    let r = await t.listConnectedExtensions();
    let o = r.map((i, a) => ({
      ...i,
      name: Jmn(i, a)
    }));
    let s = [{
      type: "text",
      text: JSON.stringify(o)
    }];
    if (r.length > 1) {
      s.push({
        type: "text",
        text: `${r.length} browsers are connected. ${NIt(e.askUserToolName)}`
      });
    }
    return {
      content: s
    };
  }
  async function i_u(e, t, n) {
    let r = typeof n.deviceId === "string" ? n.deviceId : "";
    if (!e.bridgeConfig || !t.selectExtensionById || !t.listConnectedExtensions || !r) {
      return {
        content: [{
          type: "text",
          text: "select_browser requires a bridge connection and a deviceId argument."
        }],
        isError: true
      };
    }
    if (!(await t.ensureConnected())) {
      return $Ot(e);
    }
    let s = await t.listConnectedExtensions();
    let i = s.find(l => l.deviceId === r);
    if (!i) {
      return {
        content: [{
          type: "text",
          text: `No connected browser has deviceId "${r}". Call list_connected_browsers to see currently connected browsers.`
        }],
        isError: true
      };
    }
    let a = Jmn(i, s.indexOf(i));
    t.selectExtensionById(r, a);
    Xxe.set(t, true);
    return {
      content: [{
        type: "text",
        text: `Connected to browser "${a}".`
      }]
    };
  }
  function a_u(e) {
    if (!Array.isArray(e)) {
      return String(e);
    }
    return e.map(t => {
      if (typeof t === "string") {
        return t;
      }
      if (typeof t === "object" && t !== null && "text" in t && typeof t.text === "string") {
        return t.text;
      }
      return "";
    }).join(" ");
  }
  function l_u(e) {
    return a_u(e).toLowerCase().includes("re-authenticated");
  }
  var Xxe;
  var Xmn = async (e, t, n, r, o) => {
    if (n === "switch_browser") {
      return o_u(e, t);
    }
    if (n === "list_connected_browsers") {
      return s_u(e, t);
    }
    if (n === "select_browser") {
      return i_u(e, t, r);
    }
    try {
      let s = await t.ensureConnected();
      if (e.logger.silly(`[${e.serverName}] Server is connected: ${s}. Received tool call: ${n} with args: ${t_u(r)}.`), s) {
        let i = await e_u(e, t);
        if (i) {
          return i;
        }
        if (e.handleHostTool) {
          let a = await e.handleHostTool(n, r, {
            getActiveTabOrigin: () => n_u(e, t, o)
          });
          if (a !== undefined) {
            return a;
          }
        }
        return await r_u(e, t, n, r, o);
      }
      return $Ot(e);
    } catch (s) {
      if (e.logger.info(`[${e.serverName}] Error calling tool:`, s), s instanceof SocketConnectionError || s instanceof NoExtensionConnectedError) {
        return $Ot(e);
      }
      if (s instanceof ToolCallTimeoutError) {
        return {
          content: [{
            type: "text",
            text: `The "${n}" tool did not respond in time. The Chrome extension is connected but the page may be loading, unresponsive, or waiting on a permission prompt in the extension side panel. Try a lighter operation (e.g., "get_page_text" instead of a screenshot) or ask the user to check the page and any pending prompts.`
          }],
          isError: true,
          _meta: {
            isBridgeTimeout: true
          }
        };
      }
      if (s instanceof ExtensionDisconnectedMidCallError) {
        return {
          content: [{
            type: "text",
            text: `The "${n}" tool call failed because the Chrome extension disconnected mid-operation. This is usually transient (Chrome service worker restart, tab closed, network blip) and the extension often reconnects automatically. Retry the same tool call in a few seconds. If it keeps failing, ask the user to switch to Chrome (which wakes the extension) or check that the extension is still logged in.`
          }],
          isError: true
        };
      }
      return {
        content: [{
          type: "text",
          text: `Error calling tool, please try again. : ${s instanceof Error ? s.message : String(s)}`
        }],
        isError: true
      };
    }
  };
  var Qmn = __lazy(() => {
    aet();
    set();
    Xxe = new WeakMap();
  });
  function createChromeSocketClient(e) {
    return e.bridgeConfig ? createBridgeClient(e) : e.getSocketPaths ? tSs(e) : pun(e);
  }
  function createClaudeForChromeMcpServer(e, t) {
    let {
      serverName: n,
      logger: r
    } = e;
    let o = t ?? createChromeSocketClient(e);
    let s = new pye({
      name: n,
      version: "1.0.0"
    }, {
      capabilities: {
        tools: {},
        logging: {}
      }
    });
    s.setRequestHandler(q7, async () => {
      if (e.isDisabled?.()) {
        return {
          tools: []
        };
      }
      let i = NIt(e.askUserToolName);
      return {
        tools: [...(e.bridgeConfig ? BROWSER_TOOLS : BROWSER_TOOLS.filter(l => !xms.vZc(l.name))).map(l => l.name === "list_connected_browsers" ? {
          ...l,
          description: `${l.description} ${i}`
        } : l), ...(e.hostTools?.() ?? [])]
      };
    });
    s.setRequestHandler(A6, async i => (r.info(`[${n}] Executing tool: ${i.params.name}`), Xmn(e, o, i.params.name, i.params.arguments || {})));
    o.setNotificationHandler(i => {
      r.info(`[${n}] Forwarding MCP notification: ${i.method}`);
      s.notification({
        method: i.method,
        params: i.params
      }).catch(a => {
        r.info(`[${n}] Failed to forward MCP notification: ${a.message}`);
      });
    });
    return s;
  }
  var oSs = __lazy(() => {
    BOt();
    txr();
    aet();
    set();
    nSs();
    Qmn();
  });
  var sSs = {};