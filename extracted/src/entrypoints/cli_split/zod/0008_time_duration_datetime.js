  __export(core, {
    version: () => version,
    util: () => util_export,
    treeifyError: () => treeifyError,
    toJSONSchema: () => toJSONSchema,
    toDotPath: () => toDotPath,
    safeParseAsync: () => safeParseAsync,
    safeParse: () => safeParse,
    registry: () => registry,
    regexes: () => regexes,
    prettifyError: () => prettifyError,
    parseAsync: () => parseAsync,
    parse: () => parse,
    locales: () => locales,
    isValidJWT: () => isValidJWT,
    isValidBase64URL: () => isValidBase64URL,
    isValidBase64: () => isValidBase64,
    globalRegistry: () => globalRegistry,
    globalConfig: () => globalConfig,
    function: () => mpn,
    formatError: () => formatError,
    flattenError: () => flattenError,
    config: () => config,
    clone: () => clone,
    _xid: () => _xid,
    _void: () => _void,
    _uuidv7: () => _uuidv7,
    _uuidv6: () => _uuidv6,
    _uuidv4: () => _uuidv4,
    _uuid: () => _uuid,
    _url: () => _url,
    _uppercase: () => uppercase_export,
    _unknown: () => _unknown,
    _union: () => _union,
    _undefined: () => _undefined,
    _ulid: () => _ulid,
    _uint64: () => _uint64,
    _uint32: () => _uint32,
    _tuple: () => _tuple,
    _trim: () => trim,
    _transform: () => _transform,
    _toUpperCase: () => toUpperCase,
    _toLowerCase: () => toLowerCase,
    _templateLiteral: () => _templateLiteral,
    _symbol: () => _symbol,
    _success: () => _success,
    _stringbool: () => _stringbool,
    _stringFormat: () => _stringFormat,
    _string: () => _string,
    _startsWith: () => startsWith,
    _size: () => size,
    _set: () => _set,
    _safeParseAsync: () => _safeParseAsync,
    _safeParse: () => _safeParse,
    _regex: () => regex,
    _refine: () => _refine,
    _record: () => _record,
    _readonly: () => _readonly,
    _property: () => property,
    _promise: () => _promise,
    _positive: () => positive,
    _pipe: () => _pipe,
    _parseAsync: () => _parseAsync,
    _parse: () => _parse,
    _overwrite: () => overwrite,
    _optional: () => _optional,
    _number: () => _number,
    _nullable: () => _nullable,
    _null: () => _null,
    _normalize: () => normalize,
    _nonpositive: () => nonpositive,
    _nonoptional: () => _nonoptional,
    _nonnegative: () => nonnegative,
    _never: () => _never,
    _negative: () => negative,
    _nativeEnum: () => _nativeEnum,
    _nanoid: () => _nanoid,
    _nan: () => _nan,
    _multipleOf: () => multipleOf,
    _minSize: () => minSize,
    _minLength: () => minLength,
    _min: () => gte_export,
    _mime: () => mime,
    _maxSize: () => maxSize,
    _maxLength: () => maxLength,
    _max: () => lte_export,
    _map: () => _map,
    _lte: () => lte_export,
    _lt: () => _lt_export,
    _lowercase: () => lowercase_export,
    _literal: () => _literal,
    _length: () => length,
    _lazy: () => _lazy,
    _ksuid: () => _ksuid,
    _jwt: () => _jwt,
    _isoTime: () => _isoTime,
    _isoDuration: () => _isoDuration,
    _isoDateTime: () => _isoDateTime,
    _isoDate: () => _isoDate,
    _ipv6: () => _ipv6,
    _ipv4: () => _ipv4,
    _intersection: () => _intersection,
    _int64: () => _int64,
    _int32: () => _int32,
    _int: () => _int,
    _includes: () => includes,
    _guid: () => _guid,
    _gte: () => gte_export,
    _gt: () => _gt_export,
    _float64: () => _float64,
    _float32: () => _float32,
    _file: () => _file,
    _enum: () => _enum,
    _endsWith: () => endsWith,
    _emoji: () => _emoji_export,
    _email: () => _email,
    _e164: () => _e164,
    _discriminatedUnion: () => _discriminatedUnion,
    _default: () => _default,
    _date: () => _date,
    _custom: () => _custom,
    _cuid2: () => _cuid2,
    _cuid: () => _cuid,
    _coercedString: () => _coercedString,
    _coercedNumber: () => _coercedNumber,
    _coercedDate: () => _coercedDate,
    _coercedBoolean: () => _coercedBoolean,
    _coercedBigint: () => _coercedBigint,
    _cidrv6: () => _cidrv6,
    _cidrv4: () => _cidrv4,
    _catch: () => _catch,
    _boolean: () => _boolean,
    _bigint: () => _bigint,
    _base64url: () => _base64url,
    _base64: () => _base64,
    _array: () => _array,
    _any: () => _any,
    TimePrecision: () => TimePrecision,
    INVALID: () => NEVER_export,
    JSONSchemaGenerator: () => JSONSchemaGenerator,
    JSONSchema: () => JSONSchema,
    Doc: () => Doc_export,
    $output: () => $output,
    $input: () => $input,
    $constructor: () => $constructor,
    $brand: () => $brand,
    $ZodXID: () => $ZodXID,
    $ZodVoid: () => $ZodVoid,
    $ZodUnknown: () => $ZodUnknown,
    $ZodUnion: () => $ZodUnion,
    $ZodUndefined: () => $ZodUndefined,
    $ZodUUID: () => $ZodUUID,
    $ZodURL: () => $ZodURL,
    $ZodULID: () => $ZodULID,
    $ZodType: () => $ZodType,
    $ZodTuple: () => $ZodTuple,
    $ZodTransform: () => $ZodTransform,
    $ZodTemplateLiteral: () => $ZodTemplateLiteral,
    $ZodSymbol: () => $ZodSymbol,
    $ZodSuccess: () => $ZodSuccess,
    $ZodStringFormat: () => $ZodStringFormat,
    $ZodString: () => $ZodString,
    $ZodSet: () => $ZodSet,
    $ZodRegistry: () => $ZodRegistry,
    $ZodRecord: () => $ZodRecord,
    $ZodRealError: () => $ZodRealError,
    $ZodReadonly: () => $ZodReadonly,
    $ZodPromise: () => $ZodPromise,
    $ZodPrefault: () => $ZodPrefault,
    $ZodPipe: () => $ZodPipe,
    $ZodOptional: () => $ZodOptional,
    $ZodObject: () => $ZodObject,
    $ZodNumberFormat: () => $ZodNumberFormat,
    $ZodNumber: () => $ZodNumber,
    $ZodNullable: () => $ZodNullable,
    $ZodNull: () => $ZodNull,
    $ZodNonOptional: () => $ZodNonOptional,
    $ZodNever: () => $ZodNever,
    $ZodNanoID: () => $ZodNanoID,
    $ZodNaN: () => $ZodNaN,
    $ZodMap: () => $ZodMap,
    $ZodLiteral: () => $ZodLiteral,
    $ZodLazy: () => $ZodLazy,
    $ZodKSUID: () => $ZodKSUID,
    $ZodJWT: () => $ZodJWT,
    $ZodIntersection: () => $ZodIntersection,
    $ZodISOTime: () => $ZodISOTime,
    $ZodISODuration: () => $ZodISODuration,
    $ZodISODateTime: () => $ZodISODateTime,
    $ZodISODate: () => $ZodISODate,
    $ZodIPv6: () => $ZodIPv6,
    $ZodIPv4: () => $ZodIPv4,
    $ZodGUID: () => $ZodGUID,
    $ZodFunction: () => $ZodFunction,
    $ZodFile: () => $ZodFile,
    $ZodError: () => $ZodError,
    $ZodEnum: () => $ZodEnum,
    $ZodEmoji: () => $ZodEmoji,
    $ZodEmail: () => $ZodEmail,
    $ZodE164: () => $ZodE164,
    $ZodDiscriminatedUnion: () => $ZodDiscriminatedUnion,
    $ZodDefault: () => $ZodDefault,
    $ZodDate: () => $ZodDate,
    $ZodCustomStringFormat: () => $ZodCustomStringFormat,
    $ZodCustom: () => $ZodCustom,
    $ZodCheckUpperCase: () => $ZodCheckUpperCase,
    $ZodCheckStringFormat: () => $ZodCheckStringFormat,
    $ZodCheckStartsWith: () => $ZodCheckStartsWith,
    $ZodCheckSizeEquals: () => $ZodCheckSizeEquals,
    $ZodCheckRegex: () => $ZodCheckRegex,
    $ZodCheckProperty: () => $ZodCheckProperty,
    $ZodCheckOverwrite: () => $ZodCheckOverwrite,
    $ZodCheckNumberFormat: () => $ZodCheckNumberFormat,
    $ZodCheckMultipleOf: () => $ZodCheckMultipleOf,
    $ZodCheckMinSize: () => $ZodCheckMinSize,
    $ZodCheckMinLength: () => $ZodCheckMinLength,
    $ZodCheckMimeType: () => $ZodCheckMimeType,
    $ZodCheckMaxSize: () => $ZodCheckMaxSize,
    $ZodCheckMaxLength: () => $ZodCheckMaxLength,
    $ZodCheckLowerCase: () => $ZodCheckLowerCase,
    $ZodCheckLessThan: () => $ZodCheckLessThan,
    $ZodCheckLengthEquals: () => $ZodCheckLengthEquals,
    $ZodCheckIncludes: () => $ZodCheckIncludes,
    $ZodCheckGreaterThan: () => $ZodCheckGreaterThan,
    $ZodCheckEndsWith: () => $ZodCheckEndsWith,
    $ZodCheckBigIntFormat: () => $ZodCheckBigIntFormat,
    $ZodCheck: () => $ZodCheck,
    $ZodCatch: () => $ZodCatch,
    $ZodCUID2: () => $ZodCUID2,
    $ZodCUID: () => $ZodCUID,
    $ZodCIDRv6: () => $ZodCIDRv6,
    $ZodCIDRv4: () => $ZodCIDRv4,
    $ZodBoolean: () => $ZodBoolean,
    $ZodBigIntFormat: () => $ZodBigIntFormat,
    $ZodBigInt: () => $ZodBigInt,
    $ZodBase64URL: () => $ZodBase64URL,
    $ZodBase64: () => $ZodBase64,
    $ZodAsyncError: () => $ZodAsyncError,
    $ZodArray: () => $ZodArray,
    $ZodAny: () => $ZodAny
  });
  var AN = __lazy(() => {
    gp();
    Nun();
    Bdn();
    Jfs();
    Ret();
    Dun();
    yxr();
    sPt();
    Uun();
    pkr();
    oAr();
    zfs();
    SAr();
    Kfs();
  });
  var EAr = __lazy(() => {
    AN();
  });
  function vAr(e, t) {
    let n = {
      type: "object",
      get shape() {
        util_export.assignProp(this, "shape", {
          ...e
        });
        return this.shape;
      },
      ...util_export.normalizeParams(t)
    };
    return new Ccu(n);
  }
  var wcu;
  var Ccu;
  var Xfs = __lazy(() => {
    AN();
    AN();
    EAr();
    wcu = $constructor("ZodMiniType", (e, t) => {
      if (!e._zod) {
        throw Error("Uninitialized schema in ZodMiniType.");
      }
      $ZodType.init(e, t);
      e.def = t;
      e.parse = (n, r) => parse(e, n, r, {
        callee: e.parse
      });
      e.safeParse = (n, r) => safeParse(e, n, r);
      e.parseAsync = async (n, r) => parseAsync(e, n, r, {
        callee: e.parseAsync
      });
      e.safeParseAsync = async (n, r) => safeParseAsync(e, n, r);
      e.check = (...n) => e.clone({
        ...t,
        checks: [...(t.checks ?? []), ...n.map(r => typeof r === "function" ? {
          _zod: {
            check: r,
            def: {
              check: "custom"
            },
            onattach: []
          }
        } : r)]
      });
      e.clone = (n, r) => clone(e, n, r);
      e.brand = () => e;
      e.register = (n, r) => (n.add(e, r), e);
    });
    Ccu = $constructor("ZodMiniObject", (e, t) => {
      $ZodObject.init(e, t);
      wcu.init(e, t);
      util_export.defineLazy(e, "shape", () => t.shape);
    });
  });
  var Qfs = () => {};
  var Zfs = () => {};
  var ehs = () => {};
  var ths = __lazy(() => {
    AN();
    AN();
    Bdn();
    Zfs();
    ehs();
    EAr();
    Xfs();
    Qfs();
  });
  var nhs = __lazy(() => {
    ths();
  });
  var wAr = __lazy(() => {
    nhs();
  });
  function V4(e) {
    return !!e._zod;
  }
  function sHe(e) {
    let t = Object.values(e);
    if (t.length === 0) {
      return vAr({});
    }
    let n = t.every(V4);
    let r = t.every(o => !V4(o));
    if (n) {
      return vAr(e);
    }
    if (r) {
      return object(e);
    }
    throw Error("Mixed Zod versions detected in object shape.");
  }
  function mj(e, t) {
    if (V4(e)) {
      return safeParse(e, t);
    }
    return e.safeParse(t);
  }
  async function hpn(e, t) {
    if (V4(e)) {
      return await safeParseAsync(e, t);
    }
    return await e.safeParseAsync(t);
  }
  function Kae(e) {
    if (!e) {
      return;
    }
    let t;
    if (V4(e)) {
      t = e._zod?.def?.shape;
    } else {
      t = e.shape;
    }
    if (!t) {
      return;
    }
    if (typeof t === "function") {
      try {
        return t();
      } catch {
        return;
      }
    }
    return t;
  }
  function jet(e) {
    if (!e) {
      return;
    }
    if (typeof e === "object") {
      let t = e;
      let n = e;
      if (!t._def && !n._zod) {
        let r = Object.values(e);
        if (r.length > 0 && r.every(o => typeof o === "object" && o !== null && (o._def !== undefined || o._zod !== undefined || typeof o.parse === "function"))) {
          return sHe(e);
        }
      }
    }
    if (V4(e)) {
      let n = e._zod?.def;
      if (n && (n.type === "object" || n.shape !== undefined)) {
        return e;
      }
    } else if (e.shape !== undefined) {
      return e;
    }
    return;
  }
  function gpn(e) {
    if (e && typeof e === "object") {
      if ("message" in e && typeof e.message === "string") {
        return e.message;
      }
      if ("issues" in e && Array.isArray(e.issues) && e.issues.length > 0) {
        let t = e.issues[0];
        if (t && typeof t === "object" && "message" in t) {
          return String(t.message);
        }
      }
      try {
        return JSON.stringify(e);
      } catch {
        return String(e);
      }
    }
    return String(e);
  }
  function ohs(e) {
    return e.description;
  }
  function shs(e) {
    if (V4(e)) {
      return e._zod?.def?.type === "optional";
    }
    let t = e;
    if (typeof e.isOptional === "function") {
      return e.isOptional();
    }
    return t._def?.typeName === "ZodOptional";
  }
  function ypn(e) {
    if (V4(e)) {
      let s = e._zod?.def;
      if (s) {
        if (s.value !== undefined) {
          return s.value;
        }
        if (Array.isArray(s.values) && s.values.length > 0) {
          return s.values[0];
        }
      }
    }
    let n = e._def;
    if (n) {
      if (n.value !== undefined) {
        return n.value;
      }
      if (Array.isArray(n.values) && n.values.length > 0) {
        return n.values[0];
      }
    }
    let r = e.value;
    if (r !== undefined) {
      return r;
    }
    return;
  }
  var qet = __lazy(() => {
    GIt();
    wAr();
  });
  var CAr = __lazy(() => {
    AN();
  });
  var iso_export = {};
  __export(iso_export, {
    time: () => time_export,
    duration: () => duration_export,
    datetime: () => datetime_export,
    date: () => date_export2,
    ZodISOTime: () => ZodISOTime,
    ZodISODuration: () => ZodISODuration,
    ZodISODateTime: () => ZodISODateTime,
    ZodISODate: () => ZodISODate
  });
  function datetime_export(e) {
    return _isoDateTime(ZodISODateTime, e);
  }
  function date_export2(e) {
    return _isoDate(ZodISODate, e);
  }
  function time_export(e) {
    return _isoTime(ZodISOTime, e);
  }
  function duration_export(e) {
    return _isoDuration(ZodISODuration, e);
  }
  var ZodISODateTime;
  var ZodISODate;
  var ZodISOTime;
  var ZodISODuration;
  var Epn = __lazy(() => {
    AN();
    vpn();
    ZodISODateTime = $constructor("ZodISODateTime", (e, t) => {
      $ZodISODateTime.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodISODate = $constructor("ZodISODate", (e, t) => {
      $ZodISODate.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodISOTime = $constructor("ZodISOTime", (e, t) => {
      $ZodISOTime.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodISODuration = $constructor("ZodISODuration", (e, t) => {
      $ZodISODuration.init(e, t);
      ZodStringFormat.init(e, t);
    });
  });
  var ahs = (e, t) => {
    $ZodError.init(e, t);
    e.name = "ZodError";
    Object.defineProperties(e, {
      format: {
        value: n => formatError(e, n)
      },
      flatten: {
        value: n => flattenError(e, n)
      },
      addIssue: {
        value: n => e.issues.push(n)
      },
      addIssues: {
        value: n => e.issues.push(...n)
      },
      isEmpty: {
        get() {
          return e.issues.length === 0;
        }
      }
    });
  };
  var ZodError_export;
  var ZodRealError;
  var IAr = __lazy(() => {
    AN();
    AN();
    ZodError_export = $constructor("ZodError", ahs);
    ZodRealError = $constructor("ZodError", ahs, {
      Parent: Error
    });
  });
  var parse_export;
  var parseAsync_export;
  var safeParse_export;
  var safeParseAsync_export;
  var NAr = __lazy(() => {
    AN();
    IAr();
    parse_export = _parse(ZodRealError);
    parseAsync_export = _parseAsync(ZodRealError);
    safeParse_export = _safeParse(ZodRealError);
    safeParseAsync_export = _safeParseAsync(ZodRealError);
  });
  function string_export3(e) {
    return _string(ZodString_export, e);
  }
  function email_export(e) {
    return _email(ZodEmail, e);
  }
  function guid_export(e) {
    return _guid(ZodGUID, e);
  }
  function uuid_export(e) {
    return _uuid(ZodUUID, e);
  }
  function uuidv4(e) {
    return _uuidv4(ZodUUID, e);
  }
  function uuidv6(e) {
    return _uuidv6(ZodUUID, e);
  }
  function uuidv7(e) {
    return _uuidv7(ZodUUID, e);
  }
  function url_export(e) {
    return _url(ZodURL, e);
  }
  function emoji_export(e) {
    return _emoji_export(ZodEmoji, e);
  }
  function nanoid_export(e) {
    return _nanoid(ZodNanoID, e);
  }
  function cuid_export(e) {
    return _cuid(ZodCUID, e);
  }
  function cuid2_export(e) {
    return _cuid2(ZodCUID2, e);
  }
  function ulid_export(e) {
    return _ulid(ZodULID, e);
  }
  function xid_export2(e) {
    return _xid(ZodXID, e);
  }
  function ksuid_export(e) {
    return _ksuid(ZodKSUID, e);
  }
  function ipv4_export(e) {
    return _ipv4(ZodIPv4, e);
  }
  function ipv6_export(e) {
    return _ipv6(ZodIPv6, e);
  }
  function cidrv4_export(e) {
    return _cidrv4(ZodCIDRv4, e);
  }
  function cidrv6_export(e) {
    return _cidrv6(ZodCIDRv6, e);
  }
  function base64_export(e) {
    return _base64(ZodBase64, e);
  }
  function base64url_export(e) {
    return _base64url(ZodBase64URL, e);
  }
  function e164_export(e) {
    return _e164(ZodE164, e);
  }
  function jwt_export(e) {
    return _jwt(ZodJWT, e);
  }
  function stringFormat(e, t, n = {}) {
    return _stringFormat(ZodCustomStringFormat, e, t, n);
  }
  function number_export3(e) {
    return _number(ZodNumber_export, e);
  }
  function int_export(e) {
    return _int(ZodNumberFormat, e);
  }
  function float32(e) {
    return _float32(ZodNumberFormat, e);
  }
  function float64(e) {
    return _float64(ZodNumberFormat, e);
  }
  function int32(e) {
    return _int32(ZodNumberFormat, e);
  }
  function uint32(e) {
    return _uint32(ZodNumberFormat, e);
  }
  function boolean_export3(e) {
    return _boolean(ZodBoolean_export, e);
  }
  function bigint_export3(e) {
    return _bigint(ZodBigInt_export, e);
  }
  function int64(e) {
    return _int64(ZodBigIntFormat, e);
  }
  function uint64(e) {
    return _uint64(ZodBigIntFormat, e);
  }
  function symbol_export(e) {
    return _symbol(ZodSymbol_export, e);
  }
  function undefined_export3(e) {
    return _undefined(ZodUndefined_export, e);
  }
  function xpn(e) {
    return _null(ZodNull_export, e);
  }
  function any_export() {
    return _any(ZodAny_export);
  }
  function unknown_export() {
    return _unknown(ZodUnknown_export);
  }
  function never_export(e) {
    return _never(ZodNever_export, e);
  }
  function auu(e) {
    return _void(ZodVoid_export, e);
  }
  function date_export4(e) {
    return _date(ZodDate_export, e);
  }
  function array_export(e, t) {
    return _array(ZodArray_export, e, t);
  }
  function keyof(e) {
    let t = e._zod.def.shape;
    return literal_export(Object.keys(t));
  }
  function object_export(e, t) {
    let n = {
      type: "object",
      get shape() {
        util_export.assignProp(this, "shape", {
          ...e
        });
        return this.shape;
      },
      ...util_export.normalizeParams(t)
    };
    return new ZodObject_export(n);
  }
  function strictObject_export(e, t) {
    return new ZodObject_export({
      type: "object",
      get shape() {
        util_export.assignProp(this, "shape", {
          ...e
        });
        return this.shape;
      },
      catchall: never_export(),
      ...util_export.normalizeParams(t)
    });
  }
  function looseObject(e, t) {
    return new ZodObject_export({
      type: "object",
      get shape() {
        util_export.assignProp(this, "shape", {
          ...e
        });
        return this.shape;
      },
      catchall: unknown_export(),
      ...util_export.normalizeParams(t)
    });
  }
  function union_export(e, t) {
    return new ZodUnion_export({
      type: "union",
      options: e,
      ...util_export.normalizeParams(t)
    });
  }
  function discriminatedUnion_export(e, t, n) {
    return new ZodDiscriminatedUnion_export({
      type: "union",
      options: t,
      discriminator: e,
      ...util_export.normalizeParams(n)
    });
  }
  function intersection_export(e, t) {
    return new ZodIntersection_export({
      type: "intersection",
      left: e,
      right: t
    });
  }
  function tuple_export(e, t, n) {
    let r = t instanceof $ZodType;
    let o = r ? n : t;
    return new ZodTuple_export({
      type: "tuple",
      items: e,
      rest: r ? t : null,
      ...util_export.normalizeParams(o)
    });
  }
  function record_export(e, t, n) {
    return new ZodRecord_export({
      type: "record",
      keyType: e,
      valueType: t,
      ...util_export.normalizeParams(n)
    });
  }
  function partialRecord(e, t, n) {
    return new ZodRecord_export({
      type: "record",
      keyType: union_export([e, never_export()]),
      valueType: t,
      ...util_export.normalizeParams(n)
    });
  }
  function map_export(e, t, n) {
    return new ZodMap_export({
      type: "map",
      keyType: e,
      valueType: t,
      ...util_export.normalizeParams(n)
    });
  }
  function set_export2(e, t) {
    return new ZodSet_export({
      type: "set",
      valueType: e,
      ...util_export.normalizeParams(t)
    });
  }
  function fj(e, t) {
    let n = Array.isArray(e) ? Object.fromEntries(e.map(r => [r, r])) : e;
    return new ZodEnum_export({
      type: "enum",
      entries: n,
      ...util_export.normalizeParams(t)
    });
  }
  function nativeEnum_export(e, t) {
    return new ZodEnum_export({
      type: "enum",
      entries: e,
      ...util_export.normalizeParams(t)
    });
  }
  function literal_export(e, t) {
    return new ZodLiteral_export({
      type: "literal",
      values: Array.isArray(e) ? e : [e],
      ...util_export.normalizeParams(t)
    });
  }
  function file(e) {
    return _file(ZodFile, e);
  }
  function transform(e) {
    return new ZodTransform({
      type: "transform",
      transform: e
    });
  }
  function optional_export(e) {
    return new ZodOptional_export({
      type: "optional",
      innerType: e
    });
  }
  function nullable_export(e) {
    return new ZodNullable_export({
      type: "nullable",
      innerType: e
    });
  }
  function nullish_export(e) {
    return optional_export(nullable_export(e));
  }
  function _default_export(e, t) {
    return new ZodDefault_export({
      type: "default",
      innerType: e,
      get defaultValue() {
        return typeof t === "function" ? t() : t;
      }
    });
  }
  function prefault(e, t) {
    return new ZodPrefault({
      type: "prefault",
      innerType: e,
      get defaultValue() {
        return typeof t === "function" ? t() : t;
      }
    });
  }
  function nonoptional(e, t) {
    return new ZodNonOptional({
      type: "nonoptional",
      innerType: e,
      ...util_export.normalizeParams(t)
    });
  }
  function success(e) {
    return new ZodSuccess({
      type: "success",
      innerType: e
    });
  }
  function Ohs(e, t) {
    return new ZodCatch_export({
      type: "catch",
      innerType: e,
      catchValue: typeof t === "function" ? t : () => t
    });
  }
  function nan_export(e) {
    return _nan(ZodNaN_export, e);
  }
  function pipe(e, t) {
    return new ZodPipe({
      type: "pipe",
      in: e,
      out: t
    });
  }
  function readonly(e) {
    return new ZodReadonly_export({
      type: "readonly",
      innerType: e
    });
  }
  function templateLiteral(e, t) {
    return new ZodTemplateLiteral({
      type: "template_literal",
      parts: e,
      ...util_export.normalizeParams(t)
    });
  }
  function lazy_export(e) {
    return new ZodLazy_export({
      type: "lazy",
      getter: e
    });
  }
  function promise_export(e) {
    return new ZodPromise_export({
      type: "promise",
      innerType: e
    });
  }
  function check(e, t) {
    let n = new $ZodCheck({
      check: "custom",
      ...util_export.normalizeParams(t)
    });
    n._zod.check = e;
    return n;
  }
  function custom_export(e, t) {
    return _custom(ZodCustom, e ?? (() => true), t);
  }
  function refine(e, t = {}) {
    return _refine(ZodCustom, e, t);
  }
  function superRefine(e, t) {
    let n = check(r => (r.addIssue = o => {
      if (typeof o === "string") {
        r.issues.push(util_export.issue(o, r.value, n._zod.def));
      } else {
        let s = o;
        if (s.fatal) {
          s.continue = false;
        }
        s.code ?? (s.code = "custom");
        s.input ?? (s.input = r.value);
        s.inst ?? (s.inst = n);
        s.continue ?? (s.continue = !n._zod.def.abort);
        r.issues.push(util_export.issue(s));
      }
    }, e(r.value, r)), t);
    return n;
  }
  function Euu(e, t = {
    error: `Input not instance of ${e.name}`
  }) {
    let n = new ZodCustom({
      type: "custom",
      check: "custom",
      fn: r => r instanceof e,
      abort: true,
      ...util_export.normalizeParams(t)
    });
    n._zod.bag.Class = e;
    return n;
  }
  function json(e) {
    let t = lazy_export(() => union_export([string_export3(e), number_export3(), boolean_export3(), xpn(), array_export(t), record_export(string_export3(), t)]));
    return t;
  }
  function preprocess_export(e, t) {
    return pipe(transform(e), t);
  }
  var ZodType_export;
  var _ZodString;
  var ZodString_export;
  var ZodStringFormat;
  var ZodEmail;
  var ZodGUID;
  var ZodUUID;
  var ZodURL;
  var ZodEmoji;
  var ZodNanoID;
  var ZodCUID;
  var ZodCUID2;
  var ZodULID;
  var ZodXID;
  var ZodKSUID;
  var ZodIPv4;
  var ZodIPv6;
  var ZodCIDRv4;
  var ZodCIDRv6;
  var ZodBase64;
  var ZodBase64URL;
  var ZodE164;
  var ZodJWT;
  var ZodCustomStringFormat;
  var ZodNumber_export;
  var ZodNumberFormat;
  var ZodBoolean_export;
  var ZodBigInt_export;
  var ZodBigIntFormat;
  var ZodSymbol_export;
  var ZodUndefined_export;
  var ZodNull_export;
  var ZodAny_export;
  var ZodUnknown_export;
  var ZodNever_export;
  var ZodVoid_export;
  var ZodDate_export;
  var ZodArray_export;
  var ZodObject_export;
  var ZodUnion_export;
  var ZodDiscriminatedUnion_export;
  var ZodIntersection_export;
  var ZodTuple_export;
  var ZodRecord_export;
  var ZodMap_export;
  var ZodSet_export;
  var ZodEnum_export;
  var ZodLiteral_export;
  var ZodFile;
  var ZodTransform;
  var ZodOptional_export;
  var ZodNullable_export;
  var ZodDefault_export;
  var ZodPrefault;
  var ZodNonOptional;
  var ZodSuccess;
  var ZodCatch_export;
  var ZodNaN_export;
  var ZodPipe;
  var ZodReadonly_export;
  var ZodTemplateLiteral;
  var ZodLazy_export;
  var ZodPromise_export;
  var ZodCustom;
  var stringbool = (...e) => _stringbool({
    Pipe: ZodPipe,
    Boolean: ZodBoolean_export,
    String: ZodString_export,
    Transform: ZodTransform
  }, ...e);
  var vpn = __lazy(() => {
    AN();
    AN();
    CAr();
    Epn();
    NAr();
    ZodType_export = $constructor("ZodType", (e, t) => ($ZodType.init(e, t), e.def = t, Object.defineProperty(e, "_def", {
      value: t
    }), e.check = (...n) => e.clone({
      ...t,
      checks: [...(t.checks ?? []), ...n.map(r => typeof r === "function" ? {
        _zod: {
          check: r,
          def: {
            check: "custom"
          },
          onattach: []
        }
      } : r)]
    }), e.clone = (n, r) => clone(e, n, r), e.brand = () => e, e.register = (n, r) => (n.add(e, r), e), e.parse = (n, r) => parse_export(e, n, r, {
      callee: e.parse
    }), e.safeParse = (n, r) => safeParse_export(e, n, r), e.parseAsync = async (n, r) => parseAsync_export(e, n, r, {
      callee: e.parseAsync
    }), e.safeParseAsync = async (n, r) => safeParseAsync_export(e, n, r), e.spa = e.safeParseAsync, e.refine = (n, r) => e.check(refine(n, r)), e.superRefine = n => e.check(superRefine(n)), e.overwrite = n => e.check(overwrite(n)), e.optional = () => optional_export(e), e.nullable = () => nullable_export(e), e.nullish = () => optional_export(nullable_export(e)), e.nonoptional = n => nonoptional(e, n), e.array = () => array_export(e), e.or = n => union_export([e, n]), e.and = n => intersection_export(e, n), e.transform = n => pipe(e, transform(n)), e.default = n => _default_export(e, n), e.prefault = n => prefault(e, n), e.catch = n => Ohs(e, n), e.pipe = n => pipe(e, n), e.readonly = () => readonly(e), e.describe = n => {
      let r = e.clone();
      globalRegistry.add(r, {
        description: n
      });
      return r;
    }, Object.defineProperty(e, "description", {
      get() {
        return globalRegistry.get(e)?.description;
      },
      configurable: true
    }), e.meta = (...n) => {
      if (n.length === 0) {
        return globalRegistry.get(e);
      }
      let r = e.clone();
      globalRegistry.add(r, n[0]);
      return r;
    }, e.isOptional = () => e.safeParse(undefined).success, e.isNullable = () => e.safeParse(null).success, e));
    _ZodString = $constructor("_ZodString", (e, t) => {
      $ZodString.init(e, t);
      ZodType_export.init(e, t);
      let n = e._zod.bag;
      e.format = n.format ?? null;
      e.minLength = n.minimum ?? null;
      e.maxLength = n.maximum ?? null;
      e.regex = (...r) => e.check(regex(...r));
      e.includes = (...r) => e.check(includes(...r));
      e.startsWith = (...r) => e.check(startsWith(...r));
      e.endsWith = (...r) => e.check(endsWith(...r));
      e.min = (...r) => e.check(minLength(...r));
      e.max = (...r) => e.check(maxLength(...r));
      e.length = (...r) => e.check(length(...r));
      e.nonempty = (...r) => e.check(minLength(1, ...r));
      e.lowercase = r => e.check(lowercase_export(r));
      e.uppercase = r => e.check(uppercase_export(r));
      e.trim = () => e.check(trim());
      e.normalize = (...r) => e.check(normalize(...r));
      e.toLowerCase = () => e.check(toLowerCase());
      e.toUpperCase = () => e.check(toUpperCase());
    });
    ZodString_export = $constructor("ZodString", (e, t) => {
      $ZodString.init(e, t);
      _ZodString.init(e, t);
      e.email = n => e.check(_email(ZodEmail, n));
      e.url = n => e.check(_url(ZodURL, n));
      e.jwt = n => e.check(_jwt(ZodJWT, n));
      e.emoji = n => e.check(_emoji_export(ZodEmoji, n));
      e.guid = n => e.check(_guid(ZodGUID, n));
      e.uuid = n => e.check(_uuid(ZodUUID, n));
      e.uuidv4 = n => e.check(_uuidv4(ZodUUID, n));
      e.uuidv6 = n => e.check(_uuidv6(ZodUUID, n));
      e.uuidv7 = n => e.check(_uuidv7(ZodUUID, n));
      e.nanoid = n => e.check(_nanoid(ZodNanoID, n));
      e.guid = n => e.check(_guid(ZodGUID, n));
      e.cuid = n => e.check(_cuid(ZodCUID, n));
      e.cuid2 = n => e.check(_cuid2(ZodCUID2, n));
      e.ulid = n => e.check(_ulid(ZodULID, n));
      e.base64 = n => e.check(_base64(ZodBase64, n));
      e.base64url = n => e.check(_base64url(ZodBase64URL, n));
      e.xid = n => e.check(_xid(ZodXID, n));
      e.ksuid = n => e.check(_ksuid(ZodKSUID, n));
      e.ipv4 = n => e.check(_ipv4(ZodIPv4, n));
      e.ipv6 = n => e.check(_ipv6(ZodIPv6, n));
      e.cidrv4 = n => e.check(_cidrv4(ZodCIDRv4, n));
      e.cidrv6 = n => e.check(_cidrv6(ZodCIDRv6, n));
      e.e164 = n => e.check(_e164(ZodE164, n));
      e.datetime = n => e.check(datetime_export(n));
      e.date = n => e.check(date_export2(n));
      e.time = n => e.check(time_export(n));
      e.duration = n => e.check(duration_export(n));
    });
    ZodStringFormat = $constructor("ZodStringFormat", (e, t) => {
      $ZodStringFormat.init(e, t);
      _ZodString.init(e, t);
    });
    ZodEmail = $constructor("ZodEmail", (e, t) => {
      $ZodEmail.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodGUID = $constructor("ZodGUID", (e, t) => {
      $ZodGUID.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodUUID = $constructor("ZodUUID", (e, t) => {
      $ZodUUID.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodURL = $constructor("ZodURL", (e, t) => {
      $ZodURL.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodEmoji = $constructor("ZodEmoji", (e, t) => {
      $ZodEmoji.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodNanoID = $constructor("ZodNanoID", (e, t) => {
      $ZodNanoID.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodCUID = $constructor("ZodCUID", (e, t) => {
      $ZodCUID.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodCUID2 = $constructor("ZodCUID2", (e, t) => {
      $ZodCUID2.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodULID = $constructor("ZodULID", (e, t) => {
      $ZodULID.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodXID = $constructor("ZodXID", (e, t) => {
      $ZodXID.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodKSUID = $constructor("ZodKSUID", (e, t) => {
      $ZodKSUID.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodIPv4 = $constructor("ZodIPv4", (e, t) => {
      $ZodIPv4.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodIPv6 = $constructor("ZodIPv6", (e, t) => {
      $ZodIPv6.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodCIDRv4 = $constructor("ZodCIDRv4", (e, t) => {
      $ZodCIDRv4.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodCIDRv6 = $constructor("ZodCIDRv6", (e, t) => {
      $ZodCIDRv6.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodBase64 = $constructor("ZodBase64", (e, t) => {
      $ZodBase64.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodBase64URL = $constructor("ZodBase64URL", (e, t) => {
      $ZodBase64URL.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodE164 = $constructor("ZodE164", (e, t) => {
      $ZodE164.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodJWT = $constructor("ZodJWT", (e, t) => {
      $ZodJWT.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodCustomStringFormat = $constructor("ZodCustomStringFormat", (e, t) => {
      $ZodCustomStringFormat.init(e, t);
      ZodStringFormat.init(e, t);
    });
    ZodNumber_export = $constructor("ZodNumber", (e, t) => {
      $ZodNumber.init(e, t);
      ZodType_export.init(e, t);
      e.gt = (r, o) => e.check(_gt_export(r, o));
      e.gte = (r, o) => e.check(gte_export(r, o));
      e.min = (r, o) => e.check(gte_export(r, o));
      e.lt = (r, o) => e.check(_lt_export(r, o));
      e.lte = (r, o) => e.check(lte_export(r, o));
      e.max = (r, o) => e.check(lte_export(r, o));
      e.int = r => e.check(int_export(r));
      e.safe = r => e.check(int_export(r));
      e.positive = r => e.check(_gt_export(0, r));
      e.nonnegative = r => e.check(gte_export(0, r));
      e.negative = r => e.check(_lt_export(0, r));
      e.nonpositive = r => e.check(lte_export(0, r));
      e.multipleOf = (r, o) => e.check(multipleOf(r, o));
      e.step = (r, o) => e.check(multipleOf(r, o));
      e.finite = () => e;
      let n = e._zod.bag;
      e.minValue = Math.max(n.minimum ?? Number.NEGATIVE_INFINITY, n.exclusiveMinimum ?? Number.NEGATIVE_INFINITY) ?? null;
      e.maxValue = Math.min(n.maximum ?? Number.POSITIVE_INFINITY, n.exclusiveMaximum ?? Number.POSITIVE_INFINITY) ?? null;
      e.isInt = (n.format ?? "").includes("int") || Number.isSafeInteger(n.multipleOf ?? 0.5);
      e.isFinite = true;
      e.format = n.format ?? null;
    });
    ZodNumberFormat = $constructor("ZodNumberFormat", (e, t) => {
      $ZodNumberFormat.init(e, t);
      ZodNumber_export.init(e, t);
    });
    ZodBoolean_export = $constructor("ZodBoolean", (e, t) => {
      $ZodBoolean.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodBigInt_export = $constructor("ZodBigInt", (e, t) => {
      $ZodBigInt.init(e, t);
      ZodType_export.init(e, t);
      e.gte = (r, o) => e.check(gte_export(r, o));
      e.min = (r, o) => e.check(gte_export(r, o));
      e.gt = (r, o) => e.check(_gt_export(r, o));
      e.gte = (r, o) => e.check(gte_export(r, o));
      e.min = (r, o) => e.check(gte_export(r, o));
      e.lt = (r, o) => e.check(_lt_export(r, o));
      e.lte = (r, o) => e.check(lte_export(r, o));
      e.max = (r, o) => e.check(lte_export(r, o));
      e.positive = r => e.check(_gt_export(BigInt(0), r));
      e.negative = r => e.check(_lt_export(BigInt(0), r));
      e.nonpositive = r => e.check(lte_export(BigInt(0), r));
      e.nonnegative = r => e.check(gte_export(BigInt(0), r));
      e.multipleOf = (r, o) => e.check(multipleOf(r, o));
      let n = e._zod.bag;
      e.minValue = n.minimum ?? null;
      e.maxValue = n.maximum ?? null;
      e.format = n.format ?? null;
    });
    ZodBigIntFormat = $constructor("ZodBigIntFormat", (e, t) => {
      $ZodBigIntFormat.init(e, t);
      ZodBigInt_export.init(e, t);
    });
    ZodSymbol_export = $constructor("ZodSymbol", (e, t) => {
      $ZodSymbol.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodUndefined_export = $constructor("ZodUndefined", (e, t) => {
      $ZodUndefined.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodNull_export = $constructor("ZodNull", (e, t) => {
      $ZodNull.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodAny_export = $constructor("ZodAny", (e, t) => {
      $ZodAny.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodUnknown_export = $constructor("ZodUnknown", (e, t) => {
      $ZodUnknown.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodNever_export = $constructor("ZodNever", (e, t) => {
      $ZodNever.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodVoid_export = $constructor("ZodVoid", (e, t) => {
      $ZodVoid.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodDate_export = $constructor("ZodDate", (e, t) => {
      $ZodDate.init(e, t);
      ZodType_export.init(e, t);
      e.min = (r, o) => e.check(gte_export(r, o));
      e.max = (r, o) => e.check(lte_export(r, o));
      let n = e._zod.bag;
      e.minDate = n.minimum ? new Date(n.minimum) : null;
      e.maxDate = n.maximum ? new Date(n.maximum) : null;
    });
    ZodArray_export = $constructor("ZodArray", (e, t) => {
      $ZodArray.init(e, t);
      ZodType_export.init(e, t);
      e.element = t.element;
      e.min = (n, r) => e.check(minLength(n, r));
      e.nonempty = n => e.check(minLength(1, n));
      e.max = (n, r) => e.check(maxLength(n, r));
      e.length = (n, r) => e.check(length(n, r));
      e.unwrap = () => e.element;
    });
    ZodObject_export = $constructor("ZodObject", (e, t) => {
      $ZodObject.init(e, t);
      ZodType_export.init(e, t);
      util_export.defineLazy(e, "shape", () => t.shape);
      e.keyof = () => fj(Object.keys(e._zod.def.shape));
      e.catchall = n => e.clone({
        ...e._zod.def,
        catchall: n
      });
      e.passthrough = () => e.clone({
        ...e._zod.def,
        catchall: unknown_export()
      });
      e.loose = () => e.clone({
        ...e._zod.def,
        catchall: unknown_export()
      });
      e.strict = () => e.clone({
        ...e._zod.def,
        catchall: never_export()
      });
      e.strip = () => e.clone({
        ...e._zod.def,
        catchall: undefined
      });
      e.extend = n => util_export.extend(e, n);
      e.merge = n => util_export.merge(e, n);
      e.pick = n => util_export.pick(e, n);
      e.omit = n => util_export.omit(e, n);
      e.partial = (...n) => util_export.partial(ZodOptional_export, e, n[0]);
      e.required = (...n) => util_export.required(ZodNonOptional, e, n[0]);
    });
    ZodUnion_export = $constructor("ZodUnion", (e, t) => {
      $ZodUnion.init(e, t);
      ZodType_export.init(e, t);
      e.options = t.options;
    });
    ZodDiscriminatedUnion_export = $constructor("ZodDiscriminatedUnion", (e, t) => {
      ZodUnion_export.init(e, t);
      $ZodDiscriminatedUnion.init(e, t);
    });
    ZodIntersection_export = $constructor("ZodIntersection", (e, t) => {
      $ZodIntersection.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodTuple_export = $constructor("ZodTuple", (e, t) => {
      $ZodTuple.init(e, t);
      ZodType_export.init(e, t);
      e.rest = n => e.clone({
        ...e._zod.def,
        rest: n
      });
    });
    ZodRecord_export = $constructor("ZodRecord", (e, t) => {
      $ZodRecord.init(e, t);
      ZodType_export.init(e, t);
      e.keyType = t.keyType;
      e.valueType = t.valueType;
    });
    ZodMap_export = $constructor("ZodMap", (e, t) => {
      $ZodMap.init(e, t);
      ZodType_export.init(e, t);
      e.keyType = t.keyType;
      e.valueType = t.valueType;
    });
    ZodSet_export = $constructor("ZodSet", (e, t) => {
      $ZodSet.init(e, t);
      ZodType_export.init(e, t);
      e.min = (...n) => e.check(minSize(...n));
      e.nonempty = n => e.check(minSize(1, n));
      e.max = (...n) => e.check(maxSize(...n));
      e.size = (...n) => e.check(size(...n));
    });
    ZodEnum_export = $constructor("ZodEnum", (e, t) => {
      $ZodEnum.init(e, t);
      ZodType_export.init(e, t);
      e.enum = t.entries;
      e.options = Object.values(t.entries);
      let n = new Set(Object.keys(t.entries));
      e.extract = (r, o) => {
        let s = {};
        for (let i of r) {
          if (n.vZc(i)) {
            s[i] = t.entries[i];
          } else {
            throw Error(`Key ${i} not found in enum`);
          }
        }
        return new ZodEnum_export({
          ...t,
          checks: [],
          ...util_export.normalizeParams(o),
          entries: s
        });
      };
      e.exclude = (r, o) => {
        let s = {
          ...t.entries
        };
        for (let i of r) {
          if (n.vZc(i)) {
            delete s[i];
          } else {
            throw Error(`Key ${i} not found in enum`);
          }
        }
        return new ZodEnum_export({
          ...t,
          checks: [],
          ...util_export.normalizeParams(o),
          entries: s
        });
      };
    });
    ZodLiteral_export = $constructor("ZodLiteral", (e, t) => {
      $ZodLiteral.init(e, t);
      ZodType_export.init(e, t);
      e.values = new Set(t.values);
      Object.defineProperty(e, "value", {
        get() {
          if (t.values.length > 1) {
            throw Error("This schema contains multiple valid literal values. Use `.values` instead.");
          }
          return t.values[0];
        }
      });
    });
    ZodFile = $constructor("ZodFile", (e, t) => {
      $ZodFile.init(e, t);
      ZodType_export.init(e, t);
      e.min = (n, r) => e.check(minSize(n, r));
      e.max = (n, r) => e.check(maxSize(n, r));
      e.mime = (n, r) => e.check(mime(Array.isArray(n) ? n : [n], r));
    });
    ZodTransform = $constructor("ZodTransform", (e, t) => {
      $ZodTransform.init(e, t);
      ZodType_export.init(e, t);
      e._zod.parse = (n, r) => {
        n.addIssue = s => {
          if (typeof s === "string") {
            n.issues.push(util_export.issue(s, n.value, t));
          } else {
            let i = s;
            if (i.fatal) {
              i.continue = false;
            }
            i.code ?? (i.code = "custom");
            i.input ?? (i.input = n.value);
            i.inst ?? (i.inst = e);
            i.continue ?? (i.continue = true);
            n.issues.push(util_export.issue(i));
          }
        };
        let o = t.transform(n.value, n);
        if (o instanceof Promise) {
          return o.then(s => (n.value = s, n));
        }
        n.value = o;
        return n;
      };
    });
    ZodOptional_export = $constructor("ZodOptional", (e, t) => {
      $ZodOptional.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
    });
    ZodNullable_export = $constructor("ZodNullable", (e, t) => {
      $ZodNullable.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
    });
    ZodDefault_export = $constructor("ZodDefault", (e, t) => {
      $ZodDefault.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
      e.removeDefault = e.unwrap;
    });
    ZodPrefault = $constructor("ZodPrefault", (e, t) => {
      $ZodPrefault.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
    });
    ZodNonOptional = $constructor("ZodNonOptional", (e, t) => {
      $ZodNonOptional.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
    });
    ZodSuccess = $constructor("ZodSuccess", (e, t) => {
      $ZodSuccess.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
    });
    ZodCatch_export = $constructor("ZodCatch", (e, t) => {
      $ZodCatch.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
      e.removeCatch = e.unwrap;
    });
    ZodNaN_export = $constructor("ZodNaN", (e, t) => {
      $ZodNaN.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodPipe = $constructor("ZodPipe", (e, t) => {
      $ZodPipe.init(e, t);
      ZodType_export.init(e, t);
      e.in = t.in;
      e.out = t.out;
    });
    ZodReadonly_export = $constructor("ZodReadonly", (e, t) => {
      $ZodReadonly.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodTemplateLiteral = $constructor("ZodTemplateLiteral", (e, t) => {
      $ZodTemplateLiteral.init(e, t);
      ZodType_export.init(e, t);
    });
    ZodLazy_export = $constructor("ZodLazy", (e, t) => {
      $ZodLazy.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.getter();
    });
    ZodPromise_export = $constructor("ZodPromise", (e, t) => {
      $ZodPromise.init(e, t);
      ZodType_export.init(e, t);
      e.unwrap = () => e._zod.def.innerType;
    });
    ZodCustom = $constructor("ZodCustom", (e, t) => {
      $ZodCustom.init(e, t);
      ZodType_export.init(e, t);
    });
  });
  function setErrorMap_export(e) {
    config({
      customError: e
    });
  }
  function getErrorMap_export() {
    return config().customError;
  }
  var ZodIssueCode_export;
  var qhs = __lazy(() => {
    AN();
    ZodIssueCode_export = {
      invalid_type: "invalid_type",
      too_big: "too_big",
      too_small: "too_small",
      invalid_format: "invalid_format",
      not_multiple_of: "not_multiple_of",
      unrecognized_keys: "unrecognized_keys",
      invalid_union: "invalid_union",
      invalid_key: "invalid_key",
      invalid_element: "invalid_element",
      invalid_value: "invalid_value",
      custom: "custom"
    };
  });
  var coerce_export = {};