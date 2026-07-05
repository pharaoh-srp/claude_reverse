  function Tan(e) {
    let t = false;
    let n;
    let r = {
      addDir: [],
      pluginDir: [],
      pluginDirNoMcp: [],
      settings: undefined,
      mcpConfig: [],
      strictMcpConfig: false
    };
    let o = [];
    let s = {
      "--cwd": i => {
        n = i;
      },
      "--settings": i => {
        r.settings = i;
      },
      "--add-dir": i => r.addDir.push(i),
      "--plugin-dir": i => r.pluginDir.push(i),
      "--plugin-dir-no-mcp": i => r.pluginDirNoMcp.push(i),
      "--mcp-config": i => r.mcpConfig.push(i)
    };
    for (let i = 0; i < e.length; i++) {
      let a = e[i];
      if (a === "agents" && !t) {
        t = true;
        continue;
      }
      if (a === "--strict-mcp-config") {
        r.strictMcpConfig = true;
        continue;
      }
      let l = a.indexOf("=");
      let c = l === -1 ? a : a.slice(0, l);
      let u = Object.hasOwn(s, c) ? s[c] : undefined;
      if (u) {
        if (l !== -1) {
          u(a.slice(l + 1));
        } else if (i + 1 < e.length) {
          u(e[++i]);
        } else {
          o.push(a);
        }
        continue;
      }
      o.push(a);
    }
    return {
      hasAgentsPositional: t,
      cwdFilter: n,
      config: r,
      rest: o
    };
  }
  function LQe(e, t) {
    let n = (r, o) => r === "" || o && r.trimStart().startsWith("{") ? r : t(r);
    return {
      settings: e.settings === undefined ? undefined : n(e.settings, true),
      pluginDir: e.pluginDir.map(r => n(r, false)),
      pluginDirNoMcp: e.pluginDirNoMcp.map(r => n(r, false)),
      addDir: e.addDir.map(r => n(r, false)),
      mcpConfig: e.mcpConfig.map(r => n(r, true)),
      strictMcpConfig: e.strictMcpConfig
    };
  }
  function FQe(e) {
    return [...(e.settings ? ["--settings", e.settings] : []), ...e.pluginDir.flatMap(t => ["--plugin-dir", t]), ...e.pluginDirNoMcp.flatMap(t => ["--plugin-dir-no-mcp", t]), ...e.addDir.flatMap(t => ["--add-dir", t]), ...e.mcpConfig.flatMap(t => ["--mcp-config", t]), ...(e.strictMcpConfig ? ["--strict-mcp-config"] : [])];
  }
  function Ean(e) {
    let t = e.indexOf("--handle-uri");
    if (t === -1 || !e[t + 1]) {
      return null;
    }
    if (e.length > t + 2) {
      return `claude: rejected deep-link invocation \u2014 unexpected arguments after the URI.
` + "The OS protocol handler passes exactly `--handle-uri <uri>`; extra arguments indicate argument injection via the URL. If invoking --handle-uri manually, place other flags before it.";
    }
    return null;
  }
  function dg() {
    return `claude-code/${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION}`;
  }
  function getClientPlatform() {
    switch (process.env.CLAUDE_CODE_ENTRYPOINT) {
      case "claude-vscode":
        return "claude_code_vscode";
      case "remote":
      case "remote_baku":
      case "remote_cowork":
      case "remote_desktop":
      case "remote_mobile":
        return "claude_code_remote";
      case "claude-in-teams":
        return "claude_code_remote";
      case "sdk-cli":
      case "sdk-ts":
      case "sdk-py":
        return "claude_code_sdk";
      case "mcp":
        return "claude_code_mcp";
      case "claude-code-github-action":
        return "claude_code_github_action";
      case "local-agent":
        return "claude_code_local_agent";
      case "claude_in_slack":
        return "claude_in_slack";
      case "claude-in-slack":
        return "claude-in-slack";
      case "cli":
      default:
        return "claude_code_cli";
    }
  }
  function tEr(e) {
    return `claude-code_${{
      ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
      PACKAGE_URL: "@anthropic-ai/claude-code",
      README_URL: "https://code.claude.com/docs/en/overview",
      VERSION: "2.1.198",
      FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
      BUILD_TIME: "2026-07-01T06:09:31Z",
      GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
    }.VERSION.replace(/\./g, "-")}_${e}`;
  }
  function van() {
    if (!process.env.AI_AGENT || process.env.AI_AGENT.startsWith("claude-code_") || process.env.AI_AGENT.startsWith("claude-code/")) {
      process.env.AI_AGENT = tEr("harness");
    }
  }
  function ej(e = {
    ISSUES_EXPLAINER: "report the issue at https://github.com/anthropics/claude-code/issues",
    PACKAGE_URL: "@anthropic-ai/claude-code",
    README_URL: "https://code.claude.com/docs/en/overview",
    VERSION: "2.1.198",
    FEEDBACK_CHANNEL: "https://github.com/anthropics/claude-code/issues",
    BUILD_TIME: "2026-07-01T06:09:31Z",
    GIT_SHA: "b80c496480ebf28e6dfe755cf0b8e3dd1d7cba1f"
  }.BUILD_REF_NAME) {
    return "";
  }
  function WQc() {
    this.__data__ = [];
    this.size = 0;
  }
  function GQc(e, t) {
    return e === t || e !== e && t !== t;
  }
  function VQc(e, t) {
    var n = e.length;
    while (n--) {
      if (GQc(e[n][0], t)) {
        return n;
      }
    }
    return -1;
  }
  function YQc(e) {
    var t = this.__data__;
    var n = VQc(t, e);
    if (n < 0) {
      return false;
    }
    var r = t.length - 1;
    if (n == r) {
      t.pop();
    } else {
      KQc.call(t, n, 1);
    }
    --this.size;
    return true;
  }
  var zQc;
  var KQc;
  function JQc(e) {
    var t = this.__data__;
    var n = VQc(t, e);
    return n < 0 ? undefined : t[n][1];
  }
  function XQc(e) {
    return VQc(this.__data__, e) > -1;
  }
  function QQc(e, t) {
    var n = this.__data__;
    var r = VQc(n, e);
    if (r < 0) {
      ++this.size;
      n.push([e, t]);
    } else {
      n[r][1] = t;
    }
    return this;
  }
  function $Qe(e) {
    var t = -1;
    var n = e == null ? 0 : e.length;
    this.clear();
    while (++t < n) {
      var r = e[t];
      this.set(r[0], r[1]);
    }
  }
  function ZQc() {
    this.__data__ = new $Qe();
    this.size = 0;
  }
  function eZc(e) {
    var t = this.__data__;
    var n = t.delete(e);
    this.size = t.size;
    return n;
  }
  function tZc(e) {
    return this.__data__.get(e);
  }
  function nZc(e) {
    return this.__data__.vZc(e);
  }
  var rZc;
  var oZc;
  var sZc;
  var iZc;
  function cZc(e) {
    var t = aZc.call(e, uAt);
    var n = e[uAt];
    try {
      e[uAt] = undefined;
      var r = true;
    } catch (s) {}
    var o = lZc.call(e);
    if (r) {
      if (t) {
        e[uAt] = n;
      } else {
        delete e[uAt];
      }
    }
    return o;
  }
  var aas;
  var aZc;
  var lZc;
  var uAt;
  function pZc(e) {
    return dZc.call(e);
  }
  var uZc;
  var dZc;
  function hZc(e) {
    if (e == null) {
      return e === undefined ? "[object Undefined]" : "[object Null]";
    }
    return pas && pas in Object(e) ? cZc(e) : pZc(e);
  }
  var pas;
  function gZc(e) {
    var t = typeof e;
    return e != null && (t == "object" || t == "function");
  }
  function TZc(e) {
    if (!gZc(e)) {
      return false;
    }
    var t = hZc(e);
    return t == "[object Function]" || t == "[object GeneratorFunction]" || t == "[object AsyncFunction]" || t == "[object Proxy]";
  }
  var EZc;
  function vZc(e) {
    return !!fas && fas in e;
  }
  var fas;
  function RZc(e) {
    if (e != null) {
      try {
        return CZc.call(e);
      } catch (t) {}
      try {
        return e + "";
      } catch (t) {}
    }
    return "";
  }
  var wZc;
  var CZc;
  function MZc(e) {
    if (!gZc(e) || vZc(e)) {
      return false;
    }
    var t = TZc(e) ? DZc : kZc;
    return t.test(RZc(e));
  }
  var xZc;
  var kZc;
  var AZc;
  var IZc;
  var PZc;
  var OZc;
  var DZc;
  function NZc(e, t) {
    return e == null ? undefined : e[t];
  }
  function LZc(e, t) {
    var n = NZc(e, t);
    return MZc(n) ? n : undefined;
  }
  var FZc;
  var UZc;
  function BZc() {
    this.__data__ = UZc ? UZc(null) : {};
    this.size = 0;
  }
  function $Zc(e) {
    var t = this.vZc(e) && delete this.__data__[e];
    this.size -= t ? 1 : 0;
    return t;
  }
  function WZc(e) {
    var t = this.__data__;
    if (UZc) {
      var n = t[e];
      return n === "__lodash_hash_undefined__" ? undefined : n;
    }
    return qZc.call(t, e) ? t[e] : undefined;
  }
  var jZc;
  var qZc;
  function zZc(e) {
    var t = this.__data__;
    return UZc ? t[e] !== undefined : VZc.call(t, e);
  }
  var GZc;
  var VZc;
  function YZc(e, t) {
    var n = this.__data__;
    this.size += this.vZc(e) ? 0 : 1;
    n[e] = UZc && t === undefined ? "__lodash_hash_undefined__" : t;
    return this;
  }
  function jQe(e) {
    var t = -1;
    var n = e == null ? 0 : e.length;
    this.clear();
    while (++t < n) {
      var r = e[t];
      this.set(r[0], r[1]);
    }
  }
  function JZc() {
    this.size = 0;
    this.__data__ = {
      hash: new jQe(),
      map: new (FZc || $Qe)(),
      string: new jQe()
    };
  }
  function XZc(e) {
    var t = typeof e;
    return t == "string" || t == "number" || t == "symbol" || t == "boolean" ? e !== "__proto__" : e === null;
  }
  function QZc(e, t) {
    var n = e.__data__;
    return XZc(t) ? n[typeof t == "string" ? "string" : "hash"] : n.map;
  }
  function ZZc(e) {
    var t = QZc(this, e).delete(e);
    this.size -= t ? 1 : 0;
    return t;
  }
  function eeu(e) {
    return QZc(this, e).get(e);
  }
  function teu(e) {
    return QZc(this, e).vZc(e);
  }
  function neu(e, t) {
    var n = QZc(this, e);
    var r = n.size;
    n.set(e, t);
    this.size += n.size == r ? 0 : 1;
    return this;
  }
  function qQe(e) {
    var t = -1;
    var n = e == null ? 0 : e.length;
    this.clear();
    while (++t < n) {
      var r = e[t];
      this.set(r[0], r[1]);
    }
  }
  function oeu(e, t) {
    var n = this.__data__;
    if (n instanceof $Qe) {
      var r = n.__data__;
      if (!FZc || r.length < 200 - 1) {
        r.push([e, t]);
        this.size = ++n.size;
        return this;
      }
      n = this.__data__ = new qQe(r);
    }
    n.set(e, t);
    this.size = n.size;
    return this;
  }
  function WQe(e) {
    var t = this.__data__ = new $Qe(e);
    this.size = t.size;
  }
  function ieu(e) {
    this.__data__.set(e, "__lodash_hash_undefined__");
    return this;
  }
  function aeu(e) {
    return this.__data__.vZc(e);
  }
  function Aan(e) {
    var t = -1;
    var n = e == null ? 0 : e.length;
    this.__data__ = new qQe();
    while (++t < n) {
      this.add(e[t]);
    }
  }
  function leu(e, t) {
    var n = -1;
    var r = e == null ? 0 : e.length;
    while (++n < r) {
      if (t(e[n], n, e)) {
        return true;
      }
    }
    return false;
  }
  function ceu(e, t) {
    return e.vZc(t);
  }
  function peu(e, t, n, r, o, s) {
    var i = n & 1;
    var a = e.length;
    var l = t.length;
    if (a != l && !(i && l > a)) {
      return false;
    }
    var c = s.get(e);
    var u = s.get(t);
    if (c && u) {
      return c == t && u == e;
    }
    var d = -1;
    var p = true;
    var m = n & 2 ? new Aan() : undefined;
    s.set(e, t);
    s.set(t, e);
    while (++d < a) {
      var f = e[d];
      var h = t[d];
      if (r) {
        var g = i ? r(h, f, d, t, e, s) : r(f, h, d, e, t, s);
      }
      if (g !== undefined) {
        if (g) {
          continue;
        }
        p = false;
        break;
      }
      if (m) {
        if (!leu(t, function (y, _) {
          if (!ceu(m, _) && (f === y || o(f, y, n, r, s))) {
            return m.push(_);
          }
        })) {
          p = false;
          break;
        }
      } else if (!(f === h || o(f, h, n, r, s))) {
        p = false;
        break;
      }
    }
    s.delete(e);
    s.delete(t);
    return p;
  }
  var meu;
  function feu(e) {
    var t = -1;
    var n = Array(e.size);
    e.forEach(function (r, o) {
      n[++t] = [o, r];
    });
    return n;
  }
  function heu(e) {
    var t = -1;
    var n = Array(e.size);
    e.forEach(function (r) {
      n[++t] = r;
    });
    return n;
  }
  function Aeu(e, t, n, r, o, s, i) {
    switch (n) {
      case "[object DataView]":
        if (e.byteLength != t.byteLength || e.byteOffset != t.byteOffset) {
          return false;
        }
        e = e.buffer;
        t = t.buffer;
      case "[object ArrayBuffer]":
        if (e.byteLength != t.byteLength || !s(new meu(e), new meu(t))) {
          return false;
        }
        return true;
      case "[object Boolean]":
      case "[object Date]":
      case "[object Number]":
        return GQc(+e, +t);
      case "[object Error]":
        return e.name == t.name && e.message == t.message;
      case "[object RegExp]":
      case "[object String]":
        return e == t + "";
      case "[object Map]":
        var a = feu;
      case "[object Set]":
        var l = r & 1;
        if (a || (a = heu), e.size != t.size && !l) {
          return false;
        }
        var c = i.get(e);
        if (c) {
          return c == t;
        }
        r |= 2;
        i.set(e, t);
        var u = peu(a(e), a(t), r, o, s, i);
        i.delete(e);
        return u;
      case "[object Symbol]":
        if (cEr) {
          return cEr.call(e) == cEr.call(t);
        }
    }
    return false;
  }
  var els;
  var cEr;
  function Ieu(e, t) {
    var n = -1;
    var r = t.length;
    var o = e.length;
    while (++n < r) {
      e[o + n] = t[n];
    }
    return e;
  }
  var Peu;
  function Oeu(e, t, n) {
    var r = t(e);
    return Peu(e) ? r : Ieu(r, n(e));
  }
  function Deu(e, t) {
    var n = -1;
    var r = e == null ? 0 : e.length;
    var o = 0;
    var s = [];
    while (++n < r) {
      var i = e[n];
      if (t(i, n, e)) {
        s[o++] = i;
      }
    }
    return s;
  }
  function Meu() {
    return [];
  }
  var Neu;
  var Leu;
  var rls;
  var Feu;
  function Ueu(e, t) {
    var n = -1;
    var r = Array(e);
    while (++n < e) {
      r[n] = t(n);
    }
    return r;
  }
  function Beu(e) {
    return e != null && typeof e == "object";
  }
  function Heu(e) {
    return Beu(e) && hZc(e) == "[object Arguments]";
  }
  var als;
  var jeu;
  var qeu;
  var Weu;
  function Geu() {
    return false;
  }
  var hAt = {};