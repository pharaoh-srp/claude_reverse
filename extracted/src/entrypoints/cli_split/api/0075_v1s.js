  var v1s = __commonJS(Uye => {
    Object.defineProperty(Uye, "__esModule", {
      value: true
    });
    Uye.createBufferedReadable = undefined;
    Uye.createBufferedReadableStream = S1s;
    Uye.merge = T1s;
    Uye.flush = S_n;
    Uye.sizeOf = trt;
    Uye.modeOf = E1s;
    var s6u = cFr();
    function S1s(e, t, n) {
      let r = e.getReader();
      let o = false;
      let s = 0;
      let i = ["", new s6u.ByteArrayCollector(c => new Uint8Array(c))];
      let a = -1;
      let l = async c => {
        let {
          value: u,
          done: d
        } = await r.read();
        let p = u;
        if (d) {
          if (a !== -1) {
            let m = S_n(i, a);
            if (trt(m) > 0) {
              c.enqueue(m);
            }
          }
          c.close();
        } else {
          let m = E1s(p, false);
          if (a !== m) {
            if (a >= 0) {
              c.enqueue(S_n(i, a));
            }
            a = m;
          }
          if (a === -1) {
            c.enqueue(p);
            return;
          }
          let f = trt(p);
          s += f;
          let h = trt(i[a]);
          if (f >= t && h === 0) {
            c.enqueue(p);
          } else {
            let g = T1s(i, a, p);
            if (!o && s > t * 2) {
              o = true;
              n?.warn(`@smithy/util-stream - stream chunk size ${f} is below threshold of ${t}, automatically buffering.`);
            }
            if (g >= t) {
              c.enqueue(S_n(i, a));
            } else {
              await l(c);
            }
          }
        }
      };
      return new ReadableStream({
        pull: l
      });
    }
    Uye.createBufferedReadable = S1s;
    function T1s(e, t, n) {
      switch (t) {
        case 0:
          e[0] += n;
          return trt(e[0]);
        case 1:
        case 2:
          e[t].push(n);
          return trt(e[t]);
      }
    }
    function S_n(e, t) {
      switch (t) {
        case 0:
          let n = e[0];
          e[0] = "";
          return n;
        case 1:
        case 2:
          return e[t].flush();
      }
      throw Error(`@smithy/util-stream - invalid index ${t} given to flush()`);
    }
    function trt(e) {
      return e?.byteLength ?? e?.length ?? 0;
    }
    function E1s(e, t = true) {
      if (t && typeof Buffer < "u" && e instanceof Buffer) {
        return 2;
      }
      if (e instanceof Uint8Array) {
        return 1;
      }
      if (typeof e === "string") {
        return 0;
      }
      return -1;
    }
  });
  var C1s = __commonJS(uFr => {
    Object.defineProperty(uFr, "__esModule", {
      value: true
    });
    uFr.createBufferedReadable = l6u;
    var i6u = require("stream");
    var w1s = cFr();
    var Bye = v1s();
    var a6u = tAe();
    function l6u(e, t, n) {
      if ((0, a6u.isReadableStream)(e)) {
        return (0, Bye.createBufferedReadableStream)(e, t, n);
      }
      let r = new i6u.Readable({
        read() {}
      });
      let o = false;
      let s = 0;
      let i = ["", new w1s.ByteArrayCollector(l => new Uint8Array(l)), new w1s.ByteArrayCollector(l => Buffer.from(new Uint8Array(l)))];
      let a = -1;
      e.on("data", l => {
        let c = (0, Bye.modeOf)(l, true);
        if (a !== c) {
          if (a >= 0) {
            r.push((0, Bye.flush)(i, a));
          }
          a = c;
        }
        if (a === -1) {
          r.push(l);
          return;
        }
        let u = (0, Bye.sizeOf)(l);
        s += u;
        let d = (0, Bye.sizeOf)(i[a]);
        if (u >= t && d === 0) {
          r.push(l);
        } else {
          let p = (0, Bye.merge)(i, a, l);
          if (!o && s > t * 2) {
            o = true;
            n?.warn(`@smithy/util-stream - stream chunk size ${u} is below threshold of ${t}, automatically buffering.`);
          }
          if (p >= t) {
            r.push((0, Bye.flush)(i, a));
          }
        }
      });
      e.on("end", () => {
        if (a !== -1) {
          let l = (0, Bye.flush)(i, a);
          if ((0, Bye.sizeOf)(l) > 0) {
            r.push(l);
          }
        }
        r.push(null);
      });
      return r;
    }
  });