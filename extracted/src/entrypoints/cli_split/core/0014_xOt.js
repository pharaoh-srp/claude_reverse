  var $_s = __commonJS(tPr => {
    Object.defineProperty(tPr, "__esModule", {
      value: true
    });
    var xOt = Sf();
    var xhu = {
      message: ({
        schemaCode: e
      }) => xOt.str`must be multiple of ${e}`,
      params: ({
        schemaCode: e
      }) => xOt._`{multipleOf: ${e}}`
    };
    var khu = {
      keyword: "multipleOf",
      type: "number",
      schemaType: "number",
      $data: true,
      error: xhu,
      code(e) {
        let {
          gen: t,
          data: n,
          schemaCode: r,
          vGd: o
        } = e;
        let s = o.opts.multipleOfPrecision;
        let i = t.let("res");
        let a = s ? xOt._`Math.abs(Math.round(${i}) - ${i}) > 1e-${s}` : xOt._`${i} !== parseInt(${i})`;
        e.fail$data(xOt._`(${r} === 0 || (${i} = ${n}/${r}, ${a}))`);
      }
    };
    tPr.default = khu;
  });