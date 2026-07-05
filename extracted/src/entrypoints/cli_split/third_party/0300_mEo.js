  var mEo = __commonJS(HGn => {
    Object.defineProperty(HGn, "__esModule", {
      value: true
    });
    HGn.Semaphore = undefined;
    var s4p = bNe();
    class H4a {
      constructor(e = 1) {
        if (e <= 0) {
          throw Error("Capacity must be greater than 0");
        }
        this._capacity = e;
        this._active = 0;
        this._waiting = [];
      }
      lock(e) {
        return new Promise((t, n) => {
          this._waiting.push({
            thunk: e,
            resolve: t,
            reject: n
          });
          this.runNext();
        });
      }
      get active() {
        return this._active;
      }
      runNext() {
        if (this._waiting.length === 0 || this._active === this._capacity) {
          return;
        }
        (0, s4p.default)().timer.setImmediate(() => this.doRunNext());
      }
      doRunNext() {
        if (this._waiting.length === 0 || this._active === this._capacity) {
          return;
        }
        let e = this._waiting.shift();
        if (this._active++, this._active > this._capacity) {
          throw Error("To many thunks active");
        }
        try {
          let t = e.thunk();
          if (t instanceof Promise) {
            t.then(n => {
              this._active--;
              e.resolve(n);
              this.runNext();
            }, n => {
              this._active--;
              e.reject(n);
              this.runNext();
            });
          } else {
            this._active--;
            e.resolve(t);
            this.runNext();
          }
        } catch (t) {
          this._active--;
          e.reject(t);
          this.runNext();
        }
      }
    }
    HGn.Semaphore = H4a;
  });
  var W4a = __commonJS(SNe => {
    Object.defineProperty(SNe, "__esModule", {
      value: true
    });
    SNe.ReadableStreamMessageReader = SNe.AbstractMessageReader = SNe.MessageReader = undefined;
    var hEo = bNe();
    var wht = bht();
    var fEo = Tht();
    var i4p = mEo();
    var j4a;
    (function (e) {
      function t(n) {
        let r = n;
        return r && wht.func(r.listen) && wht.func(r.dispose) && wht.func(r.onError) && wht.func(r.onClose) && wht.func(r.onPartialMessage);
      }
      e.is = t;
    })(j4a || (SNe.MessageReader = j4a = {}));
    class yEo {
      constructor() {
        this.errorEmitter = new fEo.Emitter();
        this.closeEmitter = new fEo.Emitter();
        this.partialMessageEmitter = new fEo.Emitter();
      }
      dispose() {
        this.errorEmitter.dispose();
        this.closeEmitter.dispose();
      }
      get onError() {
        return this.errorEmitter.event;
      }
      fireError(e) {
        this.errorEmitter.fire(this.asError(e));
      }
      get onClose() {
        return this.closeEmitter.event;
      }
      fireClose() {
        this.closeEmitter.fire(undefined);
      }
      get onPartialMessage() {
        return this.partialMessageEmitter.event;
      }
      firePartialMessage(e) {
        this.partialMessageEmitter.fire(e);
      }
      asError(e) {
        if (e instanceof Error) {
          return e;
        } else {
          return Error(`Reader received error. Reason: ${wht.string(e.message) ? e.message : "unknown"}`);
        }
      }
    }
    SNe.AbstractMessageReader = yEo;
    var gEo;
    (function (e) {
      function t(n) {
        let r;
        let o;
        let s;
        let i = new Map();
        let a;
        let l = new Map();
        if (n === undefined || typeof n === "string") {
          r = n ?? "utf-8";
        } else {
          if (r = n.charset ?? "utf-8", n.contentDecoder !== undefined) {
            s = n.contentDecoder;
            i.set(s.name, s);
          }
          if (n.contentDecoders !== undefined) {
            for (let c of n.contentDecoders) {
              i.set(c.name, c);
            }
          }
          if (n.contentTypeDecoder !== undefined) {
            a = n.contentTypeDecoder;
            l.set(a.name, a);
          }
          if (n.contentTypeDecoders !== undefined) {
            for (let c of n.contentTypeDecoders) {
              l.set(c.name, c);
            }
          }
        }
        if (a === undefined) {
          a = (0, hEo.default)().applicationJson.decoder;
          l.set(a.name, a);
        }
        return {
          charset: r,
          contentDecoder: s,
          contentDecoders: i,
          contentTypeDecoder: a,
          contentTypeDecoders: l
        };
      }
      e.fromOptions = t;
    })(gEo || (gEo = {}));
    class q4a extends yEo {
      constructor(e, t) {
        super();
        this.readable = e;
        this.options = gEo.fromOptions(t);
        this.buffer = (0, hEo.default)().messageBuffer.create(this.options.charset);
        this._partialMessageTimeout = 1e4;
        this.nextMessageLength = -1;
        this.messageToken = 0;
        this.readSemaphore = new i4p.Semaphore(1);
      }
      set partialMessageTimeout(e) {
        this._partialMessageTimeout = e;
      }
      get partialMessageTimeout() {
        return this._partialMessageTimeout;
      }
      listen(e) {
        this.nextMessageLength = -1;
        this.messageToken = 0;
        this.partialMessageTimer = undefined;
        this.callback = e;
        let t = this.readable.onData(n => {
          this.onData(n);
        });
        this.readable.onError(n => this.fireError(n));
        this.readable.onClose(() => this.fireClose());
        return t;
      }
      onData(e) {
        try {
          this.buffer.append(e);
          while (true) {
            if (this.nextMessageLength === -1) {
              let n = this.buffer.tryReadHeaders(true);
              if (!n) {
                return;
              }
              let r = n.get("content-length");
              if (!r) {
                this.fireError(Error(`Header must provide a Content-Length property.
${JSON.stringify(Object.fromEntries(n))}`));
                return;
              }
              let o = parseInt(r);
              if (isNaN(o)) {
                this.fireError(Error(`Content-Length value must be a number. Got ${r}`));
                return;
              }
              this.nextMessageLength = o;
            }
            let t = this.buffer.tryReadBody(this.nextMessageLength);
            if (t === undefined) {
              this.setPartialMessageTimer();
              return;
            }
            this.clearPartialMessageTimer();
            this.nextMessageLength = -1;
            this.readSemaphore.lock(async () => {
              let n = this.options.contentDecoder !== undefined ? await this.options.contentDecoder.oC(t) : t;
              let r = await this.options.contentTypeDecoder.oC(n, this.options);
              this.callback(r);
            }).catch(n => {
              this.fireError(n);
            });
          }
        } catch (t) {
          this.fireError(t);
        }
      }
      clearPartialMessageTimer() {
        if (this.partialMessageTimer) {
          this.partialMessageTimer.dispose();
          this.partialMessageTimer = undefined;
        }
      }
      setPartialMessageTimer() {
        if (this.clearPartialMessageTimer(), this._partialMessageTimeout <= 0) {
          return;
        }
        this.partialMessageTimer = (0, hEo.default)().timer.setTimeout((e, t) => {
          if (this.partialMessageTimer = undefined, e === this.messageToken) {
            this.firePartialMessage({
              messageToken: e,
              waitingTime: t
            });
            this.setPartialMessageTimer();
          }
        }, this._partialMessageTimeout, this.messageToken, this._partialMessageTimeout);
      }
    }
    SNe.ReadableStreamMessageReader = q4a;
  });
  var J4a = __commonJS(TNe => {
    Object.defineProperty(TNe, "__esModule", {
      value: true
    });
    TNe.WriteableStreamMessageWriter = TNe.AbstractMessageWriter = TNe.MessageWriter = undefined;
    var G4a = bNe();
    var G5t = bht();
    var a4p = mEo();
    var V4a = Tht();
    var z4a = `\r
`;
    var K4a;
    (function (e) {
      function t(n) {
        let r = n;
        return r && G5t.func(r.dispose) && G5t.func(r.onClose) && G5t.func(r.onError) && G5t.func(r.write);
      }
      e.is = t;
    })(K4a || (TNe.MessageWriter = K4a = {}));
    class bEo {
      constructor() {
        this.errorEmitter = new V4a.Emitter();
        this.closeEmitter = new V4a.Emitter();
      }
      dispose() {
        this.errorEmitter.dispose();
        this.closeEmitter.dispose();
      }
      get onError() {
        return this.errorEmitter.event;
      }
      fireError(e, t, n) {
        this.errorEmitter.fire([this.asError(e), t, n]);
      }
      get onClose() {
        return this.closeEmitter.event;
      }
      fireClose() {
        this.closeEmitter.fire(undefined);
      }
      asError(e) {
        if (e instanceof Error) {
          return e;
        } else {
          return Error(`Writer received error. Reason: ${G5t.string(e.message) ? e.message : "unknown"}`);
        }
      }
    }
    TNe.AbstractMessageWriter = bEo;
    var _Eo;
    (function (e) {
      function t(n) {
        if (n === undefined || typeof n === "string") {
          return {
            charset: n ?? "utf-8",
            contentTypeEncoder: (0, G4a.default)().applicationJson.encoder
          };
        } else {
          return {
            charset: n.charset ?? "utf-8",
            contentEncoder: n.contentEncoder,
            contentTypeEncoder: n.contentTypeEncoder ?? (0, G4a.default)().applicationJson.encoder
          };
        }
      }
      e.fromOptions = t;
    })(_Eo || (_Eo = {}));
    class Y4a extends bEo {
      constructor(e, t) {
        super();
        this.writable = e;
        this.options = _Eo.fromOptions(t);
        this.errorCount = 0;
        this.writeSemaphore = new a4p.Semaphore(1);
        this.writable.onError(n => this.fireError(n));
        this.writable.onClose(() => this.fireClose());
      }
      async write(e) {
        return this.writeSemaphore.lock(async () => this.options.contentTypeEncoder.HS(e, this.options).then(n => {
          if (this.options.contentEncoder !== undefined) {
            return this.options.contentEncoder.HS(n);
          } else {
            return n;
          }
        }).then(n => {
          let r = [];
          r.push("Content-Length: ", n.byteLength.toString(), z4a);
          r.push(z4a);
          return this.doWrite(e, r, n);
        }, n => {
          throw this.fireError(n), n;
        }));
      }
      async doWrite(e, t, n) {
        try {
          await this.writable.write(t.join(""), "ascii");
          return this.writable.write(n);
        } catch (r) {
          this.handleError(r, e);
          return Promise.reject(r);
        }
      }
      handleError(e, t) {
        this.errorCount++;
        this.fireError(e, t, this.errorCount);
      }
      end() {
        this.writable.end();
      }
    }
    TNe.WriteableStreamMessageWriter = Y4a;
  });
  var Q4a = __commonJS(jGn => {
    Object.defineProperty(jGn, "__esModule", {
      value: true
    });
    jGn.AbstractMessageBuffer = undefined;
    var d4p = `\r
`;
    class X4a {
      constructor(e = "utf-8") {
        this._encoding = e;
        this._chunks = [];
        this._totalLength = 0;
      }
      get encoding() {
        return this._encoding;
      }
      append(e) {
        let t = typeof e === "string" ? this.fromString(e, this._encoding) : e;
        this._chunks.push(t);
        this._totalLength += t.byteLength;
      }
      tryReadHeaders(e = false) {
        if (this._chunks.length === 0) {
          return;
        }
        let t = 0;
        let n = 0;
        let r = 0;
        let o = 0;
        e: while (n < this._chunks.length) {
          let l = this._chunks[n];
          r = 0;
          t: while (r < l.length) {
            switch (l[r]) {
              case 13:
                switch (t) {
                  case 0:
                    t = 1;
                    break;
                  case 2:
                    t = 3;
                    break;
                  default:
                    t = 0;
                }
                break;
              case 10:
                switch (t) {
                  case 1:
                    t = 2;
                    break;
                  case 3:
                    t = 4;
                    r++;
                    break e;
                  default:
                    t = 0;
                }
                break;
              default:
                t = 0;
            }
            r++;
          }
          o += l.byteLength;
          n++;
        }
        if (t !== 4) {
          return;
        }
        let s = this._read(o + r);
        let i = new Map();
        let a = this.toString(s, "ascii").split(d4p);
        if (a.length < 2) {
          return i;
        }
        for (let l = 0; l < a.length - 2; l++) {
          let c = a[l];
          let u = c.indexOf(":");
          if (u === -1) {
            throw Error(`Message header must separate key and value using ':'
${c}`);
          }
          let d = c.substr(0, u);
          let p = c.substr(u + 1).trim();
          i.set(e ? d.toLowerCase() : d, p);
        }
        return i;
      }
      tryReadBody(e) {
        if (this._totalLength < e) {
          return;
        }
        return this._read(e);
      }
      get numberOfBytes() {
        return this._totalLength;
      }
      _read(e) {
        if (e === 0) {
          return this.emptyBuffer();
        }
        if (e > this._totalLength) {
          throw Error("Cannot read so many bytes!");
        }
        if (this._chunks[0].byteLength === e) {
          let o = this._chunks[0];
          this._chunks.shift();
          this._totalLength -= e;
          return this.asNative(o);
        }
        if (this._chunks[0].byteLength > e) {
          let o = this._chunks[0];
          let s = this.asNative(o, e);
          this._chunks[0] = o.slice(e);
          this._totalLength -= e;
          return s;
        }
        let t = this.allocNative(e);
        let n = 0;
        let r = 0;
        while (e > 0) {
          let o = this._chunks[r];
          if (o.byteLength > e) {
            let s = o.slice(0, e);
            t.set(s, n);
            n += e;
            this._chunks[r] = o.slice(e);
            this._totalLength -= e;
            e -= e;
          } else {
            t.set(o, n);
            n += o.byteLength;
            this._chunks.shift();
            this._totalLength -= o.byteLength;
            e -= o.byteLength;
          }
        }
        return t;
      }
    }
    jGn.AbstractMessageBuffer = X4a;
  });
  var oWa = __commonJS(Am => {
    Object.defineProperty(Am, "__esModule", {
      value: true
    });
    Am.createMessageConnection = Am.ConnectionOptions = Am.MessageStrategy = Am.CancellationStrategy = Am.CancellationSenderStrategy = Am.CancellationReceiverStrategy = Am.RequestCancellationReceiverStrategy = Am.IdCancellationReceiverStrategy = Am.ConnectionStrategy = Am.ConnectionError = Am.ConnectionErrors = Am.LogTraceNotification = Am.SetTraceNotification = Am.TraceFormat = Am.TraceValues = Am.Trace = Am.NullLogger = Am.ProgressType = Am.ProgressToken = undefined;
    var Z4a = bNe();
    var oA = bht();
    var ap = sEo();
    var eWa = aEo();
    var V5t = Tht();
    var SEo = $Gn();
    var Y5t;
    (function (e) {
      e.type = new ap.NotificationType("$/cancelRequest");
    })(Y5t || (Y5t = {}));
    var TEo;
    (function (e) {
      function t(n) {
        return typeof n === "string" || typeof n === "number";
      }
      e.is = t;
    })(TEo || (Am.ProgressToken = TEo = {}));
    var z5t;
    (function (e) {
      e.type = new ap.NotificationType("$/progress");
    })(z5t || (z5t = {}));
    class rWa {
      constructor() {}
    }
    Am.ProgressType = rWa;
    var EEo;
    (function (e) {
      function t(n) {
        return oA.func(n);
      }
      e.is = t;
    })(EEo || (EEo = {}));
    Am.NullLogger = Object.freeze({
      error: () => {},
      warn: () => {},
      info: () => {},
      log: () => {}
    });
    var Fb;
    (function (e) {
      e[e.Off = 0] = "Off";
      e[e.Messages = 1] = "Messages";
      e[e.Compact = 2] = "Compact";
      e[e.Verbose = 3] = "Verbose";
    })(Fb || (Am.Trace = Fb = {}));
    var tWa;
    (function (e) {
      e.Off = "off";
      e.Messages = "messages";
      e.Compact = "compact";
      e.Verbose = "verbose";
    })(tWa || (Am.TraceValues = tWa = {}));
    (function (e) {
      function t(r) {
        if (!oA.string(r)) {
          return e.Off;
        }
        switch (r = r.toLowerCase(), r) {
          case "off":
            return e.Off;
          case "messages":
            return e.Messages;
          case "compact":
            return e.Compact;
          case "verbose":
            return e.Verbose;
          default:
            return e.Off;
        }
      }
      e.fromString = t;
      function n(r) {
        switch (r) {
          case e.Off:
            return "off";
          case e.Messages:
            return "messages";
          case e.Compact:
            return "compact";
          case e.Verbose:
            return "verbose";
          default:
            return "off";
        }
      }
      e.toString = n;
    })(Fb || (Am.Trace = Fb = {}));
    var nz;
    (function (e) {
      e.Text = "text";
      e.JSON = "json";
    })(nz || (Am.TraceFormat = nz = {}));
    (function (e) {
      function t(n) {
        if (!oA.string(n)) {
          return e.Text;
        }
        if (n = n.toLowerCase(), n === "json") {
          return e.JSON;
        } else {
          return e.Text;
        }
      }
      e.fromString = t;
    })(nz || (Am.TraceFormat = nz = {}));
    var vEo;
    (function (e) {
      e.type = new ap.NotificationType("$/setTrace");
    })(vEo || (Am.SetTraceNotification = vEo = {}));
    var qGn;
    (function (e) {
      e.type = new ap.NotificationType("$/logTrace");
    })(qGn || (Am.LogTraceNotification = qGn = {}));
    var K5t;
    (function (e) {
      e[e.Closed = 1] = "Closed";
      e[e.Disposed = 2] = "Disposed";
      e[e.AlreadyListening = 3] = "AlreadyListening";
    })(K5t || (Am.ConnectionErrors = K5t = {}));
    class Cht extends Error {
      constructor(e, t) {
        super(t);
        this.code = e;
        Object.setPrototypeOf(this, Cht.prototype);
      }
    }
    Am.ConnectionError = Cht;
    var wEo;
    (function (e) {
      function t(n) {
        let r = n;
        return r && oA.func(r.cancelUndispatched);
      }
      e.is = t;
    })(wEo || (Am.ConnectionStrategy = wEo = {}));
    var WGn;
    (function (e) {
      function t(n) {
        let r = n;
        return r && (r.kind === undefined || r.kind === "id") && oA.func(r.createCancellationTokenSource) && (r.dispose === undefined || oA.func(r.dispose));
      }
      e.is = t;
    })(WGn || (Am.IdCancellationReceiverStrategy = WGn = {}));
    var CEo;
    (function (e) {
      function t(n) {
        let r = n;
        return r && r.kind === "request" && oA.func(r.createCancellationTokenSource) && (r.dispose === undefined || oA.func(r.dispose));
      }
      e.is = t;
    })(CEo || (Am.RequestCancellationReceiverStrategy = CEo = {}));
    var GGn;
    (function (e) {
      e.Message = Object.freeze({
        createCancellationTokenSource(n) {
          return new SEo.CancellationTokenSource();
        }
      });
      function t(n) {
        return WGn.is(n) || CEo.is(n);
      }
      e.is = t;
    })(GGn || (Am.CancellationReceiverStrategy = GGn = {}));
    var VGn;
    (function (e) {
      e.Message = Object.freeze({
        sendCancellation(n, r) {
          return n.sendNotification(Y5t.type, {
            id: r
          });
        },
        cleanup(n) {}
      });
      function t(n) {
        let r = n;
        return r && oA.func(r.sendCancellation) && oA.func(r.cleanup);
      }
      e.is = t;
    })(VGn || (Am.CancellationSenderStrategy = VGn = {}));
    var zGn;
    (function (e) {
      e.Message = Object.freeze({
        receiver: GGn.Message,
        sender: VGn.Message
      });
      function t(n) {
        let r = n;
        return r && GGn.is(r.receiver) && VGn.is(r.sender);
      }
      e.is = t;
    })(zGn || (Am.CancellationStrategy = zGn = {}));
    var KGn;
    (function (e) {
      function t(n) {
        let r = n;
        return r && oA.func(r.handleMessage);
      }
      e.is = t;
    })(KGn || (Am.MessageStrategy = KGn = {}));
    var nWa;
    (function (e) {
      function t(n) {
        let r = n;
        return r && (zGn.is(r.cancellationStrategy) || wEo.is(r.connectionStrategy) || KGn.is(r.messageStrategy));
      }
      e.is = t;
    })(nWa || (Am.ConnectionOptions = nWa = {}));
    var Hoe;
    (function (e) {
      e[e.New = 1] = "New";
      e[e.Listening = 2] = "Listening";
      e[e.Closed = 3] = "Closed";
      e[e.Disposed = 4] = "Disposed";
    })(Hoe || (Hoe = {}));
    function p4p(e, t, n, r) {
      let o = n !== undefined ? n : Am.NullLogger;
      let s = 0;
      let i = 0;
      let a = 0;
      let l = "2.0";
      let c = undefined;
      let u = new Map();
      let d = undefined;
      let p = new Map();
      let m = new Map();
      let f;
      let h = new eWa.LinkedMap();
      let g = new Map();
      let y = new Set();
      let _ = new Map();
      let b = Fb.Off;
      let S = nz.Text;
      let E;
      let C = Hoe.New;
      let x = new V5t.Emitter();
      let A = new V5t.Emitter();
      let k = new V5t.Emitter();
      let I = new V5t.Emitter();
      let O = new V5t.Emitter();
      let M = r && r.cancellationStrategy ? r.cancellationStrategy : zGn.Message;
      function L(Be) {
        if (Be === null) {
          throw Error("Can't send requests with id null since the response can't be correlated.");
        }
        return "req-" + Be.toString();
      }
      function P(Be) {
        if (Be === null) {
          return "res-unknown-" + (++a).toString();
        } else {
          return "res-" + Be.toString();
        }
      }
      function F() {
        return "not-" + (++i).toString();
      }
      function H(Be, We) {
        if (ap.Message.isRequest(We)) {
          Be.set(L(We.id), We);
        } else if (ap.Message.isResponse(We)) {
          Be.set(P(We.id), We);
        } else {
          Be.set(F(), We);
        }
      }
      function U(Be) {
        return;
      }
      function N() {
        return C === Hoe.Listening;
      }
      function W() {
        return C === Hoe.Closed;
      }
      function j() {
        return C === Hoe.Disposed;
      }
      function z() {
        if (C === Hoe.New || C === Hoe.Listening) {
          C = Hoe.Closed;
          A.fire(undefined);
        }
      }
      function V(Be) {
        x.fire([Be, undefined, undefined]);
      }
      function K(Be) {
        x.fire(Be);
      }
      e.onClose(z);
      e.onError(V);
      t.onClose(z);
      t.onError(K);
      function J() {
        if (f || h.size === 0) {
          return;
        }
        f = (0, Z4a.default)().timer.setImmediate(() => {
          f = undefined;
          Z();
        });
      }
      function Q(Be) {
        if (ap.Message.isRequest(Be)) {
          oe(Be);
        } else if (ap.Message.isNotification(Be)) {
          re(Be);
        } else if (ap.Message.isResponse(Be)) {
          ee(Be);
        } else {
          se(Be);
        }
      }
      function Z() {
        if (h.size === 0) {
          return;
        }
        let Be = h.shift();
        try {
          let We = r?.messageStrategy;
          if (KGn.is(We)) {
            We.handleMessage(Be, Q);
          } else {
            Q(Be);
          }
        } finally {
          J();
        }
      }
      let ne = Be => {
        try {
          if (ap.Message.isNotification(Be) && Be.method === Y5t.type.method) {
            let We = Be.params.id;
            let Ze = L(We);
            let Tt = h.get(Ze);
            if (ap.Message.isRequest(Tt)) {
              let Ye = r?.connectionStrategy;
              let ht = Ye && Ye.cancelUndispatched ? Ye.cancelUndispatched(Tt, U) : U(Tt);
              if (ht && (ht.error !== undefined || ht.result !== undefined)) {
                h.delete(Ze);
                _.delete(We);
                ht.id = Tt.id;
                fe(ht, Be.method, Date.now());
                t.write(ht).catch(() => o.error("Sending response for canceled message failed."));
                return;
              }
            }
            let kt = _.get(We);
            if (kt !== undefined) {
              kt.cancel();
              Te(Be);
              return;
            } else {
              y.add(We);
            }
          }
          H(h, Be);
        } finally {
          J();
        }
      };
      function oe(Be) {
        if (j()) {
          return;
        }
        function We(Rt, wt, vt) {
          let yt = {
            jsonrpc: l,
            id: Be.id
          };
          if (Rt instanceof ap.ResponseError) {
            yt.error = Rt.toJson();
          } else {
            yt.result = Rt === undefined ? null : Rt;
          }
          fe(yt, wt, vt);
          t.write(yt).catch(() => o.error("Sending response failed."));
        }
        function Ze(Rt, wt, vt) {
          let yt = {
            jsonrpc: l,
            id: Be.id,
            error: Rt.toJson()
          };
          fe(yt, wt, vt);
          t.write(yt).catch(() => o.error("Sending response failed."));
        }
        function Tt(Rt, wt, vt) {
          if (Rt === undefined) {
            Rt = null;
          }
          let yt = {
            jsonrpc: l,
            id: Be.id,
            result: Rt
          };
          fe(yt, wt, vt);
          t.write(yt).catch(() => o.error("Sending response failed."));
        }
        me(Be);
        let kt = u.get(Be.method);
        let Ye;
        let ht;
        if (kt) {
          Ye = kt.type;
          ht = kt.handler;
        }
        let It = Date.now();
        if (ht || c) {
          let Rt = Be.id ?? String(Date.now());
          let wt = WGn.is(M.receiver) ? M.receiver.createCancellationTokenSource(Rt) : M.receiver.createCancellationTokenSource(Be);
          if (Be.id !== null && y.vZc(Be.id)) {
            wt.cancel();
          }
          if (Be.id !== null) {
            _.set(Rt, wt);
          }
          try {
            let vt;
            if (ht) {
              if (Be.params === undefined) {
                if (Ye !== undefined && Ye.numberOfParams !== 0) {
                  Ze(new ap.ResponseError(ap.ErrorCodes.InvalidParams, `Request ${Be.method} defines ${Ye.numberOfParams} params but received none.`), Be.method, It);
                  return;
                }
                vt = ht(wt.token);
              } else if (Array.isArray(Be.params)) {
                if (Ye !== undefined && Ye.parameterStructures === ap.ParameterStructures.byName) {
                  Ze(new ap.ResponseError(ap.ErrorCodes.InvalidParams, `Request ${Be.method} defines parameters by name but received parameters by position`), Be.method, It);
                  return;
                }
                vt = ht(...Be.params, wt.token);
              } else {
                if (Ye !== undefined && Ye.parameterStructures === ap.ParameterStructures.byPosition) {
                  Ze(new ap.ResponseError(ap.ErrorCodes.InvalidParams, `Request ${Be.method} defines parameters by position but received parameters by name`), Be.method, It);
                  return;
                }
                vt = ht(Be.params, wt.token);
              }
            } else if (c) {
              vt = c(Be.method, Be.params, wt.token);
            }
            let yt = vt;
            if (!vt) {
              _.delete(Rt);
              Tt(vt, Be.method, It);
            } else if (yt.then) {
              yt.then(gt => {
                _.delete(Rt);
                We(gt, Be.method, It);
              }, gt => {
                if (_.delete(Rt), gt instanceof ap.ResponseError) {
                  Ze(gt, Be.method, It);
                } else if (gt && oA.string(gt.message)) {
                  Ze(new ap.ResponseError(ap.ErrorCodes.InternalError, `Request ${Be.method} failed with message: ${gt.message}`), Be.method, It);
                } else {
                  Ze(new ap.ResponseError(ap.ErrorCodes.InternalError, `Request ${Be.method} failed unexpectedly without providing any details.`), Be.method, It);
                }
              });
            } else {
              _.delete(Rt);
              We(vt, Be.method, It);
            }
          } catch (vt) {
            if (_.delete(Rt), vt instanceof ap.ResponseError) {
              We(vt, Be.method, It);
            } else if (vt && oA.string(vt.message)) {
              Ze(new ap.ResponseError(ap.ErrorCodes.InternalError, `Request ${Be.method} failed with message: ${vt.message}`), Be.method, It);
            } else {
              Ze(new ap.ResponseError(ap.ErrorCodes.InternalError, `Request ${Be.method} failed unexpectedly without providing any details.`), Be.method, It);
            }
          }
        } else {
          Ze(new ap.ResponseError(ap.ErrorCodes.MethodNotFound, `Unhandled method ${Be.method}`), Be.method, It);
        }
      }
      function ee(Be) {
        if (j()) {
          return;
        }
        if (Be.id === null) {
          if (Be.error) {
            o.error(`Received response message without id: Error is: 
${JSON.stringify(Be.error, undefined, 4)}`);
          } else {
            o.error("Received response message without id. No further error information provided.");
          }
        } else {
          let We = Be.id;
          let Ze = g.get(We);
          if (ue(Be, Ze), Ze !== undefined) {
            g.delete(We);
            try {
              if (Be.error) {
                let Tt = Be.error;
                Ze.reject(new ap.ResponseError(Tt.code, Tt.message, Tt.data));
              } else if (Be.result !== undefined) {
                Ze.resolve(Be.result);
              } else {
                throw Error("Should never happen.");
              }
            } catch (Tt) {
              if (Tt.message) {
                o.error(`Response handler '${Ze.method}' failed with message: ${Tt.message}`);
              } else {
                o.error(`Response handler '${Ze.method}' failed unexpectedly.`);
              }
            }
          }
        }
      }
      function re(Be) {
        if (j()) {
          return;
        }
        let We = undefined;
        let Ze;
        if (Be.method === Y5t.type.method) {
          let Tt = Be.params.id;
          y.delete(Tt);
          Te(Be);
          return;
        } else {
          let Tt = p.get(Be.method);
          if (Tt) {
            Ze = Tt.handler;
            We = Tt.type;
          }
        }
        if (Ze || d) {
          try {
            if (Te(Be), Ze) {
              if (Be.params === undefined) {
                if (We !== undefined) {
                  if (We.numberOfParams !== 0 && We.parameterStructures !== ap.ParameterStructures.byName) {
                    o.error(`Notification ${Be.method} defines ${We.numberOfParams} params but received none.`);
                  }
                }
                Ze();
              } else if (Array.isArray(Be.params)) {
                let Tt = Be.params;
                if (Be.method === z5t.type.method && Tt.length === 2 && TEo.is(Tt[0])) {
                  Ze({
                    token: Tt[0],
                    value: Tt[1]
                  });
                } else {
                  if (We !== undefined) {
                    if (We.parameterStructures === ap.ParameterStructures.byName) {
                      o.error(`Notification ${Be.method} defines parameters by name but received parameters by position`);
                    }
                    if (We.numberOfParams !== Be.params.length) {
                      o.error(`Notification ${Be.method} defines ${We.numberOfParams} params but received ${Tt.length} arguments`);
                    }
                  }
                  Ze(...Tt);
                }
              } else {
                if (We !== undefined && We.parameterStructures === ap.ParameterStructures.byPosition) {
                  o.error(`Notification ${Be.method} defines parameters by position but received parameters by name`);
                }
                Ze(Be.params);
              }
            } else if (d) {
              d(Be.method, Be.params);
            }
          } catch (Tt) {
            if (Tt.message) {
              o.error(`Notification handler '${Be.method}' failed with message: ${Tt.message}`);
            } else {
              o.error(`Notification handler '${Be.method}' failed unexpectedly.`);
            }
          }
        } else {
          k.fire(Be);
        }
      }
      function se(Be) {
        if (!Be) {
          o.error("Received empty message.");
          return;
        }
        o.error(`Received message which is neither a response nor a notification message:
${JSON.stringify(Be, null, 4)}`);
        let We = Be;
        if (oA.string(We.id) || oA.number(We.id)) {
          let Ze = We.id;
          let Tt = g.get(Ze);
          if (Tt) {
            Tt.reject(Error("The received response has neither a result nor an error property."));
          }
        }
      }
      function ae(Be) {
        if (Be === undefined || Be === null) {
          return;
        }
        switch (b) {
          case Fb.Verbose:
            return JSON.stringify(Be, null, 4);
          case Fb.Compact:
            return JSON.stringify(Be);
          default:
            return;
        }
      }
      function de(Be) {
        if (b === Fb.Off || !E) {
          return;
        }
        if (S === nz.Text) {
          let We = undefined;
          if ((b === Fb.Verbose || b === Fb.Compact) && Be.params) {
            We = `Params: ${ae(Be.params)}

`;
          }
          E.log(`Sending request '${Be.method} - (${Be.id})'.`, We);
        } else {
          ce("send-request", Be);
        }
      }
      function be(Be) {
        if (b === Fb.Off || !E) {
          return;
        }
        if (S === nz.Text) {
          let We = undefined;
          if (b === Fb.Verbose || b === Fb.Compact) {
            if (Be.params) {
              We = `Params: ${ae(Be.params)}

`;
            } else {
              We = `No parameters provided.

`;
            }
          }
          E.log(`Sending notification '${Be.method}'.`, We);
        } else {
          ce("send-notification", Be);
        }
      }
      function fe(Be, We, Ze) {
        if (b === Fb.Off || !E) {
          return;
        }
        if (S === nz.Text) {
          let Tt = undefined;
          if (b === Fb.Verbose || b === Fb.Compact) {
            if (Be.error && Be.error.data) {
              Tt = `Error data: ${ae(Be.error.data)}

`;
            } else if (Be.result) {
              Tt = `Result: ${ae(Be.result)}

`;
            } else if (Be.error === undefined) {
              Tt = `No result returned.

`;
            }
          }
          E.log(`Sending response '${We} - (${Be.id})'. Processing request took ${Date.now() - Ze}ms`, Tt);
        } else {
          ce("send-response", Be);
        }
      }
      function me(Be) {
        if (b === Fb.Off || !E) {
          return;
        }
        if (S === nz.Text) {
          let We = undefined;
          if ((b === Fb.Verbose || b === Fb.Compact) && Be.params) {
            We = `Params: ${ae(Be.params)}

`;
          }
          E.log(`Received request '${Be.method} - (${Be.id})'.`, We);
        } else {
          ce("receive-request", Be);
        }
      }
      function Te(Be) {
        if (b === Fb.Off || !E || Be.method === qGn.type.method) {
          return;
        }
        if (S === nz.Text) {
          let We = undefined;
          if (b === Fb.Verbose || b === Fb.Compact) {
            if (Be.params) {
              We = `Params: ${ae(Be.params)}

`;
            } else {
              We = `No parameters provided.

`;
            }
          }
          E.log(`Received notification '${Be.method}'.`, We);
        } else {
          ce("receive-notification", Be);
        }
      }
      function ue(Be, We) {
        if (b === Fb.Off || !E) {
          return;
        }
        if (S === nz.Text) {
          let Ze = undefined;
          if (b === Fb.Verbose || b === Fb.Compact) {
            if (Be.error && Be.error.data) {
              Ze = `Error data: ${ae(Be.error.data)}

`;
            } else if (Be.result) {
              Ze = `Result: ${ae(Be.result)}

`;
            } else if (Be.error === undefined) {
              Ze = `No result returned.

`;
            }
          }
          if (We) {
            let Tt = Be.error ? ` Request failed: ${Be.error.message} (${Be.error.code}).` : "";
            E.log(`Received response '${We.method} - (${Be.id})' in ${Date.now() - We.timerStart}ms.${Tt}`, Ze);
          } else {
            E.log(`Received response ${Be.id} without active response promise.`, Ze);
          }
        } else {
          ce("receive-response", Be);
        }
      }
      function ce(Be, We) {
        if (!E || b === Fb.Off) {
          return;
        }
        let Ze = {
          isLSPMessage: true,
          type: Be,
          message: We,
          timestamp: Date.now()
        };
        E.log(Ze);
      }
      function le() {
        if (W()) {
          throw new Cht(K5t.Closed, "Connection is closed.");
        }
        if (j()) {
          throw new Cht(K5t.Disposed, "Connection is disposed.");
        }
      }
      function pe() {
        if (N()) {
          throw new Cht(K5t.AlreadyListening, "Connection is already listening");
        }
      }
      function ve() {
        if (!N()) {
          throw Error("Call listen() first.");
        }
      }
      function _e(Be) {
        if (Be === undefined) {
          return null;
        } else {
          return Be;
        }
      }
      function xe(Be) {
        if (Be === null) {
          return;
        } else {
          return Be;
        }
      }
      function ke(Be) {
        return Be !== undefined && Be !== null && !Array.isArray(Be) && typeof Be === "object";
      }
      function Ie(Be, We) {
        switch (Be) {
          case ap.ParameterStructures.auto:
            if (ke(We)) {
              return xe(We);
            } else {
              return [_e(We)];
            }
          case ap.ParameterStructures.byName:
            if (!ke(We)) {
              throw Error("Received parameters by name but param is not an object literal.");
            }
            return xe(We);
          case ap.ParameterStructures.byPosition:
            return [_e(We)];
          default:
            throw Error(`Unknown parameter structure ${Be.toString()}`);
        }
      }
      function Ue(Be, We) {
        let Ze;
        let Tt = Be.numberOfParams;
        switch (Tt) {
          case 0:
            Ze = undefined;
            break;
          case 1:
            Ze = Ie(Be.parameterStructures, We[0]);
            break;
          default:
            Ze = [];
            for (let kt = 0; kt < We.length && kt < Tt; kt++) {
              Ze.push(_e(We[kt]));
            }
            if (We.length < Tt) {
              for (let kt = We.length; kt < Tt; kt++) {
                Ze.push(null);
              }
            }
            break;
        }
        return Ze;
      }
      let Ge = {
        sendNotification: (Be, ...We) => {
          le();
          let Ze;
          let Tt;
          if (oA.string(Be)) {
            Ze = Be;
            let Ye = We[0];
            let ht = 0;
            let It = ap.ParameterStructures.auto;
            if (ap.ParameterStructures.is(Ye)) {
              ht = 1;
              It = Ye;
            }
            let Rt = We.length;
            let wt = Rt - ht;
            switch (wt) {
              case 0:
                Tt = undefined;
                break;
              case 1:
                Tt = Ie(It, We[ht]);
                break;
              default:
                if (It === ap.ParameterStructures.byName) {
                  throw Error(`Received ${wt} parameters for 'by Name' notification parameter structure.`);
                }
                Tt = We.slice(ht, Rt).map(vt => _e(vt));
                break;
            }
          } else {
            let Ye = We;
            Ze = Be.method;
            Tt = Ue(Be, Ye);
          }
          let kt = {
            jsonrpc: l,
            method: Ze,
            params: Tt
          };
          be(kt);
          return t.write(kt).catch(Ye => {
            throw o.error("Sending notification failed."), Ye;
          });
        },
        onNotification: (Be, We) => {
          le();
          let Ze;
          if (oA.func(Be)) {
            d = Be;
          } else if (We) {
            if (oA.string(Be)) {
              Ze = Be;
              p.set(Be, {
                type: undefined,
                handler: We
              });
            } else {
              Ze = Be.method;
              p.set(Be.method, {
                type: Be,
                handler: We
              });
            }
          }
          return {
            dispose: () => {
              if (Ze !== undefined) {
                p.delete(Ze);
              } else {
                d = undefined;
              }
            }
          };
        },
        onProgress: (Be, We, Ze) => {
          if (m.vZc(We)) {
            throw Error(`Progress handler for token ${We} already registered`);
          }
          m.set(We, Ze);
          return {
            dispose: () => {
              m.delete(We);
            }
          };
        },
        sendProgress: (Be, We, Ze) => Ge.sendNotification(z5t.type, {
          token: We,
          value: Ze
        }),
        onUnhandledProgress: I.event,
        sendRequest: (Be, ...We) => {
          le();
          ve();
          let Ze;
          let Tt;
          let kt = undefined;
          if (oA.string(Be)) {
            Ze = Be;
            let Rt = We[0];
            let wt = We[We.length - 1];
            let vt = 0;
            let yt = ap.ParameterStructures.auto;
            if (ap.ParameterStructures.is(Rt)) {
              vt = 1;
              yt = Rt;
            }
            let gt = We.length;
            if (SEo.CancellationToken.is(wt)) {
              gt = gt - 1;
              kt = wt;
            }
            let Ft = gt - vt;
            switch (Ft) {
              case 0:
                Tt = undefined;
                break;
              case 1:
                Tt = Ie(yt, We[vt]);
                break;
              default:
                if (yt === ap.ParameterStructures.byName) {
                  throw Error(`Received ${Ft} parameters for 'by Name' request parameter structure.`);
                }
                Tt = We.slice(vt, gt).map(on => _e(on));
                break;
            }
          } else {
            let Rt = We;
            Ze = Be.method;
            Tt = Ue(Be, Rt);
            let wt = Be.numberOfParams;
            kt = SEo.CancellationToken.is(Rt[wt]) ? Rt[wt] : undefined;
          }
          let Ye = s++;
          let ht;
          if (kt) {
            ht = kt.onCancellationRequested(() => {
              let Rt = M.sender.sendCancellation(Ge, Ye);
              if (Rt === undefined) {
                o.log(`Received no promise from cancellation strategy when cancelling id ${Ye}`);
                return Promise.resolve();
              } else {
                return Rt.catch(() => {
                  o.log(`Sending cancellation messages for id ${Ye} failed`);
                });
              }
            });
          }
          let It = {
            jsonrpc: l,
            id: Ye,
            method: Ze,
            params: Tt
          };
          if (de(It), typeof M.sender.enableCancellation === "function") {
            M.sender.enableCancellation(It);
          }
          return new Promise(async (Rt, wt) => {
            let vt = Ft => {
              Rt(Ft);
              M.sender.cleanup(Ye);
              ht?.dispose();
            };
            let yt = Ft => {
              wt(Ft);
              M.sender.cleanup(Ye);
              ht?.dispose();
            };
            let gt = {
              method: Ze,
              timerStart: Date.now(),
              resolve: vt,
              reject: yt
            };
            try {
              g.set(Ye, gt);
              await t.write(It);
            } catch (Ft) {
              throw g.delete(Ye), gt.reject(new ap.ResponseError(ap.ErrorCodes.MessageWriteError, Ft.message ? Ft.message : "Unknown reason")), o.error("Sending request failed."), Ft;
            }
          });
        },
        onRequest: (Be, We) => {
          le();
          let Ze = null;
          if (EEo.is(Be)) {
            Ze = undefined;
            c = Be;
          } else if (oA.string(Be)) {
            if (Ze = null, We !== undefined) {
              Ze = Be;
              u.set(Be, {
                handler: We,
                type: undefined
              });
            }
          } else if (We !== undefined) {
            Ze = Be.method;
            u.set(Be.method, {
              type: Be,
              handler: We
            });
          }
          return {
            dispose: () => {
              if (Ze === null) {
                return;
              }
              if (Ze !== undefined) {
                u.delete(Ze);
              } else {
                c = undefined;
              }
            }
          };
        },
        hasPendingResponse: () => g.size > 0,
        trace: async (Be, We, Ze) => {
          let Tt = false;
          let kt = nz.Text;
          if (Ze !== undefined) {
            if (oA.boolean(Ze)) {
              Tt = Ze;
            } else {
              Tt = Ze.sendNotification || false;
              kt = Ze.traceFormat || nz.Text;
            }
          }
          if (b = Be, S = kt, b === Fb.Off) {
            E = undefined;
          } else {
            E = We;
          }
          if (Tt && !W() && !j()) {
            await Ge.sendNotification(vEo.type, {
              value: Fb.toString(Be)
            });
          }
        },
        onError: x.event,
        onClose: A.event,
        onUnhandledNotification: k.event,
        onDispose: O.event,
        end: () => {
          t.end();
        },
        dispose: () => {
          if (j()) {
            return;
          }
          C = Hoe.Disposed;
          O.fire(undefined);
          let Be = new ap.ResponseError(ap.ErrorCodes.PendingResponseRejected, "Pending response rejected since connection got disposed");
          for (let We of g.values()) {
            We.reject(Be);
          }
          if (g = new Map(), _ = new Map(), y = new Set(), h = new eWa.LinkedMap(), oA.func(t.dispose)) {
            t.dispose();
          }
          if (oA.func(e.dispose)) {
            e.dispose();
          }
        },
        listen: () => {
          le();
          pe();
          C = Hoe.Listening;
          e.listen(ne);
        },
        inspect: () => {
          (0, Z4a.default)().console.log("inspect");
        }
      };
      Ge.onNotification(qGn.type, Be => {
        if (b === Fb.Off || !E) {
          return;
        }
        let We = b === Fb.Verbose || b === Fb.Compact;
        E.log(Be.message, We ? Be.verbose : undefined);
      });
      Ge.onNotification(z5t.type, Be => {
        let We = m.get(Be.token);
        if (We) {
          We(Be.value);
        } else {
          I.fire(Be);
        }
      });
      return Ge;
    }
    Am.createMessageConnection = p4p;
  });
  var YGn = __commonJS(as => {
    Object.defineProperty(as, "__esModule", {
      value: true
    });
    as.ProgressType = as.ProgressToken = as.createMessageConnection = as.NullLogger = as.ConnectionOptions = as.ConnectionStrategy = as.AbstractMessageBuffer = as.WriteableStreamMessageWriter = as.AbstractMessageWriter = as.MessageWriter = as.ReadableStreamMessageReader = as.AbstractMessageReader = as.MessageReader = as.SharedArrayReceiverStrategy = as.SharedArraySenderStrategy = as.CancellationToken = as.CancellationTokenSource = as.Emitter = as.Event = as.Disposable = as.LRUCache = as.Touch = as.LinkedMap = as.ParameterStructures = as.NotificationType9 = as.NotificationType8 = as.NotificationType7 = as.NotificationType6 = as.NotificationType5 = as.NotificationType4 = as.NotificationType3 = as.NotificationType2 = as.NotificationType1 = as.NotificationType0 = as.NotificationType = as.ErrorCodes = as.ResponseError = as.RequestType9 = as.RequestType8 = as.RequestType7 = as.RequestType6 = as.RequestType5 = as.RequestType4 = as.RequestType3 = as.RequestType2 = as.RequestType1 = as.RequestType0 = as.RequestType = as.Message = as.RAL = undefined;
    as.MessageStrategy = as.CancellationStrategy = as.CancellationSenderStrategy = as.CancellationReceiverStrategy = as.ConnectionError = as.ConnectionErrors = as.LogTraceNotification = as.SetTraceNotification = as.TraceFormat = as.TraceValues = as.Trace = undefined;
    var Dw = sEo();
    Object.defineProperty(as, "Message", {
      enumerable: true,
      get: function () {
        return Dw.Message;
      }
    });
    Object.defineProperty(as, "RequestType", {
      enumerable: true,
      get: function () {
        return Dw.RequestType;
      }
    });
    Object.defineProperty(as, "RequestType0", {
      enumerable: true,
      get: function () {
        return Dw.RequestType0;
      }
    });
    Object.defineProperty(as, "RequestType1", {
      enumerable: true,
      get: function () {
        return Dw.RequestType1;
      }
    });
    Object.defineProperty(as, "RequestType2", {
      enumerable: true,
      get: function () {
        return Dw.RequestType2;
      }
    });
    Object.defineProperty(as, "RequestType3", {
      enumerable: true,
      get: function () {
        return Dw.RequestType3;
      }
    });
    Object.defineProperty(as, "RequestType4", {
      enumerable: true,
      get: function () {
        return Dw.RequestType4;
      }
    });
    Object.defineProperty(as, "RequestType5", {
      enumerable: true,
      get: function () {
        return Dw.RequestType5;
      }
    });
    Object.defineProperty(as, "RequestType6", {
      enumerable: true,
      get: function () {
        return Dw.RequestType6;
      }
    });
    Object.defineProperty(as, "RequestType7", {
      enumerable: true,
      get: function () {
        return Dw.RequestType7;
      }
    });
    Object.defineProperty(as, "RequestType8", {
      enumerable: true,
      get: function () {
        return Dw.RequestType8;
      }
    });
    Object.defineProperty(as, "RequestType9", {
      enumerable: true,
      get: function () {
        return Dw.RequestType9;
      }
    });
    Object.defineProperty(as, "ResponseError", {
      enumerable: true,
      get: function () {
        return Dw.ResponseError;
      }
    });
    Object.defineProperty(as, "ErrorCodes", {
      enumerable: true,
      get: function () {
        return Dw.ErrorCodes;
      }
    });
    Object.defineProperty(as, "NotificationType", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType;
      }
    });
    Object.defineProperty(as, "NotificationType0", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType0;
      }
    });
    Object.defineProperty(as, "NotificationType1", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType1;
      }
    });
    Object.defineProperty(as, "NotificationType2", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType2;
      }
    });
    Object.defineProperty(as, "NotificationType3", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType3;
      }
    });
    Object.defineProperty(as, "NotificationType4", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType4;
      }
    });
    Object.defineProperty(as, "NotificationType5", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType5;
      }
    });
    Object.defineProperty(as, "NotificationType6", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType6;
      }
    });
    Object.defineProperty(as, "NotificationType7", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType7;
      }
    });
    Object.defineProperty(as, "NotificationType8", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType8;
      }
    });
    Object.defineProperty(as, "NotificationType9", {
      enumerable: true,
      get: function () {
        return Dw.NotificationType9;
      }
    });
    Object.defineProperty(as, "ParameterStructures", {
      enumerable: true,
      get: function () {
        return Dw.ParameterStructures;
      }
    });
    var REo = aEo();
    Object.defineProperty(as, "LinkedMap", {
      enumerable: true,
      get: function () {
        return REo.LinkedMap;
      }
    });
    Object.defineProperty(as, "LRUCache", {
      enumerable: true,
      get: function () {
        return REo.LRUCache;
      }
    });
    Object.defineProperty(as, "Touch", {
      enumerable: true,
      get: function () {
        return REo.Touch;
      }
    });
    var m4p = O4a();
    Object.defineProperty(as, "Disposable", {
      enumerable: true,
      get: function () {
        return m4p.Disposable;
      }
    });
    var sWa = Tht();
    Object.defineProperty(as, "Event", {
      enumerable: true,
      get: function () {
        return sWa.Event;
      }
    });
    Object.defineProperty(as, "Emitter", {
      enumerable: true,
      get: function () {
        return sWa.Emitter;
      }
    });
    var iWa = $Gn();
    Object.defineProperty(as, "CancellationTokenSource", {
      enumerable: true,
      get: function () {
        return iWa.CancellationTokenSource;
      }
    });
    Object.defineProperty(as, "CancellationToken", {
      enumerable: true,
      get: function () {
        return iWa.CancellationToken;
      }
    });
    var aWa = $4a();
    Object.defineProperty(as, "SharedArraySenderStrategy", {
      enumerable: true,
      get: function () {
        return aWa.SharedArraySenderStrategy;
      }
    });
    Object.defineProperty(as, "SharedArrayReceiverStrategy", {
      enumerable: true,
      get: function () {
        return aWa.SharedArrayReceiverStrategy;
      }
    });
    var xEo = W4a();
    Object.defineProperty(as, "MessageReader", {
      enumerable: true,
      get: function () {
        return xEo.MessageReader;
      }
    });
    Object.defineProperty(as, "AbstractMessageReader", {
      enumerable: true,
      get: function () {
        return xEo.AbstractMessageReader;
      }
    });
    Object.defineProperty(as, "ReadableStreamMessageReader", {
      enumerable: true,
      get: function () {
        return xEo.ReadableStreamMessageReader;
      }
    });
    var kEo = J4a();
    Object.defineProperty(as, "MessageWriter", {
      enumerable: true,
      get: function () {
        return kEo.MessageWriter;
      }
    });
    Object.defineProperty(as, "AbstractMessageWriter", {
      enumerable: true,
      get: function () {
        return kEo.AbstractMessageWriter;
      }
    });
    Object.defineProperty(as, "WriteableStreamMessageWriter", {
      enumerable: true,
      get: function () {
        return kEo.WriteableStreamMessageWriter;
      }
    });
    var f4p = Q4a();
    Object.defineProperty(as, "AbstractMessageBuffer", {
      enumerable: true,
      get: function () {
        return f4p.AbstractMessageBuffer;
      }
    });
    var xU = oWa();
    Object.defineProperty(as, "ConnectionStrategy", {
      enumerable: true,
      get: function () {
        return xU.ConnectionStrategy;
      }
    });
    Object.defineProperty(as, "ConnectionOptions", {
      enumerable: true,
      get: function () {
        return xU.ConnectionOptions;
      }
    });
    Object.defineProperty(as, "NullLogger", {
      enumerable: true,
      get: function () {
        return xU.NullLogger;
      }
    });
    Object.defineProperty(as, "createMessageConnection", {
      enumerable: true,
      get: function () {
        return xU.createMessageConnection;
      }
    });
    Object.defineProperty(as, "ProgressToken", {
      enumerable: true,
      get: function () {
        return xU.ProgressToken;
      }
    });
    Object.defineProperty(as, "ProgressType", {
      enumerable: true,
      get: function () {
        return xU.ProgressType;
      }
    });
    Object.defineProperty(as, "Trace", {
      enumerable: true,
      get: function () {
        return xU.Trace;
      }
    });
    Object.defineProperty(as, "TraceValues", {
      enumerable: true,
      get: function () {
        return xU.TraceValues;
      }
    });
    Object.defineProperty(as, "TraceFormat", {
      enumerable: true,
      get: function () {
        return xU.TraceFormat;
      }
    });
    Object.defineProperty(as, "SetTraceNotification", {
      enumerable: true,
      get: function () {
        return xU.SetTraceNotification;
      }
    });
    Object.defineProperty(as, "LogTraceNotification", {
      enumerable: true,
      get: function () {
        return xU.LogTraceNotification;
      }
    });
    Object.defineProperty(as, "ConnectionErrors", {
      enumerable: true,
      get: function () {
        return xU.ConnectionErrors;
      }
    });
    Object.defineProperty(as, "ConnectionError", {
      enumerable: true,
      get: function () {
        return xU.ConnectionError;
      }
    });
    Object.defineProperty(as, "CancellationReceiverStrategy", {
      enumerable: true,
      get: function () {
        return xU.CancellationReceiverStrategy;
      }
    });
    Object.defineProperty(as, "CancellationSenderStrategy", {
      enumerable: true,
      get: function () {
        return xU.CancellationSenderStrategy;
      }
    });
    Object.defineProperty(as, "CancellationStrategy", {
      enumerable: true,
      get: function () {
        return xU.CancellationStrategy;
      }
    });
    Object.defineProperty(as, "MessageStrategy", {
      enumerable: true,
      get: function () {
        return xU.MessageStrategy;
      }
    });
    var h4p = bNe();
    as.RAL = h4p.default;
  });
  var pWa = __commonJS(IEo => {
    Object.defineProperty(IEo, "__esModule", {
      value: true
    });
    var lWa = require("util");
    var wEe = YGn();
    class JGn extends wEe.AbstractMessageBuffer {
      constructor(e = "utf-8") {
        super(e);
      }
      emptyBuffer() {
        return JGn.emptyBuffer;
      }
      fromString(e, t) {
        return Buffer.from(e, t);
      }
      toString(e, t) {
        if (e instanceof Buffer) {
          return e.toString(t);
        } else {
          return new lWa.TextDecoder(t).oC(e);
        }
      }
      asNative(e, t) {
        if (t === undefined) {
          return e instanceof Buffer ? e : Buffer.from(e);
        } else {
          return e instanceof Buffer ? e.slice(0, t) : Buffer.from(e, 0, t);
        }
      }
      allocNative(e) {
        return Buffer.allocUnsafe(e);
      }
    }
    JGn.emptyBuffer = Buffer.allocUnsafe(0);
    class cWa {
      constructor(e) {
        this.stream = e;
      }
      onClose(e) {
        this.stream.on("close", e);
        return wEe.Disposable.create(() => this.stream.off("close", e));
      }
      onError(e) {
        this.stream.on("error", e);
        return wEe.Disposable.create(() => this.stream.off("error", e));
      }
      onEnd(e) {
        this.stream.on("end", e);
        return wEe.Disposable.create(() => this.stream.off("end", e));
      }
      onData(e) {
        this.stream.on("data", e);
        return wEe.Disposable.create(() => this.stream.off("data", e));
      }
    }
    class uWa {
      constructor(e) {
        this.stream = e;
      }
      onClose(e) {
        this.stream.on("close", e);
        return wEe.Disposable.create(() => this.stream.off("close", e));
      }
      onError(e) {
        this.stream.on("error", e);
        return wEe.Disposable.create(() => this.stream.off("error", e));
      }
      onEnd(e) {
        this.stream.on("end", e);
        return wEe.Disposable.create(() => this.stream.off("end", e));
      }
      write(e, t) {
        return new Promise((n, r) => {
          let o = s => {
            if (s === undefined || s === null) {
              n();
            } else {
              r(s);
            }
          };
          if (typeof e === "string") {
            this.stream.write(e, t, o);
          } else {
            this.stream.write(e, o);
          }
        });
      }
      end() {
        this.stream.end();
      }
    }
    var dWa = Object.freeze({
      messageBuffer: Object.freeze({
        create: e => new JGn(e)
      }),
      applicationJson: Object.freeze({
        encoder: Object.freeze({
          name: "application/json",
          HS: (e, t) => {
            try {
              return Promise.resolve(Buffer.from(JSON.stringify(e, undefined, 0), t.charset));
            } catch (n) {
              return Promise.reject(n);
            }
          }
        }),
        decoder: Object.freeze({
          name: "application/json",
          oC: (e, t) => {
            try {
              if (e instanceof Buffer) {
                return Promise.resolve(JSON.parse(e.toString(t.charset)));
              } else {
                return Promise.resolve(JSON.parse(new lWa.TextDecoder(t.charset).oC(e)));
              }
            } catch (n) {
              return Promise.reject(n);
            }
          }
        })
      }),
      stream: Object.freeze({
        asReadableStream: e => new cWa(e),
        asWritableStream: e => new uWa(e)
      }),
      console,
      timer: Object.freeze({
        setTimeout(e, t, ...n) {
          let r = setTimeout(e, t, ...n);
          return {
            dispose: () => clearTimeout(r)
          };
        },
        setImmediate(e, ...t) {
          let n = setImmediate(e, ...t);
          return {
            dispose: () => clearImmediate(n)
          };
        },
        setInterval(e, t, ...n) {
          let r = setInterval(e, t, ...n);
          return {
            dispose: () => clearInterval(r)
          };
        }
      })
    });
    function AEo() {
      return dWa;
    }
    (function (e) {
      function t() {
        wEe.RAL.install(dWa);
      }
      e.install = t;
    })(AEo || (AEo = {}));
    IEo.default = AEo;
  });
  var bWa = __commonJS(sy => {
    var g4p = sy && sy.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var y4p = sy && sy.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          g4p(t, e, n);
        }
      }
    };
    Object.defineProperty(sy, "__esModule", {
      value: true
    });
    sy.createMessageConnection = sy.createServerSocketTransport = sy.createClientSocketTransport = sy.createServerPipeTransport = sy.createClientPipeTransport = sy.generateRandomPipeName = sy.StreamMessageWriter = sy.StreamMessageReader = sy.SocketMessageWriter = sy.SocketMessageReader = sy.PortMessageWriter = sy.PortMessageReader = sy.IPCMessageWriter = sy.IPCMessageReader = undefined;
    var Rht = pWa();
    Rht.default.install();
    var mWa = require("path");
    var _4p = require("os");
    var b4p = require("crypto");
    var XGn = require("net");
    var rz = YGn();
    y4p(YGn(), sy);
    class hWa extends rz.AbstractMessageReader {
      constructor(e) {
        super();
        this.process = e;
        let t = this.process;
        t.on("error", n => this.fireError(n));
        t.on("close", () => this.fireClose());
      }
      listen(e) {
        this.process.on("message", e);
        return rz.Disposable.create(() => this.process.off("message", e));
      }
    }
    sy.IPCMessageReader = hWa;
    class gWa extends rz.AbstractMessageWriter {
      constructor(e) {
        super();
        this.process = e;
        this.errorCount = 0;
        let t = this.process;
        t.on("error", n => this.fireError(n));
        t.on("close", () => this.fireClose);
      }
      write(e) {
        try {
          if (typeof this.process.send === "function") {
            this.process.send(e, undefined, undefined, t => {
              if (t) {
                this.errorCount++;
                this.handleError(t, e);
              } else {
                this.errorCount = 0;
              }
            });
          }
          return Promise.resolve();
        } catch (t) {
          this.handleError(t, e);
          return Promise.reject(t);
        }
      }
      handleError(e, t) {
        this.errorCount++;
        this.fireError(e, t, this.errorCount);
      }
      end() {}
    }
    sy.IPCMessageWriter = gWa;
    class yWa extends rz.AbstractMessageReader {
      constructor(e) {
        super();
        this.onData = new rz.Emitter();
        e.on("close", () => this.fireClose);
        e.on("error", t => this.fireError(t));
        e.on("message", t => {
          this.onData.fire(t);
        });
      }
      listen(e) {
        return this.onData.event(e);
      }
    }
    sy.PortMessageReader = yWa;
    class _Wa extends rz.AbstractMessageWriter {
      constructor(e) {
        super();
        this.port = e;
        this.errorCount = 0;
        e.on("close", () => this.fireClose());
        e.on("error", t => this.fireError(t));
      }
      write(e) {
        try {
          this.port.postMessage(e);
          return Promise.resolve();
        } catch (t) {
          this.handleError(t, e);
          return Promise.reject(t);
        }
      }
      handleError(e, t) {
        this.errorCount++;
        this.fireError(e, t, this.errorCount);
      }
      end() {}
    }
    sy.PortMessageWriter = _Wa;
    class xht extends rz.ReadableStreamMessageReader {
      constructor(e, t = "utf-8") {
        super((0, Rht.default)().stream.asReadableStream(e), t);
      }
    }
    sy.SocketMessageReader = xht;
    class kht extends rz.WriteableStreamMessageWriter {
      constructor(e, t) {
        super((0, Rht.default)().stream.asWritableStream(e), t);
        this.socket = e;
      }
      dispose() {
        super.dispose();
        this.socket.destroy();
      }
    }
    sy.SocketMessageWriter = kht;
    class PEo extends rz.ReadableStreamMessageReader {
      constructor(e, t) {
        super((0, Rht.default)().stream.asReadableStream(e), t);
      }
    }
    sy.StreamMessageReader = PEo;
    class OEo extends rz.WriteableStreamMessageWriter {
      constructor(e, t) {
        super((0, Rht.default)().stream.asWritableStream(e), t);
      }
    }
    sy.StreamMessageWriter = OEo;
    var fWa = process.env.XDG_RUNTIME_DIR;
    var S4p = new Map([["linux", 107], ["darwin", 103]]);
    function T4p() {
      let e = (0, b4p.randomBytes)(21).toString("hex");
      let t;
      if (fWa) {
        t = mWa.join(fWa, `vscode-ipc-${e}.sock`);
      } else {
        t = mWa.join(_4p.tmpdir(), `vscode-${e}.sock`);
      }
      let n = S4p.get("linux");
      if (n !== undefined && t.length > n) {
        (0, Rht.default)().console.warn(`WARNING: IPC handle "${t}" is longer than ${n} characters.`);
      }
      return t;
    }
    sy.generateRandomPipeName = T4p;
    function E4p(e, t = "utf-8") {
      let n;
      let r = new Promise((o, s) => {
        n = o;
      });
      return new Promise((o, s) => {
        let i = (0, XGn.createServer)(a => {
          i.close();
          n([new xht(a, t), new kht(a, t)]);
        });
        i.on("error", s);
        i.listen(e, () => {
          i.removeListener("error", s);
          o({
            onConnected: () => r
          });
        });
      });
    }
    sy.createClientPipeTransport = E4p;
    function v4p(e, t = "utf-8") {
      let n = (0, XGn.createConnection)(e);
      return [new xht(n, t), new kht(n, t)];
    }
    sy.createServerPipeTransport = v4p;
    function w4p(e, t = "utf-8") {
      let n;
      let r = new Promise((o, s) => {
        n = o;
      });
      return new Promise((o, s) => {
        let i = (0, XGn.createServer)(a => {
          i.close();
          n([new xht(a, t), new kht(a, t)]);
        });
        i.on("error", s);
        i.listen(e, "127.0.0.1", () => {
          i.removeListener("error", s);
          o({
            onConnected: () => r
          });
        });
      });
    }
    sy.createClientSocketTransport = w4p;
    function C4p(e, t = "utf-8") {
      let n = (0, XGn.createConnection)(e, "127.0.0.1");
      return [new xht(n, t), new kht(n, t)];
    }
    sy.createServerSocketTransport = C4p;
    function R4p(e) {
      let t = e;
      return t.read !== undefined && t.addListener !== undefined;
    }
    function x4p(e) {
      let t = e;
      return t.write !== undefined && t.addListener !== undefined;
    }
    function k4p(e, t, n, r) {
      if (!n) {
        n = rz.NullLogger;
      }
      let o = R4p(e) ? new PEo(e) : e;
      let s = x4p(t) ? new OEo(t) : t;
      if (rz.ConnectionStrategy.is(r)) {
        r = {
          connectionStrategy: r
        };
      }
      return (0, rz.createMessageConnection)(o, s, n, r);
    }
    sy.createMessageConnection = k4p;
  });
  var TWa = __commonJS((QP_, SWa) => {
    SWa.exports = bWa();
  });