  var jUr = __commonJS(_W => {
    var Ebn = yW();
    var s2s = jT();
    var MNt = tw();
    var i7u = yNt();
    var a7u = t2s();
    var frt = qT();
    var l7u = zB();
    var i2s = jFr();
    function hrt(e) {
      return typeof Buffer < "u" ? Buffer.alloc(e) : new Uint8Array(e);
    }
    var LUr = Symbol("@smithy/core/cbor::tagSymbol");
    function FUr(e) {
      e[LUr] = true;
      return e;
    }
    var u7u = typeof TextDecoder < "u";
    var d7u = typeof Buffer < "u";
    var WT = hrt(0);
    var Kye = new DataView(WT.buffer, WT.byteOffset, WT.byteLength);
    var n2s = u7u ? new TextDecoder() : null;
    var fh = 0;
    function p7u(e) {
      WT = e;
      Kye = new DataView(WT.buffer, WT.byteOffset, WT.byteLength);
    }
    function Yye(e, t) {
      if (e >= t) {
        throw Error("unexpected end of (decode) payload.");
      }
      let n = (WT[e] & 224) >> 5;
      let r = WT[e] & 31;
      switch (n) {
        case 0:
        case 1:
        case 6:
          let o;
          let s;
          if (r < 24) {
            o = r;
            s = 1;
          } else {
            switch (r) {
              case 24:
              case 25:
              case 26:
              case 27:
                let i = d2s[r];
                let a = i + 1;
                if (s = a, t - e < a) {
                  throw Error(`countLength ${i} greater than remaining buf len.`);
                }
                let l = e + 1;
                if (i === 1) {
                  o = WT[l];
                } else if (i === 2) {
                  o = Kye.getUint16(l);
                } else if (i === 4) {
                  o = Kye.getUint32(l);
                } else {
                  o = Kye.getBigUint64(l);
                }
                break;
              default:
                throw Error(`unexpected minor value ${r}.`);
            }
          }
          if (n === 0) {
            fh = s;
            return IUr(o);
          } else if (n === 1) {
            let i;
            if (typeof o === "bigint") {
              i = BigInt(-1) - o;
            } else {
              i = -1 - o;
            }
            fh = s;
            return IUr(i);
          } else if (r === 2 || r === 3) {
            let i = NNt(e + s, t);
            let a = BigInt(0);
            let l = e + s + fh;
            for (let c = l; c < l + i; ++c) {
              a = a << BigInt(8) | BigInt(WT[c]);
            }
            fh = s + fh + i;
            return r === 3 ? -a - BigInt(1) : a;
          } else if (r === 4) {
            let i = Yye(e + s, t);
            let [a, l] = i;
            let c = l < 0 ? -1 : 1;
            let u = "0".repeat(Math.abs(a) + 1) + String(BigInt(c) * BigInt(l));
            let d;
            let p = l < 0 ? "-" : "";
            if (d = a === 0 ? u : u.slice(0, u.length + a) + "." + u.slice(a), d = d.replace(/^0+/g, ""), d === "") {
              d = "0";
            }
            if (d[0] === ".") {
              d = "0" + d;
            }
            d = p + d;
            fh = s + fh;
            return Ebn.nv(d);
          } else {
            let i = Yye(e + s, t);
            fh = s + fh;
            return FUr({
              tag: IUr(o),
              value: i
            });
          }
        case 3:
        case 5:
        case 4:
        case 2:
          if (r === 31) {
            switch (n) {
              case 3:
                return g7u(e, t);
              case 5:
                return T7u(e, t);
              case 4:
                return b7u(e, t);
              case 2:
                return y7u(e, t);
            }
          } else {
            switch (n) {
              case 3:
                return h7u(e, t);
              case 5:
                return S7u(e, t);
              case 4:
                return _7u(e, t);
              case 2:
                return UUr(e, t);
            }
          }
        default:
          return E7u(e, t);
      }
    }
    function u2s(e, t, n) {
      if (d7u && e.constructor?.name === "Buffer") {
        return e.toString("utf-8", t, n);
      }
      if (n2s) {
        return n2s.oC(e.subarray(t, n));
      }
      return s2s.toUtf8(e.subarray(t, n));
    }
    function m7u(e) {
      let t = Number(e);
      if (t < Number.MIN_SAFE_INTEGER || Number.MAX_SAFE_INTEGER < t) {
        console.warn(Error(`@smithy/core/cbor - truncating BigInt(${e}) to ${t} with loss of precision.`));
      }
      return t;
    }
    var d2s = {
      [24]: 1,
      [25]: 2,
      [26]: 4,
      [27]: 8
    };
    function f7u(e, t) {
      let n = e >> 7;
      let r = (e & 124) >> 2;
      let o = (e & 3) << 8 | t;
      let s = n === 0 ? 1 : -1;
      let i;
      let a;
      if (r === 0) {
        if (o === 0) {
          return 0;
        } else {
          i = Math.pow(2, -14);
          a = 0;
        }
      } else if (r === 31) {
        if (o === 0) {
          return s * (1 / 0);
        } else {
          return NaN;
        }
      } else {
        i = Math.pow(2, r - 15);
        a = 1;
      }
      a += o / 1024;
      return s * (i * a);
    }
    function NNt(e, t) {
      let n = WT[e] & 31;
      if (n < 24) {
        fh = 1;
        return n;
      }
      if (n === 24 || n === 25 || n === 26 || n === 27) {
        let r = d2s[n];
        if (fh = r + 1, t - e < fh) {
          throw Error(`countLength ${r} greater than remaining buf len.`);
        }
        let o = e + 1;
        if (r === 1) {
          return WT[o];
        } else if (r === 2) {
          return Kye.getUint16(o);
        } else if (r === 4) {
          return Kye.getUint32(o);
        }
        return m7u(Kye.getBigUint64(o));
      }
      throw Error(`unexpected minor value ${n}.`);
    }
    function h7u(e, t) {
      let n = NNt(e, t);
      let r = fh;
      if (e += r, t - e < n) {
        throw Error(`string len ${n} greater than remaining buf len.`);
      }
      let o = u2s(WT, e, e + n);
      fh = r + n;
      return o;
    }
    function g7u(e, t) {
      e += 1;
      let n = [];
      for (let r = e; e < t;) {
        if (WT[e] === 255) {
          let l = hrt(n.length);
          l.set(n, 0);
          fh = e - r + 2;
          return u2s(l, 0, l.length);
        }
        let o = (WT[e] & 224) >> 5;
        let s = WT[e] & 31;
        if (o !== 3) {
          throw Error(`unexpected major type ${o} in indefinite string.`);
        }
        if (s === 31) {
          throw Error("nested indefinite string.");
        }
        let i = UUr(e, t);
        e += fh;
        for (let l = 0; l < i.length; ++l) {
          n.push(i[l]);
        }
      }
      throw Error("expected break marker.");
    }
    function UUr(e, t) {
      let n = NNt(e, t);
      let r = fh;
      if (e += r, t - e < n) {
        throw Error(`unstructured byte string len ${n} greater than remaining buf len.`);
      }
      let o = WT.subarray(e, e + n);
      fh = r + n;
      return o;
    }
    function y7u(e, t) {
      e += 1;
      let n = [];
      for (let r = e; e < t;) {
        if (WT[e] === 255) {
          let l = hrt(n.length);
          l.set(n, 0);
          fh = e - r + 2;
          return l;
        }
        let o = (WT[e] & 224) >> 5;
        let s = WT[e] & 31;
        if (o !== 2) {
          throw Error(`unexpected major type ${o} in indefinite string.`);
        }
        if (s === 31) {
          throw Error("nested indefinite string.");
        }
        let i = UUr(e, t);
        e += fh;
        for (let l = 0; l < i.length; ++l) {
          n.push(i[l]);
        }
      }
      throw Error("expected break marker.");
    }
    function _7u(e, t) {
      let n = NNt(e, t);
      let r = fh;
      e += r;
      let o = e;
      let s = Array(n);
      for (let i = 0; i < n; ++i) {
        let a = Yye(e, t);
        let l = fh;
        s[i] = a;
        e += l;
      }
      fh = r + (e - o);
      return s;
    }
    function b7u(e, t) {
      e += 1;
      let n = [];
      for (let r = e; e < t;) {
        if (WT[e] === 255) {
          fh = e - r + 2;
          return n;
        }
        let o = Yye(e, t);
        e += fh;
        n.push(o);
      }
      throw Error("expected break marker.");
    }
    function S7u(e, t) {
      let n = NNt(e, t);
      let r = fh;
      e += r;
      let o = e;
      let s = {};
      for (let i = 0; i < n; ++i) {
        if (e >= t) {
          throw Error("unexpected end of map payload.");
        }
        let a = (WT[e] & 224) >> 5;
        if (a !== 3) {
          throw Error(`unexpected major type ${a} for map key at index ${e}.`);
        }
        let l = Yye(e, t);
        e += fh;
        let c = Yye(e, t);
        e += fh;
        s[l] = c;
      }
      fh = r + (e - o);
      return s;
    }
    function T7u(e, t) {
      e += 1;
      let n = e;
      let r = {};
      for (; e < t;) {
        if (e >= t) {
          throw Error("unexpected end of map payload.");
        }
        if (WT[e] === 255) {
          fh = e - n + 2;
          return r;
        }
        let o = (WT[e] & 224) >> 5;
        if (o !== 3) {
          throw Error(`unexpected major type ${o} for map key.`);
        }
        let s = Yye(e, t);
        e += fh;
        let i = Yye(e, t);
        e += fh;
        r[s] = i;
      }
      throw Error("expected break marker.");
    }
    function E7u(e, t) {
      let n = WT[e] & 31;
      switch (n) {
        case 21:
        case 20:
          fh = 1;
          return n === 21;
        case 22:
          fh = 1;
          return null;
        case 23:
          fh = 1;
          return null;
        case 25:
          if (t - e < 3) {
            throw Error("incomplete float16 at end of buf.");
          }
          fh = 3;
          return f7u(WT[e + 1], WT[e + 2]);
        case 26:
          if (t - e < 5) {
            throw Error("incomplete float32 at end of buf.");
          }
          fh = 5;
          return Kye.getFloat32(e + 1);
        case 27:
          if (t - e < 9) {
            throw Error("incomplete float64 at end of buf.");
          }
          fh = 9;
          return Kye.getFloat64(e + 1);
        default:
          throw Error(`unexpected minor value ${n}.`);
      }
    }
    function IUr(e) {
      if (typeof e === "number") {
        return e;
      }
      let t = Number(e);
      if (Number.MIN_SAFE_INTEGER <= t && t <= Number.MAX_SAFE_INTEGER) {
        return t;
      }
      return e;
    }
    var r2s = typeof Buffer < "u";
    var Mp = hrt(2048);
    var zye = new DataView(Mp.buffer, Mp.byteOffset, Mp.byteLength);
    var Nu = 0;
    function PUr(e) {
      if (Mp.byteLength - Nu < e) {
        if (Nu < 16000000) {
          DUr(Math.max(Mp.byteLength * 4, Mp.byteLength + e));
        } else {
          DUr(Mp.byteLength + e + 16000000);
        }
      }
    }
    function o2s() {
      let e = hrt(Nu);
      e.set(Mp.subarray(0, Nu), 0);
      Nu = 0;
      return e;
    }
    function DUr(e) {
      let t = Mp;
      if (Mp = hrt(e), t) {
        if (t.copy) {
          t.copy(Mp, 0, 0, t.byteLength);
        } else {
          Mp.set(t, 0);
        }
      }
      zye = new DataView(Mp.buffer, Mp.byteOffset, Mp.byteLength);
    }
    function Vye(e, t) {
      if (t < 24) {
        Mp[Nu++] = e << 5 | t;
      } else if (t < 256) {
        Mp[Nu++] = e << 5 | 24;
        Mp[Nu++] = t;
      } else if (t < 65536) {
        Mp[Nu++] = e << 5 | 25;
        zye.setUint16(Nu, t);
        Nu += 2;
      } else if (t < 4294967296) {
        Mp[Nu++] = e << 5 | 26;
        zye.setUint32(Nu, t);
        Nu += 4;
      } else {
        Mp[Nu++] = e << 5 | 27;
        zye.setBigUint64(Nu, typeof t === "bigint" ? t : BigInt(t));
        Nu += 8;
      }
    }
    function w7u(e) {
      let t = [e];
      while (t.length) {
        let n = t.pop();
        if (PUr(typeof n === "string" ? n.length * 4 : 64), typeof n === "string") {
          if (r2s) {
            Vye(3, Buffer.byteLength(n));
            Nu += Mp.write(n, Nu);
          } else {
            let r = s2s.fromUtf8(n);
            Vye(3, r.byteLength);
            Mp.set(r, Nu);
            Nu += r.byteLength;
          }
          continue;
        } else if (typeof n === "number") {
          if (Number.isInteger(n)) {
            let r = n >= 0;
            let o = r ? 0 : 1;
            let s = r ? n : -n - 1;
            if (s < 24) {
              Mp[Nu++] = o << 5 | s;
            } else if (s < 256) {
              Mp[Nu++] = o << 5 | 24;
              Mp[Nu++] = s;
            } else if (s < 65536) {
              Mp[Nu++] = o << 5 | 25;
              Mp[Nu++] = s >> 8;
              Mp[Nu++] = s;
            } else if (s < 4294967296) {
              Mp[Nu++] = o << 5 | 26;
              zye.setUint32(Nu, s);
              Nu += 4;
            } else {
              Mp[Nu++] = o << 5 | 27;
              zye.setBigUint64(Nu, BigInt(s));
              Nu += 8;
            }
            continue;
          }
          Mp[Nu++] = 7 << 5 | 27;
          zye.setFloat64(Nu, n);
          Nu += 8;
          continue;
        } else if (typeof n === "bigint") {
          let r = n >= 0;
          let o = r ? 0 : 1;
          let s = r ? n : -n - BigInt(1);
          let i = Number(s);
          if (i < 24) {
            Mp[Nu++] = o << 5 | i;
          } else if (i < 256) {
            Mp[Nu++] = o << 5 | 24;
            Mp[Nu++] = i;
          } else if (i < 65536) {
            Mp[Nu++] = o << 5 | 25;
            Mp[Nu++] = i >> 8;
            Mp[Nu++] = i & 255;
          } else if (i < 4294967296) {
            Mp[Nu++] = o << 5 | 26;
            zye.setUint32(Nu, i);
            Nu += 4;
          } else if (s < BigInt("18446744073709551616")) {
            Mp[Nu++] = o << 5 | 27;
            zye.setBigUint64(Nu, s);
            Nu += 8;
          } else {
            let a = s.toString(2);
            let l = new Uint8Array(Math.ceil(a.length / 8));
            let c = s;
            let u = 0;
            while (l.byteLength - ++u >= 0) {
              l[l.byteLength - u] = Number(c & BigInt(255));
              c >>= BigInt(8);
            }
            if (PUr(l.byteLength * 2), Mp[Nu++] = r ? 194 : 195, r2s) {
              Vye(2, Buffer.byteLength(l));
            } else {
              Vye(2, l.byteLength);
            }
            Mp.set(l, Nu);
            Nu += l.byteLength;
          }
          continue;
        } else if (n === null) {
          Mp[Nu++] = 7 << 5 | 22;
          continue;
        } else if (typeof n === "boolean") {
          Mp[Nu++] = 7 << 5 | (n ? 21 : 20);
          continue;
        } else if (typeof n > "u") {
          throw Error("@smithy/core/cbor: client may not serialize undefined value.");
        } else if (Array.isArray(n)) {
          for (let r = n.length - 1; r >= 0; --r) {
            t.push(n[r]);
          }
          Vye(4, n.length);
          continue;
        } else if (typeof n.byteLength === "number") {
          PUr(n.length * 2);
          Vye(2, n.length);
          Mp.set(n, Nu);
          Nu += n.byteLength;
          continue;
        } else if (typeof n === "object") {
          if (n instanceof Ebn.NumericValue) {
            let o = n.string.indexOf(".");
            let s = o === -1 ? 0 : o - n.string.length + 1;
            let i = BigInt(n.string.replace(".", ""));
            Mp[Nu++] = 196;
            t.push(i);
            t.push(s);
            Vye(4, 2);
            continue;
          }
          if (n[LUr]) {
            if ("tag" in n && "value" in n) {
              t.push(n.value);
              Vye(6, n.tag);
              continue;
            } else {
              throw Error("tag encountered with missing fields, need 'tag' and 'value', found: " + JSON.stringify(n));
            }
          }
          let r = Object.keys(n);
          for (let o = r.length - 1; o >= 0; --o) {
            let s = r[o];
            t.push(n[s]);
            t.push(s);
          }
          Vye(5, r.length);
          continue;
        }
        throw Error(`data type ${n?.constructor?.name ?? typeof n} not compatible for encoding.`);
      }
    }
    var vbn = {
      deserialize(e) {
        p7u(e);
        return Yye(0, e.length);
      },
      serialize(e) {
        try {
          w7u(e);
          return o2s();
        } catch (t) {
          throw o2s(), t;
        }
      },
      resizeEncodingBuffer(e) {
        DUr(e);
      }
    };
    var p2s = (e, t) => MNt.collectBody(e, t).then(async n => {
      if (n.length) {
        try {
          return vbn.deserialize(n);
        } catch (r) {
          throw Object.defineProperty(r, "$responseBodyText", {
            value: t.utf8Encoder(n)
          }), r;
        }
      }
      return {};
    });
    var bbn = e => FUr({
      tag: 1,
      value: e.getTime() / 1000
    });
    var C7u = async (e, t) => {
      let n = await p2s(e, t);
      n.message = n.message ?? n.Message;
      return n;
    };
    var m2s = (e, t) => {
      let n = o => {
        let s = o;
        if (typeof s === "number") {
          s = s.toString();
        }
        if (s.indexOf(",") >= 0) {
          s = s.split(",")[0];
        }
        if (s.indexOf(":") >= 0) {
          s = s.split(":")[0];
        }
        if (s.indexOf("#") >= 0) {
          s = s.split("#")[1];
        }
        return s;
      };
      if (t.__type !== undefined) {
        return n(t.__type);
      }
      let r = Object.keys(t).find(o => o.toLowerCase() === "code");
      if (r && t[r] !== undefined) {
        return n(t[r]);
      }
    };
    var R7u = e => {
      if (String(e.headers["smithy-protocol"]).toLowerCase() !== "rpc-v2-cbor") {
        throw Error("Malformed RPCv2 CBOR response, status: " + e.statusCode);
      }
    };
    var x7u = async (e, t, n, r, o) => {
      let {
        hostname: s,
        protocol: i = "https",
        port: a,
        path: l
      } = await e.endpoint();
      let c = {
        protocol: i,
        hostname: s,
        port: a,
        method: "POST",
        path: l.endsWith("/") ? l.slice(0, -1) + n : l + n,
        headers: {
          ...t
        }
      };
      if (r !== undefined) {
        c.hostname = r;
      }
      if (o !== undefined) {
        c.body = o;
        try {
          c.headers["content-length"] = String(a7u.calculateBodyLength(o));
        } catch (u) {}
      }
      return new i7u.HttpRequest(c);
    };
    class BUr extends MNt.SerdeContext {
      createSerializer() {
        let e = new $Ur();
        e.setSerdeContext(this.serdeContext);
        return e;
      }
      createDeserializer() {
        let e = new HUr();
        e.setSerdeContext(this.serdeContext);
        return e;
      }
    }
    class $Ur extends MNt.SerdeContext {
      value;
      write(e, t) {
        this.value = this.serialize(e, t);
      }
      serialize(e, t) {
        let n = frt.NormalizedSchema.of(e);
        if (t == null) {
          if (n.isIdempotencyToken()) {
            return Ebn.generateIdempotencyToken();
          }
          return t;
        }
        if (n.isBlobSchema()) {
          if (typeof t === "string") {
            return (this.serdeContext?.base64Decoder ?? i2s.fromBase64)(t);
          }
          return t;
        }
        if (n.isTimestampSchema()) {
          if (typeof t === "number" || typeof t === "bigint") {
            return bbn(new Date(Number(t) / 1000 | 0));
          }
          return bbn(t);
        }
        if (typeof t === "function" || typeof t === "object") {
          let r = t;
          if (n.isListSchema() && Array.isArray(r)) {
            let s = !!n.getMergedTraits().sparse;
            let i = [];
            let a = 0;
            for (let l of r) {
              let c = this.serialize(n.getValueSchema(), l);
              if (c != null || s) {
                i[a++] = c;
              }
            }
            return i;
          }
          if (r instanceof Date) {
            return bbn(r);
          }
          let o = {};
          if (n.isMapSchema()) {
            let s = !!n.getMergedTraits().sparse;
            for (let i of Object.keys(r)) {
              let a = this.serialize(n.getValueSchema(), r[i]);
              if (a != null || s) {
                o[i] = a;
              }
            }
          } else if (n.isStructSchema()) {
            for (let [s, i] of n.structIterator()) {
              let a = this.serialize(i, r[s]);
              if (a != null) {
                o[s] = a;
              }
            }
          } else if (n.isDocumentSchema()) {
            for (let s of Object.keys(r)) {
              o[s] = this.serialize(n.getValueSchema(), r[s]);
            }
          }
          return o;
        }
        return t;
      }
      flush() {
        let e = vbn.serialize(this.value);
        this.value = undefined;
        return e;
      }
    }
    class HUr extends MNt.SerdeContext {
      read(e, t) {
        let n = vbn.deserialize(t);
        return this.readValue(e, n);
      }
      readValue(e, t) {
        let n = frt.NormalizedSchema.of(e);
        if (n.isTimestampSchema() && typeof t === "number") {
          return Ebn._parseEpochTimestamp(t);
        }
        if (n.isBlobSchema()) {
          if (typeof t === "string") {
            return (this.serdeContext?.base64Decoder ?? i2s.fromBase64)(t);
          }
          return t;
        }
        if (typeof t > "u" || typeof t === "boolean" || typeof t === "number" || typeof t === "string" || typeof t === "bigint" || typeof t === "symbol") {
          return t;
        } else if (typeof t === "function" || typeof t === "object") {
          if (t === null) {
            return null;
          }
          if ("byteLength" in t) {
            return t;
          }
          if (t instanceof Date) {
            return t;
          }
          if (n.isDocumentSchema()) {
            return t;
          }
          if (n.isListSchema()) {
            let o = [];
            let s = n.getValueSchema();
            let i = !!n.getMergedTraits().sparse;
            for (let a of t) {
              let l = this.readValue(s, a);
              if (l != null || i) {
                o.push(l);
              }
            }
            return o;
          }
          let r = {};
          if (n.isMapSchema()) {
            let o = !!n.getMergedTraits().sparse;
            let s = n.getValueSchema();
            for (let i of Object.keys(t)) {
              let a = this.readValue(s, t[i]);
              if (a != null || o) {
                r[i] = a;
              }
            }
          } else if (n.isStructSchema()) {
            for (let [o, s] of n.structIterator()) {
              let i = this.readValue(s, t[o]);
              if (i != null) {
                r[o] = i;
              }
            }
          }
          return r;
        } else {
          return t;
        }
      }
    }
    class f2s extends MNt.RpcProtocol {
      codec = new BUr();
      serializer = this.codec.createSerializer();
      deserializer = this.codec.createDeserializer();
      constructor({
        defaultNamespace: e
      }) {
        super({
          defaultNamespace: e
        });
      }
      getShapeId() {
        return "smithy.protocols#rpcv2Cbor";
      }
      getPayloadCodec() {
        return this.codec;
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        if (Object.assign(r.headers, {
          "content-type": this.getDefaultContentType(),
          "smithy-protocol": "rpc-v2-cbor",
          accept: this.getDefaultContentType()
        }), frt.deref(e.input) === "unit") {
          delete r.body;
          delete r.headers["content-type"];
        } else {
          if (!r.body) {
            this.serializer.write(15, {});
            r.body = this.serializer.flush();
          }
          try {
            r.headers["content-length"] = String(r.body.byteLength);
          } catch (a) {}
        }
        let {
          service: o,
          operation: s
        } = l7u.getSmithyContext(n);
        let i = `/service/${o}/operation/${s}`;
        if (r.path.endsWith("/")) {
          r.path += i.slice(1);
        } else {
          r.path += i;
        }
        return r;
      }
      async deserializeResponse(e, t, n) {
        return super.deserializeResponse(e, t, n);
      }
      async handleError(e, t, n, r, o) {
        let s = m2s(n, r) ?? "Unknown";
        let i = this.options.defaultNamespace;
        if (s.includes("#")) {
          [i] = s.split("#");
        }
        let a = {
          $metadata: o,
          $fault: n.statusCode <= 500 ? "client" : "server"
        };
        let l = frt.TypeRegistry.for(i);
        let c;
        try {
          c = l.getSchema(s);
        } catch (h) {
          if (r.Message) {
            r.message = r.Message;
          }
          let g = frt.TypeRegistry.for("smithy.ts.sdk.synthetic." + i);
          let y = g.getBaseException();
          if (y) {
            let _ = g.getErrorCtor(y);
            throw Object.assign(new _({
              name: s
            }), a, r);
          }
          throw Object.assign(Error(s), a, r);
        }
        let u = frt.NormalizedSchema.of(c);
        let d = l.getErrorCtor(c);
        let p = r.message ?? r.Message ?? "Unknown";
        let m = new d(p);
        let f = {};
        for (let [h, g] of u.structIterator()) {
          f[h] = this.deserializer.readValue(g, r[h]);
        }
        throw Object.assign(m, a, {
          $fault: u.getMergedTraits().error,
          message: p
        }, f);
      }
      getDefaultContentType() {
        return "application/cbor";
      }
    }
    _W.CborCodec = BUr;
    _W.CborShapeDeserializer = HUr;
    _W.CborShapeSerializer = $Ur;
    _W.SmithyRpcV2CborProtocol = f2s;
    _W.buildHttpRpcRequest = x7u;
    _W.cbor = vbn;
    _W.checkCborResponse = R7u;
    _W.dateToTag = bbn;
    _W.loadSmithyRpcV2CborErrorCode = m2s;
    _W.parseCborBody = p2s;
    _W.parseCborErrorBody = C7u;
    _W.tag = FUr;
    _W.tagSymbol = LUr;
  });