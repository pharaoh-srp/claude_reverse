  var o1s = __commonJS(r1s => {
    var I5u = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    r1s.isArrayBuffer = I5u;
  });
  var p_n = __commonJS(oFr => {
    var P5u = o1s();
    var rFr = require("buffer");
    var O5u = (e, t = 0, n = e.byteLength - t) => {
      if (!P5u.isArrayBuffer(e)) {
        throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
      }
      return rFr.Buffer.from(e, t, n);
    };
    var D5u = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
      }
      return t ? rFr.Buffer.from(e, t) : rFr.Buffer.from(e);
    };
    oFr.fromArrayBuffer = O5u;
    oFr.fromString = D5u;
  });
  var s1s = __commonJS(m_n => {
    Object.defineProperty(m_n, "__esModule", {
      value: true
    });
    m_n.fromBase64 = undefined;
    var M5u = p_n();
    var L5u = e => {
      if (e.length * 3 % 4 !== 0) {
        throw TypeError("Incorrect padding on base64 string.");
      }
      if (!(/^[A-Za-z0-9+/]*={0,2}$/).exec(e)) {
        throw TypeError("Invalid base64 string.");
      }
      let t = (0, M5u.fromString)(e, "base64");
      return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
    };
    m_n.fromBase64 = L5u;
  });
  var a1s = __commonJS(i1s => {
    var F5u = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    i1s.isArrayBuffer = F5u;
  });
  var l1s = __commonJS(iFr => {
    var U5u = a1s();
    var sFr = require("buffer");
    var B5u = (e, t = 0, n = e.byteLength - t) => {
      if (!U5u.isArrayBuffer(e)) {
        throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
      }
      return sFr.Buffer.from(e, t, n);
    };
    var $5u = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
      }
      return t ? sFr.Buffer.from(e, t) : sFr.Buffer.from(e);
    };
    iFr.fromArrayBuffer = B5u;
    iFr.fromString = $5u;
  });