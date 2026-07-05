  function Qzi(e, t, n, r = 0, o) {
    let s = an(t);
    let i = e.length;
    if (s >= i - 2) {
      let u = KF(t, 0, i);
      if (an(u) > i) {
        u = KF(t, 0, i - 1);
      }
      let d = o.repeat(Math.max(0, i - an(u)));
      return ["", u, d];
    }
    let a;
    if (n === "center") {
      a = Math.floor((i - s) / 2);
    } else if (n === "start") {
      a = r + 1;
    } else {
      a = i - s - r - 1;
    }
    a = Math.max(1, Math.min(a, i - s - 1));
    let l = e.substring(0, 1) + hm(o, a - 1);
    let c = hm(o, i - a - s - 1) + e.substring(i - 1);
    return [l, t, c];
  }
  function gct(e, t, n) {
    let r = nSe(e, t);
    if (n) {
      r = _$u.dim(r);
    }
    return r;
  }
  var Zzi;
  var NJd;
  var LJd = (e, t, n, r) => {
    if (n.style.borderStyle) {
      let o = Math.floor(n.yogaNode.getComputedWidth());
      let s = Math.floor(n.yogaNode.getComputedHeight());
      let i = typeof n.style.borderStyle === "string" ? NJd[n.style.borderStyle] ?? Zzi.default[n.style.borderStyle] : n.style.borderStyle;
      let a = n.style.borderTopColor ?? n.style.borderColor;
      let l = n.style.borderBottomColor ?? n.style.borderColor;
      let c = n.style.borderLeftColor ?? n.style.borderColor;
      let u = n.style.borderRightColor ?? n.style.borderColor;
      let d = n.style.borderTopDimColor ?? n.style.borderDimColor;
      let p = n.style.borderBottomDimColor ?? n.style.borderDimColor;
      let m = n.style.borderLeftDimColor ?? n.style.borderDimColor;
      let f = n.style.borderRightDimColor ?? n.style.borderDimColor;
      let h = n.style.borderTop !== false;
      let g = n.style.borderBottom !== false;
      let y = n.style.borderLeft !== false;
      let _ = n.style.borderRight !== false;
      let b = Math.max(0, o - (y ? 1 : 0) - (_ ? 1 : 0));
      let S = h ? (y ? i.topLeft : "") + i.top.repeat(b) + (_ ? i.topRight : "") : "";
      let E = Array.isArray(n.style.borderText) ? n.style.borderText : n.style.borderText ? [n.style.borderText] : [];
      let C = E.find(F => F.position === "top");
      let x = E.find(F => F.position === "bottom");
      let A;
      if (h && C) {
        let [F, H, U] = Qzi(S, C.content, C.align, C.offset, i.top);
        A = gct(F, a, d) + H + gct(U, a, d);
      } else if (h) {
        A = gct(S, a, d);
      }
      let k = s;
      if (h) {
        k -= 1;
      }
      if (g) {
        k -= 1;
      }
      k = Math.max(0, k);
      let I = (nSe(i.left, c) + `
`).repeat(k);
      if (m) {
        I = _$u.dim(I);
      }
      let O = (nSe(i.right, u) + `
`).repeat(k);
      if (f) {
        O = _$u.dim(O);
      }
      let M = g ? (y ? i.bottomLeft : "") + i.bottom.repeat(b) + (_ ? i.bottomRight : "") : "";
      let L;
      if (g && x) {
        let [F, H, U] = Qzi(M, x.content, x.align, x.offset, i.bottom);
        L = gct(F, l, p) + H + gct(U, l, p);
      } else if (g) {
        L = gct(M, l, p);
      }
      let P = h ? 1 : 0;
      if (A) {
        r.write(e, t, A);
      }
      if (y) {
        r.write(e, t + P, I);
      }
      if (_) {
        r.write(e + o - 1, t + P, O);
      }
      if (L) {
        r.write(e, t + s - 1, L);
      }
    }
  };
  function Cno(e, t) {
    let n = e && (t?.demoRuler ?? true);
    if (n1n === e && Eno === n) {
      return;
    }
    if (n1n = e, Eno = n, !e) {
      wno = null;
    }
    for (let r of r1n) {
      r();
    }
  }
  function _ct(e) {
    r1n.add(e);
    return () => r1n.delete(e);
  }
  function nKi() {
    return wno;
  }
  function rKi() {
    return n1n;
  }
  function oKi() {
    return Eno;
  }
  function BJd() {
    FJd = {
      enabled: false,
      events: yct,
      position: vno
    };
    for (let e of UJd) {
      e();
    }
  }
  function Rno(e, t, n, r) {
    if (n1n) {
      wno = {
        wheelMode: n.wheelMode
      };
      for (let s of r1n) {
        s();
      }
    }
    if (!false) {
      return;
    }
    let o = Tno === 0 ? 1 / 0 : r - Tno;
    Tno = r;
    iKi({
      kind: "in",
      ts: r,
      dir: e,
      step: t,
      flip: n.pendingFlip && t === 0,
      gap: o,
      mult: n.mult,
      wheelMode: n.wheelMode,
      burst: n.burstCount,
      jbBypass: n.jbBypass
    });
  }
  function sKi(e, t, n) {
    if (!false) {
      return;
    }
    iKi({
      kind: "out",
      ts: performance.now(),
      applied: e,
      remaining: t,
      algo: n
    });
  }
  function xno(e) {
    if (!false) {
      return;
    }
    vno = {
      top: e.getScrollTop(),
      height: e.getScrollHeight(),
      viewport: e.getViewportHeight()
    };
  }
  function iKi(e) {
    yct = yct.length >= 256 ? [...yct.slice(-255), e] : [...yct, e];
    BJd();
  }
  var yct;
  var vno = null;
  var Tno = 0;
  var FJd;
  var UJd;
  var n1n = false;
  var Eno = false;
  var wno = null;
  var r1n;
  var jWe = __lazy(() => {
    yct = [];
    FJd = {
      enabled: false,
      events: yct,
      position: vno
    };
    UJd = new Set();
    r1n = new Set();
  });
  function qWe() {
    return {
      overlayActive: false,
      layoutShifted: false,
      scrollHint: null,
      scrollDrainNode: null,
      followScroll: null,
      absoluteRectsPrev: [],
      absoluteRectsCur: []
    };
  }
  function dKi(e) {
    e.overlayActive = false;
    e.layoutShifted = false;
    e.scrollHint = null;
    e.scrollDrainNode = null;
    e.followScroll = null;
    e.absoluteRectsPrev = e.absoluteRectsCur;
    e.absoluteRectsCur = [];
  }
  function GJd(e, t, n) {
    let r = t > 0 ? 1 : -1;
    let o = Math.abs(t);
    let s = 0;
    if (o > 30) {
      s += r * (o - 30);
      o = 30;
    }
    let i = o <= 5 ? o : o < 12 ? 2 : 3;
    s += r * i;
    let a = o - i;
    let l = Math.max(1, n - 1);
    let c = Math.abs(s);
    if (c > l) {
      let u = c - l;
      e.pendingScrollDelta = r * (a + u);
      return r * l;
    }
    e.pendingScrollDelta = a > 0 ? r * a : undefined;
    return s;
  }
  function VJd(e, t, n) {
    let r = Math.abs(t);
    let o = Math.max(1, n - 1);
    let s = Math.min(o, Math.max(4, r * 3 >> 2));
    if (r <= s) {
      e.pendingScrollDelta = undefined;
      return t;
    }
    let i = t > 0 ? s : -s;
    e.pendingScrollDelta = t - i;
    return i;
  }
  function s1n(e, t) {
    return `${"\x1B]"}8;;${t}${"\x07"}${e}${"\x1B]"}8;;${"\x07"}`;
  }
  function zJd(e) {
    let t = 0;
    for (let o = 0; o < e.length; o++) {
      t += e[o].text.length;
    }
    if (o1n.length < t) {
      o1n = new Uint32Array(Math.max(t, o1n.length * 2));
    }
    let n = o1n.subarray(0, t);
    let r = 0;
    for (let o = 0; o < e.length; o++) {
      let s = r + e[o].text.length;
      n.fill(o, r, s);
      r = s;
    }
    return n;
  }
  function KJd(e, t, n, r, o = false, s) {
    let i = e.split(`
`);
    let a = [];
    let l = 0;
    for (let c = 0; c < i.length; c++) {
      let u = i[c];
      if (o && u.length > 0) {
        let g = /\s/.test(u[0]);
        if (l < r.length && /\s/.test(r[l]) && !g) {
          while (l < r.length && /\s/.test(r[l])) {
            l++;
          }
        }
      }
      let d = "";
      let p = 0;
      let m = n[l] ?? 0;
      for (let g = 0; g < u.length; g++) {
        let y = n[l] ?? m;
        if (y !== m) {
          let _ = u.slice(p, g);
          let b = t[m];
          if (b) {
            let S = Flt(_, b.styles);
            if (b.hyperlink) {
              S = s1n(S, b.hyperlink);
            }
            d += S;
          } else {
            d += _;
          }
          p = g;
          m = y;
        }
        l++;
      }
      let f = u.slice(p);
      let h = t[m];
      if (h) {
        let g = Flt(f, h.styles);
        if (h.hyperlink) {
          g = s1n(g, h.hyperlink);
        }
        d += g;
      } else {
        d += f;
      }
      if (a.push(d), l < r.length && r[l] === "\r") {
        l++;
      }
      if (l < r.length && r[l] === `
`) {
        l++;
      }
      if (s?.[c + 1] === Sre.ContinuationElidedSep && l < r.length && r[l] === " ") {
        l++;
      }
      if (o && c < i.length - 1) {
        let g = i[c + 1];
        let y = g.length > 0 ? g[0] : null;
        while (l < r.length && /\s/.test(r[l])) {
          if (y !== null && r[l] === y) {
            break;
          }
          l++;
        }
      }
    }
    return a.join(`
`);
  }
  function cKi(e, t, n) {
    let r = n === "wrap-stream";
    if (n !== "wrap" && n !== "wrap-trim" && !r) {
      return {
        wrapped: wrapText_export(e, t, n),
        softWrap: undefined
      };
    }
    let o = r ? "wrap" : n;
    let s = e.replace(/\r\n?/g, `
`).split(`
`);
    let i = [];
    let a = [];
    for (let l of s) {
      let c = wrapText_export(l, t, o).split(`
`);
      for (let u = 0; u < c.length; u++) {
        if (u === 0) {
          i.push(c[u]);
          a.push(Sre.HardBreak);
          continue;
        }
        let d = c[u];
        let p = d.startsWith(" ") ? d.slice(1) : d;
        let m = qHt(p) > 0 ? p : d;
        i.push(m);
        a.push(m.length < d.length ? Sre.ContinuationElidedSep : Sre.Continuation);
      }
    }
    if (r) {
      i.pop();
      a.pop();
    }
    return {
      wrapped: i.join(`
`),
      softWrap: a
    };
  }
  function YJd(e, t, n) {
    let r = e.childNodes[0]?.yogaNode;
    if (r) {
      let o = r.getComputedLeft();
      let s = r.getComputedTop();
      if (t = `
`.repeat(s) + bno(t, o), n && s > 0) {
        n.unshift(...Array(s).fill(Sre.HardBreak));
      }
    }
    return t;
  }
  function i1n(e, t, n, {
    offsetX: r = 0,
    offsetY: o = 0,
    prevScreen: s,
    skipSelfBlit: i = false,
    inheritedBackgroundColor: a
  }) {
    let {
      yogaNode: l
    } = e;
    if (l) {
      if (l.getDisplay() === 1) {
        if (e.dirty) {
          let b = Kg.get(e);
          if (b) {
            t.clear({
              x: Math.floor(b.x),
              y: Math.floor(b.y),
              width: Math.floor(b.width),
              height: Math.floor(b.height)
            });
            VHt(e);
            n.layoutShifted = true;
          }
        }
        return;
      }
      let c = r + l.getComputedLeft();
      let u = l.getComputedTop();
      let d = o + u;
      let p = l.getComputedWidth();
      let m = l.getComputedHeight();
      if (d < 0 && e.style.position === "absolute") {
        d = 0;
      }
      let f = Kg.get(e);
      if (!e.dirty && !i && e.pendingScrollDelta === undefined && f && f.x === c && f.y === d && f.width === p && f.height === m && s) {
        let b = Math.floor(c);
        let S = Math.floor(d);
        let E = Math.floor(p);
        let C = Math.floor(m);
        if (t.blit(s, b, S, E, C), e.style.position === "absolute") {
          n.absoluteRectsCur.push(f);
        }
        pKi(e, t, n, s, b, S, E, C);
        return;
      }
      let h = f !== undefined && (f.x !== c || f.y !== d || f.width !== p || f.height !== m);
      if (h) {
        n.layoutShifted = true;
      }
      if (f && (e.dirty || h)) {
        t.clear({
          x: Math.floor(f.x),
          y: Math.floor(f.y),
          width: Math.floor(f.width),
          height: Math.floor(f.height)
        }, e.style.position === "absolute");
      }
      let g = CHt.get(e);
      let y = g !== undefined;
      if (y) {
        n.layoutShifted = true;
        for (let b of g) {
          t.clear({
            x: Math.floor(b.x),
            y: Math.floor(b.y),
            width: Math.floor(b.width),
            height: Math.floor(b.height)
          });
        }
        CHt.delete(e);
      }
      if (m === 0 && QJd(e, l)) {
        Kg.set(e, {
          x: c,
          y: d,
          width: p,
          height: m,
          top: u
        });
        for (let b of e.childNodes) {
          if (b.nodeName !== "#text") {
            mKi(b, c, d);
          }
        }
        e.dirty = false;
        return;
      }
      if (e.nodeName === "ink-raw-ansi") {
        let b = e.attributes.rawText;
        if (b) {
          t.write(c, d, b);
        }
      } else if (e.nodeName === "ink-text") {
        let b = kNn(e, a ? {
          backgroundColor: a
        } : undefined);
        let S = b.map(E => E.text).join("");
        if (S.length > 0) {
          let E = Math.min(DJd(l), t.width - c);
          let C = e.style.textWrap ?? "wrap";
          let x = C === "wrap-stream" || qHt(S) > E;
          let A;
          let k;
          if (x && b.length === 1) {
            let I = b[0];
            let O = cKi(S, E, C);
            k = O.softWrap;
            A = O.wrapped.split(`
`).map(M => {
              let L = Flt(M, I.styles);
              if (I.hyperlink) {
                L = s1n(L, I.hyperlink);
              }
              return L;
            }).join(`
`);
          } else if (x) {
            let I = cKi(S, E, C);
            k = I.softWrap;
            let O = zJd(b);
            A = KJd(I.wrapped, b, O, S, C === "wrap-trim", I.softWrap);
          } else {
            A = b.map(I => {
              let O = Flt(I.text, I.styles);
              if (I.hyperlink) {
                O = s1n(O, I.hyperlink);
              }
              return O;
            }).join("");
          }
          A = YJd(e, A, k);
          t.write(c, d, A, k);
        }
      } else if (e.nodeName === "ink-box") {
        let b = e.style.backgroundColor ?? a;
        if (e.style.noSelect) {
          let M = Math.floor(c);
          let L = e.style.noSelect === "from-left-edge";
          t.noSelect({
            x: L ? 0 : M,
            y: Math.floor(d),
            width: L ? M + Math.floor(p) : Math.floor(p),
            height: Math.floor(m)
          });
        }
        let S = e.style.overflowX ?? e.style.overflow;
        let E = e.style.overflowY ?? e.style.overflow;
        let C = S === "hidden" || S === "scroll";
        let x = E === "hidden" || E === "scroll";
        let A = E === "scroll";
        let k = C || x;
        let I;
        let O;
        if (k) {
          let M = C ? c + l.getComputedBorder(0) : undefined;
          let L = C ? c + l.getComputedWidth() - l.getComputedBorder(2) : undefined;
          I = x ? d + l.getComputedBorder(1) : undefined;
          O = x ? d + l.getComputedHeight() - l.getComputedBorder(3) : undefined;
          t.clip({
            x1: M,
            x2: L,
            y1: I,
            y2: O
          });
        }
        if (A) {
          let M = l.getComputedPadding(1);
          let L = Math.max(0, (O ?? d + m) - (I ?? d) - M - l.getComputedPadding(3));
          let P = e.childNodes.find(me => me.yogaNode);
          let F = P?.yogaNode;
          let H = F?.getComputedHeight() ?? 0;
          let U = e.scrollHeight ?? H;
          let N = e.scrollViewportHeight ?? L;
          e.scrollHeight = H;
          e.scrollViewportHeight = L;
          e.scrollViewportTop = (I ?? d) + M;
          let W = Math.max(0, H - L);
          if (e.scrollAnchor) {
            let me = e.scrollAnchor.el.yogaNode?.getComputedTop();
            if (me != null) {
              e.scrollTop = me + e.scrollAnchor.offset;
              e.pendingScrollDelta = undefined;
            }
            e.scrollAnchor = undefined;
          }
          let j = e.scrollTop ?? 0;
          let z = e.attributes.stickyScroll;
          let V = e.stickyScroll ?? Boolean(z);
          let K = V ? U : Math.max(e.scrollHeightHwm ?? 0, U);
          e.scrollHeightHwm = V ? undefined : Math.max(K, H);
          let J = Math.max(0, K - N);
          let Q = H >= U;
          let Z = e.attributes.followGrowth !== false;
          if ((V || z !== false && Z && Q && j >= J) && (e.pendingScrollDelta ?? 0) >= 0) {
            if (e.scrollTop = W, e.pendingScrollDelta = undefined, e.stickyScroll === false && j >= J) {
              if (W - j > 3) {
                logForDebugging(`render-node-to-output: positional follow re-enabled sticky (scrollTop=${j} prevMax=${J} \u2192 newMax=${W}, prevH=${U} \u2192 ${H})`);
              }
              e.stickyScroll = true;
            }
          }
          let oe = e.scrollTop ?? 0;
          let ee = e.pendingScrollDelta;
          let re = e.scrollClampMin;
          let se = e.scrollClampMax;
          let ae = re !== undefined && se !== undefined;
          if (ee !== undefined && ee !== 0) {
            let Te = ae && (ee < 0 && oe < re || ee > 0 && oe > se) ? Math.min(4, L >> 3) : L;
            let ue = VF().useAdaptiveDrain;
            let ce = ue ? GJd(e, ee, Te) : VJd(e, ee, Te);
            oe += ce;
            sKi(ce, e.pendingScrollDelta ?? 0, ue ? "adaptive" : "proportional");
          } else if (ee === 0) {
            e.pendingScrollDelta = undefined;
          }
          let de = Math.max(0, Math.min(oe, W));
          let be = ae ? Math.max(re, Math.min(de, se)) : de;
          if (e.scrollTop = de, de !== oe) {
            e.pendingScrollDelta = undefined;
          }
          if (e.pendingScrollDelta !== undefined) {
            n.scrollDrainNode = e;
          }
          de = be;
          let fe = de - (e.scrollTopRendered ?? de);
          if (fe !== 0) {
            let me = e.scrollViewportTop ?? 0;
            n.followScroll = {
              delta: fe,
              viewportLeft: Math.floor(c),
              viewportRight: Math.floor(c + p) - 1,
              viewportTop: me,
              viewportBottom: me + L - 1
            };
          }
          if (e.scrollTopRendered = de, P && F) {
            let me = c + F.getComputedLeft();
            let Te = d + F.getComputedTop() - de;
            let ue = Kg.get(P);
            let ce = null;
            if (ue && ue.y !== Te) {
              let ke = ue.y - Te;
              let Ie = Math.floor(d + F.getComputedTop());
              let Ue = Ie + L - 1;
              if (Math.floor(c) <= 0 && Math.floor(c + p) >= t.width && f?.y === d && f.height === m && L > 0 && Math.abs(ke) < L) {
                ce = {
                  top: Ie,
                  bottom: Ue,
                  delta: ke
                };
                n.scrollHint = ce;
              } else {
                n.layoutShifted = true;
              }
            }
            let le = F.getComputedHeight();
            let pe = ue?.height ?? le;
            let ve = le - pe;
            let _e = !ce || ve === 0 || ce.delta > 0 && ve === ce.delta;
            let xe = s && _e && !n.overlayActive;
            if (ce && !xe) {
              n.scrollHint = null;
            }
            if (ce && xe) {
              let {
                top: ke,
                bottom: Ie,
                delta: Ue
              } = ce;
              let Ge = Math.floor(p);
              t.blit(s, Math.floor(c), ke, Ge, Ie - ke + 1);
              t.shift(ke, Ie, Ue);
              let Be = Ue > 0 ? Ie - Ue + 1 : ke;
              let We = Ue > 0 ? Ie : ke - Ue - 1;
              t.clear({
                x: Math.floor(c),
                y: Be,
                width: Ge,
                height: We - Be + 1
              });
              t.clip({
                x1: undefined,
                x2: undefined,
                y1: Be,
                y2: We + 1
              });
              let Ze = P.dirty ? new Set(P.childNodes.filter(kt => kt.dirty)) : null;
              if (Ano(P, t, n, me, Te, y, undefined, Be - Te, We + 1 - Te, b, true), t.unclip(), Ze) {
                let kt = Be - Te;
                let Ye = We + 1 - Te;
                let ht = " ".repeat(Ge);
                let It = 0;
                let Rt;
                for (let wt of P.childNodes) {
                  let vt = wt;
                  let yt = Ze.vZc(wt);
                  if (!yt && It === 0) {
                    if (Kg.vZc(vt)) {
                      continue;
                    }
                  }
                  let gt = vt.yogaNode;
                  if (!gt) {
                    continue;
                  }
                  let Ft = gt.getComputedTop();
                  let on = gt.getComputedHeight();
                  let rn = Ft + on;
                  if (yt) {
                    let Xr = Kg.get(vt);
                    It += on - (Xr ? Xr.height : 0);
                  }
                  if (rn <= de || Ft >= de + L) {
                    continue;
                  }
                  if (Ft >= kt && rn <= Ye) {
                    continue;
                  }
                  let Sn = Math.floor(Te + Ft);
                  if (!yt) {
                    let Xr = Kg.get(vt);
                    if (Xr) {
                      let co = Math.floor(Xr.y) - Ue;
                      if (co === Sn) {
                        continue;
                      }
                      let Yt = Math.max(co, ce.top);
                      let Ee = Math.min(co + Xr.height, Rt ?? ce.bottom + 1);
                      if (Yt < Ee) {
                        t.write(Math.floor(c), Yt, Array(Ee - Yt).fill(ht).join(`
`));
                      }
                    }
                  }
                  let jn = Math.min(Math.floor(Te + rn), Math.floor((I ?? d) + M + L));
                  if (Sn < jn) {
                    Rt ??= Sn;
                    let Xr = Array(jn - Sn).fill(ht).join(`
`);
                    t.write(Math.floor(c), Sn, Xr);
                    t.clip({
                      x1: undefined,
                      x2: undefined,
                      y1: Sn,
                      y2: jn
                    });
                    i1n(vt, t, n, {
                      offsetX: me,
                      offsetY: Te,
                      prevScreen: undefined,
                      inheritedBackgroundColor: b
                    });
                    t.unclip();
                  }
                }
              }
              let Tt = n.absoluteRectsPrev.length ? " ".repeat(Ge) : "";
              for (let kt of n.absoluteRectsPrev) {
                if (kt.y >= Ie + 1 || kt.y + kt.height <= ke) {
                  continue;
                }
                let Ye = Math.max(ke, Math.floor(kt.y) - Ue);
                let ht = Math.min(Ie + 1, Math.floor(kt.y + kt.height) - Ue);
                if (Ye >= Be && ht <= We + 1) {
                  continue;
                }
                if (Ye >= ht) {
                  continue;
                }
                let It = Array(ht - Ye).fill(Tt).join(`
`);
                t.write(Math.floor(c), Ye, It);
                t.clip({
                  x1: undefined,
                  x2: undefined,
                  y1: Ye,
                  y2: ht
                });
                Ano(P, t, n, me, Te, y, undefined, Ye - Te, ht - Te, b, true);
                t.unclip();
              }
            } else {
              let ke = ue && ue.y !== Te;
              if (ke && I !== undefined && O !== undefined) {
                t.clear({
                  x: Math.floor(c),
                  y: Math.floor(I),
                  width: Math.floor(p),
                  height: Math.floor(O - I)
                });
              }
              Ano(P, t, n, me, Te, y, ke || h ? undefined : s, de, de + L, b);
            }
            Kg.set(P, {
              x: me,
              y: Te,
              width: F.getComputedWidth(),
              height: F.getComputedHeight()
            });
            P.dirty = false;
          }
        } else {
          let M = e.style.backgroundColor;
          if (M || e.style.opaque) {
            let L = l.getComputedBorder(0);
            let P = l.getComputedBorder(2);
            let F = l.getComputedBorder(1);
            let H = l.getComputedBorder(3);
            let U = Math.floor(p) - L - P;
            let N = Math.floor(m) - F - H;
            if (U > 0 && N > 0) {
              let W = " ".repeat(U);
              let j = M ? Flt(W, {
                backgroundColor: M
              }) : W;
              let z = Array(N).fill(j).join(`
`);
              t.write(c + L, d + F, z);
            }
          }
          uKi(e, t, n, c, d, y, M || e.style.opaque ? undefined : s, b);
        }
        if (k) {
          t.unclip();
        }
        LJd(c, d, e, t);
      } else if (e.nodeName === "ink-root") {
        uKi(e, t, n, c, d, y, s, a);
      }
      let _ = {
        x: c,
        y: d,
        width: p,
        height: m,
        top: u
      };
      if (Kg.set(e, _), e.style.position === "absolute") {
        n.absoluteRectsCur.push(_);
      }
      e.dirty = false;
    }
  }
  function JJd(e, t, n) {
    if (!e.hasAbsoluteDescendant) {
      return false;
    }
    for (let r of e.childNodes) {
      let o = r;
      if (o.style.position !== "absolute") {
        continue;
      }
      let s = o.yogaNode;
      if (!s || s.getDisplay() === 1) {
        continue;
      }
      let i = Kg.get(o);
      if (!i) {
        continue;
      }
      let a = t + s.getComputedLeft();
      let l = n + s.getComputedTop();
      if (l < 0) {
        l = 0;
      }
      if (i.x !== a || i.y !== l || i.width !== s.getComputedWidth() || i.height !== s.getComputedHeight()) {
        return true;
      }
    }
    return false;
  }
  function uKi(e, t, n, r, o, s, i, a) {
    let l = i !== undefined && JJd(e, r, o);
    let c = false;
    let u = false;
    for (let d of e.childNodes) {
      let p = d;
      let m = p.dirty;
      let f = p.style.position === "absolute";
      if (i1n(p, t, n, {
        offsetX: r,
        offsetY: o,
        prevScreen: s || c || l && !f ? undefined : i,
        skipSelfBlit: u && f && !p.style.opaque && p.style.backgroundColor === undefined,
        inheritedBackgroundColor: a
      }), m && !c) {
        if (!XJd(p) || f) {
          c = true;
        } else {
          u = true;
        }
      }
    }
  }
  function XJd(e) {
    let t = e.style.overflowX ?? e.style.overflow;
    let n = e.style.overflowY ?? e.style.overflow;
    return (t === "hidden" || t === "scroll") && (n === "hidden" || n === "scroll");
  }
  function QJd(e, t) {
    let n = e.parentNode;
    if (!n) {
      return false;
    }
    let r = t.getComputedTop();
    let o = n.childNodes;
    let s = o.indexOf(e);
    for (let i = s + 1; i < o.length; i++) {
      let a = o[i].yogaNode;
      if (!a) {
        continue;
      }
      return a.getComputedTop() === r;
    }
    for (let i = s - 1; i >= 0; i--) {
      let a = o[i].yogaNode;
      if (!a) {
        continue;
      }
      return a.getComputedTop() === r;
    }
    return false;
  }
  function pKi(e, t, n, r, o, s, i, a) {
    if (!e.hasAbsoluteDescendant) {
      return;
    }
    let l = o + i;
    let c = s + a;
    for (let u of e.childNodes) {
      if (u.nodeName === "#text") {
        continue;
      }
      let d = u;
      if (d.style.position === "absolute") {
        let p = Kg.get(d);
        if (p) {
          n.absoluteRectsCur.push(p);
          let m = Math.floor(p.x);
          let f = Math.floor(p.y);
          let h = Math.floor(p.width);
          let g = Math.floor(p.height);
          if (m < o || f < s || m + h > l || f + g > c) {
            t.blit(r, m, f, h, g);
          }
        }
      }
      pKi(d, t, n, r, o, s, i, a);
    }
  }
  function Ano(e, t, n, r, o, s, i, a, l, c, u = false) {
    let d = false;
    let p = 0;
    for (let m of e.childNodes) {
      let f = m;
      let h = f.yogaNode;
      if (h) {
        let y = Kg.get(f);
        let _;
        let b;
        if (y?.top !== undefined && !f.dirty && p === 0) {
          _ = y.top;
          b = y.height;
        } else {
          if (_ = h.getComputedTop(), b = h.getComputedHeight(), f.dirty) {
            p += b - (y ? y.height : 0);
          }
          if (y) {
            y.top = _;
          }
        }
        if (_ + b <= a || _ >= l) {
          if (!u) {
            VHt(f);
          }
          continue;
        }
      }
      let g = f.dirty;
      if (i1n(f, t, n, {
        offsetX: r,
        offsetY: o,
        prevScreen: s || d ? undefined : i,
        inheritedBackgroundColor: c
      }), g) {
        d = true;
      }
    }
  }
  function VHt(e) {
    Kg.delete(e);
    for (let t of e.childNodes) {
      if (t.nodeName !== "#text") {
        VHt(t);
      }
    }
  }
  function mKi(e, t, n) {
    let r = e.yogaNode;
    if (!r || r.getDisplay() === 1) {
      return;
    }
    let o = t + r.getComputedLeft();
    let s = n + r.getComputedTop();
    Kg.set(e, {
      x: o,
      y: s,
      width: r.getComputedWidth(),
      height: r.getComputedHeight(),
      top: r.getComputedTop()
    });
    for (let i of e.childNodes) {
      if (i.nodeName !== "#text") {
        mKi(i, o, s);
      }
    }
  }
  var o1n;
  function KHt(e, t) {
    if (e.nodeName === "#text") {
      return e.nodeValue;
    }
    let n = e.accessibility;
    if (n?.hidden) {
      return "";
    }
    if (e.isHidden || e.yogaNode?.getDisplay() === 1) {
      return "";
    }
    let r = "";
    if (n?.label !== undefined) {
      r = n.label;
    } else if (e.nodeName === "ink-text" || e.nodeName === "ink-virtual-text" || e.nodeName === "ink-link") {
      for (let o of e.childNodes) {
        r += KHt(o, n?.role ?? t);
      }
    } else if (e.nodeName === "ink-box" || e.nodeName === "ink-root") {
      r = ZJd(e, n?.role ?? t);
    }
    if (n?.state) {
      let o = Object.keys(n.state).filter(s => n.state[s]);
      if (o.length > 0) {
        r = `(${o.join(", ")}) ${r}`;
      }
    }
    if (n?.role && n.role !== t) {
      r = `${n.role}: ${r}`;
    }
    return r;
  }
  function ZJd(e, t) {
    let n = e.style.flexDirection ?? "row";
    let r = n === "column" || n === "column-reverse";
    let o = n === "row-reverse" || n === "column-reverse";
    let s = r ? `
` : " ";
    let i = [];
    for (let a of e.childNodes) {
      let l = KHt(a, t);
      if (l !== "") {
        i.push(l);
      }
    }
    if (o) {
      i.reverse();
    }
    return i.join(s);
  }
  function Ino(e, t, n) {
    if (e === t) {
      return 0;
    }
    if (e.nodeName === "#text") {
      return null;
    }
    let r = e.accessibility;
    if (r?.hidden) {
      return null;
    }
    if (e.isHidden || e.yogaNode?.getDisplay() === 1) {
      return null;
    }
    if (r?.label !== undefined) {
      return null;
    }
    if (e.nodeName === "ink-text" || e.nodeName === "ink-virtual-text" || e.nodeName === "ink-link") {
      return null;
    }
    if (e.nodeName !== "ink-box" && e.nodeName !== "ink-root") {
      return null;
    }
    let o = r?.role ?? n;
    let s = 0;
    if (r?.state) {
      let p = Object.keys(r.state).filter(m => r.state[m]);
      if (p.length > 0) {
        s += `(${p.join(", ")}) `.length;
      }
    }
    if (r?.role && r.role !== n) {
      s += `${r.role}: `.length;
    }
    let i = e.style.flexDirection ?? "row";
    let a = i === "column" || i === "column-reverse";
    let l = i === "row-reverse" || i === "column-reverse";
    let c = a ? 1 : 1;
    let u = [];
    for (let p of e.childNodes) {
      let m = KHt(p, o);
      if (m !== "") {
        u.push({
          node: p,
          out: m
        });
      }
    }
    if (l) {
      u.reverse();
    }
    let d = 0;
    for (let p of u) {
      let m = Ino(p.node, t, o);
      if (m !== null) {
        return s + d + m;
      }
      d += p.out.length + c;
    }
    return null;
  }
  var fKi = __lazy(() => {
    gPe();
  });
  function hKi(e, t) {
    let n = t.toLowerCase();
    if (!n) {
      return [];
    }
    let r = n.length;
    let o = e.width;
    let s = e.height;
    let i = e.noSelect;
    let a = [];
    let l = performance.now();
    for (let c = 0; c < s; c++) {
      let u = c * o;
      let d = "";
      let p = [];
      let m = [];
      for (let h = 0; h < o; h++) {
        let g = u + h;
        let y = KJ(e, g);
        if (y.width === 2 || y.width === 3 || i[g] === 1) {
          continue;
        }
        let _ = y.char.toLowerCase();
        let b = p.length;
        for (let S = 0; S < _.length; S++) {
          m.push(b);
        }
        d += _;
        p.push(h);
      }
      let f = d.indexOf(n);
      while (f >= 0) {
        let h = m[f];
        let g = m[f + r - 1];
        let y = p[h];
        let _ = p[g] + 1;
        a.push({
          row: c,
          col: y,
          len: _ - y
        });
        f = d.indexOf(n, f + r);
      }
    }
    tXd.scan += performance.now() - l;
    return a;
  }
  function gKi(e, t, n, r, o) {
    if (o < 0 || o >= n.length) {
      return false;
    }
    let s = n[o];
    let i = s.row + r;
    if (i < 0 || i >= e.height) {
      return false;
    }
    let a = c => t.withCurrentMatch(c);
    let l = i * e.width;
    for (let c = s.col; c < s.col + s.len; c++) {
      if (c < 0 || c >= e.width) {
        continue;
      }
      let u = KJ(e, l + c);
      rct(e, c, i, a(u.styleId));
    }
    return true;
  }
  var eXd;
  var tXd;
  var yKi = __lazy(() => {
    je();
    Ylt();
    iSe();
    WHt();
    iG();
    eXd = __toESM(FMn(), 1);
    tXd = {
      reconcile: 0,
      yoga: 0,
      paint: 0,
      scan: 0,
      calls: 0
    };
  });
  function Pno(e, t) {
    let n;
    let r = qWe();
    return o => {
      let {
        frontFrame: s,
        backFrame: i,
        isTTY: a,
        terminalWidth: l,
        terminalRows: c
      } = o;
      let u = s.screen;
      let d = i.screen;
      let p = d.charPool;
      let m = d.hyperlinkPool;
      let f = e.yogaNode?.getComputedHeight();
      let h = e.yogaNode?.getComputedWidth();
      let g = f === undefined || !Number.isFinite(f) || f < 0;
      let y = h === undefined || !Number.isFinite(h) || h < 0;
      if (!e.yogaNode || g || y) {
        if (e.yogaNode && (g || y)) {
          logForDebugging(`Invalid yoga dimensions: width=${h}, height=${f}, childNodes=${e.childNodes.length}, terminalWidth=${l}, terminalRows=${c}`);
        }
        return {
          screen: zJ(l, 0, t, p, m),
          viewport: {
            width: l,
            height: c
          },
          cursor: {
            x: 0,
            y: 0,
            visible: true
          }
        };
      }
      let _ = Math.floor(e.yogaNode.getComputedWidth());
      let b = Math.floor(e.yogaNode.getComputedHeight());
      let S = o.altScreen ? c : b;
      if (o.altScreen && b > c) {
        logForDebugging(`alt-screen: yoga height ${b} > terminalRows ${c} \u2014 ` + "something is rendering outside <AlternateScreen>. Overflow clipped.", {
          level: "warn"
        });
      }
      let E = d ?? zJ(_, S, t, p, m);
      if (n) {
        n.reset(_, S, E);
      } else {
        n = new lSe({
          width: _,
          height: S,
          stylePool: t,
          screen: E
        });
      }
      dKi(r);
      r.overlayActive = o.overlayActive;
      let C = w8i();
      i1n(e, n, r, {
        prevScreen: C || o.prevFrameContaminated ? undefined : u
      });
      let x = n.get();
      let A = r.scrollDrainNode;
      if (A) {
        d1(A);
      }
      return {
        scrollHint: o.altScreen ? r.scrollHint : null,
        scrollDrainPending: A !== null,
        followScroll: r.followScroll,
        layoutShifted: r.layoutShifted,
        screen: x,
        viewport: {
          width: l,
          height: o.altScreen ? c + 1 : c
        },
        cursor: {
          x: 0,
          y: o.altScreen ? Math.max(0, Math.min(E.height, c) - 1) : E.height,
          visible: !a || E.height === 0
        }
      };
    };
  }
  var _Ki = __lazy(() => {
    je();
    Ylt();
    oSe();
    WHt();
    iG();
  });
  function a1n() {
    try {
      if (vre.writeSync(1, "\x1B(B\x0F"), vre.writeSync(1, Zbe), vre.writeSync(1, aue), vre.writeSync(1, gHt), vre.writeSync(1, mNn), vre.writeSync(1, pNn), vre.writeSync(1, WF), vre.writeSync(1, "\x1B7" + V8 + "\x1B8"), MWe()) {
        vre.writeSync(1, AMn);
      }
      if (supportsTabStatus()) {
        vre.writeSync(1, s0(IMn));
      }
    } catch (e) {
      if (Zd(e)) {
        logForDebugging(`restoreTerminalModes writeSync failed: ${e}`, {
          level: "error"
        });
      } else {
        throw e;
      }
    }
  }
  var vre;
  var Ono = __lazy(() => {
    je();
    dt();
    mT();
    ore();
    c1();
    qJ();
    Tg();
    vre = require("fs");
  });
  function bKi(e, t, n) {
    if (!t) {
      return false;
    }
    let r = t.toLowerCase();
    let o = r.length;
    let s = e.width;
    let i = e.noSelect;
    let a = e.height;
    let l = false;
    for (let c = 0; c < a; c++) {
      let u = c * s;
      let d = "";
      let p = [];
      let m = [];
      for (let h = 0; h < s; h++) {
        let g = u + h;
        let y = KJ(e, g);
        if (y.width === 2 || y.width === 3 || i[g] === 1) {
          continue;
        }
        let _ = y.char.toLowerCase();
        let b = p.length;
        for (let S = 0; S < _.length; S++) {
          m.push(b);
        }
        d += _;
        p.push(h);
      }
      let f = d.indexOf(r);
      while (f >= 0) {
        l = true;
        let h = m[f];
        let g = m[f + o - 1];
        for (let y = h; y <= g; y++) {
          let _ = p[y];
          let b = KJ(e, u + _);
          rct(e, _, c, n.withInverse(b.styleId));
        }
        f = d.indexOf(r, f + o);
      }
    }
    return l;
  }
  var SKi = __lazy(() => {
    iG();
  });
  var Dno = __lazy(() => {
    Llt();
  });
  function YHt(e) {
    let t = "";
    for (let n = 0; n < e.length; n++) {
      let r = e.charCodeAt(n);
      t += r < 32 || r >= 127 && r <= 159 ? " " : e[n];
    }
    return t;
  }
  function lG() {
    let e = JJ.useContext(Z8);
    if (!e) {
      throw Error("useTerminalNotification must be used within TerminalWriteProvider");
    }
    let t = JJ.useCallback(({
      message: i,
      title: a
    }) => {
      let l = a ? `${a}: ${i}` : i;
      e(s0(H_(Wh.ITERM2, YHt(l))));
    }, [e]);
    let n = JJ.useCallback(({
      message: i,
      title: a,
      id: l
    }) => {
      e(s0(H_(Wh.KITTY, `i=${l}:d=0:p=title`, YHt(a))));
      e(s0(H_(Wh.KITTY, `i=${l}:p=body`, YHt(i))));
      e(s0(H_(Wh.KITTY, `i=${l}:d=1:a=focus`, "")));
    }, [e]);
    let r = JJ.useCallback(({
      message: i,
      title: a
    }) => {
      e(s0(H_(Wh.GHOSTTY, "notify", YHt(a), YHt(i))));
    }, [e]);
    let o = JJ.useCallback(() => {
      e("\x07");
    }, [e]);
    let s = JJ.useCallback((i, a) => {
      if (!MWe()) {
        return;
      }
      if (!i) {
        e(s0(H_(Wh.ITERM2, RWe.PROGRESS, xWe.CLEAR, "")));
        return;
      }
      let l = Math.max(0, Math.min(100, Math.round(a ?? 0)));
      switch (i) {
        case "completed":
          e(s0(H_(Wh.ITERM2, RWe.PROGRESS, xWe.CLEAR, "")));
          break;
        case "error":
          e(s0(H_(Wh.ITERM2, RWe.PROGRESS, xWe.ERROR, l)));
          break;
        case "indeterminate":
          e(s0(H_(Wh.ITERM2, RWe.PROGRESS, xWe.INDETERMINATE, "")));
          break;
        case "running":
          e(s0(H_(Wh.ITERM2, RWe.PROGRESS, xWe.SET, l)));
          break;
        case null:
          break;
      }
    }, [e]);
    return JJ.useMemo(() => ({
      notifyITerm2: t,
      notifyKitty: n,
      notifyGhostty: r,
      notifyBell: o,
      progress: s
    }), [t, n, r, o, s]);
  }
  var JJ;
  var Z8;
  var l1n;
  var uq = __lazy(() => {
    mT();
    ore();
    Tg();
    JJ = __toESM(ot(), 1);
    Z8 = JJ.createContext(null);
    l1n = Z8.Provider;
  });
  function EKi(e) {
    return Object.freeze({
      type: "stdout",
      content: rG(e, 1)
    });
  }
  class bct {
    options;
    log;
    terminal;
    scheduleRender;
    isUnmounted = false;
    isPaused = false;
    container;
    rootNode;
    focusManager;
    renderer;
    stylePool;
    charPool;
    hyperlinkPool;
    exitPromise;
    restoreConsole;
    restoreStderr;
    unsubscribeTTYHandlers;
    terminalColumns;
    terminalRows;
    currentNode = null;
    frontFrame;
    backFrame;
    lastPoolResetTime = performance.now();
    lastAtlasResetAt = 0;
    lastStyleLiveSize = 0;
    drainTimer = null;
    lastYogaCounters = {
      ms: 0,
      visited: 0,
      measured: 0,
      cacheHits: 0,
      live: 0
    };
    altScreenParkPatch;
    selection = NVi();
    searchHighlightQuery = "";
    searchPositions = null;
    selectionListeners = new Set();
    frameSink = null;
    hoveredNodes = new Set();
    hasRendered = false;
    renderCalled = false;
    isExiting = false;
    altScreenActive = false;
    _handoffRawMode = false;
    altScreenMouseTracking = "off";
    altScreenBackground;
    prevFrameContaminated = false;
    prevOverlaySig = "";
    needsEraseBeforePaint = false;
    altScreenFullRepaint;
    bgWorkerForceShowCursor;
    fullRepaintSentinelScreen;
    cursorDeclaration = null;
    displayCursor = null;
    accessibilityMode;
    nativeCursorVisible;
    isScreenReaderEnabled;
    prevScreenReaderLines = [];
    prevScreenReaderPark = {
      row: 0,
      col: 0
    };
    resetScreenReaderDiffState() {
      this.prevScreenReaderLines = [];
      this.prevScreenReaderPark = {
        row: 0,
        col: 0
      };
    }
    constructor(e) {
      this.options = e;
      if (zZr(this), this.accessibilityMode = Me.CLAUDE_CODE_ACCESSIBILITY, this.altScreenFullRepaint = st(process.env.CLAUDE_CODE_ALT_SCREEN_FULL_REPAINT), this.bgWorkerForceShowCursor = this.altScreenFullRepaint && !this.options.nativeCursor && process.env.CLAUDE_CODE_SESSION_KIND === "bg" && Wt() === "windows", this.nativeCursorVisible = this.accessibilityMode, this.liveCountsEnabled = st(process.env.CLAUDE_CODE_BENCH_LIVE_COUNTS), this.isScreenReaderEnabled = e.isScreenReaderEnabled ?? (!!e.stdout.isTTY && st(process.env.INK_SCREEN_READER)), this.options.patchConsole) {
        this.restoreConsole = this.patchConsole();
        this.restoreStderr = this.patchStderr();
      }
      if (this.terminal = {
        stdout: e.stdout,
        stderr: e.stderr
      }, e.stdout === process.stdout) {
        if (e.stdout.isTTY) {
          e.stdout.write("\x1B7" + V8 + "\x1B8" + WF);
        }
      }
      this.terminalColumns = e.stdout.columns || 80;
      this.terminalRows = e.stdout.rows || 24;
      this.altScreenParkPatch = EKi(this.terminalRows);
      this.stylePool = new HNn();
      A9i(this.stylePool);
      this.charPool = new $Nn();
      this.hyperlinkPool = new DHt();
      this.frontFrame = RPe(this.terminalRows, this.terminalColumns, this.stylePool, this.charPool, this.hyperlinkPool);
      this.backFrame = RPe(this.terminalRows, this.terminalColumns, this.stylePool, this.charPool, this.hyperlinkPool);
      this.log = new mno({
        isTTY: e.stdout.isTTY || false,
        stylePool: this.stylePool
      });
      let t = () => queueMicrotask(this.onRender);
      this.scheduleRender = p8d(t, 16, {
        leading: true,
        trailing: true
      });
      this.isUnmounted = false;
      this.unsubscribeExit = Ute(this.unmount, {
        alwaysLast: false
      });
      this.rootNode = kHt("ink-root");
      this.focusManager = new FocusManager((n, r) => X8.dispatchDiscrete(n, r));
      this.rootNode.focusManager = this.focusManager;
      this.renderer = Pno(this.rootNode, this.stylePool);
      this.rootNode.onRender = this.scheduleRender;
      this.rootNode.onImmediateRender = this.onRender;
      this.rootNode.onComputeLayout = () => {
        if (this.isUnmounted) {
          return;
        }
        if (this.options.stdout.isTTY && this.syncTerminalSize()) {
          let n = this.currentNode;
          if (n !== null) {
            queueMicrotask(() => {
              if (!this.isUnmounted) {
                this.render(n);
              }
            });
          }
        }
        if (this.rootNode.yogaNode) {
          let n = performance.now();
          let r = this.rootNode.yogaNode;
          if (this.options.stdout.isTTY || this.options.stdout.columns) {
            r.setWidth(this.terminalColumns);
            r.calculateLayout(this.terminalColumns);
          } else if (r.setWidthAuto(), r.calculateLayout(), r.getComputedWidth() > 8192) {
            r.setWidth(8192);
            r.calculateLayout(8192);
          }
          let o = performance.now() - n;
          yVi(o);
          let s = GMn();
          this.lastYogaCounters = {
            ms: o,
            ...s
          };
        }
      };
      this.container = Nto.createContainer(this.rootNode, vKi.ConcurrentRoot, null, false, null, "id", J6d, J6d, J6d, J6d);
    }
    handleResume = () => {
      if (!this.options.stdout.isTTY) {
        return;
      }
      if (this.altScreenActive) {
        this.reenterAltScreen();
        return;
      }
      this.frontFrame = RPe(this.frontFrame.viewport.height, this.frontFrame.viewport.width, this.stylePool, this.charPool, this.hyperlinkPool);
      this.backFrame = RPe(this.backFrame.viewport.height, this.backFrame.viewport.width, this.stylePool, this.charPool, this.hyperlinkPool);
      this.log.reset();
      this.prevFrameContaminated = true;
      this.displayCursor = null;
      this.nativeCursorVisible = this.accessibilityMode;
      this.resetScreenReaderDiffState();
    };
    hasStaleTerminalSize() {
      return (this.options.stdout.columns || 80) !== this.terminalColumns || (this.options.stdout.rows || 24) !== this.terminalRows;
    }
    syncTerminalSize() {
      let e = this.options.stdout.columns || 80;
      let t = this.options.stdout.rows || 24;
      if (e === this.terminalColumns && t === this.terminalRows) {
        return false;
      }
      if (this.terminalColumns = e, this.terminalRows = t, this.altScreenParkPatch = EKi(this.terminalRows), this.resetScreenReaderDiffState(), this.altScreenActive && !this.isPaused && this.options.stdout.isTTY) {
        if (this.altScreenMouseTracking !== "off") {
          this.options.stdout.write(uPe(this.altScreenMouseTracking));
        }
        this.resetFramesForAltScreen();
        this.needsEraseBeforePaint = true;
      }
      return true;
    }
    handleResize = () => {
      if (!this.syncTerminalSize()) {
        return;
      }
      if (this.currentNode !== null) {
        this.render(this.currentNode);
      }
    };
    resolveExitPromise = () => {};
    rejectExitPromise = () => {};
    unsubscribeExit = () => {};
    enterAlternateScreen() {
      this.pause();
      this.options.stdout.write(aue + Zbe + (this.altScreenMouseTracking !== "off" ? mue : "") + (this.altScreenActive ? "" : "\x1B[?1049h") + "\x1B[?1004l\x1B[0m\x1B[?25h\x1B[2J\x1B[H");
      this.suspendStdin();
    }
    exitAlternateScreen() {
      if (this.resumeStdin(), this.altScreenActive) {
        this.options.stdout.write(fNn + "\x1B[2J\x1B[H" + uPe(this.altScreenMouseTracking) + this.altScreenBackgroundSeq() + "\x1B[?25l");
        this.resetFramesForAltScreen();
      } else if (this.options.stdout.write("\x1B[?1049l" + uPe(this.altScreenMouseTracking) + (this.accessibilityMode || this.isScreenReaderEnabled ? "" : "\x1B[?25l")), !this.isScreenReaderEnabled) {
        this.repaint();
      }
      this.resume();
      this.options.stdout.write(aue + Zbe + "\x1B[?1004h" + dNn + mre());
    }
    ensureInteractive = () => {
      if (this.unsubscribeTTYHandlers || !this.options.stdout.isTTY) {
        return;
      }
      if (!this.accessibilityMode && !this.isScreenReaderEnabled) {
        this.options.stdout.write(sG);
      }
      this.options.stdout.on("resize", this.handleResize);
      process.on("SIGCONT", this.handleResume);
      this.unsubscribeTTYHandlers = () => {
        this.options.stdout.off("resize", this.handleResize);
        process.off("SIGCONT", this.handleResume);
      };
    };
    skipSyncMarkers() {
      if (!this.options.stdout.isTTY) {
        return true;
      }
      if (!q2()) {
        return true;
      }
      if (!this.unsubscribeTTYHandlers) {
        return true;
      }
      return false;
    }
    onRender() {
      if (this.isUnmounted || this.isPaused) {
        return;
      }
      if (this.hasRendered && !this.isExiting) {
        this.ensureInteractive();
      }
      if (this.hasRendered = true, this.drainTimer !== null) {
        clearTimeout(this.drainTimer);
        this.drainTimer = null;
      }
      if (flushInteractionTime(), this.isScreenReaderEnabled) {
        this.onRenderScreenReader();
        return;
      }
      let e = performance.now();
      let t = this.options.stdout.columns || 80;
      let n = this.options.stdout.rows || 24;
      let {
        anchor: r,
        focus: o
      } = this.selection;
      let s = this.searchPositions;
      let i = `${r?.row},${r?.col},${o?.row},${o?.col}|${this.searchHighlightQuery}|${s?.currentIdx},${s?.rowOffset},${s?.positions.length}`;
      let a = this.prevFrameContaminated || i !== this.prevOverlaySig;
      this.prevOverlaySig = i;
      let l = r !== null && o !== null && !EPe(this.selection) || !!this.searchHighlightQuery || !!s;
      let c = this.renderer({
        frontFrame: this.frontFrame,
        backFrame: this.backFrame,
        isTTY: this.options.stdout.isTTY,
        terminalWidth: t,
        terminalRows: n,
        altScreen: this.altScreenActive,
        prevFrameContaminated: a,
        overlayActive: l
      });
      let u = performance.now() - e;
      if (this.frameSink) {
        let N = this.frameSink(c, this.stylePool);
        if (N) {
          if (this.backFrame = this.frontFrame, this.frontFrame = c, this.prevFrameContaminated = false, this.maybeResetPools(e), N === "tick") {
            this.drainTimer = setTimeout(() => this.onRender(), 16 >> 2);
          }
          this.options.onFrame?.({
            durationMs: performance.now() - e,
            flickers: []
          });
          return;
        }
      }
      let d = c.followScroll ?? null;
      if (d && this.selection.anchor && this.selection.anchor.row >= d.viewportTop && this.selection.anchor.row <= d.viewportBottom && (this.selection.virtualAnchorCol ?? this.selection.anchor.col) >= d.viewportLeft && (this.selection.virtualAnchorCol ?? this.selection.anchor.col) <= d.viewportRight) {
        let {
          delta: N,
          viewportTop: W,
          viewportBottom: j
        } = d;
        let z = N > 0 ? W : j + N + 1;
        let V = N > 0 ? W + N - 1 : j;
        let K = N > 0 ? "above" : "below";
        if (this.selection.isDragging) {
          if (Tre(this.selection)) {
            Qto(this.selection, this.frontFrame.screen, z, V, K);
          }
          GVi(this.selection, -N, W, j);
        } else if (!this.selection.focus || this.selection.focus.row >= W && this.selection.focus.row <= j && (this.selection.virtualFocusCol ?? this.selection.focus.col) >= d.viewportLeft && (this.selection.virtualFocusCol ?? this.selection.focus.col) <= d.viewportRight) {
          if (Tre(this.selection)) {
            Qto(this.selection, this.frontFrame.screen, z, V, K);
          }
          WVi(this.selection, -N, W, j, this.frontFrame.screen.width);
        }
      }
      let p = false;
      let m = false;
      if (this.altScreenActive) {
        if (p = Tre(this.selection) && !EPe(this.selection), p) {
          KVi(c.screen, this.selection, this.stylePool);
        }
        if (m = bKi(c.screen, this.searchHighlightQuery, this.stylePool), this.searchPositions) {
          let N = this.searchPositions;
          let W = gKi(c.screen, this.stylePool, N.positions, N.rowOffset, N.currentIdx);
          m = m || W;
        }
      }
      if (c.layoutShifted || p || m || a || this.altScreenFullRepaint && this.altScreenActive) {
        c.screen.damage = {
          x: 0,
          y: 0,
          width: c.screen.width,
          height: c.screen.height
        };
      }
      let f = this.frontFrame;
      if (this.altScreenActive) {
        if (f = {
          ...this.frontFrame,
          cursor: rXd
        }, this.altScreenFullRepaint) {
          let {
            width: N,
            height: W
          } = this.frontFrame.screen;
          if (this.fullRepaintSentinelScreen?.width !== N || this.fullRepaintSentinelScreen.height !== W) {
            this.fullRepaintSentinelScreen = zJ(N, W, this.stylePool, this.charPool, this.hyperlinkPool);
            CVi(this.fullRepaintSentinelScreen);
          }
          f = {
            ...f,
            screen: this.fullRepaintSentinelScreen
          };
        }
      }
      let h = performance.now();
      let g = this.log.render(f, c, this.altScreenActive, gNn && !this.altScreenFullRepaint);
      let y = performance.now() - h;
      this.backFrame = this.frontFrame;
      this.frontFrame = c;
      let _ = [];
      for (let N of g) {
        if (N.type === "clearTerminal") {
          if (_.push({
            desiredHeight: c.screen.height,
            availableHeight: c.viewport.height,
            reason: N.reason
          }), Lto() && N.debug) {
            let W = Y8i(this.rootNode, N.debug.triggerY);
            logForDebugging(`[REPAINT] full reset \xB7 ${N.reason} \xB7 row ${N.debug.triggerY}
  prev: "${N.debug.prevLine}"
  next: "${N.debug.nextLine}"
  culprit: ${W.length ? W.join(" < ") : "(no owner chain captured)"}`, {
              level: "warn"
            });
          }
        }
      }
      let b = performance.now();
      let S = hno(g);
      let E = performance.now() - b;
      let C = S.length > 0;
      if (this.altScreenActive && C) {
        if (this.needsEraseBeforePaint) {
          this.needsEraseBeforePaint = false;
          S.unshift(sXd);
        } else {
          S.unshift(oXd);
        }
        S.push(this.altScreenParkPatch);
      }
      let x = this.cursorDeclaration;
      let A = x !== null ? Kg.get(x.node) : undefined;
      let k = x !== null && A !== undefined ? {
        x: A.x + x.relativeX,
        y: A.y + x.relativeY
      } : null;
      let I = this.displayCursor;
      let O = k !== null && (I === null || I.x !== k.x || I.y !== k.y);
      let M = this.options.nativeCursor && k !== null && x !== null && (x.visible || this.accessibilityMode) !== this.nativeCursorVisible;
      if (C || O || M || k === null && I !== null) {
        let N = n - 1;
        let W = j => Math.max(-N, Math.min(N, j));
        if (I !== null && !this.altScreenActive && C) {
          let j = f.cursor.x - I.x;
          let z = W(f.cursor.y - I.y);
          if (j !== 0 || z !== 0) {
            S.unshift({
              type: "stdout",
              content: iue(j, z)
            });
          }
        }
        if (k !== null) {
          if (this.altScreenActive) {
            let j = Math.min(Math.max(k.y + 1, 1), n);
            let z = Math.min(Math.max(k.x + 1, 1), t);
            S.push({
              type: "stdout",
              content: rG(j, z)
            });
          } else {
            let j = !C && I !== null ? I : {
              x: c.cursor.x,
              y: c.cursor.y
            };
            let z = k.x - j.x;
            let V = W(k.y - j.y);
            if (z !== 0 || V !== 0) {
              S.push({
                type: "stdout",
                content: iue(z, V)
              });
            }
          }
          if (this.displayCursor = k, this.options.nativeCursor || this.bgWorkerForceShowCursor) {
            let j = this.bgWorkerForceShowCursor || x !== null && x.visible || this.accessibilityMode;
            if (this.nativeCursorVisible) {
              S.unshift({
                type: "cursorHide"
              });
            }
            if (j) {
              S.push({
                type: "cursorShow"
              });
            }
            this.nativeCursorVisible = j;
          }
        } else {
          if (I !== null && !this.altScreenActive && !C) {
            let j = c.cursor.x - I.x;
            let z = W(c.cursor.y - I.y);
            if (j !== 0 || z !== 0) {
              S.push({
                type: "stdout",
                content: iue(j, z)
              });
            }
          }
          if (this.displayCursor = null, (this.options.nativeCursor || this.bgWorkerForceShowCursor) && this.nativeCursorVisible && !this.accessibilityMode) {
            S.unshift({
              type: "cursorHide"
            });
            this.nativeCursorVisible = false;
          }
        }
      }
      if (C) {
        this.maybeProactiveAtlasReset(S);
      }
      let L = performance.now();
      Beo(this.terminal, S, this.skipSyncMarkers(), n);
      let P = performance.now() - L;
      if (this.maybeResetPools(e), this.prevFrameContaminated = false, c.scrollDrainPending) {
        this.drainTimer = setTimeout(() => this.onRender(), 16 >> 2);
      }
      let F = _Vi();
      let H = SVi();
      let U = this.lastYogaCounters;
      TVi();
      this.lastYogaCounters = {
        ms: 0,
        visited: 0,
        measured: 0,
        cacheHits: 0,
        live: 0
      };
      this.options.onFrame?.({
        durationMs: performance.now() - e,
        phases: {
          renderer: u,
          diff: y,
          optimize: E,
          write: P,
          patches: g.length,
          yoga: F,
          commit: H,
          yogaVisited: U.visited,
          yogaMeasured: U.measured,
          yogaCacheHits: U.cacheHits,
          yogaLive: U.live,
          ...(this.liveCountsEnabled && this.shouldSampleLiveCounts() && {
            domLive: Ozi(this.rootNode),
            fiberLive: Pzi(this.container.current)
          })
        },
        flickers: _
      });
    }
    static LIVE_COUNTS_INTERVAL_MS = 100;
    liveCountsEnabled;
    lastLiveCountSampleAt = 0;
    shouldSampleLiveCounts() {
      let e = performance.now();
      if (e - this.lastLiveCountSampleAt < bct.LIVE_COUNTS_INTERVAL_MS) {
        return false;
      }
      this.lastLiveCountSampleAt = e;
      return true;
    }
    onRenderScreenReader() {
      let e = KHt(this.rootNode);
      let t = this.options.stdout.columns || 80;
      let n = e === "" ? [] : e.split(`
`);
      let r = [];
      let o = [];
      for (let b of n) {
        if (o.push(r.length), b === "") {
          r.push("");
        } else {
          let S = MB(b, t, {
            trim: false,
            hard: true
          });
          for (let E of S.split(`
`)) {
            r.push(E.trimEnd());
          }
        }
      }
      let s = this.prevScreenReaderLines;
      let i = Math.max(0, r.length - 1);
      let a = this.computeScreenReaderPark(e, o, r, t) ?? {
        row: i,
        col: an(r[i] ?? "")
      };
      let l = 0;
      let c = Math.min(s.length, r.length);
      while (l < c && s[l] === r[l]) {
        l++;
      }
      let u = l === s.length && l === r.length;
      let d = this.prevScreenReaderPark;
      let p = a.row === d.row && a.col === d.col;
      if (u && p) {
        return;
      }
      let m = Math.max(0, s.length - 1);
      let f = d.row !== m ? iue(0, m - d.row) : "";
      let h = RMn(s.length - l);
      let g = r.slice(l).join(`
`);
      let y;
      if (u) {
        y = "";
      } else if (l === s.length) {
        y = l > 0 ? `
${g}` : g;
      } else if (l === r.length) {
        y = l > 0 ? h + iue(0, -1) : h;
      } else {
        y = h + g;
      }
      let _ = CMn(a.col + 1) + (a.row !== i ? iue(0, a.row - i) : "");
      this.options.stdout.write(f + y + _);
      this.prevScreenReaderLines = r;
      this.prevScreenReaderPark = a;
    }
    computeScreenReaderPark(e, t, n, r) {
      let o = this.cursorDeclaration;
      if (o === null) {
        return null;
      }
      let s = Ino(this.rootNode, o.node);
      if (s === null) {
        return null;
      }
      let i = e.slice(0, s);
      let l = Ru(i, `
`) + o.relativeY;
      if (l < 0 || l >= t.length) {
        return null;
      }
      let c = i.lastIndexOf(`
`) + 1;
      let d = (o.relativeY === 0 ? an(e.slice(c, s)) : 0) + o.relativeX;
      let p = r > 0 ? Math.floor(d / r) : 0;
      let m = Math.min(t[l] + p, n.length - 1);
      let f = r > 0 ? d % r : d;
      return {
        row: Math.max(0, m),
        col: Math.max(0, f)
      };
    }
    pause() {
      Nto.flushSyncFromReconciler();
      this.onRender();
      this.isPaused = true;
    }
    resume() {
      this.isPaused = false;
      this.onRender();
    }
    repaint() {
      this.frontFrame = RPe(this.frontFrame.viewport.height, this.frontFrame.viewport.width, this.stylePool, this.charPool, this.hyperlinkPool);
      this.backFrame = RPe(this.backFrame.viewport.height, this.backFrame.viewport.width, this.stylePool, this.charPool, this.hyperlinkPool);
      this.log.reset();
      this.displayCursor = null;
      this.prevFrameContaminated = true;
      this.resetScreenReaderDiffState();
    }
    emitAtlasReset(e) {
      if (e) {
        e.unshift({
          type: "stdout",
          content: "\x1B]104;255\x07"
        });
      } else {
        this.options.stdout.write("\x1B]104;255\x07");
      }
      meo();
      this.lastAtlasResetAt = performance.now();
    }
    maybeProactiveAtlasReset(e) {
      if (!PWe) {
        return;
      }
      if (false) {
        return;
      }
      if (oHt().atlasKeys < 2000) {
        return;
      }
      if (!false && performance.now() - this.lastAtlasResetAt < 2000) {
        return;
      }
      if (!Rb()) {
        return;
      }
      this.emitAtlasReset(e);
      deo("delta");
    }
    proactiveAtlasResetOnFocus() {
      if (PWe && !false && this.options.stdout.isTTY && !this.isUnmounted && !this.isPaused && Rb()) {
        this.emitAtlasReset();
        deo("focus");
      }
    }
    forceRedraw(e) {
      if (!this.options.stdout.isTTY || this.isUnmounted || this.isPaused) {
        return false;
      }
      if (e?.flushReact) {
        Nto.flushSyncFromReconciler();
      }
      if (Rb()) {
        this.emitAtlasReset();
      }
      if (this.hasStaleTerminalSize()) {
        this.handleResize();
        return true;
      }
      if (this.altScreenActive) {
        this.needsEraseBeforePaint = true;
        this.displayCursor = null;
        this.resetFramesForAltScreen();
      } else {
        this.log.forceFullReset();
        this.prevFrameContaminated = true;
      }
      this.resetScreenReaderDiffState();
      this.onRender();
      return true;
    }
    async probeExternalClear(e) {
      if (!this.altScreenActive || this.isPaused || this.isUnmounted) {
        return false;
      }
      let t = this.displayCursor;
      if (!t || t.y < 1) {
        return false;
      }
      let n = await e.send(nXd);
      if (n?.row !== 1) {
        return false;
      }
      logForDebugging(`probeExternalClear: detected wipe (parked at y=${t.y}, terminal reports row=1 col=${n.col})`);
      this.forceRedraw();
      return true;
    }
    invalidatePrevFrame() {
      this.prevFrameContaminated = true;
    }
    setAltScreenActive(e, t = "off") {
      if (this.altScreenActive === e) {
        return;
      }
      if (this.altScreenActive = e, this.altScreenMouseTracking = e ? t : "off", e) {
        this.ensureInteractive();
        this.resetFramesForAltScreen();
      } else {
        this.repaint();
      }
    }
    get isAltScreenActive() {
      return this.altScreenActive;
    }
    setAltScreenBackground(e) {
      this.altScreenBackground = e;
    }
    get altScreenBackgroundColor() {
      return this.altScreenBackground;
    }
    getMouseMode = () => this.altScreenMouseTracking;
    handoffAltScreen() {
      this.isPaused = true;
      this.altScreenActive = false;
    }
    handoffRawMode() {
      this._handoffRawMode = true;
    }
    get isHandoffRawMode() {
      return this._handoffRawMode;
    }
    get hasUnmounted() {
      return this.isUnmounted;
    }
    getStylePool() {
      return this.stylePool;
    }
    getCharPool() {
      return this.charPool;
    }
    getHyperlinkPool() {
      return this.hyperlinkPool;
    }
    reassertTerminalModes = (e = false) => {
      if (!this.options.stdout.isTTY) {
        return;
      }
      if (this.isPaused) {
        return;
      }
      if (this.options.stdout.write("\x1B(B\x0F"), this.options.stdout.write(mre()), !this.altScreenActive) {
        return;
      }
      if (this.altScreenMouseTracking !== "off") {
        this.options.stdout.write(uPe(this.altScreenMouseTracking));
      }
      if (e) {
        this.reenterAltScreen();
      }
    };
    detachForShutdown() {
      if (!this.isUnmounted && !this.altScreenActive && this.displayCursor !== null && this.options.stdout.isTTY) {
        let t = this.frontFrame.cursor.x - this.displayCursor.x;
        let n = this.frontFrame.cursor.y - this.displayCursor.y;
        if (t !== 0 || n !== 0) {
          cG.writeSync(1, iue(t, n));
        }
        this.displayCursor = null;
      }
      this.isUnmounted = true;
      this.scheduleRender.cancel?.();
      let e = this.options.stdin;
      if (this.drainStdin(), e.isTTY && e.isRaw) {
        PI(e, false);
      }
      for (let t of new Set([e, process.stdin])) {
        t.removeAllListeners("readable");
        t.removeAllListeners("data");
        t.removeAllListeners("keypress");
        t.pause();
        t.unref?.();
      }
    }
    drainStdin() {
      return Sct(this.options.stdin);
    }
    reenterAltScreen() {
      this.options.stdout.write(dPe() + uPe(this.altScreenMouseTracking) + this.altScreenBackgroundSeq());
      this.resetFramesForAltScreen();
      this.onRender();
    }
    altScreenBackgroundSeq() {
      return this.altScreenBackground ? VNn(this.altScreenBackground) : "";
    }
    resetFramesForAltScreen() {
      let e = this.terminalRows;
      let t = this.terminalColumns;
      let n = () => ({
        screen: zJ(t, e, this.stylePool, this.charPool, this.hyperlinkPool),
        viewport: {
          width: t,
          height: e + 1
        },
        cursor: {
          x: 0,
          y: 0,
          visible: true
        }
      });
      this.frontFrame = n();
      this.backFrame = n();
      this.log.reset();
      this.displayCursor = null;
      this.prevFrameContaminated = true;
    }
    getSelectedText() {
      if (!Tre(this.selection)) {
        return "";
      }
      return zVi(this.selection, this.frontFrame.screen);
    }
    copySelectionNoClear() {
      let e = this.getSelectedText();
      if (e) {
        Uk(e).then(t => {
          if (t) {
            this.options.stdout.write(t);
          }
        });
      }
      return e;
    }
    copySelection() {
      if (!Tre(this.selection)) {
        return "";
      }
      let e = this.copySelectionNoClear();
      LHt(this.selection);
      this.notifySelectionChange();
      return e;
    }
    clearTextSelection() {
      if (!Tre(this.selection)) {
        return;
      }
      LHt(this.selection);
      this.notifySelectionChange();
    }
    setSearchHighlight(e) {
      if (this.searchHighlightQuery === e) {
        return;
      }
      this.searchHighlightQuery = e;
      this.scheduleRender();
    }
    scanElementSubtree(e) {
      if (!this.searchHighlightQuery || !e.yogaNode) {
        return [];
      }
      let t = Math.ceil(e.yogaNode.getComputedWidth());
      let n = Math.ceil(e.yogaNode.getComputedHeight());
      if (t <= 0 || n <= 0) {
        return [];
      }
      let r = e.yogaNode.getComputedLeft();
      let o = e.yogaNode.getComputedTop();
      let s = zJ(t, n, this.stylePool, this.charPool, this.hyperlinkPool);
      let i = new lSe({
        width: t,
        height: n,
        stylePool: this.stylePool,
        screen: s
      });
      i1n(e, i, qWe(), {
        offsetX: -r,
        offsetY: -o,
        prevScreen: undefined
      });
      let a = i.get();
      d1(e);
      let l = hKi(a, this.searchHighlightQuery);
      logForDebugging(`scanElementSubtree: q='${this.searchHighlightQuery}' el=${t}x${n}@(${r},${o}) n=${l.length} [${l.slice(0, 10).map(c => `${c.row}:${c.col}`).join(",")}${l.length > 10 ? ",\u2026" : ""}]`);
      return l;
    }
    setSearchPositions(e) {
      this.searchPositions = e;
      this.scheduleRender();
    }
    setSelectionBgColor(e) {
      let t = lPe("\x00", e, "background");
      let n = t.indexOf("\x00");
      if (n <= 0 || n === t.length - 1) {
        this.stylePool.setSelectionBg(null);
        return;
      }
      this.stylePool.setSelectionBg({
        type: "ansi",
        code: t.slice(0, n),
        endCode: t.slice(n + 1)
      });
    }
    moveSelectionFocus(e) {
      if (!this.altScreenActive) {
        return;
      }
      let {
        focus: t,
        scope: n
      } = this.selection;
      if (!t) {
        return;
      }
      let {
        width: r,
        height: o
      } = this.frontFrame.screen;
      let s = n ? n.x1 : 0;
      let i = (n ? Math.min(n.x2, r) : r) - 1;
      let a = o - 1;
      let {
        col: l,
        row: c
      } = t;
      switch (e) {
        case "left":
          if (l > s) {
            l--;
          } else if (c > 0) {
            l = i;
            c--;
          }
          break;
        case "right":
          if (l < i) {
            l++;
          } else if (c < a) {
            l = s;
            c++;
          }
          break;
        case "up":
          if (c > 0) {
            c--;
          }
          break;
        case "down":
          if (c < a) {
            c++;
          }
          break;
        case "lineStart":
          l = s;
          break;
        case "lineEnd":
          l = i;
          break;
      }
      if (l === t.col && c === t.row) {
        return;
      }
      qVi(this.selection, l, c);
      this.notifySelectionChange();
    }
    hasTextSelection() {
      return Tre(this.selection);
    }
    subscribeToSelectionChange(e) {
      this.selectionListeners.add(e);
      return () => this.selectionListeners.delete(e);
    }
    notifySelectionChange() {
      this.scheduleRender();
      for (let e of this.selectionListeners) {
        e();
      }
    }
    dispatchClick(e, t) {
      if (!this.altScreenActive) {
        return false;
      }
      let n = BWe(this.frontFrame.screen, e, t);
      let r = this.getHyperlinkAt(e, t);
      return kzi(this.rootNode, e, t, n, r);
    }
    dispatchHover(e, t) {
      if (!this.altScreenActive) {
        return;
      }
      let n = BWe(this.frontFrame.screen, e, t);
      Azi(this.rootNode, e, t, this.hoveredNodes, n);
    }
    dispatchPasteEvent(e) {
      let t = this.focusManager.activeElement ?? this.rootNode;
      X8.dispatchDiscrete(t, new aSe(e));
    }
    dispatchWheelEvent = e => {
      let t = e.col != null && e.row != null ? fct(this.rootNode, e.col - 1, e.row - 1) : null;
      let r = (t && uXd(t) ? t : null) ?? this.focusManager.activeElement ?? this.rootNode;
      let o = e.name === "wheeldown" ? 1 : -1;
      X8.dispatchContinuous(r, new uno(o, {
        ctrl: e.ctrl,
        shift: e.shift,
        meta: e.meta || e.option
      }));
    };
    dispatchKeyboardEvent(e) {
      let n = this.focusManager.activeElement ?? this.rootNode;
      let r = new mct(e);
      if (X8.dispatchDiscrete(n, r), !r.defaultPrevented && e.name === "tab" && !e.ctrl && !e.meta) {
        if (e.shift) {
          this.focusManager.focusPrevious(this.rootNode);
        } else {
          this.focusManager.focusNext(this.rootNode);
        }
      }
    }
    getHyperlinkAt(e, t) {
      if (!this.altScreenActive) {
        return;
      }
      let n = this.frontFrame.screen;
      let r = cq(n, e, t);
      let o = r?.hyperlink;
      if (!o && r?.width === 2 && e > 0) {
        o = cq(n, e - 1, t)?.hyperlink;
      }
      return o ?? BVi(n, e, t);
    }
    onHyperlinkClick;
    openHyperlink(e) {
      this.onHyperlinkClick?.(e);
    }
    handleMultiClick(e, t, n) {
      if (!this.altScreenActive) {
        return;
      }
      let r = this.frontFrame.screen;
      if (Xto(this.selection, e, t, pno(this.rootNode, e, t)), n === 2) {
        UVi(this.selection, r, e, t);
      } else {
        HVi(this.selection, r, t);
      }
      if (!this.selection.focus) {
        this.selection.focus = this.selection.anchor;
      }
      this.notifySelectionChange();
    }
    handleSelectionStart(e, t) {
      Xto(this.selection, e, t, pno(this.rootNode, e, t));
    }
    handleSelectionDrag(e, t) {
      if (!this.altScreenActive) {
        return;
      }
      let n = this.selection;
      if (n.anchorSpan) {
        jVi(n, this.frontFrame.screen, e, t);
      } else {
        LVi(n, e, t);
      }
      this.notifySelectionChange();
    }
    stdinListeners = [];
    wasRawMode = false;
    suspendStdin() {
      let e = this.options.stdin;
      if (!e.isTTY) {
        return;
      }
      let t = e.listeners("readable");
      logForDebugging(`[stdin] suspendStdin: removing ${t.length} readable listener(s), wasRawMode=${e.isRaw ?? false}`);
      t.forEach(r => {
        this.stdinListeners.push({
          event: "readable",
          listener: r
        });
        e.removeListener("readable", r);
      });
      let n = e;
      if (n.isRaw) {
        PI(n, false);
        this.wasRawMode = true;
      }
    }
    resumeStdin() {
      let e = this.options.stdin;
      if (!e.isTTY) {
        return;
      }
      if (this.stdinListeners.length === 0 && !this.wasRawMode) {
        logForDebugging("[stdin] resumeStdin: called with no stored listeners and wasRawMode=false (possible desync)", {
          level: "warn"
        });
      }
      if (logForDebugging(`[stdin] resumeStdin: re-attaching ${this.stdinListeners.length} listener(s), wasRawMode=${this.wasRawMode}`), this.stdinListeners.forEach(({
        event: t,
        listener: n
      }) => {
        e.addListener(t, n);
      }), this.stdinListeners = [], this.wasRawMode) {
        PI(e, true);
        this.wasRawMode = false;
      }
    }
    writeRaw(e) {
      this.options.stdout.write(e);
    }
    setCursorDeclaration = (e, t) => {
      if (e === null && t !== undefined && this.cursorDeclaration?.node !== t) {
        return;
      }
      this.cursorDeclaration = e;
    };
    render(e) {
      this.renderCalled = true;
      this.currentNode = e;
      let t = u1n.jsx(QNn, {
        stdin: this.options.stdin,
        stdout: this.options.stdout,
        stderr: this.options.stderr,
        exitOnCtrlC: this.options.exitOnCtrlC,
        onExit: this.unmount,
        terminalColumns: this.terminalColumns,
        terminalRows: this.terminalRows,
        selection: this.selection,
        onSelectionChange: this.notifySelectionChange,
        onClickAt: this.dispatchClick,
        onHoverAt: this.dispatchHover,
        getHyperlinkAt: this.getHyperlinkAt,
        onOpenHyperlink: this.openHyperlink,
        onMultiClick: this.handleMultiClick,
        onSelectionStart: this.handleSelectionStart,
        onSelectionDrag: this.handleSelectionDrag,
        onStdinResume: this.reassertTerminalModes,
        getMouseMode: this.getMouseMode,
        onRawModeEnter: this.ensureInteractive,
        onCursorDeclaration: this.setCursorDeclaration,
        dispatchKeyboardEvent: this.dispatchKeyboardEvent,
        dispatchPasteEvent: this.dispatchPasteEvent,
        dispatchWheelEvent: this.dispatchWheelEvent,
        focusManager: this.focusManager,
        rootNode: this.rootNode,
        isScreenReaderEnabled: this.isScreenReaderEnabled,
        children: u1n.jsx($9i.Provider, {
          value: this.isScreenReaderEnabled,
          children: u1n.jsx(l1n, {
            value: this.writeRaw,
            children: e
          })
        })
      });
      Nto.updateContainerSync(t, this.container, null, J6d);
      Nto.flushSyncWork();
    }
    unmount(e) {
      if (this.isUnmounted) {
        return;
      }
      if (this.isExiting = true, this.onRender(), this.unsubscribeExit(), typeof this.restoreConsole === "function") {
        this.restoreConsole();
      }
      if (this.restoreStderr?.(), this.unsubscribeTTYHandlers?.(), this.renderCalled && !this.isPaused) {
        let t = this.log.renderPreviousOutput_DEPRECATED(this.frontFrame);
        Beo(this.terminal, hno(t), this.skipSyncMarkers(), this.options.stdout.rows || 24);
      }
      if (this.options.stdout.isTTY) {
        try {
          if (this.altScreenActive) {
            cG.writeSync(1, GF());
            this.altScreenActive = false;
          }
          if (this.altScreenBackground) {
            cG.writeSync(1, lct());
            this.altScreenBackground = undefined;
          }
          cG.writeSync(1, mue);
          this.drainStdin();
          a1n();
        } catch (t) {
          if (Zd(t)) {
            logForDebugging(`unmount terminal cleanup writeSync failed: ${t}`, {
              level: "error"
            });
          } else {
            throw t;
          }
        }
      }
      if (this.isUnmounted = true, this.scheduleRender.cancel?.(), this.drainTimer !== null) {
        clearTimeout(this.drainTimer);
        this.drainTimer = null;
      }
      if (Nto.updateContainerSync(null, this.container, null, J6d), Nto.flushSyncWork(), rVd.delete(this.options.stdout), this.rootNode.yogaNode?.free(), this.rootNode.yogaNode = undefined, e instanceof Error) {
        this.rejectExitPromise(e);
      } else {
        this.resolveExitPromise();
      }
    }
    async waitUntilExit() {
      this.exitPromise ||= new Promise((e, t) => {
        this.resolveExitPromise = e;
        this.rejectExitPromise = t;
      });
      return this.exitPromise;
    }
    resetLineCount() {
      if (this.options.stdout.isTTY) {
        this.backFrame = this.frontFrame;
        this.frontFrame = RPe(this.frontFrame.viewport.height, this.frontFrame.viewport.width, this.stylePool, this.charPool, this.hyperlinkPool);
        this.log.reset();
        this.displayCursor = null;
      }
    }
    maybeResetPools(e) {
      let t = e - this.lastPoolResetTime;
      if (t <= 30000) {
        return;
      }
      if (t <= 300000 && !this.stylePool.needsCompaction(this.lastStyleLiveSize)) {
        return;
      }
      this.lastPoolResetTime = e;
      this.resetPools();
    }
    resetPools() {
      let e = this.hyperlinkPool.size > 4096;
      let t = this.stylePool.needsCompaction(this.lastStyleLiveSize);
      if (!e && !t) {
        return;
      }
      if (e) {
        this.hyperlinkPool = new DHt();
      }
      if (xVi(this.frontFrame.screen, this.charPool, this.hyperlinkPool, t ? this.stylePool.compact() : undefined), t) {
        this.lastStyleLiveSize = this.stylePool.size;
      }
      this.backFrame.screen.hyperlinkPool = this.hyperlinkPool;
      this.fullRepaintSentinelScreen = undefined;
    }
    patchConsole() {
      let e = console;
      let t = {};
      let n = (...s) => logForDebugging(`console.log: ${JHt.format(...s)}`);
      let r = s => (...i) => Oe($o(Error(`console.${s}: ${JHt.format(...i)}`), `console.${s} failed`));
      let o = s => (...i) => logForDebugging(`console.${s}: ${JHt.format(...i)}`, {
        level: "warn"
      });
      for (let s of lXd) {
        t[s] = e[s];
        e[s] = n;
      }
      for (let s of cXd) {
        t[s] = e[s];
        e[s] = s === "error" ? (...i) => logForDebugging(`console.error: ${JHt.format(...i)}`, {
          level: "error"
        }) : o(s);
      }
      t.assert = e.assert;
      e.assert = (s, ...i) => {
        if (!s) {
          r("assert")(...i);
        }
      };
      return () => Object.assign(e, t);
    }
    patchStderr() {
      let e = process.stderr;
      let t = e.write;
      let n = false;
      let r = (o, s, i) => {
        let a = typeof s === "function" ? s : i;
        if (n) {
          let l = typeof s === "string" ? s : undefined;
          return t.call(e, o, l, a);
        }
        n = true;
        try {
          let l = typeof o === "string" ? o : Buffer.from(o).toString("utf8");
          if (logForDebugging(`[stderr] ${l}`, {
            level: "warn"
          }), this.altScreenActive && !this.isUnmounted && !this.isPaused) {
            this.prevFrameContaminated = true;
            this.scheduleRender();
          }
        } finally {
          n = false;
          a?.();
        }
        return true;
      };
      e.write = r;
      return () => {
        if (e.write === r) {
          e.write = t;
        }
      };
    }
  }
  function Sct(e = process.stdin) {
    if (!e.isTTY) {
      return;
    }
    let t = [];
    try {
      let s;
      while ((s = e.read()) !== null) {
        t.push(typeof s === "string" ? Buffer.from(s, "utf8") : s);
      }
    } catch {}
    let n = e;
    let r = n.isRaw === true;
    let o = -1;
    try {
      if (!r) {
        n.setRawMode?.(true);
      }
      o = cG.openSync("/dev/tty", cG.constants.O_RDONLY | cG.constants.O_NONBLOCK);
      let s = Buffer.alloc(1024);
      for (let i = 0; i < 64; i++) {
        let a = cG.readSync(o, s, 0, s.length, null);
        if (a <= 0) {
          break;
        }
        t.push(Buffer.from(s.subarray(0, a)));
      }
    } catch {} finally {
      if (o >= 0) {
        try {
          cG.closeSync(o);
        } catch {}
      }
      if (!r) {
        try {
          n.setRawMode?.(false);
        } catch {}
      }
    }
    return t.length ? Buffer.concat(t) : undefined;
  }
  function uXd(e) {
    let t = e;
    while (t) {
      if (t._eventHandlers?.onWheel) {
        return true;
      }
      t = t.parentNode;
    }
    return false;
  }
  var cG;
  var vKi;
  var JHt;
  var u1n;
  var nXd;
  var rXd;
  var oXd;
  var sXd;
  var lXd;
  var cXd;
  var d1n = __lazy(() => {
    at();
    Ot();
    je();
    pr();
    gn();
    dt();
    Rn();
    Cs();
    aPe();
    Zn();
    Llt();
    J8();
    lno();
    Ylt();
    cno();
    ZNn();
    Rzi();
    iSe();
    xzi();
    Izi();
    Dzi();
    Fzi();
    oSe();
    WHt();
    fKi();
    yKi();
    _Ki();
    Ono();
    iG();
    SKi();
    UHt();
    bc();
    Dno();
    mT();
    PMn();
    zNn();
    ore();
    c1();
    qJ();
    Tg();
    uq();
    Kge();
    cG = require("fs");
    vKi = __toESM(FMn(), 1);
    JHt = require("util");
    u1n = __toESM(ie(), 1);
    nXd = gGi();
    rXd = Object.freeze({
      x: 0,
      y: 0,
      visible: false
    });
    oXd = Object.freeze({
      type: "stdout",
      content: gv
    });
    sXd = Object.freeze({
      type: "stdout",
      content: o0 + gv
    });
    lXd = ["log", "info", "debug", "dir", "dirxml", "count", "countReset", "group", "groupCollapsed", "groupEnd", "table", "time", "timeEnd", "timeLog"];
    cXd = ["warn", "error", "trace"];
  });
  async function CKi({
    stdout: e = process.stdout,
    stdin: t = process.stdin,
    stderr: n = process.stderr,
    exitOnCtrlC: r = true,
    patchConsole: o = true,
    onFrame: s,
    nativeCursor: i,
    isScreenReaderEnabled: a
  } = {}) {
    await Promise.resolve();
    let l = new bct({
      stdout: e,
      stdin: t,
      stderr: n,
      exitOnCtrlC: r,
      patchConsole: o,
      onFrame: s,
      nativeCursor: i,
      isScreenReaderEnabled: a
    });
    rVd.set(e, l);
    return {
      render: c => l.render(c),
      unmount: () => l.unmount(),
      waitUntilExit: () => l.waitUntilExit()
    };
  }
  var wKi;
  var dXd = (e, t) => {
    let n = mXd(t);
    let r = {
      stdout: process.stdout,
      stdin: process.stdin,
      stderr: process.stderr,
      exitOnCtrlC: true,
      patchConsole: true,
      ...n
    };
    let o = fXd(r.stdout, () => new bct(r));
    o.render(e);
    return {
      rerender: o.render,
      unmount() {
        o.unmount();
      },
      waitUntilExit: o.waitUntilExit,
      cleanup: () => rVd.delete(r.stdout)
    };
  };
  var pXd = async (e, t) => {
    await Promise.resolve();
    let n = dXd(e, t);
    logForDebugging(`[render] first ink render: ${Math.round(process.uptime() * 1000)}ms since process start`);
    return n;
  };
  var mXd = (e = {}) => {
    if (e instanceof wKi.Stream) {
      return {
        stdout: e,
        stdin: process.stdin
      };
    }
    return e;
  };
  var fXd = (e, t) => {
    let n = rVd.get(e);
    if (!n) {
      n = t();
      rVd.set(e, n);
    }
    return n;
  };
  function kPe() {
    if (yue !== undefined) {
      return yue;
    }
    if (!process.stdout.isTTY) {
      return yue = false;
    }
    if (are()) {
      return yue = false;
    }
    if (!Ueo()) {
      return yue = false;
    }
    if (qs()) {
      return yue = false;
    }
    if (tM()) {
      return yue = false;
    }
    if (st(process.env.CLAUDE_CODE_DECSTBM)) {
      return yue = true;
    }
    yue = getFeatureValue_CACHED_MAY_BE_STALE("tengu_marlin_porch", false);
    return yue;
  }
  var yue;
  var XHt = __lazy(() => {
    mT();
    $n();
    gn();
    zp();
    D8();
  });
  function wre() {
    if (QHt !== undefined) {
      return QHt;
    }
    if (Me.CLAUDE_CODE_ACCESSIBILITY) {
      return QHt = true;
    }
    if (tM()) {
      return QHt = true;
    }
    return QHt = !kPe() && Lno();
  }
  function Lno() {
    if (Me.CLAUDE_CODE_ACCESSIBILITY) {
      return true;
    }
    if (tM()) {
      return true;
    }
    if (st(process.env.CLAUDE_CODE_NATIVE_CURSOR)) {
      return true;
    }
    return getFeatureValue_CACHED_MAY_BE_STALE("tengu_native_cursor", false);
  }
  var QHt;
  var GWe = __lazy(() => {
    XHt();
    $n();
    pr();
    gn();
    D8();
  });
  function color(e, t, n = "foreground") {
    return r => {
      if (!e) {
        return r;
      }
      if (e.startsWith("rgb(") || e.startsWith("#") || e.startsWith("ansi256(") || e.startsWith("ansi:")) {
        return lPe(r, e, n);
      }
      return lPe(r, MJ(t)[e], n);
    };
  }
  var APe = __lazy(() => {
    J8();
    Xbe();
  });
  function Tct(e, t) {
    if (!e) {
      return;
    }
    if (e.startsWith("rgb(") || e.startsWith("#") || e.startsWith("ansi256(") || e.startsWith("ansi:")) {
      return e;
    }
    return t[e];
  }
  function gXd(e) {
    let t = kKi.c(26);
    let n = useResolvedTheme();
    let r;
    if (t[0] !== e.borderColor || t[1] !== n) {
      r = Tct(e.borderColor, n);
      t[0] = e.borderColor;
      t[1] = n;
      t[2] = r;
    } else {
      r = t[2];
    }
    let o;
    if (t[3] !== e.borderTopColor || t[4] !== n) {
      o = Tct(e.borderTopColor, n);
      t[3] = e.borderTopColor;
      t[4] = n;
      t[5] = o;
    } else {
      o = t[5];
    }
    let s;
    if (t[6] !== e.borderBottomColor || t[7] !== n) {
      s = Tct(e.borderBottomColor, n);
      t[6] = e.borderBottomColor;
      t[7] = n;
      t[8] = s;
    } else {
      s = t[8];
    }
    let i;
    if (t[9] !== e.borderLeftColor || t[10] !== n) {
      i = Tct(e.borderLeftColor, n);
      t[9] = e.borderLeftColor;
      t[10] = n;
      t[11] = i;
    } else {
      i = t[11];
    }
    let a;
    if (t[12] !== e.borderRightColor || t[13] !== n) {
      a = Tct(e.borderRightColor, n);
      t[12] = e.borderRightColor;
      t[13] = n;
      t[14] = a;
    } else {
      a = t[14];
    }
    let l;
    if (t[15] !== e.backgroundColor || t[16] !== n) {
      l = Tct(e.backgroundColor, n);
      t[15] = e.backgroundColor;
      t[16] = n;
      t[17] = l;
    } else {
      l = t[17];
    }
    let c;
    if (t[18] !== e || t[19] !== r || t[20] !== o || t[21] !== s || t[22] !== i || t[23] !== a || t[24] !== l) {
      c = AKi.jsx(oJd, {
        ...e,
        borderColor: r,
        borderTopColor: o,
        borderBottomColor: s,
        borderLeftColor: i,
        borderRightColor: a,
        backgroundColor: l
      });
      t[18] = e;
      t[19] = r;
      t[20] = o;
      t[21] = s;
      t[22] = i;
      t[23] = a;
      t[24] = l;
      t[25] = c;
    } else {
      c = t[25];
    }
    return c;
  }
  var kKi;
  var AKi;
  function IKi(e, t) {
    if (!e) {
      return;
    }
    if (e.startsWith("rgb(") || e.startsWith("#") || e.startsWith("ansi256(") || e.startsWith("ansi:")) {
      return e;
    }
    return t[e];
  }
  function Text(e) {
    let t = PKi.c(31);
    let n;
    let r;
    let o;
    let s;
    let i;
    let a;
    let l;
    let c;
    let u;
    let d;
    let p;
    if (t[0] !== e) {
      ({
        color: s,
        backgroundColor: r,
        dimColor: i,
        bold: a,
        italic: l,
        underline: c,
        strikethrough: u,
        inverse: d,
        wrap: p,
        children: o,
        ...n
      } = e);
      t[0] = e;
      t[1] = n;
      t[2] = r;
      t[3] = o;
      t[4] = s;
      t[5] = i;
      t[6] = a;
      t[7] = l;
      t[8] = c;
      t[9] = u;
      t[10] = d;
      t[11] = p;
    } else {
      n = t[1];
      r = t[2];
      o = t[3];
      s = t[4];
      i = t[5];
      a = t[6];
      l = t[7];
      c = t[8];
      u = t[9];
      d = t[10];
      p = t[11];
    }
    let m = i === undefined ? false : i;
    let f = a === undefined ? false : a;
    let h = l === undefined ? false : l;
    let g = c === undefined ? false : c;
    let y = u === undefined ? false : u;
    let _ = d === undefined ? false : d;
    let b = p === undefined ? "wrap" : p;
    let S = useResolvedTheme();
    let E = DKi.useContext(Fno);
    let C;
    if (t[12] !== s || t[13] !== m || t[14] !== E || t[15] !== S) {
      C = m && !E ? S.inactive : IKi(s, S);
      t[12] = s;
      t[13] = m;
      t[14] = E;
      t[15] = S;
      t[16] = C;
    } else {
      C = t[16];
    }
    let x = C;
    let A;
    if (t[17] !== r || t[18] !== S) {
      A = IKi(r, S);
      t[17] = r;
      t[18] = S;
      t[19] = A;
    } else {
      A = t[19];
    }
    let k = A;
    let I;
    if (t[20] !== n || t[21] !== f || t[22] !== o || t[23] !== _ || t[24] !== h || t[25] !== k || t[26] !== x || t[27] !== y || t[28] !== g || t[29] !== b) {
      I = MKi.jsx(BaseText, {
        color: x,
        backgroundColor: k,
        bold: f,
        italic: h,
        underline: g,
        strikethrough: y,
        inverse: _,
        wrap: b,
        ...n,
        children: o
      });
      t[20] = n;
      t[21] = f;
      t[22] = o;
      t[23] = _;
      t[24] = h;
      t[25] = k;
      t[26] = x;
      t[27] = y;
      t[28] = g;
      t[29] = b;
      t[30] = I;
    } else {
      I = t[30];
    }
    return I;
  }
  var PKi;
  var OKi;
  var DKi;
  var MKi;
  var Fno;
  var IPe = __lazy(() => {
    HWe();
    FJ();
    PKi = __toESM(pt(), 1);
    OKi = __toESM(ot(), 1);
    DKi = __toESM(ot(), 1);
    MKi = __toESM(ie(), 1);
    Fno = OKi.createContext(false);
  });