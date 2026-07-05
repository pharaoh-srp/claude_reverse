  var y1s = __commonJS(__n => {
    Object.defineProperty(__n, "__esModule", {
      value: true
    });
    __n.createChecksumStream = undefined;
    var X5u = fNt();
    var Q5u = tAe();
    var Z5u = g1s();
    var e6u = ({
      expectedChecksum: e,
      checksum: t,
      source: n,
      checksumSourceLocation: r,
      base64Encoder: o
    }) => {
      if (!(0, Q5u.isReadableStream)(n)) {
        throw Error(`@smithy/util-stream: unsupported source type ${n?.constructor?.name ?? n} in ChecksumStream.`);
      }
      let s = o ?? X5u.toBase64;
      if (typeof TransformStream !== "function") {
        throw Error("@smithy/util-stream: unable to instantiate ChecksumStream because API unavailable: ReadableStream/TransformStream.");
      }
      let i = new TransformStream({
        start() {},
        async transform(l, c) {
          t.update(l);
          c.enqueue(l);
        },
        async flush(l) {
          let c = await t.digest();
          let u = s(c);
          if (e !== u) {
            let d = Error(`Checksum mismatch: expected "${e}" but received "${u}" in response header "${r}".`);
            l.error(d);
          } else {
            l.terminate();
          }
        }
      });
      n.pipeThrough(i);
      let a = i.readable;
      Object.setPrototypeOf(a, Z5u.ChecksumStream.prototype);
      return a;
    };
    __n.createChecksumStream = e6u;
  });