    return XFs(async () => {
      let c = KFs(a);
      if (o) {
        c.headers.Authorization = o;
      } else if (s) {
        c.headers.Authorization = (await eUs.default.readFile(s)).toString();
      }
      try {
        let u = await l.handle(c);
        return YFs(u.response).then(d => QFs.setCredentialFeature(d, "CREDENTIALS_HTTP", "z"));
      } catch (u) {
        throw new ZFr.CredentialsProviderError(String(u), {
          logger: e.logger
        });
      }
    }, e.maxRetries ?? 3, e.timeout ?? 1000);
  };
  var tUs = __lazy(() => {
    AMs();
    JFs();
    QFs = __toESM(UP(), 1);
    ZFs = __toESM(hW(), 1);
    ZFr = __toESM(wy(), 1);
    eUs = __toESM(require("fs/promises"));
  });
  var eUr = {};