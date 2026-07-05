  var Sue = __commonJS((USy, lYi) => {
    /*!
    Copyright 2013 Lovell Fuller and others.
    SPDX-License-Identifier: Apache-2.0
    */
    var aYi = e => typeof e < "u" && e !== null;
    var yQd = e => typeof e === "object";
    var _Qd = e => Object.prototype.toString.call(e) === "[object Object]";
    var bQd = e => typeof e === "function";
    var SQd = e => typeof e === "boolean";
    var TQd = e => e instanceof Buffer;
    var EQd = e => {
      if (aYi(e)) {
        switch (e.constructor) {
          case Uint8Array:
          case Uint8ClampedArray:
          case Int8Array:
          case Uint16Array:
          case Int16Array:
          case Uint32Array:
          case Int32Array:
          case Float32Array:
          case Float64Array:
            return true;
        }
      }
      return false;
    };
    var vQd = e => e instanceof ArrayBuffer;
    var wQd = e => typeof e === "string" && e.length > 0;
    var CQd = e => typeof e === "number" && !Number.isNaN(e);
    var RQd = e => Number.isInteger(e);
    var xQd = (e, t, n) => e >= t && e <= n;
    var kQd = (e, t) => t.includes(e);
    var AQd = (e, t, n) => Error(`Expected ${t} for ${e} but received ${n} of type ${typeof n}`);
    var IQd = (e, t) => (t.message = e.message, t);
    lYi.exports = {
      defined: aYi,
      object: yQd,
      plainObject: _Qd,
      fn: bQd,
      bool: SQd,
      buffer: TQd,
      typedArray: EQd,
      arrayBuffer: vQd,
      string: wQd,
      number: CQd,
      integer: RQd,
      inRange: xQd,
      inArray: kQd,
      invalidParameterError: AQd,
      nativeError: IQd
    };
  });
  var dYi = __commonJS((BSy, uYi) => {
    var cYi = () => true;
    var H1n = null;
    var PQd = () => {
      if (!H1n) {
        if (cYi() && process.report) {
          let e = process.report.excludeNetwork;
          process.report.excludeNetwork = true;
          H1n = process.report.getReport();
          process.report.excludeNetwork = e;
        } else {
          H1n = {};
        }
      }
      return H1n;
    };
    uYi.exports = {
      isLinux: cYi,
      getReport: PQd
    };
  });
  var mYi = __commonJS(($Sy, pYi) => {
    var Uct = require("fs");
    var OQd = e => {
      let t = Uct.openSync(e, "r");
      let n = Buffer.alloc(2048);
      let r = Uct.readSync(t, n, 0, 2048, 0);
      Uct.close(t, () => {});
      return n.subarray(0, r);
    };
    var DQd = e => new Promise((t, n) => {
      Uct.open(e, "r", (r, o) => {
        if (r) {
          n(r);
        } else {
          let s = Buffer.alloc(2048);
          Uct.read(o, s, 0, 2048, 0, (i, a) => {
            t(s.subarray(0, a));
            Uct.close(o, () => {});
          });
        }
      });
    });
    pYi.exports = {
      LDD_PATH: "/usr/bin/ldd",
      SELF_PATH: "/proc/self/exe",
      readFileSync: OQd,
      readFile: DQd
    };
  });
  var hYi = __commonJS((HSy, fYi) => {
    var MQd = e => {
      if (e.length < 64) {
        return null;
      }
      if (e.readUInt32BE(0) !== 2135247942) {
        return null;
      }
      if (e.readUInt8(4) !== 2) {
        return null;
      }
      if (e.readUInt8(5) !== 1) {
        return null;
      }
      let t = e.readUInt32LE(32);
      let n = e.readUInt16LE(54);
      let r = e.readUInt16LE(56);
      for (let o = 0; o < r; o++) {
        let s = t + o * n;
        if (e.readUInt32LE(s) === 3) {
          let a = e.readUInt32LE(s + 8);
          let l = e.readUInt32LE(s + 32);
          return e.subarray(a, a + l).toString().replace(/\0.*$/g, "");
        }
      }
      return null;
    };
    fYi.exports = {
      interpreterPath: MQd
    };
  });
  var q1n = __commonJS((jSy, OYi) => {
    var yYi = require("child_process");
    var {
      isLinux: Bct,
      getReport: _Yi
    } = dYi();
    var {
      LDD_PATH: j1n,
      SELF_PATH: bYi,
      readFile: gro,
      readFileSync: yro
    } = mYi();
    var {
      interpreterPath: SYi
    } = hYi();
    var Tue;
    var Eue;
    var vue;
    var $Pe = "";
    var TYi = () => {
      if (!$Pe) {
        return new Promise(e => {
          yYi.exec("getconf GNU_LIBC_VERSION 2>&1 || true; ldd --version 2>&1 || true", (t, n) => {
            $Pe = t ? " " : n;
            e($Pe);
          });
        });
      }
      return $Pe;
    };
    var EYi = () => {
      if (!$Pe) {
        try {
          $Pe = yYi.execSync("getconf GNU_LIBC_VERSION 2>&1 || true; ldd --version 2>&1 || true", {
            encoding: "utf8"
          });
        } catch (e) {
          $Pe = " ";
        }
      }
      return $Pe;
    };
    var NQd = e => e.includes("libc.musl-") || e.includes("ld-musl-");
    var wYi = () => {
      let e = _Yi();
      if (e.header && e.header.glibcVersionRuntime) {
        return "glibc";
      }
      if (Array.isArray(e.sharedObjects)) {
        if (e.sharedObjects.some(NQd)) {
          return "musl";
        }
      }
      return null;
    };
    var CYi = e => {
      let [t, n] = e.split(/[\r\n]+/);
      if (t && t.includes("glibc")) {
        return "glibc";
      }
      if (n && n.includes("musl")) {
        return "musl";
      }
      return null;
    };
    var RYi = e => {
      if (e) {
        if (e.includes("/ld-musl-")) {
          return "musl";
        } else if (e.includes("/ld-linux-")) {
          return "glibc";
        }
      }
      return null;
    };
    var xYi = e => {
      if (e = e.toString(), e.includes("musl")) {
        return "musl";
      }
      if (e.includes("GNU C Library")) {
        return "glibc";
      }
      return null;
    };
    var LQd = async () => {
      if (Eue !== undefined) {
        return Eue;
      }
      Eue = null;
      try {
        let e = await gro(j1n);
        Eue = xYi(e);
      } catch (e) {}
      return Eue;
    };
    var FQd = () => {
      if (Eue !== undefined) {
        return Eue;
      }
      Eue = null;
      try {
        let e = yro(j1n);
        Eue = xYi(e);
      } catch (e) {}
      return Eue;
    };
    var UQd = async () => {
      if (Tue !== undefined) {
        return Tue;
      }
      Tue = null;
      try {
        let e = await gro(bYi);
        let t = SYi(e);
        Tue = RYi(t);
      } catch (e) {}
      return Tue;
    };
    var BQd = () => {
      if (Tue !== undefined) {
        return Tue;
      }
      Tue = null;
      try {
        let e = yro(bYi);
        let t = SYi(e);
        Tue = RYi(t);
      } catch (e) {}
      return Tue;
    };
    var kYi = async () => {
      let e = null;
      if (Bct()) {
        if (e = await UQd(), !e) {
          if (e = await LQd(), !e) {
            e = wYi();
          }
          if (!e) {
            let t = await TYi();
            e = CYi(t);
          }
        }
      }
      return e;
    };
    var AYi = () => {
      let e = null;
      if (Bct()) {
        if (e = BQd(), !e) {
          if (e = FQd(), !e) {
            e = wYi();
          }
          if (!e) {
            let t = EYi();
            e = CYi(t);
          }
        }
      }
      return e;
    };
    var $Qd = async () => Bct() && (await kYi()) !== "glibc";
    var HQd = () => Bct() && AYi() !== "glibc";
    var jQd = async () => {
      if (vue !== undefined) {
        return vue;
      }
      vue = null;
      try {
        let t = (await gro(j1n)).match(/LIBC[a-z0-9 \-).]*?(\d+\.\d+)/i);
        if (t) {
          vue = t[1];
        }
      } catch (e) {}
      return vue;
    };
    var qQd = () => {
      if (vue !== undefined) {
        return vue;
      }
      vue = null;
      try {
        let t = yro(j1n).match(/LIBC[a-z0-9 \-).]*?(\d+\.\d+)/i);
        if (t) {
          vue = t[1];
        }
      } catch (e) {}
      return vue;
    };
    var IYi = () => {
      let e = _Yi();
      if (e.header && e.header.glibcVersionRuntime) {
        return e.header.glibcVersionRuntime;
      }
      return null;
    };
    var gYi = e => e.trim().split(/\s+/)[1];
    var PYi = e => {
      let [t, n, r] = e.split(/[\r\n]+/);
      if (t && t.includes("glibc")) {
        return gYi(t);
      }
      if (n && r && n.includes("musl")) {
        return gYi(r);
      }
      return null;
    };
    var WQd = async () => {
      let e = null;
      if (Bct()) {
        if (e = await jQd(), !e) {
          e = IYi();
        }
        if (!e) {
          let t = await TYi();
          e = PYi(t);
        }
      }
      return e;
    };
    var GQd = () => {
      let e = null;
      if (Bct()) {
        if (e = qQd(), !e) {
          e = IYi();
        }
        if (!e) {
          let t = EYi();
          e = PYi(t);
        }
      }
      return e;
    };
    OYi.exports = {
      GLIBC: "glibc",
      MUSL: "musl",
      family: kYi,
      familySync: AYi,
      isNonGlibcLinux: $Qd,
      isNonGlibcLinuxSync: HQd,
      version: WQd,
      versionSync: GQd
    };
  });
  var cjt = __commonJS((qSy, DYi) => {
    var VQd = typeof process === "object" && process.env && process.env.NODE_DEBUG && /\bsemver\b/i.test(process.env.NODE_DEBUG) ? (...e) => console.error("SEMVER", ...e) : () => {};
    DYi.exports = VQd;
  });
  var W1n = __commonJS((WSy, MYi) => {
    var zQd = Number.MAX_SAFE_INTEGER || 9007199254740991;
    var KQd = ["major", "premajor", "minor", "preminor", "patch", "prepatch", "prerelease"];
    MYi.exports = {
      MAX_LENGTH: 256,
      MAX_SAFE_COMPONENT_LENGTH: 16,
      MAX_SAFE_BUILD_LENGTH: 250,
      MAX_SAFE_INTEGER: zQd,
      RELEASE_TYPES: KQd,
      SEMVER_SPEC_VERSION: "2.0.0",
      FLAG_INCLUDE_PRERELEASE: 1,
      FLAG_LOOSE: 2
    };
  });
  var ujt = __commonJS((wue, NYi) => {
    var {
      MAX_SAFE_COMPONENT_LENGTH: _ro,
      MAX_SAFE_BUILD_LENGTH: YQd,
      MAX_LENGTH: JQd
    } = W1n();
    var XQd = cjt();
    wue = NYi.exports = {};
    var QQd = wue.re = [];
    var ZQd = wue.safeRe = [];
    var Gl = wue.src = [];
    var eZd = wue.safeSrc = [];
    var Vl = wue.t = {};
    var tZd = 0;
    var nZd = [["\\s", 1], ["\\d", JQd], ["[a-zA-Z0-9-]", YQd]];
    var rZd = e => {
      for (let [t, n] of nZd) {
        e = e.split(`${t}*`).join(`${t}{0,${n}}`).split(`${t}+`).join(`${t}{1,${n}}`);
      }
      return e;
    };
    var Cm = (e, t, n) => {
      let r = rZd(t);
      let o = tZd++;
      XQd(e, o, t);
      Vl[e] = o;
      Gl[o] = t;
      eZd[o] = r;
      QQd[o] = new RegExp(t, n ? "g" : undefined);
      ZQd[o] = new RegExp(r, n ? "g" : undefined);
    };
    Cm("NUMERICIDENTIFIER", "0|[1-9]\\d*");
    Cm("NUMERICIDENTIFIERLOOSE", "\\d+");
    Cm("NONNUMERICIDENTIFIER", `\\d*[a-zA-Z-]${"[a-zA-Z0-9-]"}*`);
    Cm("MAINVERSION", `(${Gl[Vl.NUMERICIDENTIFIER]})\\.(${Gl[Vl.NUMERICIDENTIFIER]})\\.(${Gl[Vl.NUMERICIDENTIFIER]})`);
    Cm("MAINVERSIONLOOSE", `(${Gl[Vl.NUMERICIDENTIFIERLOOSE]})\\.(${Gl[Vl.NUMERICIDENTIFIERLOOSE]})\\.(${Gl[Vl.NUMERICIDENTIFIERLOOSE]})`);
    Cm("PRERELEASEIDENTIFIER", `(?:${Gl[Vl.NONNUMERICIDENTIFIER]}|${Gl[Vl.NUMERICIDENTIFIER]})`);
    Cm("PRERELEASEIDENTIFIERLOOSE", `(?:${Gl[Vl.NONNUMERICIDENTIFIER]}|${Gl[Vl.NUMERICIDENTIFIERLOOSE]})`);
    Cm("PRERELEASE", `(?:-(${Gl[Vl.PRERELEASEIDENTIFIER]}(?:\\.${Gl[Vl.PRERELEASEIDENTIFIER]})*))`);
    Cm("PRERELEASELOOSE", `(?:-?(${Gl[Vl.PRERELEASEIDENTIFIERLOOSE]}(?:\\.${Gl[Vl.PRERELEASEIDENTIFIERLOOSE]})*))`);
    Cm("BUILDIDENTIFIER", `${"[a-zA-Z0-9-]"}+`);
    Cm("BUILD", `(?:\\+(${Gl[Vl.BUILDIDENTIFIER]}(?:\\.${Gl[Vl.BUILDIDENTIFIER]})*))`);
    Cm("FULLPLAIN", `v?${Gl[Vl.MAINVERSION]}${Gl[Vl.PRERELEASE]}?${Gl[Vl.BUILD]}?`);
    Cm("FULL", `^${Gl[Vl.FULLPLAIN]}$`);
    Cm("LOOSEPLAIN", `[v=\\s]*${Gl[Vl.MAINVERSIONLOOSE]}${Gl[Vl.PRERELEASELOOSE]}?${Gl[Vl.BUILD]}?`);
    Cm("LOOSE", `^${Gl[Vl.LOOSEPLAIN]}$`);
    Cm("GTLT", "((?:<|>)?=?)");
    Cm("XRANGEIDENTIFIERLOOSE", `${Gl[Vl.NUMERICIDENTIFIERLOOSE]}|x|X|\\*`);
    Cm("XRANGEIDENTIFIER", `${Gl[Vl.NUMERICIDENTIFIER]}|x|X|\\*`);
    Cm("XRANGEPLAIN", `[v=\\s]*(${Gl[Vl.XRANGEIDENTIFIER]})(?:\\.(${Gl[Vl.XRANGEIDENTIFIER]})(?:\\.(${Gl[Vl.XRANGEIDENTIFIER]})(?:${Gl[Vl.PRERELEASE]})?${Gl[Vl.BUILD]}?)?)?`);
    Cm("XRANGEPLAINLOOSE", `[v=\\s]*(${Gl[Vl.XRANGEIDENTIFIERLOOSE]})(?:\\.(${Gl[Vl.XRANGEIDENTIFIERLOOSE]})(?:\\.(${Gl[Vl.XRANGEIDENTIFIERLOOSE]})(?:${Gl[Vl.PRERELEASELOOSE]})?${Gl[Vl.BUILD]}?)?)?`);
    Cm("XRANGE", `^${Gl[Vl.GTLT]}\\s*${Gl[Vl.XRANGEPLAIN]}$`);
    Cm("XRANGELOOSE", `^${Gl[Vl.GTLT]}\\s*${Gl[Vl.XRANGEPLAINLOOSE]}$`);
    Cm("COERCEPLAIN", `(^|[^\\d])(\\d{1,${_ro}})(?:\\.(\\d{1,${_ro}}))?(?:\\.(\\d{1,${_ro}}))?`);
    Cm("COERCE", `${Gl[Vl.COERCEPLAIN]}(?:$|[^\\d])`);
    Cm("COERCEFULL", Gl[Vl.COERCEPLAIN] + `(?:${Gl[Vl.PRERELEASE]})?(?:${Gl[Vl.BUILD]})?(?:$|[^\\d])`);
    Cm("COERCERTL", Gl[Vl.COERCE], true);
    Cm("COERCERTLFULL", Gl[Vl.COERCEFULL], true);
    Cm("LONETILDE", "(?:~>?)");
    Cm("TILDETRIM", `(\\s*)${Gl[Vl.LONETILDE]}\\s+`, true);
    wue.tildeTrimReplace = "$1~";
    Cm("TILDE", `^${Gl[Vl.LONETILDE]}${Gl[Vl.XRANGEPLAIN]}$`);
    Cm("TILDELOOSE", `^${Gl[Vl.LONETILDE]}${Gl[Vl.XRANGEPLAINLOOSE]}$`);
    Cm("LONECARET", "(?:\\^)");
    Cm("CARETTRIM", `(\\s*)${Gl[Vl.LONECARET]}\\s+`, true);
    wue.caretTrimReplace = "$1^";
    Cm("CARET", `^${Gl[Vl.LONECARET]}${Gl[Vl.XRANGEPLAIN]}$`);
    Cm("CARETLOOSE", `^${Gl[Vl.LONECARET]}${Gl[Vl.XRANGEPLAINLOOSE]}$`);
    Cm("COMPARATORLOOSE", `^${Gl[Vl.GTLT]}\\s*(${Gl[Vl.LOOSEPLAIN]})$|^$`);
    Cm("COMPARATOR", `^${Gl[Vl.GTLT]}\\s*(${Gl[Vl.FULLPLAIN]})$|^$`);
    Cm("COMPARATORTRIM", `(\\s*)${Gl[Vl.GTLT]}\\s*(${Gl[Vl.LOOSEPLAIN]}|${Gl[Vl.XRANGEPLAIN]})`, true);
    wue.comparatorTrimReplace = "$1$2$3";
    Cm("HYPHENRANGE", `^\\s*(${Gl[Vl.XRANGEPLAIN]})\\s+-\\s+(${Gl[Vl.XRANGEPLAIN]})\\s*$`);
    Cm("HYPHENRANGELOOSE", `^\\s*(${Gl[Vl.XRANGEPLAINLOOSE]})\\s+-\\s+(${Gl[Vl.XRANGEPLAINLOOSE]})\\s*$`);
    Cm("STAR", "(<|>)?=?\\s*\\*");
    Cm("GTE0", "^\\s*>=\\s*0\\.0\\.0\\s*$");
    Cm("GTE0PRE", "^\\s*>=\\s*0\\.0\\.0-0\\s*$");
  });
  var G1n = __commonJS((GSy, LYi) => {
    var oZd = Object.freeze({
      loose: true
    });
    var sZd = Object.freeze({});
    var iZd = e => {
      if (!e) {
        return sZd;
      }
      if (typeof e !== "object") {
        return oZd;
      }
      return e;
    };
    LYi.exports = iZd;
  });