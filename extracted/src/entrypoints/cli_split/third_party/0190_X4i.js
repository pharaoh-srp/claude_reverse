  var X4i = __commonJS(Em => {
    var cZr = Symbol.for("react.transitional.element");
    var S5d = Symbol.for("react.portal");
    var T5d = Symbol.for("react.fragment");
    var E5d = Symbol.for("react.strict_mode");
    var v5d = Symbol.for("react.profiler");
    var w5d = Symbol.for("react.consumer");
    var C5d = Symbol.for("react.context");
    var R5d = Symbol.for("react.forward_ref");
    var x5d = Symbol.for("react.suspense");
    var k5d = Symbol.for("react.memo");
    var G4i = Symbol.for("react.lazy");
    var A5d = Symbol.for("react.activity");
    var H4i = Symbol.iterator;
    function I5d(e) {
      if (e === null || typeof e !== "object") {
        return null;
      }
      e = H4i && e[H4i] || e["@@iterator"];
      return typeof e === "function" ? e : null;
    }
    var V4i = {
      isMounted: function () {
        return false;
      },
      enqueueForceUpdate: function () {},
      enqueueReplaceState: function () {},
      enqueueSetState: function () {}
    };
    var z4i = Object.assign;
    var K4i = {};
    function Tlt(e, t, n) {
      this.props = e;
      this.context = t;
      this.refs = K4i;
      this.updater = n || V4i;
    }
    Tlt.prototype.isReactComponent = {};
    Tlt.prototype.setState = function (e, t) {
      if (typeof e !== "object" && typeof e !== "function" && e != null) {
        throw Error("takes an object of state variables to update or a function which returns an object of state variables.");
      }
      this.updater.enqueueSetState(this, e, t, "setState");
    };
    Tlt.prototype.forceUpdate = function (e) {
      this.updater.enqueueForceUpdate(this, e, "forceUpdate");
    };
    function Y4i() {}
    Y4i.prototype = Tlt.prototype;
    function uZr(e, t, n) {
      this.props = e;
      this.context = t;
      this.refs = K4i;
      this.updater = n || V4i;
    }
    var dZr = uZr.prototype = new Y4i();
    dZr.constructor = uZr;
    z4i(dZr, Tlt.prototype);
    dZr.isPureReactComponent = true;
    var j4i = Array.isArray;
    function lZr() {}
    var $C = {
      H: null,
      A: null,
      T: null,
      S: null
    };
    var J4i = Object.prototype.hasOwnProperty;
    function pZr(e, t, n) {
      var r = n.ref;
      return {
        $$typeof: cZr,
        type: e,
        key: t,
        ref: r !== undefined ? r : null,
        props: n
      };
    }
    function P5d(e, t) {
      return pZr(e.type, t, e.props);
    }
    function mZr(e) {
      return typeof e === "object" && e !== null && e.$$typeof === cZr;
    }
    function O5d(e) {
      var t = {
        "=": "=0",
        ":": "=2"
      };
      return "$" + e.replace(/[=:]/g, function (n) {
        return t[n];
      });
    }
    function aZr(e, t) {
      return typeof e === "object" && e !== null && e.key != null ? O5d("" + e.key) : t.toString(36);
    }
    function D5d(e) {
      switch (e.status) {
        case "fulfilled":
          return e.value;
        case "rejected":
          throw e.reason;
        default:
          switch (typeof e.status === "string" ? e.then(lZr, lZr) : (e.status = "pending", e.then(function (t) {
            e.status === "pending" && (e.status = "fulfilled", e.value = t);
          }, function (t) {
            e.status === "pending" && (e.status = "rejected", e.reason = t);
          })), e.status) {
            case "fulfilled":
              return e.value;
            case "rejected":
              throw e.reason;
          }
      }
      throw e;
    }
    function Slt(e, t, n, r, o) {
      var s = typeof e;
      if (s === "undefined" || s === "boolean") {
        e = null;
      }
      var i = false;
      if (e === null) {
        i = true;
      } else {
        switch (s) {
          case "bigint":
          case "string":
          case "number":
            i = true;
            break;
          case "object":
            switch (e.$$typeof) {
              case cZr:
              case S5d:
                i = true;
                break;
              case G4i:
                i = e._init;
                return Slt(i(e._payload), t, n, r, o);
            }
        }
      }
      if (i) {
        o = o(e);
        i = r === "" ? "." + aZr(e, 0) : r;
        j4i(o) ? (n = "", i != null && (n = i.replace(/\/+/g, "$&/") + "/"), Slt(o, t, n, "", function (c) {
          return c;
        })) : o != null && (mZr(o) && (o = P5d(o, n + (o.key == null || e && e.key === o.key ? "" : ("" + o.key).replace(/\/+/g, "$&/") + "/") + i)), t.push(o));
        return 1;
      }
      i = 0;
      var a = r === "" ? "." : r + ":";
      if (j4i(e)) {
        for (var l = 0; l < e.length; l++) {
          r = e[l];
          s = a + aZr(r, l);
          i += Slt(r, t, n, s, o);
        }
      } else if (l = I5d(e), typeof l === "function") {
        for (e = l.call(e), l = 0; !(r = e.next()).done;) {
          r = r.value;
          s = a + aZr(r, l++);
          i += Slt(r, t, n, s, o);
        }
      } else if (s === "object") {
        if (typeof e.then === "function") {
          return Slt(D5d(e), t, n, r, o);
        }
        throw t = String(e), Error("Objects are not valid as a React child (found: " + (t === "[object Object]" ? "object with keys {" + Object.keys(e).join(", ") + "}" : t) + "). If you meant to render a collection of children, use an array instead.");
      }
      return i;
    }
    function iMn(e, t, n) {
      if (e == null) {
        return e;
      }
      var r = [];
      var o = 0;
      Slt(e, r, "", "", function (s) {
        return t.call(n, s, o++);
      });
      return r;
    }
    function M5d(e) {
      if (e._status === -1) {
        var t = e._result;
        t = t();
        t.then(function (n) {
          if (e._status === 0 || e._status === -1) {
            e._status = 1;
            e._result = n;
          }
        }, function (n) {
          if (e._status === 0 || e._status === -1) {
            e._status = 2;
            e._result = n;
          }
        });
        e._status === -1 && (e._status = 0, e._result = t);
      }
      if (e._status === 1) {
        return e._result.default;
      }
      throw e._result;
    }
    var W4i = typeof reportError === "function" ? reportError : function (e) {
      if (typeof window === "object" && typeof window.ErrorEvent === "function") {
        var t = new window.ErrorEvent("error", {
          bubbles: true,
          cancelable: true,
          message: typeof e === "object" && e !== null && typeof e.message === "string" ? String(e.message) : String(e),
          error: e
        });
        if (!window.dispatchEvent(t)) {
          return;
        }
      } else if (typeof process === "object" && typeof process.emit === "function") {
        process.emit("uncaughtException", e);
        return;
      }
      console.error(e);
    };
    var N5d = {
      map: iMn,
      forEach: function (e, t, n) {
        iMn(e, function () {
          t.apply(this, arguments);
        }, n);
      },
      count: function (e) {
        var t = 0;
        iMn(e, function () {
          t++;
        });
        return t;
      },
      toArray: function (e) {
        return iMn(e, function (t) {
          return t;
        }) || [];
      },
      only: function (e) {
        if (!mZr(e)) {
          throw Error("React.Children.only expected to receive a single React element child.");
        }
        return e;
      }
    };
    Em.Activity = A5d;
    Em.Children = N5d;
    Em.Component = Tlt;
    Em.Fragment = T5d;
    Em.Profiler = v5d;
    Em.PureComponent = uZr;
    Em.StrictMode = E5d;
    Em.Suspense = x5d;
    Em.__CLIENT_INTERNALS_DO_NOT_USE_OR_WARN_USERS_THEY_CANNOT_UPGRADE = $C;
    Em.__COMPILER_RUNTIME = {
      __proto__: null,
      c: function (e) {
        return $C.H.useMemoCache(e);
      }
    };
    Em.cache = function (e) {
      return function () {
        return e.apply(null, arguments);
      };
    };
    Em.cacheSignal = function () {
      return null;
    };
    Em.cloneElement = function (e, t, n) {
      if (e === null || e === undefined) {
        throw Error("The argument must be a React element, but you passed " + e + ".");
      }
      var r = z4i({}, e.props);
      var o = e.key;
      if (t != null) {
        for (s in t.key !== undefined && (o = "" + t.key), t) {
          !J4i.call(t, s) || s === "key" || s === "__self" || s === "__source" || s === "ref" && t.ref === undefined || (r[s] = t[s]);
        }
      }
      var s = arguments.length - 2;
      if (s === 1) {
        r.children = n;
      } else if (1 < s) {
        for (var i = Array(s), a = 0; a < s; a++) {
          i[a] = arguments[a + 2];
        }
        r.children = i;
      }
      return pZr(e.type, o, r);
    };
    Em.createContext = function (e) {
      e = {
        $$typeof: C5d,
        _currentValue: e,
        _currentValue2: e,
        _threadCount: 0,
        Provider: null,
        Consumer: null
      };
      e.Provider = e;
      e.Consumer = {
        $$typeof: w5d,
        _context: e
      };
      return e;
    };
    Em.createElement = function (e, t, n) {
      var r;
      var o = {};
      var s = null;
      if (t != null) {
        for (r in t.key !== undefined && (s = "" + t.key), t) {
          J4i.call(t, r) && r !== "key" && r !== "__self" && r !== "__source" && (o[r] = t[r]);
        }
      }
      var i = arguments.length - 2;
      if (i === 1) {
        o.children = n;
      } else if (1 < i) {
        for (var a = Array(i), l = 0; l < i; l++) {
          a[l] = arguments[l + 2];
        }
        o.children = a;
      }
      if (e && e.defaultProps) {
        for (r in i = e.defaultProps, i) {
          o[r] === undefined && (o[r] = i[r]);
        }
      }
      return pZr(e, s, o);
    };
    Em.createRef = function () {
      return {
        current: null
      };
    };
    Em.forwardRef = function (e) {
      return {
        $$typeof: R5d,
        render: e
      };
    };
    Em.isValidElement = mZr;
    Em.lazy = function (e) {
      return {
        $$typeof: G4i,
        _payload: {
          _status: -1,
          _result: e
        },
        _init: M5d
      };
    };
    Em.memo = function (e, t) {
      return {
        $$typeof: k5d,
        type: e,
        compare: t === undefined ? null : t
      };
    };
    Em.startTransition = function (e) {
      var t = $C.T;
      var n = {};
      $C.T = n;
      try {
        var r = e();
        var o = $C.S;
        o !== null && o(n, r);
        typeof r === "object" && r !== null && typeof r.then === "function" && r.then(lZr, W4i);
      } catch (s) {
        W4i(s);
      } finally {
        t !== null && n.types !== null && (t.types = n.types);
        $C.T = t;
      }
    };
    Em.unstable_useCacheRefresh = function () {
      return $C.H.useCacheRefresh();
    };
    Em.use = function (e) {
      return $C.H.use(e);
    };
    Em.useActionState = function (e, t, n) {
      return $C.H.useActionState(e, t, n);
    };
    Em.useCallback = function (e, t) {
      return $C.H.useCallback(e, t);
    };
    Em.useContext = function (e) {
      return $C.H.useContext(e);
    };
    Em.useDebugValue = function () {};
    Em.useDeferredValue = function (e, t) {
      return $C.H.useDeferredValue(e, t);
    };
    Em.useEffect = function (e, t) {
      return $C.H.useEffect(e, t);
    };
    Em.useEffectEvent = function (e) {
      return $C.H.useEffectEvent(e);
    };
    Em.useId = function () {
      return $C.H.useId();
    };
    Em.useImperativeHandle = function (e, t, n) {
      return $C.H.useImperativeHandle(e, t, n);
    };
    Em.useInsertionEffect = function (e, t) {
      return $C.H.useInsertionEffect(e, t);
    };
    Em.useLayoutEffect = function (e, t) {
      return $C.H.useLayoutEffect(e, t);
    };
    Em.useMemo = function (e, t) {
      return $C.H.useMemo(e, t);
    };
    Em.useOptimistic = function (e, t) {
      return $C.H.useOptimistic(e, t);
    };
    Em.useReducer = function (e, t, n) {
      return $C.H.useReducer(e, t, n);
    };
    Em.useRef = function (e) {
      return $C.H.useRef(e);
    };
    Em.useState = function (e) {
      return $C.H.useState(e);
    };
    Em.useSyncExternalStore = function (e, t, n) {
      return $C.H.useSyncExternalStore(e, t, n);
    };
    Em.useTransition = function () {
      return $C.H.useTransition();
    };
    Em.version = "19.2.0";
  });
  var ot = __commonJS((Ziy, Q4i) => {
    Q4i.exports = X4i();
  });
  var eWi = __commonJS(Z4i => {
    var L5d = ot().__CLIENT_INTERNALS_DO_NOT_USE_OR_WARN_USERS_THEY_CANNOT_UPGRADE;
    Z4i.c = function (e) {
      return L5d.H.useMemoCache(e);
    };
  });
  var pt = __commonJS((tay, tWi) => {
    tWi.exports = eWi();
  });