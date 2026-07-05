  var GWi = __commonJS(vMn => {
    var w6d = Symbol.for("react.transitional.element");
    var C6d = Symbol.for("react.fragment");
    function WWi(e, t, n) {
      var r = null;
      if (n !== undefined && (r = "" + n), t.key !== undefined && (r = "" + t.key), "key" in t) {
        n = {};
        for (var o in t) {
          o !== "key" && (n[o] = t[o]);
        }
      } else {
        n = t;
      }
      t = n.ref;
      return {
        $$typeof: w6d,
        type: e,
        key: r,
        ref: t !== undefined ? t : null,
        props: n
      };
    }
    vMn.Fragment = C6d;
    vMn.jsx = WWi;
    vMn.jsxs = WWi;
  });
  var ie = __commonJS((Day, VWi) => {
    VWi.exports = GWi();
  });