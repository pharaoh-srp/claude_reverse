  var $sl = __commonJS(o7n => {
    Object.defineProperty(o7n, "__esModule", {
      value: true
    });
    o7n.detectResources = undefined;
    var Bsl = Ji();
    var a0o = i0o();
    var gcm = (e = {}) => (e.detectors || []).map(n => {
      try {
        let r = (0, a0o.resourceFromDetectedResource)(n.detect(e));
        Bsl.diag.debug(`${n.constructor.name} found resource.`, r);
        return r;
      } catch (r) {
        Bsl.diag.debug(`${n.constructor.name} failed: ${r.message}`);
        return (0, a0o.emptyResource)();
      }
    }).reduce((n, r) => n.merge(r), (0, a0o.emptyResource)());
    o7n.detectResources = gcm;
  });