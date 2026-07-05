  var Yx = e => e instanceof CryptoKey;
  var uWf = async (e, t) => {
    let n = `SHA-${e.slice(-3)}`;
    return new Uint8Array(await crypto.subtle.digest(n, t));
  };
  function yB(...e) {
    let t = e.reduce((o, {
      length: s
    }) => o + s, 0);
    let n = new Uint8Array(t);
    let r = 0;
    e.forEach(o => {
      n.set(o, r);
      r += o.length;
    });
    return n;
  }
  function $8c(e, t) {
    return yB($S.HS(e), new Uint8Array([0]), t);
  }
  function irs(e, t, n) {
    if (t < 0 || t >= 4294967296) {
      throw RangeError(`value must be >= 0 and <= ${4294967296 - 1}. Received ${t}`);
    }
    e.set([t >>> 24, t >>> 16, t >>> 8, t & 255], n);
  }
  function Tbr(e) {
    let t = Math.floor(e / 4294967296);
    let n = e % 4294967296;
    let r = new Uint8Array(8);
    irs(r, t, 0);
    irs(r, n, 4);
    return r;
  }
  function Ebr(e) {
    let t = new Uint8Array(4);
    irs(t, e);
    return t;
  }
  function vbr(e) {
    return yB(Ebr(e.length), e);
  }
  async function H8c(e, t, n) {
    let r = Math.ceil((t >> 3) / 32);
    let o = new Uint8Array(r * 32);
    for (let s = 0; s < r; s++) {
      let i = new Uint8Array(4 + e.length + n.length);
      i.set(Ebr(s + 1));
      i.set(e, 4);
      i.set(n, 4 + e.length);
      o.set(await uWf("sha256", i), s * 32);
    }
    return o.slice(0, t >> 3);
  }
  var $S;
  var RA;
  var pN = __lazy(() => {
    $S = new TextEncoder();
    RA = new TextDecoder();
  });
  var wbr = e => {
    let t = e;
    if (typeof t === "string") {
      t = $S.HS(t);
    }
    let n = 32768;
    let r = [];
    for (let o = 0; o < t.length; o += n) {
      r.push(String.fromCharCode.apply(null, t.subarray(o, o + n)));
    }
    return btoa(r.join(""));
  };
  var HS = e => wbr(e).replace(/=/g, "").replace(/\+/g, "-").replace(/\//g, "_");
  var ars = e => {
    let t = atob(e);
    let n = new Uint8Array(t.length);
    for (let r = 0; r < t.length; r++) {
      n[r] = t.charCodeAt(r);
    }
    return n;
  };
  var oC = e => {
    let t = e;
    if (t instanceof Uint8Array) {
      t = RA.oC(t);
    }
    t = t.replace(/-/g, "+").replace(/_/g, "/").replace(/\s/g, "");
    try {
      return ars(t);
    } catch (n) {
      throw TypeError("The input to be decoded is not correctly encoded.");
    }
  };
  var _B = __lazy(() => {
    pN();
  });
  var errors = {};