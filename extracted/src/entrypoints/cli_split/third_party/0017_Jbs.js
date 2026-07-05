  var Jbs = __commonJS((FOt, Ybs) => {
    Object.defineProperty(FOt, "__esModule", {
      value: true
    });
    var ptt = Gbs();
    var Xyu = Vbs();
    var VPr = Sf();
    var zbs = new VPr.Name("fullFormats");
    var Qyu = new VPr.Name("fastFormats");
    var zPr = (e, t = {
      keywords: true
    }) => {
      if (Array.isArray(t)) {
        Kbs(e, t, ptt.fullFormats, zbs);
        return e;
      }
      let [n, r] = t.mode === "fast" ? [ptt.fastFormats, Qyu] : [ptt.fullFormats, zbs];
      let o = t.formats || ptt.formatNames;
      if (Kbs(e, o, n, r), t.keywords) {
        (0, Xyu.default)(e);
      }
      return e;
    };
    zPr.get = (e, t = "full") => {
      let r = (t === "fast" ? ptt.fastFormats : ptt.fullFormats)[e];
      if (!r) {
        throw Error(`Unknown format "${e}"`);
      }
      return r;
    };
    function Kbs(e, t, n, r) {
      var o;
      var s;
      (o = (s = e.opts.code).formats) !== null && o !== undefined || (s.formats = VPr._`require("ajv-formats/dist/formats").${r}`);
      for (let i of t) {
        e.addFormat(i, n[i]);
      }
    }
    Ybs.exports = FOt = zPr;
    Object.defineProperty(FOt, "__esModule", {
      value: true
    });
    FOt.default = zPr;
  });