  var ojs = __commonJS(rjs => {
    var EQu = e => typeof ArrayBuffer === "function" && e instanceof ArrayBuffer || Object.prototype.toString.call(e) === "[object ArrayBuffer]";
    rjs.isArrayBuffer = EQu;
  });
  var n2r = __commonJS(t2r => {
    var vQu = ojs();
    var e2r = require("buffer");
    var wQu = (e, t = 0, n = e.byteLength - t) => {
      if (!vQu.isArrayBuffer(e)) {
        throw TypeError(`The "input" argument must be ArrayBuffer. Received type ${typeof e} (${e})`);
      }
      return e2r.Buffer.from(e, t, n);
    };
    var CQu = (e, t) => {
      if (typeof e !== "string") {
        throw TypeError(`The "input" argument must be of type string. Received type ${typeof e} (${e})`);
      }
      return t ? e2r.Buffer.from(e, t) : e2r.Buffer.from(e);
    };
    t2r.fromArrayBuffer = wQu;
    t2r.fromString = CQu;
  });
  var sjs = __commonJS(Gbn => {
    Object.defineProperty(Gbn, "__esModule", {
      value: true
    });
    Gbn.fromBase64 = undefined;
    var RQu = n2r();
    var kQu = e => {
      if (e.length * 3 % 4 !== 0) {
        throw TypeError("Incorrect padding on base64 string.");
      }
      if (!(/^[A-Za-z0-9+/]*={0,2}$/).exec(e)) {
        throw TypeError("Invalid base64 string.");
      }
      let t = (0, RQu.fromString)(e, "base64");
      return new Uint8Array(t.buffer, t.byteOffset, t.byteLength);
    };
    Gbn.fromBase64 = kQu;
  });