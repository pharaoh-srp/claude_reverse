  var R1s = __commonJS(T_n => {
    Object.defineProperty(T_n, "__esModule", {
      value: true
    });
    T_n.getAwsChunkedEncodingStream = undefined;
    var c6u = require("stream");
    var u6u = (e, t) => {
      let {
        base64Encoder: n,
        bodyLengthChecker: r,
        checksumAlgorithmFn: o,
        checksumLocationName: s,
        streamHasher: i
      } = t;
      let a = n !== undefined && o !== undefined && s !== undefined && i !== undefined;
      let l = a ? i(o, e) : undefined;
      let c = new c6u.Readable({
        read: () => {}
      });
      e.on("data", u => {
        let d = r(u) || 0;
        c.push(`${d.toString(16)}\r
`);
        c.push(u);
        c.push(`\r
`);
      });
      e.on("end", async () => {
        if (c.push(`0\r
`), a) {
          let u = n(await l);
          c.push(`${s}:${u}\r
`);
          c.push(`\r
`);
        }
        c.push(null);
      });
      return c;
    };
    T_n.getAwsChunkedEncodingStream = u6u;
  });
  var x1s = __commonJS(dFr => {
    Object.defineProperty(dFr, "__esModule", {
      value: true
    });
    dFr.headStream = d6u;
    async function d6u(e, t) {
      let n = 0;
      let r = [];
      let o = e.getReader();
      let s = false;
      while (!s) {
        let {
          done: l,
          value: c
        } = await o.read();
        if (c) {
          r.push(c);
          n += c?.byteLength ?? 0;
        }
        if (n >= t) {
          break;
        }
        s = l;
      }
      o.releaseLock();
      let i = new Uint8Array(Math.min(t, n));
      let a = 0;
      for (let l of r) {
        if (l.byteLength > i.byteLength - a) {
          i.set(l.subarray(0, i.byteLength - a), a);
          break;
        } else {
          i.set(l, a);
        }
        a += l.length;
      }
      return i;
    }
  });
  var A1s = __commonJS(E_n => {
    Object.defineProperty(E_n, "__esModule", {
      value: true
    });
    E_n.headStream = undefined;
    var p6u = require("stream");
    var m6u = x1s();
    var f6u = tAe();
    var h6u = (e, t) => {
      if ((0, f6u.isReadableStream)(e)) {
        return (0, m6u.headStream)(e, t);
      }
      return new Promise((n, r) => {
        let o = new k1s();
        o.limit = t;
        e.pipe(o);
        e.on("error", s => {
          o.end();
          r(s);
        });
        o.on("error", r);
        o.on("finish", function () {
          let s = new Uint8Array(Buffer.concat(this.buffers));
          n(s);
        });
      });
    };
    E_n.headStream = h6u;
    class k1s extends p6u.Writable {
      buffers = [];
      limit = 1 / 0;
      bytesBuffered = 0;
      _write(e, t, n) {
        if (this.buffers.push(e), this.bytesBuffered += e.byteLength ?? 0, this.bytesBuffered >= this.limit) {
          let r = this.bytesBuffered - this.limit;
          let o = this.buffers[this.buffers.length - 1];
          this.buffers[this.buffers.length - 1] = o.subarray(0, o.byteLength - r);
          this.emit("finish");
        }
        n();
      }
    }
  });
  var I1s = __commonJS(XE => {
    XE.HttpAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(XE.HttpAuthLocation || (XE.HttpAuthLocation = {}));
    XE.HttpApiKeyAuthLocation = undefined;
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(XE.HttpApiKeyAuthLocation || (XE.HttpApiKeyAuthLocation = {}));
    XE.EndpointURLScheme = undefined;
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(XE.EndpointURLScheme || (XE.EndpointURLScheme = {}));
    XE.AlgorithmId = undefined;
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(XE.AlgorithmId || (XE.AlgorithmId = {}));
    var g6u = e => {
      let t = [];
      if (e.sha256 !== undefined) {
        t.push({
          algorithmId: () => XE.AlgorithmId.SHA256,
          checksumConstructor: () => e.sha256
        });
      }
      if (e.md5 != null) {
        t.push({
          algorithmId: () => XE.AlgorithmId.MD5,
          checksumConstructor: () => e.md5
        });
      }
      return {
        addChecksumAlgorithm(n) {
          t.push(n);
        },
        checksumAlgorithms() {
          return t;
        }
      };
    };
    var y6u = e => {
      let t = {};
      e.checksumAlgorithms().forEach(n => {
        t[n.algorithmId()] = n.checksumConstructor();
      });
      return t;
    };
    var _6u = e => g6u(e);
    var b6u = e => y6u(e);
    XE.FieldPosition = undefined;
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(XE.FieldPosition || (XE.FieldPosition = {}));
    XE.IniSectionType = undefined;
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(XE.IniSectionType || (XE.IniSectionType = {}));
    XE.RequestHandlerProtocol = undefined;
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(XE.RequestHandlerProtocol || (XE.RequestHandlerProtocol = {}));
    XE.SMITHY_CONTEXT_KEY = "__smithy_context";
    XE.getDefaultExtensionConfiguration = _6u;
    XE.resolveDefaultRuntimeConfig = b6u;
  });
  var M1s = __commonJS(nAe => {
    var T6u = I1s();
    var E6u = e => ({
      setHttpHandler(t) {
        e.httpHandler = t;
      },
      httpHandler() {
        return e.httpHandler;
      },
      updateHttpClientConfig(t, n) {
        e.httpHandler?.updateHttpClientConfig(t, n);
      },
      httpHandlerConfigs() {
        return e.httpHandler.httpHandlerConfigs();
      }
    });
    var v6u = e => ({
      httpHandler: e.httpHandler()
    });
    class P1s {
      name;
      kind;
      values;
      constructor({
        name: e,
        kind: t = T6u.FieldPosition.HEADER,
        values: n = []
      }) {
        this.name = e;
        this.kind = t;
        this.values = n;
      }
      add(e) {
        this.values.push(e);
      }
      set(e) {
        this.values = e;
      }
      remove(e) {
        this.values = this.values.filter(t => t !== e);
      }
      toString() {
        return this.values.map(e => e.includes(",") || e.includes(" ") ? `"${e}"` : e).join(", ");
      }
      get() {
        return this.values;
      }
    }
    class O1s {
      entries = {};
      encoding;
      constructor({
        fields: e = [],
        encoding: t = "utf-8"
      }) {
        e.forEach(this.setField.bind(this));
        this.encoding = t;
      }
      setField(e) {
        this.entries[e.name.toLowerCase()] = e;
      }
      getField(e) {
        return this.entries[e.toLowerCase()];
      }
      removeField(e) {
        delete this.entries[e.toLowerCase()];
      }
      getByType(e) {
        return Object.values(this.entries).filter(t => t.kind === e);
      }
    }
    class v_n {
      method;
      protocol;
      hostname;
      port;
      path;
      query;
      headers;
      username;
      password;
      fragment;
      body;
      constructor(e) {
        this.method = e.method || "GET";
        this.hostname = e.hostname || "localhost";
        this.port = e.port;
        this.query = e.query || {};
        this.headers = e.headers || {};
        this.body = e.body;
        this.protocol = e.protocol ? e.protocol.slice(-1) !== ":" ? `${e.protocol}:` : e.protocol : "https:";
        this.path = e.path ? e.path.charAt(0) !== "/" ? `/${e.path}` : e.path : "/";
        this.username = e.username;
        this.password = e.password;
        this.fragment = e.fragment;
      }
      static clone(e) {
        let t = new v_n({
          ...e,
          headers: {
            ...e.headers
          }
        });
        if (t.query) {
          t.query = w6u(t.query);
        }
        return t;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return "method" in t && "protocol" in t && "hostname" in t && "path" in t && typeof t.query === "object" && typeof t.headers === "object";
      }
      clone() {
        return v_n.clone(this);
      }
    }
    function w6u(e) {
      return Object.keys(e).reduce((t, n) => {
        let r = e[n];
        return {
          ...t,
          [n]: Array.isArray(r) ? [...r] : r
        };
      }, {});
    }
    class D1s {
      statusCode;
      reason;
      headers;
      body;
      constructor(e) {
        this.statusCode = e.statusCode;
        this.reason = e.reason;
        this.headers = e.headers || {};
        this.body = e.body;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return typeof t.statusCode === "number" && typeof t.headers === "object";
      }
    }
    function C6u(e) {
      return /^[a-z0-9][a-z0-9\.\-]*[a-z0-9]$/.test(e);
    }
    nAe.Field = P1s;
    nAe.Fields = O1s;
    nAe.HttpRequest = v_n;
    nAe.HttpResponse = D1s;
    nAe.getHttpHandlerExtensionConfiguration = E6u;
    nAe.isValidHostname = C6u;
    nAe.resolveHttpHandlerRuntimeConfig = v6u;
  });
  var L1s = __commonJS(N1s => {
    var R6u = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    N1s.isArrayBuffer = R6u;
  });
  var fFr = __commonJS(mFr => {
    var x6u = L1s();
    var pFr = require("buffer");
    var k6u = (e, t = 0, n = e.byteLength - t) => {
      if (!x6u.isArrayBuffer(e)) {
        throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
      }
      return pFr.Buffer.from(e, t, n);
    };
    var A6u = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
      }
      return t ? pFr.Buffer.from(e, t) : pFr.Buffer.from(e);
    };
    mFr.fromArrayBuffer = k6u;
    mFr.fromString = A6u;
  });
  var F1s = __commonJS(w_n => {
    Object.defineProperty(w_n, "__esModule", {
      value: true
    });
    w_n.fromBase64 = undefined;
    var I6u = fFr();
    var O6u = e => {
      if (e.length * 3 % 4 !== 0) {
        throw TypeError("Incorrect padding on base64 string.");
      }
      if (!(/^[A-Za-z0-9+/]*={0,2}$/).exec(e)) {
        throw TypeError("Invalid base64 string.");
      }
      let t = (0, I6u.fromString)(e, "base64");
      return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
    };
    w_n.fromBase64 = O6u;
  });