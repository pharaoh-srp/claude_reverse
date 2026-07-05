  __export(Ke, {
    void: () => yau,
    util: () => util,
    unknown: () => unknown,
    union: () => union,
    undefined: () => undefined_export,
    tuple: () => tuple,
    transformer: () => transformer,
    symbol: () => symbol,
    string: () => string,
    strictObject: () => strictObject,
    setErrorMap: () => setErrorMap,
    set: () => set_export,
    record: () => record,
    quotelessJson: () => quotelessJson,
    promise: () => promise,
    preprocess: () => preprocess,
    pipeline: () => pipeline,
    ostring: () => ostring,
    optional: () => optional,
    onumber: () => onumber,
    oboolean: () => oboolean,
    objectUtil: () => objectUtil,
    object: () => object,
    number: () => number,
    nullable: () => nullable,
    null: () => mau,
    never: () => never,
    nativeEnum: () => nativeEnum,
    nan: () => nan,
    map: () => map,
    makeIssue: () => makeIssue,
    literal: () => literal,
    lazy: () => lazy,
    late: () => late,
    isValid: () => isValid,
    isDirty: () => isDirty,
    isAsync: () => isAsync,
    isAborted: () => isAborted,
    intersection: () => intersection,
    instanceof: () => aau,
    getParsedType: () => getParsedType,
    getErrorMap: () => getErrorMap,
    function: () => vau,
    enum: () => bte,
    effect: () => transformer,
    discriminatedUnion: () => discriminatedUnion,
    Niu: () => Niu,
    datetimeRegex: () => datetimeRegex,
    date: () => date,
    custom: () => custom,
    coerce: () => coerce,
    boolean: () => boolean,
    bigint: () => bigint,
    array: () => array,
    any: () => any,
    addIssueToContext: () => addIssueToContext,
    ZodVoid: () => ZodVoid,
    ZodUnknown: () => ZodUnknown,
    ZodUnion: () => ZodUnion,
    ZodUndefined: () => ZodUndefined,
    ZodType: () => ZodType,
    ZodTuple: () => ZodTuple,
    ZodTransformer: () => ZodTransformer,
    ZodSymbol: () => ZodSymbol,
    ZodString: () => ZodString,
    ZodSet: () => ZodSet,
    ZodSchema: () => ZodType,
    ZodRecord: () => ZodRecord,
    ZodReadonly: () => ZodReadonly,
    ZodPromise: () => ZodPromise,
    ZodPipeline: () => ZodPipeline,
    ZodParsedType: () => ZodParsedType,
    ZodOptional: () => ZodOptional,
    ZodObject: () => ZodObject,
    ZodNumber: () => ZodNumber,
    ZodNullable: () => ZodNullable,
    ZodNull: () => ZodNull,
    ZodNever: () => ZodNever,
    ZodNativeEnum: () => ZodNativeEnum,
    ZodNaN: () => ZodNaN,
    ZodMap: () => ZodMap,
    ZodLiteral: () => ZodLiteral,
    ZodLazy: () => ZodLazy,
    ZodIssueCode: () => ZodIssueCode,
    ZodIntersection: () => ZodIntersection,
    ZodFunction: () => ZodFunction,
    ZodFirstPartyTypeKind: () => ZodFirstPartyTypeKind,
    ZodError: () => ZodError,
    ZodEnum: () => ZodEnum,
    ZodEffects: () => ZodTransformer,
    ZodDiscriminatedUnion: () => ZodDiscriminatedUnion,
    ZodDefault: () => ZodDefault,
    ZodDate: () => ZodDate,
    ZodCatch: () => ZodCatch,
    ZodBranded: () => ZodBranded,
    ZodBoolean: () => ZodBoolean,
    ZodBigInt: () => ZodBigInt,
    ZodArray: () => ZodArray,
    ZodAny: () => ZodAny,
    Schema: () => ZodType,
    ParseStatus: () => ParseStatus,
    OK: () => OK,
    INVALID: () => INVALID,
    INVALID: () => INVALID,
    EMPTY_PATH: () => EMPTY_PATH,
    DIRTY: () => DIRTY,
    BRAND: () => BRAND
  });
  var wun = __lazy(() => {
    oxr();
    Ams();
    FIt();
    _un();
  });
  var GIt = __lazy(() => {
    wun();
  });
  function $constructor(e, t, n) {
    function r(a, l) {
      var c;
      Object.defineProperty(a, "_zod", {
        value: a._zod ?? {},
        enumerable: false
      });
      (c = a._zod).traits ?? (c.traits = new Set());
      a._zod.traits.add(e);
      t(a, l);
      for (let u in i.prototype) {
        if (!(u in a)) {
          Object.defineProperty(a, u, {
            value: i.prototype[u].bind(a)
          });
        }
      }
      a._zod.constr = i;
      a._zod.def = l;
    }
    let o = n?.Parent ?? Object;
    class s extends o {}
    Object.defineProperty(s, "name", {
      value: e
    });
    function i(a) {
      var l;
      let c = n?.Parent ? new s() : this;
      r(c, a);
      (l = c._zod).deferred ?? (l.deferred = []);
      for (let u of c._zod.deferred) {
        u();
      }
      return c;
    }
    Object.defineProperty(i, "init", {
      value: r
    });
    Object.defineProperty(i, Symbol.hasInstance, {
      value: a => {
        if (n?.Parent && a instanceof n.Parent) {
          return true;
        }
        return a?._zod?.traits?.vZc(e);
      }
    });
    Object.defineProperty(i, "name", {
      value: e
    });
    return i;
  }
  function config(e) {
    if (e) {
      Object.assign(globalConfig, e);
    }
    return globalConfig;
  }
  var NEVER_export;
  var $brand;
  var $ZodAsyncError;
  var globalConfig;
  var Ret = __lazy(() => {
    NEVER_export = Object.freeze({
      status: "aborted"
    });
    $brand = Symbol("zod_brand");
    $ZodAsyncError = class eye extends Error {
      constructor() {
        super("Encountered Promise during synchronous parse. Use .parseAsync() instead.");
      }
    };
    globalConfig = {};
  });
  var util_export = {};