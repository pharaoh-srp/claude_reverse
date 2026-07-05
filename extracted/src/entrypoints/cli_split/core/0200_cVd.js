  var $lt = __commonJS((pue, G9i) => {
    var {
      MAX_SAFE_COMPONENT_LENGTH: Seo,
      MAX_SAFE_BUILD_LENGTH: aVd,
      MAX_LENGTH: lVd
    } = aHt();
    var cVd = lHt();
    pue = G9i.exports = {};
    var uVd = pue.re = [];
    var dVd = pue.safeRe = [];
    var jl = pue.src = [];
    var pVd = pue.safeSrc = [];
    var ql = pue.t = {};
    var mVd = 0;
    var fVd = [["\\s", 1], ["\\d", lVd], ["[a-zA-Z0-9-]", aVd]];
    var hVd = e => {
      for (let [t, n] of fVd) {
        e = e.split(`${t}*`).join(`${t}{0,${n}}`).split(`${t}+`).join(`${t}{1,${n}}`);
      }
      return e;
    };
    var vm = (e, t, n) => {
      let r = hVd(t);
      let o = mVd++;
      cVd(e, o, t);
      ql[e] = o;
      jl[o] = t;
      pVd[o] = r;
      uVd[o] = new RegExp(t, n ? "g" : undefined);
      dVd[o] = new RegExp(r, n ? "g" : undefined);
    };
    vm("NUMERICIDENTIFIER", "0|[1-9]\\d*");
    vm("NUMERICIDENTIFIERLOOSE", "\\d+");
    vm("NONNUMERICIDENTIFIER", `\\d*[a-zA-Z-]${"[a-zA-Z0-9-]"}*`);
    vm("MAINVERSION", `(${jl[ql.NUMERICIDENTIFIER]})\\.(${jl[ql.NUMERICIDENTIFIER]})\\.(${jl[ql.NUMERICIDENTIFIER]})`);
    vm("MAINVERSIONLOOSE", `(${jl[ql.NUMERICIDENTIFIERLOOSE]})\\.(${jl[ql.NUMERICIDENTIFIERLOOSE]})\\.(${jl[ql.NUMERICIDENTIFIERLOOSE]})`);
    vm("PRERELEASEIDENTIFIER", `(?:${jl[ql.NONNUMERICIDENTIFIER]}|${jl[ql.NUMERICIDENTIFIER]})`);
    vm("PRERELEASEIDENTIFIERLOOSE", `(?:${jl[ql.NONNUMERICIDENTIFIER]}|${jl[ql.NUMERICIDENTIFIERLOOSE]})`);
    vm("PRERELEASE", `(?:-(${jl[ql.PRERELEASEIDENTIFIER]}(?:\\.${jl[ql.PRERELEASEIDENTIFIER]})*))`);
    vm("PRERELEASELOOSE", `(?:-?(${jl[ql.PRERELEASEIDENTIFIERLOOSE]}(?:\\.${jl[ql.PRERELEASEIDENTIFIERLOOSE]})*))`);
    vm("BUILDIDENTIFIER", `${"[a-zA-Z0-9-]"}+`);
    vm("BUILD", `(?:\\+(${jl[ql.BUILDIDENTIFIER]}(?:\\.${jl[ql.BUILDIDENTIFIER]})*))`);
    vm("FULLPLAIN", `v?${jl[ql.MAINVERSION]}${jl[ql.PRERELEASE]}?${jl[ql.BUILD]}?`);
    vm("FULL", `^${jl[ql.FULLPLAIN]}$`);
    vm("LOOSEPLAIN", `[v=\\s]*${jl[ql.MAINVERSIONLOOSE]}${jl[ql.PRERELEASELOOSE]}?${jl[ql.BUILD]}?`);
    vm("LOOSE", `^${jl[ql.LOOSEPLAIN]}$`);
    vm("GTLT", "((?:<|>)?=?)");
    vm("XRANGEIDENTIFIERLOOSE", `${jl[ql.NUMERICIDENTIFIERLOOSE]}|x|X|\\*`);
    vm("XRANGEIDENTIFIER", `${jl[ql.NUMERICIDENTIFIER]}|x|X|\\*`);
    vm("XRANGEPLAIN", `[v=\\s]*(${jl[ql.XRANGEIDENTIFIER]})(?:\\.(${jl[ql.XRANGEIDENTIFIER]})(?:\\.(${jl[ql.XRANGEIDENTIFIER]})(?:${jl[ql.PRERELEASE]})?${jl[ql.BUILD]}?)?)?`);
    vm("XRANGEPLAINLOOSE", `[v=\\s]*(${jl[ql.XRANGEIDENTIFIERLOOSE]})(?:\\.(${jl[ql.XRANGEIDENTIFIERLOOSE]})(?:\\.(${jl[ql.XRANGEIDENTIFIERLOOSE]})(?:${jl[ql.PRERELEASELOOSE]})?${jl[ql.BUILD]}?)?)?`);
    vm("XRANGE", `^${jl[ql.GTLT]}\\s*${jl[ql.XRANGEPLAIN]}$`);
    vm("XRANGELOOSE", `^${jl[ql.GTLT]}\\s*${jl[ql.XRANGEPLAINLOOSE]}$`);
    vm("COERCEPLAIN", `(^|[^\\d])(\\d{1,${Seo}})(?:\\.(\\d{1,${Seo}}))?(?:\\.(\\d{1,${Seo}}))?`);
    vm("COERCE", `${jl[ql.COERCEPLAIN]}(?:$|[^\\d])`);
    vm("COERCEFULL", jl[ql.COERCEPLAIN] + `(?:${jl[ql.PRERELEASE]})?(?:${jl[ql.BUILD]})?(?:$|[^\\d])`);
    vm("COERCERTL", jl[ql.COERCE], true);
    vm("COERCERTLFULL", jl[ql.COERCEFULL], true);
    vm("LONETILDE", "(?:~>?)");
    vm("TILDETRIM", `(\\s*)${jl[ql.LONETILDE]}\\s+`, true);
    pue.tildeTrimReplace = "$1~";
    vm("TILDE", `^${jl[ql.LONETILDE]}${jl[ql.XRANGEPLAIN]}$`);
    vm("TILDELOOSE", `^${jl[ql.LONETILDE]}${jl[ql.XRANGEPLAINLOOSE]}$`);
    vm("LONECARET", "(?:\\^)");
    vm("CARETTRIM", `(\\s*)${jl[ql.LONECARET]}\\s+`, true);
    pue.caretTrimReplace = "$1^";
    vm("CARET", `^${jl[ql.LONECARET]}${jl[ql.XRANGEPLAIN]}$`);
    vm("CARETLOOSE", `^${jl[ql.LONECARET]}${jl[ql.XRANGEPLAINLOOSE]}$`);
    vm("COMPARATORLOOSE", `^${jl[ql.GTLT]}\\s*(${jl[ql.LOOSEPLAIN]})$|^$`);
    vm("COMPARATOR", `^${jl[ql.GTLT]}\\s*(${jl[ql.FULLPLAIN]})$|^$`);
    vm("COMPARATORTRIM", `(\\s*)${jl[ql.GTLT]}\\s*(${jl[ql.LOOSEPLAIN]}|${jl[ql.XRANGEPLAIN]})`, true);
    pue.comparatorTrimReplace = "$1$2$3";
    vm("HYPHENRANGE", `^\\s*(${jl[ql.XRANGEPLAIN]})\\s+-\\s+(${jl[ql.XRANGEPLAIN]})\\s*$`);
    vm("HYPHENRANGELOOSE", `^\\s*(${jl[ql.XRANGEPLAINLOOSE]})\\s+-\\s+(${jl[ql.XRANGEPLAINLOOSE]})\\s*$`);
    vm("STAR", "(<|>)?=?\\s*\\*");
    vm("GTE0", "^\\s*>=\\s*0\\.0\\.0\\s*$");
    vm("GTE0PRE", "^\\s*>=\\s*0\\.0\\.0-0\\s*$");
  });