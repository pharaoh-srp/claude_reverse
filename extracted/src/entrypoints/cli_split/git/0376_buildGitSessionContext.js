  __export(aLl, {
    buildGitSessionContext: () => buildGitSessionContext
  });
  async function buildGitSessionContext(e, t, n) {
    if (!e) {
      return {
        sources: [],
        outcomes: []
      };
    }
    let {
      parseGitRemote: r,
      parseGitHubRepository: o
    } = await Promise.resolve().then(() => (bI(), iMt));
    let {
      getDefaultBranch: s
    } = await Promise.resolve().then(() => (na(), Fgn));
    let i = n || (await s()) || "";
    let a = t || i || undefined;
    let l = a && a !== i ? [a] : [];
    let c = (p, m, f) => ({
      sources: [{
        type: "git_repository",
        url: `https://${p}/${m}/${f}`,
        revision: a
      }],
      outcomes: [{
        type: "git_repository",
        git_info: {
          type: "github",
          repo: `${m}/${f}`,
          branches: l
        }
      }]
    });
    let u = r(e);
    if (u) {
      return c(u.host, u.owner, u.name);
    }
    let d = o(e);
    if (d) {
      let [p, m] = d.split("/");
      if (p && m) {
        return c("github.com", p, m);
      }
    }
    return {
      sources: [],
      outcomes: []
    };
  }
  var NBo = __lazy(() => {
    fk();
  });
  var S7e = {};