  var ZUr = __commonJS(LNt => {
    var P2s = A2s();
    var O2s = I2s();
    Object.keys(P2s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(LNt, e)) {
        Object.defineProperty(LNt, e, {
          enumerable: true,
          get: function () {
            return P2s[e];
          }
        });
      }
    });
    Object.keys(O2s).forEach(function (e) {
      if (e !== "default" && !Object.prototype.hasOwnProperty.call(LNt, e)) {
        Object.defineProperty(LNt, e, {
          enumerable: true,
          get: function () {
            return O2s[e];
          }
        });
      }
    });
  });
  var M2s = __commonJS((Y1h, D2s) => {
    (() => {
      var e = {
        d: (Ee, Re) => {
          for (var Ce in Re) {
            e.o(Re, Ce) && !e.o(Ee, Ce) && Object.defineProperty(Ee, Ce, {
              enumerable: true,
              get: Re[Ce]
            });
          }
        },
        o: (Ee, Re) => Object.prototype.hasOwnProperty.call(Ee, Re),
        r: Ee => {
          typeof Symbol < "u" && Symbol.toStringTag && Object.defineProperty(Ee, Symbol.toStringTag, {
            value: "Module"
          });
          Object.defineProperty(Ee, "__esModule", {
            value: true
          });
        }
      };
      var t = {};
      e.r(t);
      e.d(t, {
        XMLBuilder: () => co,
        XMLParser: () => kt,
        XMLValidator: () => Yt
      });
      let n = ":A-Za-z_\\u00C0-\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02FF\\u0370-\\u037D\\u037F-\\u1FFF\\u200C-\\u200D\\u2070-\\u218F\\u2C00-\\u2FEF\\u3001-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFFD";
      let r = new RegExp("^[" + n + "][" + n + "\\-.\\d\\u00B7\\u0300-\\u036F\\u203F-\\u2040]*$");
      function o(Ee, Re) {
        let Ce = [];
        let Fe = Re.exec(Ee);
        for (; Fe;) {
          let Xe = [];
          Xe.startIndex = Re.lastIndex - Fe[0].length;
          let He = Fe.length;
          for (let Gt = 0; Gt < He; Gt++) {
            Xe.push(Fe[Gt]);
          }
          Ce.push(Xe);
          Fe = Re.exec(Ee);
        }
        return Ce;
      }
      let s = function (Ee) {
        return r.exec(Ee) != null;
      };
      let i = ["hasOwnProperty", "toString", "valueOf", "__defineGetter__", "__defineSetter__", "__lookupGetter__", "__lookupSetter__"];
      let a = ["__proto__", "constructor", "prototype"];
      let l = {
        allowBooleanAttributes: false,
        unpairedTags: []
      };
      function c(Ee, Re) {
        Re = Object.assign({}, l, Re);
        let Ce = [];
        let Fe = false;
        let Xe = false;
        Ee[0] === "\uFEFF" && (Ee = Ee.substr(1));
        for (let He = 0; He < Ee.length; He++) {
          if (Ee[He] === "<" && Ee[He + 1] === "?") {
            if (He += 2, He = d(Ee, He), He.err) {
              return He;
            }
          } else {
            if (Ee[He] !== "<") {
              if (u(Ee[He])) {
                continue;
              }
              return b("InvalidChar", "char '" + Ee[He] + "' is not expected.", C(Ee, He));
            }
            {
              let Gt = He;
              if (He++, Ee[He] === "!") {
                He = p(Ee, He);
                continue;
              }
              {
                let mt = false;
                Ee[He] === "/" && (mt = true, He++);
                let Dt = "";
                for (; He < Ee.length && Ee[He] !== ">" && Ee[He] !== " " && Ee[He] !== "\t" && Ee[He] !== `
` && Ee[He] !== "\r"; He++) {
                  Dt += Ee[He];
                }
                if (Dt = Dt.trim(), Dt[Dt.length - 1] === "/" && (Dt = Dt.substring(0, Dt.length - 1), He--), !E(Dt)) {
                  let Ct;
                  Ct = Dt.trim().length === 0 ? "Invalid space after '<'." : "Tag '" + Dt + "' is an invalid name.";
                  return b("InvalidTag", Ct, C(Ee, He));
                }
                let jt = h(Ee, He);
                if (jt === false) {
                  return b("InvalidAttr", "Attributes for '" + Dt + "' have open quote.", C(Ee, He));
                }
                let bn = jt.value;
                if (He = jt.index, bn[bn.length - 1] === "/") {
                  let Ct = He - bn.length;
                  bn = bn.substring(0, bn.length - 1);
                  let hn = y(bn, Re);
                  if (hn !== true) {
                    return b(hn.err.code, hn.err.msg, C(Ee, Ct + hn.err.line));
                  }
                  Fe = true;
                } else if (mt) {
                  if (!jt.tagClosed) {
                    return b("InvalidTag", "Closing tag '" + Dt + "' doesn't have proper closing.", C(Ee, He));
                  }
                  if (bn.trim().length > 0) {
                    return b("InvalidTag", "Closing tag '" + Dt + "' can't have attributes or invalid starting.", C(Ee, Gt));
                  }
                  if (Ce.length === 0) {
                    return b("InvalidTag", "Closing tag '" + Dt + "' has not been opened.", C(Ee, Gt));
                  }
                  {
                    let Ct = Ce.pop();
                    if (Dt !== Ct.tagName) {
                      let hn = C(Ee, Ct.tagStartPos);
                      return b("InvalidTag", "Expected closing tag '" + Ct.tagName + "' (opened in line " + hn.line + ", col " + hn.col + ") instead of closing tag '" + Dt + "'.", C(Ee, Gt));
                    }
                    Ce.length == 0 && (Xe = true);
                  }
                } else {
                  let Ct = y(bn, Re);
                  if (Ct !== true) {
                    return b(Ct.err.code, Ct.err.msg, C(Ee, He - bn.length + Ct.err.line));
                  }
                  if (Xe === true) {
                    return b("InvalidXml", "Multiple possible root nodes found.", C(Ee, He));
                  }
                  Re.unpairedTags.indexOf(Dt) !== -1 || Ce.push({
                    tagName: Dt,
                    tagStartPos: Gt
                  });
                  Fe = true;
                }
                for (He++; He < Ee.length; He++) {
                  if (Ee[He] === "<") {
                    if (Ee[He + 1] === "!") {
                      He++;
                      He = p(Ee, He);
                      continue;
                    }
                    if (Ee[He + 1] !== "?") {
                      break;
                    }
                    if (He = d(Ee, ++He), He.err) {
                      return He;
                    }
                  } else if (Ee[He] === "&") {
                    let Ct = _(Ee, He);
                    if (Ct == -1) {
                      return b("InvalidChar", "char '&' is not expected.", C(Ee, He));
                    }
                    He = Ct;
                  } else if (Xe === true && !u(Ee[He])) {
                    return b("InvalidXml", "Extra text at the end", C(Ee, He));
                  }
                }
                Ee[He] === "<" && He--;
              }
            }
          }
        }
        return Fe ? Ce.length == 1 ? b("InvalidTag", "Unclosed tag '" + Ce[0].tagName + "'.", C(Ee, Ce[0].tagStartPos)) : !(Ce.length > 0) || b("InvalidXml", "Invalid '" + JSON.stringify(Ce.map(He => He.tagName), null, 4).replace(/\r?\n/g, "") + "' found.", {
          line: 1,
          col: 1
        }) : b("InvalidXml", "Start tag expected.", 1);
      }
      function u(Ee) {
        return Ee === " " || Ee === "\t" || Ee === `
` || Ee === "\r";
      }
      function d(Ee, Re) {
        let Ce = Re;
        for (; Re < Ee.length; Re++) {
          if (Ee[Re] == "?" || Ee[Re] == " ") {
            let Fe = Ee.substr(Ce, Re - Ce);
            if (Re > 5 && Fe === "xml") {
              return b("InvalidXml", "XML declaration allowed only at the start of the document.", C(Ee, Re));
            }
            if (Ee[Re] == "?" && Ee[Re + 1] == ">") {
              Re++;
              break;
            }
            continue;
          }
        }
        return Re;
      }
      function p(Ee, Re) {
        if (Ee.length > Re + 5 && Ee[Re + 1] === "-" && Ee[Re + 2] === "-") {
          for (Re += 3; Re < Ee.length; Re++) {
            if (Ee[Re] === "-" && Ee[Re + 1] === "-" && Ee[Re + 2] === ">") {
              Re += 2;
              break;
            }
          }
        } else if (Ee.length > Re + 8 && Ee[Re + 1] === "D" && Ee[Re + 2] === "O" && Ee[Re + 3] === "C" && Ee[Re + 4] === "T" && Ee[Re + 5] === "Y" && Ee[Re + 6] === "P" && Ee[Re + 7] === "E") {
          let Ce = 1;
          for (Re += 8; Re < Ee.length; Re++) {
            if (Ee[Re] === "<") {
              Ce++;
            } else if (Ee[Re] === ">" && (Ce--, Ce === 0)) {
              break;
            }
          }
        } else if (Ee.length > Re + 9 && Ee[Re + 1] === "[" && Ee[Re + 2] === "C" && Ee[Re + 3] === "D" && Ee[Re + 4] === "A" && Ee[Re + 5] === "T" && Ee[Re + 6] === "A" && Ee[Re + 7] === "[") {
          for (Re += 8; Re < Ee.length; Re++) {
            if (Ee[Re] === "]" && Ee[Re + 1] === "]" && Ee[Re + 2] === ">") {
              Re += 2;
              break;
            }
          }
        }
        return Re;
      }
      let m = '"';
      let f = "'";
      function h(Ee, Re) {
        let Ce = "";
        let Fe = "";
        let Xe = false;
        for (; Re < Ee.length; Re++) {
          if (Ee[Re] === m || Ee[Re] === f) {
            Fe === "" ? Fe = Ee[Re] : Fe !== Ee[Re] || (Fe = "");
          } else if (Ee[Re] === ">" && Fe === "") {
            Xe = true;
            break;
          }
          Ce += Ee[Re];
        }
        return Fe === "" && {
          value: Ce,
          index: Re,
          tagClosed: Xe
        };
      }
      let g = new RegExp(`(\\s*)([^\\s=]+)(\\s*=)?(\\s*(['"])(([\\s\\S])*?)\\5)?`, "g");
      function y(Ee, Re) {
        let Ce = o(Ee, g);
        let Fe = {};
        for (let Xe = 0; Xe < Ce.length; Xe++) {
          if (Ce[Xe][1].length === 0) {
            return b("InvalidAttr", "Attribute '" + Ce[Xe][2] + "' has no space in starting.", x(Ce[Xe]));
          }
          if (Ce[Xe][3] !== undefined && Ce[Xe][4] === undefined) {
            return b("InvalidAttr", "Attribute '" + Ce[Xe][2] + "' is without value.", x(Ce[Xe]));
          }
          if (Ce[Xe][3] === undefined && !Re.allowBooleanAttributes) {
            return b("InvalidAttr", "boolean attribute '" + Ce[Xe][2] + "' is not allowed.", x(Ce[Xe]));
          }
          let He = Ce[Xe][2];
          if (!S(He)) {
            return b("InvalidAttr", "Attribute '" + He + "' is an invalid name.", x(Ce[Xe]));
          }
          if (Object.prototype.hasOwnProperty.call(Fe, He)) {
            return b("InvalidAttr", "Attribute '" + He + "' is repeated.", x(Ce[Xe]));
          }
          Fe[He] = 1;
        }
        return true;
      }
      function _(Ee, Re) {
        if (Ee[++Re] === ";") {
          return -1;
        }
        if (Ee[Re] === "#") {
          return function (Fe, Xe) {
            let He = /\d/;
            for (Fe[Xe] === "x" && (Xe++, He = /[\da-fA-F]/); Xe < Fe.length; Xe++) {
              if (Fe[Xe] === ";") {
                return Xe;
              }
              if (!Fe[Xe].match(He)) {
                break;
              }
            }
            return -1;
          }(Ee, ++Re);
        }
        let Ce = 0;
        for (; Re < Ee.length; Re++, Ce++) {
          if (!(Ee[Re].match(/\w/) && Ce < 20)) {
            if (Ee[Re] === ";") {
              break;
            }
            return -1;
          }
        }
        return Re;
      }
      function b(Ee, Re, Ce) {
        return {
          err: {
            code: Ee,
            msg: Re,
            line: Ce.line || Ce,
            col: Ce.col
          }
        };
      }
      function S(Ee) {
        return s(Ee);
      }
      function E(Ee) {
        return s(Ee);
      }
      function C(Ee, Re) {
        let Ce = Ee.substring(0, Re).split(/\r?\n/);
        return {
          line: Ce.length,
          col: Ce[Ce.length - 1].length + 1
        };
      }
      function x(Ee) {
        return Ee.startIndex + Ee[1].length;
      }
      let A = Ee => i.includes(Ee) ? "__" + Ee : Ee;
      let k = {
        preserveOrder: false,
        attributeNamePrefix: "@_",
        attributesGroupName: false,
        textNodeName: "#text",
        ignoreAttributes: true,
        removeNSPrefix: false,
        allowBooleanAttributes: false,
        parseTagValue: true,
        parseAttributeValue: false,
        trimValues: true,
        cdataPropName: false,
        numberParseOptions: {
          hex: true,
          leadingZeros: true,
          eNotation: true
        },
        tagValueProcessor: function (Ee, Re) {
          return Re;
        },
        attributeValueProcessor: function (Ee, Re) {
          return Re;
        },
        stopNodes: [],
        alwaysCreateTextNode: false,
        isArray: () => false,
        commentPropName: false,
        unpairedTags: [],
        processEntities: true,
        htmlEntities: false,
        ignoreDeclaration: false,
        ignorePiTags: false,
        transformTagName: false,
        transformAttributeName: false,
        updateTag: function (Ee, Re, Ce) {
          return Ee;
        },
        captureMetaData: false,
        maxNestedTags: 100,
        strictReservedNames: true,
        jPath: true,
        onDangerousProperty: A
      };
      function I(Ee, Re) {
        if (typeof Ee != "string") {
          return;
        }
        let Ce = Ee.toLowerCase();
        if (i.some(Fe => Ce === Fe.toLowerCase())) {
          throw Error(`[SECURITY] Invalid ${Re}: "${Ee}" is a reserved JavaScript keyword that could cause prototype pollution`);
        }
        if (a.some(Fe => Ce === Fe.toLowerCase())) {
          throw Error(`[SECURITY] Invalid ${Re}: "${Ee}" is a reserved JavaScript keyword that could cause prototype pollution`);
        }
      }
      function O(Ee) {
        return typeof Ee == "boolean" ? {
          enabled: Ee,
          maxEntitySize: 1e4,
          maxExpansionDepth: 10,
          maxTotalExpansions: 1000,
          maxExpandedLength: 1e5,
          maxEntityCount: 100,
          allowedTags: null,
          tagFilter: null
        } : typeof Ee == "object" && Ee !== null ? {
          enabled: Ee.enabled !== false,
          maxEntitySize: Math.max(1, Ee.maxEntitySize ?? 1e4),
          maxExpansionDepth: Math.max(1, Ee.maxExpansionDepth ?? 10),
          maxTotalExpansions: Math.max(1, Ee.maxTotalExpansions ?? 1000),
          maxExpandedLength: Math.max(1, Ee.maxExpandedLength ?? 1e5),
          maxEntityCount: Math.max(1, Ee.maxEntityCount ?? 100),
          allowedTags: Ee.allowedTags ?? null,
          tagFilter: Ee.tagFilter ?? null
        } : O(true);
      }
      let M = function (Ee) {
        let Re = Object.assign({}, k, Ee);
        let Ce = [{
          value: Re.attributeNamePrefix,
          name: "attributeNamePrefix"
        }, {
          value: Re.attributesGroupName,
          name: "attributesGroupName"
        }, {
          value: Re.textNodeName,
          name: "textNodeName"
        }, {
          value: Re.cdataPropName,
          name: "cdataPropName"
        }, {
          value: Re.commentPropName,
          name: "commentPropName"
        }];
        for (let {
          value: Fe,
          name: Xe
        } of Ce) {
          Fe && I(Fe, Xe);
        }
        Re.onDangerousProperty === null && (Re.onDangerousProperty = A);
        Re.processEntities = O(Re.processEntities);
        Re.stopNodes && Array.isArray(Re.stopNodes) && (Re.stopNodes = Re.stopNodes.map(Fe => typeof Fe == "string" && Fe.startsWith("*.") ? ".." + Fe.substring(2) : Fe));
        return Re;
      };
      let L;
      L = typeof Symbol != "function" ? "@@xmlMetadata" : Symbol("XML Node Metadata");
      class P {
        constructor(Ee) {
          this.tagname = Ee;
          this.child = [];
          this[":@"] = Object.create(null);
        }
        add(Ee, Re) {
          Ee === "__proto__" && (Ee = "#__proto__");
          this.child.push({
            [Ee]: Re
          });
        }
        addChild(Ee, Re) {
          Ee.tagname === "__proto__" && (Ee.tagname = "#__proto__");
          Ee[":@"] && Object.keys(Ee[":@"]).length > 0 ? this.child.push({
            [Ee.tagname]: Ee.child,
            ":@": Ee[":@"]
          }) : this.child.push({
            [Ee.tagname]: Ee.child
          });
          Re !== undefined && (this.child[this.child.length - 1][L] = {
            startIndex: Re
          });
        }
        static getMetaDataSymbol() {
          return L;
        }
      }
      class F {
        constructor(Ee) {
          this.suppressValidationErr = !Ee;
          this.options = Ee;
        }
        readDocType(Ee, Re) {
          let Ce = Object.create(null);
          let Fe = 0;
          if (Ee[Re + 3] !== "O" || Ee[Re + 4] !== "C" || Ee[Re + 5] !== "T" || Ee[Re + 6] !== "Y" || Ee[Re + 7] !== "P" || Ee[Re + 8] !== "E") {
            throw Error("Invalid Tag instead of DOCTYPE");
          }
          {
            Re += 9;
            let Xe = 1;
            let He = false;
            let Gt = false;
            let mt = "";
            for (; Re < Ee.length; Re++) {
              if (Ee[Re] !== "<" || Gt) {
                if (Ee[Re] === ">") {
                  if (Gt ? Ee[Re - 1] === "-" && Ee[Re - 2] === "-" && (Gt = false, Xe--) : Xe--, Xe === 0) {
                    break;
                  }
                } else {
                  Ee[Re] === "[" ? He = true : mt += Ee[Re];
                }
              } else {
                if (He && U(Ee, "!ENTITY", Re)) {
                  let Dt;
                  let jt;
                  if (Re += 7, [Dt, jt, Re] = this.readEntityExp(Ee, Re + 1, this.suppressValidationErr), jt.indexOf("&") === -1) {
                    if (this.options.enabled !== false && this.options.maxEntityCount != null && Fe >= this.options.maxEntityCount) {
                      throw Error(`Entity count (${Fe + 1}) exceeds maximum allowed (${this.options.maxEntityCount})`);
                    }
                    let bn = Dt.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
                    Ce[Dt] = {
                      regx: RegExp(`&${bn};`, "g"),
                      val: jt
                    };
                    Fe++;
                  }
                } else if (He && U(Ee, "!ELEMENT", Re)) {
                  Re += 8;
                  let {
                    index: Dt
                  } = this.readElementExp(Ee, Re + 1);
                  Re = Dt;
                } else if (He && U(Ee, "!ATTLIST", Re)) {
                  Re += 8;
                } else if (He && U(Ee, "!NOTATION", Re)) {
                  Re += 9;
                  let {
                    index: Dt
                  } = this.readNotationExp(Ee, Re + 1, this.suppressValidationErr);
                  Re = Dt;
                } else {
                  if (!U(Ee, "!--", Re)) {
                    throw Error("Invalid DOCTYPE");
                  }
                  Gt = true;
                }
                Xe++;
                mt = "";
              }
            }
            if (Xe !== 0) {
              throw Error("Unclosed DOCTYPE");
            }
          }
          return {
            entities: Ce,
            i: Re
          };
        }
        readEntityExp(Ee, Re) {
          let Ce = Re = H(Ee, Re);
          for (; Re < Ee.length && !/\s/.test(Ee[Re]) && Ee[Re] !== '"' && Ee[Re] !== "'";) {
            Re++;
          }
          let Fe = Ee.substring(Ce, Re);
          if (N(Fe), Re = H(Ee, Re), !this.suppressValidationErr) {
            if (Ee.substring(Re, Re + 6).toUpperCase() === "SYSTEM") {
              throw Error("External entities are not supported");
            }
            if (Ee[Re] === "%") {
              throw Error("Parameter entities are not supported");
            }
          }
          let Xe = "";
          if ([Re, Xe] = this.readIdentifierVal(Ee, Re, "entity"), this.options.enabled !== false && this.options.maxEntitySize != null && Xe.length > this.options.maxEntitySize) {
            throw Error(`Entity "${Fe}" size (${Xe.length}) exceeds maximum allowed size (${this.options.maxEntitySize})`);
          }
          return [Fe, Xe, --Re];
        }
        readNotationExp(Ee, Re) {
          let Ce = Re = H(Ee, Re);
          for (; Re < Ee.length && !/\s/.test(Ee[Re]);) {
            Re++;
          }
          let Fe = Ee.substring(Ce, Re);
          !this.suppressValidationErr && N(Fe);
          Re = H(Ee, Re);
          let Xe = Ee.substring(Re, Re + 6).toUpperCase();
          if (!this.suppressValidationErr && Xe !== "SYSTEM" && Xe !== "PUBLIC") {
            throw Error(`Expected SYSTEM or PUBLIC, found "${Xe}"`);
          }
          Re += Xe.length;
          Re = H(Ee, Re);
          let He = null;
          let Gt = null;
          if (Xe === "PUBLIC") {
            [Re, He] = this.readIdentifierVal(Ee, Re, "publicIdentifier");
            Ee[Re = H(Ee, Re)] !== '"' && Ee[Re] !== "'" || ([Re, Gt] = this.readIdentifierVal(Ee, Re, "systemIdentifier"));
          } else if (Xe === "SYSTEM" && ([Re, Gt] = this.readIdentifierVal(Ee, Re, "systemIdentifier"), !this.suppressValidationErr && !Gt)) {
            throw Error("Missing mandatory system identifier for SYSTEM notation");
          }
          return {
            notationName: Fe,
            publicIdentifier: He,
            systemIdentifier: Gt,
            index: --Re
          };
        }
        readIdentifierVal(Ee, Re, Ce) {
          let Fe = "";
          let Xe = Ee[Re];
          if (Xe !== '"' && Xe !== "'") {
            throw Error(`Expected quoted string, found "${Xe}"`);
          }
          let He = ++Re;
          for (; Re < Ee.length && Ee[Re] !== Xe;) {
            Re++;
          }
          if (Fe = Ee.substring(He, Re), Ee[Re] !== Xe) {
            throw Error(`Unterminated ${Ce} value`);
          }
          return [++Re, Fe];
        }
        readElementExp(Ee, Re) {
          let Ce = Re = H(Ee, Re);
          for (; Re < Ee.length && !/\s/.test(Ee[Re]);) {
            Re++;
          }
          let Fe = Ee.substring(Ce, Re);
          if (!this.suppressValidationErr && !s(Fe)) {
            throw Error(`Invalid element name: "${Fe}"`);
          }
          let Xe = "";
          if (Ee[Re = H(Ee, Re)] === "E" && U(Ee, "MPTY", Re)) {
            Re += 4;
          } else if (Ee[Re] === "A" && U(Ee, "NY", Re)) {
            Re += 2;
          } else if (Ee[Re] === "(") {
            let He = ++Re;
            for (; Re < Ee.length && Ee[Re] !== ")";) {
              Re++;
            }
            if (Xe = Ee.substring(He, Re), Ee[Re] !== ")") {
              throw Error("Unterminated content model");
            }
          } else if (!this.suppressValidationErr) {
            throw Error(`Invalid Element Expression, found "${Ee[Re]}"`);
          }
          return {
            elementName: Fe,
            contentModel: Xe.trim(),
            index: Re
          };
        }
        readAttlistExp(Ee, Re) {
          let Ce = Re = H(Ee, Re);
          for (; Re < Ee.length && !/\s/.test(Ee[Re]);) {
            Re++;
          }
          let Fe = Ee.substring(Ce, Re);
          for (N(Fe), Ce = Re = H(Ee, Re); Re < Ee.length && !/\s/.test(Ee[Re]);) {
            Re++;
          }
          let Xe = Ee.substring(Ce, Re);
          if (!N(Xe)) {
            throw Error(`Invalid attribute name: "${Xe}"`);
          }
          Re = H(Ee, Re);
          let He = "";
          if (Ee.substring(Re, Re + 8).toUpperCase() === "NOTATION") {
            if (He = "NOTATION", Ee[Re = H(Ee, Re += 8)] !== "(") {
              throw Error(`Expected '(', found "${Ee[Re]}"`);
            }
            Re++;
            let mt = [];
            for (; Re < Ee.length && Ee[Re] !== ")";) {
              let Dt = Re;
              for (; Re < Ee.length && Ee[Re] !== "|" && Ee[Re] !== ")";) {
                Re++;
              }
              let jt = Ee.substring(Dt, Re);
              if (jt = jt.trim(), !N(jt)) {
                throw Error(`Invalid notation name: "${jt}"`);
              }
              mt.push(jt);
              Ee[Re] === "|" && (Re++, Re = H(Ee, Re));
            }
            if (Ee[Re] !== ")") {
              throw Error("Unterminated list of notations");
            }
            Re++;
            He += " (" + mt.join("|") + ")";
          } else {
            let mt = Re;
            for (; Re < Ee.length && !/\s/.test(Ee[Re]);) {
              Re++;
            }
            He += Ee.substring(mt, Re);
            let Dt = ["CDATA", "ID", "IDREF", "IDREFS", "ENTITY", "ENTITIES", "NMTOKEN", "NMTOKENS"];
            if (!this.suppressValidationErr && !Dt.includes(He.toUpperCase())) {
              throw Error(`Invalid attribute type: "${He}"`);
            }
          }
          Re = H(Ee, Re);
          let Gt = "";
          Ee.substring(Re, Re + 8).toUpperCase() === "#REQUIRED" ? (Gt = "#REQUIRED", Re += 8) : Ee.substring(Re, Re + 7).toUpperCase() === "#IMPLIED" ? (Gt = "#IMPLIED", Re += 7) : [Re, Gt] = this.readIdentifierVal(Ee, Re, "ATTLIST");
          return {
            elementName: Fe,
            attributeName: Xe,
            attributeType: He,
            defaultValue: Gt,
            index: Re
          };
        }
      }
      let H = (Ee, Re) => {
        for (; Re < Ee.length && /\s/.test(Ee[Re]);) {
          Re++;
        }
        return Re;
      };
      function U(Ee, Re, Ce) {
        for (let Fe = 0; Fe < Re.length; Fe++) {
          if (Re[Fe] !== Ee[Ce + Fe + 1]) {
            return false;
          }
        }
        return true;
      }
      function N(Ee) {
        if (s(Ee)) {
          return Ee;
        }
        throw Error(`Invalid entity name ${Ee}`);
      }
      let W = /^[-+]?0x[a-fA-F0-9]+$/;
      let j = /^([\-\+])?(0*)([0-9]*(\.[0-9]*)?)$/;
      let z = {
        hex: true,
        leadingZeros: true,
        decimalPoint: ".",
        eNotation: true,
        infinity: "original"
      };
      let V = /^([-+])?(0*)(\d*(\.\d*)?[eE][-\+]?\d+)$/;
      let K = new Set(["push", "pop", "reset", "updateCurrent", "restore"]);
      class J {
        constructor(Ee = {}) {
          this.separator = Ee.separator || ".";
          this.path = [];
          this.siblingStacks = [];
        }
        push(Ee, Re = null, Ce = null) {
          this.path.length > 0 && (this.path[this.path.length - 1].values = undefined);
          let Fe = this.path.length;
          this.siblingStacks[Fe] || (this.siblingStacks[Fe] = new Map());
          let Xe = this.siblingStacks[Fe];
          let He = Ce ? `${Ce}:${Ee}` : Ee;
          let Gt = Xe.get(He) || 0;
          let mt = 0;
          for (let jt of Xe.values()) {
            mt += jt;
          }
          Xe.set(He, Gt + 1);
          let Dt = {
            tag: Ee,
            position: mt,
            counter: Gt
          };
          Ce != null && (Dt.namespace = Ce);
          Re != null && (Dt.values = Re);
          this.path.push(Dt);
        }
        pop() {
          if (this.path.length === 0) {
            return;
          }
          let Ee = this.path.pop();
          this.siblingStacks.length > this.path.length + 1 && (this.siblingStacks.length = this.path.length + 1);
          return Ee;
        }
        updateCurrent(Ee) {
          if (this.path.length > 0) {
            let Re = this.path[this.path.length - 1];
            Ee != null && (Re.values = Ee);
          }
        }
        getCurrentTag() {
          return this.path.length > 0 ? this.path[this.path.length - 1].tag : undefined;
        }
        getCurrentNamespace() {
          return this.path.length > 0 ? this.path[this.path.length - 1].namespace : undefined;
        }
        getAttrValue(Ee) {
          if (this.path.length === 0) {
            return;
          }
          return this.path[this.path.length - 1].values?.[Ee];
        }
        hasAttr(Ee) {
          if (this.path.length === 0) {
            return false;
          }
          let Re = this.path[this.path.length - 1];
          return Re.values !== undefined && Ee in Re.values;
        }
        getPosition() {
          return this.path.length === 0 ? -1 : this.path[this.path.length - 1].position ?? 0;
        }
        getCounter() {
          return this.path.length === 0 ? -1 : this.path[this.path.length - 1].counter ?? 0;
        }
        getIndex() {
          return this.getPosition();
        }
        getDepth() {
          return this.path.length;
        }
        toString(Ee, Re = true) {
          let Ce = Ee || this.separator;
          return this.path.map(Fe => Re && Fe.namespace ? `${Fe.namespace}:${Fe.tag}` : Fe.tag).join(Ce);
        }
        toArray() {
          return this.path.map(Ee => Ee.tag);
        }
        reset() {
          this.path = [];
          this.siblingStacks = [];
        }
        matches(Ee) {
          let Re = Ee.segments;
          return Re.length !== 0 && (Ee.hasDeepWildcard() ? this._matchWithDeepWildcard(Re) : this._matchSimple(Re));
        }
        _matchSimple(Ee) {
          if (this.path.length !== Ee.length) {
            return false;
          }
          for (let Re = 0; Re < Ee.length; Re++) {
            let Ce = Ee[Re];
            let Fe = this.path[Re];
            let Xe = Re === this.path.length - 1;
            if (!this._matchSegment(Ce, Fe, Xe)) {
              return false;
            }
          }
          return true;
        }
        _matchWithDeepWildcard(Ee) {
          let Re = this.path.length - 1;
          let Ce = Ee.length - 1;
          for (; Ce >= 0 && Re >= 0;) {
            let Fe = Ee[Ce];
            if (Fe.type === "deep-wildcard") {
              if (Ce--, Ce < 0) {
                return true;
              }
              let Xe = Ee[Ce];
              let He = false;
              for (let Gt = Re; Gt >= 0; Gt--) {
                let mt = Gt === this.path.length - 1;
                if (this._matchSegment(Xe, this.path[Gt], mt)) {
                  Re = Gt - 1;
                  Ce--;
                  He = true;
                  break;
                }
              }
              if (!He) {
                return false;
              }
            } else {
              let Xe = Re === this.path.length - 1;
              if (!this._matchSegment(Fe, this.path[Re], Xe)) {
                return false;
              }
              Re--;
              Ce--;
            }
          }
          return Ce < 0;
        }
        _matchSegment(Ee, Re, Ce) {
          if (Ee.tag !== "*" && Ee.tag !== Re.tag) {
            return false;
          }
          if (Ee.namespace !== undefined && Ee.namespace !== "*" && Ee.namespace !== Re.namespace) {
            return false;
          }
          if (Ee.attrName !== undefined) {
            if (!Ce) {
              return false;
            }
            if (!Re.values || !(Ee.attrName in Re.values)) {
              return false;
            }
            if (Ee.attrValue !== undefined) {
              let Fe = Re.values[Ee.attrName];
              if (String(Fe) !== String(Ee.attrValue)) {
                return false;
              }
            }
          }
          if (Ee.position !== undefined) {
            if (!Ce) {
              return false;
            }
            let Fe = Re.counter ?? 0;
            if (Ee.position === "first" && Fe !== 0) {
              return false;
            }
            if (Ee.position === "odd" && Fe % 2 != 1) {
              return false;
            }
            if (Ee.position === "even" && Fe % 2 != 0) {
              return false;
            }
            if (Ee.position === "nth" && Fe !== Ee.positionValue) {
              return false;
            }
          }
          return true;
        }
        snapshot() {
          return {
            path: this.path.map(Ee => ({
              ...Ee
            })),
            siblingStacks: this.siblingStacks.map(Ee => new Map(Ee))
          };
        }
        restore(Ee) {
          this.path = Ee.path.map(Re => ({
            ...Re
          }));
          this.siblingStacks = Ee.siblingStacks.map(Re => new Map(Re));
        }
        readOnly() {
          return new Proxy(this, {
            get(Ee, Re, Ce) {
              if (K.vZc(Re)) {
                return () => {
                  throw TypeError(`Cannot call '${Re}' on a read-only Matcher. Obtain a writable instance to mutate state.`);
                };
              }
              let Fe = Reflect.get(Ee, Re, Ce);
              return Re === "path" || Re === "siblingStacks" ? Object.freeze(Array.isArray(Fe) ? Fe.map(Xe => Xe instanceof Map ? Object.freeze(new Map(Xe)) : Object.freeze({
                ...Xe
              })) : Fe) : typeof Fe == "function" ? Fe.bind(Ee) : Fe;
            },
            set(Ee, Re) {
              throw TypeError(`Cannot set property '${String(Re)}' on a read-only Matcher.`);
            },
            deleteProperty(Ee, Re) {
              throw TypeError(`Cannot delete property '${String(Re)}' from a read-only Matcher.`);
            }
          });
        }
      }
      class Q {
        constructor(Ee, Re = {}) {
          this.pattern = Ee;
          this.separator = Re.separator || ".";
          this.segments = this._parse(Ee);
          this._hasDeepWildcard = this.segments.some(Ce => Ce.type === "deep-wildcard");
          this._hasAttributeCondition = this.segments.some(Ce => Ce.attrName !== undefined);
          this._hasPositionSelector = this.segments.some(Ce => Ce.position !== undefined);
        }
        _parse(Ee) {
          let Re = [];
          let Ce = 0;
          let Fe = "";
          for (; Ce < Ee.length;) {
            Ee[Ce] === this.separator ? Ce + 1 < Ee.length && Ee[Ce + 1] === this.separator ? (Fe.trim() && (Re.push(this._parseSegment(Fe.trim())), Fe = ""), Re.push({
              type: "deep-wildcard"
            }), Ce += 2) : (Fe.trim() && Re.push(this._parseSegment(Fe.trim())), Fe = "", Ce++) : (Fe += Ee[Ce], Ce++);
          }
          Fe.trim() && Re.push(this._parseSegment(Fe.trim()));
          return Re;
        }
        _parseSegment(Ee) {
          let Re = {
            type: "tag"
          };
          let Ce = null;
          let Fe = Ee;
          let Xe = Ee.match(/^([^\[]+)(\[[^\]]*\])(.*)$/);
          if (Xe && (Fe = Xe[1] + Xe[3], Xe[2])) {
            let jt = Xe[2].slice(1, -1);
            jt && (Ce = jt);
          }
          let He;
          let Gt;
          let mt = Fe;
          if (Fe.includes("::")) {
            let jt = Fe.indexOf("::");
            if (He = Fe.substring(0, jt).trim(), mt = Fe.substring(jt + 2).trim(), !He) {
              throw Error(`Invalid namespace in pattern: ${Ee}`);
            }
          }
          let Dt = null;
          if (mt.includes(":")) {
            let jt = mt.lastIndexOf(":");
            let bn = mt.substring(0, jt).trim();
            let Ct = mt.substring(jt + 1).trim();
            ["first", "last", "odd", "even"].includes(Ct) || /^nth\(\d+\)$/.test(Ct) ? (Gt = bn, Dt = Ct) : Gt = mt;
          } else {
            Gt = mt;
          }
          if (!Gt) {
            throw Error(`Invalid segment pattern: ${Ee}`);
          }
          if (Re.tag = Gt, He && (Re.namespace = He), Ce) {
            if (Ce.includes("=")) {
              let jt = Ce.indexOf("=");
              Re.attrName = Ce.substring(0, jt).trim();
              Re.attrValue = Ce.substring(jt + 1).trim();
            } else {
              Re.attrName = Ce.trim();
            }
          }
          if (Dt) {
            let jt = Dt.match(/^nth\((\d+)\)$/);
            jt ? (Re.position = "nth", Re.positionValue = parseInt(jt[1], 10)) : Re.position = Dt;
          }
          return Re;
        }
        get length() {
          return this.segments.length;
        }
        hasDeepWildcard() {
          return this._hasDeepWildcard;
        }
        hasAttributeCondition() {
          return this._hasAttributeCondition;
        }
        hasPositionSelector() {
          return this._hasPositionSelector;
        }
        toString() {
          return this.pattern;
        }
      }
      function Z(Ee, Re) {
        if (!Ee) {
          return {};
        }
        let Ce = Re.attributesGroupName ? Ee[Re.attributesGroupName] : Ee;
        if (!Ce) {
          return {};
        }
        let Fe = {};
        for (let Xe in Ce) {
          Xe.startsWith(Re.attributeNamePrefix) ? Fe[Xe.substring(Re.attributeNamePrefix.length)] = Ce[Xe] : Fe[Xe] = Ce[Xe];
        }
        return Fe;
      }
      function ne(Ee) {
        if (!Ee || typeof Ee != "string") {
          return;
        }
        let Re = Ee.indexOf(":");
        if (Re !== -1 && Re > 0) {
          let Ce = Ee.substring(0, Re);
          if (Ce !== "xmlns") {
            return Ce;
          }
        }
      }
      class oe {
        constructor(Ee) {
          var Re;
          if (this.options = Ee, this.currentNode = null, this.tagsNodeStack = [], this.docTypeEntities = {}, this.lastEntities = {
            apos: {
              regex: /&(apos|#39|#x27);/g,
              val: "'"
            },
            gt: {
              regex: /&(gt|#62|#x3E);/g,
              val: ">"
            },
            lt: {
              regex: /&(lt|#60|#x3C);/g,
              val: "<"
            },
            quot: {
              regex: /&(quot|#34|#x22);/g,
              val: '"'
            }
          }, this.ampEntity = {
            regex: /&(amp|#38|#x26);/g,
            val: "&"
          }, this.htmlEntities = {
            space: {
              regex: /&(nbsp|#160);/g,
              val: " "
            },
            cent: {
              regex: /&(cent|#162);/g,
              val: "\xA2"
            },
            pound: {
              regex: /&(pound|#163);/g,
              val: "\xA3"
            },
            yen: {
              regex: /&(yen|#165);/g,
              val: "\xA5"
            },
            euro: {
              regex: /&(euro|#8364);/g,
              val: "\u20AC"
            },
            copyright: {
              regex: /&(copy|#169);/g,
              val: "\xA9"
            },
            reg: {
              regex: /&(reg|#174);/g,
              val: "\xAE"
            },
            inr: {
              regex: /&(inr|#8377);/g,
              val: "\u20B9"
            },
            num_dec: {
              regex: /&#([0-9]{1,7});/g,
              val: (Ce, Fe) => _e(Fe, 10, "&#")
            },
            num_hex: {
              regex: /&#x([0-9a-fA-F]{1,6});/g,
              val: (Ce, Fe) => _e(Fe, 16, "&#x")
            }
          }, this.addExternalEntities = ee, this.parseXml = be, this.parseTextData = re, this.resolveNameSpace = se, this.buildAttributesMap = de, this.isItStopNode = ue, this.replaceEntitiesValue = me, this.readStopNodeData = pe, this.saveTextToParentTag = Te, this.addChild = fe, this.ignoreAttributesFn = typeof (Re = this.options.ignoreAttributes) == "function" ? Re : Array.isArray(Re) ? Ce => {
            for (let Fe of Re) {
              if (typeof Fe == "string" && Ce === Fe) {
                return true;
              }
              if (Fe instanceof RegExp && Fe.test(Ce)) {
                return true;
              }
            }
          } : () => false, this.entityExpansionCount = 0, this.currentExpandedLength = 0, this.matcher = new J(), this.readonlyMatcher = this.matcher.readOnly(), this.isCurrentNodeStopNode = false, this.options.stopNodes && this.options.stopNodes.length > 0) {
            this.stopNodeExpressions = [];
            for (let Ce = 0; Ce < this.options.stopNodes.length; Ce++) {
              let Fe = this.options.stopNodes[Ce];
              typeof Fe == "string" ? this.stopNodeExpressions.push(new Q(Fe)) : Fe instanceof Q && this.stopNodeExpressions.push(Fe);
            }
          }
        }
      }
      function ee(Ee) {
        let Re = Object.keys(Ee);
        for (let Ce = 0; Ce < Re.length; Ce++) {
          let Fe = Re[Ce];
          let Xe = Fe.replace(/[.\-+*:]/g, "\\.");
          this.lastEntities[Fe] = {
            regex: new RegExp("&" + Xe + ";", "g"),
            val: Ee[Fe]
          };
        }
      }
      function re(Ee, Re, Ce, Fe, Xe, He, Gt) {
        if (Ee !== undefined && (this.options.trimValues && !Fe && (Ee = Ee.trim()), Ee.length > 0)) {
          Gt || (Ee = this.replaceEntitiesValue(Ee, Re, Ce));
          let mt = this.options.jPath ? Ce.toString() : Ce;
          let Dt = this.options.tagValueProcessor(Re, Ee, mt, Xe, He);
          return Dt == null ? Ee : typeof Dt != typeof Ee || Dt !== Ee ? Dt : this.options.trimValues || Ee.trim() === Ee ? ve(Ee, this.options.parseTagValue, this.options.numberParseOptions) : Ee;
        }
      }
      function se(Ee) {
        if (this.options.removeNSPrefix) {
          let Re = Ee.split(":");
          let Ce = Ee.charAt(0) === "/" ? "/" : "";
          if (Re[0] === "xmlns") {
            return "";
          }
          Re.length === 2 && (Ee = Ce + Re[1]);
        }
        return Ee;
      }
      let ae = new RegExp(`([^\\s=]+)\\s*(=\\s*(['"])([\\s\\S]*?)\\3)?`, "gm");
      function de(Ee, Re, Ce) {
        if (this.options.ignoreAttributes !== true && typeof Ee == "string") {
          let Fe = o(Ee, ae);
          let Xe = Fe.length;
          let He = {};
          let Gt = {};
          for (let mt = 0; mt < Xe; mt++) {
            let Dt = this.resolveNameSpace(Fe[mt][1]);
            let jt = Fe[mt][4];
            if (Dt.length && jt !== undefined) {
              let bn = jt;
              this.options.trimValues && (bn = bn.trim());
              bn = this.replaceEntitiesValue(bn, Ce, this.readonlyMatcher);
              Gt[Dt] = bn;
            }
          }
          Object.keys(Gt).length > 0 && typeof Re == "object" && Re.updateCurrent && Re.updateCurrent(Gt);
          for (let mt = 0; mt < Xe; mt++) {
            let Dt = this.resolveNameSpace(Fe[mt][1]);
            let jt = this.options.jPath ? Re.toString() : this.readonlyMatcher;
            if (this.ignoreAttributesFn(Dt, jt)) {
              continue;
            }
            let bn = Fe[mt][4];
            let Ct = this.options.attributeNamePrefix + Dt;
            if (Dt.length) {
              if (this.options.transformAttributeName && (Ct = this.options.transformAttributeName(Ct)), Ct = ke(Ct, this.options), bn !== undefined) {
                this.options.trimValues && (bn = bn.trim());
                bn = this.replaceEntitiesValue(bn, Ce, this.readonlyMatcher);
                let hn = this.options.jPath ? Re.toString() : this.readonlyMatcher;
                let vn = this.options.attributeValueProcessor(Dt, bn, hn);
                He[Ct] = vn == null ? bn : typeof vn != typeof bn || vn !== bn ? vn : ve(bn, this.options.parseAttributeValue, this.options.numberParseOptions);
              } else {
                this.options.allowBooleanAttributes && (He[Ct] = true);
              }
            }
          }
          if (!Object.keys(He).length) {
            return;
          }
          if (this.options.attributesGroupName) {
            let mt = {};
            mt[this.options.attributesGroupName] = He;
            return mt;
          }
          return He;
        }
      }
      let be = function (Ee) {
        Ee = Ee.replace(/\r\n?/g, `
`);
        let Re = new P("!xml");
        let Ce = Re;
        let Fe = "";
        this.matcher.reset();
        this.entityExpansionCount = 0;
        this.currentExpandedLength = 0;
        let Xe = new F(this.options.processEntities);
        for (let He = 0; He < Ee.length; He++) {
          if (Ee[He] === "<") {
            if (Ee[He + 1] === "/") {
              let Gt = ce(Ee, ">", He, "Closing Tag is not closed.");
              let mt = Ee.substring(He + 2, Gt).trim();
              if (this.options.removeNSPrefix) {
                let jt = mt.indexOf(":");
                jt !== -1 && (mt = mt.substr(jt + 1));
              }
              mt = xe(this.options.transformTagName, mt, "", this.options).tagName;
              Ce && (Fe = this.saveTextToParentTag(Fe, Ce, this.readonlyMatcher));
              let Dt = this.matcher.getCurrentTag();
              if (mt && this.options.unpairedTags.indexOf(mt) !== -1) {
                throw Error(`Unpaired tag can not be used as closing tag: </${mt}>`);
              }
              Dt && this.options.unpairedTags.indexOf(Dt) !== -1 && (this.matcher.pop(), this.tagsNodeStack.pop());
              this.matcher.pop();
              this.isCurrentNodeStopNode = false;
              Ce = this.tagsNodeStack.pop();
              Fe = "";
              He = Gt;
            } else if (Ee[He + 1] === "?") {
              let Gt = le(Ee, He, false, "?>");
              if (!Gt) {
                throw Error("Pi Tag is not closed.");
              }
              if (Fe = this.saveTextToParentTag(Fe, Ce, this.readonlyMatcher), this.options.ignoreDeclaration && Gt.tagName === "?xml" || this.options.ignorePiTags) {
                ;
              } else {
                let mt = new P(Gt.tagName);
                mt.add(this.options.textNodeName, "");
                Gt.tagName !== Gt.tagExp && Gt.attrExpPresent && (mt[":@"] = this.buildAttributesMap(Gt.tagExp, this.matcher, Gt.tagName));
                this.addChild(Ce, mt, this.readonlyMatcher, He);
              }
              He = Gt.closeIndex + 1;
            } else if (Ee.substr(He + 1, 3) === "!--") {
              let Gt = ce(Ee, "-->", He + 4, "Comment is not closed.");
              if (this.options.commentPropName) {
                let mt = Ee.substring(He + 4, Gt - 2);
                Fe = this.saveTextToParentTag(Fe, Ce, this.readonlyMatcher);
                Ce.add(this.options.commentPropName, [{
                  [this.options.textNodeName]: mt
                }]);
              }
              He = Gt;
            } else if (Ee.substr(He + 1, 2) === "!D") {
              let Gt = Xe.readDocType(Ee, He);
              this.docTypeEntities = Gt.entities;
              He = Gt.i;
            } else if (Ee.substr(He + 1, 2) === "![") {
              let Gt = ce(Ee, "]]>", He, "CDATA is not closed.") - 2;
              let mt = Ee.substring(He + 9, Gt);
              Fe = this.saveTextToParentTag(Fe, Ce, this.readonlyMatcher);
              let Dt = this.parseTextData(mt, Ce.tagname, this.readonlyMatcher, true, false, true, true);
              Dt == null && (Dt = "");
              this.options.cdataPropName ? Ce.add(this.options.cdataPropName, [{
                [this.options.textNodeName]: mt
              }]) : Ce.add(this.options.textNodeName, Dt);
              He = Gt + 2;
            } else {
              let Gt = le(Ee, He, this.options.removeNSPrefix);
              if (!Gt) {
                let Nn = Ee.substring(Math.max(0, He - 50), Math.min(Ee.length, He + 50));
                throw Error(`readTagExp returned undefined at position ${He}. Context: "${Nn}"`);
              }
              let {
                tagName: mt,
                rawTagName: Dt,
                tagExp: jt,
                attrExpPresent: bn,
                closeIndex: Ct
              } = Gt;
              if ({
                tagName: mt,
                tagExp: jt
              } = xe(this.options.transformTagName, mt, jt, this.options), this.options.strictReservedNames && (mt === this.options.commentPropName || mt === this.options.cdataPropName || mt === this.options.textNodeName || mt === this.options.attributesGroupName)) {
                throw Error(`Invalid tag name: ${mt}`);
              }
              Ce && Fe && Ce.tagname !== "!xml" && (Fe = this.saveTextToParentTag(Fe, Ce, this.readonlyMatcher, false));
              let hn = Ce;
              hn && this.options.unpairedTags.indexOf(hn.tagname) !== -1 && (Ce = this.tagsNodeStack.pop(), this.matcher.pop());
              let vn = false;
              jt.length > 0 && jt.lastIndexOf("/") === jt.length - 1 && (vn = true, mt[mt.length - 1] === "/" ? (mt = mt.substr(0, mt.length - 1), jt = mt) : jt = jt.substr(0, jt.length - 1), bn = mt !== jt);
              let zn;
              let Pn = null;
              let Lr = {};
              zn = ne(Dt);
              mt !== Re.tagname && this.matcher.push(mt, {}, zn);
              mt !== jt && bn && (Pn = this.buildAttributesMap(jt, this.matcher, mt), Pn && (Lr = Z(Pn, this.options)));
              mt !== Re.tagname && (this.isCurrentNodeStopNode = this.isItStopNode(this.stopNodeExpressions, this.matcher));
              let ao = He;
              if (this.isCurrentNodeStopNode) {
                let Nn = "";
                if (vn) {
                  He = Gt.closeIndex;
                } else if (this.options.unpairedTags.indexOf(mt) !== -1) {
                  He = Gt.closeIndex;
                } else {
                  let To = this.readStopNodeData(Ee, Dt, Ct + 1);
                  if (!To) {
                    throw Error(`Unexpected end of ${Dt}`);
                  }
                  He = To.i;
                  Nn = To.tagContent;
                }
                let Tr = new P(mt);
                Pn && (Tr[":@"] = Pn);
                Tr.add(this.options.textNodeName, Nn);
                this.matcher.pop();
                this.isCurrentNodeStopNode = false;
                this.addChild(Ce, Tr, this.readonlyMatcher, ao);
              } else {
                if (vn) {
                  ({
                    tagName: mt,
                    tagExp: jt
                  } = xe(this.options.transformTagName, mt, jt, this.options));
                  let Nn = new P(mt);
                  Pn && (Nn[":@"] = Pn);
                  this.addChild(Ce, Nn, this.readonlyMatcher, ao);
                  this.matcher.pop();
                  this.isCurrentNodeStopNode = false;
                } else {
                  if (this.options.unpairedTags.indexOf(mt) !== -1) {
                    let Nn = new P(mt);
                    Pn && (Nn[":@"] = Pn);
                    this.addChild(Ce, Nn, this.readonlyMatcher, ao);
                    this.matcher.pop();
                    this.isCurrentNodeStopNode = false;
                    He = Gt.closeIndex;
                    continue;
                  }
                  {
                    let Nn = new P(mt);
                    if (this.tagsNodeStack.length > this.options.maxNestedTags) {
                      throw Error("Maximum nested tags exceeded");
                    }
                    this.tagsNodeStack.push(Ce);
                    Pn && (Nn[":@"] = Pn);
                    this.addChild(Ce, Nn, this.readonlyMatcher, ao);
                    Ce = Nn;
                  }
                }
                Fe = "";
                He = Ct;
              }
            }
          } else {
            Fe += Ee[He];
          }
        }
        return Re.child;
      };
      function fe(Ee, Re, Ce, Fe) {
        this.options.captureMetaData || (Fe = undefined);
        let Xe = this.options.jPath ? Ce.toString() : Ce;
        let He = this.options.updateTag(Re.tagname, Xe, Re[":@"]);
        He === false || (typeof He == "string" ? (Re.tagname = He, Ee.addChild(Re, Fe)) : Ee.addChild(Re, Fe));
      }
      function me(Ee, Re, Ce) {
        let Fe = this.options.processEntities;
        if (!Fe || !Fe.enabled) {
          return Ee;
        }
        if (Fe.allowedTags) {
          let Xe = this.options.jPath ? Ce.toString() : Ce;
          if (!(Array.isArray(Fe.allowedTags) ? Fe.allowedTags.includes(Re) : Fe.allowedTags(Re, Xe))) {
            return Ee;
          }
        }
        if (Fe.tagFilter) {
          let Xe = this.options.jPath ? Ce.toString() : Ce;
          if (!Fe.tagFilter(Re, Xe)) {
            return Ee;
          }
        }
        for (let Xe of Object.keys(this.docTypeEntities)) {
          let He = this.docTypeEntities[Xe];
          let Gt = Ee.match(He.regx);
          if (Gt) {
            if (this.entityExpansionCount += Gt.length, Fe.maxTotalExpansions && this.entityExpansionCount > Fe.maxTotalExpansions) {
              throw Error(`Entity expansion limit exceeded: ${this.entityExpansionCount} > ${Fe.maxTotalExpansions}`);
            }
            let mt = Ee.length;
            if (Ee = Ee.replace(He.regx, He.val), Fe.maxExpandedLength && (this.currentExpandedLength += Ee.length - mt, this.currentExpandedLength > Fe.maxExpandedLength)) {
              throw Error(`Total expanded content size exceeded: ${this.currentExpandedLength} > ${Fe.maxExpandedLength}`);
            }
          }
        }
        for (let Xe of Object.keys(this.lastEntities)) {
          let He = this.lastEntities[Xe];
          let Gt = Ee.match(He.regex);
          if (Gt && (this.entityExpansionCount += Gt.length, Fe.maxTotalExpansions && this.entityExpansionCount > Fe.maxTotalExpansions)) {
            throw Error(`Entity expansion limit exceeded: ${this.entityExpansionCount} > ${Fe.maxTotalExpansions}`);
          }
          Ee = Ee.replace(He.regex, He.val);
        }
        if (Ee.indexOf("&") === -1) {
          return Ee;
        }
        if (this.options.htmlEntities) {
          for (let Xe of Object.keys(this.htmlEntities)) {
            let He = this.htmlEntities[Xe];
            let Gt = Ee.match(He.regex);
            if (Gt && (this.entityExpansionCount += Gt.length, Fe.maxTotalExpansions && this.entityExpansionCount > Fe.maxTotalExpansions)) {
              throw Error(`Entity expansion limit exceeded: ${this.entityExpansionCount} > ${Fe.maxTotalExpansions}`);
            }
            Ee = Ee.replace(He.regex, He.val);
          }
        }
        return Ee.replace(this.ampEntity.regex, this.ampEntity.val);
      }
      function Te(Ee, Re, Ce, Fe) {
        Ee && (Fe === undefined && (Fe = Re.child.length === 0), (Ee = this.parseTextData(Ee, Re.tagname, Ce, false, !!Re[":@"] && Object.keys(Re[":@"]).length !== 0, Fe)) !== undefined && Ee !== "" && Re.add(this.options.textNodeName, Ee), Ee = "");
        return Ee;
      }
      function ue(Ee, Re) {
        if (!Ee || Ee.length === 0) {
          return false;
        }
        for (let Ce = 0; Ce < Ee.length; Ce++) {
          if (Re.matches(Ee[Ce])) {
            return true;
          }
        }
        return false;
      }
      function ce(Ee, Re, Ce, Fe) {
        let Xe = Ee.indexOf(Re, Ce);
        if (Xe === -1) {
          throw Error(Fe);
        }
        return Xe + Re.length - 1;
      }
      function le(Ee, Re, Ce, Fe = ">") {
        let Xe = function (Ct, hn, vn = ">") {
          let zn;
          let Pn = "";
          for (let Lr = hn; Lr < Ct.length; Lr++) {
            let ao = Ct[Lr];
            if (zn) {
              ao === zn && (zn = "");
            } else if (ao === '"' || ao === "'") {
              zn = ao;
            } else if (ao === vn[0]) {
              if (!vn[1]) {
                return {
                  data: Pn,
                  index: Lr
                };
              }
              if (Ct[Lr + 1] === vn[1]) {
                return {
                  data: Pn,
                  index: Lr
                };
              }
            } else {
              ao === "\t" && (ao = " ");
            }
            Pn += ao;
          }
        }(Ee, Re + 1, Fe);
        if (!Xe) {
          return;
        }
        let {
          data: He,
          index: Gt
        } = Xe;
        let mt = He.search(/\s/);
        let Dt = He;
        let jt = true;
        mt !== -1 && (Dt = He.substring(0, mt), He = He.substring(mt + 1).trimStart());
        let bn = Dt;
        if (Ce) {
          let Ct = Dt.indexOf(":");
          Ct !== -1 && (Dt = Dt.substr(Ct + 1), jt = Dt !== Xe.data.substr(Ct + 1));
        }
        return {
          tagName: Dt,
          tagExp: He,
          closeIndex: Gt,
          attrExpPresent: jt,
          rawTagName: bn
        };
      }
      function pe(Ee, Re, Ce) {
        let Fe = Ce;
        let Xe = 1;
        for (; Ce < Ee.length; Ce++) {
          if (Ee[Ce] === "<") {
            if (Ee[Ce + 1] === "/") {
              let He = ce(Ee, ">", Ce, `${Re} is not closed`);
              if (Ee.substring(Ce + 2, He).trim() === Re && (Xe--, Xe === 0)) {
                return {
                  tagContent: Ee.substring(Fe, Ce),
                  i: He
                };
              }
              Ce = He;
            } else if (Ee[Ce + 1] === "?") {
              Ce = ce(Ee, "?>", Ce + 1, "StopNode is not closed.");
            } else if (Ee.substr(Ce + 1, 3) === "!--") {
              Ce = ce(Ee, "-->", Ce + 3, "StopNode is not closed.");
            } else if (Ee.substr(Ce + 1, 2) === "![") {
              Ce = ce(Ee, "]]>", Ce, "StopNode is not closed.") - 2;
            } else {
              let He = le(Ee, Ce, ">");
              He && ((He && He.tagName) === Re && He.tagExp[He.tagExp.length - 1] !== "/" && Xe++, Ce = He.closeIndex);
            }
          }
        }
      }
      function ve(Ee, Re, Ce) {
        if (Re && typeof Ee == "string") {
          let Fe = Ee.trim();
          return Fe === "true" || Fe !== "false" && function (Xe, He = {}) {
            if (He = Object.assign({}, z, He), !Xe || typeof Xe != "string") {
              return Xe;
            }
            let Gt = Xe.trim();
            if (He.skipLike !== undefined && He.skipLike.test(Gt)) {
              return Xe;
            }
            if (Xe === "0") {
              return 0;
            }
            if (He.hex && W.test(Gt)) {
              return function (Dt) {
                if (parseInt) {
                  return parseInt(Dt, 16);
                }
                if (Number.parseInt) {
                  return Number.parseInt(Dt, 16);
                }
                if (window && window.parseInt) {
                  return window.parseInt(Dt, 16);
                }
                throw Error("parseInt, Number.parseInt, window.parseInt are not supported");
              }(Gt);
            }
            if (isFinite(Gt)) {
              if (Gt.includes("e") || Gt.includes("E")) {
                return function (Dt, jt, bn) {
                  if (!bn.eNotation) {
                    return Dt;
                  }
                  let Ct = jt.match(V);
                  if (Ct) {
                    let hn = Ct[1] || "";
                    let vn = Ct[3].indexOf("e") === -1 ? "E" : "e";
                    let zn = Ct[2];
                    let Pn = hn ? Dt[zn.length + 1] === vn : Dt[zn.length] === vn;
                    return zn.length > 1 && Pn ? Dt : (zn.length !== 1 || !Ct[3].startsWith(`.${vn}`) && Ct[3][0] !== vn) && zn.length > 0 ? bn.leadingZeros && !Pn ? (jt = (Ct[1] || "") + Ct[3], Number(jt)) : Dt : Number(jt);
                  }
                  return Dt;
                }(Xe, Gt, He);
              }
              {
                let Dt = j.exec(Gt);
                if (Dt) {
                  let jt = Dt[1] || "";
                  let bn = Dt[2];
                  let Ct = (mt = Dt[3]) && mt.indexOf(".") !== -1 ? ((mt = mt.replace(/0+$/, "")) === "." ? mt = "0" : mt[0] === "." ? mt = "0" + mt : mt[mt.length - 1] === "." && (mt = mt.substring(0, mt.length - 1)), mt) : mt;
                  let hn = jt ? Xe[bn.length + 1] === "." : Xe[bn.length] === ".";
                  if (!He.leadingZeros && (bn.length > 1 || bn.length === 1 && !hn)) {
                    return Xe;
                  }
                  {
                    let vn = Number(Gt);
                    let zn = String(vn);
                    if (vn === 0) {
                      return vn;
                    }
                    if (zn.search(/[eE]/) !== -1) {
                      return He.eNotation ? vn : Xe;
                    }
                    if (Gt.indexOf(".") !== -1) {
                      return zn === "0" || zn === Ct || zn === `${jt}${Ct}` ? vn : Xe;
                    }
                    let Pn = bn ? Ct : Gt;
                    return bn ? Pn === zn || jt + Pn === zn ? vn : Xe : Pn === zn || Pn === jt + zn ? vn : Xe;
                  }
                }
                return Xe;
              }
            }
            var mt;
            return function (Dt, jt, bn) {
              let Ct = jt === 1 / 0;
              switch (bn.infinity.toLowerCase()) {
                case "null":
                  return null;
                case "infinity":
                  return jt;
                case "string":
                  return Ct ? "Infinity" : "-Infinity";
                default:
                  return Dt;
              }
            }(Xe, Number(Gt), He);
          }(Ee, Ce);
        }
        return Ee !== undefined ? Ee : "";
      }
      function _e(Ee, Re, Ce) {
        let Fe = Number.parseInt(Ee, Re);
        return Fe >= 0 && Fe <= 1114111 ? String.fromCodePoint(Fe) : Ce + Ee + ";";
      }
      function xe(Ee, Re, Ce, Fe) {
        if (Ee) {
          let Xe = Ee(Re);
          Ce === Re && (Ce = Xe);
          Re = Xe;
        }
        return {
          tagName: Re = ke(Re, Fe),
          tagExp: Ce
        };
      }
      function ke(Ee, Re) {
        if (a.includes(Ee)) {
          throw Error(`[SECURITY] Invalid name: "${Ee}" is a reserved JavaScript keyword that could cause prototype pollution`);
        }
        return i.includes(Ee) ? Re.onDangerousProperty(Ee) : Ee;
      }
      let Ie = P.getMetaDataSymbol();
      function Ue(Ee, Re) {
        if (!Ee || typeof Ee != "object") {
          return {};
        }
        if (!Re) {
          return Ee;
        }
        let Ce = {};
        for (let Fe in Ee) {
          Fe.startsWith(Re) ? Ce[Fe.substring(Re.length)] = Ee[Fe] : Ce[Fe] = Ee[Fe];
        }
        return Ce;
      }
      function Ge(Ee, Re, Ce, Fe) {
        return Be(Ee, Re, Ce, Fe);
      }
      function Be(Ee, Re, Ce, Fe) {
        let Xe;
        let He = {};
        for (let Gt = 0; Gt < Ee.length; Gt++) {
          let mt = Ee[Gt];
          let Dt = We(mt);
          if (Dt !== undefined && Dt !== Re.textNodeName) {
            let jt = Ue(mt[":@"] || {}, Re.attributeNamePrefix);
            Ce.push(Dt, jt);
          }
          if (Dt === Re.textNodeName) {
            Xe === undefined ? Xe = mt[Dt] : Xe += "" + mt[Dt];
          } else {
            if (Dt === undefined) {
              continue;
            }
            if (mt[Dt]) {
              let jt = Be(mt[Dt], Re, Ce, Fe);
              let bn = Tt(jt, Re);
              if (mt[":@"] ? Ze(jt, mt[":@"], Fe, Re) : Object.keys(jt).length !== 1 || jt[Re.textNodeName] === undefined || Re.alwaysCreateTextNode ? Object.keys(jt).length === 0 && (Re.alwaysCreateTextNode ? jt[Re.textNodeName] = "" : jt = "") : jt = jt[Re.textNodeName], mt[Ie] !== undefined && typeof jt == "object" && jt !== null && (jt[Ie] = mt[Ie]), He[Dt] !== undefined && Object.prototype.hasOwnProperty.call(He, Dt)) {
                Array.isArray(He[Dt]) || (He[Dt] = [He[Dt]]);
                He[Dt].push(jt);
              } else {
                let Ct = Re.jPath ? Fe.toString() : Fe;
                Re.isArray(Dt, Ct, bn) ? He[Dt] = [jt] : He[Dt] = jt;
              }
              Dt !== undefined && Dt !== Re.textNodeName && Ce.pop();
            }
          }
        }
        typeof Xe == "string" ? Xe.length > 0 && (He[Re.textNodeName] = Xe) : Xe !== undefined && (He[Re.textNodeName] = Xe);
        return He;
      }
      function We(Ee) {
        let Re = Object.keys(Ee);
        for (let Ce = 0; Ce < Re.length; Ce++) {
          let Fe = Re[Ce];
          if (Fe !== ":@") {
            return Fe;
          }
        }
      }
      function Ze(Ee, Re, Ce, Fe) {
        if (Re) {
          let Xe = Object.keys(Re);
          let He = Xe.length;
          for (let Gt = 0; Gt < He; Gt++) {
            let mt = Xe[Gt];
            let Dt = mt.startsWith(Fe.attributeNamePrefix) ? mt.substring(Fe.attributeNamePrefix.length) : mt;
            let jt = Fe.jPath ? Ce.toString() + "." + Dt : Ce;
            Fe.isArray(mt, jt, true, true) ? Ee[mt] = [Re[mt]] : Ee[mt] = Re[mt];
          }
        }
      }
      function Tt(Ee, Re) {
        let {
          textNodeName: Ce
        } = Re;
        let Fe = Object.keys(Ee).length;
        return Fe === 0 || !(Fe !== 1 || !Ee[Ce] && typeof Ee[Ce] != "boolean" && Ee[Ce] !== 0);
      }
      class kt {
        constructor(Ee) {
          this.externalEntities = {};
          this.options = M(Ee);
        }
        parse(Ee, Re) {
          if (typeof Ee != "string" && Ee.toString) {
            Ee = Ee.toString();
          } else if (typeof Ee != "string") {
            throw Error("XML data is accepted in String or Bytes[] form.");
          }
          if (Re) {
            Re === true && (Re = {});
            let Xe = c(Ee, Re);
            if (Xe !== true) {
              throw Error(`${Xe.err.msg}:${Xe.err.line}:${Xe.err.col}`);
            }
          }
          let Ce = new oe(this.options);
          Ce.addExternalEntities(this.externalEntities);
          let Fe = Ce.parseXml(Ee);
          return this.options.preserveOrder || Fe === undefined ? Fe : Ge(Fe, this.options, Ce.matcher, Ce.readonlyMatcher);
        }
        addEntity(Ee, Re) {
          if (Re.indexOf("&") !== -1) {
            throw Error("Entity value can't have '&'");
          }
          if (Ee.indexOf("&") !== -1 || Ee.indexOf(";") !== -1) {
            throw Error("An entity must be set without '&' and ';'. Eg. use '#xD' for '&#xD;'");
          }
          if (Re === "&") {
            throw Error("An entity with value '&' is not permitted");
          }
          this.externalEntities[Ee] = Re;
        }
        static getMetaDataSymbol() {
          return P.getMetaDataSymbol();
        }
      }
      function Ye(Ee, Re) {
        let Ce = "";
        Re.format && Re.indentBy.length > 0 && (Ce = `
`);
        let Fe = [];
        if (Re.stopNodes && Array.isArray(Re.stopNodes)) {
          for (let Xe = 0; Xe < Re.stopNodes.length; Xe++) {
            let He = Re.stopNodes[Xe];
            typeof He == "string" ? Fe.push(new Q(He)) : He instanceof Q && Fe.push(He);
          }
        }
        return ht(Ee, Re, Ce, new J(), Fe);
      }
      function ht(Ee, Re, Ce, Fe, Xe) {
        let He = "";
        let Gt = false;
        if (Re.maxNestedTags && Fe.getDepth() > Re.maxNestedTags) {
          throw Error("Maximum nested tags exceeded");
        }
        if (!Array.isArray(Ee)) {
          if (Ee != null) {
            let mt = Ee.toString();
            mt = Ft(mt, Re);
            return mt;
          }
          return "";
        }
        for (let mt = 0; mt < Ee.length; mt++) {
          let Dt = Ee[mt];
          let jt = vt(Dt);
          if (jt === undefined) {
            continue;
          }
          let bn = It(Dt[":@"], Re);
          Fe.push(jt, bn);
          let Ct = gt(Fe, Xe);
          if (jt === Re.textNodeName) {
            let Pn = Dt[jt];
            Ct || (Pn = Re.tagValueProcessor(jt, Pn), Pn = Ft(Pn, Re));
            Gt && (He += Ce);
            He += Pn;
            Gt = false;
            Fe.pop();
            continue;
          }
          if (jt === Re.cdataPropName) {
            Gt && (He += Ce);
            He += `<![CDATA[${Dt[jt][0][Re.textNodeName]}]]>`;
            Gt = false;
            Fe.pop();
            continue;
          }
          if (jt === Re.commentPropName) {
            He += Ce + `<!--${Dt[jt][0][Re.textNodeName]}-->`;
            Gt = true;
            Fe.pop();
            continue;
          }
          if (jt[0] === "?") {
            let Pn = yt(Dt[":@"], Re, Ct);
            let Lr = jt === "?xml" ? "" : Ce;
            let ao = Dt[jt][0][Re.textNodeName];
            ao = ao.length !== 0 ? " " + ao : "";
            He += Lr + `<${jt}${ao}${Pn}?>`;
            Gt = true;
            Fe.pop();
            continue;
          }
          let hn = Ce;
          hn !== "" && (hn += Re.indentBy);
          let vn = Ce + `<${jt}${yt(Dt[":@"], Re, Ct)}`;
          let zn;
          zn = Ct ? Rt(Dt[jt], Re) : ht(Dt[jt], Re, hn, Fe, Xe);
          Re.unpairedTags.indexOf(jt) !== -1 ? Re.suppressUnpairedNode ? He += vn + ">" : He += vn + "/>" : zn && zn.length !== 0 || !Re.suppressEmptyNode ? zn && zn.endsWith(">") ? He += vn + `>${zn}${Ce}</${jt}>` : (He += vn + ">", zn && Ce !== "" && (zn.includes("/>") || zn.includes("</")) ? He += Ce + Re.indentBy + zn + Ce : He += zn, He += `</${jt}>`) : He += vn + "/>";
          Gt = true;
          Fe.pop();
        }
        return He;
      }
      function It(Ee, Re) {
        if (!Ee || Re.ignoreAttributes) {
          return null;
        }
        let Ce = {};
        let Fe = false;
        for (let Xe in Ee) {
          Object.prototype.hasOwnProperty.call(Ee, Xe) && (Ce[Xe.startsWith(Re.attributeNamePrefix) ? Xe.substr(Re.attributeNamePrefix.length) : Xe] = Ee[Xe], Fe = true);
        }
        return Fe ? Ce : null;
      }
      function Rt(Ee, Re) {
        if (!Array.isArray(Ee)) {
          return Ee != null ? Ee.toString() : "";
        }
        let Ce = "";
        for (let Fe = 0; Fe < Ee.length; Fe++) {
          let Xe = Ee[Fe];
          let He = vt(Xe);
          if (He === Re.textNodeName) {
            Ce += Xe[He];
          } else if (He === Re.cdataPropName) {
            Ce += Xe[He][0][Re.textNodeName];
          } else if (He === Re.commentPropName) {
            Ce += Xe[He][0][Re.textNodeName];
          } else {
            if (He && He[0] === "?") {
              continue;
            }
            if (He) {
              let Gt = wt(Xe[":@"], Re);
              let mt = Rt(Xe[He], Re);
              mt && mt.length !== 0 ? Ce += `<${He}${Gt}>${mt}</${He}>` : Ce += `<${He}${Gt}/>`;
            }
          }
        }
        return Ce;
      }
      function wt(Ee, Re) {
        let Ce = "";
        if (Ee && !Re.ignoreAttributes) {
          for (let Fe in Ee) {
            if (!Object.prototype.hasOwnProperty.call(Ee, Fe)) {
              continue;
            }
            let Xe = Ee[Fe];
            Xe === true && Re.suppressBooleanAttributes ? Ce += ` ${Fe.substr(Re.attributeNamePrefix.length)}` : Ce += ` ${Fe.substr(Re.attributeNamePrefix.length)}="${Xe}"`;
          }
        }
        return Ce;
      }
      function vt(Ee) {
        let Re = Object.keys(Ee);
        for (let Ce = 0; Ce < Re.length; Ce++) {
          let Fe = Re[Ce];
          if (Object.prototype.hasOwnProperty.call(Ee, Fe) && Fe !== ":@") {
            return Fe;
          }
        }
      }
      function yt(Ee, Re, Ce) {
        let Fe = "";
        if (Ee && !Re.ignoreAttributes) {
          for (let Xe in Ee) {
            if (!Object.prototype.hasOwnProperty.call(Ee, Xe)) {
              continue;
            }
            let He;
            Ce ? He = Ee[Xe] : (He = Re.attributeValueProcessor(Xe, Ee[Xe]), He = Ft(He, Re));
            He === true && Re.suppressBooleanAttributes ? Fe += ` ${Xe.substr(Re.attributeNamePrefix.length)}` : Fe += ` ${Xe.substr(Re.attributeNamePrefix.length)}="${He}"`;
          }
        }
        return Fe;
      }
      function gt(Ee, Re) {
        if (!Re || Re.length === 0) {
          return false;
        }
        for (let Ce = 0; Ce < Re.length; Ce++) {
          if (Ee.matches(Re[Ce])) {
            return true;
          }
        }
        return false;
      }
      function Ft(Ee, Re) {
        if (Ee && Ee.length > 0 && Re.processEntities) {
          for (let Ce = 0; Ce < Re.entities.length; Ce++) {
            let Fe = Re.entities[Ce];
            Ee = Ee.replace(Fe.regex, Fe.val);
          }
        }
        return Ee;
      }
      let on = {
        attributeNamePrefix: "@_",
        attributesGroupName: false,
        textNodeName: "#text",
        ignoreAttributes: true,
        cdataPropName: false,
        format: false,
        indentBy: "  ",
        suppressEmptyNode: false,
        suppressUnpairedNode: true,
        suppressBooleanAttributes: true,
        tagValueProcessor: function (Ee, Re) {
          return Re;
        },
        attributeValueProcessor: function (Ee, Re) {
          return Re;
        },
        preserveOrder: false,
        commentPropName: false,
        unpairedTags: [],
        entities: [{
          regex: new RegExp("&", "g"),
          val: "&amp;"
        }, {
          regex: new RegExp(">", "g"),
          val: "&gt;"
        }, {
          regex: new RegExp("<", "g"),
          val: "&lt;"
        }, {
          regex: new RegExp("'", "g"),
          val: "&apos;"
        }, {
          regex: new RegExp('"', "g"),
          val: "&quot;"
        }],
        processEntities: true,
        stopNodes: [],
        oneListGroup: false,
        maxNestedTags: 100,
        jPath: true
      };
      function rn(Ee) {
        if (this.options = Object.assign({}, on, Ee), this.options.stopNodes && Array.isArray(this.options.stopNodes) && (this.options.stopNodes = this.options.stopNodes.map(Ce => typeof Ce == "string" && Ce.startsWith("*.") ? ".." + Ce.substring(2) : Ce)), this.stopNodeExpressions = [], this.options.stopNodes && Array.isArray(this.options.stopNodes)) {
          for (let Ce = 0; Ce < this.options.stopNodes.length; Ce++) {
            let Fe = this.options.stopNodes[Ce];
            typeof Fe == "string" ? this.stopNodeExpressions.push(new Q(Fe)) : Fe instanceof Q && this.stopNodeExpressions.push(Fe);
          }
        }
        var Re;
        this.options.ignoreAttributes === true || this.options.attributesGroupName ? this.isAttribute = function () {
          return false;
        } : (this.ignoreAttributesFn = typeof (Re = this.options.ignoreAttributes) == "function" ? Re : Array.isArray(Re) ? Ce => {
          for (let Fe of Re) {
            if (typeof Fe == "string" && Ce === Fe) {
              return true;
            }
            if (Fe instanceof RegExp && Fe.test(Ce)) {
              return true;
            }
          }
        } : () => false, this.attrPrefixLen = this.options.attributeNamePrefix.length, this.isAttribute = Xr);
        this.processTextOrObjNode = Sn;
        this.options.format ? (this.indentate = jn, this.tagEndChar = `>
`, this.newLine = `
`) : (this.indentate = function () {
          return "";
        }, this.tagEndChar = ">", this.newLine = "");
      }
      function Sn(Ee, Re, Ce, Fe) {
        let Xe = this.extractAttributes(Ee);
        if (Fe.push(Re, Xe), this.checkStopNode(Fe)) {
          let Gt = this.buildRawContent(Ee);
          let mt = this.buildAttributesForStopNode(Ee);
          Fe.pop();
          return this.buildObjectNode(Gt, Re, mt, Ce);
        }
        let He = this.j2x(Ee, Ce + 1, Fe);
        Fe.pop();
        return Ee[this.options.textNodeName] !== undefined && Object.keys(Ee).length === 1 ? this.buildTextValNode(Ee[this.options.textNodeName], Re, He.attrStr, Ce, Fe) : this.buildObjectNode(He.val, Re, He.attrStr, Ce);
      }
      function jn(Ee) {
        return this.options.indentBy.repeat(Ee);
      }
      function Xr(Ee) {
        return !(!Ee.startsWith(this.options.attributeNamePrefix) || Ee === this.options.textNodeName) && Ee.substr(this.attrPrefixLen);
      }
      rn.prototype.build = function (Ee) {
        if (this.options.preserveOrder) {
          return Ye(Ee, this.options);
        }
        {
          Array.isArray(Ee) && this.options.arrayNodeName && this.options.arrayNodeName.length > 1 && (Ee = {
            [this.options.arrayNodeName]: Ee
          });
          let Re = new J();
          return this.j2x(Ee, 0, Re).val;
        }
      };
      rn.prototype.j2x = function (Ee, Re, Ce) {
        let Fe = "";
        let Xe = "";
        if (this.options.maxNestedTags && Ce.getDepth() >= this.options.maxNestedTags) {
          throw Error("Maximum nested tags exceeded");
        }
        let He = this.options.jPath ? Ce.toString() : Ce;
        let Gt = this.checkStopNode(Ce);
        for (let mt in Ee) {
          if (Object.prototype.hasOwnProperty.call(Ee, mt)) {
            if (Ee[mt] === undefined) {
              this.isAttribute(mt) && (Xe += "");
            } else if (Ee[mt] === null) {
              this.isAttribute(mt) || mt === this.options.cdataPropName ? Xe += "" : mt[0] === "?" ? Xe += this.indentate(Re) + "<" + mt + "?" + this.tagEndChar : Xe += this.indentate(Re) + "<" + mt + "/" + this.tagEndChar;
            } else if (Ee[mt] instanceof Date) {
              Xe += this.buildTextValNode(Ee[mt], mt, "", Re, Ce);
            } else if (typeof Ee[mt] != "object") {
              let Dt = this.isAttribute(mt);
              if (Dt && !this.ignoreAttributesFn(Dt, He)) {
                Fe += this.buildAttrPairStr(Dt, "" + Ee[mt], Gt);
              } else if (!Dt) {
                if (mt === this.options.textNodeName) {
                  let jt = this.options.tagValueProcessor(mt, "" + Ee[mt]);
                  Xe += this.replaceEntitiesValue(jt);
                } else {
                  Ce.push(mt);
                  let jt = this.checkStopNode(Ce);
                  if (Ce.pop(), jt) {
                    let bn = "" + Ee[mt];
                    Xe += bn === "" ? this.indentate(Re) + "<" + mt + this.closeTag(mt) + this.tagEndChar : this.indentate(Re) + "<" + mt + ">" + bn + "</" + mt + this.tagEndChar;
                  } else {
                    Xe += this.buildTextValNode(Ee[mt], mt, "", Re, Ce);
                  }
                }
              }
            } else if (Array.isArray(Ee[mt])) {
              let Dt = Ee[mt].length;
              let jt = "";
              let bn = "";
              for (let Ct = 0; Ct < Dt; Ct++) {
                let hn = Ee[mt][Ct];
                if (hn === undefined) {
                  ;
                } else if (hn === null) {
                  mt[0] === "?" ? Xe += this.indentate(Re) + "<" + mt + "?" + this.tagEndChar : Xe += this.indentate(Re) + "<" + mt + "/" + this.tagEndChar;
                } else if (typeof hn == "object") {
                  if (this.options.oneListGroup) {
                    Ce.push(mt);
                    let vn = this.j2x(hn, Re + 1, Ce);
                    Ce.pop();
                    jt += vn.val;
                    this.options.attributesGroupName && hn.hasOwnProperty(this.options.attributesGroupName) && (bn += vn.attrStr);
                  } else {
                    jt += this.processTextOrObjNode(hn, mt, Re, Ce);
                  }
                } else if (this.options.oneListGroup) {
                  let vn = this.options.tagValueProcessor(mt, hn);
                  vn = this.replaceEntitiesValue(vn);
                  jt += vn;
                } else {
                  Ce.push(mt);
                  let vn = this.checkStopNode(Ce);
                  if (Ce.pop(), vn) {
                    let zn = "" + hn;
                    jt += zn === "" ? this.indentate(Re) + "<" + mt + this.closeTag(mt) + this.tagEndChar : this.indentate(Re) + "<" + mt + ">" + zn + "</" + mt + this.tagEndChar;
                  } else {
                    jt += this.buildTextValNode(hn, mt, "", Re, Ce);
                  }
                }
              }
              this.options.oneListGroup && (jt = this.buildObjectNode(jt, mt, bn, Re));
              Xe += jt;
            } else if (this.options.attributesGroupName && mt === this.options.attributesGroupName) {
              let Dt = Object.keys(Ee[mt]);
              let jt = Dt.length;
              for (let bn = 0; bn < jt; bn++) {
                Fe += this.buildAttrPairStr(Dt[bn], "" + Ee[mt][Dt[bn]], Gt);
              }
            } else {
              Xe += this.processTextOrObjNode(Ee[mt], mt, Re, Ce);
            }
          }
        }
        return {
          attrStr: Fe,
          val: Xe
        };
      };
      rn.prototype.buildAttrPairStr = function (Ee, Re, Ce) {
        Ce || (Re = this.options.attributeValueProcessor(Ee, "" + Re), Re = this.replaceEntitiesValue(Re));
        return this.options.suppressBooleanAttributes && Re === "true" ? " " + Ee : " " + Ee + '="' + Re + '"';
      };
      rn.prototype.extractAttributes = function (Ee) {
        if (!Ee || typeof Ee != "object") {
          return null;
        }
        let Re = {};
        let Ce = false;
        if (this.options.attributesGroupName && Ee[this.options.attributesGroupName]) {
          let Fe = Ee[this.options.attributesGroupName];
          for (let Xe in Fe) {
            Object.prototype.hasOwnProperty.call(Fe, Xe) && (Re[Xe.startsWith(this.options.attributeNamePrefix) ? Xe.substring(this.options.attributeNamePrefix.length) : Xe] = Fe[Xe], Ce = true);
          }
        } else {
          for (let Fe in Ee) {
            if (!Object.prototype.hasOwnProperty.call(Ee, Fe)) {
              continue;
            }
            let Xe = this.isAttribute(Fe);
            Xe && (Re[Xe] = Ee[Fe], Ce = true);
          }
        }
        return Ce ? Re : null;
      };
      rn.prototype.buildRawContent = function (Ee) {
        if (typeof Ee == "string") {
          return Ee;
        }
        if (typeof Ee != "object" || Ee === null) {
          return String(Ee);
        }
        if (Ee[this.options.textNodeName] !== undefined) {
          return Ee[this.options.textNodeName];
        }
        let Re = "";
        for (let Ce in Ee) {
          if (!Object.prototype.hasOwnProperty.call(Ee, Ce)) {
            continue;
          }
          if (this.isAttribute(Ce)) {
            continue;
          }
          if (this.options.attributesGroupName && Ce === this.options.attributesGroupName) {
            continue;
          }
          let Fe = Ee[Ce];
          if (Ce === this.options.textNodeName) {
            Re += Fe;
          } else if (Array.isArray(Fe)) {
            for (let Xe of Fe) {
              if (typeof Xe == "string" || typeof Xe == "number") {
                Re += `<${Ce}>${Xe}</${Ce}>`;
              } else if (typeof Xe == "object" && Xe !== null) {
                let He = this.buildRawContent(Xe);
                let Gt = this.buildAttributesForStopNode(Xe);
                Re += He === "" ? `<${Ce}${Gt}/>` : `<${Ce}${Gt}>${He}</${Ce}>`;
              }
            }
          } else if (typeof Fe == "object" && Fe !== null) {
            let Xe = this.buildRawContent(Fe);
            let He = this.buildAttributesForStopNode(Fe);
            Re += Xe === "" ? `<${Ce}${He}/>` : `<${Ce}${He}>${Xe}</${Ce}>`;
          } else {
            Re += `<${Ce}>${Fe}</${Ce}>`;
          }
        }
        return Re;
      };
      rn.prototype.buildAttributesForStopNode = function (Ee) {
        if (!Ee || typeof Ee != "object") {
          return "";
        }
        let Re = "";
        if (this.options.attributesGroupName && Ee[this.options.attributesGroupName]) {
          let Ce = Ee[this.options.attributesGroupName];
          for (let Fe in Ce) {
            if (!Object.prototype.hasOwnProperty.call(Ce, Fe)) {
              continue;
            }
            let Xe = Fe.startsWith(this.options.attributeNamePrefix) ? Fe.substring(this.options.attributeNamePrefix.length) : Fe;
            let He = Ce[Fe];
            He === true && this.options.suppressBooleanAttributes ? Re += " " + Xe : Re += " " + Xe + '="' + He + '"';
          }
        } else {
          for (let Ce in Ee) {
            if (!Object.prototype.hasOwnProperty.call(Ee, Ce)) {
              continue;
            }
            let Fe = this.isAttribute(Ce);
            if (Fe) {
              let Xe = Ee[Ce];
              Xe === true && this.options.suppressBooleanAttributes ? Re += " " + Fe : Re += " " + Fe + '="' + Xe + '"';
            }
          }
        }
        return Re;
      };
      rn.prototype.buildObjectNode = function (Ee, Re, Ce, Fe) {
        if (Ee === "") {
          return Re[0] === "?" ? this.indentate(Fe) + "<" + Re + Ce + "?" + this.tagEndChar : this.indentate(Fe) + "<" + Re + Ce + this.closeTag(Re) + this.tagEndChar;
        }
        {
          let Xe = "</" + Re + this.tagEndChar;
          let He = "";
          Re[0] === "?" && (He = "?", Xe = "");
          return !Ce && Ce !== "" || Ee.indexOf("<") !== -1 ? this.options.commentPropName !== false && Re === this.options.commentPropName && He.length === 0 ? this.indentate(Fe) + `<!--${Ee}-->` + this.newLine : this.indentate(Fe) + "<" + Re + Ce + He + this.tagEndChar + Ee + this.indentate(Fe) + Xe : this.indentate(Fe) + "<" + Re + Ce + He + ">" + Ee + Xe;
        }
      };
      rn.prototype.closeTag = function (Ee) {
        let Re = "";
        this.options.unpairedTags.indexOf(Ee) !== -1 ? this.options.suppressUnpairedNode || (Re = "/") : Re = this.options.suppressEmptyNode ? "/" : `></${Ee}`;
        return Re;
      };
      rn.prototype.checkStopNode = function (Ee) {
        if (!this.stopNodeExpressions || this.stopNodeExpressions.length === 0) {
          return false;
        }
        for (let Re = 0; Re < this.stopNodeExpressions.length; Re++) {
          if (Ee.matches(this.stopNodeExpressions[Re])) {
            return true;
          }
        }
        return false;
      };
      rn.prototype.buildTextValNode = function (Ee, Re, Ce, Fe, Xe) {
        if (this.options.cdataPropName !== false && Re === this.options.cdataPropName) {
          return this.indentate(Fe) + `<![CDATA[${Ee}]]>` + this.newLine;
        }
        if (this.options.commentPropName !== false && Re === this.options.commentPropName) {
          return this.indentate(Fe) + `<!--${Ee}-->` + this.newLine;
        }
        if (Re[0] === "?") {
          return this.indentate(Fe) + "<" + Re + Ce + "?" + this.tagEndChar;
        }
        {
          let He = this.options.tagValueProcessor(Re, Ee);
          He = this.replaceEntitiesValue(He);
          return He === "" ? this.indentate(Fe) + "<" + Re + Ce + this.closeTag(Re) + this.tagEndChar : this.indentate(Fe) + "<" + Re + Ce + ">" + He + "</" + Re + this.tagEndChar;
        }
      };
      rn.prototype.replaceEntitiesValue = function (Ee) {
        if (Ee && Ee.length > 0 && this.options.processEntities) {
          for (let Re = 0; Re < this.options.entities.length; Re++) {
            let Ce = this.options.entities[Re];
            Ee = Ee.replace(Ce.regex, Ce.val);
          }
        }
        return Ee;
      };
      let co = rn;
      let Yt = {
        validate: c
      };
      D2s.exports = t;
    })();
  });
  var N2s = __commonJS(tBr => {
    Object.defineProperty(tBr, "__esModule", {
      value: true
    });
    tBr.parseXML = aYu;
    var iYu = M2s();
    var eBr = new iYu.XMLParser({
      attributeNamePrefix: "",
      htmlEntities: true,
      ignoreAttributes: false,
      ignoreDeclaration: true,
      parseTagValue: false,
      trimValues: false,
      tagValueProcessor: (e, t) => t.trim() === "" && t.includes(`
`) ? "" : undefined
    });
    eBr.addEntity("#xD", "\r");
    eBr.addEntity("#10", `
`);
    function aYu(e) {
      return eBr.parse(e, true);
    }
  });
  var rBr = __commonJS(Rbn => {
    var lYu = N2s();
    function cYu(e) {
      return e.replace(/&/g, "&amp;").replace(/</g, "&lt;").replace(/>/g, "&gt;").replace(/"/g, "&quot;");
    }
    function uYu(e) {
      return e.replace(/&/g, "&amp;").replace(/"/g, "&quot;").replace(/'/g, "&apos;").replace(/</g, "&lt;").replace(/>/g, "&gt;").replace(/\r/g, "&#x0D;").replace(/\n/g, "&#x0A;").replace(/\u0085/g, "&#x85;").replace(/\u2028/, "&#x2028;");
    }
    class nBr {
      value;
      constructor(e) {
        this.value = e;
      }
      toString() {
        return uYu("" + this.value);
      }
    }
    class FNt {
      name;
      children;
      attributes = {};
      static of(e, t, n) {
        let r = new FNt(e);
        if (t !== undefined) {
          r.addChildNode(new nBr(t));
        }
        if (n !== undefined) {
          r.withName(n);
        }
        return r;
      }
      constructor(e, t = []) {
        this.name = e;
        this.children = t;
      }
      withName(e) {
        this.name = e;
        return this;
      }
      addAttribute(e, t) {
        this.attributes[e] = t;
        return this;
      }
      addChildNode(e) {
        this.children.push(e);
        return this;
      }
      removeAttribute(e) {
        delete this.attributes[e];
        return this;
      }
      n(e) {
        this.name = e;
        return this;
      }
      c(e) {
        this.children.push(e);
        return this;
      }
      a(e, t) {
        if (t != null) {
          this.attributes[e] = t;
        }
        return this;
      }
      cc(e, t, n = t) {
        if (e[t] != null) {
          let r = FNt.of(t, e[t]).withName(n);
          this.c(r);
        }
      }
      l(e, t, n, r) {
        if (e[t] != null) {
          r().map(s => {
            s.withName(n);
            this.c(s);
          });
        }
      }
      lc(e, t, n, r) {
        if (e[t] != null) {
          let o = r();
          let s = new FNt(n);
          o.map(i => {
            s.c(i);
          });
          this.c(s);
        }
      }
      toString() {
        let e = Boolean(this.children.length);
        let t = `<${this.name}`;
        let n = this.attributes;
        for (let r of Object.keys(n)) {
          let o = n[r];
          if (o != null) {
            t += ` ${r}="${cYu("" + o)}"`;
          }
        }
        return t += !e ? "/>" : `>${this.children.map(r => r.toString()).join("")}</${this.name}>`;
      }
    }
    Object.defineProperty(Rbn, "parseXML", {
      enumerable: true,
      get: function () {
        return lYu.parseXML;
      }
    });
    Rbn.XmlNode = FNt;
    Rbn.XmlText = nBr;
  });
  var nw = __commonJS(Ef => {
    var sBr = ebn();
    var mAe = Od();
    var L2s = wy();
    var dYu = UP();
    var F2s = SUr();
    var U2s = jUr();
    var tT = qT();
    var Jye = YUr();
    var gF = tw();
    var jN = yW();
    var BNt = ZUr();
    var G2s = jT();
    var EY = rBr();
    var oBr = {
      warningEmitted: false
    };
    var pYu = e => {
      if (e && !oBr.warningEmitted && parseInt(e.substring(1, e.indexOf("."))) < 18) {
        oBr.warningEmitted = true;
        process.emitWarning(`NodeDeprecationWarning: The AWS SDK for JavaScript (v3) will
no longer support Node.js 16.x on January 6, 2025.

To continue receiving updates to AWS services, bug fixes, and security
updates please upgrade to a supported Node.js LTS version.

More information can be found at: https://a.co/74kJMmI`);
      }
    };
    function mYu(e, t, n) {
      if (!e.$source) {
        e.$source = {};
      }
      e.$source[t] = n;
      return e;
    }
    function fYu(e, t, n) {
      if (!e.__aws_sdk_context) {
        e.__aws_sdk_context = {
          features: {}
        };
      } else if (!e.__aws_sdk_context.features) {
        e.__aws_sdk_context.features = {};
      }
      e.__aws_sdk_context.features[t] = n;
    }
    function hYu(e, t, n) {
      if (!e.$source) {
        e.$source = {};
      }
      e.$source[t] = n;
      return e;
    }
    var B2s = e => sBr.HttpResponse.isInstance(e) ? e.headers?.date ?? e.headers?.Date : undefined;
    var iBr = e => new Date(Date.now() + e);
    var gYu = (e, t) => Math.abs(iBr(t).getTime() - e) >= 300000;
    var $2s = (e, t) => {
      let n = Date.parse(e);
      if (gYu(n, t)) {
        return n - Date.now();
      }
      return t;
    };
    var UNt = (e, t) => {
      if (!t) {
        throw Error(`Property \`${e}\` is not resolved for AWS SDK SigV4Auth`);
      }
      return t;
    };
    var aBr = async e => {
      let t = UNt("context", e.context);
      let n = UNt("config", e.config);
      let r = t.endpointV2?.properties?.authSchemes?.[0];
      let s = await UNt("signer", n.signer)(r);
      let i = e?.signingRegion;
      let a = e?.signingRegionSet;
      let l = e?.signingName;
      return {
        config: n,
        signer: s,
        signingRegion: i,
        signingRegionSet: a,
        signingName: l
      };
    };
    class xbn {
      async sign(e, t, n) {
        if (!sBr.HttpRequest.isInstance(e)) {
          throw Error("The request is not an instance of `HttpRequest` and cannot be signed");
        }
        let r = await aBr(n);
        let {
          config: o,
          signer: s
        } = r;
        let {
          signingRegion: i,
          signingName: a
        } = r;
        let l = n.context;
        if (l?.authSchemes?.length ?? false) {
          let [u, d] = l.authSchemes;
          if (u?.name === "sigv4a" && d?.name === "sigv4") {
            i = d?.signingRegion ?? i;
            a = d?.signingName ?? a;
          }
        }
        return await s.sign(e, {
          signingDate: iBr(o.systemClockOffset),
          signingRegion: i,
          signingService: a
        });
      }
      errorHandler(e) {
        return t => {
          let n = t.ServerTime ?? B2s(t.$response);
          if (n) {
            let r = UNt("config", e.config);
            let o = r.systemClockOffset;
            if (r.systemClockOffset = $2s(n, r.systemClockOffset), r.systemClockOffset !== o && t.$metadata) {
              t.$metadata.clockSkewCorrected = true;
            }
          }
          throw t;
        };
      }
      successHandler(e, t) {
        let n = B2s(e);
        if (n) {
          let r = UNt("config", t.config);
          r.systemClockOffset = $2s(n, r.systemClockOffset);
        }
      }
    }
    var yYu = xbn;
    class V2s extends xbn {
      async sign(e, t, n) {
        if (!sBr.HttpRequest.isInstance(e)) {
          throw Error("The request is not an instance of `HttpRequest` and cannot be signed");
        }
        let {
          config: r,
          signer: o,
          signingRegion: s,
          signingRegionSet: i,
          signingName: a
        } = await aBr(n);
        let c = ((await r.sigv4aSigningRegionSet?.()) ?? i ?? [s]).join(",");
        return await o.sign(e, {
          signingDate: iBr(r.systemClockOffset),
          signingRegion: c,
          signingService: a
        });
      }
    }
    var H2s = e => typeof e === "string" && e.length > 0 ? e.split(",").map(t => t.trim()) : [];
    var z2s = e => `AWS_BEARER_TOKEN_${e.replace(/[\s-]/g, "_").toUpperCase()}`;
    var _Yu = {
      environmentVariableSelector: (e, t) => {
        if (t?.signingName) {
          if (z2s(t.signingName) in e) {
            return ["httpBearerAuth"];
          }
        }
        if (!("AWS_AUTH_SCHEME_PREFERENCE" in e)) {
          return;
        }
        return H2s(e["AWS_AUTH_SCHEME_PREFERENCE"]);
      },
      configFileSelector: e => {
        if (!("auth_scheme_preference" in e)) {
          return;
        }
        return H2s(e["auth_scheme_preference"]);
      },
      default: []
    };
    var bYu = e => (e.sigv4aSigningRegionSet = mAe.normalizeProvider(e.sigv4aSigningRegionSet), e);
    var SYu = {
      environmentVariableSelector(e) {
        if (e.AWS_SIGV4A_SIGNING_REGION_SET) {
          return e.AWS_SIGV4A_SIGNING_REGION_SET.split(",").map(t => t.trim());
        }
        throw new L2s.ProviderError("AWS_SIGV4A_SIGNING_REGION_SET not set in env.", {
          tryNextLink: true
        });
      },
      configFileSelector(e) {
        if (e.sigv4a_signing_region_set) {
          return (e.sigv4a_signing_region_set ?? "").split(",").map(t => t.trim());
        }
        throw new L2s.ProviderError("sigv4a_signing_region_set not set in profile.", {
          tryNextLink: true
        });
      },
      default: undefined
    };
    var K2s = e => {
      let t = e.credentials;
      let n = !!e.credentials;
      let r = undefined;
      Object.defineProperty(e, "credentials", {
        set(c) {
          if (c && c !== t && c !== r) {
            n = true;
          }
          t = c;
          let u = EYu(e, {
            credentials: t,
            credentialDefaultProvider: e.credentialDefaultProvider
          });
          let d = vYu(e, u);
          if (n && !d.attributed) {
            r = async p => d(p).then(m => dYu.setCredentialFeature(m, "CREDENTIALS_CODE", "e"));
            r.memoized = d.memoized;
            r.configBound = d.configBound;
            r.attributed = true;
          } else {
            r = d;
          }
        },
        get() {
          return r;
        },
        enumerable: true,
        configurable: true
      });
      e.credentials = t;
      let {
        signingEscapePath: o = true,
        systemClockOffset: s = e.systemClockOffset || 0,
        sha256: i
      } = e;
      let a;
      if (e.signer) {
        a = mAe.normalizeProvider(e.signer);
      } else if (e.regionInfoProvider) {
        a = () => mAe.normalizeProvider(e.region)().then(async c => [(await e.regionInfoProvider(c, {
          useFipsEndpoint: await e.useFipsEndpoint(),
          useDualstackEndpoint: await e.useDualstackEndpoint()
        })) || {}, c]).then(([c, u]) => {
          let {
            signingRegion: d,
            signingService: p
          } = c;
          e.signingRegion = e.signingRegion || d || u;
          e.signingName = e.signingName || p || e.serviceId;
          let m = {
            ...e,
            credentials: e.credentials,
            region: e.signingRegion,
            service: e.signingName,
            sha256: i,
            uriEscapePath: o
          };
          return new (e.signerConstructor || F2s.SignatureV4)(m);
        });
      } else {
        a = async c => {
          c = Object.assign({}, {
            name: "sigv4",
            signingName: e.signingName || e.defaultSigningName,
            signingRegion: await mAe.normalizeProvider(e.region)(),
            properties: {}
          }, c);
          let {
            signingRegion: u,
            signingName: d
          } = c;
          e.signingRegion = e.signingRegion || u;
          e.signingName = e.signingName || d || e.serviceId;
          let p = {
            ...e,
            credentials: e.credentials,
            region: e.signingRegion,
            service: e.signingName,
            sha256: i,
            uriEscapePath: o
          };
          return new (e.signerConstructor || F2s.SignatureV4)(p);
        };
      }
      return Object.assign(e, {
        systemClockOffset: s,
        signingEscapePath: o,
        signer: a
      });
    };
    var TYu = K2s;
    function EYu(e, {
      credentials: t,
      credentialDefaultProvider: n
    }) {
      let r;
      if (t) {
        if (!t?.memoized) {
          r = mAe.memoizeIdentityProvider(t, mAe.isIdentityExpired, mAe.doesIdentityRequireRefresh);
        } else {
          r = t;
        }
      } else if (n) {
        r = mAe.normalizeProvider(n(Object.assign({}, e, {
          parentClientConfig: e
        })));
      } else {
        r = async () => {
          throw Error("@aws-sdk/core::resolveAwsSdkSigV4Config - `credentials` not provided and no credentialDefaultProvider was configured.");
        };
      }
      r.memoized = true;
      return r;
    }
    function vYu(e, t) {
      if (t.configBound) {
        return t;
      }
      let n = async r => t({
        ...r,
        callerClientConfig: e
      });
      n.memoized = t.memoized;
      n.configBound = true;
      return n;
    }
    class yrt {
      queryCompat;
      constructor(e = false) {
        this.queryCompat = e;
      }
      resolveRestContentType(e, t) {
        let n = t.getMemberSchemas();
        let r = Object.values(n).find(o => !!o.getMergedTraits().httpPayload);
        if (r) {
          let o = r.getMergedTraits().mediaType;
          if (o) {
            return o;
          } else if (r.isStringSchema()) {
            return "text/plain";
          } else if (r.isBlobSchema()) {
            return "application/octet-stream";
          } else {
            return e;
          }
        } else if (!t.isUnitSchema()) {
          if (Object.values(n).find(s => {
            let {
              httpQuery: i,
              httpQueryParams: a,
              httpHeader: l,
              httpLabel: c,
              httpPrefixHeaders: u
            } = s.getMergedTraits();
            return !i && !a && !l && !c && u === undefined;
          })) {
            return e;
          }
        }
      }
      async getErrorSchemaOrThrowBaseException(e, t, n, r, o, s) {
        let i = t;
        let a = e;
        if (e.includes("#")) {
          [i, a] = e.split("#");
        }
        let l = {
          $metadata: o,
          $fault: n.statusCode < 500 ? "client" : "server"
        };
        let c = tT.TypeRegistry.for(i);
        try {
          return {
            errorSchema: s?.(c, a) ?? c.getSchema(e),
            errorMetadata: l
          };
        } catch (u) {
          r.message = r.message ?? r.Message ?? "UnknownError";
          let d = tT.TypeRegistry.for("smithy.ts.sdk.synthetic." + i);
          let p = d.getBaseException();
          if (p) {
            let m = d.getErrorCtor(p) ?? Error;
            throw this.decorateServiceException(Object.assign(new m({
              name: a
            }), l), r);
          }
          throw this.decorateServiceException(Object.assign(Error(a), l), r);
        }
      }
      decorateServiceException(e, t = {}) {
        if (this.queryCompat) {
          let n = e.Message ?? t.Message;
          let r = Jye.decorateServiceException(e, t);
          if (n) {
            r.Message = n;
            r.message = n;
          }
          return r;
        }
        return Jye.decorateServiceException(e, t);
      }
      setQueryCompatError(e, t) {
        let n = t.headers?.["x-amzn-query-error"];
        if (e !== undefined && n != null) {
          let [r, o] = n.split(";");
          let s = Object.entries(e);
          let i = {
            Code: r,
            Type: o
          };
          Object.assign(e, i);
          for (let [a, l] of s) {
            i[a] = l;
          }
          delete i.__type;
          e.Error = i;
        }
      }
      queryCompatOutput(e, t) {
        if (e.Error) {
          t.Error = e.Error;
        }
        if (e.Type) {
          t.Type = e.Type;
        }
        if (e.Code) {
          t.Code = e.Code;
        }
      }
    }
    class Y2s extends U2s.SmithyRpcV2CborProtocol {
      awsQueryCompatible;
      mixin;
      constructor({
        defaultNamespace: e,
        awsQueryCompatible: t
      }) {
        super({
          defaultNamespace: e
        });
        this.awsQueryCompatible = !!t;
        this.mixin = new yrt(this.awsQueryCompatible);
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        if (this.awsQueryCompatible) {
          r.headers["x-amzn-query-mode"] = "true";
        }
        return r;
      }
      async handleError(e, t, n, r, o) {
        if (this.awsQueryCompatible) {
          this.mixin.setQueryCompatError(r, n);
        }
        let s = U2s.loadSmithyRpcV2CborErrorCode(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = tT.NormalizedSchema.of(i);
        let c = r.message ?? r.Message ?? "Unknown";
        let d = new (tT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          p[m] = this.deserializer.readValue(f, r[m]);
        }
        if (this.awsQueryCompatible) {
          this.mixin.queryCompatOutput(r, p);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
    }
    var wYu = e => {
      if (e == null) {
        return e;
      }
      if (typeof e === "number" || typeof e === "bigint") {
        let t = Error(`Received number ${e} where a string was expected.`);
        t.name = "Warning";
        console.warn(t);
        return String(e);
      }
      if (typeof e === "boolean") {
        let t = Error(`Received boolean ${e} where a string was expected.`);
        t.name = "Warning";
        console.warn(t);
        return String(e);
      }
      return e;
    };
    var CYu = e => {
      if (e == null) {
        return e;
      }
      if (typeof e === "string") {
        let t = e.toLowerCase();
        if (e !== "" && t !== "false" && t !== "true") {
          let n = Error(`Received string "${e}" where a boolean was expected.`);
          n.name = "Warning";
          console.warn(n);
        }
        return e !== "" && t !== "false";
      }
      return e;
    };
    var RYu = e => {
      if (e == null) {
        return e;
      }
      if (typeof e === "string") {
        let t = Number(e);
        if (t.toString() !== e) {
          let n = Error(`Received string "${e}" where a number was expected.`);
          n.name = "Warning";
          console.warn(n);
          return e;
        }
        return t;
      }
      return e;
    };
    class fAe {
      serdeContext;
      setSerdeContext(e) {
        this.serdeContext = e;
      }
    }
    function xYu(e, t, n) {
      if (n?.source) {
        let r = n.source;
        if (typeof t === "number") {
          if (t > Number.MAX_SAFE_INTEGER || t < Number.MIN_SAFE_INTEGER || r !== String(t)) {
            if (r.includes(".")) {
              return new jN.NumericValue(r, "bigDecimal");
            } else {
              return BigInt(r);
            }
          }
        }
      }
      return t;
    }
    var J2s = (e, t) => Jye.collectBody(e, t).then(n => (t?.utf8Encoder ?? G2s.toUtf8)(n));
    var lBr = (e, t) => J2s(e, t).then(n => {
      if (n.length) {
        try {
          return JSON.parse(n);
        } catch (r) {
          if (r?.name === "SyntaxError") {
            Object.defineProperty(r, "$responseBodyText", {
              value: n
            });
          }
          throw r;
        }
      }
      return {};
    });
    var kYu = async (e, t) => {
      let n = await lBr(e, t);
      n.message = n.message ?? n.Message;
      return n;
    };
    var cBr = (e, t) => {
      let n = (s, i) => Object.keys(s).find(a => a.toLowerCase() === i.toLowerCase());
      let r = s => {
        let i = s;
        if (typeof i === "number") {
          i = i.toString();
        }
        if (i.indexOf(",") >= 0) {
          i = i.split(",")[0];
        }
        if (i.indexOf(":") >= 0) {
          i = i.split(":")[0];
        }
        if (i.indexOf("#") >= 0) {
          i = i.split("#")[1];
        }
        return i;
      };
      let o = n(e.headers, "x-amzn-errortype");
      if (o !== undefined) {
        return r(e.headers[o]);
      }
      if (t && typeof t === "object") {
        let s = n(t, "code");
        if (s && t[s] !== undefined) {
          return r(t[s]);
        }
        if (t.__type !== undefined) {
          return r(t.__type);
        }
      }
    };
    class uBr extends fAe {
      settings;
      constructor(e) {
        super();
        this.settings = e;
      }
      async read(e, t) {
        return this._read(e, typeof t === "string" ? JSON.parse(t, xYu) : await lBr(t, this.serdeContext));
      }
      readObject(e, t) {
        return this._read(e, t);
      }
      _read(e, t) {
        let n = t !== null && typeof t === "object";
        let r = tT.NormalizedSchema.of(e);
        if (r.isListSchema() && Array.isArray(t)) {
          let s = r.getValueSchema();
          let i = [];
          let a = !!r.getMergedTraits().sparse;
          for (let l of t) {
            if (a || l != null) {
              i.push(this._read(s, l));
            }
          }
          return i;
        } else if (r.isMapSchema() && n) {
          let s = r.getValueSchema();
          let i = {};
          let a = !!r.getMergedTraits().sparse;
          for (let [l, c] of Object.entries(t)) {
            if (a || c != null) {
              i[l] = this._read(s, c);
            }
          }
          return i;
        } else if (r.isStructSchema() && n) {
          let s = {};
          for (let [i, a] of r.structIterator()) {
            let l = this.settings.jsonName ? a.getMergedTraits().jsonName ?? i : i;
            let c = this._read(a, t[l]);
            if (c != null) {
              s[i] = c;
            }
          }
          return s;
        }
        if (r.isBlobSchema() && typeof t === "string") {
          return BNt.fromBase64(t);
        }
        let o = r.getMergedTraits().mediaType;
        if (r.isStringSchema() && typeof t === "string" && o) {
          if (o === "application/json" || o.endsWith("+json")) {
            return jN.LazyJsonString.from(t);
          }
        }
        if (r.isTimestampSchema() && t != null) {
          switch (gF.determineTimestampFormat(r, this.settings)) {
            case 5:
              return jN.parseRfc3339DateTimeWithOffset(t);
            case 6:
              return jN.parseRfc7231DateTime(t);
            case 7:
              return jN.parseEpochTimestamp(t);
            default:
              console.warn("Missing timestamp format, parsing value with Date constructor:", t);
              return new Date(t);
          }
        }
        if (r.isBigIntegerSchema() && (typeof t === "number" || typeof t === "string")) {
          return BigInt(t);
        }
        if (r.isBigDecimalSchema() && t != null) {
          if (t instanceof jN.NumericValue) {
            return t;
          }
          let s = t;
          if (s.type === "bigDecimal" && "string" in s) {
            return new jN.NumericValue(s.string, s.type);
          }
          return new jN.NumericValue(String(t), "bigDecimal");
        }
        if (r.isNumericSchema() && typeof t === "string") {
          switch (t) {
            case "Infinity":
              return 1 / 0;
            case "-Infinity":
              return -1 / 0;
            case "NaN":
              return NaN;
          }
        }
        if (r.isDocumentSchema()) {
          if (n) {
            let s = Array.isArray(t) ? [] : {};
            for (let [i, a] of Object.entries(t)) {
              if (a instanceof jN.NumericValue) {
                s[i] = a;
              } else {
                s[i] = this._read(r, a);
              }
            }
            return s;
          } else {
            return structuredClone(t);
          }
        }
        return t;
      }
    }
    var W2s = String.fromCharCode(925);
    class X2s {
      values = new Map();
      counter = 0;
      stage = 0;
      createReplacer() {
        if (this.stage === 1) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer already created.");
        }
        if (this.stage === 2) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer exhausted.");
        }
        this.stage = 1;
        return (e, t) => {
          if (t instanceof jN.NumericValue) {
            let n = `${W2s + "nv" + this.counter++}_` + t.string;
            this.values.set(`"${n}"`, t.string);
            return n;
          }
          if (typeof t === "bigint") {
            let n = t.toString();
            let r = `${W2s + "b" + this.counter++}_` + n;
            this.values.set(`"${r}"`, n);
            return r;
          }
          return t;
        };
      }
      replaceInJson(e) {
        if (this.stage === 0) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer not created yet.");
        }
        if (this.stage === 2) {
          throw Error("@aws-sdk/core/protocols - JsonReplacer exhausted.");
        }
        if (this.stage = 2, this.counter === 0) {
          return e;
        }
        for (let [t, n] of this.values) {
          e = e.replace(t, n);
        }
        return e;
      }
    }
    class dBr extends fAe {
      settings;
      buffer;
      rootSchema;
      constructor(e) {
        super();
        this.settings = e;
      }
      write(e, t) {
        this.rootSchema = tT.NormalizedSchema.of(e);
        this.buffer = this._write(this.rootSchema, t);
      }
      writeDiscriminatedDocument(e, t) {
        if (this.write(e, t), typeof this.buffer === "object") {
          this.buffer.__type = tT.NormalizedSchema.of(e).getName(true);
        }
      }
      flush() {
        let {
          rootSchema: e
        } = this;
        if (this.rootSchema = undefined, e?.isStructSchema() || e?.isDocumentSchema()) {
          let t = new X2s();
          return t.replaceInJson(JSON.stringify(this.buffer, t.createReplacer(), 0));
        }
        return this.buffer;
      }
      _write(e, t, n) {
        let r = t !== null && typeof t === "object";
        let o = tT.NormalizedSchema.of(e);
        if (o.isListSchema() && Array.isArray(t)) {
          let s = o.getValueSchema();
          let i = [];
          let a = !!o.getMergedTraits().sparse;
          for (let l of t) {
            if (a || l != null) {
              i.push(this._write(s, l));
            }
          }
          return i;
        } else if (o.isMapSchema() && r) {
          let s = o.getValueSchema();
          let i = {};
          let a = !!o.getMergedTraits().sparse;
          for (let [l, c] of Object.entries(t)) {
            if (a || c != null) {
              i[l] = this._write(s, c);
            }
          }
          return i;
        } else if (o.isStructSchema() && r) {
          let s = {};
          for (let [i, a] of o.structIterator()) {
            let l = this.settings.jsonName ? a.getMergedTraits().jsonName ?? i : i;
            let c = this._write(a, t[i], o);
            if (c !== undefined) {
              s[l] = c;
            }
          }
          return s;
        }
        if (t === null && n?.isStructSchema()) {
          return;
        }
        if (o.isBlobSchema() && (t instanceof Uint8Array || typeof t === "string") || o.isDocumentSchema() && t instanceof Uint8Array) {
          if (o === this.rootSchema) {
            return t;
          }
          return (this.serdeContext?.base64Encoder ?? BNt.toBase64)(t);
        }
        if ((o.isTimestampSchema() || o.isDocumentSchema()) && t instanceof Date) {
          switch (gF.determineTimestampFormat(o, this.settings)) {
            case 5:
              return t.toISOString().replace(".000Z", "Z");
            case 6:
              return jN.dateToUtcString(t);
            case 7:
              return t.getTime() / 1000;
            default:
              console.warn("Missing timestamp format, using epoch seconds", t);
              return t.getTime() / 1000;
          }
        }
        if (o.isNumericSchema() && typeof t === "number") {
          if (Math.abs(t) === 1 / 0 || isNaN(t)) {
            return String(t);
          }
        }
        if (o.isStringSchema()) {
          if (typeof t > "u" && o.isIdempotencyToken()) {
            return jN.generateIdempotencyToken();
          }
          let s = o.getMergedTraits().mediaType;
          if (t != null && s) {
            if (s === "application/json" || s.endsWith("+json")) {
              return jN.LazyJsonString.from(t);
            }
          }
        }
        if (o.isDocumentSchema()) {
          if (r) {
            let s = Array.isArray(t) ? [] : {};
            for (let [i, a] of Object.entries(t)) {
              if (a instanceof jN.NumericValue) {
                s[i] = a;
              } else {
                s[i] = this._write(o, a);
              }
            }
            return s;
          } else {
            return structuredClone(t);
          }
        }
        return t;
      }
    }
    class kbn extends fAe {
      settings;
      constructor(e) {
        super();
        this.settings = e;
      }
      createSerializer() {
        let e = new dBr(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
      createDeserializer() {
        let e = new uBr(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
    }
    class Abn extends gF.RpcProtocol {
      serializer;
      deserializer;
      serviceTarget;
      codec;
      mixin;
      awsQueryCompatible;
      constructor({
        defaultNamespace: e,
        serviceTarget: t,
        awsQueryCompatible: n
      }) {
        super({
          defaultNamespace: e
        });
        this.serviceTarget = t;
        this.codec = new kbn({
          timestampFormat: {
            useTrait: true,
            default: 7
          },
          jsonName: false
        });
        this.serializer = this.codec.createSerializer();
        this.deserializer = this.codec.createDeserializer();
        this.awsQueryCompatible = !!n;
        this.mixin = new yrt(this.awsQueryCompatible);
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        if (!r.path.endsWith("/")) {
          r.path += "/";
        }
        if (Object.assign(r.headers, {
          "content-type": `application/x-amz-json-${this.getJsonRpcVersion()}`,
          "x-amz-target": `${this.serviceTarget}.${e.name}`
        }), this.awsQueryCompatible) {
          r.headers["x-amzn-query-mode"] = "true";
        }
        if (tT.deref(e.input) === "unit" || !r.body) {
          r.body = "{}";
        }
        return r;
      }
      getPayloadCodec() {
        return this.codec;
      }
      async handleError(e, t, n, r, o) {
        if (this.awsQueryCompatible) {
          this.mixin.setQueryCompatError(r, n);
        }
        let s = cBr(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = tT.NormalizedSchema.of(i);
        let c = r.message ?? r.Message ?? "Unknown";
        let d = new (tT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          let h = f.getMergedTraits().jsonName ?? m;
          p[m] = this.codec.createDeserializer().readObject(f, r[h]);
        }
        if (this.awsQueryCompatible) {
          this.mixin.queryCompatOutput(r, p);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
    }
    class Q2s extends Abn {
      constructor({
        defaultNamespace: e,
        serviceTarget: t,
        awsQueryCompatible: n
      }) {
        super({
          defaultNamespace: e,
          serviceTarget: t,
          awsQueryCompatible: n
        });
      }
      getShapeId() {
        return "aws.protocols#awsJson1_0";
      }
      getJsonRpcVersion() {
        return "1.0";
      }
      getDefaultContentType() {
        return "application/x-amz-json-1.0";
      }
    }
    class Z2s extends Abn {
      constructor({
        defaultNamespace: e,
        serviceTarget: t,
        awsQueryCompatible: n
      }) {
        super({
          defaultNamespace: e,
          serviceTarget: t,
          awsQueryCompatible: n
        });
      }
      getShapeId() {
        return "aws.protocols#awsJson1_1";
      }
      getJsonRpcVersion() {
        return "1.1";
      }
      getDefaultContentType() {
        return "application/x-amz-json-1.1";
      }
    }
    class e$s extends gF.HttpBindingProtocol {
      serializer;
      deserializer;
      codec;
      mixin = new yrt();
      constructor({
        defaultNamespace: e
      }) {
        super({
          defaultNamespace: e
        });
        let t = {
          timestampFormat: {
            useTrait: true,
            default: 7
          },
          httpBindings: true,
          jsonName: true
        };
        this.codec = new kbn(t);
        this.serializer = new gF.HttpInterceptingShapeSerializer(this.codec.createSerializer(), t);
        this.deserializer = new gF.HttpInterceptingShapeDeserializer(this.codec.createDeserializer(), t);
      }
      getShapeId() {
        return "aws.protocols#restJson1";
      }
      getPayloadCodec() {
        return this.codec;
      }
      setSerdeContext(e) {
        this.codec.setSerdeContext(e);
        super.setSerdeContext(e);
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        let o = tT.NormalizedSchema.of(e.input);
        if (!r.headers["content-type"]) {
          let s = this.mixin.resolveRestContentType(this.getDefaultContentType(), o);
          if (s) {
            r.headers["content-type"] = s;
          }
        }
        if (r.body == null && r.headers["content-type"] === this.getDefaultContentType()) {
          r.body = "{}";
        }
        return r;
      }
      async deserializeResponse(e, t, n) {
        let r = await super.deserializeResponse(e, t, n);
        let o = tT.NormalizedSchema.of(e.output);
        for (let [s, i] of o.structIterator()) {
          if (i.getMemberTraits().httpPayload && !(s in r)) {
            r[s] = null;
          }
        }
        return r;
      }
      async handleError(e, t, n, r, o) {
        let s = cBr(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = tT.NormalizedSchema.of(i);
        let c = r.message ?? r.Message ?? "Unknown";
        let d = new (tT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        await this.deserializeHttpMessage(i, t, n, r);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          let h = f.getMergedTraits().jsonName ?? m;
          p[m] = this.codec.createDeserializer().readObject(f, r[h]);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
      getDefaultContentType() {
        return "application/json";
      }
    }
    var AYu = e => {
      if (e == null) {
        return;
      }
      if (typeof e === "object" && "__type" in e) {
        delete e.__type;
      }
      return Jye.expectUnion(e);
    };
    class Ibn extends fAe {
      settings;
      stringDeserializer;
      constructor(e) {
        super();
        this.settings = e;
        this.stringDeserializer = new gF.FromStringShapeDeserializer(e);
      }
      setSerdeContext(e) {
        this.serdeContext = e;
        this.stringDeserializer.setSerdeContext(e);
      }
      read(e, t, n) {
        let r = tT.NormalizedSchema.of(e);
        let o = r.getMemberSchemas();
        if (r.isStructSchema() && r.isMemberSchema() && !!Object.values(o).find(l => !!l.getMemberTraits().eventPayload)) {
          let l = {};
          let c = Object.keys(o)[0];
          if (o[c].isBlobSchema()) {
            l[c] = t;
          } else {
            l[c] = this.read(o[c], t);
          }
          return l;
        }
        let i = (this.serdeContext?.utf8Encoder ?? G2s.toUtf8)(t);
        let a = this.parseXml(i);
        return this.readSchema(e, n ? a[n] : a);
      }
      readSchema(e, t) {
        let n = tT.NormalizedSchema.of(e);
        if (n.isUnitSchema()) {
          return;
        }
        let r = n.getMergedTraits();
        if (n.isListSchema() && !Array.isArray(t)) {
          return this.readSchema(n, [t]);
        }
        if (t == null) {
          return t;
        }
        if (typeof t === "object") {
          let o = !!r.sparse;
          let s = !!r.xmlFlattened;
          if (n.isListSchema()) {
            let a = n.getValueSchema();
            let l = [];
            let c = a.getMergedTraits().xmlName ?? "member";
            let u = s ? t : (t[0] ?? t)[c];
            let d = Array.isArray(u) ? u : [u];
            for (let p of d) {
              if (p != null || o) {
                l.push(this.readSchema(a, p));
              }
            }
            return l;
          }
          let i = {};
          if (n.isMapSchema()) {
            let a = n.getKeySchema();
            let l = n.getValueSchema();
            let c;
            if (s) {
              c = Array.isArray(t) ? t : [t];
            } else {
              c = Array.isArray(t.entry) ? t.entry : [t.entry];
            }
            let u = a.getMergedTraits().xmlName ?? "key";
            let d = l.getMergedTraits().xmlName ?? "value";
            for (let p of c) {
              let m = p[u];
              let f = p[d];
              if (f != null || o) {
                i[m] = this.readSchema(l, f);
              }
            }
            return i;
          }
          if (n.isStructSchema()) {
            for (let [a, l] of n.structIterator()) {
              let c = l.getMergedTraits();
              let u = !c.httpPayload ? l.getMemberTraits().xmlName ?? a : c.xmlName ?? l.getName();
              if (t[u] != null) {
                i[a] = this.readSchema(l, t[u]);
              }
            }
            return i;
          }
          if (n.isDocumentSchema()) {
            return t;
          }
          throw Error(`@aws-sdk/core/protocols - xml deserializer unhandled schema type for ${n.getName(true)}`);
        }
        if (n.isListSchema()) {
          return [];
        }
        if (n.isMapSchema() || n.isStructSchema()) {
          return {};
        }
        return this.stringDeserializer.read(n, t);
      }
      parseXml(e) {
        if (e.length) {
          let t;
          try {
            t = EY.parseXML(e);
          } catch (s) {
            if (s && typeof s === "object") {
              Object.defineProperty(s, "$responseBodyText", {
                value: e
              });
            }
            throw s;
          }
          let n = "#text";
          let r = Object.keys(t)[0];
          let o = t[r];
          if (o[n]) {
            o[r] = o[n];
            delete o[n];
          }
          return Jye.getValueFromTextNode(o);
        }
        return {};
      }
    }
    class t$s extends fAe {
      settings;
      buffer;
      constructor(e) {
        super();
        this.settings = e;
      }
      write(e, t, n = "") {
        if (this.buffer === undefined) {
          this.buffer = "";
        }
        let r = tT.NormalizedSchema.of(e);
        if (n && !n.endsWith(".")) {
          n += ".";
        }
        if (r.isBlobSchema()) {
          if (typeof t === "string" || t instanceof Uint8Array) {
            this.writeKey(n);
            this.writeValue((this.serdeContext?.base64Encoder ?? BNt.toBase64)(t));
          }
        } else if (r.isBooleanSchema() || r.isNumericSchema() || r.isStringSchema()) {
          if (t != null) {
            this.writeKey(n);
            this.writeValue(String(t));
          } else if (r.isIdempotencyToken()) {
            this.writeKey(n);
            this.writeValue(jN.generateIdempotencyToken());
          }
        } else if (r.isBigIntegerSchema()) {
          if (t != null) {
            this.writeKey(n);
            this.writeValue(String(t));
          }
        } else if (r.isBigDecimalSchema()) {
          if (t != null) {
            this.writeKey(n);
            this.writeValue(t instanceof jN.NumericValue ? t.string : String(t));
          }
        } else if (r.isTimestampSchema()) {
          if (t instanceof Date) {
            switch (this.writeKey(n), gF.determineTimestampFormat(r, this.settings)) {
              case 5:
                this.writeValue(t.toISOString().replace(".000Z", "Z"));
                break;
              case 6:
                this.writeValue(Jye.dateToUtcString(t));
                break;
              case 7:
                this.writeValue(String(t.getTime() / 1000));
                break;
            }
          }
        } else if (r.isDocumentSchema()) {
          throw Error(`@aws-sdk/core/protocols - QuerySerializer unsupported document type ${r.getName(true)}`);
        } else if (r.isListSchema()) {
          if (Array.isArray(t)) {
            if (t.length === 0) {
              if (this.settings.serializeEmptyLists) {
                this.writeKey(n);
                this.writeValue("");
              }
            } else {
              let o = r.getValueSchema();
              let s = this.settings.flattenLists || r.getMergedTraits().xmlFlattened;
              let i = 1;
              for (let a of t) {
                if (a == null) {
                  continue;
                }
                let l = this.getKey("member", o.getMergedTraits().xmlName);
                let c = s ? `${n}${i}` : `${n}${l}.${i}`;
                this.write(o, a, c);
                ++i;
              }
            }
          }
        } else if (r.isMapSchema()) {
          if (t && typeof t === "object") {
            let o = r.getKeySchema();
            let s = r.getValueSchema();
            let i = r.getMergedTraits().xmlFlattened;
            let a = 1;
            for (let [l, c] of Object.entries(t)) {
              if (c == null) {
                continue;
              }
              let u = this.getKey("key", o.getMergedTraits().xmlName);
              let d = i ? `${n}${a}.${u}` : `${n}entry.${a}.${u}`;
              let p = this.getKey("value", s.getMergedTraits().xmlName);
              let m = i ? `${n}${a}.${p}` : `${n}entry.${a}.${p}`;
              this.write(o, l, d);
              this.write(s, c, m);
              ++a;
            }
          }
        } else if (r.isStructSchema()) {
          if (t && typeof t === "object") {
            for (let [o, s] of r.structIterator()) {
              if (t[o] == null && !s.isIdempotencyToken()) {
                continue;
              }
              let i = this.getKey(o, s.getMergedTraits().xmlName);
              let a = `${n}${i}`;
              this.write(s, t[o], a);
            }
          }
        } else if (r.isUnitSchema()) {
          ;
        } else {
          throw Error(`@aws-sdk/core/protocols - QuerySerializer unrecognized schema type ${r.getName(true)}`);
        }
      }
      flush() {
        if (this.buffer === undefined) {
          throw Error("@aws-sdk/core/protocols - QuerySerializer cannot flush with nothing written to buffer.");
        }
        let e = this.buffer;
        delete this.buffer;
        return e;
      }
      getKey(e, t) {
        let n = t ?? e;
        if (this.settings.capitalizeKeys) {
          return n[0].toUpperCase() + n.slice(1);
        }
        return n;
      }
      writeKey(e) {
        if (e.endsWith(".")) {
          e = e.slice(0, e.length - 1);
        }
        this.buffer += `&${gF.extendedEncodeURIComponent(e)}=`;
      }
      writeValue(e) {
        this.buffer += gF.extendedEncodeURIComponent(e);
      }
    }
    class pBr extends gF.RpcProtocol {
      options;
      serializer;
      deserializer;
      mixin = new yrt();
      constructor(e) {
        super({
          defaultNamespace: e.defaultNamespace
        });
        this.options = e;
        let t = {
          timestampFormat: {
            useTrait: true,
            default: 5
          },
          httpBindings: false,
          xmlNamespace: e.xmlNamespace,
          serviceNamespace: e.defaultNamespace,
          serializeEmptyLists: true
        };
        this.serializer = new t$s(t);
        this.deserializer = new Ibn(t);
      }
      getShapeId() {
        return "aws.protocols#awsQuery";
      }
      setSerdeContext(e) {
        this.serializer.setSerdeContext(e);
        this.deserializer.setSerdeContext(e);
      }
      getPayloadCodec() {
        throw Error("AWSQuery protocol has no payload codec.");
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        if (!r.path.endsWith("/")) {
          r.path += "/";
        }
        if (Object.assign(r.headers, {
          "content-type": "application/x-www-form-urlencoded"
        }), tT.deref(e.input) === "unit" || !r.body) {
          r.body = "";
        }
        let o = e.name.split("#")[1] ?? e.name;
        if (r.body = `Action=${o}&Version=${this.options.version}` + r.body, r.body.endsWith("&")) {
          r.body = r.body.slice(-1);
        }
        return r;
      }
      async deserializeResponse(e, t, n) {
        let r = this.deserializer;
        let o = tT.NormalizedSchema.of(e.output);
        let s = {};
        if (n.statusCode >= 300) {
          let u = await gF.collectBody(n.body, t);
          if (u.byteLength > 0) {
            Object.assign(s, await r.read(15, u));
          }
          await this.handleError(e, t, n, s, this.deserializeMetadata(n));
        }
        for (let u in n.headers) {
          let d = n.headers[u];
          delete n.headers[u];
          n.headers[u.toLowerCase()] = d;
        }
        let i = e.name.split("#")[1] ?? e.name;
        let a = o.isStructSchema() && this.useNestedResult() ? i + "Result" : undefined;
        let l = await gF.collectBody(n.body, t);
        if (l.byteLength > 0) {
          Object.assign(s, await r.read(o, l, a));
        }
        return {
          $metadata: this.deserializeMetadata(n),
          ...s
        };
      }
      useNestedResult() {
        return true;
      }
      async handleError(e, t, n, r, o) {
        let s = this.loadQueryErrorCode(n, r) ?? "Unknown";
        let i = this.loadQueryError(r);
        let a = this.loadQueryErrorMessage(r);
        i.message = a;
        i.Error = {
          Type: i.Type,
          Code: i.Code,
          Message: a
        };
        let {
          errorSchema: l,
          errorMetadata: c
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, i, o, (f, h) => {
          try {
            return f.getSchema(h);
          } catch (g) {
            return f.find(y => tT.NormalizedSchema.of(y).getMergedTraits().awsQueryError?.[0] === h);
          }
        });
        let u = tT.NormalizedSchema.of(l);
        let p = new (tT.TypeRegistry.for(l[1]).getErrorCtor(l) ?? Error)(a);
        let m = {
          Error: i.Error
        };
        for (let [f, h] of u.structIterator()) {
          let g = h.getMergedTraits().xmlName ?? f;
          let y = i[g] ?? r[g];
          m[f] = this.deserializer.readSchema(h, y);
        }
        throw this.mixin.decorateServiceException(Object.assign(p, c, {
          $fault: u.getMergedTraits().error,
          message: a
        }, m), r);
      }
      loadQueryErrorCode(e, t) {
        let n = (t.Errors?.[0]?.Error ?? t.Errors?.Error ?? t.Error)?.Code;
        if (n !== undefined) {
          return n;
        }
        if (e.statusCode == 404) {
          return "NotFound";
        }
      }
      loadQueryError(e) {
        return e.Errors?.[0]?.Error ?? e.Errors?.Error ?? e.Error;
      }
      loadQueryErrorMessage(e) {
        let t = this.loadQueryError(e);
        return t?.message ?? t?.Message ?? e.message ?? e.Message ?? "Unknown";
      }
      getDefaultContentType() {
        return "application/x-www-form-urlencoded";
      }
    }
    class n$s extends pBr {
      options;
      constructor(e) {
        super(e);
        this.options = e;
        let t = {
          capitalizeKeys: true,
          flattenLists: true,
          serializeEmptyLists: false
        };
        Object.assign(this.serializer.settings, t);
      }
      useNestedResult() {
        return false;
      }
    }
    var r$s = (e, t) => J2s(e, t).then(n => {
      if (n.length) {
        let r;
        try {
          r = EY.parseXML(n);
        } catch (a) {
          if (a && typeof a === "object") {
            Object.defineProperty(a, "$responseBodyText", {
              value: n
            });
          }
          throw a;
        }
        let o = "#text";
        let s = Object.keys(r)[0];
        let i = r[s];
        if (i[o]) {
          i[s] = i[o];
          delete i[o];
        }
        return Jye.getValueFromTextNode(i);
      }
      return {};
    });
    var IYu = async (e, t) => {
      let n = await r$s(e, t);
      if (n.Error) {
        n.Error.message = n.Error.message ?? n.Error.Message;
      }
      return n;
    };
    var o$s = (e, t) => {
      if (t?.Error?.Code !== undefined) {
        return t.Error.Code;
      }
      if (t?.Code !== undefined) {
        return t.Code;
      }
      if (e.statusCode == 404) {
        return "NotFound";
      }
    };
    class mBr extends fAe {
      settings;
      stringBuffer;
      byteBuffer;
      buffer;
      constructor(e) {
        super();
        this.settings = e;
      }
      write(e, t) {
        let n = tT.NormalizedSchema.of(e);
        if (n.isStringSchema() && typeof t === "string") {
          this.stringBuffer = t;
        } else if (n.isBlobSchema()) {
          this.byteBuffer = "byteLength" in t ? t : (this.serdeContext?.base64Decoder ?? BNt.fromBase64)(t);
        } else {
          this.buffer = this.writeStruct(n, t, undefined);
          let r = n.getMergedTraits();
          if (r.httpPayload && !r.xmlName) {
            this.buffer.withName(n.getName());
          }
        }
      }
      flush() {
        if (this.byteBuffer !== undefined) {
          let t = this.byteBuffer;
          delete this.byteBuffer;
          return t;
        }
        if (this.stringBuffer !== undefined) {
          let t = this.stringBuffer;
          delete this.stringBuffer;
          return t;
        }
        let e = this.buffer;
        if (this.settings.xmlNamespace) {
          if (!e?.attributes?.xmlns) {
            e.addAttribute("xmlns", this.settings.xmlNamespace);
          }
        }
        delete this.buffer;
        return e.toString();
      }
      writeStruct(e, t, n) {
        let r = e.getMergedTraits();
        let o = e.isMemberSchema() && !r.httpPayload ? e.getMemberTraits().xmlName ?? e.getMemberName() : r.xmlName ?? e.getName();
        if (!o || !e.isStructSchema()) {
          throw Error(`@aws-sdk/core/protocols - xml serializer, cannot write struct with empty name or non-struct, schema=${e.getName(true)}.`);
        }
        let s = EY.XmlNode.of(o);
        let [i, a] = this.getXmlnsAttribute(e, n);
        for (let [l, c] of e.structIterator()) {
          let u = t[l];
          if (u != null || c.isIdempotencyToken()) {
            if (c.getMergedTraits().xmlAttribute) {
              s.addAttribute(c.getMergedTraits().xmlName ?? l, this.writeSimple(c, u));
              continue;
            }
            if (c.isListSchema()) {
              this.writeList(c, u, s, a);
            } else if (c.isMapSchema()) {
              this.writeMap(c, u, s, a);
            } else if (c.isStructSchema()) {
              s.addChildNode(this.writeStruct(c, u, a));
            } else {
              let d = EY.XmlNode.of(c.getMergedTraits().xmlName ?? c.getMemberName());
              this.writeSimpleInto(c, u, d, a);
              s.addChildNode(d);
            }
          }
        }
        if (a) {
          s.addAttribute(i, a);
        }
        return s;
      }
      writeList(e, t, n, r) {
        if (!e.isMemberSchema()) {
          throw Error(`@aws-sdk/core/protocols - xml serializer, cannot write non-member list: ${e.getName(true)}`);
        }
        let o = e.getMergedTraits();
        let s = e.getValueSchema();
        let i = s.getMergedTraits();
        let a = !!i.sparse;
        let l = !!o.xmlFlattened;
        let [c, u] = this.getXmlnsAttribute(e, r);
        let d = (p, m) => {
          if (s.isListSchema()) {
            this.writeList(s, Array.isArray(m) ? m : [m], p, u);
          } else if (s.isMapSchema()) {
            this.writeMap(s, m, p, u);
          } else if (s.isStructSchema()) {
            let f = this.writeStruct(s, m, u);
            p.addChildNode(f.withName(l ? o.xmlName ?? e.getMemberName() : i.xmlName ?? "member"));
          } else {
            let f = EY.XmlNode.of(l ? o.xmlName ?? e.getMemberName() : i.xmlName ?? "member");
            this.writeSimpleInto(s, m, f, u);
            p.addChildNode(f);
          }
        };
        if (l) {
          for (let p of t) {
            if (a || p != null) {
              d(n, p);
            }
          }
        } else {
          let p = EY.XmlNode.of(o.xmlName ?? e.getMemberName());
          if (u) {
            p.addAttribute(c, u);
          }
          for (let m of t) {
            if (a || m != null) {
              d(p, m);
            }
          }
          n.addChildNode(p);
        }
      }
      writeMap(e, t, n, r, o = false) {
        if (!e.isMemberSchema()) {
          throw Error(`@aws-sdk/core/protocols - xml serializer, cannot write non-member map: ${e.getName(true)}`);
        }
        let s = e.getMergedTraits();
        let i = e.getKeySchema();
        let l = i.getMergedTraits().xmlName ?? "key";
        let c = e.getValueSchema();
        let u = c.getMergedTraits();
        let d = u.xmlName ?? "value";
        let p = !!u.sparse;
        let m = !!s.xmlFlattened;
        let [f, h] = this.getXmlnsAttribute(e, r);
        let g = (y, _, b) => {
          let S = EY.XmlNode.of(l, _);
          let [E, C] = this.getXmlnsAttribute(i, h);
          if (C) {
            S.addAttribute(E, C);
          }
          y.addChildNode(S);
          let x = EY.XmlNode.of(d);
          if (c.isListSchema()) {
            this.writeList(c, b, x, h);
          } else if (c.isMapSchema()) {
            this.writeMap(c, b, x, h, true);
          } else if (c.isStructSchema()) {
            x = this.writeStruct(c, b, h);
          } else {
            this.writeSimpleInto(c, b, x, h);
          }
          y.addChildNode(x);
        };
        if (m) {
          for (let [y, _] of Object.entries(t)) {
            if (p || _ != null) {
              let b = EY.XmlNode.of(s.xmlName ?? e.getMemberName());
              g(b, y, _);
              n.addChildNode(b);
            }
          }
        } else {
          let y;
          if (!o) {
            if (y = EY.XmlNode.of(s.xmlName ?? e.getMemberName()), h) {
              y.addAttribute(f, h);
            }
            n.addChildNode(y);
          }
          for (let [_, b] of Object.entries(t)) {
            if (p || b != null) {
              let S = EY.XmlNode.of("entry");
              g(S, _, b);
              (o ? n : y).addChildNode(S);
            }
          }
        }
      }
      writeSimple(e, t) {
        if (t === null) {
          throw Error("@aws-sdk/core/protocols - (XML serializer) cannot write null value.");
        }
        let n = tT.NormalizedSchema.of(e);
        let r = null;
        if (t && typeof t === "object") {
          if (n.isBlobSchema()) {
            r = (this.serdeContext?.base64Encoder ?? BNt.toBase64)(t);
          } else if (n.isTimestampSchema() && t instanceof Date) {
            switch (gF.determineTimestampFormat(n, this.settings)) {
              case 5:
                r = t.toISOString().replace(".000Z", "Z");
                break;
              case 6:
                r = Jye.dateToUtcString(t);
                break;
              case 7:
                r = String(t.getTime() / 1000);
                break;
              default:
                console.warn("Missing timestamp format, using http date", t);
                r = Jye.dateToUtcString(t);
                break;
            }
          } else if (n.isBigDecimalSchema() && t) {
            if (t instanceof jN.NumericValue) {
              return t.string;
            }
            return String(t);
          } else if (n.isMapSchema() || n.isListSchema()) {
            throw Error("@aws-sdk/core/protocols - xml serializer, cannot call _write() on List/Map schema, call writeList or writeMap() instead.");
          } else {
            throw Error(`@aws-sdk/core/protocols - xml serializer, unhandled schema type for object value and schema: ${n.getName(true)}`);
          }
        }
        if (n.isBooleanSchema() || n.isNumericSchema() || n.isBigIntegerSchema() || n.isBigDecimalSchema()) {
          r = String(t);
        }
        if (n.isStringSchema()) {
          if (t === undefined && n.isIdempotencyToken()) {
            r = jN.generateIdempotencyToken();
          } else {
            r = String(t);
          }
        }
        if (r === null) {
          throw Error(`Unhandled schema-value pair ${n.getName(true)}=${t}`);
        }
        return r;
      }
      writeSimpleInto(e, t, n, r) {
        let o = this.writeSimple(e, t);
        let s = tT.NormalizedSchema.of(e);
        let i = new EY.XmlText(o);
        let [a, l] = this.getXmlnsAttribute(s, r);
        if (l) {
          n.addAttribute(a, l);
        }
        n.addChildNode(i);
      }
      getXmlnsAttribute(e, t) {
        let n = e.getMergedTraits();
        let [r, o] = n.xmlNamespace ?? [];
        if (o && o !== t) {
          return [r ? `xmlns:${r}` : "xmlns", o];
        }
        return [undefined, undefined];
      }
    }
    class fBr extends fAe {
      settings;
      constructor(e) {
        super();
        this.settings = e;
      }
      createSerializer() {
        let e = new mBr(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
      createDeserializer() {
        let e = new Ibn(this.settings);
        e.setSerdeContext(this.serdeContext);
        return e;
      }
    }
    class s$s extends gF.HttpBindingProtocol {
      codec;
      serializer;
      deserializer;
      mixin = new yrt();
      constructor(e) {
        super(e);
        let t = {
          timestampFormat: {
            useTrait: true,
            default: 5
          },
          httpBindings: true,
          xmlNamespace: e.xmlNamespace,
          serviceNamespace: e.defaultNamespace
        };
        this.codec = new fBr(t);
        this.serializer = new gF.HttpInterceptingShapeSerializer(this.codec.createSerializer(), t);
        this.deserializer = new gF.HttpInterceptingShapeDeserializer(this.codec.createDeserializer(), t);
      }
      getPayloadCodec() {
        return this.codec;
      }
      getShapeId() {
        return "aws.protocols#restXml";
      }
      async serializeRequest(e, t, n) {
        let r = await super.serializeRequest(e, t, n);
        let o = tT.NormalizedSchema.of(e.input);
        if (!r.headers["content-type"]) {
          let s = this.mixin.resolveRestContentType(this.getDefaultContentType(), o);
          if (s) {
            r.headers["content-type"] = s;
          }
        }
        if (r.headers["content-type"] === this.getDefaultContentType()) {
          if (typeof r.body === "string") {
            r.body = '<?xml version="1.0" encoding="UTF-8"?>' + r.body;
          }
        }
        return r;
      }
      async deserializeResponse(e, t, n) {
        return super.deserializeResponse(e, t, n);
      }
      async handleError(e, t, n, r, o) {
        let s = o$s(n, r) ?? "Unknown";
        let {
          errorSchema: i,
          errorMetadata: a
        } = await this.mixin.getErrorSchemaOrThrowBaseException(s, this.options.defaultNamespace, n, r, o);
        let l = tT.NormalizedSchema.of(i);
        let c = r.Error?.message ?? r.Error?.Message ?? r.message ?? r.Message ?? "Unknown";
        let d = new (tT.TypeRegistry.for(i[1]).getErrorCtor(i) ?? Error)(c);
        await this.deserializeHttpMessage(i, t, n, r);
        let p = {};
        for (let [m, f] of l.structIterator()) {
          let h = f.getMergedTraits().xmlName ?? m;
          let g = r.Error?.[h] ?? r[h];
          p[m] = this.codec.createDeserializer().readSchema(f, g);
        }
        throw this.mixin.decorateServiceException(Object.assign(d, a, {
          $fault: l.getMergedTraits().error,
          message: c
        }, p), r);
      }
      getDefaultContentType() {
        return "application/xml";
      }
    }
    Ef.AWSSDKSigV4Signer = yYu;
    Ef.AwsEc2QueryProtocol = n$s;
    Ef.AwsJson1_0Protocol = Q2s;
    Ef.AwsJson1_1Protocol = Z2s;
    Ef.AwsJsonRpcProtocol = Abn;
    Ef.AwsQueryProtocol = pBr;
    Ef.AwsRestJsonProtocol = e$s;
    Ef.AwsRestXmlProtocol = s$s;
    Ef.AwsSdkSigV4ASigner = V2s;
    Ef.AwsSdkSigV4Signer = xbn;
    Ef.AwsSmithyRpcV2CborProtocol = Y2s;
    Ef.JsonCodec = kbn;
    Ef.JsonShapeDeserializer = uBr;
    Ef.JsonShapeSerializer = dBr;
    Ef.NODE_AUTH_SCHEME_PREFERENCE_OPTIONS = _Yu;
    Ef.NODE_SIGV4A_CONFIG_OPTIONS = SYu;
    Ef.XmlCodec = fBr;
    Ef.XmlShapeDeserializer = Ibn;
    Ef.XmlShapeSerializer = mBr;
    Ef._toBool = CYu;
    Ef._toNum = RYu;
    Ef._toStr = wYu;
    Ef.awsExpectUnion = AYu;
    Ef.emitWarningIfUnsupportedVersion = pYu;
    Ef.getBearerTokenEnvKey = z2s;
    Ef.loadRestJsonErrorCode = cBr;
    Ef.loadRestXmlErrorCode = o$s;
    Ef.parseJsonBody = lBr;
    Ef.parseJsonErrorBody = kYu;
    Ef.parseXmlBody = r$s;
    Ef.parseXmlErrorBody = IYu;
    Ef.resolveAWSSDKSigV4Config = TYu;
    Ef.resolveAwsSdkSigV4AConfig = bYu;
    Ef.resolveAwsSdkSigV4Config = K2s;
    Ef.setCredentialFeature = mYu;
    Ef.setFeature = fYu;
    Ef.setTokenFeature = hYu;
    Ef.state = oBr;
    Ef.validateSigningProperties = aBr;
  });
  var Ple = __commonJS(_rt => {
    var PYu = Od();
    var OYu = Ale();
    var DYu = QBs();
    var Ile = nw();
    function MYu(e) {
      if (e === undefined) {
        return true;
      }
      return typeof e === "string" && e.length <= 50;
    }
    function NYu(e) {
      let t = PYu.normalizeProvider(e.userAgentAppId ?? undefined);
      let {
        customUserAgent: n
      } = e;
      return Object.assign(e, {
        customUserAgent: typeof n === "string" ? [[n]] : n,
        userAgentAppId: async () => {
          let r = await t();
          if (!MYu(r)) {
            let o = e.logger?.constructor?.name === "NoOpLogger" || !e.logger ? console : e.logger;
            if (typeof r !== "string") {
              o?.warn("userAgentAppId must be a string or undefined.");
            } else if (r.length > 50) {
              o?.warn("The provided userAgentAppId exceeds the maximum length of 50 characters.");
            }
          }
          return r;
        }
      });
    }
    async function FYu(e, t, n) {
      if (n.request?.headers?.["smithy-protocol"] === "rpc-v2-cbor") {
        Ile.setFeature(e, "PROTOCOL_RPC_V2_CBOR", "M");
      }
      if (typeof t.retryStrategy === "function") {
        let s = await t.retryStrategy();
        if (typeof s.acquireInitialRetryToken === "function") {
          if (s.constructor?.name?.includes("Adaptive")) {
            Ile.setFeature(e, "RETRY_MODE_ADAPTIVE", "F");
          } else {
            Ile.setFeature(e, "RETRY_MODE_STANDARD", "E");
          }
        } else {
          Ile.setFeature(e, "RETRY_MODE_LEGACY", "D");
        }
      }
      if (typeof t.accountIdEndpointMode === "function") {
        let s = e.endpointV2;
        if (String(s?.url?.hostname).match(/\d{12}\.ddb/)) {
          Ile.setFeature(e, "ACCOUNT_ID_ENDPOINT", "O");
        }
        switch (await t.accountIdEndpointMode?.()) {
          case "disabled":
            Ile.setFeature(e, "ACCOUNT_ID_MODE_DISABLED", "Q");
            break;
          case "preferred":
            Ile.setFeature(e, "ACCOUNT_ID_MODE_PREFERRED", "P");
            break;
          case "required":
            Ile.setFeature(e, "ACCOUNT_ID_MODE_REQUIRED", "R");
            break;
        }
      }
      let o = e.__smithy_context?.selectedHttpAuthScheme?.identity;
      if (o?.$source) {
        let s = o;
        if (s.accountId) {
          Ile.setFeature(e, "RESOLVED_ACCOUNT_ID", "T");
        }
        for (let [i, a] of Object.entries(s.$source ?? {})) {
          Ile.setFeature(e, i, a);
        }
      }
    }
    function HYu(e) {
      let t = "";
      for (let n in e) {
        let r = e[n];
        if (t.length + r.length + 1 <= 1024) {
          if (t.length) {
            t += "," + r;
          } else {
            t += r;
          }
          continue;
        }
        break;
      }
      return t;
    }
    var u$s = e => (t, n) => async r => {
      let {
        request: o
      } = r;
      if (!DYu.HttpRequest.isInstance(o)) {
        return t(r);
      }
      let {
        headers: s
      } = o;
      let i = n?.userAgent?.map(Pbn) || [];
      let a = (await e.defaultUserAgentProvider()).map(Pbn);
      await FYu(n, e, r);
      let l = n;
      a.push(`m/${HYu(Object.assign({}, n.__smithy_context?.features, l.__aws_sdk_context?.features))}`);
      let c = e?.customUserAgent?.map(Pbn) || [];
      let u = await e.userAgentAppId();
      if (u) {
        a.push(Pbn(["app", `${u}`]));
      }
      let d = OYu.getUserAgentPrefix();
      let p = (d ? [d] : []).concat([...a, ...i, ...c]).join(" ");
      let m = [...a.filter(f => f.startsWith("aws-sdk-")), ...c].join(" ");
      if (e.runtime !== "browser") {
        if (m) {
          s["x-amz-user-agent"] = s["x-amz-user-agent"] ? `${s["user-agent"]} ${m}` : m;
        }
        s["user-agent"] = p;
      } else {
        s["x-amz-user-agent"] = p;
      }
      return t({
        ...r,
        request: o
      });
    };
    var Pbn = e => {
      let t = e[0].split("/").map(i => i.replace(/[^!$%&'*+\-.^_`|~\w]/g, "-")).join("/");
      let n = e[1]?.replace(/[^!$%&'*+\-.^_`|~\w#]/g, "-");
      let r = t.indexOf("/");
      let o = t.substring(0, r);
      let s = t.substring(r + 1);
      if (o === "api") {
        s = s.toLowerCase();
      }
      return [o, s, n].filter(i => i && i.length > 0).reduce((i, a, l) => {
        switch (l) {
          case 0:
            return a;
          case 1:
            return `${i}/${a}`;
          default:
            return `${i}#${a}`;
        }
      }, "");
    };
    var d$s = {
      name: "getUserAgentMiddleware",
      step: "build",
      priority: "low",
      tags: ["SET_USER_AGENT", "USER_AGENT"],
      override: true
    };
    var jYu = e => ({
      applyToStack: t => {
        t.add(u$s(e), d$s);
      }
    });
    _rt.DEFAULT_UA_APP_ID = undefined;
    _rt.getUserAgentMiddlewareOptions = d$s;
    _rt.getUserAgentPlugin = jYu;
    _rt.resolveUserAgentConfig = NYu;
    _rt.userAgentMiddleware = u$s;
  });