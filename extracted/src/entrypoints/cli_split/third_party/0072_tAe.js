  var tAe = __commonJS(ert => {
    Object.defineProperty(ert, "__esModule", {
      value: true
    });
    ert.isBlob = ert.isReadableStream = undefined;
    var K5u = e => typeof ReadableStream === "function" && (e?.constructor?.name === ReadableStream.name || e instanceof ReadableStream);
    ert.isReadableStream = K5u;
    var Y5u = e => typeof Blob === "function" && (e?.constructor?.name === Blob.name || e instanceof Blob);
    ert.isBlob = Y5u;
  });
  var g1s = __commonJS(y_n => {
    Object.defineProperty(y_n, "__esModule", {
      value: true
    });
    y_n.ChecksumStream = undefined;
    var J5u = typeof ReadableStream === "function" ? ReadableStream : function () {};
    class h1s extends J5u {}
    y_n.ChecksumStream = h1s;
  });