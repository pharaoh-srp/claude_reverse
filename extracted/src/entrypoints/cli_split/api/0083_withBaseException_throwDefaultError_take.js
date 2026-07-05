  var tw = __commonJS(Ij => {
    var G_n = TFr();
    var TY = qT();
    var SY = yW();
    var xNt = yNt();
    var V_n = jFr();
    var qFr = jT();
    var Lje = async (e = new Uint8Array(), t) => {
      if (e instanceof Uint8Array) {
        return G_n.Uint8ArrayBlobAdapter.mutate(e);
      }
      if (!e) {
        return G_n.Uint8ArrayBlobAdapter.mutate(new Uint8Array());
      }
      let n = t.streamCollector(e);
      return G_n.Uint8ArrayBlobAdapter.mutate(await n);
    };
    function kNt(e) {
      return encodeURIComponent(e).replace(/[!'()*]/g, function (t) {
        return "%" + t.charCodeAt(0).toString(16).toUpperCase();
      });
    }
    class lrt {
      serdeContext;
      setSerdeContext(e) {
        this.serdeContext = e;
      }
    }
    class z_n extends lrt {
      options;
      constructor(e) {
        super();
        this.options = e;
      }
      getRequestType() {
        return xNt.HttpRequest;
      }
      getResponseType() {
        return xNt.HttpResponse;
      }
      setSerdeContext(e) {
        if (this.serdeContext = e, this.serializer.setSerdeContext(e), this.deserializer.setSerdeContext(e), this.getPayloadCodec()) {
          this.getPayloadCodec().setSerdeContext(e);
        }
      }
      updateServiceEndpoint(e, t) {
        if ("url" in t) {
          if (e.protocol = t.url.protocol, e.hostname = t.url.hostname, e.port = t.url.port ? Number(t.url.port) : undefined, e.path = t.url.pathname, e.fragment = t.url.hash || undefined, e.username = t.url.username || undefined, e.password = t.url.password || undefined, !e.query) {
            e.query = {};
          }
          for (let [n, r] of t.url.searchParams.entries()) {
            e.query[n] = r;
          }
          return e;
        } else {
          e.protocol = t.protocol;
          e.hostname = t.hostname;
          e.port = t.port ? Number(t.port) : undefined;
          e.path = t.path;
          e.query = {
            ...t.query
          };
          return e;
        }
      }
      setHostPrefix(e, t, n) {
        let r = TY.NormalizedSchema.of(t.input);
        let o = TY.translateTraits(t.traits ?? {});
        if (o.endpoint) {
          let s = o.endpoint?.[0];
          if (typeof s === "string") {
            let i = [...r.structIterator()].filter(([, a]) => a.getMergedTraits().hostLabel);
            for (let [a] of i) {
              let l = n[a];
              if (typeof l !== "string") {
                throw Error(`@smithy/core/schema - ${a} in input must be a string as hostLabel.`);
              }
              s = s.replace(`{${a}}`, l);
            }
            e.hostname = s + e.hostname;
          }
        }
      }
      deserializeMetadata(e) {
        return {
          httpStatusCode: e.statusCode,
          requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
          extendedRequestId: e.headers["x-amz-id-2"],
          cfId: e.headers["x-amz-cf-id"]
        };
      }
      async serializeEventStream({
        eventStream: e,
        requestSchema: t,
        initialRequest: n
      }) {
        return (await this.loadEventStreamCapability()).serializeEventStream({
          eventStream: e,
          requestSchema: t,
          initialRequest: n
        });
      }
      async deserializeEventStream({
        response: e,
        responseSchema: t,
        initialResponseContainer: n
      }) {
        return (await this.loadEventStreamCapability()).deserializeEventStream({
          response: e,
          responseSchema: t,
          initialResponseContainer: n
        });
      }
      async loadEventStreamCapability() {
        let {
          EventStreamSerde: e
        } = await Promise.resolve().then(() => __toESM(fFs()));
        return new e({
          marshaller: this.getEventStreamMarshaller(),
          serializer: this.serializer,
          deserializer: this.deserializer,
          serdeContext: this.serdeContext,
          defaultContentType: this.getDefaultContentType()
        });
      }
      getDefaultContentType() {
        throw Error(`@smithy/core/protocols - ${this.constructor.name} getDefaultContentType() implementation missing.`);
      }
      async deserializeHttpMessage(e, t, n, r, o) {
        return [];
      }
      getEventStreamMarshaller() {
        let e = this.serdeContext;
        if (!e.eventStreamMarshaller) {
          throw Error("@smithy/core - HttpProtocol: eventStreamMarshaller missing in serdeContext.");
        }
        return e.eventStreamMarshaller;
      }
    }
    class hFs extends z_n {
      async serializeRequest(e, t, n) {
        let r = {
          ...(t ?? {})
        };
        let o = this.serializer;
        let s = {};
        let i = {};
        let a = await n.endpoint();
        let l = TY.NormalizedSchema.of(e?.input);
        let c = l.getSchema();
        let u = false;
        let d;
        let p = new xNt.HttpRequest({
          protocol: "",
          hostname: "",
          port: undefined,
          path: "",
          fragment: undefined,
          query: s,
          headers: i,
          body: undefined
        });
        if (a) {
          this.updateServiceEndpoint(p, a);
          this.setHostPrefix(p, e, r);
          let m = TY.translateTraits(e.traits);
          if (m.http) {
            p.method = m.http[0];
            let [f, h] = m.http[1].split("?");
            if (p.path == "/") {
              p.path = f;
            } else {
              p.path += f;
            }
            let g = new URLSearchParams(h ?? "");
            Object.assign(s, Object.fromEntries(g));
          }
        }
        for (let [m, f] of l.structIterator()) {
          let h = f.getMergedTraits() ?? {};
          let g = r[m];
          if (g == null && !f.isIdempotencyToken()) {
            continue;
          }
          if (h.httpPayload) {
            if (f.isStreaming()) {
              if (f.isStructSchema()) {
                if (r[m]) {
                  d = await this.serializeEventStream({
                    eventStream: r[m],
                    requestSchema: l
                  });
                }
              } else {
                d = g;
              }
            } else {
              o.write(f, g);
              d = o.flush();
            }
            delete r[m];
          } else if (h.httpLabel) {
            o.write(f, g);
            let y = o.flush();
            if (p.path.includes(`{${m}+}`)) {
              p.path = p.path.replace(`{${m}+}`, y.split("/").map(kNt).join("/"));
            } else if (p.path.includes(`{${m}}`)) {
              p.path = p.path.replace(`{${m}}`, kNt(y));
            }
            delete r[m];
          } else if (h.httpHeader) {
            o.write(f, g);
            i[h.httpHeader.toLowerCase()] = String(o.flush());
            delete r[m];
          } else if (typeof h.httpPrefixHeaders === "string") {
            for (let [y, _] of Object.entries(g)) {
              let b = h.httpPrefixHeaders + y;
              o.write([f.getValueSchema(), {
                httpHeader: b
              }], _);
              i[b.toLowerCase()] = o.flush();
            }
            delete r[m];
          } else if (h.httpQuery || h.httpQueryParams) {
            this.serializeQuery(f, g, s);
            delete r[m];
          } else {
            u = true;
          }
        }
        if (u && r) {
          o.write(c, r);
          d = o.flush();
        }
        p.headers = i;
        p.query = s;
        p.body = d;
        return p;
      }
      serializeQuery(e, t, n) {
        let r = this.serializer;
        let o = e.getMergedTraits();
        if (o.httpQueryParams) {
          for (let [s, i] of Object.entries(t)) {
            if (!(s in n)) {
              let a = e.getValueSchema();
              Object.assign(a.getMergedTraits(), {
                ...o,
                httpQuery: s,
                httpQueryParams: undefined
              });
              this.serializeQuery(a, i, n);
            }
          }
          return;
        }
        if (e.isListSchema()) {
          let s = !!e.getMergedTraits().sparse;
          let i = [];
          for (let a of t) {
            r.write([e.getValueSchema(), o], a);
            let l = r.flush();
            if (s || l !== undefined) {
              i.push(l);
            }
          }
          n[o.httpQuery] = i;
        } else {
          r.write([e, o], t);
          n[o.httpQuery] = r.flush();
        }
      }
      async deserializeResponse(e, t, n) {
        let r = this.deserializer;
        let o = TY.NormalizedSchema.of(e.output);
        let s = {};
        if (n.statusCode >= 300) {
          let a = await Lje(n.body, t);
          if (a.byteLength > 0) {
            Object.assign(s, await r.read(15, a));
          }
          throw await this.handleError(e, t, n, s, this.deserializeMetadata(n)), Error("@smithy/core/protocols - HTTP Protocol error handler failed to throw.");
        }
        for (let a in n.headers) {
          let l = n.headers[a];
          delete n.headers[a];
          n.headers[a.toLowerCase()] = l;
        }
        let i = await this.deserializeHttpMessage(o, t, n, s);
        if (i.length) {
          let a = await Lje(n.body, t);
          if (a.byteLength > 0) {
            let l = await r.read(o, a);
            for (let c of i) {
              s[c] = l[c];
            }
          }
        } else if (i.discardResponseBody) {
          await Lje(n.body, t);
        }
        s.$metadata = this.deserializeMetadata(n);
        return s;
      }
      async deserializeHttpMessage(e, t, n, r, o) {
        let s;
        if (r instanceof Set) {
          s = o;
        } else {
          s = r;
        }
        let i = true;
        let a = this.deserializer;
        let l = TY.NormalizedSchema.of(e);
        let c = [];
        for (let [u, d] of l.structIterator()) {
          let p = d.getMemberTraits();
          if (p.httpPayload) {
            if (i = false, d.isStreaming()) {
              if (d.isStructSchema()) {
                s[u] = await this.deserializeEventStream({
                  response: n,
                  responseSchema: l
                });
              } else {
                s[u] = G_n.sdkStreamMixin(n.body);
              }
            } else if (n.body) {
              let f = await Lje(n.body, t);
              if (f.byteLength > 0) {
                s[u] = await a.read(d, f);
              }
            }
          } else if (p.httpHeader) {
            let m = String(p.httpHeader).toLowerCase();
            let f = n.headers[m];
            if (f != null) {
              if (d.isListSchema()) {
                let h = d.getValueSchema();
                h.getMergedTraits().httpHeader = m;
                let g;
                if (h.isTimestampSchema() && h.getSchema() === 4) {
                  g = SY.splitEvery(f, ",", 2);
                } else {
                  g = SY.splitHeader(f);
                }
                let y = [];
                for (let _ of g) {
                  y.push(await a.read(h, _.trim()));
                }
                s[u] = y;
              } else {
                s[u] = await a.read(d, f);
              }
            }
          } else if (p.httpPrefixHeaders !== undefined) {
            s[u] = {};
            for (let [m, f] of Object.entries(n.headers)) {
              if (m.startsWith(p.httpPrefixHeaders)) {
                let h = d.getValueSchema();
                h.getMergedTraits().httpHeader = m;
                s[u][m.slice(p.httpPrefixHeaders.length)] = await a.read(h, f);
              }
            }
          } else if (p.httpResponseCode) {
            s[u] = n.statusCode;
          } else {
            c.push(u);
          }
        }
        c.discardResponseBody = i;
        return c;
      }
    }
    class gFs extends z_n {
      async serializeRequest(e, t, n) {
        let r = this.serializer;
        let o = {};
        let s = {};
        let i = await n.endpoint();
        let a = TY.NormalizedSchema.of(e?.input);
        let l = a.getSchema();
        let c;
        let u = new xNt.HttpRequest({
          protocol: "",
          hostname: "",
          port: undefined,
          path: "/",
          fragment: undefined,
          query: o,
          headers: s,
          body: undefined
        });
        if (i) {
          this.updateServiceEndpoint(u, i);
          this.setHostPrefix(u, e, t);
        }
        let d = {
          ...t
        };
        if (t) {
          let p = a.getEventStreamMember();
          if (p) {
            if (d[p]) {
              let m = {};
              for (let [f, h] of a.structIterator()) {
                if (f !== p && d[f]) {
                  r.write(h, d[f]);
                  m[f] = r.flush();
                }
              }
              c = await this.serializeEventStream({
                eventStream: d[p],
                requestSchema: a,
                initialRequest: m
              });
            }
          } else {
            r.write(l, d);
            c = r.flush();
          }
        }
        u.headers = s;
        u.query = o;
        u.body = c;
        u.method = "POST";
        return u;
      }
      async deserializeResponse(e, t, n) {
        let r = this.deserializer;
        let o = TY.NormalizedSchema.of(e.output);
        let s = {};
        if (n.statusCode >= 300) {
          let a = await Lje(n.body, t);
          if (a.byteLength > 0) {
            Object.assign(s, await r.read(15, a));
          }
          throw await this.handleError(e, t, n, s, this.deserializeMetadata(n)), Error("@smithy/core/protocols - RPC Protocol error handler failed to throw.");
        }
        for (let a in n.headers) {
          let l = n.headers[a];
          delete n.headers[a];
          n.headers[a.toLowerCase()] = l;
        }
        let i = o.getEventStreamMember();
        if (i) {
          s[i] = await this.deserializeEventStream({
            response: n,
            responseSchema: o,
            initialResponseContainer: s
          });
        } else {
          let a = await Lje(n.body, t);
          if (a.byteLength > 0) {
            Object.assign(s, await r.read(o, a));
          }
        }
        s.$metadata = this.deserializeMetadata(n);
        return s;
      }
    }
    var yFs = (e, t, n, r, o, s) => {
      if (t != null && t[n] !== undefined) {
        let i = r();
        if (i.length <= 0) {
          throw Error("Empty value provided for input HTTP label: " + n + ".");
        }
        e = e.replace(o, s ? i.split("/").map(a => kNt(a)).join("/") : kNt(i));
      } else {
        throw Error("No value provided for input HTTP label: " + n + ".");
      }
      return e;
    };
    function PVu(e, t) {
      return new WFr(e, t);
    }
    class WFr {
      input;
      context;
      query = {};
      method = "";
      headers = {};
      path = "";
      body = null;
      hostname = "";
      resolvePathStack = [];
      constructor(e, t) {
        this.input = e;
        this.context = t;
      }
      async build() {
        let {
          hostname: e,
          protocol: t = "https",
          port: n,
          path: r
        } = await this.context.endpoint();
        this.path = r;
        for (let o of this.resolvePathStack) {
          o(this.path);
        }
        return new xNt.HttpRequest({
          protocol: t,
          hostname: this.hostname || e,
          port: n,
          method: this.method,
          path: this.path,
          query: this.query,
          body: this.body,
          headers: this.headers
        });
      }
      hn(e) {
        this.hostname = e;
        return this;
      }
      bp(e) {
        this.resolvePathStack.push(t => {
          this.path = `${t?.endsWith("/") ? t.slice(0, -1) : t || ""}` + e;
        });
        return this;
      }
      p(e, t, n, r) {
        this.resolvePathStack.push(o => {
          this.path = yFs(o, this.input, e, t, n, r);
        });
        return this;
      }
      h(e) {
        this.headers = e;
        return this;
      }
      q(e) {
        this.query = e;
        return this;
      }
      b(e) {
        this.body = e;
        return this;
      }
      m(e) {
        this.method = e;
        return this;
      }
    }
    function GFr(e, t) {
      if (t.timestampFormat.useTrait) {
        if (e.isTimestampSchema() && (e.getSchema() === 5 || e.getSchema() === 6 || e.getSchema() === 7)) {
          return e.getSchema();
        }
      }
      let {
        httpLabel: n,
        httpPrefixHeaders: r,
        httpHeader: o,
        httpQuery: s
      } = e.getMergedTraits();
      return (t.httpBindings ? typeof r === "string" || Boolean(o) ? 6 : Boolean(s) || Boolean(n) ? 5 : undefined : undefined) ?? t.timestampFormat.default;
    }
    class VFr extends lrt {
      settings;
      constructor(e) {
        super();
        this.settings = e;
      }
      read(e, t) {
        let n = TY.NormalizedSchema.of(e);
        if (n.isListSchema()) {
          return SY.splitHeader(t).map(r => this.read(n.getValueSchema(), r));
        }
        if (n.isBlobSchema()) {
          return (this.serdeContext?.base64Decoder ?? V_n.fromBase64)(t);
        }
        if (n.isTimestampSchema()) {
          switch (GFr(n, this.settings)) {
            case 5:
              return SY._parseRfc3339DateTimeWithOffset(t);
            case 6:
              return SY._parseRfc7231DateTime(t);
            case 7:
              return SY._parseEpochTimestamp(t);
            default:
              console.warn("Missing timestamp format, parsing value with Date constructor:", t);
              return new Date(t);
          }
        }
        if (n.isStringSchema()) {
          let r = n.getMergedTraits().mediaType;
          let o = t;
          if (r) {
            if (n.getMergedTraits().httpHeader) {
              o = this.base64ToUtf8(o);
            }
            if (r === "application/json" || r.endsWith("+json")) {
              o = SY.LazyJsonString.from(o);
            }
            return o;
          }
        }
        if (n.isNumericSchema()) {
          return Number(t);
        }
        if (n.isBigIntegerSchema()) {
          return BigInt(t);
        }
        if (n.isBigDecimalSchema()) {
          return new SY.NumericValue(t, "bigDecimal");
        }
        if (n.isBooleanSchema()) {
          return String(t).toLowerCase() === "true";
        }
        return t;
      }
      base64ToUtf8(e) {
        return (this.serdeContext?.utf8Encoder ?? qFr.toUtf8)((this.serdeContext?.base64Decoder ?? V_n.fromBase64)(e));
      }
    }
    class _Fs extends lrt {
      codecDeserializer;
      stringDeserializer;
      constructor(e, t) {
        super();
        this.codecDeserializer = e;
        this.stringDeserializer = new VFr(t);
      }
      setSerdeContext(e) {
        this.stringDeserializer.setSerdeContext(e);
        this.codecDeserializer.setSerdeContext(e);
        this.serdeContext = e;
      }
      read(e, t) {
        let n = TY.NormalizedSchema.of(e);
        let r = n.getMergedTraits();
        let o = this.serdeContext?.utf8Encoder ?? qFr.toUtf8;
        if (r.httpHeader || r.httpResponseCode) {
          return this.stringDeserializer.read(n, o(t));
        }
        if (r.httpPayload) {
          if (n.isBlobSchema()) {
            let s = this.serdeContext?.utf8Decoder ?? qFr.fromUtf8;
            if (typeof t === "string") {
              return s(t);
            }
            return t;
          } else if (n.isStringSchema()) {
            if ("byteLength" in t) {
              return o(t);
            }
            return t;
          }
        }
        return this.codecDeserializer.read(n, t);
      }
    }
    class zFr extends lrt {
      settings;
      stringBuffer = "";
      constructor(e) {
        super();
        this.settings = e;
      }
      write(e, t) {
        let n = TY.NormalizedSchema.of(e);
        switch (typeof t) {
          case "object":
            if (t === null) {
              this.stringBuffer = "null";
              return;
            }
            if (n.isTimestampSchema()) {
              if (!(t instanceof Date)) {
                throw Error(`@smithy/core/protocols - received non-Date value ${t} when schema expected Date in ${n.getName(true)}`);
              }
              switch (GFr(n, this.settings)) {
                case 5:
                  this.stringBuffer = t.toISOString().replace(".000Z", "Z");
                  break;
                case 6:
                  this.stringBuffer = SY.dateToUtcString(t);
                  break;
                case 7:
                  this.stringBuffer = String(t.getTime() / 1000);
                  break;
                default:
                  console.warn("Missing timestamp format, using epoch seconds", t);
                  this.stringBuffer = String(t.getTime() / 1000);
              }
              return;
            }
            if (n.isBlobSchema() && "byteLength" in t) {
              this.stringBuffer = (this.serdeContext?.base64Encoder ?? V_n.toBase64)(t);
              return;
            }
            if (n.isListSchema() && Array.isArray(t)) {
              let s = "";
              for (let i of t) {
                this.write([n.getValueSchema(), n.getMergedTraits()], i);
                let a = this.flush();
                let l = n.getValueSchema().isTimestampSchema() ? a : SY.quoteHeader(a);
                if (s !== "") {
                  s += ", ";
                }
                s += l;
              }
              this.stringBuffer = s;
              return;
            }
            this.stringBuffer = JSON.stringify(t, null, 2);
            break;
          case "string":
            let r = n.getMergedTraits().mediaType;
            let o = t;
            if (r) {
              if (r === "application/json" || r.endsWith("+json")) {
                o = SY.LazyJsonString.from(o);
              }
              if (n.getMergedTraits().httpHeader) {
                this.stringBuffer = (this.serdeContext?.base64Encoder ?? V_n.toBase64)(o.toString());
                return;
              }
            }
            this.stringBuffer = t;
            break;
          default:
            if (n.isIdempotencyToken()) {
              this.stringBuffer = SY.generateIdempotencyToken();
            } else {
              this.stringBuffer = String(t);
            }
        }
      }
      flush() {
        let e = this.stringBuffer;
        this.stringBuffer = "";
        return e;
      }
    }
    class bFs {
      codecSerializer;
      stringSerializer;
      buffer;
      constructor(e, t, n = new zFr(t)) {
        this.codecSerializer = e;
        this.stringSerializer = n;
      }
      setSerdeContext(e) {
        this.codecSerializer.setSerdeContext(e);
        this.stringSerializer.setSerdeContext(e);
      }
      write(e, t) {
        let n = TY.NormalizedSchema.of(e);
        let r = n.getMergedTraits();
        if (r.httpHeader || r.httpLabel || r.httpQuery) {
          this.stringSerializer.write(n, t);
          this.buffer = this.stringSerializer.flush();
          return;
        }
        return this.codecSerializer.write(n, t);
      }
      flush() {
        if (this.buffer !== undefined) {
          let e = this.buffer;
          this.buffer = undefined;
          return e;
        }
        return this.codecSerializer.flush();
      }
    }
    Ij.FromStringShapeDeserializer = VFr;
    Ij.HttpBindingProtocol = hFs;
    Ij.HttpInterceptingShapeDeserializer = _Fs;
    Ij.HttpInterceptingShapeSerializer = bFs;
    Ij.HttpProtocol = z_n;
    Ij.RequestBuilder = WFr;
    Ij.RpcProtocol = gFs;
    Ij.SerdeContext = lrt;
    Ij.ToStringShapeSerializer = zFr;
    Ij.collectBody = Lje;
    Ij.determineTimestampFormat = GFr;
    Ij.extendedEncodeURIComponent = kNt;
    Ij.requestBuilder = PVu;
    Ij.resolvedPath = yFs;
  });
  var SFs;
  var TFs = __lazy(() => {
    SFs = __toESM(tw(), 1);
  });
  function K_n(e, t) {
    if (t == null) {
      return t;
    }
    let n = EFs.NormalizedSchema.of(e);
    if (n.getMergedTraits().sensitive) {
      return "***SensitiveInformation***";
    }
    if (n.isListSchema()) {
      if (!!n.getValueSchema().getMergedTraits().sensitive) {
        return "***SensitiveInformation***";
      }
    } else if (n.isMapSchema()) {
      if (!!n.getKeySchema().getMergedTraits().sensitive || !!n.getValueSchema().getMergedTraits().sensitive) {
        return "***SensitiveInformation***";
      }
    } else if (n.isStructSchema() && typeof t === "object") {
      let r = t;
      let o = {};
      for (let [s, i] of n.structIterator()) {
        if (r[s] != null) {
          o[s] = K_n(i, r[s]);
        }
      }
      return o;
    }
    return t;
  }
  var EFs;
  var vFs = __lazy(() => {
    EFs = __toESM(qT(), 1);
  });
  class Command {
    middlewareStack = wFs.constructStack();
    schema;
    static classBuilder() {
      return new CFs();
    }
    resolveMiddlewareWithContext(e, t, n, {
      middlewareFn: r,
      clientName: o,
      commandName: s,
      inputFilterSensitiveLog: i,
      outputFilterSensitiveLog: a,
      smithyContext: l,
      additionalContext: c,
      CommandCtor: u
    }) {
      for (let h of r.bind(this)(u, e, t, n)) {
        this.middlewareStack.use(h);
      }
      let d = e.concat(this.middlewareStack);
      let {
        logger: p
      } = t;
      let m = {
        logger: p,
        clientName: o,
        commandName: s,
        inputFilterSensitiveLog: i,
        outputFilterSensitiveLog: a,
        ["__smithy_context"]: {
          commandInstance: this,
          ...l
        },
        ...c
      };
      let {
        requestHandler: f
      } = t;
      return d.resolve(h => f.handle(h.request, n || {}), m);
    }
  }
  class CFs {
    _init = () => {};
    _ep = {};
    _middlewareFn = () => [];
    _commandName = "";
    _clientName = "";
    _additionalContext = {};
    _smithyContext = {};
    _inputFilterSensitiveLog = undefined;
    _outputFilterSensitiveLog = undefined;
    _serializer = null;
    _deserializer = null;
    _operationSchema;
    init(e) {
      this._init = e;
    }
    ep(e) {
      this._ep = e;
      return this;
    }
    m(e) {
      this._middlewareFn = e;
      return this;
    }
    s(e, t, n = {}) {
      this._smithyContext = {
        service: e,
        operation: t,
        ...n
      };
      return this;
    }
    c(e = {}) {
      this._additionalContext = e;
      return this;
    }
    n(e, t) {
      this._clientName = e;
      this._commandName = t;
      return this;
    }
    f(e = n => n, t = n => n) {
      this._inputFilterSensitiveLog = e;
      this._outputFilterSensitiveLog = t;
      return this;
    }
    ser(e) {
      this._serializer = e;
      return this;
    }
    de(e) {
      this._deserializer = e;
      return this;
    }
    sc(e) {
      this._operationSchema = e;
      this._smithyContext.operationSchema = e;
      return this;
    }
    build() {
      let e = this;
      let t;
      return t = class extends Command {
        input;
        static getEndpointParameterInstructions() {
          return e._ep;
        }
        constructor(...[n]) {
          super();
          this.input = n ?? {};
          e._init(this);
          this.schema = e._operationSchema;
        }
        resolveMiddleware(n, r, o) {
          let s = e._operationSchema;
          let i = s?.[4] ?? s?.input;
          let a = s?.[5] ?? s?.output;
          return this.resolveMiddlewareWithContext(n, r, o, {
            CommandCtor: t,
            middlewareFn: e._middlewareFn,
            clientName: e._clientName,
            commandName: e._commandName,
            inputFilterSensitiveLog: e._inputFilterSensitiveLog ?? (s ? K_n.bind(null, i) : l => l),
            outputFilterSensitiveLog: e._outputFilterSensitiveLog ?? (s ? K_n.bind(null, a) : l => l),
            smithyContext: e._smithyContext,
            additionalContext: e._additionalContext
          });
        }
        serialize = e._serializer;
        deserialize = e._deserializer;
      };
    }
  }
  var wFs;
  var RFs = __lazy(() => {
    tFr();
    vFs();
    wFs = __toESM(QB(), 1);
  });
  var createAggregatedClient = (e, t) => {
    for (let n of Object.keys(e)) {
      let r = e[n];
      let o = async function (i, a, l) {
        let c = new r(i);
        if (typeof a === "function") {
          this.send(c, a);
        } else if (typeof l === "function") {
          if (typeof a !== "object") {
            throw Error(`Expected http options but got ${typeof a}`);
          }
          this.send(c, a || {}, l);
        } else {
          return this.send(c, a);
        }
      };
      let s = (n[0].toLowerCase() + n.slice(1)).replace(/Command$/, "");
      t.prototype[s] = o;
    }
  };
  var ServiceException;
  var decorateServiceException = (e, t = {}) => {
    Object.entries(t).filter(([, r]) => r !== undefined).forEach(([r, o]) => {
      if (e[r] == null || e[r] === "") {
        e[r] = o;
      }
    });
    let n = e.message || e.Message || "UnknownError";
    e.message = n;
    delete e.Message;
    return e;
  };
  var XFr = __lazy(() => {
    ServiceException = class crt extends Error {
      $fault;
      $response;
      $retryable;
      $metadata;
      constructor(e) {
        super(e.message);
        Object.setPrototypeOf(this, Object.getPrototypeOf(this).constructor.prototype);
        this.name = e.name;
        this.$fault = e.$fault;
        this.$metadata = e.$metadata;
      }
      static isInstance(e) {
        if (!e) {
          return false;
        }
        let t = e;
        return crt.prototype.isPrototypeOf(t) || Boolean(t.$fault) && Boolean(t.$metadata) && (t.$fault === "client" || t.$fault === "server");
      }
      static [Symbol.hasInstance](e) {
        if (!e) {
          return false;
        }
        let t = e;
        if (this === crt) {
          return crt.isInstance(e);
        }
        if (crt.isInstance(e)) {
          if (t.name && this.name) {
            return this.prototype.isPrototypeOf(e) || t.name === this.name;
          }
          return this.prototype.isPrototypeOf(e);
        }
        return false;
      }
    };
  });
  var throwDefaultError = ({
    output: e,
    parsedBody: t,
    exceptionCtor: n,
    errorCode: r
  }) => {
    let o = NVu(e);
    let s = o.httpStatusCode ? o.httpStatusCode + "" : undefined;
    let i = new n({
      name: t?.code || t?.Code || r || s || "UnknownError",
      $fault: "client",
      $metadata: o
    });
    throw decorateServiceException(i, t);
  };
  var withBaseException = e => ({
    output: t,
    parsedBody: n,
    errorCode: r
  }) => {
    throwDefaultError({
      output: t,
      parsedBody: n,
      exceptionCtor: e,
      errorCode: r
    });
  };
  var NVu = e => ({
    httpStatusCode: e.statusCode,
    requestId: e.headers["x-amzn-requestid"] ?? e.headers["x-amzn-request-id"] ?? e.headers["x-amz-request-id"],
    extendedRequestId: e.headers["x-amz-id-2"],
    cfId: e.headers["x-amz-cf-id"]
  });
  var kFs = __lazy(() => {
    XFr();
  });
  var loadConfigsForDefaultMode = e => {
    switch (e) {
      case "standard":
        return {
          retryMode: "standard",
          connectionTimeout: 3100
        };
      case "in-region":
        return {
          retryMode: "standard",
          connectionTimeout: 1100
        };
      case "cross-region":
        return {
          retryMode: "standard",
          connectionTimeout: 3100
        };
      case "mobile":
        return {
          retryMode: "standard",
          connectionTimeout: 30000
        };
      default:
        return {};
    }
  };
  var AFs = false;
  var emitWarningIfUnsupportedVersion = e => {
    if (e && !AFs && parseInt(e.substring(1, e.indexOf("."))) < 16) {
      AFs = true;
    }
  };
  var IFs;
  var PFs = __lazy(() => {
    IFs = __toESM(tw(), 1);
  });
  var OFs = e => {
    let t = [];
    for (let n in Znt) {
      let r = Znt[n];
      if (e[r] === undefined) {
        continue;
      }
      t.push({
        algorithmId: () => r,
        checksumConstructor: () => e[r]
      });
    }
    return {
      addChecksumAlgorithm(n) {
        t.push(n);
      },
      checksumAlgorithms() {
        return t;
      }
    };
  };
  var DFs = e => {
    let t = {};
    e.checksumAlgorithms().forEach(n => {
      t[n.algorithmId()] = n.checksumConstructor();
    });
    return t;
  };
  var MFs = __lazy(() => {
    tFr();
  });
  var NFs = e => ({
    setRetryStrategy(t) {
      e.retryStrategy = t;
    },
    retryStrategy() {
      return e.retryStrategy;
    }
  });
  var LFs = e => {
    let t = {};
    t.retryStrategy = e.retryStrategy();
    return t;
  };
  var getDefaultExtensionConfiguration = e => Object.assign(OFs(e), NFs(e));
  var resolveDefaultRuntimeConfig = e => Object.assign(DFs(e), LFs(e));
  var BFs = __lazy(() => {});
  var getArrayIfSingleItem = e => Array.isArray(e) ? e : [e];
  var getValueFromTextNode = e => {
    for (let n in e) {
      if (e.hasOwnProperty(n) && e[n]["#text"] !== undefined) {
        e[n] = e[n]["#text"];
      } else if (typeof e[n] === "object" && e[n] !== null) {
        e[n] = getValueFromTextNode(e[n]);
      }
    }
    return e;
  };
  var isSerializableHeaderValue = e => e != null;
  class NoOpLogger {
    trace() {}
    debug() {}
    info() {}
    warn() {}
    error() {}
  }
  function map_export2(e, t, n) {
    let r;
    let o;
    let s;
    if (typeof t > "u" && typeof n > "u") {
      r = {};
      s = e;
    } else if (r = e, typeof t === "function") {
      o = t;
      s = n;
      return WVu(r, o, s);
    } else {
      s = t;
    }
    for (let i of Object.keys(s)) {
      if (!Array.isArray(s[i])) {
        r[i] = s[i];
        continue;
      }
      qFs(r, null, s, i);
    }
    return r;
  }
  var convertMap = e => {
    let t = {};
    for (let [n, r] of Object.entries(e || {})) {
      t[n] = [, r];
    }
    return t;
  };
  var take = (e, t) => {
    let n = {};
    for (let r in t) {
      qFs(n, e, t, r);
    }
    return n;
  };
  var WVu = (e, t, n) => map_export2(e, Object.entries(n).reduce((r, [o, s]) => {
    if (Array.isArray(s)) {
      r[o] = s;
    } else if (typeof s === "function") {
      r[o] = [t, s()];
    } else {
      r[o] = [t, s];
    }
    return r;
  }, {}));
  var qFs = (e, t, n, r) => {
    if (t !== null) {
      let i = n[r];
      if (typeof i === "function") {
        i = [, i];
      }
      let [a = GVu, l = VVu, c = r] = i;
      if (typeof a === "function" && a(t[c]) || typeof a !== "function" && !!a) {
        e[r] = l(t[c]);
      }
      return;
    }
    let [o, s] = n[r];
    if (typeof s === "function") {
      let i;
      let a = o === undefined && (i = s()) != null;
      let l = typeof o === "function" && !!o(undefined) || typeof o !== "function" && !!o;
      if (a) {
        e[r] = i;
      } else if (l) {
        e[r] = s();
      }
    } else {
      let i = o === undefined && s != null;
      let a = typeof o === "function" && !!o(s) || typeof o !== "function" && !!o;
      if (i || a) {
        e[r] = s;
      }
    }
  };
  var GVu = e => e != null;
  var VVu = e => e;
  var WFs;
  var GFs = __lazy(() => {
    WFs = __toESM(tw(), 1);
  });
  var serializeFloat = e => {
    if (e !== e) {
      return "NaN";
    }
    switch (e) {
      case 1 / 0:
        return "Infinity";
      case -1 / 0:
        return "-Infinity";
      default:
        return e;
    }
  };
  var serializeDateTime = e => e.toISOString().replace(".000Z", "Z");
  var _json = e => {
    if (e == null) {
      return {};
    }
    if (Array.isArray(e)) {
      return e.filter(t => t != null).map(_json);
    }
    if (typeof e === "object") {
      let t = {};
      for (let n of Object.keys(e)) {
        if (e[n] == null) {
          continue;
        }
        t[n] = _json(e[n]);
      }
      return t;
    }
    return e;
  };
  var wC = {};
  __export(wC, {
    withBaseException: () => withBaseException,
    throwDefaultError: () => throwDefaultError,
    take: () => take,
    serializeFloat: () => serializeFloat,
    serializeDateTime: () => serializeDateTime,
    resolvedPath: () => WFs.resolvedPath,
    resolveDefaultRuntimeConfig: () => resolveDefaultRuntimeConfig,
    map: () => map_export2,
    loadConfigsForDefaultMode: () => loadConfigsForDefaultMode,
    isSerializableHeaderValue: () => isSerializableHeaderValue,
    getValueFromTextNode: () => getValueFromTextNode,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration,
    getDefaultExtensionConfiguration: () => getDefaultExtensionConfiguration,
    getArrayIfSingleItem: () => getArrayIfSingleItem,
    extendedEncodeURIComponent: () => IFs.extendedEncodeURIComponent,
    emitWarningIfUnsupportedVersion: () => emitWarningIfUnsupportedVersion,
    decorateServiceException: () => decorateServiceException,
    createAggregatedClient: () => createAggregatedClient,
    convertMap: () => convertMap,
    collectBody: () => SFs.collectBody,
    _json: () => _json,
    ServiceException: () => ServiceException,
    SENSITIVE_STRING: () => "***SensitiveInformation***",
    NoOpLogger: () => NoOpLogger,
    Command: () => Command,
    Client: () => Client
  });
  var VFs = __lazy(() => {
    n1s();
    TFs();
    RFs();
    kFs();
    XFr();
    PFs();
    BFs();
    GFs();
    __reExport(wC, __toESM(yW(), 1), module.exports);
  });
  function KFs(e) {
    return new pNt({
      protocol: e.protocol,
      hostname: e.hostname,
      port: Number(e.port),
      path: e.pathname,
      query: Array.from(e.searchParams.entries()).reduce((t, [n, r]) => (t[n] = r, t), {}),
      fragment: e.hash
    });
  }
  async function YFs(e, t) {
    let r = await zFs.sdkStreamMixin(e.body).transformToString();
    if (e.statusCode === 200) {
      let o = JSON.parse(r);
      if (typeof o.AccessKeyId !== "string" || typeof o.SecretAccessKey !== "string" || typeof o.Token !== "string" || typeof o.Expiration !== "string") {
        throw new Y_n.CredentialsProviderError("HTTP credential provider response not of the required format, an object matching: { AccessKeyId: string, SecretAccessKey: string, Token: string, Expiration: string(rfc3339) }", {
          logger: t
        });
      }
      return {
        accessKeyId: o.AccessKeyId,
        secretAccessKey: o.SecretAccessKey,
        sessionToken: o.Token,
        expiration: wC.parseRfc3339DateTime(o.Expiration)
      };
    }
    if (e.statusCode >= 400 && e.statusCode < 500) {
      let o = {};
      try {
        o = JSON.parse(r);
      } catch (s) {}
      throw Object.assign(new Y_n.CredentialsProviderError(`Server responded with status: ${e.statusCode}`, {
        logger: t
      }), {
        Code: o.Code,
        Message: o.Message
      });
    }
    throw new Y_n.CredentialsProviderError(`Server responded with status: ${e.statusCode}`, {
      logger: t
    });
  }
  var Y_n;
  var zFs;
  var JFs = __lazy(() => {
    JNs();
    VFs();
    Y_n = __toESM(wy(), 1);
    zFs = __toESM(TFr(), 1);
  });
  var XFs = (e, t, n) => async () => {
    for (let r = 0; r < t; ++r) {
      try {
        return await e();
      } catch (o) {
        await new Promise(s => setTimeout(s, n));
      }
    }
    return await e();
  };
  var QFs;
  var ZFs;
  var ZFr;
  var eUs;
  var fromHttp = (e = {}) => {
    e.logger?.debug("@aws-sdk/credential-provider-http - fromHttp");
    let t;
    let n = e.awsContainerCredentialsRelativeUri ?? process.env["AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"];
    let r = e.awsContainerCredentialsFullUri ?? process.env["AWS_CONTAINER_CREDENTIALS_FULL_URI"];
    let o = e.awsContainerAuthorizationToken ?? process.env["AWS_CONTAINER_AUTHORIZATION_TOKEN"];
    let s = e.awsContainerAuthorizationTokenFile ?? process.env["AWS_CONTAINER_AUTHORIZATION_TOKEN_FILE"];
    let i = e.logger?.constructor?.name === "NoOpLogger" || !e.logger?.warn ? console.warn : e.logger.warn.bind(e.logger);
    if (n && r) {
      i("@aws-sdk/credential-provider-http: you have set both awsContainerCredentialsRelativeUri and awsContainerCredentialsFullUri.");
      i("awsContainerCredentialsFullUri will take precedence.");
    }
    if (o && s) {
      i("@aws-sdk/credential-provider-http: you have set both awsContainerAuthorizationToken and awsContainerAuthorizationTokenFile.");
      i("awsContainerAuthorizationToken will take precedence.");
    }
    if (r) {
      t = r;
    } else if (n) {
      t = `${"http://169.254.170.2"}${n}`;
    } else {
      throw new ZFr.CredentialsProviderError(`No HTTP credential provider host provided.
Set AWS_CONTAINER_CREDENTIALS_FULL_URI or AWS_CONTAINER_CREDENTIALS_RELATIVE_URI.`, {
        logger: e.logger
      });
    }
    let a = new URL(t);
    kMs(a, e.logger);
    let l = ZFs.NodeHttpHandler.create({
      requestTimeout: e.timeout ?? 1000,
      connectionTimeout: e.timeout ?? 1000
    });