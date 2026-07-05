  var Kwa = __commonJS((LXy, zwa) => {
    function BRp(e) {
      return {
        name: "PHP template",
        subLanguage: "xml",
        contains: [{
          begin: /<\?(php|=)?/,
          end: /\?>/,
          subLanguage: "php",
          contains: [{
            begin: "/\\*",
            end: "\\*/",
            skip: true
          }, {
            begin: 'b"',
            end: '"',
            skip: true
          }, {
            begin: "b'",
            end: "'",
            skip: true
          }, e.inherit(e.APOS_STRING_MODE, {
            illegal: null,
            className: null,
            contains: null,
            skip: true
          }), e.inherit(e.QUOTE_STRING_MODE, {
            illegal: null,
            className: null,
            contains: null,
            skip: true
          })]
        }]
      };
    }
    zwa.exports = BRp;
  });
  var Jwa = __commonJS((FXy, Ywa) => {
    function $Rp(e) {
      return {
        name: "Plain text",
        aliases: ["text", "txt"],
        disableAutodetect: true
      };
    }
    Ywa.exports = $Rp;
  });
  var Qwa = __commonJS((UXy, Xwa) => {
    function HRp(e) {
      let t = {
        keyword: "actor addressof and as be break class compile_error compile_intrinsic consume continue delegate digestof do else elseif embed end error for fun if ifdef in interface is isnt lambda let match new not object or primitive recover repeat return struct then trait try type until use var where while with xor",
        meta: "iso val tag trn box ref",
        literal: "this false true"
      };
      let n = {
        className: "string",
        begin: '"""',
        end: '"""',
        relevance: 10
      };
      let r = {
        className: "string",
        begin: '"',
        end: '"',
        contains: [e.BACKSLASH_ESCAPE]
      };
      let o = {
        className: "string",
        begin: "'",
        end: "'",
        contains: [e.BACKSLASH_ESCAPE],
        relevance: 0
      };
      let s = {
        className: "type",
        begin: "\\b_?[A-Z][\\w]*",
        relevance: 0
      };
      let i = {
        begin: e.IDENT_RE + "'",
        relevance: 0
      };
      return {
        name: "Pony",
        keywords: t,
        contains: [s, n, r, o, i, {
          className: "number",
          begin: "(-?)(\\b0[xX][a-fA-F0-9]+|\\b0[bB][01]+|(\\b\\d+(_\\d+)?(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?)",
          relevance: 0
        }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
      };
    }
    Xwa.exports = HRp;
  });
  var eCa = __commonJS((BXy, Zwa) => {
    function jRp(e) {
      let t = ["string", "char", "byte", "int", "long", "bool", "decimal", "single", "double", "DateTime", "xml", "array", "hashtable", "void"];
      let n = "Add|Clear|Close|Copy|Enter|Exit|Find|Format|Get|Hide|Join|Lock|Move|New|Open|Optimize|Pop|Push|Redo|Remove|Rename|Reset|Resize|Search|Select|Set|Show|Skip|Split|Step|Switch|Undo|Unlock|Watch|Backup|Checkpoint|Compare|Compress|Convert|ConvertFrom|ConvertTo|Dismount|Edit|Expand|Export|Group|Import|Initialize|Limit|Merge|Mount|Out|Publish|Restore|Save|Sync|Unpublish|Update|Approve|Assert|Build|Complete|Confirm|Deny|Deploy|Disable|Enable|Install|Invoke|Register|Request|Restart|Resume|Start|Stop|Submit|Suspend|Uninstall|Unregister|Wait|Debug|Measure|Ping|Repair|Resolve|Test|Trace|Connect|Disconnect|Read|Receive|Send|Write|Block|Grant|Protect|Revoke|Unblock|Unprotect|Use|ForEach|Sort|Tee|Where";
      let r = "-and|-as|-band|-bnot|-bor|-bxor|-casesensitive|-ccontains|-ceq|-cge|-cgt|-cle|-clike|-clt|-cmatch|-cne|-cnotcontains|-cnotlike|-cnotmatch|-contains|-creplace|-csplit|-eq|-exact|-f|-file|-ge|-gt|-icontains|-ieq|-ige|-igt|-ile|-ilike|-ilt|-imatch|-in|-ine|-inotcontains|-inotlike|-inotmatch|-ireplace|-is|-isnot|-isplit|-join|-le|-like|-lt|-match|-ne|-not|-notcontains|-notin|-notlike|-notmatch|-or|-regex|-replace|-shl|-shr|-split|-wildcard|-xor";
      let o = {
        $pattern: /-?[A-z\.\-]+\b/,
        keyword: "if else foreach return do while until elseif begin for trap data dynamicparam end break throw param continue finally in switch exit filter try process catch hidden static parameter",
        built_in: "ac asnp cat cd CFS chdir clc clear clhy cli clp cls clv cnsn compare copy cp cpi cpp curl cvpa dbp del diff dir dnsn ebp echo|0 epal epcsv epsn erase etsn exsn fc fhx fl ft fw gal gbp gc gcb gci gcm gcs gdr gerr ghy gi gin gjb gl gm gmo gp gps gpv group gsn gsnp gsv gtz gu gv gwmi h history icm iex ihy ii ipal ipcsv ipmo ipsn irm ise iwmi iwr kill lp ls man md measure mi mount move mp mv nal ndr ni nmo npssc nsn nv ogv oh popd ps pushd pwd r rbp rcjb rcsn rd rdr ren ri rjb rm rmdir rmo rni rnp rp rsn rsnp rujb rv rvpa rwmi sajb sal saps sasv sbp sc scb select set shcm si sl sleep sls sort sp spjb spps spsv start stz sujb sv swmi tee trcm type wget where wjb write"
      };
      let s = /\w[\w\d]*((-)[\w\d]+)*/;
      let i = {
        begin: "`[\\s\\S]",
        relevance: 0
      };
      let a = {
        className: "variable",
        variants: [{
          begin: /\$\B/
        }, {
          className: "keyword",
          begin: /\$this/
        }, {
          begin: /\$[\w\d][\w\d_:]*/
        }]
      };
      let l = {
        className: "literal",
        begin: /\$(null|true|false)\b/
      };
      let c = {
        className: "string",
        variants: [{
          begin: /"/,
          end: /"/
        }, {
          begin: /@"/,
          end: /^"@/
        }],
        contains: [i, a, {
          className: "variable",
          begin: /\$[A-z]/,
          end: /[^A-z]/
        }]
      };
      let u = {
        className: "string",
        variants: [{
          begin: /'/,
          end: /'/
        }, {
          begin: /@'/,
          end: /^'@/
        }]
      };
      let d = {
        className: "doctag",
        variants: [{
          begin: /\.(synopsis|description|example|inputs|outputs|notes|link|component|role|functionality)/
        }, {
          begin: /\.(parameter|forwardhelptargetname|forwardhelpcategory|remotehelprunspace|externalhelp)\s+\S+/
        }]
      };
      let p = e.inherit(e.COMMENT(null, null), {
        variants: [{
          begin: /#/,
          end: /$/
        }, {
          begin: /<#/,
          end: /#>/
        }],
        contains: [d]
      });
      let m = {
        className: "built_in",
        variants: [{
          begin: "(".concat(n, ")+(-)[\\w\\d]+")
        }]
      };
      let f = {
        className: "class",
        beginKeywords: "class enum",
        end: /\s*[{]/,
        excludeEnd: true,
        relevance: 0,
        contains: [e.TITLE_MODE]
      };
      let h = {
        className: "function",
        begin: /function\s+/,
        end: /\s*\{|$/,
        excludeEnd: true,
        returnBegin: true,
        relevance: 0,
        contains: [{
          begin: "function",
          relevance: 0,
          className: "keyword"
        }, {
          className: "title",
          begin: s,
          relevance: 0
        }, {
          begin: /\(/,
          end: /\)/,
          className: "params",
          relevance: 0,
          contains: [a]
        }]
      };
      let g = {
        begin: /using\s/,
        end: /$/,
        returnBegin: true,
        contains: [c, u, {
          className: "keyword",
          begin: /(using|assembly|command|module|namespace|type)/
        }]
      };
      let y = {
        variants: [{
          className: "operator",
          begin: "(".concat(r, ")\\b")
        }, {
          className: "literal",
          begin: /(-){1,2}[\w\d-]+/,
          relevance: 0
        }]
      };
      let _ = {
        className: "selector-tag",
        begin: /@\B/,
        relevance: 0
      };
      let b = {
        className: "function",
        begin: /\[.*\]\s*[\w]+[ ]??\(/,
        end: /$/,
        returnBegin: true,
        relevance: 0,
        contains: [{
          className: "keyword",
          begin: "(".concat(o.keyword.toString().replace(/\s/g, "|"), ")\\b"),
          endsParent: true,
          relevance: 0
        }, e.inherit(e.TITLE_MODE, {
          endsParent: true
        })]
      };
      let S = [b, p, i, e.NUMBER_MODE, c, u, m, a, l, _];
      let E = {
        begin: /\[/,
        end: /\]/,
        excludeBegin: true,
        excludeEnd: true,
        relevance: 0,
        contains: [].concat("self", S, {
          begin: "(" + t.join("|") + ")",
          className: "built_in",
          relevance: 0
        }, {
          className: "type",
          begin: /[\.\w\d]+/,
          relevance: 0
        })
      };
      b.contains.unshift(E);
      return {
        name: "PowerShell",
        aliases: ["pwsh", "ps", "ps1"],
        case_insensitive: true,
        keywords: o,
        contains: S.concat(f, h, g, y, E)
      };
    }
    Zwa.exports = jRp;
  });
  var nCa = __commonJS(($Xy, tCa) => {
    function qRp(e) {
      let t = e.regex;
      let n = ["displayHeight", "displayWidth", "mouseY", "mouseX", "mousePressed", "pmouseX", "pmouseY", "key", "keyCode", "pixels", "focused", "frameCount", "frameRate", "height", "width", "size", "createGraphics", "beginDraw", "createShape", "loadShape", "PShape", "arc", "ellipse", "line", "point", "quad", "rect", "triangle", "bezier", "bezierDetail", "bezierPoint", "bezierTangent", "curve", "curveDetail", "curvePoint", "curveTangent", "curveTightness", "shape", "shapeMode", "beginContour", "beginShape", "bezierVertex", "curveVertex", "endContour", "endShape", "quadraticVertex", "vertex", "ellipseMode", "noSmooth", "rectMode", "smooth", "strokeCap", "strokeJoin", "strokeWeight", "mouseClicked", "mouseDragged", "mouseMoved", "mousePressed", "mouseReleased", "mouseWheel", "keyPressed", "keyPressedkeyReleased", "keyTyped", "print", "println", "save", "saveFrame", "day", "hour", "millis", "minute", "month", "second", "year", "background", "clear", "colorMode", "fill", "noFill", "noStroke", "stroke", "alpha", "blue", "brightness", "color", "green", "hue", "lerpColor", "red", "saturation", "modelX", "modelY", "modelZ", "screenX", "screenY", "screenZ", "ambient", "emissive", "shininess", "specular", "add", "createImage", "beginCamera", "camera", "endCamera", "frustum", "ortho", "perspective", "printCamera", "printProjection", "cursor", "frameRate", "noCursor", "exit", "loop", "noLoop", "popStyle", "pushStyle", "redraw", "binary", "boolean", "byte", "char", "float", "hex", "int", "str", "unbinary", "unhex", "join", "match", "matchAll", "nf", "nfc", "nfp", "nfs", "split", "splitTokens", "trim", "append", "arrayCopy", "concat", "expand", "reverse", "shorten", "sort", "splice", "subset", "box", "sphere", "sphereDetail", "createInput", "createReader", "loadBytes", "loadJSONArray", "loadJSONObject", "loadStrings", "loadTable", "loadXML", "open", "parseXML", "saveTable", "selectFolder", "selectInput", "beginRaw", "beginRecord", "createOutput", "createWriter", "endRaw", "endRecord", "PrintWritersaveBytes", "saveJSONArray", "saveJSONObject", "saveStream", "saveStrings", "saveXML", "selectOutput", "popMatrix", "printMatrix", "pushMatrix", "resetMatrix", "rotate", "rotateX", "rotateY", "rotateZ", "scale", "shearX", "shearY", "translate", "ambientLight", "directionalLight", "lightFalloff", "lights", "lightSpecular", "noLights", "normal", "pointLight", "spotLight", "image", "imageMode", "loadImage", "noTint", "requestImage", "tint", "texture", "textureMode", "textureWrap", "blend", "copy", "filter", "get", "loadPixels", "set", "updatePixels", "blendMode", "loadShader", "PShaderresetShader", "shader", "createFont", "loadFont", "text", "textFont", "textAlign", "textLeading", "textMode", "textSize", "textWidth", "textAscent", "textDescent", "abs", "ceil", "constrain", "dist", "exp", "floor", "lerp", "log", "mag", "map", "max", "min", "norm", "pow", "round", "sq", "sqrt", "acos", "asin", "atan", "atan2", "cos", "degrees", "radians", "sin", "tan", "noise", "noiseDetail", "noiseSeed", "random", "randomGaussian", "randomSeed"];
      let r = e.IDENT_RE;
      let o = {
        variants: [{
          match: t.concat(t.either(...n), t.lookahead(/\s*\(/)),
          className: "built_in"
        }, {
          relevance: 0,
          match: t.concat(/\b(?!for|if|while)/, r, t.lookahead(/\s*\(/)),
          className: "title.function"
        }]
      };
      let s = {
        match: [/new\s+/, r],
        className: {
          1: "keyword",
          2: "class.title"
        }
      };
      let i = {
        relevance: 0,
        match: [/\./, r],
        className: {
          2: "property"
        }
      };
      let a = {
        variants: [{
          match: [/class/, /\s+/, r, /\s+/, /extends/, /\s+/, r]
        }, {
          match: [/class/, /\s+/, r]
        }],
        className: {
          1: "keyword",
          3: "title.class",
          5: "keyword",
          7: "title.class.inherited"
        }
      };
      let l = ["boolean", "byte", "char", "color", "double", "float", "int", "long", "short"];
      let c = ["BufferedReader", "PVector", "PFont", "PImage", "PGraphics", "HashMap", "String", "Array", "FloatDict", "ArrayList", "FloatList", "IntDict", "IntList", "JSONArray", "JSONObject", "Object", "StringDict", "StringList", "Table", "TableRow", "XML"];
      return {
        name: "Processing",
        aliases: ["pde"],
        keywords: {
          keyword: [...["abstract", "assert", "break", "case", "catch", "const", "continue", "default", "else", "enum", "final", "finally", "for", "if", "import", "instanceof", "long", "native", "new", "package", "private", "private", "protected", "protected", "public", "public", "return", "static", "strictfp", "switch", "synchronized", "throw", "throws", "transient", "try", "void", "volatile", "while"]],
          literal: "P2D P3D HALF_PI PI QUARTER_PI TAU TWO_PI null true false",
          title: "setup draw",
          variable: "super this",
          built_in: [...n, ...c],
          type: l
        },
        contains: [a, s, o, i, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE]
      };
    }
    tCa.exports = qRp;
  });
  var oCa = __commonJS((HXy, rCa) => {
    function WRp(e) {
      return {
        name: "Python profiler",
        contains: [e.C_NUMBER_MODE, {
          begin: "[a-zA-Z_][\\da-zA-Z_]+\\.[\\da-zA-Z_]{1,3}",
          end: ":",
          excludeEnd: true
        }, {
          begin: "(ncalls|tottime|cumtime)",
          end: "$",
          keywords: "ncalls tottime|10 cumtime|10 filename",
          relevance: 10
        }, {
          begin: "function calls",
          end: "$",
          contains: [e.C_NUMBER_MODE],
          relevance: 10
        }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, {
          className: "string",
          begin: "\\(",
          end: "\\)$",
          excludeBegin: true,
          excludeEnd: true,
          relevance: 0
        }]
      };
    }
    rCa.exports = WRp;
  });
  var iCa = __commonJS((jXy, sCa) => {
    function GRp(e) {
      let t = {
        begin: /[a-z][A-Za-z0-9_]*/,
        relevance: 0
      };
      let n = {
        className: "symbol",
        variants: [{
          begin: /[A-Z][a-zA-Z0-9_]*/
        }, {
          begin: /_[A-Za-z0-9_]*/
        }],
        relevance: 0
      };
      let r = {
        begin: /\(/,
        end: /\)/,
        relevance: 0
      };
      let o = {
        begin: /\[/,
        end: /\]/
      };
      let s = {
        className: "comment",
        begin: /%/,
        end: /$/,
        contains: [e.PHRASAL_WORDS_MODE]
      };
      let i = {
        className: "string",
        begin: /`/,
        end: /`/,
        contains: [e.BACKSLASH_ESCAPE]
      };
      let a = {
        className: "string",
        begin: /0'(\\'|.)/
      };
      let l = {
        className: "string",
        begin: /0'\\s/
      };
      let u = [t, n, r, {
        begin: /:-/
      }, o, s, e.C_BLOCK_COMMENT_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, i, a, l, e.C_NUMBER_MODE];
      r.contains = u;
      o.contains = u;
      return {
        name: "Prolog",
        contains: u.concat([{
          begin: /\.$/
        }])
      };
    }
    sCa.exports = GRp;
  });
  var lCa = __commonJS((qXy, aCa) => {
    function VRp(e) {
      let r = "[ \\t\\f]*[:=][ \\t\\f]*";
      let o = "[ \\t\\f]+";
      let s = "(" + r + "|[ \\t\\f]+)";
      let i = "([^\\\\:= \\t\\f\\n]|\\\\.)+";
      let a = {
        end: s,
        relevance: 0,
        starts: {
          className: "string",
          end: /$/,
          relevance: 0,
          contains: [{
            begin: "\\\\\\\\"
          }, {
            begin: "\\\\\\n"
          }]
        }
      };
      return {
        name: ".properties",
        disableAutodetect: true,
        case_insensitive: true,
        illegal: /\S/,
        contains: [e.COMMENT("^\\s*[!#]", "$"), {
          returnBegin: true,
          variants: [{
            begin: "([^\\\\:= \\t\\f\\n]|\\\\.)+" + r
          }, {
            begin: "([^\\\\:= \\t\\f\\n]|\\\\.)+[ \\t\\f]+"
          }],
          contains: [{
            className: "attr",
            begin: "([^\\\\:= \\t\\f\\n]|\\\\.)+",
            endsParent: true
          }],
          starts: a
        }, {
          className: "attr",
          begin: "([^\\\\:= \\t\\f\\n]|\\\\.)+[ \\t\\f]*$"
        }]
      };
    }
    aCa.exports = VRp;
  });
  var uCa = __commonJS((WXy, cCa) => {
    function zRp(e) {
      let t = ["package", "import", "option", "optional", "required", "repeated", "group", "oneof"];
      let n = ["double", "float", "int32", "int64", "uint32", "uint64", "sint32", "sint64", "fixed32", "fixed64", "sfixed32", "sfixed64", "bool", "string", "bytes"];
      let r = {
        match: [/(message|enum|service)\s+/, e.IDENT_RE],
        scope: {
          1: "keyword",
          2: "title.class"
        }
      };
      return {
        name: "Protocol Buffers",
        aliases: ["proto"],
        keywords: {
          keyword: t,
          type: n,
          literal: ["true", "false"]
        },
        contains: [e.QUOTE_STRING_MODE, e.NUMBER_MODE, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, r, {
          className: "function",
          beginKeywords: "rpc",
          end: /[{;]/,
          excludeEnd: true,
          keywords: "rpc returns"
        }, {
          begin: /^\s*[A-Z_]+(?=\s*=[^\n]+;$)/
        }]
      };
    }
    cCa.exports = zRp;
  });
  var pCa = __commonJS((GXy, dCa) => {
    function KRp(e) {
      let t = {
        keyword: "and case default else elsif false if in import enherits node or true undef unless main settings $string ",
        literal: "alias audit before loglevel noop require subscribe tag owner ensure group mode name|0 changes context force incl lens load_path onlyif provider returns root show_diff type_check en_address ip_address realname command environment hour monute month monthday special target weekday creates cwd ogoutput refresh refreshonly tries try_sleep umask backup checksum content ctime force ignore links mtime purge recurse recurselimit replace selinux_ignore_defaults selrange selrole seltype seluser source souirce_permissions sourceselect validate_cmd validate_replacement allowdupe attribute_membership auth_membership forcelocal gid ia_load_module members system host_aliases ip allowed_trunk_vlans description device_url duplex encapsulation etherchannel native_vlan speed principals allow_root auth_class auth_type authenticate_user k_of_n mechanisms rule session_owner shared options device fstype enable hasrestart directory present absent link atboot blockdevice device dump pass remounts poller_tag use message withpath adminfile allow_virtual allowcdrom category configfiles flavor install_options instance package_settings platform responsefile status uninstall_options vendor unless_system_user unless_uid binary control flags hasstatus manifest pattern restart running start stop allowdupe auths expiry gid groups home iterations key_membership keys managehome membership password password_max_age password_min_age profile_membership profiles project purge_ssh_keys role_membership roles salt shell uid baseurl cost descr enabled enablegroups exclude failovermethod gpgcheck gpgkey http_caching include includepkgs keepalive metadata_expire metalink mirrorlist priority protect proxy proxy_password proxy_username repo_gpgcheck s3_enabled skip_if_unavailable sslcacert sslclientcert sslclientkey sslverify mounted",
        built_in: "architecture augeasversion blockdevices boardmanufacturer boardproductname boardserialnumber cfkey dhcp_servers domain ec2_ ec2_userdata facterversion filesystems ldom fqdn gid hardwareisa hardwaremodel hostname id|0 interfaces ipaddress ipaddress_ ipaddress6 ipaddress6_ iphostnumber is_virtual kernel kernelmajversion kernelrelease kernelversion kernelrelease kernelversion lsbdistcodename lsbdistdescription lsbdistid lsbdistrelease lsbmajdistrelease lsbminordistrelease lsbrelease macaddress macaddress_ macosx_buildversion macosx_productname macosx_productversion macosx_productverson_major macosx_productversion_minor manufacturer memoryfree memorysize netmask metmask_ network_ operatingsystem operatingsystemmajrelease operatingsystemrelease osfamily partitions path physicalprocessorcount processor processorcount productname ps puppetversion rubysitedir rubyversion selinux selinux_config_mode selinux_config_policy selinux_current_mode selinux_current_mode selinux_enforced selinux_policyversion serialnumber sp_ sshdsakey sshecdsakey sshrsakey swapencrypted swapfree swapsize timezone type uniqueid uptime uptime_days uptime_hours uptime_seconds uuid virtual vlans xendomains zfs_version zonenae zones zpool_version"
      };
      let n = e.COMMENT("#", "$");
      let r = "([A-Za-z_]|::)(\\w|::)*";
      let o = e.inherit(e.TITLE_MODE, {
        begin: "([A-Za-z_]|::)(\\w|::)*"
      });
      let s = {
        className: "variable",
        begin: "\\$([A-Za-z_]|::)(\\w|::)*"
      };
      let i = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE, s],
        variants: [{
          begin: /'/,
          end: /'/
        }, {
          begin: /"/,
          end: /"/
        }]
      };
      return {
        name: "Puppet",
        aliases: ["pp"],
        contains: [n, s, i, {
          beginKeywords: "class",
          end: "\\{|;",
          illegal: /=/,
          contains: [o, n]
        }, {
          beginKeywords: "define",
          end: /\{/,
          contains: [{
            className: "section",
            begin: e.IDENT_RE,
            endsParent: true
          }]
        }, {
          begin: e.IDENT_RE + "\\s+\\{",
          returnBegin: true,
          end: /\S/,
          contains: [{
            className: "keyword",
            begin: e.IDENT_RE,
            relevance: 0.2
          }, {
            begin: /\{/,
            end: /\}/,
            keywords: t,
            relevance: 0,
            contains: [i, n, {
              begin: "[a-zA-Z_]+\\s*=>",
              returnBegin: true,
              end: "=>",
              contains: [{
                className: "attr",
                begin: e.IDENT_RE
              }]
            }, {
              className: "number",
              begin: "(\\b0[0-7_]+)|(\\b0x[0-9a-fA-F_]+)|(\\b[1-9][0-9_]*(\\.[0-9_]+)?)|[0_]\\b",
              relevance: 0
            }, s]
          }],
          relevance: 0
        }]
      };
    }
    dCa.exports = KRp;
  });
  var fCa = __commonJS((VXy, mCa) => {
    function YRp(e) {
      let t = {
        className: "string",
        begin: '(~)?"',
        end: '"',
        illegal: "\\n"
      };
      let n = {
        className: "symbol",
        begin: "#[a-zA-Z_]\\w*\\$?"
      };
      return {
        name: "PureBASIC",
        aliases: ["pb", "pbi"],
        keywords: "Align And Array As Break CallDebugger Case CompilerCase CompilerDefault CompilerElse CompilerElseIf CompilerEndIf CompilerEndSelect CompilerError CompilerIf CompilerSelect CompilerWarning Continue Data DataSection Debug DebugLevel Declare DeclareC DeclareCDLL DeclareDLL DeclareModule Default Define Dim DisableASM DisableDebugger DisableExplicit Else ElseIf EnableASM EnableDebugger EnableExplicit End EndDataSection EndDeclareModule EndEnumeration EndIf EndImport EndInterface EndMacro EndModule EndProcedure EndSelect EndStructure EndStructureUnion EndWith Enumeration EnumerationBinary Extends FakeReturn For ForEach ForEver Global Gosub Goto If Import ImportC IncludeBinary IncludeFile IncludePath Interface List Macro MacroExpandedCount Map Module NewList NewMap Next Not Or Procedure ProcedureC ProcedureCDLL ProcedureDLL ProcedureReturn Protected Prototype PrototypeC ReDim Read Repeat Restore Return Runtime Select Shared Static Step Structure StructureUnion Swap Threaded To UndefineMacro Until Until  UnuseModule UseModule Wend While With XIncludeFile XOr",
        contains: [e.COMMENT(";", "$", {
          relevance: 0
        }), {
          className: "function",
          begin: "\\b(Procedure|Declare)(C|CDLL|DLL)?\\b",
          end: "\\(",
          excludeEnd: true,
          returnBegin: true,
          contains: [{
            className: "keyword",
            begin: "(Procedure|Declare)(C|CDLL|DLL)?",
            excludeEnd: true
          }, {
            className: "type",
            begin: "\\.\\w*"
          }, e.UNDERSCORE_TITLE_MODE]
        }, t, n]
      };
    }
    mCa.exports = YRp;
  });
  var gCa = __commonJS((zXy, hCa) => {
    function JRp(e) {
      let t = e.regex;
      let n = /[\p{XID_Start}_]\p{XID_Continue}*/u;
      let r = ["and", "as", "assert", "async", "await", "break", "case", "class", "continue", "def", "del", "elif", "else", "except", "finally", "for", "from", "global", "if", "import", "in", "is", "lambda", "match", "nonlocal|10", "not", "or", "pass", "raise", "return", "try", "while", "with", "yield"];
      let a = {
        $pattern: /[A-Za-z]\w+|__\w+__/,
        keyword: r,
        built_in: ["__import__", "abs", "all", "any", "ascii", "bin", "bool", "breakpoint", "bytearray", "bytes", "callable", "chr", "classmethod", "compile", "complex", "delattr", "dict", "dir", "divmod", "enumerate", "eval", "exec", "filter", "float", "format", "frozenset", "getattr", "globals", "hasattr", "hash", "help", "hex", "id", "input", "int", "isinstance", "issubclass", "iter", "len", "list", "locals", "map", "max", "memoryview", "min", "next", "object", "oct", "open", "ord", "pow", "print", "property", "range", "repr", "reversed", "round", "set", "setattr", "slice", "sorted", "staticmethod", "str", "sum", "super", "tuple", "type", "vars", "zip"],
        literal: ["__debug__", "Ellipsis", "False", "None", "NotImplemented", "True"],
        type: ["Any", "Callable", "Coroutine", "Dict", "List", "Literal", "Generic", "Optional", "Sequence", "Set", "Tuple", "Type", "Union"]
      };
      let l = {
        className: "meta",
        begin: /^(>>>|\.\.\.) /
      };
      let c = {
        className: "subst",
        begin: /\{/,
        end: /\}/,
        keywords: a,
        illegal: /#/
      };
      let u = {
        begin: /\{\{/,
        relevance: 0
      };
      let d = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE],
        variants: [{
          begin: /([uU]|[bB]|[rR]|[bB][rR]|[rR][bB])?'''/,
          end: /'''/,
          contains: [e.BACKSLASH_ESCAPE, l],
          relevance: 10
        }, {
          begin: /([uU]|[bB]|[rR]|[bB][rR]|[rR][bB])?"""/,
          end: /"""/,
          contains: [e.BACKSLASH_ESCAPE, l],
          relevance: 10
        }, {
          begin: /([fF][rR]|[rR][fF]|[fF])'''/,
          end: /'''/,
          contains: [e.BACKSLASH_ESCAPE, l, u, c]
        }, {
          begin: /([fF][rR]|[rR][fF]|[fF])"""/,
          end: /"""/,
          contains: [e.BACKSLASH_ESCAPE, l, u, c]
        }, {
          begin: /([uU]|[rR])'/,
          end: /'/,
          relevance: 10
        }, {
          begin: /([uU]|[rR])"/,
          end: /"/,
          relevance: 10
        }, {
          begin: /([bB]|[bB][rR]|[rR][bB])'/,
          end: /'/
        }, {
          begin: /([bB]|[bB][rR]|[rR][bB])"/,
          end: /"/
        }, {
          begin: /([fF][rR]|[rR][fF]|[fF])'/,
          end: /'/,
          contains: [e.BACKSLASH_ESCAPE, u, c]
        }, {
          begin: /([fF][rR]|[rR][fF]|[fF])"/,
          end: /"/,
          contains: [e.BACKSLASH_ESCAPE, u, c]
        }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE]
      };
      let p = "[0-9](_?[0-9])*";
      let m = "(\\b([0-9](_?[0-9])*))?\\.([0-9](_?[0-9])*)|\\b([0-9](_?[0-9])*)\\.";
      let f = `\\b|${r.join("|")}`;
      let h = {
        className: "number",
        relevance: 0,
        variants: [{
          begin: `(\\b([0-9](_?[0-9])*)|((\\b([0-9](_?[0-9])*))?\\.([0-9](_?[0-9])*)|\\b([0-9](_?[0-9])*)\\.))[eE][+-]?([0-9](_?[0-9])*)[jJ]?(?=${f})`
        }, {
          begin: "((\\b([0-9](_?[0-9])*))?\\.([0-9](_?[0-9])*)|\\b([0-9](_?[0-9])*)\\.)[jJ]?"
        }, {
          begin: `\\b([1-9](_?[0-9])*|0+(_?0)*)[lLjJ]?(?=${f})`
        }, {
          begin: `\\b0[bB](_?[01])+[lL]?(?=${f})`
        }, {
          begin: `\\b0[oO](_?[0-7])+[lL]?(?=${f})`
        }, {
          begin: `\\b0[xX](_?[0-9a-fA-F])+[lL]?(?=${f})`
        }, {
          begin: `\\b([0-9](_?[0-9])*)[jJ](?=${f})`
        }]
      };
      let g = {
        className: "comment",
        begin: t.lookahead(/# type:/),
        end: /$/,
        keywords: a,
        contains: [{
          begin: /# type:/
        }, {
          begin: /#/,
          end: /\b\B/,
          endsWithParent: true
        }]
      };
      let y = {
        className: "params",
        variants: [{
          className: "",
          begin: /\(\s*\)/,
          skip: true
        }, {
          begin: /\(/,
          end: /\)/,
          excludeBegin: true,
          excludeEnd: true,
          keywords: a,
          contains: ["self", l, h, d, e.HASH_COMMENT_MODE]
        }]
      };
      c.contains = [d, h, l];
      return {
        name: "Python",
        aliases: ["py", "gyp", "ipython"],
        unicodeRegex: true,
        keywords: a,
        illegal: /(<\/|\?)|=>/,
        contains: [l, h, {
          scope: "variable.language",
          match: /\bself\b/
        }, {
          beginKeywords: "if",
          relevance: 0
        }, {
          match: /\bor\b/,
          scope: "keyword"
        }, d, g, e.HASH_COMMENT_MODE, {
          match: [/\bdef/, /\s+/, n],
          scope: {
            1: "keyword",
            3: "title.function"
          },
          contains: [y]
        }, {
          variants: [{
            match: [/\bclass/, /\s+/, n, /\s*/, /\(\s*/, n, /\s*\)/]
          }, {
            match: [/\bclass/, /\s+/, n]
          }],
          scope: {
            1: "keyword",
            3: "title.class",
            6: "title.class.inherited"
          }
        }, {
          className: "meta",
          begin: /^[\t ]*@/,
          end: /(?=#)|$/,
          contains: [h, y, d]
        }]
      };
    }
    hCa.exports = JRp;
  });
  var _Ca = __commonJS((KXy, yCa) => {
    function XRp(e) {
      return {
        aliases: ["pycon"],
        contains: [{
          className: "meta.prompt",
          starts: {
            end: / |$/,
            starts: {
              end: "$",
              subLanguage: "python"
            }
          },
          variants: [{
            begin: /^>>>(?=[ ]|$)/
          }, {
            begin: /^\.\.\.(?=[ ]|$)/
          }]
        }]
      };
    }
    yCa.exports = XRp;
  });
  var SCa = __commonJS((YXy, bCa) => {
    function QRp(e) {
      return {
        name: "Q",
        aliases: ["k", "kdb"],
        keywords: {
          $pattern: /(`?)[A-Za-z0-9_]+\b/,
          keyword: "do while select delete by update from",
          literal: "0b 1b",
          built_in: "neg not null string reciprocal floor ceiling signum mod xbar xlog and or each scan over prior mmu lsq inv md5 ltime gtime count first var dev med cov cor all any rand sums prds mins maxs fills deltas ratios avgs differ prev next rank reverse iasc idesc asc desc msum mcount mavg mdev xrank mmin mmax xprev rotate distinct group where flip type key til get value attr cut set upsert raze union inter except cross sv vs sublist enlist read0 read1 hopen hclose hdel hsym hcount peach system ltrim rtrim trim lower upper ssr view tables views cols xcols keys xkey xcol xasc xdesc fkeys meta lj aj aj0 ij pj asof uj ww wj wj1 fby xgroup ungroup ej save load rsave rload show csv parse eval min max avg wavg wsum sin cos tan sum",
          type: "`float `double int `timestamp `timespan `datetime `time `boolean `symbol `char `byte `short `long `real `month `date `minute `second `guid"
        },
        contains: [e.C_LINE_COMMENT_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE]
      };
    }
    bCa.exports = QRp;
  });
  var ECa = __commonJS((JXy, TCa) => {
    function ZRp(e) {
      let t = e.regex;
      let n = {
        keyword: "in of on if for while finally var new function do return void else break catch instanceof with throw case default try this switch continue typeof delete let yield const export super debugger as async await import",
        literal: "true false null undefined NaN Infinity",
        built_in: "eval isFinite isNaN parseFloat parseInt decodeURI decodeURIComponent encodeURI encodeURIComponent escape unescape Object Function Boolean Error EvalError InternalError RangeError ReferenceError StopIteration SyntaxError TypeError URIError Number Math Date String RegExp Array Float32Array Float64Array Int16Array Int32Array Int8Array Uint16Array Uint32Array Uint8Array Uint8ClampedArray ArrayBuffer DataView JSON Intl arguments require module console window document Symbol Set Map WeakSet WeakMap Proxy Reflect Behavior bool color coordinate date double enumeration font geocircle georectangle geoshape int list matrix4x4 parent point quaternion real rect size string url variant vector2d vector3d vector4d Promise"
      };
      let r = "[a-zA-Z_][a-zA-Z0-9\\._]*";
      let o = {
        className: "keyword",
        begin: "\\bproperty\\b",
        starts: {
          className: "string",
          end: "(:|=|;|,|//|/\\*|$)",
          returnEnd: true
        }
      };
      let s = {
        className: "keyword",
        begin: "\\bsignal\\b",
        starts: {
          className: "string",
          end: "(\\(|:|=|;|,|//|/\\*|$)",
          returnEnd: true
        }
      };
      let i = {
        className: "attribute",
        begin: "\\bid\\s*:",
        starts: {
          className: "string",
          end: "[a-zA-Z_][a-zA-Z0-9\\._]*",
          returnEnd: false
        }
      };
      let a = {
        begin: "[a-zA-Z_][a-zA-Z0-9\\._]*\\s*:",
        returnBegin: true,
        contains: [{
          className: "attribute",
          begin: "[a-zA-Z_][a-zA-Z0-9\\._]*",
          end: "\\s*:",
          excludeEnd: true,
          relevance: 0
        }],
        relevance: 0
      };
      let l = {
        begin: t.concat("[a-zA-Z_][a-zA-Z0-9\\._]*", /\s*\{/),
        end: /\{/,
        returnBegin: true,
        relevance: 0,
        contains: [e.inherit(e.TITLE_MODE, {
          begin: "[a-zA-Z_][a-zA-Z0-9\\._]*"
        })]
      };
      return {
        name: "QML",
        aliases: ["qt"],
        case_insensitive: false,
        keywords: n,
        contains: [{
          className: "meta",
          begin: /^\s*['"]use (strict|asm)['"]/
        }, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, {
          className: "string",
          begin: "`",
          end: "`",
          contains: [e.BACKSLASH_ESCAPE, {
            className: "subst",
            begin: "\\$\\{",
            end: "\\}"
          }]
        }, e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, {
          className: "number",
          variants: [{
            begin: "\\b(0[bB][01]+)"
          }, {
            begin: "\\b(0[oO][0-7]+)"
          }, {
            begin: e.C_NUMBER_RE
          }],
          relevance: 0
        }, {
          begin: "(" + e.RE_STARTERS_RE + "|\\b(case|return|throw)\\b)\\s*",
          keywords: "return throw case",
          contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.REGEXP_MODE, {
            begin: /</,
            end: />\s*[);\]]/,
            relevance: 0,
            subLanguage: "xml"
          }],
          relevance: 0
        }, s, o, {
          className: "function",
          beginKeywords: "function",
          end: /\{/,
          excludeEnd: true,
          contains: [e.inherit(e.TITLE_MODE, {
            begin: /[A-Za-z$_][0-9A-Za-z$_]*/
          }), {
            className: "params",
            begin: /\(/,
            end: /\)/,
            excludeBegin: true,
            excludeEnd: true,
            contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE]
          }],
          illegal: /\[|%/
        }, {
          begin: "\\." + e.IDENT_RE,
          relevance: 0
        }, i, a, l],
        illegal: /#/
      };
    }
    TCa.exports = ZRp;
  });
  var wCa = __commonJS((XXy, vCa) => {
    function exp(e) {
      let t = e.regex;
      let n = /(?:(?:[a-zA-Z]|\.[._a-zA-Z])[._a-zA-Z0-9]*)|\.(?!\d)/;
      let r = t.either(/0[xX][0-9a-fA-F]+\.[0-9a-fA-F]*[pP][+-]?\d+i?/, /0[xX][0-9a-fA-F]+(?:[pP][+-]?\d+)?[Li]?/, /(?:\d+(?:\.\d*)?|\.\d+)(?:[eE][+-]?\d+)?[Li]?/);
      let o = /[=!<>:]=|\|\||&&|:::?|<-|<<-|->>|->|\|>|[-+*\/?!$&|:<=>@^~]|\*\*/;
      let s = t.either(/[()]/, /[{}]/, /\[\[/, /[[\]]/, /\\/, /,/);
      return {
        name: "R",
        keywords: {
          $pattern: n,
          keyword: "function if in break next repeat else for while",
          literal: "NULL NA TRUE FALSE Inf NaN NA_integer_|10 NA_real_|10 NA_character_|10 NA_complex_|10",
          built_in: "LETTERS letters month.abb month.name pi T F abs acos acosh all any anyNA Arg as.call as.character as.complex as.double as.environment as.integer as.logical as.null.default as.numeric as.raw asin asinh atan atanh attr attributes baseenv browser c call ceiling class Conj cos cosh cospi cummax cummin cumprod cumsum digamma dim dimnames emptyenv exp expression floor forceAndCall gamma gc.time globalenv Im interactive invisible is.array is.atomic is.call is.character is.complex is.double is.environment is.expression is.finite is.function is.infinite is.integer is.language is.list is.logical is.matrix is.na is.name is.nan is.null is.numeric is.object is.pairlist is.raw is.recursive is.single is.symbol lazyLoadDBfetch length lgamma list log max min missing Mod names nargs nzchar oldClass on.exit pos.to.env proc.time prod quote range Re rep retracemem return round seq_along seq_len seq.int sign signif sin sinh sinpi sqrt standardGeneric substitute sum switch tan tanh tanpi tracemem trigamma trunc unclass untracemem UseMethod xtfrm"
        },
        contains: [e.COMMENT(/#'/, /$/, {
          contains: [{
            scope: "doctag",
            match: /@examples/,
            starts: {
              end: t.lookahead(t.either(/\n^#'\s*(?=@[a-zA-Z]+)/, /\n^(?!#')/)),
              endsParent: true
            }
          }, {
            scope: "doctag",
            begin: "@param",
            end: /$/,
            contains: [{
              scope: "variable",
              variants: [{
                match: n
              }, {
                match: /`(?:\\.|[^`\\])+`/
              }],
              endsParent: true
            }]
          }, {
            scope: "doctag",
            match: /@[a-zA-Z]+/
          }, {
            scope: "keyword",
            match: /\\[a-zA-Z]+/
          }]
        }), e.HASH_COMMENT_MODE, {
          scope: "string",
          contains: [e.BACKSLASH_ESCAPE],
          variants: [e.END_SAME_AS_BEGIN({
            begin: /[rR]"(-*)\(/,
            end: /\)(-*)"/
          }), e.END_SAME_AS_BEGIN({
            begin: /[rR]"(-*)\{/,
            end: /\}(-*)"/
          }), e.END_SAME_AS_BEGIN({
            begin: /[rR]"(-*)\[/,
            end: /\](-*)"/
          }), e.END_SAME_AS_BEGIN({
            begin: /[rR]'(-*)\(/,
            end: /\)(-*)'/
          }), e.END_SAME_AS_BEGIN({
            begin: /[rR]'(-*)\{/,
            end: /\}(-*)'/
          }), e.END_SAME_AS_BEGIN({
            begin: /[rR]'(-*)\[/,
            end: /\](-*)'/
          }), {
            begin: '"',
            end: '"',
            relevance: 0
          }, {
            begin: "'",
            end: "'",
            relevance: 0
          }]
        }, {
          relevance: 0,
          variants: [{
            scope: {
              1: "operator",
              2: "number"
            },
            match: [o, r]
          }, {
            scope: {
              1: "operator",
              2: "number"
            },
            match: [/%[^%]*%/, r]
          }, {
            scope: {
              1: "punctuation",
              2: "number"
            },
            match: [s, r]
          }, {
            scope: {
              2: "number"
            },
            match: [/[^a-zA-Z0-9._]|^/, r]
          }]
        }, {
          scope: {
            3: "operator"
          },
          match: [n, /\s+/, /<-/, /\s+/]
        }, {
          scope: "operator",
          relevance: 0,
          variants: [{
            match: o
          }, {
            match: /%[^%]*%/
          }]
        }, {
          scope: "punctuation",
          relevance: 0,
          match: s
        }, {
          begin: "`",
          end: "`",
          contains: [{
            begin: /\\./
          }]
        }]
      };
    }
    vCa.exports = exp;
  });
  var RCa = __commonJS((QXy, CCa) => {
    function txp(e) {
      return {
        name: "ReasonML",
        aliases: ["re"],
        keywords: {
          $pattern: /[a-z_]\w*!?/,
          keyword: ["and", "as", "asr", "assert", "begin", "class", "constraint", "do", "done", "downto", "else", "end", "esfun", "exception", "external", "for", "fun", "function", "functor", "if", "in", "include", "inherit", "initializer", "land", "lazy", "let", "lor", "lsl", "lsr", "lxor", "mod", "module", "mutable", "new", "nonrec", "object", "of", "open", "or", "pri", "pub", "rec", "sig", "struct", "switch", "then", "to", "try", "type", "val", "virtual", "when", "while", "with"],
          built_in: ["array", "bool", "bytes", "char", "exn|5", "float", "int", "int32", "int64", "list", "lazy_t|5", "nativeint|5", "ref", "string", "unit"],
          literal: ["true", "false"]
        },
        illegal: /(:-|:=|\$\{|\+=)/,
        contains: [{
          scope: "literal",
          match: /\[(\|\|)?\]|\(\)/,
          relevance: 0
        }, e.C_LINE_COMMENT_MODE, e.COMMENT(/\/\*/, /\*\//, {
          illegal: /^(#,\/\/)/
        }), {
          scope: "symbol",
          match: /\'[A-Za-z_](?!\')[\w\']*/
        }, {
          scope: "type",
          match: /`[A-Z][\w\']*/
        }, {
          scope: "type",
          match: /\b[A-Z][\w\']*/,
          relevance: 0
        }, {
          match: /[a-z_]\w*\'[\w\']*/,
          relevance: 0
        }, {
          scope: "operator",
          match: /\s+(\|\||\+[\+\.]?|\*[\*\/\.]?|\/[\.]?|\.\.\.|\|>|&&|===?)\s+/,
          relevance: 0
        }, e.inherit(e.APOS_STRING_MODE, {
          scope: "string",
          relevance: 0
        }), e.inherit(e.QUOTE_STRING_MODE, {
          illegal: null
        }), {
          scope: "number",
          variants: [{
            match: /\b0[xX][a-fA-F0-9_]+[Lln]?/
          }, {
            match: /\b0[oO][0-7_]+[Lln]?/
          }, {
            match: /\b0[bB][01_]+[Lln]?/
          }, {
            match: /\b[0-9][0-9_]*([Lln]|(\.[0-9_]*)?([eE][-+]?[0-9_]+)?)/
          }],
          relevance: 0
        }]
      };
    }
    CCa.exports = txp;
  });
  var kCa = __commonJS((ZXy, xCa) => {
    function nxp(e) {
      return {
        name: "RenderMan RIB",
        keywords: "ArchiveRecord AreaLightSource Atmosphere Attribute AttributeBegin AttributeEnd Basis Begin Blobby Bound Clipping ClippingPlane Color ColorSamples ConcatTransform Cone CoordinateSystem CoordSysTransform CropWindow Curves Cylinder DepthOfField Detail DetailRange Disk Displacement Display End ErrorHandler Exposure Exterior Format FrameAspectRatio FrameBegin FrameEnd GeneralPolygon GeometricApproximation Geometry Hider Hyperboloid Identity Illuminate Imager Interior LightSource MakeCubeFaceEnvironment MakeLatLongEnvironment MakeShadow MakeTexture Matte MotionBegin MotionEnd NuPatch ObjectBegin ObjectEnd ObjectInstance Opacity Option Orientation Paraboloid Patch PatchMesh Perspective PixelFilter PixelSamples PixelVariance Points PointsGeneralPolygons PointsPolygons Polygon Procedural Projection Quantize ReadArchive RelativeDetail ReverseOrientation Rotate Scale ScreenWindow ShadingInterpolation ShadingRate Shutter Sides Skew SolidBegin SolidEnd Sphere SubdivisionMesh Surface TextureCoordinates Torus Transform TransformBegin TransformEnd TransformPoints Translate TrimCurve WorldBegin WorldEnd",
        illegal: "</",
        contains: [e.HASH_COMMENT_MODE, e.C_NUMBER_MODE, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE]
      };
    }
    xCa.exports = nxp;
  });
  var ICa = __commonJS((eQy, ACa) => {
    function rxp(e) {
      let n = {
        className: "attribute",
        begin: /[a-zA-Z-_]+/,
        end: /\s*:/,
        excludeEnd: true,
        starts: {
          end: ";",
          relevance: 0,
          contains: [{
            className: "variable",
            begin: /\.[a-zA-Z-_]+/
          }, {
            className: "keyword",
            begin: /\(optional\)/
          }]
        }
      };
      return {
        name: "Roboconf",
        aliases: ["graph", "instances"],
        case_insensitive: true,
        keywords: "import",
        contains: [{
          begin: "^facet [a-zA-Z-_][^\\n{]+\\{",
          end: /\}/,
          keywords: "facet",
          contains: [n, e.HASH_COMMENT_MODE]
        }, {
          begin: "^\\s*instance of [a-zA-Z-_][^\\n{]+\\{",
          end: /\}/,
          keywords: "name count channels instance-data instance-state instance of",
          illegal: /\S/,
          contains: ["self", n, e.HASH_COMMENT_MODE]
        }, {
          begin: "^[a-zA-Z-_][^\\n{]+\\{",
          end: /\}/,
          contains: [n, e.HASH_COMMENT_MODE]
        }, e.HASH_COMMENT_MODE]
      };
    }
    ACa.exports = rxp;
  });
  var OCa = __commonJS((tQy, PCa) => {
    function oxp(e) {
      let i = {
        className: "variable",
        variants: [{
          begin: /\$[\w\d#@][\w\d_]*/
        }, {
          begin: /\$\{(.*?)\}/
        }]
      };
      let a = {
        className: "string",
        begin: /"/,
        end: /"/,
        contains: [e.BACKSLASH_ESCAPE, i, {
          className: "variable",
          begin: /\$\(/,
          end: /\)/,
          contains: [e.BACKSLASH_ESCAPE]
        }]
      };
      let l = {
        className: "string",
        begin: /'/,
        end: /'/
      };
      return {
        name: "MikroTik RouterOS script",
        aliases: ["mikrotik"],
        case_insensitive: true,
        keywords: {
          $pattern: /:?[\w-]+/,
          literal: "true false yes no nothing nil null",
          keyword: "foreach do while for if from to step else on-error and or not in :" + "foreach do while for if from to step else on-error and or not in".split(" ").join(" :") + " :" + "global local beep delay put len typeof pick log time set find environment terminal error execute parse resolve toarray tobool toid toip toip6 tonum tostr totime".split(" ").join(" :")
        },
        contains: [{
          variants: [{
            begin: /\/\*/,
            end: /\*\//
          }, {
            begin: /\/\//,
            end: /$/
          }, {
            begin: /<\//,
            end: />/
          }],
          illegal: /./
        }, e.COMMENT("^#", "$"), a, l, i, {
          begin: /[\w-]+=([^\s{}[\]()>]+)/,
          relevance: 0,
          returnBegin: true,
          contains: [{
            className: "attribute",
            begin: /[^=]+/
          }, {
            begin: /=/,
            endsWithParent: true,
            relevance: 0,
            contains: [a, l, i, {
              className: "literal",
              begin: "\\b(" + "true false yes no nothing nil null".split(" ").join("|") + ")\\b"
            }, {
              begin: /("[^"]*"|[^\s{}[\]]+)/
            }]
          }]
        }, {
          className: "number",
          begin: /\*[0-9a-fA-F]+/
        }, {
          begin: "\\b(" + "add remove enable disable set get print export edit find run debug error info warning".split(" ").join("|") + ")([\\s[(\\]|])",
          returnBegin: true,
          contains: [{
            className: "built_in",
            begin: /\w+/
          }]
        }, {
          className: "built_in",
          variants: [{
            begin: "(\\.\\./|/|\\s)((" + "traffic-flow traffic-generator firewall scheduler aaa accounting address-list address align area bandwidth-server bfd bgp bridge client clock community config connection console customer default dhcp-client dhcp-server discovery dns e-mail ethernet filter firmware gps graphing group hardware health hotspot identity igmp-proxy incoming instance interface ip ipsec ipv6 irq l2tp-server lcd ldp logging mac-server mac-winbox mangle manual mirror mme mpls nat nd neighbor network note ntp ospf ospf-v3 ovpn-server page peer pim ping policy pool port ppp pppoe-client pptp-server prefix profile proposal proxy queue radius resource rip ripng route routing screen script security-profiles server service service-port settings shares smb sms sniffer snmp snooper socks sstp-server system tool tracking type upgrade upnp user-manager users user vlan secret vrrp watchdog web-access wireless pptp pppoe lan wan layer7-protocol lease simple raw".split(" ").join("|") + ");?\\s)+"
          }, {
            begin: /\.\./,
            relevance: 0
          }]
        }]
      };
    }
    PCa.exports = oxp;
  });
  var MCa = __commonJS((nQy, DCa) => {
    function sxp(e) {
      let t = ["abs", "acos", "ambient", "area", "asin", "atan", "atmosphere", "attribute", "calculatenormal", "ceil", "cellnoise", "clamp", "comp", "concat", "cos", "degrees", "depth", "Deriv", "diffuse", "distance", "Du", "Dv", "environment", "exp", "faceforward", "filterstep", "floor", "format", "fresnel", "incident", "length", "lightsource", "log", "match", "max", "min", "mod", "noise", "normalize", "ntransform", "opposite", "option", "phong", "pnoise", "pow", "printf", "ptlined", "radians", "random", "reflect", "refract", "renderinfo", "round", "setcomp", "setxcomp", "setycomp", "setzcomp", "shadow", "sign", "sin", "smoothstep", "specular", "specularbrdf", "spline", "sqrt", "step", "tan", "texture", "textureinfo", "trace", "transform", "vtransform", "xcomp", "ycomp", "zcomp"];
      let n = ["matrix", "float", "color", "point", "normal", "vector"];
      let r = ["while", "for", "if", "do", "return", "else", "break", "extern", "continue"];
      let o = {
        match: [/(surface|displacement|light|volume|imager)/, /\s+/, e.IDENT_RE],
        scope: {
          1: "keyword",
          3: "title.class"
        }
      };
      return {
        name: "RenderMan RSL",
        keywords: {
          keyword: r,
          built_in: t,
          type: n
        },
        illegal: "</",
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.QUOTE_STRING_MODE, e.APOS_STRING_MODE, e.C_NUMBER_MODE, {
          className: "meta",
          begin: "#",
          end: "$"
        }, o, {
          beginKeywords: "illuminate illuminance gather",
          end: "\\("
        }]
      };
    }
    DCa.exports = sxp;
  });
  var LCa = __commonJS((rQy, NCa) => {
    function ixp(e) {
      let t = e.regex;
      let n = "([a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|=~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~`|]|\\[\\]=?)";
      let r = t.either(/\b([A-Z]+[a-z0-9]+)+/, /\b([A-Z]+[a-z0-9]+)+[A-Z]+/);
      let o = t.concat(r, /(::\w+)*/);
      let i = {
        "variable.constant": ["__FILE__", "__LINE__", "__ENCODING__"],
        "variable.language": ["self", "super"],
        keyword: ["alias", "and", "begin", "BEGIN", "break", "case", "class", "defined", "do", "else", "elsif", "end", "END", "ensure", "for", "if", "in", "module", "next", "not", "or", "redo", "require", "rescue", "retry", "return", "then", "undef", "unless", "until", "when", "while", "yield", ...["include", "extend", "prepend", "public", "private", "protected", "raise", "throw"]],
        built_in: ["proc", "lambda", "attr_accessor", "attr_reader", "attr_writer", "define_method", "private_constant", "module_function"],
        literal: ["true", "false", "nil"]
      };
      let a = {
        className: "doctag",
        begin: "@[A-Za-z]+"
      };
      let l = {
        begin: "#<",
        end: ">"
      };
      let c = [e.COMMENT("#", "$", {
        contains: [a]
      }), e.COMMENT("^=begin", "^=end", {
        contains: [a],
        relevance: 10
      }), e.COMMENT("^__END__", e.MATCH_NOTHING_RE)];
      let u = {
        className: "subst",
        begin: /#\{/,
        end: /\}/,
        keywords: i
      };
      let d = {
        className: "string",
        contains: [e.BACKSLASH_ESCAPE, u],
        variants: [{
          begin: /'/,
          end: /'/
        }, {
          begin: /"/,
          end: /"/
        }, {
          begin: /`/,
          end: /`/
        }, {
          begin: /%[qQwWx]?\(/,
          end: /\)/
        }, {
          begin: /%[qQwWx]?\[/,
          end: /\]/
        }, {
          begin: /%[qQwWx]?\{/,
          end: /\}/
        }, {
          begin: /%[qQwWx]?</,
          end: />/
        }, {
          begin: /%[qQwWx]?\//,
          end: /\//
        }, {
          begin: /%[qQwWx]?%/,
          end: /%/
        }, {
          begin: /%[qQwWx]?-/,
          end: /-/
        }, {
          begin: /%[qQwWx]?\|/,
          end: /\|/
        }, {
          begin: /\B\?(\\\d{1,3})/
        }, {
          begin: /\B\?(\\x[A-Fa-f0-9]{1,2})/
        }, {
          begin: /\B\?(\\u\{?[A-Fa-f0-9]{1,6}\}?)/
        }, {
          begin: /\B\?(\\M-\\C-|\\M-\\c|\\c\\M-|\\M-|\\C-\\M-)[\x20-\x7e]/
        }, {
          begin: /\B\?\\(c|C-)[\x20-\x7e]/
        }, {
          begin: /\B\?\\?\S/
        }, {
          begin: t.concat(/<<[-~]?'?/, t.lookahead(/(\w+)(?=\W)[^\n]*\n(?:[^\n]*\n)*?\s*\1\b/)),
          contains: [e.END_SAME_AS_BEGIN({
            begin: /(\w+)/,
            end: /(\w+)/,
            contains: [e.BACKSLASH_ESCAPE, u]
          })]
        }]
      };
      let p = "[1-9](_?[0-9])*|0";
      let m = "[0-9](_?[0-9])*";
      let f = {
        className: "number",
        relevance: 0,
        variants: [{
          begin: "\\b([1-9](_?[0-9])*|0)(\\.([0-9](_?[0-9])*))?([eE][+-]?([0-9](_?[0-9])*)|r)?i?\\b"
        }, {
          begin: "\\b0[dD][0-9](_?[0-9])*r?i?\\b"
        }, {
          begin: "\\b0[bB][0-1](_?[0-1])*r?i?\\b"
        }, {
          begin: "\\b0[oO][0-7](_?[0-7])*r?i?\\b"
        }, {
          begin: "\\b0[xX][0-9a-fA-F](_?[0-9a-fA-F])*r?i?\\b"
        }, {
          begin: "\\b0(_?[0-7])+r?i?\\b"
        }]
      };
      let h = {
        variants: [{
          match: /\(\)/
        }, {
          className: "params",
          begin: /\(/,
          end: /(?=\))/,
          excludeBegin: true,
          endsParent: true,
          keywords: i
        }]
      };
      let C = [d, {
        variants: [{
          match: [/class\s+/, o, /\s+<\s+/, o]
        }, {
          match: [/\b(class|module)\s+/, o]
        }],
        scope: {
          2: "title.class",
          4: "title.class.inherited"
        },
        keywords: i
      }, {
        match: [/(include|extend)\s+/, o],
        scope: {
          2: "title.class"
        },
        keywords: i
      }, {
        relevance: 0,
        match: [o, /\.new[. (]/],
        scope: {
          1: "title.class"
        }
      }, {
        relevance: 0,
        match: /\b[A-Z][A-Z_0-9]+\b/,
        className: "variable.constant"
      }, {
        relevance: 0,
        match: r,
        scope: "title.class"
      }, {
        match: [/def/, /\s+/, "([a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|=~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~`|]|\\[\\]=?)"],
        scope: {
          1: "keyword",
          3: "title.function"
        },
        contains: [h]
      }, {
        begin: e.IDENT_RE + "::"
      }, {
        className: "symbol",
        begin: e.UNDERSCORE_IDENT_RE + "(!|\\?)?:",
        relevance: 0
      }, {
        className: "symbol",
        begin: ":(?!\\s)",
        contains: [d, {
          begin: "([a-zA-Z_]\\w*[!?=]?|[-+~]@|<<|>>|=~|===?|<=>|[<>]=?|\\*\\*|[-/+%^&*~`|]|\\[\\]=?)"
        }],
        relevance: 0
      }, f, {
        className: "variable",
        begin: "(\\$\\W)|((\\$|@@?)(\\w+))(?=[^@$?])(?![A-Za-z])(?![@$?'])"
      }, {
        className: "params",
        begin: /\|(?!=)/,
        end: /\|/,
        excludeBegin: true,
        excludeEnd: true,
        relevance: 0,
        keywords: i
      }, {
        begin: "(" + e.RE_STARTERS_RE + "|unless)\\s*",
        keywords: "unless",
        contains: [{
          className: "regexp",
          contains: [e.BACKSLASH_ESCAPE, u],
          illegal: /\n/,
          variants: [{
            begin: "/",
            end: "/[a-z]*"
          }, {
            begin: /%r\{/,
            end: /\}[a-z]*/
          }, {
            begin: "%r\\(",
            end: "\\)[a-z]*"
          }, {
            begin: "%r!",
            end: "![a-z]*"
          }, {
            begin: "%r\\[",
            end: "\\][a-z]*"
          }]
        }].concat(l, c),
        relevance: 0
      }].concat(l, c);
      u.contains = C;
      h.contains = C;
      let x = "[>?]>";
      let A = "[\\w#]+\\(\\w+\\):\\d+:\\d+[>*]";
      let k = "(\\w+-)?\\d+\\.\\d+\\.\\d+(p\\d+)?[^\\d][^>]+>";
      let I = [{
        begin: /^\s*=>/,
        starts: {
          end: "$",
          contains: C
        }
      }, {
        className: "meta.prompt",
        begin: "^(" + x + "|" + A + "|" + k + ")(?=[ ])",
        starts: {
          end: "$",
          keywords: i,
          contains: C
        }
      }];
      c.unshift(l);
      return {
        name: "Ruby",
        aliases: ["rb", "gemspec", "podspec", "thor", "irb"],
        keywords: i,
        illegal: /\/\*/,
        contains: [e.SHEBANG({
          binary: "ruby"
        })].concat(I).concat(c).concat(C)
      };
    }
    NCa.exports = ixp;
  });
  var UCa = __commonJS((oQy, FCa) => {
    function axp(e) {
      return {
        name: "Oracle Rules Language",
        keywords: {
          keyword: "BILL_PERIOD BILL_START BILL_STOP RS_EFFECTIVE_START RS_EFFECTIVE_STOP RS_JURIS_CODE RS_OPCO_CODE INTDADDATTRIBUTE|5 INTDADDVMSG|5 INTDBLOCKOP|5 INTDBLOCKOPNA|5 INTDCLOSE|5 INTDCOUNT|5 INTDCOUNTSTATUSCODE|5 INTDCREATEMASK|5 INTDCREATEDAYMASK|5 INTDCREATEFACTORMASK|5 INTDCREATEHANDLE|5 INTDCREATEOVERRIDEDAYMASK|5 INTDCREATEOVERRIDEMASK|5 INTDCREATESTATUSCODEMASK|5 INTDCREATETOUPERIOD|5 INTDDELETE|5 INTDDIPTEST|5 INTDEXPORT|5 INTDGETERRORCODE|5 INTDGETERRORMESSAGE|5 INTDISEQUAL|5 INTDJOIN|5 INTDLOAD|5 INTDLOADACTUALCUT|5 INTDLOADDATES|5 INTDLOADHIST|5 INTDLOADLIST|5 INTDLOADLISTDATES|5 INTDLOADLISTENERGY|5 INTDLOADLISTHIST|5 INTDLOADRELATEDCHANNEL|5 INTDLOADSP|5 INTDLOADSTAGING|5 INTDLOADUOM|5 INTDLOADUOMDATES|5 INTDLOADUOMHIST|5 INTDLOADVERSION|5 INTDOPEN|5 INTDREADFIRST|5 INTDREADNEXT|5 INTDRECCOUNT|5 INTDRELEASE|5 INTDREPLACE|5 INTDROLLAVG|5 INTDROLLPEAK|5 INTDSCALAROP|5 INTDSCALE|5 INTDSETATTRIBUTE|5 INTDSETDSTPARTICIPANT|5 INTDSETSTRING|5 INTDSETVALUE|5 INTDSETVALUESTATUS|5 INTDSHIFTSTARTTIME|5 INTDSMOOTH|5 INTDSORT|5 INTDSPIKETEST|5 INTDSUBSET|5 INTDTOU|5 INTDTOURELEASE|5 INTDTOUVALUE|5 INTDUPDATESTATS|5 INTDVALUE|5 STDEV INTDDELETEEX|5 INTDLOADEXACTUAL|5 INTDLOADEXCUT|5 INTDLOADEXDATES|5 INTDLOADEX|5 INTDLOADEXRELATEDCHANNEL|5 INTDSAVEEX|5 MVLOAD|5 MVLOADACCT|5 MVLOADACCTDATES|5 MVLOADACCTHIST|5 MVLOADDATES|5 MVLOADHIST|5 MVLOADLIST|5 MVLOADLISTDATES|5 MVLOADLISTHIST|5 IF FOR NEXT DONE SELECT END CALL ABORT CLEAR CHANNEL FACTOR LIST NUMBER OVERRIDE SET WEEK DISTRIBUTIONNODE ELSE WHEN THEN OTHERWISE IENUM CSV INCLUDE LEAVE RIDER SAVE DELETE NOVALUE SECTION WARN SAVE_UPDATE DETERMINANT LABEL REPORT REVENUE EACH IN FROM TOTAL CHARGE BLOCK AND OR CSV_FILE RATE_CODE AUXILIARY_DEMAND UIDACCOUNT RS BILL_PERIOD_SELECT HOURS_PER_MONTH INTD_ERROR_STOP SEASON_SCHEDULE_NAME ACCOUNTFACTOR ARRAYUPPERBOUND CALLSTOREDPROC GETADOCONNECTION GETCONNECT GETDATASOURCE GETQUALIFIER GETUSERID HASVALUE LISTCOUNT LISTOP LISTUPDATE LISTVALUE PRORATEFACTOR RSPRORATE SETBINPATH SETDBMONITOR WQ_OPEN BILLINGHOURS DATE DATEFROMFLOAT DATETIMEFROMSTRING DATETIMETOSTRING DATETOFLOAT DAY DAYDIFF DAYNAME DBDATETIME HOUR MINUTE MONTH MONTHDIFF MONTHHOURS MONTHNAME ROUNDDATE SAMEWEEKDAYLASTYEAR SECOND WEEKDAY WEEKDIFF YEAR YEARDAY YEARSTR COMPSUM HISTCOUNT HISTMAX HISTMIN HISTMINNZ HISTVALUE MAXNRANGE MAXRANGE MINRANGE COMPIKVA COMPKVA COMPKVARFROMKQKW COMPLF IDATTR FLAG LF2KW LF2KWH MAXKW POWERFACTOR READING2USAGE AVGSEASON MAXSEASON MONTHLYMERGE SEASONVALUE SUMSEASON ACCTREADDATES ACCTTABLELOAD CONFIGADD CONFIGGET CREATEOBJECT CREATEREPORT EMAILCLIENT EXPBLKMDMUSAGE EXPMDMUSAGE EXPORT_USAGE FACTORINEFFECT GETUSERSPECIFIEDSTOP INEFFECT ISHOLIDAY RUNRATE SAVE_PROFILE SETREPORTTITLE USEREXIT WATFORRUNRATE TO TABLE ACOS ASIN ATAN ATAN2 BITAND CEIL COS COSECANT COSH COTANGENT DIVQUOT DIVREM EXP FABS FLOOR FMOD FREPM FREXPN LOG LOG10 MAX MAXN MIN MINNZ MODF POW ROUND ROUND2VALUE ROUNDINT SECANT SIN SINH SQROOT TAN TANH FLOAT2STRING FLOAT2STRINGNC INSTR LEFT LEN LTRIM MID RIGHT RTRIM STRING STRINGNC TOLOWER TOUPPER TRIM NUMDAYS READ_DATE STAGING",
          built_in: "IDENTIFIER OPTIONS XML_ELEMENT XML_OP XML_ELEMENT_OF DOMDOCCREATE DOMDOCLOADFILE DOMDOCLOADXML DOMDOCSAVEFILE DOMDOCGETROOT DOMDOCADDPI DOMNODEGETNAME DOMNODEGETTYPE DOMNODEGETVALUE DOMNODEGETCHILDCT DOMNODEGETFIRSTCHILD DOMNODEGETSIBLING DOMNODECREATECHILDELEMENT DOMNODESETATTRIBUTE DOMNODEGETCHILDELEMENTCT DOMNODEGETFIRSTCHILDELEMENT DOMNODEGETSIBLINGELEMENT DOMNODEGETATTRIBUTECT DOMNODEGETATTRIBUTEI DOMNODEGETATTRIBUTEBYNAME DOMNODEGETBYNAME"
        },
        contains: [e.C_LINE_COMMENT_MODE, e.C_BLOCK_COMMENT_MODE, e.APOS_STRING_MODE, e.QUOTE_STRING_MODE, e.C_NUMBER_MODE, {
          className: "literal",
          variants: [{
            begin: "#\\s+",
            relevance: 0
          }, {
            begin: "#[a-zA-Z .]+"
          }]
        }]
      };
    }
    FCa.exports = axp;
  });