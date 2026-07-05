  var Rss = __commonJS((BYc, Sin) => {
    (function () {
      var e;
      var t;
      var n;
      var r;
      var o;
      var s;
      var i;
      var a;
      var l;
      if (t = {}, a = this, typeof Sin < "u" && Sin !== null && Sin.exports) {
        Sin.exports = t;
      } else {
        a.ipaddr = t;
      }
      i = function (c, u, d, p) {
        var m;
        var f;
        if (c.length !== u.length) {
          throw Error("ipaddr: cannot match CIDR for objects with different lengths");
        }
        m = 0;
        while (p > 0) {
          if (f = d - p, f < 0) {
            f = 0;
          }
          if (c[m] >> f !== u[m] >> f) {
            return false;
          }
          p -= d;
          m += 1;
        }
        return true;
      };
      t.subnetMatch = function (c, u, d) {
        var p;
        var m;
        var f;
        var h;
        var g;
        if (d == null) {
          d = "unicast";
        }
        for (f in u) {
          if (h = u[f], h[0] && !(h[0] instanceof Array)) {
            h = [h];
          }
          for (p = 0, m = h.length; p < m; p++) {
            if (g = h[p], c.kind() === g[0].kind()) {
              if (c.match.apply(c, g)) {
                return f;
              }
            }
          }
        }
        return d;
      };
      t.IPv4 = function () {
        function c(u) {
          var d;
          var p;
          var m;
          if (u.length !== 4) {
            throw Error("ipaddr: ipv4 octet count should be 4");
          }
          for (d = 0, p = u.length; d < p; d++) {
            if (m = u[d], !(0 <= m && m <= 255)) {
              throw Error("ipaddr: ipv4 octet should fit in 8 bits");
            }
          }
          this.octets = u;
        }
        c.prototype.kind = function () {
          return "ipv4";
        };
        c.prototype.toString = function () {
          return this.octets.join(".");
        };
        c.prototype.toNormalizedString = function () {
          return this.toString();
        };
        c.prototype.toByteArray = function () {
          return this.octets.slice(0);
        };
        c.prototype.match = function (u, d) {
          var p;
          if (d === undefined) {
            p = u;
            u = p[0];
            d = p[1];
          }
          if (u.kind() !== "ipv4") {
            throw Error("ipaddr: cannot match ipv4 address with non-ipv4 one");
          }
          return i(this.octets, u.octets, 8, d);
        };
        c.prototype.SpecialRanges = {
          unspecified: [[new c([0, 0, 0, 0]), 8]],
          broadcast: [[new c([255, 255, 255, 255]), 32]],
          multicast: [[new c([224, 0, 0, 0]), 4]],
          linkLocal: [[new c([169, 254, 0, 0]), 16]],
          loopback: [[new c([127, 0, 0, 0]), 8]],
          carrierGradeNat: [[new c([100, 64, 0, 0]), 10]],
          private: [[new c([10, 0, 0, 0]), 8], [new c([172, 16, 0, 0]), 12], [new c([192, 168, 0, 0]), 16]],
          reserved: [[new c([192, 0, 0, 0]), 24], [new c([192, 0, 2, 0]), 24], [new c([192, 88, 99, 0]), 24], [new c([198, 51, 100, 0]), 24], [new c([203, 0, 113, 0]), 24], [new c([240, 0, 0, 0]), 4]]
        };
        c.prototype.range = function () {
          return t.subnetMatch(this, this.SpecialRanges);
        };
        c.prototype.toIPv4MappedAddress = function () {
          return t.IPv6.parse("::ffff:" + this.toString());
        };
        c.prototype.prefixLengthFromSubnetMask = function () {
          var u;
          var d;
          var p;
          var m;
          var f;
          var h;
          var g;
          g = {
            0: 8,
            128: 7,
            192: 6,
            224: 5,
            240: 4,
            248: 3,
            252: 2,
            254: 1,
            255: 0
          };
          u = 0;
          f = false;
          for (d = p = 3; p >= 0; d = p += -1) {
            if (m = this.octets[d], m in g) {
              if (h = g[m], f && h !== 0) {
                return null;
              }
              if (h !== 8) {
                f = true;
              }
              u += h;
            } else {
              return null;
            }
          }
          return 32 - u;
        };
        return c;
      }();
      n = "(0?\\d+|0x[a-f0-9]+)";
      r = {
        fourOctet: new RegExp("^" + n + "\\." + n + "\\." + n + "\\." + n + "$", "i"),
        longValue: new RegExp("^" + n + "$", "i")
      };
      t.IPv4.parser = function (c) {
        var u;
        var d;
        var p;
        var m;
        var f;
        if (d = function (h) {
          if (h[0] === "0" && h[1] !== "x") {
            return parseInt(h, 8);
          } else {
            return parseInt(h);
          }
        }, u = c.match(r.fourOctet)) {
          return function () {
            var h;
            var g;
            var y;
            var _;
            y = u.slice(1, 6);
            _ = [];
            for (h = 0, g = y.length; h < g; h++) {
              p = y[h];
              _.push(d(p));
            }
            return _;
          }();
        } else if (u = c.match(r.longValue)) {
          if (f = d(u[1]), f > 4294967295 || f < 0) {
            throw Error("ipaddr: address outside defined range");
          }
          return function () {
            var h;
            var g;
            g = [];
            for (m = h = 0; h <= 24; m = h += 8) {
              g.push(f >> m & 255);
            }
            return g;
          }().reverse();
        } else {
          return null;
        }
      };
      t.IPv6 = function () {
        function c(u, d) {
          var p;
          var m;
          var f;
          var h;
          var g;
          var y;
          if (u.length === 16) {
            this.parts = [];
            for (p = m = 0; m <= 14; p = m += 2) {
              this.parts.push(u[p] << 8 | u[p + 1]);
            }
          } else if (u.length === 8) {
            this.parts = u;
          } else {
            throw Error("ipaddr: ipv6 part count should be 8 or 16");
          }
          y = this.parts;
          for (f = 0, h = y.length; f < h; f++) {
            if (g = y[f], !(0 <= g && g <= 65535)) {
              throw Error("ipaddr: ipv6 part should fit in 16 bits");
            }
          }
          if (d) {
            this.zoneId = d;
          }
        }
        c.prototype.kind = function () {
          return "ipv6";
        };
        c.prototype.toString = function () {
          return this.toNormalizedString().replace(/((^|:)(0(:|$))+)/, "::");
        };
        c.prototype.toRFC5952String = function () {
          var u;
          var d;
          var p;
          var m;
          var f;
          m = /((^|:)(0(:|$)){2,})/g;
          f = this.toNormalizedString();
          u = 0;
          d = -1;
          while (p = m.exec(f)) {
            if (p[0].length > d) {
              u = p.index;
              d = p[0].length;
            }
          }
          if (d < 0) {
            return f;
          }
          return f.substring(0, u) + "::" + f.substring(u + d);
        };
        c.prototype.toByteArray = function () {
          var u;
          var d;
          var p;
          var m;
          var f;
          u = [];
          f = this.parts;
          for (d = 0, p = f.length; d < p; d++) {
            m = f[d];
            u.push(m >> 8);
            u.push(m & 255);
          }
          return u;
        };
        c.prototype.toNormalizedString = function () {
          var u;
          var d;
          var p;
          if (u = function () {
            var m;
            var f;
            var h;
            var g;
            h = this.parts;
            g = [];
            for (m = 0, f = h.length; m < f; m++) {
              d = h[m];
              g.push(d.toString(16));
            }
            return g;
          }.call(this).join(":"), p = "", this.zoneId) {
            p = "%" + this.zoneId;
          }
          return u + p;
        };
        c.prototype.toFixedLengthString = function () {
          var u;
          var d;
          var p;
          if (u = function () {
            var m;
            var f;
            var h;
            var g;
            h = this.parts;
            g = [];
            for (m = 0, f = h.length; m < f; m++) {
              d = h[m];
              g.push(d.toString(16).padStart(4, "0"));
            }
            return g;
          }.call(this).join(":"), p = "", this.zoneId) {
            p = "%" + this.zoneId;
          }
          return u + p;
        };
        c.prototype.match = function (u, d) {
          var p;
          if (d === undefined) {
            p = u;
            u = p[0];
            d = p[1];
          }
          if (u.kind() !== "ipv6") {
            throw Error("ipaddr: cannot match ipv6 address with non-ipv6 one");
          }
          return i(this.parts, u.parts, 16, d);
        };
        c.prototype.SpecialRanges = {
          unspecified: [new c([0, 0, 0, 0, 0, 0, 0, 0]), 128],
          linkLocal: [new c([65152, 0, 0, 0, 0, 0, 0, 0]), 10],
          multicast: [new c([65280, 0, 0, 0, 0, 0, 0, 0]), 8],
          loopback: [new c([0, 0, 0, 0, 0, 0, 0, 1]), 128],
          uniqueLocal: [new c([64512, 0, 0, 0, 0, 0, 0, 0]), 7],
          ipv4Mapped: [new c([0, 0, 0, 0, 0, 65535, 0, 0]), 96],
          rfc6145: [new c([0, 0, 0, 0, 65535, 0, 0, 0]), 96],
          rfc6052: [new c([100, 65435, 0, 0, 0, 0, 0, 0]), 96],
          "6to4": [new c([8194, 0, 0, 0, 0, 0, 0, 0]), 16],
          teredo: [new c([8193, 0, 0, 0, 0, 0, 0, 0]), 32],
          reserved: [[new c([8193, 3512, 0, 0, 0, 0, 0, 0]), 32]]
        };
        c.prototype.range = function () {
          return t.subnetMatch(this, this.SpecialRanges);
        };
        c.prototype.isIPv4MappedAddress = function () {
          return this.range() === "ipv4Mapped";
        };
        c.prototype.toIPv4Address = function () {
          var u;
          var d;
          var p;
          if (!this.isIPv4MappedAddress()) {
            throw Error("ipaddr: trying to convert a generic ipv6 address to ipv4");
          }
          p = this.parts.slice(-2);
          u = p[0];
          d = p[1];
          return new t.IPv4([u >> 8, u & 255, d >> 8, d & 255]);
        };
        c.prototype.prefixLengthFromSubnetMask = function () {
          var u;
          var d;
          var p;
          var m;
          var f;
          var h;
          var g;
          g = {
            0: 16,
            32768: 15,
            49152: 14,
            57344: 13,
            61440: 12,
            63488: 11,
            64512: 10,
            65024: 9,
            65280: 8,
            65408: 7,
            65472: 6,
            65504: 5,
            65520: 4,
            65528: 3,
            65532: 2,
            65534: 1,
            65535: 0
          };
          u = 0;
          f = false;
          for (d = p = 7; p >= 0; d = p += -1) {
            if (m = this.parts[d], m in g) {
              if (h = g[m], f && h !== 0) {
                return null;
              }
              if (h !== 16) {
                f = true;
              }
              u += h;
            } else {
              return null;
            }
          }
          return 128 - u;
        };
        return c;
      }();
      o = "(?:[0-9a-f]+::?)+";
      l = "%[0-9a-z]{1,}";
      s = {
        zoneIndex: new RegExp(l, "i"),
        native: new RegExp("^(::)?(" + o + ")?([0-9a-f]+)?(::)?(" + l + ")?$", "i"),
        transitional: new RegExp("^((?:" + o + ")|(?:::)(?:" + o + ")?)" + (n + "\\." + n + "\\." + n + "\\." + n) + ("(" + l + ")?$"), "i")
      };
      e = function (c, u) {
        var d;
        var p;
        var m;
        var f;
        var h;
        var g;
        if (c.indexOf("::") !== c.lastIndexOf("::")) {
          return null;
        }
        if (g = (c.match(s.zoneIndex) || [])[0], g) {
          g = g.substring(1);
          c = c.replace(/%.+$/, "");
        }
        d = 0;
        p = -1;
        while ((p = c.indexOf(":", p + 1)) >= 0) {
          d++;
        }
        if (c.substr(0, 2) === "::") {
          d--;
        }
        if (c.substr(-2, 2) === "::") {
          d--;
        }
        if (d > u) {
          return null;
        }
        h = u - d;
        f = ":";
        while (h--) {
          f += "0:";
        }
        if (c = c.replace("::", f), c[0] === ":") {
          c = c.slice(1);
        }
        if (c[c.length - 1] === ":") {
          c = c.slice(0, -1);
        }
        u = function () {
          var y;
          var _;
          var b;
          var S;
          b = c.split(":");
          S = [];
          for (y = 0, _ = b.length; y < _; y++) {
            m = b[y];
            S.push(parseInt(m, 16));
          }
          return S;
        }();
        return {
          parts: u,
          zoneId: g
        };
      };
      t.IPv6.parser = function (c) {
        var u;
        var d;
        var p;
        var m;
        var f;
        var h;
        var g;
        if (s.native.test(c)) {
          return e(c, 8);
        } else if (m = c.match(s.transitional)) {
          if (g = m[6] || "", u = e(m[1].slice(0, -1) + g, 6), u.parts) {
            h = [parseInt(m[2]), parseInt(m[3]), parseInt(m[4]), parseInt(m[5])];
            for (d = 0, p = h.length; d < p; d++) {
              if (f = h[d], !(0 <= f && f <= 255)) {
                return null;
              }
            }
            u.parts.push(h[0] << 8 | h[1]);
            u.parts.push(h[2] << 8 | h[3]);
            return {
              parts: u.parts,
              zoneId: u.zoneId
            };
          }
        }
        return null;
      };
      t.IPv4.isIPv4 = t.IPv6.isIPv6 = function (c) {
        return this.parser(c) !== null;
      };
      t.IPv4.isValid = function (c) {
        var u;
        try {
          new this(this.parser(c));
          return true;
        } catch (d) {
          u = d;
          return false;
        }
      };
      t.IPv4.isValidFourPartDecimal = function (c) {
        if (t.IPv4.isValid(c) && c.match(/^(0|[1-9]\d*)(\.(0|[1-9]\d*)){3}$/)) {
          return true;
        } else {
          return false;
        }
      };
      t.IPv6.isValid = function (c) {
        var u;
        var d;
        if (typeof c === "string" && c.indexOf(":") === -1) {
          return false;
        }
        try {
          u = this.parser(c);
          new this(u.parts, u.zoneId);
          return true;
        } catch (p) {
          d = p;
          return false;
        }
      };
      t.IPv4.parse = function (c) {
        var u = this.parser(c);
        if (u === null) {
          throw Error("ipaddr: string is not formatted like ip address");
        }
        return new this(u);
      };
      t.IPv6.parse = function (c) {
        var u = this.parser(c);
        if (u.parts === null) {
          throw Error("ipaddr: string is not formatted like ip address");
        }
        return new this(u.parts, u.zoneId);
      };
      t.IPv4.parseCIDR = function (c) {
        var u;
        var d;
        var p;
        if (d = c.match(/^(.+)\/(\d+)$/)) {
          if (u = parseInt(d[2]), u >= 0 && u <= 32) {
            p = [this.parse(d[1]), u];
            Object.defineProperty(p, "toString", {
              value: function () {
                return this.join("/");
              }
            });
            return p;
          }
        }
        throw Error("ipaddr: string is not formatted like an IPv4 CIDR range");
      };
      t.IPv4.subnetMaskFromPrefixLength = function (c) {
        var u;
        var d;
        var p;
        if (c = parseInt(c), c < 0 || c > 32) {
          throw Error("ipaddr: invalid IPv4 prefix length");
        }
        p = [0, 0, 0, 0];
        d = 0;
        u = Math.floor(c / 8);
        while (d < u) {
          p[d] = 255;
          d++;
        }
        if (u < 4) {
          p[u] = Math.pow(2, c % 8) - 1 << 8 - c % 8;
        }
        return new this(p);
      };
      t.IPv4.broadcastAddressFromCIDR = function (c) {
        var u;
        var d;
        var p;
        var m;
        var f;
        var h;
        try {
          u = this.parseCIDR(c);
          m = u[0].toByteArray();
          h = this.subnetMaskFromPrefixLength(u[1]).toByteArray();
          f = [];
          p = 0;
          while (p < 4) {
            f.push(parseInt(m[p], 10) | parseInt(h[p], 10) ^ 255);
            p++;
          }
          return new this(f);
        } catch (g) {
          throw d = g, Error("ipaddr: the address does not have IPv4 CIDR format");
        }
      };
      t.IPv4.networkAddressFromCIDR = function (c) {
        var u;
        var d;
        var p;
        var m;
        var f;
        var h;
        try {
          u = this.parseCIDR(c);
          m = u[0].toByteArray();
          h = this.subnetMaskFromPrefixLength(u[1]).toByteArray();
          f = [];
          p = 0;
          while (p < 4) {
            f.push(parseInt(m[p], 10) & parseInt(h[p], 10));
            p++;
          }
          return new this(f);
        } catch (g) {
          throw d = g, Error("ipaddr: the address does not have IPv4 CIDR format");
        }
      };
      t.IPv6.parseCIDR = function (c) {
        var u;
        var d;
        var p;
        if (d = c.match(/^(.+)\/(\d+)$/)) {
          if (u = parseInt(d[2]), u >= 0 && u <= 128) {
            p = [this.parse(d[1]), u];
            Object.defineProperty(p, "toString", {
              value: function () {
                return this.join("/");
              }
            });
            return p;
          }
        }
        throw Error("ipaddr: string is not formatted like an IPv6 CIDR range");
      };
      t.isValid = function (c) {
        return t.IPv6.isValid(c) || t.IPv4.isValid(c);
      };
      t.parse = function (c) {
        if (t.IPv6.isValid(c)) {
          return t.IPv6.parse(c);
        } else if (t.IPv4.isValid(c)) {
          return t.IPv4.parse(c);
        } else {
          throw Error("ipaddr: the address has neither IPv6 nor IPv4 format");
        }
      };
      t.parseCIDR = function (c) {
        var u;
        try {
          return t.IPv6.parseCIDR(c);
        } catch (d) {
          u = d;
          try {
            return t.IPv4.parseCIDR(c);
          } catch (p) {
            throw u = p, Error("ipaddr: the address has neither IPv6 nor IPv4 CIDR format");
          }
        }
      };
      t.fromByteArray = function (c) {
        var u = c.length;
        if (u === 4) {
          return new t.IPv4(c);
        } else if (u === 16) {
          return new t.IPv6(c);
        } else {
          throw Error("ipaddr: the binary input is neither an IPv6 nor IPv4 address");
        }
      };
      t.process = function (c) {
        var u = this.parse(c);
        if (u.kind() === "ipv6" && u.isIPv4MappedAddress()) {
          return u.toIPv4Address();
        } else {
          return u;
        }
      };
    }).call(BYc);
  });