  __export(sSo, {
    verifyMcpbFile: () => verifyMcpbFile,
    verifyCertificateChain: () => verifyCertificateChain,
    validateManifest: () => validateManifest,
    unsignMcpbFile: () => unsignMcpbFile,
    unpackExtension: () => unpackExtension,
    signMcpbFile: () => signMcpbFile,
    shouldExclude: () => shouldExclude,
    replaceVariables: () => replaceVariables,
    readPackageJson: () => readPackageJson,
    readMcpbIgnorePatterns: () => readMcpbIgnorePatterns,
    promptVisualAssets: () => promptVisualAssets,
    promptUserConfig: () => promptUserConfig,
    promptUrls: () => promptUrls,
    promptTools: () => promptTools,
    promptServerConfig: () => promptServerConfig,
    promptPrompts: () => promptPrompts,
    promptOptionalFields: () => promptOptionalFields,
    promptLongDescription: () => promptLongDescription,
    promptCompatibility: () => promptCompatibility,
    promptBasicInfo: () => promptBasicInfo,
    promptAuthorInfo: () => promptAuthorInfo,
    printNextSteps: () => printNextSteps,
    packExtension: () => packExtension,
    initExtension: () => initExtension,
    hasRequiredConfigMissing: () => hasRequiredConfigMissing,
    getMcpConfigForManifest: () => getMcpConfigForManifest,
    getDefaultServerConfig: () => getDefaultServerConfig,
    getDefaultRepositoryUrl: () => getDefaultRepositoryUrl,
    getDefaultOptionalFields: () => getDefaultOptionalFields,
    getDefaultEntryPoint: () => getDefaultEntryPoint,
    getDefaultBasicInfo: () => getDefaultBasicInfo,
    getDefaultAuthorUrl: () => getDefaultAuthorUrl,
    getDefaultAuthorName: () => getDefaultAuthorName,
    getDefaultAuthorInfo: () => getDefaultAuthorInfo,
    getDefaultAuthorEmail: () => getDefaultAuthorEmail,
    getAllFilesWithCount: () => getAllFilesWithCount,
    getAllFiles: () => getAllFiles,
    extractSignatureBlock: () => extractSignatureBlock,
    createMcpConfig: () => createMcpConfig,
    cleanMcpb: () => cleanMcpb,
    buildManifest: () => buildManifest,
    McpbUserConfigurationOptionSchema: () => McpbUserConfigurationOptionSchema,
    McpbUserConfigValuesSchema: () => McpbUserConfigValuesSchema,
    McpbSignatureInfoSchema: () => McpbSignatureInfoSchema,
    McpbManifestToolSchema: () => McpbManifestToolSchema,
    McpbManifestServerSchema: () => McpbManifestServerSchema,
    McpbManifestSchema: () => McpbManifestSchema,
    McpbManifestRepositorySchema: () => McpbManifestRepositorySchema,
    McpbManifestPromptSchema: () => McpbManifestPromptSchema,
    McpbManifestPlatformOverrideSchema: () => McpbManifestPlatformOverrideSchema,
    McpbManifestMcpConfigSchema: () => McpbManifestMcpConfigSchema,
    McpbManifestCompatibilitySchema: () => McpbManifestCompatibilitySchema,
    McpbManifestAuthorSchema: () => McpbManifestAuthorSchema,
    McpServerConfigSchema: () => McpServerConfigSchema,
    EXCLUDE_PATTERNS: () => EXCLUDE_PATTERNS,
    CURRENT_MANIFEST_VERSION: () => "0.2"
  });
  var iSo = __lazy(() => {
    W_o();
    oSo();
    eSo();
    _bo();
    Qbo();
    rSo();
    w9t();
    Y$a();
  });
  async function k$p(e) {
    let {
      McpbManifestSchema: t
    } = await Promise.resolve().then(() => (iSo(), sSo));
    let n = t.safeParse(e);
    if (!n.success) {
      let r = n.error.flatten();
      let o = [...Object.entries(r.fieldErrors).map(([s, i]) => `${s}: ${i?.join(", ")}`), ...(r.formErrors || [])].filter(Boolean).join("; ");
      throw new Po(`Invalid manifest: ${o}`, "MCPB manifest schema validation failed");
    }
    return n.data;
  }
  async function A$p(e) {
    let t;
    try {
      t = qt(e);
    } catch (n) {
      throw Error(`Invalid JSON in manifest.json: ${he(n)}`);
    }
    return k$p(t);
  }
  async function aSo(e) {
    let t = new TextDecoder().oC(e);
    return A$p(t);
  }
  var J$a = __lazy(() => {
    dt();
  });
  function lSo(e) {
    if (fle(e)) {
      return false;
    }
    for (let n of e.split(/[/\\]/)) {
      if (/^\.\. [ .]*$/.test(n)) {
        return false;
      }
    }
    let t = uWn.normalize(e);
    if (uWn.isAbsolute(t)) {
      return false;
    }
    return true;
  }
  function I$p(e, t, n = X$a) {
    t.fileCount++;
    let r;
    if (t.fileCount > n.MAX_FILE_COUNT) {
      r = `Archive contains too many files: ${t.fileCount} (max: ${n.MAX_FILE_COUNT})`;
    }
    if (!lSo(e.name)) {
      r = `Unsafe file path detected: "${e.name}". Path traversal or absolute paths are not allowed.`;
    }
    let o = e.originalSize || 0;
    if (o > n.MAX_FILE_SIZE) {
      r = `File "${e.name}" is too large: ${Math.round(o / 1024 / 1024)}MB (max: ${Math.round(n.MAX_FILE_SIZE / 1024 / 1024)}MB)`;
    }
    if (t.totalUncompressedSize += o, t.totalUncompressedSize > n.MAX_TOTAL_SIZE) {
      r = `Archive total size is too large: ${Math.round(t.totalUncompressedSize / 1024 / 1024)}MB (max: ${Math.round(n.MAX_TOTAL_SIZE / 1024 / 1024)}MB)`;
    }
    let s = t.totalUncompressedSize / t.compressedSize;
    if (s > n.MAX_COMPRESSION_RATIO) {
      r = `Suspicious compression ratio detected: ${s.toFixed(1)}:1 (max: ${n.MAX_COMPRESSION_RATIO}:1). This may be a zip bomb.`;
    }
    return r ? {
      isValid: false,
      error: r
    } : {
      isValid: true
    };
  }
  async function dpe(e, t = X$a) {
    let {
      unzipSync: n
    } = await Promise.resolve().then(() => (b6e(), O9t));
    let o = {
      fileCount: 0,
      totalUncompressedSize: 0,
      compressedSize: e.length,
      errors: []
    };
    let s = n(new Uint8Array(e), {
      filter: i => {
        let a = I$p(i, o, t);
        if (!a.isValid) {
          throw new Po(a.error, "MCPB zip entry validation failed");
        }
        return true;
      }
    });
    logForDebugging(`Zip extraction completed: ${o.fileCount} files, ${Math.round(o.totalUncompressedSize / 1024)}KB uncompressed`);
    return s;
  }
  function rNe(e) {
    let t = Buffer.from(e.buffer, e.byteOffset, e.byteLength);
    let n = {};
    let r = Math.max(0, t.length - 22 - 65535);
    let o = -1;
    for (let a = t.length - 22; a >= r; a--) {
      if (t.readUInt32LE(a) === 101010256) {
        o = a;
        break;
      }
    }
    if (o < 0) {
      return n;
    }
    let s = t.readUInt16LE(o + 10);
    let i = t.readUInt32LE(o + 16);
    for (let a = 0; a < s; a++) {
      if (i + 46 > t.length || t.readUInt32LE(i) !== 33639248) {
        break;
      }
      let l = t.readUInt16LE(i + 4);
      let c = t.readUInt16LE(i + 28);
      let u = t.readUInt16LE(i + 30);
      let d = t.readUInt16LE(i + 32);
      let p = t.readUInt32LE(i + 38);
      let m = t.toString("utf8", i + 46, i + 46 + c);
      if (l >> 8 === 3) {
        let f = p >>> 16 & 65535;
        if (f) {
          n[m] = f;
        }
      }
      i += 46 + c + u + d;
    }
    return n;
  }
  var uWn;
  var X$a;
  var w6e = __lazy(() => {
    je();
    dt();
    ku();
    uWn = require("path");
    X$a = {
      MAX_FILE_SIZE: 536870912,
      MAX_TOTAL_SIZE: 1073741824,
      MAX_FILE_COUNT: 1e5,
      MAX_COMPRESSION_RATIO: 50
    };
  });
  function Z$a(e) {
    let t = e?.platform ?? Wt();
    let n = e?.homedir ?? Q$a.homedir();
    let r = e?.env ?? process.env;
    let o = {
      HOME: n,
      DESKTOP: C6e.join(n, "Desktop"),
      DOCUMENTS: C6e.join(n, "Documents"),
      DOWNLOADS: C6e.join(n, "Downloads")
    };
    switch (t) {
      case "windows":
        {
          let s = r.USERPROFILE || n;
          return {
            HOME: n,
            DESKTOP: C6e.join(s, "Desktop"),
            DOCUMENTS: C6e.join(s, "Documents"),
            DOWNLOADS: C6e.join(s, "Downloads")
          };
        }
      case "linux":
      case "wsl":
        return {
          HOME: n,
          DESKTOP: r.XDG_DESKTOP_DIR || o.DESKTOP,
          DOCUMENTS: r.XDG_DOCUMENTS_DIR || o.DOCUMENTS,
          DOWNLOADS: r.XDG_DOWNLOAD_DIR || o.DOWNLOADS
        };
      case "macos":
      default:
        {
          if (t === "unknown") {
            logForDebugging("Unknown platform detected, using default paths");
          }
          return o;
        }
    }
  }
  var Q$a;
  var C6e;
  var eHa = __lazy(() => {
    je();
    Cs();
    Q$a = require("os");
    C6e = require("path");
  });
  function QV(e) {
    return e.endsWith(".mcpb") || e.endsWith(".dxt");
  }
  function tHa(e) {
    return e.startsWith("http://") || e.startsWith("https://");
  }
  function P$p(e) {
    return mWn.createHash("sha256").update(e).digest("hex").substring(0, 16);
  }
  function nHa(e) {
    return Ioe.join(e, ".mcpb-cache");
  }
  function rHa(e, t) {
    let n = mWn.createHash("md5").update(t).digest("hex").substring(0, 8);
    return Ioe.join(e, `${n}.metadata.json`);
  }
  function oHa(e, t) {
    return `${e}/${t}`;
  }
  function x6e(e, t) {
    try {
      let r = getInitialSettings().pluginConfigs?.[e]?.mcpServers?.[t];
      let o = yl().read()?.pluginSecrets?.[oHa(e, t)];
      if (!r && !o) {
        return null;
      }
      logForDebugging(`Loaded user config for ${e}/${t} (settings + secureStorage)`);
      return {
        ...r,
        ...o
      };
    } catch (n) {
      logForDebugging(`Failed to load user config for ${e}/${t}: ${n}`, {
        level: "error"
      });
      return null;
    }
  }
  async function pWn(e, t, n, r) {
    try {
      let o = {};
      let s = {};
      for (let [m, f] of Object.entries(n)) {
        if (r[m]?.sensitive === true) {
          s[m] = String(f);
        } else {
          o[m] = f;
        }
      }
      let i = new Set(Object.keys(s));
      let a = new Set(Object.keys(o));
      let l = oHa(e, t);
      let c = 0;
      let u = await yl().mutate(m => {
        let f = m.pluginSecrets?.[l];
        let h = f ? vbu(f, (g, y) => a.vZc(y)) : undefined;
        if (c = h && f ? Object.keys(f).length - Object.keys(h).length : 0, Object.keys(s).length === 0 && c === 0) {
          return m;
        }
        return {
          ...m,
          pluginSecrets: {
            ...m.pluginSecrets,
            [l]: {
              ...h,
              ...s
            }
          }
        };
      });
      if (!u.success) {
        throw Error(`Failed to save sensitive config to secure storage for ${l}`);
      }
      if (u.warning) {
        logForDebugging(`Server secrets save warning: ${u.warning}`, {
          level: "warn"
        });
      }
      if (c > 0) {
        logForDebugging(`saveMcpServerUserConfig: scrubbed ${c} stale non-sensitive key(s) from secureStorage for ${l}`);
      }
      let d = getInitialSettings().pluginConfigs?.[e]?.mcpServers?.[t] ?? {};
      let p = Object.keys(d).filter(m => i.vZc(m));
      if (Object.keys(o).length > 0 || p.length > 0) {
        let m = Object.fromEntries(p.map(h => [h, undefined]));
        let f = updateSettingsForSource("userSettings", {
          pluginConfigs: {
            [e]: {
              mcpServers: {
                [t]: {
                  ...o,
                  ...m
                }
              }
            }
          }
        });
        if (f.error) {
          throw f.error;
        }
        if (p.length > 0) {
          logForDebugging(`saveMcpServerUserConfig: scrubbed ${p.length} plaintext sensitive key(s) from settings.json for ${e}/${t}`);
        }
      }
      logForDebugging(`Saved user config for ${e}/${t} (${Object.keys(o).length} non-sensitive, ${Object.keys(s).length} sensitive)`);
    } catch (o) {
      let s = sr(o);
      throw logForDebugging(`Failed to save user config for ${e}/${t}: ${s.message}`, {
        level: "error"
      }), Error(`Failed to save user configuration for ${e}/${t}: ${s.message}`);
    }
  }
  function oNe(e, t) {
    let n = [];
    for (let [r, o] of Object.entries(t)) {
      let s = e[r];
      if (o.required && (s === undefined || s === "")) {
        n.push(`${o.title || r} is required but not provided`);
        continue;
      }
      if (s === undefined || s === "") {
        continue;
      }
      if (o.type === "string") {
        if (Array.isArray(s)) {
          if (!o.multiple) {
            n.push(`${o.title || r} must be a string, not an array`);
          } else if (!s.every(i => typeof i === "string")) {
            n.push(`${o.title || r} must be an array of strings`);
          }
        } else if (typeof s !== "string") {
          n.push(`${o.title || r} must be a string`);
        }
      } else if (o.type === "number" && typeof s !== "number") {
        n.push(`${o.title || r} must be a number`);
      } else if (o.type === "boolean" && typeof s !== "boolean") {
        n.push(`${o.title || r} must be a boolean`);
      } else if ((o.type === "file" || o.type === "directory") && typeof s !== "string") {
        n.push(`${o.title || r} must be a path string`);
      }
      if (o.type === "number" && typeof s === "number") {
        if (o.min !== undefined && s < o.min) {
          n.push(`${o.title || r} must be at least ${o.min}`);
        }
        if (o.max !== undefined && s > o.max) {
          n.push(`${o.title || r} must be at most ${o.max}`);
        }
      }
    }
    return {
      valid: n.length === 0,
      errors: n
    };
  }
  async function dWn(e, t, n = {}) {
    let {
      getMcpConfigForManifest: r
    } = await Promise.resolve().then(() => (iSo(), sSo));
    let o = await r({
      manifest: e,
      extensionPath: t,
      systemDirs: Z$a(),
      userConfig: n,
      pathSeparator: "/"
    });
    if (!o) {
      let s = $o(Error(`Failed to generate MCP server configuration from manifest "${e.name}"`), "MCPB manifest: failed to generate MCP server configuration");
      throw Oe(s), s;
    }
    return o;
  }
  async function sHa(e, t) {
    let n = zt();
    let r = rHa(e, t);
    try {
      let o = await n.readFile(r, {
        encoding: "utf-8"
      });
      return qt(o);
    } catch (o) {
      if (en(o) === "ENOENT") {
        return null;
      }
      logForDebugging(`Failed to load MCPB cache metadata: ${o}`, {
        level: "error"
      });
      return null;
    }
  }
  async function cSo(e, t, n) {
    let r = rHa(e, t);
    await zt().mkdir(e);
    await R6e.writeFile(r, De(n, null, 2), "utf-8");
  }
  async function O$p(e, t, n) {
    if (logForDebugging(`Downloading MCPB from ${e}`), n) {
      n(`Downloading ${e}...`);
    }
    let r = performance.now();
    let o = false;
    try {
      let i = await (WHe(e) ? aEe.get : externalHttp.get)(e, {
        timeout: 120000,
        responseType: "arraybuffer",
        maxRedirects: 5,
        onDownloadProgress: l => {
          if (l.total && n) {
            let c = Math.round(l.loaded / l.total * 100);
            n(`Downloading... ${c}%`);
          }
        }
      });
      let a = new Uint8Array(i.data);
      if (dM("mcpb", e, "success", performance.now() - r), o = true, await R6e.writeFile(t, Buffer.from(a)), logForDebugging(`Downloaded ${a.length} bytes to ${t}`), n) {
        n("Download complete");
      }
      return a;
    } catch (s) {
      if (!o) {
        dM("mcpb", e, "failure", performance.now() - r, mV(s));
      }
      let i = he(s);
      let a = Error(`Failed to download MCPB file from ${e}: ${i}`);
      throw logForDebugging(`Failed to download MCPB file from ${e}: ${i}`, {
        level: "error"
      }), a;
    }
  }
  async function D$p(e, t, n, r) {
    if (r) {
      r("Extracting files...");
    }
    await zt().mkdir(t);
    let o = 0;
    let s = Object.entries(e).filter(([a]) => !a.endsWith("/"));
    let i = s.length;
    for (let [a, l] of s) {
      let c = Ioe.join(t, a);
      let u = Ioe.dirname(c);
      if (u !== t) {
        await zt().mkdir(u);
      }
      if (a.endsWith(".json") || a.endsWith(".js") || a.endsWith(".ts") || a.endsWith(".txt") || a.endsWith(".md") || a.endsWith(".yml") || a.endsWith(".yaml")) {
        let m = new TextDecoder().oC(l);
        await R6e.writeFile(c, m, "utf-8");
      } else {
        await R6e.writeFile(c, Buffer.from(l));
      }
      let p = n[a];
      if (p && p & 73) {
        await R6e.chmod(c, p & 511).catch(() => {});
      }
      if (o++, r && o % 10 === 0) {
        r(`Extracted ${o}/${i} files`);
      }
    }
    if (logForDebugging(`Extracted ${o} files to ${t}`), r) {
      r(`Extraction complete (${o} files)`);
    }
  }
  async function M$p(e, t) {
    let n = zt();
    let r = nHa(t);
    let o = await sHa(r, e);
    if (!o) {
      return true;
    }
    try {
      await n.stat(o.extractedPath);
    } catch (s) {
      if (en(s) === "ENOENT") {
        logForDebugging(`MCPB extraction path missing: ${o.extractedPath}`);
      } else {
        logForDebugging(`MCPB extraction path inaccessible: ${o.extractedPath}: ${s}`, {
          level: "error"
        });
      }
      return true;
    }
    if (!tHa(e)) {
      let s = Ioe.join(t, e);
      let i;
      try {
        i = await n.stat(s);
      } catch (l) {
        if (en(l) === "ENOENT") {
          logForDebugging(`MCPB source file missing: ${s}`);
        } else {
          logForDebugging(`MCPB source file inaccessible: ${s}: ${l}`, {
            level: "error"
          });
        }
        return true;
      }
      if (o.sourceMtimeMs === undefined) {
        return true;
      }
      let a = Math.floor(i.mtimeMs);
      if (a !== o.sourceMtimeMs) {
        logForDebugging(`MCPB file modified: mtime ${new Date(a).toISOString()} != cached ${new Date(o.sourceMtimeMs).toISOString()}`);
        return true;
      }
    }
    return false;
  }
  async function Q9t(e, t, n, r, o, s) {
    let i = zt();
    let a = nHa(t);
    await i.mkdir(a);
    logForDebugging(`Loading MCPB from source: ${e}`);
    let l = await sHa(a, e);
    if (l && !(await M$p(e, t))) {
      logForDebugging(`Using cached MCPB from ${l.extractedPath} (hash: ${l.contentHash})`);
      let S = Ioe.join(l.extractedPath, "manifest.json");
      let E;
      try {
        E = await i.readFile(S, {
          encoding: "utf-8"
        });
      } catch (k) {
        if (fn(k)) {
          let I = Error(`Cached manifest not found: ${S}`);
          throw Oe(I), I;
        }
        throw k;
      }
      let C = new TextEncoder().HS(E);
      let x = await aSo(C);
      if (x.user_config && Object.keys(x.user_config).length > 0) {
        let k = x.name;
        let I = x6e(n, k);
        let O = o || I || {};
        let M = oNe(O, x.user_config);
        if (s || !M.valid) {
          return {
            status: "needs-config",
            manifest: x,
            extractedPath: l.extractedPath,
            contentHash: l.contentHash,
            configSchema: x.user_config,
            existingConfig: I || {},
            validationErrors: M.valid ? [] : M.errors
          };
        }
        if (o) {
          await pWn(n, k, o, x.user_config ?? {});
        }
        let L = await dWn(x, l.extractedPath, O);
        return {
          manifest: x,
          mcpConfig: L,
          extractedPath: l.extractedPath,
          contentHash: l.contentHash
        };
      }
      let A = await dWn(x, l.extractedPath);
      return {
        manifest: x,
        mcpConfig: A,
        extractedPath: l.extractedPath,
        contentHash: l.contentHash
      };
    }
    let c;
    let u;
    let d;
    if (tHa(e)) {
      let S = mWn.createHash("md5").update(e).digest("hex").substring(0, 8);
      u = Ioe.join(a, `${S}.mcpb`);
      c = await O$p(e, u, r);
    } else {
      let S = Ioe.join(t, e);
      if (r) {
        r(`Loading ${e}...`);
      }
      try {
        c = await i.readFileBytes(S);
        u = S;
        d = Math.floor((await i.stat(S)).mtimeMs);
      } catch (E) {
        if (fn(E)) {
          let C = Error(`MCPB file not found: ${S}`);
          throw logForDebugging(`MCPB file not found: ${S}`, {
            level: "error"
          }), C;
        }
        throw E;
      }
    }
    let p = P$p(c);
    if (logForDebugging(`MCPB content hash: ${p}`), r) {
      r("Extracting MCPB archive...");
    }
    let m = await dpe(Buffer.from(c));
    let f = rNe(c);
    let h = m["manifest.json"];
    if (!h) {
      let S = Error("No manifest.json found in MCPB file");
      throw logForDebugging(`No manifest.json found in MCPB file: ${u}`, {
        level: "error"
      }), S;
    }
    let g = await aSo(h);
    if (logForDebugging(`MCPB manifest: ${g.name} v${g.version} by ${g.author.name}`), !g.server) {
      let S = $o(Error(`MCPB manifest for "${g.name}" does not define a server configuration`), "MCPB manifest does not define a server configuration");
      throw Oe(S), S;
    }
    let y = Ioe.join(a, p);
    if (await D$p(m, y, f, r), g.user_config && Object.keys(g.user_config).length > 0) {
      let S = g.name;
      let E = x6e(n, S);
      let C = o || E || {};
      let x = oNe(C, g.user_config);
      if (!x.valid) {
        let I = {
          source: e,
          contentHash: p,
          extractedPath: y,
          cachedAt: new Date().toISOString(),
          lastChecked: new Date().toISOString(),
          sourceMtimeMs: d
        };
        await cSo(a, e, I);
        return {
          status: "needs-config",
          manifest: g,
          extractedPath: y,
          contentHash: p,
          configSchema: g.user_config,
          existingConfig: E || {},
          validationErrors: x.errors
        };
      }
      if (o) {
        await pWn(n, S, o, g.user_config ?? {});
      }
      if (r) {
        r("Generating MCP server configuration...");
      }
      let A = await dWn(g, y, C);
      let k = {
        source: e,
        contentHash: p,
        extractedPath: y,
        cachedAt: new Date().toISOString(),
        lastChecked: new Date().toISOString(),
        sourceMtimeMs: d
      };
      await cSo(a, e, k);
      return {
        manifest: g,
        mcpConfig: A,
        extractedPath: y,
        contentHash: p
      };
    }
    if (r) {
      r("Generating MCP server configuration...");
    }
    let _ = await dWn(g, y);
    let b = {
      source: e,
      contentHash: p,
      extractedPath: y,
      cachedAt: new Date().toISOString(),
      lastChecked: new Date().toISOString(),
      sourceMtimeMs: d
    };
    await cSo(a, e, b);
    logForDebugging(`Successfully loaded MCPB: ${g.name} (extracted to ${y})`);
    return {
      manifest: g,
      mcpConfig: _,
      extractedPath: y,
      contentHash: p
    };
  }
  var mWn;
  var R6e;
  var Ioe;
  var Lft = __lazy(() => {
    h9t();
    pk();
    qtt();
    je();
    J$a();
    w6e();
    dt();
    Rn();
    DW();
    eHa();
    iqt();
    mWn = require("crypto");
    R6e = require("fs/promises");
    Ioe = require("path");
  });
  function Poe(e) {
    return e.source;
  }
  function fWn(e, t) {
    return e.find(n => n.repository === t || n.source === t);
  }
  function hWn() {
    W1.cache?.clear?.();
    N$p.cache?.clear?.();
  }
  async function Fft(e, t, n) {
    let r = {};
    let o = {};
    for (let [u, d] of Object.entries(t)) {
      if (n[u]?.sensitive === true) {
        o[u] = String(d);
      } else {
        r[u] = d;
      }
    }
    let s = new Set(Object.keys(o));
    let i = new Set(Object.keys(r));
    let a = await yl().mutate(u => {
      let d = u.pluginSecrets?.[e];
      let p = d ? vbu(d, (f, h) => i.vZc(h)) : undefined;
      let m = p && d && Object.keys(p).length !== Object.keys(d).length;
      if (Object.keys(o).length === 0 && !m) {
        return u;
      }
      return {
        ...u,
        pluginSecrets: {
          ...u.pluginSecrets,
          [e]: {
            ...p,
            ...o
          }
        }
      };
    });
    if (!a.success) {
      let u = Error(`Failed to save sensitive plugin options for ${e} to secure storage`);
      throw logForDebugging(u.message, {
        level: "error"
      }), u;
    }
    if (a.warning) {
      logForDebugging(`Plugin secrets save warning: ${a.warning}`, {
        level: "warn"
      });
    }
    let l = getInitialSettings().pluginConfigs?.[e]?.options ?? {};
    let c = Object.keys(l).filter(u => s.vZc(u));
    if (Object.keys(r).length > 0 || c.length > 0) {
      let u = Object.fromEntries(c.map(p => [p, undefined]));
      let d = updateSettingsForSource("userSettings", {
        pluginConfigs: {
          [e]: {
            options: {
              ...r,
              ...u
            }
          }
        }
      });
      if (d.error) {
        throw logForDebugging(`Failed to save plugin options for ${e} to settings.json: ${he(d.error)}`, {
          level: "error"
        }), Error(`Failed to save plugin options for ${e}: ${d.error.message}`);
      }
    }
    hWn();
  }
  async function Uft(e) {
    if (getInitialSettings().pluginConfigs?.[e]) {
      let n = {
        [e]: undefined
      };
      let {
        error: r
      } = updateSettingsForSource("userSettings", {
        pluginConfigs: n
      });
      if (r) {
        logForDebugging(`deletePluginOptions: failed to clear settings.pluginConfigs[${e}]: ${r.message}`, {
          level: "warn"
        });
      }
    }
    try {
      if (!(await yl().mutate(r => {
        if (!r.pluginSecrets) {
          return r;
        }
        let o = `${e}/`;
        let s = Object.entries(r.pluginSecrets).filter(([i]) => i !== e && !i.startsWith(o));
        if (s.length === Object.keys(r.pluginSecrets).length) {
          return r;
        }
        return {
          ...r,
          pluginSecrets: s.length > 0 ? Object.fromEntries(s) : undefined
        };
      })).success) {
        logForDebugging(`deletePluginOptions: failed to clear pluginSecrets for ${e} from keychain`, {
          level: "warn"
        });
      }
    } catch (n) {
      logForDebugging(`deletePluginOptions: storage lock unavailable for ${e}: ${he(n)}`, {
        level: "warn"
      });
    }
    hWn();
  }
  function Z9t(e) {
    let t = e.manifest.userConfig;
    if (!t || Object.keys(t).length === 0) {
      return {};
    }
    let n = W1(Poe(e));
    let r = {};
    for (let [o, s] of Object.entries(t)) {
      let i = n[o];
      if (i === undefined || i === "" || s.sensitive !== true && !oNe({
        [o]: i
      }, {
        [o]: s
      }).valid) {
        r[o] = s;
      }
    }
    return r;
  }
  function iHa(e, t) {
    let n = {};
    for (let [r, o] of Object.entries(t)) {
      if (o.required && o.default === undefined) {
        continue;
      }
      n[r] = o.default ?? "";
    }
    return {
      ...n,
      ...e
    };
  }
  function Ooe(e, t) {
    let n = o => o;
    let r = e.replace(/\$\{CLAUDE_PLUGIN_ROOT\}/g, () => n(t.path));
    if (r = r.replace(/\$\{CLAUDE_PROJECT_DIR\}/g, () => n(getProjectRoot())), t.source) {
      let o = t.source;
      r = r.replace(/\$\{CLAUDE_PLUGIN_DATA\}/g, () => n(lTe(o)));
    }
    return r;
  }
  function mEe(e, t) {
    return e.replace(/\$\{user_config\.([^}]+)\}/g, (n, r) => {
      let o = t[r];
      if (o === undefined) {
        throw Error(`Plugin option "${r}" isn't set. Open /plugin manage to configure it, or check that the plugin's userConfig schema declares "${r}".`);
      }
      return String(o);
    });
  }
  function gWn(e, t, n, r) {
    return e.replace(/\$\{user_config\.([^}]+)\}/g, (o, s) => {
      if (n[s]?.sensitive === true) {
        return `[sensitive option '${s}' not available in skill content]`;
      }
      let i = t[s];
      if (i === undefined) {
        return o;
      }
      let a = String(i);
      return r ? r(a) : a;
    });
  }
  var W1;
  var N$p;
  var a9 = __lazy(() => {
    at();
    je();
    dt();
    nW();
    DW();
    Lft();
    k1();
    W1 = TEr(e => {
      let n = getInitialSettings().pluginConfigs?.[e]?.options ?? {};
      let o = yl().read()?.pluginSecrets?.[e] ?? {};
      return {
        ...n,
        ...o
      };
    });
    N$p = FDt(async e => {
      let n = getInitialSettings().pluginConfigs?.[e]?.options ?? {};
      let o = (await yl().readAsync())?.pluginSecrets?.[e] ?? {};
      return {
        ...n,
        ...o
      };
    });
  });
  async function aHa(e, t, n) {
    try {
      logForDebugging(`Loading MCP servers from MCPB: ${t}`);
      let r = e.repository;
      let o = await Q9t(t, e.path, r, a => {
        logForDebugging(`MCPB [${e.name}]: ${a}`);
      });
      if ("status" in o && o.status === "needs-config") {
        logForDebugging(`MCPB ${t} requires user configuration. ` + `User can configure via: /plugin \u2192 Manage plugins \u2192 ${e.name} \u2192 Configure`);
        return null;
      }
      let s = o;
      let i = s.manifest.name;
      logForDebugging(`Loaded MCP server "${i}" from MCPB (extracted to ${s.extractedPath})`);
      return {
        [i]: s.mcpConfig
      };
    } catch (r) {
      let o = he(r);
      logForDebugging(`Failed to load MCPB ${t}: ${o}`, {
        level: "error"
      });
      let s = e.repository;
      if (t.startsWith("http") && (o.includes("download") || o.includes("network"))) {
        n.push({
          type: "mcpb-download-failed",
          source: s,
          plugin: e.name,
          url: t,
          reason: o
        });
      } else if (o.includes("manifest") || o.includes("user configuration")) {
        n.push({
          type: "mcpb-invalid-manifest",
          source: s,
          plugin: e.name,
          mcpbPath: t,
          validationError: o
        });
      } else {
        n.push({
          type: "mcpb-extract-failed",
          source: s,
          plugin: e.name,
          mcpbPath: t,
          reason: o
        });
      }
      return null;
    }
  }
  async function Doe(e, t = []) {
    if (Me.CLAUDE_CODE_SKIP_PLUGIN_MCP_SERVERS) {
      logForDebugging(`Skipping plugin MCP server discovery for "${e.name}" (CLAUDE_CODE_SKIP_PLUGIN_MCP_SERVERS is set)`);
      return;
    }
    if (e.skipMcpDiscovery) {
      return {};
    }
    let n = {};
    let r = xut(e);
    let o = i => {
      if (!r) {
        return false;
      }
      if (QV(i)) {
        logForDebugging(`Skipping MCPB source "${i}" for project-scope @skills-dir plugin "${e.name}": repo-supplied plugins must declare MCP servers inline or via a local in-dir .mcp.json (no pre-approval download).`, {
          level: "warn"
        });
        return true;
      }
      if (fle(i) || i.split(/[/\\]/).some(a => /^\.\. [ .]*$/.test(a))) {
        logForDebugging(`Skipping out-of-directory MCP source "${i}" for project-scope @skills-dir plugin "${e.name}": repo-supplied plugins may only reference files inside the plugin directory.`, {
          level: "warn"
        });
        return true;
      }
      return false;
    };
    let s = await uSo(e.path, ".mcp.json");
    if (s) {
      n = {
        ...n,
        ...s
      };
    }
    if (e.manifest.mcpServers) {
      let i = e.manifest.mcpServers;
      if (typeof i === "string") {
        if (o(i)) {
          ;
        } else if (QV(i)) {
          let a = await aHa(e, i, t);
          if (a) {
            n = {
              ...n,
              ...a
            };
          }
        } else {
          let a = await uSo(e.path, i);
          if (a) {
            n = {
              ...n,
              ...a
            };
          }
        }
      } else if (Array.isArray(i)) {
        let a = await Promise.all(i.map(async l => {
          try {
            if (typeof l === "string") {
              if (o(l)) {
                return null;
              }
              if (QV(l)) {
                return await aHa(e, l, t);
              }
              return await uSo(e.path, l);
            }
            return l;
          } catch (c) {
            logForDebugging(`Failed to load MCP servers from spec for plugin ${e.name}: ${c}`, {
              level: "error"
            });
            return null;
          }
        }));
        for (let l of a) {
          if (l) {
            n = {
              ...n,
              ...l
            };
          }
        }
      } else {
        n = {
          ...n,
          ...i
        };
      }
    }
    return Object.keys(n).length > 0 ? n : undefined;
  }
  async function uSo(e, t) {
    let n = zt();
    let r = lHa.join(e, t);
    let o;
    try {
      o = await n.readFile(r, {
        encoding: "utf-8"
      });
    } catch (s) {
      if (fn(s)) {
        return null;
      }
      logForDebugging(`Failed to load MCP servers from ${r}: ${s}`, {
        level: "error"
      });
      return null;
    }
    try {
      let s = qt(o);
      let i = s.mcpServers || s;
      let a = {};
      for (let [l, c] of Object.entries(i)) {
        let u = vle().safeParse(c);
        if (u.success) {
          a[l] = u.data;
        } else {
          logForDebugging(`Invalid MCP server config for ${l} in ${r}: ${u.error.message}`, {
            level: "error"
          });
        }
      }
      return a;
    } catch (s) {
      logForDebugging(`Failed to load MCP servers from ${r}: ${s}`, {
        level: "error"
      });
      return null;
    }
  }
  function dSo(e) {
    let t = e.manifest.channels;
    if (!t || t.length === 0) {
      return [];
    }
    let n = e.repository;
    let r = [];
    for (let o of t) {
      if (!o.userConfig || Object.keys(o.userConfig).length === 0) {
        continue;
      }
      let s = x6e(n, o.server) ?? {};
      if (!oNe(s, o.userConfig).valid) {
        r.push({
          server: o.server,
          displayName: tMe(o.displayName) ?? o.server,
          configSchema: o.userConfig
        });
      }
    }
    return r;
  }
  function L$p(e, t, n, r) {
    let o = {};
    for (let [s, i] of Object.entries(e)) {
      let a = `plugin:${t}:${s}`;
      let l = {
        ...i,
        scope: "dynamic",
        pluginSource: n,
        pluginPath: r
      };
      o[a] = l;
    }
    return o;
  }
  function F$p(e, t) {
    let n = e.manifest.userConfig;
    let o = e.manifest.channels?.find(a => a.server === t)?.userConfig;
    if (!n && !o) {
      return;
    }
    let s = n ? W1(Poe(e)) : undefined;
    let i = o ? x6e(e.repository, t) ?? undefined : undefined;
    return iHa({
      ...s,
      ...i
    }, {
      ...n,
      ...o
    });
  }
  function B$p(e, t, n, r, o, s) {
    let i = [];
    let a;
    let l;
    let c = [];
    let u = p => {
      let m = Ooe(p, t);
      if (n) {
        m = mEe(m, n);
      }
      let {
        expanded: f,
        missingVars: h
      } = Eoe(m);
      i.push(...h);
      return f;
    };
    let d;
    switch (e.type) {
      case undefined:
      case "stdio":
        {
          let p = {
            ...e
          };
          if (p.command) {
            p.command = u(p.command);
          }
          if (p.args) {
            p.args = p.args.map(f => u(f));
          }
          let m = {
            CLAUDE_PLUGIN_ROOT: t.path,
            CLAUDE_PLUGIN_DATA: lTe(t.source),
            ...(p.env || {})
          };
          for (let [f, h] of Object.entries(m)) {
            if (!U$p.vZc(f)) {
              m[f] = u(h);
            }
          }
          p.env = m;
          d = p;
          break;
        }
      case "sse":
      case "http":
      case "ws":
        {
          let p = {
            ...e
          };
          l = p.url;
          let m = i.length;
          if (p.url) {
            p.url = u(p.url);
          }
          if (c = i.slice(m), p.headers) {
            let f = {};
            for (let [h, g] of Object.entries(p.headers)) {
              f[h] = u(g);
            }
            p.headers = f;
          }
          if (p.headersHelper) {
            p.headersHelper = u(p.headersHelper);
          }
          d = p;
          break;
        }
      case "sse-ide":
      case "ws-ide":
      case "sdk":
      case "claudeai-proxy":
        d = e;
        break;
    }
    if (r && i.length > 0) {
      let m = Ro(i).join(", ");
      if (logForDebugging(`Missing environment variables in plugin MCP config: ${m}`, {
        level: "warn"
      }), o && s) {
        r.push({
          type: "mcp-config-invalid",
          source: t.source,
          plugin: o,
          serverName: s,
          validationError: `Missing environment variables: ${m}`
        });
      }
    }
    if ((d.type === "sse" || d.type === "http" || d.type === "ws") && "url" in d) {
      let p = false;
      try {
        new URL(d.url);
        p = true;
      } catch {}
      if (!p) {
        if (a = c.length > 0 ? `Missing environment variables: ${Ro(c).join(", ")}` : l?.includes("${user_config.") ? `URL is unset or invalid \u2014 open /plugin manage and configure ${o ?? "the plugin"} options` : `Plugin ${o ?? t.source} has an invalid MCP url`, c.length === 0 && r && o && s) {
          r.push({
            type: "mcp-config-invalid",
            source: t.source,
            plugin: o,
            serverName: s,
            validationError: a
          });
        }
      }
    }
    return a ? {
      ...d,
      configError: a
    } : d;
  }
  async function yWn(e, t = []) {
    if (!e.enabled) {
      return;
    }
    let n = e.mcpServers || (await Doe(e, t));
    if (!n) {
      return;
    }
    let r = {};
    for (let [o, s] of Object.entries(n)) {
      let i = F$p(e, o);
      try {
        r[o] = B$p(s, e, i, t, e.name, o);
      } catch (a) {
        t?.push({
          type: "generic-error",
          source: o,
          plugin: e.name,
          error: he(a)
        });
      }
    }
    return L$p(r, e.name, e.source, e.path);
  }
  var lHa;
  var pSo;
  var U$p;
  var sNe = __lazy(() => {
    Lke();
    je();
    pr();
    dt();
    ku();
    Lft();
    k1();
    Kf();
    a9();
    lHa = require("path");
    pSo = ["CLAUDE_PLUGIN_ROOT", "CLAUDE_PLUGIN_DATA"];
    U$p = new Set(pSo);
  });
  function e5t(e, t) {
    if (t === "*") {
      return true;
    }
    let n;
    try {
      n = new URL(e);
    } catch {
      return false;
    }
    let r = t.replaceAll("*", Bft);
    let o = false;
    let s;
    try {
      s = new URL(r);
    } catch {
      let u = r.replace(new RegExp(`:${Bft}(?=[/?#]|$)`), ":0");
      if (u !== r) {
        try {
          s = new URL(u);
          o = true;
        } catch {}
      }
    }
    if (!s) {
      let u = `${n.protocol}//${n.host}${n.pathname}${n.search}`;
      let d = t.replace(/[.+?^${}()|[\]\\]/g, "\\$&");
      return new RegExp(`^${d.replaceAll("*", "[^/]*")}$`).test(u);
    }
    if (s.protocol !== `${Bft}:` && s.protocol !== n.protocol) {
      return false;
    }
    let i = n.hostname.replace(/\.$/, "").toLowerCase();
    let l = s.hostname.replace(/\.$/, "").toLowerCase().replaceAll(Bft, "*").replace(/[.+?^${}()|[\]\\]/g, "\\$&").replaceAll("*", "[^/]*");
    if (!new RegExp(`^${l}$`).test(i)) {
      return false;
    }
    if (s.port === "" && s.hostname.includes(Bft)) {
      o = true;
    }
    if (!o && s.port !== n.port) {
      return false;
    }
    if ((s.pathname === "/" || s.pathname === "") && s.search === "" && !r.endsWith("/")) {
      return true;
    }
    let c = (s.pathname + s.search).replaceAll(Bft, "*").replace(/[.+?^${}()|[\]\\]/g, "\\$&").replaceAll("*", ".*");
    return new RegExp(`^${c}$`).test(n.pathname + n.search);
  }
  var cHa;
  var Bft;
  var mSo = __lazy(() => {
    cHa = require("crypto");
    Bft = `zzwildcard${cHa.randomBytes(8).toString("hex")}zz`;
  });
  function _Wn() {
    return false;
  }
  var bWn = __lazy(() => {
    $n();
  });
  function SWn() {
    return {
      roots: {},
      elicitation: {},
      ...(_Wn() && {
        tasks: {
          requests: {
            elicitation: {
              create: {}
            }
          }
        }
      })
    };
  }
  var fSo = __lazy(() => {
    bWn();
  });
  function uHa() {
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_mcp_stateless_skip_init", true);
  }
  function dHa() {
    if (!uHa()) {
      return {};
    }
    let e = SWn();
    let t = Buffer.from(De(e)).toString("base64");
    if (Buffer.byteLength(t, "ascii") > 6144) {
      logForDebugging("[claudeai-mcp] client capabilities header exceeds size limit \u2014 omitting init-projection headers");
      return {};
    }
    return {
      "anthropic-mcp-client-capabilities": t,
      "MCP-Protocol-Version": "2025-11-25"
    };
  }
  function TWn(e) {
    return e.type === "claudeai-proxy" && e.stateless === true && uHa();
  }
  function pHa(e) {
    if (!TWn(e) || e.type !== "claudeai-proxy") {
      return;
    }
    if (e.cachedInitResponse == null) {
      return;
    }
    let t = QPt.safeParse(e.cachedInitResponse);
    if (!t.success) {
      logForDebugging(`[claudeai-mcp] cached_init_response for ${e.id} failed InitializeResult validation \u2014 falling back to real initialize`);
      return;
    }
    return t.data;
  }
  function mHa(e, t) {
    let n = e.send.bind(e);
    e.send = async (r, o) => {
      if (t !== undefined && iHe(r) && r.method === "initialize") {
        let s = {
          jsonrpc: "2.0",
          id: r.id,
          result: t
        };
        queueMicrotask(() => e.onmessage?.(s));
        return;
      }
      if (Upn(r) && r.method === "notifications/initialized") {
        return;
      }
      return n(r, o);
    };
  }
  function hSo(e, t) {
    let n = new URL(t).href;
    return async (r, o) => {
      if ((o?.method ?? "GET").toUpperCase() !== "GET") {
        return e(r, o);
      }
      let s = typeof r === "object" && r !== null && "url" in r ? r.url : String(r);
      if (new URL(s).href === n) {
        return new Response(null, {
          status: 405,
          statusText: "Method Not Allowed"
        });
      }
      return e(r, o);
    };
  }
  var gSo = __lazy(() => {
    je();
    $n();
    fSo();
  });
  function G$p(e) {
    if (!NP.isAxiosError(e)) {
      return false;
    }
    let t = e.response?.status;
    if (t !== undefined) {
      return t >= 500 && t < 600;
    }
    return e.code !== undefined && W$p.vZc(e.code);
  }
  function ySo() {
    let e = k6e;
    k6e = undefined;
    return e;
  }
  function EWn() {
    let e = ySo();
    if (!e) {
      return;
    }
    let t = e.level === "error" ? _$u.red(e.message) : _$u.yellow(`\u26A0 ${e.message}`);
    process.stderr.write(`${t}
`);
  }
  function V$p(e) {
    let t = {};
    for (let n of e ?? []) {
      let r = NMt().safeParse(n.effective_max_permission);
      if (r.success) {
        t[n.name] = r.data;
      }
    }
    return Object.keys(t).length > 0 ? t : undefined;
  }
  function z$p(e) {
    try {
      return new URL(e).href.replace(/\/+$/, "");
    } catch {
      return e;
    }
  }
  function gHa() {
    iNe.cache.clear?.();
    k6e = undefined;
  }
  function _So(e) {
    saveGlobalConfig(t => {
      let n = t.claudeAiMcpEverConnected ?? [];
      if (n.includes(e)) {
        return t;
      }
      return {
        ...t,
        claudeAiMcpEverConnected: [...n, e]
      };
    });
  }
  function A6e(e) {
    return (getGlobalConfig().claudeAiMcpEverConnected ?? []).includes(e);
  }
  function vWn() {
    return new Set(getGlobalConfig().claudeAiMcpEverConnected ?? []);
  }
  function fEe() {
    return `${getOauthConfig().CLAUDE_AI_ORIGIN}/customize/connectors`;
  }
  function aNe(e) {
    let t = getOauthAccountInfo()?.organizationUuid;
    if (!t || !e.id) {
      return null;
    }
    let n = getOauthConfig().CLAUDE_AI_ORIGIN;
    let r = e.id.startsWith("mcprs") ? "mcpsrv" + e.id.slice(5) : e.id;
    let o = encodeURIComponent(process.env.CLAUDE_CODE_ENTRYPOINT || "cli");
    return `${n}/api/organizations/${t}/mcp/start-auth/${r}?product_surface=${o}`;
  }
  var W$p;
  var k6e;
  var iNe;
  var l9 = __lazy(() => {
    Dp();
    KN();
    Uc();
    Ot();
    no();
    wb();
    je();
    gn();
    YA();
    Ds();
    Wd();
    ln();
    gSo();
    Lke();
    W$p = new Set(["ECONNABORTED", "ECONNRESET", "ECONNREFUSED", "ETIMEDOUT", "EAI_AGAIN"]);
    iNe = TEr(async () => {
      let e = 0;
      k6e = undefined;
      try {
        let t = Pl(process.env.ENABLE_CLAUDEAI_MCP_SERVERS);
        let n = hasDisableClaudeAiConnectors();
        if (t || n) {
          logForDebugging(`[claudeai-mcp] Disabled via ${t ? "env var" : "disableClaudeAiConnectors setting"}`);
          logEvent("tengu_claudeai_mcp_eligibility", {
            state: t ? "disabled_env_var" : "disabled_setting"
          });
          return {};
        }
        if (Pc("mcpClaudeAi")) {
          logForDebugging("[claudeai-mcp] Disabled in safe mode");
          logEvent("tengu_claudeai_mcp_eligibility", {
            state: "safe_mode"
          });
          return {};
        }
        if (!isFirstPartyProvider()) {
          logForDebugging("[claudeai-mcp] Disabled on third-party provider");
          logEvent("tengu_claudeai_mcp_eligibility", {
            state: "third_party_provider"
          });
          return {};
        }
        if (!isClaudeAISubscriber()) {
          if (logForDebugging("[claudeai-mcp] Disabled: API-key auth precedence active"), logEvent("tengu_claudeai_mcp_eligibility", {
            state: "api_key_precedence"
          }), getClaudeAIOAuthTokens()?.scopes?.includes("user:mcp_servers")) {
            k6e = {
              level: "warn",
              message: "claude.ai connectors are disabled because ANTHROPIC_API_KEY or another auth source is set and takes precedence over your claude.ai login \xB7 Unset it to load your organization's connectors"
            };
          }
          return {};
        }
        await checkAndRefreshOAuthTokenIfNeeded();
        let r = getClaudeAIOAuthTokens();
        if (!r?.accessToken) {
          logForDebugging("[claudeai-mcp] No access token");
          logEvent("tengu_claudeai_mcp_eligibility", {
            state: "no_oauth_token"
          });
          return {};
        }
        if (!r.scopes?.includes("user:mcp_servers")) {
          let p = process.env.CLAUDE_CODE_REMOTE_ENVIRONMENT_TYPE ? "[claudeai-mcp] inference token lacks user:mcp_servers scope \u2014 claude.ai org connectors disabled (locally-configured MCP servers in managed-mcp.json / .claude.json / .mcp.json are NOT affected by this check)" : `[claudeai-mcp] Missing user:mcp_servers scope (scopes=${r.scopes?.join(",") || "none"})`;
          logForDebugging(p);
          logEvent("tengu_claudeai_mcp_eligibility", {
            state: "missing_scope"
          });
          return {};
        }
        let s = `${getOauthConfig().BASE_API_URL}/v1/mcp_servers?limit=1000`;
        logForDebugging(`[claudeai-mcp] Fetching from ${s}`);
        let i = () => withOAuth401Retry(() => NP.get(s, {
          headers: {
            Authorization: `Bearer ${getClaudeAIOAuthTokens()?.accessToken ?? r.accessToken}`,
            "Content-Type": "application/json",
            "anthropic-beta": Y4r.header,
            "anthropic-version": "2023-06-01",
            ...dHa()
          },
          timeout: 5000
        }));
        let a = Date.now();
        let l;
        while (true) {
          e++;
          try {
            l = await i();
            break;
          } catch (p) {
            if (e >= 3 || !G$p(p)) {
              throw p;
            }
            let m = 500 * 3 ** (e - 1);
            if (Date.now() - a + m + 5000 >= 12000) {
              throw logForDebugging(`[claudeai-mcp] Retry budget exhausted after ${e} attempt(s)`), p;
            }
            let f = NP.isAxiosError(p) ? p.response?.status ?? p.code ?? "unknown" : "unknown";
            logForDebugging(`[claudeai-mcp] Transient fetch error (${f}), retrying in ${m}ms (attempt ${e}/${3})`);
            await sleep(m);
          }
        }
        let c = new Map();
        for (let p of l.data.data) {
          let m = z$p(p.url);
          let f = c.get(m);
          if (f) {
            logForDebugging(`[claudeai-mcp] Dropping duplicate upstream ${m}: keeping ${f.id}, dropping ${p.id}`);
            continue;
          }
          c.set(m, p);
        }
        let u = {};
        let d = new Set();
        for (let p of c.values()) {
          let m = `claude.ai ${p.display_name}`;
          let f = m;
          let h = Bl(f);
          let g = 1;
          while (d.vZc(h)) {
            g++;
            f = `${m} (${g})`;
            h = Bl(f);
          }
          if (g > 1) {
            logForDebugging(`[claudeai-mcp] Display-name collision on distinct upstreams: "${f}" (${p.id}, ${p.url})`);
          }
          d.add(h);
          u[f] = {
            type: "claudeai-proxy",
            url: p.url,
            id: p.id,
            displayName: p.display_name,
            iconUrl: p.icon_url,
            scope: "claudeai",
            toolPermissions: V$p(p.tools),
            stateless: p.stateless,
            cachedInitResponse: p.cached_init_response
          };
        }
        logForDebugging(`[claudeai-mcp] Fetched ${Object.keys(u).length} servers`);
        logEvent("tengu_claudeai_mcp_eligibility", {
          state: "eligible"
        });
        Pe("mcp_claudeai_fetch_configs");
        return u;
      } catch (t) {
        let n = NP.isAxiosError(t) ? String(t.response?.status ?? t.code ?? "unknown") : "unknown";
        logForDebugging(`[claudeai-mcp] Fetch failed (${n}) after ${e} attempt(s)`);
        logEvent("tengu_claudeai_mcp_eligibility", {
          state: "fetch_failed",
          status: n,
          attempts: e
        });
        Ae("mcp_claudeai_fetch_configs", "fetch_failed");
        iNe.cache.clear?.();
        return {};
      }
    });
  });
  var wHa = {};