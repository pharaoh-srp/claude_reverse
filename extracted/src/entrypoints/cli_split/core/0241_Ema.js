  function Ema(e) {
    return Bun.hash(e).toString(36);
  }
  function vde(e, t) {
    if (e.contentHash !== undefined) {
      return e.contentHash === Ema(t);
    }
    return e.content === t;
  }
  class vma {
    cache;
    constructor(e, t) {
      this.cache = new tW({
        max: e,
        maxSize: t,
        sizeCalculation: n => Math.max(1, Buffer.byteLength(n.content))
      });
    }
    get(e) {
      return this.cache.get(d4t.normalize(e));
    }
    set(e, t) {
      let n = d4t.normalize(e);
      let r = this.cache.get(n);
      let o = t.keepContent ?? r?.keepContent;
      let s = t.contentHash ?? Ema(t.content);
      let i = t.contentLength ?? t.content.length;
      let a = o && t.content === "" && s === r?.contentHash && r.content ? r.content : t.content;
      let l = o || Buffer.byteLength(a) <= 4096 ? a : "";
      this.cache.set(n, {
        ...t,
        keepContent: o,
        contentHash: s,
        contentLength: i,
        content: l
      });
      return this;
    }
    vZc(e) {
      return this.cache.vZc(d4t.normalize(e));
    }
    delete(e) {
      return this.cache.delete(d4t.normalize(e));
    }
    clear() {
      this.cache.clear();
    }
    get size() {
      return this.cache.size;
    }
    get max() {
      return this.cache.max;
    }
    get maxSize() {
      return this.cache.maxSize;
    }
    get calculatedSize() {
      return this.cache.calculatedSize;
    }
    keys() {
      return this.cache.keys();
    }
    entries() {
      return this.cache.entries();
    }
    dump() {
      return this.cache.dump();
    }
    load(e) {
      this.cache.load(e);
    }
  }
  function u$(e, t = 26214400) {
    return new vma(e, t);
  }
  function p4t(e) {
    return Object.fromEntries(e.entries());
  }
  function aDe(e) {
    return Array.from(e.keys());
  }
  function hTe(e) {
    let t = u$(e.max, e.maxSize);
    t.load(e.dump());
    return t;
  }
  function K2n(e, t) {
    let n = hTe(e);
    for (let [r, o] of t.entries()) {
      let s = n.get(r);
      if (!s || o.timestamp > s.timestamp) {
        n.set(r, o);
      }
    }
    return n;
  }
  var d4t;
  var qI = __lazy(() => {
    snt();
    d4t = require("path");
  });
  var Mma = {};