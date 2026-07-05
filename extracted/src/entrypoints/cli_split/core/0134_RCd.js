  var sfi = () => {};
  var ifi = () => {};
  var afi;
  var lfi = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(afi || (afi = {}));
  });
  var cfi;
  var ufi = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(cfi || (cfi = {}));
  });
  var dfi = () => {};
  var pfi = () => {};
  var mfi = () => {};
  var ffi = () => {};
  var hfi = __lazy(() => {
    lfi();
    ufi();
    dfi();
    pfi();
    mfi();
    ffi();
  });
  var gfi = () => {};
  var yfi = () => {};
  var _fi = () => {};
  var bfi = () => {};
  var Sfi = () => {};
  var Tfi = () => {};
  var Efi = () => {};
  var vfi = __lazy(() => {
    Sfi();
    Tfi();
    Efi();
  });
  var wfi = () => {};
  var Cfi = () => {};
  var Rfi;
  var xfi = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(Rfi || (Rfi = {}));
  });
  var kfi = () => {};
  var Afi = () => {};
  var Ifi = () => {};
  var Pfi = () => {};
  var Ofi = () => {};
  var Dfi = __lazy(() => {
    kfi();
    Afi();
    Ifi();
    Pfi();
    Ofi();
  });
  var Mfi = () => {};
  var WRn;
  var RGr = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(WRn || (WRn = {}));
  });
  var Nfi = __lazy(() => {
    RGr();
  });
  var Lfi = () => {};
  var Ffi = __lazy(() => {
    RGr();
    Nfi();
    Lfi();
  });
  var xGr;
  var Ufi = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(xGr || (xGr = {}));
  });
  var Bfi = () => {};
  var $fi = () => {};
  var Hfi = () => {};
  var jfi = () => {};
  var qfi = () => {};
  var Wfi = __lazy(() => {
    $fi();
    Hfi();
    jfi();
    qfi();
  });
  var Gfi = () => {};
  var Vfi = () => {};
  var zfi;
  var Kfi = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(zfi || (zfi = {}));
  });
  var Yfi = () => {};
  var Jfi = () => {};
  var Xfi = () => {};
  var Qfi = () => {};
  var Zfi = () => {};
  var ehi = () => {};
  var thi = () => {};
  var nhi = () => {};
  var rhi = () => {};
  var ohi;
  var shi = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(ohi || (ohi = {}));
  });
  var ihi = () => {};
  var ahi = () => {};
  var lhi = () => {};
  var chi = () => {};
  var uhi = () => {};
  var dhi = () => {};
  var GRn = __lazy(() => {
    ifi();
    hfi();
    gfi();
    yfi();
    _fi();
    bfi();
    vfi();
    wfi();
    Cfi();
    xfi();
    Dfi();
    Mfi();
    Ffi();
    Ufi();
    Bfi();
    Wfi();
    Gfi();
    Vfi();
    Kfi();
    Yfi();
    Jfi();
    Xfi();
    Qfi();
    Zfi();
    ehi();
    thi();
    nhi();
    rhi();
    shi();
    ihi();
    ahi();
    lhi();
    chi();
    uhi();
    dhi();
  });
  var phi = __lazy(() => {
    GRn();
  });
  var mhi = () => {};
  class T0e {
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
    static isInstance(e) {
      if (!e) {
        return false;
      }
      let t = e;
      return "method" in t && "protocol" in t && "hostname" in t && "path" in t && typeof t.query === "object" && typeof t.headers === "object";
    }
    clone() {
      let e = new T0e({
        ...this,
        headers: {
          ...this.headers
        }
      });
      if (e.query) {
        e.query = RCd(e.query);
      }
      return e;
    }
  }
  function RCd(e) {
    return Object.keys(e).reduce((t, n) => {
      let r = e[n];
      return {
        ...t,
        [n]: Array.isArray(r) ? [...r] : r
      };
    }, {});
  }
  var fhi = () => {};
  var Rst = __lazy(() => {
    sfi();
    phi();
    mhi();
    fhi();
  });
  function ghi(e) {
    if (e.length % 2 !== 0) {
      throw Error("Hex encoded strings must have an even number length");
    }
    let t = new Uint8Array(e.length / 2);
    for (let n = 0; n < e.length; n += 2) {
      let r = e.slice(n, n + 2).toLowerCase();
      if (r in kGr) {
        t[n / 2] = kGr[r];
      } else {
        throw Error(`Cannot decode unrecognized sequence ${r} as hexadecimal`);
      }
    }
    return t;
  }
  function _ne(e) {
    let t = "";
    for (let n = 0; n < e.byteLength; n++) {
      t += hhi[e[n]];
    }
    return t;
  }
  var hhi;
  var kGr;
  var eFt = __lazy(() => {
    hhi = {};
    kGr = {};
    for (let e = 0; e < 256; e++) {
      let t = e.toString(16).toLowerCase();
      if (t.length === 1) {
        t = `0${t}`;
      }
      hhi[e] = t;
      kGr[t] = e;
    }
  });
  var yhi = () => {};
  var _hi;
  var bhi = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(_hi || (_hi = {}));
  });
  var Shi;
  var Thi = __lazy(() => {
    (function (e) {
      e.HEADER = "header";
      e.QUERY = "query";
    })(Shi || (Shi = {}));
  });
  var Ehi = () => {};
  var vhi = () => {};
  var whi = () => {};
  var Chi = () => {};
  var Rhi = __lazy(() => {
    bhi();
    Thi();
    Ehi();
    vhi();
    whi();
    Chi();
  });
  var xhi = () => {};
  var khi = () => {};
  var Ahi = () => {};
  var Ihi = () => {};
  var Phi = () => {};
  var Ohi = () => {};
  var Dhi = () => {};
  var Mhi = __lazy(() => {
    Phi();
    Ohi();
    Dhi();
  });
  var Nhi = () => {};
  var Lhi = () => {};
  var Fhi;
  var Uhi = __lazy(() => {
    (function (e) {
      e.HTTP = "http";
      e.HTTPS = "https";
    })(Fhi || (Fhi = {}));
  });
  var Bhi = () => {};
  var $hi = () => {};
  var Hhi = () => {};
  var jhi = () => {};
  var qhi = () => {};
  var Whi = __lazy(() => {
    Bhi();
    $hi();
    Hhi();
    jhi();
    qhi();
  });
  var Ghi = () => {};
  var AGr;
  var IGr = __lazy(() => {
    (function (e) {
      e.MD5 = "md5";
      e.CRC32 = "crc32";
      e.CRC32C = "crc32c";
      e.SHA1 = "sha1";
      e.SHA256 = "sha256";
    })(AGr || (AGr = {}));
  });
  var Vhi = __lazy(() => {
    IGr();
  });
  var zhi = () => {};
  var Khi = __lazy(() => {
    IGr();
    Vhi();
    zhi();
  });
  var Yhi = () => {};
  var Jhi;
  var Xhi = __lazy(() => {
    (function (e) {
      e[e.HEADER = 0] = "HEADER";
      e[e.TRAILER = 1] = "TRAILER";
    })(Jhi || (Jhi = {}));
  });
  var Qhi = () => {};
  var Zhi = () => {};
  var egi = () => {};
  var tgi = () => {};
  var ngi = () => {};
  var rgi = __lazy(() => {
    Zhi();
    egi();
    tgi();
    ngi();
  });
  var ogi = () => {};
  var sgi = () => {};
  var igi;
  var agi = __lazy(() => {
    (function (e) {
      e.PROFILE = "profile";
      e.SSO_SESSION = "sso-session";
      e.SERVICES = "services";
    })(igi || (igi = {}));
  });
  var lgi = () => {};
  var cgi = () => {};
  var ugi = () => {};
  var dgi = () => {};
  var pgi = () => {};
  var mgi = () => {};
  var fgi = () => {};
  var hgi = () => {};
  var ggi = () => {};
  var ygi;
  var _gi = __lazy(() => {
    (function (e) {
      e.HTTP_0_9 = "http/0.9";
      e.HTTP_1_0 = "http/1.0";
      e.TDS_8_0 = "tds/8.0";
    })(ygi || (ygi = {}));
  });
  var bgi = () => {};
  var Sgi = () => {};
  var Tgi = () => {};
  var Egi = () => {};
  var vgi = () => {};
  var wgi = () => {};
  var Cgi = __lazy(() => {
    yhi();
    Rhi();
    xhi();
    khi();
    Ahi();
    Ihi();
    Mhi();
    Nhi();
    Lhi();
    Uhi();
    Whi();
    Ghi();
    Khi();
    Yhi();
    Xhi();
    Qhi();
    rgi();
    ogi();
    sgi();
    agi();
    lgi();
    cgi();
    ugi();
    dgi();
    pgi();
    mgi();
    fgi();
    hgi();
    ggi();
    _gi();
    bgi();
    Sgi();
    Tgi();
    Egi();
    vgi();
    wgi();
  });
  var Rgi = __lazy(() => {
    Cgi();
  });
  var PGr = e => {
    if (typeof e === "function") {
      return e;
    }
    let t = Promise.resolve(e);
    return () => t;
  };
  var xgi = __lazy(() => {
    Rgi();
  });
  var E0e = e => encodeURIComponent(e).replace(/[!'()*]/g, xCd);
  var xCd = e => `%${e.charCodeAt(0).toString(16).toUpperCase()}`;
  var kgi = () => {};
  var OGr = __lazy(() => {
    kgi();
  });
  var DGr = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
  var MGr;
  var Agi = (e, t) => {
    if (typeof e !== "string") {
      throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
    }
    return t ? MGr.Buffer.from(e, t) : MGr.Buffer.from(e);
  };
  var NGr = __lazy(() => {
    MGr = require("buffer");
  });
  var tFt = e => {
    let t = Agi(e, "utf8");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength / Uint8Array.BYTES_PER_ELEMENT);
  };
  var LGr = __lazy(() => {
    NGr();
  });
  var v0e = e => {
    if (typeof e === "string") {
      return tFt(e);
    }
    if (ArrayBuffer.isView(e)) {
      return new Uint8Array(e.buffer, e.byteOffset, e.byteLength / Uint8Array.BYTES_PER_ELEMENT);
    }
    return new Uint8Array(e);
  };
  var Igi = __lazy(() => {
    LGr();
  });
  var Pgi = __lazy(() => {
    NGr();
  });
  var nFt = __lazy(() => {
    LGr();
    Igi();
    Pgi();
  });
  var FGr;
  var $gi;
  var Hgi;
  var jgi;
  var qgi;
  var Wgi;
  var Ggi;
  var jqe = __lazy(() => {
    FGr = "X-Amz-Date".toLowerCase();
    $gi = ["authorization", FGr, "date"];
    Hgi = "X-Amz-Signature".toLowerCase();
    jgi = "X-Amz-Security-Token".toLowerCase();
    qgi = {
      authorization: true,
      "cache-control": true,
      connection: true,
      expect: true,
      from: true,
      "keep-alive": true,
      "max-forwards": true,
      pragma: true,
      referer: true,
      te: true,
      trailer: true,
      "transfer-encoding": true,
      upgrade: true,
      "user-agent": true,
      "x-amzn-trace-id": true
    };
    Wgi = /^proxy-/;
    Ggi = /^sec-/;
  });
  var zRn;
  var BGr;
  var KRn = (e, t, n) => `${e}/${t}/${n}/${"aws4_request"}`;
  var Xgi = async (e, t, n, r, o) => {
    let s = await Jgi(e, t.secretAccessKey, t.accessKeyId);
    let i = `${n}:${r}:${o}:${_ne(s)}:${t.sessionToken}`;
    if (i in zRn) {
      return zRn[i];
    }
    BGr.push(i);
    while (BGr.length > 50) {
      delete zRn[BGr.shift()];
    }
    let a = `AWS4${t.secretAccessKey}`;
    for (let l of [n, r, o, "aws4_request"]) {
      a = await Jgi(e, a, l);
    }
    return zRn[i] = a;
  };
  var Jgi = (e, t, n) => {
    let r = new e(t);
    r.update(v0e(n));
    return r.digest();
  };
  var $Gr = __lazy(() => {
    eFt();
    nFt();
    jqe();
    zRn = {};
    BGr = [];
  });
  var YRn = ({
    headers: e
  }, t, n) => {
    let r = {};
    for (let o of Object.keys(e).sort()) {
      if (e[o] == null) {
        continue;
      }
      let s = o.toLowerCase();
      if (s in qgi || t?.vZc(s) || Wgi.test(s) || Ggi.test(s)) {
        if (!n || n && !n.vZc(s)) {
          continue;
        }
      }
      r[s] = e[o].trim().replace(/\s+/g, " ");
    }
    return r;
  };
  var HGr = __lazy(() => {
    jqe();
  });
  var jGr = ({
    query: e = {}
  }) => {
    let t = [];
    let n = {};
    for (let r of Object.keys(e).sort()) {
      if (r.toLowerCase() === Hgi) {
        continue;
      }
      t.push(r);
      let o = e[r];
      if (typeof o === "string") {
        n[r] = `${E0e(r)}=${E0e(o)}`;
      } else if (Array.isArray(o)) {
        n[r] = o.slice(0).reduce((s, i) => s.concat([`${E0e(r)}=${E0e(i)}`]), []).sort().join("&");
      }
    }
    return t.map(r => n[r]).filter(r => r).join("&");
  };
  var qGr = __lazy(() => {
    OGr();
    jqe();
  });
  var oFt = async ({
    headers: e,
    body: t
  }, n) => {
    for (let r of Object.keys(e)) {
      if (r.toLowerCase() === "x-amz-content-sha256") {
        return e[r];
      }
    }
    if (t == null) {
      return "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
    } else if (typeof t === "string" || ArrayBuffer.isView(t) || DGr(t)) {
      let r = new n();
      r.update(v0e(t));
      return _ne(await r.digest());
    }
    return "UNSIGNED-PAYLOAD";
  };
  var WGr = __lazy(() => {
    eFt();
    nFt();
    jqe();
  });
  class GGr {
    format(e) {
      let t = [];
      for (let o of Object.keys(e)) {
        let s = tFt(o);
        t.push(Uint8Array.from([s.byteLength]), s, this.formatHeaderValue(e[o]));
      }
      let n = new Uint8Array(t.reduce((o, s) => o + s.byteLength, 0));
      let r = 0;
      for (let o of t) {
        n.set(o, r);
        r += o.byteLength;
      }
      return n;
    }
    formatHeaderValue(e) {
      switch (e.type) {
        case "boolean":
          return Uint8Array.from([e.value ? 0 : 1]);
        case "byte":
          return Uint8Array.from([2, e.value]);
        case "short":
          let t = new DataView(new ArrayBuffer(3));
          t.setUint8(0, 3);
          t.setInt16(1, e.value, false);
          return new Uint8Array(t.buffer);
        case "integer":
          let n = new DataView(new ArrayBuffer(5));
          n.setUint8(0, 4);
          n.setInt32(1, e.value, false);
          return new Uint8Array(n.buffer);
        case "long":
          let r = new Uint8Array(9);
          r[0] = 5;
          r.set(e.value.bytes, 1);
          return r;
        case "binary":
          let o = new DataView(new ArrayBuffer(3 + e.value.byteLength));
          o.setUint8(0, 6);
          o.setUint16(1, e.value.byteLength, false);
          let s = new Uint8Array(o.buffer);
          s.set(e.value, 3);
          return s;
        case "string":
          let i = tFt(e.value);
          let a = new DataView(new ArrayBuffer(3 + i.byteLength));
          a.setUint8(0, 7);
          a.setUint16(1, i.byteLength, false);
          let l = new Uint8Array(a.buffer);
          l.set(i, 3);
          return l;
        case "timestamp":
          let c = new Uint8Array(9);
          c[0] = 8;
          c.set(VGr.fromNumber(e.value.valueOf()).bytes, 1);
          return c;
        case "uuid":
          if (!kCd.test(e.value)) {
            throw Error(`Invalid UUID received: ${e.value}`);
          }
          let u = new Uint8Array(17);
          u[0] = 9;
          u.set(ghi(e.value.replace(/\-/g, "")), 1);
          return u;
      }
    }
  }
  class VGr {
    constructor(e) {
      if (this.bytes = e, e.byteLength !== 8) {
        throw Error("Int64 buffers must be exactly 8 bytes");
      }
    }
    static fromNumber(e) {
      if (e > 9223372036854776000 || e < -9223372036854776000) {
        throw Error(`${e} is too large (or, if negative, too small) to represent as an Int64`);
      }
      let t = new Uint8Array(8);
      for (let n = 7, r = Math.abs(Math.round(e)); n > -1 && r > 0; n--, r /= 256) {
        t[n] = r;
      }
      if (e < 0) {
        Zgi(t);
      }
      return new VGr(t);
    }
    valueOf() {
      let e = this.bytes.slice(0);
      let t = e[0] & 128;
      if (t) {
        Zgi(e);
      }
      return parseInt(_ne(e), 16) * (t ? -1 : 1);
    }
    toString() {
      return String(this.valueOf());
    }
  }
  function Zgi(e) {
    for (let t = 0; t < 8; t++) {
      e[t] ^= 255;
    }
    for (let t = 7; t > -1; t--) {
      if (e[t]++, e[t] !== 0) {
        break;
      }
    }
  }
  var Qgi;
  var kCd;
  var eyi = __lazy(() => {
    eFt();
    nFt();
    (function (e) {
      e[e.boolTrue = 0] = "boolTrue";
      e[e.boolFalse = 1] = "boolFalse";
      e[e.byte = 2] = "byte";
      e[e.short = 3] = "short";
      e[e.integer = 4] = "integer";
      e[e.long = 5] = "long";
      e[e.byteArray = 6] = "byteArray";
      e[e.string = 7] = "string";
      e[e.timestamp = 8] = "timestamp";
      e[e.uuid = 9] = "uuid";
    })(Qgi || (Qgi = {}));
    kCd = /^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$/;
  });
  var tyi = (e, t) => {
    e = e.toLowerCase();
    for (let n of Object.keys(t)) {
      if (e === n.toLowerCase()) {
        return true;
      }
    }
    return false;
  };
  var JRn = ({
    headers: e,
    query: t,
    ...n
  }) => ({
    ...n,
    headers: {
      ...e
    },
    query: t ? ACd(t) : undefined
  });
  var ACd = e => Object.keys(e).reduce((t, n) => {
    let r = e[n];
    return {
      ...t,
      [n]: Array.isArray(r) ? [...r] : r
    };
  }, {});
  var zGr = (e, t = {}) => {
    let {
      headers: n,
      query: r = {}
    } = typeof e.clone === "function" ? e.clone() : JRn(e);
    for (let o of Object.keys(n)) {
      let s = o.toLowerCase();
      if (s.slice(0, 6) === "x-amz-" && !t.unhoistableHeaders?.vZc(s)) {
        r[o] = n[o];
        delete n[o];
      }
    }
    return {
      ...e,
      headers: n,
      query: r
    };
  };
  var KGr = () => {};
  var XRn = e => {
    e = typeof e.clone === "function" ? e.clone() : JRn(e);
    for (let t of Object.keys(e.headers)) {
      if ($gi.indexOf(t.toLowerCase()) > -1) {
        delete e.headers[t];
      }
    }
    return e;
  };
  var YGr = __lazy(() => {
    jqe();
  });
  var nyi = e => ICd(e).toISOString().replace(/\.\d{3}Z$/, "Z");
  var ICd = e => {
    if (typeof e === "number") {
      return new Date(e * 1000);
    }
    if (typeof e === "string") {
      if (Number(e)) {
        return new Date(Number(e) * 1000);
      }
      return new Date(e);
    }
    return e;
  };
  class qqe {
    constructor({
      applyChecksum: e,
      credentials: t,
      region: n,
      service: r,
      sha256: o,
      uriEscapePath: s = true
    }) {
      this.headerFormatter = new GGr();
      this.service = r;
      this.sha256 = o;
      this.uriEscapePath = s;
      this.applyChecksum = typeof e === "boolean" ? e : true;
      this.regionProvider = PGr(n);
      this.credentialProvider = PGr(t);
    }
    async presign(e, t = {}) {
      let {
        signingDate: n = new Date(),
        expiresIn: r = 3600,
        unsignableHeaders: o,
        unhoistableHeaders: s,
        signableHeaders: i,
        signingRegion: a,
        signingService: l
      } = t;
      let c = await this.credentialProvider();
      this.validateResolvedCredentials(c);
      let u = a ?? (await this.regionProvider());
      let {
        longDate: d,
        shortDate: p
      } = QRn(n);
      if (r > 604800) {
        return Promise.reject("Signature version 4 presigned URLs must have an expiration date less than one week in the future");
      }
      let m = KRn(p, u, l ?? this.service);
      let f = zGr(XRn(e), {
        unhoistableHeaders: s
      });
      if (c.sessionToken) {
        f.query["X-Amz-Security-Token"] = c.sessionToken;
      }
      f.query["X-Amz-Algorithm"] = "AWS4-HMAC-SHA256";
      f.query["X-Amz-Credential"] = `${c.accessKeyId}/${m}`;
      f.query["X-Amz-Date"] = d;
      f.query["X-Amz-Expires"] = r.toString(10);
      let h = YRn(f, o, i);
      f.query["X-Amz-SignedHeaders"] = ryi(h);
      f.query["X-Amz-Signature"] = await this.getSignature(d, m, this.getSigningKey(c, u, p, l), this.createCanonicalRequest(f, h, await oFt(e, this.sha256)));
      return f;
    }
    async sign(e, t) {
      if (typeof e === "string") {
        return this.signString(e, t);
      } else if (e.headers && e.payload) {
        return this.signEvent(e, t);
      } else if (e.message) {
        return this.signMessage(e, t);
      } else {
        return this.signRequest(e, t);
      }
    }
    async signEvent({
      headers: e,
      payload: t
    }, {
      signingDate: n = new Date(),
      priorSignature: r,
      signingRegion: o,
      signingService: s
    }) {
      let i = o ?? (await this.regionProvider());
      let {
        shortDate: a,
        longDate: l
      } = QRn(n);
      let c = KRn(a, i, s ?? this.service);
      let u = await oFt({
        headers: {},
        body: t
      }, this.sha256);
      let d = new this.sha256();
      d.update(e);
      let p = _ne(await d.digest());
      let m = ["AWS4-HMAC-SHA256-PAYLOAD", l, c, r, p, u].join(`
`);
      return this.signString(m, {
        signingDate: n,
        signingRegion: i,
        signingService: s
      });
    }
    async signMessage(e, {
      signingDate: t = new Date(),
      signingRegion: n,
      signingService: r
    }) {
      return this.signEvent({
        headers: this.headerFormatter.format(e.message.headers),
        payload: e.message.body
      }, {
        signingDate: t,
        signingRegion: n,
        signingService: r,
        priorSignature: e.priorSignature
      }).then(s => ({
        message: e.message,
        signature: s
      }));
    }
    async signString(e, {
      signingDate: t = new Date(),
      signingRegion: n,
      signingService: r
    } = {}) {
      let o = await this.credentialProvider();
      this.validateResolvedCredentials(o);
      let s = n ?? (await this.regionProvider());
      let {
        shortDate: i
      } = QRn(t);
      let a = new this.sha256(await this.getSigningKey(o, s, i, r));
      a.update(v0e(e));
      return _ne(await a.digest());
    }
    async signRequest(e, {
      signingDate: t = new Date(),
      signableHeaders: n,
      unsignableHeaders: r,
      signingRegion: o,
      signingService: s
    } = {}) {
      let i = await this.credentialProvider();
      this.validateResolvedCredentials(i);
      let a = o ?? (await this.regionProvider());
      let l = XRn(e);
      let {
        longDate: c,
        shortDate: u
      } = QRn(t);
      let d = KRn(u, a, s ?? this.service);
      if (l.headers[FGr] = c, i.sessionToken) {
        l.headers[jgi] = i.sessionToken;
      }
      let p = await oFt(l, this.sha256);
      if (!tyi("x-amz-content-sha256", l.headers) && this.applyChecksum) {
        l.headers["x-amz-content-sha256"] = p;
      }
      let m = YRn(l, r, n);
      let f = await this.getSignature(c, d, this.getSigningKey(i, a, u, s), this.createCanonicalRequest(l, m, p));
      l.headers["authorization"] = `${"AWS4-HMAC-SHA256"} Credential=${i.accessKeyId}/${d}, SignedHeaders=${ryi(m)}, Signature=${f}`;
      return l;
    }
    createCanonicalRequest(e, t, n) {
      let r = Object.keys(t).sort();
      return `${e.method}
${this.getCanonicalPath(e)}
${jGr(e)}
${r.map(o => `${o}:${t[o]}`).join(`
`)}

${r.join(";")}
${n}`;
    }
    async createStringToSign(e, t, n) {
      let r = new this.sha256();
      r.update(v0e(n));
      let o = await r.digest();
      return `${"AWS4-HMAC-SHA256"}
${e}
${t}
${_ne(o)}`;
    }
    getCanonicalPath({
      path: e
    }) {
      if (this.uriEscapePath) {
        let t = [];
        for (let o of e.split("/")) {
          if (o?.length === 0) {
            continue;
          }
          if (o === ".") {
            continue;
          }
          if (o === "..") {
            t.pop();
          } else {
            t.push(o);
          }
        }
        let n = `${e?.startsWith("/") ? "/" : ""}${t.join("/")}${t.length > 0 && e?.endsWith("/") ? "/" : ""}`;
        return E0e(n).replace(/%2F/g, "/");
      }
      return e;
    }
    async getSignature(e, t, n, r) {
      let o = await this.createStringToSign(e, t, r);
      let s = new this.sha256(await n);
      s.update(v0e(o));
      return _ne(await s.digest());
    }
    getSigningKey(e, t, n, r) {
      return Xgi(this.sha256, e, n, t, r || this.service);
    }
    validateResolvedCredentials(e) {
      if (typeof e !== "object" || typeof e.accessKeyId !== "string" || typeof e.secretAccessKey !== "string") {
        throw Error("Resolved credential object is not valid");
      }
    }
  }
  var QRn = e => {
    let t = nyi(e).replace(/[\-:]/g, "");
    return {
      longDate: t,
      shortDate: t.slice(0, 8)
    };
  };
  var ryi = e => Object.keys(e).sort().join(";");
  var oyi = __lazy(() => {
    eFt();
    xgi();
    OGr();
    nFt();
    jqe();
    $Gr();
    HGr();
    qGr();
    WGr();
    eyi();
    KGr();
    YGr();
  });
  var ZRn = __lazy(() => {
    HGr();
    qGr();
    WGr();
    KGr();
    YGr();
    oyi();
    $Gr();
  });
  var syi;
  var iyi;
  var ayi;
  var PCd = () => Promise.resolve().then(() => (zot(), Vot)).then(({
    fromNodeProviderChain: e
  }) => e({
    clientConfig: {
      requestHandler: new iyi.FetchHttpHandler({
        requestInit: t => ({
          ...t
        })
      })
    }
  })).catch(e => {
    throw Error(`Failed to import '@aws-sdk/credential-providers'.You can provide a custom \`providerChainResolver\` in the client options if your runtime does not have access to '@aws-sdk/credential-providers': \`new AnthropicBedrock({ providerChainResolver })\` Original error: ${e.message}`);
  });
  var lyi = async (e, t) => {
    ayi.default(e.method, "Expected request method property to be set");
    let n;
    if (t.awsAccessKey && t.awsSecretKey) {
      n = {
        accessKeyId: t.awsAccessKey,
        secretAccessKey: t.awsSecretKey,
        ...(t.awsSessionToken != null && {
          sessionToken: t.awsSessionToken
        })
      };
    } else {
      n = await (await (t.providerChainResolver ? t.providerChainResolver() : PCd()))();
    }
    let r = new qqe({
      service: "bedrock",
      region: t.regionName,
      credentials: n,
      sha256: syi.Sha256
    });
    let o = new URL(t.url);
    let s = !e.headers ? {} : Symbol.iterator in e.headers ? Object.fromEntries(Array.from(e.headers).map(l => [...l])) : {
      ...e.headers
    };
    delete s.connection;
    s.host = o.hostname;
    let i = new T0e({
      method: e.method.toUpperCase(),
      protocol: o.protocol,
      path: o.pathname,
      headers: s,
      body: e.body
    });
    return (await r.sign(i)).headers;
  };
  var cyi = __lazy(() => {
    Rst();
    ZRn();
    syi = __toESM(qRn(), 1);
    iyi = __toESM(nrt(), 1);
    ayi = __toESM(require("assert"));
  });