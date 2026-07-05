  __export(Uzr, {
    default: () => AnthropicAws,
    BaseAnthropic: () => BaseAnthropic,
    AnthropicAws: () => AnthropicAws
  });
  var Bzr = __lazy(() => {
    Fzr();
    Fzr();
  });
  var $zr = __commonJS((a8g, i0i) => {
    var r0n = Object.prototype.hasOwnProperty;
    var s0i = Object.prototype.toString;
    var ZAi = Object.defineProperty;
    var e0i = Object.getOwnPropertyDescriptor;
    var t0i = function (t) {
      if (typeof Array.isArray === "function") {
        return Array.isArray(t);
      }
      return s0i.call(t) === "[object Array]";
    };
    var n0i = function (t) {
      if (!t || s0i.call(t) !== "[object Object]") {
        return false;
      }
      var n = r0n.call(t, "constructor");
      var r = t.constructor && t.constructor.prototype && r0n.call(t.constructor.prototype, "isPrototypeOf");
      if (t.constructor && !n && !r) {
        return false;
      }
      var o;
      for (o in t) {
        ;
      }
      return typeof o > "u" || r0n.call(t, o);
    };
    var r0i = function (t, n) {
      if (ZAi && n.name === "__proto__") {
        ZAi(t, n.name, {
          enumerable: true,
          configurable: true,
          value: n.newValue,
          writable: true
        });
      } else {
        t[n.name] = n.newValue;
      }
    };
    var o0i = function (t, n) {
      if (n === "__proto__") {
        if (!r0n.call(t, n)) {
          return;
        } else if (e0i) {
          return e0i(t, n).value;
        }
      }
      return t[n];
    };
    i0i.exports = function e() {
      var t;
      var n;
      var r;
      var o;
      var s;
      var i;
      var a = arguments[0];
      var l = 1;
      var c = arguments.length;
      var u = false;
      if (typeof a === "boolean") {
        u = a;
        a = arguments[1] || {};
        l = 2;
      }
      if (a == null || typeof a !== "object" && typeof a !== "function") {
        a = {};
      }
      for (; l < c; ++l) {
        if (t = arguments[l], t != null) {
          for (n in t) {
            if (r = o0i(a, n), o = o0i(t, n), a !== o) {
              if (u && o && (n0i(o) || (s = t0i(o)))) {
                if (s) {
                  s = false;
                  i = r && t0i(r) ? r : [];
                } else {
                  i = r && n0i(r) ? r : {};
                }
                r0i(a, {
                  name: n,
                  newValue: e(u, i, o)
                });
              } else if (typeof o < "u") {
                r0i(a, {
                  name: n,
                  newValue: o
                });
              }
            }
          }
        }
      }
      return a;
    };
  });