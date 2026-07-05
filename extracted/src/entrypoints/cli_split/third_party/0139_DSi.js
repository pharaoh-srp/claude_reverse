  var DSi = __commonJS(YY => {
    var Nxd = YY && YY.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var Lxd = YY && YY.__setModuleDefault || (Object.create ? function (e, t) {
      Object.defineProperty(e, "default", {
        enumerable: true,
        value: t
      });
    } : function (e, t) {
      e.default = t;
    });
    var OSi = YY && YY.__importStar || function (e) {
      if (e && e.__esModule) {
        return e;
      }
      var t = {};
      if (e != null) {
        for (var n in e) {
          if (n !== "default" && Object.prototype.hasOwnProperty.call(e, n)) {
            Nxd(t, e, n);
          }
        }
      }
      Lxd(t, e);
      return t;
    };
    var Fxd = YY && YY.__importDefault || function (e) {
      return e && e.__esModule ? e : {
        default: e
      };
    };
    Object.defineProperty(YY, "__esModule", {
      value: true
    });
    YY.HttpProxyAgent = undefined;
    var Uxd = OSi(require("net"));
    var Bxd = OSi(require("tls"));
    var $xd = Fxd($tt());
    var Hxd = require("events");
    var jxd = PLr();
    var PSi = require("url");
    var $st = (0, $xd.default)("http-proxy-agent");
    class k5r extends jxd.Agent {
      constructor(e, t) {
        super(t);
        this.proxy = typeof e === "string" ? new PSi.URL(e) : e;
        this.proxyHeaders = t?.headers ?? {};
        $st("Creating new HttpProxyAgent instance: %o", this.proxy.href);
        let n = (this.proxy.hostname || this.proxy.host).replace(/^\[|\]$/g, "");
        let r = this.proxy.port ? parseInt(this.proxy.port, 10) : this.proxy.protocol === "https:" ? 443 : 80;
        this.connectOpts = {
          ...(t ? qxd(t, "headers") : null),
          host: n,
          port: r
        };
      }
      addRequest(e, t) {
        e._header = null;
        this.setRequestProps(e, t);
        super.addRequest(e, t);
      }
      setRequestProps(e, t) {
        let {
          proxy: n
        } = this;
        let r = t.secureEndpoint ? "https:" : "http:";
        let o = e.getHeader("host") || "localhost";
        let s = `${r}//${o}`;
        let i = new PSi.URL(e.path, s);
        if (t.port !== 80) {
          i.port = String(t.port);
        }
        e.path = String(i);
        let a = typeof this.proxyHeaders === "function" ? this.proxyHeaders() : {
          ...this.proxyHeaders
        };
        if (n.username || n.password) {
          let l = `${decodeURIComponent(n.username)}:${decodeURIComponent(n.password)}`;
          a["Proxy-Authorization"] = `Basic ${Buffer.from(l).toString("base64")}`;
        }
        if (!a["Proxy-Connection"]) {
          a["Proxy-Connection"] = this.keepAlive ? "Keep-Alive" : "close";
        }
        for (let l of Object.keys(a)) {
          let c = a[l];
          if (c) {
            e.setHeader(l, c);
          }
        }
      }
      async connect(e, t) {
        if (e._header = null, !e.path.includes("://")) {
          this.setRequestProps(e, t);
        }
        let n;
        let r;
        if ($st("Regenerating stored HTTP header string for request"), e._implicitHeader(), e.outputData && e.outputData.length > 0) {
          $st("Patching connection write() output buffer with updated header");
          n = e.outputData[0].data;
          r = n.indexOf(`\r
\r
`) + 4;
          e.outputData[0].data = e._header + n.substring(r);
          $st("Output buffer: %o", e.outputData[0].data);
        }
        let o;
        if (this.proxy.protocol === "https:") {
          $st("Creating `tls.Socket`: %o", this.connectOpts);
          o = Bxd.connect(this.connectOpts);
        } else {
          $st("Creating `net.Socket`: %o", this.connectOpts);
          o = Uxd.connect(this.connectOpts);
        }
        await (0, Hxd.once)(o, "connect");
        return o;
      }
    }
    k5r.protocols = ["http", "https"];
    YY.HttpProxyAgent = k5r;
    function qxd(e, ...t) {
      let n = {};
      let r;
      for (r in e) {
        if (!t.includes(r)) {
          n[r] = e[r];
        }
      }
      return n;
    }
  });