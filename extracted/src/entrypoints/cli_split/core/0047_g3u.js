  var $As = __commonJS((LCh, BAs) => {
    function g3u(e, t) {
      return Object.assign(Error(`${t} ${e.command} ENOENT`), {
        code: "ENOENT",
        errno: "ENOENT",
        syscall: `${t} ${e.command}`,
        path: e.command,
        spawnargs: e.args
      });
    }
    function y3u(e, t) {
      return;
    }
    function UAs(e, t) {
      return null;
    }
    function _3u(e, t) {
      return null;
    }
    BAs.exports = {
      hookChildProcess: y3u,
      verifyENOENT: UAs,
      verifyENOENTSync: _3u,
      notFoundError: g3u
    };
  });