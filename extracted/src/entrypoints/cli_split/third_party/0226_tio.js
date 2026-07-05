  var tio = __commonJS((TIy, $na) => {
    var But = wf();
    jre();
    g_();
    var sl = But.asn1;
    var $ut = $na.exports = But.pkcs7asn1 = But.pkcs7asn1 || {};
    But.pkcs7 = But.pkcs7 || {};
    But.pkcs7.asn1 = $ut;
    var Una = {
      name: "ContentInfo",
      tagClass: sl.Class.UNIVERSAL,
      type: sl.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "ContentInfo.ContentType",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.OID,
        constructed: false,
        capture: "contentType"
      }, {
        name: "ContentInfo.content",
        tagClass: sl.Class.CONTEXT_SPECIFIC,
        type: 0,
        constructed: true,
        optional: true,
        captureAsn1: "content"
      }]
    };
    $ut.contentInfoValidator = Una;
    var Bna = {
      name: "EncryptedContentInfo",
      tagClass: sl.Class.UNIVERSAL,
      type: sl.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "EncryptedContentInfo.contentType",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.OID,
        constructed: false,
        capture: "contentType"
      }, {
        name: "EncryptedContentInfo.contentEncryptionAlgorithm",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "EncryptedContentInfo.contentEncryptionAlgorithm.algorithm",
          tagClass: sl.Class.UNIVERSAL,
          type: sl.Type.OID,
          constructed: false,
          capture: "encAlgorithm"
        }, {
          name: "EncryptedContentInfo.contentEncryptionAlgorithm.parameter",
          tagClass: sl.Class.UNIVERSAL,
          captureAsn1: "encParameter"
        }]
      }, {
        name: "EncryptedContentInfo.encryptedContent",
        tagClass: sl.Class.CONTEXT_SPECIFIC,
        type: 0,
        capture: "encryptedContent",
        captureAsn1: "encryptedContentAsn1"
      }]
    };
    $ut.envelopedDataValidator = {
      name: "EnvelopedData",
      tagClass: sl.Class.UNIVERSAL,
      type: sl.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "EnvelopedData.Version",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.INTEGER,
        constructed: false,
        capture: "version"
      }, {
        name: "EnvelopedData.RecipientInfos",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SET,
        constructed: true,
        captureAsn1: "recipientInfos"
      }].concat(Bna)
    };
    $ut.encryptedDataValidator = {
      name: "EncryptedData",
      tagClass: sl.Class.UNIVERSAL,
      type: sl.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "EncryptedData.Version",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.INTEGER,
        constructed: false,
        capture: "version"
      }].concat(Bna)
    };
    var _lp = {
      name: "SignerInfo",
      tagClass: sl.Class.UNIVERSAL,
      type: sl.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "SignerInfo.version",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.INTEGER,
        constructed: false
      }, {
        name: "SignerInfo.issuerAndSerialNumber",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "SignerInfo.issuerAndSerialNumber.issuer",
          tagClass: sl.Class.UNIVERSAL,
          type: sl.Type.SEQUENCE,
          constructed: true,
          captureAsn1: "issuer"
        }, {
          name: "SignerInfo.issuerAndSerialNumber.serialNumber",
          tagClass: sl.Class.UNIVERSAL,
          type: sl.Type.INTEGER,
          constructed: false,
          capture: "serial"
        }]
      }, {
        name: "SignerInfo.digestAlgorithm",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "SignerInfo.digestAlgorithm.algorithm",
          tagClass: sl.Class.UNIVERSAL,
          type: sl.Type.OID,
          constructed: false,
          capture: "digestAlgorithm"
        }, {
          name: "SignerInfo.digestAlgorithm.parameter",
          tagClass: sl.Class.UNIVERSAL,
          constructed: false,
          captureAsn1: "digestParameter",
          optional: true
        }]
      }, {
        name: "SignerInfo.authenticatedAttributes",
        tagClass: sl.Class.CONTEXT_SPECIFIC,
        type: 0,
        constructed: true,
        optional: true,
        capture: "authenticatedAttributes"
      }, {
        name: "SignerInfo.digestEncryptionAlgorithm",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SEQUENCE,
        constructed: true,
        capture: "signatureAlgorithm"
      }, {
        name: "SignerInfo.encryptedDigest",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.OCTETSTRING,
        constructed: false,
        capture: "signature"
      }, {
        name: "SignerInfo.unauthenticatedAttributes",
        tagClass: sl.Class.CONTEXT_SPECIFIC,
        type: 1,
        constructed: true,
        optional: true,
        capture: "unauthenticatedAttributes"
      }]
    };
    $ut.signedDataValidator = {
      name: "SignedData",
      tagClass: sl.Class.UNIVERSAL,
      type: sl.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "SignedData.Version",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.INTEGER,
        constructed: false,
        capture: "version"
      }, {
        name: "SignedData.DigestAlgorithms",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SET,
        constructed: true,
        captureAsn1: "digestAlgorithms"
      }, Una, {
        name: "SignedData.Certificates",
        tagClass: sl.Class.CONTEXT_SPECIFIC,
        type: 0,
        optional: true,
        captureAsn1: "certificates"
      }, {
        name: "SignedData.CertificateRevocationLists",
        tagClass: sl.Class.CONTEXT_SPECIFIC,
        type: 1,
        optional: true,
        captureAsn1: "crls"
      }, {
        name: "SignedData.SignerInfos",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SET,
        capture: "signerInfos",
        optional: true,
        value: [_lp]
      }]
    };
    $ut.recipientInfoValidator = {
      name: "RecipientInfo",
      tagClass: sl.Class.UNIVERSAL,
      type: sl.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "RecipientInfo.version",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.INTEGER,
        constructed: false,
        capture: "version"
      }, {
        name: "RecipientInfo.issuerAndSerial",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "RecipientInfo.issuerAndSerial.issuer",
          tagClass: sl.Class.UNIVERSAL,
          type: sl.Type.SEQUENCE,
          constructed: true,
          captureAsn1: "issuer"
        }, {
          name: "RecipientInfo.issuerAndSerial.serialNumber",
          tagClass: sl.Class.UNIVERSAL,
          type: sl.Type.INTEGER,
          constructed: false,
          capture: "serial"
        }]
      }, {
        name: "RecipientInfo.keyEncryptionAlgorithm",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "RecipientInfo.keyEncryptionAlgorithm.algorithm",
          tagClass: sl.Class.UNIVERSAL,
          type: sl.Type.OID,
          constructed: false,
          capture: "encAlgorithm"
        }, {
          name: "RecipientInfo.keyEncryptionAlgorithm.parameter",
          tagClass: sl.Class.UNIVERSAL,
          constructed: false,
          captureAsn1: "encParameter",
          optional: true
        }]
      }, {
        name: "RecipientInfo.encryptedKey",
        tagClass: sl.Class.UNIVERSAL,
        type: sl.Type.OCTETSTRING,
        constructed: false,
        capture: "encKey"
      }]
    };
  });
  var nio = __commonJS((EIy, Hna) => {
    var $Ge = wf();
    g_();
    $Ge.mgf = $Ge.mgf || {};
    var blp = Hna.exports = $Ge.mgf.mgf1 = $Ge.mgf1 = $Ge.mgf1 || {};
    blp.create = function (e) {
      var t = {
        generate: function (n, r) {
          var o = new $Ge.util.ByteBuffer();
          var s = Math.ceil(r / e.digestLength);
          for (var i = 0; i < s; i++) {
            var a = new $Ge.util.ByteBuffer();
            a.putInt32(i);
            e.start();
            e.update(n + a.getBytes());
            o.putBuffer(e.digest());
          }
          o.truncate(o.length() - r);
          return o.getBytes();
        }
      };
      return t;
    };
  });
  var qna = __commonJS((vIy, jna) => {
    var nUn = wf();
    nio();
    jna.exports = nUn.mgf = nUn.mgf || {};
    nUn.mgf.mgf1 = nUn.mgf1;
  });
  var rUn = __commonJS((wIy, Wna) => {
    var HGe = wf();
    lX();
    g_();
    var Slp = Wna.exports = HGe.pss = HGe.pss || {};
    Slp.create = function (e) {
      if (arguments.length === 3) {
        e = {
          md: arguments[0],
          mgf: arguments[1],
          saltLength: arguments[2]
        };
      }
      var {
        md: t,
        mgf: n
      } = e;
      var r = t.digestLength;
      var o = e.salt || null;
      if (typeof o === "string") {
        o = HGe.util.createBuffer(o);
      }
      var s;
      if ("saltLength" in e) {
        s = e.saltLength;
      } else if (o !== null) {
        s = o.length();
      } else {
        throw Error("Salt length not specified or specific salt not given.");
      }
      if (o !== null && o.length() !== s) {
        throw Error("Given salt length does not match length of given salt.");
      }
      var i = e.prng || HGe.random;
      var a = {};
      a.HS = function (l, c) {
        var u;
        var d = c - 1;
        var p = Math.ceil(d / 8);
        var m = l.digest().getBytes();
        if (p < r + s + 2) {
          throw Error("Message is too long to encrypt.");
        }
        var f;
        if (o === null) {
          f = i.getBytesSync(s);
        } else {
          f = o.bytes();
        }
        var h = new HGe.util.ByteBuffer();
        h.fillWithByte(0, 8);
        h.putBytes(m);
        h.putBytes(f);
        t.start();
        t.update(h.getBytes());
        var g = t.digest().getBytes();
        var y = new HGe.util.ByteBuffer();
        y.fillWithByte(0, p - s - r - 2);
        y.putByte(1);
        y.putBytes(f);
        var _ = y.getBytes();
        var b = p - r - 1;
        var S = n.generate(g, b);
        var E = "";
        for (u = 0; u < b; u++) {
          E += String.fromCharCode(_.charCodeAt(u) ^ S.charCodeAt(u));
        }
        var C = 65280 >> 8 * p - d & 255;
        E = String.fromCharCode(E.charCodeAt(0) & ~C) + E.substr(1);
        return E + g + String.fromCharCode(188);
      };
      a.verify = function (l, c, u) {
        var d;
        var p = u - 1;
        var m = Math.ceil(p / 8);
        if (c = c.substr(-m), m < r + s + 2) {
          throw Error("Inconsistent parameters to PSS signature verification.");
        }
        if (c.charCodeAt(m - 1) !== 188) {
          throw Error("Encoded message does not end in 0xBC.");
        }
        var f = m - r - 1;
        var h = c.substr(0, f);
        var g = c.substr(f, r);
        var y = 65280 >> 8 * m - p & 255;
        if ((h.charCodeAt(0) & y) !== 0) {
          throw Error("Bits beyond keysize not zero as expected.");
        }
        var _ = n.generate(g, f);
        var b = "";
        for (d = 0; d < f; d++) {
          b += String.fromCharCode(h.charCodeAt(d) ^ _.charCodeAt(d));
        }
        b = String.fromCharCode(b.charCodeAt(0) & ~y) + b.substr(1);
        var S = m - r - s - 2;
        for (d = 0; d < S; d++) {
          if (b.charCodeAt(d) !== 0) {
            throw Error("Leftmost octets not zero as expected");
          }
        }
        if (b.charCodeAt(S) !== 1) {
          throw Error("Inconsistent PSS signature, 0x01 marker not found");
        }
        var E = b.substr(-s);
        var C = new HGe.util.ByteBuffer();
        C.fillWithByte(0, 8);
        C.putBytes(l);
        C.putBytes(E);
        t.start();
        t.update(C.getBytes());
        var x = t.digest().getBytes();
        return g === x;
      };
      return a;
    };
  });
  var iUn = __commonJS((CIy, Yna) => {
    var td = wf();
    SOe();
    jre();
    pqt();
    Hue();
    qna();
    TOe();
    LGe();
    rUn();
    hqt();
    g_();
    var Vt = td.asn1;
    var ia = Yna.exports = td.pki = td.pki || {};
    var Dy = ia.oids;
    var u0 = {};
    u0.CN = Dy.commonName;
    u0.commonName = "CN";
    u0.C = Dy.countryName;
    u0.countryName = "C";
    u0.L = Dy.localityName;
    u0.localityName = "L";
    u0.ST = Dy.stateOrProvinceName;
    u0.stateOrProvinceName = "ST";
    u0.O = Dy.organizationName;
    u0.organizationName = "O";
    u0.OU = Dy.organizationalUnitName;
    u0.organizationalUnitName = "OU";
    u0.E = Dy.emailAddress;
    u0.emailAddress = "E";
    var Vna = td.pki.rsa.publicKeyValidator;
    var Tlp = {
      name: "Certificate",
      tagClass: Vt.Class.UNIVERSAL,
      type: Vt.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "Certificate.TBSCertificate",
        tagClass: Vt.Class.UNIVERSAL,
        type: Vt.Type.SEQUENCE,
        constructed: true,
        captureAsn1: "tbsCertificate",
        value: [{
          name: "Certificate.TBSCertificate.version",
          tagClass: Vt.Class.CONTEXT_SPECIFIC,
          type: 0,
          constructed: true,
          optional: true,
          value: [{
            name: "Certificate.TBSCertificate.version.integer",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.INTEGER,
            constructed: false,
            capture: "certVersion"
          }]
        }, {
          name: "Certificate.TBSCertificate.serialNumber",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.INTEGER,
          constructed: false,
          capture: "certSerialNumber"
        }, {
          name: "Certificate.TBSCertificate.signature",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.SEQUENCE,
          constructed: true,
          value: [{
            name: "Certificate.TBSCertificate.signature.algorithm",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.OID,
            constructed: false,
            capture: "certinfoSignatureOid"
          }, {
            name: "Certificate.TBSCertificate.signature.parameters",
            tagClass: Vt.Class.UNIVERSAL,
            optional: true,
            captureAsn1: "certinfoSignatureParams"
          }]
        }, {
          name: "Certificate.TBSCertificate.issuer",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.SEQUENCE,
          constructed: true,
          captureAsn1: "certIssuer"
        }, {
          name: "Certificate.TBSCertificate.validity",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.SEQUENCE,
          constructed: true,
          value: [{
            name: "Certificate.TBSCertificate.validity.notBefore (utc)",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.UTCTIME,
            constructed: false,
            optional: true,
            capture: "certValidity1UTCTime"
          }, {
            name: "Certificate.TBSCertificate.validity.notBefore (generalized)",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.GENERALIZEDTIME,
            constructed: false,
            optional: true,
            capture: "certValidity2GeneralizedTime"
          }, {
            name: "Certificate.TBSCertificate.validity.notAfter (utc)",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.UTCTIME,
            constructed: false,
            optional: true,
            capture: "certValidity3UTCTime"
          }, {
            name: "Certificate.TBSCertificate.validity.notAfter (generalized)",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.GENERALIZEDTIME,
            constructed: false,
            optional: true,
            capture: "certValidity4GeneralizedTime"
          }]
        }, {
          name: "Certificate.TBSCertificate.subject",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.SEQUENCE,
          constructed: true,
          captureAsn1: "certSubject"
        }, Vna, {
          name: "Certificate.TBSCertificate.issuerUniqueID",
          tagClass: Vt.Class.CONTEXT_SPECIFIC,
          type: 1,
          constructed: true,
          optional: true,
          value: [{
            name: "Certificate.TBSCertificate.issuerUniqueID.id",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.BITSTRING,
            constructed: false,
            captureBitStringValue: "certIssuerUniqueId"
          }]
        }, {
          name: "Certificate.TBSCertificate.subjectUniqueID",
          tagClass: Vt.Class.CONTEXT_SPECIFIC,
          type: 2,
          constructed: true,
          optional: true,
          value: [{
            name: "Certificate.TBSCertificate.subjectUniqueID.id",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.BITSTRING,
            constructed: false,
            captureBitStringValue: "certSubjectUniqueId"
          }]
        }, {
          name: "Certificate.TBSCertificate.extensions",
          tagClass: Vt.Class.CONTEXT_SPECIFIC,
          type: 3,
          constructed: true,
          captureAsn1: "certExtensions",
          optional: true
        }]
      }, {
        name: "Certificate.signatureAlgorithm",
        tagClass: Vt.Class.UNIVERSAL,
        type: Vt.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "Certificate.signatureAlgorithm.algorithm",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.OID,
          constructed: false,
          capture: "certSignatureOid"
        }, {
          name: "Certificate.TBSCertificate.signature.parameters",
          tagClass: Vt.Class.UNIVERSAL,
          optional: true,
          captureAsn1: "certSignatureParams"
        }]
      }, {
        name: "Certificate.signatureValue",
        tagClass: Vt.Class.UNIVERSAL,
        type: Vt.Type.BITSTRING,
        constructed: false,
        captureBitStringValue: "certSignature"
      }]
    };
    var Elp = {
      name: "rsapss",
      tagClass: Vt.Class.UNIVERSAL,
      type: Vt.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "rsapss.hashAlgorithm",
        tagClass: Vt.Class.CONTEXT_SPECIFIC,
        type: 0,
        constructed: true,
        value: [{
          name: "rsapss.hashAlgorithm.AlgorithmIdentifier",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Class.SEQUENCE,
          constructed: true,
          optional: true,
          value: [{
            name: "rsapss.hashAlgorithm.AlgorithmIdentifier.algorithm",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.OID,
            constructed: false,
            capture: "hashOid"
          }]
        }]
      }, {
        name: "rsapss.maskGenAlgorithm",
        tagClass: Vt.Class.CONTEXT_SPECIFIC,
        type: 1,
        constructed: true,
        value: [{
          name: "rsapss.maskGenAlgorithm.AlgorithmIdentifier",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Class.SEQUENCE,
          constructed: true,
          optional: true,
          value: [{
            name: "rsapss.maskGenAlgorithm.AlgorithmIdentifier.algorithm",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.OID,
            constructed: false,
            capture: "maskGenOid"
          }, {
            name: "rsapss.maskGenAlgorithm.AlgorithmIdentifier.params",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.SEQUENCE,
            constructed: true,
            value: [{
              name: "rsapss.maskGenAlgorithm.AlgorithmIdentifier.params.algorithm",
              tagClass: Vt.Class.UNIVERSAL,
              type: Vt.Type.OID,
              constructed: false,
              capture: "maskGenHashOid"
            }]
          }]
        }]
      }, {
        name: "rsapss.saltLength",
        tagClass: Vt.Class.CONTEXT_SPECIFIC,
        type: 2,
        optional: true,
        value: [{
          name: "rsapss.saltLength.saltLength",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Class.INTEGER,
          constructed: false,
          capture: "saltLength"
        }]
      }, {
        name: "rsapss.trailerField",
        tagClass: Vt.Class.CONTEXT_SPECIFIC,
        type: 3,
        optional: true,
        value: [{
          name: "rsapss.trailer.trailer",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Class.INTEGER,
          constructed: false,
          capture: "trailer"
        }]
      }]
    };
    var vlp = {
      name: "CertificationRequestInfo",
      tagClass: Vt.Class.UNIVERSAL,
      type: Vt.Type.SEQUENCE,
      constructed: true,
      captureAsn1: "certificationRequestInfo",
      value: [{
        name: "CertificationRequestInfo.integer",
        tagClass: Vt.Class.UNIVERSAL,
        type: Vt.Type.INTEGER,
        constructed: false,
        capture: "certificationRequestInfoVersion"
      }, {
        name: "CertificationRequestInfo.subject",
        tagClass: Vt.Class.UNIVERSAL,
        type: Vt.Type.SEQUENCE,
        constructed: true,
        captureAsn1: "certificationRequestInfoSubject"
      }, Vna, {
        name: "CertificationRequestInfo.attributes",
        tagClass: Vt.Class.CONTEXT_SPECIFIC,
        type: 0,
        constructed: true,
        optional: true,
        capture: "certificationRequestInfoAttributes",
        value: [{
          name: "CertificationRequestInfo.attributes",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.SEQUENCE,
          constructed: true,
          value: [{
            name: "CertificationRequestInfo.attributes.type",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.OID,
            constructed: false
          }, {
            name: "CertificationRequestInfo.attributes.value",
            tagClass: Vt.Class.UNIVERSAL,
            type: Vt.Type.SET,
            constructed: true
          }]
        }]
      }]
    };
    var wlp = {
      name: "CertificationRequest",
      tagClass: Vt.Class.UNIVERSAL,
      type: Vt.Type.SEQUENCE,
      constructed: true,
      captureAsn1: "csr",
      value: [vlp, {
        name: "CertificationRequest.signatureAlgorithm",
        tagClass: Vt.Class.UNIVERSAL,
        type: Vt.Type.SEQUENCE,
        constructed: true,
        value: [{
          name: "CertificationRequest.signatureAlgorithm.algorithm",
          tagClass: Vt.Class.UNIVERSAL,
          type: Vt.Type.OID,
          constructed: false,
          capture: "csrSignatureOid"
        }, {
          name: "CertificationRequest.signatureAlgorithm.parameters",
          tagClass: Vt.Class.UNIVERSAL,
          optional: true,
          captureAsn1: "csrSignatureParams"
        }]
      }, {
        name: "CertificationRequest.signature",
        tagClass: Vt.Class.UNIVERSAL,
        type: Vt.Type.BITSTRING,
        constructed: false,
        captureBitStringValue: "csrSignature"
      }]
    };
    ia.RDNAttributesAsArray = function (e, t) {
      var n = [];
      var r;
      var o;
      var s;
      for (var i = 0; i < e.value.length; ++i) {
        r = e.value[i];
        for (var a = 0; a < r.value.length; ++a) {
          if (s = {}, o = r.value[a], s.type = Vt.derToOid(o.value[0].value), s.value = o.value[1].value, s.valueTagClass = o.value[1].type, s.type in Dy) {
            if (s.name = Dy[s.type], s.name in u0) {
              s.shortName = u0[s.name];
            }
          }
          if (t) {
            t.update(s.type);
            t.update(s.value);
          }
          n.push(s);
        }
      }
      return n;
    };
    ia.CRIAttributesAsArray = function (e) {
      var t = [];
      for (var n = 0; n < e.length; ++n) {
        var r = e[n];
        var o = Vt.derToOid(r.value[0].value);
        var s = r.value[1].value;
        for (var i = 0; i < s.length; ++i) {
          var a = {};
          if (a.type = o, a.value = s[i].value, a.valueTagClass = s[i].type, a.type in Dy) {
            if (a.name = Dy[a.type], a.name in u0) {
              a.shortName = u0[a.name];
            }
          }
          if (a.type === Dy.extensionRequest) {
            a.extensions = [];
            for (var l = 0; l < a.value.length; ++l) {
              a.extensions.push(ia.certificateExtensionFromAsn1(a.value[l]));
            }
          }
          t.push(a);
        }
      }
      return t;
    };
    function wOe(e, t) {
      if (typeof t === "string") {
        t = {
          shortName: t
        };
      }
      var n = null;
      var r;
      for (var o = 0; n === null && o < e.attributes.length; ++o) {
        if (r = e.attributes[o], t.type && t.type === r.type) {
          n = r;
        } else if (t.name && t.name === r.name) {
          n = r;
        } else if (t.shortName && t.shortName === r.shortName) {
          n = r;
        }
      }
      return n;
    }
    var oUn = function (e, t, n) {
      var r = {};
      if (e !== Dy["RSASSA-PSS"]) {
        return r;
      }
      if (n) {
        r = {
          hash: {
            algorithmOid: Dy.sha1
          },
          mgf: {
            algorithmOid: Dy.mgf1,
            hash: {
              algorithmOid: Dy.sha1
            }
          },
          saltLength: 20
        };
      }
      var o = {};
      var s = [];
      if (!Vt.validate(t, Elp, o, s)) {
        var i = Error("Cannot read RSASSA-PSS parameter block.");
        throw i.errors = s, i;
      }
      if (o.hashOid !== undefined) {
        r.hash = r.hash || {};
        r.hash.algorithmOid = Vt.derToOid(o.hashOid);
      }
      if (o.maskGenOid !== undefined) {
        r.mgf = r.mgf || {};
        r.mgf.algorithmOid = Vt.derToOid(o.maskGenOid);
        r.mgf.hash = r.mgf.hash || {};
        r.mgf.hash.algorithmOid = Vt.derToOid(o.maskGenHashOid);
      }
      if (o.saltLength !== undefined) {
        r.saltLength = o.saltLength.charCodeAt(0);
      }
      return r;
    };
    var sUn = function (e) {
      switch (Dy[e.signatureOid]) {
        case "sha1WithRSAEncryption":
        case "sha1WithRSASignature":
          return td.md.sha1.create();
        case "md5WithRSAEncryption":
          return td.md.md5.create();
        case "sha256WithRSAEncryption":
          return td.md.sha256.create();
        case "sha384WithRSAEncryption":
          return td.md.sha384.create();
        case "sha512WithRSAEncryption":
          return td.md.sha512.create();
        case "RSASSA-PSS":
          return td.md.sha256.create();
        default:
          var t = Error("Could not compute " + e.type + " digest. Unknown signature OID.");
          throw t.signatureOid = e.signatureOid, t;
      }
    };
    var zna = function (e) {
      var t = e.certificate;
      var n;
      switch (t.signatureOid) {
        case Dy.sha1WithRSAEncryption:
        case Dy.sha1WithRSASignature:
          break;
        case Dy["RSASSA-PSS"]:
          var r;
          var o;
          if (r = Dy[t.signatureParameters.mgf.hash.algorithmOid], r === undefined || td.md[r] === undefined) {
            var s = Error("Unsupported MGF hash function.");
            throw s.oid = t.signatureParameters.mgf.hash.algorithmOid, s.name = r, s;
          }
          if (o = Dy[t.signatureParameters.mgf.algorithmOid], o === undefined || td.mgf[o] === undefined) {
            var s = Error("Unsupported MGF function.");
            throw s.oid = t.signatureParameters.mgf.algorithmOid, s.name = o, s;
          }
          if (o = td.mgf[o].create(td.md[r].create()), r = Dy[t.signatureParameters.hash.algorithmOid], r === undefined || td.md[r] === undefined) {
            var s = Error("Unsupported RSASSA-PSS hash function.");
            throw s.oid = t.signatureParameters.hash.algorithmOid, s.name = r, s;
          }
          n = td.pss.create(td.md[r].create(), o, t.signatureParameters.saltLength);
          break;
      }
      return t.publicKey.verify(e.md.digest().getBytes(), e.signature, n);
    };
    ia.certificateFromPem = function (e, t, n) {
      var r = td.pem.oC(e)[0];
      if (r.type !== "CERTIFICATE" && r.type !== "X509 CERTIFICATE" && r.type !== "TRUSTED CERTIFICATE") {
        var o = Error('Could not convert certificate from PEM; PEM header type is not "CERTIFICATE", "X509 CERTIFICATE", or "TRUSTED CERTIFICATE".');
        throw o.headerType = r.type, o;
      }
      if (r.procType && r.procType.type === "ENCRYPTED") {
        throw Error("Could not convert certificate from PEM; PEM is encrypted.");
      }
      var s = Vt.fromDer(r.body, n);
      return ia.certificateFromAsn1(s, t);
    };
    ia.certificateToPem = function (e, t) {
      var n = {
        type: "CERTIFICATE",
        body: Vt.toDer(ia.certificateToAsn1(e)).getBytes()
      };
      return td.pem.HS(n, {
        maxline: t
      });
    };
    ia.publicKeyFromPem = function (e) {
      var t = td.pem.oC(e)[0];
      if (t.type !== "PUBLIC KEY" && t.type !== "RSA PUBLIC KEY") {
        var n = Error('Could not convert public key from PEM; PEM header type is not "PUBLIC KEY" or "RSA PUBLIC KEY".');
        throw n.headerType = t.type, n;
      }
      if (t.procType && t.procType.type === "ENCRYPTED") {
        throw Error("Could not convert public key from PEM; PEM is encrypted.");
      }
      var r = Vt.fromDer(t.body);
      return ia.publicKeyFromAsn1(r);
    };
    ia.publicKeyToPem = function (e, t) {
      var n = {
        type: "PUBLIC KEY",
        body: Vt.toDer(ia.publicKeyToAsn1(e)).getBytes()
      };
      return td.pem.HS(n, {
        maxline: t
      });
    };
    ia.publicKeyToRSAPublicKeyPem = function (e, t) {
      var n = {
        type: "RSA PUBLIC KEY",
        body: Vt.toDer(ia.publicKeyToRSAPublicKey(e)).getBytes()
      };
      return td.pem.HS(n, {
        maxline: t
      });
    };
    ia.getPublicKeyFingerprint = function (e, t) {
      t = t || {};
      var n = t.md || td.md.sha1.create();
      var r = t.type || "RSAPublicKey";
      var o;
      switch (r) {
        case "RSAPublicKey":
          o = Vt.toDer(ia.publicKeyToRSAPublicKey(e)).getBytes();
          break;
        case "SubjectPublicKeyInfo":
          o = Vt.toDer(ia.publicKeyToAsn1(e)).getBytes();
          break;
        default:
          throw Error('Unknown fingerprint type "' + t.type + '".');
      }
      n.start();
      n.update(o);
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
    ia.certificationRequestFromPem = function (e, t, n) {
      var r = td.pem.oC(e)[0];
      if (r.type !== "CERTIFICATE REQUEST") {
        var o = Error('Could not convert certification request from PEM; PEM header type is not "CERTIFICATE REQUEST".');
        throw o.headerType = r.type, o;
      }
      if (r.procType && r.procType.type === "ENCRYPTED") {
        throw Error("Could not convert certification request from PEM; PEM is encrypted.");
      }
      var s = Vt.fromDer(r.body, n);
      return ia.certificationRequestFromAsn1(s, t);
    };
    ia.certificationRequestToPem = function (e, t) {
      var n = {
        type: "CERTIFICATE REQUEST",
        body: Vt.toDer(ia.certificationRequestToAsn1(e)).getBytes()
      };
      return td.pem.HS(n, {
        maxline: t
      });
    };
    ia.createCertificate = function () {
      var e = {};
      e.version = 2;
      e.serialNumber = "00";
      e.signatureOid = null;
      e.signature = null;
      e.siginfo = {};
      e.siginfo.algorithmOid = null;
      e.validity = {};
      e.validity.notBefore = new Date();
      e.validity.notAfter = new Date();
      e.issuer = {};
      e.issuer.getField = function (t) {
        return wOe(e.issuer, t);
      };
      e.issuer.addField = function (t) {
        dX([t]);
        e.issuer.attributes.push(t);
      };
      e.issuer.attributes = [];
      e.issuer.hash = null;
      e.subject = {};
      e.subject.getField = function (t) {
        return wOe(e.subject, t);
      };
      e.subject.addField = function (t) {
        dX([t]);
        e.subject.attributes.push(t);
      };
      e.subject.attributes = [];
      e.subject.hash = null;
      e.extensions = [];
      e.publicKey = null;
      e.md = null;
      e.setSubject = function (t, n) {
        if (dX(t), e.subject.attributes = t, delete e.subject.uniqueId, n) {
          e.subject.uniqueId = n;
        }
        e.subject.hash = null;
      };
      e.setIssuer = function (t, n) {
        if (dX(t), e.issuer.attributes = t, delete e.issuer.uniqueId, n) {
          e.issuer.uniqueId = n;
        }
        e.issuer.hash = null;
      };
      e.setExtensions = function (t) {
        for (var n = 0; n < t.length; ++n) {
          Kna(t[n], {
            cert: e
          });
        }
        e.extensions = t;
      };
      e.getExtension = function (t) {
        if (typeof t === "string") {
          t = {
            name: t
          };
        }
        var n = null;
        var r;
        for (var o = 0; n === null && o < e.extensions.length; ++o) {
          if (r = e.extensions[o], t.id && r.id === t.id) {
            n = r;
          } else if (t.name && r.name === t.name) {
            n = r;
          }
        }
        return n;
      };
      e.sign = function (t, n) {
        e.md = n || td.md.sha1.create();
        var r = Dy[e.md.algorithm + "WithRSAEncryption"];
        if (!r) {
          var o = Error("Could not compute certificate digest. Unknown message digest algorithm OID.");
          throw o.algorithm = e.md.algorithm, o;
        }
        e.signatureOid = e.siginfo.algorithmOid = r;
        e.tbsCertificate = ia.getTBSCertificate(e);
        var s = Vt.toDer(e.tbsCertificate);
        e.md.update(s.getBytes());
        e.signature = t.sign(e.md);
      };
      e.verify = function (t) {
        var n = false;
        if (!e.issued(t)) {
          var r = t.issuer;
          var o = e.subject;
          var s = Error("The parent certificate did not issue the given child certificate; the child certificate's issuer does not match the parent's subject.");
          throw s.expectedIssuer = o.attributes, s.actualIssuer = r.attributes, s;
        }
        var i = t.md;
        if (i === null) {
          i = sUn({
            signatureOid: t.signatureOid,
            type: "certificate"
          });
          var a = t.tbsCertificate || ia.getTBSCertificate(t);
          var l = Vt.toDer(a);
          i.update(l.getBytes());
        }
        if (i !== null) {
          n = zna({
            certificate: e,
            md: i,
            signature: t.signature
          });
        }
        return n;
      };
      e.isIssuer = function (t) {
        var n = false;
        var r = e.issuer;
        var o = t.subject;
        if (r.hash && o.hash) {
          n = r.hash === o.hash;
        } else if (r.attributes.length === o.attributes.length) {
          n = true;
          var s;
          var i;
          for (var a = 0; n && a < r.attributes.length; ++a) {
            if (s = r.attributes[a], i = o.attributes[a], s.type !== i.type || s.value !== i.value) {
              n = false;
            }
          }
        }
        return n;
      };
      e.issued = function (t) {
        return t.isIssuer(e);
      };
      e.generateSubjectKeyIdentifier = function () {
        return ia.getPublicKeyFingerprint(e.publicKey, {
          type: "RSAPublicKey"
        });
      };
      e.verifySubjectKeyIdentifier = function () {
        var t = Dy.subjectKeyIdentifier;
        for (var n = 0; n < e.extensions.length; ++n) {
          var r = e.extensions[n];
          if (r.id === t) {
            var o = e.generateSubjectKeyIdentifier().getBytes();
            return td.util.hexToBytes(r.subjectKeyIdentifier) === o;
          }
        }
        return false;
      };
      return e;
    };
    ia.certificateFromAsn1 = function (e, t) {
      var n = {};
      var r = [];
      if (!Vt.validate(e, Tlp, n, r)) {
        var o = Error("Cannot read X.509 certificate. ASN.1 object is not an X509v3 Certificate.");
        throw o.errors = r, o;
      }
      var s = Vt.derToOid(n.publicKeyOid);
      if (s !== ia.oids.rsaEncryption) {
        throw Error("Cannot read public key. OID is not RSA.");
      }
      var i = ia.createCertificate();
      i.version = n.certVersion ? n.certVersion.charCodeAt(0) : 0;
      var a = td.util.createBuffer(n.certSerialNumber);
      i.serialNumber = a.toHex();
      i.signatureOid = td.asn1.derToOid(n.certSignatureOid);
      i.signatureParameters = oUn(i.signatureOid, n.certSignatureParams, true);
      i.siginfo.algorithmOid = td.asn1.derToOid(n.certinfoSignatureOid);
      i.siginfo.parameters = oUn(i.siginfo.algorithmOid, n.certinfoSignatureParams, false);
      i.signature = n.certSignature;
      var l = [];
      if (n.certValidity1UTCTime !== undefined) {
        l.push(Vt.utcTimeToDate(n.certValidity1UTCTime));
      }
      if (n.certValidity2GeneralizedTime !== undefined) {
        l.push(Vt.generalizedTimeToDate(n.certValidity2GeneralizedTime));
      }
      if (n.certValidity3UTCTime !== undefined) {
        l.push(Vt.utcTimeToDate(n.certValidity3UTCTime));
      }
      if (n.certValidity4GeneralizedTime !== undefined) {
        l.push(Vt.generalizedTimeToDate(n.certValidity4GeneralizedTime));
      }
      if (l.length > 2) {
        throw Error("Cannot read notBefore/notAfter validity times; more than two times were provided in the certificate.");
      }
      if (l.length < 2) {
        throw Error("Cannot read notBefore/notAfter validity times; they were not provided as either UTCTime or GeneralizedTime.");
      }
      if (i.validity.notBefore = l[0], i.validity.notAfter = l[1], i.tbsCertificate = n.tbsCertificate, t) {
        i.md = sUn({
          signatureOid: i.signatureOid,
          type: "certificate"
        });
        var c = Vt.toDer(i.tbsCertificate);
        i.md.update(c.getBytes());
      }
      var u = td.md.sha1.create();
      var d = Vt.toDer(n.certIssuer);
      if (u.update(d.getBytes()), i.issuer.getField = function (f) {
        return wOe(i.issuer, f);
      }, i.issuer.addField = function (f) {
        dX([f]);
        i.issuer.attributes.push(f);
      }, i.issuer.attributes = ia.RDNAttributesAsArray(n.certIssuer), n.certIssuerUniqueId) {
        i.issuer.uniqueId = n.certIssuerUniqueId;
      }
      i.issuer.hash = u.digest().toHex();
      var p = td.md.sha1.create();
      var m = Vt.toDer(n.certSubject);
      if (p.update(m.getBytes()), i.subject.getField = function (f) {
        return wOe(i.subject, f);
      }, i.subject.addField = function (f) {
        dX([f]);
        i.subject.attributes.push(f);
      }, i.subject.attributes = ia.RDNAttributesAsArray(n.certSubject), n.certSubjectUniqueId) {
        i.subject.uniqueId = n.certSubjectUniqueId;
      }
      if (i.subject.hash = p.digest().toHex(), n.certExtensions) {
        i.extensions = ia.certificateExtensionsFromAsn1(n.certExtensions);
      } else {
        i.extensions = [];
      }
      i.publicKey = ia.publicKeyFromAsn1(n.subjectPublicKeyInfo);
      return i;
    };
    ia.certificateExtensionsFromAsn1 = function (e) {
      var t = [];
      for (var n = 0; n < e.value.length; ++n) {
        var r = e.value[n];
        for (var o = 0; o < r.value.length; ++o) {
          t.push(ia.certificateExtensionFromAsn1(r.value[o]));
        }
      }
      return t;
    };
    ia.certificateExtensionFromAsn1 = function (e) {
      var t = {};
      if (t.id = Vt.derToOid(e.value[0].value), t.critical = false, e.value[1].type === Vt.Type.BOOLEAN) {
        t.critical = e.value[1].value.charCodeAt(0) !== 0;
        t.value = e.value[2].value;
      } else {
        t.value = e.value[1].value;
      }
      if (t.id in Dy) {
        if (t.name = Dy[t.id], t.name === "keyUsage") {
          var n = Vt.fromDer(t.value);
          var r = 0;
          var o = 0;
          if (n.value.length > 1) {
            r = n.value.charCodeAt(1);
            o = n.value.length > 2 ? n.value.charCodeAt(2) : 0;
          }
          t.digitalSignature = (r & 128) === 128;
          t.nonRepudiation = (r & 64) === 64;
          t.keyEncipherment = (r & 32) === 32;
          t.dataEncipherment = (r & 16) === 16;
          t.keyAgreement = (r & 8) === 8;
          t.keyCertSign = (r & 4) === 4;
          t.cRLSign = (r & 2) === 2;
          t.encipherOnly = (r & 1) === 1;
          t.decipherOnly = (o & 128) === 128;
        } else if (t.name === "basicConstraints") {
          var n = Vt.fromDer(t.value);
          if (n.value.length > 0 && n.value[0].type === Vt.Type.BOOLEAN) {
            t.cA = n.value[0].value.charCodeAt(0) !== 0;
          } else {
            t.cA = false;
          }
          var s = null;
          if (n.value.length > 0 && n.value[0].type === Vt.Type.INTEGER) {
            s = n.value[0].value;
          } else if (n.value.length > 1) {
            s = n.value[1].value;
          }
          if (s !== null) {
            t.pathLenConstraint = Vt.derToInteger(s);
          }
        } else if (t.name === "extKeyUsage") {
          var n = Vt.fromDer(t.value);
          for (var i = 0; i < n.value.length; ++i) {
            var a = Vt.derToOid(n.value[i].value);
            if (a in Dy) {
              t[Dy[a]] = true;
            } else {
              t[a] = true;
            }
          }
        } else if (t.name === "nsCertType") {
          var n = Vt.fromDer(t.value);
          var r = 0;
          if (n.value.length > 1) {
            r = n.value.charCodeAt(1);
          }
          t.client = (r & 128) === 128;
          t.server = (r & 64) === 64;
          t.email = (r & 32) === 32;
          t.objsign = (r & 16) === 16;
          t.reserved = (r & 8) === 8;
          t.sslCA = (r & 4) === 4;
          t.emailCA = (r & 2) === 2;
          t.objCA = (r & 1) === 1;
        } else if (t.name === "subjectAltName" || t.name === "issuerAltName") {
          t.altNames = [];
          var l;
          var n = Vt.fromDer(t.value);
          for (var c = 0; c < n.value.length; ++c) {
            l = n.value[c];
            var u = {
              type: l.type,
              value: l.value
            };
            switch (t.altNames.push(u), l.type) {
              case 1:
              case 2:
              case 6:
                break;
              case 7:
                u.ip = td.util.bytesToIP(l.value);
                break;
              case 8:
                u.oid = Vt.derToOid(l.value);
                break;
              default:
            }
          }
        } else if (t.name === "subjectKeyIdentifier") {
          var n = Vt.fromDer(t.value);
          t.subjectKeyIdentifier = td.util.bytesToHex(n.value);
        }
      }
      return t;
    };
    ia.certificationRequestFromAsn1 = function (e, t) {
      var n = {};
      var r = [];
      if (!Vt.validate(e, wlp, n, r)) {
        var o = Error("Cannot read PKCS#10 certificate request. ASN.1 object is not a PKCS#10 CertificationRequest.");
        throw o.errors = r, o;
      }
      var s = Vt.derToOid(n.publicKeyOid);
      if (s !== ia.oids.rsaEncryption) {
        throw Error("Cannot read public key. OID is not RSA.");
      }
      var i = ia.createCertificationRequest();
      if (i.version = n.csrVersion ? n.csrVersion.charCodeAt(0) : 0, i.signatureOid = td.asn1.derToOid(n.csrSignatureOid), i.signatureParameters = oUn(i.signatureOid, n.csrSignatureParams, true), i.siginfo.algorithmOid = td.asn1.derToOid(n.csrSignatureOid), i.siginfo.parameters = oUn(i.siginfo.algorithmOid, n.csrSignatureParams, false), i.signature = n.csrSignature, i.certificationRequestInfo = n.certificationRequestInfo, t) {
        i.md = sUn({
          signatureOid: i.signatureOid,
          type: "certification request"
        });
        var a = Vt.toDer(i.certificationRequestInfo);
        i.md.update(a.getBytes());
      }
      var l = td.md.sha1.create();
      i.subject.getField = function (c) {
        return wOe(i.subject, c);
      };
      i.subject.addField = function (c) {
        dX([c]);
        i.subject.attributes.push(c);
      };
      i.subject.attributes = ia.RDNAttributesAsArray(n.certificationRequestInfoSubject, l);
      i.subject.hash = l.digest().toHex();
      i.publicKey = ia.publicKeyFromAsn1(n.subjectPublicKeyInfo);
      i.getAttribute = function (c) {
        return wOe(i, c);
      };
      i.addAttribute = function (c) {
        dX([c]);
        i.attributes.push(c);
      };
      i.attributes = ia.CRIAttributesAsArray(n.certificationRequestInfoAttributes || []);
      return i;
    };
    ia.createCertificationRequest = function () {
      var e = {};
      e.version = 0;
      e.signatureOid = null;
      e.signature = null;
      e.siginfo = {};
      e.siginfo.algorithmOid = null;
      e.subject = {};
      e.subject.getField = function (t) {
        return wOe(e.subject, t);
      };
      e.subject.addField = function (t) {
        dX([t]);
        e.subject.attributes.push(t);
      };
      e.subject.attributes = [];
      e.subject.hash = null;
      e.publicKey = null;
      e.attributes = [];
      e.getAttribute = function (t) {
        return wOe(e, t);
      };
      e.addAttribute = function (t) {
        dX([t]);
        e.attributes.push(t);
      };
      e.md = null;
      e.setSubject = function (t) {
        dX(t);
        e.subject.attributes = t;
        e.subject.hash = null;
      };
      e.setAttributes = function (t) {
        dX(t);
        e.attributes = t;
      };
      e.sign = function (t, n) {
        e.md = n || td.md.sha1.create();
        var r = Dy[e.md.algorithm + "WithRSAEncryption"];
        if (!r) {
          var o = Error("Could not compute certification request digest. Unknown message digest algorithm OID.");
          throw o.algorithm = e.md.algorithm, o;
        }
        e.signatureOid = e.siginfo.algorithmOid = r;
        e.certificationRequestInfo = ia.getCertificationRequestInfo(e);
        var s = Vt.toDer(e.certificationRequestInfo);
        e.md.update(s.getBytes());
        e.signature = t.sign(e.md);
      };
      e.verify = function () {
        var t = false;
        var n = e.md;
        if (n === null) {
          n = sUn({
            signatureOid: e.signatureOid,
            type: "certification request"
          });
          var r = e.certificationRequestInfo || ia.getCertificationRequestInfo(e);
          var o = Vt.toDer(r);
          n.update(o.getBytes());
        }
        if (n !== null) {
          t = zna({
            certificate: e,
            md: n,
            signature: e.signature
          });
        }
        return t;
      };
      return e;
    };
    function Hut(e) {
      var t = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
      var n;
      var r;
      var o = e.attributes;
      for (var s = 0; s < o.length; ++s) {
        n = o[s];
        var i = n.value;
        var a = Vt.Type.PRINTABLESTRING;
        if ("valueTagClass" in n) {
          if (a = n.valueTagClass, a === Vt.Type.UTF8) {
            i = td.util.encodeUtf8(i);
          }
        }
        r = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SET, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(n.type).getBytes()), Vt.create(Vt.Class.UNIVERSAL, a, false, i)])]);
        t.value.push(r);
      }
      return t;
    }
    function dX(e) {
      var t;
      for (var n = 0; n < e.length; ++n) {
        if (t = e[n], typeof t.name > "u") {
          if (t.type && t.type in ia.oids) {
            t.name = ia.oids[t.type];
          } else if (t.shortName && t.shortName in u0) {
            t.name = ia.oids[u0[t.shortName]];
          }
        }
        if (typeof t.type > "u") {
          if (t.name && t.name in ia.oids) {
            t.type = ia.oids[t.name];
          } else {
            var r = Error("Attribute type not specified.");
            throw r.attribute = t, r;
          }
        }
        if (typeof t.shortName > "u") {
          if (t.name && t.name in u0) {
            t.shortName = u0[t.name];
          }
        }
        if (t.type === Dy.extensionRequest) {
          if (t.valueConstructed = true, t.valueTagClass = Vt.Type.SEQUENCE, !t.value && t.extensions) {
            t.value = [];
            for (var o = 0; o < t.extensions.length; ++o) {
              t.value.push(ia.certificateExtensionToAsn1(Kna(t.extensions[o])));
            }
          }
        }
        if (typeof t.value > "u") {
          var r = Error("Attribute value not specified.");
          throw r.attribute = t, r;
        }
      }
    }
    function Kna(e, t) {
      if (t = t || {}, typeof e.name > "u") {
        if (e.id && e.id in ia.oids) {
          e.name = ia.oids[e.id];
        }
      }
      if (typeof e.id > "u") {
        if (e.name && e.name in ia.oids) {
          e.id = ia.oids[e.name];
        } else {
          var n = Error("Extension ID not specified.");
          throw n.extension = e, n;
        }
      }
      if (typeof e.value < "u") {
        return e;
      }
      if (e.name === "keyUsage") {
        var r = 0;
        var o = 0;
        var s = 0;
        if (e.digitalSignature) {
          o |= 128;
          r = 7;
        }
        if (e.nonRepudiation) {
          o |= 64;
          r = 6;
        }
        if (e.keyEncipherment) {
          o |= 32;
          r = 5;
        }
        if (e.dataEncipherment) {
          o |= 16;
          r = 4;
        }
        if (e.keyAgreement) {
          o |= 8;
          r = 3;
        }
        if (e.keyCertSign) {
          o |= 4;
          r = 2;
        }
        if (e.cRLSign) {
          o |= 2;
          r = 1;
        }
        if (e.encipherOnly) {
          o |= 1;
          r = 0;
        }
        if (e.decipherOnly) {
          s |= 128;
          r = 7;
        }
        var i = String.fromCharCode(r);
        if (s !== 0) {
          i += String.fromCharCode(o) + String.fromCharCode(s);
        } else if (o !== 0) {
          i += String.fromCharCode(o);
        }
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BITSTRING, false, i);
      } else if (e.name === "basicConstraints") {
        if (e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []), e.cA) {
          e.value.value.push(Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BOOLEAN, false, String.fromCharCode(255)));
        }
        if ("pathLenConstraint" in e) {
          e.value.value.push(Vt.create(Vt.Class.UNIVERSAL, Vt.Type.INTEGER, false, Vt.integerToDer(e.pathLenConstraint).getBytes()));
        }
      } else if (e.name === "extKeyUsage") {
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
        var a = e.value.value;
        for (var l in e) {
          if (e[l] !== true) {
            continue;
          }
          if (l in Dy) {
            a.push(Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(Dy[l]).getBytes()));
          } else if (l.indexOf(".") !== -1) {
            a.push(Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(l).getBytes()));
          }
        }
      } else if (e.name === "nsCertType") {
        var r = 0;
        var o = 0;
        if (e.client) {
          o |= 128;
          r = 7;
        }
        if (e.server) {
          o |= 64;
          r = 6;
        }
        if (e.email) {
          o |= 32;
          r = 5;
        }
        if (e.objsign) {
          o |= 16;
          r = 4;
        }
        if (e.reserved) {
          o |= 8;
          r = 3;
        }
        if (e.sslCA) {
          o |= 4;
          r = 2;
        }
        if (e.emailCA) {
          o |= 2;
          r = 1;
        }
        if (e.objCA) {
          o |= 1;
          r = 0;
        }
        var i = String.fromCharCode(r);
        if (o !== 0) {
          i += String.fromCharCode(o);
        }
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BITSTRING, false, i);
      } else if (e.name === "subjectAltName" || e.name === "issuerAltName") {
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
        var c;
        for (var u = 0; u < e.altNames.length; ++u) {
          c = e.altNames[u];
          var i = c.value;
          if (c.type === 7 && c.ip) {
            if (i = td.util.bytesFromIP(c.ip), i === null) {
              var n = Error('Extension "ip" value is not a valid IPv4 or IPv6 address.');
              throw n.extension = e, n;
            }
          } else if (c.type === 8) {
            if (c.oid) {
              i = Vt.oidToDer(Vt.oidToDer(c.oid));
            } else {
              i = Vt.oidToDer(i);
            }
          }
          e.value.value.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, c.type, false, i));
        }
      } else if (e.name === "nsComment" && t.cert) {
        if (!/^[\x00-\x7F]*$/.test(e.comment) || e.comment.length < 1 || e.comment.length > 128) {
          throw Error('Invalid "nsComment" content.');
        }
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.IA5STRING, false, e.comment);
      } else if (e.name === "subjectKeyIdentifier" && t.cert) {
        var d = t.cert.generateSubjectKeyIdentifier();
        e.subjectKeyIdentifier = d.toHex();
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OCTETSTRING, false, d.getBytes());
      } else if (e.name === "authorityKeyIdentifier" && t.cert) {
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
        var a = e.value.value;
        if (e.keyIdentifier) {
          var p = e.keyIdentifier === true ? t.cert.generateSubjectKeyIdentifier().getBytes() : e.keyIdentifier;
          a.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 0, false, p));
        }
        if (e.authorityCertIssuer) {
          var m = [Vt.create(Vt.Class.CONTEXT_SPECIFIC, 4, true, [Hut(e.authorityCertIssuer === true ? t.cert.issuer : e.authorityCertIssuer)])];
          a.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 1, true, m));
        }
        if (e.serialNumber) {
          var f = td.util.hexToBytes(e.serialNumber === true ? t.cert.serialNumber : e.serialNumber);
          a.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 2, false, f));
        }
      } else if (e.name === "cRLDistributionPoints") {
        e.value = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
        var a = e.value.value;
        var h = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
        var g = Vt.create(Vt.Class.CONTEXT_SPECIFIC, 0, true, []);
        var c;
        for (var u = 0; u < e.altNames.length; ++u) {
          c = e.altNames[u];
          var i = c.value;
          if (c.type === 7 && c.ip) {
            if (i = td.util.bytesFromIP(c.ip), i === null) {
              var n = Error('Extension "ip" value is not a valid IPv4 or IPv6 address.');
              throw n.extension = e, n;
            }
          } else if (c.type === 8) {
            if (c.oid) {
              i = Vt.oidToDer(Vt.oidToDer(c.oid));
            } else {
              i = Vt.oidToDer(i);
            }
          }
          g.value.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, c.type, false, i));
        }
        h.value.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 0, true, [g]));
        a.push(h);
      }
      if (typeof e.value > "u") {
        var n = Error("Extension value not specified.");
        throw n.extension = e, n;
      }
      return e;
    }
    function rio(e, t) {
      switch (e) {
        case Dy["RSASSA-PSS"]:
          var n = [];
          if (t.hash.algorithmOid !== undefined) {
            n.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 0, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(t.hash.algorithmOid).getBytes()), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.NULL, false, "")])]));
          }
          if (t.mgf.algorithmOid !== undefined) {
            n.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 1, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(t.mgf.algorithmOid).getBytes()), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(t.mgf.hash.algorithmOid).getBytes()), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.NULL, false, "")])])]));
          }
          if (t.saltLength !== undefined) {
            n.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 2, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.INTEGER, false, Vt.integerToDer(t.saltLength).getBytes())]));
          }
          return Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, n);
        default:
          return Vt.create(Vt.Class.UNIVERSAL, Vt.Type.NULL, false, "");
      }
    }
    function Clp(e) {
      var t = Vt.create(Vt.Class.CONTEXT_SPECIFIC, 0, true, []);
      if (e.attributes.length === 0) {
        return t;
      }
      var n = e.attributes;
      for (var r = 0; r < n.length; ++r) {
        var o = n[r];
        var s = o.value;
        var i = Vt.Type.UTF8;
        if ("valueTagClass" in o) {
          i = o.valueTagClass;
        }
        if (i === Vt.Type.UTF8) {
          s = td.util.encodeUtf8(s);
        }
        var a = false;
        if ("valueConstructed" in o) {
          a = o.valueConstructed;
        }
        var l = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(o.type).getBytes()), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SET, true, [Vt.create(Vt.Class.UNIVERSAL, i, a, s)])]);
        t.value.push(l);
      }
      return t;
    }
    var Rlp = new Date("1950-01-01T00:00:00Z");
    var xlp = new Date("2050-01-01T00:00:00Z");
    function Gna(e) {
      if (e >= Rlp && e < xlp) {
        return Vt.create(Vt.Class.UNIVERSAL, Vt.Type.UTCTIME, false, Vt.dateToUtcTime(e));
      } else {
        return Vt.create(Vt.Class.UNIVERSAL, Vt.Type.GENERALIZEDTIME, false, Vt.dateToGeneralizedTime(e));
      }
    }
    ia.getTBSCertificate = function (e) {
      var t = Gna(e.validity.notBefore);
      var n = Gna(e.validity.notAfter);
      var r = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.CONTEXT_SPECIFIC, 0, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.INTEGER, false, Vt.integerToDer(e.version).getBytes())]), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.INTEGER, false, td.util.hexToBytes(e.serialNumber)), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(e.siginfo.algorithmOid).getBytes()), rio(e.siginfo.algorithmOid, e.siginfo.parameters)]), Hut(e.issuer), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [t, n]), Hut(e.subject), ia.publicKeyToAsn1(e.publicKey)]);
      if (e.issuer.uniqueId) {
        r.value.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 1, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BITSTRING, false, String.fromCharCode(0) + e.issuer.uniqueId)]));
      }
      if (e.subject.uniqueId) {
        r.value.push(Vt.create(Vt.Class.CONTEXT_SPECIFIC, 2, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BITSTRING, false, String.fromCharCode(0) + e.subject.uniqueId)]));
      }
      if (e.extensions.length > 0) {
        r.value.push(ia.certificateExtensionsToAsn1(e.extensions));
      }
      return r;
    };
    ia.getCertificationRequestInfo = function (e) {
      var t = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.INTEGER, false, Vt.integerToDer(e.version).getBytes()), Hut(e.subject), ia.publicKeyToAsn1(e.publicKey), Clp(e)]);
      return t;
    };
    ia.distinguishedNameToAsn1 = function (e) {
      return Hut(e);
    };
    ia.certificateToAsn1 = function (e) {
      var t = e.tbsCertificate || ia.getTBSCertificate(e);
      return Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [t, Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(e.signatureOid).getBytes()), rio(e.signatureOid, e.signatureParameters)]), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BITSTRING, false, String.fromCharCode(0) + e.signature)]);
    };
    ia.certificateExtensionsToAsn1 = function (e) {
      var t = Vt.create(Vt.Class.CONTEXT_SPECIFIC, 3, true, []);
      var n = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
      t.value.push(n);
      for (var r = 0; r < e.length; ++r) {
        n.value.push(ia.certificateExtensionToAsn1(e[r]));
      }
      return t;
    };
    ia.certificateExtensionToAsn1 = function (e) {
      var t = Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, []);
      if (t.value.push(Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(e.id).getBytes())), e.critical) {
        t.value.push(Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BOOLEAN, false, String.fromCharCode(255)));
      }
      var n = e.value;
      if (typeof e.value !== "string") {
        n = Vt.toDer(n).getBytes();
      }
      t.value.push(Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OCTETSTRING, false, n));
      return t;
    };
    ia.certificationRequestToAsn1 = function (e) {
      var t = e.certificationRequestInfo || ia.getCertificationRequestInfo(e);
      return Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [t, Vt.create(Vt.Class.UNIVERSAL, Vt.Type.SEQUENCE, true, [Vt.create(Vt.Class.UNIVERSAL, Vt.Type.OID, false, Vt.oidToDer(e.signatureOid).getBytes()), rio(e.signatureOid, e.signatureParameters)]), Vt.create(Vt.Class.UNIVERSAL, Vt.Type.BITSTRING, false, String.fromCharCode(0) + e.signature)]);
    };
    ia.createCaStore = function (e) {
      var t = {
        certs: {}
      };
      t.getIssuer = function (i) {
        var a = n(i.issuer);
        return a;
      };
      t.addCertificate = function (i) {
        if (typeof i === "string") {
          i = td.pki.certificateFromPem(i);
        }
        if (r(i.subject), !t.hasCertificate(i)) {
          if (i.subject.hash in t.certs) {
            var a = t.certs[i.subject.hash];
            if (!td.util.isArray(a)) {
              a = [a];
            }
            a.push(i);
            t.certs[i.subject.hash] = a;
          } else {
            t.certs[i.subject.hash] = i;
          }
        }
      };
      t.hasCertificate = function (i) {
        if (typeof i === "string") {
          i = td.pki.certificateFromPem(i);
        }
        var a = n(i.subject);
        if (!a) {
          return false;
        }
        if (!td.util.isArray(a)) {
          a = [a];
        }
        var l = Vt.toDer(ia.certificateToAsn1(i)).getBytes();
        for (var c = 0; c < a.length; ++c) {
          var u = Vt.toDer(ia.certificateToAsn1(a[c])).getBytes();
          if (l === u) {
            return true;
          }
        }
        return false;
      };
      t.listAllCertificates = function () {
        var i = [];
        for (var a in t.certs) {
          if (t.certs.hasOwnProperty(a)) {
            var l = t.certs[a];
            if (!td.util.isArray(l)) {
              i.push(l);
            } else {
              for (var c = 0; c < l.length; ++c) {
                i.push(l[c]);
              }
            }
          }
        }
        return i;
      };
      t.removeCertificate = function (i) {
        var a;
        if (typeof i === "string") {
          i = td.pki.certificateFromPem(i);
        }
        if (r(i.subject), !t.hasCertificate(i)) {
          return null;
        }
        var l = n(i.subject);
        if (!td.util.isArray(l)) {
          a = t.certs[i.subject.hash];
          delete t.certs[i.subject.hash];
          return a;
        }
        var c = Vt.toDer(ia.certificateToAsn1(i)).getBytes();
        for (var u = 0; u < l.length; ++u) {
          var d = Vt.toDer(ia.certificateToAsn1(l[u])).getBytes();
          if (c === d) {
            a = l[u];
            l.splice(u, 1);
          }
        }
        if (l.length === 0) {
          delete t.certs[i.subject.hash];
        }
        return a;
      };
      function n(i) {
        r(i);
        return t.certs[i.hash] || null;
      }
      function r(i) {
        if (!i.hash) {
          var a = td.md.sha1.create();
          i.attributes = ia.RDNAttributesAsArray(Hut(i), a);
          i.hash = a.digest().toHex();
        }
      }
      if (e) {
        for (var o = 0; o < e.length; ++o) {
          var s = e[o];
          t.addCertificate(s);
        }
      }
      return t;
    };
    ia.certificateError = {
      bad_certificate: "forge.pki.BadCertificate",
      unsupported_certificate: "forge.pki.UnsupportedCertificate",
      certificate_revoked: "forge.pki.CertificateRevoked",
      certificate_expired: "forge.pki.CertificateExpired",
      certificate_unknown: "forge.pki.CertificateUnknown",
      unknown_ca: "forge.pki.UnknownCertificateAuthority"
    };
    ia.verifyCertificateChain = function (e, t, n) {
      if (typeof n === "function") {
        n = {
          verify: n
        };
      }
      n = n || {};
      t = t.slice(0);
      var r = t.slice(0);
      var o = n.validityCheckDate;
      if (typeof o > "u") {
        o = new Date();
      }
      var s = true;
      var i = null;
      var a = 0;
      do {
        var l = t.shift();
        var c = null;
        var u = false;
        if (o) {
          if (o < l.validity.notBefore || o > l.validity.notAfter) {
            i = {
              message: "Certificate is not valid yet or has expired.",
              error: ia.certificateError.certificate_expired,
              notBefore: l.validity.notBefore,
              notAfter: l.validity.notAfter,
              now: o
            };
          }
        }
        if (i === null) {
          if (c = t[0] || e.getIssuer(l), c === null) {
            if (l.isIssuer(l)) {
              u = true;
              c = l;
            }
          }
          if (c) {
            var d = c;
            if (!td.util.isArray(d)) {
              d = [d];
            }
            var p = false;
            while (!p && d.length > 0) {
              c = d.shift();
              try {
                p = c.verify(l);
              } catch (E) {}
            }
            if (!p) {
              i = {
                message: "Certificate signature is invalid.",
                error: ia.certificateError.bad_certificate
              };
            }
          }
          if (i === null && (!c || u) && !e.hasCertificate(l)) {
            i = {
              message: "Certificate is not trusted.",
              error: ia.certificateError.unknown_ca
            };
          }
        }
        if (i === null && c && !l.isIssuer(c)) {
          i = {
            message: "Certificate issuer is invalid.",
            error: ia.certificateError.bad_certificate
          };
        }
        if (i === null) {
          var m = {
            keyUsage: true,
            basicConstraints: true
          };
          for (var f = 0; i === null && f < l.extensions.length; ++f) {
            var h = l.extensions[f];
            if (h.critical && !(h.name in m)) {
              i = {
                message: "Certificate has an unsupported critical extension.",
                error: ia.certificateError.unsupported_certificate
              };
            }
          }
        }
        if (i === null && (!s || t.length === 0 && (!c || u))) {
          var g = l.getExtension("basicConstraints");
          var y = l.getExtension("keyUsage");
          if (y !== null) {
            if (!y.keyCertSign || g === null) {
              i = {
                message: "Certificate keyUsage or basicConstraints conflict or indicate that the certificate is not a CA. If the certificate is the only one in the chain or isn't the first then the certificate must be a valid CA.",
                error: ia.certificateError.bad_certificate
              };
            }
          }
          if (i === null && g === null) {
            i = {
              message: "Certificate is missing basicConstraints extension and cannot be used as a CA.",
              error: ia.certificateError.bad_certificate
            };
          }
          if (i === null && g !== null && !g.cA) {
            i = {
              message: "Certificate basicConstraints indicates the certificate is not a CA.",
              error: ia.certificateError.bad_certificate
            };
          }
          if (i === null && y !== null && "pathLenConstraint" in g) {
            var _ = a - 1;
            if (_ > g.pathLenConstraint) {
              i = {
                message: "Certificate basicConstraints pathLenConstraint violated.",
                error: ia.certificateError.bad_certificate
              };
            }
          }
        }
        var b = i === null ? true : i.error;
        var S = n.verify ? n.verify(b, a, r) : b;
        if (S === true) {
          i = null;
        } else {
          if (b === true) {
            i = {
              message: "The application rejected the certificate.",
              error: ia.certificateError.bad_certificate
            };
          }
          if (S || S === 0) {
            if (typeof S === "object" && !td.util.isArray(S)) {
              if (S.message) {
                i.message = S.message;
              }
              if (S.error) {
                i.error = S.error;
              }
            } else if (typeof S === "string") {
              i.error = S;
            }
          }
          throw i;
        }
        s = false;
        ++a;
      } while (t.length > 0);
      return true;
    };
  });
  var sio = __commonJS((RIy, Xna) => {
    var _w = wf();
    jre();
    Mut();
    TOe();
    tio();
    eio();
    lX();
    hqt();
    Uut();
    g_();
    iUn();
    var {
      asn1: tr,
      pki: zh
    } = _w;
    var yqt = Xna.exports = _w.pkcs12 = _w.pkcs12 || {};
    var Jna = {
      name: "ContentInfo",
      tagClass: tr.Class.UNIVERSAL,
      type: tr.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "ContentInfo.contentType",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.OID,
        constructed: false,
        capture: "contentType"
      }, {
        name: "ContentInfo.content",
        tagClass: tr.Class.CONTEXT_SPECIFIC,
        constructed: true,
        captureAsn1: "content"
      }]
    };
    var klp = {
      name: "PFX",
      tagClass: tr.Class.UNIVERSAL,
      type: tr.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "PFX.version",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.INTEGER,
        constructed: false,
        capture: "version"
      }, Jna, {
        name: "PFX.macData",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.SEQUENCE,
        constructed: true,
        optional: true,
        captureAsn1: "mac",
        value: [{
          name: "PFX.macData.mac",
          tagClass: tr.Class.UNIVERSAL,
          type: tr.Type.SEQUENCE,
          constructed: true,
          value: [{
            name: "PFX.macData.mac.digestAlgorithm",
            tagClass: tr.Class.UNIVERSAL,
            type: tr.Type.SEQUENCE,
            constructed: true,
            value: [{
              name: "PFX.macData.mac.digestAlgorithm.algorithm",
              tagClass: tr.Class.UNIVERSAL,
              type: tr.Type.OID,
              constructed: false,
              capture: "macAlgorithm"
            }, {
              name: "PFX.macData.mac.digestAlgorithm.parameters",
              optional: true,
              tagClass: tr.Class.UNIVERSAL,
              captureAsn1: "macAlgorithmParameters"
            }]
          }, {
            name: "PFX.macData.mac.digest",
            tagClass: tr.Class.UNIVERSAL,
            type: tr.Type.OCTETSTRING,
            constructed: false,
            capture: "macDigest"
          }]
        }, {
          name: "PFX.macData.macSalt",
          tagClass: tr.Class.UNIVERSAL,
          type: tr.Type.OCTETSTRING,
          constructed: false,
          capture: "macSalt"
        }, {
          name: "PFX.macData.iterations",
          tagClass: tr.Class.UNIVERSAL,
          type: tr.Type.INTEGER,
          constructed: false,
          optional: true,
          capture: "macIterations"
        }]
      }]
    };
    var Alp = {
      name: "SafeBag",
      tagClass: tr.Class.UNIVERSAL,
      type: tr.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "SafeBag.bagId",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.OID,
        constructed: false,
        capture: "bagId"
      }, {
        name: "SafeBag.bagValue",
        tagClass: tr.Class.CONTEXT_SPECIFIC,
        constructed: true,
        captureAsn1: "bagValue"
      }, {
        name: "SafeBag.bagAttributes",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.SET,
        constructed: true,
        optional: true,
        capture: "bagAttributes"
      }]
    };
    var Ilp = {
      name: "Attribute",
      tagClass: tr.Class.UNIVERSAL,
      type: tr.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "Attribute.attrId",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.OID,
        constructed: false,
        capture: "oid"
      }, {
        name: "Attribute.attrValues",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.SET,
        constructed: true,
        capture: "values"
      }]
    };
    var Plp = {
      name: "CertBag",
      tagClass: tr.Class.UNIVERSAL,
      type: tr.Type.SEQUENCE,
      constructed: true,
      value: [{
        name: "CertBag.certId",
        tagClass: tr.Class.UNIVERSAL,
        type: tr.Type.OID,
        constructed: false,
        capture: "certId"
      }, {
        name: "CertBag.certValue",
        tagClass: tr.Class.CONTEXT_SPECIFIC,
        constructed: true,
        value: [{
          name: "CertBag.certValue[0]",
          tagClass: tr.Class.UNIVERSAL,
          type: tr.Class.OCTETSTRING,
          constructed: false,
          capture: "cert"
        }]
      }]
    };
    function gqt(e, t, n, r) {
      var o = [];
      for (var s = 0; s < e.length; s++) {
        for (var i = 0; i < e[s].safeBags.length; i++) {
          var a = e[s].safeBags[i];
          if (r !== undefined && a.type !== r) {
            continue;
          }
          if (t === null) {
            o.push(a);
            continue;
          }
          if (a.attributes[t] !== undefined && a.attributes[t].indexOf(n) >= 0) {
            o.push(a);
          }
        }
      }
      return o;
    }
    yqt.pkcs12FromAsn1 = function (e, t, n) {
      if (typeof t === "string") {
        n = t;
        t = true;
      } else if (t === undefined) {
        t = true;
      }
      var r = {};
      var o = [];
      if (!tr.validate(e, klp, r, o)) {
        var s = Error("Cannot read PKCS#12 PFX. ASN.1 object is not an PKCS#12 PFX.");
        throw s.errors = s, s;
      }
      var i = {
        version: r.version.charCodeAt(0),
        safeContents: [],
        getBags: function (g) {
          var y = {};
          var _;
          if ("localKeyId" in g) {
            _ = g.localKeyId;
          } else if ("localKeyIdHex" in g) {
            _ = _w.util.hexToBytes(g.localKeyIdHex);
          }
          if (_ === undefined && !("friendlyName" in g) && "bagType" in g) {
            y[g.bagType] = gqt(i.safeContents, null, null, g.bagType);
          }
          if (_ !== undefined) {
            y.localKeyId = gqt(i.safeContents, "localKeyId", _, g.bagType);
          }
          if ("friendlyName" in g) {
            y.friendlyName = gqt(i.safeContents, "friendlyName", g.friendlyName, g.bagType);
          }
          return y;
        },
        getBagsByFriendlyName: function (g, y) {
          return gqt(i.safeContents, "friendlyName", g, y);
        },
        getBagsByLocalKeyId: function (g, y) {
          return gqt(i.safeContents, "localKeyId", g, y);
        }
      };
      if (r.version.charCodeAt(0) !== 3) {
        var s = Error("PKCS#12 PFX of version other than 3 not supported.");
        throw s.version = r.version.charCodeAt(0), s;
      }
      if (tr.derToOid(r.contentType) !== zh.oids.data) {
        var s = Error("Only PKCS#12 PFX in password integrity mode supported.");
        throw s.oid = tr.derToOid(r.contentType), s;
      }
      var a = r.content.value[0];
      if (a.tagClass !== tr.Class.UNIVERSAL || a.type !== tr.Type.OCTETSTRING) {
        throw Error("PKCS#12 authSafe content data is not an OCTET STRING.");
      }
      if (a = oio(a), r.mac) {
        var l = null;
        var c = 0;
        var u = tr.derToOid(r.macAlgorithm);
        switch (u) {
          case zh.oids.sha1:
            l = _w.md.sha1.create();
            c = 20;
            break;
          case zh.oids.sha256:
            l = _w.md.sha256.create();
            c = 32;
            break;
          case zh.oids.sha384:
            l = _w.md.sha384.create();
            c = 48;
            break;
          case zh.oids.sha512:
            l = _w.md.sha512.create();
            c = 64;
            break;
          case zh.oids.md5:
            l = _w.md.md5.create();
            c = 16;
            break;
        }
        if (l === null) {
          throw Error("PKCS#12 uses unsupported MAC algorithm: " + u);
        }
        var d = new _w.util.ByteBuffer(r.macSalt);
        var p = "macIterations" in r ? parseInt(_w.util.bytesToHex(r.macIterations), 16) : 1;
        var m = yqt.generateKey(n, d, 3, p, c, l);
        var f = _w.hmac.create();
        f.start(l, m);
        f.update(a.value);
        var h = f.getMac();
        if (h.getBytes() !== r.macDigest) {
          throw Error("PKCS#12 MAC could not be verified. Invalid password?");
        }
      } else if (Array.isArray(e.value) && e.value.length > 2) {
        throw Error("Invalid PKCS#12. macData field present but MAC was not validated.");
      }
      Olp(i, a.value, t, n);
      return i;
    };
    function oio(e) {
      if (e.composed || e.constructed) {
        var t = _w.util.createBuffer();
        for (var n = 0; n < e.value.length; ++n) {
          t.putBytes(e.value[n].value);
        }
        e.composed = e.constructed = false;
        e.value = t.getBytes();
      }
      return e;
    }
    function Olp(e, t, n, r) {
      if (t = tr.fromDer(t, n), t.tagClass !== tr.Class.UNIVERSAL || t.type !== tr.Type.SEQUENCE || t.constructed !== true) {
        throw Error("PKCS#12 AuthenticatedSafe expected to be a SEQUENCE OF ContentInfo");
      }
      for (var o = 0; o < t.value.length; o++) {
        var s = t.value[o];
        var i = {};
        var a = [];
        if (!tr.validate(s, Jna, i, a)) {
          var l = Error("Cannot read ContentInfo.");
          throw l.errors = a, l;
        }
        var c = {
          encrypted: false
        };
        var u = null;
        var d = i.content.value[0];
        switch (tr.derToOid(i.contentType)) {
          case zh.oids.data:
            if (d.tagClass !== tr.Class.UNIVERSAL || d.type !== tr.Type.OCTETSTRING) {
              throw Error("PKCS#12 SafeContents Data is not an OCTET STRING.");
            }
            u = oio(d).value;
            break;
          case zh.oids.encryptedData:
            u = Dlp(d, r);
            c.encrypted = true;
            break;
          default:
            var l = Error("Unsupported PKCS#12 contentType.");
            throw l.contentType = tr.derToOid(i.contentType), l;
        }
        c.safeBags = Mlp(u, n, r);
        e.safeContents.push(c);
      }
    }
    function Dlp(e, t) {
      var n = {};
      var r = [];
      if (!tr.validate(e, _w.pkcs7.asn1.encryptedDataValidator, n, r)) {
        var o = Error("Cannot read EncryptedContentInfo.");
        throw o.errors = r, o;
      }
      var s = tr.derToOid(n.contentType);
      if (s !== zh.oids.data) {
        var o = Error("PKCS#12 EncryptedContentInfo ContentType is not Data.");
        throw o.oid = s, o;
      }
      s = tr.derToOid(n.encAlgorithm);
      var i = zh.pbe.getCipher(s, n.encParameter, t);
      var a = oio(n.encryptedContentAsn1);
      var l = _w.util.createBuffer(a.value);
      if (i.update(l), !i.finish()) {
        throw Error("Failed to decrypt PKCS#12 SafeContents.");
      }
      return i.output.getBytes();
    }
    function Mlp(e, t, n) {
      if (!t && e.length === 0) {
        return [];
      }
      if (e = tr.fromDer(e, t), e.tagClass !== tr.Class.UNIVERSAL || e.type !== tr.Type.SEQUENCE || e.constructed !== true) {
        throw Error("PKCS#12 SafeContents expected to be a SEQUENCE OF SafeBag.");
      }
      var r = [];
      for (var o = 0; o < e.value.length; o++) {
        var s = e.value[o];
        var i = {};
        var a = [];
        if (!tr.validate(s, Alp, i, a)) {
          var l = Error("Cannot read SafeBag.");
          throw l.errors = a, l;
        }
        var c = {
          type: tr.derToOid(i.bagId),
          attributes: Nlp(i.bagAttributes)
        };
        r.push(c);
        var u;
        var d;
        var p = i.bagValue.value[0];
        switch (c.type) {
          case zh.oids.pkcs8ShroudedKeyBag:
            if (p = zh.decryptPrivateKeyInfo(p, n), p === null) {
              throw Error("Unable to decrypt PKCS#8 ShroudedKeyBag, wrong password?");
            }
          case zh.oids.keyBag:
            try {
              c.key = zh.privateKeyFromAsn1(p);
            } catch (f) {
              c.key = null;
              c.asn1 = p;
            }
            continue;
          case zh.oids.certBag:
            u = Plp;
            d = function () {
              if (tr.derToOid(i.certId) !== zh.oids.x509Certificate) {
                var f = Error("Unsupported certificate type, only X.509 supported.");
                throw f.oid = tr.derToOid(i.certId), f;
              }
              var h = tr.fromDer(i.cert, t);
              try {
                c.cert = zh.certificateFromAsn1(h, true);
              } catch (g) {
                c.cert = null;
                c.asn1 = h;
              }
            };
            break;
          default:
            var l = Error("Unsupported PKCS#12 SafeBag type.");
            throw l.oid = c.type, l;
        }
        if (u !== undefined && !tr.validate(p, u, i, a)) {
          var l = Error("Cannot read PKCS#12 " + u.name);
          throw l.errors = a, l;
        }
        d();
      }
      return r;
    }
    function Nlp(e) {
      var t = {};
      if (e !== undefined) {
        for (var n = 0; n < e.length; ++n) {
          var r = {};
          var o = [];
          if (!tr.validate(e[n], Ilp, r, o)) {
            var s = Error("Cannot read PKCS#12 BagAttribute.");
            throw s.errors = o, s;
          }
          var i = tr.derToOid(r.oid);
          if (zh.oids[i] === undefined) {
            continue;
          }
          t[zh.oids[i]] = [];
          for (var a = 0; a < r.values.length; ++a) {
            t[zh.oids[i]].push(r.values[a].value);
          }
        }
      }
      return t;
    }
    yqt.toPkcs12Asn1 = function (e, t, n, r) {
      if (r = r || {}, r.saltSize = r.saltSize || 8, r.count = r.count || 2048, r.algorithm = r.algorithm || r.encAlgorithm || "aes128", !("useMac" in r)) {
        r.useMac = true;
      }
      if (!("localKeyId" in r)) {
        r.localKeyId = null;
      }
      if (!("generateLocalKeyId" in r)) {
        r.generateLocalKeyId = true;
      }
      var o = r.localKeyId;
      var s;
      if (o !== null) {
        o = _w.util.hexToBytes(o);
      } else if (r.generateLocalKeyId) {
        if (t) {
          var i = _w.util.isArray(t) ? t[0] : t;
          if (typeof i === "string") {
            i = zh.certificateFromPem(i);
          }
          var a = _w.md.sha1.create();
          a.update(tr.toDer(zh.certificateToAsn1(i)).getBytes());
          o = a.digest().getBytes();
        } else {
          o = _w.random.getBytes(20);
        }
      }
      var l = [];
      if (o !== null) {
        l.push(tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.localKeyId).getBytes()), tr.create(tr.Class.UNIVERSAL, tr.Type.SET, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OCTETSTRING, false, o)])]));
      }
      if ("friendlyName" in r) {
        l.push(tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.friendlyName).getBytes()), tr.create(tr.Class.UNIVERSAL, tr.Type.SET, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.BMPSTRING, false, r.friendlyName)])]));
      }
      if (l.length > 0) {
        s = tr.create(tr.Class.UNIVERSAL, tr.Type.SET, true, l);
      }
      var c = [];
      var u = [];
      if (t !== null) {
        if (_w.util.isArray(t)) {
          u = t;
        } else {
          u = [t];
        }
      }
      var d = [];
      for (var p = 0; p < u.length; ++p) {
        if (t = u[p], typeof t === "string") {
          t = zh.certificateFromPem(t);
        }
        var m = p === 0 ? s : undefined;
        var f = zh.certificateToAsn1(t);
        var h = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.certBag).getBytes()), tr.create(tr.Class.CONTEXT_SPECIFIC, 0, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.x509Certificate).getBytes()), tr.create(tr.Class.CONTEXT_SPECIFIC, 0, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OCTETSTRING, false, tr.toDer(f).getBytes())])])]), m]);
        d.push(h);
      }
      if (d.length > 0) {
        var g = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, d);
        var y = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.data).getBytes()), tr.create(tr.Class.CONTEXT_SPECIFIC, 0, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OCTETSTRING, false, tr.toDer(g).getBytes())])]);
        c.push(y);
      }
      var _ = null;
      if (e !== null) {
        var b = zh.wrapRsaPrivateKey(zh.privateKeyToAsn1(e));
        if (n === null) {
          _ = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.keyBag).getBytes()), tr.create(tr.Class.CONTEXT_SPECIFIC, 0, true, [b]), s]);
        } else {
          _ = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.pkcs8ShroudedKeyBag).getBytes()), tr.create(tr.Class.CONTEXT_SPECIFIC, 0, true, [zh.encryptPrivateKeyInfo(b, n, r)]), s]);
        }
        var S = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [_]);
        var E = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.data).getBytes()), tr.create(tr.Class.CONTEXT_SPECIFIC, 0, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OCTETSTRING, false, tr.toDer(S).getBytes())])]);
        c.push(E);
      }
      var C = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, c);
      var x;
      if (r.useMac) {
        var a = _w.md.sha1.create();
        var A = new _w.util.ByteBuffer(_w.random.getBytes(r.saltSize));
        var k = r.count;
        var e = yqt.generateKey(n, A, 3, k, 20);
        var I = _w.hmac.create();
        I.start(a, e);
        I.update(tr.toDer(C).getBytes());
        var O = I.getMac();
        x = tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.sha1).getBytes()), tr.create(tr.Class.UNIVERSAL, tr.Type.NULL, false, "")]), tr.create(tr.Class.UNIVERSAL, tr.Type.OCTETSTRING, false, O.getBytes())]), tr.create(tr.Class.UNIVERSAL, tr.Type.OCTETSTRING, false, A.getBytes()), tr.create(tr.Class.UNIVERSAL, tr.Type.INTEGER, false, tr.integerToDer(k).getBytes())]);
      }
      return tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.INTEGER, false, tr.integerToDer(3).getBytes()), tr.create(tr.Class.UNIVERSAL, tr.Type.SEQUENCE, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OID, false, tr.oidToDer(zh.oids.data).getBytes()), tr.create(tr.Class.CONTEXT_SPECIFIC, 0, true, [tr.create(tr.Class.UNIVERSAL, tr.Type.OCTETSTRING, false, tr.toDer(C).getBytes())])]), x]);
    };
    yqt.generateKey = _w.pbe.generatePkcs12Key;
  });
  var aio = __commonJS((xIy, Qna) => {
    var COe = wf();
    jre();
    TOe();
    eio();
    LGe();
    JFn();
    sio();
    rUn();
    hqt();
    g_();
    iUn();
    var iio = COe.asn1;
    var jut = Qna.exports = COe.pki = COe.pki || {};
    jut.pemToDer = function (e) {
      var t = COe.pem.oC(e)[0];
      if (t.procType && t.procType.type === "ENCRYPTED") {
        throw Error("Could not convert PEM to DER; PEM is encrypted.");
      }
      return COe.util.createBuffer(t.body);
    };
    jut.privateKeyFromPem = function (e) {
      var t = COe.pem.oC(e)[0];
      if (t.type !== "PRIVATE KEY" && t.type !== "RSA PRIVATE KEY") {
        var n = Error('Could not convert private key from PEM; PEM header type is not "PRIVATE KEY" or "RSA PRIVATE KEY".');
        throw n.headerType = t.type, n;
      }
      if (t.procType && t.procType.type === "ENCRYPTED") {
        throw Error("Could not convert private key from PEM; PEM is encrypted.");
      }
      var r = iio.fromDer(t.body);
      return jut.privateKeyFromAsn1(r);
    };
    jut.privateKeyToPem = function (e, t) {
      var n = {
        type: "RSA PRIVATE KEY",
        body: iio.toDer(jut.privateKeyToAsn1(e)).getBytes()
      };
      return COe.pem.HS(n, {
        maxline: t
      });
    };
    jut.privateKeyInfoToPem = function (e, t) {
      var n = {
        type: "PRIVATE KEY",
        body: iio.toDer(e).getBytes()
      };
      return COe.pem.HS(n, {
        maxline: t
      });
    };
  });
  var mio = __commonJS((kIy, ira) => {
    var Qs = wf();
    jre();
    Mut();
    VFn();
    LGe();
    aio();
    lX();
    Uut();
    g_();
    var cUn = function (e, t, n, r) {
      var o = Qs.util.createBuffer();
      var s = e.length >> 1;
      var i = s + (e.length & 1);
      var a = e.substr(0, i);
      var l = e.substr(s, i);
      var c = Qs.util.createBuffer();
      var u = Qs.hmac.create();
      n = t + n;
      var d = Math.ceil(r / 16);
      var p = Math.ceil(r / 20);
      u.start("MD5", a);
      var m = Qs.util.createBuffer();
      c.putBytes(n);
      for (var f = 0; f < d; ++f) {
        u.start(null, null);
        u.update(c.getBytes());
        c.putBuffer(u.digest());
        u.start(null, null);
        u.update(c.bytes() + n);
        m.putBuffer(u.digest());
      }
      u.start("SHA1", l);
      var h = Qs.util.createBuffer();
      c.clear();
      c.putBytes(n);
      for (var f = 0; f < p; ++f) {
        u.start(null, null);
        u.update(c.getBytes());
        c.putBuffer(u.digest());
        u.start(null, null);
        u.update(c.bytes() + n);
        h.putBuffer(u.digest());
      }
      o.putBytes(Qs.util.xorBytes(m.getBytes(), h.getBytes(), r));
      return o;
    };
    var Llp = function (e, t, n) {
      var r = Qs.hmac.create();
      r.start("SHA1", e);
      var o = Qs.util.createBuffer();
      o.putInt32(t[0]);
      o.putInt32(t[1]);
      o.putByte(n.type);
      o.putByte(n.version.major);
      o.putByte(n.version.minor);
      o.putInt16(n.length);
      o.putBytes(n.fragment.bytes());
      r.update(o.getBytes());
      return r.digest().getBytes();
    };
    var Flp = function (e, t, n) {
      var r = false;
      try {
        var o = e.deflate(t.fragment.getBytes());
        t.fragment = Qs.util.createBuffer(o);
        t.length = o.length;
        r = true;
      } catch (s) {}
      return r;
    };
    var Ulp = function (e, t, n) {
      var r = false;
      try {
        var o = e.inflate(t.fragment.getBytes());
        t.fragment = Qs.util.createBuffer(o);
        t.length = o.length;
        r = true;
      } catch (s) {}
      return r;
    };
    var hV = function (e, t) {
      var n = 0;
      switch (t) {
        case 1:
          n = e.getByte();
          break;
        case 2:
          n = e.getInt16();
          break;
        case 3:
          n = e.getInt24();
          break;
        case 4:
          n = e.getInt32();
          break;
      }
      return Qs.util.createBuffer(e.getBytes(n));
    };
    var pX = function (e, t, n) {
      e.putInt(n.length(), t << 3);
      e.putBuffer(n);
    };
    var Xt = {};
    Xt.Versions = {
      TLS_1_0: {
        major: 3,
        minor: 1
      },
      TLS_1_1: {
        major: 3,
        minor: 2
      },
      TLS_1_2: {
        major: 3,
        minor: 3
      }
    };
    Xt.SupportedVersions = [Xt.Versions.TLS_1_1, Xt.Versions.TLS_1_0];
    Xt.Version = Xt.SupportedVersions[0];
    Xt.MaxFragment = 15360;
    Xt.ConnectionEnd = {
      server: 0,
      client: 1
    };
    Xt.PRFAlgorithm = {
      tls_prf_sha256: 0
    };
    Xt.BulkCipherAlgorithm = {
      none: null,
      rc4: 0,
      des3: 1,
      aes: 2
    };
    Xt.CipherType = {
      stream: 0,
      block: 1,
      aead: 2
    };
    Xt.MACAlgorithm = {
      none: null,
      hmac_md5: 0,
      hmac_sha1: 1,
      hmac_sha256: 2,
      hmac_sha384: 3,
      hmac_sha512: 4
    };
    Xt.CompressionMethod = {
      none: 0,
      deflate: 1
    };
    Xt.ContentType = {
      change_cipher_spec: 20,
      alert: 21,
      handshake: 22,
      application_data: 23,
      heartbeat: 24
    };
    Xt.HandshakeType = {
      hello_request: 0,
      client_hello: 1,
      server_hello: 2,
      certificate: 11,
      server_key_exchange: 12,
      certificate_request: 13,
      server_hello_done: 14,
      certificate_verify: 15,
      client_key_exchange: 16,
      finished: 20
    };
    Xt.Alert = {};
    Xt.Alert.Level = {
      warning: 1,
      fatal: 2
    };
    Xt.Alert.Description = {
      close_notify: 0,
      unexpected_message: 10,
      bad_record_mac: 20,
      decryption_failed: 21,
      record_overflow: 22,
      decompression_failure: 30,
      handshake_failure: 40,
      bad_certificate: 42,
      unsupported_certificate: 43,
      certificate_revoked: 44,
      certificate_expired: 45,
      certificate_unknown: 46,
      illegal_parameter: 47,
      unknown_ca: 48,
      access_denied: 49,
      decode_error: 50,
      decrypt_error: 51,
      export_restriction: 60,
      protocol_version: 70,
      insufficient_security: 71,
      internal_error: 80,
      user_canceled: 90,
      no_renegotiation: 100
    };
    Xt.HeartbeatMessageType = {
      heartbeat_request: 1,
      heartbeat_response: 2
    };
    Xt.CipherSuites = {};
    Xt.getCipherSuite = function (e) {
      var t = null;
      for (var n in Xt.CipherSuites) {
        var r = Xt.CipherSuites[n];
        if (r.id[0] === e.charCodeAt(0) && r.id[1] === e.charCodeAt(1)) {
          t = r;
          break;
        }
      }
      return t;
    };
    Xt.handleUnexpected = function (e, t) {
      var n = !e.open && e.entity === Xt.ConnectionEnd.client;
      if (!n) {
        e.error(e, {
          message: "Unexpected message. Received TLS record out of order.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.unexpected_message
          }
        });
      }
    };
    Xt.handleHelloRequest = function (e, t, n) {
      if (!e.handshaking && e.handshakes > 0) {
        Xt.queue(e, Xt.createAlert(e, {
          level: Xt.Alert.Level.warning,
          description: Xt.Alert.Description.no_renegotiation
        }));
        Xt.flush(e);
      }
      e.process();
    };
    Xt.parseHelloMessage = function (e, t, n) {
      var r = null;
      var o = e.entity === Xt.ConnectionEnd.client;
      if (n < 38) {
        e.error(e, {
          message: o ? "Invalid ServerHello message. Message too short." : "Invalid ClientHello message. Message too short.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.illegal_parameter
          }
        });
      } else {
        var s = t.fragment;
        var i = s.length();
        if (r = {
          version: {
            major: s.getByte(),
            minor: s.getByte()
          },
          random: Qs.util.createBuffer(s.getBytes(32)),
          session_id: hV(s, 1),
          extensions: []
        }, o) {
          r.cipher_suite = s.getBytes(2);
          r.compression_method = s.getByte();
        } else {
          r.cipher_suites = hV(s, 2);
          r.compression_methods = hV(s, 1);
        }
        if (i = n - (i - s.length()), i > 0) {
          var a = hV(s, 2);
          while (a.length() > 0) {
            r.extensions.push({
              type: [a.getByte(), a.getByte()],
              data: hV(a, 2)
            });
          }
          if (!o) {
            for (var l = 0; l < r.extensions.length; ++l) {
              var c = r.extensions[l];
              if (c.type[0] === 0 && c.type[1] === 0) {
                var u = hV(c.data, 2);
                while (u.length() > 0) {
                  var d = u.getByte();
                  if (d !== 0) {
                    break;
                  }
                  e.session.extensions.server_name.serverNameList.push(hV(u, 2).getBytes());
                }
              }
            }
          }
        }
        if (e.session.version) {
          if (r.version.major !== e.session.version.major || r.version.minor !== e.session.version.minor) {
            return e.error(e, {
              message: "TLS version change is disallowed during renegotiation.",
              send: true,
              alert: {
                level: Xt.Alert.Level.fatal,
                description: Xt.Alert.Description.protocol_version
              }
            });
          }
        }
        if (o) {
          e.session.cipherSuite = Xt.getCipherSuite(r.cipher_suite);
        } else {
          var p = Qs.util.createBuffer(r.cipher_suites.bytes());
          while (p.length() > 0) {
            if (e.session.cipherSuite = Xt.getCipherSuite(p.getBytes(2)), e.session.cipherSuite !== null) {
              break;
            }
          }
        }
        if (e.session.cipherSuite === null) {
          return e.error(e, {
            message: "No cipher suites in common.",
            send: true,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.handshake_failure
            },
            cipherSuite: Qs.util.bytesToHex(r.cipher_suite)
          });
        }
        if (o) {
          e.session.compressionMethod = r.compression_method;
        } else {
          e.session.compressionMethod = Xt.CompressionMethod.none;
        }
      }
      return r;
    };
    Xt.createSecurityParameters = function (e, t) {
      var n = e.entity === Xt.ConnectionEnd.client;
      var r = t.random.bytes();
      var o = n ? e.session.sp.client_random : r;
      var s = n ? r : Xt.createRandom().getBytes();
      e.session.sp = {
        entity: e.entity,
        prf_algorithm: Xt.PRFAlgorithm.tls_prf_sha256,
        bulk_cipher_algorithm: null,
        cipher_type: null,
        enc_key_length: null,
        block_length: null,
        fixed_iv_length: null,
        record_iv_length: null,
        mac_algorithm: null,
        mac_length: null,
        mac_key_length: null,
        compression_algorithm: e.session.compressionMethod,
        pre_master_secret: null,
        master_secret: null,
        client_random: o,
        server_random: s
      };
    };
    Xt.handleServerHello = function (e, t, n) {
      var r = Xt.parseHelloMessage(e, t, n);
      if (e.fail) {
        return;
      }
      if (r.version.minor <= e.version.minor) {
        e.version.minor = r.version.minor;
      } else {
        return e.error(e, {
          message: "Incompatible TLS version.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.protocol_version
          }
        });
      }
      e.session.version = e.version;
      var o = r.session_id.bytes();
      if (o.length > 0 && o === e.session.id) {
        e.expect = 5;
        e.session.resuming = true;
        e.session.sp.server_random = r.random.bytes();
      } else {
        e.expect = 1;
        e.session.resuming = false;
        Xt.createSecurityParameters(e, r);
      }
      e.session.id = o;
      e.process();
    };
    Xt.handleClientHello = function (e, t, n) {
      var r = Xt.parseHelloMessage(e, t, n);
      if (e.fail) {
        return;
      }
      var o = r.session_id.bytes();
      var s = null;
      if (e.sessionCache) {
        if (s = e.sessionCache.getSession(o), s === null) {
          o = "";
        } else if (s.version.major !== r.version.major || s.version.minor > r.version.minor) {
          s = null;
          o = "";
        }
      }
      if (o.length === 0) {
        o = Qs.random.getBytes(32);
      }
      if (e.session.id = o, e.session.clientHelloVersion = r.version, e.session.sp = {}, s) {
        e.version = e.session.version = s.version;
        e.session.sp = s.sp;
      } else {
        var i;
        for (var a = 1; a < Xt.SupportedVersions.length; ++a) {
          if (i = Xt.SupportedVersions[a], i.minor <= r.version.minor) {
            break;
          }
        }
        e.version = {
          major: i.major,
          minor: i.minor
        };
        e.session.version = e.version;
      }
      if (s !== null) {
        e.expect = 4;
        e.session.resuming = true;
        e.session.sp.client_random = r.random.bytes();
      } else {
        e.expect = e.verifyClient !== false ? 1 : 2;
        e.session.resuming = false;
        Xt.createSecurityParameters(e, r);
      }
      if (e.open = true, Xt.queue(e, Xt.createRecord(e, {
        type: Xt.ContentType.handshake,
        data: Xt.createServerHello(e)
      })), e.session.resuming) {
        Xt.queue(e, Xt.createRecord(e, {
          type: Xt.ContentType.change_cipher_spec,
          data: Xt.createChangeCipherSpec()
        }));
        e.state.pending = Xt.createConnectionState(e);
        e.state.current.write = e.state.pending.write;
        Xt.queue(e, Xt.createRecord(e, {
          type: Xt.ContentType.handshake,
          data: Xt.createFinished(e)
        }));
      } else if (Xt.queue(e, Xt.createRecord(e, {
        type: Xt.ContentType.handshake,
        data: Xt.createCertificate(e)
      })), !e.fail) {
        if (Xt.queue(e, Xt.createRecord(e, {
          type: Xt.ContentType.handshake,
          data: Xt.createServerKeyExchange(e)
        })), e.verifyClient !== false) {
          Xt.queue(e, Xt.createRecord(e, {
            type: Xt.ContentType.handshake,
            data: Xt.createCertificateRequest(e)
          }));
        }
        Xt.queue(e, Xt.createRecord(e, {
          type: Xt.ContentType.handshake,
          data: Xt.createServerHelloDone(e)
        }));
      }
      Xt.flush(e);
      e.process();
    };
    Xt.handleCertificate = function (e, t, n) {
      if (n < 3) {
        return e.error(e, {
          message: "Invalid Certificate message. Message too short.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.illegal_parameter
          }
        });
      }
      var r = t.fragment;
      var o = {
        certificate_list: hV(r, 3)
      };
      var s;
      var i;
      var a = [];
      try {
        while (o.certificate_list.length() > 0) {
          s = hV(o.certificate_list, 3);
          i = Qs.asn1.fromDer(s);
          s = Qs.pki.certificateFromAsn1(i, true);
          a.push(s);
        }
      } catch (c) {
        return e.error(e, {
          message: "Could not parse certificate list.",
          cause: c,
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.bad_certificate
          }
        });
      }
      var l = e.entity === Xt.ConnectionEnd.client;
      if ((l || e.verifyClient === true) && a.length === 0) {
        e.error(e, {
          message: l ? "No server certificate provided." : "No client certificate provided.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.illegal_parameter
          }
        });
      } else if (a.length === 0) {
        e.expect = l ? 2 : 2;
      } else {
        if (l) {
          e.session.serverCertificate = a[0];
        } else {
          e.session.clientCertificate = a[0];
        }
        if (Xt.verifyCertificateChain(e, a)) {
          e.expect = l ? 2 : 2;
        }
      }
      e.process();
    };
    Xt.handleServerKeyExchange = function (e, t, n) {
      if (n > 0) {
        return e.error(e, {
          message: "Invalid key parameters. Only RSA is supported.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.unsupported_certificate
          }
        });
      }
      e.expect = 3;
      e.process();
    };
    Xt.handleClientKeyExchange = function (e, t, n) {
      if (n < 48) {
        return e.error(e, {
          message: "Invalid key parameters. Only RSA is supported.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.unsupported_certificate
          }
        });
      }
      var r = t.fragment;
      var o = {
        enc_pre_master_secret: hV(r, 2).getBytes()
      };
      var s = null;
      if (e.getPrivateKey) {
        try {
          s = e.getPrivateKey(e, e.session.serverCertificate);
          s = Qs.pki.privateKeyFromPem(s);
        } catch (l) {
          e.error(e, {
            message: "Could not get private key.",
            cause: l,
            send: true,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.internal_error
            }
          });
        }
      }
      if (s === null) {
        return e.error(e, {
          message: "No private key set.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.internal_error
          }
        });
      }
      try {
        var i = e.session.sp;
        i.pre_master_secret = s.decrypt(o.enc_pre_master_secret);
        var a = e.session.clientHelloVersion;
        if (a.major !== i.pre_master_secret.charCodeAt(0) || a.minor !== i.pre_master_secret.charCodeAt(1)) {
          throw Error("TLS version rollback attack detected.");
        }
      } catch (l) {
        i.pre_master_secret = Qs.random.getBytes(48);
      }
      if (e.expect = 4, e.session.clientCertificate !== null) {
        e.expect = 3;
      }
      e.process();
    };
    Xt.handleCertificateRequest = function (e, t, n) {
      if (n < 3) {
        return e.error(e, {
          message: "Invalid CertificateRequest. Message too short.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.illegal_parameter
          }
        });
      }
      var r = t.fragment;
      var o = {
        certificate_types: hV(r, 1),
        certificate_authorities: hV(r, 2)
      };
      e.session.certificateRequest = o;
      e.expect = 4;
      e.process();
    };
    Xt.handleCertificateVerify = function (e, t, n) {
      if (n < 2) {
        return e.error(e, {
          message: "Invalid CertificateVerify. Message too short.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.illegal_parameter
          }
        });
      }
      var r = t.fragment;
      r.read -= 4;
      var o = r.bytes();
      r.read += 4;
      var s = {
        signature: hV(r, 2).getBytes()
      };
      var i = Qs.util.createBuffer();
      i.putBuffer(e.session.md5.digest());
      i.putBuffer(e.session.sha1.digest());
      i = i.getBytes();
      try {
        var a = e.session.clientCertificate;
        if (!a.publicKey.verify(i, s.signature, "NONE")) {
          throw Error("CertificateVerify signature does not match.");
        }
        e.session.md5.update(o);
        e.session.sha1.update(o);
      } catch (l) {
        return e.error(e, {
          message: "Bad signature in CertificateVerify.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.handshake_failure
          }
        });
      }
      e.expect = 4;
      e.process();
    };
    Xt.handleServerHelloDone = function (e, t, n) {
      if (n > 0) {
        return e.error(e, {
          message: "Invalid ServerHelloDone message. Invalid length.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.record_overflow
          }
        });
      }
      if (e.serverCertificate === null) {
        var r = {
          message: "No server certificate provided. Not enough security.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.insufficient_security
          }
        };
        var o = 0;
        var s = e.verify(e, r.alert.description, o, []);
        if (s !== true) {
          if (s || s === 0) {
            if (typeof s === "object" && !Qs.util.isArray(s)) {
              if (s.message) {
                r.message = s.message;
              }
              if (s.alert) {
                r.alert.description = s.alert;
              }
            } else if (typeof s === "number") {
              r.alert.description = s;
            }
          }
          return e.error(e, r);
        }
      }
      if (e.session.certificateRequest !== null) {
        t = Xt.createRecord(e, {
          type: Xt.ContentType.handshake,
          data: Xt.createCertificate(e)
        });
        Xt.queue(e, t);
      }
      t = Xt.createRecord(e, {
        type: Xt.ContentType.handshake,
        data: Xt.createClientKeyExchange(e)
      });
      Xt.queue(e, t);
      e.expect = 8;
      var i = function (a, l) {
        if (a.session.certificateRequest !== null && a.session.clientCertificate !== null) {
          Xt.queue(a, Xt.createRecord(a, {
            type: Xt.ContentType.handshake,
            data: Xt.createCertificateVerify(a, l)
          }));
        }
        Xt.queue(a, Xt.createRecord(a, {
          type: Xt.ContentType.change_cipher_spec,
          data: Xt.createChangeCipherSpec()
        }));
        a.state.pending = Xt.createConnectionState(a);
        a.state.current.write = a.state.pending.write;
        Xt.queue(a, Xt.createRecord(a, {
          type: Xt.ContentType.handshake,
          data: Xt.createFinished(a)
        }));
        a.expect = 5;
        Xt.flush(a);
        a.process();
      };
      if (e.session.certificateRequest === null || e.session.clientCertificate === null) {
        return i(e, null);
      }
      Xt.getClientSignature(e, i);
    };
    Xt.handleChangeCipherSpec = function (e, t) {
      if (t.fragment.getByte() !== 1) {
        return e.error(e, {
          message: "Invalid ChangeCipherSpec message received.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.illegal_parameter
          }
        });
      }
      var n = e.entity === Xt.ConnectionEnd.client;
      if (e.session.resuming && n || !e.session.resuming && !n) {
        e.state.pending = Xt.createConnectionState(e);
      }
      if (e.state.current.read = e.state.pending.read, !e.session.resuming && n || e.session.resuming && !n) {
        e.state.pending = null;
      }
      e.expect = n ? 6 : 5;
      e.process();
    };
    Xt.handleFinished = function (e, t, n) {
      var r = t.fragment;
      r.read -= 4;
      var o = r.bytes();
      r.read += 4;
      var s = t.fragment.getBytes();
      r = Qs.util.createBuffer();
      r.putBuffer(e.session.md5.digest());
      r.putBuffer(e.session.sha1.digest());
      var i = e.entity === Xt.ConnectionEnd.client;
      var a = i ? "server finished" : "client finished";
      var l = e.session.sp;
      var c = 12;
      var u = cUn;
      if (r = u(l.master_secret, a, r.getBytes(), c), r.getBytes() !== s) {
        return e.error(e, {
          message: "Invalid verify_data in Finished message.",
          send: true,
          alert: {
            level: Xt.Alert.Level.fatal,
            description: Xt.Alert.Description.decrypt_error
          }
        });
      }
      if (e.session.md5.update(o), e.session.sha1.update(o), e.session.resuming && i || !e.session.resuming && !i) {
        Xt.queue(e, Xt.createRecord(e, {
          type: Xt.ContentType.change_cipher_spec,
          data: Xt.createChangeCipherSpec()
        }));
        e.state.current.write = e.state.pending.write;
        e.state.pending = null;
        Xt.queue(e, Xt.createRecord(e, {
          type: Xt.ContentType.handshake,
          data: Xt.createFinished(e)
        }));
      }
      e.expect = i ? 7 : 6;
      e.handshaking = false;
      ++e.handshakes;
      e.peerCertificate = i ? e.session.serverCertificate : e.session.clientCertificate;
      Xt.flush(e);
      e.isConnected = true;
      e.connected(e);
      e.process();
    };
    Xt.handleAlert = function (e, t) {
      var n = t.fragment;
      var r = {
        level: n.getByte(),
        description: n.getByte()
      };
      var o;
      switch (r.description) {
        case Xt.Alert.Description.close_notify:
          o = "Connection closed.";
          break;
        case Xt.Alert.Description.unexpected_message:
          o = "Unexpected message.";
          break;
        case Xt.Alert.Description.bad_record_mac:
          o = "Bad record MAC.";
          break;
        case Xt.Alert.Description.decryption_failed:
          o = "Decryption failed.";
          break;
        case Xt.Alert.Description.record_overflow:
          o = "Record overflow.";
          break;
        case Xt.Alert.Description.decompression_failure:
          o = "Decompression failed.";
          break;
        case Xt.Alert.Description.handshake_failure:
          o = "Handshake failure.";
          break;
        case Xt.Alert.Description.bad_certificate:
          o = "Bad certificate.";
          break;
        case Xt.Alert.Description.unsupported_certificate:
          o = "Unsupported certificate.";
          break;
        case Xt.Alert.Description.certificate_revoked:
          o = "Certificate revoked.";
          break;
        case Xt.Alert.Description.certificate_expired:
          o = "Certificate expired.";
          break;
        case Xt.Alert.Description.certificate_unknown:
          o = "Certificate unknown.";
          break;
        case Xt.Alert.Description.illegal_parameter:
          o = "Illegal parameter.";
          break;
        case Xt.Alert.Description.unknown_ca:
          o = "Unknown certificate authority.";
          break;
        case Xt.Alert.Description.access_denied:
          o = "Access denied.";
          break;
        case Xt.Alert.Description.decode_error:
          o = "Decode error.";
          break;
        case Xt.Alert.Description.decrypt_error:
          o = "Decrypt error.";
          break;
        case Xt.Alert.Description.export_restriction:
          o = "Export restriction.";
          break;
        case Xt.Alert.Description.protocol_version:
          o = "Unsupported protocol version.";
          break;
        case Xt.Alert.Description.insufficient_security:
          o = "Insufficient security.";
          break;
        case Xt.Alert.Description.internal_error:
          o = "Internal error.";
          break;
        case Xt.Alert.Description.user_canceled:
          o = "User canceled.";
          break;
        case Xt.Alert.Description.no_renegotiation:
          o = "Renegotiation not supported.";
          break;
        default:
          o = "Unknown error.";
          break;
      }
      if (r.description === Xt.Alert.Description.close_notify) {
        return e.close();
      }
      e.error(e, {
        message: o,
        send: false,
        origin: e.entity === Xt.ConnectionEnd.client ? "server" : "client",
        alert: r
      });
      e.process();
    };
    Xt.handleHandshake = function (e, t) {
      var n = t.fragment;
      var r = n.getByte();
      var o = n.getInt24();
      if (o > n.length()) {
        e.fragmented = t;
        t.fragment = Qs.util.createBuffer();
        n.read -= 4;
        return e.process();
      }
      e.fragmented = null;
      n.read -= 4;
      var s = n.bytes(o + 4);
      if (n.read += 4, r in lUn[e.entity][e.expect]) {
        if (e.entity === Xt.ConnectionEnd.server && !e.open && !e.fail) {
          e.handshaking = true;
          e.session = {
            version: null,
            extensions: {
              server_name: {
                serverNameList: []
              }
            },
            cipherSuite: null,
            compressionMethod: null,
            serverCertificate: null,
            clientCertificate: null,
            md5: Qs.md.md5.create(),
            sha1: Qs.md.sha1.create()
          };
        }
        if (r !== Xt.HandshakeType.hello_request && r !== Xt.HandshakeType.certificate_verify && r !== Xt.HandshakeType.finished) {
          e.session.md5.update(s);
          e.session.sha1.update(s);
        }
        lUn[e.entity][e.expect][r](e, t, o);
      } else {
        Xt.handleUnexpected(e, t);
      }
    };
    Xt.handleApplicationData = function (e, t) {
      e.data.putBuffer(t.fragment);
      e.dataReady(e);
      e.process();
    };
    Xt.handleHeartbeat = function (e, t) {
      var n = t.fragment;
      var r = n.getByte();
      var o = n.getInt16();
      var s = n.getBytes(o);
      if (r === Xt.HeartbeatMessageType.heartbeat_request) {
        if (e.handshaking || o > s.length) {
          return e.process();
        }
        Xt.queue(e, Xt.createRecord(e, {
          type: Xt.ContentType.heartbeat,
          data: Xt.createHeartbeat(Xt.HeartbeatMessageType.heartbeat_response, s)
        }));
        Xt.flush(e);
      } else if (r === Xt.HeartbeatMessageType.heartbeat_response) {
        if (s !== e.expectedHeartbeatPayload) {
          return e.process();
        }
        if (e.heartbeatReceived) {
          e.heartbeatReceived(e, Qs.util.createBuffer(s));
        }
      }
      e.process();
    };
    var Kt = Xt.handleUnexpected;
    var nra = Xt.handleChangeCipherSpec;
    var QF = Xt.handleAlert;
    var Cq = Xt.handleHandshake;
    var rra = Xt.handleApplicationData;
    var ZF = Xt.handleHeartbeat;
    var pio = [];
    pio[Xt.ConnectionEnd.client] = [[Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [nra, QF, Kt, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, rra, ZF], [Kt, QF, Cq, Kt, ZF]];
    pio[Xt.ConnectionEnd.server] = [[Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [nra, QF, Kt, Kt, ZF], [Kt, QF, Cq, Kt, ZF], [Kt, QF, Cq, rra, ZF], [Kt, QF, Cq, Kt, ZF]];
    var {
      handleHelloRequest: ROe,
      handleServerHello: Xlp,
      handleCertificate: ora,
      handleServerKeyExchange: era,
      handleCertificateRequest: lio,
      handleServerHelloDone: aUn,
      handleFinished: sra
    } = Xt;
    var lUn = [];
    lUn[Xt.ConnectionEnd.client] = [[Kt, Kt, Xlp, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, ora, era, lio, aUn, Kt, Kt, Kt, Kt, Kt, Kt], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, era, lio, aUn, Kt, Kt, Kt, Kt, Kt, Kt], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, lio, aUn, Kt, Kt, Kt, Kt, Kt, Kt], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, aUn, Kt, Kt, Kt, Kt, Kt, Kt], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, sra], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt], [ROe, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt]];
    var {
      handleClientHello: Qlp,
      handleClientKeyExchange: Zlp,
      handleCertificateVerify: ecp
    } = Xt;
    lUn[Xt.ConnectionEnd.server] = [[Kt, Qlp, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt], [Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, ora, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt], [Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Zlp, Kt, Kt, Kt, Kt], [Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, ecp, Kt, Kt, Kt, Kt, Kt], [Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt], [Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, sra], [Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt], [Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt, Kt]];
    Xt.generateKeys = function (e, t) {
      var n = cUn;
      var r = t.client_random + t.server_random;
      if (!e.session.resuming) {
        t.master_secret = n(t.pre_master_secret, "master secret", r, 48).bytes();
        t.pre_master_secret = null;
      }
      r = t.server_random + t.client_random;
      var o = 2 * t.mac_key_length + 2 * t.enc_key_length;
      var s = e.version.major === Xt.Versions.TLS_1_0.major && e.version.minor === Xt.Versions.TLS_1_0.minor;
      if (s) {
        o += 2 * t.fixed_iv_length;
      }
      var i = n(t.master_secret, "key expansion", r, o);
      var a = {
        client_write_MAC_key: i.getBytes(t.mac_key_length),
        server_write_MAC_key: i.getBytes(t.mac_key_length),
        client_write_key: i.getBytes(t.enc_key_length),
        server_write_key: i.getBytes(t.enc_key_length)
      };
      if (s) {
        a.client_write_IV = i.getBytes(t.fixed_iv_length);
        a.server_write_IV = i.getBytes(t.fixed_iv_length);
      }
      return a;
    };
    Xt.createConnectionState = function (e) {
      var t = e.entity === Xt.ConnectionEnd.client;
      var n = function () {
        var s = {
          sequenceNumber: [0, 0],
          macKey: null,
          macLength: 0,
          macFunction: null,
          cipherState: null,
          cipherFunction: function (i) {
            return true;
          },
          compressionState: null,
          compressFunction: function (i) {
            return true;
          },
          updateSequenceNumber: function () {
            if (s.sequenceNumber[1] === 4294967295) {
              s.sequenceNumber[1] = 0;
              ++s.sequenceNumber[0];
            } else {
              ++s.sequenceNumber[1];
            }
          }
        };
        return s;
      };
      var r = {
        read: n(),
        write: n()
      };
      if (r.read.update = function (s, i) {
        if (!r.read.cipherFunction(i, r.read)) {
          s.error(s, {
            message: "Could not decrypt record or bad MAC.",
            send: true,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.bad_record_mac
            }
          });
        } else if (!r.read.compressFunction(s, i, r.read)) {
          s.error(s, {
            message: "Could not decompress record.",
            send: true,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.decompression_failure
            }
          });
        }
        return !s.fail;
      }, r.write.update = function (s, i) {
        if (!r.write.compressFunction(s, i, r.write)) {
          s.error(s, {
            message: "Could not compress record.",
            send: false,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.internal_error
            }
          });
        } else if (!r.write.cipherFunction(i, r.write)) {
          s.error(s, {
            message: "Could not encrypt record.",
            send: false,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.internal_error
            }
          });
        }
        return !s.fail;
      }, e.session) {
        var o = e.session.sp;
        switch (e.session.cipherSuite.initSecurityParameters(o), o.keys = Xt.generateKeys(e, o), r.read.macKey = t ? o.keys.server_write_MAC_key : o.keys.client_write_MAC_key, r.write.macKey = t ? o.keys.client_write_MAC_key : o.keys.server_write_MAC_key, e.session.cipherSuite.initConnectionState(r, e, o), o.compression_algorithm) {
          case Xt.CompressionMethod.none:
            break;
          case Xt.CompressionMethod.deflate:
            r.read.compressFunction = Ulp;
            r.write.compressFunction = Flp;
            break;
          default:
            throw Error("Unsupported compression algorithm.");
        }
      }
      return r;
    };
    Xt.createRandom = function () {
      var e = new Date();
      var t = +e + e.getTimezoneOffset() * 60000;
      var n = Qs.util.createBuffer();
      n.putInt32(t);
      n.putBytes(Qs.random.getBytes(28));
      return n;
    };
    Xt.createRecord = function (e, t) {
      if (!t.data) {
        return null;
      }
      var n = {
        type: t.type,
        version: {
          major: e.version.major,
          minor: e.version.minor
        },
        length: t.data.length(),
        fragment: t.data
      };
      return n;
    };
    Xt.createAlert = function (e, t) {
      var n = Qs.util.createBuffer();
      n.putByte(t.level);
      n.putByte(t.description);
      return Xt.createRecord(e, {
        type: Xt.ContentType.alert,
        data: n
      });
    };
    Xt.createClientHello = function (e) {
      e.session.clientHelloVersion = {
        major: e.version.major,
        minor: e.version.minor
      };
      var t = Qs.util.createBuffer();
      for (var n = 0; n < e.cipherSuites.length; ++n) {
        var r = e.cipherSuites[n];
        t.putByte(r.id[0]);
        t.putByte(r.id[1]);
      }
      var o = t.length();
      var s = Qs.util.createBuffer();
      s.putByte(Xt.CompressionMethod.none);
      var i = s.length();
      var a = Qs.util.createBuffer();
      if (e.virtualHost) {
        var l = Qs.util.createBuffer();
        l.putByte(0);
        l.putByte(0);
        var c = Qs.util.createBuffer();
        c.putByte(0);
        pX(c, 2, Qs.util.createBuffer(e.virtualHost));
        var u = Qs.util.createBuffer();
        pX(u, 2, c);
        pX(l, 2, u);
        a.putBuffer(l);
      }
      var d = a.length();
      if (d > 0) {
        d += 2;
      }
      var p = e.session.id;
      var m = p.length + 1 + 2 + 4 + 28 + 2 + o + 1 + i + d;
      var f = Qs.util.createBuffer();
      if (f.putByte(Xt.HandshakeType.client_hello), f.putInt24(m), f.putByte(e.version.major), f.putByte(e.version.minor), f.putBytes(e.session.sp.client_random), pX(f, 1, Qs.util.createBuffer(p)), pX(f, 2, t), pX(f, 1, s), d > 0) {
        pX(f, 2, a);
      }
      return f;
    };
    Xt.createServerHello = function (e) {
      var t = e.session.id;
      var n = t.length + 1 + 2 + 4 + 28 + 2 + 1;
      var r = Qs.util.createBuffer();
      r.putByte(Xt.HandshakeType.server_hello);
      r.putInt24(n);
      r.putByte(e.version.major);
      r.putByte(e.version.minor);
      r.putBytes(e.session.sp.server_random);
      pX(r, 1, Qs.util.createBuffer(t));
      r.putByte(e.session.cipherSuite.id[0]);
      r.putByte(e.session.cipherSuite.id[1]);
      r.putByte(e.session.compressionMethod);
      return r;
    };
    Xt.createCertificate = function (e) {
      var t = e.entity === Xt.ConnectionEnd.client;
      var n = null;
      if (e.getCertificate) {
        var r;
        if (t) {
          r = e.session.certificateRequest;
        } else {
          r = e.session.extensions.server_name.serverNameList;
        }
        n = e.getCertificate(e, r);
      }
      var o = Qs.util.createBuffer();
      if (n !== null) {
        try {
          if (!Qs.util.isArray(n)) {
            n = [n];
          }
          var s = null;
          for (var i = 0; i < n.length; ++i) {
            var a = Qs.pem.oC(n[i])[0];
            if (a.type !== "CERTIFICATE" && a.type !== "X509 CERTIFICATE" && a.type !== "TRUSTED CERTIFICATE") {
              var l = Error('Could not convert certificate from PEM; PEM header type is not "CERTIFICATE", "X509 CERTIFICATE", or "TRUSTED CERTIFICATE".');
              throw l.headerType = a.type, l;
            }
            if (a.procType && a.procType.type === "ENCRYPTED") {
              throw Error("Could not convert certificate from PEM; PEM is encrypted.");
            }
            var c = Qs.util.createBuffer(a.body);
            if (s === null) {
              s = Qs.asn1.fromDer(c.bytes(), false);
            }
            var u = Qs.util.createBuffer();
            pX(u, 3, c);
            o.putBuffer(u);
          }
          if (n = Qs.pki.certificateFromAsn1(s), t) {
            e.session.clientCertificate = n;
          } else {
            e.session.serverCertificate = n;
          }
        } catch (m) {
          return e.error(e, {
            message: "Could not send certificate list.",
            cause: m,
            send: true,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.bad_certificate
            }
          });
        }
      }
      var d = 3 + o.length();
      var p = Qs.util.createBuffer();
      p.putByte(Xt.HandshakeType.certificate);
      p.putInt24(d);
      pX(p, 3, o);
      return p;
    };
    Xt.createClientKeyExchange = function (e) {
      var t = Qs.util.createBuffer();
      t.putByte(e.session.clientHelloVersion.major);
      t.putByte(e.session.clientHelloVersion.minor);
      t.putBytes(Qs.random.getBytes(46));
      var n = e.session.sp;
      n.pre_master_secret = t.getBytes();
      var r = e.session.serverCertificate.publicKey;
      t = r.encrypt(n.pre_master_secret);
      var o = t.length + 2;
      var s = Qs.util.createBuffer();
      s.putByte(Xt.HandshakeType.client_key_exchange);
      s.putInt24(o);
      s.putInt16(t.length);
      s.putBytes(t);
      return s;
    };
    Xt.createServerKeyExchange = function (e) {
      var t = 0;
      var n = Qs.util.createBuffer();
      if (t > 0) {
        n.putByte(Xt.HandshakeType.server_key_exchange);
        n.putInt24(t);
      }
      return n;
    };
    Xt.getClientSignature = function (e, t) {
      var n = Qs.util.createBuffer();
      n.putBuffer(e.session.md5.digest());
      n.putBuffer(e.session.sha1.digest());
      n = n.getBytes();
      e.getSignature = e.getSignature || function (r, o, s) {
        var i = null;
        if (r.getPrivateKey) {
          try {
            i = r.getPrivateKey(r, r.session.clientCertificate);
            i = Qs.pki.privateKeyFromPem(i);
          } catch (a) {
            r.error(r, {
              message: "Could not get private key.",
              cause: a,
              send: true,
              alert: {
                level: Xt.Alert.Level.fatal,
                description: Xt.Alert.Description.internal_error
              }
            });
          }
        }
        if (i === null) {
          r.error(r, {
            message: "No private key set.",
            send: true,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: Xt.Alert.Description.internal_error
            }
          });
        } else {
          o = i.sign(o, null);
        }
        s(r, o);
      };
      e.getSignature(e, n, t);
    };
    Xt.createCertificateVerify = function (e, t) {
      var n = t.length + 2;
      var r = Qs.util.createBuffer();
      r.putByte(Xt.HandshakeType.certificate_verify);
      r.putInt24(n);
      r.putInt16(t.length);
      r.putBytes(t);
      return r;
    };
    Xt.createCertificateRequest = function (e) {
      var t = Qs.util.createBuffer();
      t.putByte(1);
      var n = Qs.util.createBuffer();
      for (var r in e.caStore.certs) {
        var o = e.caStore.certs[r];
        var s = Qs.pki.distinguishedNameToAsn1(o.subject);
        var i = Qs.asn1.toDer(s);
        n.putInt16(i.length());
        n.putBuffer(i);
      }
      var a = 1 + t.length() + 2 + n.length();
      var l = Qs.util.createBuffer();
      l.putByte(Xt.HandshakeType.certificate_request);
      l.putInt24(a);
      pX(l, 1, t);
      pX(l, 2, n);
      return l;
    };
    Xt.createServerHelloDone = function (e) {
      var t = Qs.util.createBuffer();
      t.putByte(Xt.HandshakeType.server_hello_done);
      t.putInt24(0);
      return t;
    };
    Xt.createChangeCipherSpec = function () {
      var e = Qs.util.createBuffer();
      e.putByte(1);
      return e;
    };
    Xt.createFinished = function (e) {
      var t = Qs.util.createBuffer();
      t.putBuffer(e.session.md5.digest());
      t.putBuffer(e.session.sha1.digest());
      var n = e.entity === Xt.ConnectionEnd.client;
      var r = e.session.sp;
      var o = 12;
      var s = cUn;
      var i = n ? "client finished" : "server finished";
      t = s(r.master_secret, i, t.getBytes(), o);
      var a = Qs.util.createBuffer();
      a.putByte(Xt.HandshakeType.finished);
      a.putInt24(t.length());
      a.putBuffer(t);
      return a;
    };
    Xt.createHeartbeat = function (e, t, n) {
      if (typeof n > "u") {
        n = t.length;
      }
      var r = Qs.util.createBuffer();
      r.putByte(e);
      r.putInt16(n);
      r.putBytes(t);
      var o = r.length();
      var s = Math.max(16, o - n - 3);
      r.putBytes(Qs.random.getBytes(s));
      return r;
    };
    Xt.queue = function (e, t) {
      if (!t) {
        return;
      }
      if (t.fragment.length() === 0) {
        if (t.type === Xt.ContentType.handshake || t.type === Xt.ContentType.alert || t.type === Xt.ContentType.change_cipher_spec) {
          return;
        }
      }
      if (t.type === Xt.ContentType.handshake) {
        var n = t.fragment.bytes();
        e.session.md5.update(n);
        e.session.sha1.update(n);
        n = null;
      }
      var r;
      if (t.fragment.length() <= Xt.MaxFragment) {
        r = [t];
      } else {
        r = [];
        var o = t.fragment.bytes();
        while (o.length > Xt.MaxFragment) {
          r.push(Xt.createRecord(e, {
            type: t.type,
            data: Qs.util.createBuffer(o.slice(0, Xt.MaxFragment))
          }));
          o = o.slice(Xt.MaxFragment);
        }
        if (o.length > 0) {
          r.push(Xt.createRecord(e, {
            type: t.type,
            data: Qs.util.createBuffer(o)
          }));
        }
      }
      for (var s = 0; s < r.length && !e.fail; ++s) {
        var i = r[s];
        var a = e.state.current.write;
        if (a.update(e, i)) {
          e.records.push(i);
        }
      }
    };
    Xt.flush = function (e) {
      for (var t = 0; t < e.records.length; ++t) {
        var n = e.records[t];
        e.tlsData.putByte(n.type);
        e.tlsData.putByte(n.version.major);
        e.tlsData.putByte(n.version.minor);
        e.tlsData.putInt16(n.fragment.length());
        e.tlsData.putBuffer(e.records[t].fragment);
      }
      e.records = [];
      return e.tlsDataReady(e);
    };
    var cio = function (e) {
      switch (e) {
        case true:
          return true;
        case Qs.pki.certificateError.bad_certificate:
          return Xt.Alert.Description.bad_certificate;
        case Qs.pki.certificateError.unsupported_certificate:
          return Xt.Alert.Description.unsupported_certificate;
        case Qs.pki.certificateError.certificate_revoked:
          return Xt.Alert.Description.certificate_revoked;
        case Qs.pki.certificateError.certificate_expired:
          return Xt.Alert.Description.certificate_expired;
        case Qs.pki.certificateError.certificate_unknown:
          return Xt.Alert.Description.certificate_unknown;
        case Qs.pki.certificateError.unknown_ca:
          return Xt.Alert.Description.unknown_ca;
        default:
          return Xt.Alert.Description.bad_certificate;
      }
    };
    var tcp = function (e) {
      switch (e) {
        case true:
          return true;
        case Xt.Alert.Description.bad_certificate:
          return Qs.pki.certificateError.bad_certificate;
        case Xt.Alert.Description.unsupported_certificate:
          return Qs.pki.certificateError.unsupported_certificate;
        case Xt.Alert.Description.certificate_revoked:
          return Qs.pki.certificateError.certificate_revoked;
        case Xt.Alert.Description.certificate_expired:
          return Qs.pki.certificateError.certificate_expired;
        case Xt.Alert.Description.certificate_unknown:
          return Qs.pki.certificateError.certificate_unknown;
        case Xt.Alert.Description.unknown_ca:
          return Qs.pki.certificateError.unknown_ca;
        default:
          return Qs.pki.certificateError.bad_certificate;
      }
    };
    Xt.verifyCertificateChain = function (e, t) {
      try {
        var n = {};
        for (var r in e.verifyOptions) {
          n[r] = e.verifyOptions[r];
        }
        n.verify = function (s, i, a) {
          var l = cio(s);
          var c = e.verify(e, s, i, a);
          if (c !== true) {
            if (typeof c === "object" && !Qs.util.isArray(c)) {
              var u = Error("The application rejected the certificate.");
              if (u.send = true, u.alert = {
                level: Xt.Alert.Level.fatal,
                description: Xt.Alert.Description.bad_certificate
              }, c.message) {
                u.message = c.message;
              }
              if (c.alert) {
                u.alert.description = c.alert;
              }
              throw u;
            }
            if (c !== s) {
              c = tcp(c);
            }
          }
          return c;
        };
        Qs.pki.verifyCertificateChain(e.caStore, t, n);
      } catch (s) {
        var o = s;
        if (typeof o !== "object" || Qs.util.isArray(o)) {
          o = {
            send: true,
            alert: {
              level: Xt.Alert.Level.fatal,
              description: cio(s)
            }
          };
        }
        if (!("send" in o)) {
          o.send = true;
        }
        if (!("alert" in o)) {
          o.alert = {
            level: Xt.Alert.Level.fatal,
            description: cio(o.error)
          };
        }
        e.error(e, o);
      }
      return !e.fail;
    };
    Xt.createSessionCache = function (e, t) {
      var n = null;
      if (e && e.getSession && e.setSession && e.order) {
        n = e;
      } else {
        n = {};
        n.cache = e || {};
        n.capacity = Math.max(t || 100, 1);
        n.order = [];
        for (var r in e) {
          if (n.order.length <= t) {
            n.order.push(r);
          } else {
            delete e[r];
          }
        }
        n.getSession = function (o) {
          var s = null;
          var i = null;
          if (o) {
            i = Qs.util.bytesToHex(o);
          } else if (n.order.length > 0) {
            i = n.order[0];
          }
          if (i !== null && i in n.cache) {
            s = n.cache[i];
            delete n.cache[i];
            for (var a in n.order) {
              if (n.order[a] === i) {
                n.order.splice(a, 1);
                break;
              }
            }
          }
          return s;
        };
        n.setSession = function (o, s) {
          if (n.order.length === n.capacity) {
            var i = n.order.shift();
            delete n.cache[i];
          }
          var i = Qs.util.bytesToHex(o);
          n.order.push(i);
          n.cache[i] = s;
        };
      }
      return n;
    };
    Xt.createConnection = function (e) {
      var t = null;
      if (e.caStore) {
        if (Qs.util.isArray(e.caStore)) {
          t = Qs.pki.createCaStore(e.caStore);
        } else {
          t = e.caStore;
        }
      } else {
        t = Qs.pki.createCaStore();
      }
      var n = e.cipherSuites || null;
      if (n === null) {
        n = [];
        for (var r in Xt.CipherSuites) {
          n.push(Xt.CipherSuites[r]);
        }
      }
      var o = e.server ? Xt.ConnectionEnd.server : Xt.ConnectionEnd.client;
      var s = e.sessionCache ? Xt.createSessionCache(e.sessionCache) : null;
      var i = {
        version: {
          major: Xt.Version.major,
          minor: Xt.Version.minor
        },
        entity: o,
        sessionId: e.sessionId,
        caStore: t,
        sessionCache: s,
        cipherSuites: n,
        connected: e.connected,
        virtualHost: e.virtualHost || null,
        verifyClient: e.verifyClient || false,
        verify: e.verify || function (u, d, p, m) {
          return d;
        },
        verifyOptions: e.verifyOptions || {},
        getCertificate: e.getCertificate || null,
        getPrivateKey: e.getPrivateKey || null,
        getSignature: e.getSignature || null,
        input: Qs.util.createBuffer(),
        tlsData: Qs.util.createBuffer(),
        data: Qs.util.createBuffer(),
        tlsDataReady: e.tlsDataReady,
        dataReady: e.dataReady,
        heartbeatReceived: e.heartbeatReceived,
        closed: e.closed,
        error: function (u, d) {
          if (d.origin = d.origin || (u.entity === Xt.ConnectionEnd.client ? "client" : "server"), d.send) {
            Xt.queue(u, Xt.createAlert(u, d.alert));
            Xt.flush(u);
          }
          var p = d.fatal !== false;
          if (p) {
            u.fail = true;
          }
          if (e.error(u, d), p) {
            u.close(false);
          }
        },
        deflate: e.deflate || null,
        inflate: e.inflate || null
      };
      i.reset = function (u) {
        i.version = {
          major: Xt.Version.major,
          minor: Xt.Version.minor
        };
        i.record = null;
        i.session = null;
        i.peerCertificate = null;
        i.state = {
          pending: null,
          current: null
        };
        i.expect = i.entity === Xt.ConnectionEnd.client ? 0 : 0;
        i.fragmented = null;
        i.records = [];
        i.open = false;
        i.handshakes = 0;
        i.handshaking = false;
        i.isConnected = false;
        i.fail = !(u || typeof u > "u");
        i.input.clear();
        i.tlsData.clear();
        i.data.clear();
        i.state.current = Xt.createConnectionState(i);
      };
      i.reset();
      var a = function (u, d) {
        var p = d.type - Xt.ContentType.change_cipher_spec;
        var m = pio[u.entity][u.expect];
        if (p in m) {
          m[p](u, d);
        } else {
          Xt.handleUnexpected(u, d);
        }
      };
      var l = function (u) {
        var d = 0;
        var p = u.input;
        var m = p.length();
        if (m < 5) {
          d = 5 - m;
        } else {
          u.record = {
            type: p.getByte(),
            version: {
              major: p.getByte(),
              minor: p.getByte()
            },
            length: p.getInt16(),
            fragment: Qs.util.createBuffer(),
            ready: false
          };
          var f = u.record.version.major === u.version.major;
          if (f && u.session && u.session.version) {
            f = u.record.version.minor === u.version.minor;
          }
          if (!f) {
            u.error(u, {
              message: "Incompatible TLS version.",
              send: true,
              alert: {
                level: Xt.Alert.Level.fatal,
                description: Xt.Alert.Description.protocol_version
              }
            });
          }
        }
        return d;
      };
      var c = function (u) {
        var d = 0;
        var p = u.input;
        var m = p.length();
        if (m < u.record.length) {
          d = u.record.length - m;
        } else {
          u.record.fragment.putBytes(p.getBytes(u.record.length));
          p.compact();
          var f = u.state.current.read;
          if (f.update(u, u.record)) {
            if (u.fragmented !== null) {
              if (u.fragmented.type === u.record.type) {
                u.fragmented.fragment.putBuffer(u.record.fragment);
                u.record = u.fragmented;
              } else {
                u.error(u, {
                  message: "Invalid fragmented record.",
                  send: true,
                  alert: {
                    level: Xt.Alert.Level.fatal,
                    description: Xt.Alert.Description.unexpected_message
                  }
                });
              }
            }
            u.record.ready = true;
          }
        }
        return d;
      };
      i.handshake = function (u) {
        if (i.entity !== Xt.ConnectionEnd.client) {
          i.error(i, {
            message: "Cannot initiate handshake as a server.",
            fatal: false
          });
        } else if (i.handshaking) {
          i.error(i, {
            message: "Handshake already in progress.",
            fatal: false
          });
        } else {
          if (i.fail && !i.open && i.handshakes === 0) {
            i.fail = false;
          }
          i.handshaking = true;
          u = u || "";
          var d = null;
          if (u.length > 0) {
            if (i.sessionCache) {
              d = i.sessionCache.getSession(u);
            }
            if (d === null) {
              u = "";
            }
          }
          if (u.length === 0 && i.sessionCache) {
            if (d = i.sessionCache.getSession(), d !== null) {
              u = d.id;
            }
          }
          if (i.session = {
            id: u,
            version: null,
            cipherSuite: null,
            compressionMethod: null,
            serverCertificate: null,
            certificateRequest: null,
            clientCertificate: null,
            sp: {},
            md5: Qs.md.md5.create(),
            sha1: Qs.md.sha1.create()
          }, d) {
            i.version = d.version;
            i.session.sp = d.sp;
          }
          i.session.sp.client_random = Xt.createRandom().getBytes();
          i.open = true;
          Xt.queue(i, Xt.createRecord(i, {
            type: Xt.ContentType.handshake,
            data: Xt.createClientHello(i)
          }));
          Xt.flush(i);
        }
      };
      i.process = function (u) {
        var d = 0;
        if (u) {
          i.input.putBytes(u);
        }
        if (!i.fail) {
          if (i.record !== null && i.record.ready && i.record.fragment.isEmpty()) {
            i.record = null;
          }
          if (i.record === null) {
            d = l(i);
          }
          if (!i.fail && i.record !== null && !i.record.ready) {
            d = c(i);
          }
          if (!i.fail && i.record !== null && i.record.ready) {
            a(i, i.record);
          }
        }
        return d;
      };
      i.prepare = function (u) {
        Xt.queue(i, Xt.createRecord(i, {
          type: Xt.ContentType.application_data,
          data: Qs.util.createBuffer(u)
        }));
        return Xt.flush(i);
      };
      i.prepareHeartbeatRequest = function (u, d) {
        if (u instanceof Qs.util.ByteBuffer) {
          u = u.bytes();
        }
        if (typeof d > "u") {
          d = u.length;
        }
        i.expectedHeartbeatPayload = u;
        Xt.queue(i, Xt.createRecord(i, {
          type: Xt.ContentType.heartbeat,
          data: Xt.createHeartbeat(Xt.HeartbeatMessageType.heartbeat_request, u, d)
        }));
        return Xt.flush(i);
      };
      i.close = function (u) {
        if (!i.fail && i.sessionCache && i.session) {
          var d = {
            id: i.session.id,
            version: i.session.version,
            sp: i.session.sp
          };
          d.sp.keys = null;
          i.sessionCache.setSession(d.id, d);
        }
        if (i.open) {
          if (i.open = false, i.input.clear(), i.isConnected || i.handshaking) {
            i.isConnected = i.handshaking = false;
            Xt.queue(i, Xt.createAlert(i, {
              level: Xt.Alert.Level.warning,
              description: Xt.Alert.Description.close_notify
            }));
            Xt.flush(i);
          }
          i.closed(i);
        }
        i.reset(u);
      };
      return i;
    };
    ira.exports = Qs.Aeu = Qs.Aeu || {};
    for (_qt in Xt) {
      if (typeof Xt[_qt] !== "function") {
        Qs.Aeu[_qt] = Xt[_qt];
      }
    }
    var _qt;
    Qs.Aeu.prf_tls1 = cUn;
    Qs.Aeu.hmac_sha1 = Llp;
    Qs.Aeu.createSessionCache = Xt.createSessionCache;
    Qs.Aeu.createConnection = Xt.createConnection;
  });
  var cra = __commonJS((AIy, lra) => {
    var xOe = wf();
    SOe();
    mio();
    var mX = lra.exports = xOe.Aeu;
    mX.CipherSuites.TLS_RSA_WITH_AES_128_CBC_SHA = {
      id: [0, 47],
      name: "TLS_RSA_WITH_AES_128_CBC_SHA",
      initSecurityParameters: function (e) {
        e.bulk_cipher_algorithm = mX.BulkCipherAlgorithm.aes;
        e.cipher_type = mX.CipherType.block;
        e.enc_key_length = 16;
        e.block_length = 16;
        e.fixed_iv_length = 16;
        e.record_iv_length = 16;
        e.mac_algorithm = mX.MACAlgorithm.hmac_sha1;
        e.mac_length = 20;
        e.mac_key_length = 20;
      },
      initConnectionState: ara
    };
    mX.CipherSuites.TLS_RSA_WITH_AES_256_CBC_SHA = {
      id: [0, 53],
      name: "TLS_RSA_WITH_AES_256_CBC_SHA",
      initSecurityParameters: function (e) {
        e.bulk_cipher_algorithm = mX.BulkCipherAlgorithm.aes;
        e.cipher_type = mX.CipherType.block;
        e.enc_key_length = 32;
        e.block_length = 16;
        e.fixed_iv_length = 16;
        e.record_iv_length = 16;
        e.mac_algorithm = mX.MACAlgorithm.hmac_sha1;
        e.mac_length = 20;
        e.mac_key_length = 20;
      },
      initConnectionState: ara
    };
    function ara(e, t, n) {
      var r = t.entity === xOe.Aeu.ConnectionEnd.client;
      e.read.cipherState = {
        init: false,
        cipher: xOe.cipher.createDecipher("AES-CBC", r ? n.keys.server_write_key : n.keys.client_write_key),
        iv: r ? n.keys.server_write_IV : n.keys.client_write_IV
      };
      e.write.cipherState = {
        init: false,
        cipher: xOe.cipher.createCipher("AES-CBC", r ? n.keys.client_write_key : n.keys.server_write_key),
        iv: r ? n.keys.client_write_IV : n.keys.server_write_IV
      };
      e.read.cipherFunction = scp;
      e.write.cipherFunction = ncp;
      e.read.macLength = e.write.macLength = n.mac_length;
      e.read.macFunction = e.write.macFunction = mX.hmac_sha1;
    }
    function ncp(e, t) {
      var n = false;
      var r = t.macFunction(t.macKey, t.sequenceNumber, e);
      e.fragment.putBytes(r);
      t.updateSequenceNumber();
      var o;
      if (e.version.minor === mX.Versions.TLS_1_0.minor) {
        o = t.cipherState.init ? null : t.cipherState.iv;
      } else {
        o = xOe.random.getBytesSync(16);
      }
      t.cipherState.init = true;
      var s = t.cipherState.cipher;
      if (s.start({
        iv: o
      }), e.version.minor >= mX.Versions.TLS_1_1.minor) {
        s.output.putBytes(o);
      }
      if (s.update(e.fragment), s.finish(rcp)) {
        e.fragment = s.output;
        e.length = e.fragment.length();
        n = true;
      }
      return n;
    }
    function rcp(e, t, n) {
      if (!n) {
        var r = e - t.length() % e;
        t.fillWithByte(r - 1, r);
      }
      return true;
    }
    function ocp(e, t, n) {
      var r = true;
      if (n) {
        var o = t.length();
        var s = t.last();
        for (var i = o - 1 - s; i < o - 1; ++i) {
          r = r && t.at(i) == s;
        }
        if (r) {
          t.truncate(s + 1);
        }
      }
      return r;
    }
    function scp(e, t) {
      var n = false;
      var r;
      if (e.version.minor === mX.Versions.TLS_1_0.minor) {
        r = t.cipherState.init ? null : t.cipherState.iv;
      } else {
        r = e.fragment.getBytes(16);
      }
      t.cipherState.init = true;
      var o = t.cipherState.cipher;
      o.start({
        iv: r
      });
      o.update(e.fragment);
      n = o.finish(ocp);
      var s = t.macLength;
      var i = xOe.random.getBytesSync(s);
      var a = o.output.length();
      if (a >= s) {
        e.fragment = o.output.getBytes(a - s);
        i = o.output.getBytes(s);
      } else {
        e.fragment = o.output.getBytes();
      }
      e.fragment = xOe.util.createBuffer(e.fragment);
      e.length = e.fragment.length();
      var l = t.macFunction(t.macKey, t.sequenceNumber, e);
      t.updateSequenceNumber();
      n = icp(t.macKey, i, l) && n;
      return n;
    }
    function icp(e, t, n) {
      var r = xOe.hmac.create();
      r.start("SHA1", e);
      r.update(t);
      t = r.digest().getBytes();
      r.start(null, null);
      r.update(n);
      n = r.digest().getBytes();
      return t === n;
    }
  });
  var gio = __commonJS((IIy, mra) => {
    var zC = wf();
    Hue();
    g_();
    var bqt = mra.exports = zC.sha512 = zC.sha512 || {};
    zC.md.sha512 = zC.md.algorithms.sha512 = bqt;
    var dra = zC.sha384 = zC.sha512.sha384 = zC.sha512.sha384 || {};
    dra.create = function () {
      return bqt.create("SHA-384");
    };
    zC.md.sha384 = zC.md.algorithms.sha384 = dra;
    zC.sha512.sha256 = zC.sha512.sha256 || {
      create: function () {
        return bqt.create("SHA-512/256");
      }
    };
    zC.md["sha512/256"] = zC.md.algorithms["sha512/256"] = zC.sha512.sha256;
    zC.sha512.sha224 = zC.sha512.sha224 || {
      create: function () {
        return bqt.create("SHA-512/224");
      }
    };
    zC.md["sha512/224"] = zC.md.algorithms["sha512/224"] = zC.sha512.sha224;
    bqt.create = function (e) {
      if (!pra) {
        acp();
      }
      if (typeof e > "u") {
        e = "SHA-512";
      }
      if (!(e in jGe)) {
        throw Error("Invalid SHA-512 algorithm: " + e);
      }
      var t = jGe[e];
      var n = null;
      var r = zC.util.createBuffer();
      var o = Array(80);
      for (var s = 0; s < 80; ++s) {
        o[s] = [,,];
      }
      var i = 64;
      switch (e) {
        case "SHA-384":
          i = 48;
          break;
        case "SHA-512/256":
          i = 32;
          break;
        case "SHA-512/224":
          i = 28;
          break;
      }
      var a = {
        algorithm: e.replace("-", "").toLowerCase(),
        blockLength: 128,
        digestLength: i,
        messageLength: 0,
        fullMessageLength: null,
        messageLengthSize: 16
      };
      a.start = function () {
        a.messageLength = 0;
        a.fullMessageLength = a.messageLength128 = [];
        var l = a.messageLengthSize / 4;
        for (var c = 0; c < l; ++c) {
          a.fullMessageLength.push(0);
        }
        r = zC.util.createBuffer();
        n = Array(t.length);
        for (var c = 0; c < t.length; ++c) {
          n[c] = t[c].slice(0);
        }
        return a;
      };
      a.start();
      a.update = function (l, c) {
        if (c === "utf8") {
          l = zC.util.encodeUtf8(l);
        }
        var u = l.length;
        a.messageLength += u;
        u = [u / 4294967296 >>> 0, u >>> 0];
        for (var d = a.fullMessageLength.length - 1; d >= 0; --d) {
          a.fullMessageLength[d] += u[1];
          u[1] = u[0] + (a.fullMessageLength[d] / 4294967296 >>> 0);
          a.fullMessageLength[d] = a.fullMessageLength[d] >>> 0;
          u[0] = u[1] / 4294967296 >>> 0;
        }
        if (r.putBytes(l), ura(n, o, r), r.read > 2048 || r.length() === 0) {
          r.compact();
        }
        return a;
      };
      a.digest = function () {
        var l = zC.util.createBuffer();
        l.putBytes(r.bytes());
        var c = a.fullMessageLength[a.fullMessageLength.length - 1] + a.messageLengthSize;
        var u = c & a.blockLength - 1;
        l.putBytes(fio.substr(0, a.blockLength - u));
        var d;
        var p;
        var m = a.fullMessageLength[0] * 8;
        for (var f = 0; f < a.fullMessageLength.length - 1; ++f) {
          d = a.fullMessageLength[f + 1] * 8;
          p = d / 4294967296 >>> 0;
          m += p;
          l.putInt32(m >>> 0);
          m = d >>> 0;
        }
        l.putInt32(m);
        var h = Array(n.length);
        for (var f = 0; f < n.length; ++f) {
          h[f] = n[f].slice(0);
        }
        ura(h, o, l);
        var g = zC.util.createBuffer();
        var y;
        if (e === "SHA-512") {
          y = h.length;
        } else if (e === "SHA-384") {
          y = h.length - 2;
        } else {
          y = h.length - 4;
        }
        for (var f = 0; f < y; ++f) {
          if (g.putInt32(h[f][0]), f !== y - 1 || e !== "SHA-512/224") {
            g.putInt32(h[f][1]);
          }
        }
        return g;
      };
      return a;
    };
    var fio = null;
    var pra = false;
    var hio = null;
    var jGe = null;
    function acp() {
      fio = String.fromCharCode(128);
      fio += zC.util.fillString(String.fromCharCode(0), 128);
      hio = [[1116352408, 3609767458], [1899447441, 602891725], [3049323471, 3964484399], [3921009573, 2173295548], [961987163, 4081628472], [1508970993, 3053834265], [2453635748, 2937671579], [2870763221, 3664609560], [3624381080, 2734883394], [310598401, 1164996542], [607225278, 1323610764], [1426881987, 3590304994], [1925078388, 4068182383], [2162078206, 991336113], [2614888103, 633803317], [3248222580, 3479774868], [3835390401, 2666613458], [4022224774, 944711139], [264347078, 2341262773], [604807628, 2007800933], [770255983, 1495990901], [1249150122, 1856431235], [1555081692, 3175218132], [1996064986, 2198950837], [2554220882, 3999719339], [2821834349, 766784016], [2952996808, 2566594879], [3210313671, 3203337956], [3336571891, 1034457026], [3584528711, 2466948901], [113926993, 3758326383], [338241895, 168717936], [666307205, 1188179964], [773529912, 1546045734], [1294757372, 1522805485], [1396182291, 2643833823], [1695183700, 2343527390], [1986661051, 1014477480], [2177026350, 1206759142], [2456956037, 344077627], [2730485921, 1290863460], [2820302411, 3158454273], [3259730800, 3505952657], [3345764771, 106217008], [3516065817, 3606008344], [3600352804, 1432725776], [4094571909, 1467031594], [275423344, 851169720], [430227734, 3100823752], [506948616, 1363258195], [659060556, 3750685593], [883997877, 3785050280], [958139571, 3318307427], [1322822218, 3812723403], [1537002063, 2003034995], [1747873779, 3602036899], [1955562222, 1575990012], [2024104815, 1125592928], [2227730452, 2716904306], [2361852424, 442776044], [2428436474, 593698344], [2756734187, 3733110249], [3204031479, 2999351573], [3329325298, 3815920427], [3391569614, 3928383900], [3515267271, 566280711], [3940187606, 3454069534], [4118630271, 4000239992], [116418474, 1914138554], [174292421, 2731055270], [289380356, 3203993006], [460393269, 320620315], [685471733, 587496836], [852142971, 1086792851], [1017036298, 365543100], [1126000580, 2618297676], [1288033470, 3409855158], [1501505948, 4234509866], [1607167915, 987167468], [1816402316, 1246189591]];
      jGe = {};
      jGe["SHA-512"] = [[1779033703, 4089235720], [3144134277, 2227873595], [1013904242, 4271175723], [2773480762, 1595750129], [1359893119, 2917565137], [2600822924, 725511199], [528734635, 4215389547], [1541459225, 327033209]];
      jGe["SHA-384"] = [[3418070365, 3238371032], [1654270250, 914150663], [2438529370, 812702999], [355462360, 4144912697], [1731405415, 4290775857], [2394180231, 1750603025], [3675008525, 1694076839], [1203062813, 3204075428]];
      jGe["SHA-512/256"] = [[573645204, 4230739756], [2673172387, 3360449730], [596883563, 1867755857], [2520282905, 1497426621], [2519219938, 2827943907], [3193839141, 1401305490], [721525244, 746961066], [246885852, 2177182882]];
      jGe["SHA-512/224"] = [[2352822216, 424955298], [1944164710, 2312950998], [502970286, 855612546], [1738396948, 1479516111], [258812777, 2077511080], [2011393907, 79989058], [1067287976, 1780299464], [286451373, 2446758561]];
      pra = true;
    }
    function ura(e, t, n) {
      var r;
      var o;
      var s;
      var i;
      var a;
      var l;
      var c;
      var u;
      var d;
      var p;
      var m;
      var f;
      var h;
      var g;
      var y;
      var _;
      var b;
      var S;
      var E;
      var C;
      var x;
      var A;
      var k;
      var I;
      var O;
      var M;
      var L;
      var P;
      var F;
      var H;
      var U;
      var N;
      var W;
      var j;
      var z;
      var V = n.length();
      while (V >= 128) {
        for (F = 0; F < 16; ++F) {
          t[F][0] = n.getInt32() >>> 0;
          t[F][1] = n.getInt32() >>> 0;
        }
        for (; F < 80; ++F) {
          N = t[F - 2];
          H = N[0];
          U = N[1];
          r = ((H >>> 19 | U << 13) ^ (U >>> 29 | H << 3) ^ H >>> 6) >>> 0;
          o = ((H << 13 | U >>> 19) ^ (U << 3 | H >>> 29) ^ (H << 26 | U >>> 6)) >>> 0;
          j = t[F - 15];
          H = j[0];
          U = j[1];
          s = ((H >>> 1 | U << 31) ^ (H >>> 8 | U << 24) ^ H >>> 7) >>> 0;
          i = ((H << 31 | U >>> 1) ^ (H << 24 | U >>> 8) ^ (H << 25 | U >>> 7)) >>> 0;
          W = t[F - 7];
          z = t[F - 16];
          U = o + W[1] + i + z[1];
          t[F][0] = r + W[0] + s + z[0] + (U / 4294967296 >>> 0) >>> 0;
          t[F][1] = U >>> 0;
        }
        h = e[0][0];
        g = e[0][1];
        y = e[1][0];
        _ = e[1][1];
        b = e[2][0];
        S = e[2][1];
        E = e[3][0];
        C = e[3][1];
        x = e[4][0];
        A = e[4][1];
        k = e[5][0];
        I = e[5][1];
        O = e[6][0];
        M = e[6][1];
        L = e[7][0];
        P = e[7][1];
        for (F = 0; F < 80; ++F) {
          c = ((x >>> 14 | A << 18) ^ (x >>> 18 | A << 14) ^ (A >>> 9 | x << 23)) >>> 0;
          u = ((x << 18 | A >>> 14) ^ (x << 14 | A >>> 18) ^ (A << 23 | x >>> 9)) >>> 0;
          d = (O ^ x & (k ^ O)) >>> 0;
          p = (M ^ A & (I ^ M)) >>> 0;
          a = ((h >>> 28 | g << 4) ^ (g >>> 2 | h << 30) ^ (g >>> 7 | h << 25)) >>> 0;
          l = ((h << 4 | g >>> 28) ^ (g << 30 | h >>> 2) ^ (g << 25 | h >>> 7)) >>> 0;
          m = (h & y | b & (h ^ y)) >>> 0;
          f = (g & _ | S & (g ^ _)) >>> 0;
          U = P + u + p + hio[F][1] + t[F][1];
          r = L + c + d + hio[F][0] + t[F][0] + (U / 4294967296 >>> 0) >>> 0;
          o = U >>> 0;
          U = l + f;
          s = a + m + (U / 4294967296 >>> 0) >>> 0;
          i = U >>> 0;
          L = O;
          P = M;
          O = k;
          M = I;
          k = x;
          I = A;
          U = C + o;
          x = E + r + (U / 4294967296 >>> 0) >>> 0;
          A = U >>> 0;
          E = b;
          C = S;
          b = y;
          S = _;
          y = h;
          _ = g;
          U = o + i;
          h = r + s + (U / 4294967296 >>> 0) >>> 0;
          g = U >>> 0;
        }
        U = e[0][1] + g;
        e[0][0] = e[0][0] + h + (U / 4294967296 >>> 0) >>> 0;
        e[0][1] = U >>> 0;
        U = e[1][1] + _;
        e[1][0] = e[1][0] + y + (U / 4294967296 >>> 0) >>> 0;
        e[1][1] = U >>> 0;
        U = e[2][1] + S;
        e[2][0] = e[2][0] + b + (U / 4294967296 >>> 0) >>> 0;
        e[2][1] = U >>> 0;
        U = e[3][1] + C;
        e[3][0] = e[3][0] + E + (U / 4294967296 >>> 0) >>> 0;
        e[3][1] = U >>> 0;
        U = e[4][1] + A;
        e[4][0] = e[4][0] + x + (U / 4294967296 >>> 0) >>> 0;
        e[4][1] = U >>> 0;
        U = e[5][1] + I;
        e[5][0] = e[5][0] + k + (U / 4294967296 >>> 0) >>> 0;
        e[5][1] = U >>> 0;
        U = e[6][1] + M;
        e[6][0] = e[6][0] + O + (U / 4294967296 >>> 0) >>> 0;
        e[6][1] = U >>> 0;
        U = e[7][1] + P;
        e[7][0] = e[7][0] + L + (U / 4294967296 >>> 0) >>> 0;
        e[7][1] = U >>> 0;
        V -= 128;
      }
    }
  });