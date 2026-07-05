  var Whe = __commonJS((waw, B8c) => {
    var {
      format: L8c
    } = require("util");
    class F8c extends Error {
      constructor({
        error_description: e,
        error: t,
        error_uri: n,
        session_state: r,
        state: o,
        scope: s
      }, i) {
        super(!e ? t : `${t} (${e})`);
        if (Object.assign(this, {
          error: t
        }, e && {
          error_description: e
        }, n && {
          error_uri: n
        }, o && {
          state: o
        }, s && {
          scope: s
        }, r && {
          session_state: r
        }), i) {
          Object.defineProperty(this, "response", {
            value: i
          });
        }
        this.name = this.constructor.name;
        Error.captureStackTrace(this, this.constructor);
      }
    }
    class U8c extends Error {
      constructor(...e) {
        if (typeof e[0] === "string") {
          super(L8c(...e));
        } else {
          let {
            message: t,
            printf: n,
            response: r,
            ...o
          } = e[0];
          if (n) {
            super(L8c(...n));
          } else {
            super(t);
          }
          if (Object.assign(this, o), r) {
            Object.defineProperty(this, "response", {
              value: r
            });
          }
        }
        this.name = this.constructor.name;
        Error.captureStackTrace(this, this.constructor);
      }
    }
    B8c.exports = {
      OPError: F8c,
      RPError: U8c
    };
  });