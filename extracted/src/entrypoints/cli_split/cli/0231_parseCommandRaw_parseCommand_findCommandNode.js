  __export(Fua, {
    parseCommandRaw: () => parseCommandRaw,
    parseCommand: () => parseCommand,
    findCommandNode: () => findCommandNode,
    extractCommandArguments: () => extractCommandArguments,
    PARSE_ABORTED: () => PARSE_ABORTED
  });
  async function parseCommand(e) {
    if (!e || e.length > 1e4) {
      return null;
    }
    try {
      let t = _O().parse(e);
      if (!t) {
        return null;
      }
      let n = findCommandNode(t, null);
      let r = lhp(n);
      return {
        rootNode: t,
        envVars: r,
        commandNode: n,
        originalCommand: e
      };
    } catch {
      return null;
    }
  }
  async function parseCommandRaw(e) {
    if (!e) {
      return null;
    }
    if (e.length > 1e4) {
      logEvent("tengu_tree_sitter_parse_abort", {
        cmdLength: e.length,
        panic: false
      });
      return PARSE_ABORTED;
    }
    try {
      let t = _O().parse(e);
      if (t === null) {
        logEvent("tengu_tree_sitter_parse_abort", {
          cmdLength: e.length,
          panic: false
        });
        return PARSE_ABORTED;
      }
      return t;
    } catch {
      logEvent("tengu_tree_sitter_parse_abort", {
        cmdLength: e.length,
        panic: true
      });
      return PARSE_ABORTED;
    }
  }
  function findCommandNode(e, t) {
    let {
      type: n,
      children: r
    } = e;
    if (Jlo.vZc(n)) {
      return e;
    }
    if (n === "variable_assignment" && t) {
      return t.children.find(o => Jlo.vZc(o.type) && o.startIndex > e.startIndex) ?? null;
    }
    if (n === "pipeline") {
      for (let o of r) {
        let s = findCommandNode(o, e);
        if (s) {
          return s;
        }
      }
      return null;
    }
    if (n === "redirected_statement") {
      return r.find(o => Jlo.vZc(o.type)) ?? null;
    }
    for (let o of r) {
      let s = findCommandNode(o, e);
      if (s) {
        return s;
      }
    }
    return null;
  }
  function lhp(e) {
    if (!e || e.type !== "command") {
      return [];
    }
    let t = [];
    for (let n of e.children) {
      if (n.type === "variable_assignment") {
        t.push(n.text);
      } else if (n.type === "command_name" || n.type === "word") {
        break;
      }
    }
    return t;
  }
  function extractCommandArguments(e) {
    if (e.type === "declaration_command") {
      let r = e.children[0];
      return r && ihp.vZc(r.text) ? [r.text] : [];
    }
    let t = [];
    let n = false;
    for (let r of e.children) {
      if (r.type === "variable_assignment") {
        continue;
      }
      if (r.type === "command_name" || !n && r.type === "word") {
        n = true;
        let o = r.children[0] ?? r;
        if (o.type === "concatenation") {
          t.push(o.children.some(s => Ylo.vZc(s.type)) ? o.text : o.children.map(a2n).join(""));
        } else {
          t.push(a2n(o));
        }
        continue;
      }
      if (ahp.vZc(r.type)) {
        t.push(a2n(r));
      } else if (r.type === "concatenation") {
        if (r.children.some(o => Ylo.vZc(o.type))) {
          break;
        }
        t.push(r.children.map(a2n).join(""));
      } else if (Ylo.vZc(r.type)) {
        break;
      }
    }
    return t;
  }
  function a2n(e) {
    if (e.type === "word") {
      return e.text.replace(/\\(.)/g, "$1");
    }
    return chp(e.text);
  }
  function chp(e) {
    return e.length >= 2 && (e[0] === '"' && e.at(-1) === '"' || e[0] === "'" && e.at(-1) === "'") ? e.slice(1, -1) : e;
  }
  var ihp;
  var ahp;
  var Ylo;
  var Jlo;
  var PARSE_ABORTED;
  var VOe = __lazy(() => {
    Ot();
    iTe();
    ihp = new Set(["export", "declare", "typeset", "readonly", "local", "unset", "unsetenv"]);
    ahp = new Set(["word", "string", "raw_string", "number"]);
    Ylo = new Set(["command_substitution", "process_substitution"]);
    Jlo = new Set(["command", "declaration_command"]);
    PARSE_ABORTED = Symbol("parse-aborted");
  });
  function Up(e) {
    return e.includes("__CMDSUB_OUTPUT__") || e.includes("__TRACKED_VAR__");
  }
  function c2n(e) {
    return e.replaceAll("__CMDSUB_OUTPUT__", "$(\u2026)").replaceAll("__TRACKED_VAR__", "${\u2026}");
  }
  function zua(e) {
    return e.startsWith("__CMDSUB_OUTPUT__") || e.startsWith("__TRACKED_VAR__");
  }
  function Yua(e) {
    if (!e) {
      return -2;
    }
    if (e === "ERROR") {
      return -1;
    }
    let t = fhp.indexOf(e);
    return t >= 0 ? t + 1 : 0;
  }
  function p9e(e) {
    let t = false;
    let n = false;
    let r = false;
    let o = true;
    let s = 0;
    while (s < e.length) {
      let i = e[s];
      if (r) {
        if (i === "\\" && (e[s + 1] === "`" || e[s + 1] === "\\" || e[s + 1] === "$")) {
          s += 2;
        } else {
          if (i === "`") {
            r = false;
          }
          s++;
        }
      } else if (t) {
        if (i === "'") {
          t = false;
        }
        s++;
      } else if (n) {
        if (i === "\\" && (e[s + 1] === '"' || e[s + 1] === "\\" || e[s + 1] === "`")) {
          s += 2;
        } else if (i === "`") {
          r = true;
          s++;
        } else {
          if (i === '"') {
            n = false;
          }
          s++;
        }
      } else if (i === "\\" && s + 1 < e.length) {
        if (e[s + 1] !== `
`) {
          o = false;
        }
        s += 2;
      } else if (i === "#" && o) {
        while (s < e.length && e[s] !== `
`) {
          s++;
        }
        o = true;
      } else if (i === "`") {
        r = true;
        o = false;
        s++;
      } else {
        if (i === "*" || i === "?" || i === "[") {
          return true;
        }
        if (i === "'") {
          t = true;
        } else if (i === '"') {
          n = true;
        }
        o = i === " " || i === "\t" || i === `
` || i === ";" || i === "|" || i === "&" || i === "(" || i === ")" || i === "<" || i === ">";
        s++;
      }
    }
    return false;
  }
  function yhp(e) {
    if (!e.includes("{")) {
      return e;
    }
    let t = [];
    let n = false;
    let r = false;
    let o = false;
    let s = true;
    let i = 0;
    while (i < e.length) {
      let a = e[i];
      if (o) {
        if (a === "\\" && (e[i + 1] === "`" || e[i + 1] === "\\" || e[i + 1] === "$")) {
          t.push(a, e[i + 1]);
          i += 2;
        } else {
          if (a === "`") {
            o = false;
          }
          t.push(a === "{" ? " " : a);
          i++;
        }
      } else if (n) {
        if (a === "'") {
          n = false;
        }
        t.push(a === "{" ? " " : a);
        i++;
      } else if (r) {
        if (a === "\\" && (e[i + 1] === '"' || e[i + 1] === "\\" || e[i + 1] === "`")) {
          t.push(a, e[i + 1]);
          i += 2;
        } else if (a === "`") {
          o = true;
          t.push(a);
          i++;
        } else {
          if (a === '"') {
            r = false;
          }
          t.push(a === "{" ? " " : a);
          i++;
        }
      } else if (a === "\\" && i + 1 < e.length) {
        if (t.push(a, e[i + 1]), e[i + 1] !== `
`) {
          s = false;
        }
        i += 2;
      } else if (a === "#" && s) {
        while (i < e.length && e[i] !== `
`) {
          t.push(e[i]);
          i++;
        }
        s = true;
      } else if (a === "`") {
        o = true;
        s = false;
        t.push(a);
        i++;
      } else {
        if (a === "'") {
          n = true;
        } else if (a === '"') {
          r = true;
        }
        s = a === " " || a === "\t" || a === `
` || a === ";" || a === "|" || a === "&" || a === "(" || a === ")" || a === "<" || a === ">";
        t.push(a);
        i++;
      }
    }
    return t.join("");
  }
  async function wdt(e) {
    if (e === "") {
      return {
        kind: "simple",
        commands: [],
        bareAssignmentNames: []
      };
    }
    let t = await parseCommandRaw(e);
    return t === null ? {
      kind: "simple",
      commands: [],
      bareAssignmentNames: []
    } : f9e(e, t);
  }
  function f9e(e, t) {
    if (pco.test(e)) {
      return {
        kind: "too-complex",
        reason: "Contains lone surrogate",
        differential: true
      };
    }
    if (dco.test(e)) {
      return {
        kind: "too-complex",
        reason: "Contains control characters",
        differential: true
      };
    }
    if (hhp.test(e)) {
      return {
        kind: "too-complex",
        reason: "Contains Unicode whitespace",
        differential: true
      };
    }
    if (mco.test(e)) {
      return {
        kind: "too-complex",
        reason: "Contains backslash-escaped whitespace",
        differential: true
      };
    }
    if (p2n.test(e)) {
      return {
        kind: "too-complex",
        reason: "Contains zsh ~[ dynamic directory syntax",
        differential: true
      };
    }
    if (m2n.test(e)) {
      return {
        kind: "too-complex",
        reason: "Contains zsh =cmd equals expansion",
        differential: true
      };
    }
    if (gco.test(e)) {
      return {
        kind: "too-complex",
        reason: "Contains zsh <N-M> numeric-range glob",
        differential: true
      };
    }
    if (ghp.test(yhp(e))) {
      return {
        kind: "too-complex",
        reason: "Contains brace with quote character (expansion obfuscation)",
        differential: true
      };
    }
    if (e.trim() === "") {
      return {
        kind: "simple",
        commands: [],
        bareAssignmentNames: []
      };
    }
    if (t === PARSE_ABORTED) {
      return {
        kind: "too-complex",
        reason: "Parser aborted (timeout, resource limit, or over-length)",
        nodeType: "PARSE_ABORT"
      };
    }
    let r = Buffer.from(e, "utf8");
    let o = c => c === 32 || c === 9 || c === 10 || c === 13 || c === 59 || c === 38;
    let s = (c, u) => {
      let d = c;
      while (d < u) {
        let p = r[d];
        if (o(p)) {
          d++;
        } else if (p === 92 && (r[d + 1] === 10 || r[d + 1] === 13 && r[d + 2] === 10)) {
          d += r[d + 1] === 13 ? 3 : 2;
        } else {
          break;
        }
      }
      return d;
    };
    let i = t.children.filter(c => c !== null).map(c => [c.startIndex, c.endIndex]).sort((c, u) => c[0] - u[0]);
    let a = 0;
    for (let [c, u] of i) {
      if (s(a, c) < c) {
        return {
          kind: "too-complex",
          reason: "Parser skipped input between top-level statements"
        };
      }
      if (u > a) {
        a = u;
      }
    }
    if (s(a, r.length) < r.length) {
      return {
        kind: "too-complex",
        reason: "Parser did not consume trailing input"
      };
    }
    let l = _hp(t);
    if (l.kind === "too-complex" && l.nodeType !== "ERROR" && Jua(t)) {
      return {
        ...l,
        nodeType: "ERROR"
      };
    }
    return l;
  }
  function Jua(e) {
    if (e.type === "ERROR" && e.text.startsWith("${")) {
      return true;
    }
    for (let t of e.children) {
      if (t && Jua(t)) {
        return true;
      }
    }
    return false;
  }
  function _hp(e) {
    let t = [];
    let n = new Map();
    let r = [];
    let o = AG(e, t, n, r);
    if (o) {
      return o;
    }
    return {
      kind: "simple",
      commands: t,
      bareAssignmentNames: r
    };
  }
  function AG(e, t, n, r) {
    if (e.type === "command") {
      let o = Ehp(e, [], t, n, r);
      if (o.kind !== "simple") {
        return o;
      }
      t.push(...o.commands);
      return null;
    }
    if (e.type === "redirected_statement") {
      return bhp(e, t, n, r);
    }
    if (e.type === "comment") {
      return null;
    }
    if (Vua.vZc(e.type)) {
      let o = e.type === "pipeline";
      let s = false;
      if (!o) {
        for (let c of e.children) {
          if (c && (c.type === "||" || c.type === "&")) {
            s = true;
            break;
          }
        }
      }
      let i = s ? new Map(n) : null;
      let a = o ? new Map(n) : n;
      let l = null;
      for (let c of e.children) {
        if (!c) {
          continue;
        }
        if (Zlo.vZc(c.type)) {
          if (c.type === "||" || c.type === "|" || c.type === "|&" || c.type === "&") {
            if (c.type === "||") {
              l ??= new Set();
              for (let p of n.keys()) {
                l.add(p);
              }
              let d = i ?? n;
              a = new Map(d);
              for (let [p, m] of n) {
                if (d.get(p) !== m) {
                  a.set(p, "__TRACKED_VAR__");
                }
              }
              for (let p of d.keys()) {
                if (!n.vZc(p)) {
                  a.set(p, "__TRACKED_VAR__");
                }
              }
            } else {
              a = new Map(i ?? n);
            }
          } else if (l !== null) {
            for (let d of l) {
              n.set(d, "__TRACKED_VAR__");
            }
            l = null;
            a = n;
          }
          continue;
        }
        let u = AG(c, t, a, r);
        if (u) {
          return u;
        }
      }
      if (l !== null) {
        for (let c of l) {
          n.set(c, "__TRACKED_VAR__");
        }
      }
      if (o) {
        S3t(n, a);
      }
      return null;
    }
    if (e.type === "negated_command") {
      let o = t.length;
      for (let s of e.children) {
        if (!s) {
          continue;
        }
        if (s.type === "!") {
          continue;
        }
        let i = AG(s, t, n, r);
        if (i) {
          return i;
        }
      }
      if (t.length === o) {
        t.push({
          argv: ["true"],
          envVars: [],
          redirects: [],
          text: e.text,
          hasUnquotedGlob: p9e(e.text)
        });
      }
      return null;
    }
    if (e.type === "declaration_command") {
      let o = t.length;
      let s = new Map(n);
      let i = [];
      for (let a of e.children) {
        if (!a) {
          continue;
        }
        switch (a.type) {
          case "export":
          case "local":
          case "readonly":
          case "declare":
          case "typeset":
            i.push(a.text);
            break;
          case "word":
          case "number":
          case "raw_string":
          case "string":
          case "concatenation":
            {
              let l = dde(a, t, s, r);
              if (typeof l !== "string") {
                return l;
              }
              if (/^[+-].*m/.test(l)) {
                return {
                  kind: "too-complex",
                  reason: `${i[0]} flag ${l} \u2014 zsh -m/+m pattern-assigns every matching variable; cannot statically model target set`,
                  nodeType: "declaration_command"
                };
              }
              if ((i[0] === "declare" || i[0] === "typeset" || i[0] === "local") && /^[+-].*[niaAEF]/.test(l)) {
                return {
                  kind: "too-complex",
                  reason: `declare flag ${l} changes assignment semantics (nameref/integer/float/array)`,
                  nodeType: "declaration_command"
                };
              }
              if ((i[0] === "export" || i[0] === "readonly") && /^[+-].*[iEF]/.test(l)) {
                return {
                  kind: "too-complex",
                  reason: `${i[0]} flag ${l} \u2014 zsh bin_typeset accepts -i/-E/-F and arithmetically evaluates the RHS`,
                  nodeType: "declaration_command"
                };
              }
              if (/^[+-].*T/.test(l)) {
                return {
                  kind: "too-complex",
                  reason: `${i[0]} -T creates a user-defined zsh tied pair \u2014 tracked literals for its operands are unreliable`,
                  nodeType: "declaration_command"
                };
              }
              if ((i[0] === "declare" || i[0] === "typeset" || i[0] === "local" || i[0] === "export") && l[0] !== "-" && /^[^=]*\[/.test(l)) {
                return {
                  kind: "too-complex",
                  reason: `${i[0]} positional '${l}' contains array subscript \u2014 zsh/bash evaluate $(cmd) in subscripts`,
                  nodeType: "declaration_command"
                };
              }
              if (l[0] !== "-") {
                let c = l.indexOf("=");
                if (c > 0) {
                  let u = l.slice(0, c);
                  if (/^[A-Za-z_][A-Za-z0-9_]*\+?$/.test(u)) {
                    let d = u.endsWith("+");
                    let p = d ? u.slice(0, -1) : u;
                    Qlo(n, {
                      name: p,
                      value: l.slice(c + 1),
                      isAppend: d
                    }, o > 0);
                    r.push(p);
                  }
                }
              }
              i.push(l);
              break;
            }
          case "variable_assignment":
            {
              let l = aco(a, t, s, r);
              if ("kind" in l) {
                return l;
              }
              Qlo(n, l, o > 0);
              r.push(l.name);
              i.push(`${l.name}=${l.value}`);
              break;
            }
          case "variable_name":
            {
              let l = a.text;
              if ((i[0] === "declare" || i[0] === "typeset" || i[0] === "local" || i[0] === "export") && l[0] !== "-" && /^[^=]*\[/.test(l)) {
                return {
                  kind: "too-complex",
                  reason: `${i[0]} positional '${l}' contains array subscript \u2014 backslash-escaped form de-escapes to [$(cmd)] at runtime`,
                  nodeType: "declaration_command"
                };
              }
              i.push(l);
              break;
            }
          default:
            return ey(a);
        }
      }
      t.push({
        argv: i,
        envVars: [],
        redirects: [],
        text: e.text,
        hasUnquotedGlob: p9e(e.text)
      });
      return null;
    }
    if (e.type === "variable_assignment") {
      let o = t.length;
      let s = aco(e, t, n, r);
      if ("kind" in s) {
        return s;
      }
      if (cco(s.name)) {
        return {
          kind: "too-complex",
          reason: `${s.name} assignment alters command lookup/execution for subsequent commands`,
          nodeType: "variable_assignment"
        };
      }
      if (ada(s.name, s.value)) {
        return {
          kind: "too-complex",
          reason: `${s.name} has integer attribute \u2014 assignment arith-evals RHS, executing subscript command substitution`,
          nodeType: "variable_assignment"
        };
      }
      Qlo(n, s, o > 0);
      r.push(s.name);
      return null;
    }
    if (e.type === "for_statement") {
      if (isScrubEnabled()) {
        return ey(e);
      }
      let o = null;
      let s = null;
      for (let l of e.children) {
        if (!l) {
          continue;
        }
        if (l.type === "variable_name") {
          o = l.text;
        } else if (l.type === "do_group") {
          s = l;
        } else if (l.type === "select") {
          return {
            kind: "too-complex",
            reason: "select statement reads stdin into $REPLY; cannot statically model",
            nodeType: "for_statement"
          };
        } else if (l.type === "for" || l.type === "in" || l.type === ";") {
          continue;
        } else if (l.type === "command_substitution") {
          let c = yco(l, t, n, r);
          if (c) {
            return c;
          }
        } else {
          let c = dde(l, t, n, r);
          if (typeof c !== "string") {
            return c;
          }
        }
      }
      if (o === null || s === null) {
        return ey(e);
      }
      if (o === "PS4" || o === "IFS" || cco(o) || wco.vZc(o) || eco.vZc(o) || tda.vZc(o)) {
        return {
          kind: "too-complex",
          reason: `${o} as loop variable bypasses assignment validation`,
          nodeType: "for_statement"
        };
      }
      let i = n.get(o);
      if (i !== undefined && !Up(i)) {
        return {
          kind: "too-complex",
          reason: `for-loop variable '${o}' would overwrite tracked literal ${JSON.stringify(i.slice(0, 40))}; post-loop value cannot be statically determined`,
          nodeType: "for_statement"
        };
      }
      n.delete(o);
      r.push(o);
      let a = new Map(n);
      Xlo(a, s);
      a.delete(o);
      for (let l of s.children) {
        if (!l) {
          continue;
        }
        if (l.type === "do" || l.type === "done" || l.type === ";") {
          continue;
        }
        let c = AG(l, t, a, r);
        if (c) {
          return c;
        }
      }
      S3t(n, a);
      return null;
    }
    if (e.type === "if_statement" || e.type === "while_statement") {
      if (e.type === "while_statement" && isScrubEnabled()) {
        return ey(e);
      }
      let o = null;
      let s = null;
      if (e.type === "while_statement") {
        o = new Set(n.keys());
        s = new Map(n);
        Xlo(n, e);
      }
      let i = false;
      for (let a of e.children) {
        if (!a) {
          continue;
        }
        if (a.type === "if" || a.type === "fi" || a.type === "else" || a.type === "elif" || a.type === "while" || a.type === "until" || a.type === ";") {
          continue;
        }
        if (a.type === "then") {
          i = true;
          continue;
        }
        if (a.type === "do_group") {
          let d = new Map(n);
          Xlo(d, a);
          for (let p of a.children) {
            if (!p) {
              continue;
            }
            if (p.type === "do" || p.type === "done" || p.type === ";") {
              continue;
            }
            let m = AG(p, t, d, r);
            if (m) {
              return m;
            }
          }
          S3t(n, d);
          continue;
        }
        if (a.type === "elif_clause" || a.type === "else_clause") {
          let d = new Map(n);
          for (let p of a.children) {
            if (!p) {
              continue;
            }
            if (p.type === "elif" || p.type === "else" || p.type === "then" || p.type === ";") {
              continue;
            }
            let m = AG(p, t, d, r);
            if (m) {
              return m;
            }
          }
          S3t(n, d);
          continue;
        }
        let l = new Map(n);
        let c = t.length;
        let u = AG(a, t, l, r);
        if (u) {
          return u;
        }
        if (!i) {
          for (let [d, p] of l) {
            let m = (s ?? n).get(d);
            if (m !== undefined && !Up(m) && p !== m) {
              return {
                kind: "too-complex",
                reason: `'${d}' was tracked as literal '${m}' but condition may modify it (||/pipeline/unset/&&-short-circuit) \u2014 cannot prove downstream value`,
                nodeType: e.type
              };
            }
            n.set(d, p);
          }
          for (let d of n.keys()) {
            if (!l.vZc(d)) {
              let p = (s ?? n).get(d);
              if (p !== undefined && !Up(p)) {
                return {
                  kind: "too-complex",
                  reason: `'${d}' was tracked as literal '${p}' but condition may unset it (&&-short-circuit) \u2014 cannot prove downstream value`,
                  nodeType: e.type
                };
              }
              n.set(d, "__TRACKED_VAR__");
            }
          }
          for (let d = c; d < t.length; d++) {
            let p = t[d];
            if (p?.argv[0] === "read") {
              for (let f of p.argv.slice(1)) {
                if (!f.startsWith("-") && /^[A-Za-z_][A-Za-z0-9_]*$/.test(f)) {
                  let h = n.get(f);
                  if (h !== undefined && !Up(h)) {
                    return {
                      kind: "too-complex",
                      reason: `'read ${f}' in condition may not execute (||/pipeline/subshell); cannot prove it overwrites tracked literal '${h}'`,
                      nodeType: e.type
                    };
                  }
                  n.set(f, "__TRACKED_VAR__");
                }
              }
              let m = n.get("REPLY");
              if (m !== undefined && !Up(m)) {
                return {
                  kind: "too-complex",
                  reason: `'read' in condition may write stdin to REPLY; cannot prove it overwrites tracked literal '${m}'`,
                  nodeType: e.type
                };
              }
              n.set("REPLY", "__TRACKED_VAR__");
            }
          }
        } else {
          S3t(n, l);
        }
      }
      if (o !== null) {
        for (let a of [...n.keys()]) {
          if (!o.vZc(a)) {
            n.delete(a);
          }
        }
      }
      return null;
    }
    if (e.type === "subshell") {
      let o = new Map(n);
      for (let s of e.children) {
        if (!s) {
          continue;
        }
        if (s.type === "(" || s.type === ")") {
          continue;
        }
        let i = AG(s, t, o, r);
        if (i) {
          return i;
        }
      }
      return null;
    }
    if (e.type === "test_command") {
      let o = ["[["];
      for (let s of e.children) {
        if (!s) {
          continue;
        }
        if (s.type === "[[" || s.type === "]]" || s.type === "[" || s.type === "]") {
          if (s.text === "") {
            return {
              kind: "too-complex",
              reason: "test_command early-close (quote in operator position)",
              differential: true
            };
          }
          continue;
        }
        let i = Xua(s, o, t, n, r);
        if (i) {
          return i;
        }
      }
      t.push({
        argv: o,
        envVars: [],
        redirects: [],
        text: e.text,
        hasUnquotedGlob: p9e(e.text)
      });
      return null;
    }
    if (e.type === "unset_command") {
      let o = [];
      let s = false;
      let i = false;
      for (let a of e.children) {
        if (!a) {
          continue;
        }
        switch (a.type) {
          case "unset":
            o.push(a.text);
            break;
          case "variable_name":
            if (!/^[A-Za-z_][A-Za-z0-9_]*$/.test(a.text)) {
              return ey(a);
            }
            if (o.push(a.text), i = true, s) {
              break;
            }
            if (zOe(a.text)) {
              return {
                kind: "too-complex",
                reason: `'unset' targets shell variable ${a.text} (exec-influencing / integer-attr / IFS / PS4)`,
                nodeType: "unset_command"
              };
            }
            n.set(a.text, "");
            break;
          case "word":
            {
              let l = dde(a, t, n, r);
              if (typeof l !== "string") {
                return l;
              }
              if (l.startsWith("-")) {
                if (i) {
                  return ey(a);
                }
                if (l !== "-f" && l !== "-v") {
                  return ey(a);
                }
                if (l === "-f") {
                  s = true;
                }
                o.push(l);
                break;
              }
              if (!/^[A-Za-z_][A-Za-z0-9_]*$/.test(l)) {
                return ey(a);
              }
              if (o.push(l), i = true, s) {
                break;
              }
              if (zOe(l)) {
                return {
                  kind: "too-complex",
                  reason: `'unset' targets shell variable ${l} (exec-influencing / integer-attr / IFS / PS4)`,
                  nodeType: "unset_command"
                };
              }
              n.set(l, "");
              break;
            }
          default:
            return ey(a);
        }
      }
      t.push({
        argv: o,
        envVars: [],
        redirects: [],
        text: e.text,
        hasUnquotedGlob: p9e(e.text)
      });
      return null;
    }
    return ey(e);
  }
  function Xua(e, t, n, r, o) {
    switch (e.type) {
      case "unary_expression":
      case "binary_expression":
      case "negated_expression":
      case "parenthesized_expression":
        {
          for (let s of e.children) {
            if (!s) {
              continue;
            }
            let i = Xua(s, t, n, r, o);
            if (i) {
              return i;
            }
          }
          return null;
        }
      case "test_operator":
      case "!":
      case "(":
      case ")":
      case "&&":
      case "||":
      case "==":
      case "=":
      case "!=":
      case "<":
      case ">":
      case "=~":
        t.push(e.text);
        return null;
      case "regex":
      case "extglob_pattern":
        if (/\$[({[\w#?!*@$'"+~^=-]|`|[<>]\(/.test(e.text)) {
          return {
            kind: "too-complex",
            reason: `[[ ]] ${e.type} contains expansion / command / process substitution`,
            nodeType: e.type,
            differential: true
          };
        }
        if (e.type === "regex") {
          let s = e.text;
          let i = 0;
          let a = 0;
          while (a < s.length) {
            let l = s[a];
            if (l === "\\" && a + 1 < s.length) {
              a += 2;
              continue;
            }
            if (l === '"' || l === "'") {
              let c = l;
              a++;
              while (a < s.length && s[a] !== c) {
                if (c === '"' && s[a] === "\\" && a + 1 < s.length) {
                  a++;
                }
                a++;
              }
              if (a < s.length) {
                a++;
              }
              continue;
            }
            if (l === "(") {
              i++;
            } else if (l === ")") {
              i--;
            }
            a++;
          }
          if (i !== 0) {
            return {
              kind: "too-complex",
              reason: "[[ ]] regex has unbalanced parentheses (parser desync)",
              nodeType: e.type,
              differential: true
            };
          }
        }
        t.push(e.text);
        return null;
      default:
        {
          let s = dde(e, n, r, o);
          if (typeof s !== "string") {
            return s;
          }
          if (/]].*[;\n&|<>]/s.test(s)) {
            return {
              kind: "too-complex",
              reason: "[[ ]] quoted operand contains `]]` + command separator \u2014 possible parser quote-state desync",
              nodeType: e.type
            };
          }
          t.push(s);
          return null;
        }
    }
  }
  function bhp(e, t, n, r) {
    let o = [];
    let s = null;
    let i = [];
    let a = [];
    for (let u of e.children) {
      if (!u) {
        continue;
      }
      if (u.type === "file_redirect") {
        i.push(u);
      } else if (u.type === "heredoc_redirect") {
        a.push(u);
      } else if (u.type === "command" || u.type === "pipeline" || u.type === "list" || u.type === "negated_command" || u.type === "declaration_command" || u.type === "unset_command") {
        s = u;
      } else {
        return ey(u);
      }
    }
    if (!s) {
      for (let u of i) {
        let d = oco(u, t, n, r);
        if ("kind" in d) {
          return d;
        }
        o.push(d);
      }
      for (let u of a) {
        let d = sco(u);
        if (d) {
          return d;
        }
      }
      t.push({
        argv: [],
        envVars: [],
        redirects: o,
        text: e.text,
        hasUnquotedGlob: p9e(e.text)
      });
      return null;
    }
    let l = t.length;
    let c;
    if (s.type === "list") {
      let u = s.children;
      if (u.length === 3 && u[0] && u[1]?.type === "&&" && u[2]) {
        let d = AG(u[0], t, n, r);
        if (d) {
          return d;
        }
        c = new Map(n);
        let p = AG(u[2], t, n, r);
        if (p) {
          return p;
        }
      } else {
        let d = AG(s, t, n, r);
        if (d) {
          return d;
        }
        c = n;
      }
    } else if (Vua.vZc(s.type)) {
      let u = AG(s, t, n, r);
      if (u) {
        return u;
      }
      c = n;
    } else {
      c = new Map(n);
      let u = AG(s, t, n, r);
      if (u) {
        return u;
      }
    }
    for (let u of i) {
      let d = oco(u, t, c, r);
      if ("kind" in d) {
        return d;
      }
      o.push(d);
    }
    for (let u of a) {
      let d = sco(u);
      if (d) {
        return d;
      }
    }
    if (o.length > 0) {
      if (t.length > l) {
        let u = t.at(-1);
        if (u) {
          u.redirects.push(...o);
        }
      } else {
        t.push({
          argv: [],
          envVars: [],
          redirects: o,
          text: e.text,
          hasUnquotedGlob: p9e(e.text)
        });
      }
    }
    return null;
  }
  function oco(e, t, n, r) {
    let o = null;
    let s = null;
    let i;
    {
      let a = e.startIndex;
      for (let l of e.children) {
        if (!l) {
          continue;
        }
        if (l.startIndex > a) {
          let c = Buffer.from(e.text, "utf8").subarray(a - e.startIndex, l.startIndex - e.startIndex).toString("utf8");
          if (!/^(?:[ \t]|\\\n)*$/.test(c)) {
            return {
              kind: "too-complex",
              reason: "Redirect has unparsed bytes between children \u2014 parser dropped content that shell will see",
              nodeType: e.type
            };
          }
        }
        a = l.endIndex;
      }
      if (a < e.endIndex) {
        let l = Buffer.from(e.text, "utf8").subarray(a - e.startIndex).toString("utf8");
        if (!/^(?:[ \t]|\\\n)*$/.test(l)) {
          return {
            kind: "too-complex",
            reason: "Redirect has unparsed trailing bytes \u2014 parser dropped content that shell will see",
            nodeType: e.type
          };
        }
      }
    }
    for (let a of e.children) {
      if (!a) {
        continue;
      }
      if (a.type === "file_descriptor") {
        i = Number(a.text);
      } else if (a.type === "variable_name") {
        return {
          kind: "too-complex",
          reason: `Redirect uses {${a.text}} fd-variable assignment \u2014 modifies shell variable as side effect`,
          nodeType: e.type
        };
      } else if (a.type in Bua) {
        o = Bua[a.type] ?? null;
      } else if (s !== null) {
        return {
          kind: "too-complex",
          reason: "Redirect has multiple targets \u2014 post-redirect args swallowed",
          nodeType: e.type
        };
      } else if (a.type === "word" || a.type === "number") {
        if (a.children.length > 0) {
          return ey(a);
        }
        if (tco.test(a.text)) {
          return ey(a);
        }
        if (nco.test(a.text)) {
          return ey(a);
        }
        if (rco.test(a.text)) {
          return ey(a);
        }
        if (/(?:^|[^\\])(?:\\\\)*[`$]/.test(a.text)) {
          return ey(a);
        }
        s = a.text.replace(/\\([\s\S])/g, (l, c) => c === `
` ? "" : c);
      } else if (a.type === "raw_string") {
        s = nda(a.text);
      } else if (a.type === "string") {
        let l = eda(a, t, n, r);
        if (typeof l !== "string") {
          return l;
        }
        s = l;
      } else if (a.type === "concatenation") {
        let l = dde(a, t, n, r);
        if (typeof l !== "string") {
          return l;
        }
        if (/(?:^|[^\\])(?:\\\\)*[`$]/.test(a.text)) {
          return {
            kind: "too-complex",
            reason: "Redirect target concatenation contains $/` \u2014 unanalyzable gap or substitution",
            nodeType: "concatenation"
          };
        }
        s = l;
      } else {
        return ey(a);
      }
    }
    if (!o || s === null) {
      return {
        kind: "too-complex",
        reason: "Unrecognized redirect shape",
        nodeType: e.type
      };
    }
    if (Up(s)) {
      return {
        kind: "too-complex",
        reason: "Redirect target contains $(cmd) output \u2014 path is runtime-determined",
        nodeType: e.type
      };
    }
    if (s.includes(`
`)) {
      return {
        kind: "too-complex",
        reason: "Redirect target contains newline \u2014 potential path traversal",
        nodeType: e.type
      };
    }
    if (s.startsWith("!")) {
      return {
        kind: "too-complex",
        reason: "Redirect target starts with ! \u2014 zsh clobber or history expansion",
        nodeType: e.type
      };
    }
    if (s.startsWith("=")) {
      return {
        kind: "too-complex",
        reason: "Redirect target starts with = \u2014 zsh expands to PATH binary",
        nodeType: e.type
      };
    }
    if (o === ">&" && !/^[A-Za-z0-9./_-]+$/.test(s)) {
      return {
        kind: "too-complex",
        reason: "bash `>&` applies a second word-expansion pass to its target \u2014 path cannot be statically validated",
        nodeType: e.type
      };
    }
    return {
      op: o,
      target: s,
      fd: i
    };
  }
  function sco(e) {
    let t = null;
    let n = null;
    let r = false;
    for (let s of e.children) {
      if (!s) {
        continue;
      }
      if (s.type === "heredoc_start") {
        t = s.text;
      } else if (s.type === "heredoc_body") {
        n = s;
      } else if (s.type === "<<-") {
        r = true;
      } else if (s.type === "<<" || s.type === "heredoc_end" || s.type === "file_descriptor") {
        ;
      } else {
        return ey(s);
      }
    }
    if (n === null) {
      return {
        kind: "too-complex",
        reason: "Heredoc body was not scanned by the parser",
        nodeType: "heredoc_redirect"
      };
    }
    if (!(t !== null && (t.startsWith("'") && t.endsWith("'") || t.startsWith('"') && t.endsWith('"') || t.startsWith("\\")))) {
      return {
        kind: "too-complex",
        reason: "Heredoc with unquoted delimiter undergoes shell expansion",
        nodeType: "heredoc_redirect",
        differential: true
      };
    }
    if (t !== null && (t.startsWith("'") || t.startsWith('"')) && t.slice(1, -1).includes("\\")) {
      return {
        kind: "too-complex",
        reason: "Quoted heredoc delimiter contains backslash",
        nodeType: "heredoc_redirect"
      };
    }
    if (n) {
      for (let s of n.children) {
        if (!s) {
          continue;
        }
        if (s.type !== "heredoc_content") {
          return ey(s);
        }
      }
    }
    if (t !== null && n !== null) {
      let s = t.startsWith("\\") ? t.slice(1) : t.slice(1, -1);
      if (s.length > 0) {
        if (r && s.startsWith("\t")) {
          return {
            kind: "too-complex",
            reason: "Heredoc uses <<- with a tab-prefixed delimiter",
            nodeType: "heredoc_redirect"
          };
        }
        for (let i of n.text.split(`
`)) {
          let a = r ? i.replace(/^\t+/, "") : i;
          if (!a.startsWith(s)) {
            continue;
          }
          let l = a.slice(s.length);
          if (/[)`}]/.test(l)) {
            return {
              kind: "too-complex",
              reason: "Heredoc body line starts with the delimiter and contains a shell metacharacter bash may treat as a terminator",
              nodeType: "heredoc_redirect"
            };
          }
        }
      }
    }
    return null;
  }
  function Shp(e, t, n, r) {
    for (let o of e.children) {
      if (!o) {
        continue;
      }
      if (o.type === "<<<") {
        continue;
      }
      let s = dde(o, t, n, r);
      if (typeof s !== "string") {
        return s;
      }
      if (u2n.test(s)) {
        return ey(o);
      }
    }
    return null;
  }
  function Thp(e, t, n, r) {
    let o = [];
    let s = [];
    let i = (u, d = true) => {
      let p = u.match(/^[A-Za-z_][A-Za-z0-9_]*/);
      if (p) {
        if (o.push(p[0]), d) {
          s.push(p[0]);
        }
      }
    };
    let a = e;
    let l = false;
    for (;;) {
      let u = a[0];
      if (u === undefined) {
        break;
      }
      if (ico.vZc(u)) {
        let d = 1;
        while (d < a.length && /^-[-pvV]*$/.test(a[d])) {
          if (/[vV]/.test(a[d])) {
            l = true;
          }
          d++;
        }
        a = a.slice(d);
      } else if (u === "!") {
        a = a.slice(1);
      } else if (/^[A-Za-z_]\w*(\[[^\]]*\])?\+?=/.test(u)) {
        i(u);
        a = a.slice(1);
      } else {
        break;
      }
    }
    let c = a[0];
    if (c === undefined) {
      for (let u of t) {
        i(u.name);
      }
    } else if (Qua.vZc(c)) {
      let u = false;
      for (let d = 1; d < a.length; d++) {
        let p = a[d];
        if (!u && p === "--") {
          u = true;
          continue;
        }
        if (!u && /^[+-].*m/.test(p)) {
          return {
            kind: "too-complex",
            reason: `'${c} ${p}' (wrapped form) \u2014 zsh -m/+m pattern-assigns every matching variable; cannot statically model target set`,
            nodeType: "command"
          };
        }
        if (!u && p.startsWith("-")) {
          continue;
        }
        if (p.includes("=")) {
          i(p);
        }
      }
    } else if (c === "read") {
      let u = 1;
      let d = false;
      let p = false;
      while (u < a.length) {
        let m = a[u];
        if (!d && m === "--") {
          d = true;
          u++;
          continue;
        }
        if (!d && m.startsWith("-")) {
          if (vdt.vZc(m)) {
            u += 2;
            continue;
          }
          let f = false;
          for (let h = 1; h < m.length; h++) {
            let g = m[h];
            if (g === "a" || g === "A") {
              let y = h < m.length - 1 ? m.slice(h + 1) : a[u + 1];
              if (y) {
                i(y);
                p = true;
              }
              f = h === m.length - 1;
              break;
            }
            if (vdt.vZc("-" + g)) {
              f = h === m.length - 1;
              break;
            }
          }
          u += f ? 2 : 1;
          continue;
        }
        i(m);
        p = true;
        u++;
      }
      if (!p) {
        o.push("REPLY");
      }
    } else if (c === "printf") {
      for (let u = 1; u < a.length; u++) {
        let d = a[u];
        if (d === "--" || !d.startsWith("-")) {
          break;
        }
        if (d === "-v") {
          if (a[u + 1]) {
            i(a[u + 1]);
          }
          u++;
          continue;
        }
        if (d.startsWith("-v")) {
          i(d.slice(2));
        }
      }
    } else if (c === "getopts") {
      let u = a[1] === "--" ? 1 : 0;
      if (a[2 + u]) {
        i(a[2 + u]);
      }
      o.push("OPTARG");
      n.set("OPTIND", "__TRACKED_VAR__");
    } else if (c === "wait") {
      for (let u = 1; u < a.length; u++) {
        let d = a[u];
        if (d === "--" || !d.startsWith("-")) {
          break;
        }
        for (let p = 1; p < d.length; p++) {
          if (d[p] === "p") {
            if (p < d.length - 1) {
              i(d.slice(p + 1));
            } else if (a[u + 1]) {
              i(a[u + 1]);
              u++;
            }
            break;
          }
        }
      }
    } else if (c === "unset" || c === "unsetenv") {
      let u = false;
      let d = false;
      for (let p = 1; p < a.length; p++) {
        let m = a[p];
        if (m.startsWith("-")) {
          if (d) {
            return {
              kind: "too-complex",
              reason: `'unset \u2026 ${m}' (wrapped form) \u2014 flag after name; getopt stops at first non-option`,
              nodeType: "command"
            };
          }
          if (m !== "-f" && m !== "-v") {
            return {
              kind: "too-complex",
              reason: `'unset ${m}' (wrapped form) \u2014 flag other than -f/-v (zsh -m pattern-unset, bash -n nameref) cannot be statically modelled`,
              nodeType: "command"
            };
          }
          if (m === "-f") {
            u = true;
          }
          continue;
        }
        if (d = true, !/^[A-Za-z_][A-Za-z0-9_]*$/.test(m)) {
          return {
            kind: "too-complex",
            reason: `'unset ${m}' (wrapped form) \u2014 non-identifier operand may pathname-expand; cannot statically know which var is unset`,
            nodeType: "command"
          };
        }
        if (u) {
          continue;
        }
        if (zOe(m)) {
          return {
            kind: "too-complex",
            reason: `'unset' targets shell variable ${m} (exec-influencing / integer-attr / IFS / PS4)`,
            nodeType: "command"
          };
        }
        n.set(m, "");
      }
    } else if (c === "print") {
      for (let u = 1; u < a.length; u++) {
        let d = a[u];
        if (d === "--" || d === "-" || !d.startsWith("-")) {
          break;
        }
        let p = false;
        for (let m = 1; m < d.length; m++) {
          let f = d[m];
          if (f === "v") {
            let h = m < d.length - 1 ? d.slice(m + 1) : a[u + 1];
            if (h) {
              i(h);
            }
            p = m === d.length - 1;
            break;
          }
          if (Ahp.vZc("-" + f)) {
            p = m === d.length - 1;
            break;
          }
        }
        if (p) {
          u++;
        }
      }
    } else if (c === "set") {
      for (let u = 1; u < a.length; u++) {
        let d = a[u];
        if (d === "--" || !/^[-+]/.test(d)) {
          break;
        }
        let p = d.indexOf("A", 1);
        if (p === -1) {
          if (d.endsWith("o")) {
            u++;
          }
          continue;
        }
        if (p < d.length - 1) {
          i(d.slice(p + 1));
        } else if (a[u + 1]) {
          i(a[u + 1]);
        }
        break;
      }
    } else if (c === "mapfile" || c === "readarray") {
      let u = false;
      for (let d = 1; d < a.length; d++) {
        let p = a[d];
        if (p.startsWith("-")) {
          if (/^-[dnOsuCc]$/.test(p)) {
            d++;
          }
          continue;
        }
        i(p);
        u = true;
      }
      if (!u) {
        o.push("MAPFILE");
      }
    } else if (!l && (c === "cd" || c === "chdir" || c === "pushd" || c === "popd")) {
      let u = false;
      if (c === "pushd" || c === "popd") {
        for (let d = 1; d < a.length; d++) {
          let p = a[d];
          if (p === "--") {
            break;
          }
          if (/^-[a-zA-Z]*n[a-zA-Z]*$/.test(p)) {
            u = true;
            break;
          }
          if (c === "popd" && (/^\+0*[1-9]/.test(p) || /^-0+$/.test(p))) {
            u = true;
            break;
          }
        }
      }
      if (!u) {
        n.set("PWD", "__TRACKED_VAR__");
        n.set("OLDPWD", "__TRACKED_VAR__");
      }
      if (c === "pushd" || c === "popd") {
        n.set("DIRSTACK", "__TRACKED_VAR__");
        n.set("dirstack", "__TRACKED_VAR__");
      }
    }
    if (c !== undefined && t.length > 0 && Zua.vZc(c)) {
      for (let u of t) {
        i(u.name);
      }
    }
    for (let u of o) {
      if (zOe(u)) {
        return {
          kind: "too-complex",
          reason: `'${c ?? t[0]?.name}' writes shell variable ${u} (exec-influencing / integer-attr / IFS) \u2014 value cannot be statically verified`,
          nodeType: "command"
        };
      }
      n.set(u, "__TRACKED_VAR__");
    }
    r.push(...s);
    return null;
  }
  function Ehp(e, t, n, r, o) {
    let s = [];
    let i = [];
    let a = [...t];
    for (let d of e.children) {
      if (!d) {
        continue;
      }
      switch (d.type) {
        case "variable_assignment":
          {
            if (i.length > 0) {
              let m = oda(d, new Set(i.map(f => f.name)));
              if (m !== null) {
                return {
                  kind: "too-complex",
                  reason: `Env-prefix value references \`$${m}\` assigned by an earlier env-prefix in the same command \u2014 runtime sees the earlier assignment, static analysis does not`,
                  nodeType: "variable_assignment"
                };
              }
            }
            let p = aco(d, n, r, o);
            if ("kind" in p) {
              return p;
            }
            if (ada(p.name, p.value)) {
              return {
                kind: "too-complex",
                reason: `${p.name} has integer attribute \u2014 env-prefix arith-evals value, executing subscript command substitution`,
                nodeType: "variable_assignment"
              };
            }
            i.push({
              name: p.name,
              value: p.value
            });
            break;
          }
        case "command_name":
          {
            let p = d.children[0] ?? d;
            if (isScrubEnabled()) {
              if (p.type === "simple_expansion" || p.type === "expansion") {
                return ey(p);
              }
              if ((p.type === "string" || p.type === "concatenation") && rda(p)) {
                return ey(p);
              }
            }
            let m = dde(p, n, r, o);
            if (typeof m !== "string") {
              return m;
            }
            s.push(m);
            break;
          }
        case "word":
        case "number":
        case "raw_string":
        case "string":
        case "concatenation":
        case "arithmetic_expansion":
          {
            let p = dde(d, n, r, o);
            if (typeof p !== "string") {
              return p;
            }
            if (/^--?[\nA-Za-z0-9_]/.test(p) && Up(p)) {
              return {
                kind: "too-complex",
                reason: "Argument starting with `-` contains runtime-determined content",
                nodeType: d.type
              };
            }
            s.push(p);
            break;
          }
        case "simple_expansion":
          {
            let p = f2n(d, r, false);
            if (typeof p !== "string") {
              return p;
            }
            s.push(p);
            break;
          }
        case "file_redirect":
          {
            let p = oco(d, n, r, o);
            if ("kind" in p) {
              return p;
            }
            a.push(p);
            break;
          }
        case "herestring_redirect":
          {
            let p = Shp(d, n, r, o);
            if (p) {
              return p;
            }
            break;
          }
        default:
          return ey(d);
      }
    }
    {
      let d = Thp(s, i, r, o);
      if (d) {
        return d;
      }
    }
    let l = (d, p) => d === "" || /["'\\ \t\n$`;|&<>(){}#]/.test(d) || p === 0 && d.includes("=") ? `'${d.replaceAll("'", "'\\''")}'` : d;
    let c = /\$[A-Za-z_]/.test(e.text) || e.text.includes(`
`) ? [...i.map(d => `${d.name}=${l(d.value)}`), ...s.map((d, p) => l(d, p))].join(" ") : e.text;
    let u = p9e(e.text);
    return {
      kind: "simple",
      commands: [{
        argv: s,
        envVars: i,
        redirects: a,
        text: c,
        hasUnquotedGlob: u
      }],
      bareAssignmentNames: []
    };
  }
  function yco(e, t, n, r) {
    let o = new Map(n);
    for (let s of e.children) {
      if (!s) {
        continue;
      }
      if (s.type === "$(" || s.type === "`" || s.type === ")") {
        continue;
      }
      let i = AG(s, t, o, r);
      if (i) {
        return i;
      }
    }
    return null;
  }
  function dde(e, t, n, r) {
    if (!e) {
      return {
        kind: "too-complex",
        reason: "Null argument node"
      };
    }
    switch (e.type) {
      case "word":
        {
          if (tco.test(e.text)) {
            return {
              kind: "too-complex",
              reason: "Word contains brace expansion syntax",
              nodeType: "word",
              differential: true
            };
          }
          if (nco.test(e.text) || rco.test(e.text)) {
            return {
              kind: "too-complex",
              reason: "Brace body contains backslash-escaped brace",
              nodeType: "word",
              differential: true
            };
          }
          if (fco.test(e.text)) {
            return {
              kind: "too-complex",
              reason: "Word contains unescaped ` or $ \u2014 parser missed expansion",
              nodeType: "word",
              differential: true
            };
          }
          if (hco.test(e.text)) {
            return {
              kind: "too-complex",
              reason: "Word contains unescaped quote \u2014 parser absorbed quote into brace-body word",
              nodeType: "word"
            };
          }
          return e.text.replace(/\\(.)/g, "$1");
        }
      case "number":
        if (e.children.length > 0) {
          return {
            kind: "too-complex",
            reason: "Number node contains expansion (NN# arithmetic base syntax)",
            nodeType: e.children[0]?.type
          };
        }
        return e.text;
      case "raw_string":
        return nda(e.text);
      case "string":
        return eda(e, t, n, r);
      case "concatenation":
        {
          if (tco.test(e.text)) {
            return {
              kind: "too-complex",
              reason: "Brace expansion",
              nodeType: "concatenation",
              differential: true
            };
          }
          if (nco.test(e.text) || rco.test(e.text)) {
            return {
              kind: "too-complex",
              reason: "Brace body contains backslash-escaped brace",
              nodeType: "concatenation",
              differential: true
            };
          }
          let o = "";
          let s = false;
          let i = e.startIndex;
          for (let a = 0; a < e.children.length; a++) {
            let l = e.children[a];
            if (!l) {
              continue;
            }
            if (l.startIndex > i) {
              return {
                kind: "too-complex",
                reason: "Concatenation has unparsed bytes between children \u2014 parser dropped content that shell will see",
                nodeType: "concatenation"
              };
            }
            if (i = l.endIndex, l.type === "word" && l.text.includes("{")) {
              s = true;
            }
            if ((l.type === "simple_expansion" || l.type === "expansion") && (e.children[a + 1]?.text.startsWith("[") || /^:[a-zA-Z&]/.test(e.children[a + 1]?.text ?? ""))) {
              return {
                kind: "too-complex",
                reason: "zsh $name[expr] / $name:mod in bare concatenation \u2014 recursive eval",
                nodeType: "concatenation",
                differential: true
              };
            }
            let c = dde(l, t, n, r);
            if (typeof c !== "string") {
              return c;
            }
            o += c;
          }
          if (s && (o.includes(",") || o.includes(".."))) {
            return {
              kind: "too-complex",
              reason: "Brace expansion (unquoted `{` in concatenation with `,`/`..`)",
              nodeType: "concatenation"
            };
          }
          if (p2n.test(o)) {
            return {
              kind: "too-complex",
              reason: "zsh ~[ dynamic directory syntax (post-collapse)",
              nodeType: "concatenation",
              differential: true
            };
          }
          if (m2n.test(o)) {
            return {
              kind: "too-complex",
              reason: "zsh =cmd expansion (post-collapse)",
              nodeType: "concatenation",
              differential: true
            };
          }
          return o;
        }
      case "arithmetic_expansion":
        {
          let o = _co(e);
          if (o) {
            return o;
          }
          return "__TRACKED_VAR__";
        }
      case "simple_expansion":
        return f2n(e, n, false);
      default:
        return ey(e);
    }
  }
  function eda(e, t, n, r) {
    let o = "";
    let s = -1;
    let i = false;
    let a = false;
    let l = false;
    for (let c of e.children) {
      if (!c) {
        continue;
      }
      if (s !== -1 && c.startIndex > s) {
        let u = Buffer.from(e.text, "utf8").subarray(s - e.startIndex, c.startIndex - e.startIndex).toString("utf8");
        if (u.includes("`")) {
          return {
            kind: "too-complex",
            reason: "Unanalyzable backtick body in double-quoted string gap \u2014 shell-evaluated value unknown",
            nodeType: "string",
            differential: true
          };
        }
        if (u.length > 0) {
          o += u;
          a = true;
        }
      }
      switch (s = c.endIndex, c.type) {
        case '"':
          s = c.endIndex;
          break;
        case "string_content":
          o += c.text.replace(/\\\n/g, "").replace(/\\([$`"\\])/g, "$1");
          a = true;
          break;
        case $ua:
          {
            let u = e.children[e.children.indexOf(c) + 1];
            if (u?.type === "string_content") {
              if (u.text.startsWith("[")) {
                return {
                  kind: "too-complex",
                  reason: "Legacy $[...] arithmetic inside double-quotes \u2014 recursive subscript eval",
                  nodeType: "string",
                  differential: true
                };
              }
              if (/^[+^=~]/.test(u.text)) {
                return {
                  kind: "too-complex",
                  reason: "zsh $+/$^/$=/$~ prefix-flag expansion \u2014 value defeats downstream content checks",
                  nodeType: "string",
                  differential: true
                };
              }
            }
            o += $ua;
            a = true;
            break;
          }
        case "command_substitution":
          {
            let u = whp(c);
            if (u === "DANGEROUS") {
              return ey(c);
            }
            if (u !== null) {
              let p = u.replace(/\n+$/, "");
              if (p.includes(`
`)) {
                if (/^--?[A-Za-z0-9]/.test(o + p)) {
                  return {
                    kind: "too-complex",
                    reason: "cat-heredoc body would make the argument start with option syntax",
                    nodeType: "command_substitution"
                  };
                }
                o += `
` + "__CMDSUB_OUTPUT__";
                a = true;
                break;
              }
              o += p;
              a = true;
              break;
            }
            let d = yco(c, t, n, r);
            if (d) {
              return d;
            }
            o += "__CMDSUB_OUTPUT__";
            i = true;
            break;
          }
        case "simple_expansion":
          {
            let u = f2n(c, n, true);
            if (typeof u !== "string") {
              return u;
            }
            {
              let d = e.children[e.children.indexOf(c) + 1];
              let p = c.children.some(m => m?.type === "special_variable_name");
              if (d?.type === "string_content" && (d.text.startsWith("[") || /^:[a-zA-Z&]/.test(d.text) || p && /^\w*(\[|:[a-zA-Z&])/.test(d.text))) {
                return {
                  kind: "too-complex",
                  reason: 'zsh "$name[expr]" / "$name:mod" inside double-quotes \u2014 recursive eval',
                  nodeType: "string",
                  differential: true
                };
              }
            }
            if (Up(u)) {
              i = true;
            } else if (u !== "") {
              a = true;
            } else {
              l = true;
            }
            o += u;
            break;
          }
        case "arithmetic_expansion":
          {
            let u = _co(c);
            if (u) {
              return u;
            }
            o += "__TRACKED_VAR__";
            i = true;
            break;
          }
        default:
          return ey(c);
      }
    }
    if (i) {
      if ([...o.replaceAll("__CMDSUB_OUTPUT__", "").replaceAll("__TRACKED_VAR__", "")].length <= 1) {
        return ey(e);
      }
    }
    if (!a && !i && !l && e.text.length > 2) {
      let c = e.text.slice(1, -1);
      if (c.includes("`") || c.includes("$(")) {
        return {
          kind: "too-complex",
          reason: "Delimiters-only string node contains unparsed command substitution",
          nodeType: "string",
          differential: true
        };
      }
      return c;
    }
    return o;
  }
  function _co(e) {
    for (let t of e.children) {
      if (!t) {
        continue;
      }
      if (t.children.length === 0) {
        if (!vhp.test(t.text)) {
          return {
            kind: "too-complex",
            reason: `Arithmetic expansion references variable or non-literal: ${t.text}`,
            nodeType: "arithmetic_expansion"
          };
        }
        continue;
      }
      switch (t.type) {
        case "binary_expression":
        case "unary_expression":
        case "ternary_expression":
        case "parenthesized_expression":
          {
            let n = _co(t);
            if (n) {
              return n;
            }
            break;
          }
        default:
          return ey(t);
      }
    }
    return null;
  }
  function whp(e) {
    let t = null;
    for (let o of e.children) {
      if (!o) {
        continue;
      }
      if (o.type === "$(" || o.type === ")") {
        continue;
      }
      if (o.type === "redirected_statement" && t === null) {
        t = o;
      } else {
        return null;
      }
    }
    if (!t) {
      return null;
    }
    let n = false;
    let r = null;
    for (let o of t.children) {
      if (!o) {
        continue;
      }
      if (o.type === "command") {
        let s = o.children.filter(a => a);
        if (s.length !== 1) {
          return null;
        }
        let i = s[0];
        if (i?.type !== "command_name" || i.text !== "cat") {
          return null;
        }
        n = true;
      } else if (o.type === "heredoc_redirect") {
        if (sco(o) !== null) {
          return null;
        }
        for (let s of o.children) {
          if (s?.type === "<<-") {
            return null;
          }
          if (s?.type === "heredoc_body") {
            r = s.text;
          }
        }
      } else {
        return null;
      }
    }
    if (!n || r === null) {
      return null;
    }
    if (uco.test(r)) {
      return "DANGEROUS";
    }
    if (sda(r) !== false) {
      return "DANGEROUS";
    }
    return r;
  }
  function aco(e, t, n, r) {
    let o = null;
    let s = "";
    let i = false;
    for (let a of e.children) {
      if (!a) {
        continue;
      }
      if (a.type === "variable_name") {
        o = a.text;
      } else if (a.type === "=" || a.type === "+=") {
        i = a.type === "+=";
        continue;
      } else if (a.type === "command_substitution") {
        let l = yco(a, t, n, r);
        if (l) {
          return l;
        }
        s = "__CMDSUB_OUTPUT__";
      } else if (a.type === "simple_expansion") {
        let l = f2n(a, n, true);
        if (typeof l !== "string") {
          return l;
        }
        s = l;
      } else {
        let l = dde(a, t, n, r);
        if (typeof l !== "string") {
          return l;
        }
        s = l;
      }
    }
    if (o === null) {
      return {
        kind: "too-complex",
        reason: "Variable assignment without name",
        nodeType: "variable_assignment"
      };
    }
    if (!/^[A-Za-z_][A-Za-z0-9_]*$/.test(o)) {
      return {
        kind: "too-complex",
        reason: `Invalid variable name (bash treats as command): ${o}`,
        nodeType: "variable_assignment"
      };
    }
    if (o === "IFS") {
      return {
        kind: "too-complex",
        reason: "IFS assignment changes word-splitting \u2014 cannot model statically",
        nodeType: "variable_assignment"
      };
    }
    if (o === "PS4" || o === "PROMPT4") {
      if (i) {
        return {
          kind: "too-complex",
          reason: "PS4 += cannot be statically verified \u2014 combine into a single PS4= assignment",
          nodeType: "variable_assignment"
        };
      }
      if (Up(s)) {
        return {
          kind: "too-complex",
          reason: "PS4 value derived from cmdsub/variable \u2014 runtime unknowable",
          nodeType: "variable_assignment"
        };
      }
      if (!/^[A-Za-z0-9 _+:./=[\]-]*$/.test(s.replace(/\$\{[A-Za-z_][A-Za-z0-9_]*\}/g, ""))) {
        return {
          kind: "too-complex",
          reason: "PS4 value outside safe charset \u2014 only ${VAR} refs and [A-Za-z0-9 _+:.=/[]-] allowed",
          nodeType: "variable_assignment"
        };
      }
    }
    if (s.includes("~")) {
      return {
        kind: "too-complex",
        reason: "Tilde in assignment value \u2014 bash may expand at assignment time",
        nodeType: "variable_assignment"
      };
    }
    return {
      name: o,
      value: s,
      isAppend: i
    };
  }
  function f2n(e, t, n) {
    let r = null;
    let o = false;
    for (let i of e.children) {
      if (i?.type === "variable_name") {
        r = i.text;
        break;
      }
      if (i?.type === "special_variable_name") {
        r = i.text;
        o = true;
        break;
      }
    }
    if (r === null) {
      return ey(e);
    }
    let s = t.get(r);
    if (s !== undefined) {
      if (tda.vZc(r)) {
        return n && eco.vZc(r) && r !== "BASHPID" ? "__TRACKED_VAR__" : ey(e);
      }
      if (Up(s)) {
        if (!n) {
          return ey(e);
        }
        return s;
      }
      if (!n) {
        if (s === "") {
          return ey(e);
        }
        if (Uua.test(s)) {
          return ey(e);
        }
      }
      return s;
    }
    if (r === "HOME") {
      let i = Gua.homedir();
      if (!n && (i === "" || Uua.test(i))) {
        return ey(e);
      }
      return i;
    }
    if (n) {
      if (eco.vZc(r)) {
        return "__TRACKED_VAR__";
      }
      if (o && (mhp.vZc(r) || /^[0-9]+$/.test(r))) {
        return "__TRACKED_VAR__";
      }
    }
    return ey(e);
  }
  function Xlo(e, t) {
    T3t(t, e);
  }
  function Hua(e, t) {
    let n = () => {
      for (let r of t.keys()) {
        t.set(r, "__TRACKED_VAR__");
      }
    };
    for (let r of e) {
      if (!r || r.type === "unset" || r.type === "file_redirect" || r.type === "heredoc_redirect" || r.type === "herestring_redirect") {
        continue;
      }
      if (r.type === "variable_name") {
        t.set(r.text.replace(/\\/g, ""), "__TRACKED_VAR__");
        continue;
      }
      if (r.type === "word") {
        if (r.text.startsWith("-")) {
          if (r.text === "--" || /^-[fvn]+$/.test(r.text)) {
            continue;
          }
          n();
          continue;
        }
        if (/^\\?[A-Za-z_][A-Za-z0-9_]*$/.test(r.text)) {
          t.set(r.text.replace(/^\\/, ""), "__TRACKED_VAR__");
          continue;
        }
      }
      n();
    }
  }
  function lco(e) {
    if (!e) {
      return null;
    }
    switch (e.type) {
      case "word":
      case "number":
        return e.text.replace(/\\(.)/g, "$1");
      case "raw_string":
        return e.text.slice(1, -1);
      case "string":
        {
          let t = e.children.filter(n => n && n.type !== '"');
          if (t.length === 0) {
            return "";
          }
          if (t.length === 1 && t[0]?.type === "string_content") {
            return t[0].text;
          }
          return null;
        }
      case "concatenation":
        {
          let t = "";
          for (let n of e.children) {
            let r = lco(n);
            if (r === null) {
              return null;
            }
            t += r;
          }
          return t;
        }
      default:
        return null;
    }
  }
  function T3t(e, t) {
    if (e.type === "function_definition" || e.type === "subshell" || e.type === "command_substitution" || e.type === "process_substitution") {
      return;
    }
    if (e.type === "pipeline") {
      let n = null;
      for (let r of e.children) {
        if (r && !Zlo.vZc(r.type)) {
          n = r;
        }
      }
      if (n) {
        T3t(n, t);
      }
      return;
    }
    if (e.type === "list" || e.type === "program") {
      let n = e.children;
      for (let r = 0; r < n.length; r++) {
        let o = n[r];
        if (!o || Zlo.vZc(o.type)) {
          continue;
        }
        let s = r + 1;
        while (s < n.length && !n[s]) {
          s++;
        }
        if (n[s]?.type === "&") {
          continue;
        }
        T3t(o, t);
      }
      return;
    }
    if (e.type === "variable_assignment") {
      for (let n of e.children) {
        if (n?.type === "variable_name") {
          t.set(n.text, "__TRACKED_VAR__");
          break;
        }
      }
    }
    if (e.type === "for_statement") {
      for (let n of e.children) {
        if (n?.type === "variable_name") {
          t.set(n.text, "__TRACKED_VAR__");
          break;
        }
      }
    }
    if (e.type === "unset_command") {
      Hua(e.children, t);
    }
    if (e.type === "command") {
      let n;
      let r;
      let o = [];
      let s = [];
      let i = false;
      for (let p of e.children) {
        if (!p) {
          continue;
        }
        if (p.type === "command_name") {
          r = p;
          n = lco(p.children[0] ?? p) ?? undefined;
          i = true;
        } else if (!i || p.type === "file_redirect" || p.type === "herestring_redirect" || p.type === "heredoc_redirect") {
          ;
        } else {
          o.push(lco(p) ?? "");
          s.push(p);
        }
      }
      while (n !== undefined && (ico.vZc(n) || n === "!")) {
        while (o.length > 0) {
          let p = o[0];
          if (/^-[-pvV]*$/.test(p)) {
            o.shift();
            s.shift();
          } else if (/^[A-Za-z_]\w*(\[[^\]]*\])?\+?=/.test(p)) {
            let m = p.match(/^[A-Za-z_][A-Za-z0-9_]*/)[0];
            t.set(m, "__TRACKED_VAR__");
            o.shift();
            s.shift();
          } else {
            break;
          }
        }
        n = o.shift();
        s.shift();
      }
      let a = o;
      let l = p => {
        if (/^[A-Za-z_][A-Za-z0-9_]*$/.test(p)) {
          t.set(p, "__TRACKED_VAR__");
        }
      };
      if (n === "read") {
        t.set("REPLY", "__TRACKED_VAR__");
        let p = 0;
        let m = false;
        while (p < a.length) {
          let f = a[p];
          if (!m && f === "--") {
            m = true;
            p++;
            continue;
          }
          if (!m && f.startsWith("-")) {
            if (vdt.vZc(f)) {
              p += 2;
              continue;
            }
            let h = false;
            for (let g = 1; g < f.length; g++) {
              let y = f[g];
              if (y === "a" || y === "A") {
                l(g < f.length - 1 ? f.slice(g + 1) : a[p + 1] ?? "");
                h = g === f.length - 1;
                break;
              }
              if (vdt.vZc("-" + y)) {
                h = g === f.length - 1;
                break;
              }
            }
            p += h ? 2 : 1;
            continue;
          }
          l(f);
          p++;
        }
      } else if (n === "mapfile" || n === "readarray") {
        t.set("MAPFILE", "__TRACKED_VAR__");
        for (let p = 0; p < a.length; p++) {
          let m = a[p];
          if (m.startsWith("-")) {
            if (/^-[dnOsuCc]$/.test(m)) {
              p++;
            }
            continue;
          }
          l(m);
        }
      } else if (n === "unset") {
        Hua(s, t);
      }
      let c = r?.children[0];
      let u = c?.type === "word" ? c.text.replace(/\\(.)/g, "$1") : undefined;
      let d = u !== undefined && !Zua.vZc(u) && !ico.vZc(u) && !Qua.vZc(u);
      for (let p of e.children) {
        if (p && (p.type !== "variable_assignment" || !d)) {
          T3t(p, t);
        }
      }
      return;
    }
    if (e.type === "declaration_command") {
      for (let n of e.children) {
        if (n?.type === "string" || n?.type === "raw_string" || n?.type === "word" || n?.type === "number" || n?.type === "concatenation" || n?.type === "variable_name") {
          let r = n.text.replace(/['"\\]/g, "");
          let o = /^([A-Za-z_][A-Za-z0-9_]*)\+?=/.exec(r);
          if (o) {
            t.set(o[1], "__TRACKED_VAR__");
          } else {
            let s = r.indexOf("=");
            if (s > 0 && r.lastIndexOf("$", s - 1) !== -1) {
              for (let i of [...t.keys()]) {
                t.set(i, "__TRACKED_VAR__");
              }
            }
          }
        }
      }
    }
    for (let n of e.children) {
      if (n) {
        T3t(n, t);
      }
    }
  }
  function S3t(e, t) {
    for (let [n, r] of t) {
      let o = e.get(n);
      if (o !== undefined && o !== r) {
        e.set(n, "__TRACKED_VAR__");
      }
    }
    for (let n of e.keys()) {
      if (!t.vZc(n)) {
        e.set(n, "__TRACKED_VAR__");
      }
    }
  }
  function Qlo(e, t, n = false) {
    if (n) {
      e.set(t.name, "__TRACKED_VAR__");
      return;
    }
    if (t.isAppend && !e.vZc(t.name)) {
      return;
    }
    let r = e.get(t.name);
    if (r !== undefined && r !== t.value && !t.isAppend && !Up(t.value)) {
      e.set(t.name, "__TRACKED_VAR__");
      return;
    }
    let o = t.isAppend ? (r ?? "") + t.value : t.value;
    e.set(t.name, o);
  }
  function nda(e) {
    return e.slice(1, -1);
  }
  function rda(e) {
    for (let t of e.children) {
      if (!t) {
        continue;
      }
      if (t.type === "simple_expansion" || t.type === "expansion") {
        return true;
      }
      if (rda(t)) {
        return true;
      }
    }
    return false;
  }
  function Chp(e) {
    if (e === "~" || e.startsWith("~/")) {
      return "HOME";
    }
    if (e === "~+" || e.startsWith("~+/")) {
      return "PWD";
    }
    if (e === "~-" || e.startsWith("~-/")) {
      return "OLDPWD";
    }
    return null;
  }
  function oda(e, t) {
    let n = e.type === "variable_assignment";
    for (let r of e.children) {
      if (!r) {
        continue;
      }
      if (r.type === "variable_name") {
        if (n) {
          continue;
        }
        if (t.vZc(r.text)) {
          return r.text;
        }
      }
      if (r.type === "word") {
        let s = Chp(r.text);
        if (s !== null && t.vZc(s)) {
          return s;
        }
      }
      let o = oda(r, t);
      if (o !== null) {
        return o;
      }
    }
    return null;
  }
  function ey(e) {
    return {
      kind: "too-complex",
      reason: e.type === "ERROR" ? "Parse error" : Kua.vZc(e.type) ? `Contains ${e.type}` : `Contains shell syntax (${e.type}) that cannot be statically analyzed`,
      nodeType: e.type
    };
  }
  function sda(e) {
    if (/(?<![A-Za-z_])system[\s\\]*\(/.test(e)) {
      return "awk program contains system() which executes arbitrary commands";
    }
    if (/(?:^|[^|])\|&?[^/|%";#{}]*"/.test(e) || /(?:^|[^|])\|&?[\s\\]*getline\b/.test(e)) {
      return 'awk program contains a command pipe (| "cmd" or | getline) which executes arbitrary commands';
    }
    if (/@[\s\\]*(?:load|include)\b|@[\s\\]*\w+(?:::\w+)?(?:\[[^\]]*\])*[\s\\]*\(/.test(e)) {
      return "awk program contains @load/@include or an @indirect call which can execute arbitrary code";
    }
    if (/(?<![A-Za-z_])extension[\s\\]*\(/.test(e)) {
      return "awk program contains extension() which loads arbitrary native code (legacy gawk)";
    }
    if (/"\/inet[46]?\//.test(e)) {
      return "awk program opens a gawk /inet/ network socket which can exfiltrate data";
    }
    return false;
  }
  function ida(e) {
    let t = e.replace(/^.*[\\/]/, "");
    return g2n.vZc(e) || h2n.vZc(e) || E3t.vZc(e) || E3t.vZc(t) || t === "rm" || t === "rmdir";
  }
  function ada(e, t) {
    if (!wco.vZc(e)) {
      return false;
    }
    if (t.includes("[") || t.includes("`") || /\$\(/.test(t) || Up(t)) {
      return true;
    }
    if (/[A-Za-z_]/.test(t)) {
      return true;
    }
    return false;
  }
  function cco(e) {
    let t = e.toLowerCase();
    return xhp.vZc(t) || t.startsWith("ld_") || t.startsWith("dyld_") || t.startsWith("bash_func_");
  }
  function zOe(e) {
    return cco(e) || e === "IFS" || e === "PS4" || e === "PROMPT4" || wco.vZc(e);
  }
  function lda(e) {
    let t = null;
    for (let n of e) {
      let r = n.argv;
      let o = false;
      for (;;) {
        let l = r[0]?.replace(/^.*[\\/]/, "");
        let c = l === "time" || l === "nohup" || l === "timeout" || l === "nice" || l === "stdbuf" || l === "env" || l === "command" || l === "xargs" ? l : r[0];
        if (c === "time" || c === "nohup") {
          r = r.slice(1);
        } else if (c === "timeout") {
          let u = 1;
          while (u < r.length) {
            let d = r[u];
            if (d === "--foreground" || d === "--preserve-status" || d === "--verbose") {
              u++;
            } else if (/^--(?:kill-after|signal)=[A-Za-z0-9_.+-]+$/.test(d)) {
              u++;
            } else if ((d === "--kill-after" || d === "--signal") && r[u + 1] && /^[A-Za-z0-9_.+-]+$/.test(r[u + 1])) {
              u += 2;
            } else if (d.startsWith("--")) {
              return {
                ok: false,
                reason: `timeout with ${d} flag cannot be statically analyzed`
              };
            } else if (d === "-v") {
              u++;
            } else if ((d === "-k" || d === "-s") && r[u + 1] && /^[A-Za-z0-9_.+-]+$/.test(r[u + 1])) {
              u += 2;
            } else if (/^-[ks][A-Za-z0-9_.+-]+$/.test(d)) {
              u++;
            } else if (d.startsWith("-")) {
              return {
                ok: false,
                reason: `timeout with ${d} flag cannot be statically analyzed`
              };
            } else {
              break;
            }
          }
          if (r[u] && /^\d+(?:\.\d+)?[smhd]?$/.test(r[u])) {
            r = r.slice(u + 1);
          } else if (r[u]) {
            return {
              ok: false,
              reason: `timeout duration '${r[u]}' cannot be statically analyzed`
            };
          } else {
            break;
          }
        } else if (c === "nice") {
          if (r[1] === "-n" && r[2] && /^-?\d+$/.test(r[2])) {
            r = r.slice(3);
          } else if (r[1] && /^-\d+$/.test(r[1])) {
            r = r.slice(2);
          } else if (r[1] && (/[$(`]/.test(r[1]) || Up(r[1]))) {
            return {
              ok: false,
              reason: `nice argument '${r[1]}' contains expansion \u2014 cannot statically determine wrapped command`
            };
          } else {
            r = r.slice(1);
          }
        } else if (c === "env") {
          let u = 1;
          while (u < r.length) {
            let d = r[u];
            if (d.includes("=") && !d.startsWith("-")) {
              u++;
            } else if (d === "-i" || d === "-0" || d === "-v") {
              u++;
            } else if (d === "-u" && r[u + 1]) {
              u += 2;
            } else if (d.startsWith("-")) {
              return {
                ok: false,
                reason: `env with ${d} flag cannot be statically analyzed`
              };
            } else {
              break;
            }
          }
          if (u < r.length) {
            r = r.slice(u);
          } else {
            break;
          }
        } else if (c === "stdbuf") {
          let u = 1;
          while (u < r.length) {
            let d = r[u];
            if (uhp.test(d) && r[u + 1]) {
              u += 2;
            } else if (dhp.test(d)) {
              u++;
            } else if (php.test(d)) {
              u++;
            } else if (d.startsWith("-")) {
              return {
                ok: false,
                reason: `stdbuf with ${d} flag cannot be statically analyzed`
              };
            } else {
              break;
            }
          }
          if (u > 1 && u < r.length) {
            r = r.slice(u);
          } else {
            break;
          }
        } else if (c === "command") {
          let u = 1;
          let d = false;
          while (u < r.length && r[u].startsWith("-") && r[u] !== "--") {
            let p = r[u];
            if (!/^-[pvV]+$/.test(p)) {
              return {
                ok: false,
                reason: `command with ${p} flag cannot be statically analyzed`
              };
            }
            if (p.includes("v") || p.includes("V")) {
              d = true;
            }
            u++;
          }
          if (r[u] === "--") {
            u++;
          }
          if (d || u >= r.length) {
            break;
          }
          r = r.slice(u);
        } else if (r[0] === "builtin" || r[0] === "noglob") {
          let u = r[0] === "builtin" && r[1] === "--" ? 2 : 1;
          if (u < r.length) {
            r = r.slice(u);
          } else {
            break;
          }
        } else if (c === "xargs") {
          if (r.length >= 2 && !r[1].startsWith("-")) {
            r = r.slice(1);
            o = true;
          } else {
            break;
          }
        } else {
          break;
        }
      }
      let s = r[0];
      if (s === undefined) {
        continue;
      }
      if (s === "") {
        return {
          ok: false,
          reason: "Empty command name \u2014 argv[0] may not reflect what bash runs"
        };
      }
      if (s.includes("__CMDSUB_OUTPUT__") || s.includes("__TRACKED_VAR__")) {
        return {
          ok: false,
          reason: "Command name is runtime-determined (placeholder argv[0])"
        };
      }
      if (s.startsWith("-") || s.startsWith("|") || s.startsWith("&")) {
        return {
          ok: false,
          reason: "Command appears to be an incomplete fragment"
        };
      }
      let i = Sco[s];
      let a = s === "test" || s === "[" || s === "[[";
      if (i !== undefined) {
        for (let l = 1; l < r.length; l++) {
          let c = r[l];
          let u = r[l + 1];
          if (i.vZc(c) && u !== undefined && (u.includes("[") || Up(u))) {
            return {
              ok: false,
              reason: `'${s} ${c}' operand contains array subscript or runtime-determined value \u2014 bash evaluates $(cmd) in subscripts`
            };
          }
          if (a) {
            if (c === "-t" && u !== undefined && !m9e.test(u)) {
              return {
                ok: false,
                reason: `'${s} -t' operand is non-numeric \u2014 zsh arith-evals identifiers (may run $(cmd))`
              };
            }
            continue;
          }
          if (c.length > 2 && c[0] === "-" && c[1] !== "-" && !c.includes("[")) {
            for (let d of i) {
              if (d.length === 2 && c.includes(d[1])) {
                let p = r[l + 1];
                if (p !== undefined && (p.includes("[") || Up(p))) {
                  return {
                    ok: false,
                    reason: `'${s} ${d}' (combined in '${c}') operand contains array subscript \u2014 bash evaluates $(cmd) in subscripts`
                  };
                }
              }
            }
          }
          if (c.length > 2 && c[0] === "-" && s !== "read") {
            for (let d of i) {
              if (d.length !== 2) {
                continue;
              }
              let p = c.indexOf(d[1], 1);
              if (p === -1 || p === c.length - 1) {
                continue;
              }
              let m = c.slice(p + 1);
              if (/[A-Za-z_][A-Za-z0-9_]*\[/.test(m) || Up(m)) {
                return {
                  ok: false,
                  reason: `'${s} ${d}' (fused in '${c}') operand contains array subscript \u2014 bash evaluates $(cmd) in subscripts`
                };
              }
            }
          }
        }
      }
      if (a) {
        for (let l = 2; l < r.length; l++) {
          if (!Cdt.vZc(r[l])) {
            continue;
          }
          for (let c of [r[l - 1], r[l + 1]]) {
            if (c === undefined) {
              continue;
            }
            if (c.includes("[") || !m9e.test(c)) {
              return {
                ok: false,
                reason: `'${s} ... ${r[l]} ...' operand is non-numeric \u2014 \`[[\` arithmetically evaluates identifiers/subscripts (may run $(cmd))`
              };
            }
          }
        }
      }
      if (Tco.vZc(s)) {
        let l = false;
        for (let c = 1; c < r.length; c++) {
          let u = r[c];
          if (l !== false) {
            let d = l;
            if (l = false, d === "numeric" && !Wua.test(u)) {
              return {
                ok: false,
                reason: `'read ${r[c - 1]}' operand '${u}' is non-numeric \u2014 zsh arith-evals subscripts/expressions (may run $(cmd))`
              };
            }
            if (d === "prompt" && (khp.test(u) || u[0] === "-" && /[A-Za-z_][A-Za-z0-9_]*\[/.test(u) || u.includes("__CMDSUB_OUTPUT__"))) {
              return {
                ok: false,
                reason: `'read ${r[c - 1]}' operand '${u}' is a subscripted NAME, dash-prefixed with a subscript, or runtime-determined \u2014 zsh -p takes no operand; may arith-eval the subscript and run $(cmd)`
              };
            }
            continue;
          }
          if (u[0] === "-") {
            if (s === "read") {
              if (qua.vZc(u)) {
                l = "numeric";
              } else if (u === "-p") {
                l = "prompt";
              } else if (vdt.vZc(u)) {
                l = "string";
              } else if (u.length > 2) {
                for (let d = 1; d < u.length; d++) {
                  let p = "-" + u[d];
                  let m = qua.vZc(p);
                  if (m || vdt.vZc(p)) {
                    if (d === u.length - 1) {
                      l = m ? "numeric" : p === "-p" ? "prompt" : "string";
                    } else if (m && !Wua.test(u.slice(d + 1))) {
                      return {
                        ok: false,
                        reason: `'read ${p}' (fused in '${u}') operand is non-numeric \u2014 zsh arith-evals subscripts/expressions (may run $(cmd))`
                      };
                    } else if (p === "-p") {
                      let f = u.slice(d + 1);
                      if (/[A-Za-z_][A-Za-z0-9_]*\[/.test(f) || f.includes("__CMDSUB_OUTPUT__")) {
                        return {
                          ok: false,
                          reason: `'read -p' fused remainder '${f}' contains a subscripted identifier or cmdsub \u2014 on zsh (-p is no-arg) this may reach matheval via a following option and run $(cmd)`
                        };
                      }
                    }
                    break;
                  }
                }
              }
            }
            continue;
          }
          if (u.includes("[") || Up(u)) {
            return {
              ok: false,
              reason: `'${s}' positional NAME '${u}' contains array subscript or runtime-determined value \u2014 bash evaluates $(cmd) in subscripts`
            };
          }
        }
      }
      if (C3t.vZc(s)) {
        let l = s === "declare" || s === "typeset" || s === "local";
        let c = l || s === "export" || s === "readonly";
        for (let u = 1; u < r.length; u++) {
          let d = r[u];
          if (l && /^[+-].*[niaAEF]/.test(d)) {
            return {
              ok: false,
              reason: `'${s}' with -n/-i/-a/-A/-E/-F flag (reached as plain command via wrapper/quote) changes assignment eval semantics`
            };
          }
          if (jua.vZc(s) && /^[+-].*[iEF]/.test(d)) {
            return {
              ok: false,
              reason: `'${s}' with -i/-E/-F flag (reached as plain command via wrapper/quote) \u2014 zsh bin_typeset mathevals the RHS`
            };
          }
          if ((c || s === "private") && /^[+-].*m/.test(d)) {
            return {
              ok: false,
              reason: `'${s}' with -m/+m flag (reached as plain command via wrapper/quote) \u2014 zsh pattern-assigns every matching variable`
            };
          }
          if (jua.vZc(s) && /^[+-].*T/.test(d)) {
            return {
              ok: false,
              reason: `'${s} -T' creates a user-defined zsh tied pair \u2014 tracked literals for its operands are unreliable`
            };
          }
          let p = d.includes("[") && /[$`]/.test(d);
          if (p || Up(d)) {
            return {
              ok: false,
              reason: p ? `'${s}' operand '${c2n(d)}' contains array subscript with expansion \u2014 shell arith-evals $(cmd) in subscripts` : `'${s}' operand '${c2n(d)}' is runtime-determined and may carry an array subscript \u2014 shell arith-evals $(cmd) in subscripts`
            };
          }
          if ((s === "float" || s === "integer") && !/^[+-]/.test(d)) {
            return {
              ok: false,
              reason: `zsh '${s}' operand \u2014 implicit typeset -E/-i arithmetically evaluates the (existing or assigned) value`
            };
          }
        }
      }
      if (s === "printf") {
        for (let l = 1; l < r.length; l++) {
          let c = r[l];
          let u = c.includes("[") && /[$`]/.test(c);
          if (u || Up(c)) {
            return {
              ok: false,
              reason: u ? `printf operand '${c2n(c)}' contains array subscript with expansion \u2014 zsh arith-evals %d/%i operands (may run $(cmd))` : `printf operand '${c2n(c)}' is runtime-determined and may carry an array subscript \u2014 zsh arith-evals %d/%i operands (may run $(cmd))`
            };
          }
        }
      }
      if (s === "set") {
        for (let l = 1; l < r.length; l++) {
          let c = r[l];
          if (c === "--") {
            break;
          }
          if (!/^[-+]/.test(c)) {
            continue;
          }
          for (let u = 1; u < c.length; u++) {
            let d = c[u];
            if (d === "o") {
              let p = u < c.length - 1 ? c.slice(u + 1) : r[l + 1];
              if (p !== undefined && p !== "" && !Eco.vZc(p.toLowerCase().replace(/[_-]/g, ""))) {
                return {
                  ok: false,
                  reason: `'set -o/+o ${p}' changes shell parsing/globbing state \u2014 can enable globsubst/extendedglob and defeat static analysis`
                };
              }
              if (u === c.length - 1) {
                l++;
              }
              break;
            }
            if (d === "A") {
              break;
            }
            if (!vco.vZc(d)) {
              return {
                ok: false,
                reason: `'set ${c[0]}${d}' changes shell option state (allexport/keyword/\u2026) \u2014 defeats static env-var analysis; see SET_O_SAFE_LETTERS`
              };
            }
          }
        }
      }
      if (s === "print" && r.some(l => /^[+-].*P/.test(l))) {
        for (let l = 1; l < r.length; l++) {
          let c = r[l];
          if (/\$\(|`/.test(c) || Up(c)) {
            return {
              ok: false,
              reason: "'print -P' operand contains command substitution \u2014 zsh prompt expansion evaluates $(cmd)"
            };
          }
        }
      }
      if (s === "jobs") {
        for (let l = 1; l < r.length; l++) {
          let c = r[l];
          if (/^[+-].*x/.test(c)) {
            return {
              ok: false,
              reason: "'jobs -x' executes its argument as a command \u2014 cannot be statically analyzed"
            };
          }
        }
      }
      if (zlo.vZc(s)) {
        return {
          ok: false,
          reason: `Shell keyword '${s}' as command name \u2014 tree-sitter mis-parse`
        };
      }
      if (o) {
        if (s === "find" || s === "jq") {
          return {
            ok: false,
            reason: `${s} through xargs \u2014 stdin-appended arguments cannot be statically analyzed`
          };
        }
        if (d2n.vZc(s)) {
          let l = false;
          for (let c = 1; c < r.length; c++) {
            let u = r[c];
            if (u === "--") {
              l = c + 1 < r.length;
              break;
            }
            if (u === "-" || !u.startsWith("-")) {
              l = true;
              break;
            }
            if (!u.includes("=") && Rhp.test(u)) {
              c++;
            }
          }
          if (!l) {
            return {
              ok: false,
              reason: `${s} through xargs with no static program \u2014 stdin-supplied program text cannot be statically analyzed`
            };
          }
        }
      }
      if (s === "jq") {
        for (let l of r) {
          if (/\bsystem\s*\(/.test(l)) {
            return {
              ok: false,
              reason: "jq command contains system() function which executes arbitrary commands"
            };
          }
          if (/\b(?:include|import)\b/.test(l)) {
            return {
              ok: false,
              reason: 'jq command contains include/import \u2014 modules can load arbitrary .jq files via {search:"."} and call env or other builtins'
            };
          }
        }
        if (r.some(l => /^(?:-[A-Za-z]*[fL]|--(?:from-file|rawfile|slurpfile|library-path)(?:$|=))/.test(l))) {
          return {
            ok: false,
            reason: "jq command contains dangerous flags that could execute code or read arbitrary files"
          };
        }
      }
      if (d2n.vZc(s)) {
        if (n.hasUnquotedGlob) {
          return {
            ok: false,
            reason: "awk command contains unquoted glob characters \u2014 could glob-expand to a planted program or flag before awk runs"
          };
        }
        for (let l of r) {
          let c = sda(l);
          if (c !== false) {
            return {
              ok: false,
              reason: c
            };
          }
          if (Up(l)) {
            return {
              ok: false,
              reason: "awk argument is runtime-determined \u2014 substituted text becomes awk code and cannot be statically analyzed"
            };
          }
        }
        if (r.some(l => /^-[bcCghIkMnNOPrsStV]*[fEileDW]/.test(l) || /^--(?:fil|e|i|lo|s|de)/.test(l))) {
          return {
            ok: false,
            reason: "awk command uses flags that read the program from a file, load extensions, or supply program fragments \u2014 cannot be statically analyzed"
          };
        }
      }
      if (s === "find") {
        if (n.hasUnquotedGlob) {
          return {
            ok: false,
            reason: "find contains unquoted glob characters \u2014 could glob-expand to a dangerous action before find runs"
          };
        }
        for (let l = 1; l < r.length; l++) {
          let c = r[l];
          if (bco.vZc(c)) {
            return {
              ok: false,
              reason: `find with '${c}' executes commands or modifies files \u2014 cannot be auto-allowed by a Bash(find:*) prefix rule`
            };
          }
          if (v3t.vZc(c) || w3t.test(c)) {
            l++;
            continue;
          }
          if (Up(c)) {
            return {
              ok: false,
              reason: "find argument is runtime-determined \u2014 could resolve to a dangerous action"
            };
          }
          if (/[[\]*?]/.test(c)) {
            return {
              ok: false,
              reason: `find argument '${c}' contains glob characters \u2014 could glob-expand to a dangerous action`
            };
          }
        }
      }
      if (h2n.vZc(s)) {
        return {
          ok: false,
          reason: `Zsh builtin '${s}' can bypass security checks`
        };
      }
      if (g2n.vZc(s)) {
        if (s === "fc" && !r.slice(1).some(l => /^[+-].*[es]/.test(l))) {
          ;
        } else if (s === "compgen" && !r.slice(1).some(l => /^[+-].*[CFW]/.test(l))) {
          ;
        } else {
          return {
            ok: false,
            reason: `'${s}' evaluates arguments as shell code`
          };
        }
      }
      if (E3t.vZc(s) && r.length > 1) {
        return {
          ok: false,
          reason: `'${s}' runs its argument as a command \u2014 cannot be statically analyzed`
        };
      }
      for (let l of n.argv) {
        if (l.includes("/proc/") && uco.test(l)) {
          return {
            ok: false,
            reason: "Accesses /proc/*/environ which may expose secrets"
          };
        }
      }
      for (let l of n.redirects) {
        if (l.target.includes("/proc/") && uco.test(l.target)) {
          return {
            ok: false,
            reason: "Accesses /proc/*/environ which may expose secrets"
          };
        }
      }
      for (let l of n.argv) {
        if (l.includes(`
`) && u2n.test(l)) {
          t ??= {
            ok: false,
            kind: "newline-hash",
            reason: "Newline followed by # inside a quoted argument can hide arguments from path validation"
          };
        }
      }
      for (let l of n.envVars) {
        if (l.value.includes(`
`) && u2n.test(l.value)) {
          t ??= {
            ok: false,
            kind: "newline-hash",
            reason: "Newline followed by # inside an env var value can hide arguments from path validation"
          };
        }
      }
      for (let l of n.redirects) {
        if (l.target.includes(`
`) && u2n.test(l.target)) {
          t ??= {
            ok: false,
            kind: "newline-hash",
            reason: "Newline followed by # inside a redirect target can hide arguments from path validation"
          };
        }
      }
    }
    if (t) {
      return t;
    }
    return {
      ok: true
    };
  }
  var Gua;
  var Vua;
  var Zlo;
  var Uua;
  var uhp;
  var dhp;
  var php;
  var eco;
  var mhp;
  var Kua;
  var fhp;
  var Bua;
  var tco;
  var nco;
  var rco;
  var dco;
  var pco;
  var hhp;
  var mco;
  var fco;
  var hco;
  var p2n;
  var m2n;
  var gco;
  var ghp;
  var $ua;
  var ico;
  var Qua;
  var Zua;
  var vhp;
  var tda;
  var h2n;
  var bco;
  var v3t;
  var w3t;
  var g2n;
  var d2n;
  var Rhp;
  var E3t;
  var Sco;
  var Cdt;
  var m9e;
  var Tco;
  var jua;
  var C3t;
  var Eco;
  var vco;
  var xhp;
  var wco;
  var vdt;
  var qua;
  var Wua;
  var khp;
  var Ahp;
  var uco;
  var u2n;
  var noe = __lazy(() => {
    s1();
    iTe();
    VOe();
    Gua = require("os");
    Vua = new Set(["program", "list", "pipeline", "redirected_statement"]);
    Zlo = new Set(["&&", "||", "|", ";", "&", "|&", `
`]);
    Uua = /[ \t\n*?[]/;
    uhp = /^-[ioe]$/;
    dhp = /^-[ioe]./;
    php = /^--(input|output|error)=/;
    eco = new Set(["HOME", "PWD", "OLDPWD", "USER", "LOGNAME", "SHELL", "PATH", "HOSTNAME", "UID", "EUID", "PPID", "RANDOM", "SECONDS", "LINENO", "TMPDIR", "BASH_VERSION", "BASHPID", "SHLVL", "HISTFILE", "IFS"]);
    mhp = new Set(["?", "$", "!", "#", "0", "-"]);
    Kua = new Set(["command_substitution", "process_substitution", "expansion", "simple_expansion", "brace_expression", "subshell", "compound_statement", "for_statement", "while_statement", "until_statement", "if_statement", "case_statement", "function_definition", "test_command", "ansi_c_string", "translated_string", "herestring_redirect", "heredoc_redirect"]);
    fhp = [...Kua];
    Bua = {
      ">": ">",
      ">>": ">>",
      "<": "<",
      ">&": ">&",
      "<&": "<&",
      ">|": ">|",
      "&>": "&>",
      "&>>": "&>>",
      "<<<": "<<<"
    };
    tco = /\{[^\s]*(,|\.\.)[^\s]*\}/;
    nco = /\{[^{]*\\}/;
    rco = /\{[^}]*\\\{/;
    dco = /[\x00-\x08\x0B-\x1F\x7F]/;
    pco = /[\uD800-\uDBFF](?![\uDC00-\uDFFF])|(?<![\uD800-\uDBFF])[\uDC00-\uDFFF]/;
    hhp = /[\u00A0\u1680\u2000-\u200B\u2028\u2029\u202F\u205F\u3000\uFEFF]/;
    mco = /\\[ \t]|(?:^|[^ \t\\])(?:\\\\)*\\\n|[ \t](?:\\\\)+\\\n/;
    fco = /(?:^|[^\\])(?:\\\\)*[`$]/;
    hco = /(?:^|[^\\])(?:\\\\)*['"]/;
    p2n = /~\[/;
    m2n = /(?:^|[\s;&|])=[a-zA-Z_]/;
    gco = /<\d*-\d*>/;
    ghp = /\{[^}]*['"]/;
    $ua = String.fromCharCode(36);
    ico = new Set(["command", "builtin", "noglob", "nocorrect", "time"]);
    Qua = new Set(["declare", "typeset", "local", "export", "readonly"]);
    Zua = new Set([":", "break", "continue", "return", "exit", "shift", "times", "set", "export", "readonly", "unset"]);
    vhp = /^(?:[0-9]+|0[xX][0-9a-fA-F]+|[0-9]+#[0-9a-zA-Z]+|[-+*/%^&|~!<>=?:(),]+|<<|>>|\*\*|&&|\|\||[<>=!]=|\$\(\(|\)\))$/;
    tda = new Set(["_", "RANDOM", "SECONDS", "LINENO", "BASH_COMMAND", "FUNCNAME", "EPOCHSECONDS", "EPOCHREALTIME", "SRANDOM", "BASHPID", "REPLY", "reply", "PIPESTATUS", "pipestatus", "BASH_SOURCE", "DIRSTACK", "GROUPS", "BASH_ARGV", "BASH_ARGC", "BASH_SUBSHELL", "BASH_LINENO", "BASH_REMATCH", "MATCH", "match", "MBEGIN", "MEND", "mbegin", "mend", "OPTARG", "OPTIND", "argv", "FIGNORE", "fignore", "PSVAR", "psvar", "WATCH", "watch", "HISTCHARS", "histchars", "PS1", "PROMPT", "prompt", "PS2", "PROMPT2", "PS3", "PROMPT3", "PS4", "PROMPT4", "RPS1", "RPROMPT", "RPS2", "RPROMPT2"]);
    h2n = new Set(["zmodload", "emulate", "sysopen", "sysread", "syswrite", "sysseek", "zpty", "ztcp", "zsocket", "zf_rm", "zf_mv", "zf_ln", "zf_chmod", "zf_chown", "zf_mkdir", "zf_rmdir", "zf_chgrp", "repeat", "foreach", "zcompile", "setopt", "unsetopt", "disable", "shopt"]);
    bco = new Set(["-exec", "-execdir", "-ok", "-okdir", "-delete", "-fprint", "-fprint0", "-fprintf", "-fls", "-files0-from"]);
    v3t = new Set(["-name", "-iname", "-path", "-ipath", "-lname", "-ilname", "-regex", "-iregex", "-wholename", "-iwholename", "-samefile", "-newer", "-anewer", "-cnewer", "-mnewer", "-perm", "-user", "-group", "-uid", "-gid", "-size", "-type", "-xtype", "-fstype", "-inum", "-links", "-used", "-context", "-amin", "-cmin", "-mmin", "-atime", "-ctime", "-mtime", "-mindepth", "-maxdepth", "-printf", "-regextype", "-D", "-f", "-flags", "-Bnewer", "-Btime", "-Bmin", "-files0-from", "-xattrname"]);
    w3t = /^-newer[aBcm][aBcmt]$/;
    g2n = new Set(["eval", "source", ".", "exec", "nocorrect", "fc", "coproc", "trap", "enable", "mapfile", "readarray", "hash", "bind", "complete", "compgen", "alias", "let"]);
    d2n = new Set(["awk", "gawk", "mawk", "nawk"]);
    Rhp = /^(?:-[FvW]$|--(?:fie|a$|as))/;
    E3t = new Set(["watch", "ionice", "chrt", "setsid", "taskset", "strace", "ltrace", "script", "flock", "unshare", "nsenter"]);
    Sco = {
      test: new Set(["-v", "-R", "-t"]),
      "[": new Set(["-v", "-R", "-t"]),
      "[[": new Set(["-v", "-R", "-t"]),
      printf: new Set(["-v"]),
      read: new Set(["-a"]),
      unset: new Set(["-v"]),
      wait: new Set(["-p"])
    };
    Cdt = new Set(["-eq", "-ne", "-lt", "-le", "-gt", "-ge"]);
    m9e = /^-?(0[xX][0-9a-fA-F]+|[0-9]+#[0-9a-zA-Z]+|[0-9]+)$/;
    Tco = new Set(["read", "unset"]);
    jua = new Set(["declare", "typeset", "local", "export", "readonly", "private", "float", "integer"]);
    C3t = new Set(["declare", "typeset", "local", "export", "readonly", "print", "getopts", "set", "zparseopts", "zformat", "zstyle", "autoload", "shift", "exit", "return", "break", "continue", "bye", "logout", "vared", "private", "getln", "zregexparse", "float", "integer"]);
    Eco = new Set(["pipefail", "errexit", "nounset", "xtrace", "noglob", "noclobber", "verbose", "monitor", "notify", "vi", "emacs", "errtrace", "functrace", "hashall", "physical", "ignoreeof"]);
    vco = new Set(["e", "u", "x", "f", "C", "v", "m", "b", "E", "T", "h", "P", "n"]);
    xhp = new Set(["path", "home", "tmpprefix", "bash_env", "env", "cdpath", "globignore", "shell", "fpath", "bash_loadables_path", "module_path", "manpath", "mailpath", "readnullcmd", "nullcmd", "histfile", "zdotdir", "functions", "commands", "aliases", "galiases", "saliases", "lang", "language", "lc_all", "lc_ctype", "lc_collate", "lc_messages", "lc_numeric", "lc_time", "histchars", "textdomain", "textdomaindir"]);
    wco = new Set(["RANDOM", "SECONDS", "LINENO", "OPTIND", "MAILCHECK", "HISTCMD", "SRANDOM", "EPOCHSECONDS", "EPOCHREALTIME", "COLUMNS", "LINES", "SHLVL", "ERRNO", "TMOUT", "HISTSIZE", "SAVEHIST", "TRY_BLOCK_ERROR", "TRY_BLOCK_INTERRUPT", "KEYTIMEOUT", "LISTMAX", "LOGCHECK", "PERIOD", "FUNCNEST", "UID", "EUID", "GID", "EGID", "ZLE_RPROMPT_INDENT", "MBEGIN", "MEND", "PPID", "ARGC", "ZSH_SUBSHELL", "TTYIDLE", "status"]);
    vdt = new Set(["-p", "-d", "-n", "-N", "-t", "-u", "-i"]);
    qua = new Set(["-t", "-n", "-N"]);
    Wua = /^(?:[0-9]+(?:\.[0-9]+)?|\.[0-9]+)$/;
    khp = /^[A-Za-z_][A-Za-z0-9_]*\[/;
    Ahp = new Set(["-f", "-C", "-x", "-X", "-u"]);
    uco = /\/proc\/.*\/environ/;
    u2n = /\n\s*#/;
  });
  function Ihp(e) {
    return e.includes("signature");
  }
  function Ohp(e) {
    if (e === "") {
      return false;
    }
    if (e.includes("%")) {
      return false;
    }
    if (e.startsWith("format:") || e.startsWith("tformat:")) {
      return false;
    }
    return !Php.vZc(e);
  }
  function KOe(e) {
    let t = n => Up(n) || cda.test(n) || Ihp(n);
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      if (cda.test(r)) {
        return true;
      }
      for (let o of ["--format", "--pretty", "--sort"]) {
        let s;
        if (r === o && n + 1 < e.length) {
          s = e[n + 1];
        } else if (r.startsWith(`${o}=`)) {
          s = r.slice(o.length + 1);
        }
        if (s === undefined) {
          continue;
        }
        if (t(s)) {
          return true;
        }
        if (o !== "--sort" && Ohp(s)) {
          return true;
        }
      }
    }
    return false;
  }
  function iU(e, t) {
    for (let n of t) {
      if (!n) {
        continue;
      }
      let r = n;
      if (n.startsWith("-")) {
        let s = n.indexOf("=");
        if (s === -1) {
          continue;
        }
        if (r = n.slice(s + 1), !r) {
          continue;
        }
      }
      if (Up(r)) {
        return true;
      }
      if (!r.includes("/") && !r.includes("://") && !r.includes("@")) {
        continue;
      }
      if (r.includes("://")) {
        return true;
      }
      if (r.includes("@")) {
        return true;
      }
      if ((r.match(/\//g) || []).length >= 2) {
        return true;
      }
    }
    return false;
  }
  function T2n(e) {
    return e.some(t => {
      if (pda.some(r => t === r || t.startsWith(`${r}=`) || r.length === 2 && t.length > 2 && t.startsWith(r))) {
        return true;
      }
      let n = t.match(/^-([A-Za-z]+)/)?.[1];
      if (n !== undefined && n.length >= 2) {
        for (let r of n) {
          if (Dhp.vZc(r)) {
            return true;
          }
        }
      }
      return false;
    });
  }
  function HI(e, t = false) {
    if (Wt() !== "windows") {
      return false;
    }
    if (t && /^[\\/]{2}/.test(e)) {
      return true;
    }
    if (/\\\\[^ \t\r\n\f\v\\/]+(?:@(?:\d+|ssl))?(?:[\\/]|$|\s)/i.test(e)) {
      return true;
    }
    if (/(?<!:)\/\/[^ \t\r\n\f\v\\/]+(?:@(?:\d+|ssl))?(?:[\\/]|$|\s)/i.test(e)) {
      return true;
    }
    if ((t ? /(?<![:\w])\/\\{1,}[^ \t\r\n\f\v\\/]+[\\/]/ : /\/\\{2,}[^ \t\r\n\f\v\\/]/).test(e)) {
      return true;
    }
    if ((t ? /(?<![:\w])\\{1,}\/[^ \t\r\n\f\v\\/]+[\\/]/ : /\\{2,}\/[^ \t\r\n\f\v\\/]/).test(e)) {
      return true;
    }
    if (/@SSL@\d+/i.test(e) || /@\d+@SSL/i.test(e)) {
      return true;
    }
    if (/DavWWWRoot/i.test(e)) {
      return true;
    }
    if (/^\\\\(\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})[\\/]/.test(e) || /^\/\/(\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3})[\\/]/.test(e)) {
      return true;
    }
    if (/^\\\\(\[[\da-fA-F:]+\])[\\/]/.test(e) || /^\/\/(\[[\da-fA-F:]+\])[\\/]/.test(e)) {
      return true;
    }
    return false;
  }
  function dda(e, t) {
    switch (t) {
      case "none":
        return false;
      case "number":
        return /^\d+$/.test(e);
      case "string":
        return true;
      case "char":
        return e.length === 1;
      case "{}":
        return e === "{}";
      case "EOF":
        return e === "EOF";
      default:
        return false;
    }
  }
  function Rdt(e, t, n, r) {
    let o = t;
    while (o < e.length) {
      let s = e[o];
      if (!s) {
        o++;
        continue;
      }
      if (r?.xargsTargetCommands && r.commandName === "xargs" && (!s.startsWith("-") || s === "--")) {
        if (s === "--" && o + 1 < e.length) {
          o++;
          s = e[o];
        }
        if (s && r.xargsTargetCommands.includes(s)) {
          break;
        }
        return false;
      }
      if (s === "--") {
        if (n.respectsDoubleDash !== false) {
          o++;
          break;
        }
        o++;
        continue;
      }
      if (s.startsWith("-") && s.length > 1 && uda.test(s)) {
        let i = s.includes("=");
        let [a, ...l] = s.split("=");
        let c = l.join("=");
        if (!a) {
          return false;
        }
        let u = n.safeFlags[a];
        if (!u) {
          if (r?.commandName === "git" && a.match(/^-\d+$/)) {
            o++;
            continue;
          }
          if ((r?.commandName === "grep" || r?.commandName === "egrep" || r?.commandName === "fgrep" || r?.commandName === "rg") && a.startsWith("-") && !a.startsWith("--") && a.length > 2) {
            let d = a.substring(0, 2);
            let p = a.substring(2);
            if (n.safeFlags[d] && /^\d+$/.test(p)) {
              let m = n.safeFlags[d];
              if (m === "number" || m === "string") {
                if (dda(p, m)) {
                  o++;
                  continue;
                } else {
                  return false;
                }
              }
            }
          }
          if (a.startsWith("-") && !a.startsWith("--") && a.length > 2) {
            for (let d = 1; d < a.length; d++) {
              let p = "-" + a[d];
              let m = n.safeFlags[p];
              if (!m) {
                return false;
              }
              if (m !== "none") {
                return false;
              }
            }
            o++;
            continue;
          } else {
            return false;
          }
        }
        if (u === "none") {
          if (i) {
            return false;
          }
          o++;
        } else {
          let d;
          if (i) {
            d = c;
            o++;
          } else {
            if (o + 1 >= e.length || e[o + 1] && e[o + 1].startsWith("-") && e[o + 1].length > 1 && uda.test(e[o + 1])) {
              return false;
            }
            d = e[o + 1] || "";
            o += 2;
          }
          if (zua(d)) {
            return false;
          }
          if (u === "string" && d.startsWith("-")) {
            if (a === "--sort" && r?.commandName === "git" && d.match(/^-[a-zA-Z]/)) {
              ;
            } else {
              return false;
            }
          }
          if (!dda(d, u)) {
            return false;
          }
        }
      } else {
        if (Up(s)) {
          return false;
        }
        o++;
      }
    }
    return true;
  }
  var R3t;
  var y2n;
  var _2n;
  var b2n;
  var S2n;
  var x3t;
  var Cco;
  var Rco;
  var cda;
  var Php;
  var k3t;
  var A3t;
  var pda;
  var Dhp;
  var E2n;
  var mda;
  var fda;
  var v2n;
  var uda;
  var pde = __lazy(() => {
    noe();
    Cs();
    Zn();
    R3t = {
      "--all": "none",
      "--branches": "none",
      "--tags": "none",
      "--remotes": "none"
    };
    y2n = {
      "--since": "string",
      "--after": "string",
      "--until": "string",
      "--before": "string"
    };
    _2n = {
      "--oneline": "none",
      "--graph": "none",
      "--decorate": "none",
      "--no-decorate": "none",
      "--date": "string",
      "--relative-date": "none"
    };
    b2n = {
      "--max-count": "number",
      "-n": "number"
    };
    S2n = {
      "--stat": "none",
      "--numstat": "none",
      "--shortstat": "none",
      "--name-only": "none",
      "--name-status": "none"
    };
    x3t = {
      "--color": "none",
      "--no-color": "none"
    };
    Cco = {
      "--patch": "none",
      "-p": "none",
      "--no-patch": "none",
      "--no-ext-diff": "none",
      "-s": "none"
    };
    Rco = {
      "--author": "string",
      "--committer": "string",
      "--grep": "string"
    };
    cda = /%[-+ ]?G|%\(\*?signature/;
    Php = new Set(["oneline", "short", "medium", "full", "fuller", "email", "raw"]);
    k3t = {
      "git diff": {
        safeFlags: {
          ...S2n,
          ...x3t,
          "--dirstat": "none",
          "--summary": "none",
          "--patch-with-stat": "none",
          "--word-diff": "none",
          "--word-diff-regex": "string",
          "--color-words": "none",
          "--no-renames": "none",
          "--no-ext-diff": "none",
          "--check": "none",
          "--ws-error-highlight": "string",
          "--full-index": "none",
          "--binary": "none",
          "--abbrev": "number",
          "--break-rewrites": "none",
          "--find-renames": "none",
          "--find-copies": "none",
          "--find-copies-harder": "none",
          "--irreversible-delete": "none",
          "--diff-algorithm": "string",
          "--histogram": "none",
          "--patience": "none",
          "--minimal": "none",
          "--ignore-space-at-eol": "none",
          "--ignore-space-change": "none",
          "--ignore-all-space": "none",
          "--ignore-blank-lines": "none",
          "--inter-hunk-context": "number",
          "--function-context": "none",
          "--exit-code": "none",
          "--quiet": "none",
          "--cached": "none",
          "--staged": "none",
          "--pickaxe-regex": "none",
          "--pickaxe-all": "none",
          "--no-index": "none",
          "--relative": "string",
          "--diff-filter": "string",
          "-p": "none",
          "-u": "none",
          "-s": "none",
          "-M": "none",
          "-C": "none",
          "-B": "none",
          "-D": "none",
          "-l": "none",
          "-S": "string",
          "-G": "string",
          "-O": "string",
          "-R": "none"
        }
      },
      "git log": {
        safeFlags: {
          ..._2n,
          ...R3t,
          ...y2n,
          ...b2n,
          ...S2n,
          ...x3t,
          ...Cco,
          ...Rco,
          "--abbrev-commit": "none",
          "--full-history": "none",
          "--dense": "none",
          "--sparse": "none",
          "--simplify-merges": "none",
          "--ancestry-path": "none",
          "--source": "none",
          "--first-parent": "none",
          "--merges": "none",
          "--no-merges": "none",
          "--reverse": "none",
          "--walk-reflogs": "none",
          "--skip": "number",
          "--max-age": "number",
          "--min-age": "number",
          "--no-min-parents": "none",
          "--no-max-parents": "none",
          "--follow": "none",
          "--no-walk": "none",
          "--left-right": "none",
          "--cherry-mark": "none",
          "--cherry-pick": "none",
          "--boundary": "none",
          "--topo-order": "none",
          "--date-order": "none",
          "--author-date-order": "none",
          "--pretty": "string",
          "--format": "string",
          "--diff-filter": "string",
          "-S": "string",
          "-G": "string",
          "--pickaxe-regex": "none",
          "--pickaxe-all": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => KOe(t)
      },
      "git show": {
        safeFlags: {
          ..._2n,
          ...S2n,
          ...x3t,
          ...Cco,
          "--abbrev-commit": "none",
          "--word-diff": "none",
          "--word-diff-regex": "string",
          "--color-words": "none",
          "--pretty": "string",
          "--format": "string",
          "--first-parent": "none",
          "--raw": "none",
          "--diff-filter": "string",
          "-m": "none",
          "--quiet": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => KOe(t)
      },
      "git shortlog": {
        safeFlags: {
          ...R3t,
          ...y2n,
          "-s": "none",
          "--summary": "none",
          "-n": "none",
          "--numbered": "none",
          "-e": "none",
          "--email": "none",
          "-c": "none",
          "--committer": "none",
          "--group": "string",
          "--format": "string",
          "--no-merges": "none",
          "--author": "string"
        },
        additionalCommandIsDangerousCallback: (e, t) => KOe(t)
      },
      "git reflog": {
        safeFlags: {
          ..._2n,
          ...R3t,
          ...y2n,
          ...b2n,
          ...Rco
        },
        additionalCommandIsDangerousCallback: (e, t) => {
          let n = new Set(["show", "list"]);
          let r = new Set(["expire", "delete", "exists", "drop", "write"]);
          let o = t[0];
          if (o && !o.startsWith("-") && !n.vZc(o)) {
            return true;
          }
          for (let s of t) {
            if (r.vZc(s)) {
              return true;
            }
          }
          return false;
        }
      },
      "git stash list": {
        safeFlags: {
          ..._2n,
          ...R3t,
          ...b2n
        }
      },
      "git ls-remote": {
        safeFlags: {
          "--branches": "none",
          "-b": "none",
          "--tags": "none",
          "-t": "none",
          "--heads": "none",
          "-h": "none",
          "--refs": "none",
          "--quiet": "none",
          "-q": "none",
          "--exit-code": "none",
          "--get-url": "none",
          "--symref": "none",
          "--sort": "string"
        },
        additionalCommandIsDangerousCallback: (e, t) => {
          if (KOe(t)) {
            return true;
          }
          let n = false;
          for (let r = 0; r < t.length; r++) {
            let o = t[r];
            if (!n && o === "--") {
              n = true;
              continue;
            }
            if (!n && (!o || o.startsWith("-"))) {
              if (o === "--sort") {
                r++;
              }
              continue;
            }
            return true;
          }
          return false;
        }
      },
      "git status": {
        safeFlags: {
          "--short": "none",
          "-s": "none",
          "--branch": "none",
          "-b": "none",
          "--porcelain": "none",
          "--long": "none",
          "--verbose": "none",
          "-v": "none",
          "--untracked-files": "string",
          "-u": "string",
          "--ignored": "none",
          "--ignore-submodules": "string",
          "--column": "none",
          "--no-column": "none",
          "--ahead-behind": "none",
          "--no-ahead-behind": "none",
          "--renames": "none",
          "--no-renames": "none",
          "--find-renames": "string",
          "-M": "string"
        }
      },
      "git blame": {
        safeFlags: {
          ...x3t,
          "-L": "string",
          "--porcelain": "none",
          "-p": "none",
          "--line-porcelain": "none",
          "--incremental": "none",
          "--root": "none",
          "--show-stats": "none",
          "--show-name": "none",
          "--show-number": "none",
          "-n": "none",
          "--show-email": "none",
          "-e": "none",
          "-f": "none",
          "--date": "string",
          "-w": "none",
          "--ignore-rev": "string",
          "--ignore-revs-file": "string",
          "-M": "none",
          "-C": "none",
          "--score-debug": "none",
          "--abbrev": "number",
          "-s": "none",
          "-l": "none",
          "-t": "none"
        }
      },
      "git ls-files": {
        safeFlags: {
          "--cached": "none",
          "-c": "none",
          "--deleted": "none",
          "-d": "none",
          "--modified": "none",
          "-m": "none",
          "--others": "none",
          "-o": "none",
          "--ignored": "none",
          "-i": "none",
          "--stage": "none",
          "-s": "none",
          "--killed": "none",
          "-k": "none",
          "--unmerged": "none",
          "-u": "none",
          "--directory": "none",
          "--no-empty-directory": "none",
          "--eol": "none",
          "--full-name": "none",
          "--abbrev": "number",
          "--debug": "none",
          "-z": "none",
          "-t": "none",
          "-v": "none",
          "-f": "none",
          "--exclude": "string",
          "-x": "string",
          "--exclude-from": "string",
          "-X": "string",
          "--exclude-per-directory": "string",
          "--exclude-standard": "none",
          "--error-unmatch": "none",
          "--recurse-submodules": "none"
        }
      },
      "git config --get": {
        safeFlags: {
          "--local": "none",
          "--global": "none",
          "--system": "none",
          "--worktree": "none",
          "--default": "string",
          "--type": "string",
          "--bool": "none",
          "--int": "none",
          "--bool-or-int": "none",
          "--path": "none",
          "--expiry-date": "none",
          "-z": "none",
          "--null": "none",
          "--name-only": "none",
          "--show-origin": "none",
          "--show-scope": "none"
        }
      },
      "git remote show": {
        safeFlags: {
          "-n": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => {
          let n = t.indexOf("--");
          let r = n === -1 ? t : t.slice(0, n);
          let o = n === -1 ? [] : t.slice(n + 1);
          let s = r.filter(i => i !== "-n").concat(o);
          if (s.length !== 1) {
            return true;
          }
          if (!r.includes("-n")) {
            return true;
          }
          return !/^[a-zA-Z0-9_][a-zA-Z0-9_-]*$/.test(s[0]);
        }
      },
      "git remote": {
        safeFlags: {
          "-v": "none",
          "--verbose": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => t.some(n => n !== "-v" && n !== "--verbose")
      },
      "git merge-base": {
        safeFlags: {
          "--is-ancestor": "none",
          "--fork-point": "none",
          "--octopus": "none",
          "--independent": "none",
          "--all": "none"
        }
      },
      "git rev-parse": {
        safeFlags: {
          "--verify": "none",
          "--short": "string",
          "--abbrev-ref": "none",
          "--symbolic": "none",
          "--symbolic-full-name": "none",
          "--show-toplevel": "none",
          "--show-cdup": "none",
          "--show-prefix": "none",
          "--git-dir": "none",
          "--git-common-dir": "none",
          "--absolute-git-dir": "none",
          "--show-superproject-working-tree": "none",
          "--is-inside-work-tree": "none",
          "--is-inside-git-dir": "none",
          "--is-bare-repository": "none",
          "--is-shallow-repository": "none",
          "--is-shallow-update": "none",
          "--path-prefix": "none"
        }
      },
      "git rev-list": {
        safeFlags: {
          ...R3t,
          ...y2n,
          ...b2n,
          ...Rco,
          "--count": "none",
          "--reverse": "none",
          "--first-parent": "none",
          "--ancestry-path": "none",
          "--merges": "none",
          "--no-merges": "none",
          "--min-parents": "number",
          "--max-parents": "number",
          "--no-min-parents": "none",
          "--no-max-parents": "none",
          "--skip": "number",
          "--max-age": "number",
          "--min-age": "number",
          "--walk-reflogs": "none",
          "--oneline": "none",
          "--abbrev-commit": "none",
          "--pretty": "string",
          "--format": "string",
          "--abbrev": "number",
          "--full-history": "none",
          "--dense": "none",
          "--sparse": "none",
          "--source": "none",
          "--graph": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => KOe(t)
      },
      "git describe": {
        safeFlags: {
          "--tags": "none",
          "--match": "string",
          "--exclude": "string",
          "--long": "none",
          "--abbrev": "number",
          "--always": "none",
          "--contains": "none",
          "--first-match": "none",
          "--exact-match": "none",
          "--candidates": "number",
          "--dirty": "none",
          "--broken": "none"
        }
      },
      "git cat-file": {
        safeFlags: {
          "-t": "none",
          "-s": "none",
          "-p": "none",
          "-e": "none",
          "--batch-check": "none",
          "--allow-undetermined-type": "none"
        }
      },
      "git for-each-ref": {
        safeFlags: {
          "--format": "string",
          "--sort": "string",
          "--count": "number",
          "--contains": "string",
          "--no-contains": "string",
          "--merged": "string",
          "--no-merged": "string",
          "--points-at": "string"
        },
        additionalCommandIsDangerousCallback: (e, t) => KOe(t)
      },
      "git grep": {
        safeFlags: {
          "-e": "string",
          "-E": "none",
          "--extended-regexp": "none",
          "-G": "none",
          "--basic-regexp": "none",
          "-F": "none",
          "--fixed-strings": "none",
          "-P": "none",
          "--perl-regexp": "none",
          "-i": "none",
          "--ignore-case": "none",
          "-v": "none",
          "--invert-match": "none",
          "-w": "none",
          "--word-regexp": "none",
          "-n": "none",
          "--line-number": "none",
          "-c": "none",
          "--count": "none",
          "-l": "none",
          "--files-with-matches": "none",
          "-L": "none",
          "--files-without-match": "none",
          "-h": "none",
          "-H": "none",
          "--heading": "none",
          "--break": "none",
          "--full-name": "none",
          "--color": "none",
          "--no-color": "none",
          "-o": "none",
          "--only-matching": "none",
          "-A": "number",
          "--after-context": "number",
          "-B": "number",
          "--before-context": "number",
          "-C": "number",
          "--context": "number",
          "--and": "none",
          "--or": "none",
          "--not": "none",
          "--max-depth": "number",
          "--untracked": "none",
          "--no-index": "none",
          "--recurse-submodules": "none",
          "--cached": "none",
          "--threads": "number",
          "-q": "none",
          "--quiet": "none"
        }
      },
      "git stash show": {
        safeFlags: {
          ...S2n,
          ...x3t,
          ...Cco,
          "--word-diff": "none",
          "--word-diff-regex": "string",
          "--diff-filter": "string",
          "--abbrev": "number"
        }
      },
      "git worktree list": {
        safeFlags: {
          "--porcelain": "none",
          "-v": "none",
          "--verbose": "none",
          "--expire": "string"
        }
      },
      "git tag": {
        safeFlags: {
          "-l": "none",
          "--list": "none",
          "-n": "number",
          "--contains": "string",
          "--no-contains": "string",
          "--merged": "string",
          "--no-merged": "string",
          "--sort": "string",
          "--format": "string",
          "--points-at": "string",
          "--column": "none",
          "--no-column": "none",
          "-i": "none",
          "--ignore-case": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => {
          if (KOe(t)) {
            return true;
          }
          let n = new Set(["--contains", "--no-contains", "--merged", "--no-merged", "--points-at", "--sort", "--format", "-n"]);
          let r = 0;
          let o = false;
          let s = false;
          while (r < t.length) {
            let i = t[r];
            if (!i) {
              r++;
              continue;
            }
            if (i === "--" && !s) {
              s = true;
              r++;
              continue;
            }
            if (!s && i.startsWith("-")) {
              if (i === "--list" || i === "-l") {
                o = true;
              } else if (i[0] === "-" && i[1] !== "-" && i.length > 2 && !i.includes("=") && i.slice(1).includes("l")) {
                o = true;
              }
              if (i.includes("=")) {
                r++;
              } else if (n.vZc(i)) {
                r += 2;
              } else {
                r++;
              }
            } else {
              if (!o) {
                return true;
              }
              r++;
            }
          }
          return false;
        }
      },
      "git branch": {
        safeFlags: {
          "-l": "none",
          "--list": "none",
          "-a": "none",
          "--all": "none",
          "-r": "none",
          "--remotes": "none",
          "-v": "none",
          "-vv": "none",
          "--verbose": "none",
          "--color": "none",
          "--no-color": "none",
          "--column": "none",
          "--no-column": "none",
          "--abbrev": "number",
          "--no-abbrev": "none",
          "--contains": "string",
          "--no-contains": "string",
          "--merged": "none",
          "--no-merged": "none",
          "--points-at": "string",
          "--sort": "string",
          "--show-current": "none",
          "-i": "none",
          "--ignore-case": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => {
          if (KOe(t)) {
            return true;
          }
          let n = new Set(["--contains", "--no-contains", "--points-at", "--sort"]);
          let r = new Set(["--merged", "--no-merged"]);
          let o = 0;
          let s = "";
          let i = false;
          let a = false;
          while (o < t.length) {
            let l = t[o];
            if (!l) {
              o++;
              continue;
            }
            if (l === "--" && !a) {
              a = true;
              s = "";
              o++;
              continue;
            }
            if (!a && l.startsWith("-")) {
              if (l === "--list" || l === "-l") {
                i = true;
              } else if (l[0] === "-" && l[1] !== "-" && l.length > 2 && !l.includes("=") && l.slice(1).includes("l")) {
                i = true;
              }
              if (l.includes("=")) {
                s = ii(l, "=");
                o++;
              } else if (n.vZc(l)) {
                s = l;
                o += 2;
              } else {
                s = l;
                o++;
              }
            } else {
              let c = r.vZc(s);
              if (!i && !c) {
                return true;
              }
              o++;
            }
          }
          return false;
        }
      }
    };
    A3t = {
      "gh pr view": {
        safeFlags: {
          "--json": "string",
          "--comments": "none",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh pr list": {
        safeFlags: {
          "--state": "string",
          "-s": "string",
          "--author": "string",
          "--assignee": "string",
          "--label": "string",
          "--limit": "number",
          "-L": "number",
          "--base": "string",
          "--head": "string",
          "--search": "string",
          "--json": "string",
          "--draft": "none",
          "--app": "string",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh pr diff": {
        safeFlags: {
          "--color": "string",
          "--name-only": "none",
          "--patch": "none",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh pr checks": {
        safeFlags: {
          "--watch": "none",
          "--required": "none",
          "--fail-fast": "none",
          "--json": "string",
          "--interval": "number",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh issue view": {
        safeFlags: {
          "--json": "string",
          "--comments": "none",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh issue list": {
        safeFlags: {
          "--state": "string",
          "-s": "string",
          "--assignee": "string",
          "--author": "string",
          "--label": "string",
          "--limit": "number",
          "-L": "number",
          "--milestone": "string",
          "--search": "string",
          "--json": "string",
          "--app": "string",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh repo view": {
        safeFlags: {
          "--json": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh run list": {
        safeFlags: {
          "--branch": "string",
          "-b": "string",
          "--status": "string",
          "-s": "string",
          "--workflow": "string",
          "-w": "string",
          "--limit": "number",
          "-L": "number",
          "--json": "string",
          "--repo": "string",
          "-R": "string",
          "--event": "string",
          "-e": "string",
          "--user": "string",
          "-u": "string",
          "--created": "string",
          "--commit": "string",
          "-c": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh run view": {
        safeFlags: {
          "--log": "none",
          "--log-failed": "none",
          "--exit-status": "none",
          "--verbose": "none",
          "-v": "none",
          "--json": "string",
          "--repo": "string",
          "-R": "string",
          "--job": "string",
          "-j": "string",
          "--attempt": "number",
          "-a": "number"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh auth status": {
        safeFlags: {
          "--active": "none",
          "-a": "none",
          "--hostname": "string",
          "-h": "string",
          "--json": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh pr status": {
        safeFlags: {
          "--conflict-status": "none",
          "-c": "none",
          "--json": "string",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh issue status": {
        safeFlags: {
          "--json": "string",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh release list": {
        safeFlags: {
          "--exclude-drafts": "none",
          "--exclude-pre-releases": "none",
          "--json": "string",
          "--limit": "number",
          "-L": "number",
          "--order": "string",
          "-O": "string",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh release view": {
        safeFlags: {
          "--json": "string",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh workflow list": {
        safeFlags: {
          "--all": "none",
          "-a": "none",
          "--json": "string",
          "--limit": "number",
          "-L": "number",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh workflow view": {
        safeFlags: {
          "--ref": "string",
          "-r": "string",
          "--yaml": "none",
          "-y": "none",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh label list": {
        safeFlags: {
          "--json": "string",
          "--limit": "number",
          "-L": "number",
          "--order": "string",
          "--search": "string",
          "-S": "string",
          "--sort": "string",
          "--repo": "string",
          "-R": "string"
        },
        additionalCommandIsDangerousCallback: iU
      },
      "gh search repos": {
        safeFlags: {
          "--archived": "none",
          "--created": "string",
          "--followers": "string",
          "--forks": "string",
          "--good-first-issues": "string",
          "--help-wanted-issues": "string",
          "--include-forks": "string",
          "--json": "string",
          "--language": "string",
          "--license": "string",
          "--limit": "number",
          "-L": "number",
          "--match": "string",
          "--number-topics": "string",
          "--order": "string",
          "--owner": "string",
          "--size": "string",
          "--sort": "string",
          "--stars": "string",
          "--topic": "string",
          "--updated": "string",
          "--visibility": "string"
        }
      },
      "gh search issues": {
        safeFlags: {
          "--app": "string",
          "--assignee": "string",
          "--author": "string",
          "--closed": "string",
          "--commenter": "string",
          "--comments": "string",
          "--created": "string",
          "--include-prs": "none",
          "--interactions": "string",
          "--involves": "string",
          "--json": "string",
          "--label": "string",
          "--language": "string",
          "--limit": "number",
          "-L": "number",
          "--locked": "none",
          "--match": "string",
          "--mentions": "string",
          "--milestone": "string",
          "--no-assignee": "none",
          "--no-label": "none",
          "--no-milestone": "none",
          "--no-project": "none",
          "--order": "string",
          "--owner": "string",
          "--project": "string",
          "--reactions": "string",
          "--repo": "string",
          "-R": "string",
          "--sort": "string",
          "--state": "string",
          "--team-mentions": "string",
          "--updated": "string",
          "--visibility": "string"
        }
      },
      "gh search prs": {
        safeFlags: {
          "--app": "string",
          "--assignee": "string",
          "--author": "string",
          "--base": "string",
          "-B": "string",
          "--checks": "string",
          "--closed": "string",
          "--commenter": "string",
          "--comments": "string",
          "--created": "string",
          "--draft": "none",
          "--head": "string",
          "-H": "string",
          "--interactions": "string",
          "--involves": "string",
          "--json": "string",
          "--label": "string",
          "--language": "string",
          "--limit": "number",
          "-L": "number",
          "--locked": "none",
          "--match": "string",
          "--mentions": "string",
          "--merged": "none",
          "--merged-at": "string",
          "--milestone": "string",
          "--no-assignee": "none",
          "--no-label": "none",
          "--no-milestone": "none",
          "--no-project": "none",
          "--order": "string",
          "--owner": "string",
          "--project": "string",
          "--reactions": "string",
          "--repo": "string",
          "-R": "string",
          "--review": "string",
          "--review-requested": "string",
          "--reviewed-by": "string",
          "--sort": "string",
          "--state": "string",
          "--team-mentions": "string",
          "--updated": "string",
          "--visibility": "string"
        }
      },
      "gh search commits": {
        safeFlags: {
          "--author": "string",
          "--author-date": "string",
          "--author-email": "string",
          "--author-name": "string",
          "--committer": "string",
          "--committer-date": "string",
          "--committer-email": "string",
          "--committer-name": "string",
          "--hash": "string",
          "--json": "string",
          "--limit": "number",
          "-L": "number",
          "--merge": "none",
          "--order": "string",
          "--owner": "string",
          "--parent": "string",
          "--repo": "string",
          "-R": "string",
          "--sort": "string",
          "--tree": "string",
          "--visibility": "string"
        }
      },
      "gh search code": {
        safeFlags: {
          "--extension": "string",
          "--filename": "string",
          "--json": "string",
          "--language": "string",
          "--limit": "number",
          "-L": "number",
          "--match": "string",
          "--owner": "string",
          "--repo": "string",
          "-R": "string",
          "--size": "string"
        }
      }
    };
    pda = ["-H", "-c", "--host", "--context", "--config", "--tlscacert", "--tlscert", "--tlskey"];
    Dhp = new Set(pda.filter(e => e.length === 2).map(e => e[1]));
    E2n = {
      "docker logs": {
        safeFlags: {
          "--follow": "none",
          "-f": "none",
          "--tail": "string",
          "-n": "string",
          "--timestamps": "none",
          "-t": "none",
          "--since": "string",
          "--until": "string",
          "--details": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => T2n(t)
      },
      "docker inspect": {
        safeFlags: {
          "--format": "string",
          "-f": "string",
          "--type": "string",
          "--size": "none",
          "-s": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => T2n(t)
      }
    };
    mda = {
      rg: {
        safeFlags: {
          "-e": "string",
          "--regexp": "string",
          "-f": "string",
          "-i": "none",
          "--ignore-case": "none",
          "-S": "none",
          "--smart-case": "none",
          "-F": "none",
          "--fixed-strings": "none",
          "-w": "none",
          "--word-regexp": "none",
          "-v": "none",
          "--invert-match": "none",
          "-c": "none",
          "--count": "none",
          "-l": "none",
          "--files-with-matches": "none",
          "--files-without-match": "none",
          "-n": "none",
          "--line-number": "none",
          "-o": "none",
          "--only-matching": "none",
          "-A": "number",
          "--after-context": "number",
          "-B": "number",
          "--before-context": "number",
          "-C": "number",
          "--context": "number",
          "-H": "none",
          "-h": "none",
          "--heading": "none",
          "--no-heading": "none",
          "-q": "none",
          "--quiet": "none",
          "--column": "none",
          "-g": "string",
          "--glob": "string",
          "-t": "string",
          "--type": "string",
          "-T": "string",
          "--type-not": "string",
          "--type-list": "none",
          "--hidden": "none",
          "--no-ignore": "none",
          "-u": "none",
          "-m": "number",
          "--max-count": "number",
          "-d": "number",
          "--max-depth": "number",
          "-a": "none",
          "--text": "none",
          "-L": "none",
          "--follow": "none",
          "--color": "string",
          "--json": "none",
          "--stats": "none",
          "--help": "none",
          "--version": "none",
          "--debug": "none",
          "--": "none"
        }
      }
    };
    fda = {
      pyright: {
        respectsDoubleDash: false,
        safeFlags: {
          "--outputjson": "none",
          "--pythonversion": "string",
          "--pythonplatform": "string",
          "--level": "string",
          "--stats": "none",
          "--verbose": "none",
          "--version": "none",
          "--dependencies": "none",
          "--warnings": "none"
        },
        additionalCommandIsDangerousCallback: (e, t) => t.some(n => n === "--watch" || n === "-w")
      }
    };
    v2n = ["docker ps", "docker images"];
    uda = /^-[a-zA-Z0-9_-]/;
  });
  function Aco(e) {
    let t = e.length;
    if (t <= 5) {
      return e.map(r => `'${r}'`).join(", ");
    }
    return `${e.slice(0, 5).map(r => `'${r}'`).join(", ")}, and ${t - 5} more`;
  }
  function Nhp(e) {
    let t = Oae(e);
    if (t === -1) {
      return e;
    }
    let n = e.substring(0, t);
    let r = Wt() === "windows" ? Math.max(n.lastIndexOf("/"), n.lastIndexOf("\\")) : n.lastIndexOf("/");
    if (r === -1) {
      return ".";
    }
    return n.substring(0, r) || "/";
  }
  function Ico(e) {
    if (!SandboxManager.isSandboxingEnabled()) {
      return false;
    }
    let {
      allowOnly: t,
      denyWithinAllow: n
    } = SandboxManager.getFsWriteConfig();
    let r = fg(e);
    let o = t.flatMap(hda);
    let s = n.flatMap(hda);
    return r.every(i => {
      for (let a of s) {
        if (pathInWorkingPath(i, a)) {
          return false;
        }
      }
      return o.some(a => pathInWorkingPath(i, a));
    });
  }
  function xdt(e, t, n, r) {
    let o = n === "read" ? "read" : "edit";
    let s = r ?? fg(e);
    for (let l of s) {
      let c = matchingRuleForInput(l, t, o, "deny");
      if (c !== null) {
        return {
          allowed: false,
          decisionReason: {
            type: "rule",
            rule: c
          }
        };
      }
    }
    if (n !== "read") {
      let l = checkEditableInternalPath(e, {}, s);
      if (l.behavior === "deny") {
        return {
          allowed: false,
          decisionReason: untypeDenyReasonForAskPropagation(l.decisionReason)
        };
      }
      if (l.behavior === "allow") {
        return {
          allowed: true,
          decisionReason: l.decisionReason
        };
      }
    }
    if (n !== "read") {
      let l = checkPathSafetyForAutoEdit(e, s, undefined, t.isRemoteMode, t.trustedNetworkDirectories);
      if (!l.safe) {
        return {
          allowed: false,
          decisionReason: {
            type: "safetyCheck",
            reason: l.message,
            classifierApprovable: l.classifierApprovable
          }
        };
      }
    }
    let i = pathInAllowedWorkingPath(e, t, s);
    if (i) {
      if (n === "read" || t.mode === "acceptEdits") {
        return {
          allowed: true
        };
      }
    }
    if (n === "read") {
      let l = checkReadableInternalPath(e, {}, s);
      if (l.behavior === "deny") {
        return {
          allowed: false,
          decisionReason: untypeDenyReasonForAskPropagation(l.decisionReason)
        };
      }
      if (l.behavior === "allow") {
        return {
          allowed: true,
          decisionReason: l.decisionReason
        };
      }
    }
    if (n !== "read" && !i && Ico(e)) {
      return {
        allowed: true,
        decisionReason: {
          type: "other",
          reason: "Path is in sandbox write allowlist"
        }
      };
    }
    let a = matchingAllowRuleForAllPaths(s, t, o);
    if (a !== null) {
      return {
        allowed: true,
        decisionReason: {
          type: "rule",
          rule: a
        }
      };
    }
    return {
      allowed: false,
      isInWorkingDir: i
    };
  }
  function Lhp(e, t, n, r) {
    let o = zt();
    let s = Nhp(e);
    let i = roe.isAbsolute(s) ? s : roe.resolve(t, s);
    let a = roe.isAbsolute(e) ? e : roe.resolve(t, e);
    for (;;) {
      let {
        resolvedPath: l,
        isCanonical: c
      } = qd(o, a);
      let u = roe.dirname(a);
      if (c || a === i || u === a) {
        return {
          ...xdt(l, n, r, c ? [l] : undefined),
          resolvedPath: l
        };
      }
      a = u;
    }
  }
  function kdt(e) {
    let t = e.replace(/[\\/]+/g, "/");
    if (t === "*" || t.endsWith("/*")) {
      return true;
    }
    let n = Wt() === "macos";
    let r = c => n ? c.replace(/^\/private\/(etc|var|tmp|home)(\/|$)/i, "/$1$2") : c;
    let o = r(t);
    let s = o === "/" ? o : o.replace(/\/$/, "");
    if (s === "/") {
      return true;
    }
    if (Fhp.test(s)) {
      return true;
    }
    let i = r(kco.homedir().replace(/[\\/]+/g, "/")).replace(/\/$/, "");
    if (normalizeCaseForComparison(s) === normalizeCaseForComparison(i)) {
      return true;
    }
    let a = Bhp(kco.homedir());
    if (a !== i && normalizeCaseForComparison(s) === normalizeCaseForComparison(a)) {
      return true;
    }
    if (roe.dirname(s) === "/") {
      return true;
    }
    if (Uhp.test(s)) {
      return true;
    }
    return false;
  }
  function I3t(e) {
    let t = e.split(Wt() === "windows" ? /[\\/]/ : "/");
    let n = false;
    for (let r of t) {
      if (r === "" || r === ".") {
        continue;
      }
      if (r === "..") {
        if (n) {
          return true;
        }
      } else {
        n = true;
      }
    }
    return false;
  }
  function P3t(e, t, n, r) {
    let o = AP(e);
    if (HI(o, true)) {
      return {
        allowed: false,
        resolvedPath: o,
        decisionReason: {
          type: "other",
          reason: "UNC network paths require manual approval"
        }
      };
    }
    if (o.startsWith("~")) {
      return {
        allowed: false,
        resolvedPath: o,
        decisionReason: {
          type: "other",
          reason: "Tilde expansion variants (~user, ~+, ~-) in paths require manual approval"
        }
      };
    }
    if (o.includes("$") || Wt() === "windows" && o.includes("%") || o.includes("`") || o.startsWith("=")) {
      return {
        allowed: false,
        resolvedPath: o,
        decisionReason: {
          type: "other",
          reason: "Shell expansion syntax in paths requires manual approval"
        }
      };
    }
    if (I3t(o)) {
      return {
        allowed: false,
        resolvedPath: o,
        decisionReason: {
          type: "other",
          reason: "Path contains '..' traversal after a directory segment, which may follow a symlink outside the working directory"
        }
      };
    }
    if ((r === "write" || r === "create") && Mhp.test(o)) {
      return {
        allowed: false,
        resolvedPath: o,
        decisionReason: {
          type: "other",
          reason: "Brace characters in write target require manual approval \u2014 bash may brace-expand to paths outside the working directory"
        }
      };
    }
    if (Oae(o) !== -1) {
      if (r === "write" || r === "create") {
        return {
          allowed: false,
          resolvedPath: o,
          decisionReason: {
            type: "other",
            reason: "Glob patterns are not allowed in write operations. Please specify an exact file path."
          }
        };
      }
      return Lhp(o, t, n, r);
    }
    let s = roe.isAbsolute(o) ? o : roe.resolve(t, o);
    let {
      resolvedPath: i,
      isCanonical: a
    } = qd(zt(), s);
    return {
      ...xdt(i, n, r, a ? [i] : undefined),
      resolvedPath: i
    };
  }
  var kco;
  var roe;
  var Mhp;
  var hda;
  var Fhp;
  var Uhp;
  var Bhp;
  var mde = __lazy(() => {
    Cs();
    mm();
    Th();
    pde();
    wm();
    kco = require("os");
    roe = require("path");
    Mhp = /[{}]/;
    hda = TEr(fg);
    Fhp = /^[A-Za-z]:\/?$/;
    Uhp = /^[A-Za-z]:\/[^/]+$/;
    Bhp = TEr(e => qd(zt(), e).resolvedPath.replace(/[\\/]+/g, "/").replace(/\/$/, ""));
  });
  function Hhp() {
    if (getUseCoworkPlugins()) {
      return "cowork_plugins";
    }
    if (st(process.env.CLAUDE_CODE_USE_COWORK_PLUGINS)) {
      return "cowork_plugins";
    }
    return "plugins";
  }
  function XC() {
    let e = process.env.CLAUDE_CODE_PLUGIN_CACHE_DIR;
    if (e) {
      return AP(e);
    }
    return Idt.join(er(), Hhp());
  }
  function fde() {
    let e = process.env.CLAUDE_CODE_PLUGIN_SEED_DIR;
    if (!e) {
      return [];
    }
    return e.split(Idt.delimiter).filter(Boolean).map(AP);
  }
  function jhp(e) {
    return e.replace(/[^a-zA-Z0-9\-_]/g, "-");
  }
  function O3t(e) {
    return Idt.join(XC(), "data", jhp(e));
  }
  function lTe(e) {
    let t = O3t(e);
    zt().mkdirSync(t);
    return t;
  }
  async function yda(e) {
    let t = O3t(e);
    let n = 0;
    let r = async o => {
      for (let s of await Adt.readdir(o, {
        withFileTypes: true
      })) {
        let i = Idt.join(o, s.name);
        if (s.isDirectory()) {
          await r(i);
        } else {
          try {
            n += (await Adt.stat(i)).size;
          } catch {}
        }
      }
    };
    try {
      await r(t);
    } catch (o) {
      if (Io(o)) {
        return null;
      }
      throw o;
    }
    if (n === 0) {
      return null;
    }
    return {
      bytes: n,
      human: formatFileSize(n)
    };
  }
  async function Pdt(e) {
    let t = O3t(e);
    try {
      await Adt.rm(t, {
        recursive: true,
        force: true
      });
    } catch (n) {
      logForDebugging(`Failed to delete plugin data dir ${t}: ${he(n)}`, {
        level: "warn"
      });
    }
  }
  var Adt;
  var Idt;
  var k1 = __lazy(() => {
    at();
    je();
    gn();
    dt();
    cs();
    mde();
    Adt = require("fs/promises");
    Idt = require("path");
  });
  function cTe() {
    return getInitialSettings().skillListingMaxDescChars ?? 1536;
  }
  function Pco() {
    return getInitialSettings().skillListingBudgetFraction ?? 0.01;
  }
  function _9e(e, t = 4) {
    if (Number(process.env.SLASH_COMMAND_TOOL_CHAR_BUDGET)) {
      return Number(process.env.SLASH_COMMAND_TOOL_CHAR_BUDGET);
    }
    let n = Pco();
    let r = (e ?? 200000) * t * n;
    return Math.max(1, Math.floor(r));
  }
  function b9e(e) {
    return e.whenToUse ? `${e.description} - ${e.whenToUse}` : e.description;
  }
  function Dco(e) {
    return e.type === "prompt" && e.source === "bundled";
  }
  function w2n(e, t, n, r, o = 4) {
    let s = _9e(t, o);
    let i = Number(process.env.SLASH_COMMAND_TOOL_CHAR_BUDGET) > 0;
    let a = cTe();
    let l = [];
    let c = Math.max(0, e.length - 1);
    let u = e.map(S => {
      if (n?.vZc(S.name)) {
        c += S.name.length + 2;
        return {
          cmd: S,
          descLen: 0,
          entryLen: S.name.length + 2
        };
      }
      let E = b9e(S);
      let C = Math.min(E.length, a);
      if (E.length > a) {
        l.push({
          name: S.name,
          rawLen: E.length
        });
      }
      c += S.name.length + 4 + E.length;
      return {
        cmd: S,
        descLen: C,
        entryLen: S.name.length + 4 + C
      };
    });
    l.sort((S, E) => E.rawLen - S.rawLen);
    let d = l.map(S => S.name);
    let p = u.reduce((S, E) => S + E.entryLen, 0) + Math.max(0, u.length - 1);
    if (p <= s) {
      return {
        cappedSkills: d,
        budgetMode: "fits",
        maxDescLen: a,
        budgetTruncatedSkills: [],
        totalChars: p,
        rawTotalChars: c,
        budget: s,
        budgetFromEnv: i,
        bytesPerToken: o
      };
    }
    let m = S => Dco(S.cmd) || n?.vZc(S.cmd.name);
    let f = u.reduce((S, E) => m(E) ? S + E.entryLen + 1 : S, 0);
    let h = u.filter(S => !m(S));
    if (r) {
      let S = u.reduce((A, k) => A + (m(k) ? k.entryLen : k.cmd.name.length + 2), 0) + Math.max(0, u.length - 1);
      let E = s - S;
      let C = h.slice().sort((A, k) => r(k.cmd) - r(A.cmd));
      let x = [];
      for (let A of C) {
        let k = A.entryLen - (A.cmd.name.length + 2);
        if (k <= E) {
          E -= k;
        } else {
          x.push(A);
        }
      }
      x.sort((A, k) => k.descLen - A.descLen);
      return {
        cappedSkills: d,
        budgetMode: "priority",
        maxDescLen: 0,
        budgetTruncatedSkills: x.map(A => A.cmd.name),
        totalChars: p,
        rawTotalChars: c,
        budget: s,
        budgetFromEnv: i,
        bytesPerToken: o
      };
    }
    let g = h.reduce((S, E) => S + E.cmd.name.length + 4, 0) + Math.max(0, h.length - 1);
    let y = h.length > 0 ? Math.floor((s - f - g) / h.length) : a;
    let _ = y < 20 ? "names-only" : "truncate";
    let b = _ === "names-only" ? h.filter(S => S.descLen > 0) : h.filter(S => S.descLen > y);
    b.sort((S, E) => E.descLen - S.descLen);
    return {
      cappedSkills: d,
      budgetMode: _,
      maxDescLen: Math.max(0, y),
      budgetTruncatedSkills: b.map(S => S.cmd.name),
      totalChars: p,
      rawTotalChars: c,
      budget: s,
      budgetFromEnv: i,
      bytesPerToken: o
    };
  }
  var S9e = __lazy(() => {});
  var Sda = {};