  async function ySe() {
    if (nLn) {
      return nLn.default;
    }
    if (rm()) {
      try {
        let n = await Promise.resolve().then(() => (hro(), fro));
        let r = n.sharp || n.default;
        nLn = {
          default: r
        };
        return r;
      } catch {
        console.warn("Native image processor not available, falling back to sharp");
      }
    }
    let e = await Promise.resolve().then(() => __toESM(CXi(), 1));
    let t = Onp(e);
    nLn = {
      default: t
    };
    return t;
  }
  function Onp(e) {
    let t = typeof e === "function" ? e : e.default;
    if (typeof t !== "function") {
      throw Object.assign(Error("sharp module loaded but its export is not callable (native libvips binding likely failed to load)"), {
        code: "ERR_DLOPEN_FAILED"
      });
    }
    return t;
  }
  var nLn = null;
  var rLn = () => {};
  function Ja(e) {
    return e.map(t => {
      let n = String(t);
      if (n === "") {
        return "''";
      }
      if (/^[A-Za-z0-9_./:=@+,-]+$/.test(n)) {
        return n;
      }
      return "'" + n.replaceAll("'", `'"'"'`) + "'";
    }).join(" ");
  }
  class WPe {
    wslDistroName;
    constructor(e) {
      this.wslDistroName = e;
    }
    async toLocalPath(e) {
      if (!e) {
        return e;
      }
      if (this.wslDistroName) {
        let o = e.match(/^\\\\wsl(?:\.localhost|\$)\\([^\\]+)(.*)$/);
        if (o && o[1] !== this.wslDistroName) {
          return e;
        }
      }
      let {
        stdout: t,
        code: n
      } = await execFileNoThrow("wslpath", ["-u", e], {
        useCwd: false
      });
      let r = t.trim();
      if (n === 0 && r) {
        return r;
      }
      return e.replaceAll("\\", "/").replace(/^([A-Z]):/i, (o, s) => `/mnt/${s.toLowerCase()}`);
    }
    async toIDEPath(e) {
      if (!e) {
        return e;
      }
      let {
        stdout: t,
        code: n
      } = await execFileNoThrow("wslpath", ["-w", e], {
        useCwd: false
      });
      let r = t.trim();
      if (n === 0 && r) {
        return r;
      }
      return e;
    }
  }
  function RXi(e, t) {
    let n = e.match(/^\\\\wsl(?:\.localhost|\$)\\([^\\]+)(.*)$/);
    if (n) {
      return n[1] === t;
    }
    return true;
  }
  var oLn = __lazy(() => {
    ji();
  });
  function tX(e) {
    if (e.length < 4) {
      return null;
    }
    if (e[0] === 137 && e[1] === 80 && e[2] === 78 && e[3] === 71) {
      return "image/png";
    }
    if (e[0] === 255 && e[1] === 216 && e[2] === 255) {
      return "image/jpeg";
    }
    if (e.length >= 6 && e[0] === 71 && e[1] === 73 && e[2] === 70 && e[3] === 56 && (e[4] === 55 || e[4] === 57) && e[5] === 97) {
      return "image/gif";
    }
    if (e[0] === 82 && e[1] === 73 && e[2] === 70 && e[3] === 70 && e.length >= 12 && e[8] === 87 && e[9] === 69 && e[10] === 66 && e[11] === 80) {
      return "image/webp";
    }
    return null;
  }
  function xXi(e) {
    let t = e.subarray(0, 32);
    let n = t.toString("latin1").replace(/[^\x20-\x7e]/g, ".");
    let r = n.toLowerCase();
    if (r.includes("<!doctype") || r.includes("<html")) {
      return `HTML document (starts with "${n.slice(0, 24)}")`;
    }
    if (r.startsWith("<?xml") || r.startsWith("<svg")) {
      return `XML/SVG document (starts with "${n.slice(0, 24)}")`;
    }
    if (r.startsWith("{") || r.startsWith("[")) {
      return `JSON/text (starts with "${n.slice(0, 24)}")`;
    }
    if (r.startsWith("%pdf")) {
      return "PDF document";
    }
    return `unrecognized bytes (hex: ${t.subarray(0, 8).toString("hex").replace(/(..)/g, "$1 ").trim()})`;
  }
  function hjt(e) {
    return tX(e) ?? "image/png";
  }
  function sLn(e) {
    try {
      let t = Buffer.from(e, "base64");
      return hjt(t);
    } catch {
      return "image/png";
    }
  }
  function iGe(e) {
    if (e.length < 10) {
      return;
    }
    if (e[0] === 137 && e[1] === 80 && e[2] === 78 && e[3] === 71 && e.length >= 24) {
      return {
        width: e.readUInt32BE(16),
        height: e.readUInt32BE(20)
      };
    }
    if (e[0] === 71 && e[1] === 73 && e[2] === 70) {
      return {
        width: e.readUInt16LE(6),
        height: e.readUInt16LE(8)
      };
    }
    if (e[0] === 255 && e[1] === 216) {
      let t = 2;
      while (t + 9 < e.length) {
        if (e[t] !== 255) {
          t++;
          continue;
        }
        let n = e[t + 1];
        if (n === 255) {
          t++;
          continue;
        }
        if (n !== undefined && n >= 192 && n <= 207 && n !== 196 && n !== 200 && n !== 204) {
          return {
            height: e.readUInt16BE(t + 5),
            width: e.readUInt16BE(t + 7)
          };
        }
        if (n === undefined || n >= 208 && n <= 217 || n === 1) {
          t += 2;
          continue;
        }
        let r = e.readUInt16BE(t + 2);
        if (r < 2) {
          return;
        }
        t += 2 + r;
      }
      return;
    }
    if (e[0] === 82 && e[1] === 73 && e[2] === 70 && e[3] === 70 && e.length >= 30 && e[8] === 87 && e[9] === 69 && e[10] === 66 && e[11] === 80) {
      let t = e.toString("ascii", 12, 16);
      if (t === "VP8 ") {
        return {
          width: e.readUInt16LE(26) & 16383,
          height: e.readUInt16LE(28) & 16383
        };
      }
      if (t === "VP8L") {
        let n = e.readUInt32LE(21);
        return {
          width: (n & 16383) + 1,
          height: (n >> 14 & 16383) + 1
        };
      }
      if (t === "VP8X") {
        return {
          width: e.readUIntLE(24, 3) + 1,
          height: e.readUIntLE(27, 3) + 1
        };
      }
    }
    return;
  }
  function iLn(e, t) {
    if (e <= 0 || t <= 0) {
      return 0;
    }
    return Math.ceil(e / 28) * Math.ceil(t / 28);
  }
  var iV;
  var Ire = __lazy(() => {
    iV = {
      maxWidth: 2000,
      maxHeight: 2000,
      maxBase64Size: 5242880,
      targetRawSize: 3932160
    };
  });
  function BXi(e) {
    if (e instanceof Error) {
      let n = e;
      if (n.code === "MODULE_NOT_FOUND" || n.code === "ERR_MODULE_NOT_FOUND" || n.code === "ERR_DLOPEN_FAILED") {
        return 1;
      }
      if (n.code === "EACCES" || n.code === "EPERM") {
        return 8;
      }
      if (n.code === "ENOMEM") {
        return 5;
      }
    }
    let t = he(e);
    if (t.includes("Native image processor module not available")) {
      return 1;
    }
    if (t.includes("unsupported image format") || t.includes("Input buffer") || t.includes("Input file is missing") || t.includes("Input file has corrupt header") || t.includes("corrupt header") || t.includes("corrupt image") || t.includes("premature end") || t.includes("zlib: data error") || t.includes("zero width") || t.includes("zero height") || t.startsWith("Failed to decode image:") || t.startsWith("Failed to guess image format:") || t === "Unable to determine image format") {
      return 2;
    }
    if (t.includes("pixel limit") || t.includes("too many pixels") || t.includes("exceeds pixel") || t.includes("image dimensions")) {
      return 4;
    }
    if (t.includes("out of memory") || t.includes("Cannot allocate") || t.includes("memory allocation")) {
      return 5;
    }
    if (t.includes("timeout") || t.includes("timed out")) {
      return 6;
    }
    if (t.includes("Vips")) {
      return 7;
    }
    return 3;
  }
  function $Xi(e, t) {
    if (e === 3) {
      return true;
    }
    if (e === 1) {
      return en(t) !== "ERR_DLOPEN_FAILED";
    }
    return false;
  }
  function HXi(e) {
    let t = e instanceof Error ? e.name !== "Error" ? e.name : e.constructor?.name ?? "Error" : typeof e;
    let n = e instanceof Error ? String(e.code ?? "") : "";
    return {
      error_name: t,
      error_code: n
    };
  }
  function jXi(e) {
    let t = 5381;
    for (let n = 0; n < e.length; n++) {
      t = (t << 5) + t + e.charCodeAt(n) | 0;
    }
    return t >>> 0;
  }
  async function GPe(e, t, n, r) {
    if (e.length === 0) {
      throw new Y2("Image file is empty (0 bytes)");
    }
    try {
      let o = await ySe();
      let i = await o(e).metadata();
      let a = i.format ?? n;
      let l = a === "jpg" ? "jpeg" : a;
      if (!i.width || !i.height) {
        let g = iGe(e);
        if (g === undefined || g.width > r.maxWidth || g.height > r.maxHeight) {
          throw new Y2(`Unable to resize image \u2014 could not verify image dimensions are within the ${r.maxWidth}x${r.maxHeight}px API limit.`);
        }
        if (t > r.targetRawSize) {
          logEvent("tengu_image_resize", {
            over_byte_limit: true,
            over_dimension_limit: false,
            original_size_bytes: t
          });
          return {
            buffer: await o(e).jpeg({
              quality: 80
            }).toBuffer(),
            mediaType: "jpeg"
          };
        }
        return {
          buffer: e,
          mediaType: l
        };
      }
      let {
        width: c,
        height: u
      } = i;
      let d = c;
      let p = u;
      if (t <= r.targetRawSize && d <= r.maxWidth && p <= r.maxHeight) {
        return {
          buffer: e,
          mediaType: l,
          dimensions: {
            originalWidth: c,
            originalHeight: u,
            displayWidth: d,
            displayHeight: p
          }
        };
      }
      let m = d > r.maxWidth || p > r.maxHeight;
      let f = l === "png";
      if (logEvent("tengu_image_resize", {
        over_byte_limit: t > r.targetRawSize,
        over_dimension_limit: m,
        original_size_bytes: t,
        original_width: c,
        original_height: u
      }), !m && t > r.targetRawSize) {
        if (f) {
          let g = await o(e).png({
            compressionLevel: 9,
            palette: true
          }).toBuffer();
          if (g.length <= r.targetRawSize) {
            return {
              buffer: g,
              mediaType: "png",
              dimensions: {
                originalWidth: c,
                originalHeight: u,
                displayWidth: d,
                displayHeight: p
              }
            };
          }
        }
        for (let g of [80, 60, 40, 20]) {
          let y = await o(e).jpeg({
            quality: g
          }).toBuffer();
          if (y.length <= r.targetRawSize) {
            return {
              buffer: y,
              mediaType: "jpeg",
              dimensions: {
                originalWidth: c,
                originalHeight: u,
                displayWidth: d,
                displayHeight: p
              }
            };
          }
        }
      }
      if (d > r.maxWidth) {
        p = Math.round(p * r.maxWidth / d);
        d = r.maxWidth;
      }
      if (p > r.maxHeight) {
        d = Math.round(d * r.maxHeight / p);
        p = r.maxHeight;
      }
      logForDebugging(`Resizing to ${d}x${p}`);
      let h = await o(e).resize(d, p, {
        fit: "inside",
        withoutEnlargement: true
      }).toBuffer();
      if (h.length > r.targetRawSize) {
        if (f) {
          let b = await o(e).resize(d, p, {
            fit: "inside",
            withoutEnlargement: true
          }).png({
            compressionLevel: 9,
            palette: true
          }).toBuffer();
          if (b.length <= r.targetRawSize) {
            return {
              buffer: b,
              mediaType: "png",
              dimensions: {
                originalWidth: c,
                originalHeight: u,
                displayWidth: d,
                displayHeight: p
              }
            };
          }
        }
        for (let b of [80, 60, 40, 20]) {
          let S = await o(e).resize(d, p, {
            fit: "inside",
            withoutEnlargement: true
          }).jpeg({
            quality: b
          }).toBuffer();
          if (S.length <= r.targetRawSize) {
            return {
              buffer: S,
              mediaType: "jpeg",
              dimensions: {
                originalWidth: c,
                originalHeight: u,
                displayWidth: d,
                displayHeight: p
              }
            };
          }
        }
        let g = Math.min(d, 1000);
        let y = Math.round(p * g / Math.max(d, 1));
        logForDebugging("Still too large, compressing with JPEG");
        let _ = await o(e).resize(g, y, {
          fit: "inside",
          withoutEnlargement: true
        }).jpeg({
          quality: 20
        }).toBuffer();
        logForDebugging(`JPEG compressed buffer size: ${_.length}`);
        return {
          buffer: _,
          mediaType: "jpeg",
          dimensions: {
            originalWidth: c,
            originalHeight: u,
            displayWidth: g,
            displayHeight: y
          }
        };
      }
      return {
        buffer: h,
        mediaType: l,
        dimensions: {
          originalWidth: c,
          originalHeight: u,
          displayWidth: d,
          displayHeight: p
        }
      };
    } catch (o) {
      if (o instanceof Y2) {
        throw o;
      }
      let s = BXi(o);
      let i = he(o);
      if ($Xi(s, o)) {
        Oe(o);
      } else {
        logForDebugging(`Image resize failed: ${i}`, {
          level: "error"
        });
      }
      logEvent("tengu_image_resize_failed", {
        original_size_bytes: t,
        error_type: s,
        error_message_hash: jXi(i),
        ...HXi(o)
      });
      let l = hjt(e).slice(6);
      let c = Math.ceil(t * 4 / 3);
      let u = iGe(e);
      if (u === undefined) {
        throw new Y2("Unable to resize image \u2014 image processing is unavailable and dimensions could not be read from the file header. " + "Please convert the image to PNG, JPEG, GIF, or WebP.");
      }
      let d = u.width > r.maxWidth || u.height > r.maxHeight;
      if (c <= r.maxBase64Size && !d) {
        logEvent("tengu_image_resize_fallback", {
          original_size_bytes: t,
          base64_size_bytes: c,
          error_type: s
        });
        return {
          buffer: e,
          mediaType: l
        };
      }
      throw new Y2(d ? `Unable to resize image \u2014 dimensions exceed the ${r.maxWidth}x${r.maxHeight}px limit and image processing failed. Please resize the image to reduce its pixel dimensions.` : `Unable to resize image (${formatFileSize(t)} raw, ${formatFileSize(c)} base64). The image exceeds the ${formatFileSize(r.maxBase64Size)} API limit and compression failed. Please resize the image manually or use a smaller image.`);
    }
  }
  async function Gro(e, t, n) {
    let r = await ySe();
    let o = u => r(e).jpeg({
      quality: u
    }).toBuffer();
    let s = e;
    let i = 90;
    if (!/jpe?g/i.test(n)) {
      let u = await o(90);
      if (u.length < s.length) {
        s = u;
      }
      if (u.length <= t) {
        return u;
      }
      i = 89;
    }
    let l = 1;
    let c;
    for (let u = 0; u < 5; u++) {
      let d = Math.floor((l + i) / 2);
      let p = await o(d);
      if (p.length < s.length) {
        s = p;
      }
      if (p.length <= t) {
        c = p;
        l = d + 1;
      } else {
        i = d - 1;
      }
      if (l > i) {
        break;
      }
    }
    return c ?? s;
  }
  async function f1({
    data: e,
    mediaType: t,
    limits: n
  }) {
    let r = Buffer.isBuffer(e) ? e : Buffer.from(e, "base64");
    let o = t?.includes("/") ? t.split("/")[1] || "png" : t || "png";
    let s;
    try {
      s = await GPe(r, r.length, o, n);
    } catch (l) {
      if (l instanceof Y2) {
        logEvent("tengu_image_resize_degraded", {});
        return {
          block: {
            type: "text",
            text: `[Image could not be processed: ${l.message}]`
          }
        };
      }
      throw l;
    }
    let i = s.buffer;
    if (i.length > 512000) {
      try {
        i = await Gro(s.buffer, 512000, s.mediaType);
      } catch (l) {
        logForDebugging(`Image byte-budget compression failed, passing through unbudgeted: ${he(l)}`, {
          level: "error"
        });
      }
    }
    return {
      block: {
        type: "image",
        source: {
          type: "base64",
          media_type: hjt(i),
          data: i.toString("base64")
        }
      },
      dimensions: s.dimensions
    };
  }
  async function qXi(e, t) {
    if (e.source.type !== "base64") {
      return {
        block: e
      };
    }
    return f1({
      data: e.source.data,
      mediaType: e.source.media_type,
      limits: t
    });
  }
  async function WXi(e, t, n) {
    let r = n?.split("/")[1] || "jpeg";
    let o = r === "jpg" ? "jpeg" : r;
    try {
      let s = await ySe();
      let i = await s(e).metadata();
      let a = i.format || o;
      let l = e.length;
      let c = {
        imageBuffer: e,
        metadata: i,
        format: a,
        maxBytes: t,
        originalSize: l
      };
      if (l <= t) {
        return yjt(e, a, l);
      }
      let u = await Unp(c, s);
      if (u) {
        return u;
      }
      if (a === "png") {
        let p = await $np(c, s);
        if (p) {
          return p;
        }
      }
      let d = await Hnp(c, 50, s);
      if (d) {
        return d;
      }
      return await jnp(c, s);
    } catch (s) {
      let i = BXi(s);
      let a = he(s);
      if ($Xi(i, s)) {
        Oe(s);
      } else {
        logForDebugging(`Image compression failed: ${a}`, {
          level: "error"
        });
      }
      if (logEvent("tengu_image_compress_failed", {
        original_size_bytes: e.length,
        max_bytes: t,
        error_type: i,
        error_message_hash: jXi(a),
        ...HXi(s)
      }), e.length <= t) {
        let l = hjt(e);
        return {
          base64: e.toString("base64"),
          mediaType: l,
          originalSize: e.length
        };
      }
      throw new Y2(`Unable to compress image (${formatFileSize(e.length)}) to fit within ${formatFileSize(t)}. Please use a smaller image.`);
    }
  }
  async function GXi(e, t, n) {
    let r = Math.floor(t / 0.125);
    let o = Math.floor(r * 0.75);
    return WXi(e, o, n);
  }
  async function VXi(e, t) {
    if (e.source.type !== "base64") {
      return e;
    }
    let n = Buffer.from(e.source.data, "base64");
    if (n.length <= t) {
      return e;
    }
    let r = await WXi(n, t);
    return {
      type: "image",
      source: {
        type: "base64",
        media_type: r.mediaType,
        data: r.base64
      }
    };
  }
  function yjt(e, t, n) {
    let r = t === "jpg" ? "jpeg" : t;
    return {
      base64: e.toString("base64"),
      mediaType: `image/${r}`,
      originalSize: n
    };
  }
  async function Unp(e, t) {
    let n = [1, 0.75, 0.5, 0.25];
    for (let r of n) {
      let o = Math.round((e.metadata.width || 2000) * r);
      let s = Math.round((e.metadata.height || 2000) * r);
      let i = t(e.imageBuffer).resize(o, s, {
        fit: "inside",
        withoutEnlargement: true
      });
      i = Bnp(i, e.format);
      let a = await i.toBuffer();
      if (a.length <= e.maxBytes) {
        return yjt(a, e.format, e.originalSize);
      }
    }
    return null;
  }
  function Bnp(e, t) {
    switch (t) {
      case "png":
        return e.png({
          compressionLevel: 9,
          palette: true
        });
      case "jpeg":
      case "jpg":
        return e.jpeg({
          quality: 80
        });
      case "webp":
        return e.webp({
          quality: 80
        });
      default:
        return e;
    }
  }
  async function $np(e, t) {
    let n = await t(e.imageBuffer).resize(800, 800, {
      fit: "inside",
      withoutEnlargement: true
    }).png({
      compressionLevel: 9,
      palette: true,
      colors: 64
    }).toBuffer();
    if (n.length <= e.maxBytes) {
      return yjt(n, "png", e.originalSize);
    }
    return null;
  }
  async function Hnp(e, t, n) {
    let r = await n(e.imageBuffer).resize(600, 600, {
      fit: "inside",
      withoutEnlargement: true
    }).jpeg({
      quality: t
    }).toBuffer();
    if (r.length <= e.maxBytes) {
      return yjt(r, "jpeg", e.originalSize);
    }
    return null;
  }
  async function jnp(e, t) {
    let n = await t(e.imageBuffer).resize(400, 400, {
      fit: "inside",
      withoutEnlargement: true
    }).jpeg({
      quality: 20
    }).toBuffer();
    return yjt(n, "jpeg", e.originalSize);
  }
  function Jct(e, t) {
    let {
      originalWidth: n,
      originalHeight: r,
      displayWidth: o,
      displayHeight: s
    } = e;
    if (!n || !r || !o || !s || o <= 0 || s <= 0) {
      if (t) {
        return `[Image source: ${t}]`;
      }
      return null;
    }
    let i = n !== o || r !== s;
    if (!i && !t) {
      return null;
    }
    let a = [];
    if (t) {
      a.push(`source: ${t}`);
    }
    if (i) {
      let l = n / o;
      a.push(`original ${n}x${r}, displayed at ${o}x${s}. Multiply coordinates by ${l.toFixed(2)} to map to original image.`);
    }
    return `[Image: ${a.join(", ")}]`;
  }
  var Y2;
  var yG = __lazy(() => {
    Ire();
    Ot();
    rLn();
    je();
    dt();
    cs();
    Rn();
    Y2 = class Y2 extends Error {
      constructor(e) {
        super(e);
        this.name = "ImageResizeError";
      }
    };
  });
  function Xct(e, t = "value") {
    let n = qnp.exec(e);
    if (n) {
      let r = (n[0].codePointAt(0) ?? 0).toString(16).toUpperCase().padStart(4, "0");
      throw new Po(`Cannot safely quote ${t} in a PowerShell single-quoted string literal: it contains U+${r}, which PowerShell's tokenizer treats as a quote delimiter`, "psSingleQuotedLiteral: rejected a PowerShell quote-variant codepoint (U+2018..U+201F)");
    }
    return `'${e.replaceAll("'", "''")}'`;
  }
  var qnp;
  var _jt = __lazy(() => {
    dt();
    qnp = /[\u2018-\u201F]/;
  });
  function Wnp() {
    let t = pT();
    let n = "claude_cli_latest_screenshot.png";
    let r = {
      darwin: kue.join(t, "claude_cli_latest_screenshot.png"),
      linux: kue.join(t, "claude_cli_latest_screenshot.png"),
      win32: kue.join(t, "claude_cli_latest_screenshot.png")
    };
    let o = r.linux || r.linux;
    let s = Ja([o]);
    let a = `set fp to open for access POSIX file ${`"${o.replace(/\\/g, "\\\\").replace(/"/g, "\\\"")}"`} with write permission`;
    let l = "";
    let c = Wt() === "wsl";
    let u = '"$(command -v powershell.exe 2>/dev/null || echo /mnt/c/Windows/System32/WindowsPowerShell/v1.0/powershell.exe)"';
    let d = c ? ` || "$(command -v powershell.exe 2>/dev/null || echo /mnt/c/Windows/System32/WindowsPowerShell/v1.0/powershell.exe)" -NoProfile -NonInteractive -Sta -Command 'Add-Type -AssemblyName System.Windows.Forms; if (-not [System.Windows.Forms.Clipboard]::ContainsImage()) { exit 1 }' 2>/dev/null` : "";
    let p = c ? ` 2>/dev/null || "$(command -v powershell.exe 2>/dev/null || echo /mnt/c/Windows/System32/WindowsPowerShell/v1.0/powershell.exe)" -NoProfile -NonInteractive -Sta -Command 'Add-Type -AssemblyName System.Windows.Forms; $i = [System.Windows.Forms.Clipboard]::GetImage(); if ($null -eq $i) { exit 1 }; $ms = New-Object System.IO.MemoryStream; $i.Save($ms, [System.Drawing.Imaging.ImageFormat]::Png); [Convert]::ToBase64String($ms.ToArray())' 2>/dev/null | tr -d '\\r' | base64 -d > ${s}` : "";
    let m = {
      darwin: {
        checkImage: "osascript -e 'the clipboard as \xABclass PNGf\xBB'",
        saveImage: `osascript -e 'set png_data to (the clipboard as \xABclass PNGf\xBB)' -e ${Ja([a])} -e 'write png_data to fp' -e 'close access fp'`,
        getPath: bjt.darwin,
        deleteFile: `rm -f -- ${s}`
      },
      linux: {
        checkImage: `xclip -selection clipboard -t TARGETS -o 2>/dev/null | grep -E "image/(png|jpeg|jpg|gif|webp|bmp)" || wl-paste -l 2>/dev/null | grep -E "image/(png|jpeg|jpg|gif|webp|bmp)"${d}`,
        saveImage: `xclip -selection clipboard -t image/png -o > ${s} 2>/dev/null || wl-paste --type image/png > ${s} 2>/dev/null || xclip -selection clipboard -t image/bmp -o > ${s} 2>/dev/null || wl-paste --type image/bmp > ${s}${p}`,
        getPath: bjt.linux,
        deleteFile: `rm -f -- ${s}`
      },
      win32: {
        checkImage: ["powershell", "-NoProfile", "-NonInteractive", "-Sta", "-Command", "Add-Type -AssemblyName System.Windows.Forms; if (-not [System.Windows.Forms.Clipboard]::ContainsImage()) { exit 1 }"],
        saveImage: ["powershell", "-NoProfile", "-NonInteractive", "-Sta", "-Command", "Add-Type -AssemblyName System.Windows.Forms; $img = [System.Windows.Forms.Clipboard]::GetImage(); if ($null -eq $img) { exit 1 }; $img.Save(, [System.Drawing.Imaging.ImageFormat]::Png)"],
        getPath: bjt.win32,
        deleteFile: ["powershell", "-NoProfile", "-Command", "Remove-Item -Force -LiteralPath "]
      }
    };
    return {
      commands: m.linux || m.linux,
      screenshotPath: o
    };
  }
  async function lLn(e) {
    if (typeof e === "string") {
      return yI(e, {
        reject: false
      });
    }
    let [t, ...n] = e;
    return _C(t, n, {
      reject: false
    });
  }
  async function KXi() {
    return false;
  }
  async function VPe(e) {
    let t;
    try {
      t = Wnp();
    } catch (o) {
      Oe(o);
      Ae("clipboard_read", "construct_failed");
      return null;
    }
    let {
      commands: n,
      screenshotPath: r
    } = t;
    try {
      if ((await lLn(n.checkImage)).exitCode !== 0) {
        return null;
      }
      if (await zt().mkdir(kue.dirname(r), {
        mode: 448
      }), (await lLn(n.saveImage)).exitCode !== 0) {
        Ae("clipboard_read", "save_failed");
        return null;
      }
      let i = zt().readFileBytesSync(r);
      if (i.length >= 2 && i[0] === 66 && i[1] === 77) {
        i = await (await ySe())(i).png().toBuffer();
      }
      let a = await GPe(i, i.length, "png", e);
      let l = a.buffer.toString("base64");
      let c = sLn(l);
      lLn(n.deleteFile);
      Pe("clipboard_read");
      return {
        base64: l,
        mediaType: c,
        dimensions: a.dimensions
      };
    } catch {
      Ae("clipboard_read", "read_failed");
      return null;
    }
  }
  async function Gnp() {
    try {
      let t = bjt.linux || bjt.linux;
      let n = await lLn(t);
      if (n.exitCode !== 0 || !n.stdout) {
        return null;
      }
      return n.stdout.trim();
    } catch (e) {
      logForDebugging(`Failed to read image path from clipboard: ${e instanceof Error ? e.message : String(e)}`, {
        level: "error"
      });
      return null;
    }
  }
  function YXi(e) {
    if (e.startsWith('"') && e.endsWith('"') || e.startsWith("'") && e.endsWith("'")) {
      return e.slice(1, -1);
    }
    return e;
  }
  function XXi(e) {
    if (Wt() === "wsl" && JXi.test(e)) {
      return e;
    }
    let r = `__DOUBLE_BACKSLASH_${zXi.randomBytes(8).toString("hex")}__`;
    return e.replaceAll("\\\\", r).replace(/\\(.)/g, "$1").replace(new RegExp(r, "g"), "\\");
  }
  function Vro(e) {
    let t = YXi(e.trim());
    let n = XXi(t);
    return cLn.test(n);
  }
  function Vnp(e) {
    let t = YXi(e.trim());
    let n = XXi(t);
    if (cLn.test(n)) {
      return n;
    }
    return null;
  }
  async function QXi(e, t) {
    let n = Vnp(e);
    if (!n) {
      return null;
    }
    let r = n;
    if (Wt() === "wsl" && JXi.test(r)) {
      r = await new WPe(process.env.WSL_DISTRO_NAME).toLocalPath(r);
    }
    let o;
    try {
      if (kue.isAbsolute(r)) {
        o = zt().readFileBytesSync(r);
      } else {
        let c = await Gnp();
        if (c && r === kue.basename(c)) {
          o = zt().readFileBytesSync(c);
        }
      }
    } catch (c) {
      logForDebugging(`Failed to read pasted image file ${r}: ${c instanceof Error ? c.message : String(c)}`, {
        level: "error"
      });
      return null;
    }
    if (!o) {
      return null;
    }
    if (o.length === 0) {
      logForDebugging(`Image file is empty: ${r}`, {
        level: "warn"
      });
      return null;
    }
    if (o.length >= 2 && o[0] === 66 && o[1] === 77) {
      o = await (await ySe())(o).png().toBuffer();
    }
    let s = tX(o);
    if (s === null) {
      logForDebugging(`Pasted path has image extension but content is not a supported image: ${r}`, {
        level: "warn"
      });
      return null;
    }
    let i = s.split("/")[1] || "png";
    let a = await GPe(o, o.length, i, t);
    let l = a.buffer.toString("base64");
    return {
      path: r,
      base64: l,
      mediaType: s,
      dimensions: a.dimensions
    };
  }
  function ZXi(e) {
    if (e.includes("\x00")) {
      return true;
    }
    let t = e.slice(0, 4096);
    if (t.length < 32) {
      return false;
    }
    let n = 0;
    for (let r of t) {
      if (r === "\uFFFD") {
        n++;
      }
    }
    return n / t.length > 0.05;
  }
  var zXi;
  var kue;
  var bjt;
  var cLn;
  var JXi;
  var lGe = __lazy(() => {
    ln();
    rLn();
    je();
    ji();
    oLn();
    yG();
    Rn();
    Cs();
    oF();
    _jt();
    BC();
    zXi = require("crypto");
    kue = require("path");
    bjt = {
      darwin: "osascript -e 'get POSIX path of (the clipboard as \xABclass furl\xBB)'",
      linux: "xclip -selection clipboard -t text/plain -o 2>/dev/null || wl-paste 2>/dev/null",
      win32: ["powershell", "-NoProfile", "-Command", "Get-Clipboard"]
    };
    cLn = /\.(png|jpe?g|gif|webp)$/i;
    JXi = /^(?:[A-Za-z]:\\|\\\\)/;
  });
  function uLn(e, t) {
    let {
      addNotification: n
    } = Fi();
    let r = Qct.useRef(e);
    let o = Qct.useRef(0);
    let s = Qct.useRef(null);
    let i = useClock();
    Qct.useEffect(() => {
      let a = r.current;
      if (r.current = e, !t || !e || a) {
        return;
      }
      if (s.current) {
        s.current();
      }
      s.current = i.setTimeout(async () => {
        s.current = null;
        let l = Date.now();
        if (l - o.current < 30000) {
          return;
        }
        if (await KXi()) {
          o.current = l;
          n({
            key: "clipboard-image-hint",
            kind: "contextual",
            text: `Image in clipboard \xB7 ${dx("chat:imagePaste", "Chat", "ctrl+v")} to paste`,
            priority: "immediate",
            timeoutMs: 8000
          });
        }
      }, 1000);
      return () => {
        if (s.current) {
          s.current();
          s.current = null;
        }
      };
    }, [e, t, n, i]);
  }
  var Qct;
  var zro = __lazy(() => {
    Nd();
    et();
    kre();
    lGe();
    Qct = __toESM(ot(), 1);
  });
  function Sjt(e, t) {
    switch (t) {
      case "bash":
        return `!${e}`;
      default:
        return e;
    }
  }
  function a0(e) {
    if (e.startsWith("!")) {
      return "bash";
    }
    return "prompt";
  }
  function J2(e) {
    if (a0(e) === "prompt") {
      return e;
    }
    return e.slice(1);
  }
  function Tjt(e) {
    return e === "!";
  }
  function Kro() {
    let e = zt().existsSync(eQi.join(Nt(), "CLAUDE.md"));
    let t = Qks(Nt());
    return [{
      key: "workspace",
      text: "Ask Claude to create a new app or clone a repository",
      isComplete: false,
      isCompletable: true,
      isEnabled: t
    }, {
      key: "claudemd",
      text: "Run /init to create a CLAUDE.md file with instructions for Claude",
      isComplete: e,
      isCompletable: true,
      isEnabled: !t
    }];
  }
  function tQi() {
    return Kro().filter(({
      isCompletable: e,
      isEnabled: t
    }) => e && t).every(({
      isComplete: e
    }) => e);
  }
  function Zct() {
    if (getCurrentProjectConfig().hasCompletedProjectOnboarding) {
      return;
    }
    if (tQi()) {
      saveCurrentProjectConfig(e => ({
        ...e,
        hasCompletedProjectOnboarding: true
      }));
      Pe("onboarding_project_complete");
    }
  }
  function rQi() {
    saveCurrentProjectConfig(e => ({
      ...e,
      projectOnboardingSeenCount: e.projectOnboardingSeenCount + 1
    }));
  }
  var eQi;
  var nQi;
  var Ejt = __lazy(() => {
    ln();
    vo();
    Zl();
    eQi = require("path");
    nQi = TEr(() => {
      let e = getCurrentProjectConfig();
      if (e.hasCompletedProjectOnboarding || e.projectOnboardingSeenCount >= 4 || process.env.IS_DEMO) {
        return false;
      }
      return !tQi();
    });
  });
  function Jnp(e) {
    saveGlobalConfig(t => ({
      ...t,
      appleTerminalSetupInProgress: true,
      appleTerminalBackupPath: e
    }));
  }
  function eut() {
    saveGlobalConfig(e => ({
      ...e,
      appleTerminalSetupInProgress: false
    }));
  }
  function Xnp() {
    let e = getGlobalConfig();
    return {
      inProgress: e.appleTerminalSetupInProgress ?? false,
      backupPath: e.appleTerminalBackupPath || null
    };
  }
  function tut() {
    return sQi.join(oQi.homedir(), "Library", "Preferences", "com.apple.Terminal.plist");
  }
  async function iQi() {
    let e = tut();
    let t = `${e}.bak`;
    try {
      let {
        code: n
      } = await execFileNoThrow("defaults", ["export", "com.apple.Terminal", e]);
      if (n !== 0) {
        return null;
      }
      try {
        await Yro.stat(e);
      } catch {
        return null;
      }
      await execFileNoThrow("defaults", ["export", "com.apple.Terminal", t]);
      Jnp(t);
      return t;
    } catch (n) {
      if (Io(n)) {
        logForDebugging(`backupTerminalPreferences: config write failed: ${n}`);
        return null;
      }
      Oe(n);
      return null;
    }
  }
  async function dLn() {
    let {
      inProgress: e,
      backupPath: t
    } = Xnp();
    if (!e) {
      return {
        status: "no_backup"
      };
    }
    if (!t) {
      eut();
      return {
        status: "no_backup"
      };
    }
    try {
      await Yro.stat(t);
    } catch {
      eut();
      return {
        status: "no_backup"
      };
    }
    let n = false;
    try {
      let {
        code: r
      } = await execFileNoThrow("defaults", ["import", "com.apple.Terminal", t]);
      if (r !== 0) {
        return {
          status: "failed",
          backupPath: t
        };
      }
      n = true;
      await execFileNoThrow("killall", ["cfprefsd"]);
      eut();
      return {
        status: "restored"
      };
    } catch (r) {
      if (Io(r)) {
        logForDebugging(`checkAndRestoreTerminalBackup: config write failed: ${r}`);
      } else {
        Oe(r);
      }
      try {
        eut();
      } catch {}
      return n ? {
        status: "restored"
      } : {
        status: "failed",
        backupPath: t
      };
    }
  }
  var Yro;
  var oQi;
  var sQi;
  var Jro = __lazy(() => {
    je();
    dt();
    ji();
    Rn();
    Yro = require("fs/promises");
    oQi = require("os");
    sQi = require("path");
  });
  function Qnp() {
    let e = process.env.SHELL || "";
    let t = aQi.homedir();
    let n = Aue.join(t, ".claude");
    if (e.endsWith("/zsh") || e.endsWith("/zsh.exe")) {
      let r = Aue.join(n, "completion.zsh");
      return {
        name: "zsh",
        rcFile: Aue.join(t, ".zshrc"),
        cacheFile: r,
        completionLine: `[[ -f "${r}" ]] && source "${r}"`,
        shellFlag: "zsh"
      };
    }
    if (e.endsWith("/bash") || e.endsWith("/bash.exe")) {
      let r = Aue.join(n, "completion.bash");
      return {
        name: "bash",
        rcFile: Aue.join(t, ".bashrc"),
        cacheFile: r,
        completionLine: `[ -f "${r}" ] && source "${r}"`,
        shellFlag: "bash"
      };
    }
    if (e.endsWith("/fish") || e.endsWith("/fish.exe")) {
      let r = process.env.XDG_CONFIG_HOME || Aue.join(t, ".config");
      let o = Aue.join(n, "completion.fish");
      return {
        name: "fish",
        rcFile: Aue.join(r, "fish", "config.fish"),
        cacheFile: o,
        completionLine: `[ -f "${o}" ] && source "${o}"`,
        shellFlag: "fish"
      };
    }
    return null;
  }
  async function Xro() {
    let e = Qnp();
    if (!e) {
      return;
    }
    logForDebugging(`update: Regenerating ${e.name} completion cache`);
    let t = process.argv[1] || "claude";
    if ((await execFileNoThrow(t, ["completion", e.shellFlag, "--output", e.cacheFile])).code !== 0) {
      logForDebugging(`update: Failed to regenerate ${e.name} completion cache`);
      return;
    }
    logForDebugging(`update: Regenerated ${e.name} completion cache at ${e.cacheFile}`);
  }
  var aQi;
  var Aue;
  var Qro = __lazy(() => {
    APe();
    uG();
    _b();
    je();
    dt();
    ji();
    aQi = require("os");
    Aue = require("path");
  });
  var mQi = {};