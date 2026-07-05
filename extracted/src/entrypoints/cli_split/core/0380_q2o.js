    let I = u.nestedMemoryAttachmentTriggers;
    if (I && !I.includes(t)) {
      I.push(t);
    }
    let O = {
      type: "text",
      file: {
        filePath: e,
        content: E,
        numLines: C,
        startLine: A !== undefined ? Math.max(1, o) : o,
        totalLines: y,
        ...(A !== undefined && {
          truncatedByTokenCap: true
        })
      }
    };
    if (y8e(t)) {
      dUl.set(O, S);
    }
    if (A !== undefined) {
      pUl.set(O, A);
    }
    Goe({
      operation: "read",
      tool: "FileReadTool",
      filePath: t,
      content: E
    });
    let M = WFm(t);
    let L = Qj(t);
    logEvent("tengu_session_file_read", {
      totalLines: y,
      readLines: C,
      totalBytes: _,
      readBytes: A !== undefined ? Buffer.byteLength(E, "utf8") : b,
      offset: o,
      ...(s !== undefined && {
        limit: s
      }),
      ...(L !== undefined && {
        ext: L
      }),
      ...(d !== undefined && {
        messageID: br(d)
      }),
      is_session_transcript: M === "session_transcript"
    });
    return {
      data: O
    };
  }
  async function q2o(e, t = UTe().maxTokens, n, r) {
    let o = await zt().readFileBytes(e, n);
    let s = o.length;
    if (s === 0) {
      throw new Po(`Image file is empty: ${e}`, "Image file is empty");
    }
    let i = tX(o);
    if (i === null) {
      throw new Po(`File has an image extension but its content is not a valid PNG/JPEG/GIF/WebP. Detected: ${xXi(o)}. This usually means a download saved an error/login page instead of the image. Use \`file "${e}"\` to confirm, or read it as text with ${"Bash"} (e.g. \`head -c 500\`).`, "Image extension but invalid magic bytes");
    }
    let a = i.split("/")[1] || "png";
    let l;
    try {
      let m = await GPe(o, s, a, r);
      let f = m.buffer;
      let h = m.mediaType;
      if (f.length > 512000) {
        f = await Gro(m.buffer, 512000, m.mediaType);
        h = "jpeg";
      }
      l = Krr(f, h, s, m.dimensions);
    } catch (m) {
      if (m instanceof Y2) {
        throw m;
      }
      Oe(m);
      l = Krr(o, a, s);
    }
    let c = l.file.dimensions;
    let u = c?.displayWidth;
    let d = c?.displayHeight;
    let p;
    if (u && d) {
      p = iLn(u, d);
    } else {
      let m = iGe(o);
      p = m ? iLn(m.width, m.height) : iLn(r.maxWidth, r.maxHeight);
    }
    if (p > t) {
      try {
        let m = await GXi(o, t, i);
        return {
          type: "image",
          file: {
            base64: m.base64,
            type: m.mediaType,
            originalSize: s
          }
        };
      } catch (m) {
        logForDebugging(`Image compression failed for ${e}: ${m instanceof Error ? m.message : String(m)}`, {
          level: "error"
        });
        try {
          let h = await (await ySe())(o).resize(400, 400, {
            fit: "inside",
            withoutEnlargement: true
          }).jpeg({
            quality: 20
          }).toBuffer();
          return Krr(h, "jpeg", s);
        } catch (f) {
          logForDebugging(`Fallback image compression failed for ${e}: ${f instanceof Error ? f.message : String(f)}`, {
            level: "error"
          });
          return Krr(o, a, s);
        }
      }
    }
    return l;
  }
  var Yrr;
  var O7e;
  var Jrr;
  var $Fm;
  var jFm;
  var uUl;
  var GFm;
  var VFm;
  var iy;
  var dUl;
  var pUl;
  var EXt;
  var LEe = __lazy(() => {
    Ire();
    Cgn();
    $n();
    Ot();
    Gu();
    aU();
    IV();
    T9();
    ci();
    Sl();
    vo();
    je();
    pr();
    gn();
    dt();
    Zl();
    H9n();
    cs();
    yG();
    Rn();
    sgt();
    ro();
    JF();
    J9n();
    ku();
    B2o();
    eMn();
    wm();
    rrr();
    Cmt();
    Jf();
    Zn();
    _x();
    rLn();
    VDe();
    Tm();
    aUl();
    Yrr = require("fs/promises");
    O7e = __toESM(require("path"));
    Jrr = require("path");
    $Fm = new Set(["/dev/zero", "/dev/random", "/dev/urandom", "/dev/full", "/dev/stdin", "/dev/tty", "/dev/console", "/dev/stdout", "/dev/stderr", "/dev/fd/0", "/dev/fd/1", "/dev/fd/2"]);
    jFm = String.fromCharCode(8239);
    uUl = new Set(["png", "jpg", "jpeg", "gif", "webp"]);
    GFm = we(() => v.strictObject({
      file_path: v.string().describe("The absolute path to the file to read"),
      offset: v$(v.number().int().nonnegative().optional()).describe("The line number to start reading from. Only provide if the file is too large to read at once"),
      limit: v$(v.number().int().positive().optional()).describe("The number of lines to read. Only provide if the file is too large to read at once."),
      pages: v.string().optional().describe(`Page range for PDF files (e.g., "1-5", "3", "10-20"). Only applicable to PDF files. Maximum ${20} pages per request.`)
    }));
    VFm = we(() => {
      let e = v.enum(["image/jpeg", "image/png", "image/gif", "image/webp"]);
      return v.discriminatedUnion("type", [v.object({
        type: v.literal("text"),
        file: v.object({
          filePath: v.string().describe("The path to the file that was read"),
          content: v.string().describe("The content of the file"),
          numLines: v.number().describe("Number of lines in the returned content"),
          startLine: v.number().describe("The starting line number"),
          totalLines: v.number().describe("Total number of lines in the file"),
          truncatedByTokenCap: v.boolean().optional().describe("True when a whole-file read was auto-paginated because it exceeded the token cap (the content is a partial first page). A programmatic signal for internal consumers; survives output reconstruction (unlike the render-time banner).")
        })
      }), v.object({
        type: v.literal("image"),
        file: v.object({
          base64: v.string().describe("Base64-encoded image data"),
          type: e.describe("The MIME type of the image"),
          originalSize: v.number().describe("Original file size in bytes"),
          dimensions: v.object({
            originalWidth: v.number().optional().describe("Original image width in pixels"),
            originalHeight: v.number().optional().describe("Original image height in pixels"),
            displayWidth: v.number().optional().describe("Displayed image width in pixels (after resizing)"),
            displayHeight: v.number().optional().describe("Displayed image height in pixels (after resizing)")
          }).optional().describe("Image dimension info for coordinate mapping")
        })
      }), v.object({
        type: v.literal("notebook"),
        file: v.object({
          filePath: v.string().describe("The path to the notebook file"),
          cells: v.array(v.any()).describe("Array of notebook cells")
        })
      }), v.object({
        type: v.literal("pdf"),
        file: v.object({
          filePath: v.string().describe("The path to the PDF file"),
          base64: v.string().describe("Base64-encoded PDF data"),
          originalSize: v.number().describe("Original file size in bytes")
        })
      }), v.object({
        type: v.literal("parts"),
        file: v.object({
          filePath: v.string().describe("The path to the PDF file"),
          originalSize: v.number().describe("Original file size in bytes"),
          count: v.number().describe("Number of pages extracted"),
          outputDir: v.string().describe("Directory containing extracted page images")
        })
      }), v.object({
        type: v.literal("file_unchanged"),
        file: v.object({
          filePath: v.string().describe("The path to the file")
        })
      })]);
    });
    iy = Xs({
      name: "Read",
      ruleContentField: "file_path",
      searchHint: "read files, images, PDFs, notebooks",
      maxResultSizeChars: 1 / 0,
      strict: true,
      async description() {
        return "Read a file from the local filesystem.";
      },
      async prompt({
        model: e
      }) {
        let t = UTe();
        let n = t.includeMaxSizeInPrompt ? `. Files larger than ${formatFileSize(t.maxSizeBytes)} will return an error; use offset and limit for larger files` : "";
        let r = t.targetedRangeNudge ? "- When you already know which part of the file you need, only read that part. This can be important for larger files." : "- You can optionally specify a line offset and limit (especially handy for long files), but it's recommended to read the whole file by not providing these parameters";
        return O4i(e, zFm(), n, r);
      },
      get inputSchema() {
        return GFm();
      },
      coerceInput: tUl,
      get outputSchema() {
        return VFm();
      },
      userFacingName: iUl,
      getToolUseSummary: H2o,
      getActivityDescription(e) {
        let t = H2o(e);
        return t ? `Reading ${t}` : "Reading file";
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.file_path;
      },
      isSearchOrReadCommand() {
        return {
          isSearch: false,
          isRead: true
        };
      },
      getPath({
        file_path: e
      }) {
        return e || Nt();
      },
      backfillObservableInput(e) {
        if (typeof e.file_path === "string") {
          e.file_path = us(e.file_path);
        }
      },
      async preparePermissionMatcher({
        file_path: e
      }) {
        return t => matchesPathRule(t, e);
      },
      async checkPermissions(e, t) {
        return checkReadPermissionForTool(iy, e, getToolPermissionContext(t));
      },
      renderToolUseMessage: nUl,
      renderToolUseTag: rUl,
      renderToolResultMessage: oUl,
      extractSearchText() {
        return "";
      },
      stripForStorage(e) {
        if (typeof e !== "object" || e === null) {
          return e;
        }
        switch (e.type) {
          case "text":
            if (e.file.content === "") {
              return e;
            }
            return {
              ...e,
              file: {
                ...e.file,
                content: ""
              }
            };
          case "image":
            if (e.file.base64 === "") {
              return e;
            }
            return {
              ...e,
              file: {
                ...e.file,
                base64: ""
              }
            };
          case "pdf":
            if (e.file.base64 === "") {
              return e;
            }
            return {
              ...e,
              file: {
                ...e.file,
                base64: ""
              }
            };
          case "notebook":
            {
              let {
                cells: t
              } = e.file;
              if (t.length === 0 || t[0] == null) {
                return e;
              }
              return {
                ...e,
                file: {
                  ...e.file,
                  cells: Array(t.length)
                }
              };
            }
          default:
            return e;
        }
      },
      renderToolUseErrorMessage: sUl,
      async validateInput({
        file_path: e,
        pages: t
      }, n) {
        if (t !== undefined) {
          let a = tZr(t);
          if (!a) {
            return {
              result: false,
              message: `Invalid pages parameter: "${t}". Use formats like "1-5", "3", or "10-20". Pages are 1-indexed.`,
              errorCode: 7
            };
          }
          if ((a.lastPage === 1 / 0 ? 20 + 1 : a.lastPage - a.firstPage + 1) > 20) {
            return {
              result: false,
              message: `Page range "${t}" exceeds maximum of ${20} pages per request. Please use a smaller range.`,
              errorCode: 8
            };
          }
        }
        let r = us(e);
        if (matchingRuleForInput(r, getToolPermissionContext(n), "read", "deny") !== null) {
          return {
            result: false,
            message: "File is in a directory that is denied by your permission settings.",
            errorCode: 1
          };
        }
        if (r.startsWith("\\\\") || r.startsWith("//")) {
          return {
            result: true
          };
        }
        let i = O7e.extname(r).toLowerCase();
        if (YDt(r) && !ylt(i) && !uUl.vZc(i.slice(1))) {
          return {
            result: false,
            message: `This tool cannot read binary files. The file appears to be a binary ${i} file. Please use appropriate tools for binary file analysis.`,
            errorCode: 4
          };
        }
        if (HFm(r)) {
          return {
            result: false,
            message: `Cannot read '${e}': this device file would block or produce infinite output.`,
            errorCode: 9
          };
        }
        return {
          result: true
        };
      },
      async call({
        file_path: e,
        offset: t = 1,
        limit: n = undefined,
        pages: r
      }, o, s, i) {
        let {
          readFileState: a,
          fileReadingLimits: l
        } = o;
        let c = UTe();
        let u = l?.maxSizeBytes ?? c.maxSizeBytes;
        let d = l?.maxTokens ?? c.maxTokens;
        if (l !== undefined) {
          logEvent("tengu_file_read_limits_override", {
            hasMaxTokens: l.maxTokens !== undefined,
            hasMaxSizeBytes: l.maxSizeBytes !== undefined
          });
        }
        let p = O7e.extname(e).toLowerCase().slice(1);
        let m = us(e);
        let f = a.get(m);
        if (f) {
          logEvent("tengu_file_read_reread", {
            priorOp: f.offset === undefined ? "edit_write" : "read"
          });
        }
        let g = getFeatureValue_CACHED_MAY_BE_STALE("tengu_read_dedup_killswitch", false) ? undefined : a.get(m);
        if (g && !g.isPartialView && g.offset !== undefined) {
          if (g.offset === t && g.limit === n) {
            try {
              if ((await aje(m)) === g.timestamp) {
                let S = Qj(m);
                logEvent("tengu_file_read_dedup", {
                  ...(S !== undefined && {
                    ext: S
                  })
                });
                return {
                  data: {
                    type: "file_unchanged",
                    file: {
                      filePath: e
                    }
                  }
                };
              }
            } catch {}
          }
        }
        let y = Nt();
        if (!Me.CLAUDE_CODE_SIMPLE) {
          let _ = await Vht([m], y);
          if (_.length > 0) {
            let b = o.dynamicSkillDirTriggers;
            if (b) {
              for (let S of _) {
                if (!b.includes(S)) {
                  b.push(S);
                }
              }
            }
            INe(_).catch(() => {});
          }
          zht([m], y);
        }
        try {
          return await cUl(e, m, m, p, t, n, r, u, d, a, o, i?.message.id);
        } catch (_) {
          if (en(_) === "ENOENT") {
            let S = qFm(m);
            if (S) {
              try {
                return await cUl(e, m, S, p, t, n, r, u, d, a, o, i?.message.id);
              } catch (A) {
                if (!fn(A)) {
                  throw A;
                }
              }
            }
            let E = vke(m);
            let C = await oY(m);
            let x = `File does not exist. ${"Note: your current working directory is"} ${Nt()}.`;
            if (C) {
              x += ` Did you mean ${C}?`;
            } else if (E) {
              x += ` Did you mean ${E}?`;
            }
            throw new Po(x, "File does not exist");
          }
          throw _;
        }
      },
      mapToolResultToToolResultBlockParam(e, t) {
        switch (e.type) {
          case "image":
            return {
              tool_use_id: t,
              type: "tool_result",
              content: [{
                type: "image",
                source: {
                  type: "base64",
                  data: e.file.base64,
                  media_type: e.file.type
                }
              }]
            };
          case "notebook":
            return k6a(e.file.cells, t);
          case "pdf":
            return {
              tool_use_id: t,
              type: "tool_result",
              content: `PDF file read: ${e.file.filePath} (${formatFileSize(e.file.originalSize)})`
            };
          case "parts":
            return {
              tool_use_id: t,
              type: "tool_result",
              content: `PDF pages extracted: ${e.file.count} page(s) from ${e.file.filePath} (${formatFileSize(e.file.originalSize)})`
            };
          case "file_unchanged":
            return {
              tool_use_id: t,
              type: "tool_result",
              content: x4i()
            };
          case "text":
            {
              let n;
              if (e.file.content) {
                let r = pUl.get(e);
                if (r !== undefined) {
                  if (EXt.size >= 512) {
                    let o = EXt.keys().next().value;
                    if (o !== undefined) {
                      EXt.delete(o);
                    }
                  }
                  EXt.set(t, r);
                } else {
                  r = EXt.get(t);
                }
                n = (r ? `<system-reminder>${r}</system-reminder>

` : "") + JFm(e) + KFm(e.file);
              } else {
                n = e.file.totalLines === 0 ? "<system-reminder>Warning: the file exists but the contents are empty.</system-reminder>" : `<system-reminder>Warning: the file exists but is shorter than the provided offset (${e.file.startLine}). The file has ${e.file.totalLines} lines.</system-reminder>`;
              }
              return {
                tool_use_id: t,
                type: "tool_result",
                content: n
              };
            }
        }
      }
    });
    dUl = new WeakMap();
    pUl = new WeakMap();
    EXt = new Map();
  });
  function Xrr(e, t) {
    let n = e ? t[e] : undefined;
    let r = RS(n) ? n : undefined;
    let o = !r && za(n) ? n : undefined;
    return {
      teammate: r,
      localAgent: o
    };
  }
  function hUl({
    viewingAgentTaskId: e,
    tasks: t,
    transcripts: n,
    mainIsBusy: r,
    mainConversationId: o
  }) {
    let {
      teammate: s,
      localAgent: i
    } = Xrr(e, t);
    let a = s ?? i;
    if (!a || !e) {
      let c = n[mainAgentId()];
      return {
        task: undefined,
        isMain: true,
        isTeammate: false,
        messages: c?.messages ?? mUl,
        inProgressToolUseIDs: c?.inProgressToolUseIDs ?? fUl,
        conversationKey: o,
        isLoading: r
      };
    }
    let l = n[e];
    return {
      task: a,
      isMain: false,
      isTeammate: !!s,
      messages: l?.messages ?? mUl,
      inProgressToolUseIDs: l?.inProgressToolUseIDs ?? fUl,
      conversationKey: e,
      isLoading: a.status === "running" && !a.isIdle
    };
  }
  var mUl;
  var fUl;
  var W2o = __lazy(() => {
    at();
    ry();
    mUl = [];
    fUl = new Set();
  });
  function kFe(e) {
    return Xrr(e.viewingAgentTaskId, e.tasks).teammate;
  }
  function vXt(e) {
    let {
      teammate: t,
      localAgent: n
    } = Xrr(e.viewingAgentTaskId, e.tasks);
    if (t) {
      return {
        type: "viewed",
        task: t
      };
    }
    if (n) {
      return {
        type: "named_agent",
        task: n
      };
    }
    return {
      type: "leader"
    };
  }
  var wXt = __lazy(() => {
    W2o();
  });
  function D7e(e) {
    return e.type === "image" && e.content.length > 0;
  }
  function gUl(e) {
    if (!e) {
      return;
    }
    let t = Object.values(e).filter(D7e).map(n => n.id);
    return t.length > 0 ? t : undefined;
  }
  function yUl(e, t, n) {
    let r = new Set();
    let o = 0;
    let s = 0;
    for (let d of t) {
      if (d.type !== "attachment") {
        continue;
      }
      if (o++, d.attachment.type !== "mcp_instructions_delta") {
        continue;
      }
      s++;
      for (let p of d.attachment.addedNames) {
        r.add(p);
      }
      for (let p of d.attachment.removedNames) {
        r.delete(p);
      }
    }
    let i = e.filter(d => d.type === "connected");
    let a = new Set(i.map(d => d.name));
    let l = new Map();
    for (let d of i) {
      if (d.instructions) {
        l.set(d.name, `## ${d.name}
${d.instructions}`);
      }
    }
    for (let d of n) {
      if (!a.vZc(d.serverName)) {
        continue;
      }
      let p = l.get(d.serverName);
      l.set(d.serverName, p ? `${p}

${d.block}` : `## ${d.serverName}
${d.block}`);
    }
    let c = [];
    for (let [d, p] of l) {
      if (!r.vZc(d)) {
        c.push({
          name: d,
          block: p
        });
      }
    }
    let u = [];
    for (let d of r) {
      if (!a.vZc(d)) {
        u.push(d);
      }
    }
    if (c.length === 0 && u.length === 0) {
      return null;
    }
    logEvent("tengu_mcp_instructions_pool_change", {
      addedCount: c.length,
      removedCount: u.length,
      priorAnnouncedCount: r.size,
      clientSideCount: n.length,
      messagesLength: t.length,
      attachmentCount: o,
      midCount: s
    });
    c.sort((d, p) => d.name.localeCompare(p.name));
    return {
      addedNames: c.map(d => d.name),
      addedBlocks: c.map(d => d.block),
      removedNames: u.sort()
    };
  }
  var _Ul = __lazy(() => {
    Ot();
  });
  function V2o() {
    return G2o;
  }
  var G2o;
  var bUl = `**IMPORTANT: If the Chrome browser tools are deferred (must be loaded via ToolSearch before use), load them with ToolSearch before calling them, and batch every tool you expect to need into ONE ToolSearch call (the select query accepts a comma-separated list). Do NOT load tools one at a time; each separate ToolSearch call wastes a full round-trip.**

Start a browser task whose tools are not yet loaded with a single call loading the core set:

ToolSearch with query "select:mcp__claude-in-chrome__tabs_context_mcp,mcp__claude-in-chrome__navigate,mcp__claude-in-chrome__computer,mcp__claude-in-chrome__read_page,mcp__claude-in-chrome__tabs_create_mcp"

Add task-specific tools to the same call when the task obviously needs them: read_console_messages / read_network_requests for debugging, form_input for forms, gif_creator for recordings, javascript_tool for page scripting. Only issue a second ToolSearch if the task later needs a tool you did not anticipate.`;
  var Qrr = __lazy(() => {
    G2o = `# Claude in Chrome browser automation

You have access to browser automation tools (mcp__claude-in-chrome__*) for interacting with web pages in Chrome. Follow these guidelines for effective browser automation.

## Loading deferred tools

If the mcp__claude-in-chrome__* tools are deferred (must be loaded via ToolSearch before use), load every tool you expect to need in ONE ToolSearch call \u2014 the select query accepts a comma-separated list \u2014 never one call per tool. Start with the core set:

${'ToolSearch with query "select:mcp__claude-in-chrome__tabs_context_mcp,mcp__claude-in-chrome__navigate,mcp__claude-in-chrome__computer,mcp__claude-in-chrome__read_page,mcp__claude-in-chrome__tabs_create_mcp"'}

${"Add task-specific tools to the same call when the task obviously needs them: read_console_messages / read_network_requests for debugging, form_input for forms, gif_creator for recordings, javascript_tool for page scripting."}

## GIF recording

When performing multi-step browser interactions that the user may want to review or share, use mcp__claude-in-chrome__gif_creator to record them.

You must ALWAYS:
* Capture extra frames before and after taking actions to ensure smooth playback
* Name the file meaningfully to help the user identify it later (e.g., "login_process.gif")

## Console log debugging

You can use mcp__claude-in-chrome__read_console_messages to read console output. Console output may be verbose. If you are looking for specific log entries, use the 'pattern' parameter with a regex-compatible pattern. This filters results efficiently and avoids overwhelming output. For example, use pattern: "[MyApp]" to filter for application-specific logs rather than reading all console output.

## Alerts and dialogs

IMPORTANT: Do not trigger JavaScript alerts, confirms, prompts, or browser modal dialogs through your actions. These browser dialogs block all further browser events and will prevent the extension from receiving any subsequent commands. Instead, when possible, use console.log for debugging and then use the mcp__claude-in-chrome__read_console_messages tool to read those log messages. If a page has dialog-triggering elements:
1. Avoid clicking buttons or links that may trigger alerts (e.g., "Delete" buttons with confirmation dialogs)
2. If you must interact with such elements, warn the user first that this may interrupt the session
3. Use mcp__claude-in-chrome__javascript_tool to check for and dismiss any existing dialogs before proceeding

If you accidentally trigger a dialog and lose responsiveness, inform the user they need to manually dismiss it in the browser.

## Avoid rabbit holes and loops

When using browser automation tools, stay focused on the specific task. If you encounter any of the following, stop and ask the user for guidance:
- Unexpected complexity or tangential browser exploration
- Browser tool calls failing or returning errors after 2-3 attempts
- No response from the browser extension
- Page elements not responding to clicks or input
- Pages not loading or timing out
- Unable to complete the browser task despite multiple approaches

Explain what you attempted, what went wrong, and ask how the user would like to proceed. Do not keep retrying the same failing browser action or explore unrelated pages without checking in first.

## Tab context and session startup

IMPORTANT: At the start of each browser automation session, call mcp__claude-in-chrome__tabs_context_mcp first to get information about the user's current browser tabs. Use this context to understand what the user might want to work with before creating new tabs.

Never reuse tab IDs from a previous/other session. Follow these guidelines:
1. Only reuse an existing tab if the user explicitly asks to work with it
2. Otherwise, create a new tab with mcp__claude-in-chrome__tabs_create_mcp
3. If a tool returns an error indicating the tab doesn't exist or is invalid, call tabs_context_mcp to get fresh tab IDs
4. When a tab is closed by the user or a navigation error occurs, call tabs_context_mcp to see what tabs are available`;
  });
  var SUl = `You have a computer-use MCP available (tools named \`mcp__computer-use__*\`). It lets you take screenshots of the user's desktop and control it with mouse clicks, keyboard input, and scrolling.

**Pick the right tool for the app.** Each tier trades speed/precision against coverage:

1. **Dedicated MCP for the app** \u2014 if the task is in an app that has its own MCP (Slack, Gmail, Calendar, Linear, etc.) and that MCP is connected, use it. API-backed tools are fast and precise.
2. **Chrome MCP** (\`mcp__claude-in-chrome__*\`) \u2014 if the target is a web app and there's no dedicated MCP for it, use the browser tools. DOM-aware, much faster than clicking pixels. If the Chrome extension isn't connected, ask the user to install it rather than falling through to computer use.
3. **Computer use** \u2014 for native desktop apps (Maps, Notes, Finder, Photos, System Settings, any third-party native app) and cross-app workflows. Computer use IS the right tool here \u2014 don't decline a native-app task just because there's no dedicated MCP for it.

This is about what's available, not error handling \u2014 if a dedicated MCP tool errors, debug or report it rather than silently retrying via a slower tier.

**Look before you assert.** If the user asks about app state (what's open, what's connected, what an app can do), take a screenshot and check before answering. Don't answer from memory \u2014 the user's setup or app version may differ from what you expect. If you're about to say an app doesn't support an action, that claim should be grounded in what you just saw on screen, not general knowledge. Similarly, \`list_granted_applications\` or a fresh \`screenshot\` is cheaper than a wrong assertion about what's running.

**Loading via ToolSearch \u2014 load in bulk, not one-by-one:** if computer-use tools are in the deferred list, load them ALL in a single ToolSearch call: \`{ query: "computer-use", max_results: 30 }\`. The keyword search matches the server-name substring in every tool name, so one query returns the entire toolkit. Don't use \`select:\` for individual tools \u2014 that's one round-trip per tool.

**Access flow:** before any computer-use action you must call \`request_access\` with the list of applications you need. The user approves each application explicitly, and you may need to call it again mid-task if you discover you need another application.

**Tiered apps:** some apps are granted at a restricted tier based on their category \u2014 the tier is displayed in the approval dialog and returned in the \`request_access\` response:
- **Browsers** (Safari, Chrome, Firefox, Edge, Arc, etc.) \u2192 tier **"read"**: visible in screenshots, but clicks and typing are blocked. You can read what's already on screen. For navigation, clicking, or form-filling, use the claude-in-chrome MCP (tools named \`mcp__claude-in-chrome__*\`; load via ToolSearch if deferred).
- **Terminals and IDEs** (Terminal, iTerm, VS Code, JetBrains, etc.) \u2192 tier **"click"**: visible and left-clickable, but typing, key presses, right-click, modifier-clicks, and drag-drop are blocked. You can click a Run button or scroll test output, but cannot type into the editor or integrated terminal, cannot right-click (the context menu has Paste), and cannot drag text onto them. For shell commands, use the Bash tool.
- **Everything else** \u2192 tier **"full"**: no restrictions.

The tier is enforced by the frontmost-app check: if a tier-"read" app is in front, \`left_click\` returns an error; if a tier-"click" app is in front, \`type\` and \`right_click\` return errors. The error tells you what tier the app has and what to do instead. \`open_application\` works at any tier \u2014 bringing an app forward is a read-level operation.

**Link safety \u2014 treat links in emails and messages as suspicious by default.**
- **Never click web links with computer-use tools.** If you encounter a link in a native app (Mail, Messages, a PDF, etc.), do NOT \`left_click\` it. Open the URL via the claude-in-chrome MCP instead.
- **See the full URL before following any link.** Visible link text can be misleading \u2014 hover or inspect to get the real destination.
- **Links from emails, messages, or unknown-sender documents are suspicious by default.** If the destination URL is at all unfamiliar or looks off, ask the user for confirmation before proceeding.
- **Inside the Chrome extension** you can click links with the extension's tools, but the suspicion check still applies \u2014 verify unfamiliar URLs with the user.

**Financial actions - do not execute trades or move money.** Budgeting and accounting apps (Quicken, YNAB, QuickBooks, etc.) are granted at full tier so you can categorize transactions, generate reports, and help the user organize their finances. But never execute a trade, place an order, send money, or initiate a transfer on the user's behalf - always ask the user to perform those actions themselves.`;
  function Zrr(e) {
    if (XFm.includes(e)) {
      return true;
    }
    return TUl && HOOK_EVENTS.includes(e);
  }
  function eor(e, t, n) {
    if (!Zrr(n)) {
      return;
    }
    vw({
      type: "system",
      subtype: "hook_started",
      hook_id: e,
      hook_name: t,
      hook_event: n
    });
  }
  function QFm(e) {
    if (!Zrr(e.hookEvent)) {
      return;
    }
    vw({
      type: "system",
      subtype: "hook_progress",
      hook_id: e.hookId,
      hook_name: e.hookName,
      hook_event: e.hookEvent,
      stdout: e.stdout,
      stderr: e.stderr,
      output: e.output
    });
  }
  function tor(e) {
    if (!Zrr(e.hookEvent)) {
      return () => {};
    }
    let t = "";
    let n = setInterval(() => {
      e.getOutput().then(({
        stdout: r,
        stderr: o,
        output: s
      }) => {
        if (s === t) {
          return;
        }
        t = s;
        QFm({
          hookId: e.hookId,
          hookName: e.hookName,
          hookEvent: e.hookEvent,
          stdout: r,
          stderr: o,
          output: s
        });
      });
    }, e.intervalMs ?? 1000);
    n.unref();
    return () => clearInterval(n);
  }
  function L0(e) {
    let t = e.stdout || e.stderr || e.output;
    if (t) {
      logForDebugging(`Hook ${e.hookName} (${e.hookEvent}) ${e.outcome}:
${t}`);
    }
    if (!Zrr(e.hookEvent)) {
      return;
    }
    vw({
      type: "system",
      subtype: "hook_response",
      hook_id: e.hookId,
      hook_name: e.hookName,
      hook_event: e.hookEvent,
      output: e.output,
      stdout: e.stdout,
      stderr: e.stderr,
      ...(e.exitCode !== undefined && {
        exit_code: e.exitCode
      }),
      outcome: e.outcome
    });
  }
  function EUl(e) {
    TUl = e;
  }
  var XFm;
  var TUl = false;
  var nor = __lazy(() => {
    hyn();
    je();
    XFm = ["SessionStart", "Setup"];
  });
  function vUl({
    processId: e,
    hookId: t,
    asyncResponse: n,
    hookName: r,
    hookEvent: o,
    command: s,
    shellCommand: i,
    toolName: a,
    pluginId: l
  }) {
    let c = n.asyncTimeout || 15000;
    logForDebugging(`Hooks: Registering async hook ${e} (${r}) with timeout ${c}ms`);
    let u = tor({
      hookId: t,
      hookName: r,
      hookEvent: o,
      getOutput: async () => {
        let d = mfe.get(e)?.shellCommand?.taskOutput;
        if (!d) {
          return {
            stdout: "",
            stderr: "",
            output: ""
          };
        }
        let p = await d.getStdout();
        let m = d.getStderr();
        return {
          stdout: p,
          stderr: m,
          output: p + m
        };
      }
    });
    mfe.set(e, {
      processId: e,
      hookId: t,
      hookName: r,
      hookEvent: o,
      toolName: a,
      pluginId: l,
      command: s,
      startTime: Date.now(),
      timeout: c,
      responseAttachmentSent: false,
      shellCommand: i,
      stopProgressInterval: u
    });
  }
  async function z2o(e, t, n) {
    e.stopProgressInterval();
    let r = e.shellCommand?.taskOutput;
    let o = r ? await r.getStdout() : "";
    let s = r?.getStderr() ?? "";
    e.shellCommand?.cleanup();
    L0({
      hookId: e.hookId,
      hookName: e.hookName,
      hookEvent: e.hookEvent,
      output: o + s,
      stdout: o,
      stderr: s,
      exitCode: t,
      outcome: n
    });
  }
  async function wUl() {
    let e = [];
    let t = mfe.size;
    logForDebugging(`Hooks: Found ${t} total hooks in registry`);
    let n = Array.from(mfe.values());
    let r = await Promise.allSettled(n.map(async s => {
      let i = (await s.shellCommand?.taskOutput.getStdout()) ?? "";
      let a = s.shellCommand?.taskOutput.getStderr() ?? "";
      if (logForDebugging(`Hooks: Checking hook ${s.processId} (${s.hookName}) - attachmentSent: ${s.responseAttachmentSent}, stdout length: ${i.length}`), !s.shellCommand) {
        logForDebugging(`Hooks: Hook ${s.processId} has no shell command, removing from registry`);
        s.stopProgressInterval();
        return {
          type: "remove",
          processId: s.processId
        };
      }
      if (logForDebugging(`Hooks: Hook shell status ${s.shellCommand.status}`), s.shellCommand.status === "killed") {
        logForDebugging(`Hooks: Hook ${s.processId} is ${s.shellCommand.status}, removing from registry`);
        s.stopProgressInterval();
        s.shellCommand.cleanup();
        return {
          type: "remove",
          processId: s.processId
        };
      }
      if (s.shellCommand.status !== "completed") {
        return {
          type: "skip"
        };
      }
      if (s.responseAttachmentSent) {
        logForDebugging(`Hooks: Skipping hook ${s.processId} - already delivered`);
        s.stopProgressInterval();
        return {
          type: "remove",
          processId: s.processId
        };
      }
      let l = i.split(`
`);
      logForDebugging(`Hooks: Processing ${l.length} lines of stdout for ${s.processId}`);
      let u = (await s.shellCommand.result).code;
      let d = {};
      for (let p of l) {
        if (p.trim().startsWith("{")) {
          logForDebugging(`Hooks: Found JSON line: ${p.trim().substring(0, 100)}...`);
          try {
            let m = qt(p.trim());
            if (!("async" in m)) {
              logForDebugging(`Hooks: Found sync response from ${s.processId}: ${De(m)}`);
              d = m;
              break;
            }
          } catch {
            logForDebugging(`Hooks: Failed to parse JSON from ${s.processId}: ${p.trim()}`);
          }
        }
      }
      if (s.responseAttachmentSent = true, await z2o(s, u, u === 0 ? "success" : "error"), Object.keys(d).length === 0 && u === 0 && !a.trim()) {
        logForDebugging(`Hooks: ${s.processId} (${s.hookName}) produced no response payload \u2014 skipping attachment`);
        return {
          type: "remove",
          processId: s.processId,
          isSessionStart: s.hookEvent === "SessionStart"
        };
      }
      return {
        type: "response",
        processId: s.processId,
        isSessionStart: s.hookEvent === "SessionStart",
        payload: {
          processId: s.processId,
          response: d,
          hookName: s.hookName,
          hookEvent: s.hookEvent,
          toolName: s.toolName,
          pluginId: s.pluginId,
          stdout: i,
          stderr: a,
          exitCode: u
        }
      };
    }));
    let o = false;
    for (let s of r) {
      if (s.status !== "fulfilled") {
        logForDebugging(`Hooks: checkForAsyncHookResponses callback rejected: ${s.reason}`, {
          level: "error"
        });
        continue;
      }
      let i = s.value;
      if (i.type === "remove") {
        if (mfe.delete(i.processId), "isSessionStart" in i && i.isSessionStart) {
          o = true;
        }
      } else if (i.type === "response") {
        if (e.push(i.payload), mfe.delete(i.processId), i.isSessionStart) {
          o = true;
        }
      }
    }
    if (o) {
      logForDebugging("Invalidating session env cache after SessionStart hook completed");
      Rpt();
    }
    logForDebugging(`Hooks: checkForNewResponses returning ${e.length} responses`);
    return e;
  }
  function CUl(e) {
    for (let t of e) {
      let n = mfe.get(t);
      if (n && n.responseAttachmentSent) {
        logForDebugging(`Hooks: Removing delivered hook ${t}`);
        n.stopProgressInterval();
        mfe.delete(t);
      }
    }
  }
  async function K2o() {
    let e = Array.from(mfe.values());
    await Promise.all(e.map(async t => {
      if (t.shellCommand?.status === "completed") {
        let n = await t.shellCommand.result;
        await z2o(t, n.code, n.code === 0 ? "success" : "error");
      } else {
        if (t.shellCommand && t.shellCommand.status !== "killed") {
          t.shellCommand.kill();
        }
        await z2o(t, 1, "cancelled");
      }
    }));
    mfe.clear();
  }
  var mfe;
  var ror = __lazy(() => {
    je();
    K9e();
    nor();
    mfe = new Map();
  });
  function Y2o(e, t) {
    if (!new RegExp(t, "i").test(e)) {
      return [];
    }
    if (e.startsWith("/")) {
      return [];
    }
    let r = [];
    let o = null;
    let s = 0;
    let i = u => !!u && /[\p{L}\p{N}_]/u.test(u);
    for (let u = 0; u < e.length; u++) {
      let d = e[u];
      if (o) {
        if (o === "[" && d === "[") {
          s = u;
          continue;
        }
        if (d !== RUl[o]) {
          continue;
        }
        if (o === "'" && i(e[u + 1])) {
          continue;
        }
        r.push({
          start: s,
          end: u + 1
        });
        o = null;
      } else if (d === "<" && u + 1 < e.length && /[a-zA-Z/]/.test(e[u + 1]) || d === "'" && !i(e[u - 1]) || d !== "<" && d !== "'" && d in RUl) {
        o = d;
        s = u;
      }
    }
    let a = [];
    let l = new RegExp(`\\b${t}\\b`, "gi");
    let c = e.matchAll(l);
    for (let u of c) {
      if (u.index === undefined) {
        continue;
      }
      let d = u.index;
      let p = d + u[0].length;
      if (r.some(h => d >= h.start && d < h.end)) {
        continue;
      }
      let m = e[d - 1];
      let f = e[p];
      if (m === "/" || m === "\\" || m === "-") {
        continue;
      }
      if (f === "/" || f === "\\" || f === "-" || f === "?") {
        continue;
      }
      if (f === "." && i(e[p + 1])) {
        continue;
      }
      a.push({
        word: u[0],
        start: d,
        end: p
      });
    }
    return a;
  }
  function oor(e) {
    return Y2o(e, "ultraplan");
  }
  function xUl(e) {
    return Y2o(e, "ultrareview");
  }
  function J2o(e) {
    return Y2o(e, "ultracode");
  }
  function kUl(e) {
    return oor(e).length > 0;
  }
  function AUl(e) {
    return J2o(e).length > 0;
  }
  function sor(e) {
    let [t] = oor(e);
    if (!t) {
      return e;
    }
    let n = e.slice(0, t.start);
    let r = e.slice(t.end);
    if (!(n + r).trim()) {
      return "";
    }
    n = n.replace(/\b(a)n(\s+)$/i, "$1$2");
    return n + t.word.slice(5) + r;
  }
  var RUl;
  var CXt = __lazy(() => {
    RUl = {
      "`": "`",
      '"': '"',
      "<": ">",
      "{": "}",
      "[": "]",
      "(": ")",
      "'": "'"
    };
  });
  function tUm(e) {
    return e.map(t => {
      let n = t.chunk.slice(0, 300).replace(/\s+/g, " ").trim();
      return `- {id: "${t.id}", source: ${t.source}} ${t.title}: ${n}${t.chunk.length > 300 ? "\u2026" : ""}`;
    }).join(`
`);
  }
  async function IUl(e, t, n, r, o = new Set(), s = Promise.resolve([])) {
    n.lastUsage = null;
    let i = {
      type: "ephemeral"
    };
    let a = uga(n, t) ?? (await orr(t, r).then(y => y.length > 0 && !r.aborted ? dga(n, t, y, srr(y), i) : undefined));
    let c = (await Promise.race([s, sleep(3500, r, {
      unref: true
    }).then(() => [])])).filter(y => !o.vZc(y.url || `aki:${y.id}`));
    if (c.length === 0 && (!a || a.memories.every(y => o.vZc(y.filePath)))) {
      if (!r.aborted) {
        Et("memory_recall_select", a ? "all_surfaced" : "no_candidates");
      }
      return {
        memories: [],
        knowledge: []
      };
    }
    let u = a?.messages ?? [{
      role: "user",
      content: [{
        type: "text",
        text: `Available memories:
(none \u2014 this session has no local memory files yet)`,
        ...(i && {
          cache_control: i
        })
      }]
    }];
    let d = new Map((a?.memories ?? []).map(y => [y.filename, y]));
    let {
      selectedMemories: p,
      selectedKnowledgeIds: m
    } = await oUm(e, t, n, u, d, i, r, c);
    let f = new Map(c.map(y => [y.id, y]));
    let h = Ro(m).map(y => f.get(y)).filter(y => y !== undefined).slice(0, 3);
    return {
      memories: p.map(y => d.get(y)).filter(y => y !== undefined && !o.vZc(y.filePath)).map(y => ({
        path: y.filePath,
        mtimeMs: y.mtimeMs
      })),
      knowledge: h
    };
  }
  async function oUm(e, t, n, r, o, s, i, a) {
    let l = a.length > 0 ? `

Knowledge-index results for this query (select by id):
${tUm(a)}` : "";
    let c = `Select memories relevant to:
${e}${l}`;
    let u = a.length > 0 ? `Select memories relevant to:
${e}

(${a.length} knowledge-index results were offered for this query)` : c;
    let d = {
      selectedMemories: [],
      selectedKnowledgeIds: []
    };
    try {
      let p = await BU({
        model: getDefaultSonnetModel(),
        system: [{
          type: "text",
          text: rUm,
          cache_control: s
        }],
        skipSystemPromptPrefix: true,
        messages: [...r, {
          role: "user",
          content: [{
            type: "text",
            text: c,
            cache_control: s
          }]
        }],
        max_tokens: 256,
        output_format: {
          type: "json_schema",
          schema: {
            type: "object",
            properties: {
              selected_memories: {
                type: "array",
                items: {
                  type: "string"
                }
              },
              selected_knowledge_ids: {
                type: "array",
                items: {
                  type: "string"
                }
              }
            },
            required: ["selected_memories"],
            additionalProperties: false
          }
        },
        signal: i,
        querySource: "memdir_relevance"
      });
      let m = p.content.find(h => h.type === "text");
      if (!m || m.type !== "text") {
        return d;
      }
      let f = qt(aW(m.text));
      pga(n, t, u, m.text);
      n.lastUsage = {
        cacheReadInputTokens: p.usage.cache_read_input_tokens ?? 0,
        cacheCreationInputTokens: p.usage.cache_creation_input_tokens ?? 0,
        turnCount: (r.length + 1) / 2
      };
      Pe("memory_recall_select");
      return {
        selectedMemories: f.selected_memories.filter(h => o.vZc(h)),
        selectedKnowledgeIds: f.selected_knowledge_ids ?? []
      };
    } catch (p) {
      if (n.lastUsage = null, i.aborted) {
        return d;
      }
      Et("memory_recall_select", "memory_recall_select_query_failed");
      logForDebugging(`[memdir] selectRelevantMemories failed: ${he(p)}`, {
        level: "warn"
      });
      return d;
    }
  }
  var rUm;
  var PUl = __lazy(() => {
    ln();
    je();
    dt();
    Gd();
    Eo();
    xme();
    IBo();
    rUm = `You are selecting memories that will be useful to Claude Code as it processes a user's query. The first message lists the available memory files with their filenames and descriptions; subsequent messages each contain one user query.

Return a list of filenames for the memories that will clearly be useful to Claude Code as it processes the user's query (up to 5). Only include memories that you are certain will be helpful based on their name and description.
- If you are unsure if a memory will be useful in processing the user's query, then do not include it in your list. Be selective and discerning.
- If there are no memories in the list that would clearly be useful, feel free to return an empty list.
- Be especially conservative with user-profile and project-overview memories ([user], [project]). These describe the user's ongoing focus, not what every question is about. A profile saying "works on DB performance" is NOT relevant to a question that merely contains the word "performance" unless the question is actually about that DB work. Match on what the question IS ABOUT, not on surface keyword overlap with who the user is.
- Do not re-select memories you already returned for an earlier query in this conversation.${""}
`;
  });
  var tBl = {};