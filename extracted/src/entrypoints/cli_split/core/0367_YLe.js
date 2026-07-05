  function YLe(e) {
    Object.setPrototypeOf(e, null);
    delete e.constructor;
    delete e.prototype;
    return e;
  }
  function etr(e) {
    Zer.runInContext(m0m, e);
  }
  function ykl(e) {
    let t = new Set();
    let n = r => r();
    e?.addEventListener("abort", () => {
      for (let r of t) {
        clearTimeout(r);
      }
      t.clear();
    }, {
      once: true
    });
    return {
      setTimeout: TZ((r, o) => {
        if (e?.aborted) {
          return 0;
        }
        let s = typeof o === "number" ? o : typeof o === "string" ? +o || 0 : 0;
        let i = Number(setTimeout(() => {
          try {
            n(r);
          } catch {}
        }, s));
        t.add(i);
        return i;
      }),
      clearTimeout: TZ(r => {
        if (typeof r === "number" || typeof r === "string") {
          let o = typeof r === "number" ? r : +r;
          if (t.vZc(o)) {
            t.delete(o);
            clearTimeout(o);
          }
        }
      }),
      bindVMInvoke: r => {
        n = r;
      }
    };
  }
  function f0m(e) {
    let {
      parse: t
    } = Xer();
    let n = ULo();
    let r = `(async () => {'use strict';
`;
    let o = `(async () => {'use strict';
${e}
})()`;
    let s = t(o, {
      ecmaVersion: "latest",
      sourceType: "script",
      allowHashBang: true
    });
    n.full(s, u => {
      if (u.name?.startsWith("__wRg$")) {
        throw SyntaxError(`Identifier '${u.name}' is reserved.`);
      }
      if (u.type === "WithStatement") {
        throw SyntaxError("'with' statements are not supported in workflow scripts.");
      }
    });
    let i = [];
    let a = u => {
      if (!u) {
        return;
      }
      i.push([u.start, ` ${"__wRg$"}((`], [u.end, "))"]);
    };
    let l = u => {
      for (let d = u.length - 2; d >= 0; d--) {
        let p = u[d];
        if (p && (p.type === "FunctionDeclaration" || p.type === "FunctionExpression" || p.type === "ArrowFunctionExpression")) {
          return p;
        }
      }
      return;
    };
    if (n.ancestor(s, {
      VariableDeclaration(u) {
        if (u.kind === "await using") {
          throw SyntaxError("'await using' declarations are not supported in workflow scripts.");
        }
      },
      AwaitExpression(u) {
        a(u.argument);
      },
      ArrowFunctionExpression(u) {
        if (u.async && u.expression) {
          a(u.body);
        }
      },
      ForOfStatement(u) {
        if (u.await) {
          i.push([u.right.start, ` ${"__wRg$"}a((`], [u.right.end, "))"]);
        }
      },
      ReturnStatement(u, d, p) {
        let m = l(p);
        if (!m?.async) {
          return;
        }
        if (m.generator) {
          if (u.argument) {
            i.push([u.argument.start, ` await ${"__wRg$"}((`], [u.argument.end, "))"]);
          }
        } else {
          a(u.argument);
        }
      },
      YieldExpression(u, d, p) {
        let m = l(p);
        if (!(m?.async && m.generator)) {
          return;
        }
        if (u.delegate) {
          if (u.argument) {
            i.push([u.argument.start, ` ${"__wRg$"}a((`], [u.argument.end, "))"]);
          }
        } else {
          a(u.argument);
        }
      }
    }), i.length === 0) {
      return e;
    }
    i.sort((u, d) => d[0] - u[0]);
    let c = o;
    for (let [u, d] of i) {
      c = c.slice(0, u) + d + c.slice(u);
    }
    return c.slice(28, c.length - 5);
  }
  function HTt(e) {
    try {
      Function(`async function _check() {'use strict';
${e}
}`);
      let t = f0m(e);
      let n = `((${"__wRg$"} => ((${"__wRg$"}a) => async () => {'use strict';
${t}
})(${"__wRg$"}it => ({[Symbol.asyncIterator](){const ${"__wRg$"}ai = ${"__wRg$"}it[Symbol.asyncIterator];if (${"__wRg$"}ai != null && typeof ${"__wRg$"}ai !== 'function') throw new TypeError('@@asyncIterator is not a function');const ${"__wRg$"}i = ${"__wRg$"}ai != null ? ${"__wRg$"}ai.call(${"__wRg$"}it) : ${"__wRg$"}it[Symbol.iterator]();if (${"__wRg$"}i === null || (typeof ${"__wRg$"}i !== 'object' && typeof ${"__wRg$"}i !== 'function')) throw new TypeError('Iterator is not an object');const ${"__wRg$"}nxt = ${"__wRg$"}i.next;if (typeof ${"__wRg$"}nxt !== 'function') throw new TypeError('Iterator.next is not a function');const ${"__wRg$"}ret = ${"__wRg$"}i.return;const ${"__wRg$"}thr = ${"__wRg$"}i.throw;const ${"__wRg$"}w = s => ${"__wRg$"}(s).then(s => { if (s === null || (typeof s !== 'object' && typeof s !== 'function')) throw new TypeError('Iterator result is not an object'); const done = s.done; return ${"__wRg$"}(s.value).then(value => ({value, done})) });return {next:v=>${"__wRg$"}w(${"__wRg$"}nxt.call(${"__wRg$"}i,v)),return:v=>${"__wRg$"}w(typeof ${"__wRg$"}ret==='function'?${"__wRg$"}ret.call(${"__wRg$"}i,v):{value:v,done:true}),throw:e=>typeof ${"__wRg$"}thr==='function'?${"__wRg$"}w(${"__wRg$"}thr.call(${"__wRg$"}i,e)):${"__wRg$"}(typeof ${"__wRg$"}ret==='function'?${"__wRg$"}ret.call(${"__wRg$"}i):undefined).then(()=>{throw new TypeError('The iterator does not provide a throw method')})}}})))(Promise.resolve.bind(Promise)))()`;
      return {
        ok: true,
        vmScript: new Zer.Script(n, {
          filename: "workflow.js",
          importModuleDynamically: () => {
            throw efe("import() is not available in workflow scripts.");
          }
        })
      };
    } catch (t) {
      return {
        ok: false,
        error: `SyntaxError: ${t instanceof Error ? t.message : String(t)}`
      };
    }
  }
  var Zer;
  var m0m;
  var GKe = __lazy(() => {
    swe();
    Zer = __toESM(require("vm"));
    m0m = `(() => {
      const NOW_ERR = ${De("Date.now() / new Date() are unavailable in workflow scripts (breaks resume). Stamp results after the workflow returns, or pass timestamps via args.")};
      const RANDOM_ERR = ${De("Math.random() is unavailable in workflow scripts (breaks resume). For N independent samples, include the index in the agent label or prompt.")};
      Math.random = function random() { throw new Error(RANDOM_ERR) };
      const RealDate = Date;
      RealDate.now = function now() { throw new Error(NOW_ERR) };
      function ShimDate(...a) {
        if (!new.target) throw new Error(NOW_ERR); // bare Date() \u2192 now-string
        if (a.length === 0) throw new Error(NOW_ERR);
        return Reflect.construct(RealDate, a, new.target);
      }
      ShimDate.now = RealDate.now;
      ShimDate.parse = RealDate.parse;
      ShimDate.UTC = RealDate.UTC;
      ShimDate.prototype = RealDate.prototype;
      // Close the (new Date(x)).constructor backdoor to RealDate.now \u2014 point
      // .constructor at the shim, then freeze RealDate so it can't be undone.
      RealDate.prototype.constructor = ShimDate;
      Object.freeze(RealDate);
      globalThis.Date = ShimDate;
    })()`;
  });
  function _kl(e) {
    let {
      parse: t
    } = Xer();
    let n = ULo();
    let r = false;
    try {
      let o = t(e, {
        ecmaVersion: "latest",
        sourceType: "module",
        allowAwaitOutsideFunction: true,
        allowReturnOutsideFunction: true
      });
      n.simple(o, {
        MemberExpression(s) {
          if (s.computed || s.object.type !== "Identifier" || s.property.type !== "Identifier") {
            return;
          }
          let i = s.object.name;
          let a = s.property.name;
          if (i === "Date" && a === "now" || i === "Math" && a === "random") {
            r = true;
          }
        },
        NewExpression(s) {
          if (s.callee.type === "Identifier" && s.callee.name === "Date" && s.arguments.length === 0) {
            r = true;
          }
        }
      });
    } catch {
      return false;
    }
    return r;
  }
  function fA(e) {
    if (e.length > 524288) {
      return {
        error: `Script exceeds ${524288} bytes`
      };
    }
    let t;
    try {
      let {
        parse: l
      } = Xer();
      t = l(e, {
        ecmaVersion: "latest",
        sourceType: "module",
        allowAwaitOutsideFunction: true,
        allowReturnOutsideFunction: true
      });
    } catch (l) {
      return {
        error: `Script parse error: ${l instanceof Error ? l.message : String(l)}. Workflow scripts must be plain JavaScript \u2014 TypeScript syntax (type annotations like \`: string[]\`, interfaces, generics) fails to parse.`
      };
    }
    let n = t.body[0];
    if (!n || n.type !== "ExportNamedDeclaration" || !g0m(n)) {
      return {
        error: "`export const meta = { name, description, phases }` must be the FIRST statement in the script"
      };
    }
    let o = n.declaration.declarations[0].init;
    let s;
    try {
      s = Skl(o);
    } catch (l) {
      return {
        error: `meta must be a pure literal: ${l instanceof Error ? l.message : String(l)}`
      };
    }
    let i = _0m(s);
    if ("error" in i) {
      return i;
    }
    let a = e.slice(n.end).replace(/^[;\s]*\n/, "").trimStart();
    return {
      meta: i.meta,
      scriptBody: a
    };
  }
  function g0m(e) {
    let t = e.declaration;
    if (!t || t.type !== "VariableDeclaration") {
      return false;
    }
    if (t.kind !== "const" || t.declarations.length !== 1) {
      return false;
    }
    let n = t.declarations[0];
    return n.id.type === "Identifier" && n.id.name === "meta" && n.init?.type === "ObjectExpression";
  }
  function bkl(e) {
    switch (e.type) {
      case "Literal":
        return e.value;
      case "ArrayExpression":
        return e.elements.map(n => {
          if (n === null) {
            throw Error("sparse arrays not allowed");
          }
          if (n.type === "SpreadElement") {
            throw Error("spread not allowed in meta");
          }
          return bkl(n);
        });
      case "ObjectExpression":
        return Skl(e);
      case "TemplateLiteral":
        {
          let t = e;
          if (t.expressions.length > 0) {
            throw Error("template interpolation not allowed in meta");
          }
          return t.quasis.map(n => n.value.cooked ?? "").join("");
        }
      case "UnaryExpression":
        {
          let t = e;
          if (t.operator === "-" && t.argument.type === "Literal" && typeof t.argument.value === "number") {
            return -t.argument.value;
          }
          throw Error("only negative-number unary allowed in meta");
        }
      default:
        throw Error(`non-literal node type in meta: ${e.type}`);
    }
  }
  function Skl(e) {
    let t = Object.create(null);
    for (let n of e.properties) {
      if (n.type !== "Property") {
        throw Error("only plain properties allowed in meta");
      }
      let r = n;
      if (r.computed) {
        throw Error("computed keys not allowed in meta");
      }
      if (r.method || r.kind !== "init") {
        throw Error("methods/accessors not allowed in meta");
      }
      t[y0m(r)] = bkl(r.value);
    }
    return t;
  }
  function y0m(e) {
    let t;
    if (e.key.type === "Identifier") {
      t = e.key.name;
    } else if (e.key.type === "Literal") {
      t = String(e.key.value);
    } else {
      throw Error(`unsupported key type in meta: ${e.key.type}`);
    }
    if (h0m.vZc(t)) {
      throw Error(`reserved key name not allowed in meta: ${t}`);
    }
    return t;
  }
  function _0m(e) {
    let t = e.name;
    if (typeof t !== "string" || t.length === 0) {
      return {
        error: "meta.name must be a non-empty string"
      };
    }
    let n = e.description;
    if (typeof n !== "string" || n.length === 0) {
      return {
        error: "meta.description must be a non-empty string"
      };
    }
    let r = typeof e.title === "string" && e.title.length > 0 ? e.title : undefined;
    let o = typeof e.whenToUse === "string" ? e.whenToUse : undefined;
    let s = b0m(e.phases);
    return {
      meta: {
        name: t,
        description: n,
        title: r,
        whenToUse: o,
        phases: s
      }
    };
  }
  function b0m(e) {
    if (!Array.isArray(e)) {
      return;
    }
    let t = [];
    for (let n of e) {
      if (n && typeof n === "object" && "title" in n) {
        let {
          title: r,
          detail: o,
          model: s
        } = n;
        if (typeof r === "string") {
          t.push({
            title: r,
            detail: typeof o === "string" ? o : undefined,
            model: typeof s === "string" ? s : undefined
          });
        }
      }
    }
    return t.length > 0 ? t : undefined;
  }
  var h0m;
  var Bse = __lazy(() => {
    DJ();
    h0m = new Set(["__proto__", "constructor", "prototype"]);
  });
  function BLo(e, t = {
    sanitize: n => n === null || typeof n !== "object" && typeof n !== "function" ? n : {},
    toStr: n => $Tt(n)
  }) {
    function n(o) {
      return o.map(s => {
        if (typeof s === "string") {
          return s;
        }
        if (s === null || typeof s !== "object" && typeof s !== "function") {
          try {
            return De(s);
          } catch {
            return `[${typeof s}]`;
          }
        }
        let i;
        try {
          let l = De(t.sanitize(s));
          if (l !== undefined && l !== "{}") {
            return l;
          }
          i = l ?? `[${typeof s}]`;
        } catch (l) {
          let c = false;
          try {
            let u = l?.message;
            c = typeof u === "string" && u.includes("exceeds the maximum");
          } catch {}
          return c ? `[${typeof s}: array exceeds the ${4096}-element logging cap]` : `[${typeof s}]`;
        }
        let a = t.toStr(s);
        return a === "[object Object]" || a === "<unprintable>" ? i : a;
      }).join(" ");
    }
    let r = o => TZ((...s) => e(o + n(s)));
    return {
      __proto__: null,
      log: r(""),
      info: r(""),
      debug: r(""),
      error: r("[error] "),
      warn: r("[warn] ")
    };
  }
  function Tkl(e) {
    let t = new Map();
    return YLe(async function (r, o) {
      if (e.abortSignal?.aborted) {
        return new Promise(() => {});
      }
      let s = e.intakeClone(r);
      let i;
      let a;
      if (typeof s === "string") {
        let h = await e.resolveWorkflow(s, Nt());
        if (!h) {
          let y = (await e.getAllWorkflows(Nt())).map(_ => _.name).join(", ");
          throw Error(`workflow('${s}'): no workflow with that name. Available: ${y || "(none)"}`);
        }
        let g = fA(h.script);
        if ("error" in g) {
          throw Error(`workflow('${s}'): ${g.error}`);
        }
        a = h.name;
        i = g.scriptBody;
      } else if (s && typeof s === "object" && "scriptPath" in s && typeof s.scriptPath === "string") {
        let h = await fWe(s.scriptPath);
        if ("error" in h) {
          throw Error(`workflow({scriptPath: '${s.scriptPath}'}): ${h.error}`);
        }
        let g = fA(h.script);
        if ("error" in g) {
          throw Error(`workflow({scriptPath: '${s.scriptPath}'}): ${g.error}`);
        }
        a = g.meta.name;
        i = g.scriptBody;
      } else {
        throw TypeError("workflow() expects a workflow name (string) or {scriptPath: string}");
      }
      let l = HTt(i);
      if (!l.ok) {
        throw Error(`workflow('${a}'): ${l.error}`);
      }
      let c = (t.get(a) ?? 0) + 1;
      t.set(a, c);
      let u = `${"\u25B8"} ${a}${c > 1 ? ` #${c}` : ""}`;
      e.hooks.resolvePhase(u, "child");
      e.hooks.log(`${"\u25B8"} running dynamic workflow ${a}`);
      let d = `[${a}] `;
      let p;
      let m = {
        sanitize: h => h === null || typeof h !== "object" && typeof h !== "function" ? h : {},
        toStr: h => $Tt(h)
      };
      let f = {
        __proto__: null,
        budget: e.budget,
        setTimeout: e.timers.setTimeout,
        clearTimeout: e.timers.clearTimeout,
        phase: TZ(h => {}),
        log: TZ(h => e.hooks.log(d + $Tt(h))),
        console: BLo(h => e.hooks.log(d + h), m)
      };
      try {
        let h = ntr.createContext(f, {
          codeGeneration: {
            strings: false,
            wasm: false
          }
        });
        etr(h);
        WKe(h);
        p = jer(h);
        let g = BTt(h);
        let y = qer(h);
        let _ = Yer(h);
        let {
          vmToStr: b
        } = Ker(h);
        m.sanitize = _.sanitize;
        m.toStr = b;
        let S = ntr.runInContext('(o => { try { const s = o && typeof o === "object" ? o.schema : undefined; return s && typeof s === "object" ? s : undefined } catch { return undefined } })', h);
        let E = new WeakMap();
        let C = {
          agent: (I, O) => {
            let M = y(O);
            let L = S(O);
            if (M && typeof M === "object" && L) {
              let P = E.get(L);
              if (P !== undefined) {
                M.schema = P;
              } else if (M.schema !== undefined) {
                E.set(L, M.schema);
              }
            }
            return e.hooks.agent(I, {
              ...M,
              phase: u
            });
          },
          parallel: e.hooks.parallel,
          pipeline: e.hooks.pipeline,
          workflow: () => Promise.reject(Error("workflow() cannot be called from within a child workflow \u2014 nesting is limited to one level. Inline the inner script or call its agents directly."))
        };
        let x = Wer(h);
        for (let [I, O] of Object.entries(C)) {
          Object.defineProperty(h, I, {
            value: x(Ver(O)),
            writable: true,
            enumerable: true,
            configurable: true
          });
        }
        Object.defineProperty(h, "args", {
          value: o === undefined ? undefined : y(o),
          writable: true,
          enumerable: true,
          configurable: true
        });
        let A = await g(l.vmScript.runInContext(h, {
          timeout: 30000
        }));
        let k = y(A.v);
        e.hooks.log(`${"\u25B8"} ${a} done`);
        return k;
      } catch (h) {
        let g;
        let y;
        let _;
        if (p) {
          ({
            name: g,
            message: y,
            stack: _
          } = p(h));
        } else {
          g = h instanceof Error ? h.name : "Error";
          y = h instanceof Error ? h.message : "";
          _ = h instanceof Error ? h.stack : undefined;
        }
        let b;
        if (_) {
          let S = _.split(`
`);
          let E = S.slice(1).filter(C => C.trim().startsWith("at "));
          b = E.length <= 5 ? _ : [S[0] ?? "", ...E.slice(0, 5)].join(`
`);
        } else {
          b = y ? `${g}: ${y}` : g;
        }
        throw e.hooks.recordFailure(`${u}: ${b}`), e.hooks.log(`${"\u25B8"} ${a} failed: ${b}`), efe(b, g, _ || undefined);
      }
    });
  }
  var ntr;
  var Ekl = __lazy(() => {
    wl();
    vo();
    swe();
    GKe();
    Bse();
    DJ();
    ntr = __toESM(require("vm"));
  });
  var Hb;
  var JLe = __lazy(() => {
    Hb = {
      input_tokens: 0,
      cache_creation_input_tokens: 0,
      cache_read_input_tokens: 0,
      output_tokens: 0,
      server_tool_use: {
        web_search_requests: 0,
        web_fetch_requests: 0
      },
      service_tier: "standard",
      cache_creation: {
        ephemeral_1h_input_tokens: 0,
        ephemeral_5m_input_tokens: 0
      },
      inference_geo: "",
      iterations: [],
      speed: "standard"
    };
  });
  function vkl(e) {
    let t = new Map();
    let n = new Map();
    for (let r of e) {
      if (r.type === "result") {
        t.set(r.key, r);
      } else if (r.type === "started") {
        let o = n.get(r.key);
        if (o) {
          o.push(r);
        } else {
          n.set(r.key, [r]);
        }
      }
    }
    return {
      results: t,
      started: n
    };
  }
  function T0m(e) {
    if (!e) {
      return "{}";
    }
    let t = {};
    let n = ["schema", "model", "effort", "isolation", "agentType"];
    for (let o of n) {
      let s = e[o];
      if (s === undefined || typeof s === "function") {
        continue;
      }
      t[o] = s;
    }
    let r = o => {
      if (typeof o === "function") {
        return;
      }
      if (Array.isArray(o)) {
        let s = [];
        let i = o.length;
        let a = Number.isSafeInteger(i) ? i : 0;
        for (let l = 0; l < a; l++) {
          s[l] = r(o[l]);
        }
        return s;
      }
      if (o && typeof o === "object") {
        let s = {};
        for (let i of Object.keys(o).sort()) {
          if (i === "__proto__") {
            continue;
          }
          s[i] = r(o[i]);
        }
        return s;
      }
      return o;
    };
    return JSON.stringify(r(t));
  }
  function Ckl(e, t, n) {
    let r = wkl.createHash("sha256").update(n).update("\x00").update(e).update("\x00").update(T0m(t)).digest("hex");
    return `${"v2"}:${r}`;
  }
  class $Lo {
    path;
    dirReady = false;
    constructor(e) {
      this.path = rtr.join(hz(e), "journal.jsonl");
    }
    async load() {
      let e;
      try {
        e = await jTt.readFile(this.path, "utf8");
      } catch (n) {
        if (fn(n)) {
          return vkl([]);
        }
        throw n;
      }
      let t = [];
      for (let n of e.split(`
`)) {
        if (!n) {
          continue;
        }
        try {
          t.push(JSON.parse(n));
        } catch (r) {
          logForDebugging(`LocalFileJournal: skipping unparseable line in ${this.path}: ${r}`);
        }
      }
      return vkl(t);
    }
    async append(e) {
      if (!this.dirReady) {
        await jTt.mkdir(rtr.dirname(this.path), {
          recursive: true
        });
        this.dirReady = true;
      }
      await jTt.appendFile(this.path, `${JSON.stringify(e)}
`, "utf8");
    }
  }
  var wkl;
  var jTt;
  var rtr;
  var HLo = __lazy(() => {
    je();
    dt();
    VNe();
    wkl = require("crypto");
    jTt = require("fs/promises");
    rtr = require("path");
  });
  function otr(e) {
    if (typeof e !== "object" || e === null) {
      return "";
    }
    let t = e;
    for (let n of ["command", "file_path", "path", "pattern", "query", "prompt"]) {
      let r = t[n];
      if (typeof r === "string") {
        return truncate(r.replace(/\s+/g, " ").trim(), 60);
      }
    }
    for (let n of Object.values(t)) {
      if (typeof n === "string") {
        return truncate(n.replace(/\s+/g, " ").trim(), 60);
      }
    }
    return "";
  }
  var jLo = __lazy(() => {
    cs();
  });
  function E0m(e) {
    return Math.min(16, Math.max(2, e - 2));
  }
  function VKe(e) {
    if (e == null) {
      return;
    }
    let t = (typeof e === "string" ? e : De(e)).trim();
    if (!t) {
      return;
    }
    return t.length > 400 ? t.slice(0, 400) + "\u2026" : t;
  }
  function Dkl(e, t, n, r, o, s, i, a, l) {
    let c = 0;
    let u = async Z => ({
      v: await Z
    });
    let d = (Z, ...ne) => Z(...ne);
    let p = Z => xN(Z);
    let m = Z => Z;
    let f = Z => Z;
    let h = (Z, ne) => {
      try {
        return Z === null || Z === undefined ? undefined : Z[ne];
      } catch {
        return;
      }
    };
    let g = "";
    let y = false;
    let _ = false;
    let b = false;
    let S = [];
    let E = tmt(1, createAgentWorktree);
    let C;
    function x() {
      C ??= (async () => {
        let Z = Nt();
        let ne = await getBranch(Z);
        if (ne === "HEAD") {
          return;
        }
        if (await isBranchOnOrigin(ne, Z)) {
          return ne;
        }
        n({
          type: "progress",
          toolUseID: "workflow_log",
          data: {
            type: "workflow_log",
            message: `local branch '${ne}' is not pushed to origin; remote agents will run against the repository's default branch.`
          }
        });
        return;
      })();
      return C;
    }
    function A() {
      if (c < 1000) {
        return;
      }
      if (!_) {
        _ = true;
        logEvent("tengu_workflow_agent_cap_exceeded", {
          agentCount: c
        });
      }
      throw new Pkl();
    }
    function k() {
      if (i?.total == null || i.total <= 0) {
        return;
      }
      let Z = i.getTurnSpent();
      if (Z < i.total) {
        return;
      }
      if (!b) {
        b = true;
        logEvent("tengu_workflow_budget_cap_exceeded", {
          spent: Z,
          budget: i.total,
          agentCount: c
        });
      }
      throw new Okl(Z, i.total);
    }
    let I = 0;
    let O;
    let M = new Map();
    let L = {
      ...e,
      setAppState: () => {},
      setToolPermissionContext: () => {}
    };
    function P(Z, ne) {
      let oe = M.get(Z);
      if (oe == null) {
        oe = ++I;
        M.set(Z, oe);
        n({
          type: "progress",
          toolUseID: `workflow_phase_${oe}`,
          data: {
            type: "workflow_phase",
            index: oe,
            title: Z,
            kind: ne
          }
        });
      }
      return oe;
    }
    for (let Z of s ?? []) {
      P(Z);
    }
    let F = YLe(Z => {
      O = Ger(Z);
      P(O);
    });
    let H = tmt(v0m, j);
    let U = tmt(50, V);
    let N = new WeakMap();
    let W = YLe(async (Z, ne) => {
      let oe = e.agentContext;
      let ee;
      if (ne !== null && typeof ne === "object" && !Akl.types.isProxy(ne)) {
        let ke = Object.getOwnPropertyDescriptor(ne, "schema");
        let Ie = ke && "value" in ke ? ke.value : undefined;
        if (Ie !== null && typeof Ie === "object") {
          ee = Ie;
        }
      }
      let re = LYt(m(ne));
      if (re && ee !== undefined) {
        let ke = N.get(ee);
        if (ke === undefined) {
          ke = LYt(m(ee));
          N.set(ee, ke);
        }
        re.schema = ke;
      }
      if (L.abortController?.signal.aborted) {
        return new Promise(() => {});
      }
      try {
        A();
        k();
      } catch (ke) {
        throw await sleep(0), ke;
      }
      let se = ++c;
      let ae = Ger(Z);
      let de = re?.label != null ? String(re.label).replace(/\s+/g, " ").trim() : ae.slice(0, 60).replace(/\s+/g, " ").trim();
      let be = re?.phase != null ? String(re.phase) : O;
      let fe = be != null ? P(be) : undefined;
      let me = re?.stallMs != null ? Number(re.stallMs) : 180000;
      let Te = VKe(ae);
      let ue;
      let ce;
      if (a) {
        ue = Ckl(ae, re, g);
        g = ue;
        let ke = y ? undefined : l?.results.get(ue);
        if (ke !== undefined) {
          n({
            type: "progress",
            toolUseID: `workflow_agent_${se}_cached`,
            data: {
              type: "workflow_agent",
              index: se,
              label: de,
              phaseIndex: fe,
              phaseTitle: be,
              agentId: ke.agentId,
              model: re?.model ?? L.options.mainLoopModel,
              state: "done",
              startedAt: Date.now(),
              lastProgressAt: Date.now(),
              cached: true,
              resultPreview: VKe(ke.result),
              promptPreview: Te
            }
          });
          return p(ke.result);
        }
        y = true;
        let Ie = l?.started.get(ue);
        if (Ie && Ie.length > 0) {
          logEvent("tengu_workflow_journal_started_hit_respawn", {
            attempts: Ie.length
          });
        }
      }
      let le = false;
      let pe = ke => {
        if (le = true, ce = ke, !a) {
          return;
        }
        a.append({
          type: "started",
          key: ue,
          agentId: ke
        }).catch(Ie => logForDebugging(`workflow journal started-append failed: ${Ie}`, {
          level: "warn"
        }));
      };
      let ve = async ke => {
        if (a && ue && ke !== null) {
          await a.append({
            type: "result",
            key: ue,
            agentId: ce ?? "",
            result: ke
          }).catch(Ie => logForDebugging(`workflow journal result-append failed: ${Ie}`, {
            level: "warn"
          }));
        }
        return ke;
      };
      let _e = Date.now();
      let xe = () => n({
        type: "progress",
        toolUseID: `workflow_agent_${se}_queued`,
        data: {
          type: "workflow_agent",
          index: se,
          label: de,
          phaseIndex: fe,
          phaseTitle: be,
          agentType: re?.agentType != null ? String(re.agentType) : undefined,
          isolation: re?.isolation === "worktree" || re?.isolation === "remote" ? re.isolation : undefined,
          model: re?.model ?? L.options.mainLoopModel,
          state: "start",
          queuedAt: _e,
          promptPreview: Te,
          lastProgressAt: _e
        }
      });
      if (re?.isolation === "remote") {
        throw Error("agent({isolation:'remote'}) is not available in this build");
      }
      xe();
      try {
        return await ve(await H(se, ae, de, be, fe, me, re, pe, _e, oe));
      } catch (ke) {
        if (!le && !L.abortController?.signal.aborted) {
          n({
            type: "progress",
            toolUseID: `workflow_agent_${se}_queued`,
            data: {
              type: "workflow_agent",
              index: se,
              label: de,
              phaseIndex: fe,
              phaseTitle: be,
              model: re?.model ?? L.options.mainLoopModel,
              state: "error",
              error: ke instanceof Error ? ke.message : String(ke),
              queuedAt: _e,
              promptPreview: Te,
              lastProgressAt: Date.now()
            }
          });
        }
        if (L.abortController?.signal.aborted) {
          return new Promise(() => {});
        }
        throw ke;
      }
    });
    async function j(Z, ne, oe, ee, re, se, ae, de, be, fe) {
      if (L.abortController?.signal.aborted) {
        throw Error("Workflow aborted");
      }
      k();
      let me;
      if (ae?.agentType != null) {
        let wt = String(ae.agentType);
        let vt = L.options.agentDefinitions.activeAgents;
        let yt = getToolPermissionContext(L);
        let gt = filterDeniedAgents(vt, yt, "Agent");
        let Ft = gt.find(jn => jn.agentType === wt);
        if (!Ft) {
          if (vt.some(jn => jn.agentType === wt)) {
            let jn = getDenyRuleForAgent(yt, "Agent", wt);
            throw Error(`agent({agentType}): '${wt}' is denied by permission rule '${"Agent"}(${wt})' from ${jn?.source ?? "settings"}.`);
          }
          throw Error(`agent({agentType}): agent type '${wt}' not found. Available agents: ${gt.map(jn => jn.agentType).join(", ")}`);
        }
        let on = [...(Ft.disallowedTools ?? []), ...(qLo.disallowedTools ?? [])];
        let rn = ae.schema ? k0m : x0m;
        let Sn = ae.schema && !ODo(Ft.tools) ? [...(Ft.tools ?? []), "StructuredOutput"] : Ft.tools;
        me = isBuiltInAgent(Ft) ? {
          ...Ft,
          disallowedTools: on,
          tools: Sn,
          getSystemPrompt: jn => Ft.getSystemPrompt(jn) + rn
        } : {
          ...Ft,
          disallowedTools: on,
          tools: Sn,
          getSystemPrompt: () => Ft.getSystemPrompt() + rn
        };
      }
      let Te;
      if (ae?.schema) {
        let wt = jdt(ae.schema);
        if ("error" in wt) {
          throw TypeError(`agent({schema}) received an invalid JSON Schema: ${wt.error}`);
        }
        Te = wt.tool;
      }
      let ue = me ?? (Te ? I0m : qLo);
      let ce = L2(ae?.effort);
      let le = ce !== undefined ? {
        ...ue,
        effort: ce
      } : ue;
      let pe = L.getAppState();
      let ve = getToolPermissionContext(L);
      let _e = L.options.tools.filter(bM);
      let xe = {
        ...ve,
        mode: le.permissionMode ?? "acceptEdits"
      };
      let ke = EZ(xe, excludeCoordinatorCommsMcpTools(pe.mcp.tools.concat(_e)), {
        skipReplFilter: true,
        skillTools: pe.skillTools
      });
      let Ie = Te ? [...ke.filter(wt => !bl(wt, "StructuredOutput")), Te] : ke;
      let Ue = vse(Hve(le, L.options.mainLoopModel), L.options.mainLoopModel, ae?.model, ve.mode);
      let Ge = ve.mode === "auto";
      let Be = null;
      if (ae?.isolation === "worktree") {
        let wt = r ? `${r}-${Z}` : `wf-${Z}`;
        Be = await E(wt);
      }
      let We = Be?.worktreePath;
      let Ze = Be ? `${ne}

---
You are running in an isolated git worktree at ${Be.worktreePath} (a separate working copy of the repo). Changes you make here do NOT affect the main working directory (${Nt()}) or other agents. Work normally \u2014 the worktree will be cleaned up automatically if you made no changes, or preserved for review if you did.` : ne;
      let Tt = 0;
      let kt = 0;
      let Ye = 0;
      let ht = Date.now();
      let It = VKe(ne);
      async function Rt(wt, vt, yt, gt) {
        let Ft = vN();
        de(Ft);
        let on = {
          agentId: Ft,
          parentAgentId: qY(fe) ? undefined : fe?.agentId,
          depth: PW(fe) + 1,
          parentSessionId: getParentSessionId_export(),
          agentType: "subagent",
          subagentName: le.agentType,
          isAsync: false,
          isBuiltIn: isBuiltInAgent(le)
        };
        let rn = `workflow_agent_${Z}_${Ft}`;
        let Sn;
        let jn;
        let Xr;
        let co = Ue ? getCanonicalName(Ue) : undefined;
        let Yt = (Qn, gi) => n({
          type: "progress",
          toolUseID: rn,
          data: {
            type: "workflow_agent",
            index: Z,
            label: vt,
            phaseIndex: re,
            phaseTitle: ee,
            agentId: Ft,
            agentType: me?.agentType,
            isolation: Be ? "worktree" : undefined,
            model: Ue,
            fallbackModel: Xr,
            state: Qn,
            startedAt: ht,
            queuedAt: be,
            attempt: yt,
            lastAttemptReason: gt,
            lastToolName: Sn,
            lastToolSummary: jn,
            promptPreview: It,
            lastProgressAt: Date.now(),
            ...gi
          }
        });
        let Ee = new AbortController();
        let Re = L.abortController?.signal;
        let Ce = () => Ee.abort(new DOMException("workflow-abort", "AbortError"));
        if (Re?.addEventListener("abort", Ce), Re?.aborted) {
          Ee.abort(new DOMException("workflow-abort", "AbortError"));
        }
        o?.(Ft, Ee);
        let Fe;
        let Xe = 0;
        let He = Math.min(se * 0.1, 1000);
        let Gt = () => {
          if (clearTimeout(Fe), se > 0) {
            Fe = setTimeout(Qn => Qn.abort(new DOMException("stalled", "AbortError")), se, Ee);
          }
        };
        let mt = new Set();
        let Dt = () => {
          if (mt.size === 0 && Fe === undefined) {
            Gt();
          }
        };
        let jt = () => {
          if (mt.size > 0) {
            return;
          }
          let Qn = Date.now();
          if (Qn - Xe < He) {
            return;
          }
          Xe = Qn;
          Gt();
        };
        let bn = {
          ...L,
          abortController: Ee
        };
        Yt("start", Tt || kt ? {
          tokens: Tt,
          toolCalls: kt
        } : undefined);
        Gt();
        let Ct;
        let hn = Ge ? [] : undefined;
        let vn;
        let zn = 0;
        let Pn = 0;
        let Lr = 0;
        let ao = 0;
        let Nn;
        let Tr = new Set();
        let To = Me.MAX_STRUCTURED_OUTPUT_RETRIES ?? 5;
        let wr = Date.now();
        try {
          await p8(on, async () => {
            for await (let Qn of I3({
              agentDefinition: le,
              promptMessages: [In({
                content: wt
              })],
              toolUseContext: bn,
              canUseTool: t,
              isAsync: false,
              querySource: zDe(le.agentType, isBuiltInAgent(le)),
              spawnedBySkill: L.options.spawnedBySkill ?? L.options.activeSkill,
              availableTools: Ie,
              requiresStructuredOutput: Te !== undefined,
              transcriptSubdir: r ? `workflows/${r}` : undefined,
              spawnedByWorkflowRunId: r,
              override: {
                agentId: Ft,
                agentContext: on
              },
              model: ae?.model,
              onQueryProgress: jt,
              worktreePath: We
            })) {
              if (Qn.type === "attachment" && Qn.attachment.type === "structured_output") {
                vn = Qn.attachment.data;
                continue;
              }
              if (Qn.type === "set_in_progress_tool_use_ids") {
                if (Qn.op.action === "remove") {
                  for (let gi of Qn.op.ids) {
                    mt.delete(gi);
                  }
                  Dt();
                }
                continue;
              }
              if (Qn.type === "user") {
                hn?.push(Qn);
                let gi = Qn.message.content;
                if (Array.isArray(gi)) {
                  for (let Ks of gi) {
                    if (typeof Ks === "object" && Ks?.type === "tool_result") {
                      if (mt.delete(Ks.tool_use_id), Tr.delete(Ks.tool_use_id) && Ks.is_error) {
                        ao++;
                      }
                    }
                  }
                  if (Dt(), ao > 0 && ao >= To && vn === undefined) {
                    throw new Po(`agent({schema}): StructuredOutput retry cap (${To}) exceeded \u2014 ` + `${ao} failed ${un(ao, "call")} with no valid output`, "Workflow agent({schema}) StructuredOutput retry cap exceeded");
                  }
                }
                continue;
              }
              if (Qn.type === "assistant") {
                if (Ct = Qn, hn?.push(Qn), !Qn.isApiErrorMessage) {
                  zn = doe(Qn.message.usage);
                  let Ks = Qn.message.model;
                  if (Ks && co && Ks !== Ue && getCanonicalName(Ks) !== co) {
                    Xr = Ks;
                  }
                }
                let gi = 0;
                for (let Ks of Qn.message.content) {
                  if (Ks.type !== "tool_use") {
                    continue;
                  }
                  if (gi++, mt.add(Ks.id), Sn = Ks.name, jn = otr(Ks.input) || undefined, Ks.name === "StructuredOutput") {
                    if (Lr++, Nn = Ks.input, Tr.add(Ks.id), vn !== undefined && Lr > 2) {
                      Ee.abort("stalled");
                      break;
                    }
                  }
                }
                if (Pn += gi, gi > 0) {
                  clearTimeout(Fe);
                  Fe = undefined;
                } else {
                  jt();
                }
                Yt("progress", {
                  tokens: Tt + zn,
                  toolCalls: kt + Pn
                });
              }
            }
          });
        } catch (Qn) {
          let gi = Ee.signal.aborted ? unwrapAbortReason(Ee.signal.reason) : undefined;
          if (gi === "stalled" || gi === "user-retry") {
            if (gi === "stalled" && vn !== undefined) {
              let Ks = Date.now() - wr;
              Yt("done", {
                tokens: Tt + zn,
                toolCalls: kt + Pn,
                durationMs: Ye + Ks,
                resultPreview: VKe(vn)
              });
              return {
                structured: vn,
                text: "",
                agentMessages: hn,
                tokens: zn,
                toolCalls: Pn,
                stalled: false,
                skipped: false,
                durationMs: Ks,
                stopReason: undefined,
                outputTokens: undefined,
                structuredOutputAttempts: Lr,
                lastStructuredOutputInput: Nn
              };
            }
            Yt("error", {
              error: gi === "stalled" ? `stalled \u2014 no progress for ${se}ms` : "retry requested by user",
              tokens: Tt + zn,
              toolCalls: kt + Pn,
              durationMs: Ye + (Date.now() - wr)
            });
            return {
              structured: undefined,
              text: "",
              agentMessages: hn,
              tokens: zn,
              toolCalls: Pn,
              stalled: true,
              stalledReason: gi,
              skipped: false,
              durationMs: Date.now() - wr,
              stopReason: undefined,
              outputTokens: undefined,
              structuredOutputAttempts: Lr,
              lastStructuredOutputInput: Nn
            };
          }
          if (gi === "user-skip") {
            Yt("error", {
              error: "skipped by user",
              skipped: true,
              tokens: Tt + zn,
              toolCalls: kt + Pn,
              durationMs: Ye + (Date.now() - wr)
            });
            return {
              structured: undefined,
              text: "",
              agentMessages: hn,
              tokens: zn,
              toolCalls: Pn,
              stalled: false,
              skipped: true,
              durationMs: Date.now() - wr,
              stopReason: undefined,
              outputTokens: undefined,
              structuredOutputAttempts: Lr,
              lastStructuredOutputInput: Nn
            };
          }
          throw Yt("error", {
            error: Qn instanceof Error ? Qn.message : String(Qn),
            tokens: Tt + zn,
            toolCalls: kt + Pn,
            durationMs: Ye + (Date.now() - wr)
          }), Qn;
        } finally {
          clearTimeout(Fe);
          Re?.removeEventListener("abort", Ce);
          o?.(Ft, null);
        }
        let Ut = Ct;
        let Wn = Ut ? Tl(Ut.message.content, `
`) : "";
        let Fr = Ut?.message.usage;
        let Is = Fr && typeof Fr.output_tokens === "number" ? Fr.output_tokens : undefined;
        let _r = Date.now() - wr;
        let kn = Tt + (zn || (Ut ? doe(Ut.message.usage) : 0));
        if (Ut?.isApiErrorMessage) {
          let Qn = Wn || "API error";
          Yt("error", {
            error: Qn,
            tokens: kn,
            toolCalls: kt + Pn,
            durationMs: Ye + _r
          });
          return {
            structured: vn,
            text: Wn,
            agentMessages: hn,
            apiError: Qn,
            tokens: zn,
            toolCalls: Pn,
            stalled: false,
            skipped: false,
            durationMs: _r,
            stopReason: Ut.message.stop_reason,
            outputTokens: Is,
            structuredOutputAttempts: Lr,
            lastStructuredOutputInput: Nn
          };
        }
        Yt("done", {
          tokens: kn,
          toolCalls: kt + Pn,
          durationMs: Ye + _r,
          resultPreview: VKe(Te ? vn : Wn)
        });
        return {
          structured: vn,
          text: Wn,
          agentMessages: hn,
          tokens: zn,
          toolCalls: Pn,
          stalled: false,
          skipped: false,
          durationMs: _r,
          stopReason: Ut?.message.stop_reason,
          outputTokens: Is,
          structuredOutputAttempts: Lr,
          lastStructuredOutputInput: Nn
        };
      }
      try {
        let wt = await Sye(We, () => Rt(Ze, oe, 1));
        let vt = Ft => !Ft.stalled && !Ft.skipped && Ft.stopReason == null && Ft.structured === undefined && (Ft.outputTokens ?? 1 / 0) < 50 && Ft.durationMs > se * 0.5;
        let yt = vt(wt);
        if (yt) {
          if (n({
            type: "progress",
            toolUseID: "workflow_log",
            data: {
              type: "workflow_log",
              message: `[${oe}] throttled response (no stop_reason, ${wt.outputTokens ?? "?"} output tokens in ${Math.round(wt.durationMs / 1000)}s) \u2014 ` + "sleeping 45s before retry"
            }
          }), await sleep(45000, L.abortController?.signal, {
            throwOnAbort: true
          }), Tt += wt.tokens, kt += wt.toolCalls, Ye += wt.durationMs, wt = await Sye(We, () => Rt(Ze, `${oe} (throttle-retry)`, 2, "throttled")), vt(wt)) {
            n({
              type: "progress",
              toolUseID: "workflow_log",
              data: {
                type: "workflow_log",
                message: `[${oe}] throttle-retry also degraded \u2014 ` + "giving up on throttle backoff"
              }
            });
          }
        }
        let gt = [];
        for (let Ft = 1; wt.stalled && !yt && Ft <= 5; Ft++) {
          if (L.abortController?.signal.aborted) {
            throw Error("Workflow aborted");
          }
          let on = wt.stalledReason ?? "stalled";
          gt.push(on);
          let rn = on === "user-retry" ? "retry requested by user" : "stalled (no progress)";
          let Sn = "";
          if (on === "stalled" && wt.structuredOutputAttempts > 0 && wt.structured === undefined) {
            let jn = De(wt.lastStructuredOutputInput);
            let Xr = jn.length > 300 ? jn.slice(0, 300) + "\u2026" : jn;
            Sn = ` \u2014 ${wt.structuredOutputAttempts} StructuredOutput validation ${un(wt.structuredOutputAttempts, "failure")} (last input: ${Xr})`;
          }
          n({
            type: "progress",
            toolUseID: "workflow_log",
            data: {
              type: "workflow_log",
              message: `[stall] agent "${oe}" ${rn} after ${Math.round(wt.durationMs / 1000)}s${Sn} \u2014 retrying (${Ft}/${5})`
            }
          });
          Tt += wt.tokens;
          kt += wt.toolCalls;
          Ye += wt.durationMs;
          wt = await Sye(We, () => Rt(Ze, `${oe} (retry ${Ft})`, Ft + 1, on));
        }
        if (wt.skipped) {
          return null;
        }
        if (wt.stalled) {
          gt.push(wt.stalledReason ?? "stalled");
          let Ft = gt.length;
          let on = gt.every(jn => jn === "user-retry");
          let rn = gt.every(jn => jn === "stalled");
          let Sn = wt.stalledReason !== "user-retry" && wt.structuredOutputAttempts > 0 && wt.structured === undefined ? ` \u2014 ${wt.structuredOutputAttempts} StructuredOutput validation ${un(wt.structuredOutputAttempts, "failure")} on the last attempt` : "";
          throw Error(on ? `agent abandoned: user requested retry on all ${Ft} attempts` : rn ? `agent stalled on all ${Ft} attempts (no progress for ${se}ms each)${Sn}` : `agent abandoned after ${Ft} attempts (${gt.join(" \u2192 ")})${Sn}`);
        }
        if (wt.apiError) {
          let Ft = `[${oe}] failed: ${wt.apiError}`;
          S.push(Ft);
          n({
            type: "progress",
            toolUseID: "workflow_log",
            data: {
              type: "workflow_log",
              message: Ft
            }
          });
          return null;
        }
        if (Ge && wt.agentMessages) {
          let Ft = await E7t({
            agentMessages: wt.agentMessages,
            tools: Ie,
            toolPermissionContext: ve,
            abortSignal: L.abortController.signal,
            subagentType: le.agentType,
            totalToolUseCount: kt + wt.toolCalls
          });
          if (Ft) {
            if (Te) {
              let on = `[${oe}] ${Ft}`;
              S.push(on);
              n({
                type: "progress",
                toolUseID: "workflow_log",
                data: {
                  type: "workflow_log",
                  message: on
                }
              });
            } else {
              wt.text = `${Ft}

${wt.text}`;
            }
          }
        }
        if (Te) {
          if (wt.structured === undefined) {
            throw Error("agent({schema}): subagent completed without calling StructuredOutput (after in-conversation nudge)");
          }
          return p(wt.structured);
        }
        return wt.text;
      } finally {
        if (Be) {
          let {
            worktreePath: wt,
            worktreeBranch: vt,
            headCommit: yt,
            gitRoot: gt,
            hookBased: Ft
          } = Be;
          try {
            if (!Ft && yt && !(await hasWorktreeChanges(wt, yt))) {
              await removeAgentWorktree(wt, vt, gt, false, "workflow_tool");
            } else if (gt) {
              await unlockAgentWorktree(wt, gt);
            }
          } catch {}
        }
      }
    }
    function z(Z) {
      if (Z === "bubble") {
        return;
      }
      if (Z === "bypassPermissions") {
        return "auto";
      }
      return Z;
    }
    async function V(Z, ne, oe, ee, re, se, ae) {
      let de = L.abortController?.signal;
      if (de?.aborted) {
        throw Error("Workflow aborted");
      }
      k();
      let be = vN();
      let fe = Date.now();
      let me = VKe(ne);
      let Te;
      let ue = (ve, _e) => n({
        type: "progress",
        toolUseID: `workflow_agent_${Z}_${be}`,
        data: {
          type: "workflow_agent",
          index: Z,
          label: oe,
          phaseIndex: re,
          phaseTitle: ee,
          agentId: be,
          isolation: "remote",
          remoteSessionId: Te,
          state: ve,
          startedAt: fe,
          queuedAt: ae,
          promptPreview: me,
          lastProgressAt: Date.now(),
          ..._e
        }
      });
      let ce = new AbortController();
      let le = () => ce.abort(new DOMException("workflow-abort", "AbortError"));
      if (de?.addEventListener("abort", le), de?.aborted) {
        ce.abort(new DOMException("workflow-abort", "AbortError"));
      }
      o?.(be, ce);
      ue("start");
      let pe;
      try {
        let ve = getToolPermissionContext(L);
        let _e = se.model ? vse(undefined, L.options.mainLoopModel, se.model, ve.mode) : undefined;
        let xe = await teleportToRemote({
          initialMessage: ne,
          source: "workflow_remote_agent",
          tags: ["workflow-remote-agent"],
          description: oe,
          branchName: await x(),
          permissionMode: z(ve.mode),
          model: _e,
          signal: ce.signal,
          onBundleFail: Ze => {
            pe = Ze;
          },
          onCreateFail: Ze => {
            pe = Ze;
          }
        });
        if (!xe) {
          throw Error(pe ?? "Failed to create cloud session");
        }
        Te = xe.id;
        ue("progress");
        let {
          text: ke,
          structuredOutput: Ie,
          resultSubtype: Ue,
          usage: Ge,
          modelUsage: Be,
          toolCalls: We
        } = await awaitRemoteSessionResult(Te, ce.signal);
        for (let [Ze, Tt] of Object.entries(Be ?? {})) {
          XX(Tt.costUSD, {
            ...Hb,
            input_tokens: Tt.inputTokens,
            output_tokens: Tt.outputTokens,
            cache_read_input_tokens: Tt.cacheReadInputTokens,
            cache_creation_input_tokens: Tt.cacheCreationInputTokens,
            server_tool_use: {
              web_search_requests: Tt.webSearchRequests,
              web_fetch_requests: 0
            }
          }, Ze);
        }
        if (se.schema && Ie === undefined) {
          let Ze = Ue === "error_max_structured_output_retries" ? "the cloud agent called StructuredOutput but no attempt produced a surviving valid output (failed schema validation, or retracted by a model fallback)" : Ue && Ue !== "success" ? `the cloud agent turn ended with result subtype '${Ue}'` : "the cloud agent never called the StructuredOutput tool";
          throw Error(`agent({isolation:'remote', schema}) completed without structured output: ${Ze}.`);
        }
        if (ue("done", {
          tokens: Ge ? doe(Ge) : 0,
          toolCalls: We,
          durationMs: Date.now() - fe,
          resultPreview: VKe(se.schema ? Ie : ke)
        }), se.schema) {
          return p(Ie);
        }
        return ke;
      } catch (ve) {
        if (Te) {
          archiveRemoteSession(Te).catch(() => {});
        }
        if (unwrapAbortReason(ce.signal.reason) === "user-skip") {
          ue("error", {
            error: "skipped by user",
            skipped: true,
            durationMs: Date.now() - fe
          });
          return null;
        }
        throw ue("error", {
          error: ve instanceof Error ? ve.message : String(ve),
          durationMs: Date.now() - fe
        }), ve;
      } finally {
        de?.removeEventListener("abort", le);
        o?.(be, null);
      }
    }
    let K = YLe(async Z => {
      if (L.abortController?.signal.aborted) {
        return new Promise(() => {});
      }
      if (await sleep(0), !Array.isArray(Z)) {
        throw TypeError("parallel() expects an array of functions");
      }
      let ne = zer(f(Z));
      if (ne.length === 0) {
        return p([]);
      }
      A();
      k();
      for (let se of ne) {
        if (typeof se !== "function") {
          throw TypeError("parallel() expects an array of functions, not promises. Wrap each call: () => agent(...)");
        }
      }
      let oe = await Promise.allSettled(ne.map(se => {
        try {
          return u(d(se));
        } catch (ae) {
          return Promise.reject(ae);
        }
      }));
      let ee = 0;
      let re = oe.map((se, ae) => {
        if (se.status === "fulfilled") {
          return se.value.v;
        }
        let {
          name: de,
          msg: be
        } = FYt(se.reason);
        if (de === "WorkflowBudgetExceededError") {
          ee++;
          return null;
        }
        let fe = `parallel[${ae}] failed: ${be}`;
        S.push(fe);
        n({
          type: "progress",
          toolUseID: "workflow_log",
          data: {
            type: "workflow_log",
            message: fe
          }
        });
        return null;
      });
      if (ee > 0) {
        S.push(`parallel: ${ee} ${un(ee, "slot")} dropped \u2014 token budget exceeded`);
      }
      return p(re);
    });
    let J = YLe(async (Z, ...ne) => {
      if (L.abortController?.signal.aborted) {
        return new Promise(() => {});
      }
      if (await sleep(0), !Array.isArray(Z)) {
        throw TypeError("pipeline() expects an array as the first argument");
      }
      let oe = zer(f(Z));
      let ee = zer(ne);
      if (oe.length === 0) {
        return p([]);
      }
      A();
      k();
      for (let de of ee) {
        if (typeof de !== "function") {
          throw TypeError("pipeline() stages must be functions: pipeline(items, item => ..., result => ...)");
        }
      }
      let re = await Promise.allSettled(oe.map(async (de, be) => {
        let fe = await u(de);
        for (let me of ee) {
          if (fe.v === null) {
            break;
          }
          fe = await u(d(me, fe.v, de, be));
        }
        return fe;
      }));
      let se = 0;
      let ae = re.map((de, be) => {
        if (de.status === "fulfilled") {
          return de.value.v;
        }
        let {
          name: fe,
          msg: me
        } = FYt(de.reason);
        if (fe === "WorkflowBudgetExceededError") {
          se++;
          return null;
        }
        let Te = `pipeline[${be}] failed: ${me}`;
        S.push(Te);
        n({
          type: "progress",
          toolUseID: "workflow_log",
          data: {
            type: "workflow_log",
            message: Te
          }
        });
        return null;
      });
      if (se > 0) {
        S.push(`pipeline: ${se} ${un(se, "slot")} dropped \u2014 token budget exceeded`);
      }
      return p(ae);
    });
    let Q = YLe(Z => {
      n({
        type: "progress",
        toolUseID: "workflow_log",
        data: {
          type: "workflow_log",
          message: Ger(Z)
        }
      });
    });
    return {
      agent: W,
      parallel: K,
      pipeline: J,
      log: Q,
      phase: F,
      resolvePhase: P,
      recordFailure: Z => {
        S.push(Z);
      },
      getAgentCount: () => c,
      getFailures: () => S,
      bindVMAwait: Z => {
        u = Z.settle;
        d = Z.call;
        p = Z.clone;
        m = Z.sanitize;
        f = Z.snapshot;
        h = Z.getProp;
      },
      sanitizeVMValue: Z => m(Z),
      getVMProp: (Z, ne) => h(Z, ne)
    };
  }
  var kkl;
  var Akl;
  var v0m;
  var C0m;
  var Pkl;
  var Okl;
  var R0m = `You are a subagent spawned by a workflow orchestration script. Use the tools available to complete the task.

CRITICAL: Your final text response is returned **verbatim** as a string to the calling script \u2014 it is your return value, not a message to a human.
- Output the literal result (data, JSON, text). Do NOT output confirmations like "Done." or "Sent."
- If asked for JSON, return ONLY the raw JSON \u2014 no code fences, no prose, no markdown.
- Do NOT use SendUserMessage to deliver your answer. Put your answer in your final text response.
- Be concise. The script will parse your output.`;
  var x0m = `

---

NOTE: You are running inside a workflow script. Your final text response is returned verbatim as a string to the calling script \u2014 it is your return value, not a message to a human. Output the literal result; do not output confirmations like "Done." Be concise \u2014 the script will parse your output.`;
  var k0m;
  var A0m;
  var qLo;
  var I0m;
  var Mkl = __lazy(() => {
    C$();
    $n();
    Ot();
    JLe();
    ci();
    jM();
    Kp();
    _h();
    Sl();
    Ubt();
    vo();
    je();
    Fp();
    pr();
    gn();
    dt();
    na();
    ro();
    Bbt();
    Eo();
    oy();
    lmt();
    Zn();
    qp();
    FM();
    TO();
    GL();
    swe();
    iP();
    $ve();
    jve();
    Sh();
    kS();
    Uve();
    k2();
    O1();
    GKe();
    HLo();
    jLo();
    kkl = require("os");
    Akl = require("util");
    v0m = E0m(kkl.cpus().length);
    C0m = `Workflow agent() call cap reached (${1000}). This usually means a loop using budget.remaining() never terminates because ` + "no token budget was set \u2014 remaining() returns Infinity when budget.total is null. " + "Add a hard iteration cap to the loop, or pass a token budget.";
    Pkl = class Pkl extends Error {
      constructor() {
        super(C0m);
        this.name = "WorkflowAgentCapError";
      }
    };
    Okl = class Okl extends Error {
      constructor(e, t) {
        super(`Workflow token budget exceeded (${e.toLocaleString()} / ${t.toLocaleString()} output tokens). Stopping further agent() calls. In-flight agents will complete; their results are preserved.`);
        this.name = "WorkflowBudgetExceededError";
      }
    };
    k0m = `

---

NOTE: You are running inside a workflow script. You MUST return your final answer by calling the ${"StructuredOutput"} tool exactly once \u2014 the tool's input schema defines the required shape. Do your work, then call ${"StructuredOutput"}; do NOT put your answer in a text response (the script reads ONLY the tool call). If validation fails, read the error and call ${"StructuredOutput"} again with a corrected shape.`;
    A0m = `You are a subagent spawned by a workflow orchestration script. Use the tools available to complete the task.

CRITICAL: You MUST call the ${"StructuredOutput"} tool exactly once to return your final answer. The tool's input schema defines the required shape.
- Do your work (Read files, run commands, etc.), then call ${"StructuredOutput"} with your answer.
- Do NOT put your answer in a text response. The script reads ONLY the ${"StructuredOutput"} tool call.
- If the schema validation fails, read the error and call ${"StructuredOutput"} again with a corrected shape.
- After calling ${"StructuredOutput"} successfully, end your turn. No acknowledgment needed.`;
    qLo = {
      agentType: "workflow-subagent",
      whenToUse: "Internal subagent for workflow script orchestration.",
      tools: ["*"],
      disallowedTools: ["SendUserMessage", "Agent", "Workflow"],
      source: "built-in",
      baseDir: "built-in",
      getSystemPrompt: () => R0m
    };
    I0m = {
      ...qLo,
      getSystemPrompt: () => A0m
    };
  });
  var Ukl = {};