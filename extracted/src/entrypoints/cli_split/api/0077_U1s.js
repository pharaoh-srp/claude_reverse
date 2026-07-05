  var U1s = __commonJS(C_n => {
    Object.defineProperty(C_n, "__esModule", {
      value: true
    });
    C_n.toBase64 = undefined;
    var D6u = fFr();
    var M6u = jT();
    var N6u = e => {
      let t;
      if (typeof e === "string") {
        t = (0, M6u.fromUtf8)(e);
      } else {
        t = e;
      }
      if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
        throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
      }
      return (0, D6u.fromArrayBuffer)(t.buffer, t.byteOffset, t.byteLength).toString("base64");
    };
    C_n.toBase64 = N6u;
  });