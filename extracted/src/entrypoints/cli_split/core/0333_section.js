  var $il = __commonJS(A7n => {
    Object.defineProperty(A7n, "__esModule", {
      value: true
    });
    A7n.MultiMetricStorage = undefined;
    class Bil {
      _backingStorages;
      constructor(e) {
        this._backingStorages = e;
      }
      record(e, t, n, r) {
        let o = this._backingStorages;
        for (let s = 0; s < o.length; s++) {
          o[s].record(e, t, n, r);
        }
      }
    }
    A7n.MultiMetricStorage = Bil;
  });