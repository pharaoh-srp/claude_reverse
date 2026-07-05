  var HVn = __commonJS((EJ_, vZa) => {
    vZa.exports = Tz;
    var QEe = Ayt();
    ((Tz.prototype = Object.create(QEe.prototype)).constructor = Tz).className = "Service";
    var Mxo = $Vn();
    var Pyt = Y1();
    var LZp = ARo();
    var FZp = Pyt.patterns.reservedRe;
    function Tz(e, t) {
      QEe.call(this, e, t);
      this.methods = {};
      this._methodsArray = null;
    }
    Tz.fromJSON = function (t, n, r) {
      r = Pyt.checkDepth(r);
      var o = new Tz(t, n.options);
      if (n.methods) {
        for (var s = Object.keys(n.methods), i = 0; i < s.length; ++i) {
          o.add(Mxo.fromJSON(s[i], n.methods[s[i]]));
        }
      }
      if (n.nested) {
        o.addJSON(n.nested, r);
      }
      if (n.edition) {
        o._edition = n.edition;
      }
      o.comment = n.comment;
      o._defaultEdition = "proto3";
      return o;
    };
    Tz.prototype.toJSON = function (t) {
      var n = QEe.prototype.toJSON.call(this, t);
      var r = t ? Boolean(t.keepComments) : false;
      return Pyt.toObject(["edition", this._editionToJSON(), "options", n && n.options || undefined, "methods", QEe.arrayToJSON(this.methodsArray, t) || {}, "nested", n && n.nested || undefined, "comment", r ? this.comment : undefined]);
    };
    Object.defineProperty(Tz.prototype, "methodsArray", {
      get: function () {
        return this._methodsArray || (this._methodsArray = Pyt.toArray(this.methods));
      }
    });
    function EZa(e) {
      e._methodsArray = null;
      return e;
    }
    Tz.prototype.get = function (t) {
      return Object.prototype.hasOwnProperty.call(this.methods, t) ? this.methods[t] : QEe.prototype.get.call(this, t);
    };
    Tz.prototype.resolveAll = function () {
      if (!this._needsRecursiveResolve) {
        return this;
      }
      QEe.prototype.resolve.call(this);
      var t = this.methodsArray;
      for (var n = 0; n < t.length; ++n) {
        t[n].resolve();
      }
      return this;
    };
    Tz.prototype._resolveFeaturesRecursive = function (t) {
      if (!this._needsRecursiveFeatureResolution) {
        return this;
      }
      t = this._edition || t;
      QEe.prototype._resolveFeaturesRecursive.call(this, t);
      this.methodsArray.forEach(n => {
        n._resolveFeaturesRecursive(t);
      });
      return this;
    };
    Tz.prototype.add = function (t) {
      if (this.get(t.name)) {
        throw Error("duplicate name '" + t.name + "' in " + this);
      }
      if (t instanceof Mxo) {
        if (t.name === "__proto__") {
          return this;
        }
        this.methods[t.name] = t;
        t.parent = this;
        return EZa(this);
      }
      return QEe.prototype.add.call(this, t);
    };
    Tz.prototype.remove = function (t) {
      if (t instanceof Mxo) {
        if (this.methods[t.name] !== t) {
          throw Error(t + " is not a member of " + this);
        }
        delete this.methods[t.name];
        t.parent = null;
        return EZa(this);
      }
      return QEe.prototype.remove.call(this, t);
    };
    Tz.prototype.create = function (t, n, r) {
      var o = new LZp.Service(t, n, r);
      for (var s = 0, i; s < this.methodsArray.length; ++s) {
        var a = Pyt.lcFirst((i = this._methodsArray[s]).resolve().name).replace(/[^$\w_]/g, "");
        o[a] = Pyt.codegen(["r", "c"], FZp.test(a) ? a + "_" : a)("return this.rpcCall(m,q,s,r,c)")({
          m: i,
          q: i.resolvedRequestType.ctor,
          s: i.resolvedResponseType.ctor
        });
      }
      return o;
    };
  });
  var jVn = __commonJS((vJ_, wZa) => {
    wZa.exports = Zpe;
    var UZp = Wpe();
    function Zpe(e) {
      if (e) {
        for (var t = Object.keys(e), n = 0; n < t.length; ++n) {
          var r = t[n];
          if (r === "__proto__") {
            continue;
          }
          this[r] = e[r];
        }
      }
    }
    Zpe.create = function (t) {
      return this.$type.create(t);
    };
    Zpe.HS = function (t, n) {
      return this.$type.HS(t, n);
    };
    Zpe.encodeDelimited = function (t, n) {
      return this.$type.encodeDelimited(t, n);
    };
    Zpe.oC = function (t) {
      return this.$type.oC(t);
    };
    Zpe.decodeDelimited = function (t) {
      return this.$type.decodeDelimited(t);
    };
    Zpe.verify = function (t) {
      return this.$type.verify(t);
    };
    Zpe.fromObject = function (t) {
      return this.$type.fromObject(t);
    };
    Zpe.toObject = function (t, n) {
      return this.$type.toObject(t, n);
    };
    Zpe.prototype.toJSON = function () {
      return this.$type.toObject(this, UZp.toJSONOptions);
    };
  });
  var Nxo = __commonJS((wJ_, RZa) => {
    RZa.exports = HZp;
    var BZp = ase();
    var ZEe = yVe();
    var CZa = Y1();
    function $Zp(e) {
      return "missing required '" + e.name + "'";
    }
    function HZp(e) {
      var t = CZa.codegen(["r", "l", "e", "n"], e.name + "$decode")("if(!(r instanceof Reader))")("r=Reader.create(r)")("if(n===undefined)n=0")("if(n>Reader.recursionLimit)")('throw Error("maximum nesting depth exceeded")')("var c=l===undefined?r.len:r.pos+l,m=new this.ctor" + (e.fieldsArray.filter(function (a) {
        return a.map;
      }).length ? ",k,value" : ""))("while(r.pos<c){")("var t=r.uint32()")("if(t===e)")("break")("switch(t>>>3){");
      var n = 0;
      for (; n < e.fieldsArray.length; ++n) {
        var r = e._fieldsArray[n].resolve();
        var o = r.resolvedType instanceof BZp ? "int32" : r.type;
        var s = "m" + CZa.safeProp(r.name);
        if (t("case %i: {", r.id), r.map) {
          if (t("if(%s===util.emptyObject)", s)("%s={}", s)("var c2 = r.uint32()+r.pos"), ZEe.defaults[r.keyType] !== undefined) {
            t("k=%j", ZEe.defaults[r.keyType]);
          } else {
            t("k=null");
          }
          if (ZEe.defaults[o] !== undefined) {
            t("value=%j", ZEe.defaults[o]);
          } else {
            t("value=null");
          }
          if (t("while(r.pos<c2){")("var tag2=r.uint32()")("switch(tag2>>>3){")("case 1: k=r.%s(); break", r.keyType)("case 2:"), ZEe.basic[o] === undefined) {
            t("value=types[%i].decode(r,r.uint32(),undefined,n+1)", n);
          } else {
            t("value=r.%s()", o);
          }
          if (t("break")("default:")("r.skipType(tag2&7,n)")("break")("}")("}"), ZEe.long[r.keyType] !== undefined) {
            t('%s[typeof k==="object"?util.longToHash(k):k]=value', s);
          } else {
            if (r.keyType === "string") {
              t('if(k==="__proto__")')("util.makeProp(%s,k)", s);
            }
            t("%s[k]=value", s);
          }
        } else if (r.repeated) {
          if (t("if(!(%s&&%s.length))", s, s)("%s=[]", s), ZEe.packed[o] !== undefined) {
            t("if((t&7)===2){")("var c2=r.uint32()+r.pos")("while(r.pos<c2)")("%s.push(r.%s())", s, o)("}else");
          }
          if (ZEe.basic[o] === undefined) {
            t(r.delimited ? "%s.push(types[%i].decode(r,undefined,((t&~7)|4),n+1))" : "%s.push(types[%i].decode(r,r.uint32(),undefined,n+1))", s, n);
          } else {
            t("%s.push(r.%s())", s, o);
          }
        } else if (ZEe.basic[o] === undefined) {
          t(r.delimited ? "%s=types[%i].decode(r,undefined,((t&~7)|4),n+1)" : "%s=types[%i].decode(r,r.uint32(),undefined,n+1)", s, n);
        } else {
          t("%s=r.%s()", s, o);
        }
        t("break")("}");
      }
      t("default:")("r.skipType(t&7,n)")("break")("}")("}");
      for (n = 0; n < e._fieldsArray.length; ++n) {
        var i = e._fieldsArray[n];
        if (i.required) {
          t("if(!m.hasOwnProperty(%j))", i.name)("throw util.ProtocolError(%j,{instance:m})", $Zp(i));
        }
      }
      return t("return m");
    }
  });
  var Uxo = __commonJS((CJ_, xZa) => {
    xZa.exports = WZp;
    var jZp = ase();
    var Lxo = Y1();
    function LQ(e, t) {
      return e.name + ": " + t + (e.repeated && t !== "array" ? "[]" : e.map && t !== "object" ? "{k:" + e.keyType + "}" : "") + " expected";
    }
    function Fxo(e, t, n, r) {
      if (t.resolvedType) {
        if (t.resolvedType instanceof jZp) {
          e("switch(%s){", r)("default:")("return%j", LQ(t, "enum value"));
          for (var o = Object.keys(t.resolvedType.values), s = 0; s < o.length; ++s) {
            e("case %i:", t.resolvedType.values[o[s]]);
          }
          e("break")("}");
        } else {
          e("{")("var e=types[%i].verify(%s,n+1);", n, r)("if(e)")("return%j+e", t.name + ".")("}");
        }
      } else {
        switch (t.type) {
          case "int32":
          case "uint32":
          case "sint32":
          case "fixed32":
          case "sfixed32":
            e("if(!util.isInteger(%s))", r)("return%j", LQ(t, "integer"));
            break;
          case "int64":
          case "uint64":
          case "sint64":
          case "fixed64":
          case "sfixed64":
            e("if(!util.isInteger(%s)&&!(%s&&util.isInteger(%s.low)&&util.isInteger(%s.high)))", r, r, r, r)("return%j", LQ(t, "integer|Long"));
            break;
          case "float":
          case "double":
            e('if(typeof %s!=="number")', r)("return%j", LQ(t, "number"));
            break;
          case "bool":
            e('if(typeof %s!=="boolean")', r)("return%j", LQ(t, "boolean"));
            break;
          case "string":
            e("if(!util.isString(%s))", r)("return%j", LQ(t, "string"));
            break;
          case "bytes":
            e('if(!(%s&&typeof %s.length==="number"||util.isString(%s)))', r, r, r)("return%j", LQ(t, "buffer"));
            break;
        }
      }
      return e;
    }
    function qZp(e, t, n) {
      switch (t.keyType) {
        case "int32":
        case "uint32":
        case "sint32":
        case "fixed32":
        case "sfixed32":
          e("if(!util.key32Re.test(%s))", n)("return%j", LQ(t, "integer key"));
          break;
        case "int64":
        case "uint64":
        case "sint64":
        case "fixed64":
        case "sfixed64":
          e("if(!util.key64Re.test(%s))", n)("return%j", LQ(t, "integer|Long key"));
          break;
        case "bool":
          e("if(!util.key2Re.test(%s))", n)("return%j", LQ(t, "boolean key"));
          break;
      }
      return e;
    }
    function WZp(e) {
      var t = Lxo.codegen(["m", "n"], e.name + "$verify")('if(typeof m!=="object"||m===null)')("return%j", "object expected")("if(n===undefined)n=0")("if(n>util.recursionLimit)")("return%j", "maximum nesting depth exceeded");
      var n = e.oneofsArray;
      var r = {};
      if (n.length) {
        t("var p={}");
      }
      for (var o = 0; o < e.fieldsArray.length; ++o) {
        var s = e._fieldsArray[o].resolve();
        var i = "m" + Lxo.safeProp(s.name);
        if (s.optional) {
          t("if(%s!=null&&m.hasOwnProperty(%j)){", i, s.name);
        }
        if (s.map) {
          t("if(!util.isObject(%s))", i)("return%j", LQ(s, "object"))("var k=Object.keys(%s)", i)("for(var i=0;i<k.length;++i){");
          qZp(t, s, "k[i]");
          Fxo(t, s, o, i + "[k[i]]")("}");
        } else if (s.repeated) {
          t("if(!Array.isArray(%s))", i)("return%j", LQ(s, "array"))("for(var i=0;i<%s.length;++i){", i);
          Fxo(t, s, o, i + "[i]")("}");
        } else {
          if (s.partOf) {
            var a = Lxo.safeProp(s.partOf.name);
            if (r[s.partOf.name] === 1) {
              t("if(p%s===1)", a)("return%j", s.partOf.name + ": multiple values");
            }
            r[s.partOf.name] = 1;
            t("p%s=1", a);
          }
          Fxo(t, s, o, i);
        }
        if (s.optional) {
          t("}");
        }
      }
      return t("return null");
    }
  });
  var Hxo = __commonJS(AZa => {
    var kZa = AZa;
    var aVt = ase();
    var eme = Y1();
    function Bxo(e, t, n, r) {
      var o = false;
      if (t.resolvedType) {
        if (t.resolvedType instanceof aVt) {
          e("switch(d%s){", r);
          for (var s = t.resolvedType.values, i = Object.keys(s), a = 0; a < i.length; ++a) {
            if (s[i[a]] === t.typeDefault && !o) {
              if (e("default:")('if(typeof(d%s)==="number"){m%s=d%s;break}', r, r, r), !t.repeated) {
                e("break");
              }
              o = true;
            }
            e("case%j:", i[a])("case %i:", s[i[a]])("m%s=%j", r, s[i[a]])("break");
          }
          e("}");
        } else {
          e('if(typeof d%s!=="object")', r)("throw TypeError(%j)", t.fullName + ": object expected")("m%s=types[%i].fromObject(d%s,n+1)", r, n, r);
        }
      } else {
        var l = false;
        switch (t.type) {
          case "double":
          case "float":
            e("m%s=Number(d%s)", r, r);
            break;
          case "uint32":
          case "fixed32":
            e("m%s=d%s>>>0", r, r);
            break;
          case "int32":
          case "sint32":
          case "sfixed32":
            e("m%s=d%s|0", r, r);
            break;
          case "uint64":
            l = true;
          case "int64":
          case "sint64":
          case "fixed64":
          case "sfixed64":
            e("if(util.Long)")("(m%s=util.Long.fromValue(d%s)).unsigned=%j", r, r, l)('else if(typeof d%s==="string")', r)("m%s=parseInt(d%s,10)", r, r)('else if(typeof d%s==="number")', r)("m%s=d%s", r, r)('else if(typeof d%s==="object")', r)("m%s=new util.LongBits(d%s.low>>>0,d%s.high>>>0).toNumber(%s)", r, r, r, l ? "true" : "");
            break;
          case "bytes":
            e('if(typeof d%s==="string")', r)("util.base64.decode(d%s,m%s=util.newBuffer(util.base64.length(d%s)),0)", r, r, r)("else if(d%s.length >= 0)", r)("m%s=d%s", r, r);
            break;
          case "string":
            e("m%s=String(d%s)", r, r);
            break;
          case "bool":
            e("m%s=Boolean(d%s)", r, r);
            break;
        }
      }
      return e;
    }
    kZa.fromObject = function (t) {
      var n = t.fieldsArray;
      var r = eme.codegen(["d", "n"], t.name + "$fromObject")("if(d instanceof this.ctor)")("return d")("if(n===undefined)n=0")("if(n>util.recursionLimit)")('throw Error("maximum nesting depth exceeded")');
      if (!n.length) {
        return r("return new this.ctor");
      }
      r("var m=new this.ctor");
      for (var o = 0; o < n.length; ++o) {
        var s = n[o].resolve();
        var i = eme.safeProp(s.name);
        if (s.map) {
          r("if(d%s){", i)('if(typeof d%s!=="object")', i)("throw TypeError(%j)", s.fullName + ": object expected")("m%s={}", i)("for(var ks=Object.keys(d%s),i=0;i<ks.length;++i){", i);
          r('if(ks[i]==="__proto__")')("util.makeProp(m%s,ks[i])", i);
          Bxo(r, s, o, i + "[ks[i]]")("}")("}");
        } else if (s.repeated) {
          r("if(d%s){", i)("if(!Array.isArray(d%s))", i)("throw TypeError(%j)", s.fullName + ": array expected")("m%s=[]", i)("for(var i=0;i<d%s.length;++i){", i);
          Bxo(r, s, o, i + "[i]")("}")("}");
        } else {
          if (!(s.resolvedType instanceof aVt)) {
            r("if(d%s!=null){", i);
          }
          if (Bxo(r, s, o, i), !(s.resolvedType instanceof aVt)) {
            r("}");
          }
        }
      }
      return r("return m");
    };
    function $xo(e, t, n, r) {
      if (t.resolvedType) {
        if (t.resolvedType instanceof aVt) {
          e("d%s=o.enums===String?(types[%i].values[m%s]===undefined?m%s:types[%i].values[m%s]):m%s", r, n, r, r, n, r, r);
        } else {
          e("d%s=types[%i].toObject(m%s,o)", r, n, r);
        }
      } else {
        var o = false;
        switch (t.type) {
          case "double":
          case "float":
            e("d%s=o.json&&!isFinite(m%s)?String(m%s):m%s", r, r, r, r);
            break;
          case "uint64":
            o = true;
          case "int64":
          case "sint64":
          case "fixed64":
          case "sfixed64":
            e('if(typeof m%s==="number")', r)("d%s=o.longs===String?String(m%s):m%s", r, r, r)("else")("d%s=o.longs===String?util.Long.prototype.toString.call(m%s):o.longs===Number?new util.LongBits(m%s.low>>>0,m%s.high>>>0).toNumber(%s):m%s", r, r, r, r, o ? "true" : "", r);
            break;
          case "bytes":
            e("d%s=o.bytes===String?util.base64.encode(m%s,0,m%s.length):o.bytes===Array?Array.prototype.slice.call(m%s):m%s", r, r, r, r, r);
            break;
          default:
            e("d%s=m%s", r, r);
            break;
        }
      }
      return e;
    }
    kZa.toObject = function (t) {
      var n = t.fieldsArray.slice().sort(eme.compareFieldsById);
      if (!n.length) {
        return eme.codegen()("return {}");
      }
      var r = eme.codegen(["m", "o"], t.name + "$toObject")("if(!o)")("o={}")("var d={}");
      var o = [];
      var s = [];
      var i = [];
      var a = 0;
      for (; a < n.length; ++a) {
        if (!n[a].partOf) {
          (n[a].resolve().repeated ? o : n[a].map ? s : i).push(n[a]);
        }
      }
      if (o.length) {
        r("if(o.arrays||o.defaults){");
        for (a = 0; a < o.length; ++a) {
          r("d%s=[]", eme.safeProp(o[a].name));
        }
        r("}");
      }
      if (s.length) {
        r("if(o.objects||o.defaults){");
        for (a = 0; a < s.length; ++a) {
          r("d%s={}", eme.safeProp(s[a].name));
        }
        r("}");
      }
      if (i.length) {
        r("if(o.defaults){");
        for (a = 0; a < i.length; ++a) {
          var l = i[a];
          var c = eme.safeProp(l.name);
          if (l.resolvedType instanceof aVt) {
            r("d%s=o.enums===String?%j:%j", c, l.resolvedType.valuesById[l.typeDefault], l.typeDefault);
          } else if (l.long) {
            r("if(util.Long){")("var n=new util.Long(%i,%i,%j)", l.typeDefault.low, l.typeDefault.high, l.typeDefault.unsigned)("d%s=o.longs===String?n.toString():o.longs===Number?n.toNumber():n", c)("}else")("d%s=o.longs===String?%j:%i", c, l.typeDefault.toString(), l.typeDefault.toNumber());
          } else if (l.bytes) {
            var u = Array.prototype.slice.call(l.typeDefault);
            r("if(o.bytes===String)d%s=%j", c, String.fromCharCode.apply(String, l.typeDefault))("else{")("d%s=%j", c, u)("if(o.bytes!==Array)d%s=util.newBuffer(d%s)", c, c)("}");
          } else {
            r("d%s=%j", c, l.typeDefault);
          }
        }
        r("}");
      }
      var d = false;
      for (a = 0; a < n.length; ++a) {
        var l = n[a];
        var p = t._fieldsArray.indexOf(l);
        var c = eme.safeProp(l.name);
        if (l.map) {
          if (!d) {
            d = true;
            r("var ks2");
          }
          r("if(m%s&&(ks2=Object.keys(m%s)).length){", c, c)("d%s={}", c)("for(var j=0;j<ks2.length;++j){");
          r('if(ks2[j]==="__proto__")')("util.makeProp(d%s,ks2[j])", c);
          $xo(r, l, p, c + "[ks2[j]]")("}");
        } else if (l.repeated) {
          r("if(m%s&&m%s.length){", c, c)("d%s=[]", c)("for(var j=0;j<m%s.length;++j){", c);
          $xo(r, l, p, c + "[j]")("}");
        } else if (r("if(m%s!=null&&m.hasOwnProperty(%j)){", c, l.name), $xo(r, l, p, c), l.partOf) {
          r("if(o.oneofs)")("d%s=%j", eme.safeProp(l.partOf.name), l.name);
        }
        r("}");
      }
      return r("return d");
    };
  });
  var jxo = __commonJS(IZa => {
    var GZp = IZa;
    var VZp = jVn();
    GZp[".google.protobuf.Any"] = {
      fromObject: function (e, t) {
        if (e && e["@type"]) {
          var n = e["@type"].substring(e["@type"].lastIndexOf("/") + 1);
          var r = this.lookup(n);
          if (r) {
            var o = e["@type"].charAt(0) === "." ? e["@type"].slice(1) : e["@type"];
            if (o.indexOf("/") === -1) {
              o = "/" + o;
            }
            var s = t === undefined ? 1 : t + 1;
            return this.create({
              type_url: o,
              value: r.HS(r.fromObject(e, s)).finish()
            });
          }
        }
        return this.fromObject(e, t);
      },
      toObject: function (e, t) {
        var n = "type.googleapis.com/";
        var r = "";
        var o = "";
        if (t && t.json && e.type_url && e.value) {
          o = e.type_url.substring(e.type_url.lastIndexOf("/") + 1);
          r = e.type_url.substring(0, e.type_url.lastIndexOf("/") + 1);
          var s = this.lookup(o);
          if (s) {
            e = s.oC(e.value);
          }
        }
        if (!(e instanceof this.ctor) && e instanceof VZp) {
          var i = e.$type.toObject(e, t);
          var a = e.$type.fullName[0] === "." ? e.$type.fullName.slice(1) : e.$type.fullName;
          if (r === "") {
            r = n;
          }
          o = r + a;
          i["@type"] = o;
          return i;
        }
        return this.toObject(e, t);
      }
    };
  });
  var GVn = __commonJS((kJ_, OZa) => {
    OZa.exports = Iv;
    var FQ = Ayt();
    ((Iv.prototype = Object.create(FQ.prototype)).constructor = Iv).className = "Type";
    var zZp = ase();
    var Gxo = gVe();
    var qVn = u1e();
    var KZp = BVn();
    var YZp = HVn();
    var qxo = jVn();
    var Wxo = w8n();
    var JZp = E8n();
    var DU = Y1();
    var XZp = Vxo();
    var QZp = Nxo();
    var ZZp = Uxo();
    var PZa = Hxo();
    var eem = jxo();
    function Iv(e, t) {
      e = e.replace(/\W/g, "");
      FQ.call(this, e, t);
      this.fields = {};
      this.oneofs = undefined;
      this.extensions = undefined;
      this.reserved = undefined;
      this.group = undefined;
      this._fieldsById = null;
      this._fieldsArray = null;
      this._oneofsArray = null;
      this._ctor = null;
    }
    Object.defineProperties(Iv.prototype, {
      fieldsById: {
        get: function () {
          if (this._fieldsById) {
            return this._fieldsById;
          }
          this._fieldsById = {};
          for (var e = Object.keys(this.fields), t = 0; t < e.length; ++t) {
            var n = this.fields[e[t]];
            var r = n.id;
            if (this._fieldsById[r]) {
              throw Error("duplicate id " + r + " in " + this);
            }
            this._fieldsById[r] = n;
          }
          return this._fieldsById;
        }
      },
      fieldsArray: {
        get: function () {
          return this._fieldsArray || (this._fieldsArray = DU.toArray(this.fields));
        }
      },
      oneofsArray: {
        get: function () {
          return this._oneofsArray || (this._oneofsArray = DU.toArray(this.oneofs));
        }
      },
      ctor: {
        get: function () {
          return this._ctor || (this.ctor = Iv.generateConstructor(this)());
        },
        set: function (e) {
          var t = e.prototype;
          if (!(t instanceof qxo)) {
            (e.prototype = new qxo()).constructor = e;
            DU.merge(e.prototype, t);
          }
          e.$type = e.prototype.$type = this;
          DU.merge(e, qxo, true);
          this._ctor = e;
          var n = 0;
          for (; n < this.fieldsArray.length; ++n) {
            this._fieldsArray[n].resolve();
          }
          var r = {};
          for (n = 0; n < this.oneofsArray.length; ++n) {
            r[this._oneofsArray[n].resolve().name] = {
              get: DU.oneOfGetter(this._oneofsArray[n].oneof),
              set: DU.oneOfSetter(this._oneofsArray[n].oneof)
            };
          }
          if (n) {
            Object.defineProperties(e.prototype, r);
          }
        }
      }
    });
    Iv.generateConstructor = function (t) {
      var n = DU.codegen(["p"], t.name);
      for (var r = 0, o; r < t.fieldsArray.length; ++r) {
        if ((o = t._fieldsArray[r]).map) {
          n("this%s={}", DU.safeProp(o.name));
        } else if (o.repeated) {
          n("this%s=[]", DU.safeProp(o.name));
        }
      }
      return n('if(p)for(var ks=Object.keys(p),i=0;i<ks.length;++i)if(p[ks[i]]!=null&&ks[i]!=="__proto__")')("this[ks[i]]=p[ks[i]]");
    };
    function WVn(e) {
      e._fieldsById = e._fieldsArray = e._oneofsArray = null;
      delete e.HS;
      delete e.oC;
      delete e.verify;
      return e;
    }
    Iv.fromJSON = function (t, n, r) {
      r = DU.checkDepth(r);
      var o = new Iv(t, n.options);
      o.extensions = n.extensions;
      o.reserved = n.reserved;
      var s = Object.keys(n.fields);
      var i = 0;
      for (; i < s.length; ++i) {
        o.add((typeof n.fields[s[i]].keyType < "u" ? KZp.fromJSON : qVn.fromJSON)(s[i], n.fields[s[i]]));
      }
      if (n.oneofs) {
        for (s = Object.keys(n.oneofs), i = 0; i < s.length; ++i) {
          o.add(Gxo.fromJSON(s[i], n.oneofs[s[i]]));
        }
      }
      if (n.nested) {
        for (s = Object.keys(n.nested), i = 0; i < s.length; ++i) {
          var a = n.nested[s[i]];
          o.add((a.id !== undefined ? qVn.fromJSON : a.fields !== undefined ? Iv.fromJSON : a.values !== undefined ? zZp.fromJSON : a.methods !== undefined ? YZp.fromJSON : FQ.fromJSON)(s[i], a, r + 1));
        }
      }
      if (n.extensions && n.extensions.length) {
        o.extensions = n.extensions;
      }
      if (n.reserved && n.reserved.length) {
        o.reserved = n.reserved;
      }
      if (n.group) {
        o.group = true;
      }
      if (n.comment) {
        o.comment = n.comment;
      }
      if (n.edition) {
        o._edition = n.edition;
      }
      o._defaultEdition = "proto3";
      return o;
    };
    Iv.prototype.toJSON = function (t) {
      var n = FQ.prototype.toJSON.call(this, t);
      var r = t ? Boolean(t.keepComments) : false;
      return DU.toObject(["edition", this._editionToJSON(), "options", n && n.options || undefined, "oneofs", FQ.arrayToJSON(this.oneofsArray, t), "fields", FQ.arrayToJSON(this.fieldsArray.filter(function (o) {
        return !o.declaringField;
      }), t) || {}, "extensions", this.extensions && this.extensions.length ? this.extensions : undefined, "reserved", this.reserved && this.reserved.length ? this.reserved : undefined, "group", this.group || undefined, "nested", n && n.nested || undefined, "comment", r ? this.comment : undefined]);
    };
    Iv.prototype.resolveAll = function () {
      if (!this._needsRecursiveResolve) {
        return this;
      }
      FQ.prototype.resolveAll.call(this);
      var t = this.oneofsArray;
      r = 0;
      while (r < t.length) {
        t[r++].resolve();
      }
      var n = this.fieldsArray;
      var r = 0;
      while (r < n.length) {
        n[r++].resolve();
      }
      return this;
    };
    Iv.prototype._resolveFeaturesRecursive = function (t) {
      if (!this._needsRecursiveFeatureResolution) {
        return this;
      }
      t = this._edition || t;
      FQ.prototype._resolveFeaturesRecursive.call(this, t);
      this.oneofsArray.forEach(n => {
        n._resolveFeatures(t);
      });
      this.fieldsArray.forEach(n => {
        n._resolveFeatures(t);
      });
      return this;
    };
    Iv.prototype.get = function (t) {
      if (Object.prototype.hasOwnProperty.call(this.fields, t)) {
        return this.fields[t];
      }
      if (this.oneofs && Object.prototype.hasOwnProperty.call(this.oneofs, t)) {
        return this.oneofs[t];
      }
      if (this.nested && Object.prototype.hasOwnProperty.call(this.nested, t)) {
        return this.nested[t];
      }
      return null;
    };
    Iv.prototype.add = function (t) {
      if (this.get(t.name)) {
        throw Error("duplicate name '" + t.name + "' in " + this);
      }
      if (t instanceof qVn && t.extend === undefined) {
        if (this._fieldsById ? this._fieldsById[t.id] : this.fieldsById[t.id]) {
          throw Error("duplicate id " + t.id + " in " + this);
        }
        if (this.isReservedId(t.id)) {
          throw Error("id " + t.id + " is reserved in " + this);
        }
        if (this.isReservedName(t.name)) {
          throw Error("name '" + t.name + "' is reserved in " + this);
        }
        if (t.name === "__proto__") {
          return this;
        }
        if (t.parent) {
          t.parent.remove(t);
        }
        this.fields[t.name] = t;
        t.message = this;
        t.onAdd(this);
        return WVn(this);
      }
      if (t instanceof Gxo) {
        if (t.name === "__proto__") {
          return this;
        }
        if (!this.oneofs) {
          this.oneofs = {};
        }
        this.oneofs[t.name] = t;
        t.onAdd(this);
        return WVn(this);
      }
      return FQ.prototype.add.call(this, t);
    };
    Iv.prototype.remove = function (t) {
      if (t instanceof qVn && t.extend === undefined) {
        if (!this.fields || this.fields[t.name] !== t) {
          throw Error(t + " is not a member of " + this);
        }
        delete this.fields[t.name];
        t.parent = null;
        t.onRemove(this);
        return WVn(this);
      }
      if (t instanceof Gxo) {
        if (!this.oneofs || this.oneofs[t.name] !== t) {
          throw Error(t + " is not a member of " + this);
        }
        delete this.oneofs[t.name];
        t.parent = null;
        t.onRemove(this);
        return WVn(this);
      }
      return FQ.prototype.remove.call(this, t);
    };
    Iv.prototype.isReservedId = function (t) {
      return FQ.isReservedId(this.reserved, t);
    };
    Iv.prototype.isReservedName = function (t) {
      return FQ.isReservedName(this.reserved, t);
    };
    Iv.prototype.create = function (t) {
      return new this.ctor(t);
    };
    Iv.prototype.setup = function () {
      var t = this.fullName;
      var n = [];
      for (var r = 0; r < this.fieldsArray.length; ++r) {
        n.push(this._fieldsArray[r].resolve().resolvedType);
      }
      this.HS = XZp(this)({
        Writer: JZp,
        types: n,
        util: DU
      });
      this.oC = QZp(this)({
        Reader: Wxo,
        types: n,
        util: DU
      });
      this.verify = ZZp(this)({
        types: n,
        util: DU
      });
      this.fromObject = PZa.fromObject(this)({
        types: n,
        util: DU
      });
      this.toObject = PZa.toObject(this)({
        types: n,
        util: DU
      });
      var o = eem[t];
      if (o) {
        var s = Object.create(this);
        s.fromObject = this.fromObject;
        this.fromObject = o.fromObject.bind(s);
        s.toObject = this.toObject;
        this.toObject = o.toObject.bind(s);
      }
      return this;
    };
    Iv.prototype.HS = function (t, n) {
      return this.setup().HS(t, n);
    };
    Iv.prototype.encodeDelimited = function (t, n) {
      return this.HS(t, n && n.len ? n.fork() : n).ldelim();
    };
    Iv.prototype.oC = function (t, n, r, o) {
      return this.setup().oC(t, n, r, o);
    };
    Iv.prototype.decodeDelimited = function (t) {
      if (!(t instanceof Wxo)) {
        t = Wxo.create(t);
      }
      return this.oC(t, t.uint32());
    };
    Iv.prototype.verify = function (t, n) {
      return this.setup().verify(t, n);
    };
    Iv.prototype.fromObject = function (t, n) {
      return this.setup().fromObject(t, n);
    };
    Iv.prototype.toObject = function (t, n) {
      return this.setup().toObject(t, n);
    };
    Iv.d = function (t) {
      return function (r) {
        DU.decorateType(r, t);
      };
    };
  });
  var YVn = __commonJS((AJ_, NZa) => {
    NZa.exports = Ez;
    var KVn = Ayt();
    ((Ez.prototype = Object.create(KVn.prototype)).constructor = Ez).className = "Root";
    var VVn = u1e();
    var zxo = ase();
    var tem = gVe();
    var eve = Y1();
    var Kxo;
    var Yxo;
    var lVt;
    function Ez(e) {
      KVn.call(this, "", e);
      this.deferred = [];
      this.files = [];
      this._edition = "proto2";
      this._fullyQualifiedObjects = {};
    }
    Ez.fromJSON = function (t, n, r) {
      if (r = eve.checkDepth(r), !n) {
        n = new Ez();
      }
      if (t.options) {
        n.setOptions(t.options);
      }
      return n.addJSON(t.nested, r).resolveAll();
    };
    Ez.prototype.resolvePath = eve.path.resolve;
    Ez.prototype.fetch = eve.fetch;
    function MZa() {}
    Ez.prototype.load = function e(t, n, r) {
      if (typeof n === "function") {
        r = n;
        n = undefined;
      }
      var o = this;
      if (!r) {
        return eve.asPromise(e, o, t, n);
      }
      var s = r === MZa;
      function i(m, f) {
        if (!r) {
          return;
        }
        if (s) {
          throw m;
        }
        if (f) {
          f.resolveAll();
        }
        var h = r;
        r = null;
        h(m, f);
      }
      function a(m) {
        var f = m.lastIndexOf("google/protobuf/");
        if (f > -1) {
          var h = m.substring(f);
          if (h in lVt) {
            return h;
          }
        }
        return null;
      }
      function l(m, f) {
        try {
          if (eve.isString(f) && f.charAt(0) === "{") {
            f = JSON.parse(f);
          }
          if (!eve.isString(f)) {
            o.setOptions(f.options).addJSON(f.nested);
          } else {
            Yxo.filename = m;
            var h = Yxo(f, o, n);
            var g;
            var y = 0;
            if (h.imports) {
              for (; y < h.imports.length; ++y) {
                if (g = a(h.imports[y]) || o.resolvePath(m, h.imports[y])) {
                  c(g);
                }
              }
            }
            if (h.weakImports) {
              for (y = 0; y < h.weakImports.length; ++y) {
                if (g = a(h.weakImports[y]) || o.resolvePath(m, h.weakImports[y])) {
                  c(g, true);
                }
              }
            }
          }
        } catch (_) {
          i(_);
        }
        if (!s && !u) {
          i(null, o);
        }
      }
      function c(m, f) {
        if (m = a(m) || m, o.files.indexOf(m) > -1) {
          return;
        }
        if (o.files.push(m), m in lVt) {
          if (s) {
            l(m, lVt[m]);
          } else {
            ++u;
            setTimeout(function () {
              --u;
              l(m, lVt[m]);
            });
          }
          return;
        }
        if (s) {
          var h;
          try {
            h = eve.fs.readFileSync(m).toString("utf8");
          } catch (g) {
            if (!f) {
              i(g);
            }
            return;
          }
          l(m, h);
        } else {
          ++u;
          o.fetch(m, function (g, y) {
            if (--u, !r) {
              return;
            }
            if (g) {
              if (!f) {
                i(g);
              } else if (!u) {
                i(null, o);
              }
              return;
            }
            l(m, y);
          });
        }
      }
      var u = 0;
      if (eve.isString(t)) {
        t = [t];
      }
      for (var d = 0, p; d < t.length; ++d) {
        if (p = o.resolvePath("", t[d])) {
          c(p);
        }
      }
      if (s) {
        o.resolveAll();
        return o;
      }
      if (!u) {
        i(null, o);
      }
      return o;
    };
    Ez.prototype.loadSync = function (t, n) {
      if (!eve.isNode) {
        throw Error("not supported");
      }
      return this.load(t, n, MZa);
    };
    Ez.prototype.resolveAll = function () {
      if (!this._needsRecursiveResolve) {
        return this;
      }
      if (this.deferred.length) {
        throw Error("unresolvable extensions: " + this.deferred.map(function (t) {
          return "'extend " + t.extend + "' in " + t.parent.fullName;
        }).join(", "));
      }
      return KVn.prototype.resolveAll.call(this);
    };
    function DZa(e, t) {
      var n = t.parent.lookup(t.extend);
      if (n) {
        var r = new VVn(t.fullName, t.id, t.type, t.rule, undefined, t.options);
        if (n.get(r.name)) {
          return true;
        }
        r.declaringField = t;
        t.extensionField = r;
        n.add(r);
        return true;
      }
      return false;
    }
    Ez.prototype._handleAdd = function (t) {
      if (t instanceof VVn) {
        if (t.extend !== undefined && !t.extensionField) {
          if (!DZa(this, t)) {
            this.deferred.push(t);
          }
        }
      } else if (t instanceof zxo) {
        if ((/^[A-Z]/).test(t.name)) {
          t.parent[t.name] = t.values;
        }
      } else if (!(t instanceof tem)) {
        if (t instanceof Kxo) {
          for (var n = 0; n < this.deferred.length;) {
            if (DZa(this, this.deferred[n])) {
              this.deferred.splice(n, 1);
            } else {
              ++n;
            }
          }
        }
        for (var r = 0; r < t.nestedArray.length; ++r) {
          this._handleAdd(t._nestedArray[r]);
        }
        if ((/^[A-Z]/).test(t.name)) {
          t.parent[t.name] = t;
        }
      }
      if (t instanceof Kxo || t instanceof zxo || t instanceof VVn) {
        this._fullyQualifiedObjects[t.fullName] = t;
      }
    };
    Ez.prototype._handleRemove = function (t) {
      if (t instanceof VVn) {
        if (t.extend !== undefined) {
          if (t.extensionField) {
            t.extensionField.parent.remove(t.extensionField);
            t.extensionField = null;
          } else {
            var n = this.deferred.indexOf(t);
            if (n > -1) {
              this.deferred.splice(n, 1);
            }
          }
        }
      } else if (t instanceof zxo) {
        if ((/^[A-Z]/).test(t.name)) {
          delete t.parent[t.name];
        }
      } else if (t instanceof KVn) {
        for (var r = 0; r < t.nestedArray.length; ++r) {
          this._handleRemove(t._nestedArray[r]);
        }
        if ((/^[A-Z]/).test(t.name)) {
          delete t.parent[t.name];
        }
      }
      delete this._fullyQualifiedObjects[t.fullName];
    };
    Ez._configure = function (e, t, n) {
      Kxo = e;
      Yxo = t;
      lVt = n;
    };
  });
  var Y1 = __commonJS((IJ_, UZa) => {
    var lR = UZa.exports = Wpe();
    var LZa = IRo();
    var Jxo;
    var Xxo;
    lR.codegen = aZa();
    lR.fetch = dZa();
    lR.path = fZa();
    lR.patterns = gZa();
    var FZa = lR.patterns.reservedRe;
    var nem = lR.patterns.unsafePropertyRe;
    lR.fs = lR.inquire("fs");
    lR.checkDepth = function (t) {
      if (t === undefined) {
        t = 0;
      }
      if (t > lR.recursionLimit) {
        throw Error("max depth exceeded");
      }
      return t;
    };
    lR.toArray = function (t) {
      if (t) {
        var n = Object.keys(t);
        var r = Array(n.length);
        var o = 0;
        while (o < n.length) {
          r[o] = t[n[o++]];
        }
        return r;
      }
      return [];
    };
    lR.toObject = function (t) {
      var n = {};
      var r = 0;
      while (r < t.length) {
        var o = t[r++];
        var s = t[r++];
        if (s !== undefined) {
          n[o] = s;
        }
      }
      return n;
    };
    lR.isReserved = function (t) {
      return FZa.test(t);
    };
    lR.safeProp = function (t) {
      if (!/^[$\w_]+$/.test(t) || FZa.test(t)) {
        return "[" + JSON.stringify(t) + "]";
      }
      return "." + t;
    };
    lR.ucFirst = function (t) {
      return t.charAt(0).toUpperCase() + t.substring(1);
    };
    lR.camelCase = function (t) {
      return t.substring(0, 1) + t.substring(1).replace(/_([a-z])/g, function (n, r) {
        return r.toUpperCase();
      });
    };
    lR.compareFieldsById = function (t, n) {
      return t.id - n.id;
    };
    lR.decorateType = function (t, n) {
      if (t.$type) {
        if (n && t.$type.name !== n) {
          lR.decorateRoot.remove(t.$type);
          t.$type.name = n;
          lR.decorateRoot.add(t.$type);
        }
        return t.$type;
      }
      if (!Jxo) {
        Jxo = GVn();
      }
      var r = new Jxo(n || t.name);
      lR.decorateRoot.add(r);
      r.ctor = t;
      Object.defineProperty(t, "$type", {
        value: r,
        enumerable: false
      });
      Object.defineProperty(t.prototype, "$type", {
        value: r,
        enumerable: false
      });
      return r;
    };
    var oem = 0;
    lR.decorateEnum = function (t) {
      if (t.$type) {
        return t.$type;
      }
      if (!Xxo) {
        Xxo = ase();
      }
      var n = new Xxo("Enum" + oem++, t);
      lR.decorateRoot.add(n);
      Object.defineProperty(t, "$type", {
        value: n,
        enumerable: false
      });
      return n;
    };
    lR.setProperty = function (t, n, r, o) {
      function s(i, a, l) {
        var c = a.shift();
        if (nem.test(c)) {
          return i;
        }
        if (a.length > 0) {
          i[c] = s(i[c] || {}, a, l);
        } else {
          var u = i[c];
          if (u && o) {
            return i;
          }
          if (u) {
            l = [].concat(u).concat(l);
          }
          i[c] = l;
        }
        return i;
      }
      if (typeof t !== "object") {
        throw TypeError("dst must be an object");
      }
      if (!n) {
        throw TypeError("path must be specified");
      }
      n = n.split(".");
      return s(t, n, r);
    };
    Object.defineProperty(lR, "decorateRoot", {
      get: function () {
        return LZa.decorated || (LZa.decorated = new (YVn())());
      }
    });
  });
  var yVe = __commonJS(BZa => {
    var cVt = BZa;
    var sem = Y1();
    var iem = ["double", "float", "int32", "uint32", "sint32", "fixed32", "sfixed32", "int64", "uint64", "sint64", "fixed64", "sfixed64", "bool", "string", "bytes"];
    function uVt(e, t) {
      var n = 0;
      var r = Object.create(null);
      t |= 0;
      while (n < e.length) {
        r[iem[n + t]] = e[n++];
      }
      return r;
    }
    cVt.basic = uVt([1, 5, 0, 0, 0, 5, 5, 0, 0, 0, 1, 1, 0, 2, 2]);
    cVt.defaults = uVt([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, "", sem.emptyArray, null]);
    cVt.long = uVt([0, 0, 0, 1, 1], 7);
    cVt.mapKey = uVt([0, 0, 0, 5, 5, 0, 0, 0, 1, 1, 0, 2], 2);
    cVt.packed = uVt([1, 5, 0, 0, 0, 5, 5, 0, 0, 0, 1, 1, 0]);
  });
  var u1e = __commonJS((OJ_, HZa) => {
    HZa.exports = J1;
    var pVt = d1e();
    ((J1.prototype = Object.create(pVt.prototype)).constructor = J1).className = "Field";
    var $Za = ase();
    var Qxo = yVe();
    var UO = Y1();
    var dVt;
    J1.fromJSON = function (t, n) {
      var r = new J1(t, n.id, n.type, n.rule, n.extend, n.options, n.comment);
      if (n.edition) {
        r._edition = n.edition;
      }
      r._defaultEdition = "proto3";
      return r;
    };
    function J1(e, t, n, r, o, s, i) {
      if (UO.isObject(r)) {
        i = o;
        s = r;
        r = o = undefined;
      } else if (UO.isObject(o)) {
        i = s;
        s = o;
        o = undefined;
      }
      if (pVt.call(this, e, s), !UO.isInteger(t) || t < 0) {
        throw TypeError("id must be a non-negative integer");
      }
      if (!UO.isString(n)) {
        throw TypeError("type must be a string");
      }
      if (r !== undefined && !(/^required|optional|repeated$/).test(r = r.toString().toLowerCase())) {
        throw TypeError("rule must be a string rule");
      }
      if (o !== undefined && !UO.isString(o)) {
        throw TypeError("extend must be a string");
      }
      if (r === "proto3_optional") {
        r = "optional";
      }
      this.rule = r && r !== "optional" ? r : undefined;
      this.type = n;
      this.id = t;
      this.extend = o || undefined;
      this.repeated = r === "repeated";
      this.map = false;
      this.message = null;
      this.partOf = null;
      this.typeDefault = null;
      this.defaultValue = null;
      this.long = UO.Long ? Qxo.long[n] !== undefined : false;
      this.bytes = n === "bytes";
      this.resolvedType = null;
      this.extensionField = null;
      this.declaringField = null;
      this.comment = i;
    }
    Object.defineProperty(J1.prototype, "required", {
      get: function () {
        return this._features.field_presence === "LEGACY_REQUIRED";
      }
    });
    Object.defineProperty(J1.prototype, "optional", {
      get: function () {
        return !this.required;
      }
    });
    Object.defineProperty(J1.prototype, "delimited", {
      get: function () {
        return this.resolvedType instanceof dVt && this._features.message_encoding === "DELIMITED";
      }
    });
    Object.defineProperty(J1.prototype, "packed", {
      get: function () {
        return this._features.repeated_field_encoding === "PACKED";
      }
    });
    Object.defineProperty(J1.prototype, "hasPresence", {
      get: function () {
        if (this.repeated || this.map) {
          return false;
        }
        return this.partOf || this.declaringField || this.extensionField || this._features.field_presence !== "IMPLICIT";
      }
    });
    J1.prototype.setOption = function (t, n, r) {
      return pVt.prototype.setOption.call(this, t, n, r);
    };
    J1.prototype.toJSON = function (t) {
      var n = t ? Boolean(t.keepComments) : false;
      return UO.toObject(["edition", this._editionToJSON(), "rule", this.rule !== "optional" && this.rule || undefined, "type", this.type, "id", this.id, "extend", this.extend, "options", this.options, "comment", n ? this.comment : undefined]);
    };
    J1.prototype.resolve = function () {
      if (this.resolved) {
        return this;
      }
      if ((this.typeDefault = Qxo.defaults[this.type]) === undefined) {
        if (this.resolvedType = (this.declaringField ? this.declaringField.parent : this.parent).lookupTypeOrEnum(this.type), this.resolvedType instanceof dVt) {
          this.typeDefault = null;
        } else {
          this.typeDefault = this.resolvedType.values[Object.keys(this.resolvedType.values)[0]];
        }
      } else if (this.options && this.options.proto3_optional) {
        this.typeDefault = null;
      }
      if (this.options && this.options.default != null) {
        if (this.typeDefault = this.options.default, this.resolvedType instanceof $Za && typeof this.typeDefault === "string") {
          this.typeDefault = this.resolvedType.values[this.typeDefault];
        }
      }
      if (this.options) {
        if (this.options.packed !== undefined && this.resolvedType && !(this.resolvedType instanceof $Za)) {
          delete this.options.packed;
        }
        if (!Object.keys(this.options).length) {
          this.options = undefined;
        }
      }
      if (this.long) {
        if (this.typeDefault = UO.Long.fromNumber(this.typeDefault, this.type.charAt(0) === "u"), Object.freeze) {
          Object.freeze(this.typeDefault);
        }
      } else if (this.bytes && typeof this.typeDefault === "string") {
        var t;
        if (UO.base64.test(this.typeDefault)) {
          UO.base64.oC(this.typeDefault, t = UO.newBuffer(UO.base64.length(this.typeDefault)), 0);
        } else {
          UO.utf8.write(this.typeDefault, t = UO.newBuffer(UO.utf8.length(this.typeDefault)), 0);
        }
        this.typeDefault = t;
      }
      if (this.map) {
        this.defaultValue = UO.emptyObject;
      } else if (this.repeated) {
        this.defaultValue = UO.emptyArray;
      } else {
        this.defaultValue = this.typeDefault;
      }
      if (this.parent instanceof dVt) {
        this.parent.ctor.prototype[this.name] = this.defaultValue;
      }
      return pVt.prototype.resolve.call(this);
    };
    J1.prototype._inferLegacyProtoFeatures = function (t) {
      if (t !== "proto2" && t !== "proto3") {
        return {};
      }
      var n = {};
      if (this.rule === "required") {
        n.field_presence = "LEGACY_REQUIRED";
      }
      if (this.parent && Qxo.defaults[this.type] === undefined) {
        var r = this.parent.get(this.type.split(".").pop());
        if (r && r instanceof dVt && r.group) {
          n.message_encoding = "DELIMITED";
        }
      }
      if (this.getOption("packed") === true) {
        n.repeated_field_encoding = "PACKED";
      } else if (this.getOption("packed") === false) {
        n.repeated_field_encoding = "EXPANDED";
      }
      return n;
    };
    J1.prototype._resolveFeatures = function (t) {
      return pVt.prototype._resolveFeatures.call(this, this._edition || t);
    };
    J1.d = function (t, n, r, o) {
      if (typeof n === "function") {
        n = UO.decorateType(n).name;
      } else if (n && typeof n === "object") {
        n = UO.decorateEnum(n).name;
      }
      return function (i, a) {
        UO.decorateType(i.constructor).add(new J1(a, t, n, r, {
          default: o
        }));
      };
    };
    J1._configure = function (t) {
      dVt = t;
    };
  });
  var gVe = __commonJS((DJ_, WZa) => {
    WZa.exports = vz;
    var XVn = d1e();
    ((vz.prototype = Object.create(XVn.prototype)).constructor = vz).className = "OneOf";
    var jZa = u1e();
    var JVn = Y1();
    function vz(e, t, n, r) {
      if (!Array.isArray(t)) {
        n = t;
        t = undefined;
      }
      if (XVn.call(this, e, n), !(t === undefined || Array.isArray(t))) {
        throw TypeError("fieldNames must be an Array");
      }
      this.oneof = t || [];
      this.fieldsArray = [];
      this.comment = r;
    }
    vz.fromJSON = function (t, n) {
      return new vz(t, n.oneof, n.options, n.comment);
    };
    vz.prototype.toJSON = function (t) {
      var n = t ? Boolean(t.keepComments) : false;
      return JVn.toObject(["options", this.options, "oneof", this.oneof, "comment", n ? this.comment : undefined]);
    };
    function qZa(e) {
      if (e.parent) {
        for (var t = 0; t < e.fieldsArray.length; ++t) {
          if (!e.fieldsArray[t].parent) {
            e.parent.add(e.fieldsArray[t]);
          }
        }
      }
    }
    vz.prototype.add = function (t) {
      if (!(t instanceof jZa)) {
        throw TypeError("field must be a Field");
      }
      if (t.parent && t.parent !== this.parent) {
        t.parent.remove(t);
      }
      this.oneof.push(t.name);
      this.fieldsArray.push(t);
      t.partOf = this;
      qZa(this);
      return this;
    };
    vz.prototype.remove = function (t) {
      if (!(t instanceof jZa)) {
        throw TypeError("field must be a Field");
      }
      var n = this.fieldsArray.indexOf(t);
      if (n < 0) {
        throw Error(t + " is not a member of " + this);
      }
      if (this.fieldsArray.splice(n, 1), n = this.oneof.indexOf(t.name), n > -1) {
        this.oneof.splice(n, 1);
      }
      t.partOf = null;
      return this;
    };
    vz.prototype.onAdd = function (t) {
      XVn.prototype.onAdd.call(this, t);
      var n = this;
      for (var r = 0; r < this.oneof.length; ++r) {
        var o = t.get(this.oneof[r]);
        if (o && !o.partOf) {
          o.partOf = n;
          n.fieldsArray.push(o);
        }
      }
      qZa(this);
    };
    vz.prototype.onRemove = function (t) {
      for (var n = 0, r; n < this.fieldsArray.length; ++n) {
        if ((r = this.fieldsArray[n]).parent) {
          r.parent.remove(r);
        }
      }
      XVn.prototype.onRemove.call(this, t);
    };
    Object.defineProperty(vz.prototype, "isProto3Optional", {
      get: function () {
        if (this.fieldsArray == null || this.fieldsArray.length !== 1) {
          return false;
        }
        var e = this.fieldsArray[0];
        return e.options != null && e.options.proto3_optional === true;
      }
    });
    vz.d = function () {
      var t = Array(arguments.length);
      var n = 0;
      while (n < arguments.length) {
        t[n] = arguments[n++];
      }
      return function (o, s) {
        JVn.decorateType(o.constructor).add(new vz(s, t));
        Object.defineProperty(o, s, {
          get: JVn.oneOfGetter(t),
          set: JVn.oneOfSetter(t)
        });
      };
    };
  });
  var d1e = __commonJS((MJ_, GZa) => {
    GZa.exports = MU;
    MU.className = "ReflectionObject";
    var lem = gVe();
    var mVt = Y1();
    var QVn;
    var cem = {
      enum_type: "OPEN",
      field_presence: "EXPLICIT",
      json_format: "ALLOW",
      message_encoding: "LENGTH_PREFIXED",
      repeated_field_encoding: "PACKED",
      utf8_validation: "VERIFY"
    };
    var uem = {
      enum_type: "CLOSED",
      field_presence: "EXPLICIT",
      json_format: "LEGACY_BEST_EFFORT",
      message_encoding: "LENGTH_PREFIXED",
      repeated_field_encoding: "EXPANDED",
      utf8_validation: "NONE"
    };
    var dem = {
      enum_type: "OPEN",
      field_presence: "IMPLICIT",
      json_format: "ALLOW",
      message_encoding: "LENGTH_PREFIXED",
      repeated_field_encoding: "PACKED",
      utf8_validation: "VERIFY"
    };
    function MU(e, t) {
      if (!mVt.isString(e)) {
        throw TypeError("name must be a string");
      }
      if (t && !mVt.isObject(t)) {
        throw TypeError("options must be an object");
      }
      this.options = t;
      this.parsedOptions = null;
      this.name = e;
      this._edition = null;
      this._defaultEdition = "proto2";
      this._features = {};
      this._featuresResolved = false;
      this.parent = null;
      this.resolved = false;
      this.comment = null;
      this.filename = null;
    }
    Object.defineProperties(MU.prototype, {
      root: {
        get: function () {
          var e = this;
          while (e.parent !== null) {
            e = e.parent;
          }
          return e;
        }
      },
      fullName: {
        get: function () {
          var e = [this.name];
          var t = this.parent;
          while (t) {
            e.unshift(t.name);
            t = t.parent;
          }
          return e.join(".");
        }
      }
    });
    MU.prototype.toJSON = function () {
      throw Error();
    };
    MU.prototype.onAdd = function (t) {
      if (this.parent && this.parent !== t) {
        this.parent.remove(this);
      }
      this.parent = t;
      this.resolved = false;
      var n = t.root;
      if (n instanceof QVn) {
        n._handleAdd(this);
      }
    };
    MU.prototype.onRemove = function (t) {
      var n = t.root;
      if (n instanceof QVn) {
        n._handleRemove(this);
      }
      this.parent = null;
      this.resolved = false;
    };
    MU.prototype.resolve = function () {
      if (this.resolved) {
        return this;
      }
      if (this.root instanceof QVn) {
        this.resolved = true;
      }
      return this;
    };
    MU.prototype._resolveFeaturesRecursive = function (t) {
      return this._resolveFeatures(this._edition || t);
    };
    MU.prototype._resolveFeatures = function (t) {
      if (this._featuresResolved) {
        return;
      }
      var n = {};
      if (!t) {
        throw Error("Unknown edition for " + this.fullName);
      }
      var r = Object.assign(this.options ? Object.assign({}, this.options.features) : {}, this._inferLegacyProtoFeatures(t));
      if (this._edition) {
        if (t === "proto2") {
          n = Object.assign({}, uem);
        } else if (t === "proto3") {
          n = Object.assign({}, dem);
        } else if (t === "2023") {
          n = Object.assign({}, cem);
        } else {
          throw Error("Unknown edition: " + t);
        }
        this._features = Object.assign(n, r || {});
        this._featuresResolved = true;
        return;
      }
      if (this.partOf instanceof lem) {
        var o = Object.assign({}, this.partOf._features);
        this._features = Object.assign(o, r || {});
      } else if (this.declaringField) {
        ;
      } else if (this.parent) {
        var s = Object.assign({}, this.parent._features);
        this._features = Object.assign(s, r || {});
      } else {
        throw Error("Unable to find a parent for " + this.fullName);
      }
      if (this.extensionField) {
        this.extensionField._features = this._features;
      }
      this._featuresResolved = true;
    };
    MU.prototype._inferLegacyProtoFeatures = function () {
      return {};
    };
    MU.prototype.getOption = function (t) {
      if (this.options) {
        return this.options[t];
      }
      return;
    };
    MU.prototype.setOption = function (t, n, r) {
      if (t === "__proto__") {
        return this;
      }
      if (!this.options) {
        this.options = {};
      }
      if (/^features\./.test(t)) {
        mVt.setProperty(this.options, t, n, r);
      } else if (!r || this.options[t] === undefined) {
        if (this.getOption(t) !== n) {
          this.resolved = false;
        }
        this.options[t] = n;
      }
      return this;
    };
    MU.prototype.setParsedOption = function (t, n, r) {
      if (t === "__proto__") {
        return this;
      }
      if (!this.parsedOptions) {
        this.parsedOptions = [];
      }
      var o = this.parsedOptions;
      if (r) {
        var s = o.find(function (l) {
          return Object.prototype.hasOwnProperty.call(l, t);
        });
        if (s) {
          var i = s[t];
          mVt.setProperty(i, r, n);
        } else {
          s = {};
          s[t] = mVt.setProperty({}, r, n);
          o.push(s);
        }
      } else {
        var a = {};
        a[t] = n;
        o.push(a);
      }
      return this;
    };
    MU.prototype.setOptions = function (t, n) {
      if (t) {
        for (var r = Object.keys(t), o = 0; o < r.length; ++o) {
          this.setOption(r[o], t[r[o]], n);
        }
      }
      return this;
    };
    MU.prototype.toString = function () {
      var t = this.constructor.className;
      var n = this.fullName;
      if (n.length) {
        return t + " " + n;
      }
      return t;
    };
    MU.prototype._editionToJSON = function () {
      if (!this._edition || this._edition === "proto3") {
        return;
      }
      return this._edition;
    };
    MU._configure = function (e) {
      QVn = e;
    };
  });
  var ase = __commonJS((NJ_, zZa) => {
    zZa.exports = lse;
    var Zxo = d1e();
    ((lse.prototype = Object.create(Zxo.prototype)).constructor = lse).className = "Enum";
    var VZa = Ayt();
    var ZVn = Y1();
    function lse(e, t, n, r, o, s) {
      if (Zxo.call(this, e, n), t && typeof t !== "object") {
        throw TypeError("values must be an object");
      }
      if (this.valuesById = {}, this.values = Object.create(this.valuesById), this.comment = r, this.comments = o || {}, this.valuesOptions = s, this._valuesFeatures = {}, this.reserved = undefined, t) {
        for (var i = Object.keys(t), a = 0; a < i.length; ++a) {
          if (i[a] !== "__proto__" && typeof t[i[a]] === "number") {
            this.valuesById[this.values[i[a]] = t[i[a]]] = i[a];
          }
        }
      }
    }
    lse.prototype._resolveFeatures = function (t) {
      t = this._edition || t;
      Zxo.prototype._resolveFeatures.call(this, t);
      Object.keys(this.values).forEach(n => {
        var r = Object.assign({}, this._features);
        this._valuesFeatures[n] = Object.assign(r, this.valuesOptions && this.valuesOptions[n] && this.valuesOptions[n].features);
      });
      return this;
    };
    lse.fromJSON = function (t, n) {
      var r = new lse(t, n.values, n.options, n.comment, n.comments);
      if (r.reserved = n.reserved, n.edition) {
        r._edition = n.edition;
      }
      r._defaultEdition = "proto3";
      return r;
    };
    lse.prototype.toJSON = function (t) {
      var n = t ? Boolean(t.keepComments) : false;
      return ZVn.toObject(["edition", this._editionToJSON(), "options", this.options, "valuesOptions", this.valuesOptions, "values", this.values, "reserved", this.reserved && this.reserved.length ? this.reserved : undefined, "comment", n ? this.comment : undefined, "comments", n ? this.comments : undefined]);
    };
    lse.prototype.add = function (t, n, r, o) {
      if (!ZVn.isString(t)) {
        throw TypeError("name must be a string");
      }
      if (!ZVn.isInteger(n)) {
        throw TypeError("id must be an integer");
      }
      if (t === "__proto__") {
        return this;
      }
      if (this.values[t] !== undefined) {
        throw Error("duplicate name '" + t + "' in " + this);
      }
      if (this.isReservedId(n)) {
        throw Error("id " + n + " is reserved in " + this);
      }
      if (this.isReservedName(t)) {
        throw Error("name '" + t + "' is reserved in " + this);
      }
      if (this.valuesById[n] !== undefined) {
        if (!(this.options && this.options.allow_alias)) {
          throw Error("duplicate id " + n + " in " + this);
        }
        this.values[t] = n;
      } else {
        this.valuesById[this.values[t] = n] = t;
      }
      if (o) {
        if (this.valuesOptions === undefined) {
          this.valuesOptions = {};
        }
        this.valuesOptions[t] = o || null;
      }
      this.comments[t] = r || null;
      return this;
    };
    lse.prototype.remove = function (t) {
      if (!ZVn.isString(t)) {
        throw TypeError("name must be a string");
      }
      var n = this.values[t];
      if (n == null) {
        throw Error("name '" + t + "' does not exist in " + this);
      }
      if (delete this.valuesById[n], delete this.values[t], delete this.comments[t], this.valuesOptions) {
        delete this.valuesOptions[t];
      }
      return this;
    };
    lse.prototype.isReservedId = function (t) {
      return VZa.isReservedId(this.reserved, t);
    };
    lse.prototype.isReservedName = function (t) {
      return VZa.isReservedName(this.reserved, t);
    };
  });
  var Vxo = __commonJS((LJ_, YZa) => {
    YZa.exports = mem;
    var pem = ase();
    var eko = yVe();
    var tko = Y1();
    function KZa(e, t, n, r) {
      return t.delimited ? e("types[%i].encode(%s,w.uint32(%i)).uint32(%i)", n, r, (t.id << 3 | 3) >>> 0, (t.id << 3 | 4) >>> 0) : e("types[%i].encode(%s,w.uint32(%i).fork()).ldelim()", n, r, (t.id << 3 | 2) >>> 0);
    }
    function mem(e) {
      var t = tko.codegen(["m", "w"], e.name + "$encode")("if(!w)")("w=Writer.create()");
      var n;
      var r;
      var o = e.fieldsArray.slice().sort(tko.compareFieldsById);
      for (var n = 0; n < o.length; ++n) {
        var s = o[n].resolve();
        var i = e._fieldsArray.indexOf(s);
        var a = s.resolvedType instanceof pem ? "int32" : s.type;
        var l = eko.basic[a];
        if (r = "m" + tko.safeProp(s.name), s.map) {
          if (t("if(%s!=null&&Object.hasOwnProperty.call(m,%j)){", r, s.name)("for(var ks=Object.keys(%s),i=0;i<ks.length;++i){", r)("w.uint32(%i).fork().uint32(%i).%s(ks[i])", (s.id << 3 | 2) >>> 0, 8 | eko.mapKey[s.keyType], s.keyType), l === undefined) {
            t("types[%i].encode(%s[ks[i]],w.uint32(18).fork()).ldelim().ldelim()", i, r);
          } else {
            t(".uint32(%i).%s(%s[ks[i]]).ldelim()", 16 | l, a, r);
          }
          t("}")("}");
        } else if (s.repeated) {
          if (t("if(%s!=null&&%s.length){", r, r), s.packed && eko.packed[a] !== undefined) {
            t("w.uint32(%i).fork()", (s.id << 3 | 2) >>> 0)("for(var i=0;i<%s.length;++i)", r)("w.%s(%s[i])", a, r)("w.ldelim()");
          } else if (t("for(var i=0;i<%s.length;++i)", r), l === undefined) {
            KZa(t, s, i, r + "[i]");
          } else {
            t("w.uint32(%i).%s(%s[i])", (s.id << 3 | l) >>> 0, a, r);
          }
          t("}");
        } else {
          if (s.optional) {
            t("if(%s!=null&&Object.hasOwnProperty.call(m,%j))", r, s.name);
          }
          if (l === undefined) {
            KZa(t, s, i, r);
          } else {
            t("w.uint32(%i).%s(%s)", (s.id << 3 | l) >>> 0, a, r);
          }
        }
      }
      return t("return w");
    }
  });
  var XZa = __commonJS((FJ_, JZa) => {
    var Gy = JZa.exports = PRo();
    Gy.build = "light";
    function fem(e, t, n) {
      if (typeof t === "function") {
        n = t;
        t = new Gy.Root();
      } else if (!t) {
        t = new Gy.Root();
      }
      return t.load(e, n);
    }
    Gy.load = fem;
    function hem(e, t) {
      if (!t) {
        t = new Gy.Root();
      }
      return t.loadSync(e);
    }
    Gy.loadSync = hem;
    Gy.encoder = Vxo();
    Gy.decoder = Nxo();
    Gy.verifier = Uxo();
    Gy.converter = Hxo();
    Gy.ReflectionObject = d1e();
    Gy.Namespace = Ayt();
    Gy.Root = YVn();
    Gy.Enum = ase();
    Gy.Type = GVn();
    Gy.Field = u1e();
    Gy.OneOf = gVe();
    Gy.MapField = BVn();
    Gy.Service = HVn();
    Gy.Method = $Vn();
    Gy.Message = jVn();
    Gy.wrappers = jxo();
    Gy.types = yVe();
    Gy.util = Y1();
    Gy.ReflectionObject._configure(Gy.Root);
    Gy.Namespace._configure(Gy.Type, Gy.Service, Gy.Enum);
    Gy.Root._configure(Gy.Type);
    Gy.Field._configure(Gy.Type);
  });
  var rko = __commonJS((UJ_, eel) => {
    eel.exports = ZZa;
    var vem = {
      "0": "\x00",
      r: "\r",
      n: `
`,
      t: "\t"
    };
    function QZa(e) {
      return e.replace(/\\(.?)/g, function (t, n) {
        switch (n) {
          case "\\":
          case "":
            return n;
          default:
            return vem[n] || "";
        }
      });
    }
    ZZa.unescape = QZa;
    function ZZa(e, t) {
      e = e.toString();
      var n = 0;
      var r = e.length;
      var o = 1;
      var s = 0;
      var i = {};
      var a = [];
      var l = null;
      function c(S) {
        return Error("illegal " + S + " (line " + o + ")");
      }
      function u() {
        var S = l === "'" ? /(?:'([^'\\]*(?:\\.[^'\\]*)*)')/g : /(?:"([^"\\]*(?:\\.[^"\\]*)*)")/g;
        S.lastIndex = n - 1;
        var E = S.exec(e);
        if (!E) {
          throw c("string");
        }
        n = S.lastIndex;
        g(l);
        l = null;
        return QZa(E[1]);
      }
      function d(S) {
        return e.charAt(S);
      }
      function p(S, E, C) {
        var x = {
          type: e.charAt(S++),
          lineEmpty: false,
          leading: C
        };
        var A;
        if (t) {
          A = 2;
        } else {
          A = 3;
        }
        var k = S - A;
        var I;
        do {
          if (--k < 0 || (I = e.charAt(k)) === `
`) {
            x.lineEmpty = true;
            break;
          }
        } while (I === " " || I === "\t");
        var O = e.substring(S, E).split(/\n/g);
        for (var M = 0; M < O.length; ++M) {
          O[M] = O[M].replace(t ? /^\s*\*?\/*/ : /^ *[*/]+ */, "").trim();
        }
        x.text = O.join(`
`).trim();
        i[o] = x;
        s = o;
      }
      function m(S) {
        var E = f(S);
        var C = e.substring(S, E);
        var x = /^\s*\/\//.test(C);
        return x;
      }
      function f(S) {
        var E = S;
        while (E < r && d(E) !== `
`) {
          E++;
        }
        return E;
      }
      function h() {
        if (a.length > 0) {
          return a.shift();
        }
        if (l) {
          return u();
        }
        var S;
        var E;
        var C;
        var x;
        var A;
        var k = n === 0;
        do {
          if (n === r) {
            return null;
          }
          S = false;
          while ((/\s/).test(C = d(n))) {
            if (C === `
`) {
              k = true;
              ++o;
            }
            if (++n === r) {
              return null;
            }
          }
          if (d(n) === "/") {
            if (++n === r) {
              throw c("comment");
            }
            if (d(n) === "/") {
              if (!t) {
                A = d(x = n + 1) === "/";
                while (d(++n) !== `
`) {
                  if (n === r) {
                    return null;
                  }
                }
                if (++n, A) {
                  p(x, n - 1, k);
                  k = true;
                }
                ++o;
                S = true;
              } else {
                if (x = n, A = false, m(n - 1)) {
                  A = true;
                  do {
                    if (n = f(n), n === r) {
                      break;
                    }
                    if (n++, !k) {
                      break;
                    }
                  } while (m(n));
                } else {
                  n = Math.min(r, f(n) + 1);
                }
                if (A) {
                  p(x, n, k);
                  k = true;
                }
                o++;
                S = true;
              }
            } else if ((C = d(n)) === "*") {
              x = n + 1;
              A = t || d(x) === "*";
              do {
                if (C === `
`) {
                  ++o;
                }
                if (++n === r) {
                  throw c("comment");
                }
                E = C;
                C = d(n);
              } while (E !== "*" || C !== "/");
              if (++n, A) {
                p(x, n - 2, k);
                k = true;
              }
              S = true;
            } else {
              return "/";
            }
          }
        } while (S);
        var I = n;
        (/[\s{}=;:[\],'"()<>]/g).lastIndex = 0;
        var O = (/[\s{}=;:[\],'"()<>]/g).test(d(I++));
        if (!O) {
          while (I < r && !(/[\s{}=;:[\],'"()<>]/g).test(d(I))) {
            ++I;
          }
        }
        var M = e.substring(n, n = I);
        if (M === '"' || M === "'") {
          l = M;
        }
        return M;
      }
      function g(S) {
        a.push(S);
      }
      function y() {
        if (!a.length) {
          var S = h();
          if (S === null) {
            return null;
          }
          g(S);
        }
        return a[0];
      }
      function _(S, E) {
        var C = y();
        var x = C === S;
        if (x) {
          h();
          return true;
        }
        if (!E) {
          throw c("token '" + C + "', '" + S + "' expected");
        }
        return false;
      }
      function b(S) {
        var E = null;
        var C;
        if (S === undefined) {
          if (C = i[o - 1], delete i[o - 1], C && (t || C.type === "*" || C.lineEmpty)) {
            E = C.leading ? C.text : null;
          }
        } else {
          if (s < S) {
            y();
          }
          if (C = i[S], delete i[S], C && !C.lineEmpty && (t || C.type === "/")) {
            E = C.leading ? null : C.text;
          }
        }
        return E;
      }
      return Object.defineProperty({
        next: h,
        peek: y,
        push: g,
        skip: _,
        cmnt: b
      }, "line", {
        get: function () {
          return o;
        }
      });
    }
  });
  var iel = __commonJS((BJ_, sel) => {
    sel.exports = tve;
    tve.filename = null;
    tve.defaults = {
      keepCase: false
    };
    var wem = rko();
    var tel = YVn();
    var nel = GVn();
    var rel = u1e();
    var Cem = BVn();
    var oel = gVe();
    var Rem = ase();
    var xem = HVn();
    var kem = $Vn();
    var Aem = d1e();
    var Iem = yVe();
    var rme = Y1();
    var Fem = rme.patterns.numberRe;
    var nme = rme.patterns.typeRefRe;
    function tve(e, t, n) {
      if (!(t instanceof tel)) {
        n = t;
        t = new tel();
      }
      if (!n) {
        n = tve.defaults;
      }
      var r = n.preferTrailingComment || false;
      var o = wem(e, n.alternateCommentMode || false);
      var s = o.next;
      var i = o.push;
      var a = o.peek;
      var l = o.skip;
      var c = o.cmnt;
      var u = true;
      var d;
      var p;
      var m;
      var f = "proto2";
      var h = t;
      var g = [];
      var y = {};
      var _ = n.keepCase ? function (ae) {
        return ae;
      } : rme.camelCase;
      function b() {
        g.forEach(ae => {
          ae._edition = f;
          Object.keys(y).forEach(de => {
            if (ae.getOption(de) !== undefined) {
              return;
            }
            ae.setOption(de, y[de], true);
          });
        });
      }
      function S(ae, de, be) {
        var fe = tve.filename;
        if (!be) {
          tve.filename = null;
        }
        return Error("illegal " + (de || "token") + " '" + ae + "' (" + (fe ? fe + ", " : "") + "line " + o.line + ")");
      }
      function E() {
        var ae = [];
        var de;
        do {
          if ((de = s()) !== '"' && de !== "'") {
            throw S(de);
          }
          ae.push(s());
          l(de);
          de = a();
        } while (de === '"' || de === "'");
        return ae.join("");
      }
      function C(ae) {
        var de = s();
        switch (de) {
          case "'":
          case '"':
            i(de);
            return E();
          case "true":
          case "TRUE":
            return true;
          case "false":
          case "FALSE":
            return false;
        }
        try {
          return A(de, true);
        } catch (be) {
          if (ae && nme.test(de)) {
            return de;
          }
          throw S(de, "value");
        }
      }
      function x(ae, de) {
        var be;
        var fe;
        do {
          if (de && ((be = a()) === '"' || be === "'")) {
            var me = E();
            if (ae.push(me), f >= 2023) {
              throw S(me, "id");
            }
          } else {
            try {
              ae.push([fe = k(s()), l("to", true) ? k(s()) : fe]);
            } catch (ue) {
              if (de && nme.test(be) && f >= 2023) {
                ae.push(be);
              } else {
                throw ue;
              }
            }
          }
        } while (l(",", true));
        var Te = {
          options: undefined
        };
        Te.setOption = function (ue, ce) {
          if (this.options === undefined) {
            this.options = {};
          }
          this.options[ue] = ce;
        };
        F(Te, function (ce) {
          if (ce === "option") {
            K(Te, ce);
            l(";");
          } else {
            throw S(ce);
          }
        }, function () {
          ne(Te);
        });
      }
      function A(ae, de) {
        var be = 1;
        if (ae.charAt(0) === "-") {
          be = -1;
          ae = ae.substring(1);
        }
        switch (ae) {
          case "inf":
          case "INF":
          case "Inf":
            return be * (1 / 0);
          case "nan":
          case "NAN":
          case "Nan":
          case "NaN":
            return NaN;
          case "0":
            return 0;
        }
        if ((/^[1-9][0-9]*$/).test(ae)) {
          return be * parseInt(ae, 10);
        }
        if ((/^0[x][0-9a-fA-F]+$/).test(ae)) {
          return be * parseInt(ae, 16);
        }
        if ((/^0[0-7]+$/).test(ae)) {
          return be * parseInt(ae, 8);
        }
        if (Fem.test(ae)) {
          return be * parseFloat(ae);
        }
        throw S(ae, "number", de);
      }
      function k(ae, de) {
        switch (ae) {
          case "max":
          case "MAX":
          case "Max":
            return 536870911;
          case "0":
            return 0;
        }
        if (!de && ae.charAt(0) === "-") {
          throw S(ae, "id");
        }
        if ((/^-?[1-9][0-9]*$/).test(ae)) {
          return parseInt(ae, 10);
        }
        if ((/^-?0[x][0-9a-fA-F]+$/).test(ae)) {
          return parseInt(ae, 16);
        }
        if ((/^-?0[0-7]+$/).test(ae)) {
          return parseInt(ae, 8);
        }
        throw S(ae, "id");
      }
      function I() {
        if (d !== undefined) {
          throw S("package");
        }
        if (d = s(), !nme.test(d)) {
          throw S(d, "name");
        }
        h = h.define(d);
        l(";");
      }
      function O() {
        var ae = a();
        var de;
        switch (ae) {
          case "weak":
            de = m || (m = []);
            s();
            break;
          case "public":
            s();
          default:
            de = p || (p = []);
            break;
        }
        ae = E();
        l(";");
        de.push(ae);
      }
      function M() {
        if (l("="), f = E(), f < 2023) {
          throw S(f, "syntax");
        }
        l(";");
      }
      function L() {
        if (l("="), f = E(), !["2023"].includes(f)) {
          throw S(f, "edition");
        }
        l(";");
      }
      function P(ae, de, be) {
        switch (be = rme.checkDepth(be), de) {
          case "option":
            K(ae, de);
            l(";");
            return true;
          case "message":
            H(ae, de, be + 1);
            return true;
          case "enum":
            z(ae, de);
            return true;
          case "service":
            oe(ae, de, be + 1);
            return true;
          case "extend":
            re(ae, de, be);
            return true;
        }
        return false;
      }
      function F(ae, de, be) {
        var fe = o.line;
        if (ae) {
          if (typeof ae.comment !== "string") {
            ae.comment = c();
          }
          ae.filename = tve.filename;
        }
        if (l("{", true)) {
          var me;
          while ((me = s()) !== "}") {
            de(me);
          }
          l(";", true);
        } else {
          if (be) {
            be();
          }
          if (l(";"), ae && (typeof ae.comment !== "string" || r)) {
            ae.comment = c(fe) || ae.comment;
          }
        }
      }
      function H(ae, de, be) {
        if (be = rme.checkDepth(be), !(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(de = s())) {
          throw S(de, "type name");
        }
        var fe = new nel(de);
        if (F(fe, function (Te) {
          if (P(fe, Te, be)) {
            return;
          }
          switch (Te) {
            case "map":
              W(fe, Te);
              break;
            case "required":
              if (f !== "proto2") {
                throw S(Te);
              }
            case "repeated":
              U(fe, Te, undefined, be + 1);
              break;
            case "optional":
              if (f === "proto3") {
                U(fe, "proto3_optional", undefined, be + 1);
              } else if (f !== "proto2") {
                throw S(Te);
              } else {
                U(fe, "optional", undefined, be + 1);
              }
              break;
            case "oneof":
              j(fe, Te, be + 1);
              break;
            case "extensions":
              x(fe.extensions || (fe.extensions = []));
              break;
            case "reserved":
              x(fe.reserved || (fe.reserved = []), true);
              break;
            default:
              if (f === "proto2" || !nme.test(Te)) {
                throw S(Te);
              }
              i(Te);
              U(fe, "optional", undefined, be + 1);
              break;
          }
        }), ae.add(fe), ae === h) {
          g.push(fe);
        }
      }
      function U(ae, de, be, fe) {
        var me = s();
        if (me === "group") {
          N(ae, de, fe);
          return;
        }
        while (me.endsWith(".") || a().startsWith(".")) {
          me += s();
        }
        if (!nme.test(me)) {
          throw S(me, "type");
        }
        var Te = s();
        if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(Te)) {
          throw S(Te, "name");
        }
        Te = _(Te);
        l("=");
        var ue = new rel(Te, k(s()), me, de, be);
        if (F(ue, function (pe) {
          if (pe === "option") {
            K(ue, pe);
            l(";");
          } else {
            throw S(pe);
          }
        }, function () {
          ne(ue);
        }), de === "proto3_optional") {
          var ce = new oel("_" + Te);
          ue.setOption("proto3_optional", true);
          ce.add(ue);
          ae.add(ce);
        } else {
          ae.add(ue);
        }
        if (ae === h) {
          g.push(ue);
        }
      }
      function N(ae, de, be) {
        if (be = rme.checkDepth(be), f >= 2023) {
          throw S("group");
        }
        var fe = s();
        if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(fe)) {
          throw S(fe, "name");
        }
        var me = rme.lcFirst(fe);
        if (fe === me) {
          fe = rme.ucFirst(fe);
        }
        l("=");
        var Te = k(s());
        var ue = new nel(fe);
        ue.group = true;
        var ce = new rel(me, Te, fe, de);
        ce.filename = tve.filename;
        F(ue, function (pe) {
          switch (pe) {
            case "option":
              K(ue, pe);
              l(";");
              break;
            case "required":
            case "repeated":
              U(ue, pe, undefined, be + 1);
              break;
            case "optional":
              if (f === "proto3") {
                U(ue, "proto3_optional", undefined, be + 1);
              } else {
                U(ue, "optional", undefined, be + 1);
              }
              break;
            case "message":
              H(ue, pe, be + 1);
              break;
            case "enum":
              z(ue, pe);
              break;
            case "reserved":
              x(ue.reserved || (ue.reserved = []), true);
              break;
            default:
              throw S(pe);
          }
        });
        ae.add(ue).add(ce);
      }
      function W(ae) {
        l("<");
        var de = s();
        if (Iem.mapKey[de] === undefined) {
          throw S(de, "type");
        }
        l(",");
        var be = s();
        if (!nme.test(be)) {
          throw S(be, "type");
        }
        l(">");
        var fe = s();
        if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(fe)) {
          throw S(fe, "name");
        }
        l("=");
        var me = new Cem(_(fe), k(s()), de, be);
        F(me, function (ue) {
          if (ue === "option") {
            K(me, ue);
            l(";");
          } else {
            throw S(ue);
          }
        }, function () {
          ne(me);
        });
        ae.add(me);
      }
      function j(ae, de, be) {
        if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(de = s())) {
          throw S(de, "name");
        }
        var fe = new oel(_(de));
        F(fe, function (Te) {
          if (Te === "option") {
            K(fe, Te);
            l(";");
          } else {
            i(Te);
            U(fe, "optional", undefined, be);
          }
        });
        ae.add(fe);
      }
      function z(ae, de) {
        if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(de = s())) {
          throw S(de, "name");
        }
        var be = new Rem(de);
        if (F(be, function (me) {
          switch (me) {
            case "option":
              K(be, me);
              l(";");
              break;
            case "reserved":
              if (x(be.reserved || (be.reserved = []), true), be.reserved === undefined) {
                be.reserved = [];
              }
              break;
            default:
              V(be, me);
          }
        }), ae.add(be), ae === h) {
          g.push(be);
        }
      }
      function V(ae, de) {
        if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(de)) {
          throw S(de, "name");
        }
        l("=");
        var be = k(s(), true);
        var fe = {
          options: undefined
        };
        fe.getOption = function (me) {
          return this.options[me];
        };
        fe.setOption = function (me, Te) {
          Aem.prototype.setOption.call(fe, me, Te);
        };
        fe.setParsedOption = function () {
          return;
        };
        F(fe, function (Te) {
          if (Te === "option") {
            K(fe, Te);
            l(";");
          } else {
            throw S(Te);
          }
        }, function () {
          ne(fe);
        });
        ae.add(de, be, fe.comment, fe.parsedOptions || fe.options);
      }
      function K(ae, de) {
        var be;
        var fe;
        var me = true;
        if (de === "option") {
          de = s();
        }
        while (de !== "=") {
          if (de === "(") {
            var Te = s();
            l(")");
            de = "(" + Te + ")";
          }
          if (me) {
            if (me = false, de.includes(".") && !de.includes("(")) {
              var ue = de.split(".");
              be = ue[0] + ".";
              de = ue[1];
              continue;
            }
            be = de;
          } else {
            fe = fe ? fe += de : de;
          }
          de = s();
        }
        var ce = fe ? be.concat(fe) : be;
        var le = J(ae, ce);
        fe = fe && fe[0] === "." ? fe.slice(1) : fe;
        be = be && be[be.length - 1] === "." ? be.slice(0, -1) : be;
        Z(ae, be, le, fe);
      }
      function J(ae, de, be) {
        if (be = rme.checkDepth(be), l("{", true)) {
          var fe = {};
          while (!l("}", true)) {
            if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(se = s())) {
              throw S(se, "name");
            }
            if (se === null) {
              throw S(se, "end of input");
            }
            var me;
            var Te = se;
            if (l(":", true), a() === "{") {
              me = J(ae, de + "." + se, be + 1);
            } else if (a() === "[") {
              me = [];
              var ue;
              if (l("[", true)) {
                do {
                  ue = C(true);
                  me.push(ue);
                } while (l(",", true));
                if (l("]"), typeof ue < "u") {
                  Q(ae, de + "." + se, ue);
                }
              }
            } else {
              me = C(true);
              Q(ae, de + "." + se, me);
            }
            var ce = fe[Te];
            if (ce) {
              me = [].concat(ce).concat(me);
            }
            if (Te !== "__proto__") {
              fe[Te] = me;
            }
            l(",", true);
            l(";", true);
          }
          return fe;
        }
        var le = C(true);
        Q(ae, de, le);
        return le;
      }
      function Q(ae, de, be) {
        if (h === ae && /^features\./.test(de)) {
          y[de] = be;
          return;
        }
        if (ae.setOption) {
          ae.setOption(de, be);
        }
      }
      function Z(ae, de, be, fe) {
        if (ae.setParsedOption) {
          ae.setParsedOption(de, be, fe);
        }
      }
      function ne(ae) {
        if (l("[", true)) {
          do {
            K(ae, "option");
          } while (l(",", true));
          l("]");
        }
        return ae;
      }
      function oe(ae, de, be) {
        if (be = rme.checkDepth(be), !(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(de = s())) {
          throw S(de, "service name");
        }
        var fe = new xem(de);
        if (F(fe, function (Te) {
          if (P(fe, Te, be)) {
            return;
          }
          if (Te === "rpc") {
            ee(fe, Te);
          } else {
            throw S(Te);
          }
        }), ae.add(fe), ae === h) {
          g.push(fe);
        }
      }
      function ee(ae, de) {
        var be = c();
        var fe = de;
        if (!(/^[a-zA-Z_][a-zA-Z_0-9]*$/).test(de = s())) {
          throw S(de, "name");
        }
        var me = de;
        var Te;
        var ue;
        var ce;
        var le;
        if (l("("), l("stream", true)) {
          ue = true;
        }
        if (!nme.test(de = s())) {
          throw S(de);
        }
        if (Te = de, l(")"), l("returns"), l("("), l("stream", true)) {
          le = true;
        }
        if (!nme.test(de = s())) {
          throw S(de);
        }
        ce = de;
        l(")");
        var pe = new kem(me, fe, Te, ce, ue, le);
        pe.comment = be;
        F(pe, function (_e) {
          if (_e === "option") {
            K(pe, _e);
            l(";");
          } else {
            throw S(_e);
          }
        });
        ae.add(pe);
      }
      function re(ae, de, be) {
        if (!nme.test(de = s())) {
          throw S(de, "reference");
        }
        var fe = de;
        F(null, function (Te) {
          switch (Te) {
            case "required":
            case "repeated":
              U(ae, Te, fe, be + 1);
              break;
            case "optional":
              if (f === "proto3") {
                U(ae, "proto3_optional", fe, be + 1);
              } else {
                U(ae, "optional", fe, be + 1);
              }
              break;
            default:
              if (f === "proto2" || !nme.test(Te)) {
                throw S(Te);
              }
              i(Te);
              U(ae, "optional", fe, be + 1);
              break;
          }
        });
      }
      var se;
      while ((se = s()) !== null) {
        switch (se) {
          case "package":
            if (!u) {
              throw S(se);
            }
            I();
            break;
          case "import":
            if (!u) {
              throw S(se);
            }
            O();
            break;
          case "syntax":
            if (!u) {
              throw S(se);
            }
            M();
            break;
          case "edition":
            if (!u) {
              throw S(se);
            }
            L();
            break;
          case "option":
            K(h, se);
            l(";", true);
            break;
          default:
            if (P(h, se, 0)) {
              u = false;
              continue;
            }
            throw S(se);
        }
      }
      b();
      tve.filename = null;
      return {
        package: d,
        imports: p,
        weakImports: m,
        root: t
      };
    }
  });
  var cel = __commonJS(($J_, lel) => {
    lel.exports = cse;
    function cse(e, t) {
      if (!(/\/|\./).test(e)) {
        e = "google/protobuf/" + e + ".proto";
        t = {
          nested: {
            google: {
              nested: {
                protobuf: {
                  nested: t
                }
              }
            }
          }
        };
      }
      cse[e] = t;
    }
    cse("any", {
      Any: {
        fields: {
          type_url: {
            type: "string",
            id: 1
          },
          value: {
            type: "bytes",
            id: 2
          }
        }
      }
    });