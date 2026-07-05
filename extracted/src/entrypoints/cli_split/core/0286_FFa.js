  var $Fa = __commonJS((k__, Sbo) => {
    var FFa = S6e();
    var {
      checkPath: UFa
    } = LFa();
    var BFa = e => {
      let t = {
        mode: 511
      };
      if (typeof e === "number") {
        return e;
      }
      return {
        ...t,
        ...e
      }.mode;
    };
    Sbo.exports.makeDir = async (e, t) => (UFa(e), FFa.mkdir(e, {
      mode: BFa(t),
      recursive: true
    }));
    Sbo.exports.makeDirSync = (e, t) => (UFa(e), FFa.mkdirSync(e, {
      mode: BFa(t),
      recursive: true
    }));
  });