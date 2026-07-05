  var I2s = __commonJS(Cbn => {
    Object.defineProperty(Cbn, "__esModule", {
      value: true
    });
    Cbn.toBase64 = undefined;
    var rYu = QUr();
    var oYu = jT();
    var sYu = e => {
      let t;
      if (typeof e === "string") {
        t = (0, oYu.fromUtf8)(e);
      } else {
        t = e;
      }
      if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
        throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
      }
      return (0, rYu.fromArrayBuffer)(t.buffer, t.byteOffset, t.byteLength).toString("base64");
    };
    Cbn.toBase64 = sYu;
  });