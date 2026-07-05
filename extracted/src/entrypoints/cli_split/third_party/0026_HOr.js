  var HOr = __commonJS((myh, lEs) => {
    var Bku = UOr();
    var $ku = FOr();
    lEs.exports = Hku;
    function Hku(e) {
      if (!Object.keys(this.jobs).length) {
        return;
      }
      this.index = this.size;
      Bku(this);
      $ku(e)(null, this.results);
    }
  });
  var uEs = __commonJS((fyh, cEs) => {
    var jku = BOr();
    var qku = $Or();
    var Wku = HOr();
    cEs.exports = Gku;
    function Gku(e, t, n) {
      var r = qku(e);
      while (r.index < (r.keyedList || e).length) {
        jku(e, t, r, function (o, s) {
          if (o) {
            n(o, s);
            return;
          }
          if (Object.keys(r.jobs).length === 0) {
            n(null, r.results);
            return;
          }
        });
        r.index++;
      }
      return Wku.bind(r, n);
    }
  });
  var jOr = __commonJS((hyh, Jfn) => {
    var dEs = BOr();
    var Vku = $Or();
    var zku = HOr();
    Jfn.exports = Kku;
    Jfn.exports.ascending = pEs;
    Jfn.exports.descending = Yku;
    function Kku(e, t, n, r) {
      var o = Vku(e, n);
      dEs(e, t, o, function s(i, a) {
        if (i) {
          r(i, a);
          return;
        }
        if (o.index++, o.index < (o.keyedList || e).length) {
          dEs(e, t, o, s);
          return;
        }
        r(null, o.results);
      });
      return zku.bind(o, r);
    }
    function pEs(e, t) {
      return e < t ? -1 : e > t ? 1 : 0;
    }
    function Yku(e, t) {
      return -1 * pEs(e, t);
    }
  });
  var fEs = __commonJS((gyh, mEs) => {
    var Jku = jOr();
    mEs.exports = Xku;
    function Xku(e, t, n) {
      return Jku(e, t, null, n);
    }
  });
  var gEs = __commonJS((yyh, hEs) => {
    hEs.exports = {
      parallel: uEs(),
      serial: fEs(),
      serialOrdered: jOr()
    };
  });
  var qOr = __commonJS((_yh, yEs) => {
    yEs.exports = Object;
  });
  var bEs = __commonJS((byh, _Es) => {
    _Es.exports = Error;
  });
  var TEs = __commonJS((Syh, SEs) => {
    SEs.exports = EvalError;
  });
  var vEs = __commonJS((Tyh, EEs) => {
    EEs.exports = RangeError;
  });
  var CEs = __commonJS((Eyh, wEs) => {
    wEs.exports = ReferenceError;
  });
  var xEs = __commonJS((vyh, REs) => {
    REs.exports = SyntaxError;
  });
  var Xfn = __commonJS((wyh, kEs) => {
    kEs.exports = TypeError;
  });
  var IEs = __commonJS((Cyh, AEs) => {
    AEs.exports = URIError;
  });
  var OEs = __commonJS((Ryh, PEs) => {
    PEs.exports = Math.abs;
  });
  var MEs = __commonJS((xyh, DEs) => {
    DEs.exports = Math.floor;
  });
  var LEs = __commonJS((kyh, NEs) => {
    NEs.exports = Math.max;
  });
  var UEs = __commonJS((Ayh, FEs) => {
    FEs.exports = Math.min;
  });