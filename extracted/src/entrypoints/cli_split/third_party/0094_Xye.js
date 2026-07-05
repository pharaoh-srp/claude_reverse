  var Xye = __commonJS(Dbn => {
    var ZYu = g$s();
    function _$s(e) {
      return t => async n => {
        let r = n.request;
        if (ZYu.HttpRequest.isInstance(r)) {
          let {
            body: o,
            headers: s
          } = r;
          if (o && Object.keys(s).map(i => i.toLowerCase()).indexOf("content-length") === -1) {
            try {
              let i = e(o);
              r.headers = {
                ...r.headers,
                ["content-length"]: String(i)
              };
            } catch (i) {}
          }
        }
        return t({
          ...n,
          request: r
        });
      };
    }
    var b$s = {
      step: "build",
      tags: ["SET_CONTENT_LENGTH", "CONTENT_LENGTH"],
      name: "contentLengthMiddleware",
      override: true
    };
    var eJu = e => ({
      applyToStack: t => {
        t.add(_$s(e.bodyLengthChecker), b$s);
      }
    });
    Dbn.contentLengthMiddleware = _$s;
    Dbn.contentLengthMiddlewareOptions = b$s;
    Dbn.getContentLengthPlugin = eJu;
  });