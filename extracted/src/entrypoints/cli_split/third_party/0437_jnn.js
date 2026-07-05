  var jnn = __commonJS(X7o => {
    class J7o extends Error {
      constructor(e, t, n) {
        super(n);
        Error.captureStackTrace(this, this.constructor);
        this.name = this.constructor.name;
        this.code = t;
        this.exitCode = e;
        this.nestedError = undefined;
      }
    }
    class X_c extends J7o {
      constructor(e) {
        super(1, "commander.invalidArgument", e);
        Error.captureStackTrace(this, this.constructor);
        this.name = this.constructor.name;
      }
    }
    X7o.CommanderError = J7o;
    X7o.InvalidArgumentError = X_c;
  });
  var Zmr = __commonJS(Q7o => {
    var {
      InvalidArgumentError: I_f
    } = jnn();
    class Q_c {
      constructor(e, t) {
        switch (this.description = t || "", this.variadic = false, this.parseArg = undefined, this.defaultValue = undefined, this.defaultValueDescription = undefined, this.argChoices = undefined, e[0]) {
          case "<":
            this.required = true;
            this._name = e.slice(1, -1);
            break;
          case "[":
            this.required = false;
            this._name = e.slice(1, -1);
            break;
          default:
            this.required = true;
            this._name = e;
            break;
        }
        if (this._name.length > 3 && this._name.slice(-3) === "...") {
          this.variadic = true;
          this._name = this._name.slice(0, -3);
        }
      }
      name() {
        return this._name;
      }
      _concatValue(e, t) {
        if (t === this.defaultValue || !Array.isArray(t)) {
          return [e];
        }
        return t.concat(e);
      }
      default(e, t) {
        this.defaultValue = e;
        this.defaultValueDescription = t;
        return this;
      }
      argParser(e) {
        this.parseArg = e;
        return this;
      }
      choices(e) {
        this.argChoices = e.slice();
        this.parseArg = (t, n) => {
          if (!this.argChoices.includes(t)) {
            throw new I_f(`Allowed choices are ${this.argChoices.join(", ")}.`);
          }
          if (this.variadic) {
            return this._concatValue(t, n);
          }
          return t;
        };
        return this;
      }
      argRequired() {
        this.required = true;
        return this;
      }
      argOptional() {
        this.required = false;
        return this;
      }
    }
    function P_f(e) {
      let t = e.name() + (e.variadic === true ? "..." : "");
      return e.required ? "<" + t + ">" : "[" + t + "]";
    }
    Q7o.Argument = Q_c;
    Q7o.humanReadableArgName = P_f;
  });
  var Z7o = __commonJS(ebc => {
    var {
      humanReadableArgName: O_f
    } = Zmr();
    class Z_c {
      constructor() {
        this.helpWidth = undefined;
        this.sortSubcommands = false;
        this.sortOptions = false;
        this.showGlobalOptions = false;
      }
      visibleCommands(e) {
        let t = e.commands.filter(r => !r._hidden);
        let n = e._getHelpCommand();
        if (n && !n._hidden) {
          t.push(n);
        }
        if (this.sortSubcommands) {
          t.sort((r, o) => r.name().localeCompare(o.name()));
        }
        return t;
      }
      compareOptions(e, t) {
        let n = r => r.short ? r.short.replace(/^-/, "") : r.long.replace(/^--/, "");
        return n(e).localeCompare(n(t));
      }
      visibleOptions(e) {
        let t = e.options.filter(r => !r.hidden);
        let n = e._getHelpOption();
        if (n && !n.hidden) {
          let r = n.short && e._findOption(n.short);
          let o = n.long && e._findOption(n.long);
          if (!r && !o) {
            t.push(n);
          } else if (n.long && !o) {
            t.push(e.createOption(n.long, n.description));
          } else if (n.short && !r) {
            t.push(e.createOption(n.short, n.description));
          }
        }
        if (this.sortOptions) {
          t.sort(this.compareOptions);
        }
        return t;
      }
      visibleGlobalOptions(e) {
        if (!this.showGlobalOptions) {
          return [];
        }
        let t = [];
        for (let n = e.parent; n; n = n.parent) {
          let r = n.options.filter(o => !o.hidden);
          t.push(...r);
        }
        if (this.sortOptions) {
          t.sort(this.compareOptions);
        }
        return t;
      }
      visibleArguments(e) {
        if (e._argsDescription) {
          e.registeredArguments.forEach(t => {
            t.description = t.description || e._argsDescription[t.name()] || "";
          });
        }
        if (e.registeredArguments.find(t => t.description)) {
          return e.registeredArguments;
        }
        return [];
      }
      subcommandTerm(e) {
        let t = e.registeredArguments.map(n => O_f(n)).join(" ");
        return e._name + (e._aliases[0] ? "|" + e._aliases[0] : "") + (e.options.length ? " [options]" : "") + (t ? " " + t : "");
      }
      optionTerm(e) {
        return e.flags;
      }
      argumentTerm(e) {
        return e.name();
      }
      longestSubcommandTermLength(e, t) {
        return t.visibleCommands(e).reduce((n, r) => Math.max(n, t.subcommandTerm(r).length), 0);
      }
      longestOptionTermLength(e, t) {
        return t.visibleOptions(e).reduce((n, r) => Math.max(n, t.optionTerm(r).length), 0);
      }
      longestGlobalOptionTermLength(e, t) {
        return t.visibleGlobalOptions(e).reduce((n, r) => Math.max(n, t.optionTerm(r).length), 0);
      }
      longestArgumentTermLength(e, t) {
        return t.visibleArguments(e).reduce((n, r) => Math.max(n, t.argumentTerm(r).length), 0);
      }
      commandUsage(e) {
        let t = e._name;
        if (e._aliases[0]) {
          t = t + "|" + e._aliases[0];
        }
        let n = "";
        for (let r = e.parent; r; r = r.parent) {
          n = r.name() + " " + n;
        }
        return n + t + " " + e.usage();
      }
      commandDescription(e) {
        return e.description();
      }
      subcommandDescription(e) {
        return e.summary() || e.description();
      }
      optionDescription(e) {
        let t = [];
        if (e.argChoices) {
          t.push(`choices: ${e.argChoices.map(n => JSON.stringify(n)).join(", ")}`);
        }
        if (e.defaultValue !== undefined) {
          if (e.required || e.optional || e.isBoolean() && typeof e.defaultValue === "boolean") {
            t.push(`default: ${e.defaultValueDescription || JSON.stringify(e.defaultValue)}`);
          }
        }
        if (e.presetArg !== undefined && e.optional) {
          t.push(`preset: ${JSON.stringify(e.presetArg)}`);
        }
        if (e.envVar !== undefined) {
          t.push(`env: ${e.envVar}`);
        }
        if (t.length > 0) {
          return `${e.description} (${t.join(", ")})`;
        }
        return e.description;
      }
      argumentDescription(e) {
        let t = [];
        if (e.argChoices) {
          t.push(`choices: ${e.argChoices.map(n => JSON.stringify(n)).join(", ")}`);
        }
        if (e.defaultValue !== undefined) {
          t.push(`default: ${e.defaultValueDescription || JSON.stringify(e.defaultValue)}`);
        }
        if (t.length > 0) {
          let n = `(${t.join(", ")})`;
          if (e.description) {
            return `${e.description} ${n}`;
          }
          return n;
        }
        return e.description;
      }
      formatHelp(e, t) {
        let n = t.padWidth(e, t);
        let r = t.helpWidth || 80;
        let o = 2;
        let s = 2;
        function i(m, f) {
          if (f) {
            let h = `${m.padEnd(n + 2)}${f}`;
            return t.wrap(h, r - 2, n + 2);
          }
          return m;
        }
        function a(m) {
          return m.join(`
`).replace(/^/gm, " ".repeat(2));
        }
        let l = [`Usage: ${t.commandUsage(e)}`, ""];
        let c = t.commandDescription(e);
        if (c.length > 0) {
          l = l.concat([t.wrap(c, r, 0), ""]);
        }
        let u = t.visibleArguments(e).map(m => i(t.argumentTerm(m), t.argumentDescription(m)));
        if (u.length > 0) {
          l = l.concat(["Arguments:", a(u), ""]);
        }
        let d = t.visibleOptions(e).map(m => i(t.optionTerm(m), t.optionDescription(m)));
        if (d.length > 0) {
          l = l.concat(["Options:", a(d), ""]);
        }
        if (this.showGlobalOptions) {
          let m = t.visibleGlobalOptions(e).map(f => i(t.optionTerm(f), t.optionDescription(f)));
          if (m.length > 0) {
            l = l.concat(["Global Options:", a(m), ""]);
          }
        }
        let p = t.visibleCommands(e).map(m => i(t.subcommandTerm(m), t.subcommandDescription(m)));
        if (p.length > 0) {
          l = l.concat(["Commands:", a(p), ""]);
        }
        return l.join(`
`);
      }
      padWidth(e, t) {
        return Math.max(t.longestOptionTermLength(e, t), t.longestGlobalOptionTermLength(e, t), t.longestSubcommandTermLength(e, t), t.longestArgumentTermLength(e, t));
      }
      wrap(e, t, n, r = 40) {
        let s = new RegExp(`[\\n][${" \\f\\t\\v\xA0\u1680\u2000-\u200A\u202F\u205F\u3000\uFEFF"}]+`);
        if (e.match(s)) {
          return e;
        }
        let i = t - n;
        if (i < r) {
          return e;
        }
        let a = e.slice(0, n);
        let l = e.slice(n).replace(`\r
`, `
`);
        let c = " ".repeat(n);
        let d = `\\s${"\u200B"}`;
        let p = new RegExp(`
|.{1,${i - 1}}([${d}]|$)|[^${d}]+?([${d}]|$)`, "g");
        let m = l.match(p) || [];
        return a + m.map((f, h) => {
          if (f === `
`) {
            return "";
          }
          return (h > 0 ? c : "") + f.trimEnd();
        }).join(`
`);
      }
    }
    ebc.Help = Z_c;
  });
  var tYo = __commonJS(eYo => {
    var {
      InvalidArgumentError: D_f
    } = jnn();
    class tbc {
      constructor(e, t) {
        this.flags = e;
        this.description = t || "";
        this.required = e.includes("<");
        this.optional = e.includes("[");
        this.variadic = /\w\.\.\.[>\]]$/.test(e);
        this.mandatory = false;
        let n = N_f(e);
        if (this.short = n.shortFlag, this.long = n.longFlag, this.negate = false, this.long) {
          this.negate = this.long.startsWith("--no-");
        }
        this.defaultValue = undefined;
        this.defaultValueDescription = undefined;
        this.presetArg = undefined;
        this.envVar = undefined;
        this.parseArg = undefined;
        this.hidden = false;
        this.argChoices = undefined;
        this.conflictsWith = [];
        this.implied = undefined;
      }
      default(e, t) {
        this.defaultValue = e;
        this.defaultValueDescription = t;
        return this;
      }
      preset(e) {
        this.presetArg = e;
        return this;
      }
      conflicts(e) {
        this.conflictsWith = this.conflictsWith.concat(e);
        return this;
      }
      implies(e) {
        let t = e;
        if (typeof e === "string") {
          t = {
            [e]: true
          };
        }
        this.implied = Object.assign(this.implied || {}, t);
        return this;
      }
      env(e) {
        this.envVar = e;
        return this;
      }
      argParser(e) {
        this.parseArg = e;
        return this;
      }
      makeOptionMandatory(e = true) {
        this.mandatory = !!e;
        return this;
      }
      hideHelp(e = true) {
        this.hidden = !!e;
        return this;
      }
      _concatValue(e, t) {
        if (t === this.defaultValue || !Array.isArray(t)) {
          return [e];
        }
        return t.concat(e);
      }
      choices(e) {
        this.argChoices = e.slice();
        this.parseArg = (t, n) => {
          if (!this.argChoices.includes(t)) {
            throw new D_f(`Allowed choices are ${this.argChoices.join(", ")}.`);
          }
          if (this.variadic) {
            return this._concatValue(t, n);
          }
          return t;
        };
        return this;
      }
      name() {
        if (this.long) {
          return this.long.replace(/^--/, "");
        }
        return this.short.replace(/^-/, "");
      }
      attributeName() {
        return M_f(this.name().replace(/^no-/, ""));
      }
      is(e) {
        return this.short === e || this.long === e;
      }
      isBoolean() {
        return !this.required && !this.optional && !this.negate;
      }
    }
    class nbc {
      constructor(e) {
        this.positiveOptions = new Map();
        this.negativeOptions = new Map();
        this.dualOptions = new Set();
        e.forEach(t => {
          if (t.negate) {
            this.negativeOptions.set(t.attributeName(), t);
          } else {
            this.positiveOptions.set(t.attributeName(), t);
          }
        });
        this.negativeOptions.forEach((t, n) => {
          if (this.positiveOptions.vZc(n)) {
            this.dualOptions.add(n);
          }
        });
      }
      valueFromOption(e, t) {
        let n = t.attributeName();
        if (!this.dualOptions.vZc(n)) {
          return true;
        }
        let r = this.negativeOptions.get(n).presetArg;
        let o = r !== undefined ? r : false;
        return t.negate === (o === e);
      }
    }
    function M_f(e) {
      return e.split("-").reduce((t, n) => t + n[0].toUpperCase() + n.slice(1));
    }
    function N_f(e) {
      let t;
      let n;
      let r = e.split(/[ |,]+/);
      if (r.length > 1 && !/^[[<]/.test(r[1])) {
        t = r.shift();
      }
      if (n = r.shift(), !t && /^-[^-]$/.test(n)) {
        t = n;
        n = undefined;
      }
      return {
        shortFlag: t,
        longFlag: n
      };
    }
    eYo.Option = tbc;
    eYo.DualOptions = nbc;
  });
  var obc = __commonJS(rbc => {
    function L_f(e, t) {
      if (Math.abs(e.length - t.length) > 3) {
        return Math.max(e.length, t.length);
      }
      let n = [];
      for (let r = 0; r <= e.length; r++) {
        n[r] = [r];
      }
      for (let r = 0; r <= t.length; r++) {
        n[0][r] = r;
      }
      for (let r = 1; r <= t.length; r++) {
        for (let o = 1; o <= e.length; o++) {
          let s = 1;
          if (e[o - 1] === t[r - 1]) {
            s = 0;
          } else {
            s = 1;
          }
          if (n[o][r] = Math.min(n[o - 1][r] + 1, n[o][r - 1] + 1, n[o - 1][r - 1] + s), o > 1 && r > 1 && e[o - 1] === t[r - 2] && e[o - 2] === t[r - 1]) {
            n[o][r] = Math.min(n[o][r], n[o - 2][r - 2] + 1);
          }
        }
      }
      return n[e.length][t.length];
    }
    function F_f(e, t) {
      if (!t || t.length === 0) {
        return "";
      }
      t = Array.from(new Set(t));
      let n = e.startsWith("--");
      if (n) {
        e = e.slice(2);
        t = t.map(i => i.slice(2));
      }
      let r = [];
      let o = 3;
      let s = 0.4;
      if (t.forEach(i => {
        if (i.length <= 1) {
          return;
        }
        let a = L_f(e, i);
        let l = Math.max(e.length, i.length);
        if ((l - a) / l > s) {
          if (a < o) {
            o = a;
            r = [i];
          } else if (a === o) {
            r.push(i);
          }
        }
      }), r.sort((i, a) => i.localeCompare(a)), n) {
        r = r.map(i => `--${i}`);
      }
      if (r.length > 1) {
        return `
(Did you mean one of ${r.join(", ")}?)`;
      }
      if (r.length === 1) {
        return `
(Did you mean ${r[0]}?)`;
      }
      return "";
    }
    rbc.suggestSimilar = F_f;
  });
  var cbc = __commonJS(lbc => {
    var U_f = require("events").EventEmitter;
    var nYo = require("child_process");
    var BCe = require("path");
    var rYo = require("fs");
    var z0 = require("process");
    var {
      Argument: B_f,
      humanReadableArgName: $_f
    } = Zmr();
    var {
      CommanderError: oYo
    } = jnn();
    var {
      Help: H_f
    } = Z7o();
    var {
      Option: sbc,
      DualOptions: j_f
    } = tYo();
    var {
      suggestSimilar: ibc
    } = obc();
    class sYo extends U_f {
      constructor(e) {
        super();
        this.commands = [];
        this.options = [];
        this.parent = null;
        this._allowUnknownOption = false;
        this._allowExcessArguments = true;
        this.registeredArguments = [];
        this._args = this.registeredArguments;
        this.args = [];
        this.rawArgs = [];
        this.processedArgs = [];
        this._scriptPath = null;
        this._name = e || "";
        this._optionValues = {};
        this._optionValueSources = {};
        this._storeOptionsAsProperties = false;
        this._actionHandler = null;
        this._executableHandler = false;
        this._executableFile = null;
        this._executableDir = null;
        this._defaultCommandName = null;
        this._exitCallback = null;
        this._aliases = [];
        this._combineFlagAndOptionalValue = true;
        this._description = "";
        this._summary = "";
        this._argsDescription = undefined;
        this._enablePositionalOptions = false;
        this._passThroughOptions = false;
        this._lifeCycleHooks = {};
        this._showHelpAfterError = false;
        this._showSuggestionAfterError = true;
        this._outputConfiguration = {
          writeOut: t => z0.stdout.write(t),
          writeErr: t => z0.stderr.write(t),
          getOutHelpWidth: () => z0.stdout.isTTY ? z0.stdout.columns : undefined,
          getErrHelpWidth: () => z0.stderr.isTTY ? z0.stderr.columns : undefined,
          outputError: (t, n) => n(t)
        };
        this._hidden = false;
        this._helpOption = undefined;
        this._addImplicitHelpCommand = undefined;
        this._helpCommand = undefined;
        this._helpConfiguration = {};
      }
      copyInheritedSettings(e) {
        this._outputConfiguration = e._outputConfiguration;
        this._helpOption = e._helpOption;
        this._helpCommand = e._helpCommand;
        this._helpConfiguration = e._helpConfiguration;
        this._exitCallback = e._exitCallback;
        this._storeOptionsAsProperties = e._storeOptionsAsProperties;
        this._combineFlagAndOptionalValue = e._combineFlagAndOptionalValue;
        this._allowExcessArguments = e._allowExcessArguments;
        this._enablePositionalOptions = e._enablePositionalOptions;
        this._showHelpAfterError = e._showHelpAfterError;
        this._showSuggestionAfterError = e._showSuggestionAfterError;
        return this;
      }
      _getCommandAndAncestors() {
        let e = [];
        for (let t = this; t; t = t.parent) {
          e.push(t);
        }
        return e;
      }
      command(e, t, n) {
        let r = t;
        let o = n;
        if (typeof r === "object" && r !== null) {
          o = r;
          r = null;
        }
        o = o || {};
        let [, s, i] = e.match(/([^ ]+) *(.*)/);
        let a = this.createCommand(s);
        if (r) {
          a.description(r);
          a._executableHandler = true;
        }
        if (o.isDefault) {
          this._defaultCommandName = a._name;
        }
        if (a._hidden = !!(o.noHelp || o.hidden), a._executableFile = o.executableFile || null, i) {
          a.arguments(i);
        }
        if (this._registerCommand(a), a.parent = this, a.copyInheritedSettings(this), r) {
          return this;
        }
        return a;
      }
      createCommand(e) {
        return new sYo(e);
      }
      createHelp() {
        return Object.assign(new H_f(), this.configureHelp());
      }
      configureHelp(e) {
        if (e === undefined) {
          return this._helpConfiguration;
        }
        this._helpConfiguration = e;
        return this;
      }
      configureOutput(e) {
        if (e === undefined) {
          return this._outputConfiguration;
        }
        Object.assign(this._outputConfiguration, e);
        return this;
      }
      showHelpAfterError(e = true) {
        if (typeof e !== "string") {
          e = !!e;
        }
        this._showHelpAfterError = e;
        return this;
      }
      showSuggestionAfterError(e = true) {
        this._showSuggestionAfterError = !!e;
        return this;
      }
      addCommand(e, t) {
        if (!e._name) {
          throw Error(`Command passed to .addCommand() must have a name
- specify the name in Command constructor or using .name()`);
        }
        if (t = t || {}, t.isDefault) {
          this._defaultCommandName = e._name;
        }
        if (t.noHelp || t.hidden) {
          e._hidden = true;
        }
        this._registerCommand(e);
        e.parent = this;
        e._checkForBrokenPassThrough();
        return this;
      }
      createArgument(e, t) {
        return new B_f(e, t);
      }
      argument(e, t, n, r) {
        let o = this.createArgument(e, t);
        if (typeof n === "function") {
          o.default(r).argParser(n);
        } else {
          o.default(n);
        }
        this.addArgument(o);
        return this;
      }
      arguments(e) {
        e.trim().split(/ +/).forEach(t => {
          this.argument(t);
        });
        return this;
      }
      addArgument(e) {
        let t = this.registeredArguments.slice(-1)[0];
        if (t && t.variadic) {
          throw Error(`only the last argument can be variadic '${t.name()}'`);
        }
        if (e.required && e.defaultValue !== undefined && e.parseArg === undefined) {
          throw Error(`a default value for a required argument is never used: '${e.name()}'`);
        }
        this.registeredArguments.push(e);
        return this;
      }
      helpCommand(e, t) {
        if (typeof e === "boolean") {
          this._addImplicitHelpCommand = e;
          return this;
        }
        e = e ?? "help [command]";
        let [, n, r] = e.match(/([^ ]+) *(.*)/);
        let o = t ?? "display help for command";
        let s = this.createCommand(n);
        if (s.helpOption(false), r) {
          s.arguments(r);
        }
        if (o) {
          s.description(o);
        }
        this._addImplicitHelpCommand = true;
        this._helpCommand = s;
        return this;
      }
      addHelpCommand(e, t) {
        if (typeof e !== "object") {
          this.helpCommand(e, t);
          return this;
        }
        this._addImplicitHelpCommand = true;
        this._helpCommand = e;
        return this;
      }
      _getHelpCommand() {
        if (this._addImplicitHelpCommand ?? (this.commands.length && !this._actionHandler && !this._findCommand("help"))) {
          if (this._helpCommand === undefined) {
            this.helpCommand(undefined, undefined);
          }
          return this._helpCommand;
        }
        return null;
      }
      hook(e, t) {
        let n = ["preSubcommand", "preAction", "postAction"];
        if (!n.includes(e)) {
          throw Error(`Unexpected value for event passed to hook : '${e}'.
Expecting one of '${n.join("', '")}'`);
        }
        if (this._lifeCycleHooks[e]) {
          this._lifeCycleHooks[e].push(t);
        } else {
          this._lifeCycleHooks[e] = [t];
        }
        return this;
      }
      exitOverride(e) {
        if (e) {
          this._exitCallback = e;
        } else {
          this._exitCallback = t => {
            if (t.code !== "commander.executeSubCommandAsync") {
              throw t;
            }
          };
        }
        return this;
      }
      _exit(e, t, n) {
        if (this._exitCallback) {
          this._exitCallback(new oYo(e, t, n));
        }
        z0.exit(e);
      }
      action(e) {
        let t = n => {
          let r = this.registeredArguments.length;
          let o = n.slice(0, r);
          if (this._storeOptionsAsProperties) {
            o[r] = this;
          } else {
            o[r] = this.opts();
          }
          o.push(this);
          return e.apply(this, o);
        };
        this._actionHandler = t;
        return this;
      }
      createOption(e, t) {
        return new sbc(e, t);
      }
      _callParseArg(e, t, n, r) {
        try {
          return e.parseArg(t, n);
        } catch (o) {
          if (o.code === "commander.invalidArgument") {
            let s = `${r} ${o.message}`;
            this.error(s, {
              exitCode: o.exitCode,
              code: o.code
            });
          }
          throw o;
        }
      }
      _registerOption(e) {
        let t = e.short && this._findOption(e.short) || e.long && this._findOption(e.long);
        if (t) {
          let n = e.long && this._findOption(e.long) ? e.long : e.short;
          throw Error(`Cannot add option '${e.flags}'${this._name && ` to command '${this._name}'`} due to conflicting flag '${n}'
-  already used by option '${t.flags}'`);
        }
        this.options.push(e);
      }
      _registerCommand(e) {
        let t = r => [r.name()].concat(r.aliases());
        let n = t(e).find(r => this._findCommand(r));
        if (n) {
          let r = t(this._findCommand(n)).join("|");
          let o = t(e).join("|");
          throw Error(`cannot add command '${o}' as already have command '${r}'`);
        }
        this.commands.push(e);
      }
      addOption(e) {
        this._registerOption(e);
        let t = e.name();
        let n = e.attributeName();
        if (e.negate) {
          let o = e.long.replace(/^--no-/, "--");
          if (!this._findOption(o)) {
            this.setOptionValueWithSource(n, e.defaultValue === undefined ? true : e.defaultValue, "default");
          }
        } else if (e.defaultValue !== undefined) {
          this.setOptionValueWithSource(n, e.defaultValue, "default");
        }
        let r = (o, s, i) => {
          if (o == null && e.presetArg !== undefined) {
            o = e.presetArg;
          }
          let a = this.getOptionValue(n);
          if (o !== null && e.parseArg) {
            o = this._callParseArg(e, o, a, s);
          } else if (o !== null && e.variadic) {
            o = e._concatValue(o, a);
          }
          if (o == null) {
            if (e.negate) {
              o = false;
            } else if (e.isBoolean() || e.optional) {
              o = true;
            } else {
              o = "";
            }
          }
          this.setOptionValueWithSource(n, o, i);
        };
        if (this.on("option:" + t, o => {
          let s = `error: option '${e.flags}' argument '${o}' is invalid.`;
          r(o, s, "cli");
        }), e.envVar) {
          this.on("optionEnv:" + t, o => {
            let s = `error: option '${e.flags}' value '${o}' from env '${e.envVar}' is invalid.`;
            r(o, s, "env");
          });
        }
        return this;
      }
      _optionEx(e, t, n, r, o) {
        if (typeof t === "object" && t instanceof sbc) {
          throw Error("To add an Option object use addOption() instead of option() or requiredOption()");
        }
        let s = this.createOption(t, n);
        if (s.makeOptionMandatory(!!e.mandatory), typeof r === "function") {
          s.default(o).argParser(r);
        } else if (r instanceof RegExp) {
          let i = r;
          r = (a, l) => {
            let c = i.exec(a);
            return c ? c[0] : l;
          };
          s.default(o).argParser(r);
        } else {
          s.default(r);
        }
        return this.addOption(s);
      }
      option(e, t, n, r) {
        return this._optionEx({}, e, t, n, r);
      }
      requiredOption(e, t, n, r) {
        return this._optionEx({
          mandatory: true
        }, e, t, n, r);
      }
      combineFlagAndOptionalValue(e = true) {
        this._combineFlagAndOptionalValue = !!e;
        return this;
      }
      allowUnknownOption(e = true) {
        this._allowUnknownOption = !!e;
        return this;
      }
      allowExcessArguments(e = true) {
        this._allowExcessArguments = !!e;
        return this;
      }
      enablePositionalOptions(e = true) {
        this._enablePositionalOptions = !!e;
        return this;
      }
      passThroughOptions(e = true) {
        this._passThroughOptions = !!e;
        this._checkForBrokenPassThrough();
        return this;
      }
      _checkForBrokenPassThrough() {
        if (this.parent && this._passThroughOptions && !this.parent._enablePositionalOptions) {
          throw Error(`passThroughOptions cannot be used for '${this._name}' without turning on enablePositionalOptions for parent command(s)`);
        }
      }
      storeOptionsAsProperties(e = true) {
        if (this.options.length) {
          throw Error("call .storeOptionsAsProperties() before adding options");
        }
        if (Object.keys(this._optionValues).length) {
          throw Error("call .storeOptionsAsProperties() before setting option values");
        }
        this._storeOptionsAsProperties = !!e;
        return this;
      }
      getOptionValue(e) {
        if (this._storeOptionsAsProperties) {
          return this[e];
        }
        return this._optionValues[e];
      }
      setOptionValue(e, t) {
        return this.setOptionValueWithSource(e, t, undefined);
      }
      setOptionValueWithSource(e, t, n) {
        if (this._storeOptionsAsProperties) {
          this[e] = t;
        } else {
          this._optionValues[e] = t;
        }
        this._optionValueSources[e] = n;
        return this;
      }
      getOptionValueSource(e) {
        return this._optionValueSources[e];
      }
      getOptionValueSourceWithGlobals(e) {
        let t;
        this._getCommandAndAncestors().forEach(n => {
          if (n.getOptionValueSource(e) !== undefined) {
            t = n.getOptionValueSource(e);
          }
        });
        return t;
      }
      _prepareUserArgs(e, t) {
        if (e !== undefined && !Array.isArray(e)) {
          throw Error("first parameter to parse must be array or undefined");
        }
        if (t = t || {}, e === undefined && t.from === undefined) {
          if (z0.versions?.electron) {
            t.from = "electron";
          }
          let r = z0.execArgv ?? [];
          if (r.includes("-e") || r.includes("--eval") || r.includes("-p") || r.includes("--print")) {
            t.from = "eval";
          }
        }
        if (e === undefined) {
          e = z0.argv;
        }
        this.rawArgs = e.slice();
        let n;
        switch (t.from) {
          case undefined:
          case "node":
            this._scriptPath = e[1];
            n = e.slice(2);
            break;
          case "electron":
            if (z0.defaultApp) {
              this._scriptPath = e[1];
              n = e.slice(2);
            } else {
              n = e.slice(1);
            }
            break;
          case "user":
            n = e.slice(0);
            break;
          case "eval":
            n = e.slice(1);
            break;
          default:
            throw Error(`unexpected parse option { from: '${t.from}' }`);
        }
        if (!this._name && this._scriptPath) {
          this.nameFromFilename(this._scriptPath);
        }
        this._name = this._name || "program";
        return n;
      }
      parse(e, t) {
        let n = this._prepareUserArgs(e, t);
        this._parseCommand([], n);
        return this;
      }
      async parseAsync(e, t) {
        let n = this._prepareUserArgs(e, t);
        await this._parseCommand([], n);
        return this;
      }
      _executeSubCommand(e, t) {
        t = t.slice();
        let n = false;
        let r = [".js", ".ts", ".tsx", ".mjs", ".cjs"];
        function o(c, u) {
          let d = BCe.resolve(c, u);
          if (rYo.existsSync(d)) {
            return d;
          }
          if (r.includes(BCe.extname(u))) {
            return;
          }
          let p = r.find(m => rYo.existsSync(`${d}${m}`));
          if (p) {
            return `${d}${p}`;
          }
          return;
        }
        this._checkForMissingMandatoryOptions();
        this._checkForConflictingOptions();
        let s = e._executableFile || `${this._name}-${e._name}`;
        let i = this._executableDir || "";
        if (this._scriptPath) {
          let c;
          try {
            c = rYo.realpathSync(this._scriptPath);
          } catch (u) {
            c = this._scriptPath;
          }
          i = BCe.resolve(BCe.dirname(c), i);
        }
        if (i) {
          let c = o(i, s);
          if (!c && !e._executableFile && this._scriptPath) {
            let u = BCe.basename(this._scriptPath, BCe.extname(this._scriptPath));
            if (u !== this._name) {
              c = o(i, `${u}-${e._name}`);
            }
          }
          s = c || s;
        }
        n = r.includes(BCe.extname(s));
        let a;
        if (z0.platform !== "win32") {
          if (n) {
            t.unshift(s);
            t = abc(z0.execArgv).concat(t);
            a = nYo.spawn(z0.argv[0], t, {
              stdio: "inherit"
            });
          } else {
            a = nYo.spawn(s, t, {
              stdio: "inherit"
            });
          }
        } else {
          t.unshift(s);
          t = abc(z0.execArgv).concat(t);
          a = nYo.spawn(z0.execPath, t, {
            stdio: "inherit"
          });
        }
        if (!a.killed) {
          ["SIGUSR1", "SIGUSR2", "SIGTERM", "SIGINT", "SIGHUP"].forEach(u => {
            z0.on(u, () => {
              if (a.killed === false && a.exitCode === null) {
                a.kill(u);
              }
            });
          });
        }
        let l = this._exitCallback;
        a.on("close", c => {
          if (c = c ?? 1, !l) {
            z0.exit(c);
          } else {
            l(new oYo(c, "commander.executeSubCommandAsync", "(close)"));
          }
        });
        a.on("error", c => {
          if (c.code === "ENOENT") {
            let u = i ? `searched for local subcommand relative to directory '${i}'` : "no directory for search for local subcommand, use .executableDir() to supply a custom directory";
            let d = `'${s}' does not exist
 - if '${e._name}' is not meant to be an executable command, remove description parameter from '.command()' and use '.description()' instead
 - if the default executable name is not suitable, use the executableFile option to supply a custom name or path
 - ${u}`;
            throw Error(d);
          } else if (c.code === "EACCES") {
            throw Error(`'${s}' not executable`);
          }
          if (!l) {
            z0.exit(1);
          } else {
            let u = new oYo(1, "commander.executeSubCommandAsync", "(error)");
            u.nestedError = c;
            l(u);
          }
        });
        this.runningCommand = a;
      }
      _dispatchSubcommand(e, t, n) {
        let r = this._findCommand(e);
        if (!r) {
          this.help({
            error: true
          });
        }
        let o;
        o = this._chainOrCallSubCommandHook(o, r, "preSubcommand");
        o = this._chainOrCall(o, () => {
          if (r._executableHandler) {
            this._executeSubCommand(r, t.concat(n));
          } else {
            return r._parseCommand(t, n);
          }
        });
        return o;
      }
      _dispatchHelpCommand(e) {
        if (!e) {
          this.help();
        }
        let t = this._findCommand(e);
        if (t && !t._executableHandler) {
          t.help();
        }
        return this._dispatchSubcommand(e, [], [this._getHelpOption()?.long ?? this._getHelpOption()?.short ?? "--help"]);
      }
      _checkNumberOfArguments() {
        if (this.registeredArguments.forEach((e, t) => {
          if (e.required && this.args[t] == null) {
            this.missingArgument(e.name());
          }
        }), this.registeredArguments.length > 0 && this.registeredArguments[this.registeredArguments.length - 1].variadic) {
          return;
        }
        if (this.args.length > this.registeredArguments.length) {
          this._excessArguments(this.args);
        }
      }
      _processArguments() {
        let e = (n, r, o) => {
          let s = r;
          if (r !== null && n.parseArg) {
            let i = `error: command-argument value '${r}' is invalid for argument '${n.name()}'.`;
            s = this._callParseArg(n, r, o, i);
          }
          return s;
        };
        this._checkNumberOfArguments();
        let t = [];
        this.registeredArguments.forEach((n, r) => {
          let o = n.defaultValue;
          if (n.variadic) {
            if (r < this.args.length) {
              if (o = this.args.slice(r), n.parseArg) {
                o = o.reduce((s, i) => e(n, i, s), n.defaultValue);
              }
            } else if (o === undefined) {
              o = [];
            }
          } else if (r < this.args.length) {
            if (o = this.args[r], n.parseArg) {
              o = e(n, o, n.defaultValue);
            }
          }
          t[r] = o;
        });
        this.processedArgs = t;
      }
      _chainOrCall(e, t) {
        if (e && e.then && typeof e.then === "function") {
          return e.then(() => t());
        }
        return t();
      }
      _chainOrCallHooks(e, t) {
        let n = e;
        let r = [];
        if (this._getCommandAndAncestors().reverse().filter(o => o._lifeCycleHooks[t] !== undefined).forEach(o => {
          o._lifeCycleHooks[t].forEach(s => {
            r.push({
              hookedCommand: o,
              callback: s
            });
          });
        }), t === "postAction") {
          r.reverse();
        }
        r.forEach(o => {
          n = this._chainOrCall(n, () => o.callback(o.hookedCommand, this));
        });
        return n;
      }
      _chainOrCallSubCommandHook(e, t, n) {
        let r = e;
        if (this._lifeCycleHooks[n] !== undefined) {
          this._lifeCycleHooks[n].forEach(o => {
            r = this._chainOrCall(r, () => o(this, t));
          });
        }
        return r;
      }
      _parseCommand(e, t) {
        let n = this.parseOptions(t);
        if (this._parseOptionsEnv(), this._parseOptionsImplied(), e = e.concat(n.operands), t = n.unknown, this.args = e.concat(t), e && this._findCommand(e[0])) {
          return this._dispatchSubcommand(e[0], e.slice(1), t);
        }
        if (this._getHelpCommand() && e[0] === this._getHelpCommand().name()) {
          return this._dispatchHelpCommand(e[1]);
        }
        if (this._defaultCommandName) {
          this._outputHelpIfRequested(t);
          return this._dispatchSubcommand(this._defaultCommandName, e, t);
        }
        if (this.commands.length && this.args.length === 0 && !this._actionHandler && !this._defaultCommandName) {
          this.help({
            error: true
          });
        }
        this._outputHelpIfRequested(n.unknown);
        this._checkForMissingMandatoryOptions();
        this._checkForConflictingOptions();
        let r = () => {
          if (n.unknown.length > 0) {
            this.unknownOption(n.unknown[0]);
          }
        };
        let o = `command:${this.name()}`;
        if (this._actionHandler) {
          r();
          this._processArguments();
          let s;
          if (s = this._chainOrCallHooks(s, "preAction"), s = this._chainOrCall(s, () => this._actionHandler(this.processedArgs)), this.parent) {
            s = this._chainOrCall(s, () => {
              this.parent.emit(o, e, t);
            });
          }
          s = this._chainOrCallHooks(s, "postAction");
          return s;
        }
        if (this.parent && this.parent.listenerCount(o)) {
          r();
          this._processArguments();
          this.parent.emit(o, e, t);
        } else if (e.length) {
          if (this._findCommand("*")) {
            return this._dispatchSubcommand("*", e, t);
          }
          if (this.listenerCount("command:*")) {
            this.emit("command:*", e, t);
          } else if (this.commands.length) {
            this.unknownCommand();
          } else {
            r();
            this._processArguments();
          }
        } else if (this.commands.length) {
          r();
          this.help({
            error: true
          });
        } else {
          r();
          this._processArguments();
        }
      }
      _findCommand(e) {
        if (!e) {
          return;
        }
        return this.commands.find(t => t._name === e || t._aliases.includes(e));
      }
      _findOption(e) {
        return this.options.find(t => t.is(e));
      }
      _checkForMissingMandatoryOptions() {
        this._getCommandAndAncestors().forEach(e => {
          e.options.forEach(t => {
            if (t.mandatory && e.getOptionValue(t.attributeName()) === undefined) {
              e.missingMandatoryOptionValue(t);
            }
          });
        });
      }
      _checkForConflictingLocalOptions() {
        let e = this.options.filter(n => {
          let r = n.attributeName();
          if (this.getOptionValue(r) === undefined) {
            return false;
          }
          return this.getOptionValueSource(r) !== "default";
        });
        e.filter(n => n.conflictsWith.length > 0).forEach(n => {
          let r = e.find(o => n.conflictsWith.includes(o.attributeName()));
          if (r) {
            this._conflictingOption(n, r);
          }
        });
      }
      _checkForConflictingOptions() {
        this._getCommandAndAncestors().forEach(e => {
          e._checkForConflictingLocalOptions();
        });
      }
      parseOptions(e) {
        let t = [];
        let n = [];
        let r = t;
        let o = e.slice();
        function s(a) {
          return a.length > 1 && a[0] === "-";
        }
        let i = null;
        while (o.length) {
          let a = o.shift();
          if (a === "--") {
            if (r === n) {
              r.push(a);
            }
            r.push(...o);
            break;
          }
          if (i && !s(a)) {
            this.emit(`option:${i.name()}`, a);
            continue;
          }
          if (i = null, s(a)) {
            let l = this._findOption(a);
            if (l) {
              if (l.required) {
                let c = o.shift();
                if (c === undefined) {
                  this.optionMissingArgument(l);
                }
                this.emit(`option:${l.name()}`, c);
              } else if (l.optional) {
                let c = null;
                if (o.length > 0 && !s(o[0])) {
                  c = o.shift();
                }
                this.emit(`option:${l.name()}`, c);
              } else {
                this.emit(`option:${l.name()}`);
              }
              i = l.variadic ? l : null;
              continue;
            }
          }
          if (a.length > 2 && a[0] === "-" && a[1] !== "-") {
            let l = this._findOption(`-${a[1]}`);
            if (l) {
              if (l.required || l.optional && this._combineFlagAndOptionalValue) {
                this.emit(`option:${l.name()}`, a.slice(2));
              } else {
                this.emit(`option:${l.name()}`);
                o.unshift(`-${a.slice(2)}`);
              }
              continue;
            }
          }
          if (/^--[^=]+=/.test(a)) {
            let l = a.indexOf("=");
            let c = this._findOption(a.slice(0, l));
            if (c && (c.required || c.optional)) {
              this.emit(`option:${c.name()}`, a.slice(l + 1));
              continue;
            }
          }
          if (s(a)) {
            r = n;
          }
          if ((this._enablePositionalOptions || this._passThroughOptions) && t.length === 0 && n.length === 0) {
            if (this._findCommand(a)) {
              if (t.push(a), o.length > 0) {
                n.push(...o);
              }
              break;
            } else if (this._getHelpCommand() && a === this._getHelpCommand().name()) {
              if (t.push(a), o.length > 0) {
                t.push(...o);
              }
              break;
            } else if (this._defaultCommandName) {
              if (n.push(a), o.length > 0) {
                n.push(...o);
              }
              break;
            }
          }
          if (this._passThroughOptions) {
            if (r.push(a), o.length > 0) {
              r.push(...o);
            }
            break;
          }
          r.push(a);
        }
        return {
          operands: t,
          unknown: n
        };
      }
      opts() {
        if (this._storeOptionsAsProperties) {
          let e = {};
          let t = this.options.length;
          for (let n = 0; n < t; n++) {
            let r = this.options[n].attributeName();
            e[r] = r === this._versionOptionName ? this._version : this[r];
          }
          return e;
        }
        return this._optionValues;
      }
      optsWithGlobals() {
        return this._getCommandAndAncestors().reduce((e, t) => Object.assign(e, t.opts()), {});
      }
      error(e, t) {
        if (this._outputConfiguration.outputError(`${e}
`, this._outputConfiguration.writeErr), typeof this._showHelpAfterError === "string") {
          this._outputConfiguration.writeErr(`${this._showHelpAfterError}
`);
        } else if (this._showHelpAfterError) {
          this._outputConfiguration.writeErr(`
`);
          this.outputHelp({
            error: true
          });
        }
        let n = t || {};
        let r = n.exitCode || 1;
        let o = n.code || "commander.error";
        this._exit(r, o, e);
      }
      _parseOptionsEnv() {
        this.options.forEach(e => {
          if (e.envVar && e.envVar in z0.env) {
            let t = e.attributeName();
            if (this.getOptionValue(t) === undefined || ["default", "config", "env"].includes(this.getOptionValueSource(t))) {
              if (e.required || e.optional) {
                this.emit(`optionEnv:${e.name()}`, z0.env[e.envVar]);
              } else {
                this.emit(`optionEnv:${e.name()}`);
              }
            }
          }
        });
      }
      _parseOptionsImplied() {
        let e = new j_f(this.options);
        let t = n => this.getOptionValue(n) !== undefined && !["default", "implied"].includes(this.getOptionValueSource(n));
        this.options.filter(n => n.implied !== undefined && t(n.attributeName()) && e.valueFromOption(this.getOptionValue(n.attributeName()), n)).forEach(n => {
          Object.keys(n.implied).filter(r => !t(r)).forEach(r => {
            this.setOptionValueWithSource(r, n.implied[r], "implied");
          });
        });
      }
      missingArgument(e) {
        let t = `error: missing required argument '${e}'`;
        this.error(t, {
          code: "commander.missingArgument"
        });
      }
      optionMissingArgument(e) {
        let t = `error: option '${e.flags}' argument missing`;
        this.error(t, {
          code: "commander.optionMissingArgument"
        });
      }
      missingMandatoryOptionValue(e) {
        let t = `error: required option '${e.flags}' not specified`;
        this.error(t, {
          code: "commander.missingMandatoryOptionValue"
        });
      }
      _conflictingOption(e, t) {
        let n = s => {
          let i = s.attributeName();
          let a = this.getOptionValue(i);
          let l = this.options.find(u => u.negate && i === u.attributeName());
          let c = this.options.find(u => !u.negate && i === u.attributeName());
          if (l && (l.presetArg === undefined && a === false || l.presetArg !== undefined && a === l.presetArg)) {
            return l;
          }
          return c || s;
        };
        let r = s => {
          let i = n(s);
          let a = i.attributeName();
          if (this.getOptionValueSource(a) === "env") {
            return `environment variable '${i.envVar}'`;
          }
          return `option '${i.flags}'`;
        };
        let o = `error: ${r(e)} cannot be used with ${r(t)}`;
        this.error(o, {
          code: "commander.conflictingOption"
        });
      }
      unknownOption(e) {
        if (this._allowUnknownOption) {
          return;
        }
        let t = "";
        if (e.startsWith("--") && this._showSuggestionAfterError) {
          let r = [];
          let o = this;
          do {
            let s = o.createHelp().visibleOptions(o).filter(i => i.long).map(i => i.long);
            r = r.concat(s);
            o = o.parent;
          } while (o && !o._enablePositionalOptions);
          t = ibc(e, r);
        }
        let n = `error: unknown option '${e}'${t}`;
        this.error(n, {
          code: "commander.unknownOption"
        });
      }
      _excessArguments(e) {
        if (this._allowExcessArguments) {
          return;
        }
        let t = this.registeredArguments.length;
        let n = t === 1 ? "" : "s";
        let o = `error: too many arguments${this.parent ? ` for '${this.name()}'` : ""}. Expected ${t} argument${n} but got ${e.length}.`;
        this.error(o, {
          code: "commander.excessArguments"
        });
      }
      unknownCommand() {
        let e = this.args[0];
        let t = "";
        if (this._showSuggestionAfterError) {
          let r = [];
          this.createHelp().visibleCommands(this).forEach(o => {
            if (r.push(o.name()), o.alias()) {
              r.push(o.alias());
            }
          });
          t = ibc(e, r);
        }
        let n = `error: unknown command '${e}'${t}`;
        this.error(n, {
          code: "commander.unknownCommand"
        });
      }
      version(e, t, n) {
        if (e === undefined) {
          return this._version;
        }
        this._version = e;
        t = t || "-V, --version";
        n = n || "output the version number";
        let r = this.createOption(t, n);
        this._versionOptionName = r.attributeName();
        this._registerOption(r);
        this.on("option:" + r.name(), () => {
          this._outputConfiguration.writeOut(`${e}
`);
          this._exit(0, "commander.version", e);
        });
        return this;
      }
      description(e, t) {
        if (e === undefined && t === undefined) {
          return this._description;
        }
        if (this._description = e, t) {
          this._argsDescription = t;
        }
        return this;
      }
      summary(e) {
        if (e === undefined) {
          return this._summary;
        }
        this._summary = e;
        return this;
      }
      alias(e) {
        if (e === undefined) {
          return this._aliases[0];
        }
        let t = this;
        if (this.commands.length !== 0 && this.commands[this.commands.length - 1]._executableHandler) {
          t = this.commands[this.commands.length - 1];
        }
        if (e === t._name) {
          throw Error("Command alias can't be the same as its name");
        }
        let n = this.parent?._findCommand(e);
        if (n) {
          let r = [n.name()].concat(n.aliases()).join("|");
          throw Error(`cannot add alias '${e}' to command '${this.name()}' as already have command '${r}'`);
        }
        t._aliases.push(e);
        return this;
      }
      aliases(e) {
        if (e === undefined) {
          return this._aliases;
        }
        e.forEach(t => this.alias(t));
        return this;
      }
      usage(e) {
        if (e === undefined) {
          if (this._usage) {
            return this._usage;
          }
          let t = this.registeredArguments.map(n => $_f(n));
          return [].concat(this.options.length || this._helpOption !== null ? "[options]" : [], this.commands.length ? "[command]" : [], this.registeredArguments.length ? t : []).join(" ");
        }
        this._usage = e;
        return this;
      }
      name(e) {
        if (e === undefined) {
          return this._name;
        }
        this._name = e;
        return this;
      }
      nameFromFilename(e) {
        this._name = BCe.basename(e, BCe.extname(e));
        return this;
      }
      executableDir(e) {
        if (e === undefined) {
          return this._executableDir;
        }
        this._executableDir = e;
        return this;
      }
      helpInformation(e) {
        let t = this.createHelp();
        if (t.helpWidth === undefined) {
          t.helpWidth = e && e.error ? this._outputConfiguration.getErrHelpWidth() : this._outputConfiguration.getOutHelpWidth();
        }
        return t.formatHelp(this, t);
      }
      _getHelpContext(e) {
        e = e || {};
        let t = {
          error: !!e.error
        };
        let n;
        if (t.error) {
          n = r => this._outputConfiguration.writeErr(r);
        } else {
          n = r => this._outputConfiguration.writeOut(r);
        }
        t.write = e.write || n;
        t.command = this;
        return t;
      }
      outputHelp(e) {
        let t;
        if (typeof e === "function") {
          t = e;
          e = undefined;
        }
        let n = this._getHelpContext(e);
        this._getCommandAndAncestors().reverse().forEach(o => o.emit("beforeAllHelp", n));
        this.emit("beforeHelp", n);
        let r = this.helpInformation(n);
        if (t) {
          if (r = t(r), typeof r !== "string" && !Buffer.isBuffer(r)) {
            throw Error("outputHelp callback must return a string or a Buffer");
          }
        }
        if (n.write(r), this._getHelpOption()?.long) {
          this.emit(this._getHelpOption().long);
        }
        this.emit("afterHelp", n);
        this._getCommandAndAncestors().forEach(o => o.emit("afterAllHelp", n));
      }
      helpOption(e, t) {
        if (typeof e === "boolean") {
          if (e) {
            this._helpOption = this._helpOption ?? undefined;
          } else {
            this._helpOption = null;
          }
          return this;
        }
        e = e ?? "-h, --help";
        t = t ?? "display help for command";
        this._helpOption = this.createOption(e, t);
        return this;
      }
      _getHelpOption() {
        if (this._helpOption === undefined) {
          this.helpOption(undefined, undefined);
        }
        return this._helpOption;
      }
      addHelpOption(e) {
        this._helpOption = e;
        return this;
      }
      help(e) {
        this.outputHelp(e);
        let t = z0.exitCode || 0;
        if (t === 0 && e && typeof e !== "function" && e.error) {
          t = 1;
        }
        this._exit(t, "commander.help", "(outputHelp)");
      }
      addHelpText(e, t) {
        let n = ["beforeAll", "before", "after", "afterAll"];
        if (!n.includes(e)) {
          throw Error(`Unexpected value for position to addHelpText.
Expecting one of '${n.join("', '")}'`);
        }
        let r = `${e}Help`;
        this.on(r, o => {
          let s;
          if (typeof t === "function") {
            s = t({
              error: o.error,
              command: o.command
            });
          } else {
            s = t;
          }
          if (s) {
            o.write(`${s}
`);
          }
        });
        return this;
      }
      _outputHelpIfRequested(e) {
        let t = this._getHelpOption();
        if (t && e.find(r => t.is(r))) {
          this.outputHelp();
          this._exit(0, "commander.helpDisplayed", "(outputHelp)");
        }
      }
    }
    function abc(e) {
      return e.map(t => {
        if (!t.startsWith("--inspect")) {
          return t;
        }
        let n;
        let r = "127.0.0.1";
        let o = "9229";
        let s;
        if ((s = t.match(/^(--inspect(-brk)?)$/)) !== null) {
          n = s[1];
        } else if ((s = t.match(/^(--inspect(-brk|-port)?)=([^:]+)$/)) !== null) {
          if (n = s[1], /^\d+$/.test(s[3])) {
            o = s[3];
          } else {
            r = s[3];
          }
        } else if ((s = t.match(/^(--inspect(-brk|-port)?)=([^:]+):(\d+)$/)) !== null) {
          n = s[1];
          r = s[3];
          o = s[4];
        }
        if (n && o !== "0") {
          return `${n}=${r}:${parseInt(o) + 1}`;
        }
        return t;
      });
    }
    lbc.Command = sYo;
  });
  var mbc = __commonJS(Tee => {
    var {
      Argument: ubc
    } = Zmr();
    var {
      Command: iYo
    } = cbc();
    var {
      CommanderError: q_f,
      InvalidArgumentError: dbc
    } = jnn();
    var {
      Help: W_f
    } = Z7o();
    var {
      Option: pbc
    } = tYo();
    Tee.program = new iYo();
    Tee.createCommand = e => new iYo(e);
    Tee.createOption = (e, t) => new pbc(e, t);
    Tee.createArgument = (e, t) => new ubc(e, t);
    Tee.Command = iYo;
    Tee.Option = pbc;
    Tee.Argument = ubc;
    Tee.Help = W_f;
    Tee.CommanderError = q_f;
    Tee.InvalidArgumentError = dbc;
    Tee.InvalidOptionArgumentError = dbc;
  });
  var hbc = __commonJS((OK, fbc) => {
    var Mie = mbc();
    OK = fbc.exports = {};
    OK.program = new Mie.Command();
    OK.Argument = Mie.Argument;
    OK.Command = Mie.Command;
    OK.CommanderError = Mie.CommanderError;
    OK.Help = Mie.Help;
    OK.InvalidArgumentError = Mie.InvalidArgumentError;
    OK.InvalidOptionArgumentError = Mie.InvalidArgumentError;
    OK.Option = Mie.Option;
    OK.createCommand = e => new Mie.Command(e);
    OK.createOption = (e, t) => new Mie.Option(e, t);
    OK.createArgument = (e, t) => new Mie.Argument(e, t);
  });