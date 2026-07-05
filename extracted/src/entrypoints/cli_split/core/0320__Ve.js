  var $Vn = __commonJS((TJ_, TZa) => {
    TZa.exports = _Ve;
    var Dxo = d1e();
    ((_Ve.prototype = Object.create(Dxo.prototype)).constructor = _Ve).className = "Method";
    var Iyt = Y1();
    function _Ve(e, t, n, r, o, s, i, a, l) {
      if (Iyt.isObject(o)) {
        i = o;
        o = s = undefined;
      } else if (Iyt.isObject(s)) {
        i = s;
        s = undefined;
      }
      if (!(t === undefined || Iyt.isString(t))) {
        throw TypeError("type must be a string");
      }
      if (!Iyt.isString(n)) {
        throw TypeError("requestType must be a string");
      }
      if (!Iyt.isString(r)) {
        throw TypeError("responseType must be a string");
      }
      Dxo.call(this, e, i);
      this.type = t || "rpc";
      this.requestType = n;
      this.requestStream = o ? true : undefined;
      this.responseType = r;
      this.responseStream = s ? true : undefined;
      this.resolvedRequestType = null;
      this.resolvedResponseType = null;
      this.comment = a;
      this.parsedOptions = l;
    }
    _Ve.fromJSON = function (t, n) {
      return new _Ve(t, n.type, n.requestType, n.responseType, n.requestStream, n.responseStream, n.options, n.comment, n.parsedOptions);
    };
    _Ve.prototype.toJSON = function (t) {
      var n = t ? Boolean(t.keepComments) : false;
      return Iyt.toObject(["type", this.type !== "rpc" && this.type || undefined, "requestType", this.requestType, "requestStream", this.requestStream, "responseType", this.responseType, "responseStream", this.responseStream, "options", this.options, "comment", n ? this.comment : undefined, "parsedOptions", this.parsedOptions]);
    };
    _Ve.prototype.resolve = function () {
      if (this.resolved) {
        return this;
      }
      this.resolvedRequestType = this.parent.lookupType(this.requestType);
      this.resolvedResponseType = this.parent.lookupType(this.responseType);
      return Dxo.prototype.resolve.call(this);
    };
  });