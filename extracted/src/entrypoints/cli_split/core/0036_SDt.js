    MDr.exports.wrap = Iws;
  });
  function SDt(e) {
    let t = /^([-+\w]{1,25})(:?\/\/|:)/.exec(e);
    return t && t[1] || "";
  }
  function NDr(e, t, n) {
    let r = n && n.Blob || L_.classes.Blob;
    let o = SDt(e);
    if (t === undefined && r) {
      t = true;
    }
    if (o === "data") {
      e = o.length ? e.slice(o.length + 1) : e;
      let s = hIu.exec(e);
      if (!s) {
        throw new WB("Invalid URL", WB.ERR_INVALID_URL);
      }
      let i = s[1];
      let a = s[2];
      let l = s[3];
      let c = Buffer.from(decodeURIComponent(l), a ? "base64" : "utf8");
      if (t) {
        if (!r) {
          throw new WB("Blob is not supported", WB.ERR_NOT_SUPPORT);
        }
        return new r([c], {
          type: i
        });
      }
      return c;
    }
    throw new WB("Unsupported protocol " + o, WB.ERR_NOT_SUPPORT);
  }
  var hIu;
  var Mws = __lazy(() => {
    Dte();
    hIu = /^(?:([^;]+);)?(?:[^;]+;)?(base64|),([\s\S]*)$/;
  });
  var Nws;
  var LDr;
  var Lws;
  var Uws;
  var gIu = async function* (e) {
    if (e.stream) {
      yield* e.stream();
    } else if (e.arrayBuffer) {
      yield await e.arrayBuffer();
    } else if (e[Uws]) {
      yield* e[Uws]();
    } else {
      yield e;
    }
  };
  class Hws {
    constructor(e, t) {
      let {
        escapeName: n
      } = this.constructor;
      let r = cr.isString(t);
      let o = `Content-Disposition: form-data; name="${n(e)}"${!r && t.name ? `; filename="${n(t.name)}"` : ""}${qHe}`;
      if (r) {
        t = TDt.HS(String(t).replace(/\r?\n|\r\n?/g, qHe));
      } else {
        let s = String(t.type || "application/octet-stream").replace(/[\r\n]/g, "");
        o += `Content-Type: ${s}${qHe}`;
      }
      this.headers = TDt.HS(o + qHe);
      this.contentLength = r ? t.byteLength : t.size;
      this.size = this.headers.byteLength + this.contentLength + 2;
      this.name = e;
      this.value = t;
    }
    async *HS() {
      yield this.headers;
      let {
        value: e
      } = this;
      if (cr.isTypedArray(e)) {
        yield e;
      } else {
        yield* gIu(e);
      }
      yield _Iu;
    }
    static escapeName(e) {
      return String(e).replace(/[\r\n"]/g, t => ({
        "\r": "%0D",
        "\n": "%0A",
        '"': "%22"
      })[t]);
    }
  }
  var Bws;
  var $ws;
  var yIu;
  var TDt;
  var qHe = `\r
`;
  var _Iu;
  var SIu = (e, t, n) => {
    let {
      tag: r = "form-data-boundary",
      size: o = 25,
      boundary: s = r + "-" + L_.generateString(o, yIu)
    } = n || {};
    if (!cr.isFormData(e)) {
      throw TypeError("FormData instance required");
    }
    if (s.length < 1 || s.length > 70) {
      throw Error("boundary must be 10-70 characters long");
    }
    let i = TDt.HS("--" + s + qHe);
    let a = TDt.HS("--" + s + "--" + qHe);
    let l = a.byteLength;
    let c = Array.from(e.entries()).map(([d, p]) => {
      let m = new Hws(d, p);
      l += m.size;
      return m;
    });
    l += i.byteLength * c.length;
    l = cr.toFiniteNumber(l);
    let u = {
      "Content-Type": `multipart/form-data; boundary=${s}`
    };
    if (Number.isFinite(l)) {
      u["Content-Length"] = l;
    }
    t && t(u);
    return $ws.Readable.from(async function* () {
      for (let d of c) {
        yield i;
        yield* d.HS();
      }
      yield a;
    }());
  };
  var Wws;
  var Gws;
  var TIu = (e, t) => cr.isAsyncFn(e) ? function (...n) {
    let r = n.pop();
    e.apply(this, n).then(o => {
      try {
        t ? r(null, ...t(o)) : r(null, o);
      } catch (s) {
        r(s);
      }
    }, r);
  } : e;
  function BDr(e) {
    let t;
    try {
      t = new URL(e);
    } catch (s) {
      return false;
    }
    let n = (process.env.no_proxy || process.env.NO_PROXY || "").toLowerCase();
    if (!n) {
      return false;
    }
    if (n === "*") {
      return true;
    }
    let r = Number.parseInt(t.port, 10) || wIu[t.protocol.split(":", 1)[0]] || 0;
    let o = Xws(t.hostname.toLowerCase());
    return n.split(/[\s,]+/).some(s => {
      if (!s) {
        return false;
      }
      let [i, a] = CIu(s);
      if (i = Xws(i), !i) {
        return false;
      }
      if (a && a !== r) {
        return false;
      }
      if (i.charAt(0) === "*") {
        i = i.slice(1);
      }
      if (i.charAt(0) === ".") {
        return o.endsWith(i);
      }
      return o === i || Jws(o) && Jws(i);
    });
  }
  var EIu;
  var Qws = e => {
    let t = e.split(".");
    if (t.length !== 4) {
      return false;
    }
    if (t[0] !== "127") {
      return false;
    }
    return t.every(n => /^\d+$/.test(n) && Number(n) >= 0 && Number(n) <= 255);
  };
  var vIu = e => {
    if (e === "::1") {
      return true;
    }
    let t = e.match(/^::ffff:(\d+\.\d+\.\d+\.\d+)$/i);
    if (t) {
      return Qws(t[1]);
    }
    let n = e.match(/^::ffff:([0-9a-f]{1,4}):([0-9a-f]{1,4})$/i);
    if (n) {
      let o = parseInt(n[1], 16);
      return o >= 32512 && o <= 32767;
    }
    let r = e.split(":");
    if (r.length === 8) {
      for (let o = 0; o < 7; o++) {
        if (!/^0+$/.test(r[o])) {
          return false;
        }
      }
      return /^0*1$/.test(r[7]);
    }
    return false;
  };
  var Jws = e => {
    if (!e) {
      return false;
    }
    if (EIu.vZc(e)) {
      return true;
    }
    if (Qws(e)) {
      return true;
    }
    return vIu(e);
  };
  var wIu;
  var CIu = e => {
    let t = e;
    let n = 0;
    if (t.charAt(0) === "[") {
      let s = t.indexOf("]");
      if (s !== -1) {
        let i = t.slice(1, s);
        let a = t.slice(s + 1);
        if (a.charAt(0) === ":" && /^\d+$/.test(a.slice(1))) {
          n = Number.parseInt(a.slice(1), 10);
        }
        return [i, n];
      }
    }
    let r = t.indexOf(":");
    let o = t.lastIndexOf(":");
    if (r !== -1 && r === o && /^\d+$/.test(t.slice(o + 1))) {
      n = Number.parseInt(t.slice(o + 1), 10);
      t = t.slice(0, o);
    }
    return [t, n];
  };
  var Xws = e => {
    if (!e) {
      return e;
    }
    if (e.charAt(0) === "[" && e.charAt(e.length - 1) === "]") {
      e = e.slice(1, -1);
    }
    return e.replace(/\.+$/, "");
  };
  var Zws = __lazy(() => {
    EIu = new Set(["localhost"]);
    wIu = {
      http: 80,
      https: 443,
      ws: 80,
      wss: 443,
      ftp: 21
    };
  });
  function RIu(e, t) {
    e = e || 10;
    let n = Array(e);
    let r = Array(e);
    let o = 0;
    let s = 0;
    let i;
    t = t !== undefined ? t : 1000;
    return function (l) {
      let c = Date.now();
      let u = r[s];
      if (!i) {
        i = c;
      }
      n[o] = l;
      r[o] = c;
      let d = s;
      let p = 0;
      while (d !== o) {
        p += n[d++];
        d = d % e;
      }
      if (o = (o + 1) % e, o === s) {
        s = (s + 1) % e;
      }
      if (c - i < t) {
        return;
      }
      let m = u && c - u;
      return m ? Math.round(p * 1000 / m) : undefined;
    };
  }
  function xIu(e, t) {
    let n = 0;
    let r = 1000 / t;
    let o;
    let s;
    let i = (c, u = Date.now()) => {
      if (n = u, o = null, s) {
        clearTimeout(s);
        s = null;
      }
      e(...c);
    };
    return [(...c) => {
      let u = Date.now();
      let d = u - n;
      if (d >= r) {
        i(c, u);
      } else if (o = c, !s) {
        s = setTimeout(() => {
          s = null;
          i(o);
        }, r - d);
      }
    }, () => o && i(o)];
  }
  var _ye = (e, t, n = 3) => {
    let r = 0;
    let o = RIu(50, 250);
    return xIu(s => {
      let i = s.loaded;
      let a = s.lengthComputable ? s.total : undefined;
      let l = a != null ? Math.min(i, a) : i;
      let c = Math.max(0, l - r);
      let u = o(c);
      r = Math.max(r, l);
      let d = {
        loaded: l,
        total: a,
        progress: a ? l / a : undefined,
        bytes: c,
        rate: u ? u : undefined,
        estimated: u && a ? (a - l) / u : undefined,
        event: s,
        lengthComputable: a != null,
        [t ? "download" : "upload"]: true
      };
      e(d);
    }, n);
  };
  var Htt = (e, t) => {
    let n = e != null;
    return [r => t[0]({
      lengthComputable: n,
      total: e,
      loaded: r
    }), t[1]];
  };
  var jtt = e => (...t) => cr.asap(() => e(...t));
  var _hn = __lazy(() => {
    Qv();
  });
  function $Dr(e) {
    if (!e || typeof e !== "string") {
      return 0;
    }
    if (!e.startsWith("data:")) {
      return 0;
    }
    let t = e.indexOf(",");
    if (t < 0) {
      return 0;
    }
    let n = e.slice(5, t);
    let r = e.slice(t + 1);
    if (/;base64/i.test(n)) {
      let {
        length: s,
        length: i
      } = r;
      for (let p = 0; p < i; p++) {
        if (r.charCodeAt(p) === 37 && p + 2 < i) {
          let m = r.charCodeAt(p + 1);
          let f = r.charCodeAt(p + 2);
          if ((m >= 48 && m <= 57 || m >= 65 && m <= 70 || m >= 97 && m <= 102) && (f >= 48 && f <= 57 || f >= 65 && f <= 70 || f >= 97 && f <= 102)) {
            s -= 2;
            p += 2;
          }
        }
      }
      let a = 0;
      let l = i - 1;
      let c = p => p >= 2 && r.charCodeAt(p - 2) === 37 && r.charCodeAt(p - 1) === 51 && (r.charCodeAt(p) === 68 || r.charCodeAt(p) === 100);
      if (l >= 0) {
        if (r.charCodeAt(l) === 61) {
          a++;
          l--;
        } else if (c(l)) {
          a++;
          l -= 3;
        }
      }
      if (a === 1 && l >= 0) {
        if (r.charCodeAt(l) === 61) {
          a++;
        } else if (c(l)) {
          a++;
        }
      }
      let d = Math.floor(s / 4) * 3 - (a || 0);
      return d > 0 ? d : 0;
    }
    return Buffer.byteLength(r, "utf8");
  }
  class fCs {
    constructor() {
      this.sessions = Object.create(null);
    }
    getSession(e, t) {
      t = Object.assign({
        sessionTimeout: 1000
      }, t);
      let n = this.sessions[e];
      if (n) {
        let c = n.length;
        for (let u = 0; u < c; u++) {
          let [d, p] = n[u];
          if (!d.destroyed && !d.closed && qDr.default.isDeepStrictEqual(p, t)) {
            return d;
          }
        }
      }
      let r = jDr.default.connect(e, t);
      let o;
      let s = () => {
        if (o) {
          return;
        }
        o = true;
        let c = n;
        let u = c.length;
        let d = u;
        while (d--) {
          if (c[d][0] === r) {
            if (u === 1) {
              delete this.sessions[e];
            } else {
              c.splice(d, 1);
            }
            if (!r.closed) {
              r.close();
            }
            return;
          }
        }
      };
      let i = r.request;
      let {
        sessionTimeout: a
      } = t;
      if (a != null) {
        let c;
        let u = 0;
        r.request = function () {
          let d = i.apply(this, arguments);
          if (u++, c) {
            clearTimeout(c);
            c = null;
          }
          d.once("close", () => {
            if (! --u) {
              c = setTimeout(() => {
                c = null;
                s();
              }, a);
            }
          });
          return d;
        };
      }
      r.once("close", s);
      let l = [r, t];
      n ? n.push(l) : n = this.sessions[e] = [l];
      return r;
    }
  }
  function DIu(e, t) {
    if (e.beforeRedirects.proxy) {
      e.beforeRedirects.proxy(e);
    }
    if (e.beforeRedirects.config) {
      e.beforeRedirects.config(e, t);
    }
  }
  function hCs(e, t, n) {
    let r = t;
    if (!r && r !== false) {
      let o = gws(n);
      if (o) {
        if (!BDr(n)) {
          r = new URL(o);
        }
      }
    }
    if (r) {
      if (r.username) {
        r.auth = (r.username || "") + ":" + (r.password || "");
      }
      if (r.auth) {
        if (Boolean(r.auth.username || r.auth.password)) {
          r.auth = (r.auth.username || "") + ":" + (r.auth.password || "");
        } else if (typeof r.auth === "object") {
          throw new WB("Invalid proxy authorization", WB.ERR_BAD_OPTION, {
            proxy: r
          });
        }
        let i = Buffer.from(r.auth, "utf8").toString("base64");
        e.headers["Proxy-Authorization"] = "Basic " + i;
      }
      e.headers.host = e.hostname + (e.port ? ":" + e.port : "");
      let o = r.hostname || r.host;
      if (e.hostname = o, e.host = o, e.port = r.port, e.path = n, r.protocol) {
        e.protocol = r.protocol.includes(":") ? r.protocol : `${r.protocol}:`;
      }
    }
    e.beforeRedirects.proxy = function (s) {
      hCs(s, t, s.href);
    };
  }
  var uCs;
  var dCs;
  var jDr;
  var qDr;
  var HDr;
  var pCs;
  var bye;
  var J7;
  var mCs;
  var oCs;
  var kIu;
  var sCs;
  var AIu;
  var IIu;
  var PIu;
  var iCs;
  var bhn;
  var aCs;
  var lCs = (e, [t, n]) => (e.on("end", n).on("error", n), t);
  var OIu;
  var MIu;
  var NIu = e => new Promise((t, n) => {
    let r;
    let o;
    let s = (l, c) => {
      if (o) {
        return;
      }
      o = true;
      r && r(l, c);
    };
    let i = l => {
      s(l);
      t(l);
    };
    let a = l => {
      s(l, true);
      n(l);
    };
    e(i, a, l => r = l).catch(a);
  });
  var LIu = ({
    address: e,
    family: t
  }) => {
    if (!cr.isString(e)) {
      throw TypeError("address must be a string");
    }
    return {
      address: e,
      family: t || (e.indexOf(".") < 0 ? 6 : 4)
    };
  };
  var cCs = (e, t) => LIu(cr.isObject(e) ? e : {
    address: e,
    family: t
  });
  var FIu;
  var gCs;
  var yCs = __lazy(() => {
    Qv();
    chn();
    uhn();
    shn();
    yws();
    dDt();
    Dte();
    Mws();
    Zws();
    _hn();
    uCs = __toESM(require("http"));
    dCs = __toESM(require("https"));
    jDr = __toESM(require("http2"));
    qDr = __toESM(require("util"));
    HDr = require("path");
    pCs = __toESM(Dws(), 1);
    bye = __toESM(require("zlib"));
    J7 = __toESM(require("stream"));
    mCs = require("events");
    oCs = {
      flush: bye.default.constants.Z_SYNC_FLUSH,
      finishFlush: bye.default.constants.Z_SYNC_FLUSH
    };
    kIu = {
      flush: bye.default.constants.BROTLI_OPERATION_FLUSH,
      finishFlush: bye.default.constants.BROTLI_OPERATION_FLUSH
    };
    sCs = cr.isFunction(bye.default.createBrotliDecompress);
    ({
      http: AIu,
      https: IIu
    } = pCs.default);
    PIu = /https:?/;
    iCs = Symbol("axios.http.socketListener");
    bhn = Symbol("axios.http.currentReq");
    aCs = L_.protocols.map(e => e + ":");
    OIu = new fCs();
    MIu = typeof process < "u" && cr.kindOf(process) === "process";
    FIu = {
      request(e, t) {
        let n = e.protocol + "//" + e.hostname + ":" + (e.port || (e.protocol === "https:" ? 443 : 80));
        let {
          http2Options: r,
          headers: o
        } = e;
        let s = OIu.getSession(n, r);
        let {
          HTTP2_HEADER_SCHEME: i,
          HTTP2_HEADER_METHOD: a,
          HTTP2_HEADER_PATH: l,
          HTTP2_HEADER_STATUS: c
        } = jDr.default.constants;
        let u = {
          [i]: e.protocol.replace(":", ""),
          [a]: e.method,
          [l]: e.path
        };
        cr.forEach(o, (p, m) => {
          m.charAt(0) !== ":" && (u[m] = p);
        });
        let d = s.request(u);
        d.once("response", p => {
          let m = d;
          p = Object.assign({}, p);
          let f = p[c];
          delete p[c];
          m.headers = p;
          m.statusCode = +f;
          t(m);
        });
        return d;
      }
    };
    gCs = MIu && function (t) {
      return NIu(async function (r, o, s) {
        let i = V => cr.hasOwnProp(t, V) ? t[V] : undefined;
        let a = i("data");
        let l = i("lookup");
        let c = i("family");
        let u = i("httpVersion");
        if (u === undefined) {
          u = 1;
        }
        let d = i("http2Options");
        let p = i("responseType");
        let m = i("responseEncoding");
        let f = t.method.toUpperCase();
        let h;
        let g = false;
        let y;
        if (u = +u, Number.isNaN(u)) {
          throw TypeError(`Invalid protocol version: '${t.httpVersion}' is not a number`);
        }
        if (u !== 1 && u !== 2) {
          throw TypeError(`Unsupported protocol version '${u}'`);
        }
        let _ = u === 2;
        if (l) {
          let V = TIu(l, K => cr.isArray(K) ? K : [K]);
          l = (K, J, Q) => {
            V(K, J, (Z, ne, oe) => {
              if (Z) {
                return Q(Z);
              }
              let ee = cr.isArray(ne) ? ne.map(re => cCs(re)) : [cCs(ne, oe)];
              J.all ? Q(Z, ee) : Q(Z, ee[0].address, ee[0].family);
            });
          };
        }
        let b = new mCs.EventEmitter();
        function S(V) {
          try {
            b.emit("abort", !V || V.type ? new hws(null, t, y) : V);
          } catch (K) {
            console.warn("emit error", K);
          }
        }
        b.once("abort", o);
        let E = () => {
          if (t.cancelToken) {
            t.cancelToken.unsubscribe(S);
          }
          if (t.signal) {
            t.signal.removeEventListener("abort", S);
          }
          b.removeAllListeners();
        };
        if (t.cancelToken || t.signal) {
          if (t.cancelToken && t.cancelToken.subscribe(S), t.signal) {
            t.signal.aborted ? S() : t.signal.addEventListener("abort", S);
          }
        }
        s((V, K) => {
          if (h = true, K) {
            g = true;
            E();
            return;
          }
          let {
            data: J
          } = V;
          if (J instanceof J7.default.Readable || J instanceof J7.default.Duplex) {
            let Q = J7.default.finished(J, () => {
              Q();
              E();
            });
          } else {
            E();
          }
        });
        let C = UHe(t.baseURL, t.url, t.allowAbsoluteUrls);
        let x = new URL(C, L_.hasBrowserEnv ? L_.origin : undefined);
        let A = x.protocol || aCs[0];
        if (A === "data:") {
          if (t.maxContentLength > -1) {
            let K = String(t.url || C || "");
            if ($Dr(K) > t.maxContentLength) {
              return o(new WB("maxContentLength size of " + t.maxContentLength + " exceeded", WB.ERR_BAD_RESPONSE, t));
            }
          }
          let V;
          if (f !== "GET") {
            return ple(r, o, {
              status: 405,
              statusText: "method not allowed",
              headers: {},
              config: t
            });
          }
          try {
            V = NDr(t.url, p === "blob", {
              Blob: t.env && t.env.Blob
            });
          } catch (K) {
            throw WB.from(K, WB.ERR_BAD_REQUEST, t);
          }
          if (p === "text") {
            if (V = V.toString(m), !m || m === "utf8") {
              V = cr.stripBOM(V);
            }
          } else if (p === "stream") {
            V = J7.default.Readable.from(V);
          }
          return ple(r, o, {
            data: V,
            status: 200,
            statusText: "OK",
            headers: new mDt(),
            config: t
          });
        }
        if (aCs.indexOf(A) === -1) {
          return o(new WB("Unsupported protocol " + A, WB.ERR_BAD_REQUEST, t));
        }
        let k = mDt.from(t.headers).normalize();
        k.set("User-Agent", "axios/" + "1.15.2", false);
        let {
          onUploadProgress: I,
          onDownloadProgress: O
        } = t;
        let M = t.maxRate;
        let L = undefined;
        let P = undefined;
        if (cr.isSpecCompliantForm(a)) {
          let V = k.getContentType(/boundary=([-_\w\d]{10,70})/i);
          a = SIu(a, K => {
            k.set(K);
          }, {
            tag: `axios-${"1.15.2"}-boundary`,
            boundary: V && V[1] || undefined
          });
        } else if (cr.isFormData(a) && cr.isFunction(a.getHeaders) && a.getHeaders !== Object.prototype.getHeaders) {
          if (k.set(a.getHeaders()), !k.hasContentLength()) {
            try {
              let V = await qDr.default.promisify(a.getLength).call(a);
              Number.isFinite(V) && V >= 0 && k.setContentLength(V);
            } catch (V) {}
          }
        } else if (cr.isBlob(a) || cr.isFile(a)) {
          a.size && k.setContentType(a.type || "application/octet-stream");
          k.setContentLength(a.size || 0);
          a = J7.default.Readable.from(gIu(a));
        } else if (a && !cr.isStream(a)) {
          if (Buffer.isBuffer(a)) {
            ;
          } else if (cr.isArrayBuffer(a)) {
            a = Buffer.from(new Uint8Array(a));
          } else if (cr.isString(a)) {
            a = Buffer.from(a, "utf-8");
          } else {
            return o(new WB("Data after transformation must be a string, an ArrayBuffer, a Buffer, or a Stream", WB.ERR_BAD_REQUEST, t));
          }
          if (k.setContentLength(a.length, false), t.maxBodyLength > -1 && a.length > t.maxBodyLength) {
            return o(new WB("Request body larger than maxBodyLength limit", WB.ERR_BAD_REQUEST, t));
          }
        }
        let F = cr.toFiniteNumber(k.getContentLength());
        if (cr.isArray(M)) {
          L = M[0];
          P = M[1];
        } else {
          L = P = M;
        }
        if (a && (I || L)) {
          if (!cr.isStream(a)) {
            a = J7.default.Readable.from(a, {
              objectMode: false
            });
          }
          a = J7.default.pipeline([a, new Lws({
            maxRate: cr.toFiniteNumber(L)
          })], cr.noop);
          I && a.on("progress", lCs(a, Htt(F, _ye(jtt(I), false, 3))));
        }
        let H = undefined;
        let U = i("auth");
        if (U) {
          let V = U.username || "";
          let K = U.password || "";
          H = V + ":" + K;
        }
        if (!H && x.username) {
          let {
            username: V,
            password: K
          } = x;
          H = V + ":" + K;
        }
        H && k.delete("authorization");
        let N;
        try {
          N = LHe(x.pathname + x.search, t.params, t.paramsSerializer).replace(/^\?/, "");
        } catch (V) {
          let K = Error(V.message);
          K.config = t;
          K.url = t.url;
          K.exists = true;
          return o(K);
        }
        k.set("Accept-Encoding", "gzip, compress, deflate" + (sCs ? ", br" : ""), false);
        let W = Object.assign(Object.create(null), {
          path: N,
          method: f,
          headers: k.toJSON(),
          agents: {
            http: t.httpAgent,
            https: t.httpsAgent
          },
          auth: H,
          protocol: A,
          family: c,
          beforeRedirect: DIu,
          beforeRedirects: Object.create(null),
          http2Options: d
        });
        if (!cr.isUndefined(l) && (W.lookup = l), t.socketPath) {
          if (typeof t.socketPath !== "string") {
            return o(new WB("socketPath must be a string", WB.ERR_BAD_OPTION_VALUE, t));
          }
          if (t.allowedSocketPaths != null) {
            let V = Array.isArray(t.allowedSocketPaths) ? t.allowedSocketPaths : [t.allowedSocketPaths];
            let K = HDr.resolve(t.socketPath);
            if (!V.some(Q => typeof Q === "string" && HDr.resolve(Q) === K)) {
              return o(new WB(`socketPath "${t.socketPath}" is not permitted by allowedSocketPaths`, WB.ERR_BAD_OPTION_VALUE, t));
            }
          }
          W.socketPath = t.socketPath;
        } else {
          W.hostname = x.hostname.startsWith("[") ? x.hostname.slice(1, -1) : x.hostname;
          W.port = x.port;
          hCs(W, t.proxy, A + "//" + x.hostname + (x.port ? ":" + x.port : "") + W.path);
        }
        let j;
        let z = PIu.test(W.protocol);
        if (W.agent = z ? t.httpsAgent : t.httpAgent, _) {
          j = FIu;
        } else {
          let V = i("transport");
          if (V) {
            j = V;
          } else if (t.maxRedirects === 0) {
            j = z ? dCs.default : uCs.default;
          } else {
            if (t.maxRedirects) {
              W.maxRedirects = t.maxRedirects;
            }
            let K = i("beforeRedirect");
            if (K) {
              W.beforeRedirects.config = K;
            }
            j = z ? IIu : AIu;
          }
        }
        if (t.maxBodyLength > -1) {
          W.maxBodyLength = t.maxBodyLength;
        } else {
          W.maxBodyLength = 1 / 0;
        }
        if (W.insecureHTTPParser = Boolean(i("insecureHTTPParser")), y = j.request(W, function (K) {
          if (y.destroyed) {
            return;
          }
          let J = [K];
          let Q = cr.toFiniteNumber(K.headers["content-length"]);
          if (O || P) {
            let ee = new Lws({
              maxRate: cr.toFiniteNumber(P)
            });
            O && ee.on("progress", lCs(ee, Htt(Q, _ye(jtt(O), true, 3))));
            J.push(ee);
          }
          let Z = K;
          let ne = K.req || y;
          if (t.decompress !== false && K.headers["content-encoding"]) {
            if (f === "HEAD" || K.statusCode === 204) {
              delete K.headers["content-encoding"];
            }
            switch ((K.headers["content-encoding"] || "").toLowerCase()) {
              case "gzip":
              case "x-gzip":
              case "compress":
              case "x-compress":
                J.push(bye.default.createUnzip(oCs));
                delete K.headers["content-encoding"];
                break;
              case "deflate":
                J.push(new Gws());
                J.push(bye.default.createUnzip(oCs));
                delete K.headers["content-encoding"];
                break;
              case "br":
                if (sCs) {
                  J.push(bye.default.createBrotliDecompress(kIu));
                  delete K.headers["content-encoding"];
                }
            }
          }
          Z = J.length > 1 ? J7.default.pipeline(J, cr.noop) : J[0];
          let oe = {
            status: K.statusCode,
            statusText: K.statusMessage,
            headers: new mDt(K.headers),
            config: t,
            request: ne
          };
          if (p === "stream") {
            if (t.maxContentLength > -1) {
              let ee = t.maxContentLength;
              let re = Z;
              async function* se() {
                let ae = 0;
                for await (let de of re) {
                  if (ae += de.length, ae > ee) {
                    throw new WB("maxContentLength size of " + ee + " exceeded", WB.ERR_BAD_RESPONSE, t, ne);
                  }
                  yield de;
                }
              }
              Z = J7.default.Readable.from(se(), {
                objectMode: false
              });
            }
            oe.data = Z;
            ple(r, o, oe);
          } else {
            let ee = [];
            let re = 0;
            Z.on("data", function (ae) {
              if (ee.push(ae), re += ae.length, t.maxContentLength > -1 && re > t.maxContentLength) {
                g = true;
                Z.destroy();
                S(new WB("maxContentLength size of " + t.maxContentLength + " exceeded", WB.ERR_BAD_RESPONSE, t, ne));
              }
            });
            Z.on("aborted", function () {
              if (g) {
                return;
              }
              let ae = new WB("stream has been aborted", WB.ERR_BAD_RESPONSE, t, ne);
              Z.destroy(ae);
              o(ae);
            });
            Z.on("error", function (ae) {
              if (y.destroyed) {
                return;
              }
              o(WB.from(ae, null, t, ne));
            });
            Z.on("end", function () {
              try {
                let ae = ee.length === 1 ? ee[0] : Buffer.concat(ee);
                if (p !== "arraybuffer") {
                  if (ae = ae.toString(m), !m || m === "utf8") {
                    ae = cr.stripBOM(ae);
                  }
                }
                oe.data = ae;
              } catch (ae) {
                return o(WB.from(ae, null, t, oe.request, oe));
              }
              ple(r, o, oe);
            });
          }
          b.once("abort", ee => {
            if (!Z.destroyed) {
              Z.emit("error", ee);
              Z.destroy();
            }
          });
        }), b.once("abort", V => {
          if (y.close) {
            y.close();
          } else {
            y.destroy(V);
          }
        }), y.on("error", function (K) {
          o(WB.from(K, null, t, y));
        }), y.on("socket", function (K) {
          if (K.setKeepAlive(true, 60000), !K[iCs]) {
            K.on("error", function (Q) {
              let Z = K[bhn];
              if (Z && !Z.destroyed) {
                Z.destroy(Q);
              }
            });
            K[iCs] = true;
          }
          K[bhn] = y;
          y.once("close", function () {
            if (K[bhn] === y) {
              K[bhn] = null;
            }
          });
        }), t.timeout) {
          let V = parseInt(t.timeout, 10);
          if (Number.isNaN(V)) {
            S(new WB("error trying to parse `config.timeout` to int", WB.ERR_BAD_OPTION_VALUE, t, y));
            return;
          }
          y.setTimeout(V, function () {
            if (h) {
              return;
            }
            let J = t.timeout ? "timeout of " + t.timeout + "ms exceeded" : "timeout exceeded";
            let Q = t.transitional || cke;
            if (t.timeoutErrorMessage) {
              J = t.timeoutErrorMessage;
            }
            S(new WB(J, Q.clarifyTimeoutError ? WB.ETIMEDOUT : WB.ECONNABORTED, t, y));
          });
        } else {
          y.setTimeout(0);
        }
        if (cr.isStream(a)) {
          let V = false;
          let K = false;
          a.on("end", () => {
            V = true;
          });
          a.once("error", Q => {
            K = true;
            y.destroy(Q);
          });
          a.on("close", () => {
            if (!V && !K) {
              S(new hws("Request stream has been aborted", t, y));
            }
          });
          let J = a;
          if (t.maxBodyLength > -1 && t.maxRedirects === 0) {
            let Q = t.maxBodyLength;
            let Z = 0;
            J = J7.default.pipeline([a, new J7.default.Transform({
              transform(ne, oe, ee) {
                if (Z += ne.length, Z > Q) {
                  return ee(new WB("Request body larger than maxBodyLength limit", WB.ERR_BAD_REQUEST, t, y));
                }
                ee(null, ne);
              }
            })], cr.noop);
            J.on("error", ne => {
              if (!y.destroyed) {
                y.destroy(ne);
              }
            });
          }
          J.pipe(y);
        } else {
          a && y.write(a);
          y.end();
        }
      });
    };
  });
  var _Cs;
  var bCs = __lazy(() => {
    Dte();
    _Cs = L_.hasStandardBrowserEnv ? ((e, t) => n => (n = new URL(n, L_.origin), e.protocol === n.protocol && e.host === n.host && (t || e.port === n.port)))(new URL(L_.origin), L_.navigator && /(msie|trident)/i.test(L_.navigator.userAgent)) : () => true;
  });
  var SCs;
  var TCs = __lazy(() => {
    Qv();
    Dte();
    SCs = L_.hasStandardBrowserEnv ? {
      write(e, t, n, r, o, s, i) {
        if (typeof document > "u") {
          return;
        }
        let a = [`${e}=${encodeURIComponent(t)}`];
        if (cr.isNumber(n)) {
          a.push(`expires=${new Date(n).toUTCString()}`);
        }
        if (cr.isString(r)) {
          a.push(`path=${r}`);
        }
        if (cr.isString(o)) {
          a.push(`domain=${o}`);
        }
        if (s === true) {
          a.push("secure");
        }
        if (cr.isString(i)) {
          a.push(`SameSite=${i}`);
        }
        document.cookie = a.join("; ");
      },
      read(e) {
        if (typeof document > "u") {
          return null;
        }
        let t = document.cookie.match(new RegExp("(?:^|; )" + e + "=([^;]*)"));
        return t ? decodeURIComponent(t[1]) : null;
      },
      remove(e) {
        this.write(e, "", Date.now() - 86400000, "/");
      }
    } : {
      write() {},
      read() {
        return null;
      },
      remove() {}
    };
  });
  function Mte(e, t) {
    t = t || {};
    let n = Object.create(null);
    Object.defineProperty(n, "hasOwnProperty", {
      value: Object.prototype.hasOwnProperty,
      enumerable: false,
      writable: true,
      configurable: true
    });
    function r(c, u, d, p) {
      if (cr.isPlainObject(c) && cr.isPlainObject(u)) {
        return cr.merge.call({
          caseless: p
        }, c, u);
      } else if (cr.isPlainObject(u)) {
        return cr.merge({}, u);
      } else if (cr.isArray(u)) {
        return u.slice();
      }
      return u;
    }
    function o(c, u, d, p) {
      if (!cr.isUndefined(u)) {
        return r(c, u, d, p);
      } else if (!cr.isUndefined(c)) {
        return r(undefined, c, d, p);
      }
    }
    function s(c, u) {
      if (!cr.isUndefined(u)) {
        return r(undefined, u);
      }
    }
    function i(c, u) {
      if (!cr.isUndefined(u)) {
        return r(undefined, u);
      } else if (!cr.isUndefined(c)) {
        return r(undefined, c);
      }
    }
    function a(c, u, d) {
      if (cr.hasOwnProp(t, d)) {
        return r(c, u);
      } else if (cr.hasOwnProp(e, d)) {
        return r(undefined, c);
      }
    }
    let l = {
      url: s,
      method: s,
      data: s,
      baseURL: i,
      transformRequest: i,
      transformResponse: i,
      paramsSerializer: i,
      timeout: i,
      timeoutMessage: i,
      withCredentials: i,
      withXSRFToken: i,
      adapter: i,
      responseType: i,
      xsrfCookieName: i,
      xsrfHeaderName: i,
      onUploadProgress: i,
      onDownloadProgress: i,
      decompress: i,
      maxContentLength: i,
      maxBodyLength: i,
      beforeRedirect: i,
      transport: i,
      httpAgent: i,
      httpsAgent: i,
      cancelToken: i,
      socketPath: i,
      allowedSocketPaths: i,
      responseEncoding: i,
      validateStatus: a,
      headers: (c, u, d) => o(ECs(c), ECs(u), d, true)
    };
    cr.forEach(Object.keys({
      ...e,
      ...t
    }), function (u) {
      if (u === "__proto__" || u === "constructor" || u === "prototype") {
        return;
      }
      let d = cr.hasOwnProp(l, u) ? l[u] : o;
      let p = cr.hasOwnProp(e, u) ? e[u] : undefined;
      let m = cr.hasOwnProp(t, u) ? t[u] : undefined;
      let f = d(p, m, u);
      cr.isUndefined(f) && d !== a || (n[u] = f);
    });
    return n;
  }
  var ECs = e => e instanceof mDt ? {
    ...e
  } : e;
  var Shn = __lazy(() => {
    Qv();
  });
  var Thn = e => {
    let t = Mte({}, e);
    let n = p => cr.hasOwnProp(t, p) ? t[p] : undefined;
    let r = n("data");
    let o = n("withXSRFToken");
    let s = n("xsrfHeaderName");
    let i = n("xsrfCookieName");
    let a = n("headers");
    let l = n("auth");
    let c = n("baseURL");
    let u = n("allowAbsoluteUrls");
    let d = n("url");
    if (t.headers = a = mDt.from(a), t.url = LHe(UHe(c, d, u), e.params, e.paramsSerializer), l) {
      a.set("Authorization", "Basic " + btoa((l.username || "") + ":" + (l.password ? unescape(encodeURIComponent(l.password)) : "")));
    }
    if (cr.isFormData(r)) {
      if (L_.hasStandardBrowserEnv || L_.hasStandardBrowserWebWorkerEnv) {
        a.setContentType(undefined);
      } else if (cr.isFunction(r.getHeaders)) {
        let p = r.getHeaders();
        let m = ["content-type", "content-length"];
        Object.entries(p).forEach(([f, h]) => {
          if (m.includes(f.toLowerCase())) {
            a.set(f, h);
          }
        });
      }
    }
    if (L_.hasStandardBrowserEnv) {
      if (cr.isFunction(o)) {
        o = o(t);
      }
      if (o === true || o == null && _Cs(t.url)) {
        let m = s && i && SCs.read(i);
        if (m) {
          a.set(s, m);
        }
      }
    }
    return t;
  };
  var WDr = __lazy(() => {
    Dte();
    Qv();
    bCs();
    TCs();
    uhn();
    Shn();
    shn();
  });
  var UIu;
  var vCs;
  var wCs = __lazy(() => {
    Qv();
    chn();
    dDt();
    Dte();
    _hn();
    WDr();
    UIu = typeof XMLHttpRequest < "u";
    vCs = UIu && function (e) {
      return new Promise(function (n, r) {
        let o = Thn(e);
        let s = o.data;
        let i = mDt.from(o.headers).normalize();
        let {
          responseType: a,
          onUploadProgress: l,
          onDownloadProgress: c
        } = o;
        let u;
        let d;
        let p;
        let m;
        let f;
        function h() {
          m && m();
          f && f();
          o.cancelToken && o.cancelToken.unsubscribe(u);
          o.signal && o.signal.removeEventListener("abort", u);
        }
        let g = new XMLHttpRequest();
        g.open(o.method.toUpperCase(), o.url, true);
        g.timeout = o.timeout;
        function y() {
          if (!g) {
            return;
          }
          let b = mDt.from("getAllResponseHeaders" in g && g.getAllResponseHeaders());
          let E = {
            data: !a || a === "text" || a === "json" ? g.responseText : g.response,
            status: g.status,
            statusText: g.statusText,
            headers: b,
            config: e,
            request: g
          };
          ple(function (x) {
            n(x);
            h();
          }, function (x) {
            r(x);
            h();
          }, E);
          g = null;
        }
        if ("onloadend" in g) {
          g.onloadend = y;
        } else {
          g.onreadystatechange = function () {
            if (!g || g.readyState !== 4) {
              return;
            }
            if (g.status === 0 && !(g.responseURL && g.responseURL.indexOf("file:") === 0)) {
              return;
            }
            setTimeout(y);
          };
        }
        if (g.onabort = function () {
          if (!g) {
            return;
          }
          r(new WB("Request aborted", WB.ECONNABORTED, e, g));
          g = null;
        }, g.onerror = function (S) {
          let E = S && S.message ? S.message : "Network Error";
          let C = new WB(E, WB.ERR_NETWORK, e, g);
          C.event = S || null;
          r(C);
          g = null;
        }, g.ontimeout = function () {
          let S = o.timeout ? "timeout of " + o.timeout + "ms exceeded" : "timeout exceeded";
          let E = o.transitional || cke;
          if (o.timeoutErrorMessage) {
            S = o.timeoutErrorMessage;
          }
          r(new WB(S, E.clarifyTimeoutError ? WB.ETIMEDOUT : WB.ECONNABORTED, e, g));
          g = null;
        }, s === undefined && i.setContentType(null), "setRequestHeader" in g) {
          cr.forEach(i.toJSON(), function (S, E) {
            g.setRequestHeader(E, S);
          });
        }
        if (!cr.isUndefined(o.withCredentials)) {
          g.withCredentials = !!o.withCredentials;
        }
        if (a && a !== "json") {
          g.responseType = o.responseType;
        }
        if (c) {
          [p, f] = _ye(c, true);
          g.addEventListener("progress", p);
        }
        if (l && g.upload) {
          [d, m] = _ye(l);
          g.upload.addEventListener("progress", d);
          g.upload.addEventListener("loadend", m);
        }
        if (o.cancelToken || o.signal) {
          if (u = b => {
            if (!g) {
              return;
            }
            r(!b || b.type ? new hws(null, e, g) : b);
            g.abort();
            g = null;
          }, o.cancelToken && o.cancelToken.subscribe(u), o.signal) {
            o.signal.aborted ? u() : o.signal.addEventListener("abort", u);
          }
        }
        let _ = SDt(o.url);
        if (_ && L_.protocols.indexOf(_) === -1) {
          r(new WB("Unsupported protocol " + _ + ":", WB.ERR_BAD_REQUEST, e));
          return;
        }
        g.send(s || null);
      });
    };
  });
  var BIu = (e, t) => {
    let {
      length: n
    } = e = e ? e.filter(Boolean) : [];
    if (t || n) {
      let r = new AbortController();
      let o;
      let s = function (c) {
        if (!o) {
          o = true;
          a();
          let u = c instanceof Error ? c : this.reason;
          r.abort(u instanceof WB ? u : new hws(u instanceof Error ? u.message : u));
        }
      };
      let i = t && setTimeout(() => {
        i = null;
        s(new WB(`timeout of ${t}ms exceeded`, WB.ETIMEDOUT));
      }, t);
      let a = () => {
        if (e) {
          i && clearTimeout(i);
          i = null;
          e.forEach(c => {
            c.unsubscribe ? c.unsubscribe(s) : c.removeEventListener("abort", s);
          });
          e = null;
        }
      };
      e.forEach(c => c.addEventListener("abort", s));
      let {
        signal: l
      } = r;
      l.unsubscribe = () => cr.asap(a);
      return l;
    }
  };
  var $Iu = function* (e, t) {
    let n = e.byteLength;
    if (!t || n < t) {
      yield e;
      return;
    }
    let r = 0;
    let o;
    while (r < n) {
      o = r + t;
      yield e.slice(r, o);
      r = o;
    }
  };
  var HIu = async function* (e, t) {
    for await (let n of jIu(e)) {
      yield* $Iu(n, t);
    }
  };
  var jIu = async function* (e) {
    if (e[Symbol.asyncIterator]) {
      yield* e;
      return;
    }
    let t = e.getReader();
    try {
      for (;;) {
        let {
          done: n,
          value: r
        } = await t.read();
        if (n) {
          break;
        }
        yield r;
      }
    } finally {
      await t.cancel();
    }
  };
  var GDr = (e, t, n, r) => {
    let o = HIu(e, t);
    let s = 0;
    let i;
    let a = l => {
      if (!i) {
        i = true;
        r && r(l);
      }
    };
    return new ReadableStream({
      async pull(l) {
        try {
          let {
            done: c,
            value: u
          } = await o.next();
          if (c) {
            a();
            l.close();
            return;
          }
          let d = u.byteLength;
          if (n) {
            let p = s += d;
            n(p);
          }
          l.enqueue(new Uint8Array(u));
        } catch (c) {
          throw a(c), c;
        }
      },
      cancel(l) {
        a(l);
        return o.return();
      }
    }, {
      highWaterMark: 2
    });
  };
  var Ehn;
  var qIu;
  var kCs;
  var ACs;
  var ICs = (e, ...t) => {
    try {
      return !!e(...t);
    } catch (n) {
      return false;
    }
  };
  var WIu = e => {
    e = cr.merge.call({
      skipUndefined: true
    }, qIu, e);
    let {
      fetch: t,
      Request: n,
      Response: r
    } = e;
    let o = t ? Ehn(t) : typeof fetch === "function";
    let s = Ehn(n);
    let i = Ehn(r);
    if (!o) {
      return false;
    }
    let a = o && Ehn(kCs);
    let l = o && (typeof ACs === "function" ? (f => h => f.HS(h))(new ACs()) : async f => new Uint8Array(await new n(f).arrayBuffer()));
    let c = s && a && ICs(() => {
      let f = false;
      let h = new n(L_.origin, {
        body: new kCs(),
        method: "POST",
        get duplex() {
          f = true;
          return "half";
        }
      });
      let g = h.headers.vZc("Content-Type");
      if (h.body != null) {
        h.body.cancel();
      }
      return f && !g;
    });
    let u = i && a && ICs(() => cr.isReadableStream(new r("").body));
    let d = {
      stream: u && (f => f.body)
    };
    o && (() => {
      ["text", "arrayBuffer", "blob", "formData", "stream"].forEach(f => {
        !d[f] && (d[f] = (h, g) => {
          let y = h && h[f];
          if (y) {
            return y.call(h);
          }
          throw new WB(`Response type '${f}' is not supported`, WB.ERR_NOT_SUPPORT, g);
        });
      });
    })();
    let p = async f => {
      if (f == null) {
        return 0;
      }
      if (cr.isBlob(f)) {
        return f.size;
      }
      if (cr.isSpecCompliantForm(f)) {
        return (await new n(L_.origin, {
          method: "POST",
          body: f
        }).arrayBuffer()).byteLength;
      }
      if (cr.isArrayBufferView(f) || cr.isArrayBuffer(f)) {
        return f.byteLength;
      }
      if (cr.isURLSearchParams(f)) {
        f = f + "";
      }
      if (cr.isString(f)) {
        return (await l(f)).byteLength;
      }
    };
    let m = async (f, h) => {
      let g = cr.toFiniteNumber(f.getContentLength());
      return g == null ? p(h) : g;
    };
    return async f => {
      let {
        url: h,
        method: g,
        data: y,
        signal: _,
        cancelToken: b,
        timeout: S,
        onDownloadProgress: E,
        onUploadProgress: C,
        responseType: x,
        headers: A,
        withCredentials: k = "same-origin",
        fetchOptions: I
      } = Thn(f);
      let O = t || fetch;
      x = x ? (x + "").toLowerCase() : "text";
      let M = BIu([_, b && b.toAbortSignal()], S);
      let L = null;
      let P = M && M.unsubscribe && (() => {
        M.unsubscribe();
      });
      let F;
      try {
        if (C && c && g !== "get" && g !== "head" && (F = await m(A, y)) !== 0) {
          let z = new n(h, {
            method: "POST",
            body: y,
            duplex: "half"
          });
          let V;
          if (cr.isFormData(y) && (V = z.headers.get("content-type"))) {
            A.setContentType(V);
          }
          if (z.body) {
            let [K, J] = Htt(F, _ye(jtt(C)));
            y = GDr(z.body, 65536, K, J);
          }
        }
        if (!cr.isString(k)) {
          k = k ? "include" : "omit";
        }
        let H = s && "credentials" in n.prototype;
        if (cr.isFormData(y)) {
          let z = A.getContentType();
          if (z && /^multipart\/form-data/i.test(z) && !/boundary=/i.test(z)) {
            A.delete("content-type");
          }
        }
        let U = {
          ...I,
          signal: M,
          method: g.toUpperCase(),
          headers: A.normalize().toJSON(),
          body: y,
          duplex: "half",
          credentials: H ? k : undefined
        };
        L = s && new n(h, U);
        let N = await (s ? O(L, I) : O(h, U));
        let W = u && (x === "stream" || x === "response");
        if (u && (E || W && P)) {
          let z = {};
          ["status", "statusText", "headers"].forEach(Q => {
            z[Q] = N[Q];
          });
          let V = cr.toFiniteNumber(N.headers.get("content-length"));
          let [K, J] = E && Htt(V, _ye(jtt(E), true)) || [];
          N = new r(GDr(N.body, 65536, K, () => {
            J && J();
            P && P();
          }), z);
        }
        x = x || "text";
        let j = await d[cr.findKey(d, x) || "text"](N, f);
        !W && P && P();
        return await new Promise((z, V) => {
          ple(z, V, {
            data: j,
            headers: mDt.from(N.headers),
            status: N.status,
            statusText: N.statusText,
            config: f,
            request: L
          });
        });
      } catch (H) {
        if (P && P(), H && H.name === "TypeError" && /Load failed|fetch/i.test(H.message)) {
          throw Object.assign(new WB("Network Error", WB.ERR_NETWORK, f, L, H && H.response), {
            cause: H.cause || H
          });
        }
        throw WB.from(H, H && H.code, f, L, H && H.response);
      }
    };
  };
  var GIu;
  var VDr = e => {
    let t = e && e.env || {};
    let {
      fetch: n,
      Request: r,
      Response: o
    } = t;
    let s = [r, o, n];
    let i = s.length;
    let a = i;
    let l;
    let c;
    let u = GIu;
    while (a--) {
      l = s[a];
      c = u.get(l);
      c === undefined && u.set(l, c = a ? new Map() : WIu(t));
      u = c;
    }
    return c;
  };
  var qSh;
  var PCs = __lazy(() => {
    Dte();
    Qv();
    _hn();
    WDr();
    chn();
    ({
      isFunction: Ehn
    } = cr);
    qIu = (({
      Request: e,
      Response: t
    }) => ({
      Request: e,
      Response: t
    }))(cr.global);
    ({
      ReadableStream: kCs,
      TextEncoder: ACs
    } = cr.global);
    GIu = new Map();
    qSh = VDr();
  });
  function KIu(e, t) {
    e = cr.isArray(e) ? e : [e];
    let {
      length: n
    } = e;
    let r;
    let o;
    let s = {};
    for (let i = 0; i < n; i++) {
      r = e[i];
      let a;
      if (o = r, !zIu(r)) {
        if (o = zDr[(a = String(r)).toLowerCase()], o === undefined) {
          throw new WB(`Unknown adapter '${a}'`);
        }
      }
      if (o && (cr.isFunction(o) || (o = o.get(t)))) {
        break;
      }
      s[a || "#" + i] = o;
    }
    if (!o) {
      let i = Object.entries(s).map(([l, c]) => `adapter ${l} ` + (c === false ? "is not supported by the environment" : "is not available in the build"));
      let a = n ? i.length > 1 ? `since :
` + i.map(OCs).join(`
`) : " " + OCs(i[0]) : "as no adapter specified";
      throw new WB("There is no suitable adapter to dispatch the request " + a, "ERR_NOT_SUPPORT");
    }
    return o;
  }
  var zDr;
  var OCs = e => `- ${e}`;
  var zIu = e => cr.isFunction(e) || e === null || e === false;
  var vhn;
  var KDr = __lazy(() => {
    Qv();
    yCs();
    wCs();
    PCs();
    zDr = {
      http: gCs,
      xhr: vCs,
      fetch: {
        get: VDr
      }
    };
    cr.forEach(zDr, (e, t) => {
      if (e) {
        try {
          Object.defineProperty(e, "name", {
            value: t
          });
        } catch (n) {}
        Object.defineProperty(e, "adapterName", {
          value: t
        });
      }
    });
    vhn = {
      getAdapter: KIu,
      adapters: zDr
    };
  });
  function YDr(e) {
    if (e.cancelToken) {
      e.cancelToken.throwIfRequested();
    }
    if (e.signal && e.signal.aborted) {
      throw new hws(null, e);
    }
  }
  function whn(e) {
    if (YDr(e), e.headers = mDt.from(e.headers), e.data = fDt.call(e, e.transformRequest), ["post", "put", "patch"].indexOf(e.method) !== -1) {
      e.headers.setContentType("application/x-www-form-urlencoded", false);
    }
    return vhn.getAdapter(e.adapter || fDr.adapter, e)(e).then(function (r) {
      YDr(e);
      r.data = fDt.call(e, e.transformResponse, r);
      r.headers = mDt.from(r.headers);
      return r;
    }, function (r) {
      if (!hDt(r)) {
        if (YDr(e), r && r.response) {
          r.response.data = fDt.call(e, e.transformResponse, r.response);
          r.response.headers = mDt.from(r.response.headers);
        }
      }
      return Promise.reject(r);
    });
  }
  var DCs = __lazy(() => {
    fws();
    KDr();
  });
  function YIu(e, t, n) {
    if (typeof e !== "object") {
      throw new WB("options must be an object", WB.ERR_BAD_OPTION_VALUE);
    }
    let r = Object.keys(e);
    let o = r.length;
    while (o-- > 0) {
      let s = r[o];
      let i = Object.prototype.hasOwnProperty.call(t, s) ? t[s] : undefined;
      if (i) {
        let a = e[s];
        let l = a === undefined || i(a, s, e);
        if (l !== true) {
          throw new WB("option " + s + " must be " + l, WB.ERR_BAD_OPTION_VALUE);
        }
        continue;
      }
      if (n !== true) {
        throw new WB("Unknown option " + s, WB.ERR_BAD_OPTION);
      }
    }
  }
  var Chn;
  var MCs;
  var EDt;
  var NCs = __lazy(() => {
    Chn = {};
    ["object", "boolean", "number", "function", "string", "symbol"].forEach((e, t) => {
      Chn[e] = function (r) {
        return typeof r === e || "a" + (t < 1 ? "n " : " ") + e;
      };
    });
    MCs = {};
    Chn.transitional = function (t, n, r) {
      function o(s, i) {
        return "[Axios v" + "1.15.2" + "] Transitional option '" + s + "'" + i + (r ? ". " + r : "");
      }
      return (s, i, a) => {
        if (t === false) {
          throw new WB(o(i, " has been removed" + (n ? " in " + n : "")), WB.ERR_DEPRECATED);
        }
        if (n && !MCs[i]) {
          MCs[i] = true;
          console.warn(o(i, " has been deprecated since v" + n + " and will be removed in the near future"));
        }
        return t ? t(s, i, a) : true;
      };
    };
    Chn.spelling = function (t) {
      return (n, r) => (console.warn(`${r} is likely a misspelling of ${t}`), true);
    };
    EDt = {
      assertOptions: YIu,
      validators: Chn
    };
  });
  class vDt {
    constructor(e) {
      this.defaults = e || {};
      this.interceptors = {
        request: new Zvs(),
        response: new Zvs()
      };
    }
    async request(e, t) {
      try {
        return await this._request(e, t);
      } catch (n) {
        if (n instanceof Error) {
          let r = {};
          Error.captureStackTrace ? Error.captureStackTrace(r) : r = Error();
          let o = (() => {
            if (!r.stack) {
              return "";
            }
            let s = r.stack.indexOf(`
`);
            return s === -1 ? "" : r.stack.slice(s + 1);
          })();
          try {
            if (!n.stack) {
              n.stack = o;
            } else if (o) {
              let s = o.indexOf(`
`);
              let i = s === -1 ? -1 : o.indexOf(`
`, s + 1);
              let a = i === -1 ? "" : o.slice(i + 1);
              if (!String(n.stack).endsWith(a)) {
                n.stack += `
` + o;
              }
            }
          } catch (s) {}
        }
        throw n;
      }
    }
    _request(e, t) {
      if (typeof e === "string") {
        t = t || {};
        t.url = e;
      } else {
        t = e || {};
      }
      t = Mte(this.defaults, t);
      let {
        transitional: n,
        paramsSerializer: r,
        headers: o
      } = t;
      if (n !== undefined) {
        EDt.assertOptions(n, {
          silentJSONParsing: X7.transitional(X7.boolean),
          forcedJSONParsing: X7.transitional(X7.boolean),
          clarifyTimeoutError: X7.transitional(X7.boolean),
          legacyInterceptorReqResOrdering: X7.transitional(X7.boolean)
        }, false);
      }
      if (r != null) {
        if (cr.isFunction(r)) {
          t.paramsSerializer = {
            serialize: r
          };
        } else {
          EDt.assertOptions(r, {
            HS: X7.function,
            serialize: X7.function
          }, true);
        }
      }
      if (t.allowAbsoluteUrls !== undefined) {
        ;
      } else if (this.defaults.allowAbsoluteUrls !== undefined) {
        t.allowAbsoluteUrls = this.defaults.allowAbsoluteUrls;
      } else {
        t.allowAbsoluteUrls = true;
      }
      EDt.assertOptions(t, {
        baseUrl: X7.spelling("baseURL"),
        withXsrfToken: X7.spelling("withXSRFToken")
      }, true);
      t.method = (t.method || this.defaults.method || "get").toLowerCase();
      let s = o && cr.merge(o.common, o[t.method]);
      o && cr.forEach(["delete", "get", "head", "post", "put", "patch", "common"], m => {
        delete o[m];
      });
      t.headers = mDt.concat(s, o);
      let i = [];
      let a = true;
      this.interceptors.request.forEach(function (f) {
        if (typeof f.runWhen === "function" && f.runWhen(t) === false) {
          return;
        }
        a = a && f.synchronous;
        let h = t.transitional || cke;
        if (h && h.legacyInterceptorReqResOrdering) {
          i.unshift(f.fulfilled, f.rejected);
        } else {
          i.push(f.fulfilled, f.rejected);
        }
      });
      let l = [];
      this.interceptors.response.forEach(function (f) {
        l.push(f.fulfilled, f.rejected);
      });
      let c;
      let u = 0;
      let d;
      if (!a) {
        let m = [whn.bind(this), undefined];
        m.unshift(...i);
        m.push(...l);
        d = m.length;
        c = Promise.resolve(t);
        while (u < d) {
          c = c.then(m[u++], m[u++]);
        }
        return c;
      }
      d = i.length;
      let p = t;
      while (u < d) {
        let m = i[u++];
        let f = i[u++];
        try {
          p = m(p);
        } catch (h) {
          f.call(this, h);
          break;
        }
      }
      try {
        c = whn.call(this, p);
      } catch (m) {
        return Promise.reject(m);
      }
      u = 0;
      d = l.length;
      while (u < d) {
        c = c.then(l[u++], l[u++]);
      }
      return c;
    }
    getUri(e) {
      e = Mte(this.defaults, e);
      let t = UHe(e.baseURL, e.url, e.allowAbsoluteUrls);
      return LHe(t, e.params, e.paramsSerializer);
    }
  }
  var X7;
  class JDr {
    constructor(e) {
      if (typeof e !== "function") {
        throw TypeError("executor must be a function.");
      }
      let t;
      this.promise = new Promise(function (o) {
        t = o;
      });
      let n = this;
      this.promise.then(r => {
        if (!n._listeners) {
          return;
        }
        let o = n._listeners.length;
        while (o-- > 0) {
          n._listeners[o](r);
        }
        n._listeners = null;
      });
      this.promise.then = r => {
        let o;
        let s = new Promise(i => {
          n.subscribe(i);
          o = i;
        }).then(r);
        s.cancel = function () {
          n.unsubscribe(o);
        };
        return s;
      };
      e(function (o, s, i) {
        if (n.reason) {
          return;
        }
        n.reason = new hws(o, s, i);
        t(n.reason);
      });
    }
    throwIfRequested() {
      if (this.reason) {
        throw this.reason;
      }
    }
    subscribe(e) {
      if (this.reason) {
        e(this.reason);
        return;
      }
      if (this._listeners) {
        this._listeners.push(e);
      } else {
        this._listeners = [e];
      }
    }
    unsubscribe(e) {
      if (!this._listeners) {
        return;
      }
      let t = this._listeners.indexOf(e);
      if (t !== -1) {
        this._listeners.splice(t, 1);
      }
    }
    toAbortSignal() {
      let e = new AbortController();
      let t = n => {
        e.abort(n);
      };
      this.subscribe(t);
      e.signal.unsubscribe = () => this.unsubscribe(t);
      return e.signal;
    }
    static source() {
      let e;
      return {
        token: new JDr(function (r) {
          e = r;
        }),
        cancel: e
      };
    }
  }
  function XDr(e) {
    return function (n) {
      return e.apply(null, n);
    };
  }
  function QDr(e) {
    return cr.isObject(e) && e.isAxiosError === true;
  }
  var BCs = __lazy(() => {
    Qv();
  });
  var ZDr;
  function jCs(e) {
    let t = new vDt(e);
    let n = nDt(vDt.prototype.request, t);
    cr.extend(n, vDt.prototype, t, {
      allOwnKeys: true
    });
    cr.extend(n, t, null, {
      allOwnKeys: true
    });
    n.create = function (o) {
      return jCs(Mte(e, o));
    };
    return n;
  }
  var NP;
  var CDt = {};