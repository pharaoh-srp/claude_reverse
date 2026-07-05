  var wf = __commonJS((X0y, Ita) => {
    Ita.exports = {
      options: {
        usePureJavaScript: false
      }
    };
  });
  var Dta = __commonJS((Q0y, Ota) => {
    var xso = {};
    Ota.exports = xso;
    var Pta = {};
    xso.HS = function (e, t, n) {
      if (typeof t !== "string") {
        throw TypeError('"alphabet" must be a string.');
      }
      if (n !== undefined && typeof n !== "number") {
        throw TypeError('"maxline" must be a number.');
      }
      var r = "";
      if (!(e instanceof Uint8Array)) {
        r = Gsp(e, t);
      } else {
        var o = 0;
        var s = t.length;
        var i = t.charAt(0);
        var a = [0];
        for (o = 0; o < e.length; ++o) {
          for (var l = 0, c = e[o]; l < a.length; ++l) {
            c += a[l] << 8;
            a[l] = c % s;
            c = c / s | 0;
          }
          while (c > 0) {
            a.push(c % s);
            c = c / s | 0;
          }
        }
        for (o = 0; e[o] === 0 && o < e.length - 1; ++o) {
          r += i;
        }
        for (o = a.length - 1; o >= 0; --o) {
          r += t[a[o]];
        }
      }
      if (n) {
        var u = new RegExp(".{1," + n + "}", "g");
        r = r.match(u).join(`\r
`);
      }
      return r;
    };
    xso.oC = function (e, t) {
      if (typeof e !== "string") {
        throw TypeError('"input" must be a string.');
      }
      if (typeof t !== "string") {
        throw TypeError('"alphabet" must be a string.');
      }
      var n = Pta[t];
      if (!n) {
        n = Pta[t] = [];
        for (var r = 0; r < t.length; ++r) {
          n[t.charCodeAt(r)] = r;
        }
      }
      e = e.replace(/\s/g, "");
      var o = t.length;
      var s = t.charAt(0);
      var i = [0];
      for (var r = 0; r < e.length; r++) {
        var a = n[e.charCodeAt(r)];
        if (a === undefined) {
          return;
        }
        for (var l = 0, c = a; l < i.length; ++l) {
          c += i[l] * o;
          i[l] = c & 255;
          c >>= 8;
        }
        while (c > 0) {
          i.push(c & 255);
          c >>= 8;
        }
      }
      for (var u = 0; e[u] === s && u < e.length - 1; ++u) {
        i.push(0);
      }
      if (typeof Buffer < "u") {
        return Buffer.from(i.reverse());
      }
      return new Uint8Array(i.reverse());
    };
    function Gsp(e, t) {
      var n = 0;
      var r = t.length;
      var o = t.charAt(0);
      var s = [0];
      for (n = 0; n < e.length(); ++n) {
        for (var i = 0, a = e.at(n); i < s.length; ++i) {
          a += s[i] << 8;
          s[i] = a % r;
          a = a / r | 0;
        }
        while (a > 0) {
          s.push(a % r);
          a = a / r | 0;
        }
      }
      var l = "";
      for (n = 0; e.at(n) === 0 && n < e.length() - 1; ++n) {
        l += o;
      }
      for (n = s.length - 1; n >= 0; --n) {
        l += t[s[n]];
      }
      return l;
    }
  });
  var g_ = __commonJS((Z0y, Fta) => {
    var Mta = wf();
    var Nta = Dta();
    var Cr = Fta.exports = Mta.util = Mta.util || {};
    (function () {
      if (typeof process < "u" && process.nextTick) {
        if (Cr.nextTick = process.nextTick, typeof setImmediate === "function") {
          Cr.setImmediate = setImmediate;
        } else {
          Cr.setImmediate = Cr.nextTick;
        }
        return;
      }
      if (typeof setImmediate === "function") {
        Cr.setImmediate = function () {
          return setImmediate.apply(undefined, arguments);
        };
        Cr.nextTick = function (a) {
          return setImmediate(a);
        };
        return;
      }
      if (Cr.setImmediate = function (a) {
        setTimeout(a, 0);
      }, typeof window < "u" && typeof window.postMessage === "function") {
        let a = function (l) {
          if (l.source === window && l.data === e) {
            l.stopPropagation();
            var c = t.slice();
            t.length = 0;
            c.forEach(function (u) {
              u();
            });
          }
        };
        var i = a;
        var e = "forge.setImmediate";
        var t = [];
        Cr.setImmediate = function (l) {
          if (t.push(l), t.length === 1) {
            window.postMessage(e, "*");
          }
        };
        window.addEventListener("message", a, true);
      }
      if (typeof MutationObserver < "u") {
        var n = Date.now();
        var r = true;
        var o = document.createElement("div");
        var t = [];
        new MutationObserver(function () {
          var l = t.slice();
          t.length = 0;
          l.forEach(function (c) {
            c();
          });
        }).observe(o, {
          attributes: true
        });
        var s = Cr.setImmediate;
        Cr.setImmediate = function (l) {
          if (Date.now() - n > 15) {
            n = Date.now();
            s(l);
          } else if (t.push(l), t.length === 1) {
            o.setAttribute("a", r = !r);
          }
        };
      }
      Cr.nextTick = Cr.setImmediate;
    })();
    Cr.isNodejs = typeof process < "u" && process.versions && process.versions.node;
    Cr.globalScope = function () {
      if (Cr.isNodejs) {
        return global;
      }
      return typeof self > "u" ? window : self;
    }();
    Cr.isArray = Array.isArray || function (e) {
      return Object.prototype.toString.call(e) === "[object Array]";
    };
    Cr.isArrayBuffer = function (e) {
      return typeof ArrayBuffer < "u" && e instanceof ArrayBuffer;
    };
    Cr.isArrayBufferView = function (e) {
      return e && Cr.isArrayBuffer(e.buffer) && e.byteLength !== undefined;
    };
    function lqt(e) {
      if (!(e === 8 || e === 16 || e === 24 || e === 32)) {
        throw Error("Only 8, 16, 24, or 32 bits supported: " + e);
      }
    }
    Cr.ByteBuffer = kso;
    function kso(e) {
      if (this.data = "", this.read = 0, typeof e === "string") {
        this.data = e;
      } else if (Cr.isArrayBuffer(e) || Cr.isArrayBufferView(e)) {
        if (typeof Buffer < "u" && e instanceof Buffer) {
          this.data = e.toString("binary");
        } else {
          var t = new Uint8Array(e);
          try {
            this.data = String.fromCharCode.apply(null, t);
          } catch (r) {
            for (var n = 0; n < t.length; ++n) {
              this.putByte(t[n]);
            }
          }
        }
      } else if (e instanceof kso || typeof e === "object" && typeof e.data === "string" && typeof e.read === "number") {
        this.data = e.data;
        this.read = e.read;
      }
      this._constructedStringLength = 0;
    }
    Cr.ByteStringBuffer = kso;
    Cr.ByteStringBuffer.prototype._optimizeConstructedString = function (e) {
      if (this._constructedStringLength += e, this._constructedStringLength > 4096) {
        this.data.substr(0, 1);
        this._constructedStringLength = 0;
      }
    };
    Cr.ByteStringBuffer.prototype.length = function () {
      return this.data.length - this.read;
    };
    Cr.ByteStringBuffer.prototype.isEmpty = function () {
      return this.length() <= 0;
    };
    Cr.ByteStringBuffer.prototype.putByte = function (e) {
      return this.putBytes(String.fromCharCode(e));
    };
    Cr.ByteStringBuffer.prototype.fillWithByte = function (e, t) {
      e = String.fromCharCode(e);
      var n = this.data;
      while (t > 0) {
        if (t & 1) {
          n += e;
        }
        if (t >>>= 1, t > 0) {
          e += e;
        }
      }
      this.data = n;
      this._optimizeConstructedString(t);
      return this;
    };
    Cr.ByteStringBuffer.prototype.putBytes = function (e) {
      this.data += e;
      this._optimizeConstructedString(e.length);
      return this;
    };
    Cr.ByteStringBuffer.prototype.putString = function (e) {
      return this.putBytes(Cr.encodeUtf8(e));
    };
    Cr.ByteStringBuffer.prototype.putInt16 = function (e) {
      return this.putBytes(String.fromCharCode(e >> 8 & 255) + String.fromCharCode(e & 255));
    };
    Cr.ByteStringBuffer.prototype.putInt24 = function (e) {
      return this.putBytes(String.fromCharCode(e >> 16 & 255) + String.fromCharCode(e >> 8 & 255) + String.fromCharCode(e & 255));
    };
    Cr.ByteStringBuffer.prototype.putInt32 = function (e) {
      return this.putBytes(String.fromCharCode(e >> 24 & 255) + String.fromCharCode(e >> 16 & 255) + String.fromCharCode(e >> 8 & 255) + String.fromCharCode(e & 255));
    };
    Cr.ByteStringBuffer.prototype.putInt16Le = function (e) {
      return this.putBytes(String.fromCharCode(e & 255) + String.fromCharCode(e >> 8 & 255));
    };
    Cr.ByteStringBuffer.prototype.putInt24Le = function (e) {
      return this.putBytes(String.fromCharCode(e & 255) + String.fromCharCode(e >> 8 & 255) + String.fromCharCode(e >> 16 & 255));
    };
    Cr.ByteStringBuffer.prototype.putInt32Le = function (e) {
      return this.putBytes(String.fromCharCode(e & 255) + String.fromCharCode(e >> 8 & 255) + String.fromCharCode(e >> 16 & 255) + String.fromCharCode(e >> 24 & 255));
    };
    Cr.ByteStringBuffer.prototype.putInt = function (e, t) {
      lqt(t);
      var n = "";
      do {
        t -= 8;
        n += String.fromCharCode(e >> t & 255);
      } while (t > 0);
      return this.putBytes(n);
    };
    Cr.ByteStringBuffer.prototype.putSignedInt = function (e, t) {
      if (e < 0) {
        e += 2 << t - 1;
      }
      return this.putInt(e, t);
    };
    Cr.ByteStringBuffer.prototype.putBuffer = function (e) {
      return this.putBytes(e.getBytes());
    };
    Cr.ByteStringBuffer.prototype.getByte = function () {
      return this.data.charCodeAt(this.read++);
    };
    Cr.ByteStringBuffer.prototype.getInt16 = function () {
      var e = this.data.charCodeAt(this.read) << 8 ^ this.data.charCodeAt(this.read + 1);
      this.read += 2;
      return e;
    };
    Cr.ByteStringBuffer.prototype.getInt24 = function () {
      var e = this.data.charCodeAt(this.read) << 16 ^ this.data.charCodeAt(this.read + 1) << 8 ^ this.data.charCodeAt(this.read + 2);
      this.read += 3;
      return e;
    };
    Cr.ByteStringBuffer.prototype.getInt32 = function () {
      var e = this.data.charCodeAt(this.read) << 24 ^ this.data.charCodeAt(this.read + 1) << 16 ^ this.data.charCodeAt(this.read + 2) << 8 ^ this.data.charCodeAt(this.read + 3);
      this.read += 4;
      return e;
    };
    Cr.ByteStringBuffer.prototype.getInt16Le = function () {
      var e = this.data.charCodeAt(this.read) ^ this.data.charCodeAt(this.read + 1) << 8;
      this.read += 2;
      return e;
    };
    Cr.ByteStringBuffer.prototype.getInt24Le = function () {
      var e = this.data.charCodeAt(this.read) ^ this.data.charCodeAt(this.read + 1) << 8 ^ this.data.charCodeAt(this.read + 2) << 16;
      this.read += 3;
      return e;
    };
    Cr.ByteStringBuffer.prototype.getInt32Le = function () {
      var e = this.data.charCodeAt(this.read) ^ this.data.charCodeAt(this.read + 1) << 8 ^ this.data.charCodeAt(this.read + 2) << 16 ^ this.data.charCodeAt(this.read + 3) << 24;
      this.read += 4;
      return e;
    };
    Cr.ByteStringBuffer.prototype.getInt = function (e) {
      lqt(e);
      var t = 0;
      do {
        t = (t << 8) + this.data.charCodeAt(this.read++);
        e -= 8;
      } while (e > 0);
      return t;
    };
    Cr.ByteStringBuffer.prototype.getSignedInt = function (e) {
      var t = this.getInt(e);
      var n = 2 << e - 2;
      if (t >= n) {
        t -= n << 1;
      }
      return t;
    };
    Cr.ByteStringBuffer.prototype.getBytes = function (e) {
      var t;
      if (e) {
        e = Math.min(this.length(), e);
        t = this.data.slice(this.read, this.read + e);
        this.read += e;
      } else if (e === 0) {
        t = "";
      } else {
        t = this.read === 0 ? this.data : this.data.slice(this.read);
        this.clear();
      }
      return t;
    };
    Cr.ByteStringBuffer.prototype.bytes = function (e) {
      return typeof e > "u" ? this.data.slice(this.read) : this.data.slice(this.read, this.read + e);
    };
    Cr.ByteStringBuffer.prototype.at = function (e) {
      return this.data.charCodeAt(this.read + e);
    };
    Cr.ByteStringBuffer.prototype.setAt = function (e, t) {
      this.data = this.data.substr(0, this.read + e) + String.fromCharCode(t) + this.data.substr(this.read + e + 1);
      return this;
    };
    Cr.ByteStringBuffer.prototype.last = function () {
      return this.data.charCodeAt(this.data.length - 1);
    };
    Cr.ByteStringBuffer.prototype.copy = function () {
      var e = Cr.createBuffer(this.data);
      e.read = this.read;
      return e;
    };
    Cr.ByteStringBuffer.prototype.compact = function () {
      if (this.read > 0) {
        this.data = this.data.slice(this.read);
        this.read = 0;
      }
      return this;
    };
    Cr.ByteStringBuffer.prototype.clear = function () {
      this.data = "";
      this.read = 0;
      return this;
    };
    Cr.ByteStringBuffer.prototype.truncate = function (e) {
      var t = Math.max(0, this.length() - e);
      this.data = this.data.substr(this.read, t);
      this.read = 0;
      return this;
    };
    Cr.ByteStringBuffer.prototype.toHex = function () {
      var e = "";
      for (var t = this.read; t < this.data.length; ++t) {
        var n = this.data.charCodeAt(t);
        if (n < 16) {
          e += "0";
        }
        e += n.toString(16);
      }
      return e;
    };
    Cr.ByteStringBuffer.prototype.toString = function () {
      return Cr.decodeUtf8(this.bytes());
    };
    function zsp(e, t) {
      t = t || {};
      this.read = t.readOffset || 0;
      this.growSize = t.growSize || 1024;
      var n = Cr.isArrayBuffer(e);
      var r = Cr.isArrayBufferView(e);
      if (n || r) {
        if (n) {
          this.data = new DataView(e);
        } else {
          this.data = new DataView(e.buffer, e.byteOffset, e.byteLength);
        }
        this.write = "writeOffset" in t ? t.writeOffset : this.data.byteLength;
        return;
      }
      if (this.data = new DataView(new ArrayBuffer(0)), this.write = 0, e !== null && e !== undefined) {
        this.putBytes(e);
      }
      if ("writeOffset" in t) {
        this.write = t.writeOffset;
      }
    }
    Cr.DataBuffer = zsp;
    Cr.DataBuffer.prototype.length = function () {
      return this.write - this.read;
    };
    Cr.DataBuffer.prototype.isEmpty = function () {
      return this.length() <= 0;
    };
    Cr.DataBuffer.prototype.accommodate = function (e, t) {
      if (this.length() >= e) {
        return this;
      }
      t = Math.max(t || this.growSize, e);
      var n = new Uint8Array(this.data.buffer, this.data.byteOffset, this.data.byteLength);
      var r = new Uint8Array(this.length() + t);
      r.set(n);
      this.data = new DataView(r.buffer);
      return this;
    };
    Cr.DataBuffer.prototype.putByte = function (e) {
      this.accommodate(1);
      this.data.setUint8(this.write++, e);
      return this;
    };
    Cr.DataBuffer.prototype.fillWithByte = function (e, t) {
      this.accommodate(t);
      for (var n = 0; n < t; ++n) {
        this.data.setUint8(e);
      }
      return this;
    };
    Cr.DataBuffer.prototype.putBytes = function (e, t) {
      if (Cr.isArrayBufferView(e)) {
        var n = new Uint8Array(e.buffer, e.byteOffset, e.byteLength);
        var r = n.byteLength - n.byteOffset;
        this.accommodate(r);
        var o = new Uint8Array(this.data.buffer, this.write);
        o.set(n);
        this.write += r;
        return this;
      }
      if (Cr.isArrayBuffer(e)) {
        var n = new Uint8Array(e);
        this.accommodate(n.byteLength);
        var o = new Uint8Array(this.data.buffer);
        o.set(n, this.write);
        this.write += n.byteLength;
        return this;
      }
      if (e instanceof Cr.DataBuffer || typeof e === "object" && typeof e.read === "number" && typeof e.write === "number" && Cr.isArrayBufferView(e.data)) {
        var n = new Uint8Array(e.data.byteLength, e.read, e.length());
        this.accommodate(n.byteLength);
        var o = new Uint8Array(e.data.byteLength, this.write);
        o.set(n);
        this.write += n.byteLength;
        return this;
      }
      if (e instanceof Cr.ByteStringBuffer) {
        e = e.data;
        t = "binary";
      }
      if (t = t || "binary", typeof e === "string") {
        var s;
        if (t === "hex") {
          this.accommodate(Math.ceil(e.length / 2));
          s = new Uint8Array(this.data.buffer, this.write);
          this.write += Cr.binary.hex.oC(e, s, this.write);
          return this;
        }
        if (t === "base64") {
          this.accommodate(Math.ceil(e.length / 4) * 3);
          s = new Uint8Array(this.data.buffer, this.write);
          this.write += Cr.binary.base64.oC(e, s, this.write);
          return this;
        }
        if (t === "utf8") {
          e = Cr.encodeUtf8(e);
          t = "binary";
        }
        if (t === "binary" || t === "raw") {
          this.accommodate(e.length);
          s = new Uint8Array(this.data.buffer, this.write);
          this.write += Cr.binary.raw.oC(s);
          return this;
        }
        if (t === "utf16") {
          this.accommodate(e.length * 2);
          s = new Uint16Array(this.data.buffer, this.write);
          this.write += Cr.text.utf16.HS(s);
          return this;
        }
        throw Error("Invalid encoding: " + t);
      }
      throw Error("Invalid parameter: " + e);
    };
    Cr.DataBuffer.prototype.putBuffer = function (e) {
      this.putBytes(e);
      e.clear();
      return this;
    };
    Cr.DataBuffer.prototype.putString = function (e) {
      return this.putBytes(e, "utf16");
    };
    Cr.DataBuffer.prototype.putInt16 = function (e) {
      this.accommodate(2);
      this.data.setInt16(this.write, e);
      this.write += 2;
      return this;
    };
    Cr.DataBuffer.prototype.putInt24 = function (e) {
      this.accommodate(3);
      this.data.setInt16(this.write, e >> 8 & 65535);
      this.data.setInt8(this.write, e >> 16 & 255);
      this.write += 3;
      return this;
    };
    Cr.DataBuffer.prototype.putInt32 = function (e) {
      this.accommodate(4);
      this.data.setInt32(this.write, e);
      this.write += 4;
      return this;
    };
    Cr.DataBuffer.prototype.putInt16Le = function (e) {
      this.accommodate(2);
      this.data.setInt16(this.write, e, true);
      this.write += 2;
      return this;
    };
    Cr.DataBuffer.prototype.putInt24Le = function (e) {
      this.accommodate(3);
      this.data.setInt8(this.write, e >> 16 & 255);
      this.data.setInt16(this.write, e >> 8 & 65535, true);
      this.write += 3;
      return this;
    };
    Cr.DataBuffer.prototype.putInt32Le = function (e) {
      this.accommodate(4);
      this.data.setInt32(this.write, e, true);
      this.write += 4;
      return this;
    };
    Cr.DataBuffer.prototype.putInt = function (e, t) {
      lqt(t);
      this.accommodate(t / 8);
      do {
        t -= 8;
        this.data.setInt8(this.write++, e >> t & 255);
      } while (t > 0);
      return this;
    };
    Cr.DataBuffer.prototype.putSignedInt = function (e, t) {
      if (lqt(t), this.accommodate(t / 8), e < 0) {
        e += 2 << t - 1;
      }
      return this.putInt(e, t);
    };
    Cr.DataBuffer.prototype.getByte = function () {
      return this.data.getInt8(this.read++);
    };
    Cr.DataBuffer.prototype.getInt16 = function () {
      var e = this.data.getInt16(this.read);
      this.read += 2;
      return e;
    };
    Cr.DataBuffer.prototype.getInt24 = function () {
      var e = this.data.getInt16(this.read) << 8 ^ this.data.getInt8(this.read + 2);
      this.read += 3;
      return e;
    };
    Cr.DataBuffer.prototype.getInt32 = function () {
      var e = this.data.getInt32(this.read);
      this.read += 4;
      return e;
    };
    Cr.DataBuffer.prototype.getInt16Le = function () {
      var e = this.data.getInt16(this.read, true);
      this.read += 2;
      return e;
    };
    Cr.DataBuffer.prototype.getInt24Le = function () {
      var e = this.data.getInt8(this.read) ^ this.data.getInt16(this.read + 1, true) << 8;
      this.read += 3;
      return e;
    };
    Cr.DataBuffer.prototype.getInt32Le = function () {
      var e = this.data.getInt32(this.read, true);
      this.read += 4;
      return e;
    };
    Cr.DataBuffer.prototype.getInt = function (e) {
      lqt(e);
      var t = 0;
      do {
        t = (t << 8) + this.data.getInt8(this.read++);
        e -= 8;
      } while (e > 0);
      return t;
    };
    Cr.DataBuffer.prototype.getSignedInt = function (e) {
      var t = this.getInt(e);
      var n = 2 << e - 2;
      if (t >= n) {
        t -= n << 1;
      }
      return t;
    };
    Cr.DataBuffer.prototype.getBytes = function (e) {
      var t;
      if (e) {
        e = Math.min(this.length(), e);
        t = this.data.slice(this.read, this.read + e);
        this.read += e;
      } else if (e === 0) {
        t = "";
      } else {
        t = this.read === 0 ? this.data : this.data.slice(this.read);
        this.clear();
      }
      return t;
    };
    Cr.DataBuffer.prototype.bytes = function (e) {
      return typeof e > "u" ? this.data.slice(this.read) : this.data.slice(this.read, this.read + e);
    };
    Cr.DataBuffer.prototype.at = function (e) {
      return this.data.getUint8(this.read + e);
    };
    Cr.DataBuffer.prototype.setAt = function (e, t) {
      this.data.setUint8(e, t);
      return this;
    };
    Cr.DataBuffer.prototype.last = function () {
      return this.data.getUint8(this.write - 1);
    };
    Cr.DataBuffer.prototype.copy = function () {
      return new Cr.DataBuffer(this);
    };
    Cr.DataBuffer.prototype.compact = function () {
      if (this.read > 0) {
        var e = new Uint8Array(this.data.buffer, this.read);
        var t = new Uint8Array(e.byteLength);
        t.set(e);
        this.data = new DataView(t);
        this.write -= this.read;
        this.read = 0;
      }
      return this;
    };
    Cr.DataBuffer.prototype.clear = function () {
      this.data = new DataView(new ArrayBuffer(0));
      this.read = this.write = 0;
      return this;
    };
    Cr.DataBuffer.prototype.truncate = function (e) {
      this.write = Math.max(0, this.length() - e);
      this.read = Math.min(this.read, this.write);
      return this;
    };
    Cr.DataBuffer.prototype.toHex = function () {
      var e = "";
      for (var t = this.read; t < this.data.byteLength; ++t) {
        var n = this.data.getUint8(t);
        if (n < 16) {
          e += "0";
        }
        e += n.toString(16);
      }
      return e;
    };
    Cr.DataBuffer.prototype.toString = function (e) {
      var t = new Uint8Array(this.data, this.read, this.length());
      if (e = e || "utf8", e === "binary" || e === "raw") {
        return Cr.binary.raw.HS(t);
      }
      if (e === "hex") {
        return Cr.binary.hex.HS(t);
      }
      if (e === "base64") {
        return Cr.binary.base64.HS(t);
      }
      if (e === "utf8") {
        return Cr.text.utf8.oC(t);
      }
      if (e === "utf16") {
        return Cr.text.utf16.oC(t);
      }
      throw Error("Invalid encoding: " + e);
    };
    Cr.createBuffer = function (e, t) {
      if (t = t || "raw", e !== undefined && t === "utf8") {
        e = Cr.encodeUtf8(e);
      }
      return new Cr.ByteBuffer(e);
    };
    Cr.fillString = function (e, t) {
      var n = "";
      while (t > 0) {
        if (t & 1) {
          n += e;
        }
        if (t >>>= 1, t > 0) {
          e += e;
        }
      }
      return n;
    };
    Cr.xorBytes = function (e, t, n) {
      var r = "";
      var o = "";
      var s = "";
      var i = 0;
      var a = 0;
      for (; n > 0; --n, ++i) {
        if (o = e.charCodeAt(i) ^ t.charCodeAt(i), a >= 10) {
          r += s;
          s = "";
          a = 0;
        }
        s += String.fromCharCode(o);
        ++a;
      }
      r += s;
      return r;
    };
    Cr.hexToBytes = function (e) {
      var t = "";
      var n = 0;
      if (e.length & true) {
        n = 1;
        t += String.fromCharCode(parseInt(e[0], 16));
      }
      for (; n < e.length; n += 2) {
        t += String.fromCharCode(parseInt(e.substr(n, 2), 16));
      }
      return t;
    };
    Cr.bytesToHex = function (e) {
      return Cr.createBuffer(e).toHex();
    };
    Cr.int32ToBytes = function (e) {
      return String.fromCharCode(e >> 24 & 255) + String.fromCharCode(e >> 16 & 255) + String.fromCharCode(e >> 8 & 255) + String.fromCharCode(e & 255);
    };
    var bOe = [62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, 64, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51];
    Cr.encode64 = function (e, t) {
      var n = "";
      var r = "";
      var o;
      var s;
      var i;
      var a = 0;
      while (a < e.length) {
        if (o = e.charCodeAt(a++), s = e.charCodeAt(a++), i = e.charCodeAt(a++), n += ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt(o >> 2), n += ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt((o & 3) << 4 | s >> 4), isNaN(s)) {
          n += "==";
        } else {
          n += ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt((s & 15) << 2 | i >> 6);
          n += isNaN(i) ? "=" : ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt(i & 63);
        }
        if (t && n.length > t) {
          r += n.substr(0, t) + `\r
`;
          n = n.substr(t);
        }
      }
      r += n;
      return r;
    };
    Cr.decode64 = function (e) {
      e = e.replace(/[^A-Za-z0-9\+\/\=]/g, "");
      var t = "";
      var n;
      var r;
      var o;
      var s;
      var i = 0;
      while (i < e.length) {
        if (n = bOe[e.charCodeAt(i++) - 43], r = bOe[e.charCodeAt(i++) - 43], o = bOe[e.charCodeAt(i++) - 43], s = bOe[e.charCodeAt(i++) - 43], t += String.fromCharCode(n << 2 | r >> 4), o !== 64) {
          if (t += String.fromCharCode((r & 15) << 4 | o >> 2), s !== 64) {
            t += String.fromCharCode((o & 3) << 6 | s);
          }
        }
      }
      return t;
    };
    Cr.encodeUtf8 = function (e) {
      return unescape(encodeURIComponent(e));
    };
    Cr.decodeUtf8 = function (e) {
      return decodeURIComponent(escape(e));
    };
    Cr.binary = {
      raw: {},
      hex: {},
      base64: {},
      base58: {},
      baseN: {
        HS: Nta.HS,
        oC: Nta.oC
      }
    };
    Cr.binary.raw.HS = function (e) {
      return String.fromCharCode.apply(null, e);
    };
    Cr.binary.raw.oC = function (e, t, n) {
      var r = t;
      if (!r) {
        r = new Uint8Array(e.length);
      }
      n = n || 0;
      var o = n;
      for (var s = 0; s < e.length; ++s) {
        r[o++] = e.charCodeAt(s);
      }
      return t ? o - n : r;
    };
    Cr.binary.hex.HS = Cr.bytesToHex;
    Cr.binary.hex.oC = function (e, t, n) {
      var r = t;
      if (!r) {
        r = new Uint8Array(Math.ceil(e.length / 2));
      }
      n = n || 0;
      var o = 0;
      var s = n;
      if (e.length & 1) {
        o = 1;
        r[s++] = parseInt(e[0], 16);
      }
      for (; o < e.length; o += 2) {
        r[s++] = parseInt(e.substr(o, 2), 16);
      }
      return t ? s - n : r;
    };
    Cr.binary.base64.HS = function (e, t) {
      var n = "";
      var r = "";
      var o;
      var s;
      var i;
      var a = 0;
      while (a < e.byteLength) {
        if (o = e[a++], s = e[a++], i = e[a++], n += ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt(o >> 2), n += ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt((o & 3) << 4 | s >> 4), isNaN(s)) {
          n += "==";
        } else {
          n += ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt((s & 15) << 2 | i >> 6);
          n += isNaN(i) ? "=" : ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=").charAt(i & 63);
        }
        if (t && n.length > t) {
          r += n.substr(0, t) + `\r
`;
          n = n.substr(t);
        }
      }
      r += n;
      return r;
    };
    Cr.binary.base64.oC = function (e, t, n) {
      var r = t;
      if (!r) {
        r = new Uint8Array(Math.ceil(e.length / 4) * 3);
      }
      e = e.replace(/[^A-Za-z0-9\+\/\=]/g, "");
      n = n || 0;
      var o;
      var s;
      var i;
      var a;
      var l = 0;
      var c = n;
      while (l < e.length) {
        if (o = bOe[e.charCodeAt(l++) - 43], s = bOe[e.charCodeAt(l++) - 43], i = bOe[e.charCodeAt(l++) - 43], a = bOe[e.charCodeAt(l++) - 43], r[c++] = o << 2 | s >> 4, i !== 64) {
          if (r[c++] = (s & 15) << 4 | i >> 2, a !== 64) {
            r[c++] = (i & 3) << 6 | a;
          }
        }
      }
      return t ? c - n : r.subarray(0, c);
    };
    Cr.binary.base58.HS = function (e, t) {
      return Cr.binary.baseN.HS(e, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", t);
    };
    Cr.binary.base58.oC = function (e, t) {
      return Cr.binary.baseN.oC(e, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz", t);
    };
    Cr.text = {
      utf8: {},
      utf16: {}
    };
    Cr.text.utf8.HS = function (e, t, n) {
      e = Cr.encodeUtf8(e);
      var r = t;
      if (!r) {
        r = new Uint8Array(e.length);
      }
      n = n || 0;
      var o = n;
      for (var s = 0; s < e.length; ++s) {
        r[o++] = e.charCodeAt(s);
      }
      return t ? o - n : r;
    };
    Cr.text.utf8.oC = function (e) {
      return Cr.decodeUtf8(String.fromCharCode.apply(null, e));
    };
    Cr.text.utf16.HS = function (e, t, n) {
      var r = t;
      if (!r) {
        r = new Uint8Array(e.length * 2);
      }
      var o = new Uint16Array(r.buffer);
      n = n || 0;
      var s = n;
      var i = n;
      for (var a = 0; a < e.length; ++a) {
        o[i++] = e.charCodeAt(a);
        s += 2;
      }
      return t ? s - n : r;
    };
    Cr.text.utf16.oC = function (e) {
      return String.fromCharCode.apply(null, new Uint16Array(e.buffer));
    };
    Cr.deflate = function (e, t, n) {
      if (t = Cr.decode64(e.deflate(Cr.encode64(t)).rval), n) {
        var r = 2;
        var o = t.charCodeAt(1);
        if (o & 32) {
          r = 6;
        }
        t = t.substring(r, t.length - 4);
      }
      return t;
    };
    Cr.inflate = function (e, t, n) {
      var r = e.inflate(Cr.encode64(t)).rval;
      return r === null ? null : Cr.decode64(r);
    };
    var Aso = function (e, t, n) {
      if (!e) {
        throw Error("WebStorage not available.");
      }
      var r;
      if (n === null) {
        r = e.removeItem(t);
      } else {
        n = Cr.encode64(JSON.stringify(n));
        r = e.setItem(t, n);
      }
      if (typeof r < "u" && r.rval !== true) {
        var o = Error(r.error.message);
        throw o.id = r.error.id, o.name = r.error.name, o;
      }
    };
    var Iso = function (e, t) {
      if (!e) {
        throw Error("WebStorage not available.");
      }
      var n = e.getItem(t);
      if (e.init) {
        if (n.rval === null) {
          if (n.error) {
            var r = Error(n.error.message);
            throw r.id = n.error.id, r.name = n.error.name, r;
          }
          n = null;
        } else {
          n = n.rval;
        }
      }
      if (n !== null) {
        n = JSON.parse(Cr.decode64(n));
      }
      return n;
    };
    var Ksp = function (e, t, n, r) {
      var o = Iso(e, t);
      if (o === null) {
        o = {};
      }
      o[n] = r;
      Aso(e, t, o);
    };
    var Ysp = function (e, t, n) {
      var r = Iso(e, t);
      if (r !== null) {
        r = n in r ? r[n] : null;
      }
      return r;
    };
    var Jsp = function (e, t, n) {
      var r = Iso(e, t);
      if (r !== null && n in r) {
        delete r[n];
        var o = true;
        for (var s in r) {
          o = false;
          break;
        }
        if (o) {
          r = null;
        }
        Aso(e, t, r);
      }
    };
    var Xsp = function (e, t) {
      Aso(e, t, null);
    };
    var UFn = function (e, t, n) {
      var r = null;
      if (typeof n > "u") {
        n = ["web", "flash"];
      }
      var o;
      var s = false;
      var i = null;
      for (var a in n) {
        o = n[a];
        try {
          if (o === "flash" || o === "both") {
            if (t[0] === null) {
              throw Error("Flash local storage not available.");
            }
            r = e.apply(this, t);
            s = o === "flash";
          }
          if (o === "web" || o === "both") {
            t[0] = localStorage;
            r = e.apply(this, t);
            s = true;
          }
        } catch (l) {
          i = l;
        }
        if (s) {
          break;
        }
      }
      if (!s) {
        throw i;
      }
      return r;
    };
    Cr.setItem = function (e, t, n, r, o) {
      UFn(Ksp, arguments, o);
    };
    Cr.getItem = function (e, t, n, r) {
      return UFn(Ysp, arguments, r);
    };
    Cr.removeItem = function (e, t, n, r) {
      UFn(Jsp, arguments, r);
    };
    Cr.clearItems = function (e, t, n) {
      UFn(Xsp, arguments, n);
    };
    Cr.isEmpty = function (e) {
      for (var t in e) {
        if (e.hasOwnProperty(t)) {
          return false;
        }
      }
      return true;
    };
    Cr.format = function (e) {
      var t = /%./g;
      var n;
      var r;
      var o = 0;
      var s = [];
      var i = 0;
      while (n = t.exec(e)) {
        if (r = e.substring(i, t.lastIndex - 2), r.length > 0) {
          s.push(r);
        }
        i = t.lastIndex;
        var a = n[0][1];
        switch (a) {
          case "s":
          case "o":
            if (o < arguments.length) {
              s.push(arguments[o++ + 1]);
            } else {
              s.push("<?>");
            }
            break;
          case "%":
            s.push("%");
            break;
          default:
            s.push("<%" + a + "?>");
        }
      }
      s.push(e.substring(i));
      return s.join("");
    };
    Cr.formatNumber = function (e, t, n, r) {
      var o = e;
      var s = isNaN(t = Math.abs(t)) ? 2 : t;
      var i = n === undefined ? "," : n;
      var a = r === undefined ? "." : r;
      var l = o < 0 ? "-" : "";
      var c = parseInt(o = Math.abs(+o || 0).toFixed(s), 10) + "";
      var u = c.length > 3 ? c.length % 3 : 0;
      return l + (u ? c.substr(0, u) + a : "") + c.substr(u).replace(/(\d{3})(?=\d)/g, "$1" + a) + (s ? i + Math.abs(o - c).toFixed(s).slice(2) : "");
    };
    Cr.formatSize = function (e) {
      if (e >= 1073741824) {
        e = Cr.formatNumber(e / 1073741824, 2, ".", "") + " GiB";
      } else if (e >= 1048576) {
        e = Cr.formatNumber(e / 1048576, 2, ".", "") + " MiB";
      } else if (e >= 1024) {
        e = Cr.formatNumber(e / 1024, 0) + " KiB";
      } else {
        e = Cr.formatNumber(e, 0) + " bytes";
      }
      return e;
    };
    Cr.bytesFromIP = function (e) {
      if (e.indexOf(".") !== -1) {
        return Cr.bytesFromIPv4(e);
      }
      if (e.indexOf(":") !== -1) {
        return Cr.bytesFromIPv6(e);
      }
      return null;
    };
    Cr.bytesFromIPv4 = function (e) {
      if (e = e.split("."), e.length !== 4) {
        return null;
      }
      var t = Cr.createBuffer();
      for (var n = 0; n < e.length; ++n) {
        var r = parseInt(e[n], 10);
        if (isNaN(r)) {
          return null;
        }
        t.putByte(r);
      }
      return t.getBytes();
    };
    Cr.bytesFromIPv6 = function (e) {
      var t = 0;
      e = e.split(":").filter(function (i) {
        if (i.length === 0) {
          ++t;
        }
        return true;
      });
      var n = (8 - e.length + t) * 2;
      var r = Cr.createBuffer();
      for (var o = 0; o < 8; ++o) {
        if (!e[o] || e[o].length === 0) {
          r.fillWithByte(0, n);
          n = 0;
          continue;
        }
        var s = Cr.hexToBytes(e[o]);
        if (s.length < 2) {
          r.putByte(0);
        }
        r.putBytes(s);
      }
      return r.getBytes();
    };
    Cr.bytesToIP = function (e) {
      if (e.length === 4) {
        return Cr.bytesToIPv4(e);
      }
      if (e.length === 16) {
        return Cr.bytesToIPv6(e);
      }
      return null;
    };
    Cr.bytesToIPv4 = function (e) {
      if (e.length !== 4) {
        return null;
      }
      var t = [];
      for (var n = 0; n < e.length; ++n) {
        t.push(e.charCodeAt(n));
      }
      return t.join(".");
    };
    Cr.bytesToIPv6 = function (e) {
      if (e.length !== 16) {
        return null;
      }
      var t = [];
      var n = [];
      var r = 0;
      for (var o = 0; o < e.length; o += 2) {
        var s = Cr.bytesToHex(e[o] + e[o + 1]);
        while (s[0] === "0" && s !== "0") {
          s = s.substr(1);
        }
        if (s === "0") {
          var i = n[n.length - 1];
          var a = t.length;
          if (!i || a !== i.end + 1) {
            n.push({
              start: a,
              end: a
            });
          } else if (i.end = a, i.end - i.start > n[r].end - n[r].start) {
            r = n.length - 1;
          }
        }
        t.push(s);
      }
      if (n.length > 0) {
        var l = n[r];
        if (l.end - l.start > 0) {
          if (t.splice(l.start, l.end - l.start + 1, ""), l.start === 0) {
            t.unshift("");
          }
          if (l.end === 7) {
            t.push("");
          }
        }
      }
      return t.join(":");
    };
    Cr.estimateCores = function (e, t) {
      if (typeof e === "function") {
        t = e;
        e = {};
      }
      if (e = e || {}, "cores" in Cr && !e.update) {
        return t(null, Cr.cores);
      }
      if (typeof navigator < "u" && "hardwareConcurrency" in navigator && navigator.hardwareConcurrency > 0) {
        Cr.cores = navigator.hardwareConcurrency;
        return t(null, Cr.cores);
      }
      if (typeof Worker > "u") {
        Cr.cores = 1;
        return t(null, Cr.cores);
      }
      if (typeof Blob > "u") {
        Cr.cores = 2;
        return t(null, Cr.cores);
      }
      var n = URL.createObjectURL(new Blob(["(", function () {
        self.addEventListener("message", function (i) {
          var a = Date.now();
          var l = a + 4;
          while (Date.now() < l) {
            ;
          }
          self.postMessage({
            st: a,
            et: l
          });
        });
      }.toString(), ")()"], {
        type: "application/javascript"
      }));
      r([], 5, 16);
      function r(i, a, l) {
        if (a === 0) {
          var c = Math.floor(i.reduce(function (u, d) {
            return u + d;
          }, 0) / i.length);
          Cr.cores = Math.max(1, c);
          URL.revokeObjectURL(n);
          return t(null, Cr.cores);
        }
        o(l, function (u, d) {
          i.push(s(l, d));
          r(i, a - 1, l);
        });
      }
      function o(i, a) {
        var l = [];
        var c = [];
        for (var u = 0; u < i; ++u) {
          var d = new Worker(n);
          d.addEventListener("message", function (p) {
            if (c.push(p.data), c.length === i) {
              for (var m = 0; m < i; ++m) {
                l[m].terminate();
              }
              a(null, c);
            }
          });
          l.push(d);
        }
        for (var u = 0; u < i; ++u) {
          l[u].postMessage(u);
        }
      }
      function s(i, a) {
        var l = [];
        for (var c = 0; c < i; ++c) {
          var u = a[c];
          var d = l[c] = [];
          for (var p = 0; p < i; ++p) {
            if (c === p) {
              continue;
            }
            var m = a[p];
            if (u.st > m.st && u.st < m.et || m.st > u.st && m.st < u.et) {
              d.push(p);
            }
          }
        }
        return l.reduce(function (f, h) {
          return Math.max(f, h.length);
        }, 0);
      }
    };
  });
  var BFn = __commonJS((eIy, Uta) => {
    var E1 = wf();
    g_();
    Uta.exports = E1.cipher = E1.cipher || {};
    E1.cipher.algorithms = E1.cipher.algorithms || {};
    E1.cipher.createCipher = function (e, t) {
      var n = e;
      if (typeof n === "string") {
        if (n = E1.cipher.getAlgorithm(n), n) {
          n = n();
        }
      }
      if (!n) {
        throw Error("Unsupported algorithm: " + e);
      }
      return new E1.cipher.BlockCipher({
        algorithm: n,
        key: t,
        decrypt: false
      });
    };
    E1.cipher.createDecipher = function (e, t) {
      var n = e;
      if (typeof n === "string") {
        if (n = E1.cipher.getAlgorithm(n), n) {
          n = n();
        }
      }
      if (!n) {
        throw Error("Unsupported algorithm: " + e);
      }
      return new E1.cipher.BlockCipher({
        algorithm: n,
        key: t,
        decrypt: true
      });
    };
    E1.cipher.registerAlgorithm = function (e, t) {
      e = e.toUpperCase();
      E1.cipher.algorithms[e] = t;
    };
    E1.cipher.getAlgorithm = function (e) {
      if (e = e.toUpperCase(), e in E1.cipher.algorithms) {
        return E1.cipher.algorithms[e];
      }
      return null;
    };
    var Pso = E1.cipher.BlockCipher = function (e) {
      this.algorithm = e.algorithm;
      this.mode = this.algorithm.mode;
      this.blockSize = this.mode.blockSize;
      this._finish = false;
      this._input = null;
      this.output = null;
      this._op = e.decrypt ? this.mode.decrypt : this.mode.encrypt;
      this._decrypt = e.decrypt;
      this.algorithm.initialize(e);
    };
    Pso.prototype.start = function (e) {
      e = e || {};
      var t = {};
      for (var n in e) {
        t[n] = e[n];
      }
      t.decrypt = this._decrypt;
      this._finish = false;
      this._input = E1.util.createBuffer();
      this.output = e.output || E1.util.createBuffer();
      this.mode.start(t);
    };
    Pso.prototype.update = function (e) {
      if (e) {
        this._input.putBuffer(e);
      }
      while (!this._op.call(this.mode, this._input, this.output, this._finish) && !this._finish) {
        ;
      }
      this._input.compact();
    };
    Pso.prototype.finish = function (e) {
      if (e && (this.mode.name === "ECB" || this.mode.name === "CBC")) {
        this.mode.pad = function (n) {
          return e(this.blockSize, n, false);
        };
        this.mode.unpad = function (n) {
          return e(this.blockSize, n, true);
        };
      }
      var t = {};
      if (t.decrypt = this._decrypt, t.overflow = this._input.length() % this.blockSize, !this._decrypt && this.mode.pad) {
        if (!this.mode.pad(this._input, t)) {
          return false;
        }
      }
      if (this._finish = true, this.update(), this._decrypt && this.mode.unpad) {
        if (!this.mode.unpad(this.output, t)) {
          return false;
        }
      }
      if (this.mode.afterFinish) {
        if (!this.mode.afterFinish(this.output, t)) {
          return false;
        }
      }
      return true;
    };
  });
  var Dso = __commonJS((tIy, Bta) => {
    var v1 = wf();
    g_();
    v1.cipher = v1.cipher || {};
    var Vh = Bta.exports = v1.cipher.modes = v1.cipher.modes || {};
    Vh.ecb = function (e) {
      e = e || {};
      this.name = "ECB";
      this.cipher = e.cipher;
      this.blockSize = e.blockSize || 16;
      this._ints = this.blockSize / 4;
      this._inBlock = Array(this._ints);
      this._outBlock = Array(this._ints);
    };
    Vh.ecb.prototype.start = function (e) {};
    Vh.ecb.prototype.encrypt = function (e, t, n) {
      if (e.length() < this.blockSize && !(n && e.length() > 0)) {
        return true;
      }
      for (var r = 0; r < this._ints; ++r) {
        this._inBlock[r] = e.getInt32();
      }
      this.cipher.encrypt(this._inBlock, this._outBlock);
      for (var r = 0; r < this._ints; ++r) {
        t.putInt32(this._outBlock[r]);
      }
    };
    Vh.ecb.prototype.decrypt = function (e, t, n) {
      if (e.length() < this.blockSize && !(n && e.length() > 0)) {
        return true;
      }
      for (var r = 0; r < this._ints; ++r) {
        this._inBlock[r] = e.getInt32();
      }
      this.cipher.decrypt(this._inBlock, this._outBlock);
      for (var r = 0; r < this._ints; ++r) {
        t.putInt32(this._outBlock[r]);
      }
    };
    Vh.ecb.prototype.pad = function (e, t) {
      var n = e.length() === this.blockSize ? this.blockSize : this.blockSize - e.length();
      e.fillWithByte(n, n);
      return true;
    };
    Vh.ecb.prototype.unpad = function (e, t) {
      if (t.overflow > 0) {
        return false;
      }
      var n = e.length();
      var r = e.at(n - 1);
      if (r > this.blockSize << 2) {
        return false;
      }
      e.truncate(r);
      return true;
    };
    Vh.cbc = function (e) {
      e = e || {};
      this.name = "CBC";
      this.cipher = e.cipher;
      this.blockSize = e.blockSize || 16;
      this._ints = this.blockSize / 4;
      this._inBlock = Array(this._ints);
      this._outBlock = Array(this._ints);
    };
    Vh.cbc.prototype.start = function (e) {
      if (e.iv === null) {
        if (!this._prev) {
          throw Error("Invalid IV parameter.");
        }
        this._iv = this._prev.slice(0);
      } else if (!("iv" in e)) {
        throw Error("Invalid IV parameter.");
      } else {
        this._iv = $Fn(e.iv, this.blockSize);
        this._prev = this._iv.slice(0);
      }
    };
    Vh.cbc.prototype.encrypt = function (e, t, n) {
      if (e.length() < this.blockSize && !(n && e.length() > 0)) {
        return true;
      }
      for (var r = 0; r < this._ints; ++r) {
        this._inBlock[r] = this._prev[r] ^ e.getInt32();
      }
      this.cipher.encrypt(this._inBlock, this._outBlock);
      for (var r = 0; r < this._ints; ++r) {
        t.putInt32(this._outBlock[r]);
      }
      this._prev = this._outBlock;
    };
    Vh.cbc.prototype.decrypt = function (e, t, n) {
      if (e.length() < this.blockSize && !(n && e.length() > 0)) {
        return true;
      }
      for (var r = 0; r < this._ints; ++r) {
        this._inBlock[r] = e.getInt32();
      }
      this.cipher.decrypt(this._inBlock, this._outBlock);
      for (var r = 0; r < this._ints; ++r) {
        t.putInt32(this._prev[r] ^ this._outBlock[r]);
      }
      this._prev = this._inBlock.slice(0);
    };
    Vh.cbc.prototype.pad = function (e, t) {
      var n = e.length() === this.blockSize ? this.blockSize : this.blockSize - e.length();
      e.fillWithByte(n, n);
      return true;
    };
    Vh.cbc.prototype.unpad = function (e, t) {
      if (t.overflow > 0) {
        return false;
      }
      var n = e.length();
      var r = e.at(n - 1);
      if (r > this.blockSize << 2) {
        return false;
      }
      e.truncate(r);
      return true;
    };
    Vh.cfb = function (e) {
      e = e || {};
      this.name = "CFB";
      this.cipher = e.cipher;
      this.blockSize = e.blockSize || 16;
      this._ints = this.blockSize / 4;
      this._inBlock = null;
      this._outBlock = Array(this._ints);
      this._partialBlock = Array(this._ints);
      this._partialOutput = v1.util.createBuffer();
      this._partialBytes = 0;
    };
    Vh.cfb.prototype.start = function (e) {
      if (!("iv" in e)) {
        throw Error("Invalid IV parameter.");
      }
      this._iv = $Fn(e.iv, this.blockSize);
      this._inBlock = this._iv.slice(0);
      this._partialBytes = 0;
    };
    Vh.cfb.prototype.encrypt = function (e, t, n) {
      var r = e.length();
      if (r === 0) {
        return true;
      }
      if (this.cipher.encrypt(this._inBlock, this._outBlock), this._partialBytes === 0 && r >= this.blockSize) {
        for (var o = 0; o < this._ints; ++o) {
          this._inBlock[o] = e.getInt32() ^ this._outBlock[o];
          t.putInt32(this._inBlock[o]);
        }
        return;
      }
      var s = (this.blockSize - r) % this.blockSize;
      if (s > 0) {
        s = this.blockSize - s;
      }
      this._partialOutput.clear();
      for (var o = 0; o < this._ints; ++o) {
        this._partialBlock[o] = e.getInt32() ^ this._outBlock[o];
        this._partialOutput.putInt32(this._partialBlock[o]);
      }
      if (s > 0) {
        e.read -= this.blockSize;
      } else {
        for (var o = 0; o < this._ints; ++o) {
          this._inBlock[o] = this._partialBlock[o];
        }
      }
      if (this._partialBytes > 0) {
        this._partialOutput.getBytes(this._partialBytes);
      }
      if (s > 0 && !n) {
        t.putBytes(this._partialOutput.getBytes(s - this._partialBytes));
        this._partialBytes = s;
        return true;
      }
      t.putBytes(this._partialOutput.getBytes(r - this._partialBytes));
      this._partialBytes = 0;
    };
    Vh.cfb.prototype.decrypt = function (e, t, n) {
      var r = e.length();
      if (r === 0) {
        return true;
      }
      if (this.cipher.encrypt(this._inBlock, this._outBlock), this._partialBytes === 0 && r >= this.blockSize) {
        for (var o = 0; o < this._ints; ++o) {
          this._inBlock[o] = e.getInt32();
          t.putInt32(this._inBlock[o] ^ this._outBlock[o]);
        }
        return;
      }
      var s = (this.blockSize - r) % this.blockSize;
      if (s > 0) {
        s = this.blockSize - s;
      }
      this._partialOutput.clear();
      for (var o = 0; o < this._ints; ++o) {
        this._partialBlock[o] = e.getInt32();
        this._partialOutput.putInt32(this._partialBlock[o] ^ this._outBlock[o]);
      }
      if (s > 0) {
        e.read -= this.blockSize;
      } else {
        for (var o = 0; o < this._ints; ++o) {
          this._inBlock[o] = this._partialBlock[o];
        }
      }
      if (this._partialBytes > 0) {
        this._partialOutput.getBytes(this._partialBytes);
      }
      if (s > 0 && !n) {
        t.putBytes(this._partialOutput.getBytes(s - this._partialBytes));
        this._partialBytes = s;
        return true;
      }
      t.putBytes(this._partialOutput.getBytes(r - this._partialBytes));
      this._partialBytes = 0;
    };
    Vh.ofb = function (e) {
      e = e || {};
      this.name = "OFB";
      this.cipher = e.cipher;
      this.blockSize = e.blockSize || 16;
      this._ints = this.blockSize / 4;
      this._inBlock = null;
      this._outBlock = Array(this._ints);
      this._partialOutput = v1.util.createBuffer();
      this._partialBytes = 0;
    };
    Vh.ofb.prototype.start = function (e) {
      if (!("iv" in e)) {
        throw Error("Invalid IV parameter.");
      }
      this._iv = $Fn(e.iv, this.blockSize);
      this._inBlock = this._iv.slice(0);
      this._partialBytes = 0;
    };
    Vh.ofb.prototype.encrypt = function (e, t, n) {
      var r = e.length();
      if (e.length() === 0) {
        return true;
      }
      if (this.cipher.encrypt(this._inBlock, this._outBlock), this._partialBytes === 0 && r >= this.blockSize) {
        for (var o = 0; o < this._ints; ++o) {
          t.putInt32(e.getInt32() ^ this._outBlock[o]);
          this._inBlock[o] = this._outBlock[o];
        }
        return;
      }
      var s = (this.blockSize - r) % this.blockSize;
      if (s > 0) {
        s = this.blockSize - s;
      }
      this._partialOutput.clear();
      for (var o = 0; o < this._ints; ++o) {
        this._partialOutput.putInt32(e.getInt32() ^ this._outBlock[o]);
      }
      if (s > 0) {
        e.read -= this.blockSize;
      } else {
        for (var o = 0; o < this._ints; ++o) {
          this._inBlock[o] = this._outBlock[o];
        }
      }
      if (this._partialBytes > 0) {
        this._partialOutput.getBytes(this._partialBytes);
      }
      if (s > 0 && !n) {
        t.putBytes(this._partialOutput.getBytes(s - this._partialBytes));
        this._partialBytes = s;
        return true;
      }
      t.putBytes(this._partialOutput.getBytes(r - this._partialBytes));
      this._partialBytes = 0;
    };
    Vh.ofb.prototype.decrypt = Vh.ofb.prototype.encrypt;
    Vh.ctr = function (e) {
      e = e || {};
      this.name = "CTR";
      this.cipher = e.cipher;
      this.blockSize = e.blockSize || 16;
      this._ints = this.blockSize / 4;
      this._inBlock = null;
      this._outBlock = Array(this._ints);
      this._partialOutput = v1.util.createBuffer();
      this._partialBytes = 0;
    };
    Vh.ctr.prototype.start = function (e) {
      if (!("iv" in e)) {
        throw Error("Invalid IV parameter.");
      }
      this._iv = $Fn(e.iv, this.blockSize);
      this._inBlock = this._iv.slice(0);
      this._partialBytes = 0;
    };
    Vh.ctr.prototype.encrypt = function (e, t, n) {
      var r = e.length();
      if (r === 0) {
        return true;
      }
      if (this.cipher.encrypt(this._inBlock, this._outBlock), this._partialBytes === 0 && r >= this.blockSize) {
        for (var o = 0; o < this._ints; ++o) {
          t.putInt32(e.getInt32() ^ this._outBlock[o]);
        }
      } else {
        var s = (this.blockSize - r) % this.blockSize;
        if (s > 0) {
          s = this.blockSize - s;
        }
        this._partialOutput.clear();
        for (var o = 0; o < this._ints; ++o) {
          this._partialOutput.putInt32(e.getInt32() ^ this._outBlock[o]);
        }
        if (s > 0) {
          e.read -= this.blockSize;
        }
        if (this._partialBytes > 0) {
          this._partialOutput.getBytes(this._partialBytes);
        }
        if (s > 0 && !n) {
          t.putBytes(this._partialOutput.getBytes(s - this._partialBytes));
          this._partialBytes = s;
          return true;
        }
        t.putBytes(this._partialOutput.getBytes(r - this._partialBytes));
        this._partialBytes = 0;
      }
      HFn(this._inBlock);
    };
    Vh.ctr.prototype.decrypt = Vh.ctr.prototype.encrypt;
    Vh.gcm = function (e) {
      e = e || {};
      this.name = "GCM";
      this.cipher = e.cipher;
      this.blockSize = e.blockSize || 16;
      this._ints = this.blockSize / 4;
      this._inBlock = Array(this._ints);
      this._outBlock = Array(this._ints);
      this._partialOutput = v1.util.createBuffer();
      this._partialBytes = 0;
      this._R = 3774873600;
    };
    Vh.gcm.prototype.start = function (e) {
      if (!("iv" in e)) {
        throw Error("Invalid IV parameter.");
      }
      var t = v1.util.createBuffer(e.iv);
      this._cipherLength = 0;
      var n;
      if ("additionalData" in e) {
        n = v1.util.createBuffer(e.additionalData);
      } else {
        n = v1.util.createBuffer();
      }
      if ("tagLength" in e) {
        this._tagLength = e.tagLength;
      } else {
        this._tagLength = 128;
      }
      if (this._tag = null, e.decrypt) {
        if (this._tag = v1.util.createBuffer(e.tag).getBytes(), this._tag.length !== this._tagLength / 8) {
          throw Error("Authentication tag does not match tag length.");
        }
      }
      this._hashBlock = Array(this._ints);
      this.tag = null;
      this._hashSubkey = Array(this._ints);
      this.cipher.encrypt([0, 0, 0, 0], this._hashSubkey);
      this.componentBits = 4;
      this._m = this.generateHashTable(this._hashSubkey, this.componentBits);
      var r = t.length();
      if (r === 12) {
        this._j0 = [t.getInt32(), t.getInt32(), t.getInt32(), 1];
      } else {
        this._j0 = [0, 0, 0, 0];
        while (t.length() > 0) {
          this._j0 = this.ghash(this._hashSubkey, this._j0, [t.getInt32(), t.getInt32(), t.getInt32(), t.getInt32()]);
        }
        this._j0 = this.ghash(this._hashSubkey, this._j0, [0, 0].concat(Oso(r * 8)));
      }
      this._inBlock = this._j0.slice(0);
      HFn(this._inBlock);
      this._partialBytes = 0;
      n = v1.util.createBuffer(n);
      this._aDataLength = Oso(n.length() * 8);
      var o = n.length() % this.blockSize;
      if (o) {
        n.fillWithByte(0, this.blockSize - o);
      }
      this._s = [0, 0, 0, 0];
      while (n.length() > 0) {
        this._s = this.ghash(this._hashSubkey, this._s, [n.getInt32(), n.getInt32(), n.getInt32(), n.getInt32()]);
      }
    };
    Vh.gcm.prototype.encrypt = function (e, t, n) {
      var r = e.length();
      if (r === 0) {
        return true;
      }
      if (this.cipher.encrypt(this._inBlock, this._outBlock), this._partialBytes === 0 && r >= this.blockSize) {
        for (var o = 0; o < this._ints; ++o) {
          t.putInt32(this._outBlock[o] ^= e.getInt32());
        }
        this._cipherLength += this.blockSize;
      } else {
        var s = (this.blockSize - r) % this.blockSize;
        if (s > 0) {
          s = this.blockSize - s;
        }
        this._partialOutput.clear();
        for (var o = 0; o < this._ints; ++o) {
          this._partialOutput.putInt32(e.getInt32() ^ this._outBlock[o]);
        }
        if (s <= 0 || n) {
          if (n) {
            var i = r % this.blockSize;
            this._cipherLength += i;
            this._partialOutput.truncate(this.blockSize - i);
          } else {
            this._cipherLength += this.blockSize;
          }
          for (var o = 0; o < this._ints; ++o) {
            this._outBlock[o] = this._partialOutput.getInt32();
          }
          this._partialOutput.read -= this.blockSize;
        }
        if (this._partialBytes > 0) {
          this._partialOutput.getBytes(this._partialBytes);
        }
        if (s > 0 && !n) {
          e.read -= this.blockSize;
          t.putBytes(this._partialOutput.getBytes(s - this._partialBytes));
          this._partialBytes = s;
          return true;
        }
        t.putBytes(this._partialOutput.getBytes(r - this._partialBytes));
        this._partialBytes = 0;
      }
      this._s = this.ghash(this._hashSubkey, this._s, this._outBlock);
      HFn(this._inBlock);
    };
    Vh.gcm.prototype.decrypt = function (e, t, n) {
      var r = e.length();
      if (r < this.blockSize && !(n && r > 0)) {
        return true;
      }
      this.cipher.encrypt(this._inBlock, this._outBlock);
      HFn(this._inBlock);
      this._hashBlock[0] = e.getInt32();
      this._hashBlock[1] = e.getInt32();
      this._hashBlock[2] = e.getInt32();
      this._hashBlock[3] = e.getInt32();
      this._s = this.ghash(this._hashSubkey, this._s, this._hashBlock);
      for (var o = 0; o < this._ints; ++o) {
        t.putInt32(this._outBlock[o] ^ this._hashBlock[o]);
      }
      if (r < this.blockSize) {
        this._cipherLength += r % this.blockSize;
      } else {
        this._cipherLength += this.blockSize;
      }
    };
    Vh.gcm.prototype.afterFinish = function (e, t) {
      var n = true;
      if (t.decrypt && t.overflow) {
        e.truncate(this.blockSize - t.overflow);
      }
      this.tag = v1.util.createBuffer();
      var r = this._aDataLength.concat(Oso(this._cipherLength * 8));
      this._s = this.ghash(this._hashSubkey, this._s, r);
      var o = [];
      this.cipher.encrypt(this._j0, o);
      for (var s = 0; s < this._ints; ++s) {
        this.tag.putInt32(this._s[s] ^ o[s]);
      }
      if (this.tag.truncate(this.tag.length() % (this._tagLength / 8)), t.decrypt && this.tag.bytes() !== this._tag) {
        n = false;
      }
      return n;
    };
    Vh.gcm.prototype.multiply = function (e, t) {
      var n = [0, 0, 0, 0];
      var r = t.slice(0);
      for (var o = 0; o < 128; ++o) {
        var s = e[o / 32 | 0] & 1 << 31 - o % 32;
        if (s) {
          n[0] ^= r[0];
          n[1] ^= r[1];
          n[2] ^= r[2];
          n[3] ^= r[3];
        }
        this.pow(r, r);
      }
      return n;
    };
    Vh.gcm.prototype.pow = function (e, t) {
      var n = e[3] & 1;
      for (var r = 3; r > 0; --r) {
        t[r] = e[r] >>> 1 | (e[r - 1] & 1) << 31;
      }
      if (t[0] = e[0] >>> 1, n) {
        t[0] ^= this._R;
      }
    };
    Vh.gcm.prototype.tableMultiply = function (e) {
      var t = [0, 0, 0, 0];
      for (var n = 0; n < 32; ++n) {
        var r = n / 8 | 0;
        var o = e[r] >>> (7 - n % 8) * 4 & 15;
        var s = this._m[n][o];
        t[0] ^= s[0];
        t[1] ^= s[1];
        t[2] ^= s[2];
        t[3] ^= s[3];
      }
      return t;
    };
    Vh.gcm.prototype.ghash = function (e, t, n) {
      t[0] ^= n[0];
      t[1] ^= n[1];
      t[2] ^= n[2];
      t[3] ^= n[3];
      return this.tableMultiply(t);
    };
    Vh.gcm.prototype.generateHashTable = function (e, t) {
      var n = 8 / t;
      var r = 4 * n;
      var o = 16 * n;
      var s = Array(o);
      for (var i = 0; i < o; ++i) {
        var a = [0, 0, 0, 0];
        var l = i / r | 0;
        var c = (r - 1 - i % r) * t;
        a[l] = 1 << t - 1 << c;
        s[i] = this.generateSubHashTable(this.multiply(a, e), t);
      }
      return s;
    };
    Vh.gcm.prototype.generateSubHashTable = function (e, t) {
      var n = 1 << t;
      var r = n >>> 1;
      var o = Array(n);
      o[r] = e.slice(0);
      var s = r >>> 1;
      while (s > 0) {
        this.pow(o[2 * s], o[s] = []);
        s >>= 1;
      }
      s = 2;
      while (s < r) {
        for (var i = 1; i < s; ++i) {
          var a = o[s];
          var l = o[i];
          o[s + i] = [a[0] ^ l[0], a[1] ^ l[1], a[2] ^ l[2], a[3] ^ l[3]];
        }
        s *= 2;
      }
      o[0] = [0, 0, 0, 0];
      for (s = r + 1; s < n; ++s) {
        var c = o[s ^ r];
        o[s] = [e[0] ^ c[0], e[1] ^ c[1], e[2] ^ c[2], e[3] ^ c[3]];
      }
      return o;
    };
    function $Fn(e, t) {
      if (typeof e === "string") {
        e = v1.util.createBuffer(e);
      }
      if (v1.util.isArray(e) && e.length > 4) {
        var n = e;
        e = v1.util.createBuffer();
        for (var r = 0; r < n.length; ++r) {
          e.putByte(n[r]);
        }
      }
      if (e.length() < t) {
        throw Error("Invalid IV length; got " + e.length() + " bytes and expected " + t + " bytes.");
      }
      if (!v1.util.isArray(e)) {
        var o = [];
        var s = t / 4;
        for (var r = 0; r < s; ++r) {
          o.push(e.getInt32());
        }
        e = o;
      }
      return e;
    }
    function HFn(e) {
      e[e.length - 1] = e[e.length - 1] + 1 & 4294967295;
    }
    function Oso(e) {
      return [e / 4294967296 | 0, e & 4294967295];
    }
  });
  var SOe = __commonJS((nIy, qta) => {
    var yw = wf();
    BFn();
    Dso();
    g_();
    qta.exports = yw.aes = yw.aes || {};
    yw.aes.startEncrypting = function (e, t, n, r) {
      var o = jFn({
        key: e,
        output: n,
        decrypt: false,
        mode: r
      });
      o.start(t);
      return o;
    };
    yw.aes.createEncryptionCipher = function (e, t) {
      return jFn({
        key: e,
        output: null,
        decrypt: false,
        mode: t
      });
    };
    yw.aes.startDecrypting = function (e, t, n, r) {
      var o = jFn({
        key: e,
        output: n,
        decrypt: true,
        mode: r
      });
      o.start(t);
      return o;
    };
    yw.aes.createDecryptionCipher = function (e, t) {
      return jFn({
        key: e,
        output: null,
        decrypt: true,
        mode: t
      });
    };
    yw.aes.Algorithm = function (e, t) {
      if (!Lso) {
        Hta();
      }
      var n = this;
      n.name = e;
      n.mode = new t({
        blockSize: 16,
        cipher: {
          encrypt: function (r, o) {
            return Nso(n._w, r, o, false);
          },
          decrypt: function (r, o) {
            return Nso(n._w, r, o, true);
          }
        }
      });
      n._init = false;
    };
    yw.aes.Algorithm.prototype.initialize = function (e) {
      if (this._init) {
        return;
      }
      var t = e.key;
      var n;
      if (typeof t === "string" && (t.length === 16 || t.length === 24 || t.length === 32)) {
        t = yw.util.createBuffer(t);
      } else if (yw.util.isArray(t) && (t.length === 16 || t.length === 24 || t.length === 32)) {
        n = t;
        t = yw.util.createBuffer();
        for (var r = 0; r < n.length; ++r) {
          t.putByte(n[r]);
        }
      }
      if (!yw.util.isArray(t)) {
        n = t;
        t = [];
        var o = n.length();
        if (o === 16 || o === 24 || o === 32) {
          o = o >>> 2;
          for (var r = 0; r < o; ++r) {
            t.push(n.getInt32());
          }
        }
      }
      if (!yw.util.isArray(t) || !(t.length === 4 || t.length === 6 || t.length === 8)) {
        throw Error("Invalid key parameter.");
      }
      var s = this.mode.name;
      var i = ["CFB", "OFB", "CTR", "GCM"].indexOf(s) !== -1;
      this._w = jta(t, e.decrypt && !i);
      this._init = true;
    };
    yw.aes._expandKey = function (e, t) {
      if (!Lso) {
        Hta();
      }
      return jta(e, t);
    };
    yw.aes._updateBlock = Nso;
    Dut("AES-ECB", yw.cipher.modes.ecb);
    Dut("AES-CBC", yw.cipher.modes.cbc);
    Dut("AES-CFB", yw.cipher.modes.cfb);
    Dut("AES-OFB", yw.cipher.modes.ofb);
    Dut("AES-CTR", yw.cipher.modes.ctr);
    Dut("AES-GCM", yw.cipher.modes.gcm);
    function Dut(e, t) {
      var n = function () {
        return new yw.aes.Algorithm(e, t);
      };
      yw.cipher.registerAlgorithm(e, n);
    }
    var Lso = false;
    var vq;
    var Mso;
    var $ta;
    var NGe;
    var Hre;
    function Hta() {
      Lso = true;
      $ta = [0, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54];
      var e = Array(256);
      for (var t = 0; t < 128; ++t) {
        e[t] = t << 1;
        e[t + 128] = t + 128 << 1 ^ 283;
      }
      vq = Array(256);
      Mso = Array(256);
      NGe = [,,,,];
      Hre = [,,,,];
      for (var t = 0; t < 4; ++t) {
        NGe[t] = Array(256);
        Hre[t] = Array(256);
      }
      var n = 0;
      var r = 0;
      var o;
      var s;
      var i;
      var a;
      var l;
      var c;
      var u;
      for (var t = 0; t < 256; ++t) {
        a = r ^ r << 1 ^ r << 2 ^ r << 3 ^ r << 4;
        a = a >> 8 ^ a & 255 ^ 99;
        vq[n] = a;
        Mso[a] = n;
        l = e[a];
        o = e[n];
        s = e[o];
        i = e[s];
        c = l << 24 ^ a << 16 ^ a << 8 ^ (a ^ l);
        u = (o ^ s ^ i) << 24 ^ (n ^ i) << 16 ^ (n ^ s ^ i) << 8 ^ (n ^ o ^ i);
        for (var d = 0; d < 4; ++d) {
          NGe[d][n] = c;
          Hre[d][a] = u;
          c = c << 24 | c >>> 8;
          u = u << 24 | u >>> 8;
        }
        if (n === 0) {
          n = r = 1;
        } else {
          n = o ^ e[e[e[o ^ i]]];
          r ^= e[e[r]];
        }
      }
    }
    function jta(e, t) {
      var n = e.slice(0);
      var r;
      var o = 1;
      var s = n.length;
      var i = s + 6 + 1;
      var a = 4 * i;
      for (var l = s; l < a; ++l) {
        if (r = n[l - 1], l % s === 0) {
          r = vq[r >>> 16 & 255] << 24 ^ vq[r >>> 8 & 255] << 16 ^ vq[r & 255] << 8 ^ vq[r >>> 24] ^ $ta[o] << 24;
          o++;
        } else if (s > 6 && l % s === 4) {
          r = vq[r >>> 24] << 24 ^ vq[r >>> 16 & 255] << 16 ^ vq[r >>> 8 & 255] << 8 ^ vq[r & 255];
        }
        n[l] = n[l - s] ^ r;
      }
      if (t) {
        var c;
        var u = Hre[0];
        var d = Hre[1];
        var p = Hre[2];
        var m = Hre[3];
        var f = n.slice(0);
        a = n.length;
        for (var l = 0, h = a - 4; l < a; l += 4, h -= 4) {
          if (l === 0 || l === a - 4) {
            f[l] = n[h];
            f[l + 1] = n[h + 3];
            f[l + 2] = n[h + 2];
            f[l + 3] = n[h + 1];
          } else {
            for (var g = 0; g < 4; ++g) {
              c = n[h + g];
              f[l + (3 & -g)] = u[vq[c >>> 24]] ^ d[vq[c >>> 16 & 255]] ^ p[vq[c >>> 8 & 255]] ^ m[vq[c & 255]];
            }
          }
        }
        n = f;
      }
      return n;
    }
    function Nso(e, t, n, r) {
      var o = e.length / 4 - 1;
      var s;
      var i;
      var a;
      var l;
      var c;
      if (r) {
        s = Hre[0];
        i = Hre[1];
        a = Hre[2];
        l = Hre[3];
        c = Mso;
      } else {
        s = NGe[0];
        i = NGe[1];
        a = NGe[2];
        l = NGe[3];
        c = vq;
      }
      var u;
      var d;
      var p;
      var m;
      var f;
      var h;
      var g;
      u = t[0] ^ e[0];
      d = t[r ? 3 : 1] ^ e[1];
      p = t[2] ^ e[2];
      m = t[r ? 1 : 3] ^ e[3];
      var y = 3;
      for (var _ = 1; _ < o; ++_) {
        f = s[u >>> 24] ^ i[d >>> 16 & 255] ^ a[p >>> 8 & 255] ^ l[m & 255] ^ e[++y];
        h = s[d >>> 24] ^ i[p >>> 16 & 255] ^ a[m >>> 8 & 255] ^ l[u & 255] ^ e[++y];
        g = s[p >>> 24] ^ i[m >>> 16 & 255] ^ a[u >>> 8 & 255] ^ l[d & 255] ^ e[++y];
        m = s[m >>> 24] ^ i[u >>> 16 & 255] ^ a[d >>> 8 & 255] ^ l[p & 255] ^ e[++y];
        u = f;
        d = h;
        p = g;
      }
      n[0] = c[u >>> 24] << 24 ^ c[d >>> 16 & 255] << 16 ^ c[p >>> 8 & 255] << 8 ^ c[m & 255] ^ e[++y];
      n[r ? 3 : 1] = c[d >>> 24] << 24 ^ c[p >>> 16 & 255] << 16 ^ c[m >>> 8 & 255] << 8 ^ c[u & 255] ^ e[++y];
      n[2] = c[p >>> 24] << 24 ^ c[m >>> 16 & 255] << 16 ^ c[u >>> 8 & 255] << 8 ^ c[d & 255] ^ e[++y];
      n[r ? 1 : 3] = c[m >>> 24] << 24 ^ c[u >>> 16 & 255] << 16 ^ c[d >>> 8 & 255] << 8 ^ c[p & 255] ^ e[++y];
    }
    function jFn(e) {
      e = e || {};
      var t = (e.mode || "CBC").toUpperCase();
      var n = "AES-" + t;
      var r;
      if (e.decrypt) {
        r = yw.cipher.createDecipher(n, e.key);
      } else {
        r = yw.cipher.createCipher(n, e.key);
      }
      var o = r.start;
      r.start = function (s, i) {
        var a = null;
        if (i instanceof yw.util.ByteBuffer) {
          a = i;
          i = {};
        }
        i = i || {};
        i.output = a;
        i.iv = s;
        o.call(r, i);
      };
      return r;
    }
  });
  var TOe = __commonJS((rIy, Wta) => {
    var cqt = wf();
    cqt.pki = cqt.pki || {};
    var Fso = Wta.exports = cqt.pki.oids = cqt.oids = cqt.oids || {};
    function fi(e, t) {
      Fso[e] = t;
      Fso[t] = e;
    }
    function _S(e, t) {
      Fso[e] = t;
    }
    fi("1.2.840.113549.1.1.1", "rsaEncryption");
    fi("1.2.840.113549.1.1.4", "md5WithRSAEncryption");
    fi("1.2.840.113549.1.1.5", "sha1WithRSAEncryption");
    fi("1.2.840.113549.1.1.7", "RSAES-OAEP");
    fi("1.2.840.113549.1.1.8", "mgf1");
    fi("1.2.840.113549.1.1.9", "pSpecified");
    fi("1.2.840.113549.1.1.10", "RSASSA-PSS");
    fi("1.2.840.113549.1.1.11", "sha256WithRSAEncryption");
    fi("1.2.840.113549.1.1.12", "sha384WithRSAEncryption");
    fi("1.2.840.113549.1.1.13", "sha512WithRSAEncryption");
    fi("1.3.101.112", "EdDSA25519");
    fi("1.2.840.10040.4.3", "dsa-with-sha1");
    fi("1.3.14.3.2.7", "desCBC");
    fi("1.3.14.3.2.26", "sha1");
    fi("1.3.14.3.2.29", "sha1WithRSASignature");
    fi("2.16.840.1.101.3.4.2.1", "sha256");
    fi("2.16.840.1.101.3.4.2.2", "sha384");
    fi("2.16.840.1.101.3.4.2.3", "sha512");
    fi("2.16.840.1.101.3.4.2.4", "sha224");
    fi("2.16.840.1.101.3.4.2.5", "sha512-224");
    fi("2.16.840.1.101.3.4.2.6", "sha512-256");
    fi("1.2.840.113549.2.2", "md2");
    fi("1.2.840.113549.2.5", "md5");
    fi("1.2.840.113549.1.7.1", "data");
    fi("1.2.840.113549.1.7.2", "signedData");
    fi("1.2.840.113549.1.7.3", "envelopedData");
    fi("1.2.840.113549.1.7.4", "signedAndEnvelopedData");
    fi("1.2.840.113549.1.7.5", "digestedData");
    fi("1.2.840.113549.1.7.6", "encryptedData");
    fi("1.2.840.113549.1.9.1", "emailAddress");
    fi("1.2.840.113549.1.9.2", "unstructuredName");
    fi("1.2.840.113549.1.9.3", "contentType");
    fi("1.2.840.113549.1.9.4", "messageDigest");
    fi("1.2.840.113549.1.9.5", "signingTime");
    fi("1.2.840.113549.1.9.6", "counterSignature");
    fi("1.2.840.113549.1.9.7", "challengePassword");
    fi("1.2.840.113549.1.9.8", "unstructuredAddress");
    fi("1.2.840.113549.1.9.14", "extensionRequest");
    fi("1.2.840.113549.1.9.20", "friendlyName");
    fi("1.2.840.113549.1.9.21", "localKeyId");
    fi("1.2.840.113549.1.9.22.1", "x509Certificate");
    fi("1.2.840.113549.1.12.10.1.1", "keyBag");
    fi("1.2.840.113549.1.12.10.1.2", "pkcs8ShroudedKeyBag");
    fi("1.2.840.113549.1.12.10.1.3", "certBag");
    fi("1.2.840.113549.1.12.10.1.4", "crlBag");
    fi("1.2.840.113549.1.12.10.1.5", "secretBag");
    fi("1.2.840.113549.1.12.10.1.6", "safeContentsBag");
    fi("1.2.840.113549.1.5.13", "pkcs5PBES2");
    fi("1.2.840.113549.1.5.12", "pkcs5PBKDF2");
    fi("1.2.840.113549.1.12.1.1", "pbeWithSHAAnd128BitRC4");
    fi("1.2.840.113549.1.12.1.2", "pbeWithSHAAnd40BitRC4");
    fi("1.2.840.113549.1.12.1.3", "pbeWithSHAAnd3-KeyTripleDES-CBC");
    fi("1.2.840.113549.1.12.1.4", "pbeWithSHAAnd2-KeyTripleDES-CBC");
    fi("1.2.840.113549.1.12.1.5", "pbeWithSHAAnd128BitRC2-CBC");
    fi("1.2.840.113549.1.12.1.6", "pbewithSHAAnd40BitRC2-CBC");
    fi("1.2.840.113549.2.7", "hmacWithSHA1");
    fi("1.2.840.113549.2.8", "hmacWithSHA224");
    fi("1.2.840.113549.2.9", "hmacWithSHA256");
    fi("1.2.840.113549.2.10", "hmacWithSHA384");
    fi("1.2.840.113549.2.11", "hmacWithSHA512");
    fi("1.2.840.113549.3.7", "des-EDE3-CBC");
    fi("2.16.840.1.101.3.4.1.2", "aes128-CBC");
    fi("2.16.840.1.101.3.4.1.22", "aes192-CBC");
    fi("2.16.840.1.101.3.4.1.42", "aes256-CBC");
    fi("2.5.4.3", "commonName");
    fi("2.5.4.4", "surname");
    fi("2.5.4.5", "serialNumber");
    fi("2.5.4.6", "countryName");
    fi("2.5.4.7", "localityName");
    fi("2.5.4.8", "stateOrProvinceName");
    fi("2.5.4.9", "streetAddress");
    fi("2.5.4.10", "organizationName");
    fi("2.5.4.11", "organizationalUnitName");
    fi("2.5.4.12", "title");
    fi("2.5.4.13", "description");
    fi("2.5.4.15", "businessCategory");
    fi("2.5.4.17", "postalCode");
    fi("2.5.4.42", "givenName");
    fi("2.5.4.65", "pseudonym");
    fi("1.3.6.1.4.1.311.60.2.1.2", "jurisdictionOfIncorporationStateOrProvinceName");
    fi("1.3.6.1.4.1.311.60.2.1.3", "jurisdictionOfIncorporationCountryName");
    fi("2.16.840.1.113730.1.1", "nsCertType");
    fi("2.16.840.1.113730.1.13", "nsComment");
    _S("2.5.29.1", "authorityKeyIdentifier");
    _S("2.5.29.2", "keyAttributes");
    _S("2.5.29.3", "certificatePolicies");
    _S("2.5.29.4", "keyUsageRestriction");
    _S("2.5.29.5", "policyMapping");
    _S("2.5.29.6", "subtreesConstraint");
    _S("2.5.29.7", "subjectAltName");
    _S("2.5.29.8", "issuerAltName");
    _S("2.5.29.9", "subjectDirectoryAttributes");
    _S("2.5.29.10", "basicConstraints");
    _S("2.5.29.11", "nameConstraints");
    _S("2.5.29.12", "policyConstraints");
    _S("2.5.29.13", "basicConstraints");
    fi("2.5.29.14", "subjectKeyIdentifier");
    fi("2.5.29.15", "keyUsage");
    _S("2.5.29.16", "privateKeyUsagePeriod");
    fi("2.5.29.17", "subjectAltName");
    fi("2.5.29.18", "issuerAltName");
    fi("2.5.29.19", "basicConstraints");
    _S("2.5.29.20", "cRLNumber");
    _S("2.5.29.21", "cRLReason");
    _S("2.5.29.22", "expirationDate");
    _S("2.5.29.23", "instructionCode");
    _S("2.5.29.24", "invalidityDate");
    _S("2.5.29.25", "cRLDistributionPoints");
    _S("2.5.29.26", "issuingDistributionPoint");
    _S("2.5.29.27", "deltaCRLIndicator");
    _S("2.5.29.28", "issuingDistributionPoint");
    _S("2.5.29.29", "certificateIssuer");
    _S("2.5.29.30", "nameConstraints");
    fi("2.5.29.31", "cRLDistributionPoints");
    fi("2.5.29.32", "certificatePolicies");
    _S("2.5.29.33", "policyMappings");
    _S("2.5.29.34", "policyConstraints");
    fi("2.5.29.35", "authorityKeyIdentifier");
    _S("2.5.29.36", "policyConstraints");
    fi("2.5.29.37", "extKeyUsage");
    _S("2.5.29.46", "freshestCRL");
    _S("2.5.29.54", "inhibitAnyPolicy");
    fi("1.3.6.1.4.1.11129.2.4.2", "timestampList");
    fi("1.3.6.1.5.5.7.1.1", "authorityInfoAccess");
    fi("1.3.6.1.5.5.7.3.1", "serverAuth");
    fi("1.3.6.1.5.5.7.3.2", "clientAuth");
    fi("1.3.6.1.5.5.7.3.3", "codeSigning");
    fi("1.3.6.1.5.5.7.3.4", "emailProtection");
    fi("1.3.6.1.5.5.7.3.8", "timeStamping");
  });
  var jre = __commonJS((oIy, Vta) => {
    var VC = wf();
    g_();
    TOe();
    var Va = Vta.exports = VC.asn1 = VC.asn1 || {};
    Va.Class = {
      UNIVERSAL: 0,
      APPLICATION: 64,
      CONTEXT_SPECIFIC: 128,
      PRIVATE: 192
    };
    Va.Type = {
      NONE: 0,
      BOOLEAN: 1,
      INTEGER: 2,
      BITSTRING: 3,
      OCTETSTRING: 4,
      NULL: 5,
      OID: 6,
      ODESC: 7,
      EXTERNAL: 8,
      REAL: 9,
      ENUMERATED: 10,
      EMBEDDED: 11,
      UTF8: 12,
      ROID: 13,
      SEQUENCE: 16,
      SET: 17,
      PRINTABLESTRING: 19,
      IA5STRING: 22,
      UTCTIME: 23,
      GENERALIZEDTIME: 24,
      BMPSTRING: 30
    };
    Va.maxDepth = 256;
    Va.create = function (e, t, n, r, o) {
      if (VC.util.isArray(r)) {
        var s = [];
        for (var i = 0; i < r.length; ++i) {
          if (r[i] !== undefined) {
            s.push(r[i]);
          }
        }
        r = s;
      }
      var a = {
        tagClass: e,
        type: t,
        constructed: n,
        composed: n || VC.util.isArray(r),
        value: r
      };
      if (o && "bitStringContents" in o) {
        a.bitStringContents = o.bitStringContents;
        a.original = Va.copy(a);
      }
      return a;
    };
    Va.copy = function (e, t) {
      var n;
      if (VC.util.isArray(e)) {
        n = [];
        for (var r = 0; r < e.length; ++r) {
          n.push(Va.copy(e[r], t));
        }
        return n;
      }
      if (typeof e === "string") {
        return e;
      }
      if (n = {
        tagClass: e.tagClass,
        type: e.type,
        constructed: e.constructed,
        composed: e.composed,
        value: Va.copy(e.value, t)
      }, t && !t.excludeBitStringContents) {
        n.bitStringContents = e.bitStringContents;
      }
      return n;
    };
    Va.equals = function (e, t, n) {
      if (VC.util.isArray(e)) {
        if (!VC.util.isArray(t)) {
          return false;
        }
        if (e.length !== t.length) {
          return false;
        }
        for (var r = 0; r < e.length; ++r) {
          if (!Va.equals(e[r], t[r])) {
            return false;
          }
        }
        return true;
      }
      if (typeof e !== typeof t) {
        return false;
      }
      if (typeof e === "string") {
        return e === t;
      }
      var o = e.tagClass === t.tagClass && e.type === t.type && e.constructed === t.constructed && e.composed === t.composed && Va.equals(e.value, t.value);
      if (n && n.includeBitStringContents) {
        o = o && e.bitStringContents === t.bitStringContents;
      }
      return o;
    };
    Va.getBerValueLength = function (e) {
      var t = e.getByte();
      if (t === 128) {
        return;
      }
      var n;
      var r = t & 128;
      if (!r) {
        n = t;
      } else {
        n = e.getInt((t & 127) << 3);
      }
      return n;
    };
    function uqt(e, t, n) {
      if (n > t) {
        var r = Error("Too few bytes to parse DER.");
        throw r.available = e.length(), r.remaining = t, r.requested = n, r;
      }
    }
    var Qsp = function (e, t) {
      var n = e.getByte();
      if (t--, n === 128) {
        return;
      }
      var r;
      var o = n & 128;
      if (!o) {
        r = n;
      } else {
        var s = n & 127;
        uqt(e, t, s);
        r = e.getInt(s << 3);
      }
      if (r < 0) {
        throw Error("Negative length: " + r);
      }
      return r;
    };
    Va.fromDer = function (e, t) {
      if (t === undefined) {
        t = {
          strict: true,
          parseAllBytes: true,
          decodeBitStrings: true
        };
      }
      if (typeof t === "boolean") {
        t = {
          strict: t,
          parseAllBytes: true,
          decodeBitStrings: true
        };
      }
      if (!("strict" in t)) {
        t.strict = true;
      }
      if (!("parseAllBytes" in t)) {
        t.parseAllBytes = true;
      }
      if (!("decodeBitStrings" in t)) {
        t.decodeBitStrings = true;
      }
      if (!("maxDepth" in t)) {
        t.maxDepth = Va.maxDepth;
      }
      if (typeof e === "string") {
        e = VC.util.createBuffer(e);
      }
      var n = e.length();
      var r = qFn(e, e.length(), 0, t);
      if (t.parseAllBytes && e.length() !== 0) {
        var o = Error("Unparsed DER bytes remain after ASN.1 parsing.");
        throw o.byteCount = n, o.remaining = e.length(), o;
      }
      return r;
    };
    function qFn(e, t, n, r) {
      if (n >= r.maxDepth) {
        throw Error("ASN.1 parsing error: Max depth exceeded.");
      }
      var o;
      uqt(e, t, 2);
      var s = e.getByte();
      t--;
      var i = s & 192;
      var a = s & 31;
      o = e.length();
      var l = Qsp(e, t);
      if (t -= o - e.length(), l !== undefined && l > t) {
        if (r.strict) {
          var c = Error("Too few bytes to read ASN.1 value.");
          throw c.available = e.length(), c.remaining = t, c.requested = l, c;
        }
        l = t;
      }
      var u;
      var d;
      var p = (s & 32) === 32;
      if (p) {
        if (u = [], l === undefined) {
          for (;;) {
            if (uqt(e, t, 2), e.bytes(2) === String.fromCharCode(0, 0)) {
              e.getBytes(2);
              t -= 2;
              break;
            }
            o = e.length();
            u.push(qFn(e, t, n + 1, r));
            t -= o - e.length();
          }
        } else {
          while (l > 0) {
            o = e.length();
            u.push(qFn(e, l, n + 1, r));
            t -= o - e.length();
            l -= o - e.length();
          }
        }
      }
      if (u === undefined && i === Va.Class.UNIVERSAL && a === Va.Type.BITSTRING) {
        d = e.bytes(l);
      }
      if (u === undefined && r.decodeBitStrings && i === Va.Class.UNIVERSAL && a === Va.Type.BITSTRING && l > 1) {
        var m = e.read;
        var f = t;
        var h = 0;
        if (a === Va.Type.BITSTRING) {
          uqt(e, t, 1);
          h = e.getByte();
          t--;
        }
        if (h === 0) {
          try {
            o = e.length();
            var g = {
              strict: true,
              decodeBitStrings: true
            };
            var y = qFn(e, t, n + 1, g);
            var _ = o - e.length();
            if (t -= _, a == Va.Type.BITSTRING) {
              _++;
            }
            var b = y.tagClass;
            if (_ === l && (b === Va.Class.UNIVERSAL || b === Va.Class.CONTEXT_SPECIFIC)) {
              u = [y];
            }
          } catch (E) {}
        }
        if (u === undefined) {
          e.read = m;
          t = f;
        }
      }
      if (u === undefined) {
        if (l === undefined) {
          if (r.strict) {
            throw Error("Non-constructed ASN.1 object of indefinite length.");
          }
          l = t;
        }
        if (a === Va.Type.BMPSTRING) {
          u = "";
          for (; l > 0; l -= 2) {
            uqt(e, t, 2);
            u += String.fromCharCode(e.getInt16());
            t -= 2;
          }
        } else {
          u = e.getBytes(l);
          t -= l;
        }
      }
      var S = d === undefined ? null : {
        bitStringContents: d
      };
      return Va.create(i, a, p, u, S);
    }
    Va.toDer = function (e) {
      var t = VC.util.createBuffer();
      var n = e.tagClass | e.type;
      var r = VC.util.createBuffer();
      var o = false;
      if ("bitStringContents" in e) {
        if (o = true, e.original) {
          o = Va.equals(e, e.original);
        }
      }
      if (o) {
        r.putBytes(e.bitStringContents);
      } else if (e.composed) {
        if (e.constructed) {
          n |= 32;
        } else {
          r.putByte(0);
        }
        for (var s = 0; s < e.value.length; ++s) {
          if (e.value[s] !== undefined) {
            r.putBuffer(Va.toDer(e.value[s]));
          }
        }
      } else if (e.type === Va.Type.BMPSTRING) {
        for (var s = 0; s < e.value.length; ++s) {
          r.putInt16(e.value.charCodeAt(s));
        }
      } else if (e.type === Va.Type.INTEGER && e.value.length > 1 && (e.value.charCodeAt(0) === 0 && (e.value.charCodeAt(1) & 128) === 0 || e.value.charCodeAt(0) === 255 && (e.value.charCodeAt(1) & 128) === 128)) {
        r.putBytes(e.value.substr(1));
      } else {
        r.putBytes(e.value);
      }
      if (t.putByte(n), r.length() <= 127) {
        t.putByte(r.length() & 127);
      } else {
        var i = r.length();
        var a = "";
        do {
          a += String.fromCharCode(i & 255);
          i = i >>> 8;
        } while (i > 0);
        t.putByte(a.length | 128);
        for (var s = a.length - 1; s >= 0; --s) {
          t.putByte(a.charCodeAt(s));
        }
      }
      t.putBuffer(r);
      return t;
    };
    Va.oidToDer = function (e) {
      var t = e.split(".");
      var n = VC.util.createBuffer();
      n.putByte(40 * parseInt(t[0], 10) + parseInt(t[1], 10));
      var r;
      var o;
      var s;
      var i;
      for (var a = 2; a < t.length; ++a) {
        if (r = true, o = [], s = parseInt(t[a], 10), s > 4294967295) {
          throw Error("OID value too large; max is 32-bits.");
        }
        do {
          if (i = s & 127, s = s >>> 7, !r) {
            i |= 128;
          }
          o.push(i);
          r = false;
        } while (s > 0);
        for (var l = o.length - 1; l >= 0; --l) {
          n.putByte(o[l]);
        }
      }
      return n;
    };
    Va.derToOid = function (e) {
      var t;
      if (typeof e === "string") {
        e = VC.util.createBuffer(e);
      }
      var n = e.getByte();
      t = Math.floor(n / 40) + "." + n % 40;
      var r = 0;
      while (e.length() > 0) {
        if (r > 70368744177663) {
          throw Error("OID value too large; max is 53-bits.");
        }
        if (n = e.getByte(), r = r * 128, n & 128) {
          r += n & 127;
        } else {
          t += "." + (r + n);
          r = 0;
        }
      }
      return t;
    };
    Va.utcTimeToDate = function (e) {
      var t = new Date();
      var n = parseInt(e.substr(0, 2), 10);
      n = n >= 50 ? 1900 + n : 2000 + n;
      var r = parseInt(e.substr(2, 2), 10) - 1;
      var o = parseInt(e.substr(4, 2), 10);
      var s = parseInt(e.substr(6, 2), 10);
      var i = parseInt(e.substr(8, 2), 10);
      var a = 0;
      if (e.length > 11) {
        var l = e.charAt(10);
        var c = 10;
        if (l !== "+" && l !== "-") {
          a = parseInt(e.substr(10, 2), 10);
          c += 2;
        }
      }
      if (t.setUTCFullYear(n, r, o), t.setUTCHours(s, i, a, 0), c) {
        if (l = e.charAt(c), l === "+" || l === "-") {
          var u = parseInt(e.substr(c + 1, 2), 10);
          var d = parseInt(e.substr(c + 4, 2), 10);
          var p = u * 60 + d;
          if (p *= 60000, l === "+") {
            t.setTime(+t - p);
          } else {
            t.setTime(+t + p);
          }
        }
      }
      return t;
    };
    Va.generalizedTimeToDate = function (e) {
      var t = new Date();
      var n = parseInt(e.substr(0, 4), 10);
      var r = parseInt(e.substr(4, 2), 10) - 1;
      var o = parseInt(e.substr(6, 2), 10);
      var s = parseInt(e.substr(8, 2), 10);
      var i = parseInt(e.substr(10, 2), 10);
      var a = parseInt(e.substr(12, 2), 10);
      var l = 0;
      var c = 0;
      var u = false;
      if (e.charAt(e.length - 1) === "Z") {
        u = true;
      }
      var d = e.length - 5;
      var p = e.charAt(d);
      if (p === "+" || p === "-") {
        var m = parseInt(e.substr(d + 1, 2), 10);
        var f = parseInt(e.substr(d + 4, 2), 10);
        if (c = m * 60 + f, c *= 60000, p === "+") {
          c *= -1;
        }
        u = true;
      }
      if (e.charAt(14) === ".") {
        l = parseFloat(e.substr(14), 10) * 1000;
      }
      if (u) {
        t.setUTCFullYear(n, r, o);
        t.setUTCHours(s, i, a, l);
        t.setTime(+t + c);
      } else {
        t.setFullYear(n, r, o);
        t.setHours(s, i, a, l);
      }
      return t;
    };
    Va.dateToUtcTime = function (e) {
      if (typeof e === "string") {
        return e;
      }
      var t = "";
      var n = [];
      n.push(("" + e.getUTCFullYear()).substr(2));
      n.push("" + (e.getUTCMonth() + 1));
      n.push("" + e.getUTCDate());
      n.push("" + e.getUTCHours());
      n.push("" + e.getUTCMinutes());
      n.push("" + e.getUTCSeconds());
      for (var r = 0; r < n.length; ++r) {
        if (n[r].length < 2) {
          t += "0";
        }
        t += n[r];
      }
      t += "Z";
      return t;
    };
    Va.dateToGeneralizedTime = function (e) {
      if (typeof e === "string") {
        return e;
      }
      var t = "";
      var n = [];
      n.push("" + e.getUTCFullYear());
      n.push("" + (e.getUTCMonth() + 1));
      n.push("" + e.getUTCDate());
      n.push("" + e.getUTCHours());
      n.push("" + e.getUTCMinutes());
      n.push("" + e.getUTCSeconds());
      for (var r = 0; r < n.length; ++r) {
        if (n[r].length < 2) {
          t += "0";
        }
        t += n[r];
      }
      t += "Z";
      return t;
    };
    Va.integerToDer = function (e) {
      var t = VC.util.createBuffer();
      if (e >= -128 && e < 128) {
        return t.putSignedInt(e, 8);
      }
      if (e >= -32768 && e < 32768) {
        return t.putSignedInt(e, 16);
      }
      if (e >= -8388608 && e < 8388608) {
        return t.putSignedInt(e, 24);
      }
      if (e >= -2147483648 && e < 2147483648) {
        return t.putSignedInt(e, 32);
      }
      var n = Error("Integer too large; max is 32-bits.");
      throw n.integer = e, n;
    };
    Va.derToInteger = function (e) {
      if (typeof e === "string") {
        e = VC.util.createBuffer(e);
      }
      var t = e.length() * 8;
      if (t > 32) {
        throw Error("Integer too large; max is 32-bits.");
      }
      return e.getSignedInt(t);
    };
    Va.validate = function (e, t, n, r) {
      var o = false;
      if ((e.tagClass === t.tagClass || typeof t.tagClass > "u") && (e.type === t.type || typeof t.type > "u")) {
        if (e.constructed === t.constructed || typeof t.constructed > "u") {
          if (o = true, t.value && VC.util.isArray(t.value)) {
            var s = 0;
            for (var i = 0; o && i < t.value.length; ++i) {
              var a = t.value[i];
              o = !!a.optional;
              var l = e.value[s];
              if (!l) {
                if (!a.optional) {
                  if (o = false, r) {
                    r.push("[" + t.name + '] Missing required element. Expected tag class "' + a.tagClass + '", type "' + a.type + '"');
                  }
                }
                continue;
              }
              var c = typeof a.tagClass < "u" && typeof a.type < "u";
              if (c && (l.tagClass !== a.tagClass || l.type !== a.type)) {
                if (a.optional) {
                  o = true;
                  continue;
                } else {
                  if (o = false, r) {
                    r.push("[" + t.name + "] Tag mismatch. Expected (" + a.tagClass + "," + a.type + "), got (" + l.tagClass + "," + l.type + ")");
                  }
                  break;
                }
              }
              var u = Va.validate(l, a, n, r);
              if (u) {
                ++s;
                o = true;
              } else if (a.optional) {
                o = true;
              } else {
                o = false;
                break;
              }
            }
          }
          if (o && n) {
            if (t.capture) {
              n[t.capture] = e.value;
            }
            if (t.captureAsn1) {
              n[t.captureAsn1] = e;
            }
            if (t.captureBitStringContents && "bitStringContents" in e) {
              n[t.captureBitStringContents] = e.bitStringContents;
            }
            if (t.captureBitStringValue && "bitStringContents" in e) {
              var d;
              if (e.bitStringContents.length < 2) {
                n[t.captureBitStringValue] = "";
              } else {
                var p = e.bitStringContents.charCodeAt(0);
                if (p !== 0) {
                  throw Error("captureBitStringValue only supported for zero unused bits");
                }
                n[t.captureBitStringValue] = e.bitStringContents.slice(1);
              }
            }
          }
        } else if (r) {
          r.push("[" + t.name + '] Expected constructed "' + t.constructed + '", got "' + e.constructed + '"');
        }
      } else if (r) {
        if (e.tagClass !== t.tagClass) {
          r.push("[" + t.name + '] Expected tag class "' + t.tagClass + '", got "' + e.tagClass + '"');
        }
        if (e.type !== t.type) {
          r.push("[" + t.name + '] Expected type "' + t.type + '", got "' + e.type + '"');
        }
      }
      return o;
    };
    Va.prettyPrint = function (e, t, n) {
      var r = "";
      if (t = t || 0, n = n || 2, t > 0) {
        r += `
`;
      }
      var o = "";
      for (var s = 0; s < t * n; ++s) {
        o += " ";
      }
      switch (r += o + "Tag: ", e.tagClass) {
        case Va.Class.UNIVERSAL:
          r += "Universal:";
          break;
        case Va.Class.APPLICATION:
          r += "Application:";
          break;
        case Va.Class.CONTEXT_SPECIFIC:
          r += "Context-Specific:";
          break;
        case Va.Class.PRIVATE:
          r += "Private:";
          break;
      }
      if (e.tagClass === Va.Class.UNIVERSAL) {
        switch (r += e.type, e.type) {
          case Va.Type.NONE:
            r += " (None)";
            break;
          case Va.Type.BOOLEAN:
            r += " (Boolean)";
            break;
          case Va.Type.INTEGER:
            r += " (Integer)";
            break;
          case Va.Type.BITSTRING:
            r += " (Bit string)";
            break;
          case Va.Type.OCTETSTRING:
            r += " (Octet string)";
            break;
          case Va.Type.NULL:
            r += " (Null)";
            break;
          case Va.Type.OID:
            r += " (Object Identifier)";
            break;
          case Va.Type.ODESC:
            r += " (Object Descriptor)";
            break;
          case Va.Type.EXTERNAL:
            r += " (External or Instance of)";
            break;
          case Va.Type.REAL:
            r += " (Real)";
            break;
          case Va.Type.ENUMERATED:
            r += " (Enumerated)";
            break;
          case Va.Type.EMBEDDED:
            r += " (Embedded PDV)";
            break;
          case Va.Type.UTF8:
            r += " (UTF8)";
            break;
          case Va.Type.ROID:
            r += " (Relative Object Identifier)";
            break;
          case Va.Type.SEQUENCE:
            r += " (Sequence)";
            break;
          case Va.Type.SET:
            r += " (Set)";
            break;
          case Va.Type.PRINTABLESTRING:
            r += " (Printable String)";
            break;
          case Va.Type.IA5String:
            r += " (IA5String (ASCII))";
            break;
          case Va.Type.UTCTIME:
            r += " (UTC time)";
            break;
          case Va.Type.GENERALIZEDTIME:
            r += " (Generalized time)";
            break;
          case Va.Type.BMPSTRING:
            r += " (BMP String)";
            break;
        }
      } else {
        r += e.type;
      }
      if (r += `
`, r += o + "Constructed: " + e.constructed + `
`, e.composed) {
        var i = 0;
        var a = "";
        for (var s = 0; s < e.value.length; ++s) {
          if (e.value[s] !== undefined) {
            if (i += 1, a += Va.prettyPrint(e.value[s], t + 1, n), s + 1 < e.value.length) {
              a += ",";
            }
          }
        }
        r += o + "Sub values: " + i + a;
      } else {
        if (r += o + "Value: ", e.type === Va.Type.OID) {
          var l = Va.derToOid(e.value);
          if (r += l, VC.pki && VC.pki.oids) {
            if (l in VC.pki.oids) {
              r += " (" + VC.pki.oids[l] + ") ";
            }
          }
        }
        if (e.type === Va.Type.INTEGER) {
          try {
            r += Va.derToInteger(e.value);
          } catch (u) {
            r += "0x" + VC.util.bytesToHex(e.value);
          }
        } else if (e.type === Va.Type.BITSTRING) {
          if (e.value.length > 1) {
            r += "0x" + VC.util.bytesToHex(e.value.slice(1));
          } else {
            r += "(none)";
          }
          if (e.value.length > 0) {
            var c = e.value.charCodeAt(0);
            if (c == 1) {
              r += " (1 unused bit shown)";
            } else if (c > 1) {
              r += " (" + c + " unused bits shown)";
            }
          }
        } else if (e.type === Va.Type.OCTETSTRING) {
          if (!(/[^\\u0000-\\u00ff]/).test(e.value)) {
            r += "(" + e.value + ") ";
          }
          r += "0x" + VC.util.bytesToHex(e.value);
        } else if (e.type === Va.Type.UTF8) {
          try {
            r += VC.util.decodeUtf8(e.value);
          } catch (u) {
            if (u.message === "URI malformed") {
              r += "0x" + VC.util.bytesToHex(e.value) + " (malformed UTF8)";
            } else {
              throw u;
            }
          }
        } else if (e.type === Va.Type.PRINTABLESTRING || e.type === Va.Type.IA5String) {
          r += e.value;
        } else if ((/[^\\u0000-\\u00ff]/).test(e.value)) {
          r += "0x" + VC.util.bytesToHex(e.value);
        } else if (e.value.length === 0) {
          r += "[null]";
        } else {
          r += e.value;
        }
      }
      return r;
    };
  });
  var Hue = __commonJS((sIy, zta) => {
    var WFn = wf();
    zta.exports = WFn.md = WFn.md || {};
    WFn.md.algorithms = WFn.md.algorithms || {};
  });
  var Mut = __commonJS((iIy, Kta) => {
    var NSe = wf();
    Hue();
    g_();
    var Zsp = Kta.exports = NSe.hmac = NSe.hmac || {};
    Zsp.create = function () {
      var e = null;
      var t = null;
      var n = null;
      var r = null;
      var o = {};
      o.start = function (s, i) {
        if (s !== null) {
          if (typeof s === "string") {
            if (s = s.toLowerCase(), s in NSe.md.algorithms) {
              t = NSe.md.algorithms[s].create();
            } else {
              throw Error('Unknown hash algorithm "' + s + '"');
            }
          } else {
            t = s;
          }
        }
        if (i === null) {
          i = e;
        } else {
          if (typeof i === "string") {
            i = NSe.util.createBuffer(i);
          } else if (NSe.util.isArray(i)) {
            var a = i;
            i = NSe.util.createBuffer();
            for (var l = 0; l < a.length; ++l) {
              i.putByte(a[l]);
            }
          }
          var c = i.length();
          if (c > t.blockLength) {
            t.start();
            t.update(i.bytes());
            i = t.digest();
          }
          n = NSe.util.createBuffer();
          r = NSe.util.createBuffer();
          c = i.length();
          for (var l = 0; l < c; ++l) {
            var a = i.at(l);
            n.putByte(54 ^ a);
            r.putByte(92 ^ a);
          }
          if (c < t.blockLength) {
            var a = t.blockLength - c;
            for (var l = 0; l < a; ++l) {
              n.putByte(54);
              r.putByte(92);
            }
          }
          e = i;
          n = n.bytes();
          r = r.bytes();
        }
        t.start();
        t.update(n);
      };
      o.update = function (s) {
        t.update(s);
      };
      o.getMac = function () {
        var s = t.digest().bytes();
        t.start();
        t.update(r);
        t.update(s);
        return t.digest();
      };
      o.digest = o.getMac;
      return o;
    };
  });
  var VFn = __commonJS((aIy, Qta) => {
    var jue = wf();
    Hue();
    g_();
    var Jta = Qta.exports = jue.md5 = jue.md5 || {};
    jue.md.md5 = jue.md.algorithms.md5 = Jta;
    Jta.create = function () {
      if (!Xta) {
        eip();
      }
      var e = null;
      var t = jue.util.createBuffer();
      var n = Array(16);
      var r = {
        algorithm: "md5",
        blockLength: 64,
        digestLength: 16,
        messageLength: 0,
        fullMessageLength: null,
        messageLengthSize: 8
      };
      r.start = function () {
        r.messageLength = 0;
        r.fullMessageLength = r.messageLength64 = [];
        var o = r.messageLengthSize / 4;
        for (var s = 0; s < o; ++s) {
          r.fullMessageLength.push(0);
        }
        t = jue.util.createBuffer();
        e = {
          h0: 1732584193,
          h1: 4023233417,
          h2: 2562383102,
          h3: 271733878
        };
        return r;
      };
      r.start();
      r.update = function (o, s) {
        if (s === "utf8") {
          o = jue.util.encodeUtf8(o);
        }
        var i = o.length;
        r.messageLength += i;
        i = [i / 4294967296 >>> 0, i >>> 0];
        for (var a = r.fullMessageLength.length - 1; a >= 0; --a) {
          r.fullMessageLength[a] += i[1];
          i[1] = i[0] + (r.fullMessageLength[a] / 4294967296 >>> 0);
          r.fullMessageLength[a] = r.fullMessageLength[a] >>> 0;
          i[0] = i[1] / 4294967296 >>> 0;
        }
        if (t.putBytes(o), Yta(e, n, t), t.read > 2048 || t.length() === 0) {
          t.compact();
        }
        return r;
      };
      r.digest = function () {
        var o = jue.util.createBuffer();
        o.putBytes(t.bytes());
        var s = r.fullMessageLength[r.fullMessageLength.length - 1] + r.messageLengthSize;
        var i = s & r.blockLength - 1;
        o.putBytes(Uso.substr(0, r.blockLength - i));
        var a;
        var l = 0;
        for (var c = r.fullMessageLength.length - 1; c >= 0; --c) {
          a = r.fullMessageLength[c] * 8 + l;
          l = a / 4294967296 >>> 0;
          o.putInt32Le(a >>> 0);
        }
        var u = {
          h0: e.h0,
          h1: e.h1,
          h2: e.h2,
          h3: e.h3
        };
        Yta(u, n, o);
        var d = jue.util.createBuffer();
        d.putInt32Le(u.h0);
        d.putInt32Le(u.h1);
        d.putInt32Le(u.h2);
        d.putInt32Le(u.h3);
        return d;
      };
      return r;
    };
    var Uso = null;
    var GFn = null;
    var dqt = null;
    var Nut = null;
    var Xta = false;
    function eip() {
      Uso = String.fromCharCode(128);
      Uso += jue.util.fillString(String.fromCharCode(0), 64);
      GFn = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 6, 11, 0, 5, 10, 15, 4, 9, 14, 3, 8, 13, 2, 7, 12, 5, 8, 11, 14, 1, 4, 7, 10, 13, 0, 3, 6, 9, 12, 15, 2, 0, 7, 14, 5, 12, 3, 10, 1, 8, 15, 6, 13, 4, 11, 2, 9];
      dqt = [7, 12, 17, 22, 7, 12, 17, 22, 7, 12, 17, 22, 7, 12, 17, 22, 5, 9, 14, 20, 5, 9, 14, 20, 5, 9, 14, 20, 5, 9, 14, 20, 4, 11, 16, 23, 4, 11, 16, 23, 4, 11, 16, 23, 4, 11, 16, 23, 6, 10, 15, 21, 6, 10, 15, 21, 6, 10, 15, 21, 6, 10, 15, 21];
      Nut = Array(64);
      for (var e = 0; e < 64; ++e) {
        Nut[e] = Math.floor(Math.abs(Math.sin(e + 1)) * 4294967296);
      }
      Xta = true;
    }
    function Yta(e, t, n) {
      var r;
      var o;
      var s;
      var i;
      var a;
      var l;
      var c;
      var u;
      var d = n.length();
      while (d >= 64) {
        o = e.h0;
        s = e.h1;
        i = e.h2;
        a = e.h3;
        for (u = 0; u < 16; ++u) {
          t[u] = n.getInt32Le();
          l = a ^ s & (i ^ a);
          r = o + l + Nut[u] + t[u];
          c = dqt[u];
          o = a;
          a = i;
          i = s;
          s += r << c | r >>> 32 - c;
        }
        for (; u < 32; ++u) {
          l = i ^ a & (s ^ i);
          r = o + l + Nut[u] + t[GFn[u]];
          c = dqt[u];
          o = a;
          a = i;
          i = s;
          s += r << c | r >>> 32 - c;
        }
        for (; u < 48; ++u) {
          l = s ^ i ^ a;
          r = o + l + Nut[u] + t[GFn[u]];
          c = dqt[u];
          o = a;
          a = i;
          i = s;
          s += r << c | r >>> 32 - c;
        }
        for (; u < 64; ++u) {
          l = i ^ (s | ~a);
          r = o + l + Nut[u] + t[GFn[u]];
          c = dqt[u];
          o = a;
          a = i;
          i = s;
          s += r << c | r >>> 32 - c;
        }
        e.h0 = e.h0 + o | 0;
        e.h1 = e.h1 + s | 0;
        e.h2 = e.h2 + i | 0;
        e.h3 = e.h3 + a | 0;
        d -= 64;
      }
    }
  });
  var LGe = __commonJS((lIy, ena) => {
    var KFn = wf();
    g_();
    var Zta = ena.exports = KFn.pem = KFn.pem || {};
    Zta.HS = function (e, t) {
      t = t || {};
      var n = "-----BEGIN " + e.type + `-----\r
`;
      var r;
      if (e.procType) {
        r = {
          name: "Proc-Type",
          values: [String(e.procType.version), e.procType.type]
        };
        n += zFn(r);
      }
      if (e.contentDomain) {
        r = {
          name: "Content-Domain",
          values: [e.contentDomain]
        };
        n += zFn(r);
      }
      if (e.dekInfo) {
        if (r = {
          name: "DEK-Info",
          values: [e.dekInfo.algorithm]
        }, e.dekInfo.parameters) {
          r.values.push(e.dekInfo.parameters);
        }
        n += zFn(r);
      }
      if (e.headers) {
        for (var o = 0; o < e.headers.length; ++o) {
          n += zFn(e.headers[o]);
        }
      }
      if (e.procType) {
        n += `\r
`;
      }
      n += KFn.util.encode64(e.body, t.maxline || 64) + `\r
`;
      n += "-----END " + e.type + `-----\r
`;
      return n;
    };
    Zta.oC = function (e) {
      var t = [];
      var n = /\s*-----BEGIN ([A-Z0-9- ]+)-----\r?\n?([\x21-\x7e\s]+?(?:\r?\n\r?\n))?([:A-Za-z0-9+\/=\s]+?)-----END \1-----/g;
      var r = /([\x21-\x7e]+):\s*([\x21-\x7e\s^:]+)/;
      var o = /\r?\n/;
      var s;
      while (true) {
        if (s = n.exec(e), !s) {
          break;
        }
        var i = s[1];
        if (i === "NEW CERTIFICATE REQUEST") {
          i = "CERTIFICATE REQUEST";
        }
        var a = {
          type: i,
          procType: null,
          contentDomain: null,
          dekInfo: null,
          headers: [],
          body: KFn.util.decode64(s[3])
        };
        if (t.push(a), !s[2]) {
          continue;
        }
        var l = s[2].split(o);
        var c = 0;
        while (s && c < l.length) {
          var u = l[c].replace(/\s+$/, "");
          for (var d = c + 1; d < l.length; ++d) {
            var p = l[d];
            if (!/\s/.test(p[0])) {
              break;
            }
            u += p;
            c = d;
          }
          if (s = u.match(r), s) {
            var m = {
              name: s[1],
              values: []
            };
            var f = s[2].split(",");
            for (var h = 0; h < f.length; ++h) {
              m.values.push(tip(f[h]));
            }
            if (!a.procType) {
              if (m.name !== "Proc-Type") {
                throw Error('Invalid PEM formatted message. The first encapsulated header must be "Proc-Type".');
              } else if (m.values.length !== 2) {
                throw Error('Invalid PEM formatted message. The "Proc-Type" header must have two subfields.');
              }
              a.procType = {
                version: f[0],
                type: f[1]
              };
            } else if (!a.contentDomain && m.name === "Content-Domain") {
              a.contentDomain = f[0] || "";
            } else if (!a.dekInfo && m.name === "DEK-Info") {
              if (m.values.length === 0) {
                throw Error('Invalid PEM formatted message. The "DEK-Info" header must have at least one subfield.');
              }
              a.dekInfo = {
                algorithm: f[0],
                parameters: f[1] || null
              };
            } else {
              a.headers.push(m);
            }
          }
          ++c;
        }
        if (a.procType === "ENCRYPTED" && !a.dekInfo) {
          throw Error('Invalid PEM formatted message. The "DEK-Info" header must be present if "Proc-Type" is "ENCRYPTED".');
        }
      }
      if (t.length === 0) {
        throw Error("Invalid PEM formatted message.");
      }
      return t;
    };
    function zFn(e) {
      var t = e.name + ": ";
      var n = [];
      var r = function (l, c) {
        return " " + c;
      };
      for (var o = 0; o < e.values.length; ++o) {
        n.push(e.values[o].replace(/^(\S+\r\n)/, r));
      }
      t += n.join(",") + `\r
`;
      var s = 0;
      var i = -1;
      for (var o = 0; o < t.length; ++o, ++s) {
        if (s > 65 && i !== -1) {
          var a = t[i];
          if (a === ",") {
            ++i;
            t = t.substr(0, i) + `\r
 ` + t.substr(i);
          } else {
            t = t.substr(0, i) + `\r
` + a + t.substr(i + 1);
          }
          s = o - i - 1;
          i = -1;
          ++o;
        } else if (t[o] === " " || t[o] === "\t" || t[o] === ",") {
          i = o;
        }
      }
      return t;
    }
    function tip(e) {
      return e.replace(/^\s+/, "");
    }
  });
  var pqt = __commonJS((cIy, nna) => {
    var fx = wf();
    BFn();
    Dso();
    g_();
    nna.exports = fx.des = fx.des || {};
    fx.des.startEncrypting = function (e, t, n, r) {
      var o = YFn({
        key: e,
        output: n,
        decrypt: false,
        mode: r || (t === null ? "ECB" : "CBC")
      });
      o.start(t);
      return o;
    };
    fx.des.createEncryptionCipher = function (e, t) {
      return YFn({
        key: e,
        output: null,
        decrypt: false,
        mode: t
      });
    };
    fx.des.startDecrypting = function (e, t, n, r) {
      var o = YFn({
        key: e,
        output: n,
        decrypt: true,
        mode: r || (t === null ? "ECB" : "CBC")
      });
      o.start(t);
      return o;
    };
    fx.des.createDecryptionCipher = function (e, t) {
      return YFn({
        key: e,
        output: null,
        decrypt: true,
        mode: t
      });
    };
    fx.des.Algorithm = function (e, t) {
      var n = this;
      n.name = e;
      n.mode = new t({
        blockSize: 8,
        cipher: {
          encrypt: function (r, o) {
            return tna(n._keys, r, o, false);
          },
          decrypt: function (r, o) {
            return tna(n._keys, r, o, true);
          }
        }
      });
      n._init = false;
    };
    fx.des.Algorithm.prototype.initialize = function (e) {
      if (this._init) {
        return;
      }
      var t = fx.util.createBuffer(e.key);
      if (this.name.indexOf("3DES") === 0) {
        if (t.length() !== 24) {
          throw Error("Invalid Triple-DES key size: " + t.length() * 8);
        }
      }
      this._keys = uip(t);
      this._init = true;
    };
    que("DES-ECB", fx.cipher.modes.ecb);
    que("DES-CBC", fx.cipher.modes.cbc);
    que("DES-CFB", fx.cipher.modes.cfb);
    que("DES-OFB", fx.cipher.modes.ofb);
    que("DES-CTR", fx.cipher.modes.ctr);
    que("3DES-ECB", fx.cipher.modes.ecb);
    que("3DES-CBC", fx.cipher.modes.cbc);
    que("3DES-CFB", fx.cipher.modes.cfb);
    que("3DES-OFB", fx.cipher.modes.ofb);
    que("3DES-CTR", fx.cipher.modes.ctr);
    function que(e, t) {
      var n = function () {
        return new fx.des.Algorithm(e, t);
      };
      fx.cipher.registerAlgorithm(e, n);
    }
    var nip = [16843776, 0, 65536, 16843780, 16842756, 66564, 4, 65536, 1024, 16843776, 16843780, 1024, 16778244, 16842756, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, 16842752, 16842752, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, 16777216, 65536, 16843780, 4, 16842752, 16843776, 16777216, 16777216, 1024, 16842756, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, 16843780, 65540, 16842752, 16778244, 16777220, 1028, 66564, 16843776, 1028, 16778240, 16778240, 0, 65540, 66560, 0, 16842756];
    var rip = [-2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, -2147483648, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, -2147483648, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, -2147483648, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, -2147483648, -2146435040, -2146402272, 1081344];
    var oip = [520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584];
    var sip = [8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928];
    var iip = [256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080];
    var aip = [536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, 536870912, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312];
    var lip = [2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154];
    var cip = [268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696];
    function uip(e) {
      var t = [0, 4, 536870912, 536870916, 65536, 65540, 536936448, 536936452, 512, 516, 536871424, 536871428, 66048, 66052, 536936960, 536936964];
      var n = [0, 1, 1048576, 1048577, 67108864, 67108865, 68157440, 68157441, 256, 257, 1048832, 1048833, 67109120, 67109121, 68157696, 68157697];
      var r = [0, 8, 2048, 2056, 16777216, 16777224, 16779264, 16779272, 0, 8, 2048, 2056, 16777216, 16777224, 16779264, 16779272];
      var o = [0, 2097152, 134217728, 136314880, 8192, 2105344, 134225920, 136323072, 131072, 2228224, 134348800, 136445952, 139264, 2236416, 134356992, 136454144];
      var s = [0, 262144, 16, 262160, 0, 262144, 16, 262160, 4096, 266240, 4112, 266256, 4096, 266240, 4112, 266256];
      var i = [0, 1024, 32, 1056, 0, 1024, 32, 1056, 33554432, 33555456, 33554464, 33555488, 33554432, 33555456, 33554464, 33555488];
      var a = [0, 268435456, 524288, 268959744, 2, 268435458, 524290, 268959746, 0, 268435456, 524288, 268959744, 2, 268435458, 524290, 268959746];
      var l = [0, 65536, 2048, 67584, 536870912, 536936448, 536872960, 536938496, 131072, 196608, 133120, 198656, 537001984, 537067520, 537004032, 537069568];
      var c = [0, 262144, 0, 262144, 2, 262146, 2, 262146, 33554432, 33816576, 33554432, 33816576, 33554434, 33816578, 33554434, 33816578];
      var u = [0, 268435456, 8, 268435464, 0, 268435456, 8, 268435464, 1024, 268436480, 1032, 268436488, 1024, 268436480, 1032, 268436488];
      var d = [0, 32, 0, 32, 1048576, 1048608, 1048576, 1048608, 8192, 8224, 8192, 8224, 1056768, 1056800, 1056768, 1056800];
      var p = [0, 16777216, 512, 16777728, 2097152, 18874368, 2097664, 18874880, 67108864, 83886080, 67109376, 83886592, 69206016, 85983232, 69206528, 85983744];
      var m = [0, 4096, 134217728, 134221824, 524288, 528384, 134742016, 134746112, 16, 4112, 134217744, 134221840, 524304, 528400, 134742032, 134746128];
      var f = [0, 4, 256, 260, 0, 4, 256, 260, 1, 5, 257, 261, 1, 5, 257, 261];
      var h = e.length() > 8 ? 3 : 1;
      var g = [];
      var y = [0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0];
      var _ = 0;
      var b;
      for (var S = 0; S < h; S++) {
        var E = e.getInt32();
        var C = e.getInt32();
        b = (E >>> 4 ^ C) & 252645135;
        C ^= b;
        E ^= b << 4;
        b = (C >>> -16 ^ E) & 65535;
        E ^= b;
        C ^= b << -16;
        b = (E >>> 2 ^ C) & 858993459;
        C ^= b;
        E ^= b << 2;
        b = (C >>> -16 ^ E) & 65535;
        E ^= b;
        C ^= b << -16;
        b = (E >>> 1 ^ C) & 1431655765;
        C ^= b;
        E ^= b << 1;
        b = (C >>> 8 ^ E) & 16711935;
        E ^= b;
        C ^= b << 8;
        b = (E >>> 1 ^ C) & 1431655765;
        C ^= b;
        E ^= b << 1;
        b = E << 8 | C >>> 20 & 240;
        E = C << 24 | C << 8 & 16711680 | C >>> 8 & 65280 | C >>> 24 & 240;
        C = b;
        for (var x = 0; x < y.length; ++x) {
          if (y[x]) {
            E = E << 2 | E >>> 26;
            C = C << 2 | C >>> 26;
          } else {
            E = E << 1 | E >>> 27;
            C = C << 1 | C >>> 27;
          }
          E &= -15;
          C &= -15;
          var A = t[E >>> 28] | n[E >>> 24 & 15] | r[E >>> 20 & 15] | o[E >>> 16 & 15] | s[E >>> 12 & 15] | i[E >>> 8 & 15] | a[E >>> 4 & 15];
          var k = l[C >>> 28] | c[C >>> 24 & 15] | u[C >>> 20 & 15] | d[C >>> 16 & 15] | p[C >>> 12 & 15] | m[C >>> 8 & 15] | f[C >>> 4 & 15];
          b = (k >>> 16 ^ A) & 65535;
          g[_++] = A ^ b;
          g[_++] = k ^ b << 16;
        }
      }
      return g;
    }
    function tna(e, t, n, r) {
      var o = e.length === 32 ? 3 : 9;
      var s;
      if (o === 3) {
        s = r ? [30, -2, -2] : [0, 32, 2];
      } else {
        s = r ? [94, 62, -2, 32, 64, 2, 30, -2, -2] : [0, 32, 2, 62, 30, -2, 64, 96, 2];
      }
      var i;
      var a = t[0];
      var l = t[1];
      i = (a >>> 4 ^ l) & 252645135;
      l ^= i;
      a ^= i << 4;
      i = (a >>> 16 ^ l) & 65535;
      l ^= i;
      a ^= i << 16;
      i = (l >>> 2 ^ a) & 858993459;
      a ^= i;
      l ^= i << 2;
      i = (l >>> 8 ^ a) & 16711935;
      a ^= i;
      l ^= i << 8;
      i = (a >>> 1 ^ l) & 1431655765;
      l ^= i;
      a ^= i << 1;
      a = a << 1 | a >>> 31;
      l = l << 1 | l >>> 31;
      for (var c = 0; c < o; c += 3) {
        var u = s[c + 1];
        var d = s[c + 2];
        for (var p = s[c]; p != u; p += d) {
          var m = l ^ e[p];
          var f = (l >>> 4 | l << 28) ^ e[p + 1];
          i = a;
          a = l;
          l = i ^ (rip[m >>> 24 & 63] | sip[m >>> 16 & 63] | aip[m >>> 8 & 63] | cip[m & 63] | nip[f >>> 24 & 63] | oip[f >>> 16 & 63] | iip[f >>> 8 & 63] | lip[f & 63]);
        }
        i = a;
        a = l;
        l = i;
      }
      a = a >>> 1 | a << 31;
      l = l >>> 1 | l << 31;
      i = (a >>> 1 ^ l) & 1431655765;
      l ^= i;
      a ^= i << 1;
      i = (l >>> 8 ^ a) & 16711935;
      a ^= i;
      l ^= i << 8;
      i = (l >>> 2 ^ a) & 858993459;
      a ^= i;
      l ^= i << 2;
      i = (a >>> 16 ^ l) & 65535;
      l ^= i;
      a ^= i << 16;
      i = (a >>> 4 ^ l) & 252645135;
      l ^= i;
      a ^= i << 4;
      n[0] = a;
      n[1] = l;
    }
    function YFn(e) {
      e = e || {};
      var t = (e.mode || "CBC").toUpperCase();
      var n = "DES-" + t;
      var r;
      if (e.decrypt) {
        r = fx.cipher.createDecipher(n, e.key);
      } else {
        r = fx.cipher.createCipher(n, e.key);
      }
      var o = r.start;
      r.start = function (s, i) {
        var a = null;
        if (i instanceof fx.util.ByteBuffer) {
          a = i;
          i = {};
        }
        i = i || {};
        i.output = a;
        i.iv = s;
        o.call(r, i);
      };
      return r;
    }
  });
  var JFn = __commonJS((uIy, rna) => {
    var wq = wf();
    Mut();
    Hue();
    g_();
    var dip = wq.pkcs5 = wq.pkcs5 || {};
    var LSe;
    if (wq.util.isNodejs && !wq.options.usePureJavaScript) {
      LSe = require("crypto");
    }
    rna.exports = wq.pbkdf2 = dip.pbkdf2 = function (e, t, n, r, o, s) {
      if (typeof o === "function") {
        s = o;
        o = null;
      }
      if (wq.util.isNodejs && !wq.options.usePureJavaScript && LSe.pbkdf2 && (o === null || typeof o !== "object") && (LSe.pbkdf2Sync.length > 4 || !o || o === "sha1")) {
        if (typeof o !== "string") {
          o = "sha1";
        }
        if (e = Buffer.from(e, "binary"), t = Buffer.from(t, "binary"), !s) {
          if (LSe.pbkdf2Sync.length === 4) {
            return LSe.pbkdf2Sync(e, t, n, r).toString("binary");
          }
          return LSe.pbkdf2Sync(e, t, n, r, o).toString("binary");
        }
        if (LSe.pbkdf2Sync.length === 4) {
          return LSe.pbkdf2(e, t, n, r, function (b, S) {
            if (b) {
              return s(b);
            }
            s(null, S.toString("binary"));
          });
        }
        return LSe.pbkdf2(e, t, n, r, o, function (b, S) {
          if (b) {
            return s(b);
          }
          s(null, S.toString("binary"));
        });
      }
      if (typeof o > "u" || o === null) {
        o = "sha1";
      }
      if (typeof o === "string") {
        if (!(o in wq.md.algorithms)) {
          throw Error("Unknown hash algorithm: " + o);
        }
        o = wq.md[o].create();
      }
      var i = o.digestLength;
      if (r > 4294967295 * i) {
        var a = Error("Derived key is too long.");
        if (s) {
          return s(a);
        }
        throw a;
      }
      var l = Math.ceil(r / i);
      var c = r - (l - 1) * i;
      var u = wq.hmac.create();
      u.start(o, e);
      var d = "";
      var p;
      var m;
      var f;
      if (!s) {
        for (var h = 1; h <= l; ++h) {
          u.start(null, null);
          u.update(t);
          u.update(wq.util.int32ToBytes(h));
          p = f = u.digest().getBytes();
          for (var g = 2; g <= n; ++g) {
            u.start(null, null);
            u.update(f);
            m = u.digest().getBytes();
            p = wq.util.xorBytes(p, m, i);
            f = m;
          }
          d += h < l ? p : p.substr(0, c);
        }
        return d;
      }
      var h = 1;
      var g;
      function y() {
        if (h > l) {
          return s(null, d);
        }
        u.start(null, null);
        u.update(t);
        u.update(wq.util.int32ToBytes(h));
        p = f = u.digest().getBytes();
        g = 2;
        _();
      }
      function _() {
        if (g <= n) {
          u.start(null, null);
          u.update(f);
          m = u.digest().getBytes();
          p = wq.util.xorBytes(p, m, i);
          f = m;
          ++g;
          return wq.util.setImmediate(_);
        }
        d += h < l ? p : p.substr(0, c);
        ++h;
        y();
      }
      y();
    };
  });