  var x$a = __commonJS(aWn => {
    Object.defineProperty(aWn, "__esModule", {
      value: true
    });
    aWn.DestroyerOfModules = undefined;
    var iWn = ABa();
    var Mft = require("path");
    var Jbo = Ybo();
    class R$a {
      constructor({
        rootDirectory: e,
        walker: t,
        shouldKeepModuleTest: n
      }) {
        if (e) {
          this.walker = new Jbo.Walker(e);
        } else if (t) {
          this.walker = t;
        } else {
          throw Error("Must either provide rootDirectory or walker argument");
        }
        if (n) {
          this.shouldKeepFn = n;
        }
      }
      async destroyModule(e, t) {
        if (t.get(e)) {
          let r = Mft.resolve(e, "node_modules");
          if (!(await iWn.pathExists(r))) {
            return;
          }
          for (let o of await iWn.readdir(r)) {
            if (o.startsWith("@")) {
              for (let s of await iWn.readdir(Mft.resolve(r, o))) {
                await this.destroyModule(Mft.resolve(r, o, s), t);
              }
            } else {
              await this.destroyModule(Mft.resolve(r, o), t);
            }
          }
        } else {
          await iWn.remove(e);
        }
      }
      async collectKeptModules({
        relativePaths: e = false
      }) {
        let t = await this.walker.walkTree();
        let n = new Map();
        let r = Mft.resolve(this.walker.getRootModule());
        for (let o of t) {
          if (this.shouldKeepModule(o)) {
            let s = o.path;
            if (e) {
              s = s.replace(`${r}${Mft.sep}`, "");
            }
            n.set(s, o);
          }
        }
        return n;
      }
      async destroy() {
        await this.destroyModule(this.walker.getRootModule(), await this.collectKeptModules({
          relativePaths: false
        }));
      }
      shouldKeepModule(e) {
        let t = e.depType === Jbo.DepType.DEV || e.depType === Jbo.DepType.DEV_OPTIONAL;
        return this.shouldKeepFn ? this.shouldKeepFn(e, t) : !t;
      }
    }
    aWn.DestroyerOfModules = R$a;
  });
  var A$a = __commonJS(nNe => {
    var i$p = nNe && nNe.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var k$a = nNe && nNe.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          i$p(t, e, n);
        }
      }
    };
    Object.defineProperty(nNe, "__esModule", {
      value: true
    });
    k$a(x$a(), nNe);
    k$a(Ybo(), nNe);
  });
  var O$a = __commonJS((Fb_, P$a) => {
    var a$p = ["B", "kB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB"];
    var l$p = ["B", "kiB", "MiB", "GiB", "TiB", "PiB", "EiB", "ZiB", "YiB"];
    var c$p = ["b", "kbit", "Mbit", "Gbit", "Tbit", "Pbit", "Ebit", "Zbit", "Ybit"];
    var u$p = ["b", "kibit", "Mibit", "Gibit", "Tibit", "Pibit", "Eibit", "Zibit", "Yibit"];
    var I$a = (e, t, n) => {
      let r = e;
      if (typeof t === "string" || Array.isArray(t)) {
        r = e.toLocaleString(t, n);
      } else if (t === true || n !== undefined) {
        r = e.toLocaleString(undefined, n);
      }
      return r;
    };
    P$a.exports = (e, t) => {
      if (!Number.isFinite(e)) {
        throw TypeError(`Expected a finite number, got ${typeof e}: ${e}`);
      }
      t = Object.assign({
        bits: false,
        binary: false
      }, t);
      let n = t.bits ? t.binary ? u$p : c$p : t.binary ? l$p : a$p;
      if (t.signed && e === 0) {
        return ` 0 ${n[0]}`;
      }
      let r = e < 0;
      let o = r ? "-" : t.signed ? "+" : "";
      if (r) {
        e = -e;
      }
      let s;
      if (t.minimumFractionDigits !== undefined) {
        s = {
          minimumFractionDigits: t.minimumFractionDigits
        };
      }
      if (t.maximumFractionDigits !== undefined) {
        s = Object.assign({
          maximumFractionDigits: t.maximumFractionDigits
        }, s);
      }
      if (e < 1) {
        let c = I$a(e, t.locale, s);
        return o + c + " " + n[0];
      }
      let i = Math.min(Math.floor(t.binary ? Math.log(e) / Math.log(1024) : Math.log10(e) / 3), n.length - 1);
      if (e /= Math.pow(t.binary ? 1024 : 1000, i), !s) {
        e = e.toPrecision(3);
      }
      let a = I$a(Number(e), t.locale, s);
      let l = n[i];
      return o + a + " " + l;
    };
  });
  function signMcpbFile(e, t, n, r) {
    let o = cpe.readFileSync(e);
    let s = cpe.readFileSync(t, "utf-8");
    let i = cpe.readFileSync(n, "utf-8");
    let a = r?.map(h => cpe.readFileSync(h, "utf-8"));
    let l = tA.default.pkcs7.createSignedData();
    l.content = tA.default.util.createBuffer(o);
    let c = tA.default.pki.certificateFromPem(s);
    let u = tA.default.pki.privateKeyFromPem(i);
    if (l.addCertificate(c), a) {
      for (let h of a) {
        l.addCertificate(tA.default.pki.certificateFromPem(h));
      }
    }
    l.addSigner({
      key: u,
      certificate: c,
      digestAlgorithm: tA.default.pki.oids.sha256,
      authenticatedAttributes: [{
        type: tA.default.pki.oids.contentType,
        value: tA.default.pki.oids.data
      }, {
        type: tA.default.pki.oids.messageDigest
      }, {
        type: tA.default.pki.oids.signingTime
      }]
    });
    l.sign({
      detached: true
    });
    let d = tA.default.asn1.toDer(l.toAsn1());
    let p = Buffer.from(d.getBytes(), "binary");
    let m = f$p(p);
    let f = Buffer.concat([o, m]);
    cpe.writeFileSync(e, f);
  }
  async function verifyMcpbFile(e) {
    try {
      let t = cpe.readFileSync(e);
      let {
        originalContent: n,
        pkcs7Signature: r
      } = extractSignatureBlock(t);
      if (!r) {
        return {
          status: "unsigned"
        };
      }
      let o = tA.default.asn1.fromDer(r.toString("binary"));
      let s = tA.default.pkcs7.messageFromAsn1(o);
      if (!("type" in s) || s.type !== tA.default.pki.oids.signedData) {
        return {
          status: "unsigned"
        };
      }
      let i = s;
      let a = i.certificates || [];
      if (a.length === 0) {
        return {
          status: "unsigned"
        };
      }
      let l = a[0];
      let c = tA.default.util.createBuffer(n);
      try {
        i.verify({
          authenticatedAttributes: true
        });
        let h = i.signerInfos?.[0];
        if (h) {
          let g = tA.default.md.sha256.create();
          g.update(c.getBytes());
          let y = g.digest().getBytes();
          let _ = null;
          for (let b of h.authenticatedAttributes) {
            if (b.type === tA.default.pki.oids.messageDigest) {
              _ = b.value;
              break;
            }
          }
          if (!_ || _ !== y) {
            return {
              status: "unsigned"
            };
          }
        }
      } catch (f) {
        return {
          status: "unsigned"
        };
      }
      let u = tA.default.pki.certificateToPem(l);
      let d = a.slice(1).map(f => Buffer.from(tA.default.pki.certificateToPem(f)));
      if (!(await verifyCertificateChain(Buffer.from(u), d))) {
        return {
          status: "unsigned"
        };
      }
      return {
        status: l.issuer.getField("CN")?.value === l.subject.getField("CN")?.value ? "self-signed" : "signed",
        publisher: l.subject.getField("CN")?.value || "Unknown",
        issuer: l.issuer.getField("CN")?.value || "Unknown",
        valid_from: l.validity.notBefore.toISOString(),
        valid_to: l.validity.notAfter.toISOString(),
        fingerprint: tA.default.md.sha256.create().update(tA.default.asn1.toDer(tA.default.pki.certificateToAsn1(l)).getBytes()).digest().toHex()
      };
    } catch (t) {
      throw Error(`Failed to verify MCPB file: ${t}`);
    }
  }
  function f$p(e) {
    let t = [];
    t.push(Buffer.from("MCPB_SIG_V1", "utf-8"));
    let n = Buffer.alloc(4);
    n.writeUInt32LE(e.length, 0);
    t.push(n);
    t.push(e);
    t.push(Buffer.from("MCPB_SIG_END", "utf-8"));
    return Buffer.concat(t);
  }
  function extractSignatureBlock(e) {
    let t = Buffer.from("MCPB_SIG_END", "utf-8");
    let n = e.lastIndexOf(t);
    if (n === -1) {
      return {
        originalContent: e
      };
    }
    let r = Buffer.from("MCPB_SIG_V1", "utf-8");
    let o = -1;
    for (let a = n - 1; a >= 0; a--) {
      if (e.slice(a, a + r.length).equals(r)) {
        o = a;
        break;
      }
    }
    if (o === -1) {
      return {
        originalContent: e
      };
    }
    let s = e.slice(0, o);
    let i = o + r.length;
    try {
      let a = e.readUInt32LE(i);
      i += 4;
      let l = e.slice(i, i + a);
      return {
        originalContent: s,
        pkcs7Signature: l
      };
    } catch {
      return {
        originalContent: e
      };
    }
  }
  async function verifyCertificateChain(e, t) {
    let n = null;
    try {
      n = await Nft.mkdtemp(Xbo.join(M$a.tmpdir(), "mcpb-verify-"));
      let r = Xbo.join(n, "chain.pem");
      let o = [e, ...(t || [])].join(`
`);
      await Nft.writeFile(r, o);
      try {
        await d$p("openssl", ["verify", "-purpose", "codesigning", "-CApath", "/etc/ssl/certs", r]);
        return true;
      } catch (s) {
        return false;
      }
    } catch (r) {
      return false;
    } finally {
      if (n) {
        try {
          await Nft.rm(n, {
            recursive: true,
            force: true
          });
        } catch {}
      }
    }
  }
  function unsignMcpbFile(e) {
    let t = cpe.readFileSync(e);
    let {
      originalContent: n
    } = extractSignatureBlock(t);
    cpe.writeFileSync(e, n);
  }
  var D$a;
  var cpe;
  var Nft;
  var tA;
  var M$a;
  var Xbo;
  var N$a;
  var d$p;
  var Qbo = __lazy(() => {
    D$a = require("child_process");
    cpe = require("fs");
    Nft = require("fs/promises");
    tA = __toESM(yUn(), 1);
    M$a = require("os");
    Xbo = require("path");
    N$a = require("util");
    d$p = N$a.promisify(D$a.execFile);
  });
  function lWn({
    silent: e = false
  } = {}) {
    return {
      log: (...t) => {
        if (!e) {
          console.log(...t);
        }
      },
      error: (...t) => {
        if (!e) {
          console.error(...t);
        }
      },
      warn: (...t) => {
        if (!e) {
          console.warn(...t);
        }
      },
      info: (...t) => {
        if (!e) {
          console.info(...t);
        }
      },
      debug: (...t) => {
        if (!e) {
          console.debug(...t);
        }
      }
    };
  }
  async function unpackExtension({
    mcpbPath: e,
    outputDir: t,
    silent: n
  }) {
    let r = lWn({
      silent: n
    });
    let o = upe.resolve(e);
    if (!JV.existsSync(o)) {
      r.error(`ERROR: MCPB file not found: ${e}`);
      return false;
    }
    let s = t ? upe.resolve(t) : process.cwd();
    if (!JV.existsSync(s)) {
      JV.mkdirSync(s, {
        recursive: true
      });
    }
    try {
      let i = JV.readFileSync(o);
      let {
        originalContent: a
      } = extractSignatureBlock(i);
      let l = new Map();
      let c = true;
      {
        let d = a;
        let p = -1;
        for (let m = d.length - 22; m >= 0; m--) {
          if (d.readUInt32LE(m) === 101010256) {
            p = m;
            break;
          }
        }
        if (p !== -1) {
          let m = d.readUInt32LE(p + 16);
          let f = d.readUInt16LE(p + 8);
          let h = m;
          for (let g = 0; g < f; g++) {
            if (d.readUInt32LE(h) === 33639248) {
              let y = d.readUInt32LE(h + 38);
              let _ = d.readUInt16LE(h + 28);
              let b = d.toString("utf8", h + 46, h + 46 + _);
              let S = y >> 16 & 511;
              if (S > 0) {
                l.set(b, S);
              }
              let E = d.readUInt16LE(h + 30);
              let C = d.readUInt16LE(h + 32);
              h += 46 + _ + E + C;
            } else {
              break;
            }
          }
        }
      }
      let u = unzipSync(a);
      for (let d in u) {
        if (Object.prototype.hasOwnProperty.call(u, d)) {
          let p = u[d];
          let m = upe.join(s, d);
          let f = upe.resolve(m);
          let h = upe.resolve(s);
          if (!f.startsWith(h + upe.sep) && f !== h) {
            throw Error(`Path traversal attempt detected: ${d}`);
          }
          let g = upe.join(m, "..");
          if (!JV.existsSync(g)) {
            JV.mkdirSync(g, {
              recursive: true
            });
          }
          if (JV.writeFileSync(m, p), l.vZc(d)) {
            try {
              let y = l.get(d);
              if (y !== undefined) {
                JV.chmodSync(m, y);
              }
            } catch (y) {}
          }
        }
      }
      r.log(`Extension unpacked successfully to ${s}`);
      return true;
    } catch (i) {
      if (i instanceof Error) {
        r.error(`ERROR: Failed to unpack extension: ${i.message}`);
      } else {
        r.error("ERROR: An unknown error occurred during unpacking.");
      }
      return false;
    }
  }
  var JV;
  var upe;
  var eSo = __lazy(() => {
    Qbo();
    JV = require("fs");
    upe = require("path");
  });
  var B$a;
  var g$p;
  var y$p;
  var _$p;
  var b$p;
  var S$p;
  var T$p;
  var E$p;
  var v$p;
  var w$p;
  var Wb_;
  var $$a;
  var Gb_;
  var H$a = __lazy(() => {
    qg();
    B$a = object({
      command: string(),
      args: array(string()).optional(),
      env: record(string(), string()).optional()
    });
    g$p = object({
      name: string(),
      email: string().email().optional(),
      url: string().url().optional()
    });
    y$p = object({
      type: string(),
      url: string().url()
    });
    _$p = B$a.partial();
    b$p = B$a.extend({
      platform_overrides: record(string(), _$p).optional()
    });
    S$p = object({
      type: bte(["python", "node", "binary"]),
      entry_point: string(),
      mcp_config: b$p
    });
    T$p = object({
      claude_desktop: string().optional(),
      platforms: array(bte(["darwin", "win32", "linux"])).optional(),
      runtimes: object({
        python: string().optional(),
        node: string().optional()
      }).optional()
    }).passthrough();
    E$p = object({
      name: string(),
      description: string().optional()
    });
    v$p = object({
      name: string(),
      description: string().optional(),
      arguments: array(string()).optional(),
      text: string()
    });
    w$p = object({
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
    Wb_ = record(string(), union([string(), number(), boolean(), array(string())]));
    $$a = object({
      $schema: string().optional(),
      dxt_version: string().optional().describe("@deprecated Use manifest_version instead"),
      manifest_version: string().optional(),
      name: string(),
      display_name: string().optional(),
      version: string(),
      description: string(),
      long_description: string().optional(),
      author: g$p,
      repository: y$p.optional(),
      homepage: string().url().optional(),
      documentation: string().url().optional(),
      support: string().url().optional(),
      icon: string().optional(),
      screenshots: array(string()).optional(),
      server: S$p,
      tools: array(E$p).optional(),
      tools_generated: boolean().optional(),
      prompts: array(v$p).optional(),
      prompts_generated: boolean().optional(),
      keywords: array(string()).optional(),
      license: string().optional(),
      compatibility: T$p.optional(),
      user_config: record(string(), w$p).optional()
    }).refine(e => !!(e.dxt_version || e.manifest_version), {
      message: "Either 'dxt_version' (deprecated) or 'manifest_version' must be provided"
    });
    Gb_ = object({
      status: bte(["signed", "unsigned", "self-signed"]),
      publisher: string().optional(),
      issuer: string().optional(),
      valid_from: string().optional(),
      valid_to: string().optional(),
      fingerprint: string().optional()
    });
  });
  function validateManifest(e) {
    try {
      let t = koe.resolve(e);
      let n = t;
      if (pEe.existsSync(t) && pEe.statSync(t).isDirectory()) {
        n = koe.join(t, "manifest.json");
      }
      let r = pEe.readFileSync(n, "utf-8");
      let o = JSON.parse(r);
      let s = McpbManifestSchema.safeParse(o);
      if (s.success) {
        console.log("Manifest schema validation passes!");
        return true;
      } else {
        console.log(`ERROR: Manifest validation failed:
`);
        s.error.issues.forEach(i => {
          let a = i.path.join(".");
          console.log(`  - ${a ? `${a}: ` : ""}${i.message}`);
        });
        return false;
      }
    } catch (t) {
      if (t instanceof Error) {
        if (t.message.includes("ENOENT")) {
          if (console.error(`ERROR: File not found: ${e}`), pEe.existsSync(koe.resolve(e)) && pEe.statSync(koe.resolve(e)).isDirectory()) {
            console.error("  (No manifest.json found in directory)");
          }
        } else if (t.message.includes("JSON")) {
          console.error(`ERROR: Invalid JSON in manifest file: ${t.message}`);
        } else {
          console.error(`ERROR: Error reading manifest: ${t.message}`);
        }
      } else {
        console.error("ERROR: Unknown error occurred");
      }
      return false;
    }
  }
  async function cleanMcpb(e) {
    let t = await i9.mkdtemp(koe.resolve(q$a.tmpdir(), "mcpb-clean-"));
    let n = koe.resolve(t, "in.mcpb");
    let r = koe.resolve(t, "out");
    console.log(" -- Cleaning MCPB...");
    try {
      await i9.copyFile(e, n);
      console.log(" -- Unpacking MCPB...");
      await unpackExtension({
        mcpbPath: n,
        silent: true,
        outputDir: r
      });
      let o = koe.resolve(r, "manifest.json");
      let s = await i9.readFile(o, "utf-8");
      let i = JSON.parse(s);
      let a = $$a.safeParse(i);
      if (!a.success) {
        throw Error('Unrecoverable manifest issues, please run "mcpb validate"');
      }
      if (await i9.writeFile(o, JSON.stringify(a.data, null, 2)), s.trim() !== (await i9.readFile(o, "utf8")).trim()) {
        console.log(" -- Update manifest to be valid per MCPB schema");
      } else {
        console.log(" -- Manifest already valid per MCPB schema");
      }
      let l = koe.resolve(r, "node_modules");
      if (pEe.existsSync(l)) {
        console.log(" -- node_modules found, deleting development dependencies");
        let p = new j$a.DestroyerOfModules({
          rootDirectory: r
        });
        try {
          await p.destroy();
        } catch (m) {
          if (m instanceof Error && m.message.includes("Failed to locate module")) {
            console.log(" -- Some modules already removed, skipping remaining cleanup");
          } else {
            throw m;
          }
        }
        console.log(" -- Removed development dependencies from node_modules");
      } else {
        console.log(" -- No node_modules, not pruning");
      }
      let c = await i9.stat(e);
      let {
        packExtension: u
      } = await Promise.resolve().then(() => (oSo(), W$a));
      await u({
        extensionPath: r,
        outputPath: e,
        silent: true
      });
      let d = await i9.stat(e);
      console.log(`
Clean Complete:`);
      console.log("Before:", tSo.default(c.size));
      console.log("After:", tSo.default(d.size));
    } finally {
      await i9.rm(t, {
        recursive: true,
        force: true
      });
    }
  }
  var pEe;
  var i9;
  var j$a;
  var q$a;
  var koe;
  var tSo;
  var rSo = __lazy(() => {
    eSo();
    w9t();
    H$a();
    pEe = require("fs");
    i9 = __toESM(require("fs/promises"));
    j$a = __toESM(A$a(), 1);
    q$a = __toESM(require("os"));
    koe = require("path");
    tSo = __toESM(O$a(), 1);
  });
  var W$a = {};
  __export(W$a, {
    packExtension: () => packExtension
  });
  function X9t(e) {
    if (e < 1024) {
      return `${e}B`;
    } else if (e < 1048576) {
      return `${(e / 1024).toFixed(1)}kB`;
    } else {
      return `${(e / 1048576).toFixed(1)}MB`;
    }
  }
  function R$p(e) {
    return e.toLowerCase().replace(/\s+/g, "-").replace(/[^a-z0-9-_.]/g, "").replace(/-+/g, "-").replace(/^-+|-+$/g, "").substring(0, 100);
  }
  async function packExtension({
    extensionPath: e,
    outputPath: t,
    silent: n
  }) {
    let r = XV.resolve(e);
    let o = lWn({
      silent: n
    });
    if (!Aoe.existsSync(r) || !Aoe.statSync(r).isDirectory()) {
      o.error(`ERROR: Directory not found: ${e}`);
      return false;
    }
    let s = XV.join(r, "manifest.json");
    if (!Aoe.existsSync(s)) {
      if (o.log(`No manifest.json found in ${e}`), await _T({
        message: "Would you like to create a manifest.json file?",
        default: true
      })) {
        if (!(await initExtension(e))) {
          o.error("ERROR: Failed to create manifest");
          return false;
        }
      } else {
        o.error("ERROR: Cannot pack extension without manifest.json");
        return false;
      }
    }
    if (o.log("Validating manifest..."), !validateManifest(s)) {
      o.error("ERROR: Cannot pack extension with invalid manifest");
      return false;
    }
    let i;
    try {
      let d = Aoe.readFileSync(s, "utf-8");
      let p = JSON.parse(d);
      i = McpbManifestSchema.parse(p);
    } catch (d) {
      if (o.error("ERROR: Failed to parse manifest.json"), d instanceof Error) {
        o.error(`  ${d.message}`);
      }
      return false;
    }
    let a = i.manifest_version || i.dxt_version;
    if (a !== "0.2") {
      o.error(`ERROR: Manifest version mismatch. Expected "${"0.2"}", found "${a}"`);
      o.error(`  Please update the manifest_version in your manifest.json to "${"0.2"}"`);
      return false;
    }
    let l = XV.basename(r);
    let c = t ? XV.resolve(t) : XV.resolve(`${l}.mcpb`);
    let u = XV.join(c, "..");
    Aoe.mkdirSync(u, {
      recursive: true
    });
    try {
      let d = readMcpbIgnorePatterns(r);
      let {
        files: p,
        ignoredCount: m
      } = getAllFilesWithCount(r, r, {}, d);
      o.log(`
\uD83D\uDCE6  ${i.name}@${i.version}`);
      o.log("Archive Contents");
      let f = Object.entries(p);
      let h = 0;
      f.sort(([A], [k]) => A.localeCompare(k));
      let g = new Map();
      let y = [];
      for (let [A, k] of f) {
        let I = XV.relative(r, A);
        let O = k.data;
        let M = typeof O === "string" ? Buffer.byteLength(O, "utf8") : O.length;
        h += M;
        let L = I.split(XV.sep);
        if (L.length > 3) {
          let P = L.slice(0, 3).join("/");
          if (!g.vZc(P)) {
            g.set(P, {
              files: [],
              totalSize: 0
            });
          }
          let F = g.get(P);
          F.files.push(I);
          F.totalSize += M;
        } else {
          y.push({
            path: I,
            size: M
          });
        }
      }
      for (let {
        path: A,
        size: k
      } of y) {
        o.log(`${X9t(k).padStart(8)} ${A}`);
      }
      for (let [A, {
        files: k,
        totalSize: I
      }] of g) {
        if (k.length === 1) {
          let O = k[0];
          let M = I;
          o.log(`${X9t(M).padStart(8)} ${O}`);
        } else {
          o.log(`${X9t(I).padStart(8)} ${A}/ [and ${k.length} more files]`);
        }
      }
      let _ = {};
      let b = true;
      for (let [A, k] of Object.entries(p)) {
        if (b) {
          _[A] = [k.data, {
            os: 3,
            attrs: (k.mode & 511) << 16
          }];
        } else {
          _[A] = k.data;
        }
      }
      let S = zipSync(_, {
        level: 9,
        mtime: new Date()
      });
      Aoe.writeFileSync(c, S);
      let E = G$a.createHash("sha1").update(S).digest("hex");
      let x = `${R$p(i.name)}-${i.version}.mcpb`;
      o.log(`
Archive Details`);
      o.log(`name: ${i.name}`);
      o.log(`version: ${i.version}`);
      o.log(`filename: ${x}`);
      o.log(`package size: ${X9t(S.length)}`);
      o.log(`unpacked size: ${X9t(h)}`);
      o.log(`shasum: ${E}`);
      o.log(`total files: ${f.length}`);
      o.log(`ignored (.mcpbignore) files: ${m}`);
      o.log(`
Output: ${c}`);
      return true;
    } catch (d) {
      if (d instanceof Error) {
        o.error(`ERROR: Archive error: ${d.message}`);
      } else {
        o.error("ERROR: Unknown archive error occurred");
      }
      return false;
    }
  }
  var G$a;
  var Aoe;
  var XV;
  var oSo = __lazy(() => {
    L_o();
    _bo();
    rSo();
    w9t();
    W_o();
    G$a = require("crypto");
    Aoe = require("fs");
    XV = require("path");
  });
  function replaceVariables(e, t) {
    if (typeof e === "string") {
      let n = e;
      for (let [r, o] of Object.entries(t)) {
        let s = new RegExp(`\\$\\{${r}\\}`, "g");
        if (n.match(s)) {
          if (Array.isArray(o)) {
            console.warn(`Cannot replace ${r} with array value in string context: "${e}"`, {
              key: r,
              replacement: o
            });
          } else {
            n = n.replace(s, o);
          }
        }
      }
      return n;
    } else if (Array.isArray(e)) {
      let n = [];
      for (let r of e) {
        if (typeof r === "string" && r.match(/^\$\{user_config\.[^}]+\}$/)) {
          let o = r.match(/^\$\{([^}]+)\}$/)?.[1];
          if (o && t[o]) {
            let s = t[o];
            if (Array.isArray(s)) {
              n.push(...s);
            } else {
              n.push(s);
            }
          } else {
            n.push(r);
          }
        } else {
          n.push(replaceVariables(r, t));
        }
      }
      return n;
    } else if (e && typeof e === "object") {
      let n = {};
      for (let [r, o] of Object.entries(e)) {
        n[r] = replaceVariables(o, t);
      }
      return n;
    }
    return e;
  }
  async function getMcpConfigForManifest(e) {
    let {
      manifest: t,
      extensionPath: n,
      systemDirs: r,
      userConfig: o,
      pathSeparator: s,
      logger: i
    } = e;
    let a = t.server?.mcp_config;
    if (!a) {
      return;
    }
    let l = {
      ...a
    };
    if (a.platform_overrides) {
      if ("linux" in a.platform_overrides) {
        let d = a.platform_overrides.linux;
        l.command = d.command || l.command;
        l.args = d.args || l.args;
        l.env = d.env || l.env;
      }
    }
    if (hasRequiredConfigMissing({
      manifest: t,
      userConfig: o
    })) {
      i?.warn(`Extension ${t.name} has missing required configuration, skipping MCP config`);
      return;
    }
    let c = {
      __dirname: n,
      pathSeparator: s,
      "/": s,
      ...r
    };
    let u = {};
    if (t.user_config) {
      for (let [d, p] of Object.entries(t.user_config)) {
        if (p.default !== undefined) {
          u[d] = p.default;
        }
      }
    }
    if (o) {
      Object.assign(u, o);
    }
    for (let [d, p] of Object.entries(u)) {
      let m = `user_config.${d}`;
      if (Array.isArray(p)) {
        c[m] = p.map(String);
      } else if (typeof p === "boolean") {
        c[m] = p ? "true" : "false";
      } else {
        c[m] = String(p);
      }
    }
    l = replaceVariables(l, c);
    return l;
  }
  function z$a(e) {
    return e === undefined || e === null || e === "";
  }
  function hasRequiredConfigMissing({
    manifest: e,
    userConfig: t
  }) {
    if (!e.user_config) {
      return false;
    }
    let n = t || {};
    for (let [r, o] of Object.entries(e.user_config)) {
      if (o.required) {
        let s = n[r];
        if (z$a(s) || Array.isArray(s) && (s.length === 0 || s.some(z$a))) {
          return true;
        }
      }
    }
    return false;
  }
  var Y$a = () => {};
  var sSo = {};