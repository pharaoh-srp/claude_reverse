  var D_s = __commonJS(QIr => {
    Object.defineProperty(QIr, "__esModule", {
      value: true
    });
    var bhu = {
      keyword: "id",
      code() {
        throw Error('NOT SUPPORTED: keyword "id", use "$id" for schema ID');
      }
    };
    QIr.default = bhu;
  });
  var F_s = __commonJS(yHe => {
    Object.defineProperty(yHe, "__esModule", {
      value: true
    });
    yHe.callRef = yHe.getValidate = undefined;
    var Shu = EOt();
    var M_s = G7();
    var J4 = Sf();
    var itt = uye();
    var N_s = Rmn();
    var Omn = Ty();
    var Thu = {
      keyword: "$ref",
      schemaType: "string",
      code(e) {
        let {
          gen: t,
          schema: n,
          vGd: r
        } = e;
        let {
          baseId: o,
          schemaEnv: s,
          validateName: i,
          opts: a,
          self: l
        } = r;
        let {
          root: c
        } = s;
        if ((n === "#" || n === "#/") && o === c.baseId) {
          return d();
        }
        let u = N_s.resolveRef.call(l, c, o, n);
        if (u === undefined) {
          throw new Shu.default(r.opts.uriResolver, o, n);
        }
        if (u instanceof N_s.SchemaEnv) {
          return p(u);
        }
        return m(u);
        function d() {
          if (s === c) {
            return Dmn(e, i, s, s.$async);
          }
          let f = t.scopeValue("root", {
            ref: c
          });
          return Dmn(e, J4._`${f}.validate`, c, c.$async);
        }
        function p(f) {
          let h = L_s(e, f);
          Dmn(e, h, f, f.$async);
        }
        function m(f) {
          let h = t.scopeValue("schema", a.code.source === true ? {
            ref: f,
            code: (0, J4.stringify)(f)
          } : {
            ref: f
          });
          let g = t.name("valid");
          let y = e.subschema({
            schema: f,
            dataTypes: [],
            schemaPath: J4.nil,
            topSchemaRef: h,
            errSchemaPath: n
          }, g);
          e.mergeEvaluated(y);
          e.ok(g);
        }
      }
    };
    function L_s(e, t) {
      let {
        gen: n
      } = e;
      return t.validate ? n.scopeValue("validate", {
        ref: t.validate
      }) : J4._`${n.scopeValue("wrapper", {
        ref: t
      })}.validate`;
    }
    yHe.getValidate = L_s;
    function Dmn(e, t, n, r) {
      let {
        gen: o,
        vGd: s
      } = e;
      let {
        allErrors: i,
        schemaEnv: a,
        opts: l
      } = s;
      let c = l.passContext ? itt.default.this : J4.nil;
      if (r) {
        u();
      } else {
        d();
      }
      function u() {
        if (!a.$async) {
          throw Error("async schema referenced by sync schema");
        }
        let f = o.let("valid");
        o.try(() => {
          if (o.code(J4._`await ${(0, M_s.callValidateCode)(e, t, c)}`), m(t), !i) {
            o.assign(f, true);
          }
        }, h => {
          if (o.if(J4._`!(${h} instanceof ${s.ValidationError})`, () => o.throw(h)), p(h), !i) {
            o.assign(f, false);
          }
        });
        e.ok(f);
      }
      function d() {
        e.result((0, M_s.callValidateCode)(e, t, c), () => m(t), () => p(t));
      }
      function p(f) {
        let h = J4._`${f}.errors`;
        o.assign(itt.default.vErrors, J4._`${itt.default.vErrors} === null ? ${h} : ${itt.default.vErrors}.concat(${h})`);
        o.assign(itt.default.errors, J4._`${itt.default.vErrors}.length`);
      }
      function m(f) {
        var h;
        if (!s.opts.unevaluated) {
          return;
        }
        let g = (h = n === null || n === undefined ? undefined : n.validate) === null || h === undefined ? undefined : h.evaluated;
        if (s.props !== true) {
          if (g && !g.dynamicProps) {
            if (g.props !== undefined) {
              s.props = Omn.mergeEvaluated.props(o, g.props, s.props);
            }
          } else {
            let y = o.var("props", J4._`${f}.evaluated.props`);
            s.props = Omn.mergeEvaluated.props(o, y, s.props, J4.Name);
          }
        }
        if (s.items !== true) {
          if (g && !g.dynamicItems) {
            if (g.items !== undefined) {
              s.items = Omn.mergeEvaluated.items(o, g.items, s.items);
            }
          } else {
            let y = o.var("items", J4._`${f}.evaluated.items`);
            s.items = Omn.mergeEvaluated.items(o, y, s.items, J4.Name);
          }
        }
      }
    }
    yHe.callRef = Dmn;
    yHe.default = Thu;
  });
  var U_s = __commonJS(ZIr => {
    Object.defineProperty(ZIr, "__esModule", {
      value: true
    });
    var Ehu = D_s();
    var vhu = F_s();
    var whu = ["$schema", "$id", "$defs", "$vocabulary", {
      keyword: "$comment"
    }, "definitions", Ehu.default, vhu.default];
    ZIr.default = whu;
  });
  var B_s = __commonJS(ePr => {
    Object.defineProperty(ePr, "__esModule", {
      value: true
    });
    var Mmn = Sf();
    var Yxe = Mmn.operators;
    var Nmn = {
      maximum: {
        okStr: "<=",
        ok: Yxe.LTE,
        fail: Yxe.GT
      },
      minimum: {
        okStr: ">=",
        ok: Yxe.GTE,
        fail: Yxe.LT
      },
      exclusiveMaximum: {
        okStr: "<",
        ok: Yxe.LT,
        fail: Yxe.GTE
      },
      exclusiveMinimum: {
        okStr: ">",
        ok: Yxe.GT,
        fail: Yxe.LTE
      }
    };
    var Chu = {
      message: ({
        keyword: e,
        schemaCode: t
      }) => Mmn.str`must be ${Nmn[e].okStr} ${t}`,
      params: ({
        keyword: e,
        schemaCode: t
      }) => Mmn._`{comparison: ${Nmn[e].okStr}, limit: ${t}}`
    };
    var Rhu = {
      keyword: Object.keys(Nmn),
      type: "number",
      schemaType: "number",
      $data: true,
      error: Chu,
      code(e) {
        let {
          keyword: t,
          data: n,
          schemaCode: r
        } = e;
        e.fail$data(Mmn._`${n} ${Nmn[t].fail} ${r} || isNaN(${n})`);
      }
    };
    ePr.default = Rhu;
  });