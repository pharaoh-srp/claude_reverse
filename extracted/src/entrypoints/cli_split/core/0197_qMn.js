  var JZr = () => {};
  function qMn(e) {
    return {
      unit: 1,
      value: e
    };
  }
  function UJ(e) {
    return {
      unit: 2,
      value: e
    };
  }
  function mw(e, t) {
    switch (e.unit) {
      case 1:
        return e.value;
      case 2:
        return isNaN(t) ? NaN : e.value * t / 100;
      default:
        return NaN;
    }
  }
  function m_(e) {
    return !isNaN(e);
  }
  function u1(e, t) {
    return e === t || e !== e && t !== t;
  }
  function XZr(e) {
    return new Float64Array(e).fill(NaN);
  }
  function qGi() {
    return {
      direction: 0,
      flexDirection: 0,
      justifyContent: 0,
      alignItems: 4,
      alignSelf: 0,
      alignContent: 1,
      flexWrap: 0,
      overflow: 0,
      display: 0,
      positionType: 1,
      flexGrow: 0,
      flexShrink: 0,
      flexBasis: tSe,
      margin: [,,,,,,,,,].fill(z8),
      padding: [,,,,,,,,,].fill(z8),
      border: [,,,,,,,,,].fill(z8),
      position: [,,,,,,,,,].fill(z8),
      gap: [,,,].fill(z8),
      width: tSe,
      height: tSe,
      minWidth: z8,
      minHeight: z8,
      maxWidth: z8,
      maxHeight: z8
    };
  }
  function sPe(e, t, n, r = false) {
    let o = e[t];
    if (o.unit === 0) {
      if (t === 0 || t === 2) {
        o = e[6];
      } else {
        o = e[7];
      }
    }
    if (o.unit === 0) {
      o = e[8];
    }
    if (o.unit === 0) {
      if (t === 0) {
        o = e[4];
      }
      if (t === 2) {
        o = e[5];
      }
    }
    if (o.unit === 0) {
      return 0;
    }
    if (o.unit === 3) {
      return r ? NaN : 0;
    }
    return mw(o, n);
  }
  function ure(e, t) {
    let n = e[t];
    if (n.unit === 0) {
      if (t === 0 || t === 2) {
        n = e[6];
      } else {
        n = e[7];
      }
    }
    if (n.unit === 0) {
      n = e[8];
    }
    if (n.unit === 0) {
      if (t === 0) {
        n = e[4];
      }
      if (t === 2) {
        n = e[5];
      }
    }
    return n;
  }
  function lue(e, t) {
    return ure(e, t).unit === 3;
  }
  function WGi(e) {
    for (let t = 0; t < 9; t++) {
      if (e[t].unit === 3) {
        return true;
      }
    }
    return false;
  }
  function UMn(e) {
    for (let t = 0; t < 9; t++) {
      if (e[t].unit !== 0) {
        return true;
      }
    }
    return false;
  }
  function QZr(e, t, n) {
    let r = e[6];
    let o = e[7];
    let s = e[8];
    let i = e[4];
    let a = e[5];
    let l = isNaN(t) ? NaN : t / 100;
    let c = e[0];
    if (c.unit === 0) {
      c = r;
    }
    if (c.unit === 0) {
      c = s;
    }
    if (c.unit === 0) {
      c = i;
    }
    if (n[0] = BMn(c, l), c = e[1], c.unit === 0) {
      c = o;
    }
    if (c.unit === 0) {
      c = s;
    }
    if (n[1] = BMn(c, l), c = e[2], c.unit === 0) {
      c = r;
    }
    if (c.unit === 0) {
      c = s;
    }
    if (c.unit === 0) {
      c = a;
    }
    if (n[2] = BMn(c, l), c = e[3], c.unit === 0) {
      c = o;
    }
    if (c.unit === 0) {
      c = s;
    }
    n[3] = BMn(c, l);
  }
  function BMn(e, t) {
    let n = e.unit;
    if (n === 1) {
      return e.value;
    }
    if (n === 2) {
      return e.value * t;
    }
    return 0;
  }
  function nHt(e) {
    return e === 2 || e === 3;
  }
  function c9i(e) {
    return e === 3 || e === 1;
  }
  function m8d(e) {
    return nHt(e) ? 0 : 2;
  }
  function WMn(e) {
    switch (e) {
      case 2:
        return 0;
      case 3:
        return 2;
      case 0:
        return 1;
      case 1:
        return 3;
    }
  }
  function oeo(e) {
    switch (e) {
      case 2:
        return 2;
      case 3:
        return 0;
      case 0:
        return 3;
      case 1:
        return 1;
    }
  }
  function u9i() {
    let e = {
      pointScaleFactor: 1,
      errata: 0,
      useWebDefaults: false,
      free() {},
      isExperimentalFeatureEnabled() {
        return false;
      },
      setExperimentalFeatureEnabled() {},
      setPointScaleFactor(t) {
        e.pointScaleFactor = t;
      },
      getErrata() {
        return e.errata;
      },
      setErrata(t) {
        e.errata = t;
      },
      setUseWebDefaults(t) {
        e.useWebDefaults = t;
      }
    };
    return e;
  }
  class jMn {
    style;
    layout;
    parent;
    children;
    measureFunc;
    config;
    isDirty_;
    isReferenceBaseline_;
    _sz = new Float64Array(3);
    _lineIndex = 0;
    _hasAutoMargin = false;
    _hasPosition = false;
    _hasPadding = false;
    _hasBorder = false;
    _hasMargin = false;
    _lc = XZr(6);
    _lWM = 0;
    _lHM = 0;
    _lFW = false;
    _lFH = false;
    _hasL = false;
    _mc = XZr(6);
    _mWM = 0;
    _mHM = 0;
    _hasM = false;
    _fb = XZr(5);
    _fbCrossMode = 0;
    _fbGen = -1;
    _cIn = null;
    _cOut = null;
    _cGen = -1;
    _cN = 0;
    _cWr = 0;
    _mfC = null;
    _mfN = 0;
    _mfWr = 0;
    _mGen = -1;
    constructor(e) {
      this.style = qGi();
      this.layout = {
        left: 0,
        top: 0,
        width: 0,
        height: 0,
        border: new Float64Array(4),
        padding: new Float64Array(4),
        margin: new Float64Array(4)
      };
      this.parent = null;
      this.children = [];
      this.measureFunc = null;
      this.config = e ?? f8d;
      this.isDirty_ = true;
      this.isReferenceBaseline_ = false;
      neo++;
    }
    insertChild(e, t) {
      e.parent = this;
      this.children.splice(t, 0, e);
      this.markDirty();
    }
    removeChild(e) {
      let t = this.children.indexOf(e);
      if (t >= 0) {
        this.children.splice(t, 1);
        e.parent = null;
        this.markDirty();
      }
    }
    getChild(e) {
      return this.children[e];
    }
    getChildCount() {
      return this.children.length;
    }
    getParent() {
      return this.parent;
    }
    free() {
      this.parent = null;
      this.children = [];
      this.measureFunc = null;
      this._cIn = null;
      this._cOut = null;
      neo--;
    }
    freeRecursive() {
      let e = this.children;
      for (let t = 0, n = e.length; t < n; t++) {
        e[t].freeRecursive();
      }
      this.free();
    }
    reset() {
      this.style = qGi();
      this.children = [];
      this.parent = null;
      this.measureFunc = null;
      this.isDirty_ = true;
      this._hasAutoMargin = false;
      this._hasPosition = false;
      this._hasPadding = false;
      this._hasBorder = false;
      this._hasMargin = false;
      this._hasL = false;
      this._hasM = false;
      this._cN = 0;
      this._cWr = 0;
      this._mfN = 0;
      this._mfWr = 0;
      this._fb[0] = NaN;
      this._mGen = -1;
    }
    markDirty() {
      this.isDirty_ = true;
      this._mfN = 0;
      this._mfWr = 0;
      let e = this.parent;
      if (e && !e.isDirty_) {
        e.markDirty();
      }
    }
    isDirty() {
      return this.isDirty_;
    }
    hasNewLayout() {
      return true;
    }
    markLayoutSeen() {}
    setMeasureFunc(e) {
      this.measureFunc = e;
      this.markDirty();
    }
    unsetMeasureFunc() {
      this.measureFunc = null;
      this.markDirty();
    }
    getComputedLeft() {
      return this.layout.left;
    }
    getComputedTop() {
      return this.layout.top;
    }
    getComputedWidth() {
      return this.layout.width;
    }
    getComputedHeight() {
      return this.layout.height;
    }
    getComputedRight() {
      let e = this.parent;
      if (!e) {
        return 0;
      }
      let t = this.layout;
      return e.layout.width - t.left - t.width;
    }
    getComputedBottom() {
      let e = this.parent;
      if (!e) {
        return 0;
      }
      let t = this.layout;
      return e.layout.height - t.top - t.height;
    }
    getComputedLayout() {
      return {
        left: this.layout.left,
        top: this.layout.top,
        right: this.getComputedRight(),
        bottom: this.getComputedBottom(),
        width: this.layout.width,
        height: this.layout.height
      };
    }
    getComputedBorder(e) {
      return this.layout.border[teo(e)];
    }
    getComputedPadding(e) {
      return this.layout.padding[teo(e)];
    }
    getComputedMargin(e) {
      return this.layout.margin[teo(e)];
    }
    setWidth(e) {
      this.style.width = cre(e);
      this.markDirty();
    }
    setWidthPercent(e) {
      this.style.width = UJ(e);
      this.markDirty();
    }
    setWidthAuto() {
      this.style.width = tSe;
      this.markDirty();
    }
    setHeight(e) {
      this.style.height = cre(e);
      this.markDirty();
    }
    setHeightPercent(e) {
      this.style.height = UJ(e);
      this.markDirty();
    }
    setHeightAuto() {
      this.style.height = tSe;
      this.markDirty();
    }
    setMinWidth(e) {
      this.style.minWidth = cre(e);
      this.markDirty();
    }
    setMinWidthPercent(e) {
      this.style.minWidth = UJ(e);
      this.markDirty();
    }
    setMinHeight(e) {
      this.style.minHeight = cre(e);
      this.markDirty();
    }
    setMinHeightPercent(e) {
      this.style.minHeight = UJ(e);
      this.markDirty();
    }
    setMaxWidth(e) {
      this.style.maxWidth = cre(e);
      this.markDirty();
    }
    setMaxWidthPercent(e) {
      this.style.maxWidth = UJ(e);
      this.markDirty();
    }
    setMaxHeight(e) {
      this.style.maxHeight = cre(e);
      this.markDirty();
    }
    setMaxHeightPercent(e) {
      this.style.maxHeight = UJ(e);
      this.markDirty();
    }
    setFlexDirection(e) {
      this.style.flexDirection = e;
      this.markDirty();
    }
    setFlexGrow(e) {
      this.style.flexGrow = e ?? 0;
      this.markDirty();
    }
    setFlexShrink(e) {
      this.style.flexShrink = e ?? 0;
      this.markDirty();
    }
    setFlex(e) {
      if (e === undefined || isNaN(e)) {
        this.style.flexGrow = 0;
        this.style.flexShrink = 0;
      } else if (e > 0) {
        this.style.flexGrow = e;
        this.style.flexShrink = 1;
        this.style.flexBasis = qMn(0);
      } else if (e < 0) {
        this.style.flexGrow = 0;
        this.style.flexShrink = -e;
      } else {
        this.style.flexGrow = 0;
        this.style.flexShrink = 0;
      }
      this.markDirty();
    }
    setFlexBasis(e) {
      this.style.flexBasis = cre(e);
      this.markDirty();
    }
    setFlexBasisPercent(e) {
      this.style.flexBasis = UJ(e);
      this.markDirty();
    }
    setFlexBasisAuto() {
      this.style.flexBasis = tSe;
      this.markDirty();
    }
    setFlexWrap(e) {
      this.style.flexWrap = e;
      this.markDirty();
    }
    setAlignItems(e) {
      this.style.alignItems = e;
      this.markDirty();
    }
    setAlignSelf(e) {
      this.style.alignSelf = e;
      this.markDirty();
    }
    setAlignContent(e) {
      this.style.alignContent = e;
      this.markDirty();
    }
    setJustifyContent(e) {
      this.style.justifyContent = e;
      this.markDirty();
    }
    setDisplay(e) {
      this.style.display = e;
      this.markDirty();
    }
    getDisplay() {
      return this.style.display;
    }
    setPositionType(e) {
      this.style.positionType = e;
      this.markDirty();
    }
    setPosition(e, t) {
      this.style.position[e] = cre(t);
      this._hasPosition = UMn(this.style.position);
      this.markDirty();
    }
    setPositionPercent(e, t) {
      this.style.position[e] = UJ(t);
      this._hasPosition = true;
      this.markDirty();
    }
    setPositionAuto(e) {
      this.style.position[e] = tSe;
      this._hasPosition = true;
      this.markDirty();
    }
    setOverflow(e) {
      this.style.overflow = e;
      this.markDirty();
    }
    setDirection(e) {
      this.style.direction = e;
      this.markDirty();
    }
    setBoxSizing(e) {}
    setMargin(e, t) {
      let n = cre(t);
      if (this.style.margin[e] = n, n.unit === 3) {
        this._hasAutoMargin = true;
      } else {
        this._hasAutoMargin = WGi(this.style.margin);
      }
      this._hasMargin = this._hasAutoMargin || UMn(this.style.margin);
      this.markDirty();
    }
    setMarginPercent(e, t) {
      this.style.margin[e] = UJ(t);
      this._hasAutoMargin = WGi(this.style.margin);
      this._hasMargin = true;
      this.markDirty();
    }
    setMarginAuto(e) {
      this.style.margin[e] = tSe;
      this._hasAutoMargin = true;
      this._hasMargin = true;
      this.markDirty();
    }
    setPadding(e, t) {
      this.style.padding[e] = cre(t);
      this._hasPadding = UMn(this.style.padding);
      this.markDirty();
    }
    setPaddingPercent(e, t) {
      this.style.padding[e] = UJ(t);
      this._hasPadding = true;
      this.markDirty();
    }
    setBorder(e, t) {
      this.style.border[e] = t === undefined ? z8 : qMn(t);
      this._hasBorder = UMn(this.style.border);
      this.markDirty();
    }
    setGap(e, t) {
      this.style.gap[e] = cre(t);
      this.markDirty();
    }
    setGapPercent(e, t) {
      this.style.gap[e] = UJ(t);
      this.markDirty();
    }
    getFlexDirection() {
      return this.style.flexDirection;
    }
    getJustifyContent() {
      return this.style.justifyContent;
    }
    getAlignItems() {
      return this.style.alignItems;
    }
    getAlignSelf() {
      return this.style.alignSelf;
    }
    getAlignContent() {
      return this.style.alignContent;
    }
    getFlexGrow() {
      return this.style.flexGrow;
    }
    getFlexShrink() {
      return this.style.flexShrink;
    }
    getFlexBasis() {
      return this.style.flexBasis;
    }
    getFlexWrap() {
      return this.style.flexWrap;
    }
    getWidth() {
      return this.style.width;
    }
    getHeight() {
      return this.style.height;
    }
    getOverflow() {
      return this.style.overflow;
    }
    getPositionType() {
      return this.style.positionType;
    }
    getDirection() {
      return this.style.direction;
    }
    copyStyle(e) {}
    setDirtiedFunc(e) {}
    unsetDirtiedFunc() {}
    setIsReferenceBaseline(e) {
      this.isReferenceBaseline_ = e;
      this.markDirty();
    }
    isReferenceBaseline() {
      return this.isReferenceBaseline_;
    }
    setAspectRatio(e) {}
    getAspectRatio() {
      return NaN;
    }
    setAlwaysFormsContainingBlock(e) {}
    calculateLayout(e, t, n) {
      seo = 0;
      ieo = 0;
      aeo = 0;
      Q$t = 0;
      iPe++;
      let r = e === undefined ? NaN : e;
      let o = t === undefined ? NaN : t;
      Nlt(this, r, o, m_(r) ? 1 : 0, m_(o) ? 1 : 0, r, o, true, false, false);
      let s = this.layout.margin;
      let i = mw(ure(this.style.position, 0), m_(r) ? r : 0);
      let a = mw(ure(this.style.position, 1), m_(r) ? r : 0);
      this.layout.left = s[0] + (m_(i) ? i : 0);
      this.layout.top = s[1] + (m_(a) ? a : 0);
      _9i(this, this.config.pointScaleFactor, 0, 0);
    }
  }
  function h8d(e, t, n, r, o, s, i, a, l, c) {
    if (!e._cIn) {
      e._cIn = new Float64Array(4 * 8);
      e._cOut = new Float64Array(4 * 2);
    }
    if (c && e._cGen !== iPe) {
      e._cN = 0;
      e._cWr = 0;
    }
    let u = e._cWr++ % 4;
    if (e._cN < 4) {
      e._cN = e._cWr;
    }
    let d = u * 8;
    let p = e._cIn;
    p[d] = t;
    p[d + 1] = n;
    p[d + 2] = r;
    p[d + 3] = o;
    p[d + 4] = s;
    p[d + 5] = i;
    p[d + 6] = a ? 1 : 0;
    p[d + 7] = l ? 1 : 0;
    let {
      _cOut: m,
      layout: f
    } = e;
    m[u * 2] = f.width;
    m[u * 2 + 1] = f.height;
    e._cGen = iPe;
  }
  function g8d(e, t) {
    let n = e.layout;
    let r = n.width;
    let o = n.height;
    if (t) {
      e._lc[4] = r;
      e._lc[5] = o;
    } else {
      e._mc[4] = r;
      e._mc[5] = o;
    }
  }
  function GMn() {
    return {
      visited: seo,
      measured: ieo,
      measureCacheHits: aeo,
      cacheHits: Q$t,
      live: neo
    };
  }
  function y8d(e, t, n, r, o, s, i, a, l, c, u) {
    let d = e._cGen === iPe && !l;
    let p = l && e._mGen === iPe;
    let m = e.isDirty_;
    if (m && !d || p) {
      return false;
    }
    if (!m && e._hasL && e._lWM === o && e._lHM === s && e._lFW === c && e._lFH === u && u1(e._lc[0], n) && u1(e._lc[1], r) && u1(e._lc[2], i) && u1(e._lc[3], a)) {
      Q$t++;
      t.width = e._lc[4];
      t.height = e._lc[5];
      return true;
    }
    let f = e._cN;
    if (f > 0 && (d || !m)) {
      let {
        _cIn: h,
        _cOut: g
      } = e;
      let y = c ? 1 : 0;
      let _ = u ? 1 : 0;
      for (let b = 0; b < f; b++) {
        let S = b * 8;
        if (h[S + 2] === o && h[S + 3] === s && h[S + 6] === y && h[S + 7] === _ && u1(h[S], n) && u1(h[S + 1], r) && u1(h[S + 4], i) && u1(h[S + 5], a)) {
          t.width = g[b * 2];
          t.height = g[b * 2 + 1];
          Q$t++;
          return true;
        }
      }
    }
    if (!m && !l && e._hasM && e._mWM === o && e._mHM === s && u1(e._mc[0], n) && u1(e._mc[1], r) && u1(e._mc[2], i) && u1(e._mc[3], a)) {
      t.width = e._mc[4];
      t.height = e._mc[5];
      Q$t++;
      return true;
    }
    return false;
  }
  function _8d(e, t, n, r, o, s, i, a, l, c) {
    let u = e.isDirty_;
    if (a) {
      if (e._lc[0] = t, e._lc[1] = n, e._lWM = r, e._lHM = o, e._lc[2] = s, e._lc[3] = i, e._lFW = l, e._lFH = c, e._hasL = true, e.isDirty_ = false, u) {
        e._hasM = false;
      }
    } else if (e._mc[0] = t, e._mc[1] = n, e._mWM = r, e._mHM = o, e._mc[2] = s, e._mc[3] = i, e._hasM = true, e._mGen = iPe, u) {
      e._hasL = false;
    }
    return u;
  }
  function Nlt(e, t, n, r, o, s, i, a, l, c) {
    seo++;
    let {
      style: u,
      layout: d
    } = e;
    if (y8d(e, d, t, n, r, o, s, i, a, l, c)) {
      return;
    }
    let p = _8d(e, t, n, r, o, s, i, a, l, c);
    let m = d.padding;
    let f = d.border;
    let h = d.margin;
    if (e._hasPadding) {
      QZr(u.padding, s, m);
    } else {
      m[0] = m[1] = m[2] = m[3] = 0;
    }
    if (e._hasBorder) {
      QZr(u.border, s, f);
    } else {
      f[0] = f[1] = f[2] = f[3] = 0;
    }
    if (e._hasMargin) {
      QZr(u.margin, s, h);
    } else {
      h[0] = h[1] = h[2] = h[3] = 0;
    }
    let g = m[0] + m[2] + f[0] + f[2];
    let y = m[1] + m[3] + f[1] + f[3];
    let _ = l ? NaN : mw(u.width, s);
    let b = c ? NaN : mw(u.height, i);
    let S = t;
    let E = n;
    let C = r;
    let x = o;
    if (m_(_)) {
      S = _;
      C = 1;
    }
    if (m_(b)) {
      E = b;
      x = 1;
    }
    if (S = K8(u, true, S, s, i), E = K8(u, false, E, s, i), e.children.length === 0) {
      if (e.measureFunc) {
        b8d(e, u, d, S, E, C, x, g, y, s, i);
      } else {
        d.width = C === 1 ? S : K8(u, true, g, s, i);
        d.height = x === 1 ? E : K8(u, false, y, s, i);
      }
    } else {
      S8d(e, u, d, S, E, C, x, g, y, s, i, a);
    }
    g8d(e, a);
    h8d(e, t, n, r, o, s, i, l, c, p);
  }
  function b8d(e, t, n, r, o, s, i, a, l, c, u) {
    let d = s === 0 ? NaN : Math.max(0, r - a);
    let p = d >= 1 ? Math.floor(d) : d;
    let m = i === 0 ? NaN : Math.max(0, o - l);
    let f = m >= 1 ? Math.floor(m) : m;
    ieo++;
    let h = e._mfC;
    for (let b = 0; b < e._mfN; b++) {
      let S = b * 6;
      if (h[S + 1] === s && h[S + 3] === i && u1(h[S], p) && u1(h[S + 2], f)) {
        aeo++;
        n.width = s === 1 ? r : K8(t, true, h[S + 4] + a, c, u);
        n.height = i === 1 ? o : K8(t, false, h[S + 5] + l, c, u);
        return;
      }
    }
    let g = e.measureFunc(p, s, f, i);
    if (!h) {
      h = e._mfC = new Float64Array(4 * 6);
    }
    let y = e._mfWr++ % 4;
    if (e._mfN < 4) {
      e._mfN++;
    }
    let _ = y * 6;
    h[_] = p;
    h[_ + 1] = s;
    h[_ + 2] = f;
    h[_ + 3] = i;
    h[_ + 4] = g.width ?? 0;
    h[_ + 5] = g.height ?? 0;
    n.width = s === 1 ? r : K8(t, true, (g.width ?? 0) + a, c, u);
    n.height = i === 1 ? o : K8(t, false, (g.height ?? 0) + l, c, u);
  }
  function S8d(e, t, n, r, o, s, i, a, l, c, u, d) {
    let {
      padding: p,
      border: m
    } = n;
    let f = t.flexDirection;
    let h = m8d(f);
    let g = nHt(f);
    let y = g ? r : o;
    let _ = g ? o : r;
    let b = g ? s : i;
    let S = g ? i : s;
    let E = g ? a : l;
    let C = g ? l : a;
    let x = m_(y) ? Math.max(0, y - E) : NaN;
    let A = m_(_) ? Math.max(0, _ - C) : NaN;
    let k = ZGi(t, g ? 0 : 1, x);
    let I = [];
    let O = [];
    y9i(e, I, O);
    let M = m_(r) ? r : NaN;
    let L = m_(o) ? o : NaN;
    let P = t.flexWrap !== 0;
    let F = ZGi(t, g ? 1 : 0, A);
    let H = I.length;
    for (let Ze = 0; Ze < H; Ze++) {
      let Tt = I[Ze];
      Tt._sz[0] = I8d(Tt, f, x, A, S, M, L);
    }
    let U;
    if (!P || !m_(x) || H === 0) {
      for (let Ze = 0; Ze < H; Ze++) {
        I[Ze]._lineIndex = 0;
      }
      U = [I];
    } else {
      U = w8d(I, x, g, f, M, L, k);
    }
    let N = U.length;
    let W = M8d(e, I);
    let j = new Float64Array(N);
    let z = new Float64Array(N);
    let V = W ? new Float64Array(N) : T8d;
    let K = g ? c : u;
    let J = 0;
    let Q = 0;
    for (let Ze = 0; Ze < N; Ze++) {
      let Tt = U[Ze];
      E8d(Tt, t, f, h, g, x, A, S, k, M, L, K, E, P, d);
      let kt = p9i;
      if (W) {
        kt = C8d(e, Tt, M, V, Ze, kt);
      }
      let Ye = d9i;
      j[Ze] = Ye;
      z[Ze] = kt;
      J = Math.max(J, Ye);
      Q += kt;
    }
    let Z = N > 1 ? F * (N - 1) : 0;
    Q += Z;
    let ne = t.overflow === 2;
    let oe = J + E;
    let ee = b === 1 ? y : b === 2 && ne ? Math.max(Math.min(y, oe), E) : P && N > 1 && b === 2 ? y : oe;
    let re = Q + C;
    let se = S === 1 ? _ : S === 2 && ne ? Math.max(Math.min(_, re), C) : re;
    let ae = K8(t, true, g ? ee : se, c, u);
    let de = K8(t, false, g ? se : ee, c, u);
    if (n.width = ae, n.height = de, !d) {
      return;
    }
    let be = (g ? ae : de) - E;
    let fe = (g ? de : ae) - C;
    let me = WMn(f);
    let Te = g ? 1 : 0;
    let ue = g ? 3 : 2;
    let ce = c9i(f);
    let le = g ? ae : de;
    let ve = p[Te] + m[Te];
    let _e = F;
    let xe = fe - Q;
    if (N === 1 && !P && !W) {
      z[0] = fe;
    } else {
      R8d(t.alignContent, xe, N, z);
      ve += Olt;
      _e += AWe;
    }
    let ke = t.flexWrap === 2;
    let Ie = g ? de : ae;
    let Ue = P || S !== 1;
    let Ge = p[me] + m[me];
    let Be = t.alignItems;
    let We = ve;
    for (let Ze = 0; Ze < N; Ze++) {
      let Tt = U[Ze];
      let kt = z[Ze];
      if (Ue) {
        x8d(Tt, Be, g, h, Te, ue, kt, M, L, d);
      }
      v8d(Tt, t, f, g, kt, ke ? Ie - We - kt : We, j[Ze], be, Ge, le, k, M, ce, ke, W, W ? V[Ze] : 0);
      We += kt + _e;
    }
    for (let Ze = 0, Tt = O.length; Ze < Tt; Ze++) {
      A8d(e, O[Ze], ae, de, p, m);
    }
  }
  function E8d(e, t, n, r, o, s, i, a, l, c, u, d, p, m, f) {
    let h = e.length;
    let g = t.alignItems;
    let y = h > 1 ? l * (h - 1) : 0;
    let _ = y;
    for (let O = 0; O < h; O++) {
      let M = e[O];
      _ += M._sz[0] + IWe(M, n, c);
    }
    let b = s;
    if (b !== b) {
      let O = mw(o ? t.minWidth : t.minHeight, d);
      let M = mw(o ? t.maxWidth : t.maxHeight, d);
      if (M === M && _ > M - p) {
        b = Math.max(0, M - p);
      } else if (O === O && _ < O - p) {
        b = Math.max(0, O - p);
      }
    }
    D8d(e, b, _, o, c, u);
    let S = o ? 1 : 0;
    let E = o ? 3 : 2;
    let C = i === i;
    let x = 0;
    for (let O = 0; O < h; O++) {
      let M = e[O];
      let L = M.style;
      let P = L.alignSelf;
      let F = P === 0 ? g : P;
      let H = IWe(M, r, c);
      let U = NaN;
      let N = 0;
      let W = mw(o ? L.height : L.width, o ? u : c);
      let j = false;
      if (M._hasAutoMargin) {
        let J = L.margin;
        j = lue(J, S) || lue(J, E);
      }
      if (W === W) {
        U = W;
        N = 1;
      } else if (F === 4 && !j && !m && C && a === 1) {
        U = Math.max(0, i - H);
        N = 1;
      } else if (!m && C) {
        U = Math.max(0, i - H);
        N = 2;
      }
      let z = o ? M._sz[1] : U;
      let V = o ? U : M._sz[1];
      Nlt(M, z, V, o ? 1 : N, o ? N : 1, c, u, f, o, !o);
      let K = M.layout;
      M._sz[2] = o ? K.height : K.width;
      x = Math.max(x, M._sz[2] + H);
    }
    let A = WMn(n);
    let k = oeo(n);
    let I = y;
    for (let O = 0; O < h; O++) {
      let M = e[O];
      let L = M.layout.margin;
      I += M._sz[1] + L[A] + L[k];
    }
    d9i = I;
    p9i = x;
  }
  function v8d(e, t, n, r, o, s, i, a, l, c, u, d, p, m, f, h) {
    let g = e.length;
    let y = t.alignItems;
    let _ = WMn(n);
    let b = oeo(n);
    let S = r ? 1 : 0;
    let E = r ? 3 : 2;
    let C = l;
    let x = u;
    let A = 0;
    for (let L = 0; L < g; L++) {
      let P = e[L];
      if (!P._hasAutoMargin) {
        continue;
      }
      let F = P.style.margin;
      if (lue(F, _)) {
        A++;
      }
      if (lue(F, b)) {
        A++;
      }
    }
    let k = a - i;
    let I = Math.max(0, k);
    let O = A > 0 && I > 0 ? I / A : 0;
    if (A === 0) {
      switch (t.justifyContent) {
        case 0:
          break;
        case 1:
          C += k / 2;
          break;
        case 2:
          C += k;
          break;
        case 3:
          if (g > 1) {
            x += I / (g - 1);
          }
          break;
        case 4:
          if (g > 0) {
            x += I / g;
            C += I / g / 2;
          }
          break;
        case 5:
          if (g > 0) {
            x += I / (g + 1);
            C += I / (g + 1);
          }
          break;
      }
    }
    let M = C;
    for (let L = 0; L < g; L++) {
      let P = e[L];
      let F = P.style;
      let H = P.layout;
      let U = P._sz[1];
      let N = F.margin;
      let W = H.margin;
      let j = false;
      let z = false;
      let V = false;
      let K = false;
      let J;
      let Q;
      let Z;
      let ne;
      if (P._hasAutoMargin) {
        j = lue(N, _);
        z = lue(N, b);
        V = lue(N, S);
        K = lue(N, E);
        J = j ? O : W[_];
        Q = z ? O : W[b];
        Z = V ? 0 : W[S];
        ne = K ? 0 : W[E];
      } else {
        J = W[_];
        Q = W[b];
        Z = W[S];
        ne = W[E];
      }
      let oe = p ? c - (M + J) - U : M + J;
      let ee = F.alignSelf;
      let re = ee === 0 ? y : ee;
      let se = s + Z;
      let ae = o - P._sz[2] - Z - ne;
      if (V && K) {
        se += Math.max(0, ae) / 2;
      } else if (V) {
        se += Math.max(0, ae);
      } else if (K) {
        ;
      } else {
        switch (re) {
          case 1:
          case 4:
            if (m) {
              se += ae;
            }
            break;
          case 2:
            se += ae / 2;
            break;
          case 3:
            if (!m) {
              se += ae;
            }
            break;
          case 5:
            if (f) {
              se = s + h - leo(P);
            }
            break;
          default:
            break;
        }
      }
      let de = r ? oe : se;
      let be = r ? se : oe;
      if (P._hasPosition) {
        k8d(P, d, H, de, be);
      } else {
        H.left = de;
        H.top = be;
      }
      M += U + J + Q + x;
    }
  }
  function w8d(e, t, n, r, o, s, i) {
    let a = [];
    let l = e.length;
    let c = 0;
    let u = 0;
    for (let d = 0; d < l; d++) {
      let p = e[d];
      let m = K8(p.style, n, p._sz[0], o, s);
      let f = Math.max(0, m) + IWe(p, r, o);
      let h = d > c ? i : 0;
      if (d > c && u + h + f > t) {
        a.push(e.slice(c, d));
        c = d;
        u = f;
      } else {
        u += h + f;
      }
      p._lineIndex = a.length;
    }
    a.push(e.slice(c));
    return a;
  }
  function C8d(e, t, n, r, o, s) {
    let i = 0;
    let a = 0;
    for (let c = 0, u = t.length; c < u; c++) {
      let d = t[c];
      if (h9i(e, d) !== 5) {
        continue;
      }
      let p = d.style.margin;
      let m = sPe(p, 1, n);
      let f = sPe(p, 3, n);
      let h = leo(d) + m;
      let g = d.layout.height + m + f - h;
      if (h > i) {
        i = h;
      }
      if (g > a) {
        a = g;
      }
    }
    r[o] = i;
    let l = i + a;
    return l > s ? l : s;
  }
  function R8d(e, t, n, r) {
    let o = Math.max(0, t);
    switch (Olt = 0, AWe = 0, e) {
      case 1:
        break;
      case 2:
        Olt = t / 2;
        break;
      case 3:
        Olt = t;
        break;
      case 4:
        if (n > 0 && o > 0) {
          let s = o / n;
          for (let i = 0; i < n; i++) {
            r[i] += s;
          }
        }
        break;
      case 6:
        if (n > 1) {
          AWe = o / (n - 1);
        }
        break;
      case 7:
        if (n > 0) {
          AWe = o / n;
          Olt = AWe / 2;
        }
        break;
      case 8:
        if (n > 0) {
          AWe = o / (n + 1);
          Olt = AWe;
        }
        break;
      default:
        break;
    }
  }
  function x8d(e, t, n, r, o, s, i, a, l, c) {
    for (let u = 0, d = e.length; u < d; u++) {
      let p = e[u];
      let m = p.style;
      let f = m.alignSelf;
      if ((f === 0 ? t : f) !== 4) {
        continue;
      }
      if (m_(mw(n ? m.height : m.width, n ? l : a))) {
        continue;
      }
      if (p._hasAutoMargin) {
        let b = m.margin;
        if (lue(b, o) || lue(b, s)) {
          continue;
        }
      }
      let y = IWe(p, r, a);
      let _ = Math.max(0, i - y);
      if (p._sz[2] !== _) {
        let b = p._sz[1];
        Nlt(p, n ? b : _, n ? _ : b, 1, 1, a, l, c, n, !n);
        p._sz[2] = _;
      }
    }
  }
  function k8d(e, t, n, r, o) {
    let s = e.style.position;
    let i = mw(ure(s, 0), t);
    let a = mw(ure(s, 2), t);
    let l = mw(ure(s, 1), t);
    let c = mw(ure(s, 3), t);
    let u = m_(i) ? i : m_(a) ? -a : 0;
    let d = m_(l) ? l : m_(c) ? -c : 0;
    n.left = r + u;
    n.top = o + d;
  }
  function A8d(e, t, n, r, o, s) {
    let i = t.style;
    let a = ure(i.position, 0);
    let l = ure(i.position, 2);
    let c = ure(i.position, 1);
    let u = ure(i.position, 3);
    let d = mw(a, n);
    let p = mw(l, n);
    let m = mw(c, r);
    let f = mw(u, r);
    let h = n - s[0] - s[2];
    let g = r - s[1] - s[3];
    let y = mw(i.width, h);
    let _ = mw(i.height, g);
    if (!m_(y) && m_(d) && m_(p)) {
      y = h - d - p;
    }
    if (!m_(_) && m_(m) && m_(f)) {
      _ = g - m - f;
    }
    Nlt(t, y, _, m_(y) ? 1 : 0, m_(_) ? 1 : 0, h, g, true, false, false);
    let b = sPe(i.margin, 0, n);
    let S = sPe(i.margin, 1, n);
    let E = sPe(i.margin, 2, n);
    let C = sPe(i.margin, 3, n);
    let x = e.style;
    let A = x.flexDirection;
    let k = c9i(A);
    let I = nHt(A);
    let O = x.flexWrap === 2;
    let M = x.justifyContent;
    let L = i.alignSelf;
    let P = L === 0 ? x.alignItems : L;
    let F = t.layout;
    let H = F.width;
    let U = F.height;
    let N;
    if (m_(d)) {
      N = s[0] + d + b;
    } else if (m_(p)) {
      N = n - s[2] - p - H - E;
    } else if (I) {
      let j = o[0] + s[0];
      let z = n - o[2] - s[2];
      N = k ? z - H - E : GGi(M, j, z, H) + b;
    } else {
      N = VGi(P, o[0] + s[0], n - o[2] - s[2], H, O) + b;
    }
    let W;
    if (m_(m)) {
      W = s[1] + m + S;
    } else if (m_(f)) {
      W = r - s[3] - f - U - C;
    } else if (I) {
      W = VGi(P, o[1] + s[1], r - o[3] - s[3], U, O) + S;
    } else {
      let j = o[1] + s[1];
      let z = r - o[3] - s[3];
      W = k ? z - U - C : GGi(M, j, z, U) + S;
    }
    F.left = N;
    F.top = W;
  }
  function GGi(e, t, n, r) {
    switch (e) {
      case 1:
        return t + (n - t - r) / 2;
      case 2:
        return n - r;
      default:
        return t;
    }
  }
  function VGi(e, t, n, r, o) {
    switch (e) {
      case 2:
        return t + (n - t - r) / 2;
      case 3:
        return o ? t : n - r;
      default:
        return o ? n - r : t;
    }
  }
  function I8d(e, t, n, r, o, s, i) {
    let a = e._fb;
    if ((e._fbGen === iPe || !e.isDirty_) && e._fbCrossMode === o && u1(a[1], s) && u1(a[2], i) && u1(a[3], n) && u1(a[4], r)) {
      return a[0];
    }
    let l = nHt(t) ? P8d(e, n, r, o, s, i) : O8d(e, n, r, o, s, i);
    a[0] = l;
    a[1] = s;
    a[2] = i;
    a[3] = n;
    a[4] = r;
    e._fbCrossMode = o;
    e._fbGen = iPe;
    return l;
  }
  function P8d(e, t, n, r, o, s) {
    let i = e.style;
    let a = mw(i.flexBasis, t);
    if (a === a) {
      return a > 0 ? a : 0;
    }
    let l = mw(i.width, o);
    if (l === l) {
      return l > 0 ? l : 0;
    }
    let c = mw(i.height, s);
    let u;
    if (c === c) {
      u = 1;
    } else if (n === n) {
      c = n - IWe(e, 0, o);
      u = r === 1 && f9i(e) ? 1 : 2;
    } else {
      u = 0;
    }
    let d = NaN;
    let p = 0;
    if (t === t && m9i(e)) {
      d = t - IWe(e, 2, o);
      p = 2;
    }
    Nlt(e, d, c, p, u, o, s, false, false, false);
    return e.layout.width;
  }
  function O8d(e, t, n, r, o, s) {
    let i = e.style;
    let a = mw(i.flexBasis, t);
    if (a === a) {
      return a > 0 ? a : 0;
    }
    let l = mw(i.height, s);
    if (l === l) {
      return l > 0 ? l : 0;
    }
    let c = mw(i.width, o);
    let u;
    if (c === c) {
      u = 1;
    } else if (n === n) {
      c = n - IWe(e, 2, o);
      u = r === 1 && f9i(e) ? 1 : 2;
    } else {
      u = 0;
    }
    Nlt(e, c, NaN, u, 0, o, s, false, false, false);
    return e.layout.height;
  }
  function m9i(e) {
    if (e.measureFunc) {
      return true;
    }
    let t = e.children;
    for (let n = 0, r = t.length; n < r; n++) {
      if (m9i(t[n])) {
        return true;
      }
    }
    return false;
  }
  function HMn(e) {
    return Z$t[e >>> 5] & 1 << e;
  }
  function QGi(e) {
    Z$t[e >>> 5] |= 1 << e;
  }
  function D8d(e, t, n, r, o, s) {
    let i = e.length;
    let a = i + 31 >>> 5;
    if (a > Z$t.length) {
      Z$t = new Int32Array(a * 2);
    }
    if (i > eeo.length) {
      eeo = new Float64Array(i * 2);
    }
    let l = eeo;
    Z$t.fill(0, 0, a);
    let c = m_(t) ? t - n : 0;
    for (let u = 0; u < i; u++) {
      let d = e[u];
      let p = d.style;
      let m = d._sz[0];
      let f = K8(p, r, m, o, s);
      if (!m_(t) || (c >= 0 ? p.flexGrow === 0 : p.flexShrink === 0)) {
        d._sz[1] = Math.max(0, f);
        QGi(u);
      } else {
        d._sz[1] = m;
      }
    }
    for (let u = 0; u <= i; u++) {
      let d = 0;
      let p = 0;
      let m = 0;
      let f = 0;
      for (let _ = 0; _ < i; _++) {
        let b = e[_];
        let S = b._sz[0];
        if (HMn(_)) {
          d += b._sz[1] - S;
        } else {
          let E = b.style;
          p += E.flexGrow;
          m += E.flexShrink * S;
          f++;
        }
      }
      if (f === 0) {
        break;
      }
      let h = c - d;
      if (h > 0 && p > 0 && p < 1) {
        let _ = c * p;
        if (_ < h) {
          h = _;
        }
      } else if (h < 0 && m > 0) {
        let _ = 0;
        for (let b = 0; b < i; b++) {
          if (!HMn(b)) {
            _ += e[b].style.flexShrink;
          }
        }
        if (_ < 1) {
          let b = c * _;
          if (b > h) {
            h = b;
          }
        }
      }
      let g = 0;
      for (let _ = 0; _ < i; _++) {
        if (HMn(_)) {
          continue;
        }
        let b = e[_];
        let S = b.style;
        let E = b._sz[0];
        let C = E;
        if (h > 0 && p > 0) {
          C += h * S.flexGrow / p;
        } else if (h < 0 && m > 0) {
          C += h * (S.flexShrink * E) / m;
        }
        l[_] = C;
        let x = Math.max(0, K8(S, r, C, o, s));
        b._sz[1] = x;
        g += x - C;
      }
      if (g === 0) {
        break;
      }
      let y = false;
      for (let _ = 0; _ < i; _++) {
        if (HMn(_)) {
          continue;
        }
        let b = e[_]._sz[1] - l[_];
        if (g > 0 && b > 0 || g < 0 && b < 0) {
          QGi(_);
          y = true;
        }
      }
      if (!y) {
        break;
      }
    }
  }
  function f9i(e) {
    let t = e.parent;
    if (!t) {
      return false;
    }
    let n = e.style.alignSelf;
    return (n === 0 ? t.style.alignItems : n) === 4;
  }
  function h9i(e, t) {
    let n = t.style.alignSelf;
    return n === 0 ? e.style.alignItems : n;
  }
  function leo(e) {
    let t = e.children;
    let n = t.length;
    let r = -1;
    for (let s = 0; s < n; s++) {
      let i = t[s];
      if (i._lineIndex > 0) {
        break;
      }
      let a = i.style;
      if (a.positionType === 2) {
        continue;
      }
      if (a.display === 1) {
        continue;
      }
      if (h9i(e, i) === 5 || i.isReferenceBaseline_) {
        r = s;
        break;
      }
      if (r === -1) {
        r = s;
      }
    }
    if (r === -1) {
      return e.layout.height;
    }
    let o = t[r];
    return leo(o) + o.layout.top;
  }
  function M8d(e, t) {
    let n = e.style;
    if (!nHt(n.flexDirection)) {
      return false;
    }
    if (n.alignItems === 5) {
      return true;
    }
    for (let r = 0, o = t.length; r < o; r++) {
      if (t[r].style.alignSelf === 5) {
        return true;
      }
    }
    return false;
  }
  function IWe(e, t, n) {
    if (!e._hasMargin) {
      return 0;
    }
    let r = e.style.margin;
    let o = sPe(r, WMn(t), n);
    let s = sPe(r, oeo(t), n);
    return o + s;
  }
  function ZGi(e, t, n) {
    let r = e.gap;
    let o = r[t];
    if (o.unit === 0) {
      o = r[2];
    }
    let s = mw(o, n);
    return m_(s) ? Math.max(0, s) : 0;
  }
  function K8(e, t, n, r, o) {
    let s = t ? e.minWidth : e.minHeight;
    let i = t ? e.maxWidth : e.maxHeight;
    let a = s.unit;
    let l = i.unit;
    if (a === 0 && l === 0) {
      return n;
    }
    return N8d(n, a, l, s.value, i.value, t ? r : o);
  }
  function N8d(e, t, n, r, o, s) {
    let i = e;
    if (n === 1) {
      if (i > o) {
        i = o;
      }
    } else if (n === 2) {
      let a = o * s / 100;
      if (a === a && i > a) {
        i = a;
      }
    }
    if (t === 1) {
      if (i < r) {
        i = r;
      }
    } else if (t === 2) {
      let a = r * s / 100;
      if (a === a && i < a) {
        i = a;
      }
    }
    return i;
  }
  function reo(e) {
    e.left = 0;
    e.top = 0;
    e.width = 0;
    e.height = 0;
  }
  function L8d(e) {
    reo(e.layout);
    e.isDirty_ = true;
    e._hasL = false;
    e._hasM = false;
  }
  function g9i(e) {
    let t = e.children;
    for (let n = 0, r = t.length; n < r; n++) {
      let o = t[n];
      L8d(o);
      g9i(o);
    }
  }
  function y9i(e, t, n) {
    let r = e.children;
    for (let o = 0, s = r.length; o < s; o++) {
      let i = r[o];
      let a = i.style;
      let l = a.display;
      if (l === 1) {
        reo(i.layout);
        g9i(i);
      } else if (l === 2) {
        reo(i.layout);
        y9i(i, t, n);
      } else if (a.positionType === 2) {
        n.push(i);
      } else {
        t.push(i);
      }
    }
  }
  function _9i(e, t, n, r) {
    if (t === 0) {
      return;
    }
    let o = e.layout;
    let s = o.left;
    let i = o.top;
    let a = o.width;
    let l = o.height;
    let c = n + s;
    let u = r + i;
    let d = e.measureFunc !== null;
    o.left = Plt(s, t, false, d);
    o.top = Plt(i, t, false, d);
    let p = c + a;
    let m = u + l;
    let f = !e9i(a * t);
    let h = !e9i(l * t);
    o.width = Plt(p, t, d && f, d && !f) - Plt(c, t, false, d);
    o.height = Plt(m, t, d && h, d && !h) - Plt(u, t, false, d);
    let g = e.children;
    for (let y = 0, _ = g.length; y < _; y++) {
      _9i(g[y], t, c, u);
    }
  }
  function e9i(e) {
    let t = e - Math.floor(e);
    return t < 0.0001 || t > 0.9999;
  }
  function Plt(e, t, n, r) {
    let o = e * t;
    let s = o - Math.floor(o);
    if (s < 0) {
      s += 1;
    }
    if (s < 0.0001) {
      o = Math.floor(o);
    } else if (s > 0.9999) {
      o = Math.ceil(o);
    } else if (n) {
      o = Math.ceil(o);
    } else if (r) {
      o = Math.floor(o);
    } else {
      o = Math.floor(o) + (s >= 0.4999 ? 1 : 0);
    }
    return o / t;
  }
  function cre(e) {
    if (e === undefined) {
      return z8;
    }
    if (e === "auto") {
      return tSe;
    }
    if (typeof e === "number") {
      return Number.isFinite(e) ? qMn(e) : z8;
    }
    if (typeof e === "string" && e.endsWith("%")) {
      return UJ(parseFloat(e));
    }
    let t = parseFloat(e);
    return isNaN(t) ? z8 : qMn(t);
  }
  function teo(e) {
    switch (e) {
      case 0:
      case 4:
        return 0;
      case 1:
        return 1;
      case 2:
      case 5:
        return 2;
      case 3:
        return 3;
      default:
        return 0;
    }
  }
  var z8;
  var tSe;
  var f8d;
  var iPe = 0;
  var seo = 0;
  var ieo = 0;
  var aeo = 0;
  var Q$t = 0;
  var neo = 0;
  var T8d;
  var Olt = 0;
  var AWe = 0;
  var d9i = 0;
  var p9i = 0;
  var Z$t;
  var eeo;
  var F8d;
  function PI(e, t) {
    if (!("setRawMode" in e) || typeof e.setRawMode !== "function") {
      return;
    }
    try {
      e.setRawMode(t);
    } catch (n) {
      let r = he(n);
      let o = en(n);
      if (r.includes("setRawMode failed") || U8d.vZc(o ?? "")) {
        logForDebugging(`setRawMode(${t}) failed on revoked tty: ${r}`);
        return;
      }
      throw n;
    }
  }
  var U8d;
  var aPe = __lazy(() => {
    je();
    dt();
    U8d = new Set(["EIO", "ENOTTY", "EBADF"]);
  });
  function E9i(e, t) {
    if (e < 2) {
      return;
    }
    if (KMn.size >= (null ?? 131072)) {
      ceo = true;
      return;
    }
    KMn.add(e * 32768 + t);
  }
  function rHt(e) {
    YMn = e;
  }
  function C9i(e) {
    PWe = e;
  }
  function deo(e) {
    R9i++;
    x9i = e;
    k9i = performance.now();
  }
  function peo() {
    return {
      count: R9i,
      lastReason: x9i,
      lastResetAt: k9i
    };
  }
  function oHt() {
    return {
      atlasKeys: KMn.size,
      saturated: ceo
    };
  }
  function meo() {
    KMn.clear();
    ceo = false;
  }
  function A9i(e) {
    zMn = e;
  }
  function I9i() {
    if (!zMn) {
      return null;
    }
    return {
      size: zMn.size,
      overflowed: zMn.overflowed
    };
  }
  function P9i() {
    if (S9i) {
      return false;
    }
    S9i = true;
    return true;
  }
  function O9i() {
    if (T9i) {
      return false;
    }
    T9i = true;
    return true;
  }
  var YMn = false;
  var PWe = false;
  var KMn;
  var ceo = false;
  var zMn = null;
  var S9i = false;
  var T9i = false;
  var R9i = 0;
  var x9i = "none";
  var k9i = 0;
  var Llt = __lazy(() => {
    KMn = new Set();
  });
  function M9i(e) {
    let t = process.argv.indexOf("--");
    return (t === -1 ? process.argv : process.argv.slice(0, t)).some(r => e.vZc(r));
  }
  function V8d() {
    if (process.env.NO_COLOR && process.env.FORCE_COLOR === undefined && !G8d() && _$u.level > 0) {
      _$u.level = 0;
      return true;
    }
    return false;
  }
  function z8d() {
    if (process.env.TERM_PROGRAM === "vscode" && _$u.level === 2) {
      _$u.level = 3;
      return true;
    }
    return false;
  }
  function Y8d() {
    if (!process.stdout.isTTY || process.env.NO_COLOR || process.env.FORCE_COLOR !== undefined || W8d()) {
      return false;
    }
    let e = process.env.TERM;
    if (e && K8d.vZc(e) && _$u.level < 3) {
      _$u.level = 3;
      return true;
    }
    return false;
  }
  function J8d() {
    if (process.env.CLAUDE_CODE_TMUX_TRUECOLOR) {
      return false;
    }
    if (process.env.TMUX && _$u.level > 2) {
      _$u.level = 2;
      return true;
    }
    return false;
  }
  function N9i(e) {
    if (e && _$u.level > 2) {
      _$u.level = 2;
      return true;
    }
    return false;
  }
  function OWe(e) {
    return "\x1B[7m" + e + "\x1B[27m";
  }
  function JMn() {
    return L9i;
  }
  function F9i(e) {
    let t = e !== undefined && e < D9i ? e : D9i;
    if (t !== _$u.level) {
      _$u.level = t;
      L9i++;
    }
  }
  function U9i(e) {
    if (_$u.level >= 3 || e.length === 0) {
      return e;
    }
    let t;
    for (let n = 0; n < e.length; n++) {
      let r = e[n];
      let o = X8d.exec(r.code);
      if (o) {
        t ??= e.slice(0, n);
        t.push({
          type: "ansi",
          code: `\x1B[${o[1]};5;${Q8d(+o[2], +o[3], +o[4])}m`,
          endCode: r.endCode
        });
      } else if (t) {
        t.push(r);
      }
    }
    return t ?? e;
  }
  function Q8d(e, t, n) {
    let r = y => y < 48 ? 0 : y < 115 ? 1 : y < 155 ? 2 : y < 195 ? 3 : y < 235 ? 4 : 5;
    let o = r(e);
    let s = r(t);
    let i = r(n);
    let a = 16 + 36 * o + 6 * s + i;
    let l = Math.round((e + t + n) / 3);
    if (l < 5) {
      return 16;
    }
    if (l > 244 && o === s && s === i) {
      return a;
    }
    let c = Math.max(0, Math.min(23, Math.round((l - 8) / 10)));
    let u = 232 + c;
    let d = 8 + c * 10;
    let p = feo[o];
    let m = feo[s];
    let f = feo[i];
    let h = (e - p) ** 2 + (t - m) ** 2 + (n - f) ** 2;
    return (e - d) ** 2 + (t - d) ** 2 + (n - d) ** 2 < h ? u : a;
  }
  function Flt(e, t) {
    let n = e;
    if (t.inverse) {
      n = OWe(n);
    }
    if (t.strikethrough) {
      n = _$u.strikethrough(n);
    }
    if (t.underline) {
      n = _$u.underline(n);
    }
    if (t.italic) {
      n = _$u.italic(n);
    }
    if (t.bold) {
      n = _$u.bold(n);
    }
    if (t.dim) {
      n = _$u.dim(n);
    }
    if (t.color) {
      n = lPe(n, t.color, "foreground");
    }
    if (t.backgroundColor) {
      n = lPe(n, t.backgroundColor, "background");
    }
    return n;
  }
  function nSe(e, t) {
    if (!t) {
      return e;
    }
    return lPe(e, t, "foreground");
  }
  var j8d;
  var q8d;
  var W8d = () => M9i(j8d);
  var G8d = () => M9i(q8d);
  var K8d;
  var acy;
  var lcy;
  var ccy;
  var ucy;
  var D9i;
  var L9i = 0;
  var X8d;
  var feo;
  var Z8d;
  var eVd;
  var lPe = (e, t, n) => {
    if (!t) {
      return e;
    }
    if (t.startsWith("ansi:")) {
      switch (t.substring(5)) {
        case "black":
          return n === "foreground" ? _$u.black(e) : _$u.bgBlack(e);
        case "red":
          return n === "foreground" ? _$u.red(e) : _$u.bgRed(e);
        case "green":
          return n === "foreground" ? _$u.green(e) : _$u.bgGreen(e);
        case "yellow":
          return n === "foreground" ? _$u.yellow(e) : _$u.bgYellow(e);
        case "blue":
          return n === "foreground" ? _$u.blue(e) : _$u.bgBlue(e);
        case "magenta":
          return n === "foreground" ? _$u.magenta(e) : _$u.bgMagenta(e);
        case "cyan":
          return n === "foreground" ? _$u.cyan(e) : _$u.bgCyan(e);
        case "white":
          return n === "foreground" ? _$u.white(e) : _$u.bgWhite(e);
        case "blackBright":
          return n === "foreground" ? _$u.blackBright(e) : _$u.bgBlackBright(e);
        case "redBright":
          return n === "foreground" ? _$u.redBright(e) : _$u.bgRedBright(e);
        case "greenBright":
          return n === "foreground" ? _$u.greenBright(e) : _$u.bgGreenBright(e);
        case "yellowBright":
          return n === "foreground" ? _$u.yellowBright(e) : _$u.bgYellowBright(e);
        case "blueBright":
          return n === "foreground" ? _$u.blueBright(e) : _$u.bgBlueBright(e);
        case "magentaBright":
          return n === "foreground" ? _$u.magentaBright(e) : _$u.bgMagentaBright(e);
        case "cyanBright":
          return n === "foreground" ? _$u.cyanBright(e) : _$u.bgCyanBright(e);
        case "whiteBright":
          return n === "foreground" ? _$u.whiteBright(e) : _$u.bgWhiteBright(e);
      }
    }
    if (t.startsWith("#")) {
      return n === "foreground" ? _$u.hex(t)(e) : _$u.bgHex(t)(e);
    }
    if (t.startsWith("ansi256")) {
      let r = eVd.exec(t);
      if (!r) {
        return e;
      }
      let o = Number(r[1]);
      return n === "foreground" ? _$u.ansi256(o)(e) : _$u.bgAnsi256(o)(e);
    }
    if (t.startsWith("rgb")) {
      let r = Z8d.exec(t);
      if (!r) {
        return e;
      }
      let o = Number(r[1]);
      let s = Number(r[2]);
      let i = Number(r[3]);
      return n === "foreground" ? _$u.rgb(o, s, i)(e) : _$u.bgRgb(o, s, i)(e);
    }
    return e;
  };
  var J8 = __lazy(() => {
    j8d = new Set(["--no-color", "--no-colors", "--color=false", "--color=never"]);
    q8d = new Set(["--color", "--colors", "--color=true", "--color=always", "--color=256", "--color=16m", "--color=full", "--color=truecolor"]);
    K8d = new Set(["alacritty", "contour", "foot", "ghostty", "rio", "wezterm", "xterm-ghostty", "xterm-kitty"]);
    acy = V8d();
    lcy = z8d();
    ccy = Y8d();
    ucy = J8d();
    D9i = _$u.level;
    X8d = /^\x1b\[([34]8);2;(\d+);(\d+);(\d+)m$/;
    feo = [0, 95, 135, 175, 215, 255];
    Z8d = /^rgb\(\s?(\d+),\s?(\d+),\s?(\d+)\s?\)$/;
    eVd = /^ansi256\(\s?(\d+)\s?\)$/;
  });
  var B9i;
  var $9i;
  var _eo = {};