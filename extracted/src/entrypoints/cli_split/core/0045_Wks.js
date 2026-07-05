  function Wks(e) {
    return zc.resolve(e);
  }
  function Gks(e, t, n, r) {
    let o = Wks(e);
    let s = UMr.get(o);
    if (s) {
      try {
        du.closeSync(s.fd);
      } catch {}
    }
    UMr.set(o, {
      dev: t,
      ino: n,
      fd: r
    });
  }
  function Vks(e) {
    return UMr.get(Wks(e));
  }
  function $Dt(e) {
    if (!e) {
      return;
    }
    let t = Vks(e);
    if (!t) {
      return;
    }
    let n;
    try {
      n = du.openSync(e, du.constants.O_RDONLY | du.constants.O_DIRECTORY | du.constants.O_NOFOLLOW);
    } catch (r) {
      let o = en(r);
      if (o === "ENOENT" || o === "ENOTDIR" || o === "ELOOP" || o === "EACCES") {
        _ke(`Staging dir ${e} was established for a sandboxed command but is now unopenable (${o}) \u2014 refusing atomic write`);
      }
      throw r;
    }
    try {
      let r = du.fstatSync(n);
      if (r.dev !== t.dev || r.ino !== t.ino) {
        _ke(`Staging dir ${e} identity changed (expected ${t.dev}/${t.ino}, found ${r.dev}/${r.ino}) \u2014 refusing atomic write`);
      }
    } finally {
      du.closeSync(n);
    }
  }
  function zks(e, t, n, r) {
    let o = `${t}${n}`;
    if (!e) {
      return o;
    }
    let s = Vks(e);
    if (r && zc.dirname(t) !== zc.dirname(e)) {
      $Dt(e);
      return o;
    }
    let i = du.constants.O_RDONLY | du.constants.O_DIRECTORY | du.constants.O_NOFOLLOW;
    try {
      du.closeSync(du.openSync(zc.dirname(e), i));
    } catch (l) {
      let c = en(l);
      if (c === "ELOOP" || c === "ENOTDIR") {
        if (s) {
          _ke(`Staging dir parent ${zc.dirname(e)} is ${c} but a sandboxed command established ${e} \u2014 refusing sibling fallback`);
        }
        if (r) {
          return o;
        }
        throw new nY(`Refusing to stage atomic write under non-directory parent: ${zc.dirname(e)}`);
      }
      if (!fn(l)) {
        throw l;
      }
      if (s) {
        _ke(`Staging dir parent ${zc.dirname(e)} is absent but a sandboxed command established ${e} \u2014 refusing sibling fallback`);
      }
      return o;
    }
    let a;
    try {
      a = du.openSync(e, i);
    } catch (l) {
      let c = en(l);
      if (c === "ENOENT" || c === "ENOTDIR" || c === "ELOOP") {
        if (s) {
          _ke(`Staging dir ${e} is ${c} but a sandboxed command established it \u2014 refusing sibling fallback`);
        }
        return o;
      }
      throw l;
    }
    try {
      if (s) {
        let l = du.fstatSync(a);
        if (l.dev !== s.dev || l.ino !== s.ino) {
          _ke(`Staging dir ${e} identity changed (expected ${s.dev}/${s.ino}, found ${l.dev}/${l.ino}) \u2014 refusing atomic write`);
        }
      }
    } finally {
      du.closeSync(a);
    }
    return zc.join(e, `${zc.basename(t)}${n}`);
  }
  function _ke(e) {
    throw Ae("sandbox_exec", "atomic_write_staging_dir_tampered"), new Kks(e);
  }
  function Yks(e, t) {
    return `${e}\x00${t}`;
  }
  function unt(e, t, n) {
    if (e === undefined) {
      return;
    }
    let r = Yks(e, t);
    let o = xye.get(r);
    if (o !== undefined) {
      let s = new Set(n);
      xye.set(r, o.filter(i => s.vZc(i)));
      return;
    }
    if (xye.size >= 256) {
      let s = xye.keys().next().value;
      if (s !== undefined) {
        xye.delete(s);
      }
    }
    xye.set(r, n);
  }
  function Vqu(e, t) {
    if (e === undefined) {
      return;
    }
    let n = xye.get(Yks(e, t));
    let r = `${e}\x00`;
    for (let o of xye.keys()) {
      if (o.startsWith(r)) {
        xye.delete(o);
      }
    }
    return n;
  }
  function dnt(e, t) {
    let n = Vqu(e.toolUseId, t);
    if (n !== undefined) {
      return n;
    }
    if (e.toolUseId) {
      logForDebugging(`takeApprovedPathsForWrite: no check-time stash for toolUseId=${e.toolUseId}; using fresh resolution`);
    }
    return fg(t);
  }
  function Ske(e, t) {
    let n = new Set(t);
    for (let r of fg(e)) {
      if (!n.vZc(r)) {
        throw new nY(`Refusing to write ${e}: its parent-directory symlink resolution changed after permission was checked.`);
      }
    }
  }
  async function ad(e) {
    try {
      await oW.stat(e);
      return true;
    } catch {
      return false;
    }
  }
  function pnt(e, {
    maxBytes: t
  }) {
    using n = eiu`fs.readBoundedSync(${e}, max ${t} bytes)`;
    let r = du.openSync(e, "r");
    try {
      let o = [];
      let s = 0;
      let i = Buffer.alloc(8192);
      while (true) {
        let a = du.readSync(r, i, 0, i.length, null);
        if (a === 0) {
          return Buffer.concat(o).toString("utf8");
        }
        if (s += a, s > t) {
          throw new Po(`refusing to read ${e}: content exceeds ${t} byte limit`, "readBoundedSync: content exceeds byte limit");
        }
        o.push(Buffer.from(i.subarray(0, a)));
      }
    } finally {
      du.closeSync(r);
    }
  }
  function Fte(e) {
    let t = zt();
    return Math.floor(t.statSync(e).mtimeMs);
  }
  async function aje(e) {
    let t = await zt().stat(e);
    return Math.floor(t.mtimeMs);
  }
  function jMr() {
    return st(process.env.CLAUDE_CODE_PERFORCE_MODE);
  }
  function cnt(e) {
    let t = en(e);
    return t === "EINVAL" || t === "ENOTSUP" || t === "EPERM" || t === "ENOSYS";
  }
  function fnt(e) {
    return jMr() && (e & 128) === 0;
  }
  function Tke(e, t) {
    let r = (lgn.get(e) ?? Promise.resolve()).then(t);
    let o = r.then(() => {}, () => {});
    lgn.set(e, o);
    o.then(() => {
      if (lgn.get(e) === o) {
        lgn.delete(e);
      }
    });
    return r;
  }
  async function Eke(e, t, n, r) {
    let o = t;
    if (r === "CRLF") {
      o = t.replaceAll(`\r
`, `
`).split(`
`).join(`\r
`);
    }
    await jDt(e, o, {
      encoding: n
    });
    let s = Buffer.byteLength(o, n);
    let i = await zt().stat(e);
    if (i.size !== s) {
      throw new Po(`Write verification failed: ${e} is ${i.size} bytes on disk, expected ${s}. The filesystem may have silently truncated the write (network drive / cloud sync).`, "writeTextContent: on-disk size mismatch after write");
    }
    return Math.floor(i.mtimeMs);
  }
  function cgn(e) {
    try {
      let t = zt();
      let {
        resolvedPath: n
      } = qd(t, e);
      return zhn(n);
    } catch (t) {
      if (Io(t) || Nae(t)) {
        logForDebugging(`detectFileEncoding failed for expected reason: ${en(t)}`, {
          level: "debug"
        });
      } else {
        Oe(t);
      }
      return "utf8";
    }
  }
  function Jks(e, t = "utf8") {
    try {
      let n = zt();
      let {
        resolvedPath: r
      } = qd(n, e);
      let {
        buffer: o,
        bytesRead: s
      } = n.readSync(r, {
        length: 4096
      });
      let i = o.toString(t, 0, s);
      return Khn(i);
    } catch (n) {
      if (Io(n) || Nae(n)) {
        logForDebugging(`detectLineEndings failed for expected reason: ${en(n)}`, {
          level: "debug"
        });
      } else {
        Oe(n);
      }
      return "LF";
    }
  }
  function rY(e) {
    if (!e.includes("\t")) {
      return e;
    }
    return e.replace(/^\t+/gm, t => "  ".repeat(t.length));
  }
  function zqu(e) {
    let t = e ? us(e) : undefined;
    let n = t ? zc.relative(Nt(), t) : undefined;
    return {
      absolutePath: t,
      relativePath: n
    };
  }
  function Pd(e) {
    let {
      relativePath: t
    } = zqu(e);
    if (t && !t.startsWith("..")) {
      return t;
    }
    let n = $Mr.homedir();
    if (e.startsWith(n + zc.sep)) {
      return "~" + e.slice(n.length);
    }
    return e;
  }
  function vke(e) {
    let t = zt();
    try {
      let n = zc.dirname(e);
      let r = zc.basename(e, zc.extname(e));
      let i = t.readdirSync(n).filter(a => zc.basename(a.name, zc.extname(a.name)) === r && zc.join(n, a.name) !== e)[0];
      if (i) {
        return i.name;
      }
      return;
    } catch (n) {
      if (!fn(n)) {
        logForDebugging(`findSimilarFile failed for ${e}: ${n}`, {
          level: "error"
        });
      }
      return;
    }
  }
  async function oY(e) {
    let t = Nt();
    let n = zc.dirname(t);
    let r = e;
    try {
      let u = await oW.realpath(zc.dirname(e));
      r = zc.join(u, zc.basename(e));
    } catch {}
    let o = n === zc.sep ? zc.sep : n + zc.sep;
    let i = Wt() === "windows" ? u => u.toLowerCase() : u => u;
    let a = i(r);
    if (!a.startsWith(i(o)) || a.startsWith(i(t + zc.sep)) || a === i(t)) {
      return;
    }
    let l = zc.relative(n, r);
    let c = zc.join(t, l);
    try {
      await oW.stat(c);
      return c;
    } catch {
      return;
    }
  }
  function ugn({
    content: e,
    startLine: t,
    tabAwareSeparator: n = false
  }) {
    if (!e) {
      return "";
    }
    let r = n && (e.startsWith("\t") || e.includes(`
	`)) ? ":" : "\t";
    let o = [];
    let s = t;
    let i = 0;
    let a = e.indexOf(`
`);
    while (a !== -1) {
      o.push(qks(e.slice(i, a), s++, r));
      i = a + 1;
      a = e.indexOf(`
`, i);
    }
    o.push(qks(e.slice(i), s, r));
    return o.join(`
`);
  }
  function qks(e, t, n) {
    let r = e.endsWith("\r") ? e.slice(0, -1) : e;
    return `${t}${n}${r}`;
  }
  function Xks(e) {
    return e.match(/^\s*\d+[\u2192\t:](.*)$/)?.[1] ?? e;
  }
  function Qks(e) {
    try {
      return zt().isDirEmptySync(e);
    } catch (t) {
      return fn(t);
    }
  }
  function Zks(e, t) {
    if (e instanceof Error && !(e instanceof nY) && e !== t) {
      try {
        if (e.cause === undefined) {
          e.message += ` (atomic write failed first: ${he(t)})`;
          Object.defineProperty(e, "cause", {
            value: t,
            writable: true,
            configurable: true,
            enumerable: false
          });
        }
      } catch {}
    }
    throw e;
  }
  function HDt(e, t, n = {
    encoding: "utf-8"
  }) {
    let r = zt();
    let o = n.allowSymlink ? 0 : du.constants.O_NOFOLLOW;
    let s = e;
    let i;
    let a = false;
    if (n.allowSymlink) {
      try {
        let d = r.readlinkSync(e);
        s = zc.isAbsolute(d) ? d : zc.resolve(qd(r, zc.dirname(e)).resolvedPath, d);
        logForDebugging(`Writing through symlink: ${e} -> ${s}`);
      } catch {}
    } else {
      if (n.checkParentDir) {
        try {
          du.closeSync(du.openSync(zc.dirname(e), du.constants.O_RDONLY | du.constants.O_DIRECTORY | du.constants.O_NOFOLLOW));
        } catch (d) {
          let p = en(d);
          if (p === "ELOOP" || p === "ENOTDIR") {
            throw new nY(`Refusing to write into symlinked directory: ${zc.dirname(e)}`);
          }
        }
      }
      try {
        let d = r.lstatSync(e);
        if (d.isSymbolicLink()) {
          throw new nY(`Refusing to write through symlink: ${e}. Resolve the symlink and pass the real target path explicitly.`);
        }
        i = d.mode;
        a = true;
      } catch (d) {
        if (!fn(d)) {
          throw d;
        }
      }
    }
    let l = `.tmp.${process.pid}.${BMr.randomBytes(6).toString("hex")}`;
    let c = zks(n.stagingDir, s, l, n.allowSymlink ?? false);
    let u = false;
    if (n.allowSymlink && !a) {
      try {
        i = r.statSync(s).mode;
        a = true;
      } catch (d) {
        if (!fn(d)) {
          throw d;
        }
      }
    }
    if (a && i !== undefined) {
      logForDebugging(`Preserving file permissions: ${i.toString(8)}`);
    } else if (n.mode !== undefined) {
      i = n.mode;
      logForDebugging(`Setting permissions for new file: ${i.toString(8)}`);
    }
    try {
      logForDebugging(`Writing to temp file: ${c}`);
      let d = du.openSync(c, du.constants.O_WRONLY | du.constants.O_CREAT | du.constants.O_EXCL | o, !a && n.mode !== undefined ? n.mode : undefined);
      let p = false;
      let m;
      try {
        if (zc.dirname(c) !== zc.dirname(s)) {
          $Dt(n.stagingDir);
        }
        if (du.writeFileSync(d, t, {
          encoding: n.encoding
        }), a && i !== undefined) {
          try {
            du.fchmodSync(d, i);
            logForDebugging("Applied original permissions to temp file");
          } catch (f) {
            if (!cnt(f)) {
              throw f;
            }
            logForDebugging(`fchmod unsupported on this filesystem: ${f}`);
          }
        }
        try {
          du.fsyncSync(d);
        } catch (f) {
          if (!cnt(f)) {
            throw f;
          }
          logForDebugging(`fsync unsupported on this filesystem: ${f}`);
        }
        u = true;
      } catch (f) {
        p = true;
        m = f;
      }
      try {
        du.closeSync(d);
      } catch (f) {
        if (!p) {
          throw f;
        }
        logForDebugging(`closeSync also failed after temp write error: ${f}`, {
          level: "error"
        });
      }
      if (p) {
        throw m;
      }
      if (logForDebugging(`Temp file written successfully, size: ${t.length} bytes`), zc.dirname(c) !== zc.dirname(s)) {
        $Dt(n.stagingDir);
      }
      logForDebugging(`Renaming ${c} to ${s}`);
      NMr(c, s, (f, h) => r.renameSync(f, h));
      logForDebugging(`File ${s} written atomically`);
    } catch (d) {
      logForDebugging(`Failed to write file atomically: ${d}`, {
        level: "error"
      });
      let p = en(d);
      if (u && p !== undefined && Tye.vZc(p) || !u && a && p === "EACCES") {
        let h;
        try {
          h = du.openSync(s, du.constants.O_WRONLY | du.constants.O_CREAT | du.constants.O_TRUNC | o, !a && n.mode !== undefined ? n.mode : undefined);
        } catch (g) {
          try {
            r.unlinkSync(c);
          } catch (y) {
            logForDebugging(`Failed to clean up temp file: ${y}`);
          }
          if (en(g) === "ELOOP") {
            throw new nY(`Refusing to write through symlink: ${s} (O_NOFOLLOW)`);
          }
          throw d;
        }
        try {
          du.writeFileSync(h, t, {
            encoding: n.encoding
          });
          try {
            du.fsyncSync(h);
          } catch (g) {
            if (!cnt(g)) {
              throw g;
            }
            logForDebugging(`fsync unsupported on this filesystem: ${g}`);
          }
          du.closeSync(h);
          try {
            r.unlinkSync(c);
          } catch (g) {
            logForDebugging(`Failed to clean up temp file: ${g}`);
          }
          logForDebugging(`File ${s} written via in-place fallback`);
          return;
        } catch (g) {
          try {
            du.closeSync(h);
          } catch {}
          try {
            r.unlinkSync(s);
          } catch {}
          if (u) {
            throw new Po(`Write to ${s} failed (${en(g) ?? g}) after the target was truncated. The new content was preserved at ${c}.`, "writeFileSyncAndFlush: in-place fallback write failed; content preserved at temp path");
          }
          Zks(g, d);
        }
      }
      try {
        r.unlinkSync(c);
      } catch (h) {
        logForDebugging(`Failed to clean up temp file: ${h}`);
      }
      throw d;
    }
  }
  async function jDt(e, t, n = {
    encoding: "utf-8"
  }) {
    let r = zt();
    let o = n.allowSymlink ? 0 : du.constants.O_NOFOLLOW;
    let s = e;
    let i;
    let a = false;
    if (n.allowSymlink) {
      try {
        let d = await oW.readlink(e);
        s = zc.isAbsolute(d) ? d : zc.resolve(await oW.realpath(zc.dirname(e)), d);
        logForDebugging(`Writing through symlink: ${e} -> ${s}`);
      } catch {}
    } else {
      if (n.checkParentDir) {
        try {
          await (await oW.open(zc.dirname(e), du.constants.O_RDONLY | du.constants.O_DIRECTORY | du.constants.O_NOFOLLOW)).close();
        } catch (d) {
          let p = en(d);
          if (p === "ELOOP" || p === "ENOTDIR") {
            throw new nY(`Refusing to write into symlinked directory: ${zc.dirname(e)}`);
          }
        }
      }
      try {
        let d = await oW.lstat(e);
        if (d.isSymbolicLink()) {
          throw new nY(`Refusing to write through symlink: ${e}. Resolve the symlink and pass the real target path explicitly.`);
        }
        i = d.mode;
        a = true;
      } catch (d) {
        if (!fn(d)) {
          throw d;
        }
      }
    }
    let l = `.tmp.${process.pid}.${BMr.randomBytes(6).toString("hex")}`;
    let c = zks(n.stagingDir, s, l, n.allowSymlink ?? false);
    let u = false;
    if (n.allowSymlink && !a) {
      try {
        i = (await r.stat(s)).mode;
        a = true;
      } catch (d) {
        if (!fn(d)) {
          throw d;
        }
      }
    }
    if (a && i !== undefined) {
      logForDebugging(`Preserving file permissions: ${i.toString(8)}`);
    } else if (n.mode !== undefined) {
      i = n.mode;
      logForDebugging(`Setting permissions for new file: ${i.toString(8)}`);
    }
    try {
      logForDebugging(`Writing to temp file: ${c}`);
      let d = await oW.open(c, du.constants.O_WRONLY | du.constants.O_CREAT | du.constants.O_EXCL | o, !a && n.mode !== undefined ? n.mode : undefined);
      let p = false;
      let m;
      try {
        if (zc.dirname(c) !== zc.dirname(s)) {
          $Dt(n.stagingDir);
        }
        if (await d.writeFile(t, {
          encoding: n.encoding
        }), a && i !== undefined) {
          try {
            await d.chmod(i);
            logForDebugging("Applied original permissions to temp file");
          } catch (f) {
            if (!cnt(f)) {
              throw f;
            }
            logForDebugging(`fchmod unsupported on this filesystem: ${f}`);
          }
        }
        try {
          await d.sync();
        } catch (f) {
          if (!cnt(f)) {
            throw f;
          }
          logForDebugging(`fsync unsupported on this filesystem: ${f}`);
        }
        u = true;
      } catch (f) {
        p = true;
        m = f;
      }
      try {
        await d.close();
      } catch (f) {
        if (!p) {
          throw f;
        }
        logForDebugging(`close also failed after temp write error: ${f}`, {
          level: "error"
        });
      }
      if (p) {
        throw m;
      }
      if (logForDebugging(`Temp file written successfully, size: ${t.length} bytes`), zc.dirname(c) !== zc.dirname(s)) {
        $Dt(n.stagingDir);
      }
      logForDebugging(`Renaming ${c} to ${s}`);
      await QHe(c, s, (f, h) => r.rename(f, h));
      logForDebugging(`File ${s} written atomically`);
    } catch (d) {
      logForDebugging(`Failed to write file atomically: ${d}`, {
        level: "error"
      });
      let p = en(d);
      if (u && p !== undefined && Tye.vZc(p) || !u && a && p === "EACCES") {
        let h;
        try {
          h = await oW.open(s, du.constants.O_WRONLY | du.constants.O_CREAT | du.constants.O_TRUNC | o, !a && n.mode !== undefined ? n.mode : undefined);
        } catch (g) {
          try {
            await r.unlink(c);
          } catch (y) {
            logForDebugging(`Failed to clean up temp file: ${y}`);
          }
          if (en(g) === "ELOOP") {
            throw new nY(`Refusing to write through symlink: ${s} (O_NOFOLLOW)`);
          }
          throw d;
        }
        try {
          await h.writeFile(t, {
            encoding: n.encoding
          });
          try {
            await h.sync();
          } catch (g) {
            if (!cnt(g)) {
              throw g;
            }
            logForDebugging(`fsync unsupported on this filesystem: ${g}`);
          }
          await h.close();
          try {
            await r.unlink(c);
          } catch (g) {
            logForDebugging(`Failed to clean up temp file: ${g}`);
          }
          logForDebugging(`File ${s} written via in-place fallback`);
          return;
        } catch (g) {
          try {
            await h.close();
          } catch {}
          try {
            await r.unlink(s);
          } catch {}
          if (u) {
            throw new Po(`Write to ${s} failed (${en(g) ?? g}) after the target was truncated. The new content was preserved at ${c}.`, "writeFileAndFlush: in-place fallback write failed; content preserved at temp path");
          }
          Zks(g, d);
        }
      }
      try {
        await r.unlink(c);
      } catch (h) {
        logForDebugging(`Failed to clean up temp file: ${h}`);
      }
      throw d;
    }
  }
  function eAs() {
    let e = Wt();
    let t = $Mr.homedir();
    if (e === "macos") {
      return zc.join(t, "Desktop");
    }
    if (e === "windows") {
      let r = process.env.USERPROFILE ? process.env.USERPROFILE.replaceAll("\\", "/") : null;
      if (r) {
        let s = `/mnt/c${r.replace(/^[A-Z]:/, "")}/Desktop`;
        if (zt().existsSync(s)) {
          return s;
        }
      }
      try {
        let s = zt().readdirSync("/mnt/c/Users");
        for (let i of s) {
          if (i.name === "Public" || i.name === "Default" || i.name === "Default User" || i.name === "All Users") {
            continue;
          }
          let a = zc.join("/mnt/c/Users", i.name, "Desktop");
          if (zt().existsSync(a)) {
            return a;
          }
        }
      } catch (o) {
        logForDebugging(`Failed to enumerate /mnt/c/Users for Windows desktop path: ${o}`, {
          level: "error"
        });
      }
    }
    let n = zc.join(t, "Desktop");
    if (zt().existsSync(n)) {
      return n;
    }
    return t;
  }
  function dgn(e, t = 262144) {
    try {
      return zt().statSync(e).size <= t;
    } catch {
      return false;
    }
  }
  function yC(e) {
    let t = Wt() === "windows";
    let n = zc.normalize(e);
    let r = t ? /[\\/]+$/ : /\/+$/;
    let o = n.length > zc.parse(n).root.length ? n.replace(r, "") : n;
    return t ? o.replaceAll("/", "\\").toLowerCase() : o;
  }
  function tAs(e, t) {
    return yC(e) === yC(t);
  }
  var BMr;
  var du;
  var oW;
  var $Mr;
  var zc;
  var UMr;
  var nY;
  var Kks;
  var xye;
  var lgn;
  var Zl = __lazy(() => {
    ln();
    vo();
    BT();
    je();
    gn();
    dt();
    KB();
    Rn();
    ku();
    Cs();
    BMr = require("crypto");
    du = require("fs");
    oW = require("fs/promises");
    $Mr = require("os");
    zc = require("path");
    UMr = new Map();
    nY = class nY extends Error {
      constructor(e) {
        super(e);
        this.name = "SymlinkWriteRefusedError";
      }
    };
    Kks = class Kks extends Error {
      constructor(e) {
        super(e);
        this.name = "StagingDirTamperedError";
      }
    };
    xye = new Map();
    lgn = new Map();
  });