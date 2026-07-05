  var fNt = __commonJS(mNt => {
    var p1s = s1s();
    var m1s = d1s();
    Object.keys(p1s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(mNt, e)) {
        Object.defineProperty(mNt, e, {
          enumerable: true,
          get: function () {
            return p1s[e];
          }
        });
      }
    });
    Object.keys(m1s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(mNt, e)) {
        Object.defineProperty(mNt, e, {
          enumerable: true,
          get: function () {
            return m1s[e];
          }
        });
      }
    });
  });