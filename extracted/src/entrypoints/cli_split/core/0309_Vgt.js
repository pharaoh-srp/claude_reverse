  var $za = __commonJS(w6n => {
    Object.defineProperty(w6n, "__esModule", {
      value: true
    });
    w6n.ExponentMapping = undefined;
    var Vgt = DCo();
    var JVp = T6n();
    var Uza = v6n();
    class Bza {
      _shift;
      constructor(e) {
        this._shift = -e;
      }
      mapToIndex(e) {
        if (e < Vgt.MIN_VALUE) {
          return this._minNormalLowerBoundaryIndex();
        }
        let t = Vgt.getNormalBase2(e);
        let n = this._rightShift(Vgt.getSignificand(e) - 1, Vgt.SIGNIFICAND_WIDTH);
        return t + n >> this._shift;
      }
      lowerBoundary(e) {
        let t = this._minNormalLowerBoundaryIndex();
        if (e < t) {
          throw new Uza.MappingError(`underflow: ${e} is < minimum lower boundary: ${t}`);
        }
        let n = this._maxNormalLowerBoundaryIndex();
        if (e > n) {
          throw new Uza.MappingError(`overflow: ${e} is > maximum lower boundary: ${n}`);
        }
        return JVp.ldexp(1, e << this._shift);
      }
      get scale() {
        if (this._shift === 0) {
          return 0;
        }
        return -this._shift;
      }
      _minNormalLowerBoundaryIndex() {
        let e = Vgt.MIN_NORMAL_EXPONENT >> this._shift;
        if (this._shift < 2) {
          e--;
        }
        return e;
      }
      _maxNormalLowerBoundaryIndex() {
        return Vgt.MAX_NORMAL_EXPONENT >> this._shift;
      }
      _rightShift(e, t) {
        return Math.floor(e * Math.pow(2, -t));
      }
    }
    w6n.ExponentMapping = Bza;
  });