  var $Yi = __commonJS((VSy, BYi) => {
    var UYi = (e, t) => {
      if (typeof e === "number" && typeof t === "number") {
        return e === t ? 0 : e < t ? -1 : 1;
      }
      let n = (/^[0-9]+$/).test(e);
      let r = (/^[0-9]+$/).test(t);
      if (n && r) {
        e = +e;
        t = +t;
      }
      return e === t ? 0 : n && !r ? -1 : r && !n ? 1 : e < t ? -1 : 1;
    };
    var aZd = (e, t) => UYi(t, e);
    BYi.exports = {
      compareIdentifiers: UYi,
      rcompareIdentifiers: aZd
    };
  });
  var $ct = __commonJS((zSy, jYi) => {
    var V1n = cjt();
    var {
      MAX_LENGTH: HYi,
      MAX_SAFE_INTEGER: z1n
    } = W1n();
    var {
      safeRe: K1n,
      t: Y1n
    } = ujt();
    var lZd = G1n();
    var {
      compareIdentifiers: Sro
    } = $Yi();
    class Are {
      constructor(e, t) {
        if (t = lZd(t), e instanceof Are) {
          if (e.loose === !!t.loose && e.includePrerelease === !!t.includePrerelease) {
            return e;
          } else {
            e = e.version;
          }
        } else if (typeof e !== "string") {
          throw TypeError(`Invalid version. Must be a string. Got type "${typeof e}".`);
        }
        if (e.length > HYi) {
          throw TypeError(`version is longer than ${HYi} characters`);
        }
        V1n("SemVer", e, t);
        this.options = t;
        this.loose = !!t.loose;
        this.includePrerelease = !!t.includePrerelease;
        let n = e.trim().match(t.loose ? K1n[Y1n.LOOSE] : K1n[Y1n.FULL]);
        if (!n) {
          throw TypeError(`Invalid Version: ${e}`);
        }
        if (this.raw = e, this.major = +n[1], this.minor = +n[2], this.patch = +n[3], this.major > z1n || this.major < 0) {
          throw TypeError("Invalid major version");
        }
        if (this.minor > z1n || this.minor < 0) {
          throw TypeError("Invalid minor version");
        }
        if (this.patch > z1n || this.patch < 0) {
          throw TypeError("Invalid patch version");
        }
        if (!n[4]) {
          this.prerelease = [];
        } else {
          this.prerelease = n[4].split(".").map(r => {
            if (/^[0-9]+$/.test(r)) {
              let o = +r;
              if (o >= 0 && o < z1n) {
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
        if (V1n("SemVer.compare", this.version, this.options, e), !(e instanceof Are)) {
          if (typeof e === "string" && e === this.version) {
            return 0;
          }
          e = new Are(e, this.options);
        }
        if (e.version === this.version) {
          return 0;
        }
        return this.compareMain(e) || this.comparePre(e);
      }
      compareMain(e) {
        if (!(e instanceof Are)) {
          e = new Are(e, this.options);
        }
        if (this.major < e.major) {
          return -1;
        }
        if (this.major > e.major) {
          return 1;
        }
        if (this.minor < e.minor) {
          return -1;
        }
        if (this.minor > e.minor) {
          return 1;
        }
        if (this.patch < e.patch) {
          return -1;
        }
        if (this.patch > e.patch) {
          return 1;
        }
        return 0;
      }
      comparePre(e) {
        if (!(e instanceof Are)) {
          e = new Are(e, this.options);
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
          if (V1n("prerelease compare", t, n, r), n === undefined && r === undefined) {
            return 0;
          } else if (r === undefined) {
            return 1;
          } else if (n === undefined) {
            return -1;
          } else if (n === r) {
            continue;
          } else {
            return Sro(n, r);
          }
        } while (++t);
      }
      compareBuild(e) {
        if (!(e instanceof Are)) {
          e = new Are(e, this.options);
        }
        let t = 0;
        do {
          let n = this.build[t];
          let r = e.build[t];
          if (V1n("build compare", t, n, r), n === undefined && r === undefined) {
            return 0;
          } else if (r === undefined) {
            return 1;
          } else if (n === undefined) {
            return -1;
          } else if (n === r) {
            continue;
          } else {
            return Sro(n, r);
          }
        } while (++t);
      }
      inc(e, t, n) {
        if (e.startsWith("pre")) {
          if (!t && n === false) {
            throw Error("invalid increment argument: identifier is empty");
          }
          if (t) {
            let r = `-${t}`.match(this.options.loose ? K1n[Y1n.PRERELEASELOOSE] : K1n[Y1n.PRERELEASE]);
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
                if (Sro(this.prerelease[0], t) === 0) {
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
    jYi.exports = Are;
  });