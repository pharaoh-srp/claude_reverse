  var g1a = __commonJS((dy_, h1a) => {
    h1a.exports = lLp;
    function aLp(e) {
      let t = {
        defaultWidth: 0,
        output: process.stdout,
        tty: require("tty")
      };
      if (!e) {
        return t;
      }
      Object.keys(t).forEach(function (n) {
        if (!e[n]) {
          e[n] = t[n];
        }
      });
      return e;
    }
    function lLp(e) {
      let t = aLp(e);
      if (t.output.getWindowSize) {
        return t.output.getWindowSize()[0] || t.defaultWidth;
      }
      if (t.tty.getWindowSize) {
        return t.tty.getWindowSize()[1] || t.defaultWidth;
      }
      if (t.output.columns) {
        return t.output.columns;
      }
      if (process.env.CLI_WIDTH) {
        let n = parseInt(process.env.CLI_WIDTH, 10);
        if (!isNaN(n) && n !== 0) {
          return n;
        }
      }
      return t.defaultWidth;
    }
  });
  var _1a = __commonJS((py_, y1a) => {
    y1a.exports = ({
      onlyFirst: e = false
    } = {}) => {
      let t = ["[\\u001B\\u009B][[\\]()#;?]*(?:(?:(?:(?:;[-a-zA-Z\\d\\/#&.:=?%@~_]+)*|[a-zA-Z\\d]+(?:;[-a-zA-Z\\d\\/#&.:=?%@~_]*)*)?\\u0007)", "(?:(?:\\d{1,4}(?:;\\d{0,4})*)?[\\dA-PR-TZcf-ntqry=><~]))"].join("|");
      return new RegExp(t, e ? undefined : "g");
    };
  });
  var S1a = __commonJS((my_, b1a) => {
    var cLp = _1a();
    b1a.exports = e => typeof e === "string" ? e.replace(cLp(), "") : e;
  });
  var E1a = __commonJS((fy_, v_o) => {
    var T1a = e => {
      if (Number.isNaN(e)) {
        return false;
      }
      if (e >= 4352 && (e <= 4447 || e === 9001 || e === 9002 || 11904 <= e && e <= 12871 && e !== 12351 || 12880 <= e && e <= 19903 || 19968 <= e && e <= 42182 || 43360 <= e && e <= 43388 || 44032 <= e && e <= 55203 || 63744 <= e && e <= 64255 || 65040 <= e && e <= 65049 || 65072 <= e && e <= 65131 || 65281 <= e && e <= 65376 || 65504 <= e && e <= 65510 || 110592 <= e && e <= 110593 || 127488 <= e && e <= 127569 || 131072 <= e && e <= 262141)) {
        return true;
      }
      return false;
    };
    v_o.exports = T1a;
    v_o.exports.default = T1a;
  });
  var w1a = __commonJS((hy_, v1a) => {
    v1a.exports = function () {
      return /\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62(?:\uDB40\uDC65\uDB40\uDC6E\uDB40\uDC67|\uDB40\uDC73\uDB40\uDC63\uDB40\uDC74|\uDB40\uDC77\uDB40\uDC6C\uDB40\uDC73)\uDB40\uDC7F|\uD83D\uDC68(?:\uD83C\uDFFC\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68\uD83C\uDFFB|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C\uDFFF\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68(?:\uD83C[\uDFFB-\uDFFE])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C\uDFFE\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68(?:\uD83C[\uDFFB-\uDFFD])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C\uDFFD\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68(?:\uD83C[\uDFFB\uDFFC])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\u200D(?:\u2764\uFE0F\u200D(?:\uD83D\uDC8B\u200D)?\uD83D\uDC68|(?:\uD83D[\uDC68\uDC69])\u200D(?:\uD83D\uDC66\u200D\uD83D\uDC66|\uD83D\uDC67\u200D(?:\uD83D[\uDC66\uDC67]))|\uD83D\uDC66\u200D\uD83D\uDC66|\uD83D\uDC67\u200D(?:\uD83D[\uDC66\uDC67])|(?:\uD83D[\uDC68\uDC69])\u200D(?:\uD83D[\uDC66\uDC67])|[\u2695\u2696\u2708]\uFE0F|\uD83D[\uDC66\uDC67]|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|(?:\uD83C\uDFFB\u200D[\u2695\u2696\u2708]|\uD83C\uDFFF\u200D[\u2695\u2696\u2708]|\uD83C\uDFFE\u200D[\u2695\u2696\u2708]|\uD83C\uDFFD\u200D[\u2695\u2696\u2708]|\uD83C\uDFFC\u200D[\u2695\u2696\u2708])\uFE0F|\uD83C\uDFFB\u200D(?:\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C[\uDFFB-\uDFFF])|(?:\uD83E\uDDD1\uD83C\uDFFB\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1|\uD83D\uDC69\uD83C\uDFFC\u200D\uD83E\uDD1D\u200D\uD83D\uDC69)\uD83C\uDFFB|\uD83E\uDDD1(?:\uD83C\uDFFF\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1(?:\uD83C[\uDFFB-\uDFFF])|\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1)|(?:\uD83E\uDDD1\uD83C\uDFFE\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1|\uD83D\uDC69\uD83C\uDFFF\u200D\uD83E\uDD1D\u200D(?:\uD83D[\uDC68\uDC69]))(?:\uD83C[\uDFFB-\uDFFE])|(?:\uD83E\uDDD1\uD83C\uDFFC\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1|\uD83D\uDC69\uD83C\uDFFD\u200D\uD83E\uDD1D\u200D\uD83D\uDC69)(?:\uD83C[\uDFFB\uDFFC])|\uD83D\uDC69(?:\uD83C\uDFFE\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68(?:\uD83C[\uDFFB-\uDFFD\uDFFF])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C\uDFFC\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68(?:\uD83C[\uDFFB\uDFFD-\uDFFF])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C\uDFFB\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68(?:\uD83C[\uDFFC-\uDFFF])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C\uDFFD\u200D(?:\uD83E\uDD1D\u200D\uD83D\uDC68(?:\uD83C[\uDFFB\uDFFC\uDFFE\uDFFF])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\u200D(?:\u2764\uFE0F\u200D(?:\uD83D\uDC8B\u200D(?:\uD83D[\uDC68\uDC69])|\uD83D[\uDC68\uDC69])|\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD])|\uD83C\uDFFF\u200D(?:\uD83C[\uDF3E\uDF73\uDF93\uDFA4\uDFA8\uDFEB\uDFED]|\uD83D[\uDCBB\uDCBC\uDD27\uDD2C\uDE80\uDE92]|\uD83E[\uDDAF-\uDDB3\uDDBC\uDDBD]))|\uD83D\uDC69\u200D\uD83D\uDC69\u200D(?:\uD83D\uDC66\u200D\uD83D\uDC66|\uD83D\uDC67\u200D(?:\uD83D[\uDC66\uDC67]))|(?:\uD83E\uDDD1\uD83C\uDFFD\u200D\uD83E\uDD1D\u200D\uD83E\uDDD1|\uD83D\uDC69\uD83C\uDFFE\u200D\uD83E\uDD1D\u200D\uD83D\uDC69)(?:\uD83C[\uDFFB-\uDFFD])|\uD83D\uDC69\u200D\uD83D\uDC66\u200D\uD83D\uDC66|\uD83D\uDC69\u200D\uD83D\uDC69\u200D(?:\uD83D[\uDC66\uDC67])|(?:\uD83D\uDC41\uFE0F\u200D\uD83D\uDDE8|\uD83D\uDC69(?:\uD83C\uDFFF\u200D[\u2695\u2696\u2708]|\uD83C\uDFFE\u200D[\u2695\u2696\u2708]|\uD83C\uDFFC\u200D[\u2695\u2696\u2708]|\uD83C\uDFFB\u200D[\u2695\u2696\u2708]|\uD83C\uDFFD\u200D[\u2695\u2696\u2708]|\u200D[\u2695\u2696\u2708])|(?:(?:\u26F9|\uD83C[\uDFCB\uDFCC]|\uD83D\uDD75)\uFE0F|\uD83D\uDC6F|\uD83E[\uDD3C\uDDDE\uDDDF])\u200D[\u2640\u2642]|(?:\u26F9|\uD83C[\uDFCB\uDFCC]|\uD83D\uDD75)(?:\uD83C[\uDFFB-\uDFFF])\u200D[\u2640\u2642]|(?:\uD83C[\uDFC3\uDFC4\uDFCA]|\uD83D[\uDC6E\uDC71\uDC73\uDC77\uDC81\uDC82\uDC86\uDC87\uDE45-\uDE47\uDE4B\uDE4D\uDE4E\uDEA3\uDEB4-\uDEB6]|\uD83E[\uDD26\uDD37-\uDD39\uDD3D\uDD3E\uDDB8\uDDB9\uDDCD-\uDDCF\uDDD6-\uDDDD])(?:(?:\uD83C[\uDFFB-\uDFFF])\u200D[\u2640\u2642]|\u200D[\u2640\u2642])|\uD83C\uDFF4\u200D\u2620)\uFE0F|\uD83D\uDC69\u200D\uD83D\uDC67\u200D(?:\uD83D[\uDC66\uDC67])|\uD83C\uDFF3\uFE0F\u200D\uD83C\uDF08|\uD83D\uDC15\u200D\uD83E\uDDBA|\uD83D\uDC69\u200D\uD83D\uDC66|\uD83D\uDC69\u200D\uD83D\uDC67|\uD83C\uDDFD\uD83C\uDDF0|\uD83C\uDDF4\uD83C\uDDF2|\uD83C\uDDF6\uD83C\uDDE6|[#\*0-9]\uFE0F\u20E3|\uD83C\uDDE7(?:\uD83C[\uDDE6\uDDE7\uDDE9-\uDDEF\uDDF1-\uDDF4\uDDF6-\uDDF9\uDDFB\uDDFC\uDDFE\uDDFF])|\uD83C\uDDF9(?:\uD83C[\uDDE6\uDDE8\uDDE9\uDDEB-\uDDED\uDDEF-\uDDF4\uDDF7\uDDF9\uDDFB\uDDFC\uDDFF])|\uD83C\uDDEA(?:\uD83C[\uDDE6\uDDE8\uDDEA\uDDEC\uDDED\uDDF7-\uDDFA])|\uD83E\uDDD1(?:\uD83C[\uDFFB-\uDFFF])|\uD83C\uDDF7(?:\uD83C[\uDDEA\uDDF4\uDDF8\uDDFA\uDDFC])|\uD83D\uDC69(?:\uD83C[\uDFFB-\uDFFF])|\uD83C\uDDF2(?:\uD83C[\uDDE6\uDDE8-\uDDED\uDDF0-\uDDFF])|\uD83C\uDDE6(?:\uD83C[\uDDE8-\uDDEC\uDDEE\uDDF1\uDDF2\uDDF4\uDDF6-\uDDFA\uDDFC\uDDFD\uDDFF])|\uD83C\uDDF0(?:\uD83C[\uDDEA\uDDEC-\uDDEE\uDDF2\uDDF3\uDDF5\uDDF7\uDDFC\uDDFE\uDDFF])|\uD83C\uDDED(?:\uD83C[\uDDF0\uDDF2\uDDF3\uDDF7\uDDF9\uDDFA])|\uD83C\uDDE9(?:\uD83C[\uDDEA\uDDEC\uDDEF\uDDF0\uDDF2\uDDF4\uDDFF])|\uD83C\uDDFE(?:\uD83C[\uDDEA\uDDF9])|\uD83C\uDDEC(?:\uD83C[\uDDE6\uDDE7\uDDE9-\uDDEE\uDDF1-\uDDF3\uDDF5-\uDDFA\uDDFC\uDDFE])|\uD83C\uDDF8(?:\uD83C[\uDDE6-\uDDEA\uDDEC-\uDDF4\uDDF7-\uDDF9\uDDFB\uDDFD-\uDDFF])|\uD83C\uDDEB(?:\uD83C[\uDDEE-\uDDF0\uDDF2\uDDF4\uDDF7])|\uD83C\uDDF5(?:\uD83C[\uDDE6\uDDEA-\uDDED\uDDF0-\uDDF3\uDDF7-\uDDF9\uDDFC\uDDFE])|\uD83C\uDDFB(?:\uD83C[\uDDE6\uDDE8\uDDEA\uDDEC\uDDEE\uDDF3\uDDFA])|\uD83C\uDDF3(?:\uD83C[\uDDE6\uDDE8\uDDEA-\uDDEC\uDDEE\uDDF1\uDDF4\uDDF5\uDDF7\uDDFA\uDDFF])|\uD83C\uDDE8(?:\uD83C[\uDDE6\uDDE8\uDDE9\uDDEB-\uDDEE\uDDF0-\uDDF5\uDDF7\uDDFA-\uDDFF])|\uD83C\uDDF1(?:\uD83C[\uDDE6-\uDDE8\uDDEE\uDDF0\uDDF7-\uDDFB\uDDFE])|\uD83C\uDDFF(?:\uD83C[\uDDE6\uDDF2\uDDFC])|\uD83C\uDDFC(?:\uD83C[\uDDEB\uDDF8])|\uD83C\uDDFA(?:\uD83C[\uDDE6\uDDEC\uDDF2\uDDF3\uDDF8\uDDFE\uDDFF])|\uD83C\uDDEE(?:\uD83C[\uDDE8-\uDDEA\uDDF1-\uDDF4\uDDF6-\uDDF9])|\uD83C\uDDEF(?:\uD83C[\uDDEA\uDDF2\uDDF4\uDDF5])|(?:\uD83C[\uDFC3\uDFC4\uDFCA]|\uD83D[\uDC6E\uDC71\uDC73\uDC77\uDC81\uDC82\uDC86\uDC87\uDE45-\uDE47\uDE4B\uDE4D\uDE4E\uDEA3\uDEB4-\uDEB6]|\uD83E[\uDD26\uDD37-\uDD39\uDD3D\uDD3E\uDDB8\uDDB9\uDDCD-\uDDCF\uDDD6-\uDDDD])(?:\uD83C[\uDFFB-\uDFFF])|(?:\u26F9|\uD83C[\uDFCB\uDFCC]|\uD83D\uDD75)(?:\uD83C[\uDFFB-\uDFFF])|(?:[\u261D\u270A-\u270D]|\uD83C[\uDF85\uDFC2\uDFC7]|\uD83D[\uDC42\uDC43\uDC46-\uDC50\uDC66\uDC67\uDC6B-\uDC6D\uDC70\uDC72\uDC74-\uDC76\uDC78\uDC7C\uDC83\uDC85\uDCAA\uDD74\uDD7A\uDD90\uDD95\uDD96\uDE4C\uDE4F\uDEC0\uDECC]|\uD83E[\uDD0F\uDD18-\uDD1C\uDD1E\uDD1F\uDD30-\uDD36\uDDB5\uDDB6\uDDBB\uDDD2-\uDDD5])(?:\uD83C[\uDFFB-\uDFFF])|(?:[\u231A\u231B\u23E9-\u23EC\u23F0\u23F3\u25FD\u25FE\u2614\u2615\u2648-\u2653\u267F\u2693\u26A1\u26AA\u26AB\u26BD\u26BE\u26C4\u26C5\u26CE\u26D4\u26EA\u26F2\u26F3\u26F5\u26FA\u26FD\u2705\u270A\u270B\u2728\u274C\u274E\u2753-\u2755\u2757\u2795-\u2797\u27B0\u27BF\u2B1B\u2B1C\u2B50\u2B55]|\uD83C[\uDC04\uDCCF\uDD8E\uDD91-\uDD9A\uDDE6-\uDDFF\uDE01\uDE1A\uDE2F\uDE32-\uDE36\uDE38-\uDE3A\uDE50\uDE51\uDF00-\uDF20\uDF2D-\uDF35\uDF37-\uDF7C\uDF7E-\uDF93\uDFA0-\uDFCA\uDFCF-\uDFD3\uDFE0-\uDFF0\uDFF4\uDFF8-\uDFFF]|\uD83D[\uDC00-\uDC3E\uDC40\uDC42-\uDCFC\uDCFF-\uDD3D\uDD4B-\uDD4E\uDD50-\uDD67\uDD7A\uDD95\uDD96\uDDA4\uDDFB-\uDE4F\uDE80-\uDEC5\uDECC\uDED0-\uDED2\uDED5\uDEEB\uDEEC\uDEF4-\uDEFA\uDFE0-\uDFEB]|\uD83E[\uDD0D-\uDD3A\uDD3C-\uDD45\uDD47-\uDD71\uDD73-\uDD76\uDD7A-\uDDA2\uDDA5-\uDDAA\uDDAE-\uDDCA\uDDCD-\uDDFF\uDE70-\uDE73\uDE78-\uDE7A\uDE80-\uDE82\uDE90-\uDE95])|(?:[#\*0-9\xA9\xAE\u203C\u2049\u2122\u2139\u2194-\u2199\u21A9\u21AA\u231A\u231B\u2328\u23CF\u23E9-\u23F3\u23F8-\u23FA\u24C2\u25AA\u25AB\u25B6\u25C0\u25FB-\u25FE\u2600-\u2604\u260E\u2611\u2614\u2615\u2618\u261D\u2620\u2622\u2623\u2626\u262A\u262E\u262F\u2638-\u263A\u2640\u2642\u2648-\u2653\u265F\u2660\u2663\u2665\u2666\u2668\u267B\u267E\u267F\u2692-\u2697\u2699\u269B\u269C\u26A0\u26A1\u26AA\u26AB\u26B0\u26B1\u26BD\u26BE\u26C4\u26C5\u26C8\u26CE\u26CF\u26D1\u26D3\u26D4\u26E9\u26EA\u26F0-\u26F5\u26F7-\u26FA\u26FD\u2702\u2705\u2708-\u270D\u270F\u2712\u2714\u2716\u271D\u2721\u2728\u2733\u2734\u2744\u2747\u274C\u274E\u2753-\u2755\u2757\u2763\u2764\u2795-\u2797\u27A1\u27B0\u27BF\u2934\u2935\u2B05-\u2B07\u2B1B\u2B1C\u2B50\u2B55\u3030\u303D\u3297\u3299]|\uD83C[\uDC04\uDCCF\uDD70\uDD71\uDD7E\uDD7F\uDD8E\uDD91-\uDD9A\uDDE6-\uDDFF\uDE01\uDE02\uDE1A\uDE2F\uDE32-\uDE3A\uDE50\uDE51\uDF00-\uDF21\uDF24-\uDF93\uDF96\uDF97\uDF99-\uDF9B\uDF9E-\uDFF0\uDFF3-\uDFF5\uDFF7-\uDFFF]|\uD83D[\uDC00-\uDCFD\uDCFF-\uDD3D\uDD49-\uDD4E\uDD50-\uDD67\uDD6F\uDD70\uDD73-\uDD7A\uDD87\uDD8A-\uDD8D\uDD90\uDD95\uDD96\uDDA4\uDDA5\uDDA8\uDDB1\uDDB2\uDDBC\uDDC2-\uDDC4\uDDD1-\uDDD3\uDDDC-\uDDDE\uDDE1\uDDE3\uDDE8\uDDEF\uDDF3\uDDFA-\uDE4F\uDE80-\uDEC5\uDECB-\uDED2\uDED5\uDEE0-\uDEE5\uDEE9\uDEEB\uDEEC\uDEF0\uDEF3-\uDEFA\uDFE0-\uDFEB]|\uD83E[\uDD0D-\uDD3A\uDD3C-\uDD45\uDD47-\uDD71\uDD73-\uDD76\uDD7A-\uDDA2\uDDA5-\uDDAA\uDDAE-\uDDCA\uDDCD-\uDDFF\uDE70-\uDE73\uDE78-\uDE7A\uDE80-\uDE82\uDE90-\uDE95])\uFE0F|(?:[\u261D\u26F9\u270A-\u270D]|\uD83C[\uDF85\uDFC2-\uDFC4\uDFC7\uDFCA-\uDFCC]|\uD83D[\uDC42\uDC43\uDC46-\uDC50\uDC66-\uDC78\uDC7C\uDC81-\uDC83\uDC85-\uDC87\uDC8F\uDC91\uDCAA\uDD74\uDD75\uDD7A\uDD90\uDD95\uDD96\uDE45-\uDE47\uDE4B-\uDE4F\uDEA3\uDEB4-\uDEB6\uDEC0\uDECC]|\uD83E[\uDD0F\uDD18-\uDD1F\uDD26\uDD30-\uDD39\uDD3C-\uDD3E\uDDB5\uDDB6\uDDB8\uDDB9\uDDBB\uDDCD-\uDDCF\uDDD1-\uDDDD])/g;
    };
  });
  var R1a = __commonJS((gy_, w_o) => {
    var uLp = S1a();
    var dLp = E1a();
    var pLp = w1a();
    var C1a = e => {
      if (typeof e !== "string" || e.length === 0) {
        return 0;
      }
      if (e = uLp(e), e.length === 0) {
        return 0;
      }
      e = e.replace(pLp(), "  ");
      let t = 0;
      for (let n = 0; n < e.length; n++) {
        let r = e.codePointAt(n);
        if (r <= 31 || r >= 127 && r <= 159) {
          continue;
        }
        if (r >= 768 && r <= 879) {
          continue;
        }
        if (r > 65535) {
          n++;
        }
        t += dLp(r) ? 2 : 1;
      }
      return t;
    };
    w_o.exports = C1a;
    w_o.exports.default = C1a;
  });
  var k1a = __commonJS((yy_, x1a) => {
    x1a.exports = ({
      onlyFirst: e = false
    } = {}) => {
      let t = ["[\\u001B\\u009B][[\\]()#;?]*(?:(?:(?:(?:;[-a-zA-Z\\d\\/#&.:=?%@~_]+)*|[a-zA-Z\\d]+(?:;[-a-zA-Z\\d\\/#&.:=?%@~_]*)*)?\\u0007)", "(?:(?:\\d{1,4}(?:;\\d{0,4})*)?[\\dA-PR-TZcf-ntqry=><~]))"].join("|");
      return new RegExp(t, e ? undefined : "g");
    };
  });
  var C_o = __commonJS((_y_, A1a) => {
    var mLp = k1a();
    A1a.exports = e => typeof e === "string" ? e.replace(mLp(), "") : e;
  });
  var P1a = __commonJS((by_, I1a) => {
    I1a.exports = {
      aliceblue: [240, 248, 255],
      antiquewhite: [250, 235, 215],
      aqua: [0, 255, 255],
      aquamarine: [127, 255, 212],
      azure: [240, 255, 255],
      beige: [245, 245, 220],
      bisque: [255, 228, 196],
      black: [0, 0, 0],
      blanchedalmond: [255, 235, 205],
      blue: [0, 0, 255],
      blueviolet: [138, 43, 226],
      brown: [165, 42, 42],
      burlywood: [222, 184, 135],
      cadetblue: [95, 158, 160],
      chartreuse: [127, 255, 0],
      chocolate: [210, 105, 30],
      coral: [255, 127, 80],
      cornflowerblue: [100, 149, 237],
      cornsilk: [255, 248, 220],
      crimson: [220, 20, 60],
      cyan: [0, 255, 255],
      darkblue: [0, 0, 139],
      darkcyan: [0, 139, 139],
      darkgoldenrod: [184, 134, 11],
      darkgray: [169, 169, 169],
      darkgreen: [0, 100, 0],
      darkgrey: [169, 169, 169],
      darkkhaki: [189, 183, 107],
      darkmagenta: [139, 0, 139],
      darkolivegreen: [85, 107, 47],
      darkorange: [255, 140, 0],
      darkorchid: [153, 50, 204],
      darkred: [139, 0, 0],
      darksalmon: [233, 150, 122],
      darkseagreen: [143, 188, 143],
      darkslateblue: [72, 61, 139],
      darkslategray: [47, 79, 79],
      darkslategrey: [47, 79, 79],
      darkturquoise: [0, 206, 209],
      darkviolet: [148, 0, 211],
      deeppink: [255, 20, 147],
      deepskyblue: [0, 191, 255],
      dimgray: [105, 105, 105],
      dimgrey: [105, 105, 105],
      dodgerblue: [30, 144, 255],
      firebrick: [178, 34, 34],
      floralwhite: [255, 250, 240],
      forestgreen: [34, 139, 34],
      fuchsia: [255, 0, 255],
      gainsboro: [220, 220, 220],
      ghostwhite: [248, 248, 255],
      gold: [255, 215, 0],
      goldenrod: [218, 165, 32],
      gray: [128, 128, 128],
      green: [0, 128, 0],
      greenyellow: [173, 255, 47],
      grey: [128, 128, 128],
      honeydew: [240, 255, 240],
      hotpink: [255, 105, 180],
      indianred: [205, 92, 92],
      indigo: [75, 0, 130],
      ivory: [255, 255, 240],
      khaki: [240, 230, 140],
      lavender: [230, 230, 250],
      lavenderblush: [255, 240, 245],
      lawngreen: [124, 252, 0],
      lemonchiffon: [255, 250, 205],
      lightblue: [173, 216, 230],
      lightcoral: [240, 128, 128],
      lightcyan: [224, 255, 255],
      lightgoldenrodyellow: [250, 250, 210],
      lightgray: [211, 211, 211],
      lightgreen: [144, 238, 144],
      lightgrey: [211, 211, 211],
      lightpink: [255, 182, 193],
      lightsalmon: [255, 160, 122],
      lightseagreen: [32, 178, 170],
      lightskyblue: [135, 206, 250],
      lightslategray: [119, 136, 153],
      lightslategrey: [119, 136, 153],
      lightsteelblue: [176, 196, 222],
      lightyellow: [255, 255, 224],
      lime: [0, 255, 0],
      limegreen: [50, 205, 50],
      linen: [250, 240, 230],
      magenta: [255, 0, 255],
      maroon: [128, 0, 0],
      mediumaquamarine: [102, 205, 170],
      mediumblue: [0, 0, 205],
      mediumorchid: [186, 85, 211],
      mediumpurple: [147, 112, 219],
      mediumseagreen: [60, 179, 113],
      mediumslateblue: [123, 104, 238],
      mediumspringgreen: [0, 250, 154],
      mediumturquoise: [72, 209, 204],
      mediumvioletred: [199, 21, 133],
      midnightblue: [25, 25, 112],
      mintcream: [245, 255, 250],
      mistyrose: [255, 228, 225],
      moccasin: [255, 228, 181],
      navajowhite: [255, 222, 173],
      navy: [0, 0, 128],
      oldlace: [253, 245, 230],
      olive: [128, 128, 0],
      olivedrab: [107, 142, 35],
      orange: [255, 165, 0],
      orangered: [255, 69, 0],
      orchid: [218, 112, 214],
      palegoldenrod: [238, 232, 170],
      palegreen: [152, 251, 152],
      paleturquoise: [175, 238, 238],
      palevioletred: [219, 112, 147],
      papayawhip: [255, 239, 213],
      peachpuff: [255, 218, 185],
      peru: [205, 133, 63],
      pink: [255, 192, 203],
      plum: [221, 160, 221],
      powderblue: [176, 224, 230],
      purple: [128, 0, 128],
      rebeccapurple: [102, 51, 153],
      red: [255, 0, 0],
      rosybrown: [188, 143, 143],
      royalblue: [65, 105, 225],
      saddlebrown: [139, 69, 19],
      salmon: [250, 128, 114],
      sandybrown: [244, 164, 96],
      seagreen: [46, 139, 87],
      seashell: [255, 245, 238],
      sienna: [160, 82, 45],
      silver: [192, 192, 192],
      skyblue: [135, 206, 235],
      slateblue: [106, 90, 205],
      slategray: [112, 128, 144],
      slategrey: [112, 128, 144],
      snow: [255, 250, 250],
      springgreen: [0, 255, 127],
      steelblue: [70, 130, 180],
      tan: [210, 180, 140],
      teal: [0, 128, 128],
      thistle: [216, 191, 216],
      tomato: [255, 99, 71],
      turquoise: [64, 224, 208],
      violet: [238, 130, 238],
      wheat: [245, 222, 179],
      white: [255, 255, 255],
      whitesmoke: [245, 245, 245],
      yellow: [255, 255, 0],
      yellowgreen: [154, 205, 50]
    };
  });
  var R_o = __commonJS((Sy_, D1a) => {
    var _9t = P1a();
    var O1a = {};
    for (let e of Object.keys(_9t)) {
      O1a[_9t[e]] = e;
    }
    var Gc = {
      rgb: {
        channels: 3,
        labels: "rgb"
      },
      hsl: {
        channels: 3,
        labels: "hsl"
      },
      hsv: {
        channels: 3,
        labels: "hsv"
      },
      hwb: {
        channels: 3,
        labels: "hwb"
      },
      cmyk: {
        channels: 4,
        labels: "cmyk"
      },
      xyz: {
        channels: 3,
        labels: "xyz"
      },
      lab: {
        channels: 3,
        labels: "lab"
      },
      lch: {
        channels: 3,
        labels: "lch"
      },
      hex: {
        channels: 1,
        labels: ["hex"]
      },
      keyword: {
        channels: 1,
        labels: ["keyword"]
      },
      ansi16: {
        channels: 1,
        labels: ["ansi16"]
      },
      ansi256: {
        channels: 1,
        labels: ["ansi256"]
      },
      hcg: {
        channels: 3,
        labels: ["h", "c", "g"]
      },
      apple: {
        channels: 3,
        labels: ["r16", "g16", "b16"]
      },
      gray: {
        channels: 1,
        labels: ["gray"]
      }
    };
    D1a.exports = Gc;
    for (let e of Object.keys(Gc)) {
      if (!("channels" in Gc[e])) {
        throw Error("missing channels property: " + e);
      }
      if (!("labels" in Gc[e])) {
        throw Error("missing channel labels property: " + e);
      }
      if (Gc[e].labels.length !== Gc[e].channels) {
        throw Error("channel and label counts mismatch: " + e);
      }
      let {
        channels: t,
        labels: n
      } = Gc[e];
      delete Gc[e].channels;
      delete Gc[e].labels;
      Object.defineProperty(Gc[e], "channels", {
        value: t
      });
      Object.defineProperty(Gc[e], "labels", {
        value: n
      });
    }
    Gc.rgb.hsl = function (e) {
      let t = e[0] / 255;
      let n = e[1] / 255;
      let r = e[2] / 255;
      let o = Math.min(t, n, r);
      let s = Math.max(t, n, r);
      let i = s - o;
      let a;
      let l;
      if (s === o) {
        a = 0;
      } else if (t === s) {
        a = (n - r) / i;
      } else if (n === s) {
        a = 2 + (r - t) / i;
      } else if (r === s) {
        a = 4 + (t - n) / i;
      }
      if (a = Math.min(a * 60, 360), a < 0) {
        a += 360;
      }
      let c = (o + s) / 2;
      if (s === o) {
        l = 0;
      } else if (c <= 0.5) {
        l = i / (s + o);
      } else {
        l = i / (2 - s - o);
      }
      return [a, l * 100, c * 100];
    };
    Gc.rgb.hsv = function (e) {
      let t;
      let n;
      let r;
      let o;
      let s;
      let i = e[0] / 255;
      let a = e[1] / 255;
      let l = e[2] / 255;
      let c = Math.max(i, a, l);
      let u = c - Math.min(i, a, l);
      let d = function (p) {
        return (c - p) / 6 / u + 0.5;
      };
      if (u === 0) {
        o = 0;
        s = 0;
      } else {
        if (s = u / c, t = d(i), n = d(a), r = d(l), i === c) {
          o = r - n;
        } else if (a === c) {
          o = 0.3333333333333333 + t - r;
        } else if (l === c) {
          o = 0.6666666666666666 + n - t;
        }
        if (o < 0) {
          o += 1;
        } else if (o > 1) {
          o -= 1;
        }
      }
      return [o * 360, s * 100, c * 100];
    };
    Gc.rgb.hwb = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      let o = Gc.rgb.hsl(e)[0];
      let s = 0.00392156862745098 * Math.min(t, Math.min(n, r));
      r = 1 - 0.00392156862745098 * Math.max(t, Math.max(n, r));
      return [o, s * 100, r * 100];
    };
    Gc.rgb.cmyk = function (e) {
      let t = e[0] / 255;
      let n = e[1] / 255;
      let r = e[2] / 255;
      let o = Math.min(1 - t, 1 - n, 1 - r);
      let s = (1 - t - o) / (1 - o) || 0;
      let i = (1 - n - o) / (1 - o) || 0;
      let a = (1 - r - o) / (1 - o) || 0;
      return [s * 100, i * 100, a * 100, o * 100];
    };
    function fLp(e, t) {
      return (e[0] - t[0]) ** 2 + (e[1] - t[1]) ** 2 + (e[2] - t[2]) ** 2;
    }
    Gc.rgb.keyword = function (e) {
      let t = O1a[e];
      if (t) {
        return t;
      }
      let n = 1 / 0;
      let r;
      for (let o of Object.keys(_9t)) {
        let s = _9t[o];
        let i = fLp(e, s);
        if (i < n) {
          n = i;
          r = o;
        }
      }
      return r;
    };
    Gc.keyword.rgb = function (e) {
      return _9t[e];
    };
    Gc.rgb.xyz = function (e) {
      let t = e[0] / 255;
      let n = e[1] / 255;
      let r = e[2] / 255;
      t = t > 0.04045 ? ((t + 0.055) / 1.055) ** 2.4 : t / 12.92;
      n = n > 0.04045 ? ((n + 0.055) / 1.055) ** 2.4 : n / 12.92;
      r = r > 0.04045 ? ((r + 0.055) / 1.055) ** 2.4 : r / 12.92;
      let o = t * 0.4124 + n * 0.3576 + r * 0.1805;
      let s = t * 0.2126 + n * 0.7152 + r * 0.0722;
      let i = t * 0.0193 + n * 0.1192 + r * 0.9505;
      return [o * 100, s * 100, i * 100];
    };
    Gc.rgb.lab = function (e) {
      let t = Gc.rgb.xyz(e);
      let n = t[0];
      let r = t[1];
      let o = t[2];
      n /= 95.047;
      r /= 100;
      o /= 108.883;
      n = n > 0.008856 ? n ** 0.3333333333333333 : 7.787 * n + 0.13793103448275862;
      r = r > 0.008856 ? r ** 0.3333333333333333 : 7.787 * r + 0.13793103448275862;
      o = o > 0.008856 ? o ** 0.3333333333333333 : 7.787 * o + 0.13793103448275862;
      let s = 116 * r - 16;
      let i = 500 * (n - r);
      let a = 200 * (r - o);
      return [s, i, a];
    };
    Gc.hsl.rgb = function (e) {
      let t = e[0] / 360;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o;
      let s;
      let i;
      if (n === 0) {
        i = r * 255;
        return [i, i, i];
      }
      if (r < 0.5) {
        o = r * (1 + n);
      } else {
        o = r + n - r * n;
      }
      let a = 2 * r - o;
      let l = [0, 0, 0];
      for (let c = 0; c < 3; c++) {
        if (s = t + 0.3333333333333333 * -(c - 1), s < 0) {
          s++;
        }
        if (s > 1) {
          s--;
        }
        if (6 * s < 1) {
          i = a + (o - a) * 6 * s;
        } else if (2 * s < 1) {
          i = o;
        } else if (3 * s < 2) {
          i = a + (o - a) * (0.6666666666666666 - s) * 6;
        } else {
          i = a;
        }
        l[c] = i * 255;
      }
      return l;
    };
    Gc.hsl.hsv = function (e) {
      let t = e[0];
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = n;
      let s = Math.max(r, 0.01);
      r *= 2;
      n *= r <= 1 ? r : 2 - r;
      o *= s <= 1 ? s : 2 - s;
      let i = (r + n) / 2;
      let a = r === 0 ? 2 * o / (s + o) : 2 * n / (r + n);
      return [t, a * 100, i * 100];
    };
    Gc.hsv.rgb = function (e) {
      let t = e[0] / 60;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = Math.floor(t) % 6;
      let s = t - Math.floor(t);
      let i = 255 * r * (1 - n);
      let a = 255 * r * (1 - n * s);
      let l = 255 * r * (1 - n * (1 - s));
      switch (r *= 255, o) {
        case 0:
          return [r, l, i];
        case 1:
          return [a, r, i];
        case 2:
          return [i, r, l];
        case 3:
          return [i, a, r];
        case 4:
          return [l, i, r];
        case 5:
          return [r, i, a];
      }
    };
    Gc.hsv.hsl = function (e) {
      let t = e[0];
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = Math.max(r, 0.01);
      let s;
      let i;
      i = (2 - n) * r;
      let a = (2 - n) * o;
      s = n * o;
      s /= a <= 1 ? a : 2 - a;
      s = s || 0;
      i /= 2;
      return [t, s * 100, i * 100];
    };
    Gc.hwb.rgb = function (e) {
      let t = e[0] / 360;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = n + r;
      let s;
      if (o > 1) {
        n /= o;
        r /= o;
      }
      let i = Math.floor(6 * t);
      let a = 1 - r;
      if (s = 6 * t - i, (i & 1) !== 0) {
        s = 1 - s;
      }
      let l = n + s * (a - n);
      let c;
      let u;
      let d;
      switch (i) {
        default:
        case 6:
        case 0:
          c = a;
          u = l;
          d = n;
          break;
        case 1:
          c = l;
          u = a;
          d = n;
          break;
        case 2:
          c = n;
          u = a;
          d = l;
          break;
        case 3:
          c = n;
          u = l;
          d = a;
          break;
        case 4:
          c = l;
          u = n;
          d = a;
          break;
        case 5:
          c = a;
          u = n;
          d = l;
          break;
      }
      return [c * 255, u * 255, d * 255];
    };
    Gc.cmyk.rgb = function (e) {
      let t = e[0] / 100;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o = e[3] / 100;
      let s = 1 - Math.min(1, t * (1 - o) + o);
      let i = 1 - Math.min(1, n * (1 - o) + o);
      let a = 1 - Math.min(1, r * (1 - o) + o);
      return [s * 255, i * 255, a * 255];
    };
    Gc.xyz.rgb = function (e) {
      let t = e[0] / 100;
      let n = e[1] / 100;
      let r = e[2] / 100;
      let o;
      let s;
      let i;
      o = t * 3.2406 + n * -1.5372 + r * -0.4986;
      s = t * -0.9689 + n * 1.8758 + r * 0.0415;
      i = t * 0.0557 + n * -0.204 + r * 1.057;
      o = o > 0.0031308 ? 1.055 * o ** 0.4166666666666667 - 0.055 : o * 12.92;
      s = s > 0.0031308 ? 1.055 * s ** 0.4166666666666667 - 0.055 : s * 12.92;
      i = i > 0.0031308 ? 1.055 * i ** 0.4166666666666667 - 0.055 : i * 12.92;
      o = Math.min(Math.max(0, o), 1);
      s = Math.min(Math.max(0, s), 1);
      i = Math.min(Math.max(0, i), 1);
      return [o * 255, s * 255, i * 255];
    };
    Gc.xyz.lab = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      t /= 95.047;
      n /= 100;
      r /= 108.883;
      t = t > 0.008856 ? t ** 0.3333333333333333 : 7.787 * t + 0.13793103448275862;
      n = n > 0.008856 ? n ** 0.3333333333333333 : 7.787 * n + 0.13793103448275862;
      r = r > 0.008856 ? r ** 0.3333333333333333 : 7.787 * r + 0.13793103448275862;
      let o = 116 * n - 16;
      let s = 500 * (t - n);
      let i = 200 * (n - r);
      return [o, s, i];
    };
    Gc.lab.xyz = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      let o;
      let s;
      let i;
      s = (t + 16) / 116;
      o = n / 500 + s;
      i = s - r / 200;
      let a = s ** 3;
      let l = o ** 3;
      let c = i ** 3;
      s = a > 0.008856 ? a : (s - 0.13793103448275862) / 7.787;
      o = l > 0.008856 ? l : (o - 0.13793103448275862) / 7.787;
      i = c > 0.008856 ? c : (i - 0.13793103448275862) / 7.787;
      o *= 95.047;
      s *= 100;
      i *= 108.883;
      return [o, s, i];
    };
    Gc.lab.lch = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      let o;
      if (o = Math.atan2(r, n) * 360 / 2 / Math.PI, o < 0) {
        o += 360;
      }
      let i = Math.sqrt(n * n + r * r);
      return [t, i, o];
    };
    Gc.lch.lab = function (e) {
      let t = e[0];
      let n = e[1];
      let o = e[2] / 360 * 2 * Math.PI;
      let s = n * Math.cos(o);
      let i = n * Math.sin(o);
      return [t, s, i];
    };
    Gc.rgb.ansi16 = function (e, t = null) {
      let [n, r, o] = e;
      let s = t === null ? Gc.rgb.hsv(e)[2] : t;
      if (s = Math.round(s / 50), s === 0) {
        return 30;
      }
      let i = 30 + (Math.round(o / 255) << 2 | Math.round(r / 255) << 1 | Math.round(n / 255));
      if (s === 2) {
        i += 60;
      }
      return i;
    };
    Gc.hsv.ansi16 = function (e) {
      return Gc.rgb.ansi16(Gc.hsv.rgb(e), e[2]);
    };
    Gc.rgb.ansi256 = function (e) {
      let t = e[0];
      let n = e[1];
      let r = e[2];
      if (t === n && n === r) {
        if (t < 8) {
          return 16;
        }
        if (t > 248) {
          return 231;
        }
        return Math.round((t - 8) / 247 * 24) + 232;
      }
      return 16 + 36 * Math.round(t / 255 * 5) + 6 * Math.round(n / 255 * 5) + Math.round(r / 255 * 5);
    };
    Gc.ansi16.rgb = function (e) {
      let t = e % 10;
      if (t === 0 || t === 7) {
        if (e > 50) {
          t += 3.5;
        }
        t = t / 10.5 * 255;
        return [t, t, t];
      }
      let n = (~~(e > 50) + 1) * 0.5;
      let r = (t & 1) * n * 255;
      let o = (t >> 1 & 1) * n * 255;
      let s = (t >> 2 & 1) * n * 255;
      return [r, o, s];
    };
    Gc.ansi256.rgb = function (e) {
      if (e >= 232) {
        let s = (e - 232) * 10 + 8;
        return [s, s, s];
      }
      e -= 16;
      let t;
      let n = Math.floor(e / 36) / 5 * 255;
      let r = Math.floor((t = e % 36) / 6) / 5 * 255;
      let o = t % 6 / 5 * 255;
      return [n, r, o];
    };
    Gc.rgb.hex = function (e) {
      let n = (((Math.round(e[0]) & 255) << 16) + ((Math.round(e[1]) & 255) << 8) + (Math.round(e[2]) & 255)).toString(16).toUpperCase();
      return "000000".substring(n.length) + n;
    };
    Gc.hex.rgb = function (e) {
      let t = e.toString(16).match(/[a-f0-9]{6}|[a-f0-9]{3}/i);
      if (!t) {
        return [0, 0, 0];
      }
      let n = t[0];
      if (t[0].length === 3) {
        n = n.split("").map(a => a + a).join("");
      }
      let r = parseInt(n, 16);
      let o = r >> 16 & 255;
      let s = r >> 8 & 255;
      let i = r & 255;
      return [o, s, i];
    };
    Gc.rgb.hcg = function (e) {
      let t = e[0] / 255;
      let n = e[1] / 255;
      let r = e[2] / 255;
      let o = Math.max(Math.max(t, n), r);
      let s = Math.min(Math.min(t, n), r);
      let i = o - s;
      let a;
      let l;
      if (i < 1) {
        a = s / (1 - i);
      } else {
        a = 0;
      }
      if (i <= 0) {
        l = 0;
      } else if (o === t) {
        l = (n - r) / i % 6;
      } else if (o === n) {
        l = 2 + (r - t) / i;
      } else {
        l = 4 + (t - n) / i;
      }
      l /= 6;
      l %= 1;
      return [l * 360, i * 100, a * 100];
    };
    Gc.hsl.hcg = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = n < 0.5 ? 2 * t * n : 2 * t * (1 - n);
      let o = 0;
      if (r < 1) {
        o = (n - 0.5 * r) / (1 - r);
      }
      return [e[0], r * 100, o * 100];
    };
    Gc.hsv.hcg = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = t * n;
      let o = 0;
      if (r < 1) {
        o = (n - r) / (1 - r);
      }
      return [e[0], r * 100, o * 100];
    };
    Gc.hcg.rgb = function (e) {
      let t = e[0] / 360;
      let n = e[1] / 100;
      let r = e[2] / 100;
      if (n === 0) {
        return [r * 255, r * 255, r * 255];
      }
      let o = [0, 0, 0];
      let s = t % 1 * 6;
      let i = s % 1;
      let a = 1 - i;
      let l = 0;
      switch (Math.floor(s)) {
        case 0:
          o[0] = 1;
          o[1] = i;
          o[2] = 0;
          break;
        case 1:
          o[0] = a;
          o[1] = 1;
          o[2] = 0;
          break;
        case 2:
          o[0] = 0;
          o[1] = 1;
          o[2] = i;
          break;
        case 3:
          o[0] = 0;
          o[1] = a;
          o[2] = 1;
          break;
        case 4:
          o[0] = i;
          o[1] = 0;
          o[2] = 1;
          break;
        default:
          o[0] = 1;
          o[1] = 0;
          o[2] = a;
      }
      l = (1 - n) * r;
      return [(n * o[0] + l) * 255, (n * o[1] + l) * 255, (n * o[2] + l) * 255];
    };
    Gc.hcg.hsv = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = t + n * (1 - t);
      let o = 0;
      if (r > 0) {
        o = t / r;
      }
      return [e[0], o * 100, r * 100];
    };
    Gc.hcg.hsl = function (e) {
      let t = e[1] / 100;
      let r = e[2] / 100 * (1 - t) + 0.5 * t;
      let o = 0;
      if (r > 0 && r < 0.5) {
        o = t / (2 * r);
      } else if (r >= 0.5 && r < 1) {
        o = t / (2 * (1 - r));
      }
      return [e[0], o * 100, r * 100];
    };
    Gc.hcg.hwb = function (e) {
      let t = e[1] / 100;
      let n = e[2] / 100;
      let r = t + n * (1 - t);
      return [e[0], (r - t) * 100, (1 - r) * 100];
    };
    Gc.hwb.hcg = function (e) {
      let t = e[1] / 100;
      let r = 1 - e[2] / 100;
      let o = r - t;
      let s = 0;
      if (o < 1) {
        s = (r - o) / (1 - o);
      }
      return [e[0], o * 100, s * 100];
    };
    Gc.apple.rgb = function (e) {
      return [e[0] / 65535 * 255, e[1] / 65535 * 255, e[2] / 65535 * 255];
    };
    Gc.rgb.apple = function (e) {
      return [e[0] / 255 * 65535, e[1] / 255 * 65535, e[2] / 255 * 65535];
    };
    Gc.gray.rgb = function (e) {
      return [e[0] / 100 * 255, e[0] / 100 * 255, e[0] / 100 * 255];
    };
    Gc.gray.hsl = function (e) {
      return [0, 0, e[0]];
    };
    Gc.gray.hsv = Gc.gray.hsl;
    Gc.gray.hwb = function (e) {
      return [0, 100, e[0]];
    };
    Gc.gray.cmyk = function (e) {
      return [0, 0, 0, e[0]];
    };
    Gc.gray.lab = function (e) {
      return [e[0], 0, 0];
    };
    Gc.gray.hex = function (e) {
      let t = Math.round(e[0] / 100 * 255) & 255;
      let r = ((t << 16) + (t << 8) + t).toString(16).toUpperCase();
      return "000000".substring(r.length) + r;
    };
    Gc.rgb.gray = function (e) {
      return [(e[0] + e[1] + e[2]) / 3 / 255 * 100];
    };
  });
  var N1a = __commonJS((Ty_, M1a) => {
    var S4n = R_o();
    function hLp() {
      let e = {};
      let t = Object.keys(S4n);
      for (let n = t.length, r = 0; r < n; r++) {
        e[t[r]] = {
          distance: -1,
          parent: null
        };
      }
      return e;
    }
    function gLp(e) {
      let t = hLp();
      let n = [e];
      t[e].distance = 0;
      while (n.length) {
        let r = n.pop();
        let o = Object.keys(S4n[r]);
        for (let s = o.length, i = 0; i < s; i++) {
          let a = o[i];
          let l = t[a];
          if (l.distance === -1) {
            l.distance = t[r].distance + 1;
            l.parent = r;
            n.unshift(a);
          }
        }
      }
      return t;
    }
    function yLp(e, t) {
      return function (n) {
        return t(e(n));
      };
    }
    function _Lp(e, t) {
      let n = [t[e].parent, e];
      let r = S4n[t[e].parent][e];
      let o = t[e].parent;
      while (t[o].parent) {
        n.unshift(t[o].parent);
        r = yLp(S4n[t[o].parent][o], r);
        o = t[o].parent;
      }
      r.conversion = n;
      return r;
    }
    M1a.exports = function (e) {
      let t = gLp(e);
      let n = {};
      let r = Object.keys(t);
      for (let o = r.length, s = 0; s < o; s++) {
        let i = r[s];
        if (t[i].parent === null) {
          continue;
        }
        n[i] = _Lp(i, t);
      }
      return n;
    };
  });
  var F1a = __commonJS((Ey_, L1a) => {
    var x_o = R_o();
    var bLp = N1a();
    var cft = {};
    var SLp = Object.keys(x_o);
    function TLp(e) {
      let t = function (...n) {
        let r = n[0];
        if (r === undefined || r === null) {
          return r;
        }
        if (r.length > 1) {
          n = r;
        }
        return e(n);
      };
      if ("conversion" in e) {
        t.conversion = e.conversion;
      }
      return t;
    }
    function ELp(e) {
      let t = function (...n) {
        let r = n[0];
        if (r === undefined || r === null) {
          return r;
        }
        if (r.length > 1) {
          n = r;
        }
        let o = e(n);
        if (typeof o === "object") {
          for (let s = o.length, i = 0; i < s; i++) {
            o[i] = Math.round(o[i]);
          }
        }
        return o;
      };
      if ("conversion" in e) {
        t.conversion = e.conversion;
      }
      return t;
    }
    SLp.forEach(e => {
      cft[e] = {};
      Object.defineProperty(cft[e], "channels", {
        value: x_o[e].channels
      });
      Object.defineProperty(cft[e], "labels", {
        value: x_o[e].labels
      });
      let t = bLp(e);
      Object.keys(t).forEach(r => {
        let o = t[r];
        cft[e][r] = ELp(o);
        cft[e][r].raw = TLp(o);
      });
    });
    L1a.exports = cft;
  });
  var q1a = __commonJS((vy_, j1a) => {
    var U1a = (e, t) => (...n) => `\x1B[${e(...n) + t}m`;
    var B1a = (e, t) => (...n) => {
      let r = e(...n);
      return `\x1B[${38 + t};5;${r}m`;
    };
    var $1a = (e, t) => (...n) => {
      let r = e(...n);
      return `\x1B[${38 + t};2;${r[0]};${r[1]};${r[2]}m`;
    };
    var T4n = e => e;
    var H1a = (e, t, n) => [e, t, n];
    var uft = (e, t, n) => {
      Object.defineProperty(e, t, {
        get: () => {
          let r = n();
          Object.defineProperty(e, t, {
            value: r,
            enumerable: true,
            configurable: true
          });
          return r;
        },
        enumerable: true,
        configurable: true
      });
    };
    var k_o;
    var dft = (e, t, n, r) => {
      if (k_o === undefined) {
        k_o = F1a();
      }
      let o = r ? 10 : 0;
      let s = {};
      for (let [i, a] of Object.entries(k_o)) {
        let l = i === "ansi16" ? "ansi" : i;
        if (i === t) {
          s[l] = e(n, o);
        } else if (typeof a === "object") {
          s[l] = e(a[t], o);
        }
      }
      return s;
    };
    function vLp() {
      let e = new Map();
      let t = {
        modifier: {
          reset: [0, 0],
          bold: [1, 22],
          dim: [2, 22],
          italic: [3, 23],
          underline: [4, 24],
          inverse: [7, 27],
          hidden: [8, 28],
          strikethrough: [9, 29]
        },
        color: {
          black: [30, 39],
          red: [31, 39],
          green: [32, 39],
          yellow: [33, 39],
          blue: [34, 39],
          magenta: [35, 39],
          cyan: [36, 39],
          white: [37, 39],
          blackBright: [90, 39],
          redBright: [91, 39],
          greenBright: [92, 39],
          yellowBright: [93, 39],
          blueBright: [94, 39],
          magentaBright: [95, 39],
          cyanBright: [96, 39],
          whiteBright: [97, 39]
        },
        bgColor: {
          bgBlack: [40, 49],
          bgRed: [41, 49],
          bgGreen: [42, 49],
          bgYellow: [43, 49],
          bgBlue: [44, 49],
          bgMagenta: [45, 49],
          bgCyan: [46, 49],
          bgWhite: [47, 49],
          bgBlackBright: [100, 49],
          bgRedBright: [101, 49],
          bgGreenBright: [102, 49],
          bgYellowBright: [103, 49],
          bgBlueBright: [104, 49],
          bgMagentaBright: [105, 49],
          bgCyanBright: [106, 49],
          bgWhiteBright: [107, 49]
        }
      };
      t.color.gray = t.color.blackBright;
      t.bgColor.bgGray = t.bgColor.bgBlackBright;
      t.color.grey = t.color.blackBright;
      t.bgColor.bgGrey = t.bgColor.bgBlackBright;
      for (let [n, r] of Object.entries(t)) {
        for (let [o, s] of Object.entries(r)) {
          t[o] = {
            open: `\x1B[${s[0]}m`,
            close: `\x1B[${s[1]}m`
          };
          r[o] = t[o];
          e.set(s[0], s[1]);
        }
        Object.defineProperty(t, n, {
          value: r,
          enumerable: false
        });
      }
      Object.defineProperty(t, "codes", {
        value: e,
        enumerable: false
      });
      t.color.close = "\x1B[39m";
      t.bgColor.close = "\x1B[49m";
      uft(t.color, "ansi", () => dft(U1a, "ansi16", T4n, false));
      uft(t.color, "ansi256", () => dft(B1a, "ansi256", T4n, false));
      uft(t.color, "ansi16m", () => dft($1a, "rgb", H1a, false));
      uft(t.bgColor, "ansi", () => dft(U1a, "ansi16", T4n, true));
      uft(t.bgColor, "ansi256", () => dft(B1a, "ansi256", T4n, true));
      uft(t.bgColor, "ansi16m", () => dft($1a, "rgb", H1a, true));
      return t;
    }
    Object.defineProperty(j1a, "exports", {
      enumerable: true,
      get: vLp
    });
  });
  var V1a = __commonJS((wy_, G1a) => {
    var b9t = R1a();
    var wLp = C_o();
    var CLp = q1a();
    var I_o = new Set(["\x1B", "\x9B"]);
    var W1a = e => `${I_o.values().next().value}[${e}m`;
    var RLp = e => e.split(" ").map(t => b9t(t));
    var A_o = (e, t, n) => {
      let r = [...t];
      let o = false;
      let s = b9t(wLp(e[e.length - 1]));
      for (let [i, a] of r.entries()) {
        let l = b9t(a);
        if (s + l <= n) {
          e[e.length - 1] += a;
        } else {
          e.push(a);
          s = 0;
        }
        if (I_o.vZc(a)) {
          o = true;
        } else if (o && a === "m") {
          o = false;
          continue;
        }
        if (o) {
          continue;
        }
        if (s += l, s === n && i < r.length - 1) {
          e.push("");
          s = 0;
        }
      }
      if (!s && e[e.length - 1].length > 0 && e.length > 1) {
        e[e.length - 2] += e.pop();
      }
    };
    var xLp = e => {
      let t = e.split(" ");
      let n = t.length;
      while (n > 0) {
        if (b9t(t[n - 1]) > 0) {
          break;
        }
        n--;
      }
      if (n === t.length) {
        return e;
      }
      return t.slice(0, n).join(" ") + t.slice(n).join("");
    };
    var kLp = (e, t, n = {}) => {
      if (n.trim !== false && e.trim() === "") {
        return "";
      }
      let r = "";
      let o = "";
      let s;
      let i = RLp(e);
      let a = [""];
      for (let [l, c] of e.split(" ").entries()) {
        if (n.trim !== false) {
          a[a.length - 1] = a[a.length - 1].trimLeft();
        }
        let u = b9t(a[a.length - 1]);
        if (l !== 0) {
          if (u >= t && (n.wordWrap === false || n.trim === false)) {
            a.push("");
            u = 0;
          }
          if (u > 0 || n.trim === false) {
            a[a.length - 1] += " ";
            u++;
          }
        }
        if (n.hard && i[l] > t) {
          let d = t - u;
          let p = 1 + Math.floor((i[l] - d - 1) / t);
          if (Math.floor((i[l] - 1) / t) < p) {
            a.push("");
          }
          A_o(a, c, t);
          continue;
        }
        if (u + i[l] > t && u > 0 && i[l] > 0) {
          if (n.wordWrap === false && u < t) {
            A_o(a, c, t);
            continue;
          }
          a.push("");
        }
        if (u + i[l] > t && n.wordWrap === false) {
          A_o(a, c, t);
          continue;
        }
        a[a.length - 1] += c;
      }
      if (n.trim !== false) {
        a = a.map(xLp);
      }
      r = a.join(`
`);
      for (let [l, c] of [...r].entries()) {
        if (o += c, I_o.vZc(c)) {
          let d = parseFloat(/\d[^m]*/.exec(r.slice(l, l + 4)));
          s = d === 39 ? null : d;
        }
        let u = CLp.codes.get(Number(s));
        if (s && u) {
          if (r[l + 1] === `
`) {
            o += W1a(u);
          } else if (c === `
`) {
            o += W1a(s);
          }
        }
      }
      return o;
    };
    G1a.exports = (e, t, n) => String(e).normalize().replace(/\r\n/g, `
`).split(`
`).map(r => kLp(r, t, n)).join(`
`);
  });