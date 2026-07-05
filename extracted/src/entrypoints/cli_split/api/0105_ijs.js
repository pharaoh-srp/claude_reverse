  var ijs = __commonJS(Vbn => {
    Object.defineProperty(Vbn, "__esModule", {
      value: true
    });
    Vbn.toBase64 = undefined;
    var AQu = n2r();
    var IQu = jT();
    var PQu = e => {
      let t;
      if (typeof e === "string") {
        t = (0, IQu.fromUtf8)(e);
      } else {
        t = e;
      }
      if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
        throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
      }
      return (0, AQu.fromArrayBuffer)(t.buffer, t.byteOffset, t.byteLength).toString("base64");
    };
    Vbn.toBase64 = PQu;
  });