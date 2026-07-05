          if (t = COt.resolveSchema.call(this, r, e), !t) {
            return;
          }
          this.refs[e] = t;
        }
        return t.validate || this._compileSchemaEnv(t);
      }
      removeSchema(e) {
        if (e instanceof RegExp) {
          this._removeAllSchemas(this.schemas, e);
          this._removeAllSchemas(this.refs, e);
          return this;
        }
        switch (typeof e) {
          case "undefined":
            this._removeAllSchemas(this.schemas);
            this._removeAllSchemas(this.refs);
            this._cache.clear();
            return this;
          case "string":
            {
              let t = k_s.call(this, e);
              if (typeof t == "object") {
                this._cache.delete(t.schema);
              }
              delete this.schemas[e];
              delete this.refs[e];
              return this;
            }
          case "object":
            {
              let t = e;
              this._cache.delete(t);
              let n = e[this.opts.schemaId];
              if (n) {
                n = (0, ROt.normalizeId)(n);
                delete this.schemas[n];
                delete this.refs[n];
              }
              return this;
            }
          default:
            throw Error("ajv.removeSchema: invalid parameter");
        }
      }
      addVocabulary(e) {
        for (let t of e) {
          this.addKeyword(t);
        }
        return this;
      }
      addKeyword(e, t) {
        let n;
        if (typeof e == "string") {
          if (n = e, typeof t == "object") {
            this.logger.warn("these parameters are deprecated, see docs for addKeyword");
            t.keyword = n;
          }
        } else if (typeof e == "object" && t === undefined) {
          if (t = e, n = t.keyword, Array.isArray(n) && !n.length) {
            throw Error("addKeywords: keyword must be string or non-empty array");
          }
        } else {
          throw Error("invalid addKeywords parameters");
        }
        if (hhu.call(this, n, t), !t) {
          (0, XIr.eachItem)(n, o => JIr.call(this, o));
          return this;
        }
        yhu.call(this, t);
        let r = {
          ...t,
          type: (0, Imn.getJSONTypes)(t.type),
          schemaType: (0, Imn.getJSONTypes)(t.schemaType)
        };
        (0, XIr.eachItem)(n, r.type.length === 0 ? o => JIr.call(this, o, r) : o => r.type.forEach(s => JIr.call(this, o, r, s)));
        return this;
      }
      getKeyword(e) {
        let t = this.RULES.all[e];
        return typeof t == "object" ? t.definition : !!t;
      }
      removeKeyword(e) {
        let {
          RULES: t
        } = this;
        delete t.keywords[e];
        delete t.all[e];
        for (let n of t.rules) {
          let r = n.rules.findIndex(o => o.keyword === e);
          if (r >= 0) {
            n.rules.splice(r, 1);
          }
        }
        return this;
      }
      addFormat(e, t) {
        if (typeof t == "string") {
          t = new RegExp(t);
        }
        this.formats[e] = t;
        return this;
      }
      errorsText(e = this.errors, {
        separator: t = ", ",
        dataVar: n = "data"
      } = {}) {
        if (!e || e.length === 0) {
          return "No errors";
        }
        return e.map(r => `${n}${r.instancePath} ${r.message}`).reduce((r, o) => r + t + o);
      }
      $dataMetaSchema(e, t) {
        let n = this.RULES.all;
        e = JSON.parse(JSON.stringify(e));
        for (let r of t) {
          let o = r.split("/").slice(1);
          let s = e;
          for (let i of o) {
            s = s[i];
          }
          for (let i in n) {
            let a = n[i];
            if (typeof a != "object") {
              continue;
            }
            let {
              $data: l
            } = a.definition;
            let c = s[i];
            if (l && c) {
              s[i] = P_s(c);
            }
          }
        }
        return e;
      }
      _removeAllSchemas(e, t) {
        for (let n in e) {
          let r = e[n];
          if (!t || t.test(n)) {
            if (typeof r == "string") {
              delete e[n];
            } else if (r && !r.meta) {
              this._cache.delete(r.schema);
              delete e[n];
            }
          }
        }
      }
      _addSchema(e, t, n, r = this.opts.validateSchema, o = this.opts.addUsedSchema) {
        let s;
        let {
          schemaId: i
        } = this.opts;
        if (typeof e == "object") {
          s = e[i];
        } else if (this.opts.jtd) {
          throw Error("schema must be object");
        } else if (typeof e != "boolean") {
          throw Error("schema must be object or boolean");
        }
        let a = this._cache.get(e);
        if (a !== undefined) {
          return a;
        }
        n = (0, ROt.normalizeId)(s || n);
        let l = ROt.getSchemaRefs.call(this, e, n);
        if (a = new COt.SchemaEnv({
          schema: e,
          schemaId: i,
          meta: t,
          baseId: n,
          localRefs: l
        }), this._cache.set(a.schema, a), o && !n.startsWith("#")) {
          if (n) {
            this._checkUnique(n);
          }
          this.refs[n] = a;
        }
        if (r) {
          this.validateSchema(e, true);
        }
        return a;
      }
      _checkUnique(e) {
        if (this.schemas[e] || this.refs[e]) {
          throw Error(`schema with key or id "${e}" already exists`);
        }
      }
      _compileSchemaEnv(e) {
        if (e.meta) {
          this._compileMetaSchema(e);
        } else {
          COt.compileSchema.call(this, e);
        }
        if (!e.validate) {
          throw Error("ajv implementation error");
        }
        return e.validate;
      }
      _compileMetaSchema(e) {
        let t = this.opts;
        this.opts = this._metaOpts;
        try {
          COt.compileSchema.call(this, e);
        } finally {
          this.opts = t;
        }
      }
    }
    Pmn.ValidationError = Zfu.default;
    Pmn.MissingRefError = A_s.default;
    XL.default = Pmn;
    function x_s(e, t, n, r = "error") {
      for (let o in e) {
        let s = o;
        if (s in t) {
          this.logger[r](`${n}: option ${o}. ${e[s]}`);
        }
      }
    }
    function k_s(e) {
      e = (0, ROt.normalizeId)(e);
      return this.schemas[e] || this.refs[e];
    }
    function lhu() {
      let e = this.opts.schemas;
      if (!e) {
        return;
      }
      if (Array.isArray(e)) {
        this.addSchema(e);
      } else {
        for (let t in e) {
          this.addSchema(e[t], t);
        }
      }
    }
    function chu() {
      for (let e in this.opts.formats) {
        let t = this.opts.formats[e];
        if (t) {
          this.addFormat(e, t);
        }
      }
    }
    function uhu(e) {
      if (Array.isArray(e)) {
        this.addVocabulary(e);
        return;
      }
      this.logger.warn("keywords option as map is deprecated, pass array");
      for (let t in e) {
        let n = e[t];
        if (!n.keyword) {
          n.keyword = t;
        }
        this.addKeyword(n);
      }
    }
    function dhu() {
      let e = {
        ...this.opts
      };
      for (let t of rhu) {
        delete e[t];
      }
      return e;
    }
    var phu = {
      log() {},
      warn() {},
      error() {}
    };
    function mhu(e) {
      if (e === false) {
        return phu;
      }
      if (e === undefined) {
        return console;
      }
      if (e.log && e.warn && e.error) {
        return e;
      }
      throw Error("logger must implement log, warn and error methods");
    }
    function hhu(e, t) {
      let {
        RULES: n
      } = this;
      if ((0, XIr.eachItem)(e, r => {
        if (n.keywords[r]) {
          throw Error(`Keyword ${r} is already defined`);
        }
        if (!(/^[a-z_$][a-z0-9_$:-]*$/i).test(r)) {
          throw Error(`Keyword ${r} has invalid name`);
        }
      }), !t) {
        return;
      }
      if (t.$data && !("code" in t || "validate" in t)) {
        throw Error('$data keyword must have "code" or "validate" function');
      }
    }
    function JIr(e, t, n) {
      var r;
      let o = t === null || t === undefined ? undefined : t.post;
      if (n && o) {
        throw Error('keyword with "post" flag cannot have "type"');
      }
      let {
        RULES: s
      } = this;
      let i = o ? s.post : s.rules.find(({
        type: l
      }) => l === n);
      if (!i) {
        i = {
          type: n,
          rules: []
        };
        s.rules.push(i);
      }
      if (s.keywords[e] = true, !t) {
        return;
      }
      let a = {
        keyword: e,
        definition: {
          ...t,
          type: (0, Imn.getJSONTypes)(t.type),
          schemaType: (0, Imn.getJSONTypes)(t.schemaType)
        }
      };
      if (t.before) {
        ghu.call(this, i, a, t.before);
      } else {
        i.rules.push(a);
      }
      s.all[e] = a;
      (r = t.implements) === null || r === undefined || r.forEach(l => this.addKeyword(l));
    }
    function ghu(e, t, n) {
      let r = e.rules.findIndex(o => o.keyword === n);
      if (r >= 0) {
        e.rules.splice(r, 0, t);
      } else {
        e.rules.push(t);
        this.logger.warn(`rule ${n} is not defined`);
      }
    }
    function yhu(e) {
      let {
        metaSchema: t
      } = e;
      if (t === undefined) {
        return;
      }
      if (e.$data && this.opts.$data) {
        t = P_s(t);
      }
      e.validateSchema = this.compile(t, true);
    }
    var _hu = {
      $ref: "https://raw.githubusercontent.com/ajv-validator/ajv/master/lib/refs/data.json#"
    };
    function P_s(e) {
      return {
        anyOf: [e, _hu]
      };
    }
  });