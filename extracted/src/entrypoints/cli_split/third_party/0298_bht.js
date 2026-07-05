  var bht = __commonJS(N$ => {
    Object.defineProperty(N$, "__esModule", {
      value: true
    });
    N$.stringArray = N$.array = N$.func = N$.error = N$.number = N$.string = N$.boolean = undefined;
    function Y3p(e) {
      return e === true || e === false;
    }
    N$.boolean = Y3p;
    function o4a(e) {
      return typeof e === "string" || e instanceof String;
    }
    N$.string = o4a;
    function J3p(e) {
      return typeof e === "number" || e instanceof Number;
    }
    N$.number = J3p;
    function X3p(e) {
      return e instanceof Error;
    }
    N$.error = X3p;
    function Q3p(e) {
      return typeof e === "function";
    }
    N$.func = Q3p;
    function s4a(e) {
      return Array.isArray(e);
    }
    N$.array = s4a;
    function Z3p(e) {
      return s4a(e) && e.every(t => o4a(t));
    }
    N$.stringArray = Z3p;
  });
  var sEo = __commonJS(Bu => {
    Object.defineProperty(Bu, "__esModule", {
      value: true
    });
    Bu.Message = Bu.NotificationType9 = Bu.NotificationType8 = Bu.NotificationType7 = Bu.NotificationType6 = Bu.NotificationType5 = Bu.NotificationType4 = Bu.NotificationType3 = Bu.NotificationType2 = Bu.NotificationType1 = Bu.NotificationType0 = Bu.NotificationType = Bu.RequestType9 = Bu.RequestType8 = Bu.RequestType7 = Bu.RequestType6 = Bu.RequestType5 = Bu.RequestType4 = Bu.RequestType3 = Bu.RequestType2 = Bu.RequestType1 = Bu.RequestType = Bu.RequestType0 = Bu.AbstractMessageSignature = Bu.ParameterStructures = Bu.ResponseError = Bu.ErrorCodes = undefined;
    var J6e = bht();
    var rEo;
    (function (e) {
      e.ParseError = -32700;
      e.InvalidRequest = -32600;
      e.MethodNotFound = -32601;
      e.InvalidParams = -32602;
      e.InternalError = -32603;
      e.jsonrpcReservedErrorRangeStart = -32099;
      e.serverErrorStart = -32099;
      e.MessageWriteError = -32099;
      e.MessageReadError = -32098;
      e.PendingResponseRejected = -32097;
      e.ConnectionInactive = -32096;
      e.ServerNotInitialized = -32002;
      e.UnknownErrorCode = -32001;
      e.jsonrpcReservedErrorRangeEnd = -32000;
      e.serverErrorEnd = -32000;
    })(rEo || (Bu.ErrorCodes = rEo = {}));
    class oEo extends Error {
      constructor(e, t, n) {
        super(t);
        this.code = J6e.number(e) ? e : rEo.UnknownErrorCode;
        this.data = n;
        Object.setPrototypeOf(this, oEo.prototype);
      }
      toJson() {
        let e = {
          code: this.code,
          message: this.message
        };
        if (this.data !== undefined) {
          e.data = this.data;
        }
        return e;
      }
    }
    Bu.ResponseError = oEo;
    class L$ {
      constructor(e) {
        this.kind = e;
      }
      static is(e) {
        return e === L$.auto || e === L$.byName || e === L$.byPosition;
      }
      toString() {
        return this.kind;
      }
    }
    Bu.ParameterStructures = L$;
    L$.auto = new L$("auto");
    L$.byPosition = new L$("byPosition");
    L$.byName = new L$("byName");
    class Ax {
      constructor(e, t) {
        this.method = e;
        this.numberOfParams = t;
      }
      get parameterStructures() {
        return L$.auto;
      }
    }
    Bu.AbstractMessageSignature = Ax;
    class a4a extends Ax {
      constructor(e) {
        super(e, 0);
      }
    }
    Bu.RequestType0 = a4a;
    class l4a extends Ax {
      constructor(e, t = L$.auto) {
        super(e, 1);
        this._parameterStructures = t;
      }
      get parameterStructures() {
        return this._parameterStructures;
      }
    }
    Bu.RequestType = l4a;
    class c4a extends Ax {
      constructor(e, t = L$.auto) {
        super(e, 1);
        this._parameterStructures = t;
      }
      get parameterStructures() {
        return this._parameterStructures;
      }
    }
    Bu.RequestType1 = c4a;
    class u4a extends Ax {
      constructor(e) {
        super(e, 2);
      }
    }
    Bu.RequestType2 = u4a;
    class d4a extends Ax {
      constructor(e) {
        super(e, 3);
      }
    }
    Bu.RequestType3 = d4a;
    class p4a extends Ax {
      constructor(e) {
        super(e, 4);
      }
    }
    Bu.RequestType4 = p4a;
    class m4a extends Ax {
      constructor(e) {
        super(e, 5);
      }
    }
    Bu.RequestType5 = m4a;
    class f4a extends Ax {
      constructor(e) {
        super(e, 6);
      }
    }
    Bu.RequestType6 = f4a;
    class h4a extends Ax {
      constructor(e) {
        super(e, 7);
      }
    }
    Bu.RequestType7 = h4a;
    class g4a extends Ax {
      constructor(e) {
        super(e, 8);
      }
    }
    Bu.RequestType8 = g4a;
    class y4a extends Ax {
      constructor(e) {
        super(e, 9);
      }
    }
    Bu.RequestType9 = y4a;
    class _4a extends Ax {
      constructor(e, t = L$.auto) {
        super(e, 1);
        this._parameterStructures = t;
      }
      get parameterStructures() {
        return this._parameterStructures;
      }
    }
    Bu.NotificationType = _4a;
    class b4a extends Ax {
      constructor(e) {
        super(e, 0);
      }
    }
    Bu.NotificationType0 = b4a;
    class S4a extends Ax {
      constructor(e, t = L$.auto) {
        super(e, 1);
        this._parameterStructures = t;
      }
      get parameterStructures() {
        return this._parameterStructures;
      }
    }
    Bu.NotificationType1 = S4a;
    class T4a extends Ax {
      constructor(e) {
        super(e, 2);
      }
    }
    Bu.NotificationType2 = T4a;
    class E4a extends Ax {
      constructor(e) {
        super(e, 3);
      }
    }
    Bu.NotificationType3 = E4a;
    class v4a extends Ax {
      constructor(e) {
        super(e, 4);
      }
    }
    Bu.NotificationType4 = v4a;
    class w4a extends Ax {
      constructor(e) {
        super(e, 5);
      }
    }
    Bu.NotificationType5 = w4a;
    class C4a extends Ax {
      constructor(e) {
        super(e, 6);
      }
    }
    Bu.NotificationType6 = C4a;
    class R4a extends Ax {
      constructor(e) {
        super(e, 7);
      }
    }
    Bu.NotificationType7 = R4a;
    class x4a extends Ax {
      constructor(e) {
        super(e, 8);
      }
    }
    Bu.NotificationType8 = x4a;
    class k4a extends Ax {
      constructor(e) {
        super(e, 9);
      }
    }
    Bu.NotificationType9 = k4a;
    var i4a;
    (function (e) {
      function t(o) {
        let s = o;
        return s && J6e.string(s.method) && (J6e.string(s.id) || J6e.number(s.id));
      }
      e.isRequest = t;
      function n(o) {
        let s = o;
        return s && J6e.string(s.method) && o.id === undefined;
      }
      e.isNotification = n;
      function r(o) {
        let s = o;
        return s && (s.result !== undefined || !!s.error) && (J6e.string(s.id) || J6e.number(s.id) || s.id === null);
      }
      e.isResponse = r;
    })(i4a || (Bu.Message = i4a = {}));
  });
  var aEo = __commonJS(_Ne => {
    var A4a;
    Object.defineProperty(_Ne, "__esModule", {
      value: true
    });
    _Ne.LRUCache = _Ne.LinkedMap = _Ne.Touch = undefined;
    var F$;
    (function (e) {
      e.None = 0;
      e.First = 1;
      e.AsOld = e.First;
      e.Last = 2;
      e.AsNew = e.Last;
    })(F$ || (_Ne.Touch = F$ = {}));
    class iEo {
      constructor() {
        this[A4a] = "LinkedMap";
        this._map = new Map();
        this._head = undefined;
        this._tail = undefined;
        this._size = 0;
        this._state = 0;
      }
      clear() {
        this._map.clear();
        this._head = undefined;
        this._tail = undefined;
        this._size = 0;
        this._state++;
      }
      isEmpty() {
        return !this._head && !this._tail;
      }
      get size() {
        return this._size;
      }
      get first() {
        return this._head?.value;
      }
      get last() {
        return this._tail?.value;
      }
      vZc(e) {
        return this._map.vZc(e);
      }
      get(e, t = F$.None) {
        let n = this._map.get(e);
        if (!n) {
          return;
        }
        if (t !== F$.None) {
          this.touch(n, t);
        }
        return n.value;
      }
      set(e, t, n = F$.None) {
        let r = this._map.get(e);
        if (r) {
          if (r.value = t, n !== F$.None) {
            this.touch(r, n);
          }
        } else {
          switch (r = {
            key: e,
            value: t,
            next: undefined,
            previous: undefined
          }, n) {
            case F$.None:
              this.addItemLast(r);
              break;
            case F$.First:
              this.addItemFirst(r);
              break;
            case F$.Last:
              this.addItemLast(r);
              break;
            default:
              this.addItemLast(r);
              break;
          }
          this._map.set(e, r);
          this._size++;
        }
        return this;
      }
      delete(e) {
        return !!this.remove(e);
      }
      remove(e) {
        let t = this._map.get(e);
        if (!t) {
          return;
        }
        this._map.delete(e);
        this.removeItem(t);
        this._size--;
        return t.value;
      }
      shift() {
        if (!this._head && !this._tail) {
          return;
        }
        if (!this._head || !this._tail) {
          throw Error("Invalid list");
        }
        let e = this._head;
        this._map.delete(e.key);
        this.removeItem(e);
        this._size--;
        return e.value;
      }
      forEach(e, t) {
        let n = this._state;
        let r = this._head;
        while (r) {
          if (t) {
            e.bind(t)(r.value, r.key, this);
          } else {
            e(r.value, r.key, this);
          }
          if (this._state !== n) {
            throw Error("LinkedMap got modified during iteration.");
          }
          r = r.next;
        }
      }
      keys() {
        let e = this._state;
        let t = this._head;
        let n = {
          [Symbol.iterator]: () => n,
          next: () => {
            if (this._state !== e) {
              throw Error("LinkedMap got modified during iteration.");
            }
            if (t) {
              let r = {
                value: t.key,
                done: false
              };
              t = t.next;
              return r;
            } else {
              return {
                value: undefined,
                done: true
              };
            }
          }
        };
        return n;
      }
      values() {
        let e = this._state;
        let t = this._head;
        let n = {
          [Symbol.iterator]: () => n,
          next: () => {
            if (this._state !== e) {
              throw Error("LinkedMap got modified during iteration.");
            }
            if (t) {
              let r = {
                value: t.value,
                done: false
              };
              t = t.next;
              return r;
            } else {
              return {
                value: undefined,
                done: true
              };
            }
          }
        };
        return n;
      }
      entries() {
        let e = this._state;
        let t = this._head;
        let n = {
          [Symbol.iterator]: () => n,
          next: () => {
            if (this._state !== e) {
              throw Error("LinkedMap got modified during iteration.");
            }
            if (t) {
              let r = {
                value: [t.key, t.value],
                done: false
              };
              t = t.next;
              return r;
            } else {
              return {
                value: undefined,
                done: true
              };
            }
          }
        };
        return n;
      }
      [(A4a = Symbol.toStringTag, Symbol.iterator)]() {
        return this.entries();
      }
      trimOld(e) {
        if (e >= this.size) {
          return;
        }
        if (e === 0) {
          this.clear();
          return;
        }
        let t = this._head;
        let n = this.size;
        while (t && n > e) {
          this._map.delete(t.key);
          t = t.next;
          n--;
        }
        if (this._head = t, this._size = n, t) {
          t.previous = undefined;
        }
        this._state++;
      }
      addItemFirst(e) {
        if (!this._head && !this._tail) {
          this._tail = e;
        } else if (!this._head) {
          throw Error("Invalid list");
        } else {
          e.next = this._head;
          this._head.previous = e;
        }
        this._head = e;
        this._state++;
      }
      addItemLast(e) {
        if (!this._head && !this._tail) {
          this._head = e;
        } else if (!this._tail) {
          throw Error("Invalid list");
        } else {
          e.previous = this._tail;
          this._tail.next = e;
        }
        this._tail = e;
        this._state++;
      }
      removeItem(e) {
        if (e === this._head && e === this._tail) {
          this._head = undefined;
          this._tail = undefined;
        } else if (e === this._head) {
          if (!e.next) {
            throw Error("Invalid list");
          }
          e.next.previous = undefined;
          this._head = e.next;
        } else if (e === this._tail) {
          if (!e.previous) {
            throw Error("Invalid list");
          }
          e.previous.next = undefined;
          this._tail = e.previous;
        } else {
          let {
            next: t,
            previous: n
          } = e;
          if (!t || !n) {
            throw Error("Invalid list");
          }
          t.previous = n;
          n.next = t;
        }
        e.next = undefined;
        e.previous = undefined;
        this._state++;
      }
      touch(e, t) {
        if (!this._head || !this._tail) {
          throw Error("Invalid list");
        }
        if (t !== F$.First && t !== F$.Last) {
          return;
        }
        if (t === F$.First) {
          if (e === this._head) {
            return;
          }
          let {
            next: n,
            previous: r
          } = e;
          if (e === this._tail) {
            r.next = undefined;
            this._tail = r;
          } else {
            n.previous = r;
            r.next = n;
          }
          e.previous = undefined;
          e.next = this._head;
          this._head.previous = e;
          this._head = e;
          this._state++;
        } else if (t === F$.Last) {
          if (e === this._tail) {
            return;
          }
          let {
            next: n,
            previous: r
          } = e;
          if (e === this._head) {
            n.previous = undefined;
            this._head = n;
          } else {
            n.previous = r;
            r.next = n;
          }
          e.next = undefined;
          e.previous = this._tail;
          this._tail.next = e;
          this._tail = e;
          this._state++;
        }
      }
      toJSON() {
        let e = [];
        this.forEach((t, n) => {
          e.push([n, t]);
        });
        return e;
      }
      fromJSON(e) {
        this.clear();
        for (let [t, n] of e) {
          this.set(t, n);
        }
      }
    }
    _Ne.LinkedMap = iEo;
    class I4a extends iEo {
      constructor(e, t = 1) {
        super();
        this._limit = e;
        this._ratio = Math.min(Math.max(0, t), 1);
      }
      get limit() {
        return this._limit;
      }
      set limit(e) {
        this._limit = e;
        this.checkTrim();
      }
      get ratio() {
        return this._ratio;
      }
      set ratio(e) {
        this._ratio = Math.min(Math.max(0, e), 1);
        this.checkTrim();
      }
      get(e, t = F$.AsNew) {
        return super.get(e, t);
      }
      peek(e) {
        return super.get(e, F$.None);
      }
      set(e, t) {
        super.set(e, t, F$.Last);
        this.checkTrim();
        return this;
      }
      checkTrim() {
        if (this.size > this._limit) {
          this.trimOld(Math.round(this._limit * this._ratio));
        }
      }
    }
    _Ne.LRUCache = I4a;
  });
  var O4a = __commonJS(FGn => {
    Object.defineProperty(FGn, "__esModule", {
      value: true
    });
    FGn.Disposable = undefined;
    var P4a;
    (function (e) {
      function t(n) {
        return {
          dispose: n
        };
      }
      e.create = t;
    })(P4a || (FGn.Disposable = P4a = {}));
  });
  var bNe = __commonJS(uEo => {
    Object.defineProperty(uEo, "__esModule", {
      value: true
    });
    var lEo;
    function cEo() {
      if (lEo === undefined) {
        throw Error("No runtime abstraction layer installed");
      }
      return lEo;
    }
    (function (e) {
      function t(n) {
        if (n === undefined) {
          throw Error("No runtime abstraction layer provided");
        }
        lEo = n;
      }
      e.install = t;
    })(cEo || (cEo = {}));
    uEo.default = cEo;
  });
  var Tht = __commonJS(Sht => {
    Object.defineProperty(Sht, "__esModule", {
      value: true
    });
    Sht.Emitter = Sht.Event = undefined;
    var e4p = bNe();
    var D4a;
    (function (e) {
      let t = {
        dispose() {}
      };
      e.None = function () {
        return t;
      };
    })(D4a || (Sht.Event = D4a = {}));
    class M4a {
      add(e, t = null, n) {
        if (!this._callbacks) {
          this._callbacks = [];
          this._contexts = [];
        }
        if (this._callbacks.push(e), this._contexts.push(t), Array.isArray(n)) {
          n.push({
            dispose: () => this.remove(e, t)
          });
        }
      }
      remove(e, t = null) {
        if (!this._callbacks) {
          return;
        }
        let n = false;
        for (let r = 0, o = this._callbacks.length; r < o; r++) {
          if (this._callbacks[r] === e) {
            if (this._contexts[r] === t) {
              this._callbacks.splice(r, 1);
              this._contexts.splice(r, 1);
              return;
            } else {
              n = true;
            }
          }
        }
        if (n) {
          throw Error("When adding a listener with a context, you should remove it with the same context");
        }
      }
      invoke(...e) {
        if (!this._callbacks) {
          return [];
        }
        let t = [];
        let n = this._callbacks.slice(0);
        let r = this._contexts.slice(0);
        for (let o = 0, s = n.length; o < s; o++) {
          try {
            t.push(n[o].apply(r[o], e));
          } catch (i) {
            (0, e4p.default)().console.error(i);
          }
        }
        return t;
      }
      isEmpty() {
        return !this._callbacks || this._callbacks.length === 0;
      }
      dispose() {
        this._callbacks = undefined;
        this._contexts = undefined;
      }
    }
    class UGn {
      constructor(e) {
        this._options = e;
      }
      get event() {
        if (!this._event) {
          this._event = (e, t, n) => {
            if (!this._callbacks) {
              this._callbacks = new M4a();
            }
            if (this._options && this._options.onFirstListenerAdd && this._callbacks.isEmpty()) {
              this._options.onFirstListenerAdd(this);
            }
            this._callbacks.add(e, t);
            let r = {
              dispose: () => {
                if (!this._callbacks) {
                  return;
                }
                if (this._callbacks.remove(e, t), r.dispose = UGn._noop, this._options && this._options.onLastListenerRemove && this._callbacks.isEmpty()) {
                  this._options.onLastListenerRemove(this);
                }
              }
            };
            if (Array.isArray(n)) {
              n.push(r);
            }
            return r;
          };
        }
        return this._event;
      }
      fire(e) {
        if (this._callbacks) {
          this._callbacks.invoke.call(this._callbacks, e);
        }
      }
      dispose() {
        if (this._callbacks) {
          this._callbacks.dispose();
          this._callbacks = undefined;
        }
      }
    }
    Sht.Emitter = UGn;
    UGn._noop = function () {};
  });