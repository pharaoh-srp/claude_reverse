  var jT = __commonJS(f_n => {
    var c1s = l1s();
    var u1s = e => {
      let t = c1s.fromString(e, "utf8");
      return new Uint8Array(t.buffer, t.byteOffset, t.byteLength / Uint8Array.BYTES_PER_ELEMENT);
    };
    var H5u = e => {
      if (typeof e === "string") {
        return u1s(e);
      }
      if (ArrayBuffer.isView(e)) {
        return new Uint8Array(e.buffer, e.byteOffset, e.byteLength / Uint8Array.BYTES_PER_ELEMENT);
      }
      return new Uint8Array(e);
    };
    var j5u = e => {
      if (typeof e === "string") {
        return e;
      }
      if (typeof e !== "object" || typeof e.byteOffset !== "number" || typeof e.byteLength !== "number") {
        throw Error("@smithy/util-utf8: toUtf8 encoder function only accepts string | Uint8Array.");
      }
      return c1s.fromArrayBuffer(e.buffer, e.byteOffset, e.byteLength).toString("utf8");
    };
    f_n.fromUtf8 = u1s;
    f_n.toUint8Array = H5u;
    f_n.toUtf8 = j5u;
  });
  var d1s = __commonJS(h_n => {
    Object.defineProperty(h_n, "__esModule", {
      value: true
    });
    h_n.toBase64 = undefined;
    var q5u = p_n();
    var W5u = jT();
    var G5u = e => {
      let t;
      if (typeof e === "string") {
        t = (0, W5u.fromUtf8)(e);
      } else {
        t = e;
      }
      if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
        throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
      }
      return (0, q5u.fromArrayBuffer)(t.buffer, t.byteOffset, t.byteLength).toString("base64");
    };
    h_n.toBase64 = G5u;
  });