  var Ora = __commonJS((MIy, Pra) => {
    var vg = wf();
    g_();
    Pra.exports = vg.log = vg.log || {};
    vg.log.levels = ["none", "error", "warning", "info", "debug", "verbose", "max"];
    var fUn = {};
    var Rio = [];
    var Eqt = null;
    vg.log.LEVEL_LOCKED = 2;
    vg.log.NO_LEVEL_CHECK = 4;
    vg.log.INTERPOLATE = 8;
    for (fX = 0; fX < vg.log.levels.length; ++fX) {
      pUn = vg.log.levels[fX];
      fUn[pUn] = {
        index: fX,
        name: pUn.toUpperCase()
      };
    }
    var pUn;
    var fX;
    vg.log.logMessage = function (e) {
      var t = fUn[e.level].index;
      for (var n = 0; n < Rio.length; ++n) {
        var r = Rio[n];
        if (r.flags & vg.log.NO_LEVEL_CHECK) {
          r.f(e);
        } else {
          var o = fUn[r.level].index;
          if (t <= o) {
            r.f(r, e);
          }
        }
      }
    };
    vg.log.prepareStandard = function (e) {
      if (!("standard" in e)) {
        e.standard = fUn[e.level].name + " [" + e.category + "] " + e.message;
      }
    };
    vg.log.prepareFull = function (e) {
      if (!("full" in e)) {
        var t = [e.message];
        t = t.concat([]);
        e.full = vg.util.format.apply(this, t);
      }
    };
    vg.log.prepareStandardFull = function (e) {
      if (!("standardFull" in e)) {
        vg.log.prepareStandard(e);
        e.standardFull = e.standard;
      }
    };
    mUn = ["error", "warning", "info", "debug", "verbose"];
    for (fX = 0; fX < mUn.length; ++fX) {
      (function (t) {
        vg.log[t] = function (n, r) {
          var o = Array.prototype.slice.call(arguments).slice(2);
          var s = {
            timestamp: new Date(),
            level: t,
            category: n,
            message: r,
            arguments: o
          };
          vg.log.logMessage(s);
        };
      })(mUn[fX]);
    }
    var mUn;
    var fX;
    vg.log.makeLogger = function (e) {
      var t = {
        flags: 0,
        f: e
      };
      vg.log.setLevel(t, "none");
      return t;
    };
    vg.log.setLevel = function (e, t) {
      var n = false;
      if (e && !(e.flags & vg.log.LEVEL_LOCKED)) {
        for (var r = 0; r < vg.log.levels.length; ++r) {
          var o = vg.log.levels[r];
          if (t == o) {
            e.level = t;
            n = true;
            break;
          }
        }
      }
      return n;
    };
    vg.log.lock = function (e, t) {
      if (typeof t > "u" || t) {
        e.flags |= vg.log.LEVEL_LOCKED;
      } else {
        e.flags &= ~vg.log.LEVEL_LOCKED;
      }
    };
    vg.log.addLogger = function (e) {
      Rio.push(e);
    };
    if (typeof console < "u" && "log" in console) {
      if (console.error && console.warn && console.info && console.debug) {
        xio = {
          error: console.error,
          warning: console.warn,
          info: console.info,
          debug: console.debug,
          verbose: console.debug
        };
        Vut = function (e, t) {
          vg.log.prepareStandard(t);
          var n = xio[t.level];
          var r = [t.standard];
          r = r.concat(t.arguments.slice());
          n.apply(console, r);
        };
        WGe = vg.log.makeLogger(Vut);
      } else {
        Vut = function (t, n) {
          vg.log.prepareStandardFull(n);
          console.log(n.standardFull);
        };
        WGe = vg.log.makeLogger(Vut);
      }
      vg.log.setLevel(WGe, "debug");
      vg.log.addLogger(WGe);
      Eqt = WGe;
    } else {
      console = {
        log: function () {}
      };
    }
    var WGe;
    var xio;
    var Vut;
    if (Eqt !== null && typeof window < "u" && window.location) {
      if (Gut = new URL(window.location.href).searchParams, Gut.vZc("console.level")) {
        vg.log.setLevel(Eqt, Gut.get("console.level").slice(-1)[0]);
      }
      if (Gut.vZc("console.lock")) {
        if (kio = Gut.get("console.lock").slice(-1)[0], kio == "true") {
          vg.log.lock(Eqt);
        }
      }
    }
    var Gut;
    var kio;
    vg.log.consoleLogger = Eqt;
  });
  var Mra = __commonJS((NIy, Dra) => {
    Dra.exports = Hue();
    VFn();
    Uut();
    $so();
    gio();
  });
  var Fra = __commonJS((LIy, Lra) => {
    var ja = wf();
    SOe();
    jre();
    pqt();
    TOe();
    LGe();
    tio();
    lX();
    g_();
    iUn();
    var yr = ja.asn1;
    var Rq = Lra.exports = ja.pkcs7 = ja.pkcs7 || {};
    Rq.messageFromPem = function (e) {
      var t = ja.pem.oC(e)[0];
      if (t.type !== "PKCS7") {
        var n = Error('Could not convert PKCS#7 message from PEM; PEM header type is not "PKCS#7".');
        throw n.headerType = t.type, n;
      }
      if (t.procType && t.procType.type === "ENCRYPTED") {
        throw Error("Could not convert PKCS#7 message from PEM; PEM is encrypted.");
      }
      var r = yr.fromDer(t.body);
      return Rq.messageFromAsn1(r);
    };
    Rq.messageToPem = function (e, t) {
      var n = {
        type: "PKCS7",
        body: yr.toDer(e.toAsn1()).getBytes()
      };
      return ja.pem.HS(n, {
        maxline: t
      });
    };
    Rq.messageFromAsn1 = function (e) {
      var t = {};
      var n = [];
      if (!yr.validate(e, Rq.asn1.contentInfoValidator, t, n)) {
        var r = Error("Cannot read PKCS#7 message. ASN.1 object is not an PKCS#7 ContentInfo.");
        throw r.errors = n, r;
      }
      var o = yr.derToOid(t.contentType);
      var s;
      switch (o) {
        case ja.pki.oids.envelopedData:
          s = Rq.createEnvelopedData();
          break;
        case ja.pki.oids.encryptedData:
          s = Rq.createEncryptedData();
          break;
        case ja.pki.oids.signedData:
          s = Rq.createSignedData();
          break;
        default:
          throw Error("Cannot read PKCS#7 message. ContentType with OID " + o + " is not (yet) supported.");
      }
      s.fromAsn1(t.content.value[0]);
      return s;
    };
    Rq.createSignedData = function () {
      var e = null;
      e = {
        type: ja.pki.oids.signedData,
        version: 1,
        certificates: [],
        crls: [],
        signers: [],
        digestAlgorithmIdentifiers: [],
        contentInfo: null,
        signerInfos: [],
        fromAsn1: function (r) {
          if (Iio(e, r, Rq.asn1.signedDataValidator), e.certificates = [], e.crls = [], e.digestAlgorithmIdentifiers = [], e.contentInfo = null, e.signerInfos = [], e.rawCapture.certificates) {
            var o = e.rawCapture.certificates.value;
            for (var s = 0; s < o.length; ++s) {
              e.certificates.push(ja.pki.certificateFromAsn1(o[s]));
            }
          }
        },
        toAsn1: function () {
          if (!e.contentInfo) {
            e.sign();
          }
          var r = [];
          for (var o = 0; o < e.certificates.length; ++o) {
            r.push(ja.pki.certificateToAsn1(e.certificates[o]));
          }
          var s = [];
          var i = yr.create(yr.Class.CONTEXT_SPECIFIC, 0, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.INTEGER, false, yr.integerToDer(e.version).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.SET, true, e.digestAlgorithmIdentifiers), e.contentInfo])]);
          if (r.length > 0) {
            i.value[0].value.push(yr.create(yr.Class.CONTEXT_SPECIFIC, 0, true, r));
          }
          if (s.length > 0) {
            i.value[0].value.push(yr.create(yr.Class.CONTEXT_SPECIFIC, 1, true, s));
          }
          i.value[0].value.push(yr.create(yr.Class.UNIVERSAL, yr.Type.SET, true, e.signerInfos));
          return yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.type).getBytes()), i]);
        },
        addSigner: function (r) {
          var {
            issuer: o,
            serialNumber: s
          } = r;
          if (r.certificate) {
            var i = r.certificate;
            if (typeof i === "string") {
              i = ja.pki.certificateFromPem(i);
            }
            o = i.issuer.attributes;
            s = i.serialNumber;
          }
          var a = r.key;
          if (!a) {
            throw Error("Could not add PKCS#7 signer; no private key specified.");
          }
          if (typeof a === "string") {
            a = ja.pki.privateKeyFromPem(a);
          }
          var l = r.digestAlgorithm || ja.pki.oids.sha1;
          switch (l) {
            case ja.pki.oids.sha1:
            case ja.pki.oids.sha256:
            case ja.pki.oids.sha384:
            case ja.pki.oids.sha512:
            case ja.pki.oids.md5:
              break;
            default:
              throw Error("Could not add PKCS#7 signer; unknown message digest algorithm: " + l);
          }
          var c = r.authenticatedAttributes || [];
          if (c.length > 0) {
            var u = false;
            var d = false;
            for (var p = 0; p < c.length; ++p) {
              var m = c[p];
              if (!u && m.type === ja.pki.oids.contentType) {
                if (u = true, d) {
                  break;
                }
                continue;
              }
              if (!d && m.type === ja.pki.oids.messageDigest) {
                if (d = true, u) {
                  break;
                }
                continue;
              }
            }
            if (!u || !d) {
              throw Error("Invalid signer.authenticatedAttributes. If signer.authenticatedAttributes is specified, then it must contain at least two attributes, PKCS #9 content-type and PKCS #9 message-digest.");
            }
          }
          e.signers.push({
            key: a,
            version: 1,
            issuer: o,
            serialNumber: s,
            digestAlgorithm: l,
            signatureAlgorithm: ja.pki.oids.rsaEncryption,
            signature: null,
            authenticatedAttributes: c,
            unauthenticatedAttributes: []
          });
        },
        sign: function (r) {
          if (r = r || {}, typeof e.content !== "object" || e.contentInfo === null) {
            if (e.contentInfo = yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(ja.pki.oids.data).getBytes())]), "content" in e) {
              var o;
              if (e.content instanceof ja.util.ByteBuffer) {
                o = e.content.bytes();
              } else if (typeof e.content === "string") {
                o = ja.util.encodeUtf8(e.content);
              }
              if (r.detached) {
                e.detachedContent = yr.create(yr.Class.UNIVERSAL, yr.Type.OCTETSTRING, false, o);
              } else {
                e.contentInfo.value.push(yr.create(yr.Class.CONTEXT_SPECIFIC, 0, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OCTETSTRING, false, o)]));
              }
            }
          }
          if (e.signers.length === 0) {
            return;
          }
          var s = t();
          n(s);
        },
        verify: function () {
          throw Error("PKCS#7 signature verification not yet implemented.");
        },
        addCertificate: function (r) {
          if (typeof r === "string") {
            r = ja.pki.certificateFromPem(r);
          }
          e.certificates.push(r);
        },
        addCertificateRevokationList: function (r) {
          throw Error("PKCS#7 CRL support not yet implemented.");
        }
      };
      return e;
      function t() {
        var r = {};
        for (var o = 0; o < e.signers.length; ++o) {
          var s = e.signers[o];
          var i = s.digestAlgorithm;
          if (!(i in r)) {
            r[i] = ja.md[ja.pki.oids[i]].create();
          }
          if (s.authenticatedAttributes.length === 0) {
            s.md = r[i];
          } else {
            s.md = ja.md[ja.pki.oids[i]].create();
          }
        }
        e.digestAlgorithmIdentifiers = [];
        for (var i in r) {
          e.digestAlgorithmIdentifiers.push(yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(i).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.NULL, false, "")]));
        }
        return r;
      }
      function n(r) {
        var o;
        if (e.detachedContent) {
          o = e.detachedContent;
        } else {
          o = e.contentInfo.value[1];
          o = o.value[0];
        }
        if (!o) {
          throw Error("Could not sign PKCS#7 message; there is no content to sign.");
        }
        var s = yr.derToOid(e.contentInfo.value[0].value);
        var i = yr.toDer(o);
        i.getByte();
        yr.getBerValueLength(i);
        i = i.getBytes();
        for (var a in r) {
          r[a].start().update(i);
        }
        var l = new Date();
        for (var c = 0; c < e.signers.length; ++c) {
          var u = e.signers[c];
          if (u.authenticatedAttributes.length === 0) {
            if (s !== ja.pki.oids.data) {
              throw Error("Invalid signer; authenticatedAttributes must be present when the ContentInfo content type is not PKCS#7 Data.");
            }
          } else {
            u.authenticatedAttributesAsn1 = yr.create(yr.Class.CONTEXT_SPECIFIC, 0, true, []);
            var d = yr.create(yr.Class.UNIVERSAL, yr.Type.SET, true, []);
            for (var p = 0; p < u.authenticatedAttributes.length; ++p) {
              var m = u.authenticatedAttributes[p];
              if (m.type === ja.pki.oids.messageDigest) {
                m.value = r[u.digestAlgorithm].digest();
              } else if (m.type === ja.pki.oids.signingTime) {
                if (!m.value) {
                  m.value = l;
                }
              }
              d.value.push(Aio(m));
              u.authenticatedAttributesAsn1.value.push(Aio(m));
            }
            i = yr.toDer(d).getBytes();
            u.md.start().update(i);
          }
          u.signature = u.key.sign(u.md, "RSASSA-PKCS1-V1_5");
        }
        e.signerInfos = kcp(e.signers);
      }
    };
    Rq.createEncryptedData = function () {
      var e = null;
      e = {
        type: ja.pki.oids.encryptedData,
        version: 0,
        encryptedContent: {
          algorithm: ja.pki.oids["aes256-CBC"]
        },
        fromAsn1: function (t) {
          Iio(e, t, Rq.asn1.encryptedDataValidator);
        },
        decrypt: function (t) {
          if (t !== undefined) {
            e.encryptedContent.key = t;
          }
          Nra(e);
        }
      };
      return e;
    };
    Rq.createEnvelopedData = function () {
      var e = null;
      e = {
        type: ja.pki.oids.envelopedData,
        version: 0,
        recipients: [],
        encryptedContent: {
          algorithm: ja.pki.oids["aes256-CBC"]
        },
        fromAsn1: function (t) {
          var n = Iio(e, t, Rq.asn1.envelopedDataValidator);
          e.recipients = Ccp(n.recipientInfos.value);
        },
        toAsn1: function () {
          return yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.type).getBytes()), yr.create(yr.Class.CONTEXT_SPECIFIC, 0, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.INTEGER, false, yr.integerToDer(e.version).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.SET, true, Rcp(e.recipients)), yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, Acp(e.encryptedContent))])])]);
        },
        findRecipient: function (t) {
          var n = t.issuer.attributes;
          for (var r = 0; r < e.recipients.length; ++r) {
            var o = e.recipients[r];
            var s = o.issuer;
            if (o.serialNumber !== t.serialNumber) {
              continue;
            }
            if (s.length !== n.length) {
              continue;
            }
            var i = true;
            for (var a = 0; a < n.length; ++a) {
              if (s[a].type !== n[a].type || s[a].value !== n[a].value) {
                i = false;
                break;
              }
            }
            if (i) {
              return o;
            }
          }
          return null;
        },
        decrypt: function (t, n) {
          if (e.encryptedContent.key === undefined && t !== undefined && n !== undefined) {
            switch (t.encryptedContent.algorithm) {
              case ja.pki.oids.rsaEncryption:
              case ja.pki.oids.desCBC:
                var r = n.decrypt(t.encryptedContent.content);
                e.encryptedContent.key = ja.util.createBuffer(r);
                break;
              default:
                throw Error("Unsupported asymmetric cipher, OID " + t.encryptedContent.algorithm);
            }
          }
          Nra(e);
        },
        addRecipient: function (t) {
          e.recipients.push({
            version: 0,
            issuer: t.issuer.attributes,
            serialNumber: t.serialNumber,
            encryptedContent: {
              algorithm: ja.pki.oids.rsaEncryption,
              key: t.publicKey
            }
          });
        },
        encrypt: function (t, n) {
          if (e.encryptedContent.content === undefined) {
            n = n || e.encryptedContent.algorithm;
            t = t || e.encryptedContent.key;
            var r;
            var o;
            var s;
            switch (n) {
              case ja.pki.oids["aes128-CBC"]:
                r = 16;
                o = 16;
                s = ja.aes.createEncryptionCipher;
                break;
              case ja.pki.oids["aes192-CBC"]:
                r = 24;
                o = 16;
                s = ja.aes.createEncryptionCipher;
                break;
              case ja.pki.oids["aes256-CBC"]:
                r = 32;
                o = 16;
                s = ja.aes.createEncryptionCipher;
                break;
              case ja.pki.oids["des-EDE3-CBC"]:
                r = 24;
                o = 8;
                s = ja.des.createEncryptionCipher;
                break;
              default:
                throw Error("Unsupported symmetric cipher, OID " + n);
            }
            if (t === undefined) {
              t = ja.util.createBuffer(ja.random.getBytes(r));
            } else if (t.length() != r) {
              throw Error("Symmetric key has wrong length; got " + t.length() + " bytes, expected " + r + ".");
            }
            e.encryptedContent.algorithm = n;
            e.encryptedContent.key = t;
            e.encryptedContent.parameter = ja.util.createBuffer(ja.random.getBytes(o));
            var i = s(t);
            if (i.start(e.encryptedContent.parameter.copy()), i.update(e.content), !i.finish()) {
              throw Error("Symmetric encryption failed.");
            }
            e.encryptedContent.content = i.output;
          }
          for (var a = 0; a < e.recipients.length; ++a) {
            var l = e.recipients[a];
            if (l.encryptedContent.content !== undefined) {
              continue;
            }
            switch (l.encryptedContent.algorithm) {
              case ja.pki.oids.rsaEncryption:
                l.encryptedContent.content = l.encryptedContent.key.encrypt(e.encryptedContent.key.data);
                break;
              default:
                throw Error("Unsupported asymmetric cipher, OID " + l.encryptedContent.algorithm);
            }
          }
        }
      };
      return e;
    };
    function vcp(e) {
      var t = {};
      var n = [];
      if (!yr.validate(e, Rq.asn1.recipientInfoValidator, t, n)) {
        var r = Error("Cannot read PKCS#7 RecipientInfo. ASN.1 object is not an PKCS#7 RecipientInfo.");
        throw r.errors = n, r;
      }
      return {
        version: t.version.charCodeAt(0),
        issuer: ja.pki.RDNAttributesAsArray(t.issuer),
        serialNumber: ja.util.createBuffer(t.serial).toHex(),
        encryptedContent: {
          algorithm: yr.derToOid(t.encAlgorithm),
          parameter: t.encParameter ? t.encParameter.value : undefined,
          content: t.encKey
        }
      };
    }
    function wcp(e) {
      return yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.INTEGER, false, yr.integerToDer(e.version).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [ja.pki.distinguishedNameToAsn1({
        attributes: e.issuer
      }), yr.create(yr.Class.UNIVERSAL, yr.Type.INTEGER, false, ja.util.hexToBytes(e.serialNumber))]), yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.encryptedContent.algorithm).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.NULL, false, "")]), yr.create(yr.Class.UNIVERSAL, yr.Type.OCTETSTRING, false, e.encryptedContent.content)]);
    }
    function Ccp(e) {
      var t = [];
      for (var n = 0; n < e.length; ++n) {
        t.push(vcp(e[n]));
      }
      return t;
    }
    function Rcp(e) {
      var t = [];
      for (var n = 0; n < e.length; ++n) {
        t.push(wcp(e[n]));
      }
      return t;
    }
    function xcp(e) {
      var t = yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.INTEGER, false, yr.integerToDer(e.version).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [ja.pki.distinguishedNameToAsn1({
        attributes: e.issuer
      }), yr.create(yr.Class.UNIVERSAL, yr.Type.INTEGER, false, ja.util.hexToBytes(e.serialNumber))]), yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.digestAlgorithm).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.NULL, false, "")])]);
      if (e.authenticatedAttributesAsn1) {
        t.value.push(e.authenticatedAttributesAsn1);
      }
      if (t.value.push(yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.signatureAlgorithm).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.NULL, false, "")])), t.value.push(yr.create(yr.Class.UNIVERSAL, yr.Type.OCTETSTRING, false, e.signature)), e.unauthenticatedAttributes.length > 0) {
        var n = yr.create(yr.Class.CONTEXT_SPECIFIC, 1, true, []);
        for (var r = 0; r < e.unauthenticatedAttributes.length; ++r) {
          var o = e.unauthenticatedAttributes[r];
          n.values.push(Aio(o));
        }
        t.value.push(n);
      }
      return t;
    }
    function kcp(e) {
      var t = [];
      for (var n = 0; n < e.length; ++n) {
        t.push(xcp(e[n]));
      }
      return t;
    }
    function Aio(e) {
      var t;
      if (e.type === ja.pki.oids.contentType) {
        t = yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.value).getBytes());
      } else if (e.type === ja.pki.oids.messageDigest) {
        t = yr.create(yr.Class.UNIVERSAL, yr.Type.OCTETSTRING, false, e.value.bytes());
      } else if (e.type === ja.pki.oids.signingTime) {
        var n = new Date("1950-01-01T00:00:00Z");
        var r = new Date("2050-01-01T00:00:00Z");
        var o = e.value;
        if (typeof o === "string") {
          var s = Date.parse(o);
          if (!isNaN(s)) {
            o = new Date(s);
          } else if (o.length === 13) {
            o = yr.utcTimeToDate(o);
          } else {
            o = yr.generalizedTimeToDate(o);
          }
        }
        if (o >= n && o < r) {
          t = yr.create(yr.Class.UNIVERSAL, yr.Type.UTCTIME, false, yr.dateToUtcTime(o));
        } else {
          t = yr.create(yr.Class.UNIVERSAL, yr.Type.GENERALIZEDTIME, false, yr.dateToGeneralizedTime(o));
        }
      }
      return yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.type).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.SET, true, [t])]);
    }
    function Acp(e) {
      return [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(ja.pki.oids.data).getBytes()), yr.create(yr.Class.UNIVERSAL, yr.Type.SEQUENCE, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OID, false, yr.oidToDer(e.algorithm).getBytes()), !e.parameter ? undefined : yr.create(yr.Class.UNIVERSAL, yr.Type.OCTETSTRING, false, e.parameter.getBytes())]), yr.create(yr.Class.CONTEXT_SPECIFIC, 0, true, [yr.create(yr.Class.UNIVERSAL, yr.Type.OCTETSTRING, false, e.content.getBytes())])];
    }
    function Iio(e, t, n) {
      var r = {};
      var o = [];
      if (!yr.validate(t, n, r, o)) {
        var s = Error("Cannot read PKCS#7 message. ASN.1 object is not a supported PKCS#7 message.");
        throw s.errors = s, s;
      }
      var i = yr.derToOid(r.contentType);
      if (i !== ja.pki.oids.data) {
        throw Error("Unsupported PKCS#7 message. Only wrapped ContentType Data supported.");
      }
      if (r.encryptedContent) {
        var a = "";
        if (ja.util.isArray(r.encryptedContent)) {
          for (var l = 0; l < r.encryptedContent.length; ++l) {
            if (r.encryptedContent[l].type !== yr.Type.OCTETSTRING) {
              throw Error("Malformed PKCS#7 message, expecting encrypted content constructed of only OCTET STRING objects.");
            }
            a += r.encryptedContent[l].value;
          }
        } else {
          a = r.encryptedContent;
        }
        e.encryptedContent = {
          algorithm: yr.derToOid(r.encAlgorithm),
          parameter: ja.util.createBuffer(r.encParameter.value),
          content: ja.util.createBuffer(a)
        };
      }
      if (r.content) {
        var a = "";
        if (ja.util.isArray(r.content)) {
          for (var l = 0; l < r.content.length; ++l) {
            if (r.content[l].type !== yr.Type.OCTETSTRING) {
              throw Error("Malformed PKCS#7 message, expecting content constructed of only OCTET STRING objects.");
            }
            a += r.content[l].value;
          }
        } else {
          a = r.content;
        }
        e.content = ja.util.createBuffer(a);
      }
      e.version = r.version.charCodeAt(0);
      e.rawCapture = r;
      return r;
    }
    function Nra(e) {
      if (e.encryptedContent.key === undefined) {
        throw Error("Symmetric key not available.");
      }
      if (e.content === undefined) {
        var t;
        switch (e.encryptedContent.algorithm) {
          case ja.pki.oids["aes128-CBC"]:
          case ja.pki.oids["aes192-CBC"]:
          case ja.pki.oids["aes256-CBC"]:
            t = ja.aes.createDecryptionCipher(e.encryptedContent.key);
            break;
          case ja.pki.oids.desCBC:
          case ja.pki.oids["des-EDE3-CBC"]:
            t = ja.des.createDecryptionCipher(e.encryptedContent.key);
            break;
          default:
            throw Error("Unsupported symmetric cipher, OID " + e.encryptedContent.algorithm);
        }
        if (t.start(e.encryptedContent.parameter), t.update(e.encryptedContent.content), !t.finish()) {
          throw Error("Symmetric decryption failed.");
        }
        e.content = t.output;
      }
    }
  });
  var Bra = __commonJS((FIy, Ura) => {
    var hO = wf();
    SOe();
    Mut();
    VFn();
    Uut();
    g_();
    var gUn = Ura.exports = hO.ssh = hO.ssh || {};
    gUn.privateKeyToPutty = function (e, t, n) {
      n = n || "";
      t = t || "";
      var r = "ssh-rsa";
      var o = t === "" ? "none" : "aes256-cbc";
      var s = "PuTTY-User-Key-File-2: " + r + `\r
`;
      s += "Encryption: " + o + `\r
`;
      s += "Comment: " + n + `\r
`;
      var i = hO.util.createBuffer();
      zut(i, r);
      Yue(i, e.e);
      Yue(i, e.n);
      var a = hO.util.encode64(i.bytes(), 64);
      var l = Math.floor(a.length / 66) + 1;
      s += "Public-Lines: " + l + `\r
`;
      s += a;
      var c = hO.util.createBuffer();
      Yue(c, e.d);
      Yue(c, e.p);
      Yue(c, e.q);
      Yue(c, e.qInv);
      var u;
      if (!t) {
        u = hO.util.encode64(c.bytes(), 64);
      } else {
        var d = c.length() + 16 - 1;
        d -= d % 16;
        var p = hUn(c.bytes());
        p.truncate(p.length() - d + c.length());
        c.putBuffer(p);
        var m = hO.util.createBuffer();
        m.putBuffer(hUn("\x00\x00\x00\x00", t));
        m.putBuffer(hUn("\x00\x00\x00\x01", t));
        var f = hO.aes.createEncryptionCipher(m.truncate(8), "CBC");
        f.start(hO.util.createBuffer().fillWithByte(0, 16));
        f.update(c.copy());
        f.finish();
        var h = f.output;
        h.truncate(16);
        u = hO.util.encode64(h.bytes(), 64);
      }
      l = Math.floor(u.length / 66) + 1;
      s += `\r
Private-Lines: ` + l + `\r
`;
      s += u;
      var g = hUn("putty-private-key-file-mac-key", t);
      var y = hO.util.createBuffer();
      zut(y, r);
      zut(y, o);
      zut(y, n);
      y.putInt32(i.length());
      y.putBuffer(i);
      y.putInt32(c.length());
      y.putBuffer(c);
      var _ = hO.hmac.create();
      _.start("sha1", g);
      _.update(y.bytes());
      s += `\r
Private-MAC: ` + _.digest().toHex() + `\r
`;
      return s;
    };
    gUn.publicKeyToOpenSSH = function (e, t) {
      var n = "ssh-rsa";
      t = t || "";
      var r = hO.util.createBuffer();
      zut(r, n);
      Yue(r, e.e);
      Yue(r, e.n);
      return n + " " + hO.util.encode64(r.bytes()) + " " + t;
    };
    gUn.privateKeyToOpenSSH = function (e, t) {
      if (!t) {
        return hO.pki.privateKeyToPem(e);
      }
      return hO.pki.encryptRsaPrivateKey(e, t, {
        legacy: true,
        algorithm: "aes128"
      });
    };
    gUn.getPublicKeyFingerprint = function (e, t) {
      t = t || {};
      var n = t.md || hO.md.md5.create();
      var r = "ssh-rsa";
      var o = hO.util.createBuffer();
      zut(o, r);
      Yue(o, e.e);
      Yue(o, e.n);
      n.start();
      n.update(o.getBytes());
      var s = n.digest();
      if (t.encoding === "hex") {
        var i = s.toHex();
        if (t.delimiter) {
          return i.match(/.{2}/g).join(t.delimiter);
        }
        return i;
      } else if (t.encoding === "binary") {
        return s.getBytes();
      } else if (t.encoding) {
        throw Error('Unknown encoding "' + t.encoding + '".');
      }
      return s;
    };
    function Yue(e, t) {
      var n = t.toString(16);
      if (n[0] >= "8") {
        n = "00" + n;
      }
      var r = hO.util.hexToBytes(n);
      e.putInt32(r.length);
      e.putBytes(r);
    }
    function zut(e, t) {
      e.putInt32(t.length);
      e.putString(t);
    }
    function hUn() {
      var e = hO.md.sha1.create();
      var t = arguments.length;
      for (var n = 0; n < t; ++n) {
        e.update(arguments[n]);
      }
      return e.digest();
    }
  });
  var yUn = __commonJS((UIy, $ra) => {
    $ra.exports = wf();
    SOe();
    cra();
    jre();
    BFn();
    pqt();
    Rra();
    Mut();
    Ira();
    Ora();
    Mra();
    nio();
    JFn();
    LGe();
    Yso();
    sio();
    Fra();
    aio();
    Xso();
    Hso();
    rUn();
    lX();
    Wso();
    Bra();
    mio();
    g_();
  });