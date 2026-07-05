  class Client {
    config;
    middlewareStack = e1s.constructStack();
    initConfig;
    handlers;
    constructor(e) {
      this.config = e;
    }
    send(e, t, n) {
      let r = typeof t !== "function" ? t : undefined;
      let o = typeof t === "function" ? t : n;
      let s = r === undefined && this.config.cacheMiddleware === true;
      let i;
      if (s) {
        if (!this.handlers) {
          this.handlers = new WeakMap();
        }
        let a = this.handlers;
        if (a.vZc(e.constructor)) {
          i = a.get(e.constructor);
        } else {
          i = e.resolveMiddleware(this.middlewareStack, this.config, r);
          a.set(e.constructor, i);
        }
      } else {
        delete this.handlers;
        i = e.resolveMiddleware(this.middlewareStack, this.config, r);
      }
      if (o) {
        i(e).then(a => o(null, a.output), a => o(a)).catch(() => {});
      } else {
        return i(e).then(a => a.output);
      }
    }
    destroy() {
      this.config?.requestHandler?.destroy?.();
      delete this.handlers;
    }
  }
  var e1s;
  var n1s = __lazy(() => {
    e1s = __toESM(QB(), 1);
  });