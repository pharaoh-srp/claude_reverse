  var hW = __commonJS(iNt => {
    var jDs = NDs();
    var qDs = HLr();
    var Qyn = require("http");
    var Zyn = require("https");
    var WDs = require("stream");
    var jLr = require("http2");
    var z9u = ["ECONNRESET", "EPIPE", "ETIMEDOUT"];
    var GDs = e => {
      let t = {};
      for (let n of Object.keys(e)) {
        let r = e[n];
        t[n] = Array.isArray(r) ? r.join(",") : r;
      }
      return t;
    };
    var Aj = {
      setTimeout: (e, t) => setTimeout(e, t),
      clearTimeout: e => clearTimeout(e)
    };
    var K9u = (e, t, n = 0) => {
      if (!n) {
        return -1;
      }
      let r = o => {
        let s = Aj.setTimeout(() => {
          e.destroy();
          t(Object.assign(Error(`@smithy/node-http-handler - the request socket did not establish a connection with the server within the configured timeout of ${n} ms.`), {
            name: "TimeoutError"
          }));
        }, n - o);
        let i = a => {
          if (a?.connecting) {
            a.on("connect", () => {
              Aj.clearTimeout(s);
            });
          } else {
            Aj.clearTimeout(s);
          }
        };
        if (e.socket) {
          i(e.socket);
        } else {
          e.on("socket", i);
        }
      };
      if (n < 2000) {
        r(0);
        return 0;
      }
      return Aj.setTimeout(r.bind(null, 1000), 1000);
    };
    var Y9u = (e, t, n = 0, r, o) => {
      if (n) {
        return Aj.setTimeout(() => {
          let s = `@smithy/node-http-handler - [${r ? "ERROR" : "WARN"}] a request has exceeded the configured ${n} ms requestTimeout.`;
          if (r) {
            let i = Object.assign(Error(s), {
              name: "TimeoutError",
              code: "ETIMEDOUT"
            });
            e.destroy(i);
            t(i);
          } else {
            s += " Init client requestHandler with throwOnRequestTimeout=true to turn this into an error.";
            o?.warn?.(s);
          }
        }, n);
      }
      return -1;
    };
    var X9u = (e, {
      keepAlive: t,
      keepAliveMsecs: n
    }, r = 3000) => {
      if (t !== true) {
        return -1;
      }
      let o = () => {
        if (e.socket) {
          e.socket.setKeepAlive(t, n || 0);
        } else {
          e.on("socket", s => {
            s.setKeepAlive(t, n || 0);
          });
        }
      };
      if (r === 0) {
        o();
        return 0;
      }
      return Aj.setTimeout(o, r);
    };
    var Q9u = (e, t, n = 0) => {
      let r = o => {
        let s = n - o;
        let i = () => {
          e.destroy();
          t(Object.assign(Error(`@smithy/node-http-handler - the request socket timed out after ${n} ms of inactivity (configured by client requestHandler).`), {
            name: "TimeoutError"
          }));
        };
        if (e.socket) {
          e.socket.setTimeout(s, i);
          e.on("close", () => e.socket?.removeListener("timeout", i));
        } else {
          e.setTimeout(s, i);
        }
      };
      if (0 < n && n < 6000) {
        r(0);
        return 0;
      }
      return Aj.setTimeout(r.bind(null, n === 0 ? 0 : 3000), 3000);
    };
    async function VDs(e, t, n = 6000, r = false) {
      let o = t.headers ?? {};
      let s = o.Expect || o.expect;
      let i = -1;
      let a = true;
      if (!r && s === "100-continue") {
        a = await Promise.race([new Promise(l => {
          i = Number(Aj.setTimeout(() => l(true), Math.max(6000, n)));
        }), new Promise(l => {
          e.on("continue", () => {
            Aj.clearTimeout(i);
            l(true);
          });
          e.on("response", () => {
            Aj.clearTimeout(i);
            l(false);
          });
          e.on("error", () => {
            Aj.clearTimeout(i);
            l(false);
          });
        })]);
      }
      if (a) {
        Z9u(e, t.body);
      }
    }
    function Z9u(e, t) {
      if (t instanceof WDs.Readable) {
        t.pipe(e);
        return;
      }
      if (t) {
        if (Buffer.isBuffer(t) || typeof t === "string") {
          e.end(t);
          return;
        }
        let n = t;
        if (typeof n === "object" && n.buffer && typeof n.byteOffset === "number" && typeof n.byteLength === "number") {
          e.end(Buffer.from(n.buffer, n.byteOffset, n.byteLength));
          return;
        }
        e.end(Buffer.from(t));
        return;
      }
      e.end();
    }
    class e_n {
      config;
      configProvider;
      socketWarningTimestamp = 0;
      externalAgent = false;
      metadata = {
        handlerProtocol: "http/1.1"
      };
      static create(e) {
        if (typeof e?.handle === "function") {
          return e;
        }
        return new e_n(e);
      }
      static checkSocketUsage(e, t, n = console) {
        let {
          sockets: r,
          requests: o,
          maxSockets: s
        } = e;
        if (typeof s !== "number" || s === 1 / 0) {
          return t;
        }
        let i = 15000;
        if (Date.now() - i < t) {
          return t;
        }
        if (r && o) {
          for (let a in r) {
            let l = r[a]?.length ?? 0;
            let c = o[a]?.length ?? 0;
            if (l >= s && c >= 2 * s) {
              n?.warn?.(`@smithy/node-http-handler:WARN - socket usage at capacity=${l} and ${c} additional requests are enqueued.
See https://docs.aws.amazon.com/sdk-for-javascript/v3/developer-guide/node-configuring-maxsockets.html
or increase socketAcquisitionWarningTimeout=(millis) in the NodeHttpHandler config.`);
              return Date.now();
            }
          }
        }
        return t;
      }
      constructor(e) {
        this.configProvider = new Promise((t, n) => {
          if (typeof e === "function") {
            e().then(r => {
              t(this.resolveDefaultConfig(r));
            }).catch(n);
          } else {
            t(this.resolveDefaultConfig(e));
          }
        });
      }
      resolveDefaultConfig(e) {
        let {
          requestTimeout: t,
          connectionTimeout: n,
          socketTimeout: r,
          socketAcquisitionWarningTimeout: o,
          httpAgent: s,
          httpsAgent: i,
          throwOnRequestTimeout: a
        } = e || {};
        let l = true;
        let c = 50;
        return {
          connectionTimeout: n,
          requestTimeout: t,
          socketTimeout: r,
          socketAcquisitionWarningTimeout: o,
          throwOnRequestTimeout: a,
          httpAgent: (() => {
            if (s instanceof Qyn.Agent || typeof s?.destroy === "function") {
              this.externalAgent = true;
              return s;
            }
            return new Qyn.Agent({
              keepAlive: true,
              maxSockets: 50,
              ...s
            });
          })(),
          httpsAgent: (() => {
            if (i instanceof Zyn.Agent || typeof i?.destroy === "function") {
              this.externalAgent = true;
              return i;
            }
            return new Zyn.Agent({
              keepAlive: true,
              maxSockets: 50,
              ...i
            });
          })(),
          logger: console
        };
      }
      destroy() {
        this.config?.httpAgent?.destroy();
        this.config?.httpsAgent?.destroy();
      }
      async handle(e, {
        abortSignal: t,
        requestTimeout: n
      } = {}) {
        if (!this.config) {
          this.config = await this.configProvider;
        }
        return new Promise((r, o) => {
          let s = this.config;
          let i = undefined;
          let a = [];
          let l = async x => {
            await i;
            a.forEach(Aj.clearTimeout);
            r(x);
          };
          let c = async x => {
            await i;
            a.forEach(Aj.clearTimeout);
            o(x);
          };
          if (t?.aborted) {
            let x = Error("Request aborted");
            x.name = "AbortError";
            c(x);
            return;
          }
          let u = e.protocol === "https:";
          let d = e.headers ?? {};
          let p = (d.Expect ?? d.expect) === "100-continue";
          let m = u ? s.httpsAgent : s.httpAgent;
          if (p && !this.externalAgent) {
            m = new (u ? Zyn.Agent : Qyn.Agent)({
              keepAlive: false,
              maxSockets: 1 / 0
            });
          }
          a.push(Aj.setTimeout(() => {
            this.socketWarningTimestamp = e_n.checkSocketUsage(m, this.socketWarningTimestamp, s.logger);
          }, s.socketAcquisitionWarningTimeout ?? (s.requestTimeout ?? 2000) + (s.connectionTimeout ?? 1000)));
          let f = qDs.buildQueryString(e.query || {});
          let h = undefined;
          if (e.username != null || e.password != null) {
            let x = e.username ?? "";
            let A = e.password ?? "";
            h = `${x}:${A}`;
          }
          let g = e.path;
          if (f) {
            g += `?${f}`;
          }
          if (e.fragment) {
            g += `#${e.fragment}`;
          }
          let y = e.hostname ?? "";
          if (y[0] === "[" && y.endsWith("]")) {
            y = e.hostname.slice(1, -1);
          } else {
            y = e.hostname;
          }
          let _ = {
            headers: e.headers,
            host: y,
            method: e.method,
            path: g,
            port: e.port,
            agent: m,
            auth: h
          };
          let S = (u ? Zyn.request : Qyn.request)(_, x => {
            let A = new jDs.HttpResponse({
              statusCode: x.statusCode || -1,
              reason: x.statusMessage,
              headers: GDs(x.headers),
              body: x
            });
            l({
              response: A
            });
          });
          if (S.on("error", x => {
            if (z9u.includes(x.code)) {
              c(Object.assign(x, {
                name: "TimeoutError"
              }));
            } else {
              c(x);
            }
          }), t) {
            let x = () => {
              S.destroy();
              let A = Error("Request aborted");
              A.name = "AbortError";
              c(A);
            };
            if (typeof t.addEventListener === "function") {
              let A = t;
              A.addEventListener("abort", x, {
                once: true
              });
              S.once("close", () => A.removeEventListener("abort", x));
            } else {
              t.onabort = x;
            }
          }
          let E = n ?? s.requestTimeout;
          a.push(K9u(S, c, s.connectionTimeout));
          a.push(Y9u(S, c, E, s.throwOnRequestTimeout, s.logger ?? console));
          a.push(Q9u(S, c, s.socketTimeout));
          let C = _.agent;
          if (typeof C === "object" && "keepAlive" in C) {
            a.push(X9u(S, {
              keepAlive: C.keepAlive,
              keepAliveMsecs: C.keepAliveMsecs
            }));
          }
          i = VDs(S, e, E, this.externalAgent).catch(x => (a.forEach(Aj.clearTimeout), o(x)));
        });
      }
      updateHttpClientConfig(e, t) {
        this.config = undefined;
        this.configProvider = this.configProvider.then(n => ({
          ...n,
          [e]: t
        }));
      }
      httpHandlerConfigs() {
        return this.config ?? {};
      }
    }
    class zDs {
      sessions = [];
      constructor(e) {
        this.sessions = e ?? [];
      }
      poll() {
        if (this.sessions.length > 0) {
          return this.sessions.shift();
        }
      }
      offerLast(e) {
        this.sessions.push(e);
      }
      contains(e) {
        return this.sessions.includes(e);
      }
      remove(e) {
        this.sessions = this.sessions.filter(t => t !== e);
      }
      [Symbol.iterator]() {
        return this.sessions[Symbol.iterator]();
      }
      destroy(e) {
        for (let t of this.sessions) {
          if (t === e) {
            if (!t.destroyed) {
              t.destroy();
            }
          }
        }
      }
    }
    class KDs {
      constructor(e) {
        if (this.config = e, this.config.maxConcurrency && this.config.maxConcurrency <= 0) {
          throw RangeError("maxConcurrency must be greater than zero.");
        }
      }
      config;
      sessionCache = new Map();
      lease(e, t) {
        let n = this.getUrlString(e);
        let r = this.sessionCache.get(n);
        if (r) {
          let a = r.poll();
          if (a && !this.config.disableConcurrency) {
            return a;
          }
        }
        let o = jLr.connect(n);
        if (this.config.maxConcurrency) {
          o.settings({
            maxConcurrentStreams: this.config.maxConcurrency
          }, a => {
            if (a) {
              throw Error("Fail to set maxConcurrentStreams to " + this.config.maxConcurrency + "when creating new session for " + e.destination.toString());
            }
          });
        }
        o.unref();
        let s = () => {
          o.destroy();
          this.deleteSession(n, o);
        };
        if (o.on("goaway", s), o.on("error", s), o.on("frameError", s), o.on("close", () => this.deleteSession(n, o)), t.requestTimeout) {
          o.setTimeout(t.requestTimeout, s);
        }
        let i = this.sessionCache.get(n) || new zDs();
        i.offerLast(o);
        this.sessionCache.set(n, i);
        return o;
      }
      deleteSession(e, t) {
        let n = this.sessionCache.get(e);
        if (!n) {
          return;
        }
        if (!n.contains(t)) {
          return;
        }
        n.remove(t);
        this.sessionCache.set(e, n);
      }
      release(e, t) {
        let n = this.getUrlString(e);
        this.sessionCache.get(n)?.offerLast(t);
      }
      destroy() {
        for (let [e, t] of this.sessionCache) {
          for (let n of t) {
            if (!n.destroyed) {
              n.destroy();
            }
            t.remove(n);
          }
          this.sessionCache.delete(e);
        }
      }
      setMaxConcurrentStreams(e) {
        if (e && e <= 0) {
          throw RangeError("maxConcurrentStreams must be greater than zero.");
        }
        this.config.maxConcurrency = e;
      }
      setDisableConcurrentStreams(e) {
        this.config.disableConcurrency = e;
      }
      getUrlString(e) {
        return e.destination.toString();
      }
    }
    class qLr {
      config;
      configProvider;
      metadata = {
        handlerProtocol: "h2"
      };
      connectionManager = new KDs({});
      static create(e) {
        if (typeof e?.handle === "function") {
          return e;
        }
        return new qLr(e);
      }
      constructor(e) {
        this.configProvider = new Promise((t, n) => {
          if (typeof e === "function") {
            e().then(r => {
              t(r || {});
            }).catch(n);
          } else {
            t(e || {});
          }
        });
      }
      destroy() {
        this.connectionManager.destroy();
      }
      async handle(e, {
        abortSignal: t,
        requestTimeout: n
      } = {}) {
        if (!this.config) {
          if (this.config = await this.configProvider, this.connectionManager.setDisableConcurrentStreams(this.config.disableConcurrentStreams || false), this.config.maxConcurrentStreams) {
            this.connectionManager.setMaxConcurrentStreams(this.config.maxConcurrentStreams);
          }
        }
        let {
          requestTimeout: r,
          disableConcurrentStreams: o
        } = this.config;
        let s = n ?? r;
        return new Promise((i, a) => {
          let l = false;
          let c = undefined;
          let u = async k => {
            await c;
            i(k);
          };
          let d = async k => {
            await c;
            a(k);
          };
          if (t?.aborted) {
            l = true;
            let k = Error("Request aborted");
            k.name = "AbortError";
            d(k);
            return;
          }
          let {
            hostname: p,
            method: m,
            port: f,
            protocol: h,
            query: g
          } = e;
          let y = "";
          if (e.username != null || e.password != null) {
            let k = e.username ?? "";
            let I = e.password ?? "";
            y = `${k}:${I}@`;
          }
          let _ = `${h}//${y}${p}${f ? `:${f}` : ""}`;
          let b = {
            destination: new URL(_)
          };
          let S = this.connectionManager.lease(b, {
            requestTimeout: this.config?.sessionTimeout,
            disableConcurrentStreams: o || false
          });
          let E = k => {
            if (o) {
              this.destroySession(S);
            }
            l = true;
            d(k);
          };
          let C = qDs.buildQueryString(g || {});
          let x = e.path;
          if (C) {
            x += `?${C}`;
          }
          if (e.fragment) {
            x += `#${e.fragment}`;
          }
          let A = S.request({
            ...e.headers,
            [jLr.constants.HTTP2_HEADER_PATH]: x,
            [jLr.constants.HTTP2_HEADER_METHOD]: m
          });
          if (S.ref(), A.on("response", k => {
            let I = new jDs.HttpResponse({
              statusCode: k[":status"] || -1,
              headers: GDs(k),
              body: A
            });
            if (l = true, u({
              response: I
            }), o) {
              S.close();
              this.connectionManager.deleteSession(_, S);
            }
          }), s) {
            A.setTimeout(s, () => {
              A.close();
              let k = Error(`Stream timed out because of no activity for ${s} ms`);
              k.name = "TimeoutError";
              E(k);
            });
          }
          if (t) {
            let k = () => {
              A.close();
              let I = Error("Request aborted");
              I.name = "AbortError";
              E(I);
            };
            if (typeof t.addEventListener === "function") {
              let I = t;
              I.addEventListener("abort", k, {
                once: true
              });
              A.once("close", () => I.removeEventListener("abort", k));
            } else {
              t.onabort = k;
            }
          }
          A.on("frameError", (k, I, O) => {
            E(Error(`Frame type id ${k} in stream id ${O} has failed with code ${I}.`));
          });
          A.on("error", E);
          A.on("aborted", () => {
            E(Error(`HTTP/2 stream is abnormally aborted in mid-communication with result code ${A.rstCode}.`));
          });
          A.on("close", () => {
            if (S.unref(), o) {
              S.destroy();
            }
            if (!l) {
              E(Error("Unexpected error: http2 request did not get a response"));
            }
          });
          c = VDs(A, e, s);
        });
      }
      updateHttpClientConfig(e, t) {
        this.config = undefined;
        this.configProvider = this.configProvider.then(n => ({
          ...n,
          [e]: t
        }));
      }
      httpHandlerConfigs() {
        return this.config ?? {};
      }
      destroySession(e) {
        if (!e.destroyed) {
          e.destroy();
        }
      }
    }
    class YDs extends WDs.Writable {
      bufferedBytes = [];
      _write(e, t, n) {
        this.bufferedBytes.push(e);
        n();
      }
    }
    var t5u = e => {
      if (n5u(e)) {
        return r5u(e);
      }
      return new Promise((t, n) => {
        let r = new YDs();
        e.pipe(r);
        e.on("error", o => {
          r.end();
          n(o);
        });
        r.on("error", n);
        r.on("finish", function () {
          let o = new Uint8Array(Buffer.concat(this.bufferedBytes));
          t(o);
        });
      });
    };
    var n5u = e => typeof ReadableStream === "function" && e instanceof ReadableStream;
    async function r5u(e) {
      let t = [];
      let n = e.getReader();
      let r = false;
      let o = 0;
      while (!r) {
        let {
          done: a,
          value: l
        } = await n.read();
        if (l) {
          t.push(l);
          o += l.length;
        }
        r = a;
      }
      let s = new Uint8Array(o);
      let i = 0;
      for (let a of t) {
        s.set(a, i);
        i += a.length;
      }
      return s;
    }
    iNt.DEFAULT_REQUEST_TIMEOUT = 0;
    iNt.NodeHttp2Handler = qLr;
    iNt.NodeHttpHandler = e_n;
    iNt.streamCollector = t5u;
  });