  __export(util_export, {
    unwrapMessage: () => unwrapMessage,
    stringifyPrimitive: () => stringifyPrimitive,
    required: () => required,
    randomString: () => randomString,
    propertyKeyTypes: () => propertyKeyTypes,
    promiseAllObject: () => promiseAllObject,
    primitiveTypes: () => primitiveTypes,
    prefixIssues: () => prefixIssues,
    pick: () => pick,
    partial: () => partial,
    optionalKeys: () => optionalKeys,
    omit: () => omit,
    numKeys: () => numKeys,
    nullish: () => nullish,
    normalizeParams: () => normalizeParams,
    merge: () => merge,
    jsonStringifyReplacer: () => jsonStringifyReplacer,
    joinValues: () => joinValues,
    issue: () => issue,
    isPlainObject: () => isPlainObject,
    isObject: () => isObject,
    getSizableOrigin: () => getSizableOrigin,
    getParsedType: () => getParsedType_export,
    getLengthableOrigin: () => getLengthableOrigin,
    getEnumValues: () => getEnumValues,
    getElementAtPath: () => getElementAtPath,
    floatSafeRemainder: () => floatSafeRemainder,
    finalizeIssue: () => finalizeIssue,
    extend: () => extend,
    escapeRegex: () => escapeRegex,
    esc: () => esc_export,
    defineLazy: () => defineLazy,
    createTransparentProxy: () => createTransparentProxy,
    clone: () => clone,
    cleanRegex: () => cleanRegex,
    cleanEnum: () => cleanEnum,
    captureStackTrace: () => captureStackTrace,
    cached: () => cached,
    assignProp: () => assignProp,
    assertNotEqual: () => assertNotEqual,
    assertNever: () => assertNever,
    assertIs: () => assertIs,
    assertEqual: () => assertEqual,
    assert: () => assert,
    allowsEval: () => allowsEval,
    aborted: () => aborted,
    NUMBER_FORMAT_RANGES: () => NUMBER_FORMAT_RANGES,
    Class: () => Class,
    BIGINT_FORMAT_RANGES: () => BIGINT_FORMAT_RANGES
  });
  function assertEqual(e) {
    return e;
  }
  function assertNotEqual(e) {
    return e;
  }
  function assertIs(e) {}
  function assertNever(e) {
    throw Error();
  }
  function assert(e) {}
  function getEnumValues(e) {
    let t = Object.values(e).filter(r => typeof r === "number");
    return Object.entries(e).filter(([r, o]) => t.indexOf(+r) === -1).map(([r, o]) => o);
  }
  function joinValues(e, t = "|") {
    return e.map(n => stringifyPrimitive(n)).join(t);
  }
  function jsonStringifyReplacer(e, t) {
    if (typeof t === "bigint") {
      return t.toString();
    }
    return t;
  }
  function cached(e) {
    return {
      get value() {
        {
          let n = e();
          Object.defineProperty(this, "value", {
            value: n
          });
          return n;
        }
        throw Error("cached value already set");
      }
    };
  }
  function nullish(e) {
    return e === null || e === undefined;
  }
  function cleanRegex(e) {
    let t = e.startsWith("^") ? 1 : 0;
    let n = e.endsWith("$") ? e.length - 1 : e.length;
    return e.slice(t, n);
  }
  function floatSafeRemainder(e, t) {
    let n = (e.toString().split(".")[1] || "").length;
    let r = (t.toString().split(".")[1] || "").length;
    let o = n > r ? n : r;
    let s = Number.parseInt(e.toFixed(o).replace(".", ""));
    let i = Number.parseInt(t.toFixed(o).replace(".", ""));
    return s % i / 10 ** o;
  }
  function defineLazy(e, t, n) {
    Object.defineProperty(e, t, {
      get() {
        {
          let o = n();
          e[t] = o;
          return o;
        }
        throw Error("cached value already set");
      },
      set(o) {
        Object.defineProperty(e, t, {
          value: o
        });
      },
      configurable: true
    });
  }
  function assignProp(e, t, n) {
    Object.defineProperty(e, t, {
      value: n,
      writable: true,
      enumerable: true,
      configurable: true
    });
  }
  function getElementAtPath(e, t) {
    if (!t) {
      return e;
    }
    return t.reduce((n, r) => n?.[r], e);
  }
  function promiseAllObject(e) {
    let t = Object.keys(e);
    let n = t.map(r => e[r]);
    return Promise.all(n).then(r => {
      let o = {};
      for (let s = 0; s < t.length; s++) {
        o[t[s]] = r[s];
      }
      return o;
    });
  }
  function randomString(e = 10) {
    let n = "";
    for (let r = 0; r < e; r++) {
      n += "abcdefghijklmnopqrstuvwxyz"[Math.floor(Math.random() * 26)];
    }
    return n;
  }
  function esc_export(e) {
    return JSON.stringify(e);
  }
  function isObject(e) {
    return typeof e === "object" && e !== null && !Array.isArray(e);
  }
  function isPlainObject(e) {
    if (isObject(e) === false) {
      return false;
    }
    let t = e.constructor;
    if (t === undefined) {
      return true;
    }
    let n = t.prototype;
    if (isObject(n) === false) {
      return false;
    }
    if (Object.prototype.hasOwnProperty.call(n, "isPrototypeOf") === false) {
      return false;
    }
    return true;
  }
  function numKeys(e) {
    let t = 0;
    for (let n in e) {
      if (Object.prototype.hasOwnProperty.call(e, n)) {
        t++;
      }
    }
    return t;
  }
  function escapeRegex(e) {
    return e.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
  }
  function clone(e, t, n) {
    let r = new e._zod.constr(t ?? e._zod.def);
    if (!t || n?.parent) {
      r._zod.parent = e;
    }
    return r;
  }
  function normalizeParams(e) {
    let t = e;
    if (!t) {
      return {};
    }
    if (typeof t === "string") {
      return {
        error: () => t
      };
    }
    if (t?.message !== undefined) {
      if (t?.error !== undefined) {
        throw Error("Cannot specify both `message` and `error` params");
      }
      t.error = t.message;
    }
    if (delete t.message, typeof t.error === "string") {
      return {
        ...t,
        error: () => t.error
      };
    }
    return t;
  }
  function createTransparentProxy(e) {
    let t;
    return new Proxy({}, {
      get(n, r, o) {
        t ?? (t = e());
        return Reflect.get(t, r, o);
      },
      set(n, r, o, s) {
        t ?? (t = e());
        return Reflect.set(t, r, o, s);
      },
      vZc(n, r) {
        t ?? (t = e());
        return Reflect.vZc(t, r);
      },
      deleteProperty(n, r) {
        t ?? (t = e());
        return Reflect.deleteProperty(t, r);
      },
      ownKeys(n) {
        t ?? (t = e());
        return Reflect.ownKeys(t);
      },
      getOwnPropertyDescriptor(n, r) {
        t ?? (t = e());
        return Reflect.getOwnPropertyDescriptor(t, r);
      },
      defineProperty(n, r, o) {
        t ?? (t = e());
        return Reflect.defineProperty(t, r, o);
      }
    });
  }
  function stringifyPrimitive(e) {
    if (typeof e === "bigint") {
      return e.toString() + "n";
    }
    if (typeof e === "string") {
      return `"${e}"`;
    }
    return `${e}`;
  }
  function optionalKeys(e) {
    return Object.keys(e).filter(t => e[t]._zod.optin === "optional" && e[t]._zod.optout === "optional");
  }
  function pick(e, t) {
    let n = {};
    let r = e._zod.def;
    for (let o in t) {
      if (!(o in r.shape)) {
        throw Error(`Unrecognized key: "${o}"`);
      }
      if (!t[o]) {
        continue;
      }
      n[o] = r.shape[o];
    }
    return clone(e, {
      ...e._zod.def,
      shape: n,
      checks: []
    });
  }
  function omit(e, t) {
    let n = {
      ...e._zod.def.shape
    };
    let r = e._zod.def;
    for (let o in t) {
      if (!(o in r.shape)) {
        throw Error(`Unrecognized key: "${o}"`);
      }
      if (!t[o]) {
        continue;
      }
      delete n[o];
    }
    return clone(e, {
      ...e._zod.def,
      shape: n,
      checks: []
    });
  }
  function extend(e, t) {
    if (!isPlainObject(t)) {
      throw Error("Invalid input to extend: expected a plain object");
    }
    let n = {
      ...e._zod.def,
      get shape() {
        let r = {
          ...e._zod.def.shape,
          ...t
        };
        assignProp(this, "shape", r);
        return r;
      },
      checks: []
    };
    return clone(e, n);
  }
  function merge(e, t) {
    return clone(e, {
      ...e._zod.def,
      get shape() {
        let n = {
          ...e._zod.def.shape,
          ...t._zod.def.shape
        };
        assignProp(this, "shape", n);
        return n;
      },
      catchall: t._zod.def.catchall,
      checks: []
    });
  }
  function partial(e, t, n) {
    let r = t._zod.def.shape;
    let o = {
      ...r
    };
    if (n) {
      for (let s in n) {
        if (!(s in r)) {
          throw Error(`Unrecognized key: "${s}"`);
        }
        if (!n[s]) {
          continue;
        }
        o[s] = e ? new e({
          type: "optional",
          innerType: r[s]
        }) : r[s];
      }
    } else {
      for (let s in r) {
        o[s] = e ? new e({
          type: "optional",
          innerType: r[s]
        }) : r[s];
      }
    }
    return clone(t, {
      ...t._zod.def,
      shape: o,
      checks: []
    });
  }
  function required(e, t, n) {
    let r = t._zod.def.shape;
    let o = {
      ...r
    };
    if (n) {
      for (let s in n) {
        if (!(s in o)) {
          throw Error(`Unrecognized key: "${s}"`);
        }
        if (!n[s]) {
          continue;
        }
        o[s] = new e({
          type: "nonoptional",
          innerType: r[s]
        });
      }
    } else {
      for (let s in r) {
        o[s] = new e({
          type: "nonoptional",
          innerType: r[s]
        });
      }
    }
    return clone(t, {
      ...t._zod.def,
      shape: o,
      checks: []
    });
  }
  function aborted(e, t = 0) {
    for (let n = t; n < e.issues.length; n++) {
      if (e.issues[n]?.continue !== true) {
        return true;
      }
    }
    return false;
  }
  function prefixIssues(e, t) {
    return t.map(n => {
      var r;
      (r = n).path ?? (r.path = []);
      n.path.unshift(e);
      return n;
    });
  }
  function unwrapMessage(e) {
    return typeof e === "string" ? e : e?.message;
  }
  function finalizeIssue(e, t, n) {
    let r = {
      ...e,
      path: e.path ?? []
    };
    if (!e.message) {
      let o = unwrapMessage(e.inst?._zod.def?.error?.(e)) ?? unwrapMessage(t?.error?.(e)) ?? unwrapMessage(n.customError?.(e)) ?? unwrapMessage(n.localeError?.(e)) ?? "Invalid input";
      r.message = o;
    }
    if (delete r.inst, delete r.continue, !t?.reportInput) {
      delete r.input;
    }
    return r;
  }
  function getSizableOrigin(e) {
    if (e instanceof Set) {
      return "set";
    }
    if (e instanceof Map) {
      return "map";
    }
    if (e instanceof File) {
      return "file";
    }
    return "unknown";
  }
  function getLengthableOrigin(e) {
    if (Array.isArray(e)) {
      return "array";
    }
    if (typeof e === "string") {
      return "string";
    }
    return "unknown";
  }
  function issue(...e) {
    let [t, n, r] = e;
    if (typeof t === "string") {
      return {
        message: t,
        code: "custom",
        input: n,
        inst: r
      };
    }
    return {
      ...t
    };
  }
  function cleanEnum(e) {
    return Object.entries(e).filter(([t, n]) => Number.isNaN(Number.parseInt(t, 10))).map(t => t[1]);
  }
  class Class {
    constructor(...e) {}
  }
  var captureStackTrace;
  var allowsEval;
  var getParsedType_export = e => {
    let t = typeof e;
    switch (t) {
      case "undefined":
        return "undefined";
      case "string":
        return "string";
      case "number":
        return Number.isNaN(e) ? "nan" : "number";
      case "boolean":
        return "boolean";
      case "function":
        return "function";
      case "bigint":
        return "bigint";
      case "symbol":
        return "symbol";
      case "object":
        if (Array.isArray(e)) {
          return "array";
        }
        if (e === null) {
          return "null";
        }
        if (e.then && typeof e.then === "function" && e.catch && typeof e.catch === "function") {
          return "promise";
        }
        if (typeof Map < "u" && e instanceof Map) {
          return "map";
        }
        if (typeof Set < "u" && e instanceof Set) {
          return "set";
        }
        if (typeof Date < "u" && e instanceof Date) {
          return "date";
        }
        if (typeof File < "u" && e instanceof File) {
          return "file";
        }
        return "object";
      default:
        throw Error(`Unknown data type: ${t}`);
    }
  };
  var propertyKeyTypes;
  var primitiveTypes;
  var NUMBER_FORMAT_RANGES;
  var BIGINT_FORMAT_RANGES;
  var gp = __lazy(() => {
    captureStackTrace = Error.captureStackTrace ? Error.captureStackTrace : (...e) => {};
    allowsEval = cached(() => {
      if (typeof navigator < "u" && navigator?.userAgent?.includes("Cloudflare")) {
        return false;
      }
      try {
        new Function("");
        return true;
      } catch (e) {
        return false;
      }
    });
    propertyKeyTypes = new Set(["string", "number", "symbol"]);
    primitiveTypes = new Set(["string", "number", "bigint", "boolean", "symbol", "undefined"]);
    NUMBER_FORMAT_RANGES = {
      safeint: [Number.MIN_SAFE_INTEGER, Number.MAX_SAFE_INTEGER],
      int32: [-2147483648, 2147483647],
      uint32: [0, 4294967295],
      float32: [-340282346638528860000000000000000000000, 340282346638528860000000000000000000000],
      float64: [-Number.MAX_VALUE, Number.MAX_VALUE]
    };
    BIGINT_FORMAT_RANGES = {
      int64: [BigInt("-9223372036854775808"), BigInt("9223372036854775807")],
      uint64: [BigInt(0), BigInt("18446744073709551615")]
    };
  });
  function flattenError(e, t = n => n.message) {
    let n = {};
    let r = [];
    for (let o of e.issues) {
      if (o.path.length > 0) {
        n[o.path[0]] = n[o.path[0]] || [];
        n[o.path[0]].push(t(o));
      } else {
        r.push(t(o));
      }
    }
    return {
      formErrors: r,
      fieldErrors: n
    };
  }
  function formatError(e, t) {
    let n = t || function (s) {
      return s.message;
    };
    let r = {
      _errors: []
    };
    let o = s => {
      for (let i of s.issues) {
        if (i.code === "invalid_union" && i.errors.length) {
          i.errors.map(a => o({
            issues: a
          }));
        } else if (i.code === "invalid_key") {
          o({
            issues: i.issues
          });
        } else if (i.code === "invalid_element") {
          o({
            issues: i.issues
          });
        } else if (i.path.length === 0) {
          r._errors.push(n(i));
        } else {
          let a = r;
          let l = 0;
          while (l < i.path.length) {
            let c = i.path[l];
            if (l !== i.path.length - 1) {
              a[c] = a[c] || {
                _errors: []
              };
            } else {
              a[c] = a[c] || {
                _errors: []
              };
              a[c]._errors.push(n(i));
            }
            a = a[c];
            l++;
          }
        }
      }
    };
    o(e);
    return r;
  }
  function treeifyError(e, t) {
    let n = t || function (s) {
      return s.message;
    };
    let r = {
      errors: []
    };
    let o = (s, i = []) => {
      var a;
      var l;
      for (let c of s.issues) {
        if (c.code === "invalid_union" && c.errors.length) {
          c.errors.map(u => o({
            issues: u
          }, c.path));
        } else if (c.code === "invalid_key") {
          o({
            issues: c.issues
          }, c.path);
        } else if (c.code === "invalid_element") {
          o({
            issues: c.issues
          }, c.path);
        } else {
          let u = [...i, ...c.path];
          if (u.length === 0) {
            r.errors.push(n(c));
            continue;
          }
          let d = r;
          let p = 0;
          while (p < u.length) {
            let m = u[p];
            let f = p === u.length - 1;
            if (typeof m === "string") {
              d.properties ?? (d.properties = {});
              (a = d.properties)[m] ?? (a[m] = {
                errors: []
              });
              d = d.properties[m];
            } else {
              d.items ?? (d.items = []);
              (l = d.items)[m] ?? (l[m] = {
                errors: []
              });
              d = d.items[m];
            }
            if (f) {
              d.errors.push(n(c));
            }
            p++;
          }
        }
      }
    };
    o(e);
    return r;
  }
  function toDotPath(e) {
    let t = [];
    for (let n of e) {
      if (typeof n === "number") {
        t.push(`[${n}]`);
      } else if (typeof n === "symbol") {
        t.push(`[${JSON.stringify(String(n))}]`);
      } else if (/[^\w$]/.test(n)) {
        t.push(`[${JSON.stringify(n)}]`);
      } else {
        if (t.length) {
          t.push(".");
        }
        t.push(n);
      }
    }
    return t.join("");
  }
  function prettifyError(e) {
    let t = [];
    let n = [...e.issues].sort((r, o) => r.path.length - o.path.length);
    for (let r of n) {
      if (t.push(`\u2716 ${r.message}`), r.path?.length) {
        t.push(`  \u2192 at ${toDotPath(r.path)}`);
      }
    }
    return t.join(`
`);
  }
  var $ms = (e, t) => {
    e.name = "$ZodError";
    Object.defineProperty(e, "_zod", {
      value: e._zod,
      enumerable: false
    });
    Object.defineProperty(e, "issues", {
      value: t,
      enumerable: false
    });
    Object.defineProperty(e, "message", {
      get() {
        return JSON.stringify(t, jsonStringifyReplacer, 2);
      },
      enumerable: true
    });
  };
  var $ZodError;
  var $ZodRealError;
  var yxr = __lazy(() => {
    Ret();
    gp();
    $ZodError = $constructor("$ZodError", $ms);
    $ZodRealError = $constructor("$ZodError", $ms, {
      Parent: Error
    });
  });
  var _parse = e => (t, n, r, o) => {
    let s = r ? Object.assign(r, {
      async: false
    }) : {
      async: false
    };
    let i = t._zod.run({
      value: n,
      issues: []
    }, s);
    if (i instanceof Promise) {
      throw new $ZodAsyncError();
    }
    if (i.issues.length) {
      let a = new (o?.Err ?? e)(i.issues.map(l => finalizeIssue(l, s, config())));
      throw captureStackTrace(a, o?.callee), a;
    }
    return i.value;
  };
  var parse;
  var _parseAsync = e => async (t, n, r, o) => {
    let s = r ? Object.assign(r, {
      async: true
    }) : {
      async: true
    };
    let i = t._zod.run({
      value: n,
      issues: []
    }, s);
    if (i instanceof Promise) {
      i = await i;
    }
    if (i.issues.length) {
      let a = new (o?.Err ?? e)(i.issues.map(l => finalizeIssue(l, s, config())));
      throw captureStackTrace(a, o?.callee), a;
    }
    return i.value;
  };
  var parseAsync;
  var _safeParse = e => (t, n, r) => {
    let o = r ? {
      ...r,
      async: false
    } : {
      async: false
    };
    let s = t._zod.run({
      value: n,
      issues: []
    }, o);
    if (s instanceof Promise) {
      throw new $ZodAsyncError();
    }
    return s.issues.length ? {
      success: false,
      error: new (e ?? $ZodError)(s.issues.map(i => finalizeIssue(i, o, config())))
    } : {
      success: true,
      data: s.value
    };
  };
  var safeParse;
  var _safeParseAsync = e => async (t, n, r) => {
    let o = r ? Object.assign(r, {
      async: true
    }) : {
      async: true
    };
    let s = t._zod.run({
      value: n,
      issues: []
    }, o);
    if (s instanceof Promise) {
      s = await s;
    }
    return s.issues.length ? {
      success: false,
      error: new e(s.issues.map(i => finalizeIssue(i, o, config())))
    } : {
      success: true,
      data: s.value
    };
  };
  var safeParseAsync;
  var Dun = __lazy(() => {
    Ret();
    yxr();
    gp();
    parse = _parse($ZodRealError);
    parseAsync = _parseAsync($ZodRealError);
    safeParse = _safeParse($ZodRealError);
    safeParseAsync = _safeParseAsync($ZodRealError);
  });
  var regexes = {};
  __export(regexes, {
    xid: () => xid_export,
    uuid7: () => uuid7,
    uuid6: () => uuid6,
    uuid4: () => uuid4,
    uuid: () => uuid,
    uppercase: () => uppercase,
    unicodeEmail: () => unicodeEmail,
    undefined: () => undefined_export2,
    ulid: () => ulid,
    time: () => time,
    string: () => string_export,
    rfc5322Email: () => rfc5322Email,
    number: () => number_export,
    null: () => qxr,
    nanoid: () => nanoid,
    lowercase: () => lowercase,
    ksuid: () => ksuid,
    ipv6: () => ipv6,
    ipv4: () => ipv4,
    integer: () => integer,
    html5Email: () => html5Email,
    hostname: () => hostname,
    guid: () => guid,
    extendedDuration: () => extendedDuration,
    emoji: () => emoji,
    email: () => email,
    e164: () => e164,
    duration: () => duration,
    domain: () => domain,
    datetime: () => datetime,
    date: () => date_export,
    cuid2: () => cuid2,
    cuid: () => cuid,
    cidrv6: () => cidrv6,
    cidrv4: () => cidrv4,
    browserEmail: () => browserEmail,
    boolean: () => boolean_export,
    bigint: () => bigint_export,
    base64url: () => base64url,
    base64: () => base64,
    _emoji: () => "^(\\p{Extended_Pictographic}|\\p{Emoji_Component})+$"
  });
  function emoji() {
    return new RegExp("^(\\p{Extended_Pictographic}|\\p{Emoji_Component})+$", "u");
  }
  function qms(e) {
    return typeof e.precision === "number" ? e.precision === -1 ? "(?:[01]\\d|2[0-3]):[0-5]\\d" : e.precision === 0 ? "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d" : `(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d\\.\\d{${e.precision}}` : "(?:[01]\\d|2[0-3]):[0-5]\\d(?::[0-5]\\d(?:\\.\\d+)?)?";
  }
  function time(e) {
    return new RegExp(`^${qms(e)}$`);
  }
  function datetime(e) {
    let t = qms({
      precision: e.precision
    });
    let n = ["Z"];
    if (e.local) {
      n.push("");
    }
    if (e.offset) {
      n.push("([+-]\\d{2}:\\d{2})");
    }
    let r = `${t}(?:${n.join("|")})`;
    return new RegExp(`^${"(?:(?:\\d\\d[2468][048]|\\d\\d[13579][26]|\\d\\d0[48]|[02468][048]00|[13579][26]00)-02-29|\\d{4}-(?:(?:0[13578]|1[02])-(?:0[1-9]|[12]\\d|3[01])|(?:0[469]|11)-(?:0[1-9]|[12]\\d|30)|(?:02)-(?:0[1-9]|1\\d|2[0-8])))"}T(?:${r})$`);
  }
  var cuid;
  var cuid2;
  var ulid;
  var xid_export;
  var ksuid;
  var nanoid;
  var duration;
  var extendedDuration;
  var guid;
  var uuid = e => {
    if (!e) {
      return /^([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[1-8][0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12}|00000000-0000-0000-0000-000000000000)$/;
    }
    return new RegExp(`^([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-${e}[0-9a-fA-F]{3}-[89abAB][0-9a-fA-F]{3}-[0-9a-fA-F]{12})$`);
  };
  var uuid4;
  var uuid6;
  var uuid7;
  var email;
  var html5Email;
  var rfc5322Email;
  var unicodeEmail;
  var browserEmail;
  var ipv4;
  var ipv6;
  var cidrv4;
  var cidrv6;
  var base64;
  var base64url;
  var hostname;
  var domain;
  var e164;
  var date_export;
  var string_export = e => {
    let t = e ? `[\\s\\S]{${e?.minimum ?? 0},${e?.maximum ?? ""}}` : "[\\s\\S]*";
    return new RegExp(`^${t}$`);
  };
  var bigint_export;
  var integer;
  var number_export;
  var boolean_export;
  var qxr;
  var undefined_export2;
  var lowercase;
  var uppercase;
  var Nun = __lazy(() => {
    cuid = /^[cC][^\s-]{8,}$/;
    cuid2 = /^[0-9a-z]+$/;
    ulid = /^[0-9A-HJKMNP-TV-Za-hjkmnp-tv-z]{26}$/;
    xid_export = /^[0-9a-vA-V]{20}$/;
    ksuid = /^[A-Za-z0-9]{27}$/;
    nanoid = /^[a-zA-Z0-9_-]{21}$/;
    duration = /^P(?:(\d+W)|(?!.*W)(?=\d|T\d)(\d+Y)?(\d+M)?(\d+D)?(T(?=\d)(\d+H)?(\d+M)?(\d+([.,]\d+)?S)?)?)$/;
    extendedDuration = /^[-+]?P(?!$)(?:(?:[-+]?\d+Y)|(?:[-+]?\d+[.,]\d+Y$))?(?:(?:[-+]?\d+M)|(?:[-+]?\d+[.,]\d+M$))?(?:(?:[-+]?\d+W)|(?:[-+]?\d+[.,]\d+W$))?(?:(?:[-+]?\d+D)|(?:[-+]?\d+[.,]\d+D$))?(?:T(?=[\d+-])(?:(?:[-+]?\d+H)|(?:[-+]?\d+[.,]\d+H$))?(?:(?:[-+]?\d+M)|(?:[-+]?\d+[.,]\d+M$))?(?:[-+]?\d+(?:[.,]\d+)?S)?)??$/;
    guid = /^([0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$/;
    uuid4 = uuid(4);
    uuid6 = uuid(6);
    uuid7 = uuid(7);
    email = /^(?!\.)(?!.*\.\.)([A-Za-z0-9_'+\-\.]*)[A-Za-z0-9_+-]@([A-Za-z0-9][A-Za-z0-9\-]*\.)+[A-Za-z]{2,}$/;
    html5Email = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/;
    rfc5322Email = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    unicodeEmail = /^[^\s@"]{1,64}@[^\s@]{1,255}$/u;
    browserEmail = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/;
    ipv4 = /^(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\.){3}(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$/;
    ipv6 = /^(([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|::|([0-9a-fA-F]{1,4})?::([0-9a-fA-F]{1,4}:?){0,6})$/;
    cidrv4 = /^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\/([0-9]|[1-2][0-9]|3[0-2])$/;
    cidrv6 = /^(([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|::|([0-9a-fA-F]{1,4})?::([0-9a-fA-F]{1,4}:?){0,6})\/(12[0-8]|1[01][0-9]|[1-9]?[0-9])$/;
    base64 = /^$|^(?:[0-9a-zA-Z+/]{4})*(?:(?:[0-9a-zA-Z+/]{2}==)|(?:[0-9a-zA-Z+/]{3}=))?$/;
    base64url = /^[A-Za-z0-9_-]*$/;
    hostname = /^([a-zA-Z0-9-]+\.)*[a-zA-Z0-9-]+$/;
    domain = /^([a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?\.)+[a-zA-Z]{2,}$/;
    e164 = /^\+(?:[0-9]){6,14}[0-9]$/;
    date_export = new RegExp(`^${"(?:(?:\\d\\d[2468][048]|\\d\\d[13579][26]|\\d\\d0[48]|[02468][048]00|[13579][26]00)-02-29|\\d{4}-(?:(?:0[13578]|1[02])-(?:0[1-9]|[12]\\d|3[01])|(?:0[469]|11)-(?:0[1-9]|[12]\\d|30)|(?:02)-(?:0[1-9]|1\\d|2[0-8])))"}$`);
    bigint_export = /^\d+n?$/;
    integer = /^\d+$/;
    number_export = /^-?\d+(?:\.\d+)?/i;
    boolean_export = /true|false/i;
    qxr = /null/i;
    undefined_export2 = /undefined/i;
    lowercase = /^[^A-Z]*$/;
    uppercase = /^[^a-z]*$/;
  });
  function Wms(e, t, n) {
    if (e.issues.length) {
      t.issues.push(...prefixIssues(n, e.issues));
    }
  }
  var $ZodCheck;
  var Gms;
  var $ZodCheckLessThan;
  var $ZodCheckGreaterThan;
  var $ZodCheckMultipleOf;
  var $ZodCheckNumberFormat;
  var $ZodCheckBigIntFormat;
  var $ZodCheckMaxSize;
  var $ZodCheckMinSize;
  var $ZodCheckSizeEquals;
  var $ZodCheckMaxLength;
  var $ZodCheckMinLength;
  var $ZodCheckLengthEquals;
  var $ZodCheckStringFormat;
  var $ZodCheckRegex;
  var $ZodCheckLowerCase;
  var $ZodCheckUpperCase;
  var $ZodCheckIncludes;
  var $ZodCheckStartsWith;
  var $ZodCheckEndsWith;
  var $ZodCheckProperty;
  var $ZodCheckMimeType;
  var $ZodCheckOverwrite;
  var Uun = __lazy(() => {
    Ret();
    Nun();
    gp();
    $ZodCheck = $constructor("$ZodCheck", (e, t) => {
      var n;
      e._zod ?? (e._zod = {});
      e._zod.def = t;
      (n = e._zod).onattach ?? (n.onattach = []);
    });
    Gms = {
      number: "number",
      bigint: "bigint",
      object: "date"
    };
    $ZodCheckLessThan = $constructor("$ZodCheckLessThan", (e, t) => {
      $ZodCheck.init(e, t);
      let n = Gms[typeof t.value];
      e._zod.onattach.push(r => {
        let o = r._zod.bag;
        let s = (t.inclusive ? o.maximum : o.exclusiveMaximum) ?? Number.POSITIVE_INFINITY;
        if (t.value < s) {
          if (t.inclusive) {
            o.maximum = t.value;
          } else {
            o.exclusiveMaximum = t.value;
          }
        }
      });
      e._zod.check = r => {
        if (t.inclusive ? r.value <= t.value : r.value < t.value) {
          return;
        }
        r.issues.push({
          origin: n,
          code: "too_big",
          maximum: t.value,
          input: r.value,
          inclusive: t.inclusive,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckGreaterThan = $constructor("$ZodCheckGreaterThan", (e, t) => {
      $ZodCheck.init(e, t);
      let n = Gms[typeof t.value];
      e._zod.onattach.push(r => {
        let o = r._zod.bag;
        let s = (t.inclusive ? o.minimum : o.exclusiveMinimum) ?? Number.NEGATIVE_INFINITY;
        if (t.value > s) {
          if (t.inclusive) {
            o.minimum = t.value;
          } else {
            o.exclusiveMinimum = t.value;
          }
        }
      });
      e._zod.check = r => {
        if (t.inclusive ? r.value >= t.value : r.value > t.value) {
          return;
        }
        r.issues.push({
          origin: n,
          code: "too_small",
          minimum: t.value,
          input: r.value,
          inclusive: t.inclusive,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckMultipleOf = $constructor("$ZodCheckMultipleOf", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.onattach.push(n => {
        var r;
        (r = n._zod.bag).multipleOf ?? (r.multipleOf = t.value);
      });
      e._zod.check = n => {
        if (typeof n.value !== typeof t.value) {
          throw Error("Cannot mix number and bigint in multiple_of check.");
        }
        if (typeof n.value === "bigint" ? n.value % t.value === BigInt(0) : floatSafeRemainder(n.value, t.value) === 0) {
          return;
        }
        n.issues.push({
          origin: typeof n.value,
          code: "not_multiple_of",
          divisor: t.value,
          input: n.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckNumberFormat = $constructor("$ZodCheckNumberFormat", (e, t) => {
      $ZodCheck.init(e, t);
      t.format = t.format || "float64";
      let n = t.format?.includes("int");
      let r = n ? "int" : "number";
      let [o, s] = NUMBER_FORMAT_RANGES[t.format];
      e._zod.onattach.push(i => {
        let a = i._zod.bag;
        if (a.format = t.format, a.minimum = o, a.maximum = s, n) {
          a.pattern = integer;
        }
      });
      e._zod.check = i => {
        let a = i.value;
        if (n) {
          if (!Number.isInteger(a)) {
            i.issues.push({
              expected: r,
              format: t.format,
              code: "invalid_type",
              input: a,
              inst: e
            });
            return;
          }
          if (!Number.isSafeInteger(a)) {
            if (a > 0) {
              i.issues.push({
                input: a,
                code: "too_big",
                maximum: Number.MAX_SAFE_INTEGER,
                note: "Integers must be within the safe integer range.",
                inst: e,
                origin: r,
                continue: !t.abort
              });
            } else {
              i.issues.push({
                input: a,
                code: "too_small",
                minimum: Number.MIN_SAFE_INTEGER,
                note: "Integers must be within the safe integer range.",
                inst: e,
                origin: r,
                continue: !t.abort
              });
            }
            return;
          }
        }
        if (a < o) {
          i.issues.push({
            origin: "number",
            input: a,
            code: "too_small",
            minimum: o,
            inclusive: true,
            inst: e,
            continue: !t.abort
          });
        }
        if (a > s) {
          i.issues.push({
            origin: "number",
            input: a,
            code: "too_big",
            maximum: s,
            inst: e
          });
        }
      };
    });
    $ZodCheckBigIntFormat = $constructor("$ZodCheckBigIntFormat", (e, t) => {
      $ZodCheck.init(e, t);
      let [n, r] = BIGINT_FORMAT_RANGES[t.format];
      e._zod.onattach.push(o => {
        let s = o._zod.bag;
        s.format = t.format;
        s.minimum = n;
        s.maximum = r;
      });
      e._zod.check = o => {
        let s = o.value;
        if (s < n) {
          o.issues.push({
            origin: "bigint",
            input: s,
            code: "too_small",
            minimum: n,
            inclusive: true,
            inst: e,
            continue: !t.abort
          });
        }
        if (s > r) {
          o.issues.push({
            origin: "bigint",
            input: s,
            code: "too_big",
            maximum: r,
            inst: e
          });
        }
      };
    });
    $ZodCheckMaxSize = $constructor("$ZodCheckMaxSize", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.when = n => {
        let r = n.value;
        return !nullish(r) && r.size !== undefined;
      };
      e._zod.onattach.push(n => {
        let r = n._zod.bag.maximum ?? Number.POSITIVE_INFINITY;
        if (t.maximum < r) {
          n._zod.bag.maximum = t.maximum;
        }
      });
      e._zod.check = n => {
        let r = n.value;
        if (r.size <= t.maximum) {
          return;
        }
        n.issues.push({
          origin: getSizableOrigin(r),
          code: "too_big",
          maximum: t.maximum,
          input: r,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckMinSize = $constructor("$ZodCheckMinSize", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.when = n => {
        let r = n.value;
        return !nullish(r) && r.size !== undefined;
      };
      e._zod.onattach.push(n => {
        let r = n._zod.bag.minimum ?? Number.NEGATIVE_INFINITY;
        if (t.minimum > r) {
          n._zod.bag.minimum = t.minimum;
        }
      });
      e._zod.check = n => {
        let r = n.value;
        if (r.size >= t.minimum) {
          return;
        }
        n.issues.push({
          origin: getSizableOrigin(r),
          code: "too_small",
          minimum: t.minimum,
          input: r,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckSizeEquals = $constructor("$ZodCheckSizeEquals", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.when = n => {
        let r = n.value;
        return !nullish(r) && r.size !== undefined;
      };
      e._zod.onattach.push(n => {
        let r = n._zod.bag;
        r.minimum = t.size;
        r.maximum = t.size;
        r.size = t.size;
      });
      e._zod.check = n => {
        let r = n.value;
        let o = r.size;
        if (o === t.size) {
          return;
        }
        let s = o > t.size;
        n.issues.push({
          origin: getSizableOrigin(r),
          ...(s ? {
            code: "too_big",
            maximum: t.size
          } : {
            code: "too_small",
            minimum: t.size
          }),
          inclusive: true,
          exact: true,
          input: n.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckMaxLength = $constructor("$ZodCheckMaxLength", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.when = n => {
        let r = n.value;
        return !nullish(r) && r.length !== undefined;
      };
      e._zod.onattach.push(n => {
        let r = n._zod.bag.maximum ?? Number.POSITIVE_INFINITY;
        if (t.maximum < r) {
          n._zod.bag.maximum = t.maximum;
        }
      });
      e._zod.check = n => {
        let r = n.value;
        if (r.length <= t.maximum) {
          return;
        }
        let s = getLengthableOrigin(r);
        n.issues.push({
          origin: s,
          code: "too_big",
          maximum: t.maximum,
          inclusive: true,
          input: r,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckMinLength = $constructor("$ZodCheckMinLength", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.when = n => {
        let r = n.value;
        return !nullish(r) && r.length !== undefined;
      };
      e._zod.onattach.push(n => {
        let r = n._zod.bag.minimum ?? Number.NEGATIVE_INFINITY;
        if (t.minimum > r) {
          n._zod.bag.minimum = t.minimum;
        }
      });
      e._zod.check = n => {
        let r = n.value;
        if (r.length >= t.minimum) {
          return;
        }
        let s = getLengthableOrigin(r);
        n.issues.push({
          origin: s,
          code: "too_small",
          minimum: t.minimum,
          inclusive: true,
          input: r,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckLengthEquals = $constructor("$ZodCheckLengthEquals", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.when = n => {
        let r = n.value;
        return !nullish(r) && r.length !== undefined;
      };
      e._zod.onattach.push(n => {
        let r = n._zod.bag;
        r.minimum = t.length;
        r.maximum = t.length;
        r.length = t.length;
      });
      e._zod.check = n => {
        let r = n.value;
        let o = r.length;
        if (o === t.length) {
          return;
        }
        let s = getLengthableOrigin(r);
        let i = o > t.length;
        n.issues.push({
          origin: s,
          ...(i ? {
            code: "too_big",
            maximum: t.length
          } : {
            code: "too_small",
            minimum: t.length
          }),
          inclusive: true,
          exact: true,
          input: n.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckStringFormat = $constructor("$ZodCheckStringFormat", (e, t) => {
      var n;
      var r;
      if ($ZodCheck.init(e, t), e._zod.onattach.push(o => {
        let s = o._zod.bag;
        if (s.format = t.format, t.pattern) {
          s.patterns ?? (s.patterns = new Set());
          s.patterns.add(t.pattern);
        }
      }), t.pattern) {
        (n = e._zod).check ?? (n.check = o => {
          if (t.pattern.lastIndex = 0, t.pattern.test(o.value)) {
            return;
          }
          o.issues.push({
            origin: "string",
            code: "invalid_format",
            format: t.format,
            input: o.value,
            ...(t.pattern ? {
              pattern: t.pattern.toString()
            } : {}),
            inst: e,
            continue: !t.abort
          });
        });
      } else {
        (r = e._zod).check ?? (r.check = () => {});
      }
    });
    $ZodCheckRegex = $constructor("$ZodCheckRegex", (e, t) => {
      $ZodCheckStringFormat.init(e, t);
      e._zod.check = n => {
        if (t.pattern.lastIndex = 0, t.pattern.test(n.value)) {
          return;
        }
        n.issues.push({
          origin: "string",
          code: "invalid_format",
          format: "regex",
          input: n.value,
          pattern: t.pattern.toString(),
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckLowerCase = $constructor("$ZodCheckLowerCase", (e, t) => {
      t.pattern ?? (t.pattern = lowercase);
      $ZodCheckStringFormat.init(e, t);
    });
    $ZodCheckUpperCase = $constructor("$ZodCheckUpperCase", (e, t) => {
      t.pattern ?? (t.pattern = uppercase);
      $ZodCheckStringFormat.init(e, t);
    });
    $ZodCheckIncludes = $constructor("$ZodCheckIncludes", (e, t) => {
      $ZodCheck.init(e, t);
      let n = escapeRegex(t.includes);
      let r = new RegExp(typeof t.position === "number" ? `^.{${t.position}}${n}` : n);
      t.pattern = r;
      e._zod.onattach.push(o => {
        let s = o._zod.bag;
        s.patterns ?? (s.patterns = new Set());
        s.patterns.add(r);
      });
      e._zod.check = o => {
        if (o.value.includes(t.includes, t.position)) {
          return;
        }
        o.issues.push({
          origin: "string",
          code: "invalid_format",
          format: "includes",
          includes: t.includes,
          input: o.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckStartsWith = $constructor("$ZodCheckStartsWith", (e, t) => {
      $ZodCheck.init(e, t);
      let n = new RegExp(`^${escapeRegex(t.prefix)}.*`);
      t.pattern ?? (t.pattern = n);
      e._zod.onattach.push(r => {
        let o = r._zod.bag;
        o.patterns ?? (o.patterns = new Set());
        o.patterns.add(n);
      });
      e._zod.check = r => {
        if (r.value.startsWith(t.prefix)) {
          return;
        }
        r.issues.push({
          origin: "string",
          code: "invalid_format",
          format: "starts_with",
          prefix: t.prefix,
          input: r.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckEndsWith = $constructor("$ZodCheckEndsWith", (e, t) => {
      $ZodCheck.init(e, t);
      let n = new RegExp(`.*${escapeRegex(t.suffix)}$`);
      t.pattern ?? (t.pattern = n);
      e._zod.onattach.push(r => {
        let o = r._zod.bag;
        o.patterns ?? (o.patterns = new Set());
        o.patterns.add(n);
      });
      e._zod.check = r => {
        if (r.value.endsWith(t.suffix)) {
          return;
        }
        r.issues.push({
          origin: "string",
          code: "invalid_format",
          format: "ends_with",
          suffix: t.suffix,
          input: r.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCheckProperty = $constructor("$ZodCheckProperty", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.check = n => {
        let r = t.schema._zod.run({
          value: n.value[t.property],
          issues: []
        }, {});
        if (r instanceof Promise) {
          return r.then(o => Wms(o, n, t.property));
        }
        Wms(r, n, t.property);
        return;
      };
    });
    $ZodCheckMimeType = $constructor("$ZodCheckMimeType", (e, t) => {
      $ZodCheck.init(e, t);
      let n = new Set(t.mime);
      e._zod.onattach.push(r => {
        r._zod.bag.mime = t.mime;
      });
      e._zod.check = r => {
        if (n.vZc(r.value.type)) {
          return;
        }
        r.issues.push({
          code: "invalid_value",
          values: t.mime,
          input: r.value.type,
          inst: e
        });
      };
    });
    $ZodCheckOverwrite = $constructor("$ZodCheckOverwrite", (e, t) => {
      $ZodCheck.init(e, t);
      e._zod.check = n => {
        n.value = t.tx(n.value);
      };
    });
  });
  class Doc_export {
    constructor(e = []) {
      if (this.content = [], this.indent = 0, this) {
        this.args = e;
      }
    }
    indented(e) {
      this.indent += 1;
      e(this);
      this.indent -= 1;
    }
    write(e) {
      if (typeof e === "function") {
        e(this, {
          execution: "sync"
        });
        e(this, {
          execution: "async"
        });
        return;
      }
      let n = e.split(`
`).filter(s => s);
      let r = Math.min(...n.map(s => s.length - s.trimStart().length));
      let o = n.map(s => s.slice(r)).map(s => " ".repeat(this.indent * 2) + s);
      for (let s of o) {
        this.content.push(s);
      }
    }
    compile() {
      let e = Function;
      let t = this?.args;
      let r = [...(this?.content ?? [""]).map(o => `  ${o}`)];
      return new e(...t, r.join(`
`));
    }
  }
  var version;
  var pkr = __lazy(() => {
    version = {
      major: 4,
      minor: 0,
      patch: 0
    };
  });
  function isValidBase64(e) {
    if (e === "") {
      return true;
    }
    if (e.length % 4 !== 0) {
      return false;
    }
    try {
      atob(e);
      return true;
    } catch {
      return false;
    }
  }
  function isValidBase64URL(e) {
    if (!base64url.test(e)) {
      return false;
    }
    let t = e.replace(/[-_]/g, r => r === "-" ? "+" : "/");
    let n = t.padEnd(Math.ceil(t.length / 4) * 4, "=");
    return isValidBase64(n);
  }
  function isValidJWT(e, t = null) {
    try {
      let n = e.split(".");
      if (n.length !== 3) {
        return false;
      }
      let [r] = n;
      if (!r) {
        return false;
      }
      let o = JSON.parse(atob(r));
      if ("typ" in o && o?.typ !== "JWT") {
        return false;
      }
      if (!o.alg) {
        return false;
      }
      if (t && (!("alg" in o) || o.alg !== t)) {
        return false;
      }
      return true;
    } catch {
      return false;
    }
  }
  function zms(e, t, n) {
    if (e.issues.length) {
      t.issues.push(...prefixIssues(n, e.issues));
    }
    t.value[n] = e.value;
  }
  function Hun(e, t, n) {
    if (e.issues.length) {
      t.issues.push(...prefixIssues(n, e.issues));
    }
    t.value[n] = e.value;
  }
  function Kms(e, t, n, r) {
    if (e.issues.length) {
      if (r[n] === undefined) {
        if (n in r) {
          t.value[n] = undefined;
        } else {
          t.value[n] = e.value;
        }
      } else {
        t.issues.push(...prefixIssues(n, e.issues));
      }
    } else if (e.value === undefined) {
      if (n in r) {
        t.value[n] = undefined;
      }
    } else {
      t.value[n] = e.value;
    }
  }
  function Yms(e, t, n, r) {
    for (let o of e) {
      if (o.issues.length === 0) {
        t.value = o.value;
        return t;
      }
    }
    t.issues.push({
      code: "invalid_union",
      input: t.value,
      inst: n,
      errors: e.map(o => o.issues.map(s => finalizeIssue(s, r, config())))
    });
    return t;
  }
  function mkr(e, t) {
    if (e === t) {
      return {
        valid: true,
        data: e
      };
    }
    if (e instanceof Date && t instanceof Date && +e === +t) {
      return {
        valid: true,
        data: e
      };
    }
    if (isPlainObject(e) && isPlainObject(t)) {
      let n = Object.keys(t);
      let r = Object.keys(e).filter(s => n.indexOf(s) !== -1);
      let o = {
        ...e,
        ...t
      };
      for (let s of r) {
        let i = mkr(e[s], t[s]);
        if (!i.valid) {
          return {
            valid: false,
            mergeErrorPath: [s, ...i.mergeErrorPath]
          };
        }
        o[s] = i.data;
      }
      return {
        valid: true,
        data: o
      };
    }
    if (Array.isArray(e) && Array.isArray(t)) {
      if (e.length !== t.length) {
        return {
          valid: false,
          mergeErrorPath: []
        };
      }
      let n = [];
      for (let r = 0; r < e.length; r++) {
        let o = e[r];
        let s = t[r];
        let i = mkr(o, s);
        if (!i.valid) {
          return {
            valid: false,
            mergeErrorPath: [r, ...i.mergeErrorPath]
          };
        }
        n.push(i.data);
      }
      return {
        valid: true,
        data: n
      };
    }
    return {
      valid: false,
      mergeErrorPath: []
    };
  }
  function Jms(e, t, n) {
    if (t.issues.length) {
      e.issues.push(...t.issues);
    }
    if (n.issues.length) {
      e.issues.push(...n.issues);
    }
    if (aborted(e)) {
      return e;
    }
    let r = mkr(t.value, n.value);
    if (!r.valid) {
      throw Error(`Unmergable intersection. Error path: ${JSON.stringify(r.mergeErrorPath)}`);
    }
    e.value = r.data;
    return e;
  }
  function jun(e, t, n) {
    if (e.issues.length) {
      t.issues.push(...prefixIssues(n, e.issues));
    }
    t.value[n] = e.value;
  }
  function Xms(e, t, n, r, o, s, i) {
    if (e.issues.length) {
      if (propertyKeyTypes.vZc(typeof r)) {
        n.issues.push(...prefixIssues(r, e.issues));
      } else {
        n.issues.push({
          origin: "map",
          code: "invalid_key",
          input: o,
          inst: s,
          issues: e.issues.map(a => finalizeIssue(a, i, config()))
        });
      }
    }
    if (t.issues.length) {
      if (propertyKeyTypes.vZc(typeof r)) {
        n.issues.push(...prefixIssues(r, t.issues));
      } else {
        n.issues.push({
          origin: "map",
          code: "invalid_element",
          input: o,
          inst: s,
          key: r,
          issues: t.issues.map(a => finalizeIssue(a, i, config()))
        });
      }
    }
    n.value.set(e.value, t.value);
  }
  function Qms(e, t) {
    if (e.issues.length) {
      t.issues.push(...e.issues);
    }
    t.value.add(e.value);
  }
  function Zms(e, t) {
    if (e.value === undefined) {
      e.value = t.defaultValue;
    }
    return e;
  }
  function efs(e, t) {
    if (!e.issues.length && e.value === undefined) {
      e.issues.push({
        code: "invalid_type",
        expected: "nonoptional",
        input: e.value,
        inst: t
      });
    }
    return e;
  }
  function tfs(e, t, n) {
    if (aborted(e)) {
      return e;
    }
    return t.out._zod.run({
      value: e.value,
      issues: e.issues
    }, n);
  }
  function nfs(e) {
    e.value = Object.freeze(e.value);
    return e;
  }
  function rfs(e, t, n, r) {
    if (!e) {
      let o = {
        code: "custom",
        input: n,
        inst: r,
        path: [...(r._zod.def.path ?? [])],
        continue: !r._zod.def.abort
      };
      if (r._zod.def.params) {
        o.params = r._zod.def.params;
      }
      t.issues.push(issue(o));
    }
  }
  var $ZodType;
  var $ZodString;
  var $ZodStringFormat;
  var $ZodGUID;
  var $ZodUUID;
  var $ZodEmail;
  var $ZodURL;
  var $ZodEmoji;
  var $ZodNanoID;
  var $ZodCUID;
  var $ZodCUID2;
  var $ZodULID;
  var $ZodXID;
  var $ZodKSUID;
  var $ZodISODateTime;
  var $ZodISODate;
  var $ZodISOTime;
  var $ZodISODuration;
  var $ZodIPv4;
  var $ZodIPv6;
  var $ZodCIDRv4;
  var $ZodCIDRv6;
  var $ZodBase64;
  var $ZodBase64URL;
  var $ZodE164;
  var $ZodJWT;
  var $ZodCustomStringFormat;
  var $ZodNumber;
  var $ZodNumberFormat;
  var $ZodBoolean;
  var $ZodBigInt;
  var $ZodBigIntFormat;
  var $ZodSymbol;
  var $ZodUndefined;
  var $ZodNull;
  var $ZodAny;
  var $ZodUnknown;
  var $ZodNever;
  var $ZodVoid;
  var $ZodDate;
  var $ZodArray;
  var $ZodObject;
  var $ZodUnion;
  var $ZodDiscriminatedUnion;
  var $ZodIntersection;
  var $ZodTuple;
  var $ZodRecord;
  var $ZodMap;
  var $ZodSet;
  var $ZodEnum;
  var $ZodLiteral;
  var $ZodFile;
  var $ZodTransform;
  var $ZodOptional;
  var $ZodNullable;
  var $ZodDefault;
  var $ZodPrefault;
  var $ZodNonOptional;
  var $ZodSuccess;
  var $ZodCatch;
  var $ZodNaN;
  var $ZodPipe;
  var $ZodReadonly;
  var $ZodTemplateLiteral;
  var $ZodPromise;
  var $ZodLazy;
  var $ZodCustom;
  var sPt = __lazy(() => {
    Uun();
    Ret();
    Dun();
    Nun();
    gp();
    pkr();
    gp();
    $ZodType = $constructor("$ZodType", (e, t) => {
      var n;
      e ?? (e = {});
      e._zod.def = t;
      e._zod.bag = e._zod.bag || {};
      e._zod.version = version;
      let r = [...(e._zod.def.checks ?? [])];
      if (e._zod.traits.vZc("$ZodCheck")) {
        r.unshift(e);
      }
      for (let o of r) {
        for (let s of o._zod.onattach) {
          s(e);
        }
      }
      if (r.length === 0) {
        (n = e._zod).deferred ?? (n.deferred = []);
        e._zod.deferred?.push(() => {
          e._zod.run = e._zod.parse;
        });
      } else {
        let o = (s, i, a) => {
          let l = aborted(s);
          let c;
          for (let u of i) {
            if (u._zod.when) {
              if (!u._zod.when(s)) {
                continue;
              }
            } else if (l) {
              continue;
            }
            let d = s.issues.length;
            let p = u._zod.check(s);
            if (p instanceof Promise && a?.async === false) {
              throw new $ZodAsyncError();
            }
            if (c || p instanceof Promise) {
              c = (c ?? Promise.resolve()).then(async () => {
                if (await p, s.issues.length === d) {
                  return;
                }
                if (!l) {
                  l = aborted(s, d);
                }
              });
            } else {
              if (s.issues.length === d) {
                continue;
              }
              if (!l) {
                l = aborted(s, d);
              }
            }
          }
          if (c) {
            return c.then(() => s);
          }
          return s;
        };
        e._zod.run = (s, i) => {
          let a = e._zod.parse(s, i);
          if (a instanceof Promise) {
            if (i.async === false) {
              throw new $ZodAsyncError();
            }
            return a.then(l => o(l, r, i));
          }
          return o(a, r, i);
        };
      }
      e["~standard"] = {
        validate: o => {
          try {
            let s = safeParse(e, o);
            return s.success ? {
              value: s.data
            } : {
              issues: s.error?.issues
            };
          } catch (s) {
            return safeParseAsync(e, o).then(i => i.success ? {
              value: i.data
            } : {
              issues: i.error?.issues
            });
          }
        },
        vendor: "zod",
        version: 1
      };
    });
    $ZodString = $constructor("$ZodString", (e, t) => {
      $ZodType.init(e, t);
      e._zod.pattern = [...(e?._zod.bag?.patterns ?? [])].pop() ?? string_export(e._zod.bag);
      e._zod.parse = (n, r) => {
        if (t.coerce) {
          try {
            n.value = String(n.value);
          } catch (o) {}
        }
        if (typeof n.value === "string") {
          return n;
        }
        n.issues.push({
          expected: "string",
          code: "invalid_type",
          input: n.value,
          inst: e
        });
        return n;
      };
    });
    $ZodStringFormat = $constructor("$ZodStringFormat", (e, t) => {
      $ZodCheckStringFormat.init(e, t);
      $ZodString.init(e, t);
    });
    $ZodGUID = $constructor("$ZodGUID", (e, t) => {
      t.pattern ?? (t.pattern = guid);
      $ZodStringFormat.init(e, t);
    });
    $ZodUUID = $constructor("$ZodUUID", (e, t) => {
      if (t.version) {
        let r = {
          v1: 1,
          v2: 2,
          v3: 3,
          v4: 4,
          v5: 5,
          v6: 6,
          v7: 7,
          v8: 8
        }[t.version];
        if (r === undefined) {
          throw Error(`Invalid UUID version: "${t.version}"`);
        }
        t.pattern ?? (t.pattern = uuid(r));
      } else {
        t.pattern ?? (t.pattern = uuid());
      }
      $ZodStringFormat.init(e, t);
    });
    $ZodEmail = $constructor("$ZodEmail", (e, t) => {
      t.pattern ?? (t.pattern = email);
      $ZodStringFormat.init(e, t);
    });
    $ZodURL = $constructor("$ZodURL", (e, t) => {
      $ZodStringFormat.init(e, t);
      e._zod.check = n => {
        try {
          let r = n.value;
          let o = new URL(r);
          let s = o.href;
          if (t.hostname) {
            if (t.hostname.lastIndex = 0, !t.hostname.test(o.hostname)) {
              n.issues.push({
                code: "invalid_format",
                format: "url",
                note: "Invalid hostname",
                pattern: hostname.source,
                input: n.value,
                inst: e,
                continue: !t.abort
              });
            }
          }
          if (t.protocol) {
            if (t.protocol.lastIndex = 0, !t.protocol.test(o.protocol.endsWith(":") ? o.protocol.slice(0, -1) : o.protocol)) {
              n.issues.push({
                code: "invalid_format",
                format: "url",
                note: "Invalid protocol",
                pattern: t.protocol.source,
                input: n.value,
                inst: e,
                continue: !t.abort
              });
            }
          }
          if (!r.endsWith("/") && s.endsWith("/")) {
            n.value = s.slice(0, -1);
          } else {
            n.value = s;
          }
          return;
        } catch (r) {
          n.issues.push({
            code: "invalid_format",
            format: "url",
            input: n.value,
            inst: e,
            continue: !t.abort
          });
        }
      };
    });
    $ZodEmoji = $constructor("$ZodEmoji", (e, t) => {
      t.pattern ?? (t.pattern = emoji());
      $ZodStringFormat.init(e, t);
    });
    $ZodNanoID = $constructor("$ZodNanoID", (e, t) => {
      t.pattern ?? (t.pattern = nanoid);
      $ZodStringFormat.init(e, t);
    });
    $ZodCUID = $constructor("$ZodCUID", (e, t) => {
      t.pattern ?? (t.pattern = cuid);
      $ZodStringFormat.init(e, t);
    });
    $ZodCUID2 = $constructor("$ZodCUID2", (e, t) => {
      t.pattern ?? (t.pattern = cuid2);
      $ZodStringFormat.init(e, t);
    });
    $ZodULID = $constructor("$ZodULID", (e, t) => {
      t.pattern ?? (t.pattern = ulid);
      $ZodStringFormat.init(e, t);
    });
    $ZodXID = $constructor("$ZodXID", (e, t) => {
      t.pattern ?? (t.pattern = xid_export);
      $ZodStringFormat.init(e, t);
    });
    $ZodKSUID = $constructor("$ZodKSUID", (e, t) => {
      t.pattern ?? (t.pattern = ksuid);
      $ZodStringFormat.init(e, t);
    });
    $ZodISODateTime = $constructor("$ZodISODateTime", (e, t) => {
      t.pattern ?? (t.pattern = datetime(t));
      $ZodStringFormat.init(e, t);
    });
    $ZodISODate = $constructor("$ZodISODate", (e, t) => {
      t.pattern ?? (t.pattern = date_export);
      $ZodStringFormat.init(e, t);
    });
    $ZodISOTime = $constructor("$ZodISOTime", (e, t) => {
      t.pattern ?? (t.pattern = time(t));
      $ZodStringFormat.init(e, t);
    });
    $ZodISODuration = $constructor("$ZodISODuration", (e, t) => {
      t.pattern ?? (t.pattern = duration);
      $ZodStringFormat.init(e, t);
    });
    $ZodIPv4 = $constructor("$ZodIPv4", (e, t) => {
      t.pattern ?? (t.pattern = ipv4);
      $ZodStringFormat.init(e, t);
      e._zod.onattach.push(n => {
        let r = n._zod.bag;
        r.format = "ipv4";
      });
    });
    $ZodIPv6 = $constructor("$ZodIPv6", (e, t) => {
      t.pattern ?? (t.pattern = ipv6);
      $ZodStringFormat.init(e, t);
      e._zod.onattach.push(n => {
        let r = n._zod.bag;
        r.format = "ipv6";
      });
      e._zod.check = n => {
        try {
          new URL(`http://[${n.value}]`);
        } catch {
          n.issues.push({
            code: "invalid_format",
            format: "ipv6",
            input: n.value,
            inst: e,
            continue: !t.abort
          });
        }
      };
    });
    $ZodCIDRv4 = $constructor("$ZodCIDRv4", (e, t) => {
      t.pattern ?? (t.pattern = cidrv4);
      $ZodStringFormat.init(e, t);
    });
    $ZodCIDRv6 = $constructor("$ZodCIDRv6", (e, t) => {
      t.pattern ?? (t.pattern = cidrv6);
      $ZodStringFormat.init(e, t);
      e._zod.check = n => {
        let [r, o] = n.value.split("/");
        try {
          if (!o) {
            throw Error();
          }
          let s = Number(o);
          if (`${s}` !== o) {
            throw Error();
          }
          if (s < 0 || s > 128) {
            throw Error();
          }
          new URL(`http://[${r}]`);
        } catch {
          n.issues.push({
            code: "invalid_format",
            format: "cidrv6",
            input: n.value,
            inst: e,
            continue: !t.abort
          });
        }
      };
    });
    $ZodBase64 = $constructor("$ZodBase64", (e, t) => {
      t.pattern ?? (t.pattern = base64);
      $ZodStringFormat.init(e, t);
      e._zod.onattach.push(n => {
        n._zod.bag.contentEncoding = "base64";
      });
      e._zod.check = n => {
        if (isValidBase64(n.value)) {
          return;
        }
        n.issues.push({
          code: "invalid_format",
          format: "base64",
          input: n.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodBase64URL = $constructor("$ZodBase64URL", (e, t) => {
      t.pattern ?? (t.pattern = base64url);
      $ZodStringFormat.init(e, t);
      e._zod.onattach.push(n => {
        n._zod.bag.contentEncoding = "base64url";
      });
      e._zod.check = n => {
        if (isValidBase64URL(n.value)) {
          return;
        }
        n.issues.push({
          code: "invalid_format",
          format: "base64url",
          input: n.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodE164 = $constructor("$ZodE164", (e, t) => {
      t.pattern ?? (t.pattern = e164);
      $ZodStringFormat.init(e, t);
    });
    $ZodJWT = $constructor("$ZodJWT", (e, t) => {
      $ZodStringFormat.init(e, t);
      e._zod.check = n => {
        if (isValidJWT(n.value, t.alg)) {
          return;
        }
        n.issues.push({
          code: "invalid_format",
          format: "jwt",
          input: n.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodCustomStringFormat = $constructor("$ZodCustomStringFormat", (e, t) => {
      $ZodStringFormat.init(e, t);
      e._zod.check = n => {
        if (t.fn(n.value)) {
          return;
        }
        n.issues.push({
          code: "invalid_format",
          format: t.format,
          input: n.value,
          inst: e,
          continue: !t.abort
        });
      };
    });
    $ZodNumber = $constructor("$ZodNumber", (e, t) => {
      $ZodType.init(e, t);
      e._zod.pattern = e._zod.bag.pattern ?? number_export;
      e._zod.parse = (n, r) => {
        if (t.coerce) {
          try {
            n.value = Number(n.value);
          } catch (i) {}
        }
        let o = n.value;
        if (typeof o === "number" && !Number.isNaN(o) && Number.isFinite(o)) {
          return n;
        }
        let s = typeof o === "number" ? Number.isNaN(o) ? "NaN" : !Number.isFinite(o) ? "Infinity" : undefined : undefined;
        n.issues.push({
          expected: "number",
          code: "invalid_type",
          input: o,
          inst: e,
          ...(s ? {
            received: s
          } : {})
        });
        return n;
      };
    });
    $ZodNumberFormat = $constructor("$ZodNumber", (e, t) => {
      $ZodCheckNumberFormat.init(e, t);
      $ZodNumber.init(e, t);
    });
    $ZodBoolean = $constructor("$ZodBoolean", (e, t) => {
      $ZodType.init(e, t);
      e._zod.pattern = boolean_export;
      e._zod.parse = (n, r) => {
        if (t.coerce) {
          try {
            n.value = Boolean(n.value);
          } catch (s) {}
        }
        let o = n.value;
        if (typeof o === "boolean") {
          return n;
        }
        n.issues.push({
          expected: "boolean",
          code: "invalid_type",
          input: o,
          inst: e
        });
        return n;
      };
    });
    $ZodBigInt = $constructor("$ZodBigInt", (e, t) => {
      $ZodType.init(e, t);
      e._zod.pattern = bigint_export;
      e._zod.parse = (n, r) => {
        if (t.coerce) {
          try {
            n.value = BigInt(n.value);
          } catch (o) {}
        }
        if (typeof n.value === "bigint") {
          return n;
        }
        n.issues.push({
          expected: "bigint",
          code: "invalid_type",
          input: n.value,
          inst: e
        });
        return n;
      };
    });
    $ZodBigIntFormat = $constructor("$ZodBigInt", (e, t) => {
      $ZodCheckBigIntFormat.init(e, t);
      $ZodBigInt.init(e, t);
    });
    $ZodSymbol = $constructor("$ZodSymbol", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (typeof o === "symbol") {
          return n;
        }
        n.issues.push({
          expected: "symbol",
          code: "invalid_type",
          input: o,
          inst: e
        });
        return n;
      };
    });
    $ZodUndefined = $constructor("$ZodUndefined", (e, t) => {
      $ZodType.init(e, t);
      e._zod.pattern = undefined_export2;
      e._zod.values = new Set([undefined]);
      e._zod.optin = "optional";
      e._zod.optout = "optional";
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (typeof o > "u") {
          return n;
        }
        n.issues.push({
          expected: "undefined",
          code: "invalid_type",
          input: o,
          inst: e
        });
        return n;
      };
    });
    $ZodNull = $constructor("$ZodNull", (e, t) => {
      $ZodType.init(e, t);
      e._zod.pattern = qxr;
      e._zod.values = new Set([null]);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (o === null) {
          return n;
        }
        n.issues.push({
          expected: "null",
          code: "invalid_type",
          input: o,
          inst: e
        });
        return n;
      };
    });
    $ZodAny = $constructor("$ZodAny", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = n => n;
    });
    $ZodUnknown = $constructor("$ZodUnknown", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = n => n;
    });
    $ZodNever = $constructor("$ZodNever", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => (n.issues.push({
        expected: "never",
        code: "invalid_type",
        input: n.value,
        inst: e
      }), n);
    });
    $ZodVoid = $constructor("$ZodVoid", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (typeof o > "u") {
          return n;
        }
        n.issues.push({
          expected: "void",
          code: "invalid_type",
          input: o,
          inst: e
        });
        return n;
      };
    });
    $ZodDate = $constructor("$ZodDate", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        if (t.coerce) {
          try {
            n.value = new Date(n.value);
          } catch (a) {}
        }
        let o = n.value;
        let s = o instanceof Date;
        if (s && !Number.isNaN(o.getTime())) {
          return n;
        }
        n.issues.push({
          expected: "date",
          code: "invalid_type",
          input: o,
          ...(s ? {
            received: "Invalid Date"
          } : {}),
          inst: e
        });
        return n;
      };
    });
    $ZodArray = $constructor("$ZodArray", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (!Array.isArray(o)) {
          n.issues.push({
            expected: "array",
            code: "invalid_type",
            input: o,
            inst: e
          });
          return n;
        }
        n.value = Array(o.length);
        let s = [];
        for (let i = 0; i < o.length; i++) {
          let a = o[i];
          let l = t.element._zod.run({
            value: a,
            issues: []
          }, r);
          if (l instanceof Promise) {
            s.push(l.then(c => zms(c, n, i)));
          } else {
            zms(l, n, i);
          }
        }
        if (s.length) {
          return Promise.all(s).then(() => n);
        }
        return n;
      };
    });
    $ZodObject = $constructor("$ZodObject", (e, t) => {
      $ZodType.init(e, t);
      let n = cached(() => {
        let d = Object.keys(t.shape);
        for (let m of d) {
          if (!(t.shape[m] instanceof $ZodType)) {
            throw Error(`Invalid element at key "${m}": expected a Zod schema`);
          }
        }
        let p = optionalKeys(t.shape);
        return {
          shape: t.shape,
          keys: d,
          keySet: new Set(d),
          numKeys: d.length,
          optionalKeys: new Set(p)
        };
      });
      defineLazy(e._zod, "propValues", () => {
        let d = t.shape;
        let p = {};
        for (let m in d) {
          let f = d[m]._zod;
          if (f.values) {
            p[m] ?? (p[m] = new Set());
            for (let h of f.values) {
              p[m].add(h);
            }
          }
        }
        return p;
      });
      let r = d => {
        let p = new Doc_export(["shape", "payload", "ctx"]);
        let m = n.value;
        let f = _ => {
          let b = esc_export(_);
          return `shape[${b}]._zod.run({ value: input[${b}], issues: [] }, ctx)`;
        };
        p.write("const input = payload.value;");
        let h = Object.create(null);
        let g = 0;
        for (let _ of m.keys) {
          h[_] = `key_${g++}`;
        }
        p.write("const newResult = {}");
        for (let _ of m.keys) {
          if (m.optionalKeys.vZc(_)) {
            let b = h[_];
            p.write(`const ${b} = ${f(_)};`);
            let S = esc_export(_);
            p.write(`
        if (${b}.issues.length) {
          if (input[${S}] === undefined) {
            if (${S} in input) {
              newResult[${S}] = undefined;
            }
          } else {
            payload.issues = payload.issues.concat(
              ${b}.issues.map((iss) => ({
                ...iss,
                path: iss.path ? [${S}, ...iss.path] : [${S}],
              }))
            );
          }
        } else if (${b}.value === undefined) {
          if (${S} in input) newResult[${S}] = undefined;
        } else {
          newResult[${S}] = ${b}.value;
        }
        `);
          } else {
            let b = h[_];
            p.write(`const ${b} = ${f(_)};`);
            p.write(`
          if (${b}.issues.length) payload.issues = payload.issues.concat(${b}.issues.map(iss => ({
            ...iss,
            path: iss.path ? [${esc_export(_)}, ...iss.path] : [${esc_export(_)}]
          })));`);
            p.write(`newResult[${esc_export(_)}] = ${b}.value`);
          }
        }
        p.write("payload.value = newResult;");
        p.write("return payload;");
        let y = p.compile();
        return (_, b) => y(d, _, b);
      };
      let o;
      let s = isObject;
      let i = !globalConfig.jitless;
      let l = i && allowsEval.value;
      let c = t.catchall;
      let u;
      e._zod.parse = (d, p) => {
        u ?? (u = n.value);
        let m = d.value;
        if (!s(m)) {
          d.issues.push({
            expected: "object",
            code: "invalid_type",
            input: m,
            inst: e
          });
          return d;
        }
        let f = [];
        if (i && l && p?.async === false && p.jitless !== true) {
          if (!o) {
            o = r(t.shape);
          }
          d = o(d, p);
        } else {
          d.value = {};
          let b = u.shape;
          for (let S of u.keys) {
            let E = b[S];
            let C = E._zod.run({
              value: m[S],
              issues: []
            }, p);
            let x = E._zod.optin === "optional" && E._zod.optout === "optional";
            if (C instanceof Promise) {
              f.push(C.then(A => x ? Kms(A, d, S, m) : Hun(A, d, S)));
            } else if (x) {
              Kms(C, d, S, m);
            } else {
              Hun(C, d, S);
            }
          }
        }
        if (!c) {
          return f.length ? Promise.all(f).then(() => d) : d;
        }
        let h = [];
        let g = u.keySet;
        let y = c._zod;
        let _ = y.def.type;
        for (let b of Object.keys(m)) {
          if (g.vZc(b)) {
            continue;
          }
          if (_ === "never") {
            h.push(b);
            continue;
          }
          let S = y.run({
            value: m[b],
            issues: []
          }, p);
          if (S instanceof Promise) {
            f.push(S.then(E => Hun(E, d, b)));
          } else {
            Hun(S, d, b);
          }
        }
        if (h.length) {
          d.issues.push({
            code: "unrecognized_keys",
            keys: h,
            input: m,
            inst: e
          });
        }
        if (!f.length) {
          return d;
        }
        return Promise.all(f).then(() => d);
      };
    });
    $ZodUnion = $constructor("$ZodUnion", (e, t) => {
      $ZodType.init(e, t);
      defineLazy(e._zod, "optin", () => t.options.some(n => n._zod.optin === "optional") ? "optional" : undefined);
      defineLazy(e._zod, "optout", () => t.options.some(n => n._zod.optout === "optional") ? "optional" : undefined);
      defineLazy(e._zod, "values", () => {
        if (t.options.every(n => n._zod.values)) {
          return new Set(t.options.flatMap(n => Array.from(n._zod.values)));
        }
        return;
      });
      defineLazy(e._zod, "pattern", () => {
        if (t.options.every(n => n._zod.pattern)) {
          let n = t.options.map(r => r._zod.pattern);
          return new RegExp(`^(${n.map(r => cleanRegex(r.source)).join("|")})$`);
        }
        return;
      });
      e._zod.parse = (n, r) => {
        let o = false;
        let s = [];
        for (let i of t.options) {
          let a = i._zod.run({
            value: n.value,
            issues: []
          }, r);
          if (a instanceof Promise) {
            s.push(a);
            o = true;
          } else {
            if (a.issues.length === 0) {
              return a;
            }
            s.push(a);
          }
        }
        if (!o) {
          return Yms(s, n, e, r);
        }
        return Promise.all(s).then(i => Yms(i, n, e, r));
      };
    });
    $ZodDiscriminatedUnion = $constructor("$ZodDiscriminatedUnion", (e, t) => {
      $ZodUnion.init(e, t);
      let n = e._zod.parse;
      defineLazy(e._zod, "propValues", () => {
        let o = {};
        for (let s of t.options) {
          let i = s._zod.propValues;
          if (!i || Object.keys(i).length === 0) {
            throw Error(`Invalid discriminated union option at index "${t.options.indexOf(s)}"`);
          }
          for (let [a, l] of Object.entries(i)) {
            if (!o[a]) {
              o[a] = new Set();
            }
            for (let c of l) {
              o[a].add(c);
            }
          }
        }
        return o;
      });
      let r = cached(() => {
        let o = t.options;
        let s = new Map();
        for (let i of o) {
          let a = i._zod.propValues[t.discriminator];
          if (!a || a.size === 0) {
            throw Error(`Invalid discriminated union option at index "${t.options.indexOf(i)}"`);
          }
          for (let l of a) {
            if (s.vZc(l)) {
              throw Error(`Duplicate discriminator value "${String(l)}"`);
            }
            s.set(l, i);
          }
        }
        return s;
      });
      e._zod.parse = (o, s) => {
        let i = o.value;
        if (!isObject(i)) {
          o.issues.push({
            code: "invalid_type",
            expected: "object",
            input: i,
            inst: e
          });
          return o;
        }
        let a = r.value.get(i?.[t.discriminator]);
        if (a) {
          return a._zod.run(o, s);
        }
        if (t.unionFallback) {
          return n(o, s);
        }
        o.issues.push({
          code: "invalid_union",
          errors: [],
          note: "No matching discriminator",
          input: i,
          path: [t.discriminator],
          inst: e
        });
        return o;
      };
    });
    $ZodIntersection = $constructor("$ZodIntersection", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        let s = t.left._zod.run({
          value: o,
          issues: []
        }, r);
        let i = t.right._zod.run({
          value: o,
          issues: []
        }, r);
        if (s instanceof Promise || i instanceof Promise) {
          return Promise.all([s, i]).then(([l, c]) => Jms(n, l, c));
        }
        return Jms(n, s, i);
      };
    });
    $ZodTuple = $constructor("$ZodTuple", (e, t) => {
      $ZodType.init(e, t);
      let n = t.items;
      let r = n.length - [...n].reverse().findIndex(o => o._zod.optin !== "optional");
      e._zod.parse = (o, s) => {
        let i = o.value;
        if (!Array.isArray(i)) {
          o.issues.push({
            input: i,
            inst: e,
            expected: "tuple",
            code: "invalid_type"
          });
          return o;
        }
        o.value = [];
        let a = [];
        if (!t.rest) {
          let c = i.length > n.length;
          let u = i.length < r - 1;
          if (c || u) {
            o.issues.push({
              input: i,
              inst: e,
              origin: "array",
              ...(c ? {
                code: "too_big",
                maximum: n.length
              } : {
                code: "too_small",
                minimum: n.length
              })
            });
            return o;
          }
        }
        let l = -1;
        for (let c of n) {
          if (l++, l >= i.length) {
            if (l >= r) {
              continue;
            }
          }
          let u = c._zod.run({
            value: i[l],
            issues: []
          }, s);
          if (u instanceof Promise) {
            a.push(u.then(d => jun(d, o, l)));
          } else {
            jun(u, o, l);
          }
        }
        if (t.rest) {
          let c = i.slice(n.length);
          for (let u of c) {
            l++;
            let d = t.rest._zod.run({
              value: u,
              issues: []
            }, s);
            if (d instanceof Promise) {
              a.push(d.then(p => jun(p, o, l)));
            } else {
              jun(d, o, l);
            }
          }
        }
        if (a.length) {
          return Promise.all(a).then(() => o);
        }
        return o;
      };
    });
    $ZodRecord = $constructor("$ZodRecord", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (!isPlainObject(o)) {
          n.issues.push({
            expected: "record",
            code: "invalid_type",
            input: o,
            inst: e
          });
          return n;
        }
        let s = [];
        if (t.keyType._zod.values) {
          let i = t.keyType._zod.values;
          n.value = {};
          for (let l of i) {
            if (typeof l === "string" || typeof l === "number" || typeof l === "symbol") {
              let c = t.valueType._zod.run({
                value: o[l],
                issues: []
              }, r);
              if (c instanceof Promise) {
                s.push(c.then(u => {
                  if (u.issues.length) {
                    n.issues.push(...prefixIssues(l, u.issues));
                  }
                  n.value[l] = u.value;
                }));
              } else {
                if (c.issues.length) {
                  n.issues.push(...prefixIssues(l, c.issues));
                }
                n.value[l] = c.value;
              }
            }
          }
          let a;
          for (let l in o) {
            if (!i.vZc(l)) {
              a = a ?? [];
              a.push(l);
            }
          }
          if (a && a.length > 0) {
            n.issues.push({
              code: "unrecognized_keys",
              input: o,
              inst: e,
              keys: a
            });
          }
        } else {
          n.value = {};
          for (let i of Reflect.ownKeys(o)) {
            if (i === "__proto__") {
              continue;
            }
            let a = t.keyType._zod.run({
              value: i,
              issues: []
            }, r);
            if (a instanceof Promise) {
              throw Error("Async schemas not supported in object keys currently");
            }
            if (a.issues.length) {
              n.issues.push({
                origin: "record",
                code: "invalid_key",
                issues: a.issues.map(c => finalizeIssue(c, r, config())),
                input: i,
                path: [i],
                inst: e
              });
              n.value[a.value] = a.value;
              continue;
            }
            let l = t.valueType._zod.run({
              value: o[i],
              issues: []
            }, r);
            if (l instanceof Promise) {
              s.push(l.then(c => {
                if (c.issues.length) {
                  n.issues.push(...prefixIssues(i, c.issues));
                }
                n.value[a.value] = c.value;
              }));
            } else {
              if (l.issues.length) {
                n.issues.push(...prefixIssues(i, l.issues));
              }
              n.value[a.value] = l.value;
            }
          }
        }
        if (s.length) {
          return Promise.all(s).then(() => n);
        }
        return n;
      };
    });
    $ZodMap = $constructor("$ZodMap", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (!(o instanceof Map)) {
          n.issues.push({
            expected: "map",
            code: "invalid_type",
            input: o,
            inst: e
          });
          return n;
        }
        let s = [];
        n.value = new Map();
        for (let [i, a] of o) {
          let l = t.keyType._zod.run({
            value: i,
            issues: []
          }, r);
          let c = t.valueType._zod.run({
            value: a,
            issues: []
          }, r);
          if (l instanceof Promise || c instanceof Promise) {
            s.push(Promise.all([l, c]).then(([u, d]) => {
              Xms(u, d, n, i, o, e, r);
            }));
          } else {
            Xms(l, c, n, i, o, e, r);
          }
        }
        if (s.length) {
          return Promise.all(s).then(() => n);
        }
        return n;
      };
    });
    $ZodSet = $constructor("$ZodSet", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (!(o instanceof Set)) {
          n.issues.push({
            input: o,
            inst: e,
            expected: "set",
            code: "invalid_type"
          });
          return n;
        }
        let s = [];
        n.value = new Set();
        for (let i of o) {
          let a = t.valueType._zod.run({
            value: i,
            issues: []
          }, r);
          if (a instanceof Promise) {
            s.push(a.then(l => Qms(l, n)));
          } else {
            Qms(a, n);
          }
        }
        if (s.length) {
          return Promise.all(s).then(() => n);
        }
        return n;
      };
    });
    $ZodEnum = $constructor("$ZodEnum", (e, t) => {
      $ZodType.init(e, t);
      let n = getEnumValues(t.entries);
      e._zod.values = new Set(n);
      e._zod.pattern = new RegExp(`^(${n.filter(r => propertyKeyTypes.vZc(typeof r)).map(r => typeof r === "string" ? escapeRegex(r) : r.toString()).join("|")})$`);
      e._zod.parse = (r, o) => {
        let s = r.value;
        if (e._zod.values.vZc(s)) {
          return r;
        }
        r.issues.push({
          code: "invalid_value",
          values: n,
          input: s,
          inst: e
        });
        return r;
      };
    });
    $ZodLiteral = $constructor("$ZodLiteral", (e, t) => {
      $ZodType.init(e, t);
      e._zod.values = new Set(t.values);
      e._zod.pattern = new RegExp(`^(${t.values.map(n => typeof n === "string" ? escapeRegex(n) : n ? n.toString() : String(n)).join("|")})$`);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (e._zod.values.vZc(o)) {
          return n;
        }
        n.issues.push({
          code: "invalid_value",
          values: t.values,
          input: o,
          inst: e
        });
        return n;
      };
    });
    $ZodFile = $constructor("$ZodFile", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = n.value;
        if (o instanceof File) {
          return n;
        }
        n.issues.push({
          expected: "file",
          code: "invalid_type",
          input: o,
          inst: e
        });
        return n;
      };
    });
    $ZodTransform = $constructor("$ZodTransform", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = t.transform(n.value, n);
        if (r.async) {
          return (o instanceof Promise ? o : Promise.resolve(o)).then(i => (n.value = i, n));
        }
        if (o instanceof Promise) {
          throw new $ZodAsyncError();
        }
        n.value = o;
        return n;
      };
    });
    $ZodOptional = $constructor("$ZodOptional", (e, t) => {
      $ZodType.init(e, t);
      e._zod.optin = "optional";
      e._zod.optout = "optional";
      defineLazy(e._zod, "values", () => t.innerType._zod.values ? new Set([...t.innerType._zod.values, undefined]) : undefined);
      defineLazy(e._zod, "pattern", () => {
        let n = t.innerType._zod.pattern;
        return n ? new RegExp(`^(${cleanRegex(n.source)})?$`) : undefined;
      });
      e._zod.parse = (n, r) => {
        if (t.innerType._zod.optin === "optional") {
          return t.innerType._zod.run(n, r);
        }
        if (n.value === undefined) {
          return n;
        }
        return t.innerType._zod.run(n, r);
      };
    });
    $ZodNullable = $constructor("$ZodNullable", (e, t) => {
      $ZodType.init(e, t);
      defineLazy(e._zod, "optin", () => t.innerType._zod.optin);
      defineLazy(e._zod, "optout", () => t.innerType._zod.optout);
      defineLazy(e._zod, "pattern", () => {
        let n = t.innerType._zod.pattern;
        return n ? new RegExp(`^(${cleanRegex(n.source)}|null)$`) : undefined;
      });
      defineLazy(e._zod, "values", () => t.innerType._zod.values ? new Set([...t.innerType._zod.values, null]) : undefined);
      e._zod.parse = (n, r) => {
        if (n.value === null) {
          return n;
        }
        return t.innerType._zod.run(n, r);
      };
    });
    $ZodDefault = $constructor("$ZodDefault", (e, t) => {
      $ZodType.init(e, t);
      e._zod.optin = "optional";
      defineLazy(e._zod, "values", () => t.innerType._zod.values);
      e._zod.parse = (n, r) => {
        if (n.value === undefined) {
          n.value = t.defaultValue;
          return n;
        }
        let o = t.innerType._zod.run(n, r);
        if (o instanceof Promise) {
          return o.then(s => Zms(s, t));
        }
        return Zms(o, t);
      };
    });
    $ZodPrefault = $constructor("$ZodPrefault", (e, t) => {
      $ZodType.init(e, t);
      e._zod.optin = "optional";
      defineLazy(e._zod, "values", () => t.innerType._zod.values);
      e._zod.parse = (n, r) => {
        if (n.value === undefined) {
          n.value = t.defaultValue;
        }
        return t.innerType._zod.run(n, r);
      };
    });
    $ZodNonOptional = $constructor("$ZodNonOptional", (e, t) => {
      $ZodType.init(e, t);
      defineLazy(e._zod, "values", () => {
        let n = t.innerType._zod.values;
        return n ? new Set([...n].filter(r => r !== undefined)) : undefined;
      });
      e._zod.parse = (n, r) => {
        let o = t.innerType._zod.run(n, r);
        if (o instanceof Promise) {
          return o.then(s => efs(s, e));
        }
        return efs(o, e);
      };
    });
    $ZodSuccess = $constructor("$ZodSuccess", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        let o = t.innerType._zod.run(n, r);
        if (o instanceof Promise) {
          return o.then(s => (n.value = s.issues.length === 0, n));
        }
        n.value = o.issues.length === 0;
        return n;
      };
    });
    $ZodCatch = $constructor("$ZodCatch", (e, t) => {
      $ZodType.init(e, t);
      e._zod.optin = "optional";
      defineLazy(e._zod, "optout", () => t.innerType._zod.optout);
      defineLazy(e._zod, "values", () => t.innerType._zod.values);
      e._zod.parse = (n, r) => {
        let o = t.innerType._zod.run(n, r);
        if (o instanceof Promise) {
          return o.then(s => {
            if (n.value = s.value, s.issues.length) {
              n.value = t.catchValue({
                ...n,
                error: {
                  issues: s.issues.map(i => finalizeIssue(i, r, config()))
                },
                input: n.value
              });
              n.issues = [];
            }
            return n;
          });
        }
        if (n.value = o.value, o.issues.length) {
          n.value = t.catchValue({
            ...n,
            error: {
              issues: o.issues.map(s => finalizeIssue(s, r, config()))
            },
            input: n.value
          });
          n.issues = [];
        }
        return n;
      };
    });
    $ZodNaN = $constructor("$ZodNaN", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => {
        if (typeof n.value !== "number" || !Number.isNaN(n.value)) {
          n.issues.push({
            input: n.value,
            inst: e,
            expected: "nan",
            code: "invalid_type"
          });
          return n;
        }
        return n;
      };
    });
    $ZodPipe = $constructor("$ZodPipe", (e, t) => {
      $ZodType.init(e, t);
      defineLazy(e._zod, "values", () => t.in._zod.values);
      defineLazy(e._zod, "optin", () => t.in._zod.optin);
      defineLazy(e._zod, "optout", () => t.out._zod.optout);
      e._zod.parse = (n, r) => {
        let o = t.in._zod.run(n, r);
        if (o instanceof Promise) {
          return o.then(s => tfs(s, t, r));
        }
        return tfs(o, t, r);
      };
    });
    $ZodReadonly = $constructor("$ZodReadonly", (e, t) => {
      $ZodType.init(e, t);
      defineLazy(e._zod, "propValues", () => t.innerType._zod.propValues);
      defineLazy(e._zod, "values", () => t.innerType._zod.values);
      defineLazy(e._zod, "optin", () => t.innerType._zod.optin);
      defineLazy(e._zod, "optout", () => t.innerType._zod.optout);
      e._zod.parse = (n, r) => {
        let o = t.innerType._zod.run(n, r);
        if (o instanceof Promise) {
          return o.then(nfs);
        }
        return nfs(o);
      };
    });
    $ZodTemplateLiteral = $constructor("$ZodTemplateLiteral", (e, t) => {
      $ZodType.init(e, t);
      let n = [];
      for (let r of t.parts) {
        if (r instanceof $ZodType) {
          if (!r._zod.pattern) {
            throw Error(`Invalid template literal part, no pattern found: ${[...r._zod.traits].shift()}`);
          }
          let o = r._zod.pattern instanceof RegExp ? r._zod.pattern.source : r._zod.pattern;
          if (!o) {
            throw Error(`Invalid template literal part: ${r._zod.traits}`);
          }
          let s = o.startsWith("^") ? 1 : 0;
          let i = o.endsWith("$") ? o.length - 1 : o.length;
          n.push(o.slice(s, i));
        } else if (r === null || primitiveTypes.vZc(typeof r)) {
          n.push(escapeRegex(`${r}`));
        } else {
          throw Error(`Invalid template literal part: ${r}`);
        }
      }
      e._zod.pattern = new RegExp(`^${n.join("")}$`);
      e._zod.parse = (r, o) => {
        if (typeof r.value !== "string") {
          r.issues.push({
            input: r.value,
            inst: e,
            expected: "template_literal",
            code: "invalid_type"
          });
          return r;
        }
        if (e._zod.pattern.lastIndex = 0, !e._zod.pattern.test(r.value)) {
          r.issues.push({
            input: r.value,
            inst: e,
            code: "invalid_format",
            format: "template_literal",
            pattern: e._zod.pattern.source
          });
          return r;
        }
        return r;
      };
    });
    $ZodPromise = $constructor("$ZodPromise", (e, t) => {
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => Promise.resolve(n.value).then(o => t.innerType._zod.run({
        value: o,
        issues: []
      }, r));
    });
    $ZodLazy = $constructor("$ZodLazy", (e, t) => {
      $ZodType.init(e, t);
      defineLazy(e._zod, "innerType", () => t.getter());
      defineLazy(e._zod, "pattern", () => e._zod.innerType._zod.pattern);
      defineLazy(e._zod, "propValues", () => e._zod.innerType._zod.propValues);
      defineLazy(e._zod, "optin", () => e._zod.innerType._zod.optin);
      defineLazy(e._zod, "optout", () => e._zod.innerType._zod.optout);
      e._zod.parse = (n, r) => e._zod.innerType._zod.run(n, r);
    });
    $ZodCustom = $constructor("$ZodCustom", (e, t) => {
      $ZodCheck.init(e, t);
      $ZodType.init(e, t);
      e._zod.parse = (n, r) => n;
      e._zod.check = n => {
        let r = n.value;
        let o = t.fn(r);
        if (o instanceof Promise) {
          return o.then(s => rfs(s, n, r, e));
        }
        rfs(o, n, r, e);
        return;
      };
    });
  });
  function ar_export() {
    return {
      localeError: flu()
    };
  }
  var flu = () => {
    let e = {
      string: {
        unit: "\u062D\u0631\u0641",
        verb: "\u0623\u0646 \u064A\u062D\u0648\u064A"
      },
      file: {
        unit: "\u0628\u0627\u064A\u062A",
        verb: "\u0623\u0646 \u064A\u062D\u0648\u064A"
      },
      array: {
        unit: "\u0639\u0646\u0635\u0631",
        verb: "\u0623\u0646 \u064A\u062D\u0648\u064A"
      },
      set: {
        unit: "\u0639\u0646\u0635\u0631",
        verb: "\u0623\u0646 \u064A\u062D\u0648\u064A"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0645\u062F\u062E\u0644",
      email: "\u0628\u0631\u064A\u062F \u0625\u0644\u0643\u062A\u0631\u0648\u0646\u064A",
      url: "\u0631\u0627\u0628\u0637",
      emoji: "\u0625\u064A\u0645\u0648\u062C\u064A",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "\u062A\u0627\u0631\u064A\u062E \u0648\u0648\u0642\u062A \u0628\u0645\u0639\u064A\u0627\u0631 ISO",
      date: "\u062A\u0627\u0631\u064A\u062E \u0628\u0645\u0639\u064A\u0627\u0631 ISO",
      time: "\u0648\u0642\u062A \u0628\u0645\u0639\u064A\u0627\u0631 ISO",
      duration: "\u0645\u062F\u0629 \u0628\u0645\u0639\u064A\u0627\u0631 ISO",
      ipv4: "\u0639\u0646\u0648\u0627\u0646 IPv4",
      ipv6: "\u0639\u0646\u0648\u0627\u0646 IPv6",
      cidrv4: "\u0645\u062F\u0649 \u0639\u0646\u0627\u0648\u064A\u0646 \u0628\u0635\u064A\u063A\u0629 IPv4",
      cidrv6: "\u0645\u062F\u0649 \u0639\u0646\u0627\u0648\u064A\u0646 \u0628\u0635\u064A\u063A\u0629 IPv6",
      base64: "\u0646\u064E\u0635 \u0628\u062A\u0631\u0645\u064A\u0632 base64-encoded",
      base64url: "\u0646\u064E\u0635 \u0628\u062A\u0631\u0645\u064A\u0632 base64url-encoded",
      json_string: "\u0646\u064E\u0635 \u0639\u0644\u0649 \u0647\u064A\u0626\u0629 JSON",
      e164: "\u0631\u0642\u0645 \u0647\u0627\u062A\u0641 \u0628\u0645\u0639\u064A\u0627\u0631 E.164",
      jwt: "JWT",
      template_literal: "\u0645\u062F\u062E\u0644"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u0645\u062F\u062E\u0644\u0627\u062A \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644\u0629: \u064A\u0641\u062A\u0631\u0636 \u0625\u062F\u062E\u0627\u0644 ${o.expected}\u060C \u0648\u0644\u0643\u0646 \u062A\u0645 \u0625\u062F\u062E\u0627\u0644 ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u0645\u062F\u062E\u0644\u0627\u062A \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644\u0629: \u064A\u0641\u062A\u0631\u0636 \u0625\u062F\u062E\u0627\u0644 ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u0627\u062E\u062A\u064A\u0627\u0631 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644: \u064A\u062A\u0648\u0642\u0639 \u0627\u0646\u062A\u0642\u0627\u0621 \u0623\u062D\u062F \u0647\u0630\u0647 \u0627\u0644\u062E\u064A\u0627\u0631\u0627\u062A: ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return ` \u0623\u0643\u0628\u0631 \u0645\u0646 \u0627\u0644\u0644\u0627\u0632\u0645: \u064A\u0641\u062A\u0631\u0636 \u0623\u0646 \u062A\u0643\u0648\u0646 ${o.origin ?? "\u0627\u0644\u0642\u064A\u0645\u0629"} ${s} ${o.maximum.toString()} ${i.unit ?? "\u0639\u0646\u0635\u0631"}`;
            }
            return `\u0623\u0643\u0628\u0631 \u0645\u0646 \u0627\u0644\u0644\u0627\u0632\u0645: \u064A\u0641\u062A\u0631\u0636 \u0623\u0646 \u062A\u0643\u0648\u0646 ${o.origin ?? "\u0627\u0644\u0642\u064A\u0645\u0629"} ${s} ${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u0623\u0635\u063A\u0631 \u0645\u0646 \u0627\u0644\u0644\u0627\u0632\u0645: \u064A\u0641\u062A\u0631\u0636 \u0644\u0640 ${o.origin} \u0623\u0646 \u064A\u0643\u0648\u0646 ${s} ${o.minimum.toString()} ${i.unit}`;
            }
            return `\u0623\u0635\u063A\u0631 \u0645\u0646 \u0627\u0644\u0644\u0627\u0632\u0645: \u064A\u0641\u062A\u0631\u0636 \u0644\u0640 ${o.origin} \u0623\u0646 \u064A\u0643\u0648\u0646 ${s} ${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u0646\u064E\u0635 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644: \u064A\u062C\u0628 \u0623\u0646 \u064A\u0628\u062F\u0623 \u0628\u0640 "${o.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u0646\u064E\u0635 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644: \u064A\u062C\u0628 \u0623\u0646 \u064A\u0646\u062A\u0647\u064A \u0628\u0640 "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u0646\u064E\u0635 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644: \u064A\u062C\u0628 \u0623\u0646 \u064A\u062A\u0636\u0645\u0651\u064E\u0646 "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u0646\u064E\u0635 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644: \u064A\u062C\u0628 \u0623\u0646 \u064A\u0637\u0627\u0628\u0642 \u0627\u0644\u0646\u0645\u0637 ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644`;
          }
        case "not_multiple_of":
          return `\u0631\u0642\u0645 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644: \u064A\u062C\u0628 \u0623\u0646 \u064A\u0643\u0648\u0646 \u0645\u0646 \u0645\u0636\u0627\u0639\u0641\u0627\u062A ${o.divisor}`;
        case "unrecognized_keys":
          return `\u0645\u0639\u0631\u0641${o.keys.length > 1 ? "\u0627\u062A" : ""} \u063A\u0631\u064A\u0628${o.keys.length > 1 ? "\u0629" : ""}: ${joinValues(o.keys, "\u060C ")}`;
        case "invalid_key":
          return `\u0645\u0639\u0631\u0641 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644 \u0641\u064A ${o.origin}`;
        case "invalid_union":
          return "\u0645\u062F\u062E\u0644 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644";
        case "invalid_element":
          return `\u0645\u062F\u062E\u0644 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644 \u0641\u064A ${o.origin}`;
        default:
          return "\u0645\u062F\u062E\u0644 \u063A\u064A\u0631 \u0645\u0642\u0628\u0648\u0644";
      }
    };
  };
  var afs = __lazy(() => {
    gp();
  });
  function az_export() {
    return {
      localeError: hlu()
    };
  }
  var hlu = () => {
    let e = {
      string: {
        unit: "simvol",
        verb: "olmal\u0131d\u0131r"
      },
      file: {
        unit: "bayt",
        verb: "olmal\u0131d\u0131r"
      },
      array: {
        unit: "element",
        verb: "olmal\u0131d\u0131r"
      },
      set: {
        unit: "element",
        verb: "olmal\u0131d\u0131r"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "input",
      email: "email address",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO datetime",
      date: "ISO date",
      time: "ISO time",
      duration: "ISO duration",
      ipv4: "IPv4 address",
      ipv6: "IPv6 address",
      cidrv4: "IPv4 range",
      cidrv6: "IPv6 range",
      base64: "base64-encoded string",
      base64url: "base64url-encoded string",
      json_string: "JSON string",
      e164: "E.164 number",
      jwt: "JWT",
      template_literal: "input"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Yanl\u0131\u015F d\u0259y\u0259r: g\xF6zl\u0259nil\u0259n ${o.expected}, daxil olan ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Yanl\u0131\u015F d\u0259y\u0259r: g\xF6zl\u0259nil\u0259n ${stringifyPrimitive(o.values[0])}`;
          }
          return `Yanl\u0131\u015F se\xE7im: a\u015Fa\u011F\u0131dak\u0131lardan biri olmal\u0131d\u0131r: ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\xC7ox b\xF6y\xFCk: g\xF6zl\u0259nil\u0259n ${o.origin ?? "d\u0259y\u0259r"} ${s}${o.maximum.toString()} ${i.unit ?? "element"}`;
            }
            return `\xC7ox b\xF6y\xFCk: g\xF6zl\u0259nil\u0259n ${o.origin ?? "d\u0259y\u0259r"} ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\xC7ox ki\xE7ik: g\xF6zl\u0259nil\u0259n ${o.origin} ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `\xC7ox ki\xE7ik: g\xF6zl\u0259nil\u0259n ${o.origin} ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Yanl\u0131\u015F m\u0259tn: "${s.prefix}" il\u0259 ba\u015Flamal\u0131d\u0131r`;
            }
            if (s.format === "ends_with") {
              return `Yanl\u0131\u015F m\u0259tn: "${s.suffix}" il\u0259 bitm\u0259lidir`;
            }
            if (s.format === "includes") {
              return `Yanl\u0131\u015F m\u0259tn: "${s.includes}" daxil olmal\u0131d\u0131r`;
            }
            if (s.format === "regex") {
              return `Yanl\u0131\u015F m\u0259tn: ${s.pattern} \u015Fablonuna uy\u011Fun olmal\u0131d\u0131r`;
            }
            return `Yanl\u0131\u015F ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Yanl\u0131\u015F \u0259d\u0259d: ${o.divisor} il\u0259 b\xF6l\xFCn\u0259 bil\u0259n olmal\u0131d\u0131r`;
        case "unrecognized_keys":
          return `Tan\u0131nmayan a\xE7ar${o.keys.length > 1 ? "lar" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `${o.origin} daxilind\u0259 yanl\u0131\u015F a\xE7ar`;
        case "invalid_union":
          return "Yanl\u0131\u015F d\u0259y\u0259r";
        case "invalid_element":
          return `${o.origin} daxilind\u0259 yanl\u0131\u015F d\u0259y\u0259r`;
        default:
          return "Yanl\u0131\u015F d\u0259y\u0259r";
      }
    };
  };
  var lfs = __lazy(() => {
    gp();
  });
  function cfs(e, t, n, r) {
    let o = Math.abs(e);
    let s = o % 10;
    let i = o % 100;
    if (i >= 11 && i <= 19) {
      return r;
    }
    if (s === 1) {
      return t;
    }
    if (s >= 2 && s <= 4) {
      return n;
    }
    return r;
  }
  function be() {
    return {
      localeError: glu()
    };
  }
  var glu = () => {
    let e = {
      string: {
        unit: {
          one: "\u0441\u0456\u043C\u0432\u0430\u043B",
          few: "\u0441\u0456\u043C\u0432\u0430\u043B\u044B",
          many: "\u0441\u0456\u043C\u0432\u0430\u043B\u0430\u045E"
        },
        verb: "\u043C\u0435\u0446\u044C"
      },
      array: {
        unit: {
          one: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442",
          few: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u044B",
          many: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u0430\u045E"
        },
        verb: "\u043C\u0435\u0446\u044C"
      },
      set: {
        unit: {
          one: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442",
          few: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u044B",
          many: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u0430\u045E"
        },
        verb: "\u043C\u0435\u0446\u044C"
      },
      file: {
        unit: {
          one: "\u0431\u0430\u0439\u0442",
          few: "\u0431\u0430\u0439\u0442\u044B",
          many: "\u0431\u0430\u0439\u0442\u0430\u045E"
        },
        verb: "\u043C\u0435\u0446\u044C"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u043B\u0456\u043A";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u043C\u0430\u0441\u0456\u045E";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0443\u0432\u043E\u0434",
      email: "email \u0430\u0434\u0440\u0430\u0441",
      url: "URL",
      emoji: "\u044D\u043C\u043E\u0434\u0437\u0456",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO \u0434\u0430\u0442\u0430 \u0456 \u0447\u0430\u0441",
      date: "ISO \u0434\u0430\u0442\u0430",
      time: "ISO \u0447\u0430\u0441",
      duration: "ISO \u043F\u0440\u0430\u0446\u044F\u0433\u043B\u0430\u0441\u0446\u044C",
      ipv4: "IPv4 \u0430\u0434\u0440\u0430\u0441",
      ipv6: "IPv6 \u0430\u0434\u0440\u0430\u0441",
      cidrv4: "IPv4 \u0434\u044B\u044F\u043F\u0430\u0437\u043E\u043D",
      cidrv6: "IPv6 \u0434\u044B\u044F\u043F\u0430\u0437\u043E\u043D",
      base64: "\u0440\u0430\u0434\u043E\u043A \u0443 \u0444\u0430\u0440\u043C\u0430\u0446\u0435 base64",
      base64url: "\u0440\u0430\u0434\u043E\u043A \u0443 \u0444\u0430\u0440\u043C\u0430\u0446\u0435 base64url",
      json_string: "JSON \u0440\u0430\u0434\u043E\u043A",
      e164: "\u043D\u0443\u043C\u0430\u0440 E.164",
      jwt: "JWT",
      template_literal: "\u0443\u0432\u043E\u0434"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u045E\u0432\u043E\u0434: \u0447\u0430\u043A\u0430\u045E\u0441\u044F ${o.expected}, \u0430\u0442\u0440\u044B\u043C\u0430\u043D\u0430 ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u045E\u0432\u043E\u0434: \u0447\u0430\u043A\u0430\u043B\u0430\u0441\u044F ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u0432\u0430\u0440\u044B\u044F\u043D\u0442: \u0447\u0430\u043A\u0430\u045E\u0441\u044F \u0430\u0434\u0437\u0456\u043D \u0437 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              let a = Number(o.maximum);
              let l = cfs(a, i.unit.one, i.unit.few, i.unit.many);
              return `\u0417\u0430\u043D\u0430\u0434\u0442\u0430 \u0432\u044F\u043B\u0456\u043A\u0456: \u0447\u0430\u043A\u0430\u043B\u0430\u0441\u044F, \u0448\u0442\u043E ${o.origin ?? "\u0437\u043D\u0430\u0447\u044D\u043D\u043D\u0435"} \u043F\u0430\u0432\u0456\u043D\u043D\u0430 ${i.verb} ${s}${o.maximum.toString()} ${l}`;
            }
            return `\u0417\u0430\u043D\u0430\u0434\u0442\u0430 \u0432\u044F\u043B\u0456\u043A\u0456: \u0447\u0430\u043A\u0430\u043B\u0430\u0441\u044F, \u0448\u0442\u043E ${o.origin ?? "\u0437\u043D\u0430\u0447\u044D\u043D\u043D\u0435"} \u043F\u0430\u0432\u0456\u043D\u043D\u0430 \u0431\u044B\u0446\u044C ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              let a = Number(o.minimum);
              let l = cfs(a, i.unit.one, i.unit.few, i.unit.many);
              return `\u0417\u0430\u043D\u0430\u0434\u0442\u0430 \u043C\u0430\u043B\u044B: \u0447\u0430\u043A\u0430\u043B\u0430\u0441\u044F, \u0448\u0442\u043E ${o.origin} \u043F\u0430\u0432\u0456\u043D\u043D\u0430 ${i.verb} ${s}${o.minimum.toString()} ${l}`;
            }
            return `\u0417\u0430\u043D\u0430\u0434\u0442\u0430 \u043C\u0430\u043B\u044B: \u0447\u0430\u043A\u0430\u043B\u0430\u0441\u044F, \u0448\u0442\u043E ${o.origin} \u043F\u0430\u0432\u0456\u043D\u043D\u0430 \u0431\u044B\u0446\u044C ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u0440\u0430\u0434\u043E\u043A: \u043F\u0430\u0432\u0456\u043D\u0435\u043D \u043F\u0430\u0447\u044B\u043D\u0430\u0446\u0446\u0430 \u0437 "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u0440\u0430\u0434\u043E\u043A: \u043F\u0430\u0432\u0456\u043D\u0435\u043D \u0437\u0430\u043A\u0430\u043D\u0447\u0432\u0430\u0446\u0446\u0430 \u043D\u0430 "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u0440\u0430\u0434\u043E\u043A: \u043F\u0430\u0432\u0456\u043D\u0435\u043D \u0437\u043C\u044F\u0448\u0447\u0430\u0446\u044C "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u0440\u0430\u0434\u043E\u043A: \u043F\u0430\u0432\u0456\u043D\u0435\u043D \u0430\u0434\u043F\u0430\u0432\u044F\u0434\u0430\u0446\u044C \u0448\u0430\u0431\u043B\u043E\u043D\u0443 ${s.pattern}`;
            }
            return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u043B\u0456\u043A: \u043F\u0430\u0432\u0456\u043D\u0435\u043D \u0431\u044B\u0446\u044C \u043A\u0440\u0430\u0442\u043D\u044B\u043C ${o.divisor}`;
        case "unrecognized_keys":
          return `\u041D\u0435\u0440\u0430\u0441\u043F\u0430\u0437\u043D\u0430\u043D\u044B ${o.keys.length > 1 ? "\u043A\u043B\u044E\u0447\u044B" : "\u043A\u043B\u044E\u0447"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u043A\u043B\u044E\u0447 \u0443 ${o.origin}`;
        case "invalid_union":
          return "\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u045E\u0432\u043E\u0434";
        case "invalid_element":
          return `\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u0430\u0435 \u0437\u043D\u0430\u0447\u044D\u043D\u043D\u0435 \u045E ${o.origin}`;
        default:
          return "\u041D\u044F\u043F\u0440\u0430\u0432\u0456\u043B\u044C\u043D\u044B \u045E\u0432\u043E\u0434";
      }
    };
  };
  var ufs = __lazy(() => {
    gp();
  });
  function ca_export() {
    return {
      localeError: ylu()
    };
  }
  var ylu = () => {
    let e = {
      string: {
        unit: "car\xE0cters",
        verb: "contenir"
      },
      file: {
        unit: "bytes",
        verb: "contenir"
      },
      array: {
        unit: "elements",
        verb: "contenir"
      },
      set: {
        unit: "elements",
        verb: "contenir"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "entrada",
      email: "adre\xE7a electr\xF2nica",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "data i hora ISO",
      date: "data ISO",
      time: "hora ISO",
      duration: "durada ISO",
      ipv4: "adre\xE7a IPv4",
      ipv6: "adre\xE7a IPv6",
      cidrv4: "rang IPv4",
      cidrv6: "rang IPv6",
      base64: "cadena codificada en base64",
      base64url: "cadena codificada en base64url",
      json_string: "cadena JSON",
      e164: "n\xFAmero E.164",
      jwt: "JWT",
      template_literal: "entrada"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Tipus inv\xE0lid: s'esperava ${o.expected}, s'ha rebut ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Valor inv\xE0lid: s'esperava ${stringifyPrimitive(o.values[0])}`;
          }
          return `Opci\xF3 inv\xE0lida: s'esperava una de ${joinValues(o.values, " o ")}`;
        case "too_big":
          {
            let s = o.inclusive ? "com a m\xE0xim" : "menys de";
            let i = t(o.origin);
            if (i) {
              return `Massa gran: s'esperava que ${o.origin ?? "el valor"} contingu\xE9s ${s} ${o.maximum.toString()} ${i.unit ?? "elements"}`;
            }
            return `Massa gran: s'esperava que ${o.origin ?? "el valor"} fos ${s} ${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? "com a m\xEDnim" : "m\xE9s de";
            let i = t(o.origin);
            if (i) {
              return `Massa petit: s'esperava que ${o.origin} contingu\xE9s ${s} ${o.minimum.toString()} ${i.unit}`;
            }
            return `Massa petit: s'esperava que ${o.origin} fos ${s} ${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Format inv\xE0lid: ha de comen\xE7ar amb "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Format inv\xE0lid: ha d'acabar amb "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Format inv\xE0lid: ha d'incloure "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Format inv\xE0lid: ha de coincidir amb el patr\xF3 ${s.pattern}`;
            }
            return `Format inv\xE0lid per a ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `N\xFAmero inv\xE0lid: ha de ser m\xFAltiple de ${o.divisor}`;
        case "unrecognized_keys":
          return `Clau${o.keys.length > 1 ? "s" : ""} no reconeguda${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Clau inv\xE0lida a ${o.origin}`;
        case "invalid_union":
          return "Entrada inv\xE0lida";
        case "invalid_element":
          return `Element inv\xE0lid a ${o.origin}`;
        default:
          return "Entrada inv\xE0lida";
      }
    };
  };
  var dfs = __lazy(() => {
    gp();
  });
  function cs_export() {
    return {
      localeError: _lu()
    };
  }
  var _lu = () => {
    let e = {
      string: {
        unit: "znak\u016F",
        verb: "m\xEDt"
      },
      file: {
        unit: "bajt\u016F",
        verb: "m\xEDt"
      },
      array: {
        unit: "prvk\u016F",
        verb: "m\xEDt"
      },
      set: {
        unit: "prvk\u016F",
        verb: "m\xEDt"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u010D\xEDslo";
        case "string":
          return "\u0159et\u011Bzec";
        case "boolean":
          return "boolean";
        case "bigint":
          return "bigint";
        case "function":
          return "funkce";
        case "symbol":
          return "symbol";
        case "undefined":
          return "undefined";
        case "object":
          {
            if (Array.isArray(o)) {
              return "pole";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "regul\xE1rn\xED v\xFDraz",
      email: "e-mailov\xE1 adresa",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "datum a \u010Das ve form\xE1tu ISO",
      date: "datum ve form\xE1tu ISO",
      time: "\u010Das ve form\xE1tu ISO",
      duration: "doba trv\xE1n\xED ISO",
      ipv4: "IPv4 adresa",
      ipv6: "IPv6 adresa",
      cidrv4: "rozsah IPv4",
      cidrv6: "rozsah IPv6",
      base64: "\u0159et\u011Bzec zak\xF3dovan\xFD ve form\xE1tu base64",
      base64url: "\u0159et\u011Bzec zak\xF3dovan\xFD ve form\xE1tu base64url",
      json_string: "\u0159et\u011Bzec ve form\xE1tu JSON",
      e164: "\u010D\xEDslo E.164",
      jwt: "JWT",
      template_literal: "vstup"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Neplatn\xFD vstup: o\u010Dek\xE1v\xE1no ${o.expected}, obdr\u017Eeno ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Neplatn\xFD vstup: o\u010Dek\xE1v\xE1no ${stringifyPrimitive(o.values[0])}`;
          }
          return `Neplatn\xE1 mo\u017Enost: o\u010Dek\xE1v\xE1na jedna z hodnot ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Hodnota je p\u0159\xEDli\u0161 velk\xE1: ${o.origin ?? "hodnota"} mus\xED m\xEDt ${s}${o.maximum.toString()} ${i.unit ?? "prvk\u016F"}`;
            }
            return `Hodnota je p\u0159\xEDli\u0161 velk\xE1: ${o.origin ?? "hodnota"} mus\xED b\xFDt ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Hodnota je p\u0159\xEDli\u0161 mal\xE1: ${o.origin ?? "hodnota"} mus\xED m\xEDt ${s}${o.minimum.toString()} ${i.unit ?? "prvk\u016F"}`;
            }
            return `Hodnota je p\u0159\xEDli\u0161 mal\xE1: ${o.origin ?? "hodnota"} mus\xED b\xFDt ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Neplatn\xFD \u0159et\u011Bzec: mus\xED za\u010D\xEDnat na "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Neplatn\xFD \u0159et\u011Bzec: mus\xED kon\u010Dit na "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Neplatn\xFD \u0159et\u011Bzec: mus\xED obsahovat "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Neplatn\xFD \u0159et\u011Bzec: mus\xED odpov\xEDdat vzoru ${s.pattern}`;
            }
            return `Neplatn\xFD form\xE1t ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Neplatn\xE9 \u010D\xEDslo: mus\xED b\xFDt n\xE1sobkem ${o.divisor}`;
        case "unrecognized_keys":
          return `Nezn\xE1m\xE9 kl\xED\u010De: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Neplatn\xFD kl\xED\u010D v ${o.origin}`;
        case "invalid_union":
          return "Neplatn\xFD vstup";
        case "invalid_element":
          return `Neplatn\xE1 hodnota v ${o.origin}`;
        default:
          return "Neplatn\xFD vstup";
      }
    };
  };
  var pfs = __lazy(() => {
    gp();
  });
  function de() {
    return {
      localeError: blu()
    };
  }
  var blu = () => {
    let e = {
      string: {
        unit: "Zeichen",
        verb: "zu haben"
      },
      file: {
        unit: "Bytes",
        verb: "zu haben"
      },
      array: {
        unit: "Elemente",
        verb: "zu haben"
      },
      set: {
        unit: "Elemente",
        verb: "zu haben"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "Zahl";
        case "object":
          {
            if (Array.isArray(o)) {
              return "Array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "Eingabe",
      email: "E-Mail-Adresse",
      url: "URL",
      emoji: "Emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO-Datum und -Uhrzeit",
      date: "ISO-Datum",
      time: "ISO-Uhrzeit",
      duration: "ISO-Dauer",
      ipv4: "IPv4-Adresse",
      ipv6: "IPv6-Adresse",
      cidrv4: "IPv4-Bereich",
      cidrv6: "IPv6-Bereich",
      base64: "Base64-codierter String",
      base64url: "Base64-URL-codierter String",
      json_string: "JSON-String",
      e164: "E.164-Nummer",
      jwt: "JWT",
      template_literal: "Eingabe"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Ung\xFCltige Eingabe: erwartet ${o.expected}, erhalten ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Ung\xFCltige Eingabe: erwartet ${stringifyPrimitive(o.values[0])}`;
          }
          return `Ung\xFCltige Option: erwartet eine von ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Zu gro\xDF: erwartet, dass ${o.origin ?? "Wert"} ${s}${o.maximum.toString()} ${i.unit ?? "Elemente"} hat`;
            }
            return `Zu gro\xDF: erwartet, dass ${o.origin ?? "Wert"} ${s}${o.maximum.toString()} ist`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Zu klein: erwartet, dass ${o.origin} ${s}${o.minimum.toString()} ${i.unit} hat`;
            }
            return `Zu klein: erwartet, dass ${o.origin} ${s}${o.minimum.toString()} ist`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Ung\xFCltiger String: muss mit "${s.prefix}" beginnen`;
            }
            if (s.format === "ends_with") {
              return `Ung\xFCltiger String: muss mit "${s.suffix}" enden`;
            }
            if (s.format === "includes") {
              return `Ung\xFCltiger String: muss "${s.includes}" enthalten`;
            }
            if (s.format === "regex") {
              return `Ung\xFCltiger String: muss dem Muster ${s.pattern} entsprechen`;
            }
            return `Ung\xFCltig: ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Ung\xFCltige Zahl: muss ein Vielfaches von ${o.divisor} sein`;
        case "unrecognized_keys":
          return `${o.keys.length > 1 ? "Unbekannte Schl\xFCssel" : "Unbekannter Schl\xFCssel"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Ung\xFCltiger Schl\xFCssel in ${o.origin}`;
        case "invalid_union":
          return "Ung\xFCltige Eingabe";
        case "invalid_element":
          return `Ung\xFCltiger Wert in ${o.origin}`;
        default:
          return "Ung\xFCltige Eingabe";
      }
    };
  };
  var mfs = __lazy(() => {
    gp();
  });
  function en_export() {
    return {
      localeError: Tlu()
    };
  }
  var Slu = e => {
    let t = typeof e;
    switch (t) {
      case "number":
        return Number.isNaN(e) ? "NaN" : "number";
      case "object":
        {
          if (Array.isArray(e)) {
            return "array";
          }
          if (e === null) {
            return "null";
          }
          if (Object.getPrototypeOf(e) !== Object.prototype && e.constructor) {
            return e.constructor.name;
          }
        }
    }
    return t;
  };
  var Tlu = () => {
    let e = {
      string: {
        unit: "characters",
        verb: "to have"
      },
      file: {
        unit: "bytes",
        verb: "to have"
      },
      array: {
        unit: "items",
        verb: "to have"
      },
      set: {
        unit: "items",
        verb: "to have"
      }
    };
    function t(r) {
      return e[r] ?? null;
    }
    let n = {
      regex: "input",
      email: "email address",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO datetime",
      date: "ISO date",
      time: "ISO time",
      duration: "ISO duration",
      ipv4: "IPv4 address",
      ipv6: "IPv6 address",
      cidrv4: "IPv4 range",
      cidrv6: "IPv6 range",
      base64: "base64-encoded string",
      base64url: "base64url-encoded string",
      json_string: "JSON string",
      e164: "E.164 number",
      jwt: "JWT",
      template_literal: "input"
    };
    return r => {
      switch (r.code) {
        case "invalid_type":
          return `Invalid input: expected ${r.expected}, received ${Slu(r.input)}`;
        case "invalid_value":
          if (r.values.length === 1) {
            return `Invalid input: expected ${stringifyPrimitive(r.values[0])}`;
          }
          return `Invalid option: expected one of ${joinValues(r.values, "|")}`;
        case "too_big":
          {
            let o = r.inclusive ? "<=" : "<";
            let s = t(r.origin);
            if (s) {
              return `Too big: expected ${r.origin ?? "value"} to have ${o}${r.maximum.toString()} ${s.unit ?? "elements"}`;
            }
            return `Too big: expected ${r.origin ?? "value"} to be ${o}${r.maximum.toString()}`;
          }
        case "too_small":
          {
            let o = r.inclusive ? ">=" : ">";
            let s = t(r.origin);
            if (s) {
              return `Too small: expected ${r.origin} to have ${o}${r.minimum.toString()} ${s.unit}`;
            }
            return `Too small: expected ${r.origin} to be ${o}${r.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let o = r;
            if (o.format === "starts_with") {
              return `Invalid string: must start with "${o.prefix}"`;
            }
            if (o.format === "ends_with") {
              return `Invalid string: must end with "${o.suffix}"`;
            }
            if (o.format === "includes") {
              return `Invalid string: must include "${o.includes}"`;
            }
            if (o.format === "regex") {
              return `Invalid string: must match pattern ${o.pattern}`;
            }
            return `Invalid ${n[o.format] ?? r.format}`;
          }
        case "not_multiple_of":
          return `Invalid number: must be a multiple of ${r.divisor}`;
        case "unrecognized_keys":
          return `Unrecognized key${r.keys.length > 1 ? "s" : ""}: ${joinValues(r.keys, ", ")}`;
        case "invalid_key":
          return `Invalid key in ${r.origin}`;
        case "invalid_union":
          return "Invalid input";
        case "invalid_element":
          return `Invalid value in ${r.origin}`;
        default:
          return "Invalid input";
      }
    };
  };
  var Ckr = __lazy(() => {
    gp();
  });
  function eo_export() {
    return {
      localeError: vlu()
    };
  }
  var Elu = e => {
    let t = typeof e;
    switch (t) {
      case "number":
        return Number.isNaN(e) ? "NaN" : "nombro";
      case "object":
        {
          if (Array.isArray(e)) {
            return "tabelo";
          }
          if (e === null) {
            return "senvalora";
          }
          if (Object.getPrototypeOf(e) !== Object.prototype && e.constructor) {
            return e.constructor.name;
          }
        }
    }
    return t;
  };
  var vlu = () => {
    let e = {
      string: {
        unit: "karaktrojn",
        verb: "havi"
      },
      file: {
        unit: "bajtojn",
        verb: "havi"
      },
      array: {
        unit: "elementojn",
        verb: "havi"
      },
      set: {
        unit: "elementojn",
        verb: "havi"
      }
    };
    function t(r) {
      return e[r] ?? null;
    }
    let n = {
      regex: "enigo",
      email: "retadreso",
      url: "URL",
      emoji: "emo\u011Dio",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO-datotempo",
      date: "ISO-dato",
      time: "ISO-tempo",
      duration: "ISO-da\u016Dro",
      ipv4: "IPv4-adreso",
      ipv6: "IPv6-adreso",
      cidrv4: "IPv4-rango",
      cidrv6: "IPv6-rango",
      base64: "64-ume kodita karaktraro",
      base64url: "URL-64-ume kodita karaktraro",
      json_string: "JSON-karaktraro",
      e164: "E.164-nombro",
      jwt: "JWT",
      template_literal: "enigo"
    };
    return r => {
      switch (r.code) {
        case "invalid_type":
          return `Nevalida enigo: atendi\u011Dis ${r.expected}, ricevi\u011Dis ${Elu(r.input)}`;
        case "invalid_value":
          if (r.values.length === 1) {
            return `Nevalida enigo: atendi\u011Dis ${stringifyPrimitive(r.values[0])}`;
          }
          return `Nevalida opcio: atendi\u011Dis unu el ${joinValues(r.values, "|")}`;
        case "too_big":
          {
            let o = r.inclusive ? "<=" : "<";
            let s = t(r.origin);
            if (s) {
              return `Tro granda: atendi\u011Dis ke ${r.origin ?? "valoro"} havu ${o}${r.maximum.toString()} ${s.unit ?? "elementojn"}`;
            }
            return `Tro granda: atendi\u011Dis ke ${r.origin ?? "valoro"} havu ${o}${r.maximum.toString()}`;
          }
        case "too_small":
          {
            let o = r.inclusive ? ">=" : ">";
            let s = t(r.origin);
            if (s) {
              return `Tro malgranda: atendi\u011Dis ke ${r.origin} havu ${o}${r.minimum.toString()} ${s.unit}`;
            }
            return `Tro malgranda: atendi\u011Dis ke ${r.origin} estu ${o}${r.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let o = r;
            if (o.format === "starts_with") {
              return `Nevalida karaktraro: devas komenci\u011Di per "${o.prefix}"`;
            }
            if (o.format === "ends_with") {
              return `Nevalida karaktraro: devas fini\u011Di per "${o.suffix}"`;
            }
            if (o.format === "includes") {
              return `Nevalida karaktraro: devas inkluzivi "${o.includes}"`;
            }
            if (o.format === "regex") {
              return `Nevalida karaktraro: devas kongrui kun la modelo ${o.pattern}`;
            }
            return `Nevalida ${n[o.format] ?? r.format}`;
          }
        case "not_multiple_of":
          return `Nevalida nombro: devas esti oblo de ${r.divisor}`;
        case "unrecognized_keys":
          return `Nekonata${r.keys.length > 1 ? "j" : ""} \u015Dlosilo${r.keys.length > 1 ? "j" : ""}: ${joinValues(r.keys, ", ")}`;
        case "invalid_key":
          return `Nevalida \u015Dlosilo en ${r.origin}`;
        case "invalid_union":
          return "Nevalida enigo";
        case "invalid_element":
          return `Nevalida valoro en ${r.origin}`;
        default:
          return "Nevalida enigo";
      }
    };
  };
  var ffs = __lazy(() => {
    gp();
  });
  function es() {
    return {
      localeError: wlu()
    };
  }
  var wlu = () => {
    let e = {
      string: {
        unit: "caracteres",
        verb: "tener"
      },
      file: {
        unit: "bytes",
        verb: "tener"
      },
      array: {
        unit: "elementos",
        verb: "tener"
      },
      set: {
        unit: "elementos",
        verb: "tener"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "n\xFAmero";
        case "object":
          {
            if (Array.isArray(o)) {
              return "arreglo";
            }
            if (o === null) {
              return "nulo";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "entrada",
      email: "direcci\xF3n de correo electr\xF3nico",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "fecha y hora ISO",
      date: "fecha ISO",
      time: "hora ISO",
      duration: "duraci\xF3n ISO",
      ipv4: "direcci\xF3n IPv4",
      ipv6: "direcci\xF3n IPv6",
      cidrv4: "rango IPv4",
      cidrv6: "rango IPv6",
      base64: "cadena codificada en base64",
      base64url: "URL codificada en base64",
      json_string: "cadena JSON",
      e164: "n\xFAmero E.164",
      jwt: "JWT",
      template_literal: "entrada"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Entrada inv\xE1lida: se esperaba ${o.expected}, recibido ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Entrada inv\xE1lida: se esperaba ${stringifyPrimitive(o.values[0])}`;
          }
          return `Opci\xF3n inv\xE1lida: se esperaba una de ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Demasiado grande: se esperaba que ${o.origin ?? "valor"} tuviera ${s}${o.maximum.toString()} ${i.unit ?? "elementos"}`;
            }
            return `Demasiado grande: se esperaba que ${o.origin ?? "valor"} fuera ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Demasiado peque\xF1o: se esperaba que ${o.origin} tuviera ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Demasiado peque\xF1o: se esperaba que ${o.origin} fuera ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Cadena inv\xE1lida: debe comenzar con "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Cadena inv\xE1lida: debe terminar en "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Cadena inv\xE1lida: debe incluir "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Cadena inv\xE1lida: debe coincidir con el patr\xF3n ${s.pattern}`;
            }
            return `Inv\xE1lido ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `N\xFAmero inv\xE1lido: debe ser m\xFAltiplo de ${o.divisor}`;
        case "unrecognized_keys":
          return `Llave${o.keys.length > 1 ? "s" : ""} desconocida${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Llave inv\xE1lida en ${o.origin}`;
        case "invalid_union":
          return "Entrada inv\xE1lida";
        case "invalid_element":
          return `Valor inv\xE1lido en ${o.origin}`;
        default:
          return "Entrada inv\xE1lida";
      }
    };
  };
  var hfs = __lazy(() => {
    gp();
  });
  function fa_export() {
    return {
      localeError: Clu()
    };
  }
  var Clu = () => {
    let e = {
      string: {
        unit: "\u06A9\u0627\u0631\u0627\u06A9\u062A\u0631",
        verb: "\u062F\u0627\u0634\u062A\u0647 \u0628\u0627\u0634\u062F"
      },
      file: {
        unit: "\u0628\u0627\u06CC\u062A",
        verb: "\u062F\u0627\u0634\u062A\u0647 \u0628\u0627\u0634\u062F"
      },
      array: {
        unit: "\u0622\u06CC\u062A\u0645",
        verb: "\u062F\u0627\u0634\u062A\u0647 \u0628\u0627\u0634\u062F"
      },
      set: {
        unit: "\u0622\u06CC\u062A\u0645",
        verb: "\u062F\u0627\u0634\u062A\u0647 \u0628\u0627\u0634\u062F"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u0639\u062F\u062F";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u0622\u0631\u0627\u06CC\u0647";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0648\u0631\u0648\u062F\u06CC",
      email: "\u0622\u062F\u0631\u0633 \u0627\u06CC\u0645\u06CC\u0644",
      url: "URL",
      emoji: "\u0627\u06CC\u0645\u0648\u062C\u06CC",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "\u062A\u0627\u0631\u06CC\u062E \u0648 \u0632\u0645\u0627\u0646 \u0627\u06CC\u0632\u0648",
      date: "\u062A\u0627\u0631\u06CC\u062E \u0627\u06CC\u0632\u0648",
      time: "\u0632\u0645\u0627\u0646 \u0627\u06CC\u0632\u0648",
      duration: "\u0645\u062F\u062A \u0632\u0645\u0627\u0646 \u0627\u06CC\u0632\u0648",
      ipv4: "IPv4 \u0622\u062F\u0631\u0633",
      ipv6: "IPv6 \u0622\u062F\u0631\u0633",
      cidrv4: "IPv4 \u062F\u0627\u0645\u0646\u0647",
      cidrv6: "IPv6 \u062F\u0627\u0645\u0646\u0647",
      base64: "base64-encoded \u0631\u0634\u062A\u0647",
      base64url: "base64url-encoded \u0631\u0634\u062A\u0647",
      json_string: "JSON \u0631\u0634\u062A\u0647",
      e164: "E.164 \u0639\u062F\u062F",
      jwt: "JWT",
      template_literal: "\u0648\u0631\u0648\u062F\u06CC"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u0648\u0631\u0648\u062F\u06CC \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0645\u06CC\u200C\u0628\u0627\u06CC\u0633\u062A ${o.expected} \u0645\u06CC\u200C\u0628\u0648\u062F\u060C ${n(o.input)} \u062F\u0631\u06CC\u0627\u0641\u062A \u0634\u062F`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u0648\u0631\u0648\u062F\u06CC \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0645\u06CC\u200C\u0628\u0627\u06CC\u0633\u062A ${stringifyPrimitive(o.values[0])} \u0645\u06CC\u200C\u0628\u0648\u062F`;
          }
          return `\u06AF\u0632\u06CC\u0646\u0647 \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0645\u06CC\u200C\u0628\u0627\u06CC\u0633\u062A \u06CC\u06A9\u06CC \u0627\u0632 ${joinValues(o.values, "|")} \u0645\u06CC\u200C\u0628\u0648\u062F`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u062E\u06CC\u0644\u06CC \u0628\u0632\u0631\u06AF: ${o.origin ?? "\u0645\u0642\u062F\u0627\u0631"} \u0628\u0627\u06CC\u062F ${s}${o.maximum.toString()} ${i.unit ?? "\u0639\u0646\u0635\u0631"} \u0628\u0627\u0634\u062F`;
            }
            return `\u062E\u06CC\u0644\u06CC \u0628\u0632\u0631\u06AF: ${o.origin ?? "\u0645\u0642\u062F\u0627\u0631"} \u0628\u0627\u06CC\u062F ${s}${o.maximum.toString()} \u0628\u0627\u0634\u062F`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u062E\u06CC\u0644\u06CC \u06A9\u0648\u0686\u06A9: ${o.origin} \u0628\u0627\u06CC\u062F ${s}${o.minimum.toString()} ${i.unit} \u0628\u0627\u0634\u062F`;
            }
            return `\u062E\u06CC\u0644\u06CC \u06A9\u0648\u0686\u06A9: ${o.origin} \u0628\u0627\u06CC\u062F ${s}${o.minimum.toString()} \u0628\u0627\u0634\u062F`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u0631\u0634\u062A\u0647 \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0628\u0627\u06CC\u062F \u0628\u0627 "${s.prefix}" \u0634\u0631\u0648\u0639 \u0634\u0648\u062F`;
            }
            if (s.format === "ends_with") {
              return `\u0631\u0634\u062A\u0647 \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0628\u0627\u06CC\u062F \u0628\u0627 "${s.suffix}" \u062A\u0645\u0627\u0645 \u0634\u0648\u062F`;
            }
            if (s.format === "includes") {
              return `\u0631\u0634\u062A\u0647 \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0628\u0627\u06CC\u062F \u0634\u0627\u0645\u0644 "${s.includes}" \u0628\u0627\u0634\u062F`;
            }
            if (s.format === "regex") {
              return `\u0631\u0634\u062A\u0647 \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0628\u0627\u06CC\u062F \u0628\u0627 \u0627\u0644\u06AF\u0648\u06CC ${s.pattern} \u0645\u0637\u0627\u0628\u0642\u062A \u062F\u0627\u0634\u062A\u0647 \u0628\u0627\u0634\u062F`;
            }
            return `${r[s.format] ?? o.format} \u0646\u0627\u0645\u0639\u062A\u0628\u0631`;
          }
        case "not_multiple_of":
          return `\u0639\u062F\u062F \u0646\u0627\u0645\u0639\u062A\u0628\u0631: \u0628\u0627\u06CC\u062F \u0645\u0636\u0631\u0628 ${o.divisor} \u0628\u0627\u0634\u062F`;
        case "unrecognized_keys":
          return `\u06A9\u0644\u06CC\u062F${o.keys.length > 1 ? "\u0647\u0627\u06CC" : ""} \u0646\u0627\u0634\u0646\u0627\u0633: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u06A9\u0644\u06CC\u062F \u0646\u0627\u0634\u0646\u0627\u0633 \u062F\u0631 ${o.origin}`;
        case "invalid_union":
          return "\u0648\u0631\u0648\u062F\u06CC \u0646\u0627\u0645\u0639\u062A\u0628\u0631";
        case "invalid_element":
          return `\u0645\u0642\u062F\u0627\u0631 \u0646\u0627\u0645\u0639\u062A\u0628\u0631 \u062F\u0631 ${o.origin}`;
        default:
          return "\u0648\u0631\u0648\u062F\u06CC \u0646\u0627\u0645\u0639\u062A\u0628\u0631";
      }
    };
  };
  var gfs = __lazy(() => {
    gp();
  });
  function fi() {
    return {
      localeError: Rlu()
    };
  }
  var Rlu = () => {
    let e = {
      string: {
        unit: "merkki\xE4",
        subject: "merkkijonon"
      },
      file: {
        unit: "tavua",
        subject: "tiedoston"
      },
      array: {
        unit: "alkiota",
        subject: "listan"
      },
      set: {
        unit: "alkiota",
        subject: "joukon"
      },
      number: {
        unit: "",
        subject: "luvun"
      },
      bigint: {
        unit: "",
        subject: "suuren kokonaisluvun"
      },
      int: {
        unit: "",
        subject: "kokonaisluvun"
      },
      date: {
        unit: "",
        subject: "p\xE4iv\xE4m\xE4\xE4r\xE4n"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "s\xE4\xE4nn\xF6llinen lauseke",
      email: "s\xE4hk\xF6postiosoite",
      url: "URL-osoite",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO-aikaleima",
      date: "ISO-p\xE4iv\xE4m\xE4\xE4r\xE4",
      time: "ISO-aika",
      duration: "ISO-kesto",
      ipv4: "IPv4-osoite",
      ipv6: "IPv6-osoite",
      cidrv4: "IPv4-alue",
      cidrv6: "IPv6-alue",
      base64: "base64-koodattu merkkijono",
      base64url: "base64url-koodattu merkkijono",
      json_string: "JSON-merkkijono",
      e164: "E.164-luku",
      jwt: "JWT",
      template_literal: "templaattimerkkijono"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Virheellinen tyyppi: odotettiin ${o.expected}, oli ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Virheellinen sy\xF6te: t\xE4ytyy olla ${stringifyPrimitive(o.values[0])}`;
          }
          return `Virheellinen valinta: t\xE4ytyy olla yksi seuraavista: ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Liian suuri: ${i.subject} t\xE4ytyy olla ${s}${o.maximum.toString()} ${i.unit}`.trim();
            }
            return `Liian suuri: arvon t\xE4ytyy olla ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Liian pieni: ${i.subject} t\xE4ytyy olla ${s}${o.minimum.toString()} ${i.unit}`.trim();
            }
            return `Liian pieni: arvon t\xE4ytyy olla ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Virheellinen sy\xF6te: t\xE4ytyy alkaa "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Virheellinen sy\xF6te: t\xE4ytyy loppua "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Virheellinen sy\xF6te: t\xE4ytyy sis\xE4lt\xE4\xE4 "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Virheellinen sy\xF6te: t\xE4ytyy vastata s\xE4\xE4nn\xF6llist\xE4 lauseketta ${s.pattern}`;
            }
            return `Virheellinen ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Virheellinen luku: t\xE4ytyy olla luvun ${o.divisor} monikerta`;
        case "unrecognized_keys":
          return `${o.keys.length > 1 ? "Tuntemattomat avaimet" : "Tuntematon avain"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return "Virheellinen avain tietueessa";
        case "invalid_union":
          return "Virheellinen unioni";
        case "invalid_element":
          return "Virheellinen arvo joukossa";
        default:
          return "Virheellinen sy\xF6te";
      }
    };
  };
  var yfs = __lazy(() => {
    gp();
  });
  function fr_export() {
    return {
      localeError: xlu()
    };
  }
  var xlu = () => {
    let e = {
      string: {
        unit: "caract\xE8res",
        verb: "avoir"
      },
      file: {
        unit: "octets",
        verb: "avoir"
      },
      array: {
        unit: "\xE9l\xE9ments",
        verb: "avoir"
      },
      set: {
        unit: "\xE9l\xE9ments",
        verb: "avoir"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "nombre";
        case "object":
          {
            if (Array.isArray(o)) {
              return "tableau";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "entr\xE9e",
      email: "adresse e-mail",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "date et heure ISO",
      date: "date ISO",
      time: "heure ISO",
      duration: "dur\xE9e ISO",
      ipv4: "adresse IPv4",
      ipv6: "adresse IPv6",
      cidrv4: "plage IPv4",
      cidrv6: "plage IPv6",
      base64: "cha\xEEne encod\xE9e en base64",
      base64url: "cha\xEEne encod\xE9e en base64url",
      json_string: "cha\xEEne JSON",
      e164: "num\xE9ro E.164",
      jwt: "JWT",
      template_literal: "entr\xE9e"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Entr\xE9e invalide : ${o.expected} attendu, ${n(o.input)} re\xE7u`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Entr\xE9e invalide : ${stringifyPrimitive(o.values[0])} attendu`;
          }
          return `Option invalide : une valeur parmi ${joinValues(o.values, "|")} attendue`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Trop grand : ${o.origin ?? "valeur"} doit ${i.verb} ${s}${o.maximum.toString()} ${i.unit ?? "\xE9l\xE9ment(s)"}`;
            }
            return `Trop grand : ${o.origin ?? "valeur"} doit \xEAtre ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Trop petit : ${o.origin} doit ${i.verb} ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Trop petit : ${o.origin} doit \xEAtre ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Cha\xEEne invalide : doit commencer par "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Cha\xEEne invalide : doit se terminer par "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Cha\xEEne invalide : doit inclure "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Cha\xEEne invalide : doit correspondre au mod\xE8le ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} invalide`;
          }
        case "not_multiple_of":
          return `Nombre invalide : doit \xEAtre un multiple de ${o.divisor}`;
        case "unrecognized_keys":
          return `Cl\xE9${o.keys.length > 1 ? "s" : ""} non reconnue${o.keys.length > 1 ? "s" : ""} : ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Cl\xE9 invalide dans ${o.origin}`;
        case "invalid_union":
          return "Entr\xE9e invalide";
        case "invalid_element":
          return `Valeur invalide dans ${o.origin}`;
        default:
          return "Entr\xE9e invalide";
      }
    };
  };
  var _fs = __lazy(() => {
    gp();
  });
  function frCA() {
    return {
      localeError: klu()
    };
  }
  var klu = () => {
    let e = {
      string: {
        unit: "caract\xE8res",
        verb: "avoir"
      },
      file: {
        unit: "octets",
        verb: "avoir"
      },
      array: {
        unit: "\xE9l\xE9ments",
        verb: "avoir"
      },
      set: {
        unit: "\xE9l\xE9ments",
        verb: "avoir"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "entr\xE9e",
      email: "adresse courriel",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "date-heure ISO",
      date: "date ISO",
      time: "heure ISO",
      duration: "dur\xE9e ISO",
      ipv4: "adresse IPv4",
      ipv6: "adresse IPv6",
      cidrv4: "plage IPv4",
      cidrv6: "plage IPv6",
      base64: "cha\xEEne encod\xE9e en base64",
      base64url: "cha\xEEne encod\xE9e en base64url",
      json_string: "cha\xEEne JSON",
      e164: "num\xE9ro E.164",
      jwt: "JWT",
      template_literal: "entr\xE9e"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Entr\xE9e invalide : attendu ${o.expected}, re\xE7u ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Entr\xE9e invalide : attendu ${stringifyPrimitive(o.values[0])}`;
          }
          return `Option invalide : attendu l'une des valeurs suivantes ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "\u2264" : "<";
            let i = t(o.origin);
            if (i) {
              return `Trop grand : attendu que ${o.origin ?? "la valeur"} ait ${s}${o.maximum.toString()} ${i.unit}`;
            }
            return `Trop grand : attendu que ${o.origin ?? "la valeur"} soit ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? "\u2265" : ">";
            let i = t(o.origin);
            if (i) {
              return `Trop petit : attendu que ${o.origin} ait ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Trop petit : attendu que ${o.origin} soit ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Cha\xEEne invalide : doit commencer par "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Cha\xEEne invalide : doit se terminer par "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Cha\xEEne invalide : doit inclure "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Cha\xEEne invalide : doit correspondre au motif ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} invalide`;
          }
        case "not_multiple_of":
          return `Nombre invalide : doit \xEAtre un multiple de ${o.divisor}`;
        case "unrecognized_keys":
          return `Cl\xE9${o.keys.length > 1 ? "s" : ""} non reconnue${o.keys.length > 1 ? "s" : ""} : ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Cl\xE9 invalide dans ${o.origin}`;
        case "invalid_union":
          return "Entr\xE9e invalide";
        case "invalid_element":
          return `Valeur invalide dans ${o.origin}`;
        default:
          return "Entr\xE9e invalide";
      }
    };
  };
  var bfs = __lazy(() => {
    gp();
  });
  function he_export() {
    return {
      localeError: Alu()
    };
  }
  var Alu = () => {
    let e = {
      string: {
        unit: "\u05D0\u05D5\u05EA\u05D9\u05D5\u05EA",
        verb: "\u05DC\u05DB\u05DC\u05D5\u05DC"
      },
      file: {
        unit: "\u05D1\u05D9\u05D9\u05D8\u05D9\u05DD",
        verb: "\u05DC\u05DB\u05DC\u05D5\u05DC"
      },
      array: {
        unit: "\u05E4\u05E8\u05D9\u05D8\u05D9\u05DD",
        verb: "\u05DC\u05DB\u05DC\u05D5\u05DC"
      },
      set: {
        unit: "\u05E4\u05E8\u05D9\u05D8\u05D9\u05DD",
        verb: "\u05DC\u05DB\u05DC\u05D5\u05DC"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u05E7\u05DC\u05D8",
      email: "\u05DB\u05EA\u05D5\u05D1\u05EA \u05D0\u05D9\u05DE\u05D9\u05D9\u05DC",
      url: "\u05DB\u05EA\u05D5\u05D1\u05EA \u05E8\u05E9\u05EA",
      emoji: "\u05D0\u05D9\u05DE\u05D5\u05D2'\u05D9",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "\u05EA\u05D0\u05E8\u05D9\u05DA \u05D5\u05D6\u05DE\u05DF ISO",
      date: "\u05EA\u05D0\u05E8\u05D9\u05DA ISO",
      time: "\u05D6\u05DE\u05DF ISO",
      duration: "\u05DE\u05E9\u05DA \u05D6\u05DE\u05DF ISO",
      ipv4: "\u05DB\u05EA\u05D5\u05D1\u05EA IPv4",
      ipv6: "\u05DB\u05EA\u05D5\u05D1\u05EA IPv6",
      cidrv4: "\u05D8\u05D5\u05D5\u05D7 IPv4",
      cidrv6: "\u05D8\u05D5\u05D5\u05D7 IPv6",
      base64: "\u05DE\u05D7\u05E8\u05D5\u05D6\u05EA \u05D1\u05D1\u05E1\u05D9\u05E1 64",
      base64url: "\u05DE\u05D7\u05E8\u05D5\u05D6\u05EA \u05D1\u05D1\u05E1\u05D9\u05E1 64 \u05DC\u05DB\u05EA\u05D5\u05D1\u05D5\u05EA \u05E8\u05E9\u05EA",
      json_string: "\u05DE\u05D7\u05E8\u05D5\u05D6\u05EA JSON",
      e164: "\u05DE\u05E1\u05E4\u05E8 E.164",
      jwt: "JWT",
      template_literal: "\u05E7\u05DC\u05D8"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u05E7\u05DC\u05D8 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF: \u05E6\u05E8\u05D9\u05DA ${o.expected}, \u05D4\u05EA\u05E7\u05D1\u05DC ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u05E7\u05DC\u05D8 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF: \u05E6\u05E8\u05D9\u05DA ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u05E7\u05DC\u05D8 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF: \u05E6\u05E8\u05D9\u05DA \u05D0\u05D7\u05EA \u05DE\u05D4\u05D0\u05E4\u05E9\u05E8\u05D5\u05D9\u05D5\u05EA  ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u05D2\u05D3\u05D5\u05DC \u05DE\u05D3\u05D9: ${o.origin ?? "value"} \u05E6\u05E8\u05D9\u05DA \u05DC\u05D4\u05D9\u05D5\u05EA ${s}${o.maximum.toString()} ${i.unit ?? "elements"}`;
            }
            return `\u05D2\u05D3\u05D5\u05DC \u05DE\u05D3\u05D9: ${o.origin ?? "value"} \u05E6\u05E8\u05D9\u05DA \u05DC\u05D4\u05D9\u05D5\u05EA ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u05E7\u05D8\u05DF \u05DE\u05D3\u05D9: ${o.origin} \u05E6\u05E8\u05D9\u05DA \u05DC\u05D4\u05D9\u05D5\u05EA ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `\u05E7\u05D8\u05DF \u05DE\u05D3\u05D9: ${o.origin} \u05E6\u05E8\u05D9\u05DA \u05DC\u05D4\u05D9\u05D5\u05EA ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u05DE\u05D7\u05E8\u05D5\u05D6\u05EA \u05DC\u05D0 \u05EA\u05E7\u05D9\u05E0\u05D4: \u05D7\u05D9\u05D9\u05D1\u05EA \u05DC\u05D4\u05EA\u05D7\u05D9\u05DC \u05D1"${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u05DE\u05D7\u05E8\u05D5\u05D6\u05EA \u05DC\u05D0 \u05EA\u05E7\u05D9\u05E0\u05D4: \u05D7\u05D9\u05D9\u05D1\u05EA \u05DC\u05D4\u05E1\u05EA\u05D9\u05D9\u05DD \u05D1 "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u05DE\u05D7\u05E8\u05D5\u05D6\u05EA \u05DC\u05D0 \u05EA\u05E7\u05D9\u05E0\u05D4: \u05D7\u05D9\u05D9\u05D1\u05EA \u05DC\u05DB\u05DC\u05D5\u05DC "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u05DE\u05D7\u05E8\u05D5\u05D6\u05EA \u05DC\u05D0 \u05EA\u05E7\u05D9\u05E0\u05D4: \u05D7\u05D9\u05D9\u05D1\u05EA \u05DC\u05D4\u05EA\u05D0\u05D9\u05DD \u05DC\u05EA\u05D1\u05E0\u05D9\u05EA ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF`;
          }
        case "not_multiple_of":
          return `\u05DE\u05E1\u05E4\u05E8 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF: \u05D7\u05D9\u05D9\u05D1 \u05DC\u05D4\u05D9\u05D5\u05EA \u05DE\u05DB\u05E4\u05DC\u05D4 \u05E9\u05DC ${o.divisor}`;
        case "unrecognized_keys":
          return `\u05DE\u05E4\u05EA\u05D7${o.keys.length > 1 ? "\u05D5\u05EA" : ""} \u05DC\u05D0 \u05DE\u05D6\u05D5\u05D4${o.keys.length > 1 ? "\u05D9\u05DD" : "\u05D4"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u05DE\u05E4\u05EA\u05D7 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF \u05D1${o.origin}`;
        case "invalid_union":
          return "\u05E7\u05DC\u05D8 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF";
        case "invalid_element":
          return `\u05E2\u05E8\u05DA \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF \u05D1${o.origin}`;
        default:
          return "\u05E7\u05DC\u05D8 \u05DC\u05D0 \u05EA\u05E7\u05D9\u05DF";
      }
    };
  };
  var Sfs = __lazy(() => {
    gp();
  });
  function hu() {
    return {
      localeError: Ilu()
    };
  }
  var Ilu = () => {
    let e = {
      string: {
        unit: "karakter",
        verb: "legyen"
      },
      file: {
        unit: "byte",
        verb: "legyen"
      },
      array: {
        unit: "elem",
        verb: "legyen"
      },
      set: {
        unit: "elem",
        verb: "legyen"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "sz\xE1m";
        case "object":
          {
            if (Array.isArray(o)) {
              return "t\xF6mb";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "bemenet",
      email: "email c\xEDm",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO id\u0151b\xE9lyeg",
      date: "ISO d\xE1tum",
      time: "ISO id\u0151",
      duration: "ISO id\u0151intervallum",
      ipv4: "IPv4 c\xEDm",
      ipv6: "IPv6 c\xEDm",
      cidrv4: "IPv4 tartom\xE1ny",
      cidrv6: "IPv6 tartom\xE1ny",
      base64: "base64-k\xF3dolt string",
      base64url: "base64url-k\xF3dolt string",
      json_string: "JSON string",
      e164: "E.164 sz\xE1m",
      jwt: "JWT",
      template_literal: "bemenet"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\xC9rv\xE9nytelen bemenet: a v\xE1rt \xE9rt\xE9k ${o.expected}, a kapott \xE9rt\xE9k ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\xC9rv\xE9nytelen bemenet: a v\xE1rt \xE9rt\xE9k ${stringifyPrimitive(o.values[0])}`;
          }
          return `\xC9rv\xE9nytelen opci\xF3: valamelyik \xE9rt\xE9k v\xE1rt ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `T\xFAl nagy: ${o.origin ?? "\xE9rt\xE9k"} m\xE9rete t\xFAl nagy ${s}${o.maximum.toString()} ${i.unit ?? "elem"}`;
            }
            return `T\xFAl nagy: a bemeneti \xE9rt\xE9k ${o.origin ?? "\xE9rt\xE9k"} t\xFAl nagy: ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `T\xFAl kicsi: a bemeneti \xE9rt\xE9k ${o.origin} m\xE9rete t\xFAl kicsi ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `T\xFAl kicsi: a bemeneti \xE9rt\xE9k ${o.origin} t\xFAl kicsi ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\xC9rv\xE9nytelen string: "${s.prefix}" \xE9rt\xE9kkel kell kezd\u0151dnie`;
            }
            if (s.format === "ends_with") {
              return `\xC9rv\xE9nytelen string: "${s.suffix}" \xE9rt\xE9kkel kell v\xE9gz\u0151dnie`;
            }
            if (s.format === "includes") {
              return `\xC9rv\xE9nytelen string: "${s.includes}" \xE9rt\xE9ket kell tartalmaznia`;
            }
            if (s.format === "regex") {
              return `\xC9rv\xE9nytelen string: ${s.pattern} mint\xE1nak kell megfelelnie`;
            }
            return `\xC9rv\xE9nytelen ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\xC9rv\xE9nytelen sz\xE1m: ${o.divisor} t\xF6bbsz\xF6r\xF6s\xE9nek kell lennie`;
        case "unrecognized_keys":
          return `Ismeretlen kulcs${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\xC9rv\xE9nytelen kulcs ${o.origin}`;
        case "invalid_union":
          return "\xC9rv\xE9nytelen bemenet";
        case "invalid_element":
          return `\xC9rv\xE9nytelen \xE9rt\xE9k: ${o.origin}`;
        default:
          return "\xC9rv\xE9nytelen bemenet";
      }
    };
  };
  var Tfs = __lazy(() => {
    gp();
  });
  function id() {
    return {
      localeError: Plu()
    };
  }
  var Plu = () => {
    let e = {
      string: {
        unit: "karakter",
        verb: "memiliki"
      },
      file: {
        unit: "byte",
        verb: "memiliki"
      },
      array: {
        unit: "item",
        verb: "memiliki"
      },
      set: {
        unit: "item",
        verb: "memiliki"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "input",
      email: "alamat email",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "tanggal dan waktu format ISO",
      date: "tanggal format ISO",
      time: "jam format ISO",
      duration: "durasi format ISO",
      ipv4: "alamat IPv4",
      ipv6: "alamat IPv6",
      cidrv4: "rentang alamat IPv4",
      cidrv6: "rentang alamat IPv6",
      base64: "string dengan enkode base64",
      base64url: "string dengan enkode base64url",
      json_string: "string JSON",
      e164: "angka E.164",
      jwt: "JWT",
      template_literal: "input"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Input tidak valid: diharapkan ${o.expected}, diterima ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Input tidak valid: diharapkan ${stringifyPrimitive(o.values[0])}`;
          }
          return `Pilihan tidak valid: diharapkan salah satu dari ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Terlalu besar: diharapkan ${o.origin ?? "value"} memiliki ${s}${o.maximum.toString()} ${i.unit ?? "elemen"}`;
            }
            return `Terlalu besar: diharapkan ${o.origin ?? "value"} menjadi ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Terlalu kecil: diharapkan ${o.origin} memiliki ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Terlalu kecil: diharapkan ${o.origin} menjadi ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `String tidak valid: harus dimulai dengan "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `String tidak valid: harus berakhir dengan "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `String tidak valid: harus menyertakan "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `String tidak valid: harus sesuai pola ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} tidak valid`;
          }
        case "not_multiple_of":
          return `Angka tidak valid: harus kelipatan dari ${o.divisor}`;
        case "unrecognized_keys":
          return `Kunci tidak dikenali ${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Kunci tidak valid di ${o.origin}`;
        case "invalid_union":
          return "Input tidak valid";
        case "invalid_element":
          return `Nilai tidak valid di ${o.origin}`;
        default:
          return "Input tidak valid";
      }
    };
  };
  var Efs = __lazy(() => {
    gp();
  });
  function it_export() {
    return {
      localeError: Olu()
    };
  }
  var Olu = () => {
    let e = {
      string: {
        unit: "caratteri",
        verb: "avere"
      },
      file: {
        unit: "byte",
        verb: "avere"
      },
      array: {
        unit: "elementi",
        verb: "avere"
      },
      set: {
        unit: "elementi",
        verb: "avere"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "numero";
        case "object":
          {
            if (Array.isArray(o)) {
              return "vettore";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "input",
      email: "indirizzo email",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "data e ora ISO",
      date: "data ISO",
      time: "ora ISO",
      duration: "durata ISO",
      ipv4: "indirizzo IPv4",
      ipv6: "indirizzo IPv6",
      cidrv4: "intervallo IPv4",
      cidrv6: "intervallo IPv6",
      base64: "stringa codificata in base64",
      base64url: "URL codificata in base64",
      json_string: "stringa JSON",
      e164: "numero E.164",
      jwt: "JWT",
      template_literal: "input"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Input non valido: atteso ${o.expected}, ricevuto ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Input non valido: atteso ${stringifyPrimitive(o.values[0])}`;
          }
          return `Opzione non valida: atteso uno tra ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Troppo grande: ${o.origin ?? "valore"} deve avere ${s}${o.maximum.toString()} ${i.unit ?? "elementi"}`;
            }
            return `Troppo grande: ${o.origin ?? "valore"} deve essere ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Troppo piccolo: ${o.origin} deve avere ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Troppo piccolo: ${o.origin} deve essere ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Stringa non valida: deve iniziare con "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Stringa non valida: deve terminare con "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Stringa non valida: deve includere "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Stringa non valida: deve corrispondere al pattern ${s.pattern}`;
            }
            return `Invalid ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Numero non valido: deve essere un multiplo di ${o.divisor}`;
        case "unrecognized_keys":
          return `Chiav${o.keys.length > 1 ? "i" : "e"} non riconosciut${o.keys.length > 1 ? "e" : "a"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Chiave non valida in ${o.origin}`;
        case "invalid_union":
          return "Input non valido";
        case "invalid_element":
          return `Valore non valido in ${o.origin}`;
        default:
          return "Input non valido";
      }
    };
  };
  var vfs = __lazy(() => {
    gp();
  });
  function ja() {
    return {
      localeError: Dlu()
    };
  }
  var Dlu = () => {
    let e = {
      string: {
        unit: "\u6587\u5B57",
        verb: "\u3067\u3042\u308B"
      },
      file: {
        unit: "\u30D0\u30A4\u30C8",
        verb: "\u3067\u3042\u308B"
      },
      array: {
        unit: "\u8981\u7D20",
        verb: "\u3067\u3042\u308B"
      },
      set: {
        unit: "\u8981\u7D20",
        verb: "\u3067\u3042\u308B"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u6570\u5024";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u914D\u5217";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u5165\u529B\u5024",
      email: "\u30E1\u30FC\u30EB\u30A2\u30C9\u30EC\u30B9",
      url: "URL",
      emoji: "\u7D75\u6587\u5B57",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO\u65E5\u6642",
      date: "ISO\u65E5\u4ED8",
      time: "ISO\u6642\u523B",
      duration: "ISO\u671F\u9593",
      ipv4: "IPv4\u30A2\u30C9\u30EC\u30B9",
      ipv6: "IPv6\u30A2\u30C9\u30EC\u30B9",
      cidrv4: "IPv4\u7BC4\u56F2",
      cidrv6: "IPv6\u7BC4\u56F2",
      base64: "base64\u30A8\u30F3\u30B3\u30FC\u30C9\u6587\u5B57\u5217",
      base64url: "base64url\u30A8\u30F3\u30B3\u30FC\u30C9\u6587\u5B57\u5217",
      json_string: "JSON\u6587\u5B57\u5217",
      e164: "E.164\u756A\u53F7",
      jwt: "JWT",
      template_literal: "\u5165\u529B\u5024"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u7121\u52B9\u306A\u5165\u529B: ${o.expected}\u304C\u671F\u5F85\u3055\u308C\u307E\u3057\u305F\u304C\u3001${n(o.input)}\u304C\u5165\u529B\u3055\u308C\u307E\u3057\u305F`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u7121\u52B9\u306A\u5165\u529B: ${stringifyPrimitive(o.values[0])}\u304C\u671F\u5F85\u3055\u308C\u307E\u3057\u305F`;
          }
          return `\u7121\u52B9\u306A\u9078\u629E: ${joinValues(o.values, "\u3001")}\u306E\u3044\u305A\u308C\u304B\u3067\u3042\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
        case "too_big":
          {
            let s = o.inclusive ? "\u4EE5\u4E0B\u3067\u3042\u308B" : "\u3088\u308A\u5C0F\u3055\u3044";
            let i = t(o.origin);
            if (i) {
              return `\u5927\u304D\u3059\u304E\u308B\u5024: ${o.origin ?? "\u5024"}\u306F${o.maximum.toString()}${i.unit ?? "\u8981\u7D20"}${s}\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
            }
            return `\u5927\u304D\u3059\u304E\u308B\u5024: ${o.origin ?? "\u5024"}\u306F${o.maximum.toString()}${s}\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
          }
        case "too_small":
          {
            let s = o.inclusive ? "\u4EE5\u4E0A\u3067\u3042\u308B" : "\u3088\u308A\u5927\u304D\u3044";
            let i = t(o.origin);
            if (i) {
              return `\u5C0F\u3055\u3059\u304E\u308B\u5024: ${o.origin}\u306F${o.minimum.toString()}${i.unit}${s}\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
            }
            return `\u5C0F\u3055\u3059\u304E\u308B\u5024: ${o.origin}\u306F${o.minimum.toString()}${s}\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u7121\u52B9\u306A\u6587\u5B57\u5217: "${s.prefix}"\u3067\u59CB\u307E\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
            }
            if (s.format === "ends_with") {
              return `\u7121\u52B9\u306A\u6587\u5B57\u5217: "${s.suffix}"\u3067\u7D42\u308F\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
            }
            if (s.format === "includes") {
              return `\u7121\u52B9\u306A\u6587\u5B57\u5217: "${s.includes}"\u3092\u542B\u3080\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
            }
            if (s.format === "regex") {
              return `\u7121\u52B9\u306A\u6587\u5B57\u5217: \u30D1\u30BF\u30FC\u30F3${s.pattern}\u306B\u4E00\u81F4\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
            }
            return `\u7121\u52B9\u306A${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u7121\u52B9\u306A\u6570\u5024: ${o.divisor}\u306E\u500D\u6570\u3067\u3042\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059`;
        case "unrecognized_keys":
          return `\u8A8D\u8B58\u3055\u308C\u3066\u3044\u306A\u3044\u30AD\u30FC${o.keys.length > 1 ? "\u7FA4" : ""}: ${joinValues(o.keys, "\u3001")}`;
        case "invalid_key":
          return `${o.origin}\u5185\u306E\u7121\u52B9\u306A\u30AD\u30FC`;
        case "invalid_union":
          return "\u7121\u52B9\u306A\u5165\u529B";
        case "invalid_element":
          return `${o.origin}\u5185\u306E\u7121\u52B9\u306A\u5024`;
        default:
          return "\u7121\u52B9\u306A\u5165\u529B";
      }
    };
  };
  var wfs = __lazy(() => {
    gp();
  });
  function kh_export() {
    return {
      localeError: Mlu()
    };
  }
  var Mlu = () => {
    let e = {
      string: {
        unit: "\u178F\u17BD\u17A2\u1780\u17D2\u179F\u179A",
        verb: "\u1782\u17BD\u179A\u1798\u17B6\u1793"
      },
      file: {
        unit: "\u1794\u17C3",
        verb: "\u1782\u17BD\u179A\u1798\u17B6\u1793"
      },
      array: {
        unit: "\u1792\u17B6\u178F\u17BB",
        verb: "\u1782\u17BD\u179A\u1798\u17B6\u1793"
      },
      set: {
        unit: "\u1792\u17B6\u178F\u17BB",
        verb: "\u1782\u17BD\u179A\u1798\u17B6\u1793"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "\u1798\u17B7\u1793\u1798\u17C2\u1793\u1787\u17B6\u179B\u17C1\u1781 (NaN)" : "\u179B\u17C1\u1781";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u17A2\u17B6\u179A\u17C1 (Array)";
            }
            if (o === null) {
              return "\u1782\u17D2\u1798\u17B6\u1793\u178F\u1798\u17D2\u179B\u17C3 (null)";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u1791\u17B7\u1793\u17D2\u1793\u1793\u17D0\u1799\u1794\u1789\u17D2\u1785\u17BC\u179B",
      email: "\u17A2\u17B6\u179F\u1799\u178A\u17D2\u178B\u17B6\u1793\u17A2\u17CA\u17B8\u1798\u17C2\u179B",
      url: "URL",
      emoji: "\u179F\u1789\u17D2\u1789\u17B6\u17A2\u17B6\u179A\u1798\u17D2\u1798\u178E\u17CD",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "\u1780\u17B6\u179B\u1794\u179A\u17B7\u1785\u17D2\u1786\u17C1\u1791 \u1793\u17B7\u1784\u1798\u17C9\u17C4\u1784 ISO",
      date: "\u1780\u17B6\u179B\u1794\u179A\u17B7\u1785\u17D2\u1786\u17C1\u1791 ISO",
      time: "\u1798\u17C9\u17C4\u1784 ISO",
      duration: "\u179A\u1799\u17C8\u1796\u17C1\u179B ISO",
      ipv4: "\u17A2\u17B6\u179F\u1799\u178A\u17D2\u178B\u17B6\u1793 IPv4",
      ipv6: "\u17A2\u17B6\u179F\u1799\u178A\u17D2\u178B\u17B6\u1793 IPv6",
      cidrv4: "\u178A\u17C2\u1793\u17A2\u17B6\u179F\u1799\u178A\u17D2\u178B\u17B6\u1793 IPv4",
      cidrv6: "\u178A\u17C2\u1793\u17A2\u17B6\u179F\u1799\u178A\u17D2\u178B\u17B6\u1793 IPv6",
      base64: "\u1781\u17D2\u179F\u17C2\u17A2\u1780\u17D2\u179F\u179A\u17A2\u17CA\u17B7\u1780\u17BC\u178A base64",
      base64url: "\u1781\u17D2\u179F\u17C2\u17A2\u1780\u17D2\u179F\u179A\u17A2\u17CA\u17B7\u1780\u17BC\u178A base64url",
      json_string: "\u1781\u17D2\u179F\u17C2\u17A2\u1780\u17D2\u179F\u179A JSON",
      e164: "\u179B\u17C1\u1781 E.164",
      jwt: "JWT",
      template_literal: "\u1791\u17B7\u1793\u17D2\u1793\u1793\u17D0\u1799\u1794\u1789\u17D2\u1785\u17BC\u179B"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u1791\u17B7\u1793\u17D2\u1793\u1793\u17D0\u1799\u1794\u1789\u17D2\u1785\u17BC\u179B\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1780\u17B6\u179A ${o.expected} \u1794\u17C9\u17BB\u1793\u17D2\u178F\u17C2\u1791\u1791\u17BD\u179B\u1794\u17B6\u1793 ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u1791\u17B7\u1793\u17D2\u1793\u1793\u17D0\u1799\u1794\u1789\u17D2\u1785\u17BC\u179B\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1780\u17B6\u179A ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u1787\u1798\u17D2\u179A\u17BE\u179F\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1787\u17B6\u1798\u17BD\u1799\u1780\u17D2\u1793\u17BB\u1784\u1785\u17C6\u178E\u17C4\u1798 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u1792\u17C6\u1796\u17C1\u1780\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1780\u17B6\u179A ${o.origin ?? "\u178F\u1798\u17D2\u179B\u17C3"} ${s} ${o.maximum.toString()} ${i.unit ?? "\u1792\u17B6\u178F\u17BB"}`;
            }
            return `\u1792\u17C6\u1796\u17C1\u1780\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1780\u17B6\u179A ${o.origin ?? "\u178F\u1798\u17D2\u179B\u17C3"} ${s} ${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u178F\u17BC\u1785\u1796\u17C1\u1780\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1780\u17B6\u179A ${o.origin} ${s} ${o.minimum.toString()} ${i.unit}`;
            }
            return `\u178F\u17BC\u1785\u1796\u17C1\u1780\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1780\u17B6\u179A ${o.origin} ${s} ${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u1781\u17D2\u179F\u17C2\u17A2\u1780\u17D2\u179F\u179A\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1785\u17B6\u1794\u17CB\u1795\u17D2\u178F\u17BE\u1798\u178A\u17C4\u1799 "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u1781\u17D2\u179F\u17C2\u17A2\u1780\u17D2\u179F\u179A\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1794\u1789\u17D2\u1785\u1794\u17CB\u178A\u17C4\u1799 "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u1781\u17D2\u179F\u17C2\u17A2\u1780\u17D2\u179F\u179A\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u1798\u17B6\u1793 "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u1781\u17D2\u179F\u17C2\u17A2\u1780\u17D2\u179F\u179A\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u178F\u17C2\u1795\u17D2\u1782\u17BC\u1795\u17D2\u1782\u1784\u1793\u17B9\u1784\u1791\u1798\u17D2\u179A\u1784\u17CB\u178A\u17C2\u179B\u1794\u17B6\u1793\u1780\u17C6\u178E\u178F\u17CB ${s.pattern}`;
            }
            return `\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u179B\u17C1\u1781\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u17D6 \u178F\u17D2\u179A\u17BC\u179C\u178F\u17C2\u1787\u17B6\u1796\u17A0\u17BB\u1782\u17BB\u178E\u1793\u17C3 ${o.divisor}`;
        case "unrecognized_keys":
          return `\u179A\u1780\u1783\u17BE\u1789\u179F\u17C4\u1798\u17B7\u1793\u179F\u17D2\u1782\u17B6\u179B\u17CB\u17D6 ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u179F\u17C4\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u1793\u17C5\u1780\u17D2\u1793\u17BB\u1784 ${o.origin}`;
        case "invalid_union":
          return "\u1791\u17B7\u1793\u17D2\u1793\u1793\u17D0\u1799\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C";
        case "invalid_element":
          return `\u1791\u17B7\u1793\u17D2\u1793\u1793\u17D0\u1799\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C\u1793\u17C5\u1780\u17D2\u1793\u17BB\u1784 ${o.origin}`;
        default:
          return "\u1791\u17B7\u1793\u17D2\u1793\u1793\u17D0\u1799\u1798\u17B7\u1793\u178F\u17D2\u179A\u17B9\u1798\u178F\u17D2\u179A\u17BC\u179C";
      }
    };
  };
  var Cfs = __lazy(() => {
    gp();
  });
  function ko_export() {
    return {
      localeError: Nlu()
    };
  }
  var Nlu = () => {
    let e = {
      string: {
        unit: "\uBB38\uC790",
        verb: "to have"
      },
      file: {
        unit: "\uBC14\uC774\uD2B8",
        verb: "to have"
      },
      array: {
        unit: "\uAC1C",
        verb: "to have"
      },
      set: {
        unit: "\uAC1C",
        verb: "to have"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\uC785\uB825",
      email: "\uC774\uBA54\uC77C \uC8FC\uC18C",
      url: "URL",
      emoji: "\uC774\uBAA8\uC9C0",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO \uB0A0\uC9DC\uC2DC\uAC04",
      date: "ISO \uB0A0\uC9DC",
      time: "ISO \uC2DC\uAC04",
      duration: "ISO \uAE30\uAC04",
      ipv4: "IPv4 \uC8FC\uC18C",
      ipv6: "IPv6 \uC8FC\uC18C",
      cidrv4: "IPv4 \uBC94\uC704",
      cidrv6: "IPv6 \uBC94\uC704",
      base64: "base64 \uC778\uCF54\uB529 \uBB38\uC790\uC5F4",
      base64url: "base64url \uC778\uCF54\uB529 \uBB38\uC790\uC5F4",
      json_string: "JSON \uBB38\uC790\uC5F4",
      e164: "E.164 \uBC88\uD638",
      jwt: "JWT",
      template_literal: "\uC785\uB825"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\uC798\uBABB\uB41C \uC785\uB825: \uC608\uC0C1 \uD0C0\uC785\uC740 ${o.expected}, \uBC1B\uC740 \uD0C0\uC785\uC740 ${n(o.input)}\uC785\uB2C8\uB2E4`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\uC798\uBABB\uB41C \uC785\uB825: \uAC12\uC740 ${stringifyPrimitive(o.values[0])} \uC774\uC5B4\uC57C \uD569\uB2C8\uB2E4`;
          }
          return `\uC798\uBABB\uB41C \uC635\uC158: ${joinValues(o.values, "\uB610\uB294 ")} \uC911 \uD558\uB098\uC5EC\uC57C \uD569\uB2C8\uB2E4`;
        case "too_big":
          {
            let s = o.inclusive ? "\uC774\uD558" : "\uBBF8\uB9CC";
            let i = s === "\uBBF8\uB9CC" ? "\uC774\uC5B4\uC57C \uD569\uB2C8\uB2E4" : "\uC5EC\uC57C \uD569\uB2C8\uB2E4";
            let a = t(o.origin);
            let l = a?.unit ?? "\uC694\uC18C";
            if (a) {
              return `${o.origin ?? "\uAC12"}\uC774 \uB108\uBB34 \uD07D\uB2C8\uB2E4: ${o.maximum.toString()}${l} ${s}${i}`;
            }
            return `${o.origin ?? "\uAC12"}\uC774 \uB108\uBB34 \uD07D\uB2C8\uB2E4: ${o.maximum.toString()} ${s}${i}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? "\uC774\uC0C1" : "\uCD08\uACFC";
            let i = s === "\uC774\uC0C1" ? "\uC774\uC5B4\uC57C \uD569\uB2C8\uB2E4" : "\uC5EC\uC57C \uD569\uB2C8\uB2E4";
            let a = t(o.origin);
            let l = a?.unit ?? "\uC694\uC18C";
            if (a) {
              return `${o.origin ?? "\uAC12"}\uC774 \uB108\uBB34 \uC791\uC2B5\uB2C8\uB2E4: ${o.minimum.toString()}${l} ${s}${i}`;
            }
            return `${o.origin ?? "\uAC12"}\uC774 \uB108\uBB34 \uC791\uC2B5\uB2C8\uB2E4: ${o.minimum.toString()} ${s}${i}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\uC798\uBABB\uB41C \uBB38\uC790\uC5F4: "${s.prefix}"(\uC73C)\uB85C \uC2DC\uC791\uD574\uC57C \uD569\uB2C8\uB2E4`;
            }
            if (s.format === "ends_with") {
              return `\uC798\uBABB\uB41C \uBB38\uC790\uC5F4: "${s.suffix}"(\uC73C)\uB85C \uB05D\uB098\uC57C \uD569\uB2C8\uB2E4`;
            }
            if (s.format === "includes") {
              return `\uC798\uBABB\uB41C \uBB38\uC790\uC5F4: "${s.includes}"\uC744(\uB97C) \uD3EC\uD568\uD574\uC57C \uD569\uB2C8\uB2E4`;
            }
            if (s.format === "regex") {
              return `\uC798\uBABB\uB41C \uBB38\uC790\uC5F4: \uC815\uADDC\uC2DD ${s.pattern} \uD328\uD134\uACFC \uC77C\uCE58\uD574\uC57C \uD569\uB2C8\uB2E4`;
            }
            return `\uC798\uBABB\uB41C ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\uC798\uBABB\uB41C \uC22B\uC790: ${o.divisor}\uC758 \uBC30\uC218\uC5EC\uC57C \uD569\uB2C8\uB2E4`;
        case "unrecognized_keys":
          return `\uC778\uC2DD\uD560 \uC218 \uC5C6\uB294 \uD0A4: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\uC798\uBABB\uB41C \uD0A4: ${o.origin}`;
        case "invalid_union":
          return "\uC798\uBABB\uB41C \uC785\uB825";
        case "invalid_element":
          return `\uC798\uBABB\uB41C \uAC12: ${o.origin}`;
        default:
          return "\uC798\uBABB\uB41C \uC785\uB825";
      }
    };
  };
  var Rfs = __lazy(() => {
    gp();
  });
  function mk_export() {
    return {
      localeError: Llu()
    };
  }
  var Llu = () => {
    let e = {
      string: {
        unit: "\u0437\u043D\u0430\u0446\u0438",
        verb: "\u0434\u0430 \u0438\u043C\u0430\u0430\u0442"
      },
      file: {
        unit: "\u0431\u0430\u0458\u0442\u0438",
        verb: "\u0434\u0430 \u0438\u043C\u0430\u0430\u0442"
      },
      array: {
        unit: "\u0441\u0442\u0430\u0432\u043A\u0438",
        verb: "\u0434\u0430 \u0438\u043C\u0430\u0430\u0442"
      },
      set: {
        unit: "\u0441\u0442\u0430\u0432\u043A\u0438",
        verb: "\u0434\u0430 \u0438\u043C\u0430\u0430\u0442"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u0431\u0440\u043E\u0458";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u043D\u0438\u0437\u0430";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0432\u043D\u0435\u0441",
      email: "\u0430\u0434\u0440\u0435\u0441\u0430 \u043D\u0430 \u0435-\u043F\u043E\u0448\u0442\u0430",
      url: "URL",
      emoji: "\u0435\u043C\u043E\u045F\u0438",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO \u0434\u0430\u0442\u0443\u043C \u0438 \u0432\u0440\u0435\u043C\u0435",
      date: "ISO \u0434\u0430\u0442\u0443\u043C",
      time: "ISO \u0432\u0440\u0435\u043C\u0435",
      duration: "ISO \u0432\u0440\u0435\u043C\u0435\u0442\u0440\u0430\u0435\u045A\u0435",
      ipv4: "IPv4 \u0430\u0434\u0440\u0435\u0441\u0430",
      ipv6: "IPv6 \u0430\u0434\u0440\u0435\u0441\u0430",
      cidrv4: "IPv4 \u043E\u043F\u0441\u0435\u0433",
      cidrv6: "IPv6 \u043E\u043F\u0441\u0435\u0433",
      base64: "base64-\u0435\u043D\u043A\u043E\u0434\u0438\u0440\u0430\u043D\u0430 \u043D\u0438\u0437\u0430",
      base64url: "base64url-\u0435\u043D\u043A\u043E\u0434\u0438\u0440\u0430\u043D\u0430 \u043D\u0438\u0437\u0430",
      json_string: "JSON \u043D\u0438\u0437\u0430",
      e164: "E.164 \u0431\u0440\u043E\u0458",
      jwt: "JWT",
      template_literal: "\u0432\u043D\u0435\u0441"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u0413\u0440\u0435\u0448\u0435\u043D \u0432\u043D\u0435\u0441: \u0441\u0435 \u043E\u0447\u0435\u043A\u0443\u0432\u0430 ${o.expected}, \u043F\u0440\u0438\u043C\u0435\u043D\u043E ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Invalid input: expected ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u0413\u0440\u0435\u0448\u0430\u043D\u0430 \u043E\u043F\u0446\u0438\u0458\u0430: \u0441\u0435 \u043E\u0447\u0435\u043A\u0443\u0432\u0430 \u0435\u0434\u043D\u0430 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u041F\u0440\u0435\u043C\u043D\u043E\u0433\u0443 \u0433\u043E\u043B\u0435\u043C: \u0441\u0435 \u043E\u0447\u0435\u043A\u0443\u0432\u0430 ${o.origin ?? "\u0432\u0440\u0435\u0434\u043D\u043E\u0441\u0442\u0430"} \u0434\u0430 \u0438\u043C\u0430 ${s}${o.maximum.toString()} ${i.unit ?? "\u0435\u043B\u0435\u043C\u0435\u043D\u0442\u0438"}`;
            }
            return `\u041F\u0440\u0435\u043C\u043D\u043E\u0433\u0443 \u0433\u043E\u043B\u0435\u043C: \u0441\u0435 \u043E\u0447\u0435\u043A\u0443\u0432\u0430 ${o.origin ?? "\u0432\u0440\u0435\u0434\u043D\u043E\u0441\u0442\u0430"} \u0434\u0430 \u0431\u0438\u0434\u0435 ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u041F\u0440\u0435\u043C\u043D\u043E\u0433\u0443 \u043C\u0430\u043B: \u0441\u0435 \u043E\u0447\u0435\u043A\u0443\u0432\u0430 ${o.origin} \u0434\u0430 \u0438\u043C\u0430 ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `\u041F\u0440\u0435\u043C\u043D\u043E\u0433\u0443 \u043C\u0430\u043B: \u0441\u0435 \u043E\u0447\u0435\u043A\u0443\u0432\u0430 ${o.origin} \u0434\u0430 \u0431\u0438\u0434\u0435 ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u041D\u0435\u0432\u0430\u0436\u0435\u0447\u043A\u0430 \u043D\u0438\u0437\u0430: \u043C\u043E\u0440\u0430 \u0434\u0430 \u0437\u0430\u043F\u043E\u0447\u043D\u0443\u0432\u0430 \u0441\u043E "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u041D\u0435\u0432\u0430\u0436\u0435\u0447\u043A\u0430 \u043D\u0438\u0437\u0430: \u043C\u043E\u0440\u0430 \u0434\u0430 \u0437\u0430\u0432\u0440\u0448\u0443\u0432\u0430 \u0441\u043E "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u041D\u0435\u0432\u0430\u0436\u0435\u0447\u043A\u0430 \u043D\u0438\u0437\u0430: \u043C\u043E\u0440\u0430 \u0434\u0430 \u0432\u043A\u043B\u0443\u0447\u0443\u0432\u0430 "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u041D\u0435\u0432\u0430\u0436\u0435\u0447\u043A\u0430 \u043D\u0438\u0437\u0430: \u043C\u043E\u0440\u0430 \u0434\u0430 \u043E\u0434\u0433\u043E\u0430\u0440\u0430 \u043D\u0430 \u043F\u0430\u0442\u0435\u0440\u043D\u043E\u0442 ${s.pattern}`;
            }
            return `Invalid ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u0413\u0440\u0435\u0448\u0435\u043D \u0431\u0440\u043E\u0458: \u043C\u043E\u0440\u0430 \u0434\u0430 \u0431\u0438\u0434\u0435 \u0434\u0435\u043B\u0438\u0432 \u0441\u043E ${o.divisor}`;
        case "unrecognized_keys":
          return `${o.keys.length > 1 ? "\u041D\u0435\u043F\u0440\u0435\u043F\u043E\u0437\u043D\u0430\u0435\u043D\u0438 \u043A\u043B\u0443\u0447\u0435\u0432\u0438" : "\u041D\u0435\u043F\u0440\u0435\u043F\u043E\u0437\u043D\u0430\u0435\u043D \u043A\u043B\u0443\u0447"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u0413\u0440\u0435\u0448\u0435\u043D \u043A\u043B\u0443\u0447 \u0432\u043E ${o.origin}`;
        case "invalid_union":
          return "\u0413\u0440\u0435\u0448\u0435\u043D \u0432\u043D\u0435\u0441";
        case "invalid_element":
          return `\u0413\u0440\u0435\u0448\u043D\u0430 \u0432\u0440\u0435\u0434\u043D\u043E\u0441\u0442 \u0432\u043E ${o.origin}`;
        default:
          return "\u0413\u0440\u0435\u0448\u0435\u043D \u0432\u043D\u0435\u0441";
      }
    };
  };
  var xfs = __lazy(() => {
    gp();
  });
  function ms_export() {
    return {
      localeError: Flu()
    };
  }
  var Flu = () => {
    let e = {
      string: {
        unit: "aksara",
        verb: "mempunyai"
      },
      file: {
        unit: "bait",
        verb: "mempunyai"
      },
      array: {
        unit: "elemen",
        verb: "mempunyai"
      },
      set: {
        unit: "elemen",
        verb: "mempunyai"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "nombor";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "input",
      email: "alamat e-mel",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "tarikh masa ISO",
      date: "tarikh ISO",
      time: "masa ISO",
      duration: "tempoh ISO",
      ipv4: "alamat IPv4",
      ipv6: "alamat IPv6",
      cidrv4: "julat IPv4",
      cidrv6: "julat IPv6",
      base64: "string dikodkan base64",
      base64url: "string dikodkan base64url",
      json_string: "string JSON",
      e164: "nombor E.164",
      jwt: "JWT",
      template_literal: "input"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Input tidak sah: dijangka ${o.expected}, diterima ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Input tidak sah: dijangka ${stringifyPrimitive(o.values[0])}`;
          }
          return `Pilihan tidak sah: dijangka salah satu daripada ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Terlalu besar: dijangka ${o.origin ?? "nilai"} ${i.verb} ${s}${o.maximum.toString()} ${i.unit ?? "elemen"}`;
            }
            return `Terlalu besar: dijangka ${o.origin ?? "nilai"} adalah ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Terlalu kecil: dijangka ${o.origin} ${i.verb} ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Terlalu kecil: dijangka ${o.origin} adalah ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `String tidak sah: mesti bermula dengan "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `String tidak sah: mesti berakhir dengan "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `String tidak sah: mesti mengandungi "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `String tidak sah: mesti sepadan dengan corak ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} tidak sah`;
          }
        case "not_multiple_of":
          return `Nombor tidak sah: perlu gandaan ${o.divisor}`;
        case "unrecognized_keys":
          return `Kunci tidak dikenali: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Kunci tidak sah dalam ${o.origin}`;
        case "invalid_union":
          return "Input tidak sah";
        case "invalid_element":
          return `Nilai tidak sah dalam ${o.origin}`;
        default:
          return "Input tidak sah";
      }
    };
  };
  var kfs = __lazy(() => {
    gp();
  });
  function nl_export() {
    return {
      localeError: Ulu()
    };
  }
  var Ulu = () => {
    let e = {
      string: {
        unit: "tekens"
      },
      file: {
        unit: "bytes"
      },
      array: {
        unit: "elementen"
      },
      set: {
        unit: "elementen"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "getal";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "invoer",
      email: "emailadres",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO datum en tijd",
      date: "ISO datum",
      time: "ISO tijd",
      duration: "ISO duur",
      ipv4: "IPv4-adres",
      ipv6: "IPv6-adres",
      cidrv4: "IPv4-bereik",
      cidrv6: "IPv6-bereik",
      base64: "base64-gecodeerde tekst",
      base64url: "base64 URL-gecodeerde tekst",
      json_string: "JSON string",
      e164: "E.164-nummer",
      jwt: "JWT",
      template_literal: "invoer"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Ongeldige invoer: verwacht ${o.expected}, ontving ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Ongeldige invoer: verwacht ${stringifyPrimitive(o.values[0])}`;
          }
          return `Ongeldige optie: verwacht \xE9\xE9n van ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Te lang: verwacht dat ${o.origin ?? "waarde"} ${s}${o.maximum.toString()} ${i.unit ?? "elementen"} bevat`;
            }
            return `Te lang: verwacht dat ${o.origin ?? "waarde"} ${s}${o.maximum.toString()} is`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Te kort: verwacht dat ${o.origin} ${s}${o.minimum.toString()} ${i.unit} bevat`;
            }
            return `Te kort: verwacht dat ${o.origin} ${s}${o.minimum.toString()} is`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Ongeldige tekst: moet met "${s.prefix}" beginnen`;
            }
            if (s.format === "ends_with") {
              return `Ongeldige tekst: moet op "${s.suffix}" eindigen`;
            }
            if (s.format === "includes") {
              return `Ongeldige tekst: moet "${s.includes}" bevatten`;
            }
            if (s.format === "regex") {
              return `Ongeldige tekst: moet overeenkomen met patroon ${s.pattern}`;
            }
            return `Ongeldig: ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Ongeldig getal: moet een veelvoud van ${o.divisor} zijn`;
        case "unrecognized_keys":
          return `Onbekende key${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Ongeldige key in ${o.origin}`;
        case "invalid_union":
          return "Ongeldige invoer";
        case "invalid_element":
          return `Ongeldige waarde in ${o.origin}`;
        default:
          return "Ongeldige invoer";
      }
    };
  };
  var Afs = __lazy(() => {
    gp();
  });
  function no_export() {
    return {
      localeError: Blu()
    };
  }
  var Blu = () => {
    let e = {
      string: {
        unit: "tegn",
        verb: "\xE5 ha"
      },
      file: {
        unit: "bytes",
        verb: "\xE5 ha"
      },
      array: {
        unit: "elementer",
        verb: "\xE5 inneholde"
      },
      set: {
        unit: "elementer",
        verb: "\xE5 inneholde"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "tall";
        case "object":
          {
            if (Array.isArray(o)) {
              return "liste";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "input",
      email: "e-postadresse",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO dato- og klokkeslett",
      date: "ISO-dato",
      time: "ISO-klokkeslett",
      duration: "ISO-varighet",
      ipv4: "IPv4-omr\xE5de",
      ipv6: "IPv6-omr\xE5de",
      cidrv4: "IPv4-spekter",
      cidrv6: "IPv6-spekter",
      base64: "base64-enkodet streng",
      base64url: "base64url-enkodet streng",
      json_string: "JSON-streng",
      e164: "E.164-nummer",
      jwt: "JWT",
      template_literal: "input"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Ugyldig input: forventet ${o.expected}, fikk ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Ugyldig verdi: forventet ${stringifyPrimitive(o.values[0])}`;
          }
          return `Ugyldig valg: forventet en av ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `For stor(t): forventet ${o.origin ?? "value"} til \xE5 ha ${s}${o.maximum.toString()} ${i.unit ?? "elementer"}`;
            }
            return `For stor(t): forventet ${o.origin ?? "value"} til \xE5 ha ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `For lite(n): forventet ${o.origin} til \xE5 ha ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `For lite(n): forventet ${o.origin} til \xE5 ha ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Ugyldig streng: m\xE5 starte med "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Ugyldig streng: m\xE5 ende med "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Ugyldig streng: m\xE5 inneholde "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Ugyldig streng: m\xE5 matche m\xF8nsteret ${s.pattern}`;
            }
            return `Ugyldig ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Ugyldig tall: m\xE5 v\xE6re et multiplum av ${o.divisor}`;
        case "unrecognized_keys":
          return `${o.keys.length > 1 ? "Ukjente n\xF8kler" : "Ukjent n\xF8kkel"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Ugyldig n\xF8kkel i ${o.origin}`;
        case "invalid_union":
          return "Ugyldig input";
        case "invalid_element":
          return `Ugyldig verdi i ${o.origin}`;
        default:
          return "Ugyldig input";
      }
    };
  };
  var Ifs = __lazy(() => {
    gp();
  });
  function ota_export() {
    return {
      localeError: $lu()
    };
  }
  var $lu = () => {
    let e = {
      string: {
        unit: "harf",
        verb: "olmal\u0131d\u0131r"
      },
      file: {
        unit: "bayt",
        verb: "olmal\u0131d\u0131r"
      },
      array: {
        unit: "unsur",
        verb: "olmal\u0131d\u0131r"
      },
      set: {
        unit: "unsur",
        verb: "olmal\u0131d\u0131r"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "numara";
        case "object":
          {
            if (Array.isArray(o)) {
              return "saf";
            }
            if (o === null) {
              return "gayb";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "giren",
      email: "epostag\xE2h",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO heng\xE2m\u0131",
      date: "ISO tarihi",
      time: "ISO zaman\u0131",
      duration: "ISO m\xFCddeti",
      ipv4: "IPv4 ni\u015F\xE2n\u0131",
      ipv6: "IPv6 ni\u015F\xE2n\u0131",
      cidrv4: "IPv4 menzili",
      cidrv6: "IPv6 menzili",
      base64: "base64-\u015Fifreli metin",
      base64url: "base64url-\u015Fifreli metin",
      json_string: "JSON metin",
      e164: "E.164 say\u0131s\u0131",
      jwt: "JWT",
      template_literal: "giren"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `F\xE2sit giren: umulan ${o.expected}, al\u0131nan ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `F\xE2sit giren: umulan ${stringifyPrimitive(o.values[0])}`;
          }
          return `F\xE2sit tercih: m\xFBteberler ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Fazla b\xFCy\xFCk: ${o.origin ?? "value"}, ${s}${o.maximum.toString()} ${i.unit ?? "elements"} sahip olmal\u0131yd\u0131.`;
            }
            return `Fazla b\xFCy\xFCk: ${o.origin ?? "value"}, ${s}${o.maximum.toString()} olmal\u0131yd\u0131.`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Fazla k\xFC\xE7\xFCk: ${o.origin}, ${s}${o.minimum.toString()} ${i.unit} sahip olmal\u0131yd\u0131.`;
            }
            return `Fazla k\xFC\xE7\xFCk: ${o.origin}, ${s}${o.minimum.toString()} olmal\u0131yd\u0131.`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `F\xE2sit metin: "${s.prefix}" ile ba\u015Flamal\u0131.`;
            }
            if (s.format === "ends_with") {
              return `F\xE2sit metin: "${s.suffix}" ile bitmeli.`;
            }
            if (s.format === "includes") {
              return `F\xE2sit metin: "${s.includes}" ihtiv\xE2 etmeli.`;
            }
            if (s.format === "regex") {
              return `F\xE2sit metin: ${s.pattern} nak\u015F\u0131na uymal\u0131.`;
            }
            return `F\xE2sit ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `F\xE2sit say\u0131: ${o.divisor} kat\u0131 olmal\u0131yd\u0131.`;
        case "unrecognized_keys":
          return `Tan\u0131nmayan anahtar ${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `${o.origin} i\xE7in tan\u0131nmayan anahtar var.`;
        case "invalid_union":
          return "Giren tan\u0131namad\u0131.";
        case "invalid_element":
          return `${o.origin} i\xE7in tan\u0131nmayan k\u0131ymet var.`;
        default:
          return "K\u0131ymet tan\u0131namad\u0131.";
      }
    };
  };
  var Pfs = __lazy(() => {
    gp();
  });
  function ps() {
    return {
      localeError: Hlu()
    };
  }
  var Hlu = () => {
    let e = {
      string: {
        unit: "\u062A\u0648\u06A9\u064A",
        verb: "\u0648\u0644\u0631\u064A"
      },
      file: {
        unit: "\u0628\u0627\u06CC\u067C\u0633",
        verb: "\u0648\u0644\u0631\u064A"
      },
      array: {
        unit: "\u062A\u0648\u06A9\u064A",
        verb: "\u0648\u0644\u0631\u064A"
      },
      set: {
        unit: "\u062A\u0648\u06A9\u064A",
        verb: "\u0648\u0644\u0631\u064A"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u0639\u062F\u062F";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u0627\u0631\u06D0";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0648\u0631\u0648\u062F\u064A",
      email: "\u0628\u0631\u06CC\u069A\u0646\u0627\u0644\u06CC\u06A9",
      url: "\u06CC\u0648 \u0622\u0631 \u0627\u0644",
      emoji: "\u0627\u06CC\u0645\u0648\u062C\u064A",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "\u0646\u06CC\u067C\u0647 \u0627\u0648 \u0648\u062E\u062A",
      date: "\u0646\u06D0\u067C\u0647",
      time: "\u0648\u062E\u062A",
      duration: "\u0645\u0648\u062F\u0647",
      ipv4: "\u062F IPv4 \u067E\u062A\u0647",
      ipv6: "\u062F IPv6 \u067E\u062A\u0647",
      cidrv4: "\u062F IPv4 \u0633\u0627\u062D\u0647",
      cidrv6: "\u062F IPv6 \u0633\u0627\u062D\u0647",
      base64: "base64-encoded \u0645\u062A\u0646",
      base64url: "base64url-encoded \u0645\u062A\u0646",
      json_string: "JSON \u0645\u062A\u0646",
      e164: "\u062F E.164 \u0634\u0645\u06D0\u0631\u0647",
      jwt: "JWT",
      template_literal: "\u0648\u0631\u0648\u062F\u064A"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u0646\u0627\u0633\u0645 \u0648\u0631\u0648\u062F\u064A: \u0628\u0627\u06CC\u062F ${o.expected} \u0648\u0627\u06CC, \u0645\u06AB\u0631 ${n(o.input)} \u062A\u0631\u0644\u0627\u0633\u0647 \u0634\u0648`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u0646\u0627\u0633\u0645 \u0648\u0631\u0648\u062F\u064A: \u0628\u0627\u06CC\u062F ${stringifyPrimitive(o.values[0])} \u0648\u0627\u06CC`;
          }
          return `\u0646\u0627\u0633\u0645 \u0627\u0646\u062A\u062E\u0627\u0628: \u0628\u0627\u06CC\u062F \u06CC\u0648 \u0644\u0647 ${joinValues(o.values, "|")} \u0685\u062E\u0647 \u0648\u0627\u06CC`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u0689\u06CC\u0631 \u0644\u0648\u06CC: ${o.origin ?? "\u0627\u0631\u0632\u069A\u062A"} \u0628\u0627\u06CC\u062F ${s}${o.maximum.toString()} ${i.unit ?? "\u0639\u0646\u0635\u0631\u0648\u0646\u0647"} \u0648\u0644\u0631\u064A`;
            }
            return `\u0689\u06CC\u0631 \u0644\u0648\u06CC: ${o.origin ?? "\u0627\u0631\u0632\u069A\u062A"} \u0628\u0627\u06CC\u062F ${s}${o.maximum.toString()} \u0648\u064A`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u0689\u06CC\u0631 \u06A9\u0648\u0686\u0646\u06CC: ${o.origin} \u0628\u0627\u06CC\u062F ${s}${o.minimum.toString()} ${i.unit} \u0648\u0644\u0631\u064A`;
            }
            return `\u0689\u06CC\u0631 \u06A9\u0648\u0686\u0646\u06CC: ${o.origin} \u0628\u0627\u06CC\u062F ${s}${o.minimum.toString()} \u0648\u064A`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u0646\u0627\u0633\u0645 \u0645\u062A\u0646: \u0628\u0627\u06CC\u062F \u062F "${s.prefix}" \u0633\u0631\u0647 \u067E\u06CC\u0644 \u0634\u064A`;
            }
            if (s.format === "ends_with") {
              return `\u0646\u0627\u0633\u0645 \u0645\u062A\u0646: \u0628\u0627\u06CC\u062F \u062F "${s.suffix}" \u0633\u0631\u0647 \u067E\u0627\u06CC \u062A\u0647 \u0648\u0631\u0633\u064A\u0696\u064A`;
            }
            if (s.format === "includes") {
              return `\u0646\u0627\u0633\u0645 \u0645\u062A\u0646: \u0628\u0627\u06CC\u062F "${s.includes}" \u0648\u0644\u0631\u064A`;
            }
            if (s.format === "regex") {
              return `\u0646\u0627\u0633\u0645 \u0645\u062A\u0646: \u0628\u0627\u06CC\u062F \u062F ${s.pattern} \u0633\u0631\u0647 \u0645\u0637\u0627\u0628\u0642\u062A \u0648\u0644\u0631\u064A`;
            }
            return `${r[s.format] ?? o.format} \u0646\u0627\u0633\u0645 \u062F\u06CC`;
          }
        case "not_multiple_of":
          return `\u0646\u0627\u0633\u0645 \u0639\u062F\u062F: \u0628\u0627\u06CC\u062F \u062F ${o.divisor} \u0645\u0636\u0631\u0628 \u0648\u064A`;
        case "unrecognized_keys":
          return `\u0646\u0627\u0633\u0645 ${o.keys.length > 1 ? "\u06A9\u0644\u06CC\u0689\u0648\u0646\u0647" : "\u06A9\u0644\u06CC\u0689"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u0646\u0627\u0633\u0645 \u06A9\u0644\u06CC\u0689 \u067E\u0647 ${o.origin} \u06A9\u06D0`;
        case "invalid_union":
          return "\u0646\u0627\u0633\u0645\u0647 \u0648\u0631\u0648\u062F\u064A";
        case "invalid_element":
          return `\u0646\u0627\u0633\u0645 \u0639\u0646\u0635\u0631 \u067E\u0647 ${o.origin} \u06A9\u06D0`;
        default:
          return "\u0646\u0627\u0633\u0645\u0647 \u0648\u0631\u0648\u062F\u064A";
      }
    };
  };
  var Ofs = __lazy(() => {
    gp();
  });
  function pl() {
    return {
      localeError: jlu()
    };
  }
  var jlu = () => {
    let e = {
      string: {
        unit: "znak\xF3w",
        verb: "mie\u0107"
      },
      file: {
        unit: "bajt\xF3w",
        verb: "mie\u0107"
      },
      array: {
        unit: "element\xF3w",
        verb: "mie\u0107"
      },
      set: {
        unit: "element\xF3w",
        verb: "mie\u0107"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "liczba";
        case "object":
          {
            if (Array.isArray(o)) {
              return "tablica";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "wyra\u017Cenie",
      email: "adres email",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "data i godzina w formacie ISO",
      date: "data w formacie ISO",
      time: "godzina w formacie ISO",
      duration: "czas trwania ISO",
      ipv4: "adres IPv4",
      ipv6: "adres IPv6",
      cidrv4: "zakres IPv4",
      cidrv6: "zakres IPv6",
      base64: "ci\u0105g znak\xF3w zakodowany w formacie base64",
      base64url: "ci\u0105g znak\xF3w zakodowany w formacie base64url",
      json_string: "ci\u0105g znak\xF3w w formacie JSON",
      e164: "liczba E.164",
      jwt: "JWT",
      template_literal: "wej\u015Bcie"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Nieprawid\u0142owe dane wej\u015Bciowe: oczekiwano ${o.expected}, otrzymano ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Nieprawid\u0142owe dane wej\u015Bciowe: oczekiwano ${stringifyPrimitive(o.values[0])}`;
          }
          return `Nieprawid\u0142owa opcja: oczekiwano jednej z warto\u015Bci ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Za du\u017Ca warto\u015B\u0107: oczekiwano, \u017Ce ${o.origin ?? "warto\u015B\u0107"} b\u0119dzie mie\u0107 ${s}${o.maximum.toString()} ${i.unit ?? "element\xF3w"}`;
            }
            return `Zbyt du\u017C(y/a/e): oczekiwano, \u017Ce ${o.origin ?? "warto\u015B\u0107"} b\u0119dzie wynosi\u0107 ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Za ma\u0142a warto\u015B\u0107: oczekiwano, \u017Ce ${o.origin ?? "warto\u015B\u0107"} b\u0119dzie mie\u0107 ${s}${o.minimum.toString()} ${i.unit ?? "element\xF3w"}`;
            }
            return `Zbyt ma\u0142(y/a/e): oczekiwano, \u017Ce ${o.origin ?? "warto\u015B\u0107"} b\u0119dzie wynosi\u0107 ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Nieprawid\u0142owy ci\u0105g znak\xF3w: musi zaczyna\u0107 si\u0119 od "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Nieprawid\u0142owy ci\u0105g znak\xF3w: musi ko\u0144czy\u0107 si\u0119 na "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Nieprawid\u0142owy ci\u0105g znak\xF3w: musi zawiera\u0107 "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Nieprawid\u0142owy ci\u0105g znak\xF3w: musi odpowiada\u0107 wzorcowi ${s.pattern}`;
            }
            return `Nieprawid\u0142ow(y/a/e) ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Nieprawid\u0142owa liczba: musi by\u0107 wielokrotno\u015Bci\u0105 ${o.divisor}`;
        case "unrecognized_keys":
          return `Nierozpoznane klucze${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Nieprawid\u0142owy klucz w ${o.origin}`;
        case "invalid_union":
          return "Nieprawid\u0142owe dane wej\u015Bciowe";
        case "invalid_element":
          return `Nieprawid\u0142owa warto\u015B\u0107 w ${o.origin}`;
        default:
          return "Nieprawid\u0142owe dane wej\u015Bciowe";
      }
    };
  };
  var Dfs = __lazy(() => {
    gp();
  });
  function pt_export() {
    return {
      localeError: qlu()
    };
  }
  var qlu = () => {
    let e = {
      string: {
        unit: "caracteres",
        verb: "ter"
      },
      file: {
        unit: "bytes",
        verb: "ter"
      },
      array: {
        unit: "itens",
        verb: "ter"
      },
      set: {
        unit: "itens",
        verb: "ter"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "n\xFAmero";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "nulo";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "padr\xE3o",
      email: "endere\xE7o de e-mail",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "data e hora ISO",
      date: "data ISO",
      time: "hora ISO",
      duration: "dura\xE7\xE3o ISO",
      ipv4: "endere\xE7o IPv4",
      ipv6: "endere\xE7o IPv6",
      cidrv4: "faixa de IPv4",
      cidrv6: "faixa de IPv6",
      base64: "texto codificado em base64",
      base64url: "URL codificada em base64",
      json_string: "texto JSON",
      e164: "n\xFAmero E.164",
      jwt: "JWT",
      template_literal: "entrada"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Tipo inv\xE1lido: esperado ${o.expected}, recebido ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Entrada inv\xE1lida: esperado ${stringifyPrimitive(o.values[0])}`;
          }
          return `Op\xE7\xE3o inv\xE1lida: esperada uma das ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Muito grande: esperado que ${o.origin ?? "valor"} tivesse ${s}${o.maximum.toString()} ${i.unit ?? "elementos"}`;
            }
            return `Muito grande: esperado que ${o.origin ?? "valor"} fosse ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Muito pequeno: esperado que ${o.origin} tivesse ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Muito pequeno: esperado que ${o.origin} fosse ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Texto inv\xE1lido: deve come\xE7ar com "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Texto inv\xE1lido: deve terminar com "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Texto inv\xE1lido: deve incluir "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Texto inv\xE1lido: deve corresponder ao padr\xE3o ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} inv\xE1lido`;
          }
        case "not_multiple_of":
          return `N\xFAmero inv\xE1lido: deve ser m\xFAltiplo de ${o.divisor}`;
        case "unrecognized_keys":
          return `Chave${o.keys.length > 1 ? "s" : ""} desconhecida${o.keys.length > 1 ? "s" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Chave inv\xE1lida em ${o.origin}`;
        case "invalid_union":
          return "Entrada inv\xE1lida";
        case "invalid_element":
          return `Valor inv\xE1lido em ${o.origin}`;
        default:
          return "Campo inv\xE1lido";
      }
    };
  };
  var Mfs = __lazy(() => {
    gp();
  });
  function Nfs(e, t, n, r) {
    let o = Math.abs(e);
    let s = o % 10;
    let i = o % 100;
    if (i >= 11 && i <= 19) {
      return r;
    }
    if (s === 1) {
      return t;
    }
    if (s >= 2 && s <= 4) {
      return n;
    }
    return r;
  }
  function ru_export() {
    return {
      localeError: Wlu()
    };
  }
  var Wlu = () => {
    let e = {
      string: {
        unit: {
          one: "\u0441\u0438\u043C\u0432\u043E\u043B",
          few: "\u0441\u0438\u043C\u0432\u043E\u043B\u0430",
          many: "\u0441\u0438\u043C\u0432\u043E\u043B\u043E\u0432"
        },
        verb: "\u0438\u043C\u0435\u0442\u044C"
      },
      file: {
        unit: {
          one: "\u0431\u0430\u0439\u0442",
          few: "\u0431\u0430\u0439\u0442\u0430",
          many: "\u0431\u0430\u0439\u0442"
        },
        verb: "\u0438\u043C\u0435\u0442\u044C"
      },
      array: {
        unit: {
          one: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442",
          few: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u0430",
          many: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432"
        },
        verb: "\u0438\u043C\u0435\u0442\u044C"
      },
      set: {
        unit: {
          one: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442",
          few: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u0430",
          many: "\u044D\u043B\u0435\u043C\u0435\u043D\u0442\u043E\u0432"
        },
        verb: "\u0438\u043C\u0435\u0442\u044C"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u0447\u0438\u0441\u043B\u043E";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u043C\u0430\u0441\u0441\u0438\u0432";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0432\u0432\u043E\u0434",
      email: "email \u0430\u0434\u0440\u0435\u0441",
      url: "URL",
      emoji: "\u044D\u043C\u043E\u0434\u0437\u0438",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO \u0434\u0430\u0442\u0430 \u0438 \u0432\u0440\u0435\u043C\u044F",
      date: "ISO \u0434\u0430\u0442\u0430",
      time: "ISO \u0432\u0440\u0435\u043C\u044F",
      duration: "ISO \u0434\u043B\u0438\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u044C",
      ipv4: "IPv4 \u0430\u0434\u0440\u0435\u0441",
      ipv6: "IPv6 \u0430\u0434\u0440\u0435\u0441",
      cidrv4: "IPv4 \u0434\u0438\u0430\u043F\u0430\u0437\u043E\u043D",
      cidrv6: "IPv6 \u0434\u0438\u0430\u043F\u0430\u0437\u043E\u043D",
      base64: "\u0441\u0442\u0440\u043E\u043A\u0430 \u0432 \u0444\u043E\u0440\u043C\u0430\u0442\u0435 base64",
      base64url: "\u0441\u0442\u0440\u043E\u043A\u0430 \u0432 \u0444\u043E\u0440\u043C\u0430\u0442\u0435 base64url",
      json_string: "JSON \u0441\u0442\u0440\u043E\u043A\u0430",
      e164: "\u043D\u043E\u043C\u0435\u0440 E.164",
      jwt: "JWT",
      template_literal: "\u0432\u0432\u043E\u0434"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u041D\u0435\u0432\u0435\u0440\u043D\u044B\u0439 \u0432\u0432\u043E\u0434: \u043E\u0436\u0438\u0434\u0430\u043B\u043E\u0441\u044C ${o.expected}, \u043F\u043E\u043B\u0443\u0447\u0435\u043D\u043E ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u041D\u0435\u0432\u0435\u0440\u043D\u044B\u0439 \u0432\u0432\u043E\u0434: \u043E\u0436\u0438\u0434\u0430\u043B\u043E\u0441\u044C ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u041D\u0435\u0432\u0435\u0440\u043D\u044B\u0439 \u0432\u0430\u0440\u0438\u0430\u043D\u0442: \u043E\u0436\u0438\u0434\u0430\u043B\u043E\u0441\u044C \u043E\u0434\u043D\u043E \u0438\u0437 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              let a = Number(o.maximum);
              let l = Nfs(a, i.unit.one, i.unit.few, i.unit.many);
              return `\u0421\u043B\u0438\u0448\u043A\u043E\u043C \u0431\u043E\u043B\u044C\u0448\u043E\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435: \u043E\u0436\u0438\u0434\u0430\u043B\u043E\u0441\u044C, \u0447\u0442\u043E ${o.origin ?? "\u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435"} \u0431\u0443\u0434\u0435\u0442 \u0438\u043C\u0435\u0442\u044C ${s}${o.maximum.toString()} ${l}`;
            }
            return `\u0421\u043B\u0438\u0448\u043A\u043E\u043C \u0431\u043E\u043B\u044C\u0448\u043E\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435: \u043E\u0436\u0438\u0434\u0430\u043B\u043E\u0441\u044C, \u0447\u0442\u043E ${o.origin ?? "\u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435"} \u0431\u0443\u0434\u0435\u0442 ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              let a = Number(o.minimum);
              let l = Nfs(a, i.unit.one, i.unit.few, i.unit.many);
              return `\u0421\u043B\u0438\u0448\u043A\u043E\u043C \u043C\u0430\u043B\u0435\u043D\u044C\u043A\u043E\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435: \u043E\u0436\u0438\u0434\u0430\u043B\u043E\u0441\u044C, \u0447\u0442\u043E ${o.origin} \u0431\u0443\u0434\u0435\u0442 \u0438\u043C\u0435\u0442\u044C ${s}${o.minimum.toString()} ${l}`;
            }
            return `\u0421\u043B\u0438\u0448\u043A\u043E\u043C \u043C\u0430\u043B\u0435\u043D\u044C\u043A\u043E\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435: \u043E\u0436\u0438\u0434\u0430\u043B\u043E\u0441\u044C, \u0447\u0442\u043E ${o.origin} \u0431\u0443\u0434\u0435\u0442 ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u041D\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u0441\u0442\u0440\u043E\u043A\u0430: \u0434\u043E\u043B\u0436\u043D\u0430 \u043D\u0430\u0447\u0438\u043D\u0430\u0442\u044C\u0441\u044F \u0441 "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u041D\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u0441\u0442\u0440\u043E\u043A\u0430: \u0434\u043E\u043B\u0436\u043D\u0430 \u0437\u0430\u043A\u0430\u043D\u0447\u0438\u0432\u0430\u0442\u044C\u0441\u044F \u043D\u0430 "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u041D\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u0441\u0442\u0440\u043E\u043A\u0430: \u0434\u043E\u043B\u0436\u043D\u0430 \u0441\u043E\u0434\u0435\u0440\u0436\u0430\u0442\u044C "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u041D\u0435\u0432\u0435\u0440\u043D\u0430\u044F \u0441\u0442\u0440\u043E\u043A\u0430: \u0434\u043E\u043B\u0436\u043D\u0430 \u0441\u043E\u043E\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u043E\u0432\u0430\u0442\u044C \u0448\u0430\u0431\u043B\u043E\u043D\u0443 ${s.pattern}`;
            }
            return `\u041D\u0435\u0432\u0435\u0440\u043D\u044B\u0439 ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u041D\u0435\u0432\u0435\u0440\u043D\u043E\u0435 \u0447\u0438\u0441\u043B\u043E: \u0434\u043E\u043B\u0436\u043D\u043E \u0431\u044B\u0442\u044C \u043A\u0440\u0430\u0442\u043D\u044B\u043C ${o.divisor}`;
        case "unrecognized_keys":
          return `\u041D\u0435\u0440\u0430\u0441\u043F\u043E\u0437\u043D\u0430\u043D\u043D${o.keys.length > 1 ? "\u044B\u0435" : "\u044B\u0439"} \u043A\u043B\u044E\u0447${o.keys.length > 1 ? "\u0438" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u041D\u0435\u0432\u0435\u0440\u043D\u044B\u0439 \u043A\u043B\u044E\u0447 \u0432 ${o.origin}`;
        case "invalid_union":
          return "\u041D\u0435\u0432\u0435\u0440\u043D\u044B\u0435 \u0432\u0445\u043E\u0434\u043D\u044B\u0435 \u0434\u0430\u043D\u043D\u044B\u0435";
        case "invalid_element":
          return `\u041D\u0435\u0432\u0435\u0440\u043D\u043E\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u0438\u0435 \u0432 ${o.origin}`;
        default:
          return "\u041D\u0435\u0432\u0435\u0440\u043D\u044B\u0435 \u0432\u0445\u043E\u0434\u043D\u044B\u0435 \u0434\u0430\u043D\u043D\u044B\u0435";
      }
    };
  };
  var Lfs = __lazy(() => {
    gp();
  });
  function sl() {
    return {
      localeError: Glu()
    };
  }
  var Glu = () => {
    let e = {
      string: {
        unit: "znakov",
        verb: "imeti"
      },
      file: {
        unit: "bajtov",
        verb: "imeti"
      },
      array: {
        unit: "elementov",
        verb: "imeti"
      },
      set: {
        unit: "elementov",
        verb: "imeti"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u0161tevilo";
        case "object":
          {
            if (Array.isArray(o)) {
              return "tabela";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "vnos",
      email: "e-po\u0161tni naslov",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO datum in \u010Das",
      date: "ISO datum",
      time: "ISO \u010Das",
      duration: "ISO trajanje",
      ipv4: "IPv4 naslov",
      ipv6: "IPv6 naslov",
      cidrv4: "obseg IPv4",
      cidrv6: "obseg IPv6",
      base64: "base64 kodiran niz",
      base64url: "base64url kodiran niz",
      json_string: "JSON niz",
      e164: "E.164 \u0161tevilka",
      jwt: "JWT",
      template_literal: "vnos"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Neveljaven vnos: pri\u010Dakovano ${o.expected}, prejeto ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Neveljaven vnos: pri\u010Dakovano ${stringifyPrimitive(o.values[0])}`;
          }
          return `Neveljavna mo\u017Enost: pri\u010Dakovano eno izmed ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Preveliko: pri\u010Dakovano, da bo ${o.origin ?? "vrednost"} imelo ${s}${o.maximum.toString()} ${i.unit ?? "elementov"}`;
            }
            return `Preveliko: pri\u010Dakovano, da bo ${o.origin ?? "vrednost"} ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Premajhno: pri\u010Dakovano, da bo ${o.origin} imelo ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Premajhno: pri\u010Dakovano, da bo ${o.origin} ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Neveljaven niz: mora se za\u010Deti z "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Neveljaven niz: mora se kon\u010Dati z "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Neveljaven niz: mora vsebovati "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Neveljaven niz: mora ustrezati vzorcu ${s.pattern}`;
            }
            return `Neveljaven ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Neveljavno \u0161tevilo: mora biti ve\u010Dkratnik ${o.divisor}`;
        case "unrecognized_keys":
          return `Neprepoznan${o.keys.length > 1 ? "i klju\u010Di" : " klju\u010D"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Neveljaven klju\u010D v ${o.origin}`;
        case "invalid_union":
          return "Neveljaven vnos";
        case "invalid_element":
          return `Neveljavna vrednost v ${o.origin}`;
        default:
          return "Neveljaven vnos";
      }
    };
  };
  var Ffs = __lazy(() => {
    gp();
  });
  function sv() {
    return {
      localeError: Vlu()
    };
  }
  var Vlu = () => {
    let e = {
      string: {
        unit: "tecken",
        verb: "att ha"
      },
      file: {
        unit: "bytes",
        verb: "att ha"
      },
      array: {
        unit: "objekt",
        verb: "att inneh\xE5lla"
      },
      set: {
        unit: "objekt",
        verb: "att inneh\xE5lla"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "antal";
        case "object":
          {
            if (Array.isArray(o)) {
              return "lista";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "regulj\xE4rt uttryck",
      email: "e-postadress",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO-datum och tid",
      date: "ISO-datum",
      time: "ISO-tid",
      duration: "ISO-varaktighet",
      ipv4: "IPv4-intervall",
      ipv6: "IPv6-intervall",
      cidrv4: "IPv4-spektrum",
      cidrv6: "IPv6-spektrum",
      base64: "base64-kodad str\xE4ng",
      base64url: "base64url-kodad str\xE4ng",
      json_string: "JSON-str\xE4ng",
      e164: "E.164-nummer",
      jwt: "JWT",
      template_literal: "mall-literal"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `Ogiltig inmatning: f\xF6rv\xE4ntat ${o.expected}, fick ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `Ogiltig inmatning: f\xF6rv\xE4ntat ${stringifyPrimitive(o.values[0])}`;
          }
          return `Ogiltigt val: f\xF6rv\xE4ntade en av ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `F\xF6r stor(t): f\xF6rv\xE4ntade ${o.origin ?? "v\xE4rdet"} att ha ${s}${o.maximum.toString()} ${i.unit ?? "element"}`;
            }
            return `F\xF6r stor(t): f\xF6rv\xE4ntat ${o.origin ?? "v\xE4rdet"} att ha ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `F\xF6r lite(t): f\xF6rv\xE4ntade ${o.origin ?? "v\xE4rdet"} att ha ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `F\xF6r lite(t): f\xF6rv\xE4ntade ${o.origin ?? "v\xE4rdet"} att ha ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Ogiltig str\xE4ng: m\xE5ste b\xF6rja med "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Ogiltig str\xE4ng: m\xE5ste sluta med "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Ogiltig str\xE4ng: m\xE5ste inneh\xE5lla "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Ogiltig str\xE4ng: m\xE5ste matcha m\xF6nstret "${s.pattern}"`;
            }
            return `Ogiltig(t) ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `Ogiltigt tal: m\xE5ste vara en multipel av ${o.divisor}`;
        case "unrecognized_keys":
          return `${o.keys.length > 1 ? "Ok\xE4nda nycklar" : "Ok\xE4nd nyckel"}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Ogiltig nyckel i ${o.origin ?? "v\xE4rdet"}`;
        case "invalid_union":
          return "Ogiltig input";
        case "invalid_element":
          return `Ogiltigt v\xE4rde i ${o.origin ?? "v\xE4rdet"}`;
        default:
          return "Ogiltig input";
      }
    };
  };
  var Ufs = __lazy(() => {
    gp();
  });
  function ta() {
    return {
      localeError: zlu()
    };
  }
  var zlu = () => {
    let e = {
      string: {
        unit: "\u0B8E\u0BB4\u0BC1\u0BA4\u0BCD\u0BA4\u0BC1\u0B95\u0BCD\u0B95\u0BB3\u0BCD",
        verb: "\u0B95\u0BCA\u0BA3\u0BCD\u0B9F\u0BBF\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD"
      },
      file: {
        unit: "\u0BAA\u0BC8\u0B9F\u0BCD\u0B9F\u0BC1\u0B95\u0BB3\u0BCD",
        verb: "\u0B95\u0BCA\u0BA3\u0BCD\u0B9F\u0BBF\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD"
      },
      array: {
        unit: "\u0B89\u0BB1\u0BC1\u0BAA\u0BCD\u0BAA\u0BC1\u0B95\u0BB3\u0BCD",
        verb: "\u0B95\u0BCA\u0BA3\u0BCD\u0B9F\u0BBF\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD"
      },
      set: {
        unit: "\u0B89\u0BB1\u0BC1\u0BAA\u0BCD\u0BAA\u0BC1\u0B95\u0BB3\u0BCD",
        verb: "\u0B95\u0BCA\u0BA3\u0BCD\u0B9F\u0BBF\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "\u0B8E\u0BA3\u0BCD \u0B85\u0BB2\u0BCD\u0BB2\u0BBE\u0BA4\u0BA4\u0BC1" : "\u0B8E\u0BA3\u0BCD";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u0B85\u0BA3\u0BBF";
            }
            if (o === null) {
              return "\u0BB5\u0BC6\u0BB1\u0BC1\u0BAE\u0BC8";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0B89\u0BB3\u0BCD\u0BB3\u0BC0\u0B9F\u0BC1",
      email: "\u0BAE\u0BBF\u0BA9\u0BCD\u0BA9\u0B9E\u0BCD\u0B9A\u0BB2\u0BCD \u0BAE\u0BC1\u0B95\u0BB5\u0BB0\u0BBF",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO \u0BA4\u0BC7\u0BA4\u0BBF \u0BA8\u0BC7\u0BB0\u0BAE\u0BCD",
      date: "ISO \u0BA4\u0BC7\u0BA4\u0BBF",
      time: "ISO \u0BA8\u0BC7\u0BB0\u0BAE\u0BCD",
      duration: "ISO \u0B95\u0BBE\u0BB2 \u0B85\u0BB3\u0BB5\u0BC1",
      ipv4: "IPv4 \u0BAE\u0BC1\u0B95\u0BB5\u0BB0\u0BBF",
      ipv6: "IPv6 \u0BAE\u0BC1\u0B95\u0BB5\u0BB0\u0BBF",
      cidrv4: "IPv4 \u0BB5\u0BB0\u0BAE\u0BCD\u0BAA\u0BC1",
      cidrv6: "IPv6 \u0BB5\u0BB0\u0BAE\u0BCD\u0BAA\u0BC1",
      base64: "base64-encoded \u0B9A\u0BB0\u0BAE\u0BCD",
      base64url: "base64url-encoded \u0B9A\u0BB0\u0BAE\u0BCD",
      json_string: "JSON \u0B9A\u0BB0\u0BAE\u0BCD",
      e164: "E.164 \u0B8E\u0BA3\u0BCD",
      jwt: "JWT",
      template_literal: "input"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B89\u0BB3\u0BCD\u0BB3\u0BC0\u0B9F\u0BC1: \u0B8E\u0BA4\u0BBF\u0BB0\u0BCD\u0BAA\u0BBE\u0BB0\u0BCD\u0B95\u0BCD\u0B95\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${o.expected}, \u0BAA\u0BC6\u0BB1\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B89\u0BB3\u0BCD\u0BB3\u0BC0\u0B9F\u0BC1: \u0B8E\u0BA4\u0BBF\u0BB0\u0BCD\u0BAA\u0BBE\u0BB0\u0BCD\u0B95\u0BCD\u0B95\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0BB5\u0BBF\u0BB0\u0BC1\u0BAA\u0BCD\u0BAA\u0BAE\u0BCD: \u0B8E\u0BA4\u0BBF\u0BB0\u0BCD\u0BAA\u0BBE\u0BB0\u0BCD\u0B95\u0BCD\u0B95\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${joinValues(o.values, "|")} \u0B87\u0BB2\u0BCD \u0B92\u0BA9\u0BCD\u0BB1\u0BC1`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u0BAE\u0BBF\u0B95 \u0BAA\u0BC6\u0BB0\u0BBF\u0BAF\u0BA4\u0BC1: \u0B8E\u0BA4\u0BBF\u0BB0\u0BCD\u0BAA\u0BBE\u0BB0\u0BCD\u0B95\u0BCD\u0B95\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${o.origin ?? "\u0BAE\u0BA4\u0BBF\u0BAA\u0BCD\u0BAA\u0BC1"} ${s}${o.maximum.toString()} ${i.unit ?? "\u0B89\u0BB1\u0BC1\u0BAA\u0BCD\u0BAA\u0BC1\u0B95\u0BB3\u0BCD"} \u0B86\u0B95 \u0B87\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
            }
            return `\u0BAE\u0BBF\u0B95 \u0BAA\u0BC6\u0BB0\u0BBF\u0BAF\u0BA4\u0BC1: \u0B8E\u0BA4\u0BBF\u0BB0\u0BCD\u0BAA\u0BBE\u0BB0\u0BCD\u0B95\u0BCD\u0B95\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${o.origin ?? "\u0BAE\u0BA4\u0BBF\u0BAA\u0BCD\u0BAA\u0BC1"} ${s}${o.maximum.toString()} \u0B86\u0B95 \u0B87\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u0BAE\u0BBF\u0B95\u0B9A\u0BCD \u0B9A\u0BBF\u0BB1\u0BBF\u0BAF\u0BA4\u0BC1: \u0B8E\u0BA4\u0BBF\u0BB0\u0BCD\u0BAA\u0BBE\u0BB0\u0BCD\u0B95\u0BCD\u0B95\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${o.origin} ${s}${o.minimum.toString()} ${i.unit} \u0B86\u0B95 \u0B87\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
            }
            return `\u0BAE\u0BBF\u0B95\u0B9A\u0BCD \u0B9A\u0BBF\u0BB1\u0BBF\u0BAF\u0BA4\u0BC1: \u0B8E\u0BA4\u0BBF\u0BB0\u0BCD\u0BAA\u0BBE\u0BB0\u0BCD\u0B95\u0BCD\u0B95\u0BAA\u0BCD\u0BAA\u0B9F\u0BCD\u0B9F\u0BA4\u0BC1 ${o.origin} ${s}${o.minimum.toString()} \u0B86\u0B95 \u0B87\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B9A\u0BB0\u0BAE\u0BCD: "${s.prefix}" \u0B87\u0BB2\u0BCD \u0BA4\u0BCA\u0B9F\u0B99\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
            }
            if (s.format === "ends_with") {
              return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B9A\u0BB0\u0BAE\u0BCD: "${s.suffix}" \u0B87\u0BB2\u0BCD \u0BAE\u0BC1\u0B9F\u0BBF\u0BB5\u0B9F\u0BC8\u0BAF \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
            }
            if (s.format === "includes") {
              return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B9A\u0BB0\u0BAE\u0BCD: "${s.includes}" \u0B90 \u0B89\u0BB3\u0BCD\u0BB3\u0B9F\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
            }
            if (s.format === "regex") {
              return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B9A\u0BB0\u0BAE\u0BCD: ${s.pattern} \u0BAE\u0BC1\u0BB1\u0BC8\u0BAA\u0BBE\u0B9F\u0BCD\u0B9F\u0BC1\u0B9F\u0BA9\u0BCD \u0BAA\u0BCA\u0BB0\u0BC1\u0BA8\u0BCD\u0BA4 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
            }
            return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B8E\u0BA3\u0BCD: ${o.divisor} \u0B87\u0BA9\u0BCD \u0BAA\u0BB2\u0BAE\u0BBE\u0B95 \u0B87\u0BB0\u0BC1\u0B95\u0BCD\u0B95 \u0BB5\u0BC7\u0BA3\u0BCD\u0B9F\u0BC1\u0BAE\u0BCD`;
        case "unrecognized_keys":
          return `\u0B85\u0B9F\u0BC8\u0BAF\u0BBE\u0BB3\u0BAE\u0BCD \u0BA4\u0BC6\u0BB0\u0BBF\u0BAF\u0BBE\u0BA4 \u0BB5\u0BBF\u0B9A\u0BC8${o.keys.length > 1 ? "\u0B95\u0BB3\u0BCD" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `${o.origin} \u0B87\u0BB2\u0BCD \u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0BB5\u0BBF\u0B9A\u0BC8`;
        case "invalid_union":
          return "\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B89\u0BB3\u0BCD\u0BB3\u0BC0\u0B9F\u0BC1";
        case "invalid_element":
          return `${o.origin} \u0B87\u0BB2\u0BCD \u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0BAE\u0BA4\u0BBF\u0BAA\u0BCD\u0BAA\u0BC1`;
        default:
          return "\u0BA4\u0BB5\u0BB1\u0BBE\u0BA9 \u0B89\u0BB3\u0BCD\u0BB3\u0BC0\u0B9F\u0BC1";
      }
    };
  };
  var Bfs = __lazy(() => {
    gp();
  });
  function th_export() {
    return {
      localeError: Klu()
    };
  }
  var Klu = () => {
    let e = {
      string: {
        unit: "\u0E15\u0E31\u0E27\u0E2D\u0E31\u0E01\u0E29\u0E23",
        verb: "\u0E04\u0E27\u0E23\u0E21\u0E35"
      },
      file: {
        unit: "\u0E44\u0E1A\u0E15\u0E4C",
        verb: "\u0E04\u0E27\u0E23\u0E21\u0E35"
      },
      array: {
        unit: "\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23",
        verb: "\u0E04\u0E27\u0E23\u0E21\u0E35"
      },
      set: {
        unit: "\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23",
        verb: "\u0E04\u0E27\u0E23\u0E21\u0E35"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "\u0E44\u0E21\u0E48\u0E43\u0E0A\u0E48\u0E15\u0E31\u0E27\u0E40\u0E25\u0E02 (NaN)" : "\u0E15\u0E31\u0E27\u0E40\u0E25\u0E02";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u0E2D\u0E32\u0E23\u0E4C\u0E40\u0E23\u0E22\u0E4C (Array)";
            }
            if (o === null) {
              return "\u0E44\u0E21\u0E48\u0E21\u0E35\u0E04\u0E48\u0E32 (null)";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E17\u0E35\u0E48\u0E1B\u0E49\u0E2D\u0E19",
      email: "\u0E17\u0E35\u0E48\u0E2D\u0E22\u0E39\u0E48\u0E2D\u0E35\u0E40\u0E21\u0E25",
      url: "URL",
      emoji: "\u0E2D\u0E34\u0E42\u0E21\u0E08\u0E34",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "\u0E27\u0E31\u0E19\u0E17\u0E35\u0E48\u0E40\u0E27\u0E25\u0E32\u0E41\u0E1A\u0E1A ISO",
      date: "\u0E27\u0E31\u0E19\u0E17\u0E35\u0E48\u0E41\u0E1A\u0E1A ISO",
      time: "\u0E40\u0E27\u0E25\u0E32\u0E41\u0E1A\u0E1A ISO",
      duration: "\u0E0A\u0E48\u0E27\u0E07\u0E40\u0E27\u0E25\u0E32\u0E41\u0E1A\u0E1A ISO",
      ipv4: "\u0E17\u0E35\u0E48\u0E2D\u0E22\u0E39\u0E48 IPv4",
      ipv6: "\u0E17\u0E35\u0E48\u0E2D\u0E22\u0E39\u0E48 IPv6",
      cidrv4: "\u0E0A\u0E48\u0E27\u0E07 IP \u0E41\u0E1A\u0E1A IPv4",
      cidrv6: "\u0E0A\u0E48\u0E27\u0E07 IP \u0E41\u0E1A\u0E1A IPv6",
      base64: "\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E41\u0E1A\u0E1A Base64",
      base64url: "\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E41\u0E1A\u0E1A Base64 \u0E2A\u0E33\u0E2B\u0E23\u0E31\u0E1A URL",
      json_string: "\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E41\u0E1A\u0E1A JSON",
      e164: "\u0E40\u0E1A\u0E2D\u0E23\u0E4C\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C\u0E23\u0E30\u0E2B\u0E27\u0E48\u0E32\u0E07\u0E1B\u0E23\u0E30\u0E40\u0E17\u0E28 (E.164)",
      jwt: "\u0E42\u0E17\u0E40\u0E04\u0E19 JWT",
      template_literal: "\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E17\u0E35\u0E48\u0E1B\u0E49\u0E2D\u0E19"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u0E1B\u0E23\u0E30\u0E40\u0E20\u0E17\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E04\u0E27\u0E23\u0E40\u0E1B\u0E47\u0E19 ${o.expected} \u0E41\u0E15\u0E48\u0E44\u0E14\u0E49\u0E23\u0E31\u0E1A ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u0E04\u0E48\u0E32\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E04\u0E27\u0E23\u0E40\u0E1B\u0E47\u0E19 ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u0E15\u0E31\u0E27\u0E40\u0E25\u0E37\u0E2D\u0E01\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E04\u0E27\u0E23\u0E40\u0E1B\u0E47\u0E19\u0E2B\u0E19\u0E36\u0E48\u0E07\u0E43\u0E19 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "\u0E44\u0E21\u0E48\u0E40\u0E01\u0E34\u0E19" : "\u0E19\u0E49\u0E2D\u0E22\u0E01\u0E27\u0E48\u0E32";
            let i = t(o.origin);
            if (i) {
              return `\u0E40\u0E01\u0E34\u0E19\u0E01\u0E33\u0E2B\u0E19\u0E14: ${o.origin ?? "\u0E04\u0E48\u0E32"} \u0E04\u0E27\u0E23\u0E21\u0E35${s} ${o.maximum.toString()} ${i.unit ?? "\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23"}`;
            }
            return `\u0E40\u0E01\u0E34\u0E19\u0E01\u0E33\u0E2B\u0E19\u0E14: ${o.origin ?? "\u0E04\u0E48\u0E32"} \u0E04\u0E27\u0E23\u0E21\u0E35${s} ${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? "\u0E2D\u0E22\u0E48\u0E32\u0E07\u0E19\u0E49\u0E2D\u0E22" : "\u0E21\u0E32\u0E01\u0E01\u0E27\u0E48\u0E32";
            let i = t(o.origin);
            if (i) {
              return `\u0E19\u0E49\u0E2D\u0E22\u0E01\u0E27\u0E48\u0E32\u0E01\u0E33\u0E2B\u0E19\u0E14: ${o.origin} \u0E04\u0E27\u0E23\u0E21\u0E35${s} ${o.minimum.toString()} ${i.unit}`;
            }
            return `\u0E19\u0E49\u0E2D\u0E22\u0E01\u0E27\u0E48\u0E32\u0E01\u0E33\u0E2B\u0E19\u0E14: ${o.origin} \u0E04\u0E27\u0E23\u0E21\u0E35${s} ${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E02\u0E36\u0E49\u0E19\u0E15\u0E49\u0E19\u0E14\u0E49\u0E27\u0E22 "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E25\u0E07\u0E17\u0E49\u0E32\u0E22\u0E14\u0E49\u0E27\u0E22 "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E21\u0E35 "${s.includes}" \u0E2D\u0E22\u0E39\u0E48\u0E43\u0E19\u0E02\u0E49\u0E2D\u0E04\u0E27\u0E32\u0E21`;
            }
            if (s.format === "regex") {
              return `\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E15\u0E49\u0E2D\u0E07\u0E15\u0E23\u0E07\u0E01\u0E31\u0E1A\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E17\u0E35\u0E48\u0E01\u0E33\u0E2B\u0E19\u0E14 ${s.pattern}`;
            }
            return `\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u0E15\u0E31\u0E27\u0E40\u0E25\u0E02\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E15\u0E49\u0E2D\u0E07\u0E40\u0E1B\u0E47\u0E19\u0E08\u0E33\u0E19\u0E27\u0E19\u0E17\u0E35\u0E48\u0E2B\u0E32\u0E23\u0E14\u0E49\u0E27\u0E22 ${o.divisor} \u0E44\u0E14\u0E49\u0E25\u0E07\u0E15\u0E31\u0E27`;
        case "unrecognized_keys":
          return `\u0E1E\u0E1A\u0E04\u0E35\u0E22\u0E4C\u0E17\u0E35\u0E48\u0E44\u0E21\u0E48\u0E23\u0E39\u0E49\u0E08\u0E31\u0E01: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u0E04\u0E35\u0E22\u0E4C\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07\u0E43\u0E19 ${o.origin}`;
        case "invalid_union":
          return "\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07: \u0E44\u0E21\u0E48\u0E15\u0E23\u0E07\u0E01\u0E31\u0E1A\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E22\u0E39\u0E40\u0E19\u0E35\u0E22\u0E19\u0E17\u0E35\u0E48\u0E01\u0E33\u0E2B\u0E19\u0E14\u0E44\u0E27\u0E49";
        case "invalid_element":
          return `\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07\u0E43\u0E19 ${o.origin}`;
        default:
          return "\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07";
      }
    };
  };
  var $fs = __lazy(() => {
    gp();
  });
  function tr() {
    return {
      localeError: Jlu()
    };
  }
  var Ylu = e => {
    let t = typeof e;
    switch (t) {
      case "number":
        return Number.isNaN(e) ? "NaN" : "number";
      case "object":
        {
          if (Array.isArray(e)) {
            return "array";
          }
          if (e === null) {
            return "null";
          }
          if (Object.getPrototypeOf(e) !== Object.prototype && e.constructor) {
            return e.constructor.name;
          }
        }
    }
    return t;
  };
  var Jlu = () => {
    let e = {
      string: {
        unit: "karakter",
        verb: "olmal\u0131"
      },
      file: {
        unit: "bayt",
        verb: "olmal\u0131"
      },
      array: {
        unit: "\xF6\u011Fe",
        verb: "olmal\u0131"
      },
      set: {
        unit: "\xF6\u011Fe",
        verb: "olmal\u0131"
      }
    };
    function t(r) {
      return e[r] ?? null;
    }
    let n = {
      regex: "girdi",
      email: "e-posta adresi",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO tarih ve saat",
      date: "ISO tarih",
      time: "ISO saat",
      duration: "ISO s\xFCre",
      ipv4: "IPv4 adresi",
      ipv6: "IPv6 adresi",
      cidrv4: "IPv4 aral\u0131\u011F\u0131",
      cidrv6: "IPv6 aral\u0131\u011F\u0131",
      base64: "base64 ile \u015Fifrelenmi\u015F metin",
      base64url: "base64url ile \u015Fifrelenmi\u015F metin",
      json_string: "JSON dizesi",
      e164: "E.164 say\u0131s\u0131",
      jwt: "JWT",
      template_literal: "\u015Eablon dizesi"
    };
    return r => {
      switch (r.code) {
        case "invalid_type":
          return `Ge\xE7ersiz de\u011Fer: beklenen ${r.expected}, al\u0131nan ${Ylu(r.input)}`;
        case "invalid_value":
          if (r.values.length === 1) {
            return `Ge\xE7ersiz de\u011Fer: beklenen ${stringifyPrimitive(r.values[0])}`;
          }
          return `Ge\xE7ersiz se\xE7enek: a\u015Fa\u011F\u0131dakilerden biri olmal\u0131: ${joinValues(r.values, "|")}`;
        case "too_big":
          {
            let o = r.inclusive ? "<=" : "<";
            let s = t(r.origin);
            if (s) {
              return `\xC7ok b\xFCy\xFCk: beklenen ${r.origin ?? "de\u011Fer"} ${o}${r.maximum.toString()} ${s.unit ?? "\xF6\u011Fe"}`;
            }
            return `\xC7ok b\xFCy\xFCk: beklenen ${r.origin ?? "de\u011Fer"} ${o}${r.maximum.toString()}`;
          }
        case "too_small":
          {
            let o = r.inclusive ? ">=" : ">";
            let s = t(r.origin);
            if (s) {
              return `\xC7ok k\xFC\xE7\xFCk: beklenen ${r.origin} ${o}${r.minimum.toString()} ${s.unit}`;
            }
            return `\xC7ok k\xFC\xE7\xFCk: beklenen ${r.origin} ${o}${r.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let o = r;
            if (o.format === "starts_with") {
              return `Ge\xE7ersiz metin: "${o.prefix}" ile ba\u015Flamal\u0131`;
            }
            if (o.format === "ends_with") {
              return `Ge\xE7ersiz metin: "${o.suffix}" ile bitmeli`;
            }
            if (o.format === "includes") {
              return `Ge\xE7ersiz metin: "${o.includes}" i\xE7ermeli`;
            }
            if (o.format === "regex") {
              return `Ge\xE7ersiz metin: ${o.pattern} desenine uymal\u0131`;
            }
            return `Ge\xE7ersiz ${n[o.format] ?? r.format}`;
          }
        case "not_multiple_of":
          return `Ge\xE7ersiz say\u0131: ${r.divisor} ile tam b\xF6l\xFCnebilmeli`;
        case "unrecognized_keys":
          return `Tan\u0131nmayan anahtar${r.keys.length > 1 ? "lar" : ""}: ${joinValues(r.keys, ", ")}`;
        case "invalid_key":
          return `${r.origin} i\xE7inde ge\xE7ersiz anahtar`;
        case "invalid_union":
          return "Ge\xE7ersiz de\u011Fer";
        case "invalid_element":
          return `${r.origin} i\xE7inde ge\xE7ersiz de\u011Fer`;
        default:
          return "Ge\xE7ersiz de\u011Fer";
      }
    };
  };
  var Hfs = __lazy(() => {
    gp();
  });
  function ua_export() {
    return {
      localeError: Xlu()
    };
  }
  var Xlu = () => {
    let e = {
      string: {
        unit: "\u0441\u0438\u043C\u0432\u043E\u043B\u0456\u0432",
        verb: "\u043C\u0430\u0442\u0438\u043C\u0435"
      },
      file: {
        unit: "\u0431\u0430\u0439\u0442\u0456\u0432",
        verb: "\u043C\u0430\u0442\u0438\u043C\u0435"
      },
      array: {
        unit: "\u0435\u043B\u0435\u043C\u0435\u043D\u0442\u0456\u0432",
        verb: "\u043C\u0430\u0442\u0438\u043C\u0435"
      },
      set: {
        unit: "\u0435\u043B\u0435\u043C\u0435\u043D\u0442\u0456\u0432",
        verb: "\u043C\u0430\u0442\u0438\u043C\u0435"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u0447\u0438\u0441\u043B\u043E";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u043C\u0430\u0441\u0438\u0432";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0432\u0445\u0456\u0434\u043D\u0456 \u0434\u0430\u043D\u0456",
      email: "\u0430\u0434\u0440\u0435\u0441\u0430 \u0435\u043B\u0435\u043A\u0442\u0440\u043E\u043D\u043D\u043E\u0457 \u043F\u043E\u0448\u0442\u0438",
      url: "URL",
      emoji: "\u0435\u043C\u043E\u0434\u0437\u0456",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "\u0434\u0430\u0442\u0430 \u0442\u0430 \u0447\u0430\u0441 ISO",
      date: "\u0434\u0430\u0442\u0430 ISO",
      time: "\u0447\u0430\u0441 ISO",
      duration: "\u0442\u0440\u0438\u0432\u0430\u043B\u0456\u0441\u0442\u044C ISO",
      ipv4: "\u0430\u0434\u0440\u0435\u0441\u0430 IPv4",
      ipv6: "\u0430\u0434\u0440\u0435\u0441\u0430 IPv6",
      cidrv4: "\u0434\u0456\u0430\u043F\u0430\u0437\u043E\u043D IPv4",
      cidrv6: "\u0434\u0456\u0430\u043F\u0430\u0437\u043E\u043D IPv6",
      base64: "\u0440\u044F\u0434\u043E\u043A \u0443 \u043A\u043E\u0434\u0443\u0432\u0430\u043D\u043D\u0456 base64",
      base64url: "\u0440\u044F\u0434\u043E\u043A \u0443 \u043A\u043E\u0434\u0443\u0432\u0430\u043D\u043D\u0456 base64url",
      json_string: "\u0440\u044F\u0434\u043E\u043A JSON",
      e164: "\u043D\u043E\u043C\u0435\u0440 E.164",
      jwt: "JWT",
      template_literal: "\u0432\u0445\u0456\u0434\u043D\u0456 \u0434\u0430\u043D\u0456"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0456 \u0432\u0445\u0456\u0434\u043D\u0456 \u0434\u0430\u043D\u0456: \u043E\u0447\u0456\u043A\u0443\u0454\u0442\u044C\u0441\u044F ${o.expected}, \u043E\u0442\u0440\u0438\u043C\u0430\u043D\u043E ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0456 \u0432\u0445\u0456\u0434\u043D\u0456 \u0434\u0430\u043D\u0456: \u043E\u0447\u0456\u043A\u0443\u0454\u0442\u044C\u0441\u044F ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0430 \u043E\u043F\u0446\u0456\u044F: \u043E\u0447\u0456\u043A\u0443\u0454\u0442\u044C\u0441\u044F \u043E\u0434\u043D\u0435 \u0437 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u0417\u0430\u043D\u0430\u0434\u0442\u043E \u0432\u0435\u043B\u0438\u043A\u0435: \u043E\u0447\u0456\u043A\u0443\u0454\u0442\u044C\u0441\u044F, \u0449\u043E ${o.origin ?? "\u0437\u043D\u0430\u0447\u0435\u043D\u043D\u044F"} ${i.verb} ${s}${o.maximum.toString()} ${i.unit ?? "\u0435\u043B\u0435\u043C\u0435\u043D\u0442\u0456\u0432"}`;
            }
            return `\u0417\u0430\u043D\u0430\u0434\u0442\u043E \u0432\u0435\u043B\u0438\u043A\u0435: \u043E\u0447\u0456\u043A\u0443\u0454\u0442\u044C\u0441\u044F, \u0449\u043E ${o.origin ?? "\u0437\u043D\u0430\u0447\u0435\u043D\u043D\u044F"} \u0431\u0443\u0434\u0435 ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u0417\u0430\u043D\u0430\u0434\u0442\u043E \u043C\u0430\u043B\u0435: \u043E\u0447\u0456\u043A\u0443\u0454\u0442\u044C\u0441\u044F, \u0449\u043E ${o.origin} ${i.verb} ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `\u0417\u0430\u043D\u0430\u0434\u0442\u043E \u043C\u0430\u043B\u0435: \u043E\u0447\u0456\u043A\u0443\u0454\u0442\u044C\u0441\u044F, \u0449\u043E ${o.origin} \u0431\u0443\u0434\u0435 ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0438\u0439 \u0440\u044F\u0434\u043E\u043A: \u043F\u043E\u0432\u0438\u043D\u0435\u043D \u043F\u043E\u0447\u0438\u043D\u0430\u0442\u0438\u0441\u044F \u0437 "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0438\u0439 \u0440\u044F\u0434\u043E\u043A: \u043F\u043E\u0432\u0438\u043D\u0435\u043D \u0437\u0430\u043A\u0456\u043D\u0447\u0443\u0432\u0430\u0442\u0438\u0441\u044F \u043D\u0430 "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0438\u0439 \u0440\u044F\u0434\u043E\u043A: \u043F\u043E\u0432\u0438\u043D\u0435\u043D \u043C\u0456\u0441\u0442\u0438\u0442\u0438 "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0438\u0439 \u0440\u044F\u0434\u043E\u043A: \u043F\u043E\u0432\u0438\u043D\u0435\u043D \u0432\u0456\u0434\u043F\u043E\u0432\u0456\u0434\u0430\u0442\u0438 \u0448\u0430\u0431\u043B\u043E\u043D\u0443 ${s.pattern}`;
            }
            return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0438\u0439 ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0435 \u0447\u0438\u0441\u043B\u043E: \u043F\u043E\u0432\u0438\u043D\u043D\u043E \u0431\u0443\u0442\u0438 \u043A\u0440\u0430\u0442\u043D\u0438\u043C ${o.divisor}`;
        case "unrecognized_keys":
          return `\u041D\u0435\u0440\u043E\u0437\u043F\u0456\u0437\u043D\u0430\u043D\u0438\u0439 \u043A\u043B\u044E\u0447${o.keys.length > 1 ? "\u0456" : ""}: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0438\u0439 \u043A\u043B\u044E\u0447 \u0443 ${o.origin}`;
        case "invalid_union":
          return "\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0456 \u0432\u0445\u0456\u0434\u043D\u0456 \u0434\u0430\u043D\u0456";
        case "invalid_element":
          return `\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0435 \u0437\u043D\u0430\u0447\u0435\u043D\u043D\u044F \u0443 ${o.origin}`;
        default:
          return "\u041D\u0435\u043F\u0440\u0430\u0432\u0438\u043B\u044C\u043D\u0456 \u0432\u0445\u0456\u0434\u043D\u0456 \u0434\u0430\u043D\u0456";
      }
    };
  };
  var jfs = __lazy(() => {
    gp();
  });
  function ur_export() {
    return {
      localeError: Qlu()
    };
  }
  var Qlu = () => {
    let e = {
      string: {
        unit: "\u062D\u0631\u0648\u0641",
        verb: "\u06C1\u0648\u0646\u0627"
      },
      file: {
        unit: "\u0628\u0627\u0626\u0679\u0633",
        verb: "\u06C1\u0648\u0646\u0627"
      },
      array: {
        unit: "\u0622\u0626\u0679\u0645\u0632",
        verb: "\u06C1\u0648\u0646\u0627"
      },
      set: {
        unit: "\u0622\u0626\u0679\u0645\u0632",
        verb: "\u06C1\u0648\u0646\u0627"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "\u0646\u0645\u0628\u0631";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u0622\u0631\u06D2";
            }
            if (o === null) {
              return "\u0646\u0644";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0627\u0646 \u067E\u0679",
      email: "\u0627\u06CC \u0645\u06CC\u0644 \u0627\u06CC\u0688\u0631\u06CC\u0633",
      url: "\u06CC\u0648 \u0622\u0631 \u0627\u06CC\u0644",
      emoji: "\u0627\u06CC\u0645\u0648\u062C\u06CC",
      uuid: "\u06CC\u0648 \u06CC\u0648 \u0622\u0626\u06CC \u0688\u06CC",
      uuidv4: "\u06CC\u0648 \u06CC\u0648 \u0622\u0626\u06CC \u0688\u06CC \u0648\u06CC 4",
      uuidv6: "\u06CC\u0648 \u06CC\u0648 \u0622\u0626\u06CC \u0688\u06CC \u0648\u06CC 6",
      nanoid: "\u0646\u06CC\u0646\u0648 \u0622\u0626\u06CC \u0688\u06CC",
      guid: "\u062C\u06CC \u06CC\u0648 \u0622\u0626\u06CC \u0688\u06CC",
      cuid: "\u0633\u06CC \u06CC\u0648 \u0622\u0626\u06CC \u0688\u06CC",
      cuid2: "\u0633\u06CC \u06CC\u0648 \u0622\u0626\u06CC \u0688\u06CC 2",
      ulid: "\u06CC\u0648 \u0627\u06CC\u0644 \u0622\u0626\u06CC \u0688\u06CC",
      xid: "\u0627\u06CC\u06A9\u0633 \u0622\u0626\u06CC \u0688\u06CC",
      ksuid: "\u06A9\u06D2 \u0627\u06CC\u0633 \u06CC\u0648 \u0622\u0626\u06CC \u0688\u06CC",
      datetime: "\u0622\u0626\u06CC \u0627\u06CC\u0633 \u0627\u0648 \u0688\u06CC\u0679 \u0679\u0627\u0626\u0645",
      date: "\u0622\u0626\u06CC \u0627\u06CC\u0633 \u0627\u0648 \u062A\u0627\u0631\u06CC\u062E",
      time: "\u0622\u0626\u06CC \u0627\u06CC\u0633 \u0627\u0648 \u0648\u0642\u062A",
      duration: "\u0622\u0626\u06CC \u0627\u06CC\u0633 \u0627\u0648 \u0645\u062F\u062A",
      ipv4: "\u0622\u0626\u06CC \u067E\u06CC \u0648\u06CC 4 \u0627\u06CC\u0688\u0631\u06CC\u0633",
      ipv6: "\u0622\u0626\u06CC \u067E\u06CC \u0648\u06CC 6 \u0627\u06CC\u0688\u0631\u06CC\u0633",
      cidrv4: "\u0622\u0626\u06CC \u067E\u06CC \u0648\u06CC 4 \u0631\u06CC\u0646\u062C",
      cidrv6: "\u0622\u0626\u06CC \u067E\u06CC \u0648\u06CC 6 \u0631\u06CC\u0646\u062C",
      base64: "\u0628\u06CC\u0633 64 \u0627\u0646 \u06A9\u0648\u0688\u0688 \u0633\u0679\u0631\u0646\u06AF",
      base64url: "\u0628\u06CC\u0633 64 \u06CC\u0648 \u0622\u0631 \u0627\u06CC\u0644 \u0627\u0646 \u06A9\u0648\u0688\u0688 \u0633\u0679\u0631\u0646\u06AF",
      json_string: "\u062C\u06D2 \u0627\u06CC\u0633 \u0627\u0648 \u0627\u06CC\u0646 \u0633\u0679\u0631\u0646\u06AF",
      e164: "\u0627\u06CC 164 \u0646\u0645\u0628\u0631",
      jwt: "\u062C\u06D2 \u0688\u0628\u0644\u06CC\u0648 \u0679\u06CC",
      template_literal: "\u0627\u0646 \u067E\u0679"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u063A\u0644\u0637 \u0627\u0646 \u067E\u0679: ${o.expected} \u0645\u062A\u0648\u0642\u0639 \u062A\u06BE\u0627\u060C ${n(o.input)} \u0645\u0648\u0635\u0648\u0644 \u06C1\u0648\u0627`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u063A\u0644\u0637 \u0627\u0646 \u067E\u0679: ${stringifyPrimitive(o.values[0])} \u0645\u062A\u0648\u0642\u0639 \u062A\u06BE\u0627`;
          }
          return `\u063A\u0644\u0637 \u0622\u067E\u0634\u0646: ${joinValues(o.values, "|")} \u0645\u06CC\u06BA \u0633\u06D2 \u0627\u06CC\u06A9 \u0645\u062A\u0648\u0642\u0639 \u062A\u06BE\u0627`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u0628\u06C1\u062A \u0628\u0691\u0627: ${o.origin ?? "\u0648\u06CC\u0644\u06CC\u0648"} \u06A9\u06D2 ${s}${o.maximum.toString()} ${i.unit ?? "\u0639\u0646\u0627\u0635\u0631"} \u06C1\u0648\u0646\u06D2 \u0645\u062A\u0648\u0642\u0639 \u062A\u06BE\u06D2`;
            }
            return `\u0628\u06C1\u062A \u0628\u0691\u0627: ${o.origin ?? "\u0648\u06CC\u0644\u06CC\u0648"} \u06A9\u0627 ${s}${o.maximum.toString()} \u06C1\u0648\u0646\u0627 \u0645\u062A\u0648\u0642\u0639 \u062A\u06BE\u0627`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u0628\u06C1\u062A \u0686\u06BE\u0648\u0679\u0627: ${o.origin} \u06A9\u06D2 ${s}${o.minimum.toString()} ${i.unit} \u06C1\u0648\u0646\u06D2 \u0645\u062A\u0648\u0642\u0639 \u062A\u06BE\u06D2`;
            }
            return `\u0628\u06C1\u062A \u0686\u06BE\u0648\u0679\u0627: ${o.origin} \u06A9\u0627 ${s}${o.minimum.toString()} \u06C1\u0648\u0646\u0627 \u0645\u062A\u0648\u0642\u0639 \u062A\u06BE\u0627`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u063A\u0644\u0637 \u0633\u0679\u0631\u0646\u06AF: "${s.prefix}" \u0633\u06D2 \u0634\u0631\u0648\u0639 \u06C1\u0648\u0646\u0627 \u0686\u0627\u06C1\u06CC\u06D2`;
            }
            if (s.format === "ends_with") {
              return `\u063A\u0644\u0637 \u0633\u0679\u0631\u0646\u06AF: "${s.suffix}" \u067E\u0631 \u062E\u062A\u0645 \u06C1\u0648\u0646\u0627 \u0686\u0627\u06C1\u06CC\u06D2`;
            }
            if (s.format === "includes") {
              return `\u063A\u0644\u0637 \u0633\u0679\u0631\u0646\u06AF: "${s.includes}" \u0634\u0627\u0645\u0644 \u06C1\u0648\u0646\u0627 \u0686\u0627\u06C1\u06CC\u06D2`;
            }
            if (s.format === "regex") {
              return `\u063A\u0644\u0637 \u0633\u0679\u0631\u0646\u06AF: \u067E\u06CC\u0679\u0631\u0646 ${s.pattern} \u0633\u06D2 \u0645\u06CC\u0686 \u06C1\u0648\u0646\u0627 \u0686\u0627\u06C1\u06CC\u06D2`;
            }
            return `\u063A\u0644\u0637 ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u063A\u0644\u0637 \u0646\u0645\u0628\u0631: ${o.divisor} \u06A9\u0627 \u0645\u0636\u0627\u0639\u0641 \u06C1\u0648\u0646\u0627 \u0686\u0627\u06C1\u06CC\u06D2`;
        case "unrecognized_keys":
          return `\u063A\u06CC\u0631 \u062A\u0633\u0644\u06CC\u0645 \u0634\u062F\u06C1 \u06A9\u06CC${o.keys.length > 1 ? "\u0632" : ""}: ${joinValues(o.keys, "\u060C ")}`;
        case "invalid_key":
          return `${o.origin} \u0645\u06CC\u06BA \u063A\u0644\u0637 \u06A9\u06CC`;
        case "invalid_union":
          return "\u063A\u0644\u0637 \u0627\u0646 \u067E\u0679";
        case "invalid_element":
          return `${o.origin} \u0645\u06CC\u06BA \u063A\u0644\u0637 \u0648\u06CC\u0644\u06CC\u0648`;
        default:
          return "\u063A\u0644\u0637 \u0627\u0646 \u067E\u0679";
      }
    };
  };
  var qfs = __lazy(() => {
    gp();
  });
  function vi_export() {
    return {
      localeError: Zlu()
    };
  }
  var Zlu = () => {
    let e = {
      string: {
        unit: "k\xFD t\u1EF1",
        verb: "c\xF3"
      },
      file: {
        unit: "byte",
        verb: "c\xF3"
      },
      array: {
        unit: "ph\u1EA7n t\u1EED",
        verb: "c\xF3"
      },
      set: {
        unit: "ph\u1EA7n t\u1EED",
        verb: "c\xF3"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "s\u1ED1";
        case "object":
          {
            if (Array.isArray(o)) {
              return "m\u1EA3ng";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u0111\u1EA7u v\xE0o",
      email: "\u0111\u1ECBa ch\u1EC9 email",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ng\xE0y gi\u1EDD ISO",
      date: "ng\xE0y ISO",
      time: "gi\u1EDD ISO",
      duration: "kho\u1EA3ng th\u1EDDi gian ISO",
      ipv4: "\u0111\u1ECBa ch\u1EC9 IPv4",
      ipv6: "\u0111\u1ECBa ch\u1EC9 IPv6",
      cidrv4: "d\u1EA3i IPv4",
      cidrv6: "d\u1EA3i IPv6",
      base64: "chu\u1ED7i m\xE3 h\xF3a base64",
      base64url: "chu\u1ED7i m\xE3 h\xF3a base64url",
      json_string: "chu\u1ED7i JSON",
      e164: "s\u1ED1 E.164",
      jwt: "JWT",
      template_literal: "\u0111\u1EA7u v\xE0o"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u0110\u1EA7u v\xE0o kh\xF4ng h\u1EE3p l\u1EC7: mong \u0111\u1EE3i ${o.expected}, nh\u1EADn \u0111\u01B0\u1EE3c ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u0110\u1EA7u v\xE0o kh\xF4ng h\u1EE3p l\u1EC7: mong \u0111\u1EE3i ${stringifyPrimitive(o.values[0])}`;
          }
          return `T\xF9y ch\u1ECDn kh\xF4ng h\u1EE3p l\u1EC7: mong \u0111\u1EE3i m\u1ED9t trong c\xE1c gi\xE1 tr\u1ECB ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `Qu\xE1 l\u1EDBn: mong \u0111\u1EE3i ${o.origin ?? "gi\xE1 tr\u1ECB"} ${i.verb} ${s}${o.maximum.toString()} ${i.unit ?? "ph\u1EA7n t\u1EED"}`;
            }
            return `Qu\xE1 l\u1EDBn: mong \u0111\u1EE3i ${o.origin ?? "gi\xE1 tr\u1ECB"} ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `Qu\xE1 nh\u1ECF: mong \u0111\u1EE3i ${o.origin} ${i.verb} ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `Qu\xE1 nh\u1ECF: mong \u0111\u1EE3i ${o.origin} ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `Chu\u1ED7i kh\xF4ng h\u1EE3p l\u1EC7: ph\u1EA3i b\u1EAFt \u0111\u1EA7u b\u1EB1ng "${s.prefix}"`;
            }
            if (s.format === "ends_with") {
              return `Chu\u1ED7i kh\xF4ng h\u1EE3p l\u1EC7: ph\u1EA3i k\u1EBFt th\xFAc b\u1EB1ng "${s.suffix}"`;
            }
            if (s.format === "includes") {
              return `Chu\u1ED7i kh\xF4ng h\u1EE3p l\u1EC7: ph\u1EA3i bao g\u1ED3m "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `Chu\u1ED7i kh\xF4ng h\u1EE3p l\u1EC7: ph\u1EA3i kh\u1EDBp v\u1EDBi m\u1EABu ${s.pattern}`;
            }
            return `${r[s.format] ?? o.format} kh\xF4ng h\u1EE3p l\u1EC7`;
          }
        case "not_multiple_of":
          return `S\u1ED1 kh\xF4ng h\u1EE3p l\u1EC7: ph\u1EA3i l\xE0 b\u1ED9i s\u1ED1 c\u1EE7a ${o.divisor}`;
        case "unrecognized_keys":
          return `Kh\xF3a kh\xF4ng \u0111\u01B0\u1EE3c nh\u1EADn d\u1EA1ng: ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `Kh\xF3a kh\xF4ng h\u1EE3p l\u1EC7 trong ${o.origin}`;
        case "invalid_union":
          return "\u0110\u1EA7u v\xE0o kh\xF4ng h\u1EE3p l\u1EC7";
        case "invalid_element":
          return `Gi\xE1 tr\u1ECB kh\xF4ng h\u1EE3p l\u1EC7 trong ${o.origin}`;
        default:
          return "\u0110\u1EA7u v\xE0o kh\xF4ng h\u1EE3p l\u1EC7";
      }
    };
  };
  var Wfs = __lazy(() => {
    gp();
  });
  function zhCN() {
    return {
      localeError: ecu()
    };
  }
  var ecu = () => {
    let e = {
      string: {
        unit: "\u5B57\u7B26",
        verb: "\u5305\u542B"
      },
      file: {
        unit: "\u5B57\u8282",
        verb: "\u5305\u542B"
      },
      array: {
        unit: "\u9879",
        verb: "\u5305\u542B"
      },
      set: {
        unit: "\u9879",
        verb: "\u5305\u542B"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "\u975E\u6570\u5B57(NaN)" : "\u6570\u5B57";
        case "object":
          {
            if (Array.isArray(o)) {
              return "\u6570\u7EC4";
            }
            if (o === null) {
              return "\u7A7A\u503C(null)";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u8F93\u5165",
      email: "\u7535\u5B50\u90AE\u4EF6",
      url: "URL",
      emoji: "\u8868\u60C5\u7B26\u53F7",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO\u65E5\u671F\u65F6\u95F4",
      date: "ISO\u65E5\u671F",
      time: "ISO\u65F6\u95F4",
      duration: "ISO\u65F6\u957F",
      ipv4: "IPv4\u5730\u5740",
      ipv6: "IPv6\u5730\u5740",
      cidrv4: "IPv4\u7F51\u6BB5",
      cidrv6: "IPv6\u7F51\u6BB5",
      base64: "base64\u7F16\u7801\u5B57\u7B26\u4E32",
      base64url: "base64url\u7F16\u7801\u5B57\u7B26\u4E32",
      json_string: "JSON\u5B57\u7B26\u4E32",
      e164: "E.164\u53F7\u7801",
      jwt: "JWT",
      template_literal: "\u8F93\u5165"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u65E0\u6548\u8F93\u5165\uFF1A\u671F\u671B ${o.expected}\uFF0C\u5B9E\u9645\u63A5\u6536 ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u65E0\u6548\u8F93\u5165\uFF1A\u671F\u671B ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u65E0\u6548\u9009\u9879\uFF1A\u671F\u671B\u4EE5\u4E0B\u4E4B\u4E00 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u6570\u503C\u8FC7\u5927\uFF1A\u671F\u671B ${o.origin ?? "\u503C"} ${s}${o.maximum.toString()} ${i.unit ?? "\u4E2A\u5143\u7D20"}`;
            }
            return `\u6570\u503C\u8FC7\u5927\uFF1A\u671F\u671B ${o.origin ?? "\u503C"} ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u6570\u503C\u8FC7\u5C0F\uFF1A\u671F\u671B ${o.origin} ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `\u6570\u503C\u8FC7\u5C0F\uFF1A\u671F\u671B ${o.origin} ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u65E0\u6548\u5B57\u7B26\u4E32\uFF1A\u5FC5\u987B\u4EE5 "${s.prefix}" \u5F00\u5934`;
            }
            if (s.format === "ends_with") {
              return `\u65E0\u6548\u5B57\u7B26\u4E32\uFF1A\u5FC5\u987B\u4EE5 "${s.suffix}" \u7ED3\u5C3E`;
            }
            if (s.format === "includes") {
              return `\u65E0\u6548\u5B57\u7B26\u4E32\uFF1A\u5FC5\u987B\u5305\u542B "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u65E0\u6548\u5B57\u7B26\u4E32\uFF1A\u5FC5\u987B\u6EE1\u8DB3\u6B63\u5219\u8868\u8FBE\u5F0F ${s.pattern}`;
            }
            return `\u65E0\u6548${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u65E0\u6548\u6570\u5B57\uFF1A\u5FC5\u987B\u662F ${o.divisor} \u7684\u500D\u6570`;
        case "unrecognized_keys":
          return `\u51FA\u73B0\u672A\u77E5\u7684\u952E(key): ${joinValues(o.keys, ", ")}`;
        case "invalid_key":
          return `${o.origin} \u4E2D\u7684\u952E(key)\u65E0\u6548`;
        case "invalid_union":
          return "\u65E0\u6548\u8F93\u5165";
        case "invalid_element":
          return `${o.origin} \u4E2D\u5305\u542B\u65E0\u6548\u503C(value)`;
        default:
          return "\u65E0\u6548\u8F93\u5165";
      }
    };
  };
  var Gfs = __lazy(() => {
    gp();
  });
  function zhTW() {
    return {
      localeError: tcu()
    };
  }
  var tcu = () => {
    let e = {
      string: {
        unit: "\u5B57\u5143",
        verb: "\u64C1\u6709"
      },
      file: {
        unit: "\u4F4D\u5143\u7D44",
        verb: "\u64C1\u6709"
      },
      array: {
        unit: "\u9805\u76EE",
        verb: "\u64C1\u6709"
      },
      set: {
        unit: "\u9805\u76EE",
        verb: "\u64C1\u6709"
      }
    };
    function t(o) {
      return e[o] ?? null;
    }
    let n = o => {
      let s = typeof o;
      switch (s) {
        case "number":
          return Number.isNaN(o) ? "NaN" : "number";
        case "object":
          {
            if (Array.isArray(o)) {
              return "array";
            }
            if (o === null) {
              return "null";
            }
            if (Object.getPrototypeOf(o) !== Object.prototype && o.constructor) {
              return o.constructor.name;
            }
          }
      }
      return s;
    };
    let r = {
      regex: "\u8F38\u5165",
      email: "\u90F5\u4EF6\u5730\u5740",
      url: "URL",
      emoji: "emoji",
      uuid: "UUID",
      uuidv4: "UUIDv4",
      uuidv6: "UUIDv6",
      nanoid: "nanoid",
      guid: "GUID",
      cuid: "cuid",
      cuid2: "cuid2",
      ulid: "ULID",
      xid: "XID",
      ksuid: "KSUID",
      datetime: "ISO \u65E5\u671F\u6642\u9593",
      date: "ISO \u65E5\u671F",
      time: "ISO \u6642\u9593",
      duration: "ISO \u671F\u9593",
      ipv4: "IPv4 \u4F4D\u5740",
      ipv6: "IPv6 \u4F4D\u5740",
      cidrv4: "IPv4 \u7BC4\u570D",
      cidrv6: "IPv6 \u7BC4\u570D",
      base64: "base64 \u7DE8\u78BC\u5B57\u4E32",
      base64url: "base64url \u7DE8\u78BC\u5B57\u4E32",
      json_string: "JSON \u5B57\u4E32",
      e164: "E.164 \u6578\u503C",
      jwt: "JWT",
      template_literal: "\u8F38\u5165"
    };
    return o => {
      switch (o.code) {
        case "invalid_type":
          return `\u7121\u6548\u7684\u8F38\u5165\u503C\uFF1A\u9810\u671F\u70BA ${o.expected}\uFF0C\u4F46\u6536\u5230 ${n(o.input)}`;
        case "invalid_value":
          if (o.values.length === 1) {
            return `\u7121\u6548\u7684\u8F38\u5165\u503C\uFF1A\u9810\u671F\u70BA ${stringifyPrimitive(o.values[0])}`;
          }
          return `\u7121\u6548\u7684\u9078\u9805\uFF1A\u9810\u671F\u70BA\u4EE5\u4E0B\u5176\u4E2D\u4E4B\u4E00 ${joinValues(o.values, "|")}`;
        case "too_big":
          {
            let s = o.inclusive ? "<=" : "<";
            let i = t(o.origin);
            if (i) {
              return `\u6578\u503C\u904E\u5927\uFF1A\u9810\u671F ${o.origin ?? "\u503C"} \u61C9\u70BA ${s}${o.maximum.toString()} ${i.unit ?? "\u500B\u5143\u7D20"}`;
            }
            return `\u6578\u503C\u904E\u5927\uFF1A\u9810\u671F ${o.origin ?? "\u503C"} \u61C9\u70BA ${s}${o.maximum.toString()}`;
          }
        case "too_small":
          {
            let s = o.inclusive ? ">=" : ">";
            let i = t(o.origin);
            if (i) {
              return `\u6578\u503C\u904E\u5C0F\uFF1A\u9810\u671F ${o.origin} \u61C9\u70BA ${s}${o.minimum.toString()} ${i.unit}`;
            }
            return `\u6578\u503C\u904E\u5C0F\uFF1A\u9810\u671F ${o.origin} \u61C9\u70BA ${s}${o.minimum.toString()}`;
          }
        case "invalid_format":
          {
            let s = o;
            if (s.format === "starts_with") {
              return `\u7121\u6548\u7684\u5B57\u4E32\uFF1A\u5FC5\u9808\u4EE5 "${s.prefix}" \u958B\u982D`;
            }
            if (s.format === "ends_with") {
              return `\u7121\u6548\u7684\u5B57\u4E32\uFF1A\u5FC5\u9808\u4EE5 "${s.suffix}" \u7D50\u5C3E`;
            }
            if (s.format === "includes") {
              return `\u7121\u6548\u7684\u5B57\u4E32\uFF1A\u5FC5\u9808\u5305\u542B "${s.includes}"`;
            }
            if (s.format === "regex") {
              return `\u7121\u6548\u7684\u5B57\u4E32\uFF1A\u5FC5\u9808\u7B26\u5408\u683C\u5F0F ${s.pattern}`;
            }
            return `\u7121\u6548\u7684 ${r[s.format] ?? o.format}`;
          }
        case "not_multiple_of":
          return `\u7121\u6548\u7684\u6578\u5B57\uFF1A\u5FC5\u9808\u70BA ${o.divisor} \u7684\u500D\u6578`;
        case "unrecognized_keys":
          return `\u7121\u6CD5\u8B58\u5225\u7684\u9375\u503C${o.keys.length > 1 ? "\u5011" : ""}\uFF1A${joinValues(o.keys, "\u3001")}`;
        case "invalid_key":
          return `${o.origin} \u4E2D\u6709\u7121\u6548\u7684\u9375\u503C`;
        case "invalid_union":
          return "\u7121\u6548\u7684\u8F38\u5165\u503C";
        case "invalid_element":
          return `${o.origin} \u4E2D\u6709\u7121\u6548\u7684\u503C`;
        default:
          return "\u7121\u6548\u7684\u8F38\u5165\u503C";
      }
    };
  };
  var Vfs = __lazy(() => {
    gp();
  });
  var locales = {};