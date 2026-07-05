  function xNe(e) {
    let t = CGa.c(10);
    let n;
    if (t[0] !== e) {
      n = e === undefined ? {} : e;
      t[0] = e;
      t[1] = n;
    } else {
      n = t[1];
    }
    let {
      onBackground: r
    } = n;
    let o = Rv();
    let s;
    if (t[2] !== r || t[3] !== o) {
      s = () => {
        QDe(o);
        r?.();
      };
      t[2] = r;
      t[3] = o;
      t[4] = s;
    } else {
      s = t[4];
    }
    let i = s;
    let a;
    if (t[5] !== i) {
      a = {
        handler: i,
        isActive: true
      };
      t[5] = i;
      t[6] = a;
    } else {
      a = t[6];
    }
    let {
      cohesionFixes: l,
      gateOnShortcut: c
    } = l9n(a);
    let u = Zu("task:background", "Task", "ctrl+b");
    let d = l ? c : Me.terminal === "tmux" && u === "ctrl+b" ? "ctrl+b ctrl+b (twice)" : u;
    if (Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS || l && d === "") {
      return null;
    }
    let p;
    if (t[7] === Symbol.for("react.memo_cache_sentinel")) {
      p = {
        keyCase: "lower"
      };
      t[7] = p;
    } else {
      p = t[7];
    }
    let m;
    if (t[8] !== d) {
      m = az.jsx(gXd, {
        paddingLeft: 5,
        children: az.jsx(Text, {
          dimColor: true,
          children: az.jsx(xt, {
            chord: d,
            action: "run in background",
            parens: true,
            format: p
          })
        })
      });
      t[8] = d;
      t[9] = m;
    } else {
      m = t[9];
    }
    return m;
  }
  function RGa(e, {
    verbose: t,
    theme: n
  }) {
    let {
      command: r
    } = e;
    if (!r) {
      return null;
    }
    let o = t8e(r);
    if (o) {
      return t ? o.filePath : Pd(o.filePath);
    }
    if (!t) {
      let s = r.split(`
`);
      if (qs()) {
        let l = kjn(r);
        if (l) {
          return l.length > 160 ? l.slice(0, 160) + "\u2026" : l;
        }
      }
      let i = s.length > 2;
      let a = r.length > 160;
      if (i || a) {
        let l = r;
        if (i) {
          l = s.slice(0, 2).join(`
`);
        }
        if (l.length > 160) {
          l = l.slice(0, 160);
        }
        return az.jsxs(Text, {
          children: [l.trim(), "\u2026"]
        });
      }
    }
    return r;
  }
  function xGa(e, {
    verbose: t,
    tools: n,
    terminalSize: r,
    inProgressToolCallCount: o
  }) {
    let s = e.at(-1);
    if (!s || !s.data) {
      return az.jsx(Vn, {
        height: 1,
        children: az.jsx(Text, {
          dimColor: true,
          children: "Running\u2026"
        })
      });
    }
    let i = s.data;
    return az.jsx(Mht, {
      fullOutput: i.fullOutput,
      output: i.output,
      elapsedTimeSeconds: i.elapsedTimeSeconds,
      totalLines: i.totalLines,
      totalBytes: i.totalBytes,
      timeoutMs: i.timeoutMs,
      taskId: i.taskId,
      verbose: t
    });
  }
  function kGa() {
    return az.jsx(Vn, {
      height: 1,
      children: az.jsx(Text, {
        dimColor: true,
        children: "Waiting\u2026"
      })
    });
  }
  function AGa(e, t, {
    verbose: n,
    theme: r,
    tools: o,
    style: s
  }) {
    let a = t.at(-1)?.data?.timeoutMs;
    return az.jsx(e8e, {
      content: e,
      verbose: n,
      timeoutMs: a
    });
  }
  function IGa(e, {
    verbose: t,
    progressMessagesForMessage: n,
    tools: r
  }) {
    return az.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  var CGa;
  var az;
  var s6t = __lazy(() => {
    bs();
    KG();
    Wl();
    a9n();
    qEo();
    et();
    c0();
    _9();
    zX();
    pr();
    Zl();
    zp();
    p9n();
    r6t();
    CGa = __toESM(pt(), 1);
    az = __toESM(ie(), 1);
  });
  function h9n(e) {
    let t = e.split(`
`);
    let n = 0;
    while (n < t.length && t[n]?.trim() === "") {
      n++;
    }
    let r = t.length - 1;
    while (r >= 0 && t[r]?.trim() === "") {
      r--;
    }
    if (n > r) {
      return "";
    }
    return t.slice(n, r + 1).join(`
`);
  }
  function i6t(e) {
    return /^data:image\/[a-z0-9.+_-]+;base64,/i.test(e);
  }
  function PGa(e) {
    let t = e.trim().match(OWp);
    if (!t || !t[1] || !t[2]) {
      return null;
    }
    return {
      mediaType: t[1],
      data: t[2]
    };
  }
  function g9n(e, t) {
    let n = PGa(e);
    if (!n) {
      return null;
    }
    let r = tX(Buffer.from(n.data, "base64"));
    if (r === null) {
      return null;
    }
    return {
      tool_use_id: t,
      type: "tool_result",
      content: [{
        type: "image",
        source: {
          type: "base64",
          media_type: r,
          data: n.data
        }
      }]
    };
  }
  async function y9n(e, t, n, r) {
    let o = e;
    if (t) {
      if ((n ?? (await m9n.stat(t)).size) > 20971520) {
        return null;
      }
      o = await m9n.readFile(t, "utf8");
    }
    let s = PGa(o);
    if (!s) {
      return null;
    }
    let i = Buffer.from(s.data, "base64");
    let a = s.mediaType.split("/")[1] || "png";
    let l = await GPe(i, i.length, a, r);
    return `data:image/${l.mediaType};base64,${l.buffer.toString("base64")}`;
  }
  function OGa(e) {
    let t = i6t(e);
    if (t) {
      return {
        totalLines: 1,
        truncatedContent: e,
        isImage: t
      };
    }
    let n = _mt();
    if (e.length <= n) {
      return {
        totalLines: Ru(e, `
`) + 1,
        truncatedContent: e,
        isImage: t
      };
    }
    let r = e.slice(0, n);
    let o = Ru(e, `
`, n) + 1;
    let s = `${r}

... [${o} lines truncated] ...`;
    return {
      totalLines: Ru(e, `
`) + 1,
      truncatedContent: s,
      isImage: t
    };
  }
  function b9n(e) {
    let t = Nt();
    let n = getOriginalCwd();
    let r = mus();
    if (r || t !== n && !pathInAllowedWorkingPath(t, e)) {
      try {
        By(n);
      } catch {
        return true;
      }
      if (!r) {
        logEvent("tengu_bash_tool_reset_to_original_dir", {});
        return true;
      }
    }
    return false;
  }
  var m9n;
  var OWp;
  var _9n = e => `${e.trim()}
Shell cwd was reset to ${Nt()}`;
  var S9n = __lazy(() => {
    at();
    Ot();
    vo();
    wm();
    U1();
    gn();
    yG();
    eGt();
    Zn();
    m9n = require("fs/promises");
    OWp = /^data:([^;]+);base64,(.+)$/;
  });
  function JEo(e) {
    let t = e.trim().replace(/^[&.]\s+/, "");
    let n = /^"([^"]*)"|^'([^']*)'/.exec(t);
    let r = n?.[1] ?? n?.[2] ?? (t.split(/\s+/)[0] || "").replace(/^["']|["']$/g, "");
    let s = (r.split(/[\\/]/).pop() || r).toLowerCase();
    let i = /\.(exe|cmd|bat)$/.exec(s);
    return {
      base: i ? s.slice(0, -i[0].length) : s,
      hadNativeExt: i !== null
    };
  }
  function FWp(e) {
    let t = [];
    let n = 0;
    let r = false;
    let o = false;
    for (let s = 0; s < e.length; s++) {
      let i = e[s];
      if (r) {
        if (i === "'") {
          r = false;
        }
        continue;
      }
      if (o) {
        if (i === "`") {
          s++;
        } else if (i === '"') {
          o = false;
        }
        continue;
      }
      if (i === "#" && (s === 0 || e[s - 1] === " " || e[s - 1] === "\t" || e[s - 1] === `
` || e[s - 1] === "\r")) {
        t.push(e.slice(n, s));
        while (s + 1 < e.length && e[s + 1] !== `
` && e[s + 1] !== "\r") {
          s++;
        }
        n = s + 1;
        continue;
      }
      if (i === "'") {
        r = true;
        continue;
      }
      if (i === '"') {
        o = true;
        continue;
      }
      if (i === ";" || i === "|" || i === `
` || i === "\r") {
        t.push(e.slice(n, s));
        n = s + 1;
        continue;
      }
      if (i === "&") {
        if (e[s + 1] === "&") {
          t.push(e.slice(n, s));
          s++;
          n = s + 1;
          continue;
        }
        let a = e[s - 1];
        if ((a === " " || a === "\t") && e.slice(n, s).trim() !== "") {
          t.push(e.slice(n, s));
          n = s + 1;
        }
      }
    }
    t.push(e.slice(n));
    return t.findLast(s => s.trim()) || e;
  }
  function UWp(e) {
    let t = e.trim().replace(/^[&.]\s+/, "");
    let r = /^"[^"]*"|^'[^']*'/.exec(t)?.[0] ?? t.split(/\s+/)[0] ?? "";
    if (JEo(r).base !== "git") {
      return;
    }
    t = t.slice(r.length);
    let o = ["git", ...t.trim().split(/\s+/).filter(Boolean)];
    for (let s = 1; s < o.length; s++) {
      let i = o[s];
      if (i.startsWith("-")) {
        if (i === "-C" || i === "-c") {
          s++;
        }
        continue;
      }
      return i;
    }
    return;
  }
  function $ht(e) {
    let t = e.split(/[\r\n;|&]/).map(o => {
      let s = o.replace(/^\s*\$[\w:.{}]+\s*\+?=\s*/, "");
      if (s !== o && /^['"]/.test(s.trimStart())) {
        return "";
      }
      let {
        base: i,
        hadNativeExt: a
      } = JEo(s);
      if (a) {
        return i;
      }
      return _Q[i]?.toLowerCase() ?? i;
    });
    for (let o of t) {
      let s = HWp.get(o);
      if (s) {
        return s;
      }
    }
    let n;
    let r = true;
    for (let o of t) {
      if (!o.trim()) {
        continue;
      }
      let s = /^([a-z]+)-\w+$/.exec(o)?.[1];
      let i = s && jWp.get(s);
      if (i && qWp.vZc(o)) {
        n ??= i;
        continue;
      }
      if (r = false, i) {
        return i;
      }
    }
    return (r ? n : undefined) ?? "other";
  }
  function DGa(e) {
    if (!e.trim()) {
      return "empty";
    }
    for (let [t, n] of WWp) {
      if (n.test(e)) {
        return t;
      }
    }
    return "other";
  }
  function MGa(e) {
    let t = /'([^']+)' is not recognized/i.exec(e) ?? /CommandNotFoundException.*?\[([^\],]+)/.exec(e);
    if (!t) {
      return null;
    }
    let n = t[1].toLowerCase().replace(/\.exe$/, "");
    if (GWp.vZc(n)) {
      return "bash_builtin";
    }
    if (VWp.vZc(n)) {
      return "dev_tool";
    }
    return "other";
  }
  function NGa(e, t, n, r) {
    let o = FWp(e);
    let s = JEo(o).base;
    if (s === "git") {
      let a = UWp(o);
      if (a === "grep") {
        return Bht(t, n, r);
      }
      if (a === "diff") {
        return NWp(t, n, r);
      }
    }
    return (LWp.get(s) ?? MWp)(t, n, r);
  }
  var MWp = (e, t, n) => ({
    isError: e !== 0,
    message: e !== 0 ? `Command failed with exit code ${e}` : undefined
  });
  var Bht = (e, t, n) => ({
    isError: e !== 0 && e !== 1,
    message: e === 1 ? "No matches found" : undefined
  });
  var NWp = (e, t, n) => ({
    isError: e !== 0 && e !== 1,
    message: e === 1 ? "Files differ" : undefined
  });
  var LWp;
  var BWp;
  var $Wp;
  var HWp;
  var jWp;
  var qWp;
  var WWp;
  var GWp;
  var VWp;
  var LGa = __lazy(() => {
    Kgo();
    LWp = new Map([["grep", Bht], ["rg", Bht], ["egrep", Bht], ["fgrep", Bht], ["findstr", Bht], ["robocopy", (e, t, n) => ({
      isError: e < 0 || e >= 8,
      message: e === 0 ? "No files copied (already in sync)" : e >= 1 && e < 8 ? e & 1 ? "Files copied successfully" : "Robocopy completed (no errors)" : undefined
    })]]);
    BWp = [...s3n, "Invoke-WebRequest", "winget", "choco", "az", "powershell", "cmd", "reg", "sc", "net", "where", "tasklist", "taskkill", "robocopy", "xcopy", "icacls", "certutil", "schtasks"];
    $Wp = ["get", "set", "new", "remove", "test", "start", "stop", "restart", "invoke", "add", "copy", "move", "select", "where", "foreach", "write", "out", "import", "export", "convertto", "convertfrom"];
    HWp = new Map(BWp.map(e => [e.toLowerCase(), e]));
    jWp = new Map($Wp.map(e => [e, `cmdlet_${e}`]));
    qWp = new Set(["set-location", "push-location", "pop-location", "write-output", "write-host"]);
    WWp = [["ps5_chain_op", /token '(&&|\|\||\?\?)' is not a valid|InvalidEndOfLine/i], ["parser_error", /ParserError:|ParseException|TerminatorExpectedAtEndOfString/], ["ps_pipeline_error", /Cannot run a document in the middle of a pipeline/], ["not_recognized", /is not recognized as (a name of a cmdlet|the name of a cmdlet|an? internal)/i], ["command_not_found", /CommandNotFoundException/], ["path_not_found", /ItemNotFoundException|PathNotFound,Microsoft\.PowerShell/], ["access_denied", /UnauthorizedAccessException|PermissionDenied,Microsoft\.PowerShell/], ["parameter_binding", /ParameterBindingException|ParameterArgumentValidationError/], ["object_not_found", /ObjectNotFound: \(|DriveNotFoundException/], ["execution_policy", /running scripts is disabled on this system|PSSecurityException/i], ["ps_module_load_fail", /'[^']+' module could not be loaded|Import-Module ?: The specified module/], ["method_invocation", /MethodInvocationException|MethodException/], ["cannot_convert", /InvalidCastException|ConvertToFinalInvalidCastException/], ["null_expression", /InvokeMethodOnNull|NullArray|PropertyNotFoundStrict|NullReferenceException/], ["io_exception", /\bIOException\b|FileNotFoundException/], ["win_file_error", /The system cannot find the (file|path) specified|The process cannot access the file/], ["win_dll_error", /OPENSSL_Uplink|procedure entry point .+ could not be located|is not a valid Win32 application|DLL load failed/], ["write_error", /WriteErrorException/], ["iwr_basic_parsing", /Internet Explorer engine is not available|WebCmdletIEDomNotSupportedException/i], ["web_request_error", /WebCmdletWebResponseException|The remote server returned an error: \(\d{3}\)|Unable to connect to the remote server|Response status code does not indicate success: \d{3}|No connection could be made because the target machine actively refused/], ["runtime_exception", /: RuntimeException\b|^(?:\x1b\[[0-9;]*m)*RuntimeException: |ScriptHalted/m], ["native_npm", /^npm (ERR!|error)/m], ["native_tsc", /(?:^|\s)error TS\d{4,5}: /m], ["native_dotnet", /: error [A-Z]{2,}\d{4}:|^Build FAILED\./m], ["native_python", /^Traceback \(most recent call last\):/m], ["native_cargo", /^error\[E\d{4}\]|^error: could not compile/m], ["native_rust_panic", /^thread '.+' panicked at /m], ["native_go", /^# [\w./-]+\r?\n.*\.go:\d+:\d+: |^--- FAIL: |^FAIL\t/m], ["native_git", /^(?:\S+ : )?(fatal|error): /m], ["native_node", /^(?:Type|Reference|Syntax|Range)Error[: [\]]|^Error: Cannot find module|^node:internal\/|^E[A-Z]{4,10}: .+, (open|read|write|stat|lstat|scandir|readdir|rename|rmdir|unlink|mkdir|copyfile|realpath|access|chmod|symlink) '/m], ["native_docker", /^docker: Error|^Error response from daemon:|^(?:ERROR: )?failed to (solve|build|fetch|authorize|dial|do request):/m], ["native_pnpm", /ERR_PNPM_[A-Z_]+|^\u2009ELIFECYCLE\u2009/m], ["native_yarn", /^error Command failed|^(?:\u27A4 )?YN0000: .*Failed with errors|^(?:\u27A4 )?YN0001: /m], ["native_test_fail", /^FAIL |^ {2}[\u2717\u00D7\u2716] |^\s+\u25CF (?!Console\b)|^FAILED .+::/m], ["native_eslint", /^\s+\d+:\d+\s+error\s+.+\s{2}[@\w/-]+\r?$/m], ["native_command_error", /NativeCommandError|RemoteException/]];
    GWp = new Set(["head", "tail", "which", "touch", "grep", "sed", "awk", "wc", "chmod", "chown", "ln", "cut", "tr", "uniq", "xargs", "env", "seq", "realpath", "readlink", "basename", "dirname", "printf", "source", "export", "unset", "true", "false", "yes", "stat", "find", "less", "sudo"]);
    VWp = new Set(["git", "gh", "node", "npm", "npx", "yarn", "pnpm", "bun", "python", "python3", "pip", "pip3", "cargo", "rustc", "go", "dotnet", "java", "javac", "mvn", "gradle", "make", "cmake", "docker", "kubectl", "terraform", "az", "aws", "gcloud", "curl", "wget", "jq", "code"]);
  });
  function b9(e) {
    let t = e.replace(XEo, "");
    for (;;) {
      if (t.startsWith("<#")) {
        let n = t.indexOf("#>", 2);
        if (n < 0) {
          break;
        }
        t = t.slice(n + 2).replace(XEo, "");
      } else if (t.startsWith("#")) {
        let n = t.search(/[\r\n]/);
        if (n < 0) {
          break;
        }
        t = t.slice(n).replace(XEo, "");
      } else {
        break;
      }
    }
    return t;
  }
  function T0(e) {
    return e.replace(zWp, "");
  }
  function AU(e) {
    return FGa(e, undefined);
  }
  function QEo(e) {
    return FGa(e, KWp);
  }
  function FGa(e, t) {
    return e.replace(/`[\r\n]+\s*/g, "").replace(/`(?:u\{([0-9a-fA-F]{1,6})\}|([\s\S]?))/g, (n, r, o) => {
      if (r !== undefined) {
        let s = parseInt(r, 16);
        return s <= 1114111 ? String.fromCodePoint(s) : "\uFFFD";
      }
      if (t && o !== undefined && o in t) {
        return t[o];
      }
      return o ?? "";
    });
  }
  var n8e;
  var XEo;
  var zWp;
  var KWp;
  var r8e = __lazy(() => {
    n8e = /[\s\u0085\u180e]+/;
    XEo = /^[\s\u0085\u180e]+/;
    zWp = /^['"\u2018-\u201F]+|['"\u2018-\u201F]+$/g;
    KWp = {
      t: "\t",
      n: `
`,
      r: "\r",
      f: "\f",
      v: "\v"
    };
  });
  function jGa(e) {
    if (!e.startsWith("../")) {
      return e;
    }
    let t = Woe(PM.basename(Nt()));
    if (!t) {
      return e;
    }
    let n = "../" + t + "/";
    let r = e;
    while (r.startsWith(n)) {
      r = r.slice(n.length);
    }
    if (r === "../" + t) {
      return ".";
    }
    return r;
  }
  function T9n(e) {
    let t = e;
    if (t = b9(t), t.length > 0 && (f3.vZc(t[0]) || t[0] === "/")) {
      let r = t.indexOf(":", 1);
      if (r > 0) {
        t = b9(t.slice(r + 1));
      }
    }
    if (t = T0(t), t = AU(t), t = t.replace(/^(?:[A-Za-z0-9_.]+\\){0,3}FileSystem::/i, ""), t = t.replace(/^[A-Za-z]:(?![/\\])/, "./"), t = t.replaceAll("\\", "/"), t === "~" || t.startsWith("~/")) {
      t = (HGa.homedir() + t.slice(1)).replaceAll("\\", "/");
    }
    let n = "";
    if (/^[A-Za-z]:\//.test(t)) {
      n = t.slice(0, 2);
      t = t.slice(2);
    }
    if (t = t.split("/").map(r => {
      if (r === "") {
        return r;
      }
      let o;
      do {
        if (o = r, r = r.replace(/ +$/, ""), r === "." || r === "..") {
          return r;
        }
        r = r.replace(/\.+$/, "");
      } while (r !== o);
      return r || ".";
    }).join("/"), t = PM.posix.normalize(t), n) {
      t = n + t;
    }
    if (t.startsWith("./")) {
      t = t.slice(2);
    }
    return t;
  }
  function Woe(e) {
    return e.toLowerCase().replace(/\u0131/g, "i").replace(/\u017f/g, "s").normalize("NFC").replaceAll("\u03C2", "\u03C3");
  }
  function qGa(e) {
    let t = zt();
    let n = Nt();
    let r = PM.resolve(n, e);
    let o = Fae(t, r) ?? r;
    let s = qd(t, n).resolvedPath;
    let i = s.endsWith(PM.sep) ? s : s + PM.sep;
    let a = Woe(o);
    let l = Woe(s);
    let c = Woe(i);
    if (a === l) {
      return ".";
    }
    if (!a.startsWith(c)) {
      return null;
    }
    return a.slice(c.length).replaceAll("\\", "/");
  }
  function UGa(e) {
    if (e === "head" || e === ".git") {
      return true;
    }
    if (e.startsWith(".git/") || /^git~\d+($|\/)/.test(e)) {
      return true;
    }
    for (let t of YWp) {
      if (t === "head") {
        continue;
      }
      if (e === t || e.startsWith(t + "/")) {
        return true;
      }
    }
    return false;
  }
  function Hht(e) {
    let t = T9n(e);
    let n = jGa(Woe(t));
    if (UGa(n)) {
      return true;
    }
    let r = qGa(t);
    if (r !== null && UGa(r)) {
      return true;
    }
    return false;
  }
  function E9n(e) {
    let t = T9n(e);
    let n = jGa(Woe(t));
    if (BGa(n)) {
      return true;
    }
    let r = qGa(t);
    if (r !== null && BGa(r)) {
      return true;
    }
    return false;
  }
  function BGa(e) {
    if (e === ".git" || e.startsWith(".git/")) {
      return true;
    }
    return /^git~\d+($|\/)/.test(e);
  }
  function v9n(e) {
    if (!e.includes(",")) {
      return [e];
    }
    return [e, ...e.split(",")];
  }
  function $Ga(e) {
    return /[*?[\]$]/.test(e);
  }
  function nGp(e) {
    let t = zt();
    let n = Nt();
    let r = PM.resolve(n, e);
    let o = Rc(r) ? r : Fae(t, r) ?? r;
    let s = qd(t, n).resolvedPath;
    let i = Woe(o);
    if (Woe(s) === i) {
      return true;
    }
    let a = qd(t, getOriginalCwd()).resolvedPath;
    let l = PM.relative(a, s);
    if (l === ".." || l.startsWith(".." + PM.sep) || PM.isAbsolute(l)) {
      return false;
    }
    let c = Woe(a);
    let u = s;
    for (;;) {
      if (Woe(u) === i) {
        return true;
      }
      if (Woe(u) === c || u === PM.dirname(u)) {
        return false;
      }
      u = PM.dirname(u);
    }
  }
  function WGa(e, t = false) {
    let n = [];
    let r = [];
    let o;
    let s = false;
    let i = false;
    let a = [];
    for (let p = 0; p < e.length; p++) {
      let m = b9(e[p]);
      if (m.length === 0 || !f3.vZc(m[0])) {
        r.push(e[p]);
        continue;
      }
      let f = m.indexOf(":", 1);
      let h = (f > 0 ? m.slice(1, f) : m.slice(1)).toLowerCase();
      let g = f > 0 ? m.slice(f + 1) : undefined;
      if (h === "") {
        return true;
      }
      let y = "destination".startsWith(h);
      let _ = XWp.vZc(h) || "literalpath".startsWith(h);
      let b = _ || JWp.some(A => A.startsWith(h));
      let S = QWp.vZc(h) || eGp.some(A => A.startsWith(h));
      let E = ZWp.vZc(h) || tGp.some(A => A.startsWith(h));
      if (Number(y) + Number(b) + Number(S) + Number(E) !== 1) {
        return true;
      }
      if (S) {
        if ("container".startsWith(h) && g !== undefined) {
          let A = T0(b9(g));
          if (!/^\$true$/i.test(A.trim())) {
            i = true;
          }
        }
        continue;
      }
      let x = g ?? e[++p];
      if (x === undefined) {
        continue;
      }
      if (y) {
        o = x;
      } else if (b) {
        if (s = true, _) {
          a.push(...x.split(","));
        } else {
          n.push(...x.split(","));
        }
      }
    }
    let l = (s ? 0 : 1) + (o === undefined ? 1 : 0);
    if (r.length > l) {
      return true;
    }
    let c;
    let u = 0;
    if (!s && u < r.length) {
      n.push(...r[u].split(","));
      u++;
    }
    if (o === undefined && u < r.length) {
      c = r[u];
    }
    if (n.length === 0 && a.length === 0 && !t) {
      return false;
    }
    let d = o ?? c;
    if (d !== undefined) {
      let p = T9n(d);
      if (p === "") {
        p = ".";
      }
      if ($Ga(p)) {
        return true;
      }
      if (!nGp(p)) {
        return false;
      }
    }
    if (i || t) {
      return true;
    }
    for (let [p, m] of [[false, n], [true, a]]) {
      for (let f of m) {
        let h = T9n(f);
        if (h === "") {
          h = ".";
        }
        if (p ? /\$/.test(h) : $Ga(h)) {
          return true;
        }
        let g = PM.posix.basename(h);
        if (g === "." || g === "..") {
          return true;
        }
        if (Hht(g)) {
          return true;
        }
      }
    }
    return false;
  }
  var HGa;
  var PM;
  var YWp;
  var JWp;
  var XWp;
  var QWp;
  var ZWp;
  var eGp;
  var tGp;
  var GGa = __lazy(() => {
    at();
    mm();
    vo();
    r8e();
    HGa = require("os");
    PM = require("path");
    YWp = ["head", "objects", "refs", "hooks"];
    JWp = ["path", "literalpath"];
    XWp = new Set(["pspath", "lp"]);
    QWp = new Set(["cf", "wi", "vb", "db", "usetx"]);
    ZWp = new Set(["ea", "ev", "wa", "wv", "infa", "iv", "proga", "ov", "ob", "pv"]);
    eGp = ["container", "force", "passthru", "recurse", "whatif", "confirm", "usetransaction", "verbose", "debug"];
    tGp = ["filter", "include", "exclude", "credential", "fromsession", "tosession", "erroraction", "errorvariable", "warningaction", "warningvariable", "informationaction", "informationvariable", "progressaction", "outvariable", "outbuffer", "pipelinevariable"];
  });
  function YGa(e) {
    if (e.length < 2) {
      return false;
    }
    return KGa.includes(e) || zGa.some(t => t.startsWith(e));
  }
  var ZEo;
  var evo;
  var VGa;
  var zGa;
  var KGa;
  var cN_;
  var JGa;
  var tvo = __lazy(() => {
    ZEo = ["-verbose", "-debug"];
    evo = ["-erroraction", "-warningaction", "-informationaction", "-progressaction", "-errorvariable", "-warningvariable", "-informationvariable", "-outvariable", "-outbuffer", "-pipelinevariable", "-ea", "-wa", "-infa", "-proga"];
    VGa = new Set([...ZEo, ...evo]);
    zGa = ["-erroraction", "-warningaction", "-informationaction", "-progressaction"];
    KGa = ["-ea", "-wa", "-infa", "-proga"];
    cN_ = new Set([...zGa, ...KGa]);
    JGa = new Set(["silentlycontinue", "0", "stop", "1", "continue", "2", "ignore", "4"]);
  });
  function w9n(e) {
    let t = e;
    for (;;) {
      let n = t.replace(/ +$/, "");
      if (n === "." || n === "..") {
        return n;
      }
      let r = n.replace(/\.+$/, "");
      if (r === t) {
        return r;
      }
      t = r;
    }
  }
  function MO(e, t) {
    let n = (t?.elementTypes ?? []).slice(1);
    let r = t?.args ?? [];
    let o = t?.children;
    for (let s = 0; s < n.length; s++) {
      if (n[s] !== "StringConstant" && n[s] !== "Parameter") {
        if (!/[$(@{[]/.test(r[s] ?? "")) {
          continue;
        }
        return true;
      }
      if (n[s] === "Parameter") {
        let i = o?.[s];
        if (i) {
          if (i.some(a => a.type !== "StringConstant")) {
            return true;
          }
        } else {
          let a = r[s] ?? "";
          let l = a.indexOf(":");
          if (l > 0 && /[$(@{[]/.test(a.slice(l + 1))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  function jht(e) {
    let n = T0(e).replace(/^[A-Za-z]:(?![\\/])/, "");
    let r = [];
    for (let s of n.split(/[\\/]+/)) {
      let i = w9n(s.replace(/:.*$/, ""));
      if (i === "." || i === "") {
        continue;
      }
      if (i === "..") {
        if (r.length > 0 && r.at(-1) !== "..") {
          r.pop();
        } else {
          r.push("..");
        }
        continue;
      }
      r.push(i);
    }
    return (r.at(-1) ?? "").toLowerCase().replace(cGp(), "");
  }
  function uGp(e) {
    if (Wt() !== "windows") {
      return null;
    }
    let t = Nt();
    for (let n of t9a()) {
      let r = e9a.join(t, e + n);
      try {
        if (ZGa.statSync(r).isFile()) {
          return e + n;
        }
      } catch {}
    }
    return null;
  }
  function eh(e) {
    let t = e.toLowerCase();
    if (!t.includes("\\") && !t.includes("/")) {
      t = t.replace(dGp, "");
    }
    let n = _Q[t];
    if (n) {
      return n.toLowerCase();
    }
    return t;
  }
  function l6t(e) {
    let t = e.toLowerCase();
    if (t === "cd.." || t === "cd\\" || t === "cd/" || t === "cd~" || /^[a-z]:$/.test(t)) {
      return true;
    }
    let n = eh(e);
    return n === "set-location" || n === "push-location" || n === "pop-location" || n === "new-psdrive" || Wt() === "windows" && (n === "ndr" || n === "mount");
  }
  function s8e(e) {
    let t = eh(e);
    return oGp.vZc(t);
  }
  function nvo(e, t) {
    let n = eh(e.name);
    if (!sGp.vZc(n)) {
      return false;
    }
    return o8e(e, t);
  }
  function rvo(e) {
    if (e.statementType !== "PipelineAst") {
      return false;
    }
    if (e.commands.length === 0) {
      return false;
    }
    for (let t of e.commands) {
      if (t.elementType !== "CommandAst") {
        return false;
      }
    }
    return true;
  }
  function pGp(e) {
    let t = e.toLowerCase();
    let n = XGa[t];
    if (n) {
      return n;
    }
    let r = eh(t);
    if (r !== t) {
      return XGa[r];
    }
    return;
  }
  function n9a(e) {
    let t = e.trim();
    if (!t) {
      return false;
    }
    if (/\$\(/.test(t)) {
      return true;
    }
    if (/(?:^|[^\w.])@\w+/.test(t)) {
      return true;
    }
    if (/\.\w+\s*\(/.test(t)) {
      return true;
    }
    if (/\$\w+\s*[+\-*/]?=/.test(t)) {
      return true;
    }
    if (/--%/.test(t)) {
      return true;
    }
    if (/\\\\/.test(t) || /(?<!:)\/\//.test(t)) {
      return true;
    }
    if (/::/.test(t)) {
      return true;
    }
    return false;
  }
  function C9n(e, t) {
    if (!e.trim()) {
      return false;
    }
    if (!t) {
      return false;
    }
    if (!t.valid) {
      return false;
    }
    let r = y9(t);
    if (r.hasScriptBlocks || r.hasSubExpressions || r.hasExpandableStrings || r.hasSplatting || r.hasMemberInvocations || r.hasAssignments || r.hasStopParsing) {
      return false;
    }
    let o = r9n(t);
    if (o.length === 0) {
      return false;
    }
    if (o.reduce((i, a) => i + a.commands.length, 0) > 1) {
      if (o.some(a => a.commands.some(l => l6t(l.name)))) {
        return false;
      }
    }
    for (let i of o) {
      if (!i || i.commands.length === 0) {
        return false;
      }
      if (i.redirections.length > 0) {
        if (i.redirections.some(c => !c.isMerging && !Dht(c.target))) {
          return false;
        }
      }
      let a = i.commands[0];
      if (!a) {
        return false;
      }
      if (!o8e(a, e)) {
        return false;
      }
      for (let l = 1; l < i.commands.length; l++) {
        let c = i.commands[l];
        if (!c || c.nameType === "application") {
          return false;
        }
        if (s8e(c.name) && c.args.length === 0) {
          continue;
        }
        if (!o8e(c, e)) {
          return false;
        }
      }
      if (i.nestedCommands && i.nestedCommands.length > 0) {
        return false;
      }
    }
    return true;
  }
  function mGp(e) {
    for (let t = 0; t < e.length; t++) {
      let n = e[t];
      if (!f3.vZc(n[0])) {
        continue;
      }
      let r = n[0] === "-" ? n : "-" + n.slice(1);
      let o = r.indexOf(":");
      let s = (o > 0 ? r.slice(0, o) : r).toLowerCase();
      if (!YGa(s)) {
        continue;
      }
      let a = (o > 0 ? r.slice(o + 1) : e[t + 1] ?? "").toLowerCase().replace(/^['"]|['"]$/g, "").trim();
      if (a.length > 0 && !JGa.vZc(a)) {
        return true;
      }
    }
    return false;
  }
  function a6t(e) {
    return e.includes('"') || /[\s\u0085\u180e]/.test(e) && (e.match(/\\+$/)?.[0].length ?? 0) % 2 === 1;
  }
  function r9a(e) {
    if (e.length === 0 || !(f3.vZc(e[0]) || e[0] === "/")) {
      return null;
    }
    let t = e.indexOf(":", 1);
    if (t <= 0) {
      return null;
    }
    let n = b9(e.slice(t + 1));
    let r = b9(n.replace(/`[\r\n]+\s*/g, ""));
    let o = /^@['"\u2018-\u201F]/.test(n) || /^@['"\u2018-\u201F]/.test(r);
    return {
      colonIdx: t,
      post: n,
      postResolved: r,
      isHereString: o
    };
  }
  function ovo(e, t = true) {
    let n = e.replace(/`[\r\n]+\s*/g, "");
    if (a6t(e) || a6t(QEo(n))) {
      return true;
    }
    if (t) {
      let r = r9a(e);
      if (r !== null) {
        let {
          post: o,
          postResolved: s
        } = r;
        if (r.isHereString) {
          return true;
        }
        let i = T0(s);
        let a = T0(o);
        if (a6t(i) || a6t(a) || a6t(QEo(i))) {
          return true;
        }
      }
    }
    return false;
  }
  function o8e(e, t) {
    if (e.nameType === "application") {
      let a = e.text.split(/\s/, 1)[0]?.toLowerCase() ?? "";
      if (!iGp.vZc(a)) {
        return false;
      }
    }
    let n = pGp(e.name);
    if (!n) {
      return false;
    }
    if (n.regex && !n.regex.test(t)) {
      return false;
    }
    if (n.additionalCommandIsDangerousCallback?.(t, e)) {
      return false;
    }
    if (!e.elementTypes) {
      return false;
    }
    for (let a = 1; a < e.elementTypes.length; a++) {
      let l = e.elementTypes[a];
      if (l !== "StringConstant" && l !== "Parameter") {
        if (!/[$(@{[]/.test(e.args[a - 1] ?? "")) {
          continue;
        }
        return false;
      }
      if (l === "Parameter") {
        let c = e.children?.[a - 1];
        if (c) {
          if (c.some(u => u.type !== "StringConstant")) {
            return false;
          }
        } else {
          let u = e.args[a - 1] ?? "";
          let d = u.indexOf(":");
          if (d > 0 && /[$(@{[]/.test(u.slice(d + 1))) {
            return false;
          }
        }
      }
    }
    let r = eh(e.name);
    let o = aGp.vZc(r);
    let s = r.includes("-");
    let i = e.nameType !== "cmdlet";
    if (Wt() === "windows") {
      if (i || o) {
        for (let a of e.args) {
          if (ovo(a, !s || e.nameType === "application")) {
            return false;
          }
        }
      }
      if (uGp(jht(e.name)) !== null) {
        return false;
      }
    }
    if (!s || e.nameType === "application") {
      for (let a = 1; a < e.elementTypes.length; a++) {
        let l = e.elementTypes[a];
        if (l !== "StringConstant" && l !== "Parameter") {
          return false;
        }
        if (l === "Parameter" && !o && (e.args[a - 1] ?? "").includes(":")) {
          return false;
        }
      }
    }
    if (o) {
      let a = null;
      for (let l = 1; l < e.elementTypes.length; l++) {
        let c = e.args[l - 1] ?? "";
        if (e.elementTypes[l] === "Parameter") {
          let u = r9a(c);
          if (u !== null) {
            if (u.isHereString) {
              return false;
            }
            a ??= e.args.slice(0, l - 1);
            a.push(c.slice(0, u.colonIdx), AU(T0(u.postResolved)));
            continue;
          }
        }
        a?.push(c);
      }
      if (a !== null && !QGa(r, a)) {
        return false;
      }
      return QGa(r, e.args);
    }
    if (s && mGp(e.args)) {
      return false;
    }
    if (n.allowAllFlags) {
      return true;
    }
    if (!n.safeFlags || n.safeFlags.length === 0) {
      return !e.args.some((l, c) => {
        if (s) {
          return CNe(l, e.elementTypes?.[c + 1]);
        }
        return l.startsWith("-") || false;
      });
    }
    for (let a = 0; a < e.args.length; a++) {
      let l = e.args[a];
      if (s ? CNe(l, e.elementTypes?.[a + 1]) : l.startsWith("-") || false) {
        let u = s ? "-" + l.slice(1) : l;
        if (s || l.startsWith("/")) {
          let m = u.indexOf(":");
          if (m > 0) {
            u = u.substring(0, m);
          }
        }
        let d = u.toLowerCase();
        if (s && VGa.vZc(d)) {
          continue;
        }
        if (!(s ? n.safeFlags.some(m => m.toLowerCase() === d) : n.safeFlags.includes(u))) {
          return false;
        }
      }
    }
    return true;
  }
  function QGa(e, t) {
    for (let n of t) {
      if (n.length > 0 && n[0] !== "-" && f3.vZc(n[0])) {
        return false;
      }
    }
    switch (e) {
      case "git":
        return yGp(t);
      case "gh":
        return _Gp(t);
      case "docker":
        return bGp(t);
      case "dotnet":
        return SGp(t);
      default:
        return false;
    }
  }
  function yGp(e) {
    if (e.length === 0) {
      return true;
    }
    if (Wt() === "windows") {
      for (let c of e) {
        if (ovo(c)) {
          return false;
        }
      }
    }
    for (let c of e) {
      if (c.includes("$")) {
        return false;
      }
    }
    let t = 0;
    while (t < e.length) {
      let c = e[t];
      if (!c || !c.startsWith("-")) {
        break;
      }
      for (let p of gGp) {
        if (c.length > p.length && c.startsWith(p) && (p === "-C" || c[p.length] !== "-")) {
          return false;
        }
      }
      let u = c.includes("=");
      let d = u ? ii(c, "=") : c;
      if (fGp.vZc(d)) {
        return false;
      }
      if (!u && hGp.vZc(d)) {
        t += 2;
      } else {
        t++;
      }
    }
    if (t >= e.length) {
      return true;
    }
    let n = e[t]?.toLowerCase() || "";
    let r = t + 1 < e.length ? e[t + 1]?.toLowerCase() || "" : "";
    let o = `git ${n} ${r}`;
    let s = `git ${n}`;
    let i = k3t[o];
    let a = 2;
    if (!i) {
      i = k3t[s];
      a = 1;
    }
    if (!i) {
      return false;
    }
    let l = e.slice(t + a);
    if (n === "ls-remote") {
      let c = false;
      for (let u of l) {
        if (!c && u === "--") {
          c = true;
          continue;
        }
        if (c || u === "-" || !u.startsWith("-")) {
          return false;
        }
      }
    }
    if (i.additionalCommandIsDangerousCallback && i.additionalCommandIsDangerousCallback("", l)) {
      return false;
    }
    return Rdt(l, 0, i, {
      commandName: "git"
    });
  }
  function _Gp(e) {
    return false;
  }
  function bGp(e) {
    if (e.length === 0) {
      return true;
    }
    let t = e.map(s => joe(AU(s.replace(/`[\r\n]+\s*/g, ""))));
    if (Wt() === "windows") {
      for (let s of e) {
        if (ovo(s)) {
          return false;
        }
      }
    }
    for (let s of t) {
      if (s.includes("$")) {
        return false;
      }
    }
    for (let s of t) {
      if (s[0] === "-" && s[1] !== "-") {
        for (let a = 1; a < s.length; a++) {
          if (s[a] === "H") {
            return false;
          }
          if (s[a]?.toLowerCase() === "c") {
            return false;
          }
        }
      }
      let i = s.toLowerCase();
      if (i.startsWith("--host") || i.startsWith("--context") || i.startsWith("--config") || i.startsWith("--tls")) {
        return false;
      }
    }
    let n = `docker ${t[0]?.toLowerCase()}`;
    if (v2n.includes(n)) {
      return true;
    }
    let r = E2n[n];
    if (!r) {
      return false;
    }
    let o = t.slice(1);
    if (r.additionalCommandIsDangerousCallback && r.additionalCommandIsDangerousCallback("", o)) {
      return false;
    }
    return Rdt(o, 0, r);
  }
  function SGp(e) {
    if (e.length === 0) {
      return false;
    }
    for (let t of e) {
      if (!rGp.vZc(t.toLowerCase())) {
        return false;
      }
    }
    return true;
  }
  var ZGa;
  var e9a;
  var rGp;
  var XGa;
  var oGp;
  var sGp;
  var iGp;
  var aGp;
  var lGp;
  var t9a;
  var cGp;
  var dGp;
  var fGp;
  var hGp;
  var gGp;
  var qht = __lazy(() => {
    vo();
    Cs();
    pde();
    Zn();
    tvo();
    r8e();
    ZGa = require("fs");
    e9a = require("path");
    rGp = new Set(["--list-runtimes", "--list-sdks"]);
    XGa = Object.assign(Object.create(null), {
      "get-childitem": {
        safeFlags: ["-Path", "-LiteralPath", "-Filter", "-Include", "-Exclude", "-Recurse", "-Depth", "-Name", "-Force", "-Attributes", "-Directory", "-File", "-Hidden", "-ReadOnly", "-System"]
      },
      "get-content": {
        safeFlags: ["-Path", "-LiteralPath", "-TotalCount", "-Head", "-Tail", "-Raw", "-Encoding", "-Delimiter", "-ReadCount"]
      },
      "get-item": {
        safeFlags: ["-Path", "-LiteralPath", "-Force", "-Stream"]
      },
      "get-itemproperty": {
        safeFlags: ["-Path", "-LiteralPath", "-Name"]
      },
      "test-path": {
        safeFlags: ["-Path", "-LiteralPath", "-PathType", "-Filter", "-Include", "-Exclude", "-IsValid", "-NewerThan", "-OlderThan"]
      },
      "resolve-path": {
        safeFlags: ["-Path", "-LiteralPath", "-Relative"]
      },
      "get-filehash": {
        safeFlags: ["-Path", "-LiteralPath", "-Algorithm", "-InputStream"]
      },
      "get-acl": {
        safeFlags: ["-Path", "-LiteralPath", "-Audit", "-Filter", "-Include", "-Exclude"]
      },
      "set-location": {
        safeFlags: ["-Path", "-LiteralPath", "-PassThru", "-StackName"]
      },
      "push-location": {
        safeFlags: ["-Path", "-LiteralPath", "-PassThru", "-StackName"]
      },
      "pop-location": {
        safeFlags: ["-PassThru", "-StackName"]
      },
      "select-string": {
        safeFlags: ["-Path", "-LiteralPath", "-Pattern", "-InputObject", "-SimpleMatch", "-CaseSensitive", "-Quiet", "-List", "-NotMatch", "-AllMatches", "-Encoding", "-Context", "-Raw", "-NoEmphasis"]
      },
      "convertto-json": {
        safeFlags: ["-InputObject", "-Depth", "-Compress", "-EnumsAsStrings", "-AsArray"]
      },
      "convertfrom-json": {
        safeFlags: ["-InputObject", "-Depth", "-AsHashtable", "-NoEnumerate"]
      },
      "convertto-csv": {
        safeFlags: ["-InputObject", "-Delimiter", "-NoTypeInformation", "-NoHeader", "-UseQuotes"]
      },
      "convertfrom-csv": {
        safeFlags: ["-InputObject", "-Delimiter", "-Header", "-UseCulture"]
      },
      "convertto-xml": {
        safeFlags: ["-InputObject", "-Depth", "-As", "-NoTypeInformation"]
      },
      "convertto-html": {
        safeFlags: ["-InputObject", "-Property", "-Head", "-Title", "-Body", "-Pre", "-Post", "-As", "-Fragment"]
      },
      "format-hex": {
        safeFlags: ["-Path", "-LiteralPath", "-InputObject", "-Encoding", "-Count", "-Offset"]
      },
      "get-member": {
        safeFlags: ["-InputObject", "-MemberType", "-Name", "-Static", "-View", "-Force"]
      },
      "get-unique": {
        safeFlags: ["-InputObject", "-AsString", "-CaseInsensitive", "-OnType"]
      },
      "compare-object": {
        safeFlags: ["-ReferenceObject", "-DifferenceObject", "-Property", "-SyncWindow", "-CaseSensitive", "-Culture", "-ExcludeDifferent", "-IncludeEqual", "-PassThru"]
      },
      "join-string": {
        safeFlags: ["-InputObject", "-Property", "-Separator", "-SingleQuote", "-DoubleQuote", "-FormatString"]
      },
      "get-random": {
        safeFlags: ["-InputObject", "-Minimum", "-Maximum", "-Count", "-SetSeed", "-Shuffle"]
      },
      "convert-path": {
        safeFlags: ["-Path", "-LiteralPath"]
      },
      "join-path": {
        safeFlags: ["-Path", "-ChildPath", "-AdditionalChildPath"]
      },
      "split-path": {
        safeFlags: ["-Path", "-LiteralPath", "-Qualifier", "-NoQualifier", "-Parent", "-Leaf", "-LeafBase", "-Extension", "-IsAbsolute"]
      },
      "get-itempropertyvalue": {
        safeFlags: ["-Path", "-LiteralPath", "-Name"]
      },
      "get-psprovider": {
        safeFlags: ["-PSProvider"]
      },
      "get-computerinfo": {
        allowAllFlags: true
      },
      "get-host": {
        allowAllFlags: true
      },
      "get-date": {
        safeFlags: ["-Date", "-Format", "-UFormat", "-DisplayHint", "-AsUTC"]
      },
      "get-location": {
        safeFlags: ["-PSProvider", "-PSDrive", "-Stack", "-StackName"]
      },
      "get-psdrive": {
        safeFlags: ["-Name", "-PSProvider", "-Scope"]
      },
      "get-module": {
        safeFlags: ["-Name", "-ListAvailable", "-All", "-FullyQualifiedName", "-PSEdition"]
      },
      "get-alias": {
        safeFlags: ["-Name", "-Definition", "-Scope", "-Exclude"]
      },
      "get-history": {
        safeFlags: ["-Id", "-Count"]
      },
      "get-culture": {
        allowAllFlags: true
      },
      "get-uiculture": {
        allowAllFlags: true
      },
      "get-timezone": {
        safeFlags: ["-Name", "-Id", "-ListAvailable"]
      },
      "get-uptime": {
        allowAllFlags: true
      },
      "write-output": {
        safeFlags: ["-InputObject", "-NoEnumerate"],
        additionalCommandIsDangerousCallback: MO
      },
      "write-host": {
        safeFlags: ["-Object", "-NoNewline", "-Separator", "-ForegroundColor", "-BackgroundColor"],
        additionalCommandIsDangerousCallback: MO
      },
      "start-sleep": {
        safeFlags: ["-Seconds", "-Milliseconds", "-Duration"],
        additionalCommandIsDangerousCallback: MO
      },
      "format-table": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "format-list": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "format-wide": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "format-custom": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "measure-object": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "select-object": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "sort-object": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "group-object": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "where-object": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "out-string": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "out-host": {
        allowAllFlags: true,
        additionalCommandIsDangerousCallback: MO
      },
      "get-netadapter": {
        safeFlags: ["-Name", "-InterfaceDescription", "-InterfaceIndex", "-Physical"]
      },
      "get-netipaddress": {
        safeFlags: ["-InterfaceIndex", "-InterfaceAlias", "-AddressFamily", "-Type"]
      },
      "get-netroute": {
        safeFlags: ["-InterfaceIndex", "-InterfaceAlias", "-AddressFamily", "-DestinationPrefix"]
      },
      "get-dnsclient": {
        safeFlags: ["-InterfaceIndex", "-InterfaceAlias"]
      },
      "get-winevent": {
        safeFlags: ["-LogName", "-ListLog", "-ListProvider", "-ProviderName", "-Path", "-MaxEvents", "-FilterXPath", "-Force", "-Oldest"]
      },
      git: {},
      gh: {},
      docker: {},
      ipconfig: {
        safeFlags: ["/all", "/allcompartments"],
        additionalCommandIsDangerousCallback: (e, t) => (t?.args ?? []).some(n => !n.startsWith("/") && !n.startsWith("-"))
      },
      netstat: {
        safeFlags: ["-a", "-b", "-e", "-f", "-n", "-o", "-p", "-q", "-r", "-s", "-t", "-x", "-y"]
      },
      systeminfo: {
        safeFlags: ["/FO", "/NH"]
      },
      tasklist: {
        safeFlags: ["/M", "/SVC", "/V", "/FI", "/FO", "/NH"]
      },
      "where.exe": {
        allowAllFlags: true
      },
      hostname: {
        safeFlags: ["-a", "-d", "-f", "-i", "-I", "-s", "-y", "-A"],
        additionalCommandIsDangerousCallback: (e, t) => (t?.args ?? []).some(n => !n.startsWith("-"))
      },
      whoami: {
        safeFlags: ["/user", "/groups", "/claims", "/priv", "/logonid", "/all", "/fo", "/nh"]
      },
      ver: {
        allowAllFlags: true
      },
      arp: {
        safeFlags: ["-a", "-g", "-v", "-n"],
        additionalCommandIsDangerousCallback: (e, t) => (t?.args ?? []).some(n => !n.startsWith("-"))
      },
      route: {
        safeFlags: ["print", "PRINT", "-4", "-6"],
        additionalCommandIsDangerousCallback: (e, t) => {
          if (!t) {
            return true;
          }
          return t.args.find(r => !r.startsWith("-"))?.toLowerCase() !== "print";
        }
      },
      getmac: {
        safeFlags: ["/FO", "/NH", "/V"]
      },
      tree: {
        safeFlags: ["/F", "/A", "/Q", "/L"]
      },
      findstr: {
        safeFlags: ["/B", "/E", "/L", "/R", "/S", "/I", "/X", "/V", "/N", "/M", "/O", "/P", "/C", "/G", "/D", "/A"]
      },
      dotnet: {}
    });
    oGp = new Set(["out-null"]);
    sGp = new Set(["format-table", "format-list", "format-wide", "format-custom", "measure-object", "select-object", "sort-object", "group-object", "where-object", "out-string", "out-host"]);
    iGp = new Set(["where.exe"]);
    aGp = new Set(["git", "gh", "docker", "dotnet"]);
    lGp = ["", ".exe", ".bat", ".cmd", ".com", ".ps1", ".vbs", ".js", ".wsf", ".vbe", ".jse", ".wsh", ".msc", ".cpl"];
    t9a = TEr(() => {
      let e = new Set(lGp);
      let t = (process.env.PATHEXT ?? "").split(";");
      for (let n of t.slice(0, 64)) {
        let r = n.trim().toLowerCase();
        if (r.startsWith(".") && r.length <= 16) {
          e.add(r);
        }
      }
      return [...e];
    }, () => process.env.PATHEXT ?? "");
    cGp = TEr(() => {
      let e = t9a().filter(t => t !== "").map(t => FA(t.slice(1)));
      return new RegExp(`\\.(${e.join("|")})$`, "i");
    }, () => process.env.PATHEXT ?? "");
    dGp = /\.(exe|cmd|bat|com)$/;
    fGp = new Set(["-c", "-C", "--exec-path", "--config-env", "--git-dir", "--work-tree", "--bare", "--attr-source", "--help", "-h", "--shallow-file"]);
    hGp = new Set(["-c", "-C", "--exec-path", "--config-env", "--git-dir", "--work-tree", "--namespace", "--super-prefix", "--shallow-file"]);
    gGp = ["-c", "-C"];
  });
  function svo(e) {
    let t = eh(e);
    return TGp.vZc(t);
  }
  function vGp(e) {
    return e.length >= 3 && "-itemtype".startsWith(e) || e.length >= 3 && "-type".startsWith(e);
  }
  function ivo(e) {
    if (eh(e.name) !== "new-item") {
      return false;
    }
    for (let n = 0; n < e.args.length; n++) {
      let r = e.args[n] ?? "";
      if (r.length === 0) {
        continue;
      }
      let s = (f3.vZc(r[0]) || r[0] === "/" ? "-" + r.slice(1) : r).toLowerCase();
      let i = s.indexOf(":", 1);
      let a = i > 0 ? s.slice(0, i) : s;
      let l = AU(a.replace(/`[\r\n]+\s*/g, "")).toLowerCase();
      if (!vGp(l)) {
        continue;
      }
      let c = i > 0 ? s.slice(i + 1) : e.args[n + 1]?.toLowerCase() ?? "";
      let u = T0(b9(AU(c.replace(/`[\r\n]+\s*/g, "")))).toLowerCase();
      if (/[?*[\]($]/.test(u)) {
        return true;
      }
      for (let d of EGp) {
        if (u.length > 0 && d.startsWith(u)) {
          return true;
        }
      }
    }
    return false;
  }
  function avo(e, t, n) {
    if (n.mode === "bypassPermissions" || n.mode === "dontAsk") {
      return {
        behavior: "passthrough",
        message: "Mode is handled in main permission flow"
      };
    }
    if (n.mode !== "acceptEdits") {
      return {
        behavior: "passthrough",
        message: "No mode-specific validation required"
      };
    }
    if (!t.valid) {
      return {
        behavior: "passthrough",
        message: "Cannot validate mode for unparsed command"
      };
    }
    let r = y9(t);
    if (r.hasSubExpressions || r.hasScriptBlocks || r.hasMemberInvocations || r.hasSplatting || r.hasAssignments || r.hasStopParsing || r.hasExpandableStrings) {
      return {
        behavior: "passthrough",
        message: "Command contains subexpressions, script blocks, or member invocations that require approval"
      };
    }
    let o = r9n(t);
    if (o.length === 0) {
      return {
        behavior: "passthrough",
        message: "No commands found to validate for acceptEdits mode"
      };
    }
    let s = o.reduce((a, l) => a + l.commands.length, 0);
    if (o.some(a => a.commands.some(l => l.elementType === "CommandAst" && ivo(l)))) {
      return {
        behavior: "passthrough",
        message: "Command creates a filesystem link (New-Item -ItemType SymbolicLink/Junction/HardLink) \u2014 cannot auto-allow because later path validation cannot follow just-created links"
      };
    }
    if (s > 1) {
      let a = false;
      let l = false;
      for (let c of o) {
        for (let u of c.commands) {
          if (u.elementType !== "CommandAst") {
            continue;
          }
          if (l6t(u.name)) {
            a = true;
          }
          if (svo(u.name)) {
            l = true;
          }
        }
      }
      if (a && l) {
        return {
          behavior: "passthrough",
          message: "Compound command contains a directory-changing command (Set-Location/Push-Location/Pop-Location) with a write operation \u2014 cannot auto-allow because path validation uses stale cwd"
        };
      }
    }
    for (let a of o) {
      for (let l of a.commands) {
        if (l.elementType !== "CommandAst") {
          return {
            behavior: "passthrough",
            message: `Pipeline contains expression source (${l.elementType}) that cannot be statically validated`
          };
        }
        if (l.nameType === "application") {
          return {
            behavior: "passthrough",
            message: `Command '${l.name}' resolved from a path-like name and requires approval`
          };
        }
        if (l.elementTypes) {
          for (let c = 1; c < l.elementTypes.length; c++) {
            let u = l.elementTypes[c];
            if (u !== "StringConstant" && u !== "Parameter") {
              return {
                behavior: "passthrough",
                message: `Command argument has unvalidatable type (${u}) \u2014 variable paths cannot be statically resolved`
              };
            }
            if (u === "Parameter") {
              let d = l.args[c - 1] ?? "";
              let p = d.indexOf(":");
              if (p > 0 && /[$(@{[]/.test(d.slice(p + 1))) {
                return {
                  behavior: "passthrough",
                  message: "Colon-bound parameter contains an expression that cannot be statically validated"
                };
              }
            }
          }
        }
        if (s8e(l.name) || nvo(l, e.command)) {
          continue;
        }
        if (!svo(l.name)) {
          return {
            behavior: "passthrough",
            message: `No mode-specific handling for '${l.name}' in acceptEdits mode`
          };
        }
        if (MO(l.name, l)) {
          return {
            behavior: "passthrough",
            message: `Arguments in '${l.name}' cannot be statically validated in acceptEdits mode`
          };
        }
      }
      if (a.nestedCommands) {
        for (let l of a.nestedCommands) {
          if (l.elementType !== "CommandAst") {
            return {
              behavior: "passthrough",
              message: `Nested expression element (${l.elementType}) cannot be statically validated`
            };
          }
          if (l.nameType === "application") {
            return {
              behavior: "passthrough",
              message: `Nested command '${l.name}' resolved from a path-like name and requires approval`
            };
          }
          if (s8e(l.name) || nvo(l, e.command)) {
            continue;
          }
          if (!svo(l.name)) {
            return {
              behavior: "passthrough",
              message: `No mode-specific handling for '${l.name}' in acceptEdits mode`
            };
          }
          if (MO(l.name, l)) {
            return {
              behavior: "passthrough",
              message: `Arguments in nested '${l.name}' cannot be statically validated in acceptEdits mode`
            };
          }
        }
      }
    }
    return {
      behavior: "allow",
      updatedInput: e,
      decisionReason: {
        type: "mode",
        mode: "acceptEdits"
      }
    };
  }
  var TGp;
  var EGp;
  var o9a = __lazy(() => {
    qht();
    r8e();
    TGp = new Set(["set-content", "add-content", "remove-item", "clear-content"]);
    EGp = new Set(["symboliclink", "junction", "hardlink"]);
  });
  function R9n(e, t) {
    for (let n of t) {
      if (n === e || e.length > 1 && n.startsWith(e)) {
        return true;
      }
    }
    return false;
  }
  function uvo(e) {
    if (Wt() !== "windows") {
      return e;
    }
    return e.split(/([/\\])/).map((t, n) => {
      if (n % 2 !== 0) {
        return t;
      }
      return w9n(t);
    }).join("");
  }
  function I9n(e) {
    return T0(b9(e));
  }
  function cvo(e) {
    if (/['"\u2018-\u201F]/.test(e)) {
      return true;
    }
    let t = I9n(e);
    return t.includes(",") || t.startsWith("(") || t.startsWith("[") || t.includes("`") || t.includes("@(") || t.startsWith("@") || t.includes("$");
  }
  function x9n(e) {
    let t = e.length;
    if (t <= 5) {
      return e.map(r => `'${r}'`).join(", ");
    }
    return `${e.slice(0, 5).map(r => `'${r}'`).join(", ")}, and ${t - 5} more`;
  }
  function O9n(e) {
    if (e === "~" || e.startsWith("~/") || e.startsWith("~\\")) {
      return i9a.homedir() + e.slice(1);
    }
    return e;
  }
  function c6t(e) {
    let t = T0(e);
    let n = t.indexOf("::");
    if (n >= 0) {
      t = t.slice(n + 2);
    }
    if (t = O9n(t).replace(/\\/g, "/"), IU.isAbsolute(t)) {
      t = IU.normalize(t);
    }
    return kdt(t);
  }
  function i8e(e) {
    return {
      behavior: "deny",
      message: `Remove-Item on system path '${e}' is blocked. This path is protected from removal.`,
      decisionReason: {
        type: "safetyCheck",
        reason: "Removal targets a protected system path",
        classifierApprovable: false
      }
    };
  }
  function wGp(e, t, n, r) {
    let o = n === "read" ? "read" : "edit";
    let s = r ?? fg(e);
    for (let l of s) {
      let c = matchingRuleForInput(l, t, o, "deny");
      if (c !== null) {
        return {
          allowed: false,
          decisionReason: {
            type: "rule",
            rule: c
          }
        };
      }
    }
    if (n !== "read") {
      let l = checkEditableInternalPath(e, {}, s);
      if (l.behavior === "deny") {
        return {
          allowed: false,
          decisionReason: untypeDenyReasonForAskPropagation(l.decisionReason)
        };
      }
      if (l.behavior === "allow") {
        return {
          allowed: true,
          decisionReason: l.decisionReason
        };
      }
    }
    if (n !== "read") {
      let l = checkPathSafetyForAutoEdit(e, s, undefined, t.isRemoteMode, t.trustedNetworkDirectories);
      if (!l.safe) {
        return {
          allowed: false,
          decisionReason: {
            type: "safetyCheck",
            reason: l.message,
            classifierApprovable: l.classifierApprovable
          }
        };
      }
    }
    let i = pathInAllowedWorkingPath(e, t, s);
    if (i) {
      if (n === "read" || t.mode === "acceptEdits") {
        return {
          allowed: true
        };
      }
    }
    if (n === "read") {
      let l = checkReadableInternalPath(e, {}, s);
      if (l.behavior === "deny") {
        return {
          allowed: false,
          decisionReason: untypeDenyReasonForAskPropagation(l.decisionReason)
        };
      }
      if (l.behavior === "allow") {
        return {
          allowed: true,
          decisionReason: l.decisionReason
        };
      }
    }
    if (n !== "read" && !i && Ico(e)) {
      return {
        allowed: true,
        decisionReason: {
          type: "other",
          reason: "Path is in sandbox write allowlist"
        }
      };
    }
    let a = matchingAllowRuleForAllPaths(s, t, o);
    if (a !== null) {
      return {
        allowed: true,
        decisionReason: {
          type: "rule",
          rule: a
        }
      };
    }
    return {
      allowed: false
    };
  }
  function P9n(e, t, n, r) {
    if (!e || e.includes("\x00")) {
      return null;
    }
    let o = O9n(uvo(e));
    let s = IU.isAbsolute(o) ? o : IU.resolve(t, o);
    let {
      resolvedPath: i
    } = qd(zt(), s);
    let l = matchingRuleForInput(i, n, r === "read" ? "read" : "edit", "deny");
    return l ? {
      resolvedPath: i,
      rule: l
    } : null;
  }
  function k9n(e, t, n, r) {
    let s = O9n(T0(e)).replaceAll("\\", "/");
    if (/^~[^/]/.test(s)) {
      return {
        allowed: false,
        resolvedPath: s,
        decisionReason: {
          type: "other",
          reason: "Paths beginning with ~user cannot be statically validated and require manual approval"
        }
      };
    }
    if (s.includes("`")) {
      let d = AU(s);
      let p = P9n(d, t, n, r);
      if (p) {
        return {
          allowed: false,
          resolvedPath: p.resolvedPath,
          decisionReason: {
            type: "rule",
            rule: p.rule
          }
        };
      }
      return {
        allowed: false,
        resolvedPath: s,
        decisionReason: {
          type: "other",
          reason: "Backtick escape characters in paths cannot be statically validated and require manual approval"
        }
      };
    }
    if (s.includes("::")) {
      let d = s.slice(s.indexOf("::") + 2);
      let p = P9n(d, t, n, r);
      if (p) {
        return {
          allowed: false,
          resolvedPath: p.resolvedPath,
          decisionReason: {
            type: "rule",
            rule: p.rule
          }
        };
      }
      return {
        allowed: false,
        resolvedPath: s,
        decisionReason: {
          type: "other",
          reason: "Module-qualified provider paths (::) cannot be statically validated and require manual approval"
        }
      };
    }
    if (Wt() === "windows" && /^[a-z]:(?![/\\])/i.test(s)) {
      return {
        allowed: false,
        resolvedPath: s,
        decisionReason: {
          type: "other",
          reason: `Path '${s}' is drive-relative (resolves against the per-drive current directory, which cannot be statically validated) and requires manual approval`
        }
      };
    }
    if (s = uvo(s), s.startsWith("//") || /DavWWWRoot/i.test(s) || /@SSL@/i.test(s)) {
      return {
        allowed: false,
        resolvedPath: s,
        decisionReason: {
          type: "other",
          reason: "UNC paths are blocked because they can trigger network requests and credential leakage"
        }
      };
    }
    if (s.includes("$") || s.includes("%")) {
      return {
        allowed: false,
        resolvedPath: s,
        decisionReason: {
          type: "other",
          reason: "Variable expansion syntax in paths requires manual approval"
        }
      };
    }
    if ((Wt() === "windows" ? /^[a-z0-9]{2,}:/i : /^[a-z0-9]+:/i).test(s)) {
      return {
        allowed: false,
        resolvedPath: s,
        decisionReason: {
          type: "other",
          reason: `Path '${s}' uses a non-filesystem provider and requires manual approval`
        }
      };
    }
    if (I3t(s)) {
      let d = P9n(s, t, n, r);
      if (d) {
        return {
          allowed: false,
          resolvedPath: d.resolvedPath,
          decisionReason: {
            type: "rule",
            rule: d.rule
          }
        };
      }
      return {
        allowed: false,
        resolvedPath: IU.resolve(t, s),
        decisionReason: {
          type: "other",
          reason: "Path contains '..' traversal after a directory segment, which may follow a symlink outside the working directory"
        }
      };
    }
    if (Oae(s) !== -1) {
      if (r === "write" || r === "create") {
        return {
          allowed: false,
          resolvedPath: s,
          decisionReason: {
            type: "other",
            reason: "Glob patterns are not allowed in write operations. Please specify an exact file path."
          }
        };
      }
      if (fle(s)) {
        let g = IU.isAbsolute(s) ? s : IU.resolve(t, s);
        let {
          resolvedPath: y
        } = qd(zt(), g);
        let _ = r === "read" ? "read" : "edit";
        for (let b of fg(y)) {
          let S = matchingRuleForInput(b, n, _, "deny");
          if (S !== null) {
            return {
              allowed: false,
              resolvedPath: y,
              decisionReason: {
                type: "rule",
                rule: S
              }
            };
          }
        }
        return {
          allowed: false,
          resolvedPath: y,
          decisionReason: {
            type: "other",
            reason: "Glob patterns in paths cannot be statically validated \u2014 symlinks inside the glob expansion are not examined. Requires manual approval."
          }
        };
      }
      let d = CGp(s);
      let p = IU.isAbsolute(d) ? d : IU.resolve(t, d);
      let {
        resolvedPath: m
      } = qd(zt(), p);
      let h = matchingRuleForInput(m, n, r === "read" ? "read" : "edit", "deny");
      if (h !== null) {
        return {
          allowed: false,
          resolvedPath: m,
          decisionReason: {
            type: "rule",
            rule: h
          }
        };
      }
      return {
        allowed: false,
        resolvedPath: m,
        decisionReason: {
          type: "other",
          reason: "Glob patterns in paths cannot be statically validated \u2014 symlinks inside the glob expansion are not examined. Requires manual approval."
        }
      };
    }
    let a = IU.isAbsolute(s) ? s : IU.resolve(t, s);
    let {
      resolvedPath: l,
      isCanonical: c
    } = qd(zt(), a);
    let u = wGp(l, n, r, c ? [l] : undefined);
    return {
      allowed: u.allowed,
      resolvedPath: l,
      decisionReason: u.decisionReason
    };
  }
  function CGp(e) {
    let t = Oae(e);
    if (t === -1) {
      return e;
    }
    let n = e.substring(0, t);
    let r = Math.max(n.lastIndexOf("/"), n.lastIndexOf("\\"));
    if (r === -1) {
      return ".";
    }
    return n.substring(0, r + 1) || "/";
  }
  function s9a(e) {
    let t = eh(e.name);
    let n = A9n[t];
    if (!n) {
      return {
        paths: [],
        operationType: "read",
        hasUnvalidatablePathArg: false,
        optionalWrite: false
      };
    }
    let r = [...n.knownSwitches, ...ZEo];
    let o = [...n.knownValueParams, ...evo];
    let s = [];
    let i = e.args;
    let a = e.elementTypes;
    let l = false;
    let c = 0;
    let u = n.positionalSkip ?? 0;
    function d(p) {
      if (!a) {
        return;
      }
      let m = a[p + 1];
      if (m && !RGp.vZc(m)) {
        l = true;
      }
    }
    for (let p = 0; p < i.length; p++) {
      let m = i[p];
      if (!m) {
        continue;
      }
      let f = a ? a[p + 1] : undefined;
      if (CNe(m, f)) {
        let h = "-" + m.slice(1);
        let g = h.indexOf(":", 1);
        let _ = (g > 0 ? h.substring(0, g) : h).toLowerCase();
        if (R9n(_, n.pathParams)) {
          let b;
          if (g > 0) {
            let S = m.substring(g + 1);
            if (cvo(S)) {
              l = true;
            }
            b = I9n(S);
          } else {
            let S = i[p + 1];
            let E = a ? a[p + 2] : undefined;
            if (S && !CNe(S, E)) {
              b = S;
              d(p + 1);
              p++;
            }
          }
          if (b) {
            s.push(b);
          }
        } else if (n.leafOnlyPathParams && R9n(_, n.leafOnlyPathParams)) {
          let b;
          if (g > 0) {
            let S = m.substring(g + 1);
            if (cvo(S)) {
              l = true;
            }
            b = I9n(S);
          } else {
            let S = i[p + 1];
            let E = a ? a[p + 2] : undefined;
            if (S && !CNe(S, E)) {
              b = S;
              d(p + 1);
              p++;
            }
          }
          if (b !== undefined) {
            if (b.includes("/") || b.includes("\\") || b === "." || b === "..") {
              l = true;
            } else {
              s.push(b);
            }
          }
        } else if (R9n(_, r)) {
          ;
        } else if (R9n(_, o)) {
          if (g > 0) {
            if (cvo(m.substring(g + 1))) {
              l = true;
            }
          } else {
            let b = i[p + 1];
            let S = a ? a[p + 2] : undefined;
            if (b && !CNe(b, S)) {
              d(p + 1);
              p++;
            }
          }
        } else if (l = true, g > 0) {
          let b = m.substring(g + 1);
          s.push(I9n(b));
        }
        continue;
      }
      if (c < u) {
        c++;
        continue;
      }
      c++;
      d(p);
      s.push(m);
    }
    return {
      paths: s,
      operationType: n.operationType,
      hasUnvalidatablePathArg: l,
      optionalWrite: n.optionalWrite ?? false
    };
  }
  function a9a(e, t, n, r = false) {
    if (!t.valid) {
      return {
        behavior: "passthrough",
        message: "Cannot validate paths for unparsed command"
      };
    }
    let o;
    for (let s of t.statements) {
      let i = kGp(s, n, r);
      if (i.behavior === "deny") {
        return i;
      }
      if (i.behavior === "ask" && !o) {
        o = i;
      }
    }
    return o ?? {
      behavior: "passthrough",
      message: "All path constraints validated successfully"
    };
  }
  function kGp(e, t, n = false) {
    let r = Nt();
    let o;
    if (n) {
      o = {
        behavior: "ask",
        message: "Compound command changes working directory (Set-Location/Push-Location/Pop-Location/New-PSDrive) \u2014 relative paths cannot be validated against the original cwd and require manual approval",
        decisionReason: {
          type: "other",
          reason: "Compound command contains cd with path operation \u2014 manual approval required to prevent path resolution bypass"
        }
      };
    }
    let s = false;
    let i;
    let a = false;
    for (let l of e.commands) {
      if (l.elementType !== "CommandAst") {
        s = true;
        i = l.text;
        continue;
      }
      let {
        paths: c,
        operationType: u,
        hasUnvalidatablePathArg: d,
        optionalWrite: p
      } = s9a(l);
      let m = eh(l.name);
      let f = A9n[m] !== undefined;
      let h = a;
      if (!xGp.vZc(m)) {
        a = true;
      }
      if (s) {
        let y = eh(l.name);
        if (i !== undefined) {
          let _ = T0(i);
          let b = P9n(_, r, t, u);
          if (b) {
            return {
              behavior: "deny",
              message: `${y} targeting '${b.resolvedPath}' was blocked by a deny rule`,
              decisionReason: {
                type: "rule",
                rule: b.rule
              }
            };
          }
        }
        o ??= {
          behavior: "ask",
          message: `${y} receives its path from a pipeline expression source that cannot be statically validated and requires manual approval`
        };
      }
      if (d) {
        let y = eh(l.name);
        o ??= {
          behavior: "ask",
          message: `${y} uses a parameter or complex path expression (array literal, subexpression, unknown parameter, etc.) that cannot be statically validated and requires manual approval`
        };
      }
      if (u !== "read" && !p && c.length === 0 && A9n[eh(l.name)]) {
        let y = eh(l.name);
        o ??= {
          behavior: "ask",
          message: `${y} is a write operation but no target path could be determined; requires manual approval`
        };
        continue;
      }
      if (h && f) {
        o ??= {
          behavior: "ask",
          message: `${m} may receive a path from an upstream pipeline command whose output cannot be statically validated and requires manual approval`
        };
      }
      let g = eh(l.name) === "remove-item";
      if (g) {
        if (l.args.some(_ => {
          let b = (_.length > 0 ? "-" + _.slice(1) : _).toLowerCase();
          let S = b.indexOf(":");
          let E = S > 0 ? b.slice(0, S) : b;
          return E.length >= 2 && "-recurse".startsWith(E);
        })) {
          let _ = normalizeCaseForComparison(r);
          for (let b of c) {
            let S = O9n(uvo(b)).replace(/\\/g, "/");
            let E = IU.isAbsolute(S) ? IU.resolve(S) : IU.resolve(r, S);
            let C = normalizeCaseForComparison(E);
            if (C === _ || _.startsWith(C + "/") || _.startsWith(C + "\\")) {
              o ??= {
                behavior: "ask",
                message: `Remove-Item -Recurse targeting '${b}' would delete the working directory including .git and .claude \u2014 requires manual approval`
              };
              break;
            }
          }
        }
      }
      for (let y of c) {
        if (g && c6t(y)) {
          return i8e(y);
        }
        let {
          allowed: _,
          resolvedPath: b,
          decisionReason: S
        } = k9n(y, r, t, u);
        if (g && kdt(b)) {
          return i8e(b);
        }
        if (!_) {
          let E = eh(l.name);
          let C = Array.from(allWorkingDirectories(t));
          let x = x9n(C);
          let A = S?.type === "other" || S?.type === "safetyCheck" ? S.reason : `${E} targeting '${b}' was blocked. For security, Claude Code may only access files in the allowed working directories for this session: ${x}.`;
          if (S?.type === "rule") {
            return {
              behavior: "deny",
              message: A,
              decisionReason: S
            };
          }
          let k = [];
          if (b) {
            if (u === "read") {
              let I = G5e(YB(b), "session");
              if (I) {
                k.push(I);
              }
            } else {
              k.push({
                type: "addDirectories",
                directories: [YB(b)],
                destination: "session"
              });
            }
          }
          if ((u === "write" || u === "create") && (t.mode === "default" || t.mode === "plan")) {
            k.push({
              type: "setMode",
              mode: "acceptEdits",
              destination: "session"
            });
          }
          o ??= {
            behavior: "ask",
            message: A,
            blockedPath: b,
            decisionReason: S,
            suggestions: k
          };
        }
      }
    }
    if (e.nestedCommands) {
      for (let l of e.nestedCommands) {
        let {
          paths: c,
          operationType: u,
          hasUnvalidatablePathArg: d,
          optionalWrite: p
        } = s9a(l);
        if (d) {
          let f = eh(l.name);
          o ??= {
            behavior: "ask",
            message: `${f} uses a parameter or complex path expression (array literal, subexpression, unknown parameter, etc.) that cannot be statically validated and requires manual approval`
          };
        }
        if (u !== "read" && !p && c.length === 0 && A9n[eh(l.name)]) {
          let f = eh(l.name);
          o ??= {
            behavior: "ask",
            message: `${f} is a write operation but no target path could be determined; requires manual approval`
          };
          continue;
        }
        let m = eh(l.name) === "remove-item";
        for (let f of c) {
          if (m && c6t(f)) {
            return i8e(f);
          }
          let {
            allowed: h,
            resolvedPath: g,
            decisionReason: y
          } = k9n(f, r, t, u);
          if (m && kdt(g)) {
            return i8e(g);
          }
          if (!h) {
            let _ = eh(l.name);
            let b = Array.from(allWorkingDirectories(t));
            let S = x9n(b);
            let E = y?.type === "other" || y?.type === "safetyCheck" ? y.reason : `${_} targeting '${g}' was blocked. For security, Claude Code may only access files in the allowed working directories for this session: ${S}.`;
            if (y?.type === "rule") {
              return {
                behavior: "deny",
                message: E,
                decisionReason: y
              };
            }
            let C = [];
            if (g) {
              if (u === "read") {
                let x = G5e(YB(g), "session");
                if (x) {
                  C.push(x);
                }
              } else {
                C.push({
                  type: "addDirectories",
                  directories: [YB(g)],
                  destination: "session"
                });
              }
            }
            if ((u === "write" || u === "create") && (t.mode === "default" || t.mode === "plan")) {
              C.push({
                type: "setMode",
                mode: "acceptEdits",
                destination: "session"
              });
            }
            o ??= {
              behavior: "ask",
              message: E,
              blockedPath: g,
              decisionReason: y,
              suggestions: C
            };
          }
        }
        if (s) {
          o ??= {
            behavior: "ask",
            message: `${eh(l.name)} appears inside a control-flow or chain statement where piped expression sources cannot be statically validated and requires manual approval`
          };
        }
      }
    }
    if (e.nestedCommands) {
      for (let l of e.nestedCommands) {
        if (l.redirections) {
          for (let c of l.redirections) {
            if (c.isMerging) {
              continue;
            }
            if (!c.target) {
              continue;
            }
            if (Dht(c.target)) {
              continue;
            }
            let {
              allowed: u,
              resolvedPath: d,
              decisionReason: p
            } = k9n(c.target, r, t, "create");
            if (!u) {
              let m = Array.from(allWorkingDirectories(t));
              let f = x9n(m);
              let h = p?.type === "other" || p?.type === "safetyCheck" ? p.reason : `Output redirection to '${d}' was blocked. For security, Claude Code may only write to files in the allowed working directories for this session: ${f}.`;
              if (p?.type === "rule") {
                return {
                  behavior: "deny",
                  message: h,
                  decisionReason: p
                };
              }
              o ??= {
                behavior: "ask",
                message: h,
                blockedPath: d,
                decisionReason: p,
                suggestions: [{
                  type: "addDirectories",
                  directories: [YB(d)],
                  destination: "session"
                }]
              };
            }
          }
        }
      }
    }
    if (e.redirections) {
      for (let l of e.redirections) {
        if (l.isMerging) {
          continue;
        }
        if (!l.target) {
          continue;
        }
        if (Dht(l.target)) {
          continue;
        }
        let {
          allowed: c,
          resolvedPath: u,
          decisionReason: d
        } = k9n(l.target, r, t, "create");
        if (!c) {
          let p = Array.from(allWorkingDirectories(t));
          let m = x9n(p);
          let f = d?.type === "other" || d?.type === "safetyCheck" ? d.reason : `Output redirection to '${u}' was blocked. For security, Claude Code may only write to files in the allowed working directories for this session: ${m}.`;
          if (d?.type === "rule") {
            return {
              behavior: "deny",
              message: f,
              decisionReason: d
            };
          }
          o ??= {
            behavior: "ask",
            message: f,
            blockedPath: u,
            decisionReason: d,
            suggestions: [{
              type: "addDirectories",
              directories: [YB(u)],
              destination: "session"
            }]
          };
        }
      }
    }
    return o ?? {
      behavior: "passthrough",
      message: "All path constraints validated successfully"
    };
  }
  var i9a;
  var IU;
  var A9n;
  var RGp;
  var xGp;
  var l9a = __lazy(() => {
    vo();
    ku();
    wm();
    Zk();
    mde();
    Cs();
    tvo();
    qht();
    r8e();
    i9a = require("os");
    IU = require("path");
    A9n = {
      "set-content": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-passthru", "-force", "-whatif", "-confirm", "-usetransaction", "-nonewline", "-asbytestream"],
        knownValueParams: ["-value", "-filter", "-include", "-exclude", "-credential", "-encoding", "-stream"]
      },
      "add-content": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-passthru", "-force", "-whatif", "-confirm", "-usetransaction", "-nonewline", "-asbytestream"],
        knownValueParams: ["-value", "-filter", "-include", "-exclude", "-credential", "-encoding", "-stream"]
      },
      "remove-item": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-recurse", "-force", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-filter", "-include", "-exclude", "-credential", "-stream"]
      },
      "clear-content": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-filter", "-include", "-exclude", "-credential", "-stream"]
      },
      "out-file": {
        operationType: "write",
        pathParams: ["-filepath", "-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-append", "-force", "-noclobber", "-nonewline", "-whatif", "-confirm"],
        knownValueParams: ["-inputobject", "-encoding", "-width"]
      },
      "tee-object": {
        operationType: "write",
        pathParams: ["-filepath", "-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-append"],
        knownValueParams: ["-inputobject", "-variable", "-encoding"]
      },
      "export-csv": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-append", "-force", "-noclobber", "-notypeinformation", "-includetypeinformation", "-useculture", "-noheader", "-whatif", "-confirm"],
        knownValueParams: ["-inputobject", "-delimiter", "-encoding", "-quotefields", "-usequotes"]
      },
      "export-clixml": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-noclobber", "-whatif", "-confirm"],
        knownValueParams: ["-inputobject", "-depth", "-encoding"]
      },
      "new-item": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        leafOnlyPathParams: ["-name"],
        knownSwitches: ["-force", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-itemtype", "-value", "-credential", "-type"]
      },
      "copy-item": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp", "-destination"],
        knownSwitches: ["-container", "-force", "-passthru", "-recurse", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-filter", "-include", "-exclude", "-credential", "-fromsession", "-tosession"]
      },
      "move-item": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp", "-destination"],
        knownSwitches: ["-force", "-passthru", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-filter", "-include", "-exclude", "-credential"]
      },
      "rename-item": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-passthru", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-newname", "-credential", "-filter", "-include", "-exclude"]
      },
      "set-item": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-passthru", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-value", "-credential", "-filter", "-include", "-exclude"]
      },
      "get-content": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-usetransaction", "-wait", "-raw", "-asbytestream"],
        knownValueParams: ["-readcount", "-totalcount", "-tail", "-first", "-head", "-last", "-filter", "-include", "-exclude", "-credential", "-delimiter", "-encoding", "-stream"]
      },
      "get-childitem": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-recurse", "-force", "-name", "-usetransaction", "-followsymlink", "-directory", "-file", "-hidden", "-readonly", "-system"],
        knownValueParams: ["-filter", "-include", "-exclude", "-depth", "-attributes", "-credential"]
      },
      "get-item": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-usetransaction"],
        knownValueParams: ["-filter", "-include", "-exclude", "-credential", "-stream"]
      },
      "get-itemproperty": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-usetransaction"],
        knownValueParams: ["-name", "-filter", "-include", "-exclude", "-credential"]
      },
      "get-itempropertyvalue": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-usetransaction"],
        knownValueParams: ["-name", "-filter", "-include", "-exclude", "-credential"]
      },
      "get-filehash": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: [],
        knownValueParams: ["-algorithm", "-inputstream"]
      },
      "get-acl": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-audit", "-allcentralaccesspolicies", "-usetransaction"],
        knownValueParams: ["-inputobject", "-filter", "-include", "-exclude"]
      },
      "get-module": {
        operationType: "read",
        pathParams: ["-name", "-fullyqualifiedname"],
        knownSwitches: ["-listavailable", "-all", "-refresh", "-skipeditioncheck"],
        knownValueParams: ["-psedition", "-pssession", "-cimsession"]
      },
      "format-hex": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-raw"],
        knownValueParams: ["-inputobject", "-encoding", "-count", "-offset"]
      },
      "test-path": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-isvalid", "-usetransaction"],
        knownValueParams: ["-filter", "-include", "-exclude", "-pathtype", "-credential", "-olderthan", "-newerthan"]
      },
      "resolve-path": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-relative", "-usetransaction", "-force"],
        knownValueParams: ["-credential", "-relativebasepath"]
      },
      "convert-path": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-usetransaction"],
        knownValueParams: []
      },
      "select-string": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-simplematch", "-casesensitive", "-quiet", "-list", "-notmatch", "-allmatches", "-noemphasis", "-raw"],
        knownValueParams: ["-inputobject", "-pattern", "-include", "-exclude", "-encoding", "-context", "-culture"]
      },
      "set-location": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-passthru", "-usetransaction"],
        knownValueParams: ["-stackname"]
      },
      "push-location": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-passthru", "-usetransaction"],
        knownValueParams: ["-stackname"]
      },
      "pop-location": {
        operationType: "read",
        pathParams: [],
        knownSwitches: ["-passthru", "-usetransaction"],
        knownValueParams: ["-stackname"]
      },
      "select-xml": {
        operationType: "read",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: [],
        knownValueParams: ["-xml", "-content", "-xpath", "-namespace"]
      },
      "get-winevent": {
        operationType: "read",
        pathParams: ["-path"],
        knownSwitches: ["-force", "-oldest"],
        knownValueParams: ["-listlog", "-logname", "-listprovider", "-providername", "-maxevents", "-computername", "-credential", "-filterxpath", "-filterxml", "-filterhashtable"]
      },
      "invoke-webrequest": {
        operationType: "write",
        pathParams: ["-outfile", "-infile"],
        positionalSkip: 1,
        optionalWrite: true,
        knownSwitches: ["-allowinsecureredirect", "-allowunencryptedauthentication", "-disablekeepalive", "-nobodyprogress", "-passthru", "-preservefileauthorizationmetadata", "-resume", "-skipcertificatecheck", "-skipheadervalidation", "-skiphttperrorcheck", "-usebasicparsing", "-usedefaultcredentials"],
        knownValueParams: ["-uri", "-method", "-body", "-contenttype", "-headers", "-maximumredirection", "-maximumretrycount", "-proxy", "-proxycredential", "-retryintervalsec", "-sessionvariable", "-timeoutsec", "-token", "-transferencoding", "-useragent", "-websession", "-credential", "-authentication", "-certificate", "-certificatethumbprint", "-form", "-httpversion"]
      },
      "invoke-restmethod": {
        operationType: "write",
        pathParams: ["-outfile", "-infile"],
        positionalSkip: 1,
        optionalWrite: true,
        knownSwitches: ["-allowinsecureredirect", "-allowunencryptedauthentication", "-disablekeepalive", "-followrellink", "-nobodyprogress", "-passthru", "-preservefileauthorizationmetadata", "-resume", "-skipcertificatecheck", "-skipheadervalidation", "-skiphttperrorcheck", "-usebasicparsing", "-usedefaultcredentials"],
        knownValueParams: ["-uri", "-method", "-body", "-contenttype", "-headers", "-maximumfollowrellink", "-maximumredirection", "-maximumretrycount", "-proxy", "-proxycredential", "-responseheaderstvariable", "-retryintervalsec", "-sessionvariable", "-statuscodevariable", "-timeoutsec", "-token", "-transferencoding", "-useragent", "-websession", "-credential", "-authentication", "-certificate", "-certificatethumbprint", "-form", "-httpversion"]
      },
      "expand-archive": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp", "-destinationpath"],
        knownSwitches: ["-force", "-passthru", "-whatif", "-confirm"],
        knownValueParams: []
      },
      "compress-archive": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp", "-destinationpath"],
        knownSwitches: ["-force", "-update", "-passthru", "-whatif", "-confirm"],
        knownValueParams: ["-compressionlevel"]
      },
      "set-itemproperty": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-passthru", "-force", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-name", "-value", "-type", "-filter", "-include", "-exclude", "-credential", "-inputobject"]
      },
      "new-itemproperty": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-name", "-value", "-propertytype", "-type", "-filter", "-include", "-exclude", "-credential"]
      },
      "remove-itemproperty": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-name", "-filter", "-include", "-exclude", "-credential"]
      },
      "clear-item": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-force", "-whatif", "-confirm", "-usetransaction"],
        knownValueParams: ["-filter", "-include", "-exclude", "-credential"]
      },
      "export-alias": {
        operationType: "write",
        pathParams: ["-path", "-literalpath", "-pspath", "-lp"],
        knownSwitches: ["-append", "-force", "-noclobber", "-passthru", "-whatif", "-confirm"],
        knownValueParams: ["-name", "-description", "-scope", "-as"]
      }
    };
    RGp = new Set(["StringConstant", "Parameter"]);
    xGp = new Set(["get-childitem", "get-item", "get-itemproperty", "resolve-path", "convert-path", "get-filehash", "get-acl", "test-path"]);
  });
  var u6t;
  var dvo;
  var D9n;
  var M9n;
  var c9a;
  var u9a;
  var d9a;
  var N9n = __lazy(() => {
    u6t = ["python", "python3", "python2", "node", "deno", "tsx", "ruby", "perl", "php", "lua", "npx", "bunx", "npm run", "yarn run", "pnpm run", "bun run", "bash", "sh", "ssh"];
    dvo = [...u6t, "zsh", "fish", "eval", "exec", "env", "xargs", "sudo"];
    D9n = ["curl", "wget", "kubectl", "aws", "gcloud", "gsutil"];
    M9n = [];
    c9a = new Set([...D9n, ...M9n]);
    u9a = {
      kubectl: new Set(["exec", "apply", "create", "delete", "run", "cp", "port-forward", "proxy", "patch", "edit", "replace", "attach", "debug", "scale", "rollout", "drain", "cordon", "taint"]),
      ...false
    };
    d9a = [...dvo, ...[]];
  });
  function IGp(e) {
    return Object.entries(_Q).filter(([, t]) => e.vZc(t.toLowerCase())).map(([t]) => t);
  }
  var pvo;
  var mvo;
  var fvo;
  var AGp;
  var PGp;
  var OGp;
  var DGp;
  var MGp;
  var p9a;
  var hvo = __lazy(() => {
    N9n();
    pvo = new Set(["invoke-command", "start-job", "start-threadjob", "register-scheduledjob"]);
    mvo = new Set(["invoke-command", "invoke-expression", "start-job", "start-threadjob", "register-scheduledjob", "register-engineevent", "register-objectevent", "register-wmievent", "new-pssession", "enter-pssession"]);
    fvo = new Set(["import-module", "ipmo", "install-module", "save-module", "update-module", "install-script", "save-script"]);
    AGp = ["pwsh", "powershell", "cmd", "bash", "wsl", "sh", "start-process", "start", "add-type", "new-object"];
    PGp = new Set(["invoke-webrequest", "invoke-restmethod"]);
    OGp = new Set(["set-alias", "sal", "new-alias", "nal", "set-variable", "sv", "new-variable", "nv"]);
    DGp = new Set(["invoke-wmimethod", "iwmi", "invoke-cimmethod", "icim", "wmic", "wmic.exe"]);
    MGp = new Set(["select-object", "sort-object", "group-object", "where-object", "measure-object", "write-output", "write-host", "start-sleep", "format-table", "format-list", "format-wide", "format-custom", "out-string", "out-host", "ipconfig", "hostname", "route", "arp"]);
    p9a = (() => {
      let e = new Set([...AGp, ...pvo, ...mvo, ...fvo, ...PGp, ...OGp, ...DGp, ...MGp, "foreach-object", ...u6t.filter(t => !t.includes(" "))]);
      return new Set([...e, ...IGp(e)]);
    })();
  });
  function LGp(e) {
    return e.toLowerCase().replace(/\[\]$/, "").replace(/\[.*\]$/, "").trim();
  }
  function gvo(e) {
    return NGp.vZc(LGp(e));
  }
  var NGp;
  var m9a = __lazy(() => {
    NGp = new Set(["alias", "allowemptycollection", "allowemptystring", "allownull", "argumentcompleter", "argumentcompletions", "array", "bigint", "bool", "byte", "char", "cimclass", "cimconverter", "ciminstance", "cimtype", "cmdletbinding", "cultureinfo", "datetime", "decimal", "double", "dsclocalconfigurationmanager", "dscproperty", "dscresource", "experimentaction", "experimental", "experimentalfeature", "float", "guid", "hashtable", "int", "int16", "int32", "int64", "ipaddress", "ipendpoint", "long", "mailaddress", "norunspaceaffinity", "nullstring", "objectsecurity", "ordered", "outputtype", "parameter", "physicaladdress", "pscredential", "pscustomobject", "psdefaultvalue", "pslistmodifier", "psobject", "psprimitivedictionary", "pstypenameattribute", "ref", "regex", "sbyte", "securestring", "semver", "short", "single", "string", "supportswildcards", "switch", "timespan", "uint", "uint16", "uint32", "uint64", "ulong", "uri", "ushort", "validatecount", "validatedrive", "validatelength", "validatenotnull", "validatenotnullorempty", "validatenotnullorwhitespace", "validatepattern", "validaterange", "validatescript", "validateset", "validatetrusteddata", "validateuserdrive", "version", "void", "wildcardpattern", "x500distinguishedname", "x509certificate", "xml", "system.array", "system.boolean", "system.byte", "system.char", "system.datetime", "system.decimal", "system.double", "system.guid", "system.int16", "system.int32", "system.int64", "system.numerics.biginteger", "system.sbyte", "system.single", "system.string", "system.timespan", "system.uint16", "system.uint32", "system.uint64", "system.uri", "system.version", "system.void", "system.collections.hashtable", "system.text.regularexpressions.regex", "system.globalization.cultureinfo", "system.net.ipaddress", "system.net.ipendpoint", "system.net.mail.mailaddress", "system.net.networkinformation.physicaladdress", "system.security.securestring", "system.security.cryptography.x509certificates.x509certificate", "system.security.cryptography.x509certificates.x500distinguishedname", "system.xml.xmldocument", "system.management.automation.pscredential", "system.management.automation.pscustomobject", "system.management.automation.pslistmodifier", "system.management.automation.psobject", "system.management.automation.psprimitivedictionary", "system.management.automation.psreference", "system.management.automation.semanticversion", "system.management.automation.switchparameter", "system.management.automation.wildcardpattern", "system.management.automation.language.nullstring", "microsoft.management.infrastructure.cimclass", "microsoft.management.infrastructure.cimconverter", "microsoft.management.infrastructure.ciminstance", "microsoft.management.infrastructure.cimtype", "system.collections.specialized.ordereddictionary", "system.security.accesscontrol.objectsecurity", "object", "system.object", "microsoft.powershell.commands.modulespecification"].map(e => e.toLowerCase()));
  });
  function yvo(e) {
    let t = e.toLowerCase();
    if (f9a.vZc(t)) {
      return true;
    }
    let n = Math.max(t.lastIndexOf("/"), t.lastIndexOf("\\"));
    if (n >= 0) {
      return f9a.vZc(t.slice(n + 1));
    }
    return false;
  }
  function Wht(e, t, n) {
    if (jEo(e, t, n)) {
      return true;
    }
    let r = {
      ...e,
      args: e.args.map(o => o.length > 0 && FGp.vZc(o[0]) ? "-" + o.slice(1) : o)
    };
    return jEo(r, t, n);
  }
  function UGp(e) {
    if (HEo(e, "Invoke-Expression")) {
      return {
        behavior: "ask",
        message: "Command uses Invoke-Expression which can execute arbitrary code"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function BGp(e) {
    for (let t of PO(e)) {
      if (t.elementType !== "CommandAst") {
        continue;
      }
      let n = t.elementTypes?.[0];
      if (n !== undefined && n !== "StringConstant") {
        return {
          behavior: "ask",
          message: "Command name is a dynamic expression which cannot be statically validated"
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function $Gp(e) {
    for (let t of PO(e)) {
      if (yvo(t.name)) {
        if (Wht(t, "-encodedcommand", "-e")) {
          return {
            behavior: "ask",
            message: "Command uses encoded parameters which obscure intent"
          };
        }
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function HGp(e) {
    for (let t of PO(e)) {
      if (yvo(t.name)) {
        return {
          behavior: "ask",
          message: "Command spawns a nested PowerShell process which cannot be validated"
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function h9a(e) {
    return jGp.vZc(e.toLowerCase());
  }
  function g9a(e) {
    let t = e.toLowerCase();
    return t === "invoke-expression" || t === "iex";
  }
  function qGp(e) {
    for (let n of e.statements) {
      let r = n.commands;
      if (r.length < 2) {
        continue;
      }
      let o = r.some(i => h9a(i.name));
      let s = r.some(i => g9a(i.name));
      if (o && s) {
        return {
          behavior: "ask",
          message: "Command downloads and executes remote code"
        };
      }
    }
    let t = PO(e);
    if (t.some(n => h9a(n.name)) && t.some(n => g9a(n.name))) {
      return {
        behavior: "ask",
        message: "Command downloads and executes remote code"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function WGp(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      if (n === "start-bitstransfer") {
        return {
          behavior: "ask",
          message: "Command downloads files via BITS transfer"
        };
      }
      if (n === "certutil" || n === "certutil.exe") {
        if (t.args.some(o => {
          let s = o.toLowerCase();
          return s === "-urlcache" || s === "/urlcache";
        })) {
          return {
            behavior: "ask",
            message: "Command uses certutil to download from a URL"
          };
        }
      }
      if (n === "bitsadmin" || n === "bitsadmin.exe") {
        if (t.args.some(r => r.toLowerCase() === "/transfer")) {
          return {
            behavior: "ask",
            message: "Command downloads files via BITS transfer"
          };
        }
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function GGp(e) {
    if (HEo(e, "Add-Type")) {
      return {
        behavior: "ask",
        message: "Command compiles and loads .NET code"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function VGp(e) {
    for (let t of PO(e)) {
      if (t.name.toLowerCase() !== "new-object") {
        continue;
      }
      if (Wht(t, "-comobject", "-com")) {
        return {
          behavior: "ask",
          message: "Command instantiates a COM object which may have execution capabilities"
        };
      }
      let n;
      for (let r = 0; r < t.args.length; r++) {
        let o = t.args[r];
        let s = o.toLowerCase();
        if (s.startsWith("-t") && s.includes(":")) {
          let i = o.indexOf(":");
          let a = s.slice(0, i);
          if ("-typename".startsWith(a)) {
            n = o.slice(i + 1);
            break;
          }
        }
        if (s.startsWith("-t") && "-typename".startsWith(s) && t.args[r + 1] !== undefined) {
          n = t.args[r + 1];
          break;
        }
      }
      if (n === undefined) {
        let r = new Set(["-argumentlist", "-comobject", "-property"]);
        let o = new Set(["-strict"]);
        for (let s = 0; s < t.args.length; s++) {
          let i = t.args[s];
          if (i.startsWith("-")) {
            let a = i.toLowerCase();
            if (a.startsWith("-t") && "-typename".startsWith(a)) {
              s++;
              continue;
            }
            if (a.includes(":")) {
              continue;
            }
            if (o.vZc(a)) {
              continue;
            }
            if (r.vZc(a)) {
              s++;
              continue;
            }
            continue;
          }
          n = i;
          break;
        }
      }
      if (n !== undefined && !gvo(n)) {
        return {
          behavior: "ask",
          message: `New-Object instantiates .NET type '${n}' outside the ConstrainedLanguage allowlist`
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function zGp(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      let r = _Q[n]?.toLowerCase() ?? n;
      if (!pvo.vZc(r)) {
        continue;
      }
      if (Wht(t, "-filepath", "-f") || Wht(t, "-literalpath", "-l")) {
        return {
          behavior: "ask",
          message: `${t.name} -FilePath executes an arbitrary script file`
        };
      }
      for (let o = 0; o < t.args.length; o++) {
        let s = t.elementTypes?.[o + 1];
        let i = t.args[o];
        if (s === "StringConstant" && i && !i.startsWith("-")) {
          return {
            behavior: "ask",
            message: `${t.name} with positional string argument binds to -FilePath and executes a script file`
          };
        }
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function KGp(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      if ((_Q[n]?.toLowerCase() ?? n) !== "foreach-object") {
        continue;
      }
      if (Wht(t, "-membername", "-m")) {
        return {
          behavior: "ask",
          message: "ForEach-Object -MemberName invokes methods by string name which cannot be validated"
        };
      }
      for (let o = 0; o < t.args.length; o++) {
        let s = t.elementTypes?.[o + 1];
        let i = t.args[o];
        if (s === "StringConstant" && i && !i.startsWith("-")) {
          return {
            behavior: "ask",
            message: "ForEach-Object with positional string argument binds to -MemberName and invokes methods by name"
          };
        }
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function YGp(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      if (n !== "start-process" && n !== "saps" && n !== "start") {
        continue;
      }
      if (Wht(t, "-Verb", "-v") && t.args.some(r => r.toLowerCase() === "runas")) {
        return {
          behavior: "ask",
          message: "Command requests elevated privileges"
        };
      }
      if (t.children) {
        for (let r = 0; r < t.args.length; r++) {
          let o = AU(t.args[r].replace(/`[\r\n]+\s*/g, ""));
          if (!/^[-\u2013\u2014\u2015/]v[a-z]*:/i.test(o)) {
            continue;
          }
          let s = t.children[r];
          if (!s) {
            continue;
          }
          for (let i of s) {
            if (AU(i.text).replace(/['"\u2018-\u201F\s]/g, "").toLowerCase() === "runas") {
              return {
                behavior: "ask",
                message: "Command requests elevated privileges"
              };
            }
          }
        }
      }
      if (t.args.some(r => {
        let o = AU(r.replace(/`[\r\n]+\s*/g, ""));
        return /^[-\u2013\u2014\u2015/]v[a-z]*:['"` \u2018-\u201f]*runas['"` \u2018-\u201f]*$/i.test(o);
      })) {
        return {
          behavior: "ask",
          message: "Command requests elevated privileges"
        };
      }
      for (let r of t.args) {
        let o = T0(r);
        if (yvo(o)) {
          return {
            behavior: "ask",
            message: "Start-Process launches a nested PowerShell process which cannot be validated"
          };
        }
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function JGp(e) {
    if (!y9(e).hasScriptBlocks) {
      return {
        behavior: "passthrough"
      };
    }
    for (let r of PO(e)) {
      let o = r.name.toLowerCase();
      if (mvo.vZc(o)) {
        return {
          behavior: "ask",
          message: "Command contains script block with dangerous cmdlet that may execute arbitrary code"
        };
      }
    }
    if (PO(e).every(r => {
      let o = r.name.toLowerCase();
      if (y9a.vZc(o)) {
        return true;
      }
      let s = _Q[o];
      if (s && y9a.vZc(s.toLowerCase())) {
        return true;
      }
      return false;
    })) {
      return {
        behavior: "passthrough"
      };
    }
    return {
      behavior: "ask",
      message: "Command contains script block that may execute arbitrary code"
    };
  }
  function XGp(e) {
    if (y9(e).hasSubExpressions) {
      return {
        behavior: "ask",
        message: "Command contains subexpressions $()"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function QGp(e) {
    if (y9(e).hasExpandableStrings) {
      return {
        behavior: "ask",
        message: "Command contains expandable strings with embedded expressions"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function ZGp(e) {
    if (y9(e).hasSplatting) {
      return {
        behavior: "ask",
        message: "Command uses splatting (@variable)"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function e9p(e) {
    if (y9(e).hasStopParsing) {
      return {
        behavior: "ask",
        message: "Command uses stop-parsing token (--%)"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function t9p(e) {
    if (y9(e).hasMemberInvocations) {
      return {
        behavior: "ask",
        message: "Command invokes .NET methods"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function n9p(e) {
    for (let t of e.typeLiterals ?? []) {
      if (!gvo(t)) {
        return {
          behavior: "ask",
          message: `Command uses .NET type [${t}] outside the ConstrainedLanguage allowlist`
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function r9p(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      if (n === "invoke-item" || n === "ii") {
        return {
          behavior: "ask",
          message: "Invoke-Item opens files with the default handler (ShellExecute). On executable files this runs arbitrary code."
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function s9p(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      if (o9p.vZc(n)) {
        return {
          behavior: "ask",
          message: `${t.name} creates or modifies a scheduled task (persistence primitive)`
        };
      }
      if (n === "schtasks" || n === "schtasks.exe") {
        if (t.args.some(r => {
          let o = r.toLowerCase();
          return o === "/create" || o === "/change" || o === "-create" || o === "-change";
        })) {
          return {
            behavior: "ask",
            message: "schtasks with create/change modifies scheduled tasks (persistence primitive)"
          };
        }
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function a9p(e) {
    let t = WWa(e, "env");
    if (t.length === 0) {
      return {
        behavior: "passthrough"
      };
    }
    for (let n of PO(e)) {
      if (i9p.vZc(n.name.toLowerCase())) {
        return {
          behavior: "ask",
          message: "Command modifies environment variables"
        };
      }
    }
    if (y9(e).hasAssignments && t.length > 0) {
      return {
        behavior: "ask",
        message: "Command modifies environment variables"
      };
    }
    return {
      behavior: "passthrough"
    };
  }
  function l9p(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      if (fvo.vZc(n)) {
        return {
          behavior: "ask",
          message: "Command loads, installs, or downloads a PowerShell module or script, which can execute arbitrary code"
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function u9p(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      let r = n.includes("\\") ? n.slice(n.lastIndexOf("\\") + 1) : n;
      if (c9p.vZc(r)) {
        return {
          behavior: "ask",
          message: "Command creates or modifies an alias or variable that can affect future command resolution"
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function p9p(e) {
    for (let t of PO(e)) {
      let n = t.name.toLowerCase();
      if (d9p.vZc(n)) {
        return {
          behavior: "ask",
          message: `${t.name} can spawn arbitrary processes via WMI/CIM (Win32_Process Create)`
        };
      }
      let r = Math.max(n.lastIndexOf("/"), n.lastIndexOf("\\"));
      let o = r >= 0 ? n.slice(r + 1) : n;
      if (o === "wmic" || o === "wmic.exe") {
        return {
          behavior: "ask",
          message: "wmic can spawn arbitrary processes (process call create), execute scripts (/format, /translate XSL), or write arbitrary files (/output, /append, /record) via WMI"
        };
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  function _9a(e, t) {
    if (!t.valid) {
      return {
        behavior: "ask",
        message: "Could not parse command for security analysis"
      };
    }
    let n = [UGp, BGp, $Gp, HGp, qGp, WGp, GGp, VGp, zGp, r9p, s9p, KGp, YGp, JGp, XGp, QGp, ZGp, e9p, t9p, n9p, a9p, l9p, u9p, p9p];
    for (let r of n) {
      let o = r(t);
      if (o.behavior === "ask") {
        return o;
      }
    }
    return {
      behavior: "passthrough"
    };
  }
  var f9a;
  var FGp;
  var jGp;
  var y9a;
  var o9p;
  var i9p;
  var c9p;
  var d9p;
  var b9a = __lazy(() => {
    hvo();
    m9a();
    r8e();
    f9a = new Set(["pwsh", "pwsh.exe", "powershell", "powershell.exe"]);
    FGp = new Set(["/", "\u2013", "\u2014", "\u2015"]);
    jGp = new Set(["invoke-webrequest", "iwr", "invoke-restmethod", "irm", "new-object", "start-bitstransfer"]);
    y9a = new Set(["where-object", "sort-object", "select-object", "group-object", "format-table", "format-list", "format-wide", "format-custom"]);
    o9p = new Set(["register-scheduledtask", "new-scheduledtask", "new-scheduledtaskaction", "set-scheduledtask"]);
    i9p = new Set(["set-item", "si", "new-item", "ni", "remove-item", "ri", "del", "rm", "rd", "rmdir", "erase", "clear-item", "cli", "set-content", "add-content", "ac"]);
    c9p = new Set(["set-alias", "sal", "new-alias", "nal", "set-variable", "sv", "new-variable", "nv"]);
    d9p = new Set(["invoke-wmimethod", "iwmi", "invoke-cimmethod", "icim"]);
  });
  function h9p(e) {
    let t = e.name.toLowerCase();
    let n = t.slice(Math.max(t.lastIndexOf("\\"), t.lastIndexOf("/")) + 1);
    return f9p.vZc(n);
  }
  async function S9a(e) {
    let t = e.trim();
    if (!t) {
      return "";
    }
    let n = await REe(t);
    return $Eo(n)[0] ?? "";
  }
  function v9a(e) {
    return l3n(e);
  }
  function T9a(e) {
    let t = e.trimStart();
    let n = t[0];
    if (n === '"' || n === "'") {
      let r = t.indexOf(n, 1);
      let o = r === -1 ? t.length : r + 1;
      return t.slice(0, o).toLowerCase();
    }
    return (t.split(/\s+/)[0] ?? "").toLowerCase();
  }
  function d6t(e) {
    return e.trim().replace(/^[\s\u0085\u180e]+|[\s\u0085\u180e]+$/g, "");
  }
  function w9a(e) {
    let t = e;
    let n = t.match(/^[\s\u0085\u180e]+/);
    if (n && /[\u0085\u180e]/.test(n[0])) {
      t = t.slice(n[0].length);
    }
    let r = t.match(/[\s\u0085\u180e]+$/);
    if (r && /[\u0085\u180e]/.test(r[0])) {
      t = t.slice(0, t.length - r[0].length);
    }
    return t;
  }
  function L9n(e) {
    let t = e;
    let n = t.match(/^[\s\u0085\u180e]+/);
    if (n && /[\u0085\u180e]/.test(n[0])) {
      t = n[0].replace(/[\u0085\u180e]/g, "") + t.slice(n[0].length);
    }
    let r = t.match(/[\s\u0085\u180e]+$/);
    if (r && /[\u0085\u180e]/.test(r[0])) {
      t = t.slice(0, t.length - r[0].length) + r[0].replace(/[\u0085\u180e]/g, "");
    }
    return t;
  }
  function kNe(e) {
    if (e.includes(`
`) || e.includes("*")) {
      return [];
    }
    return c3n("PowerShell", d6t(e));
  }
  function bvo(e, t, n, r) {
    let o = d6t(e.command);
    function s(m, f) {
      return m.toLowerCase() === f.toLowerCase();
    }
    function i(m, f) {
      return m.toLowerCase().startsWith(f.toLowerCase());
    }
    function a(m) {
      if (r === "allow") {
        return m;
      }
      return n9n(m);
    }
    let l = o.split(n8e)[0] ?? "";
    let c = n9n(l);
    let u = eh(c);
    let d = o.slice(l.length).replace(/^[\s\u0085\u180e]+/, " ");
    let p = u + d;
    return Array.from(t.entries()).filter(([m]) => {
      let f = v9a(L9n(m));
      let h = f.type === "exact" ? {
        ...f,
        command: w9a(m)
      } : f.type === "prefix" ? {
        ...f,
        prefix: L9n(f.prefix)
      } : f.type === "wildcard" ? {
        ...f,
        pattern: L9n(f.pattern)
      } : f;
      function g(y) {
        switch (h.type) {
          case "exact":
            return s(h.command, y);
          case "prefix":
            switch (n) {
              case "exact":
                return s(h.prefix, y);
              case "prefix":
                {
                  if (s(y, h.prefix)) {
                    return true;
                  }
                  return i(y, h.prefix + " ");
                }
            }
            break;
          case "wildcard":
            if (n === "exact") {
              return false;
            }
            return KV(h.pattern, y, true, true);
        }
      }
      if (g(o)) {
        return true;
      }
      if (g(p)) {
        return true;
      }
      if (h.type === "exact") {
        let y = h.command.split(n8e)[0] ?? "";
        if (eh(a(y)) === u) {
          let b = h.command.slice(y.length).replace(/^[\s\u0085\u180e]+/, " ");
          if (s(b, d)) {
            return true;
          }
        }
      } else if (h.type === "prefix") {
        let y = h.prefix.split(n8e)[0] ?? "";
        if (eh(a(y)) === u) {
          let b = h.prefix.slice(y.length).replace(/^[\s\u0085\u180e]+/, " ");
          let S = u + b;
          if (n === "exact") {
            if (s(S, p)) {
              return true;
            }
          } else if (s(p, S) || i(p, S + " ")) {
            return true;
          }
        }
      } else if (h.type === "wildcard") {
        let y = h.pattern.split(n8e)[0] ?? "";
        if (eh(a(y)) === u && n !== "exact") {
          let b = h.pattern.slice(y.length).replace(/^[\s\u0085\u180e]+/, " ");
          let S = u + b;
          if (KV(S, p, true, true)) {
            return true;
          }
        }
      }
      return false;
    }).map(([, m]) => m);
  }
  function a8e(e, t, n) {
    let r = getRuleByContentsForToolName(t, "PowerShell", "deny");
    let o = bvo(e, r, n, "deny");
    let s = getRuleByContentsForToolName(t, "PowerShell", "ask");
    let i = bvo(e, s, n, "ask");
    let a = getRuleByContentsForToolName(t, "PowerShell", "allow");
    let l = bvo(e, a, n, "allow");
    return {
      matchingDenyRules: o,
      matchingAskRules: i,
      matchingAllowRules: l
    };
  }
  function C9a(e, t) {
    let n = d6t(e.command);
    let r = {
      ...e,
      command: n
    };
    let {
      matchingDenyRules: o,
      matchingAskRules: s,
      matchingAllowRules: i
    } = a8e(r, t, "exact");
    if (o[0] !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${"PowerShell"} with command ${n} has been denied.`,
        decisionReason: {
          type: "rule",
          rule: o[0]
        }
      };
    }
    if (s[0] !== undefined) {
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export("PowerShell"),
        decisionReason: {
          type: "rule",
          rule: s[0]
        }
      };
    }
    if (i[0] !== undefined) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "rule",
          rule: i[0]
        }
      };
    }
    let a = {
      type: "other",
      reason: "This command requires approval"
    };
    return {
      behavior: "passthrough",
      message: createPermissionRequestMessage_export("PowerShell", a),
      decisionReason: a,
      suggestions: kNe(n)
    };
  }
  function g9p(e, t) {
    let n = d6t(e.command);
    let r = {
      ...e,
      command: n
    };
    let o = C9a(e, t);
    if (o.behavior === "deny" || o.behavior === "ask") {
      return o;
    }
    let {
      matchingDenyRules: s,
      matchingAskRules: i,
      matchingAllowRules: a
    } = a8e(r, t, "prefix");
    if (s[0] !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${"PowerShell"} with command ${n} has been denied.`,
        decisionReason: {
          type: "rule",
          rule: s[0]
        }
      };
    }
    if (i[0] !== undefined) {
      return {
        behavior: "ask",
        message: createPermissionRequestMessage_export("PowerShell"),
        decisionReason: {
          type: "rule",
          rule: i[0]
        }
      };
    }
    if (o.behavior === "allow") {
      return o;
    }
    if (a[0] !== undefined) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "rule",
          rule: a[0]
        }
      };
    }
    let l = {
      type: "other",
      reason: "This command requires approval"
    };
    return {
      behavior: "passthrough",
      message: createPermissionRequestMessage_export("PowerShell", l),
      decisionReason: l,
      suggestions: kNe(n)
    };
  }
  async function R9a(e, t) {
    if (!e.valid) {
      return [{
        text: t,
        element: {
          name: await S9a(t),
          nameType: "unknown",
          elementType: "CommandAst",
          args: [],
          text: t
        },
        statement: null,
        isSafeOutput: false
      }];
    }
    let n = [];
    for (let r of e.statements) {
      for (let o of r.commands) {
        if (o.elementType !== "CommandAst") {
          continue;
        }
        n.push({
          text: o.text,
          element: o,
          statement: r,
          isSafeOutput: o.nameType !== "application" && s8e(o.name) && o.args.length === 0
        });
      }
      if (r.nestedCommands) {
        for (let o of r.nestedCommands) {
          n.push({
            text: o.text,
            element: o,
            statement: r,
            isSafeOutput: o.nameType !== "application" && s8e(o.name) && o.args.length === 0
          });
        }
      }
    }
    if (n.length > 0) {
      return n;
    }
    return [{
      text: t,
      element: {
        name: await S9a(t),
        nameType: "unknown",
        elementType: "CommandAst",
        args: [],
        text: t
      },
      statement: null,
      isSafeOutput: false
    }];
  }
  async function x9a(e) {
    if (!e) {
      return false;
    }
    let t = await REe(e);
    if (!t.valid) {
      return true;
    }
    return (await R9a(t, e)).some(({
      element: r
    }) => eh(r.name) === "git");
  }
  async function k9a(e, t) {
    let n = getToolPermissionContext(t);
    let r = d6t(e.command);
    let o = {
      ...e,
      command: r
    };
    if (!r) {
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "other",
          reason: "Empty command is safe"
        }
      };
    }
    let s = await REe(r);
    let i = C9a(e, n);
    if (i.behavior === "deny") {
      return i;
    }
    let {
      matchingDenyRules: a,
      matchingAskRules: l
    } = a8e(o, n, "prefix");
    if (a[0] !== undefined) {
      return {
        behavior: "deny",
        message: `Permission to use ${"PowerShell"} with command ${r} has been denied.`,
        decisionReason: {
          type: "rule",
          rule: a[0]
        }
      };
    }
    let c = null;
    if (l[0] !== undefined) {
      c = {
        behavior: "ask",
        message: createPermissionRequestMessage_export("PowerShell"),
        decisionReason: {
          type: "rule",
          rule: l[0]
        }
      };
    }
    if (c === null && HI(r)) {
      c = {
        behavior: "ask",
        message: "Command contains a UNC path that could trigger network requests"
      };
    }
    if (i.behavior === "allow" && !s.valid && c === null && BEo(r.split(n8e)[0] ?? "") !== "application") {
      return i;
    }
    if (!s.valid) {
      let W = AU(r.replace(/<#[\s\S]*?#>/g, " ").replace(/`[\r\n]+\s*/g, ""));
      let j = false;
      let z;
      for (let J of W.split(/[;|\n\r{}()&]+/)) {
        let Q = J.trim();
        if (!Q) {
          continue;
        }
        let Z = Q.split(n8e);
        for (let ne = 0; ne < Z.length; ne++) {
          let oe = Z[ne];
          let ee = T0(oe);
          if (!ee) {
            continue;
          }
          if (z === undefined && !f3.vZc(oe[0] ?? "") && c6t(oe)) {
            z = oe;
          }
          if (eh(ee) === "remove-item") {
            j = true;
            for (let ae of Z.slice(ne + 1)) {
              if (f3.vZc(ae[0] ?? "")) {
                continue;
              }
              if (c6t(ae)) {
                return i8e(ae);
              }
            }
          }
          let re = [ee, ...Z.slice(ne + 1)].join(" ");
          let {
            matchingDenyRules: se
          } = a8e({
            command: re
          }, n, "prefix");
          if (se[0] !== undefined) {
            return {
              behavior: "deny",
              message: `Permission to use ${"PowerShell"} with command ${r} has been denied.`,
              decisionReason: {
                type: "rule",
                rule: se[0]
              }
            };
          }
        }
      }
      if (j && z !== undefined) {
        return i8e(z);
      }
      if (c !== null) {
        return c;
      }
      let V = {
        type: "other",
        reason: `Command contains malformed syntax that cannot be parsed: ${s.errors[0]?.message ?? "unknown error"}`
      };
      let K = {
        behavior: "ask",
        decisionReason: V,
        message: createPermissionRequestMessage_export("PowerShell", V)
      };
      return {
        ...K,
        decisionReason: {
          type: "subcommandResults",
          reasons: new Map([[r, K]])
        }
      };
    }
    let u = await R9a(s, r);
    let d = [];
    if (c !== null) {
      d.push(c);
    }
    let p = _9a(r, s);
    if (p.behavior !== "passthrough") {
      let W = {
        type: "other",
        reason: p.message
      };
      d.push({
        behavior: "ask",
        message: createPermissionRequestMessage_export("PowerShell", W),
        decisionReason: W,
        suggestions: kNe(r)
      });
    }
    if (s.hasUsingStatements) {
      let W = {
        type: "other",
        reason: "Command contains a `using` statement that may load external code (module or assembly)"
      };
      d.push({
        behavior: "ask",
        message: createPermissionRequestMessage_export("PowerShell", W),
        decisionReason: W,
        suggestions: kNe(r)
      });
    }
    if (s.hasScriptRequirements) {
      let W = {
        type: "other",
        reason: "Command contains a `#Requires` directive that may trigger module loading"
      };
      d.push({
        behavior: "ask",
        message: createPermissionRequestMessage_export("PowerShell", W),
        decisionReason: W,
        suggestions: kNe(r)
      });
    }
    if (s.hasBackgroundJob) {
      let W = {
        type: "other",
        reason: "Command uses the background job operator (`&`) which spawns a child PowerShell process"
      };
      d.push({
        behavior: "ask",
        message: createPermissionRequestMessage_export("PowerShell", W),
        decisionReason: W,
        suggestions: kNe(r)
      });
    }
    let m = /^(?:[\w.]+\\)?(env|hklm|hkcu|function|alias|variable|cert|wsman|registry)::?/i;
    function f(W) {
      let j = W;
      if (j.length > 0 && (f3.vZc(j[0]) || j[0] === "/")) {
        let z = j.indexOf(":", 1);
        if (z > 0 && (j[0] !== "/" || /^\/[A-Za-z]{1,2}:/.test(j))) {
          j = j.substring(z + 1);
        }
      }
      return AU(j.replace(/`[\r\n]+\s*/g, ""));
    }
    function h(W) {
      let j = f(W);
      if (m.test(j)) {
        return {
          behavior: "ask",
          message: `Command argument '${W}' uses a non-filesystem provider path and requires approval`
        };
      }
      if (HI(j, true)) {
        return {
          behavior: "ask",
          message: `Command argument '${W}' contains a UNC path that could trigger network requests`
        };
      }
      if (Wt() === "windows" && /(?<!:)[\\/]{2,}[^ \t\r\n\f\v\\/]/.test(j)) {
        return {
          behavior: "ask",
          message: `Command argument '${W}' contains a UNC path that could trigger network requests`
        };
      }
      return null;
    }
    e: for (let W of s.statements) {
      for (let j of W.commands) {
        if (j.elementType !== "CommandAst") {
          continue;
        }
        for (let z of j.args) {
          let V = h(z);
          if (V !== null) {
            d.push(V);
            break e;
          }
        }
      }
      if (W.nestedCommands) {
        for (let j of W.nestedCommands) {
          for (let z of j.args) {
            let V = h(z);
            if (V !== null) {
              d.push(V);
              break e;
            }
          }
        }
      }
    }
    for (let {
      text: W,
      element: j
    } of u) {
      let z = j.name !== "" ? [j.name, ...j.args].join(" ") : null;
      let V = {
        command: W
      };
      let {
        matchingDenyRules: K,
        matchingAskRules: J
      } = a8e(V, n, "prefix");
      let Q = K[0];
      let Z = J[0];
      if (Q === undefined && z !== null) {
        let {
          matchingDenyRules: ne,
          matchingAskRules: oe
        } = a8e({
          command: z
        }, n, "prefix");
        if (Q = ne[0], Z === undefined) {
          Z = oe[0];
        }
      }
      if (Q !== undefined) {
        d.push({
          behavior: "deny",
          message: `Permission to use ${"PowerShell"} with command ${r} has been denied.`,
          decisionReason: {
            type: "rule",
            rule: Q
          }
        });
      } else if (Z !== undefined) {
        d.push({
          behavior: "ask",
          message: createPermissionRequestMessage_export("PowerShell"),
          decisionReason: {
            type: "rule",
            rule: Z
          }
        });
      }
    }
    let g = u.length > 1 && u.some(({
      element: W
    }) => l6t(W.name));
    let y = u.some(({
      element: W
    }) => ivo(W));
    let _ = u.some(({
      element: W
    }) => eh(W.name) === "git");
    if (g && _) {
      d.push({
        behavior: "ask",
        message: "Compound commands with cd/Set-Location and git require approval to prevent bare repository attacks"
      });
    }
    let b = _ && isCurrentDirectoryBareGitRepo();
    if (b) {
      d.push({
        behavior: "ask",
        message: b === "bare-indicators" ? "Git command in a directory with bare-repo indicators (HEAD/objects/refs outside a .git/ directory). Git may treat it as a git dir and run config/hooks from here." : "The .git file or symlink here redirects to a location that cannot be verified as safe (it may have been planted by an untrusted archive). Git commands need approval."
      });
    }
    if (_) {
      let W = u.some(({
        element: V,
        statement: K
      }) => {
        for (let Q of V.redirections ?? []) {
          if (Hht(Q.target)) {
            return true;
          }
        }
        let J = eh(V.name);
        if (!_vo.vZc(J)) {
          return false;
        }
        if (V.args.flatMap(v9n).some(Q => Hht(Q))) {
          return true;
        }
        if (J === "copy-item" || J === "move-item") {
          let Q = K === null ? -1 : K.commands.indexOf(V);
          let Z = K !== null && (Q > 0 || Q === -1 && K.commands.length > 1);
          if (WGa(V.args, Z)) {
            return true;
          }
        }
        if (K !== null) {
          for (let Q of K.commands) {
            if (Q.elementType === "CommandAst") {
              continue;
            }
            if (Hht(Q.text)) {
              return true;
            }
          }
        }
        return false;
      });
      let j = Z5t(s).some(V => Hht(V.target));
      if (W || j) {
        d.push({
          behavior: "ask",
          message: "Command writes to a git-internal path (HEAD, objects/, refs/, hooks/, .git/) and runs git. This could plant a malicious hook that git then executes."
        });
      }
      if (u.some(({
        element: V
      }) => h9p(V))) {
        d.push({
          behavior: "ask",
          message: "Compound command runs a native file copier (xcopy/robocopy) and git. The copier can place files at git-internal paths (HEAD, objects/, refs/) that git then treats as repository state."
        });
      }
    }
    if (Wt() === "windows" && u.length > 1) {
      let W = new Set();
      for (let z of Z5t(s)) {
        W.add(jht(z.target));
      }
      let j = null;
      for (let {
        element: z
      } of u) {
        let V = jht(z.name);
        if (V !== "" && W.vZc(V)) {
          j = z.name;
          break;
        }
        for (let J of z.redirections ?? []) {
          W.add(jht(J.target));
        }
        let K = eh(z.name);
        if (_vo.vZc(K)) {
          for (let J of z.args.flatMap(v9n)) {
            let Q = J.replace(/^[-\u2013\u2014\u2015]+[A-Za-z]+:?/, "");
            let Z = T0(b9(Q));
            if (Z !== "") {
              W.add(jht(Z));
            }
          }
        }
      }
      if (j !== null) {
        d.push({
          behavior: "ask",
          message: `An earlier sub-command writes a file (./${j}.*) that would shadow the later \`${j}\` command under Windows PowerShell 5.1 cwd-first resolution.`
        });
      }
    }
    if (u.some(({
      element: W
    }) => {
      let j = W.name.toLowerCase();
      let z = j.slice(Math.max(j.lastIndexOf("\\"), j.lastIndexOf("/")) + 1);
      return m9p.vZc(z);
    }) && u.length > 1) {
      d.push({
        behavior: "ask",
        message: _ ? "Compound command extracts an archive and runs git. Archive contents may plant bare-repository indicators (HEAD, hooks/, refs/) that git then treats as the repository root." : "Compound command extracts an archive followed by other commands. Archive contents (symlinks, config files) cannot be validated and may redirect subsequent path operations."
      });
    }
    if (u.some(({
      element: j
    }) => {
      for (let V of j.redirections ?? []) {
        if (E9n(V.target)) {
          return true;
        }
      }
      let z = eh(j.name);
      if (!_vo.vZc(z)) {
        return false;
      }
      return j.args.flatMap(v9n).some(E9n);
    }) || Z5t(s).some(j => E9n(j.target))) {
      d.push({
        behavior: "ask",
        message: "Command writes to .git/ \u2014 hooks or config planted there execute on the next git operation."
      });
    }
    let E = a9a(o, s, n, g);
    if (E.behavior !== "passthrough") {
      d.push(E);
    }
    let C = i.behavior === "allow" && i.decisionReason?.type === "rule" ? i.decisionReason.rule.ruleValue.ruleContent : undefined;
    let x = C !== undefined && w9a(C).trim().toLowerCase() === r.toLowerCase();
    if (i.behavior === "allow" && u[0] !== undefined && (x || u.every(W => W.element.nameType !== "application" && !MO(W.text, W.element)))) {
      d.push(i);
    }
    if (C9n(r, s)) {
      d.push({
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "other",
          reason: "Command is read-only and safe to execute"
        }
      });
    }
    if (Z5t(s).length > 0) {
      d.push({
        behavior: "ask",
        message: "Command contains file redirections that could write to arbitrary paths",
        suggestions: kNe(r)
      });
    }
    let k = avo(o, s, n);
    if (k.behavior !== "passthrough") {
      d.push(k);
    }
    let I = d.find(W => W.behavior === "deny");
    if (I !== undefined) {
      return I;
    }
    let O = d.find(W => W.behavior === "ask");
    if (O !== undefined) {
      return {
        ...O,
        decisionReason: {
          type: "subcommandResults",
          reasons: new Map([[r, O]])
        }
      };
    }
    let M = d.find(W => W.behavior === "allow");
    if (M !== undefined) {
      return M;
    }
    let L = u.filter(({
      element: W,
      isSafeOutput: j
    }) => {
      if (j) {
        return false;
      }
      if (W.nameType === "application") {
        return true;
      }
      if (eh(W.name) === "set-location" && W.args.length > 0) {
        let V = W.args.find(K => K.length === 0 || !f3.vZc(K[0]));
        if (V && E9a.resolve(Nt(), V) === Nt()) {
          return false;
        }
      }
      return true;
    });
    let P = [];
    let F = new Set();
    for (let {
      text: W,
      element: j,
      statement: z
    } of L) {
      let V = {
        command: W
      };
      let K = g9p(V, n);
      if (K.behavior === "deny") {
        return {
          behavior: "deny",
          message: `Permission to use ${"PowerShell"} with command ${r} has been denied.`,
          decisionReason: K.decisionReason
        };
      }
      if (K.behavior === "ask") {
        if (z !== null) {
          F.add(z);
        }
        P.push(W);
        continue;
      }
      let J = false;
      if (K.behavior === "allow" && j.nameType === "application") {
        let Q = j.name.toLowerCase();
        let Z = T0(T9a(W)).toLowerCase();
        if (Q.length > 0 && Z === Q) {
          J = a8e(V, n, "prefix").matchingAllowRules.some(ne => {
            let oe = v9a(L9n(ne.ruleValue.ruleContent ?? ""));
            let ee = oe.type === "exact" ? oe.command : oe.type === "prefix" ? oe.prefix : oe.pattern;
            return T0(T9a(ee)).toLowerCase() === Q;
          });
        }
      }
      if (K.behavior === "allow" && (j.nameType !== "application" || J) && !y) {
        if (MO(W, j)) {
          if (z !== null) {
            F.add(z);
          }
          P.push(W);
          continue;
        }
        continue;
      }
      if (K.behavior === "allow") {
        if (z !== null) {
          F.add(z);
        }
        P.push(W);
        continue;
      }
      if (z !== null && !g && !y && rvo(z) && o8e(j, W)) {
        continue;
      }
      if (z !== null && !g && !y) {
        if (avo({
          command: W
        }, {
          valid: true,
          errors: [],
          variables: s.variables,
          hasStopParsing: s.hasStopParsing,
          originalCommand: W,
          statements: [z]
        }, n).behavior === "allow") {
          continue;
        }
      }
      if (z !== null) {
        F.add(z);
      }
      P.push(W);
    }
    for (let W of s.statements) {
      if (!rvo(W) && !F.vZc(W)) {
        P.push(W.text);
      }
    }
    if (P.length === 0) {
      if (y9(s).hasScriptBlocks) {
        let W = {
          behavior: "ask",
          message: createPermissionRequestMessage_export("PowerShell"),
          decisionReason: {
            type: "other",
            reason: "Pipeline consists of output-formatting cmdlets with script blocks \u2014 block content cannot be verified"
          }
        };
        return {
          ...W,
          decisionReason: {
            type: "subcommandResults",
            reasons: new Map([[r, W]])
          }
        };
      }
      return {
        behavior: "allow",
        updatedInput: e,
        decisionReason: {
          type: "other",
          reason: "All pipeline commands are individually allowed"
        }
      };
    }
    let H = {
      type: "other",
      reason: "This command requires approval"
    };
    let U = [];
    for (let W of P) {
      U.push(...kNe(W));
    }
    let N = {
      behavior: "passthrough",
      message: createPermissionRequestMessage_export("PowerShell", H),
      decisionReason: H,
      suggestions: U
    };
    return {
      ...N,
      decisionReason: {
        type: "subcommandResults",
        reasons: new Map([[r, N]])
      }
    };
  }
  var E9a;
  var _vo;
  var m9p;
  var f9p;
  var A9a = __lazy(() => {
    Sl();
    vo();
    na();
    oy();
    V5e();
    Cs();
    pde();
    GGa();
    o9a();
    l9a();
    b9a();
    qht();
    r8e();
    E9a = require("path");
    _vo = new Set(["new-item", "set-content", "add-content", "out-file", "copy-item", "move-item", "rename-item", "expand-archive", "invoke-webrequest", "invoke-restmethod", "tee-object", "export-csv", "export-clixml"]);
    m9p = new Set(["tar", "tar.exe", "bsdtar", "bsdtar.exe", "unzip", "unzip.exe", "7z", "7z.exe", "7za", "7za.exe", "gzip", "gzip.exe", "gunzip", "gunzip.exe", "expand-archive"]);
    f9p = new Set(["xcopy", "xcopy.exe", "robocopy", "robocopy.exe"]);
  });
  function F9n() {
    return fMe();
  }
  function p6t() {
    return wqn();
  }
  function y9p() {
    if (Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS) {
      return null;
    }
    return "  - You can use the `run_in_background` parameter to run the command in the background. Only use this if you don't need the result immediately and are OK being notified when the command completes later. You do not need to check the output right away - you'll be notified when it finishes.";
  }
  function _9p() {
    if (Me.CLAUDE_CODE_DISABLE_BACKGROUND_TASKS) {
      return null;
    }
    return "  - Avoid unnecessary `Start-Sleep` commands:\n    - Do not sleep between commands that can run immediately \u2014 just run them.\n    - If your command is long running and you would like to be notified when it finishes \u2014 simply run your command using `run_in_background`. There is no need to sleep in this case.\n    - Do not retry failing commands in a sleep loop \u2014 diagnose the root cause or consider an alternative approach.\n    - If waiting for a background task you started with `run_in_background`, you will be notified when it completes \u2014 do not poll.\n    - If you must poll an external process, use a check command rather than sleeping first.\n    - If you must sleep, keep the duration short to avoid blocking the user.";
  }
  function b9p(e) {
    if (e === "desktop") {
      return "PowerShell edition: Windows PowerShell 5.1 (powershell.exe)\n   - Pipeline chain operators `&&` and `||` are NOT available \u2014 they cause a parser error. To run B only if A succeeds: `A; if ($?) { B }`. To chain unconditionally: `A; B`.\n   - Ternary (`?:`), null-coalescing (`??`), and null-conditional (`?.`) operators are NOT available. Use `if/else` and explicit `$null -eq` checks instead.\n   - Avoid `2>&1` on native executables. In 5.1, redirecting a native command's stderr inside PowerShell wraps each line in an ErrorRecord (NativeCommandError) and sets `$?` to `$false` even when the exe returned exit code 0. stderr is already captured for you \u2014 don't redirect it.\n   - Default file encoding is UTF-16 LE (with BOM). When writing files other tools will read, pass `-Encoding utf8` to `Out-File`/`Set-Content`.\n   - `ConvertFrom-Json` returns a PSCustomObject, not a hashtable. `-AsHashtable` is not available.";
    }
    if (e === "core") {
      return "PowerShell edition: PowerShell 7+ (pwsh)\n   - Pipeline chain operators `&&` and `||` ARE available and work like bash. Prefer `cmd1 && cmd2` over `cmd1; cmd2` when cmd2 should only run if cmd1 succeeds.\n   - Ternary (`$cond ? $a : $b`), null-coalescing (`??`), and null-conditional (`?.`) operators are available.\n   - Default file encoding is UTF-8 without BOM.";
    }
    return "PowerShell edition: unknown \u2014 assume Windows PowerShell 5.1 for compatibility\n   - Do NOT use `&&`, `||`, ternary `?:`, null-coalescing `??`, or null-conditional `?.`. These are PowerShell 7+ only and parser-error on 5.1.\n   - To chain commands conditionally: `A; if ($?) { B }`. Unconditionally: `A; B`.";
  }
  async function I9a() {
    let e = y9p();
    let t = _9p();
    let n = await hGt();
    let r = getFeatureValue_CACHED_MAY_BE_STALE("tengu_brass_sled", false) ? await YCs() : [];
    let o = Wt() === "windows" ? "\n   - Exception: the MSVC toolchain (`cl`, `nmake`, `msbuild`) is only on PATH inside a Visual Studio developer shell, so it may be installed even if not listed. Environment changes do NOT persist between commands, so initialize and build in ONE command: `cmd /c '\"C:\\Program Files\\Microsoft Visual Studio\\<year>\\<edition>\\VC\\Auxiliary\\Build\\vcvarsall.bat\" x64 && <build command>'`" : "";
    let s = r.length ? `
Developer tools verified on this machine's PATH: ${r.join(", ")}
   - Prefer these. A build/dev tool NOT in this list is likely not installed \u2014 do not assume \`make\`, \`gcc\`, or a package manager is available unless listed. Check with \`if (Get-Command <name> -ErrorAction SilentlyContinue) { ... }\` before relying on an unlisted tool, and prefer a listed equivalent.${o}
` : "";
    return `Executes a given PowerShell command with optional timeout. Working directory persists between commands; shell state (variables, functions) does not.

IMPORTANT: This tool is for terminal operations via PowerShell: git, npm, docker, and PS cmdlets. DO NOT use it for file operations (reading, writing, editing, searching, finding files) - use the specialized tools for this instead.

${b9p(n)}
${s}
Before executing the command, please follow these steps:

1. Directory Verification:
   - If the command will create new directories or files, first use \`Get-ChildItem\` (or \`ls\`) to verify the parent directory exists and is the correct location

2. Command Execution:
   - Always quote file paths that contain spaces with double quotes
   - Capture the output of the command.

PowerShell Syntax Notes:
   - Variables use $ prefix: $myVar = "value"
   - Escape character is backtick (\`), not backslash
   - Use Verb-Noun cmdlet naming: Get-ChildItem, Set-Location, New-Item, Remove-Item
   - Common aliases: ls (Get-ChildItem), cd (Set-Location), cat (Get-Content), rm (Remove-Item)
   - Pipe operator | works similarly to bash but passes objects, not text
   - Use Select-Object, Where-Object, ForEach-Object for filtering and transformation
   - String interpolation: "Hello $name" or "Hello $($obj.Property)"
   - Registry access uses PSDrive prefixes: \`HKLM:\\SOFTWARE\\...\`, \`HKCU:\\...\` \u2014 NOT raw \`HKEY_LOCAL_MACHINE\\...\`
   - Environment variables: read with \`$env:NAME\`, set with \`$env:NAME = "value"\` (NOT \`Set-Variable\` or bash \`export\`)
   - Call native exe with spaces in path via call operator: \`& "C:\\Program Files\\App\\app.exe" arg1 arg2\`

Unix commands that DO NOT exist in PowerShell \u2014 use the equivalent instead:
   - head / tail \u2192 \`Get-Content file -TotalCount N\` / \`-Tail N\`; piped: \`| Select-Object -First N\` / \`-Last N\`
   - which \u2192 \`(Get-Command name).Source\`
   - touch \u2192 \`if (-not (Test-Path path)) { New-Item -ItemType File path }\` (NEVER use \`New-Item -Force\` on a file \u2014 it truncates existing content)
   - wc -l \u2192 \`(Get-Content file | Measure-Object -Line).Lines\`
   - mkdir -p \u2192 \`New-Item -ItemType Directory -Force path\` (\`-p\` is not a PowerShell flag)
   - rm -rf \u2192 \`Remove-Item -Recurse -Force path\`
   - ln -s \u2192 \`New-Item -ItemType SymbolicLink -Path link -Target target\`
   - chmod / chown \u2192 not applicable on Windows; use \`icacls\` only if ACL changes are required
   - 2>/dev/null \u2192 \`2>$null\` (but stderr is captured for you \u2014 usually unnecessary)
   - VAR=x cmd \u2192 \`$env:VAR = 'x'; cmd\` (PowerShell has no inline env-var prefix)
   - Bash control flow (\`if [ -f x ]\`, \`for x in *\`, backtick \`\`cmd\`\` substitution) is a parser error \u2014 use \`if (Test-Path x)\`, \`foreach ($x in ...)\`, \`$(cmd)\`

Exit-code note: \`-ErrorAction SilentlyContinue\` suppresses error OUTPUT but the cmdlet failure still causes this tool to report exit 1. To make a cmdlet failure truly non-fatal, promote it to terminating and swallow it: \`try { Cmdlet ... -ErrorAction Stop } catch {}\` (without \`-ErrorAction Stop\`, non-terminating errors skip the \`catch\` and still exit 1).

Interactive and blocking commands (will hang \u2014 this tool runs with -NonInteractive):
   - NEVER use \`Read-Host\`, \`Get-Credential\`, \`Out-GridView\`, \`$Host.UI.PromptForChoice\`, or \`pause\`
   - Destructive cmdlets (\`Remove-Item\`, \`Stop-Process\`, \`Clear-Content\`, etc.) may prompt for confirmation. Add \`-Confirm:$false\` when you intend the action to proceed. Use \`-Force\` for read-only/hidden items.
   - Never use \`git rebase -i\`, \`git add -i\`, or other commands that open an interactive editor

Passing multiline strings (commit messages, file content) to native executables:
   - Use a single-quoted here-string so PowerShell does not expand \`$\` or backticks inside. The closing \`'@\` MUST be at column 0 (no leading whitespace) on its own line \u2014 indenting it is a parse error:
<example>
git commit -m @'
Commit message here.
Second line with $literal dollar signs.
'@
</example>
   - Use \`@'...'@\` (single-quoted, literal) not \`@"..."@\` (double-quoted, interpolated) unless you need variable expansion
   - For arguments containing \`-\`, \`@\`, or other characters PowerShell parses as operators, use the stop-parsing token: \`git log --% --format=%H\`

Usage notes:
  - The command argument is required.
  - You can specify an optional timeout in milliseconds (up to ${p6t()}ms / ${p6t() / 60000} minutes). If not specified, commands will timeout after ${F9n()}ms (${F9n() / 60000} minutes).
  - It is very helpful if you write a clear, concise description of what this command does.
  - If the output exceeds ${_mt()} characters, output will be truncated before being returned to you.
${e ? e + `
` : ""}  - Avoid using PowerShell to run commands that have dedicated tools, unless explicitly instructed:
    - File search: Use ${"Glob"} (NOT Get-ChildItem -Recurse)
    - Content search: Use ${"Grep"} (NOT Select-String)
    - Read files: Use ${"Read"} (NOT Get-Content)
    - Edit files: Use ${"Edit"}
    - Write files: Use ${"Write"} (NOT Set-Content/Out-File)
    - Communication: Output text directly (NOT Write-Output/Write-Host)
  - When issuing multiple commands:
    - If the commands are independent and can run in parallel, make multiple ${"PowerShell"} tool calls in a single message.
    - If the commands depend on each other and must run sequentially, chain them in a single ${"PowerShell"} call (see edition-specific chaining syntax above).
    - Use \`;\` only when you need to run commands sequentially but don't care if earlier commands fail.
    - DO NOT use newlines to separate commands (newlines are ok in quoted strings and here-strings)
  - Do NOT prefix commands with \`cd\` or \`Set-Location\` -- the working directory is already set to the correct project directory automatically.
${t ? t + `
` : ""}  - For git commands:
    - Prefer to create a new commit rather than amending an existing commit.
    - Before running destructive operations (e.g., git reset --hard, git push --force, git checkout --), consider whether there is a safer alternative that achieves the same goal. Only use destructive operations when they are truly the best approach.
    - Never skip hooks (--no-verify) or bypass signing (--no-gpg-sign, -c commit.gpgsign=false) unless the user has explicitly asked for it. If a hook fails, investigate and fix the underlying issue.`;
  }
  var P9a = __lazy(() => {
    $n();
    xDt();
    pr();
    Cs();
    eGt();
    cMe();
    Ay();
    Tm();
    mx();
    Fk();
    _x();
  });
  function D9a(e, {
    verbose: t,
    theme: n
  }) {
    let {
      command: r
    } = e;
    if (!r) {
      return null;
    }
    let o = r;
    if (!t) {
      let s = o.split(`
`);
      let i = s.length > 2;
      let a = o.length > 160;
      if (i || a) {
        let l = o;
        if (i) {
          l = s.slice(0, 2).join(`
`);
        }
        if (l.length > 160) {
          l = l.slice(0, 160);
        }
        return E0.jsxs(Text, {
          children: [l.trim(), "\u2026"]
        });
      }
    }
    return o;
  }
  function M9a(e, {
    verbose: t,
    tools: n,
    terminalSize: r,
    inProgressToolCallCount: o
  }) {
    let s = e.at(-1);
    if (!s || !s.data) {
      return E0.jsx(Vn, {
        height: 1,
        children: E0.jsx(Text, {
          dimColor: true,
          children: "Running\u2026"
        })
      });
    }
    let i = s.data;
    return E0.jsx(Mht, {
      fullOutput: i.fullOutput,
      output: i.output,
      elapsedTimeSeconds: i.elapsedTimeSeconds,
      totalLines: i.totalLines,
      totalBytes: i.totalBytes,
      timeoutMs: i.timeoutMs,
      taskId: i.taskId,
      verbose: t
    });
  }
  function N9a() {
    return E0.jsx(Vn, {
      height: 1,
      children: E0.jsx(Text, {
        dimColor: true,
        children: "Waiting\u2026"
      })
    });
  }
  function L9a(e, t, {
    verbose: n,
    theme: r,
    tools: o,
    style: s
  }) {
    let a = t.at(-1)?.data?.timeoutMs;
    let {
      stdout: l,
      stderr: c,
      interrupted: u,
      returnCodeInterpretation: d,
      isImage: p,
      backgroundTaskId: m
    } = e;
    if (p) {
      return E0.jsx(Vn, {
        height: 1,
        children: E0.jsx(Text, {
          dimColor: true,
          children: "[Image data detected and sent to Claude]"
        })
      });
    }
    return E0.jsxs(gXd, {
      flexDirection: "column",
      children: [l !== "" ? E0.jsx(vU, {
        content: l,
        verbose: n
      }) : null, c.trim() !== "" ? E0.jsx(vU, {
        content: c,
        verbose: n,
        isError: true
      }) : null, l === "" && c.trim() === "" ? E0.jsx(Vn, {
        height: 1,
        children: E0.jsx(Text, {
          dimColor: true,
          children: m ? E0.jsxs(E0.Fragment, {
            children: ["Running in the background", " ", E0.jsx(xt, {
              chord: "down",
              action: "manage",
              parens: true
            })]
          }) : u ? "Interrupted" : d || "(No output)"
        })
      }) : null, a ? E0.jsx(Vn, {
        children: E0.jsx(Z6e, {
          timeoutMs: a
        })
      }) : null]
    });
  }
  function F9a(e, {
    verbose: t,
    progressMessagesForMessage: n,
    tools: r
  }) {
    return E0.jsx(Rw, {
      result: e,
      verbose: t
    });
  }
  var E0;
  var U9a = __lazy(() => {
    bs();
    KG();
    Wl();
    vMe();
    a9n();
    i9n();
    et();
    E0 = __toESM(ie(), 1);
  });
  var f6t = {};