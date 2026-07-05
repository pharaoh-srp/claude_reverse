  __export(rxl, {
    validateURL: () => validateURL,
    isPreapprovedUrl: () => isPreapprovedUrl,
    isPermittedRedirect: () => isPermittedRedirect,
    getWithPermittedRedirects: () => getWithPermittedRedirects,
    getURLMarkdownContent: () => getURLMarkdownContent,
    convertHtmlToMarkdown: () => convertHtmlToMarkdown,
    clearWebFetchCache: () => clearWebFetchCache,
    checkDomainBlocklist: () => checkDomainBlocklist,
    applyPromptToMarkdown: () => applyPromptToMarkdown,
    WebFetchTransportError: () => WebFetchTransportError,
    MAX_MARKDOWN_LENGTH: () => 1e5
  });
  function clearWebFetchCache() {
    Ser.clear();
    sLo.clear();
  }
  function Ukm() {
    return Fkm ??= Promise.resolve().then(() => (JRl(), YRl)).then(e => {
      let n = new e.default();
      n.remove(["style", "script", "noscript", "iframe"]);
      return n;
    });
  }
  async function convertHtmlToMarkdown(e) {
    try {
      let t = (await Ukm()).turndown(e.slice(0, 1048576));
      if (e.length > 1048576) {
        t += `

[Content truncated due to length...]`;
      }
      return t;
    } catch (t) {
      logForDebugging(`Turndown failed, falling back to raw HTML: ${t instanceof Error ? t.message : String(t)}`, {
        level: "error"
      });