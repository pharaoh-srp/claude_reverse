  var $Gn = __commonJS(Eht => {
    Object.defineProperty(Eht, "__esModule", {
      value: true
    });
    Eht.CancellationTokenSource = Eht.CancellationToken = undefined;
    var t4p = bNe();
    var n4p = bht();
    var dEo = Tht();
    var BGn;
    (function (e) {
      e.None = Object.freeze({
        isCancellationRequested: false,
        onCancellationRequested: dEo.Event.None
      });
      e.Cancelled = Object.freeze({
        isCancellationRequested: true,
        onCancellationRequested: dEo.Event.None
      });
      function t(n) {
        let r = n;
        return r && (r === e.None || r === e.Cancelled || n4p.boolean(r.isCancellationRequested) && !!r.onCancellationRequested);
      }
      e.is = t;
    })(BGn || (Eht.CancellationToken = BGn = {}));
    var r4p = Object.freeze(function (e, t) {
      let n = (0, t4p.default)().timer.setTimeout(e.bind(t), 0);
      return {
        dispose() {
          n.dispose();
        }
      };
    });
    class pEo {
      constructor() {
        this._isCancelled = false;
      }
      cancel() {
        if (!this._isCancelled) {
          if (this._isCancelled = true, this._emitter) {
            this._emitter.fire(undefined);
            this.dispose();
          }
        }
      }
      get isCancellationRequested() {
        return this._isCancelled;
      }
      get onCancellationRequested() {
        if (this._isCancelled) {
          return r4p;
        }
        if (!this._emitter) {
          this._emitter = new dEo.Emitter();
        }
        return this._emitter.event;
      }
      dispose() {
        if (this._emitter) {
          this._emitter.dispose();
          this._emitter = undefined;
        }
      }
    }
    class N4a {
      get token() {
        if (!this._token) {
          this._token = new pEo();
        }
        return this._token;
      }
      cancel() {
        if (!this._token) {
          this._token = BGn.Cancelled;
        } else {
          this._token.cancel();
        }
      }
      dispose() {
        if (!this._token) {
          this._token = BGn.None;
        } else if (this._token instanceof pEo) {
          this._token.dispose();
        }
      }
    }
    Eht.CancellationTokenSource = N4a;
  });
  var $4a = __commonJS(vht => {
    Object.defineProperty(vht, "__esModule", {
      value: true
    });
    vht.SharedArrayReceiverStrategy = vht.SharedArraySenderStrategy = undefined;
    var o4p = $Gn();
    var W5t;
    (function (e) {
      e.Continue = 0;
      e.Cancelled = 1;
    })(W5t || (W5t = {}));
    class L4a {
      constructor() {
        this.buffers = new Map();
      }
      enableCancellation(e) {
        if (e.id === null) {
          return;
        }
        let t = new SharedArrayBuffer(4);
        let n = new Int32Array(t, 0, 1);
        n[0] = W5t.Continue;
        this.buffers.set(e.id, t);
        e.$cancellationData = t;
      }
      async sendCancellation(e, t) {
        let n = this.buffers.get(t);
        if (n === undefined) {
          return;
        }
        let r = new Int32Array(n, 0, 1);
        Atomics.store(r, 0, W5t.Cancelled);
      }
      cleanup(e) {
        this.buffers.delete(e);
      }
      dispose() {
        this.buffers.clear();
      }
    }
    vht.SharedArraySenderStrategy = L4a;
    class F4a {
      constructor(e) {
        this.data = new Int32Array(e, 0, 1);
      }
      get isCancellationRequested() {
        return Atomics.load(this.data, 0) === W5t.Cancelled;
      }
      get onCancellationRequested() {
        throw Error("Cancellation over SharedArrayBuffer doesn't support cancellation events");
      }
    }
    class U4a {
      constructor(e) {
        this.token = new F4a(e);
      }
      cancel() {}
      dispose() {}
    }
    class B4a {
      constructor() {
        this.kind = "request";
      }
      createCancellationTokenSource(e) {
        let t = e.$cancellationData;
        if (t === undefined) {
          return new o4p.CancellationTokenSource();
        }
        return new U4a(t);
      }
    }
    vht.SharedArrayReceiverStrategy = B4a;
  });