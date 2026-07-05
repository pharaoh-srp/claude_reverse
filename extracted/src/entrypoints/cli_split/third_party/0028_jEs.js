  var jEs = __commonJS((Pyh, HEs) => {
    HEs.exports = Math.round;
  });
  var WEs = __commonJS((Oyh, qEs) => {
    qEs.exports = Number.isNaN || function (t) {
      return t !== t;
    };
  });
  var VEs = __commonJS((Dyh, GEs) => {
    var Qku = WEs();
    GEs.exports = function (t) {
      if (Qku(t) || t === 0) {
        return t;
      }
      return t < 0 ? -1 : 1;
    };
  });
  var KEs = __commonJS((Myh, zEs) => {
    zEs.exports = Object.getOwnPropertyDescriptor;
  });
  var WOr = __commonJS((Nyh, YEs) => {
    var Qfn = KEs();
    if (Qfn) {
      try {
        Qfn([], "length");
      } catch (e) {
        Qfn = null;
      }
    }
    YEs.exports = Qfn;
  });
  var XEs = __commonJS((Lyh, JEs) => {
    var Zfn = Object.defineProperty || false;
    if (Zfn) {
      try {
        Zfn({}, "a", {
          value: 1
        });
      } catch (e) {
        Zfn = false;
      }
    }
    JEs.exports = Zfn;
  });
  var GOr = __commonJS((Fyh, QEs) => {
    QEs.exports = function () {
      if (typeof Symbol !== "function" || typeof Object.getOwnPropertySymbols !== "function") {
        return false;
      }
      if (typeof Symbol.iterator === "symbol") {
        return true;
      }
      var t = {};
      var n = Symbol("test");
      var r = Object(n);
      if (typeof n === "string") {
        return false;
      }
      if (Object.prototype.toString.call(n) !== "[object Symbol]") {
        return false;
      }
      if (Object.prototype.toString.call(r) !== "[object Symbol]") {
        return false;
      }
      var o = 42;
      t[n] = o;
      for (var s in t) {
        return false;
      }
      if (typeof Object.keys === "function" && Object.keys(t).length !== 0) {
        return false;
      }
      if (typeof Object.getOwnPropertyNames === "function" && Object.getOwnPropertyNames(t).length !== 0) {
        return false;
      }
      var i = Object.getOwnPropertySymbols(t);
      if (i.length !== 1 || i[0] !== n) {
        return false;
      }
      if (!Object.prototype.propertyIsEnumerable.call(t, n)) {
        return false;
      }
      if (typeof Object.getOwnPropertyDescriptor === "function") {
        var a = Object.getOwnPropertyDescriptor(t, n);
        if (a.value !== o || a.enumerable !== true) {
          return false;
        }
      }
      return true;
    };
  });
  var tvs = __commonJS((Uyh, evs) => {
    var ZEs = typeof Symbol < "u" && Symbol;
    var Zku = GOr();
    evs.exports = function () {
      if (typeof ZEs !== "function") {
        return false;
      }
      if (typeof Symbol !== "function") {
        return false;
      }
      if (typeof ZEs("foo") !== "symbol") {
        return false;
      }
      if (typeof Symbol("bar") !== "symbol") {
        return false;
      }
      return Zku();
    };
  });
  var VOr = __commonJS((Byh, nvs) => {
    nvs.exports = typeof Reflect < "u" && Reflect.getPrototypeOf || null;
  });
  var zOr = __commonJS(($yh, rvs) => {
    var eAu = qOr();
    rvs.exports = eAu.getPrototypeOf || null;
  });
  var ivs = __commonJS((Hyh, svs) => {
    var nAu = Object.prototype.toString;
    var rAu = Math.max;
    var ovs = function (t, n) {
      var r = [];
      for (var o = 0; o < t.length; o += 1) {
        r[o] = t[o];
      }
      for (var s = 0; s < n.length; s += 1) {
        r[s + t.length] = n[s];
      }
      return r;
    };
    var sAu = function (t, n) {
      var r = [];
      for (var o = n || 0, s = 0; o < t.length; o += 1, s += 1) {
        r[s] = t[o];
      }
      return r;
    };
    var iAu = function (e, t) {
      var n = "";
      for (var r = 0; r < e.length; r += 1) {
        if (n += e[r], r + 1 < e.length) {
          n += t;
        }
      }
      return n;
    };
    svs.exports = function (t) {
      var n = this;
      if (typeof n !== "function" || nAu.apply(n) !== "[object Function]") {
        throw TypeError("Function.prototype.bind called on incompatible " + n);
      }
      var r = sAu(arguments, 1);
      var o;
      var s = function () {
        if (this instanceof o) {
          var u = n.apply(this, ovs(r, arguments));
          if (Object(u) === u) {
            return u;
          }
          return this;
        }
        return n.apply(t, ovs(r, arguments));
      };
      var i = rAu(0, n.length - r.length);
      var a = [];
      for (var l = 0; l < i; l++) {
        a[l] = "$" + l;
      }
      if (o = Function("binder", "return function (" + iAu(a, ",") + "){ return binder.apply(this,arguments); }")(s), n.prototype) {
        var c = function () {};
        c.prototype = n.prototype;
        o.prototype = new c();
        c.prototype = null;
      }
      return o;
    };
  });
  var Itt = __commonJS((jyh, avs) => {
    var aAu = ivs();
    avs.exports = Function.prototype.bind || aAu;
  });
  var ehn = __commonJS((qyh, lvs) => {
    lvs.exports = Function.prototype.call;
  });
  var KOr = __commonJS((Wyh, cvs) => {
    cvs.exports = Function.prototype.apply;
  });
  var dvs = __commonJS((Gyh, uvs) => {
    uvs.exports = typeof Reflect < "u" && Reflect && Reflect.apply;
  });
  var mvs = __commonJS((Vyh, pvs) => {
    var lAu = Itt();
    var cAu = KOr();
    var uAu = ehn();
    var dAu = dvs();
    pvs.exports = dAu || lAu.call(uAu, cAu);
  });
  var hvs = __commonJS((zyh, fvs) => {
    var pAu = Itt();
    var mAu = Xfn();
    var fAu = ehn();
    var hAu = mvs();
    fvs.exports = function (t) {
      if (t.length < 1 || typeof t[0] !== "function") {
        throw new mAu("a function is required");
      }
      return hAu(pAu, fAu, t);
    };
  });
  var Tvs = __commonJS((Kyh, Svs) => {
    var gAu = hvs();
    var gvs = WOr();
    var _vs;
    try {
      _vs = [].__proto__ === Array.prototype;
    } catch (e) {
      if (!e || typeof e !== "object" || !("code" in e) || e.code !== "ERR_PROTO_ACCESS") {
        throw e;
      }
    }
    var YOr = !!_vs && gvs && gvs(Object.prototype, "__proto__");
    var bvs = Object;
    var yvs = bvs.getPrototypeOf;
    Svs.exports = YOr && typeof YOr.get === "function" ? gAu([YOr.get]) : typeof yvs === "function" ? function (t) {
      return yvs(t == null ? t : bvs(t));
    } : false;
  });
  var Rvs = __commonJS((Yyh, Cvs) => {
    var Evs = VOr();
    var vvs = zOr();
    var wvs = Tvs();
    Cvs.exports = Evs ? function (t) {
      return Evs(t);
    } : vvs ? function (t) {
      if (!t || typeof t !== "object" && typeof t !== "function") {
        throw TypeError("getProto: not an object");
      }
      return vvs(t);
    } : wvs ? function (t) {
      return wvs(t);
    } : null;
  });
  var JOr = __commonJS((Jyh, xvs) => {
    var yAu = Function.prototype.call;
    var _Au = Object.prototype.hasOwnProperty;
    var bAu = Itt();
    xvs.exports = bAu.call(yAu, _Au);
  });
  var Dvs = __commonJS((Xyh, Ovs) => {
    var Mh;
    var SAu = qOr();
    var TAu = bEs();
    var EAu = TEs();
    var vAu = vEs();
    var wAu = CEs();
    var Mtt = xEs();
    var Dtt = Xfn();
    var CAu = IEs();
    var RAu = OEs();
    var xAu = MEs();
    var kAu = LEs();
    var AAu = UEs();
    var IAu = $Es();
    var PAu = jEs();
    var OAu = VEs();
    var Ivs = Function;
    var XOr = function (e) {
      try {
        return Ivs('"use strict"; return (' + e + ").constructor;")();
      } catch (t) {}
    };
    var aDt = WOr();
    var DAu = XEs();
    var QOr = function () {
      throw new Dtt();
    };
    var MAu = aDt ? function () {
      try {
        arguments.callee;
        return QOr;
      } catch (e) {
        try {
          return aDt(arguments, "callee").get;
        } catch (t) {
          return QOr;
        }
      }
    }() : QOr;
    var Ptt = tvs()();
    var PN = Rvs();
    var NAu = zOr();
    var LAu = VOr();
    var Pvs = KOr();
    var lDt = ehn();
    var Ott = {};
    var FAu = typeof Uint8Array > "u" || !PN ? Mh : PN(Uint8Array);
    var NHe = {
      __proto__: null,
      "%AggregateError%": typeof AggregateError > "u" ? Mh : AggregateError,
      "%Array%": Array,
      "%ArrayBuffer%": typeof ArrayBuffer > "u" ? Mh : ArrayBuffer,
      "%ArrayIteratorPrototype%": Ptt && PN ? PN([][Symbol.iterator]()) : Mh,
      "%AsyncFromSyncIteratorPrototype%": Mh,
      "%AsyncFunction%": Ott,
      "%AsyncGenerator%": Ott,
      "%AsyncGeneratorFunction%": Ott,
      "%AsyncIteratorPrototype%": Ott,
      "%Atomics%": typeof Atomics > "u" ? Mh : Atomics,
      "%BigInt%": typeof BigInt > "u" ? Mh : BigInt,
      "%BigInt64Array%": typeof BigInt64Array > "u" ? Mh : BigInt64Array,
      "%BigUint64Array%": typeof BigUint64Array > "u" ? Mh : BigUint64Array,
      "%Boolean%": Boolean,
      "%DataView%": typeof DataView > "u" ? Mh : DataView,
      "%Date%": Date,
      "%decodeURI%": decodeURI,
      "%decodeURIComponent%": decodeURIComponent,
      "%encodeURI%": encodeURI,
      "%encodeURIComponent%": encodeURIComponent,
      "%Error%": TAu,
      "%eval%": eval,
      "%EvalError%": EAu,
      "%Float16Array%": typeof Float16Array > "u" ? Mh : Float16Array,
      "%Float32Array%": typeof Float32Array > "u" ? Mh : Float32Array,
      "%Float64Array%": typeof Float64Array > "u" ? Mh : Float64Array,
      "%FinalizationRegistry%": typeof FinalizationRegistry > "u" ? Mh : FinalizationRegistry,
      "%Function%": Ivs,
      "%GeneratorFunction%": Ott,
      "%Int8Array%": typeof Int8Array > "u" ? Mh : Int8Array,
      "%Int16Array%": typeof Int16Array > "u" ? Mh : Int16Array,
      "%Int32Array%": typeof Int32Array > "u" ? Mh : Int32Array,
      "%isFinite%": isFinite,
      "%isNaN%": isNaN,
      "%IteratorPrototype%": Ptt && PN ? PN(PN([][Symbol.iterator]())) : Mh,
      "%JSON%": typeof JSON === "object" ? JSON : Mh,
      "%Map%": typeof Map > "u" ? Mh : Map,
      "%MapIteratorPrototype%": typeof Map > "u" || !Ptt || !PN ? Mh : PN(new Map()[Symbol.iterator]()),
      "%Math%": Math,
      "%Number%": Number,
      "%Object%": SAu,
      "%Object.getOwnPropertyDescriptor%": aDt,
      "%parseFloat%": parseFloat,
      "%parseInt%": parseInt,
      "%Promise%": typeof Promise > "u" ? Mh : Promise,
      "%Proxy%": typeof Proxy > "u" ? Mh : Proxy,
      "%RangeError%": vAu,
      "%ReferenceError%": wAu,
      "%Reflect%": typeof Reflect > "u" ? Mh : Reflect,
      "%RegExp%": RegExp,
      "%Set%": typeof Set > "u" ? Mh : Set,
      "%SetIteratorPrototype%": typeof Set > "u" || !Ptt || !PN ? Mh : PN(new Set()[Symbol.iterator]()),
      "%SharedArrayBuffer%": typeof SharedArrayBuffer > "u" ? Mh : SharedArrayBuffer,
      "%String%": String,
      "%StringIteratorPrototype%": Ptt && PN ? PN(""[Symbol.iterator]()) : Mh,
      "%Symbol%": Ptt ? Symbol : Mh,
      "%SyntaxError%": Mtt,
      "%ThrowTypeError%": MAu,
      "%TypedArray%": FAu,
      "%TypeError%": Dtt,
      "%Uint8Array%": typeof Uint8Array > "u" ? Mh : Uint8Array,
      "%Uint8ClampedArray%": typeof Uint8ClampedArray > "u" ? Mh : Uint8ClampedArray,
      "%Uint16Array%": typeof Uint16Array > "u" ? Mh : Uint16Array,
      "%Uint32Array%": typeof Uint32Array > "u" ? Mh : Uint32Array,
      "%URIError%": CAu,
      "%WeakMap%": typeof WeakMap > "u" ? Mh : WeakMap,
      "%WeakRef%": typeof WeakRef > "u" ? Mh : WeakRef,
      "%WeakSet%": typeof WeakSet > "u" ? Mh : WeakSet,
      "%Function.prototype.call%": lDt,
      "%Function.prototype.apply%": Pvs,
      "%Object.defineProperty%": DAu,
      "%Object.getPrototypeOf%": NAu,
      "%Math.abs%": RAu,
      "%Math.floor%": xAu,
      "%Math.max%": kAu,
      "%Math.min%": AAu,
      "%Math.pow%": IAu,
      "%Math.round%": PAu,
      "%Math.sign%": OAu,
      "%Reflect.getPrototypeOf%": LAu
    };
    if (PN) {
      try {
        null.error;
      } catch (e) {
        ZOr = PN(PN(e));
        NHe["%Error.prototype%"] = ZOr;
      }
    }
    var ZOr;
    var UAu = function e(t) {
      var n;
      if (t === "%AsyncFunction%") {
        n = XOr("async function () {}");
      } else if (t === "%GeneratorFunction%") {
        n = XOr("function* () {}");
      } else if (t === "%AsyncGeneratorFunction%") {
        n = XOr("async function* () {}");
      } else if (t === "%AsyncGenerator%") {
        var r = e("%AsyncGeneratorFunction%");
        if (r) {
          n = r.prototype;
        }
      } else if (t === "%AsyncIteratorPrototype%") {
        var o = e("%AsyncGenerator%");
        if (o && PN) {
          n = PN(o.prototype);
        }
      }
      NHe[t] = n;
      return n;
    };
    var kvs = {
      __proto__: null,
      "%ArrayBufferPrototype%": ["ArrayBuffer", "prototype"],
      "%ArrayPrototype%": ["Array", "prototype"],
      "%ArrayProto_entries%": ["Array", "prototype", "entries"],
      "%ArrayProto_forEach%": ["Array", "prototype", "forEach"],
      "%ArrayProto_keys%": ["Array", "prototype", "keys"],
      "%ArrayProto_values%": ["Array", "prototype", "values"],
      "%AsyncFunctionPrototype%": ["AsyncFunction", "prototype"],
      "%AsyncGenerator%": ["AsyncGeneratorFunction", "prototype"],
      "%AsyncGeneratorPrototype%": ["AsyncGeneratorFunction", "prototype", "prototype"],
      "%BooleanPrototype%": ["Boolean", "prototype"],
      "%DataViewPrototype%": ["DataView", "prototype"],
      "%DatePrototype%": ["Date", "prototype"],
      "%ErrorPrototype%": ["Error", "prototype"],
      "%EvalErrorPrototype%": ["EvalError", "prototype"],
      "%Float32ArrayPrototype%": ["Float32Array", "prototype"],
      "%Float64ArrayPrototype%": ["Float64Array", "prototype"],
      "%FunctionPrototype%": ["Function", "prototype"],
      "%Generator%": ["GeneratorFunction", "prototype"],
      "%GeneratorPrototype%": ["GeneratorFunction", "prototype", "prototype"],
      "%Int8ArrayPrototype%": ["Int8Array", "prototype"],
      "%Int16ArrayPrototype%": ["Int16Array", "prototype"],
      "%Int32ArrayPrototype%": ["Int32Array", "prototype"],
      "%JSONParse%": ["JSON", "parse"],
      "%JSONStringify%": ["JSON", "stringify"],
      "%MapPrototype%": ["Map", "prototype"],
      "%NumberPrototype%": ["Number", "prototype"],
      "%ObjectPrototype%": ["Object", "prototype"],
      "%ObjProto_toString%": ["Object", "prototype", "toString"],
      "%ObjProto_valueOf%": ["Object", "prototype", "valueOf"],
      "%PromisePrototype%": ["Promise", "prototype"],
      "%PromiseProto_then%": ["Promise", "prototype", "then"],
      "%Promise_all%": ["Promise", "all"],
      "%Promise_reject%": ["Promise", "reject"],
      "%Promise_resolve%": ["Promise", "resolve"],
      "%RangeErrorPrototype%": ["RangeError", "prototype"],
      "%ReferenceErrorPrototype%": ["ReferenceError", "prototype"],
      "%RegExpPrototype%": ["RegExp", "prototype"],
      "%SetPrototype%": ["Set", "prototype"],
      "%SharedArrayBufferPrototype%": ["SharedArrayBuffer", "prototype"],
      "%StringPrototype%": ["String", "prototype"],
      "%SymbolPrototype%": ["Symbol", "prototype"],
      "%SyntaxErrorPrototype%": ["SyntaxError", "prototype"],
      "%TypedArrayPrototype%": ["TypedArray", "prototype"],
      "%TypeErrorPrototype%": ["TypeError", "prototype"],
      "%Uint8ArrayPrototype%": ["Uint8Array", "prototype"],
      "%Uint8ClampedArrayPrototype%": ["Uint8ClampedArray", "prototype"],
      "%Uint16ArrayPrototype%": ["Uint16Array", "prototype"],
      "%Uint32ArrayPrototype%": ["Uint32Array", "prototype"],
      "%URIErrorPrototype%": ["URIError", "prototype"],
      "%WeakMapPrototype%": ["WeakMap", "prototype"],
      "%WeakSetPrototype%": ["WeakSet", "prototype"]
    };
    var cDt = Itt();
    var thn = JOr();
    var BAu = cDt.call(lDt, Array.prototype.concat);
    var $Au = cDt.call(Pvs, Array.prototype.splice);
    var Avs = cDt.call(lDt, String.prototype.replace);
    var nhn = cDt.call(lDt, String.prototype.slice);
    var HAu = cDt.call(lDt, RegExp.prototype.exec);
    var WAu = function (t) {
      var n = nhn(t, 0, 1);
      var r = nhn(t, -1);
      if (n === "%" && r !== "%") {
        throw new Mtt("invalid intrinsic syntax, expected closing `%`");
      } else if (r === "%" && n !== "%") {
        throw new Mtt("invalid intrinsic syntax, expected opening `%`");
      }
      var o = [];
      Avs(t, /[^%.[\]]+|\[(?:(-?\d+(?:\.\d+)?)|(["'])((?:(?!\2)[^\\]|\\.)*?)\2)\]|(?=(?:\.|\[\])(?:\.|\[\]|%$))/g, function (s, i, a, l) {
        o[o.length] = a ? Avs(l, /\\(\\)?/g, "$1") : i || s;
      });
      return o;
    };
    var GAu = function (t, n) {
      var r = t;
      var o;
      if (thn(kvs, r)) {
        o = kvs[r];
        r = "%" + o[0] + "%";
      }
      if (thn(NHe, r)) {
        var s = NHe[r];
        if (s === Ott) {
          s = UAu(r);
        }
        if (typeof s > "u" && !n) {
          throw new Dtt("intrinsic " + t + " exists, but is not available. Please file an issue!");
        }
        return {
          alias: o,
          name: r,
          value: s
        };
      }
      throw new Mtt("intrinsic " + t + " does not exist!");
    };
    Ovs.exports = function (t, n) {
      if (typeof t !== "string" || t.length === 0) {
        throw new Dtt("intrinsic name must be a non-empty string");
      }
      if (arguments.length > 1 && typeof n !== "boolean") {
        throw new Dtt('"allowMissing" argument must be a boolean');
      }
      if (HAu(/^%?[^%]*%?$/, t) === null) {
        throw new Mtt("`%` may not be present anywhere but at the beginning and end of the intrinsic name");
      }
      var r = WAu(t);
      var o = r.length > 0 ? r[0] : "";
      var s = GAu("%" + o + "%", n);
      var i = s.name;
      var a = s.value;
      var l = false;
      var c = s.alias;
      if (c) {
        o = c[0];
        $Au(r, BAu([0, 1], c));
      }
      for (var u = 1, d = true; u < r.length; u += 1) {
        var p = r[u];
        var m = nhn(p, 0, 1);
        var f = nhn(p, -1);
        if ((m === '"' || m === "'" || m === "`" || f === '"' || f === "'" || f === "`") && m !== f) {
          throw new Mtt("property names with quotes must have matching quotes");
        }
        if (p === "constructor" || !d) {
          l = true;
        }
        if (o += "." + p, i = "%" + o + "%", thn(NHe, i)) {
          a = NHe[i];
        } else if (a != null) {
          if (!(p in a)) {
            if (!n) {
              throw new Dtt("base intrinsic for " + t + " exists, but the property is not available.");
            }
            return;
          }
          if (aDt && u + 1 >= r.length) {
            var h = aDt(a, p);
            if (d = !!h, d && "get" in h && !("originalValue" in h.get)) {
              a = h.get;
            } else {
              a = a[p];
            }
          } else {
            d = thn(a, p);
            a = a[p];
          }
          if (d && !l) {
            NHe[i] = a;
          }
        }
      }
      return a;
    };
  });
  var Nvs = __commonJS((Qyh, Mvs) => {
    var VAu = GOr();
    Mvs.exports = function () {
      return VAu() && !!Symbol.toStringTag;
    };
  });
  var Uvs = __commonJS((Zyh, Fvs) => {
    var zAu = Dvs();
    var Lvs = zAu("%Object.defineProperty%", true);
    var KAu = Nvs()();
    var YAu = JOr();
    var JAu = Xfn();
    var rhn = KAu ? Symbol.toStringTag : null;
    Fvs.exports = function (t, n) {
      var r = arguments.length > 2 && !!arguments[2] && arguments[2].force;
      var o = arguments.length > 2 && !!arguments[2] && arguments[2].nonConfigurable;
      if (typeof r < "u" && typeof r !== "boolean" || typeof o < "u" && typeof o !== "boolean") {
        throw new JAu("if provided, the `overrideIfSet` and `nonConfigurable` options must be booleans");
      }
      if (rhn && (r || !YAu(t, rhn))) {
        if (Lvs) {
          Lvs(t, rhn, {
            configurable: !o,
            enumerable: false,
            value: n,
            writable: false
          });
        } else {
          t[rhn] = n;
        }
      }
    };
  });