  var zzr = __commonJS((S0i, s0n) => {
    (function (e) {
      var t;
      var n = /^-?(?:\d+(?:\.\d*)?|\.\d+)(?:e[+-]?\d+)?$/i;
      var r = Math.ceil;
      var o = Math.floor;
      var s = "[BigNumber Error] ";
      var i = s + "Number primitive has more than 15 significant digits: ";
      var a = 100000000000000;
      var l = 14;
      var c = 9007199254740991;
      var u = [1, 10, 100, 1000, 1e4, 1e5, 1e6, 1e7, 1e8, 1e9, 10000000000, 100000000000, 1000000000000, 10000000000000];
      var d = 1e7;
      var p = 1e9;
      function m(E) {
        var C;
        var x;
        var A;
        var k = K.prototype = {
          constructor: K,
          toString: null,
          valueOf: null
        };
        var I = new K(1);
        var O = 20;
        var M = 4;
        var L = -7;
        var P = 21;
        var F = -1e7;
        var H = 1e7;
        var U = false;
        var N = 1;
        var W = 0;
        var j = {
          prefix: "",
          groupSize: 3,
          secondaryGroupSize: 0,
          groupSeparator: ",",
          decimalSeparator: ".",
          fractionGroupSize: 0,
          fractionGroupSeparator: "\xA0",
          suffix: ""
        };
        var z = "0123456789abcdefghijklmnopqrstuvwxyz";
        var V = true;
        function K(ee, re) {
          var se;
          var ae;
          var de;
          var be;
          var fe;
          var me;
          var Te;
          var ue;
          var ce = this;
          if (!(ce instanceof K)) {
            return new K(ee, re);
          }
          if (re == null) {
            if (ee && ee._isBigNumber === true) {
              if (ce.s = ee.s, !ee.c || ee.e > H) {
                ce.c = ce.e = null;
              } else if (ee.e < F) {
                ce.c = [ce.e = 0];
              } else {
                ce.e = ee.e;
                ce.c = ee.c.slice();
              }
              return;
            }
            if ((me = typeof ee == "number") && ee * 0 == 0) {
              if (ce.s = 1 / ee < 0 ? (ee = -ee, -1) : 1, ee === ~~ee) {
                for (be = 0, fe = ee; fe >= 10; fe /= 10, be++) {
                  ;
                }
                if (be > H) {
                  ce.c = ce.e = null;
                } else {
                  ce.e = be;
                  ce.c = [ee];
                }
                return;
              }
              ue = String(ee);
            } else {
              if (!n.test(ue = String(ee))) {
                return A(ce, ue, me);
              }
              ce.s = ue.charCodeAt(0) == 45 ? (ue = ue.slice(1), -1) : 1;
            }
            if ((be = ue.indexOf(".")) > -1) {
              ue = ue.replace(".", "");
            }
            if ((fe = ue.search(/e/i)) > 0) {
              if (be < 0) {
                be = fe;
              }
              be += +ue.slice(fe + 1);
              ue = ue.substring(0, fe);
            } else if (be < 0) {
              be = ue.length;
            }
          } else {
            if (y(re, 2, z.length, "Base"), re == 10 && V) {
              ce = new K(ee);
              return ne(ce, O + ce.e + 1, M);
            }
            if (ue = String(ee), me = typeof ee == "number") {
              if (ee * 0 != 0) {
                return A(ce, ue, me, re);
              }
              if (ce.s = 1 / ee < 0 ? (ue = ue.slice(1), -1) : 1, K.DEBUG && ue.replace(/^0\.0*|\./, "").length > 15) {
                throw Error(i + ee);
              }
            } else {
              ce.s = ue.charCodeAt(0) === 45 ? (ue = ue.slice(1), -1) : 1;
            }
            se = z.slice(0, re);
            be = fe = 0;
            for (Te = ue.length; fe < Te; fe++) {
              if (se.indexOf(ae = ue.charAt(fe)) < 0) {
                if (ae == ".") {
                  if (fe > be) {
                    be = Te;
                    continue;
                  }
                } else if (!de) {
                  if (ue == ue.toUpperCase() && (ue = ue.toLowerCase()) || ue == ue.toLowerCase() && (ue = ue.toUpperCase())) {
                    de = true;
                    fe = -1;
                    be = 0;
                    continue;
                  }
                }
                return A(ce, String(ee), me, re);
              }
            }
            if (me = false, ue = x(ue, re, 10, ce.s), (be = ue.indexOf(".")) > -1) {
              ue = ue.replace(".", "");
            } else {
              be = ue.length;
            }
          }
          for (fe = 0; ue.charCodeAt(fe) === 48; fe++) {
            ;
          }
          for (Te = ue.length; ue.charCodeAt(--Te) === 48;) {
            ;
          }
          if (ue = ue.slice(fe, ++Te)) {
            if (Te -= fe, me && K.DEBUG && Te > 15 && (ee > c || ee !== o(ee))) {
              throw Error(i + ce.s * ee);
            }
            if ((be = be - fe - 1) > H) {
              ce.c = ce.e = null;
            } else if (be < F) {
              ce.c = [ce.e = 0];
            } else {
              if (ce.e = be, ce.c = [], fe = (be + 1) % l, be < 0) {
                fe += l;
              }
              if (fe < Te) {
                if (fe) {
                  ce.c.push(+ue.slice(0, fe));
                }
                for (Te -= l; fe < Te;) {
                  ce.c.push(+ue.slice(fe, fe += l));
                }
                fe = l - (ue = ue.slice(fe)).length;
              } else {
                fe -= Te;
              }
              for (; fe--; ue += "0") {
                ;
              }
              ce.c.push(+ue);
            }
          } else {
            ce.c = [ce.e = 0];
          }
        }
        K.clone = m;
        K.ROUND_UP = 0;
        K.ROUND_DOWN = 1;
        K.ROUND_CEIL = 2;
        K.ROUND_FLOOR = 3;
        K.ROUND_HALF_UP = 4;
        K.ROUND_HALF_DOWN = 5;
        K.ROUND_HALF_EVEN = 6;
        K.ROUND_HALF_CEIL = 7;
        K.ROUND_HALF_FLOOR = 8;
        K.EUCLID = 9;
        K.config = K.set = function (ee) {
          var re;
          var se;
          if (ee != null) {
            if (typeof ee == "object") {
              if (ee.hasOwnProperty(re = "DECIMAL_PLACES")) {
                se = ee[re];
                y(se, 0, p, re);
                O = se;
              }
              if (ee.hasOwnProperty(re = "ROUNDING_MODE")) {
                se = ee[re];
                y(se, 0, 8, re);
                M = se;
              }
              if (ee.hasOwnProperty(re = "EXPONENTIAL_AT")) {
                if (se = ee[re], se && se.pop) {
                  y(se[0], -p, 0, re);
                  y(se[1], 0, p, re);
                  L = se[0];
                  P = se[1];
                } else {
                  y(se, -p, p, re);
                  L = -(P = se < 0 ? -se : se);
                }
              }
              if (ee.hasOwnProperty(re = "RANGE")) {
                if (se = ee[re], se && se.pop) {
                  y(se[0], -p, -1, re);
                  y(se[1], 1, p, re);
                  F = se[0];
                  H = se[1];
                } else if (y(se, -p, p, re), se) {
                  F = -(H = se < 0 ? -se : se);
                } else {
                  throw Error(s + re + " cannot be zero: " + se);
                }
              }
              if (ee.hasOwnProperty(re = "CRYPTO")) {
                if (se = ee[re], se === !!se) {
                  if (se) {
                    if (typeof crypto < "u" && crypto && (crypto.getRandomValues || crypto.randomBytes)) {
                      U = se;
                    } else {
                      throw U = !se, Error(s + "crypto unavailable");
                    }
                  } else {
                    U = se;
                  }
                } else {
                  throw Error(s + re + " not true or false: " + se);
                }
              }
              if (ee.hasOwnProperty(re = "MODULO_MODE")) {
                se = ee[re];
                y(se, 0, 9, re);
                N = se;
              }
              if (ee.hasOwnProperty(re = "POW_PRECISION")) {
                se = ee[re];
                y(se, 0, p, re);
                W = se;
              }
              if (ee.hasOwnProperty(re = "FORMAT")) {
                if (se = ee[re], typeof se == "object") {
                  j = se;
                } else {
                  throw Error(s + re + " not an object: " + se);
                }
              }
              if (ee.hasOwnProperty(re = "ALPHABET")) {
                if (se = ee[re], typeof se == "string" && !/^.?$|[+\-.\s]|(.).*\1/.test(se)) {
                  V = se.slice(0, 10) == "0123456789";
                  z = se;
                } else {
                  throw Error(s + re + " invalid: " + se);
                }
              }
            } else {
              throw Error(s + "Object expected: " + ee);
            }
          }
          return {
            DECIMAL_PLACES: O,
            ROUNDING_MODE: M,
            EXPONENTIAL_AT: [L, P],
            RANGE: [F, H],
            CRYPTO: U,
            MODULO_MODE: N,
            POW_PRECISION: W,
            FORMAT: j,
            ALPHABET: z
          };
        };
        K.isBigNumber = function (ee) {
          if (!ee || ee._isBigNumber !== true) {
            return false;
          }
          if (!K.DEBUG) {
            return true;
          }
          var re;
          var se;
          var ae = ee.c;
          var de = ee.e;
          var be = ee.s;
          e: if ({}.toString.call(ae) == "[object Array]") {
            if ((be === 1 || be === -1) && de >= -p && de <= p && de === o(de)) {
              if (ae[0] === 0) {
                if (de === 0 && ae.length === 1) {
                  return true;
                }
                break e;
              }
              if (re = (de + 1) % l, re < 1) {
                re += l;
              }
              if (String(ae[0]).length == re) {
                for (re = 0; re < ae.length; re++) {
                  if (se = ae[re], se < 0 || se >= a || se !== o(se)) {
                    break e;
                  }
                }
                if (se !== 0) {
                  return true;
                }
              }
            }
          } else if (ae === null && de === null && (be === null || be === 1 || be === -1)) {
            return true;
          }
          throw Error(s + "Invalid BigNumber: " + ee);
        };
        K.maximum = K.max = function () {
          return Q(arguments, -1);
        };
        K.minimum = K.min = function () {
          return Q(arguments, 1);
        };
        K.random = function () {
          var ee = 9007199254740992;
          var re = Math.random() * ee & 2097151 ? function () {
            return o(Math.random() * ee);
          } : function () {
            return (Math.random() * 1073741824 | 0) * 8388608 + (Math.random() * 8388608 | 0);
          };
          return function (se) {
            var ae;
            var de;
            var be;
            var fe;
            var me;
            var Te = 0;
            var ue = [];
            var ce = new K(I);
            if (se == null) {
              se = O;
            } else {
              y(se, 0, p);
            }
            if (fe = r(se / l), U) {
              if (crypto.getRandomValues) {
                ae = crypto.getRandomValues(new Uint32Array(fe *= 2));
                for (; Te < fe;) {
                  if (me = ae[Te] * 131072 + (ae[Te + 1] >>> 11), me >= 9000000000000000) {
                    de = crypto.getRandomValues(new Uint32Array(2));
                    ae[Te] = de[0];
                    ae[Te + 1] = de[1];
                  } else {
                    ue.push(me % 100000000000000);
                    Te += 2;
                  }
                }
                Te = fe / 2;
              } else if (crypto.randomBytes) {
                ae = crypto.randomBytes(fe *= 7);
                for (; Te < fe;) {
                  if (me = (ae[Te] & 31) * 281474976710656 + ae[Te + 1] * 1099511627776 + ae[Te + 2] * 4294967296 + ae[Te + 3] * 16777216 + (ae[Te + 4] << 16) + (ae[Te + 5] << 8) + ae[Te + 6], me >= 9000000000000000) {
                    crypto.randomBytes(7).copy(ae, Te);
                  } else {
                    ue.push(me % 100000000000000);
                    Te += 7;
                  }
                }
                Te = fe / 7;
              } else {
                throw U = false, Error(s + "crypto unavailable");
              }
            }
            if (!U) {
              for (; Te < fe;) {
                if (me = re(), me < 9000000000000000) {
                  ue[Te++] = me % 100000000000000;
                }
              }
            }
            if (fe = ue[--Te], se %= l, fe && se) {
              me = u[l - se];
              ue[Te] = o(fe / me) * me;
            }
            for (; ue[Te] === 0; ue.pop(), Te--) {
              ;
            }
            if (Te < 0) {
              ue = [be = 0];
            } else {
              for (be = -1; ue[0] === 0; ue.splice(0, 1), be -= l) {
                ;
              }
              for (Te = 1, me = ue[0]; me >= 10; me /= 10, Te++) {
                ;
              }
              if (Te < l) {
                be -= l - Te;
              }
            }
            ce.e = be;
            ce.c = ue;
            return ce;
          };
        }();
        K.sum = function () {
          var ee = 1;
          var re = arguments;
          var se = new K(re[0]);
          for (; ee < re.length;) {
            se = se.plus(re[ee++]);
          }
          return se;
        };
        x = function () {
          var ee = "0123456789";
          function re(se, ae, de, be) {
            var fe;
            var me = [0];
            var Te;
            var ue = 0;
            var ce = se.length;
            for (; ue < ce;) {
              for (Te = me.length; Te--; me[Te] *= ae) {
                ;
              }
              me[0] += be.indexOf(se.charAt(ue++));
              for (fe = 0; fe < me.length; fe++) {
                if (me[fe] > de - 1) {
                  if (me[fe + 1] == null) {
                    me[fe + 1] = 0;
                  }
                  me[fe + 1] += me[fe] / de | 0;
                  me[fe] %= de;
                }
              }
            }
            return me.reverse();
          }
          return function (se, ae, de, be, fe) {
            var me;
            var Te;
            var ue;
            var ce;
            var le;
            var pe;
            var ve;
            var _e;
            var xe = se.indexOf(".");
            var ke = O;
            var Ie = M;
            if (xe >= 0) {
              ce = W;
              W = 0;
              se = se.replace(".", "");
              _e = new K(ae);
              pe = _e.pow(se.length - xe);
              W = ce;
              _e.c = re(S(h(pe.c), pe.e, "0"), 10, de, ee);
              _e.e = _e.c.length;
            }
            ve = re(se, ae, de, fe ? (me = z, ee) : (me = ee, z));
            ue = ce = ve.length;
            for (; ve[--ce] == 0; ve.pop()) {
              ;
            }
            if (!ve[0]) {
              return me.charAt(0);
            }
            if (xe < 0) {
              --ue;
            } else {
              pe.c = ve;
              pe.e = ue;
              pe.s = be;
              pe = C(pe, _e, ke, Ie, de);
              ve = pe.c;
              le = pe.r;
              ue = pe.e;
            }
            if (Te = ue + ke + 1, xe = ve[Te], ce = de / 2, le = le || Te < 0 || ve[Te + 1] != null, le = Ie < 4 ? (xe != null || le) && (Ie == 0 || Ie == (pe.s < 0 ? 3 : 2)) : xe > ce || xe == ce && (Ie == 4 || le || Ie == 6 && ve[Te - 1] & 1 || Ie == (pe.s < 0 ? 8 : 7)), Te < 1 || !ve[0]) {
              se = le ? S(me.charAt(1), -ke, me.charAt(0)) : me.charAt(0);
            } else {
              if (ve.length = Te, le) {
                for (--de; ++ve[--Te] > de;) {
                  if (ve[Te] = 0, !Te) {
                    ++ue;
                    ve = [1].concat(ve);
                  }
                }
              }
              for (ce = ve.length; !ve[--ce];) {
                ;
              }
              for (xe = 0, se = ""; xe <= ce; se += me.charAt(ve[xe++])) {
                ;
              }
              se = S(se, ue, me.charAt(0));
            }
            return se;
          };
        }();
        C = function () {
          function ee(ae, de, be) {
            var fe;
            var me;
            var Te;
            var ue;
            var ce = 0;
            var le = ae.length;
            var pe = de % d;
            var ve = de / d | 0;
            for (ae = ae.slice(); le--;) {
              Te = ae[le] % d;
              ue = ae[le] / d | 0;
              fe = ve * Te + ue * pe;
              me = pe * Te + fe % d * d + ce;
              ce = (me / be | 0) + (fe / d | 0) + ve * ue;
              ae[le] = me % be;
            }
            if (ce) {
              ae = [ce].concat(ae);
            }
            return ae;
          }
          function re(ae, de, be, fe) {
            var me;
            var Te;
            if (be != fe) {
              Te = be > fe ? 1 : -1;
            } else {
              for (me = Te = 0; me < be; me++) {
                if (ae[me] != de[me]) {
                  Te = ae[me] > de[me] ? 1 : -1;
                  break;
                }
              }
            }
            return Te;
          }
          function se(ae, de, be, fe) {
            var me = 0;
            for (; be--;) {
              ae[be] -= me;
              me = ae[be] < de[be] ? 1 : 0;
              ae[be] = me * fe + ae[be] - de[be];
            }
            for (; !ae[0] && ae.length > 1; ae.splice(0, 1)) {
              ;
            }
          }
          return function (ae, de, be, fe, me) {
            var Te;
            var ue;
            var ce;
            var le;
            var pe;
            var ve;
            var _e;
            var xe;
            var ke;
            var Ie;
            var Ue;
            var Ge;
            var Be;
            var We;
            var Ze;
            var Tt;
            var kt;
            var Ye = ae.s == de.s ? 1 : -1;
            var ht = ae.c;
            var It = de.c;
            if (!ht || !ht[0] || !It || !It[0]) {
              return new K(!ae.s || !de.s || (ht ? It && ht[0] == It[0] : !It) ? NaN : ht && ht[0] == 0 || !It ? Ye * 0 : Ye / 0);
            }
            if (xe = new K(Ye), ke = xe.c = [], ue = ae.e - de.e, Ye = be + ue + 1, !me) {
              me = a;
              ue = f(ae.e / l) - f(de.e / l);
              Ye = Ye / l | 0;
            }
            for (ce = 0; It[ce] == (ht[ce] || 0); ce++) {
              ;
            }
            if (It[ce] > (ht[ce] || 0)) {
              ue--;
            }
            if (Ye < 0) {
              ke.push(1);
              le = true;
            } else {
              if (We = ht.length, Tt = It.length, ce = 0, Ye += 2, pe = o(me / (It[0] + 1)), pe > 1) {
                It = ee(It, pe, me);
                ht = ee(ht, pe, me);
                Tt = It.length;
                We = ht.length;
              }
              Be = Tt;
              Ie = ht.slice(0, Tt);
              Ue = Ie.length;
              for (; Ue < Tt; Ie[Ue++] = 0) {
                ;
              }
              if (kt = It.slice(), kt = [0].concat(kt), Ze = It[0], It[1] >= me / 2) {
                Ze++;
              }
              do {
                if (pe = 0, Te = re(It, Ie, Tt, Ue), Te < 0) {
                  if (Ge = Ie[0], Tt != Ue) {
                    Ge = Ge * me + (Ie[1] || 0);
                  }
                  if (pe = o(Ge / Ze), pe > 1) {
                    if (pe >= me) {
                      pe = me - 1;
                    }
                    ve = ee(It, pe, me);
                    _e = ve.length;
                    Ue = Ie.length;
                    while (re(ve, Ie, _e, Ue) == 1) {
                      pe--;
                      se(ve, Tt < _e ? kt : It, _e, me);
                      _e = ve.length;
                      Te = 1;
                    }
                  } else {
                    if (pe == 0) {
                      Te = pe = 1;
                    }
                    ve = It.slice();
                    _e = ve.length;
                  }
                  if (_e < Ue) {
                    ve = [0].concat(ve);
                  }
                  if (se(Ie, ve, Ue, me), Ue = Ie.length, Te == -1) {
                    while (re(It, Ie, Tt, Ue) < 1) {
                      pe++;
                      se(Ie, Tt < Ue ? kt : It, Ue, me);
                      Ue = Ie.length;
                    }
                  }
                } else if (Te === 0) {
                  pe++;
                  Ie = [0];
                }
                if (ke[ce++] = pe, Ie[0]) {
                  Ie[Ue++] = ht[Be] || 0;
                } else {
                  Ie = [ht[Be]];
                  Ue = 1;
                }
              } while ((Be++ < We || Ie[0] != null) && Ye--);
              if (le = Ie[0] != null, !ke[0]) {
                ke.splice(0, 1);
              }
            }
            if (me == a) {
              for (ce = 1, Ye = ke[0]; Ye >= 10; Ye /= 10, ce++) {
                ;
              }
              ne(xe, be + (xe.e = ce + ue * l - 1) + 1, fe, le);
            } else {
              xe.e = ue;
              xe.r = +le;
            }
            return xe;
          };
        }();
        function J(ee, re, se, ae) {
          var de;
          var be;
          var fe;
          var me;
          var Te;
          if (se == null) {
            se = M;
          } else {
            y(se, 0, 8);
          }
          if (!ee.c) {
            return ee.toString();
          }
          if (de = ee.c[0], fe = ee.e, re == null) {
            Te = h(ee.c);
            Te = ae == 1 || ae == 2 && (fe <= L || fe >= P) ? b(Te, fe) : S(Te, fe, "0");
          } else if (ee = ne(new K(ee), re, se), be = ee.e, Te = h(ee.c), me = Te.length, ae == 1 || ae == 2 && (re <= be || be <= L)) {
            for (; me < re; Te += "0", me++) {
              ;
            }
            Te = b(Te, be);
          } else if (re -= fe, Te = S(Te, be, "0"), be + 1 > me) {
            if (--re > 0) {
              for (Te += "."; re--; Te += "0") {
                ;
              }
            }
          } else if (re += be - me, re > 0) {
            if (be + 1 == me) {
              Te += ".";
            }
            for (; re--; Te += "0") {
              ;
            }
          }
          return ee.s < 0 && de ? "-" + Te : Te;
        }
        function Q(ee, re) {
          var se;
          var ae;
          var de = 1;
          var be = new K(ee[0]);
          for (; de < ee.length; de++) {
            if (ae = new K(ee[de]), !ae.s || (se = g(be, ae)) === re || se === 0 && be.s === re) {
              be = ae;
            }
          }
          return be;
        }
        function Z(ee, re, se) {
          var ae = 1;
          var de = re.length;
          for (; !re[--de]; re.pop()) {
            ;
          }
          for (de = re[0]; de >= 10; de /= 10, ae++) {
            ;
          }
          if ((se = ae + se * l - 1) > H) {
            ee.c = ee.e = null;
          } else if (se < F) {
            ee.c = [ee.e = 0];
          } else {
            ee.e = se;
            ee.c = re;
          }
          return ee;
        }
        A = function () {
          var ee = /^(-?)0([xbo])(?=\w[\w.]*$)/i;
          var re = /^([^.]+)\.$/;
          var se = /^\.([^.]+)$/;
          var ae = /^-?(Infinity|NaN)$/;
          var de = /^\s*\+(?=[\w.])|^\s+|\s+$/g;
          return function (be, fe, me, Te) {
            var ue;
            var ce = me ? fe : fe.replace(de, "");
            if (ae.test(ce)) {
              be.s = isNaN(ce) ? null : ce < 0 ? -1 : 1;
            } else {
              if (!me) {
                if (ce = ce.replace(ee, function (le, pe, ve) {
                  ue = (ve = ve.toLowerCase()) == "x" ? 16 : ve == "b" ? 2 : 8;
                  return !Te || Te == ue ? pe : le;
                }), Te) {
                  ue = Te;
                  ce = ce.replace(re, "$1").replace(se, "0.$1");
                }
                if (fe != ce) {
                  return new K(ce, ue);
                }
              }
              if (K.DEBUG) {
                throw Error(s + "Not a" + (Te ? " base " + Te : "") + " number: " + fe);
              }
              be.s = null;
            }
            be.c = be.e = null;
          };
        }();
        function ne(ee, re, se, ae) {
          var de;
          var be;
          var fe;
          var me;
          var Te;
          var ue;
          var ce;
          var le = ee.c;
          var pe = u;
          if (le) {
            e: {
              for (de = 1, me = le[0]; me >= 10; me /= 10, de++) {
                ;
              }
              if (be = re - de, be < 0) {
                be += l;
                fe = re;
                Te = le[ue = 0];
                ce = o(Te / pe[de - fe - 1] % 10);
              } else if (ue = r((be + 1) / l), ue >= le.length) {
                if (ae) {
                  for (; le.length <= ue; le.push(0)) {
                    ;
                  }
                  Te = ce = 0;
                  de = 1;
                  be %= l;
                  fe = be - l + 1;
                } else {
                  break e;
                }
              } else {
                Te = me = le[ue];
                for (de = 1; me >= 10; me /= 10, de++) {
                  ;
                }
                be %= l;
                fe = be - l + de;
                ce = fe < 0 ? 0 : o(Te / pe[de - fe - 1] % 10);
              }
              if (ae = ae || re < 0 || le[ue + 1] != null || (fe < 0 ? Te : Te % pe[de - fe - 1]), ae = se < 4 ? (ce || ae) && (se == 0 || se == (ee.s < 0 ? 3 : 2)) : ce > 5 || ce == 5 && (se == 4 || ae || se == 6 && (be > 0 ? fe > 0 ? Te / pe[de - fe] : 0 : le[ue - 1]) % 10 & 1 || se == (ee.s < 0 ? 8 : 7)), re < 1 || !le[0]) {
                if (le.length = 0, ae) {
                  re -= ee.e + 1;
                  le[0] = pe[(l - re % l) % l];
                  ee.e = -re || 0;
                } else {
                  le[0] = ee.e = 0;
                }
                return ee;
              }
              if (be == 0) {
                le.length = ue;
                me = 1;
                ue--;
              } else {
                le.length = ue + 1;
                me = pe[l - be];
                le[ue] = fe > 0 ? o(Te / pe[de - fe] % pe[fe]) * me : 0;
              }
              if (ae) {
                for (;;) {
                  if (ue == 0) {
                    for (be = 1, fe = le[0]; fe >= 10; fe /= 10, be++) {
                      ;
                    }
                    fe = le[0] += me;
                    for (me = 1; fe >= 10; fe /= 10, me++) {
                      ;
                    }
                    if (be != me) {
                      if (ee.e++, le[0] == a) {
                        le[0] = 1;
                      }
                    }
                    break;
                  } else {
                    if (le[ue] += me, le[ue] != a) {
                      break;
                    }
                    le[ue--] = 0;
                    me = 1;
                  }
                }
              }
              for (be = le.length; le[--be] === 0; le.pop()) {
                ;
              }
            }
            if (ee.e > H) {
              ee.c = ee.e = null;
            } else if (ee.e < F) {
              ee.c = [ee.e = 0];
            }
          }
          return ee;
        }
        function oe(ee) {
          var re;
          var se = ee.e;
          if (se === null) {
            return ee.toString();
          }
          re = h(ee.c);
          re = se <= L || se >= P ? b(re, se) : S(re, se, "0");
          return ee.s < 0 ? "-" + re : re;
        }
        if (k.absoluteValue = k.abs = function () {
          var ee = new K(this);
          if (ee.s < 0) {
            ee.s = 1;
          }
          return ee;
        }, k.comparedTo = function (ee, re) {
          return g(this, new K(ee, re));
        }, k.decimalPlaces = k.dp = function (ee, re) {
          var se;
          var ae;
          var de;
          var be = this;
          if (ee != null) {
            if (y(ee, 0, p), re == null) {
              re = M;
            } else {
              y(re, 0, 8);
            }
            return ne(new K(be), ee + be.e + 1, re);
          }
          if (!(se = be.c)) {
            return null;
          }
          if (ae = ((de = se.length - 1) - f(this.e / l)) * l, de = se[de]) {
            for (; de % 10 == 0; de /= 10, ae--) {
              ;
            }
          }
          if (ae < 0) {
            ae = 0;
          }
          return ae;
        }, k.dividedBy = k.div = function (ee, re) {
          return C(this, new K(ee, re), O, M);
        }, k.dividedToIntegerBy = k.idiv = function (ee, re) {
          return C(this, new K(ee, re), 0, 1);
        }, k.exponentiatedBy = k.pow = function (ee, re) {
          var se;
          var ae;
          var de;
          var be;
          var fe;
          var me;
          var Te;
          var ue;
          var ce;
          var le = this;
          if (ee = new K(ee), ee.c && !ee.isInteger()) {
            throw Error(s + "Exponent not an integer: " + oe(ee));
          }
          if (re != null) {
            re = new K(re);
          }
          if (me = ee.e > 14, !le.c || !le.c[0] || le.c[0] == 1 && !le.e && le.c.length == 1 || !ee.c || !ee.c[0]) {
            ce = new K(Math.pow(+oe(le), me ? ee.s * (2 - _(ee)) : +oe(ee)));
            return re ? ce.mod(re) : ce;
          }
          if (Te = ee.s < 0, re) {
            if (re.c ? !re.c[0] : !re.s) {
              return new K(NaN);
            }
            if (ae = !Te && le.isInteger() && re.isInteger(), ae) {
              le = le.mod(re);
            }
          } else if (ee.e > 9 && (le.e > 0 || le.e < -1 || (le.e == 0 ? le.c[0] > 1 || me && le.c[1] >= 240000000 : le.c[0] < 80000000000000 || me && le.c[0] <= 99999750000000))) {
            if (be = le.s < 0 && _(ee) ? -0 : 0, le.e > -1) {
              be = 1 / be;
            }
            return new K(Te ? 1 / be : be);
          } else if (W) {
            be = r(W / l + 2);
          }
          if (me) {
            if (se = new K(0.5), Te) {
              ee.s = 1;
            }
            ue = _(ee);
          } else {
            de = Math.abs(+oe(ee));
            ue = de % 2;
          }
          ce = new K(I);
          for (;;) {
            if (ue) {
              if (ce = ce.times(le), !ce.c) {
                break;
              }
              if (be) {
                if (ce.c.length > be) {
                  ce.c.length = be;
                }
              } else if (ae) {
                ce = ce.mod(re);
              }
            }
            if (de) {
              if (de = o(de / 2), de === 0) {
                break;
              }
              ue = de % 2;
            } else if (ee = ee.times(se), ne(ee, ee.e + 1, 1), ee.e > 14) {
              ue = _(ee);
            } else {
              if (de = +oe(ee), de === 0) {
                break;
              }
              ue = de % 2;
            }
            if (le = le.times(le), be) {
              if (le.c && le.c.length > be) {
                le.c.length = be;
              }
            } else if (ae) {
              le = le.mod(re);
            }
          }
          if (ae) {
            return ce;
          }
          if (Te) {
            ce = I.div(ce);
          }
          return re ? ce.mod(re) : be ? ne(ce, W, M, fe) : ce;
        }, k.integerValue = function (ee) {
          var re = new K(this);
          if (ee == null) {
            ee = M;
          } else {
            y(ee, 0, 8);
          }
          return ne(re, re.e + 1, ee);
        }, k.isEqualTo = k.eq = function (ee, re) {
          return g(this, new K(ee, re)) === 0;
        }, k.isFinite = function () {
          return !!this.c;
        }, k.isGreaterThan = k.gt = function (ee, re) {
          return g(this, new K(ee, re)) > 0;
        }, k.isGreaterThanOrEqualTo = k.gte = function (ee, re) {
          return (re = g(this, new K(ee, re))) === 1 || re === 0;
        }, k.isInteger = function () {
          return !!this.c && f(this.e / l) > this.c.length - 2;
        }, k.isLessThan = k.lt = function (ee, re) {
          return g(this, new K(ee, re)) < 0;
        }, k.isLessThanOrEqualTo = k.lte = function (ee, re) {
          return (re = g(this, new K(ee, re))) === -1 || re === 0;
        }, k.isNaN = function () {
          return !this.s;
        }, k.isNegative = function () {
          return this.s < 0;
        }, k.isPositive = function () {
          return this.s > 0;
        }, k.isZero = function () {
          return !!this.c && this.c[0] == 0;
        }, k.minus = function (ee, re) {
          var se;
          var ae;
          var de;
          var be;
          var fe = this;
          var me = fe.s;
          if (ee = new K(ee, re), re = ee.s, !me || !re) {
            return new K(NaN);
          }
          if (me != re) {
            ee.s = -re;
            return fe.plus(ee);
          }
          var Te = fe.e / l;
          var ue = ee.e / l;
          var ce = fe.c;
          var le = ee.c;
          if (!Te || !ue) {
            if (!ce || !le) {
              return ce ? (ee.s = -re, ee) : new K(le ? fe : NaN);
            }
            if (!ce[0] || !le[0]) {
              return le[0] ? (ee.s = -re, ee) : new K(ce[0] ? fe : M == 3 ? -0 : 0);
            }
          }
          if (Te = f(Te), ue = f(ue), ce = ce.slice(), me = Te - ue) {
            if (be = me < 0) {
              me = -me;
              de = ce;
            } else {
              ue = Te;
              de = le;
            }
            de.reverse();
            for (re = me; re--; de.push(0)) {
              ;
            }
            de.reverse();
          } else {
            ae = (be = (me = ce.length) < (re = le.length)) ? me : re;
            for (me = re = 0; re < ae; re++) {
              if (ce[re] != le[re]) {
                be = ce[re] < le[re];
                break;
              }
            }
          }
          if (be) {
            de = ce;
            ce = le;
            le = de;
            ee.s = -ee.s;
          }
          if (re = (ae = le.length) - (se = ce.length), re > 0) {
            for (; re--; ce[se++] = 0) {
              ;
            }
          }
          re = a - 1;
          for (; ae > me;) {
            if (ce[--ae] < le[ae]) {
              for (se = ae; se && !ce[--se]; ce[se] = re) {
                ;
              }
              --ce[se];
              ce[ae] += a;
            }
            ce[ae] -= le[ae];
          }
          for (; ce[0] == 0; ce.splice(0, 1), --ue) {
            ;
          }
          if (!ce[0]) {
            ee.s = M == 3 ? -1 : 1;
            ee.c = [ee.e = 0];
            return ee;
          }
          return Z(ee, ce, ue);
        }, k.modulo = k.mod = function (ee, re) {
          var se;
          var ae;
          var de = this;
          if (ee = new K(ee, re), !de.c || !ee.s || ee.c && !ee.c[0]) {
            return new K(NaN);
          } else if (!ee.c || de.c && !de.c[0]) {
            return new K(de);
          }
          if (N == 9) {
            ae = ee.s;
            ee.s = 1;
            se = C(de, ee, 0, 3);
            ee.s = ae;
            se.s *= ae;
          } else {
            se = C(de, ee, 0, N);
          }
          if (ee = de.minus(se.times(ee)), !ee.c[0] && N == 1) {
            ee.s = de.s;
          }
          return ee;
        }, k.multipliedBy = k.times = function (ee, re) {
          var se;
          var ae;
          var de;
          var be;
          var fe;
          var me;
          var Te;
          var ue;
          var ce;
          var le;
          var pe;
          var ve;
          var _e;
          var xe;
          var ke;
          var Ie = this;
          var Ue = Ie.c;
          var Ge = (ee = new K(ee, re)).c;
          if (!Ue || !Ge || !Ue[0] || !Ge[0]) {
            if (!Ie.s || !ee.s || Ue && !Ue[0] && !Ge || Ge && !Ge[0] && !Ue) {
              ee.c = ee.e = ee.s = null;
            } else if (ee.s *= Ie.s, !Ue || !Ge) {
              ee.c = ee.e = null;
            } else {
              ee.c = [0];
              ee.e = 0;
            }
            return ee;
          }
          if (ae = f(Ie.e / l) + f(ee.e / l), ee.s *= Ie.s, Te = Ue.length, le = Ge.length, Te < le) {
            _e = Ue;
            Ue = Ge;
            Ge = _e;
            de = Te;
            Te = le;
            le = de;
          }
          for (de = Te + le, _e = []; de--; _e.push(0)) {
            ;
          }
          xe = a;
          ke = d;
          for (de = le; --de >= 0;) {
            se = 0;
            pe = Ge[de] % ke;
            ve = Ge[de] / ke | 0;
            for (fe = Te, be = de + fe; be > de;) {
              ue = Ue[--fe] % ke;
              ce = Ue[fe] / ke | 0;
              me = ve * ue + ce * pe;
              ue = pe * ue + me % ke * ke + _e[be] + se;
              se = (ue / xe | 0) + (me / ke | 0) + ve * ce;
              _e[be--] = ue % xe;
            }
            _e[be] = se;
          }
          if (se) {
            ++ae;
          } else {
            _e.splice(0, 1);
          }
          return Z(ee, _e, ae);
        }, k.negated = function () {
          var ee = new K(this);
          ee.s = -ee.s || null;
          return ee;
        }, k.plus = function (ee, re) {
          var se;
          var ae = this;
          var de = ae.s;
          if (ee = new K(ee, re), re = ee.s, !de || !re) {
            return new K(NaN);
          }
          if (de != re) {
            ee.s = -re;
            return ae.minus(ee);
          }
          var be = ae.e / l;
          var fe = ee.e / l;
          var me = ae.c;
          var Te = ee.c;
          if (!be || !fe) {
            if (!me || !Te) {
              return new K(de / 0);
            }
            if (!me[0] || !Te[0]) {
              return Te[0] ? ee : new K(me[0] ? ae : de * 0);
            }
          }
          if (be = f(be), fe = f(fe), me = me.slice(), de = be - fe) {
            if (de > 0) {
              fe = be;
              se = Te;
            } else {
              de = -de;
              se = me;
            }
            se.reverse();
            for (; de--; se.push(0)) {
              ;
            }
            se.reverse();
          }
          if (de = me.length, re = Te.length, de - re < 0) {
            se = Te;
            Te = me;
            me = se;
            re = de;
          }
          for (de = 0; re;) {
            de = (me[--re] = me[re] + Te[re] + de) / a | 0;
            me[re] = a === me[re] ? 0 : me[re] % a;
          }
          if (de) {
            me = [de].concat(me);
            ++fe;
          }
          return Z(ee, me, fe);
        }, k.precision = k.sd = function (ee, re) {
          var se;
          var ae;
          var de;
          var be = this;
          if (ee != null && ee !== !!ee) {
            if (y(ee, 1, p), re == null) {
              re = M;
            } else {
              y(re, 0, 8);
            }
            return ne(new K(be), ee, re);
          }
          if (!(se = be.c)) {
            return null;
          }
          if (de = se.length - 1, ae = de * l + 1, de = se[de]) {
            for (; de % 10 == 0; de /= 10, ae--) {
              ;
            }
            for (de = se[0]; de >= 10; de /= 10, ae++) {
              ;
            }
          }
          if (ee && be.e + 1 > ae) {
            ae = be.e + 1;
          }
          return ae;
        }, k.shiftedBy = function (ee) {
          y(ee, -c, c);
          return this.times("1e" + ee);
        }, k.squareRoot = k.sqrt = function () {
          var ee;
          var re;
          var se;
          var ae;
          var de;
          var be = this;
          var fe = be.c;
          var me = be.s;
          var Te = be.e;
          var ue = O + 4;
          var ce = new K("0.5");
          if (me !== 1 || !fe || !fe[0]) {
            return new K(!me || me < 0 && (!fe || fe[0]) ? NaN : fe ? be : 1 / 0);
          }
          if (me = Math.sqrt(+oe(be)), me == 0 || me == 1 / 0) {
            if (re = h(fe), (re.length + Te) % 2 == 0) {
              re += "0";
            }
            if (me = Math.sqrt(+re), Te = f((Te + 1) / 2) - (Te < 0 || Te % 2), me == 1 / 0) {
              re = "5e" + Te;
            } else {
              re = me.toExponential();
              re = re.slice(0, re.indexOf("e") + 1) + Te;
            }
            se = new K(re);
          } else {
            se = new K(me + "");
          }
          if (se.c[0]) {
            if (Te = se.e, me = Te + ue, me < 3) {
              me = 0;
            }
            for (;;) {
              if (de = se, se = ce.times(de.plus(C(be, de, ue, 1))), h(de.c).slice(0, me) === (re = h(se.c)).slice(0, me)) {
                if (se.e < Te) {
                  --me;
                }
                if (re = re.slice(me - 3, me + 1), re == "9999" || !ae && re == "4999") {
                  if (!ae) {
                    if (ne(de, de.e + O + 2, 0), de.times(de).eq(be)) {
                      se = de;
                      break;
                    }
                  }
                  ue += 4;
                  me += 4;
                  ae = 1;
                } else {
                  if (!+re || !+re.slice(1) && re.charAt(0) == "5") {
                    ne(se, se.e + O + 2, 1);
                    ee = !se.times(se).eq(be);
                  }
                  break;
                }
              }
            }
          }
          return ne(se, se.e + O + 1, M, ee);
        }, k.toExponential = function (ee, re) {
          if (ee != null) {
            y(ee, 0, p);
            ee++;
          }
          return J(this, ee, re, 1);
        }, k.toFixed = function (ee, re) {
          if (ee != null) {
            y(ee, 0, p);
            ee = ee + this.e + 1;
          }
          return J(this, ee, re);
        }, k.toFormat = function (ee, re, se) {
          var ae;
          var de = this;
          if (se == null) {
            if (ee != null && re && typeof re == "object") {
              se = re;
              re = null;
            } else if (ee && typeof ee == "object") {
              se = ee;
              ee = re = null;
            } else {
              se = j;
            }
          } else if (typeof se != "object") {
            throw Error(s + "Argument not an object: " + se);
          }
          if (ae = de.toFixed(ee, re), de.c) {
            var be;
            var fe = ae.split(".");
            var me = +se.groupSize;
            var Te = +se.secondaryGroupSize;
            var ue = se.groupSeparator || "";
            var ce = fe[0];
            var le = fe[1];
            var pe = de.s < 0;
            var ve = pe ? ce.slice(1) : ce;
            var _e = ve.length;
            if (Te) {
              be = me;
              me = Te;
              Te = be;
              _e -= be;
            }
            if (me > 0 && _e > 0) {
              be = _e % me || me;
              ce = ve.substr(0, be);
              for (; be < _e; be += me) {
                ce += ue + ve.substr(be, me);
              }
              if (Te > 0) {
                ce += ue + ve.slice(be);
              }
              if (pe) {
                ce = "-" + ce;
              }
            }
            ae = le ? ce + (se.decimalSeparator || "") + ((Te = +se.fractionGroupSize) ? le.replace(new RegExp("\\d{" + Te + "}\\B", "g"), "$&" + (se.fractionGroupSeparator || "")) : le) : ce;
          }
          return (se.prefix || "") + ae + (se.suffix || "");
        }, k.toFraction = function (ee) {
          var re;
          var se;
          var ae;
          var de;
          var be;
          var fe;
          var me;
          var Te;
          var ue;
          var ce;
          var le;
          var pe;
          var ve = this;
          var _e = ve.c;
          if (ee != null) {
            if (me = new K(ee), !me.isInteger() && (me.c || me.s !== 1) || me.lt(I)) {
              throw Error(s + "Argument " + (me.isInteger() ? "out of range: " : "not an integer: ") + oe(me));
            }
          }
          if (!_e) {
            return new K(ve);
          }
          re = new K(I);
          ue = se = new K(I);
          ae = Te = new K(I);
          pe = h(_e);
          be = re.e = pe.length - ve.e - 1;
          re.c[0] = u[(fe = be % l) < 0 ? l + fe : fe];
          ee = !ee || me.comparedTo(re) > 0 ? be > 0 ? re : ue : me;
          fe = H;
          H = 1 / 0;
          me = new K(pe);
          Te.c[0] = 0;
          for (;;) {
            if (ce = C(me, re, 0, 1), de = se.plus(ce.times(ae)), de.comparedTo(ee) == 1) {
              break;
            }
            se = ae;
            ae = de;
            ue = Te.plus(ce.times(de = ue));
            Te = de;
            re = me.minus(ce.times(de = re));
            me = de;
          }
          de = C(ee.minus(se), ae, 0, 1);
          Te = Te.plus(de.times(ue));
          se = se.plus(de.times(ae));
          Te.s = ue.s = ve.s;
          be = be * 2;
          le = C(ue, ae, be, M).minus(ve).abs().comparedTo(C(Te, se, be, M).minus(ve).abs()) < 1 ? [ue, ae] : [Te, se];
          H = fe;
          return le;
        }, k.toNumber = function () {
          return +oe(this);
        }, k.toPrecision = function (ee, re) {
          if (ee != null) {
            y(ee, 1, p);
          }
          return J(this, ee, re, 2);
        }, k.toString = function (ee) {
          var re;
          var se = this;
          var ae = se.s;
          var de = se.e;
          if (de === null) {
            if (ae) {
              if (re = "Infinity", ae < 0) {
                re = "-" + re;
              }
            } else {
              re = "NaN";
            }
          } else {
            if (ee == null) {
              re = de <= L || de >= P ? b(h(se.c), de) : S(h(se.c), de, "0");
            } else if (ee === 10 && V) {
              se = ne(new K(se), O + de + 1, M);
              re = S(h(se.c), se.e, "0");
            } else {
              y(ee, 2, z.length, "Base");
              re = x(S(h(se.c), de, "0"), 10, ee, ae, true);
            }
            if (ae < 0 && se.c[0]) {
              re = "-" + re;
            }
          }
          return re;
        }, k.valueOf = k.toJSON = function () {
          return oe(this);
        }, k._isBigNumber = true, E != null) {
          K.set(E);
        }
        return K;
      }
      function f(E) {
        var C = E | 0;
        return E > 0 || E === C ? C : C - 1;
      }
      function h(E) {
        var C;
        var x;
        var A = 1;
        var k = E.length;
        var I = E[0] + "";
        for (; A < k;) {
          C = E[A++] + "";
          x = l - C.length;
          for (; x--; C = "0" + C) {
            ;
          }
          I += C;
        }
        for (k = I.length; I.charCodeAt(--k) === 48;) {
          ;
        }
        return I.slice(0, k + 1 || 1);
      }
      function g(E, C) {
        var x;
        var A;
        var k = E.c;
        var I = C.c;
        var O = E.s;
        var M = C.s;
        var L = E.e;
        var P = C.e;
        if (!O || !M) {
          return null;
        }
        if (x = k && !k[0], A = I && !I[0], x || A) {
          return x ? A ? 0 : -M : O;
        }
        if (O != M) {
          return O;
        }
        if (x = O < 0, A = L == P, !k || !I) {
          return A ? 0 : !k ^ x ? 1 : -1;
        }
        if (!A) {
          return L > P ^ x ? 1 : -1;
        }
        M = (L = k.length) < (P = I.length) ? L : P;
        for (O = 0; O < M; O++) {
          if (k[O] != I[O]) {
            return k[O] > I[O] ^ x ? 1 : -1;
          }
        }
        return L == P ? 0 : L > P ^ x ? 1 : -1;
      }
      function y(E, C, x, A) {
        if (E < C || E > x || E !== o(E)) {
          throw Error(s + (A || "Argument") + (typeof E == "number" ? E < C || E > x ? " out of range: " : " not an integer: " : " not a primitive number: ") + String(E));
        }
      }
      function _(E) {
        var C = E.c.length - 1;
        return f(E.e / l) == C && E.c[C] % 2 != 0;
      }
      function b(E, C) {
        return (E.length > 1 ? E.charAt(0) + "." + E.slice(1) : E) + (C < 0 ? "e" : "e+") + C;
      }
      function S(E, C, x) {
        var A;
        var k;
        if (C < 0) {
          for (k = x + "."; ++C; k += x) {
            ;
          }
          E = k + E;
        } else if (A = E.length, ++C > A) {
          for (k = x, C -= A; --C; k += x) {
            ;
          }
          E += k;
        } else if (C < A) {
          E = E.slice(0, C) + "." + E.slice(C);
        }
        return E;
      }
      if (t = m(), t.default = t.BigNumber = t, typeof define == "function" && define.amd) {
        define(function () {
          return t;
        });
      } else if (typeof s0n < "u" && s0n.exports) {
        s0n.exports = t;
      } else {
        if (!e) {
          e = typeof self < "u" && self ? self : window;
        }
        e.BigNumber = t;
      }
    })(S0i);
  });
  var w0i = __commonJS((h8g, v0i) => {
    var T0i = zzr();
    var E0i = v0i.exports;
    (function () {
      function e(c) {
        return c < 10 ? "0" + c : c;
      }
      var t = /[\u0000\u00ad\u0600-\u0604\u070f\u17b4\u17b5\u200c-\u200f\u2028-\u202f\u2060-\u206f\ufeff\ufff0-\uffff]/g;
      var n = /[\\\"\x00-\x1f\x7f-\x9f\u00ad\u0600-\u0604\u070f\u17b4\u17b5\u200c-\u200f\u2028-\u202f\u2060-\u206f\ufeff\ufff0-\uffff]/g;
      var r;
      var o;
      var s = {
        "\b": "\\b",
        "\t": "\\t",
        "\n": "\\n",
        "\f": "\\f",
        "\r": "\\r",
        '"': "\\\"",
        "\\": "\\\\"
      };
      var i;
      function a(c) {
        n.lastIndex = 0;
        return n.test(c) ? '"' + c.replace(n, function (u) {
          var d = s[u];
          return typeof d === "string" ? d : "\\u" + ("0000" + u.charCodeAt(0).toString(16)).slice(-4);
        }) + '"' : '"' + c + '"';
      }
      function l(c, u) {
        var d;
        var p;
        var m;
        var f;
        var h = r;
        var g;
        var y = u[c];
        var _ = y != null && (y instanceof T0i || T0i.isBigNumber(y));
        if (y && typeof y === "object" && typeof y.toJSON === "function") {
          y = y.toJSON(c);
        }
        if (typeof i === "function") {
          y = i.call(u, c, y);
        }
        switch (typeof y) {
          case "string":
            if (_) {
              return y;
            } else {
              return a(y);
            }
          case "number":
            return isFinite(y) ? String(y) : "null";
          case "boolean":
          case "null":
          case "bigint":
            return String(y);
          case "object":
            if (!y) {
              return "null";
            }
            if (r += o, g = [], Object.prototype.toString.apply(y) === "[object Array]") {
              f = y.length;
              for (d = 0; d < f; d += 1) {
                g[d] = l(d, y) || "null";
              }
              m = g.length === 0 ? "[]" : r ? `[
` + r + g.join(`,
` + r) + `
` + h + "]" : "[" + g.join(",") + "]";
              r = h;
              return m;
            }
            if (i && typeof i === "object") {
              f = i.length;
              for (d = 0; d < f; d += 1) {
                if (typeof i[d] === "string") {
                  if (p = i[d], m = l(p, y), m) {
                    g.push(a(p) + (r ? ": " : ":") + m);
                  }
                }
              }
            } else {
              Object.keys(y).forEach(function (b) {
                var S = l(b, y);
                if (S) {
                  g.push(a(b) + (r ? ": " : ":") + S);
                }
              });
            }
            m = g.length === 0 ? "{}" : r ? `{
` + r + g.join(`,
` + r) + `
` + h + "}" : "{" + g.join(",") + "}";
            r = h;
            return m;
        }
      }
      if (typeof E0i.stringify !== "function") {
        E0i.stringify = function (c, u, d) {
          var p;
          if (r = "", o = "", typeof d === "number") {
            for (p = 0; p < d; p += 1) {
              o += " ";
            }
          } else if (typeof d === "string") {
            o = d;
          }
          if (i = u, u && typeof u !== "function" && (typeof u !== "object" || typeof u.length !== "number")) {
            throw Error("JSON.stringify");
          }
          return l("", {
            "": c
          });
        };
      }
    })();
  });
  var R0i = __commonJS((g8g, C0i) => {
    var i0n = null;
    var HLd = function (e) {
      var t = {
        strict: false,
        storeAsString: false,
        alwaysParseAsBig: false,
        useNativeBigInt: false,
        protoAction: "error",
        constructorAction: "error"
      };
      if (e !== undefined && e !== null) {
        if (e.strict === true) {
          t.strict = true;
        }
        if (e.storeAsString === true) {
          t.storeAsString = true;
        }
        if (t.alwaysParseAsBig = e.alwaysParseAsBig === true ? e.alwaysParseAsBig : false, t.useNativeBigInt = e.useNativeBigInt === true ? e.useNativeBigInt : false, typeof e.constructorAction < "u") {
          if (e.constructorAction === "error" || e.constructorAction === "ignore" || e.constructorAction === "preserve") {
            t.constructorAction = e.constructorAction;
          } else {
            throw Error(`Incorrect value for constructorAction option, must be "error", "ignore" or undefined but passed ${e.constructorAction}`);
          }
        }
        if (typeof e.protoAction < "u") {
          if (e.protoAction === "error" || e.protoAction === "ignore" || e.protoAction === "preserve") {
            t.protoAction = e.protoAction;
          } else {
            throw Error(`Incorrect value for protoAction option, must be "error", "ignore" or undefined but passed ${e.protoAction}`);
          }
        }
      }
      var n;
      var r;
      var o = {
        '"': '"',
        "\\": "\\",
        "/": "/",
        b: "\b",
        f: "\f",
        n: `
`,
        r: "\r",
        t: "\t"
      };
      var s;
      var i = function (h) {
        throw {
          name: "SyntaxError",
          message: h,
          at: n,
          text: s
        };
      };
      var a = function (h) {
        if (h && h !== r) {
          i("Expected '" + h + "' instead of '" + r + "'");
        }
        r = s.charAt(n);
        n += 1;
        return r;
      };
      var l = function () {
        var h;
        var g = "";
        if (r === "-") {
          g = "-";
          a("-");
        }
        while (r >= "0" && r <= "9") {
          g += r;
          a();
        }
        if (r === ".") {
          g += ".";
          while (a() && r >= "0" && r <= "9") {
            g += r;
          }
        }
        if (r === "e" || r === "E") {
          if (g += r, a(), r === "-" || r === "+") {
            g += r;
            a();
          }
          while (r >= "0" && r <= "9") {
            g += r;
            a();
          }
        }
        if (h = +g, !isFinite(h)) {
          i("Bad number");
        } else {
          if (i0n == null) {
            i0n = zzr();
          }
          if (g.length > 15) {
            return t.storeAsString ? g : t.useNativeBigInt ? BigInt(g) : new i0n(g);
          } else {
            return !t.alwaysParseAsBig ? h : t.useNativeBigInt ? BigInt(h) : new i0n(h);
          }
        }
      };
      var c = function () {
        var h;
        var g;
        var y = "";
        var _;
        if (r === '"') {
          var b = n;
          while (a()) {
            if (r === '"') {
              if (n - 1 > b) {
                y += s.substring(b, n - 1);
              }
              a();
              return y;
            }
            if (r === "\\") {
              if (n - 1 > b) {
                y += s.substring(b, n - 1);
              }
              if (a(), r === "u") {
                _ = 0;
                for (g = 0; g < 4; g += 1) {
                  if (h = parseInt(a(), 16), !isFinite(h)) {
                    break;
                  }
                  _ = _ * 16 + h;
                }
                y += String.fromCharCode(_);
              } else if (typeof o[r] === "string") {
                y += o[r];
              } else {
                break;
              }
              b = n;
            }
          }
        }
        i("Bad string");
      };
      var u = function () {
        while (r && r <= " ") {
          a();
        }
      };
      var d = function () {
        switch (r) {
          case "t":
            a("t");
            a("r");
            a("u");
            a("e");
            return true;
          case "f":
            a("f");
            a("a");
            a("l");
            a("s");
            a("e");
            return false;
          case "n":
            a("n");
            a("u");
            a("l");
            a("l");
            return null;
        }
        i("Unexpected '" + r + "'");
      };
      var p;
      var m = function () {
        var h = [];
        if (r === "[") {
          if (a("["), u(), r === "]") {
            a("]");
            return h;
          }
          while (r) {
            if (h.push(p()), u(), r === "]") {
              a("]");
              return h;
            }
            a(",");
            u();
          }
        }
        i("Bad array");
      };
      var f = function () {
        var h;
        var g = Object.create(null);
        if (r === "{") {
          if (a("{"), u(), r === "}") {
            a("}");
            return g;
          }
          while (r) {
            if (h = c(), u(), a(":"), t.strict === true && Object.hasOwnProperty.call(g, h)) {
              i('Duplicate key "' + h + '"');
            }
            if ((/(?:_|\\u005[Ff])(?:_|\\u005[Ff])(?:p|\\u0070)(?:r|\\u0072)(?:o|\\u006[Ff])(?:t|\\u0074)(?:o|\\u006[Ff])(?:_|\\u005[Ff])(?:_|\\u005[Ff])/).test(h) === true) {
              if (t.protoAction === "error") {
                i("Object contains forbidden prototype property");
              } else if (t.protoAction === "ignore") {
                p();
              } else {
                g[h] = p();
              }
            } else if ((/(?:c|\\u0063)(?:o|\\u006[Ff])(?:n|\\u006[Ee])(?:s|\\u0073)(?:t|\\u0074)(?:r|\\u0072)(?:u|\\u0075)(?:c|\\u0063)(?:t|\\u0074)(?:o|\\u006[Ff])(?:r|\\u0072)/).test(h) === true) {
              if (t.constructorAction === "error") {
                i("Object contains forbidden constructor property");
              } else if (t.constructorAction === "ignore") {
                p();
              } else {
                g[h] = p();
              }
            } else {
              g[h] = p();
            }
            if (u(), r === "}") {
              a("}");
              return g;
            }
            a(",");
            u();
          }
        }
        i("Bad object");
      };
      p = function () {
        switch (u(), r) {
          case "{":
            return f();
          case "[":
            return m();
          case '"':
            return c();
          case "-":
            return l();
          default:
            return r >= "0" && r <= "9" ? l() : d();
        }
      };
      return function (h, g) {
        var y;
        if (s = h + "", n = 0, r = " ", y = p(), u(), r) {
          i("Syntax error");
        }
        return typeof g === "function" ? function _(b, S) {
          var E;
          var C;
          var x = b[S];
          if (x && typeof x === "object") {
            Object.keys(x).forEach(function (A) {
              if (C = _(x, A), C !== undefined) {
                x[A] = C;
              } else {
                delete x[A];
              }
            });
          }
          return g.call(b, S, x);
        }({
          "": y
        }, "") : y;
      };
    };
    C0i.exports = HLd;
  });
  var A0i = __commonJS((y8g, a0n) => {
    var x0i = w0i().stringify;
    var k0i = R0i();
    a0n.exports = function (e) {
      return {
        parse: k0i(e),
        stringify: x0i
      };
    };
    a0n.exports.parse = k0i();
    a0n.exports.stringify = x0i;
  });
  var Kzr = __commonJS(Pne => {
    Object.defineProperty(Pne, "__esModule", {
      value: true
    });
    Pne.GCE_LINUX_BIOS_PATHS = undefined;
    Pne.isGoogleCloudServerless = O0i;
    Pne.isGoogleComputeEngineLinux = D0i;
    Pne.isGoogleComputeEngineMACAddress = M0i;
    Pne.isGoogleComputeEngine = N0i;
    Pne.detectGCPResidency = qLd;
    var I0i = require("fs");
    var P0i = require("os");
    Pne.GCE_LINUX_BIOS_PATHS = {
      BIOS_DATE: "/sys/class/dmi/id/bios_date",
      BIOS_VENDOR: "/sys/class/dmi/id/bios_vendor"
    };
    function O0i() {
      return !!(process.env.CLOUD_RUN_JOB || process.env.FUNCTION_NAME || process.env.K_SERVICE);
    }
    function D0i() {
      if ((0, P0i.platform)() !== "linux") {
        return false;
      }
      try {
        (0, I0i.statSync)(Pne.GCE_LINUX_BIOS_PATHS.BIOS_DATE);
        let e = (0, I0i.readFileSync)(Pne.GCE_LINUX_BIOS_PATHS.BIOS_VENDOR, "utf8");
        return /Google/.test(e);
      } catch {
        return false;
      }
    }
    function M0i() {
      let e = (0, P0i.networkInterfaces)();
      for (let t of Object.values(e)) {
        if (!t) {
          continue;
        }
        for (let {
          mac: n
        } of t) {
          if ((/^42:01/).test(n)) {
            return true;
          }
        }
      }
      return false;
    }
    function N0i() {
      return D0i() || M0i();
    }
    function qLd() {
      return O0i() || N0i();
    }
  });
  var L0i = __commonJS(l0n => {
    Object.defineProperty(l0n, "__esModule", {
      value: true
    });
    l0n.Colours = undefined;
    class Gf {
      static isEnabled(e) {
        return e && e.isTTY && (typeof e.getColorDepth === "function" ? e.getColorDepth() > 2 : true);
      }
      static refresh() {
        if (Gf.enabled = Gf.isEnabled(process === null || process === undefined ? undefined : process.stderr), !this.enabled) {
          Gf.reset = "";
          Gf.bright = "";
          Gf.dim = "";
          Gf.red = "";
          Gf.green = "";
          Gf.yellow = "";
          Gf.blue = "";
          Gf.magenta = "";
          Gf.cyan = "";
          Gf.white = "";
          Gf.grey = "";
        } else {
          Gf.reset = "\x1B[0m";
          Gf.bright = "\x1B[1m";
          Gf.dim = "\x1B[2m";
          Gf.red = "\x1B[31m";
          Gf.green = "\x1B[32m";
          Gf.yellow = "\x1B[33m";
          Gf.blue = "\x1B[34m";
          Gf.magenta = "\x1B[35m";
          Gf.cyan = "\x1B[36m";
          Gf.white = "\x1B[37m";
          Gf.grey = "\x1B[90m";
        }
      }
    }
    l0n.Colours = Gf;
    Gf.enabled = false;
    Gf.reset = "";
    Gf.bright = "";
    Gf.dim = "";
    Gf.red = "";
    Gf.green = "";
    Gf.yellow = "";
    Gf.blue = "";
    Gf.magenta = "";
    Gf.cyan = "";
    Gf.white = "";
    Gf.grey = "";
    Gf.refresh();
  });
  var q0i = __commonJS(XT => {
    var WLd = XT && XT.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var GLd = XT && XT.__setModuleDefault || (Object.create ? function (e, t) {
      Object.defineProperty(e, "default", {
        enumerable: true,
        value: t
      });
    } : function (e, t) {
      e.default = t;
    });
    var F0i = XT && XT.__importStar || function () {
      var e = function (t) {
        e = Object.getOwnPropertyNames || function (n) {
          var r = [];
          for (var o in n) {
            if (Object.prototype.hasOwnProperty.call(n, o)) {
              r[r.length] = o;
            }
          }
          return r;
        };
        return e(t);
      };
      return function (t) {
        if (t && t.__esModule) {
          return t;
        }
        var n = {};
        if (t != null) {
          for (var r = e(t), o = 0; o < r.length; o++) {
            if (r[o] !== "default") {
              WLd(n, t, r[o]);
            }
          }
        }
        GLd(n, t);
        return n;
      };
    }();
    Object.defineProperty(XT, "__esModule", {
      value: true
    });
    XT.env = XT.DebugLogBackendBase = XT.placeholder = XT.AdhocDebugLogger = XT.LogSeverity = undefined;
    XT.getNodeBackend = Yzr;
    XT.getDebugBackend = zLd;
    XT.getStructuredBackend = KLd;
    XT.setBackend = YLd;
    XT.log = j0i;
    var VLd = require("events");
    var wBt = F0i(require("process"));
    var U0i = F0i(require("util"));
    var E8 = L0i();
    var One;
    (function (e) {
      e.DEFAULT = "DEFAULT";
      e.DEBUG = "DEBUG";
      e.INFO = "INFO";
      e.WARNING = "WARNING";
      e.ERROR = "ERROR";
    })(One || (XT.LogSeverity = One = {}));
    class c0n extends VLd.EventEmitter {
      constructor(e, t) {
        super();
        this.namespace = e;
        this.upstream = t;
        this.func = Object.assign(this.invoke.bind(this), {
          instance: this,
          on: (n, r) => this.on(n, r)
        });
        this.func.debug = (...n) => this.invokeSeverity(One.DEBUG, ...n);
        this.func.info = (...n) => this.invokeSeverity(One.INFO, ...n);
        this.func.warn = (...n) => this.invokeSeverity(One.WARNING, ...n);
        this.func.error = (...n) => this.invokeSeverity(One.ERROR, ...n);
        this.func.sublog = n => j0i(n, this.func);
      }
      invoke(e, ...t) {
        if (this.upstream) {
          try {
            this.upstream(e, ...t);
          } catch (n) {}
        }
        try {
          this.emit("log", e, t);
        } catch (n) {}
      }
      invokeSeverity(e, ...t) {
        this.invoke({
          severity: e
        }, ...t);
      }
    }
    XT.AdhocDebugLogger = c0n;
    XT.placeholder = new c0n("", () => {}).func;
    class CBt {
      constructor() {
        var e;
        this.cached = new Map();
        this.filters = [];
        this.filtersSet = false;
        let t = (e = wBt.env[XT.env.nodeEnables]) !== null && e !== undefined ? e : "*";
        if (t === "all") {
          t = "*";
        }
        this.filters = t.split(",");
      }
      log(e, t, ...n) {
        try {
          if (!this.filtersSet) {
            this.setFilters();
            this.filtersSet = true;
          }
          let r = this.cached.get(e);
          if (!r) {
            r = this.makeLogger(e);
            this.cached.set(e, r);
          }
          r(t, ...n);
        } catch (r) {
          console.error(r);
        }
      }
    }
    XT.DebugLogBackendBase = CBt;
    class B0i extends CBt {
      constructor() {
        super(...arguments);
        this.enabledRegexp = /.*/g;
      }
      isEnabled(e) {
        return this.enabledRegexp.test(e);
      }
      makeLogger(e) {
        if (!this.enabledRegexp.test(e)) {
          return () => {};
        }
        return (t, ...n) => {
          var r;
          let o = `${E8.Colours.green}${e}${E8.Colours.reset}`;
          let s = `${E8.Colours.yellow}${wBt.pid}${E8.Colours.reset}`;
          let i;
          switch (t.severity) {
            case One.ERROR:
              i = `${E8.Colours.red}${t.severity}${E8.Colours.reset}`;
              break;
            case One.INFO:
              i = `${E8.Colours.magenta}${t.severity}${E8.Colours.reset}`;
              break;
            case One.WARNING:
              i = `${E8.Colours.yellow}${t.severity}${E8.Colours.reset}`;
              break;
            default:
              i = (r = t.severity) !== null && r !== undefined ? r : One.DEFAULT;
              break;
          }
          let a = U0i.formatWithOptions({
            colors: E8.Colours.enabled
          }, ...n);
          let l = Object.assign({}, t);
          delete l.severity;
          let c = Object.getOwnPropertyNames(l).length ? JSON.stringify(l) : "";
          let u = c ? `${E8.Colours.grey}${c}${E8.Colours.reset}` : "";
          console.error("%s [%s|%s] %s%s", s, o, i, a, c ? ` ${u}` : "");
        };
      }
      setFilters() {
        let t = this.filters.join(",").replace(/[|\\{}()[\]^$+?.]/g, "\\$&").replace(/\*/g, ".*").replace(/,/g, "$|^");
        this.enabledRegexp = new RegExp(`^${t}$`, "i");
      }
    }
    function Yzr() {
      return new B0i();
    }
    class $0i extends CBt {
      constructor(e) {
        super();
        this.debugPkg = e;
      }
      makeLogger(e) {
        let t = this.debugPkg(e);
        return (n, ...r) => {
          t(r[0], ...r.slice(1));
        };
      }
      setFilters() {
        var e;
        let t = (e = wBt.env.NODE_DEBUG) !== null && e !== undefined ? e : "";
        wBt.env.NODE_DEBUG = `${t}${t ? "," : ""}${this.filters.join(",")}`;
      }
    }
    function zLd(e) {
      return new $0i(e);
    }
    class H0i extends CBt {
      constructor(e) {
        var t;
        super();
        this.upstream = (t = e) !== null && t !== undefined ? t : undefined;
      }
      makeLogger(e) {
        var t;
        let n = (t = this.upstream) === null || t === undefined ? undefined : t.makeLogger(e);
        return (r, ...o) => {
          var s;
          let i = (s = r.severity) !== null && s !== undefined ? s : One.INFO;
          let a = Object.assign({
            severity: i,
            message: U0i.format(...o)
          }, r);
          let l = JSON.stringify(a);
          if (n) {
            n(r, l);
          } else {
            console.log("%s", l);
          }
        };
      }
      setFilters() {
        var e;
        (e = this.upstream) === null || e === undefined || e.setFilters();
      }
    }
    function KLd(e) {
      return new H0i(e);
    }
    XT.env = {
      nodeEnables: "GOOGLE_SDK_NODE_LOGGING"
    };
    var Jzr = new Map();
    var v8 = undefined;
    function YLd(e) {
      v8 = e;
      Jzr.clear();
    }
    function j0i(e, t) {
      if (!v8) {
        if (!wBt.env[XT.env.nodeEnables]) {
          return XT.placeholder;
        }
      }
      if (!e) {
        return XT.placeholder;
      }
      if (t) {
        e = `${t.instance.namespace}:${e}`;
      }
      let n = Jzr.get(e);
      if (n) {
        return n.func;
      }
      if (v8 === null) {
        return XT.placeholder;
      } else if (v8 === undefined) {
        v8 = Yzr();
      }
      let r = (() => {
        let o = undefined;
        return new c0n(e, (i, ...a) => {
          if (o !== v8) {
            if (v8 === null) {
              return;
            } else if (v8 === undefined) {
              v8 = Yzr();
            }
            o = v8;
          }
          v8 === null || v8 === undefined || v8.log(e, i, ...a);
        });
      })();
      Jzr.set(e, r);
      return r.func;
    }
  });
  var Xzr = __commonJS(s4e => {
    var JLd = s4e && s4e.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var XLd = s4e && s4e.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          JLd(t, e, n);
        }
      }
    };
    Object.defineProperty(s4e, "__esModule", {
      value: true
    });
    XLd(q0i(), s4e);
  });
  var xBt = __commonJS(Md => {
    var G0i = Md && Md.__createBinding || (Object.create ? function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      var o = Object.getOwnPropertyDescriptor(t, n);
      if (!o || ("get" in o ? !t.__esModule : o.writable || o.configurable)) {
        o = {
          enumerable: true,
          get: function () {
            return t[n];
          }
        };
      }
      Object.defineProperty(e, r, o);
    } : function (e, t, n, r) {
      if (r === undefined) {
        r = n;
      }
      e[r] = t[n];
    });
    var QLd = Md && Md.__setModuleDefault || (Object.create ? function (e, t) {
      Object.defineProperty(e, "default", {
        enumerable: true,
        value: t
      });
    } : function (e, t) {
      e.default = t;
    });
    var ZLd = Md && Md.__importStar || function () {
      var e = function (t) {
        e = Object.getOwnPropertyNames || function (n) {
          var r = [];
          for (var o in n) {
            if (Object.prototype.hasOwnProperty.call(n, o)) {
              r[r.length] = o;
            }
          }
          return r;
        };
        return e(t);
      };
      return function (t) {
        if (t && t.__esModule) {
          return t;
        }
        var n = {};
        if (t != null) {
          for (var r = e(t), o = 0; o < r.length; o++) {
            if (r[o] !== "default") {
              G0i(n, t, r[o]);
            }
          }
        }
        QLd(n, t);
        return n;
      };
    }();
    var eFd = Md && Md.__exportStar || function (e, t) {
      for (var n in e) {
        if (n !== "default" && !Object.prototype.hasOwnProperty.call(t, n)) {
          G0i(t, e, n);
        }
      }
    };
    Object.defineProperty(Md, "__esModule", {
      value: true
    });
    Md.gcpResidencyCache = Md.METADATA_SERVER_DETECTION = Md.HEADERS = Md.HEADER_VALUE = Md.HEADER_NAME = Md.SECONDARY_HOST_ADDRESS = Md.HOST_ADDRESS = Md.BASE_PATH = undefined;
    Md.instance = iFd;
    Md.project = aFd;
    Md.universe = lFd;
    Md.bulk = cFd;
    Md.isAvailable = dFd;
    Md.resetIsAvailableCache = pFd;
    Md.getGCPResidency = eKr;
    Md.setGCPResidency = V0i;
    Md.requestTimeout = z0i;
    var Qzr = LF();
    var tFd = A0i();
    var nFd = Kzr();
    var rFd = ZLd(Xzr());
    Md.BASE_PATH = "/computeMetadata/v1";
    Md.HOST_ADDRESS = "http://169.254.169.254";
    Md.SECONDARY_HOST_ADDRESS = "http://metadata.google.internal.";
    Md.HEADER_NAME = "Metadata-Flavor";
    Md.HEADER_VALUE = "Google";
    Md.HEADERS = Object.freeze({
      [Md.HEADER_NAME]: Md.HEADER_VALUE
    });
    var W0i = rFd.log("gcp-metadata");
    Md.METADATA_SERVER_DETECTION = Object.freeze({
      "assume-present": "don't try to ping the metadata server, but assume it's present",
      none: "don't try to ping the metadata server, but don't try to use it either",
      "bios-only": "treat the result of a BIOS probe as canonical (don't fall back to pinging)",
      "ping-only": "skip the BIOS probe, and go straight to pinging"
    });
    function Zzr(e) {
      if (!e) {
        e = process.env.GCE_METADATA_IP || process.env.GCE_METADATA_HOST || Md.HOST_ADDRESS;
      }
      if (!/^https?:\/\//.test(e)) {
        e = `http://${e}`;
      }
      return new URL(Md.BASE_PATH, e).href;
    }
    function oFd(e) {
      Object.keys(e).forEach(t => {
        switch (t) {
          case "params":
          case "property":
          case "headers":
            break;
          case "qs":
            throw Error("'qs' is not a valid configuration option. Please use 'params' instead.");
          default:
            throw Error(`'${t}' is not a valid configuration option.`);
        }
      });
    }
    async function RBt(e, t = {}, n = 3, r = false) {
      let o = new Headers(Md.HEADERS);
      let s = "";
      let i = {};
      if (typeof e === "object") {
        let d = e;
        new Headers(d.headers).forEach((p, m) => o.set(m, p));
        s = d.metadataKey;
        i = d.params || i;
        n = d.noResponseRetries || n;
        r = d.fastFail || r;
      } else {
        s = e;
      }
      if (typeof t === "string") {
        s += `/${t}`;
      } else {
        if (oFd(t), t.property) {
          s += `/${t.property}`;
        }
        new Headers(t.headers).forEach((d, p) => o.set(p, d));
        i = t.params || i;
      }
      let a = r ? sFd : Qzr.request;
      let l = {
        url: `${Zzr()}/${s}`,
        headers: o,
        retryConfig: {
          noResponseRetries: n
        },
        params: i,
        responseType: "text",
        timeout: z0i()
      };
      W0i.info("instance request %j", l);
      let c = await a(l);
      W0i.info("instance metadata is %s", c.data);
      let u = c.headers.get(Md.HEADER_NAME);
      if (u !== Md.HEADER_VALUE) {
        throw RangeError(`Invalid response from metadata service: incorrect ${Md.HEADER_NAME} header. Expected '${Md.HEADER_VALUE}', got ${u ? `'${u}'` : "no header"}`);
      }
      if (typeof c.data === "string") {
        try {
          return tFd.parse(c.data);
        } catch {}
      }
      return c.data;
    }
    async function sFd(e) {
      let t = {
        ...e,
        url: e.url?.toString().replace(Zzr(), Zzr(Md.SECONDARY_HOST_ADDRESS))
      };
      let n = (0, Qzr.request)(e);
      let r = (0, Qzr.request)(t);
      return Promise.any([n, r]);
    }
    function iFd(e) {
      return RBt("instance", e);
    }
    function aFd(e) {
      return RBt("project", e);
    }
    function lFd(e) {
      return RBt("universe", e);
    }
    async function cFd(e) {
      let t = {};
      await Promise.all(e.map(n => (async () => {
        let r = await RBt(n);
        let o = n.metadataKey;
        t[o] = r;
      })()));
      return t;
    }
    function uFd() {
      return process.env.DETECT_GCP_RETRIES ? Number(process.env.DETECT_GCP_RETRIES) : 0;
    }
    var u0n;
    async function dFd() {
      if (process.env.METADATA_SERVER_DETECTION) {
        let e = process.env.METADATA_SERVER_DETECTION.trim().toLocaleLowerCase();
        if (!(e in Md.METADATA_SERVER_DETECTION)) {
          throw RangeError(`Unknown \`METADATA_SERVER_DETECTION\` env variable. Got \`${e}\`, but it should be \`${Object.keys(Md.METADATA_SERVER_DETECTION).join("`, `")}\`, or unset`);
        }
        switch (e) {
          case "assume-present":
            return true;
          case "none":
            return false;
          case "bios-only":
            return eKr();
          case "ping-only":
        }
      }
      try {
        if (u0n === undefined) {
          u0n = RBt("instance", undefined, uFd(), !(process.env.GCE_METADATA_IP || process.env.GCE_METADATA_HOST));
        }
        await u0n;
        return true;
      } catch (e) {
        let t = e;
        if (process.env.DEBUG_AUTH) {
          console.info(t);
        }
        if (t.type === "request-timeout") {
          return false;
        }
        if (t.response && t.response.status === 404) {
          return false;
        } else {
          if (!(t.response && t.response.status === 404) && (!t.code || !["EHOSTDOWN", "EHOSTUNREACH", "ENETUNREACH", "ENOENT", "ENOTFOUND", "ECONNREFUSED"].includes(t.code.toString()))) {
            let n = "UNKNOWN";
            if (t.code) {
              n = t.code.toString();
            }
            process.emitWarning(`received unexpected error = ${t.message} code = ${n}`, "MetadataLookupWarning");
          }
          return false;
        }
      }
    }
    function pFd() {
      u0n = undefined;
    }
    Md.gcpResidencyCache = null;
    function eKr() {
      if (Md.gcpResidencyCache === null) {
        V0i();
      }
      return Md.gcpResidencyCache;
    }
    function V0i(e = null) {
      Md.gcpResidencyCache = e !== null ? e : (0, nFd.detectGCPResidency)();
    }
    function z0i() {
      return eKr() ? 0 : 3000;
    }
    eFd(Kzr(), Md);
  });
  var rKr = __commonJS(d0n => {
    d0n.byteLength = fFd;
    d0n.toByteArray = gFd;
    d0n.fromByteArray = bFd;
    var Sce = [];
    var sJ = [];
    var mFd = typeof Uint8Array < "u" ? Uint8Array : Array;
    for (sIe = 0, nKr = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").length; sIe < nKr; ++sIe) {
      Sce[sIe] = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/")[sIe];
      sJ[("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").charCodeAt(sIe)] = sIe;
    }
    var sIe;
    var nKr;
    sJ[45] = 62;
    sJ[95] = 63;
    function K0i(e) {
      var t = e.length;
      if (t % 4 > 0) {
        throw Error("Invalid string. Length must be a multiple of 4");
      }
      var n = e.indexOf("=");
      if (n === -1) {
        n = t;
      }
      var r = n === t ? 0 : 4 - n % 4;
      return [n, r];
    }
    function fFd(e) {
      var t = K0i(e);
      var n = t[0];
      var r = t[1];
      return (n + r) * 3 / 4 - r;
    }
    function hFd(e, t, n) {
      return (t + n) * 3 / 4 - n;
    }
    function gFd(e) {
      var t;
      var n = K0i(e);
      var r = n[0];
      var o = n[1];
      var s = new mFd(hFd(e, r, o));
      var i = 0;
      var a = o > 0 ? r - 4 : r;
      var l;
      for (l = 0; l < a; l += 4) {
        t = sJ[e.charCodeAt(l)] << 18 | sJ[e.charCodeAt(l + 1)] << 12 | sJ[e.charCodeAt(l + 2)] << 6 | sJ[e.charCodeAt(l + 3)];
        s[i++] = t >> 16 & 255;
        s[i++] = t >> 8 & 255;
        s[i++] = t & 255;
      }
      if (o === 2) {
        t = sJ[e.charCodeAt(l)] << 2 | sJ[e.charCodeAt(l + 1)] >> 4;
        s[i++] = t & 255;
      }
      if (o === 1) {
        t = sJ[e.charCodeAt(l)] << 10 | sJ[e.charCodeAt(l + 1)] << 4 | sJ[e.charCodeAt(l + 2)] >> 2;
        s[i++] = t >> 8 & 255;
        s[i++] = t & 255;
      }
      return s;
    }
    function yFd(e) {
      return Sce[e >> 18 & 63] + Sce[e >> 12 & 63] + Sce[e >> 6 & 63] + Sce[e & 63];
    }
    function _Fd(e, t, n) {
      var r;
      var o = [];
      for (var s = t; s < n; s += 3) {
        r = (e[s] << 16 & 16711680) + (e[s + 1] << 8 & 65280) + (e[s + 2] & 255);
        o.push(yFd(r));
      }
      return o.join("");
    }
    function bFd(e) {
      var t;
      var n = e.length;
      var r = n % 3;
      var o = [];
      var s = 16383;
      for (var i = 0, a = n - r; i < a; i += s) {
        o.push(_Fd(e, i, i + s > a ? a : i + s));
      }
      if (r === 1) {
        t = e[n - 1];
        o.push(Sce[t >> 2] + Sce[t << 4 & 63] + "==");
      } else if (r === 2) {
        t = (e[n - 2] << 8) + e[n - 1];
        o.push(Sce[t >> 10] + Sce[t >> 4 & 63] + Sce[t << 2 & 63] + "=");
      }
      return o.join("");
    }
  });
  var sKr = __commonJS(oKr => {
    Object.defineProperty(oKr, "__esModule", {
      value: true
    });