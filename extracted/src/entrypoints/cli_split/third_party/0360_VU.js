  var VU = __commonJS((Sqb, owl) => {
    owl.exports = Lx;
    var rwl = UNo();
    var $Zn = BNo();
    var Zvl = $No();
    var $b = O0();
    function Lx() {
      rwl.call(this);
      this.parentNode = null;
      this._nextSibling = this._previousSibling = this;
      this._index = undefined;
    }
    var r5 = Lx.ELEMENT_NODE = 1;
    var HNo = Lx.ATTRIBUTE_NODE = 2;
    var HZn = Lx.TEXT_NODE = 3;
    var sRm = Lx.CDATA_SECTION_NODE = 4;
    var iRm = Lx.ENTITY_REFERENCE_NODE = 5;
    var jNo = Lx.ENTITY_NODE = 6;
    var ewl = Lx.PROCESSING_INSTRUCTION_NODE = 7;
    var twl = Lx.COMMENT_NODE = 8;
    var sYt = Lx.DOCUMENT_NODE = 9;
    var gZ = Lx.DOCUMENT_TYPE_NODE = 10;
    var ULe = Lx.DOCUMENT_FRAGMENT_NODE = 11;
    var qNo = Lx.NOTATION_NODE = 12;
    var WNo = Lx.DOCUMENT_POSITION_DISCONNECTED = 1;
    var GNo = Lx.DOCUMENT_POSITION_PRECEDING = 2;
    var VNo = Lx.DOCUMENT_POSITION_FOLLOWING = 4;
    var nwl = Lx.DOCUMENT_POSITION_CONTAINS = 8;
    var zNo = Lx.DOCUMENT_POSITION_CONTAINED_BY = 16;
    var KNo = Lx.DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 32;
    Lx.prototype = Object.create(rwl.prototype, {
      baseURI: {
        get: $b.nyi
      },
      parentElement: {
        get: function () {
          return this.parentNode && this.parentNode.nodeType === r5 ? this.parentNode : null;
        }
      },
      hasChildNodes: {
        value: $b.shouldOverride
      },
      firstChild: {
        get: $b.shouldOverride
      },
      lastChild: {
        get: $b.shouldOverride
      },
      isConnected: {
        get: function () {
          let e = this;
          while (e != null) {
            if (e.nodeType === Lx.DOCUMENT_NODE) {
              return true;
            }
            if (e = e.parentNode, e != null && e.nodeType === Lx.DOCUMENT_FRAGMENT_NODE) {
              e = e.host;
            }
          }
          return false;
        }
      },
      previousSibling: {
        get: function () {
          var e = this.parentNode;
          if (!e) {
            return null;
          }
          if (this === e.firstChild) {
            return null;
          }
          return this._previousSibling;
        }
      },
      nextSibling: {
        get: function () {
          var e = this.parentNode;
          var t = this._nextSibling;
          if (!e) {
            return null;
          }
          if (t === e.firstChild) {
            return null;
          }
          return t;
        }
      },
      textContent: {
        get: function () {
          return null;
        },
        set: function (e) {}
      },
      innerText: {
        get: function () {
          return null;
        },
        set: function (e) {}
      },
      _countChildrenOfType: {
        value: function (e) {
          var t = 0;
          for (var n = this.firstChild; n !== null; n = n.nextSibling) {
            if (n.nodeType === e) {
              t++;
            }
          }
          return t;
        }
      },
      _ensureInsertValid: {
        value: function (t, n, r) {
          var o = this;
          var s;
          var i;
          if (!t.nodeType) {
            throw TypeError("not a node");
          }
          switch (o.nodeType) {
            case sYt:
            case ULe:
            case r5:
              break;
            default:
              $b.HierarchyRequestError();
          }
          if (t.isAncestor(o)) {
            $b.HierarchyRequestError();
          }
          if (n !== null || !r) {
            if (n.parentNode !== o) {
              $b.NotFoundError();
            }
          }
          switch (t.nodeType) {
            case ULe:
            case gZ:
            case r5:
            case HZn:
            case ewl:
            case twl:
              break;
            default:
              $b.HierarchyRequestError();
          }
          if (o.nodeType === sYt) {
            switch (t.nodeType) {
              case HZn:
                $b.HierarchyRequestError();
                break;
              case ULe:
                if (t._countChildrenOfType(HZn) > 0) {
                  $b.HierarchyRequestError();
                }
                switch (t._countChildrenOfType(r5)) {
                  case 0:
                    break;
                  case 1:
                    if (n !== null) {
                      if (r && n.nodeType === gZ) {
                        $b.HierarchyRequestError();
                      }
                      for (i = n.nextSibling; i !== null; i = i.nextSibling) {
                        if (i.nodeType === gZ) {
                          $b.HierarchyRequestError();
                        }
                      }
                    }
                    if (s = o._countChildrenOfType(r5), r) {
                      if (s > 0) {
                        $b.HierarchyRequestError();
                      }
                    } else if (s > 1 || s === 1 && n.nodeType !== r5) {
                      $b.HierarchyRequestError();
                    }
                    break;
                  default:
                    $b.HierarchyRequestError();
                }
                break;
              case r5:
                if (n !== null) {
                  if (r && n.nodeType === gZ) {
                    $b.HierarchyRequestError();
                  }
                  for (i = n.nextSibling; i !== null; i = i.nextSibling) {
                    if (i.nodeType === gZ) {
                      $b.HierarchyRequestError();
                    }
                  }
                }
                if (s = o._countChildrenOfType(r5), r) {
                  if (s > 0) {
                    $b.HierarchyRequestError();
                  }
                } else if (s > 1 || s === 1 && n.nodeType !== r5) {
                  $b.HierarchyRequestError();
                }
                break;
              case gZ:
                if (n === null) {
                  if (o._countChildrenOfType(r5)) {
                    $b.HierarchyRequestError();
                  }
                } else {
                  for (i = o.firstChild; i !== null; i = i.nextSibling) {
                    if (i === n) {
                      break;
                    }
                    if (i.nodeType === r5) {
                      $b.HierarchyRequestError();
                    }
                  }
                }
                if (s = o._countChildrenOfType(gZ), r) {
                  if (s > 0) {
                    $b.HierarchyRequestError();
                  }
                } else if (s > 1 || s === 1 && n.nodeType !== gZ) {
                  $b.HierarchyRequestError();
                }
                break;
            }
          } else if (t.nodeType === gZ) {
            $b.HierarchyRequestError();
          }
        }
      },
      insertBefore: {
        value: function (t, n) {
          var r = this;
          r._ensureInsertValid(t, n, true);
          var o = n;
          if (o === t) {
            o = t.nextSibling;
          }
          r.doc.adoptNode(t);
          t._insertOrReplace(r, o, false);
          return t;
        }
      },
      appendChild: {
        value: function (e) {
          return this.insertBefore(e, null);
        }
      },
      _appendChild: {
        value: function (e) {
          e._insertOrReplace(this, null, false);
        }
      },
      removeChild: {
        value: function (t) {
          var n = this;
          if (!t.nodeType) {
            throw TypeError("not a node");
          }
          if (t.parentNode !== n) {
            $b.NotFoundError();
          }
          t.remove();
          return t;
        }
      },
      replaceChild: {
        value: function (t, n) {
          var r = this;
          if (r._ensureInsertValid(t, n, false), t.doc !== r.doc) {
            r.doc.adoptNode(t);
          }
          t._insertOrReplace(r, n, true);
          return n;
        }
      },
      contains: {
        value: function (t) {
          if (t === null) {
            return false;
          }
          if (this === t) {
            return true;
          }
          return (this.compareDocumentPosition(t) & zNo) !== 0;
        }
      },
      compareDocumentPosition: {
        value: function (t) {
          if (this === t) {
            return 0;
          }
          if (this.doc !== t.doc || this.rooted !== t.rooted) {
            return WNo + KNo;
          }
          var n = [];
          var r = [];
          for (var o = this; o !== null; o = o.parentNode) {
            n.push(o);
          }
          for (o = t; o !== null; o = o.parentNode) {
            r.push(o);
          }
          if (n.reverse(), r.reverse(), n[0] !== r[0]) {
            return WNo + KNo;
          }
          o = Math.min(n.length, r.length);
          for (var s = 1; s < o; s++) {
            if (n[s] !== r[s]) {
              if (n[s].index < r[s].index) {
                return VNo;
              } else {
                return GNo;
              }
            }
          }
          if (n.length < r.length) {
            return VNo + zNo;
          } else {
            return GNo + nwl;
          }
        }
      },
      isSameNode: {
        value: function (t) {
          return this === t;
        }
      },
      isEqualNode: {
        value: function (t) {
          if (!t) {
            return false;
          }
          if (t.nodeType !== this.nodeType) {
            return false;
          }
          if (!this.isEqual(t)) {
            return false;
          }
          for (var n = this.firstChild, r = t.firstChild; n && r; n = n.nextSibling, r = r.nextSibling) {
            if (!n.isEqualNode(r)) {
              return false;
            }
          }
          return n === null && r === null;
        }
      },
      cloneNode: {
        value: function (e) {
          var t = this.clone();
          if (e) {
            for (var n = this.firstChild; n !== null; n = n.nextSibling) {
              t._appendChild(n.cloneNode(true));
            }
          }
          return t;
        }
      },
      lookupPrefix: {
        value: function (t) {
          var n;
          if (t === "" || t === null || t === undefined) {
            return null;
          }
          switch (this.nodeType) {
            case r5:
              return this._lookupNamespacePrefix(t, this);
            case sYt:
              n = this.documentElement;
              return n ? n.lookupPrefix(t) : null;
            case jNo:
            case qNo:
            case ULe:
            case gZ:
              return null;
            case HNo:
              n = this.ownerElement;
              return n ? n.lookupPrefix(t) : null;
            default:
              n = this.parentElement;
              return n ? n.lookupPrefix(t) : null;
          }
        }
      },
      lookupNamespaceURI: {
        value: function (t) {
          if (t === "" || t === undefined) {
            t = null;
          }
          var n;
          switch (this.nodeType) {
            case r5:
              return $b.shouldOverride();
            case sYt:
              n = this.documentElement;
              return n ? n.lookupNamespaceURI(t) : null;
            case jNo:
            case qNo:
            case gZ:
            case ULe:
              return null;
            case HNo:
              n = this.ownerElement;
              return n ? n.lookupNamespaceURI(t) : null;
            default:
              n = this.parentElement;
              return n ? n.lookupNamespaceURI(t) : null;
          }
        }
      },
      isDefaultNamespace: {
        value: function (t) {
          if (t === "" || t === undefined) {
            t = null;
          }
          var n = this.lookupNamespaceURI(null);
          return n === t;
        }
      },
      index: {
        get: function () {
          var e = this.parentNode;
          if (this === e.firstChild) {
            return 0;
          }
          var t = e.childNodes;
          if (this._index === undefined || t[this._index] !== this) {
            for (var n = 0; n < t.length; n++) {
              t[n]._index = n;
            }
            $b.assert(t[this._index] === this);
          }
          return this._index;
        }
      },
      isAncestor: {
        value: function (e) {
          if (this.doc !== e.doc) {
            return false;
          }
          if (this.rooted !== e.rooted) {
            return false;
          }
          for (var t = e; t; t = t.parentNode) {
            if (t === this) {
              return true;
            }
          }
          return false;
        }
      },
      ensureSameDoc: {
        value: function (e) {
          if (e.ownerDocument === null) {
            e.ownerDocument = this.doc;
          } else if (e.ownerDocument !== this.doc) {
            $b.WrongDocumentError();
          }
        }
      },
      removeChildren: {
        value: $b.shouldOverride
      },
      _insertOrReplace: {
        value: function (t, n, r) {
          var o = this;
          var s;
          var i;
          if (o.nodeType === ULe && o.rooted) {
            $b.HierarchyRequestError();
          }
          if (t._childNodes) {
            if (s = n === null ? t._childNodes.length : n.index, o.parentNode === t) {
              var a = o.index;
              if (a < s) {
                s--;
              }
            }
          }
          if (r) {
            if (n.rooted) {
              n.doc.mutateRemove(n);
            }
            n.parentNode = null;
          }
          var l = n;
          if (l === null) {
            l = t.firstChild;
          }
          var c = o.rooted && t.rooted;
          if (o.nodeType === ULe) {
            var u = [0, r ? 1 : 0];
            var d;
            for (var p = o.firstChild; p !== null; p = d) {
              d = p.nextSibling;
              u.push(p);
              p.parentNode = t;
            }
            var m = u.length;
            if (r) {
              $Zn.replace(l, m > 2 ? u[2] : null);
            } else if (m > 2 && l !== null) {
              $Zn.insertBefore(u[2], l);
            }
            if (t._childNodes) {
              u[0] = n === null ? t._childNodes.length : n._index;
              t._childNodes.splice.apply(t._childNodes, u);
              for (i = 2; i < m; i++) {
                u[i]._index = u[0] + (i - 2);
              }
            } else if (t._firstChild === n) {
              if (m > 2) {
                t._firstChild = u[2];
              } else if (r) {
                t._firstChild = null;
              }
            }
            if (o._childNodes) {
              o._childNodes.length = 0;
            } else {
              o._firstChild = null;
            }
            if (t.rooted) {
              t.modify();
              for (i = 2; i < m; i++) {
                t.doc.mutateInsert(u[i]);
              }
            }
          } else {
            if (n === o) {
              return;
            }
            if (c) {
              o._remove();
            } else if (o.parentNode) {
              o.remove();
            }
            if (o.parentNode = t, r) {
              if ($Zn.replace(l, o), t._childNodes) {
                o._index = s;
                t._childNodes[s] = o;
              } else if (t._firstChild === n) {
                t._firstChild = o;
              }
            } else {
              if (l !== null) {
                $Zn.insertBefore(o, l);
              }
              if (t._childNodes) {
                o._index = s;
                t._childNodes.splice(s, 0, o);
              } else if (t._firstChild === n) {
                t._firstChild = o;
              }
            }
            if (c) {
              t.modify();
              t.doc.mutateMove(o);
            } else if (t.rooted) {
              t.modify();
              t.doc.mutateInsert(o);
            }
          }
        }
      },
      lastModTime: {
        get: function () {
          if (!this._lastModTime) {
            this._lastModTime = this.doc.modclock;
          }
          return this._lastModTime;
        }
      },
      modify: {
        value: function () {
          if (this.doc.modclock) {
            var e = ++this.doc.modclock;
            for (var t = this; t; t = t.parentElement) {
              if (t._lastModTime) {
                t._lastModTime = e;
              }
            }
          }
        }
      },
      doc: {
        get: function () {
          return this.ownerDocument || this;
        }
      },
      rooted: {
        get: function () {
          return !!this._nid;
        }
      },
      normalize: {
        value: function () {
          var e;
          for (var t = this.firstChild; t !== null; t = e) {
            if (e = t.nextSibling, t.normalize) {
              t.normalize();
            }
            if (t.nodeType !== Lx.TEXT_NODE) {
              continue;
            }
            if (t.nodeValue === "") {
              this.removeChild(t);
              continue;
            }
            var n = t.previousSibling;
            if (n === null) {
              continue;
            } else if (n.nodeType === Lx.TEXT_NODE) {
              n.appendData(t.nodeValue);
              this.removeChild(t);
            }
          }
        }
      },
      serialize: {
        value: function () {
          if (this._innerHTML) {
            return this._innerHTML;
          }
          var e = "";
          for (var t = this.firstChild; t !== null; t = t.nextSibling) {
            e += Zvl.serializeOne(t, this);
          }
          return e;
        }
      },
      outerHTML: {
        get: function () {
          return Zvl.serializeOne(this, {
            nodeType: 0
          });
        },
        set: $b.nyi
      },
      ELEMENT_NODE: {
        value: r5
      },
      ATTRIBUTE_NODE: {
        value: HNo
      },
      TEXT_NODE: {
        value: HZn
      },
      CDATA_SECTION_NODE: {
        value: sRm
      },
      ENTITY_REFERENCE_NODE: {
        value: iRm
      },
      ENTITY_NODE: {
        value: jNo
      },
      PROCESSING_INSTRUCTION_NODE: {
        value: ewl
      },
      COMMENT_NODE: {
        value: twl
      },
      DOCUMENT_NODE: {
        value: sYt
      },
      DOCUMENT_TYPE_NODE: {
        value: gZ
      },
      DOCUMENT_FRAGMENT_NODE: {
        value: ULe
      },
      NOTATION_NODE: {
        value: qNo
      },
      DOCUMENT_POSITION_DISCONNECTED: {
        value: WNo
      },
      DOCUMENT_POSITION_PRECEDING: {
        value: GNo
      },
      DOCUMENT_POSITION_FOLLOWING: {
        value: VNo
      },
      DOCUMENT_POSITION_CONTAINS: {
        value: nwl
      },
      DOCUMENT_POSITION_CONTAINED_BY: {
        value: zNo
      },
      DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: {
        value: KNo
      }
    });
  });
  var iwl = __commonJS((Tqb, swl) => {
    swl.exports = class extends Array {
      constructor(t) {
        super(t && t.length || 0);
        if (t) {
          for (var n in t) {
            this[n] = t[n];
          }
        }
      }
      item(t) {
        return this[t] || null;
      }
    };
  });
  var lwl = __commonJS((Eqb, awl) => {
    function aRm(e) {
      return this[e] || null;
    }
    function lRm(e) {
      if (!e) {
        e = [];
      }
      e.item = aRm;
      return e;
    }
    awl.exports = lRm;
  });
  var LKe = __commonJS((vqb, cwl) => {
    var YNo;
    try {
      YNo = iwl();
    } catch (e) {
      YNo = lwl();
    }
    cwl.exports = YNo;
  });
  var jZn = __commonJS((wqb, pwl) => {
    pwl.exports = dwl;
    var uwl = VU();
    var cRm = LKe();
    function dwl() {
      uwl.call(this);
      this._firstChild = this._childNodes = null;
    }
    dwl.prototype = Object.create(uwl.prototype, {
      hasChildNodes: {
        value: function () {
          if (this._childNodes) {
            return this._childNodes.length > 0;
          }
          return this._firstChild !== null;
        }
      },
      childNodes: {
        get: function () {
          this._ensureChildNodes();
          return this._childNodes;
        }
      },
      firstChild: {
        get: function () {
          if (this._childNodes) {
            return this._childNodes.length === 0 ? null : this._childNodes[0];
          }
          return this._firstChild;
        }
      },
      lastChild: {
        get: function () {
          var e = this._childNodes;
          var t;
          if (e) {
            return e.length === 0 ? null : e[e.length - 1];
          }
          if (t = this._firstChild, t === null) {
            return null;
          }
          return t._previousSibling;
        }
      },
      _ensureChildNodes: {
        value: function () {
          if (this._childNodes) {
            return;
          }
          var e = this._firstChild;
          var t = e;
          var n = this._childNodes = new cRm();
          if (e) {
            do {
              n.push(t);
              t = t._nextSibling;
            } while (t !== e);
          }
          this._firstChild = null;
        }
      },
      removeChildren: {
        value: function () {
          var t = this.rooted ? this.ownerDocument : null;
          var n = this.firstChild;
          var r;
          while (n !== null) {
            if (r = n, n = r.nextSibling, t) {
              t.mutateRemove(r);
            }
            r.parentNode = null;
          }
          if (this._childNodes) {
            this._childNodes.length = 0;
          } else {
            this._firstChild = null;
          }
          this.modify();
        }
      }
    });
  });
  var qZn = __commonJS(QNo => {
    QNo.isValidName = gRm;
    QNo.isValidQName = yRm;
    var iYt = "_A-Za-z\xC0-\xD6\xD8-\xF6\xF8-\u02FF\u0370-\u037D\u037F-\u1FFF\u200C-\u200D\u2070-\u218F\u2C00-\u2FEF\u3001-\uD7FF\uF900-\uFDCF\uFDF0-\uFFFD";
    var aYt = "-._A-Za-z0-9\xB7\xC0-\xD6\xD8-\xF6\xF8-\u02FF\u0300-\u037D\u037F-\u1FFF\u200C\u200D\u203F\u2040\u2070-\u218F\u2C00-\u2FEF\u3001-\uD7FF\uF900-\uFDCF\uFDF0-\uFFFD";
    var FKe = "[" + iYt + "][" + aYt + "]*";
    var JNo = iYt + ":";
    var XNo = aYt + ":";
    var pRm = new RegExp("^[" + JNo + "][" + XNo + "]*$");
    var mRm = new RegExp("^(" + FKe + "|" + FKe + ":" + FKe + ")$");
    iYt += "\uD800-\uDB7F\uDC00-\uDFFF";
    aYt += "\uD800-\uDB7F\uDC00-\uDFFF";
    FKe = "[" + iYt + "][" + aYt + "]*";
    JNo = iYt + ":";
    XNo = aYt + ":";
    var fRm = new RegExp("^[" + JNo + "][" + XNo + "]*$");
    var hRm = new RegExp("^(" + FKe + "|" + FKe + ":" + FKe + ")$");
    function gRm(e) {
      if ((/^[_:A-Za-z][-.:\w]+$/).test(e)) {
        return true;
      }
      if (pRm.test(e)) {
        return true;
      }
      if (!(/[\uD800-\uDB7F\uDC00-\uDFFF]/).test(e)) {
        return false;
      }
      if (!fRm.test(e)) {
        return false;
      }
      var t = e.match(/[\uD800-\uDB7F\uDC00-\uDFFF]/g);
      var n = e.match(/[\uD800-\uDB7F][\uDC00-\uDFFF]/g);
      return n !== null && 2 * n.length === t.length;
    }
    function yRm(e) {
      if ((/^([_A-Za-z][-.\w]+|[_A-Za-z][-.\w]+:[_A-Za-z][-.\w]+)$/).test(e)) {
        return true;
      }
      if (mRm.test(e)) {
        return true;
      }
      if (!(/[\uD800-\uDB7F\uDC00-\uDFFF]/).test(e)) {
        return false;
      }
      if (!hRm.test(e)) {
        return false;
      }
      var t = e.match(/[\uD800-\uDB7F\uDC00-\uDFFF]/g);
      var n = e.match(/[\uD800-\uDB7F][\uDC00-\uDFFF]/g);
      return n !== null && 2 * n.length === t.length;
    }
  });
  var e1o = __commonJS(ZNo => {
    var gwl = O0();
    ZNo.property = function (e) {
      if (Array.isArray(e.type)) {
        var t = Object.create(null);
        e.type.forEach(function (o) {
          t[o.value || o] = o.alias || o;
        });
        var n = e.missing;
        if (n === undefined) {
          n = null;
        }
        var r = e.invalid;
        if (r === undefined) {
          r = n;
        }
        return {
          get: function () {
            var o = this._getattr(e.name);
            if (o === null) {
              return n;
            }
            if (o = t[o.toLowerCase()], o !== undefined) {
              return o;
            }
            if (r !== null) {
              return r;
            }
            return o;
          },
          set: function (o) {
            this._setattr(e.name, o);
          }
        };
      } else if (e.type === Boolean) {
        return {
          get: function () {
            return this.hasAttribute(e.name);
          },
          set: function (o) {
            if (o) {
              this._setattr(e.name, "");
            } else {
              this.removeAttribute(e.name);
            }
          }
        };
      } else if (e.type === Number || e.type === "long" || e.type === "unsigned long" || e.type === "limited unsigned long with fallback") {
        return _Rm(e);
      } else if (!e.type || e.type === String) {
        return {
          get: function () {
            return this._getattr(e.name) || "";
          },
          set: function (o) {
            if (e.treatNullAsEmptyString && o === null) {
              o = "";
            }
            this._setattr(e.name, o);
          }
        };
      } else if (typeof e.type === "function") {
        return e.type(e.name, e);
      }
      throw Error("Invalid attribute definition");
    };
    function _Rm(e) {
      var t;
      if (typeof e.default === "function") {
        t = e.default;
      } else if (typeof e.default === "number") {
        t = function () {
          return e.default;
        };
      } else {
        t = function () {
          gwl.assert(false, typeof e.default);
        };
      }
      var n = e.type === "unsigned long";
      var r = e.type === "long";
      var o = e.type === "limited unsigned long with fallback";
      var s = e.min;
      var i = e.max;
      var a = e.setmin;
      if (s === undefined) {
        if (n) {
          s = 0;
        }
        if (r) {
          s = -2147483648;
        }
        if (o) {
          s = 1;
        }
      }
      if (i === undefined) {
        if (n || r || o) {
          i = 2147483647;
        }
      }
      return {
        get: function () {
          var l = this._getattr(e.name);
          var c = e.float ? parseFloat(l) : parseInt(l, 10);
          if (l === null || !isFinite(c) || s !== undefined && c < s || i !== undefined && c > i) {
            return t.call(this);
          }
          if (n || r || o) {
            if (!/^[ \t\n\f\r]*[-+]?[0-9]/.test(l)) {
              return t.call(this);
            }
            c = c | 0;
          }
          return c;
        },
        set: function (l) {
          if (!e.float) {
            l = Math.floor(l);
          }
          if (a !== undefined && l < a) {
            gwl.IndexSizeError(e.name + " set to " + l);
          }
          if (n) {
            l = l < 0 || l > 2147483647 ? t.call(this) : l | 0;
          } else if (o) {
            l = l < 1 || l > 2147483647 ? t.call(this) : l | 0;
          } else if (r) {
            l = l < -2147483648 || l > 2147483647 ? t.call(this) : l | 0;
          }
          this._setattr(e.name, String(l));
        }
      };
    }
    ZNo.registerChangeHandler = function (e, t, n) {
      var r = e.prototype;
      if (!Object.prototype.hasOwnProperty.call(r, "_attributeChangeHandlers")) {
        r._attributeChangeHandlers = Object.create(r._attributeChangeHandlers || null);
      }
      r._attributeChangeHandlers[t] = n;
    };
  });
  var bwl = __commonJS((xqb, _wl) => {
    _wl.exports = ywl;
    var bRm = VU();
    function ywl(e, t) {
      this.root = e;
      this.filter = t;
      this.lastModTime = e.lastModTime;
      this.done = false;
      this.cache = [];
      this.traverse();
    }
    ywl.prototype = Object.create(Object.prototype, {
      length: {
        get: function () {
          if (this.checkcache(), !this.done) {
            this.traverse();
          }
          return this.cache.length;
        }
      },
      item: {
        value: function (e) {
          if (this.checkcache(), !this.done && e >= this.cache.length) {
            this.traverse();
          }
          return this.cache[e];
        }
      },
      checkcache: {
        value: function () {
          if (this.lastModTime !== this.root.lastModTime) {
            for (var e = this.cache.length - 1; e >= 0; e--) {
              this[e] = undefined;
            }
            this.cache.length = 0;
            this.done = false;
            this.lastModTime = this.root.lastModTime;
          }
        }
      },
      traverse: {
        value: function (e) {
          if (e !== undefined) {
            e++;
          }
          var t;
          while ((t = this.next()) !== null) {
            if (this[this.cache.length] = t, this.cache.push(t), e && this.cache.length === e) {
              return;
            }
          }
          this.done = true;
        }
      },
      next: {
        value: function () {
          var e = this.cache.length === 0 ? this.root : this.cache[this.cache.length - 1];
          var t;
          if (e.nodeType === bRm.DOCUMENT_NODE) {
            t = e.documentElement;
          } else {
            t = e.nextElement(this.root);
          }
          while (t) {
            if (this.filter(t)) {
              return t;
            }
            t = t.nextElement(this.root);
          }
          return null;
        }
      }
    });
  });
  var n1o = __commonJS((kqb, Ewl) => {
    var t1o = O0();
    Ewl.exports = Twl;
    function Twl(e, t) {
      this._getString = e;
      this._setString = t;
      this._length = 0;
      this._lastStringValue = "";
      this._update();
    }
    Object.defineProperties(Twl.prototype, {
      length: {
        get: function () {
          return this._length;
        }
      },
      item: {
        value: function (e) {
          var t = fTt(this);
          if (e < 0 || e >= t.length) {
            return null;
          }
          return t[e];
        }
      },
      contains: {
        value: function (e) {
          e = String(e);
          var t = fTt(this);
          return t.indexOf(e) > -1;
        }
      },
      add: {
        value: function () {
          var e = fTt(this);
          for (var t = 0, n = arguments.length; t < n; t++) {
            var r = lYt(arguments[t]);
            if (e.indexOf(r) < 0) {
              e.push(r);
            }
          }
          this._update(e);
        }
      },
      remove: {
        value: function () {
          var e = fTt(this);
          for (var t = 0, n = arguments.length; t < n; t++) {
            var r = lYt(arguments[t]);
            var o = e.indexOf(r);
            if (o > -1) {
              e.splice(o, 1);
            }
          }
          this._update(e);
        }
      },
      toggle: {
        value: function (t, n) {
          if (t = lYt(t), this.contains(t)) {
            if (n === undefined || n === false) {
              this.remove(t);
              return false;
            }
            return true;
          } else {
            if (n === undefined || n === true) {
              this.add(t);
              return true;
            }
            return false;
          }
        }
      },
      replace: {
        value: function (t, n) {
          if (String(n) === "") {
            t1o.SyntaxError();
          }
          t = lYt(t);
          n = lYt(n);
          var r = fTt(this);
          var o = r.indexOf(t);
          if (o < 0) {
            return false;
          }
          var s = r.indexOf(n);
          if (s < 0) {
            r[o] = n;
          } else if (o < s) {
            r[o] = n;
            r.splice(s, 1);
          } else {
            r.splice(o, 1);
          }
          this._update(r);
          return true;
        }
      },
      toString: {
        value: function () {
          return this._getString();
        }
      },
      value: {
        get: function () {
          return this._getString();
        },
        set: function (e) {
          this._setString(e);
          this._update();
        }
      },
      _update: {
        value: function (e) {
          if (e) {
            Swl(this, e);
            this._setString(e.join(" ").trim());
          } else {
            Swl(this, fTt(this));
          }
          this._lastStringValue = this._getString();
        }
      }
    });
    function Swl(e, t) {
      var n = e._length;
      var r;
      e._length = t.length;
      for (r = 0; r < t.length; r++) {
        e[r] = t[r];
      }
      for (; r < n; r++) {
        e[r] = undefined;
      }
    }
    function lYt(e) {
      if (e = String(e), e === "") {
        t1o.SyntaxError();
      }
      if (/[ \t\r\n\f]/.test(e)) {
        t1o.InvalidCharacterError();
      }
      return e;
    }
    function SRm(e) {
      var t = e._length;
      var n = Array(t);
      for (var r = 0; r < t; r++) {
        n[r] = e[r];
      }
      return n;
    }
    function fTt(e) {
      var t = e._getString();
      if (t === e._lastStringValue) {
        return SRm(e);
      }
      var n = t.replace(/(^[ \t\r\n\f]+)|([ \t\r\n\f]+$)/g, "");
      if (n === "") {
        return [];
      } else {
        var r = Object.create(null);
        return n.split(/[ \t\r\n\f]+/g).filter(function (o) {
          var s = "$" + o;
          if (r[s]) {
            return false;
          }
          r[s] = true;
          return true;
        });
      }
    }
  });
  var zZn = __commonJS((yTt, kwl) => {
    var WZn = Object.create(null, {
      location: {
        get: function () {
          throw Error("window.location is not supported.");
        }
      }
    });
    var TRm = function (e, t) {
      return e.compareDocumentPosition(t);
    };
    var ERm = function (e, t) {
      return TRm(e, t) & 2 ? 1 : -1;
    };
    var VZn = function (e) {
      while ((e = e.nextSibling) && e.nodeType !== 1) {
        ;
      }
      return e;
    };
    var gTt = function (e) {
      while ((e = e.previousSibling) && e.nodeType !== 1) {
        ;
      }
      return e;
    };
    var vRm = function (e) {
      if (e = e.firstChild) {
        while (e.nodeType !== 1 && (e = e.nextSibling)) {
          ;
        }
      }
      return e;
    };
    var wRm = function (e) {
      if (e = e.lastChild) {
        while (e.nodeType !== 1 && (e = e.previousSibling)) {
          ;
        }
      }
      return e;
    };
    var hTt = function (e) {
      if (!e.parentNode) {
        return false;
      }
      var t = e.parentNode.nodeType;
      return t === 1 || t === 9;
    };
    var vwl = function (e) {
      if (!e) {
        return e;
      }
      var t = e[0];
      if (t === '"' || t === "'") {
        if (e[e.length - 1] === t) {
          e = e.slice(1, -1);
        } else {
          e = e.slice(1);
        }
        return e.replace(lp.str_escape, function (n) {
          var r = /^\\(?:([0-9A-Fa-f]+)|([\r\n\f]+))/.exec(n);
          if (!r) {
            return n.slice(1);
          }
          if (r[2]) {
            return "";
          }
          var o = parseInt(r[1], 16);
          return String.fromCodePoint ? String.fromCodePoint(o) : String.fromCharCode(o);
        });
      } else if (lp.ident.test(e)) {
        return BLe(e);
      } else {
        return e;
      }
    };
    var BLe = function (e) {
      return e.replace(lp.escape, function (t) {
        var n = /^\\([0-9A-Fa-f]+)/.exec(t);
        if (!n) {
          return t[1];
        }
        var r = parseInt(n[1], 16);
        return String.fromCodePoint ? String.fromCodePoint(r) : String.fromCharCode(r);
      });
    };
    var CRm = function () {
      if (Array.prototype.indexOf) {
        return Array.prototype.indexOf;
      }
      return function (e, t) {
        var n = this.length;
        while (n--) {
          if (this[n] === t) {
            return n;
          }
        }
        return -1;
      };
    }();
    var Cwl = function (e, t) {
      var n = lp.inside.source.replace(/</g, e).replace(/>/g, t);
      return new RegExp(n);
    };
    var o5 = function (e, t, n) {
      e = e.source;
      e = e.replace(t, n.source || n);
      return new RegExp(e);
    };
    var wwl = function (e, t) {
      return e.replace(/^(?:\w+:\/\/|\/+)/, "").replace(/(?:\/+|\/*#.*?)$/, "").split("/", t).join("/");
    };
    var RRm = function (e, t) {
      var n = e.replace(/\s+/g, "");
      var r;
      if (n === "even") {
        n = "2n+0";
      } else if (n === "odd") {
        n = "2n+1";
      } else if (n.indexOf("n") === -1) {
        n = "0n" + n;
      }
      r = /^([+-])?(\d+)?n([+-])?(\d+)?$/.exec(n);
      return {
        group: r[1] === "-" ? -(r[2] || 1) : +(r[2] || 1),
        offset: r[4] ? r[3] === "-" ? -r[4] : +r[4] : 0
      };
    };
    var r1o = function (e, t, n) {
      var r = RRm(e);
      var o = r.group;
      var s = r.offset;
      var i = !n ? vRm : wRm;
      var a = !n ? VZn : gTt;
      return function (l) {
        if (!hTt(l)) {
          return;
        }
        var c = i(l.parentNode);
        var u = 0;
        while (c) {
          if (t(c, l)) {
            u++;
          }
          if (c === l) {
            u -= s;
            return o && u ? u % o === 0 && u < 0 === o < 0 : !u;
          }
          c = a(c);
        }
      };
    };
    var sL = {
      "*": function () {
        return function () {
          return true;
        };
      }(),
      type: function (e) {
        e = e.toLowerCase();
        return function (t) {
          return t.nodeName.toLowerCase() === e;
        };
      },
      attr: function (e, t, n, r) {
        t = Rwl[t];
        return function (o) {
          var s;
          switch (e) {
            case "for":
              s = o.htmlFor;
              break;
            case "class":
              if (s = o.className, s === "" && o.getAttribute("class") == null) {
                s = null;
              }
              break;
            case "href":
            case "src":
              s = o.getAttribute(e, 2);
              break;
            case "title":
              s = o.getAttribute("title") || null;
              break;
            case "id":
            case "lang":
            case "dir":
            case "accessKey":
            case "hidden":
            case "tabIndex":
            case "style":
              if (o.getAttribute) {
                s = o.getAttribute(e);
                break;
              }
            default:
              if (o.hasAttribute && !o.hasAttribute(e)) {
                break;
              }
              s = o[e] != null ? o[e] : o.getAttribute && o.getAttribute(e);
              break;
          }
          if (s == null) {
            return;
          }
          if (s = s + "", r) {
            s = s.toLowerCase();
            n = n.toLowerCase();
          }
          return t(s, n);
        };
      },
      ":first-child": function (e) {
        return !gTt(e) && hTt(e);
      },
      ":last-child": function (e) {
        return !VZn(e) && hTt(e);
      },
      ":only-child": function (e) {
        return !gTt(e) && !VZn(e) && hTt(e);
      },
      ":nth-child": function (e, t) {
        return r1o(e, function () {
          return true;
        }, t);
      },
      ":nth-last-child": function (e) {
        return sL[":nth-child"](e, true);
      },
      ":root": function (e) {
        return e.ownerDocument.documentElement === e;
      },
      ":empty": function (e) {
        return !e.firstChild;
      },
      ":not": function (e) {
        var t = s1o(e);
        return function (n) {
          return !t(n);
        };
      },
      ":first-of-type": function (e) {
        if (!hTt(e)) {
          return;
        }
        var t = e.nodeName;
        while (e = gTt(e)) {
          if (e.nodeName === t) {
            return;
          }
        }
        return true;
      },
      ":last-of-type": function (e) {
        if (!hTt(e)) {
          return;
        }
        var t = e.nodeName;
        while (e = VZn(e)) {
          if (e.nodeName === t) {
            return;
          }
        }
        return true;
      },
      ":only-of-type": function (e) {
        return sL[":first-of-type"](e) && sL[":last-of-type"](e);
      },
      ":nth-of-type": function (e, t) {
        return r1o(e, function (n, r) {
          return n.nodeName === r.nodeName;
        }, t);
      },
      ":nth-last-of-type": function (e) {
        return sL[":nth-of-type"](e, true);
      },
      ":checked": function (e) {
        return !!(e.checked || e.selected);
      },
      ":indeterminate": function (e) {
        return !sL[":checked"](e);
      },
      ":enabled": function (e) {
        return !e.disabled && e.type !== "hidden";
      },
      ":disabled": function (e) {
        return !!e.disabled;
      },
      ":target": function (e) {
        return e.id === WZn.location.hash.substring(1);
      },
      ":focus": function (e) {
        return e === e.ownerDocument.activeElement;
      },
      ":is": function (e) {
        return s1o(e);
      },
      ":matches": function (e) {
        return sL[":is"](e);
      },
      ":nth-match": function (e, t) {
        var n = e.split(/\s*,\s*/);
        var r = n.shift();
        var o = s1o(n.join(","));
        return r1o(r, o, t);
      },
      ":nth-last-match": function (e) {
        return sL[":nth-match"](e, true);
      },
      ":links-here": function (e) {
        return e + "" === WZn.location + "";
      },
      ":lang": function (e) {
        return function (t) {
          while (t) {
            if (t.lang) {
              return t.lang.indexOf(e) === 0;
            }
            t = t.parentNode;
          }
        };
      },
      ":dir": function (e) {
        return function (t) {
          while (t) {
            if (t.dir) {
              return t.dir === e;
            }
            t = t.parentNode;
          }
        };
      },
      ":scope": function (e, t) {
        var n = t || e.ownerDocument;
        if (n.nodeType === 9) {
          return e === n.documentElement;
        }
        return e === n;
      },
      ":any-link": function (e) {
        return typeof e.href === "string";
      },
      ":local-link": function (e) {
        if (e.nodeName) {
          return e.href && e.host === WZn.location.host;
        }
        var t = +e + 1;
        return function (n) {
          if (!n.href) {
            return;
          }
          var r = WZn.location + "";
          var o = n + "";
          return wwl(r, t) === wwl(o, t);
        };
      },
      ":default": function (e) {
        return !!e.defaultSelected;
      },
      ":valid": function (e) {
        return e.willValidate || e.validity && e.validity.valid;
      },
      ":invalid": function (e) {
        return !sL[":valid"](e);
      },
      ":in-range": function (e) {
        return e.value > e.min && e.value <= e.max;
      },
      ":out-of-range": function (e) {
        return !sL[":in-range"](e);
      },
      ":required": function (e) {
        return !!e.required;
      },
      ":optional": function (e) {
        return !e.required;
      },
      ":read-only": function (e) {
        if (e.readOnly) {
          return true;
        }
        var t = e.getAttribute("contenteditable");
        var n = e.contentEditable;
        var r = e.nodeName.toLowerCase();
        r = r !== "input" && r !== "textarea";
        return (r || e.disabled) && t == null && n !== "true";
      },
      ":read-write": function (e) {
        return !sL[":read-only"](e);
      },
      ":hover": function () {
        throw Error(":hover is not supported.");
      },
      ":active": function () {
        throw Error(":active is not supported.");
      },
      ":link": function () {
        throw Error(":link is not supported.");
      },
      ":visited": function () {
        throw Error(":visited is not supported.");
      },
      ":column": function () {
        throw Error(":column is not supported.");
      },
      ":nth-column": function () {
        throw Error(":nth-column is not supported.");
      },
      ":nth-last-column": function () {
        throw Error(":nth-last-column is not supported.");
      },
      ":current": function () {
        throw Error(":current is not supported.");
      },
      ":past": function () {
        throw Error(":past is not supported.");
      },
      ":future": function () {
        throw Error(":future is not supported.");
      },
      ":contains": function (e) {
        return function (t) {
          var n = t.innerText || t.textContent || t.value || "";
          return n.indexOf(e) !== -1;
        };
      },
      ":has": function (e) {
        return function (t) {
          return xwl(e, t).length > 0;
        };
      }
    };
    var Rwl = {
      "-": function () {
        return true;
      },
      "=": function (e, t) {
        return e === t;
      },
      "*=": function (e, t) {
        return e.indexOf(t) !== -1;
      },
      "~=": function (e, t) {
        var n;
        var r;
        var o;
        var s;
        for (r = 0;; r = n + 1) {
          if (n = e.indexOf(t, r), n === -1) {
            return false;
          }
          if (o = e[n - 1], s = e[n + t.length], (!o || o === " ") && (!s || s === " ")) {
            return true;
          }
        }
      },
      "|=": function (e, t) {
        var n = e.indexOf(t);
        var r;
        if (n !== 0) {
          return;
        }
        r = e[n + t.length];
        return r === "-" || !r;
      },
      "^=": function (e, t) {
        return e.indexOf(t) === 0;
      },
      "$=": function (e, t) {
        var n = e.lastIndexOf(t);
        return n !== -1 && n + t.length === e.length;
      },
      "!=": function (e, t) {
        return e !== t;
      }
    };
    var cYt = {
      " ": function (e) {
        return function (t) {
          while (t = t.parentNode) {
            if (e(t)) {
              return t;
            }
          }
        };
      },
      ">": function (e) {
        return function (t) {
          if (t = t.parentNode) {
            return e(t) && t;
          }
        };
      },
      "+": function (e) {
        return function (t) {
          if (t = gTt(t)) {
            return e(t) && t;
          }
        };
      },
      "~": function (e) {
        return function (t) {
          while (t = gTt(t)) {
            if (e(t)) {
              return t;
            }
          }
        };
      },
      noop: function (e) {
        return function (t) {
          return e(t) && t;
        };
      },
      ref: function (e, t) {
        var n;
        function r(o) {
          var s = o.ownerDocument;
          var i = s.getElementsByTagName("*");
          var a = i.length;
          while (a--) {
            if (n = i[a], r.test(o)) {
              n = null;
              return true;
            }
          }
          n = null;
        }
        r.combinator = function (o) {
          if (!n || !n.getAttribute) {
            return;
          }
          var s = n.getAttribute(t) || "";
          if (s[0] === "#") {
            s = s.substring(1);
          }
          if (s === o.id && e(n)) {
            return n;
          }
        };
        return r;
      }
    };
    var lp = {
      escape: /\\(?:[^0-9A-Fa-f\r\n]|[0-9A-Fa-f]{1,6}[\r\n\t ]?)/g,
      str_escape: /(escape)|\\(\n|\r\n?|\f)/g,
      nonascii: /[\u00A0-\uFFFF]/,
      cssid: /(?:(?!-?[0-9])(?:escape|nonascii|[-_a-zA-Z0-9])+)/,
      qname: /^ *(cssid|\*)/,
      simple: /^(?:([.#]cssid)|pseudo|attr)/,
      ref: /^ *\/(cssid)\/ */,
      combinator: /^(?: +([^ \w*.#\\]) +|( )+|([^ \w*.#\\]))(?! *$)/,
      attr: /^\[(cssid)(?:([^\w]?=)(inside))?\]/,
      pseudo: /^(:cssid)(?:\((inside)\))?/,
      inside: /(?:"(?:\\"|[^"])*"|'(?:\\'|[^'])*'|<[^"'>]*>|\\["'>]|[^"'>])*/,
      ident: /^(cssid)$/
    };
    lp.cssid = o5(lp.cssid, "nonascii", lp.nonascii);
    lp.cssid = o5(lp.cssid, "escape", lp.escape);
    lp.qname = o5(lp.qname, "cssid", lp.cssid);
    lp.simple = o5(lp.simple, "cssid", lp.cssid);
    lp.ref = o5(lp.ref, "cssid", lp.cssid);
    lp.attr = o5(lp.attr, "cssid", lp.cssid);
    lp.pseudo = o5(lp.pseudo, "cssid", lp.cssid);
    lp.inside = o5(lp.inside, `[^"'>]*`, lp.inside);
    lp.attr = o5(lp.attr, "inside", Cwl("\\[", "\\]"));
    lp.pseudo = o5(lp.pseudo, "inside", Cwl("\\(", "\\)"));
    lp.simple = o5(lp.simple, "pseudo", lp.pseudo);
    lp.simple = o5(lp.simple, "attr", lp.attr);
    lp.ident = o5(lp.ident, "cssid", lp.cssid);
    lp.str_escape = o5(lp.str_escape, "escape", lp.escape);
    var uYt = function (e) {
      var t = e.replace(/^\s+|\s+$/g, "");
      var n;
      var r = [];
      var o = [];
      var s;
      var i;
      var a;
      var l;
      var c;
      while (t) {
        if (a = lp.qname.exec(t)) {
          t = t.substring(a[0].length);
          i = BLe(a[1]);
          o.push(GZn(i, true));
        } else if (a = lp.simple.exec(t)) {
          t = t.substring(a[0].length);
          i = "*";
          o.push(GZn(i, true));
          o.push(GZn(a));
        } else {
          throw SyntaxError("Invalid selector.");
        }
        while (a = lp.simple.exec(t)) {
          t = t.substring(a[0].length);
          o.push(GZn(a));
        }
        if (t[0] === "!") {
          t = t.substring(1);
          s = kRm();
          s.qname = i;
          o.push(s.simple);
        }
        if (a = lp.ref.exec(t)) {
          t = t.substring(a[0].length);
          c = cYt.ref(o1o(o), BLe(a[1]));
          r.push(c.combinator);
          o = [];
          continue;
        }
        if (a = lp.combinator.exec(t)) {
          if (t = t.substring(a[0].length), l = a[1] || a[2] || a[3], l === ",") {
            r.push(cYt.noop(o1o(o)));
            break;
          }
        } else {
          l = "noop";
        }
        if (!cYt[l]) {
          throw SyntaxError("Bad combinator.");
        }
        r.push(cYt[l](o1o(o)));
        o = [];
      }
      if (n = xRm(r), n.qname = i, n.sel = t, s) {
        s.lname = n.qname;
        s.test = n;
        s.qname = s.qname;
        s.sel = n.sel;
        n = s;
      }
      if (c) {
        c.test = n;
        c.qname = n.qname;
        c.sel = n.sel;
        n = c;
      }
      return n;
    };
    var GZn = function (e, t) {
      if (t) {
        return e === "*" ? sL["*"] : sL.type(e);
      }
      if (e[1]) {
        return e[1][0] === "." ? sL.attr("class", "~=", BLe(e[1].substring(1)), false) : sL.attr("id", "=", BLe(e[1].substring(1)), false);
      }
      if (e[2]) {
        return e[3] ? sL[BLe(e[2])](vwl(e[3])) : sL[BLe(e[2])];
      }
      if (e[4]) {
        var n = e[6];
        var r = /["'\s]\s*I$/i.test(n);
        if (r) {
          n = n.replace(/\s*I$/i, "");
        }
        return sL.attr(BLe(e[4]), e[5] || "-", vwl(n), r);
      }
      throw SyntaxError("Unknown Selector.");
    };
    var o1o = function (e) {
      var t = e.length;
      var n;
      if (t < 2) {
        return e[0];
      }
      return function (r) {
        if (!r) {
          return;
        }
        for (n = 0; n < t; n++) {
          if (!e[n](r)) {
            return;
          }
        }
        return true;
      };
    };
    var xRm = function (e) {
      if (e.length < 2) {
        return function (t) {
          return !!e[0](t);
        };
      }
      return function (t) {
        var n = e.length;
        while (n--) {
          if (!(t = e[n](t))) {
            return;
          }
        }
        return true;
      };
    };
    var kRm = function () {
      var e;
      function t(n) {
        var r = n.ownerDocument;
        var o = r.getElementsByTagName(t.lname);
        var s = o.length;
        while (s--) {
          if (t.test(o[s]) && e === n) {
            e = null;
            return true;
          }
        }
        e = null;
      }
      t.simple = function (n) {
        e = n;
        return true;
      };
      return t;
    };
    var s1o = function (e) {
      var t = uYt(e);
      var n = [t];
      while (t.sel) {
        t = uYt(t.sel);
        n.push(t);
      }
      if (n.length < 2) {
        return t;
      }
      return function (r) {
        var o = n.length;
        var s = 0;
        for (; s < o; s++) {
          if (n[s](r)) {
            return true;
          }
        }
      };
    };
    var xwl = function (e, t) {
      var n = [];
      var r = uYt(e);
      var o = t.getElementsByTagName(r.qname);
      var s = 0;
      var i;
      while (i = o[s++]) {
        if (r(i)) {
          n.push(i);
        }
      }
      if (r.sel) {
        while (r.sel) {
          r = uYt(r.sel);
          o = t.getElementsByTagName(r.qname);
          s = 0;
          while (i = o[s++]) {
            if (r(i) && CRm.call(n, i) === -1) {
              n.push(i);
            }
          }
        }
        n.sort(ERm);
      }
      return n;
    };
    kwl.exports = yTt = function (e, t) {
      var n;
      var r;
      if (t.nodeType !== 11 && e.indexOf(" ") === -1) {
        if (e[0] === "#" && t.rooted && /^#[A-Z_][-A-Z0-9_]*$/i.test(e)) {
          if (t.doc._hasMultipleElementsWithId) {
            if (n = e.substring(1), !t.doc._hasMultipleElementsWithId(n)) {
              r = t.doc.getElementById(n);
              return r ? [r] : [];
            }
          }
        }
        if (e[0] === "." && /^\.\w+$/.test(e)) {
          return t.getElementsByClassName(e.substring(1));
        }
        if (/^\w+$/.test(e)) {
          return t.getElementsByTagName(e);
        }
      }
      return xwl(e, t);
    };
    yTt.selectors = sL;
    yTt.operators = Rwl;
    yTt.combinators = cYt;
    yTt.matches = function (e, t) {
      var n = {
        sel: t
      };
      do {
        if (n = uYt(n.sel), n(e)) {
          return true;
        }
      } while (n.sel);
      return false;
    };
  });
  var KZn = __commonJS((Aqb, Awl) => {
    var ARm = VU();
    var IRm = BNo();
    var i1o = function (e, t) {
      var n = e.createDocumentFragment();
      for (var r = 0; r < t.length; r++) {
        var o = t[r];
        var s = o instanceof ARm;
        n.appendChild(s ? o : e.createTextNode(String(o)));
      }
      return n;
    };
    var PRm = {
      after: {
        value: function () {
          var t = Array.prototype.slice.call(arguments);
          var n = this.parentNode;
          var r = this.nextSibling;
          if (n === null) {
            return;
          }
          while (r && t.some(function (s) {
            return s === r;
          })) {
            r = r.nextSibling;
          }
          var o = i1o(this.doc, t);
          n.insertBefore(o, r);
        }
      },
      before: {
        value: function () {
          var t = Array.prototype.slice.call(arguments);
          var n = this.parentNode;
          var r = this.previousSibling;
          if (n === null) {
            return;
          }
          while (r && t.some(function (i) {
            return i === r;
          })) {
            r = r.previousSibling;
          }
          var o = i1o(this.doc, t);
          var s = r ? r.nextSibling : n.firstChild;
          n.insertBefore(o, s);
        }
      },
      remove: {
        value: function () {
          if (this.parentNode === null) {
            return;
          }
          if (this.doc) {
            if (this.doc._preremoveNodeIterators(this), this.rooted) {
              this.doc.mutateRemove(this);
            }
          }
          this._remove();
          this.parentNode = null;
        }
      },
      _remove: {
        value: function () {
          var t = this.parentNode;
          if (t === null) {
            return;
          }
          if (t._childNodes) {
            t._childNodes.splice(this.index, 1);
          } else if (t._firstChild === this) {
            if (this._nextSibling === this) {
              t._firstChild = null;
            } else {
              t._firstChild = this._nextSibling;
            }
          }
          IRm.remove(this);
          t.modify();
        }
      },
      replaceWith: {
        value: function () {
          var t = Array.prototype.slice.call(arguments);
          var n = this.parentNode;
          var r = this.nextSibling;
          if (n === null) {
            return;
          }
          while (r && t.some(function (s) {
            return s === r;
          })) {
            r = r.nextSibling;
          }
          var o = i1o(this.doc, t);
          if (this.parentNode === n) {
            n.replaceChild(o, this);
          } else {
            n.insertBefore(o, r);
          }
        }
      }
    };
    Awl.exports = PRm;
  });
  var a1o = __commonJS((Iqb, Pwl) => {
    var Iwl = VU();
    var ORm = {
      nextElementSibling: {
        get: function () {
          if (this.parentNode) {
            for (var e = this.nextSibling; e !== null; e = e.nextSibling) {
              if (e.nodeType === Iwl.ELEMENT_NODE) {
                return e;
              }
            }
          }
          return null;
        }
      },
      previousElementSibling: {
        get: function () {
          if (this.parentNode) {
            for (var e = this.previousSibling; e !== null; e = e.previousSibling) {
              if (e.nodeType === Iwl.ELEMENT_NODE) {
                return e;
              }
            }
          }
          return null;
        }
      }
    };
    Pwl.exports = ORm;
  });
  var l1o = __commonJS((Pqb, Dwl) => {
    Dwl.exports = Owl;
    var _Tt = O0();
    function Owl(e) {
      this.element = e;
    }
    Object.defineProperties(Owl.prototype, {
      length: {
        get: _Tt.shouldOverride
      },
      item: {
        value: _Tt.shouldOverride
      },
      getNamedItem: {
        value: function (t) {
          return this.element.getAttributeNode(t);
        }
      },
      getNamedItemNS: {
        value: function (t, n) {
          return this.element.getAttributeNodeNS(t, n);
        }
      },
      setNamedItem: {
        value: _Tt.nyi
      },
      setNamedItemNS: {
        value: _Tt.nyi
      },
      removeNamedItem: {
        value: function (t) {
          var n = this.element.getAttributeNode(t);
          if (n) {
            this.element.removeAttribute(t);
            return n;
          }
          _Tt.NotFoundError();
        }
      },
      removeNamedItemNS: {
        value: function (t, n) {
          var r = this.element.getAttributeNodeNS(t, n);
          if (r) {
            this.element.removeAttributeNS(t, n);
            return r;
          }
          _Tt.NotFoundError();
        }
      }
    });
  });
  var STt = __commonJS((Oqb, Uwl) => {
    Uwl.exports = $Le;
    var c1o = qZn();
    var mA = O0();
    var Yme = mA.NAMESPACE;
    var JZn = e1o();
    var Lse = VU();
    var u1o = LKe();
    var DRm = $No();
    var YZn = bwl();
    var bTt = UZn();
    var MRm = n1o();
    var d1o = zZn();
    var Nwl = jZn();
    var NRm = KZn();
    var LRm = a1o();
    var Lwl = l1o();
    var Mwl = Object.create(null);
    function $Le(e, t, n, r) {
      Nwl.call(this);
      this.nodeType = Lse.ELEMENT_NODE;
      this.ownerDocument = e;
      this.localName = t;
      this.namespaceURI = n;
      this.prefix = r;
      this._tagName = undefined;
      this._attrsByQName = Object.create(null);
      this._attrsByLName = Object.create(null);
      this._attrKeys = [];
    }
    function p1o(e, t) {
      if (e.nodeType === Lse.TEXT_NODE) {
        t.push(e._data);
      } else {
        for (var n = 0, r = e.childNodes.length; n < r; n++) {
          p1o(e.childNodes[n], t);
        }
      }
    }
    $Le.prototype = Object.create(Nwl.prototype, {
      isHTML: {
        get: function () {
          return this.namespaceURI === Yme.HTML && this.ownerDocument.isHTML;
        }
      },
      tagName: {
        get: function () {
          if (this._tagName === undefined) {
            var t;
            if (this.prefix === null) {
              t = this.localName;
            } else {
              t = this.prefix + ":" + this.localName;
            }
            if (this.isHTML) {
              var n = Mwl[t];
              if (!n) {
                Mwl[t] = n = mA.toASCIIUpperCase(t);
              }
              t = n;
            }
            this._tagName = t;
          }
          return this._tagName;
        }
      },
      nodeName: {
        get: function () {
          return this.tagName;
        }
      },
      nodeValue: {
        get: function () {
          return null;
        },
        set: function () {}
      },
      textContent: {
        get: function () {
          var e = [];
          p1o(this, e);
          return e.join("");
        },
        set: function (e) {
          if (this.removeChildren(), e !== null && e !== undefined && e !== "") {
            this._appendChild(this.ownerDocument.createTextNode(e));
          }
        }
      },
      innerText: {
        get: function () {
          var e = [];
          p1o(this, e);
          return e.join("").replace(/[ \t\n\f\r]+/g, " ").trim();
        },
        set: function (e) {
          if (this.removeChildren(), e !== null && e !== undefined && e !== "") {
            this._appendChild(this.ownerDocument.createTextNode(e));
          }
        }
      },
      innerHTML: {
        get: function () {
          return this.serialize();
        },
        set: mA.nyi
      },
      outerHTML: {
        get: function () {
          return DRm.serializeOne(this, {
            nodeType: 0
          });
        },
        set: function (e) {
          var t = this.ownerDocument;
          var n = this.parentNode;
          if (n === null) {
            return;
          }
          if (n.nodeType === Lse.DOCUMENT_NODE) {
            mA.NoModificationAllowedError();
          }
          if (n.nodeType === Lse.DOCUMENT_FRAGMENT_NODE) {
            n = n.ownerDocument.createElement("body");
          }
          var r = t.implementation.mozHTMLParser(t._address, n);
          r.parse(e === null ? "" : String(e), true);
          this.replaceWith(r._asDocumentFragment());
        }
      },
      _insertAdjacent: {
        value: function (t, n) {
          var r = false;
          switch (t) {
            case "beforebegin":
              r = true;
            case "afterend":
              var o = this.parentNode;
              if (o === null) {
                return null;
              }
              return o.insertBefore(n, r ? this : this.nextSibling);
            case "afterbegin":
              r = true;
            case "beforeend":
              return this.insertBefore(n, r ? this.firstChild : null);
            default:
              return mA.SyntaxError();
          }
        }
      },
      insertAdjacentElement: {
        value: function (t, n) {
          if (n.nodeType !== Lse.ELEMENT_NODE) {
            throw TypeError("not an element");
          }
          t = mA.toASCIILowerCase(String(t));
          return this._insertAdjacent(t, n);
        }
      },
      insertAdjacentText: {
        value: function (t, n) {
          var r = this.ownerDocument.createTextNode(n);
          t = mA.toASCIILowerCase(String(t));
          this._insertAdjacent(t, r);
        }
      },
      insertAdjacentHTML: {
        value: function (t, n) {
          t = mA.toASCIILowerCase(String(t));
          n = String(n);
          var r;
          switch (t) {
            case "beforebegin":
            case "afterend":
              if (r = this.parentNode, r === null || r.nodeType === Lse.DOCUMENT_NODE) {
                mA.NoModificationAllowedError();
              }
              break;
            case "afterbegin":
            case "beforeend":
              r = this;
              break;
            default:
              mA.SyntaxError();
          }
          if (!(r instanceof $Le) || r.ownerDocument.isHTML && r.localName === "html" && r.namespaceURI === Yme.HTML) {
            r = r.ownerDocument.createElementNS(Yme.HTML, "body");
          }
          var o = this.ownerDocument.implementation.mozHTMLParser(this.ownerDocument._address, r);
          o.parse(n, true);
          this._insertAdjacent(t, o._asDocumentFragment());
        }
      },
      children: {
        get: function () {
          if (!this._children) {
            this._children = new Fwl(this);
          }
          return this._children;
        }
      },
      attributes: {
        get: function () {
          if (!this._attributes) {
            this._attributes = new f1o(this);
          }
          return this._attributes;
        }
      },
      firstElementChild: {
        get: function () {
          for (var e = this.firstChild; e !== null; e = e.nextSibling) {
            if (e.nodeType === Lse.ELEMENT_NODE) {
              return e;
            }
          }
          return null;
        }
      },
      lastElementChild: {
        get: function () {
          for (var e = this.lastChild; e !== null; e = e.previousSibling) {
            if (e.nodeType === Lse.ELEMENT_NODE) {
              return e;
            }
          }
          return null;
        }
      },
      childElementCount: {
        get: function () {
          return this.children.length;
        }
      },
      nextElement: {
        value: function (e) {
          if (!e) {
            e = this.ownerDocument.documentElement;
          }
          var t = this.firstElementChild;
          if (!t) {
            if (this === e) {
              return null;
            }
            t = this.nextElementSibling;
          }
          if (t) {
            return t;
          }
          for (var n = this.parentElement; n && n !== e; n = n.parentElement) {
            if (t = n.nextElementSibling, t) {
              return t;
            }
          }
          return null;
        }
      },
      getElementsByTagName: {
        value: function (t) {
          var n;
          if (!t) {
            return new u1o();
          }
          if (t === "*") {
            n = function () {
              return true;
            };
          } else if (this.isHTML) {
            n = FRm(t);
          } else {
            n = m1o(t);
          }
          return new YZn(this, n);
        }
      },
      getElementsByTagNameNS: {
        value: function (t, n) {
          var r;
          if (t === "*" && n === "*") {
            r = function () {
              return true;
            };
          } else if (t === "*") {
            r = m1o(n);
          } else if (n === "*") {
            r = URm(t);
          } else {
            r = BRm(t, n);
          }
          return new YZn(this, r);
        }
      },
      getElementsByClassName: {
        value: function (t) {
          if (t = String(t).trim(), t === "") {
            var n = new u1o();
            return n;
          }
          t = t.split(/[ \t\r\n\f]+/);
          return new YZn(this, $Rm(t));
        }
      },
      getElementsByName: {
        value: function (t) {
          return new YZn(this, HRm(String(t)));
        }
      },
      clone: {
        value: function () {
          var t;
          if (this.namespaceURI !== Yme.HTML || this.prefix || !this.ownerDocument.isHTML) {
            t = this.ownerDocument.createElementNS(this.namespaceURI, this.prefix !== null ? this.prefix + ":" + this.localName : this.localName);
          } else {
            t = this.ownerDocument.createElement(this.localName);
          }
          for (var n = 0, r = this._attrKeys.length; n < r; n++) {
            var o = this._attrKeys[n];
            var s = this._attrsByLName[o];
            var i = s.cloneNode();
            i._setOwnerElement(t);
            t._attrsByLName[o] = i;
            t._addQName(i);
          }
          t._attrKeys = this._attrKeys.concat();
          return t;
        }
      },
      isEqual: {
        value: function (t) {
          if (this.localName !== t.localName || this.namespaceURI !== t.namespaceURI || this.prefix !== t.prefix || this._numattrs !== t._numattrs) {
            return false;
          }
          for (var n = 0, r = this._numattrs; n < r; n++) {
            var o = this._attr(n);
            if (!t.hasAttributeNS(o.namespaceURI, o.localName)) {
              return false;
            }
            if (t.getAttributeNS(o.namespaceURI, o.localName) !== o.value) {
              return false;
            }
          }
          return true;
        }
      },
      _lookupNamespacePrefix: {
        value: function (t, n) {
          if (this.namespaceURI && this.namespaceURI === t && this.prefix !== null && n.lookupNamespaceURI(this.prefix) === t) {
            return this.prefix;
          }
          for (var r = 0, o = this._numattrs; r < o; r++) {
            var s = this._attr(r);
            if (s.prefix === "xmlns" && s.value === t && n.lookupNamespaceURI(s.localName) === t) {
              return s.localName;
            }
          }
          var i = this.parentElement;
          return i ? i._lookupNamespacePrefix(t, n) : null;
        }
      },
      lookupNamespaceURI: {
        value: function (t) {
          if (t === "" || t === undefined) {
            t = null;
          }
          if (this.namespaceURI !== null && this.prefix === t) {
            return this.namespaceURI;
          }
          for (var n = 0, r = this._numattrs; n < r; n++) {
            var o = this._attr(n);
            if (o.namespaceURI === Yme.XMLNS) {
              if (o.prefix === "xmlns" && o.localName === t || t === null && o.prefix === null && o.localName === "xmlns") {
                return o.value || null;
              }
            }
          }
          var s = this.parentElement;
          return s ? s.lookupNamespaceURI(t) : null;
        }
      },
      getAttribute: {
        value: function (t) {
          var n = this.getAttributeNode(t);
          return n ? n.value : null;
        }
      },
      getAttributeNS: {
        value: function (t, n) {
          var r = this.getAttributeNodeNS(t, n);
          return r ? r.value : null;
        }
      },
      getAttributeNode: {
        value: function (t) {
          if (t = String(t), /[A-Z]/.test(t) && this.isHTML) {
            t = mA.toASCIILowerCase(t);
          }
          var n = this._attrsByQName[t];
          if (!n) {
            return null;
          }
          if (Array.isArray(n)) {
            n = n[0];
          }
          return n;
        }
      },
      getAttributeNodeNS: {
        value: function (t, n) {
          t = t === undefined || t === null ? "" : String(t);
          n = String(n);
          var r = this._attrsByLName[t + "|" + n];
          return r ? r : null;
        }
      },
      hasAttribute: {
        value: function (t) {
          if (t = String(t), /[A-Z]/.test(t) && this.isHTML) {
            t = mA.toASCIILowerCase(t);
          }
          return this._attrsByQName[t] !== undefined;
        }
      },
      hasAttributeNS: {
        value: function (t, n) {
          t = t === undefined || t === null ? "" : String(t);
          n = String(n);
          var r = t + "|" + n;
          return this._attrsByLName[r] !== undefined;
        }
      },
      hasAttributes: {
        value: function () {
          return this._numattrs > 0;
        }
      },
      toggleAttribute: {
        value: function (t, n) {
          if (t = String(t), !c1o.isValidName(t)) {
            mA.InvalidCharacterError();
          }
          if (/[A-Z]/.test(t) && this.isHTML) {
            t = mA.toASCIILowerCase(t);
          }
          var r = this._attrsByQName[t];
          if (r === undefined) {
            if (n === undefined || n === true) {
              this._setAttribute(t, "");
              return true;
            }
            return false;
          } else {
            if (n === undefined || n === false) {
              this.removeAttribute(t);
              return false;
            }
            return true;
          }
        }
      },
      _setAttribute: {
        value: function (t, n) {
          var r = this._attrsByQName[t];
          var o;
          if (!r) {
            r = this._newattr(t);
            o = true;
          } else if (Array.isArray(r)) {
            r = r[0];
          }
          if (r.value = n, this._attributes) {
            this._attributes[t] = r;
          }
          if (o && this._newattrhook) {
            this._newattrhook(t, n);
          }
        }
      },
      setAttribute: {
        value: function (t, n) {
          if (t = String(t), !c1o.isValidName(t)) {
            mA.InvalidCharacterError();
          }
          if (/[A-Z]/.test(t) && this.isHTML) {
            t = mA.toASCIILowerCase(t);
          }
          this._setAttribute(t, String(n));
        }
      },
      _setAttributeNS: {
        value: function (t, n, r) {
          var o = n.indexOf(":");
          var s;
          var i;
          if (o < 0) {
            s = null;
            i = n;
          } else {
            s = n.substring(0, o);
            i = n.substring(o + 1);
          }
          if (t === "" || t === undefined) {
            t = null;
          }
          var a = (t === null ? "" : t) + "|" + i;
          var l = this._attrsByLName[a];
          var c;
          if (!l) {
            if (l = new dYt(this, i, s, t), c = true, this._attrsByLName[a] = l, this._attributes) {
              this._attributes[this._attrKeys.length] = l;
            }
            this._attrKeys.push(a);
            this._addQName(l);
          }
          if (l.value = r, c && this._newattrhook) {
            this._newattrhook(n, r);
          }
        }
      },
      setAttributeNS: {
        value: function (t, n, r) {
          if (t = t === null || t === undefined || t === "" ? null : String(t), n = String(n), !c1o.isValidQName(n)) {
            mA.InvalidCharacterError();
          }
          var o = n.indexOf(":");
          var s = o < 0 ? null : n.substring(0, o);
          if (s !== null && t === null || s === "xml" && t !== Yme.XML || (n === "xmlns" || s === "xmlns") && t !== Yme.XMLNS || t === Yme.XMLNS && !(n === "xmlns" || s === "xmlns")) {
            mA.NamespaceError();
          }
          this._setAttributeNS(t, n, String(r));
        }
      },
      setAttributeNode: {
        value: function (t) {
          if (t.ownerElement !== null && t.ownerElement !== this) {
            throw new bTt(bTt.INUSE_ATTRIBUTE_ERR);
          }
          var n = null;
          var r = this._attrsByQName[t.name];
          if (r) {
            if (!Array.isArray(r)) {
              r = [r];
            }
            if (r.some(function (o) {
              return o === t;
            })) {
              return t;
            } else if (t.ownerElement !== null) {
              throw new bTt(bTt.INUSE_ATTRIBUTE_ERR);
            }
            r.forEach(function (o) {
              this.removeAttributeNode(o);
            }, this);
            n = r[0];
          }
          this.setAttributeNodeNS(t);
          return n;
        }
      },
      setAttributeNodeNS: {
        value: function (t) {
          if (t.ownerElement !== null) {
            throw new bTt(bTt.INUSE_ATTRIBUTE_ERR);
          }
          var n = t.namespaceURI;
          var r = (n === null ? "" : n) + "|" + t.localName;
          var o = this._attrsByLName[r];
          if (o) {
            this.removeAttributeNode(o);
          }
          if (t._setOwnerElement(this), this._attrsByLName[r] = t, this._attributes) {
            this._attributes[this._attrKeys.length] = t;
          }
          if (this._attrKeys.push(r), this._addQName(t), this._newattrhook) {
            this._newattrhook(t.name, t.value);
          }
          return o || null;
        }
      },
      removeAttribute: {
        value: function (t) {
          if (t = String(t), /[A-Z]/.test(t) && this.isHTML) {
            t = mA.toASCIILowerCase(t);
          }
          var n = this._attrsByQName[t];
          if (!n) {
            return;
          }
          if (Array.isArray(n)) {
            if (n.length > 2) {
              n = n.shift();
            } else {
              this._attrsByQName[t] = n[1];
              n = n[0];
            }
          } else {
            this._attrsByQName[t] = undefined;
          }
          var r = n.namespaceURI;
          var o = (r === null ? "" : r) + "|" + n.localName;
          this._attrsByLName[o] = undefined;
          var s = this._attrKeys.indexOf(o);
          if (this._attributes) {
            Array.prototype.splice.call(this._attributes, s, 1);
            this._attributes[t] = undefined;
          }
          this._attrKeys.splice(s, 1);
          var i = n.onchange;
          if (n._setOwnerElement(null), i) {
            i.call(n, this, n.localName, n.value, null);
          }
          if (this.rooted) {
            this.ownerDocument.mutateRemoveAttr(n);
          }
        }
      },
      removeAttributeNS: {
        value: function (t, n) {
          t = t === undefined || t === null ? "" : String(t);
          n = String(n);
          var r = t + "|" + n;
          var o = this._attrsByLName[r];
          if (!o) {
            return;
          }
          this._attrsByLName[r] = undefined;
          var s = this._attrKeys.indexOf(r);
          if (this._attributes) {
            Array.prototype.splice.call(this._attributes, s, 1);
          }
          this._attrKeys.splice(s, 1);
          this._removeQName(o);
          var i = o.onchange;
          if (o._setOwnerElement(null), i) {
            i.call(o, this, o.localName, o.value, null);
          }
          if (this.rooted) {
            this.ownerDocument.mutateRemoveAttr(o);
          }
        }
      },
      removeAttributeNode: {
        value: function (t) {
          var n = t.namespaceURI;
          var r = (n === null ? "" : n) + "|" + t.localName;
          if (this._attrsByLName[r] !== t) {
            mA.NotFoundError();
          }
          this.removeAttributeNS(n, t.localName);
          return t;
        }
      },
      getAttributeNames: {
        value: function () {
          var t = this;
          return this._attrKeys.map(function (n) {
            return t._attrsByLName[n].name;
          });
        }
      },
      _getattr: {
        value: function (t) {
          var n = this._attrsByQName[t];
          return n ? n.value : null;
        }
      },
      _setattr: {
        value: function (t, n) {
          var r = this._attrsByQName[t];
          var o;
          if (!r) {
            r = this._newattr(t);
            o = true;
          }
          if (r.value = String(n), this._attributes) {
            this._attributes[t] = r;
          }
          if (o && this._newattrhook) {
            this._newattrhook(t, n);
          }
        }
      },
      _newattr: {
        value: function (t) {
          var n = new dYt(this, t, null, null);
          var r = "|" + t;
          if (this._attrsByQName[t] = n, this._attrsByLName[r] = n, this._attributes) {
            this._attributes[this._attrKeys.length] = n;
          }
          this._attrKeys.push(r);
          return n;
        }
      },
      _addQName: {
        value: function (e) {
          var t = e.name;
          var n = this._attrsByQName[t];
          if (!n) {
            this._attrsByQName[t] = e;
          } else if (Array.isArray(n)) {
            n.push(e);
          } else {
            this._attrsByQName[t] = [n, e];
          }
          if (this._attributes) {
            this._attributes[t] = e;
          }
        }
      },
      _removeQName: {
        value: function (e) {
          var t = e.name;
          var n = this._attrsByQName[t];
          if (Array.isArray(n)) {
            var r = n.indexOf(e);
            if (mA.assert(r !== -1), n.length === 2) {
              if (this._attrsByQName[t] = n[1 - r], this._attributes) {
                this._attributes[t] = this._attrsByQName[t];
              }
            } else if (n.splice(r, 1), this._attributes && this._attributes[t] === e) {
              this._attributes[t] = n[0];
            }
          } else if (mA.assert(n === e), this._attrsByQName[t] = undefined, this._attributes) {
            this._attributes[t] = undefined;
          }
        }
      },
      _numattrs: {
        get: function () {
          return this._attrKeys.length;
        }
      },
      _attr: {
        value: function (e) {
          return this._attrsByLName[this._attrKeys[e]];
        }
      },
      id: JZn.property({
        name: "id"
      }),
      className: JZn.property({
        name: "class"
      }),
      classList: {
        get: function () {
          var e = this;
          if (this._classList) {
            return this._classList;
          }
          var t = new MRm(function () {
            return e.className || "";
          }, function (n) {
            e.className = n;
          });
          this._classList = t;
          return t;
        },
        set: function (e) {
          this.className = e;
        }
      },
      matches: {
        value: function (e) {
          return d1o.matches(this, e);
        }
      },
      closest: {
        value: function (e) {
          var t = this;
          do {
            if (t.matches && t.matches(e)) {
              return t;
            }
            t = t.parentElement || t.parentNode;
          } while (t !== null && t.nodeType === Lse.ELEMENT_NODE);
          return null;
        }
      },
      querySelector: {
        value: function (e) {
          return d1o(e, this)[0];
        }
      },
      querySelectorAll: {
        value: function (e) {
          var t = d1o(e, this);
          return t.item ? t : new u1o(t);
        }
      }
    });
    Object.defineProperties($Le.prototype, NRm);
    Object.defineProperties($Le.prototype, LRm);
    JZn.registerChangeHandler($Le, "id", function (e, t, n, r) {
      if (e.rooted) {
        if (n) {
          e.ownerDocument.delId(n, e);
        }
        if (r) {
          e.ownerDocument.addId(r, e);
        }
      }
    });
    JZn.registerChangeHandler($Le, "class", function (e, t, n, r) {
      if (e._classList) {
        e._classList._update();
      }
    });
    function dYt(e, t, n, r, o) {
      this.localName = t;
      this.prefix = n === null || n === "" ? null : "" + n;
      this.namespaceURI = r === null || r === "" ? null : "" + r;
      this.data = o;
      this._setOwnerElement(e);
    }
    dYt.prototype = Object.create(Object.prototype, {
      ownerElement: {
        get: function () {
          return this._ownerElement;
        }
      },
      _setOwnerElement: {
        value: function (t) {
          if (this._ownerElement = t, this.prefix === null && this.namespaceURI === null && t) {
            this.onchange = t._attributeChangeHandlers[this.localName];
          } else {
            this.onchange = null;
          }
        }
      },
      name: {
        get: function () {
          return this.prefix ? this.prefix + ":" + this.localName : this.localName;
        }
      },
      specified: {
        get: function () {
          return true;
        }
      },
      value: {
        get: function () {
          return this.data;
        },
        set: function (e) {
          var t = this.data;
          if (e = e === undefined ? "" : e + "", e === t) {
            return;
          }
          if (this.data = e, this.ownerElement) {
            if (this.onchange) {
              this.onchange(this.ownerElement, this.localName, t, e);
            }
            if (this.ownerElement.rooted) {
              this.ownerElement.ownerDocument.mutateAttr(this, t);
            }
          }
        }
      },
      cloneNode: {
        value: function (t) {
          return new dYt(null, this.localName, this.prefix, this.namespaceURI, this.data);
        }
      },
      nodeType: {
        get: function () {
          return Lse.ATTRIBUTE_NODE;
        }
      },
      nodeName: {
        get: function () {
          return this.name;
        }
      },
      nodeValue: {
        get: function () {
          return this.value;
        },
        set: function (e) {
          this.value = e;
        }
      },
      textContent: {
        get: function () {
          return this.value;
        },
        set: function (e) {
          if (e === null || e === undefined) {
            e = "";
          }
          this.value = e;
        }
      },
      innerText: {
        get: function () {
          return this.value;
        },
        set: function (e) {
          if (e === null || e === undefined) {
            e = "";
          }
          this.value = e;
        }
      }
    });
    $Le._Attr = dYt;
    function f1o(e) {
      Lwl.call(this, e);
      for (var t in e._attrsByQName) {
        this[t] = e._attrsByQName[t];
      }
      for (var n = 0; n < e._attrKeys.length; n++) {
        this[n] = e._attrsByLName[e._attrKeys[n]];
      }
    }
    f1o.prototype = Object.create(Lwl.prototype, {
      length: {
        get: function () {
          return this.element._attrKeys.length;
        },
        set: function () {}
      },
      item: {
        value: function (e) {
          if (e = e >>> 0, e >= this.length) {
            return null;
          }
          return this.element._attrsByLName[this.element._attrKeys[e]];
        }
      }
    });
    if (globalThis.Symbol?.iterator) {
      f1o.prototype[globalThis.Symbol.iterator] = function () {
        var e = 0;
        var t = this.length;
        var n = this;
        return {
          next: function () {
            if (e < t) {
              return {
                value: n.item(e++)
              };
            }
            return {
              done: true
            };
          }
        };
      };
    }
    function Fwl(e) {
      this.element = e;
      this.updateCache();
    }
    Fwl.prototype = Object.create(Object.prototype, {
      length: {
        get: function () {
          this.updateCache();
          return this.childrenByNumber.length;
        }
      },
      item: {
        value: function (t) {
          this.updateCache();
          return this.childrenByNumber[t] || null;
        }
      },
      namedItem: {
        value: function (t) {
          this.updateCache();
          return this.childrenByName[t] || null;
        }
      },
      namedItems: {
        get: function () {
          this.updateCache();
          return this.childrenByName;
        }
      },
      updateCache: {
        value: function () {
          var t = /^(a|applet|area|embed|form|frame|frameset|iframe|img|object)$/;
          if (this.lastModTime !== this.element.lastModTime) {
            this.lastModTime = this.element.lastModTime;
            var n = this.childrenByNumber && this.childrenByNumber.length || 0;
            for (var r = 0; r < n; r++) {
              this[r] = undefined;
            }
            this.childrenByNumber = [];
            this.childrenByName = Object.create(null);
            for (var o = this.element.firstChild; o !== null; o = o.nextSibling) {
              if (o.nodeType === Lse.ELEMENT_NODE) {
                this[this.childrenByNumber.length] = o;
                this.childrenByNumber.push(o);
                var s = o.getAttribute("id");
                if (s && !this.childrenByName[s]) {
                  this.childrenByName[s] = o;
                }
                var i = o.getAttribute("name");
                if (i && this.element.namespaceURI === Yme.HTML && t.test(this.element.localName) && !this.childrenByName[i]) {
                  this.childrenByName[s] = o;
                }
              }
            }
          }
        }
      }
    });
    function m1o(e) {
      return function (t) {
        return t.localName === e;
      };
    }
    function FRm(e) {
      var t = mA.toASCIILowerCase(e);
      if (t === e) {
        return m1o(e);
      }
      return function (n) {
        return n.isHTML ? n.localName === t : n.localName === e;
      };
    }
    function URm(e) {
      return function (t) {
        return t.namespaceURI === e;
      };
    }
    function BRm(e, t) {
      return function (n) {
        return n.namespaceURI === e && n.localName === t;
      };
    }
    function $Rm(e) {
      return function (t) {
        return e.every(function (n) {
          return t.classList.contains(n);
        });
      };
    }
    function HRm(e) {
      return function (t) {
        if (t.namespaceURI !== Yme.HTML) {
          return false;
        }
        return t.getAttribute("name") === e;
      };
    }
  });
  var h1o = __commonJS((Dqb, qwl) => {
    qwl.exports = jwl;
    var $wl = VU();
    var jRm = LKe();
    var Hwl = O0();
    var Bwl = Hwl.HierarchyRequestError;
    var qRm = Hwl.NotFoundError;
    function jwl() {
      $wl.call(this);
    }
    jwl.prototype = Object.create($wl.prototype, {
      hasChildNodes: {
        value: function () {
          return false;
        }
      },
      firstChild: {
        value: null
      },
      lastChild: {
        value: null
      },
      insertBefore: {
        value: function (e, t) {
          if (!e.nodeType) {
            throw TypeError("not a node");
          }
          Bwl();
        }
      },
      replaceChild: {
        value: function (e, t) {
          if (!e.nodeType) {
            throw TypeError("not a node");
          }
          Bwl();
        }
      },
      removeChild: {
        value: function (e) {
          if (!e.nodeType) {
            throw TypeError("not a node");
          }
          qRm();
        }
      },
      removeChildren: {
        value: function () {}
      },
      childNodes: {
        get: function () {
          if (!this._childNodes) {
            this._childNodes = new jRm();
          }
          return this._childNodes;
        }
      }
    });
  });
  var pYt = __commonJS((Mqb, Vwl) => {
    Vwl.exports = XZn;
    var Gwl = h1o();
    var Wwl = O0();
    var WRm = KZn();
    var GRm = a1o();
    function XZn() {
      Gwl.call(this);
    }
    XZn.prototype = Object.create(Gwl.prototype, {
      substringData: {
        value: function (t, n) {
          if (arguments.length < 2) {
            throw TypeError("Not enough arguments");
          }
          if (t = t >>> 0, n = n >>> 0, t > this.data.length || t < 0 || n < 0) {
            Wwl.IndexSizeError();
          }
          return this.data.substring(t, t + n);
        }
      },
      appendData: {
        value: function (t) {
          if (arguments.length < 1) {
            throw TypeError("Not enough arguments");
          }
          this.data += String(t);
        }
      },
      insertData: {
        value: function (t, n) {
          return this.replaceData(t, 0, n);
        }
      },
      deleteData: {
        value: function (t, n) {
          return this.replaceData(t, n, "");
        }
      },
      replaceData: {
        value: function (t, n, r) {
          var o = this.data;
          var s = o.length;
          if (t = t >>> 0, n = n >>> 0, r = String(r), t > s || t < 0) {
            Wwl.IndexSizeError();
          }
          if (t + n > s) {
            n = s - t;
          }
          var i = o.substring(0, t);
          var a = o.substring(t + n);
          this.data = i + r + a;
        }
      },
      isEqual: {
        value: function (t) {
          return this._data === t._data;
        }
      },
      length: {
        get: function () {
          return this.data.length;
        }
      }
    });
    Object.defineProperties(XZn.prototype, WRm);
    Object.defineProperties(XZn.prototype, GRm);
  });
  var y1o = __commonJS((Nqb, Jwl) => {
    Jwl.exports = g1o;
    var zwl = O0();
    var Kwl = VU();
    var Ywl = pYt();
    function g1o(e, t) {
      Ywl.call(this);
      this.nodeType = Kwl.TEXT_NODE;
      this.ownerDocument = e;
      this._data = t;
      this._index = undefined;
    }
    var mYt = {
      get: function () {
        return this._data;
      },
      set: function (e) {
        if (e === null || e === undefined) {
          e = "";
        } else {
          e = String(e);
        }
        if (e === this._data) {
          return;
        }
        if (this._data = e, this.rooted) {
          this.ownerDocument.mutateValue(this);
        }
        if (this.parentNode && this.parentNode._textchangehook) {
          this.parentNode._textchangehook(this);
        }
      }
    };
    g1o.prototype = Object.create(Ywl.prototype, {
      nodeName: {
        value: "#text"
      },
      nodeValue: mYt,
      textContent: mYt,
      innerText: mYt,
      data: {
        get: mYt.get,
        set: function (e) {
          mYt.set.call(this, e === null ? "" : String(e));
        }
      },
      splitText: {
        value: function (t) {
          if (t > this._data.length || t < 0) {
            zwl.IndexSizeError();
          }
          var n = this._data.substring(t);
          var r = this.ownerDocument.createTextNode(n);
          this.data = this.data.substring(0, t);
          var o = this.parentNode;
          if (o !== null) {
            o.insertBefore(r, this.nextSibling);
          }
          return r;
        }
      },
      wholeText: {
        get: function () {
          var t = this.textContent;
          for (var n = this.nextSibling; n; n = n.nextSibling) {
            if (n.nodeType !== Kwl.TEXT_NODE) {
              break;
            }
            t += n.textContent;
          }
          return t;
        }
      },
      replaceWholeText: {
        value: zwl.nyi
      },
      clone: {
        value: function () {
          return new g1o(this.ownerDocument, this._data);
        }
      }
    });
  });
  var b1o = __commonJS((Lqb, Qwl) => {
    Qwl.exports = _1o;
    var VRm = VU();
    var Xwl = pYt();
    function _1o(e, t) {
      Xwl.call(this);
      this.nodeType = VRm.COMMENT_NODE;
      this.ownerDocument = e;
      this._data = t;
    }
    var fYt = {
      get: function () {
        return this._data;
      },
      set: function (e) {
        if (e === null || e === undefined) {
          e = "";
        } else {
          e = String(e);
        }
        if (this._data = e, this.rooted) {
          this.ownerDocument.mutateValue(this);
        }
      }
    };
    _1o.prototype = Object.create(Xwl.prototype, {
      nodeName: {
        value: "#comment"
      },
      nodeValue: fYt,
      textContent: fYt,
      innerText: fYt,
      data: {
        get: fYt.get,
        set: function (e) {
          fYt.set.call(this, e === null ? "" : String(e));
        }
      },
      clone: {
        value: function () {
          return new _1o(this.ownerDocument, this._data);
        }
      }
    });
  });
  var T1o = __commonJS((Fqb, tCl) => {
    tCl.exports = S1o;
    var zRm = VU();
    var KRm = LKe();
    var eCl = jZn();
    var QZn = STt();
    var YRm = zZn();
    var Zwl = O0();
    function S1o(e) {
      eCl.call(this);
      this.nodeType = zRm.DOCUMENT_FRAGMENT_NODE;
      this.ownerDocument = e;
    }
    S1o.prototype = Object.create(eCl.prototype, {
      nodeName: {
        value: "#document-fragment"
      },
      nodeValue: {
        get: function () {
          return null;
        },
        set: function () {}
      },
      textContent: Object.getOwnPropertyDescriptor(QZn.prototype, "textContent"),
      innerText: Object.getOwnPropertyDescriptor(QZn.prototype, "innerText"),
      querySelector: {
        value: function (e) {
          var t = this.querySelectorAll(e);
          return t.length ? t[0] : null;
        }
      },
      querySelectorAll: {
        value: function (e) {
          var t = Object.create(this);
          t.isHTML = true;
          t.getElementsByTagName = QZn.prototype.getElementsByTagName;
          t.nextElement = Object.getOwnPropertyDescriptor(QZn.prototype, "firstElementChild").get;
          var n = YRm(e, t);
          return n.item ? n : new KRm(n);
        }
      },
      clone: {
        value: function () {
          return new S1o(this.ownerDocument);
        }
      },
      isEqual: {
        value: function (t) {
          return true;
        }
      },
      innerHTML: {
        get: function () {
          return this.serialize();
        },
        set: Zwl.nyi
      },
      outerHTML: {
        get: function () {
          return this.serialize();
        },
        set: Zwl.nyi
      }
    });
  });
  var v1o = __commonJS((Uqb, rCl) => {
    rCl.exports = E1o;
    var JRm = VU();
    var nCl = pYt();
    function E1o(e, t, n) {
      nCl.call(this);
      this.nodeType = JRm.PROCESSING_INSTRUCTION_NODE;
      this.ownerDocument = e;
      this.target = t;
      this._data = n;
    }
    var hYt = {
      get: function () {
        return this._data;
      },
      set: function (e) {
        if (e === null || e === undefined) {
          e = "";
        } else {
          e = String(e);
        }
        if (this._data = e, this.rooted) {
          this.ownerDocument.mutateValue(this);
        }
      }
    };
    E1o.prototype = Object.create(nCl.prototype, {
      nodeName: {
        get: function () {
          return this.target;
        }
      },
      nodeValue: hYt,
      textContent: hYt,
      innerText: hYt,
      data: {
        get: hYt.get,
        set: function (e) {
          hYt.set.call(this, e === null ? "" : String(e));
        }
      },
      clone: {
        value: function () {
          return new E1o(this.ownerDocument, this.target, this._data);
        }
      },
      isEqual: {
        value: function (t) {
          return this.target === t.target && this._data === t._data;
        }
      }
    });
  });
  var gYt = __commonJS((Bqb, oCl) => {
    var w1o = {
      FILTER_ACCEPT: 1,
      FILTER_REJECT: 2,
      FILTER_SKIP: 3,
      SHOW_ALL: 4294967295,
      SHOW_ELEMENT: 1,
      SHOW_ATTRIBUTE: 2,
      SHOW_TEXT: 4,
      SHOW_CDATA_SECTION: 8,
      SHOW_ENTITY_REFERENCE: 16,
      SHOW_ENTITY: 32,
      SHOW_PROCESSING_INSTRUCTION: 64,
      SHOW_COMMENT: 128,
      SHOW_DOCUMENT: 256,
      SHOW_DOCUMENT_TYPE: 512,
      SHOW_DOCUMENT_FRAGMENT: 1024,
      SHOW_NOTATION: 2048
    };
    oCl.exports = w1o.constructor = w1o.prototype = w1o;
  });
  var R1o = __commonJS((Hqb, iCl) => {
    var $qb = iCl.exports = {
      nextSkippingChildren: XRm,
      nextAncestorSibling: C1o,
      next: QRm,
      previous: ZRm,
      deepLastChild: sCl
    };
    function XRm(e, t) {
      if (e === t) {
        return null;
      }
      if (e.nextSibling !== null) {
        return e.nextSibling;
      }
      return C1o(e, t);
    }
    function C1o(e, t) {
      for (e = e.parentNode; e !== null; e = e.parentNode) {
        if (e === t) {
          return null;
        }
        if (e.nextSibling !== null) {
          return e.nextSibling;
        }
      }
      return null;
    }
    function QRm(e, t) {
      var n = e.firstChild;
      if (n !== null) {
        return n;
      }
      if (e === t) {
        return null;
      }
      if (n = e.nextSibling, n !== null) {
        return n;
      }
      return C1o(e, t);
    }
    function sCl(e) {
      while (e.lastChild) {
        e = e.lastChild;
      }
      return e;
    }
    function ZRm(e, t) {
      var n = e.previousSibling;
      if (n !== null) {
        return sCl(n);
      }
      if (n = e.parentNode, n === t) {
        return null;
      }
      return n;
    }
  });
  var mCl = __commonJS((jqb, pCl) => {
    pCl.exports = dCl;
    var exm = VU();
    var zU = gYt();
    var aCl = R1o();
    var uCl = O0();
    var x1o = {
      first: "firstChild",
      last: "lastChild",
      next: "firstChild",
      previous: "lastChild"
    };
    var k1o = {
      first: "nextSibling",
      last: "previousSibling",
      next: "nextSibling",
      previous: "previousSibling"
    };
    function lCl(e, t) {
      var n;
      var r;
      var o;
      var s;
      var i;
      r = e._currentNode[x1o[t]];
      while (r !== null) {
        if (s = e._internalFilter(r), s === zU.FILTER_ACCEPT) {
          e._currentNode = r;
          return r;
        }
        if (s === zU.FILTER_SKIP) {
          if (n = r[x1o[t]], n !== null) {
            r = n;
            continue;
          }
        }
        while (r !== null) {
          if (i = r[k1o[t]], i !== null) {
            r = i;
            break;
          }
          if (o = r.parentNode, o === null || o === e.root || o === e._currentNode) {
            return null;
          } else {
            r = o;
          }
        }
      }
      return null;
    }
    function cCl(e, t) {
      var n;
      var r;
      var o;
      if (n = e._currentNode, n === e.root) {
        return null;
      }
      while (true) {
        o = n[k1o[t]];
        while (o !== null) {
          if (n = o, r = e._internalFilter(n), r === zU.FILTER_ACCEPT) {
            e._currentNode = n;
            return n;
          }
          if (o = n[x1o[t]], r === zU.FILTER_REJECT || o === null) {
            o = n[k1o[t]];
          }
        }
        if (n = n.parentNode, n === null || n === e.root) {
          return null;
        }
        if (e._internalFilter(n) === zU.FILTER_ACCEPT) {
          return null;
        }
      }
    }
    function dCl(e, t, n) {
      if (!e || !e.nodeType) {
        uCl.NotSupportedError();
      }
      this._root = e;
      this._whatToShow = Number(t) || 0;
      this._filter = n || null;
      this._active = false;
      this._currentNode = e;
    }
    Object.defineProperties(dCl.prototype, {
      root: {
        get: function () {
          return this._root;
        }
      },
      whatToShow: {
        get: function () {
          return this._whatToShow;
        }
      },
      filter: {
        get: function () {
          return this._filter;
        }
      },
      currentNode: {
        get: function () {
          return this._currentNode;
        },
        set: function (t) {
          if (!(t instanceof exm)) {
            throw TypeError("Not a Node");
          }
          this._currentNode = t;
        }
      },
      _internalFilter: {
        value: function (t) {
          var n;
          var r;
          if (this._active) {
            uCl.InvalidStateError();
          }
          if (!(1 << t.nodeType - 1 & this._whatToShow)) {
            return zU.FILTER_SKIP;
          }
          if (r = this._filter, r === null) {
            n = zU.FILTER_ACCEPT;
          } else {
            this._active = true;
            try {
              if (typeof r === "function") {
                n = r(t);
              } else {
                n = r.acceptNode(t);
              }
            } finally {
              this._active = false;
            }
          }
          return +n;
        }
      },
      parentNode: {
        value: function () {
          var t = this._currentNode;
          while (t !== this.root) {
            if (t = t.parentNode, t === null) {
              return null;
            }
            if (this._internalFilter(t) === zU.FILTER_ACCEPT) {
              this._currentNode = t;
              return t;
            }
          }
          return null;
        }
      },
      firstChild: {
        value: function () {
          return lCl(this, "first");
        }
      },
      lastChild: {
        value: function () {
          return lCl(this, "last");
        }
      },
      previousSibling: {
        value: function () {
          return cCl(this, "previous");
        }
      },
      nextSibling: {
        value: function () {
          return cCl(this, "next");
        }
      },
      previousNode: {
        value: function () {
          var t;
          var n;
          var r;
          var o;
          t = this._currentNode;
          while (t !== this._root) {
            for (r = t.previousSibling; r; r = t.previousSibling) {
              if (t = r, n = this._internalFilter(t), n === zU.FILTER_REJECT) {
                continue;
              }
              for (o = t.lastChild; o; o = t.lastChild) {
                if (t = o, n = this._internalFilter(t), n === zU.FILTER_REJECT) {
                  break;
                }
              }
              if (n === zU.FILTER_ACCEPT) {
                this._currentNode = t;
                return t;
              }
            }
            if (t === this.root || t.parentNode === null) {
              return null;
            }
            if (t = t.parentNode, this._internalFilter(t) === zU.FILTER_ACCEPT) {
              this._currentNode = t;
              return t;
            }
          }
          return null;
        }
      },
      nextNode: {
        value: function () {
          var t;
          var n;
          var r;
          var o;
          t = this._currentNode;
          n = zU.FILTER_ACCEPT;
          e: while (true) {
            for (r = t.firstChild; r; r = t.firstChild) {
              if (t = r, n = this._internalFilter(t), n === zU.FILTER_ACCEPT) {
                this._currentNode = t;
                return t;
              } else if (n === zU.FILTER_REJECT) {
                break;
              }
            }
            for (o = aCl.nextSkippingChildren(t, this.root); o; o = aCl.nextSkippingChildren(t, this.root)) {
              if (t = o, n = this._internalFilter(t), n === zU.FILTER_ACCEPT) {
                this._currentNode = t;
                return t;
              } else if (n === zU.FILTER_SKIP) {
                continue e;
              }
            }
            return null;
          }
        }
      },
      toString: {
        value: function () {
          return "[object TreeWalker]";
        }
      }
    });
  });
  var bCl = __commonJS((qqb, _Cl) => {
    _Cl.exports = yCl;
    var A1o = gYt();
    var I1o = R1o();
    var gCl = O0();
    function txm(e, t, n) {
      if (n) {
        return I1o.next(e, t);
      } else {
        if (e === t) {
          return null;
        }
        return I1o.previous(e, null);
      }
    }
    function fCl(e, t) {
      for (; t; t = t.parentNode) {
        if (e === t) {
          return true;
        }
      }
      return false;
    }
    function hCl(e, t) {
      var n;
      var r;
      n = e._referenceNode;
      r = e._pointerBeforeReferenceNode;
      while (true) {
        if (r === t) {
          r = !r;
        } else if (n = txm(n, e._root, t), n === null) {
          return null;
        }
        var o = e._internalFilter(n);
        if (o === A1o.FILTER_ACCEPT) {
          break;
        }
      }
      e._referenceNode = n;
      e._pointerBeforeReferenceNode = r;
      return n;
    }
    function yCl(e, t, n) {
      if (!e || !e.nodeType) {
        gCl.NotSupportedError();
      }
      this._root = e;
      this._referenceNode = e;
      this._pointerBeforeReferenceNode = true;
      this._whatToShow = Number(t) || 0;
      this._filter = n || null;
      this._active = false;
      e.doc._attachNodeIterator(this);
    }
    Object.defineProperties(yCl.prototype, {
      root: {
        get: function () {
          return this._root;
        }
      },
      referenceNode: {
        get: function () {
          return this._referenceNode;
        }
      },
      pointerBeforeReferenceNode: {
        get: function () {
          return this._pointerBeforeReferenceNode;
        }
      },
      whatToShow: {
        get: function () {
          return this._whatToShow;
        }
      },
      filter: {
        get: function () {
          return this._filter;
        }
      },
      _internalFilter: {
        value: function (t) {
          var n;
          var r;
          if (this._active) {
            gCl.InvalidStateError();
          }
          if (!(1 << t.nodeType - 1 & this._whatToShow)) {
            return A1o.FILTER_SKIP;
          }
          if (r = this._filter, r === null) {
            n = A1o.FILTER_ACCEPT;
          } else {
            this._active = true;
            try {
              if (typeof r === "function") {
                n = r(t);
              } else {
                n = r.acceptNode(t);
              }
            } finally {
              this._active = false;
            }
          }
          return +n;
        }
      },
      _preremove: {
        value: function (t) {
          if (fCl(t, this._root)) {
            return;
          }
          if (!fCl(t, this._referenceNode)) {
            return;
          }
          if (this._pointerBeforeReferenceNode) {
            var n = t;
            while (n.lastChild) {
              n = n.lastChild;
            }
            if (n = I1o.next(n, this.root), n) {
              this._referenceNode = n;
              return;
            }
            this._pointerBeforeReferenceNode = false;
          }
          if (t.previousSibling === null) {
            this._referenceNode = t.parentNode;
          } else {
            this._referenceNode = t.previousSibling;
            var r;
            for (r = this._referenceNode.lastChild; r; r = this._referenceNode.lastChild) {
              this._referenceNode = r;
            }
          }
        }
      },
      nextNode: {
        value: function () {
          return hCl(this, true);
        }
      },
      previousNode: {
        value: function () {
          return hCl(this, false);
        }
      },
      detach: {
        value: function () {}
      },
      toString: {
        value: function () {
          return "[object NodeIterator]";
        }
      }
    });
  });
  var ZZn = __commonJS((Wqb, SCl) => {
    SCl.exports = KU;
    function KU(e) {
      if (!e) {
        return Object.create(KU.prototype);
      }
      this.url = e.replace(/^[ \t\n\r\f]+|[ \t\n\r\f]+$/g, "");
      var t = KU.pattern.exec(this.url);
      if (t) {
        if (t[2]) {
          this.scheme = t[2];
        }
        if (t[4]) {
          var n = t[4].match(KU.userinfoPattern);
          if (n) {
            this.username = n[1];
            this.password = n[3];
            t[4] = t[4].substring(n[0].length);
          }
          if (t[4].match(KU.portPattern)) {
            var r = t[4].lastIndexOf(":");
            this.host = t[4].substring(0, r);
            this.port = t[4].substring(r + 1);
          } else {
            this.host = t[4];
          }
        }
        if (t[5]) {
          this.path = t[5];
        }
        if (t[6]) {
          this.query = t[7];
        }
        if (t[8]) {
          this.fragment = t[9];
        }
      }
    }
    KU.pattern = /^(([^:\/?#]+):)?(\/\/([^\/?#]*))?([^?#]*)(\?([^#]*))?(#(.*))?$/;
    KU.userinfoPattern = /^([^@:]*)(:([^@]*))?@/;
    KU.portPattern = /:\d+$/;
    KU.authorityPattern = /^[^:\/?#]+:\/\//;
    KU.hierarchyPattern = /^[^:\/?#]+:\//;
    KU.percentEncode = function (t) {
      var n = t.charCodeAt(0);
      if (n < 256) {
        return "%" + n.toString(16);
      } else {
        throw Error("can't percent-encode codepoints > 255 yet");
      }
    };
    KU.prototype = {
      constructor: KU,
      isAbsolute: function () {
        return !!this.scheme;
      },
      isAuthorityBased: function () {
        return KU.authorityPattern.test(this.url);
      },
      isHierarchical: function () {
        return KU.hierarchyPattern.test(this.url);
      },
      toString: function () {
        var e = "";
        if (this.scheme !== undefined) {
          e += this.scheme + ":";
        }
        if (this.isAbsolute()) {
          if (e += "//", this.username || this.password) {
            if (e += this.username || "", this.password) {
              e += ":" + this.password;
            }
            e += "@";
          }
          if (this.host) {
            e += this.host;
          }
        }
        if (this.port !== undefined) {
          e += ":" + this.port;
        }
        if (this.path !== undefined) {
          e += this.path;
        }
        if (this.query !== undefined) {
          e += "?" + this.query;
        }
        if (this.fragment !== undefined) {
          e += "#" + this.fragment;
        }
        return e;
      },
      resolve: function (e) {
        var t = this;
        var n = new KU(e);
        var r = new KU();
        if (n.scheme !== undefined) {
          r.scheme = n.scheme;
          r.username = n.username;
          r.password = n.password;
          r.host = n.host;
          r.port = n.port;
          r.path = s(n.path);
          r.query = n.query;
        } else if (r.scheme = t.scheme, n.host !== undefined) {
          r.username = n.username;
          r.password = n.password;
          r.host = n.host;
          r.port = n.port;
          r.path = s(n.path);
          r.query = n.query;
        } else if (r.username = t.username, r.password = t.password, r.host = t.host, r.port = t.port, !n.path) {
          if (r.path = t.path, n.query !== undefined) {
            r.query = n.query;
          } else {
            r.query = t.query;
          }
        } else {
          if (n.path.charAt(0) === "/") {
            r.path = s(n.path);
          } else {
            r.path = o(t.path, n.path);
            r.path = s(r.path);
          }
          r.query = n.query;
        }
        r.fragment = n.fragment;
        return r.toString();
        function o(i, a) {
          if (t.host !== undefined && !t.path) {
            return "/" + a;
          }
          var l = i.lastIndexOf("/");
          if (l === -1) {
            return a;
          } else {
            return i.substring(0, l + 1) + a;
          }
        }
        function s(i) {
          if (!i) {
            return i;
          }
          var a = "";
          while (i.length > 0) {
            if (i === "." || i === "..") {
              i = "";
              break;
            }
            var l = i.substring(0, 2);
            var c = i.substring(0, 3);
            var u = i.substring(0, 4);
            if (c === "../") {
              i = i.substring(3);
            } else if (l === "./") {
              i = i.substring(2);
            } else if (c === "/./") {
              i = "/" + i.substring(3);
            } else if (l === "/." && i.length === 2) {
              i = "/";
            } else if (u === "/../" || c === "/.." && i.length === 3) {
              i = "/" + i.substring(4);
              a = a.replace(/\/?[^\/]*$/, "");
            } else {
              var d = i.match(/(\/?([^\/]*))/)[0];
              a += d;
              i = i.substring(d.length);
            }
          }
          return a;
        }
      }
    };
  });
  var vCl = __commonJS((Gqb, ECl) => {
    ECl.exports = P1o;
    var TCl = mTt();
    function P1o(e, t) {
      TCl.call(this, e, t);
    }
    P1o.prototype = Object.create(TCl.prototype, {
      constructor: {
        value: P1o
      }
    });
  });
  var O1o = __commonJS((Vqb, wCl) => {
    wCl.exports = {
      Event: mTt(),
      UIEvent: NNo(),
      MouseEvent: FNo(),
      CustomEvent: vCl()
    };
  });
  var RCl = __commonJS(TTt => {
    Object.defineProperty(TTt, "__esModule", {
      value: true
    });
    TTt.hyphenate = TTt.parse = undefined;
    function nxm(e) {
      let t = [];
      let n = 0;
      let r = 0;
      let o = 0;
      let s = 0;
      let i = 0;
      let a = null;
      while (n < e.length) {
        switch (e.charCodeAt(n++)) {
          case 40:
            r++;
            break;
          case 41:
            r--;
            break;
          case 39:
            if (o === 0) {
              o = 39;
            } else if (o === 39 && e.charCodeAt(n - 1) !== 92) {
              o = 0;
            }
            break;
          case 34:
            if (o === 0) {
              o = 34;
            } else if (o === 34 && e.charCodeAt(n - 1) !== 92) {
              o = 0;
            }
            break;
          case 58:
            if (!a && r === 0 && o === 0) {
              a = CCl(e.substring(i, n - 1).trim());
              s = n;
            }
            break;
          case 59:
            if (a && s > 0 && r === 0 && o === 0) {
              let c = e.substring(s, n - 1).trim();
              t.push(a, c);
              i = n;
              s = 0;
              a = null;
            }
            break;
        }
      }
      if (a && s) {
        let l = e.slice(s).trim();
        t.push(a, l);
      }
      return t;
    }
    TTt.parse = nxm;
    function CCl(e) {
      return e.replace(/[a-z][A-Z]/g, t => t.charAt(0) + "-" + t.charAt(1)).toLowerCase();
    }
    TTt.hyphenate = CCl;
  });
  var eer = __commonJS((Kqb, PCl) => {
    var {
      parse: rxm
    } = RCl();
    PCl.exports = function (e) {
      let t = new ICl(e);
      return new Proxy(t, {
        get: function (r, o) {
          return o in r ? r[o] : r.getPropertyValue(xCl(o));
        },
        vZc: function (r, o) {
          return true;
        },
        set: function (r, o, s) {
          if (o in r) {
            r[o] = s;
          } else {
            r.setProperty(xCl(o), s ?? undefined);
          }
          return true;
        }
      });
    };
    function xCl(e) {
      return e.replace(/([a-z])([A-Z])/g, "$1-$2").toLowerCase();
    }
    function ICl(e) {
      this._element = e;
    }
    function ACl(e) {
      let t = {
        property: {},
        priority: {}
      };
      if (!e) {
        return t;
      }
      let n = rxm(e);
      if (n.length < 2) {
        return t;
      }
      for (let r = 0; r < n.length; r += 2) {
        let o = n[r];
        let s = n[r + 1];
        if (s.endsWith("!important")) {
          t.priority[o] = "important";
          s = s.slice(0, -("!important").length).trim();
        }
        t.property[o] = s;
      }
      return t;
    }
    var ETt = {};
    ICl.prototype = Object.create(Object.prototype, {
      _parsed: {
        get: function () {
          if (!this._parsedStyles || this.cssText !== this._lastParsedText) {
            var e = this.cssText;
            this._parsedStyles = ACl(e);
            this._lastParsedText = e;
            delete this._names;
          }
          return this._parsedStyles;
        }
      },
      _serialize: {
        value: function () {
          var e = this._parsed;
          var t = "";
          for (var n in e.property) {
            if (t) {
              t += " ";
            }
            if (t += n + ": " + e.property[n], e.priority[n]) {
              t += " !" + e.priority[n];
            }
            t += ";";
          }
          this.cssText = t;
          this._lastParsedText = t;
          delete this._names;
        }
      },
      cssText: {
        get: function () {
          return this._element.getAttribute("style");
        },
        set: function (e) {
          this._element.setAttribute("style", e);
        }
      },
      length: {
        get: function () {
          if (!this._names) {
            this._names = Object.getOwnPropertyNames(this._parsed.property);
          }
          return this._names.length;
        }
      },
      item: {
        value: function (e) {
          if (!this._names) {
            this._names = Object.getOwnPropertyNames(this._parsed.property);
          }
          return this._names[e];
        }
      },
      getPropertyValue: {
        value: function (e) {
          e = e.toLowerCase();
          return this._parsed.property[e] || "";
        }
      },
      getPropertyPriority: {
        value: function (e) {
          e = e.toLowerCase();
          return this._parsed.priority[e] || "";
        }
      },
      setProperty: {
        value: function (e, t, n) {
          if (e = e.toLowerCase(), t === null || t === undefined) {
            t = "";
          }
          if (n === null || n === undefined) {
            n = "";
          }
          if (t !== ETt) {
            t = "" + t;
          }
          if (t = t.trim(), t === "") {
            this.removeProperty(e);
            return;
          }
          if (n !== "" && n !== ETt && !/^important$/i.test(n)) {
            return;
          }
          var r = this._parsed;
          if (t === ETt) {
            if (!r.property[e]) {
              return;
            }
            if (n !== "") {
              r.priority[e] = "important";
            } else {
              delete r.priority[e];
            }
          } else {
            if (t.indexOf(";") !== -1) {
              return;
            }
            var o = ACl(e + ":" + t);
            if (Object.getOwnPropertyNames(o.property).length === 0) {
              return;
            }
            if (Object.getOwnPropertyNames(o.priority).length !== 0) {
              return;
            }
            for (var s in o.property) {
              if (r.property[s] = o.property[s], n === ETt) {
                continue;
              } else if (n !== "") {
                r.priority[s] = "important";
              } else if (r.priority[s]) {
                delete r.priority[s];
              }
            }
          }
          this._serialize();
        }
      },
      setPropertyValue: {
        value: function (e, t) {
          return this.setProperty(e, t, ETt);
        }
      },
      setPropertyPriority: {
        value: function (e, t) {
          return this.setProperty(e, ETt, t);
        }
      },
      removeProperty: {
        value: function (e) {
          e = e.toLowerCase();
          var t = this._parsed;
          if (e in t.property) {
            delete t.property[e];
            delete t.priority[e];
            this._serialize();
          }
        }
      }
    });
  });
  var D1o = __commonJS((Yqb, OCl) => {
    var iL = ZZn();
    OCl.exports = yYt;
    function yYt() {}
    yYt.prototype = Object.create(Object.prototype, {
      _url: {
        get: function () {
          return new iL(this.href);
        }
      },
      protocol: {
        get: function () {
          var e = this._url;
          if (e && e.scheme) {
            return e.scheme + ":";
          } else {
            return ":";
          }
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute()) {
            if (e = e.replace(/:+$/, ""), e = e.replace(/[^-+\.a-zA-Z0-9]/g, iL.percentEncode), e.length > 0) {
              n.scheme = e;
              t = n.toString();
            }
          }
          this.href = t;
        }
      },
      host: {
        get: function () {
          var e = this._url;
          if (e.isAbsolute() && e.isAuthorityBased()) {
            return e.host + (e.port ? ":" + e.port : "");
          } else {
            return "";
          }
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute() && n.isAuthorityBased()) {
            if (e = e.replace(/[^-+\._~!$&'()*,;:=a-zA-Z0-9]/g, iL.percentEncode), e.length > 0) {
              n.host = e;
              delete n.port;
              t = n.toString();
            }
          }
          this.href = t;
        }
      },
      hostname: {
        get: function () {
          var e = this._url;
          if (e.isAbsolute() && e.isAuthorityBased()) {
            return e.host;
          } else {
            return "";
          }
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute() && n.isAuthorityBased()) {
            if (e = e.replace(/^\/+/, ""), e = e.replace(/[^-+\._~!$&'()*,;:=a-zA-Z0-9]/g, iL.percentEncode), e.length > 0) {
              n.host = e;
              t = n.toString();
            }
          }
          this.href = t;
        }
      },
      port: {
        get: function () {
          var e = this._url;
          if (e.isAbsolute() && e.isAuthorityBased() && e.port !== undefined) {
            return e.port;
          } else {
            return "";
          }
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute() && n.isAuthorityBased()) {
            if (e = "" + e, e = e.replace(/[^0-9].*$/, ""), e = e.replace(/^0+/, ""), e.length === 0) {
              e = "0";
            }
            if (parseInt(e, 10) <= 65535) {
              n.port = e;
              t = n.toString();
            }
          }
          this.href = t;
        }
      },
      pathname: {
        get: function () {
          var e = this._url;
          if (e.isAbsolute() && e.isHierarchical()) {
            return e.path;
          } else {
            return "";
          }
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute() && n.isHierarchical()) {
            if (e.charAt(0) !== "/") {
              e = "/" + e;
            }
            e = e.replace(/[^-+\._~!$&'()*,;:=@\/a-zA-Z0-9]/g, iL.percentEncode);
            n.path = e;
            t = n.toString();
          }
          this.href = t;
        }
      },
      search: {
        get: function () {
          var e = this._url;
          if (e.isAbsolute() && e.isHierarchical() && e.query !== undefined) {
            return "?" + e.query;
          } else {
            return "";
          }
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute() && n.isHierarchical()) {
            if (e.charAt(0) === "?") {
              e = e.substring(1);
            }
            e = e.replace(/[^-+\._~!$&'()*,;:=@\/?a-zA-Z0-9]/g, iL.percentEncode);
            n.query = e;
            t = n.toString();
          }
          this.href = t;
        }
      },
      hash: {
        get: function () {
          var e = this._url;
          if (e == null || e.fragment == null || e.fragment === "") {
            return "";
          } else {
            return "#" + e.fragment;
          }
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (e.charAt(0) === "#") {
            e = e.substring(1);
          }
          e = e.replace(/[^-+\._~!$&'()*,;:=@\/?a-zA-Z0-9]/g, iL.percentEncode);
          n.fragment = e;
          t = n.toString();
          this.href = t;
        }
      },
      username: {
        get: function () {
          var e = this._url;
          return e.username || "";
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute()) {
            e = e.replace(/[\x00-\x1F\x7F-\uFFFF "#<>?`\/@\\:]/g, iL.percentEncode);
            n.username = e;
            t = n.toString();
          }
          this.href = t;
        }
      },
      password: {
        get: function () {
          var e = this._url;
          return e.password || "";
        },
        set: function (e) {
          var t = this.href;
          var n = new iL(t);
          if (n.isAbsolute()) {
            if (e === "") {
              n.password = null;
            } else {
              e = e.replace(/[\x00-\x1F\x7F-\uFFFF "#<>?`\/@\\]/g, iL.percentEncode);
              n.password = e;
            }
            t = n.toString();
          }
          this.href = t;
        }
      },
      origin: {
        get: function () {
          var e = this._url;
          if (e == null) {
            return "";
          }
          var t = function (n) {
            var r = [e.scheme, e.host, +e.port || n];
            return r[0] + "://" + r[1] + (r[2] === n ? "" : ":" + r[2]);
          };
          switch (e.scheme) {
            case "ftp":
              return t(21);
            case "gopher":
              return t(70);
            case "http":
            case "ws":
              return t(80);
            case "https":
            case "wss":
              return t(443);
            default:
              return e.scheme + "://";
          }
        }
      }
    });
    yYt._inherit = function (e) {
      Object.getOwnPropertyNames(yYt.prototype).forEach(function (t) {
        if (t === "constructor" || t === "href") {
          return;
        }
        var n = Object.getOwnPropertyDescriptor(yYt.prototype, t);
        Object.defineProperty(e, t, n);
      });
    };
  });
  var M1o = __commonJS((Jqb, NCl) => {
    var DCl = e1o();
    var oxm = BZn().isApiWritable;
    NCl.exports = function (e, t, n, r) {
      var o = e.ctor;
      if (o) {
        var s = e.props || {};
        if (e.attributes) {
          for (var i in e.attributes) {
            var a = e.attributes[i];
            if (typeof a !== "object" || Array.isArray(a)) {
              a = {
                type: a
              };
            }
            if (!a.name) {
              a.name = i.toLowerCase();
            }
            s[i] = DCl.property(a);
          }
        }
        if (s.constructor = {
          value: o,
          writable: oxm
        }, o.prototype = Object.create((e.superclass || t).prototype, s), e.events) {
          ixm(o, e.events);
        }
        n[e.name] = o;
      } else {
        o = t;
      }
      (e.tags || e.tag && [e.tag] || []).forEach(function (l) {
        r[l] = o;
      });
      return o;
    };
    function MCl(e, t, n, r) {
      this.body = e;
      this.document = t;
      this.form = n;
      this.element = r;
    }
    MCl.prototype.build = function () {
      return () => {};
    };
    function sxm(e, t, n, r) {
      var o = e.ownerDocument || Object.create(null);
      var s = e.form || Object.create(null);
      e[t] = new MCl(r, o, s, e).build();
    }
    function ixm(e, t) {
      var n = e.prototype;
      t.forEach(function (r) {
        Object.defineProperty(n, "on" + r, {
          get: function () {
            return this._getEventHandler(r);
          },
          set: function (o) {
            this._setEventHandler(r, o);
          }
        });
        DCl.registerChangeHandler(e, "on" + r, sxm);
      });
    }
  });
  var rer = __commonJS(ner => {
    var N1o = VU();
    var LCl = STt();
    var axm = eer();
    var eK = O0();
    var FCl = D1o();
    var lxm = M1o();
    var ewe = ner.elements = {};
    var _Yt = Object.create(null);
    ner.createElement = function (e, t, n) {
      var r = _Yt[t] || uxm;
      return new r(e, t, n);
    };
    function al(e) {
      return lxm(e, yu, ewe, _Yt);
    }
    function D0(e) {
      return {
        get: function () {
          var t = this._getattr(e);
          if (t === null) {
            return "";
          }
          var n = this.doc._resolve(t);
          return n === null ? t : n;
        },
        set: function (t) {
          this._setattr(e, t);
        }
      };
    }
    function ter(e) {
      return {
        get: function () {
          var t = this._getattr(e);
          if (t === null) {
            return null;
          }
          if (t.toLowerCase() === "use-credentials") {
            return "use-credentials";
          }
          return "anonymous";
        },
        set: function (t) {
          if (t === null || t === undefined) {
            this.removeAttribute(e);
          } else {
            this._setattr(e, t);
          }
        }
      };
    }
    var vTt = {
      type: ["", "no-referrer", "no-referrer-when-downgrade", "same-origin", "origin", "strict-origin", "origin-when-cross-origin", "strict-origin-when-cross-origin", "unsafe-url"],
      missing: ""
    };
    var cxm = {
      A: true,
      LINK: true,
      BUTTON: true,
      INPUT: true,
      SELECT: true,
      TEXTAREA: true,
      COMMAND: true
    };
    var Fse = function (e, t, n) {
      yu.call(this, e, t, n);
      this._form = null;
    };
    var yu = ner.HTMLElement = al({
      superclass: LCl,
      name: "HTMLElement",
      ctor: function (t, n, r) {
        LCl.call(this, t, n, eK.NAMESPACE.HTML, r);
      },
      props: {
        dangerouslySetInnerHTML: {
          set: function (e) {
            this._innerHTML = e;
          }
        },
        innerHTML: {
          get: function () {
            return this.serialize();
          },
          set: function (e) {
            var t = this.ownerDocument.implementation.mozHTMLParser(this.ownerDocument._address, this);
            t.parse(e === null ? "" : String(e), true);
            var n = this instanceof _Yt.template ? this.content : this;
            while (n.hasChildNodes()) {
              n.removeChild(n.firstChild);
            }
            n.appendChild(t._asDocumentFragment());
          }
        },
        style: {
          get: function () {
            if (!this._style) {
              this._style = new axm(this);
            }
            return this._style;
          },
          set: function (e) {
            if (e === null || e === undefined) {
              e = "";
            }
            this._setattr("style", String(e));
          }
        },
        blur: {
          value: function () {}
        },
        focus: {
          value: function () {}
        },
        forceSpellCheck: {
          value: function () {}
        },
        click: {
          value: function () {
            if (this._click_in_progress) {
              return;
            }
            this._click_in_progress = true;
            try {
              if (this._pre_click_activation_steps) {
                this._pre_click_activation_steps();
              }
              var e = this.ownerDocument.createEvent("MouseEvent");
              e.initMouseEvent("click", true, true, this.ownerDocument.defaultView, 1, 0, 0, 0, 0, false, false, false, false, 0, null);
              var t = this.dispatchEvent(e);
              if (t) {
                if (this._post_click_activation_steps) {
                  this._post_click_activation_steps(e);
                }
              } else if (this._cancelled_activation_steps) {
                this._cancelled_activation_steps();
              }
            } finally {
              this._click_in_progress = false;
            }
          }
        },
        submit: {
          value: eK.nyi
        }
      },
      attributes: {
        title: String,
        lang: String,
        dir: {
          type: ["ltr", "rtl", "auto"],
          missing: ""
        },
        draggable: {
          type: ["true", "false"],
          treatNullAsEmptyString: true
        },
        spellcheck: {
          type: ["true", "false"],
          missing: ""
        },
        enterKeyHint: {
          type: ["enter", "done", "go", "next", "previous", "search", "send"],
          missing: ""
        },
        autoCapitalize: {
          type: ["off", "on", "none", "sentences", "words", "characters"],
          missing: ""
        },
        autoFocus: Boolean,
        accessKey: String,
        nonce: String,
        hidden: Boolean,
        translate: {
          type: ["no", "yes"],
          missing: ""
        },
        tabIndex: {
          type: "long",
          default: function () {
            if (this.tagName in cxm || this.contentEditable) {
              return 0;
            } else {
              return -1;
            }
          }
        }
      },
      events: ["abort", "canplay", "canplaythrough", "change", "click", "contextmenu", "cuechange", "dblclick", "drag", "dragend", "dragenter", "dragleave", "dragover", "dragstart", "drop", "durationchange", "emptied", "ended", "input", "invalid", "keydown", "keypress", "keyup", "loadeddata", "loadedmetadata", "loadstart", "mousedown", "mousemove", "mouseout", "mouseover", "mouseup", "mousewheel", "pause", "play", "playing", "progress", "ratechange", "readystatechange", "reset", "seeked", "seeking", "select", "show", "stalled", "submit", "suspend", "timeupdate", "volumechange", "waiting", "blur", "error", "focus", "load", "scroll"]
    });
    var uxm = al({
      name: "HTMLUnknownElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      }
    });
    var Use = {
      form: {
        get: function () {
          return this._form;
        }
      }
    };
    al({
      tag: "a",
      name: "HTMLAnchorElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        _post_click_activation_steps: {
          value: function (e) {
            if (this.href) {
              this.ownerDocument.defaultView.location = this.href;
            }
          }
        }
      },
      attributes: {
        href: D0,
        ping: String,
        download: String,
        target: String,
        rel: String,
        media: String,
        hreflang: String,
        type: String,
        referrerPolicy: vTt,
        coords: String,
        charset: String,
        name: String,
        rev: String,
        shape: String
      }
    });
    FCl._inherit(_Yt.a.prototype);
    al({
      tag: "area",
      name: "HTMLAreaElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        alt: String,
        target: String,
        download: String,
        rel: String,
        media: String,
        href: D0,
        hreflang: String,
        type: String,
        shape: String,
        coords: String,
        ping: String,
        referrerPolicy: vTt,
        noHref: Boolean
      }
    });
    FCl._inherit(_Yt.area.prototype);
    al({
      tag: "br",
      name: "HTMLBRElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        clear: String
      }
    });
    al({
      tag: "base",
      name: "HTMLBaseElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        target: String
      }
    });
    al({
      tag: "body",
      name: "HTMLBodyElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      events: ["afterprint", "beforeprint", "beforeunload", "blur", "error", "focus", "hashchange", "load", "message", "offline", "online", "pagehide", "pageshow", "popstate", "resize", "scroll", "storage", "unload"],
      attributes: {
        text: {
          type: String,
          treatNullAsEmptyString: true
        },
        link: {
          type: String,
          treatNullAsEmptyString: true
        },
        vLink: {
          type: String,
          treatNullAsEmptyString: true
        },
        aLink: {
          type: String,
          treatNullAsEmptyString: true
        },
        bgColor: {
          type: String,
          treatNullAsEmptyString: true
        },
        background: String
      }
    });
    al({
      tag: "button",
      name: "HTMLButtonElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use,
      attributes: {
        name: String,
        value: String,
        disabled: Boolean,
        autofocus: Boolean,
        type: {
          type: ["submit", "reset", "button", "menu"],
          missing: "submit"
        },
        formTarget: String,
        formAction: D0,
        formNoValidate: Boolean,
        formMethod: {
          type: ["get", "post", "dialog"],
          invalid: "get",
          missing: ""
        },
        formEnctype: {
          type: ["application/x-www-form-urlencoded", "multipart/form-data", "text/plain"],
          invalid: "application/x-www-form-urlencoded",
          missing: ""
        }
      }
    });
    al({
      tag: "dl",
      name: "HTMLDListElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        compact: Boolean
      }
    });
    al({
      tag: "data",
      name: "HTMLDataElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        value: String
      }
    });
    al({
      tag: "datalist",
      name: "HTMLDataListElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      }
    });
    al({
      tag: "details",
      name: "HTMLDetailsElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        open: Boolean
      }
    });
    al({
      tag: "div",
      name: "HTMLDivElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        align: String
      }
    });
    al({
      tag: "embed",
      name: "HTMLEmbedElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        src: D0,
        type: String,
        width: String,
        height: String,
        align: String,
        name: String
      }
    });
    al({
      tag: "fieldset",
      name: "HTMLFieldSetElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use,
      attributes: {
        disabled: Boolean,
        name: String
      }
    });
    al({
      tag: "form",
      name: "HTMLFormElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        action: String,
        autocomplete: {
          type: ["on", "off"],
          missing: "on"
        },
        name: String,
        acceptCharset: {
          name: "accept-charset"
        },
        target: String,
        noValidate: Boolean,
        method: {
          type: ["get", "post", "dialog"],
          invalid: "get",
          missing: "get"
        },
        enctype: {
          type: ["application/x-www-form-urlencoded", "multipart/form-data", "text/plain"],
          invalid: "application/x-www-form-urlencoded",
          missing: "application/x-www-form-urlencoded"
        },
        encoding: {
          name: "enctype",
          type: ["application/x-www-form-urlencoded", "multipart/form-data", "text/plain"],
          invalid: "application/x-www-form-urlencoded",
          missing: "application/x-www-form-urlencoded"
        }
      }
    });
    al({
      tag: "hr",
      name: "HTMLHRElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        align: String,
        color: String,
        noShade: Boolean,
        size: String,
        width: String
      }
    });
    al({
      tag: "head",
      name: "HTMLHeadElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      }
    });
    al({
      tags: ["h1", "h2", "h3", "h4", "h5", "h6"],
      name: "HTMLHeadingElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        align: String
      }
    });
    al({
      tag: "html",
      name: "HTMLHtmlElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        xmlns: D0,
        version: String
      }
    });
    al({
      tag: "iframe",
      name: "HTMLIFrameElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        src: D0,
        srcdoc: String,
        name: String,
        width: String,
        height: String,
        seamless: Boolean,
        allow: Boolean,
        allowFullscreen: Boolean,
        allowUserMedia: Boolean,
        allowPaymentRequest: Boolean,
        referrerPolicy: vTt,
        loading: {
          type: ["eager", "lazy"],
          treatNullAsEmptyString: true
        },
        align: String,
        scrolling: String,
        frameBorder: String,
        longDesc: D0,
        marginHeight: {
          type: String,
          treatNullAsEmptyString: true
        },
        marginWidth: {
          type: String,
          treatNullAsEmptyString: true
        }
      }
    });
    al({
      tag: "img",
      name: "HTMLImageElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        alt: String,
        src: D0,
        srcset: String,
        crossOrigin: ter,
        useMap: String,
        isMap: Boolean,
        sizes: String,
        height: {
          type: "unsigned long",
          default: 0
        },
        width: {
          type: "unsigned long",
          default: 0
        },
        referrerPolicy: vTt,
        loading: {
          type: ["eager", "lazy"],
          missing: ""
        },
        name: String,
        lowsrc: D0,
        align: String,
        hspace: {
          type: "unsigned long",
          default: 0
        },
        vspace: {
          type: "unsigned long",
          default: 0
        },
        longDesc: D0,
        border: {
          type: String,
          treatNullAsEmptyString: true
        }
      }
    });
    al({
      tag: "input",
      name: "HTMLInputElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: {
        form: Use.form,
        _post_click_activation_steps: {
          value: function (e) {
            if (this.type === "checkbox") {
              this.checked = !this.checked;
            } else if (this.type === "radio") {
              var t = this.form.getElementsByName(this.name);
              for (var n = t.length - 1; n >= 0; n--) {
                var r = t[n];
                r.checked = r === this;
              }
            }
          }
        }
      },
      attributes: {
        name: String,
        disabled: Boolean,
        autofocus: Boolean,
        accept: String,
        alt: String,
        max: String,
        min: String,
        pattern: String,
        placeholder: String,
        step: String,
        dirName: String,
        defaultValue: {
          name: "value"
        },
        multiple: Boolean,
        required: Boolean,
        readOnly: Boolean,
        checked: Boolean,
        value: String,
        src: D0,
        defaultChecked: {
          name: "checked",
          type: Boolean
        },
        size: {
          type: "unsigned long",
          default: 20,
          min: 1,
          setmin: 1
        },
        width: {
          type: "unsigned long",
          min: 0,
          setmin: 0,
          default: 0
        },
        height: {
          type: "unsigned long",
          min: 0,
          setmin: 0,
          default: 0
        },
        minLength: {
          type: "unsigned long",
          min: 0,
          setmin: 0,
          default: -1
        },
        maxLength: {
          type: "unsigned long",
          min: 0,
          setmin: 0,
          default: -1
        },
        autocomplete: String,
        type: {
          type: ["text", "hidden", "search", "tel", "url", "email", "password", "datetime", "date", "month", "week", "time", "datetime-local", "number", "range", "color", "checkbox", "radio", "file", "submit", "image", "reset", "button"],
          missing: "text"
        },
        formTarget: String,
        formNoValidate: Boolean,
        formMethod: {
          type: ["get", "post"],
          invalid: "get",
          missing: ""
        },
        formEnctype: {
          type: ["application/x-www-form-urlencoded", "multipart/form-data", "text/plain"],
          invalid: "application/x-www-form-urlencoded",
          missing: ""
        },
        inputMode: {
          type: ["verbatim", "latin", "latin-name", "latin-prose", "full-width-latin", "kana", "kana-name", "katakana", "numeric", "tel", "email", "url"],
          missing: ""
        },
        align: String,
        useMap: String
      }
    });
    al({
      tag: "keygen",
      name: "HTMLKeygenElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use,
      attributes: {
        name: String,
        disabled: Boolean,
        autofocus: Boolean,
        challenge: String,
        keytype: {
          type: ["rsa"],
          missing: ""
        }
      }
    });
    al({
      tag: "li",
      name: "HTMLLIElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        value: {
          type: "long",
          default: 0
        },
        type: String
      }
    });
    al({
      tag: "label",
      name: "HTMLLabelElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use,
      attributes: {
        htmlFor: {
          name: "for",
          type: String
        }
      }
    });
    al({
      tag: "legend",
      name: "HTMLLegendElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        align: String
      }
    });
    al({
      tag: "link",
      name: "HTMLLinkElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        href: D0,
        rel: String,
        media: String,
        hreflang: String,
        type: String,
        crossOrigin: ter,
        nonce: String,
        integrity: String,
        referrerPolicy: vTt,
        imageSizes: String,
        imageSrcset: String,
        charset: String,
        rev: String,
        target: String
      }
    });
    al({
      tag: "map",
      name: "HTMLMapElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        name: String
      }
    });
    al({
      tag: "menu",
      name: "HTMLMenuElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        type: {
          type: ["context", "popup", "toolbar"],
          missing: "toolbar"
        },
        label: String,
        compact: Boolean
      }
    });
    al({
      tag: "meta",
      name: "HTMLMetaElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        name: String,
        content: String,
        httpEquiv: {
          name: "http-equiv",
          type: String
        },
        scheme: String
      }
    });
    al({
      tag: "meter",
      name: "HTMLMeterElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use
    });
    al({
      tags: ["ins", "del"],
      name: "HTMLModElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        cite: D0,
        dateTime: String
      }
    });
    al({
      tag: "ol",
      name: "HTMLOListElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        _numitems: {
          get: function () {
            var e = 0;
            this.childNodes.forEach(function (t) {
              if (t.nodeType === N1o.ELEMENT_NODE && t.tagName === "LI") {
                e++;
              }
            });
            return e;
          }
        }
      },
      attributes: {
        type: String,
        reversed: Boolean,
        start: {
          type: "long",
          default: function () {
            if (this.reversed) {
              return this._numitems;
            } else {
              return 1;
            }
          }
        },
        compact: Boolean
      }
    });
    al({
      tag: "object",
      name: "HTMLObjectElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use,
      attributes: {
        data: D0,
        type: String,
        name: String,
        useMap: String,
        typeMustMatch: Boolean,
        width: String,
        height: String,
        align: String,
        archive: String,
        code: String,
        declare: Boolean,
        hspace: {
          type: "unsigned long",
          default: 0
        },
        standby: String,
        vspace: {
          type: "unsigned long",
          default: 0
        },
        codeBase: D0,
        codeType: String,
        border: {
          type: String,
          treatNullAsEmptyString: true
        }
      }
    });
    al({
      tag: "optgroup",
      name: "HTMLOptGroupElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        disabled: Boolean,
        label: String
      }
    });
    al({
      tag: "option",
      name: "HTMLOptionElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        form: {
          get: function () {
            var e = this.parentNode;
            while (e && e.nodeType === N1o.ELEMENT_NODE) {
              if (e.localName === "select") {
                return e.form;
              }
              e = e.parentNode;
            }
          }
        },
        value: {
          get: function () {
            return this._getattr("value") || this.text;
          },
          set: function (e) {
            this._setattr("value", e);
          }
        },
        text: {
          get: function () {
            return this.textContent.replace(/[ \t\n\f\r]+/g, " ").trim();
          },
          set: function (e) {
            this.textContent = e;
          }
        }
      },
      attributes: {
        disabled: Boolean,
        defaultSelected: {
          name: "selected",
          type: Boolean
        },
        label: String
      }
    });
    al({
      tag: "output",
      name: "HTMLOutputElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use,
      attributes: {
        name: String
      }
    });
    al({
      tag: "p",
      name: "HTMLParagraphElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        align: String
      }
    });
    al({
      tag: "param",
      name: "HTMLParamElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        name: String,
        value: String,
        type: String,
        valueType: String
      }
    });
    al({
      tags: ["pre", "listing", "xmp"],
      name: "HTMLPreElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        width: {
          type: "long",
          default: 0
        }
      }
    });
    al({
      tag: "progress",
      name: "HTMLProgressElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: Use,
      attributes: {
        max: {
          type: Number,
          float: true,
          default: 1,
          min: 0
        }
      }
    });
    al({
      tags: ["q", "blockquote"],
      name: "HTMLQuoteElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        cite: D0
      }
    });
    al({
      tag: "script",
      name: "HTMLScriptElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        text: {
          get: function () {
            var e = "";
            for (var t = 0, n = this.childNodes.length; t < n; t++) {
              var r = this.childNodes[t];
              if (r.nodeType === N1o.TEXT_NODE) {
                e += r._data;
              }
            }
            return e;
          },
          set: function (e) {
            if (this.removeChildren(), e !== null && e !== "") {
              this.appendChild(this.ownerDocument.createTextNode(e));
            }
          }
        }
      },
      attributes: {
        src: D0,
        type: String,
        charset: String,
        referrerPolicy: vTt,
        defer: Boolean,
        async: Boolean,
        nomodule: Boolean,
        crossOrigin: ter,
        nonce: String,
        integrity: String
      }
    });
    al({
      tag: "select",
      name: "HTMLSelectElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: {
        form: Use.form,
        options: {
          get: function () {
            return this.getElementsByTagName("option");
          }
        }
      },
      attributes: {
        autocomplete: String,
        name: String,
        disabled: Boolean,
        autofocus: Boolean,
        multiple: Boolean,
        required: Boolean,
        size: {
          type: "unsigned long",
          default: 0
        }
      }
    });
    al({
      tag: "span",
      name: "HTMLSpanElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      }
    });
    al({
      tag: "style",
      name: "HTMLStyleElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        media: String,
        type: String,
        scoped: Boolean
      }
    });
    al({
      tag: "caption",
      name: "HTMLTableCaptionElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        align: String
      }
    });
    al({
      name: "HTMLTableCellElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        colSpan: {
          type: "unsigned long",
          default: 1
        },
        rowSpan: {
          type: "unsigned long",
          default: 1
        },
        scope: {
          type: ["row", "col", "rowgroup", "colgroup"],
          missing: ""
        },
        abbr: String,
        align: String,
        axis: String,
        height: String,
        width: String,
        ch: {
          name: "char",
          type: String
        },
        chOff: {
          name: "charoff",
          type: String
        },
        noWrap: Boolean,
        vAlign: String,
        bgColor: {
          type: String,
          treatNullAsEmptyString: true
        }
      }
    });
    al({
      tags: ["col", "colgroup"],
      name: "HTMLTableColElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        span: {
          type: "limited unsigned long with fallback",
          default: 1,
          min: 1
        },
        align: String,
        ch: {
          name: "char",
          type: String
        },
        chOff: {
          name: "charoff",
          type: String
        },
        vAlign: String,
        width: String
      }
    });
    al({
      tag: "table",
      name: "HTMLTableElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        rows: {
          get: function () {
            return this.getElementsByTagName("tr");
          }
        }
      },
      attributes: {
        align: String,
        border: String,
        frame: String,
        rules: String,
        summary: String,
        width: String,
        bgColor: {
          type: String,
          treatNullAsEmptyString: true
        },
        cellPadding: {
          type: String,
          treatNullAsEmptyString: true
        },
        cellSpacing: {
          type: String,
          treatNullAsEmptyString: true
        }
      }
    });
    al({
      tag: "template",
      name: "HTMLTemplateElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
        this._contentFragment = t._templateDoc.createDocumentFragment();
      },
      props: {
        content: {
          get: function () {
            return this._contentFragment;
          }
        },
        serialize: {
          value: function () {
            return this.content.serialize();
          }
        }
      }
    });
    al({
      tag: "tr",
      name: "HTMLTableRowElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        cells: {
          get: function () {
            return this.querySelectorAll("td,th");
          }
        }
      },
      attributes: {
        align: String,
        ch: {
          name: "char",
          type: String
        },
        chOff: {
          name: "charoff",
          type: String
        },
        vAlign: String,
        bgColor: {
          type: String,
          treatNullAsEmptyString: true
        }
      }
    });
    al({
      tags: ["thead", "tfoot", "tbody"],
      name: "HTMLTableSectionElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        rows: {
          get: function () {
            return this.getElementsByTagName("tr");
          }
        }
      },
      attributes: {
        align: String,
        ch: {
          name: "char",
          type: String
        },
        chOff: {
          name: "charoff",
          type: String
        },
        vAlign: String
      }
    });
    al({
      tag: "textarea",
      name: "HTMLTextAreaElement",
      ctor: function (t, n, r) {
        Fse.call(this, t, n, r);
      },
      props: {
        form: Use.form,
        type: {
          get: function () {
            return "textarea";
          }
        },
        defaultValue: {
          get: function () {
            return this.textContent;
          },
          set: function (e) {
            this.textContent = e;
          }
        },
        value: {
          get: function () {
            return this.defaultValue;
          },
          set: function (e) {
            this.defaultValue = e;
          }
        },
        textLength: {
          get: function () {
            return this.value.length;
          }
        }
      },
      attributes: {
        autocomplete: String,
        name: String,
        disabled: Boolean,
        autofocus: Boolean,
        placeholder: String,
        wrap: String,
        dirName: String,
        required: Boolean,
        readOnly: Boolean,
        rows: {
          type: "limited unsigned long with fallback",
          default: 2
        },
        cols: {
          type: "limited unsigned long with fallback",
          default: 20
        },
        maxLength: {
          type: "unsigned long",
          min: 0,
          setmin: 0,
          default: -1
        },
        minLength: {
          type: "unsigned long",
          min: 0,
          setmin: 0,
          default: -1
        },
        inputMode: {
          type: ["verbatim", "latin", "latin-name", "latin-prose", "full-width-latin", "kana", "kana-name", "katakana", "numeric", "tel", "email", "url"],
          missing: ""
        }
      }
    });
    al({
      tag: "time",
      name: "HTMLTimeElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        dateTime: String,
        pubDate: Boolean
      }
    });
    al({
      tag: "title",
      name: "HTMLTitleElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        text: {
          get: function () {
            return this.textContent;
          }
        }
      }
    });
    al({
      tag: "ul",
      name: "HTMLUListElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        type: String,
        compact: Boolean
      }
    });
    al({
      name: "HTMLMediaElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        src: D0,
        crossOrigin: ter,
        preload: {
          type: ["metadata", "none", "auto", {
            value: "",
            alias: "auto"
          }],
          missing: "auto"
        },
        loop: Boolean,
        autoplay: Boolean,
        mediaGroup: String,
        controls: Boolean,
        defaultMuted: {
          name: "muted",
          type: Boolean
        }
      }
    });
    al({
      name: "HTMLAudioElement",
      tag: "audio",
      superclass: ewe.HTMLMediaElement,
      ctor: function (t, n, r) {
        ewe.HTMLMediaElement.call(this, t, n, r);
      }
    });
    al({
      name: "HTMLVideoElement",
      tag: "video",
      superclass: ewe.HTMLMediaElement,
      ctor: function (t, n, r) {
        ewe.HTMLMediaElement.call(this, t, n, r);
      },
      attributes: {
        poster: D0,
        width: {
          type: "unsigned long",
          min: 0,
          default: 0
        },
        height: {
          type: "unsigned long",
          min: 0,
          default: 0
        }
      }
    });
    al({
      tag: "td",
      name: "HTMLTableDataCellElement",
      superclass: ewe.HTMLTableCellElement,
      ctor: function (t, n, r) {
        ewe.HTMLTableCellElement.call(this, t, n, r);
      }
    });
    al({
      tag: "th",
      name: "HTMLTableHeaderCellElement",
      superclass: ewe.HTMLTableCellElement,
      ctor: function (t, n, r) {
        ewe.HTMLTableCellElement.call(this, t, n, r);
      }
    });
    al({
      tag: "frameset",
      name: "HTMLFrameSetElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      }
    });
    al({
      tag: "frame",
      name: "HTMLFrameElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      }
    });
    al({
      tag: "canvas",
      name: "HTMLCanvasElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        getContext: {
          value: eK.nyi
        },
        probablySupportsContext: {
          value: eK.nyi
        },
        setContext: {
          value: eK.nyi
        },
        transferControlToProxy: {
          value: eK.nyi
        },
        toDataURL: {
          value: eK.nyi
        },
        toBlob: {
          value: eK.nyi
        }
      },
      attributes: {
        width: {
          type: "unsigned long",
          default: 300
        },
        height: {
          type: "unsigned long",
          default: 150
        }
      }
    });
    al({
      tag: "dialog",
      name: "HTMLDialogElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        show: {
          value: eK.nyi
        },
        showModal: {
          value: eK.nyi
        },
        close: {
          value: eK.nyi
        }
      },
      attributes: {
        open: Boolean,
        returnValue: String
      }
    });
    al({
      tag: "menuitem",
      name: "HTMLMenuItemElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      props: {
        _label: {
          get: function () {
            var e = this._getattr("label");
            if (e !== null && e !== "") {
              return e;
            }
            e = this.textContent;
            return e.replace(/[ \t\n\f\r]+/g, " ").trim();
          }
        },
        label: {
          get: function () {
            var e = this._getattr("label");
            if (e !== null) {
              return e;
            }
            return this._label;
          },
          set: function (e) {
            this._setattr("label", e);
          }
        }
      },
      attributes: {
        type: {
          type: ["command", "checkbox", "radio"],
          missing: "command"
        },
        icon: D0,
        disabled: Boolean,
        checked: Boolean,
        radiogroup: String,
        default: Boolean
      }
    });
    al({
      tag: "source",
      name: "HTMLSourceElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        srcset: String,
        sizes: String,
        media: String,
        src: D0,
        type: String,
        width: String,
        height: String
      }
    });
    al({
      tag: "track",
      name: "HTMLTrackElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        src: D0,
        srclang: String,
        label: String,
        default: Boolean,
        kind: {
          type: ["subtitles", "captions", "descriptions", "chapters", "metadata"],
          missing: "subtitles",
          invalid: "metadata"
        }
      },
      props: {
        NONE: {
          get: function () {
            return 0;
          }
        },
        LOADING: {
          get: function () {
            return 1;
          }
        },
        LOADED: {
          get: function () {
            return 2;
          }
        },
        ERROR: {
          get: function () {
            return 3;
          }
        },
        readyState: {
          get: eK.nyi
        },
        track: {
          get: eK.nyi
        }
      }
    });
    al({
      tag: "font",
      name: "HTMLFontElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        color: {
          type: String,
          treatNullAsEmptyString: true
        },
        face: {
          type: String
        },
        size: {
          type: String
        }
      }
    });
    al({
      tag: "dir",
      name: "HTMLDirectoryElement",
      ctor: function (t, n, r) {
        yu.call(this, t, n, r);
      },
      attributes: {
        compact: Boolean
      }
    });
    al({
      tags: ["abbr", "address", "article", "aside", "b", "bdi", "bdo", "cite", "content", "code", "dd", "dfn", "dt", "em", "figcaption", "figure", "footer", "header", "hgroup", "i", "kbd", "main", "mark", "nav", "noscript", "rb", "rp", "rt", "rtc", "ruby", "s", "samp", "section", "small", "strong", "sub", "summary", "sup", "u", "var", "wbr", "acronym", "basefont", "big", "center", "nobr", "noembed", "noframes", "plaintext", "strike", "tt"]
    });
  });
  var U1o = __commonJS(oer => {
    var UCl = STt();
    var dxm = M1o();
    var pxm = O0();
    var mxm = eer();
    var fxm = oer.elements = {};
    var BCl = Object.create(null);
    oer.createElement = function (e, t, n) {
      var r = BCl[t] || F1o;
      return new r(e, t, n);
    };
    function L1o(e) {
      return dxm(e, F1o, fxm, BCl);
    }
    var F1o = L1o({
      superclass: UCl,
      name: "SVGElement",
      ctor: function (t, n, r) {
        UCl.call(this, t, n, pxm.NAMESPACE.SVG, r);
      },
      props: {
        style: {
          get: function () {
            if (!this._style) {
              this._style = new mxm(this);
            }
            return this._style;
          }
        }
      }
    });
    L1o({
      name: "SVGSVGElement",
      ctor: function (t, n, r) {
        F1o.call(this, t, n, r);
      },
      tag: "svg",
      props: {
        createSVGRect: {
          value: function () {
            return oer.createElement(this.ownerDocument, "rect", null);
          }
        }
      }
    });
    L1o({
      tags: ["a", "altGlyph", "altGlyphDef", "altGlyphItem", "animate", "animateColor", "animateMotion", "animateTransform", "circle", "clipPath", "color-profile", "cursor", "defs", "desc", "ellipse", "feBlend", "feColorMatrix", "feComponentTransfer", "feComposite", "feConvolveMatrix", "feDiffuseLighting", "feDisplacementMap", "feDistantLight", "feFlood", "feFuncA", "feFuncB", "feFuncG", "feFuncR", "feGaussianBlur", "feImage", "feMerge", "feMergeNode", "feMorphology", "feOffset", "fePointLight", "feSpecularLighting", "feSpotLight", "feTile", "feTurbulence", "filter", "font", "font-face", "font-face-format", "font-face-name", "font-face-src", "font-face-uri", "foreignObject", "g", "glyph", "glyphRef", "hkern", "image", "line", "linearGradient", "marker", "mask", "metadata", "missing-glyph", "mpath", "path", "pattern", "polygon", "polyline", "radialGradient", "rect", "script", "set", "stop", "style", "switch", "symbol", "text", "textPath", "title", "tref", "tspan", "use", "view", "vkern"]
    });
  });
  var HCl = __commonJS((Zqb, $Cl) => {
    $Cl.exports = {
      VALUE: 1,
      ATTR: 2,
      REMOVE_ATTR: 3,
      REMOVE: 4,
      MOVE: 5,
      INSERT: 6
    };
  });
  var ier = __commonJS((e3b, XCl) => {
    XCl.exports = SYt;
    var lH = VU();
    var hxm = LKe();
    var zCl = jZn();
    var HLe = STt();
    var gxm = y1o();
    var yxm = b1o();
    var bYt = mTt();
    var _xm = T1o();
    var bxm = v1o();
    var Sxm = TYt();
    var Txm = mCl();
    var Exm = bCl();
    var jCl = gYt();
    var qCl = ZZn();
    var WCl = zZn();
    var vxm = O1o();
    var ser = qZn();
    var B1o = rer();
    var wxm = U1o();
    var nb = O0();
    var wTt = HCl();
    var RTt = nb.NAMESPACE;
    var $1o = BZn().isApiWritable;
    function SYt(e, t) {
      zCl.call(this);
      this.nodeType = lH.DOCUMENT_NODE;
      this.isHTML = e;
      this._address = t || "about:blank";
      this.readyState = "loading";
      this.implementation = new Sxm(this);
      this.ownerDocument = null;
      this._contentType = e ? "text/html" : "application/xml";
      this.doctype = null;
      this.documentElement = null;
      this._templateDocCache = null;
      this._nodeIterators = null;
      this._nid = 1;
      this._nextnid = 2;
      this._nodes = [null, this];
      this.byId = Object.create(null);
      this.modclock = 0;
    }
    var Cxm = {
      event: "Event",
      customevent: "CustomEvent",
      uievent: "UIEvent",
      mouseevent: "MouseEvent"
    };
    var Rxm = {
      events: "event",
      htmlevents: "event",
      mouseevents: "mouseevent",
      mutationevents: "mutationevent",
      uievents: "uievent"
    };
    var CTt = function (e, t, n) {
      return {
        get: function () {
          var r = e.call(this);
          if (r) {
            return r[t];
          }
          return n;
        },
        set: function (r) {
          var o = e.call(this);
          if (o) {
            o[t] = r;
          }
        }
      };
    };
    function GCl(e, t) {
      var n;
      var r;
      var o;
      if (e === "") {
        e = null;
      }
      if (!ser.isValidQName(t)) {
        nb.InvalidCharacterError();
      }
      if (n = null, r = t, o = t.indexOf(":"), o >= 0) {
        n = t.substring(0, o);
        r = t.substring(o + 1);
      }
      if (n !== null && e === null) {
        nb.NamespaceError();
      }
      if (n === "xml" && e !== RTt.XML) {
        nb.NamespaceError();
      }
      if ((n === "xmlns" || t === "xmlns") && e !== RTt.XMLNS) {
        nb.NamespaceError();
      }
      if (e === RTt.XMLNS && !(n === "xmlns" || t === "xmlns")) {
        nb.NamespaceError();
      }
      return {
        namespace: e,
        prefix: n,
        localName: r
      };
    }
    SYt.prototype = Object.create(zCl.prototype, {
      _setMutationHandler: {
        value: function (e) {
          this.mutationHandler = e;
        }
      },
      _dispatchRendererEvent: {
        value: function (e, t, n) {
          var r = this._nodes[e];
          if (!r) {
            return;
          }
          r._dispatchEvent(new bYt(t, n), true);
        }
      },
      nodeName: {
        value: "#document"
      },
      nodeValue: {
        get: function () {
          return null;
        },
        set: function () {}
      },
      documentURI: {
        get: function () {
          return this._address;
        },
        set: nb.nyi
      },
      compatMode: {
        get: function () {
          return this._quirks ? "BackCompat" : "CSS1Compat";
        }
      },
      createTextNode: {
        value: function (e) {
          return new gxm(this, String(e));
        }
      },
      createComment: {
        value: function (e) {
          return new yxm(this, e);
        }
      },
      createDocumentFragment: {
        value: function () {
          return new _xm(this);
        }
      },
      createProcessingInstruction: {
        value: function (e, t) {
          if (!ser.isValidName(e) || t.indexOf("?>") !== -1) {
            nb.InvalidCharacterError();
          }
          return new bxm(this, e, t);
        }
      },
      createAttribute: {
        value: function (e) {
          if (e = String(e), !ser.isValidName(e)) {
            nb.InvalidCharacterError();
          }
          if (this.isHTML) {
            e = nb.toASCIILowerCase(e);
          }
          return new HLe._Attr(null, e, null, null, "");
        }
      },
      createAttributeNS: {
        value: function (e, t) {
          e = e === null || e === undefined || e === "" ? null : String(e);
          t = String(t);
          var n = GCl(e, t);
          return new HLe._Attr(null, n.localName, n.prefix, n.namespace, "");
        }
      },
      createElement: {
        value: function (e) {
          if (e = String(e), !ser.isValidName(e)) {
            nb.InvalidCharacterError();
          }
          if (this.isHTML) {
            if (/[A-Z]/.test(e)) {
              e = nb.toASCIILowerCase(e);
            }
            return B1o.createElement(this, e, null);
          } else if (this.contentType === "application/xhtml+xml") {
            return B1o.createElement(this, e, null);
          } else {
            return new HLe(this, e, null, null);
          }
        },
        writable: $1o
      },
      createElementNS: {
        value: function (e, t) {
          e = e === null || e === undefined || e === "" ? null : String(e);
          t = String(t);
          var n = GCl(e, t);
          return this._createElementNS(n.localName, n.namespace, n.prefix);
        },
        writable: $1o
      },
      _createElementNS: {
        value: function (e, t, n) {
          if (t === RTt.HTML) {
            return B1o.createElement(this, e, n);
          } else if (t === RTt.SVG) {
            return wxm.createElement(this, e, n);
          }
          return new HLe(this, e, t, n);
        }
      },
      createEvent: {
        value: function (t) {
          t = t.toLowerCase();
          var n = Rxm[t] || t;
          var r = vxm[Cxm[n]];
          if (r) {
            var o = new r();
            o._initialized = false;
            return o;
          } else {
            nb.NotSupportedError();
          }
        }
      },
      createTreeWalker: {
        value: function (e, t, n) {
          if (!e) {
            throw TypeError("root argument is required");
          }
          if (!(e instanceof lH)) {
            throw TypeError("root not a node");
          }
          t = t === undefined ? jCl.SHOW_ALL : +t;
          n = n === undefined ? null : n;
          return new Txm(e, t, n);
        }
      },
      createNodeIterator: {
        value: function (e, t, n) {
          if (!e) {
            throw TypeError("root argument is required");
          }
          if (!(e instanceof lH)) {
            throw TypeError("root not a node");
          }
          t = t === undefined ? jCl.SHOW_ALL : +t;
          n = n === undefined ? null : n;
          return new Exm(e, t, n);
        }
      },
      _attachNodeIterator: {
        value: function (e) {
          if (!this._nodeIterators) {
            this._nodeIterators = [];
          }
          this._nodeIterators.push(e);
        }
      },
      _detachNodeIterator: {
        value: function (e) {
          var t = this._nodeIterators.indexOf(e);
          this._nodeIterators.splice(t, 1);
        }
      },
      _preremoveNodeIterators: {
        value: function (e) {
          if (this._nodeIterators) {
            this._nodeIterators.forEach(function (t) {
              t._preremove(e);
            });
          }
        }
      },
      _updateDocTypeElement: {
        value: function () {
          this.doctype = this.documentElement = null;
          for (var t = this.firstChild; t !== null; t = t.nextSibling) {
            if (t.nodeType === lH.DOCUMENT_TYPE_NODE) {
              this.doctype = t;
            } else if (t.nodeType === lH.ELEMENT_NODE) {
              this.documentElement = t;
            }
          }
        }
      },
      insertBefore: {
        value: function (t, n) {
          lH.prototype.insertBefore.call(this, t, n);
          this._updateDocTypeElement();
          return t;
        }
      },
      replaceChild: {
        value: function (t, n) {
          lH.prototype.replaceChild.call(this, t, n);
          this._updateDocTypeElement();
          return n;
        }
      },
      removeChild: {
        value: function (t) {
          lH.prototype.removeChild.call(this, t);
          this._updateDocTypeElement();
          return t;
        }
      },
      getElementById: {
        value: function (e) {
          var t = this.byId[e];
          if (!t) {
            return null;
          }
          if (t instanceof twe) {
            return t.getFirst();
          }
          return t;
        }
      },
      _hasMultipleElementsWithId: {
        value: function (e) {
          return this.byId[e] instanceof twe;
        }
      },
      getElementsByName: {
        value: HLe.prototype.getElementsByName
      },
      getElementsByTagName: {
        value: HLe.prototype.getElementsByTagName
      },
      getElementsByTagNameNS: {
        value: HLe.prototype.getElementsByTagNameNS
      },
      getElementsByClassName: {
        value: HLe.prototype.getElementsByClassName
      },
      adoptNode: {
        value: function (t) {
          if (t.nodeType === lH.DOCUMENT_NODE) {
            nb.NotSupportedError();
          }
          if (t.nodeType === lH.ATTRIBUTE_NODE) {
            return t;
          }
          if (t.parentNode) {
            t.parentNode.removeChild(t);
          }
          if (t.ownerDocument !== this) {
            JCl(t, this);
          }
          return t;
        }
      },
      importNode: {
        value: function (t, n) {
          return this.adoptNode(t.cloneNode(n));
        },
        writable: $1o
      },
      origin: {
        get: function () {
          return null;
        }
      },
      characterSet: {
        get: function () {
          return "UTF-8";
        }
      },
      contentType: {
        get: function () {
          return this._contentType;
        }
      },
      URL: {
        get: function () {
          return this._address;
        }
      },
      domain: {
        get: nb.nyi,
        set: nb.nyi
      },
      referrer: {
        get: nb.nyi
      },
      cookie: {
        get: nb.nyi,
        set: nb.nyi
      },
      lastModified: {
        get: nb.nyi
      },
      location: {
        get: function () {
          return this.defaultView ? this.defaultView.location : null;
        },
        set: nb.nyi
      },
      _titleElement: {
        get: function () {
          return this.getElementsByTagName("title").item(0) || null;
        }
      },
      title: {
        get: function () {
          var e = this._titleElement;
          var t = e ? e.textContent : "";
          return t.replace(/[ \t\n\r\f]+/g, " ").replace(/(^ )|( $)/g, "");
        },
        set: function (e) {
          var t = this._titleElement;
          var n = this.head;
          if (!t && !n) {
            return;
          }
          if (!t) {
            t = this.createElement("title");
            n.appendChild(t);
          }
          t.textContent = e;
        }
      },
      dir: CTt(function () {
        var e = this.documentElement;
        if (e && e.tagName === "HTML") {
          return e;
        }
      }, "dir", ""),
      fgColor: CTt(function () {
        return this.body;
      }, "text", ""),
      linkColor: CTt(function () {
        return this.body;
      }, "link", ""),
      vlinkColor: CTt(function () {
        return this.body;
      }, "vLink", ""),
      alinkColor: CTt(function () {
        return this.body;
      }, "aLink", ""),
      bgColor: CTt(function () {
        return this.body;
      }, "bgColor", ""),
      charset: {
        get: function () {
          return this.characterSet;
        }
      },
      inputEncoding: {
        get: function () {
          return this.characterSet;
        }
      },
      scrollingElement: {
        get: function () {
          return this._quirks ? this.body : this.documentElement;
        }
      },
      body: {
        get: function () {
          return VCl(this.documentElement, "body");
        },
        set: nb.nyi
      },
      head: {
        get: function () {
          return VCl(this.documentElement, "head");
        }
      },
      images: {
        get: nb.nyi
      },
      embeds: {
        get: nb.nyi
      },
      plugins: {
        get: nb.nyi
      },
      links: {
        get: nb.nyi
      },
      forms: {
        get: nb.nyi
      },
      scripts: {
        get: nb.nyi
      },
      applets: {
        get: function () {
          return [];
        }
      },
      activeElement: {
        get: function () {
          return null;
        }
      },
      innerHTML: {
        get: function () {
          return this.serialize();
        },
        set: nb.nyi
      },
      outerHTML: {
        get: function () {
          return this.serialize();
        },
        set: nb.nyi
      },
      write: {
        value: function (e) {
          if (!this.isHTML) {
            nb.InvalidStateError();
          }
          if (!this._parser) {
            return;
          }
          if (!this._parser) {
            ;
          }
          var t = arguments.join("");
          this._parser.parse(t);
        }
      },
      writeln: {
        value: function (t) {
          this.write(Array.prototype.join.call(arguments, "") + `
`);
        }
      },
      open: {
        value: function () {
          this.documentElement = null;
        }
      },
      close: {
        value: function () {
          if (this.readyState = "interactive", this._dispatchEvent(new bYt("readystatechange"), true), this._dispatchEvent(new bYt("DOMContentLoaded"), true), this.readyState = "complete", this._dispatchEvent(new bYt("readystatechange"), true), this.defaultView) {
            this.defaultView._dispatchEvent(new bYt("load"), true);
          }
        }
      },
      clone: {
        value: function () {
          var t = new SYt(this.isHTML, this._address);
          t._quirks = this._quirks;
          t._contentType = this._contentType;
          return t;
        }
      },
      cloneNode: {
        value: function (t) {
          var n = lH.prototype.cloneNode.call(this, false);
          if (t) {
            for (var r = this.firstChild; r !== null; r = r.nextSibling) {
              n._appendChild(n.importNode(r, true));
            }
          }
          n._updateDocTypeElement();
          return n;
        }
      },
      isEqual: {
        value: function (t) {
          return true;
        }
      },
      mutateValue: {
        value: function (e) {
          if (this.mutationHandler) {
            this.mutationHandler({
              type: wTt.VALUE,
              target: e,
              data: e.data
            });
          }
        }
      },
      mutateAttr: {
        value: function (e, t) {
          if (this.mutationHandler) {
            this.mutationHandler({
              type: wTt.ATTR,
              target: e.ownerElement,
              attr: e
            });
          }
        }
      },
      mutateRemoveAttr: {
        value: function (e) {
          if (this.mutationHandler) {
            this.mutationHandler({
              type: wTt.REMOVE_ATTR,
              target: e.ownerElement,
              attr: e
            });
          }
        }
      },
      mutateRemove: {
        value: function (e) {
          if (this.mutationHandler) {
            this.mutationHandler({
              type: wTt.REMOVE,
              target: e.parentNode,
              node: e
            });
          }
          YCl(e);
        }
      },
      mutateInsert: {
        value: function (e) {
          if (KCl(e), this.mutationHandler) {
            this.mutationHandler({
              type: wTt.INSERT,
              target: e.parentNode,
              node: e
            });
          }
        }
      },
      mutateMove: {
        value: function (e) {
          if (this.mutationHandler) {
            this.mutationHandler({
              type: wTt.MOVE,
              target: e
            });
          }
        }
      },
      addId: {
        value: function (t, n) {
          var r = this.byId[t];
          if (!r) {
            this.byId[t] = n;
          } else {
            if (!(r instanceof twe)) {
              r = new twe(r);
              this.byId[t] = r;
            }
            r.add(n);
          }
        }
      },
      delId: {
        value: function (t, n) {
          var r = this.byId[t];
          if (nb.assert(r), r instanceof twe) {
            if (r.del(n), r.length === 1) {
              this.byId[t] = r.downgrade();
            }
          } else {
            this.byId[t] = undefined;
          }
        }
      },
      _resolve: {
        value: function (e) {
          return new qCl(this._documentBaseURL).resolve(e);
        }
      },
      _documentBaseURL: {
        get: function () {
          var e = this._address;
          if (e === "about:blank") {
            e = "/";
          }
          var t = this.querySelector("base[href]");
          if (t) {
            return new qCl(e).resolve(t.getAttribute("href"));
          }
          return e;
        }
      },
      _templateDoc: {
        get: function () {
          if (!this._templateDocCache) {
            var e = new SYt(this.isHTML, this._address);
            this._templateDocCache = e._templateDocCache = e;
          }
          return this._templateDocCache;
        }
      },
      querySelector: {
        value: function (e) {
          return WCl(e, this)[0];
        }
      },
      querySelectorAll: {
        value: function (e) {
          var t = WCl(e, this);
          return t.item ? t : new hxm(t);
        }
      }
    });
    var xxm = ["abort", "canplay", "canplaythrough", "change", "click", "contextmenu", "cuechange", "dblclick", "drag", "dragend", "dragenter", "dragleave", "dragover", "dragstart", "drop", "durationchange", "emptied", "ended", "input", "invalid", "keydown", "keypress", "keyup", "loadeddata", "loadedmetadata", "loadstart", "mousedown", "mousemove", "mouseout", "mouseover", "mouseup", "mousewheel", "pause", "play", "playing", "progress", "ratechange", "readystatechange", "reset", "seeked", "seeking", "select", "show", "stalled", "submit", "suspend", "timeupdate", "volumechange", "waiting", "blur", "error", "focus", "load", "scroll"];
    xxm.forEach(function (e) {
      Object.defineProperty(SYt.prototype, "on" + e, {
        get: function () {
          return this._getEventHandler(e);
        },
        set: function (t) {
          this._setEventHandler(e, t);
        }
      });
    });
    function VCl(e, t) {
      if (e && e.isHTML) {
        for (var n = e.firstChild; n !== null; n = n.nextSibling) {
          if (n.nodeType === lH.ELEMENT_NODE && n.localName === t && n.namespaceURI === RTt.HTML) {
            return n;
          }
        }
      }
      return null;
    }
    function kxm(e) {
      if (e._nid = e.ownerDocument._nextnid++, e.ownerDocument._nodes[e._nid] = e, e.nodeType === lH.ELEMENT_NODE) {
        var t = e.getAttribute("id");
        if (t) {
          e.ownerDocument.addId(t, e);
        }
        if (e._roothook) {
          e._roothook();
        }
      }
    }
    function Axm(e) {
      if (e.nodeType === lH.ELEMENT_NODE) {
        var t = e.getAttribute("id");
        if (t) {
          e.ownerDocument.delId(t, e);
        }
      }
      e.ownerDocument._nodes[e._nid] = undefined;
      e._nid = undefined;
    }
    function KCl(e) {
      if (kxm(e), e.nodeType === lH.ELEMENT_NODE) {
        for (var t = e.firstChild; t !== null; t = t.nextSibling) {
          KCl(t);
        }
      }
    }
    function YCl(e) {
      Axm(e);
      for (var t = e.firstChild; t !== null; t = t.nextSibling) {
        YCl(t);
      }
    }
    function JCl(e, t) {
      if (e.ownerDocument = t, e._lastModTime = undefined, Object.prototype.hasOwnProperty.call(e, "_tagName")) {
        e._tagName = undefined;
      }
      for (var n = e.firstChild; n !== null; n = n.nextSibling) {
        JCl(n, t);
      }
    }
    function twe(e) {
      this.nodes = Object.create(null);
      this.nodes[e._nid] = e;
      this.length = 1;
      this.firstNode = undefined;
    }
    twe.prototype.add = function (e) {
      if (!this.nodes[e._nid]) {
        this.nodes[e._nid] = e;
        this.length++;
        this.firstNode = undefined;
      }
    };
    twe.prototype.del = function (e) {
      if (this.nodes[e._nid]) {
        delete this.nodes[e._nid];
        this.length--;
        this.firstNode = undefined;
      }
    };
    twe.prototype.getFirst = function () {
      if (!this.firstNode) {
        var e;
        for (e in this.nodes) {
          if (this.firstNode === undefined || this.firstNode.compareDocumentPosition(this.nodes[e]) & lH.DOCUMENT_POSITION_PRECEDING) {
            this.firstNode = this.nodes[e];
          }
        }
      }
      return this.firstNode;
    };
    twe.prototype.downgrade = function () {
      if (this.length === 1) {
        var e;
        for (e in this.nodes) {
          return this.nodes[e];
        }
      }
      return this;
    };
  });
  var ler = __commonJS((t3b, ZCl) => {
    ZCl.exports = aer;
    var Ixm = VU();
    var QCl = h1o();
    var Pxm = KZn();
    function aer(e, t, n, r) {
      QCl.call(this);
      this.nodeType = Ixm.DOCUMENT_TYPE_NODE;
      this.ownerDocument = e || null;
      this.name = t;
      this.publicId = n || "";
      this.systemId = r || "";
    }
    aer.prototype = Object.create(QCl.prototype, {
      nodeName: {
        get: function () {
          return this.name;
        }
      },
      nodeValue: {
        get: function () {
          return null;
        },
        set: function () {}
      },
      clone: {
        value: function () {
          return new aer(this.ownerDocument, this.name, this.publicId, this.systemId);
        }
      },
      isEqual: {
        value: function (t) {
          return this.name === t.name && this.publicId === t.publicId && this.systemId === t.systemId;
        }
      }
    });
    Object.defineProperties(aer.prototype, Pxm);
  });
  var her = __commonJS((n3b, ERl) => {
    ERl.exports = v_;
    var Oxm = ier();
    var Dxm = ler();
    var H1o = VU();
    var pd = O0().NAMESPACE;
    var fRl = rer();
    var AS = fRl.elements;
    var UKe = Function.prototype.apply.bind(Array.prototype.push);
    var cer = -1;
    var Nxm = [];
    var $Ke = Object.create(null);
    $Ke[pd.HTML] = {
      __proto__: null,
      address: true,
      applet: true,
      area: true,
      article: true,
      aside: true,
      base: true,
      basefont: true,
      bgsound: true,
      blockquote: true,
      body: true,
      br: true,
      button: true,
      caption: true,
      center: true,
      col: true,
      colgroup: true,
      dd: true,
      details: true,
      dir: true,
      div: true,
      dl: true,
      dt: true,
      embed: true,
      fieldset: true,
      figcaption: true,
      figure: true,
      footer: true,
      form: true,
      frame: true,
      frameset: true,
      h1: true,
      h2: true,
      h3: true,
      h4: true,
      h5: true,
      hZc: true,
      head: true,
      header: true,
      hgroup: true,
      hr: true,
      html: true,
      iframe: true,
      img: true,
      input: true,
      li: true,
      link: true,
      listing: true,
      main: true,
      marquee: true,
      menu: true,
      meta: true,
      nav: true,
      noembed: true,
      noframes: true,
      noscript: true,
      object: true,
      ol: true,
      p: true,
      param: true,
      plaintext: true,
      pre: true,
      script: true,
      section: true,
      select: true,
      source: true,
      style: true,
      summary: true,
      table: true,
      tbody: true,
      td: true,
      template: true,
      textarea: true,
      tfoot: true,
      th: true,
      thead: true,
      title: true,
      tr: true,
      track: true,
      ul: true,
      wbr: true,
      xmp: true
    };
    $Ke[pd.SVG] = {
      __proto__: null,
      foreignObject: true,
      desc: true,
      title: true
    };
    $Ke[pd.MATHML] = {
      __proto__: null,
      mi: true,
      mo: true,
      mn: true,
      ms: true,
      mtext: true,
      "annotation-xml": true
    };
    var W1o = Object.create(null);
    W1o[pd.HTML] = {
      __proto__: null,
      address: true,
      div: true,
      p: true
    };
    var hRl = Object.create(null);
    hRl[pd.HTML] = {
      __proto__: null,
      dd: true,
      dt: true
    };
    var kTt = Object.create(null);
    kTt[pd.HTML] = {
      __proto__: null,
      table: true,
      thead: true,
      tbody: true,
      tfoot: true,
      tr: true
    };
    var gRl = Object.create(null);
    gRl[pd.HTML] = {
      __proto__: null,
      dd: true,
      dt: true,
      li: true,
      menuitem: true,
      optgroup: true,
      option: true,
      p: true,
      rb: true,
      rp: true,
      rt: true,
      rtc: true
    };
    var yRl = Object.create(null);
    yRl[pd.HTML] = {
      __proto__: null,
      caption: true,
      colgroup: true,
      dd: true,
      dt: true,
      li: true,
      optgroup: true,
      option: true,
      p: true,
      rb: true,
      rp: true,
      rt: true,
      rtc: true,
      tbody: true,
      td: true,
      tfoot: true,
      th: true,
      thead: true,
      tr: true
    };
    var per = Object.create(null);
    per[pd.HTML] = {
      __proto__: null,
      table: true,
      template: true,
      html: true
    };
    var mer = Object.create(null);
    mer[pd.HTML] = {
      __proto__: null,
      tbody: true,
      tfoot: true,
      thead: true,
      template: true,
      html: true
    };
    var G1o = Object.create(null);
    G1o[pd.HTML] = {
      __proto__: null,
      tr: true,
      template: true,
      html: true
    };
    var _Rl = Object.create(null);
    _Rl[pd.HTML] = {
      __proto__: null,
      button: true,
      fieldset: true,
      input: true,
      keygen: true,
      object: true,
      output: true,
      select: true,
      textarea: true,
      img: true
    };
    var Xme = Object.create(null);
    Xme[pd.HTML] = {
      __proto__: null,
      applet: true,
      caption: true,
      html: true,
      table: true,
      td: true,
      th: true,
      marquee: true,
      object: true,
      template: true
    };
    Xme[pd.MATHML] = {
      __proto__: null,
      mi: true,
      mo: true,
      mn: true,
      ms: true,
      mtext: true,
      "annotation-xml": true
    };
    Xme[pd.SVG] = {
      __proto__: null,
      foreignObject: true,
      desc: true,
      title: true
    };
    var fer = Object.create(Xme);
    fer[pd.HTML] = Object.create(Xme[pd.HTML]);
    fer[pd.HTML].ol = true;
    fer[pd.HTML].ul = true;
    var V1o = Object.create(Xme);
    V1o[pd.HTML] = Object.create(Xme[pd.HTML]);
    V1o[pd.HTML].button = true;
    var bRl = Object.create(null);
    bRl[pd.HTML] = {
      __proto__: null,
      html: true,
      table: true,
      template: true
    };
    var Bxm = Object.create(null);
    Bxm[pd.HTML] = {
      __proto__: null,
      optgroup: true,
      option: true
    };
    var SRl = Object.create(null);
    SRl[pd.MATHML] = {
      __proto__: null,
      mi: true,
      mo: true,
      mn: true,
      ms: true,
      mtext: true
    };
    var TRl = Object.create(null);
    TRl[pd.SVG] = {
      __proto__: null,
      foreignObject: true,
      desc: true,
      title: true
    };
    var tRl = {
      __proto__: null,
      "xlink:actuate": pd.XLINK,
      "xlink:arcrole": pd.XLINK,
      "xlink:href": pd.XLINK,
      "xlink:role": pd.XLINK,
      "xlink:show": pd.XLINK,
      "xlink:title": pd.XLINK,
      "xlink:type": pd.XLINK,
      "xml:base": pd.XML,
      "xml:lang": pd.XML,
      "xml:space": pd.XML,
      xmlns: pd.XMLNS,
      "xmlns:xlink": pd.XMLNS
    };
    var nRl = {
      __proto__: null,
      attributename: "attributeName",
      attributetype: "attributeType",
      basefrequency: "baseFrequency",
      baseprofile: "baseProfile",
      calcmode: "calcMode",
      clippathunits: "clipPathUnits",
      diffuseconstant: "diffuseConstant",
      edgemode: "edgeMode",
      filterunits: "filterUnits",
      glyphref: "glyphRef",
      gradienttransform: "gradientTransform",
      gradientunits: "gradientUnits",
      kernelmatrix: "kernelMatrix",
      kernelunitlength: "kernelUnitLength",
      keypoints: "keyPoints",
      keysplines: "keySplines",
      keytimes: "keyTimes",
      lengthadjust: "lengthAdjust",
      limitingconeangle: "limitingConeAngle",
      markerheight: "markerHeight",
      markerunits: "markerUnits",
      markerwidth: "markerWidth",
      maskcontentunits: "maskContentUnits",
      maskunits: "maskUnits",
      numoctaves: "numOctaves",
      pathlength: "pathLength",
      patterncontentunits: "patternContentUnits",
      patterntransform: "patternTransform",
      patternunits: "patternUnits",
      pointsatx: "pointsAtX",
      pointsaty: "pointsAtY",
      pointsatz: "pointsAtZ",
      preservealpha: "preserveAlpha",
      preserveaspectratio: "preserveAspectRatio",
      primitiveunits: "primitiveUnits",
      refx: "refX",
      refy: "refY",
      repeatcount: "repeatCount",
      repeatdur: "repeatDur",
      requiredextensions: "requiredExtensions",
      requiredfeatures: "requiredFeatures",
      specularconstant: "specularConstant",
      specularexponent: "specularExponent",
      spreadmethod: "spreadMethod",
      startoffset: "startOffset",
      stddeviation: "stdDeviation",
      stitchtiles: "stitchTiles",
      surfacescale: "surfaceScale",
      systemlanguage: "systemLanguage",
      tablevalues: "tableValues",
      targetx: "targetX",
      targety: "targetY",
      textlength: "textLength",
      viewbox: "viewBox",
      viewtarget: "viewTarget",
      xchannelselector: "xChannelSelector",
      ychannelselector: "yChannelSelector",
      zoomandpan: "zoomAndPan"
    };
    var rRl = {
      __proto__: null,
      altglyph: "altGlyph",
      altglyphdef: "altGlyphDef",
      altglyphitem: "altGlyphItem",
      animatecolor: "animateColor",
      animatemotion: "animateMotion",
      animatetransform: "animateTransform",
      clippath: "clipPath",
      feblend: "feBlend",
      fecolormatrix: "feColorMatrix",
      fecomponenttransfer: "feComponentTransfer",
      fecomposite: "feComposite",
      feconvolvematrix: "feConvolveMatrix",
      fediffuselighting: "feDiffuseLighting",
      fedisplacementmap: "feDisplacementMap",
      fedistantlight: "feDistantLight",
      feflood: "feFlood",
      fefunca: "feFuncA",
      fefuncb: "feFuncB",
      fefuncg: "feFuncG",
      fefuncr: "feFuncR",
      fegaussianblur: "feGaussianBlur",
      feimage: "feImage",
      femerge: "feMerge",
      femergenode: "feMergeNode",
      femorphology: "feMorphology",
      feoffset: "feOffset",
      fepointlight: "fePointLight",
      fespecularlighting: "feSpecularLighting",
      fespotlight: "feSpotLight",
      fetile: "feTile",
      feturbulence: "feTurbulence",
      foreignobject: "foreignObject",
      glyphref: "glyphRef",
      lineargradient: "linearGradient",
      radialgradient: "radialGradient",
      textpath: "textPath"
    };
    var oRl = {
      __proto__: null,
      0: 65533,
      128: 8364,
      130: 8218,
      131: 402,
      132: 8222,
      133: 8230,
      134: 8224,
      135: 8225,
      136: 710,
      137: 8240,
      138: 352,
      139: 8249,
      140: 338,
      142: 381,
      145: 8216,
      146: 8217,
      147: 8220,
      148: 8221,
      149: 8226,
      150: 8211,
      151: 8212,
      152: 732,
      153: 8482,
      154: 353,
      155: 8250,
      156: 339,
      158: 382,
      159: 376
    };
    var $xm = {
      __proto__: null,
      AElig: 198,
      "AElig;": 198,
      AMP: 38,
      "AMP;": 38,
      Aacute: 193,
      "Aacute;": 193,
      "Abreve;": 258,
      Acirc: 194,
      "Acirc;": 194,
      "Acy;": 1040,
      "Afr;": [55349, 56580],
      Agrave: 192,
      "Agrave;": 192,
      "Alpha;": 913,
      "Amacr;": 256,
      "And;": 10835,
      "Aogon;": 260,
      "Aopf;": [55349, 56632],
      "ApplyFunction;": 8289,
      Aring: 197,
      "Aring;": 197,
      "Ascr;": [55349, 56476],
      "Assign;": 8788,
      Atilde: 195,
      "Atilde;": 195,
      Auml: 196,
      "Auml;": 196,
      "Backslash;": 8726,
      "Barv;": 10983,
      "Barwed;": 8966,
      "Bcy;": 1041,
      "Because;": 8757,
      "Bernoullis;": 8492,
      "Beta;": 914,
      "Bfr;": [55349, 56581],
      "Bopf;": [55349, 56633],
      "Breve;": 728,
      "Bscr;": 8492,
      "Bumpeq;": 8782,
      "CHcy;": 1063,
      COPY: 169,
      "COPY;": 169,
      "Cacute;": 262,
      "Cap;": 8914,
      "CapitalDifferentialD;": 8517,
      "Cayleys;": 8493,
      "Ccaron;": 268,
      Ccedil: 199,
      "Ccedil;": 199,
      "Ccirc;": 264,
      "Cconint;": 8752,
      "Cdot;": 266,
      "Cedilla;": 184,
      "CenterDot;": 183,
      "Cfr;": 8493,
      "Chi;": 935,
      "CircleDot;": 8857,
      "CircleMinus;": 8854,
      "CirclePlus;": 8853,
      "CircleTimes;": 8855,
      "ClockwiseContourIntegral;": 8754,
      "CloseCurlyDoubleQuote;": 8221,
      "CloseCurlyQuote;": 8217,
      "Colon;": 8759,
      "Colone;": 10868,
      "Congruent;": 8801,
      "Conint;": 8751,
      "ContourIntegral;": 8750,
      "Copf;": 8450,
      "Coproduct;": 8720,
      "CounterClockwiseContourIntegral;": 8755,
      "Cross;": 10799,
      "Cscr;": [55349, 56478],
      "Cup;": 8915,
      "CupCap;": 8781,
      "DD;": 8517,
      "DDotrahd;": 10513,
      "DJcy;": 1026,
      "DScy;": 1029,
      "DZcy;": 1039,
      "Dagger;": 8225,
      "Darr;": 8609,
      "Dashv;": 10980,
      "Dcaron;": 270,
      "Dcy;": 1044,
      "Del;": 8711,
      "Delta;": 916,
      "Dfr;": [55349, 56583],
      "DiacriticalAcute;": 180,
      "DiacriticalDot;": 729,
      "DiacriticalDoubleAcute;": 733,
      "DiacriticalGrave;": 96,
      "DiacriticalTilde;": 732,
      "Diamond;": 8900,
      "DifferentialD;": 8518,
      "Dopf;": [55349, 56635],
      "Dot;": 168,
      "DotDot;": 8412,
      "DotEqual;": 8784,
      "DoubleContourIntegral;": 8751,
      "DoubleDot;": 168,
      "DoubleDownArrow;": 8659,
      "DoubleLeftArrow;": 8656,
      "DoubleLeftRightArrow;": 8660,
      "DoubleLeftTee;": 10980,
      "DoubleLongLeftArrow;": 10232,
      "DoubleLongLeftRightArrow;": 10234,
      "DoubleLongRightArrow;": 10233,
      "DoubleRightArrow;": 8658,
      "DoubleRightTee;": 8872,
      "DoubleUpArrow;": 8657,
      "DoubleUpDownArrow;": 8661,
      "DoubleVerticalBar;": 8741,
      "DownArrow;": 8595,
      "DownArrowBar;": 10515,
      "DownArrowUpArrow;": 8693,
      "DownBreve;": 785,
      "DownLeftRightVector;": 10576,
      "DownLeftTeeVector;": 10590,
      "DownLeftVector;": 8637,
      "DownLeftVectorBar;": 10582,
      "DownRightTeeVector;": 10591,
      "DownRightVector;": 8641,
      "DownRightVectorBar;": 10583,
      "DownTee;": 8868,
      "DownTeeArrow;": 8615,
      "Downarrow;": 8659,
      "Dscr;": [55349, 56479],
      "Dstrok;": 272,
      "ENG;": 330,
      ETH: 208,
      "ETH;": 208,
      Eacute: 201,
      "Eacute;": 201,
      "Ecaron;": 282,
      Ecirc: 202,
      "Ecirc;": 202,
      "Ecy;": 1069,
      "Edot;": 278,
      "Efr;": [55349, 56584],
      Egrave: 200,
      "Egrave;": 200,
      "Element;": 8712,
      "Emacr;": 274,
      "EmptySmallSquare;": 9723,
      "EmptyVerySmallSquare;": 9643,
      "Eogon;": 280,
      "Eopf;": [55349, 56636],
      "Epsilon;": 917,
      "Equal;": 10869,
      "EqualTilde;": 8770,
      "Equilibrium;": 8652,
      "Escr;": 8496,
      "Esim;": 10867,
      "Eta;": 919,
      Euml: 203,
      "Euml;": 203,
      "Exists;": 8707,
      "ExponentialE;": 8519,
      "Fcy;": 1060,
      "Ffr;": [55349, 56585],
      "FilledSmallSquare;": 9724,
      "FilledVerySmallSquare;": 9642,
      "Fopf;": [55349, 56637],
      "ForAll;": 8704,
      "Fouriertrf;": 8497,
      "Fscr;": 8497,
      "GJcy;": 1027,
      GT: 62,
      "GT;": 62,
      "Gamma;": 915,
      "Gammad;": 988,
      "Gbreve;": 286,
      "Gcedil;": 290,
      "Gcirc;": 284,
      "Gcy;": 1043,
      "Gdot;": 288,
      "Gfr;": [55349, 56586],
      "Gg;": 8921,
      "Gopf;": [55349, 56638],
      "GreaterEqual;": 8805,
      "GreaterEqualLess;": 8923,
      "GreaterFullEqual;": 8807,
      "GreaterGreater;": 10914,
      "GreaterLess;": 8823,
      "GreaterSlantEqual;": 10878,
      "GreaterTilde;": 8819,
      "Gscr;": [55349, 56482],
      "Gt;": 8811,
      "HARDcy;": 1066,
      "Hacek;": 711,
      "Hat;": 94,
      "Hcirc;": 292,
      "Hfr;": 8460,
      "HilbertSpace;": 8459,
      "Hopf;": 8461,
      "HorizontalLine;": 9472,
      "Hscr;": 8459,
      "Hstrok;": 294,
      "HumpDownHump;": 8782,
      "HumpEqual;": 8783,
      "IEcy;": 1045,
      "IJlig;": 306,
      "IOcy;": 1025,
      Iacute: 205,
      "Iacute;": 205,
      Icirc: 206,
      "Icirc;": 206,
      "Icy;": 1048,
      "Idot;": 304,
      "Ifr;": 8465,
      Igrave: 204,
      "Igrave;": 204,
      "Im;": 8465,
      "Imacr;": 298,
      "ImaginaryI;": 8520,
      "Implies;": 8658,
      "Int;": 8748,
      "Integral;": 8747,
      "Intersection;": 8898,
      "InvisibleComma;": 8291,
      "InvisibleTimes;": 8290,
      "Iogon;": 302,
      "Iopf;": [55349, 56640],
      "Iota;": 921,
      "Iscr;": 8464,
      "Itilde;": 296,
      "Iukcy;": 1030,
      Iuml: 207,
      "Iuml;": 207,
      "Jcirc;": 308,
      "Jcy;": 1049,
      "Jfr;": [55349, 56589],
      "Jopf;": [55349, 56641],
      "Jscr;": [55349, 56485],
      "Jsercy;": 1032,
      "Jukcy;": 1028,
      "KHcy;": 1061,
      "KJcy;": 1036,
      "Kappa;": 922,
      "Kcedil;": 310,
      "Kcy;": 1050,
      "Kfr;": [55349, 56590],
      "Kopf;": [55349, 56642],
      "Kscr;": [55349, 56486],
      "LJcy;": 1033,
      LT: 60,
      "LT;": 60,
      "Lacute;": 313,
      "Lambda;": 923,
      "Lang;": 10218,
      "Laplacetrf;": 8466,
      "Larr;": 8606,
      "Lcaron;": 317,
      "Lcedil;": 315,
      "Lcy;": 1051,
      "LeftAngleBracket;": 10216,
      "LeftArrow;": 8592,
      "LeftArrowBar;": 8676,
      "LeftArrowRightArrow;": 8646,
      "LeftCeiling;": 8968,
      "LeftDoubleBracket;": 10214,
      "LeftDownTeeVector;": 10593,
      "LeftDownVector;": 8643,
      "LeftDownVectorBar;": 10585,
      "LeftFloor;": 8970,
      "LeftRightArrow;": 8596,
      "LeftRightVector;": 10574,
      "LeftTee;": 8867,
      "LeftTeeArrow;": 8612,
      "LeftTeeVector;": 10586,
      "LeftTriangle;": 8882,
      "LeftTriangleBar;": 10703,
      "LeftTriangleEqual;": 8884,
      "LeftUpDownVector;": 10577,
      "LeftUpTeeVector;": 10592,
      "LeftUpVector;": 8639,
      "LeftUpVectorBar;": 10584,
      "LeftVector;": 8636,
      "LeftVectorBar;": 10578,
      "Leftarrow;": 8656,
      "Leftrightarrow;": 8660,
      "LessEqualGreater;": 8922,
      "LessFullEqual;": 8806,
      "LessGreater;": 8822,
      "LessLess;": 10913,
      "LessSlantEqual;": 10877,
      "LessTilde;": 8818,
      "Lfr;": [55349, 56591],
      "Ll;": 8920,
      "Lleftarrow;": 8666,
      "Lmidot;": 319,
      "LongLeftArrow;": 10229,
      "LongLeftRightArrow;": 10231,
      "LongRightArrow;": 10230,
      "Longleftarrow;": 10232,
      "Longleftrightarrow;": 10234,
      "Longrightarrow;": 10233,
      "Lopf;": [55349, 56643],
      "LowerLeftArrow;": 8601,
      "LowerRightArrow;": 8600,
      "Lscr;": 8466,
      "Lsh;": 8624,
      "Lstrok;": 321,
      "Lt;": 8810,
      "Map;": 10501,
      "Mcy;": 1052,
      "MediumSpace;": 8287,
      "Mellintrf;": 8499,
      "Mfr;": [55349, 56592],
      "MinusPlus;": 8723,
      "Mopf;": [55349, 56644],
      "Mscr;": 8499,
      "Mu;": 924,
      "NJcy;": 1034,
      "Nacute;": 323,
      "Ncaron;": 327,
      "Ncedil;": 325,
      "Ncy;": 1053,
      "NegativeMediumSpace;": 8203,
      "NegativeThickSpace;": 8203,
      "NegativeThinSpace;": 8203,
      "NegativeVeryThinSpace;": 8203,
      "NestedGreaterGreater;": 8811,
      "NestedLessLess;": 8810,
      "NewLine;": 10,
      "Nfr;": [55349, 56593],
      "NoBreak;": 8288,
      "NonBreakingSpace;": 160,
      "Nopf;": 8469,
      "Not;": 10988,
      "NotCongruent;": 8802,
      "NotCupCap;": 8813,
      "NotDoubleVerticalBar;": 8742,
      "NotElement;": 8713,
      "NotEqual;": 8800,
      "NotEqualTilde;": [8770, 824],
      "NotExists;": 8708,
      "NotGreater;": 8815,
      "NotGreaterEqual;": 8817,
      "NotGreaterFullEqual;": [8807, 824],
      "NotGreaterGreater;": [8811, 824],
      "NotGreaterLess;": 8825,
      "NotGreaterSlantEqual;": [10878, 824],
      "NotGreaterTilde;": 8821,
      "NotHumpDownHump;": [8782, 824],
      "NotHumpEqual;": [8783, 824],
      "NotLeftTriangle;": 8938,
      "NotLeftTriangleBar;": [10703, 824],
      "NotLeftTriangleEqual;": 8940,
      "NotLess;": 8814,
      "NotLessEqual;": 8816,
      "NotLessGreater;": 8824,
      "NotLessLess;": [8810, 824],
      "NotLessSlantEqual;": [10877, 824],
      "NotLessTilde;": 8820,
      "NotNestedGreaterGreater;": [10914, 824],
      "NotNestedLessLess;": [10913, 824],
      "NotPrecedes;": 8832,
      "NotPrecedesEqual;": [10927, 824],
      "NotPrecedesSlantEqual;": 8928,
      "NotReverseElement;": 8716,
      "NotRightTriangle;": 8939,
      "NotRightTriangleBar;": [10704, 824],
      "NotRightTriangleEqual;": 8941,
      "NotSquareSubset;": [8847, 824],
      "NotSquareSubsetEqual;": 8930,
      "NotSquareSuperset;": [8848, 824],
      "NotSquareSupersetEqual;": 8931,
      "NotSubset;": [8834, 8402],
      "NotSubsetEqual;": 8840,
      "NotSucceeds;": 8833,
      "NotSucceedsEqual;": [10928, 824],
      "NotSucceedsSlantEqual;": 8929,
      "NotSucceedsTilde;": [8831, 824],
      "NotSuperset;": [8835, 8402],
      "NotSupersetEqual;": 8841,
      "NotTilde;": 8769,
      "NotTildeEqual;": 8772,
      "NotTildeFullEqual;": 8775,
      "NotTildeTilde;": 8777,
      "NotVerticalBar;": 8740,
      "Nscr;": [55349, 56489],
      Ntilde: 209,
      "Ntilde;": 209,
      "Nu;": 925,
      "OElig;": 338,
      Oacute: 211,
      "Oacute;": 211,
      Ocirc: 212,
      "Ocirc;": 212,
      "Ocy;": 1054,
      "Odblac;": 336,
      "Ofr;": [55349, 56594],
      Ograve: 210,
      "Ograve;": 210,
      "Omacr;": 332,
      "Omega;": 937,
      "Omicron;": 927,
      "Oopf;": [55349, 56646],
      "OpenCurlyDoubleQuote;": 8220,
      "OpenCurlyQuote;": 8216,
      "Or;": 10836,
      "Oscr;": [55349, 56490],
      Oslash: 216,
      "Oslash;": 216,
      Otilde: 213,
      "Otilde;": 213,
      "Otimes;": 10807,
      Ouml: 214,
      "Ouml;": 214,
      "OverBar;": 8254,
      "OverBrace;": 9182,
      "OverBracket;": 9140,
      "OverParenthesis;": 9180,
      "PartialD;": 8706,
      "Pcy;": 1055,
      "Pfr;": [55349, 56595],
      "Phi;": 934,
      "Pi;": 928,
      "PlusMinus;": 177,
      "Poincareplane;": 8460,
      "Popf;": 8473,
      "Pr;": 10939,
      "Precedes;": 8826,
      "PrecedesEqual;": 10927,
      "PrecedesSlantEqual;": 8828,
      "PrecedesTilde;": 8830,
      "Prime;": 8243,
      "Product;": 8719,
      "Proportion;": 8759,
      "Proportional;": 8733,
      "Pscr;": [55349, 56491],
      "Psi;": 936,
      QUOT: 34,
      "QUOT;": 34,
      "Qfr;": [55349, 56596],
      "Qopf;": 8474,
      "Qscr;": [55349, 56492],
      "RBarr;": 10512,
      REG: 174,
      "REG;": 174,
      "Racute;": 340,
      "Rang;": 10219,
      "Rarr;": 8608,
      "Rarrtl;": 10518,
      "Rcaron;": 344,
      "Rcedil;": 342,
      "Rcy;": 1056,
      "Re;": 8476,
      "ReverseElement;": 8715,
      "ReverseEquilibrium;": 8651,
      "ReverseUpEquilibrium;": 10607,
      "Rfr;": 8476,
      "Rho;": 929,
      "RightAngleBracket;": 10217,
      "RightArrow;": 8594,
      "RightArrowBar;": 8677,
      "RightArrowLeftArrow;": 8644,
      "RightCeiling;": 8969,
      "RightDoubleBracket;": 10215,
      "RightDownTeeVector;": 10589,
      "RightDownVector;": 8642,
      "RightDownVectorBar;": 10581,
      "RightFloor;": 8971,
      "RightTee;": 8866,
      "RightTeeArrow;": 8614,
      "RightTeeVector;": 10587,
      "RightTriangle;": 8883,
      "RightTriangleBar;": 10704,
      "RightTriangleEqual;": 8885,
      "RightUpDownVector;": 10575,
      "RightUpTeeVector;": 10588,
      "RightUpVector;": 8638,
      "RightUpVectorBar;": 10580,
      "RightVector;": 8640,
      "RightVectorBar;": 10579,
      "Rightarrow;": 8658,
      "Ropf;": 8477,
      "RoundImplies;": 10608,
      "Rrightarrow;": 8667,
      "Rscr;": 8475,
      "Rsh;": 8625,
      "RuleDelayed;": 10740,
      "SHCHcy;": 1065,
      "SHcy;": 1064,
      "SOFTcy;": 1068,
      "Sacute;": 346,
      "Sc;": 10940,
      "Scaron;": 352,
      "Scedil;": 350,
      "Scirc;": 348,
      "Scy;": 1057,
      "Sfr;": [55349, 56598],
      "ShortDownArrow;": 8595,
      "ShortLeftArrow;": 8592,
      "ShortRightArrow;": 8594,
      "ShortUpArrow;": 8593,
      "Sigma;": 931,
      "SmallCircle;": 8728,
      "Sopf;": [55349, 56650],
      "Sqrt;": 8730,
      "Square;": 9633,
      "SquareIntersection;": 8851,
      "SquareSubset;": 8847,
      "SquareSubsetEqual;": 8849,
      "SquareSuperset;": 8848,
      "SquareSupersetEqual;": 8850,
      "SquareUnion;": 8852,
      "Sscr;": [55349, 56494],
      "Star;": 8902,
      "Sub;": 8912,
      "Subset;": 8912,
      "SubsetEqual;": 8838,
      "Succeeds;": 8827,
      "SucceedsEqual;": 10928,
      "SucceedsSlantEqual;": 8829,
      "SucceedsTilde;": 8831,
      "SuchThat;": 8715,
      "Sum;": 8721,
      "Sup;": 8913,
      "Superset;": 8835,
      "SupersetEqual;": 8839,
      "Supset;": 8913,
      THORN: 222,
      "THORN;": 222,
      "TRADE;": 8482,
      "TSHcy;": 1035,
      "TScy;": 1062,
      "Tab;": 9,
      "Tau;": 932,
      "Tcaron;": 356,
      "Tcedil;": 354,
      "Tcy;": 1058,
      "Tfr;": [55349, 56599],
      "Therefore;": 8756,
      "Theta;": 920,
      "ThickSpace;": [8287, 8202],
      "ThinSpace;": 8201,
      "Tilde;": 8764,
      "TildeEqual;": 8771,
      "TildeFullEqual;": 8773,
      "TildeTilde;": 8776,
      "Topf;": [55349, 56651],
      "TripleDot;": 8411,
      "Tscr;": [55349, 56495],
      "Tstrok;": 358,
      Uacute: 218,
      "Uacute;": 218,
      "Uarr;": 8607,
      "Uarrocir;": 10569,
      "Ubrcy;": 1038,
      "Ubreve;": 364,
      Ucirc: 219,
      "Ucirc;": 219,
      "Ucy;": 1059,
      "Udblac;": 368,
      "Ufr;": [55349, 56600],
      Ugrave: 217,
      "Ugrave;": 217,
      "Umacr;": 362,
      "UnderBar;": 95,
      "UnderBrace;": 9183,
      "UnderBracket;": 9141,
      "UnderParenthesis;": 9181,
      "Union;": 8899,
      "UnionPlus;": 8846,
      "Uogon;": 370,
      "Uopf;": [55349, 56652],
      "UpArrow;": 8593,
      "UpArrowBar;": 10514,
      "UpArrowDownArrow;": 8645,
      "UpDownArrow;": 8597,
      "UpEquilibrium;": 10606,
      "UpTee;": 8869,
      "UpTeeArrow;": 8613,
      "Uparrow;": 8657,
      "Updownarrow;": 8661,
      "UpperLeftArrow;": 8598,
      "UpperRightArrow;": 8599,
      "Upsi;": 978,
      "Upsilon;": 933,
      "Uring;": 366,
      "Uscr;": [55349, 56496],
      "Utilde;": 360,
      Uuml: 220,
      "Uuml;": 220,
      "VDash;": 8875,
      "Vbar;": 10987,
      "Vcy;": 1042,
      "Vdash;": 8873,
      "Vdashl;": 10982,
      "Vee;": 8897,
      "Verbar;": 8214,
      "Vert;": 8214,
      "VerticalBar;": 8739,
      "VerticalLine;": 124,
      "VerticalSeparator;": 10072,
      "VerticalTilde;": 8768,
      "VeryThinSpace;": 8202,
      "Vfr;": [55349, 56601],
      "Vopf;": [55349, 56653],
      "Vscr;": [55349, 56497],
      "Vvdash;": 8874,
      "Wcirc;": 372,
      "Wedge;": 8896,
      "Wfr;": [55349, 56602],
      "Wopf;": [55349, 56654],
      "Wscr;": [55349, 56498],
      "Xfr;": [55349, 56603],
      "Xi;": 926,
      "Xopf;": [55349, 56655],
      "Xscr;": [55349, 56499],
      "YAcy;": 1071,
      "YIcy;": 1031,
      "YUcy;": 1070,
      Yacute: 221,
      "Yacute;": 221,
      "Ycirc;": 374,
      "Ycy;": 1067,
      "Yfr;": [55349, 56604],
      "Yopf;": [55349, 56656],
      "Yscr;": [55349, 56500],
      "Yuml;": 376,
      "ZHcy;": 1046,
      "Zacute;": 377,
      "Zcaron;": 381,
      "Zcy;": 1047,
      "Zdot;": 379,
      "ZeroWidthSpace;": 8203,
      "Zeta;": 918,
      "Zfr;": 8488,
      "Zopf;": 8484,
      "Zscr;": [55349, 56501],
      aacute: 225,
      "aacute;": 225,
      "abreve;": 259,
      "ac;": 8766,
      "acE;": [8766, 819],
      "acd;": 8767,
      acirc: 226,
      "acirc;": 226,
      acute: 180,
      "acute;": 180,
      "acy;": 1072,
      aelig: 230,
      "aelig;": 230,
      "af;": 8289,
      "afr;": [55349, 56606],
      agrave: 224,
      "agrave;": 224,
      "alefsym;": 8501,
      "aleph;": 8501,
      "alpha;": 945,
      "amacr;": 257,
      "amalg;": 10815,
      amp: 38,
      "amp;": 38,
      "and;": 8743,
      "andand;": 10837,
      "andd;": 10844,
      "andslope;": 10840,
      "andv;": 10842,
      "ang;": 8736,
      "ange;": 10660,
      "angle;": 8736,
      "angmsd;": 8737,
      "angmsdaa;": 10664,
      "angmsdab;": 10665,
      "angmsdac;": 10666,
      "angmsdad;": 10667,
      "angmsdae;": 10668,
      "angmsdaf;": 10669,
      "angmsdag;": 10670,
      "angmsdah;": 10671,
      "angrt;": 8735,
      "angrtvb;": 8894,
      "angrtvbd;": 10653,
      "angsph;": 8738,
      "angst;": 197,
      "angzarr;": 9084,
      "aogon;": 261,
      "aopf;": [55349, 56658],
      "ap;": 8776,
      "apE;": 10864,
      "apacir;": 10863,
      "ape;": 8778,
      "apid;": 8779,
      "apos;": 39,
      "approx;": 8776,
      "approxeq;": 8778,
      aring: 229,
      "aring;": 229,
      "ascr;": [55349, 56502],
      "ast;": 42,
      "asymp;": 8776,
      "asympeq;": 8781,
      atilde: 227,
      "atilde;": 227,
      auml: 228,
      "auml;": 228,
      "awconint;": 8755,
      "awint;": 10769,
      "bNot;": 10989,
      "backcong;": 8780,
      "backepsilon;": 1014,
      "backprime;": 8245,
      "backsim;": 8765,
      "backsimeq;": 8909,
      "barvee;": 8893,
      "barwed;": 8965,
      "barwedge;": 8965,
      "bbrk;": 9141,
      "bbrktbrk;": 9142,
      "bcong;": 8780,
      "bcy;": 1073,
      "bdquo;": 8222,
      "becaus;": 8757,
      "because;": 8757,
      "bemptyv;": 10672,
      "bepsi;": 1014,
      "bernou;": 8492,
      "beta;": 946,
      "beth;": 8502,
      "between;": 8812,
      "bfr;": [55349, 56607],
      "bigcap;": 8898,
      "bigcirc;": 9711,
      "bigcup;": 8899,
      "bigodot;": 10752,
      "bigoplus;": 10753,
      "bigotimes;": 10754,
      "bigsqcup;": 10758,
      "bigstar;": 9733,
      "bigtriangledown;": 9661,
      "bigtriangleup;": 9651,
      "biguplus;": 10756,
      "bigvee;": 8897,
      "bigwedge;": 8896,
      "bkarow;": 10509,
      "blacklozenge;": 10731,
      "blacksquare;": 9642,
      "blacktriangle;": 9652,
      "blacktriangledown;": 9662,
      "blacktriangleleft;": 9666,
      "blacktriangleright;": 9656,
      "blank;": 9251,
      "blk12;": 9618,
      "blk14;": 9617,
      "blk34;": 9619,
      "block;": 9608,
      "bne;": [61, 8421],
      "bnequiv;": [8801, 8421],
      "bnot;": 8976,
      "bopf;": [55349, 56659],
      "bot;": 8869,
      "bottom;": 8869,
      "bowtie;": 8904,
      "boxDL;": 9559,
      "boxDR;": 9556,
      "boxDl;": 9558,
      "boxDr;": 9555,
      "boxH;": 9552,
      "boxHD;": 9574,
      "boxHU;": 9577,
      "boxHd;": 9572,
      "boxHu;": 9575,
      "boxUL;": 9565,
      "boxUR;": 9562,
      "boxUl;": 9564,
      "boxUr;": 9561,
      "boxV;": 9553,
      "boxVH;": 9580,
      "boxVL;": 9571,
      "boxVR;": 9568,
      "boxVh;": 9579,
      "boxVl;": 9570,
      "boxVr;": 9567,
      "boxbox;": 10697,
      "boxdL;": 9557,
      "boxdR;": 9554,
      "boxdl;": 9488,
      "boxdr;": 9484,
      "boxh;": 9472,
      "boxhD;": 9573,
      "boxhU;": 9576,
      "boxhd;": 9516,
      "boxhu;": 9524,
      "boxminus;": 8863,
      "boxplus;": 8862,
      "boxtimes;": 8864,
      "boxuL;": 9563,
      "boxuR;": 9560,
      "boxul;": 9496,
      "boxur;": 9492,
      "boxv;": 9474,
      "boxvH;": 9578,
      "boxvL;": 9569,
      "boxvR;": 9566,
      "boxvh;": 9532,
      "boxvl;": 9508,
      "boxvr;": 9500,
      "bprime;": 8245,
      "breve;": 728,
      brvbar: 166,
      "brvbar;": 166,
      "bscr;": [55349, 56503],
      "bsemi;": 8271,
      "bsim;": 8765,
      "bsime;": 8909,
      "bsol;": 92,
      "bsolb;": 10693,
      "bsolhsub;": 10184,
      "bull;": 8226,
      "bullet;": 8226,
      "bump;": 8782,
      "bumpE;": 10926,
      "bumpe;": 8783,
      "bumpeq;": 8783,
      "cacute;": 263,
      "cap;": 8745,
      "capand;": 10820,
      "capbrcup;": 10825,
      "capcap;": 10827,
      "capcup;": 10823,
      "capdot;": 10816,
      "caps;": [8745, 65024],
      "caret;": 8257,
      "caron;": 711,
      "ccaps;": 10829,
      "ccaron;": 269,
      ccedil: 231,
      "ccedil;": 231,
      "ccirc;": 265,
      "ccups;": 10828,
      "ccupssm;": 10832,
      "cdot;": 267,
      cedil: 184,
      "cedil;": 184,
      "cemptyv;": 10674,
      cent: 162,
      "cent;": 162,
      "centerdot;": 183,
      "cfr;": [55349, 56608],
      "chcy;": 1095,
      "check;": 10003,
      "checkmark;": 10003,
      "chi;": 967,
      "cir;": 9675,
      "cirE;": 10691,
      "circ;": 710,
      "circeq;": 8791,
      "circlearrowleft;": 8634,
      "circlearrowright;": 8635,
      "circledR;": 174,
      "circledS;": 9416,
      "circledast;": 8859,
      "circledcirc;": 8858,
      "circleddash;": 8861,
      "cire;": 8791,
      "cirfnint;": 10768,
      "cirmid;": 10991,
      "cirscir;": 10690,
      "clubs;": 9827,
      "clubsuit;": 9827,
      "colon;": 58,
      "colone;": 8788,
      "coloneq;": 8788,
      "comma;": 44,
      "commat;": 64,
      "comp;": 8705,
      "compfn;": 8728,
      "complement;": 8705,
      "complexes;": 8450,
      "cong;": 8773,
      "congdot;": 10861,
      "conint;": 8750,
      "copf;": [55349, 56660],
      "coprod;": 8720,
      copy: 169,
      "copy;": 169,
      "copysr;": 8471,
      "crarr;": 8629,
      "cross;": 10007,
      "cscr;": [55349, 56504],
      "csub;": 10959,
      "csube;": 10961,
      "csup;": 10960,
      "csupe;": 10962,
      "ctdot;": 8943,
      "cudarrl;": 10552,
      "cudarrr;": 10549,
      "cuepr;": 8926,
      "cuesc;": 8927,
      "cularr;": 8630,
      "cularrp;": 10557,
      "cup;": 8746,
      "cupbrcap;": 10824,
      "cupcap;": 10822,
      "cupcup;": 10826,
      "cupdot;": 8845,
      "cupor;": 10821,
      "cups;": [8746, 65024],
      "curarr;": 8631,
      "curarrm;": 10556,
      "curlyeqprec;": 8926,
      "curlyeqsucc;": 8927,
      "curlyvee;": 8910,
      "curlywedge;": 8911,
      curren: 164,
      "curren;": 164,
      "curvearrowleft;": 8630,
      "curvearrowright;": 8631,
      "cuvee;": 8910,
      "cuwed;": 8911,
      "cwconint;": 8754,
      "cwint;": 8753,
      "cylcty;": 9005,
      "dArr;": 8659,
      "dHar;": 10597,
      "dagger;": 8224,
      "daleth;": 8504,
      "darr;": 8595,
      "dash;": 8208,
      "dashv;": 8867,
      "dbkarow;": 10511,
      "dblac;": 733,
      "dcaron;": 271,
      "dcy;": 1076,
      "dd;": 8518,
      "ddagger;": 8225,
      "ddarr;": 8650,
      "ddotseq;": 10871,
      deg: 176,
      "deg;": 176,
      "delta;": 948,
      "demptyv;": 10673,
      "dfisht;": 10623,
      "dfr;": [55349, 56609],
      "dharl;": 8643,
      "dharr;": 8642,
      "diam;": 8900,
      "diamond;": 8900,
      "diamondsuit;": 9830,
      "diams;": 9830,
      "die;": 168,
      "digamma;": 989,
      "disin;": 8946,
      "div;": 247,
      divide: 247,
      "divide;": 247,
      "divideontimes;": 8903,
      "divonx;": 8903,
      "djcy;": 1106,
      "dlcorn;": 8990,
      "dlcrop;": 8973,
      "dollar;": 36,
      "dopf;": [55349, 56661],
      "dot;": 729,
      "doteq;": 8784,
      "doteqdot;": 8785,
      "dotminus;": 8760,
      "dotplus;": 8724,
      "dotsquare;": 8865,
      "doublebarwedge;": 8966,
      "downarrow;": 8595,
      "downdownarrows;": 8650,
      "downharpoonleft;": 8643,
      "downharpoonright;": 8642,
      "drbkarow;": 10512,
      "drcorn;": 8991,
      "drcrop;": 8972,
      "dscr;": [55349, 56505],
      "dscy;": 1109,
      "dsol;": 10742,
      "dstrok;": 273,
      "dtdot;": 8945,
      "dtri;": 9663,
      "dtrif;": 9662,
      "duarr;": 8693,
      "duhar;": 10607,
      "dwangle;": 10662,
      "dzcy;": 1119,
      "dzigrarr;": 10239,
      "eDDot;": 10871,
      "eDot;": 8785,
      eacute: 233,
      "eacute;": 233,
      "easter;": 10862,
      "ecaron;": 283,
      "ecir;": 8790,
      ecirc: 234,
      "ecirc;": 234,
      "ecolon;": 8789,
      "ecy;": 1101,
      "edot;": 279,
      "ee;": 8519,
      "efDot;": 8786,
      "efr;": [55349, 56610],
      "eg;": 10906,
      egrave: 232,
      "egrave;": 232,
      "egs;": 10902,
      "egsdot;": 10904,
      "el;": 10905,
      "elinters;": 9191,
      "ell;": 8467,
      "els;": 10901,
      "elsdot;": 10903,
      "emacr;": 275,
      "empty;": 8709,
      "emptyset;": 8709,
      "emptyv;": 8709,
      "emsp13;": 8196,
      "emsp14;": 8197,
      "emsp;": 8195,
      "eng;": 331,
      "ensp;": 8194,
      "eogon;": 281,
      "eopf;": [55349, 56662],
      "epar;": 8917,
      "eparsl;": 10723,
      "eplus;": 10865,
      "epsi;": 949,
      "epsilon;": 949,
      "epsiv;": 1013,
      "eqcirc;": 8790,
      "eqcolon;": 8789,
      "eqsim;": 8770,
      "eqslantgtr;": 10902,
      "eqslantless;": 10901,
      "equals;": 61,
      "equest;": 8799,
      "equiv;": 8801,
      "equivDD;": 10872,
      "eqvparsl;": 10725,
      "erDot;": 8787,
      "erarr;": 10609,
      "escr;": 8495,
      "esdot;": 8784,
      "esim;": 8770,
      "eta;": 951,
      eth: 240,
      "eth;": 240,
      euml: 235,
      "euml;": 235,
      "euro;": 8364,
      "excl;": 33,
      "exist;": 8707,
      "expectation;": 8496,
      "exponentiale;": 8519,
      "fallingdotseq;": 8786,
      "fcy;": 1092,
      "female;": 9792,
      "ffilig;": 64259,
      "fflig;": 64256,
      "ffllig;": 64260,
      "ffr;": [55349, 56611],
      "filig;": 64257,
      "fjlig;": [102, 106],
      "flat;": 9837,
      "fllig;": 64258,
      "fltns;": 9649,
      "fnof;": 402,
      "fopf;": [55349, 56663],
      "forall;": 8704,
      "fork;": 8916,
      "forkv;": 10969,
      "fpartint;": 10765,
      frac12: 189,
      "frac12;": 189,
      "frac13;": 8531,
      frac14: 188,
      "frac14;": 188,
      "frac15;": 8533,
      "frac16;": 8537,
      "frac18;": 8539,
      "frac23;": 8532,
      "frac25;": 8534,
      frac34: 190,
      "frac34;": 190,
      "frac35;": 8535,
      "frac38;": 8540,
      "frac45;": 8536,
      "frac56;": 8538,
      "frac58;": 8541,
      "frac78;": 8542,
      "frasl;": 8260,
      "frown;": 8994,
      "fscr;": [55349, 56507],
      "gE;": 8807,
      "gEl;": 10892,
      "gacute;": 501,
      "gamma;": 947,
      "gammad;": 989,
      "gap;": 10886,
      "gbreve;": 287,
      "gcirc;": 285,
      "gcy;": 1075,
      "gdot;": 289,
      "ge;": 8805,
      "gel;": 8923,
      "geq;": 8805,
      "geqq;": 8807,
      "geqslant;": 10878,
      "ges;": 10878,
      "gescc;": 10921,
      "gesdot;": 10880,
      "gesdoto;": 10882,
      "gesdotol;": 10884,
      "gesl;": [8923, 65024],
      "gesles;": 10900,
      "gfr;": [55349, 56612],
      "gg;": 8811,
      "ggg;": 8921,
      "gimel;": 8503,
      "gjcy;": 1107,
      "gl;": 8823,
      "glE;": 10898,
      "gla;": 10917,
      "glj;": 10916,
      "gnE;": 8809,
      "gnap;": 10890,
      "gnapprox;": 10890,
      "gne;": 10888,
      "gneq;": 10888,
      "gneqq;": 8809,
      "gnsim;": 8935,
      "gopf;": [55349, 56664],
      "grave;": 96,
      "gscr;": 8458,
      "gsim;": 8819,
      "gsime;": 10894,
      "gsiml;": 10896,
      gt: 62,
      "gt;": 62,
      "gtcc;": 10919,
      "gtcir;": 10874,
      "gtdot;": 8919,
      "gtlPar;": 10645,
      "gtquest;": 10876,
      "gtrapprox;": 10886,
      "gtrarr;": 10616,
      "gtrdot;": 8919,
      "gtreqless;": 8923,
      "gtreqqless;": 10892,
      "gtrless;": 8823,
      "gtrsim;": 8819,
      "gvertneqq;": [8809, 65024],
      "gvnE;": [8809, 65024],
      "hArr;": 8660,
      "hairsp;": 8202,
      "half;": 189,
      "hamilt;": 8459,
      "hardcy;": 1098,
      "harr;": 8596,
      "harrcir;": 10568,
      "harrw;": 8621,
      "hbar;": 8463,
      "hcirc;": 293,
      "hearts;": 9829,
      "heartsuit;": 9829,
      "hellip;": 8230,
      "hercon;": 8889,
      "hfr;": [55349, 56613],
      "hksearow;": 10533,
      "hkswarow;": 10534,
      "hoarr;": 8703,
      "homtht;": 8763,
      "hookleftarrow;": 8617,
      "hookrightarrow;": 8618,
      "hopf;": [55349, 56665],
      "horbar;": 8213,
      "hscr;": [55349, 56509],
      "hslash;": 8463,
      "hstrok;": 295,
      "hybull;": 8259,
      "hyphen;": 8208,
      iacute: 237,
      "iacute;": 237,
      "ic;": 8291,
      icirc: 238,
      "icirc;": 238,
      "icy;": 1080,
      "iecy;": 1077,
      iexcl: 161,
      "iexcl;": 161,
      "iff;": 8660,
      "ifr;": [55349, 56614],
      igrave: 236,
      "igrave;": 236,
      "ii;": 8520,
      "iiiint;": 10764,
      "iiint;": 8749,
      "iinfin;": 10716,
      "iiota;": 8489,
      "ijlig;": 307,
      "imacr;": 299,
      "image;": 8465,
      "imagline;": 8464,
      "imagpart;": 8465,
      "imath;": 305,
      "imof;": 8887,
      "imped;": 437,
      "in;": 8712,
      "incare;": 8453,
      "infin;": 8734,
      "infintie;": 10717,
      "inodot;": 305,
      "int;": 8747,
      "intcal;": 8890,
      "integers;": 8484,
      "intercal;": 8890,
      "intlarhk;": 10775,
      "intprod;": 10812,
      "iocy;": 1105,
      "iogon;": 303,
      "iopf;": [55349, 56666],
      "iota;": 953,
      "iprod;": 10812,
      iquest: 191,
      "iquest;": 191,
      "iscr;": [55349, 56510],
      "isin;": 8712,
      "isinE;": 8953,
      "isindot;": 8949,
      "isins;": 8948,
      "isinsv;": 8947,
      "isinv;": 8712,
      "it;": 8290,
      "itilde;": 297,
      "iukcy;": 1110,
      iuml: 239,
      "iuml;": 239,
      "jcirc;": 309,
      "jcy;": 1081,
      "jfr;": [55349, 56615],
      "jmath;": 567,
      "jopf;": [55349, 56667],
      "jscr;": [55349, 56511],
      "jsercy;": 1112,
      "jukcy;": 1108,
      "kappa;": 954,
      "kappav;": 1008,
      "kcedil;": 311,
      "kcy;": 1082,
      "kfr;": [55349, 56616],
      "kgreen;": 312,
      "khcy;": 1093,
      "kjcy;": 1116,
      "kopf;": [55349, 56668],
      "kscr;": [55349, 56512],
      "lAarr;": 8666,
      "lArr;": 8656,
      "lAtail;": 10523,
      "lBarr;": 10510,
      "lE;": 8806,
      "lEg;": 10891,
      "lHar;": 10594,
      "lacute;": 314,
      "laemptyv;": 10676,
      "lagran;": 8466,
      "lambda;": 955,
      "lang;": 10216,
      "langd;": 10641,
      "langle;": 10216,
      "lap;": 10885,
      laquo: 171,
      "laquo;": 171,
      "larr;": 8592,
      "larrb;": 8676,
      "larrbfs;": 10527,
      "larrfs;": 10525,
      "larrhk;": 8617,
      "larrlp;": 8619,
      "larrpl;": 10553,
      "larrsim;": 10611,
      "larrtl;": 8610,
      "lat;": 10923,
      "latail;": 10521,
      "late;": 10925,
      "lates;": [10925, 65024],
      "lbarr;": 10508,
      "lbbrk;": 10098,
      "lbrace;": 123,
      "lbrack;": 91,
      "lbrke;": 10635,
      "lbrksld;": 10639,
      "lbrkslu;": 10637,
      "lcaron;": 318,
      "lcedil;": 316,
      "lceil;": 8968,
      "lcub;": 123,
      "lcy;": 1083,
      "ldca;": 10550,
      "ldquo;": 8220,
      "ldquor;": 8222,
      "ldrdhar;": 10599,
      "ldrushar;": 10571,
      "ldsh;": 8626,
      "le;": 8804,
      "leftarrow;": 8592,
      "leftarrowtail;": 8610,
      "leftharpoondown;": 8637,
      "leftharpoonup;": 8636,
      "leftleftarrows;": 8647,
      "leftrightarrow;": 8596,
      "leftrightarrows;": 8646,
      "leftrightharpoons;": 8651,
      "leftrightsquigarrow;": 8621,
      "leftthreetimes;": 8907,
      "leg;": 8922,
      "leq;": 8804,
      "leqq;": 8806,
      "leqslant;": 10877,
      "les;": 10877,
      "lescc;": 10920,
      "lesdot;": 10879,
      "lesdoto;": 10881,
      "lesdotor;": 10883,
      "lesg;": [8922, 65024],
      "lesges;": 10899,
      "lessapprox;": 10885,
      "lessdot;": 8918,
      "lesseqgtr;": 8922,
      "lesseqqgtr;": 10891,
      "lessgtr;": 8822,
      "lesssim;": 8818,
      "lfisht;": 10620,
      "lfloor;": 8970,
      "lfr;": [55349, 56617],
      "lg;": 8822,
      "lgE;": 10897,
      "lhard;": 8637,
      "lharu;": 8636,
      "lharul;": 10602,
      "lhblk;": 9604,
      "ljcy;": 1113,
      "ll;": 8810,
      "llarr;": 8647,
      "llcorner;": 8990,
      "llhard;": 10603,
      "lltri;": 9722,
      "lmidot;": 320,
      "lmoust;": 9136,
      "lmoustache;": 9136,
      "lnE;": 8808,
      "lnap;": 10889,
      "lnapprox;": 10889,
      "lne;": 10887,
      "lneq;": 10887,
      "lneqq;": 8808,
      "lnsim;": 8934,
      "loang;": 10220,
      "loarr;": 8701,
      "lobrk;": 10214,
      "longleftarrow;": 10229,
      "longleftrightarrow;": 10231,
      "longmapsto;": 10236,
      "longrightarrow;": 10230,
      "looparrowleft;": 8619,
      "looparrowright;": 8620,
      "lopar;": 10629,
      "lopf;": [55349, 56669],
      "loplus;": 10797,
      "lotimes;": 10804,
      "lowast;": 8727,
      "lowbar;": 95,
      "loz;": 9674,
      "lozenge;": 9674,
      "lozf;": 10731,
      "lpar;": 40,
      "lparlt;": 10643,
      "lrarr;": 8646,
      "lrcorner;": 8991,
      "lrhar;": 8651,
      "lrhard;": 10605,
      "lrm;": 8206,
      "lrtri;": 8895,
      "lsaquo;": 8249,
      "lscr;": [55349, 56513],
      "lsh;": 8624,
      "lsim;": 8818,
      "lsime;": 10893,
      "lsimg;": 10895,
      "lsqb;": 91,
      "lsquo;": 8216,
      "lsquor;": 8218,
      "lstrok;": 322,
      lt: 60,
      "lt;": 60,
      "ltcc;": 10918,
      "ltcir;": 10873,
      "ltdot;": 8918,
      "lthree;": 8907,
      "ltimes;": 8905,
      "ltlarr;": 10614,
      "ltquest;": 10875,
      "ltrPar;": 10646,
      "ltri;": 9667,
      "ltrie;": 8884,
      "ltrif;": 9666,
      "lurdshar;": 10570,
      "luruhar;": 10598,
      "lvertneqq;": [8808, 65024],
      "lvnE;": [8808, 65024],
      "mDDot;": 8762,
      macr: 175,
      "macr;": 175,
      "male;": 9794,
      "malt;": 10016,
      "maltese;": 10016,
      "map;": 8614,
      "mapsto;": 8614,
      "mapstodown;": 8615,
      "mapstoleft;": 8612,
      "mapstoup;": 8613,
      "marker;": 9646,
      "mcomma;": 10793,
      "mcy;": 1084,
      "mdash;": 8212,
      "measuredangle;": 8737,
      "mfr;": [55349, 56618],
      "mho;": 8487,
      micro: 181,
      "micro;": 181,
      "mid;": 8739,
      "midast;": 42,
      "midcir;": 10992,
      middot: 183,
      "middot;": 183,
      "minus;": 8722,
      "minusb;": 8863,
      "minusd;": 8760,
      "minusdu;": 10794,
      "mlcp;": 10971,
      "mldr;": 8230,
      "mnplus;": 8723,
      "models;": 8871,
      "mopf;": [55349, 56670],
      "mp;": 8723,
      "mscr;": [55349, 56514],
      "mstpos;": 8766,
      "mu;": 956,
      "multimap;": 8888,
      "mumap;": 8888,
      "nGg;": [8921, 824],
      "nGt;": [8811, 8402],
      "nGtv;": [8811, 824],
      "nLeftarrow;": 8653,
      "nLeftrightarrow;": 8654,
      "nLl;": [8920, 824],
      "nLt;": [8810, 8402],
      "nLtv;": [8810, 824],
      "nRightarrow;": 8655,
      "nVDash;": 8879,
      "nVdash;": 8878,
      "nabla;": 8711,
      "nacute;": 324,
      "nang;": [8736, 8402],
      "nap;": 8777,
      "napE;": [10864, 824],
      "napid;": [8779, 824],
      "napos;": 329,
      "napprox;": 8777,
      "natur;": 9838,
      "natural;": 9838,
      "naturals;": 8469,
      nbsp: 160,
      "nbsp;": 160,
      "nbump;": [8782, 824],
      "nbumpe;": [8783, 824],
      "ncap;": 10819,
      "ncaron;": 328,
      "ncedil;": 326,
      "ncong;": 8775,
      "ncongdot;": [10861, 824],
      "ncup;": 10818,
      "ncy;": 1085,
      "ndash;": 8211,
      "ne;": 8800,
      "neArr;": 8663,
      "nearhk;": 10532,
      "nearr;": 8599,
      "nearrow;": 8599,
      "nedot;": [8784, 824],
      "nequiv;": 8802,
      "nesear;": 10536,
      "nesim;": [8770, 824],
      "nexist;": 8708,
      "nexists;": 8708,
      "nfr;": [55349, 56619],
      "ngE;": [8807, 824],
      "nge;": 8817,
      "ngeq;": 8817,
      "ngeqq;": [8807, 824],
      "ngeqslant;": [10878, 824],
      "nges;": [10878, 824],
      "ngsim;": 8821,
      "ngt;": 8815,
      "ngtr;": 8815,
      "nhArr;": 8654,
      "nharr;": 8622,
      "nhpar;": 10994,
      "ni;": 8715,
      "nis;": 8956,
      "nisd;": 8954,
      "niv;": 8715,
      "njcy;": 1114,
      "nlArr;": 8653,
      "nlE;": [8806, 824],
      "nlarr;": 8602,
      "nldr;": 8229,
      "nle;": 8816,
      "nleftarrow;": 8602,
      "nleftrightarrow;": 8622,
      "nleq;": 8816,
      "nleqq;": [8806, 824],
      "nleqslant;": [10877, 824],
      "nles;": [10877, 824],
      "nless;": 8814,
      "nlsim;": 8820,
      "nlt;": 8814,
      "nltri;": 8938,
      "nltrie;": 8940,
      "nmid;": 8740,
      "nopf;": [55349, 56671],
      not: 172,
      "not;": 172,
      "notin;": 8713,
      "notinE;": [8953, 824],
      "notindot;": [8949, 824],
      "notinva;": 8713,
      "notinvb;": 8951,
      "notinvc;": 8950,
      "notni;": 8716,
      "notniva;": 8716,
      "notnivb;": 8958,
      "notnivc;": 8957,
      "npar;": 8742,
      "nparallel;": 8742,
      "nparsl;": [11005, 8421],
      "npart;": [8706, 824],
      "npolint;": 10772,
      "npr;": 8832,
      "nprcue;": 8928,
      "npre;": [10927, 824],
      "nprec;": 8832,
      "npreceq;": [10927, 824],
      "nrArr;": 8655,
      "nrarr;": 8603,
      "nrarrc;": [10547, 824],
      "nrarrw;": [8605, 824],
      "nrightarrow;": 8603,
      "nrtri;": 8939,
      "nrtrie;": 8941,
      "nsc;": 8833,
      "nsccue;": 8929,
      "nsce;": [10928, 824],
      "nscr;": [55349, 56515],
      "nshortmid;": 8740,
      "nshortparallel;": 8742,
      "nsim;": 8769,
      "nsime;": 8772,
      "nsimeq;": 8772,
      "nsmid;": 8740,
      "nspar;": 8742,
      "nsqsube;": 8930,
      "nsqsupe;": 8931,
      "nsub;": 8836,
      "nsubE;": [10949, 824],
      "nsube;": 8840,
      "nsubset;": [8834, 8402],
      "nsubseteq;": 8840,
      "nsubseteqq;": [10949, 824],
      "nsucc;": 8833,
      "nsucceq;": [10928, 824],
      "nsup;": 8837,
      "nsupE;": [10950, 824],
      "nsupe;": 8841,
      "nsupset;": [8835, 8402],
      "nsupseteq;": 8841,
      "nsupseteqq;": [10950, 824],
      "ntgl;": 8825,
      ntilde: 241,
      "ntilde;": 241,
      "ntlg;": 8824,
      "ntriangleleft;": 8938,
      "ntrianglelefteq;": 8940,
      "ntriangleright;": 8939,
      "ntrianglerighteq;": 8941,
      "nu;": 957,
      "num;": 35,
      "numero;": 8470,
      "numsp;": 8199,
      "nvDash;": 8877,
      "nvHarr;": 10500,
      "nvap;": [8781, 8402],
      "nvdash;": 8876,
      "nvge;": [8805, 8402],
      "nvgt;": [62, 8402],
      "nvinfin;": 10718,
      "nvlArr;": 10498,
      "nvle;": [8804, 8402],
      "nvlt;": [60, 8402],
      "nvltrie;": [8884, 8402],
      "nvrArr;": 10499,
      "nvrtrie;": [8885, 8402],
      "nvsim;": [8764, 8402],
      "nwArr;": 8662,
      "nwarhk;": 10531,
      "nwarr;": 8598,
      "nwarrow;": 8598,
      "nwnear;": 10535,
      "oS;": 9416,
      oacute: 243,
      "oacute;": 243,
      "oast;": 8859,
      "ocir;": 8858,
      ocirc: 244,
      "ocirc;": 244,
      "ocy;": 1086,
      "odash;": 8861,
      "odblac;": 337,
      "odiv;": 10808,
      "odot;": 8857,
      "odsold;": 10684,
      "oelig;": 339,
      "ofcir;": 10687,
      "ofr;": [55349, 56620],
      "ogon;": 731,
      ograve: 242,
      "ograve;": 242,
      "ogt;": 10689,
      "ohbar;": 10677,
      "ohm;": 937,
      "oint;": 8750,
      "olarr;": 8634,
      "olcir;": 10686,
      "olcross;": 10683,
      "oline;": 8254,
      "olt;": 10688,
      "omacr;": 333,
      "omega;": 969,
      "omicron;": 959,
      "omid;": 10678,
      "ominus;": 8854,
      "oopf;": [55349, 56672],
      "opar;": 10679,
      "operp;": 10681,
      "oplus;": 8853,
      "or;": 8744,
      "orarr;": 8635,
      "ord;": 10845,
      "order;": 8500,
      "orderof;": 8500,
      ordf: 170,
      "ordf;": 170,
      ordm: 186,
      "ordm;": 186,
      "origof;": 8886,
      "oror;": 10838,
      "orslope;": 10839,
      "orv;": 10843,
      "oscr;": 8500,
      oslash: 248,
      "oslash;": 248,
      "osol;": 8856,
      otilde: 245,
      "otilde;": 245,
      "otimes;": 8855,
      "otimesas;": 10806,
      ouml: 246,
      "ouml;": 246,
      "ovbar;": 9021,
      "par;": 8741,
      para: 182,
      "para;": 182,
      "parallel;": 8741,
      "parsim;": 10995,
      "parsl;": 11005,
      "part;": 8706,
      "pcy;": 1087,
      "percnt;": 37,
      "period;": 46,
      "permil;": 8240,
      "perp;": 8869,
      "pertenk;": 8241,
      "pfr;": [55349, 56621],
      "phi;": 966,
      "phiv;": 981,
      "phmmat;": 8499,
      "phone;": 9742,
      "pi;": 960,
      "pitchfork;": 8916,
      "piv;": 982,
      "planck;": 8463,
      "planckh;": 8462,
      "plankv;": 8463,
      "plus;": 43,
      "plusacir;": 10787,
      "plusb;": 8862,
      "pluscir;": 10786,
      "plusdo;": 8724,
      "plusdu;": 10789,
      "pluse;": 10866,
      plusmn: 177,
      "plusmn;": 177,
      "plussim;": 10790,
      "plustwo;": 10791,
      "pm;": 177,
      "pointint;": 10773,
      "popf;": [55349, 56673],
      pound: 163,
      "pound;": 163,
      "pr;": 8826,
      "prE;": 10931,
      "prap;": 10935,
      "prcue;": 8828,
      "pre;": 10927,
      "prec;": 8826,
      "precapprox;": 10935,
      "preccurlyeq;": 8828,
      "preceq;": 10927,
      "precnapprox;": 10937,
      "precneqq;": 10933,
      "precnsim;": 8936,
      "precsim;": 8830,
      "prime;": 8242,
      "primes;": 8473,
      "prnE;": 10933,
      "prnap;": 10937,
      "prnsim;": 8936,
      "prod;": 8719,
      "profalar;": 9006,
      "profline;": 8978,
      "profsurf;": 8979,
      "prop;": 8733,
      "propto;": 8733,
      "prsim;": 8830,
      "prurel;": 8880,
      "pscr;": [55349, 56517],
      "psi;": 968,
      "puncsp;": 8200,
      "qfr;": [55349, 56622],
      "qint;": 10764,
      "qopf;": [55349, 56674],
      "qprime;": 8279,
      "qscr;": [55349, 56518],
      "quaternions;": 8461,
      "quatint;": 10774,
      "quest;": 63,
      "questeq;": 8799,
      quot: 34,
      "quot;": 34,
      "rAarr;": 8667,
      "rArr;": 8658,
      "rAtail;": 10524,
      "rBarr;": 10511,
      "rHar;": 10596,
      "race;": [8765, 817],
      "racute;": 341,
      "radic;": 8730,
      "raemptyv;": 10675,
      "rang;": 10217,
      "rangd;": 10642,
      "range;": 10661,
      "rangle;": 10217,
      raquo: 187,
      "raquo;": 187,
      "rarr;": 8594,
      "rarrap;": 10613,
      "rarrb;": 8677,
      "rarrbfs;": 10528,
      "rarrc;": 10547,
      "rarrfs;": 10526,
      "rarrhk;": 8618,
      "rarrlp;": 8620,
      "rarrpl;": 10565,
      "rarrsim;": 10612,
      "rarrtl;": 8611,
      "rarrw;": 8605,
      "ratail;": 10522,
      "ratio;": 8758,
      "rationals;": 8474,
      "rbarr;": 10509,
      "rbbrk;": 10099,
      "rbrace;": 125,
      "rbrack;": 93,
      "rbrke;": 10636,
      "rbrksld;": 10638,
      "rbrkslu;": 10640,
      "rcaron;": 345,
      "rcedil;": 343,
      "rceil;": 8969,
      "rcub;": 125,
      "rcy;": 1088,
      "rdca;": 10551,
      "rdldhar;": 10601,
      "rdquo;": 8221,
      "rdquor;": 8221,
      "rdsh;": 8627,
      "real;": 8476,
      "realine;": 8475,
      "realpart;": 8476,
      "reals;": 8477,
      "rect;": 9645,
      reg: 174,
      "reg;": 174,
      "rfisht;": 10621,
      "rfloor;": 8971,
      "rfr;": [55349, 56623],
      "rhard;": 8641,
      "rharu;": 8640,
      "rharul;": 10604,
      "rho;": 961,
      "rhov;": 1009,
      "rightarrow;": 8594,
      "rightarrowtail;": 8611,
      "rightharpoondown;": 8641,
      "rightharpoonup;": 8640,
      "rightleftarrows;": 8644,
      "rightleftharpoons;": 8652,
      "rightrightarrows;": 8649,
      "rightsquigarrow;": 8605,
      "rightthreetimes;": 8908,
      "ring;": 730,
      "risingdotseq;": 8787,
      "rlarr;": 8644,
      "rlhar;": 8652,
      "rlm;": 8207,
      "rmoust;": 9137,
      "rmoustache;": 9137,
      "rnmid;": 10990,
      "roang;": 10221,
      "roarr;": 8702,
      "robrk;": 10215,
      "ropar;": 10630,
      "ropf;": [55349, 56675],
      "roplus;": 10798,
      "rotimes;": 10805,
      "rpar;": 41,
      "rpargt;": 10644,
      "rppolint;": 10770,
      "rrarr;": 8649,
      "rsaquo;": 8250,
      "rscr;": [55349, 56519],
      "rsh;": 8625,
      "rsqb;": 93,
      "rsquo;": 8217,
      "rsquor;": 8217,
      "rthree;": 8908,
      "rtimes;": 8906,
      "rtri;": 9657,
      "rtrie;": 8885,
      "rtrif;": 9656,
      "rtriltri;": 10702,
      "ruluhar;": 10600,
      "rx;": 8478,
      "sacute;": 347,
      "sbquo;": 8218,
      "sc;": 8827,
      "scE;": 10932,
      "scap;": 10936,
      "scaron;": 353,
      "sccue;": 8829,
      "sce;": 10928,
      "scedil;": 351,
      "scirc;": 349,
      "scnE;": 10934,
      "scnap;": 10938,
      "scnsim;": 8937,
      "scpolint;": 10771,
      "scsim;": 8831,
      "scy;": 1089,
      "sdot;": 8901,
      "sdotb;": 8865,
      "sdote;": 10854,
      "seArr;": 8664,
      "searhk;": 10533,
      "searr;": 8600,
      "searrow;": 8600,
      sect: 167,
      "sect;": 167,
      "semi;": 59,
      "seswar;": 10537,
      "setminus;": 8726,
      "setmn;": 8726,
      "sext;": 10038,
      "sfr;": [55349, 56624],
      "sfrown;": 8994,
      "sharp;": 9839,
      "shchcy;": 1097,
      "shcy;": 1096,
      "shortmid;": 8739,
      "shortparallel;": 8741,
      shy: 173,
      "shy;": 173,
      "sigma;": 963,
      "sigmaf;": 962,
      "sigmav;": 962,
      "sim;": 8764,
      "simdot;": 10858,
      "sime;": 8771,
      "simeq;": 8771,
      "simg;": 10910,
      "simgE;": 10912,
      "siml;": 10909,
      "simlE;": 10911,
      "simne;": 8774,
      "simplus;": 10788,
      "simrarr;": 10610,
      "slarr;": 8592,
      "smallsetminus;": 8726,
      "smashp;": 10803,
      "smeparsl;": 10724,
      "smid;": 8739,
      "smile;": 8995,
      "smt;": 10922,
      "smte;": 10924,
      "smtes;": [10924, 65024],
      "softcy;": 1100,
      "sol;": 47,
      "solb;": 10692,
      "solbar;": 9023,
      "sopf;": [55349, 56676],
      "spades;": 9824,
      "spadesuit;": 9824,
      "spar;": 8741,
      "sqcap;": 8851,
      "sqcaps;": [8851, 65024],
      "sqcup;": 8852,
      "sqcups;": [8852, 65024],
      "sqsub;": 8847,
      "sqsube;": 8849,
      "sqsubset;": 8847,
      "sqsubseteq;": 8849,
      "sqsup;": 8848,
      "sqsupe;": 8850,
      "sqsupset;": 8848,
      "sqsupseteq;": 8850,
      "squ;": 9633,
      "square;": 9633,
      "squarf;": 9642,
      "squf;": 9642,
      "srarr;": 8594,
      "sscr;": [55349, 56520],
      "ssetmn;": 8726,
      "ssmile;": 8995,
      "sstarf;": 8902,
      "star;": 9734,
      "starf;": 9733,
      "straightepsilon;": 1013,
      "straightphi;": 981,
      "strns;": 175,
      "sub;": 8834,
      "subE;": 10949,
      "subdot;": 10941,
      "sube;": 8838,
      "subedot;": 10947,
      "submult;": 10945,
      "subnE;": 10955,
      "subne;": 8842,
      "subplus;": 10943,
      "subrarr;": 10617,
      "subset;": 8834,
      "subseteq;": 8838,
      "subseteqq;": 10949,
      "subsetneq;": 8842,
      "subsetneqq;": 10955,
      "subsim;": 10951,
      "subsub;": 10965,
      "subsup;": 10963,
      "succ;": 8827,
      "succapprox;": 10936,
      "succcurlyeq;": 8829,
      "succeq;": 10928,
      "succnapprox;": 10938,
      "succneqq;": 10934,
      "succnsim;": 8937,
      "succsim;": 8831,
      "sum;": 8721,
      "sung;": 9834,
      sup1: 185,
      "sup1;": 185,
      sup2: 178,
      "sup2;": 178,
      sup3: 179,
      "sup3;": 179,
      "sup;": 8835,
      "supE;": 10950,
      "supdot;": 10942,
      "supdsub;": 10968,
      "supe;": 8839,
      "supedot;": 10948,
      "suphsol;": 10185,
      "suphsub;": 10967,
      "suplarr;": 10619,
      "supmult;": 10946,
      "supnE;": 10956,
      "supne;": 8843,
      "supplus;": 10944,
      "supset;": 8835,
      "supseteq;": 8839,
      "supseteqq;": 10950,
      "supsetneq;": 8843,
      "supsetneqq;": 10956,
      "supsim;": 10952,
      "supsub;": 10964,
      "supsup;": 10966,
      "swArr;": 8665,
      "swarhk;": 10534,
      "swarr;": 8601,
      "swarrow;": 8601,
      "swnwar;": 10538,
      szlig: 223,
      "szlig;": 223,
      "target;": 8982,
      "tau;": 964,
      "tbrk;": 9140,
      "tcaron;": 357,
      "tcedil;": 355,
      "tcy;": 1090,
      "tdot;": 8411,
      "telrec;": 8981,
      "tfr;": [55349, 56625],
      "there4;": 8756,
      "therefore;": 8756,
      "theta;": 952,
      "thetasym;": 977,
      "thetav;": 977,
      "thickapprox;": 8776,
      "thicksim;": 8764,
      "thinsp;": 8201,
      "thkap;": 8776,
      "thksim;": 8764,
      thorn: 254,
      "thorn;": 254,
      "tilde;": 732,
      times: 215,
      "times;": 215,
      "timesb;": 8864,
      "timesbar;": 10801,
      "timesd;": 10800,
      "tint;": 8749,
      "toea;": 10536,
      "top;": 8868,
      "topbot;": 9014,
      "topcir;": 10993,
      "topf;": [55349, 56677],
      "topfork;": 10970,
      "tosa;": 10537,
      "tprime;": 8244,
      "trade;": 8482,
      "triangle;": 9653,
      "triangledown;": 9663,
      "triangleleft;": 9667,
      "trianglelefteq;": 8884,
      "triangleq;": 8796,
      "triangleright;": 9657,
      "trianglerighteq;": 8885,
      "tridot;": 9708,
      "trie;": 8796,
      "triminus;": 10810,
      "triplus;": 10809,
      "trisb;": 10701,
      "tritime;": 10811,
      "trpezium;": 9186,
      "tscr;": [55349, 56521],
      "tscy;": 1094,
      "tshcy;": 1115,
      "tstrok;": 359,
      "twixt;": 8812,
      "twoheadleftarrow;": 8606,
      "twoheadrightarrow;": 8608,
      "uArr;": 8657,
      "uHar;": 10595,
      uacute: 250,
      "uacute;": 250,
      "uarr;": 8593,
      "ubrcy;": 1118,
      "ubreve;": 365,
      ucirc: 251,
      "ucirc;": 251,
      "ucy;": 1091,
      "udarr;": 8645,
      "udblac;": 369,
      "udhar;": 10606,
      "ufisht;": 10622,
      "ufr;": [55349, 56626],
      ugrave: 249,
      "ugrave;": 249,
      "uharl;": 8639,
      "uharr;": 8638,
      "uhblk;": 9600,
      "ulcorn;": 8988,
      "ulcorner;": 8988,
      "ulcrop;": 8975,
      "ultri;": 9720,
      "umacr;": 363,
      uml: 168,
      "uml;": 168,
      "uogon;": 371,
      "uopf;": [55349, 56678],
      "uparrow;": 8593,
      "updownarrow;": 8597,
      "upharpoonleft;": 8639,
      "upharpoonright;": 8638,
      "uplus;": 8846,
      "upsi;": 965,
      "upsih;": 978,
      "upsilon;": 965,
      "upuparrows;": 8648,
      "urcorn;": 8989,
      "urcorner;": 8989,
      "urcrop;": 8974,
      "uring;": 367,
      "urtri;": 9721,
      "uscr;": [55349, 56522],
      "utdot;": 8944,
      "utilde;": 361,
      "utri;": 9653,
      "utrif;": 9652,
      "uuarr;": 8648,
      uuml: 252,
      "uuml;": 252,
      "uwangle;": 10663,
      "vArr;": 8661,
      "vBar;": 10984,
      "vBarv;": 10985,
      "vDash;": 8872,
      "vangrt;": 10652,
      "varepsilon;": 1013,
      "varkappa;": 1008,
      "varnothing;": 8709,
      "varphi;": 981,
      "varpi;": 982,
      "varpropto;": 8733,
      "varr;": 8597,
      "varrho;": 1009,
      "varsigma;": 962,
      "varsubsetneq;": [8842, 65024],
      "varsubsetneqq;": [10955, 65024],
      "varsupsetneq;": [8843, 65024],
      "varsupsetneqq;": [10956, 65024],
      "vartheta;": 977,
      "vartriangleleft;": 8882,
      "vartriangleright;": 8883,
      "vcy;": 1074,
      "vdash;": 8866,
      "vee;": 8744,
      "veebar;": 8891,
      "veeeq;": 8794,
      "vellip;": 8942,
      "verbar;": 124,
      "vert;": 124,
      "vfr;": [55349, 56627],
      "vltri;": 8882,
      "vnsub;": [8834, 8402],
      "vnsup;": [8835, 8402],
      "vopf;": [55349, 56679],
      "vprop;": 8733,
      "vrtri;": 8883,
      "vscr;": [55349, 56523],
      "vsubnE;": [10955, 65024],
      "vsubne;": [8842, 65024],
      "vsupnE;": [10956, 65024],
      "vsupne;": [8843, 65024],
      "vzigzag;": 10650,
      "wcirc;": 373,
      "wedbar;": 10847,
      "wedge;": 8743,
      "wedgeq;": 8793,
      "weierp;": 8472,
      "wfr;": [55349, 56628],
      "wopf;": [55349, 56680],
      "wp;": 8472,
      "wr;": 8768,
      "wreath;": 8768,
      "wscr;": [55349, 56524],
      "xcap;": 8898,
      "xcirc;": 9711,
      "xcup;": 8899,
      "xdtri;": 9661,
      "xfr;": [55349, 56629],
      "xhArr;": 10234,
      "xharr;": 10231,
      "xi;": 958,
      "xlArr;": 10232,
      "xlarr;": 10229,
      "xmap;": 10236,
      "xnis;": 8955,
      "xodot;": 10752,
      "xopf;": [55349, 56681],
      "xoplus;": 10753,
      "xotime;": 10754,
      "xrArr;": 10233,
      "xrarr;": 10230,
      "xscr;": [55349, 56525],
      "xsqcup;": 10758,
      "xuplus;": 10756,
      "xutri;": 9651,
      "xvee;": 8897,
      "xwedge;": 8896,
      yacute: 253,
      "yacute;": 253,
      "yacy;": 1103,
      "ycirc;": 375,
      "ycy;": 1099,
      yen: 165,
      "yen;": 165,
      "yfr;": [55349, 56630],
      "yicy;": 1111,
      "yopf;": [55349, 56682],
      "yscr;": [55349, 56526],
      "yucy;": 1102,
      yuml: 255,
      "yuml;": 255,
      "zacute;": 378,
      "zcaron;": 382,
      "zcy;": 1079,
      "zdot;": 380,
      "zeetrf;": 8488,
      "zeta;": 950,
      "zfr;": [55349, 56631],
      "zhcy;": 1078,
      "zigrarr;": 8669,
      "zopf;": [55349, 56683],
      "zscr;": [55349, 56527],
      "zwj;": 8205,
      "zwnj;": 8204
    };
    function uH(e) {
      var t = 16384;
      if (e.length < t) {
        return String.fromCharCode.apply(String, e);
      }
      var n = "";
      for (var r = 0; r < e.length; r += t) {
        n += String.fromCharCode.apply(String, e.slice(r, r + t));
      }
      return n;
    }
    function Xxm(e) {
      var t = [];
      for (var n = 0; n < e.length; n++) {
        t[n] = e.charCodeAt(n);
      }
      return t;
    }
    function IS(e, t) {
      if (typeof t === "string") {
        return e.namespaceURI === pd.HTML && e.localName === t;
      }
      var n = t[e.namespaceURI];
      return n && n[e.localName];
    }
    function cRl(e) {
      return IS(e, SRl);
    }
    function uRl(e) {
      if (IS(e, TRl)) {
        return true;
      }
      if (e.namespaceURI === pd.MATHML && e.localName === "annotation-xml") {
        var t = e.getAttribute("encoding");
        if (t) {
          t = t.toLowerCase();
        }
        if (t === "text/html" || t === "application/xhtml+xml") {
          return true;
        }
      }
      return false;
    }
    function Qxm(e) {
      if (e in rRl) {
        return rRl[e];
      } else {
        return e;
      }
    }
    function dRl(e) {
      for (var t = 0, n = e.length; t < n; t++) {
        if (e[t][0] in nRl) {
          e[t][0] = nRl[e[t][0]];
        }
      }
    }
    function pRl(e) {
      for (var t = 0, n = e.length; t < n; t++) {
        if (e[t][0] === "definitionurl") {
          e[t][0] = "definitionURL";
          break;
        }
      }
    }
    function q1o(e) {
      for (var t = 0, n = e.length; t < n; t++) {
        if (e[t][0] in tRl) {
          e[t].push(tRl[e[t][0]]);
        }
      }
    }
    function mRl(e, t) {
      for (var n = 0, r = e.length; n < r; n++) {
        var o = e[n][0];
        var s = e[n][1];
        if (t.hasAttribute(o)) {
          continue;
        }
        t._setAttribute(o, s);
      }
    }
    v_.ElementStack = function () {
      this.elements = [];
      this.top = null;
    };
    v_.ElementStack.prototype.push = function (e) {
      this.elements.push(e);
      this.top = e;
    };
    v_.ElementStack.prototype.pop = function (e) {
      this.elements.pop();
      this.top = this.elements[this.elements.length - 1];
    };
    v_.ElementStack.prototype.popTag = function (e) {
      for (var t = this.elements.length - 1; t > 0; t--) {
        var n = this.elements[t];
        if (IS(n, e)) {
          break;
        }
      }
      this.elements.length = t;
      this.top = this.elements[t - 1];
    };
    v_.ElementStack.prototype.popElementType = function (e) {
      for (var t = this.elements.length - 1; t > 0; t--) {
        if (this.elements[t] instanceof e) {
          break;
        }
      }
      this.elements.length = t;
      this.top = this.elements[t - 1];
    };
    v_.ElementStack.prototype.popElement = function (e) {
      for (var t = this.elements.length - 1; t > 0; t--) {
        if (this.elements[t] === e) {
          break;
        }
      }
      this.elements.length = t;
      this.top = this.elements[t - 1];
    };
    v_.ElementStack.prototype.removeElement = function (e) {
      if (this.top === e) {
        this.pop();
      } else {
        var t = this.elements.lastIndexOf(e);
        if (t !== -1) {
          this.elements.splice(t, 1);
        }
      }
    };
    v_.ElementStack.prototype.clearToContext = function (e) {
      for (var t = this.elements.length - 1; t > 0; t--) {
        if (IS(this.elements[t], e)) {
          break;
        }
      }
      this.elements.length = t + 1;
      this.top = this.elements[t];
    };
    v_.ElementStack.prototype.contains = function (e) {
      return this.inSpecificScope(e, Object.create(null));
    };
    v_.ElementStack.prototype.inSpecificScope = function (e, t) {
      for (var n = this.elements.length - 1; n >= 0; n--) {
        var r = this.elements[n];
        if (IS(r, e)) {
          return true;
        }
        if (IS(r, t)) {
          return false;
        }
      }
      return false;
    };
    v_.ElementStack.prototype.elementInSpecificScope = function (e, t) {
      for (var n = this.elements.length - 1; n >= 0; n--) {
        var r = this.elements[n];
        if (r === e) {
          return true;
        }
        if (IS(r, t)) {
          return false;
        }
      }
      return false;
    };
    v_.ElementStack.prototype.elementTypeInSpecificScope = function (e, t) {
      for (var n = this.elements.length - 1; n >= 0; n--) {
        var r = this.elements[n];
        if (r instanceof e) {
          return true;
        }
        if (IS(r, t)) {
          return false;
        }
      }
      return false;
    };
    v_.ElementStack.prototype.inScope = function (e) {
      return this.inSpecificScope(e, Xme);
    };
    v_.ElementStack.prototype.elementInScope = function (e) {
      return this.elementInSpecificScope(e, Xme);
    };
    v_.ElementStack.prototype.elementTypeInScope = function (e) {
      return this.elementTypeInSpecificScope(e, Xme);
    };
    v_.ElementStack.prototype.inButtonScope = function (e) {
      return this.inSpecificScope(e, V1o);
    };
    v_.ElementStack.prototype.inListItemScope = function (e) {
      return this.inSpecificScope(e, fer);
    };
    v_.ElementStack.prototype.inTableScope = function (e) {
      return this.inSpecificScope(e, bRl);
    };
    v_.ElementStack.prototype.inSelectScope = function (e) {
      for (var t = this.elements.length - 1; t >= 0; t--) {
        var n = this.elements[t];
        if (n.namespaceURI !== pd.HTML) {
          return false;
        }
        var r = n.localName;
        if (r === e) {
          return true;
        }
        if (r !== "optgroup" && r !== "option") {
          return false;
        }
      }
      return false;
    };
    v_.ElementStack.prototype.generateImpliedEndTags = function (e, t) {
      var n = t ? yRl : gRl;
      for (var r = this.elements.length - 1; r >= 0; r--) {
        var o = this.elements[r];
        if (e && IS(o, e)) {
          break;
        }
        if (!IS(this.elements[r], n)) {
          break;
        }
      }
      this.elements.length = r + 1;
      this.top = this.elements[r];
    };
    v_.ActiveFormattingElements = function () {
      this.list = [];
      this.attrs = [];
    };
    v_.ActiveFormattingElements.prototype.MARKER = {
      localName: "|"
    };
    v_.ActiveFormattingElements.prototype.insertMarker = function () {
      this.list.push(this.MARKER);
      this.attrs.push(this.MARKER);
    };
    v_.ActiveFormattingElements.prototype.push = function (e, t) {
      var n = 0;
      for (var r = this.list.length - 1; r >= 0; r--) {
        if (this.list[r] === this.MARKER) {
          break;
        }
        if (i(e, this.list[r], this.attrs[r])) {
          if (n++, n === 3) {
            this.list.splice(r, 1);
            this.attrs.splice(r, 1);
            break;
          }
        }
      }
      this.list.push(e);
      var o = [];
      for (var s = 0; s < t.length; s++) {
        o[s] = t[s];
      }
      this.attrs.push(o);
      function i(a, l, c) {
        if (a.localName !== l.localName) {
          return false;
        }
        if (a._numattrs !== c.length) {
          return false;
        }
        for (var u = 0, d = c.length; u < d; u++) {
          var p = c[u][0];
          var m = c[u][1];
          if (!a.hasAttribute(p)) {
            return false;
          }
          if (a.getAttribute(p) !== m) {
            return false;
          }
        }
        return true;
      }
    };
    v_.ActiveFormattingElements.prototype.clearToMarker = function () {
      for (var e = this.list.length - 1; e >= 0; e--) {
        if (this.list[e] === this.MARKER) {
          break;
        }
      }
      if (e < 0) {
        e = 0;
      }
      this.list.length = e;
      this.attrs.length = e;
    };
    v_.ActiveFormattingElements.prototype.findElementByTag = function (e) {
      for (var t = this.list.length - 1; t >= 0; t--) {
        var n = this.list[t];
        if (n === this.MARKER) {
          break;
        }
        if (n.localName === e) {
          return n;
        }
      }
      return null;
    };
    v_.ActiveFormattingElements.prototype.indexOf = function (e) {
      return this.list.lastIndexOf(e);
    };
    v_.ActiveFormattingElements.prototype.remove = function (e) {
      var t = this.list.lastIndexOf(e);
      if (t !== -1) {
        this.list.splice(t, 1);
        this.attrs.splice(t, 1);
      }
    };
    v_.ActiveFormattingElements.prototype.replace = function (e, t, n) {
      var r = this.list.lastIndexOf(e);
      if (r !== -1) {
        this.list[r] = t;
        this.attrs[r] = n;
      }
    };
    v_.ActiveFormattingElements.prototype.insertAfter = function (e, t) {
      var n = this.list.lastIndexOf(e);
      if (n !== -1) {
        this.list.splice(n, 0, t);
        this.attrs.splice(n, 0, t);
      }
    };
    function v_(e, t, n) {
      var r = null;
      var o = 0;
      var s = 0;
      var i = false;
      var a = false;
      var l = 0;
      var c = [];
      var u = "";
      var d = true;
      var p = 0;
      var m = He;
      var f;
      var h;
      var g = "";
      var y = "";
      var _ = [];
      var b = "";
      var S = "";
      var E = [];
      var C = [];
      var x = [];
      var A = [];
      var k = [];
      var I = false;
      var O = Ll;
      var M = null;
      var L = [];
      var P = new v_.ElementStack();
      var F = new v_.ActiveFormattingElements();
      var H = t !== undefined;
      var U = null;
      var N = null;
      var W = true;
      if (t) {
        W = t.ownerDocument._scripting_enabled;
      }
      if (n && n.scripting_enabled === false) {
        W = false;
      }
      var j = true;
      var z = false;
      var V;
      var K;
      var J = [];
      var Q = false;
      var Z = false;
      var ne = {
        document: function () {
          return oe;
        },
        _asDocumentFragment: function () {
          var Je = oe.createDocumentFragment();
          var rt = oe.firstChild;
          while (rt.hasChildNodes()) {
            Je.appendChild(rt.firstChild);
          }
          return Je;
        },
        pause: function () {
          p++;
        },
        resume: function () {
          p--;
          this.parse("");
        },
        parse: function (Je, rt, cn) {
          var Gn;
          if (p > 0) {
            u += Je;
            return true;
          }
          if (l === 0) {
            if (u) {
              Je = u + Je;
              u = "";
            }
            if (rt) {
              Je += "\uFFFF";
              i = true;
            }
            if (r = Je, o = Je.length, s = 0, d) {
              if (d = false, r.charCodeAt(0) === 65279) {
                s = 1;
              }
            }
            l++;
            Gn = se(cn);
            u = r.substring(s, o);
            l--;
          } else {
            if (l++, c.push(r, o, s), r = Je, o = Je.length, s = 0, se(), Gn = false, u = r.substring(s, o), s = c.pop(), o = c.pop(), r = c.pop(), u) {
              r = u + r.substring(s);
              o = r.length;
              s = 0;
              u = "";
            }
            l--;
          }
          return Gn;
        }
      };
      var oe = new Oxm(true, e);
      if (oe._parser = ne, oe._scripting_enabled = W, t) {
        if (t.ownerDocument._quirks) {
          oe._quirks = true;
        }
        if (t.ownerDocument._limitedQuirks) {
          oe._limitedQuirks = true;
        }
        if (t.namespaceURI === pd.HTML) {
          switch (t.localName) {
            case "title":
            case "textarea":
              m = Gt;
              break;
            case "style":
            case "xmp":
            case "iframe":
            case "noembed":
            case "noframes":
            case "script":
            case "plaintext":
              m = jt;
              break;
          }
        }
        var ee = oe.createElement("html");
        if (oe._appendChild(ee), P.push(ee), t instanceof AS.HTMLTemplateElement) {
          L.push(TP);
        }
        Sn();
        for (var re = t; re !== null; re = re.parentElement) {
          if (re instanceof AS.HTMLFormElement) {
            N = re;
            break;
          }
        }
      }
      function se(Je) {
        var rt;
        var cn;
        var Gn;
        var $r;
        while (s < o) {
          if (p > 0 || Je && Je()) {
            return true;
          }
          switch (typeof m.lookahead) {
            case "undefined":
              if (rt = r.charCodeAt(s++), a) {
                if (a = false, rt === 10) {
                  s++;
                  continue;
                }
              }
              switch (rt) {
                case 13:
                  if (s < o) {
                    if (r.charCodeAt(s) === 10) {
                      s++;
                    }
                  } else {
                    a = true;
                  }
                  m(10);
                  break;
                case 65535:
                  if (i && s === o) {
                    m(cer);
                    break;
                  }
                default:
                  m(rt);
                  break;
              }
              break;
            case "number":
              rt = r.charCodeAt(s);
              var Ko = m.lookahead;
              var Sa = true;
              if (Ko < 0) {
                Sa = false;
                Ko = -Ko;
              }
              if (Ko < o - s) {
                cn = Sa ? r.substring(s, s + Ko) : null;
                $r = false;
              } else if (i) {
                if (cn = Sa ? r.substring(s, o) : null, $r = true, rt === 65535 && s === o - 1) {
                  rt = cer;
                }
              } else {
                return true;
              }
              m(rt, cn, $r);
              break;
            case "string":
              rt = r.charCodeAt(s);
              Gn = m.lookahead;
              var Pi = r.indexOf(Gn, s);
              if (Pi !== -1) {
                cn = r.substring(s, Pi + Gn.length);
                $r = false;
              } else {
                if (!i) {
                  return true;
                }
                if (cn = r.substring(s, o), rt === 65535 && s === o - 1) {
                  rt = cer;
                }
                $r = true;
              }
              m(rt, cn, $r);
              break;
          }
        }
        return false;
      }
      function ae(Je, rt) {
        for (var cn = 0; cn < k.length; cn++) {
          if (k[cn][0] === Je) {
            return;
          }
        }
        if (rt !== undefined) {
          k.push([Je, rt]);
        } else {
          k.push([Je]);
        }
      }
      function de() {
        (/(?:([-a-z]+)[ \t\n\f]*=[ \t\n\f]*('[^'&\r\u0000]*'|"[^"&\r\u0000]*"|[^\t\n\r\f "&'\u0000>][^&> \t\n\r\f\u0000]*[ \t\n\f]))|[\s\S]/g).lastIndex = s - 1;
        var Je = (/(?:([-a-z]+)[ \t\n\f]*=[ \t\n\f]*('[^'&\r\u0000]*'|"[^"&\r\u0000]*"|[^\t\n\r\f "&'\u0000>][^&> \t\n\r\f\u0000]*[ \t\n\f]))|[\s\S]/g).exec(r);
        if (!Je) {
          throw Error("should never happen");
        }
        var rt = Je[1];
        if (!rt) {
          return false;
        }
        var cn = Je[2];
        var Gn = cn.length;
        switch (cn[0]) {
          case '"':
          case "'":
            cn = cn.substring(1, Gn - 1);
            s += Je[0].length - 1;
            m = Pr;
            break;
          default:
            m = 0;
            s += Je[0].length - 1;
            cn = cn.substring(0, Gn - 1);
            break;
        }
        for (var $r = 0; $r < k.length; $r++) {
          if (k[$r][0] === rt) {
            return true;
          }
        }
        k.push([rt, cn]);
        return true;
      }
      function be() {
        I = false;
        g = "";
        k.length = 0;
      }
      function fe() {
        I = true;
        g = "";
        k.length = 0;
      }
      function me() {
        _.length = 0;
      }
      function Te() {
        b = "";
      }
      function ue() {
        S = "";
      }
      function ce() {
        E.length = 0;
      }
      function le() {
        C.length = 0;
        x = null;
        A = null;
      }
      function pe() {
        x = [];
      }
      function ve() {
        A = [];
      }
      function _e() {
        z = true;
      }
      function xe() {
        return P.top && P.top.namespaceURI !== "http://www.w3.org/1999/xhtml";
      }
      function ke(Je) {
        return y === Je;
      }
      function Ie() {
        if (J.length > 0) {
          var Je = uH(J);
          if (J.length = 0, Z) {
            if (Z = false, Je[0] === `
`) {
              Je = Je.substring(1);
            }
            if (Je.length === 0) {
              return;
            }
          }
          ht(1, Je);
          Q = false;
        }
        Z = false;
      }
      function Ue(Je) {
        Je.lastIndex = s - 1;
        var rt = Je.exec(r);
        if (rt && rt.index === s - 1) {
          if (rt = rt[0], s += rt.length - 1, i && s === o) {
            rt = rt.slice(0, -1);
            s--;
          }
          return rt;
        } else {
          throw Error("should never happen");
        }
      }
      function Ge(Je) {
        Je.lastIndex = s - 1;
        var rt = Je.exec(r)[0];
        if (!rt) {
          return false;
        }
        Be(rt);
        s += rt.length - 1;
        return true;
      }
      function Be(Je) {
        if (J.length > 0) {
          Ie();
        }
        if (Z) {
          if (Z = false, Je[0] === `
`) {
            Je = Je.substring(1);
          }
          if (Je.length === 0) {
            return;
          }
        }
        ht(1, Je);
      }
      function We() {
        if (I) {
          ht(3, g);
        } else {
          var Je = g;
          g = "";
          y = Je;
          ht(2, Je, k);
        }
      }
      function Ze() {
        if (s === o) {
          return false;
        }
        (/(?:(\/)?([a-z]+)>)|[\s\S]/g).lastIndex = s;
        var Je = (/(?:(\/)?([a-z]+)>)|[\s\S]/g).exec(r);
        if (!Je) {
          throw Error("should never happen");
        }
        var rt = Je[2];
        if (!rt) {
          return false;
        }
        var cn = Je[1];
        if (cn) {
          s += rt.length + 2;
          ht(3, rt);
        } else {
          s += rt.length + 1;
          y = rt;
          ht(2, rt, Nxm);
        }
        return true;
      }
      function Tt() {
        if (I) {
          ht(3, g, null, true);
        } else {
          ht(2, g, k, true);
        }
      }
      function kt() {
        ht(5, uH(C), x ? uH(x) : undefined, A ? uH(A) : undefined);
      }
      function Ye() {
        Ie();
        O(cer);
        oe.modclock = 1;
      }
      var ht = ne.insertToken = function (rt, cn, Gn, $r) {
        Ie();
        var Ko = P.top;
        if (!Ko || Ko.namespaceURI === pd.HTML) {
          O(rt, cn, Gn, $r);
        } else if (rt !== 2 && rt !== 1) {
          gc(rt, cn, Gn, $r);
        } else if (cRl(Ko) && (rt === 1 || rt === 2 && cn !== "mglyph" && cn !== "malignmark") || rt === 2 && cn === "svg" && Ko.namespaceURI === pd.MATHML && Ko.localName === "annotation-xml" || uRl(Ko)) {
          K = true;
          O(rt, cn, Gn, $r);
          K = false;
        } else {
          gc(rt, cn, Gn, $r);
        }
      };
      function It(Je) {
        var rt = P.top;
        if (vt && IS(rt, kTt)) {
          rn(function (cn) {
            return cn.createComment(Je);
          });
        } else {
          if (rt instanceof AS.HTMLTemplateElement) {
            rt = rt.content;
          }
          rt._appendChild(rt.ownerDocument.createComment(Je));
        }
      }
      function Rt(Je) {
        var rt = P.top;
        if (vt && IS(rt, kTt)) {
          rn(function (Gn) {
            return Gn.createTextNode(Je);
          });
        } else {
          if (rt instanceof AS.HTMLTemplateElement) {
            rt = rt.content;
          }
          var cn = rt.lastChild;
          if (cn && cn.nodeType === H1o.TEXT_NODE) {
            cn.appendData(Je);
          } else {
            rt._appendChild(rt.ownerDocument.createTextNode(Je));
          }
        }
      }
      function wt(Je, rt, cn) {
        var Gn = fRl.createElement(Je, rt, null);
        if (cn) {
          for (var $r = 0, Ko = cn.length; $r < Ko; $r++) {
            Gn._setAttribute(cn[$r][0], cn[$r][1]);
          }
        }
        return Gn;
      }
      var vt = false;
      function yt(Je, rt) {
        var cn = gt(function (Gn) {
          return wt(Gn, Je, rt);
        });
        if (IS(cn, _Rl)) {
          cn._form = N;
        }
        return cn;
      }
      function gt(Je) {
        var rt;
        if (vt && IS(P.top, kTt)) {
          rt = rn(Je);
        } else if (P.top instanceof AS.HTMLTemplateElement) {
          rt = Je(P.top.content.ownerDocument);
          P.top.content._appendChild(rt);
        } else {
          rt = Je(P.top.ownerDocument);
          P.top._appendChild(rt);
        }
        P.push(rt);
        return rt;
      }
      function Ft(Je, rt, cn) {
        return gt(function (Gn) {
          var $r = Gn._createElementNS(Je, cn, null);
          if (rt) {
            for (var Ko = 0, Sa = rt.length; Ko < Sa; Ko++) {
              var Pi = rt[Ko];
              if (Pi.length === 2) {
                $r._setAttribute(Pi[0], Pi[1]);
              } else {
                $r._setAttributeNS(Pi[2], Pi[0], Pi[1]);
              }
            }
          }
          return $r;
        });
      }
      function on(Je) {
        for (var rt = P.elements.length - 1; rt >= 0; rt--) {
          if (P.elements[rt] instanceof Je) {
            return rt;
          }
        }
        return -1;
      }
      function rn(Je) {
        var rt;
        var cn;
        var Gn = -1;
        var $r = -1;
        var Ko;
        if (Gn = on(AS.HTMLTableElement), $r = on(AS.HTMLTemplateElement), $r >= 0 && (Gn < 0 || $r > Gn)) {
          rt = P.elements[$r];
        } else if (Gn >= 0) {
          if (rt = P.elements[Gn].parentNode, rt) {
            cn = P.elements[Gn];
          } else {
            rt = P.elements[Gn - 1];
          }
        }
        if (!rt) {
          rt = P.elements[0];
        }
        if (rt instanceof AS.HTMLTemplateElement) {
          rt = rt.content;
        }
        if (Ko = Je(rt.ownerDocument), Ko.nodeType === H1o.TEXT_NODE) {
          var Sa;
          if (cn) {
            Sa = cn.previousSibling;
          } else {
            Sa = rt.lastChild;
          }
          if (Sa && Sa.nodeType === H1o.TEXT_NODE) {
            Sa.appendData(Ko.data);
            return Ko;
          }
        }
        if (cn) {
          rt.insertBefore(Ko, cn);
        } else {
          rt._appendChild(Ko);
        }
        return Ko;
      }
      function Sn() {
        var Je = false;
        for (var rt = P.elements.length - 1; rt >= 0; rt--) {
          var cn = P.elements[rt];
          if (rt === 0) {
            if (Je = true, H) {
              cn = t;
            }
          }
          if (cn.namespaceURI === pd.HTML) {
            var Gn = cn.localName;
            switch (Gn) {
              case "select":
                for (var $r = rt; $r > 0;) {
                  var Ko = P.elements[--$r];
                  if (Ko instanceof AS.HTMLTemplateElement) {
                    break;
                  } else if (Ko instanceof AS.HTMLTableElement) {
                    O = J0;
                    return;
                  }
                }
                O = qS;
                return;
              case "tr":
                O = OR;
                return;
              case "tbody":
              case "tfoot":
              case "thead":
                O = Jx;
                return;
              case "caption":
                O = Vb;
                return;
              case "colgroup":
                O = e_;
                return;
              case "table":
                O = Nf;
                return;
              case "template":
                O = L[L.length - 1];
                return;
              case "body":
                O = ta;
                return;
              case "frameset":
                O = Yn;
                return;
              case "html":
                if (U === null) {
                  O = PR;
                } else {
                  O = ub;
                }
                return;
              default:
                if (!Je) {
                  if (Gn === "head") {
                    O = $d;
                    return;
                  }
                  if (Gn === "td" || Gn === "th") {
                    O = UE;
                    return;
                  }
                }
            }
          }
          if (Je) {
            O = ta;
            return;
          }
        }
      }
      function jn(Je, rt) {
        yt(Je, rt);
        m = mt;
        M = O;
        O = db;
      }
      function Xr(Je, rt) {
        yt(Je, rt);
        m = Gt;
        M = O;
        O = db;
      }
      function co(Je, rt) {
        return {
          elt: wt(Je, F.list[rt].localName, F.attrs[rt]),
          attrs: F.attrs[rt]
        };
      }
      function Yt() {
        if (F.list.length === 0) {
          return;
        }
        var Je = F.list[F.list.length - 1];
        if (Je === F.MARKER) {
          return;
        }
        if (P.elements.lastIndexOf(Je) !== -1) {
          return;
        }
        for (var rt = F.list.length - 2; rt >= 0; rt--) {
          if (Je = F.list[rt], Je === F.MARKER) {
            break;
          }
          if (P.elements.lastIndexOf(Je) !== -1) {
            break;
          }
        }
        for (rt = rt + 1; rt < F.list.length; rt++) {
          var cn = gt(function (Gn) {
            return co(Gn, rt).elt;
          });
          F.list[rt] = cn;
        }
      }
      var Ee = {
        localName: "BM"
      };
      function Re(Je) {
        if (IS(P.top, Je) && F.indexOf(P.top) === -1) {
          P.pop();
          return true;
        }
        var rt = 0;
        while (rt < 8) {
          rt++;
          var cn = F.findElementByTag(Je);
          if (!cn) {
            return false;
          }
          var Gn = P.elements.lastIndexOf(cn);
          if (Gn === -1) {
            F.remove(cn);
            return true;
          }
          if (!P.elementInScope(cn)) {
            return true;
          }
          var $r = null;
          var Ko;
          for (var Sa = Gn + 1; Sa < P.elements.length; Sa++) {
            if (IS(P.elements[Sa], $Ke)) {
              $r = P.elements[Sa];
              Ko = Sa;
              break;
            }
          }
          if (!$r) {
            P.popElement(cn);
            F.remove(cn);
            return true;
          } else {
            var Pi = P.elements[Gn - 1];
            F.insertAfter(cn, Ee);
            var Za = $r;
            var Mu = $r;
            var wu = Ko;
            var Lf;
            var DT = 0;
            while (true) {
              if (DT++, Za = P.elements[--wu], Za === cn) {
                break;
              }
              if (Lf = F.indexOf(Za), DT > 3 && Lf !== -1) {
                F.remove(Za);
                Lf = -1;
              }
              if (Lf === -1) {
                P.removeElement(Za);
                continue;
              }
              var hy = co(Pi.ownerDocument, Lf);
              if (F.replace(Za, hy.elt, hy.attrs), P.elements[wu] = hy.elt, Za = hy.elt, Mu === $r) {
                F.remove(Ee);
                F.insertAfter(hy.elt, Ee);
              }
              Za._appendChild(Mu);
              Mu = Za;
            }
            if (vt && IS(Pi, kTt)) {
              rn(function () {
                return Mu;
              });
            } else if (Pi instanceof AS.HTMLTemplateElement) {
              Pi.content._appendChild(Mu);
            } else {
              Pi._appendChild(Mu);
            }
            var X0 = co($r.ownerDocument, F.indexOf(cn));
            while ($r.hasChildNodes()) {
              X0.elt._appendChild($r.firstChild);
            }
            $r._appendChild(X0.elt);
            F.remove(cn);
            F.replace(Ee, X0.elt, X0.attrs);
            P.removeElement(cn);
            var TB = P.elements.lastIndexOf($r);
            P.elements.splice(TB + 1, 0, X0.elt);
          }
        }
        return true;
      }
      function Ce() {
        P.pop();
        O = M;
        return;
      }
      function Fe() {
        if (delete oe._parser, P.elements.length = 0, oe.defaultView) {
          oe.defaultView.dispatchEvent(new AS.Event("load", {}));
        }
      }
      function Xe(Je, rt) {
        m = rt;
        s--;
      }
      function He(Je) {
        switch (Je) {
          case 38:
            f = He;
            m = Ym;
            break;
          case 60:
            if (Ze()) {
              break;
            }
            m = bn;
            break;
          case 0:
            J.push(Je);
            Q = true;
            break;
          case -1:
            Ye();
            break;
          default:
            Ge(/[^&<\r\u0000\uffff]*/g) || J.push(Je);
            break;
        }
      }
      function Gt(Je) {
        switch (Je) {
          case 38:
            f = Gt;
            m = Ym;
            break;
          case 60:
            m = vn;
            break;
          case 0:
            J.push(65533);
            Q = true;
            break;
          case -1:
            Ye();
            break;
          default:
            J.push(Je);
            break;
        }
      }
      function mt(Je) {
        switch (Je) {
          case 60:
            m = Lr;
            break;
          case 0:
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            Ge(/[^<\r\u0000\uffff]*/g) || J.push(Je);
            break;
        }
      }
      function Dt(Je) {
        switch (Je) {
          case 60:
            m = Tr;
            break;
          case 0:
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            Ge(/[^<\r\u0000\uffff]*/g) || J.push(Je);
            break;
        }
      }
      function jt(Je) {
        switch (Je) {
          case 0:
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            Ge(/[^\r\u0000\uffff]*/g) || J.push(Je);
            break;
        }
      }
      function bn(Je) {
        switch (Je) {
          case 33:
            m = qo;
            break;
          case 47:
            m = Ct;
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            be();
            Xe(Je, hn);
            break;
          case 63:
            Xe(Je, Xo);
            break;
          default:
            J.push(60);
            Xe(Je, He);
            break;
        }
      }
      function Ct(Je) {
        switch (Je) {
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            fe();
            Xe(Je, hn);
            break;
          case 62:
            m = He;
            break;
          case -1:
            J.push(60);
            J.push(47);
            Ye();
            break;
          default:
            Xe(Je, Xo);
            break;
        }
      }
      function hn(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            m = 0;
            break;
          case 47:
            m = Vr;
            break;
          case 62:
            m = He;
            We();
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            g += String.fromCharCode(Je + 32);
            break;
          case 0:
            g += String.fromCharCode(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            g += Ue(/[^\r\t\n\f \/>A-Z\u0000]+/g);
            break;
        }
      }
      function vn(Je) {
        if (Je === 47) {
          me();
          m = zn;
        } else {
          J.push(60);
          Xe(Je, Gt);
        }
      }
      function zn(Je) {
        switch (Je) {
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            fe();
            Xe(Je, Pn);
            break;
          default:
            J.push(60);
            J.push(47);
            Xe(Je, Gt);
            break;
        }
      }
      function Pn(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            if (ke(g)) {
              m = 0;
              return;
            }
            break;
          case 47:
            if (ke(g)) {
              m = Vr;
              return;
            }
            break;
          case 62:
            if (ke(g)) {
              m = He;
              We();
              return;
            }
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            g += String.fromCharCode(Je + 32);
            _.push(Je);
            return;
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            g += String.fromCharCode(Je);
            _.push(Je);
            return;
          default:
            break;
        }
        J.push(60);
        J.push(47);
        UKe(J, _);
        Xe(Je, Gt);
      }
      function Lr(Je) {
        if (Je === 47) {
          me();
          m = ao;
        } else {
          J.push(60);
          Xe(Je, mt);
        }
      }
      function ao(Je) {
        switch (Je) {
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            fe();
            Xe(Je, Nn);
            break;
          default:
            J.push(60);
            J.push(47);
            Xe(Je, mt);
            break;
        }
      }
      function Nn(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            if (ke(g)) {
              m = 0;
              return;
            }
            break;
          case 47:
            if (ke(g)) {
              m = Vr;
              return;
            }
            break;
          case 62:
            if (ke(g)) {
              m = He;
              We();
              return;
            }
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            g += String.fromCharCode(Je + 32);
            _.push(Je);
            return;
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            g += String.fromCharCode(Je);
            _.push(Je);
            return;
          default:
            break;
        }
        J.push(60);
        J.push(47);
        UKe(J, _);
        Xe(Je, mt);
      }
      function Tr(Je) {
        switch (Je) {
          case 47:
            me();
            m = To;
            break;
          case 33:
            m = Ut;
            J.push(60);
            J.push(33);
            break;
          default:
            J.push(60);
            Xe(Je, Dt);
            break;
        }
      }
      function To(Je) {
        switch (Je) {
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            fe();
            Xe(Je, wr);
            break;
          default:
            J.push(60);
            J.push(47);
            Xe(Je, Dt);
            break;
        }
      }
      function wr(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            if (ke(g)) {
              m = 0;
              return;
            }
            break;
          case 47:
            if (ke(g)) {
              m = Vr;
              return;
            }
            break;
          case 62:
            if (ke(g)) {
              m = He;
              We();
              return;
            }
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            g += String.fromCharCode(Je + 32);
            _.push(Je);
            return;
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            g += String.fromCharCode(Je);
            _.push(Je);
            return;
          default:
            break;
        }
        J.push(60);
        J.push(47);
        UKe(J, _);
        Xe(Je, Dt);
      }
      function Ut(Je) {
        if (Je === 45) {
          m = Wn;
          J.push(45);
        } else {
          Xe(Je, Dt);
        }
      }
      function Wn(Je) {
        if (Je === 45) {
          m = _r;
          J.push(45);
        } else {
          Xe(Je, Dt);
        }
      }
      function Fr(Je) {
        switch (Je) {
          case 45:
            m = Is;
            J.push(45);
            break;
          case 60:
            m = kn;
            break;
          case 0:
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            J.push(Je);
            break;
        }
      }
      function Is(Je) {
        switch (Je) {
          case 45:
            m = _r;
            J.push(45);
            break;
          case 60:
            m = kn;
            break;
          case 0:
            m = Fr;
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            m = Fr;
            J.push(Je);
            break;
        }
      }
      function _r(Je) {
        switch (Je) {
          case 45:
            J.push(45);
            break;
          case 60:
            m = kn;
            break;
          case 62:
            m = Dt;
            J.push(62);
            break;
          case 0:
            m = Fr;
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            m = Fr;
            J.push(Je);
            break;
        }
      }
      function kn(Je) {
        switch (Je) {
          case 47:
            me();
            m = Qn;
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            me();
            J.push(60);
            Xe(Je, Ks);
            break;
          default:
            J.push(60);
            Xe(Je, Fr);
            break;
        }
      }
      function Qn(Je) {
        switch (Je) {
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            fe();
            Xe(Je, gi);
            break;
          default:
            J.push(60);
            J.push(47);
            Xe(Je, Fr);
            break;
        }
      }
      function gi(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            if (ke(g)) {
              m = 0;
              return;
            }
            break;
          case 47:
            if (ke(g)) {
              m = Vr;
              return;
            }
            break;
          case 62:
            if (ke(g)) {
              m = He;
              We();
              return;
            }
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            g += String.fromCharCode(Je + 32);
            _.push(Je);
            return;
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            g += String.fromCharCode(Je);
            _.push(Je);
            return;
          default:
            break;
        }
        J.push(60);
        J.push(47);
        UKe(J, _);
        Xe(Je, Fr);
      }
      function Ks(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
          case 47:
          case 62:
            if (uH(_) === "script") {
              m = Fa;
            } else {
              m = Fr;
            }
            J.push(Je);
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            _.push(Je + 32);
            J.push(Je);
            break;
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            _.push(Je);
            J.push(Je);
            break;
          default:
            Xe(Je, Fr);
            break;
        }
      }
      function Fa(Je) {
        switch (Je) {
          case 45:
            m = Hs;
            J.push(45);
            break;
          case 60:
            m = Ia;
            J.push(60);
            break;
          case 0:
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            J.push(Je);
            break;
        }
      }
      function Hs(Je) {
        switch (Je) {
          case 45:
            m = Ms;
            J.push(45);
            break;
          case 60:
            m = Ia;
            J.push(60);
            break;
          case 0:
            m = Fa;
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            m = Fa;
            J.push(Je);
            break;
        }
      }
      function Ms(Je) {
        switch (Je) {
          case 45:
            J.push(45);
            break;
          case 60:
            m = Ia;
            J.push(60);
            break;
          case 62:
            m = Dt;
            J.push(62);
            break;
          case 0:
            m = Fa;
            J.push(65533);
            break;
          case -1:
            Ye();
            break;
          default:
            m = Fa;
            J.push(Je);
            break;
        }
      }
      function Ia(Je) {
        if (Je === 47) {
          me();
          m = ec;
          J.push(47);
        } else {
          Xe(Je, Fa);
        }
      }
      function ec(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
          case 47:
          case 62:
            if (uH(_) === "script") {
              m = Fr;
            } else {
              m = Fa;
            }
            J.push(Je);
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            _.push(Je + 32);
            J.push(Je);
            break;
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
          case 103:
          case 104:
          case 105:
          case 106:
          case 107:
          case 108:
          case 109:
          case 110:
          case 111:
          case 112:
          case 113:
          case 114:
          case 115:
          case 116:
          case 117:
          case 118:
          case 119:
          case 120:
          case 121:
          case 122:
            _.push(Je);
            J.push(Je);
            break;
          default:
            Xe(Je, Fa);
            break;
        }
      }
      function ws(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 47:
            m = Vr;
            break;
          case 62:
            m = He;
            We();
            break;
          case -1:
            Ye();
            break;
          case 61:
            Te();
            b += String.fromCharCode(Je);
            m = Os;
            break;
          default:
            if (de()) {
              break;
            }
            Te();
            Xe(Je, Os);
            break;
        }
      }
      function Os(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
          case 47:
          case 62:
          case -1:
            Xe(Je, Kn);
            break;
          case 61:
            m = sn;
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            b += String.fromCharCode(Je + 32);
            break;
          case 0:
            b += String.fromCharCode(65533);
            break;
          case 34:
          case 39:
          case 60:
          default:
            b += Ue(/[^\r\t\n\f \/=>A-Z\u0000]+/g);
            break;
        }
      }
      function Kn(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 47:
            ae(b);
            m = Vr;
            break;
          case 61:
            m = sn;
            break;
          case 62:
            m = He;
            ae(b);
            We();
            break;
          case -1:
            ae(b);
            Ye();
            break;
          default:
            ae(b);
            Te();
            Xe(Je, Os);
            break;
        }
      }
      function sn(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 34:
            ue();
            m = Ln;
            break;
          case 39:
            ue();
            m = ct;
            break;
          case 62:
          default:
            ue();
            Xe(Je, Br);
            break;
        }
      }
      function Ln(Je) {
        switch (Je) {
          case 34:
            ae(b, S);
            m = Pr;
            break;
          case 38:
            f = Ln;
            m = Ym;
            break;
          case 0:
            S += String.fromCharCode(65533);
            break;
          case -1:
            Ye();
            break;
          case 10:
            S += String.fromCharCode(Je);
            break;
          default:
            S += Ue(/[^\r"&\u0000]+/g);
            break;
        }
      }
      function ct(Je) {
        switch (Je) {
          case 39:
            ae(b, S);
            m = Pr;
            break;
          case 38:
            f = ct;
            m = Ym;
            break;
          case 0:
            S += String.fromCharCode(65533);
            break;
          case -1:
            Ye();
            break;
          case 10:
            S += String.fromCharCode(Je);
            break;
          default:
            S += Ue(/[^\r'&\u0000]+/g);
            break;
        }
      }
      function Br(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            ae(b, S);
            m = 0;
            break;
          case 38:
            f = Br;
            m = Ym;
            break;
          case 62:
            ae(b, S);
            m = He;
            We();
            break;
          case 0:
            S += String.fromCharCode(65533);
            break;
          case -1:
            s--;
            m = He;
            break;
          case 34:
          case 39:
          case 60:
          case 61:
          case 96:
          default:
            S += Ue(/[^\r\t\n\f &>\u0000]+/g);
            break;
        }
      }
      function Pr(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            m = 0;
            break;
          case 47:
            m = Vr;
            break;
          case 62:
            m = He;
            We();
            break;
          case -1:
            Ye();
            break;
          default:
            Xe(Je, 0);
            break;
        }
      }
      function Vr(Je) {
        switch (Je) {
          case 62:
            m = He;
            Tt(true);
            break;
          case -1:
            Ye();
            break;
          default:
            Xe(Je, 0);
            break;
        }
      }
      function Xo(Je, rt, cn) {
        var Gn = rt.length;
        if (cn) {
          s += Gn - 1;
        } else {
          s += Gn;
        }
        var $r = rt.substring(0, Gn - 1);
        $r = $r.replace(/\u0000/g, "\uFFFD");
        $r = $r.replace(/\u000D\u000A/g, `
`);
        $r = $r.replace(/\u000D/g, `
`);
        ht(4, $r);
        m = He;
      }
      Xo.lookahead = ">";
      function qo(Je, rt, cn) {
        if (rt[0] === "-" && rt[1] === "-") {
          s += 2;
          ce();
          m = ss;
          return;
        }
        if (rt.toUpperCase() === "DOCTYPE") {
          s += 7;
          m = Or;
        } else if (rt === "[CDATA[" && xe()) {
          s += 7;
          m = nc;
        } else {
          m = Xo;
        }
      }
      qo.lookahead = 7;
      function ss(Je) {
        switch (ce(), Je) {
          case 45:
            m = Ri;
            break;
          case 62:
            m = He;
            ht(4, uH(E));
            break;
          default:
            Xe(Je, ya);
            break;
        }
      }
      function Ri(Je) {
        switch (Je) {
          case 45:
            m = Un;
            break;
          case 62:
            m = He;
            ht(4, uH(E));
            break;
          case -1:
            ht(4, uH(E));
            Ye();
            break;
          default:
            E.push(45);
            Xe(Je, ya);
            break;
        }
      }
      function ya(Je) {
        switch (Je) {
          case 60:
            E.push(Je);
            m = fs;
            break;
          case 45:
            m = Mn;
            break;
          case 0:
            E.push(65533);
            break;
          case -1:
            ht(4, uH(E));
            Ye();
            break;
          default:
            E.push(Je);
            break;
        }
      }
      function fs(Je) {
        switch (Je) {
          case 33:
            E.push(Je);
            m = tc;
            break;
          case 60:
            E.push(Je);
            break;
          default:
            Xe(Je, ya);
            break;
        }
      }
      function tc(Je) {
        switch (Je) {
          case 45:
            m = On;
            break;
          default:
            Xe(Je, ya);
            break;
        }
      }
      function On(Je) {
        switch (Je) {
          case 45:
            m = lr;
            break;
          default:
            Xe(Je, Mn);
            break;
        }
      }
      function lr(Je) {
        switch (Je) {
          case 62:
          case -1:
            Xe(Je, Un);
            break;
          default:
            Xe(Je, Un);
            break;
        }
      }
      function Mn(Je) {
        switch (Je) {
          case 45:
            m = Un;
            break;
          case -1:
            ht(4, uH(E));
            Ye();
            break;
          default:
            E.push(45);
            Xe(Je, ya);
            break;
        }
      }
      function Un(Je) {
        switch (Je) {
          case 62:
            m = He;
            ht(4, uH(E));
            break;
          case 33:
            m = Er;
            break;
          case 45:
            E.push(45);
            break;
          case -1:
            ht(4, uH(E));
            Ye();
            break;
          default:
            E.push(45);
            E.push(45);
            Xe(Je, ya);
            break;
        }
      }
      function Er(Je) {
        switch (Je) {
          case 45:
            E.push(45);
            E.push(45);
            E.push(33);
            m = Mn;
            break;
          case 62:
            m = He;
            ht(4, uH(E));
            break;
          case -1:
            ht(4, uH(E));
            Ye();
            break;
          default:
            E.push(45);
            E.push(45);
            E.push(33);
            Xe(Je, ya);
            break;
        }
      }
      function Or(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            m = Y;
            break;
          case -1:
            le();
            _e();
            kt();
            Ye();
            break;
          default:
            Xe(Je, Y);
            break;
        }
      }
      function Y(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            le();
            C.push(Je + 32);
            m = Se;
            break;
          case 0:
            le();
            C.push(65533);
            m = Se;
            break;
          case 62:
            le();
            _e();
            m = He;
            kt();
            break;
          case -1:
            le();
            _e();
            kt();
            Ye();
            break;
          default:
            le();
            C.push(Je);
            m = Se;
            break;
        }
      }
      function Se(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            m = qe;
            break;
          case 62:
            m = He;
            kt();
            break;
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 71:
          case 72:
          case 73:
          case 74:
          case 75:
          case 76:
          case 77:
          case 78:
          case 79:
          case 80:
          case 81:
          case 82:
          case 83:
          case 84:
          case 85:
          case 86:
          case 87:
          case 88:
          case 89:
          case 90:
            C.push(Je + 32);
            break;
          case 0:
            C.push(65533);
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            C.push(Je);
            break;
        }
      }
      function qe(Je, rt, cn) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            s += 1;
            break;
          case 62:
            m = He;
            s += 1;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            if (rt = rt.toUpperCase(), rt === "PUBLIC") {
              s += 6;
              m = Qe;
            } else if (rt === "SYSTEM") {
              s += 6;
              m = Nr;
            } else {
              _e();
              m = Du;
            }
            break;
        }
      }
      qe.lookahead = 6;
      function Qe(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            m = Ht;
            break;
          case 34:
            pe();
            m = nn;
            break;
          case 39:
            pe();
            m = qn;
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            _e();
            m = Du;
            break;
        }
      }
      function Ht(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 34:
            pe();
            m = nn;
            break;
          case 39:
            pe();
            m = qn;
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            _e();
            m = Du;
            break;
        }
      }
      function nn(Je) {
        switch (Je) {
          case 34:
            m = zr;
            break;
          case 0:
            x.push(65533);
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            x.push(Je);
            break;
        }
      }
      function qn(Je) {
        switch (Je) {
          case 39:
            m = zr;
            break;
          case 0:
            x.push(65533);
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            x.push(Je);
            break;
        }
      }
      function zr(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            m = wo;
            break;
          case 62:
            m = He;
            kt();
            break;
          case 34:
            ve();
            m = Dr;
            break;
          case 39:
            ve();
            m = Us;
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            _e();
            m = Du;
            break;
        }
      }
      function wo(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 62:
            m = He;
            kt();
            break;
          case 34:
            ve();
            m = Dr;
            break;
          case 39:
            ve();
            m = Us;
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            _e();
            m = Du;
            break;
        }
      }
      function Nr(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            m = pi;
            break;
          case 34:
            ve();
            m = Dr;
            break;
          case 39:
            ve();
            m = Us;
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            _e();
            m = Du;
            break;
        }
      }
      function pi(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 34:
            ve();
            m = Dr;
            break;
          case 39:
            ve();
            m = Us;
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            _e();
            m = Du;
            break;
        }
      }
      function Dr(Je) {
        switch (Je) {
          case 34:
            m = oa;
            break;
          case 0:
            A.push(65533);
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            A.push(Je);
            break;
        }
      }
      function Us(Je) {
        switch (Je) {
          case 39:
            m = oa;
            break;
          case 0:
            A.push(65533);
            break;
          case 62:
            _e();
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            A.push(Je);
            break;
        }
      }
      function oa(Je) {
        switch (Je) {
          case 9:
          case 10:
          case 12:
          case 32:
            break;
          case 62:
            m = He;
            kt();
            break;
          case -1:
            _e();
            kt();
            Ye();
            break;
          default:
            m = Du;
            break;
        }
      }
      function Du(Je) {
        switch (Je) {
          case 62:
            m = He;
            kt();
            break;
          case -1:
            kt();
            Ye();
            break;
          default:
            break;
        }
      }
      function nc(Je) {
        switch (Je) {
          case 93:
            m = ju;
            break;
          case -1:
            Ye();
            break;
          case 0:
            Q = true;
          default:
            Ge(/[^\]\r\u0000\uffff]*/g) || J.push(Je);
            break;
        }
      }
      function ju(Je) {
        switch (Je) {
          case 93:
            m = tm;
            break;
          default:
            J.push(93);
            Xe(Je, nc);
            break;
        }
      }
      function tm(Je) {
        switch (Je) {
          case 93:
            J.push(93);
            break;
          case 62:
            Ie();
            m = He;
            break;
          default:
            J.push(93);
            J.push(93);
            Xe(Je, nc);
            break;
        }
      }
      function Ym(Je) {
        switch (me(), _.push(38), Je) {
          case 9:
          case 10:
          case 12:
          case 32:
          case 60:
          case 38:
          case -1:
            Xe(Je, Zy);
            break;
          case 35:
            _.push(Je);
            m = jv;
            break;
          default:
            Xe(Je, um);
            break;
        }
      }
      function um(Je) {
        (/(A(?:Elig;?|MP;?|acute;?|breve;|c(?:irc;?|y;)|fr;|grave;?|lpha;|macr;|nd;|o(?:gon;|pf;)|pplyFunction;|ring;?|s(?:cr;|sign;)|tilde;?|uml;?)|B(?:a(?:ckslash;|r(?:v;|wed;))|cy;|e(?:cause;|rnoullis;|ta;)|fr;|opf;|reve;|scr;|umpeq;)|C(?:Hcy;|OPY;?|a(?:cute;|p(?:;|italDifferentialD;)|yleys;)|c(?:aron;|edil;?|irc;|onint;)|dot;|e(?:dilla;|nterDot;)|fr;|hi;|ircle(?:Dot;|Minus;|Plus;|Times;)|lo(?:ckwiseContourIntegral;|seCurly(?:DoubleQuote;|Quote;))|o(?:lon(?:;|e;)|n(?:gruent;|int;|tourIntegral;)|p(?:f;|roduct;)|unterClockwiseContourIntegral;)|ross;|scr;|up(?:;|Cap;))|D(?:D(?:;|otrahd;)|Jcy;|Scy;|Zcy;|a(?:gger;|rr;|shv;)|c(?:aron;|y;)|el(?:;|ta;)|fr;|i(?:a(?:critical(?:Acute;|Do(?:t;|ubleAcute;)|Grave;|Tilde;)|mond;)|fferentialD;)|o(?:pf;|t(?:;|Dot;|Equal;)|uble(?:ContourIntegral;|Do(?:t;|wnArrow;)|L(?:eft(?:Arrow;|RightArrow;|Tee;)|ong(?:Left(?:Arrow;|RightArrow;)|RightArrow;))|Right(?:Arrow;|Tee;)|Up(?:Arrow;|DownArrow;)|VerticalBar;)|wn(?:Arrow(?:;|Bar;|UpArrow;)|Breve;|Left(?:RightVector;|TeeVector;|Vector(?:;|Bar;))|Right(?:TeeVector;|Vector(?:;|Bar;))|Tee(?:;|Arrow;)|arrow;))|s(?:cr;|trok;))|E(?:NG;|TH;?|acute;?|c(?:aron;|irc;?|y;)|dot;|fr;|grave;?|lement;|m(?:acr;|pty(?:SmallSquare;|VerySmallSquare;))|o(?:gon;|pf;)|psilon;|qu(?:al(?:;|Tilde;)|ilibrium;)|s(?:cr;|im;)|ta;|uml;?|x(?:ists;|ponentialE;))|F(?:cy;|fr;|illed(?:SmallSquare;|VerySmallSquare;)|o(?:pf;|rAll;|uriertrf;)|scr;)|G(?:Jcy;|T;?|amma(?:;|d;)|breve;|c(?:edil;|irc;|y;)|dot;|fr;|g;|opf;|reater(?:Equal(?:;|Less;)|FullEqual;|Greater;|Less;|SlantEqual;|Tilde;)|scr;|t;)|H(?:ARDcy;|a(?:cek;|t;)|circ;|fr;|ilbertSpace;|o(?:pf;|rizontalLine;)|s(?:cr;|trok;)|ump(?:DownHump;|Equal;))|I(?:Ecy;|Jlig;|Ocy;|acute;?|c(?:irc;?|y;)|dot;|fr;|grave;?|m(?:;|a(?:cr;|ginaryI;)|plies;)|n(?:t(?:;|e(?:gral;|rsection;))|visible(?:Comma;|Times;))|o(?:gon;|pf;|ta;)|scr;|tilde;|u(?:kcy;|ml;?))|J(?:c(?:irc;|y;)|fr;|opf;|s(?:cr;|ercy;)|ukcy;)|K(?:Hcy;|Jcy;|appa;|c(?:edil;|y;)|fr;|opf;|scr;)|L(?:Jcy;|T;?|a(?:cute;|mbda;|ng;|placetrf;|rr;)|c(?:aron;|edil;|y;)|e(?:ft(?:A(?:ngleBracket;|rrow(?:;|Bar;|RightArrow;))|Ceiling;|Do(?:ubleBracket;|wn(?:TeeVector;|Vector(?:;|Bar;)))|Floor;|Right(?:Arrow;|Vector;)|T(?:ee(?:;|Arrow;|Vector;)|riangle(?:;|Bar;|Equal;))|Up(?:DownVector;|TeeVector;|Vector(?:;|Bar;))|Vector(?:;|Bar;)|arrow;|rightarrow;)|ss(?:EqualGreater;|FullEqual;|Greater;|Less;|SlantEqual;|Tilde;))|fr;|l(?:;|eftarrow;)|midot;|o(?:ng(?:Left(?:Arrow;|RightArrow;)|RightArrow;|left(?:arrow;|rightarrow;)|rightarrow;)|pf;|wer(?:LeftArrow;|RightArrow;))|s(?:cr;|h;|trok;)|t;)|M(?:ap;|cy;|e(?:diumSpace;|llintrf;)|fr;|inusPlus;|opf;|scr;|u;)|N(?:Jcy;|acute;|c(?:aron;|edil;|y;)|e(?:gative(?:MediumSpace;|Thi(?:ckSpace;|nSpace;)|VeryThinSpace;)|sted(?:GreaterGreater;|LessLess;)|wLine;)|fr;|o(?:Break;|nBreakingSpace;|pf;|t(?:;|C(?:ongruent;|upCap;)|DoubleVerticalBar;|E(?:lement;|qual(?:;|Tilde;)|xists;)|Greater(?:;|Equal;|FullEqual;|Greater;|Less;|SlantEqual;|Tilde;)|Hump(?:DownHump;|Equal;)|Le(?:ftTriangle(?:;|Bar;|Equal;)|ss(?:;|Equal;|Greater;|Less;|SlantEqual;|Tilde;))|Nested(?:GreaterGreater;|LessLess;)|Precedes(?:;|Equal;|SlantEqual;)|R(?:everseElement;|ightTriangle(?:;|Bar;|Equal;))|S(?:quareSu(?:bset(?:;|Equal;)|perset(?:;|Equal;))|u(?:bset(?:;|Equal;)|cceeds(?:;|Equal;|SlantEqual;|Tilde;)|perset(?:;|Equal;)))|Tilde(?:;|Equal;|FullEqual;|Tilde;)|VerticalBar;))|scr;|tilde;?|u;)|O(?:Elig;|acute;?|c(?:irc;?|y;)|dblac;|fr;|grave;?|m(?:acr;|ega;|icron;)|opf;|penCurly(?:DoubleQuote;|Quote;)|r;|s(?:cr;|lash;?)|ti(?:lde;?|mes;)|uml;?|ver(?:B(?:ar;|rac(?:e;|ket;))|Parenthesis;))|P(?:artialD;|cy;|fr;|hi;|i;|lusMinus;|o(?:incareplane;|pf;)|r(?:;|ecedes(?:;|Equal;|SlantEqual;|Tilde;)|ime;|o(?:duct;|portion(?:;|al;)))|s(?:cr;|i;))|Q(?:UOT;?|fr;|opf;|scr;)|R(?:Barr;|EG;?|a(?:cute;|ng;|rr(?:;|tl;))|c(?:aron;|edil;|y;)|e(?:;|verse(?:E(?:lement;|quilibrium;)|UpEquilibrium;))|fr;|ho;|ight(?:A(?:ngleBracket;|rrow(?:;|Bar;|LeftArrow;))|Ceiling;|Do(?:ubleBracket;|wn(?:TeeVector;|Vector(?:;|Bar;)))|Floor;|T(?:ee(?:;|Arrow;|Vector;)|riangle(?:;|Bar;|Equal;))|Up(?:DownVector;|TeeVector;|Vector(?:;|Bar;))|Vector(?:;|Bar;)|arrow;)|o(?:pf;|undImplies;)|rightarrow;|s(?:cr;|h;)|uleDelayed;)|S(?:H(?:CHcy;|cy;)|OFTcy;|acute;|c(?:;|aron;|edil;|irc;|y;)|fr;|hort(?:DownArrow;|LeftArrow;|RightArrow;|UpArrow;)|igma;|mallCircle;|opf;|q(?:rt;|uare(?:;|Intersection;|Su(?:bset(?:;|Equal;)|perset(?:;|Equal;))|Union;))|scr;|tar;|u(?:b(?:;|set(?:;|Equal;))|c(?:ceeds(?:;|Equal;|SlantEqual;|Tilde;)|hThat;)|m;|p(?:;|erset(?:;|Equal;)|set;)))|T(?:HORN;?|RADE;|S(?:Hcy;|cy;)|a(?:b;|u;)|c(?:aron;|edil;|y;)|fr;|h(?:e(?:refore;|ta;)|i(?:ckSpace;|nSpace;))|ilde(?:;|Equal;|FullEqual;|Tilde;)|opf;|ripleDot;|s(?:cr;|trok;))|U(?:a(?:cute;?|rr(?:;|ocir;))|br(?:cy;|eve;)|c(?:irc;?|y;)|dblac;|fr;|grave;?|macr;|n(?:der(?:B(?:ar;|rac(?:e;|ket;))|Parenthesis;)|ion(?:;|Plus;))|o(?:gon;|pf;)|p(?:Arrow(?:;|Bar;|DownArrow;)|DownArrow;|Equilibrium;|Tee(?:;|Arrow;)|arrow;|downarrow;|per(?:LeftArrow;|RightArrow;)|si(?:;|lon;))|ring;|scr;|tilde;|uml;?)|V(?:Dash;|bar;|cy;|dash(?:;|l;)|e(?:e;|r(?:bar;|t(?:;|ical(?:Bar;|Line;|Separator;|Tilde;))|yThinSpace;))|fr;|opf;|scr;|vdash;)|W(?:circ;|edge;|fr;|opf;|scr;)|X(?:fr;|i;|opf;|scr;)|Y(?:Acy;|Icy;|Ucy;|acute;?|c(?:irc;|y;)|fr;|opf;|scr;|uml;)|Z(?:Hcy;|acute;|c(?:aron;|y;)|dot;|e(?:roWidthSpace;|ta;)|fr;|opf;|scr;)|a(?:acute;?|breve;|c(?:;|E;|d;|irc;?|ute;?|y;)|elig;?|f(?:;|r;)|grave;?|l(?:e(?:fsym;|ph;)|pha;)|m(?:a(?:cr;|lg;)|p;?)|n(?:d(?:;|and;|d;|slope;|v;)|g(?:;|e;|le;|msd(?:;|a(?:a;|b;|c;|d;|e;|f;|g;|h;))|rt(?:;|vb(?:;|d;))|s(?:ph;|t;)|zarr;))|o(?:gon;|pf;)|p(?:;|E;|acir;|e;|id;|os;|prox(?:;|eq;))|ring;?|s(?:cr;|t;|ymp(?:;|eq;))|tilde;?|uml;?|w(?:conint;|int;))|b(?:Not;|a(?:ck(?:cong;|epsilon;|prime;|sim(?:;|eq;))|r(?:vee;|wed(?:;|ge;)))|brk(?:;|tbrk;)|c(?:ong;|y;)|dquo;|e(?:caus(?:;|e;)|mptyv;|psi;|rnou;|t(?:a;|h;|ween;))|fr;|ig(?:c(?:ap;|irc;|up;)|o(?:dot;|plus;|times;)|s(?:qcup;|tar;)|triangle(?:down;|up;)|uplus;|vee;|wedge;)|karow;|l(?:a(?:ck(?:lozenge;|square;|triangle(?:;|down;|left;|right;))|nk;)|k(?:1(?:2;|4;)|34;)|ock;)|n(?:e(?:;|quiv;)|ot;)|o(?:pf;|t(?:;|tom;)|wtie;|x(?:D(?:L;|R;|l;|r;)|H(?:;|D;|U;|d;|u;)|U(?:L;|R;|l;|r;)|V(?:;|H;|L;|R;|h;|l;|r;)|box;|d(?:L;|R;|l;|r;)|h(?:;|D;|U;|d;|u;)|minus;|plus;|times;|u(?:L;|R;|l;|r;)|v(?:;|H;|L;|R;|h;|l;|r;)))|prime;|r(?:eve;|vbar;?)|s(?:cr;|emi;|im(?:;|e;)|ol(?:;|b;|hsub;))|u(?:ll(?:;|et;)|mp(?:;|E;|e(?:;|q;))))|c(?:a(?:cute;|p(?:;|and;|brcup;|c(?:ap;|up;)|dot;|s;)|r(?:et;|on;))|c(?:a(?:ps;|ron;)|edil;?|irc;|ups(?:;|sm;))|dot;|e(?:dil;?|mptyv;|nt(?:;|erdot;|))|fr;|h(?:cy;|eck(?:;|mark;)|i;)|ir(?:;|E;|c(?:;|eq;|le(?:arrow(?:left;|right;)|d(?:R;|S;|ast;|circ;|dash;)))|e;|fnint;|mid;|scir;)|lubs(?:;|uit;)|o(?:lon(?:;|e(?:;|q;))|m(?:ma(?:;|t;)|p(?:;|fn;|le(?:ment;|xes;)))|n(?:g(?:;|dot;)|int;)|p(?:f;|rod;|y(?:;|sr;|)))|r(?:arr;|oss;)|s(?:cr;|u(?:b(?:;|e;)|p(?:;|e;)))|tdot;|u(?:darr(?:l;|r;)|e(?:pr;|sc;)|larr(?:;|p;)|p(?:;|brcap;|c(?:ap;|up;)|dot;|or;|s;)|r(?:arr(?:;|m;)|ly(?:eq(?:prec;|succ;)|vee;|wedge;)|ren;?|vearrow(?:left;|right;))|vee;|wed;)|w(?:conint;|int;)|ylcty;)|d(?:Arr;|Har;|a(?:gger;|leth;|rr;|sh(?:;|v;))|b(?:karow;|lac;)|c(?:aron;|y;)|d(?:;|a(?:gger;|rr;)|otseq;)|e(?:g;?|lta;|mptyv;)|f(?:isht;|r;)|har(?:l;|r;)|i(?:am(?:;|ond(?:;|suit;)|s;)|e;|gamma;|sin;|v(?:;|ide(?:;|ontimes;|)|onx;))|jcy;|lc(?:orn;|rop;)|o(?:llar;|pf;|t(?:;|eq(?:;|dot;)|minus;|plus;|square;)|ublebarwedge;|wn(?:arrow;|downarrows;|harpoon(?:left;|right;)))|r(?:bkarow;|c(?:orn;|rop;))|s(?:c(?:r;|y;)|ol;|trok;)|t(?:dot;|ri(?:;|f;))|u(?:arr;|har;)|wangle;|z(?:cy;|igrarr;))|e(?:D(?:Dot;|ot;)|a(?:cute;?|ster;)|c(?:aron;|ir(?:;|c;?)|olon;|y;)|dot;|e;|f(?:Dot;|r;)|g(?:;|rave;?|s(?:;|dot;))|l(?:;|inters;|l;|s(?:;|dot;))|m(?:acr;|pty(?:;|set;|v;)|sp(?:1(?:3;|4;)|;))|n(?:g;|sp;)|o(?:gon;|pf;)|p(?:ar(?:;|sl;)|lus;|si(?:;|lon;|v;))|q(?:c(?:irc;|olon;)|s(?:im;|lant(?:gtr;|less;))|u(?:als;|est;|iv(?:;|DD;))|vparsl;)|r(?:Dot;|arr;)|s(?:cr;|dot;|im;)|t(?:a;|h;?)|u(?:ml;?|ro;)|x(?:cl;|ist;|p(?:ectation;|onentiale;)))|f(?:allingdotseq;|cy;|emale;|f(?:ilig;|l(?:ig;|lig;)|r;)|ilig;|jlig;|l(?:at;|lig;|tns;)|nof;|o(?:pf;|r(?:all;|k(?:;|v;)))|partint;|r(?:a(?:c(?:1(?:2;?|3;|4;?|5;|6;|8;)|2(?:3;|5;)|3(?:4;?|5;|8;)|45;|5(?:6;|8;)|78;)|sl;)|own;)|scr;)|g(?:E(?:;|l;)|a(?:cute;|mma(?:;|d;)|p;)|breve;|c(?:irc;|y;)|dot;|e(?:;|l;|q(?:;|q;|slant;)|s(?:;|cc;|dot(?:;|o(?:;|l;))|l(?:;|es;)))|fr;|g(?:;|g;)|imel;|jcy;|l(?:;|E;|a;|j;)|n(?:E;|ap(?:;|prox;)|e(?:;|q(?:;|q;))|sim;)|opf;|rave;|s(?:cr;|im(?:;|e;|l;))|t(?:;|c(?:c;|ir;)|dot;|lPar;|quest;|r(?:a(?:pprox;|rr;)|dot;|eq(?:less;|qless;)|less;|sim;)|)|v(?:ertneqq;|nE;))|h(?:Arr;|a(?:irsp;|lf;|milt;|r(?:dcy;|r(?:;|cir;|w;)))|bar;|circ;|e(?:arts(?:;|uit;)|llip;|rcon;)|fr;|ks(?:earow;|warow;)|o(?:arr;|mtht;|ok(?:leftarrow;|rightarrow;)|pf;|rbar;)|s(?:cr;|lash;|trok;)|y(?:bull;|phen;))|i(?:acute;?|c(?:;|irc;?|y;)|e(?:cy;|xcl;?)|f(?:f;|r;)|grave;?|i(?:;|i(?:int;|nt;)|nfin;|ota;)|jlig;|m(?:a(?:cr;|g(?:e;|line;|part;)|th;)|of;|ped;)|n(?:;|care;|fin(?:;|tie;)|odot;|t(?:;|cal;|e(?:gers;|rcal;)|larhk;|prod;))|o(?:cy;|gon;|pf;|ta;)|prod;|quest;?|s(?:cr;|in(?:;|E;|dot;|s(?:;|v;)|v;))|t(?:;|ilde;)|u(?:kcy;|ml;?))|j(?:c(?:irc;|y;)|fr;|math;|opf;|s(?:cr;|ercy;)|ukcy;)|k(?:appa(?:;|v;)|c(?:edil;|y;)|fr;|green;|hcy;|jcy;|opf;|scr;)|l(?:A(?:arr;|rr;|tail;)|Barr;|E(?:;|g;)|Har;|a(?:cute;|emptyv;|gran;|mbda;|ng(?:;|d;|le;)|p;|quo;?|rr(?:;|b(?:;|fs;)|fs;|hk;|lp;|pl;|sim;|tl;)|t(?:;|ail;|e(?:;|s;)))|b(?:arr;|brk;|r(?:ac(?:e;|k;)|k(?:e;|sl(?:d;|u;))))|c(?:aron;|e(?:dil;|il;)|ub;|y;)|d(?:ca;|quo(?:;|r;)|r(?:dhar;|ushar;)|sh;)|e(?:;|ft(?:arrow(?:;|tail;)|harpoon(?:down;|up;)|leftarrows;|right(?:arrow(?:;|s;)|harpoons;|squigarrow;)|threetimes;)|g;|q(?:;|q;|slant;)|s(?:;|cc;|dot(?:;|o(?:;|r;))|g(?:;|es;)|s(?:approx;|dot;|eq(?:gtr;|qgtr;)|gtr;|sim;)))|f(?:isht;|loor;|r;)|g(?:;|E;)|h(?:ar(?:d;|u(?:;|l;))|blk;)|jcy;|l(?:;|arr;|corner;|hard;|tri;)|m(?:idot;|oust(?:;|ache;))|n(?:E;|ap(?:;|prox;)|e(?:;|q(?:;|q;))|sim;)|o(?:a(?:ng;|rr;)|brk;|ng(?:left(?:arrow;|rightarrow;)|mapsto;|rightarrow;)|oparrow(?:left;|right;)|p(?:ar;|f;|lus;)|times;|w(?:ast;|bar;)|z(?:;|enge;|f;))|par(?:;|lt;)|r(?:arr;|corner;|har(?:;|d;)|m;|tri;)|s(?:aquo;|cr;|h;|im(?:;|e;|g;)|q(?:b;|uo(?:;|r;))|trok;)|t(?:;|c(?:c;|ir;)|dot;|hree;|imes;|larr;|quest;|r(?:Par;|i(?:;|e;|f;))|)|ur(?:dshar;|uhar;)|v(?:ertneqq;|nE;))|m(?:DDot;|a(?:cr;?|l(?:e;|t(?:;|ese;))|p(?:;|sto(?:;|down;|left;|up;))|rker;)|c(?:omma;|y;)|dash;|easuredangle;|fr;|ho;|i(?:cro;?|d(?:;|ast;|cir;|dot;?)|nus(?:;|b;|d(?:;|u;)))|l(?:cp;|dr;)|nplus;|o(?:dels;|pf;)|p;|s(?:cr;|tpos;)|u(?:;|ltimap;|map;))|n(?:G(?:g;|t(?:;|v;))|L(?:eft(?:arrow;|rightarrow;)|l;|t(?:;|v;))|Rightarrow;|V(?:Dash;|dash;)|a(?:bla;|cute;|ng;|p(?:;|E;|id;|os;|prox;)|tur(?:;|al(?:;|s;)))|b(?:sp;?|ump(?:;|e;))|c(?:a(?:p;|ron;)|edil;|ong(?:;|dot;)|up;|y;)|dash;|e(?:;|Arr;|ar(?:hk;|r(?:;|ow;))|dot;|quiv;|s(?:ear;|im;)|xist(?:;|s;))|fr;|g(?:E;|e(?:;|q(?:;|q;|slant;)|s;)|sim;|t(?:;|r;))|h(?:Arr;|arr;|par;)|i(?:;|s(?:;|d;)|v;)|jcy;|l(?:Arr;|E;|arr;|dr;|e(?:;|ft(?:arrow;|rightarrow;)|q(?:;|q;|slant;)|s(?:;|s;))|sim;|t(?:;|ri(?:;|e;)))|mid;|o(?:pf;|t(?:;|in(?:;|E;|dot;|v(?:a;|b;|c;))|ni(?:;|v(?:a;|b;|c;))|))|p(?:ar(?:;|allel;|sl;|t;)|olint;|r(?:;|cue;|e(?:;|c(?:;|eq;))))|r(?:Arr;|arr(?:;|c;|w;)|ightarrow;|tri(?:;|e;))|s(?:c(?:;|cue;|e;|r;)|hort(?:mid;|parallel;)|im(?:;|e(?:;|q;))|mid;|par;|qsu(?:be;|pe;)|u(?:b(?:;|E;|e;|set(?:;|eq(?:;|q;)))|cc(?:;|eq;)|p(?:;|E;|e;|set(?:;|eq(?:;|q;)))))|t(?:gl;|ilde;?|lg;|riangle(?:left(?:;|eq;)|right(?:;|eq;)))|u(?:;|m(?:;|ero;|sp;))|v(?:Dash;|Harr;|ap;|dash;|g(?:e;|t;)|infin;|l(?:Arr;|e;|t(?:;|rie;))|r(?:Arr;|trie;)|sim;)|w(?:Arr;|ar(?:hk;|r(?:;|ow;))|near;))|o(?:S;|a(?:cute;?|st;)|c(?:ir(?:;|c;?)|y;)|d(?:ash;|blac;|iv;|ot;|sold;)|elig;|f(?:cir;|r;)|g(?:on;|rave;?|t;)|h(?:bar;|m;)|int;|l(?:arr;|c(?:ir;|ross;)|ine;|t;)|m(?:acr;|ega;|i(?:cron;|d;|nus;))|opf;|p(?:ar;|erp;|lus;)|r(?:;|arr;|d(?:;|er(?:;|of;)|f;?|m;?)|igof;|or;|slope;|v;)|s(?:cr;|lash;?|ol;)|ti(?:lde;?|mes(?:;|as;))|uml;?|vbar;)|p(?:ar(?:;|a(?:;|llel;|)|s(?:im;|l;)|t;)|cy;|er(?:cnt;|iod;|mil;|p;|tenk;)|fr;|h(?:i(?:;|v;)|mmat;|one;)|i(?:;|tchfork;|v;)|l(?:an(?:ck(?:;|h;)|kv;)|us(?:;|acir;|b;|cir;|d(?:o;|u;)|e;|mn;?|sim;|two;))|m;|o(?:intint;|pf;|und;?)|r(?:;|E;|ap;|cue;|e(?:;|c(?:;|approx;|curlyeq;|eq;|n(?:approx;|eqq;|sim;)|sim;))|ime(?:;|s;)|n(?:E;|ap;|sim;)|o(?:d;|f(?:alar;|line;|surf;)|p(?:;|to;))|sim;|urel;)|s(?:cr;|i;)|uncsp;)|q(?:fr;|int;|opf;|prime;|scr;|u(?:at(?:ernions;|int;)|est(?:;|eq;)|ot;?))|r(?:A(?:arr;|rr;|tail;)|Barr;|Har;|a(?:c(?:e;|ute;)|dic;|emptyv;|ng(?:;|d;|e;|le;)|quo;?|rr(?:;|ap;|b(?:;|fs;)|c;|fs;|hk;|lp;|pl;|sim;|tl;|w;)|t(?:ail;|io(?:;|nals;)))|b(?:arr;|brk;|r(?:ac(?:e;|k;)|k(?:e;|sl(?:d;|u;))))|c(?:aron;|e(?:dil;|il;)|ub;|y;)|d(?:ca;|ldhar;|quo(?:;|r;)|sh;)|e(?:al(?:;|ine;|part;|s;)|ct;|g;?)|f(?:isht;|loor;|r;)|h(?:ar(?:d;|u(?:;|l;))|o(?:;|v;))|i(?:ght(?:arrow(?:;|tail;)|harpoon(?:down;|up;)|left(?:arrows;|harpoons;)|rightarrows;|squigarrow;|threetimes;)|ng;|singdotseq;)|l(?:arr;|har;|m;)|moust(?:;|ache;)|nmid;|o(?:a(?:ng;|rr;)|brk;|p(?:ar;|f;|lus;)|times;)|p(?:ar(?:;|gt;)|polint;)|rarr;|s(?:aquo;|cr;|h;|q(?:b;|uo(?:;|r;)))|t(?:hree;|imes;|ri(?:;|e;|f;|ltri;))|uluhar;|x;)|s(?:acute;|bquo;|c(?:;|E;|a(?:p;|ron;)|cue;|e(?:;|dil;)|irc;|n(?:E;|ap;|sim;)|polint;|sim;|y;)|dot(?:;|b;|e;)|e(?:Arr;|ar(?:hk;|r(?:;|ow;))|ct;?|mi;|swar;|tm(?:inus;|n;)|xt;)|fr(?:;|own;)|h(?:arp;|c(?:hcy;|y;)|ort(?:mid;|parallel;)|y;?)|i(?:gma(?:;|f;|v;)|m(?:;|dot;|e(?:;|q;)|g(?:;|E;)|l(?:;|E;)|ne;|plus;|rarr;))|larr;|m(?:a(?:llsetminus;|shp;)|eparsl;|i(?:d;|le;)|t(?:;|e(?:;|s;)))|o(?:ftcy;|l(?:;|b(?:;|ar;))|pf;)|pa(?:des(?:;|uit;)|r;)|q(?:c(?:ap(?:;|s;)|up(?:;|s;))|su(?:b(?:;|e;|set(?:;|eq;))|p(?:;|e;|set(?:;|eq;)))|u(?:;|ar(?:e;|f;)|f;))|rarr;|s(?:cr;|etmn;|mile;|tarf;)|t(?:ar(?:;|f;)|r(?:aight(?:epsilon;|phi;)|ns;))|u(?:b(?:;|E;|dot;|e(?:;|dot;)|mult;|n(?:E;|e;)|plus;|rarr;|s(?:et(?:;|eq(?:;|q;)|neq(?:;|q;))|im;|u(?:b;|p;)))|cc(?:;|approx;|curlyeq;|eq;|n(?:approx;|eqq;|sim;)|sim;)|m;|ng;|p(?:1;?|2;?|3;?|;|E;|d(?:ot;|sub;)|e(?:;|dot;)|hs(?:ol;|ub;)|larr;|mult;|n(?:E;|e;)|plus;|s(?:et(?:;|eq(?:;|q;)|neq(?:;|q;))|im;|u(?:b;|p;))))|w(?:Arr;|ar(?:hk;|r(?:;|ow;))|nwar;)|zlig;?)|t(?:a(?:rget;|u;)|brk;|c(?:aron;|edil;|y;)|dot;|elrec;|fr;|h(?:e(?:re(?:4;|fore;)|ta(?:;|sym;|v;))|i(?:ck(?:approx;|sim;)|nsp;)|k(?:ap;|sim;)|orn;?)|i(?:lde;|mes(?:;|b(?:;|ar;)|d;|)|nt;)|o(?:ea;|p(?:;|bot;|cir;|f(?:;|ork;))|sa;)|prime;|r(?:ade;|i(?:angle(?:;|down;|left(?:;|eq;)|q;|right(?:;|eq;))|dot;|e;|minus;|plus;|sb;|time;)|pezium;)|s(?:c(?:r;|y;)|hcy;|trok;)|w(?:ixt;|ohead(?:leftarrow;|rightarrow;)))|u(?:Arr;|Har;|a(?:cute;?|rr;)|br(?:cy;|eve;)|c(?:irc;?|y;)|d(?:arr;|blac;|har;)|f(?:isht;|r;)|grave;?|h(?:ar(?:l;|r;)|blk;)|l(?:c(?:orn(?:;|er;)|rop;)|tri;)|m(?:acr;|l;?)|o(?:gon;|pf;)|p(?:arrow;|downarrow;|harpoon(?:left;|right;)|lus;|si(?:;|h;|lon;)|uparrows;)|r(?:c(?:orn(?:;|er;)|rop;)|ing;|tri;)|scr;|t(?:dot;|ilde;|ri(?:;|f;))|u(?:arr;|ml;?)|wangle;)|v(?:Arr;|Bar(?:;|v;)|Dash;|a(?:ngrt;|r(?:epsilon;|kappa;|nothing;|p(?:hi;|i;|ropto;)|r(?:;|ho;)|s(?:igma;|u(?:bsetneq(?:;|q;)|psetneq(?:;|q;)))|t(?:heta;|riangle(?:left;|right;))))|cy;|dash;|e(?:e(?:;|bar;|eq;)|llip;|r(?:bar;|t;))|fr;|ltri;|nsu(?:b;|p;)|opf;|prop;|rtri;|s(?:cr;|u(?:bn(?:E;|e;)|pn(?:E;|e;)))|zigzag;)|w(?:circ;|e(?:d(?:bar;|ge(?:;|q;))|ierp;)|fr;|opf;|p;|r(?:;|eath;)|scr;)|x(?:c(?:ap;|irc;|up;)|dtri;|fr;|h(?:Arr;|arr;)|i;|l(?:Arr;|arr;)|map;|nis;|o(?:dot;|p(?:f;|lus;)|time;)|r(?:Arr;|arr;)|s(?:cr;|qcup;)|u(?:plus;|tri;)|vee;|wedge;)|y(?:ac(?:ute;?|y;)|c(?:irc;|y;)|en;?|fr;|icy;|opf;|scr;|u(?:cy;|ml;?))|z(?:acute;|c(?:aron;|y;)|dot;|e(?:etrf;|ta;)|fr;|hcy;|igrarr;|opf;|scr;|w(?:j;|nj;)))|[\s\S]/g).lastIndex = s;
        var rt = (/(A(?:Elig;?|MP;?|acute;?|breve;|c(?:irc;?|y;)|fr;|grave;?|lpha;|macr;|nd;|o(?:gon;|pf;)|pplyFunction;|ring;?|s(?:cr;|sign;)|tilde;?|uml;?)|B(?:a(?:ckslash;|r(?:v;|wed;))|cy;|e(?:cause;|rnoullis;|ta;)|fr;|opf;|reve;|scr;|umpeq;)|C(?:Hcy;|OPY;?|a(?:cute;|p(?:;|italDifferentialD;)|yleys;)|c(?:aron;|edil;?|irc;|onint;)|dot;|e(?:dilla;|nterDot;)|fr;|hi;|ircle(?:Dot;|Minus;|Plus;|Times;)|lo(?:ckwiseContourIntegral;|seCurly(?:DoubleQuote;|Quote;))|o(?:lon(?:;|e;)|n(?:gruent;|int;|tourIntegral;)|p(?:f;|roduct;)|unterClockwiseContourIntegral;)|ross;|scr;|up(?:;|Cap;))|D(?:D(?:;|otrahd;)|Jcy;|Scy;|Zcy;|a(?:gger;|rr;|shv;)|c(?:aron;|y;)|el(?:;|ta;)|fr;|i(?:a(?:critical(?:Acute;|Do(?:t;|ubleAcute;)|Grave;|Tilde;)|mond;)|fferentialD;)|o(?:pf;|t(?:;|Dot;|Equal;)|uble(?:ContourIntegral;|Do(?:t;|wnArrow;)|L(?:eft(?:Arrow;|RightArrow;|Tee;)|ong(?:Left(?:Arrow;|RightArrow;)|RightArrow;))|Right(?:Arrow;|Tee;)|Up(?:Arrow;|DownArrow;)|VerticalBar;)|wn(?:Arrow(?:;|Bar;|UpArrow;)|Breve;|Left(?:RightVector;|TeeVector;|Vector(?:;|Bar;))|Right(?:TeeVector;|Vector(?:;|Bar;))|Tee(?:;|Arrow;)|arrow;))|s(?:cr;|trok;))|E(?:NG;|TH;?|acute;?|c(?:aron;|irc;?|y;)|dot;|fr;|grave;?|lement;|m(?:acr;|pty(?:SmallSquare;|VerySmallSquare;))|o(?:gon;|pf;)|psilon;|qu(?:al(?:;|Tilde;)|ilibrium;)|s(?:cr;|im;)|ta;|uml;?|x(?:ists;|ponentialE;))|F(?:cy;|fr;|illed(?:SmallSquare;|VerySmallSquare;)|o(?:pf;|rAll;|uriertrf;)|scr;)|G(?:Jcy;|T;?|amma(?:;|d;)|breve;|c(?:edil;|irc;|y;)|dot;|fr;|g;|opf;|reater(?:Equal(?:;|Less;)|FullEqual;|Greater;|Less;|SlantEqual;|Tilde;)|scr;|t;)|H(?:ARDcy;|a(?:cek;|t;)|circ;|fr;|ilbertSpace;|o(?:pf;|rizontalLine;)|s(?:cr;|trok;)|ump(?:DownHump;|Equal;))|I(?:Ecy;|Jlig;|Ocy;|acute;?|c(?:irc;?|y;)|dot;|fr;|grave;?|m(?:;|a(?:cr;|ginaryI;)|plies;)|n(?:t(?:;|e(?:gral;|rsection;))|visible(?:Comma;|Times;))|o(?:gon;|pf;|ta;)|scr;|tilde;|u(?:kcy;|ml;?))|J(?:c(?:irc;|y;)|fr;|opf;|s(?:cr;|ercy;)|ukcy;)|K(?:Hcy;|Jcy;|appa;|c(?:edil;|y;)|fr;|opf;|scr;)|L(?:Jcy;|T;?|a(?:cute;|mbda;|ng;|placetrf;|rr;)|c(?:aron;|edil;|y;)|e(?:ft(?:A(?:ngleBracket;|rrow(?:;|Bar;|RightArrow;))|Ceiling;|Do(?:ubleBracket;|wn(?:TeeVector;|Vector(?:;|Bar;)))|Floor;|Right(?:Arrow;|Vector;)|T(?:ee(?:;|Arrow;|Vector;)|riangle(?:;|Bar;|Equal;))|Up(?:DownVector;|TeeVector;|Vector(?:;|Bar;))|Vector(?:;|Bar;)|arrow;|rightarrow;)|ss(?:EqualGreater;|FullEqual;|Greater;|Less;|SlantEqual;|Tilde;))|fr;|l(?:;|eftarrow;)|midot;|o(?:ng(?:Left(?:Arrow;|RightArrow;)|RightArrow;|left(?:arrow;|rightarrow;)|rightarrow;)|pf;|wer(?:LeftArrow;|RightArrow;))|s(?:cr;|h;|trok;)|t;)|M(?:ap;|cy;|e(?:diumSpace;|llintrf;)|fr;|inusPlus;|opf;|scr;|u;)|N(?:Jcy;|acute;|c(?:aron;|edil;|y;)|e(?:gative(?:MediumSpace;|Thi(?:ckSpace;|nSpace;)|VeryThinSpace;)|sted(?:GreaterGreater;|LessLess;)|wLine;)|fr;|o(?:Break;|nBreakingSpace;|pf;|t(?:;|C(?:ongruent;|upCap;)|DoubleVerticalBar;|E(?:lement;|qual(?:;|Tilde;)|xists;)|Greater(?:;|Equal;|FullEqual;|Greater;|Less;|SlantEqual;|Tilde;)|Hump(?:DownHump;|Equal;)|Le(?:ftTriangle(?:;|Bar;|Equal;)|ss(?:;|Equal;|Greater;|Less;|SlantEqual;|Tilde;))|Nested(?:GreaterGreater;|LessLess;)|Precedes(?:;|Equal;|SlantEqual;)|R(?:everseElement;|ightTriangle(?:;|Bar;|Equal;))|S(?:quareSu(?:bset(?:;|Equal;)|perset(?:;|Equal;))|u(?:bset(?:;|Equal;)|cceeds(?:;|Equal;|SlantEqual;|Tilde;)|perset(?:;|Equal;)))|Tilde(?:;|Equal;|FullEqual;|Tilde;)|VerticalBar;))|scr;|tilde;?|u;)|O(?:Elig;|acute;?|c(?:irc;?|y;)|dblac;|fr;|grave;?|m(?:acr;|ega;|icron;)|opf;|penCurly(?:DoubleQuote;|Quote;)|r;|s(?:cr;|lash;?)|ti(?:lde;?|mes;)|uml;?|ver(?:B(?:ar;|rac(?:e;|ket;))|Parenthesis;))|P(?:artialD;|cy;|fr;|hi;|i;|lusMinus;|o(?:incareplane;|pf;)|r(?:;|ecedes(?:;|Equal;|SlantEqual;|Tilde;)|ime;|o(?:duct;|portion(?:;|al;)))|s(?:cr;|i;))|Q(?:UOT;?|fr;|opf;|scr;)|R(?:Barr;|EG;?|a(?:cute;|ng;|rr(?:;|tl;))|c(?:aron;|edil;|y;)|e(?:;|verse(?:E(?:lement;|quilibrium;)|UpEquilibrium;))|fr;|ho;|ight(?:A(?:ngleBracket;|rrow(?:;|Bar;|LeftArrow;))|Ceiling;|Do(?:ubleBracket;|wn(?:TeeVector;|Vector(?:;|Bar;)))|Floor;|T(?:ee(?:;|Arrow;|Vector;)|riangle(?:;|Bar;|Equal;))|Up(?:DownVector;|TeeVector;|Vector(?:;|Bar;))|Vector(?:;|Bar;)|arrow;)|o(?:pf;|undImplies;)|rightarrow;|s(?:cr;|h;)|uleDelayed;)|S(?:H(?:CHcy;|cy;)|OFTcy;|acute;|c(?:;|aron;|edil;|irc;|y;)|fr;|hort(?:DownArrow;|LeftArrow;|RightArrow;|UpArrow;)|igma;|mallCircle;|opf;|q(?:rt;|uare(?:;|Intersection;|Su(?:bset(?:;|Equal;)|perset(?:;|Equal;))|Union;))|scr;|tar;|u(?:b(?:;|set(?:;|Equal;))|c(?:ceeds(?:;|Equal;|SlantEqual;|Tilde;)|hThat;)|m;|p(?:;|erset(?:;|Equal;)|set;)))|T(?:HORN;?|RADE;|S(?:Hcy;|cy;)|a(?:b;|u;)|c(?:aron;|edil;|y;)|fr;|h(?:e(?:refore;|ta;)|i(?:ckSpace;|nSpace;))|ilde(?:;|Equal;|FullEqual;|Tilde;)|opf;|ripleDot;|s(?:cr;|trok;))|U(?:a(?:cute;?|rr(?:;|ocir;))|br(?:cy;|eve;)|c(?:irc;?|y;)|dblac;|fr;|grave;?|macr;|n(?:der(?:B(?:ar;|rac(?:e;|ket;))|Parenthesis;)|ion(?:;|Plus;))|o(?:gon;|pf;)|p(?:Arrow(?:;|Bar;|DownArrow;)|DownArrow;|Equilibrium;|Tee(?:;|Arrow;)|arrow;|downarrow;|per(?:LeftArrow;|RightArrow;)|si(?:;|lon;))|ring;|scr;|tilde;|uml;?)|V(?:Dash;|bar;|cy;|dash(?:;|l;)|e(?:e;|r(?:bar;|t(?:;|ical(?:Bar;|Line;|Separator;|Tilde;))|yThinSpace;))|fr;|opf;|scr;|vdash;)|W(?:circ;|edge;|fr;|opf;|scr;)|X(?:fr;|i;|opf;|scr;)|Y(?:Acy;|Icy;|Ucy;|acute;?|c(?:irc;|y;)|fr;|opf;|scr;|uml;)|Z(?:Hcy;|acute;|c(?:aron;|y;)|dot;|e(?:roWidthSpace;|ta;)|fr;|opf;|scr;)|a(?:acute;?|breve;|c(?:;|E;|d;|irc;?|ute;?|y;)|elig;?|f(?:;|r;)|grave;?|l(?:e(?:fsym;|ph;)|pha;)|m(?:a(?:cr;|lg;)|p;?)|n(?:d(?:;|and;|d;|slope;|v;)|g(?:;|e;|le;|msd(?:;|a(?:a;|b;|c;|d;|e;|f;|g;|h;))|rt(?:;|vb(?:;|d;))|s(?:ph;|t;)|zarr;))|o(?:gon;|pf;)|p(?:;|E;|acir;|e;|id;|os;|prox(?:;|eq;))|ring;?|s(?:cr;|t;|ymp(?:;|eq;))|tilde;?|uml;?|w(?:conint;|int;))|b(?:Not;|a(?:ck(?:cong;|epsilon;|prime;|sim(?:;|eq;))|r(?:vee;|wed(?:;|ge;)))|brk(?:;|tbrk;)|c(?:ong;|y;)|dquo;|e(?:caus(?:;|e;)|mptyv;|psi;|rnou;|t(?:a;|h;|ween;))|fr;|ig(?:c(?:ap;|irc;|up;)|o(?:dot;|plus;|times;)|s(?:qcup;|tar;)|triangle(?:down;|up;)|uplus;|vee;|wedge;)|karow;|l(?:a(?:ck(?:lozenge;|square;|triangle(?:;|down;|left;|right;))|nk;)|k(?:1(?:2;|4;)|34;)|ock;)|n(?:e(?:;|quiv;)|ot;)|o(?:pf;|t(?:;|tom;)|wtie;|x(?:D(?:L;|R;|l;|r;)|H(?:;|D;|U;|d;|u;)|U(?:L;|R;|l;|r;)|V(?:;|H;|L;|R;|h;|l;|r;)|box;|d(?:L;|R;|l;|r;)|h(?:;|D;|U;|d;|u;)|minus;|plus;|times;|u(?:L;|R;|l;|r;)|v(?:;|H;|L;|R;|h;|l;|r;)))|prime;|r(?:eve;|vbar;?)|s(?:cr;|emi;|im(?:;|e;)|ol(?:;|b;|hsub;))|u(?:ll(?:;|et;)|mp(?:;|E;|e(?:;|q;))))|c(?:a(?:cute;|p(?:;|and;|brcup;|c(?:ap;|up;)|dot;|s;)|r(?:et;|on;))|c(?:a(?:ps;|ron;)|edil;?|irc;|ups(?:;|sm;))|dot;|e(?:dil;?|mptyv;|nt(?:;|erdot;|))|fr;|h(?:cy;|eck(?:;|mark;)|i;)|ir(?:;|E;|c(?:;|eq;|le(?:arrow(?:left;|right;)|d(?:R;|S;|ast;|circ;|dash;)))|e;|fnint;|mid;|scir;)|lubs(?:;|uit;)|o(?:lon(?:;|e(?:;|q;))|m(?:ma(?:;|t;)|p(?:;|fn;|le(?:ment;|xes;)))|n(?:g(?:;|dot;)|int;)|p(?:f;|rod;|y(?:;|sr;|)))|r(?:arr;|oss;)|s(?:cr;|u(?:b(?:;|e;)|p(?:;|e;)))|tdot;|u(?:darr(?:l;|r;)|e(?:pr;|sc;)|larr(?:;|p;)|p(?:;|brcap;|c(?:ap;|up;)|dot;|or;|s;)|r(?:arr(?:;|m;)|ly(?:eq(?:prec;|succ;)|vee;|wedge;)|ren;?|vearrow(?:left;|right;))|vee;|wed;)|w(?:conint;|int;)|ylcty;)|d(?:Arr;|Har;|a(?:gger;|leth;|rr;|sh(?:;|v;))|b(?:karow;|lac;)|c(?:aron;|y;)|d(?:;|a(?:gger;|rr;)|otseq;)|e(?:g;?|lta;|mptyv;)|f(?:isht;|r;)|har(?:l;|r;)|i(?:am(?:;|ond(?:;|suit;)|s;)|e;|gamma;|sin;|v(?:;|ide(?:;|ontimes;|)|onx;))|jcy;|lc(?:orn;|rop;)|o(?:llar;|pf;|t(?:;|eq(?:;|dot;)|minus;|plus;|square;)|ublebarwedge;|wn(?:arrow;|downarrows;|harpoon(?:left;|right;)))|r(?:bkarow;|c(?:orn;|rop;))|s(?:c(?:r;|y;)|ol;|trok;)|t(?:dot;|ri(?:;|f;))|u(?:arr;|har;)|wangle;|z(?:cy;|igrarr;))|e(?:D(?:Dot;|ot;)|a(?:cute;?|ster;)|c(?:aron;|ir(?:;|c;?)|olon;|y;)|dot;|e;|f(?:Dot;|r;)|g(?:;|rave;?|s(?:;|dot;))|l(?:;|inters;|l;|s(?:;|dot;))|m(?:acr;|pty(?:;|set;|v;)|sp(?:1(?:3;|4;)|;))|n(?:g;|sp;)|o(?:gon;|pf;)|p(?:ar(?:;|sl;)|lus;|si(?:;|lon;|v;))|q(?:c(?:irc;|olon;)|s(?:im;|lant(?:gtr;|less;))|u(?:als;|est;|iv(?:;|DD;))|vparsl;)|r(?:Dot;|arr;)|s(?:cr;|dot;|im;)|t(?:a;|h;?)|u(?:ml;?|ro;)|x(?:cl;|ist;|p(?:ectation;|onentiale;)))|f(?:allingdotseq;|cy;|emale;|f(?:ilig;|l(?:ig;|lig;)|r;)|ilig;|jlig;|l(?:at;|lig;|tns;)|nof;|o(?:pf;|r(?:all;|k(?:;|v;)))|partint;|r(?:a(?:c(?:1(?:2;?|3;|4;?|5;|6;|8;)|2(?:3;|5;)|3(?:4;?|5;|8;)|45;|5(?:6;|8;)|78;)|sl;)|own;)|scr;)|g(?:E(?:;|l;)|a(?:cute;|mma(?:;|d;)|p;)|breve;|c(?:irc;|y;)|dot;|e(?:;|l;|q(?:;|q;|slant;)|s(?:;|cc;|dot(?:;|o(?:;|l;))|l(?:;|es;)))|fr;|g(?:;|g;)|imel;|jcy;|l(?:;|E;|a;|j;)|n(?:E;|ap(?:;|prox;)|e(?:;|q(?:;|q;))|sim;)|opf;|rave;|s(?:cr;|im(?:;|e;|l;))|t(?:;|c(?:c;|ir;)|dot;|lPar;|quest;|r(?:a(?:pprox;|rr;)|dot;|eq(?:less;|qless;)|less;|sim;)|)|v(?:ertneqq;|nE;))|h(?:Arr;|a(?:irsp;|lf;|milt;|r(?:dcy;|r(?:;|cir;|w;)))|bar;|circ;|e(?:arts(?:;|uit;)|llip;|rcon;)|fr;|ks(?:earow;|warow;)|o(?:arr;|mtht;|ok(?:leftarrow;|rightarrow;)|pf;|rbar;)|s(?:cr;|lash;|trok;)|y(?:bull;|phen;))|i(?:acute;?|c(?:;|irc;?|y;)|e(?:cy;|xcl;?)|f(?:f;|r;)|grave;?|i(?:;|i(?:int;|nt;)|nfin;|ota;)|jlig;|m(?:a(?:cr;|g(?:e;|line;|part;)|th;)|of;|ped;)|n(?:;|care;|fin(?:;|tie;)|odot;|t(?:;|cal;|e(?:gers;|rcal;)|larhk;|prod;))|o(?:cy;|gon;|pf;|ta;)|prod;|quest;?|s(?:cr;|in(?:;|E;|dot;|s(?:;|v;)|v;))|t(?:;|ilde;)|u(?:kcy;|ml;?))|j(?:c(?:irc;|y;)|fr;|math;|opf;|s(?:cr;|ercy;)|ukcy;)|k(?:appa(?:;|v;)|c(?:edil;|y;)|fr;|green;|hcy;|jcy;|opf;|scr;)|l(?:A(?:arr;|rr;|tail;)|Barr;|E(?:;|g;)|Har;|a(?:cute;|emptyv;|gran;|mbda;|ng(?:;|d;|le;)|p;|quo;?|rr(?:;|b(?:;|fs;)|fs;|hk;|lp;|pl;|sim;|tl;)|t(?:;|ail;|e(?:;|s;)))|b(?:arr;|brk;|r(?:ac(?:e;|k;)|k(?:e;|sl(?:d;|u;))))|c(?:aron;|e(?:dil;|il;)|ub;|y;)|d(?:ca;|quo(?:;|r;)|r(?:dhar;|ushar;)|sh;)|e(?:;|ft(?:arrow(?:;|tail;)|harpoon(?:down;|up;)|leftarrows;|right(?:arrow(?:;|s;)|harpoons;|squigarrow;)|threetimes;)|g;|q(?:;|q;|slant;)|s(?:;|cc;|dot(?:;|o(?:;|r;))|g(?:;|es;)|s(?:approx;|dot;|eq(?:gtr;|qgtr;)|gtr;|sim;)))|f(?:isht;|loor;|r;)|g(?:;|E;)|h(?:ar(?:d;|u(?:;|l;))|blk;)|jcy;|l(?:;|arr;|corner;|hard;|tri;)|m(?:idot;|oust(?:;|ache;))|n(?:E;|ap(?:;|prox;)|e(?:;|q(?:;|q;))|sim;)|o(?:a(?:ng;|rr;)|brk;|ng(?:left(?:arrow;|rightarrow;)|mapsto;|rightarrow;)|oparrow(?:left;|right;)|p(?:ar;|f;|lus;)|times;|w(?:ast;|bar;)|z(?:;|enge;|f;))|par(?:;|lt;)|r(?:arr;|corner;|har(?:;|d;)|m;|tri;)|s(?:aquo;|cr;|h;|im(?:;|e;|g;)|q(?:b;|uo(?:;|r;))|trok;)|t(?:;|c(?:c;|ir;)|dot;|hree;|imes;|larr;|quest;|r(?:Par;|i(?:;|e;|f;))|)|ur(?:dshar;|uhar;)|v(?:ertneqq;|nE;))|m(?:DDot;|a(?:cr;?|l(?:e;|t(?:;|ese;))|p(?:;|sto(?:;|down;|left;|up;))|rker;)|c(?:omma;|y;)|dash;|easuredangle;|fr;|ho;|i(?:cro;?|d(?:;|ast;|cir;|dot;?)|nus(?:;|b;|d(?:;|u;)))|l(?:cp;|dr;)|nplus;|o(?:dels;|pf;)|p;|s(?:cr;|tpos;)|u(?:;|ltimap;|map;))|n(?:G(?:g;|t(?:;|v;))|L(?:eft(?:arrow;|rightarrow;)|l;|t(?:;|v;))|Rightarrow;|V(?:Dash;|dash;)|a(?:bla;|cute;|ng;|p(?:;|E;|id;|os;|prox;)|tur(?:;|al(?:;|s;)))|b(?:sp;?|ump(?:;|e;))|c(?:a(?:p;|ron;)|edil;|ong(?:;|dot;)|up;|y;)|dash;|e(?:;|Arr;|ar(?:hk;|r(?:;|ow;))|dot;|quiv;|s(?:ear;|im;)|xist(?:;|s;))|fr;|g(?:E;|e(?:;|q(?:;|q;|slant;)|s;)|sim;|t(?:;|r;))|h(?:Arr;|arr;|par;)|i(?:;|s(?:;|d;)|v;)|jcy;|l(?:Arr;|E;|arr;|dr;|e(?:;|ft(?:arrow;|rightarrow;)|q(?:;|q;|slant;)|s(?:;|s;))|sim;|t(?:;|ri(?:;|e;)))|mid;|o(?:pf;|t(?:;|in(?:;|E;|dot;|v(?:a;|b;|c;))|ni(?:;|v(?:a;|b;|c;))|))|p(?:ar(?:;|allel;|sl;|t;)|olint;|r(?:;|cue;|e(?:;|c(?:;|eq;))))|r(?:Arr;|arr(?:;|c;|w;)|ightarrow;|tri(?:;|e;))|s(?:c(?:;|cue;|e;|r;)|hort(?:mid;|parallel;)|im(?:;|e(?:;|q;))|mid;|par;|qsu(?:be;|pe;)|u(?:b(?:;|E;|e;|set(?:;|eq(?:;|q;)))|cc(?:;|eq;)|p(?:;|E;|e;|set(?:;|eq(?:;|q;)))))|t(?:gl;|ilde;?|lg;|riangle(?:left(?:;|eq;)|right(?:;|eq;)))|u(?:;|m(?:;|ero;|sp;))|v(?:Dash;|Harr;|ap;|dash;|g(?:e;|t;)|infin;|l(?:Arr;|e;|t(?:;|rie;))|r(?:Arr;|trie;)|sim;)|w(?:Arr;|ar(?:hk;|r(?:;|ow;))|near;))|o(?:S;|a(?:cute;?|st;)|c(?:ir(?:;|c;?)|y;)|d(?:ash;|blac;|iv;|ot;|sold;)|elig;|f(?:cir;|r;)|g(?:on;|rave;?|t;)|h(?:bar;|m;)|int;|l(?:arr;|c(?:ir;|ross;)|ine;|t;)|m(?:acr;|ega;|i(?:cron;|d;|nus;))|opf;|p(?:ar;|erp;|lus;)|r(?:;|arr;|d(?:;|er(?:;|of;)|f;?|m;?)|igof;|or;|slope;|v;)|s(?:cr;|lash;?|ol;)|ti(?:lde;?|mes(?:;|as;))|uml;?|vbar;)|p(?:ar(?:;|a(?:;|llel;|)|s(?:im;|l;)|t;)|cy;|er(?:cnt;|iod;|mil;|p;|tenk;)|fr;|h(?:i(?:;|v;)|mmat;|one;)|i(?:;|tchfork;|v;)|l(?:an(?:ck(?:;|h;)|kv;)|us(?:;|acir;|b;|cir;|d(?:o;|u;)|e;|mn;?|sim;|two;))|m;|o(?:intint;|pf;|und;?)|r(?:;|E;|ap;|cue;|e(?:;|c(?:;|approx;|curlyeq;|eq;|n(?:approx;|eqq;|sim;)|sim;))|ime(?:;|s;)|n(?:E;|ap;|sim;)|o(?:d;|f(?:alar;|line;|surf;)|p(?:;|to;))|sim;|urel;)|s(?:cr;|i;)|uncsp;)|q(?:fr;|int;|opf;|prime;|scr;|u(?:at(?:ernions;|int;)|est(?:;|eq;)|ot;?))|r(?:A(?:arr;|rr;|tail;)|Barr;|Har;|a(?:c(?:e;|ute;)|dic;|emptyv;|ng(?:;|d;|e;|le;)|quo;?|rr(?:;|ap;|b(?:;|fs;)|c;|fs;|hk;|lp;|pl;|sim;|tl;|w;)|t(?:ail;|io(?:;|nals;)))|b(?:arr;|brk;|r(?:ac(?:e;|k;)|k(?:e;|sl(?:d;|u;))))|c(?:aron;|e(?:dil;|il;)|ub;|y;)|d(?:ca;|ldhar;|quo(?:;|r;)|sh;)|e(?:al(?:;|ine;|part;|s;)|ct;|g;?)|f(?:isht;|loor;|r;)|h(?:ar(?:d;|u(?:;|l;))|o(?:;|v;))|i(?:ght(?:arrow(?:;|tail;)|harpoon(?:down;|up;)|left(?:arrows;|harpoons;)|rightarrows;|squigarrow;|threetimes;)|ng;|singdotseq;)|l(?:arr;|har;|m;)|moust(?:;|ache;)|nmid;|o(?:a(?:ng;|rr;)|brk;|p(?:ar;|f;|lus;)|times;)|p(?:ar(?:;|gt;)|polint;)|rarr;|s(?:aquo;|cr;|h;|q(?:b;|uo(?:;|r;)))|t(?:hree;|imes;|ri(?:;|e;|f;|ltri;))|uluhar;|x;)|s(?:acute;|bquo;|c(?:;|E;|a(?:p;|ron;)|cue;|e(?:;|dil;)|irc;|n(?:E;|ap;|sim;)|polint;|sim;|y;)|dot(?:;|b;|e;)|e(?:Arr;|ar(?:hk;|r(?:;|ow;))|ct;?|mi;|swar;|tm(?:inus;|n;)|xt;)|fr(?:;|own;)|h(?:arp;|c(?:hcy;|y;)|ort(?:mid;|parallel;)|y;?)|i(?:gma(?:;|f;|v;)|m(?:;|dot;|e(?:;|q;)|g(?:;|E;)|l(?:;|E;)|ne;|plus;|rarr;))|larr;|m(?:a(?:llsetminus;|shp;)|eparsl;|i(?:d;|le;)|t(?:;|e(?:;|s;)))|o(?:ftcy;|l(?:;|b(?:;|ar;))|pf;)|pa(?:des(?:;|uit;)|r;)|q(?:c(?:ap(?:;|s;)|up(?:;|s;))|su(?:b(?:;|e;|set(?:;|eq;))|p(?:;|e;|set(?:;|eq;)))|u(?:;|ar(?:e;|f;)|f;))|rarr;|s(?:cr;|etmn;|mile;|tarf;)|t(?:ar(?:;|f;)|r(?:aight(?:epsilon;|phi;)|ns;))|u(?:b(?:;|E;|dot;|e(?:;|dot;)|mult;|n(?:E;|e;)|plus;|rarr;|s(?:et(?:;|eq(?:;|q;)|neq(?:;|q;))|im;|u(?:b;|p;)))|cc(?:;|approx;|curlyeq;|eq;|n(?:approx;|eqq;|sim;)|sim;)|m;|ng;|p(?:1;?|2;?|3;?|;|E;|d(?:ot;|sub;)|e(?:;|dot;)|hs(?:ol;|ub;)|larr;|mult;|n(?:E;|e;)|plus;|s(?:et(?:;|eq(?:;|q;)|neq(?:;|q;))|im;|u(?:b;|p;))))|w(?:Arr;|ar(?:hk;|r(?:;|ow;))|nwar;)|zlig;?)|t(?:a(?:rget;|u;)|brk;|c(?:aron;|edil;|y;)|dot;|elrec;|fr;|h(?:e(?:re(?:4;|fore;)|ta(?:;|sym;|v;))|i(?:ck(?:approx;|sim;)|nsp;)|k(?:ap;|sim;)|orn;?)|i(?:lde;|mes(?:;|b(?:;|ar;)|d;|)|nt;)|o(?:ea;|p(?:;|bot;|cir;|f(?:;|ork;))|sa;)|prime;|r(?:ade;|i(?:angle(?:;|down;|left(?:;|eq;)|q;|right(?:;|eq;))|dot;|e;|minus;|plus;|sb;|time;)|pezium;)|s(?:c(?:r;|y;)|hcy;|trok;)|w(?:ixt;|ohead(?:leftarrow;|rightarrow;)))|u(?:Arr;|Har;|a(?:cute;?|rr;)|br(?:cy;|eve;)|c(?:irc;?|y;)|d(?:arr;|blac;|har;)|f(?:isht;|r;)|grave;?|h(?:ar(?:l;|r;)|blk;)|l(?:c(?:orn(?:;|er;)|rop;)|tri;)|m(?:acr;|l;?)|o(?:gon;|pf;)|p(?:arrow;|downarrow;|harpoon(?:left;|right;)|lus;|si(?:;|h;|lon;)|uparrows;)|r(?:c(?:orn(?:;|er;)|rop;)|ing;|tri;)|scr;|t(?:dot;|ilde;|ri(?:;|f;))|u(?:arr;|ml;?)|wangle;)|v(?:Arr;|Bar(?:;|v;)|Dash;|a(?:ngrt;|r(?:epsilon;|kappa;|nothing;|p(?:hi;|i;|ropto;)|r(?:;|ho;)|s(?:igma;|u(?:bsetneq(?:;|q;)|psetneq(?:;|q;)))|t(?:heta;|riangle(?:left;|right;))))|cy;|dash;|e(?:e(?:;|bar;|eq;)|llip;|r(?:bar;|t;))|fr;|ltri;|nsu(?:b;|p;)|opf;|prop;|rtri;|s(?:cr;|u(?:bn(?:E;|e;)|pn(?:E;|e;)))|zigzag;)|w(?:circ;|e(?:d(?:bar;|ge(?:;|q;))|ierp;)|fr;|opf;|p;|r(?:;|eath;)|scr;)|x(?:c(?:ap;|irc;|up;)|dtri;|fr;|h(?:Arr;|arr;)|i;|l(?:Arr;|arr;)|map;|nis;|o(?:dot;|p(?:f;|lus;)|time;)|r(?:Arr;|arr;)|s(?:cr;|qcup;)|u(?:plus;|tri;)|vee;|wedge;)|y(?:ac(?:ute;?|y;)|c(?:irc;|y;)|en;?|fr;|icy;|opf;|scr;|u(?:cy;|ml;?))|z(?:acute;|c(?:aron;|y;)|dot;|e(?:etrf;|ta;)|fr;|hcy;|igrarr;|opf;|scr;|w(?:j;|nj;)))|[\s\S]/g).exec(r);
        if (!rt) {
          throw Error("should never happen");
        }
        var cn = rt[1];
        if (!cn) {
          m = Zy;
          return;
        }
        switch (s += cn.length, UKe(_, Xxm(cn)), f) {
          case Ln:
          case ct:
          case Br:
            if (cn[cn.length - 1] !== ";") {
              if (/[=A-Za-z0-9]/.test(r[s])) {
                m = Zy;
                return;
              }
            }
            break;
          default:
            break;
        }
        me();
        var Gn = $xm[cn];
        if (typeof Gn === "number") {
          _.push(Gn);
        } else {
          UKe(_, Gn);
        }
        m = Zy;
      }
      um.lookahead = -32;
      function jv(Je) {
        switch (h = 0, Je) {
          case 120:
          case 88:
            _.push(Je);
            m = ac;
            break;
          default:
            Xe(Je, id);
            break;
        }
      }
      function ac(Je) {
        switch (Je) {
          case 48:
          case 49:
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
            Xe(Je, Qy);
            break;
          default:
            Xe(Je, Zy);
            break;
        }
      }
      function id(Je) {
        switch (Je) {
          case 48:
          case 49:
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
            Xe(Je, jS);
            break;
          default:
            Xe(Je, Zy);
            break;
        }
      }
      function Qy(Je) {
        switch (Je) {
          case 65:
          case 66:
          case 67:
          case 68:
          case 69:
          case 70:
            h *= 16;
            h += Je - 55;
            break;
          case 97:
          case 98:
          case 99:
          case 100:
          case 101:
          case 102:
            h *= 16;
            h += Je - 87;
            break;
          case 48:
          case 49:
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
            h *= 16;
            h += Je - 48;
            break;
          case 59:
            m = Dc;
            break;
          default:
            Xe(Je, Dc);
            break;
        }
      }
      function jS(Je) {
        switch (Je) {
          case 48:
          case 49:
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
            h *= 10;
            h += Je - 48;
            break;
          case 59:
            m = Dc;
            break;
          default:
            Xe(Je, Dc);
            break;
        }
      }
      function Dc(Je) {
        if (h in oRl) {
          h = oRl[h];
        } else if (h > 1114111 || h >= 55296 && h < 57344) {
          h = 65533;
        }
        if (me(), h <= 65535) {
          _.push(h);
        } else {
          h = h - 65536;
          _.push(55296 + (h >> 10));
          _.push(56320 + (h & 1023));
        }
        Xe(Je, Zy);
      }
      function Zy(Je) {
        switch (f) {
          case Ln:
          case ct:
          case Br:
            S += uH(_);
            break;
          default:
            UKe(J, _);
            break;
        }
        Xe(Je, f);
      }
      function Ll(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if (rt = rt.replace(/^[\x09\x0A\x0C\x0D\x20]+/, ""), rt.length === 0) {
              return;
            }
            break;
          case 4:
            oe._appendChild(oe.createComment(rt));
            return;
          case 5:
            var $r = rt;
            var Ko = cn;
            var Sa = Gn;
            if (oe.appendChild(new Dxm(oe, $r, Ko, Sa)), z || $r.toLowerCase() !== "html" || (/^HTML$|^-\/\/W3O\/\/DTD W3 HTML Strict 3\.0\/\/EN\/\/$|^-\/W3C\/DTD HTML 4\.0 Transitional\/EN$|^\+\/\/Silmaril\/\/dtd html Pro v0r11 19970101\/\/|^-\/\/AdvaSoft Ltd\/\/DTD HTML 3\.0 asWedit \+ extensions\/\/|^-\/\/AS\/\/DTD HTML 3\.0 asWedit \+ extensions\/\/|^-\/\/IETF\/\/DTD HTML 2\.0 Level 1\/\/|^-\/\/IETF\/\/DTD HTML 2\.0 Level 2\/\/|^-\/\/IETF\/\/DTD HTML 2\.0 Strict Level 1\/\/|^-\/\/IETF\/\/DTD HTML 2\.0 Strict Level 2\/\/|^-\/\/IETF\/\/DTD HTML 2\.0 Strict\/\/|^-\/\/IETF\/\/DTD HTML 2\.0\/\/|^-\/\/IETF\/\/DTD HTML 2\.1E\/\/|^-\/\/IETF\/\/DTD HTML 3\.0\/\/|^-\/\/IETF\/\/DTD HTML 3\.2 Final\/\/|^-\/\/IETF\/\/DTD HTML 3\.2\/\/|^-\/\/IETF\/\/DTD HTML 3\/\/|^-\/\/IETF\/\/DTD HTML Level 0\/\/|^-\/\/IETF\/\/DTD HTML Level 1\/\/|^-\/\/IETF\/\/DTD HTML Level 2\/\/|^-\/\/IETF\/\/DTD HTML Level 3\/\/|^-\/\/IETF\/\/DTD HTML Strict Level 0\/\/|^-\/\/IETF\/\/DTD HTML Strict Level 1\/\/|^-\/\/IETF\/\/DTD HTML Strict Level 2\/\/|^-\/\/IETF\/\/DTD HTML Strict Level 3\/\/|^-\/\/IETF\/\/DTD HTML Strict\/\/|^-\/\/IETF\/\/DTD HTML\/\/|^-\/\/Metrius\/\/DTD Metrius Presentational\/\/|^-\/\/Microsoft\/\/DTD Internet Explorer 2\.0 HTML Strict\/\/|^-\/\/Microsoft\/\/DTD Internet Explorer 2\.0 HTML\/\/|^-\/\/Microsoft\/\/DTD Internet Explorer 2\.0 Tables\/\/|^-\/\/Microsoft\/\/DTD Internet Explorer 3\.0 HTML Strict\/\/|^-\/\/Microsoft\/\/DTD Internet Explorer 3\.0 HTML\/\/|^-\/\/Microsoft\/\/DTD Internet Explorer 3\.0 Tables\/\/|^-\/\/Netscape Comm\. Corp\.\/\/DTD HTML\/\/|^-\/\/Netscape Comm\. Corp\.\/\/DTD Strict HTML\/\/|^-\/\/O'Reilly and Associates\/\/DTD HTML 2\.0\/\/|^-\/\/O'Reilly and Associates\/\/DTD HTML Extended 1\.0\/\/|^-\/\/O'Reilly and Associates\/\/DTD HTML Extended Relaxed 1\.0\/\/|^-\/\/SoftQuad Software\/\/DTD HoTMetaL PRO 6\.0::19990601::extensions to HTML 4\.0\/\/|^-\/\/SoftQuad\/\/DTD HoTMetaL PRO 4\.0::19971010::extensions to HTML 4\.0\/\/|^-\/\/Spyglass\/\/DTD HTML 2\.0 Extended\/\/|^-\/\/SQ\/\/DTD HTML 2\.0 HoTMetaL \+ extensions\/\/|^-\/\/Sun Microsystems Corp\.\/\/DTD HotJava HTML\/\/|^-\/\/Sun Microsystems Corp\.\/\/DTD HotJava Strict HTML\/\/|^-\/\/W3C\/\/DTD HTML 3 1995-03-24\/\/|^-\/\/W3C\/\/DTD HTML 3\.2 Draft\/\/|^-\/\/W3C\/\/DTD HTML 3\.2 Final\/\/|^-\/\/W3C\/\/DTD HTML 3\.2\/\/|^-\/\/W3C\/\/DTD HTML 3\.2S Draft\/\/|^-\/\/W3C\/\/DTD HTML 4\.0 Frameset\/\/|^-\/\/W3C\/\/DTD HTML 4\.0 Transitional\/\/|^-\/\/W3C\/\/DTD HTML Experimental 19960712\/\/|^-\/\/W3C\/\/DTD HTML Experimental 970421\/\/|^-\/\/W3C\/\/DTD W3 HTML\/\/|^-\/\/W3O\/\/DTD W3 HTML 3\.0\/\/|^-\/\/WebTechs\/\/DTD Mozilla HTML 2\.0\/\/|^-\/\/WebTechs\/\/DTD Mozilla HTML\/\//i).test(Ko) || Sa && Sa.toLowerCase() === "http://www.ibm.com/data/dtd/v11/ibmxhtml1-transitional.dtd" || Sa === undefined && (/^-\/\/W3C\/\/DTD HTML 4\.01 Frameset\/\/|^-\/\/W3C\/\/DTD HTML 4\.01 Transitional\/\//i).test(Ko)) {
              oe._quirks = true;
            } else if ((/^-\/\/W3C\/\/DTD XHTML 1\.0 Frameset\/\/|^-\/\/W3C\/\/DTD XHTML 1\.0 Transitional\/\//i).test(Ko) || Sa !== undefined && (/^-\/\/W3C\/\/DTD HTML 4\.01 Frameset\/\/|^-\/\/W3C\/\/DTD HTML 4\.01 Transitional\/\//i).test(Ko)) {
              oe._limitedQuirks = true;
            }
            O = Mg;
            return;
        }
        oe._quirks = true;
        O = Mg;
        O(Je, rt, cn, Gn);
      }
      function Mg(Je, rt, cn, Gn) {
        var $r;
        switch (Je) {
          case 1:
            if (rt = rt.replace(/^[\x09\x0A\x0C\x0D\x20]+/, ""), rt.length === 0) {
              return;
            }
            break;
          case 5:
            return;
          case 4:
            oe._appendChild(oe.createComment(rt));
            return;
          case 2:
            if (rt === "html") {
              $r = wt(oe, rt, cn);
              P.push($r);
              oe.appendChild($r);
              O = PR;
              return;
            }
            break;
          case 3:
            switch (rt) {
              case "html":
              case "head":
              case "body":
              case "br":
                break;
              default:
                return;
            }
        }
        $r = wt(oe, "html", null);
        P.push($r);
        oe.appendChild($r);
        O = PR;
        O(Je, rt, cn, Gn);
      }
      function PR(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if (rt = rt.replace(/^[\x09\x0A\x0C\x0D\x20]+/, ""), rt.length === 0) {
              return;
            }
            break;
          case 5:
            return;
          case 4:
            It(rt);
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "head":
                var $r = yt(rt, cn);
                U = $r;
                O = $d;
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "html":
              case "head":
              case "body":
              case "br":
                break;
              default:
                return;
            }
        }
        PR(2, "head", null);
        O(Je, rt, cn, Gn);
      }
      function $d(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            var $r = rt.match(/^[\x09\x0A\x0C\x0D\x20]+/);
            if ($r) {
              Rt($r[0]);
              rt = rt.substring($r[0].length);
            }
            if (rt.length === 0) {
              return;
            }
            break;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "meta":
              case "base":
              case "basefont":
              case "bgsound":
              case "link":
                yt(rt, cn);
                P.pop();
                return;
              case "title":
                Xr(rt, cn);
                return;
              case "noscript":
                if (!W) {
                  yt(rt, cn);
                  O = up;
                  return;
                }
              case "noframes":
              case "style":
                jn(rt, cn);
                return;
              case "script":
                gt(function (Ko) {
                  var Sa = wt(Ko, rt, cn);
                  if (Sa._parser_inserted = true, Sa._force_async = false, H) {
                    Sa._already_started = true;
                  }
                  Ie();
                  return Sa;
                });
                m = Dt;
                M = O;
                O = db;
                return;
              case "template":
                yt(rt, cn);
                F.insertMarker();
                j = false;
                O = TP;
                L.push(O);
                return;
              case "head":
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "head":
                P.pop();
                O = ub;
                return;
              case "body":
              case "html":
              case "br":
                break;
              case "template":
                if (!P.contains("template")) {
                  return;
                }
                P.generateImpliedEndTags(null, "thorough");
                P.popTag("template");
                F.clearToMarker();
                L.pop();
                Sn();
                return;
              default:
                return;
            }
            break;
        }
        $d(3, "head", null);
        O(Je, rt, cn, Gn);
      }
      function up(Je, rt, cn, Gn) {
        switch (Je) {
          case 5:
            return;
          case 4:
            $d(Je, rt);
            return;
          case 1:
            var $r = rt.match(/^[\x09\x0A\x0C\x0D\x20]+/);
            if ($r) {
              $d(Je, $r[0]);
              rt = rt.substring($r[0].length);
            }
            if (rt.length === 0) {
              return;
            }
            break;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "basefont":
              case "bgsound":
              case "link":
              case "meta":
              case "noframes":
              case "style":
                $d(Je, rt, cn);
                return;
              case "head":
              case "noscript":
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "noscript":
                P.pop();
                O = $d;
                return;
              case "br":
                break;
              default:
                return;
            }
            break;
        }
        up(3, "noscript", null);
        O(Je, rt, cn, Gn);
      }
      function ub(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            var $r = rt.match(/^[\x09\x0A\x0C\x0D\x20]+/);
            if ($r) {
              Rt($r[0]);
              rt = rt.substring($r[0].length);
            }
            if (rt.length === 0) {
              return;
            }
            break;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "body":
                yt(rt, cn);
                j = false;
                O = ta;
                return;
              case "frameset":
                yt(rt, cn);
                O = Yn;
                return;
              case "base":
              case "basefont":
              case "bgsound":
              case "link":
              case "meta":
              case "noframes":
              case "script":
              case "style":
              case "template":
              case "title":
                P.push(U);
                $d(2, rt, cn);
                P.removeElement(U);
                return;
              case "head":
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "template":
                return $d(Je, rt, cn, Gn);
              case "body":
              case "html":
              case "br":
                break;
              default:
                return;
            }
            break;
        }
        ub(2, "body", null);
        j = true;
        O(Je, rt, cn, Gn);
      }
      function ta(Je, rt, cn, Gn) {
        var $r;
        var Ko;
        var Sa;
        var Pi;
        switch (Je) {
          case 1:
            if (Q) {
              if (rt = rt.replace(/\x00/g, ""), rt.length === 0) {
                return;
              }
            }
            if (j && (/[^\x09\x0A\x0C\x0D\x20]/).test(rt)) {
              j = false;
            }
            Yt();
            Rt(rt);
            return;
          case 5:
            return;
          case 4:
            It(rt);
            return;
          case -1:
            if (L.length) {
              return TP(Je);
            }
            Fe();
            return;
          case 2:
            switch (rt) {
              case "html":
                if (P.contains("template")) {
                  return;
                }
                mRl(cn, P.elements[0]);
                return;
              case "base":
              case "basefont":
              case "bgsound":
              case "link":
              case "meta":
              case "noframes":
              case "script":
              case "style":
              case "template":
              case "title":
                $d(2, rt, cn);
                return;
              case "body":
                if ($r = P.elements[1], !$r || !($r instanceof AS.HTMLBodyElement) || P.contains("template")) {
                  return;
                }
                j = false;
                mRl(cn, $r);
                return;
              case "frameset":
                if (!j) {
                  return;
                }
                if ($r = P.elements[1], !$r || !($r instanceof AS.HTMLBodyElement)) {
                  return;
                }
                if ($r.parentNode) {
                  $r.parentNode.removeChild($r);
                }
                while (!(P.top instanceof AS.HTMLHtmlElement)) {
                  P.pop();
                }
                yt(rt, cn);
                O = Yn;
                return;
              case "address":
              case "article":
              case "aside":
              case "blockquote":
              case "center":
              case "details":
              case "dialog":
              case "dir":
              case "div":
              case "dl":
              case "fieldset":
              case "figcaption":
              case "figure":
              case "footer":
              case "header":
              case "hgroup":
              case "main":
              case "nav":
              case "ol":
              case "p":
              case "section":
              case "summary":
              case "ul":
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                yt(rt, cn);
                return;
              case "menu":
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                if (IS(P.top, "menuitem")) {
                  P.pop();
                }
                yt(rt, cn);
                return;
              case "h1":
              case "h2":
              case "h3":
              case "h4":
              case "h5":
              case "h6":
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                if (P.top instanceof AS.HTMLHeadingElement) {
                  P.pop();
                }
                yt(rt, cn);
                return;
              case "pre":
              case "listing":
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                yt(rt, cn);
                Z = true;
                j = false;
                return;
              case "form":
                if (N && !P.contains("template")) {
                  return;
                }
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                if (Pi = yt(rt, cn), !P.contains("template")) {
                  N = Pi;
                }
                return;
              case "li":
                j = false;
                for (Ko = P.elements.length - 1; Ko >= 0; Ko--) {
                  if (Sa = P.elements[Ko], Sa instanceof AS.HTMLLIElement) {
                    ta(3, "li");
                    break;
                  }
                  if (IS(Sa, $Ke) && !IS(Sa, W1o)) {
                    break;
                  }
                }
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                yt(rt, cn);
                return;
              case "dd":
              case "dt":
                j = false;
                for (Ko = P.elements.length - 1; Ko >= 0; Ko--) {
                  if (Sa = P.elements[Ko], IS(Sa, hRl)) {
                    ta(3, Sa.localName);
                    break;
                  }
                  if (IS(Sa, $Ke) && !IS(Sa, W1o)) {
                    break;
                  }
                }
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                yt(rt, cn);
                return;
              case "plaintext":
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                yt(rt, cn);
                m = jt;
                return;
              case "button":
                if (P.inScope("button")) {
                  ta(3, "button");
                  O(Je, rt, cn, Gn);
                } else {
                  Yt();
                  yt(rt, cn);
                  j = false;
                }
                return;
              case "a":
                var Za = F.findElementByTag("a");
                if (Za) {
                  ta(3, rt);
                  F.remove(Za);
                  P.removeElement(Za);
                }
              case "b":
              case "big":
              case "code":
              case "em":
              case "font":
              case "i":
              case "s":
              case "small":
              case "strike":
              case "strong":
              case "tt":
              case "u":
                Yt();
                F.push(yt(rt, cn), cn);
                return;
              case "nobr":
                if (Yt(), P.inScope(rt)) {
                  ta(3, rt);
                  Yt();
                }
                F.push(yt(rt, cn), cn);
                return;
              case "applet":
              case "marquee":
              case "object":
                Yt();
                yt(rt, cn);
                F.insertMarker();
                j = false;
                return;
              case "table":
                if (!oe._quirks && P.inButtonScope("p")) {
                  ta(3, "p");
                }
                yt(rt, cn);
                j = false;
                O = Nf;
                return;
              case "area":
              case "br":
              case "embed":
              case "img":
              case "keygen":
              case "wbr":
                Yt();
                yt(rt, cn);
                P.pop();
                j = false;
                return;
              case "input":
                Yt();
                Pi = yt(rt, cn);
                P.pop();
                var Mu = Pi.getAttribute("type");
                if (!Mu || Mu.toLowerCase() !== "hidden") {
                  j = false;
                }
                return;
              case "param":
              case "source":
              case "track":
                yt(rt, cn);
                P.pop();
                return;
              case "hr":
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                if (IS(P.top, "menuitem")) {
                  P.pop();
                }
                yt(rt, cn);
                P.pop();
                j = false;
                return;
              case "image":
                ta(2, "img", cn, Gn);
                return;
              case "textarea":
                yt(rt, cn);
                Z = true;
                j = false;
                m = Gt;
                M = O;
                O = db;
                return;
              case "xmp":
                if (P.inButtonScope("p")) {
                  ta(3, "p");
                }
                Yt();
                j = false;
                jn(rt, cn);
                return;
              case "iframe":
                j = false;
                jn(rt, cn);
                return;
              case "noembed":
                jn(rt, cn);
                return;
              case "select":
                if (Yt(), yt(rt, cn), j = false, O === Nf || O === Vb || O === Jx || O === OR || O === UE) {
                  O = J0;
                } else {
                  O = qS;
                }
                return;
              case "optgroup":
              case "option":
                if (P.top instanceof AS.HTMLOptionElement) {
                  ta(3, "option");
                }
                Yt();
                yt(rt, cn);
                return;
              case "menuitem":
                if (IS(P.top, "menuitem")) {
                  P.pop();
                }
                Yt();
                yt(rt, cn);
                return;
              case "rb":
              case "rtc":
                if (P.inScope("ruby")) {
                  P.generateImpliedEndTags();
                }
                yt(rt, cn);
                return;
              case "rp":
              case "rt":
                if (P.inScope("ruby")) {
                  P.generateImpliedEndTags("rtc");
                }
                yt(rt, cn);
                return;
              case "math":
                if (Yt(), pRl(cn), q1o(cn), Ft(rt, cn, pd.MATHML), Gn) {
                  P.pop();
                }
                return;
              case "svg":
                if (Yt(), dRl(cn), q1o(cn), Ft(rt, cn, pd.SVG), Gn) {
                  P.pop();
                }
                return;
              case "caption":
              case "col":
              case "colgroup":
              case "frame":
              case "head":
              case "tbody":
              case "td":
              case "tfoot":
              case "th":
              case "thead":
              case "tr":
                return;
            }
            Yt();
            yt(rt, cn);
            return;
          case 3:
            switch (rt) {
              case "template":
                $d(3, rt, cn);
                return;
              case "body":
                if (!P.inScope("body")) {
                  return;
                }
                O = Xx;
                return;
              case "html":
                if (!P.inScope("body")) {
                  return;
                }
                O = Xx;
                O(Je, rt, cn);
                return;
              case "address":
              case "article":
              case "aside":
              case "blockquote":
              case "button":
              case "center":
              case "details":
              case "dialog":
              case "dir":
              case "div":
              case "dl":
              case "fieldset":
              case "figcaption":
              case "figure":
              case "footer":
              case "header":
              case "hgroup":
              case "listing":
              case "main":
              case "menu":
              case "nav":
              case "ol":
              case "pre":
              case "section":
              case "summary":
              case "ul":
                if (!P.inScope(rt)) {
                  return;
                }
                P.generateImpliedEndTags();
                P.popTag(rt);
                return;
              case "form":
                if (!P.contains("template")) {
                  var wu = N;
                  if (N = null, !wu || !P.elementInScope(wu)) {
                    return;
                  }
                  P.generateImpliedEndTags();
                  P.removeElement(wu);
                } else {
                  if (!P.inScope("form")) {
                    return;
                  }
                  P.generateImpliedEndTags();
                  P.popTag("form");
                }
                return;
              case "p":
                if (!P.inButtonScope(rt)) {
                  ta(2, rt, null);
                  O(Je, rt, cn, Gn);
                } else {
                  P.generateImpliedEndTags(rt);
                  P.popTag(rt);
                }
                return;
              case "li":
                if (!P.inListItemScope(rt)) {
                  return;
                }
                P.generateImpliedEndTags(rt);
                P.popTag(rt);
                return;
              case "dd":
              case "dt":
                if (!P.inScope(rt)) {
                  return;
                }
                P.generateImpliedEndTags(rt);
                P.popTag(rt);
                return;
              case "h1":
              case "h2":
              case "h3":
              case "h4":
              case "h5":
              case "h6":
                if (!P.elementTypeInScope(AS.HTMLHeadingElement)) {
                  return;
                }
                P.generateImpliedEndTags();
                P.popElementType(AS.HTMLHeadingElement);
                return;
              case "sarcasm":
                break;
              case "a":
              case "b":
              case "big":
              case "code":
              case "em":
              case "font":
              case "i":
              case "nobr":
              case "s":
              case "small":
              case "strike":
              case "strong":
              case "tt":
              case "u":
                var Lf = Re(rt);
                if (Lf) {
                  return;
                }
                break;
              case "applet":
              case "marquee":
              case "object":
                if (!P.inScope(rt)) {
                  return;
                }
                P.generateImpliedEndTags();
                P.popTag(rt);
                F.clearToMarker();
                return;
              case "br":
                ta(2, rt, null);
                return;
            }
            for (Ko = P.elements.length - 1; Ko >= 0; Ko--) {
              if (Sa = P.elements[Ko], IS(Sa, rt)) {
                P.generateImpliedEndTags(rt);
                P.popElement(Sa);
                break;
              } else if (IS(Sa, $Ke)) {
                return;
              }
            }
            return;
        }
      }
      function db(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            Rt(rt);
            return;
          case -1:
            if (P.top instanceof AS.HTMLScriptElement) {
              P.top._already_started = true;
            }
            P.pop();
            O = M;
            O(Je);
            return;
          case 3:
            if (rt === "script") {
              Ce();
            } else {
              P.pop();
              O = M;
            }
            return;
          default:
            return;
        }
      }
      function Nf(Je, rt, cn, Gn) {
        function $r(Sa) {
          for (var Pi = 0, Za = Sa.length; Pi < Za; Pi++) {
            if (Sa[Pi][0] === "type") {
              return Sa[Pi][1].toLowerCase();
            }
          }
          return null;
        }
        switch (Je) {
          case 1:
            if (K) {
              ta(Je, rt, cn, Gn);
              return;
            } else if (IS(P.top, kTt)) {
              V = [];
              M = O;
              O = iC;
              O(Je, rt, cn, Gn);
              return;
            }
            break;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case 2:
            switch (rt) {
              case "caption":
                P.clearToContext(per);
                F.insertMarker();
                yt(rt, cn);
                O = Vb;
                return;
              case "colgroup":
                P.clearToContext(per);
                yt(rt, cn);
                O = e_;
                return;
              case "col":
                Nf(2, "colgroup", null);
                O(Je, rt, cn, Gn);
                return;
              case "tbody":
              case "tfoot":
              case "thead":
                P.clearToContext(per);
                yt(rt, cn);
                O = Jx;
                return;
              case "td":
              case "th":
              case "tr":
                Nf(2, "tbody", null);
                O(Je, rt, cn, Gn);
                return;
              case "table":
                if (!P.inTableScope(rt)) {
                  return;
                }
                Nf(3, rt);
                O(Je, rt, cn, Gn);
                return;
              case "style":
              case "script":
              case "template":
                $d(Je, rt, cn, Gn);
                return;
              case "input":
                var Ko = $r(cn);
                if (Ko !== "hidden") {
                  break;
                }
                yt(rt, cn);
                P.pop();
                return;
              case "form":
                if (N || P.contains("template")) {
                  return;
                }
                N = yt(rt, cn);
                P.popElement(N);
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "table":
                if (!P.inTableScope(rt)) {
                  return;
                }
                P.popTag(rt);
                Sn();
                return;
              case "body":
              case "caption":
              case "col":
              case "colgroup":
              case "html":
              case "tbody":
              case "td":
              case "tfoot":
              case "th":
              case "thead":
              case "tr":
                return;
              case "template":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
          case -1:
            ta(Je, rt, cn, Gn);
            return;
        }
        vt = true;
        ta(Je, rt, cn, Gn);
        vt = false;
      }
      function iC(Je, rt, cn, Gn) {
        if (Je === 1) {
          if (Q) {
            if (rt = rt.replace(/\x00/g, ""), rt.length === 0) {
              return;
            }
          }
          V.push(rt);
        } else {
          var $r = V.join("");
          if (V.length = 0, (/[^\x09\x0A\x0C\x0D\x20]/).test($r)) {
            vt = true;
            ta(1, $r);
            vt = false;
          } else {
            Rt($r);
          }
          O = M;
          O(Je, rt, cn, Gn);
        }
      }
      function Vb(Je, rt, cn, Gn) {
        function $r() {
          if (!P.inTableScope("caption")) {
            return false;
          }
          P.generateImpliedEndTags();
          P.popTag("caption");
          F.clearToMarker();
          O = Nf;
          return true;
        }
        switch (Je) {
          case 2:
            switch (rt) {
              case "caption":
              case "col":
              case "colgroup":
              case "tbody":
              case "td":
              case "tfoot":
              case "th":
              case "thead":
              case "tr":
                if ($r()) {
                  O(Je, rt, cn, Gn);
                }
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "caption":
                $r();
                return;
              case "table":
                if ($r()) {
                  O(Je, rt, cn, Gn);
                }
                return;
              case "body":
              case "col":
              case "colgroup":
              case "html":
              case "tbody":
              case "td":
              case "tfoot":
              case "th":
              case "thead":
              case "tr":
                return;
            }
            break;
        }
        ta(Je, rt, cn, Gn);
      }
      function e_(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            var $r = rt.match(/^[\x09\x0A\x0C\x0D\x20]+/);
            if ($r) {
              Rt($r[0]);
              rt = rt.substring($r[0].length);
            }
            if (rt.length === 0) {
              return;
            }
            break;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "col":
                yt(rt, cn);
                P.pop();
                return;
              case "template":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "colgroup":
                if (!IS(P.top, "colgroup")) {
                  return;
                }
                P.pop();
                O = Nf;
                return;
              case "col":
                return;
              case "template":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
          case -1:
            ta(Je, rt, cn, Gn);
            return;
        }
        if (!IS(P.top, "colgroup")) {
          return;
        }
        e_(3, "colgroup");
        O(Je, rt, cn, Gn);
      }
      function Jx(Je, rt, cn, Gn) {
        function $r() {
          if (!P.inTableScope("tbody") && !P.inTableScope("thead") && !P.inTableScope("tfoot")) {
            return;
          }
          P.clearToContext(mer);
          Jx(3, P.top.localName, null);
          O(Je, rt, cn, Gn);
        }
        switch (Je) {
          case 2:
            switch (rt) {
              case "tr":
                P.clearToContext(mer);
                yt(rt, cn);
                O = OR;
                return;
              case "th":
              case "td":
                Jx(2, "tr", null);
                O(Je, rt, cn, Gn);
                return;
              case "caption":
              case "col":
              case "colgroup":
              case "tbody":
              case "tfoot":
              case "thead":
                $r();
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "table":
                $r();
                return;
              case "tbody":
              case "tfoot":
              case "thead":
                if (P.inTableScope(rt)) {
                  P.clearToContext(mer);
                  P.pop();
                  O = Nf;
                }
                return;
              case "body":
              case "caption":
              case "col":
              case "colgroup":
              case "html":
              case "td":
              case "th":
              case "tr":
                return;
            }
            break;
        }
        Nf(Je, rt, cn, Gn);
      }
      function OR(Je, rt, cn, Gn) {
        function $r() {
          if (!P.inTableScope("tr")) {
            return false;
          }
          P.clearToContext(G1o);
          P.pop();
          O = Jx;
          return true;
        }
        switch (Je) {
          case 2:
            switch (rt) {
              case "th":
              case "td":
                P.clearToContext(G1o);
                yt(rt, cn);
                O = UE;
                F.insertMarker();
                return;
              case "caption":
              case "col":
              case "colgroup":
              case "tbody":
              case "tfoot":
              case "thead":
              case "tr":
                if ($r()) {
                  O(Je, rt, cn, Gn);
                }
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "tr":
                $r();
                return;
              case "table":
                if ($r()) {
                  O(Je, rt, cn, Gn);
                }
                return;
              case "tbody":
              case "tfoot":
              case "thead":
                if (P.inTableScope(rt)) {
                  if ($r()) {
                    O(Je, rt, cn, Gn);
                  }
                }
                return;
              case "body":
              case "caption":
              case "col":
              case "colgroup":
              case "html":
              case "td":
              case "th":
                return;
            }
            break;
        }
        Nf(Je, rt, cn, Gn);
      }
      function UE(Je, rt, cn, Gn) {
        switch (Je) {
          case 2:
            switch (rt) {
              case "caption":
              case "col":
              case "colgroup":
              case "tbody":
              case "td":
              case "tfoot":
              case "th":
              case "thead":
              case "tr":
                if (P.inTableScope("td")) {
                  UE(3, "td");
                  O(Je, rt, cn, Gn);
                } else if (P.inTableScope("th")) {
                  UE(3, "th");
                  O(Je, rt, cn, Gn);
                }
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "td":
              case "th":
                if (!P.inTableScope(rt)) {
                  return;
                }
                P.generateImpliedEndTags();
                P.popTag(rt);
                F.clearToMarker();
                O = OR;
                return;
              case "body":
              case "caption":
              case "col":
              case "colgroup":
              case "html":
                return;
              case "table":
              case "tbody":
              case "tfoot":
              case "thead":
              case "tr":
                if (!P.inTableScope(rt)) {
                  return;
                }
                UE(3, P.inTableScope("td") ? "td" : "th");
                O(Je, rt, cn, Gn);
                return;
            }
            break;
        }
        ta(Je, rt, cn, Gn);
      }
      function qS(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if (Q) {
              if (rt = rt.replace(/\x00/g, ""), rt.length === 0) {
                return;
              }
            }
            Rt(rt);
            return;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case -1:
            ta(Je, rt, cn, Gn);
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "option":
                if (P.top instanceof AS.HTMLOptionElement) {
                  qS(3, rt);
                }
                yt(rt, cn);
                return;
              case "optgroup":
                if (P.top instanceof AS.HTMLOptionElement) {
                  qS(3, "option");
                }
                if (P.top instanceof AS.HTMLOptGroupElement) {
                  qS(3, rt);
                }
                yt(rt, cn);
                return;
              case "select":
                qS(3, rt);
                return;
              case "input":
              case "keygen":
              case "textarea":
                if (!P.inSelectScope("select")) {
                  return;
                }
                qS(3, "select");
                O(Je, rt, cn, Gn);
                return;
              case "script":
              case "template":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
          case 3:
            switch (rt) {
              case "optgroup":
                if (P.top instanceof AS.HTMLOptionElement && P.elements[P.elements.length - 2] instanceof AS.HTMLOptGroupElement) {
                  qS(3, "option");
                }
                if (P.top instanceof AS.HTMLOptGroupElement) {
                  P.pop();
                }
                return;
              case "option":
                if (P.top instanceof AS.HTMLOptionElement) {
                  P.pop();
                }
                return;
              case "select":
                if (!P.inSelectScope(rt)) {
                  return;
                }
                P.popTag(rt);
                Sn();
                return;
              case "template":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
        }
      }
      function J0(Je, rt, cn, Gn) {
        switch (rt) {
          case "caption":
          case "table":
          case "tbody":
          case "tfoot":
          case "thead":
          case "tr":
          case "td":
          case "th":
            switch (Je) {
              case 2:
                J0(3, "select");
                O(Je, rt, cn, Gn);
                return;
              case 3:
                if (P.inTableScope(rt)) {
                  J0(3, "select");
                  O(Je, rt, cn, Gn);
                }
                return;
            }
        }
        qS(Je, rt, cn, Gn);
      }
      function TP(Je, rt, cn, Gn) {
        function $r(Ko) {
          O = Ko;
          L[L.length - 1] = O;
          O(Je, rt, cn, Gn);
        }
        switch (Je) {
          case 1:
          case 4:
          case 5:
            ta(Je, rt, cn, Gn);
            return;
          case -1:
            if (!P.contains("template")) {
              Fe();
            } else {
              P.popTag("template");
              F.clearToMarker();
              L.pop();
              Sn();
              O(Je, rt, cn, Gn);
            }
            return;
          case 2:
            switch (rt) {
              case "base":
              case "basefont":
              case "bgsound":
              case "link":
              case "meta":
              case "noframes":
              case "script":
              case "style":
              case "template":
              case "title":
                $d(Je, rt, cn, Gn);
                return;
              case "caption":
              case "colgroup":
              case "tbody":
              case "tfoot":
              case "thead":
                $r(Nf);
                return;
              case "col":
                $r(e_);
                return;
              case "tr":
                $r(Jx);
                return;
              case "td":
              case "th":
                $r(OR);
                return;
            }
            $r(ta);
            return;
          case 3:
            switch (rt) {
              case "template":
                $d(Je, rt, cn, Gn);
                return;
              default:
                return;
            }
        }
      }
      function Xx(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if ((/[^\x09\x0A\x0C\x0D\x20]/).test(rt)) {
              break;
            }
            ta(Je, rt);
            return;
          case 4:
            P.elements[0]._appendChild(oe.createComment(rt));
            return;
          case 5:
            return;
          case -1:
            Fe();
            return;
          case 2:
            if (rt === "html") {
              ta(Je, rt, cn, Gn);
              return;
            }
            break;
          case 3:
            if (rt === "html") {
              if (H) {
                return;
              }
              O = Ui;
              return;
            }
            break;
        }
        O = ta;
        O(Je, rt, cn, Gn);
      }
      function Yn(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if (rt = rt.replace(/[^\x09\x0A\x0C\x0D\x20]/g, ""), rt.length > 0) {
              Rt(rt);
            }
            return;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case -1:
            Fe();
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "frameset":
                yt(rt, cn);
                return;
              case "frame":
                yt(rt, cn);
                P.pop();
                return;
              case "noframes":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
          case 3:
            if (rt === "frameset") {
              if (H && P.top instanceof AS.HTMLHtmlElement) {
                return;
              }
              if (P.pop(), !H && !(P.top instanceof AS.HTMLFrameSetElement)) {
                O = ks;
              }
              return;
            }
            break;
        }
      }
      function ks(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if (rt = rt.replace(/[^\x09\x0A\x0C\x0D\x20]/g, ""), rt.length > 0) {
              Rt(rt);
            }
            return;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case -1:
            Fe();
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "noframes":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
          case 3:
            if (rt === "html") {
              O = Ca;
              return;
            }
            break;
        }
      }
      function Ui(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if ((/[^\x09\x0A\x0C\x0D\x20]/).test(rt)) {
              break;
            }
            ta(Je, rt, cn, Gn);
            return;
          case 4:
            oe._appendChild(oe.createComment(rt));
            return;
          case 5:
            ta(Je, rt, cn, Gn);
            return;
          case -1:
            Fe();
            return;
          case 2:
            if (rt === "html") {
              ta(Je, rt, cn, Gn);
              return;
            }
            break;
        }
        O = ta;
        O(Je, rt, cn, Gn);
      }
      function Ca(Je, rt, cn, Gn) {
        switch (Je) {
          case 1:
            if (rt = rt.replace(/[^\x09\x0A\x0C\x0D\x20]/g, ""), rt.length > 0) {
              ta(Je, rt, cn, Gn);
            }
            return;
          case 4:
            oe._appendChild(oe.createComment(rt));
            return;
          case 5:
            ta(Je, rt, cn, Gn);
            return;
          case -1:
            Fe();
            return;
          case 2:
            switch (rt) {
              case "html":
                ta(Je, rt, cn, Gn);
                return;
              case "noframes":
                $d(Je, rt, cn, Gn);
                return;
            }
            break;
        }
      }
      function gc(Je, rt, cn, Gn) {
        function $r(Za) {
          for (var Mu = 0, wu = Za.length; Mu < wu; Mu++) {
            switch (Za[Mu][0]) {
              case "color":
              case "face":
              case "size":
                return true;
            }
          }
          return false;
        }
        var Ko;
        switch (Je) {
          case 1:
            if (j && (/[^\x00\x09\x0A\x0C\x0D\x20]/).test(rt)) {
              j = false;
            }
            if (Q) {
              rt = rt.replace(/\x00/g, "\uFFFD");
            }
            Rt(rt);
            return;
          case 4:
            It(rt);
            return;
          case 5:
            return;
          case 2:
            switch (rt) {
              case "font":
                if (!$r(cn)) {
                  break;
                }
              case "b":
              case "big":
              case "blockquote":
              case "body":
              case "br":
              case "center":
              case "code":
              case "dd":
              case "div":
              case "dl":
              case "dt":
              case "em":
              case "embed":
              case "h1":
              case "h2":
              case "h3":
              case "h4":
              case "h5":
              case "h6":
              case "head":
              case "hr":
              case "i":
              case "img":
              case "li":
              case "listing":
              case "menu":
              case "meta":
              case "nobr":
              case "ol":
              case "p":
              case "pre":
              case "ruby":
              case "s":
              case "small":
              case "span":
              case "strong":
              case "strike":
              case "sub":
              case "sup":
              case "table":
              case "tt":
              case "u":
              case "ul":
              case "var":
                if (H) {
                  break;
                }
                do {
                  P.pop();
                  Ko = P.top;
                } while (Ko.namespaceURI !== pd.HTML && !cRl(Ko) && !uRl(Ko));
                ht(Je, rt, cn, Gn);
                return;
            }
            if (Ko = P.elements.length === 1 && H ? t : P.top, Ko.namespaceURI === pd.MATHML) {
              pRl(cn);
            } else if (Ko.namespaceURI === pd.SVG) {
              rt = Qxm(rt);
              dRl(cn);
            }
            if (q1o(cn), Ft(rt, cn, Ko.namespaceURI), Gn) {
              if (rt === "script" && Ko.namespaceURI === pd.SVG) {
                ;
              }
              P.pop();
            }
            return;
          case 3:
            if (Ko = P.top, rt === "script" && Ko.namespaceURI === pd.SVG && Ko.localName === "script") {
              P.pop();
            } else {
              var Sa = P.elements.length - 1;
              var Pi = P.elements[Sa];
              for (;;) {
                if (Pi.localName.toLowerCase() === rt) {
                  P.popElement(Pi);
                  break;
                }
                if (Pi = P.elements[--Sa], Pi.namespaceURI !== pd.HTML) {
                  continue;
                }
                O(Je, rt, cn, Gn);
                break;
              }
            }
            return;
        }
      }
      ne.testTokenizer = function (Je, rt, cn, Gn) {
        var $r = [];
        switch (rt) {
          case "PCDATA state":
            m = He;
            break;
          case "RCDATA state":
            m = Gt;
            break;
          case "RAWTEXT state":
            m = mt;
            break;
          case "PLAINTEXT state":
            m = jt;
            break;
        }
        if (cn) {
          y = cn;
        }
        if (ht = function (Sa, Pi, Za, Mu) {
          switch (Ie(), Sa) {
            case 1:
              if ($r.length > 0 && $r[$r.length - 1][0] === "Character") {
                $r[$r.length - 1][1] += Pi;
              } else {
                $r.push(["Character", Pi]);
              }
              break;
            case 4:
              $r.push(["Comment", Pi]);
              break;
            case 5:
              $r.push(["DOCTYPE", Pi, Za === undefined ? null : Za, Mu === undefined ? null : Mu, !z]);
              break;
            case 2:
              var wu = Object.create(null);
              for (var Lf = 0; Lf < Za.length; Lf++) {
                var DT = Za[Lf];
                if (DT.length === 1) {
                  wu[DT[0]] = "";
                } else {
                  wu[DT[0]] = DT[1];
                }
              }
              var hy = ["StartTag", Pi, wu];
              if (Mu) {
                hy.push(true);
              }
              $r.push(hy);
              break;
            case 3:
              $r.push(["EndTag", Pi]);
              break;
            case -1:
              break;
          }
        }, !Gn) {
          this.parse(Je, true);
        } else {
          for (var Ko = 0; Ko < Je.length; Ko++) {
            this.parse(Je[Ko]);
          }
          this.parse("", true);
        }
        return $r;
      };
      return ne;
    }
  });
  var TYt = __commonJS((r3b, RRl) => {
    RRl.exports = CRl;
    var vRl = ier();
    var wRl = ler();
    var Zxm = her();
    var ger = O0();
    var ekm = qZn();
    function CRl(e) {
      this.contextObject = e;
    }
    var tkm = {
      xml: {
        "": true,
        "1.0": true,
        "2.0": true
      },
      core: {
        "": true,
        "2.0": true
      },
      html: {
        "": true,
        "1.0": true,
        "2.0": true
      },
      xhtml: {
        "": true,
        "1.0": true,
        "2.0": true
      }
    };
    CRl.prototype = {
      hasFeature: function (t, n) {
        var r = tkm[(t || "").toLowerCase()];
        return r && r[n || ""] || false;
      },
      createDocumentType: function (t, n, r) {
        if (!ekm.isValidQName(t)) {
          ger.InvalidCharacterError();
        }
        return new wRl(this.contextObject, t, n, r);
      },
      createDocument: function (t, n, r) {
        var o = new vRl(false, null);
        var s;
        if (n) {
          s = o.createElementNS(t, n);
        } else {
          s = null;
        }
        if (r) {
          o.appendChild(r);
        }
        if (s) {
          o.appendChild(s);
        }
        if (t === ger.NAMESPACE.HTML) {
          o._contentType = "application/xhtml+xml";
        } else if (t === ger.NAMESPACE.SVG) {
          o._contentType = "image/svg+xml";
        } else {
          o._contentType = "application/xml";
        }
        return o;
      },
      createHTMLDocument: function (t) {
        var n = new vRl(true, null);
        n.appendChild(new wRl(n, "html"));
        var r = n.createElement("html");
        n.appendChild(r);
        var o = n.createElement("head");
        if (r.appendChild(o), t !== undefined) {
          var s = n.createElement("title");
          o.appendChild(s);
          s.appendChild(n.createTextNode(t));
        }
        r.appendChild(n.createElement("body"));
        n.modclock = 1;
        return n;
      },
      mozSetOutputMutationHandler: function (e, t) {
        e.mutationHandler = t;
      },
      mozGetInputMutationHandler: function (e) {
        ger.nyi();
      },
      mozHTMLParser: Zxm
    };
  });
  var kRl = __commonJS((o3b, xRl) => {
    var nkm = ZZn();
    var rkm = D1o();
    xRl.exports = z1o;
    function z1o(e, t) {
      this._window = e;
      this._href = t;
    }
    z1o.prototype = Object.create(rkm.prototype, {
      constructor: {
        value: z1o
      },
      href: {
        get: function () {
          return this._href;
        },
        set: function (e) {
          this.assign(e);
        }
      },
      assign: {
        value: function (e) {
          var t = new nkm(this._href);
          var n = t.resolve(e);
          this._href = n;
        }
      },
      replace: {
        value: function (e) {
          this.assign(e);
        }
      },
      reload: {
        value: function () {
          this.assign(this.href);
        }
      },
      toString: {
        value: function () {
          return this.href;
        }
      }
    });
  });
  var IRl = __commonJS((s3b, ARl) => {
    var okm = Object.create(null, {
      appCodeName: {
        value: "Mozilla"
      },
      appName: {
        value: "Netscape"
      },
      appVersion: {
        value: "4.0"
      },
      platform: {
        value: ""
      },
      product: {
        value: "Gecko"
      },
      productSub: {
        value: "20100101"
      },
      userAgent: {
        value: ""
      },
      vendor: {
        value: ""
      },
      vendorSub: {
        value: ""
      },
      taintEnabled: {
        value: function () {
          return false;
        }
      }
    });
    ARl.exports = okm;
  });
  var ORl = __commonJS((i3b, PRl) => {
    var skm = {
      setTimeout,
      clearTimeout,
      setInterval,
      clearInterval
    };
    PRl.exports = skm;
  });
  var Y1o = __commonJS((EYt, DRl) => {
    var K1o = O0();
    EYt = DRl.exports = {
      CSSStyleDeclaration: eer(),
      CharacterData: pYt(),
      Comment: b1o(),
      DOMException: UZn(),
      DOMImplementation: TYt(),
      DOMTokenList: n1o(),
      Document: ier(),
      DocumentFragment: T1o(),
      DocumentType: ler(),
      Element: STt(),
      HTMLParser: her(),
      NamedNodeMap: l1o(),
      Node: VU(),
      NodeList: LKe(),
      NodeFilter: gYt(),
      ProcessingInstruction: v1o(),
      Text: y1o(),
      Window: J1o()
    };
    K1o.merge(EYt, O1o());
    K1o.merge(EYt, rer().elements);
    K1o.merge(EYt, U1o().elements);
  });
  var J1o = __commonJS((a3b, MRl) => {
    var ikm = TYt();
    var akm = UNo();
    var lkm = kRl();
    var vYt = O0();
    MRl.exports = yer;
    function yer(e) {
      this.document = e || new ikm(null).createHTMLDocument("");
      this.document._scripting_enabled = true;
      this.document.defaultView = this;
      this.location = new lkm(this, this.document._address || "about:blank");
    }
    yer.prototype = Object.create(akm.prototype, {
      console: {
        value: console
      },
      history: {
        value: {
          back: vYt.nyi,
          forward: vYt.nyi,
          go: vYt.nyi
        }
      },
      navigator: {
        value: IRl()
      },
      window: {
        get: function () {
          return this;
        }
      },
      self: {
        get: function () {
          return this;
        }
      },
      frames: {
        get: function () {
          return this;
        }
      },
      parent: {
        get: function () {
          return this;
        }
      },
      top: {
        get: function () {
          return this;
        }
      },
      length: {
        value: 0
      },
      frameElement: {
        value: null
      },
      opener: {
        value: null
      },
      onload: {
        get: function () {
          return this._getEventHandler("load");
        },
        set: function (e) {
          this._setEventHandler("load", e);
        }
      },
      getComputedStyle: {
        value: function (t) {
          return t.style;
        }
      }
    });
    vYt.expose(ORl(), yer);
    vYt.expose(Y1o(), yer);
  });
  var URl = __commonJS(HKe => {
    var NRl = TYt();
    var LRl = her();
    var l3b = J1o();
    var FRl = Y1o();
    HKe.createDOMImplementation = function () {
      return new NRl(null);
    };
    HKe.createDocument = function (e, t) {
      if (e || t) {
        var n = new LRl();
        n.parse(e || "", true);
        return n.document();
      }
      return new NRl(null).createHTMLDocument("");
    };
    HKe.createIncrementalHTMLParser = function () {
      var e = new LRl();
      return {
        write: function (t) {
          if (t.length > 0) {
            e.parse(t, false, function () {
              return true;
            });
          }
        },
        end: function (t) {
          e.parse(t || "", true, function () {
            return true;
          });
        },
        process: function (t) {
          return e.parse("", false, t);
        },
        document: function () {
          return e.document();
        }
      };
    };
    HKe.createWindow = function (e, t) {
      var n = HKe.createDocument(e);
      if (t !== undefined) {
        n._address = t;
      }
      return new FRl.Window(n);
    };
    HKe.impl = FRl;
  });