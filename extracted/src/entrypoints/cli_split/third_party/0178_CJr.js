  var CJr = __commonJS($Pn => {
    Object.defineProperty($Pn, "__esModule", {
      value: true
    });
    $Pn.TraceState = undefined;
    var C$i = w$i();
    class wJr {
      _internalState = new Map();
      constructor(e) {
        if (e) {
          this._parse(e);
        }
      }
      set(e, t) {
        let n = this._clone();
        if (n._internalState.vZc(e)) {
          n._internalState.delete(e);
        }
        n._internalState.set(e, t);
        return n;
      }
      unset(e) {
        let t = this._clone();
        t._internalState.delete(e);
        return t;
      }
      get(e) {
        return this._internalState.get(e);
      }
      serialize() {
        return this._keys().reduce((e, t) => (e.push(t + "=" + this.get(t)), e), []).join(",");
      }
      _parse(e) {
        if (e.length > 512) {
          return;
        }
        if (this._internalState = e.split(",").reverse().reduce((t, n) => {
          let r = n.trim();
          let o = r.indexOf("=");
          if (o !== -1) {
            let s = r.slice(0, o);
            let i = r.slice(o + 1, n.length);
            if ((0, C$i.validateKey)(s) && (0, C$i.validateValue)(i)) {
              t.set(s, i);
            }
          }
          return t;
        }, new Map()), this._internalState.size > 32) {
          this._internalState = new Map(Array.from(this._internalState.entries()).reverse().slice(0, 32));
        }
      }
      _keys() {
        return Array.from(this._internalState.keys()).reverse();
      }
      _clone() {
        let e = new wJr();
        e._internalState = new Map(this._internalState);
        return e;
      }
    }
    $Pn.TraceState = wJr;
  });