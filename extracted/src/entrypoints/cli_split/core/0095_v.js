  var v$s = __commonJS(Mbn => {
    Object.defineProperty(Mbn, "__esModule", {
      value: true
    });
    Mbn.getEndpointUrlConfig = undefined;
    var S$s = Sj();
    var tJu = e => ({
      environmentVariableSelector: t => {
        let n = e.split(" ").map(s => s.toUpperCase());
        let r = t[[T$s, ...n].join("_")];
        if (r) {
          return r;
        }
        let o = t[T$s];
        if (o) {
          return o;
        }
        return;
      },
      configFileSelector: (t, n) => {
        if (n && t.services) {
          let o = n[["services", t.services].join(S$s.CONFIG_PREFIX_SEPARATOR)];
          if (o) {
            let s = e.split(" ").map(a => a.toLowerCase());
            let i = o[[s.join("_"), E$s].join(S$s.CONFIG_PREFIX_SEPARATOR)];
            if (i) {
              return i;
            }
          }
        }
        let r = t[E$s];
        if (r) {
          return r;
        }
        return;
      },
      default: undefined
    });
    Mbn.getEndpointUrlConfig = tJu;
  });
  var w$s = __commonJS(Nbn => {
    Object.defineProperty(Nbn, "__esModule", {
      value: true
    });
    Nbn.getEndpointFromConfig = undefined;
    var nJu = VB();
    var rJu = v$s();
    var oJu = async e => (0, nJu.loadConfig)((0, rJu.getEndpointUrlConfig)(e ?? ""))();
    Nbn.getEndpointFromConfig = oJu;
  });