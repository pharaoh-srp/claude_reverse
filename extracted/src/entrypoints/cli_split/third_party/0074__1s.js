  var _1s = __commonJS(lFr => {
    Object.defineProperty(lFr, "__esModule", {
      value: true
    });
    lFr.createChecksumStream = o6u;
    var t6u = tAe();
    var n6u = aFr();
    var r6u = y1s();
    function o6u(e) {
      if (typeof ReadableStream === "function" && (0, t6u.isReadableStream)(e.source)) {
        return (0, r6u.createChecksumStream)(e);
      }
      return new n6u.ChecksumStream(e);
    }
  });
  var cFr = __commonJS(b_n => {
    Object.defineProperty(b_n, "__esModule", {
      value: true
    });
    b_n.ByteArrayCollector = undefined;
    class b1s {
      allocByteArray;
      byteLength = 0;
      byteArrays = [];
      constructor(e) {
        this.allocByteArray = e;
      }
      push(e) {
        this.byteArrays.push(e);
        this.byteLength += e.byteLength;
      }
      flush() {
        if (this.byteArrays.length === 1) {
          let n = this.byteArrays[0];
          this.reset();
          return n;
        }
        let e = this.allocByteArray(this.byteLength);
        let t = 0;
        for (let n = 0; n < this.byteArrays.length; ++n) {
          let r = this.byteArrays[n];
          e.set(r, t);
          t += r.byteLength;
        }
        this.reset();
        return e;
      }
      reset() {
        this.byteArrays = [];
        this.byteLength = 0;
      }
    }
    b_n.ByteArrayCollector = b1s;
  });