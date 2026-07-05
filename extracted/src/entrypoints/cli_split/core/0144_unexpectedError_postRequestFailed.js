  var gEi;
  var V5r;
  var yEi = __lazy(() => {
    gEi = __toESM(hEi(), 1);
    V5r = gEi.state;
  });
  function I0e(e, t, n) {
    let {
      parameterPath: r,
      mapper: o
    } = t;
    let s;
    if (typeof r === "string") {
      r = [r];
    }
    if (Array.isArray(r)) {
      if (r.length > 0) {
        if (o.isConstant) {
          s = o.defaultValue;
        } else {
          let i = _Ei(e, r);
          if (!i.propertyFound && n) {
            i = _Ei(n, r);
          }
          let a = false;
          if (!i.propertyFound) {
            a = o.required || r[0] === "options" && r.length === 2;
          }
          s = a ? o.defaultValue : i.propertyValue;
        }
      }
    } else {
      if (o.required) {
        s = {};
      }
      for (let i in r) {
        let a = o.type.modelProperties[i];
        let l = r[i];
        let c = I0e(e, {
          parameterPath: l,
          mapper: a
        }, n);
        if (c !== undefined) {
          if (!s) {
            s = {};
          }
          s[i] = c;
        }
      }
    }
    return s;
  }
  function _Ei(e, t) {
    let n = {
      propertyFound: false
    };
    let r = 0;
    for (; r < t.length; ++r) {
      let o = t[r];
      if (e && o in e) {
        e = e[o];
      } else {
        break;
      }
    }
    if (r === t.length) {
      n.propertyValue = e;
      n.propertyFound = true;
    }
    return n;
  }
  function Rkd(e) {
    return bEi in e;
  }
  function M_e(e) {
    if (Rkd(e)) {
      return M_e(e[bEi]);
    }
    let t = V5r.operationRequestMap.get(e);
    if (!t) {
      t = {};
      V5r.operationRequestMap.set(e, t);
    }
    return t;
  }
  var bEi;
  var RFt = __lazy(() => {
    yEi();
    bEi = Symbol.for("@azure/core-client original request");
  });
  function SEi(e = {}) {
    var t;
    var n;
    var r;
    var o;
    var s;
    var i;
    var a;
    let l = (n = (t = e.expectedContentTypes) === null || t === undefined ? undefined : t.json) !== null && n !== undefined ? n : xkd;
    let c = (o = (r = e.expectedContentTypes) === null || r === undefined ? undefined : r.xml) !== null && o !== undefined ? o : kkd;
    let u = e.parseXML;
    let d = e.serializerOptions;
    let p = {
      xml: {
        rootName: (s = d === null || d === undefined ? undefined : d.xml.rootName) !== null && s !== undefined ? s : "",
        includeRoot: (i = d === null || d === undefined ? undefined : d.xml.includeRoot) !== null && i !== undefined ? i : false,
        xmlCharKey: (a = d === null || d === undefined ? undefined : d.xml.xmlCharKey) !== null && a !== undefined ? a : "_"
      }
    };
    return {
      name: "deserializationPolicy",
      async sendRequest(m, f) {
        let h = await f(m);
        return Okd(l, c, h, p, u);
      }
    };
  }
  function Ikd(e) {
    let t;
    let n = e.request;
    let r = M_e(n);
    let o = r === null || r === undefined ? undefined : r.operationSpec;
    if (o) {
      if (!(r === null || r === undefined ? undefined : r.operationResponseGetter)) {
        t = o.responses[e.status];
      } else {
        t = r === null || r === undefined ? undefined : r.operationResponseGetter(o, e);
      }
    }
    return t;
  }
  function Pkd(e) {
    let t = e.request;
    let n = M_e(t);
    let r = n === null || n === undefined ? undefined : n.shouldDeserialize;
    let o;
    if (r === undefined) {
      o = true;
    } else if (typeof r === "boolean") {
      o = r;
    } else {
      o = r(e);
    }
    return o;
  }
  async function Okd(e, t, n, r, o) {
    let s = await Nkd(e, t, n, r, o);
    if (!Pkd(s)) {
      return s;
    }
    let i = M_e(s.request);
    let a = i === null || i === undefined ? undefined : i.operationSpec;
    if (!a || !a.responses) {
      return s;
    }
    let l = Ikd(s);
    let {
      error: c,
      shouldReturnResponse: u
    } = Mkd(s, a, l, r);
    if (c) {
      throw c;
    } else if (u) {
      return s;
    }
    if (l) {
      if (l.bodyMapper) {
        let d = s.parsedBody;
        if (a.isXML && l.bodyMapper.type.name === D_e.Sequence) {
          d = typeof d === "object" ? d[l.bodyMapper.xmlElementName] : [];
        }
        try {
          s.parsedBody = a.serializer.deserialize(l.bodyMapper, d, "operationRes.parsedBody", r);
        } catch (p) {
          throw new NW(`Error ${p} occurred in deserializing the responseBody - ${s.bodyAsText}`, {
            statusCode: s.status,
            request: s.request,
            response: s
          });
        }
      } else if (a.httpMethod === "HEAD") {
        s.parsedBody = n.status >= 200 && n.status < 300;
      }
      if (l.headersMapper) {
        s.parsedHeaders = a.serializer.deserialize(l.headersMapper, s.headers.toJSON(), "operationRes.parsedHeaders", {
          xml: {},
          ignoreUnknownProperties: true
        });
      }
    }
    return s;
  }
  function Dkd(e) {
    let t = Object.keys(e.responses);
    return t.length === 0 || t.length === 1 && t[0] === "default";
  }
  function Mkd(e, t, n, r) {
    var o;
    var s;
    var i;
    var a;
    var l;
    let c = 200 <= e.status && e.status < 300;
    if (Dkd(t) ? c : !!n) {
      if (n) {
        if (!n.isError) {
          return {
            error: null,
            shouldReturnResponse: false
          };
        }
      } else {
        return {
          error: null,
          shouldReturnResponse: false
        };
      }
    }
    let d = n !== null && n !== undefined ? n : t.responses.default;
    let p = ((o = e.request.streamResponseStatusCodes) === null || o === undefined ? undefined : o.vZc(e.status)) ? `Unexpected status code: ${e.status}` : e.bodyAsText;
    let m = new NW(p, {
      statusCode: e.status,
      request: e.request,
      response: e
    });
    if (!d && !(((i = (s = e.parsedBody) === null || s === undefined ? undefined : s.error) === null || i === undefined ? undefined : i.code) && ((l = (a = e.parsedBody) === null || a === undefined ? undefined : a.error) === null || l === undefined ? undefined : l.message))) {
      throw m;
    }
    let f = d === null || d === undefined ? undefined : d.bodyMapper;
    let h = d === null || d === undefined ? undefined : d.headersMapper;
    try {
      if (e.parsedBody) {
        let g = e.parsedBody;
        let y;
        if (f) {
          let b = g;
          if (t.isXML && f.type.name === D_e.Sequence) {
            b = [];
            let S = f.xmlElementName;
            if (typeof g === "object" && S) {
              b = g[S];
            }
          }
          y = t.serializer.deserialize(f, b, "error.response.parsedBody", r);
        }
        let _ = g.error || y || g;
        if (m.code = _.code, _.message) {
          m.message = _.message;
        }
        if (f) {
          m.response.parsedBody = y;
        }
      }
      if (e.headers && h) {
        m.response.parsedHeaders = t.serializer.deserialize(h, e.headers.toJSON(), "operationRes.parsedHeaders");
      }
    } catch (g) {
      m.message = `Error "${g.message}" occurred in deserializing the responseBody - "${e.bodyAsText}" for the default response.`;
    }
    return {
      error: m,
      shouldReturnResponse: false
    };
  }
  async function Nkd(e, t, n, r, o) {
    var s;
    if (!((s = n.request.streamResponseStatusCodes) === null || s === undefined ? undefined : s.vZc(n.status)) && n.bodyAsText) {
      let i = n.bodyAsText;
      let a = n.headers.get("Content-Type") || "";
      let l = !a ? [] : a.split(";").map(c => c.toLowerCase());
      try {
        if (l.length === 0 || l.some(c => e.indexOf(c) !== -1)) {
          n.parsedBody = JSON.parse(i);
          return n;
        } else if (l.some(c => t.indexOf(c) !== -1)) {
          if (!o) {
            throw Error("Parsing XML not supported.");
          }
          let c = await o(i, r.xml);
          n.parsedBody = c;
          return n;
        }
      } catch (c) {
        let u = `Error "${c}" occurred while parsing the response body - ${n.bodyAsText}.`;
        let d = c.code || NW.PARSE_ERROR;
        throw new NW(u, {
          code: d,
          statusCode: n.status,
          request: n.request,
          response: n
        });
      }
    }
    return n;
  }
  var xkd;
  var kkd;
  var TEi = __lazy(() => {
    ace();
    Qxn();
    RFt();
    xkd = ["application/json", "text/json"];
    kkd = ["application/xml", "application/atom+xml"];
  });
  function EEi(e) {
    let t = new Set();
    for (let n in e.responses) {
      let r = e.responses[n];
      if (r.bodyMapper && r.bodyMapper.type.name === D_e.Stream) {
        t.add(Number(n));
      }
    }
    return t;
  }
  function lce(e) {
    let {
      parameterPath: t,
      mapper: n
    } = e;
    let r;
    if (typeof t === "string") {
      r = t;
    } else if (Array.isArray(t)) {
      r = t.join(".");
    } else {
      r = n.serializedName;
    }
    return r;
  }
  var ekn = __lazy(() => {
    Qxn();
  });
  function vEi(e = {}) {
    let t = e.stringifyXML;
    return {
      name: "serializationPolicy",
      async sendRequest(n, r) {
        let o = M_e(n);
        let s = o === null || o === undefined ? undefined : o.operationSpec;
        let i = o === null || o === undefined ? undefined : o.operationArguments;
        if (s && i) {
          Fkd(n, i, s);
          Ukd(n, i, s, t);
        }
        return r(n);
      }
    };
  }
  function Fkd(e, t, n) {
    var r;
    var o;
    if (n.headerParameters) {
      for (let i of n.headerParameters) {
        let a = I0e(t, i);
        if (a !== null && a !== undefined || i.mapper.required) {
          a = n.serializer.serialize(i.mapper, a, lce(i));
          let l = i.mapper.headerCollectionPrefix;
          if (l) {
            for (let c of Object.keys(a)) {
              e.headers.set(l + c, a[c]);
            }
          } else {
            e.headers.set(i.mapper.serializedName || lce(i), a);
          }
        }
      }
    }
    let s = (o = (r = t.options) === null || r === undefined ? undefined : r.requestOptions) === null || o === undefined ? undefined : o.customHeaders;
    if (s) {
      for (let i of Object.keys(s)) {
        e.headers.set(i, s[i]);
      }
    }
  }
  function Ukd(e, t, n, r = function () {
    throw Error("XML serialization unsupported!");
  }) {
    var o;
    var s;
    var i;
    var a;
    var l;
    let c = (o = t.options) === null || o === undefined ? undefined : o.serializerOptions;
    let u = {
      xml: {
        rootName: (s = c === null || c === undefined ? undefined : c.xml.rootName) !== null && s !== undefined ? s : "",
        includeRoot: (i = c === null || c === undefined ? undefined : c.xml.includeRoot) !== null && i !== undefined ? i : false,
        xmlCharKey: (a = c === null || c === undefined ? undefined : c.xml.xmlCharKey) !== null && a !== undefined ? a : "_"
      }
    };
    let d = u.xml.xmlCharKey;
    if (n.requestBody && n.requestBody.mapper) {
      e.body = I0e(t, n.requestBody);
      let p = n.requestBody.mapper;
      let {
        required: m,
        serializedName: f,
        xmlName: h,
        xmlElementName: g,
        xmlNamespace: y,
        xmlNamespacePrefix: _,
        nullable: b
      } = p;
      let S = p.type.name;
      try {
        if (e.body !== undefined && e.body !== null || b && e.body === null || m) {
          let E = lce(n.requestBody);
          e.body = n.serializer.serialize(p, e.body, E, u);
          let C = S === D_e.Stream;
          if (n.isXML) {
            let x = _ ? `xmlns:${_}` : "xmlns";
            let A = Bkd(y, x, S, e.body, u);
            if (S === D_e.Sequence) {
              e.body = r($kd(A, g || h || f, x, y), {
                rootName: h || f,
                xmlCharKey: d
              });
            } else if (!C) {
              e.body = r(A, {
                rootName: h || f,
                xmlCharKey: d
              });
            }
          } else if (S === D_e.String && (((l = n.contentType) === null || l === undefined ? undefined : l.match("text/plain")) || n.mediaType === "text")) {
            return;
          } else if (!C) {
            e.body = JSON.stringify(e.body);
          }
        }
      } catch (E) {
        throw Error(`Error "${E.message}" occurred in serializing the payload - ${JSON.stringify(f, undefined, "  ")}.`);
      }
    } else if (n.formDataParameters && n.formDataParameters.length > 0) {
      e.formData = {};
      for (let p of n.formDataParameters) {
        let m = I0e(t, p);
        if (m !== undefined && m !== null) {
          let f = p.mapper.serializedName || lce(p);
          e.formData[f] = n.serializer.serialize(p.mapper, m, lce(p), u);
        }
      }
    }
  }
  function Bkd(e, t, n, r, o) {
    if (e && !["Composite", "Sequence", "Dictionary"].includes(n)) {
      let s = {};
      s[o.xml.xmlCharKey] = r;
      s["$"] = {
        [t]: e
      };
      return s;
    }
    return r;
  }
  function $kd(e, t, n, r) {
    if (!Array.isArray(e)) {
      e = [e];
    }
    if (!n || !r) {
      return {
        [t]: e
      };
    }
    let o = {
      [t]: e
    };
    o["$"] = {
      [n]: r
    };
    return o;
  }
  var wEi = __lazy(() => {
    RFt();
    Qxn();
    ekn();
  });
  function CEi(e = {}) {
    let t = $5r(e !== null && e !== undefined ? e : {});
    if (e.credentialOptions) {
      t.addPolicy(CFt({
        credential: e.credentialOptions.credential,
        scopes: e.credentialOptions.credentialScopes
      }));
    }
    t.addPolicy(vEi(e.serializationOptions), {
      phase: "Serialize"
    });
    t.addPolicy(SEi(e.deserializationOptions), {
      phase: "Deserialize"
    });
    return t;
  }
  var REi = __lazy(() => {
    TEi();
    ace();
    wEi();
  });
  function xEi() {
    if (!z5r) {
      z5r = H5r();
    }
    return z5r;
  }
  var z5r;
  var kEi = __lazy(() => {
    ace();
  });
  function IEi(e, t, n, r) {
    let o = jkd(t, n, r);
    let s = false;
    let i = AEi(e, o);
    if (t.path) {
      let c = AEi(t.path, o);
      if (t.path === "/{nextLink}" && c.startsWith("/")) {
        c = c.substring(1);
      }
      if (qkd(c)) {
        i = c;
        s = true;
      } else {
        i = Wkd(i, c);
      }
    }
    let {
      queryParams: a,
      sequenceParams: l
    } = Gkd(t, n, r);
    i = zkd(i, a, l, s);
    return i;
  }
  function AEi(e, t) {
    let n = e;
    for (let [r, o] of t) {
      n = n.split(r).join(o);
    }
    return n;
  }
  function jkd(e, t, n) {
    var r;
    let o = new Map();
    if ((r = e.urlParameters) === null || r === undefined ? undefined : r.length) {
      for (let s of e.urlParameters) {
        let i = I0e(t, s, n);
        let a = lce(s);
        if (i = e.serializer.serialize(s.mapper, i, a), !s.skipEncoding) {
          i = encodeURIComponent(i);
        }
        o.set(`{${s.mapper.serializedName || a}}`, i);
      }
    }
    return o;
  }
  function qkd(e) {
    return e.includes("://");
  }
  function Wkd(e, t) {
    if (!t) {
      return e;
    }
    let n = new URL(e);
    let r = n.pathname;
    if (!r.endsWith("/")) {
      r = `${r}/`;
    }
    if (t.startsWith("/")) {
      t = t.substring(1);
    }
    let o = t.indexOf("?");
    if (o !== -1) {
      let s = t.substring(0, o);
      let i = t.substring(o + 1);
      if (r = r + s, i) {
        n.search = n.search ? `${n.search}&${i}` : i;
      }
    } else {
      r = r + t;
    }
    n.pathname = r;
    return n.toString();
  }
  function Gkd(e, t, n) {
    var r;
    let o = new Map();
    let s = new Set();
    if ((r = e.queryParameters) === null || r === undefined ? undefined : r.length) {
      for (let i of e.queryParameters) {
        if (i.mapper.type.name === "Sequence" && i.mapper.serializedName) {
          s.add(i.mapper.serializedName);
        }
        let a = I0e(t, i, n);
        if (a !== undefined && a !== null || i.mapper.required) {
          a = e.serializer.serialize(i.mapper, a, lce(i));
          let l = i.collectionFormat ? Hkd[i.collectionFormat] : "";
          if (Array.isArray(a)) {
            a = a.map(c => {
              if (c === null || c === undefined) {
                return "";
              }
              return c;
            });
          }
          if (i.collectionFormat === "Multi" && a.length === 0) {
            continue;
          } else if (Array.isArray(a) && (i.collectionFormat === "SSV" || i.collectionFormat === "TSV")) {
            a = a.join(l);
          }
          if (!i.skipEncoding) {
            if (Array.isArray(a)) {
              a = a.map(c => encodeURIComponent(c));
            } else {
              a = encodeURIComponent(a);
            }
          }
          if (Array.isArray(a) && (i.collectionFormat === "CSV" || i.collectionFormat === "Pipes")) {
            a = a.join(l);
          }
          o.set(i.mapper.serializedName || lce(i), a);
        }
      }
    }
    return {
      queryParams: o,
      sequenceParams: s
    };
  }
  function Vkd(e) {
    let t = new Map();
    if (!e || e[0] !== "?") {
      return t;
    }
    e = e.slice(1);
    let n = e.split("&");
    for (let r of n) {
      let [o, s] = r.split("=", 2);
      let i = t.get(o);
      if (i) {
        if (Array.isArray(i)) {
          i.push(s);
        } else {
          t.set(o, [i, s]);
        }
      } else {
        t.set(o, s);
      }
    }
    return t;
  }
  function zkd(e, t, n, r = false) {
    if (t.size === 0) {
      return e;
    }
    let o = new URL(e);
    let s = Vkd(o.search);
    for (let [a, l] of t) {
      let c = s.get(a);
      if (Array.isArray(c)) {
        if (Array.isArray(l)) {
          c.push(...l);
          let u = new Set(c);
          s.set(a, Array.from(u));
        } else {
          c.push(l);
        }
      } else if (c) {
        if (Array.isArray(l)) {
          l.unshift(c);
        } else if (n.vZc(a)) {
          s.set(a, [c, l]);
        }
        if (!r) {
          s.set(a, l);
        }
      } else {
        s.set(a, l);
      }
    }
    let i = [];
    for (let [a, l] of s) {
      if (typeof l === "string") {
        i.push(`${a}=${l}`);
      } else if (Array.isArray(l)) {
        for (let c of l) {
          i.push(`${a}=${c}`);
        }
      } else {
        i.push(`${a}=${l}`);
      }
    }
    o.search = i.length ? `?${i.join("&")}` : "";
    return o.toString();
  }
  var Hkd;
  var PEi = __lazy(() => {
    RFt();
    ekn();
    Hkd = {
      CSV: ",",
      SSV: " ",
      Multi: "Multi",
      TSV: "\t",
      Pipes: "|"
    };
  });
  var OEi;
  var DEi = __lazy(() => {
    Kqe();
    OEi = x0e("core-client");
  });
  class tkn {
    constructor(e = {}) {
      var t;
      var n;
      if (this._requestContentType = e.requestContentType, this._endpoint = (t = e.endpoint) !== null && t !== undefined ? t : e.baseUri, e.baseUri) {
        OEi.warning("The baseUri option for SDK Clients has been deprecated, please use endpoint instead.");
      }
      if (this._allowInsecureConnection = e.allowInsecureConnection, this._httpClient = e.httpClient || xEi(), this.pipeline = e.pipeline || Kkd(e), (n = e.additionalPolicies) === null || n === undefined ? undefined : n.length) {
        for (let {
          policy: r,
          position: o
        } of e.additionalPolicies) {
          let s = o === "perRetry" ? "Sign" : undefined;
          this.pipeline.addPolicy(r, {
            afterPhase: s
          });
        }
      }
    }
    async sendRequest(e) {
      return this.pipeline.sendRequest(this._httpClient, e);
    }
    async sendOperationRequest(e, t) {
      let n = t.baseUrl || this._endpoint;
      if (!n) {
        throw Error("If operationSpec.baseUrl is not specified, then the ServiceClient must have a endpoint string property that contains the base URL to use.");
      }
      let r = IEi(n, t, e, this);
      let o = h8({
        url: r
      });
      o.method = t.httpMethod;
      let s = M_e(o);
      s.operationSpec = t;
      s.operationArguments = e;
      let i = t.contentType || this._requestContentType;
      if (i && t.requestBody) {
        o.headers.set("Content-Type", i);
      }
      let a = e.options;
      if (a) {
        let l = a.requestOptions;
        if (l) {
          if (l.timeout) {
            o.timeout = l.timeout;
          }
          if (l.onUploadProgress) {
            o.onUploadProgress = l.onUploadProgress;
          }
          if (l.onDownloadProgress) {
            o.onDownloadProgress = l.onDownloadProgress;
          }
          if (l.shouldDeserialize !== undefined) {
            s.shouldDeserialize = l.shouldDeserialize;
          }
          if (l.allowInsecureConnection) {
            o.allowInsecureConnection = true;
          }
        }
        if (a.abortSignal) {
          o.abortSignal = a.abortSignal;
        }
        if (a.tracingOptions) {
          o.tracingOptions = a.tracingOptions;
        }
      }
      if (this._allowInsecureConnection) {
        o.allowInsecureConnection = true;
      }
      if (o.streamResponseStatusCodes === undefined) {
        o.streamResponseStatusCodes = EEi(t);
      }
      try {
        let l = await this.sendRequest(o);
        let c = G5r(l, t.responses[l.status]);
        if (a === null || a === undefined ? undefined : a.onResponse) {
          a.onResponse(l, c);
        }
        return c;
      } catch (l) {
        if (typeof l === "object" && (l === null || l === undefined ? undefined : l.response)) {
          let c = l.response;
          let u = G5r(c, t.responses[l.statusCode] || t.responses.default);
          if (l.details = u, a === null || a === undefined ? undefined : a.onResponse) {
            a.onResponse(c, u, l);
          }
        }
        throw l;
      }
    }
  }
  function Kkd(e) {
    let t = Ykd(e);
    let n = e.credential && t ? {
      credentialScopes: t,
      credential: e.credential
    } : undefined;
    return CEi(Object.assign(Object.assign({}, e), {
      credentialOptions: n
    }));
  }
  function Ykd(e) {
    if (e.credentialScopes) {
      return e.credentialScopes;
    }
    if (e.endpoint) {
      return `${e.endpoint}/.default`;
    }
    if (e.baseUri) {
      return `${e.baseUri}/.default`;
    }
    if (e.credential && !e.credentialScopes) {
      throw Error("When using credentials, the ServiceClientOptions must contain either a endpoint or a credentialScopes. Unable to create a bearerTokenAuthenticationPolicy");
    }
    return;
  }
  var MEi = __lazy(() => {
    ace();
    REi();
    fEi();
    kEi();
    RFt();
    PEi();
    ekn();
    DEi();
  });
  var BEi = __lazy(() => {
    MEi();
  });
  function $Ei(e) {
    if (e === "adfs") {
      return "oauth2/token";
    } else {
      return "oauth2/v2.0/token";
    }
  }
  var xy;
  var OF = __lazy(() => {
    rce();
    B5r();
    xy = vFt({
      namespace: "Microsoft.AAD",
      packageName: "@azure/identity",
      packageVersion: "4.10.1"
    });
  });
  function xFt(e) {
    let t = "";
    if (Array.isArray(e)) {
      if (e.length !== 1) {
        return;
      }
      t = e[0];
    } else if (typeof e === "string") {
      t = e;
    }
    if (!t.endsWith("/.default")) {
      return t;
    }
    return t.substr(0, t.lastIndexOf("/.default"));
  }
  function jEi(e) {
    if (typeof e.expires_on === "number") {
      return e.expires_on * 1000;
    }
    if (typeof e.expires_on === "string") {
      let t = +e.expires_on;
      if (!isNaN(t)) {
        return t * 1000;
      }
      let n = Date.parse(e.expires_on);
      if (!isNaN(n)) {
        return n;
      }
    }
    if (typeof e.expires_in === "number") {
      return Date.now() + e.expires_in * 1000;
    }
    throw Error(`Failed to parse token expiration from body. expires_in="${e.expires_in}", expires_on="${e.expires_on}"`);
  }
  function qEi(e) {
    if (e.refresh_on) {
      if (typeof e.refresh_on === "number") {
        return e.refresh_on * 1000;
      }
      if (typeof e.refresh_on === "string") {
        let t = +e.refresh_on;
        if (!isNaN(t)) {
          return t * 1000;
        }
        let n = Date.parse(e.refresh_on);
        if (!isNaN(n)) {
          return n;
        }
      }
      throw Error(`Failed to parse refresh_on from body. refresh_on="${e.refresh_on}"`);
    } else {
      return;
    }
  }
  function Zkd(e) {
    let t = e === null || e === undefined ? undefined : e.authorityHost;
    if (Bst) {
      t = t !== null && t !== undefined ? t : process.env.AZURE_AUTHORITY_HOST;
    }
    return t !== null && t !== undefined ? t : lFt;
  }
  var cce;
  var AFt = __lazy(() => {
    BEi();
    ace();
    XD();
    rce();
    OF();
    KT();
    cce = class cce extends tkn {
      constructor(e) {
        var t;
        var n;
        let r = `azsdk-js-identity/${"4.10.1"}`;
        let o = ((t = e === null || e === undefined ? undefined : e.userAgentOptions) === null || t === undefined ? undefined : t.userAgentPrefix) ? `${e.userAgentOptions.userAgentPrefix} ${r}` : `${r}`;
        let s = Zkd(e);
        if (!s.startsWith("https:")) {
          throw Error("The authorityHost address must use the 'https' protocol.");
        }
        super(Object.assign(Object.assign({
          requestContentType: "application/json; charset=utf-8",
          retryOptions: {
            maxRetries: 3
          }
        }, e), {
          userAgentOptions: {
            userAgentPrefix: o
          },
          baseUri: s
        }));
        if (this.allowInsecureConnection = false, this.authorityHost = s, this.abortControllers = new Map(), this.allowLoggingAccountIdentifiers = (n = e === null || e === undefined ? undefined : e.loggingOptions) === null || n === undefined ? undefined : n.allowLoggingAccountIdentifiers, this.tokenCredentialOptions = Object.assign({}, e), e === null || e === undefined ? undefined : e.allowInsecureConnection) {
          this.allowInsecureConnection = e.allowInsecureConnection;
        }
      }
      async sendTokenRequest(e) {
        logger.info(`IdentityClient: sending token request to [${e.url}]`);
        let t = await this.sendRequest(e);
        if (t.bodyAsText && (t.status === 200 || t.status === 201)) {
          let n = JSON.parse(t.bodyAsText);
          if (!n.access_token) {
            return null;
          }
          this.logIdentifiers(t);
          let r = {
            accessToken: {
              token: n.access_token,
              expiresOnTimestamp: jEi(n),
              refreshAfterTimestamp: qEi(n),
              tokenType: "Bearer"
            },
            refreshToken: n.refresh_token
          };
          logger.info(`IdentityClient: [${e.url}] token acquired, expires on ${r.accessToken.expiresOnTimestamp}`);
          return r;
        } else {
          let n = new AuthenticationError(t.status, t.bodyAsText);
          throw logger.warning(`IdentityClient: authentication error. HTTP status: ${t.status}, ${n.errorResponse.errorDescription}`), n;
        }
      }
      async refreshAccessToken(e, t, n, r, o, s = {}) {
        if (r === undefined) {
          return null;
        }
        logger.info(`IdentityClient: refreshing access token with client ID: ${t}, scopes: ${n} started`);
        let i = {
          grant_type: "refresh_token",
          client_id: t,
          refresh_token: r,
          scope: n
        };
        if (o !== undefined) {
          i.client_secret = o;
        }
        let a = new URLSearchParams(i);
        return xy.withSpan("IdentityClient.refreshAccessToken", s, async l => {
          try {
            let c = $Ei(e);
            let u = h8({
              url: `${this.authorityHost}/${e}/${c}`,
              method: "POST",
              body: a.toString(),
              abortSignal: s.abortSignal,
              headers: O_e({
                Accept: "application/json",
                "Content-Type": "application/x-www-form-urlencoded"
              }),
              tracingOptions: l.tracingOptions
            });
            let d = await this.sendTokenRequest(u);
            logger.info(`IdentityClient: refreshed token for client ID: ${t}`);
            return d;
          } catch (c) {
            if (c.name === "AuthenticationError" && c.errorResponse.error === "interaction_required") {
              logger.info(`IdentityClient: interaction required for client ID: ${t}`);
              return null;
            } else {
              throw logger.warning(`IdentityClient: failed refreshing token for client ID: ${t}: ${c}`), c;
            }
          }
        });
      }
      generateAbortSignal(e) {
        let t = new AbortController();
        let n = this.abortControllers.get(e) || [];
        n.push(t);
        this.abortControllers.set(e, n);
        let r = t.signal.onabort;
        t.signal.onabort = (...o) => {
          if (this.abortControllers.set(e, undefined), r) {
            r.apply(t.signal, o);
          }
        };
        return t.signal;
      }
      abortRequests(e) {
        let t = e || "noCorrelationId";
        let n = [...(this.abortControllers.get(t) || []), ...(this.abortControllers.get("noCorrelationId") || [])];
        if (!n.length) {
          return;
        }
        for (let r of n) {
          r.abort();
        }
        this.abortControllers.set(t, undefined);
      }
      getCorrelationId(e) {
        var t;
        let n = (t = e === null || e === undefined ? undefined : e.body) === null || t === undefined ? undefined : t.split("&").map(r => r.split("=")).find(([r]) => r === "client-request-id");
        return n && n.length ? n[1] || "noCorrelationId" : "noCorrelationId";
      }
      async sendGetRequestAsync(e, t) {
        let n = h8({
          url: e,
          method: "GET",
          body: t === null || t === undefined ? undefined : t.body,
          allowInsecureConnection: this.allowInsecureConnection,
          headers: O_e(t === null || t === undefined ? undefined : t.headers),
          abortSignal: this.generateAbortSignal("noCorrelationId")
        });
        let r = await this.sendRequest(n);
        this.logIdentifiers(r);
        return {
          body: r.bodyAsText ? JSON.parse(r.bodyAsText) : undefined,
          headers: r.headers.toJSON(),
          status: r.status
        };
      }
      async sendPostRequestAsync(e, t) {
        let n = h8({
          url: e,
          method: "POST",
          body: t === null || t === undefined ? undefined : t.body,
          headers: O_e(t === null || t === undefined ? undefined : t.headers),
          allowInsecureConnection: this.allowInsecureConnection,
          abortSignal: this.generateAbortSignal(this.getCorrelationId(t))
        });
        let r = await this.sendRequest(n);
        this.logIdentifiers(r);
        return {
          body: r.bodyAsText ? JSON.parse(r.bodyAsText) : undefined,
          headers: r.headers.toJSON(),
          status: r.status
        };
      }
      getTokenCredentialOptions() {
        return this.tokenCredentialOptions;
      }
      logIdentifiers(e) {
        if (!this.allowLoggingAccountIdentifiers || !e.bodyAsText) {
          return;
        }
        let t = "No User Principal Name available";
        try {
          let r = (e.parsedBody || JSON.parse(e.bodyAsText)).access_token;
          if (!r) {
            return;
          }
          let o = r.split(".")[1];
          let {
            appid: s,
            upn: i,
            tid: a,
            oid: l
          } = JSON.parse(Buffer.from(o, "base64").toString("utf8"));
          logger.info(`[Authenticated account] Client ID: ${s}. Tenant ID: ${a}. User Principal Name: ${i || t}. Object ID (user): ${l}`);
        } catch (n) {
          logger.warning("allowLoggingAccountIdentifiers was set, but we couldn't log the account information. Error:", n.message);
        }
      }
    };
  });
  function WEi(e) {
    let t = nAd[e];
    if (t) {
      throw new CredentialUnavailableError(t);
    }
  }
  function GEi(e) {
    let t = ["User", "settings.json"];
    let n = "Code";
    let r = zEi.default.homedir();
    function o(...s) {
      let i = KEi.default.join(...s, "Code", ...t);
      return JSON.parse(VEi.default.readFileSync(i, {
        encoding: "utf8"
      }))[e];
    }
    try {
      let s;
      switch ("linux") {
        case "win32":
          s = process.env.APPDATA;
          return s ? o(s) : undefined;
        case "darwin":
          return o(r, "Library", "Application Support");
        case "linux":
          return o(r, ".config");
        default:
          return;
      }
    } catch (s) {
      Jqe.info(`Failed to load the Visual Studio Code configuration file. Error: ${s.message}`);
      return;
    }
  }
  class VisualStudioCodeCredential {
    constructor(e) {
      this.cloudName = GEi("azure.cloud") || "AzureCloud";
      let t = rAd[this.cloudName];
      if (this.identityClient = new cce(Object.assign({
        authorityHost: t
      }, e)), e && e.tenantId) {
        KP(Jqe, e.tenantId);
        this.tenantId = e.tenantId;
      } else {
        this.tenantId = "common";
      }
      this.additionallyAllowedTenantIds = ex(e === null || e === undefined ? undefined : e.additionallyAllowedTenants);
      WEi(this.tenantId);
    }
    async prepare() {
      let e = GEi("azure.tenant");
      if (e) {
        this.tenantId = e;
      }
      WEi(this.tenantId);
    }
    prepareOnce() {
      if (!this.preparePromise) {
        this.preparePromise = this.prepare();
      }
      return this.preparePromise;
    }
    async getToken(e, t) {
      var n;
      var r;
      await this.prepareOnce();
      let o = kC(this.tenantId, t, this.additionallyAllowedTenantIds, Jqe) || this.tenantId;
      if (K5r === undefined) {
        throw new CredentialUnavailableError(["No implementation of `VisualStudioCodeCredential` is available.", "You must install the identity-vscode plugin package (`npm install --save-dev @azure/identity-vscode`)", "and enable it by importing `useIdentityPlugin` from `@azure/identity` and calling", "`useIdentityPlugin(vsCodePlugin)` before creating a `VisualStudioCodeCredential`.", "To troubleshoot, visit https://aka.ms/azsdk/js/identity/vscodecredential/troubleshoot."].join(" "));
      }
      let s = typeof e === "string" ? e : e.join(" ");
      if (!s.match(/^[0-9a-zA-Z-.:/]+$/)) {
        let l = Error("Invalid scope was specified by the user or calling client");
        throw Jqe.getToken.info(gg(e, l)), l;
      }
      if (s.indexOf("offline_access") < 0) {
        s += " offline_access";
      }
      let i = await K5r();
      let {
        password: a
      } = (r = (n = i.find(({
        account: l
      }) => l === this.cloudName)) !== null && n !== undefined ? n : i[0]) !== null && r !== undefined ? r : {};
      if (a) {
        let l = await this.identityClient.refreshAccessToken(o, "aebc6443-996d-45c2-90f0-388ff96faa56", s, a, undefined);
        if (l) {
          Jqe.getToken.info(zP(e));
          return l.accessToken;
        } else {
          let c = new CredentialUnavailableError("Could not retrieve the token associated with Visual Studio Code. Have you connected using the 'Azure Account' extension recently? To troubleshoot, visit https://aka.ms/azsdk/js/identity/vscodecredential/troubleshoot.");
          throw Jqe.getToken.info(gg(e, c)), c;
        }
      } else {
        let l = new CredentialUnavailableError("Could not retrieve the token associated with Visual Studio Code. Did you connect using the 'Azure Account' extension? To troubleshoot, visit https://aka.ms/azsdk/js/identity/vscodecredential/troubleshoot.");
        throw Jqe.getToken.info(gg(e, l)), l;
      }
    }
  }
  var VEi;
  var zEi;
  var KEi;
  var Jqe;
  var K5r = undefined;
  var YEi;
  var nAd;
  var rAd;
  var J5r = __lazy(() => {
    KT();
    QD();
    rce();
    XD();
    AFt();
    QD();
    VEi = __toESM(require("fs"));
    zEi = __toESM(require("os"));
    KEi = __toESM(require("path"));
    Jqe = om("VisualStudioCodeCredential");
    YEi = {
      setVsCodeCredentialFinder(e) {
        K5r = e;
      }
    };
    nAd = {
      adfs: "The VisualStudioCodeCredential does not support authentication with ADFS tenants."
    };
    rAd = {
      AzureCloud: AzureAuthorityHosts.AzurePublicCloud,
      AzureChina: AzureAuthorityHosts.AzureChina,
      AzureGermanCloud: AzureAuthorityHosts.AzureGermany,
      AzureUSGovernment: AzureAuthorityHosts.AzureGovernment
    };
  });
  function useIdentityPlugin(e) {
    e(oAd);
  }
  var oAd;
  var JEi = __lazy(() => {
    j9r();
    J5r();
    oAd = {
      cachePluginControl: Cbi,
      nativeBrokerPluginControl: Rbi,
      vsCodeCredentialControl: YEi
    };
  });
  class Serializer {
    static serializeJSONBlob(e) {
      return JSON.stringify(e);
    }
    static serializeAccounts(e) {
      let t = {};
      Object.keys(e).map(function (n) {
        let r = e[n];
        t[n] = {
          home_account_id: r.homeAccountId,
          environment: r.environment,
          realm: r.realm,
          local_account_id: r.localAccountId,
          username: r.username,
          authority_type: r.authorityType,
          name: r.name,
          client_info: r.clientInfo,
          last_modification_time: r.lastModificationTime,
          last_modification_app: r.lastModificationApp,
          tenantProfiles: r.tenantProfiles?.map(o => JSON.stringify(o))
        };
      });
      return t;
    }
    static serializeIdTokens(e) {
      let t = {};
      Object.keys(e).map(function (n) {
        let r = e[n];
        t[n] = {
          home_account_id: r.homeAccountId,
          environment: r.environment,
          credential_type: r.credentialType,
          client_id: r.clientId,
          secret: r.secret,
          realm: r.realm
        };
      });
      return t;
    }
    static serializeAccessTokens(e) {
      let t = {};
      Object.keys(e).map(function (n) {
        let r = e[n];
        t[n] = {
          home_account_id: r.homeAccountId,
          environment: r.environment,
          credential_type: r.credentialType,
          client_id: r.clientId,
          secret: r.secret,
          realm: r.realm,
          target: r.target,
          cached_at: r.cachedAt,
          expires_on: r.expiresOn,
          extended_expires_on: r.extendedExpiresOn,
          refresh_on: r.refreshOn,
          key_id: r.keyId,
          token_type: r.tokenType,
          requestedClaims: r.requestedClaims,
          requestedClaimsHash: r.requestedClaimsHash,
          userAssertionHash: r.userAssertionHash
        };
      });
      return t;
    }
    static serializeRefreshTokens(e) {
      let t = {};
      Object.keys(e).map(function (n) {
        let r = e[n];
        t[n] = {
          home_account_id: r.homeAccountId,
          environment: r.environment,
          credential_type: r.credentialType,
          client_id: r.clientId,
          secret: r.secret,
          family_id: r.familyId,
          target: r.target,
          realm: r.realm
        };
      });
      return t;
    }
    static serializeAppMetadata(e) {
      let t = {};
      Object.keys(e).map(function (n) {
        let r = e[n];
        t[n] = {
          client_id: r.clientId,
          environment: r.environment,
          family_id: r.familyId
        };
      });
      return t;
    }
    static serializeAllCache(e) {
      return {
        Account: this.serializeAccounts(e.accounts),
        IdToken: this.serializeIdTokens(e.idTokens),
        AccessToken: this.serializeAccessTokens(e.accessTokens),
        RefreshToken: this.serializeRefreshTokens(e.refreshTokens),
        AppMetadata: this.serializeAppMetadata(e.appMetadata)
      };
    }
  }
  var nkn = __lazy(() => {/*! @azure/msal-node v3.8.1 2025-10-29 */});
  var xo;
  var Wp;
  var g2;
  var X5r;
  var iw;
  var LW;
  var Qqe;
  var PromptValue;
  var rkn;
  var Vst;
  var ResponseMode;
  var FW;
  var Zqe;
  var N_e;
  var aS;
  var zst;
  var $j;
  var ZD;
  var Hh;
  var dce;
  var PFt;
  var OFt;
  var e3e;
  var okn;
  var cv;
  var DF;
  var aw = __lazy(() => {
    /*! @azure/msal-common v15.13.1 2025-10-29 */
    xo = {
      LIBRARY_NAME: "MSAL.JS",
      SKU: "msal.js.common",
      DEFAULT_AUTHORITY: "https://login.microsoftonline.com/common/",
      DEFAULT_AUTHORITY_HOST: "login.microsoftonline.com",
      DEFAULT_COMMON_TENANT: "common",
      ADFS: "adfs",
      DSTS: "dstsv2",
      AAD_INSTANCE_DISCOVERY_ENDPT: "https://login.microsoftonline.com/common/discovery/instance?api-version=1.1&authorization_endpoint=",
      CIAM_AUTH_URL: ".ciamlogin.com",
      AAD_TENANT_DOMAIN_SUFFIX: ".onmicrosoft.com",
      RESOURCE_DELIM: "|",
      NO_ACCOUNT: "NO_ACCOUNT",
      CLAIMS: "claims",
      CONSUMER_UTID: "9188040d-6c67-4c5b-b112-36a304b66dad",
      OPENID_SCOPE: "openid",
      PROFILE_SCOPE: "profile",
      OFFLINE_ACCESS_SCOPE: "offline_access",
      EMAIL_SCOPE: "email",
      CODE_GRANT_TYPE: "authorization_code",
      RT_GRANT_TYPE: "refresh_token",
      S256_CODE_CHALLENGE_METHOD: "S256",
      URL_FORM_CONTENT_TYPE: "application/x-www-form-urlencoded;charset=utf-8",
      AUTHORIZATION_PENDING: "authorization_pending",
      NOT_DEFINED: "not_defined",
      EMPTY_STRING: "",
      NOT_APPLICABLE: "N/A",
      NOT_AVAILABLE: "Not Available",
      FORWARD_SLASH: "/",
      IMDS_ENDPOINT: "http://169.254.169.254/metadata/instance/compute/location",
      IMDS_VERSION: "2020-06-01",
      IMDS_TIMEOUT: 2000,
      AZURE_REGION_AUTO_DISCOVER_FLAG: "TryAutoDetect",
      REGIONAL_AUTH_PUBLIC_CLOUD_SUFFIX: "login.microsoft.com",
      KNOWN_PUBLIC_CLOUDS: ["login.microsoftonline.com", "login.windows.net", "login.microsoft.com", "sts.windows.net"],
      SHR_NONCE_VALIDITY: 240,
      INVALID_INSTANCE: "invalid_instance"
    };
    Wp = {
      SUCCESS: 200,
      SUCCESS_RANGE_START: 200,
      SUCCESS_RANGE_END: 299,
      REDIRECT: 302,
      CLIENT_ERROR: 400,
      CLIENT_ERROR_RANGE_START: 400,
      BAD_REQUEST: 400,
      UNAUTHORIZED: 401,
      NOT_FOUND: 404,
      REQUEST_TIMEOUT: 408,
      GONE: 410,
      TOO_MANY_REQUESTS: 429,
      CLIENT_ERROR_RANGE_END: 499,
      SERVER_ERROR: 500,
      SERVER_ERROR_RANGE_START: 500,
      SERVICE_UNAVAILABLE: 503,
      GATEWAY_TIMEOUT: 504,
      SERVER_ERROR_RANGE_END: 599,
      MULTI_SIDED_ERROR: 600
    };
    g2 = [xo.OPENID_SCOPE, xo.PROFILE_SCOPE, xo.OFFLINE_ACCESS_SCOPE];
    X5r = [...g2, xo.EMAIL_SCOPE];
    iw = {
      CONTENT_TYPE: "Content-Type",
      CONTENT_LENGTH: "Content-Length",
      RETRY_AFTER: "Retry-After",
      CCS_HEADER: "X-AnchorMailbox",
      WWWAuthenticate: "WWW-Authenticate",
      AuthenticationInfo: "Authentication-Info",
      X_MS_REQUEST_ID: "x-ms-request-id",
      X_MS_HTTP_VERSION: "x-ms-httpver"
    };
    LW = {
      COMMON: "common",
      ORGANIZATIONS: "organizations",
      CONSUMERS: "consumers"
    };
    Qqe = {
      ACCESS_TOKEN: "access_token",
      XMS_CC: "xms_cc"
    };
    PromptValue = {
      LOGIN: "login",
      SELECT_ACCOUNT: "select_account",
      CONSENT: "consent",
      NONE: "none",
      CREATE: "create",
      NO_SESSION: "no_session"
    };
    rkn = {
      PLAIN: "plain",
      S256: "S256"
    };
    Vst = {
      CODE: "code",
      IDTOKEN_TOKEN: "id_token token",
      IDTOKEN_TOKEN_REFRESHTOKEN: "id_token token refresh_token"
    };
    ResponseMode = {
      QUERY: "query",
      FRAGMENT: "fragment",
      FORM_POST: "form_post"
    };
    FW = {
      IMPLICIT_GRANT: "implicit",
      AUTHORIZATION_CODE_GRANT: "authorization_code",
      CLIENT_CREDENTIALS_GRANT: "client_credentials",
      RESOURCE_OWNER_PASSWORD_GRANT: "password",
      REFRESH_TOKEN_GRANT: "refresh_token",
      DEVICE_CODE_GRANT: "device_code",
      JWT_BEARER: "urn:ietf:params:oauth:grant-type:jwt-bearer"
    };
    Zqe = {
      MSSTS_ACCOUNT_TYPE: "MSSTS",
      ADFS_ACCOUNT_TYPE: "ADFS",
      MSAV1_ACCOUNT_TYPE: "MSA",
      GENERIC_ACCOUNT_TYPE: "Generic"
    };
    N_e = {
      CACHE_KEY_SEPARATOR: "-",
      CLIENT_INFO_SEPARATOR: "."
    };
    aS = {
      ID_TOKEN: "IdToken",
      ACCESS_TOKEN: "AccessToken",
      ACCESS_TOKEN_WITH_AUTH_SCHEME: "AccessToken_With_AuthScheme",
      REFRESH_TOKEN: "RefreshToken"
    };
    zst = {
      CACHE_KEY: "authority-metadata",
      REFRESH_TIME_SECONDS: 86400
    };
    $j = {
      CONFIG: "config",
      CACHE: "cache",
      NETWORK: "network",
      HARDCODED_VALUES: "hardcoded_values"
    };
    ZD = {
      SCHEMA_VERSION: 5,
      MAX_LAST_HEADER_BYTES: 330,
      MAX_CACHED_ERRORS: 50,
      CACHE_KEY: "server-telemetry",
      CATEGORY_SEPARATOR: "|",
      VALUE_SEPARATOR: ",",
      OVERFLOW_TRUE: "1",
      OVERFLOW_FALSE: "0",
      UNKNOWN_ERROR: "unknown_error"
    };
    Hh = {
      BEARER: "Bearer",
      POP: "pop",
      SSH: "ssh-cert"
    };
    dce = {
      DEFAULT_THROTTLE_TIME_SECONDS: 60,
      DEFAULT_MAX_THROTTLE_TIME_SECONDS: 3600,
      THROTTLING_PREFIX: "throttling",
      X_MS_LIB_CAPABILITY_VALUE: "retry-after, h429"
    };
    PFt = {
      INVALID_GRANT_ERROR: "invalid_grant",
      CLIENT_MISMATCH_ERROR: "client_mismatch"
    };
    OFt = {
      username: "username",
      password: "password"
    };
    e3e = {
      FAILED_AUTO_DETECTION: "1",
      INTERNAL_CACHE: "2",
      ENVIRONMENT_VARIABLE: "3",
      IMDS: "4"
    };
    okn = {
      CONFIGURED_NO_AUTO_DETECTION: "2",
      AUTO_DETECTION_REQUESTED_SUCCESSFUL: "4",
      AUTO_DETECTION_REQUESTED_FAILED: "5"
    };
    cv = {
      NOT_APPLICABLE: "0",
      FORCE_REFRESH_OR_CLAIMS: "1",
      NO_CACHED_ACCESS_TOKEN: "2",
      CACHED_ACCESS_TOKEN_EXPIRED: "3",
      PROACTIVELY_REFRESHED: "4"
    };
    DF = {
      BASE64: "base64",
      HEX: "hex",
      UTF8: "utf-8"
    };
  });
  var AuthErrorCodes = {};
  __export(AuthErrorCodes, {
    unexpectedError: () => "unexpected_error",
    postRequestFailed: () => "post_request_failed"
  });
  var Q5r = __lazy(() => {/*! @azure/msal-common v15.13.1 2025-10-29 */});
  function e6r(e, t) {
    return new AuthError(e, t ? `${skn[e]} ${t}` : skn[e]);
  }
  var skn;
  var AuthErrorMessage;
  var AuthError;
  var JY = __lazy(() => {
    aw();
    Q5r(); /*! @azure/msal-common v15.13.1 2025-10-29 */
    skn = {
      ["unexpected_error"]: "Unexpected error in authentication.",
      ["post_request_failed"]: "Post request failed from the network, could be a 4xx/5xx or a network unavailability. Please check the exact error code for details."
    };
    AuthErrorMessage = {
      unexpectedError: {
        code: "unexpected_error",
        desc: skn["unexpected_error"]
      },
      postRequestFailed: {
        code: "post_request_failed",
        desc: skn["post_request_failed"]
      }
    };
    AuthError = class Gp extends Error {
      constructor(e, t, n) {
        let r = t ? `${e}: ${t}` : e;
        super(r);
        Object.setPrototypeOf(this, Gp.prototype);
        this.errorCode = e || xo.EMPTY_STRING;
        this.errorMessage = t || xo.EMPTY_STRING;
        this.subError = n || xo.EMPTY_STRING;
        this.name = "AuthError";
      }
      setCorrelationId(e) {
        this.correlationId = e;
      }
    };
  });
  var ClientAuthErrorCodes = {};