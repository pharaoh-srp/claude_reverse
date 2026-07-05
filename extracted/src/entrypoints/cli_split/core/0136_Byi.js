  function Byi(e) {
    if (e.length % 2 !== 0) {
      throw Error("Hex encoded strings must have an even number length");
    }
    let t = new Uint8Array(e.length / 2);
    for (let n = 0; n < e.length; n += 2) {
      let r = e.slice(n, n + 2).toLowerCase();
      if (r in e9r) {
        t[n / 2] = e9r[r];
      } else {
        throw Error(`Cannot decode unrecognized sequence ${r} as hexadecimal`);
      }
    }
    return t;
  }
  function C0e(e) {
    let t = "";
    for (let n = 0; n < e.byteLength; n++) {
      t += Uyi[e[n]];
    }
    return t;
  }
  var Uyi;
  var e9r;
  var t9r = __lazy(() => {
    Uyi = {};
    e9r = {};
    for (let e = 0; e < 256; e++) {
      let t = e.toString(16).toLowerCase();
      if (t.length === 1) {
        t = `0${t}`;
      }
      Uyi[e] = t;
      e9r[t] = e;
    }
  });
  class kst {
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
        $yi(t);
      }
      return new kst(t);
    }
    valueOf() {
      let e = this.bytes.slice(0);
      let t = e[0] & 128;
      if (t) {
        $yi(e);
      }
      return parseInt(C0e(e), 16) * (t ? -1 : 1);
    }
    toString() {
      return String(this.valueOf());
    }
  }
  function $yi(e) {
    for (let t = 0; t < 8; t++) {
      e[t] ^= 255;
    }
    for (let t = 7; t > -1; t--) {
      if (e[t]++, e[t] !== 0) {
        break;
      }
    }
  }
  var n9r = __lazy(() => {
    t9r();
  });
  class r9r {
    constructor(e, t) {
      this.toUtf8 = e;
      this.fromUtf8 = t;
    }
    format(e) {
      let t = [];
      for (let o of Object.keys(e)) {
        let s = this.fromUtf8(o);
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
          let i = this.fromUtf8(e.value);
          let a = new DataView(new ArrayBuffer(3 + i.byteLength));
          a.setUint8(0, 7);
          a.setUint16(1, i.byteLength, false);
          let l = new Uint8Array(a.buffer);
          l.set(i, 3);
          return l;
        case "timestamp":
          let c = new Uint8Array(9);
          c[0] = 8;
          c.set(kst.fromNumber(e.value.valueOf()).bytes, 1);
          return c;
        case "uuid":
          if (!rRd.test(e.value)) {
            throw Error(`Invalid UUID received: ${e.value}`);
          }
          let u = new Uint8Array(17);
          u[0] = 9;
          u.set(Byi(e.value.replace(/\-/g, "")), 1);
          return u;
      }
    }
    parse(e) {
      let t = {};
      let n = 0;
      while (n < e.byteLength) {
        let r = e.getUint8(n++);
        let o = this.toUtf8(new Uint8Array(e.buffer, e.byteOffset + n, r));
        switch (n += r, e.getUint8(n++)) {
          case 0:
            t[o] = {
              type: "boolean",
              value: true
            };
            break;
          case 1:
            t[o] = {
              type: "boolean",
              value: false
            };
            break;
          case 2:
            t[o] = {
              type: "byte",
              value: e.getInt8(n++)
            };
            break;
          case 3:
            t[o] = {
              type: "short",
              value: e.getInt16(n, false)
            };
            n += 2;
            break;
          case 4:
            t[o] = {
              type: "integer",
              value: e.getInt32(n, false)
            };
            n += 4;
            break;
          case 5:
            t[o] = {
              type: "long",
              value: new kst(new Uint8Array(e.buffer, e.byteOffset + n, 8))
            };
            n += 8;
            break;
          case 6:
            let s = e.getUint16(n, false);
            n += 2;
            t[o] = {
              type: "binary",
              value: new Uint8Array(e.buffer, e.byteOffset + n, s)
            };
            n += s;
            break;
          case 7:
            let i = e.getUint16(n, false);
            n += 2;
            t[o] = {
              type: "string",
              value: this.toUtf8(new Uint8Array(e.buffer, e.byteOffset + n, i))
            };
            n += i;
            break;
          case 8:
            t[o] = {
              type: "timestamp",
              value: new Date(new kst(new Uint8Array(e.buffer, e.byteOffset + n, 8)).valueOf())
            };
            n += 8;
            break;
          case 9:
            let a = new Uint8Array(e.buffer, e.byteOffset + n, 16);
            n += 16;
            t[o] = {
              type: "uuid",
              value: `${C0e(a.subarray(0, 4))}-${C0e(a.subarray(4, 6))}-${C0e(a.subarray(6, 8))}-${C0e(a.subarray(8, 10))}-${C0e(a.subarray(10))}`
            };
            break;
          default:
            throw Error("Unrecognized header type tag");
        }
      }
      return t;
    }
  }
  var Hyi;
  var rRd;
  var o9r = __lazy(() => {
    t9r();
    n9r();
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
    })(Hyi || (Hyi = {}));
    rRd = /^[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}$/;
  });
  function Gyi({
    byteLength: e,
    byteOffset: t,
    buffer: n
  }) {
    if (e < oRd) {
      throw Error("Provided message too short to accommodate event stream message overhead");
    }
    let r = new DataView(n, t, e);
    let o = r.getUint32(0, false);
    if (e !== o) {
      throw Error("Reported message length does not match received message length");
    }
    let s = r.getUint32(4, false);
    let i = r.getUint32(R0e, false);
    let a = r.getUint32(e - 4, false);
    let l = new qyi.Crc32().update(new Uint8Array(n, t, R0e));
    if (i !== l.digest()) {
      throw Error(`The prelude checksum specified in the message (${i}) does not match the calculated CRC32 checksum (${l.digest()})`);
    }
    if (l.update(new Uint8Array(n, t + R0e, e - (R0e + 4))), a !== l.digest()) {
      throw Error(`The message checksum (${l.digest()}) did not match the expected value of ${a}`);
    }
    return {
      headers: new DataView(n, t + R0e + 4, s),
      body: new Uint8Array(n, t + R0e + 4 + s, o - s - (R0e + 4 + 4))
    };
  }
  var qyi;
  var R0e;
  var oRd;
  var Vyi = __lazy(() => {
    qyi = __toESM(axn(), 1);
    R0e = 4 * 2;
    oRd = R0e + 4 * 2;
  });
  class s9r {
    constructor(e, t) {
      this.headerMarshaller = new r9r(e, t);
      this.messageBuffer = [];
      this.isEndOfStream = false;
    }
    feed(e) {
      this.messageBuffer.push(this.oC(e));
    }
    endOfStream() {
      this.isEndOfStream = true;
    }
    getMessage() {
      let e = this.messageBuffer.pop();
      let t = this.isEndOfStream;
      return {
        getMessage() {
          return e;
        },
        isEndOfStream() {
          return t;
        }
      };
    }
    getAvailableMessages() {
      let e = this.messageBuffer;
      this.messageBuffer = [];
      let t = this.isEndOfStream;
      return {
        getMessages() {
          return e;
        },
        isEndOfStream() {
          return t;
        }
      };
    }
    HS({
      headers: e,
      body: t
    }) {
      let n = this.headerMarshaller.format(e);
      let r = n.byteLength + t.byteLength + 16;
      let o = new Uint8Array(r);
      let s = new DataView(o.buffer, o.byteOffset, o.byteLength);
      let i = new zyi.Crc32();
      s.setUint32(0, r, false);
      s.setUint32(4, n.byteLength, false);
      s.setUint32(8, i.update(o.subarray(0, 8)).digest(), false);
      o.set(n, 12);
      o.set(t, n.byteLength + 12);
      s.setUint32(r - 4, i.update(o.subarray(8, r - 4)).digest(), false);
      return o;
    }
    oC(e) {
      let {
        headers: t,
        body: n
      } = Gyi(e);
      return {
        headers: this.headerMarshaller.parse(t),
        body: n
      };
    }
    formatHeaders(e) {
      return this.headerMarshaller.format(e);
    }
  }
  var zyi;
  var Kyi = __lazy(() => {
    o9r();
    Vyi();
    zyi = __toESM(axn(), 1);
  });
  var Yyi = () => {};
  var i9r;
  var Jyi = __lazy(() => {
    i9r = class i9r {
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.inputStream) {
          yield this.options.decoder.oC(e);
        }
      }
    };
  });
  var a9r;
  var Xyi = __lazy(() => {
    a9r = class a9r {
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.messageStream) {
          yield this.options.encoder.HS(e);
        }
        if (this.options.includeEndFrame) {
          yield new Uint8Array(0);
        }
      }
    };
  });
  var l9r;
  var Qyi = __lazy(() => {
    l9r = class l9r {
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.messageStream) {
          let t = await this.options.deserializer(e);
          if (t === undefined) {
            continue;
          }
          yield t;
        }
      }
    };
  });
  var c9r;
  var Zyi = __lazy(() => {
    c9r = class c9r {
      constructor(e) {
        this.options = e;
      }
      [Symbol.asyncIterator]() {
        return this.asyncIterator();
      }
      async *asyncIterator() {
        for await (let e of this.options.inputStream) {
          yield this.options.serializer(e);
        }
      }
    };
  });
  var e_i = __lazy(() => {
    Kyi();
    o9r();
    n9r();
    Yyi();
    Jyi();
    Xyi();
    Qyi();
    Zyi();
  });
  function t_i(e) {
    let t = 0;
    let n = 0;
    let r = null;
    let o = null;
    let s = a => {
      if (typeof a !== "number") {
        throw Error("Attempted to allocate an event message where size was not a number: " + a);
      }
      t = a;
      n = 4;
      r = new Uint8Array(a);
      new DataView(r.buffer).setUint32(0, a, false);
    };
    let i = async function* () {
      let a = e[Symbol.asyncIterator]();
      while (true) {
        let {
          value: l,
          done: c
        } = await a.next();
        if (c) {
          if (!t) {
            return;
          } else if (t === n) {
            yield r;
          } else {
            throw Error("Truncated event message received.");
          }
          return;
        }
        let u = l.length;
        let d = 0;
        while (d < u) {
          if (!r) {
            let m = u - d;
            if (!o) {
              o = new Uint8Array(4);
            }
            let f = Math.min(4 - n, m);
            if (o.set(l.slice(d, d + f), n), n += f, d += f, n < 4) {
              break;
            }
            s(new DataView(o.buffer).getUint32(0, false));
            o = null;
          }
          let p = Math.min(t - n, u - d);
          if (r.set(l.slice(d, d + p), n), n += p, d += p, t && t === n) {
            yield r;
            r = null;
            t = 0;
            n = 0;
          }
        }
      }
    };
    return {
      [Symbol.asyncIterator]: i
    };
  }
  function n_i(e, t) {
    return async function (n) {
      let {
        value: r
      } = n.headers[":message-type"];
      if (r === "error") {
        let o = Error(n.headers[":error-message"].value || "UnknownError");
        throw o.name = n.headers[":error-code"].value, o;
      } else if (r === "exception") {
        let o = n.headers[":exception-type"].value;
        let s = {
          [o]: n
        };
        let i = await e(s);
        if (i.$unknown) {
          let a = Error(t(n.body));
          throw a.name = o, a;
        }
        throw i[o];
      } else if (r === "event") {
        let o = {
          [n.headers[":event-type"].value]: n
        };
        let s = await e(o);
        if (s.$unknown) {
          return;
        }
        return s;
      } else {
        throw Error(`Unrecognizable event type: ${n.headers[":event-type"].value}`);
      }
    };
  }
  class lxn {
    constructor({
      utf8Encoder: e,
      utf8Decoder: t
    }) {
      this.eventStreamCodec = new s9r(e, t);
      this.utfEncoder = e;
    }
    deserialize(e, t) {
      let n = t_i(e);
      return new l9r({
        messageStream: new i9r({
          inputStream: n,
          decoder: this.eventStreamCodec
        }),
        deserializer: n_i(t, this.utfEncoder)
      });
    }
    serialize(e, t) {
      return new a9r({
        messageStream: new c9r({
          inputStream: e,
          serializer: t
        }),
        encoder: this.eventStreamCodec,
        includeEndFrame: true
      });
    }
  }
  var u9r = __lazy(() => {
    e_i();
  });
  var r_i = __lazy(() => {
    u9r();
  });
  var o_i = __lazy(() => {
    u9r();
    r_i();
  });
  async function* s_i(e) {
    let t = false;
    let n = false;
    let r = [];
    e.on("error", o => {
      if (!t) {
        t = true;
      }
      if (o) {
        throw o;
      }
    });
    e.on("data", o => {
      r.push(o);
    });
    e.on("end", () => {
      t = true;
    });
    while (!n) {
      let o = await new Promise(s => setTimeout(() => s(r.shift()), 0));
      if (o) {
        yield o;
      }
      n = t && r.length === 0;
    }
  }
  class cxn {
    constructor({
      utf8Encoder: e,
      utf8Decoder: t
    }) {
      this.universalMarshaller = new lxn({
        utf8Decoder: t,
        utf8Encoder: e
      });
    }
    deserialize(e, t) {
      let n = typeof e[Symbol.asyncIterator] === "function" ? e : s_i(e);
      return this.universalMarshaller.deserialize(n, t);
    }
    serialize(e, t) {
      return i_i.Readable.from(this.universalMarshaller.serialize(e, t));
    }
  }
  var i_i;
  var d9r = __lazy(() => {
    o_i();
    i_i = require("stream");
  });
  var a_i = __lazy(() => {
    d9r();
  });
  var l_i = __lazy(() => {
    d9r();
    a_i();
  });
  var sRd;
  var uxn = e => {
    if (e.length * 3 % 4 !== 0) {
      throw TypeError("Incorrect padding on base64 string.");
    }
    if (!sRd.exec(e)) {
      throw TypeError("Invalid base64 string.");
    }
    let t = VAe(e, "base64");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
  };
  var c_i = __lazy(() => {
    Ule();
    sRd = /^[A-Za-z0-9+/]*={0,2}$/;
  });
  var p9r = e => {
    let t = VAe(e, "utf8");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength / Uint8Array.BYTES_PER_ELEMENT);
  };
  var m9r = __lazy(() => {
    Ule();
  });
  var u_i = __lazy(() => {
    m9r();
  });
  var d_i = __lazy(() => {
    Ule();
  });
  var p_i = __lazy(() => {
    m9r();
    u_i();
    d_i();
  });
  var dxn = e => {
    let t;
    if (typeof e === "string") {
      t = p9r(e);
    } else {
      t = e;
    }
    if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
      throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
    }
    return rqe(t.buffer, t.byteOffset, t.byteLength).toString("base64");
  };
  var m_i = __lazy(() => {
    Ule();
    p_i();
  });
  var f9r = __lazy(() => {
    c_i();
    m_i();
  });
  var f_i = () => {};
  var h9r = __lazy(() => {
    f_i();
  });
  var h_i = __lazy(() => {
    h9r();
  });
  var g9r = e => {
    let t = VAe(e, "utf8");
    return new Uint8Array(t.buffer, t.byteOffset, t.byteLength / Uint8Array.BYTES_PER_ELEMENT);
  };
  var y9r = __lazy(() => {
    Ule();
  });
  var g_i = __lazy(() => {
    y9r();
  });
  var y_i = e => {
    if (typeof e === "string") {
      return e;
    }
    if (typeof e !== "object" || typeof e.byteOffset !== "number" || typeof e.byteLength !== "number") {
      throw Error("@smithy/util-utf8: toUtf8 encoder function only accepts string | Uint8Array.");
    }
    return rqe(e.buffer, e.byteOffset, e.byteLength).toString("utf8");
  };
  var __i = __lazy(() => {
    Ule();
  });
  var b_i = __lazy(() => {
    y9r();
    g_i();
    __i();
  });
  function S_i(e, t = "utf-8") {
    if (t === "base64") {
      return dxn(e);
    }
    return y_i(e);
  }
  function T_i(e, t) {
    if (t === "base64") {
      return A_e.mutate(uxn(e));
    }
    return A_e.mutate(g9r(e));
  }
  var E_i = __lazy(() => {
    f9r();
    b_i();
    _9r();
  });
  var A_e;
  var _9r = __lazy(() => {
    E_i();
    A_e = class A_e extends Uint8Array {
      static fromString(e, t = "utf-8") {
        switch (typeof e) {
          case "string":
            return T_i(e, t);
          default:
            throw Error(`Unsupported conversion from ${typeof e} to Uint8ArrayBlobAdapter.`);
        }
      }
      static mutate(e) {
        Object.setPrototypeOf(e, A_e.prototype);
        return e;
      }
      transformToString(e = "utf-8") {
        return S_i(this, e);
      }
    };
  });
  var v_i = () => {};
  var w_i = () => {};
  var C_i = __lazy(() => {
    w_i();
  });
  var b9r = __lazy(() => {
    C_i();
  });
  var R_i = () => {};
  var S9r = () => {};
  var T9r = () => {};
  var x_i = __lazy(() => {
    Rst();
    b9r();
    R_i();
    S9r();
    T9r();
  });
  var k_i = () => {};
  var A_i = __lazy(() => {
    k_i();
  });
  var I_i = __lazy(() => {
    Rst();
    b9r();
    S9r();
    A_i();
    T9r();
  });
  var P_i = () => {};
  var O_i = __lazy(() => {
    P_i();
  });
  var D_i = __lazy(() => {
    x_i();
    I_i();
    O_i();
  });
  var M_i = __lazy(() => {
    D_i();
    Ule();
  });
  var N_i = __lazy(() => {
    _9r();
    v_i();
    M_i();
  });
  var L_i = async (e = new Uint8Array(), t) => {
    if (e instanceof Uint8Array) {
      return A_e.mutate(e);
    }
    if (!e) {
      return A_e.mutate(new Uint8Array());
    }
    let n = t.streamCollector(e);
    return A_e.mutate(await n);
  };
  var F_i = __lazy(() => {
    N_i();
  });
  var U_i = __lazy(() => {
    h9r();
    GRn();
  });
  var U0g;
  var pRd = e => {
    if (e === null || e === undefined) {
      return;
    }
    if (Number.isInteger(e) && !Number.isNaN(e)) {
      return e;
    }
    throw TypeError(`Expected integer, got ${typeof e}: ${e}`);
  };
  var B_i = e => mRd(e, 32);
  var mRd = (e, t) => {
    let n = pRd(e);
    if (n !== undefined && fRd(n, t) !== n) {
      throw TypeError(`Expected ${t}-bit integer, got ${e}`);
    }
    return n;
  };
  var fRd = (e, t) => {
    switch (t) {
      case 32:
        return Int32Array.of(e)[0];
      case 16:
        return Int16Array.of(e)[0];
      case 8:
        return Int8Array.of(e)[0];
    }
  };
  var Ast = e => {
    if (e === null || e === undefined) {
      return;
    }
    if (typeof e === "string") {
      return e;
    }
    if (["boolean", "number", "bigint"].includes(typeof e)) {
      gRd.warn(hRd(`Expected string, got ${typeof e}: ${e}`));
      return String(e);
    }
    throw TypeError(`Expected string, got ${typeof e}: ${e}`);
  };
  var hRd = e => String(TypeError(e).stack || e).split(`
`).slice(0, 5).filter(t => !t.includes("stackTraceWarning")).join(`
`);
  var gRd;
  var E9r = __lazy(() => {
    U0g = Math.ceil(340282346638528860000000000000000000000);
    gRd = {
      warn: console.warn
    };
  });
  var G0g;
  var V0g;
  var z0g;
  var K0g;
  var Y0g;
  var $_i = __lazy(() => {
    E9r();
    G0g = new RegExp(/^(\d{4})-(\d{2})-(\d{2})[tT](\d{2}):(\d{2}):(\d{2})(?:\.(\d+))?[zZ]$/);
    V0g = new RegExp(/^(\d{4})-(\d{2})-(\d{2})[tT](\d{2}):(\d{2}):(\d{2})(?:\.(\d+))?(([-+]\d{2}\:\d{2})|[zZ])$/);
    z0g = new RegExp(/^(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun), (\d{2}) (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) (\d{4}) (\d{1,2}):(\d{2}):(\d{2})(?:\.(\d+))? GMT$/);
    K0g = new RegExp(/^(?:Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday), (\d{2})-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)-(\d{2}) (\d{1,2}):(\d{2}):(\d{2})(?:\.(\d+))? GMT$/);
    Y0g = new RegExp(/^(?:Mon|Tue|Wed|Thu|Fri|Sat|Sun) (Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec) ( [1-9]|\d{2}) (\d{1,2}):(\d{2}):(\d{2})(?:\.(\d+))? (\d{4})$/);
  });
  var Ist = (e, t = {}) => {
    Object.entries(t).filter(([, r]) => r !== undefined).forEach(([r, o]) => {
      if (e[r] == null || e[r] === "") {
        e[r] = o;
      }
    });
    let n = e.message || e.Message || "UnknownError";
    e.message = n;
    delete e.Message;
    return e;
  };
  var v9r = () => {};
  var H_i = __lazy(() => {
    v9r();
  });
  var j_i = __lazy(() => {
    GRn();
  });
  var q_i = __lazy(() => {
    j_i();
  });
  var W_i = __lazy(() => {
    q_i();
  });
  var w9r = function () {
    let e = Object.getPrototypeOf(this).constructor;
    let n = new (Function.bind.apply(String, [null, ...arguments]))();
    Object.setPrototypeOf(n, e.prototype);
    return n;
  };
  var G_i = __lazy(() => {
    w9r.prototype = Object.create(String.prototype, {
      constructor: {
        value: w9r,
        enumerable: false,
        writable: true,
        configurable: true
      }
    });
    Object.setPrototypeOf(w9r, String);
  });
  function Pst(e, t, n) {
    let r;
    let o;
    let s;
    if (typeof t > "u" && typeof n > "u") {
      r = {};
      s = e;
    } else if (r = e, typeof t === "function") {
      o = t;
      s = n;
      return yRd(r, o, s);
    } else {
      s = t;
    }
    for (let i of Object.keys(s)) {
      if (!Array.isArray(s[i])) {
        r[i] = s[i];
        continue;
      }
      V_i(r, null, s, i);
    }
    return r;
  }
  var Ost = (e, t) => {
    let n = {};
    for (let r in t) {
      V_i(n, e, t, r);
    }
    return n;
  };
  var yRd = (e, t, n) => Pst(e, Object.entries(n).reduce((r, [o, s]) => {
    if (Array.isArray(s)) {
      r[o] = s;
    } else if (typeof s === "function") {
      r[o] = [t, s()];
    } else {
      r[o] = [t, s];
    }
    return r;
  }, {}));
  var V_i = (e, t, n, r) => {
    if (t !== null) {
      let i = n[r];
      if (typeof i === "function") {
        i = [, i];
      }
      let [a = _Rd, l = bRd, c = r] = i;
      if (typeof a === "function" && a(t[c]) || typeof a !== "function" && !!a) {
        e[r] = l(t[c]);
      }
      return;
    }
    let [o, s] = n[r];
    if (typeof s === "function") {
      let i;
      let a = o === undefined && (i = s()) != null;
      let l = typeof o === "function" && !!o(undefined) || typeof o !== "function" && !!o;
      if (a) {
        e[r] = i;
      } else if (l) {
        e[r] = s();
      }
    } else {
      let i = o === undefined && s != null;
      let a = typeof o === "function" && !!o(s) || typeof o !== "function" && !!o;
      if (i || a) {
        e[r] = s;
      }
    }
  };
  var _Rd = e => e != null;
  var bRd = e => e;
  var z_i = () => {};
  var K_i = __lazy(() => {
    h_i();
    F_i();
    U_i();
    $_i();
    H_i();
    W_i();
    v9r();
    G_i();
    E9r();
    z_i();
  });
  var SRd = async (e, t) => {
    let n = Pst({});
    let r = e.body;
    let o = Ost(r, {
      message: Ast
    });
    Object.assign(n, o);
    let s = new InternalServerException_export({
      $metadata: pxn(e),
      ...n
    });
    return Ist(s, e.body);
  };
  var TRd = async (e, t) => {
    let n = Pst({});
    let r = e.body;
    let o = Ost(r, {
      message: Ast,
      originalMessage: Ast,
      originalStatusCode: B_i
    });
    Object.assign(n, o);
    let s = new ModelStreamErrorException({
      $metadata: pxn(e),
      ...n
    });
    return Ist(s, e.body);
  };
  var ERd = async (e, t) => {
    let n = Pst({});
    let r = e.body;
    let o = Ost(r, {
      message: Ast
    });
    Object.assign(n, o);
    let s = new ThrottlingException_export({
      $metadata: pxn(e),
      ...n
    });
    return Ist(s, e.body);
  };
  var vRd = async (e, t) => {
    let n = Pst({});
    let r = e.body;
    let o = Ost(r, {
      message: Ast
    });
    Object.assign(n, o);
    let s = new ValidationException_export({
      $metadata: pxn(e),
      ...n
    });
    return Ist(s, e.body);
  };
  var Y_i = (e, t) => t.eventStreamMarshaller.deserialize(e, async n => {
    if (n.chunk != null) {
      return {
        chunk: await RRd(n.chunk, t)
      };
    }
    if (n.internalServerException != null) {
      return {
        internalServerException: await wRd(n.internalServerException, t)
      };
    }
    if (n.modelStreamErrorException != null) {
      return {
        modelStreamErrorException: await CRd(n.modelStreamErrorException, t)
      };
    }
    if (n.validationException != null) {
      return {
        validationException: await kRd(n.validationException, t)
      };
    }
    if (n.throttlingException != null) {
      return {
        throttlingException: await xRd(n.throttlingException, t)
      };
    }
    return {
      $unknown: e
    };
  });
  var wRd = async (e, t) => {
    let n = {
      ...e,
      body: await sFt(e.body, t)
    };
    return SRd(n, t);
  };
  var CRd = async (e, t) => {
    let n = {
      ...e,
      body: await sFt(e.body, t)
    };
    return TRd(n, t);
  };
  var RRd = async (e, t) => {
    let n = {};
    let r = await sFt(e.body, t);
    Object.assign(n, ARd(r, t));
    return n;
  };
  var xRd = async (e, t) => {
    let n = {
      ...e,
      body: await sFt(e.body, t)
    };
    return ERd(n, t);
  };
  var kRd = async (e, t) => {
    let n = {
      ...e,
      body: await sFt(e.body, t)
    };
    return vRd(n, t);
  };
  var ARd = (e, t) => Ost(e, {
    bytes: t.base64Decoder
  });
  var pxn = e => ({
    httpStatusCode: e.statusCode,
    requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"] ?? "",
    extendedRequestId: e.headers["x-amz-id-2"] ?? "",
    cfId: e.headers["x-amz-cf-id"] ?? ""
  });
  var IRd = (e, t) => L_i(e, t).then(n => t.utf8Encoder(n));
  var sFt = (e, t) => IRd(e, t).then(n => {
    if (n.length) {
      return JSON.parse(n);
    }
    return {};
  });
  var J_i = __lazy(() => {
    K_i();
    rwn();
  });
  function X_i(e) {
    if (e[Symbol.asyncIterator]) {
      return e;
    }
    let t = e.getReader();
    return {
      async next() {
        try {
          let n = await t.read();
          if (n?.done) {
            t.releaseLock();
          }
          return n;
        } catch (n) {
          throw t.releaseLock(), n;
        }
      },
      async return() {
        let n = t.cancel();
        t.releaseLock();
        await n;
        return {
          done: true,
          value: undefined
        };
      },
      [Symbol.asyncIterator]() {
        return this;
      }
    };
  }
  var mxn = __lazy(() => {
    cI();
  });
  function fxn(e) {
    return e != null && typeof e === "object" && !Array.isArray(e);
  }
  var C9r = e => (C9r = Array.isArray, C9r(e));
  var Q_i = e => {
    try {
      return JSON.parse(e);
    } catch (t) {
      return;
    }
  };
  function aFt() {}
  function hxn(e, t, n) {
    if (!t || Z_i[e] > Z_i[n]) {
      return aFt;
    } else {
      return t[e].bind(t);
    }
  }
  function gxn(e) {
    let t = e.logger;
    let n = e.logLevel ?? "off";
    if (!t) {
      return ORd;
    }
    let r = ebi.get(t);
    if (r && r[0] === n) {
      return r[1];
    }
    let o = {
      error: hxn("error", t, n),
      warn: hxn("warn", t, n),
      info: hxn("info", t, n),
      debug: hxn("debug", t, n)
    };
    ebi.set(t, [n, o]);
    return o;
  }
  var Z_i;
  var ORd;
  var ebi;
  var x9r = __lazy(() => {
    Z_i = {
      off: 0,
      error: 200,
      warn: 300,
      info: 400,
      debug: 500
    };
    ORd = {
      error: aFt,
      warn: aFt,
      info: aFt,
      debug: aFt
    };
    ebi = new WeakMap();
  });
  function MRd(e) {
    return typeof e === "object" && e !== null && ("name" in e && e.name === "AbortError" || "message" in e && String(e.message).includes("FetchRequestCanceledException"));
  }
  var nbi;
  var k9r = e => new TextDecoder("utf-8").oC(e);
  var tbi = e => new TextEncoder().HS(e);
  var DRd = () => {
    let e = new cxn({
      utf8Encoder: k9r,
      utf8Decoder: tbi
    });
    return {
      base64Decoder: uxn,
      base64Encoder: dxn,
      utf8Decoder: tbi,
      utf8Encoder: k9r,
      eventStreamMarshaller: e,
      streamCollector: nbi.streamCollector
    };
  };
  var yxn;
  var rbi = __lazy(() => {
    l_i();
    f9r();
    Ecn();
    Uge();
    CN();
    J_i();
    x9r();
    nbi = __toESM(nrt(), 1);
    yxn = class yxn extends cj {
      static fromSSEResponse(e, t, n) {
        let r = false;
        let o = n ? gxn(n) : console;
        async function* s() {
          if (!e.body) {
            throw t.abort(), new mi("Attempted to iterate over a response with no body");
          }
          let a = X_i(e.body);
          let l = Y_i(a, DRd());
          for await (let c of l) {
            if (c.chunk && c.chunk.bytes) {
              yield {
                event: "chunk",
                data: k9r(c.chunk.bytes),
                raw: []
              };
            } else if (c.internalServerException) {
              yield {
                event: "error",
                data: "InternalServerException",
                raw: []
              };
            } else if (c.modelStreamErrorException) {
              yield {
                event: "error",
                data: "ModelStreamErrorException",
                raw: []
              };
            } else if (c.validationException) {
              yield {
                event: "error",
                data: "ValidationException",
                raw: []
              };
            } else if (c.throttlingException) {
              yield {
                event: "error",
                data: "ThrottlingException",
                raw: []
              };
            }
          }
        }
        async function* i() {
          if (r) {
            throw Error("Cannot iterate over a consumed stream, use `.tee()` to split the stream.");
          }
          r = true;
          let a = false;
          try {
            for await (let l of s()) {
              if (l.event === "chunk") {
                let c;
                try {
                  c = JSON.parse(l.data);
                } catch (u) {
                  throw o.error("Could not parse message into JSON:", l.data), o.error("From chunk:", l.raw), u;
                }
                if (c && typeof c === "object" && c.type === "error") {
                  throw new Ho(undefined, c, undefined, e.headers, c.error?.type);
                }
                yield c;
              }
              if (l.event === "error") {
                let c = l.data;
                let u = Q_i(c);
                let d = u ? undefined : c;
                throw Ho.generate(undefined, u, d, e.headers);
              }
            }
            a = true;
          } catch (l) {
            if (MRd(l)) {
              return;
            }
            throw l;
          } finally {
            if (!a) {
              t.abort();
            }
          }
        }
        return new yxn(i, t);
      }
    };
  });
  var I_e = e => {
    if (typeof globalThis.process < "u") {
      return globalThis.process.env?.[e]?.trim() || undefined;
    }
    if (typeof globalThis.Deno < "u") {
      return globalThis.Deno.env?.get?.(e)?.trim() || undefined;
    }
    return;
  };
  function* NRd(e) {
    if (!e) {
      return;
    }
    if (obi in e) {
      let {
        values: r,
        nulls: o
      } = e;
      yield* r.entries();
      for (let s of o) {
        yield [s, null];
      }
      return;
    }
    let t = false;
    let n;
    if (e instanceof Headers) {
      n = e.entries();
    } else if (C9r(e)) {
      n = e;
    } else {
      t = true;
      n = Object.entries(e ?? {});
    }
    for (let r of n) {
      let o = r[0];
      if (typeof o !== "string") {
        throw TypeError("expected header name to be a string");
      }
      let s = C9r(r[1]) ? r[1] : [r[1]];
      let i = false;
      for (let a of s) {
        if (a === undefined) {
          continue;
        }
        if (t && !i) {
          i = true;
          yield [o, null];
        }
        yield [o, a];
      }
    }
  }
  var obi;
  var Dst = e => {
    let t = new Headers();
    let n = new Set();
    for (let r of e) {
      let o = new Set();
      for (let [s, i] of NRd(r)) {
        let a = s.toLowerCase();
        if (!o.vZc(a)) {
          t.delete(s);
          o.add(a);
        }
        if (i === null) {
          t.delete(s);
          n.add(a);
        } else {
          t.append(s, i);
          n.delete(a);
        }
      }
    }
    return {
      [obi]: true,
      values: t,
      nulls: n
    };
  };
  var A9r = __lazy(() => {
    obi = Symbol.for("brand.privateNullableHeaders");
  });
  function ibi(e) {
    return e.replace(/[^A-Za-z0-9\-._~!$&'()*+,;=:@]+/g, encodeURIComponent);
  }
  var sbi;
  var LRd = (e = ibi) => function (n, ...r) {
    if (n.length === 1) {
      return n[0];
    }
    let o = false;
    let s = [];
    let i = n.reduce((u, d, p) => {
      if (/[?#]/.test(d)) {
        o = true;
      }
      let m = r[p];
      let f = (o ? encodeURIComponent : e)("" + m);
      if (p !== r.length && (m == null || typeof m === "object" && m.toString === Object.getPrototypeOf(Object.getPrototypeOf(m.hasOwnProperty ?? sbi) ?? sbi)?.toString)) {
        f = m + "";
        s.push({
          start: u.length + d.length,
          length: f.length,
          error: `Value of type ${Object.prototype.toString.call(m).slice(8, -1)} is not a valid path parameter`
        });
      }
      return u + d + (p === r.length ? "" : f);
    }, "");
    let a = i.split(/[?#]/, 1)[0];
    let l = /(?<=^|\/)(?:\.|%2e){1,2}(?=\/|$)/gi;
    let c;
    while ((c = l.exec(a)) !== null) {
      s.push({
        start: c.index,
        length: c[0].length,
        error: `Value "${c[0]}" can't be safely passed as a path parameter`
      });
    }
    if (s.sort((u, d) => u.start - d.start), s.length > 0) {
      let u = 0;
      let d = s.reduce((p, m) => {
        let f = " ".repeat(m.start - u);
        let h = "^".repeat(m.length);
        u = m.start + m.length;
        return p + f + h;
      }, "");
      throw new mi(`Path parameters result in path with invalid segments:
${s.map(p => p.error).join(`
`)}
${i}
${d}`);
    }
    return i;
  };
  var I9r;
  var abi = __lazy(() => {
    mxn();
    sbi = Object.freeze(Object.create(null));
    I9r = LRd(ibi);
  });
  function BRd(e) {
    let t = new uj(e);
    delete t.batches;
    delete t.countTokens;
    return t;
  }
  function $Rd(e) {
    let t = new BR(e);
    delete t.promptCaching;
    delete t.messages.batches;
    delete t.messages.countTokens;
    return t;
  }
  var URd;
  var AnthropicBedrock;
  var O9r = __lazy(() => {
    qZe();
    cyi();
    rbi();
    A9r();
    abi();
    x9r();
    URd = new Set(["/v1/complete", "/v1/messages", "/v1/messages?beta=true"]);
    AnthropicBedrock = class P9r extends BaseAnthropic {
      constructor({
        awsRegion: e = I_e("AWS_REGION") ?? "us-east-1",
        baseURL: t = I_e("ANTHROPIC_BEDROCK_BASE_URL") ?? `https://bedrock-runtime.${e}.amazonaws.com`,
        apiKey: n = I_e("AWS_BEARER_TOKEN_BEDROCK"),
        awsSecretKey: r = null,
        awsAccessKey: o = null,
        awsSessionToken: s = null,
        providerChainResolver: i = null,
        ...a
      } = {}) {
        super({
          baseURL: t,
          authToken: n,
          ...a
        });
        this.skipAuth = false;
        this.messages = BRd(this);
        this.completions = new bxe(this);
        this.beta = $Rd(this);
        let l = o != null;
        let c = r != null;
        if (l !== c) {
          gxn(this).warn("Warning: Passing only one of `awsAccessKey` or `awsSecretKey` is deprecated. Please provide both keys, or provide neither and rely on the AWS credential provider chain.");
        }
        this.awsSecretKey = r;
        this.awsAccessKey = o;
        this.awsRegion = e;
        this.awsSessionToken = s;
        this.skipAuth = a.skipAuth ?? false;
        this.providerChainResolver = i;
      }
      validateHeaders() {}
      async prepareRequest(e, {
        url: t,
        options: n
      }) {
        if (this.skipAuth) {
          e.headers.delete("Authorization");
          return;
        }
        if (this.authToken) {
          return;
        }
        let r = this.awsRegion;
        if (!r) {
          throw Error("Expected `awsRegion` option to be passed to the client or the `AWS_REGION` environment variable to be present");
        }
        let o = await lyi(e, {
          url: t,
          regionName: r,
          awsAccessKey: this.awsAccessKey,
          awsSecretKey: this.awsSecretKey,
          awsSessionToken: this.awsSessionToken,
          fetchOptions: this.fetchOptions,
          providerChainResolver: this.providerChainResolver
        });
        e.headers = Dst([o, e.headers]).values;
      }
      async buildRequest(e) {
        if (e.__streamClass = yxn, fxn(e.body)) {
          e.body = {
            ...e.body
          };
        }
        if (fxn(e.body)) {
          if (!e.body.anthropic_version) {
            e.body.anthropic_version = "bedrock-2023-05-31";
          }
          if (e.headers && !e.body.anthropic_beta) {
            let t = Dst([e.headers]).values.get("anthropic-beta");
            if (t != null) {
              e.body.anthropic_beta = t.split(",");
            }
          }
        }
        if (URd.vZc(e.path) && e.method === "post") {
          if (!fxn(e.body)) {
            throw Error("Expected request body to be an object for post /v1/messages");
          }
          let t = e.body.model;
          e.body.model = undefined;
          let n = e.body.stream;
          if (e.body.stream = undefined, n) {
            e.path = I9r`/model/${t}/invoke-with-response-stream`;
          } else {
            e.path = I9r`/model/${t}/invoke`;
          }
        }
        return super.buildRequest(e);
      }
    };
  });
  var lbi;
  var cbi;
  var ubi;
  var HRd = e => Promise.resolve().then(() => (zot(), Vot)).then(({
    fromNodeProviderChain: t
  }) => t({
    ...(e != null ? {
      profile: e
    } : {}),
    clientConfig: {
      requestHandler: new cbi.FetchHttpHandler({
        requestInit: n => ({
          ...n
        })
      })
    }
  })).catch(t => {
    throw Error(`Failed to import '@aws-sdk/credential-providers'. You can provide a custom \`providerChainResolver\` in the client options if your runtime does not have access to '@aws-sdk/credential-providers': \`new AnthropicAws({ providerChainResolver })\` Original error: ${t.message}`);
  });
  var dbi = async (e, t) => {
    ubi.default(e.method, "Expected request method property to be set");
    let n;
    if (t.awsAccessKey && t.awsSecretAccessKey) {
      n = {
        accessKeyId: t.awsAccessKey,
        secretAccessKey: t.awsSecretAccessKey,
        ...(t.awsSessionToken != null && {
          sessionToken: t.awsSessionToken
        })
      };
    } else if (t.providerChainResolver) {
      n = await (await t.providerChainResolver())();
    } else {
      n = await (await HRd(t.awsProfile))();
    }
    let r = new qqe({
      service: t.serviceName,
      region: t.regionName,
      credentials: n,
      sha256: lbi.Sha256
    });
    let o = new URL(t.url);
    let s = !e.headers ? {} : Symbol.iterator in e.headers ? Object.fromEntries(Array.from(e.headers).map(c => [...c])) : {
      ...e.headers
    };
    delete s.connection;
    s.host = o.hostname;
    let i = {};
    o.searchParams.forEach((c, u) => {
      i[u] = c;
    });
    let a = new T0e({
      method: e.method.toUpperCase(),
      protocol: o.protocol,
      path: o.pathname,
      query: i,
      headers: s,
      body: e.body
    });
    return (await r.sign(a)).headers;
  };
  var pbi = __lazy(() => {
    Rst();
    ZRn();
    lbi = __toESM(qRn(), 1);
    cbi = __toESM(nrt(), 1);
    ubi = __toESM(require("assert"));
  });
  function qRd(e) {
    let {
      messages: t
    } = new BR(e);
    return {
      messages: t
    };
  }
  var AnthropicBedrockMantle;
  var mbi = __lazy(() => {
    A9r();
    mxn();
    qZe();
    pbi();
    AnthropicBedrockMantle = class D9r extends BaseAnthropic {
      constructor({
        awsRegion: e,
        baseURL: t,
        apiKey: n,
        awsAccessKey: r = null,
        awsSecretAccessKey: o = null,
        awsSessionToken: s = null,
        awsProfile: i,
        providerChainResolver: a = null,
        skipAuth: l = false,
        ...c
      } = {}) {
        let u = e ?? I_e("AWS_REGION") ?? I_e("AWS_DEFAULT_REGION");
        let d = t ?? I_e("ANTHROPIC_BEDROCK_MANTLE_BASE_URL") ?? (u ? `https://bedrock-mantle.${u}.api.aws/anthropic` : undefined);
        if (!d) {
          throw new mi("No AWS region or base URL found. Set `awsRegion` in the constructor, the `AWS_REGION` / `AWS_DEFAULT_REGION` environment variable, or provide a `baseURL` / `ANTHROPIC_BEDROCK_MANTLE_BASE_URL` environment variable.");
        }
        let p = n != null;
        if (r != null !== (o != null)) {
          throw new mi("`awsAccessKey` and `awsSecretAccessKey` must be provided together. You provided only one.");
        }
        let f = r != null && o != null;
        let h = i != null;
        let g;
        if (p) {
          g = n;
        } else if (!f && !h) {
          g = I_e("AWS_BEARER_TOKEN_BEDROCK") ?? undefined;
        }
        super({
          apiKey: g,
          baseURL: d,
          ...c
        });
        this.messages = new uj(this);
        this.beta = qRd(this);
        this.skipAuth = false;
        this.awsRegion = u;
        this.awsAccessKey = r;
        this.awsSecretAccessKey = o;
        this.awsSessionToken = s;
        this.awsProfile = i ?? null;
        this.providerChainResolver = a;
        this.skipAuth = l;
        this._useSigV4 = g == null;
      }
      async authHeaders(e) {
        if (this.skipAuth) {
          return;
        }
        if (!this._useSigV4) {
          return Dst([{
            Authorization: `Bearer ${this.apiKey}`
          }]);
        }
        return;
      }
      validateHeaders() {}
      async prepareRequest(e, {
        url: t,
        options: n
      }) {
        if (this.skipAuth || !this._useSigV4) {
          return;
        }
        let r = this.awsRegion;
        if (!r) {
          throw new mi("No AWS region found. Set `awsRegion` in the constructor or the `AWS_REGION` / `AWS_DEFAULT_REGION` environment variable.");
        }
        let o = await dbi(e, {
          url: t,
          regionName: r,
          serviceName: "bedrock-mantle",
          awsAccessKey: this.awsAccessKey,
          awsSecretAccessKey: this.awsSecretAccessKey,
          awsSessionToken: this.awsSessionToken,
          awsProfile: this.awsProfile,
          providerChainResolver: this.providerChainResolver
        });
        e.headers = Dst([o, e.headers]).values;
      }
    };
  });
  var Gqe = {};