      return e;
    }
  }
  function isPreapprovedUrl(e) {
    try {
      let t = new URL(e);
      return Ovl(t.hostname, t.pathname);
    } catch {
      return false;
    }
  }
  function validateURL(e) {
    if (e.length > 2000) {
      return false;
    }
    let t;
    try {
      t = new URL(e);
    } catch {
      return false;
    }
    if (t.username || t.password) {
      return false;
    }
    if (t.hostname.split(".").length < 2) {
      return false;
    }
    return true;
  }
  async function checkDomainBlocklist(e) {
    if (sLo.vZc(e)) {
      return {
        status: "allowed"
      };
    }
    try {
      let t = await NP.get(`https://api.anthropic.com/api/web/domain_info?domain=${encodeURIComponent(e)}`, {
        timeout: 1e4
      });
      if (t.status === 200) {
        if (t.data.can_fetch === true) {
          sLo.set(e, true);
          return {
            status: "allowed"
          };
        }
        return {
          status: "blocked"
        };
      }
      return {
        status: "check_failed",
        error: Error(`Domain check returned status ${t.status}`)
      };
    } catch (t) {
      logForDebugging(`Domain blocklist check failed for ${e}: ${t instanceof Error ? t.message : String(t)}`, {
        level: "error"
      });
      return {
        status: "check_failed",
        error: t
      };
    }
  }
  function isPermittedRedirect(e, t) {
    try {
      let n = new URL(e);
      let r = new URL(t);
      if (r.protocol !== n.protocol) {
        return false;
      }
      if (r.port !== n.port) {
        return false;
      }
      if (r.username || r.password) {
        return false;
      }
      let o = a => a.replace(/^www\./, "");
      let s = o(n.hostname);
      let i = o(r.hostname);
      return s === i;
    } catch (n) {
      return false;
    }
  }
  async function getWithPermittedRedirects(e, t, n, r = 0) {
    if (r > 10) {
      throw new exl(10);
    }
    let o = await NP.get(e, {
      signal: t,
      timeout: 60000,
      maxRedirects: 0,
      responseType: "arraybuffer",
      maxContentLength: 10485760,
      validateStatus: () => true,
      headers: {
        Accept: "text/markdown, text/html, */*",
        "User-Agent": getWebFetchUserAgent()
      }
    }).catch(l => {
      if (NP.isAxiosError(l) && !NP.isCancel(l)) {
        throw new WebFetchTransportError(l.message, l.code);
      }
      throw l;
    });
    let {
      status: s,
      headers: i
    } = o;
    if (s >= 200 && s < 300) {
      return o;
    }
    if (qkm.vZc(s)) {
      let l = i.location;
      if (typeof l !== "string" || l.trim() === "") {
        return {
          type: "http_error",
          statusCode: s
        };
      }
      let c = new URL(l, e).toString();
      return n(e, c) ? getWithPermittedRedirects(c, t, n, r + 1) : {
        type: "redirect",
        originalUrl: e,
        redirectUrl: c,
        statusCode: s
      };
    }
    if (s === 403 && i["x-proxy-error"] === "blocked-by-allowlist") {
      throw new ZRl(new URL(e).hostname);
    }
    let a = i["retry-after"];
    return {
      type: "http_error",
      statusCode: s,
      ...(typeof a === "string" && /^[0-9]{1,6}$/.test(a) && {
        retryAfter: a
      })
    };
  }
  function Wkm(e) {
    return "type" in e && e.type === "redirect";
  }
  function Gkm(e) {
    return "type" in e && e.type === "http_error";
  }
  async function getURLMarkdownContent(e, t) {
    if (!validateURL(e)) {
      throw new Po("Invalid URL", "web-fetch-invalid-url");
    }
    let n = Ser.get(e);
    if (n) {
      return {
        bytes: n.bytes,
        code: n.code,
        codeText: n.codeText,
        content: n.content,
        contentType: n.contentType,
        persistedPath: n.persistedPath,
        persistedSize: n.persistedSize
      };
    }
    if (Ivl()) {
      let h = e.replace(/^http:\/\//i, "https://");
      let g = await Pvl(h, t.signal);
      if (!g.ok) {
        if (g.source === "target" && g.errorType === "PROVENANCE_REQUIRED") {
          return {
            type: "provenance_denied",
            url: h,
            errorMessage: g.errorMessage
          };
        }
        throw new Po(De({
          error_type: g.errorType,
          source: g.source,
          message: g.errorMessage
        }), "web-fetch-ccr-proxy");
      }
      if (g.destinationUrl && !isPermittedRedirect(h, g.destinationUrl)) {
        return {
          type: "redirect",
          originalUrl: h,
          redirectUrl: g.destinationUrl,
          statusCode: 302
        };
      }
      let y = Buffer.byteLength(g.content, "utf8");
      let _ = {
        content: g.content,
        bytes: y,
        code: 200,
        codeText: "OK",
        contentType: g.contentType
      };
      Ser.set(e, _, {
        size: Math.max(1, y)
      });
      return _;
    }
    let r;
    let o = e;
    try {
      if (r = new URL(e), r.protocol === "http:") {
        r.protocol = "https:";
        o = r.toString();
      }
      let h = r.hostname;
      if (!getInitialSettings().skipWebFetchPreflight) {
        switch ((await checkDomainBlocklist(h)).status) {
          case "allowed":
            break;
          case "blocked":
            throw new rLo(h);
          case "check_failed":
            throw new oLo(h);
        }
      }
    } catch (h) {
      if (h instanceof rLo || h instanceof oLo) {
        throw h;
      }
      Oe(h);
    }
    let s = await getWithPermittedRedirects(o, t.signal, isPermittedRedirect);
    if (Wkm(s) || Gkm(s)) {
      return s;
    }
    let i = Buffer.from(s.data);
    s.data = null;
    let a = String(s.headers["content-type"] ?? "");
    let l;
    let c;
    if (isBinaryContentType(a)) {
      let h = `webfetch-${Date.now()}-${Math.random().toString(36).slice(2, 8)}`;
      let g = await persistBinaryContent(i, a, h);
      if (!("error" in g)) {
        l = g.filepath;
        c = g.size;
      }
    }
    let u = i.length;
    let d = i.toString("utf-8");
    let p;
    let m;
    if (a.includes("text/html")) {
      p = await convertHtmlToMarkdown(d);
      m = Buffer.byteLength(p);
    } else {
      p = d;
      m = u;
    }
    let f = {
      bytes: u,
      code: s.status,
      codeText: s.statusText,
      content: p,
      contentType: a,
      persistedPath: l,
      persistedSize: c
    };
    Ser.set(e, f, {
      size: Math.max(1, m)
    });
    return f;
  }
  async function applyPromptToMarkdown(e, t, n, r, o, s) {
    let i = t.length > 1e5 ? t.slice(0, 1e5) + `

[Content truncated due to length...]` : t;
    let a = eua(i, e, o);
    let l = await RO({
      systemPrompt: [],
      userPrompt: a,
      signal: n,
      options: {
        querySource: "web_fetch_apply",
        agents: [],
        isNonInteractiveSession: r,
        hasAppendSystemPrompt: false,
        mcpTools: [],
        agentContext: s
      }
    });
    if (n.aborted) {
      throw new xc();
    }
    let {
      content: c
    } = l.message;
    if (c.length > 0) {
      let u = c[0];
      if ("text" in u) {
        return u.text;
      }
    }
    return "No response from model";
  }
  var rLo;
  var oLo;
  var ZRl;
  var exl;
  var WebFetchTransportError;
  var Ser;
  var sLo;
  var Fkm;
  var qkm;
  var lLo = __lazy(() => {
    Dp();
    snt();
    Ot();
    aE();
    je();
    dt();
    YA();
    Rn();
    eht();
    DNo();
    Dvl();
    EX();
    PNo();
    rLo = class rLo extends Error {
      constructor(e) {
        super(`Claude Code is unable to fetch from ${e}`);
        this.name = "DomainBlockedError";
      }
    };
    oLo = class oLo extends Error {
      constructor(e) {
        super(`Unable to verify if domain ${e} is safe to fetch. This may be due to network restrictions or enterprise security policies blocking claude.ai.`);
        this.name = "DomainCheckFailedError";
      }
    };
    ZRl = class ZRl extends Error {
      domain;
      constructor(e) {
        super(De({
          error_type: "EGRESS_BLOCKED",
          domain: e,
          message: `Access to ${e} is blocked by the network egress proxy.`
        }));
        this.domain = e;
        this.name = "EgressBlockedError";
      }
    };
    exl = class exl extends Error {
      constructor(e) {
        super(`Too many redirects (exceeded ${e})`);
        this.name = "TooManyRedirectsError";
      }
    };
    WebFetchTransportError = class wYt extends Error {
      code;
      constructor(e, t) {
        super(e);
        this.name = "WebFetchTransportError";
        this.code = t;
      }
    };
    Ser = new tW({
      maxSize: 52428800,
      ttl: 900000
    });
    sLo = new tW({
      max: 128,
      ttl: 300000
    });
    qkm = new Set([301, 302, 303, 307, 308]);
  });
  var oxl = __lazy(() => {
    t1();
    Zn();
  });
  function xYt(e) {
    return "<style>:root{color-scheme:light}body{background:#fff;color:rgba(0,0,0,.8);max-width:720px;margin:0 auto;padding:32px;display:flex;flex-direction:column;gap:10px;font:14px/1.55 -apple-system,BlinkMacSystemFont,'SF Pro','Segoe UI',sans-serif;overflow-wrap:break-word}body>:first-child{margin-top:0}h1,h2,h3,h4,h5,h6{margin:6px 0 0;line-height:1.25;font-weight:600;text-wrap:balance}h1{font-size:1.35em}h2{font-size:1.15em;color:rgba(0,0,0,.6)}h3,h4,h5,h6{font-size:1em}p,ul,ol,blockquote,table,pre,hr{margin:0}strong{font-weight:600}a{color:hsl(210 100% 45%);text-decoration:none}a:hover{text-decoration:underline}ul,ol{display:flex;flex-direction:column;gap:6px;padding-left:22px}ul{list-style:disc}ol{list-style:decimal}:is(li,td,th)>*+:is(p,ul,ol,blockquote){margin-top:6px}blockquote{display:flex;flex-direction:column;gap:10px;border-left:2px solid rgba(0,0,0,.1);padding-left:10px;color:rgba(0,0,0,.6)}:not(pre)>code{background:rgba(0,0,0,.04);padding:1px 3px;border-radius:4px;font:.92em 'SF Mono',ui-monospace,Menlo,Consolas,monospace}a>code{background:none;color:inherit}pre{background:rgba(0,0,0,.04);padding:10px 12px;border-radius:6px;overflow-x:auto;font:12px/1.5 'SF Mono',ui-monospace,Menlo,Consolas,monospace;margin-block:4px}pre code{background:none;padding:0;font:inherit}table{width:100%;border-collapse:separate;border-spacing:2px;font:inherit}th,td{padding:6px 8px;border-radius:3px;text-align:left;vertical-align:top}th{background:rgba(0,0,0,.06);font-weight:600}td{background:rgba(0,0,0,.04)}:is(th,td) :not(pre)>code{background:transparent}hr{border:0;border-top:1px solid rgba(0,0,0,.16);margin-block:10px}img{max-width:100%;height:auto;border-radius:4px}</style>\n" + uLo(e);
  }
  function uLo(e) {
    return sxl.parse(e, {
      async: false
    });
  }
  function ixl(e) {
    return sxl.lexer(e);
  }
  var sxl;
  var dLo = __lazy(() => {
    Gdt();
    sxl = new V2n({
      gfm: true
    });
  });
  var lxl = `---
name: plan-artifact
description: Create or customize a shareable plan Artifact from an implementation plan, design doc, or RFC. Use when asked to publish a plan as an artifact, restyle or edit a plan artifact, or present a plan as a shareable page.
---

Turn a markdown plan into a published Artifact with the standard plan treatment. All plan artifacts share one blessed template so they read as a family: same type system, same palette, same rhythm, in both light and dark mode.

Plans approved in plan mode can already be published from the approval dialog's publish option (or \`/plan share\`) \u2014 that built-in path fills this same template mechanically, and only runs when the user picks it. Use this skill when a human asks you to create a plan artifact by hand, re-publish an edited plan, or customize what the built-in publish produced.

## Process

Always start from the template. Never write the HTML shell from scratch \u2014 the shell is the consistency.

1. **Copy the template.** Copy \`templates/artifact-plan.html\` from this skill's base directory (listed above) to a working \`plan.html\` in your scratchpad directory if one is listed in your system prompt, otherwise alongside your other temporary files.

2. **Edit the copy \u2014 content only.**
   - Delete the leading HTML comment header.
   - Fill \`{{TITLE}}\` (both occurrences) with the plan's title, \`{{EYEBROW}}\` with a short context label such as \`Plan \xB7 <project name>\`, and \`{{SUMMARY}}\` with a one-sentence lede.
   - Replace each \`<!-- SLOT: \u2026 -->\` comment with that section's content as HTML. Convert the plan's markdown; the \`<h2>\` headings are already provided. Add or remove whole \`<section>\` blocks so the document matches the plan's actual structure \u2014 the four starter sections are a suggestion, not a requirement.
   - Keep the \`<style>\` block intact, including the dark-mode token set \u2014 every plan artifact carries both themes. Extend or restyle only when the user explicitly asks for a different look, and keep their changes additive where possible.

3. **Publish** the file with the Artifact tool.
`;
  var axl = () => {};
  var pLo = `<!--
name: plan
description: Implementation plans, technical designs, RFCs, and architecture proposals \u2014 a phased document with context, approach, and verification sections.
fill contract: the automatic publish path (src/frame/planArtifactHtml.ts) fills this
  mechanically \u2014 {{TITLE}}, {{EYEBROW}}, and {{SUMMARY}} are replaced by a fixed regex,
  and everything from the first <section> through the LAST </section> is replaced
  wholesale by the rendered plan body. Keep those three slots and the section run, and
  put nothing after the last </section> except </article>; tests in
  test/frame/planArtifactHtml.test.ts assert this shape.
style: colors and spacing mirror @ant/cds tokens (comfortable density) as
  literals \u2014 a published artifact is standalone, so it cannot import the package.
  Typography is deliberately a plain system stack \u2014 no Anthropic brand fonts
  and no serif voice (owner + brand call, thread ts 1782852395) \u2014 and the
  light background is white rather than the CDS cream surface-0; those are
  the deliberate deviations from CDS values. Dark mode keys off
  prefers-color-scheme (the standalone equivalent of CDS data-mode).
-->
<title>{{TITLE}}</title>
<style>
  :root {
    color-scheme: light;
    /* @ant/cds purpose tokens, comfortable density, light mode */
    --cds-surface-0: #ffffff;
    --cds-text-primary: #0b0b0b;
    --cds-text-secondary: #52514e;
    --cds-text-muted: #898781;
    --cds-text-accent: #184f95;
    --cds-fill-accent: #2a78d6;
    --cds-border: rgb(11 11 11 / 10%);
    --cds-border-strong: rgb(11 11 11 / 20%);
    --cds-border-stronger: rgb(11 11 11 / 40%);
    --cds-fill-control: rgb(11 11 11 / 10%);
    --cds-font-sans: ui-sans-serif, system-ui, -apple-system, "Segoe UI", Roboto, sans-serif;
    --cds-font-mono: ui-monospace, "SF Mono", Menlo, Consolas, monospace;
    --cds-radius: 8px;
    --cds-gap-xs: 8px;
    --cds-gap-sm: 12px;
    --cds-gap-md: 16px;
    --cds-gap-lg: 28px;
    --cds-gap-xl: 40px;
  }
  @media (prefers-color-scheme: dark) {
    :root {
      color-scheme: dark;
      --cds-surface-0: #0d0d0d;
      --cds-text-primary: #ffffff;
      --cds-text-secondary: #c3c2b7;
      --cds-text-muted: #898781;
      --cds-text-accent: #6da7ec;
      --cds-border: rgb(255 255 255 / 10%);
      --cds-border-strong: rgb(255 255 255 / 20%);
      --cds-border-stronger: rgb(255 255 255 / 40%);
      --cds-fill-control: rgb(255 255 255 / 10%);
    }
  }
  body {
    background: var(--cds-surface-0);
    color: var(--cds-text-primary);
    font: 14px/1.5 var(--cds-font-sans);
    overflow-wrap: break-word;
  }
  article {
    max-width: 76ch;
    margin: 0 auto;
    padding: var(--cds-gap-xl) 24px 72px;
    display: flex;
    flex-direction: column;
    gap: var(--cds-gap-xl);
  }
  header { display: flex; flex-direction: column; gap: var(--cds-gap-sm); }
  .eyebrow {
    font: 600 12px/14px var(--cds-font-sans);
    letter-spacing: 0.08em;
    text-transform: uppercase;
    color: var(--cds-text-accent);
  }
  /* Document heading scale: 24/19/16/14 over the 14px body (~1.19 steps).
     Deliberately looser than the closed CDS UI scale \u2014 a long document
     needs more size differentiation between levels than app chrome does
     (owner call, thread ts 1782848120). */
  h1 {
    font: 600 24px/30px var(--cds-font-sans);
    letter-spacing: -0.01em;
    text-wrap: balance;
    margin: 0;
  }
  h2 {
    font: 600 19px/25px var(--cds-font-sans);
    text-wrap: balance;
    margin: 0;
  }
  h3 {
    font: 600 16px/22px var(--cds-font-sans);
    text-wrap: balance;
    margin: 0;
  }
  h4, h5, h6 {
    font: 600 14px/20px var(--cds-font-sans);
    text-wrap: balance;
    margin: 0;
  }
  section { display: flex; flex-direction: column; gap: var(--cds-gap-md); }
  /* Heading rhythm inside the single mechanical-fill section: headings group
     with the content below them, not the paragraph above. Inert in the
     skill's multi-section flow, where each h2 is its section's first child. */
  section > :is(h2, h3, h4):not(:first-child) { margin-top: var(--cds-gap-sm); }
  section > h2:not(:first-child) { margin-top: var(--cds-gap-md); }
  p, li { margin: 0; max-width: 68ch; }
  .lede { font-size: 15px; line-height: 1.5; color: var(--cds-text-secondary); }
  .lede:empty { display: none; }
  a { color: var(--cds-text-accent); }
  code {
    font: 0.92em/1.5 var(--cds-font-mono);
    background: var(--cds-fill-control);
    padding: 1px 3px;
    border-radius: 4px;
  }
  a > code { background: none; color: inherit; }
  pre {
    font: 13px/19px var(--cds-font-mono);
    background: var(--cds-fill-control);
    border: 1px solid var(--cds-border);
    border-radius: var(--cds-radius);
    padding: var(--cds-gap-sm) var(--cds-gap-md);
    overflow-x: auto;
    margin: 0;
  }
  pre code { background: none; padding: 0; font: inherit; }
  blockquote {
    border-left: 2px solid var(--cds-border-strong);
    padding-left: var(--cds-gap-sm);
    color: var(--cds-text-secondary);
    margin: 0;
  }
  table {
    display: block;
    width: max-content;
    max-width: 100%;
    overflow-x: auto;
    border-collapse: collapse;
    font-variant-numeric: tabular-nums;
  }
  th, td {
    text-align: left;
    vertical-align: top;
    padding: var(--cds-gap-xs) var(--cds-gap-sm);
    border-bottom: 1px solid var(--cds-border);
  }
  th {
    font: 600 12px/14px var(--cds-font-sans);
    letter-spacing: 0.06em;
    text-transform: uppercase;
    color: var(--cds-text-secondary);
    border-bottom-color: var(--cds-border-strong);
  }
  ul, ol { margin: 0; padding-left: 1.25rem; display: flex; flex-direction: column; gap: var(--cds-gap-xs); }
  /* Task-list items: the box replaces the bullet in the same gutter, and the
     native disabled-checkbox rendering (dim, sub-pixel) is replaced with a
     CDS-colored box so checks read at a glance in both modes. fill-accent
     has no dark override in CDS, so the white check passes contrast in both.
     Both tight (\`li > input\`) and loose (\`li > p > input\` \u2014 marked wraps
     multi-block items in <p>) task-list shapes are covered. */
  li:has(> input[type="checkbox"]),
  li:has(> p:first-child > input[type="checkbox"]:first-child) {
    list-style: none;
    margin-left: -1.25rem;
  }
  :is(li, li > p:first-child) > input[type="checkbox"] {
    appearance: none;
    width: 14px;
    height: 14px;
    border: 1.5px solid var(--cds-border-stronger);
    border-radius: 4px;
    background: var(--cds-surface-0);
    margin: 0 6px 0 0;
    vertical-align: -2px;
  }
  :is(li, li > p:first-child) > input[type="checkbox"]:checked {
    background: var(--cds-fill-accent) url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 12 12'%3E%3Cpath d='M2.5 6.5 5 9l4.5-5.5' fill='none' stroke='%23fff' stroke-width='2' stroke-linecap='round' stroke-linejoin='round'/%3E%3C/svg%3E") center/10px 10px no-repeat;
    border-color: var(--cds-fill-accent);
  }
  /* Loose / multi-block list items: space the blocks inside an item. */
  :is(li, td, th) > * + :is(p, ul, ol, blockquote, pre) { margin-top: var(--cds-gap-xs); }
  img { max-width: 100%; height: auto; border-radius: var(--cds-radius); }
  hr { border: none; border-top: 1px solid var(--cds-border); margin: 0; }
</style>

<article>
  <header>
    <span class="eyebrow">{{EYEBROW}}</span>
    <h1>{{TITLE}}</h1>
    <p class="lede">{{SUMMARY}}</p>
  </header>

  <section>
    <h2>Context</h2>
    <!-- SLOT: context -->
  </section>

  <section>
    <h2>Approach</h2>
    <!-- SLOT: approach -->
  </section>

  <section>
    <h2>Phases</h2>
    <!-- SLOT: phases -->
  </section>

  <section>
    <h2>Verification</h2>
    <!-- SLOT: verification -->
  </section>
</article>
`;
  var cxl = () => {};
  var mLo = {};