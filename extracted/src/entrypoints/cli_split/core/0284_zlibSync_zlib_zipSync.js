  function fft(e) {
    return !f6e.isSeparator(e) && !e.disabled;
  }
  function MLp(e) {
    return e.map(t => {
      if (f6e.isSeparator(t)) {
        return t;
      }
      if (typeof t === "string") {
        return {
          value: t,
          name: t,
          short: t,
          disabled: false
        };
      }
      let n = t.name ?? String(t.value);
      return {
        value: t.value,
        name: n,
        description: t.description,
        short: t.short ?? n,
        disabled: t.disabled ?? false
      };
    });
  }
  var N_o;
  var SLa;
  var DLp;
  var k4n;
  var TLa = __lazy(() => {
    R4n();
    N_o = __toESM(y4n(), 1);
    SLa = __toESM(bLa(), 1);
    DLp = {
      icon: {
        cursor: iLp.pointer
      },
      style: {
        disabled: e => N_o.default.dim(`- ${e}`),
        description: e => N_o.default.cyan(e)
      },
      helpMode: "auto"
    };
    k4n = m6e((e, t) => {
      let {
        loop: n = true,
        pageSize: r = 7
      } = e;
      let o = FMe(true);
      let s = lEe(DLp, e.theme);
      let [i, a] = CU("idle");
      let l = d6e({
        status: i,
        theme: s
      });
      let c = FMe();
      let u = y9t(() => MLp(e.choices), [e.choices]);
      let d = y9t(() => {
        let E = u.findIndex(fft);
        let C = u.findLastIndex(fft);
        if (E < 0) {
          throw new g9t("[select prompt] No selectable choices. All choices are disabled.");
        }
        return {
          first: E,
          last: C
        };
      }, [u]);
      let p = y9t(() => {
        if (!("default" in e)) {
          return -1;
        }
        return u.findIndex(E => fft(E) && E.value === e.default);
      }, [e.default, u]);
      let [m, f] = CU(p === -1 ? d.first : p);
      let h = u[m];
      p6e((E, C) => {
        if (clearTimeout(c.current), ift(E)) {
          a("done");
          t(h.value);
        } else if (d4n(E) || f_o(E)) {
          if (C.clearLine(0), n || d4n(E) && m !== d.first || f_o(E) && m !== d.last) {
            let x = d4n(E) ? -1 : 1;
            let A = m;
            do {
              A = (A + x + u.length) % u.length;
            } while (!fft(u[A]));
            f(A);
          }
        } else if (t1a(E)) {
          C.clearLine(0);
          let x = Number(E.name) - 1;
          let A = u[x];
          if (A != null && fft(A)) {
            f(x);
          }
        } else if (p4n(E)) {
          C.clearLine(0);
        } else {
          let x = C.line.toLowerCase();
          let A = u.findIndex(k => {
            if (f6e.isSeparator(k) || !fft(k)) {
              return false;
            }
            return k.name.toLowerCase().startsWith(x);
          });
          if (A >= 0) {
            f(A);
          }
          c.current = setTimeout(() => {
            C.clearLine(0);
          }, 700);
        }
      });
      u6e(() => () => {
        clearTimeout(c.current);
      }, []);
      let g = s.style.message(e.message, i);
      let y = "";
      let _ = "";
      if (s.helpMode === "always" || s.helpMode === "auto" && o.current) {
        if (o.current = false, u.length > r) {
          _ = `
${s.style.help("(Use arrow keys to reveal more choices)")}`;
        } else {
          y = s.style.help("(Use arrow keys)");
        }
      }
      let b = P_o({
        items: u,
        active: m,
        renderItem({
          item: E,
          isActive: C
        }) {
          if (f6e.isSeparator(E)) {
            return ` ${E.separator}`;
          }
          if (E.disabled) {
            let k = typeof E.disabled === "string" ? E.disabled : "(disabled)";
            return s.style.disabled(`${E.name} ${k}`);
          }
          let x = C ? s.style.highlight : k => k;
          let A = C ? s.icon.cursor : " ";
          return x(`${A} ${E.name}`);
        },
        pageSize: r,
        loop: n
      });
      if (i === "done") {
        return `${l} ${g} ${s.style.answer(h.short)}`;
      }
      let S = h.description ? `
${s.style.description(h.description)}` : "";
      return `${[l, g, y].filter(Boolean).join(" ")}
${b}${_}${S}${SLa.default.cursorHide}`;
    });
  });
  var L_o = __lazy(() => {
    gLa();
    yLa();
    TLa();
  });
  var McpServerConfigSchema;
  var McpbManifestAuthorSchema;
  var McpbManifestRepositorySchema;
  var McpbManifestPlatformOverrideSchema;
  var McpbManifestMcpConfigSchema;
  var McpbManifestServerSchema;
  var McpbManifestCompatibilitySchema;
  var McpbManifestToolSchema;
  var McpbManifestPromptSchema;
  var McpbUserConfigurationOptionSchema;
  var McpbUserConfigValuesSchema;
  var McpbManifestSchema;
  var McpbSignatureInfoSchema;
  var w9t = __lazy(() => {
    qg();
    McpServerConfigSchema = strictObject({
      command: string(),
      args: array(string()).optional(),
      env: record(string(), string()).optional()
    });
    McpbManifestAuthorSchema = strictObject({
      name: string(),
      email: string().email().optional(),
      url: string().url().optional()
    });
    McpbManifestRepositorySchema = strictObject({
      type: string(),
      url: string().url()
    });
    McpbManifestPlatformOverrideSchema = McpServerConfigSchema.partial();
    McpbManifestMcpConfigSchema = McpServerConfigSchema.extend({
      platform_overrides: record(string(), McpbManifestPlatformOverrideSchema).optional()
    });
    McpbManifestServerSchema = strictObject({
      type: bte(["python", "node", "binary"]),
      entry_point: string(),
      mcp_config: McpbManifestMcpConfigSchema
    });
    McpbManifestCompatibilitySchema = strictObject({
      claude_desktop: string().optional(),
      platforms: array(bte(["darwin", "win32", "linux"])).optional(),
      runtimes: strictObject({
        python: string().optional(),
        node: string().optional()
      }).optional()
    }).passthrough();
    McpbManifestToolSchema = strictObject({
      name: string(),
      description: string().optional()
    });
    McpbManifestPromptSchema = strictObject({
      name: string(),
      description: string().optional(),
      arguments: array(string()).optional(),
      text: string()
    });
    McpbUserConfigurationOptionSchema = strictObject({
      type: bte(["string", "number", "boolean", "directory", "file"]),
      title: string(),
      description: string(),
      required: boolean().optional(),
      default: union([string(), number(), boolean(), array(string())]).optional(),
      multiple: boolean().optional(),
      sensitive: boolean().optional(),
      min: number().optional(),
      max: number().optional()
    });
    McpbUserConfigValuesSchema = record(string(), union([string(), number(), boolean(), array(string())]));
    McpbManifestSchema = strictObject({
      $schema: string().optional(),
      dxt_version: string().optional().describe("@deprecated Use manifest_version instead"),
      manifest_version: string().optional(),
      name: string(),
      display_name: string().optional(),
      version: string(),
      description: string(),
      long_description: string().optional(),
      author: McpbManifestAuthorSchema,
      repository: McpbManifestRepositorySchema.optional(),
      homepage: string().url().optional(),
      documentation: string().url().optional(),
      support: string().url().optional(),
      icon: string().optional(),
      screenshots: array(string()).optional(),
      server: McpbManifestServerSchema,
      tools: array(McpbManifestToolSchema).optional(),
      tools_generated: boolean().optional(),
      prompts: array(McpbManifestPromptSchema).optional(),
      prompts_generated: boolean().optional(),
      keywords: array(string()).optional(),
      license: string().optional(),
      privacy_policies: array(string()).optional(),
      compatibility: McpbManifestCompatibilitySchema.optional(),
      user_config: record(string(), McpbUserConfigurationOptionSchema).optional()
    }).refine(e => !!(e.dxt_version || e.manifest_version), {
      message: "Either 'dxt_version' (deprecated) or 'manifest_version' must be provided"
    });
    McpbSignatureInfoSchema = strictObject({
      status: bte(["signed", "unsigned", "self-signed"]),
      publisher: string().optional(),
      issuer: string().optional(),
      valid_from: string().optional(),
      valid_to: string().optional(),
      fingerprint: string().optional()
    });
  });
  function readPackageJson(e) {
    let t = BMe.join(e, "package.json");
    if (g6e.existsSync(t)) {
      try {
        return JSON.parse(g6e.readFileSync(t, "utf-8"));
      } catch (n) {}
    }
    return {};
  }
  function getDefaultAuthorName(e) {
    if (typeof e.author === "string") {
      return e.author;
    }
    return e.author?.name || "";
  }
  function getDefaultAuthorEmail(e) {
    if (typeof e.author === "object") {
      return e.author?.email || "";
    }
    return "";
  }
  function getDefaultAuthorUrl(e) {
    if (typeof e.author === "object") {
      return e.author?.url || "";
    }
    return "";
  }
  function getDefaultRepositoryUrl(e) {
    if (typeof e.repository === "string") {
      return e.repository;
    }
    return e.repository?.url || "";
  }
  function getDefaultBasicInfo(e, t) {
    let n = e.name || BMe.basename(t);
    let r = getDefaultAuthorName(e) || "Unknown Author";
    let o = n;
    let s = e.version || "1.0.0";
    let i = e.description || "A MCPB bundle";
    return {
      name: n,
      authorName: r,
      displayName: o,
      version: s,
      description: i
    };
  }
  function getDefaultAuthorInfo(e) {
    return {
      authorEmail: getDefaultAuthorEmail(e),
      authorUrl: getDefaultAuthorUrl(e)
    };
  }
  function getDefaultServerConfig(e) {
    let n = getDefaultEntryPoint("node", e);
    let r = createMcpConfig("node", n);
    return {
      serverType: "node",
      entryPoint: n,
      mcp_config: r
    };
  }
  function getDefaultOptionalFields(e) {
    return {
      keywords: "",
      license: e.license || "MIT",
      repository: undefined
    };
  }
  function createMcpConfig(e, t) {
    switch (e) {
      case "node":
        return {
          command: "node",
          args: ["${__dirname}/" + t],
          env: {}
        };
      case "python":
        return {
          command: "python",
          args: ["${__dirname}/" + t],
          env: {
            PYTHONPATH: "${__dirname}/server/lib"
          }
        };
      case "binary":
        return {
          command: "${__dirname}/" + t,
          args: [],
          env: {}
        };
    }
  }
  function getDefaultEntryPoint(e, t) {
    switch (e) {
      case "node":
        return t?.main || "server/index.js";
      case "python":
        return "server/main.py";
      case "binary":
        return "server/my-server";
    }
  }
  async function promptBasicInfo(e, t) {
    let n = e.name || BMe.basename(t);
    let r = await jy({
      message: "Extension name:",
      default: n,
      validate: l => l.trim().length > 0 || "Name is required"
    });
    let o = await jy({
      message: "Author name:",
      default: getDefaultAuthorName(e),
      validate: l => l.trim().length > 0 || "Author name is required"
    });
    let s = await jy({
      message: "Display name (optional):",
      default: r
    });
    let i = await jy({
      message: "Version:",
      default: e.version || "1.0.0",
      validate: l => {
        if (!l.trim()) {
          return "Version is required";
        }
        if (!/^\d+\.\d+\.\d+/.test(l)) {
          return "Version must follow semantic versioning (e.g., 1.0.0)";
        }
        return true;
      }
    });
    let a = await jy({
      message: "Description:",
      default: e.description || "",
      validate: l => l.trim().length > 0 || "Description is required"
    });
    return {
      name: r,
      authorName: o,
      displayName: s,
      version: i,
      description: a
    };
  }
  async function promptAuthorInfo(e) {
    let t = await jy({
      message: "Author email (optional):",
      default: getDefaultAuthorEmail(e)
    });
    let n = await jy({
      message: "Author URL (optional):",
      default: getDefaultAuthorUrl(e)
    });
    return {
      authorEmail: t,
      authorUrl: n
    };
  }
  async function promptServerConfig(e) {
    let t = await k4n({
      message: "Server type:",
      choices: [{
        name: "Node.js",
        value: "node"
      }, {
        name: "Python",
        value: "python"
      }, {
        name: "Binary",
        value: "binary"
      }],
      default: "node"
    });
    let n = await jy({
      message: "Entry point:",
      default: getDefaultEntryPoint(t, e)
    });
    let r = createMcpConfig(t, n);
    return {
      serverType: t,
      entryPoint: n,
      mcp_config: r
    };
  }
  async function promptTools() {
    let e = await _T({
      message: "Does your MCP Server provide tools you want to advertise (optional)?",
      default: true
    });
    let t = [];
    let n = false;
    if (e) {
      let r = true;
      while (r) {
        let o = await jy({
          message: "Tool name:",
          validate: i => i.trim().length > 0 || "Tool name is required"
        });
        let s = await jy({
          message: "Tool description (optional):"
        });
        t.push({
          name: o,
          ...(s ? {
            description: s
          } : {})
        });
        r = await _T({
          message: "Add another tool?",
          default: false
        });
      }
      n = await _T({
        message: "Does your server generate additional tools at runtime?",
        default: false
      });
    }
    return {
      tools: t,
      toolsGenerated: n
    };
  }
  async function promptPrompts() {
    let e = await _T({
      message: "Does your MCP Server provide prompts you want to advertise (optional)?",
      default: false
    });
    let t = [];
    let n = false;
    if (e) {
      let r = true;
      while (r) {
        let o = await jy({
          message: "Prompt name:",
          validate: c => c.trim().length > 0 || "Prompt name is required"
        });
        let s = await jy({
          message: "Prompt description (optional):"
        });
        let i = await _T({
          message: "Does this prompt have arguments?",
          default: false
        });
        let a = [];
        if (i) {
          let c = true;
          while (c) {
            let u = await jy({
              message: "Argument name:",
              validate: d => {
                if (!d.trim()) {
                  return "Argument name is required";
                }
                if (a.includes(d)) {
                  return "Argument names must be unique";
                }
                return true;
              }
            });
            a.push(u);
            c = await _T({
              message: "Add another argument?",
              default: false
            });
          }
        }
        let l = await jy({
          message: i ? `Prompt text (use \${arguments.name} for arguments: ${a.join(", ")}):` : "Prompt text:",
          validate: c => c.trim().length > 0 || "Prompt text is required"
        });
        t.push({
          name: o,
          ...(s ? {
            description: s
          } : {}),
          ...(a.length > 0 ? {
            arguments: a
          } : {}),
          text: l
        });
        r = await _T({
          message: "Add another prompt?",
          default: false
        });
      }
      n = await _T({
        message: "Does your server generate additional prompts at runtime?",
        default: false
      });
    }
    return {
      prompts: t,
      promptsGenerated: n
    };
  }
  async function promptOptionalFields(e) {
    let t = await jy({
      message: "Keywords (comma-separated, optional):",
      default: ""
    });
    let n = await jy({
      message: "License:",
      default: e.license || "MIT"
    });
    let r = await _T({
      message: "Add repository information?",
      default: !!e.repository
    });
    let o;
    if (r) {
      let s = await jy({
        message: "Repository URL:",
        default: getDefaultRepositoryUrl(e)
      });
      if (s) {
        o = {
          type: "git",
          url: s
        };
      }
    }
    return {
      keywords: t,
      license: n,
      repository: o
    };
  }
  async function promptLongDescription(e) {
    if (await _T({
      message: "Add a detailed long description?",
      default: false
    })) {
      return await jy({
        message: "Long description (supports basic markdown):",
        default: e
      });
    }
    return;
  }
  async function promptUrls() {
    let e = await jy({
      message: "Homepage URL (optional):",
      validate: r => {
        if (!r.trim()) {
          return true;
        }
        try {
          new URL(r);
          return true;
        } catch {
          return "Must be a valid URL (e.g., https://example.com)";
        }
      }
    });
    let t = await jy({
      message: "Documentation URL (optional):",
      validate: r => {
        if (!r.trim()) {
          return true;
        }
        try {
          new URL(r);
          return true;
        } catch {
          return "Must be a valid URL";
        }
      }
    });
    let n = await jy({
      message: "Support URL (optional):",
      validate: r => {
        if (!r.trim()) {
          return true;
        }
        try {
          new URL(r);
          return true;
        } catch {
          return "Must be a valid URL";
        }
      }
    });
    return {
      homepage: e,
      documentation: t,
      support: n
    };
  }
  async function promptVisualAssets() {
    let e = await jy({
      message: "Icon file path (optional, relative to manifest):",
      validate: r => {
        if (!r.trim()) {
          return true;
        }
        if (r.includes("..")) {
          return "Relative paths cannot include '..'";
        }
        return true;
      }
    });
    let t = await _T({
      message: "Add screenshots?",
      default: false
    });
    let n = [];
    if (t) {
      let r = true;
      while (r) {
        let o = await jy({
          message: "Screenshot file path (relative to manifest):",
          validate: s => {
            if (!s.trim()) {
              return "Screenshot path is required";
            }
            if (s.includes("..")) {
              return "Relative paths cannot include '..'";
            }
            return true;
          }
        });
        n.push(o);
        r = await _T({
          message: "Add another screenshot?",
          default: false
        });
      }
    }
    return {
      icon: e,
      screenshots: n
    };
  }
  async function promptCompatibility(e) {
    if (!(await _T({
      message: "Add compatibility constraints?",
      default: false
    }))) {
      return;
    }
    let n = await _T({
      message: "Specify supported platforms?",
      default: false
    });
    let r;
    if (n) {
      let s = [];
      if (await _T({
        message: "Support macOS (darwin)?",
        default: true
      })) {
        s.push("darwin");
      }
      if (await _T({
        message: "Support Windows (win32)?",
        default: true
      })) {
        s.push("win32");
      }
      if (await _T({
        message: "Support Linux?",
        default: true
      })) {
        s.push("linux");
      }
      r = s.length > 0 ? s : undefined;
    }
    let o;
    if (e !== "binary") {
      if (await _T({
        message: "Specify runtime version constraints?",
        default: false
      })) {
        if (e === "python") {
          o = {
            python: await jy({
              message: "Python version constraint (e.g., >=3.8,<4.0):",
              validate: a => a.trim().length > 0 || "Python version constraint is required"
            })
          };
        } else if (e === "node") {
          o = {
            node: await jy({
              message: "Node.js version constraint (e.g., >=16.0.0):",
              validate: a => a.trim().length > 0 || "Node.js version constraint is required"
            })
          };
        }
      }
    }
    return {
      ...(r ? {
        platforms: r
      } : {}),
      ...(o ? {
        runtimes: o
      } : {})
    };
  }
  async function promptUserConfig() {
    if (!(await _T({
      message: "Add user-configurable options?",
      default: false
    }))) {
      return {};
    }
    let t = {};
    let n = true;
    while (n) {
      let r = await jy({
        message: "Configuration option key (unique identifier):",
        validate: u => {
          if (!u.trim()) {
            return "Key is required";
          }
          if (t[u]) {
            return "Key must be unique";
          }
          return true;
        }
      });
      let o = await k4n({
        message: "Option type:",
        choices: [{
          name: "String",
          value: "string"
        }, {
          name: "Number",
          value: "number"
        }, {
          name: "Boolean",
          value: "boolean"
        }, {
          name: "Directory",
          value: "directory"
        }, {
          name: "File",
          value: "file"
        }]
      });
      let s = await jy({
        message: "Option title (human-readable name):",
        validate: u => u.trim().length > 0 || "Title is required"
      });
      let i = await jy({
        message: "Option description:",
        validate: u => u.trim().length > 0 || "Description is required"
      });
      let a = await _T({
        message: "Is this option required?",
        default: false
      });
      let l = await _T({
        message: "Is this option sensitive (like a password)?",
        default: false
      });
      let c = {
        type: o,
        title: s,
        description: i,
        required: a,
        sensitive: l
      };
      if (!a) {
        let u;
        if (o === "boolean") {
          u = await _T({
            message: "Default value:",
            default: false
          });
        } else if (o === "number") {
          let d = await jy({
            message: "Default value (number):",
            validate: p => {
              if (!p.trim()) {
                return true;
              }
              return !isNaN(Number(p)) || "Must be a valid number";
            }
          });
          u = d ? Number(d) : undefined;
        } else {
          u = await jy({
            message: "Default value (optional):"
          });
        }
        if (u !== undefined && u !== "") {
          c.default = u;
        }
      }
      if (o === "number") {
        if (await _T({
          message: "Add min/max constraints?",
          default: false
        })) {
          let d = await jy({
            message: "Minimum value (optional):",
            validate: m => {
              if (!m.trim()) {
                return true;
              }
              return !isNaN(Number(m)) || "Must be a valid number";
            }
          });
          let p = await jy({
            message: "Maximum value (optional):",
            validate: m => {
              if (!m.trim()) {
                return true;
              }
              return !isNaN(Number(m)) || "Must be a valid number";
            }
          });
          if (d) {
            c.min = Number(d);
          }
          if (p) {
            c.max = Number(p);
          }
        }
      }
      t[r] = c;
      n = await _T({
        message: "Add another configuration option?",
        default: false
      });
    }
    return t;
  }
  function buildManifest(e, t, n, r, o, s, i, a, l, c, u, d, p) {
    let {
      name: m,
      displayName: f,
      version: h,
      description: g,
      authorName: y
    } = e;
    let {
      authorEmail: _,
      authorUrl: b
    } = n;
    let {
      serverType: S,
      entryPoint: E,
      mcp_config: C
    } = s;
    let {
      keywords: x,
      license: A,
      repository: k
    } = p;
    return {
      manifest_version: "0.2",
      name: m,
      ...(f && f !== m ? {
        display_name: f
      } : {}),
      version: h,
      description: g,
      ...(t ? {
        long_description: t
      } : {}),
      author: {
        name: y,
        ...(_ ? {
          email: _
        } : {}),
        ...(b ? {
          url: b
        } : {})
      },
      ...(r.homepage ? {
        homepage: r.homepage
      } : {}),
      ...(r.documentation ? {
        documentation: r.documentation
      } : {}),
      ...(r.support ? {
        support: r.support
      } : {}),
      ...(o.icon ? {
        icon: o.icon
      } : {}),
      ...(o.screenshots.length > 0 ? {
        screenshots: o.screenshots
      } : {}),
      server: {
        type: S,
        entry_point: E,
        mcp_config: C
      },
      ...(i.length > 0 ? {
        tools: i
      } : {}),
      ...(a ? {
        tools_generated: true
      } : {}),
      ...(l.length > 0 ? {
        prompts: l
      } : {}),
      ...(c ? {
        prompts_generated: true
      } : {}),
      ...(u ? {
        compatibility: u
      } : {}),
      ...(Object.keys(d).length > 0 ? {
        user_config: d
      } : {}),
      ...(x ? {
        keywords: x.split(",").map(I => I.trim()).filter(I => I)
      } : {}),
      ...(A ? {
        license: A
      } : {}),
      ...(k ? {
        repository: k
      } : {})
    };
  }
  function printNextSteps() {
    console.log(`
Next steps:`);
    console.log("1. Ensure all your production dependencies are in this directory");
    console.log("2. Run 'mcpb pack' to create your .mcpb file");
  }
  async function initExtension(e = process.cwd(), t = false) {
    let n = BMe.resolve(e);
    let r = BMe.join(n, "manifest.json");
    if (g6e.existsSync(r)) {
      if (t) {
        console.log("manifest.json already exists. Use --force to overwrite in non-interactive mode.");
        return false;
      }
      if (!(await _T({
        message: "manifest.json already exists. Overwrite?",
        default: false
      }))) {
        console.log("Cancelled");
        return false;
      }
    }
    if (!t) {
      console.log("This utility will help you create a manifest.json file for your MCPB bundle.");
      console.log(`Press ^C at any time to quit.
`);
    } else {
      console.log("Creating manifest.json with default values...");
    }
    try {
      let o = readPackageJson(n);
      let s = t ? getDefaultBasicInfo(o, n) : await promptBasicInfo(o, n);
      let i = t ? undefined : await promptLongDescription(s.description);
      let a = t ? getDefaultAuthorInfo(o) : await promptAuthorInfo(o);
      let l = t ? {
        homepage: "",
        documentation: "",
        support: ""
      } : await promptUrls();
      let c = t ? {
        icon: "",
        screenshots: []
      } : await promptVisualAssets();
      let u = t ? getDefaultServerConfig(o) : await promptServerConfig(o);
      let d = t ? {
        tools: [],
        toolsGenerated: false
      } : await promptTools();
      let p = t ? {
        prompts: [],
        promptsGenerated: false
      } : await promptPrompts();
      let m = t ? undefined : await promptCompatibility(u.serverType);
      let f = t ? {} : await promptUserConfig();
      let h = t ? getDefaultOptionalFields(o) : await promptOptionalFields(o);
      let g = buildManifest(s, i, a, l, c, u, d.tools, d.toolsGenerated, p.prompts, p.promptsGenerated, m, f, h);
      g6e.writeFileSync(r, JSON.stringify(g, null, 2) + `
`);
      console.log(`
Created manifest.json at ${r}`);
      printNextSteps();
      return true;
    } catch (o) {
      if (o instanceof Error && o.message.includes("User force closed")) {
        console.log(`
Cancelled`);
        return false;
      }
      throw o;
    }
  }
  var g6e;
  var BMe;
  var W_o = __lazy(() => {
    L_o();
    w9t();
    g6e = require("fs");
    BMe = require("path");
  });
  var O9t = {};
  __export(O9t, {
    zlibSync: () => zlibSync,
    zlib: () => zlib,
    zipSync: () => zipSync,
    zip: () => zip,
    unzlibSync: () => unzlibSync,
    unzlib: () => unzlib,
    unzipSync: () => unzipSync,
    unzip: () => unzip,
    strToU8: () => strToU8,
    strFromU8: () => strFromU8,
    inflateSync: () => inflateSync,
    inflate: () => inflate,
    gzipSync: () => gzipSync,
    gzip: () => compress,
    gunzipSync: () => gunzipSync,
    gunzip: () => gunzip,
    deflateSync: () => deflateSync,
    deflate: () => deflate,
    decompressSync: () => decompressSync,
    decompress: () => decompress,
    compressSync: () => gzipSync,
    compress: () => compress,
    Zlib: () => Zlib,
    ZipPassThrough: () => ZipPassThrough,
    ZipDeflate: () => ZipDeflate,
    Zip: () => Zip,
    Unzlib: () => Unzlib,
    UnzipPassThrough: () => UnzipPassThrough,
    UnzipInflate: () => UnzipInflate,
    Unzip: () => Unzip,
    Inflate: () => Inflate,
    Gzip: () => Compress,
    Gunzip: () => Gunzip,
    FlateErrorCode: () => FlateErrorCode,
    EncodeUTF8: () => EncodeUTF8,
    Deflate: () => Deflate,
    Decompress: () => Decompress,
    DecodeUTF8: () => DecodeUTF8,
    Compress: () => Compress,
    AsyncZlib: () => AsyncZlib,
    AsyncZipDeflate: () => AsyncZipDeflate,
    AsyncUnzlib: () => AsyncUnzlib,
    AsyncUnzipInflate: () => AsyncUnzipInflate,
    AsyncInflate: () => AsyncInflate,
    AsyncGzip: () => AsyncGzip,
    AsyncGunzip: () => AsyncGunzip,
    AsyncDeflate: () => AsyncDeflate,
    AsyncDecompress: () => AsyncDecompress,
    AsyncCompress: () => AsyncGzip
  });
  function _6e(e, t) {
    if (typeof e == "function") {
      t = e;
      e = {};
    }
    this.ondata = t;
    return e;
  }
  function deflate(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    return Cft(e, t, [wft], function (r) {
      return qMe(deflateSync(r.data[0], r.data[1]));
    }, 0, n);
  }
  function deflateSync(e, t) {
    return y6e(e, t || {}, 0, 0);
  }
  function inflate(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    return Cft(e, t, [vft], function (r) {
      return qMe(inflateSync(r.data[0], rbo(r.data[1])));
    }, 1, n);
  }
  function inflateSync(e, t) {
    return A9t(e, {
      i: 2
    }, t && t.out, t && t.dictionary);
  }
  function compress(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    return Cft(e, t, [wft, mFa, function () {
      return [gzipSync];
    }], function (r) {
      return qMe(gzipSync(r.data[0], r.data[1]));
    }, 2, n);
  }
  function gzipSync(e, t) {
    if (!t) {
      t = {};
    }
    var n = Eft();
    var r = e.length;
    n.p(e);
    var o = y6e(e, t, ibo(t), 8);
    var s = o.length;
    obo(o, t);
    Lb(o, s - 8, n.d());
    Lb(o, s - 4, r);
    return o;
  }
  function gunzip(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    return Cft(e, t, [vft, fFa, function () {
      return [gunzipSync];
    }], function (r) {
      return qMe(gunzipSync(r.data[0], r.data[1]));
    }, 3, n);
  }
  function gunzipSync(e, t) {
    var n = sbo(e);
    if (n + 8 > e.length) {
      gu(6, "invalid gzip data");
    }
    return A9t(e.subarray(n, -8), {
      i: 2
    }, t && t.out || new Uint8Array(yFa(e)), t && t.dictionary);
  }
  function zlib(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    return Cft(e, t, [wft, hFa, function () {
      return [zlibSync];
    }], function (r) {
      return qMe(zlibSync(r.data[0], r.data[1]));
    }, 4, n);
  }
  function zlibSync(e, t) {
    if (!t) {
      t = {};
    }
    var n = H4n();
    n.p(e);
    var r = y6e(e, t, t.dictionary ? 6 : 2, 4);
    abo(r, t);
    Lb(r, r.length - 4, n.d());
    return r;
  }
  function unzlib(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    return Cft(e, t, [vft, gFa, function () {
      return [unzlibSync];
    }], function (r) {
      return qMe(unzlibSync(r.data[0], rbo(r.data[1])));
    }, 5, n);
  }
  function unzlibSync(e, t) {
    return A9t(e.subarray(lbo(e, t && t.dictionary), -4), {
      i: 2
    }, t && t.out, t && t.dictionary);
  }
  function decompress(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    return e[0] == 31 && e[1] == 139 && e[2] == 8 ? gunzip(e, t, n) : (e[0] & 15) != 8 || e[0] >> 4 > 7 || (e[0] << 8 | e[1]) % 31 ? inflate(e, t, n) : unzlib(e, t, n);
  }
  function decompressSync(e, t) {
    return e[0] == 31 && e[1] == 139 && e[2] == 8 ? gunzipSync(e, t) : (e[0] & 15) != 8 || e[0] >> 4 > 7 || (e[0] << 8 | e[1]) % 31 ? inflateSync(e, t) : unzlibSync(e, t);
  }
  function strToU8(e, t) {
    if (t) {
      var n = new Uint8Array(e.length);
      for (var r = 0; r < e.length; ++r) {
        n[r] = e.charCodeAt(r);
      }
      return n;
    }
    if (QLa) {
      return QLa.HS(e);
    }
    var o = e.length;
    var s = new Uint8Array(e.length + (e.length >> 1));
    var i = 0;
    var a = function (u) {
      s[i++] = u;
    };
    for (var r = 0; r < o; ++r) {
      if (i + 5 > s.length) {
        var l = new Uint8Array(i + 8 + (o - r << 1));
        l.set(s);
        s = l;
      }
      var c = e.charCodeAt(r);
      if (c < 128 || t) {
        a(c);
      } else if (c < 2048) {
        a(192 | c >> 6);
        a(128 | c & 63);
      } else if (c > 55295 && c < 57344) {
        c = 65536 + (c & 1047552) | e.charCodeAt(++r) & 1023;
        a(240 | c >> 18);
        a(128 | c >> 12 & 63);
        a(128 | c >> 6 & 63);
        a(128 | c & 63);
      } else {
        a(224 | c >> 12);
        a(128 | c >> 6 & 63);
        a(128 | c & 63);
      }
    }
    return sQ(s, 0, i);
  }
  function strFromU8(e, t) {
    if (t) {
      var n = "";
      for (var r = 0; r < e.length; r += 16384) {
        n += String.fromCharCode.apply(null, e.subarray(r, r + 16384));
      }
      return n;
    } else if (ebo) {
      return ebo.oC(e);
    } else {
      var o = CFa(e);
      var s = o.s;
      var n = o.r;
      if (n.length) {
        gu(8);
      }
      return s;
    }
  }
  function zip(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    var r = {};
    dbo(e, "", r, t);
    var o = Object.keys(r);
    var s = o.length;
    var i = 0;
    var a = 0;
    var l = s;
    var c = Array(s);
    var u = [];
    var d = function () {
      for (var g = 0; g < u.length; ++g) {
        u[g]();
      }
    };
    var p = function (g, y) {
      $4n(function () {
        n(g, y);
      });
    };
    $4n(function () {
      p = n;
    });
    var m = function () {
      var g = new Uint8Array(a + 22);
      var y = i;
      var _ = a - i;
      a = 0;
      for (var b = 0; b < l; ++b) {
        var S = c[b];
        try {
          var E = S.c.length;
          _ft(g, a, S, S.f, S.u, E);
          var C = 30 + S.f.length + HMe(S.extra);
          var x = a + C;
          g.set(S.c, x);
          _ft(g, i, S, S.f, S.u, E, a, S.m);
          i += 16 + C + (S.m ? S.m.length : 0);
          a = x + E;
        } catch (A) {
          return p(A, null);
        }
      }
      mbo(g, i, c.length, _, y);
      p(null, g);
    };
    if (!s) {
      m();
    }
    var f = function (g) {
      var y = o[g];
      var _ = r[y];
      var b = _[0];
      var S = _[1];
      var E = Eft();
      var C = b.length;
      E.p(b);
      var x = strToU8(y);
      var A = x.length;
      var k = S.comment;
      var I = k && strToU8(k);
      var O = I && I.length;
      var M = HMe(S.extra);
      var L = S.level == 0 ? 0 : 8;
      var P = function (F, H) {
        if (F) {
          d();
          p(F, null);
        } else {
          var U = H.length;
          if (c[g] = I9t(S, {
            size: C,
            crc: E.d(),
            c: H,
            f: x,
            m: I,
            u: A != y.length || I && k.length != O,
            compression: L
          }), i += 30 + A + M + U, a += 76 + 2 * (A + M) + (O || 0) + U, ! --s) {
            m();
          }
        }
      };
      if (A > 65535) {
        P(gu(11, 0, 1), null);
      }
      if (!L) {
        P(null, b);
      } else if (C < 160000) {
        try {
          P(null, deflateSync(b, S));
        } catch (F) {
          P(F, null);
        }
      } else {
        u.push(deflate(b, S, P));
      }
    };
    for (var h = 0; h < l; ++h) {
      f(h);
    }
    return d;
  }
  function zipSync(e, t) {
    if (!t) {
      t = {};
    }
    var n = {};
    var r = [];
    dbo(e, "", n, t);
    var o = 0;
    var s = 0;
    for (var i in n) {
      var a = n[i];
      var l = a[0];
      var c = a[1];
      var u = c.level == 0 ? 0 : 8;
      var d = strToU8(i);
      var p = d.length;
      var m = c.comment;
      var f = m && strToU8(m);
      var h = f && f.length;
      var g = HMe(c.extra);
      if (p > 65535) {
        gu(11);
      }
      var y = u ? deflateSync(l, c) : l;
      var _ = y.length;
      var b = Eft();
      b.p(l);
      r.push(I9t(c, {
        size: l.length,
        crc: b.d(),
        c: y,
        f: d,
        m: f,
        u: p != i.length || f && m.length != h,
        o,
        compression: u
      }));
      o += 30 + p + g + _;
      s += 76 + 2 * (p + g) + (h || 0) + _;
    }
    var S = new Uint8Array(s + 22);
    var E = o;
    var C = s - o;
    for (var x = 0; x < r.length; ++x) {
      var d = r[x];
      _ft(S, d.o, d, d.f, d.u, d.c.length);
      var A = 30 + d.f.length + HMe(d.extra);
      S.set(d.c, d.o + A);
      _ft(S, o, d, d.f, d.u, d.c.length, d.o, d.m);
      o += 16 + A + (d.m ? d.m.length : 0);
    }
    mbo(S, o, r.length, C, E);
    return S;
  }
  function unzip(e, t, n) {
    if (!n) {
      n = t;
      t = {};
    }
    if (typeof n != "function") {
      gu(7);
    }
    var r = [];
    var o = function () {
      for (var g = 0; g < r.length; ++g) {
        r[g]();
      }
    };
    var s = {};
    var i = function (g, y) {
      $4n(function () {
        n(g, y);
      });
    };
    $4n(function () {
      i = n;
    });
    var a = e.length - 22;
    for (; KI(e, a) != 101010256; --a) {
      if (!a || e.length - a > 65558) {
        i(gu(13, 0, 1), null);
        return o;
      }
    }
    var l = r3(e, a + 8);
    if (l) {
      var c = l;
      var u = KI(e, a + 16);
      var d = u == 4294967295 || c == 65535;
      if (d) {
        var p = KI(e, a - 12);
        if (d = KI(e, p) == 101075792, d) {
          c = l = KI(e, p + 32);
          u = KI(e, p + 48);
        }
      }
      var m = t && t.filter;
      var f = function (g) {
        var y = kFa(e, u, d);
        var _ = y[0];
        var b = y[1];
        var S = y[2];
        var E = y[3];
        var C = y[4];
        var x = y[5];
        var A = xFa(e, x);
        u = C;
        var k = function (O, M) {
          if (O) {
            o();
            i(O, null);
          } else {
            if (M) {
              s[E] = M;
            }
            if (! --l) {
              i(null, s);
            }
          }
        };
        if (!m || m({
          name: E,
          size: b,
          originalSize: S,
          compression: _
        })) {
          if (!_) {
            k(null, sQ(e, A, A + b));
          } else if (_ == 8) {
            var I = e.subarray(A, A + b);
            if (S < 524288 || b > 0.8 * S) {
              try {
                k(null, inflateSync(I, {
                  out: new Uint8Array(S)
                }));
              } catch (O) {
                k(O, null);
              }
            } else {
              r.push(inflate(I, {
                size: S
              }, k));
            }
          } else {
            k(gu(14, "unknown compression type " + _, 1), null);
          }
        } else {
          k(null, null);
        }
      };
      for (var h = 0; h < c; ++h) {
        f(h);
      }
    } else {
      i(null, {});
    }
    return o;
  }
  function unzipSync(e, t) {
    var n = {};
    var r = e.length - 22;
    for (; KI(e, r) != 101010256; --r) {
      if (!r || e.length - r > 65558) {
        gu(13);
      }
    }
    var o = r3(e, r + 8);
    if (!o) {
      return {};
    }
    var s = KI(e, r + 16);
    var i = s == 4294967295 || o == 65535;
    if (i) {
      var a = KI(e, r - 12);
      if (i = KI(e, a) == 101075792, i) {
        o = KI(e, a + 32);
        s = KI(e, a + 48);
      }
    }
    var l = t && t.filter;
    for (var c = 0; c < o; ++c) {
      var u = kFa(e, s, i);
      var d = u[0];
      var p = u[1];
      var m = u[2];
      var f = u[3];
      var h = u[4];
      var g = u[5];
      var y = xFa(e, g);
      if (s = h, !l || l({
        name: f,
        size: p,
        originalSize: m,
        compression: d
      })) {
        if (!d) {
          n[f] = sQ(e, y, y + p);
        } else if (d == 8) {
          n[f] = inflateSync(e.subarray(y, y + p), {
            out: new Uint8Array(m)
          });
        } else {
          gu(14, "unknown compression type " + d);
        }
      }
    }
    return n;
  }
  var ZLa;
  var qLp;
  var I4n;
  var GLp;
  var bft;
  var Sft;
  var C9t;
  var eFa = function (e, t) {
    var n = new Uint16Array(31);
    for (var r = 0; r < 31; ++r) {
      n[r] = t += 1 << e[r - 1];
    }
    var o = new Int32Array(n[30]);
    for (var r = 1; r < 30; ++r) {
      for (var s = n[r]; s < n[r + 1]; ++s) {
        o[s] = s - n[r] << 5 | r;
      }
    }
    return {
      b: n,
      r: o
    };
  };
  var tFa;
  var tbo;
  var M4n;
  var nFa;
  var rFa;
  var V_o;
  var R9t;
  var ipe;
  var Xh;
  var oQ = function (e, t, n) {
    var r = e.length;
    var o = 0;
    var s = new Uint16Array(t);
    for (; o < r; ++o) {
      if (e[o]) {
        ++s[e[o] - 1];
      }
    }
    var i = new Uint16Array(t);
    for (o = 1; o < t; ++o) {
      i[o] = i[o - 1] + s[o - 1] << 1;
    }
    var a;
    if (n) {
      a = new Uint16Array(1 << t);
      var l = 15 - t;
      for (o = 0; o < r; ++o) {
        if (e[o]) {
          var c = o << 4 | e[o];
          var u = t - e[o];
          var d = i[e[o] - 1]++ << u;
          for (var p = d | (1 << u) - 1; d <= p; ++d) {
            a[R9t[d] >> l] = c;
          }
        }
      }
    } else {
      a = new Uint16Array(r);
      for (o = 0; o < r; ++o) {
        if (e[o]) {
          a[o] = R9t[i[e[o] - 1]++] >> 15 - e[o];
        }
      }
    }
    return a;
  };
  var cEe;
  var Xh;
  var Xh;
  var Xh;
  var Xh;
  var yft;
  var Xh;
  var oFa;
  var sFa;
  var iFa;
  var aFa;
  var P4n = function (e) {
    var t = e[0];
    for (var n = 1; n < e.length; ++n) {
      if (e[n] > t) {
        t = e[n];
      }
    }
    return t;
  };
  var rQ = function (e, t, n) {
    var r = t / 8 | 0;
    return (e[r] | e[r + 1] << 8) >> (t & 7) & n;
  };
  var O4n = function (e, t) {
    var n = t / 8 | 0;
    return (e[n] | e[n + 1] << 8 | e[n + 2] << 16) >> (t & 7);
  };
  var Tft = function (e) {
    return (e + 7) / 8 | 0;
  };
  var sQ = function (e, t, n) {
    if (t == null || t < 0) {
      t = 0;
    }
    if (n == null || n > e.length) {
      n = e.length;
    }
    return new Uint8Array(e.subarray(t, n));
  };
  var FlateErrorCode;
  var lFa;
  var gu = function (e, t, n) {
    var r = Error(t || lFa[e]);
    if (r.code = e, Error.captureStackTrace) {
      Error.captureStackTrace(r, gu);
    }
    if (!n) {
      throw r;
    }
    return r;
  };
  var A9t = function (e, t, n, r) {
    var o = e.length;
    var s = r ? r.length : 0;
    if (!o || t.f && !t.l) {
      return n || new Uint8Array(0);
    }
    var i = !n;
    var a = i || t.i != 2;
    var l = t.i;
    if (i) {
      n = new Uint8Array(o * 3);
    }
    var c = function (se) {
      var ae = n.length;
      if (se > ae) {
        var de = new Uint8Array(Math.max(ae * 2, se));
        de.set(n);
        n = de;
      }
    };
    var u = t.f || 0;
    var d = t.p || 0;
    var p = t.b || 0;
    var m = t.l;
    var f = t.d;
    var h = t.m;
    var g = t.n;
    var y = o * 8;
    do {
      if (!m) {
        u = rQ(e, d, 1);
        var _ = rQ(e, d + 1, 3);
        if (d += 3, !_) {
          var b = Tft(d) + 4;
          var S = e[b - 4] | e[b - 3] << 8;
          var E = b + S;
          if (E > o) {
            if (l) {
              gu(0);
            }
            break;
          }
          if (a) {
            c(p + S);
          }
          n.set(e.subarray(b, E), p);
          t.b = p += S;
          t.p = d = E * 8;
          t.f = u;
          continue;
        } else if (_ == 1) {
          m = sFa;
          f = aFa;
          h = 9;
          g = 5;
        } else if (_ == 2) {
          var C = rQ(e, d, 31) + 257;
          var x = rQ(e, d + 10, 15) + 4;
          var A = C + rQ(e, d + 5, 31) + 1;
          d += 14;
          var k = new Uint8Array(A);
          var I = new Uint8Array(19);
          for (var O = 0; O < x; ++O) {
            I[C9t[O]] = rQ(e, d + O * 3, 7);
          }
          d += x * 3;
          var M = P4n(I);
          var L = (1 << M) - 1;
          var P = oQ(I, M, 1);
          for (var O = 0; O < A;) {
            var F = P[rQ(e, d, L)];
            d += F & 15;
            var b = F >> 4;
            if (b < 16) {
              k[O++] = b;
            } else {
              var H = 0;
              var U = 0;
              if (b == 16) {
                U = 3 + rQ(e, d, 3);
                d += 2;
                H = k[O - 1];
              } else if (b == 17) {
                U = 3 + rQ(e, d, 7);
                d += 3;
              } else if (b == 18) {
                U = 11 + rQ(e, d, 127);
                d += 7;
              }
              while (U--) {
                k[O++] = H;
              }
            }
          }
          var N = k.subarray(0, C);
          var W = k.subarray(C);
          h = P4n(N);
          g = P4n(W);
          m = oQ(N, h, 1);
          f = oQ(W, g, 1);
        } else {
          gu(1);
        }
        if (d > y) {
          if (l) {
            gu(0);
          }
          break;
        }
      }
      if (a) {
        c(p + 131072);
      }
      var j = (1 << h) - 1;
      var z = (1 << g) - 1;
      var V = d;
      for (;; V = d) {
        var H = m[O4n(e, d) & j];
        var K = H >> 4;
        if (d += H & 15, d > y) {
          if (l) {
            gu(0);
          }
          break;
        }
        if (!H) {
          gu(2);
        }
        if (K < 256) {
          n[p++] = K;
        } else if (K == 256) {
          V = d;
          m = null;
          break;
        } else {
          var J = K - 254;
          if (K > 264) {
            var O = K - 257;
            var Q = bft[O];
            J = rQ(e, d, (1 << Q) - 1) + tbo[O];
            d += Q;
          }
          var Z = f[O4n(e, d) & z];
          var ne = Z >> 4;
          if (!Z) {
            gu(3);
          }
          d += Z & 15;
          var W = rFa[ne];
          if (ne > 3) {
            var Q = Sft[ne];
            W += O4n(e, d) & (1 << Q) - 1;
            d += Q;
          }
          if (d > y) {
            if (l) {
              gu(0);
            }
            break;
          }
          if (a) {
            c(p + 131072);
          }
          var oe = p + J;
          if (p < W) {
            var ee = s - W;
            var re = Math.min(W, oe);
            if (ee + p < 0) {
              gu(3);
            }
            for (; p < re; ++p) {
              n[p] = r[ee + p];
            }
          }
          for (; p < oe; ++p) {
            n[p] = n[p - W];
          }
        }
      }
      if (t.l = m, t.p = V, t.b = p, t.f = u, m) {
        u = 1;
        t.m = h;
        t.d = f;
        t.n = g;
      }
    } while (!u);
    return p != n.length && i ? sQ(n, 0, p) : n.subarray(0, p);
  };
  var ape = function (e, t, n) {
    n <<= t & 7;
    var r = t / 8 | 0;
    e[r] |= n;
    e[r + 1] |= n >> 8;
  };
  var hft = function (e, t, n) {
    n <<= t & 7;
    var r = t / 8 | 0;
    e[r] |= n;
    e[r + 1] |= n >> 8;
    e[r + 2] |= n >> 16;
  };
  var D4n = function (e, t) {
    var n = [];
    for (var r = 0; r < e.length; ++r) {
      if (e[r]) {
        n.push({
          s: r,
          f: e[r]
        });
      }
    }
    var o = n.length;
    var s = n.slice();
    if (!o) {
      return {
        t: $Me,
        l: 0
      };
    }
    if (o == 1) {
      var i = new Uint8Array(n[0].s + 1);
      i[n[0].s] = 1;
      return {
        t: i,
        l: 1
      };
    }
    n.sort(function (E, C) {
      return E.f - C.f;
    });
    n.push({
      s: -1,
      f: 25001
    });
    var a = n[0];
    var l = n[1];
    var c = 0;
    var u = 1;
    var d = 2;
    n[0] = {
      s: -1,
      f: a.f + l.f,
      l: a,
      r: l
    };
    while (u != o - 1) {
      a = n[n[c].f < n[d].f ? c++ : d++];
      l = n[c != u && n[c].f < n[d].f ? c++ : d++];
      n[u++] = {
        s: -1,
        f: a.f + l.f,
        l: a,
        r: l
      };
    }
    var p = s[0].s;
    for (var r = 1; r < o; ++r) {
      if (s[r].s > p) {
        p = s[r].s;
      }
    }
    var m = new Uint16Array(p + 1);
    var f = N4n(n[u - 1], m, 0);
    if (f > t) {
      var r = 0;
      var h = 0;
      var g = f - t;
      var y = 1 << g;
      s.sort(function (C, x) {
        return m[x.s] - m[C.s] || C.f - x.f;
      });
      for (; r < o; ++r) {
        var _ = s[r].s;
        if (m[_] > t) {
          h += y - (1 << f - m[_]);
          m[_] = t;
        } else {
          break;
        }
      }
      h >>= g;
      while (h > 0) {
        var b = s[r].s;
        if (m[b] < t) {
          h -= 1 << t - m[b]++ - 1;
        } else {
          ++r;
        }
      }
      for (; r >= 0 && h; --r) {
        var S = s[r].s;
        if (m[S] == t) {
          --m[S];
          ++h;
        }
      }
      f = t;
    }
    return {
      t: new Uint8Array(m),
      l: f
    };
  };
  var N4n = function (e, t, n) {
    return e.s == -1 ? Math.max(N4n(e.l, t, n + 1), N4n(e.r, t, n + 1)) : t[e.s] = n;
  };
  var z_o = function (e) {
    var t = e.length;
    while (t && !e[--t]) {
      ;
    }
    var n = new Uint16Array(++t);
    var r = 0;
    var o = e[0];
    var s = 1;
    var i = function (l) {
      n[r++] = l;
    };
    for (var a = 1; a <= t; ++a) {
      if (e[a] == o && a != t) {
        ++s;
      } else {
        if (!o && s > 2) {
          for (; s > 138; s -= 138) {
            i(32754);
          }
          if (s > 2) {
            i(s > 10 ? s - 11 << 5 | 28690 : s - 3 << 5 | 12305);
            s = 0;
          }
        } else if (s > 3) {
          i(o);
          --s;
          for (; s > 6; s -= 6) {
            i(8304);
          }
          if (s > 2) {
            i(s - 3 << 5 | 8208);
            s = 0;
          }
        }
        while (s--) {
          i(o);
        }
        s = 1;
        o = e[a];
      }
    }
    return {
      c: n.subarray(0, r),
      n: t
    };
  };
  var gft = function (e, t) {
    var n = 0;
    for (var r = 0; r < t.length; ++r) {
      n += e[r] * t[r];
    }
    return n;
  };
  var nbo = function (e, t, n) {
    var r = n.length;
    var o = Tft(t + 2);
    e[o] = r & 255;
    e[o + 1] = r >> 8;
    e[o + 2] = e[o] ^ 255;
    e[o + 3] = e[o + 1] ^ 255;
    for (var s = 0; s < r; ++s) {
      e[o + s + 4] = n[s];
    }
    return (o + 4 + r) * 8;
  };
  var K_o = function (e, t, n, r, o, s, i, a, l, c, u) {
    ape(t, u++, n);
    ++o[256];
    var d = D4n(o, 15);
    var p = d.t;
    var m = d.l;
    var f = D4n(s, 15);
    var h = f.t;
    var g = f.l;
    var y = z_o(p);
    var _ = y.c;
    var b = y.n;
    var S = z_o(h);
    var E = S.c;
    var C = S.n;
    var x = new Uint16Array(19);
    for (var A = 0; A < _.length; ++A) {
      ++x[_[A] & 31];
    }
    for (var A = 0; A < E.length; ++A) {
      ++x[E[A] & 31];
    }
    var k = D4n(x, 7);
    var I = k.t;
    var O = k.l;
    var M = 19;
    for (; M > 4 && !I[C9t[M - 1]]; --M) {
      ;
    }
    var L = c + 5 << 3;
    var P = gft(o, cEe) + gft(s, yft) + i;
    var F = gft(o, p) + gft(s, h) + i + 14 + 3 * M + gft(x, I) + 2 * x[16] + 3 * x[17] + 7 * x[18];
    if (l >= 0 && L <= P && L <= F) {
      return nbo(t, u, e.subarray(l, l + c));
    }
    var H;
    var U;
    var N;
    var W;
    if (ape(t, u, 1 + (F < P)), u += 2, F < P) {
      H = oQ(p, m, 0);
      U = p;
      N = oQ(h, g, 0);
      W = h;
      var j = oQ(I, O, 0);
      ape(t, u, b - 257);
      ape(t, u + 5, C - 1);
      ape(t, u + 10, M - 4);
      u += 14;
      for (var A = 0; A < M; ++A) {
        ape(t, u + 3 * A, I[C9t[A]]);
      }
      u += 3 * M;
      var z = [_, E];
      for (var V = 0; V < 2; ++V) {
        var K = z[V];
        for (var A = 0; A < K.length; ++A) {
          var J = K[A] & 31;
          if (ape(t, u, j[J]), u += I[J], J > 15) {
            ape(t, u, K[A] >> 5 & 127);
            u += K[A] >> 12;
          }
        }
      }
    } else {
      H = oFa;
      U = cEe;
      N = iFa;
      W = yft;
    }
    for (var A = 0; A < a; ++A) {
      var Q = r[A];
      if (Q > 255) {
        var J = Q >> 18 & 31;
        if (hft(t, u, H[J + 257]), u += U[J + 257], J > 7) {
          ape(t, u, Q >> 23 & 31);
          u += bft[J];
        }
        var Z = Q & 31;
        if (hft(t, u, N[Z]), u += W[Z], Z > 3) {
          hft(t, u, Q >> 5 & 8191);
          u += Sft[Z];
        }
      } else {
        hft(t, u, H[Q]);
        u += U[Q];
      }
    }
    hft(t, u, H[256]);
    return u + U[256];
  };
  var cFa;
  var $Me;
  var uFa = function (e, t, n, r, o, s) {
    var i = s.z || e.length;
    var a = new Uint8Array(r + i + 5 * (1 + Math.ceil(i / 7000)) + o);
    var l = a.subarray(r, a.length - o);
    var c = s.l;
    var u = (s.r || 0) & 7;
    if (t) {
      if (u) {
        l[0] = s.r >> 3;
      }
      var d = cFa[t - 1];
      var p = d >> 13;
      var m = d & 8191;
      var f = (1 << n) - 1;
      var h = s.p || new Uint16Array(32768);
      var g = s.h || new Uint16Array(f + 1);
      var y = Math.ceil(n / 3);
      var _ = 2 * y;
      var b = function (be) {
        return (e[be] ^ e[be + 1] << y ^ e[be + 2] << _) & f;
      };
      var S = new Int32Array(25000);
      var E = new Uint16Array(288);
      var C = new Uint16Array(32);
      var x = 0;
      var A = 0;
      var k = s.i || 0;
      var I = 0;
      var O = s.w || 0;
      var M = 0;
      for (; k + 2 < i; ++k) {
        var L = b(k);
        var P = k & 32767;
        var F = g[L];
        if (h[P] = F, g[L] = P, O <= k) {
          var H = i - k;
          if ((x > 7000 || I > 24576) && (H > 423 || !c)) {
            u = K_o(e, l, 0, S, E, C, A, I, M, k - M, u);
            I = x = A = 0;
            M = k;
            for (var U = 0; U < 286; ++U) {
              E[U] = 0;
            }
            for (var U = 0; U < 30; ++U) {
              C[U] = 0;
            }
          }
          var N = 2;
          var W = 0;
          var j = m;
          var z = P - F & 32767;
          if (H > 2 && L == b(k - z)) {
            var V = Math.min(p, H) - 1;
            var K = Math.min(32767, k);
            var J = Math.min(258, H);
            while (z <= K && --j && P != F) {
              if (e[k + N] == e[k + N - z]) {
                var Q = 0;
                for (; Q < J && e[k + Q] == e[k + Q - z]; ++Q) {
                  ;
                }
                if (Q > N) {
                  if (N = Q, W = z, Q > V) {
                    break;
                  }
                  var Z = Math.min(z, Q - 2);
                  var ne = 0;
                  for (var U = 0; U < Z; ++U) {
                    var oe = k - z + U & 32767;
                    var ee = h[oe];
                    var re = oe - ee & 32767;
                    if (re > ne) {
                      ne = re;
                      F = oe;
                    }
                  }
                }
              }
              P = F;
              F = h[P];
              z += P - F & 32767;
            }
          }
          if (W) {
            S[I++] = 268435456 | M4n[N] << 18 | V_o[W];
            var se = M4n[N] & 31;
            var ae = V_o[W] & 31;
            A += bft[se] + Sft[ae];
            ++E[257 + se];
            ++C[ae];
            O = k + N;
            ++x;
          } else {
            S[I++] = e[k];
            ++E[e[k]];
          }
        }
      }
      for (k = Math.max(k, O); k < i; ++k) {
        S[I++] = e[k];
        ++E[e[k]];
      }
      if (u = K_o(e, l, c, S, E, C, A, I, M, k - M, u), !c) {
        s.r = u & 7 | l[u / 8 | 0] << 3;
        u -= 7;
        s.h = g;
        s.p = h;
        s.i = k;
        s.w = O;
      }
    } else {
      for (var k = s.w || 0; k < i + c; k += 65535) {
        var de = k + 65535;
        if (de >= i) {
          l[u / 8 | 0] = c;
          de = i;
        }
        u = nbo(l, u + 1, e.subarray(k, de));
      }
      s.i = i;
    }
    return sQ(a, 0, r + Tft(u) + o);
  };
  var dFa;
  var Eft = function () {
    var e = -1;
    return {
      p: function (t) {
        var n = e;
        for (var r = 0; r < t.length; ++r) {
          n = dFa[n & 255 ^ t[r]] ^ n >>> 8;
        }
        e = n;
      },
      d: function () {
        return ~e;
      }
    };
  };
  var H4n = function () {
    var e = 1;
    var t = 0;
    return {
      p: function (n) {
        var r = e;
        var o = t;
        var s = n.length | 0;
        for (var i = 0; i != s;) {
          var a = Math.min(i + 2655, s);
          for (; i < a; ++i) {
            o += r += n[i];
          }
          r = (r & 65535) + 15 * (r >> 16);
          o = (o & 65535) + 15 * (o >> 16);
        }
        e = r;
        t = o;
      },
      d: function () {
        e %= 65521;
        t %= 65521;
        return (e & 255) << 24 | (e & 65280) << 8 | (t & 255) << 8 | t >> 8;
      }
    };
  };
  var y6e = function (e, t, n, r, o) {
    if (!o) {
      if (o = {
        l: 1
      }, t.dictionary) {
        var s = t.dictionary.subarray(-32768);
        var i = new Uint8Array(s.length + e.length);
        i.set(s);
        i.set(e, s.length);
        e = i;
        o.w = s.length;
      }
    }
    return uFa(e, t.level == null ? 6 : t.level, t.mem == null ? o.l ? Math.ceil(Math.max(8, Math.min(13, Math.log(e.length))) * 1.5) : 20 : 12 + t.mem, n, r, o);
  };
  var I9t = function (e, t) {
    var n = {};
    for (var r in e) {
      n[r] = e[r];
    }
    for (var r in t) {
      n[r] = t[r];
    }
    return n;
  };
  var XLa = function (e, t, n) {
    var r = e();
    var o = e.toString();
    var s = o.slice(o.indexOf("[") + 1, o.lastIndexOf("]")).replace(/\s+/g, "").split(",");
    for (var i = 0; i < r.length; ++i) {
      var a = r[i];
      var l = s[i];
      if (typeof a == "function") {
        t += ";" + l + "=";
        var c = a.toString();
        if (a.prototype) {
          if (c.indexOf("[native code]") != -1) {
            var u = c.indexOf(" ", 8) + 1;
            t += c.slice(u, c.indexOf("(", u));
          } else {
            t += c;
            for (var d in a.prototype) {
              t += ";" + l + ".prototype." + d + "=" + a.prototype[d].toString();
            }
          }
        } else {
          t += c;
        }
      } else {
        n[l] = a;
      }
    }
    return t;
  };
  var A4n;
  var zLp = function (e) {
    var t = [];
    for (var n in e) {
      if (e[n].buffer) {
        t.push((e[n] = new e[n].constructor(e[n])).buffer);
      }
    }
    return t;
  };
  var pFa = function (e, t, n, r) {
    if (!A4n[n]) {
      var o = "";
      var s = {};
      var i = e.length - 1;
      for (var a = 0; a < i; ++a) {
        o = XLa(e[a], o, s);
      }
      A4n[n] = {
        c: XLa(e[i], o, s),
        e: s
      };
    }
    var l = I9t({}, A4n[n].e);
    return GLp(A4n[n].c + ";onmessage=function(e){for(var k in e.data)self[k]=e.data[k];onmessage=" + t.toString() + "}", n, l, zLp(l), r);
  };
  var vft = function () {
    return [Uint8Array, Uint16Array, Int32Array, bft, Sft, C9t, tbo, rFa, sFa, aFa, R9t, lFa, oQ, P4n, rQ, O4n, Tft, sQ, gu, A9t, inflateSync, qMe, rbo];
  };
  var wft = function () {
    return [Uint8Array, Uint16Array, Int32Array, bft, Sft, C9t, M4n, V_o, oFa, cEe, iFa, yft, R9t, cFa, $Me, oQ, ape, hft, D4n, N4n, z_o, gft, nbo, K_o, Tft, sQ, uFa, y6e, deflateSync, qMe];
  };
  var mFa = function () {
    return [obo, ibo, Lb, Eft, dFa];
  };
  var fFa = function () {
    return [sbo, yFa];
  };
  var hFa = function () {
    return [abo, Lb, H4n];
  };
  var gFa = function () {
    return [lbo];
  };
  var qMe = function (e) {
    return postMessage(e, [e.buffer]);
  };
  var rbo = function (e) {
    return e && {
      out: e.size && new Uint8Array(e.size),
      dictionary: e.dictionary
    };
  };
  var Cft = function (e, t, n, r, o, s) {
    var i = pFa(n, r, o, function (a, l) {
      i.terminate();
      s(a, l);
    });
    i.postMessage([e, t], t.consume ? [e.buffer] : []);
    return function () {
      i.terminate();
    };
  };
  var aQ = function (e) {
    e.ondata = function (t, n) {
      return postMessage([t, n], [t.buffer]);
    };
    return function (t) {
      if (t.data.length) {
        e.push(t.data[0], t.data[1]);
        postMessage([t.data[0].length]);
      } else {
        e.flush();
      }
    };
  };
  var Rft = function (e, t, n, r, o, s, i) {
    var a;
    var l = pFa(e, r, o, function (c, u) {
      if (c) {
        l.terminate();
        t.ondata.call(t, c);
      } else if (!Array.isArray(u)) {
        i(u);
      } else if (u.length == 1) {
        if (t.queuedSize -= u[0], t.ondrain) {
          t.ondrain(u[0]);
        }
      } else {
        if (u[1]) {
          l.terminate();
        }
        t.ondata.call(t, c, u[0], u[1]);
      }
    });
    if (l.postMessage(n), t.queuedSize = 0, t.push = function (c, u) {
      if (!t.ondata) {
        gu(5);
      }
      if (a) {
        t.ondata(gu(4, 0, 1), null, !!u);
      }
      t.queuedSize += c.length;
      l.postMessage([c, a = u], [c.buffer]);
    }, t.terminate = function () {
      l.terminate();
    }, s) {
      t.flush = function () {
        l.postMessage([]);
      };
    }
  };
  var r3 = function (e, t) {
    return e[t] | e[t + 1] << 8;
  };
  var KI = function (e, t) {
    return (e[t] | e[t + 1] << 8 | e[t + 2] << 16 | e[t + 3] << 24) >>> 0;
  };
  var G_o = function (e, t) {
    return KI(e, t) + KI(e, t + 4) * 4294967296;
  };
  var Lb = function (e, t, n) {
    for (; n; ++t) {
      e[t] = n;
      n >>>= 8;
    }
  };
  var obo = function (e, t) {
    var n = t.filename;
    if (e[0] = 31, e[1] = 139, e[2] = 8, e[8] = t.level < 2 ? 4 : t.level == 9 ? 2 : 0, e[9] = 3, t.mtime != 0) {
      Lb(e, 4, Math.floor(new Date(t.mtime || Date.now()) / 1000));
    }
    if (n) {
      e[3] = 8;
      for (var r = 0; r <= n.length; ++r) {
        e[r + 10] = n.charCodeAt(r);
      }
    }
  };
  var sbo = function (e) {
    if (e[0] != 31 || e[1] != 139 || e[2] != 8) {
      gu(6, "invalid gzip data");
    }
    var t = e[3];
    var n = 10;
    if (t & 4) {
      n += (e[10] | e[11] << 8) + 2;
    }
    for (var r = (t >> 3 & 1) + (t >> 4 & 1); r > 0; r -= !e[n++]) {
      ;
    }
    return n + (t & 2);
  };
  var yFa = function (e) {
    var t = e.length;
    return (e[t - 4] | e[t - 3] << 8 | e[t - 2] << 16 | e[t - 1] << 24) >>> 0;
  };
  var ibo = function (e) {
    return 10 + (e.filename ? e.filename.length + 1 : 0);
  };
  var abo = function (e, t) {
    var n = t.level;
    var r = n == 0 ? 0 : n < 6 ? 1 : n == 9 ? 3 : 2;
    if (e[0] = 120, e[1] = r << 6 | (t.dictionary && 32), e[1] |= 31 - (e[0] << 8 | e[1]) % 31, t.dictionary) {
      var o = H4n();
      o.p(t.dictionary);
      Lb(e, 2, o.d());
    }
  };
  var lbo = function (e, t) {
    if ((e[0] & 15) != 8 || e[0] >> 4 > 7 || (e[0] << 8 | e[1]) % 31) {
      gu(6, "invalid zlib data");
    }
    if ((e[1] >> 5 & 1) == +!t) {
      gu(6, "invalid zlib data: " + (e[1] & 32 ? "need" : "unexpected") + " dictionary");
    }
    return (e[1] >> 3 & 4) + 2;
  };
  var Deflate;
  var AsyncDeflate;
  var Inflate;
  var AsyncInflate;
  var Compress;
  var AsyncGzip;
  var Gunzip;
  var AsyncGunzip;
  var Zlib;
  var AsyncZlib;
  var Unzlib;
  var AsyncUnzlib;
  var Decompress;
  var AsyncDecompress;
  var dbo = function (e, t, n, r) {
    for (var o in e) {
      var s = e[o];
      var i = t + o;
      var a = r;
      if (Array.isArray(s)) {
        a = I9t(r, s[1]);
        s = s[0];
      }
      if (s instanceof Uint8Array) {
        n[i] = [s, a];
      } else {
        n[i += "/"] = [new Uint8Array(0), a];
        dbo(s, i, n, r);
      }
    }
  };
  var QLa;
  var ebo;
  var CFa = function (e) {
    for (var t = "", n = 0;;) {
      var r = e[n++];
      var o = (r > 127) + (r > 223) + (r > 239);
      if (n + o > e.length) {
        return {
          s: t,
          r: sQ(e, n - 1)
        };
      }
      if (!o) {
        t += String.fromCharCode(r);
      } else if (o == 3) {
        r = ((r & 15) << 18 | (e[n++] & 63) << 12 | (e[n++] & 63) << 6 | e[n++] & 63) - 65536;
        t += String.fromCharCode(55296 | r >> 10, 56320 | r & 1023);
      } else if (o & 1) {
        t += String.fromCharCode((r & 31) << 6 | e[n++] & 63);
      } else {
        t += String.fromCharCode((r & 15) << 12 | (e[n++] & 63) << 6 | e[n++] & 63);
      }
    }
  };
  var DecodeUTF8;
  var EncodeUTF8;
  var RFa = function (e) {
    return e == 1 ? 3 : e < 6 ? 2 : e == 9 ? 1 : 0;
  };
  var xFa = function (e, t) {
    return t + 30 + r3(e, t + 26) + r3(e, t + 28);
  };
  var kFa = function (e, t, n) {
    var r = r3(e, t + 28);
    var o = strFromU8(e.subarray(t + 46, t + 46 + r), !(r3(e, t + 8) & 2048));
    var s = t + 46 + r;
    var i = KI(e, t + 20);
    var a = n && i == 4294967295 ? AFa(e, s) : [i, KI(e, t + 24), KI(e, t + 42)];
    var l = a[0];
    var c = a[1];
    var u = a[2];
    return [r3(e, t + 10), l, c, o, s + r3(e, t + 30) + r3(e, t + 32), u];
  };
  var AFa = function (e, t) {
    for (; r3(e, t) != 1; t += 4 + r3(e, t + 2)) {
      ;
    }
    return [G_o(e, t + 12), G_o(e, t + 4), G_o(e, t + 20)];
  };
  var HMe = function (e) {
    var t = 0;
    if (e) {
      for (var n in e) {
        var r = e[n].length;
        if (r > 65535) {
          gu(9);
        }
        t += r + 4;
      }
    }
    return t;
  };
  var _ft = function (e, t, n, r, o, s, i, a) {
    var l = r.length;
    var c = n.extra;
    var u = a && a.length;
    var d = HMe(c);
    if (Lb(e, t, i != null ? 33639248 : 67324752), t += 4, i != null) {
      e[t++] = 20;
      e[t++] = n.os;
    }
    e[t] = 20;
    t += 2;
    e[t++] = n.flag << 1 | (s < 0 && 8);
    e[t++] = o && 8;
    e[t++] = n.compression & 255;
    e[t++] = n.compression >> 8;
    var p = new Date(n.mtime == null ? Date.now() : n.mtime);
    var m = p.getFullYear() - 1980;
    if (m < 0 || m > 119) {
      gu(10);
    }
    if (Lb(e, t, m << 25 | p.getMonth() + 1 << 21 | p.getDate() << 16 | p.getHours() << 11 | p.getMinutes() << 5 | p.getSeconds() >> 1), t += 4, s != -1) {
      Lb(e, t, n.crc);
      Lb(e, t + 4, s < 0 ? -s - 2 : s);
      Lb(e, t + 8, n.size);
    }
    if (Lb(e, t + 12, l), Lb(e, t + 14, d), t += 16, i != null) {
      Lb(e, t, u);
      Lb(e, t + 6, n.attrs);
      Lb(e, t + 10, i);
      t += 14;
    }
    if (e.set(r, t), t += l, d) {
      for (var f in c) {
        var h = c[f];
        var g = h.length;
        Lb(e, t, +f);
        Lb(e, t + 2, g);
        e.set(h, t + 4);
        t += 4 + g;
      }
    }
    if (u) {
      e.set(a, t);
      t += u;
    }
    return t;
  };
  var mbo = function (e, t, n, r, o) {
    Lb(e, t, 101010256);
    Lb(e, t + 8, n);
    Lb(e, t + 10, n);
    Lb(e, t + 12, r);
    Lb(e, t + 16, o);
  };
  var ZipPassThrough;
  var ZipDeflate;
  var AsyncZipDeflate;
  var Zip;
  var UnzipPassThrough;
  var UnzipInflate;
  var AsyncUnzipInflate;
  var Unzip;
  var $4n;
  function readMcpbIgnorePatterns(e) {
    let t = lpe.join(e, ".mcpbignore");
    if (!lQ.existsSync(t)) {
      return [];
    }
    try {
      return lQ.readFileSync(t, "utf-8").split(/\r?\n/).map(r => r.trim()).filter(r => r.length > 0 && !r.startsWith("#"));
    } catch (n) {
      console.warn(`Warning: Could not read .mcpbignore file: ${n instanceof Error ? n.message : "Unknown error"}`);
      return [];
    }
  }
  function ybo(e) {
    return PFa.default().add(EXCLUDE_PATTERNS).add(e);
  }
  function shouldExclude(e, t = []) {
    return ybo(t).ignores(e);
  }
  function getAllFiles(e, t = e, n = {}, r = []) {
    let o = lQ.readdirSync(e);
    let s = ybo(r);
    for (let i of o) {
      let a = lpe.join(e, i);
      let l = lpe.relative(t, a);
      if (s.ignores(l)) {
        continue;
      }
      if (lQ.statSync(a).isDirectory()) {
        getAllFiles(a, t, n, r);
      } else {
        let u = l.split(lpe.sep).join("/");
        n[u] = lQ.readFileSync(a);
      }
    }
    return n;
  }
  function getAllFilesWithCount(e, t = e, n = {}, r = [], o = 0) {
    let s = lQ.readdirSync(e);
    let i = ybo(r);
    for (let a of s) {
      let l = lpe.join(e, a);
      let c = lpe.relative(t, l);
      if (i.ignores(c)) {
        o++;
        continue;
      }
      let u = lQ.statSync(l);
      if (u.isDirectory()) {
        o = getAllFilesWithCount(l, t, n, r, o).ignoredCount;
      } else {
        let d = c.split(lpe.sep).join("/");
        n[d] = {
          data: lQ.readFileSync(l),
          mode: u.mode
        };
      }
    }
    return {
      files: n,
      ignoredCount: o
    };
  }
  var lQ;
  var PFa;
  var lpe;
  var EXCLUDE_PATTERNS;
  var _bo = __lazy(() => {
    lQ = require("fs");
    PFa = __toESM(aWe(), 1);
    lpe = require("path");
    EXCLUDE_PATTERNS = [".DS_Store", "Thumbs.db", ".gitignore", ".git", ".mcpbignore", "*.log", ".env*", ".npm", ".npmrc", ".yarnrc", ".yarn", ".eslintrc", ".editorconfig", ".prettierrc", ".prettierignore", ".eslintignore", ".nycrc", ".babelrc", ".pnp.*", "node_modules/.cache", "node_modules/.bin", "*.map", ".env.local", ".env.*.local", "npm-debug.log*", "yarn-debug.log*", "yarn-error.log*", "package-lock.json", "yarn.lock", "*.mcpb", "*.d.ts", "*.tsbuildinfo", "tsconfig.json"];
  });