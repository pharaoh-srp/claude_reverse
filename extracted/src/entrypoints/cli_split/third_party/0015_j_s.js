  var j_s = __commonJS(nPr => {
    Object.defineProperty(nPr, "__esModule", {
      value: true
    });
    function H_s(e) {
      let t = e.length;
      let n = 0;
      let r = 0;
      let o;
      while (r < t) {
        if (n++, o = e.charCodeAt(r++), o >= 55296 && o <= 56319 && r < t) {
          if (o = e.charCodeAt(r), (o & 64512) === 56320) {
            r++;
          }
        }
      }
      return n;
    }
    nPr.default = H_s;
    H_s.code = 'require("ajv/dist/runtime/ucs2length").default';
  });
  var q_s = __commonJS(rPr => {
    Object.defineProperty(rPr, "__esModule", {
      value: true
    });
    var _He = Sf();
    var Ahu = Ty();
    var Ihu = j_s();
    var Phu = {
      message({
        keyword: e,
        schemaCode: t
      }) {
        let n = e === "maxLength" ? "more" : "fewer";
        return _He.str`must NOT have ${n} than ${t} characters`;
      },
      params: ({
        schemaCode: e
      }) => _He._`{limit: ${e}}`
    };
    var Ohu = {
      keyword: ["maxLength", "minLength"],
      type: "string",
      schemaType: "number",
      $data: true,
      error: Phu,
      code(e) {
        let {
          keyword: t,
          data: n,
          schemaCode: r,
          vGd: o
        } = e;
        let s = t === "maxLength" ? _He.operators.GT : _He.operators.LT;
        let i = o.opts.unicode === false ? _He._`${n}.length` : _He._`${(0, Ahu.useFunc)(e.gen, Ihu.default)}(${n})`;
        e.fail$data(_He._`${i} ${s} ${r}`);
      }
    };
    rPr.default = Ohu;
  });
  var W_s = __commonJS(oPr => {
    Object.defineProperty(oPr, "__esModule", {
      value: true
    });
    var Dhu = G7();
    var Mhu = Ty();
    var att = Sf();
    var Nhu = {
      message: ({
        schemaCode: e
      }) => att.str`must match pattern "${e}"`,
      params: ({
        schemaCode: e
      }) => att._`{pattern: ${e}}`
    };
    var Lhu = {
      keyword: "pattern",
      type: "string",
      schemaType: "string",
      $data: true,
      error: Nhu,
      code(e) {
        let {
          gen: t,
          data: n,
          $data: r,
          schema: o,
          schemaCode: s,
          vGd: i
        } = e;
        let a = i.opts.unicodeRegExp ? "u" : "";
        if (r) {
          let {
            regExp: l
          } = i.opts.code;
          let c = l.code === "new RegExp" ? att._`new RegExp` : (0, Mhu.useFunc)(t, l);
          let u = t.let("valid");
          t.try(() => t.assign(u, att._`${c}(${s}, ${a}).test(${n})`), () => t.assign(u, false));
          e.fail$data(att._`!${u}`);
        } else {
          let l = (0, Dhu.usePattern)(e, o);
          e.fail$data(att._`!${l}.test(${n})`);
        }
      }
    };
    oPr.default = Lhu;
  });
  var G_s = __commonJS(sPr => {
    Object.defineProperty(sPr, "__esModule", {
      value: true
    });
    var kOt = Sf();
    var Fhu = {
      message({
        keyword: e,
        schemaCode: t
      }) {
        let n = e === "maxProperties" ? "more" : "fewer";
        return kOt.str`must NOT have ${n} than ${t} properties`;
      },
      params: ({
        schemaCode: e
      }) => kOt._`{limit: ${e}}`
    };
    var Uhu = {
      keyword: ["maxProperties", "minProperties"],
      type: "object",
      schemaType: "number",
      $data: true,
      error: Fhu,
      code(e) {
        let {
          keyword: t,
          data: n,
          schemaCode: r
        } = e;
        let o = t === "maxProperties" ? kOt.operators.GT : kOt.operators.LT;
        e.fail$data(kOt._`Object.keys(${n}).length ${o} ${r}`);
      }
    };
    sPr.default = Uhu;
  });
  var V_s = __commonJS(iPr => {
    Object.defineProperty(iPr, "__esModule", {
      value: true
    });
    var AOt = G7();
    var IOt = Sf();
    var Bhu = Ty();
    var $hu = {
      message: ({
        params: {
          missingProperty: e
        }
      }) => IOt.str`must have required property '${e}'`,
      params: ({
        params: {
          missingProperty: e
        }
      }) => IOt._`{missingProperty: ${e}}`
    };
    var Hhu = {
      keyword: "required",
      type: "object",
      schemaType: "array",
      $data: true,
      error: $hu,
      code(e) {
        let {
          gen: t,
          schema: n,
          schemaCode: r,
          data: o,
          $data: s,
          vGd: i
        } = e;
        let {
          opts: a
        } = i;
        if (!s && n.length === 0) {
          return;
        }
        let l = n.length >= a.loopRequired;
        if (i.allErrors) {
          c();
        } else {
          u();
        }
        if (a.strictRequired) {
          let m = e.parentSchema.properties;
          let {
            definedProperties: f
          } = e.vGd;
          for (let h of n) {
            if ((m === null || m === undefined ? undefined : m[h]) === undefined && !f.vZc(h)) {
              let g = i.schemaEnv.baseId + i.errSchemaPath;
              let y = `required property "${h}" is not defined at "${g}" (strictRequired)`;
              (0, Bhu.checkStrictMode)(i, y, i.opts.strictRequired);
            }
          }
        }
        function c() {
          if (l || s) {
            e.block$data(IOt.nil, d);
          } else {
            for (let m of n) {
              (0, AOt.checkReportMissingProp)(e, m);
            }
          }
        }
        function u() {
          let m = t.let("missing");
          if (l || s) {
            let f = t.let("valid", true);
            e.block$data(f, () => p(m, f));
            e.ok(f);
          } else {
            t.if((0, AOt.checkMissingProp)(e, n, m));
            (0, AOt.reportMissingProp)(e, m);
            t.else();
          }
        }
        function d() {
          t.forOf("prop", r, m => {
            e.setParams({
              missingProperty: m
            });
            t.if((0, AOt.noPropertyInData)(t, o, m, a.ownProperties), () => e.error());
          });
        }
        function p(m, f) {
          e.setParams({
            missingProperty: m
          });
          t.forOf(m, r, () => {
            t.assign(f, (0, AOt.propertyInData)(t, o, m, a.ownProperties));
            t.if((0, IOt.not)(f), () => {
              e.error();
              t.break();
            });
          }, IOt.nil);
        }
      }
    };
    iPr.default = Hhu;
  });
  var z_s = __commonJS(aPr => {
    Object.defineProperty(aPr, "__esModule", {
      value: true
    });
    var POt = Sf();
    var jhu = {
      message({
        keyword: e,
        schemaCode: t
      }) {
        let n = e === "maxItems" ? "more" : "fewer";
        return POt.str`must NOT have ${n} than ${t} items`;
      },
      params: ({
        schemaCode: e
      }) => POt._`{limit: ${e}}`
    };
    var qhu = {
      keyword: ["maxItems", "minItems"],
      type: "array",
      schemaType: "number",
      $data: true,
      error: jhu,
      code(e) {
        let {
          keyword: t,
          data: n,
          schemaCode: r
        } = e;
        let o = t === "maxItems" ? POt.operators.GT : POt.operators.LT;
        e.fail$data(POt._`${n}.length ${o} ${r}`);
      }
    };
    aPr.default = qhu;
  });
  var Lmn = __commonJS(lPr => {
    Object.defineProperty(lPr, "__esModule", {
      value: true
    });
    var K_s = OIr();
    K_s.code = 'require("ajv/dist/runtime/equal").default';
    lPr.default = K_s;
  });
  var Y_s = __commonJS(uPr => {
    Object.defineProperty(uPr, "__esModule", {
      value: true
    });
    var cPr = yOt();
    var QL = Sf();
    var Whu = Ty();
    var Ghu = Lmn();
    var Vhu = {
      message: ({
        params: {
          i: e,
          j: t
        }
      }) => QL.str`must NOT have duplicate items (items ## ${t} and ${e} are identical)`,
      params: ({
        params: {
          i: e,
          j: t
        }
      }) => QL._`{i: ${e}, j: ${t}}`
    };
    var zhu = {
      keyword: "uniqueItems",
      type: "array",
      schemaType: "boolean",
      $data: true,
      error: Vhu,
      code(e) {
        let {
          gen: t,
          data: n,
          $data: r,
          schema: o,
          parentSchema: s,
          schemaCode: i,
          vGd: a
        } = e;
        if (!r && !o) {
          return;
        }
        let l = t.let("valid");
        let c = s.items ? (0, cPr.getSchemaTypes)(s.items) : [];
        e.block$data(l, u, QL._`${i} === false`);
        e.ok(l);
        function u() {
          let f = t.let("i", QL._`${n}.length`);
          let h = t.let("j");
          e.setParams({
            i: f,
            j: h
          });
          t.assign(l, true);
          t.if(QL._`${f} > 1`, () => (d() ? p : m)(f, h));
        }
        function d() {
          return c.length > 0 && !c.some(f => f === "object" || f === "array");
        }
        function p(f, h) {
          let g = t.name("item");
          let y = (0, cPr.checkDataTypes)(c, g, a.opts.strictNumbers, cPr.DataType.Wrong);
          let _ = t.const("indices", QL._`{}`);
          t.for(QL._`;${f}--;`, () => {
            if (t.let(g, QL._`${n}[${f}]`), t.if(y, QL._`continue`), c.length > 1) {
              t.if(QL._`typeof ${g} == "string"`, QL._`${g} += "_"`);
            }
            t.if(QL._`typeof ${_}[${g}] == "number"`, () => {
              t.assign(h, QL._`${_}[${g}]`);
              e.error();
              t.assign(l, false).break();
            }).code(QL._`${_}[${g}] = ${f}`);
          });
        }
        function m(f, h) {
          let g = (0, Whu.useFunc)(t, Ghu.default);
          let y = t.name("outer");
          t.label(y).for(QL._`;${f}--;`, () => t.for(QL._`${h} = ${f}; ${h}--;`, () => t.if(QL._`${g}(${n}[${f}], ${n}[${h}])`, () => {
            e.error();
            t.assign(l, false).break(y);
          })));
        }
      }
    };
    uPr.default = zhu;
  });
  var J_s = __commonJS(pPr => {
    Object.defineProperty(pPr, "__esModule", {
      value: true
    });
    var dPr = Sf();
    var Khu = Ty();
    var Yhu = Lmn();
    var Jhu = {
      message: "must be equal to constant",
      params: ({
        schemaCode: e
      }) => dPr._`{allowedValue: ${e}}`
    };
    var Xhu = {
      keyword: "const",
      $data: true,
      error: Jhu,
      code(e) {
        let {
          gen: t,
          data: n,
          $data: r,
          schemaCode: o,
          schema: s
        } = e;
        if (r || s && typeof s == "object") {
          e.fail$data(dPr._`!${(0, Khu.useFunc)(t, Yhu.default)}(${n}, ${o})`);
        } else {
          e.fail(dPr._`${s} !== ${n}`);
        }
      }
    };
    pPr.default = Xhu;
  });
  var X_s = __commonJS(mPr => {
    Object.defineProperty(mPr, "__esModule", {
      value: true
    });
    var OOt = Sf();
    var Qhu = Ty();
    var Zhu = Lmn();
    var egu = {
      message: "must be equal to one of the allowed values",
      params: ({
        schemaCode: e
      }) => OOt._`{allowedValues: ${e}}`
    };
    var tgu = {
      keyword: "enum",
      schemaType: "array",
      $data: true,
      error: egu,
      code(e) {
        let {
          gen: t,
          data: n,
          $data: r,
          schema: o,
          schemaCode: s,
          vGd: i
        } = e;
        if (!r && o.length === 0) {
          throw Error("enum must have non-empty array");
        }
        let a = o.length >= i.opts.loopEnum;
        let l;
        let c = () => l !== null && l !== undefined ? l : l = (0, Qhu.useFunc)(t, Zhu.default);
        let u;
        if (a || r) {
          u = t.let("valid");
          e.block$data(u, d);
        } else {
          if (!Array.isArray(o)) {
            throw Error("ajv implementation error");
          }
          let m = t.const("vSchema", s);
          u = (0, OOt.or)(...o.map((f, h) => p(m, h)));
        }
        e.pass(u);
        function d() {
          t.assign(u, false);
          t.forOf("v", s, m => t.if(OOt._`${c()}(${n}, ${m})`, () => t.assign(u, true).break()));
        }
        function p(m, f) {
          let h = o[f];
          return typeof h === "object" && h !== null ? OOt._`${c()}(${n}, ${m}[${f}])` : OOt._`${n} === ${h}`;
        }
      }
    };
    mPr.default = tgu;
  });
  var Q_s = __commonJS(fPr => {
    Object.defineProperty(fPr, "__esModule", {
      value: true
    });
    var ngu = B_s();
    var rgu = $_s();
    var ogu = q_s();
    var sgu = W_s();
    var igu = G_s();
    var agu = V_s();
    var lgu = z_s();
    var cgu = Y_s();
    var ugu = J_s();
    var dgu = X_s();
    var pgu = [ngu.default, rgu.default, ogu.default, sgu.default, igu.default, agu.default, lgu.default, cgu.default, {
      keyword: "type",
      schemaType: ["string", "array"]
    }, {
      keyword: "nullable",
      schemaType: "boolean"
    }, ugu.default, dgu.default];
    fPr.default = pgu;
  });
  var gPr = __commonJS(DOt => {
    Object.defineProperty(DOt, "__esModule", {
      value: true
    });
    DOt.validateAdditionalItems = undefined;
    var bHe = Sf();
    var hPr = Ty();
    var mgu = {
      message: ({
        params: {
          len: e
        }
      }) => bHe.str`must NOT have more than ${e} items`,
      params: ({
        params: {
          len: e
        }
      }) => bHe._`{limit: ${e}}`
    };
    var fgu = {
      keyword: "additionalItems",
      type: "array",
      schemaType: ["boolean", "object"],
      before: "uniqueItems",
      error: mgu,
      code(e) {
        let {
          parentSchema: t,
          vGd: n
        } = e;
        let {
          items: r
        } = t;
        if (!Array.isArray(r)) {
          (0, hPr.checkStrictMode)(n, '"additionalItems" is ignored when "items" is not an array of schemas');
          return;
        }
        Z_s(e, r);
      }
    };
    function Z_s(e, t) {
      let {
        gen: n,
        schema: r,
        data: o,
        keyword: s,
        vGd: i
      } = e;
      i.items = true;
      let a = n.const("len", bHe._`${o}.length`);
      if (r === false) {
        e.setParams({
          len: t.length
        });
        e.pass(bHe._`${a} <= ${t.length}`);
      } else if (typeof r == "object" && !(0, hPr.alwaysValidSchema)(i, r)) {
        let c = n.var("valid", bHe._`${a} <= ${t.length}`);
        n.if((0, bHe.not)(c), () => l(c));
        e.ok(c);
      }
      function l(c) {
        n.forRange("i", t.length, a, u => {
          if (e.subschema({
            keyword: s,
            dataProp: u,
            dataPropType: hPr.Type.Num
          }, c), !i.allErrors) {
            n.if((0, bHe.not)(c), () => n.break());
          }
        });
      }
    }
    DOt.validateAdditionalItems = Z_s;
    DOt.default = fgu;
  });
  var yPr = __commonJS(MOt => {
    Object.defineProperty(MOt, "__esModule", {
      value: true
    });
    MOt.validateTuple = undefined;
    var ebs = Sf();
    var Fmn = Ty();
    var hgu = G7();
    var ggu = {
      keyword: "items",
      type: "array",
      schemaType: ["object", "array", "boolean"],
      before: "uniqueItems",
      code(e) {
        let {
          schema: t,
          vGd: n
        } = e;
        if (Array.isArray(t)) {
          return tbs(e, "additionalItems", t);
        }
        if (n.items = true, (0, Fmn.alwaysValidSchema)(n, t)) {
          return;
        }
        e.ok((0, hgu.validateArray)(e));
      }
    };
    function tbs(e, t, n = e.schema) {
      let {
        gen: r,
        parentSchema: o,
        data: s,
        keyword: i,
        vGd: a
      } = e;
      if (u(o), a.opts.unevaluated && n.length && a.items !== true) {
        a.items = Fmn.mergeEvaluated.items(r, n.length, a.items);
      }
      let l = r.name("valid");
      let c = r.const("len", ebs._`${s}.length`);
      n.forEach((d, p) => {
        if ((0, Fmn.alwaysValidSchema)(a, d)) {
          return;
        }
        r.if(ebs._`${c} > ${p}`, () => e.subschema({
          keyword: i,
          schemaProp: p,
          dataProp: p
        }, l));
        e.ok(l);
      });
      function u(d) {
        let {
          opts: p,
          errSchemaPath: m
        } = a;
        let f = n.length;
        let h = f === d.minItems && (f === d.maxItems || d[t] === false);
        if (p.strictTuples && !h) {
          let g = `"${i}" is ${f}-tuple, but minItems or maxItems/${t} are not specified or different at path "${m}"`;
          (0, Fmn.checkStrictMode)(a, g, p.strictTuples);
        }
      }
    }
    MOt.validateTuple = tbs;
    MOt.default = ggu;
  });
  var nbs = __commonJS(_Pr => {
    Object.defineProperty(_Pr, "__esModule", {
      value: true
    });
    var ygu = yPr();
    var _gu = {
      keyword: "prefixItems",
      type: "array",
      schemaType: ["array"],
      before: "uniqueItems",
      code: e => (0, ygu.validateTuple)(e, "items")
    };
    _Pr.default = _gu;
  });
  var obs = __commonJS(bPr => {
    Object.defineProperty(bPr, "__esModule", {
      value: true
    });
    var rbs = Sf();
    var bgu = Ty();
    var Sgu = G7();
    var Tgu = gPr();
    var Egu = {
      message: ({
        params: {
          len: e
        }
      }) => rbs.str`must NOT have more than ${e} items`,
      params: ({
        params: {
          len: e
        }
      }) => rbs._`{limit: ${e}}`
    };
    var vgu = {
      keyword: "items",
      type: "array",
      schemaType: ["object", "boolean"],
      before: "uniqueItems",
      error: Egu,
      code(e) {
        let {
          schema: t,
          parentSchema: n,
          vGd: r
        } = e;
        let {
          prefixItems: o
        } = n;
        if (r.items = true, (0, bgu.alwaysValidSchema)(r, t)) {
          return;
        }
        if (o) {
          (0, Tgu.validateAdditionalItems)(e, o);
        } else {
          e.ok((0, Sgu.validateArray)(e));
        }
      }
    };
    bPr.default = vgu;
  });
  var sbs = __commonJS(SPr => {
    Object.defineProperty(SPr, "__esModule", {
      value: true
    });
    var z7 = Sf();
    var Umn = Ty();
    var wgu = {
      message: ({
        params: {
          min: e,
          max: t
        }
      }) => t === undefined ? z7.str`must contain at least ${e} valid item(s)` : z7.str`must contain at least ${e} and no more than ${t} valid item(s)`,
      params: ({
        params: {
          min: e,
          max: t
        }
      }) => t === undefined ? z7._`{minContains: ${e}}` : z7._`{minContains: ${e}, maxContains: ${t}}`
    };
    var Cgu = {
      keyword: "contains",
      type: "array",
      schemaType: ["object", "boolean"],
      before: "uniqueItems",
      trackErrors: true,
      error: wgu,
      code(e) {
        let {
          gen: t,
          schema: n,
          parentSchema: r,
          data: o,
          vGd: s
        } = e;
        let i;
        let a;
        let {
          minContains: l,
          maxContains: c
        } = r;
        if (s.opts.next) {
          i = l === undefined ? 1 : l;
          a = c;
        } else {
          i = 1;
        }
        let u = t.const("len", z7._`${o}.length`);
        if (e.setParams({
          min: i,
          max: a
        }), a === undefined && i === 0) {
          (0, Umn.checkStrictMode)(s, '"minContains" == 0 without "maxContains": "contains" keyword ignored');
          return;
        }
        if (a !== undefined && i > a) {
          (0, Umn.checkStrictMode)(s, '"minContains" > "maxContains" is always invalid');
          e.fail();
          return;
        }
        if ((0, Umn.alwaysValidSchema)(s, n)) {
          let h = z7._`${u} >= ${i}`;
          if (a !== undefined) {
            h = z7._`${h} && ${u} <= ${a}`;
          }
          e.pass(h);
          return;
        }
        s.items = true;
        let d = t.name("valid");
        if (a === undefined && i === 1) {
          m(d, () => t.if(d, () => t.break()));
        } else if (i === 0) {
          if (t.let(d, true), a !== undefined) {
            t.if(z7._`${o}.length > 0`, p);
          }
        } else {
          t.let(d, false);
          p();
        }
        e.result(d, () => e.reset());
        function p() {
          let h = t.name("_valid");
          let g = t.let("count", 0);
          m(h, () => t.if(h, () => f(g)));
        }
        function m(h, g) {
          t.forRange("i", 0, u, y => {
            e.subschema({
              keyword: "contains",
              dataProp: y,
              dataPropType: Umn.Type.Num,
              compositeRule: true
            }, h);
            g();
          });
        }
        function f(h) {
          if (t.code(z7._`${h}++`), a === undefined) {
            t.if(z7._`${h} >= ${i}`, () => t.assign(d, true).break());
          } else if (t.if(z7._`${h} > ${a}`, () => t.assign(d, false).break()), i === 1) {
            t.assign(d, true);
          } else {
            t.if(z7._`${h} >= ${i}`, () => t.assign(d, true));
          }
        }
      }
    };
    SPr.default = Cgu;
  });
  var lbs = __commonJS(tle => {
    Object.defineProperty(tle, "__esModule", {
      value: true
    });
    tle.validateSchemaDeps = tle.validatePropertyDeps = tle.error = undefined;
    var TPr = Sf();
    var Rgu = Ty();
    var NOt = G7();
    tle.error = {
      message: ({
        params: {
          property: e,
          depsCount: t,
          deps: n
        }
      }) => {
        let r = t === 1 ? "property" : "properties";
        return TPr.str`must have ${r} ${n} when property ${e} is present`;
      },
      params: ({
        params: {
          property: e,
          depsCount: t,
          deps: n,
          missingProperty: r
        }
      }) => TPr._`{property: ${e},
    missingProperty: ${r},
    depsCount: ${t},
    deps: ${n}}`
    };
    var xgu = {
      keyword: "dependencies",
      type: "object",
      schemaType: "object",
      error: tle.error,
      code(e) {
        let [t, n] = kgu(e);
        ibs(e, t);
        abs(e, n);
      }
    };
    function kgu({
      schema: e
    }) {
      let t = {};
      let n = {};
      for (let r in e) {
        if (r === "__proto__") {
          continue;
        }
        let o = Array.isArray(e[r]) ? t : n;
        o[r] = e[r];
      }
      return [t, n];
    }
    function ibs(e, t = e.schema) {
      let {
        gen: n,
        data: r,
        vGd: o
      } = e;
      if (Object.keys(t).length === 0) {
        return;
      }
      let s = n.let("missing");
      for (let i in t) {
        let a = t[i];
        if (a.length === 0) {
          continue;
        }
        let l = (0, NOt.propertyInData)(n, r, i, o.opts.ownProperties);
        if (e.setParams({
          property: i,
          depsCount: a.length,
          deps: a.join(", ")
        }), o.allErrors) {
          n.if(l, () => {
            for (let c of a) {
              (0, NOt.checkReportMissingProp)(e, c);
            }
          });
        } else {
          n.if(TPr._`${l} && (${(0, NOt.checkMissingProp)(e, a, s)})`);
          (0, NOt.reportMissingProp)(e, s);
          n.else();
        }
      }
    }
    tle.validatePropertyDeps = ibs;
    function abs(e, t = e.schema) {
      let {
        gen: n,
        data: r,
        keyword: o,
        vGd: s
      } = e;
      let i = n.name("valid");
      for (let a in t) {
        if ((0, Rgu.alwaysValidSchema)(s, t[a])) {
          continue;
        }
        n.if((0, NOt.propertyInData)(n, r, a, s.opts.ownProperties), () => {
          let l = e.subschema({
            keyword: o,
            schemaProp: a
          }, i);
          e.mergeValidEvaluated(l, i);
        }, () => n.var(i, true));
        e.ok(i);
      }
    }
    tle.validateSchemaDeps = abs;
    tle.default = xgu;
  });
  var ubs = __commonJS(EPr => {
    Object.defineProperty(EPr, "__esModule", {
      value: true
    });
    var cbs = Sf();
    var Agu = Ty();
    var Igu = {
      message: "property name must be valid",
      params: ({
        params: e
      }) => cbs._`{propertyName: ${e.propertyName}}`
    };
    var Pgu = {
      keyword: "propertyNames",
      type: "object",
      schemaType: ["object", "boolean"],
      error: Igu,
      code(e) {
        let {
          gen: t,
          schema: n,
          data: r,
          vGd: o
        } = e;
        if ((0, Agu.alwaysValidSchema)(o, n)) {
          return;
        }
        let s = t.name("valid");
        t.forIn("key", r, i => {
          e.setParams({
            propertyName: i
          });
          e.subschema({
            keyword: "propertyNames",
            data: i,
            dataTypes: ["string"],
            propertyName: i,
            compositeRule: true
          }, s);
          t.if((0, cbs.not)(s), () => {
            if (e.error(true), !o.allErrors) {
              t.break();
            }
          });
        });
        e.ok(s);
      }
    };
    EPr.default = Pgu;
  });
  var wPr = __commonJS(vPr => {
    Object.defineProperty(vPr, "__esModule", {
      value: true
    });
    var Bmn = G7();
    var xte = Sf();
    var Ogu = uye();
    var $mn = Ty();
    var Dgu = {
      message: "must NOT have additional properties",
      params: ({
        params: e
      }) => xte._`{additionalProperty: ${e.additionalProperty}}`
    };
    var Mgu = {
      keyword: "additionalProperties",
      type: ["object"],
      schemaType: ["boolean", "object"],
      allowUndefined: true,
      trackErrors: true,
      error: Dgu,
      code(e) {
        let {
          gen: t,
          schema: n,
          parentSchema: r,
          data: o,
          errsCount: s,
          vGd: i
        } = e;
        if (!s) {
          throw Error("ajv implementation error");
        }
        let {
          allErrors: a,
          opts: l
        } = i;
        if (i.props = true, l.removeAdditional !== "all" && (0, $mn.alwaysValidSchema)(i, n)) {
          return;
        }
        let c = (0, Bmn.allSchemaProperties)(r.properties);
        let u = (0, Bmn.allSchemaProperties)(r.patternProperties);
        d();
        e.ok(xte._`${s} === ${Ogu.default.errors}`);
        function d() {
          t.forIn("key", o, g => {
            if (!c.length && !u.length) {
              f(g);
            } else {
              t.if(p(g), () => f(g));
            }
          });
        }
        function p(g) {
          let y;
          if (c.length > 8) {
            let _ = (0, $mn.schemaRefOrVal)(i, r.properties, "properties");
            y = (0, Bmn.isOwnProperty)(t, _, g);
          } else if (c.length) {
            y = (0, xte.or)(...c.map(_ => xte._`${g} === ${_}`));
          } else {
            y = xte.nil;
          }
          if (u.length) {
            y = (0, xte.or)(y, ...u.map(_ => xte._`${(0, Bmn.usePattern)(e, _)}.test(${g})`));
          }
          return (0, xte.not)(y);
        }
        function m(g) {
          t.code(xte._`delete ${o}[${g}]`);
        }
        function f(g) {
          if (l.removeAdditional === "all" || l.removeAdditional && n === false) {
            m(g);
            return;
          }
          if (n === false) {
            if (e.setParams({
              additionalProperty: g
            }), e.error(), !a) {
              t.break();
            }
            return;
          }
          if (typeof n == "object" && !(0, $mn.alwaysValidSchema)(i, n)) {
            let y = t.name("valid");
            if (l.removeAdditional === "failing") {
              h(g, y, false);
              t.if((0, xte.not)(y), () => {
                e.reset();
                m(g);
              });
            } else if (h(g, y), !a) {
              t.if((0, xte.not)(y), () => t.break());
            }
          }
        }
        function h(g, y, _) {
          let b = {
            keyword: "additionalProperties",
            dataProp: g,
            dataPropType: $mn.Type.Str
          };
          if (_ === false) {
            Object.assign(b, {
              compositeRule: true,
              createErrors: false,
              allErrors: false
            });
          }
          e.subschema(b, y);
        }
      }
    };
    vPr.default = Mgu;
  });
  var mbs = __commonJS(RPr => {
    Object.defineProperty(RPr, "__esModule", {
      value: true
    });
    var Ngu = TOt();
    var dbs = G7();
    var CPr = Ty();
    var pbs = wPr();
    var Lgu = {
      keyword: "properties",
      type: "object",
      schemaType: "object",
      code(e) {
        let {
          gen: t,
          schema: n,
          parentSchema: r,
          data: o,
          vGd: s
        } = e;
        if (s.opts.removeAdditional === "all" && r.additionalProperties === undefined) {
          pbs.default.code(new Ngu.KeywordCxt(s, pbs.default, "additionalProperties"));
        }
        let i = (0, dbs.allSchemaProperties)(n);
        for (let d of i) {
          s.definedProperties.add(d);
        }
        if (s.opts.unevaluated && i.length && s.props !== true) {
          s.props = CPr.mergeEvaluated.props(t, (0, CPr.toHash)(i), s.props);
        }
        let a = i.filter(d => !(0, CPr.alwaysValidSchema)(s, n[d]));
        if (a.length === 0) {
          return;
        }
        let l = t.name("valid");
        for (let d of a) {
          if (c(d)) {
            u(d);
          } else {
            if (t.if((0, dbs.propertyInData)(t, o, d, s.opts.ownProperties)), u(d), !s.allErrors) {
              t.else().var(l, true);
            }
            t.endIf();
          }
          e.vGd.definedProperties.add(d);
          e.ok(l);
        }
        function c(d) {
          return s.opts.useDefaults && !s.compositeRule && n[d].default !== undefined;
        }
        function u(d) {
          e.subschema({
            keyword: "properties",
            schemaProp: d,
            dataProp: d
          }, l);
        }
      }
    };
    RPr.default = Lgu;
  });
  var ybs = __commonJS(xPr => {
    Object.defineProperty(xPr, "__esModule", {
      value: true
    });
    var fbs = G7();
    var Hmn = Sf();
    var hbs = Ty();
    var gbs = Ty();
    var Fgu = {
      keyword: "patternProperties",
      type: "object",
      schemaType: "object",
      code(e) {
        let {
          gen: t,
          schema: n,
          data: r,
          parentSchema: o,
          vGd: s
        } = e;
        let {
          opts: i
        } = s;
        let a = (0, fbs.allSchemaProperties)(n);
        let l = a.filter(h => (0, hbs.alwaysValidSchema)(s, n[h]));
        if (a.length === 0 || l.length === a.length && (!s.opts.unevaluated || s.props === true)) {
          return;
        }
        let c = i.strictSchema && !i.allowMatchingProperties && o.properties;
        let u = t.name("valid");
        if (s.props !== true && !(s.props instanceof Hmn.Name)) {
          s.props = (0, gbs.evaluatedPropsToName)(t, s.props);
        }
        let {
          props: d
        } = s;
        p();
        function p() {
          for (let h of a) {
            if (c) {
              m(h);
            }
            if (s.allErrors) {
              f(h);
            } else {
              t.var(u, true);
              f(h);
              t.if(u);
            }
          }
        }
        function m(h) {
          for (let g in c) {
            if (new RegExp(h).test(g)) {
              (0, hbs.checkStrictMode)(s, `property ${g} matches pattern ${h} (use allowMatchingProperties)`);
            }
          }
        }
        function f(h) {
          t.forIn("key", r, g => {
            t.if(Hmn._`${(0, fbs.usePattern)(e, h)}.test(${g})`, () => {
              let y = l.includes(h);
              if (!y) {
                e.subschema({
                  keyword: "patternProperties",
                  schemaProp: h,
                  dataProp: g,
                  dataPropType: gbs.Type.Str
                }, u);
              }
              if (s.opts.unevaluated && d !== true) {
                t.assign(Hmn._`${d}[${g}]`, true);
              } else if (!y && !s.allErrors) {
                t.if((0, Hmn.not)(u), () => t.break());
              }
            });
          });
        }
      }
    };
    xPr.default = Fgu;
  });
  var _bs = __commonJS(kPr => {
    Object.defineProperty(kPr, "__esModule", {
      value: true
    });
    var Ugu = Ty();
    var Bgu = {
      keyword: "not",
      schemaType: ["object", "boolean"],
      trackErrors: true,
      code(e) {
        let {
          gen: t,
          schema: n,
          vGd: r
        } = e;
        if ((0, Ugu.alwaysValidSchema)(r, n)) {
          e.fail();
          return;
        }
        let o = t.name("valid");
        e.subschema({
          keyword: "not",
          compositeRule: true,
          createErrors: false,
          allErrors: false
        }, o);
        e.failResult(o, () => e.reset(), () => e.error());
      },
      error: {
        message: "must NOT be valid"
      }
    };
    kPr.default = Bgu;
  });
  var bbs = __commonJS(APr => {
    Object.defineProperty(APr, "__esModule", {
      value: true
    });
    var $gu = G7();
    var Hgu = {
      keyword: "anyOf",
      schemaType: "array",
      trackErrors: true,
      code: $gu.validateUnion,
      error: {
        message: "must match a schema in anyOf"
      }
    };
    APr.default = Hgu;
  });
  var Sbs = __commonJS(IPr => {
    Object.defineProperty(IPr, "__esModule", {
      value: true
    });
    var jmn = Sf();
    var jgu = Ty();
    var qgu = {
      message: "must match exactly one schema in oneOf",
      params: ({
        params: e
      }) => jmn._`{passingSchemas: ${e.passing}}`
    };
    var Wgu = {
      keyword: "oneOf",
      schemaType: "array",
      trackErrors: true,
      error: qgu,
      code(e) {
        let {
          gen: t,
          schema: n,
          parentSchema: r,
          vGd: o
        } = e;
        if (!Array.isArray(n)) {
          throw Error("ajv implementation error");
        }
        if (o.opts.discriminator && r.discriminator) {
          return;
        }
        let s = n;
        let i = t.let("valid", false);
        let a = t.let("passing", null);
        let l = t.name("_valid");
        e.setParams({
          passing: a
        });
        t.block(c);
        e.result(i, () => e.reset(), () => e.error(true));
        function c() {
          s.forEach((u, d) => {
            let p;
            if ((0, jgu.alwaysValidSchema)(o, u)) {
              t.var(l, true);
            } else {
              p = e.subschema({
                keyword: "oneOf",
                schemaProp: d,
                compositeRule: true
              }, l);
            }
            if (d > 0) {
              t.if(jmn._`${l} && ${i}`).assign(i, false).assign(a, jmn._`[${a}, ${d}]`).else();
            }
            t.if(l, () => {
              if (t.assign(i, true), t.assign(a, d), p) {
                e.mergeEvaluated(p, jmn.Name);
              }
            });
          });
        }
      }
    };
    IPr.default = Wgu;
  });
  var Tbs = __commonJS(PPr => {
    Object.defineProperty(PPr, "__esModule", {
      value: true
    });
    var Ggu = Ty();
    var Vgu = {
      keyword: "allOf",
      schemaType: "array",
      code(e) {
        let {
          gen: t,
          schema: n,
          vGd: r
        } = e;
        if (!Array.isArray(n)) {
          throw Error("ajv implementation error");
        }
        let o = t.name("valid");
        n.forEach((s, i) => {
          if ((0, Ggu.alwaysValidSchema)(r, s)) {
            return;
          }
          let a = e.subschema({
            keyword: "allOf",
            schemaProp: i
          }, o);
          e.ok(o);
          e.mergeEvaluated(a);
        });
      }
    };
    PPr.default = Vgu;
  });
  var wbs = __commonJS(OPr => {
    Object.defineProperty(OPr, "__esModule", {
      value: true
    });
    var qmn = Sf();
    var vbs = Ty();
    var zgu = {
      message: ({
        params: e
      }) => qmn.str`must match "${e.ifClause}" schema`,
      params: ({
        params: e
      }) => qmn._`{failingKeyword: ${e.ifClause}}`
    };
    var Kgu = {
      keyword: "if",
      schemaType: ["object", "boolean"],
      trackErrors: true,
      error: zgu,
      code(e) {
        let {
          gen: t,
          parentSchema: n,
          vGd: r
        } = e;
        if (n.then === undefined && n.else === undefined) {
          (0, vbs.checkStrictMode)(r, '"if" without "then" and "else" is ignored');
        }
        let o = Ebs(r, "then");
        let s = Ebs(r, "else");
        if (!o && !s) {
          return;
        }
        let i = t.let("valid", true);
        let a = t.name("_valid");
        if (l(), e.reset(), o && s) {
          let u = t.let("ifClause");
          e.setParams({
            ifClause: u
          });
          t.if(a, c("then", u), c("else", u));
        } else if (o) {
          t.if(a, c("then"));
        } else {
          t.if((0, qmn.not)(a), c("else"));
        }
        e.pass(i, () => e.error(true));
        function l() {
          let u = e.subschema({
            keyword: "if",
            compositeRule: true,
            createErrors: false,
            allErrors: false
          }, a);
          e.mergeEvaluated(u);
        }
        function c(u, d) {
          return () => {
            let p = e.subschema({
              keyword: u
            }, a);
            if (t.assign(i, a), e.mergeValidEvaluated(p, i), d) {
              t.assign(d, qmn._`${u}`);
            } else {
              e.setParams({
                ifClause: u
              });
            }
          };
        }
      }
    };
    function Ebs(e, t) {
      let n = e.schema[t];
      return n !== undefined && !(0, vbs.alwaysValidSchema)(e, n);
    }
    OPr.default = Kgu;
  });
  var Cbs = __commonJS(DPr => {
    Object.defineProperty(DPr, "__esModule", {
      value: true
    });
    var Ygu = Ty();
    var Jgu = {
      keyword: ["then", "else"],
      schemaType: ["object", "boolean"],
      code({
        keyword: e,
        parentSchema: t,
        vGd: n
      }) {
        if (t.if === undefined) {
          (0, Ygu.checkStrictMode)(n, `"${e}" without "if" is ignored`);
        }
      }
    };
    DPr.default = Jgu;
  });
  var Rbs = __commonJS(MPr => {
    Object.defineProperty(MPr, "__esModule", {
      value: true
    });
    var Xgu = gPr();
    var Qgu = nbs();
    var Zgu = yPr();
    var eyu = obs();
    var tyu = sbs();
    var nyu = lbs();
    var ryu = ubs();
    var oyu = wPr();
    var syu = mbs();
    var iyu = ybs();
    var ayu = _bs();
    var lyu = bbs();
    var cyu = Sbs();
    var uyu = Tbs();
    var dyu = wbs();
    var pyu = Cbs();
    function myu(e = false) {
      let t = [ayu.default, lyu.default, cyu.default, uyu.default, dyu.default, pyu.default, ryu.default, oyu.default, nyu.default, syu.default, iyu.default];
      if (e) {
        t.push(Qgu.default, eyu.default);
      } else {
        t.push(Xgu.default, Zgu.default);
      }
      t.push(tyu.default);
      return t;
    }
    MPr.default = myu;
  });
  var xbs = __commonJS(NPr => {
    Object.defineProperty(NPr, "__esModule", {
      value: true
    });
    var mI = Sf();
    var fyu = {
      message: ({
        schemaCode: e
      }) => mI.str`must match format "${e}"`,
      params: ({
        schemaCode: e
      }) => mI._`{format: ${e}}`
    };
    var hyu = {
      keyword: "format",
      type: ["number", "string"],
      schemaType: "string",
      $data: true,
      error: fyu,
      code(e, t) {
        let {
          gen: n,
          data: r,
          $data: o,
          schema: s,
          schemaCode: i,
          vGd: a
        } = e;
        let {
          opts: l,
          errSchemaPath: c,
          schemaEnv: u,
          self: d
        } = a;
        if (!l.validateFormats) {
          return;
        }
        if (o) {
          p();
        } else {
          m();
        }
        function p() {
          let f = n.scopeValue("formats", {
            ref: d.formats,
            code: l.code.formats
          });
          let h = n.const("fDef", mI._`${f}[${i}]`);
          let g = n.let("fType");
          let y = n.let("format");
          n.if(mI._`typeof ${h} == "object" && !(${h} instanceof RegExp)`, () => n.assign(g, mI._`${h}.type || "string"`).assign(y, mI._`${h}.validate`), () => n.assign(g, mI._`"string"`).assign(y, h));
          e.fail$data((0, mI.or)(_(), b()));
          function _() {
            if (l.strictSchema === false) {
              return mI.nil;
            }
            return mI._`${i} && !${y}`;
          }
          function b() {
            let S = u.$async ? mI._`(${h}.async ? await ${y}(${r}) : ${y}(${r}))` : mI._`${y}(${r})`;
            let E = mI._`(typeof ${y} == "function" ? ${S} : ${y}.test(${r}))`;
            return mI._`${y} && ${y} !== true && ${g} === ${t} && !${E}`;
          }
        }
        function m() {
          let f = d.formats[s];
          if (!f) {
            _();
            return;
          }
          if (f === true) {
            return;
          }
          let [h, g, y] = b(f);
          if (h === t) {
            e.pass(S());
          }
          function _() {
            if (l.strictSchema === false) {
              d.logger.warn(E());
              return;
            }
            throw Error(E());
            function E() {
              return `unknown format "${s}" ignored in schema at path "${c}"`;
            }
          }
          function b(E) {
            let C = E instanceof RegExp ? (0, mI.regexpCode)(E) : l.code.formats ? mI._`${l.code.formats}${(0, mI.getProperty)(s)}` : undefined;
            let x = n.scopeValue("formats", {
              key: s,
              ref: E,
              code: C
            });
            if (typeof E == "object" && !(E instanceof RegExp)) {
              return [E.type || "string", E.validate, mI._`${x}.validate`];
            }
            return ["string", E, x];
          }
          function S() {
            if (typeof f == "object" && !(f instanceof RegExp) && f.async) {
              if (!u.$async) {
                throw Error("async format in sync schema");
              }
              return mI._`await ${y}(${r})`;
            }
            return typeof g == "function" ? mI._`${y}(${r})` : mI._`${y}.test(${r})`;
          }
        }
      }
    };
    NPr.default = hyu;
  });
  var kbs = __commonJS(LPr => {
    Object.defineProperty(LPr, "__esModule", {
      value: true
    });
    var gyu = xbs();
    var yyu = [gyu.default];
    LPr.default = yyu;
  });
  var Abs = __commonJS(ltt => {
    Object.defineProperty(ltt, "__esModule", {
      value: true
    });
    ltt.contentVocabulary = ltt.metadataVocabulary = undefined;
    ltt.metadataVocabulary = ["title", "description", "default", "deprecated", "readOnly", "writeOnly", "examples"];
    ltt.contentVocabulary = ["contentMediaType", "contentEncoding", "contentSchema"];
  });
  var Pbs = __commonJS(FPr => {
    Object.defineProperty(FPr, "__esModule", {
      value: true
    });
    var _yu = U_s();
    var byu = Q_s();
    var Syu = Rbs();
    var Tyu = kbs();
    var Ibs = Abs();
    var Eyu = [_yu.default, byu.default, (0, Syu.default)(), Tyu.default, Ibs.metadataVocabulary, Ibs.contentVocabulary];
    FPr.default = Eyu;
  });
  var Dbs = __commonJS(Wmn => {
    Object.defineProperty(Wmn, "__esModule", {
      value: true
    });
    Wmn.DiscrError = undefined;
    var Obs;
    (function (e) {
      e.Tag = "tag";
      e.Mapping = "mapping";
    })(Obs || (Wmn.DiscrError = Obs = {}));
  });
  var Nbs = __commonJS(BPr => {
    Object.defineProperty(BPr, "__esModule", {
      value: true
    });
    var ctt = Sf();
    var UPr = Dbs();
    var Mbs = Rmn();
    var vyu = EOt();
    var wyu = Ty();
    var Cyu = {
      message: ({
        params: {
          discrError: e,
          tagName: t
        }
      }) => e === UPr.DiscrError.Tag ? `tag "${t}" must be string` : `value of tag "${t}" must be in oneOf`,
      params: ({
        params: {
          discrError: e,
          tag: t,
          tagName: n
        }
      }) => ctt._`{error: ${e}, tag: ${n}, tagValue: ${t}}`
    };
    var Ryu = {
      keyword: "discriminator",
      type: "object",
      schemaType: "object",
      error: Cyu,
      code(e) {
        let {
          gen: t,
          data: n,
          schema: r,
          parentSchema: o,
          vGd: s
        } = e;
        let {
          oneOf: i
        } = o;
        if (!s.opts.discriminator) {
          throw Error("discriminator: requires discriminator option");
        }
        let a = r.propertyName;
        if (typeof a != "string") {
          throw Error("discriminator: requires propertyName");
        }
        if (r.mapping) {
          throw Error("discriminator: mapping is not supported");
        }
        if (!i) {
          throw Error("discriminator: requires oneOf keyword");
        }
        let l = t.let("valid", false);
        let c = t.const("tag", ctt._`${n}${(0, ctt.getProperty)(a)}`);
        t.if(ctt._`typeof ${c} == "string"`, () => u(), () => e.error(false, {
          discrError: UPr.DiscrError.Tag,
          tag: c,
          tagName: a
        }));
        e.ok(l);
        function u() {
          let m = p();
          t.if(false);
          for (let f in m) {
            t.elseIf(ctt._`${c} === ${f}`);
            t.assign(l, d(m[f]));
          }
          t.else();
          e.error(false, {
            discrError: UPr.DiscrError.Mapping,
            tag: c,
            tagName: a
          });
          t.endIf();
        }
        function d(m) {
          let f = t.name("valid");
          let h = e.subschema({
            keyword: "oneOf",
            schemaProp: m
          }, f);
          e.mergeEvaluated(h, ctt.Name);
          return f;
        }
        function p() {
          var m;
          let f = {};
          let h = y(o);
          let g = true;
          for (let S = 0; S < i.length; S++) {
            let E = i[S];
            if ((E === null || E === undefined ? undefined : E.$ref) && !(0, wyu.schemaHasRulesButRef)(E, s.self.RULES)) {
              let x = E.$ref;
              if (E = Mbs.resolveRef.call(s.self, s.schemaEnv.root, s.baseId, x), E instanceof Mbs.SchemaEnv) {
                E = E.schema;
              }
              if (E === undefined) {
                throw new vyu.default(s.opts.uriResolver, s.baseId, x);
              }
            }
            let C = (m = E === null || E === undefined ? undefined : E.properties) === null || m === undefined ? undefined : m[a];
            if (typeof C != "object") {
              throw Error(`discriminator: oneOf subschemas (or referenced schemas) must have "properties/${a}"`);
            }
            g = g && (h || y(E));
            _(C, S);
          }
          if (!g) {
            throw Error(`discriminator: "${a}" must be required`);
          }
          return f;
          function y({
            required: S
          }) {
            return Array.isArray(S) && S.includes(a);
          }
          function _(S, E) {
            if (S.const) {
              b(S.const, E);
            } else if (S.enum) {
              for (let C of S.enum) {
                b(C, E);
              }
            } else {
              throw Error(`discriminator: "properties/${a}" must have "const" or "enum"`);
            }
          }
          function b(S, E) {
            if (typeof S != "string" || S in f) {
              throw Error(`discriminator: "${a}" values must be unique strings`);
            }
            f[S] = E;
          }
        }
      }
    };
    BPr.default = Ryu;
  });
  var Lbs = __commonJS((rfh, xyu) => {
    xyu.exports = {
      $schema: "http://json-schema.org/draft-07/schema#",
      $id: "http://json-schema.org/draft-07/schema#",
      title: "Core schema meta-schema",
      definitions: {
        schemaArray: {
          type: "array",
          minItems: 1,
          items: {
            $ref: "#"
          }
        },
        nonNegativeInteger: {
          type: "integer",
          minimum: 0
        },
        nonNegativeIntegerDefault0: {
          allOf: [{
            $ref: "#/definitions/nonNegativeInteger"
          }, {
            default: 0
          }]
        },
        simpleTypes: {
          enum: ["array", "boolean", "integer", "null", "number", "object", "string"]
        },
        stringArray: {
          type: "array",
          items: {
            type: "string"
          },
          uniqueItems: true,
          default: []
        }
      },
      type: ["object", "boolean"],
      properties: {
        $id: {
          type: "string",
          format: "uri-reference"
        },
        $schema: {
          type: "string",
          format: "uri"
        },
        $ref: {
          type: "string",
          format: "uri-reference"
        },
        $comment: {
          type: "string"
        },
        title: {
          type: "string"
        },
        description: {
          type: "string"
        },
        default: true,
        readOnly: {
          type: "boolean",
          default: false
        },
        examples: {
          type: "array",
          items: true
        },
        multipleOf: {
          type: "number",
          exclusiveMinimum: 0
        },
        maximum: {
          type: "number"
        },
        exclusiveMaximum: {
          type: "number"
        },
        minimum: {
          type: "number"
        },
        exclusiveMinimum: {
          type: "number"
        },
        maxLength: {
          $ref: "#/definitions/nonNegativeInteger"
        },
        minLength: {
          $ref: "#/definitions/nonNegativeIntegerDefault0"
        },
        pattern: {
          type: "string",
          format: "regex"
        },
        additionalItems: {
          $ref: "#"
        },
        items: {
          anyOf: [{
            $ref: "#"
          }, {
            $ref: "#/definitions/schemaArray"
          }],
          default: true
        },
        maxItems: {
          $ref: "#/definitions/nonNegativeInteger"
        },
        minItems: {
          $ref: "#/definitions/nonNegativeIntegerDefault0"
        },
        uniqueItems: {
          type: "boolean",
          default: false
        },
        contains: {
          $ref: "#"
        },
        maxProperties: {
          $ref: "#/definitions/nonNegativeInteger"
        },
        minProperties: {
          $ref: "#/definitions/nonNegativeIntegerDefault0"
        },
        required: {
          $ref: "#/definitions/stringArray"
        },
        additionalProperties: {
          $ref: "#"
        },
        definitions: {
          type: "object",
          additionalProperties: {
            $ref: "#"
          },
          default: {}
        },
        properties: {
          type: "object",
          additionalProperties: {
            $ref: "#"
          },
          default: {}
        },
        patternProperties: {
          type: "object",
          additionalProperties: {
            $ref: "#"
          },
          propertyNames: {
            format: "regex"
          },
          default: {}
        },
        dependencies: {
          type: "object",
          additionalProperties: {
            anyOf: [{
              $ref: "#"
            }, {
              $ref: "#/definitions/stringArray"
            }]
          }
        },
        propertyNames: {
          $ref: "#"
        },
        const: true,
        enum: {
          type: "array",
          items: true,
          minItems: 1,
          uniqueItems: true
        },
        type: {
          anyOf: [{
            $ref: "#/definitions/simpleTypes"
          }, {
            type: "array",
            items: {
              $ref: "#/definitions/simpleTypes"
            },
            minItems: 1,
            uniqueItems: true
          }]
        },
        format: {
          type: "string"
        },
        contentMediaType: {
          type: "string"
        },
        contentEncoding: {
          type: "string"
        },
        if: {
          $ref: "#"
        },
        then: {
          $ref: "#"
        },
        else: {
          $ref: "#"
        },
        allOf: {
          $ref: "#/definitions/schemaArray"
        },
        anyOf: {
          $ref: "#/definitions/schemaArray"
        },
        oneOf: {
          $ref: "#/definitions/schemaArray"
        },
        not: {
          $ref: "#"
        }
      },
      default: true
    };
  });
  var Vmn = __commonJS((hC, $Pr) => {
    Object.defineProperty(hC, "__esModule", {
      value: true
    });
    hC.MissingRefError = hC.ValidationError = hC.CodeGen = hC.Name = hC.nil = hC.stringify = hC.str = hC._ = hC.KeywordCxt = hC.Ajv = undefined;
    var kyu = O_s();
    var Ayu = Pbs();
    var Iyu = Nbs();
    var Fbs = Lbs();
    var Pyu = ["/properties"];
    class LOt extends kyu.default {
      _addVocabularies() {
        if (super._addVocabularies(), Ayu.default.forEach(e => this.addVocabulary(e)), this.opts.discriminator) {
          this.addKeyword(Iyu.default);
        }
      }
      _addDefaultMetaSchema() {
        if (super._addDefaultMetaSchema(), !this.opts.meta) {
          return;
        }
        let e = this.opts.$data ? this.$dataMetaSchema(Fbs, Pyu) : Fbs;
        this.addMetaSchema(e, "http://json-schema.org/draft-07/schema", false);
        this.refs["http://json-schema.org/schema"] = "http://json-schema.org/draft-07/schema";
      }
      defaultMeta() {
        return this.opts.defaultMeta = super.defaultMeta() || (this.getSchema("http://json-schema.org/draft-07/schema") ? "http://json-schema.org/draft-07/schema" : undefined);
      }
    }
    hC.Ajv = LOt;
    $Pr.exports = hC = LOt;
    $Pr.exports.Ajv = LOt;
    Object.defineProperty(hC, "__esModule", {
      value: true
    });
    hC.default = LOt;
    var Oyu = TOt();
    Object.defineProperty(hC, "KeywordCxt", {
      enumerable: true,
      get: function () {
        return Oyu.KeywordCxt;
      }
    });
    var utt = Sf();
    Object.defineProperty(hC, "_", {
      enumerable: true,
      get: function () {
        return utt._;
      }
    });
    Object.defineProperty(hC, "str", {
      enumerable: true,
      get: function () {
        return utt.str;
      }
    });
    Object.defineProperty(hC, "stringify", {
      enumerable: true,
      get: function () {
        return utt.stringify;
      }
    });
    Object.defineProperty(hC, "nil", {
      enumerable: true,
      get: function () {
        return utt.nil;
      }
    });
    Object.defineProperty(hC, "Name", {
      enumerable: true,
      get: function () {
        return utt.Name;
      }
    });
    Object.defineProperty(hC, "CodeGen", {
      enumerable: true,
      get: function () {
        return utt.CodeGen;
      }
    });
    var Dyu = wmn();
    Object.defineProperty(hC, "ValidationError", {
      enumerable: true,
      get: function () {
        return Dyu.default;
      }
    });
    var Myu = EOt();
    Object.defineProperty(hC, "MissingRefError", {
      enumerable: true,
      get: function () {
        return Myu.default;
      }
    });
  });
  var Gbs = __commonJS(rle => {
    Object.defineProperty(rle, "__esModule", {
      value: true
    });
    rle.formatNames = rle.fastFormats = rle.fullFormats = undefined;
    function nle(e, t) {
      return {
        validate: e,
        compare: t
      };
    }
    rle.fullFormats = {
      date: nle(Hbs, WPr),
      time: nle(jPr(true), GPr),
      "date-time": nle(Ubs(true), qbs),
      "iso-time": nle(jPr(), jbs),
      "iso-date-time": nle(Ubs(), Wbs),
      duration: /^P(?!$)((\d+Y)?(\d+M)?(\d+D)?(T(?=\d)(\d+H)?(\d+M)?(\d+S)?)?|(\d+W)?)$/,
      uri: $yu,
      "uri-reference": /^(?:[a-z][a-z0-9+\-.]*:)?(?:\/?\/(?:(?:[a-z0-9\-._~!$&'()*+,;=:]|%[0-9a-f]{2})*@)?(?:\[(?:(?:(?:(?:[0-9a-f]{1,4}:){6}|::(?:[0-9a-f]{1,4}:){5}|(?:[0-9a-f]{1,4})?::(?:[0-9a-f]{1,4}:){4}|(?:(?:[0-9a-f]{1,4}:){0,1}[0-9a-f]{1,4})?::(?:[0-9a-f]{1,4}:){3}|(?:(?:[0-9a-f]{1,4}:){0,2}[0-9a-f]{1,4})?::(?:[0-9a-f]{1,4}:){2}|(?:(?:[0-9a-f]{1,4}:){0,3}[0-9a-f]{1,4})?::[0-9a-f]{1,4}:|(?:(?:[0-9a-f]{1,4}:){0,4}[0-9a-f]{1,4})?::)(?:[0-9a-f]{1,4}:[0-9a-f]{1,4}|(?:(?:25[0-5]|2[0-4]\d|[01]?\d\d?)\.){3}(?:25[0-5]|2[0-4]\d|[01]?\d\d?))|(?:(?:[0-9a-f]{1,4}:){0,5}[0-9a-f]{1,4})?::[0-9a-f]{1,4}|(?:(?:[0-9a-f]{1,4}:){0,6}[0-9a-f]{1,4})?::)|[Vv][0-9a-f]+\.[a-z0-9\-._~!$&'()*+,;=:]+)\]|(?:(?:25[0-5]|2[0-4]\d|[01]?\d\d?)\.){3}(?:25[0-5]|2[0-4]\d|[01]?\d\d?)|(?:[a-z0-9\-._~!$&'"()*+,;=]|%[0-9a-f]{2})*)(?::\d*)?(?:\/(?:[a-z0-9\-._~!$&'"()*+,;=:@]|%[0-9a-f]{2})*)*|\/(?:(?:[a-z0-9\-._~!$&'"()*+,;=:@]|%[0-9a-f]{2})+(?:\/(?:[a-z0-9\-._~!$&'"()*+,;=:@]|%[0-9a-f]{2})*)*)?|(?:[a-z0-9\-._~!$&'"()*+,;=:@]|%[0-9a-f]{2})+(?:\/(?:[a-z0-9\-._~!$&'"()*+,;=:@]|%[0-9a-f]{2})*)*)?(?:\?(?:[a-z0-9\-._~!$&'"()*+,;=:@/?]|%[0-9a-f]{2})*)?(?:#(?:[a-z0-9\-._~!$&'"()*+,;=:@/?]|%[0-9a-f]{2})*)?$/i,
      "uri-template": /^(?:(?:[^\x00-\x20"'<>%\\^`{|}]|%[0-9a-f]{2})|\{[+#./;?&=,!@|]?(?:[a-z0-9_]|%[0-9a-f]{2})+(?::[1-9][0-9]{0,3}|\*)?(?:,(?:[a-z0-9_]|%[0-9a-f]{2})+(?::[1-9][0-9]{0,3}|\*)?)*\})*$/i,
      url: /^(?:https?|ftp):\/\/(?:\S+(?::\S*)?@)?(?:(?!(?:10|127)(?:\.\d{1,3}){3})(?!(?:169\.254|192\.168)(?:\.\d{1,3}){2})(?!172\.(?:1[6-9]|2\d|3[0-1])(?:\.\d{1,3}){2})(?:[1-9]\d?|1\d\d|2[01]\d|22[0-3])(?:\.(?:1?\d{1,2}|2[0-4]\d|25[0-5])){2}(?:\.(?:[1-9]\d?|1\d\d|2[0-4]\d|25[0-4]))|(?:(?:[a-z0-9\u{00a1}-\u{ffff}]+-)*[a-z0-9\u{00a1}-\u{ffff}]+)(?:\.(?:[a-z0-9\u{00a1}-\u{ffff}]+-)*[a-z0-9\u{00a1}-\u{ffff}]+)*(?:\.(?:[a-z\u{00a1}-\u{ffff}]{2,})))(?::\d{2,5})?(?:\/[^\s]*)?$/iu,
      email: /^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$/i,
      hostname: /^(?=.{1,253}\.?$)[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?(?:\.[a-z0-9](?:[-0-9a-z]{0,61}[0-9a-z])?)*\.?$/i,
      ipv4: /^(?:(?:25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)\.){3}(?:25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)$/,
      ipv6: /^((([0-9a-f]{1,4}:){7}([0-9a-f]{1,4}|:))|(([0-9a-f]{1,4}:){6}(:[0-9a-f]{1,4}|((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9a-f]{1,4}:){5}(((:[0-9a-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9a-f]{1,4}:){4}(((:[0-9a-f]{1,4}){1,3})|((:[0-9a-f]{1,4})?:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9a-f]{1,4}:){3}(((:[0-9a-f]{1,4}){1,4})|((:[0-9a-f]{1,4}){0,2}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9a-f]{1,4}:){2}(((:[0-9a-f]{1,4}){1,5})|((:[0-9a-f]{1,4}){0,3}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9a-f]{1,4}:){1}(((:[0-9a-f]{1,4}){1,6})|((:[0-9a-f]{1,4}){0,4}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(:(((:[0-9a-f]{1,4}){1,7})|((:[0-9a-f]{1,4}){0,5}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:)))$/i,
      regex: zyu,
      uuid: /^(?:urn:uuid:)?[0-9a-f]{8}-(?:[0-9a-f]{4}-){3}[0-9a-f]{12}$/i,
      "json-pointer": /^(?:\/(?:[^~/]|~0|~1)*)*$/,
      "json-pointer-uri-fragment": /^#(?:\/(?:[a-z0-9_\-.!$&'()*+,;:=@]|%[0-9a-f]{2}|~0|~1)*)*$/i,
      "relative-json-pointer": /^(?:0|[1-9][0-9]*)(?:#|(?:\/(?:[^~/]|~0|~1)*)*)$/,
      byte: Hyu,
      int32: {
        type: "number",
        validate: Wyu
      },
      int64: {
        type: "number",
        validate: Gyu
      },
      float: {
        type: "number",
        validate: $bs
      },
      double: {
        type: "number",
        validate: $bs
      },
      password: true,
      binary: true
    };
    rle.fastFormats = {
      ...rle.fullFormats,
      date: nle(/^\d\d\d\d-[0-1]\d-[0-3]\d$/, WPr),
      time: nle(/^(?:[0-2]\d:[0-5]\d:[0-5]\d|23:59:60)(?:\.\d+)?(?:z|[+-]\d\d(?::?\d\d)?)$/i, GPr),
      "date-time": nle(/^\d\d\d\d-[0-1]\d-[0-3]\dt(?:[0-2]\d:[0-5]\d:[0-5]\d|23:59:60)(?:\.\d+)?(?:z|[+-]\d\d(?::?\d\d)?)$/i, qbs),
      "iso-time": nle(/^(?:[0-2]\d:[0-5]\d:[0-5]\d|23:59:60)(?:\.\d+)?(?:z|[+-]\d\d(?::?\d\d)?)?$/i, jbs),
      "iso-date-time": nle(/^\d\d\d\d-[0-1]\d-[0-3]\d[t\s](?:[0-2]\d:[0-5]\d:[0-5]\d|23:59:60)(?:\.\d+)?(?:z|[+-]\d\d(?::?\d\d)?)?$/i, Wbs),
      uri: /^(?:[a-z][a-z0-9+\-.]*:)(?:\/?\/)?[^\s]*$/i,
      "uri-reference": /^(?:(?:[a-z][a-z0-9+\-.]*:)?\/?\/)?(?:[^\\\s#][^\s#]*)?(?:#[^\\\s]*)?$/i,
      email: /^[a-z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?(?:\.[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)*$/i
    };
    rle.formatNames = Object.keys(rle.fullFormats);
    function Nyu(e) {
      return e % 4 === 0 && (e % 100 !== 0 || e % 400 === 0);
    }
    var Fyu = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    function Hbs(e) {
      let t = (/^(\d\d\d\d)-(\d\d)-(\d\d)$/).exec(e);
      if (!t) {
        return false;
      }
      let n = +t[1];
      let r = +t[2];
      let o = +t[3];
      return r >= 1 && r <= 12 && o >= 1 && o <= (r === 2 && Nyu(n) ? 29 : Fyu[r]);
    }
    function WPr(e, t) {
      if (!(e && t)) {
        return;
      }
      if (e > t) {
        return 1;
      }
      if (e < t) {
        return -1;
      }
      return 0;
    }
    function jPr(e) {
      return function (n) {
        let r = (/^(\d\d):(\d\d):(\d\d(?:\.\d+)?)(z|([+-])(\d\d)(?::?(\d\d))?)?$/i).exec(n);
        if (!r) {
          return false;
        }
        let o = +r[1];
        let s = +r[2];
        let i = +r[3];
        let a = r[4];
        let l = r[5] === "-" ? -1 : 1;
        let c = +(r[6] || 0);
        let u = +(r[7] || 0);
        if (c > 23 || u > 59 || e && !a) {
          return false;
        }
        if (o <= 23 && s <= 59 && i < 60) {
          return true;
        }
        let d = s - u * l;
        let p = o - c * l - (d < 0 ? 1 : 0);
        return (p === 23 || p === -1) && (d === 59 || d === -1) && i < 61;
      };
    }
    function GPr(e, t) {
      if (!(e && t)) {
        return;
      }
      let n = new Date("2020-01-01T" + e).valueOf();
      let r = new Date("2020-01-01T" + t).valueOf();
      if (!(n && r)) {
        return;
      }
      return n - r;
    }
    function jbs(e, t) {
      if (!(e && t)) {
        return;
      }
      let n = (/^(\d\d):(\d\d):(\d\d(?:\.\d+)?)(z|([+-])(\d\d)(?::?(\d\d))?)?$/i).exec(e);
      let r = (/^(\d\d):(\d\d):(\d\d(?:\.\d+)?)(z|([+-])(\d\d)(?::?(\d\d))?)?$/i).exec(t);
      if (!(n && r)) {
        return;
      }
      if (e = n[1] + n[2] + n[3], t = r[1] + r[2] + r[3], e > t) {
        return 1;
      }
      if (e < t) {
        return -1;
      }
      return 0;
    }
    function Ubs(e) {
      let t = jPr(e);
      return function (r) {
        let o = r.split(/t|\s/i);
        return o.length === 2 && Hbs(o[0]) && t(o[1]);
      };
    }
    function qbs(e, t) {
      if (!(e && t)) {
        return;
      }
      let n = new Date(e).valueOf();
      let r = new Date(t).valueOf();
      if (!(n && r)) {
        return;
      }
      return n - r;
    }
    function Wbs(e, t) {
      if (!(e && t)) {
        return;
      }
      let [n, r] = e.split(/t|\s/i);
      let [o, s] = t.split(/t|\s/i);
      let i = WPr(n, o);
      if (i === undefined) {
        return;
      }
      return i || GPr(r, s);
    }
    function $yu(e) {
      return (/\/|:/).test(e) && (/^(?:[a-z][a-z0-9+\-.]*:)(?:\/?\/(?:(?:[a-z0-9\-._~!$&'()*+,;=:]|%[0-9a-f]{2})*@)?(?:\[(?:(?:(?:(?:[0-9a-f]{1,4}:){6}|::(?:[0-9a-f]{1,4}:){5}|(?:[0-9a-f]{1,4})?::(?:[0-9a-f]{1,4}:){4}|(?:(?:[0-9a-f]{1,4}:){0,1}[0-9a-f]{1,4})?::(?:[0-9a-f]{1,4}:){3}|(?:(?:[0-9a-f]{1,4}:){0,2}[0-9a-f]{1,4})?::(?:[0-9a-f]{1,4}:){2}|(?:(?:[0-9a-f]{1,4}:){0,3}[0-9a-f]{1,4})?::[0-9a-f]{1,4}:|(?:(?:[0-9a-f]{1,4}:){0,4}[0-9a-f]{1,4})?::)(?:[0-9a-f]{1,4}:[0-9a-f]{1,4}|(?:(?:25[0-5]|2[0-4]\d|[01]?\d\d?)\.){3}(?:25[0-5]|2[0-4]\d|[01]?\d\d?))|(?:(?:[0-9a-f]{1,4}:){0,5}[0-9a-f]{1,4})?::[0-9a-f]{1,4}|(?:(?:[0-9a-f]{1,4}:){0,6}[0-9a-f]{1,4})?::)|[Vv][0-9a-f]+\.[a-z0-9\-._~!$&'()*+,;=:]+)\]|(?:(?:25[0-5]|2[0-4]\d|[01]?\d\d?)\.){3}(?:25[0-5]|2[0-4]\d|[01]?\d\d?)|(?:[a-z0-9\-._~!$&'()*+,;=]|%[0-9a-f]{2})*)(?::\d*)?(?:\/(?:[a-z0-9\-._~!$&'()*+,;=:@]|%[0-9a-f]{2})*)*|\/(?:(?:[a-z0-9\-._~!$&'()*+,;=:@]|%[0-9a-f]{2})+(?:\/(?:[a-z0-9\-._~!$&'()*+,;=:@]|%[0-9a-f]{2})*)*)?|(?:[a-z0-9\-._~!$&'()*+,;=:@]|%[0-9a-f]{2})+(?:\/(?:[a-z0-9\-._~!$&'()*+,;=:@]|%[0-9a-f]{2})*)*)(?:\?(?:[a-z0-9\-._~!$&'()*+,;=:@/?]|%[0-9a-f]{2})*)?(?:#(?:[a-z0-9\-._~!$&'()*+,;=:@/?]|%[0-9a-f]{2})*)?$/i).test(e);
    }
    function Hyu(e) {
      (/^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$/gm).lastIndex = 0;
      return (/^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$/gm).test(e);
    }
    var jyu = -2147483648;
    function Wyu(e) {
      return Number.isInteger(e) && e <= 2147483647 && e >= jyu;
    }
    function Gyu(e) {
      return Number.isInteger(e);
    }
    function $bs() {
      return true;
    }
    function zyu(e) {
      if ((/[^\\]\\Z/).test(e)) {
        return false;
      }
      try {
        new RegExp(e);
        return true;
      } catch (t) {
        return false;
      }
    }
  });
  var Vbs = __commonJS(dtt => {
    Object.defineProperty(dtt, "__esModule", {
      value: true
    });