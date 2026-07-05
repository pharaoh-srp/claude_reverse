  var lFs = __commonJS(W_n => {
    Object.defineProperty(W_n, "__esModule", {
      value: true
    });
    W_n.toBase64 = undefined;
    var kVu = HFr();
    var AVu = jT();
    var IVu = e => {
      let t;
      if (typeof e === "string") {
        t = (0, AVu.fromUtf8)(e);
      } else {
        t = e;
      }
      if (typeof t !== "object" || typeof t.byteOffset !== "number" || typeof t.byteLength !== "number") {
        throw Error("@smithy/util-base64: toBase64 encoder function only accepts string | Uint8Array.");
      }
      return (0, kVu.fromArrayBuffer)(t.buffer, t.byteOffset, t.byteLength).toString("base64");
    };
    W_n.toBase64 = IVu;
  });