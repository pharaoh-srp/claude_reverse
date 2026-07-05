  var dMs = __commonJS(uMs => {
    function h5u(e) {
      let t = {};
      if (e = e.replace(/^\?/, ""), e) {
        for (let n of e.split("&")) {
          let [r, o = null] = n.split("=");
          if (r = decodeURIComponent(r), o) {
            o = decodeURIComponent(o);
          }
          if (!(r in t)) {
            t[r] = o;
          } else if (Array.isArray(t[r])) {
            t[r].push(o);
          } else {
            t[r] = [t[r], o];
          }
        }
      }
      return t;
    }
    uMs.parseQueryString = h5u;
  });
  var bY = __commonJS(mMs => {
    var g5u = dMs();
    var pMs = e => {
      if (typeof e === "string") {
        return pMs(new URL(e));
      }
      let {
        hostname: t,
        pathname: n,
        port: r,
        protocol: o,
        search: s
      } = e;
      let i;
      if (s) {
        i = g5u.parseQueryString(s);
      }
      return {
        hostname: t,
        port: r ? parseInt(r) : undefined,
        protocol: o,
        path: n,
        query: i
      };
    };
    mMs.parseUrl = pMs;
  });