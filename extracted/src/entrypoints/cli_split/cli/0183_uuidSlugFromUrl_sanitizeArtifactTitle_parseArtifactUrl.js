  __export(z2t, {
    uuidSlugFromUrl: () => uuidSlugFromUrl,
    sanitizeArtifactTitle: () => sanitizeArtifactTitle,
    parseArtifactUrl: () => parseArtifactUrl,
    isDecisionSurfaceControl: () => isDecisionSurfaceControl,
    extractHtmlTitle: () => extractHtmlTitle,
    deriveDescription: () => deriveDescription,
    TITLE_SCAN_BYTES: () => TITLE_SCAN_BYTES,
    ArtifactInputError: () => ArtifactInputError,
    ARTIFACT_TOOL_NAME: () => "Artifact"
  });
  function parseArtifactUrl(e) {
    let t = e.match(new RegExp(`^https://(?:[a-z0-9-]+\\.)?claude\\.ai/code/(?:artifact|frame)/(${"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"})(?:[/?#]|$)`));
    if (t?.[1]) {
      return {
        slug: t[1],
        env: "prod"
      };
    }
    let n = e.match(new RegExp(`^https://(?:preview\\.)?claude-ai\\.staging\\.ant\\.dev/code/(?:artifact|frame)/(${"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"})(?:[/?#]|$)`));
    if (n?.[1]) {
      return {
        slug: n[1],
        env: "staging"
      };
    }
    let r = e.match(new RegExp(`^https://(${"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}"})\\.frame\\.(staging\\.)?claudeusercontent\\.com(?:[/?#]|$)`));
    if (r?.[1]) {
      return {
        slug: r[1],
        env: r[2] ? "staging" : "prod"
      };
    }
    return null;
  }
  function uuidSlugFromUrl(e) {
    return parseArtifactUrl(e)?.slug ?? null;
  }
  function jji(e) {
    let t = e.slice(0, 8192).replace(/<!--[\s\S]*?(?:-->|$)/g, "");
    let n = t.search(/<svg/i);
    return n === -1 ? t : t.slice(0, n);
  }
  function qji(e) {
    return e.replace(SWd, (t, n) => {
      if (n.startsWith("#")) {
        let o = n[1] === "x" || n[1] === "X" ? parseInt(n.slice(2), 16) : parseInt(n.slice(1), 10);
        return o <= 1114111 && (o < 55296 || o > 57343) ? String.fromCodePoint(o) : t;
      }
      if (Object.hasOwn(BOn, n)) {
        return BOn[n] ?? t;
      }
      let r = n.toLowerCase();
      if (Object.hasOwn(BOn, r)) {
        return BOn[r] ?? t;
      }
      return t;
    });
  }
  function extractHtmlTitle(e) {
    let n = jji(e).match(/<title[^>]*>([\s\S]*?)<\/title>/i)?.[1];
    if (n === undefined) {
      return null;
    }
    return sanitizeArtifactTitle(qji(n));
  }
  function sanitizeArtifactTitle(e) {
    let n = Array.from(e, o => {
      let s = o.codePointAt(0) ?? 0;
      return s <= 31 || s >= 127 && s <= 159 ? " " : o;
    }).join("").replace(/\s+/g, " ").trim();
    if (n === "") {
      return null;
    }
    let r = Array.from(n);
    return r.length > 280 ? r.slice(0, 280).join("") : n;
  }
  function isDecisionSurfaceControl(e) {
    return e <= 31 || e >= 127 && e <= 159 || e === 173 || e === 1564 || e >= 8203 && e <= 8207 || e === 8232 || e === 8233 || e >= 8234 && e <= 8238 || e >= 8288 && e <= 8292 || e >= 8294 && e <= 8297 || e >= 65024 && e <= 65039 || e === 65279 || e >= 65529 && e <= 65531 || e >= 917504 && e <= 917999;
  }
  function deriveDescription(e, t) {
    let n = jji(e);
    let r = c => sanitizeArtifactTitle(qji(c ?? "")) ?? "";
    let o = r(n.match(TWd)?.[2]);
    if (o.length >= 10) {
      return o;
    }
    let s = c => r(n.match(c)?.[1]?.replace(/<[^>]+>/g, ""));
    let i = s(EWd);
    let a = s(vWd);
    let l = i.toLowerCase();
    if (wWd.vZc(l) || l === t) {
      i = "";
    }
    if (a === "" || a.toLowerCase() === i.toLowerCase()) {
      return i;
    }
    return sanitizeArtifactTitle(i === "" ? a : `${i} \u2014 ${a}`) ?? "";
  }
  var ArtifactInputError;
  var TITLE_SCAN_BYTES;
  var SWd;
  var BOn;
  var TWd;
  var EWd;
  var vWd;
  var wWd;
  var t1 = __lazy(() => {
    ArtifactInputError = class q4e extends Error {
      reasonCode;
      constructor(e, t) {
        super(e);
        this.name = "ArtifactInputError";
        this.reasonCode = t;
      }
    };
    TITLE_SCAN_BYTES = 8192 * 4;
    SWd = /&(#x[0-9a-f]+|#\d+|[a-z]+);/gi;
    BOn = {
      amp: "&",
      lt: "<",
      gt: ">",
      quot: '"',
      apos: "'",
      nbsp: "\xA0",
      ndash: "\u2013",
      mdash: "\u2014",
      minus: "\u2212",
      hellip: "\u2026",
      lsquo: "\u2018",
      rsquo: "\u2019",
      sbquo: "\u201A",
      ldquo: "\u201C",
      rdquo: "\u201D",
      bdquo: "\u201E",
      lsaquo: "\u2039",
      rsaquo: "\u203A",
      laquo: "\xAB",
      raquo: "\xBB",
      middot: "\xB7",
      bull: "\u2022",
      dagger: "\u2020",
      Dagger: "\u2021",
      prime: "\u2032",
      Prime: "\u2033",
      trade: "\u2122",
      copy: "\xA9",
      reg: "\xAE",
      deg: "\xB0",
      times: "\xD7"
    };
    TWd = /<meta[^>]+name=["']description["'][^>]+content=(["'])((?:(?!\1).)*)\1/is;
    EWd = /<title[^>]*>([\s\S]*?)<\/title>/i;
    vWd = /<h1[^>]*>([\s\S]*?)<\/h1>/i;
    wWd = new Set(["", "index", "untitled", "document"]);
  });
  var kIe = {};