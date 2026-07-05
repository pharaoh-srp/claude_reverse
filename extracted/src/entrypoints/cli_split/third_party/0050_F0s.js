  var F0s = __commonJS((DRh, L0s) => {
    var {
      PassThrough: d4u
    } = require("stream");
    L0s.exports = function () {
      var e = [];
      var t = new d4u({
        objectMode: true
      });
      t.setMaxListeners(0);
      t.add = n;
      t.isEmpty = r;
      t.on("unpipe", o);
      Array.prototype.slice.call(arguments).forEach(n);
      return t;
      function n(s) {
        if (Array.isArray(s)) {
          s.forEach(n);
          return this;
        }
        e.push(s);
        s.once("end", o.bind(null, s));
        s.once("error", t.emit.bind(t, "error"));
        s.pipe(t, {
          end: false
        });
        return this;
      }
      function r() {
        return e.length == 0;
      }
      function o(s) {
        if (e = e.filter(function (i) {
          return i !== s;
        }), !e.length && t.readable) {
          t.end();
        }
      }
    };
  });