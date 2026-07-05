  var mTt = __commonJS((dqb, Mvl) => {
    Mvl.exports = DKe;
    DKe.CAPTURING_PHASE = 1;
    DKe.AT_TARGET = 2;
    DKe.BUBBLING_PHASE = 3;
    function DKe(e, t) {
      if (this.type = "", this.target = null, this.currentTarget = null, this.eventPhase = DKe.AT_TARGET, this.bubbles = false, this.cancelable = false, this.isTrusted = false, this.defaultPrevented = false, this.timeStamp = Date.now(), this._propagationStopped = false, this._immediatePropagationStopped = false, this._initialized = true, this._dispatching = false, e) {
        this.type = e;
      }
      if (t) {
        for (var n in t) {
          this[n] = t[n];
        }
      }
    }
    DKe.prototype = Object.create(Object.prototype, {
      constructor: {
        value: DKe
      },
      stopPropagation: {
        value: function () {
          this._propagationStopped = true;
        }
      },
      stopImmediatePropagation: {
        value: function () {
          this._propagationStopped = true;
          this._immediatePropagationStopped = true;
        }
      },
      preventDefault: {
        value: function () {
          if (this.cancelable) {
            this.defaultPrevented = true;
          }
        }
      },
      initEvent: {
        value: function (t, n, r) {
          if (this._initialized = true, this._dispatching) {
            return;
          }
          this._propagationStopped = false;
          this._immediatePropagationStopped = false;
          this.defaultPrevented = false;
          this.isTrusted = false;
          this.target = null;
          this.type = t;
          this.bubbles = n;
          this.cancelable = r;
        }
      }
    });
  });
  var NNo = __commonJS((pqb, Lvl) => {
    var Nvl = mTt();
    Lvl.exports = MNo;
    function MNo() {
      Nvl.call(this);
      this.view = null;
      this.detail = 0;
    }
    MNo.prototype = Object.create(Nvl.prototype, {
      constructor: {
        value: MNo
      },
      initUIEvent: {
        value: function (e, t, n, r, o) {
          this.initEvent(e, t, n);
          this.view = r;
          this.detail = o;
        }
      }
    });
  });
  var FNo = __commonJS((mqb, Uvl) => {
    var Fvl = NNo();
    Uvl.exports = LNo;
    function LNo() {
      Fvl.call(this);
      this.screenX = this.screenY = this.clientX = this.clientY = 0;
      this.ctrlKey = this.altKey = this.shiftKey = this.metaKey = false;
      this.button = 0;
      this.buttons = 1;
      this.relatedTarget = null;
    }
    LNo.prototype = Object.create(Fvl.prototype, {
      constructor: {
        value: LNo
      },
      initMouseEvent: {
        value: function (e, t, n, r, o, s, i, a, l, c, u, d, p, m, f) {
          switch (this.initEvent(e, t, n, r, o), this.screenX = s, this.screenY = i, this.clientX = a, this.clientY = l, this.ctrlKey = c, this.altKey = u, this.shiftKey = d, this.metaKey = p, this.button = m, m) {
            case 0:
              this.buttons = 1;
              break;
            case 1:
              this.buttons = 4;
              break;
            case 2:
              this.buttons = 2;
              break;
            default:
              this.buttons = 0;
              break;
          }
          this.relatedTarget = f;
        }
      },
      getModifierState: {
        value: function (e) {
          switch (e) {
            case "Alt":
              return this.altKey;
            case "Control":
              return this.ctrlKey;
            case "Shift":
              return this.shiftKey;
            case "Meta":
              return this.metaKey;
            default:
              return false;
          }
        }
      }
    });
  });
  var UZn = __commonJS((fqb, $vl) => {
    $vl.exports = FZn;
    var zCm = [null, "INDEX_SIZE_ERR", null, "HIERARCHY_REQUEST_ERR", "WRONG_DOCUMENT_ERR", "INVALID_CHARACTER_ERR", null, "NO_MODIFICATION_ALLOWED_ERR", "NOT_FOUND_ERR", "NOT_SUPPORTED_ERR", "INUSE_ATTRIBUTE_ERR", "INVALID_STATE_ERR", "SYNTAX_ERR", "INVALID_MODIFICATION_ERR", "NAMESPACE_ERR", "INVALID_ACCESS_ERR", null, "TYPE_MISMATCH_ERR", "SECURITY_ERR", "NETWORK_ERR", "ABORT_ERR", "URL_MISMATCH_ERR", "QUOTA_EXCEEDED_ERR", "TIMEOUT_ERR", "INVALID_NODE_TYPE_ERR", "DATA_CLONE_ERR"];
    var KCm = [null, "INDEX_SIZE_ERR (1): the index is not in the allowed range", null, "HIERARCHY_REQUEST_ERR (3): the operation would yield an incorrect nodes model", "WRONG_DOCUMENT_ERR (4): the object is in the wrong Document, a call to importNode is required", "INVALID_CHARACTER_ERR (5): the string contains invalid characters", null, "NO_MODIFICATION_ALLOWED_ERR (7): the object can not be modified", "NOT_FOUND_ERR (8): the object can not be found here", "NOT_SUPPORTED_ERR (9): this operation is not supported", "INUSE_ATTRIBUTE_ERR (10): setAttributeNode called on owned Attribute", "INVALID_STATE_ERR (11): the object is in an invalid state", "SYNTAX_ERR (12): the string did not match the expected pattern", "INVALID_MODIFICATION_ERR (13): the object can not be modified in this way", "NAMESPACE_ERR (14): the operation is not allowed by Namespaces in XML", "INVALID_ACCESS_ERR (15): the object does not support the operation or argument", null, "TYPE_MISMATCH_ERR (17): the type of the object does not match the expected type", "SECURITY_ERR (18): the operation is insecure", "NETWORK_ERR (19): a network error occurred", "ABORT_ERR (20): the user aborted an operation", "URL_MISMATCH_ERR (21): the given URL does not match another URL", "QUOTA_EXCEEDED_ERR (22): the quota has been exceeded", "TIMEOUT_ERR (23): a timeout occurred", "INVALID_NODE_TYPE_ERR (24): the supplied node is invalid or has an invalid ancestor for this operation", "DATA_CLONE_ERR (25): the object can not be cloned."];
    var Bvl = {
      INDEX_SIZE_ERR: 1,
      DOMSTRING_SIZE_ERR: 2,
      HIERARCHY_REQUEST_ERR: 3,
      WRONG_DOCUMENT_ERR: 4,
      INVALID_CHARACTER_ERR: 5,
      NO_DATA_ALLOWED_ERR: 6,
      NO_MODIFICATION_ALLOWED_ERR: 7,
      NOT_FOUND_ERR: 8,
      NOT_SUPPORTED_ERR: 9,
      INUSE_ATTRIBUTE_ERR: 10,
      INVALID_STATE_ERR: 11,
      SYNTAX_ERR: 12,
      INVALID_MODIFICATION_ERR: 13,
      NAMESPACE_ERR: 14,
      INVALID_ACCESS_ERR: 15,
      VALIDATION_ERR: 16,
      TYPE_MISMATCH_ERR: 17,
      SECURITY_ERR: 18,
      NETWORK_ERR: 19,
      ABORT_ERR: 20,
      URL_MISMATCH_ERR: 21,
      QUOTA_EXCEEDED_ERR: 22,
      TIMEOUT_ERR: 23,
      INVALID_NODE_TYPE_ERR: 24,
      DATA_CLONE_ERR: 25
    };
    function FZn(e) {
      Error.call(this);
      Error.captureStackTrace(this, this.constructor);
      this.code = e;
      this.message = KCm[e];
      this.name = zCm[e];
    }
    FZn.prototype.__proto__ = Error.prototype;
    for (oYt in Bvl) {
      LZn = {
        value: Bvl[oYt]
      };
      Object.defineProperty(FZn, oYt, LZn);
      Object.defineProperty(FZn.prototype, oYt, LZn);
    }
    var LZn;
    var oYt;
  });
  var BZn = __commonJS(Hvl => {
    Hvl.isApiWritable = !globalThis.__domino_frozen__;
  });
  var O0 = __commonJS(Bb => {
    var P0 = UZn();
    var sP = P0;
    var YCm = BZn().isApiWritable;
    Bb.NAMESPACE = {
      HTML: "http://www.w3.org/1999/xhtml",
      XML: "http://www.w3.org/XML/1998/namespace",
      XMLNS: "http://www.w3.org/2000/xmlns/",
      MATHML: "http://www.w3.org/1998/Math/MathML",
      SVG: "http://www.w3.org/2000/svg",
      XLINK: "http://www.w3.org/1999/xlink"
    };
    Bb.IndexSizeError = function () {
      throw new P0(sP.INDEX_SIZE_ERR);
    };
    Bb.HierarchyRequestError = function () {
      throw new P0(sP.HIERARCHY_REQUEST_ERR);
    };
    Bb.WrongDocumentError = function () {
      throw new P0(sP.WRONG_DOCUMENT_ERR);
    };
    Bb.InvalidCharacterError = function () {
      throw new P0(sP.INVALID_CHARACTER_ERR);
    };
    Bb.NoModificationAllowedError = function () {
      throw new P0(sP.NO_MODIFICATION_ALLOWED_ERR);
    };
    Bb.NotFoundError = function () {
      throw new P0(sP.NOT_FOUND_ERR);
    };
    Bb.NotSupportedError = function () {
      throw new P0(sP.NOT_SUPPORTED_ERR);
    };
    Bb.InvalidStateError = function () {
      throw new P0(sP.INVALID_STATE_ERR);
    };
    Bb.SyntaxError = function () {
      throw new P0(sP.SYNTAX_ERR);
    };
    Bb.InvalidModificationError = function () {
      throw new P0(sP.INVALID_MODIFICATION_ERR);
    };
    Bb.NamespaceError = function () {
      throw new P0(sP.NAMESPACE_ERR);
    };
    Bb.InvalidAccessError = function () {
      throw new P0(sP.INVALID_ACCESS_ERR);
    };
    Bb.TypeMismatchError = function () {
      throw new P0(sP.TYPE_MISMATCH_ERR);
    };
    Bb.SecurityError = function () {
      throw new P0(sP.SECURITY_ERR);
    };
    Bb.NetworkError = function () {
      throw new P0(sP.NETWORK_ERR);
    };
    Bb.AbortError = function () {
      throw new P0(sP.ABORT_ERR);
    };
    Bb.UrlMismatchError = function () {
      throw new P0(sP.URL_MISMATCH_ERR);
    };
    Bb.QuotaExceededError = function () {
      throw new P0(sP.QUOTA_EXCEEDED_ERR);
    };
    Bb.TimeoutError = function () {
      throw new P0(sP.TIMEOUT_ERR);
    };
    Bb.InvalidNodeTypeError = function () {
      throw new P0(sP.INVALID_NODE_TYPE_ERR);
    };
    Bb.DataCloneError = function () {
      throw new P0(sP.DATA_CLONE_ERR);
    };
    Bb.nyi = function () {
      throw Error("NotYetImplemented");
    };
    Bb.shouldOverride = function () {
      throw Error("Abstract function; should be overriding in subclass.");
    };
    Bb.assert = function (e, t) {
      if (!e) {
        throw Error("Assertion failed: " + (t || "") + `
` + Error().stack);
      }
    };
    Bb.expose = function (e, t) {
      for (var n in e) {
        Object.defineProperty(t.prototype, n, {
          value: e[n],
          writable: YCm
        });
      }
    };
    Bb.merge = function (e, t) {
      for (var n in t) {
        e[n] = t[n];
      }
    };
    Bb.documentOrder = function (e, t) {
      return 3 - (e.compareDocumentPosition(t) & 6);
    };
    Bb.toASCIILowerCase = function (e) {
      return e.replace(/[A-Z]+/g, function (t) {
        return t.toLowerCase();
      });
    };
    Bb.toASCIIUpperCase = function (e) {
      return e.replace(/[a-z]+/g, function (t) {
        return t.toUpperCase();
      });
    };
  });
  var UNo = __commonJS((yqb, qvl) => {
    var MKe = mTt();
    var JCm = FNo();
    var XCm = O0();
    qvl.exports = jvl;
    function jvl() {}
    jvl.prototype = {
      addEventListener: function (t, n, r) {
        if (!n) {
          return;
        }
        if (r === undefined) {
          r = false;
        }
        if (!this._listeners) {
          this._listeners = Object.create(null);
        }
        if (!this._listeners[t]) {
          this._listeners[t] = [];
        }
        var o = this._listeners[t];
        for (var s = 0, i = o.length; s < i; s++) {
          var a = o[s];
          if (a.listener === n && a.capture === r) {
            return;
          }
        }
        var l = {
          listener: n,
          capture: r
        };
        if (typeof n === "function") {
          l.f = n;
        }
        o.push(l);
      },
      removeEventListener: function (t, n, r) {
        if (r === undefined) {
          r = false;
        }
        if (this._listeners) {
          var o = this._listeners[t];
          if (o) {
            for (var s = 0, i = o.length; s < i; s++) {
              var a = o[s];
              if (a.listener === n && a.capture === r) {
                if (o.length === 1) {
                  this._listeners[t] = undefined;
                } else {
                  o.splice(s, 1);
                }
                return;
              }
            }
          }
        }
      },
      dispatchEvent: function (t) {
        return this._dispatchEvent(t, false);
      },
      _dispatchEvent: function (t, n) {
        if (typeof n !== "boolean") {
          n = false;
        }
        function r(c, u) {
          var {
            type: d,
            eventPhase: p
          } = u;
          if (u.currentTarget = c, p !== MKe.CAPTURING_PHASE && c._handlers && c._handlers[d]) {
            var m = c._handlers[d];
            var f;
            if (typeof m === "function") {
              f = m.call(u.currentTarget, u);
            } else {
              var h = m.handleEvent;
              if (typeof h !== "function") {
                throw TypeError("handleEvent property of event handler object isnot a function.");
              }
              f = h.call(m, u);
            }
            switch (u.type) {
              case "mouseover":
                if (f === true) {
                  u.preventDefault();
                }
                break;
              case "beforeunload":
              default:
                if (f === false) {
                  u.preventDefault();
                }
                break;
            }
          }
          var g = c._listeners && c._listeners[d];
          if (!g) {
            return;
          }
          g = g.slice();
          for (var y = 0, _ = g.length; y < _; y++) {
            if (u._immediatePropagationStopped) {
              return;
            }
            var b = g[y];
            if (p === MKe.CAPTURING_PHASE && !b.capture || p === MKe.BUBBLING_PHASE && b.capture) {
              continue;
            }
            if (b.f) {
              b.f.call(u.currentTarget, u);
            } else {
              var S = b.listener.handleEvent;
              if (typeof S !== "function") {
                throw TypeError("handleEvent property of event listener object is not a function.");
              }
              S.call(b.listener, u);
            }
          }
        }
        if (!t._initialized || t._dispatching) {
          XCm.InvalidStateError();
        }
        t.isTrusted = n;
        t._dispatching = true;
        t.target = this;
        var o = [];
        for (var s = this.parentNode; s; s = s.parentNode) {
          o.push(s);
        }
        t.eventPhase = MKe.CAPTURING_PHASE;
        for (var i = o.length - 1; i >= 0; i--) {
          if (r(o[i], t), t._propagationStopped) {
            break;
          }
        }
        if (!t._propagationStopped) {
          t.eventPhase = MKe.AT_TARGET;
          r(this, t);
        }
        if (t.bubbles && !t._propagationStopped) {
          t.eventPhase = MKe.BUBBLING_PHASE;
          for (var a = 0, l = o.length; a < l; a++) {
            if (r(o[a], t), t._propagationStopped) {
              break;
            }
          }
        }
        if (t._dispatching = false, t.eventPhase = MKe.AT_TARGET, t.currentTarget = null, n && !t.defaultPrevented && t instanceof JCm) {
          switch (t.type) {
            case "mousedown":
              this._armed = {
                x: t.clientX,
                y: t.clientY,
                t: t.timeStamp
              };
              break;
            case "mouseout":
            case "mouseover":
              this._armed = null;
              break;
            case "mouseup":
              if (this._isClick(t)) {
                this._doClick(t);
              }
              this._armed = null;
              break;
          }
        }
        return !t.defaultPrevented;
      },
      _isClick: function (e) {
        return this._armed !== null && e.type === "mouseup" && e.isTrusted && e.button === 0 && e.timeStamp - this._armed.t < 1000 && Math.abs(e.clientX - this._armed.x) < 10 && Math.abs(e.clientY - this._armed.Y) < 10;
      },
      _doClick: function (e) {
        if (this._click_in_progress) {
          return;
        }
        this._click_in_progress = true;
        var t = this;
        while (t && !t._post_click_activation_steps) {
          t = t.parentNode;
        }
        if (t && t._pre_click_activation_steps) {
          t._pre_click_activation_steps();
        }
        var n = this.ownerDocument.createEvent("MouseEvent");
        n.initMouseEvent("click", true, true, this.ownerDocument.defaultView, 1, e.screenX, e.screenY, e.clientX, e.clientY, e.ctrlKey, e.altKey, e.shiftKey, e.metaKey, e.button, null);
        var r = this._dispatchEvent(n, true);
        if (t) {
          if (r) {
            if (t._post_click_activation_steps) {
              t._post_click_activation_steps(n);
            }
          } else if (t._cancelled_activation_steps) {
            t._cancelled_activation_steps();
          }
        }
      },
      _setEventHandler: function (t, n) {
        if (!this._handlers) {
          this._handlers = Object.create(null);
        }
        this._handlers[t] = n;
      },
      _getEventHandler: function (t) {
        return this._handlers && this._handlers[t] || null;
      }
    };
  });
  var BNo = __commonJS((_qb, Wvl) => {
    var Zve = O0();
    var hZ = Wvl.exports = {
      valid: function (e) {
        Zve.assert(e, "list falsy");
        Zve.assert(e._previousSibling, "previous falsy");
        Zve.assert(e._nextSibling, "next falsy");
        return true;
      },
      insertBefore: function (e, t) {
        Zve.assert(hZ.valid(e) && hZ.valid(t));
        var n = e;
        var r = e._previousSibling;
        var o = t;
        var s = t._previousSibling;
        n._previousSibling = s;
        r._nextSibling = o;
        s._nextSibling = n;
        o._previousSibling = r;
        Zve.assert(hZ.valid(e) && hZ.valid(t));
      },
      replace: function (e, t) {
        if (Zve.assert(hZ.valid(e) && (t === null || hZ.valid(t))), t !== null) {
          hZ.insertBefore(t, e);
        }
        hZ.remove(e);
        Zve.assert(hZ.valid(e) && (t === null || hZ.valid(t)));
      },
      remove: function (e) {
        Zve.assert(hZ.valid(e));
        var t = e._previousSibling;
        if (t === e) {
          return;
        }
        var n = e._nextSibling;
        t._nextSibling = n;
        n._previousSibling = t;
        e._previousSibling = e._nextSibling = e;
        Zve.assert(hZ.valid(e));
      }
    };
  });