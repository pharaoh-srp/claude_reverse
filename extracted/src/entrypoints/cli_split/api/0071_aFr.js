  var aFr = __commonJS(g_n => {
    Object.defineProperty(g_n, "__esModule", {
      value: true
    });
    g_n.ChecksumStream = undefined;
    var V5u = fNt();
    var z5u = require("stream");
    class f1s extends z5u.Duplex {
      expectedChecksum;
      checksumSourceLocation;
      checksum;
      source;
      base64Encoder;
      constructor({
        expectedChecksum: e,
        checksum: t,
        source: n,
        checksumSourceLocation: r,
        base64Encoder: o
      }) {
        super();
        if (typeof n.pipe === "function") {
          this.source = n;
        } else {
          throw Error(`@smithy/util-stream: unsupported source type ${n?.constructor?.name ?? n} in ChecksumStream.`);
        }
        this.base64Encoder = o ?? V5u.toBase64;
        this.expectedChecksum = e;
        this.checksum = t;
        this.checksumSourceLocation = r;
        this.source.pipe(this);
      }
      _read(e) {}
      _write(e, t, n) {
        try {
          this.checksum.update(e);
          this.push(e);
        } catch (r) {
          return n(r);
        }
        return n();
      }
      async _final(e) {
        try {
          let t = await this.checksum.digest();
          let n = this.base64Encoder(t);
          if (this.expectedChecksum !== n) {
            return e(Error(`Checksum mismatch: expected "${this.expectedChecksum}" but received "${n}" in response header "${this.checksumSourceLocation}".`));
          }
        } catch (t) {
          return e(t);
        }
        this.push(null);
        return e();
      }
    }
    g_n.ChecksumStream = f1s;
  });