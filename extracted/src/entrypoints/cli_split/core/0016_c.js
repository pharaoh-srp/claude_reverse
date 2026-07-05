    dtt.formatLimitDefinition = undefined;
    var Kyu = Vmn();
    var kte = Sf();
    var Jxe = kte.operators;
    var zmn = {
      formatMaximum: {
        okStr: "<=",
        ok: Jxe.LTE,
        fail: Jxe.GT
      },
      formatMinimum: {
        okStr: ">=",
        ok: Jxe.GTE,
        fail: Jxe.LT
      },
      formatExclusiveMaximum: {
        okStr: "<",
        ok: Jxe.LT,
        fail: Jxe.GTE
      },
      formatExclusiveMinimum: {
        okStr: ">",
        ok: Jxe.GT,
        fail: Jxe.LTE
      }
    };
    var Yyu = {
      message: ({
        keyword: e,
        schemaCode: t
      }) => kte.str`should be ${zmn[e].okStr} ${t}`,
      params: ({
        keyword: e,
        schemaCode: t
      }) => kte._`{comparison: ${zmn[e].okStr}, limit: ${t}}`
    };
    dtt.formatLimitDefinition = {
      keyword: Object.keys(zmn),
      type: "string",
      schemaType: "string",
      $data: true,
      error: Yyu,
      code(e) {
        let {
          gen: t,
          data: n,
          schemaCode: r,
          keyword: o,
          vGd: s
        } = e;
        let {
          opts: i,
          self: a
        } = s;
        if (!i.validateFormats) {
          return;
        }
        let l = new Kyu.KeywordCxt(s, a.RULES.all.format.definition, "format");
        if (l.$data) {
          c();
        } else {
          u();
        }
        function c() {
          let p = t.scopeValue("formats", {
            ref: a.formats,
            code: i.code.formats
          });
          let m = t.const("fmt", kte._`${p}[${l.schemaCode}]`);
          e.fail$data((0, kte.or)(kte._`typeof ${m} != "object"`, kte._`${m} instanceof RegExp`, kte._`typeof ${m}.compare != "function"`, d(m)));
        }
        function u() {
          let p = l.schema;
          let m = a.formats[p];
          if (!m || m === true) {
            return;
          }
          if (typeof m != "object" || m instanceof RegExp || typeof m.compare != "function") {
            throw Error(`"${o}": format "${p}" does not define "compare" function`);
          }
          let f = t.scopeValue("formats", {
            key: p,
            ref: m,
            code: i.code.formats ? kte._`${i.code.formats}${(0, kte.getProperty)(p)}` : undefined
          });
          e.fail$data(d(f));
        }
        function d(p) {
          return kte._`${p}.compare(${n}, ${r}) ${zmn[o].fail} 0`;
        }
      },
      dependencies: ["format"]
    };
    var Jyu = e => (e.addKeyword(dtt.formatLimitDefinition), e);
    dtt.default = Jyu;
  });