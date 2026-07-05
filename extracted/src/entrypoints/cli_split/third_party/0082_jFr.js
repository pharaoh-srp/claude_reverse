  var jFr = __commonJS(RNt => {
    var cFs = aFs();
    var uFs = lFs();
    Object.keys(cFs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(RNt, e)) {
        Object.defineProperty(RNt, e, {
          enumerable: true,
          get: function () {
            return cFs[e];
          }
        });
      }
    });
    Object.keys(uFs).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(RNt, e)) {
        Object.defineProperty(RNt, e, {
          enumerable: true,
          get: function () {
            return uFs[e];
          }
        });
      }
    });
  });
  var fFs = __commonJS(mFs => {
    var dFs = jT();
    class pFs {
      marshaller;
      serializer;
      deserializer;
      serdeContext;
      defaultContentType;
      constructor({
        marshaller: e,
        serializer: t,
        deserializer: n,
        serdeContext: r,
        defaultContentType: o
      }) {
        this.marshaller = e;
        this.serializer = t;
        this.deserializer = n;
        this.serdeContext = r;
        this.defaultContentType = o;
      }
      async serializeEventStream({
        eventStream: e,
        requestSchema: t,
        initialRequest: n
      }) {
        let r = this.marshaller;
        let o = t.getEventStreamMember();
        let s = t.getMemberSchema(o);
        let i = this.serializer;
        let a = this.defaultContentType;
        let l = Symbol("initialRequestMarker");
        let c = {
          async *[Symbol.asyncIterator]() {
            if (n) {
              let u = {
                ":event-type": {
                  type: "string",
                  value: "initial-request"
                },
                ":message-type": {
                  type: "string",
                  value: "event"
                },
                ":content-type": {
                  type: "string",
                  value: a
                }
              };
              i.write(t, n);
              let d = i.flush();
              yield {
                [l]: true,
                headers: u,
                body: d
              };
            }
            for await (let u of e) {
              yield u;
            }
          }
        };
        return r.serialize(c, u => {
          if (u[l]) {
            return {
              headers: u.headers,
              body: u.body
            };
          }
          let d = Object.keys(u).find(y => y !== "__type") ?? "";
          let {
            additionalHeaders: p,
            body: m,
            eventType: f,
            explicitPayloadContentType: h
          } = this.writeEventBody(d, s, u);
          return {
            headers: {
              ":event-type": {
                type: "string",
                value: f
              },
              ":message-type": {
                type: "string",
                value: "event"
              },
              ":content-type": {
                type: "string",
                value: h ?? a
              },
              ...p
            },
            body: m
          };
        });
      }
      async deserializeEventStream({
        response: e,
        responseSchema: t,
        initialResponseContainer: n
      }) {
        let r = this.marshaller;
        let o = t.getEventStreamMember();
        let i = t.getMemberSchema(o).getMemberSchemas();
        let a = Symbol("initialResponseMarker");
        let l = r.deserialize(e.body, async d => {
          let p = Object.keys(d).find(f => f !== "__type") ?? "";
          let m = d[p].body;
          if (p === "initial-response") {
            let f = await this.deserializer.read(t, m);
            delete f[o];
            return {
              [a]: true,
              ...f
            };
          } else if (p in i) {
            let f = i[p];
            if (f.isStructSchema()) {
              let h = {};
              let g = false;
              for (let [y, _] of f.structIterator()) {
                let {
                  eventHeader: b,
                  eventPayload: S
                } = _.getMergedTraits();
                if (g = g || Boolean(b || S), S) {
                  if (_.isBlobSchema()) {
                    h[y] = m;
                  } else if (_.isStringSchema()) {
                    h[y] = (this.serdeContext?.utf8Encoder ?? dFs.toUtf8)(m);
                  } else if (_.isStructSchema()) {
                    h[y] = await this.deserializer.read(_, m);
                  }
                } else if (b) {
                  let E = d[p].headers[y]?.value;
                  if (E != null) {
                    if (_.isNumericSchema()) {
                      if (E && typeof E === "object" && "bytes" in E) {
                        h[y] = BigInt(E.toString());
                      } else {
                        h[y] = Number(E);
                      }
                    } else {
                      h[y] = E;
                    }
                  }
                }
              }
              if (g) {
                return {
                  [p]: h
                };
              }
            }
            return {
              [p]: await this.deserializer.read(f, m)
            };
          } else {
            return {
              $unknown: d
            };
          }
        });
        let c = l[Symbol.asyncIterator]();
        let u = await c.next();
        if (u.done) {
          return l;
        }
        if (u.value?.[a]) {
          if (!t) {
            throw Error("@smithy::core/protocols - initial-response event encountered in event stream but no response schema given.");
          }
          for (let [d, p] of Object.entries(u.value)) {
            n[d] = p;
          }
        }
        return {
          async *[Symbol.asyncIterator]() {
            if (!u?.value?.[a]) {
              yield u.value;
            }
            while (true) {
              let {
                done: d,
                value: p
              } = await c.next();
              if (d) {
                break;
              }
              yield p;
            }
          }
        };
      }
      writeEventBody(e, t, n) {
        let r = this.serializer;
        let o = e;
        let s = null;
        let i;
        let a = (() => t.getSchema()[4].includes(e))();
        let l = {};
        if (!a) {
          let [d, p] = n[e];
          o = d;
          r.write(15, p);
        } else {
          let d = t.getMemberSchema(e);
          if (d.isStructSchema()) {
            for (let [p, m] of d.structIterator()) {
              let {
                eventHeader: f,
                eventPayload: h
              } = m.getMergedTraits();
              if (h) {
                s = p;
                break;
              } else if (f) {
                let g = n[e][p];
                let y = "binary";
                if (m.isNumericSchema()) {
                  if (-2147483648 <= g && g <= 2147483647) {
                    y = "integer";
                  } else {
                    y = "long";
                  }
                } else if (m.isTimestampSchema()) {
                  y = "timestamp";
                } else if (m.isStringSchema()) {
                  y = "string";
                } else if (m.isBooleanSchema()) {
                  y = "boolean";
                }
                if (g != null) {
                  l[p] = {
                    type: y,
                    value: g
                  };
                  delete n[e][p];
                }
              }
            }
            if (s !== null) {
              let p = d.getMemberSchema(s);
              if (p.isBlobSchema()) {
                i = "application/octet-stream";
              } else if (p.isStringSchema()) {
                i = "text/plain";
              }
              r.write(p, n[e][s]);
            } else {
              r.write(d, n[e]);
            }
          } else {
            throw Error("@smithy/core/event-streams - non-struct member not supported in event stream union.");
          }
        }
        let c = r.flush();
        return {
          body: typeof c === "string" ? (this.serdeContext?.utf8Decoder ?? dFs.fromUtf8)(c) : c,
          eventType: o,
          explicitPayloadContentType: i,
          additionalHeaders: l
        };
      }
    }
    mFs.EventStreamSerde = pFs;
  });