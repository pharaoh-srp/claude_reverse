  var $ol = __commonJS(OKn => {
    Object.defineProperty(OKn, "__esModule", {
      value: true
    });
    OKn.BindOnceFuture = undefined;
    var tlm = Uol();
    class Bol {
      _isCalled = false;
      _deferred = new tlm.Deferred();
      _callback;
      _that;
      constructor(e, t) {
        this._callback = e;
        this._that = t;
      }
      get isCalled() {
        return this._isCalled;
      }
      get promise() {
        return this._deferred.promise;
      }
      call(...e) {
        if (!this._isCalled) {
          this._isCalled = true;
          try {
            Promise.resolve(this._callback.call(this._that, ...e)).then(t => this._deferred.resolve(t), t => this._deferred.reject(t));
          } catch (t) {
            this._deferred.reject(t);
          }
        }
        return this._deferred.promise;
      }
    }
    OKn.BindOnceFuture = Bol;
  });