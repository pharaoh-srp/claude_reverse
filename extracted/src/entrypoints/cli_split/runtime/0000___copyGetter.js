// @bun @bytecode @bun-cjs
(function (exports, require, module, __filename, __dirname) {
  // Claude Code is a Beta product per Anthropic's Commercial Terms of Service.
  // By using Claude Code, you agree that all code acceptance or rejection decisions you make,
  // and the associated conversations in context, constitute Feedback under Anthropic's Commercial Terms,
  // and may be used to improve Anthropic's products, including training models.
  // You are responsible for reviewing any code suggestions before use.

  // (c) Anthropic PBC. All rights reserved. Use is subject to the Legal Agreements outlined here: https://code.claude.com/docs/en/legal-and-compliance.

  // Version: 2.1.198
  var NQc = Object.create;
  var {
    getPrototypeOf: LQc,
    defineProperty: Y2e,
    getOwnPropertyNames: eEr,
    getOwnPropertyDescriptor: FQc
  } = Object;
  var ban = Object.prototype.hasOwnProperty;
  function __copyGetter(e) {
    return this[e];
  }
  var __reExport = (e, t, n) => {
    var r = eEr(t);
    for (let o of r) {
      if (!ban.call(e, o) && o !== "default") {
        Y2e(e, o, {
          get: __copyGetter.bind(t, o),
          enumerable: true
        });
      }
    }
    if (n) {
      for (let o of r) {
        if (!ban.call(n, o) && o !== "default") {
          Y2e(n, o, {
            get: __copyGetter.bind(t, o),
            enumerable: true
          });
        }
      }
      return n;
    }
  };
  var UQc;
  var BQc;
  var __toESM = (e, t, n) => {
    var r = e != null && typeof e === "object";
    if (r) {
      var o = t ? UQc ??= new WeakMap() : BQc ??= new WeakMap();
      var s = o.get(e);
      if (s) {
        return s;
      }
    }
    n = e != null ? NQc(LQc(e)) : {};
    let i = t || !e || !e.__esModule ? Y2e(n, "default", {
      value: e,
      enumerable: true
    }) : n;
    for (let a of eEr(e)) {
      if (!ban.call(i, a)) {
        Y2e(i, a, {
          get: __copyGetter.bind(e, a),
          enumerable: true
        });
      }
    }
    if (r) {
      o.set(e, i);
    }
    return i;
  };
  var __toCommonJS = e => {
    var t = ($is ??= new WeakMap()).get(e);
    var n;
    if (t) {
      return t;
    }
    if (t = Y2e({}, "__esModule", {
      value: true
    }), e && typeof e === "object" || typeof e === "function") {
      for (var r of eEr(e)) {
        if (!ban.call(t, r)) {
          Y2e(t, r, {
            get: __copyGetter.bind(e, r),
            enumerable: !(n = FQc(e, r)) || n.enumerable
          });
        }
      }
    }
    $is.set(e, t);
    return t;
  };
  var $is;
  var __commonJS = (e, t) => () => (t || e((t = {
    exports: {}
  }).exports, t), t.exports);
  var $Qc = e => e;
  function HQc(e, t) {
    this[e] = $Qc.bind(null, t);
  }
  var __export = (e, t) => {
    for (var n in t) {
      Y2e(e, n, {
        get: t[n],
        enumerable: true,
        configurable: true,
        set: HQc.bind(t, n)
      });
    }
  };
  var __lazy = (e, t) => () => (e && (t = e(e = 0)), t);
  var His = __commonJS((zVf, jQc) => {
    jQc.exports = require("/$bunfs/root/image-processor.node");
  });
  var jis = __commonJS((KVf, qQc) => {
    qQc.exports = require("/$bunfs/root/audio-capture.node");
  });