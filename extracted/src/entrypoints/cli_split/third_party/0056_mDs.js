  var mDs = __commonJS(mW => {
    var l9u = mW && mW.__createBinding || (Object.create ? function (e, t, n, r) {
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
    var c9u = mW && mW.__setModuleDefault || (Object.create ? function (e, t) {
      Object.defineProperty(e, "default", {
        enumerable: true,
        value: t
      });
    } : function (e, t) {
      e.default = t;
    });
    var dDs = mW && mW.__importStar || function (e) {
      if (e && e.__esModule) {
        return e;
      }
      var t = {};
      if (e != null) {
        for (var n in e) {
          if (n !== "default" && Object.prototype.hasOwnProperty.call(e, n)) {
            l9u(t, e, n);
          }
        }
      }
      c9u(t, e);
      return t;
    };
    Object.defineProperty(mW, "__esModule", {
      value: true
    });
    mW.req = mW.json = mW.toBuffer = undefined;
    var u9u = dDs(require("http"));
    var d9u = dDs(require("https"));
    async function pDs(e) {
      let t = 0;
      let n = [];
      for await (let r of e) {
        t += r.length;
        n.push(r);
      }
      return Buffer.concat(n, t);
    }
    mW.toBuffer = pDs;
    async function p9u(e) {
      let n = (await pDs(e)).toString("utf8");
      try {
        return JSON.parse(n);
      } catch (r) {
        let o = r;
        throw o.message += ` (input: ${n})`, o;
      }
    }
    mW.json = p9u;
    function m9u(e, t = {}) {
      let r = ((typeof e === "string" ? e : e.href).startsWith("https:") ? d9u : u9u).request(e, t);
      let o = new Promise((s, i) => {
        r.once("response", s).once("error", i).end();
      });
      r.then = o.then.bind(o);
      return r;
    }
    mW.req = m9u;
  });
  var PLr = __commonJS(z6 => {
    var hDs = z6 && z6.__createBinding || (Object.create ? function (e, t, n, r) {
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
    var f9u = z6 && z6.__setModuleDefault || (Object.create ? function (e, t) {
      Object.defineProperty(e, "default", {
        enumerable: true,
        value: t
      });
    } : function (e, t) {
      e.default = t;
    });
    var gDs = z6 && z6.__importStar || function (e) {
      if (e && e.__esModule) {
        return e;
      }
      var t = {};
      if (e != null) {
        for (var n in e) {
          if (n !== "default" && Object.prototype.hasOwnProperty.call(e, n)) {
            hDs(t, e, n);
          }
        }
      }
      f9u(t, e);
      return t;
    };
    var h9u = z6 && z6.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          hDs(t, e, n);
        }
      }
    };
    Object.defineProperty(z6, "__esModule", {
      value: true
    });
    z6.Agent = undefined;
    var g9u = gDs(require("net"));
    var fDs = gDs(require("http"));
    var y9u = require("https");
    h9u(mDs(), z6);
    var xle = Symbol("AgentBaseInternalState");
    class yDs extends fDs.Agent {
      constructor(e) {
        super(e);
        this[xle] = {};
      }
      isSecureEndpoint(e) {
        if (e) {
          if (typeof e.secureEndpoint === "boolean") {
            return e.secureEndpoint;
          }
          if (typeof e.protocol === "string") {
            return e.protocol === "https:";
          }
        }
        let {
          stack: t
        } = Error();
        if (typeof t !== "string") {
          return false;
        }
        return t.split(`
`).some(n => n.indexOf("(https.js:") !== -1 || n.indexOf("node:https:") !== -1);
      }
      incrementSockets(e) {
        if (this.maxSockets === 1 / 0 && this.maxTotalSockets === 1 / 0) {
          return null;
        }
        if (!this.sockets[e]) {
          this.sockets[e] = [];
        }
        let t = new g9u.Socket({
          writable: false
        });
        this.sockets[e].push(t);
        this.totalSocketCount++;
        return t;
      }
      decrementSockets(e, t) {
        if (!this.sockets[e] || t === null) {
          return;
        }
        let n = this.sockets[e];
        let r = n.indexOf(t);
        if (r !== -1) {
          if (n.splice(r, 1), this.totalSocketCount--, n.length === 0) {
            delete this.sockets[e];
          }
        }
      }
      getName(e) {
        if (typeof e.secureEndpoint === "boolean" ? e.secureEndpoint : this.isSecureEndpoint(e)) {
          return y9u.Agent.prototype.getName.call(this, e);
        }
        return super.getName(e);
      }
      createSocket(e, t, n) {
        let r = {
          ...t,
          secureEndpoint: this.isSecureEndpoint(t)
        };
        let o = this.getName(r);
        let s = this.incrementSockets(o);
        Promise.resolve().then(() => this.connect(e, r)).then(i => {
          if (this.decrementSockets(o, s), i instanceof fDs.Agent) {
            try {
              return i.addRequest(e, r);
            } catch (a) {
              return n(a);
            }
          }
          this[xle].currentSocket = i;
          super.createSocket(e, t, n);
        }, i => {
          this.decrementSockets(o, s);
          n(i);
        });
      }
      createConnection() {
        let e = this[xle].currentSocket;
        if (this[xle].currentSocket = undefined, !e) {
          throw Error("No socket was returned in the `connect()` function");
        }
        return e;
      }
      get defaultPort() {
        return this[xle].defaultPort ?? (this.protocol === "https:" ? 443 : 80);
      }
      set defaultPort(e) {
        if (this[xle]) {
          this[xle].defaultPort = e;
        }
      }
      get protocol() {
        return this[xle].protocol ?? (this.isSecureEndpoint() ? "https:" : "http:");
      }
      set protocol(e) {
        if (this[xle]) {
          this[xle].protocol = e;
        }
      }
    }
    z6.Agent = yDs;
  });
  var _Ds = __commonJS(Jnt => {
    var _9u = Jnt && Jnt.__importDefault || function (e) {
      return e && e.__esModule ? e : {
        default: e
      };
    };
    Object.defineProperty(Jnt, "__esModule", {
      value: true
    });
    Jnt.parseProxyResponse = undefined;
    var b9u = _9u($tt());
    var zyn = (0, b9u.default)("https-proxy-agent:parse-proxy-response");
    function S9u(e) {
      return new Promise((t, n) => {
        let r = 0;
        let o = [];
        function s() {
          let u = e.read();
          if (u) {
            c(u);
          } else {
            e.once("readable", s);
          }
        }
        function i() {
          e.removeListener("end", a);
          e.removeListener("error", l);
          e.removeListener("readable", s);
        }
        function a() {
          i();
          zyn("onend");
          n(Error("Proxy connection ended before receiving CONNECT response"));
        }
        function l(u) {
          i();
          zyn("onerror %o", u);
          n(u);
        }
        function c(u) {
          o.push(u);
          r += u.length;
          let d = Buffer.concat(o, r);
          let p = d.indexOf(`\r
\r
`);
          if (p === -1) {
            zyn("have not received end of HTTP headers yet...");
            s();
            return;
          }
          let m = d.slice(0, p).toString("ascii").split(`\r
`);
          let f = m.shift();
          if (!f) {
            e.destroy();
            return n(Error("No header received from proxy CONNECT response"));
          }
          let h = f.split(" ");
          let g = +h[1];
          let y = h.slice(2).join(" ");
          let _ = {};
          for (let b of m) {
            if (!b) {
              continue;
            }
            let S = b.indexOf(":");
            if (S === -1) {
              e.destroy();
              return n(Error(`Invalid header from proxy CONNECT response: "${b}"`));
            }
            let E = b.slice(0, S).toLowerCase();
            let C = b.slice(S + 1).trimStart();
            let x = _[E];
            if (typeof x === "string") {
              _[E] = [x, C];
            } else if (Array.isArray(x)) {
              x.push(C);
            } else {
              _[E] = C;
            }
          }
          zyn("got proxy server response: %o %o", f, _);
          i();
          t({
            connect: {
              statusCode: g,
              statusText: y,
              headers: _
            },
            buffered: d
          });
        }
        e.on("error", l);
        e.on("end", a);
        s();
      });
    }
    Jnt.parseProxyResponse = S9u;
  });
  var oNt = __commonJS(_Y => {
    var T9u = _Y && _Y.__createBinding || (Object.create ? function (e, t, n, r) {
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
    var E9u = _Y && _Y.__setModuleDefault || (Object.create ? function (e, t) {
      Object.defineProperty(e, "default", {
        enumerable: true,
        value: t
      });
    } : function (e, t) {
      e.default = t;
    });
    var EDs = _Y && _Y.__importStar || function (e) {
      if (e && e.__esModule) {
        return e;
      }
      var t = {};
      if (e != null) {
        for (var n in e) {
          if (n !== "default" && Object.prototype.hasOwnProperty.call(e, n)) {
            T9u(t, e, n);
          }
        }
      }
      E9u(t, e);
      return t;
    };
    var vDs = _Y && _Y.__importDefault || function (e) {
      return e && e.__esModule ? e : {
        default: e
      };
    };
    Object.defineProperty(_Y, "__esModule", {
      value: true
    });
    _Y.HttpsProxyAgent = undefined;
    var Kyn = EDs(require("net"));
    var bDs = EDs(require("tls"));
    var v9u = vDs(require("assert"));
    var w9u = vDs($tt());
    var C9u = PLr();
    var R9u = require("url");
    var x9u = _Ds();
    var rNt = (0, w9u.default)("https-proxy-agent");
    var SDs = e => {
      if (e.servername === undefined && e.host && !Kyn.isIP(e.host)) {
        return {
          ...e,
          servername: e.host
        };
      }
      return e;
    };
    class OLr extends C9u.Agent {
      constructor(e, t) {
        super(t);
        this.options = {
          path: undefined
        };
        this.proxy = typeof e === "string" ? new R9u.URL(e) : e;
        this.proxyHeaders = t?.headers ?? {};
        rNt("Creating new HttpsProxyAgent instance: %o", this.proxy.href);
        let n = (this.proxy.hostname || this.proxy.host).replace(/^\[|\]$/g, "");
        let r = this.proxy.port ? parseInt(this.proxy.port, 10) : this.proxy.protocol === "https:" ? 443 : 80;
        this.connectOpts = {
          ALPNProtocols: ["http/1.1"],
          ...(t ? TDs(t, "headers") : null),
          host: n,
          port: r
        };
      }
      async connect(e, t) {
        let {
          proxy: n
        } = this;
        if (!t.host) {
          throw TypeError('No "host" provided');
        }
        let r;
        if (n.protocol === "https:") {
          rNt("Creating `tls.Socket`: %o", this.connectOpts);
          r = bDs.connect(SDs(this.connectOpts));
        } else {
          rNt("Creating `net.Socket`: %o", this.connectOpts);
          r = Kyn.connect(this.connectOpts);
        }
        let o = typeof this.proxyHeaders === "function" ? this.proxyHeaders() : {
          ...this.proxyHeaders
        };
        let s = Kyn.isIPv6(t.host) ? `[${t.host}]` : t.host;
        let i = `CONNECT ${s}:${t.port} HTTP/1.1\r
`;
        if (n.username || n.password) {
          let d = `${decodeURIComponent(n.username)}:${decodeURIComponent(n.password)}`;
          o["Proxy-Authorization"] = `Basic ${Buffer.from(d).toString("base64")}`;
        }
        if (o.Host = `${s}:${t.port}`, !o["Proxy-Connection"]) {
          o["Proxy-Connection"] = this.keepAlive ? "Keep-Alive" : "close";
        }
        for (let d of Object.keys(o)) {
          i += `${d}: ${o[d]}\r
`;
        }
        let a = (0, x9u.parseProxyResponse)(r);
        r.write(`${i}\r
`);
        let {
          connect: l,
          buffered: c
        } = await a;
        if (e.emit("proxyConnect", l), this.emit("proxyConnect", l, e), l.statusCode === 200) {
          if (e.once("socket", k9u), t.secureEndpoint) {
            rNt("Upgrading socket connection to TLS");
            return bDs.connect({
              ...TDs(SDs(t), "host", "path", "port"),
              socket: r
            });
          }
          return r;
        }
        r.destroy();
        let u = new Kyn.Socket({
          writable: false
        });
        u.readable = true;
        e.once("socket", d => {
          rNt("Replaying proxy buffer for failed request");
          (0, v9u.default)(d.listenerCount("data") > 0);
          d.push(c);
          d.push(null);
        });
        return u;
      }
    }
    OLr.protocols = ["http", "https"];
    _Y.HttpsProxyAgent = OLr;
    function k9u(e) {
      e.resume();
    }
    function TDs(e, ...t) {
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