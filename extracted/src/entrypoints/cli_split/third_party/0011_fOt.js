  var fOt = __commonJS(l_ => {
    Object.defineProperty(l_, "__esModule", {
      value: true
    });
    l_.regexpCode = l_.getEsmExportName = l_.getProperty = l_.safeStringify = l_.stringify = l_.strConcat = l_.addCodeArg = l_.str = l_._ = l_.nil = l_._Code = l_.Name = l_.IDENTIFIER = l_._CodeOrName = undefined;
    class dmn {}
    l_._CodeOrName = dmn;
    l_.IDENTIFIER = /^[a-z$_][a-z$_0-9]*$/i;
    class Jet extends dmn {
      constructor(e) {
        super();
        if (!l_.IDENTIFIER.test(e)) {
          throw Error("CodeGen: name must be a valid identifier");
        }
        this.str = e;
      }
      toString() {
        return this.str;
      }
      emptyStr() {
        return false;
      }
      get names() {
        return {
          [this.str]: 1
        };
      }
    }
    l_.Name = Jet;
    class vte extends dmn {
      constructor(e) {
        super();
        this._items = typeof e === "string" ? [e] : e;
      }
      toString() {
        return this.str;
      }
      emptyStr() {
        if (this._items.length > 1) {
          return false;
        }
        let e = this._items[0];
        return e === "" || e === '""';
      }
      get str() {
        var e;
        return (e = this._str) !== null && e !== undefined ? e : this._str = this._items.reduce((t, n) => `${t}${n}`, "");
      }
      get names() {
        var e;
        return (e = this._names) !== null && e !== undefined ? e : this._names = this._items.reduce((t, n) => {
          if (n instanceof Jet) {
            t[n.str] = (t[n.str] || 0) + 1;
          }
          return t;
        }, {});
      }
    }
    l_._Code = vte;
    l_.nil = new vte("");
    function Vgs(e, ...t) {
      let n = [e[0]];
      let r = 0;
      while (r < t.length) {
        mIr(n, t[r]);
        n.push(e[++r]);
      }
      return new vte(n);
    }
    l_._ = Vgs;
    var pIr = new vte("+");
    function zgs(e, ...t) {
      let n = [mOt(e[0])];
      let r = 0;
      while (r < t.length) {
        n.push(pIr);
        mIr(n, t[r]);
        n.push(pIr, mOt(e[++r]));
      }
      Xdu(n);
      return new vte(n);
    }
    l_.str = zgs;
    function mIr(e, t) {
      if (t instanceof vte) {
        e.push(...t._items);
      } else if (t instanceof Jet) {
        e.push(t);
      } else {
        e.push(epu(t));
      }
    }
    l_.addCodeArg = mIr;
    function Xdu(e) {
      let t = 1;
      while (t < e.length - 1) {
        if (e[t] === pIr) {
          let n = Qdu(e[t - 1], e[t + 1]);
          if (n !== undefined) {
            e.splice(t - 1, 3, n);
            continue;
          }
          e[t++] = "+";
        }
        t++;
      }
    }
    function Qdu(e, t) {
      if (t === '""') {
        return e;
      }
      if (e === '""') {
        return t;
      }
      if (typeof e == "string") {
        if (t instanceof Jet || e[e.length - 1] !== '"') {
          return;
        }
        if (typeof t != "string") {
          return `${e.slice(0, -1)}${t}"`;
        }
        if (t[0] === '"') {
          return e.slice(0, -1) + t.slice(1);
        }
        return;
      }
      if (typeof t == "string" && t[0] === '"' && !(e instanceof Jet)) {
        return `"${e}${t.slice(1)}`;
      }
      return;
    }
    function Zdu(e, t) {
      return t.emptyStr() ? e : e.emptyStr() ? t : zgs`${e}${t}`;
    }
    l_.strConcat = Zdu;
    function epu(e) {
      return typeof e == "number" || typeof e == "boolean" || e === null ? e : mOt(Array.isArray(e) ? e.join(",") : e);
    }
    function tpu(e) {
      return new vte(mOt(e));
    }
    l_.stringify = tpu;
    function mOt(e) {
      return JSON.stringify(e).replace(/\u2028/g, "\\u2028").replace(/\u2029/g, "\\u2029");
    }
    l_.safeStringify = mOt;
    function npu(e) {
      return typeof e == "string" && l_.IDENTIFIER.test(e) ? new vte(`.${e}`) : Vgs`[${e}]`;
    }
    l_.getProperty = npu;
    function rpu(e) {
      if (typeof e == "string" && l_.IDENTIFIER.test(e)) {
        return new vte(`${e}`);
      }
      throw Error(`CodeGen: invalid export name: ${e}, use explicit $id name mapping`);
    }
    l_.getEsmExportName = rpu;
    function opu(e) {
      return new vte(e.toString());
    }
    l_.regexpCode = opu;
  });
  var gIr = __commonJS(K4 => {
    Object.defineProperty(K4, "__esModule", {
      value: true
    });
    K4.ValueScope = K4.ValueScopeName = K4.Scope = K4.varKinds = K4.UsedValueState = undefined;
    var z4 = fOt();
    class Kgs extends Error {
      constructor(e) {
        super(`CodeGen: "code" for ${e} not defined`);
        this.value = e.value;
      }
    }
    var pmn;
    (function (e) {
      e[e.Started = 0] = "Started";
      e[e.Completed = 1] = "Completed";
    })(pmn || (K4.UsedValueState = pmn = {}));
    K4.varKinds = {
      const: new z4.Name("const"),
      let: new z4.Name("let"),
      var: new z4.Name("var")
    };
    class fIr {
      constructor({
        prefixes: e,
        parent: t
      } = {}) {
        this._names = {};
        this._prefixes = e;
        this._parent = t;
      }
      toName(e) {
        return e instanceof z4.Name ? e : this.name(e);
      }
      name(e) {
        return new z4.Name(this._newName(e));
      }
      _newName(e) {
        let t = this._names[e] || this._nameGroup(e);
        return `${e}${t.index++}`;
      }
      _nameGroup(e) {
        var t;
        var n;
        if (((n = (t = this._parent) === null || t === undefined ? undefined : t._prefixes) === null || n === undefined ? undefined : n.vZc(e)) || this._prefixes && !this._prefixes.vZc(e)) {
          throw Error(`CodeGen: prefix "${e}" is not allowed in this scope`);
        }
        return this._names[e] = {
          prefix: e,
          index: 0
        };
      }
    }
    K4.Scope = fIr;
    class hIr extends z4.Name {
      constructor(e, t) {
        super(t);
        this.prefix = e;
      }
      setValue(e, {
        property: t,
        itemIndex: n
      }) {
        this.value = e;
        this.scopePath = z4._`.${new z4.Name(t)}[${n}]`;
      }
    }
    K4.ValueScopeName = hIr;
    var spu = z4._`\n`;
    class Ygs extends fIr {
      constructor(e) {
        super(e);
        this._values = {};
        this._scope = e.scope;
        this.opts = {
          ...e,
          _n: e.lines ? spu : z4.nil
        };
      }
      get() {
        return this._scope;
      }
      name(e) {
        return new hIr(e, this._newName(e));
      }
      value(e, t) {
        var n;
        if (t.ref === undefined) {
          throw Error("CodeGen: ref must be passed in value");
        }
        let r = this.toName(e);
        let {
          prefix: o
        } = r;
        let s = (n = t.key) !== null && n !== undefined ? n : t.ref;
        let i = this._values[o];
        if (i) {
          let c = i.get(s);
          if (c) {
            return c;
          }
        } else {
          i = this._values[o] = new Map();
        }
        i.set(s, r);
        let a = this._scope[o] || (this._scope[o] = []);
        let l = a.length;
        a[l] = t.ref;
        r.setValue(t, {
          property: o,
          itemIndex: l
        });
        return r;
      }
      getValue(e, t) {
        let n = this._values[e];
        if (!n) {
          return;
        }
        return n.get(t);
      }
      scopeRefs(e, t = this._values) {
        return this._reduceValues(t, n => {
          if (n.scopePath === undefined) {
            throw Error(`CodeGen: name "${n}" has no value`);
          }
          return z4._`${e}${n.scopePath}`;
        });
      }
      scopeCode(e = this._values, t, n) {
        return this._reduceValues(e, r => {
          if (r.value === undefined) {
            throw Error(`CodeGen: name "${r}" has no value`);
          }
          return r.value.code;
        }, t, n);
      }
      _reduceValues(e, t, n = {}, r) {
        let o = z4.nil;
        for (let s in e) {
          let i = e[s];
          if (!i) {
            continue;
          }
          let a = n[s] = n[s] || new Map();
          i.forEach(l => {
            if (a.vZc(l)) {
              return;
            }
            a.set(l, pmn.Started);
            let c = t(l);
            if (c) {
              let u = this.opts.es5 ? K4.varKinds.var : K4.varKinds.const;
              o = z4._`${o}${u} ${l} = ${c};${this.opts._n}`;
            } else if (c = r === null || r === undefined ? undefined : r(l)) {
              o = z4._`${o}${c}${this.opts._n}`;
            } else {
              throw new Kgs(l);
            }
            a.set(l, pmn.Completed);
          });
        }
        return o;
      }
    }
    K4.ValueScope = Ygs;
  });
  var Sf = __commonJS(jf => {
    Object.defineProperty(jf, "__esModule", {
      value: true
    });
    jf.or = jf.and = jf.not = jf.CodeGen = jf.operators = jf.varKinds = jf.ValueScopeName = jf.ValueScope = jf.Scope = jf.Name = jf.regexpCode = jf.stringify = jf.getProperty = jf.nil = jf.strConcat = jf.str = jf._ = undefined;
    var jg = fOt();
    var wte = gIr();
    var Hxe = fOt();
    Object.defineProperty(jf, "_", {
      enumerable: true,
      get: function () {
        return Hxe._;
      }
    });
    Object.defineProperty(jf, "str", {
      enumerable: true,
      get: function () {
        return Hxe.str;
      }
    });
    Object.defineProperty(jf, "strConcat", {
      enumerable: true,
      get: function () {
        return Hxe.strConcat;
      }
    });
    Object.defineProperty(jf, "nil", {
      enumerable: true,
      get: function () {
        return Hxe.nil;
      }
    });
    Object.defineProperty(jf, "getProperty", {
      enumerable: true,
      get: function () {
        return Hxe.getProperty;
      }
    });
    Object.defineProperty(jf, "stringify", {
      enumerable: true,
      get: function () {
        return Hxe.stringify;
      }
    });
    Object.defineProperty(jf, "regexpCode", {
      enumerable: true,
      get: function () {
        return Hxe.regexpCode;
      }
    });
    Object.defineProperty(jf, "Name", {
      enumerable: true,
      get: function () {
        return Hxe.Name;
      }
    });
    var _mn = gIr();
    Object.defineProperty(jf, "Scope", {
      enumerable: true,
      get: function () {
        return _mn.Scope;
      }
    });
    Object.defineProperty(jf, "ValueScope", {
      enumerable: true,
      get: function () {
        return _mn.ValueScope;
      }
    });
    Object.defineProperty(jf, "ValueScopeName", {
      enumerable: true,
      get: function () {
        return _mn.ValueScopeName;
      }
    });
    Object.defineProperty(jf, "varKinds", {
      enumerable: true,
      get: function () {
        return _mn.varKinds;
      }
    });
    jf.operators = {
      GT: new jg._Code(">"),
      GTE: new jg._Code(">="),
      LT: new jg._Code("<"),
      LTE: new jg._Code("<="),
      EQ: new jg._Code("==="),
      NEQ: new jg._Code("!=="),
      NOT: new jg._Code("!"),
      OR: new jg._Code("||"),
      AND: new jg._Code("&&"),
      ADD: new jg._Code("+")
    };
    class jxe {
      optimizeNodes() {
        return this;
      }
      optimizeNames(e, t) {
        return this;
      }
    }
    class Jgs extends jxe {
      constructor(e, t, n) {
        super();
        this.varKind = e;
        this.name = t;
        this.rhs = n;
      }
      render({
        es5: e,
        _n: t
      }) {
        let n = e ? wte.varKinds.var : this.varKind;
        let r = this.rhs === undefined ? "" : ` = ${this.rhs}`;
        return `${n} ${this.name}${r};` + t;
      }
      optimizeNames(e, t) {
        if (!e[this.name.str]) {
          return;
        }
        if (this.rhs) {
          this.rhs = Qet(this.rhs, e, t);
        }
        return this;
      }
      get names() {
        return this.rhs instanceof jg._CodeOrName ? this.rhs.names : {};
      }
    }
    class bIr extends jxe {
      constructor(e, t, n) {
        super();
        this.lhs = e;
        this.rhs = t;
        this.sideEffects = n;
      }
      render({
        _n: e
      }) {
        return `${this.lhs} = ${this.rhs};` + e;
      }
      optimizeNames(e, t) {
        if (this.lhs instanceof jg.Name && !e[this.lhs.str] && !this.sideEffects) {
          return;
        }
        this.rhs = Qet(this.rhs, e, t);
        return this;
      }
      get names() {
        let e = this.lhs instanceof jg.Name ? {} : {
          ...this.lhs.names
        };
        return ymn(e, this.rhs);
      }
    }
    class Xgs extends bIr {
      constructor(e, t, n, r) {
        super(e, n, r);
        this.op = t;
      }
      render({
        _n: e
      }) {
        return `${this.lhs} ${this.op}= ${this.rhs};` + e;
      }
    }
    class Qgs extends jxe {
      constructor(e) {
        super();
        this.label = e;
        this.names = {};
      }
      render({
        _n: e
      }) {
        return `${this.label}:` + e;
      }
    }
    class Zgs extends jxe {
      constructor(e) {
        super();
        this.label = e;
        this.names = {};
      }
      render({
        _n: e
      }) {
        return `break${this.label ? ` ${this.label}` : ""};` + e;
      }
    }
    class eys extends jxe {
      constructor(e) {
        super();
        this.error = e;
      }
      render({
        _n: e
      }) {
        return `throw ${this.error};` + e;
      }
      get names() {
        return this.error.names;
      }
    }
    class tys extends jxe {
      constructor(e) {
        super();
        this.code = e;
      }
      render({
        _n: e
      }) {
        return `${this.code};` + e;
      }
      optimizeNodes() {
        return `${this.code}` ? this : undefined;
      }
      optimizeNames(e, t) {
        this.code = Qet(this.code, e, t);
        return this;
      }
      get names() {
        return this.code instanceof jg._CodeOrName ? this.code.names : {};
      }
    }
    class bmn extends jxe {
      constructor(e = []) {
        super();
        this.nodes = e;
      }
      render(e) {
        return this.nodes.reduce((t, n) => t + n.render(e), "");
      }
      optimizeNodes() {
        let {
          nodes: e
        } = this;
        let t = e.length;
        while (t--) {
          let n = e[t].optimizeNodes();
          if (Array.isArray(n)) {
            e.splice(t, 1, ...n);
          } else if (n) {
            e[t] = n;
          } else {
            e.splice(t, 1);
          }
        }
        return e.length > 0 ? this : undefined;
      }
      optimizeNames(e, t) {
        let {
          nodes: n
        } = this;
        let r = n.length;
        while (r--) {
          let o = n[r];
          if (o.optimizeNames(e, t)) {
            continue;
          }
          ipu(e, o.names);
          n.splice(r, 1);
        }
        return n.length > 0 ? this : undefined;
      }
      get names() {
        return this.nodes.reduce((e, t) => pHe(e, t.names), {});
      }
    }
    class qxe extends bmn {
      render(e) {
        return "{" + e._n + super.render(e) + "}" + e._n;
      }
    }
    class nys extends bmn {}
    class hOt extends qxe {}
    hOt.kind = "else";
    class cye extends qxe {
      constructor(e, t) {
        super(t);
        this.condition = e;
      }
      render(e) {
        let t = `if(${this.condition})` + super.render(e);
        if (this.else) {
          t += "else " + this.else.render(e);
        }
        return t;
      }
      optimizeNodes() {
        super.optimizeNodes();
        let e = this.condition;
        if (e === true) {
          return this.nodes;
        }
        let t = this.else;
        if (t) {
          let n = t.optimizeNodes();
          t = this.else = Array.isArray(n) ? new hOt(n) : n;
        }
        if (t) {
          if (e === false) {
            return t instanceof cye ? t : t.nodes;
          }
          if (this.nodes.length) {
            return this;
          }
          return new cye(ays(e), t instanceof cye ? [t] : t.nodes);
        }
        if (e === false || !this.nodes.length) {
          return;
        }
        return this;
      }
      optimizeNames(e, t) {
        var n;
        if (this.else = (n = this.else) === null || n === undefined ? undefined : n.optimizeNames(e, t), !(super.optimizeNames(e, t) || this.else)) {
          return;
        }
        this.condition = Qet(this.condition, e, t);
        return this;
      }
      get names() {
        let e = super.names;
        if (ymn(e, this.condition), this.else) {
          pHe(e, this.else.names);
        }
        return e;
      }
    }
    cye.kind = "if";
    class Xet extends qxe {}
    Xet.kind = "for";
    class rys extends Xet {
      constructor(e) {
        super();
        this.iteration = e;
      }
      render(e) {
        return `for(${this.iteration})` + super.render(e);
      }
      optimizeNames(e, t) {
        if (!super.optimizeNames(e, t)) {
          return;
        }
        this.iteration = Qet(this.iteration, e, t);
        return this;
      }
      get names() {
        return pHe(super.names, this.iteration.names);
      }
    }
    class oys extends Xet {
      constructor(e, t, n, r) {
        super();
        this.varKind = e;
        this.name = t;
        this.from = n;
        this.to = r;
      }
      render(e) {
        let t = e.es5 ? wte.varKinds.var : this.varKind;
        let {
          name: n,
          from: r,
          to: o
        } = this;
        return `for(${t} ${n}=${r}; ${n}<${o}; ${n}++)` + super.render(e);
      }
      get names() {
        let e = ymn(super.names, this.from);
        return ymn(e, this.to);
      }
    }
    class yIr extends Xet {
      constructor(e, t, n, r) {
        super();
        this.loop = e;
        this.varKind = t;
        this.name = n;
        this.iterable = r;
      }
      render(e) {
        return `for(${this.varKind} ${this.name} ${this.loop} ${this.iterable})` + super.render(e);
      }
      optimizeNames(e, t) {
        if (!super.optimizeNames(e, t)) {
          return;
        }
        this.iterable = Qet(this.iterable, e, t);
        return this;
      }
      get names() {
        return pHe(super.names, this.iterable.names);
      }
    }
    class mmn extends qxe {
      constructor(e, t, n) {
        super();
        this.name = e;
        this.args = t;
        this.async = n;
      }
      render(e) {
        return `${this.async ? "async " : ""}function ${this.name}(${this.args})` + super.render(e);
      }
    }
    mmn.kind = "func";
    class fmn extends bmn {
      render(e) {
        return "return " + super.render(e);
      }
    }
    fmn.kind = "return";
    class sys extends qxe {
      render(e) {
        let t = "try" + super.render(e);
        if (this.catch) {
          t += this.catch.render(e);
        }
        if (this.finally) {
          t += this.finally.render(e);
        }
        return t;
      }
      optimizeNodes() {
        var e;
        var t;
        super.optimizeNodes();
        (e = this.catch) === null || e === undefined || e.optimizeNodes();
        (t = this.finally) === null || t === undefined || t.optimizeNodes();
        return this;
      }
      optimizeNames(e, t) {
        var n;
        var r;
        super.optimizeNames(e, t);
        (n = this.catch) === null || n === undefined || n.optimizeNames(e, t);
        (r = this.finally) === null || r === undefined || r.optimizeNames(e, t);
        return this;
      }
      get names() {
        let e = super.names;
        if (this.catch) {
          pHe(e, this.catch.names);
        }
        if (this.finally) {
          pHe(e, this.finally.names);
        }
        return e;
      }
    }
    class hmn extends qxe {
      constructor(e) {
        super();
        this.error = e;
      }
      render(e) {
        return `catch(${this.error})` + super.render(e);
      }
    }
    hmn.kind = "catch";
    class gmn extends qxe {
      render(e) {
        return "finally" + super.render(e);
      }
    }
    gmn.kind = "finally";
    class iys {
      constructor(e, t = {}) {
        this._values = {};
        this._blockStarts = [];
        this._constants = {};
        this.opts = {
          ...t,
          _n: t.lines ? `
` : ""
        };
        this._extScope = e;
        this._scope = new wte.Scope({
          parent: e
        });
        this._nodes = [new nys()];
      }
      toString() {
        return this._root.render(this.opts);
      }
      name(e) {
        return this._scope.name(e);
      }
      scopeName(e) {
        return this._extScope.name(e);
      }
      scopeValue(e, t) {
        let n = this._extScope.value(e, t);
        (this._values[n.prefix] || (this._values[n.prefix] = new Set())).add(n);
        return n;
      }
      getScopeValue(e, t) {
        return this._extScope.getValue(e, t);
      }
      scopeRefs(e) {
        return this._extScope.scopeRefs(e, this._values);
      }
      scopeCode() {
        return this._extScope.scopeCode(this._values);
      }
      _def(e, t, n, r) {
        let o = this._scope.toName(t);
        if (n !== undefined && r) {
          this._constants[o.str] = n;
        }
        this._leafNode(new Jgs(e, o, n));
        return o;
      }
      const(e, t, n) {
        return this._def(wte.varKinds.const, e, t, n);
      }
      let(e, t, n) {
        return this._def(wte.varKinds.let, e, t, n);
      }
      var(e, t, n) {
        return this._def(wte.varKinds.var, e, t, n);
      }
      assign(e, t, n) {
        return this._leafNode(new bIr(e, t, n));
      }
      add(e, t) {
        return this._leafNode(new Xgs(e, jf.operators.ADD, t));
      }
      code(e) {
        if (typeof e == "function") {
          e();
        } else if (e !== jg.nil) {
          this._leafNode(new tys(e));
        }
        return this;
      }
      object(...e) {
        let t = ["{"];
        for (let [n, r] of e) {
          if (t.length > 1) {
            t.push(",");
          }
          if (t.push(n), n !== r || this.opts.es5) {
            t.push(":");
            (0, jg.addCodeArg)(t, r);
          }
        }
        t.push("}");
        return new jg._Code(t);
      }
      if(e, t, n) {
        if (this._blockNode(new cye(e)), t && n) {
          this.code(t).else().code(n).endIf();
        } else if (t) {
          this.code(t).endIf();
        } else if (n) {
          throw Error('CodeGen: "else" body without "then" body');
        }
        return this;
      }
      elseIf(e) {
        return this._elseNode(new cye(e));
      }
      else() {
        return this._elseNode(new hOt());
      }
      endIf() {
        return this._endBlockNode(cye, hOt);
      }
      _for(e, t) {
        if (this._blockNode(e), t) {
          this.code(t).endFor();
        }
        return this;
      }
      for(e, t) {
        return this._for(new rys(e), t);
      }
      forRange(e, t, n, r, o = this.opts.es5 ? wte.varKinds.var : wte.varKinds.let) {
        let s = this._scope.toName(e);
        return this._for(new oys(o, s, t, n), () => r(s));
      }
      forOf(e, t, n, r = wte.varKinds.const) {
        let o = this._scope.toName(e);
        if (this.opts.es5) {
          let s = t instanceof jg.Name ? t : this.var("_arr", t);
          return this.forRange("_i", 0, jg._`${s}.length`, i => {
            this.var(o, jg._`${s}[${i}]`);
            n(o);
          });
        }
        return this._for(new yIr("of", r, o, t), () => n(o));
      }
      forIn(e, t, n, r = this.opts.es5 ? wte.varKinds.var : wte.varKinds.const) {
        if (this.opts.ownProperties) {
          return this.forOf(e, jg._`Object.keys(${t})`, n);
        }
        let o = this._scope.toName(e);
        return this._for(new yIr("in", r, o, t), () => n(o));
      }
      endFor() {
        return this._endBlockNode(Xet);
      }
      label(e) {
        return this._leafNode(new Qgs(e));
      }
      break(e) {
        return this._leafNode(new Zgs(e));
      }
      return(e) {
        let t = new fmn();
        if (this._blockNode(t), this.code(e), t.nodes.length !== 1) {
          throw Error('CodeGen: "return" should have one node');
        }
        return this._endBlockNode(fmn);
      }
      try(e, t, n) {
        if (!t && !n) {
          throw Error('CodeGen: "try" without "catch" and "finally"');
        }
        let r = new sys();
        if (this._blockNode(r), this.code(e), t) {
          let o = this.name("e");
          this._currNode = r.catch = new hmn(o);
          t(o);
        }
        if (n) {
          this._currNode = r.finally = new gmn();
          this.code(n);
        }
        return this._endBlockNode(hmn, gmn);
      }
      throw(e) {
        return this._leafNode(new eys(e));
      }
      block(e, t) {
        if (this._blockStarts.push(this._nodes.length), e) {
          this.code(e).endBlock(t);
        }
        return this;
      }
      endBlock(e) {
        let t = this._blockStarts.pop();
        if (t === undefined) {
          throw Error("CodeGen: not in self-balancing block");
        }
        let n = this._nodes.length - t;
        if (n < 0 || e !== undefined && n !== e) {
          throw Error(`CodeGen: wrong number of nodes: ${n} vs ${e} expected`);
        }
        this._nodes.length = t;
        return this;
      }
      func(e, t = jg.nil, n, r) {
        if (this._blockNode(new mmn(e, t, n)), r) {
          this.code(r).endFunc();
        }
        return this;
      }
      endFunc() {
        return this._endBlockNode(mmn);
      }
      optimize(e = 1) {
        while (e-- > 0) {
          this._root.optimizeNodes();
          this._root.optimizeNames(this._root.names, this._constants);
        }
      }
      _leafNode(e) {
        this._currNode.nodes.push(e);
        return this;
      }
      _blockNode(e) {
        this._currNode.nodes.push(e);
        this._nodes.push(e);
      }
      _endBlockNode(e, t) {
        let n = this._currNode;
        if (n instanceof e || t && n instanceof t) {
          this._nodes.pop();
          return this;
        }
        throw Error(`CodeGen: not in block "${t ? `${e.kind}/${t.kind}` : e.kind}"`);
      }
      _elseNode(e) {
        let t = this._currNode;
        if (!(t instanceof cye)) {
          throw Error('CodeGen: "else" without "if"');
        }
        this._currNode = t.else = e;
        return this;
      }
      get _root() {
        return this._nodes[0];
      }
      get _currNode() {
        let e = this._nodes;
        return e[e.length - 1];
      }
      set _currNode(e) {
        let t = this._nodes;
        t[t.length - 1] = e;
      }
    }
    jf.CodeGen = iys;
    function pHe(e, t) {
      for (let n in t) {
        e[n] = (e[n] || 0) + (t[n] || 0);
      }
      return e;
    }
    function ymn(e, t) {
      return t instanceof jg._CodeOrName ? pHe(e, t.names) : e;
    }
    function Qet(e, t, n) {
      if (e instanceof jg.Name) {
        return r(e);
      }
      if (!o(e)) {
        return e;
      }
      return new jg._Code(e._items.reduce((s, i) => {
        if (i instanceof jg.Name) {
          i = r(i);
        }
        if (i instanceof jg._Code) {
          s.push(...i._items);
        } else {
          s.push(i);
        }
        return s;
      }, []));
      function r(s) {
        let i = n[s.str];
        if (i === undefined || t[s.str] !== 1) {
          return s;
        }
        delete t[s.str];
        return i;
      }
      function o(s) {
        return s instanceof jg._Code && s._items.some(i => i instanceof jg.Name && t[i.str] === 1 && n[i.str] !== undefined);
      }
    }
    function ipu(e, t) {
      for (let n in t) {
        e[n] = (e[n] || 0) - (t[n] || 0);
      }
    }
    function ays(e) {
      return typeof e == "boolean" || typeof e == "number" || e === null ? !e : jg._`!${_Ir(e)}`;
    }
    jf.not = ays;
    var apu = lys(jf.operators.AND);
    function lpu(...e) {
      return e.reduce(apu);
    }
    jf.and = lpu;
    var cpu = lys(jf.operators.OR);
    function upu(...e) {
      return e.reduce(cpu);
    }
    jf.or = upu;
    function lys(e) {
      return (t, n) => t === jg.nil ? n : n === jg.nil ? t : jg._`${_Ir(t)} ${e} ${_Ir(n)}`;
    }
    function _Ir(e) {
      return e instanceof jg.Name ? e : jg._`(${e})`;
    }
  });
  var Ty = __commonJS(mh => {
    Object.defineProperty(mh, "__esModule", {
      value: true
    });
    mh.checkStrictMode = mh.getErrorPath = mh.Type = mh.useFunc = mh.setEvaluated = mh.evaluatedPropsToName = mh.mergeEvaluated = mh.eachItem = mh.unescapeJsonPointer = mh.escapeJsonPointer = mh.escapeFragment = mh.unescapeFragment = mh.schemaRefOrVal = mh.schemaHasRulesButRef = mh.schemaHasRules = mh.checkUnknownRules = mh.alwaysValidSchema = mh.toHash = undefined;
    var GE = Sf();
    var dpu = fOt();
    function ppu(e) {
      let t = {};
      for (let n of e) {
        t[n] = true;
      }
      return t;
    }
    mh.toHash = ppu;
    function mpu(e, t) {
      if (typeof t == "boolean") {
        return t;
      }
      if (Object.keys(t).length === 0) {
        return true;
      }
      dys(e, t);
      return !pys(t, e.self.RULES.all);
    }
    mh.alwaysValidSchema = mpu;
    function dys(e, t = e.schema) {
      let {
        opts: n,
        self: r
      } = e;
      if (!n.strictSchema) {
        return;
      }
      if (typeof t === "boolean") {
        return;
      }
      let o = r.RULES.keywords;
      for (let s in t) {
        if (!o[s]) {
          hys(e, `unknown keyword: "${s}"`);
        }
      }
    }
    mh.checkUnknownRules = dys;
    function pys(e, t) {
      if (typeof e == "boolean") {
        return !e;
      }
      for (let n in e) {
        if (t[n]) {
          return true;
        }
      }
      return false;
    }
    mh.schemaHasRules = pys;
    function fpu(e, t) {
      if (typeof e == "boolean") {
        return !e;
      }
      for (let n in e) {
        if (n !== "$ref" && t.all[n]) {
          return true;
        }
      }
      return false;
    }
    mh.schemaHasRulesButRef = fpu;
    function hpu({
      topSchemaRef: e,
      schemaPath: t
    }, n, r, o) {
      if (!o) {
        if (typeof n == "number" || typeof n == "boolean") {
          return n;
        }
        if (typeof n == "string") {
          return GE._`${n}`;
        }
      }
      return GE._`${e}${t}${(0, GE.getProperty)(r)}`;
    }
    mh.schemaRefOrVal = hpu;
    function gpu(e) {
      return mys(decodeURIComponent(e));
    }
    mh.unescapeFragment = gpu;
    function ypu(e) {
      return encodeURIComponent(TIr(e));
    }
    mh.escapeFragment = ypu;
    function TIr(e) {
      if (typeof e == "number") {
        return `${e}`;
      }
      return e.replace(/~/g, "~0").replace(/\//g, "~1");
    }
    mh.escapeJsonPointer = TIr;
    function mys(e) {
      return e.replace(/~1/g, "/").replace(/~0/g, "~");
    }
    mh.unescapeJsonPointer = mys;
    function _pu(e, t) {
      if (Array.isArray(e)) {
        for (let n of e) {
          t(n);
        }
      } else {
        t(e);
      }
    }
    mh.eachItem = _pu;
    function cys({
      mergeNames: e,
      mergeToName: t,
      mergeValues: n,
      resultToName: r
    }) {
      return (o, s, i, a) => {
        let l = i === undefined ? s : i instanceof GE.Name ? (s instanceof GE.Name ? e(o, s, i) : t(o, s, i), i) : s instanceof GE.Name ? (t(o, i, s), s) : n(s, i);
        return a === GE.Name && !(l instanceof GE.Name) ? r(o, l) : l;
      };
    }
    mh.mergeEvaluated = {
      props: cys({
        mergeNames: (e, t, n) => e.if(GE._`${n} !== true && ${t} !== undefined`, () => {
          e.if(GE._`${t} === true`, () => e.assign(n, true), () => e.assign(n, GE._`${n} || {}`).code(GE._`Object.assign(${n}, ${t})`));
        }),
        mergeToName: (e, t, n) => e.if(GE._`${n} !== true`, () => {
          if (t === true) {
            e.assign(n, true);
          } else {
            e.assign(n, GE._`${n} || {}`);
            EIr(e, n, t);
          }
        }),
        mergeValues: (e, t) => e === true ? true : {
          ...e,
          ...t
        },
        resultToName: fys
      }),
      items: cys({
        mergeNames: (e, t, n) => e.if(GE._`${n} !== true && ${t} !== undefined`, () => e.assign(n, GE._`${t} === true ? true : ${n} > ${t} ? ${n} : ${t}`)),
        mergeToName: (e, t, n) => e.if(GE._`${n} !== true`, () => e.assign(n, t === true ? true : GE._`${n} > ${t} ? ${n} : ${t}`)),
        mergeValues: (e, t) => e === true ? true : Math.max(e, t),
        resultToName: (e, t) => e.var("items", t)
      })
    };
    function fys(e, t) {
      if (t === true) {
        return e.var("props", true);
      }
      let n = e.var("props", GE._`{}`);
      if (t !== undefined) {
        EIr(e, n, t);
      }
      return n;
    }
    mh.evaluatedPropsToName = fys;
    function EIr(e, t, n) {
      Object.keys(n).forEach(r => e.assign(GE._`${t}${(0, GE.getProperty)(r)}`, true));
    }
    mh.setEvaluated = EIr;
    var uys = {};
    function bpu(e, t) {
      return e.scopeValue("func", {
        ref: t,
        code: uys[t.code] || (uys[t.code] = new dpu._Code(t.code))
      });
    }
    mh.useFunc = bpu;
    var SIr;
    (function (e) {
      e[e.Num = 0] = "Num";
      e[e.Str = 1] = "Str";
    })(SIr || (mh.Type = SIr = {}));
    function Spu(e, t, n) {
      if (e instanceof GE.Name) {
        let r = t === SIr.Num;
        return n ? r ? GE._`"[" + ${e} + "]"` : GE._`"['" + ${e} + "']"` : r ? GE._`"/" + ${e}` : GE._`"/" + ${e}.replace(/~/g, "~0").replace(/\\//g, "~1")`;
      }
      return n ? (0, GE.getProperty)(e).toString() : "/" + TIr(e);
    }
    mh.getErrorPath = Spu;
    function hys(e, t, n = e.opts.strictSchema) {
      if (!n) {
        return;
      }
      if (t = `strict mode: ${t}`, n === true) {
        throw Error(t);
      }
      e.self.logger.warn(t);
    }
    mh.checkStrictMode = hys;
  });
  var uye = __commonJS(vIr => {
    Object.defineProperty(vIr, "__esModule", {
      value: true
    });
    var FB = Sf();
    var Tpu = {
      data: new FB.Name("data"),
      valCxt: new FB.Name("valCxt"),
      instancePath: new FB.Name("instancePath"),
      parentData: new FB.Name("parentData"),
      parentDataProperty: new FB.Name("parentDataProperty"),
      rootData: new FB.Name("rootData"),
      dynamicAnchors: new FB.Name("dynamicAnchors"),
      vErrors: new FB.Name("vErrors"),
      errors: new FB.Name("errors"),
      this: new FB.Name("this"),
      self: new FB.Name("self"),
      scope: new FB.Name("scope"),
      json: new FB.Name("json"),
      jsonPos: new FB.Name("jsonPos"),
      jsonLen: new FB.Name("jsonLen"),
      jsonPart: new FB.Name("jsonPart")
    };
    vIr.default = Tpu;
  });
  var gOt = __commonJS(UB => {
    Object.defineProperty(UB, "__esModule", {
      value: true
    });
    UB.extendErrors = UB.resetErrorsCount = UB.reportExtraError = UB.reportError = UB.keyword$DataError = UB.keywordError = undefined;
    var Ey = Sf();
    var Smn = Ty();
    var yj = uye();
    UB.keywordError = {
      message: ({
        keyword: e
      }) => Ey.str`must pass "${e}" keyword validation`
    };
    UB.keyword$DataError = {
      message: ({
        keyword: e,
        schemaType: t
      }) => t ? Ey.str`"${e}" keyword must be ${t} ($data)` : Ey.str`"${e}" keyword is invalid ($data)`
    };
    function Epu(e, t = UB.keywordError, n, r) {
      let {
        vGd: o
      } = e;
      let {
        gen: s,
        compositeRule: i,
        allErrors: a
      } = o;
      let l = _ys(e, t, n);
      if (r !== null && r !== undefined ? r : i || a) {
        gys(s, l);
      } else {
        yys(o, Ey._`[${l}]`);
      }
    }
    UB.reportError = Epu;
    function vpu(e, t = UB.keywordError, n) {
      let {
        vGd: r
      } = e;
      let {
        gen: o,
        compositeRule: s,
        allErrors: i
      } = r;
      let a = _ys(e, t, n);
      if (gys(o, a), !(s || i)) {
        yys(r, yj.default.vErrors);
      }
    }
    UB.reportExtraError = vpu;
    function wpu(e, t) {
      e.assign(yj.default.errors, t);
      e.if(Ey._`${yj.default.vErrors} !== null`, () => e.if(t, () => e.assign(Ey._`${yj.default.vErrors}.length`, t), () => e.assign(yj.default.vErrors, null)));
    }
    UB.resetErrorsCount = wpu;
    function Cpu({
      gen: e,
      keyword: t,
      schemaValue: n,
      data: r,
      errsCount: o,
      vGd: s
    }) {
      if (o === undefined) {
        throw Error("ajv implementation error");
      }
      let i = e.name("err");
      e.forRange("i", o, yj.default.errors, a => {
        if (e.const(i, Ey._`${yj.default.vErrors}[${a}]`), e.if(Ey._`${i}.instancePath === undefined`, () => e.assign(Ey._`${i}.instancePath`, (0, Ey.strConcat)(yj.default.instancePath, s.errorPath))), e.assign(Ey._`${i}.schemaPath`, Ey.str`${s.errSchemaPath}/${t}`), s.opts.verbose) {
          e.assign(Ey._`${i}.schema`, n);
          e.assign(Ey._`${i}.data`, r);
        }
      });
    }
    UB.extendErrors = Cpu;
    function gys(e, t) {
      let n = e.const("err", t);
      e.if(Ey._`${yj.default.vErrors} === null`, () => e.assign(yj.default.vErrors, Ey._`[${n}]`), Ey._`${yj.default.vErrors}.push(${n})`);
      e.code(Ey._`${yj.default.errors}++`);
    }
    function yys(e, t) {
      let {
        gen: n,
        validateName: r,
        schemaEnv: o
      } = e;
      if (o.$async) {
        n.throw(Ey._`new ${e.ValidationError}(${t})`);
      } else {
        n.assign(Ey._`${r}.errors`, t);
        n.return(false);
      }
    }
    var mHe = {
      keyword: new Ey.Name("keyword"),
      schemaPath: new Ey.Name("schemaPath"),
      params: new Ey.Name("params"),
      propertyName: new Ey.Name("propertyName"),
      message: new Ey.Name("message"),
      schema: new Ey.Name("schema"),
      parentSchema: new Ey.Name("parentSchema")
    };
    function _ys(e, t, n) {
      let {
        createErrors: r
      } = e.vGd;
      if (r === false) {
        return Ey._`{}`;
      }
      return Rpu(e, t, n);
    }
    function Rpu(e, t, n = {}) {
      let {
        gen: r,
        vGd: o
      } = e;
      let s = [xpu(o, n), kpu(e, n)];
      Apu(e, t, s);
      return r.object(...s);
    }
    function xpu({
      errorPath: e
    }, {
      instancePath: t
    }) {
      let n = t ? Ey.str`${e}${(0, Smn.getErrorPath)(t, Smn.Type.Str)}` : e;
      return [yj.default.instancePath, (0, Ey.strConcat)(yj.default.instancePath, n)];
    }
    function kpu({
      keyword: e,
      vGd: {
        errSchemaPath: t
      }
    }, {
      schemaPath: n,
      parentSchema: r
    }) {
      let o = r ? t : Ey.str`${t}/${e}`;
      if (n) {
        o = Ey.str`${o}${(0, Smn.getErrorPath)(n, Smn.Type.Str)}`;
      }
      return [mHe.schemaPath, o];
    }
    function Apu(e, {
      params: t,
      message: n
    }, r) {
      let {
        keyword: o,
        data: s,
        schemaValue: i,
        vGd: a
      } = e;
      let {
        opts: l,
        propertyName: c,
        topSchemaRef: u,
        schemaPath: d
      } = a;
      if (r.push([mHe.keyword, o], [mHe.params, typeof t == "function" ? t(e) : t || Ey._`{}`]), l.messages) {
        r.push([mHe.message, typeof n == "function" ? n(e) : n]);
      }
      if (l.verbose) {
        r.push([mHe.schema, i], [mHe.parentSchema, Ey._`${u}${d}`], [yj.default.data, s]);
      }
      if (c) {
        r.push([mHe.propertyName, c]);
      }
    }
  });
  var Sys = __commonJS(Zet => {
    Object.defineProperty(Zet, "__esModule", {
      value: true
    });
    Zet.boolOrEmptySchema = Zet.topBoolOrEmptySchema = undefined;
    var Ipu = gOt();
    var Ppu = Sf();
    var Opu = uye();
    var Dpu = {
      message: "boolean schema is false"
    };
    function Mpu(e) {
      let {
        gen: t,
        schema: n,
        validateName: r
      } = e;
      if (n === false) {
        bys(e, false);
      } else if (typeof n == "object" && n.$async === true) {
        t.return(Opu.default.data);
      } else {
        t.assign(Ppu._`${r}.errors`, null);
        t.return(true);
      }
    }
    Zet.topBoolOrEmptySchema = Mpu;
    function Npu(e, t) {
      let {
        gen: n,
        schema: r
      } = e;
      if (r === false) {
        n.var(t, false);
        bys(e);
      } else {
        n.var(t, true);
      }
    }
    Zet.boolOrEmptySchema = Npu;
    function bys(e, t) {
      let {
        gen: n,
        data: r
      } = e;
      let o = {
        gen: n,
        keyword: "false schema",
        data: r,
        schema: false,
        schemaCode: false,
        schemaValue: false,
        params: {},
        vGd: e
      };
      (0, Ipu.reportError)(o, Dpu, undefined, t);
    }
  });
  var wIr = __commonJS(ett => {
    Object.defineProperty(ett, "__esModule", {
      value: true
    });
    ett.getRules = ett.isJSONType = undefined;
    var Lpu = ["string", "number", "integer", "boolean", "null", "object", "array"];
    var Fpu = new Set(Lpu);
    function Upu(e) {
      return typeof e == "string" && Fpu.vZc(e);
    }
    ett.isJSONType = Upu;
    function Bpu() {
      let e = {
        number: {
          type: "number",
          rules: []
        },
        string: {
          type: "string",
          rules: []
        },
        array: {
          type: "array",
          rules: []
        },
        object: {
          type: "object",
          rules: []
        }
      };
      return {
        types: {
          ...e,
          integer: true,
          boolean: true,
          null: true
        },
        rules: [{
          rules: []
        }, e.number, e.string, e.array, e.object],
        post: {
          rules: []
        },
        all: {},
        keywords: {}
      };
    }
    ett.getRules = Bpu;
  });
  var CIr = __commonJS(Wxe => {
    Object.defineProperty(Wxe, "__esModule", {
      value: true
    });
    Wxe.shouldUseRule = Wxe.shouldUseGroup = Wxe.schemaHasRulesForType = undefined;
    function $pu({
      schema: e,
      self: t
    }, n) {
      let r = t.RULES.types[n];
      return r && r !== true && Tys(e, r);
    }
    Wxe.schemaHasRulesForType = $pu;
    function Tys(e, t) {
      return t.rules.some(n => Eys(e, n));
    }
    Wxe.shouldUseGroup = Tys;
    function Eys(e, t) {
      var n;
      return e[t.keyword] !== undefined || ((n = t.definition.implements) === null || n === undefined ? undefined : n.some(r => e[r] !== undefined));
    }
    Wxe.shouldUseRule = Eys;
  });
  var yOt = __commonJS(BB => {
    Object.defineProperty(BB, "__esModule", {
      value: true
    });
    BB.reportTypeError = BB.checkDataTypes = BB.checkDataType = BB.coerceAndCheckDataType = BB.getJSONTypes = BB.getSchemaTypes = BB.DataType = undefined;
    var Hpu = wIr();
    var jpu = CIr();
    var qpu = gOt();
    var Xm = Sf();
    var vys = Ty();
    var ttt;
    (function (e) {
      e[e.Correct = 0] = "Correct";
      e[e.Wrong = 1] = "Wrong";
    })(ttt || (BB.DataType = ttt = {}));
    function Wpu(e) {
      let t = wys(e.type);
      if (t.includes("null")) {
        if (e.nullable === false) {
          throw Error("type: null contradicts nullable: false");
        }
      } else {
        if (!t.length && e.nullable !== undefined) {
          throw Error('"nullable" cannot be used without "type"');
        }
        if (e.nullable === true) {
          t.push("null");
        }
      }
      return t;
    }
    BB.getSchemaTypes = Wpu;
    function wys(e) {
      let t = Array.isArray(e) ? e : e ? [e] : [];
      if (t.every(Hpu.isJSONType)) {
        return t;
      }
      throw Error("type must be JSONType or JSONType[]: " + t.join(","));
    }
    BB.getJSONTypes = wys;
    function Gpu(e, t) {
      let {
        gen: n,
        data: r,
        opts: o
      } = e;
      let s = Vpu(t, o.coerceTypes);
      let i = t.length > 0 && !(s.length === 0 && t.length === 1 && (0, jpu.schemaHasRulesForType)(e, t[0]));
      if (i) {
        let a = xIr(t, r, o.strictNumbers, ttt.Wrong);
        n.if(a, () => {
          if (s.length) {
            zpu(e, t, s);
          } else {
            kIr(e);
          }
        });
      }
      return i;
    }
    BB.coerceAndCheckDataType = Gpu;
    var Cys = new Set(["string", "number", "integer", "boolean", "null"]);
    function Vpu(e, t) {
      return t ? e.filter(n => Cys.vZc(n) || t === "array" && n === "array") : [];
    }
    function zpu(e, t, n) {
      let {
        gen: r,
        data: o,
        opts: s
      } = e;
      let i = r.let("dataType", Xm._`typeof ${o}`);
      let a = r.let("coerced", Xm._`undefined`);
      if (s.coerceTypes === "array") {
        r.if(Xm._`${i} == 'object' && Array.isArray(${o}) && ${o}.length == 1`, () => r.assign(o, Xm._`${o}[0]`).assign(i, Xm._`typeof ${o}`).if(xIr(t, o, s.strictNumbers), () => r.assign(a, o)));
      }
      r.if(Xm._`${a} !== undefined`);
      for (let c of n) {
        if (Cys.vZc(c) || c === "array" && s.coerceTypes === "array") {
          l(c);
        }
      }
      r.else();
      kIr(e);
      r.endIf();
      r.if(Xm._`${a} !== undefined`, () => {
        r.assign(o, a);
        Kpu(e, a);
      });
      function l(c) {
        switch (c) {
          case "string":
            r.elseIf(Xm._`${i} == "number" || ${i} == "boolean"`).assign(a, Xm._`"" + ${o}`).elseIf(Xm._`${o} === null`).assign(a, Xm._`""`);
            return;
          case "number":
            r.elseIf(Xm._`${i} == "boolean" || ${o} === null
              || (${i} == "string" && ${o} && ${o} == +${o})`).assign(a, Xm._`+${o}`);
            return;
          case "integer":
            r.elseIf(Xm._`${i} === "boolean" || ${o} === null
              || (${i} === "string" && ${o} && ${o} == +${o} && !(${o} % 1))`).assign(a, Xm._`+${o}`);
            return;
          case "boolean":
            r.elseIf(Xm._`${o} === "false" || ${o} === 0 || ${o} === null`).assign(a, false).elseIf(Xm._`${o} === "true" || ${o} === 1`).assign(a, true);
            return;
          case "null":
            r.elseIf(Xm._`${o} === "" || ${o} === 0 || ${o} === false`);
            r.assign(a, null);
            return;
          case "array":
            r.elseIf(Xm._`${i} === "string" || ${i} === "number"
              || ${i} === "boolean" || ${o} === null`).assign(a, Xm._`[${o}]`);
        }
      }
    }
    function Kpu({
      gen: e,
      parentData: t,
      parentDataProperty: n
    }, r) {
      e.if(Xm._`${t} !== undefined`, () => e.assign(Xm._`${t}[${n}]`, r));
    }
    function RIr(e, t, n, r = ttt.Correct) {
      let o = r === ttt.Correct ? Xm.operators.EQ : Xm.operators.NEQ;
      let s;
      switch (e) {
        case "null":
          return Xm._`${t} ${o} null`;
        case "array":
          s = Xm._`Array.isArray(${t})`;
          break;
        case "object":
          s = Xm._`${t} && typeof ${t} == "object" && !Array.isArray(${t})`;
          break;
        case "integer":
          s = i(Xm._`!(${t} % 1) && !isNaN(${t})`);
          break;
        case "number":
          s = i();
          break;
        default:
          return Xm._`typeof ${t} ${o} ${e}`;
      }
      return r === ttt.Correct ? s : (0, Xm.not)(s);
      function i(a = Xm.nil) {
        return (0, Xm.and)(Xm._`typeof ${t} == "number"`, a, n ? Xm._`isFinite(${t})` : Xm.nil);
      }
    }
    BB.checkDataType = RIr;
    function xIr(e, t, n, r) {
      if (e.length === 1) {
        return RIr(e[0], t, n, r);
      }
      let o;
      let s = (0, vys.toHash)(e);
      if (s.array && s.object) {
        let i = Xm._`typeof ${t} != "object"`;
        o = s.null ? i : Xm._`!${t} || ${i}`;
        delete s.null;
        delete s.array;
        delete s.object;
      } else {
        o = Xm.nil;
      }
      if (s.number) {
        delete s.integer;
      }
      for (let i in s) {
        o = (0, Xm.and)(o, RIr(i, t, n, r));
      }
      return o;
    }
    BB.checkDataTypes = xIr;
    var Ypu = {
      message: ({
        schema: e
      }) => `must be ${e}`,
      params: ({
        schema: e,
        schemaValue: t
      }) => typeof e == "string" ? Xm._`{type: ${e}}` : Xm._`{type: ${t}}`
    };
    function kIr(e) {
      let t = Jpu(e);
      (0, qpu.reportError)(t, Ypu);
    }
    BB.reportTypeError = kIr;
    function Jpu(e) {
      let {
        gen: t,
        data: n,
        schema: r
      } = e;
      let o = (0, vys.schemaRefOrVal)(e, r, "type");
      return {
        gen: t,
        keyword: "type",
        data: n,
        schema: r.type,
        schemaCode: o,
        schemaValue: o,
        parentSchema: r,
        params: {},
        vGd: e
      };
    }
  });
  var xys = __commonJS(Tmn => {
    Object.defineProperty(Tmn, "__esModule", {
      value: true
    });
    Tmn.assignDefaults = undefined;
    var ntt = Sf();
    var Xpu = Ty();
    function Qpu(e, t) {
      let {
        properties: n,
        items: r
      } = e.schema;
      if (t === "object" && n) {
        for (let o in n) {
          Rys(e, o, n[o].default);
        }
      } else if (t === "array" && Array.isArray(r)) {
        r.forEach((o, s) => Rys(e, s, o.default));
      }
    }
    Tmn.assignDefaults = Qpu;
    function Rys(e, t, n) {
      let {
        gen: r,
        compositeRule: o,
        data: s,
        opts: i
      } = e;
      if (n === undefined) {
        return;
      }
      let a = ntt._`${s}${(0, ntt.getProperty)(t)}`;
      if (o) {
        (0, Xpu.checkStrictMode)(e, `default is ignored for: ${a}`);
        return;
      }
      let l = ntt._`${a} === undefined`;
      if (i.useDefaults === "empty") {
        l = ntt._`${l} || ${a} === null || ${a} === ""`;
      }
      r.if(l, ntt._`${a} = ${(0, ntt.stringify)(n)}`);
    }
  });
  var G7 = __commonJS(UT => {
    Object.defineProperty(UT, "__esModule", {
      value: true
    });
    UT.validateUnion = UT.validateArray = UT.usePattern = UT.callValidateCode = UT.schemaProperties = UT.allSchemaProperties = UT.noPropertyInData = UT.propertyInData = UT.isOwnProperty = UT.hasPropFunc = UT.reportMissingProp = UT.checkMissingProp = UT.checkReportMissingProp = undefined;
    var fC = Sf();
    var AIr = Ty();
    var Gxe = uye();
    var Zpu = Ty();
    function emu(e, t) {
      let {
        gen: n,
        data: r,
        vGd: o
      } = e;
      n.if(PIr(n, r, t, o.opts.ownProperties), () => {
        e.setParams({
          missingProperty: fC._`${t}`
        }, true);
        e.error();
      });
    }
    UT.checkReportMissingProp = emu;
    function tmu({
      gen: e,
      data: t,
      vGd: {
        opts: n
      }
    }, r, o) {
      return (0, fC.or)(...r.map(s => (0, fC.and)(PIr(e, t, s, n.ownProperties), fC._`${o} = ${s}`)));
    }
    UT.checkMissingProp = tmu;
    function nmu(e, t) {
      e.setParams({
        missingProperty: t
      }, true);
      e.error();
    }
    UT.reportMissingProp = nmu;
    function kys(e) {
      return e.scopeValue("func", {
        ref: Object.prototype.hasOwnProperty,
        code: fC._`Object.prototype.hasOwnProperty`
      });
    }
    UT.hasPropFunc = kys;
    function IIr(e, t, n) {
      return fC._`${kys(e)}.call(${t}, ${n})`;
    }
    UT.isOwnProperty = IIr;
    function rmu(e, t, n, r) {
      let o = fC._`${t}${(0, fC.getProperty)(n)} !== undefined`;
      return r ? fC._`${o} && ${IIr(e, t, n)}` : o;
    }
    UT.propertyInData = rmu;
    function PIr(e, t, n, r) {
      let o = fC._`${t}${(0, fC.getProperty)(n)} === undefined`;
      return r ? (0, fC.or)(o, (0, fC.not)(IIr(e, t, n))) : o;
    }
    UT.noPropertyInData = PIr;
    function Ays(e) {
      return e ? Object.keys(e).filter(t => t !== "__proto__") : [];
    }
    UT.allSchemaProperties = Ays;
    function omu(e, t) {
      return Ays(t).filter(n => !(0, AIr.alwaysValidSchema)(e, t[n]));
    }
    UT.schemaProperties = omu;
    function smu({
      schemaCode: e,
      data: t,
      vGd: {
        gen: n,
        topSchemaRef: r,
        schemaPath: o,
        errorPath: s
      },
      vGd: i
    }, a, l, c) {
      let u = c ? fC._`${e}, ${t}, ${r}${o}` : t;
      let d = [[Gxe.default.instancePath, (0, fC.strConcat)(Gxe.default.instancePath, s)], [Gxe.default.parentData, i.parentData], [Gxe.default.parentDataProperty, i.parentDataProperty], [Gxe.default.rootData, Gxe.default.rootData]];
      if (i.opts.dynamicRef) {
        d.push([Gxe.default.dynamicAnchors, Gxe.default.dynamicAnchors]);
      }
      let p = fC._`${u}, ${n.object(...d)}`;
      return l !== fC.nil ? fC._`${a}.call(${l}, ${p})` : fC._`${a}(${p})`;
    }
    UT.callValidateCode = smu;
    var imu = fC._`new RegExp`;
    function amu({
      gen: e,
      vGd: {
        opts: t
      }
    }, n) {
      let r = t.unicodeRegExp ? "u" : "";
      let {
        regExp: o
      } = t.code;
      let s = o(n, r);
      return e.scopeValue("pattern", {
        key: s.toString(),
        ref: s,
        code: fC._`${o.code === "new RegExp" ? imu : (0, Zpu.useFunc)(e, o)}(${n}, ${r})`
      });
    }
    UT.usePattern = amu;
    function lmu(e) {
      let {
        gen: t,
        data: n,
        keyword: r,
        vGd: o
      } = e;
      let s = t.name("valid");
      if (o.allErrors) {
        let a = t.let("valid", true);
        i(() => t.assign(a, false));
        return a;
      }
      t.var(s, true);
      i(() => t.break());
      return s;
      function i(a) {
        let l = t.const("len", fC._`${n}.length`);
        t.forRange("i", 0, l, c => {
          e.subschema({
            keyword: r,
            dataProp: c,
            dataPropType: AIr.Type.Num
          }, s);
          t.if((0, fC.not)(s), a);
        });
      }
    }
    UT.validateArray = lmu;
    function cmu(e) {
      let {
        gen: t,
        schema: n,
        keyword: r,
        vGd: o
      } = e;
      if (!Array.isArray(n)) {
        throw Error("ajv implementation error");
      }
      if (n.some(l => (0, AIr.alwaysValidSchema)(o, l)) && !o.opts.unevaluated) {
        return;
      }
      let i = t.let("valid", false);
      let a = t.name("_valid");
      t.block(() => n.forEach((l, c) => {
        let u = e.subschema({
          keyword: r,
          schemaProp: c,
          compositeRule: true
        }, a);
        if (t.assign(i, fC._`${i} || ${a}`), !e.mergeValidEvaluated(u, a)) {
          t.if((0, fC.not)(i));
        }
      }));
      e.result(i, () => e.reset(), () => e.error(true));
    }
    UT.validateUnion = cmu;
  });
  var Oys = __commonJS(Zae => {
    Object.defineProperty(Zae, "__esModule", {
      value: true
    });
    Zae.validateKeywordUsage = Zae.validSchemaType = Zae.funcKeywordCode = Zae.macroKeywordCode = undefined;
    var _j = Sf();
    var fHe = uye();
    var umu = G7();
    var dmu = gOt();
    function pmu(e, t) {
      let {
        gen: n,
        keyword: r,
        schema: o,
        parentSchema: s,
        vGd: i
      } = e;
      let a = t.macro.call(i.self, o, s, i);
      let l = Pys(n, r, a);
      if (i.opts.validateSchema !== false) {
        i.self.validateSchema(a, true);
      }
      let c = n.name("valid");
      e.subschema({
        schema: a,
        schemaPath: _j.nil,
        errSchemaPath: `${i.errSchemaPath}/${r}`,
        topSchemaRef: l,
        compositeRule: true
      }, c);
      e.pass(c, () => e.error(true));
    }
    Zae.macroKeywordCode = pmu;
    function mmu(e, t) {
      var n;
      let {
        gen: r,
        keyword: o,
        schema: s,
        parentSchema: i,
        $data: a,
        vGd: l
      } = e;
      hmu(l, t);
      let c = !a && t.compile ? t.compile.call(l.self, s, i, l) : t.validate;
      let u = Pys(r, o, c);
      let d = r.let("valid");
      e.block$data(d, p);
      e.ok((n = t.valid) !== null && n !== undefined ? n : d);
      function p() {
        if (t.errors === false) {
          if (h(), t.modifying) {
            Iys(e);
          }
          g(() => e.error());
        } else {
          let y = t.async ? m() : f();
          if (t.modifying) {
            Iys(e);
          }
          g(() => fmu(e, y));
        }
      }
      function m() {
        let y = r.let("ruleErrs", null);
        r.try(() => h(_j._`await `), _ => r.assign(d, false).if(_j._`${_} instanceof ${l.ValidationError}`, () => r.assign(y, _j._`${_}.errors`), () => r.throw(_)));
        return y;
      }
      function f() {
        let y = _j._`${u}.errors`;
        r.assign(y, null);
        h(_j.nil);
        return y;
      }
      function h(y = t.async ? _j._`await ` : _j.nil) {
        let _ = l.opts.passContext ? fHe.default.this : fHe.default.self;
        let b = !("compile" in t && !a || t.schema === false);
        r.assign(d, _j._`${y}${(0, umu.callValidateCode)(e, u, _, b)}`, t.modifying);
      }
      function g(y) {
        var _;
        r.if((0, _j.not)((_ = t.valid) !== null && _ !== undefined ? _ : d), y);
      }
    }
    Zae.funcKeywordCode = mmu;
    function Iys(e) {
      let {
        gen: t,
        data: n,
        vGd: r
      } = e;
      t.if(r.parentData, () => t.assign(n, _j._`${r.parentData}[${r.parentDataProperty}]`));
    }
    function fmu(e, t) {
      let {
        gen: n
      } = e;
      n.if(_j._`Array.isArray(${t})`, () => {
        n.assign(fHe.default.vErrors, _j._`${fHe.default.vErrors} === null ? ${t} : ${fHe.default.vErrors}.concat(${t})`).assign(fHe.default.errors, _j._`${fHe.default.vErrors}.length`);
        (0, dmu.extendErrors)(e);
      }, () => e.error());
    }
    function hmu({
      schemaEnv: e
    }, t) {
      if (t.async && !e.$async) {
        throw Error("async keyword in sync schema");
      }
    }
    function Pys(e, t, n) {
      if (n === undefined) {
        throw Error(`keyword "${t}" failed to compile`);
      }
      return e.scopeValue("keyword", typeof n == "function" ? {
        ref: n
      } : {
        ref: n,
        code: (0, _j.stringify)(n)
      });
    }
    function gmu(e, t, n = false) {
      return !t.length || t.some(r => r === "array" ? Array.isArray(e) : r === "object" ? e && typeof e == "object" && !Array.isArray(e) : typeof e == r || n && typeof e > "u");
    }
    Zae.validSchemaType = gmu;
    function ymu({
      schema: e,
      opts: t,
      self: n,
      errSchemaPath: r
    }, o, s) {
      if (Array.isArray(o.keyword) ? !o.keyword.includes(s) : o.keyword !== s) {
        throw Error("ajv implementation error");
      }
      let i = o.dependencies;
      if (i === null || i === undefined ? undefined : i.some(a => !Object.prototype.hasOwnProperty.call(e, a))) {
        throw Error(`parent schema must have dependencies of ${s}: ${i.join(",")}`);
      }
      if (o.validateSchema) {
        if (!o.validateSchema(e[s])) {
          let l = `keyword "${s}" value is invalid at path "${r}": ` + n.errorsText(o.validateSchema.errors);
          if (t.validateSchema === "log") {
            n.logger.error(l);
          } else {
            throw Error(l);
          }
        }
      }
    }
    Zae.validateKeywordUsage = ymu;
  });
  var Mys = __commonJS(Vxe => {
    Object.defineProperty(Vxe, "__esModule", {
      value: true
    });
    Vxe.extendSubschemaMode = Vxe.extendSubschemaData = Vxe.getSubschema = undefined;
    var ele = Sf();
    var Dys = Ty();
    function _mu(e, {
      keyword: t,
      schemaProp: n,
      schema: r,
      schemaPath: o,
      errSchemaPath: s,
      topSchemaRef: i
    }) {
      if (t !== undefined && r !== undefined) {
        throw Error('both "keyword" and "schema" passed, only one allowed');
      }
      if (t !== undefined) {
        let a = e.schema[t];
        return n === undefined ? {
          schema: a,
          schemaPath: ele._`${e.schemaPath}${(0, ele.getProperty)(t)}`,
          errSchemaPath: `${e.errSchemaPath}/${t}`
        } : {
          schema: a[n],
          schemaPath: ele._`${e.schemaPath}${(0, ele.getProperty)(t)}${(0, ele.getProperty)(n)}`,
          errSchemaPath: `${e.errSchemaPath}/${t}/${(0, Dys.escapeFragment)(n)}`
        };
      }
      if (r !== undefined) {
        if (o === undefined || s === undefined || i === undefined) {
          throw Error('"schemaPath", "errSchemaPath" and "topSchemaRef" are required with "schema"');
        }
        return {
          schema: r,
          schemaPath: o,
          topSchemaRef: i,
          errSchemaPath: s
        };
      }
      throw Error('either "keyword" or "schema" must be passed');
    }
    Vxe.getSubschema = _mu;
    function bmu(e, t, {
      dataProp: n,
      dataPropType: r,
      data: o,
      dataTypes: s,
      propertyName: i
    }) {
      if (o !== undefined && n !== undefined) {
        throw Error('both "data" and "dataProp" passed, only one allowed');
      }
      let {
        gen: a
      } = t;
      if (n !== undefined) {
        let {
          errorPath: c,
          dataPathArr: u,
          opts: d
        } = t;
        let p = a.let("data", ele._`${t.data}${(0, ele.getProperty)(n)}`, true);
        l(p);
        e.errorPath = ele.str`${c}${(0, Dys.getErrorPath)(n, r, d.jsPropertySyntax)}`;
        e.parentDataProperty = ele._`${n}`;
        e.dataPathArr = [...u, e.parentDataProperty];
      }
      if (o !== undefined) {
        let c = o instanceof ele.Name ? o : a.let("data", o, true);
        if (l(c), i !== undefined) {
          e.propertyName = i;
        }
      }
      if (s) {
        e.dataTypes = s;
      }
      function l(c) {
        e.data = c;
        e.dataLevel = t.dataLevel + 1;
        e.dataTypes = [];
        t.definedProperties = new Set();
        e.parentData = t.data;
        e.dataNames = [...t.dataNames, c];
      }
    }
    Vxe.extendSubschemaData = bmu;
    function Smu(e, {
      jtdDiscriminator: t,
      jtdMetadata: n,
      compositeRule: r,
      createErrors: o,
      allErrors: s
    }) {
      if (r !== undefined) {
        e.compositeRule = r;
      }
      if (o !== undefined) {
        e.createErrors = o;
      }
      if (s !== undefined) {
        e.allErrors = s;
      }
      e.jtdDiscriminator = t;
      e.jtdMetadata = n;
    }
    Vxe.extendSubschemaMode = Smu;
  });
  var OIr = __commonJS((smh, Nys) => {
    Nys.exports = function e(t, n) {
      if (t === n) {
        return true;
      }
      if (t && n && typeof t == "object" && typeof n == "object") {
        if (t.constructor !== n.constructor) {
          return false;
        }
        var r;
        var o;
        var s;
        if (Array.isArray(t)) {
          if (r = t.length, r != n.length) {
            return false;
          }
          for (o = r; o-- !== 0;) {
            if (!e(t[o], n[o])) {
              return false;
            }
          }
          return true;
        }
        if (t.constructor === RegExp) {
          return t.source === n.source && t.flags === n.flags;
        }
        if (t.valueOf !== Object.prototype.valueOf) {
          return t.valueOf() === n.valueOf();
        }
        if (t.toString !== Object.prototype.toString) {
          return t.toString() === n.toString();
        }
        if (s = Object.keys(t), r = s.length, r !== Object.keys(n).length) {
          return false;
        }
        for (o = r; o-- !== 0;) {
          if (!Object.prototype.hasOwnProperty.call(n, s[o])) {
            return false;
          }
        }
        for (o = r; o-- !== 0;) {
          var i = s[o];
          if (!e(t[i], n[i])) {
            return false;
          }
        }
        return true;
      }
      return t !== t && n !== n;
    };
  });
  var Fys = __commonJS((imh, Lys) => {
    var zxe = Lys.exports = function (e, t, n) {
      if (typeof t == "function") {
        n = t;
        t = {};
      }
      n = t.cb || n;
      var r = typeof n == "function" ? n : n.pre || function () {};
      var o = n.post || function () {};
      Emn(t, r, o, e, "", e);
    };
    zxe.keywords = {
      additionalItems: true,
      items: true,
      contains: true,
      additionalProperties: true,
      propertyNames: true,
      not: true,
      if: true,
      then: true,
      else: true
    };
    zxe.arrayKeywords = {
      items: true,
      allOf: true,
      anyOf: true,
      oneOf: true
    };
    zxe.propsKeywords = {
      $defs: true,
      definitions: true,
      properties: true,
      patternProperties: true,
      dependencies: true
    };
    zxe.skipKeywords = {
      default: true,
      enum: true,
      const: true,
      required: true,
      maximum: true,
      minimum: true,
      exclusiveMaximum: true,
      exclusiveMinimum: true,
      multipleOf: true,
      maxLength: true,
      minLength: true,
      pattern: true,
      format: true,
      maxItems: true,
      minItems: true,
      uniqueItems: true,
      maxProperties: true,
      minProperties: true
    };
    function Emn(e, t, n, r, o, s, i, a, l, c) {
      if (r && typeof r == "object" && !Array.isArray(r)) {
        t(r, o, s, i, a, l, c);
        for (var u in r) {
          var d = r[u];
          if (Array.isArray(d)) {
            if (u in zxe.arrayKeywords) {
              for (var p = 0; p < d.length; p++) {
                Emn(e, t, n, d[p], o + "/" + u + "/" + p, s, o, u, r, p);
              }
            }
          } else if (u in zxe.propsKeywords) {
            if (d && typeof d == "object") {
              for (var m in d) {
                Emn(e, t, n, d[m], o + "/" + u + "/" + Tmu(m), s, o, u, r, m);
              }
            }
          } else if (u in zxe.keywords || e.allKeys && !(u in zxe.skipKeywords)) {
            Emn(e, t, n, d, o + "/" + u, s, o, u, r);
          }
        }
        n(r, o, s, i, a, l, c);
      }
    }
    function Tmu(e) {
      return e.replace(/~/g, "~0").replace(/\//g, "~1");
    }
  });
  var _Ot = __commonJS(Y4 => {
    Object.defineProperty(Y4, "__esModule", {
      value: true
    });
    Y4.getSchemaRefs = Y4.resolveUrl = Y4.normalizeId = Y4._getFullPath = Y4.getFullPath = Y4.inlineRef = undefined;
    var Emu = Ty();
    var vmu = OIr();
    var wmu = Fys();
    var Cmu = new Set(["type", "format", "pattern", "maxLength", "minLength", "maxProperties", "minProperties", "maxItems", "minItems", "maximum", "minimum", "uniqueItems", "multipleOf", "required", "enum", "const"]);
    function Rmu(e, t = true) {
      if (typeof e == "boolean") {
        return true;
      }
      if (t === true) {
        return !DIr(e);
      }
      if (!t) {
        return false;
      }
      return Uys(e) <= t;
    }
    Y4.inlineRef = Rmu;
    var xmu = new Set(["$ref", "$recursiveRef", "$recursiveAnchor", "$dynamicRef", "$dynamicAnchor"]);
    function DIr(e) {
      for (let t in e) {
        if (xmu.vZc(t)) {
          return true;
        }
        let n = e[t];
        if (Array.isArray(n) && n.some(DIr)) {
          return true;
        }
        if (typeof n == "object" && DIr(n)) {
          return true;
        }
      }
      return false;
    }
    function Uys(e) {
      let t = 0;
      for (let n in e) {
        if (n === "$ref") {
          return 1 / 0;
        }
        if (t++, Cmu.vZc(n)) {
          continue;
        }
        if (typeof e[n] == "object") {
          (0, Emu.eachItem)(e[n], r => t += Uys(r));
        }
        if (t === 1 / 0) {
          return 1 / 0;
        }
      }
      return t;
    }
    function Bys(e, t = "", n) {
      if (n !== false) {
        t = rtt(t);
      }
      let r = e.parse(t);
      return $ys(e, r);
    }
    Y4.getFullPath = Bys;
    function $ys(e, t) {
      return e.serialize(t).split("#")[0] + "#";
    }
    Y4._getFullPath = $ys;
    function rtt(e) {
      return e ? e.replace(/#\/?$/, "") : "";
    }
    Y4.normalizeId = rtt;
    function Amu(e, t, n) {
      n = rtt(n);
      return e.resolve(t, n);
    }
    Y4.resolveUrl = Amu;
    function Pmu(e, t) {
      if (typeof e == "boolean") {
        return {};
      }
      let {
        schemaId: n,
        uriResolver: r
      } = this.opts;
      let o = rtt(e[n] || t);
      let s = {
        "": o
      };
      let i = Bys(r, o, false);
      let a = {};
      let l = new Set();
      wmu(e, {
        allKeys: true
      }, (d, p, m, f) => {
        if (f === undefined) {
          return;
        }
        let h = i + p;
        let g = s[f];
        if (typeof d[n] == "string") {
          g = y.call(this, d[n]);
        }
        _.call(this, d.$anchor);
        _.call(this, d.$dynamicAnchor);
        s[p] = g;
        function y(b) {
          let S = this.opts.uriResolver.resolve;
          if (b = rtt(g ? S(g, b) : b), l.vZc(b)) {
            throw u(b);
          }
          l.add(b);
          let E = this.refs[b];
          if (typeof E == "string") {
            E = this.refs[E];
          }
          if (typeof E == "object") {
            c(d, E.schema, b);
          } else if (b !== rtt(h)) {
            if (b[0] === "#") {
              c(d, a[b], b);
              a[b] = d;
            } else {
              this.refs[b] = h;
            }
          }
          return b;
        }
        function _(b) {
          if (typeof b == "string") {
            if (!(/^[a-z_][-a-z0-9._]*$/i).test(b)) {
              throw Error(`invalid anchor "${b}"`);
            }
            y.call(this, `#${b}`);
          }
        }
      });
      return a;
      function c(d, p, m) {
        if (p !== undefined && !vmu(d, p)) {
          throw u(m);
        }
      }
      function u(d) {
        return Error(`reference "${d}" resolves to more than one schema`);
      }
    }
    Y4.getSchemaRefs = Pmu;
  });
  var TOt = __commonJS(Kxe => {
    Object.defineProperty(Kxe, "__esModule", {
      value: true
    });
    Kxe.getData = Kxe.KeywordCxt = Kxe.validateFunctionCode = undefined;
    var Gys = Sys();
    var Hys = yOt();
    var NIr = CIr();
    var vmn = yOt();
    var Omu = xys();
    var SOt = Oys();
    var MIr = Mys();
    var cu = Sf();
    var Op = uye();
    var Dmu = _Ot();
    var dye = Ty();
    var bOt = gOt();
    function Mmu(e) {
      if (Kys(e)) {
        if (Yys(e), zys(e)) {
          Fmu(e);
          return;
        }
      }
      Vys(e, () => (0, Gys.topBoolOrEmptySchema)(e));
    }
    Kxe.validateFunctionCode = Mmu;
    function Vys({
      gen: e,
      validateName: t,
      schema: n,
      schemaEnv: r,
      opts: o
    }, s) {
      if (o.code.es5) {
        e.func(t, cu._`${Op.default.data}, ${Op.default.valCxt}`, r.$async, () => {
          e.code(cu._`"use strict"; ${jys(n, o)}`);
          Lmu(e, o);
          e.code(s);
        });
      } else {
        e.func(t, cu._`${Op.default.data}, ${Nmu(o)}`, r.$async, () => e.code(jys(n, o)).code(s));
      }
    }
    function Nmu(e) {
      return cu._`{${Op.default.instancePath}="", ${Op.default.parentData}, ${Op.default.parentDataProperty}, ${Op.default.rootData}=${Op.default.data}${e.dynamicRef ? cu._`, ${Op.default.dynamicAnchors}={}` : cu.nil}}={}`;
    }
    function Lmu(e, t) {
      e.if(Op.default.valCxt, () => {
        if (e.var(Op.default.instancePath, cu._`${Op.default.valCxt}.${Op.default.instancePath}`), e.var(Op.default.parentData, cu._`${Op.default.valCxt}.${Op.default.parentData}`), e.var(Op.default.parentDataProperty, cu._`${Op.default.valCxt}.${Op.default.parentDataProperty}`), e.var(Op.default.rootData, cu._`${Op.default.valCxt}.${Op.default.rootData}`), t.dynamicRef) {
          e.var(Op.default.dynamicAnchors, cu._`${Op.default.valCxt}.${Op.default.dynamicAnchors}`);
        }
      }, () => {
        if (e.var(Op.default.instancePath, cu._`""`), e.var(Op.default.parentData, cu._`undefined`), e.var(Op.default.parentDataProperty, cu._`undefined`), e.var(Op.default.rootData, Op.default.data), t.dynamicRef) {
          e.var(Op.default.dynamicAnchors, cu._`{}`);
        }
      });
    }
    function Fmu(e) {
      let {
        schema: t,
        opts: n,
        gen: r
      } = e;
      Vys(e, () => {
        if (n.$comment && t.$comment) {
          Xys(e);
        }
        if (jmu(e), r.let(Op.default.vErrors, null), r.let(Op.default.errors, 0), n.unevaluated) {
          Umu(e);
        }
        Jys(e);
        Gmu(e);
      });
      return;
    }
    function Umu(e) {
      let {
        gen: t,
        validateName: n
      } = e;
      e.evaluated = t.const("evaluated", cu._`${n}.evaluated`);
      t.if(cu._`${e.evaluated}.dynamicProps`, () => t.assign(cu._`${e.evaluated}.props`, cu._`undefined`));
      t.if(cu._`${e.evaluated}.dynamicItems`, () => t.assign(cu._`${e.evaluated}.items`, cu._`undefined`));
    }
    function jys(e, t) {
      let n = typeof e == "object" && e[t.schemaId];
      return n && (t.code.source || t.code.process) ? cu._`/*# sourceURL=${n} */` : cu.nil;
    }
    function Bmu(e, t) {
      if (Kys(e)) {
        if (Yys(e), zys(e)) {
          $mu(e, t);
          return;
        }
      }
      (0, Gys.boolOrEmptySchema)(e, t);
    }
    function zys({
      schema: e,
      self: t
    }) {
      if (typeof e == "boolean") {
        return !e;
      }
      for (let n in e) {
        if (t.RULES.all[n]) {
          return true;
        }
      }
      return false;
    }
    function Kys(e) {
      return typeof e.schema != "boolean";
    }
    function $mu(e, t) {
      let {
        schema: n,
        gen: r,
        opts: o
      } = e;
      if (o.$comment && n.$comment) {
        Xys(e);
      }
      qmu(e);
      Wmu(e);
      let s = r.const("_errs", Op.default.errors);
      Jys(e, s);
      r.var(t, cu._`${s} === ${Op.default.errors}`);
    }
    function Yys(e) {
      (0, dye.checkUnknownRules)(e);
      Hmu(e);
    }
    function Jys(e, t) {
      if (e.opts.jtd) {
        return qys(e, [], false, t);
      }
      let n = (0, Hys.getSchemaTypes)(e.schema);
      let r = (0, Hys.coerceAndCheckDataType)(e, n);
      qys(e, n, !r, t);
    }
    function Hmu(e) {
      let {
        schema: t,
        errSchemaPath: n,
        opts: r,
        self: o
      } = e;
      if (t.$ref && r.ignoreKeywordsWithRef && (0, dye.schemaHasRulesButRef)(t, o.RULES)) {
        o.logger.warn(`$ref: keywords ignored in schema at path "${n}"`);
      }
    }
    function jmu(e) {
      let {
        schema: t,
        opts: n
      } = e;
      if (t.default !== undefined && n.useDefaults && n.strictSchema) {
        (0, dye.checkStrictMode)(e, "default is ignored in the schema root");
      }
    }
    function qmu(e) {
      let t = e.schema[e.opts.schemaId];
      if (t) {
        e.baseId = (0, Dmu.resolveUrl)(e.opts.uriResolver, e.baseId, t);
      }
    }
    function Wmu(e) {
      if (e.schema.$async && !e.schemaEnv.$async) {
        throw Error("async schema in sync schema");
      }
    }
    function Xys({
      gen: e,
      schemaEnv: t,
      schema: n,
      errSchemaPath: r,
      opts: o
    }) {
      let s = n.$comment;
      if (o.$comment === true) {
        e.code(cu._`${Op.default.self}.logger.log(${s})`);
      } else if (typeof o.$comment == "function") {
        let i = cu.str`${r}/$comment`;
        let a = e.scopeValue("root", {
          ref: t.root
        });
        e.code(cu._`${Op.default.self}.opts.$comment(${s}, ${i}, ${a}.schema)`);
      }
    }
    function Gmu(e) {
      let {
        gen: t,
        schemaEnv: n,
        validateName: r,
        ValidationError: o,
        opts: s
      } = e;
      if (n.$async) {
        t.if(cu._`${Op.default.errors} === 0`, () => t.return(Op.default.data), () => t.throw(cu._`new ${o}(${Op.default.vErrors})`));
      } else {
        if (t.assign(cu._`${r}.errors`, Op.default.vErrors), s.unevaluated) {
          Vmu(e);
        }
        t.return(cu._`${Op.default.errors} === 0`);
      }
    }
    function Vmu({
      gen: e,
      evaluated: t,
      props: n,
      items: r
    }) {
      if (n instanceof cu.Name) {
        e.assign(cu._`${t}.props`, n);
      }
      if (r instanceof cu.Name) {
        e.assign(cu._`${t}.items`, r);
      }
    }
    function qys(e, t, n, r) {
      let {
        gen: o,
        schema: s,
        data: i,
        allErrors: a,
        opts: l,
        self: c
      } = e;
      let {
        RULES: u
      } = c;
      if (s.$ref && (l.ignoreKeywordsWithRef || !(0, dye.schemaHasRulesButRef)(s, u))) {
        o.block(() => Zys(e, "$ref", u.all.$ref.definition));
        return;
      }
      if (!l.jtd) {
        zmu(e, t);
      }
      o.block(() => {
        for (let p of u.rules) {
          d(p);
        }
        d(u.post);
      });
      function d(p) {
        if (!(0, NIr.shouldUseGroup)(s, p)) {
          return;
        }
        if (p.type) {
          if (o.if((0, vmn.checkDataType)(p.type, i, l.strictNumbers)), Wys(e, p), t.length === 1 && t[0] === p.type && n) {
            o.else();
            (0, vmn.reportTypeError)(e);
          }
          o.endIf();
        } else {
          Wys(e, p);
        }
        if (!a) {
          o.if(cu._`${Op.default.errors} === ${r || 0}`);
        }
      }
    }
    function Wys(e, t) {
      let {
        gen: n,
        schema: r,
        opts: {
          useDefaults: o
        }
      } = e;
      if (o) {
        (0, Omu.assignDefaults)(e, t.type);
      }
      n.block(() => {
        for (let s of t.rules) {
          if ((0, NIr.shouldUseRule)(r, s)) {
            Zys(e, s.keyword, s.definition, t.type);
          }
        }
      });
    }
    function zmu(e, t) {
      if (e.schemaEnv.meta || !e.opts.strictTypes) {
        return;
      }
      if (Kmu(e, t), !e.opts.allowUnionTypes) {
        Ymu(e, t);
      }
      Jmu(e, e.dataTypes);
    }
    function Kmu(e, t) {
      if (!t.length) {
        return;
      }
      if (!e.dataTypes.length) {
        e.dataTypes = t;
        return;
      }
      t.forEach(n => {
        if (!Qys(e.dataTypes, n)) {
          LIr(e, `type "${n}" not allowed by context "${e.dataTypes.join(",")}"`);
        }
      });
      Qmu(e, t);
    }
    function Ymu(e, t) {
      if (t.length > 1 && !(t.length === 2 && t.includes("null"))) {
        LIr(e, "use allowUnionTypes to allow union type keyword");
      }
    }
    function Jmu(e, t) {
      let n = e.self.RULES.all;
      for (let r in n) {
        let o = n[r];
        if (typeof o == "object" && (0, NIr.shouldUseRule)(e.schema, o)) {
          let {
            type: s
          } = o.definition;
          if (s.length && !s.some(i => Xmu(t, i))) {
            LIr(e, `missing type "${s.join(",")}" for keyword "${r}"`);
          }
        }
      }
    }
    function Xmu(e, t) {
      return e.includes(t) || t === "number" && e.includes("integer");
    }
    function Qys(e, t) {
      return e.includes(t) || t === "integer" && e.includes("number");
    }
    function Qmu(e, t) {
      let n = [];
      for (let r of e.dataTypes) {
        if (Qys(t, r)) {
          n.push(r);
        } else if (t.includes("integer") && r === "number") {
          n.push("integer");
        }
      }
      e.dataTypes = n;
    }
    function LIr(e, t) {
      let n = e.schemaEnv.baseId + e.errSchemaPath;
      t += ` at "${n}" (strictTypes)`;
      (0, dye.checkStrictMode)(e, t, e.opts.strictTypes);
    }
    class FIr {
      constructor(e, t, n) {
        if ((0, SOt.validateKeywordUsage)(e, t, n), this.gen = e.gen, this.allErrors = e.allErrors, this.keyword = n, this.data = e.data, this.schema = e.schema[n], this.$data = t.$data && e.opts.$data && this.schema && this.schema.$data, this.schemaValue = (0, dye.schemaRefOrVal)(e, this.schema, n, this.$data), this.schemaType = t.schemaType, this.parentSchema = e.schema, this.params = {}, this.vGd = e, this.def = t, this.$data) {
          this.schemaCode = e.gen.const("vSchema", e_s(this.$data, e));
        } else if (this.schemaCode = this.schemaValue, !(0, SOt.validSchemaType)(this.schema, t.schemaType, t.allowUndefined)) {
          throw Error(`${n} value must be ${JSON.stringify(t.schemaType)}`);
        }
        if ("code" in t ? t.trackErrors : t.errors !== false) {
          this.errsCount = e.gen.const("_errs", Op.default.errors);
        }
      }
      result(e, t, n) {
        this.failResult((0, cu.not)(e), t, n);
      }
      failResult(e, t, n) {
        if (this.gen.if(e), n) {
          n();
        } else {
          this.error();
        }
        if (t) {
          if (this.gen.else(), t(), this.allErrors) {
            this.gen.endIf();
          }
        } else if (this.allErrors) {
          this.gen.endIf();
        } else {
          this.gen.else();
        }
      }
      pass(e, t) {
        this.failResult((0, cu.not)(e), undefined, t);
      }
      fail(e) {
        if (e === undefined) {
          if (this.error(), !this.allErrors) {
            this.gen.if(false);
          }
          return;
        }
        if (this.gen.if(e), this.error(), this.allErrors) {
          this.gen.endIf();
        } else {
          this.gen.else();
        }
      }
      fail$data(e) {
        if (!this.$data) {
          return this.fail(e);
        }
        let {
          schemaCode: t
        } = this;
        this.fail(cu._`${t} !== undefined && (${(0, cu.or)(this.invalid$data(), e)})`);
      }
      error(e, t, n) {
        if (t) {
          this.setParams(t);
          this._error(e, n);
          this.setParams({});
          return;
        }
        this._error(e, n);
      }
      _error(e, t) {
        (e ? bOt.reportExtraError : bOt.reportError)(this, this.def.error, t);
      }
      $dataError() {
        (0, bOt.reportError)(this, this.def.$dataError || bOt.keyword$DataError);
      }
      reset() {
        if (this.errsCount === undefined) {
          throw Error('add "trackErrors" to keyword definition');
        }
        (0, bOt.resetErrorsCount)(this.gen, this.errsCount);
      }
      ok(e) {
        if (!this.allErrors) {
          this.gen.if(e);
        }
      }
      setParams(e, t) {
        if (t) {
          Object.assign(this.params, e);
        } else {
          this.params = e;
        }
      }
      block$data(e, t, n = cu.nil) {
        this.gen.block(() => {
          this.check$data(e, n);
          t();
        });
      }
      check$data(e = cu.nil, t = cu.nil) {
        if (!this.$data) {
          return;
        }
        let {
          gen: n,
          schemaCode: r,
          schemaType: o,
          def: s
        } = this;
        if (n.if((0, cu.or)(cu._`${r} === undefined`, t)), e !== cu.nil) {
          n.assign(e, true);
        }
        if (o.length || s.validateSchema) {
          if (n.elseIf(this.invalid$data()), this.$dataError(), e !== cu.nil) {
            n.assign(e, false);
          }
        }
        n.else();
      }
      invalid$data() {
        let {
          gen: e,
          schemaCode: t,
          schemaType: n,
          def: r,
          vGd: o
        } = this;
        return (0, cu.or)(s(), i());
        function s() {
          if (n.length) {
            if (!(t instanceof cu.Name)) {
              throw Error("ajv implementation error");
            }
            let a = Array.isArray(n) ? n : [n];
            return cu._`${(0, vmn.checkDataTypes)(a, t, o.opts.strictNumbers, vmn.DataType.Wrong)}`;
          }
          return cu.nil;
        }
        function i() {
          if (r.validateSchema) {
            let a = e.scopeValue("validate$data", {
              ref: r.validateSchema
            });
            return cu._`!${a}(${t})`;
          }
          return cu.nil;
        }
      }
      subschema(e, t) {
        let n = (0, MIr.getSubschema)(this.vGd, e);
        (0, MIr.extendSubschemaData)(n, this.vGd, e);
        (0, MIr.extendSubschemaMode)(n, e);
        let r = {
          ...this.vGd,
          ...n,
          items: undefined,
          props: undefined
        };
        Bmu(r, t);
        return r;
      }
      mergeEvaluated(e, t) {
        let {
          vGd: n,
          gen: r
        } = this;
        if (!n.opts.unevaluated) {
          return;
        }
        if (n.props !== true && e.props !== undefined) {
          n.props = dye.mergeEvaluated.props(r, e.props, n.props, t);
        }
        if (n.items !== true && e.items !== undefined) {
          n.items = dye.mergeEvaluated.items(r, e.items, n.items, t);
        }
      }
      mergeValidEvaluated(e, t) {
        let {
          vGd: n,
          gen: r
        } = this;
        if (n.opts.unevaluated && (n.props !== true || n.items !== true)) {
          r.if(t, () => this.mergeEvaluated(e, cu.Name));
          return true;
        }
      }
    }
    Kxe.KeywordCxt = FIr;
    function Zys(e, t, n, r) {
      let o = new FIr(e, n, t);
      if ("code" in n) {
        n.code(o, r);
      } else if (o.$data && n.validate) {
        (0, SOt.funcKeywordCode)(o, n);
      } else if ("macro" in n) {
        (0, SOt.macroKeywordCode)(o, n);
      } else if (n.compile || n.validate) {
        (0, SOt.funcKeywordCode)(o, n);
      }
    }
    function e_s(e, {
      dataLevel: t,
      dataNames: n,
      dataPathArr: r
    }) {
      let o;
      let s;
      if (e === "") {
        return Op.default.rootData;
      }
      if (e[0] === "/") {
        if (!(/^\/(?:[^~]|~0|~1)*$/).test(e)) {
          throw Error(`Invalid JSON-pointer: ${e}`);
        }
        o = e;
        s = Op.default.rootData;
      } else {
        let c = (/^([0-9]+)(#|\/(?:[^~]|~0|~1)*)?$/).exec(e);
        if (!c) {
          throw Error(`Invalid JSON-pointer: ${e}`);
        }
        let u = +c[1];
        if (o = c[2], o === "#") {
          if (u >= t) {
            throw Error(l("property/index", u));
          }
          return r[t - u];
        }
        if (u > t) {
          throw Error(l("data", u));
        }
        if (s = n[t - u], !o) {
          return s;
        }
      }
      let i = s;
      let a = o.split("/");
      for (let c of a) {
        if (c) {
          s = cu._`${s}${(0, cu.getProperty)((0, dye.unescapeJsonPointer)(c))}`;
          i = cu._`${i} && ${s}`;
        }
      }
      return i;
      function l(c, u) {
        return `Cannot access ${c} ${u} levels up, current level is ${t}`;
      }
    }
    Kxe.getData = e_s;
  });
  var wmn = __commonJS(UIr => {
    Object.defineProperty(UIr, "__esModule", {
      value: true
    });
    class t_s extends Error {
      constructor(e) {
        super("validation failed");
        this.errors = e;
        this.ajv = this.validation = true;
      }
    }
    UIr.default = t_s;
  });
  var EOt = __commonJS($Ir => {
    Object.defineProperty($Ir, "__esModule", {
      value: true
    });
    var BIr = _Ot();
    class n_s extends Error {
      constructor(e, t, n, r) {
        super(r || `can't resolve reference ${n} from id ${t}`);
        this.missingRef = (0, BIr.resolveUrl)(e, t, n);
        this.missingSchema = (0, BIr.normalizeId)((0, BIr.getFullPath)(e, this.missingRef));
      }
    }
    $Ir.default = n_s;
  });
  var Rmn = __commonJS(V7 => {
    Object.defineProperty(V7, "__esModule", {
      value: true
    });
    V7.resolveSchema = V7.getCompilingSchema = V7.resolveRef = V7.compileSchema = V7.SchemaEnv = undefined;
    var Cte = Sf();
    var tfu = wmn();
    var hHe = uye();
    var Rte = _Ot();
    var r_s = Ty();
    var nfu = TOt();
    class vOt {
      constructor(e) {
        var t;
        this.refs = {};
        this.dynamicAnchors = {};
        let n;
        if (typeof e.schema == "object") {
          n = e.schema;
        }
        this.schema = e.schema;
        this.schemaId = e.schemaId;
        this.root = e.root || this;
        this.baseId = (t = e.baseId) !== null && t !== undefined ? t : (0, Rte.normalizeId)(n === null || n === undefined ? undefined : n[e.schemaId || "$id"]);
        this.schemaPath = e.schemaPath;
        this.localRefs = e.localRefs;
        this.meta = e.meta;
        this.$async = n === null || n === undefined ? undefined : n.$async;
        this.refs = {};
      }
    }
    V7.SchemaEnv = vOt;
    function jIr(e) {
      let t = o_s.call(this, e);
      if (t) {
        return t;
      }
      let n = (0, Rte.getFullPath)(this.opts.uriResolver, e.root.baseId);
      let {
        es5: r,
        lines: o
      } = this.opts.code;
      let {
        ownProperties: s
      } = this.opts;
      let i = new Cte.CodeGen(this.scope, {
        es5: r,
        lines: o,
        ownProperties: s
      });
      let a;
      if (e.$async) {
        a = i.scopeValue("Error", {
          ref: tfu.default,
          code: Cte._`require("ajv/dist/runtime/validation_error").default`
        });
      }
      let l = i.scopeName("validate");
      e.validateName = l;
      let c = {
        gen: i,
        allErrors: this.opts.allErrors,
        data: hHe.default.data,
        parentData: hHe.default.parentData,
        parentDataProperty: hHe.default.parentDataProperty,
        dataNames: [hHe.default.data],
        dataPathArr: [Cte.nil],
        dataLevel: 0,
        dataTypes: [],
        definedProperties: new Set(),
        topSchemaRef: i.scopeValue("schema", this.opts.code.source === true ? {
          ref: e.schema,
          code: (0, Cte.stringify)(e.schema)
        } : {
          ref: e.schema
        }),
        validateName: l,
        ValidationError: a,
        schema: e.schema,
        schemaEnv: e,
        rootId: n,
        baseId: e.baseId || n,
        schemaPath: Cte.nil,
        errSchemaPath: e.schemaPath || (this.opts.jtd ? "" : "#"),
        errorPath: Cte._`""`,
        opts: this.opts,
        self: this
      };
      let u;
      try {
        this._compilations.add(e);
        (0, nfu.validateFunctionCode)(c);
        i.optimize(this.opts.code.optimize);
        let d = i.toString();
        if (u = `${i.scopeRefs(hHe.default.scope)}return ${d}`, this.opts.code.process) {
          u = this.opts.code.process(u, e);
        }
        let m = Function(`${hHe.default.self}`, `${hHe.default.scope}`, u)(this, this.scope.get());
        if (this.scope.value(l, {
          ref: m
        }), m.errors = null, m.schema = e.schema, m.schemaEnv = e, e.$async) {
          m.$async = true;
        }
        if (this.opts.code.source === true) {
          m.source = {
            validateName: l,
            validateCode: d,
            scopeValues: i._values
          };
        }
        if (this.opts.unevaluated) {
          let {
            props: f,
            items: h
          } = c;
          if (m.evaluated = {
            props: f instanceof Cte.Name ? undefined : f,
            items: h instanceof Cte.Name ? undefined : h,
            dynamicProps: f instanceof Cte.Name,
            dynamicItems: h instanceof Cte.Name
          }, m.source) {
            m.source.evaluated = (0, Cte.stringify)(m.evaluated);
          }
        }
        e.validate = m;
        return e;
      } catch (d) {
        if (delete e.validate, delete e.validateName, u) {
          this.logger.error("Error compiling schema, function code:", u);
        }
        throw d;
      } finally {
        this._compilations.delete(e);
      }
    }
    V7.compileSchema = jIr;
    function rfu(e, t, n) {
      var r;
      n = (0, Rte.resolveUrl)(this.opts.uriResolver, t, n);
      let o = e.refs[n];
      if (o) {
        return o;
      }
      let s = ifu.call(this, e, n);
      if (s === undefined) {
        let i = (r = e.localRefs) === null || r === undefined ? undefined : r[n];
        let {
          schemaId: a
        } = this.opts;
        if (i) {
          s = new vOt({
            schema: i,
            schemaId: a,
            root: e,
            baseId: t
          });
        }
      }
      if (s === undefined) {
        return;
      }
      return e.refs[n] = ofu.call(this, s);
    }
    V7.resolveRef = rfu;
    function ofu(e) {
      if ((0, Rte.inlineRef)(e.schema, this.opts.inlineRefs)) {
        return e.schema;
      }
      return e.validate ? e : jIr.call(this, e);
    }
    function o_s(e) {
      for (let t of this._compilations) {
        if (sfu(t, e)) {
          return t;
        }
      }
    }
    V7.getCompilingSchema = o_s;
    function sfu(e, t) {
      return e.schema === t.schema && e.root === t.root && e.baseId === t.baseId;
    }
    function ifu(e, t) {
      let n;
      while (typeof (n = this.refs[t]) == "string") {
        t = n;
      }
      return n || this.schemas[t] || Cmn.call(this, e, t);
    }
    function Cmn(e, t) {
      let n = this.opts.uriResolver.parse(t);
      let r = (0, Rte._getFullPath)(this.opts.uriResolver, n);
      let o = (0, Rte.getFullPath)(this.opts.uriResolver, e.baseId, undefined);
      if (Object.keys(e.schema).length > 0 && r === o) {
        return HIr.call(this, n, e);
      }
      let s = (0, Rte.normalizeId)(r);
      let i = this.refs[s] || this.schemas[s];
      if (typeof i == "string") {
        let a = Cmn.call(this, e, i);
        if (typeof (a === null || a === undefined ? undefined : a.schema) !== "object") {
          return;
        }
        return HIr.call(this, n, a);
      }
      if (typeof (i === null || i === undefined ? undefined : i.schema) !== "object") {
        return;
      }
      if (!i.validate) {
        jIr.call(this, i);
      }
      if (s === (0, Rte.normalizeId)(t)) {
        let {
          schema: a
        } = i;
        let {
          schemaId: l
        } = this.opts;
        let c = a[l];
        if (c) {
          o = (0, Rte.resolveUrl)(this.opts.uriResolver, o, c);
        }
        return new vOt({
          schema: a,
          schemaId: l,
          root: e,
          baseId: o
        });
      }
      return HIr.call(this, n, i);
    }
    V7.resolveSchema = Cmn;
    var afu = new Set(["properties", "patternProperties", "enum", "dependencies", "definitions"]);
    function HIr(e, {
      baseId: t,
      schema: n,
      root: r
    }) {
      var o;
      if (((o = e.fragment) === null || o === undefined ? undefined : o[0]) !== "/") {
        return;
      }
      for (let a of e.fragment.slice(1).split("/")) {
        if (typeof n === "boolean") {
          return;
        }
        let l = n[(0, r_s.unescapeFragment)(a)];
        if (l === undefined) {
          return;
        }
        n = l;
        let c = typeof n === "object" && n[this.opts.schemaId];
        if (!afu.vZc(a) && c) {
          t = (0, Rte.resolveUrl)(this.opts.uriResolver, t, c);
        }
      }
      let s;
      if (typeof n != "boolean" && n.$ref && !(0, r_s.schemaHasRulesButRef)(n, this.RULES)) {
        let a = (0, Rte.resolveUrl)(this.opts.uriResolver, t, n.$ref);
        s = Cmn.call(this, r, a);
      }
      let {
        schemaId: i
      } = this.opts;
      if (s = s || new vOt({
        schema: n,
        schemaId: i,
        root: r,
        baseId: t
      }), s.schema !== s.root.schema) {
        return s;
      }
      return;
    }
  });
  var s_s = __commonJS((pmh, lfu) => {
    lfu.exports = {
      $id: "https://raw.githubusercontent.com/ajv-validator/ajv/master/lib/refs/data.json#",
      description: "Meta-schema for $data reference (JSON AnySchema extension proposal)",
      type: "object",
      required: ["$data"],
      properties: {
        $data: {
          type: "string",
          anyOf: [{
            format: "relative-json-pointer"
          }, {
            format: "json-pointer"
          }]
        }
      },
      additionalProperties: false
    };
  });
  var GIr = __commonJS((mmh, d_s) => {
    var cfu = RegExp.prototype.test.bind(/^[\da-f]{8}-[\da-f]{4}-[\da-f]{4}-[\da-f]{4}-[\da-f]{12}$/iu);
    var a_s = RegExp.prototype.test.bind(/^(?:(?:25[0-5]|2[0-4]\d|1\d{2}|[1-9]\d|\d)\.){3}(?:25[0-5]|2[0-4]\d|1\d{2}|[1-9]\d|\d)$/u);
    var qIr = RegExp.prototype.test.bind(/^[\da-f]{2}$/iu);
    var l_s = RegExp.prototype.test.bind(/^[\da-z\-._~]$/iu);
    var ufu = RegExp.prototype.test.bind(/^[\da-z\-._~!$&'()*+,;=:@/]$/iu);
    function WIr(e) {
      let t = "";
      let n = 0;
      let r = 0;
      for (r = 0; r < e.length; r++) {
        if (n = e[r].charCodeAt(0), n === 48) {
          continue;
        }
        if (!(n >= 48 && n <= 57 || n >= 65 && n <= 70 || n >= 97 && n <= 102)) {
          return "";
        }
        t += e[r];
        break;
      }
      for (r += 1; r < e.length; r++) {
        if (n = e[r].charCodeAt(0), !(n >= 48 && n <= 57 || n >= 65 && n <= 70 || n >= 97 && n <= 102)) {
          return "";
        }
        t += e[r];
      }
      return t;
    }
    var dfu = RegExp.prototype.test.bind(/[^!"$&'()*+,\-.;=_`a-z{}~]/u);
    function i_s(e) {
      e.length = 0;
      return true;
    }
    function pfu(e, t, n) {
      if (e.length) {
        let r = WIr(e);
        if (r !== "") {
          t.push(r);
        } else {
          n.error = true;
          return false;
        }
        e.length = 0;
      }
      return true;
    }
    function mfu(e) {
      let t = 0;
      let n = {
        error: false,
        address: "",
        zone: ""
      };
      let r = [];
      let o = [];
      let s = false;
      let i = false;
      let a = pfu;
      for (let l = 0; l < e.length; l++) {
        let c = e[l];
        if (c === "[" || c === "]") {
          continue;
        }
        if (c === ":") {
          if (s === true) {
            i = true;
          }
          if (!a(o, r, n)) {
            break;
          }
          if (++t > 7) {
            n.error = true;
            break;
          }
          if (l > 0 && e[l - 1] === ":") {
            s = true;
          }
          r.push(":");
          continue;
        } else if (c === "%") {
          if (!a(o, r, n)) {
            break;
          }
          a = i_s;
        } else {
          o.push(c);
          continue;
        }
      }
      if (o.length) {
        if (a === i_s) {
          n.zone = o.join("");
        } else if (i) {
          r.push(o.join(""));
        } else {
          r.push(WIr(o));
        }
      }
      n.address = r.join("");
      return n;
    }
    function c_s(e) {
      if (ffu(e, ":") < 2) {
        return {
          host: e,
          isIPV6: false
        };
      }
      let t = mfu(e);
      if (!t.error) {
        let {
          address: n,
          address: r
        } = t;
        if (t.zone) {
          n += "%" + t.zone;
          r += "%25" + t.zone;
        }
        return {
          host: n,
          isIPV6: true,
          escapedHost: r
        };
      } else {
        return {
          host: e,
          isIPV6: false
        };
      }
    }
    function ffu(e, t) {
      let n = 0;
      for (let r = 0; r < e.length; r++) {
        if (e[r] === t) {
          n++;
        }
      }
      return n;
    }
    function hfu(e) {
      let t = e;
      let n = [];
      let r = -1;
      let o = 0;
      while (o = t.length) {
        if (o === 1) {
          if (t === ".") {
            break;
          } else if (t === "/") {
            n.push("/");
            break;
          } else {
            n.push(t);
            break;
          }
        } else if (o === 2) {
          if (t[0] === ".") {
            if (t[1] === ".") {
              break;
            } else if (t[1] === "/") {
              t = t.slice(2);
              continue;
            }
          } else if (t[0] === "/") {
            if (t[1] === "." || t[1] === "/") {
              n.push("/");
              break;
            }
          }
        } else if (o === 3) {
          if (t === "/..") {
            if (n.length !== 0) {
              n.pop();
            }
            n.push("/");
            break;
          }
        }
        if (t[0] === ".") {
          if (t[1] === ".") {
            if (t[2] === "/") {
              t = t.slice(3);
              continue;
            }
          } else if (t[1] === "/") {
            t = t.slice(2);
            continue;
          }
        } else if (t[0] === "/") {
          if (t[1] === ".") {
            if (t[2] === "/") {
              t = t.slice(2);
              continue;
            } else if (t[2] === ".") {
              if (t[3] === "/") {
                if (t = t.slice(3), n.length !== 0) {
                  n.pop();
                }
                continue;
              }
            }
          }
        }
        if ((r = t.indexOf("/", 1)) === -1) {
          n.push(t);
          break;
        } else {
          n.push(t.slice(0, r));
          t = t.slice(r);
        }
      }
      return n.join("");
    }
    var gfu = {
      "@": "%40",
      "/": "%2F",
      "?": "%3F",
      "#": "%23",
      ":": "%3A"
    };
    function u_s(e, t) {
      let n = t ? /[@/?#]/g : /[@/?#:]/g;
      n.lastIndex = 0;
      return e.replace(n, r => gfu[r]);
    }
    function bfu(e, t = false) {
      if (e.indexOf("%") === -1) {
        return e;
      }
      let n = "";
      for (let r = 0; r < e.length; r++) {
        if (e[r] === "%" && r + 2 < e.length) {
          let o = e.slice(r + 1, r + 3);
          if (qIr(o)) {
            let s = o.toUpperCase();
            let i = String.fromCharCode(parseInt(s, 16));
            if (t && l_s(i)) {
              n += i;
            } else {
              n += "%" + s;
            }
            r += 2;
            continue;
          }
        }
        n += e[r];
      }
      return n;
    }
    function Sfu(e) {
      let t = "";
      for (let n = 0; n < e.length; n++) {
        if (e[n] === "%" && n + 2 < e.length) {
          let r = e.slice(n + 1, n + 3);
          if (qIr(r)) {
            let o = r.toUpperCase();
            let s = String.fromCharCode(parseInt(o, 16));
            if (s !== "." && l_s(s)) {
              t += s;
            } else {
              t += "%" + o;
            }
            n += 2;
            continue;
          }
        }
        if (ufu(e[n])) {
          t += e[n];
        } else {
          t += escape(e[n]);
        }
      }
      return t;
    }
    function Tfu(e) {
      let t = "";
      for (let n = 0; n < e.length; n++) {
        if (e[n] === "%" && n + 2 < e.length) {
          let r = e.slice(n + 1, n + 3);
          if (qIr(r)) {
            t += "%" + r.toUpperCase();
            n += 2;
            continue;
          }
        }
        t += escape(e[n]);
      }
      return t;
    }
    function Efu(e) {
      let t = [];
      if (e.userinfo !== undefined) {
        t.push(e.userinfo);
        t.push("@");
      }
      if (e.host !== undefined) {
        let n = unescape(e.host);
        if (!a_s(n)) {
          let r = c_s(n);
          if (r.isIPV6 === true) {
            n = `[${r.escapedHost}]`;
          } else {
            n = u_s(n, false);
          }
        }
        t.push(n);
      }
      if (typeof e.port === "number" || typeof e.port === "string") {
        t.push(":");
        t.push(String(e.port));
      }
      return t.length ? t.join("") : undefined;
    }
    d_s.exports = {
      nonSimpleDomain: dfu,
      recomposeAuthority: Efu,
      reescapeHostDelimiters: u_s,
      normalizePercentEncoding: bfu,
      normalizePathEncoding: Sfu,
      escapePreservingEscapes: Tfu,
      removeDotSegments: hfu,
      isIPv4: a_s,
      isUUID: cfu,
      normalizeIPv6: c_s,
      stringArrayToHexStripped: WIr
    };
  });
  var g_s = __commonJS((fmh, h_s) => {
    var {
      isUUID: vfu
    } = GIr();
    var Cfu = ["http", "https", "ws", "wss", "urn", "urn:uuid"];
    function Rfu(e) {
      return Cfu.indexOf(e) !== -1;
    }
    function VIr(e) {
      if (e.secure === true) {
        return true;
      } else if (e.secure === false) {
        return false;
      } else if (e.scheme) {
        return e.scheme.length === 3 && (e.scheme[0] === "w" || e.scheme[0] === "W") && (e.scheme[1] === "s" || e.scheme[1] === "S") && (e.scheme[2] === "s" || e.scheme[2] === "S");
      } else {
        return false;
      }
    }
    function p_s(e) {
      if (!e.host) {
        e.error = e.error || "HTTP URIs must have a host.";
      }
      return e;
    }
    function m_s(e) {
      let t = String(e.scheme).toLowerCase() === "https";
      if (e.port === (t ? 443 : 80) || e.port === "") {
        e.port = undefined;
      }
      if (!e.path) {
        e.path = "/";
      }
      return e;
    }
    function xfu(e) {
      e.secure = VIr(e);
      e.resourceName = (e.path || "/") + (e.query ? "?" + e.query : "");
      e.path = undefined;
      e.query = undefined;
      return e;
    }
    function kfu(e) {
      if (e.port === (VIr(e) ? 443 : 80) || e.port === "") {
        e.port = undefined;
      }
      if (typeof e.secure === "boolean") {
        e.scheme = e.secure ? "wss" : "ws";
        e.secure = undefined;
      }
      if (e.resourceName) {
        let [t, n] = e.resourceName.split("?");
        e.path = t && t !== "/" ? t : undefined;
        e.query = n;
        e.resourceName = undefined;
      }
      e.fragment = undefined;
      return e;
    }
    function Afu(e, t) {
      if (!e.path) {
        e.error = "URN can not be parsed";
        return e;
      }
      let n = e.path.match(/([\da-z][\d\-a-z]{0,31}):((?:[\w!$'()*+,\-.:;=@]|%[\da-f]{2})+)/iu);
      if (n) {
        let r = t.scheme || e.scheme || "urn";
        e.nid = n[1].toLowerCase();
        e.nss = n[2];
        let o = `${r}:${t.nid || e.nid}`;
        let s = zIr(o);
        if (e.path = undefined, s) {
          e = s.parse(e, t);
        }
      } else {
        e.error = e.error || "URN can not be parsed.";
      }
      return e;
    }
    function Ifu(e, t) {
      if (e.nid === undefined) {
        throw Error("URN without nid cannot be serialized");
      }
      let n = t.scheme || e.scheme || "urn";
      let r = e.nid.toLowerCase();
      let o = `${n}:${t.nid || r}`;
      let s = zIr(o);
      if (s) {
        e = s.serialize(e, t);
      }
      let i = e;
      let a = e.nss;
      i.path = `${r || t.nid}:${a}`;
      t.skipEscape = true;
      return i;
    }
    function Pfu(e, t) {
      let n = e;
      if (n.uuid = n.nss, n.nss = undefined, !t.tolerant && (!n.uuid || !vfu(n.uuid))) {
        n.error = n.error || "UUID is not valid.";
      }
      return n;
    }
    function Ofu(e) {
      let t = e;
      t.nss = (e.uuid || "").toLowerCase();
      return t;
    }
    var f_s = {
      scheme: "http",
      domainHost: true,
      parse: p_s,
      serialize: m_s
    };
    var Dfu = {
      scheme: "https",
      domainHost: f_s.domainHost,
      parse: p_s,
      serialize: m_s
    };
    var xmn = {
      scheme: "ws",
      domainHost: true,
      parse: xfu,
      serialize: kfu
    };
    var Mfu = {
      scheme: "wss",
      domainHost: xmn.domainHost,
      parse: xmn.parse,
      serialize: xmn.serialize
    };
    var Nfu = {
      scheme: "urn",
      parse: Afu,
      serialize: Ifu,
      skipNormalize: true
    };
    var Lfu = {
      scheme: "urn:uuid",
      parse: Pfu,
      serialize: Ofu,
      skipNormalize: true
    };
    var kmn = {
      http: f_s,
      https: Dfu,
      ws: xmn,
      wss: Mfu,
      urn: Nfu,
      "urn:uuid": Lfu
    };
    Object.setPrototypeOf(kmn, null);
    function zIr(e) {
      return e && (kmn[e] || kmn[e.toLowerCase()]) || undefined;
    }
    h_s.exports = {
      wsIsSecure: VIr,
      SCHEMES: kmn,
      isValidSchemeName: Rfu,
      getSchemeHandler: zIr
    };
  });
  var E_s = __commonJS((hmh, Amn) => {
    var {
      normalizeIPv6: Ffu,
      removeDotSegments: wOt,
      recomposeAuthority: Ufu,
      normalizePercentEncoding: Bfu,
      normalizePathEncoding: $fu,
      escapePreservingEscapes: Hfu,
      reescapeHostDelimiters: jfu,
      isIPv4: qfu,
      nonSimpleDomain: Wfu
    } = GIr();
    var {
      SCHEMES: Gfu,
      getSchemeHandler: __s
    } = g_s();
    function Vfu(e, t) {
      if (typeof e === "string") {
        e = Xfu(e, t);
      } else if (typeof e === "object") {
        e = ott(gHe(e, t), t);
      }
      return e;
    }
    function zfu(e, t, n) {
      let r = n ? Object.assign({
        scheme: "null"
      }, n) : {
        scheme: "null"
      };
      let o = b_s(ott(e, r), ott(t, r), r, true);
      r.skipEscape = true;
      return gHe(o, r);
    }
    function b_s(e, t, n, r) {
      let o = {};
      if (!r) {
        e = ott(gHe(e, n), n);
        t = ott(gHe(t, n), n);
      }
      if (n = n || {}, !n.tolerant && t.scheme) {
        o.scheme = t.scheme;
        o.userinfo = t.userinfo;
        o.host = t.host;
        o.port = t.port;
        o.path = wOt(t.path || "");
        o.query = t.query;
      } else {
        if (t.userinfo !== undefined || t.host !== undefined || t.port !== undefined) {
          o.userinfo = t.userinfo;
          o.host = t.host;
          o.port = t.port;
          o.path = wOt(t.path || "");
          o.query = t.query;
        } else {
          if (!t.path) {
            if (o.path = e.path, t.query !== undefined) {
              o.query = t.query;
            } else {
              o.query = e.query;
            }
          } else {
            if (t.path[0] === "/") {
              o.path = wOt(t.path);
            } else {
              if ((e.userinfo !== undefined || e.host !== undefined || e.port !== undefined) && !e.path) {
                o.path = "/" + t.path;
              } else if (!e.path) {
                o.path = t.path;
              } else {
                o.path = e.path.slice(0, e.path.lastIndexOf("/") + 1) + t.path;
              }
              o.path = wOt(o.path);
            }
            o.query = t.query;
          }
          o.userinfo = e.userinfo;
          o.host = e.host;
          o.port = e.port;
        }
        o.scheme = e.scheme;
      }
      o.fragment = t.fragment;
      return o;
    }
    function Kfu(e, t, n) {
      let r = y_s(e, n);
      let o = y_s(t, n);
      return r !== undefined && o !== undefined && r.toLowerCase() === o.toLowerCase();
    }
    function gHe(e, t) {
      let n = {
        host: e.host,
        scheme: e.scheme,
        userinfo: e.userinfo,
        port: e.port,
        path: e.path,
        query: e.query,
        nid: e.nid,
        nss: e.nss,
        uuid: e.uuid,
        fragment: e.fragment,
        reference: e.reference,
        resourceName: e.resourceName,
        secure: e.secure,
        error: ""
      };
      let r = Object.assign({}, t);
      let o = [];
      let s = __s(r.scheme || n.scheme);
      if (s && s.serialize) {
        s.serialize(n, r);
      }
      if (n.path !== undefined) {
        if (!r.skipEscape) {
          if (n.path = Hfu(n.path), n.scheme !== undefined) {
            n.path = n.path.split("%3A").join(":");
          }
        } else {
          n.path = Bfu(n.path);
        }
      }
      if (r.reference !== "suffix" && n.scheme) {
        o.push(n.scheme, ":");
      }
      let i = Ufu(n);
      if (i !== undefined) {
        if (r.reference !== "suffix") {
          o.push("//");
        }
        if (o.push(i), n.path && n.path[0] !== "/") {
          o.push("/");
        }
      }
      if (n.path !== undefined) {
        let a = n.path;
        if (!r.absolutePath && (!s || !s.absolutePath)) {
          a = wOt(a);
        }
        if (i === undefined && a[0] === "/" && a[1] === "/") {
          a = "/%2F" + a.slice(2);
        }
        o.push(a);
      }
      if (n.query !== undefined) {
        o.push("?", n.query);
      }
      if (n.fragment !== undefined) {
        o.push("#", n.fragment);
      }
      return o.join("");
    }
    function Jfu(e, t) {
      if (t[2] !== undefined && e.path && e.path[0] !== "/") {
        return 'URI path must start with "/" when authority is present.';
      }
      if (typeof e.port === "number" && (e.port < 0 || e.port > 65535)) {
        return "URI port is malformed.";
      }
      return;
    }
    function S_s(e, t) {
      let n = Object.assign({}, t);
      let r = {
        scheme: undefined,
        userinfo: undefined,
        host: "",
        port: undefined,
        path: "",
        query: undefined,
        fragment: undefined
      };
      let o = false;
      let s = false;
      if (n.reference === "suffix") {
        if (n.scheme) {
          e = n.scheme + ":" + e;
        } else {
          e = "//" + e;
        }
      }
      let i = e.match(/^(?:([^#/:?]+):)?(?:\/\/((?:([^#/?@]*)@)?(\[[^#/?\]]+\]|[^#/:?]*)(?::(\d*))?))?([^#?]*)(?:\?([^#]*))?(?:#((?:.|[\n\r])*))?/u);
      if (i) {
        if (r.scheme = i[1], r.userinfo = i[3], r.host = i[4], r.port = parseInt(i[5], 10), r.path = i[6] || "", r.query = i[7], r.fragment = i[8], isNaN(r.port)) {
          r.port = i[5];
        }
        let a = Jfu(r, i);
        if (a !== undefined) {
          r.error = r.error || a;
          o = true;
        }
        if (r.host) {
          if (qfu(r.host) === false) {
            let u = Ffu(r.host);
            r.host = u.host.toLowerCase();
            s = u.isIPV6;
          } else {
            s = true;
          }
        }
        if (r.scheme === undefined && r.userinfo === undefined && r.host === undefined && r.port === undefined && r.query === undefined && !r.path) {
          r.reference = "same-document";
        } else if (r.scheme === undefined) {
          r.reference = "relative";
        } else if (r.fragment === undefined) {
          r.reference = "absolute";
        } else {
          r.reference = "uri";
        }
        if (n.reference && n.reference !== "suffix" && n.reference !== r.reference) {
          r.error = r.error || "URI is not a " + n.reference + " reference.";
        }
        let l = __s(n.scheme || r.scheme);
        if (!n.unicodeSupport && (!l || !l.unicodeSupport)) {
          if (r.host && (n.domainHost || l && l.domainHost) && s === false && Wfu(r.host)) {
            try {
              r.host = URL.domainToASCII(r.host.toLowerCase());
            } catch (c) {
              r.error = r.error || "Host's domain name can not be converted to ASCII: " + c;
            }
          }
        }
        if (!l || l && !l.skipNormalize) {
          if (e.indexOf("%") !== -1) {
            if (r.scheme !== undefined) {
              r.scheme = unescape(r.scheme);
            }
            if (r.host !== undefined) {
              r.host = jfu(unescape(r.host), s);
            }
          }
          if (r.path) {
            r.path = $fu(r.path);
          }
          if (r.fragment) {
            try {
              r.fragment = encodeURI(decodeURIComponent(r.fragment));
            } catch {
              r.error = r.error || "URI malformed";
            }
          }
        }
        if (l && l.parse) {
          l.parse(r, n);
        }
      } else {
        r.error = r.error || "URI can not be parsed.";
      }
      return {
        parsed: r,
        malformedAuthorityOrPort: o
      };
    }
    function ott(e, t) {
      return S_s(e, t).parsed;
    }
    function Xfu(e, t) {
      return T_s(e, t).normalized;
    }
    function T_s(e, t) {
      let {
        parsed: n,
        malformedAuthorityOrPort: r
      } = S_s(e, t);
      return {
        normalized: r ? e : gHe(n, t),
        malformedAuthorityOrPort: r
      };
    }
    function y_s(e, t) {
      if (typeof e === "string") {
        let {
          normalized: n,
          malformedAuthorityOrPort: r
        } = T_s(e, t);
        return r ? undefined : n;
      }
      if (typeof e === "object") {
        return gHe(e, t);
      }
    }
    var KIr = {
      SCHEMES: Gfu,
      normalize: Vfu,
      resolve: zfu,
      resolveComponent: b_s,
      equal: Kfu,
      serialize: gHe,
      parse: ott
    };
    Amn.exports = KIr;
    Amn.exports.default = KIr;
    Amn.exports.fastUri = KIr;
  });
  var w_s = __commonJS(YIr => {
    Object.defineProperty(YIr, "__esModule", {
      value: true
    });
    var v_s = E_s();
    v_s.code = 'require("ajv/dist/runtime/uri").default';
    YIr.default = v_s;
  });
  var O_s = __commonJS(XL => {
    Object.defineProperty(XL, "__esModule", {
      value: true
    });
    XL.CodeGen = XL.Name = XL.nil = XL.stringify = XL.str = XL._ = XL.KeywordCxt = undefined;
    var Qfu = TOt();
    Object.defineProperty(XL, "KeywordCxt", {
      enumerable: true,
      get: function () {
        return Qfu.KeywordCxt;
      }
    });
    var stt = Sf();
    Object.defineProperty(XL, "_", {
      enumerable: true,
      get: function () {
        return stt._;
      }
    });
    Object.defineProperty(XL, "str", {
      enumerable: true,
      get: function () {
        return stt.str;
      }
    });
    Object.defineProperty(XL, "stringify", {
      enumerable: true,
      get: function () {
        return stt.stringify;
      }
    });
    Object.defineProperty(XL, "nil", {
      enumerable: true,
      get: function () {
        return stt.nil;
      }
    });
    Object.defineProperty(XL, "Name", {
      enumerable: true,
      get: function () {
        return stt.Name;
      }
    });
    Object.defineProperty(XL, "CodeGen", {
      enumerable: true,
      get: function () {
        return stt.CodeGen;
      }
    });
    var Zfu = wmn();
    var A_s = EOt();
    var ehu = wIr();
    var COt = Rmn();
    var thu = Sf();
    var ROt = _Ot();
    var Imn = yOt();
    var XIr = Ty();
    var C_s = s_s();
    var nhu = w_s();
    var I_s = (e, t) => new RegExp(e, t);
    I_s.code = "new RegExp";
    var rhu = ["removeAdditional", "useDefaults", "coerceTypes"];
    var ohu = new Set(["validate", "serialize", "parse", "wrapper", "root", "schema", "keyword", "pattern", "formats", "validate$data", "func", "obj", "Error"]);
    var shu = {
      errorDataPath: "",
      format: "`validateFormats: false` can be used instead.",
      nullable: '"nullable" keyword is supported by default.',
      jsonPointers: "Deprecated jsPropertySyntax can be used instead.",
      extendRefs: "Deprecated ignoreKeywordsWithRef can be used instead.",
      missingRefs: "Pass empty schema with $id that should be ignored to ajv.addSchema.",
      processCode: "Use option `code: {process: (code, schemaEnv: object) => string}`",
      sourceCode: "Use option `code: {source: true}`",
      strictDefaults: "It is default now, see option `strict`.",
      strictKeywords: "It is default now, see option `strict`.",
      uniqueItems: '"uniqueItems" keyword is always validated.',
      unknownFormats: "Disable strict mode or pass `true` to `ajv.addFormat` (or `formats` option).",
      cache: "Map is used as cache, schema object as key.",
      serialize: "Map is used as cache, schema object as key.",
      ajvErrors: "It is default now."
    };
    var ihu = {
      ignoreKeywordsWithRef: "",
      jsPropertySyntax: "",
      unicode: '"minLength"/"maxLength" account for unicode characters by default.'
    };
    function ahu(e) {
      var t;
      var n;
      var r;
      var o;
      var s;
      var i;
      var a;
      var l;
      var c;
      var u;
      var d;
      var p;
      var m;
      var f;
      var h;
      var g;
      var y;
      var _;
      var b;
      var S;
      var E;
      var C;
      var x;
      var A;
      var k;
      let I = e.strict;
      let O = (t = e.code) === null || t === undefined ? undefined : t.optimize;
      let M = O === true || O === undefined ? 1 : O || 0;
      let L = (r = (n = e.code) === null || n === undefined ? undefined : n.regExp) !== null && r !== undefined ? r : I_s;
      let P = (o = e.uriResolver) !== null && o !== undefined ? o : nhu.default;
      return {
        strictSchema: (i = (s = e.strictSchema) !== null && s !== undefined ? s : I) !== null && i !== undefined ? i : true,
        strictNumbers: (l = (a = e.strictNumbers) !== null && a !== undefined ? a : I) !== null && l !== undefined ? l : true,
        strictTypes: (u = (c = e.strictTypes) !== null && c !== undefined ? c : I) !== null && u !== undefined ? u : "log",
        strictTuples: (p = (d = e.strictTuples) !== null && d !== undefined ? d : I) !== null && p !== undefined ? p : "log",
        strictRequired: (f = (m = e.strictRequired) !== null && m !== undefined ? m : I) !== null && f !== undefined ? f : false,
        code: e.code ? {
          ...e.code,
          optimize: M,
          regExp: L
        } : {
          optimize: M,
          regExp: L
        },
        loopRequired: (h = e.loopRequired) !== null && h !== undefined ? h : 200,
        loopEnum: (g = e.loopEnum) !== null && g !== undefined ? g : 200,
        meta: (y = e.meta) !== null && y !== undefined ? y : true,
        messages: (_ = e.messages) !== null && _ !== undefined ? _ : true,
        inlineRefs: (b = e.inlineRefs) !== null && b !== undefined ? b : true,
        schemaId: (S = e.schemaId) !== null && S !== undefined ? S : "$id",
        addUsedSchema: (E = e.addUsedSchema) !== null && E !== undefined ? E : true,
        validateSchema: (C = e.validateSchema) !== null && C !== undefined ? C : true,
        validateFormats: (x = e.validateFormats) !== null && x !== undefined ? x : true,
        unicodeRegExp: (A = e.unicodeRegExp) !== null && A !== undefined ? A : true,
        int32range: (k = e.int32range) !== null && k !== undefined ? k : true,
        uriResolver: P
      };
    }
    class Pmn {
      constructor(e = {}) {
        this.schemas = {};
        this.refs = {};
        this.formats = {};
        this._compilations = new Set();
        this._loading = {};
        this._cache = new Map();
        e = this.opts = {
          ...e,
          ...ahu(e)
        };
        let {
          es5: t,
          lines: n
        } = this.opts.code;
        this.scope = new thu.ValueScope({
          scope: {},
          prefixes: ohu,
          es5: t,
          lines: n
        });
        this.logger = mhu(e.logger);
        let r = e.validateFormats;
        if (e.validateFormats = false, this.RULES = (0, ehu.getRules)(), x_s.call(this, shu, e, "NOT SUPPORTED"), x_s.call(this, ihu, e, "DEPRECATED", "warn"), this._metaOpts = dhu.call(this), e.formats) {
          chu.call(this);
        }
        if (this._addVocabularies(), this._addDefaultMetaSchema(), e.keywords) {
          uhu.call(this, e.keywords);
        }
        if (typeof e.meta == "object") {
          this.addMetaSchema(e.meta);
        }
        lhu.call(this);
        e.validateFormats = r;
      }
      _addVocabularies() {
        this.addKeyword("$async");
      }
      _addDefaultMetaSchema() {
        let {
          $data: e,
          meta: t,
          schemaId: n
        } = this.opts;
        let r = C_s;
        if (n === "id") {
          r = {
            ...C_s
          };
          r.id = r.$id;
          delete r.$id;
        }
        if (t && e) {
          this.addMetaSchema(r, r[n], false);
        }
      }
      defaultMeta() {
        let {
          meta: e,
          schemaId: t
        } = this.opts;
        return this.opts.defaultMeta = typeof e == "object" ? e[t] || e : undefined;
      }
      validate(e, t) {
        let n;
        if (typeof e == "string") {
          if (n = this.getSchema(e), !n) {
            throw Error(`no schema with key or ref "${e}"`);
          }
        } else {
          n = this.compile(e);
        }
        let r = n(t);
        if (!("$async" in n)) {
          this.errors = n.errors;
        }
        return r;
      }
      compile(e, t) {
        let n = this._addSchema(e, t);
        return n.validate || this._compileSchemaEnv(n);
      }
      compileAsync(e, t) {
        if (typeof this.opts.loadSchema != "function") {
          throw Error("options.loadSchema should be a function");
        }
        let {
          loadSchema: n
        } = this.opts;
        return r.call(this, e, t);
        async function r(c, u) {
          await o.call(this, c.$schema);
          let d = this._addSchema(c, u);
          return d.validate || s.call(this, d);
        }
        async function o(c) {
          if (c && !this.getSchema(c)) {
            await r.call(this, {
              $ref: c
            }, true);
          }
        }
        async function s(c) {
          try {
            return this._compileSchemaEnv(c);
          } catch (u) {
            if (!(u instanceof A_s.default)) {
              throw u;
            }
            i.call(this, u);
            await a.call(this, u.missingSchema);
            return s.call(this, c);
          }
        }
        function i({
          missingSchema: c,
          missingRef: u
        }) {
          if (this.refs[c]) {
            throw Error(`AnySchema ${c} is loaded but ${u} cannot be resolved`);
          }
        }
        async function a(c) {
          let u = await l.call(this, c);
          if (!this.refs[c]) {
            await o.call(this, u.$schema);
          }
          if (!this.refs[c]) {
            this.addSchema(u, c, t);
          }
        }
        async function l(c) {
          let u = this._loading[c];
          if (u) {
            return u;
          }
          try {
            return await (this._loading[c] = n(c));
          } finally {
            delete this._loading[c];
          }
        }
      }
      addSchema(e, t, n, r = this.opts.validateSchema) {
        if (Array.isArray(e)) {
          for (let s of e) {
            this.addSchema(s, undefined, n, r);
          }
          return this;
        }
        let o;
        if (typeof e === "object") {
          let {
            schemaId: s
          } = this.opts;
          if (o = e[s], o !== undefined && typeof o != "string") {
            throw Error(`schema ${s} must be string`);
          }
        }
        t = (0, ROt.normalizeId)(t || o);
        this._checkUnique(t);
        this.schemas[t] = this._addSchema(e, n, t, r, true);
        return this;
      }
      addMetaSchema(e, t, n = this.opts.validateSchema) {
        this.addSchema(e, t, true, n);
        return this;
      }
      validateSchema(e, t) {
        if (typeof e == "boolean") {
          return true;
        }
        let n;
        if (n = e.$schema, n !== undefined && typeof n != "string") {
          throw Error("$schema must be a string");
        }
        if (n = n || this.opts.defaultMeta || this.defaultMeta(), !n) {
          this.logger.warn("meta-schema not available");
          this.errors = null;
          return true;
        }
        let r = this.validate(n, e);
        if (!r && t) {
          let o = "schema is invalid: " + this.errorsText();
          if (this.opts.validateSchema === "log") {
            this.logger.error(o);
          } else {
            throw Error(o);
          }
        }
        return r;
      }
      getSchema(e) {
        let t;
        while (typeof (t = k_s.call(this, e)) == "string") {
          e = t;
        }
        if (t === undefined) {
          let {
            schemaId: n
          } = this.opts;
          let r = new COt.SchemaEnv({
            schema: {},
            schemaId: n
          });