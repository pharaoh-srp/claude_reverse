  __export(vIl, {
    uploadBriefAttachment: () => uploadBriefAttachment,
    escapeContentDispositionFilename: () => escapeContentDispositionFilename
  });
  function UPm(e) {
    let t = ztr.extname(e).toLowerCase();
    return FPm[t] ?? "application/octet-stream";
  }
  function escapeContentDispositionFilename(e) {
    return e.replace(/[\r\n]/g, "").replaceAll("\\", "\\\\").replaceAll('"', "\\\"");
  }
  function t7e(e) {
    logForDebugging(`[brief:upload] ${e}`);
  }
  function BPm() {
    return getBridgeBaseUrlOverride() ?? process.env.ANTHROPIC_BASE_URL ?? getOauthConfig().BASE_API_URL;
  }
  async function uploadBriefAttachment(e, t, n) {
    if (!n.replBridgeEnabled) {
      return;
    }
    if (t > 31457280) {
      t7e(`skip ${e}: ${t} bytes exceeds ${31457280} limit`);
      Et("bridge_attachment_upload", "too_large");
      return;
    }
    let r = getBridgeAccessToken();
    if (!r) {
      t7e("skip: no oauth token");
      Et("bridge_attachment_upload", "no_token");
      return;
    }
    let o;
    try {
      o = await TIl.readFile(e);
    } catch (d) {
      t7e(`read failed for ${e}: ${d}`);
      Et("bridge_attachment_upload", "read_failed");
      return;
    }
    let i = `${BPm()}/api/oauth/file_upload`;
    let a = ztr.basename(e);
    let l = UPm(a);
    let c = `----FormBoundary${SIl.randomUUID()}`;
    let u = Buffer.concat([Buffer.from(`--${c}\r
Content-Disposition: form-data; name="file"; filename="${escapeContentDispositionFilename(a)}"\r
Content-Type: ${l}\r
\r
`), o, Buffer.from(`\r
--${c}--\r
`)]);
    try {
      let d = await NP.post(i, u, {
        headers: {
          Authorization: `Bearer ${r}`,
          "Content-Type": `multipart/form-data; boundary=${c}`,
          "Content-Length": u.length.toString()
        },
        timeout: 30000,
        signal: n.signal,
        validateStatus: () => true
      });
      if (d.status !== 201) {
        t7e(`upload failed for ${e}: status=${d.status} body=${De(d.data).slice(0, 200)}`);
        let m = d.status;
        let f = m === 401 ? "http_401" : m === 403 ? "http_403" : m === 413 ? "http_413" : m >= 500 ? "http_5xx" : m >= 400 ? "http_4xx" : "http_other";
        Et("bridge_attachment_upload", f);
        return;
      }
      let p = $Pm().safeParse(d.data);
      if (!p.success) {
        t7e(`unexpected response shape for ${e}: ${p.error.message}`);
        Et("bridge_attachment_upload", "bad_response");
        return;
      }
      t7e(`uploaded ${e} \u2192 ${p.data.file_uuid} (${t} bytes)`);
      Pe("bridge_attachment_upload");
      return p.data.file_uuid;
    } catch (d) {
      t7e(`upload threw for ${e}: ${d}`);
      Et("bridge_attachment_upload", NP.isCancel(d) ? "aborted" : "network_error");
      return;
    }
  }
  var SIl;
  var TIl;
  var ztr;
  var FPm;
  var $Pm;
  var wIl = __lazy(() => {
    Dp();
    wZ();
    Uc();
    ln();
    je();
    SIl = require("crypto");
    TIl = require("fs/promises");
    ztr = require("path");
    FPm = {
      ".png": "image/png",
      ".jpg": "image/jpeg",
      ".jpeg": "image/jpeg",
      ".gif": "image/gif",
      ".webp": "image/webp"
    };
    $Pm = we(() => v.object({
      file_uuid: v.string()
    }));
  });
  function CIl(e) {
    return jPm[oFe.extname(e).toLowerCase()];
  }
  function RIl(e) {
    return typeof e !== "string";
  }
  async function qPm(e, t, n) {
    let r = await oY(t);
    if (r) {
      return r;
    }
    if (!oFe.isAbsolute(e)) {
      let [o, ...s] = e.split(/[\\/]+/);
      if (o === oFe.basename(n) && s.length > 0) {
        let i = oFe.join(n, ...s);
        try {
          if ((await Ktr.stat(i)).isFile()) {
            return s.join("/");
          }
        } catch {}
      }
    }
    return vke(t);
  }
  async function Ytr(e) {
    let t = Nt();
    for (let n of e) {
      if (RIl(n)) {
        continue;
      }
      if (/^[a-z][a-z0-9+.-]+:\/\//i.test(n)) {
        return {
          result: false,
          message: `Attachment "${n}" looks like a URL, not a local file path. This tool can only send files that exist on the local filesystem \u2014 download or write the content to a local file first, then pass that path.`,
          errorCode: 1
        };
      }
      let r = us(n);
      if (r.startsWith("\\\\") || r.startsWith("//")) {
        return {
          result: false,
          message: `Attachment "${n}" is a UNC network path, which is not supported.`,
          errorCode: 1
        };
      }
      try {
        if (!(await Ktr.stat(r)).isFile()) {
          return {
            result: false,
            message: `Attachment "${n}" is not a regular file.`,
            errorCode: 1
          };
        }
      } catch (o) {
        let s = en(o);
        if (s === "ENOENT") {
          let i = await qPm(n, r, t);
          return {
            result: false,
            message: `Attachment "${n}" does not exist. Current working directory: ${t}.` + (i ? ` Did you mean "${i}"?` : ""),
            errorCode: 1
          };
        }
        if (Zd(o)) {
          return {
            result: false,
            message: `Attachment "${n}" is not accessible (${s}).`,
            errorCode: 1
          };
        }
        throw o;
      }
    }
    return {
      result: true
    };
  }
  async function Jtr(e, t) {
    let n = [];
    let r = [];
    for (let a of e) {
      if (RIl(a)) {
        n.push({
          path: a.file_name,
          size: a.size,
          isImage: a.is_image,
          file_uuid: a.file_uuid,
          media_type: a.media_type ?? CIl(a.file_name),
          pathValidated: false
        });
        continue;
      }
      let l = us(a);
      if (l.startsWith("\\\\") || l.startsWith("//")) {
        throw Error(`Attachment "${a}" is a UNC network path, which is not supported.`);
      }
      let c = await Ktr.stat(l);
      r.push(n.length);
      n.push({
        path: l,
        size: c.size,
        isImage: cLn.test(l),
        media_type: CIl(l),
        pathValidated: true
      });
    }
    if (r.length === 0) {
      return n;
    }
    let o = t.replBridgeEnabled || st(process.env.CLAUDE_CODE_BRIEF_UPLOAD) || !!process.env.CLAUDE_CODE_REMOTE_ENVIRONMENT_TYPE || st(process.env.CLAUDE_CODE_REMOTE);
    let {
      uploadBriefAttachment: s
    } = await Promise.resolve().then(() => (wIl(), vIl));
    let i = await Promise.all(r.map(a => s(n[a].path, n[a].size, {
      replBridgeEnabled: o,
      signal: t.signal
    })));
    r.forEach((a, l) => {
      if (i[l] !== undefined) {
        n[a] = {
          ...n[a],
          file_uuid: i[l]
        };
      }
    });
    return n;
  }
  var Ktr;
  var oFe;
  var jPm;
  var zFo = __lazy(() => {
    vo();
    gn();
    dt();
    Zl();
    lGe();
    ku();
    Ktr = require("fs/promises");
    oFe = require("path");
    jPm = {
      ".png": "image/png",
      ".jpg": "image/jpeg",
      ".jpeg": "image/jpeg",
      ".gif": "image/gif",
      ".webp": "image/webp",
      ".svg": "image/svg+xml",
      ".bmp": "image/bmp",
      ".ico": "image/x-icon",
      ".heic": "image/heic",
      ".heif": "image/heif",
      ".avif": "image/avif",
      ".tif": "image/tiff",
      ".tiff": "image/tiff",
      ".mp4": "video/mp4",
      ".m4v": "video/x-m4v",
      ".mov": "video/quicktime",
      ".webm": "video/webm",
      ".avi": "video/x-msvideo",
      ".mkv": "video/x-matroska",
      ".mp3": "audio/mpeg",
      ".m4a": "audio/mp4",
      ".wav": "audio/wav",
      ".ogg": "audio/ogg",
      ".aac": "audio/aac",
      ".flac": "audio/flac",
      ".pdf": "application/pdf",
      ".txt": "text/plain",
      ".log": "text/plain",
      ".md": "text/markdown",
      ".json": "application/json",
      ".csv": "text/csv",
      ".html": "text/html",
      ".htm": "text/html",
      ".xml": "application/xml",
      ".docx": "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
      ".xlsx": "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
      ".pptx": "application/vnd.openxmlformats-officedocument.presentationml.presentation",
      ".zip": "application/zip"
    };
  });
  var CZ = {};
  __export(CZ, {
    shouldToolsListOptInToBrief: () => shouldToolsListOptInToBrief,
    isBriefEntitled: () => isBriefEntitled,
    isBriefEnabled: () => isBriefEnabled,
    getBriefEnforceText: () => getBriefEnforceText
  });
  function isBriefEntitled() {
    return Me.CLAUDE_CODE_BRIEF || getFeatureValue_CACHED_WITH_REFRESH("tengu_kairos_brief", false, 300000);
  }
  function shouldToolsListOptInToBrief(e) {
    if (!e.includes("SendUserMessage") && !e.includes("Brief")) {
      return false;
    }
    if (isPewterOwlTool()) {
      return false;
    }
    return isBriefEntitled();
  }
  function isBriefEnabled() {
    return getUserMsgOptIn() && isBriefEntitled() || isPewterOwlBrief();
  }
  function getBriefEnforceText() {
    let e = getFeatureValue_CACHED_MAY_BE_STALE("tengu_kairos_brief_stop_hook_text", "");
    return typeof e === "string" && e.length > 0 ? e : VPm;
  }
  var VPm;
  var D3 = __lazy(() => {
    at();
    $n();
    pr();
    zit();
    k2();
    VPm = `In brief mode, plain assistant text is hidden from the user \u2014 only ${"SendUserMessage"} reaches them. Call it now with your substantive reply for this turn. Do not mention this reminder; the message should read as if you wrote it unprompted, addressing only what the user actually asked. If you genuinely have nothing useful to tell the user, you may end the turn without calling it.`;
  });
  function AIl() {
    return "";
  }
  function IIl(e, t, n) {
    let r = (e.attachments?.length ?? 0) > 0;
    if (!e.message && !r) {
      return null;
    }
    if (n?.isTranscriptMode) {
      return Ov.jsxs(gXd, {
        flexDirection: "row",
        marginTop: 1,
        children: [Ov.jsx(gXd, {
          minWidth: 2,
          children: Ov.jsx(Text, {
            color: "text",
            children: Tc
          })
        }), Ov.jsxs(gXd, {
          flexDirection: "column",
          children: [e.message ? Ov.jsx(cy, {
            children: e.message
          }) : null, Ov.jsx(dJt, {
            attachments: e.attachments
          })]
        })]
      });
    }
    if (n?.isBriefOnly) {
      let o = e.sentAt ? ZQn(e.sentAt) : "";
      return Ov.jsxs(gXd, {
        flexDirection: "column",
        marginTop: 1,
        paddingLeft: 2,
        children: [Ov.jsxs(gXd, {
          flexDirection: "row",
          children: [Ov.jsx(Text, {
            color: "briefLabelClaude",
            children: "Claude"
          }), o ? Ov.jsxs(Text, {
            dimColor: true,
            children: [" ", o]
          }) : null]
        }), Ov.jsxs(gXd, {
          flexDirection: "column",
          children: [e.message ? Ov.jsx(cy, {
            children: e.message
          }) : null, Ov.jsx(dJt, {
            attachments: e.attachments
          })]
        })]
      });
    }
    return Ov.jsxs(gXd, {
      flexDirection: "row",
      marginTop: 1,
      children: [Ov.jsx(NoSelect, {
        fromLeftEdge: true,
        minWidth: 2,
        children: Ov.jsx(Text, {
          color: "text",
          children: Tc
        })
      }), Ov.jsxs(gXd, {
        flexDirection: "column",
        children: [e.message ? Ov.jsx(cy, {
          children: e.message
        }) : null, Ov.jsx(dJt, {
          attachments: e.attachments
        })]
      })]
    });
  }
  function dJt(e) {
    let t = xIl.c(4);
    let {
      attachments: n
    } = e;
    if (!n || n.length === 0) {
      return null;
    }
    let r;
    if (t[0] !== n) {
      r = n.map(KPm);
      t[0] = n;
      t[1] = r;
    } else {
      r = t[1];
    }
    let o;
    if (t[2] !== r) {
      o = Ov.jsx(gXd, {
        flexDirection: "column",
        marginTop: 1,
        children: r
      });
      t[2] = r;
      t[3] = o;
    } else {
      o = t[3];
    }
    return o;
  }
  function KPm(e) {
    let t = kIl.isAbsolute(e.path) && e.pathValidated && !e.path.startsWith("\\\\") && !e.path.startsWith("//");
    return Ov.jsxs(gXd, {
      flexDirection: "row",
      children: [Ov.jsxs(Text, {
        dimColor: true,
        children: [vGd.pointerSmall, " ", e.isImage ? "[image]" : "[file]", " "]
      }), t ? Ov.jsx(vM, {
        filePath: e.path,
        children: Pd(e.path)
      }) : Ov.jsx(Text, {
        children: Pd(e.path)
      }), Ov.jsxs(Text, {
        dimColor: true,
        children: [" (", formatFileSize(e.size), ")"]
      })]
    }, e.file_uuid ?? e.path);
  }
  var xIl;
  var kIl;
  var Ov;
  var KFo = __lazy(() => {
    XTe();
    sH();
    wl();
    et();
    Zl();
    cs();
    YMo();
    xIl = __toESM(pt(), 1);
    kIl = require("path");
    Ov = __toESM(ie(), 1);
  });
  var YPm;
  var JPm;
  var XPm;
  var QPm;
  var OIl;
  var DIl = __lazy(() => {
    Ot();
    ci();
    zit();
    Zn();
    zFo();
    k2();
    D3();
    KFo();
    YPm = we(() => v.strictObject({
      file_uuid: v.string(),
      file_name: v.string(),
      size: v.number(),
      is_image: v.boolean(),
      media_type: v.string().optional()
    }).describe("A file already uploaded to the filestore (e.g. by the device attach_file tool). Passed through without local stat or upload."));
    JPm = we(() => v.strictObject({
      message: v.string().describe("The message for the user. Supports markdown formatting."),
      attachments: v.array(v.union([v.string(), YPm()])).optional().describe("Optional attachments for the user to see alongside your message. Each entry is either a file path (absolute or relative to cwd) for a file you can read locally, or a pre-resolved {file_uuid, file_name, size, is_image} object you obtained from a device tool such as attach_file."),
      status: v.enum(["normal", "proactive"]).describe("Use 'proactive' when you're surfacing something the user hasn't asked for and needs to see now \u2014 task completion while they're away, a blocker you hit, an unsolicited status update. Use 'normal' when replying to something the user just said.")
    }));
    XPm = we(() => v.object({
      message: v.string().describe("The message for the user. Supports markdown formatting.")
    }));
    QPm = we(() => v.object({
      message: v.string().describe("The message"),
      attachments: v.array(v.object({
        path: v.string(),
        size: v.number(),
        isImage: v.boolean(),
        file_uuid: v.string().optional(),
        media_type: v.string().optional(),
        pathValidated: v.boolean().optional()
      })).optional().describe("Resolved attachment metadata"),
      sentAt: v.string().optional().describe("ISO timestamp captured at tool execution on the emitting process. Optional \u2014 resumed sessions replay pre-sentAt outputs verbatim.")
    }));
    OIl = Xs({
      name: "SendUserMessage",
      aliases: ["Brief"],
      searchHint: "send a message to the user \u2014 your primary visible output channel",
      briefStandalone: true,
      maxResultSizeChars: 1e5,
      userFacingName() {
        return "";
      },
      get inputSchema() {
        return isBriefEnabled() ? JPm() : XPm();
      },
      get outputSchema() {
        return QPm();
      },
      isEnabled() {
        return isBriefEnabled() || isPewterOwlTool();
      },
      isConcurrencySafe() {
        return true;
      },
      isReadOnly() {
        return true;
      },
      toAutoClassifierInput(e) {
        return e.message;
      },
      async validateInput(e, t) {
        if (!("attachments" in e) || !e.attachments?.length) {
          return {
            result: true
          };
        }
        return Ytr(e.attachments);
      },
      async description() {
        return "Send a message to the user";
      },
      async prompt() {
        return isBriefEnabled() ? "Send a message the user will read. Text outside this tool is visible in the detail view, but most won't open it \u2014 the answer lives here.\n\n`message` supports markdown. `attachments` accepts two forms per entry: a file path string (absolute or cwd-relative) for a file you can read here \u2014 images, diffs, logs \u2014 or the exact {file_uuid, file_name, size, is_image} object a device tool like `attach_file` returned to you. Use the path form when the file is on your working filesystem; use the object form when the user's device already uploaded the file and handed you a reference \u2014 pass that object through verbatim, don't try to path it.\n\n`status` labels intent: 'normal' when replying to what they just asked; 'proactive' when you're initiating \u2014 a scheduled task finished, a blocker surfaced during background work, you need input on something they haven't asked about. Set it honestly; downstream routing uses it." : "Send a message the user will read verbatim. Use this for content they need to see exactly as written between tool calls \u2014 a generated code snippet, a specific value, a direct reply to something they asked mid-task. Don't use it for routine narration of what you're about to do, or for your final answer \u2014 normal text reaches them for those.";
      },
      mapToolResultToToolResultBlockParam(e, t) {
        let n = e.attachments?.length ?? 0;
        let r = n === 0 ? "" : ` (${n} ${un(n, "attachment")} included)`;
        return {
          tool_use_id: t,
          type: "tool_result",
          content: `Message delivered to user.${r}`
        };
      },
      renderToolUseMessage: AIl,
      renderToolResultMessage: IIl,
      async call(e, t) {
        let {
          message: n
        } = e;
        let r = "attachments" in e ? e.attachments : undefined;
        let o = new Date().toISOString();
        if (logEvent("tengu_brief_send", {
          proactive: "status" in e && e.status === "proactive",
          attachment_count: r?.length ?? 0
        }), !r?.length) {
          return {
            data: {
              message: n,
              sentAt: o
            }
          };
        }
        let s = t.getAppState();
        let i = await Jtr(r, {
          replBridgeEnabled: s.replBridgeEnabled,
          signal: t.abortController.signal
        });
        return {
          data: {
            message: n,
            attachments: i,
            sentAt: o
          }
        };
      }
    });
  });
  async function MIl() {
    let e = zk();
    let t = Pu();
    let n = t ? "Bash" : "PowerShell";
    let r = await ZPm();
    let o = "`shQuote(s)` is POSIX-only \u2014 for PowerShell, double the single quotes: `\"'\"+s.replaceAll(\"'\", \"''\")+\"'\"`. For multi-line input use a here-string `@'\\n...\\n'@` (closing `'@` at column 0).";
    let s = r ? `gh pr edit N --body-file - <<'EOF'\\n"+body+"\\nEOF` : `git commit -F - <<'EOF'\\n"+msg+"\\nEOF`;
    if (e) {
      return `
REPL is your **only way** to investigate \u2014 shell, file reads, and code search all happen here via the shorthands below. Edit, Write, and Agent are still available as top-level tools for direct use.

**Aim for 1-3 REPL calls per turn** \u2014 over-fetch and batch.

## Dense scripts \u2014 every char is an output token

\`\`\`javascript
o.git=sh('git status')
for(const f of (await rgf('X','src')).slice(0,5)) o[f]=cat(f,1,300)
o
\`\`\`

\`o\` is pre-declared \`{}\`; assign results directly to \`o.key\` (no \`const x=\` then repack). Thenable \`o.*\` values are auto-awaited **at return only** \u2014 \`o.x=sh(c)\` needs no await, but a shorthand result used inline (concat, template, arg to another call) does: \`const c=await cat(f); put(f,c+s)\`, never \`put(f,cat(f)+s)\`. **End the script with bare \`o\`** (or a statement) to return the full object; ending on \`o.x=...\` returns just that one value. Relative paths resolve against cwd. No \`//\` comments \u2014 the \`description\` param is your comment. No blank lines, single-char vars.

## API
- \`sh(cmd,ms?)\` \u2192 stdout+stderr (merged \u2014 never write \`2>&1\` or \`2>/dev/null\`)
- \`cat(path,off?,lim?)\` \u2192 file content
- \`rg(pat,path?,{A,B,C,glob,head,type,i}?)\` \u2192 match text
- \`rgf(pat,path?,glob?)\` \u2192 matching file paths[]
- \`gl(pat,path?)\` \u2192 glob file paths[]
- \`put(path,content)\` \u2192 write file
${r ? `- \\\`gh(args)\\\` \u2192 \\\`sh('gh '+args)\\\` with \\\`-R \\\${REPO}\\\` injected
` : ""}- \`chdir(path)\` \u2014 set cwd for this REPL call
- \`haiku(prompt,schema?)\` \u2014 one-turn model sampling
- \`registerTool(name,desc,schema,handler)\` / \`unregisterTool\` / \`listTools\` / \`getTool\`
- \`log\` (console.log) \xB7 \`str\` (JSON.stringify) \xB7 \`shQuote(s)\`${r ? " \xB7 \\`REPO\\` ('owner/name')" : ""}
- \`await ${"Edit"}({\u2026})\` / \`await ${"NotebookEdit"}({\u2026})\` / \`await mcp__server__tool({\u2026})\` (MCP tools by full name)

Shorthands never throw \u2014 \`sh\`/\`cat\`/\`rg\` return the error text on failure, \`rgf\`/\`gl\` return \`[]\`, never \`undefined\`. Permission-denied is a hard no \u2014 don't retry the same call; pivot or stop.

## Rules
- One investigation = one call. Put the next step in the code; grep\u2192read\u2192grep in one script. A failing inner call degrades the result, not the whole script.
- No \`import\`/\`require\`/\`process\`/Node globals \u2014 the VM context is sealed. \u22653 ops per call. Over-fetch (3-5 files, 3-4 patterns).
- Variables persist across calls. Last expression (or \`o\`) = return value. No top-level \`return\` \u2014 end with \`o\` and branch with \`if/else\` above it.
- Never re-invoke a stateful op (\`sh\`/\`Edit\`/\`put\`) to grab another field \u2014 \`git reset\`, \`rm\`, migrations run twice.
- ${t ? `Don't \`put()\` to a temp file just to feed a shell command \u2014 pipe via heredoc instead: \`sh("${s}")\`. Generic temp paths get clobbered by parallel agents.` : "`shQuote(s)` is POSIX-only \u2014 for PowerShell, double the single quotes: `\"'\"+s.replaceAll(\"'\", \"''\")+\"'\"`. For multi-line input use a here-string `@'\\n...\\n'@` (closing `'@` at column 0)."}
`;
    }
    return `
REPL is your programming interface to Claude Code's tools. Use it to loop, branch, and compose tool calls with code.

## How to Use

Write JavaScript that calls tools as async functions:
\`\`\`javascript
const { filenames } = await Glob({ pattern: 'src/**/*.ts' })
for (const f of filenames) {
  const { file } = await Read({ file_path: f })
  if (file.content.includes('oldName')) {
    await Edit({ file_path: f, old_string: 'oldName', new_string: 'newName', replace_all: true })
  }
}
\`\`\`

**IMPORTANT: Batch ALL operations into ONE REPL call.** Don't make multiple separate REPL calls - write a complete script that does everything.

## Available Tools

All tools work as async functions: \`Read\`, \`Write\`, \`Edit\`, \`Glob\`, \`Grep\`, \`${n}\`, etc. MCP tools are callable by their full name (e.g. \`await mcp__slack__slack_send_message({...})\`).

\`\`\`javascript
const { filenames } = await Glob({ pattern: '*.ts' })
const { file } = await Read({ file_path: 'config.json' })
await Edit({ file_path: 'foo.ts', old_string: 'old', new_string: 'new' })
const { stdout } = await ${n}({ command: 'git status' })
\`\`\`

## Tips
- \`import\`/\`require\` don't work here \u2014 the vm context is sealed. For filesystem access use \`Read\`/\`Write\`/\`Glob\`; for shell use \`${n}\`.
- Use \`Promise.all()\` for parallel operations
- Variables persist across REPL calls
- Last expression is returned as the result
- \`haiku(prompt, schema?)\` \u2014 one-turn model sampling. Without schema returns text; with a JSON schema returns the parsed object.
- \`registerTool(name, desc, schema, handler)\` defines a new tool; \`unregisterTool(name)\`, \`listTools()\`, \`getTool(name)\` manage them
- ${t ? `\`shQuote(s)\` quotes a string for Bash \u2014 use this instead of \`JSON.stringify\` (double quotes don't protect backticks or \`$\`)
- Don't write a temp file just to feed a shell command \u2014 pipe via heredoc: \`await ${n}({command: "${s}"})\`. Generic temp paths get clobbered by parallel agents.` : "`shQuote(s)` is POSIX-only \u2014 for PowerShell, double the single quotes: `\"'\"+s.replaceAll(\"'\", \"''\")+\"'\"`. For multi-line input use a here-string `@'\\n...\\n'@` (closing `'@` at column 0)."}
`;
  }
  function NIl() {
    return zk() ? "Execute JavaScript to read, write, edit files and run shell commands" : "Execute JavaScript code with access to Claude Code tools";
  }
  var ZPm;
  var LIl = __lazy(() => {
    ZL();
    Jf();
    Ay();
    ZC();
    ZPm = TEr(async () => (await Qm("gh")) !== null);
  });
  function FIl(e, t) {
    let n = [];
    for (let [, r] of e) {
      n.push(nOm(r, t));
    }
    return n;
  }
  function eOm(e, t) {
    let n;
    try {
      n = t.stringify(e, null, 2);
    } catch {
      n = t.toStr(e);
    }
    return r7e.jsx(Vn, {
      children: r7e.jsx(Text, {
        children: n
      })
    });
  }
  function tOm(e, {
    verbose: t
  }) {
    return r7e.jsx(Vn, {
      children: r7e.jsx(Text, {
        color: "error",
        children: typeof e === "string" ? e : "Error"
      })
    });
  }
  function nOm(e, t) {
    let n = v.object({}).passthrough();
    return Xs({
      name: `eval_registered__${e.name}`,
      maxResultSizeChars: 1e5,
      async prompt() {
        return e.description;
      },
      async description() {
        return e.description;
      },
      inputSchema: n,
      inputJSONSchema: e.schema,
      isEnabled() {
        return true;
      },
      isConcurrencySafe() {
        return false;
      },
      isReadOnly() {
        return false;
      },
      toAutoClassifierInput(o) {
        let s = Object.keys(o);
        return s.length > 0 ? `${e.name}(${s.join(", ")})` : e.name;
      },
      async checkPermissions() {
        return {
          behavior: "ask",
          message: `Execute registered tool "${e.name}"`
        };
      },
      async call(o) {
        let {
          v: s
        } = await e.handler(o);
        return {
          data: s
        };
      },
      userFacingName() {
        return e.displayName ?? e.name;
      },
      getToolUseSummary() {
        return null;
      },
      mapToolResultToToolResultBlockParam(o, s) {
        let i;
        try {
          i = t.stringify(o);
        } catch {
          i = t.toStr(o);
        }
        return {
          tool_use_id: s,
          type: "tool_result",
          content: i
        };
      },
      renderToolUseMessage(o) {
        try {
          let s = De(o, null, 2);
          return `${e.name}(${s})`;
        } catch {
          return `${e.name}(...)`;
        }
      },
      renderToolResultMessage: o => eOm(o, t),
      renderToolUseRejectedMessage() {
        return r7e.jsx(Vn, {
          children: r7e.jsx(Text, {
            color: "warning",
            children: "Rejected"
          })
        });
      },
      renderToolUseErrorMessage: tOm,
      renderToolUseProgressMessage() {
        return null;
      }
    });
  }
  var r7e;
  var UIl = __lazy(() => {
    Wl();
    et();
    ci();
    r7e = __toESM(ie(), 1);
  });
  function rOm() {
    if (Xtr) {
      return Xtr;
    }
    Xtr = new Bun.Transpiler({
      loader: "js",
      replMode: true
    });
    return Xtr;
  }
  function Qtr(e) {
    let t = rOm();
    let n = t.transformSync(e);
    sOm(t, e);
    return n;
  }
  function sOm(e, t) {
    let n;
    try {
      n = e.scanImports(t.replace(/^#!.*\n?/, ""));
    } catch {
      return;
    }
    for (let {
      kind: r
    } of n) {
      let o = oOm[r];
      if (!o) {
        continue;
      }
      throw Error(`Module loading (${o}) is not available in REPL \u2014 the vm context is sealed. ` + "Use the tool globals instead: await Read({file_path: '...'}), await Glob({pattern: '...'}), the registered shell tool, etc.");
    }
  }
  function Ztr(e) {
    if (e === null || typeof e !== "object") {
      return e;
    }
    if (BIl.types.isProxy(e)) {
      return e;
    }
    let t = Object.getOwnPropertyDescriptor(e, "value");
    return t && "value" in t ? t.value : e;
  }
  var BIl;
  var Xtr;
  var oOm;
  var YFo = __lazy(() => {
    BIl = require("util");
    oOm = {
      "import-statement": "import",
      "dynamic-import": "import",
      "require-call": "require"
    };
  });
  function XFo(e, t, n) {
    function r(s, i) {
      return async (a, l) => {
        if (typeof a !== "string") {
          throw Error(`${s}: prompt must be a string`);
        }
        let c;
        if (l !== undefined) {
          let p;
          try {
            p = qt(e(l));
          } catch {
            throw Error(`${s}: schema must be JSON-serializable`);
          }
          if (p === null || typeof p !== "object" || Array.isArray(p)) {
            throw Error(`${s}: schema must be an object`);
          }
          c = JFo(p);
        }
        let u = `repl_${$Il.randomUUID()}`;
        let d = {
          prompt: a.slice(0, 200)
        };
        n?.({
          type: "progress",
          toolUseID: u,
          data: {
            type: "repl_tool_call",
            toolName: s,
            toolInput: d,
            toolUseId: u,
            phase: "start"
          }
        });
        try {
          let p = await sFe({
            systemPrompt: [],
            userPrompt: a,
            outputFormat: c ? {
              type: "json_schema",
              schema: c
            } : undefined,
            signal: t.abortController.signal,
            options: {
              model: i(),
              querySource: "repl_sampling",
              agents: [],
              isNonInteractiveSession: t.options.isNonInteractiveSession,
              hasAppendSystemPrompt: false,
              mcpTools: [],
              agentContext: t.agentContext
            }
          });
          let m = Tl(p.message.content);
          if (mU(m)) {
            throw Error(m);
          }
          let f = c ? qt(aW(m)) : m;
          n?.({
            type: "progress",
            toolUseID: u,
            data: {
              type: "repl_tool_call",
              toolName: s,
              toolInput: d,
              toolUseId: u,
              phase: "complete",
              result: f
            }
          });
          return f;
        } catch (p) {
          let m = p instanceof Error ? p.message : String(p);
          throw n?.({
            type: "progress",
            toolUseID: u,
            data: {
              type: "repl_tool_call",
              toolName: s,
              toolInput: d,
              toolUseId: u,
              phase: "error",
              error: m
            }
          }), p;
        }
      };
    }
    let o = r("haiku", getSmallFastModel);
    return {
      haiku: o,
      opus: o,
      sonnet: o,
      fable: o
    };
  }
  function JFo(e) {
    if (e === null || typeof e !== "object") {
      return e;
    }
    if (Array.isArray(e)) {
      return e.map(JFo);
    }
    let t = e;
    let n = {};
    for (let r of Object.keys(t)) {
      n[r] = JFo(t[r]);
    }
    if (n.type === "object" && !("additionalProperties" in n)) {
      n.additionalProperties = false;
    }
    return n;
  }
  var $Il;
  var HIl = __lazy(() => {
    aE();
    vO();
    Gd();
    ro();
    Eo();
    $Il = require("crypto");
  });
  function enr(e, t, n, r) {
    if (e !== "Edit" && e !== "Write") {
      return null;
    }
    if (typeof n !== "object" || n === null || !("file_path" in n) || typeof n.file_path !== "string") {
      return null;
    }
    try {
      let o = us(n.file_path);
      let s = r.get(o);
      if (!s || s.offset !== undefined || s.limit !== undefined) {
        return null;
      }
      let i = Fte(o);
      if (i <= s.timestamp) {
        return null;
      }
      let a = Eye(o);
      if (r.set(o, {
        content: a.content,
        timestamp: i,
        offset: undefined,
        limit: undefined
      }), vde(s, a.content)) {
        return null;
      }
      logForDebugging(`PostToolUse hook modified ${o} after ${e} \u2014 re-synced readFileState`, {
        level: "info"
      });
      return createAttachmentMessage({
        type: "hook_additional_context",
        content: [`PostToolUse hook modified ${o} after your edit (likely a formatter). Your next Edit will not fail with a stale-file error, but if its old_string targets a region the hook reformatted, Read the file first.`],
        hookName: `PostToolUse:${e}`,
        toolUseID: t,
        hookEvent: "PostToolUse"
      });
    } catch {
      return null;
    }
  }
  var QFo = __lazy(() => {
    Ay();
    mx();
    rR();
    je();
    Zl();
    KB();
    qI();
    ku();
  });
  function ZFo(e) {
    switch (e) {
      case "allow":
        return "allowed";
      case "deny":
        return "denied";
      default:
        return "asked for confirmation for";
    }
  }
  function pJt(e) {
    if (!e) {
      return;
    }
    if (e.type === "classifier") {
      return e.reason;
    }
    switch (e.type) {
      case "rule":
      case "mode":
      case "subcommandResults":
      case "permissionPromptTool":
      case "classifier":
        return;
      case "hook":
      case "asyncAgent":
      case "sandboxOverride":
      case "workingDir":
      case "safetyCheck":
      case "other":
        return e.reason;
    }
  }
  function awe(e) {
    if (e instanceof xc) {
      return e.message || "[Request interrupted by user for tool use]";
    }
    if (!(e instanceof Error)) {
      return String(e);
    }
    let n = eUo(e).filter(Boolean).join(`
`).trim() || "Command failed with no output";
    if (n.length <= 1e4) {
      return n;
    }
    let r = 5000;
    let o = pC(n, r);
    let s = qge(n, r);
    let i = n.length - o.length - s.length;
    return `${o}

... [${i} characters truncated] ...

${s}`;
  }
  function eUo(e) {
    if (e instanceof RN) {
      return [`Exit code ${e.code}`, e.interrupted ? "[Request interrupted by user for tool use]" : "", e.stderr, e.stdout];
    }
    let t = [e.message];
    if ("stderr" in e && typeof e.stderr === "string") {
      t.push(e.stderr);
    }
    if ("stdout" in e && typeof e.stdout === "string") {
      t.push(e.stdout);
    }
    return t;
  }
  function jIl(e) {
    if (e.length === 0) {
      return "";
    }
    return e.reduce((t, n, r) => {
      let o = String(n);
      if (typeof n === "number") {
        return `${String(t)}[${o}]`;
      }
      return r === 0 ? o : `${String(t)}.${o}`;
    }, "");
  }
  function o7e(e, t) {
    let n = t.issues.filter(a => a.code === "invalid_type" && a.message.includes("received undefined")).map(a => jIl(a.path));
    let r = t.issues.filter(a => a.code === "unrecognized_keys").flatMap(a => a.keys);
    let o = t.issues.filter(a => a.code === "invalid_type" && !a.message.includes("received undefined")).map(a => {
      let l = a;
      let c = a.message.match(/received (\w+)/);
      let u = c ? c[1] : "unknown";
      return {
        param: jIl(a.path),
        expected: l.expected,
        received: u
      };
    });
    let s = t.message;
    let i = [];
    if (n.length > 0) {
      let a = n.map(l => `The required parameter \`${l}\` is missing`);
      i.push(...a);
    }
    if (r.length > 0) {
      let a = r.map(l => `An unexpected parameter \`${l}\` was provided`);
      i.push(...a);
    }
    if (o.length > 0) {
      let a = o.map(({
        param: l,
        expected: c,
        received: u
      }) => `The parameter \`${l}\` type is expected as \`${c}\` but provided as \`${u}\``);
      i.push(...a);
    }
    if (i.length > 0) {
      s = `${e} failed due to the following ${i.length > 1 ? "issues" : "issue"}:
${i.join(`
`)}`;
    }
    return s;
  }
  var mJt = __lazy(() => {
    dt();
    ro();
    Zn();
  });