  var JMr = __commonJS((FCh, gnt) => {
    var HAs = require("child_process");
    var KMr = FAs();
    var YMr = $As();
    function jAs(e, t, n) {
      let r = KMr(e, t, n);
      let o = HAs.spawn(r.command, r.args, r.options);
      YMr.hookChildProcess(o, r);
      return o;
    }
    function b3u(e, t, n) {
      let r = KMr(e, t, n);
      let o = HAs.spawnSync(r.command, r.args, r.options);
      o.error = o.error || YMr.verifyENOENTSync(o.status, r);
      return o;
    }
    gnt.exports = jAs;
    gnt.exports.spawn = jAs;
    gnt.exports.sync = b3u;
    gnt.exports._parse = KMr;
    gnt.exports._enoent = YMr;
  });