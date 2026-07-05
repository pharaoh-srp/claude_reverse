  __export(yuo, {
    isDeferredTool: () => isDeferredTool,
    getPrompt: () => getPrompt_export,
    formatDeferredToolLine: () => formatDeferredToolLine,
    TOOL_SEARCH_TOOL_NAME: () => "ToolSearch"
  });
  function isDeferredTool(e) {
    if (e.alwaysLoad === true) {
      return false;
    }
    if (Xda().includes(e.name)) {
      return false;
    }
    if (e.isMcp === true) {
      return true;
    }
    if (e.name === "ToolSearch") {
      return false;
    }
    if (e.name === "Agent") {
      if ((iDe(), __toCommonJS(Epa)).isForkSubagentEnabled()) {
        return false;
      }
    }
    if (e.name === eyp) {
      return false;
    }
    if (e.name === typ) {
      return false;
    }
    if (e.name === "PushNotification" && khn()) {
      return false;
    }
    if (e.name === "ScheduleWakeup" && pTe()) {
      return false;
    }
    if (e.name === "EnterWorktree" && process.env.CLAUDE_CODE_SESSION_KIND === "bg") {
      return false;
    }
    return e.shouldDefer === true;
  }
  function formatDeferredToolLine(e) {
    return e.name;
  }
  function getPrompt_export() {
    return nyp + (Dqi() ? oyp : " Until fetched, only the name is known \u2014 there is no parameter schema, so the tool cannot be invoked.") + syp;
  }
  var eyp;
  var typ;
  var nyp = `Fetches full schema definitions for deferred tools so they can be called.

Deferred tools appear by name in <system-reminder> messages.`;
  var oyp = ` Until fetched, only the name is known \u2014 there is no parameter schema, so calling the tool fails with InputValidationError. When any instruction, system reminder, or other tool's description names a deferred tool, fetch it with query "select:<name>" before calling it.`;
  var syp = ` This tool takes a query, matches it against the deferred tool list, and returns the matched tools' complete JSONSchema definitions inside a <functions> block. Once a tool's schema appears in that result, it is callable exactly like any tool defined at the top of the prompt.

Result format: each matched tool appears as one <function>{"description": "...", "name": "...", "parameters": {...}}</function> line inside the <functions> block \u2014 the same encoding as the tool list at the top of this prompt.

Query forms:
- "select:Read,Edit,Grep" \u2014 fetch these exact tools by name
- "notebook jupyter" \u2014 keyword search, up to max_results best matches
- "+slack send" \u2014 require "slack" in the name, rank by remaining terms`;
  var kX = __lazy(() => {
    bde();
    $A();
    Y4e();
    RX();
    Sh();
    ioe();
    eyp = (k2(), __toCommonJS(kIe)).BRIEF_TOOL_NAME;
    typ = __toCommonJS(VOn).SEND_USER_FILE_TOOL_NAME;
  });
  function iyp(e, t, n, r) {
    var o = e.length;
    var s = n + (r ? 1 : -1);
    while (r ? s-- : ++s < o) {
      if (t(e[s], s, e)) {
        return s;
      }
    }
    return -1;
  }
  function ayp(e) {
    return e !== e;
  }
  function lyp(e, t, n) {
    var r = n - 1;
    var o = e.length;
    while (++r < o) {
      if (e[r] === t) {
        return r;
      }
    }
    return -1;
  }
  function cyp(e, t, n) {
    return t === t ? lyp(e, t, n) : iyp(e, ayp, n);
  }
  function uyp(e, t) {
    var n = e == null ? 0 : e.length;
    return !!n && cyp(e, t, 0) > -1;
  }
  function dyp(e, t, n) {
    var r = -1;
    var o = e == null ? 0 : e.length;
    while (++r < o) {
      if (n(t, e[r])) {
        return true;
      }
    }
    return false;
  }
  var pyp = 1 / 0;
  var myp;
  function hyp(e, t, n) {
    var r = -1;
    var o = uyp;
    var s = e.length;
    var i = true;
    var a = [];
    var l = a;
    if (n) {
      i = false;
      o = dyp;
    } else if (s >= 200) {
      var c = t ? null : myp(e);
      if (c) {
        return heu(c);
      }
      i = false;
      o = ceu;
      l = new Aan();
    } else {
      l = t ? [] : a;
    }
    e: while (++r < s) {
      var u = e[r];
      var d = t ? t(u) : u;
      if (u = n || u !== 0 ? u : 0, i && d === d) {
        var p = l.length;
        while (p--) {
          if (l[p] === d) {
            continue e;
          }
        }
        if (t) {
          l.push(d);
        }
        a.push(u);
      } else if (!o(l, d, n)) {
        if (l !== a) {
          l.push(d);
        }
        a.push(u);
      }
    }
    return a;
  }
  function gyp(e, t) {
    return e && e.length ? hyp(e, Hnu(t, 2)) : [];
  }
  function buo() {
    return {
      async: false,
      breaks: false,
      extensions: null,
      gfm: true,
      hooks: null,
      pedantic: false,
      renderer: null,
      silent: false,
      tokenizer: null,
      walkTokens: null
    };
  }
  function Wpa(e) {
    P9e = e;
  }
  function hT(e, t = "") {
    let n = typeof e === "string" ? e : e.source;
    let r = {
      replace: (o, s) => {
        let i = typeof s === "string" ? s : s.source;
        i = i.replace(Uq.caret, "$1");
        n = n.replace(o, i);
        return r;
      },
      getRegex: () => new RegExp(n, t)
    };
    return r;
  }
  function Ede(e, t) {
    if (t) {
      if (Uq.escapeTest.test(e)) {
        return e.replace(Uq.escapeReplace, $pa);
      }
    } else if (Uq.escapeTestNoEncode.test(e)) {
      return e.replace(Uq.escapeReplaceNoEncode, $pa);
    }
    return e;
  }
  function Hpa(e) {
    try {
      e = encodeURI(e).replace(Uq.percentDecode, "%");
    } catch {
      return null;
    }
    return e;
  }
  function jpa(e, t) {
    let n = e.replace(Uq.findPipe, (s, i, a) => {
      let l = false;
      let c = i;
      while (--c >= 0 && a[c] === "\\") {
        l = !l;
      }
      if (l) {
        return "|";
      } else {
        return " |";
      }
    });
    let r = n.split(Uq.splitPipe);
    let o = 0;
    if (!r[0].trim()) {
      r.shift();
    }
    if (r.length > 0 && !r.at(-1)?.trim()) {
      r.pop();
    }
    if (t) {
      if (r.length > t) {
        r.splice(t);
      } else {
        while (r.length < t) {
          r.push("");
        }
      }
    }
    for (; o < r.length; o++) {
      r[o] = r[o].trim().replace(Uq.slashPipe, "|");
    }
    return r;
  }
  function n4t(e, t, n) {
    let r = e.length;
    if (r === 0) {
      return "";
    }
    let o = 0;
    while (o < r) {
      if (e.charAt(r - o - 1) === t) {
        o++;
      } else {
        break;
      }
    }
    return e.slice(0, r - o);
  }
  function Yyp(e, t) {
    if (e.indexOf(t[1]) === -1) {
      return -1;
    }
    let n = 0;
    for (let r = 0; r < e.length; r++) {
      if (e[r] === "\\") {
        r++;
      } else if (e[r] === t[0]) {
        n++;
      } else if (e[r] === t[1]) {
        if (n--, n < 0) {
          return r;
        }
      }
    }
    return -1;
  }
  function qpa(e, t, n, r, o) {
    let s = t.href;
    let i = t.title || null;
    let a = e[1].replace(o.other.outputLinkReplace, "$1");
    if (e[0].charAt(0) !== "!") {
      r.state.inLink = true;
      let l = {
        type: "link",
        raw: n,
        href: s,
        title: i,
        text: a,
        tokens: r.inlineTokens(a)
      };
      r.state.inLink = false;
      return l;
    }
    return {
      type: "image",
      raw: n,
      href: s,
      title: i,
      text: a
    };
  }
  function Jyp(e, t, n) {
    let r = e.match(n.other.indentCodeCompensation);
    if (r === null) {
      return t;
    }
    let o = r[1];
    return t.split(`
`).map(s => {
      let i = s.match(n.other.beginningSpace);
      if (i === null) {
        return s;
      }
      let [a] = i;
      if (a.length >= o.length) {
        return s.slice(o.length);
      }
      return s;
    }).join(`
`);
  }
  class A9e {
    options;
    rules;
    lexer;
    constructor(e) {
      this.options = e || P9e;
    }
    space(e) {
      let t = this.rules.block.newline.exec(e);
      if (t && t[0].length > 0) {
        return {
          type: "space",
          raw: t[0]
        };
      }
    }
    code(e) {
      let t = this.rules.block.code.exec(e);
      if (t) {
        let n = t[0].replace(this.rules.other.codeRemoveIndent, "");
        return {
          type: "code",
          raw: t[0],
          codeBlockStyle: "indented",
          text: !this.options.pedantic ? n4t(n, `
`) : n
        };
      }
    }
    fences(e) {
      let t = this.rules.block.fences.exec(e);
      if (t) {
        let n = t[0];
        let r = Jyp(n, t[3] || "", this.rules);
        return {
          type: "code",
          raw: n,
          lang: t[2] ? t[2].trim().replace(this.rules.inline.anyPunctuation, "$1") : t[2],
          text: r
        };
      }
    }
    heading(e) {
      let t = this.rules.block.heading.exec(e);
      if (t) {
        let n = t[2].trim();
        if (this.rules.other.endingHash.test(n)) {
          let r = n4t(n, "#");
          if (this.options.pedantic) {
            n = r.trim();
          } else if (!r || this.rules.other.endingSpaceChar.test(r)) {
            n = r.trim();
          }
        }
        return {
          type: "heading",
          raw: t[0],
          depth: t[1].length,
          text: n,
          tokens: this.lexer.inline(n)
        };
      }
    }
    hr(e) {
      let t = this.rules.block.hr.exec(e);
      if (t) {
        return {
          type: "hr",
          raw: n4t(t[0], `
`)
        };
      }
    }
    blockquote(e) {
      let t = this.rules.block.blockquote.exec(e);
      if (t) {
        let n = n4t(t[0], `
`).split(`
`);
        let r = "";
        let o = "";
        let s = [];
        while (n.length > 0) {
          let i = false;
          let a = [];
          let l;
          for (l = 0; l < n.length; l++) {
            if (this.rules.other.blockquoteStart.test(n[l])) {
              a.push(n[l]);
              i = true;
            } else if (!i) {
              a.push(n[l]);
            } else {
              break;
            }
          }
          n = n.slice(l);
          let c = a.join(`
`);
          let u = c.replace(this.rules.other.blockquoteSetextReplace, `
    $1`).replace(this.rules.other.blockquoteSetextReplace2, "");
          r = r ? `${r}
${c}` : c;
          o = o ? `${o}
${u}` : u;
          let d = this.lexer.state.top;
          if (this.lexer.state.top = true, this.lexer.blockTokens(u, s, true), this.lexer.state.top = d, n.length === 0) {
            break;
          }
          let p = s.at(-1);
          if (p?.type === "code") {
            break;
          } else if (p?.type === "blockquote") {
            let m = p;
            let f = m.raw + `
` + n.join(`
`);
            let h = this.blockquote(f);
            s[s.length - 1] = h;
            r = r.substring(0, r.length - m.raw.length) + h.raw;
            o = o.substring(0, o.length - m.text.length) + h.text;
            break;
          } else if (p?.type === "list") {
            let m = p;
            let f = m.raw + `
` + n.join(`
`);
            let h = this.list(f);
            s[s.length - 1] = h;
            r = r.substring(0, r.length - p.raw.length) + h.raw;
            o = o.substring(0, o.length - m.raw.length) + h.raw;
            n = f.substring(s.at(-1).raw.length).split(`
`);
            continue;
          }
        }
        return {
          type: "blockquote",
          raw: r,
          tokens: s,
          text: o
        };
      }
    }
    list(e) {
      let t = this.rules.block.list.exec(e);
      if (t) {
        let n = t[1].trim();
        let r = n.length > 1;
        let o = {
          type: "list",
          raw: "",
          ordered: r,
          start: r ? +n.slice(0, -1) : "",
          loose: false,
          items: []
        };
        if (n = r ? `\\d{1,9}\\${n.slice(-1)}` : `\\${n}`, this.options.pedantic) {
          n = r ? n : "[*+-]";
        }
        let s = this.rules.other.listItemRegex(n);
        let i = false;
        while (e) {
          let l = false;
          let c = "";
          let u = "";
          if (!(t = s.exec(e))) {
            break;
          }
          if (this.rules.block.hr.test(e)) {
            break;
          }
          c = t[0];
          e = e.substring(c.length);
          let d = t[2].split(`
`, 1)[0].replace(this.rules.other.listReplaceTabs, y => " ".repeat(3 * y.length));
          let p = e.split(`
`, 1)[0];
          let m = !d.trim();
          let f = 0;
          if (this.options.pedantic) {
            f = 2;
            u = d.trimStart();
          } else if (m) {
            f = t[1].length + 1;
          } else {
            f = t[2].search(this.rules.other.nonSpaceChar);
            f = f > 4 ? 1 : f;
            u = d.slice(f);
            f += t[1].length;
          }
          if (m && this.rules.other.blankLine.test(p)) {
            c += p + `
`;
            e = e.substring(p.length + 1);
            l = true;
          }
          if (!l) {
            let y = this.rules.other.nextBulletRegex(f);
            let _ = this.rules.other.hrRegex(f);
            let b = this.rules.other.fencesBeginRegex(f);
            let S = this.rules.other.headingBeginRegex(f);
            let E = this.rules.other.htmlBeginRegex(f);
            while (e) {
              let C = e.split(`
`, 1)[0];
              let x;
              if (p = C, this.options.pedantic) {
                p = p.replace(this.rules.other.listReplaceNesting, "  ");
                x = p;
              } else {
                x = p.replace(this.rules.other.tabCharGlobal, "    ");
              }
              if (b.test(p)) {
                break;
              }
              if (S.test(p)) {
                break;
              }
              if (E.test(p)) {
                break;
              }
              if (y.test(p)) {
                break;
              }
              if (_.test(p)) {
                break;
              }
              if (x.search(this.rules.other.nonSpaceChar) >= f || !p.trim()) {
                u += `
` + x.slice(f);
              } else {
                if (m) {
                  break;
                }
                if (d.replace(this.rules.other.tabCharGlobal, "    ").search(this.rules.other.nonSpaceChar) >= 4) {
                  break;
                }
                if (b.test(d)) {
                  break;
                }
                if (S.test(d)) {
                  break;
                }
                if (_.test(d)) {
                  break;
                }
                u += `
` + p;
              }
              if (!m && !p.trim()) {
                m = true;
              }
              c += C + `
`;
              e = e.substring(C.length + 1);
              d = x.slice(f);
            }
          }
          if (!o.loose) {
            if (i) {
              o.loose = true;
            } else if (this.rules.other.doubleBlankLine.test(c)) {
              i = true;
            }
          }
          let h = null;
          let g;
          if (this.options.gfm) {
            if (h = this.rules.other.listIsTask.exec(u), h) {
              g = h[0] !== "[ ] ";
              u = u.replace(this.rules.other.listReplaceTask, "");
            }
          }
          o.items.push({
            type: "list_item",
            raw: c,
            task: !!h,
            checked: g,
            loose: false,
            text: u,
            tokens: []
          });
          o.raw += c;
        }
        let a = o.items.at(-1);
        if (a) {
          a.raw = a.raw.trimEnd();
          a.text = a.text.trimEnd();
        } else {
          return;
        }
        o.raw = o.raw.trimEnd();
        for (let l = 0; l < o.items.length; l++) {
          if (this.lexer.state.top = false, o.items[l].tokens = this.lexer.blockTokens(o.items[l].text, []), !o.loose) {
            let c = o.items[l].tokens.filter(d => d.type === "space");
            let u = c.length > 0 && c.some(d => this.rules.other.anyLine.test(d.raw));
            o.loose = u;
          }
        }
        if (o.loose) {
          for (let l = 0; l < o.items.length; l++) {
            o.items[l].loose = true;
          }
        }
        return o;
      }
    }
    html(e) {
      let t = this.rules.block.html.exec(e);
      if (t) {
        return {
          type: "html",
          block: true,
          raw: t[0],
          pre: t[1] === "pre" || t[1] === "script" || t[1] === "style",
          text: t[0]
        };
      }
    }
    def(e) {
      let t = this.rules.block.def.exec(e);
      if (t) {
        let n = t[1].toLowerCase().replace(this.rules.other.multipleSpaceGlobal, " ");
        let r = t[2] ? t[2].replace(this.rules.other.hrefBrackets, "$1").replace(this.rules.inline.anyPunctuation, "$1") : "";
        let o = t[3] ? t[3].substring(1, t[3].length - 1).replace(this.rules.inline.anyPunctuation, "$1") : t[3];
        return {
          type: "def",
          tag: n,
          raw: t[0],
          href: r,
          title: o
        };
      }
    }
    table(e) {
      let t = this.rules.block.table.exec(e);
      if (!t) {
        return;
      }
      if (!this.rules.other.tableDelimiter.test(t[2])) {
        return;
      }
      let n = jpa(t[1]);
      let r = t[2].replace(this.rules.other.tableAlignChars, "").split("|");
      let o = t[3]?.trim() ? t[3].replace(this.rules.other.tableRowBlankLine, "").split(`
`) : [];
      let s = {
        type: "table",
        raw: t[0],
        header: [],
        align: [],
        rows: []
      };
      if (n.length !== r.length) {
        return;
      }
      for (let i of r) {
        if (this.rules.other.tableAlignRight.test(i)) {
          s.align.push("right");
        } else if (this.rules.other.tableAlignCenter.test(i)) {
          s.align.push("center");
        } else if (this.rules.other.tableAlignLeft.test(i)) {
          s.align.push("left");
        } else {
          s.align.push(null);
        }
      }
      for (let i = 0; i < n.length; i++) {
        s.header.push({
          text: n[i],
          tokens: this.lexer.inline(n[i]),
          header: true,
          align: s.align[i]
        });
      }
      for (let i of o) {
        s.rows.push(jpa(i, s.header.length).map((a, l) => ({
          text: a,
          tokens: this.lexer.inline(a),
          header: false,
          align: s.align[l]
        })));
      }
      return s;
    }
    lheading(e) {
      let t = this.rules.block.lheading.exec(e);
      if (t) {
        return {
          type: "heading",
          raw: t[0],
          depth: t[2].charAt(0) === "=" ? 1 : 2,
          text: t[1],
          tokens: this.lexer.inline(t[1])
        };
      }
    }
    paragraph(e) {
      let t = this.rules.block.paragraph.exec(e);
      if (t) {
        let n = t[1].charAt(t[1].length - 1) === `
` ? t[1].slice(0, -1) : t[1];
        return {
          type: "paragraph",
          raw: t[0],
          text: n,
          tokens: this.lexer.inline(n)
        };
      }
    }
    text(e) {
      let t = this.rules.block.text.exec(e);
      if (t) {
        return {
          type: "text",
          raw: t[0],
          text: t[0],
          tokens: this.lexer.inline(t[0])
        };
      }
    }
    escape(e) {
      let t = this.rules.inline.escape.exec(e);
      if (t) {
        return {
          type: "escape",
          raw: t[0],
          text: t[1]
        };
      }
    }
    tag(e) {
      let t = this.rules.inline.tag.exec(e);
      if (t) {
        if (!this.lexer.state.inLink && this.rules.other.startATag.test(t[0])) {
          this.lexer.state.inLink = true;
        } else if (this.lexer.state.inLink && this.rules.other.endATag.test(t[0])) {
          this.lexer.state.inLink = false;
        }
        if (!this.lexer.state.inRawBlock && this.rules.other.startPreScriptTag.test(t[0])) {
          this.lexer.state.inRawBlock = true;
        } else if (this.lexer.state.inRawBlock && this.rules.other.endPreScriptTag.test(t[0])) {
          this.lexer.state.inRawBlock = false;
        }
        return {
          type: "html",
          raw: t[0],
          inLink: this.lexer.state.inLink,
          inRawBlock: this.lexer.state.inRawBlock,
          block: false,
          text: t[0]
        };
      }
    }
    link(e) {
      let t = this.rules.inline.link.exec(e);
      if (t) {
        let n = t[2].trim();
        if (!this.options.pedantic && this.rules.other.startAngleBracket.test(n)) {
          if (!this.rules.other.endAngleBracket.test(n)) {
            return;
          }
          let s = n4t(n.slice(0, -1), "\\");
          if ((n.length - s.length) % 2 === 0) {
            return;
          }
        } else {
          let s = Yyp(t[2], "()");
          if (s > -1) {
            let a = (t[0].indexOf("!") === 0 ? 5 : 4) + t[1].length + s;
            t[2] = t[2].substring(0, s);
            t[0] = t[0].substring(0, a).trim();
            t[3] = "";
          }
        }
        let r = t[2];
        let o = "";
        if (this.options.pedantic) {
          let s = this.rules.other.pedanticHrefTitle.exec(r);
          if (s) {
            r = s[1];
            o = s[3];
          }
        } else {
          o = t[3] ? t[3].slice(1, -1) : "";
        }
        if (r = r.trim(), this.rules.other.startAngleBracket.test(r)) {
          if (this.options.pedantic && !this.rules.other.endAngleBracket.test(n)) {
            r = r.slice(1);
          } else {
            r = r.slice(1, -1);
          }
        }
        return qpa(t, {
          href: r ? r.replace(this.rules.inline.anyPunctuation, "$1") : r,
          title: o ? o.replace(this.rules.inline.anyPunctuation, "$1") : o
        }, t[0], this.lexer, this.rules);
      }
    }
    reflink(e, t) {
      let n;
      if ((n = this.rules.inline.reflink.exec(e)) || (n = this.rules.inline.nolink.exec(e))) {
        let r = (n[2] || n[1]).replace(this.rules.other.multipleSpaceGlobal, " ");
        let o = t[r.toLowerCase()];
        if (!o) {
          let s = n[0].charAt(0);
          return {
            type: "text",
            raw: s,
            text: s
          };
        }
        return qpa(n, o, n[0], this.lexer, this.rules);
      }
    }
    emStrong(e, t, n = "") {
      let r = this.rules.inline.emStrongLDelim.exec(e);
      if (!r) {
        return;
      }
      if (r[3] && n.match(this.rules.other.unicodeAlphaNumeric)) {
        return;
      }
      if (!(r[1] || r[2]) || !n || this.rules.inline.punctuation.exec(n)) {
        let s = [...r[0]].length - 1;
        let i;
        let a;
        let l = s;
        let c = 0;
        let u = r[0][0] === "*" ? this.rules.inline.emStrongRDelimAst : this.rules.inline.emStrongRDelimUnd;
        u.lastIndex = 0;
        t = t.slice(-1 * e.length + s);
        while ((r = u.exec(t)) != null) {
          if (i = r[1] || r[2] || r[3] || r[4] || r[5] || r[6], !i) {
            continue;
          }
          if (a = [...i].length, r[3] || r[4]) {
            l += a;
            continue;
          } else if (r[5] || r[6]) {
            if (s % 3 && !((s + a) % 3)) {
              c += a;
              continue;
            }
          }
          if (l -= a, l > 0) {
            continue;
          }
          a = Math.min(a, a + l + c);
          let d = [...r[0]][0].length;
          let p = e.slice(0, s + r.index + d + a);
          if (Math.min(s, a) % 2) {
            let f = p.slice(1, -1);
            return {
              type: "em",
              raw: p,
              text: f,
              tokens: this.lexer.inlineTokens(f)
            };
          }
          let m = p.slice(2, -2);
          return {
            type: "strong",
            raw: p,
            text: m,
            tokens: this.lexer.inlineTokens(m)
          };
        }
      }
    }
    codespan(e) {
      let t = this.rules.inline.code.exec(e);
      if (t) {
        let n = t[2].replace(this.rules.other.newLineCharGlobal, " ");
        let r = this.rules.other.nonSpaceChar.test(n);
        let o = this.rules.other.startingSpaceChar.test(n) && this.rules.other.endingSpaceChar.test(n);
        if (r && o) {
          n = n.substring(1, n.length - 1);
        }
        return {
          type: "codespan",
          raw: t[0],
          text: n
        };
      }
    }
    br(e) {
      let t = this.rules.inline.br.exec(e);
      if (t) {
        return {
          type: "br",
          raw: t[0]
        };
      }
    }
    del(e) {
      let t = this.rules.inline.del.exec(e);
      if (t) {
        return {
          type: "del",
          raw: t[0],
          text: t[2],
          tokens: this.lexer.inlineTokens(t[2])
        };
      }
    }
    autolink(e) {
      let t = this.rules.inline.autolink.exec(e);
      if (t) {
        let n;
        let r;
        if (t[2] === "@") {
          n = t[1];
          r = "mailto:" + n;
        } else {
          n = t[1];
          r = n;
        }
        return {
          type: "link",
          raw: t[0],
          text: n,
          href: r,
          tokens: [{
            type: "text",
            raw: n,
            text: n
          }]
        };
      }
    }
    url(e) {
      let t;
      if (t = this.rules.inline.url.exec(e)) {
        let n;
        let r;
        if (t[2] === "@") {
          n = t[0];
          r = "mailto:" + n;
        } else {
          let o;
          do {
            o = t[0];
            t[0] = this.rules.inline._backpedal.exec(t[0])?.[0] ?? "";
          } while (o !== t[0]);
          if (n = t[0], t[1] === "www.") {
            r = "http://" + t[0];
          } else {
            r = t[0];
          }
        }
        return {
          type: "link",
          raw: t[0],
          text: n,
          href: r,
          tokens: [{
            type: "text",
            raw: n,
            text: n
          }]
        };
      }
    }
    inlineText(e) {
      let t = this.rules.inline.text.exec(e);
      if (t) {
        let n = this.lexer.state.inRawBlock;
        return {
          type: "text",
          raw: t[0],
          text: t[0],
          escaped: n
        };
      }
    }
  }
  class Bq {
    tokens;
    options;
    state;
    tokenizer;
    inlineQueue;
    constructor(e) {
      this.tokens = [];
      this.tokens.links = Object.create(null);
      this.options = e || P9e;
      this.options.tokenizer = this.options.tokenizer || new A9e();
      this.tokenizer = this.options.tokenizer;
      this.tokenizer.options = this.options;
      this.tokenizer.lexer = this;
      this.inlineQueue = [];
      this.state = {
        inLink: false,
        inRawBlock: false,
        top: true
      };
      let t = {
        other: Uq,
        block: H2n.normal,
        inline: t4t.normal
      };
      if (this.options.pedantic) {
        t.block = H2n.pedantic;
        t.inline = t4t.pedantic;
      } else if (this.options.gfm) {
        if (t.block = H2n.gfm, this.options.breaks) {
          t.inline = t4t.breaks;
        } else {
          t.inline = t4t.gfm;
        }
      }
      this.tokenizer.rules = t;
    }
    static get rules() {
      return {
        block: H2n,
        inline: t4t
      };
    }
    static lex(e, t) {
      return new Bq(t).lex(e);
    }
    static lexInline(e, t) {
      return new Bq(t).inlineTokens(e);
    }
    lex(e) {
      e = e.replace(Uq.carriageReturn, `
`);
      this.blockTokens(e, this.tokens);
      for (let t = 0; t < this.inlineQueue.length; t++) {
        let n = this.inlineQueue[t];
        this.inlineTokens(n.src, n.tokens);
      }
      this.inlineQueue = [];
      return this.tokens;
    }
    blockTokens(e, t = [], n = false) {
      if (this.options.pedantic) {
        e = e.replace(Uq.tabCharGlobal, "    ").replace(Uq.spaceLine, "");
      }
      while (e) {
        let r;
        if (this.options.extensions?.block?.some(s => {
          if (r = s.call({
            lexer: this
          }, e, t)) {
            e = e.substring(r.raw.length);
            t.push(r);
            return true;
          }
          return false;
        })) {
          continue;
        }
        if (r = this.tokenizer.space(e)) {
          e = e.substring(r.raw.length);
          let s = t.at(-1);
          if (r.raw.length === 1 && s !== undefined) {
            s.raw += `
`;
          } else {
            t.push(r);
          }
          continue;
        }
        if (r = this.tokenizer.code(e)) {
          e = e.substring(r.raw.length);
          let s = t.at(-1);
          if (s?.type === "paragraph" || s?.type === "text") {
            s.raw += `
` + r.raw;
            s.text += `
` + r.text;
            this.inlineQueue.at(-1).src = s.text;
          } else {
            t.push(r);
          }
          continue;
        }
        if (r = this.tokenizer.fences(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        if (r = this.tokenizer.heading(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        if (r = this.tokenizer.hr(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        if (r = this.tokenizer.blockquote(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        if (r = this.tokenizer.list(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        if (r = this.tokenizer.html(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        if (r = this.tokenizer.def(e)) {
          e = e.substring(r.raw.length);
          let s = t.at(-1);
          if (s?.type === "paragraph" || s?.type === "text") {
            s.raw += `
` + r.raw;
            s.text += `
` + r.raw;
            this.inlineQueue.at(-1).src = s.text;
          } else if (!this.tokens.links[r.tag]) {
            this.tokens.links[r.tag] = {
              href: r.href,
              title: r.title
            };
          }
          continue;
        }
        if (r = this.tokenizer.table(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        if (r = this.tokenizer.lheading(e)) {
          e = e.substring(r.raw.length);
          t.push(r);
          continue;
        }
        let o = e;
        if (this.options.extensions?.startBlock) {
          let s = 1 / 0;
          let i = e.slice(1);
          let a;
          if (this.options.extensions.startBlock.forEach(l => {
            if (a = l.call({
              lexer: this
            }, i), typeof a === "number" && a >= 0) {
              s = Math.min(s, a);
            }
          }), s < 1 / 0 && s >= 0) {
            o = e.substring(0, s + 1);
          }
        }
        if (this.state.top && (r = this.tokenizer.paragraph(o))) {
          let s = t.at(-1);
          if (n && s?.type === "paragraph") {
            s.raw += `
` + r.raw;
            s.text += `
` + r.text;
            this.inlineQueue.pop();
            this.inlineQueue.at(-1).src = s.text;
          } else {
            t.push(r);
          }
          n = o.length !== e.length;
          e = e.substring(r.raw.length);
          continue;
        }
        if (r = this.tokenizer.text(e)) {
          e = e.substring(r.raw.length);
          let s = t.at(-1);
          if (s?.type === "text") {
            s.raw += `
` + r.raw;
            s.text += `
` + r.text;
            this.inlineQueue.pop();
            this.inlineQueue.at(-1).src = s.text;
          } else {
            t.push(r);
          }
          continue;
        }
        if (e) {
          let s = "Infinite loop on byte: " + e.charCodeAt(0);
          if (this.options.silent) {
            console.error(s);
            break;
          } else {
            throw Error(s);
          }
        }
      }
      this.state.top = true;
      return t;
    }
    inline(e, t = []) {
      this.inlineQueue.push({
        src: e,
        tokens: t
      });
      return t;
    }
    inlineTokens(e, t = []) {
      let n = e;
      let r = null;
      if (this.tokens.links) {
        let i = Object.keys(this.tokens.links);
        if (i.length > 0) {
          while ((r = this.tokenizer.rules.inline.reflinkSearch.exec(n)) != null) {
            if (i.includes(r[0].slice(r[0].lastIndexOf("[") + 1, -1))) {
              n = n.slice(0, r.index) + "[" + "a".repeat(r[0].length - 2) + "]" + n.slice(this.tokenizer.rules.inline.reflinkSearch.lastIndex);
            }
          }
        }
      }
      while ((r = this.tokenizer.rules.inline.blockSkip.exec(n)) != null) {
        n = n.slice(0, r.index) + "[" + "a".repeat(r[0].length - 2) + "]" + n.slice(this.tokenizer.rules.inline.blockSkip.lastIndex);
      }
      while ((r = this.tokenizer.rules.inline.anyPunctuation.exec(n)) != null) {
        n = n.slice(0, r.index) + "++" + n.slice(this.tokenizer.rules.inline.anyPunctuation.lastIndex);
      }
      let o = false;
      let s = "";
      while (e) {
        if (!o) {
          s = "";
        }
        o = false;
        let i;
        if (this.options.extensions?.inline?.some(l => {
          if (i = l.call({
            lexer: this
          }, e, t)) {
            e = e.substring(i.raw.length);
            t.push(i);
            return true;
          }
          return false;
        })) {
          continue;
        }
        if (i = this.tokenizer.escape(e)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (i = this.tokenizer.tag(e)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (i = this.tokenizer.link(e)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (i = this.tokenizer.reflink(e, this.tokens.links)) {
          e = e.substring(i.raw.length);
          let l = t.at(-1);
          if (i.type === "text" && l?.type === "text") {
            l.raw += i.raw;
            l.text += i.text;
          } else {
            t.push(i);
          }
          continue;
        }
        if (i = this.tokenizer.emStrong(e, n, s)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (i = this.tokenizer.codespan(e)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (i = this.tokenizer.br(e)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (i = this.tokenizer.del(e)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (i = this.tokenizer.autolink(e)) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        if (!this.state.inLink && (i = this.tokenizer.url(e))) {
          e = e.substring(i.raw.length);
          t.push(i);
          continue;
        }
        let a = e;
        if (this.options.extensions?.startInline) {
          let l = 1 / 0;
          let c = e.slice(1);
          let u;
          if (this.options.extensions.startInline.forEach(d => {
            if (u = d.call({
              lexer: this
            }, c), typeof u === "number" && u >= 0) {
              l = Math.min(l, u);
            }
          }), l < 1 / 0 && l >= 0) {
            a = e.substring(0, l + 1);
          }
        }
        if (i = this.tokenizer.inlineText(a)) {
          if (e = e.substring(i.raw.length), i.raw.slice(-1) !== "_") {
            s = i.raw.slice(-1);
          }
          o = true;
          let l = t.at(-1);
          if (l?.type === "text") {
            l.raw += i.raw;
            l.text += i.text;
          } else {
            t.push(i);
          }
          continue;
        }
        if (e) {
          let l = "Infinite loop on byte: " + e.charCodeAt(0);
          if (this.options.silent) {
            console.error(l);
            break;
          } else {
            throw Error(l);
          }
        }
      }
      return t;
    }
  }
  class s4t {
    options;
    parser;
    constructor(e) {
      this.options = e || P9e;
    }
    space(e) {
      return "";
    }
    code({
      text: e,
      lang: t,
      escaped: n
    }) {
      let r = (t || "").match(Uq.notSpaceStart)?.[0];
      let o = e.replace(Uq.endingNewline, "") + `
`;
      if (!r) {
        return "<pre><code>" + (n ? o : Ede(o, true)) + `</code></pre>
`;
      }
      return '<pre><code class="language-' + Ede(r) + '">' + (n ? o : Ede(o, true)) + `</code></pre>
`;
    }
    blockquote({
      tokens: e
    }) {
      return `<blockquote>
${this.parser.parse(e)}</blockquote>
`;
    }
    html({
      text: e
    }) {
      return e;
    }
    heading({
      tokens: e,
      depth: t
    }) {
      return `<h${t}>${this.parser.parseInline(e)}</h${t}>
`;
    }
    hr(e) {
      return `<hr>
`;
    }
    list(e) {
      let {
        ordered: t,
        start: n
      } = e;
      let r = "";
      for (let i = 0; i < e.items.length; i++) {
        let a = e.items[i];
        r += this.listitem(a);
      }
      let o = t ? "ol" : "ul";
      let s = t && n !== 1 ? ' start="' + n + '"' : "";
      return "<" + o + s + `>
` + r + "</" + o + `>
`;
    }
    listitem(e) {
      let t = "";
      if (e.task) {
        let n = this.checkbox({
          checked: !!e.checked
        });
        if (e.loose) {
          if (e.tokens[0]?.type === "paragraph") {
            if (e.tokens[0].text = n + " " + e.tokens[0].text, e.tokens[0].tokens && e.tokens[0].tokens.length > 0 && e.tokens[0].tokens[0].type === "text") {
              e.tokens[0].tokens[0].text = n + " " + Ede(e.tokens[0].tokens[0].text);
              e.tokens[0].tokens[0].escaped = true;
            }
          } else {
            e.tokens.unshift({
              type: "text",
              raw: n + " ",
              text: n + " ",
              escaped: true
            });
          }
        } else {
          t += n + " ";
        }
      }
      t += this.parser.parse(e.tokens, !!e.loose);
      return `<li>${t}</li>
`;
    }
    checkbox({
      checked: e
    }) {
      return "<input " + (e ? 'checked="" ' : "") + 'disabled="" type="checkbox">';
    }
    paragraph({
      tokens: e
    }) {
      return `<p>${this.parser.parseInline(e)}</p>
`;
    }
    table(e) {
      let t = "";
      let n = "";
      for (let o = 0; o < e.header.length; o++) {
        n += this.tablecell(e.header[o]);
      }
      t += this.tablerow({
        text: n
      });
      let r = "";
      for (let o = 0; o < e.rows.length; o++) {
        let s = e.rows[o];
        n = "";
        for (let i = 0; i < s.length; i++) {
          n += this.tablecell(s[i]);
        }
        r += this.tablerow({
          text: n
        });
      }
      if (r) {
        r = `<tbody>${r}</tbody>`;
      }
      return `<table>
<thead>
` + t + `</thead>
` + r + `</table>
`;
    }
    tablerow({
      text: e
    }) {
      return `<tr>
${e}</tr>
`;
    }
    tablecell(e) {
      let t = this.parser.parseInline(e.tokens);
      let n = e.header ? "th" : "td";
      return (e.align ? `<${n} align="${e.align}">` : `<${n}>`) + t + `</${n}>
`;
    }
    strong({
      tokens: e
    }) {
      return `<strong>${this.parser.parseInline(e)}</strong>`;
    }
    em({
      tokens: e
    }) {
      return `<em>${this.parser.parseInline(e)}</em>`;
    }
    codespan({
      text: e
    }) {
      return `<code>${Ede(e, true)}</code>`;
    }
    br(e) {
      return "<br>";
    }
    del({
      tokens: e
    }) {
      return `<del>${this.parser.parseInline(e)}</del>`;
    }
    link({
      href: e,
      title: t,
      tokens: n
    }) {
      let r = this.parser.parseInline(n);
      let o = Hpa(e);
      if (o === null) {
        return r;
      }
      e = o;
      let s = '<a href="' + e + '"';
      if (t) {
        s += ' title="' + Ede(t) + '"';
      }
      s += ">" + r + "</a>";
      return s;
    }
    image({
      href: e,
      title: t,
      text: n
    }) {
      let r = Hpa(e);
      if (r === null) {
        return Ede(n);
      }
      e = r;
      let o = `<img src="${e}" alt="${n}"`;
      if (t) {
        o += ` title="${Ede(t)}"`;
      }
      o += ">";
      return o;
    }
    text(e) {
      return "tokens" in e && e.tokens ? this.parser.parseInline(e.tokens) : "escaped" in e && e.escaped ? e.text : Ede(e.text);
    }
  }
  class G2n {
    strong({
      text: e
    }) {
      return e;
    }
    em({
      text: e
    }) {
      return e;
    }
    codespan({
      text: e
    }) {
      return e;
    }
    del({
      text: e
    }) {
      return e;
    }
    html({
      text: e
    }) {
      return e;
    }
    text({
      text: e
    }) {
      return e;
    }
    link({
      text: e
    }) {
      return "" + e;
    }
    image({
      text: e
    }) {
      return "" + e;
    }
    br() {
      return "";
    }
  }
  class OX {
    options;
    renderer;
    textRenderer;
    constructor(e) {
      this.options = e || P9e;
      this.options.renderer = this.options.renderer || new s4t();
      this.renderer = this.options.renderer;
      this.renderer.options = this.options;
      this.renderer.parser = this;
      this.textRenderer = new G2n();
    }
    static parse(e, t) {
      return new OX(t).parse(e);
    }
    static parseInline(e, t) {
      return new OX(t).parseInline(e);
    }
    parse(e, t = true) {
      let n = "";
      for (let r = 0; r < e.length; r++) {
        let o = e[r];
        if (this.options.extensions?.renderers?.[o.type]) {
          let i = o;
          let a = this.options.extensions.renderers[i.type].call({
            parser: this
          }, i);
          if (a !== false || !["space", "hr", "heading", "code", "table", "blockquote", "list", "html", "paragraph", "text"].includes(i.type)) {
            n += a || "";
            continue;
          }
        }
        let s = o;
        switch (s.type) {
          case "space":
            {
              n += this.renderer.space(s);
              continue;
            }
          case "hr":
            {
              n += this.renderer.hr(s);
              continue;
            }
          case "heading":
            {
              n += this.renderer.heading(s);
              continue;
            }
          case "code":
            {
              n += this.renderer.code(s);
              continue;
            }
          case "table":
            {
              n += this.renderer.table(s);
              continue;
            }
          case "blockquote":
            {
              n += this.renderer.blockquote(s);
              continue;
            }
          case "list":
            {
              n += this.renderer.list(s);
              continue;
            }
          case "html":
            {
              n += this.renderer.html(s);
              continue;
            }
          case "paragraph":
            {
              n += this.renderer.paragraph(s);
              continue;
            }
          case "text":
            {
              let i = s;
              let a = this.renderer.text(i);
              while (r + 1 < e.length && e[r + 1].type === "text") {
                i = e[++r];
                a += `
` + this.renderer.text(i);
              }
              if (t) {
                n += this.renderer.paragraph({
                  type: "paragraph",
                  raw: a,
                  text: a,
                  tokens: [{
                    type: "text",
                    raw: a,
                    text: a,
                    escaped: true
                  }]
                });
              } else {
                n += a;
              }
              continue;
            }
          default:
            {
              let i = 'Token with "' + s.type + '" type was not found.';
              if (this.options.silent) {
                console.error(i);
                return "";
              } else {
                throw Error(i);
              }
            }
        }
      }
      return n;
    }
    parseInline(e, t = this.renderer) {
      let n = "";
      for (let r = 0; r < e.length; r++) {
        let o = e[r];
        if (this.options.extensions?.renderers?.[o.type]) {
          let i = this.options.extensions.renderers[o.type].call({
            parser: this
          }, o);
          if (i !== false || !["escape", "html", "link", "image", "strong", "em", "codespan", "br", "del", "text"].includes(o.type)) {
            n += i || "";
            continue;
          }
        }
        let s = o;
        switch (s.type) {
          case "escape":
            {
              n += t.text(s);
              break;
            }
          case "html":
            {
              n += t.html(s);
              break;
            }
          case "link":
            {
              n += t.link(s);
              break;
            }
          case "image":
            {
              n += t.image(s);
              break;
            }
          case "strong":
            {
              n += t.strong(s);
              break;
            }
          case "em":
            {
              n += t.em(s);
              break;
            }
          case "codespan":
            {
              n += t.codespan(s);
              break;
            }
          case "br":
            {
              n += t.br(s);
              break;
            }
          case "del":
            {
              n += t.del(s);
              break;
            }
          case "text":
            {
              n += t.text(s);
              break;
            }
          default:
            {
              let i = 'Token with "' + s.type + '" type was not found.';
              if (this.options.silent) {
                console.error(i);
                return "";
              } else {
                throw Error(i);
              }
            }
        }
      }
      return n;
    }
  }
  class V2n {
    defaults = buo();
    options = this.setOptions;
    parse = this.parseMarkdown(true);
    parseInline = this.parseMarkdown(false);
    Parser = OX;
    Renderer = s4t;
    TextRenderer = G2n;
    Lexer = Bq;
    Tokenizer = A9e;
    Hooks = o4t;
    constructor(...e) {
      this.use(...e);
    }
    walkTokens(e, t) {
      let n = [];
      for (let r of e) {
        switch (n = n.concat(t.call(this, r)), r.type) {
          case "table":
            {
              let o = r;
              for (let s of o.header) {
                n = n.concat(this.walkTokens(s.tokens, t));
              }
              for (let s of o.rows) {
                for (let i of s) {
                  n = n.concat(this.walkTokens(i.tokens, t));
                }
              }
              break;
            }
          case "list":
            {
              let o = r;
              n = n.concat(this.walkTokens(o.items, t));
              break;
            }
          default:
            {
              let o = r;
              if (this.defaults.extensions?.childTokens?.[o.type]) {
                this.defaults.extensions.childTokens[o.type].forEach(s => {
                  let i = o[s].flat(1 / 0);
                  n = n.concat(this.walkTokens(i, t));
                });
              } else if (o.tokens) {
                n = n.concat(this.walkTokens(o.tokens, t));
              }
            }
        }
      }
      return n;
    }
    use(...e) {
      let t = this.defaults.extensions || {
        renderers: {},
        childTokens: {}
      };
      e.forEach(n => {
        let r = {
          ...n
        };
        if (r.async = this.defaults.async || r.async || false, n.extensions) {
          n.extensions.forEach(o => {
            if (!o.name) {
              throw Error("extension name required");
            }
            if ("renderer" in o) {
              let s = t.renderers[o.name];
              if (s) {
                t.renderers[o.name] = function (...i) {
                  let a = o.renderer.apply(this, i);
                  if (a === false) {
                    a = s.apply(this, i);
                  }
                  return a;
                };
              } else {
                t.renderers[o.name] = o.renderer;
              }
            }
            if ("tokenizer" in o) {
              if (!o.level || o.level !== "block" && o.level !== "inline") {
                throw Error("extension level must be 'block' or 'inline'");
              }
              let s = t[o.level];
              if (s) {
                s.unshift(o.tokenizer);
              } else {
                t[o.level] = [o.tokenizer];
              }
              if (o.start) {
                if (o.level === "block") {
                  if (t.startBlock) {
                    t.startBlock.push(o.start);
                  } else {
                    t.startBlock = [o.start];
                  }
                } else if (o.level === "inline") {
                  if (t.startInline) {
                    t.startInline.push(o.start);
                  } else {
                    t.startInline = [o.start];
                  }
                }
              }
            }
            if ("childTokens" in o && o.childTokens) {
              t.childTokens[o.name] = o.childTokens;
            }
          });
          r.extensions = t;
        }
        if (n.renderer) {
          let o = this.defaults.renderer || new s4t(this.defaults);
          for (let s in n.renderer) {
            if (!(s in o)) {
              throw Error(`renderer '${s}' does not exist`);
            }
            if (["options", "parser"].includes(s)) {
              continue;
            }
            let i = s;
            let a = n.renderer[i];
            let l = o[i];
            o[i] = (...c) => {
              let u = a.apply(o, c);
              if (u === false) {
                u = l.apply(o, c);
              }
              return u || "";
            };
          }
          r.renderer = o;
        }
        if (n.tokenizer) {
          let o = this.defaults.tokenizer || new A9e(this.defaults);
          for (let s in n.tokenizer) {
            if (!(s in o)) {
              throw Error(`tokenizer '${s}' does not exist`);
            }
            if (["options", "rules", "lexer"].includes(s)) {
              continue;
            }
            let i = s;
            let a = n.tokenizer[i];
            let l = o[i];
            o[i] = (...c) => {
              let u = a.apply(o, c);
              if (u === false) {
                u = l.apply(o, c);
              }
              return u;
            };
          }
          r.tokenizer = o;
        }
        if (n.hooks) {
          let o = this.defaults.hooks || new o4t();
          for (let s in n.hooks) {
            if (!(s in o)) {
              throw Error(`hook '${s}' does not exist`);
            }
            if (["options", "block"].includes(s)) {
              continue;
            }
            let i = s;
            let a = n.hooks[i];
            let l = o[i];
            if (o4t.passThroughHooks.vZc(s)) {
              o[i] = c => {
                if (this.defaults.async) {
                  return Promise.resolve(a.call(o, c)).then(d => l.call(o, d));
                }
                let u = a.call(o, c);
                return l.call(o, u);
              };
            } else {
              o[i] = (...c) => {
                let u = a.apply(o, c);
                if (u === false) {
                  u = l.apply(o, c);
                }
                return u;
              };
            }
          }
          r.hooks = o;
        }
        if (n.walkTokens) {
          let o = this.defaults.walkTokens;
          let s = n.walkTokens;
          r.walkTokens = function (i) {
            let a = [];
            if (a.push(s.call(this, i)), o) {
              a = a.concat(o.call(this, i));
            }
            return a;
          };
        }
        this.defaults = {
          ...this.defaults,
          ...r
        };
      });
      return this;
    }
    setOptions(e) {
      this.defaults = {
        ...this.defaults,
        ...e
      };
      return this;
    }
    lexer(e, t) {
      return Bq.lex(e, t ?? this.defaults);
    }
    parser(e, t) {
      return OX.parse(e, t ?? this.defaults);
    }
    parseMarkdown(e) {
      return (n, r) => {
        let o = {
          ...r
        };
        let s = {
          ...this.defaults,
          ...o
        };
        let i = this.onError(!!s.silent, !!s.async);
        if (this.defaults.async === true && o.async === false) {
          return i(Error("marked(): The async option was set to true by an extension. Remove async: false from the parse options object to return a Promise."));
        }
        if (typeof n > "u" || n === null) {
          return i(Error("marked(): input parameter is undefined or null"));
        }
        if (typeof n !== "string") {
          return i(Error("marked(): input parameter is of type " + Object.prototype.toString.call(n) + ", string expected"));
        }
        if (s.hooks) {
          s.hooks.options = s;
          s.hooks.block = e;
        }
        let a = s.hooks ? s.hooks.provideLexer() : e ? Bq.lex : Bq.lexInline;
        let l = s.hooks ? s.hooks.provideParser() : e ? OX.parse : OX.parseInline;
        if (s.async) {
          return Promise.resolve(s.hooks ? s.hooks.preprocess(n) : n).then(c => a(c, s)).then(c => s.hooks ? s.hooks.processAllTokens(c) : c).then(c => s.walkTokens ? Promise.all(this.walkTokens(c, s.walkTokens)).then(() => c) : c).then(c => l(c, s)).then(c => s.hooks ? s.hooks.postprocess(c) : c).catch(i);
        }
        try {
          if (s.hooks) {
            n = s.hooks.preprocess(n);
          }
          let c = a(n, s);
          if (s.hooks) {
            c = s.hooks.processAllTokens(c);
          }
          if (s.walkTokens) {
            this.walkTokens(c, s.walkTokens);
          }
          let u = l(c, s);
          if (s.hooks) {
            u = s.hooks.postprocess(u);
          }
          return u;
        } catch (c) {
          return i(c);
        }
      };
    }
    onError(e, t) {
      return n => {
        if (n.message += `
Please report this to https://github.com/markedjs/marked.`, e) {
          let r = "<p>An error occurred:</p><pre>" + Ede(n.message + "", true) + "</pre>";
          if (t) {
            return Promise.resolve(r);
          }
          return r;
        }
        if (t) {
          return Promise.reject(n);
        }
        throw n;
      };
    }
  }
  function vh(e, t) {
    return I9e.parse(e, t);
  }
  var P9e;
  var r4t;
  var Uq;
  var yyp;
  var _yp;
  var byp;
  var i4t;
  var Syp;
  var Gpa;
  var Vpa;
  var Suo;
  var Typ;
  var Tuo;
  var Eyp;
  var vyp;
  var Euo;
  var wyp;
  var zpa;
  var Cyp;
  var vuo;
  var Bpa;
  var Ryp;
  var xyp;
  var kyp;
  var Ayp;
  var Kpa;
  var Iyp;
  var W2n;
  var wuo;
  var Ypa;
  var Pyp;
  var Jpa;
  var Oyp;
  var Dyp;
  var Myp;
  var Xpa;
  var Nyp;
  var Lyp;
  var Fyp;
  var Uyp;
  var Byp;
  var $yp;
  var Hyp;
  var jyp;
  var qyp;
  var j2n;
  var Wyp;
  var Zpa;
  var ema;
  var Gyp;
  var Cuo;
  var Vyp;
  var _uo;
  var zyp;
  var H2n;
  var t4t;
  var Kyp;
  var $pa = e => Kyp[e];
  var o4t;
  var I9e;
  var Kqy;
  var Yqy;
  var Jqy;
  var Xqy;
  var Qqy;
  var Zqy;
  var e3y;
  var Gdt = __lazy(() => {
    P9e = buo();
    r4t = {
      exec: () => null
    };
    Uq = {
      codeRemoveIndent: /^(?: {1,4}| {0,3}\t)/gm,
      outputLinkReplace: /\\([\[\]])/g,
      indentCodeCompensation: /^(\s+)(?:```)/,
      beginningSpace: /^\s+/,
      endingHash: /#$/,
      startingSpaceChar: /^ /,
      endingSpaceChar: / $/,
      nonSpaceChar: /[^ ]/,
      newLineCharGlobal: /\n/g,
      tabCharGlobal: /\t/g,
      multipleSpaceGlobal: /\s+/g,
      blankLine: /^[ \t]*$/,
      doubleBlankLine: /\n[ \t]*\n[ \t]*$/,
      blockquoteStart: /^ {0,3}>/,
      blockquoteSetextReplace: /\n {0,3}((?:=+|-+) *)(?=\n|$)/g,
      blockquoteSetextReplace2: /^ {0,3}>[ \t]?/gm,
      listReplaceTabs: /^\t+/,
      listReplaceNesting: /^ {1,4}(?=( {4})*[^ ])/g,
      listIsTask: /^\[[ xX]\] /,
      listReplaceTask: /^\[[ xX]\] +/,
      anyLine: /\n.*\n/,
      hrefBrackets: /^<(.*)>$/,
      tableDelimiter: /[:|]/,
      tableAlignChars: /^\||\| *$/g,
      tableRowBlankLine: /\n[ \t]*$/,
      tableAlignRight: /^ *-+: *$/,
      tableAlignCenter: /^ *:-+: *$/,
      tableAlignLeft: /^ *:-+ *$/,
      startATag: /^<a /i,
      endATag: /^<\/a>/i,
      startPreScriptTag: /^<(pre|code|kbd|script)(\s|>)/i,
      endPreScriptTag: /^<\/(pre|code|kbd|script)(\s|>)/i,
      startAngleBracket: /^</,
      endAngleBracket: />$/,
      pedanticHrefTitle: /^([^'"]*[^\s])\s+(['"])(.*)\2/,
      unicodeAlphaNumeric: /[\p{L}\p{N}]/u,
      escapeTest: /[&<>"']/,
      escapeReplace: /[&<>"']/g,
      escapeTestNoEncode: /[<>"']|&(?!(#\d{1,7}|#[Xx][a-fA-F0-9]{1,6}|\w+);)/,
      escapeReplaceNoEncode: /[<>"']|&(?!(#\d{1,7}|#[Xx][a-fA-F0-9]{1,6}|\w+);)/g,
      unescapeTest: /&(#(?:\d+)|(?:#x[0-9A-Fa-f]+)|(?:\w+));?/ig,
      caret: /(^|[^\[])\^/g,
      percentDecode: /%25/g,
      findPipe: /\|/g,
      splitPipe: / \|/,
      slashPipe: /\\\|/g,
      carriageReturn: /\r\n|\r/g,
      spaceLine: /^ +$/gm,
      notSpaceStart: /^\S*/,
      endingNewline: /\n$/,
      listItemRegex: e => new RegExp(`^( {0,3}${e})((?:[	 ][^\\n]*)?(?:\\n|$))`),
      nextBulletRegex: e => new RegExp(`^ {0,${Math.min(3, e - 1)}}(?:[*+-]|\\d{1,9}[.)])((?:[ 	][^\\n]*)?(?:\\n|$))`),
      hrRegex: e => new RegExp(`^ {0,${Math.min(3, e - 1)}}((?:- *){3,}|(?:_ *){3,}|(?:\\* *){3,})(?:\\n+|$)`),
      fencesBeginRegex: e => new RegExp(`^ {0,${Math.min(3, e - 1)}}(?:\`\`\`|~~~)`),
      headingBeginRegex: e => new RegExp(`^ {0,${Math.min(3, e - 1)}}#`),
      htmlBeginRegex: e => new RegExp(`^ {0,${Math.min(3, e - 1)}}<(?:[a-z].*>|!--)`, "i")
    };
    yyp = /^(?:[ \t]*(?:\n|$))+/;
    _yp = /^((?: {4}| {0,3}\t)[^\n]+(?:\n(?:[ \t]*(?:\n|$))*)?)+/;
    byp = /^ {0,3}(`{3,}(?=[^`\n]*(?:\n|$))|~{3,})([^\n]*)(?:\n|$)(?:|([\s\S]*?)(?:\n|$))(?: {0,3}\1[~`]* *(?=\n|$)|$)/;
    i4t = /^ {0,3}((?:-[\t ]*){3,}|(?:_[ \t]*){3,}|(?:\*[ \t]*){3,})(?:\n+|$)/;
    Syp = /^ {0,3}(#{1,6})(?=\s|$)(.*)(?:\n+|$)/;
    Gpa = /(?:[*+-]|\d{1,9}[.)])/;
    Vpa = hT(/^(?!bull |blockCode|fences|blockquote|heading|html)((?:.|\n(?!\s*?\n|bull |blockCode|fences|blockquote|heading|html))+?)\n {0,3}(=+|-+) *(?:\n+|$)/).replace(/bull/g, Gpa).replace(/blockCode/g, /(?: {4}| {0,3}\t)/).replace(/fences/g, / {0,3}(?:`{3,}|~{3,})/).replace(/blockquote/g, / {0,3}>/).replace(/heading/g, / {0,3}#{1,6}/).replace(/html/g, / {0,3}<[^\n>]+>\n/).getRegex();
    Suo = /^([^\n]+(?:\n(?!hr|heading|lheading|blockquote|fences|list|html|table| +\n)[^\n]+)*)/;
    Typ = /^[^\n]+/;
    Tuo = /(?!\s*\])(?:\\.|[^\[\]\\])+/;
    Eyp = hT(/^ {0,3}\[(label)\]: *(?:\n[ \t]*)?([^<\s][^\s]*|<.*?>)(?:(?: +(?:\n[ \t]*)?| *\n[ \t]*)(title))? *(?:\n+|$)/).replace("label", Tuo).replace("title", /(?:"(?:\\"?|[^"\\])*"|'[^'\n]*(?:\n[^'\n]+)*\n?'|\([^()]*\))/).getRegex();
    vyp = hT(/^( {0,3}bull)([ \t][^\n]+?)?(?:\n|$)/).replace(/bull/g, Gpa).getRegex();
    Euo = /<!--(?:-?>|[\s\S]*?(?:-->|$))/;
    wyp = hT("^ {0,3}(?:<(script|pre|style|textarea)[\\s>][\\s\\S]*?(?:</\\1>[^\\n]*\\n+|$)|comment[^\\n]*(\\n+|$)|<\\?[\\s\\S]*?(?:\\?>\\n*|$)|<![A-Z][\\s\\S]*?(?:>\\n*|$)|<!\\[CDATA\\[[\\s\\S]*?(?:\\]\\]>\\n*|$)|</?(tag)(?: +|\\n|/?>)[\\s\\S]*?(?:(?:\\n[ \t]*)+\\n|$)|<(?!script|pre|style|textarea)([a-z][\\w-]*)(?:attribute)*? */?>(?=[ \\t]*(?:\\n|$))[\\s\\S]*?(?:(?:\\n[ \t]*)+\\n|$)|</(?!script|pre|style|textarea)[a-z][\\w-]*\\s*>(?=[ \\t]*(?:\\n|$))[\\s\\S]*?(?:(?:\\n[ \t]*)+\\n|$))", "i").replace("comment", Euo).replace("tag", "address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h[1-6]|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|meta|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul").replace("attribute", / +[a-zA-Z:_][\w.:-]*(?: *= *"[^"\n]*"| *= *'[^'\n]*'| *= *[^\s"'=<>`]+)?/).getRegex();
    zpa = hT(Suo).replace("hr", i4t).replace("heading", " {0,3}#{1,6}(?:\\s|$)").replace("|lheading", "").replace("|table", "").replace("blockquote", " {0,3}>").replace("fences", " {0,3}(?:`{3,}(?=[^`\\n]*\\n)|~{3,})[^\\n]*\\n").replace("list", " {0,3}(?:[*+-]|1[.)]) ").replace("html", "</?(?:tag)(?: +|\\n|/?>)|<(?:script|pre|style|textarea|!--)").replace("tag", "address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h[1-6]|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|meta|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul").getRegex();
    Cyp = hT(/^( {0,3}> ?(paragraph|[^\n]*)(?:\n|$))+/).replace("paragraph", zpa).getRegex();
    vuo = {
      blockquote: Cyp,
      code: _yp,
      def: Eyp,
      fences: byp,
      heading: Syp,
      hr: i4t,
      html: wyp,
      lheading: Vpa,
      list: vyp,
      newline: yyp,
      paragraph: zpa,
      table: r4t,
      text: Typ
    };
    Bpa = hT("^ *([^\\n ].*)\\n {0,3}((?:\\| *)?:?-+:? *(?:\\| *:?-+:? *)*(?:\\| *)?)(?:\\n((?:(?! *\\n|hr|heading|blockquote|code|fences|list|html).*(?:\\n|$))*)\\n*|$)").replace("hr", i4t).replace("heading", " {0,3}#{1,6}(?:\\s|$)").replace("blockquote", " {0,3}>").replace("code", "(?: {4}| {0,3}\t)[^\\n]").replace("fences", " {0,3}(?:`{3,}(?=[^`\\n]*\\n)|~{3,})[^\\n]*\\n").replace("list", " {0,3}(?:[*+-]|1[.)]) ").replace("html", "</?(?:tag)(?: +|\\n|/?>)|<(?:script|pre|style|textarea|!--)").replace("tag", "address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h[1-6]|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|meta|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul").getRegex();
    Ryp = {
      ...vuo,
      table: Bpa,
      paragraph: hT(Suo).replace("hr", i4t).replace("heading", " {0,3}#{1,6}(?:\\s|$)").replace("|lheading", "").replace("table", Bpa).replace("blockquote", " {0,3}>").replace("fences", " {0,3}(?:`{3,}(?=[^`\\n]*\\n)|~{3,})[^\\n]*\\n").replace("list", " {0,3}(?:[*+-]|1[.)]) ").replace("html", "</?(?:tag)(?: +|\\n|/?>)|<(?:script|pre|style|textarea|!--)").replace("tag", "address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h[1-6]|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|meta|nav|noframes|ol|optgroup|option|p|param|search|section|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul").getRegex()
    };
    xyp = {
      ...vuo,
      html: hT(`^ *(?:comment *(?:\\n|\\s*$)|<(tag)[\\s\\S]+?</\\1> *(?:\\n{2,}|\\s*$)|<tag(?:"[^"]*"|'[^']*'|\\s[^'"/>\\s]*)*?/?> *(?:\\n{2,}|\\s*$))`).replace("comment", Euo).replace(/tag/g, "(?!(?:a|em|strong|small|s|cite|q|dfn|abbr|data|time|code|var|samp|kbd|sub|sup|i|b|u|mark|ruby|rt|rp|bdi|bdo|span|br|wbr|ins|del|img)\\b)\\w+(?!:|[^\\w\\s@]*@)\\b").getRegex(),
      def: /^ *\[([^\]]+)\]: *<?([^\s>]+)>?(?: +(["(][^\n]+[")]))? *(?:\n+|$)/,
      heading: /^(#{1,6})(.*)(?:\n+|$)/,
      fences: r4t,
      lheading: /^(.+?)\n {0,3}(=+|-+) *(?:\n+|$)/,
      paragraph: hT(Suo).replace("hr", i4t).replace("heading", ` *#{1,6} *[^
]`).replace("lheading", Vpa).replace("|table", "").replace("blockquote", " {0,3}>").replace("|fences", "").replace("|list", "").replace("|html", "").replace("|tag", "").getRegex()
    };
    kyp = /^\\([!"#$%&'()*+,\-./:;<=>?@\[\]\\^_`{|}~])/;
    Ayp = /^(`+)([^`]|[^`][\s\S]*?[^`])\1(?!`)/;
    Kpa = /^( {2,}|\\)\n(?!\s*$)/;
    Iyp = /^(`+|[^`])(?:(?= {2,}\n)|[\s\S]*?(?:(?=[\\<!\[`*_]|\b_|$)|[^ ](?= {2,}\n)))/;
    W2n = /[\p{P}\p{S}]/u;
    wuo = /[\s\p{P}\p{S}]/u;
    Ypa = /[^\s\p{P}\p{S}]/u;
    Pyp = hT(/^((?![*_])punctSpace)/, "u").replace(/punctSpace/g, wuo).getRegex();
    Jpa = /(?!~)[\p{P}\p{S}]/u;
    Oyp = /(?!~)[\s\p{P}\p{S}]/u;
    Dyp = /(?:[^\s\p{P}\p{S}]|~)/u;
    Myp = /\[[^[\]]*?\]\((?:\\.|[^\\\(\)]|\((?:\\.|[^\\\(\)])*\))*\)|`[^`]*?`|<[^<>]*?>/g;
    Xpa = /^(?:\*+(?:((?!\*)punct)|[^\s*]))|^_+(?:((?!_)punct)|([^\s_]))/;
    Nyp = hT(Xpa, "u").replace(/punct/g, W2n).getRegex();
    Lyp = hT(Xpa, "u").replace(/punct/g, Jpa).getRegex();
    Fyp = hT("^[^_*]*?__[^_*]*?\\*[^_*]*?(?=__)|[^*]+(?=[^*])|(?!\\*)punct(\\*+)(?=[\\s]|$)|notPunctSpace(\\*+)(?!\\*)(?=punctSpace|$)|(?!\\*)punctSpace(\\*+)(?=notPunctSpace)|[\\s](\\*+)(?!\\*)(?=punct)|(?!\\*)punct(\\*+)(?!\\*)(?=punct)|notPunctSpace(\\*+)(?=notPunctSpace)", "gu").replace(/notPunctSpace/g, Ypa).replace(/punctSpace/g, wuo).replace(/punct/g, W2n).getRegex();
    Uyp = hT("^[^_*]*?__[^_*]*?\\*[^_*]*?(?=__)|[^*]+(?=[^*])|(?!\\*)punct(\\*+)(?=[\\s]|$)|notPunctSpace(\\*+)(?!\\*)(?=punctSpace|$)|(?!\\*)punctSpace(\\*+)(?=notPunctSpace)|[\\s](\\*+)(?!\\*)(?=punct)|(?!\\*)punct(\\*+)(?!\\*)(?=punct)|notPunctSpace(\\*+)(?=notPunctSpace)", "gu").replace(/notPunctSpace/g, Dyp).replace(/punctSpace/g, Oyp).replace(/punct/g, Jpa).getRegex();
    Byp = hT("^[^_*]*?\\*\\*[^_*]*?_[^_*]*?(?=\\*\\*)|[^_]+(?=[^_])|(?!_)punct(_+)(?=[\\s]|$)|notPunctSpace(_+)(?!_)(?=punctSpace|$)|(?!_)punctSpace(_+)(?=notPunctSpace)|[\\s](_+)(?!_)(?=punct)|(?!_)punct(_+)(?!_)(?=punct)", "gu").replace(/notPunctSpace/g, Ypa).replace(/punctSpace/g, wuo).replace(/punct/g, W2n).getRegex();
    $yp = hT(/\\(punct)/, "gu").replace(/punct/g, W2n).getRegex();
    Hyp = hT(/^<(scheme:[^\s\x00-\x1f<>]*|email)>/).replace("scheme", /[a-zA-Z][a-zA-Z0-9+.-]{1,31}/).replace("email", /[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+(@)[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)+(?![-_])/).getRegex();
    jyp = hT(Euo).replace("(?:-->|$)", "-->").getRegex();
    qyp = hT("^comment|^</[a-zA-Z][\\w:-]*\\s*>|^<[a-zA-Z][\\w-]*(?:attribute)*?\\s*/?>|^<\\?[\\s\\S]*?\\?>|^<![a-zA-Z]+\\s[\\s\\S]*?>|^<!\\[CDATA\\[[\\s\\S]*?\\]\\]>").replace("comment", jyp).replace("attribute", /\s+[a-zA-Z:_][\w.:-]*(?:\s*=\s*"[^"]*"|\s*=\s*'[^']*'|\s*=\s*[^\s"'=<>`]+)?/).getRegex();
    j2n = /(?:\[(?:\\.|[^\[\]\\])*\]|\\.|`[^`]*`|[^\[\]\\`])*?/;
    Wyp = hT(/^!?\[(label)\]\(\s*(href)(?:\s+(title))?\s*\)/).replace("label", j2n).replace("href", /<(?:\\.|[^\n<>\\])+>|[^\s\x00-\x1f]*/).replace("title", /"(?:\\"?|[^"\\])*"|'(?:\\'?|[^'\\])*'|\((?:\\\)?|[^)\\])*\)/).getRegex();
    Zpa = hT(/^!?\[(label)\]\[(ref)\]/).replace("label", j2n).replace("ref", Tuo).getRegex();
    ema = hT(/^!?\[(ref)\](?:\[\])?/).replace("ref", Tuo).getRegex();
    Gyp = hT("reflink|nolink(?!\\()", "g").replace("reflink", Zpa).replace("nolink", ema).getRegex();
    Cuo = {
      _backpedal: r4t,
      anyPunctuation: $yp,
      autolink: Hyp,
      blockSkip: Myp,
      br: Kpa,
      code: Ayp,
      del: r4t,
      emStrongLDelim: Nyp,
      emStrongRDelimAst: Fyp,
      emStrongRDelimUnd: Byp,
      escape: kyp,
      link: Wyp,
      nolink: ema,
      punctuation: Pyp,
      reflink: Zpa,
      reflinkSearch: Gyp,
      tag: qyp,
      text: Iyp,
      url: r4t
    };
    Vyp = {
      ...Cuo,
      link: hT(/^!?\[(label)\]\((.*?)\)/).replace("label", j2n).getRegex(),
      reflink: hT(/^!?\[(label)\]\s*\[([^\]]*)\]/).replace("label", j2n).getRegex()
    };
    _uo = {
      ...Cuo,
      emStrongRDelimAst: Uyp,
      emStrongLDelim: Lyp,
      url: hT(/^((?:ftp|https?):\/\/|www\.)(?:[a-zA-Z0-9\-]+\.?)+[^\s<]*|^email/, "i").replace("email", /[A-Za-z0-9._+-]+(@)[a-zA-Z0-9-_]+(?:\.[a-zA-Z0-9-_]*[a-zA-Z0-9])+(?![-_])/).getRegex(),
      _backpedal: /(?:[^?!.,:;*_'"~()&]+|\([^)]*\)|&(?![a-zA-Z0-9]+;$)|[?!.,:;*_'"~)]+(?!$))+/,
      del: /^(~~?)(?=[^\s~])((?:\\.|[^\\])*?(?:\\.|[^\s~\\]))\1(?=[^~]|$)/,
      text: /^([`~]+|[^`~])(?:(?= {2,}\n)|(?=[a-zA-Z0-9.!#$%&'*+\/=?_`{\|}~-]+@)|[\s\S]*?(?:(?=[\\<!\[`*~_]|\b_|https?:\/\/|ftp:\/\/|www\.|$)|[^ ](?= {2,}\n)|[^a-zA-Z0-9.!#$%&'*+\/=?_`{\|}~-](?=[a-zA-Z0-9.!#$%&'*+\/=?_`{\|}~-]+@)))/
    };
    zyp = {
      ..._uo,
      br: hT(Kpa).replace("{2,}", "*").getRegex(),
      text: hT(_uo.text).replace("\\b_", "\\b_| {2,}\\n").replace(/\{2,\}/g, "*").getRegex()
    };
    H2n = {
      normal: vuo,
      gfm: Ryp,
      pedantic: xyp
    };
    t4t = {
      normal: Cuo,
      gfm: _uo,
      breaks: zyp,
      pedantic: Vyp
    };
    Kyp = {
      "&": "&amp;",
      "<": "&lt;",
      ">": "&gt;",
      '"': "&quot;",
      "'": "&#39;"
    };
    o4t = class o4t {
      options;
      block;
      constructor(e) {
        this.options = e || P9e;
      }
      static passThroughHooks = new Set(["preprocess", "postprocess", "processAllTokens"]);
      preprocess(e) {
        return e;
      }
      postprocess(e) {
        return e;
      }
      processAllTokens(e) {
        return e;
      }
      provideLexer() {
        return this.block ? Bq.lex : Bq.lexInline;
      }
      provideParser() {
        return this.block ? OX.parse : OX.parseInline;
      }
    };
    I9e = new V2n();
    vh.options = vh.setOptions = function (e) {
      I9e.setOptions(e);
      vh.defaults = I9e.defaults;
      Wpa(vh.defaults);
      return vh;
    };
    vh.getDefaults = buo;
    vh.defaults = P9e;
    vh.use = function (...e) {
      I9e.use(...e);
      vh.defaults = I9e.defaults;
      Wpa(vh.defaults);
      return vh;
    };
    vh.walkTokens = function (e, t) {
      return I9e.walkTokens(e, t);
    };
    vh.parseInline = I9e.parseInline;
    vh.Parser = OX;
    vh.parser = OX.parse;
    vh.Renderer = s4t;
    vh.TextRenderer = G2n;
    vh.Lexer = Bq;
    vh.lexer = Bq.lex;
    vh.Tokenizer = A9e;
    vh.Hooks = o4t;
    vh.parse = vh;
    Kqy = vh.options;
    Yqy = vh.setOptions;
    Jqy = vh.use;
    Xqy = vh.walkTokens;
    Qqy = vh.parseInline;
    Zqy = OX.parse;
    e3y = Bq.lex;
  });