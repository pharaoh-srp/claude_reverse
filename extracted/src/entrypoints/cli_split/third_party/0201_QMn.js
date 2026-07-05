  var QMn = __commonJS((bcy, V9i) => {
    var gVd = Object.freeze({
      loose: true
    });
    var yVd = Object.freeze({});
    var _Vd = e => {
      if (!e) {
        return yVd;
      }
      if (typeof e !== "object") {
        return gVd;
      }
      return e;
    };
    V9i.exports = _Vd;
  });
  var Eeo = __commonJS((Scy, Y9i) => {
    var K9i = (e, t) => {
      let n = (/^[0-9]+$/).test(e);
      let r = (/^[0-9]+$/).test(t);
      if (n && r) {
        e = +e;
        t = +t;
      }
      return e === t ? 0 : n && !r ? -1 : r && !n ? 1 : e < t ? -1 : 1;
    };
    var bVd = (e, t) => K9i(t, e);
    Y9i.exports = {
      compareIdentifiers: K9i,
      rcompareIdentifiers: bVd
    };
  });
  var H2 = __commonJS((Tcy, X9i) => {
    var ZMn = lHt();
    var {
      MAX_LENGTH: J9i,
      MAX_SAFE_INTEGER: eNn
    } = aHt();
    var {
      safeRe: tNn,
      t: nNn
    } = $lt();
    var SVd = QMn();
    var {
      compareIdentifiers: Hlt
    } = Eeo();
    class pre {
      constructor(e, t) {
        if (t = SVd(t), e instanceof pre) {
          if (e.loose === !!t.loose && e.includePrerelease === !!t.includePrerelease) {
            return e;
          } else {
            e = e.version;
          }
        } else if (typeof e !== "string") {
          throw TypeError(`Invalid version. Must be a string. Got type "${typeof e}".`);
        }
        if (e.length > J9i) {
          throw TypeError(`version is longer than ${J9i} characters`);
        }
        ZMn("SemVer", e, t);
        this.options = t;
        this.loose = !!t.loose;
        this.includePrerelease = !!t.includePrerelease;
        let n = e.trim().match(t.loose ? tNn[nNn.LOOSE] : tNn[nNn.FULL]);
        if (!n) {
          throw TypeError(`Invalid Version: ${e}`);
        }
        if (this.raw = e, this.major = +n[1], this.minor = +n[2], this.patch = +n[3], this.major > eNn || this.major < 0) {
          throw TypeError("Invalid major version");
        }
        if (this.minor > eNn || this.minor < 0) {
          throw TypeError("Invalid minor version");
        }
        if (this.patch > eNn || this.patch < 0) {
          throw TypeError("Invalid patch version");
        }
        if (!n[4]) {
          this.prerelease = [];
        } else {
          this.prerelease = n[4].split(".").map(r => {
            if (/^[0-9]+$/.test(r)) {
              let o = +r;
              if (o >= 0 && o < eNn) {
                return o;
              }
            }
            return r;
          });
        }
        this.build = n[5] ? n[5].split(".") : [];
        this.format();
      }
      format() {
        if (this.version = `${this.major}.${this.minor}.${this.patch}`, this.prerelease.length) {
          this.version += `-${this.prerelease.join(".")}`;
        }
        return this.version;
      }
      toString() {
        return this.version;
      }
      compare(e) {
        if (ZMn("SemVer.compare", this.version, this.options, e), !(e instanceof pre)) {
          if (typeof e === "string" && e === this.version) {
            return 0;
          }
          e = new pre(e, this.options);
        }
        if (e.version === this.version) {
          return 0;
        }
        return this.compareMain(e) || this.comparePre(e);
      }
      compareMain(e) {
        if (!(e instanceof pre)) {
          e = new pre(e, this.options);
        }
        return Hlt(this.major, e.major) || Hlt(this.minor, e.minor) || Hlt(this.patch, e.patch);
      }
      comparePre(e) {
        if (!(e instanceof pre)) {
          e = new pre(e, this.options);
        }
        if (this.prerelease.length && !e.prerelease.length) {
          return -1;
        } else if (!this.prerelease.length && e.prerelease.length) {
          return 1;
        } else if (!this.prerelease.length && !e.prerelease.length) {
          return 0;
        }
        let t = 0;
        do {
          let n = this.prerelease[t];
          let r = e.prerelease[t];
          if (ZMn("prerelease compare", t, n, r), n === undefined && r === undefined) {
            return 0;
          } else if (r === undefined) {
            return 1;
          } else if (n === undefined) {
            return -1;
          } else if (n === r) {
            continue;
          } else {
            return Hlt(n, r);
          }
        } while (++t);
      }
      compareBuild(e) {
        if (!(e instanceof pre)) {
          e = new pre(e, this.options);
        }
        let t = 0;
        do {
          let n = this.build[t];
          let r = e.build[t];
          if (ZMn("build compare", t, n, r), n === undefined && r === undefined) {
            return 0;
          } else if (r === undefined) {
            return 1;
          } else if (n === undefined) {
            return -1;
          } else if (n === r) {
            continue;
          } else {
            return Hlt(n, r);
          }
        } while (++t);
      }
      inc(e, t, n) {
        if (e.startsWith("pre")) {
          if (!t && n === false) {
            throw Error("invalid increment argument: identifier is empty");
          }
          if (t) {
            let r = `-${t}`.match(this.options.loose ? tNn[nNn.PRERELEASELOOSE] : tNn[nNn.PRERELEASE]);
            if (!r || r[1] !== t) {
              throw Error(`invalid identifier: ${t}`);
            }
          }
        }
        switch (e) {
          case "premajor":
            this.prerelease.length = 0;
            this.patch = 0;
            this.minor = 0;
            this.major++;
            this.inc("pre", t, n);
            break;
          case "preminor":
            this.prerelease.length = 0;
            this.patch = 0;
            this.minor++;
            this.inc("pre", t, n);
            break;
          case "prepatch":
            this.prerelease.length = 0;
            this.inc("patch", t, n);
            this.inc("pre", t, n);
            break;
          case "prerelease":
            if (this.prerelease.length === 0) {
              this.inc("patch", t, n);
            }
            this.inc("pre", t, n);
            break;
          case "release":
            if (this.prerelease.length === 0) {
              throw Error(`version ${this.raw} is not a prerelease`);
            }
            this.prerelease.length = 0;
            break;
          case "major":
            if (this.minor !== 0 || this.patch !== 0 || this.prerelease.length === 0) {
              this.major++;
            }
            this.minor = 0;
            this.patch = 0;
            this.prerelease = [];
            break;
          case "minor":
            if (this.patch !== 0 || this.prerelease.length === 0) {
              this.minor++;
            }
            this.patch = 0;
            this.prerelease = [];
            break;
          case "patch":
            if (this.prerelease.length === 0) {
              this.patch++;
            }
            this.prerelease = [];
            break;
          case "pre":
            {
              let r = Number(n) ? 1 : 0;
              if (this.prerelease.length === 0) {
                this.prerelease = [r];
              } else {
                let o = this.prerelease.length;
                while (--o >= 0) {
                  if (typeof this.prerelease[o] === "number") {
                    this.prerelease[o]++;
                    o = -2;
                  }
                }
                if (o === -1) {
                  if (t === this.prerelease.join(".") && n === false) {
                    throw Error("invalid increment argument: identifier already exists");
                  }
                  this.prerelease.push(r);
                }
              }
              if (t) {
                let o = [t, r];
                if (n === false) {
                  o = [t];
                }
                if (Hlt(this.prerelease[0], t) === 0) {
                  if (isNaN(this.prerelease[1])) {
                    this.prerelease = o;
                  }
                } else {
                  this.prerelease = o;
                }
              }
              break;
            }
          default:
            throw Error(`invalid increment argument: ${e}`);
        }
        if (this.raw = this.format(), this.build.length) {
          this.raw += `+${this.build.join(".")}`;
        }
        return this;
      }
    }
    X9i.exports = pre;
  });
  var DWe = __commonJS((Ecy, Z9i) => {
    var Q9i = H2();
    var TVd = (e, t, n = false) => {
      if (e instanceof Q9i) {
        return e;
      }
      try {
        return new Q9i(e, t);
      } catch (r) {
        if (!n) {
          return null;
        }
        throw r;
      }
    };
    Z9i.exports = TVd;
  });
  var t5i = __commonJS((vcy, e5i) => {
    var EVd = DWe();
    var vVd = (e, t) => {
      let n = EVd(e, t);
      return n ? n.version : null;
    };
    e5i.exports = vVd;
  });
  var r5i = __commonJS((wcy, n5i) => {
    var wVd = DWe();
    var CVd = (e, t) => {
      let n = wVd(e.trim().replace(/^[=v]+/, ""), t);
      return n ? n.version : null;
    };
    n5i.exports = CVd;
  });
  var i5i = __commonJS((Ccy, s5i) => {
    var o5i = H2();
    var RVd = (e, t, n, r, o) => {
      if (typeof n === "string") {
        o = r;
        r = n;
        n = undefined;
      }
      try {
        return new o5i(e instanceof o5i ? e.version : e, n).inc(t, r, o).version;
      } catch (s) {
        return null;
      }
    };
    s5i.exports = RVd;
  });
  var c5i = __commonJS((Rcy, l5i) => {
    var a5i = DWe();
    var xVd = (e, t) => {
      let n = a5i(e, null, true);
      let r = a5i(t, null, true);
      let o = n.compare(r);
      if (o === 0) {
        return null;
      }
      let s = o > 0;
      let i = s ? n : r;
      let a = s ? r : n;
      let l = !!i.prerelease.length;
      if (!!a.prerelease.length && !l) {
        if (!a.patch && !a.minor) {
          return "major";
        }
        if (a.compareMain(i) === 0) {
          if (a.minor && !a.patch) {
            return "minor";
          }
          return "patch";
        }
      }
      let u = l ? "pre" : "";
      if (n.major !== r.major) {
        return u + "major";
      }
      if (n.minor !== r.minor) {
        return u + "minor";
      }
      if (n.patch !== r.patch) {
        return u + "patch";
      }
      return "prerelease";
    };
    l5i.exports = xVd;
  });
  var d5i = __commonJS((xcy, u5i) => {
    var kVd = H2();
    var AVd = (e, t) => new kVd(e, t).major;
    u5i.exports = AVd;
  });
  var m5i = __commonJS((kcy, p5i) => {
    var IVd = H2();
    var PVd = (e, t) => new IVd(e, t).minor;
    p5i.exports = PVd;
  });
  var h5i = __commonJS((Acy, f5i) => {
    var OVd = H2();
    var DVd = (e, t) => new OVd(e, t).patch;
    f5i.exports = DVd;
  });
  var y5i = __commonJS((Icy, g5i) => {
    var MVd = DWe();
    var NVd = (e, t) => {
      let n = MVd(e, t);
      return n && n.prerelease.length ? n.prerelease : null;
    };
    g5i.exports = NVd;
  });