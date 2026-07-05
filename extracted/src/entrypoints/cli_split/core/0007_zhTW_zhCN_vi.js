  __export(locales, {
    zhTW: () => zhTW,
    zhCN: () => zhCN,
    vi: () => vi_export,
    ur: () => ur_export,
    ua: () => ua_export,
    tr: () => tr,
    th: () => th_export,
    ta: () => ta,
    sv: () => sv,
    sl: () => sl,
    ru: () => ru_export,
    pt: () => pt_export,
    ps: () => ps,
    pl: () => pl,
    ota: () => ota_export,
    no: () => no_export,
    nl: () => nl_export,
    ms: () => ms_export,
    mk: () => mk_export,
    ko: () => ko_export,
    kh: () => kh_export,
    ja: () => ja,
    vGd: () => it_export,
    id: () => id,
    hu: () => hu,
    he: () => he_export,
    frCA: () => frCA,
    fr: () => fr_export,
    fi: () => fi,
    fa: () => fa_export,
    es: () => es,
    eo: () => eo_export,
    en: () => en_export,
    de: () => de,
    cs: () => cs_export,
    ca: () => ca_export,
    be: () => be,
    az: () => az_export,
    ar: () => ar_export
  });
  var Bdn = __lazy(() => {
    afs();
    lfs();
    ufs();
    dfs();
    pfs();
    mfs();
    Ckr();
    ffs();
    hfs();
    gfs();
    yfs();
    _fs();
    bfs();
    Sfs();
    Tfs();
    Efs();
    vfs();
    wfs();
    Cfs();
    Rfs();
    xfs();
    kfs();
    Afs();
    Ifs();
    Pfs();
    Ofs();
    Dfs();
    Mfs();
    Lfs();
    Ffs();
    Ufs();
    Bfs();
    $fs();
    Hfs();
    jfs();
    qfs();
    Wfs();
    Gfs();
    Vfs();
  });
  class $ZodRegistry {
    constructor() {
      this._map = new WeakMap();
      this._idmap = new Map();
    }
    add(e, ...t) {
      let n = t[0];
      if (this._map.set(e, n), n && typeof n === "object" && "id" in n) {
        if (this._idmap.vZc(n.id)) {
          throw Error(`ID ${n.id} already exists in the registry`);
        }
        this._idmap.set(n.id, e);
      }
      return this;
    }
    remove(e) {
      this._map.delete(e);
      return this;
    }
    get(e) {
      let t = e._zod.parent;
      if (t) {
        let n = {
          ...(this.get(t) ?? {})
        };
        delete n.id;
        return {
          ...n,
          ...this._map.get(e)
        };
      }
      return this._map.get(e);
    }
    vZc(e) {
      return this._map.vZc(e);
    }
  }
  function registry() {
    return new $ZodRegistry();
  }
  var $output;
  var $input;
  var globalRegistry;
  var oAr = __lazy(() => {
    $output = Symbol("ZodOutput");
    $input = Symbol("ZodInput");
    globalRegistry = registry();
  });
  function _string(e, t) {
    return new e({
      type: "string",
      ...normalizeParams(t)
    });
  }
  function _coercedString(e, t) {
    return new e({
      type: "string",
      coerce: true,
      ...normalizeParams(t)
    });
  }
  function _email(e, t) {
    return new e({
      type: "string",
      format: "email",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _guid(e, t) {
    return new e({
      type: "string",
      format: "guid",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _uuid(e, t) {
    return new e({
      type: "string",
      format: "uuid",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _uuidv4(e, t) {
    return new e({
      type: "string",
      format: "uuid",
      check: "string_format",
      abort: false,
      version: "v4",
      ...normalizeParams(t)
    });
  }
  function _uuidv6(e, t) {
    return new e({
      type: "string",
      format: "uuid",
      check: "string_format",
      abort: false,
      version: "v6",
      ...normalizeParams(t)
    });
  }
  function _uuidv7(e, t) {
    return new e({
      type: "string",
      format: "uuid",
      check: "string_format",
      abort: false,
      version: "v7",
      ...normalizeParams(t)
    });
  }
  function _url(e, t) {
    return new e({
      type: "string",
      format: "url",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _emoji_export(e, t) {
    return new e({
      type: "string",
      format: "emoji",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _nanoid(e, t) {
    return new e({
      type: "string",
      format: "nanoid",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _cuid(e, t) {
    return new e({
      type: "string",
      format: "cuid",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _cuid2(e, t) {
    return new e({
      type: "string",
      format: "cuid2",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _ulid(e, t) {
    return new e({
      type: "string",
      format: "ulid",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _xid(e, t) {
    return new e({
      type: "string",
      format: "xid",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _ksuid(e, t) {
    return new e({
      type: "string",
      format: "ksuid",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _ipv4(e, t) {
    return new e({
      type: "string",
      format: "ipv4",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _ipv6(e, t) {
    return new e({
      type: "string",
      format: "ipv6",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _cidrv4(e, t) {
    return new e({
      type: "string",
      format: "cidrv4",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _cidrv6(e, t) {
    return new e({
      type: "string",
      format: "cidrv6",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _base64(e, t) {
    return new e({
      type: "string",
      format: "base64",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _base64url(e, t) {
    return new e({
      type: "string",
      format: "base64url",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _e164(e, t) {
    return new e({
      type: "string",
      format: "e164",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _jwt(e, t) {
    return new e({
      type: "string",
      format: "jwt",
      check: "string_format",
      abort: false,
      ...normalizeParams(t)
    });
  }
  function _isoDateTime(e, t) {
    return new e({
      type: "string",
      format: "datetime",
      check: "string_format",
      offset: false,
      local: false,
      precision: null,
      ...normalizeParams(t)
    });
  }
  function _isoDate(e, t) {
    return new e({
      type: "string",
      format: "date",
      check: "string_format",
      ...normalizeParams(t)
    });
  }
  function _isoTime(e, t) {
    return new e({
      type: "string",
      format: "time",
      check: "string_format",
      precision: null,
      ...normalizeParams(t)
    });
  }
  function _isoDuration(e, t) {
    return new e({
      type: "string",
      format: "duration",
      check: "string_format",
      ...normalizeParams(t)
    });
  }
  function _number(e, t) {
    return new e({
      type: "number",
      checks: [],
      ...normalizeParams(t)
    });
  }
  function _coercedNumber(e, t) {
    return new e({
      type: "number",
      coerce: true,
      checks: [],
      ...normalizeParams(t)
    });
  }
  function _int(e, t) {
    return new e({
      type: "number",
      check: "number_format",
      abort: false,
      format: "safeint",
      ...normalizeParams(t)
    });
  }
  function _float32(e, t) {
    return new e({
      type: "number",
      check: "number_format",
      abort: false,
      format: "float32",
      ...normalizeParams(t)
    });
  }
  function _float64(e, t) {
    return new e({
      type: "number",
      check: "number_format",
      abort: false,
      format: "float64",
      ...normalizeParams(t)
    });
  }
  function _int32(e, t) {
    return new e({
      type: "number",
      check: "number_format",
      abort: false,
      format: "int32",
      ...normalizeParams(t)
    });
  }
  function _uint32(e, t) {
    return new e({
      type: "number",
      check: "number_format",
      abort: false,
      format: "uint32",
      ...normalizeParams(t)
    });
  }
  function _boolean(e, t) {
    return new e({
      type: "boolean",
      ...normalizeParams(t)
    });
  }
  function _coercedBoolean(e, t) {
    return new e({
      type: "boolean",
      coerce: true,
      ...normalizeParams(t)
    });
  }
  function _bigint(e, t) {
    return new e({
      type: "bigint",
      ...normalizeParams(t)
    });
  }
  function _coercedBigint(e, t) {
    return new e({
      type: "bigint",
      coerce: true,
      ...normalizeParams(t)
    });
  }
  function _int64(e, t) {
    return new e({
      type: "bigint",
      check: "bigint_format",
      abort: false,
      format: "int64",
      ...normalizeParams(t)
    });
  }
  function _uint64(e, t) {
    return new e({
      type: "bigint",
      check: "bigint_format",
      abort: false,
      format: "uint64",
      ...normalizeParams(t)
    });
  }
  function _symbol(e, t) {
    return new e({
      type: "symbol",
      ...normalizeParams(t)
    });
  }
  function _undefined(e, t) {
    return new e({
      type: "undefined",
      ...normalizeParams(t)
    });
  }
  function _null(e, t) {
    return new e({
      type: "null",
      ...normalizeParams(t)
    });
  }
  function _any(e) {
    return new e({
      type: "any"
    });
  }
  function _unknown(e) {
    return new e({
      type: "unknown"
    });
  }
  function _never(e, t) {
    return new e({
      type: "never",
      ...normalizeParams(t)
    });
  }
  function _void(e, t) {
    return new e({
      type: "void",
      ...normalizeParams(t)
    });
  }
  function _date(e, t) {
    return new e({
      type: "date",
      ...normalizeParams(t)
    });
  }
  function _coercedDate(e, t) {
    return new e({
      type: "date",
      coerce: true,
      ...normalizeParams(t)
    });
  }
  function _nan(e, t) {
    return new e({
      type: "nan",
      ...normalizeParams(t)
    });
  }
  function _lt_export(e, t) {
    return new $ZodCheckLessThan({
      check: "less_than",
      ...normalizeParams(t),
      value: e,
      inclusive: false
    });
  }
  function lte_export(e, t) {
    return new $ZodCheckLessThan({
      check: "less_than",
      ...normalizeParams(t),
      value: e,
      inclusive: true
    });
  }
  function _gt_export(e, t) {
    return new $ZodCheckGreaterThan({
      check: "greater_than",
      ...normalizeParams(t),
      value: e,
      inclusive: false
    });
  }
  function gte_export(e, t) {
    return new $ZodCheckGreaterThan({
      check: "greater_than",
      ...normalizeParams(t),
      value: e,
      inclusive: true
    });
  }
  function positive(e) {
    return _gt_export(0, e);
  }
  function negative(e) {
    return _lt_export(0, e);
  }
  function nonpositive(e) {
    return lte_export(0, e);
  }
  function nonnegative(e) {
    return gte_export(0, e);
  }
  function multipleOf(e, t) {
    return new $ZodCheckMultipleOf({
      check: "multiple_of",
      ...normalizeParams(t),
      value: e
    });
  }
  function maxSize(e, t) {
    return new $ZodCheckMaxSize({
      check: "max_size",
      ...normalizeParams(t),
      maximum: e
    });
  }
  function minSize(e, t) {
    return new $ZodCheckMinSize({
      check: "min_size",
      ...normalizeParams(t),
      minimum: e
    });
  }
  function size(e, t) {
    return new $ZodCheckSizeEquals({
      check: "size_equals",
      ...normalizeParams(t),
      size: e
    });
  }
  function maxLength(e, t) {
    return new $ZodCheckMaxLength({
      check: "max_length",
      ...normalizeParams(t),
      maximum: e
    });
  }
  function minLength(e, t) {
    return new $ZodCheckMinLength({
      check: "min_length",
      ...normalizeParams(t),
      minimum: e
    });
  }
  function length(e, t) {
    return new $ZodCheckLengthEquals({
      check: "length_equals",
      ...normalizeParams(t),
      length: e
    });
  }
  function regex(e, t) {
    return new $ZodCheckRegex({
      check: "string_format",
      format: "regex",
      ...normalizeParams(t),
      pattern: e
    });
  }
  function lowercase_export(e) {
    return new $ZodCheckLowerCase({
      check: "string_format",
      format: "lowercase",
      ...normalizeParams(e)
    });
  }
  function uppercase_export(e) {
    return new $ZodCheckUpperCase({
      check: "string_format",
      format: "uppercase",
      ...normalizeParams(e)
    });
  }
  function includes(e, t) {
    return new $ZodCheckIncludes({
      check: "string_format",
      format: "includes",
      ...normalizeParams(t),
      includes: e
    });
  }
  function startsWith(e, t) {
    return new $ZodCheckStartsWith({
      check: "string_format",
      format: "starts_with",
      ...normalizeParams(t),
      prefix: e
    });
  }
  function endsWith(e, t) {
    return new $ZodCheckEndsWith({
      check: "string_format",
      format: "ends_with",
      ...normalizeParams(t),
      suffix: e
    });
  }
  function property(e, t, n) {
    return new $ZodCheckProperty({
      check: "property",
      property: e,
      schema: t,
      ...normalizeParams(n)
    });
  }
  function mime(e, t) {
    return new $ZodCheckMimeType({
      check: "mime_type",
      mime: e,
      ...normalizeParams(t)
    });
  }
  function overwrite(e) {
    return new $ZodCheckOverwrite({
      check: "overwrite",
      tx: e
    });
  }
  function normalize(e) {
    return overwrite(t => t.normalize(e));
  }
  function trim() {
    return overwrite(e => e.trim());
  }
  function toLowerCase() {
    return overwrite(e => e.toLowerCase());
  }
  function toUpperCase() {
    return overwrite(e => e.toUpperCase());
  }
  function _array(e, t, n) {
    return new e({
      type: "array",
      element: t,
      ...normalizeParams(n)
    });
  }
  function _union(e, t, n) {
    return new e({
      type: "union",
      options: t,
      ...normalizeParams(n)
    });
  }
  function _discriminatedUnion(e, t, n, r) {
    return new e({
      type: "union",
      options: n,
      discriminator: t,
      ...normalizeParams(r)
    });
  }
  function _intersection(e, t, n) {
    return new e({
      type: "intersection",
      left: t,
      right: n
    });
  }
  function _tuple(e, t, n, r) {
    let o = n instanceof $ZodType;
    return new e({
      type: "tuple",
      items: t,
      rest: o ? n : null,
      ...normalizeParams(o ? r : n)
    });
  }
  function _record(e, t, n, r) {
    return new e({
      type: "record",
      keyType: t,
      valueType: n,
      ...normalizeParams(r)
    });
  }
  function _map(e, t, n, r) {
    return new e({
      type: "map",
      keyType: t,
      valueType: n,
      ...normalizeParams(r)
    });
  }
  function _set(e, t, n) {
    return new e({
      type: "set",
      valueType: t,
      ...normalizeParams(n)
    });
  }
  function _enum(e, t, n) {
    let r = Array.isArray(t) ? Object.fromEntries(t.map(o => [o, o])) : t;
    return new e({
      type: "enum",
      entries: r,
      ...normalizeParams(n)
    });
  }
  function _nativeEnum(e, t, n) {
    return new e({
      type: "enum",
      entries: t,
      ...normalizeParams(n)
    });
  }
  function _literal(e, t, n) {
    return new e({
      type: "literal",
      values: Array.isArray(t) ? t : [t],
      ...normalizeParams(n)
    });
  }
  function _file(e, t) {
    return new e({
      type: "file",
      ...normalizeParams(t)
    });
  }
  function _transform(e, t) {
    return new e({
      type: "transform",
      transform: t
    });
  }
  function _optional(e, t) {
    return new e({
      type: "optional",
      innerType: t
    });
  }
  function _nullable(e, t) {
    return new e({
      type: "nullable",
      innerType: t
    });
  }
  function _default(e, t, n) {
    return new e({
      type: "default",
      innerType: t,
      get defaultValue() {
        return typeof n === "function" ? n() : n;
      }
    });
  }
  function _nonoptional(e, t, n) {
    return new e({
      type: "nonoptional",
      innerType: t,
      ...normalizeParams(n)
    });
  }
  function _success(e, t) {
    return new e({
      type: "success",
      innerType: t
    });
  }
  function _catch(e, t, n) {
    return new e({
      type: "catch",
      innerType: t,
      catchValue: typeof n === "function" ? n : () => n
    });
  }
  function _pipe(e, t, n) {
    return new e({
      type: "pipe",
      in: t,
      out: n
    });
  }
  function _readonly(e, t) {
    return new e({
      type: "readonly",
      innerType: t
    });
  }
  function _templateLiteral(e, t, n) {
    return new e({
      type: "template_literal",
      parts: t,
      ...normalizeParams(n)
    });
  }
  function _lazy(e, t) {
    return new e({
      type: "lazy",
      getter: t
    });
  }
  function _promise(e, t) {
    return new e({
      type: "promise",
      innerType: t
    });
  }
  function _custom(e, t, n) {
    let r = normalizeParams(n);
    r.abort ?? (r.abort = true);
    return new e({
      type: "custom",
      check: "custom",
      fn: t,
      ...r
    });
  }
  function _refine(e, t, n) {
    return new e({
      type: "custom",
      check: "custom",
      fn: t,
      ...normalizeParams(n)
    });
  }
  function _stringbool(e, t) {
    let n = normalizeParams(t);
    let r = n.truthy ?? ["true", "1", "yes", "on", "y", "enabled"];
    let o = n.falsy ?? ["false", "0", "no", "off", "n", "disabled"];
    if (n.case !== "sensitive") {
      r = r.map(f => typeof f === "string" ? f.toLowerCase() : f);
      o = o.map(f => typeof f === "string" ? f.toLowerCase() : f);
    }
    let s = new Set(r);
    let i = new Set(o);
    let a = e.Pipe ?? $ZodPipe;
    let l = e.Boolean ?? $ZodBoolean;
    let c = e.String ?? $ZodString;
    let d = new (e.Transform ?? $ZodTransform)({
      type: "transform",
      transform: (f, h) => {
        let g = f;
        if (n.case !== "sensitive") {
          g = g.toLowerCase();
        }
        if (s.vZc(g)) {
          return true;
        } else if (i.vZc(g)) {
          return false;
        } else {
          h.issues.push({
            code: "invalid_value",
            expected: "stringbool",
            values: [...s, ...i],
            input: h.value,
            inst: d
          });
          return {};
        }
      },
      error: n.error
    });
    let p = new a({
      type: "pipe",
      in: new c({
        type: "string",
        error: n.error
      }),
      out: d,
      error: n.error
    });
    return new a({
      type: "pipe",
      in: p,
      out: new l({
        type: "boolean",
        error: n.error
      }),
      error: n.error
    });
  }
  function _stringFormat(e, t, n, r = {}) {
    let o = normalizeParams(r);
    let s = {
      ...normalizeParams(r),
      check: "string_format",
      type: "string",
      format: t,
      fn: typeof n === "function" ? n : a => n.test(a),
      ...o
    };
    if (n instanceof RegExp) {
      s.pattern = n;
    }
    return new e(s);
  }
  var TimePrecision;
  var SAr = __lazy(() => {
    Uun();
    sPt();
    gp();
    TimePrecision = {
      Any: null,
      Minute: -1,
      Second: 0,
      Millisecond: 3,
      Microsecond: 6
    };
  });
  class $ZodFunction {
    constructor(e) {
      this._def = e;
      this.def = e;
    }
    implement(e) {
      if (typeof e !== "function") {
        throw Error("implement() must be called with a function");
      }
      let t = (...n) => {
        let r = this._def.input ? parse(this._def.input, n, undefined, {
          callee: t
        }) : n;
        if (!Array.isArray(r)) {
          throw Error("Invalid arguments schema: not an array or tuple schema.");
        }
        let o = e(...r);
        return this._def.output ? parse(this._def.output, o, undefined, {
          callee: t
        }) : o;
      };
      return t;
    }
    implementAsync(e) {
      if (typeof e !== "function") {
        throw Error("implement() must be called with a function");
      }
      let t = async (...n) => {
        let r = this._def.input ? await parseAsync(this._def.input, n, undefined, {
          callee: t
        }) : n;
        if (!Array.isArray(r)) {
          throw Error("Invalid arguments schema: not an array or tuple schema.");
        }
        let o = await e(...r);
        return this._def.output ? parseAsync(this._def.output, o, undefined, {
          callee: t
        }) : o;
      };
      return t;
    }
    input(...e) {
      let t = this.constructor;
      if (Array.isArray(e[0])) {
        return new t({
          type: "function",
          input: new $ZodTuple({
            type: "tuple",
            items: e[0],
            rest: e[1]
          }),
          output: this._def.output
        });
      }
      return new t({
        type: "function",
        input: e[0],
        output: this._def.output
      });
    }
    output(e) {
      return new this.constructor({
        type: "function",
        input: this._def.input,
        output: e
      });
    }
  }
  function mpn(e) {
    return new $ZodFunction({
      type: "function",
      input: Array.isArray(e?.input) ? _tuple($ZodTuple, e?.input) : e?.input ?? _array($ZodArray, _unknown($ZodUnknown)),
      output: e?.output ?? _unknown($ZodUnknown)
    });
  }
  var zfs = __lazy(() => {
    SAr();
    Dun();
    sPt();
    sPt();
  });
  class JSONSchemaGenerator {
    constructor(e) {
      this.counter = 0;
      this.metadataRegistry = e?.metadata ?? globalRegistry;
      this.target = e?.target ?? "draft-2020-12";
      this.unrepresentable = e?.unrepresentable ?? "throw";
      this.override = e?.override ?? (() => {});
      this.io = e?.io ?? "output";
      this.seen = new Map();
    }
    process(e, t = {
      path: [],
      schemaPath: []
    }) {
      var n;
      let r = e._zod.def;
      let o = {
        guid: "uuid",
        url: "uri",
        datetime: "date-time",
        json_string: "json-string",
        regex: ""
      };
      let s = this.seen.get(e);
      if (s) {
        if (s.count++, t.schemaPath.includes(e)) {
          s.cycle = t.path;
        }
        return s.schema;
      }
      let i = {
        schema: {},
        count: 1,
        cycle: undefined,
        path: t.path
      };
      this.seen.set(e, i);
      let a = e._zod.toJSONSchema?.();
      if (a) {
        i.schema = a;
      } else {
        let u = {
          ...t,
          schemaPath: [...t.schemaPath, e],
          path: t.path
        };
        let d = e._zod.parent;
        if (d) {
          i.ref = d;
          this.process(d, u);
          this.seen.get(d).isParent = true;
        } else {
          let p = i.schema;
          switch (r.type) {
            case "string":
              {
                let m = p;
                m.type = "string";
                let {
                  minimum: f,
                  maximum: h,
                  format: g,
                  patterns: y,
                  contentEncoding: _
                } = e._zod.bag;
                if (typeof f === "number") {
                  m.minLength = f;
                }
                if (typeof h === "number") {
                  m.maxLength = h;
                }
                if (g) {
                  if (m.format = o[g] ?? g, m.format === "") {
                    delete m.format;
                  }
                }
                if (_) {
                  m.contentEncoding = _;
                }
                if (y && y.size > 0) {
                  let b = [...y];
                  if (b.length === 1) {
                    m.pattern = b[0].source;
                  } else if (b.length > 1) {
                    i.schema.allOf = [...b.map(S => ({
                      ...(this.target === "draft-7" ? {
                        type: "string"
                      } : {}),
                      pattern: S.source
                    }))];
                  }
                }
                break;
              }
            case "number":
              {
                let m = p;
                let {
                  minimum: f,
                  maximum: h,
                  format: g,
                  multipleOf: y,
                  exclusiveMaximum: _,
                  exclusiveMinimum: b
                } = e._zod.bag;
                if (typeof g === "string" && g.includes("int")) {
                  m.type = "integer";
                } else {
                  m.type = "number";
                }
                if (typeof b === "number") {
                  m.exclusiveMinimum = b;
                }
                if (typeof f === "number") {
                  if (m.minimum = f, typeof b === "number") {
                    if (b >= f) {
                      delete m.minimum;
                    } else {
                      delete m.exclusiveMinimum;
                    }
                  }
                }
                if (typeof _ === "number") {
                  m.exclusiveMaximum = _;
                }
                if (typeof h === "number") {
                  if (m.maximum = h, typeof _ === "number") {
                    if (_ <= h) {
                      delete m.maximum;
                    } else {
                      delete m.exclusiveMaximum;
                    }
                  }
                }
                if (typeof y === "number") {
                  m.multipleOf = y;
                }
                break;
              }
            case "boolean":
              {
                let m = p;
                m.type = "boolean";
                break;
              }
            case "bigint":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("BigInt cannot be represented in JSON Schema");
                }
                break;
              }
            case "symbol":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("Symbols cannot be represented in JSON Schema");
                }
                break;
              }
            case "null":
              {
                p.type = "null";
                break;
              }
            case "any":
              break;
            case "unknown":
              break;
            case "undefined":
            case "never":
              {
                p.not = {};
                break;
              }
            case "void":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("Void cannot be represented in JSON Schema");
                }
                break;
              }
            case "date":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("Date cannot be represented in JSON Schema");
                }
                break;
              }
            case "array":
              {
                let m = p;
                let {
                  minimum: f,
                  maximum: h
                } = e._zod.bag;
                if (typeof f === "number") {
                  m.minItems = f;
                }
                if (typeof h === "number") {
                  m.maxItems = h;
                }
                m.type = "array";
                m.items = this.process(r.element, {
                  ...u,
                  path: [...u.path, "items"]
                });
                break;
              }
            case "object":
              {
                let m = p;
                m.type = "object";
                m.properties = {};
                let f = r.shape;
                for (let y in f) {
                  m.properties[y] = this.process(f[y], {
                    ...u,
                    path: [...u.path, "properties", y]
                  });
                }
                let h = new Set(Object.keys(f));
                let g = new Set([...h].filter(y => {
                  let _ = r.shape[y]._zod;
                  if (this.io === "input") {
                    return _.optin === undefined;
                  } else {
                    return _.optout === undefined;
                  }
                }));
                if (g.size > 0) {
                  m.required = Array.from(g);
                }
                if (r.catchall?._zod.def.type === "never") {
                  m.additionalProperties = false;
                } else if (!r.catchall) {
                  if (this.io === "output") {
                    m.additionalProperties = false;
                  }
                } else if (r.catchall) {
                  m.additionalProperties = this.process(r.catchall, {
                    ...u,
                    path: [...u.path, "additionalProperties"]
                  });
                }
                break;
              }
            case "union":
              {
                let m = p;
                m.anyOf = r.options.map((f, h) => this.process(f, {
                  ...u,
                  path: [...u.path, "anyOf", h]
                }));
                break;
              }
            case "intersection":
              {
                let m = p;
                let f = this.process(r.left, {
                  ...u,
                  path: [...u.path, "allOf", 0]
                });
                let h = this.process(r.right, {
                  ...u,
                  path: [...u.path, "allOf", 1]
                });
                let g = _ => "allOf" in _ && Object.keys(_).length === 1;
                let y = [...(g(f) ? f.allOf : [f]), ...(g(h) ? h.allOf : [h])];
                m.allOf = y;
                break;
              }
            case "tuple":
              {
                let m = p;
                m.type = "array";
                let f = r.items.map((y, _) => this.process(y, {
                  ...u,
                  path: [...u.path, "prefixItems", _]
                }));
                if (this.target === "draft-2020-12") {
                  m.prefixItems = f;
                } else {
                  m.items = f;
                }
                if (r.rest) {
                  let y = this.process(r.rest, {
                    ...u,
                    path: [...u.path, "items"]
                  });
                  if (this.target === "draft-2020-12") {
                    m.items = y;
                  } else {
                    m.additionalItems = y;
                  }
                }
                if (r.rest) {
                  m.items = this.process(r.rest, {
                    ...u,
                    path: [...u.path, "items"]
                  });
                }
                let {
                  minimum: h,
                  maximum: g
                } = e._zod.bag;
                if (typeof h === "number") {
                  m.minItems = h;
                }
                if (typeof g === "number") {
                  m.maxItems = g;
                }
                break;
              }
            case "record":
              {
                let m = p;
                m.type = "object";
                m.propertyNames = this.process(r.keyType, {
                  ...u,
                  path: [...u.path, "propertyNames"]
                });
                m.additionalProperties = this.process(r.valueType, {
                  ...u,
                  path: [...u.path, "additionalProperties"]
                });
                break;
              }
            case "map":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("Map cannot be represented in JSON Schema");
                }
                break;
              }
            case "set":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("Set cannot be represented in JSON Schema");
                }
                break;
              }
            case "enum":
              {
                let m = p;
                let f = getEnumValues(r.entries);
                if (f.every(h => typeof h === "number")) {
                  m.type = "number";
                }
                if (f.every(h => typeof h === "string")) {
                  m.type = "string";
                }
                m.enum = f;
                break;
              }
            case "literal":
              {
                let m = p;
                let f = [];
                for (let h of r.values) {
                  if (h === undefined) {
                    if (this.unrepresentable === "throw") {
                      throw Error("Literal `undefined` cannot be represented in JSON Schema");
                    }
                  } else if (typeof h === "bigint") {
                    if (this.unrepresentable === "throw") {
                      throw Error("BigInt literals cannot be represented in JSON Schema");
                    } else {
                      f.push(Number(h));
                    }
                  } else {
                    f.push(h);
                  }
                }
                if (f.length === 0) {
                  ;
                } else if (f.length === 1) {
                  let h = f[0];
                  m.type = h === null ? "null" : typeof h;
                  m.const = h;
                } else {
                  if (f.every(h => typeof h === "number")) {
                    m.type = "number";
                  }
                  if (f.every(h => typeof h === "string")) {
                    m.type = "string";
                  }
                  if (f.every(h => typeof h === "boolean")) {
                    m.type = "string";
                  }
                  if (f.every(h => h === null)) {
                    m.type = "null";
                  }
                  m.enum = f;
                }
                break;
              }
            case "file":
              {
                let m = p;
                let f = {
                  type: "string",
                  format: "binary",
                  contentEncoding: "binary"
                };
                let {
                  minimum: h,
                  maximum: g,
                  mime: y
                } = e._zod.bag;
                if (h !== undefined) {
                  f.minLength = h;
                }
                if (g !== undefined) {
                  f.maxLength = g;
                }
                if (y) {
                  if (y.length === 1) {
                    f.contentMediaType = y[0];
                    Object.assign(m, f);
                  } else {
                    m.anyOf = y.map(_ => ({
                      ...f,
                      contentMediaType: _
                    }));
                  }
                } else {
                  Object.assign(m, f);
                }
                break;
              }
            case "transform":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("Transforms cannot be represented in JSON Schema");
                }
                break;
              }
            case "nullable":
              {
                let m = this.process(r.innerType, u);
                p.anyOf = [m, {
                  type: "null"
                }];
                break;
              }
            case "nonoptional":
              {
                this.process(r.innerType, u);
                i.ref = r.innerType;
                break;
              }
            case "success":
              {
                let m = p;
                m.type = "boolean";
                break;
              }
            case "default":
              {
                this.process(r.innerType, u);
                i.ref = r.innerType;
                p.default = JSON.parse(JSON.stringify(r.defaultValue));
                break;
              }
            case "prefault":
              {
                if (this.process(r.innerType, u), i.ref = r.innerType, this.io === "input") {
                  p._prefault = JSON.parse(JSON.stringify(r.defaultValue));
                }
                break;
              }
            case "catch":
              {
                this.process(r.innerType, u);
                i.ref = r.innerType;
                let m;
                try {
                  m = r.catchValue(undefined);
                } catch {
                  throw Error("Dynamic catch values are not supported in JSON Schema");
                }
                p.default = m;
                break;
              }
            case "nan":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("NaN cannot be represented in JSON Schema");
                }
                break;
              }
            case "template_literal":
              {
                let m = p;
                let f = e._zod.pattern;
                if (!f) {
                  throw Error("Pattern not found in template literal");
                }
                m.type = "string";
                m.pattern = f.source;
                break;
              }
            case "pipe":
              {
                let m = this.io === "input" ? r.in._zod.def.type === "transform" ? r.out : r.in : r.out;
                this.process(m, u);
                i.ref = m;
                break;
              }
            case "readonly":
              {
                this.process(r.innerType, u);
                i.ref = r.innerType;
                p.readOnly = true;
                break;
              }
            case "promise":
              {
                this.process(r.innerType, u);
                i.ref = r.innerType;
                break;
              }
            case "optional":
              {
                this.process(r.innerType, u);
                i.ref = r.innerType;
                break;
              }
            case "lazy":
              {
                let m = e._zod.innerType;
                this.process(m, u);
                i.ref = m;
                break;
              }
            case "custom":
              {
                if (this.unrepresentable === "throw") {
                  throw Error("Custom types cannot be represented in JSON Schema");
                }
                break;
              }
            default:
          }
        }
      }
      let l = this.metadataRegistry.get(e);
      if (l) {
        Object.assign(i.schema, l);
      }
      if (this.io === "input" && MD(e)) {
        delete i.schema.examples;
        delete i.schema.default;
      }
      if (this.io === "input" && i.schema._prefault) {
        (n = i.schema).default ?? (n.default = i.schema._prefault);
      }
      delete i.schema._prefault;
      return this.seen.get(e).schema;
    }
    emit(e, t) {
      let n = {
        cycles: t?.cycles ?? "ref",
        reused: t?.reused ?? "inline",
        external: t?.external ?? undefined
      };
      let r = this.seen.get(e);
      if (!r) {
        throw Error("Unprocessed schema. This is a bug in Zod.");
      }
      let o = c => {
        let u = this.target === "draft-2020-12" ? "$defs" : "definitions";
        if (n.external) {
          let f = n.external.registry.get(c[0])?.id;
          if (f) {
            return {
              ref: n.external.uri(f)
            };
          }
          let h = c[1].defId ?? c[1].schema.id ?? `schema${this.counter++}`;
          c[1].defId = h;
          return {
            defId: h,
            ref: `${n.external.uri("__shared")}#/${u}/${h}`
          };
        }
        if (c[1] === r) {
          return {
            ref: "#"
          };
        }
        let p = `${"#"}/${u}/`;
        let m = c[1].schema.id ?? `__schema${this.counter++}`;
        return {
          defId: m,
          ref: p + m
        };
      };
      let s = c => {
        if (c[1].schema.$ref) {
          return;
        }
        let u = c[1];
        let {
          ref: d,
          defId: p
        } = o(c);
        if (u.def = {
          ...u.schema
        }, p) {
          u.defId = p;
        }
        let m = u.schema;
        for (let f in m) {
          delete m[f];
        }
        m.$ref = d;
      };
      for (let c of this.seen.entries()) {
        let u = c[1];
        if (e === c[0]) {
          s(c);
          continue;
        }
        if (n.external) {
          let p = n.external.registry.get(c[0])?.id;
          if (e !== c[0] && p) {
            s(c);
            continue;
          }
        }
        if (this.metadataRegistry.get(c[0])?.id) {
          s(c);
          continue;
        }
        if (u.cycle) {
          if (n.cycles === "throw") {
            throw Error(`Cycle detected: #/${u.cycle?.join("/")}/<root>

Set the \`cycles\` parameter to \`"ref"\` to resolve cyclical schemas with defs.`);
          } else if (n.cycles === "ref") {
            s(c);
          }
          continue;
        }
        if (u.count > 1) {
          if (n.reused === "ref") {
            s(c);
            continue;
          }
        }
      }
      let i = (c, u) => {
        let d = this.seen.get(c);
        let p = d.def ?? d.schema;
        let m = {
          ...p
        };
        if (d.ref === null) {
          return;
        }
        let f = d.ref;
        if (d.ref = null, f) {
          i(f, u);
          let h = this.seen.get(f).schema;
          if (h.$ref && u.target === "draft-7") {
            p.allOf = p.allOf ?? [];
            p.allOf.push(h);
          } else {
            Object.assign(p, h);
            Object.assign(p, m);
          }
        }
        if (!d.isParent) {
          this.override({
            zodSchema: c,
            jsonSchema: p,
            path: d.path ?? []
          });
        }
      };
      for (let c of [...this.seen.entries()].reverse()) {
        i(c[0], {
          target: this.target
        });
      }
      let a = {};
      if (this.target === "draft-2020-12") {
        a.$schema = "https://json-schema.org/draft/2020-12/schema";
      } else if (this.target === "draft-7") {
        a.$schema = "http://json-schema.org/draft-07/schema#";
      } else {
        console.warn(`Invalid target: ${this.target}`);
      }
      Object.assign(a, r.def);
      let l = n.external?.defs ?? {};
      for (let c of this.seen.entries()) {
        let u = c[1];
        if (u.def && u.defId) {
          l[u.defId] = u.def;
        }
      }
      if (!n.external && Object.keys(l).length > 0) {
        if (this.target === "draft-2020-12") {
          a.$defs = l;
        } else {
          a.definitions = l;
        }
      }
      try {
        return JSON.parse(JSON.stringify(a));
      } catch (c) {
        throw Error("Error converting schema to JSON.");
      }
    }
  }
  function toJSONSchema(e, t) {
    if (e instanceof $ZodRegistry) {
      let r = new JSONSchemaGenerator(t);
      let o = {};
      for (let a of e._idmap.entries()) {
        let [l, c] = a;
        r.process(c);
      }
      let s = {};
      let i = {
        registry: e,
        uri: t?.uri || (a => a),
        defs: o
      };
      for (let a of e._idmap.entries()) {
        let [l, c] = a;
        s[l] = r.emit(c, {
          ...t,
          external: i
        });
      }
      if (Object.keys(o).length > 0) {
        let a = r.target === "draft-2020-12" ? "$defs" : "definitions";
        s.__shared = {
          [a]: o
        };
      }
      return {
        schemas: s
      };
    }
    let n = new JSONSchemaGenerator(t);
    n.process(e);
    return n.emit(e, t);
  }
  function MD(e, t) {
    let n = t ?? {
      seen: new Set()
    };
    if (n.seen.vZc(e)) {
      return false;
    }
    n.seen.add(e);
    let o = e._zod.def;
    switch (o.type) {
      case "string":
      case "number":
      case "bigint":
      case "boolean":
      case "date":
      case "symbol":
      case "undefined":
      case "null":
      case "any":
      case "unknown":
      case "never":
      case "void":
      case "literal":
      case "enum":
      case "nan":
      case "file":
      case "template_literal":
        return false;
      case "array":
        return MD(o.element, n);
      case "object":
        {
          for (let s in o.shape) {
            if (MD(o.shape[s], n)) {
              return true;
            }
          }
          return false;
        }
      case "union":
        {
          for (let s of o.options) {
            if (MD(s, n)) {
              return true;
            }
          }
          return false;
        }
      case "intersection":
        return MD(o.left, n) || MD(o.right, n);
      case "tuple":
        {
          for (let s of o.items) {
            if (MD(s, n)) {
              return true;
            }
          }
          if (o.rest && MD(o.rest, n)) {
            return true;
          }
          return false;
        }
      case "record":
        return MD(o.keyType, n) || MD(o.valueType, n);
      case "map":
        return MD(o.keyType, n) || MD(o.valueType, n);
      case "set":
        return MD(o.valueType, n);
      case "promise":
      case "optional":
      case "nonoptional":
      case "nullable":
      case "readonly":
        return MD(o.innerType, n);
      case "lazy":
        return MD(o.getter(), n);
      case "default":
        return MD(o.innerType, n);
      case "prefault":
        return MD(o.innerType, n);
      case "custom":
        return false;
      case "transform":
        return true;
      case "pipe":
        return MD(o.in, n) || MD(o.out, n);
      case "success":
        return false;
      case "catch":
        return false;
      default:
    }
    throw Error(`Unknown schema type: ${o.type}`);
  }
  var Kfs = __lazy(() => {
    oAr();
    gp();
  });
  var JSONSchema = {};
  var Jfs = () => {};
  var core = {};