      let r = [e.C_LINE_COMMENT_MODE, n];
      let o = {
        match: [/\./, zq(...jxp, ...bRa)],
        className: {
          2: "keyword"
        }
      };
      let s = {
        match: lE(/\./, zq(...ufo)),
        relevance: 0
      };
      let i = ufo.filter(me => typeof me === "string").concat(["_|0"]);
      let a = ufo.filter(me => typeof me !== "string").concat(qxp).map(pfo);
      let l = {
        variants: [{
          className: "keyword",
          match: zq(...a, ...bRa)
        }]
      };
      let c = {
        $pattern: zq(/\b\w+/, /#\w+/),
        keyword: i.concat(Gxp),
        literal: SRa
      };
      let u = [o, s, l];
      let d = {
        match: lE(/\./, zq(...TRa)),
        relevance: 0
      };
      let p = {
        className: "built_in",
        match: lE(/\b/, zq(...TRa), /(?=\()/)
      };
      let m = [d, p];
      let f = {
        match: /->/,
        relevance: 0
      };
      let h = {
        className: "operator",
        relevance: 0,
        variants: [{
          match: dfo
        }, {
          match: `\\.(\\.|${wRa})+`
        }]
      };
      let g = [f, h];
      let y = "([0-9]_*)+";
      let _ = "([0-9a-fA-F]_*)+";
      let b = {
        className: "number",
        relevance: 0,
        variants: [{
          match: "\\b(([0-9]_*)+)(\\.(([0-9]_*)+))?([eE][+-]?(([0-9]_*)+))?\\b"
        }, {
          match: "\\b0x(([0-9a-fA-F]_*)+)(\\.(([0-9a-fA-F]_*)+))?([pP][+-]?(([0-9]_*)+))?\\b"
        }, {
          match: /\b0o([0-7]_*)+\b/
        }, {
          match: /\b0b([01]_*)+\b/
        }]
      };
      let S = (me = "") => ({
        className: "subst",
        variants: [{
          match: lE(/\\/, me, /[0\\tnr"']/)
        }, {
          match: lE(/\\/, me, /u\{[0-9a-fA-F]{1,8}\}/)
        }]
      });
      let E = (me = "") => ({
        className: "subst",
        match: lE(/\\/, me, /[\t ]*(?:[\r\n]|\r\n)/)
      });
      let C = (me = "") => ({
        className: "subst",
        label: "interpol",
        begin: lE(/\\/, me, /\(/),
        end: /\)/
      });
      let x = (me = "") => ({
        begin: lE(me, /"""/),
        end: lE(/"""/, me),
        contains: [S(me), E(me), C(me)]
      });
      let A = (me = "") => ({
        begin: lE(me, /"/),
        end: lE(/"/, me),
        contains: [S(me), C(me)]
      });
      let k = {
        className: "string",
        variants: [x(), x("#"), x("##"), x("###"), A(), A("#"), A("##"), A("###")]
      };
      let I = [e.BACKSLASH_ESCAPE, {
        begin: /\[/,
        end: /\]/,
        relevance: 0,
        contains: [e.BACKSLASH_ESCAPE]
      }];
      let O = {
        begin: /\/[^\s](?=[^/\n]*\/)/,
        end: /\//,
        contains: I
      };
      let M = me => {
        let Te = lE(me, /\//);
        let ue = lE(/\//, me);
        return {
          begin: Te,
          end: ue,
          contains: [...I, {
            scope: "comment",
            begin: `#(?!.*${ue})`,
            end: /$/
          }]
        };
      };
      let L = {
        scope: "regexp",
        variants: [M("###"), M("##"), M("#"), O]
      };
      let P = {
        match: lE(/`/, Bde, /`/)
      };
      let F = {
        className: "variable",
        match: /\$\d+/
      };
      let H = {
        className: "variable",
        match: `\\$${mjn}+`
      };
      let U = [P, F, H];
      let N = {
        match: /(@|#(un)?)available/,
        scope: "keyword",
        starts: {
          contains: [{
            begin: /\(/,
            end: /\)/,
            keywords: zxp,
            contains: [...g, b, k]
          }]
        }
      };
      let W = {
        scope: "keyword",
        match: lE(/@/, zq(...Vxp), bWt(zq(/\(/, /\s+/)))
      };
      let j = {
        scope: "meta",
        match: lE(/@/, Bde)
      };
      let z = [N, W, j];
      let V = {
        match: bWt(/\b[A-Z]/),
        relevance: 0,
        contains: [{
          className: "type",
          match: lE(/(AV|CA|CF|CG|CI|CL|CM|CN|CT|MK|MP|MTK|MTL|NS|SCN|SK|UI|WK|XC)/, mjn, "+")
        }, {
          className: "type",
          match: pjn,
          relevance: 0
        }, {
          match: /[?!]+/,
          relevance: 0
        }, {
          match: /\.\.\./,
          relevance: 0
        }, {
          match: lE(/\s+&\s+/, bWt(pjn)),
          relevance: 0
        }]
      };
      let K = {
        begin: /</,
        end: />/,
        keywords: c,
        contains: [...r, ...u, ...z, f, V]
      };
      V.contains.push(K);
      let J = {
        match: lE(Bde, /\s*:/),
        keywords: "_|0",
        relevance: 0
      };
      let Q = {
        begin: /\(/,
        end: /\)/,
        relevance: 0,
        keywords: c,
        contains: ["self", J, ...r, L, ...u, ...m, ...g, b, k, ...U, ...z, V]
      };
      let Z = {
        begin: /</,
        end: />/,
        keywords: "repeat each",
        contains: [...r, V]
      };
      let ne = {
        begin: zq(bWt(lE(Bde, /\s*:/)), bWt(lE(Bde, /\s+/, Bde, /\s*:/))),
        end: /:/,
        relevance: 0,
        contains: [{
          className: "keyword",
          match: /\b_\b/
        }, {
          className: "params",
          match: Bde
        }]
      };
      let oe = {
        begin: /\(/,
        end: /\)/,
        keywords: c,
        contains: [ne, ...r, ...u, ...g, b, k, ...z, V, Q],
        endsParent: true,
        illegal: /["']/
      };
      let ee = {
        match: [/(func|macro)/, /\s+/, zq(P.match, Bde, dfo)],
        className: {
          1: "keyword",
          3: "title.function"
        },
        contains: [Z, oe, t],
        illegal: [/\[/, /%/]
      };
      let re = {
        match: [/\b(?:subscript|init[?!]?)/, /\s*(?=[<(])/],
        className: {
          1: "keyword"
        },
        contains: [Z, oe, t],
        illegal: /\[|%/
      };
      let se = {
        match: [/operator/, /\s+/, dfo],
        className: {
          1: "keyword",
          3: "title"
        }
      };
      let ae = {
        begin: [/precedencegroup/, /\s+/, pjn],
        className: {
          1: "keyword",
          3: "title"
        },
        contains: [V],
        keywords: [...Wxp, ...SRa],
        end: /}/
      };
      let de = {
        match: [/class\b/, /\s+/, /func\b/, /\s+/, /\b[A-Za-z_][A-Za-z0-9_]*\b/],
        scope: {
          1: "keyword",
          3: "keyword",
          5: "title.function"
        }
      };
      let be = {
        match: [/class\b/, /\s+/, /var\b/],
        scope: {
          1: "keyword",
          3: "keyword"
        }
      };
      let fe = {
        begin: [/(struct|protocol|class|extension|enum|actor)/, /\s+/, Bde, /\s*/],
        beginScope: {
          1: "keyword",
          3: "title.class"
        },
        keywords: c,
        contains: [Z, ...u, {
          begin: /:/,
          end: /\{/,
          keywords: c,
          contains: [{
            scope: "title.class.inherited",
            match: pjn
          }, ...u],
          relevance: 0
        }]
      };
      for (let me of k.variants) {
        let Te = me.contains.find(ce => ce.label === "interpol");
        Te.keywords = c;
        let ue = [...u, ...m, ...g, b, k, ...U];
        Te.contains = [...ue, {
          begin: /\(/,
          end: /\)/,
          contains: ["self", ...ue]
        }];
      }
      return {
        name: "Swift",
        keywords: c,
        contains: [...r, ee, re, de, be, fe, se, ae, {
          beginKeywords: "import",
          end: /$/,
          contains: [...r],
          relevance: 0
        }, L, ...u, ...m, ...g, b, k, ...U, ...z, V, Q]
      };
    }
    RRa.exports = Kxp;
  });