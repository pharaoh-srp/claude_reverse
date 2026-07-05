    var bQu = async (e, t) => {
      let n = await zBr(e, t);
      n.message = n.message ?? n.Message;
      return n;
    };
    var KBr = (e, t) => {
      let n = (s, i) => Object.keys(s).find(a => a.toLowerCase() === i.toLowerCase());
      let r = s => {
        let i = s;
        if (typeof i === "number") {
          i = i.toString();
        }
        if (i.indexOf(",") >= 0) {
          i = i.split(",")[0];
        }
        if (i.indexOf(":") >= 0) {
          i = i.split(":")[0];
        }
        if (i.indexOf("#") >= 0) {
          i = i.split("#")[1];
        }
        return i;
      };
      let o = n(e.headers, "x-amzn-errortype");
      if (o !== undefined) {
        return r(e.headers[o]);
      }
      if (t && typeof t === "object") {
        let s = n(t, "code");
        if (s && t[s] !== undefined) {
          return r(t[s]);
        }
        if (t.__type !== undefined) {
          return r(t.__type);
        }
      }
    };
    class YBr extends SAe {
      settings;
      constructor(e) {
        super();
        this.settings = e;
      }
      async read(e, t) {
        return this._read(e, typeof t === "string" ? JSON.parse(t, _Qu) : await zBr(t, this.serdeContext));
      }
      readObject(e, t) {
        return this._read(e, t);
      }
      _read(e, t) {
        let n = t !== null && typeof t === "object";
        let r = oT.NormalizedSchema.of(e);
        if (r.isListSchema() && Array.isArray(t)) {
          let s = r.getValueSchema();
          let i = [];
          let a = !!r.getMergedTraits().sparse;
          for (let l of t) {
            if (a || l != null) {
              i.push(this._read(s, l));
            }
          }
          return i;
        } else if (r.isMapSchema() && n) {
          let s = r.getValueSchema();
          let i = {};
          let a = !!r.getMergedTraits().sparse;
          for (let [l, c] of Object.entries(t)) {
            if (a || c != null) {
              i[l] = this._read(s, c);
            }
          }
          return i;
        } else if (r.isStructSchema() && n) {
          let s = {};
          for (let [i, a] of r.structIterator()) {
            let l = this.settings.jsonName ? a.getMergedTraits().jsonName ?? i : i;
            let c = this._read(a, t[l]);
            if (c != null) {
              s[i] = c;
            }
          }
          return s;
        }
        if (r.isBlobSchema() && typeof t === "string") {
          return HNt.fromBase64(t);
        }
        let o = r.getMergedTraits().mediaType;
        if (r.isStringSchema() && typeof t === "string" && o) {
          if (o === "application/json" || o.endsWith("+json")) {
            return qN.LazyJsonString.from(t);
          }
        }
        if (r.isTimestampSchema() && t != null) {
          switch (_F.determineTimestampFormat(r, this.settings)) {
            case 5:
              return qN.parseRfc3339DateTimeWithOffset(t);
            case 6:
              return qN.parseRfc7231DateTime(t);
            case 7:
              return qN.parseEpochTimestamp(t);
            default:
              console.warn("Missing timestamp format, parsing value with Date constructor:", t);
              return new Date(t);
          }
        }
        if (r.isBigIntegerSchema() && (typeof t === "number" || typeof t === "string")) {
          return BigInt(t);
        }
        if (r.isBigDecimalSchema() && t != null) {
          if (t instanceof qN.NumericValue) {
            return t;
          }
          let s = t;
          if (s.type === "bigDecimal" && "string" in s) {
            return new qN.NumericValue(s.string, s.type);
          }
          return new qN.NumericValue(String(t), "bigDecimal");
        }
        if (r.isNumericSchema() && typeof t === "string") {
          switch (t) {
            case "Infinity":
              return 1 / 0;
            case "-Infinity":
              return -1 / 0;
            case "NaN":
              return NaN;
          }
        }
        if (r.isDocumentSchema()) {
          if (n) {
            let s = Array.isArray(t) ? [] : {};
            for (let [i, a] of Object.entries(t)) {
              if (a instanceof qN.NumericValue) {
                s[i] = a;
              } else {
                s[i] = this._read(r, a);
              }
            }
            return s;
          } else {
            return structuredClone(t);
          }
        }
        return t;
      }
    }
    var WHs = String.fromCharCode(925);
    class KHs {
      values = new Map();
      counter = 0;
      stage = 0;
      createReplacer() {
        if (this.stage === 1) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer already created.");
        }
        if (this.stage === 2) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer exhausted.");
        }
        this.stage = 1;
        return (e, t) => {
          if (t instanceof qN.NumericValue) {
            let n = `${WHs + "nv" + this.counter++}_` + t.string;
            this.values.set(`"${n}"`, t.string);
            return n;
          }
          if (typeof t === "bigint") {
            let n = t.toString();
            let r = `${WHs + "b" + this.counter++}_` + n;
            this.values.set(`"${r}"`, n);
            return r;
          }
          return t;
        };
      }
      replaceInJson(e) {
        if (this.stage === 0) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer not created yet.");
        }
        if (this.stage === 2) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer exhausted.");
        }
        if (this.stage = 2, this.counter === 0) {
          return e;
        }
        for (let [t, n] of this.values) {
          e = e.replace(t, n);
        }
        return e;
      }
    }
    class JBr extends SAe {
      settings;
      buffer;
      rootSchema;
      constructor(e) {
        super();
        this.settings = e;
      }
      write(e, t) {
        this.rootSchema = oT.NormalizedSchema.of(e);
        this.buffer = this._write(this.rootSchema, t);
      }
      writeDiscriminatedDocument(e, t) {
        if (this.write(e, t), typeof this.buffer === "object") {
          this.buffer.__type = oT.NormalizedSchema.of(e).getName(true);
        }
      }
      flush() {
        let {
          rootSchema: e
        } = this;
        if (this.rootSchema = undefined, e?.isStructSchema() || e?.isDocumentSchema()) {
          let t = new KHs();
          return t.replaceInJson(JSON.stringify(this.buffer, t.createReplacer(), 0));
        }
        return this.buffer;
      }
      _write(e, t, n) {
        let r = t !== null && typeof t === "object";
        let o = oT.NormalizedSchema.of(e);
        if (o.isListSchema() && Array.isArray(t)) {
          let s = o.getValueSchema();
          let i = [];
          let a = !!o.getMergedTraits().sparse;
          for (let l of t) {
            if (a || l != null) {
              i.push(this._write(s, l));
            }
          }
          return i;
        } else if (o.isMapSchema() && r) {
          let s = o.getValueSchema();
          let i = {};
          let a = !!o.getMergedTraits().sparse;
          for (let [l, c] of Object.entries(t)) {
            if (a || c != null) {
              i[l] = this._write(s, c);
            }
          }
          return i;
        } else if (o.isStructSchema() && r) {
          let s = {};
          for (let [i, a] of o.structIterator()) {
            let l = this.settings.jsonName ? a.getMergedTraits().jsonName ?? i : i;
            let c = this._write(a, t[i], o);
            if (c !== undefined) {
              s[l] = c;
            }
          }
          return s;
        }
        if (t === null && n?.isStructSchema()) {
          return;
        }
        if (o.isBlobSchema() && (t instanceof Uint8Array || typeof t === "string") || o.isDocumentSchema() && t instanceof Uint8Array) {
          if (o === this.rootSchema) {
            return t;
          }
          return (this.serdeContext?.base64Encoder ?? HNt.toBase64)(t);
        }
        if ((o.isTimestampSchema() || o.isDocumentSchema()) && t instanceof Date) {
          switch (_F.determineTimestampFormat(o, this.settings)) {
            case 5:
              return t.toISOString().replace(".000Z", "Z");
            case 6:
              return qN.dateToUtcString(t);
            case 7:
              return t.getTime() / 1000;
            default:
              console.warn("Missing timestamp format, using epoch seconds", t);
              return t.getTime() / 1000;
          }
        }
        if (o.isNumericSchema() && typeof t === "number") {
          if (Math.abs(t) === 1 / 0 || isNaN(t)) {
            return String(t);
          }
        }
        if (o.isStringSchema()) {
          if (typeof t > "u" && o.isIdempotencyToken()) {
            return qN.generateIdempotencyToken();
          }
          let s = o.getMergedTraits().mediaType;
          if (t != null && s) {
            if (s === "application/json" || s.endsWith("+json")) {
              return qN.LazyJsonString.from(t);
            }
          }
        }
        if (o.isDocumentSchema()) {
          if (r) {
            let s = Array.isArray(t) ? [] : {};
            for (let [i, a] of Object.entries(t)) {
              if (a instanceof qN.NumericValue) {
                s[i] = a;
              } else {
                s[i] = this._write(o, a);
              }
            }
            return s;
          } else {
            return structuredClone(t);
          }
        }
        return t;
      }
    }
    class jbn extends SAe {
      settings;
      constructor(e) {
        super();
        this.settings = e;
      }
      createSerializer() {
        let e = new JBr(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
      createDeserializer() {
        let e = new YBr(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
    }
    class qbn extends _F.RpcProtocol {
      serializer;
      deserializer;
      serviceTarget;
      codec;
      mixin;
      awsQueryCompatible;
      constructor({
        defaultNamespace: e,
        serviceTarget: t,
        awsQueryCompatible: n
      }) {
        super({
          defaultNamespace: e
        });
        this.serviceTarget = t;
        this.codec = new jbn({
          timestampFormat: {
            useTrait: true,
            default: 7
          },
          jsonName: false
        });
        this.serializer = this.codec.createSerializer();
        this.deserializer = this.codec.createDeserializer();
        this.awsQueryCompatible = !!n;
        this.mixin = new Ert(this.awsQueryCompatible);
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        if (!r.path.endsWith("/")) {
          r.path += "/";
        }
        if (Object.assign(r.headers, {
          "content-type": `application/x-amz-json-${this.getJsonRpcVersion()}`,
          "x-amz-target": `${this.serviceTarget}.${e.name}`
        }), this.awsQueryCompatible) {
          r.headers["x-amzn-query-mode"] = "true";
        }
        if (oT.deref(e.input) === "unit" || !r.body) {
          r.body = "{}";
        }
        return r;
      }
      getPayloadCodec() {
        return this.codec;
      }
      async handleError(e, t, n, r, o) {
        if (this.awsQueryCompatible) {
          this.mixin.setQueryCompatError(r, n);
        }
        let s = KBr(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = oT.NormalizedSchema.of(i);
        let c = r.message ?? r.Message ?? "Unknown";
        let d = new (oT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          let h = f.getMergedTraits().jsonName ?? m;
          p[m] = this.codec.createDeserializer().readObject(f, r[h]);
        }
        if (this.awsQueryCompatible) {
          this.mixin.queryCompatOutput(r, p);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
    }
    class YHs extends qbn {
      constructor({
        defaultNamespace: e,
        serviceTarget: t,
        awsQueryCompatible: n
      }) {
        super({
          defaultNamespace: e,
          serviceTarget: t,
          awsQueryCompatible: n
        });
      }
      getShapeId() {
        return "aws.protocols#awsJson1_0";
      }
      getJsonRpcVersion() {
        return "1.0";
      }
      getDefaultContentType() {
        return "application/x-amz-json-1.0";
      }
    }
    class JHs extends qbn {
      constructor({
        defaultNamespace: e,
        serviceTarget: t,
        awsQueryCompatible: n
      }) {
        super({
          defaultNamespace: e,
          serviceTarget: t,
          awsQueryCompatible: n
        });
      }
      getShapeId() {
        return "aws.protocols#awsJson1_1";
      }
      getJsonRpcVersion() {
        return "1.1";
      }
      getDefaultContentType() {
        return "application/x-amz-json-1.1";
      }
    }
    class XHs extends _F.HttpBindingProtocol {
      serializer;
      deserializer;
      codec;
      mixin = new Ert();
      constructor({
        defaultNamespace: e
      }) {
        super({
          defaultNamespace: e
        });
        let t = {
          timestampFormat: {
            useTrait: true,
            default: 7
          },
          httpBindings: true,
          jsonName: true
        };
        this.codec = new jbn(t);
        this.serializer = new _F.HttpInterceptingShapeSerializer(this.codec.createSerializer(), t);
        this.deserializer = new _F.HttpInterceptingShapeDeserializer(this.codec.createDeserializer(), t);
      }
      getShapeId() {
        return "aws.protocols#restJson1";
      }
      getPayloadCodec() {
        return this.codec;
      }
      setSerdeContext(e) {
        this.codec.setSerdeContext(e);
        super.setSerdeContext(e);
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        let o = oT.NormalizedSchema.of(e.input);
        if (!r.headers["content-type"]) {
          let s = this.mixin.resolveRestContentType(this.getDefaultContentType(), o);
          if (s) {
            r.headers["content-type"] = s;
          }
        }
        if (r.body == null && r.headers["content-type"] === this.getDefaultContentType()) {
          r.body = "{}";
        }
        return r;
      }
      async deserializeResponse(e, t, n) {
        let r = await super.deserializeResponse(e, t, n);
        let o = oT.NormalizedSchema.of(e.output);
        for (let [s, i] of o.structIterator()) {
          if (i.getMemberTraits().httpPayload && !(s in r)) {
            r[s] = null;
          }
        }
        return r;
      }
      async handleError(e, t, n, r, o) {
        let s = KBr(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = oT.NormalizedSchema.of(i);
        let c = r.message ?? r.Message ?? "Unknown";
        let d = new (oT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        await this.deserializeHttpMessage(i, t, n, r);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          let h = f.getMergedTraits().jsonName ?? m;
          p[m] = this.codec.createDeserializer().readObject(f, r[h]);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
      getDefaultContentType() {
        return "application/json";
      }
    }
    var SQu = e => {
      if (e == null) {
        return;
      }
      if (typeof e === "object" && "__type" in e) {
        delete e.__type;
      }
      return n_e.expectUnion(e);
    };
    class Wbn extends SAe {
      settings;
      stringDeserializer;
      constructor(e) {
        super();
        this.settings = e;
        this.stringDeserializer = new _F.FromStringShapeDeserializer(e);
      }
      setSerdeContext(e) {
        this.serdeContext = e;
        this.stringDeserializer.setSerdeContext(e);
      }
      read(e, t, n) {
        let r = oT.NormalizedSchema.of(e);
        let o = r.getMemberSchemas();
        if (r.isStructSchema() && r.isMemberSchema() && !!Object.values(o).find(l => !!l.getMemberTraits().eventPayload)) {
          let l = {};
          let c = Object.keys(o)[0];
          if (o[c].isBlobSchema()) {
            l[c] = t;
          } else {
            l[c] = this.read(o[c], t);
          }
          return l;
        }
        let i = (this.serdeContext?.utf8Encoder ?? GHs.toUtf8)(t);
        let a = this.parseXml(i);
        return this.readSchema(e, n ? a[n] : a);
      }
      readSchema(e, t) {
        let n = oT.NormalizedSchema.of(e);
        if (n.isUnitSchema()) {
          return;
        }
        let r = n.getMergedTraits();
        if (n.isListSchema() && !Array.isArray(t)) {
          return this.readSchema(n, [t]);
        }
        if (t == null) {
          return t;
        }
        if (typeof t === "object") {
          let o = !!r.sparse;
          let s = !!r.xmlFlattened;
          if (n.isListSchema()) {
            let a = n.getValueSchema();
            let l = [];
            let c = a.getMergedTraits().xmlName ?? "member";
            let u = s ? t : (t[0] ?? t)[c];
            let d = Array.isArray(u) ? u : [u];
            for (let p of d) {
              if (p != null || o) {
                l.push(this.readSchema(a, p));
              }
            }
            return l;
          }
          let i = {};
          if (n.isMapSchema()) {
            let a = n.getKeySchema();
            let l = n.getValueSchema();
            let c;
            if (s) {
              c = Array.isArray(t) ? t : [t];
            } else {
              c = Array.isArray(t.entry) ? t.entry : [t.entry];
            }
            let u = a.getMergedTraits().xmlName ?? "key";
            let d = l.getMergedTraits().xmlName ?? "value";
            for (let p of c) {
              let m = p[u];
              let f = p[d];
              if (f != null || o) {
                i[m] = this.readSchema(l, f);
              }
            }
            return i;
          }
          if (n.isStructSchema()) {
            for (let [a, l] of n.structIterator()) {
              let c = l.getMergedTraits();
              let u = !c.httpPayload ? l.getMemberTraits().xmlName ?? a : c.xmlName ?? l.getName();
              if (t[u] != null) {
                i[a] = this.readSchema(l, t[u]);
              }
            }
            return i;
          }
          if (n.isDocumentSchema()) {
            return t;
          }
          throw Error(`@aws-sdk/core/protocols - xml deserializer unhandled schema type for ${n.getName(true)}`);
        }
        if (n.isListSchema()) {
          return [];
        }
        if (n.isMapSchema() || n.isStructSchema()) {
          return {};
        }
        return this.stringDeserializer.read(n, t);
      }
      parseXml(e) {
        if (e.length) {
          let t;
          try {
            t = vY.parseXML(e);
          } catch (s) {
            if (s && typeof s === "object") {
              Object.defineProperty(s, "$responseBodyText", {
                value: e
              });
            }
            throw s;
          }
          let n = "#text";
          let r = Object.keys(t)[0];
          let o = t[r];
          if (o[n]) {
            o[r] = o[n];
            delete o[n];
          }
          return n_e.getValueFromTextNode(o);
        }
        return {};
      }
    }
    class QHs extends SAe {
      settings;
      buffer;
      constructor(e) {
        super();
        this.settings = e;
      }
      write(e, t, n = "") {
        if (this.buffer === undefined) {
          this.buffer = "";
        }
        let r = oT.NormalizedSchema.of(e);
        if (n && !n.endsWith(".")) {
          n += ".";
        }
        if (r.isBlobSchema()) {
          if (typeof t === "string" || t instanceof Uint8Array) {
            this.writeKey(n);
            this.writeValue((this.serdeContext?.base64Encoder ?? HNt.toBase64)(t));
          }
        } else if (r.isBooleanSchema() || r.isNumericSchema() || r.isStringSchema()) {
          if (t != null) {
            this.writeKey(n);
            this.writeValue(String(t));
          } else if (r.isIdempotencyToken()) {
            this.writeKey(n);
            this.writeValue(qN.generateIdempotencyToken());
          }
        } else if (r.isBigIntegerSchema()) {
          if (t != null) {
            this.writeKey(n);
            this.writeValue(String(t));
          }
        } else if (r.isBigDecimalSchema()) {
          if (t != null) {
            this.writeKey(n);
            this.writeValue(t instanceof qN.NumericValue ? t.string : String(t));
          }
        } else if (r.isTimestampSchema()) {
          if (t instanceof Date) {
            switch (this.writeKey(n), _F.determineTimestampFormat(r, this.settings)) {
              case 5:
                this.writeValue(t.toISOString().replace(".000Z", "Z"));
                break;
              case 6:
                this.writeValue(n_e.dateToUtcString(t));
                break;
              case 7:
                this.writeValue(String(t.getTime() / 1000));
                break;
            }
          }
        } else if (r.isDocumentSchema()) {
          throw Error(`@aws-sdk/core/protocols - QuerySerializer unsupported document type ${r.getName(true)}`);
        } else if (r.isListSchema()) {
          if (Array.isArray(t)) {
            if (t.length === 0) {
              if (this.settings.serializeEmptyLists) {
                this.writeKey(n);
                this.writeValue("");
              }
            } else {
              let o = r.getValueSchema();
              let s = this.settings.flattenLists || r.getMergedTraits().xmlFlattened;
              let i = 1;
              for (let a of t) {
                if (a == null) {
                  continue;
                }
                let l = this.getKey("member", o.getMergedTraits().xmlName);
                let c = s ? `${n}${i}` : `${n}${l}.${i}`;
                this.write(o, a, c);
                ++i;
              }
            }
          }
        } else if (r.isMapSchema()) {
          if (t && typeof t === "object") {
            let o = r.getKeySchema();
            let s = r.getValueSchema();
            let i = r.getMergedTraits().xmlFlattened;
            let a = 1;
            for (let [l, c] of Object.entries(t)) {
              if (c == null) {
                continue;
              }
              let u = this.getKey("key", o.getMergedTraits().xmlName);
              let d = i ? `${n}${a}.${u}` : `${n}entry.${a}.${u}`;
              let p = this.getKey("value", s.getMergedTraits().xmlName);
              let m = i ? `${n}${a}.${p}` : `${n}entry.${a}.${p}`;
              this.write(o, l, d);
              this.write(s, c, m);
              ++a;
            }
          }
        } else if (r.isStructSchema()) {
          if (t && typeof t === "object") {
            for (let [o, s] of r.structIterator()) {
              if (t[o] == null && !s.isIdempotencyToken()) {
                continue;
              }
              let i = this.getKey(o, s.getMergedTraits().xmlName);
              let a = `${n}${i}`;
              this.write(s, t[o], a);
            }
          }
        } else if (r.isUnitSchema()) {
          ;
        } else {
          throw Error(`@aws-sdk/core/protocols - QuerySerializer unrecognized schema type ${r.getName(true)}`);
        }
      }
      flush() {
        if (this.buffer === undefined) {
          throw Error("@aws-sdk/core/protocols - QuerySerializer cannot flush with nothing written to buffer.");
        }
        let e = this.buffer;
        delete this.buffer;
        return e;
      }
      getKey(e, t) {
        let n = t ?? e;
        if (this.settings.capitalizeKeys) {
          return n[0].toUpperCase() + n.slice(1);
        }
        return n;
      }
      writeKey(e) {
        if (e.endsWith(".")) {
          e = e.slice(0, e.length - 1);
        }
        this.buffer += `&${_F.extendedEncodeURIComponent(e)}=`;
      }
      writeValue(e) {
        this.buffer += _F.extendedEncodeURIComponent(e);
      }
    }
    class XBr extends _F.RpcProtocol {
      options;
      serializer;
      deserializer;
      mixin = new Ert();
      constructor(e) {
        super({
          defaultNamespace: e.defaultNamespace
        });
        this.options = e;
        let t = {
          timestampFormat: {
            useTrait: true,
            default: 5
          },
          httpBindings: false,
          xmlNamespace: e.xmlNamespace,
          serviceNamespace: e.defaultNamespace,
          serializeEmptyLists: true
        };
        this.serializer = new QHs(t);
        this.deserializer = new Wbn(t);
      }
      getShapeId() {
        return "aws.protocols#awsQuery";
      }
      setSerdeContext(e) {
        this.serializer.setSerdeContext(e);
        this.deserializer.setSerdeContext(e);
      }
      getPayloadCodec() {
        throw Error("AWSQuery protocol has no payload codec.");
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        if (!r.path.endsWith("/")) {
          r.path += "/";
        }
        if (Object.assign(r.headers, {
          "content-type": "application/x-www-form-urlencoded"
        }), oT.deref(e.input) === "unit" || !r.body) {
          r.body = "";
        }
        let o = e.name.split("#")[1] ?? e.name;
        if (r.body = `Action=${o}&Version=${this.options.version}` + r.body, r.body.endsWith("&")) {
          r.body = r.body.slice(-1);
        }
        return r;
      }
      async deserializeResponse(e, t, n) {
        let r = this.deserializer;
        let o = oT.NormalizedSchema.of(e.output);
        let s = {};
        if (n.statusCode >= 300) {
          let u = await _F.collectBody(n.body, t);
          if (u.byteLength > 0) {
            Object.assign(s, await r.read(15, u));
          }
          await this.handleError(e, t, n, s, this.deserializeMetadata(n));
        }
        for (let u in n.headers) {
          let d = n.headers[u];
          delete n.headers[u];
          n.headers[u.toLowerCase()] = d;
        }
        let i = e.name.split("#")[1] ?? e.name;
        let a = o.isStructSchema() && this.useNestedResult() ? i + "Result" : undefined;
        let l = await _F.collectBody(n.body, t);
        if (l.byteLength > 0) {
          Object.assign(s, await r.read(o, l, a));
        }
        return {
          $metadata: this.deserializeMetadata(n),
          ...s
        };
      }
      useNestedResult() {
        return true;
      }
      async handleError(e, t, n, r, o) {
        let s = this.loadQueryErrorCode(n, r) ?? "Unknown";
        let i = this.loadQueryError(r);
        let a = this.loadQueryErrorMessage(r);
        i.message = a;
        i.Error = {
          Type: i.Type,
          Code: i.Code,
          Message: a
        };
        let {
          errorSchema: l,
          errorMetadata: c
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, i, o, (f, h) => {
          try {
            return f.getSchema(h);
          } catch (g) {
            return f.find(y => oT.NormalizedSchema.of(y).getMergedTraits().awsQueryError?.[0] === h);
          }
        });
        let u = oT.NormalizedSchema.of(l);
        let p = new (oT.TypeRegistry.for(l[1]).getErrorCtor(l) ?? Error)(a);
        let m = {
          Error: i.Error
        };
        for (let [f, h] of u.structIterator()) {
          let g = h.getMergedTraits().xmlName ?? f;
          let y = i[g] ?? r[g];
          m[f] = this.deserializer.readSchema(h, y);
        }
        throw this.mixin.decorateServiceException(Object.assign(p, c, {
          $fault: u.getMergedTraits().error,
          message: a
        }, m), r);
      }
      loadQueryErrorCode(e, t) {
        let n = (t.Errors?.[0]?.Error ?? t.Errors?.Error ?? t.Error)?.Code;
        if (n !== undefined) {
          return n;
        }
        if (e.statusCode == 404) {
          return "NotFound";
        }
      }
      loadQueryError(e) {
        return e.Errors?.[0]?.Error ?? e.Errors?.Error ?? e.Error;
      }
      loadQueryErrorMessage(e) {
        let t = this.loadQueryError(e);
        return t?.message ?? t?.Message ?? e.message ?? e.Message ?? "Unknown";
      }
      getDefaultContentType() {
        return "application/x-www-form-urlencoded";
      }
    }
    class ZHs extends XBr {
      options;
      constructor(e) {
        super(e);
        this.options = e;
        let t = {
          capitalizeKeys: true,
          flattenLists: true,
          serializeEmptyLists: false
        };
        Object.assign(this.serializer.settings, t);
      }
      useNestedResult() {
        return false;
      }
    }
    var ejs = (e, t) => zHs(e, t).then(n => {
      if (n.length) {
        let r;
        try {
          r = vY.parseXML(n);
        } catch (a) {
          if (a && typeof a === "object") {
            Object.defineProperty(a, "$responseBodyText", {
              value: n
            });
          }
          throw a;
        }
        let o = "#text";
        let s = Object.keys(r)[0];
        let i = r[s];
        if (i[o]) {
          i[s] = i[o];
          delete i[o];
        }
        return n_e.getValueFromTextNode(i);
      }
      return {};
    });
    var TQu = async (e, t) => {
      let n = await ejs(e, t);
      if (n.Error) {
        n.Error.message = n.Error.message ?? n.Error.Message;
      }
      return n;
    };
    var tjs = (e, t) => {
      if (t?.Error?.Code !== undefined) {
        return t.Error.Code;
      }
      if (t?.Code !== undefined) {
        return t.Code;
      }
      if (e.statusCode == 404) {
        return "NotFound";
      }
    };
    class QBr extends SAe {
      settings;
      stringBuffer;
      byteBuffer;
      buffer;
      constructor(e) {
        super();
        this.settings = e;
      }
      write(e, t) {
        let n = oT.NormalizedSchema.of(e);
        if (n.isStringSchema() && typeof t === "string") {
          this.stringBuffer = t;
        } else if (n.isBlobSchema()) {
          this.byteBuffer = "byteLength" in t ? t : (this.serdeContext?.base64Decoder ?? HNt.fromBase64)(t);
        } else {
          this.buffer = this.writeStruct(n, t, undefined);
          let r = n.getMergedTraits();
          if (r.httpPayload && !r.xmlName) {
            this.buffer.withName(n.getName());
          }
        }
      }
      flush() {
        if (this.byteBuffer !== undefined) {
          let t = this.byteBuffer;
          delete this.byteBuffer;
          return t;
        }
        if (this.stringBuffer !== undefined) {
          let t = this.stringBuffer;
          delete this.stringBuffer;
          return t;
        }
        let e = this.buffer;
        if (this.settings.xmlNamespace) {
          if (!e?.attributes?.xmlns) {
            e.addAttribute("xmlns", this.settings.xmlNamespace);
          }
        }
        delete this.buffer;
        return e.toString();
      }
      writeStruct(e, t, n) {
        let r = e.getMergedTraits();
        let o = e.isMemberSchema() && !r.httpPayload ? e.getMemberTraits().xmlName ?? e.getMemberName() : r.xmlName ?? e.getName();
        if (!o || !e.isStructSchema()) {
          throw Error(`@aws-sdk/core/protocols - xml serializer, cannot write struct with empty name or non-struct, schema=${e.getName(true)}.`);
        }
        let s = vY.XmlNode.of(o);
        let [i, a] = this.getXmlnsAttribute(e, n);
        for (let [l, c] of e.structIterator()) {
          let u = t[l];
          if (u != null || c.isIdempotencyToken()) {
            if (c.getMergedTraits().xmlAttribute) {
              s.addAttribute(c.getMergedTraits().xmlName ?? l, this.writeSimple(c, u));
              continue;
            }
            if (c.isListSchema()) {
              this.writeList(c, u, s, a);
            } else if (c.isMapSchema()) {
              this.writeMap(c, u, s, a);
            } else if (c.isStructSchema()) {
              s.addChildNode(this.writeStruct(c, u, a));
            } else {
              let d = vY.XmlNode.of(c.getMergedTraits().xmlName ?? c.getMemberName());
              this.writeSimpleInto(c, u, d, a);
              s.addChildNode(d);
            }
          }
        }
        if (a) {
          s.addAttribute(i, a);
        }
        return s;
      }
      writeList(e, t, n, r) {
        if (!e.isMemberSchema()) {
          throw Error(`@aws-sdk/core/protocols - xml serializer, cannot write non-member list: ${e.getName(true)}`);
        }
        let o = e.getMergedTraits();
        let s = e.getValueSchema();
        let i = s.getMergedTraits();
        let a = !!i.sparse;
        let l = !!o.xmlFlattened;
        let [c, u] = this.getXmlnsAttribute(e, r);
        let d = (p, m) => {
          if (s.isListSchema()) {
            this.writeList(s, Array.isArray(m) ? m : [m], p, u);
          } else if (s.isMapSchema()) {
            this.writeMap(s, m, p, u);
          } else if (s.isStructSchema()) {
            let f = this.writeStruct(s, m, u);
            p.addChildNode(f.withName(l ? o.xmlName ?? e.getMemberName() : i.xmlName ?? "member"));
          } else {
            let f = vY.XmlNode.of(l ? o.xmlName ?? e.getMemberName() : i.xmlName ?? "member");
            this.writeSimpleInto(s, m, f, u);
            p.addChildNode(f);
          }
        };
        if (l) {
          for (let p of t) {
            if (a || p != null) {
              d(n, p);
            }
          }
        } else {
          let p = vY.XmlNode.of(o.xmlName ?? e.getMemberName());
          if (u) {
            p.addAttribute(c, u);
          }
          for (let m of t) {
            if (a || m != null) {
              d(p, m);
            }
          }
          n.addChildNode(p);
        }
      }
      writeMap(e, t, n, r, o = false) {
        if (!e.isMemberSchema()) {
          throw Error(`@aws-sdk/core/protocols - xml serializer, cannot write non-member map: ${e.getName(true)}`);
        }
        let s = e.getMergedTraits();
        let i = e.getKeySchema();
        let l = i.getMergedTraits().xmlName ?? "key";
        let c = e.getValueSchema();
        let u = c.getMergedTraits();
        let d = u.xmlName ?? "value";
        let p = !!u.sparse;
        let m = !!s.xmlFlattened;
        let [f, h] = this.getXmlnsAttribute(e, r);
        let g = (y, _, b) => {
          let S = vY.XmlNode.of(l, _);
          let [E, C] = this.getXmlnsAttribute(i, h);
          if (C) {
            S.addAttribute(E, C);
          }
          y.addChildNode(S);
          let x = vY.XmlNode.of(d);
          if (c.isListSchema()) {
            this.writeList(c, b, x, h);
          } else if (c.isMapSchema()) {
            this.writeMap(c, b, x, h, true);
          } else if (c.isStructSchema()) {
            x = this.writeStruct(c, b, h);
          } else {
            this.writeSimpleInto(c, b, x, h);
          }
          y.addChildNode(x);
        };
        if (m) {
          for (let [y, _] of Object.entries(t)) {
            if (p || _ != null) {
              let b = vY.XmlNode.of(s.xmlName ?? e.getMemberName());
              g(b, y, _);
              n.addChildNode(b);
            }
          }
        } else {
          let y;
          if (!o) {
            if (y = vY.XmlNode.of(s.xmlName ?? e.getMemberName()), h) {
              y.addAttribute(f, h);
            }
            n.addChildNode(y);
          }
          for (let [_, b] of Object.entries(t)) {
            if (p || b != null) {
              let S = vY.XmlNode.of("entry");
              g(S, _, b);
              (o ? n : y).addChildNode(S);
            }
          }
        }
      }
      writeSimple(e, t) {
        if (t === null) {
          throw Error("@aws-sdk/core/protocols - (XML serializer) cannot write null value.");
        }
        let n = oT.NormalizedSchema.of(e);
        let r = null;
        if (t && typeof t === "object") {
          if (n.isBlobSchema()) {
            r = (this.serdeContext?.base64Encoder ?? HNt.toBase64)(t);
          } else if (n.isTimestampSchema() && t instanceof Date) {
            switch (_F.determineTimestampFormat(n, this.settings)) {
              case 5:
                r = t.toISOString().replace(".000Z", "Z");
                break;
              case 6:
                r = n_e.dateToUtcString(t);
                break;
              case 7:
                r = String(t.getTime() / 1000);
                break;
              default:
                console.warn("Missing timestamp format, using http date", t);
                r = n_e.dateToUtcString(t);
                break;
            }
          } else if (n.isBigDecimalSchema() && t) {
            if (t instanceof qN.NumericValue) {
              return t.string;
            }
            return String(t);
          } else if (n.isMapSchema() || n.isListSchema()) {
            throw Error("@aws-sdk/core/protocols - xml serializer, cannot call _write() on List/Map schema, call writeList or writeMap() instead.");
          } else {
            throw Error(`@aws-sdk/core/protocols - xml serializer, unhandled schema type for object value and schema: ${n.getName(true)}`);
          }
        }
        if (n.isBooleanSchema() || n.isNumericSchema() || n.isBigIntegerSchema() || n.isBigDecimalSchema()) {
          r = String(t);
        }
        if (n.isStringSchema()) {
          if (t === undefined && n.isIdempotencyToken()) {
            r = qN.generateIdempotencyToken();
          } else {
            r = String(t);
          }
        }
        if (r === null) {
          throw Error(`Unhandled schema-value pair ${n.getName(true)}=${t}`);
        }
        return r;
      }
      writeSimpleInto(e, t, n, r) {
        let o = this.writeSimple(e, t);
        let s = oT.NormalizedSchema.of(e);
        let i = new vY.XmlText(o);
        let [a, l] = this.getXmlnsAttribute(s, r);
        if (l) {
          n.addAttribute(a, l);
        }
        n.addChildNode(i);
      }
      getXmlnsAttribute(e, t) {
        let n = e.getMergedTraits();
        let [r, o] = n.xmlNamespace ?? [];
        if (o && o !== t) {
          return [r ? `xmlns:${r}` : "xmlns", o];
        }
        return [undefined, undefined];
      }
    }
    class ZBr extends SAe {
      settings;
      constructor(e) {
        super();
        this.settings = e;
      }
      createSerializer() {
        let e = new QBr(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
      createDeserializer() {
        let e = new Wbn(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
    }
    class njs extends _F.HttpBindingProtocol {
      codec;
      serializer;
      deserializer;
      mixin = new Ert();
      constructor(e) {
        super(e);
        let t = {
          timestampFormat: {
            useTrait: true,
            default: 5
          },
          httpBindings: true,
          xmlNamespace: e.xmlNamespace,
          serviceNamespace: e.defaultNamespace
        };
        this.codec = new ZBr(t);
        this.serializer = new _F.HttpInterceptingShapeSerializer(this.codec.createSerializer(), t);
        this.deserializer = new _F.HttpInterceptingShapeDeserializer(this.codec.createDeserializer(), t);
      }
      getPayloadCodec() {
        return this.codec;
      }
      getShapeId() {
        return "aws.protocols#restXml";
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        let o = oT.NormalizedSchema.of(e.input);
        if (!r.headers["content-type"]) {
          let s = this.mixin.resolveRestContentType(this.getDefaultContentType(), o);
          if (s) {
            r.headers["content-type"] = s;
          }
        }
        if (r.headers["content-type"] === this.getDefaultContentType()) {
          if (typeof r.body === "string") {
            r.body = '<?xml version="1.0" encoding="UTF-8"?>' + r.body;
          }
        }
        return r;
      }
      async deserializeResponse(e, t, n) {
        return super.deserializeResponse(e, t, n);
      }
      async handleError(e, t, n, r, o) {
        let s = tjs(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = oT.NormalizedSchema.of(i);
        let c = r.Error?.message ?? r.Error?.Message ?? r.message ?? r.Message ?? "Unknown";
        let d = new (oT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        await this.deserializeHttpMessage(i, t, n, r);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          let h = f.getMergedTraits().xmlName ?? m;
          let g = r.Error?.[h] ?? r[h];
          p[m] = this.codec.createDeserializer().readSchema(f, g);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
      getDefaultContentType() {
        return "application/xml";
      }
    }
    CC.AwsEc2QueryProtocol = ZHs;
    CC.AwsJson1_0Protocol = YHs;
    CC.AwsJson1_1Protocol = JHs;
    CC.AwsJsonRpcProtocol = qbn;
    CC.AwsQueryProtocol = XBr;
    CC.AwsRestJsonProtocol = XHs;
    CC.AwsRestXmlProtocol = njs;
    CC.AwsSmithyRpcV2CborProtocol = VHs;
    CC.JsonCodec = jbn;
    CC.JsonShapeDeserializer = YBr;
    CC.JsonShapeSerializer = JBr;
    CC.XmlCodec = ZBr;
    CC.XmlShapeDeserializer = Wbn;
    CC.XmlShapeSerializer = QBr;
    CC._toBool = gQu;
    CC._toNum = yQu;
    CC._toStr = hQu;
    CC.awsExpectUnion = SQu;
    CC.loadRestJsonErrorCode = KBr;
    CC.loadRestXmlErrorCode = tjs;
    CC.parseJsonBody = zBr;
    CC.parseJsonErrorBody = bQu;
    CC.parseXmlBody = ejs;
    CC.parseXmlErrorBody = TQu;
  });