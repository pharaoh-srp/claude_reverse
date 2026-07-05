  var aWe = __commonJS((Xoy, jDn) => {
    function q3i(e) {
      return Array.isArray(e) ? e : [e];
    }
    var W3i = "node-ignore";
    if (typeof Symbol < "u") {
      W3i = Symbol.for("node-ignore");
    }
    var G3i = W3i;
    var ult = (e, t, n) => (Object.defineProperty(e, t, {
      value: n
    }), n);
    var V3i = () => false;
    var R9d = e => e.replace(/([0-z])-([0-z])/g, (t, n, r) => n.charCodeAt(0) <= r.charCodeAt(0) ? t : "");
    var x9d = e => {
      let {
        length: t
      } = e;
      return e.slice(0, t - t % 2);
    };
    var k9d = [[/^\uFEFF/, () => ""], [/((?:\\\\)*?)(\\?\s+)$/, (e, t, n) => t + (n.indexOf("\\") === 0 ? " " : "")], [/(\\+?)\s/g, (e, t) => {
      let {
        length: n
      } = t;
      return t.slice(0, n - n % 2) + " ";
    }], [/[\\$.|*+(){^]/g, e => `\\${e}`], [/(?!\\)\?/g, () => "[^/]"], [/^\//, () => "^"], [/\//g, () => "\\/"], [/^\^*\\\*\\\*\\\//, () => "^(?:.*\\/)?"], [/^(?=[^^])/, function () {
      return !/\/(?!$)/.test(this) ? "(?:^|\\/)" : "^";
    }], [/\\\/\\\*\\\*(?=\\\/|$)/g, (e, t, n) => t + 6 < n.length ? "(?:\\/[^\\/]+)*" : "\\/.+"], [/(^|[^\\]+)(\\\*)+(?=.+)/g, (e, t, n) => {
      let r = n.replace(/\\\*/g, "[^\\/]*");
      return t + r;
    }], [/\\\\\\(?=[$.|*+(){^])/g, () => "\\"], [/\\\\/g, () => "\\"], [/(\\)?\[([^\]/]*?)(\\*)($|\])/g, (e, t, n, r, o) => t === "\\" ? `\\[${n}${x9d(r)}${o}` : o === "]" ? r.length % 2 === 0 ? `[${R9d(n)}${r}]` : "[]" : "[]"], [/(?:[^*])$/, e => /\/$/.test(e) ? `${e}$` : `${e}(?=$|\\/$)`]];
    var I9d = {
      [k$t](e, t) {
        return `${t ? `${t}[^/]+` : "[^/]*"}(?=$|\\/$)`;
      },
      [$Dn](e, t) {
        return `${t ? `${t}[^/]*` : "[^/]*"}(?=$|\\/$)`;
      }
    };
    var P9d = e => k9d.reduce((t, [n, r]) => t.replace(n, r.bind(e)), e);
    var HDn = e => typeof e === "string";
    var O9d = e => e && HDn(e) && !(/^\s+$/).test(e) && !(/(?:[^\\]|^)\\$/).test(e) && e.indexOf("#") !== 0;
    var D9d = e => e.split(/\r?\n/g).filter(Boolean);
    class z3i {
      constructor(e, t, n, r, o, s) {
        this.pattern = e;
        this.mark = t;
        this.negative = o;
        ult(this, "body", n);
        ult(this, "ignoreCase", r);
        ult(this, "regexPrefix", s);
      }
      get regex() {
        let e = "_" + "regex";
        if (this[e]) {
          return this[e];
        }
        return this._make("regex", e);
      }
      get checkRegex() {
        let e = "_" + "checkRegex";
        if (this[e]) {
          return this[e];
        }
        return this._make("checkRegex", e);
      }
      _make(e, t) {
        let n = this.regexPrefix.replace(/(^|\\\/)?\\\*$/, I9d[e]);
        let r = this.ignoreCase ? new RegExp(n, "i") : new RegExp(n);
        return ult(this, t, r);
      }
    }
    var M9d = ({
      pattern: e,
      mark: t
    }, n) => {
      let r = false;
      let o = e;
      if (o.indexOf("!") === 0) {
        r = true;
        o = o.substr(1);
      }
      o = o.replace(/^\\!/, "!").replace(/^\\#/, "#");
      let s = P9d(o);
      return new z3i(e, t, o, n, r, s);
    };
    class K3i {
      constructor(e) {
        this._ignoreCase = e;
        this._rules = [];
      }
      _add(e) {
        if (e && e[G3i]) {
          this._rules = this._rules.concat(e._rules._rules);
          this._added = true;
          return;
        }
        if (HDn(e)) {
          e = {
            pattern: e
          };
        }
        if (O9d(e.pattern)) {
          let t = M9d(e, this._ignoreCase);
          this._added = true;
          this._rules.push(t);
        }
      }
      add(e) {
        this._added = false;
        q3i(HDn(e) ? D9d(e) : e).forEach(this._add, this);
        return this._added;
      }
      test(e, t, n) {
        let r = false;
        let o = false;
        let s;
        this._rules.forEach(a => {
          let {
            negative: l
          } = a;
          if (o === l && r !== o || l && !r && !o && !t) {
            return;
          }
          if (!a[n].test(e)) {
            return;
          }
          r = !l;
          o = l;
          s = l ? undefined : a;
        });
        let i = {
          ignored: r,
          unignored: o
        };
        if (s) {
          i.rule = s;
        }
        return i;
      }
    }
    var N9d = (e, t) => {
      throw new t(e);
    };
    var $be = (e, t, n) => {
      if (!HDn(e)) {
        return n(`path must be a string, but got \`${t}\``, TypeError);
      }
      if (!e) {
        return n("path must not be empty", TypeError);
      }
      if ($be.isNotRelative(e)) {
        return n(`path should be a \`path.relative()\`d string, but got "${t}"`, RangeError);
      }
      return true;
    };
    var Y3i = e => (/^\.{0,2}\/|^\.{1,2}$/).test(e);
    $be.isNotRelative = Y3i;
    $be.convert = e => e;
    class J3i {
      constructor({
        ignorecase: e = true,
        ignoreCase: t = e,
        allowRelativePaths: n = false
      } = {}) {
        ult(this, G3i, true);
        this._rules = new K3i(t);
        this._strictPathCheck = !n;
        this._initCache();
      }
      _initCache() {
        this._ignoreCache = Object.create(null);
        this._testCache = Object.create(null);
      }
      add(e) {
        if (this._rules.add(e)) {
          this._initCache();
        }
        return this;
      }
      addPattern(e) {
        return this.add(e);
      }
      _test(e, t, n, r) {
        let o = e && $be.convert(e);
        $be(o, e, this._strictPathCheck ? N9d : V3i);
        return this._t(o, t, n, r);
      }
      checkIgnore(e) {
        if (!(/\/$/).test(e)) {
          return this.test(e);
        }
        let t = e.split("/").filter(Boolean);
        if (t.pop(), t.length) {
          let n = this._t(t.join("/") + "/", this._testCache, true, t);
          if (n.ignored) {
            return n;
          }
        }
        return this._rules.test(e, false, "checkRegex");
      }
      _t(e, t, n, r) {
        if (e in t) {
          return t[e];
        }
        if (!r) {
          r = e.split("/").filter(Boolean);
        }
        if (r.pop(), !r.length) {
          return t[e] = this._rules.test(e, n, "regex");
        }
        let o = this._t(r.join("/") + "/", t, n, r);
        return t[e] = o.ignored ? o : this._rules.test(e, n, "regex");
      }
      ignores(e) {
        return this._test(e, this._ignoreCache, false).ignored;
      }
      createFilter() {
        return e => !this.ignores(e);
      }
      filter(e) {
        return q3i(e).filter(this.createFilter());
      }
      test(e) {
        return this._test(e, this._testCache, true);
      }
    }
    var NQr = e => new J3i(e);
    var L9d = e => $be(e && $be.convert(e), e, V3i);
    var F9d = () => {
      let e = n => /^\\\\\?\\/.test(n) || /["<>|\u0000-\u001F]+/u.test(n) ? n : n.replace(/\\/g, "/");
      $be.convert = e;
      let t = /^[a-z]:\//i;
      $be.isNotRelative = n => t.test(n) || Y3i(n);
    };
    jDn.exports = NQr;
    NQr.default = NQr;
    jDn.exports.isPathValid = L9d;
    ult(jDn.exports, Symbol.for("setupWindows"), F9d);
  });
  function Pc(e, t) {
    if (Ql() && !B9d[e]) {
      return true;
    }
    if (kd() && !t?.explicitlyRequested) {
      return U9d[e];
    }
    return false;
  }
  function Qce() {
    return Boolean(Me.CLAUDE_CODE_DISABLE_CLAUDE_MDS || Pc("claudeMd", {
      explicitlyRequested: getAdditionalDirectoriesForClaudeMd().length > 0
    }));
  }
  var U9d;
  var B9d;
  var wb = __lazy(() => {
    at();
    pr();
    gn();
    U9d = {
      claudeMd: true,
      skills: true,
      workflows: false,
      plugins: true,
      pluginMonitors: false,
      themes: false,
      hljsLanguages: true,
      hooks: true,
      statusLine: false,
      fileSuggestion: false,
      mcpAutoDiscovered: false,
      mcpClaudeAi: false,
      mcpAgentFrontmatter: true,
      agents: true,
      outputStyles: false,
      lspServers: true,
      keybindings: false
    };
    B9d = {
      claudeMd: false,
      skills: false,
      workflows: false,
      plugins: false,
      pluginMonitors: false,
      themes: false,
      hljsLanguages: false,
      hooks: true,
      statusLine: true,
      fileSuggestion: true,
      mcpAutoDiscovered: false,
      mcpClaudeAi: false,
      mcpAgentFrontmatter: false,
      agents: false,
      outputStyles: false,
      lspServers: false,
      keybindings: false
    };
  });
  function II() {
    let e = getSettingsForSource("policySettings")?.enabledPlugins;
    if (!e) {
      return null;
    }
    let t = new Set();
    for (let [n, r] of Object.entries(e)) {
      if (typeof r !== "boolean" || !n.includes("@")) {
        continue;
      }
      let o = ii(n, "@");
      if (o) {
        t.add(o);
      }
    }
    return t.size > 0 ? t : null;
  }
  function AJ() {
    let e = getSettingsForSource("policySettings")?.enabledPlugins;
    if (!e) {
      return null;
    }
    let t = new Set();
    for (let [n, r] of Object.entries(e)) {
      if (r === true && n.includes("@")) {
        t.add(n);
      }
    }
    return t.size > 0 ? t : null;
  }
  var H8 = __lazy(() => {
    Zn();
  });
  function ZT(e) {
    let t = getSettingsForSource("policySettings")?.strictPluginOnlyCustomization;
    if (t === true) {
      return true;
    }
    if (Array.isArray(t)) {
      return t.includes(e);
    }
    return false;
  }
  function Hbe(e) {
    return e !== undefined && $9d.vZc(e);
  }
  var $9d;
  var IJ = __lazy(() => {
    $9d = new Set(["plugin", "policySettings", "built-in", "builtin", "bundled"]);
  });
  function H9d() {
    return {
      initialHooksConfig: null
    };
  }
  function LQr() {
    let e = q9d();
    let t = X3i.get(e);
    if (!t) {
      t = H9d();
      X3i.set(e, t);
    }
    return t;
  }
  function FQr() {
    let e = getSettingsForSource("policySettings");
    if (e?.disableAllHooks === true) {
      return {};
    }
    if (e?.allowManagedHooksOnly === true || Ql()) {
      return e?.hooks ?? {};
    }
    if (ZT("hooks")) {
      return e?.hooks ?? {};
    }
    let t = getInitialSettings();
    if (t.disableAllHooks === true) {
      return e?.hooks ?? {};
    }
    return t.hooks ?? {};
  }
  function $_() {
    return Ql() || Zce();
  }
  function Zce() {
    let e = getSettingsForSource("policySettings");
    if (e?.allowManagedHooksOnly === true) {
      return true;
    }
    if (getInitialSettings().disableAllHooks === true && e?.disableAllHooks !== true) {
      return true;
    }
    return false;
  }
  function rq() {
    return getSettingsForSource("policySettings")?.disableAllHooks === true;
  }
  function Q3i() {
    o_();
    LQr().initialHooksConfig = FQr();
  }
  function zIe() {
    o_();
    LQr().initialHooksConfig = FQr();
  }
  function U2() {
    let e = LQr();
    if (e.initialHooksConfig === null) {
      o_();
      e.initialHooksConfig = FQr();
    }
    return e.initialHooksConfig;
  }
  var q9d = () => "cli";
  var X3i;
  var i1 = __lazy(() => {
    gn();
    IJ();
    DA();
    X3i = new Map();
  });
  var BQr = {};