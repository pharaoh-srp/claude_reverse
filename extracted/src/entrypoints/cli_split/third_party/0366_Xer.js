  var Xer = __commonJS((Jer, hkl) => {
    (function (e, t) {
      typeof Jer === "object" && typeof hkl < "u" ? t(Jer) : typeof define === "function" && define.amd ? define(["exports"], t) : (e = typeof globalThis < "u" ? globalThis : e || self, t(e.acorn = {}));
    })(Jer, function (e) {
      var t = [509, 0, 227, 0, 150, 4, 294, 9, 1368, 2, 2, 1, 6, 3, 41, 2, 5, 0, 166, 1, 574, 3, 9, 9, 7, 9, 32, 4, 318, 1, 80, 3, 71, 10, 50, 3, 123, 2, 54, 14, 32, 10, 3, 1, 11, 3, 46, 10, 8, 0, 46, 9, 7, 2, 37, 13, 2, 9, 6, 1, 45, 0, 13, 2, 49, 13, 9, 3, 2, 11, 83, 11, 7, 0, 3, 0, 158, 11, 6, 9, 7, 3, 56, 1, 2, 6, 3, 1, 3, 2, 10, 0, 11, 1, 3, 6, 4, 4, 68, 8, 2, 0, 3, 0, 2, 3, 2, 4, 2, 0, 15, 1, 83, 17, 10, 9, 5, 0, 82, 19, 13, 9, 214, 6, 3, 8, 28, 1, 83, 16, 16, 9, 82, 12, 9, 9, 7, 19, 58, 14, 5, 9, 243, 14, 166, 9, 71, 5, 2, 1, 3, 3, 2, 0, 2, 1, 13, 9, 120, 6, 3, 6, 4, 0, 29, 9, 41, 6, 2, 3, 9, 0, 10, 10, 47, 15, 343, 9, 54, 7, 2, 7, 17, 9, 57, 21, 2, 13, 123, 5, 4, 0, 2, 1, 2, 6, 2, 0, 9, 9, 49, 4, 2, 1, 2, 4, 9, 9, 330, 3, 10, 1, 2, 0, 49, 6, 4, 4, 14, 10, 5350, 0, 7, 14, 11465, 27, 2343, 9, 87, 9, 39, 4, 60, 6, 26, 9, 535, 9, 470, 0, 2, 54, 8, 3, 82, 0, 12, 1, 19628, 1, 4178, 9, 519, 45, 3, 22, 543, 4, 4, 5, 9, 7, 3, 6, 31, 3, 149, 2, 1418, 49, 513, 54, 5, 49, 9, 0, 15, 0, 23, 4, 2, 14, 1361, 6, 2, 16, 3, 6, 2, 1, 2, 4, 101, 0, 161, 6, 10, 9, 357, 0, 62, 13, 499, 13, 245, 1, 2, 9, 726, 6, 110, 6, 6, 9, 4759, 9, 787719, 239];
      var n = [0, 11, 2, 25, 2, 18, 2, 1, 2, 14, 3, 13, 35, 122, 70, 52, 268, 28, 4, 48, 48, 31, 14, 29, 6, 37, 11, 29, 3, 35, 5, 7, 2, 4, 43, 157, 19, 35, 5, 35, 5, 39, 9, 51, 13, 10, 2, 14, 2, 6, 2, 1, 2, 10, 2, 14, 2, 6, 2, 1, 4, 51, 13, 310, 10, 21, 11, 7, 25, 5, 2, 41, 2, 8, 70, 5, 3, 0, 2, 43, 2, 1, 4, 0, 3, 22, 11, 22, 10, 30, 66, 18, 2, 1, 11, 21, 11, 25, 71, 55, 7, 1, 65, 0, 16, 3, 2, 2, 2, 28, 43, 28, 4, 28, 36, 7, 2, 27, 28, 53, 11, 21, 11, 18, 14, 17, 111, 72, 56, 50, 14, 50, 14, 35, 39, 27, 10, 22, 251, 41, 7, 1, 17, 2, 60, 28, 11, 0, 9, 21, 43, 17, 47, 20, 28, 22, 13, 52, 58, 1, 3, 0, 14, 44, 33, 24, 27, 35, 30, 0, 3, 0, 9, 34, 4, 0, 13, 47, 15, 3, 22, 0, 2, 0, 36, 17, 2, 24, 20, 1, 64, 6, 2, 0, 2, 3, 2, 14, 2, 9, 8, 46, 39, 7, 3, 1, 3, 21, 2, 6, 2, 1, 2, 4, 4, 0, 19, 0, 13, 4, 31, 9, 2, 0, 3, 0, 2, 37, 2, 0, 26, 0, 2, 0, 45, 52, 19, 3, 21, 2, 31, 47, 21, 1, 2, 0, 185, 46, 42, 3, 37, 47, 21, 0, 60, 42, 14, 0, 72, 26, 38, 6, 186, 43, 117, 63, 32, 7, 3, 0, 3, 7, 2, 1, 2, 23, 16, 0, 2, 0, 95, 7, 3, 38, 17, 0, 2, 0, 29, 0, 11, 39, 8, 0, 22, 0, 12, 45, 20, 0, 19, 72, 200, 32, 32, 8, 2, 36, 18, 0, 50, 29, 113, 6, 2, 1, 2, 37, 22, 0, 26, 5, 2, 1, 2, 31, 15, 0, 328, 18, 16, 0, 2, 12, 2, 33, 125, 0, 80, 921, 103, 110, 18, 195, 2637, 96, 16, 1071, 18, 5, 26, 3994, 6, 582, 6842, 29, 1763, 568, 8, 30, 18, 78, 18, 29, 19, 47, 17, 3, 32, 20, 6, 18, 433, 44, 212, 63, 129, 74, 6, 0, 67, 12, 65, 1, 2, 0, 29, 6135, 9, 1237, 42, 9, 8936, 3, 2, 6, 2, 1, 2, 290, 16, 0, 30, 2, 3, 0, 15, 3, 9, 395, 2309, 106, 6, 12, 4, 8, 8, 9, 5991, 84, 2, 70, 2, 1, 3, 0, 3, 1, 3, 3, 2, 11, 2, 0, 2, 6, 2, 64, 2, 3, 3, 7, 2, 6, 2, 27, 2, 3, 2, 4, 2, 0, 4, 6, 2, 339, 3, 24, 2, 24, 2, 30, 2, 24, 2, 30, 2, 24, 2, 30, 2, 24, 2, 30, 2, 24, 2, 7, 1845, 30, 7, 5, 262, 61, 147, 44, 11, 6, 17, 0, 322, 29, 19, 43, 485, 27, 229, 29, 3, 0, 496, 6, 2, 3, 2, 1, 2, 14, 2, 196, 60, 67, 8, 0, 1205, 3, 2, 26, 2, 1, 2, 0, 3, 0, 2, 9, 2, 3, 2, 0, 2, 0, 7, 0, 5, 0, 2, 0, 2, 0, 2, 2, 2, 1, 2, 0, 3, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 1, 2, 0, 3, 3, 2, 6, 2, 3, 2, 3, 2, 0, 2, 9, 2, 16, 6, 2, 2, 4, 2, 16, 4421, 42719, 33, 4153, 7, 221, 3, 5761, 15, 7472, 16, 621, 2467, 541, 1507, 4938, 6, 4191];
      var r = "\u200C\u200D\xB7\u0300-\u036F\u0387\u0483-\u0487\u0591-\u05BD\u05BF\u05C1\u05C2\u05C4\u05C5\u05C7\u0610-\u061A\u064B-\u0669\u0670\u06D6-\u06DC\u06DF-\u06E4\u06E7\u06E8\u06EA-\u06ED\u06F0-\u06F9\u0711\u0730-\u074A\u07A6-\u07B0\u07C0-\u07C9\u07EB-\u07F3\u07FD\u0816-\u0819\u081B-\u0823\u0825-\u0827\u0829-\u082D\u0859-\u085B\u0897-\u089F\u08CA-\u08E1\u08E3-\u0903\u093A-\u093C\u093E-\u094F\u0951-\u0957\u0962\u0963\u0966-\u096F\u0981-\u0983\u09BC\u09BE-\u09C4\u09C7\u09C8\u09CB-\u09CD\u09D7\u09E2\u09E3\u09E6-\u09EF\u09FE\u0A01-\u0A03\u0A3C\u0A3E-\u0A42\u0A47\u0A48\u0A4B-\u0A4D\u0A51\u0A66-\u0A71\u0A75\u0A81-\u0A83\u0ABC\u0ABE-\u0AC5\u0AC7-\u0AC9\u0ACB-\u0ACD\u0AE2\u0AE3\u0AE6-\u0AEF\u0AFA-\u0AFF\u0B01-\u0B03\u0B3C\u0B3E-\u0B44\u0B47\u0B48\u0B4B-\u0B4D\u0B55-\u0B57\u0B62\u0B63\u0B66-\u0B6F\u0B82\u0BBE-\u0BC2\u0BC6-\u0BC8\u0BCA-\u0BCD\u0BD7\u0BE6-\u0BEF\u0C00-\u0C04\u0C3C\u0C3E-\u0C44\u0C46-\u0C48\u0C4A-\u0C4D\u0C55\u0C56\u0C62\u0C63\u0C66-\u0C6F\u0C81-\u0C83\u0CBC\u0CBE-\u0CC4\u0CC6-\u0CC8\u0CCA-\u0CCD\u0CD5\u0CD6\u0CE2\u0CE3\u0CE6-\u0CEF\u0CF3\u0D00-\u0D03\u0D3B\u0D3C\u0D3E-\u0D44\u0D46-\u0D48\u0D4A-\u0D4D\u0D57\u0D62\u0D63\u0D66-\u0D6F\u0D81-\u0D83\u0DCA\u0DCF-\u0DD4\u0DD6\u0DD8-\u0DDF\u0DE6-\u0DEF\u0DF2\u0DF3\u0E31\u0E34-\u0E3A\u0E47-\u0E4E\u0E50-\u0E59\u0EB1\u0EB4-\u0EBC\u0EC8-\u0ECE\u0ED0-\u0ED9\u0F18\u0F19\u0F20-\u0F29\u0F35\u0F37\u0F39\u0F3E\u0F3F\u0F71-\u0F84\u0F86\u0F87\u0F8D-\u0F97\u0F99-\u0FBC\u0FC6\u102B-\u103E\u1040-\u1049\u1056-\u1059\u105E-\u1060\u1062-\u1064\u1067-\u106D\u1071-\u1074\u1082-\u108D\u108F-\u109D\u135D-\u135F\u1369-\u1371\u1712-\u1715\u1732-\u1734\u1752\u1753\u1772\u1773\u17B4-\u17D3\u17DD\u17E0-\u17E9\u180B-\u180D\u180F-\u1819\u18A9\u1920-\u192B\u1930-\u193B\u1946-\u194F\u19D0-\u19DA\u1A17-\u1A1B\u1A55-\u1A5E\u1A60-\u1A7C\u1A7F-\u1A89\u1A90-\u1A99\u1AB0-\u1ABD\u1ABF-\u1ACE\u1B00-\u1B04\u1B34-\u1B44\u1B50-\u1B59\u1B6B-\u1B73\u1B80-\u1B82\u1BA1-\u1BAD\u1BB0-\u1BB9\u1BE6-\u1BF3\u1C24-\u1C37\u1C40-\u1C49\u1C50-\u1C59\u1CD0-\u1CD2\u1CD4-\u1CE8\u1CED\u1CF4\u1CF7-\u1CF9\u1DC0-\u1DFF\u200C\u200D\u203F\u2040\u2054\u20D0-\u20DC\u20E1\u20E5-\u20F0\u2CEF-\u2CF1\u2D7F\u2DE0-\u2DFF\u302A-\u302F\u3099\u309A\u30FB\uA620-\uA629\uA66F\uA674-\uA67D\uA69E\uA69F\uA6F0\uA6F1\uA802\uA806\uA80B\uA823-\uA827\uA82C\uA880\uA881\uA8B4-\uA8C5\uA8D0-\uA8D9\uA8E0-\uA8F1\uA8FF-\uA909\uA926-\uA92D\uA947-\uA953\uA980-\uA983\uA9B3-\uA9C0\uA9D0-\uA9D9\uA9E5\uA9F0-\uA9F9\uAA29-\uAA36\uAA43\uAA4C\uAA4D\uAA50-\uAA59\uAA7B-\uAA7D\uAAB0\uAAB2-\uAAB4\uAAB7\uAAB8\uAABE\uAABF\uAAC1\uAAEB-\uAAEF\uAAF5\uAAF6\uABE3-\uABEA\uABEC\uABED\uABF0-\uABF9\uFB1E\uFE00-\uFE0F\uFE20-\uFE2F\uFE33\uFE34\uFE4D-\uFE4F\uFF10-\uFF19\uFF3F\uFF65";
      var o = "\xAA\xB5\xBA\xC0-\xD6\xD8-\xF6\xF8-\u02C1\u02C6-\u02D1\u02E0-\u02E4\u02EC\u02EE\u0370-\u0374\u0376\u0377\u037A-\u037D\u037F\u0386\u0388-\u038A\u038C\u038E-\u03A1\u03A3-\u03F5\u03F7-\u0481\u048A-\u052F\u0531-\u0556\u0559\u0560-\u0588\u05D0-\u05EA\u05EF-\u05F2\u0620-\u064A\u066E\u066F\u0671-\u06D3\u06D5\u06E5\u06E6\u06EE\u06EF\u06FA-\u06FC\u06FF\u0710\u0712-\u072F\u074D-\u07A5\u07B1\u07CA-\u07EA\u07F4\u07F5\u07FA\u0800-\u0815\u081A\u0824\u0828\u0840-\u0858\u0860-\u086A\u0870-\u0887\u0889-\u088E\u08A0-\u08C9\u0904-\u0939\u093D\u0950\u0958-\u0961\u0971-\u0980\u0985-\u098C\u098F\u0990\u0993-\u09A8\u09AA-\u09B0\u09B2\u09B6-\u09B9\u09BD\u09CE\u09DC\u09DD\u09DF-\u09E1\u09F0\u09F1\u09FC\u0A05-\u0A0A\u0A0F\u0A10\u0A13-\u0A28\u0A2A-\u0A30\u0A32\u0A33\u0A35\u0A36\u0A38\u0A39\u0A59-\u0A5C\u0A5E\u0A72-\u0A74\u0A85-\u0A8D\u0A8F-\u0A91\u0A93-\u0AA8\u0AAA-\u0AB0\u0AB2\u0AB3\u0AB5-\u0AB9\u0ABD\u0AD0\u0AE0\u0AE1\u0AF9\u0B05-\u0B0C\u0B0F\u0B10\u0B13-\u0B28\u0B2A-\u0B30\u0B32\u0B33\u0B35-\u0B39\u0B3D\u0B5C\u0B5D\u0B5F-\u0B61\u0B71\u0B83\u0B85-\u0B8A\u0B8E-\u0B90\u0B92-\u0B95\u0B99\u0B9A\u0B9C\u0B9E\u0B9F\u0BA3\u0BA4\u0BA8-\u0BAA\u0BAE-\u0BB9\u0BD0\u0C05-\u0C0C\u0C0E-\u0C10\u0C12-\u0C28\u0C2A-\u0C39\u0C3D\u0C58-\u0C5A\u0C5D\u0C60\u0C61\u0C80\u0C85-\u0C8C\u0C8E-\u0C90\u0C92-\u0CA8\u0CAA-\u0CB3\u0CB5-\u0CB9\u0CBD\u0CDD\u0CDE\u0CE0\u0CE1\u0CF1\u0CF2\u0D04-\u0D0C\u0D0E-\u0D10\u0D12-\u0D3A\u0D3D\u0D4E\u0D54-\u0D56\u0D5F-\u0D61\u0D7A-\u0D7F\u0D85-\u0D96\u0D9A-\u0DB1\u0DB3-\u0DBB\u0DBD\u0DC0-\u0DC6\u0E01-\u0E30\u0E32\u0E33\u0E40-\u0E46\u0E81\u0E82\u0E84\u0E86-\u0E8A\u0E8C-\u0EA3\u0EA5\u0EA7-\u0EB0\u0EB2\u0EB3\u0EBD\u0EC0-\u0EC4\u0EC6\u0EDC-\u0EDF\u0F00\u0F40-\u0F47\u0F49-\u0F6C\u0F88-\u0F8C\u1000-\u102A\u103F\u1050-\u1055\u105A-\u105D\u1061\u1065\u1066\u106E-\u1070\u1075-\u1081\u108E\u10A0-\u10C5\u10C7\u10CD\u10D0-\u10FA\u10FC-\u1248\u124A-\u124D\u1250-\u1256\u1258\u125A-\u125D\u1260-\u1288\u128A-\u128D\u1290-\u12B0\u12B2-\u12B5\u12B8-\u12BE\u12C0\u12C2-\u12C5\u12C8-\u12D6\u12D8-\u1310\u1312-\u1315\u1318-\u135A\u1380-\u138F\u13A0-\u13F5\u13F8-\u13FD\u1401-\u166C\u166F-\u167F\u1681-\u169A\u16A0-\u16EA\u16EE-\u16F8\u1700-\u1711\u171F-\u1731\u1740-\u1751\u1760-\u176C\u176E-\u1770\u1780-\u17B3\u17D7\u17DC\u1820-\u1878\u1880-\u18A8\u18AA\u18B0-\u18F5\u1900-\u191E\u1950-\u196D\u1970-\u1974\u1980-\u19AB\u19B0-\u19C9\u1A00-\u1A16\u1A20-\u1A54\u1AA7\u1B05-\u1B33\u1B45-\u1B4C\u1B83-\u1BA0\u1BAE\u1BAF\u1BBA-\u1BE5\u1C00-\u1C23\u1C4D-\u1C4F\u1C5A-\u1C7D\u1C80-\u1C8A\u1C90-\u1CBA\u1CBD-\u1CBF\u1CE9-\u1CEC\u1CEE-\u1CF3\u1CF5\u1CF6\u1CFA\u1D00-\u1DBF\u1E00-\u1F15\u1F18-\u1F1D\u1F20-\u1F45\u1F48-\u1F4D\u1F50-\u1F57\u1F59\u1F5B\u1F5D\u1F5F-\u1F7D\u1F80-\u1FB4\u1FB6-\u1FBC\u1FBE\u1FC2-\u1FC4\u1FC6-\u1FCC\u1FD0-\u1FD3\u1FD6-\u1FDB\u1FE0-\u1FEC\u1FF2-\u1FF4\u1FF6-\u1FFC\u2071\u207F\u2090-\u209C\u2102\u2107\u210A-\u2113\u2115\u2118-\u211D\u2124\u2126\u2128\u212A-\u2139\u213C-\u213F\u2145-\u2149\u214E\u2160-\u2188\u2C00-\u2CE4\u2CEB-\u2CEE\u2CF2\u2CF3\u2D00-\u2D25\u2D27\u2D2D\u2D30-\u2D67\u2D6F\u2D80-\u2D96\u2DA0-\u2DA6\u2DA8-\u2DAE\u2DB0-\u2DB6\u2DB8-\u2DBE\u2DC0-\u2DC6\u2DC8-\u2DCE\u2DD0-\u2DD6\u2DD8-\u2DDE\u3005-\u3007\u3021-\u3029\u3031-\u3035\u3038-\u303C\u3041-\u3096\u309B-\u309F\u30A1-\u30FA\u30FC-\u30FF\u3105-\u312F\u3131-\u318E\u31A0-\u31BF\u31F0-\u31FF\u3400-\u4DBF\u4E00-\uA48C\uA4D0-\uA4FD\uA500-\uA60C\uA610-\uA61F\uA62A\uA62B\uA640-\uA66E\uA67F-\uA69D\uA6A0-\uA6EF\uA717-\uA71F\uA722-\uA788\uA78B-\uA7CD\uA7D0\uA7D1\uA7D3\uA7D5-\uA7DC\uA7F2-\uA801\uA803-\uA805\uA807-\uA80A\uA80C-\uA822\uA840-\uA873\uA882-\uA8B3\uA8F2-\uA8F7\uA8FB\uA8FD\uA8FE\uA90A-\uA925\uA930-\uA946\uA960-\uA97C\uA984-\uA9B2\uA9CF\uA9E0-\uA9E4\uA9E6-\uA9EF\uA9FA-\uA9FE\uAA00-\uAA28\uAA40-\uAA42\uAA44-\uAA4B\uAA60-\uAA76\uAA7A\uAA7E-\uAAAF\uAAB1\uAAB5\uAAB6\uAAB9-\uAABD\uAAC0\uAAC2\uAADB-\uAADD\uAAE0-\uAAEA\uAAF2-\uAAF4\uAB01-\uAB06\uAB09-\uAB0E\uAB11-\uAB16\uAB20-\uAB26\uAB28-\uAB2E\uAB30-\uAB5A\uAB5C-\uAB69\uAB70-\uABE2\uAC00-\uD7A3\uD7B0-\uD7C6\uD7CB-\uD7FB\uF900-\uFA6D\uFA70-\uFAD9\uFB00-\uFB06\uFB13-\uFB17\uFB1D\uFB1F-\uFB28\uFB2A-\uFB36\uFB38-\uFB3C\uFB3E\uFB40\uFB41\uFB43\uFB44\uFB46-\uFBB1\uFBD3-\uFD3D\uFD50-\uFD8F\uFD92-\uFDC7\uFDF0-\uFDFB\uFE70-\uFE74\uFE76-\uFEFC\uFF21-\uFF3A\uFF41-\uFF5A\uFF66-\uFFBE\uFFC2-\uFFC7\uFFCA-\uFFCF\uFFD2-\uFFD7\uFFDA-\uFFDC";
      var s = {
        3: "abstract boolean byte char class double enum export extends final float goto implements import int interface long native package private protected public short static super synchronized throws transient volatile",
        5: "class enum extends super const export import",
        6: "enum",
        strict: "implements interface let package private protected public static yield",
        strictBind: "eval arguments"
      };
      var i = "break case catch continue debugger default do else finally for function if return switch throw try var while with null true false instanceof typeof void delete new in this";
      var a = {
        5: i,
        "5module": i + " export import",
        6: i + " const class extends export import super"
      };
      var l = /^in(stanceof)?$/;
      var c = new RegExp("[" + o + "]");
      var u = new RegExp("[" + o + r + "]");
      function d(Y, Se) {
        var qe = 65536;
        for (var Qe = 0; Qe < Se.length; Qe += 2) {
          if (qe += Se[Qe], qe > Y) {
            return false;
          }
          if (qe += Se[Qe + 1], qe >= Y) {
            return true;
          }
        }
        return false;
      }
      function p(Y, Se) {
        if (Y < 65) {
          return Y === 36;
        }
        if (Y < 91) {
          return true;
        }
        if (Y < 97) {
          return Y === 95;
        }
        if (Y < 123) {
          return true;
        }
        if (Y <= 65535) {
          return Y >= 170 && c.test(String.fromCharCode(Y));
        }
        if (Se === false) {
          return false;
        }
        return d(Y, n);
      }
      function m(Y, Se) {
        if (Y < 48) {
          return Y === 36;
        }
        if (Y < 58) {
          return true;
        }
        if (Y < 65) {
          return false;
        }
        if (Y < 91) {
          return true;
        }
        if (Y < 97) {
          return Y === 95;
        }
        if (Y < 123) {
          return true;
        }
        if (Y <= 65535) {
          return Y >= 170 && u.test(String.fromCharCode(Y));
        }
        if (Se === false) {
          return false;
        }
        return d(Y, n) || d(Y, t);
      }
      var f = function (Se, qe) {
        if (qe === undefined) {
          qe = {};
        }
        this.label = Se;
        this.keyword = qe.keyword;
        this.beforeExpr = !!qe.beforeExpr;
        this.startsExpr = !!qe.startsExpr;
        this.isLoop = !!qe.isLoop;
        this.isAssign = !!qe.isAssign;
        this.prefix = !!qe.prefix;
        this.postfix = !!qe.postfix;
        this.binop = qe.binop || null;
        this.updateContext = null;
      };
      function h(Y, Se) {
        return new f(Y, {
          beforeExpr: true,
          binop: Se
        });
      }
      var g = {
        beforeExpr: true
      };
      var y = {
        startsExpr: true
      };
      var _ = {};
      function b(Y, Se) {
        if (Se === undefined) {
          Se = {};
        }
        Se.keyword = Y;
        return _[Y] = new f(Y, Se);
      }
      var S = {
        num: new f("num", y),
        regexp: new f("regexp", y),
        string: new f("string", y),
        name: new f("name", y),
        privateId: new f("privateId", y),
        eof: new f("eof"),
        bracketL: new f("[", {
          beforeExpr: true,
          startsExpr: true
        }),
        bracketR: new f("]"),
        braceL: new f("{", {
          beforeExpr: true,
          startsExpr: true
        }),
        braceR: new f("}"),
        parenL: new f("(", {
          beforeExpr: true,
          startsExpr: true
        }),
        parenR: new f(")"),
        comma: new f(",", g),
        semi: new f(";", g),
        colon: new f(":", g),
        dot: new f("."),
        question: new f("?", g),
        questionDot: new f("?."),
        arrow: new f("=>", g),
        template: new f("template"),
        invalidTemplate: new f("invalidTemplate"),
        ellipsis: new f("...", g),
        backQuote: new f("`", y),
        dollarBraceL: new f("${", {
          beforeExpr: true,
          startsExpr: true
        }),
        eq: new f("=", {
          beforeExpr: true,
          isAssign: true
        }),
        assign: new f("_=", {
          beforeExpr: true,
          isAssign: true
        }),
        incDec: new f("++/--", {
          prefix: true,
          postfix: true,
          startsExpr: true
        }),
        prefix: new f("!/~", {
          beforeExpr: true,
          prefix: true,
          startsExpr: true
        }),
        logicalOR: h("||", 1),
        logicalAND: h("&&", 2),
        bitwiseOR: h("|", 3),
        bitwiseXOR: h("^", 4),
        bitwiseAND: h("&", 5),
        equality: h("==/!=/===/!==", 6),
        relational: h("</>/<=/>=", 7),
        bitShift: h("<</>>/>>>", 8),
        plusMin: new f("+/-", {
          beforeExpr: true,
          binop: 9,
          prefix: true,
          startsExpr: true
        }),
        modulo: h("%", 10),
        star: h("*", 10),
        slash: h("/", 10),
        starstar: new f("**", {
          beforeExpr: true
        }),
        coalesce: h("??", 1),
        _break: b("break"),
        _case: b("case", g),
        _catch: b("catch"),
        _continue: b("continue"),
        _debugger: b("debugger"),
        _default: b("default", g),
        _do: b("do", {
          isLoop: true,
          beforeExpr: true
        }),
        _else: b("else", g),
        _finally: b("finally"),
        _for: b("for", {
          isLoop: true
        }),
        _function: b("function", y),
        _if: b("if"),
        _return: b("return", g),
        _switch: b("switch"),
        _throw: b("throw", g),
        _try: b("try"),
        _var: b("var"),
        _const: b("const"),
        _while: b("while", {
          isLoop: true
        }),
        _with: b("with"),
        _new: b("new", {
          beforeExpr: true,
          startsExpr: true
        }),
        _this: b("this", y),
        _super: b("super", y),
        _class: b("class", y),
        _extends: b("extends", g),
        _export: b("export"),
        _import: b("import", y),
        _null: b("null", y),
        _true: b("true", y),
        _false: b("false", y),
        _in: b("in", {
          beforeExpr: true,
          binop: 7
        }),
        _instanceof: b("instanceof", {
          beforeExpr: true,
          binop: 7
        }),
        _typeof: b("typeof", {
          beforeExpr: true,
          prefix: true,
          startsExpr: true
        }),
        _void: b("void", {
          beforeExpr: true,
          prefix: true,
          startsExpr: true
        }),
        _delete: b("delete", {
          beforeExpr: true,
          prefix: true,
          startsExpr: true
        })
      };
      var E = /\r\n?|\n|\u2028|\u2029/;
      var C = new RegExp(E.source, "g");
      function x(Y) {
        return Y === 10 || Y === 13 || Y === 8232 || Y === 8233;
      }
      function A(Y, Se, qe) {
        if (qe === undefined) {
          qe = Y.length;
        }
        for (var Qe = Se; Qe < qe; Qe++) {
          var Ht = Y.charCodeAt(Qe);
          if (x(Ht)) {
            return Qe < qe - 1 && Ht === 13 && Y.charCodeAt(Qe + 1) === 10 ? Qe + 2 : Qe + 1;
          }
        }
        return -1;
      }
      var k = /[\u1680\u2000-\u200a\u202f\u205f\u3000\ufeff]/;
      var I = /(?:\s|\/\/.*|\/\*[^]*?\*\/)*/g;
      var O = Object.prototype;
      var M = O.hasOwnProperty;
      var L = O.toString;
      var P = Object.hasOwn || function (Y, Se) {
        return M.call(Y, Se);
      };
      var F = Array.isArray || function (Y) {
        return L.call(Y) === "[object Array]";
      };
      var H = Object.create(null);
      function U(Y) {
        return H[Y] || (H[Y] = new RegExp("^(?:" + Y.replace(/ /g, "|") + ")$"));
      }
      function N(Y) {
        if (Y <= 65535) {
          return String.fromCharCode(Y);
        }
        Y -= 65536;
        return String.fromCharCode((Y >> 10) + 55296, (Y & 1023) + 56320);
      }
      var W = /(?:[\uD800-\uDBFF](?![\uDC00-\uDFFF])|(?:[^\uD800-\uDBFF]|^)[\uDC00-\uDFFF])/;
      var j = function (Se, qe) {
        this.line = Se;
        this.column = qe;
      };
      j.prototype.offset = function (Se) {
        return new j(this.line, this.column + Se);
      };
      var z = function (Se, qe, Qe) {
        if (this.start = qe, this.end = Qe, Se.sourceFile !== null) {
          this.source = Se.sourceFile;
        }
      };
      function V(Y, Se) {
        for (var qe = 1, Qe = 0;;) {
          var Ht = A(Y, Qe, Se);
          if (Ht < 0) {
            return new j(qe, Se - Qe);
          }
          ++qe;
          Qe = Ht;
        }
      }
      var K = {
        ecmaVersion: null,
        sourceType: "script",
        onInsertedSemicolon: null,
        onTrailingComma: null,
        allowReserved: null,
        allowReturnOutsideFunction: false,
        allowImportExportEverywhere: false,
        allowAwaitOutsideFunction: null,
        allowSuperOutsideMethod: null,
        allowHashBang: false,
        checkPrivateFields: true,
        locations: false,
        onToken: null,
        onComment: null,
        ranges: false,
        program: null,
        sourceFile: null,
        directSourceFile: null,
        preserveParens: false
      };
      var J = false;
      function Q(Y) {
        var Se = {};
        for (var qe in K) {
          Se[qe] = Y && P(Y, qe) ? Y[qe] : K[qe];
        }
        if (Se.ecmaVersion === "latest") {
          Se.ecmaVersion = 1e8;
        } else if (Se.ecmaVersion == null) {
          if (!J && typeof console === "object" && console.warn) {
            J = true;
            console.warn(`Since Acorn 8.0.0, options.ecmaVersion is required.
Defaulting to 2020, but this will stop working in the future.`);
          }
          Se.ecmaVersion = 11;
        } else if (Se.ecmaVersion >= 2015) {
          Se.ecmaVersion -= 2009;
        }
        if (Se.allowReserved == null) {
          Se.allowReserved = Se.ecmaVersion < 5;
        }
        if (!Y || Y.allowHashBang == null) {
          Se.allowHashBang = Se.ecmaVersion >= 14;
        }
        if (F(Se.onToken)) {
          var Qe = Se.onToken;
          Se.onToken = function (Ht) {
            return Qe.push(Ht);
          };
        }
        if (F(Se.onComment)) {
          Se.onComment = Z(Se, Se.onComment);
        }
        return Se;
      }
      function Z(Y, Se) {
        return function (qe, Qe, Ht, nn, qn, zr) {
          var wo = {
            type: qe ? "Block" : "Line",
            value: Qe,
            start: Ht,
            end: nn
          };
          if (Y.locations) {
            wo.loc = new z(this, qn, zr);
          }
          if (Y.ranges) {
            wo.range = [Ht, nn];
          }
          Se.push(wo);
        };
      }
      var ne = 1;
      var oe = 2;
      var ee = 4;
      var re = 8;
      var se = 16;
      var ae = 32;
      var de = 64;
      var be = 128;
      var fe = 256;
      var me = 512;
      var Te = ne | oe | fe;
      function ue(Y, Se) {
        return oe | (Y ? ee : 0) | (Se ? re : 0);
      }
      var ce = 0;
      var le = 1;
      var pe = 2;
      var ve = 3;
      var _e = 4;
      var xe = 5;
      var ke = function (Se, qe, Qe) {
        this.options = Se = Q(Se);
        this.sourceFile = Se.sourceFile;
        this.keywords = U(a[Se.ecmaVersion >= 6 ? 6 : Se.sourceType === "module" ? "5module" : 5]);
        var Ht = "";
        if (Se.allowReserved !== true) {
          if (Ht = s[Se.ecmaVersion >= 6 ? 6 : Se.ecmaVersion === 5 ? 5 : 3], Se.sourceType === "module") {
            Ht += " await";
          }
        }
        this.reservedWords = U(Ht);
        var nn = (Ht ? Ht + " " : "") + s.strict;
        if (this.reservedWordsStrict = U(nn), this.reservedWordsStrictBind = U(nn + " " + s.strictBind), this.input = String(qe), this.containsEsc = false, Qe) {
          this.pos = Qe;
          this.lineStart = this.input.lastIndexOf(`
`, Qe - 1) + 1;
          this.curLine = this.input.slice(0, this.lineStart).split(E).length;
        } else {
          this.pos = this.lineStart = 0;
          this.curLine = 1;
        }
        if (this.type = S.eof, this.value = null, this.start = this.end = this.pos, this.startLoc = this.endLoc = this.curPosition(), this.lastTokEndLoc = this.lastTokStartLoc = null, this.lastTokStart = this.lastTokEnd = this.pos, this.context = this.initialContext(), this.exprAllowed = true, this.inModule = Se.sourceType === "module", this.strict = this.inModule || this.strictDirective(this.pos), this.potentialArrowAt = -1, this.potentialArrowInForAwait = false, this.yieldPos = this.awaitPos = this.awaitIdentPos = 0, this.labels = [], this.undefinedExports = Object.create(null), this.pos === 0 && Se.allowHashBang && this.input.slice(0, 2) === "#!") {
          this.skipLineComment(2);
        }
        this.scopeStack = [];
        this.enterScope(ne);
        this.regexpState = null;
        this.privateNameStack = [];
      };
      var Ie = {
        inFunction: {
          configurable: true
        },
        inGenerator: {
          configurable: true
        },
        inAsync: {
          configurable: true
        },
        canAwait: {
          configurable: true
        },
        allowSuper: {
          configurable: true
        },
        allowDirectSuper: {
          configurable: true
        },
        treatFunctionsAsVar: {
          configurable: true
        },
        allowNewDotTarget: {
          configurable: true
        },
        inClassStaticBlock: {
          configurable: true
        }
      };
      ke.prototype.parse = function () {
        var Se = this.options.program || this.startNode();
        this.nextToken();
        return this.parseTopLevel(Se);
      };
      Ie.inFunction.get = function () {
        return (this.currentVarScope().flags & oe) > 0;
      };
      Ie.inGenerator.get = function () {
        return (this.currentVarScope().flags & re) > 0;
      };
      Ie.inAsync.get = function () {
        return (this.currentVarScope().flags & ee) > 0;
      };
      Ie.canAwait.get = function () {
        for (var Y = this.scopeStack.length - 1; Y >= 0; Y--) {
          var Se = this.scopeStack[Y];
          var qe = Se.flags;
          if (qe & (fe | me)) {
            return false;
          }
          if (qe & oe) {
            return (qe & ee) > 0;
          }
        }
        return this.inModule && this.options.ecmaVersion >= 13 || this.options.allowAwaitOutsideFunction;
      };
      Ie.allowSuper.get = function () {
        var Y = this.currentThisScope();
        var Se = Y.flags;
        return (Se & de) > 0 || this.options.allowSuperOutsideMethod;
      };
      Ie.allowDirectSuper.get = function () {
        return (this.currentThisScope().flags & be) > 0;
      };
      Ie.treatFunctionsAsVar.get = function () {
        return this.treatFunctionsAsVarInScope(this.currentScope());
      };
      Ie.allowNewDotTarget.get = function () {
        for (var Y = this.scopeStack.length - 1; Y >= 0; Y--) {
          var Se = this.scopeStack[Y];
          var qe = Se.flags;
          if (qe & (fe | me) || qe & oe && !(qe & se)) {
            return true;
          }
        }
        return false;
      };
      Ie.inClassStaticBlock.get = function () {
        return (this.currentVarScope().flags & fe) > 0;
      };
      ke.extend = function () {
        var Se = [];
        var qe = arguments.length;
        while (qe--) {
          Se[qe] = arguments[qe];
        }
        var Qe = this;
        for (var Ht = 0; Ht < Se.length; Ht++) {
          Qe = Se[Ht](Qe);
        }
        return Qe;
      };
      ke.parse = function (Se, qe) {
        return new this(qe, Se).parse();
      };
      ke.parseExpressionAt = function (Se, qe, Qe) {
        var Ht = new this(Qe, Se, qe);
        Ht.nextToken();
        return Ht.parseExpression();
      };
      ke.tokenizer = function (Se, qe) {
        return new this(qe, Se);
      };
      Object.defineProperties(ke.prototype, Ie);
      var Ue = ke.prototype;
      var Ge = /^(?:'((?:\\[^]|[^'\\])*?)'|"((?:\\[^]|[^"\\])*?)")/;
      Ue.strictDirective = function (Y) {
        if (this.options.ecmaVersion < 5) {
          return false;
        }
        for (;;) {
          I.lastIndex = Y;
          Y += I.exec(this.input)[0].length;
          var Se = Ge.exec(this.input.slice(Y));
          if (!Se) {
            return false;
          }
          if ((Se[1] || Se[2]) === "use strict") {
            I.lastIndex = Y + Se[0].length;
            var qe = I.exec(this.input);
            var Qe = qe.index + qe[0].length;
            var Ht = this.input.charAt(Qe);
            return Ht === ";" || Ht === "}" || E.test(qe[0]) && !(/[(`.[+\-/*%<>=,?^&]/.test(Ht) || Ht === "!" && this.input.charAt(Qe + 1) === "=");
          }
          if (Y += Se[0].length, I.lastIndex = Y, Y += I.exec(this.input)[0].length, this.input[Y] === ";") {
            Y++;
          }
        }
      };
      Ue.eat = function (Y) {
        if (this.type === Y) {
          this.next();
          return true;
        } else {
          return false;
        }
      };
      Ue.isContextual = function (Y) {
        return this.type === S.name && this.value === Y && !this.containsEsc;
      };
      Ue.eatContextual = function (Y) {
        if (!this.isContextual(Y)) {
          return false;
        }
        this.next();
        return true;
      };
      Ue.expectContextual = function (Y) {
        if (!this.eatContextual(Y)) {
          this.unexpected();
        }
      };
      Ue.canInsertSemicolon = function () {
        return this.type === S.eof || this.type === S.braceR || E.test(this.input.slice(this.lastTokEnd, this.start));
      };
      Ue.insertSemicolon = function () {
        if (this.canInsertSemicolon()) {
          if (this.options.onInsertedSemicolon) {
            this.options.onInsertedSemicolon(this.lastTokEnd, this.lastTokEndLoc);
          }
          return true;
        }
      };
      Ue.semicolon = function () {
        if (!this.eat(S.semi) && !this.insertSemicolon()) {
          this.unexpected();
        }
      };
      Ue.afterTrailingComma = function (Y, Se) {
        if (this.type === Y) {
          if (this.options.onTrailingComma) {
            this.options.onTrailingComma(this.lastTokStart, this.lastTokStartLoc);
          }
          if (!Se) {
            this.next();
          }
          return true;
        }
      };
      Ue.expect = function (Y) {
        this.eat(Y) || this.unexpected();
      };
      Ue.unexpected = function (Y) {
        this.raise(Y != null ? Y : this.start, "Unexpected token");
      };
      var Be = function () {
        this.shorthandAssign = this.trailingComma = this.parenthesizedAssign = this.parenthesizedBind = this.doubleProto = -1;
      };
      Ue.checkPatternErrors = function (Y, Se) {
        if (!Y) {
          return;
        }
        if (Y.trailingComma > -1) {
          this.raiseRecoverable(Y.trailingComma, "Comma is not permitted after the rest element");
        }
        var qe = Se ? Y.parenthesizedAssign : Y.parenthesizedBind;
        if (qe > -1) {
          this.raiseRecoverable(qe, Se ? "Assigning to rvalue" : "Parenthesized pattern");
        }
      };
      Ue.checkExpressionErrors = function (Y, Se) {
        if (!Y) {
          return false;
        }
        var {
          shorthandAssign: qe,
          doubleProto: Qe
        } = Y;
        if (!Se) {
          return qe >= 0 || Qe >= 0;
        }
        if (qe >= 0) {
          this.raise(qe, "Shorthand property assignments are valid only in destructuring patterns");
        }
        if (Qe >= 0) {
          this.raiseRecoverable(Qe, "Redefinition of __proto__ property");
        }
      };
      Ue.checkYieldAwaitInDefaultParams = function () {
        if (this.yieldPos && (!this.awaitPos || this.yieldPos < this.awaitPos)) {
          this.raise(this.yieldPos, "Yield expression cannot be a default value");
        }
        if (this.awaitPos) {
          this.raise(this.awaitPos, "Await expression cannot be a default value");
        }
      };
      Ue.isSimpleAssignTarget = function (Y) {
        if (Y.type === "ParenthesizedExpression") {
          return this.isSimpleAssignTarget(Y.expression);
        }
        return Y.type === "Identifier" || Y.type === "MemberExpression";
      };
      var We = ke.prototype;
      We.parseTopLevel = function (Y) {
        var Se = Object.create(null);
        if (!Y.body) {
          Y.body = [];
        }
        while (this.type !== S.eof) {
          var qe = this.parseStatement(null, true, Se);
          Y.body.push(qe);
        }
        if (this.inModule) {
          for (var Qe = 0, Ht = Object.keys(this.undefinedExports); Qe < Ht.length; Qe += 1) {
            var nn = Ht[Qe];
            this.raiseRecoverable(this.undefinedExports[nn].start, "Export '" + nn + "' is not defined");
          }
        }
        this.adaptDirectivePrologue(Y.body);
        this.next();
        Y.sourceType = this.options.sourceType;
        return this.finishNode(Y, "Program");
      };
      var Ze = {
        kind: "loop"
      };
      var Tt = {
        kind: "switch"
      };
      We.isLet = function (Y) {
        if (this.options.ecmaVersion < 6 || !this.isContextual("let")) {
          return false;
        }
        I.lastIndex = this.pos;
        var Se = I.exec(this.input);
        var qe = this.pos + Se[0].length;
        var Qe = this.input.charCodeAt(qe);
        if (Qe === 91 || Qe === 92) {
          return true;
        }
        if (Y) {
          return false;
        }
        if (Qe === 123 || Qe > 55295 && Qe < 56320) {
          return true;
        }
        if (p(Qe, true)) {
          var Ht = qe + 1;
          while (m(Qe = this.input.charCodeAt(Ht), true)) {
            ++Ht;
          }
          if (Qe === 92 || Qe > 55295 && Qe < 56320) {
            return true;
          }
          var nn = this.input.slice(qe, Ht);
          if (!l.test(nn)) {
            return true;
          }
        }
        return false;
      };
      We.isAsyncFunction = function () {
        if (this.options.ecmaVersion < 8 || !this.isContextual("async")) {
          return false;
        }
        I.lastIndex = this.pos;
        var Y = I.exec(this.input);
        var Se = this.pos + Y[0].length;
        var qe;
        return !E.test(this.input.slice(this.pos, Se)) && this.input.slice(Se, Se + 8) === "function" && (Se + 8 === this.input.length || !(m(qe = this.input.charCodeAt(Se + 8)) || qe > 55295 && qe < 56320));
      };
      We.isUsingKeyword = function (Y, Se) {
        if (this.options.ecmaVersion < 17 || !this.isContextual(Y ? "await" : "using")) {
          return false;
        }
        I.lastIndex = this.pos;
        var qe = I.exec(this.input);
        var Qe = this.pos + qe[0].length;
        if (E.test(this.input.slice(this.pos, Qe))) {
          return false;
        }
        if (Y) {
          var Ht = Qe + 5;
          var nn;
          if (this.input.slice(Qe, Ht) !== "using" || Ht === this.input.length || m(nn = this.input.charCodeAt(Ht)) || nn > 55295 && nn < 56320) {
            return false;
          }
          I.lastIndex = Ht;
          var qn = I.exec(this.input);
          if (qn && E.test(this.input.slice(Ht, Ht + qn[0].length))) {
            return false;
          }
        }
        if (Se) {
          var zr = Qe + 2;
          var wo;
          if (this.input.slice(Qe, zr) === "of") {
            if (zr === this.input.length || !m(wo = this.input.charCodeAt(zr)) && !(wo > 55295 && wo < 56320)) {
              return false;
            }
          }
        }
        var Nr = this.input.charCodeAt(Qe);
        return p(Nr, true) || Nr === 92;
      };
      We.isAwaitUsing = function (Y) {
        return this.isUsingKeyword(true, Y);
      };
      We.isUsing = function (Y) {
        return this.isUsingKeyword(false, Y);
      };
      We.parseStatement = function (Y, Se, qe) {
        var Qe = this.type;
        var Ht = this.startNode();
        var nn;
        if (this.isLet(Y)) {
          Qe = S._var;
          nn = "let";
        }
        switch (Qe) {
          case S._break:
          case S._continue:
            return this.parseBreakContinueStatement(Ht, Qe.keyword);
          case S._debugger:
            return this.parseDebuggerStatement(Ht);
          case S._do:
            return this.parseDoStatement(Ht);
          case S._for:
            return this.parseForStatement(Ht);
          case S._function:
            if (Y && (this.strict || Y !== "if" && Y !== "label") && this.options.ecmaVersion >= 6) {
              this.unexpected();
            }
            return this.parseFunctionStatement(Ht, false, !Y);
          case S._class:
            if (Y) {
              this.unexpected();
            }
            return this.parseClass(Ht, true);
          case S._if:
            return this.parseIfStatement(Ht);
          case S._return:
            return this.parseReturnStatement(Ht);
          case S._switch:
            return this.parseSwitchStatement(Ht);
          case S._throw:
            return this.parseThrowStatement(Ht);
          case S._try:
            return this.parseTryStatement(Ht);
          case S._const:
          case S._var:
            if (nn = nn || this.value, Y && nn !== "var") {
              this.unexpected();
            }
            return this.parseVarStatement(Ht, nn);
          case S._while:
            return this.parseWhileStatement(Ht);
          case S._with:
            return this.parseWithStatement(Ht);
          case S.braceL:
            return this.parseBlock(true, Ht);
          case S.semi:
            return this.parseEmptyStatement(Ht);
          case S._export:
          case S._import:
            if (this.options.ecmaVersion > 10 && Qe === S._import) {
              I.lastIndex = this.pos;
              var qn = I.exec(this.input);
              var zr = this.pos + qn[0].length;
              var wo = this.input.charCodeAt(zr);
              if (wo === 40 || wo === 46) {
                return this.parseExpressionStatement(Ht, this.parseExpression());
              }
            }
            if (!this.options.allowImportExportEverywhere) {
              if (!Se) {
                this.raise(this.start, "'import' and 'export' may only appear at the top level");
              }
              if (!this.inModule) {
                this.raise(this.start, "'import' and 'export' may appear only with 'sourceType: module'");
              }
            }
            return Qe === S._import ? this.parseImport(Ht) : this.parseExport(Ht, qe);
          default:
            if (this.isAsyncFunction()) {
              if (Y) {
                this.unexpected();
              }
              this.next();
              return this.parseFunctionStatement(Ht, true, !Y);
            }
            var Nr = this.isAwaitUsing(false) ? "await using" : this.isUsing(false) ? "using" : null;
            if (Nr) {
              if (Se && this.options.sourceType === "script") {
                this.raise(this.start, "Using declaration cannot appear in the top level when source type is `script`");
              }
              if (Nr === "await using") {
                if (!this.canAwait) {
                  this.raise(this.start, "Await using cannot appear outside of async function");
                }
                this.next();
              }
              this.next();
              this.parseVar(Ht, false, Nr);
              this.semicolon();
              return this.finishNode(Ht, "VariableDeclaration");
            }
            var pi = this.value;
            var Dr = this.parseExpression();
            if (Qe === S.name && Dr.type === "Identifier" && this.eat(S.colon)) {
              return this.parseLabeledStatement(Ht, pi, Dr, Y);
            } else {
              return this.parseExpressionStatement(Ht, Dr);
            }
        }
      };
      We.parseBreakContinueStatement = function (Y, Se) {
        var qe = Se === "break";
        if (this.next(), this.eat(S.semi) || this.insertSemicolon()) {
          Y.label = null;
        } else if (this.type !== S.name) {
          this.unexpected();
        } else {
          Y.label = this.parseIdent();
          this.semicolon();
        }
        var Qe = 0;
        for (; Qe < this.labels.length; ++Qe) {
          var Ht = this.labels[Qe];
          if (Y.label == null || Ht.name === Y.label.name) {
            if (Ht.kind != null && (qe || Ht.kind === "loop")) {
              break;
            }
            if (Y.label && qe) {
              break;
            }
          }
        }
        if (Qe === this.labels.length) {
          this.raise(Y.start, "Unsyntactic " + Se);
        }
        return this.finishNode(Y, qe ? "BreakStatement" : "ContinueStatement");
      };
      We.parseDebuggerStatement = function (Y) {
        this.next();
        this.semicolon();
        return this.finishNode(Y, "DebuggerStatement");
      };
      We.parseDoStatement = function (Y) {
        if (this.next(), this.labels.push(Ze), Y.body = this.parseStatement("do"), this.labels.pop(), this.expect(S._while), Y.test = this.parseParenExpression(), this.options.ecmaVersion >= 6) {
          this.eat(S.semi);
        } else {
          this.semicolon();
        }
        return this.finishNode(Y, "DoWhileStatement");
      };
      We.parseForStatement = function (Y) {
        this.next();
        var Se = this.options.ecmaVersion >= 9 && this.canAwait && this.eatContextual("await") ? this.lastTokStart : -1;
        if (this.labels.push(Ze), this.enterScope(0), this.expect(S.parenL), this.type === S.semi) {
          if (Se > -1) {
            this.unexpected(Se);
          }
          return this.parseFor(Y, null);
        }
        var qe = this.isLet();
        if (this.type === S._var || this.type === S._const || qe) {
          var Qe = this.startNode();
          var Ht = qe ? "let" : this.value;
          this.next();
          this.parseVar(Qe, true, Ht);
          this.finishNode(Qe, "VariableDeclaration");
          return this.parseForAfterInit(Y, Qe, Se);
        }
        var nn = this.isContextual("let");
        var qn = false;
        var zr = this.isUsing(true) ? "using" : this.isAwaitUsing(true) ? "await using" : null;
        if (zr) {
          var wo = this.startNode();
          if (this.next(), zr === "await using") {
            this.next();
          }
          this.parseVar(wo, true, zr);
          this.finishNode(wo, "VariableDeclaration");
          return this.parseForAfterInit(Y, wo, Se);
        }
        var Nr = this.containsEsc;
        var pi = new Be();
        var Dr = this.start;
        var Us = Se > -1 ? this.parseExprSubscripts(pi, "await") : this.parseExpression(true, pi);
        if (this.type === S._in || (qn = this.options.ecmaVersion >= 6 && this.isContextual("of"))) {
          if (Se > -1) {
            if (this.type === S._in) {
              this.unexpected(Se);
            }
            Y.await = true;
          } else if (qn && this.options.ecmaVersion >= 8) {
            if (Us.start === Dr && !Nr && Us.type === "Identifier" && Us.name === "async") {
              this.unexpected();
            } else if (this.options.ecmaVersion >= 9) {
              Y.await = false;
            }
          }
          if (nn && qn) {
            this.raise(Us.start, "The left-hand side of a for-of loop may not start with 'let'.");
          }
          this.toAssignable(Us, false, pi);
          this.checkLValPattern(Us);
          return this.parseForIn(Y, Us);
        } else {
          this.checkExpressionErrors(pi, true);
        }
        if (Se > -1) {
          this.unexpected(Se);
        }
        return this.parseFor(Y, Us);
      };
      We.parseForAfterInit = function (Y, Se, qe) {
        if ((this.type === S._in || this.options.ecmaVersion >= 6 && this.isContextual("of")) && Se.declarations.length === 1) {
          if (this.options.ecmaVersion >= 9) {
            if (this.type === S._in) {
              if (qe > -1) {
                this.unexpected(qe);
              }
            } else {
              Y.await = qe > -1;
            }
          }
          return this.parseForIn(Y, Se);
        }
        if (qe > -1) {
          this.unexpected(qe);
        }
        return this.parseFor(Y, Se);
      };
      We.parseFunctionStatement = function (Y, Se, qe) {
        this.next();
        return this.parseFunction(Y, Ye | (qe ? 0 : ht), false, Se);
      };
      We.parseIfStatement = function (Y) {
        this.next();
        Y.test = this.parseParenExpression();
        Y.consequent = this.parseStatement("if");
        Y.alternate = this.eat(S._else) ? this.parseStatement("if") : null;
        return this.finishNode(Y, "IfStatement");
      };
      We.parseReturnStatement = function (Y) {
        if (!this.inFunction && !this.options.allowReturnOutsideFunction) {
          this.raise(this.start, "'return' outside of function");
        }
        if (this.next(), this.eat(S.semi) || this.insertSemicolon()) {
          Y.argument = null;
        } else {
          Y.argument = this.parseExpression();
          this.semicolon();
        }
        return this.finishNode(Y, "ReturnStatement");
      };
      We.parseSwitchStatement = function (Y) {
        this.next();
        Y.discriminant = this.parseParenExpression();
        Y.cases = [];
        this.expect(S.braceL);
        this.labels.push(Tt);
        this.enterScope(0);
        var Se;
        for (var qe = false; this.type !== S.braceR;) {
          if (this.type === S._case || this.type === S._default) {
            var Qe = this.type === S._case;
            if (Se) {
              this.finishNode(Se, "SwitchCase");
            }
            if (Y.cases.push(Se = this.startNode()), Se.consequent = [], this.next(), Qe) {
              Se.test = this.parseExpression();
            } else {
              if (qe) {
                this.raiseRecoverable(this.lastTokStart, "Multiple default clauses");
              }
              qe = true;
              Se.test = null;
            }
            this.expect(S.colon);
          } else {
            if (!Se) {
              this.unexpected();
            }
            Se.consequent.push(this.parseStatement(null));
          }
        }
        if (this.exitScope(), Se) {
          this.finishNode(Se, "SwitchCase");
        }
        this.next();
        this.labels.pop();
        return this.finishNode(Y, "SwitchStatement");
      };
      We.parseThrowStatement = function (Y) {
        if (this.next(), E.test(this.input.slice(this.lastTokEnd, this.start))) {
          this.raise(this.lastTokEnd, "Illegal newline after throw");
        }
        Y.argument = this.parseExpression();
        this.semicolon();
        return this.finishNode(Y, "ThrowStatement");
      };
      var kt = [];
      We.parseCatchClauseParam = function () {
        var Y = this.parseBindingAtom();
        var Se = Y.type === "Identifier";
        this.enterScope(Se ? ae : 0);
        this.checkLValPattern(Y, Se ? _e : pe);
        this.expect(S.parenR);
        return Y;
      };
      We.parseTryStatement = function (Y) {
        if (this.next(), Y.block = this.parseBlock(), Y.handler = null, this.type === S._catch) {
          var Se = this.startNode();
          if (this.next(), this.eat(S.parenL)) {
            Se.param = this.parseCatchClauseParam();
          } else {
            if (this.options.ecmaVersion < 10) {
              this.unexpected();
            }
            Se.param = null;
            this.enterScope(0);
          }
          Se.body = this.parseBlock(false);
          this.exitScope();
          Y.handler = this.finishNode(Se, "CatchClause");
        }
        if (Y.finalizer = this.eat(S._finally) ? this.parseBlock() : null, !Y.handler && !Y.finalizer) {
          this.raise(Y.start, "Missing catch or finally clause");
        }
        return this.finishNode(Y, "TryStatement");
      };
      We.parseVarStatement = function (Y, Se, qe) {
        this.next();
        this.parseVar(Y, false, Se, qe);
        this.semicolon();
        return this.finishNode(Y, "VariableDeclaration");
      };
      We.parseWhileStatement = function (Y) {
        this.next();
        Y.test = this.parseParenExpression();
        this.labels.push(Ze);
        Y.body = this.parseStatement("while");
        this.labels.pop();
        return this.finishNode(Y, "WhileStatement");
      };
      We.parseWithStatement = function (Y) {
        if (this.strict) {
          this.raise(this.start, "'with' in strict mode");
        }
        this.next();
        Y.object = this.parseParenExpression();
        Y.body = this.parseStatement("with");
        return this.finishNode(Y, "WithStatement");
      };
      We.parseEmptyStatement = function (Y) {
        this.next();
        return this.finishNode(Y, "EmptyStatement");
      };
      We.parseLabeledStatement = function (Y, Se, qe, Qe) {
        for (var Ht = 0, nn = this.labels; Ht < nn.length; Ht += 1) {
          var qn = nn[Ht];
          if (qn.name === Se) {
            this.raise(qe.start, "Label '" + Se + "' is already declared");
          }
        }
        var zr = this.type.isLoop ? "loop" : this.type === S._switch ? "switch" : null;
        for (var wo = this.labels.length - 1; wo >= 0; wo--) {
          var Nr = this.labels[wo];
          if (Nr.statementStart === Y.start) {
            Nr.statementStart = this.start;
            Nr.kind = zr;
          } else {
            break;
          }
        }
        this.labels.push({
          name: Se,
          kind: zr,
          statementStart: this.start
        });
        Y.body = this.parseStatement(Qe ? Qe.indexOf("label") === -1 ? Qe + "label" : Qe : "label");
        this.labels.pop();
        Y.label = qe;
        return this.finishNode(Y, "LabeledStatement");
      };
      We.parseExpressionStatement = function (Y, Se) {
        Y.expression = Se;
        this.semicolon();
        return this.finishNode(Y, "ExpressionStatement");
      };
      We.parseBlock = function (Y, Se, qe) {
        if (Y === undefined) {
          Y = true;
        }
        if (Se === undefined) {
          Se = this.startNode();
        }
        if (Se.body = [], this.expect(S.braceL), Y) {
          this.enterScope(0);
        }
        while (this.type !== S.braceR) {
          var Qe = this.parseStatement(null);
          Se.body.push(Qe);
        }
        if (qe) {
          this.strict = false;
        }
        if (this.next(), Y) {
          this.exitScope();
        }
        return this.finishNode(Se, "BlockStatement");
      };
      We.parseFor = function (Y, Se) {
        Y.init = Se;
        this.expect(S.semi);
        Y.test = this.type === S.semi ? null : this.parseExpression();
        this.expect(S.semi);
        Y.update = this.type === S.parenR ? null : this.parseExpression();
        this.expect(S.parenR);
        Y.body = this.parseStatement("for");
        this.exitScope();
        this.labels.pop();
        return this.finishNode(Y, "ForStatement");
      };
      We.parseForIn = function (Y, Se) {
        var qe = this.type === S._in;
        if (this.next(), Se.type === "VariableDeclaration" && Se.declarations[0].init != null && (!qe || this.options.ecmaVersion < 8 || this.strict || Se.kind !== "var" || Se.declarations[0].id.type !== "Identifier")) {
          this.raise(Se.start, (qe ? "for-in" : "for-of") + " loop variable declaration may not have an initializer");
        }
        Y.left = Se;
        Y.right = qe ? this.parseExpression() : this.parseMaybeAssign();
        this.expect(S.parenR);
        Y.body = this.parseStatement("for");
        this.exitScope();
        this.labels.pop();
        return this.finishNode(Y, qe ? "ForInStatement" : "ForOfStatement");
      };
      We.parseVar = function (Y, Se, qe, Qe) {
        Y.declarations = [];
        Y.kind = qe;
        for (;;) {
          var Ht = this.startNode();
          if (this.parseVarId(Ht, qe), this.eat(S.eq)) {
            Ht.init = this.parseMaybeAssign(Se);
          } else if (!Qe && qe === "const" && !(this.type === S._in || this.options.ecmaVersion >= 6 && this.isContextual("of"))) {
            this.unexpected();
          } else if (!Qe && (qe === "using" || qe === "await using") && this.options.ecmaVersion >= 17 && this.type !== S._in && !this.isContextual("of")) {
            this.raise(this.lastTokEnd, "Missing initializer in " + qe + " declaration");
          } else if (!Qe && Ht.id.type !== "Identifier" && !(Se && (this.type === S._in || this.isContextual("of")))) {
            this.raise(this.lastTokEnd, "Complex binding patterns require an initialization value");
          } else {
            Ht.init = null;
          }
          if (Y.declarations.push(this.finishNode(Ht, "VariableDeclarator")), !this.eat(S.comma)) {
            break;
          }
        }
        return Y;
      };
      We.parseVarId = function (Y, Se) {
        Y.id = Se === "using" || Se === "await using" ? this.parseIdent() : this.parseBindingAtom();
        this.checkLValPattern(Y.id, Se === "var" ? le : pe, false);
      };
      var Ye = 1;
      var ht = 2;
      var It = 4;
      We.parseFunction = function (Y, Se, qe, Qe, Ht) {
        if (this.initFunction(Y), this.options.ecmaVersion >= 9 || this.options.ecmaVersion >= 6 && !Qe) {
          if (this.type === S.star && Se & ht) {
            this.unexpected();
          }
          Y.generator = this.eat(S.star);
        }
        if (this.options.ecmaVersion >= 8) {
          Y.async = !!Qe;
        }
        if (Se & Ye) {
          if (Y.id = Se & It && this.type !== S.name ? null : this.parseIdent(), Y.id && !(Se & ht)) {
            this.checkLValSimple(Y.id, this.strict || Y.generator || Y.async ? this.treatFunctionsAsVar ? le : pe : ve);
          }
        }
        var nn = this.yieldPos;
        var qn = this.awaitPos;
        var zr = this.awaitIdentPos;
        if (this.yieldPos = 0, this.awaitPos = 0, this.awaitIdentPos = 0, this.enterScope(ue(Y.async, Y.generator)), !(Se & Ye)) {
          Y.id = this.type === S.name ? this.parseIdent() : null;
        }
        this.parseFunctionParams(Y);
        this.parseFunctionBody(Y, qe, false, Ht);
        this.yieldPos = nn;
        this.awaitPos = qn;
        this.awaitIdentPos = zr;
        return this.finishNode(Y, Se & Ye ? "FunctionDeclaration" : "FunctionExpression");
      };
      We.parseFunctionParams = function (Y) {
        this.expect(S.parenL);
        Y.params = this.parseBindingList(S.parenR, false, this.options.ecmaVersion >= 8);
        this.checkYieldAwaitInDefaultParams();
      };
      We.parseClass = function (Y, Se) {
        this.next();
        var qe = this.strict;
        this.strict = true;
        this.parseClassId(Y, Se);
        this.parseClassSuper(Y);
        var Qe = this.enterClassBody();
        var Ht = this.startNode();
        var nn = false;
        Ht.body = [];
        this.expect(S.braceL);
        while (this.type !== S.braceR) {
          var qn = this.parseClassElement(Y.superClass !== null);
          if (qn) {
            if (Ht.body.push(qn), qn.type === "MethodDefinition" && qn.kind === "constructor") {
              if (nn) {
                this.raiseRecoverable(qn.start, "Duplicate constructor in the same class");
              }
              nn = true;
            } else if (qn.key && qn.key.type === "PrivateIdentifier" && Rt(Qe, qn)) {
              this.raiseRecoverable(qn.key.start, "Identifier '#" + qn.key.name + "' has already been declared");
            }
          }
        }
        this.strict = qe;
        this.next();
        Y.body = this.finishNode(Ht, "ClassBody");
        this.exitClassBody();
        return this.finishNode(Y, Se ? "ClassDeclaration" : "ClassExpression");
      };
      We.parseClassElement = function (Y) {
        if (this.eat(S.semi)) {
          return null;
        }
        var Se = this.options.ecmaVersion;
        var qe = this.startNode();
        var Qe = "";
        var Ht = false;
        var nn = false;
        var qn = "method";
        var zr = false;
        if (this.eatContextual("static")) {
          if (Se >= 13 && this.eat(S.braceL)) {
            this.parseClassStaticBlock(qe);
            return qe;
          }
          if (this.isClassElementNameStart() || this.type === S.star) {
            zr = true;
          } else {
            Qe = "static";
          }
        }
        if (qe.static = zr, !Qe && Se >= 8 && this.eatContextual("async")) {
          if ((this.isClassElementNameStart() || this.type === S.star) && !this.canInsertSemicolon()) {
            nn = true;
          } else {
            Qe = "async";
          }
        }
        if (!Qe && (Se >= 9 || !nn) && this.eat(S.star)) {
          Ht = true;
        }
        if (!Qe && !nn && !Ht) {
          var wo = this.value;
          if (this.eatContextual("get") || this.eatContextual("set")) {
            if (this.isClassElementNameStart()) {
              qn = wo;
            } else {
              Qe = wo;
            }
          }
        }
        if (Qe) {
          qe.computed = false;
          qe.key = this.startNodeAt(this.lastTokStart, this.lastTokStartLoc);
          qe.key.name = Qe;
          this.finishNode(qe.key, "Identifier");
        } else {
          this.parseClassElementName(qe);
        }
        if (Se < 13 || this.type === S.parenL || qn !== "method" || Ht || nn) {
          var Nr = !qe.static && wt(qe, "constructor");
          var pi = Nr && Y;
          if (Nr && qn !== "method") {
            this.raise(qe.key.start, "Constructor can't have get/set modifier");
          }
          qe.kind = Nr ? "constructor" : qn;
          this.parseClassMethod(qe, Ht, nn, pi);
        } else {
          this.parseClassField(qe);
        }
        return qe;
      };
      We.isClassElementNameStart = function () {
        return this.type === S.name || this.type === S.privateId || this.type === S.num || this.type === S.string || this.type === S.bracketL || this.type.keyword;
      };
      We.parseClassElementName = function (Y) {
        if (this.type === S.privateId) {
          if (this.value === "constructor") {
            this.raise(this.start, "Classes can't have an element named '#constructor'");
          }
          Y.computed = false;
          Y.key = this.parsePrivateIdent();
        } else {
          this.parsePropertyName(Y);
        }
      };
      We.parseClassMethod = function (Y, Se, qe, Qe) {
        var Ht = Y.key;
        if (Y.kind === "constructor") {
          if (Se) {
            this.raise(Ht.start, "Constructor can't be a generator");
          }
          if (qe) {
            this.raise(Ht.start, "Constructor can't be an async method");
          }
        } else if (Y.static && wt(Y, "prototype")) {
          this.raise(Ht.start, "Classes may not have a static property named prototype");
        }
        var nn = Y.value = this.parseMethod(Se, qe, Qe);
        if (Y.kind === "get" && nn.params.length !== 0) {
          this.raiseRecoverable(nn.start, "getter should have no params");
        }
        if (Y.kind === "set" && nn.params.length !== 1) {
          this.raiseRecoverable(nn.start, "setter should have exactly one param");
        }
        if (Y.kind === "set" && nn.params[0].type === "RestElement") {
          this.raiseRecoverable(nn.params[0].start, "Setter cannot use rest params");
        }
        return this.finishNode(Y, "MethodDefinition");
      };
      We.parseClassField = function (Y) {
        if (wt(Y, "constructor")) {
          this.raise(Y.key.start, "Classes can't have a field named 'constructor'");
        } else if (Y.static && wt(Y, "prototype")) {
          this.raise(Y.key.start, "Classes can't have a static field named 'prototype'");
        }
        if (this.eat(S.eq)) {
          this.enterScope(me | de);
          Y.value = this.parseMaybeAssign();
          this.exitScope();
        } else {
          Y.value = null;
        }
        this.semicolon();
        return this.finishNode(Y, "PropertyDefinition");
      };
      We.parseClassStaticBlock = function (Y) {
        Y.body = [];
        var Se = this.labels;
        this.labels = [];
        this.enterScope(fe | de);
        while (this.type !== S.braceR) {
          var qe = this.parseStatement(null);
          Y.body.push(qe);
        }
        this.next();
        this.exitScope();
        this.labels = Se;
        return this.finishNode(Y, "StaticBlock");
      };
      We.parseClassId = function (Y, Se) {
        if (this.type === S.name) {
          if (Y.id = this.parseIdent(), Se) {
            this.checkLValSimple(Y.id, pe, false);
          }
        } else {
          if (Se === true) {
            this.unexpected();
          }
          Y.id = null;
        }
      };
      We.parseClassSuper = function (Y) {
        Y.superClass = this.eat(S._extends) ? this.parseExprSubscripts(null, false) : null;
      };
      We.enterClassBody = function () {
        var Y = {
          declared: Object.create(null),
          used: []
        };
        this.privateNameStack.push(Y);
        return Y.declared;
      };
      We.exitClassBody = function () {
        var Y = this.privateNameStack.pop();
        var Se = Y.declared;
        var qe = Y.used;
        if (!this.options.checkPrivateFields) {
          return;
        }
        var Qe = this.privateNameStack.length;
        var Ht = Qe === 0 ? null : this.privateNameStack[Qe - 1];
        for (var nn = 0; nn < qe.length; ++nn) {
          var qn = qe[nn];
          if (!P(Se, qn.name)) {
            if (Ht) {
              Ht.used.push(qn);
            } else {
              this.raiseRecoverable(qn.start, "Private field '#" + qn.name + "' must be declared in an enclosing class");
            }
          }
        }
      };
      function Rt(Y, Se) {
        var qe = Se.key.name;
        var Qe = Y[qe];
        var Ht = "true";
        if (Se.type === "MethodDefinition" && (Se.kind === "get" || Se.kind === "set")) {
          Ht = (Se.static ? "s" : "i") + Se.kind;
        }
        if (Qe === "iget" && Ht === "iset" || Qe === "iset" && Ht === "iget" || Qe === "sget" && Ht === "sset" || Qe === "sset" && Ht === "sget") {
          Y[qe] = "true";
          return false;
        } else if (!Qe) {
          Y[qe] = Ht;
          return false;
        } else {
          return true;
        }
      }
      function wt(Y, Se) {
        var {
          computed: qe,
          key: Qe
        } = Y;
        return !qe && (Qe.type === "Identifier" && Qe.name === Se || Qe.type === "Literal" && Qe.value === Se);
      }
      We.parseExportAllDeclaration = function (Y, Se) {
        if (this.options.ecmaVersion >= 11) {
          if (this.eatContextual("as")) {
            Y.exported = this.parseModuleExportName();
            this.checkExport(Se, Y.exported, this.lastTokStart);
          } else {
            Y.exported = null;
          }
        }
        if (this.expectContextual("from"), this.type !== S.string) {
          this.unexpected();
        }
        if (Y.source = this.parseExprAtom(), this.options.ecmaVersion >= 16) {
          Y.attributes = this.parseWithClause();
        }
        this.semicolon();
        return this.finishNode(Y, "ExportAllDeclaration");
      };
      We.parseExport = function (Y, Se) {
        if (this.next(), this.eat(S.star)) {
          return this.parseExportAllDeclaration(Y, Se);
        }
        if (this.eat(S._default)) {
          this.checkExport(Se, "default", this.lastTokStart);
          Y.declaration = this.parseExportDefaultDeclaration();
          return this.finishNode(Y, "ExportDefaultDeclaration");
        }
        if (this.shouldParseExportStatement()) {
          if (Y.declaration = this.parseExportDeclaration(Y), Y.declaration.type === "VariableDeclaration") {
            this.checkVariableExport(Se, Y.declaration.declarations);
          } else {
            this.checkExport(Se, Y.declaration.id, Y.declaration.id.start);
          }
          if (Y.specifiers = [], Y.source = null, this.options.ecmaVersion >= 16) {
            Y.attributes = [];
          }
        } else {
          if (Y.declaration = null, Y.specifiers = this.parseExportSpecifiers(Se), this.eatContextual("from")) {
            if (this.type !== S.string) {
              this.unexpected();
            }
            if (Y.source = this.parseExprAtom(), this.options.ecmaVersion >= 16) {
              Y.attributes = this.parseWithClause();
            }
          } else {
            for (var qe = 0, Qe = Y.specifiers; qe < Qe.length; qe += 1) {
              var Ht = Qe[qe];
              if (this.checkUnreserved(Ht.local), this.checkLocalExport(Ht.local), Ht.local.type === "Literal") {
                this.raise(Ht.local.start, "A string literal cannot be used as an exported binding without `from`.");
              }
            }
            if (Y.source = null, this.options.ecmaVersion >= 16) {
              Y.attributes = [];
            }
          }
          this.semicolon();
        }
        return this.finishNode(Y, "ExportNamedDeclaration");
      };
      We.parseExportDeclaration = function (Y) {
        return this.parseStatement(null);
      };
      We.parseExportDefaultDeclaration = function () {
        var Y;
        if (this.type === S._function || (Y = this.isAsyncFunction())) {
          var Se = this.startNode();
          if (this.next(), Y) {
            this.next();
          }
          return this.parseFunction(Se, Ye | It, false, Y);
        } else if (this.type === S._class) {
          var qe = this.startNode();
          return this.parseClass(qe, "nullableID");
        } else {
          var Qe = this.parseMaybeAssign();
          this.semicolon();
          return Qe;
        }
      };
      We.checkExport = function (Y, Se, qe) {
        if (!Y) {
          return;
        }
        if (typeof Se !== "string") {
          Se = Se.type === "Identifier" ? Se.name : Se.value;
        }
        if (P(Y, Se)) {
          this.raiseRecoverable(qe, "Duplicate export '" + Se + "'");
        }
        Y[Se] = true;
      };
      We.checkPatternExport = function (Y, Se) {
        var qe = Se.type;
        if (qe === "Identifier") {
          this.checkExport(Y, Se, Se.start);
        } else if (qe === "ObjectPattern") {
          for (var Qe = 0, Ht = Se.properties; Qe < Ht.length; Qe += 1) {
            var nn = Ht[Qe];
            this.checkPatternExport(Y, nn);
          }
        } else if (qe === "ArrayPattern") {
          for (var qn = 0, zr = Se.elements; qn < zr.length; qn += 1) {
            var wo = zr[qn];
            if (wo) {
              this.checkPatternExport(Y, wo);
            }
          }
        } else if (qe === "Property") {
          this.checkPatternExport(Y, Se.value);
        } else if (qe === "AssignmentPattern") {
          this.checkPatternExport(Y, Se.left);
        } else if (qe === "RestElement") {
          this.checkPatternExport(Y, Se.argument);
        }
      };
      We.checkVariableExport = function (Y, Se) {
        if (!Y) {
          return;
        }
        for (var qe = 0, Qe = Se; qe < Qe.length; qe += 1) {
          var Ht = Qe[qe];
          this.checkPatternExport(Y, Ht.id);
        }
      };
      We.shouldParseExportStatement = function () {
        return this.type.keyword === "var" || this.type.keyword === "const" || this.type.keyword === "class" || this.type.keyword === "function" || this.isLet() || this.isAsyncFunction();
      };
      We.parseExportSpecifier = function (Y) {
        var Se = this.startNode();
        Se.local = this.parseModuleExportName();
        Se.exported = this.eatContextual("as") ? this.parseModuleExportName() : Se.local;
        this.checkExport(Y, Se.exported, Se.exported.start);
        return this.finishNode(Se, "ExportSpecifier");
      };
      We.parseExportSpecifiers = function (Y) {
        var Se = [];
        var qe = true;
        this.expect(S.braceL);
        while (!this.eat(S.braceR)) {
          if (!qe) {
            if (this.expect(S.comma), this.afterTrailingComma(S.braceR)) {
              break;
            }
          } else {
            qe = false;
          }
          Se.push(this.parseExportSpecifier(Y));
        }
        return Se;
      };
      We.parseImport = function (Y) {
        if (this.next(), this.type === S.string) {
          Y.specifiers = kt;
          Y.source = this.parseExprAtom();
        } else {
          Y.specifiers = this.parseImportSpecifiers();
          this.expectContextual("from");
          Y.source = this.type === S.string ? this.parseExprAtom() : this.unexpected();
        }
        if (this.options.ecmaVersion >= 16) {
          Y.attributes = this.parseWithClause();
        }
        this.semicolon();
        return this.finishNode(Y, "ImportDeclaration");
      };
      We.parseImportSpecifier = function () {
        var Y = this.startNode();
        if (Y.imported = this.parseModuleExportName(), this.eatContextual("as")) {
          Y.local = this.parseIdent();
        } else {
          this.checkUnreserved(Y.imported);
          Y.local = Y.imported;
        }
        this.checkLValSimple(Y.local, pe);
        return this.finishNode(Y, "ImportSpecifier");
      };
      We.parseImportDefaultSpecifier = function () {
        var Y = this.startNode();
        Y.local = this.parseIdent();
        this.checkLValSimple(Y.local, pe);
        return this.finishNode(Y, "ImportDefaultSpecifier");
      };
      We.parseImportNamespaceSpecifier = function () {
        var Y = this.startNode();
        this.next();
        this.expectContextual("as");
        Y.local = this.parseIdent();
        this.checkLValSimple(Y.local, pe);
        return this.finishNode(Y, "ImportNamespaceSpecifier");
      };
      We.parseImportSpecifiers = function () {
        var Y = [];
        var Se = true;
        if (this.type === S.name) {
          if (Y.push(this.parseImportDefaultSpecifier()), !this.eat(S.comma)) {
            return Y;
          }
        }
        if (this.type === S.star) {
          Y.push(this.parseImportNamespaceSpecifier());
          return Y;
        }
        this.expect(S.braceL);
        while (!this.eat(S.braceR)) {
          if (!Se) {
            if (this.expect(S.comma), this.afterTrailingComma(S.braceR)) {
              break;
            }
          } else {
            Se = false;
          }
          Y.push(this.parseImportSpecifier());
        }
        return Y;
      };
      We.parseWithClause = function () {
        var Y = [];
        if (!this.eat(S._with)) {
          return Y;
        }
        this.expect(S.braceL);
        var Se = {};
        var qe = true;
        while (!this.eat(S.braceR)) {
          if (!qe) {
            if (this.expect(S.comma), this.afterTrailingComma(S.braceR)) {
              break;
            }
          } else {
            qe = false;
          }
          var Qe = this.parseImportAttribute();
          var Ht = Qe.key.type === "Identifier" ? Qe.key.name : Qe.key.value;
          if (P(Se, Ht)) {
            this.raiseRecoverable(Qe.key.start, "Duplicate attribute key '" + Ht + "'");
          }
          Se[Ht] = true;
          Y.push(Qe);
        }
        return Y;
      };
      We.parseImportAttribute = function () {
        var Y = this.startNode();
        if (Y.key = this.type === S.string ? this.parseExprAtom() : this.parseIdent(this.options.allowReserved !== "never"), this.expect(S.colon), this.type !== S.string) {
          this.unexpected();
        }
        Y.value = this.parseExprAtom();
        return this.finishNode(Y, "ImportAttribute");
      };
      We.parseModuleExportName = function () {
        if (this.options.ecmaVersion >= 13 && this.type === S.string) {
          var Y = this.parseLiteral(this.value);
          if (W.test(Y.value)) {
            this.raise(Y.start, "An export name cannot include a lone surrogate.");
          }
          return Y;
        }
        return this.parseIdent(true);
      };
      We.adaptDirectivePrologue = function (Y) {
        for (var Se = 0; Se < Y.length && this.isDirectiveCandidate(Y[Se]); ++Se) {
          Y[Se].directive = Y[Se].expression.raw.slice(1, -1);
        }
      };
      We.isDirectiveCandidate = function (Y) {
        return this.options.ecmaVersion >= 5 && Y.type === "ExpressionStatement" && Y.expression.type === "Literal" && typeof Y.expression.value === "string" && (this.input[Y.start] === '"' || this.input[Y.start] === "'");
      };
      var vt = ke.prototype;
      vt.toAssignable = function (Y, Se, qe) {
        if (this.options.ecmaVersion >= 6 && Y) {
          switch (Y.type) {
            case "Identifier":
              if (this.inAsync && Y.name === "await") {
                this.raise(Y.start, "Cannot use 'await' as identifier inside an async function");
              }
              break;
            case "ObjectPattern":
            case "ArrayPattern":
            case "AssignmentPattern":
            case "RestElement":
              break;
            case "ObjectExpression":
              if (Y.type = "ObjectPattern", qe) {
                this.checkPatternErrors(qe, true);
              }
              for (var Qe = 0, Ht = Y.properties; Qe < Ht.length; Qe += 1) {
                var nn = Ht[Qe];
                if (this.toAssignable(nn, Se), nn.type === "RestElement" && (nn.argument.type === "ArrayPattern" || nn.argument.type === "ObjectPattern")) {
                  this.raise(nn.argument.start, "Unexpected token");
                }
              }
              break;
            case "Property":
              if (Y.kind !== "init") {
                this.raise(Y.key.start, "Object pattern can't contain getter or setter");
              }
              this.toAssignable(Y.value, Se);
              break;
            case "ArrayExpression":
              if (Y.type = "ArrayPattern", qe) {
                this.checkPatternErrors(qe, true);
              }
              this.toAssignableList(Y.elements, Se);
              break;
            case "SpreadElement":
              if (Y.type = "RestElement", this.toAssignable(Y.argument, Se), Y.argument.type === "AssignmentPattern") {
                this.raise(Y.argument.start, "Rest elements cannot have a default value");
              }
              break;
            case "AssignmentExpression":
              if (Y.operator !== "=") {
                this.raise(Y.left.end, "Only '=' operator can be used for specifying default value.");
              }
              Y.type = "AssignmentPattern";
              delete Y.operator;
              this.toAssignable(Y.left, Se);
              break;
            case "ParenthesizedExpression":
              this.toAssignable(Y.expression, Se, qe);
              break;
            case "ChainExpression":
              this.raiseRecoverable(Y.start, "Optional chaining cannot appear in left-hand side");
              break;
            case "MemberExpression":
              if (!Se) {
                break;
              }
            default:
              this.raise(Y.start, "Assigning to rvalue");
          }
        } else if (qe) {
          this.checkPatternErrors(qe, true);
        }
        return Y;
      };
      vt.toAssignableList = function (Y, Se) {
        var qe = Y.length;
        for (var Qe = 0; Qe < qe; Qe++) {
          var Ht = Y[Qe];
          if (Ht) {
            this.toAssignable(Ht, Se);
          }
        }
        if (qe) {
          var nn = Y[qe - 1];
          if (this.options.ecmaVersion === 6 && Se && nn && nn.type === "RestElement" && nn.argument.type !== "Identifier") {
            this.unexpected(nn.argument.start);
          }
        }
        return Y;
      };
      vt.parseSpread = function (Y) {
        var Se = this.startNode();
        this.next();
        Se.argument = this.parseMaybeAssign(false, Y);
        return this.finishNode(Se, "SpreadElement");
      };
      vt.parseRestBinding = function () {
        var Y = this.startNode();
        if (this.next(), this.options.ecmaVersion === 6 && this.type !== S.name) {
          this.unexpected();
        }
        Y.argument = this.parseBindingAtom();
        return this.finishNode(Y, "RestElement");
      };
      vt.parseBindingAtom = function () {
        if (this.options.ecmaVersion >= 6) {
          switch (this.type) {
            case S.bracketL:
              var Y = this.startNode();
              this.next();
              Y.elements = this.parseBindingList(S.bracketR, true, true);
              return this.finishNode(Y, "ArrayPattern");
            case S.braceL:
              return this.parseObj(true);
          }
        }
        return this.parseIdent();
      };
      vt.parseBindingList = function (Y, Se, qe, Qe) {
        var Ht = [];
        var nn = true;
        while (!this.eat(Y)) {
          if (nn) {
            nn = false;
          } else {
            this.expect(S.comma);
          }
          if (Se && this.type === S.comma) {
            Ht.push(null);
          } else if (qe && this.afterTrailingComma(Y)) {
            break;
          } else if (this.type === S.ellipsis) {
            var qn = this.parseRestBinding();
            if (this.parseBindingListItem(qn), Ht.push(qn), this.type === S.comma) {
              this.raiseRecoverable(this.start, "Comma is not permitted after the rest element");
            }
            this.expect(Y);
            break;
          } else {
            Ht.push(this.parseAssignableListItem(Qe));
          }
        }
        return Ht;
      };
      vt.parseAssignableListItem = function (Y) {
        var Se = this.parseMaybeDefault(this.start, this.startLoc);
        this.parseBindingListItem(Se);
        return Se;
      };
      vt.parseBindingListItem = function (Y) {
        return Y;
      };
      vt.parseMaybeDefault = function (Y, Se, qe) {
        if (qe = qe || this.parseBindingAtom(), this.options.ecmaVersion < 6 || !this.eat(S.eq)) {
          return qe;
        }
        var Qe = this.startNodeAt(Y, Se);
        Qe.left = qe;
        Qe.right = this.parseMaybeAssign();
        return this.finishNode(Qe, "AssignmentPattern");
      };
      vt.checkLValSimple = function (Y, Se, qe) {
        if (Se === undefined) {
          Se = ce;
        }
        var Qe = Se !== ce;
        switch (Y.type) {
          case "Identifier":
            if (this.strict && this.reservedWordsStrictBind.test(Y.name)) {
              this.raiseRecoverable(Y.start, (Qe ? "Binding " : "Assigning to ") + Y.name + " in strict mode");
            }
            if (Qe) {
              if (Se === pe && Y.name === "let") {
                this.raiseRecoverable(Y.start, "let is disallowed as a lexically bound name");
              }
              if (qe) {
                if (P(qe, Y.name)) {
                  this.raiseRecoverable(Y.start, "Argument name clash");
                }
                qe[Y.name] = true;
              }
              if (Se !== xe) {
                this.declareName(Y.name, Se, Y.start);
              }
            }
            break;
          case "ChainExpression":
            this.raiseRecoverable(Y.start, "Optional chaining cannot appear in left-hand side");
            break;
          case "MemberExpression":
            if (Qe) {
              this.raiseRecoverable(Y.start, "Binding member expression");
            }
            break;
          case "ParenthesizedExpression":
            if (Qe) {
              this.raiseRecoverable(Y.start, "Binding parenthesized expression");
            }
            return this.checkLValSimple(Y.expression, Se, qe);
          default:
            this.raise(Y.start, (Qe ? "Binding" : "Assigning to") + " rvalue");
        }
      };
      vt.checkLValPattern = function (Y, Se, qe) {
        if (Se === undefined) {
          Se = ce;
        }
        switch (Y.type) {
          case "ObjectPattern":
            for (var Qe = 0, Ht = Y.properties; Qe < Ht.length; Qe += 1) {
              var nn = Ht[Qe];
              this.checkLValInnerPattern(nn, Se, qe);
            }
            break;
          case "ArrayPattern":
            for (var qn = 0, zr = Y.elements; qn < zr.length; qn += 1) {
              var wo = zr[qn];
              if (wo) {
                this.checkLValInnerPattern(wo, Se, qe);
              }
            }
            break;
          default:
            this.checkLValSimple(Y, Se, qe);
        }
      };
      vt.checkLValInnerPattern = function (Y, Se, qe) {
        if (Se === undefined) {
          Se = ce;
        }
        switch (Y.type) {
          case "Property":
            this.checkLValInnerPattern(Y.value, Se, qe);
            break;
          case "AssignmentPattern":
            this.checkLValPattern(Y.left, Se, qe);
            break;
          case "RestElement":
            this.checkLValPattern(Y.argument, Se, qe);
            break;
          default:
            this.checkLValPattern(Y, Se, qe);
        }
      };
      var yt = function (Se, qe, Qe, Ht, nn) {
        this.token = Se;
        this.isExpr = !!qe;
        this.preserveSpace = !!Qe;
        this.override = Ht;
        this.generator = !!nn;
      };
      var gt = {
        b_stat: new yt("{", false),
        b_expr: new yt("{", true),
        b_tmpl: new yt("${", false),
        p_stat: new yt("(", false),
        p_expr: new yt("(", true),
        q_tmpl: new yt("`", true, true, function (Y) {
          return Y.tryReadTemplateToken();
        }),
        f_stat: new yt("function", false),
        f_expr: new yt("function", true),
        f_expr_gen: new yt("function", true, false, null, true),
        f_gen: new yt("function", false, false, null, true)
      };
      var Ft = ke.prototype;
      Ft.initialContext = function () {
        return [gt.b_stat];
      };
      Ft.curContext = function () {
        return this.context[this.context.length - 1];
      };
      Ft.braceIsBlock = function (Y) {
        var Se = this.curContext();
        if (Se === gt.f_expr || Se === gt.f_stat) {
          return true;
        }
        if (Y === S.colon && (Se === gt.b_stat || Se === gt.b_expr)) {
          return !Se.isExpr;
        }
        if (Y === S._return || Y === S.name && this.exprAllowed) {
          return E.test(this.input.slice(this.lastTokEnd, this.start));
        }
        if (Y === S._else || Y === S.semi || Y === S.eof || Y === S.parenR || Y === S.arrow) {
          return true;
        }
        if (Y === S.braceL) {
          return Se === gt.b_stat;
        }
        if (Y === S._var || Y === S._const || Y === S.name) {
          return false;
        }
        return !this.exprAllowed;
      };
      Ft.inGeneratorContext = function () {
        for (var Y = this.context.length - 1; Y >= 1; Y--) {
          var Se = this.context[Y];
          if (Se.token === "function") {
            return Se.generator;
          }
        }
        return false;
      };
      Ft.updateContext = function (Y) {
        var Se;
        var qe = this.type;
        if (qe.keyword && Y === S.dot) {
          this.exprAllowed = false;
        } else if (Se = qe.updateContext) {
          Se.call(this, Y);
        } else {
          this.exprAllowed = qe.beforeExpr;
        }
      };
      Ft.overrideContext = function (Y) {
        if (this.curContext() !== Y) {
          this.context[this.context.length - 1] = Y;
        }
      };
      S.parenR.updateContext = S.braceR.updateContext = function () {
        if (this.context.length === 1) {
          this.exprAllowed = true;
          return;
        }
        var Y = this.context.pop();
        if (Y === gt.b_stat && this.curContext().token === "function") {
          Y = this.context.pop();
        }
        this.exprAllowed = !Y.isExpr;
      };
      S.braceL.updateContext = function (Y) {
        this.context.push(this.braceIsBlock(Y) ? gt.b_stat : gt.b_expr);
        this.exprAllowed = true;
      };
      S.dollarBraceL.updateContext = function () {
        this.context.push(gt.b_tmpl);
        this.exprAllowed = true;
      };
      S.parenL.updateContext = function (Y) {
        var Se = Y === S._if || Y === S._for || Y === S._with || Y === S._while;
        this.context.push(Se ? gt.p_stat : gt.p_expr);
        this.exprAllowed = true;
      };
      S.incDec.updateContext = function () {};
      S._function.updateContext = S._class.updateContext = function (Y) {
        if (Y.beforeExpr && Y !== S._else && !(Y === S.semi && this.curContext() !== gt.p_stat) && !(Y === S._return && E.test(this.input.slice(this.lastTokEnd, this.start))) && !((Y === S.colon || Y === S.braceL) && this.curContext() === gt.b_stat)) {
          this.context.push(gt.f_expr);
        } else {
          this.context.push(gt.f_stat);
        }
        this.exprAllowed = false;
      };
      S.colon.updateContext = function () {
        if (this.curContext().token === "function") {
          this.context.pop();
        }
        this.exprAllowed = true;
      };
      S.backQuote.updateContext = function () {
        if (this.curContext() === gt.q_tmpl) {
          this.context.pop();
        } else {
          this.context.push(gt.q_tmpl);
        }
        this.exprAllowed = false;
      };
      S.star.updateContext = function (Y) {
        if (Y === S._function) {
          var Se = this.context.length - 1;
          if (this.context[Se] === gt.f_expr) {
            this.context[Se] = gt.f_expr_gen;
          } else {
            this.context[Se] = gt.f_gen;
          }
        }
        this.exprAllowed = true;
      };
      S.name.updateContext = function (Y) {
        var Se = false;
        if (this.options.ecmaVersion >= 6 && Y !== S.dot) {
          if (this.value === "of" && !this.exprAllowed || this.value === "yield" && this.inGeneratorContext()) {
            Se = true;
          }
        }
        this.exprAllowed = Se;
      };
      var on = ke.prototype;
      on.checkPropClash = function (Y, Se, qe) {
        if (this.options.ecmaVersion >= 9 && Y.type === "SpreadElement") {
          return;
        }
        if (this.options.ecmaVersion >= 6 && (Y.computed || Y.method || Y.shorthand)) {
          return;
        }
        var Qe = Y.key;
        var Ht;
        switch (Qe.type) {
          case "Identifier":
            Ht = Qe.name;
            break;
          case "Literal":
            Ht = String(Qe.value);
            break;
          default:
            return;
        }
        var nn = Y.kind;
        if (this.options.ecmaVersion >= 6) {
          if (Ht === "__proto__" && nn === "init") {
            if (Se.proto) {
              if (qe) {
                if (qe.doubleProto < 0) {
                  qe.doubleProto = Qe.start;
                }
              } else {
                this.raiseRecoverable(Qe.start, "Redefinition of __proto__ property");
              }
            }
            Se.proto = true;
          }
          return;
        }
        Ht = "$" + Ht;
        var qn = Se[Ht];
        if (qn) {
          var zr;
          if (nn === "init") {
            zr = this.strict && qn.init || qn.get || qn.set;
          } else {
            zr = qn.init || qn[nn];
          }
          if (zr) {
            this.raiseRecoverable(Qe.start, "Redefinition of property");
          }
        } else {
          qn = Se[Ht] = {
            init: false,
            get: false,
            set: false
          };
        }
        qn[nn] = true;
      };
      on.parseExpression = function (Y, Se) {
        var qe = this.start;
        var Qe = this.startLoc;
        var Ht = this.parseMaybeAssign(Y, Se);
        if (this.type === S.comma) {
          var nn = this.startNodeAt(qe, Qe);
          nn.expressions = [Ht];
          while (this.eat(S.comma)) {
            nn.expressions.push(this.parseMaybeAssign(Y, Se));
          }
          return this.finishNode(nn, "SequenceExpression");
        }
        return Ht;
      };
      on.parseMaybeAssign = function (Y, Se, qe) {
        if (this.isContextual("yield")) {
          if (this.inGenerator) {
            return this.parseYield(Y);
          } else {
            this.exprAllowed = false;
          }
        }
        var Qe = false;
        var Ht = -1;
        var nn = -1;
        var qn = -1;
        if (Se) {
          Ht = Se.parenthesizedAssign;
          nn = Se.trailingComma;
          qn = Se.doubleProto;
          Se.parenthesizedAssign = Se.trailingComma = -1;
        } else {
          Se = new Be();
          Qe = true;
        }
        var zr = this.start;
        var wo = this.startLoc;
        if (this.type === S.parenL || this.type === S.name) {
          this.potentialArrowAt = this.start;
          this.potentialArrowInForAwait = Y === "await";
        }
        var Nr = this.parseMaybeConditional(Y, Se);
        if (qe) {
          Nr = qe.call(this, Nr, zr, wo);
        }
        if (this.type.isAssign) {
          var pi = this.startNodeAt(zr, wo);
          if (pi.operator = this.value, this.type === S.eq) {
            Nr = this.toAssignable(Nr, false, Se);
          }
          if (!Qe) {
            Se.parenthesizedAssign = Se.trailingComma = Se.doubleProto = -1;
          }
          if (Se.shorthandAssign >= Nr.start) {
            Se.shorthandAssign = -1;
          }
          if (this.type === S.eq) {
            this.checkLValPattern(Nr);
          } else {
            this.checkLValSimple(Nr);
          }
          if (pi.left = Nr, this.next(), pi.right = this.parseMaybeAssign(Y), qn > -1) {
            Se.doubleProto = qn;
          }
          return this.finishNode(pi, "AssignmentExpression");
        } else if (Qe) {
          this.checkExpressionErrors(Se, true);
        }
        if (Ht > -1) {
          Se.parenthesizedAssign = Ht;
        }
        if (nn > -1) {
          Se.trailingComma = nn;
        }
        return Nr;
      };
      on.parseMaybeConditional = function (Y, Se) {
        var qe = this.start;
        var Qe = this.startLoc;
        var Ht = this.parseExprOps(Y, Se);
        if (this.checkExpressionErrors(Se)) {
          return Ht;
        }
        if (this.eat(S.question)) {
          var nn = this.startNodeAt(qe, Qe);
          nn.test = Ht;
          nn.consequent = this.parseMaybeAssign();
          this.expect(S.colon);
          nn.alternate = this.parseMaybeAssign(Y);
          return this.finishNode(nn, "ConditionalExpression");
        }
        return Ht;
      };
      on.parseExprOps = function (Y, Se) {
        var qe = this.start;
        var Qe = this.startLoc;
        var Ht = this.parseMaybeUnary(Se, false, false, Y);
        if (this.checkExpressionErrors(Se)) {
          return Ht;
        }
        return Ht.start === qe && Ht.type === "ArrowFunctionExpression" ? Ht : this.parseExprOp(Ht, qe, Qe, -1, Y);
      };
      on.parseExprOp = function (Y, Se, qe, Qe, Ht) {
        var nn = this.type.binop;
        if (nn != null && (!Ht || this.type !== S._in)) {
          if (nn > Qe) {
            var qn = this.type === S.logicalOR || this.type === S.logicalAND;
            var zr = this.type === S.coalesce;
            if (zr) {
              nn = S.logicalAND.binop;
            }
            var wo = this.value;
            this.next();
            var Nr = this.start;
            var pi = this.startLoc;
            var Dr = this.parseExprOp(this.parseMaybeUnary(null, false, false, Ht), Nr, pi, nn, Ht);
            var Us = this.buildBinary(Se, qe, Y, Dr, wo, qn || zr);
            if (qn && this.type === S.coalesce || zr && (this.type === S.logicalOR || this.type === S.logicalAND)) {
              this.raiseRecoverable(this.start, "Logical expressions and coalesce expressions cannot be mixed. Wrap either by parentheses");
            }
            return this.parseExprOp(Us, Se, qe, Qe, Ht);
          }
        }
        return Y;
      };
      on.buildBinary = function (Y, Se, qe, Qe, Ht, nn) {
        if (Qe.type === "PrivateIdentifier") {
          this.raise(Qe.start, "Private identifier can only be left side of binary expression");
        }
        var qn = this.startNodeAt(Y, Se);
        qn.left = qe;
        qn.operator = Ht;
        qn.right = Qe;
        return this.finishNode(qn, nn ? "LogicalExpression" : "BinaryExpression");
      };
      on.parseMaybeUnary = function (Y, Se, qe, Qe) {
        var Ht = this.start;
        var nn = this.startLoc;
        var qn;
        if (this.isContextual("await") && this.canAwait) {
          qn = this.parseAwait(Qe);
          Se = true;
        } else if (this.type.prefix) {
          var zr = this.startNode();
          var wo = this.type === S.incDec;
          if (zr.operator = this.value, zr.prefix = true, this.next(), zr.argument = this.parseMaybeUnary(null, true, wo, Qe), this.checkExpressionErrors(Y, true), wo) {
            this.checkLValSimple(zr.argument);
          } else if (this.strict && zr.operator === "delete" && rn(zr.argument)) {
            this.raiseRecoverable(zr.start, "Deleting local variable in strict mode");
          } else if (zr.operator === "delete" && Sn(zr.argument)) {
            this.raiseRecoverable(zr.start, "Private fields can not be deleted");
          } else {
            Se = true;
          }
          qn = this.finishNode(zr, wo ? "UpdateExpression" : "UnaryExpression");
        } else if (!Se && this.type === S.privateId) {
          if ((Qe || this.privateNameStack.length === 0) && this.options.checkPrivateFields) {
            this.unexpected();
          }
          if (qn = this.parsePrivateIdent(), this.type !== S._in) {
            this.unexpected();
          }
        } else {
          if (qn = this.parseExprSubscripts(Y, Qe), this.checkExpressionErrors(Y)) {
            return qn;
          }
          while (this.type.postfix && !this.canInsertSemicolon()) {
            var Nr = this.startNodeAt(Ht, nn);
            Nr.operator = this.value;
            Nr.prefix = false;
            Nr.argument = qn;
            this.checkLValSimple(qn);
            this.next();
            qn = this.finishNode(Nr, "UpdateExpression");
          }
        }
        if (!qe && this.eat(S.starstar)) {
          if (Se) {
            this.unexpected(this.lastTokStart);
          } else {
            return this.buildBinary(Ht, nn, qn, this.parseMaybeUnary(null, false, false, Qe), "**", false);
          }
        } else {
          return qn;
        }
      };
      function rn(Y) {
        return Y.type === "Identifier" || Y.type === "ParenthesizedExpression" && rn(Y.expression);
      }
      function Sn(Y) {
        return Y.type === "MemberExpression" && Y.property.type === "PrivateIdentifier" || Y.type === "ChainExpression" && Sn(Y.expression) || Y.type === "ParenthesizedExpression" && Sn(Y.expression);
      }
      on.parseExprSubscripts = function (Y, Se) {
        var qe = this.start;
        var Qe = this.startLoc;
        var Ht = this.parseExprAtom(Y, Se);
        if (Ht.type === "ArrowFunctionExpression" && this.input.slice(this.lastTokStart, this.lastTokEnd) !== ")") {
          return Ht;
        }
        var nn = this.parseSubscripts(Ht, qe, Qe, false, Se);
        if (Y && nn.type === "MemberExpression") {
          if (Y.parenthesizedAssign >= nn.start) {
            Y.parenthesizedAssign = -1;
          }
          if (Y.parenthesizedBind >= nn.start) {
            Y.parenthesizedBind = -1;
          }
          if (Y.trailingComma >= nn.start) {
            Y.trailingComma = -1;
          }
        }
        return nn;
      };
      on.parseSubscripts = function (Y, Se, qe, Qe, Ht) {
        var nn = this.options.ecmaVersion >= 8 && Y.type === "Identifier" && Y.name === "async" && this.lastTokEnd === Y.end && !this.canInsertSemicolon() && Y.end - Y.start === 5 && this.potentialArrowAt === Y.start;
        var qn = false;
        while (true) {
          var zr = this.parseSubscript(Y, Se, qe, Qe, nn, qn, Ht);
          if (zr.optional) {
            qn = true;
          }
          if (zr === Y || zr.type === "ArrowFunctionExpression") {
            if (qn) {
              var wo = this.startNodeAt(Se, qe);
              wo.expression = zr;
              zr = this.finishNode(wo, "ChainExpression");
            }
            return zr;
          }
          Y = zr;
        }
      };
      on.shouldParseAsyncArrow = function () {
        return !this.canInsertSemicolon() && this.eat(S.arrow);
      };
      on.parseSubscriptAsyncArrow = function (Y, Se, qe, Qe) {
        return this.parseArrowExpression(this.startNodeAt(Y, Se), qe, true, Qe);
      };
      on.parseSubscript = function (Y, Se, qe, Qe, Ht, nn, qn) {
        var zr = this.options.ecmaVersion >= 11;
        var wo = zr && this.eat(S.questionDot);
        if (Qe && wo) {
          this.raise(this.lastTokStart, "Optional chaining cannot appear in the callee of new expressions");
        }
        var Nr = this.eat(S.bracketL);
        if (Nr || wo && this.type !== S.parenL && this.type !== S.backQuote || this.eat(S.dot)) {
          var pi = this.startNodeAt(Se, qe);
          if (pi.object = Y, Nr) {
            pi.property = this.parseExpression();
            this.expect(S.bracketR);
          } else if (this.type === S.privateId && Y.type !== "Super") {
            pi.property = this.parsePrivateIdent();
          } else {
            pi.property = this.parseIdent(this.options.allowReserved !== "never");
          }
          if (pi.computed = !!Nr, zr) {
            pi.optional = wo;
          }
          Y = this.finishNode(pi, "MemberExpression");
        } else if (!Qe && this.eat(S.parenL)) {
          var Dr = new Be();
          var Us = this.yieldPos;
          var oa = this.awaitPos;
          var Du = this.awaitIdentPos;
          this.yieldPos = 0;
          this.awaitPos = 0;
          this.awaitIdentPos = 0;
          var nc = this.parseExprList(S.parenR, this.options.ecmaVersion >= 8, false, Dr);
          if (Ht && !wo && this.shouldParseAsyncArrow()) {
            if (this.checkPatternErrors(Dr, false), this.checkYieldAwaitInDefaultParams(), this.awaitIdentPos > 0) {
              this.raise(this.awaitIdentPos, "Cannot use 'await' as identifier inside an async function");
            }
            this.yieldPos = Us;
            this.awaitPos = oa;
            this.awaitIdentPos = Du;
            return this.parseSubscriptAsyncArrow(Se, qe, nc, qn);
          }
          this.checkExpressionErrors(Dr, true);
          this.yieldPos = Us || this.yieldPos;
          this.awaitPos = oa || this.awaitPos;
          this.awaitIdentPos = Du || this.awaitIdentPos;
          var ju = this.startNodeAt(Se, qe);
          if (ju.callee = Y, ju.arguments = nc, zr) {
            ju.optional = wo;
          }
          Y = this.finishNode(ju, "CallExpression");
        } else if (this.type === S.backQuote) {
          if (wo || nn) {
            this.raise(this.start, "Optional chaining cannot appear in the tag of tagged template expressions");
          }
          var tm = this.startNodeAt(Se, qe);
          tm.tag = Y;
          tm.quasi = this.parseTemplate({
            isTagged: true
          });
          Y = this.finishNode(tm, "TaggedTemplateExpression");
        }
        return Y;
      };
      on.parseExprAtom = function (Y, Se, qe) {
        if (this.type === S.slash) {
          this.readRegexp();
        }
        var Qe;
        var Ht = this.potentialArrowAt === this.start;
        switch (this.type) {
          case S._super:
            if (!this.allowSuper) {
              this.raise(this.start, "'super' keyword outside a method");
            }
            if (Qe = this.startNode(), this.next(), this.type === S.parenL && !this.allowDirectSuper) {
              this.raise(Qe.start, "super() call outside constructor of a subclass");
            }
            if (this.type !== S.dot && this.type !== S.bracketL && this.type !== S.parenL) {
              this.unexpected();
            }
            return this.finishNode(Qe, "Super");
          case S._this:
            Qe = this.startNode();
            this.next();
            return this.finishNode(Qe, "ThisExpression");
          case S.name:
            var nn = this.start;
            var qn = this.startLoc;
            var zr = this.containsEsc;
            var wo = this.parseIdent(false);
            if (this.options.ecmaVersion >= 8 && !zr && wo.name === "async" && !this.canInsertSemicolon() && this.eat(S._function)) {
              this.overrideContext(gt.f_expr);
              return this.parseFunction(this.startNodeAt(nn, qn), 0, false, true, Se);
            }
            if (Ht && !this.canInsertSemicolon()) {
              if (this.eat(S.arrow)) {
                return this.parseArrowExpression(this.startNodeAt(nn, qn), [wo], false, Se);
              }
              if (this.options.ecmaVersion >= 8 && wo.name === "async" && this.type === S.name && !zr && (!this.potentialArrowInForAwait || this.value !== "of" || this.containsEsc)) {
                if (wo = this.parseIdent(false), this.canInsertSemicolon() || !this.eat(S.arrow)) {
                  this.unexpected();
                }
                return this.parseArrowExpression(this.startNodeAt(nn, qn), [wo], true, Se);
              }
            }
            return wo;
          case S.regexp:
            var Nr = this.value;
            Qe = this.parseLiteral(Nr.value);
            Qe.regex = {
              pattern: Nr.pattern,
              flags: Nr.flags
            };
            return Qe;
          case S.num:
          case S.string:
            return this.parseLiteral(this.value);
          case S._null:
          case S._true:
          case S._false:
            Qe = this.startNode();
            Qe.value = this.type === S._null ? null : this.type === S._true;
            Qe.raw = this.type.keyword;
            this.next();
            return this.finishNode(Qe, "Literal");
          case S.parenL:
            var pi = this.start;
            var Dr = this.parseParenAndDistinguishExpression(Ht, Se);
            if (Y) {
              if (Y.parenthesizedAssign < 0 && !this.isSimpleAssignTarget(Dr)) {
                Y.parenthesizedAssign = pi;
              }
              if (Y.parenthesizedBind < 0) {
                Y.parenthesizedBind = pi;
              }
            }
            return Dr;
          case S.bracketL:
            Qe = this.startNode();
            this.next();
            Qe.elements = this.parseExprList(S.bracketR, true, true, Y);
            return this.finishNode(Qe, "ArrayExpression");
          case S.braceL:
            this.overrideContext(gt.b_expr);
            return this.parseObj(false, Y);
          case S._function:
            Qe = this.startNode();
            this.next();
            return this.parseFunction(Qe, 0);
          case S._class:
            return this.parseClass(this.startNode(), false);
          case S._new:
            return this.parseNew();
          case S.backQuote:
            return this.parseTemplate();
          case S._import:
            if (this.options.ecmaVersion >= 11) {
              return this.parseExprImport(qe);
            } else {
              return this.unexpected();
            }
          default:
            return this.parseExprAtomDefault();
        }
      };
      on.parseExprAtomDefault = function () {
        this.unexpected();
      };
      on.parseExprImport = function (Y) {
        var Se = this.startNode();
        if (this.containsEsc) {
          this.raiseRecoverable(this.start, "Escape sequence in keyword import");
        }
        if (this.next(), this.type === S.parenL && !Y) {
          return this.parseDynamicImport(Se);
        } else if (this.type === S.dot) {
          var qe = this.startNodeAt(Se.start, Se.loc && Se.loc.start);
          qe.name = "import";
          Se.meta = this.finishNode(qe, "Identifier");
          return this.parseImportMeta(Se);
        } else {
          this.unexpected();
        }
      };
      on.parseDynamicImport = function (Y) {
        if (this.next(), Y.source = this.parseMaybeAssign(), this.options.ecmaVersion >= 16) {
          if (!this.eat(S.parenR)) {
            if (this.expect(S.comma), !this.afterTrailingComma(S.parenR)) {
              if (Y.options = this.parseMaybeAssign(), !this.eat(S.parenR)) {
                if (this.expect(S.comma), !this.afterTrailingComma(S.parenR)) {
                  this.unexpected();
                }
              }
            } else {
              Y.options = null;
            }
          } else {
            Y.options = null;
          }
        } else if (!this.eat(S.parenR)) {
          var Se = this.start;
          if (this.eat(S.comma) && this.eat(S.parenR)) {
            this.raiseRecoverable(Se, "Trailing comma is not allowed in import()");
          } else {
            this.unexpected(Se);
          }
        }
        return this.finishNode(Y, "ImportExpression");
      };
      on.parseImportMeta = function (Y) {
        this.next();
        var Se = this.containsEsc;
        if (Y.property = this.parseIdent(true), Y.property.name !== "meta") {
          this.raiseRecoverable(Y.property.start, "The only valid meta property for import is 'import.meta'");
        }
        if (Se) {
          this.raiseRecoverable(Y.start, "'import.meta' must not contain escaped characters");
        }
        if (this.options.sourceType !== "module" && !this.options.allowImportExportEverywhere) {
          this.raiseRecoverable(Y.start, "Cannot use 'import.meta' outside a module");
        }
        return this.finishNode(Y, "MetaProperty");
      };
      on.parseLiteral = function (Y) {
        var Se = this.startNode();
        if (Se.value = Y, Se.raw = this.input.slice(this.start, this.end), Se.raw.charCodeAt(Se.raw.length - 1) === 110) {
          Se.bigint = Se.value != null ? Se.value.toString() : Se.raw.slice(0, -1).replace(/_/g, "");
        }
        this.next();
        return this.finishNode(Se, "Literal");
      };
      on.parseParenExpression = function () {
        this.expect(S.parenL);
        var Y = this.parseExpression();
        this.expect(S.parenR);
        return Y;
      };
      on.shouldParseArrow = function (Y) {
        return !this.canInsertSemicolon();
      };
      on.parseParenAndDistinguishExpression = function (Y, Se) {
        var qe = this.start;
        var Qe = this.startLoc;
        var Ht;
        var nn = this.options.ecmaVersion >= 8;
        if (this.options.ecmaVersion >= 6) {
          this.next();
          var qn = this.start;
          var zr = this.startLoc;
          var wo = [];
          var Nr = true;
          var pi = false;
          var Dr = new Be();
          var Us = this.yieldPos;
          var oa = this.awaitPos;
          var Du;
          this.yieldPos = 0;
          this.awaitPos = 0;
          while (this.type !== S.parenR) {
            if (Nr ? Nr = false : this.expect(S.comma), nn && this.afterTrailingComma(S.parenR, true)) {
              pi = true;
              break;
            } else if (this.type === S.ellipsis) {
              if (Du = this.start, wo.push(this.parseParenItem(this.parseRestBinding())), this.type === S.comma) {
                this.raiseRecoverable(this.start, "Comma is not permitted after the rest element");
              }
              break;
            } else {
              wo.push(this.parseMaybeAssign(false, Dr, this.parseParenItem));
            }
          }
          var nc = this.lastTokEnd;
          var ju = this.lastTokEndLoc;
          if (this.expect(S.parenR), Y && this.shouldParseArrow(wo) && this.eat(S.arrow)) {
            this.checkPatternErrors(Dr, false);
            this.checkYieldAwaitInDefaultParams();
            this.yieldPos = Us;
            this.awaitPos = oa;
            return this.parseParenArrowList(qe, Qe, wo, Se);
          }
          if (!wo.length || pi) {
            this.unexpected(this.lastTokStart);
          }
          if (Du) {
            this.unexpected(Du);
          }
          if (this.checkExpressionErrors(Dr, true), this.yieldPos = Us || this.yieldPos, this.awaitPos = oa || this.awaitPos, wo.length > 1) {
            Ht = this.startNodeAt(qn, zr);
            Ht.expressions = wo;
            this.finishNodeAt(Ht, "SequenceExpression", nc, ju);
          } else {
            Ht = wo[0];
          }
        } else {
          Ht = this.parseParenExpression();
        }
        if (this.options.preserveParens) {
          var tm = this.startNodeAt(qe, Qe);
          tm.expression = Ht;
          return this.finishNode(tm, "ParenthesizedExpression");
        } else {
          return Ht;
        }
      };
      on.parseParenItem = function (Y) {
        return Y;
      };
      on.parseParenArrowList = function (Y, Se, qe, Qe) {
        return this.parseArrowExpression(this.startNodeAt(Y, Se), qe, false, Qe);
      };
      var jn = [];
      on.parseNew = function () {
        if (this.containsEsc) {
          this.raiseRecoverable(this.start, "Escape sequence in keyword new");
        }
        var Y = this.startNode();
        if (this.next(), this.options.ecmaVersion >= 6 && this.type === S.dot) {
          var Se = this.startNodeAt(Y.start, Y.loc && Y.loc.start);
          Se.name = "new";
          Y.meta = this.finishNode(Se, "Identifier");
          this.next();
          var qe = this.containsEsc;
          if (Y.property = this.parseIdent(true), Y.property.name !== "target") {
            this.raiseRecoverable(Y.property.start, "The only valid meta property for new is 'new.target'");
          }
          if (qe) {
            this.raiseRecoverable(Y.start, "'new.target' must not contain escaped characters");
          }
          if (!this.allowNewDotTarget) {
            this.raiseRecoverable(Y.start, "'new.target' can only be used in functions and class static block");
          }
          return this.finishNode(Y, "MetaProperty");
        }
        var Qe = this.start;
        var Ht = this.startLoc;
        if (Y.callee = this.parseSubscripts(this.parseExprAtom(null, false, true), Qe, Ht, true, false), this.eat(S.parenL)) {
          Y.arguments = this.parseExprList(S.parenR, this.options.ecmaVersion >= 8, false);
        } else {
          Y.arguments = jn;
        }
        return this.finishNode(Y, "NewExpression");
      };
      on.parseTemplateElement = function (Y) {
        var Se = Y.isTagged;
        var qe = this.startNode();
        if (this.type === S.invalidTemplate) {
          if (!Se) {
            this.raiseRecoverable(this.start, "Bad escape sequence in untagged template literal");
          }
          qe.value = {
            raw: this.value.replace(/\r\n?/g, `
`),
            cooked: null
          };
        } else {
          qe.value = {
            raw: this.input.slice(this.start, this.end).replace(/\r\n?/g, `
`),
            cooked: this.value
          };
        }
        this.next();
        qe.tail = this.type === S.backQuote;
        return this.finishNode(qe, "TemplateElement");
      };
      on.parseTemplate = function (Y) {
        if (Y === undefined) {
          Y = {};
        }
        var Se = Y.isTagged;
        if (Se === undefined) {
          Se = false;
        }
        var qe = this.startNode();
        this.next();
        qe.expressions = [];
        var Qe = this.parseTemplateElement({
          isTagged: Se
        });
        qe.quasis = [Qe];
        while (!Qe.tail) {
          if (this.type === S.eof) {
            this.raise(this.pos, "Unterminated template literal");
          }
          this.expect(S.dollarBraceL);
          qe.expressions.push(this.parseExpression());
          this.expect(S.braceR);
          qe.quasis.push(Qe = this.parseTemplateElement({
            isTagged: Se
          }));
        }
        this.next();
        return this.finishNode(qe, "TemplateLiteral");
      };
      on.isAsyncProp = function (Y) {
        return !Y.computed && Y.key.type === "Identifier" && Y.key.name === "async" && (this.type === S.name || this.type === S.num || this.type === S.string || this.type === S.bracketL || this.type.keyword || this.options.ecmaVersion >= 9 && this.type === S.star) && !E.test(this.input.slice(this.lastTokEnd, this.start));
      };
      on.parseObj = function (Y, Se) {
        var qe = this.startNode();
        var Qe = true;
        var Ht = {};
        qe.properties = [];
        this.next();
        while (!this.eat(S.braceR)) {
          if (!Qe) {
            if (this.expect(S.comma), this.options.ecmaVersion >= 5 && this.afterTrailingComma(S.braceR)) {
              break;
            }
          } else {
            Qe = false;
          }
          var nn = this.parseProperty(Y, Se);
          if (!Y) {
            this.checkPropClash(nn, Ht, Se);
          }
          qe.properties.push(nn);
        }
        return this.finishNode(qe, Y ? "ObjectPattern" : "ObjectExpression");
      };
      on.parseProperty = function (Y, Se) {
        var qe = this.startNode();
        var Qe;
        var Ht;
        var nn;
        var qn;
        if (this.options.ecmaVersion >= 9 && this.eat(S.ellipsis)) {
          if (Y) {
            if (qe.argument = this.parseIdent(false), this.type === S.comma) {
              this.raiseRecoverable(this.start, "Comma is not permitted after the rest element");
            }
            return this.finishNode(qe, "RestElement");
          }
          if (qe.argument = this.parseMaybeAssign(false, Se), this.type === S.comma && Se && Se.trailingComma < 0) {
            Se.trailingComma = this.start;
          }
          return this.finishNode(qe, "SpreadElement");
        }
        if (this.options.ecmaVersion >= 6) {
          if (qe.method = false, qe.shorthand = false, Y || Se) {
            nn = this.start;
            qn = this.startLoc;
          }
          if (!Y) {
            Qe = this.eat(S.star);
          }
        }
        var zr = this.containsEsc;
        if (this.parsePropertyName(qe), !Y && !zr && this.options.ecmaVersion >= 8 && !Qe && this.isAsyncProp(qe)) {
          Ht = true;
          Qe = this.options.ecmaVersion >= 9 && this.eat(S.star);
          this.parsePropertyName(qe);
        } else {
          Ht = false;
        }
        this.parsePropertyValue(qe, Y, Qe, Ht, nn, qn, Se, zr);
        return this.finishNode(qe, "Property");
      };
      on.parseGetterSetter = function (Y) {
        var Se = Y.key.name;
        this.parsePropertyName(Y);
        Y.value = this.parseMethod(false);
        Y.kind = Se;
        var qe = Y.kind === "get" ? 0 : 1;
        if (Y.value.params.length !== qe) {
          var Qe = Y.value.start;
          if (Y.kind === "get") {
            this.raiseRecoverable(Qe, "getter should have no params");
          } else {
            this.raiseRecoverable(Qe, "setter should have exactly one param");
          }
        } else if (Y.kind === "set" && Y.value.params[0].type === "RestElement") {
          this.raiseRecoverable(Y.value.params[0].start, "Setter cannot use rest params");
        }
      };
      on.parsePropertyValue = function (Y, Se, qe, Qe, Ht, nn, qn, zr) {
        if ((qe || Qe) && this.type === S.colon) {
          this.unexpected();
        }
        if (this.eat(S.colon)) {
          Y.value = Se ? this.parseMaybeDefault(this.start, this.startLoc) : this.parseMaybeAssign(false, qn);
          Y.kind = "init";
        } else if (this.options.ecmaVersion >= 6 && this.type === S.parenL) {
          if (Se) {
            this.unexpected();
          }
          Y.method = true;
          Y.value = this.parseMethod(qe, Qe);
          Y.kind = "init";
        } else if (!Se && !zr && this.options.ecmaVersion >= 5 && !Y.computed && Y.key.type === "Identifier" && (Y.key.name === "get" || Y.key.name === "set") && this.type !== S.comma && this.type !== S.braceR && this.type !== S.eq) {
          if (qe || Qe) {
            this.unexpected();
          }
          this.parseGetterSetter(Y);
        } else if (this.options.ecmaVersion >= 6 && !Y.computed && Y.key.type === "Identifier") {
          if (qe || Qe) {
            this.unexpected();
          }
          if (this.checkUnreserved(Y.key), Y.key.name === "await" && !this.awaitIdentPos) {
            this.awaitIdentPos = Ht;
          }
          if (Se) {
            Y.value = this.parseMaybeDefault(Ht, nn, this.copyNode(Y.key));
          } else if (this.type === S.eq && qn) {
            if (qn.shorthandAssign < 0) {
              qn.shorthandAssign = this.start;
            }
            Y.value = this.parseMaybeDefault(Ht, nn, this.copyNode(Y.key));
          } else {
            Y.value = this.copyNode(Y.key);
          }
          Y.kind = "init";
          Y.shorthand = true;
        } else {
          this.unexpected();
        }
      };
      on.parsePropertyName = function (Y) {
        if (this.options.ecmaVersion >= 6) {
          if (this.eat(S.bracketL)) {
            Y.computed = true;
            Y.key = this.parseMaybeAssign();
            this.expect(S.bracketR);
            return Y.key;
          } else {
            Y.computed = false;
          }
        }
        return Y.key = this.type === S.num || this.type === S.string ? this.parseExprAtom() : this.parseIdent(this.options.allowReserved !== "never");
      };
      on.initFunction = function (Y) {
        if (Y.id = null, this.options.ecmaVersion >= 6) {
          Y.generator = Y.expression = false;
        }
        if (this.options.ecmaVersion >= 8) {
          Y.async = false;
        }
      };
      on.parseMethod = function (Y, Se, qe) {
        var Qe = this.startNode();
        var Ht = this.yieldPos;
        var nn = this.awaitPos;
        var qn = this.awaitIdentPos;
        if (this.initFunction(Qe), this.options.ecmaVersion >= 6) {
          Qe.generator = Y;
        }
        if (this.options.ecmaVersion >= 8) {
          Qe.async = !!Se;
        }
        this.yieldPos = 0;
        this.awaitPos = 0;
        this.awaitIdentPos = 0;
        this.enterScope(ue(Se, Qe.generator) | de | (qe ? be : 0));
        this.expect(S.parenL);
        Qe.params = this.parseBindingList(S.parenR, false, this.options.ecmaVersion >= 8);
        this.checkYieldAwaitInDefaultParams();
        this.parseFunctionBody(Qe, false, true, false);
        this.yieldPos = Ht;
        this.awaitPos = nn;
        this.awaitIdentPos = qn;
        return this.finishNode(Qe, "FunctionExpression");
      };
      on.parseArrowExpression = function (Y, Se, qe, Qe) {
        var Ht = this.yieldPos;
        var nn = this.awaitPos;
        var qn = this.awaitIdentPos;
        if (this.enterScope(ue(qe, false) | se), this.initFunction(Y), this.options.ecmaVersion >= 8) {
          Y.async = !!qe;
        }
        this.yieldPos = 0;
        this.awaitPos = 0;
        this.awaitIdentPos = 0;
        Y.params = this.toAssignableList(Se, true);
        this.parseFunctionBody(Y, true, false, Qe);
        this.yieldPos = Ht;
        this.awaitPos = nn;
        this.awaitIdentPos = qn;
        return this.finishNode(Y, "ArrowFunctionExpression");
      };
      on.parseFunctionBody = function (Y, Se, qe, Qe) {
        var Ht = Se && this.type !== S.braceL;
        var nn = this.strict;
        var qn = false;
        if (Ht) {
          Y.body = this.parseMaybeAssign(Qe);
          Y.expression = true;
          this.checkParams(Y, false);
        } else {
          var zr = this.options.ecmaVersion >= 7 && !this.isSimpleParamList(Y.params);
          if (!nn || zr) {
            if (qn = this.strictDirective(this.end), qn && zr) {
              this.raiseRecoverable(Y.start, "Illegal 'use strict' directive in function with non-simple parameter list");
            }
          }
          var wo = this.labels;
          if (this.labels = [], qn) {
            this.strict = true;
          }
          if (this.checkParams(Y, !nn && !qn && !Se && !qe && this.isSimpleParamList(Y.params)), this.strict && Y.id) {
            this.checkLValSimple(Y.id, xe);
          }
          Y.body = this.parseBlock(false, undefined, qn && !nn);
          Y.expression = false;
          this.adaptDirectivePrologue(Y.body.body);
          this.labels = wo;
        }
        this.exitScope();
      };
      on.isSimpleParamList = function (Y) {
        for (var Se = 0, qe = Y; Se < qe.length; Se += 1) {
          var Qe = qe[Se];
          if (Qe.type !== "Identifier") {
            return false;
          }
        }
        return true;
      };
      on.checkParams = function (Y, Se) {
        var qe = Object.create(null);
        for (var Qe = 0, Ht = Y.params; Qe < Ht.length; Qe += 1) {
          var nn = Ht[Qe];
          this.checkLValInnerPattern(nn, le, Se ? null : qe);
        }
      };
      on.parseExprList = function (Y, Se, qe, Qe) {
        var Ht = [];
        var nn = true;
        while (!this.eat(Y)) {
          if (!nn) {
            if (this.expect(S.comma), Se && this.afterTrailingComma(Y)) {
              break;
            }
          } else {
            nn = false;
          }
          var qn = undefined;
          if (qe && this.type === S.comma) {
            qn = null;
          } else if (this.type === S.ellipsis) {
            if (qn = this.parseSpread(Qe), Qe && this.type === S.comma && Qe.trailingComma < 0) {
              Qe.trailingComma = this.start;
            }
          } else {
            qn = this.parseMaybeAssign(false, Qe);
          }
          Ht.push(qn);
        }
        return Ht;
      };
      on.checkUnreserved = function (Y) {
        var {
          start: Se,
          end: qe,
          name: Qe
        } = Y;
        if (this.inGenerator && Qe === "yield") {
          this.raiseRecoverable(Se, "Cannot use 'yield' as identifier inside a generator");
        }
        if (this.inAsync && Qe === "await") {
          this.raiseRecoverable(Se, "Cannot use 'await' as identifier inside an async function");
        }
        if (!(this.currentThisScope().flags & Te) && Qe === "arguments") {
          this.raiseRecoverable(Se, "Cannot use 'arguments' in class field initializer");
        }
        if (this.inClassStaticBlock && (Qe === "arguments" || Qe === "await")) {
          this.raise(Se, "Cannot use " + Qe + " in class static initialization block");
        }
        if (this.keywords.test(Qe)) {
          this.raise(Se, "Unexpected keyword '" + Qe + "'");
        }
        if (this.options.ecmaVersion < 6 && this.input.slice(Se, qe).indexOf("\\") !== -1) {
          return;
        }
        var Ht = this.strict ? this.reservedWordsStrict : this.reservedWords;
        if (Ht.test(Qe)) {
          if (!this.inAsync && Qe === "await") {
            this.raiseRecoverable(Se, "Cannot use keyword 'await' outside an async function");
          }
          this.raiseRecoverable(Se, "The keyword '" + Qe + "' is reserved");
        }
      };
      on.parseIdent = function (Y) {
        var Se = this.parseIdentNode();
        if (this.next(!!Y), this.finishNode(Se, "Identifier"), !Y) {
          if (this.checkUnreserved(Se), Se.name === "await" && !this.awaitIdentPos) {
            this.awaitIdentPos = Se.start;
          }
        }
        return Se;
      };
      on.parseIdentNode = function () {
        var Y = this.startNode();
        if (this.type === S.name) {
          Y.name = this.value;
        } else if (this.type.keyword) {
          if (Y.name = this.type.keyword, (Y.name === "class" || Y.name === "function") && (this.lastTokEnd !== this.lastTokStart + 1 || this.input.charCodeAt(this.lastTokStart) !== 46)) {
            this.context.pop();
          }
          this.type = S.name;
        } else {
          this.unexpected();
        }
        return Y;
      };
      on.parsePrivateIdent = function () {
        var Y = this.startNode();
        if (this.type === S.privateId) {
          Y.name = this.value;
        } else {
          this.unexpected();
        }
        if (this.next(), this.finishNode(Y, "PrivateIdentifier"), this.options.checkPrivateFields) {
          if (this.privateNameStack.length === 0) {
            this.raise(Y.start, "Private field '#" + Y.name + "' must be declared in an enclosing class");
          } else {
            this.privateNameStack[this.privateNameStack.length - 1].used.push(Y);
          }
        }
        return Y;
      };
      on.parseYield = function (Y) {
        if (!this.yieldPos) {
          this.yieldPos = this.start;
        }
        var Se = this.startNode();
        if (this.next(), this.type === S.semi || this.canInsertSemicolon() || this.type !== S.star && !this.type.startsExpr) {
          Se.delegate = false;
          Se.argument = null;
        } else {
          Se.delegate = this.eat(S.star);
          Se.argument = this.parseMaybeAssign(Y);
        }
        return this.finishNode(Se, "YieldExpression");
      };
      on.parseAwait = function (Y) {
        if (!this.awaitPos) {
          this.awaitPos = this.start;
        }
        var Se = this.startNode();
        this.next();
        Se.argument = this.parseMaybeUnary(null, true, false, Y);
        return this.finishNode(Se, "AwaitExpression");
      };
      var Xr = ke.prototype;
      Xr.raise = function (Y, Se) {
        var qe = V(this.input, Y);
        if (Se += " (" + qe.line + ":" + qe.column + ")", this.sourceFile) {
          Se += " in " + this.sourceFile;
        }
        var Qe = SyntaxError(Se);
        throw Qe.pos = Y, Qe.loc = qe, Qe.raisedAt = this.pos, Qe;
      };
      Xr.raiseRecoverable = Xr.raise;
      Xr.curPosition = function () {
        if (this.options.locations) {
          return new j(this.curLine, this.pos - this.lineStart);
        }
      };
      var co = ke.prototype;
      var Yt = function (Se) {
        this.flags = Se;
        this.var = [];
        this.lexical = [];
        this.functions = [];
      };
      co.enterScope = function (Y) {
        this.scopeStack.push(new Yt(Y));
      };
      co.exitScope = function () {
        this.scopeStack.pop();
      };
      co.treatFunctionsAsVarInScope = function (Y) {
        return Y.flags & oe || !this.inModule && Y.flags & ne;
      };
      co.declareName = function (Y, Se, qe) {
        var Qe = false;
        if (Se === pe) {
          var Ht = this.currentScope();
          if (Qe = Ht.lexical.indexOf(Y) > -1 || Ht.functions.indexOf(Y) > -1 || Ht.var.indexOf(Y) > -1, Ht.lexical.push(Y), this.inModule && Ht.flags & ne) {
            delete this.undefinedExports[Y];
          }
        } else if (Se === _e) {
          var nn = this.currentScope();
          nn.lexical.push(Y);
        } else if (Se === ve) {
          var qn = this.currentScope();
          if (this.treatFunctionsAsVar) {
            Qe = qn.lexical.indexOf(Y) > -1;
          } else {
            Qe = qn.lexical.indexOf(Y) > -1 || qn.var.indexOf(Y) > -1;
          }
          qn.functions.push(Y);
        } else {
          for (var zr = this.scopeStack.length - 1; zr >= 0; --zr) {
            var wo = this.scopeStack[zr];
            if (wo.lexical.indexOf(Y) > -1 && !(wo.flags & ae && wo.lexical[0] === Y) || !this.treatFunctionsAsVarInScope(wo) && wo.functions.indexOf(Y) > -1) {
              Qe = true;
              break;
            }
            if (wo.var.push(Y), this.inModule && wo.flags & ne) {
              delete this.undefinedExports[Y];
            }
            if (wo.flags & Te) {
              break;
            }
          }
        }
        if (Qe) {
          this.raiseRecoverable(qe, "Identifier '" + Y + "' has already been declared");
        }
      };
      co.checkLocalExport = function (Y) {
        if (this.scopeStack[0].lexical.indexOf(Y.name) === -1 && this.scopeStack[0].var.indexOf(Y.name) === -1) {
          this.undefinedExports[Y.name] = Y;
        }
      };
      co.currentScope = function () {
        return this.scopeStack[this.scopeStack.length - 1];
      };
      co.currentVarScope = function () {
        for (var Y = this.scopeStack.length - 1;; Y--) {
          var Se = this.scopeStack[Y];
          if (Se.flags & (Te | me | fe)) {
            return Se;
          }
        }
      };
      co.currentThisScope = function () {
        for (var Y = this.scopeStack.length - 1;; Y--) {
          var Se = this.scopeStack[Y];
          if (Se.flags & (Te | me | fe) && !(Se.flags & se)) {
            return Se;
          }
        }
      };
      var Ee = function (Se, qe, Qe) {
        if (this.type = "", this.start = qe, this.end = 0, Se.options.locations) {
          this.loc = new z(Se, Qe);
        }
        if (Se.options.directSourceFile) {
          this.sourceFile = Se.options.directSourceFile;
        }
        if (Se.options.ranges) {
          this.range = [qe, 0];
        }
      };
      var Re = ke.prototype;
      Re.startNode = function () {
        return new Ee(this, this.start, this.startLoc);
      };
      Re.startNodeAt = function (Y, Se) {
        return new Ee(this, Y, Se);
      };
      function Ce(Y, Se, qe, Qe) {
        if (Y.type = Se, Y.end = qe, this.options.locations) {
          Y.loc.end = Qe;
        }
        if (this.options.ranges) {
          Y.range[1] = qe;
        }
        return Y;
      }
      Re.finishNode = function (Y, Se) {
        return Ce.call(this, Y, Se, this.lastTokEnd, this.lastTokEndLoc);
      };
      Re.finishNodeAt = function (Y, Se, qe, Qe) {
        return Ce.call(this, Y, Se, qe, Qe);
      };
      Re.copyNode = function (Y) {
        var Se = new Ee(this, Y.start, this.startLoc);
        for (var qe in Y) {
          Se[qe] = Y[qe];
        }
        return Se;
      };
      var Fe = "Gara Garay Gukh Gurung_Khema Hrkt Katakana_Or_Hiragana Kawi Kirat_Rai Krai Nag_Mundari Nagm Ol_Onal Onao Sunu Sunuwar Todhri Todr Tulu_Tigalari Tutg Unknown Zzzz";
      var Xe = "ASCII ASCII_Hex_Digit AHex Alphabetic Alpha Any Assigned Bidi_Control Bidi_C Bidi_Mirrored Bidi_M Case_Ignorable CI Cased Changes_When_Casefolded CWCF Changes_When_Casemapped CWCM Changes_When_Lowercased CWL Changes_When_NFKC_Casefolded CWKCF Changes_When_Titlecased CWT Changes_When_Uppercased CWU Dash Default_Ignorable_Code_Point DI Deprecated Dep Diacritic Dia Emoji Emoji_Component Emoji_Modifier Emoji_Modifier_Base Emoji_Presentation Extender Ext Grapheme_Base Gr_Base Grapheme_Extend Gr_Ext Hex_Digit Hex IDS_Binary_Operator IDSB IDS_Trinary_Operator IDST ID_Continue IDC ID_Start IDS Ideographic Ideo Join_Control Join_C Logical_Order_Exception LOE Lowercase Lower Math Noncharacter_Code_Point NChar Pattern_Syntax Pat_Syn Pattern_White_Space Pat_WS Quotation_Mark QMark Radical Regional_Indicator RI Sentence_Terminal STerm Soft_Dotted SD Terminal_Punctuation Term Unified_Ideograph UIdeo Uppercase Upper Variation_Selector VS White_Space space XID_Continue XIDC XID_Start XIDS";
      var He = Xe + " Extended_Pictographic";
      var Gt = He;
      var mt = Gt + " EBase EComp EMod EPres ExtPict";
      var Dt = mt;
      var jt = Dt;
      var bn = {
        9: Xe,
        10: He,
        11: Gt,
        12: mt,
        13: Dt,
        14: jt
      };
      var Ct = "Basic_Emoji Emoji_Keycap_Sequence RGI_Emoji_Modifier_Sequence RGI_Emoji_Flag_Sequence RGI_Emoji_Tag_Sequence RGI_Emoji_ZWJ_Sequence RGI_Emoji";
      var hn = {
        9: "",
        10: "",
        11: "",
        12: "",
        13: "",
        14: Ct
      };
      var vn = "Cased_Letter LC Close_Punctuation Pe Connector_Punctuation Pc Control Cc cntrl Currency_Symbol Sc Dash_Punctuation Pd Decimal_Number Nd digit Enclosing_Mark Me Final_Punctuation Pf Format Cf Initial_Punctuation Pi Letter L Letter_Number Nl Line_Separator Zl Lowercase_Letter Ll Mark M Combining_Mark Math_Symbol Sm Modifier_Letter Lm Modifier_Symbol Sk Nonspacing_Mark Mn Number N Open_Punctuation Ps Other C Other_Letter Lo Other_Number No Other_Punctuation Po Other_Symbol So Paragraph_Separator Zp Private_Use Co Punctuation P punct Separator Z Space_Separator Zs Spacing_Mark Mc Surrogate Cs Symbol S Titlecase_Letter Lt Unassigned Cn Uppercase_Letter Lu";
      var zn = "Adlam Adlm Ahom Anatolian_Hieroglyphs Hluw Arabic Arab Armenian Armn Avestan Avst Balinese Bali Bamum Bamu Bassa_Vah Bass Batak Batk Bengali Beng Bhaiksuki Bhks Bopomofo Bopo Brahmi Brah Braille Brai Buginese Bugi Buhid Buhd Canadian_Aboriginal Cans Carian Cari Caucasian_Albanian Aghb Chakma Cakm Cham Cham Cherokee Cher Common Zyyy Coptic Copt Qaac Cuneiform Xsux Cypriot Cprt Cyrillic Cyrl Deseret Dsrt Devanagari Deva Duployan Dupl Egyptian_Hieroglyphs Egyp Elbasan Elba Ethiopic Ethi Georgian Geor Glagolitic Glag Gothic Goth Grantha Gran Greek Grek Gujarati Gujr Gurmukhi Guru Han Hani Hangul Hang Hanunoo Hano Hatran Hatr Hebrew Hebr Hiragana Hira Imperial_Aramaic Armi Inherited Zinh Qaai Inscriptional_Pahlavi Phli Inscriptional_Parthian Prti Javanese Java Kaithi Kthi Kannada Knda Katakana Kana Kayah_Li Kali Kharoshthi Khar Khmer Khmr Khojki Khoj Khudawadi Sind Lao Laoo Latin Latn Lepcha Lepc Limbu Limb Linear_A Lina Linear_B Linb Lisu Lisu Lycian Lyci Lydian Lydi Mahajani Mahj Malayalam Mlym Mandaic Mand Manichaean Mani Marchen Marc Masaram_Gondi Gonm Meetei_Mayek Mtei Mende_Kikakui Mend Meroitic_Cursive Merc Meroitic_Hieroglyphs Mero Miao Plrd Modi Mongolian Mong Mro Mroo Multani Mult Myanmar Mymr Nabataean Nbat New_Tai_Lue Talu Newa Newa Nko Nkoo Nushu Nshu Ogham Ogam Ol_Chiki Olck Old_Hungarian Hung Old_Italic Ital Old_North_Arabian Narb Old_Permic Perm Old_Persian Xpeo Old_South_Arabian Sarb Old_Turkic Orkh Oriya Orya Osage Osge Osmanya Osma Pahawh_Hmong Hmng Palmyrene Palm Pau_Cin_Hau Pauc Phags_Pa Phag Phoenician Phnx Psalter_Pahlavi Phlp Rejang Rjng Runic Runr Samaritan Samr Saurashtra Saur Sharada Shrd Shavian Shaw Siddham Sidd SignWriting Sgnw Sinhala Sinh Sora_Sompeng Sora Soyombo Soyo Sundanese Sund Syloti_Nagri Sylo Syriac Syrc Tagalog Tglg Tagbanwa Tagb Tai_Le Tale Tai_Tham Lana Tai_Viet Tavt Takri Takr Tamil Taml Tangut Tang Telugu Telu Thaana Thaa Thai Thai Tibetan Tibt Tifinagh Tfng Tirhuta Tirh Ugaritic Ugar Vai Vaii Warang_Citi Wara Yi Yiii Zanabazar_Square Zanb";
      var Pn = zn + " Dogra Dogr Gunjala_Gondi Gong Hanifi_Rohingya Rohg Makasar Maka Medefaidrin Medf Old_Sogdian Sogo Sogdian Sogd";
      var Lr = Pn + " Elymaic Elym Nandinagari Nand Nyiakeng_Puachue_Hmong Hmnp Wancho Wcho";
      var ao = Lr + " Chorasmian Chrs Diak Dives_Akuru Khitan_Small_Script Kits Yezi Yezidi";
      var Nn = ao + " Cypro_Minoan Cpmn Old_Uyghur Ougr Tangsa Tnsa Toto Vithkuqi Vith";
      var Tr = Nn + " " + Fe;
      var To = {
        9: zn,
        10: Pn,
        11: Lr,
        12: ao,
        13: Nn,
        14: Tr
      };
      var wr = {};
      function Ut(Y) {
        var Se = wr[Y] = {
          binary: U(bn[Y] + " " + vn),
          binaryOfStrings: U(hn[Y]),
          nonBinary: {
            General_Category: U(vn),
            Script: U(To[Y])
          }
        };
        Se.nonBinary.Script_Extensions = Se.nonBinary.Script;
        Se.nonBinary.gc = Se.nonBinary.General_Category;
        Se.nonBinary.sc = Se.nonBinary.Script;
        Se.nonBinary.scx = Se.nonBinary.Script_Extensions;
      }
      for (var Wn = 0, Fr = [9, 10, 11, 12, 13, 14]; Wn < Fr.length; Wn += 1) {
        var Is = Fr[Wn];
        Ut(Is);
      }
      var _r = ke.prototype;
      var kn = function (Se, qe) {
        this.parent = Se;
        this.base = qe || this;
      };
      kn.prototype.separatedFrom = function (Se) {
        for (var qe = this; qe; qe = qe.parent) {
          for (var Qe = Se; Qe; Qe = Qe.parent) {
            if (qe.base === Qe.base && qe !== Qe) {
              return true;
            }
          }
        }
        return false;
      };
      kn.prototype.sibling = function () {
        return new kn(this.parent, this.base);
      };
      var Qn = function (Se) {
        this.parser = Se;
        this.validFlags = "gim" + (Se.options.ecmaVersion >= 6 ? "uy" : "") + (Se.options.ecmaVersion >= 9 ? "s" : "") + (Se.options.ecmaVersion >= 13 ? "d" : "") + (Se.options.ecmaVersion >= 15 ? "v" : "");
        this.unicodeProperties = wr[Se.options.ecmaVersion >= 14 ? 14 : Se.options.ecmaVersion];
        this.source = "";
        this.flags = "";
        this.start = 0;
        this.switchU = false;
        this.switchV = false;
        this.switchN = false;
        this.pos = 0;
        this.lastIntValue = 0;
        this.lastStringValue = "";
        this.lastAssertionIsQuantifiable = false;
        this.numCapturingParens = 0;
        this.maxBackReference = 0;
        this.groupNames = Object.create(null);
        this.backReferenceNames = [];
        this.branchID = null;
      };
      Qn.prototype.reset = function (Se, qe, Qe) {
        var Ht = Qe.indexOf("v") !== -1;
        var nn = Qe.indexOf("u") !== -1;
        if (this.start = Se | 0, this.source = qe + "", this.flags = Qe, Ht && this.parser.options.ecmaVersion >= 15) {
          this.switchU = true;
          this.switchV = true;
          this.switchN = true;
        } else {
          this.switchU = nn && this.parser.options.ecmaVersion >= 6;
          this.switchV = false;
          this.switchN = nn && this.parser.options.ecmaVersion >= 9;
        }
      };
      Qn.prototype.raise = function (Se) {
        this.parser.raiseRecoverable(this.start, "Invalid regular expression: /" + this.source + "/: " + Se);
      };
      Qn.prototype.at = function (Se, qe) {
        if (qe === undefined) {
          qe = false;
        }
        var Qe = this.source;
        var Ht = Qe.length;
        if (Se >= Ht) {
          return -1;
        }
        var nn = Qe.charCodeAt(Se);
        if (!(qe || this.switchU) || nn <= 55295 || nn >= 57344 || Se + 1 >= Ht) {
          return nn;
        }
        var qn = Qe.charCodeAt(Se + 1);
        return qn >= 56320 && qn <= 57343 ? (nn << 10) + qn - 56613888 : nn;
      };
      Qn.prototype.nextIndex = function (Se, qe) {
        if (qe === undefined) {
          qe = false;
        }
        var Qe = this.source;
        var Ht = Qe.length;
        if (Se >= Ht) {
          return Ht;
        }
        var nn = Qe.charCodeAt(Se);
        var qn;
        if (!(qe || this.switchU) || nn <= 55295 || nn >= 57344 || Se + 1 >= Ht || (qn = Qe.charCodeAt(Se + 1)) < 56320 || qn > 57343) {
          return Se + 1;
        }
        return Se + 2;
      };
      Qn.prototype.current = function (Se) {
        if (Se === undefined) {
          Se = false;
        }
        return this.at(this.pos, Se);
      };
      Qn.prototype.lookahead = function (Se) {
        if (Se === undefined) {
          Se = false;
        }
        return this.at(this.nextIndex(this.pos, Se), Se);
      };
      Qn.prototype.advance = function (Se) {
        if (Se === undefined) {
          Se = false;
        }
        this.pos = this.nextIndex(this.pos, Se);
      };
      Qn.prototype.eat = function (Se, qe) {
        if (qe === undefined) {
          qe = false;
        }
        if (this.current(qe) === Se) {
          this.advance(qe);
          return true;
        }
        return false;
      };
      Qn.prototype.eatChars = function (Se, qe) {
        if (qe === undefined) {
          qe = false;
        }
        var Qe = this.pos;
        for (var Ht = 0, nn = Se; Ht < nn.length; Ht += 1) {
          var qn = nn[Ht];
          var zr = this.at(Qe, qe);
          if (zr === -1 || zr !== qn) {
            return false;
          }
          Qe = this.nextIndex(Qe, qe);
        }
        this.pos = Qe;
        return true;
      };
      _r.validateRegExpFlags = function (Y) {
        var {
          validFlags: Se,
          flags: qe
        } = Y;
        var Qe = false;
        var Ht = false;
        for (var nn = 0; nn < qe.length; nn++) {
          var qn = qe.charAt(nn);
          if (Se.indexOf(qn) === -1) {
            this.raise(Y.start, "Invalid regular expression flag");
          }
          if (qe.indexOf(qn, nn + 1) > -1) {
            this.raise(Y.start, "Duplicate regular expression flag");
          }
          if (qn === "u") {
            Qe = true;
          }
          if (qn === "v") {
            Ht = true;
          }
        }
        if (this.options.ecmaVersion >= 15 && Qe && Ht) {
          this.raise(Y.start, "Invalid regular expression flag");
        }
      };
      function gi(Y) {
        for (var Se in Y) {
          return true;
        }
        return false;
      }
      _r.validateRegExpPattern = function (Y) {
        if (this.regexp_pattern(Y), !Y.switchN && this.options.ecmaVersion >= 9 && gi(Y.groupNames)) {
          Y.switchN = true;
          this.regexp_pattern(Y);
        }
      };
      _r.regexp_pattern = function (Y) {
        if (Y.pos = 0, Y.lastIntValue = 0, Y.lastStringValue = "", Y.lastAssertionIsQuantifiable = false, Y.numCapturingParens = 0, Y.maxBackReference = 0, Y.groupNames = Object.create(null), Y.backReferenceNames.length = 0, Y.branchID = null, this.regexp_disjunction(Y), Y.pos !== Y.source.length) {
          if (Y.eat(41)) {
            Y.raise("Unmatched ')'");
          }
          if (Y.eat(93) || Y.eat(125)) {
            Y.raise("Lone quantifier brackets");
          }
        }
        if (Y.maxBackReference > Y.numCapturingParens) {
          Y.raise("Invalid escape");
        }
        for (var Se = 0, qe = Y.backReferenceNames; Se < qe.length; Se += 1) {
          var Qe = qe[Se];
          if (!Y.groupNames[Qe]) {
            Y.raise("Invalid named capture referenced");
          }
        }
      };
      _r.regexp_disjunction = function (Y) {
        var Se = this.options.ecmaVersion >= 16;
        if (Se) {
          Y.branchID = new kn(Y.branchID, null);
        }
        this.regexp_alternative(Y);
        while (Y.eat(124)) {
          if (Se) {
            Y.branchID = Y.branchID.sibling();
          }
          this.regexp_alternative(Y);
        }
        if (Se) {
          Y.branchID = Y.branchID.parent;
        }
        if (this.regexp_eatQuantifier(Y, true)) {
          Y.raise("Nothing to repeat");
        }
        if (Y.eat(123)) {
          Y.raise("Lone quantifier brackets");
        }
      };
      _r.regexp_alternative = function (Y) {
        while (Y.pos < Y.source.length && this.regexp_eatTerm(Y)) {
          ;
        }
      };
      _r.regexp_eatTerm = function (Y) {
        if (this.regexp_eatAssertion(Y)) {
          if (Y.lastAssertionIsQuantifiable && this.regexp_eatQuantifier(Y)) {
            if (Y.switchU) {
              Y.raise("Invalid quantifier");
            }
          }
          return true;
        }
        if (Y.switchU ? this.regexp_eatAtom(Y) : this.regexp_eatExtendedAtom(Y)) {
          this.regexp_eatQuantifier(Y);
          return true;
        }
        return false;
      };
      _r.regexp_eatAssertion = function (Y) {
        var Se = Y.pos;
        if (Y.lastAssertionIsQuantifiable = false, Y.eat(94) || Y.eat(36)) {
          return true;
        }
        if (Y.eat(92)) {
          if (Y.eat(66) || Y.eat(98)) {
            return true;
          }
          Y.pos = Se;
        }
        if (Y.eat(40) && Y.eat(63)) {
          var qe = false;
          if (this.options.ecmaVersion >= 9) {
            qe = Y.eat(60);
          }
          if (Y.eat(61) || Y.eat(33)) {
            if (this.regexp_disjunction(Y), !Y.eat(41)) {
              Y.raise("Unterminated group");
            }
            Y.lastAssertionIsQuantifiable = !qe;
            return true;
          }
        }
        Y.pos = Se;
        return false;
      };
      _r.regexp_eatQuantifier = function (Y, Se) {
        if (Se === undefined) {
          Se = false;
        }
        if (this.regexp_eatQuantifierPrefix(Y, Se)) {
          Y.eat(63);
          return true;
        }
        return false;
      };
      _r.regexp_eatQuantifierPrefix = function (Y, Se) {
        return Y.eat(42) || Y.eat(43) || Y.eat(63) || this.regexp_eatBracedQuantifier(Y, Se);
      };
      _r.regexp_eatBracedQuantifier = function (Y, Se) {
        var qe = Y.pos;
        if (Y.eat(123)) {
          var Qe = 0;
          var Ht = -1;
          if (this.regexp_eatDecimalDigits(Y)) {
            if (Qe = Y.lastIntValue, Y.eat(44) && this.regexp_eatDecimalDigits(Y)) {
              Ht = Y.lastIntValue;
            }
            if (Y.eat(125)) {
              if (Ht !== -1 && Ht < Qe && !Se) {
                Y.raise("numbers out of order in {} quantifier");
              }
              return true;
            }
          }
          if (Y.switchU && !Se) {
            Y.raise("Incomplete quantifier");
          }
          Y.pos = qe;
        }
        return false;
      };
      _r.regexp_eatAtom = function (Y) {
        return this.regexp_eatPatternCharacters(Y) || Y.eat(46) || this.regexp_eatReverseSolidusAtomEscape(Y) || this.regexp_eatCharacterClass(Y) || this.regexp_eatUncapturingGroup(Y) || this.regexp_eatCapturingGroup(Y);
      };
      _r.regexp_eatReverseSolidusAtomEscape = function (Y) {
        var Se = Y.pos;
        if (Y.eat(92)) {
          if (this.regexp_eatAtomEscape(Y)) {
            return true;
          }
          Y.pos = Se;
        }
        return false;
      };
      _r.regexp_eatUncapturingGroup = function (Y) {
        var Se = Y.pos;
        if (Y.eat(40)) {
          if (Y.eat(63)) {
            if (this.options.ecmaVersion >= 16) {
              var qe = this.regexp_eatModifiers(Y);
              var Qe = Y.eat(45);
              if (qe || Qe) {
                for (var Ht = 0; Ht < qe.length; Ht++) {
                  var nn = qe.charAt(Ht);
                  if (qe.indexOf(nn, Ht + 1) > -1) {
                    Y.raise("Duplicate regular expression modifiers");
                  }
                }
                if (Qe) {
                  var qn = this.regexp_eatModifiers(Y);
                  if (!qe && !qn && Y.current() === 58) {
                    Y.raise("Invalid regular expression modifiers");
                  }
                  for (var zr = 0; zr < qn.length; zr++) {
                    var wo = qn.charAt(zr);
                    if (qn.indexOf(wo, zr + 1) > -1 || qe.indexOf(wo) > -1) {
                      Y.raise("Duplicate regular expression modifiers");
                    }
                  }
                }
              }
            }
            if (Y.eat(58)) {
              if (this.regexp_disjunction(Y), Y.eat(41)) {
                return true;
              }
              Y.raise("Unterminated group");
            }
          }
          Y.pos = Se;
        }
        return false;
      };
      _r.regexp_eatCapturingGroup = function (Y) {
        if (Y.eat(40)) {
          if (this.options.ecmaVersion >= 9) {
            this.regexp_groupSpecifier(Y);
          } else if (Y.current() === 63) {
            Y.raise("Invalid group");
          }
          if (this.regexp_disjunction(Y), Y.eat(41)) {
            Y.numCapturingParens += 1;
            return true;
          }
          Y.raise("Unterminated group");
        }
        return false;
      };
      _r.regexp_eatModifiers = function (Y) {
        var Se = "";
        var qe = 0;
        while ((qe = Y.current()) !== -1 && Ks(qe)) {
          Se += N(qe);
          Y.advance();
        }
        return Se;
      };
      function Ks(Y) {
        return Y === 105 || Y === 109 || Y === 115;
      }
      _r.regexp_eatExtendedAtom = function (Y) {
        return Y.eat(46) || this.regexp_eatReverseSolidusAtomEscape(Y) || this.regexp_eatCharacterClass(Y) || this.regexp_eatUncapturingGroup(Y) || this.regexp_eatCapturingGroup(Y) || this.regexp_eatInvalidBracedQuantifier(Y) || this.regexp_eatExtendedPatternCharacter(Y);
      };
      _r.regexp_eatInvalidBracedQuantifier = function (Y) {
        if (this.regexp_eatBracedQuantifier(Y, true)) {
          Y.raise("Nothing to repeat");
        }
        return false;
      };
      _r.regexp_eatSyntaxCharacter = function (Y) {
        var Se = Y.current();
        if (Fa(Se)) {
          Y.lastIntValue = Se;
          Y.advance();
          return true;
        }
        return false;
      };
      function Fa(Y) {
        return Y === 36 || Y >= 40 && Y <= 43 || Y === 46 || Y === 63 || Y >= 91 && Y <= 94 || Y >= 123 && Y <= 125;
      }
      _r.regexp_eatPatternCharacters = function (Y) {
        var Se = Y.pos;
        var qe = 0;
        while ((qe = Y.current()) !== -1 && !Fa(qe)) {
          Y.advance();
        }
        return Y.pos !== Se;
      };
      _r.regexp_eatExtendedPatternCharacter = function (Y) {
        var Se = Y.current();
        if (Se !== -1 && Se !== 36 && !(Se >= 40 && Se <= 43) && Se !== 46 && Se !== 63 && Se !== 91 && Se !== 94 && Se !== 124) {
          Y.advance();
          return true;
        }
        return false;
      };
      _r.regexp_groupSpecifier = function (Y) {
        if (Y.eat(63)) {
          if (!this.regexp_eatGroupName(Y)) {
            Y.raise("Invalid group");
          }
          var Se = this.options.ecmaVersion >= 16;
          var qe = Y.groupNames[Y.lastStringValue];
          if (qe) {
            if (Se) {
              for (var Qe = 0, Ht = qe; Qe < Ht.length; Qe += 1) {
                var nn = Ht[Qe];
                if (!nn.separatedFrom(Y.branchID)) {
                  Y.raise("Duplicate capture group name");
                }
              }
            } else {
              Y.raise("Duplicate capture group name");
            }
          }
          if (Se) {
            (qe || (Y.groupNames[Y.lastStringValue] = [])).push(Y.branchID);
          } else {
            Y.groupNames[Y.lastStringValue] = true;
          }
        }
      };
      _r.regexp_eatGroupName = function (Y) {
        if (Y.lastStringValue = "", Y.eat(60)) {
          if (this.regexp_eatRegExpIdentifierName(Y) && Y.eat(62)) {
            return true;
          }
          Y.raise("Invalid capture group name");
        }
        return false;
      };
      _r.regexp_eatRegExpIdentifierName = function (Y) {
        if (Y.lastStringValue = "", this.regexp_eatRegExpIdentifierStart(Y)) {
          Y.lastStringValue += N(Y.lastIntValue);
          while (this.regexp_eatRegExpIdentifierPart(Y)) {
            Y.lastStringValue += N(Y.lastIntValue);
          }
          return true;
        }
        return false;
      };
      _r.regexp_eatRegExpIdentifierStart = function (Y) {
        var Se = Y.pos;
        var qe = this.options.ecmaVersion >= 11;
        var Qe = Y.current(qe);
        if (Y.advance(qe), Qe === 92 && this.regexp_eatRegExpUnicodeEscapeSequence(Y, qe)) {
          Qe = Y.lastIntValue;
        }
        if (Hs(Qe)) {
          Y.lastIntValue = Qe;
          return true;
        }
        Y.pos = Se;
        return false;
      };
      function Hs(Y) {
        return p(Y, true) || Y === 36 || Y === 95;
      }
      _r.regexp_eatRegExpIdentifierPart = function (Y) {
        var Se = Y.pos;
        var qe = this.options.ecmaVersion >= 11;
        var Qe = Y.current(qe);
        if (Y.advance(qe), Qe === 92 && this.regexp_eatRegExpUnicodeEscapeSequence(Y, qe)) {
          Qe = Y.lastIntValue;
        }
        if (Ms(Qe)) {
          Y.lastIntValue = Qe;
          return true;
        }
        Y.pos = Se;
        return false;
      };
      function Ms(Y) {
        return m(Y, true) || Y === 36 || Y === 95 || Y === 8204 || Y === 8205;
      }
      _r.regexp_eatAtomEscape = function (Y) {
        if (this.regexp_eatBackReference(Y) || this.regexp_eatCharacterClassEscape(Y) || this.regexp_eatCharacterEscape(Y) || Y.switchN && this.regexp_eatKGroupName(Y)) {
          return true;
        }
        if (Y.switchU) {
          if (Y.current() === 99) {
            Y.raise("Invalid unicode escape");
          }
          Y.raise("Invalid escape");
        }
        return false;
      };
      _r.regexp_eatBackReference = function (Y) {
        var Se = Y.pos;
        if (this.regexp_eatDecimalEscape(Y)) {
          var qe = Y.lastIntValue;
          if (Y.switchU) {
            if (qe > Y.maxBackReference) {
              Y.maxBackReference = qe;
            }
            return true;
          }
          if (qe <= Y.numCapturingParens) {
            return true;
          }
          Y.pos = Se;
        }
        return false;
      };
      _r.regexp_eatKGroupName = function (Y) {
        if (Y.eat(107)) {
          if (this.regexp_eatGroupName(Y)) {
            Y.backReferenceNames.push(Y.lastStringValue);
            return true;
          }
          Y.raise("Invalid named reference");
        }
        return false;
      };
      _r.regexp_eatCharacterEscape = function (Y) {
        return this.regexp_eatControlEscape(Y) || this.regexp_eatCControlLetter(Y) || this.regexp_eatZero(Y) || this.regexp_eatHexEscapeSequence(Y) || this.regexp_eatRegExpUnicodeEscapeSequence(Y, false) || !Y.switchU && this.regexp_eatLegacyOctalEscapeSequence(Y) || this.regexp_eatIdentityEscape(Y);
      };
      _r.regexp_eatCControlLetter = function (Y) {
        var Se = Y.pos;
        if (Y.eat(99)) {
          if (this.regexp_eatControlLetter(Y)) {
            return true;
          }
          Y.pos = Se;
        }
        return false;
      };
      _r.regexp_eatZero = function (Y) {
        if (Y.current() === 48 && !Xo(Y.lookahead())) {
          Y.lastIntValue = 0;
          Y.advance();
          return true;
        }
        return false;
      };
      _r.regexp_eatControlEscape = function (Y) {
        var Se = Y.current();
        if (Se === 116) {
          Y.lastIntValue = 9;
          Y.advance();
          return true;
        }
        if (Se === 110) {
          Y.lastIntValue = 10;
          Y.advance();
          return true;
        }
        if (Se === 118) {
          Y.lastIntValue = 11;
          Y.advance();
          return true;
        }
        if (Se === 102) {
          Y.lastIntValue = 12;
          Y.advance();
          return true;
        }
        if (Se === 114) {
          Y.lastIntValue = 13;
          Y.advance();
          return true;
        }
        return false;
      };
      _r.regexp_eatControlLetter = function (Y) {
        var Se = Y.current();
        if (Ia(Se)) {
          Y.lastIntValue = Se % 32;
          Y.advance();
          return true;
        }
        return false;
      };
      function Ia(Y) {
        return Y >= 65 && Y <= 90 || Y >= 97 && Y <= 122;
      }
      _r.regexp_eatRegExpUnicodeEscapeSequence = function (Y, Se) {
        if (Se === undefined) {
          Se = false;
        }
        var qe = Y.pos;
        var Qe = Se || Y.switchU;
        if (Y.eat(117)) {
          if (this.regexp_eatFixedHexDigits(Y, 4)) {
            var Ht = Y.lastIntValue;
            if (Qe && Ht >= 55296 && Ht <= 56319) {
              var nn = Y.pos;
              if (Y.eat(92) && Y.eat(117) && this.regexp_eatFixedHexDigits(Y, 4)) {
                var qn = Y.lastIntValue;
                if (qn >= 56320 && qn <= 57343) {
                  Y.lastIntValue = (Ht - 55296) * 1024 + (qn - 56320) + 65536;
                  return true;
                }
              }
              Y.pos = nn;
              Y.lastIntValue = Ht;
            }
            return true;
          }
          if (Qe && Y.eat(123) && this.regexp_eatHexDigits(Y) && Y.eat(125) && ec(Y.lastIntValue)) {
            return true;
          }
          if (Qe) {
            Y.raise("Invalid unicode escape");
          }
          Y.pos = qe;
        }
        return false;
      };
      function ec(Y) {
        return Y >= 0 && Y <= 1114111;
      }
      _r.regexp_eatIdentityEscape = function (Y) {
        if (Y.switchU) {
          if (this.regexp_eatSyntaxCharacter(Y)) {
            return true;
          }
          if (Y.eat(47)) {
            Y.lastIntValue = 47;
            return true;
          }
          return false;
        }
        var Se = Y.current();
        if (Se !== 99 && (!Y.switchN || Se !== 107)) {
          Y.lastIntValue = Se;
          Y.advance();
          return true;
        }
        return false;
      };
      _r.regexp_eatDecimalEscape = function (Y) {
        Y.lastIntValue = 0;
        var Se = Y.current();
        if (Se >= 49 && Se <= 57) {
          do {
            Y.lastIntValue = 10 * Y.lastIntValue + (Se - 48);
            Y.advance();
          } while ((Se = Y.current()) >= 48 && Se <= 57);
          return true;
        }
        return false;
      };
      var Os = 1;
      var Kn = 2;
      _r.regexp_eatCharacterClassEscape = function (Y) {
        var Se = Y.current();
        if (sn(Se)) {
          Y.lastIntValue = -1;
          Y.advance();
          return Os;
        }
        var qe = false;
        if (Y.switchU && this.options.ecmaVersion >= 9 && ((qe = Se === 80) || Se === 112)) {
          Y.lastIntValue = -1;
          Y.advance();
          var Qe;
          if (Y.eat(123) && (Qe = this.regexp_eatUnicodePropertyValueExpression(Y)) && Y.eat(125)) {
            if (qe && Qe === Kn) {
              Y.raise("Invalid property name");
            }
            return Qe;
          }
          Y.raise("Invalid property name");
        }
        return 0;
      };
      function sn(Y) {
        return Y === 100 || Y === 68 || Y === 115 || Y === 83 || Y === 119 || Y === 87;
      }
      _r.regexp_eatUnicodePropertyValueExpression = function (Y) {
        var Se = Y.pos;
        if (this.regexp_eatUnicodePropertyName(Y) && Y.eat(61)) {
          var qe = Y.lastStringValue;
          if (this.regexp_eatUnicodePropertyValue(Y)) {
            var Qe = Y.lastStringValue;
            this.regexp_validateUnicodePropertyNameAndValue(Y, qe, Qe);
            return Os;
          }
        }
        if (Y.pos = Se, this.regexp_eatLoneUnicodePropertyNameOrValue(Y)) {
          var Ht = Y.lastStringValue;
          return this.regexp_validateUnicodePropertyNameOrValue(Y, Ht);
        }
        return 0;
      };
      _r.regexp_validateUnicodePropertyNameAndValue = function (Y, Se, qe) {
        if (!P(Y.unicodeProperties.nonBinary, Se)) {
          Y.raise("Invalid property name");
        }
        if (!Y.unicodeProperties.nonBinary[Se].test(qe)) {
          Y.raise("Invalid property value");
        }
      };
      _r.regexp_validateUnicodePropertyNameOrValue = function (Y, Se) {
        if (Y.unicodeProperties.binary.test(Se)) {
          return Os;
        }
        if (Y.switchV && Y.unicodeProperties.binaryOfStrings.test(Se)) {
          return Kn;
        }
        Y.raise("Invalid property name");
      };
      _r.regexp_eatUnicodePropertyName = function (Y) {
        var Se = 0;
        Y.lastStringValue = "";
        while (Ln(Se = Y.current())) {
          Y.lastStringValue += N(Se);
          Y.advance();
        }
        return Y.lastStringValue !== "";
      };
      function Ln(Y) {
        return Ia(Y) || Y === 95;
      }
      _r.regexp_eatUnicodePropertyValue = function (Y) {
        var Se = 0;
        Y.lastStringValue = "";
        while (ct(Se = Y.current())) {
          Y.lastStringValue += N(Se);
          Y.advance();
        }
        return Y.lastStringValue !== "";
      };
      function ct(Y) {
        return Ln(Y) || Xo(Y);
      }
      _r.regexp_eatLoneUnicodePropertyNameOrValue = function (Y) {
        return this.regexp_eatUnicodePropertyValue(Y);
      };
      _r.regexp_eatCharacterClass = function (Y) {
        if (Y.eat(91)) {
          var Se = Y.eat(94);
          var qe = this.regexp_classContents(Y);
          if (!Y.eat(93)) {
            Y.raise("Unterminated character class");
          }
          if (Se && qe === Kn) {
            Y.raise("Negated character class may contain strings");
          }
          return true;
        }
        return false;
      };
      _r.regexp_classContents = function (Y) {
        if (Y.current() === 93) {
          return Os;
        }
        if (Y.switchV) {
          return this.regexp_classSetExpression(Y);
        }
        this.regexp_nonEmptyClassRanges(Y);
        return Os;
      };
      _r.regexp_nonEmptyClassRanges = function (Y) {
        while (this.regexp_eatClassAtom(Y)) {
          var Se = Y.lastIntValue;
          if (Y.eat(45) && this.regexp_eatClassAtom(Y)) {
            var qe = Y.lastIntValue;
            if (Y.switchU && (Se === -1 || qe === -1)) {
              Y.raise("Invalid character class");
            }
            if (Se !== -1 && qe !== -1 && Se > qe) {
              Y.raise("Range out of order in character class");
            }
          }
        }
      };
      _r.regexp_eatClassAtom = function (Y) {
        var Se = Y.pos;
        if (Y.eat(92)) {
          if (this.regexp_eatClassEscape(Y)) {
            return true;
          }
          if (Y.switchU) {
            var qe = Y.current();
            if (qe === 99 || Ri(qe)) {
              Y.raise("Invalid class escape");
            }
            Y.raise("Invalid escape");
          }
          Y.pos = Se;
        }
        var Qe = Y.current();
        if (Qe !== 93) {
          Y.lastIntValue = Qe;
          Y.advance();
          return true;
        }
        return false;
      };
      _r.regexp_eatClassEscape = function (Y) {
        var Se = Y.pos;
        if (Y.eat(98)) {
          Y.lastIntValue = 8;
          return true;
        }
        if (Y.switchU && Y.eat(45)) {
          Y.lastIntValue = 45;
          return true;
        }
        if (!Y.switchU && Y.eat(99)) {
          if (this.regexp_eatClassControlLetter(Y)) {
            return true;
          }
          Y.pos = Se;
        }
        return this.regexp_eatCharacterClassEscape(Y) || this.regexp_eatCharacterEscape(Y);
      };
      _r.regexp_classSetExpression = function (Y) {
        var Se = Os;
        var qe;
        if (this.regexp_eatClassSetRange(Y)) {
          ;
        } else if (qe = this.regexp_eatClassSetOperand(Y)) {
          if (qe === Kn) {
            Se = Kn;
          }
          var Qe = Y.pos;
          while (Y.eatChars([38, 38])) {
            if (Y.current() !== 38 && (qe = this.regexp_eatClassSetOperand(Y))) {
              if (qe !== Kn) {
                Se = Os;
              }
              continue;
            }
            Y.raise("Invalid character in character class");
          }
          if (Qe !== Y.pos) {
            return Se;
          }
          while (Y.eatChars([45, 45])) {
            if (this.regexp_eatClassSetOperand(Y)) {
              continue;
            }
            Y.raise("Invalid character in character class");
          }
          if (Qe !== Y.pos) {
            return Se;
          }
        } else {
          Y.raise("Invalid character in character class");
        }
        for (;;) {
          if (this.regexp_eatClassSetRange(Y)) {
            continue;
          }
          if (qe = this.regexp_eatClassSetOperand(Y), !qe) {
            return Se;
          }
          if (qe === Kn) {
            Se = Kn;
          }
        }
      };
      _r.regexp_eatClassSetRange = function (Y) {
        var Se = Y.pos;
        if (this.regexp_eatClassSetCharacter(Y)) {
          var qe = Y.lastIntValue;
          if (Y.eat(45) && this.regexp_eatClassSetCharacter(Y)) {
            var Qe = Y.lastIntValue;
            if (qe !== -1 && Qe !== -1 && qe > Qe) {
              Y.raise("Range out of order in character class");
            }
            return true;
          }
          Y.pos = Se;
        }
        return false;
      };
      _r.regexp_eatClassSetOperand = function (Y) {
        if (this.regexp_eatClassSetCharacter(Y)) {
          return Os;
        }
        return this.regexp_eatClassStringDisjunction(Y) || this.regexp_eatNestedClass(Y);
      };
      _r.regexp_eatNestedClass = function (Y) {
        var Se = Y.pos;
        if (Y.eat(91)) {
          var qe = Y.eat(94);
          var Qe = this.regexp_classContents(Y);
          if (Y.eat(93)) {
            if (qe && Qe === Kn) {
              Y.raise("Negated character class may contain strings");
            }
            return Qe;
          }
          Y.pos = Se;
        }
        if (Y.eat(92)) {
          var Ht = this.regexp_eatCharacterClassEscape(Y);
          if (Ht) {
            return Ht;
          }
          Y.pos = Se;
        }
        return null;
      };
      _r.regexp_eatClassStringDisjunction = function (Y) {
        var Se = Y.pos;
        if (Y.eatChars([92, 113])) {
          if (Y.eat(123)) {
            var qe = this.regexp_classStringDisjunctionContents(Y);
            if (Y.eat(125)) {
              return qe;
            }
          } else {
            Y.raise("Invalid escape");
          }
          Y.pos = Se;
        }
        return null;
      };
      _r.regexp_classStringDisjunctionContents = function (Y) {
        var Se = this.regexp_classString(Y);
        while (Y.eat(124)) {
          if (this.regexp_classString(Y) === Kn) {
            Se = Kn;
          }
        }
        return Se;
      };
      _r.regexp_classString = function (Y) {
        var Se = 0;
        while (this.regexp_eatClassSetCharacter(Y)) {
          Se++;
        }
        return Se === 1 ? Os : Kn;
      };
      _r.regexp_eatClassSetCharacter = function (Y) {
        var Se = Y.pos;
        if (Y.eat(92)) {
          if (this.regexp_eatCharacterEscape(Y) || this.regexp_eatClassSetReservedPunctuator(Y)) {
            return true;
          }
          if (Y.eat(98)) {
            Y.lastIntValue = 8;
            return true;
          }
          Y.pos = Se;
          return false;
        }
        var qe = Y.current();
        if (qe < 0 || qe === Y.lookahead() && Br(qe)) {
          return false;
        }
        if (Pr(qe)) {
          return false;
        }
        Y.advance();
        Y.lastIntValue = qe;
        return true;
      };
      function Br(Y) {
        return Y === 33 || Y >= 35 && Y <= 38 || Y >= 42 && Y <= 44 || Y === 46 || Y >= 58 && Y <= 64 || Y === 94 || Y === 96 || Y === 126;
      }
      function Pr(Y) {
        return Y === 40 || Y === 41 || Y === 45 || Y === 47 || Y >= 91 && Y <= 93 || Y >= 123 && Y <= 125;
      }
      _r.regexp_eatClassSetReservedPunctuator = function (Y) {
        var Se = Y.current();
        if (Vr(Se)) {
          Y.lastIntValue = Se;
          Y.advance();
          return true;
        }
        return false;
      };
      function Vr(Y) {
        return Y === 33 || Y === 35 || Y === 37 || Y === 38 || Y === 44 || Y === 45 || Y >= 58 && Y <= 62 || Y === 64 || Y === 96 || Y === 126;
      }
      _r.regexp_eatClassControlLetter = function (Y) {
        var Se = Y.current();
        if (Xo(Se) || Se === 95) {
          Y.lastIntValue = Se % 32;
          Y.advance();
          return true;
        }
        return false;
      };
      _r.regexp_eatHexEscapeSequence = function (Y) {
        var Se = Y.pos;
        if (Y.eat(120)) {
          if (this.regexp_eatFixedHexDigits(Y, 2)) {
            return true;
          }
          if (Y.switchU) {
            Y.raise("Invalid escape");
          }
          Y.pos = Se;
        }
        return false;
      };
      _r.regexp_eatDecimalDigits = function (Y) {
        var Se = Y.pos;
        var qe = 0;
        Y.lastIntValue = 0;
        while (Xo(qe = Y.current())) {
          Y.lastIntValue = 10 * Y.lastIntValue + (qe - 48);
          Y.advance();
        }
        return Y.pos !== Se;
      };
      function Xo(Y) {
        return Y >= 48 && Y <= 57;
      }
      _r.regexp_eatHexDigits = function (Y) {
        var Se = Y.pos;
        var qe = 0;
        Y.lastIntValue = 0;
        while (qo(qe = Y.current())) {
          Y.lastIntValue = 16 * Y.lastIntValue + ss(qe);
          Y.advance();
        }
        return Y.pos !== Se;
      };
      function qo(Y) {
        return Y >= 48 && Y <= 57 || Y >= 65 && Y <= 70 || Y >= 97 && Y <= 102;
      }
      function ss(Y) {
        if (Y >= 65 && Y <= 70) {
          return 10 + (Y - 65);
        }
        if (Y >= 97 && Y <= 102) {
          return 10 + (Y - 97);
        }
        return Y - 48;
      }
      _r.regexp_eatLegacyOctalEscapeSequence = function (Y) {
        if (this.regexp_eatOctalDigit(Y)) {
          var Se = Y.lastIntValue;
          if (this.regexp_eatOctalDigit(Y)) {
            var qe = Y.lastIntValue;
            if (Se <= 3 && this.regexp_eatOctalDigit(Y)) {
              Y.lastIntValue = Se * 64 + qe * 8 + Y.lastIntValue;
            } else {
              Y.lastIntValue = Se * 8 + qe;
            }
          } else {
            Y.lastIntValue = Se;
          }
          return true;
        }
        return false;
      };
      _r.regexp_eatOctalDigit = function (Y) {
        var Se = Y.current();
        if (Ri(Se)) {
          Y.lastIntValue = Se - 48;
          Y.advance();
          return true;
        }
        Y.lastIntValue = 0;
        return false;
      };
      function Ri(Y) {
        return Y >= 48 && Y <= 55;
      }
      _r.regexp_eatFixedHexDigits = function (Y, Se) {
        var qe = Y.pos;
        Y.lastIntValue = 0;
        for (var Qe = 0; Qe < Se; ++Qe) {
          var Ht = Y.current();
          if (!qo(Ht)) {
            Y.pos = qe;
            return false;
          }
          Y.lastIntValue = 16 * Y.lastIntValue + ss(Ht);
          Y.advance();
        }
        return true;
      };
      var ya = function (Se) {
        if (this.type = Se.type, this.value = Se.value, this.start = Se.start, this.end = Se.end, Se.options.locations) {
          this.loc = new z(Se, Se.startLoc, Se.endLoc);
        }
        if (Se.options.ranges) {
          this.range = [Se.start, Se.end];
        }
      };
      var fs = ke.prototype;
      if (fs.next = function (Y) {
        if (!Y && this.type.keyword && this.containsEsc) {
          this.raiseRecoverable(this.start, "Escape sequence in keyword " + this.type.keyword);
        }
        if (this.options.onToken) {
          this.options.onToken(new ya(this));
        }
        this.lastTokEnd = this.end;
        this.lastTokStart = this.start;
        this.lastTokEndLoc = this.endLoc;
        this.lastTokStartLoc = this.startLoc;
        this.nextToken();
      }, fs.getToken = function () {
        this.next();
        return new ya(this);
      }, typeof Symbol < "u") {
        fs[Symbol.iterator] = function () {
          var Y = this;
          return {
            next: function () {
              var Se = Y.getToken();
              return {
                done: Se.type === S.eof,
                value: Se
              };
            }
          };
        };
      }
      fs.nextToken = function () {
        var Y = this.curContext();
        if (!Y || !Y.preserveSpace) {
          this.skipSpace();
        }
        if (this.start = this.pos, this.options.locations) {
          this.startLoc = this.curPosition();
        }
        if (this.pos >= this.input.length) {
          return this.finishToken(S.eof);
        }
        if (Y.override) {
          return Y.override(this);
        } else {
          this.readToken(this.fullCharCodeAtPos());
        }
      };
      fs.readToken = function (Y) {
        if (p(Y, this.options.ecmaVersion >= 6) || Y === 92) {
          return this.readWord();
        }
        return this.getTokenFromCode(Y);
      };
      fs.fullCharCodeAtPos = function () {
        var Y = this.input.charCodeAt(this.pos);
        if (Y <= 55295 || Y >= 56320) {
          return Y;
        }
        var Se = this.input.charCodeAt(this.pos + 1);
        return Se <= 56319 || Se >= 57344 ? Y : (Y << 10) + Se - 56613888;
      };
      fs.skipBlockComment = function () {
        var Y = this.options.onComment && this.curPosition();
        var Se = this.pos;
        var qe = this.input.indexOf("*/", this.pos += 2);
        if (qe === -1) {
          this.raise(this.pos - 2, "Unterminated comment");
        }
        if (this.pos = qe + 2, this.options.locations) {
          for (var Qe = undefined, Ht = Se; (Qe = A(this.input, Ht, this.pos)) > -1;) {
            ++this.curLine;
            Ht = this.lineStart = Qe;
          }
        }
        if (this.options.onComment) {
          this.options.onComment(true, this.input.slice(Se + 2, qe), Se, this.pos, Y, this.curPosition());
        }
      };
      fs.skipLineComment = function (Y) {
        var Se = this.pos;
        var qe = this.options.onComment && this.curPosition();
        var Qe = this.input.charCodeAt(this.pos += Y);
        while (this.pos < this.input.length && !x(Qe)) {
          Qe = this.input.charCodeAt(++this.pos);
        }
        if (this.options.onComment) {
          this.options.onComment(false, this.input.slice(Se + Y, this.pos), Se, this.pos, qe, this.curPosition());
        }
      };
      fs.skipSpace = function () {
        e: while (this.pos < this.input.length) {
          var Y = this.input.charCodeAt(this.pos);
          switch (Y) {
            case 32:
            case 160:
              ++this.pos;
              break;
            case 13:
              if (this.input.charCodeAt(this.pos + 1) === 10) {
                ++this.pos;
              }
            case 10:
            case 8232:
            case 8233:
              if (++this.pos, this.options.locations) {
                ++this.curLine;
                this.lineStart = this.pos;
              }
              break;
            case 47:
              switch (this.input.charCodeAt(this.pos + 1)) {
                case 42:
                  this.skipBlockComment();
                  break;
                case 47:
                  this.skipLineComment(2);
                  break;
                default:
                  break e;
              }
              break;
            default:
              if (Y > 8 && Y < 14 || Y >= 5760 && k.test(String.fromCharCode(Y))) {
                ++this.pos;
              } else {
                break e;
              }
          }
        }
      };
      fs.finishToken = function (Y, Se) {
        if (this.end = this.pos, this.options.locations) {
          this.endLoc = this.curPosition();
        }
        var qe = this.type;
        this.type = Y;
        this.value = Se;
        this.updateContext(qe);
      };
      fs.readToken_dot = function () {
        var Y = this.input.charCodeAt(this.pos + 1);
        if (Y >= 48 && Y <= 57) {
          return this.readNumber(true);
        }
        var Se = this.input.charCodeAt(this.pos + 2);
        if (this.options.ecmaVersion >= 6 && Y === 46 && Se === 46) {
          this.pos += 3;
          return this.finishToken(S.ellipsis);
        } else {
          ++this.pos;
          return this.finishToken(S.dot);
        }
      };
      fs.readToken_slash = function () {
        var Y = this.input.charCodeAt(this.pos + 1);
        if (this.exprAllowed) {
          ++this.pos;
          return this.readRegexp();
        }
        if (Y === 61) {
          return this.finishOp(S.assign, 2);
        }
        return this.finishOp(S.slash, 1);
      };
      fs.readToken_mult_modulo_exp = function (Y) {
        var Se = this.input.charCodeAt(this.pos + 1);
        var qe = 1;
        var Qe = Y === 42 ? S.star : S.modulo;
        if (this.options.ecmaVersion >= 7 && Y === 42 && Se === 42) {
          ++qe;
          Qe = S.starstar;
          Se = this.input.charCodeAt(this.pos + 2);
        }
        if (Se === 61) {
          return this.finishOp(S.assign, qe + 1);
        }
        return this.finishOp(Qe, qe);
      };
      fs.readToken_pipe_amp = function (Y) {
        var Se = this.input.charCodeAt(this.pos + 1);
        if (Se === Y) {
          if (this.options.ecmaVersion >= 12) {
            var qe = this.input.charCodeAt(this.pos + 2);
            if (qe === 61) {
              return this.finishOp(S.assign, 3);
            }
          }
          return this.finishOp(Y === 124 ? S.logicalOR : S.logicalAND, 2);
        }
        if (Se === 61) {
          return this.finishOp(S.assign, 2);
        }
        return this.finishOp(Y === 124 ? S.bitwiseOR : S.bitwiseAND, 1);
      };
      fs.readToken_caret = function () {
        var Y = this.input.charCodeAt(this.pos + 1);
        if (Y === 61) {
          return this.finishOp(S.assign, 2);
        }
        return this.finishOp(S.bitwiseXOR, 1);
      };
      fs.readToken_plus_min = function (Y) {
        var Se = this.input.charCodeAt(this.pos + 1);
        if (Se === Y) {
          if (Se === 45 && !this.inModule && this.input.charCodeAt(this.pos + 2) === 62 && (this.lastTokEnd === 0 || E.test(this.input.slice(this.lastTokEnd, this.pos)))) {
            this.skipLineComment(3);
            this.skipSpace();
            return this.nextToken();
          }
          return this.finishOp(S.incDec, 2);
        }
        if (Se === 61) {
          return this.finishOp(S.assign, 2);
        }
        return this.finishOp(S.plusMin, 1);
      };
      fs.readToken_lt_gt = function (Y) {
        var Se = this.input.charCodeAt(this.pos + 1);
        var qe = 1;
        if (Se === Y) {
          if (qe = Y === 62 && this.input.charCodeAt(this.pos + 2) === 62 ? 3 : 2, this.input.charCodeAt(this.pos + qe) === 61) {
            return this.finishOp(S.assign, qe + 1);
          }
          return this.finishOp(S.bitShift, qe);
        }
        if (Se === 33 && Y === 60 && !this.inModule && this.input.charCodeAt(this.pos + 2) === 45 && this.input.charCodeAt(this.pos + 3) === 45) {
          this.skipLineComment(4);
          this.skipSpace();
          return this.nextToken();
        }
        if (Se === 61) {
          qe = 2;
        }
        return this.finishOp(S.relational, qe);
      };
      fs.readToken_eq_excl = function (Y) {
        var Se = this.input.charCodeAt(this.pos + 1);
        if (Se === 61) {
          return this.finishOp(S.equality, this.input.charCodeAt(this.pos + 2) === 61 ? 3 : 2);
        }
        if (Y === 61 && Se === 62 && this.options.ecmaVersion >= 6) {
          this.pos += 2;
          return this.finishToken(S.arrow);
        }
        return this.finishOp(Y === 61 ? S.eq : S.prefix, 1);
      };
      fs.readToken_question = function () {
        var Y = this.options.ecmaVersion;
        if (Y >= 11) {
          var Se = this.input.charCodeAt(this.pos + 1);
          if (Se === 46) {
            var qe = this.input.charCodeAt(this.pos + 2);
            if (qe < 48 || qe > 57) {
              return this.finishOp(S.questionDot, 2);
            }
          }
          if (Se === 63) {
            if (Y >= 12) {
              var Qe = this.input.charCodeAt(this.pos + 2);
              if (Qe === 61) {
                return this.finishOp(S.assign, 3);
              }
            }
            return this.finishOp(S.coalesce, 2);
          }
        }
        return this.finishOp(S.question, 1);
      };
      fs.readToken_numberSign = function () {
        var Y = this.options.ecmaVersion;
        var Se = 35;
        if (Y >= 13) {
          if (++this.pos, Se = this.fullCharCodeAtPos(), p(Se, true) || Se === 92) {
            return this.finishToken(S.privateId, this.readWord1());
          }
        }
        this.raise(this.pos, "Unexpected character '" + N(Se) + "'");
      };
      fs.getTokenFromCode = function (Y) {
        switch (Y) {
          case 46:
            return this.readToken_dot();
          case 40:
            ++this.pos;
            return this.finishToken(S.parenL);
          case 41:
            ++this.pos;
            return this.finishToken(S.parenR);
          case 59:
            ++this.pos;
            return this.finishToken(S.semi);
          case 44:
            ++this.pos;
            return this.finishToken(S.comma);
          case 91:
            ++this.pos;
            return this.finishToken(S.bracketL);
          case 93:
            ++this.pos;
            return this.finishToken(S.bracketR);
          case 123:
            ++this.pos;
            return this.finishToken(S.braceL);
          case 125:
            ++this.pos;
            return this.finishToken(S.braceR);
          case 58:
            ++this.pos;
            return this.finishToken(S.colon);
          case 96:
            if (this.options.ecmaVersion < 6) {
              break;
            }
            ++this.pos;
            return this.finishToken(S.backQuote);
          case 48:
            var Se = this.input.charCodeAt(this.pos + 1);
            if (Se === 120 || Se === 88) {
              return this.readRadixNumber(16);
            }
            if (this.options.ecmaVersion >= 6) {
              if (Se === 111 || Se === 79) {
                return this.readRadixNumber(8);
              }
              if (Se === 98 || Se === 66) {
                return this.readRadixNumber(2);
              }
            }
          case 49:
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
            return this.readNumber(false);
          case 34:
          case 39:
            return this.readString(Y);
          case 47:
            return this.readToken_slash();
          case 37:
          case 42:
            return this.readToken_mult_modulo_exp(Y);
          case 124:
          case 38:
            return this.readToken_pipe_amp(Y);
          case 94:
            return this.readToken_caret();
          case 43:
          case 45:
            return this.readToken_plus_min(Y);
          case 60:
          case 62:
            return this.readToken_lt_gt(Y);
          case 61:
          case 33:
            return this.readToken_eq_excl(Y);
          case 63:
            return this.readToken_question();
          case 126:
            return this.finishOp(S.prefix, 1);
          case 35:
            return this.readToken_numberSign();
        }
        this.raise(this.pos, "Unexpected character '" + N(Y) + "'");
      };
      fs.finishOp = function (Y, Se) {
        var qe = this.input.slice(this.pos, this.pos + Se);
        this.pos += Se;
        return this.finishToken(Y, qe);
      };
      fs.readRegexp = function () {
        var Y;
        var Se;
        var qe = this.pos;
        for (;;) {
          if (this.pos >= this.input.length) {
            this.raise(qe, "Unterminated regular expression");
          }
          var Qe = this.input.charAt(this.pos);
          if (E.test(Qe)) {
            this.raise(qe, "Unterminated regular expression");
          }
          if (!Y) {
            if (Qe === "[") {
              Se = true;
            } else if (Qe === "]" && Se) {
              Se = false;
            } else if (Qe === "/" && !Se) {
              break;
            }
            Y = Qe === "\\";
          } else {
            Y = false;
          }
          ++this.pos;
        }
        var Ht = this.input.slice(qe, this.pos);
        ++this.pos;
        var nn = this.pos;
        var qn = this.readWord1();
        if (this.containsEsc) {
          this.unexpected(nn);
        }
        var zr = this.regexpState || (this.regexpState = new Qn(this));
        zr.reset(qe, Ht, qn);
        this.validateRegExpFlags(zr);
        this.validateRegExpPattern(zr);
        var wo = null;
        try {
          wo = new RegExp(Ht, qn);
        } catch (Nr) {}
        return this.finishToken(S.regexp, {
          pattern: Ht,
          flags: qn,
          value: wo
        });
      };
      fs.readInt = function (Y, Se, qe) {
        var Qe = this.options.ecmaVersion >= 12 && Se === undefined;
        var Ht = qe && this.input.charCodeAt(this.pos) === 48;
        var nn = this.pos;
        var qn = 0;
        var zr = 0;
        for (var wo = 0, Nr = Se == null ? 1 / 0 : Se; wo < Nr; ++wo, ++this.pos) {
          var pi = this.input.charCodeAt(this.pos);
          var Dr = undefined;
          if (Qe && pi === 95) {
            if (Ht) {
              this.raiseRecoverable(this.pos, "Numeric separator is not allowed in legacy octal numeric literals");
            }
            if (zr === 95) {
              this.raiseRecoverable(this.pos, "Numeric separator must be exactly one underscore");
            }
            if (wo === 0) {
              this.raiseRecoverable(this.pos, "Numeric separator is not allowed at the first of digits");
            }
            zr = pi;
            continue;
          }
          if (pi >= 97) {
            Dr = pi - 97 + 10;
          } else if (pi >= 65) {
            Dr = pi - 65 + 10;
          } else if (pi >= 48 && pi <= 57) {
            Dr = pi - 48;
          } else {
            Dr = 1 / 0;
          }
          if (Dr >= Y) {
            break;
          }
          zr = pi;
          qn = qn * Y + Dr;
        }
        if (Qe && zr === 95) {
          this.raiseRecoverable(this.pos - 1, "Numeric separator is not allowed at the last of digits");
        }
        if (this.pos === nn || Se != null && this.pos - nn !== Se) {
          return null;
        }
        return qn;
      };
      function tc(Y, Se) {
        if (Se) {
          return parseInt(Y, 8);
        }
        return parseFloat(Y.replace(/_/g, ""));
      }
      function On(Y) {
        if (typeof BigInt !== "function") {
          return null;
        }
        return BigInt(Y.replace(/_/g, ""));
      }
      fs.readRadixNumber = function (Y) {
        var Se = this.pos;
        this.pos += 2;
        var qe = this.readInt(Y);
        if (qe == null) {
          this.raise(this.start + 2, "Expected number in radix " + Y);
        }
        if (this.options.ecmaVersion >= 11 && this.input.charCodeAt(this.pos) === 110) {
          qe = On(this.input.slice(Se, this.pos));
          ++this.pos;
        } else if (p(this.fullCharCodeAtPos())) {
          this.raise(this.pos, "Identifier directly after number");
        }
        return this.finishToken(S.num, qe);
      };
      fs.readNumber = function (Y) {
        var Se = this.pos;
        if (!Y && this.readInt(10, undefined, true) === null) {
          this.raise(Se, "Invalid number");
        }
        var qe = this.pos - Se >= 2 && this.input.charCodeAt(Se) === 48;
        if (qe && this.strict) {
          this.raise(Se, "Invalid number");
        }
        var Qe = this.input.charCodeAt(this.pos);
        if (!qe && !Y && this.options.ecmaVersion >= 11 && Qe === 110) {
          var Ht = On(this.input.slice(Se, this.pos));
          if (++this.pos, p(this.fullCharCodeAtPos())) {
            this.raise(this.pos, "Identifier directly after number");
          }
          return this.finishToken(S.num, Ht);
        }
        if (qe && /[89]/.test(this.input.slice(Se, this.pos))) {
          qe = false;
        }
        if (Qe === 46 && !qe) {
          ++this.pos;
          this.readInt(10);
          Qe = this.input.charCodeAt(this.pos);
        }
        if ((Qe === 69 || Qe === 101) && !qe) {
          if (Qe = this.input.charCodeAt(++this.pos), Qe === 43 || Qe === 45) {
            ++this.pos;
          }
          if (this.readInt(10) === null) {
            this.raise(Se, "Invalid number");
          }
        }
        if (p(this.fullCharCodeAtPos())) {
          this.raise(this.pos, "Identifier directly after number");
        }
        var nn = tc(this.input.slice(Se, this.pos), qe);
        return this.finishToken(S.num, nn);
      };
      fs.readCodePoint = function () {
        var Y = this.input.charCodeAt(this.pos);
        var Se;
        if (Y === 123) {
          if (this.options.ecmaVersion < 6) {
            this.unexpected();
          }
          var qe = ++this.pos;
          if (Se = this.readHexChar(this.input.indexOf("}", this.pos) - this.pos), ++this.pos, Se > 1114111) {
            this.invalidStringToken(qe, "Code point out of bounds");
          }
        } else {
          Se = this.readHexChar(4);
        }
        return Se;
      };
      fs.readString = function (Y) {
        var Se = "";
        var qe = ++this.pos;
        for (;;) {
          if (this.pos >= this.input.length) {
            this.raise(this.start, "Unterminated string constant");
          }
          var Qe = this.input.charCodeAt(this.pos);
          if (Qe === Y) {
            break;
          }
          if (Qe === 92) {
            Se += this.input.slice(qe, this.pos);
            Se += this.readEscapedChar(false);
            qe = this.pos;
          } else if (Qe === 8232 || Qe === 8233) {
            if (this.options.ecmaVersion < 10) {
              this.raise(this.start, "Unterminated string constant");
            }
            if (++this.pos, this.options.locations) {
              this.curLine++;
              this.lineStart = this.pos;
            }
          } else {
            if (x(Qe)) {
              this.raise(this.start, "Unterminated string constant");
            }
            ++this.pos;
          }
        }
        Se += this.input.slice(qe, this.pos++);
        return this.finishToken(S.string, Se);
      };
      var lr = {};
      fs.tryReadTemplateToken = function () {
        this.inTemplateElement = true;
        try {
          this.readTmplToken();
        } catch (Y) {
          if (Y === lr) {
            this.readInvalidTemplateToken();
          } else {
            throw Y;
          }
        }
        this.inTemplateElement = false;
      };
      fs.invalidStringToken = function (Y, Se) {
        if (this.inTemplateElement && this.options.ecmaVersion >= 9) {
          throw lr;
        } else {
          this.raise(Y, Se);
        }
      };
      fs.readTmplToken = function () {
        var Y = "";
        var Se = this.pos;
        for (;;) {
          if (this.pos >= this.input.length) {
            this.raise(this.start, "Unterminated template");
          }
          var qe = this.input.charCodeAt(this.pos);
          if (qe === 96 || qe === 36 && this.input.charCodeAt(this.pos + 1) === 123) {
            if (this.pos === this.start && (this.type === S.template || this.type === S.invalidTemplate)) {
              if (qe === 36) {
                this.pos += 2;
                return this.finishToken(S.dollarBraceL);
              } else {
                ++this.pos;
                return this.finishToken(S.backQuote);
              }
            }
            Y += this.input.slice(Se, this.pos);
            return this.finishToken(S.template, Y);
          }
          if (qe === 92) {
            Y += this.input.slice(Se, this.pos);
            Y += this.readEscapedChar(true);
            Se = this.pos;
          } else if (x(qe)) {
            switch (Y += this.input.slice(Se, this.pos), ++this.pos, qe) {
              case 13:
                if (this.input.charCodeAt(this.pos) === 10) {
                  ++this.pos;
                }
              case 10:
                Y += `
`;
                break;
              default:
                Y += String.fromCharCode(qe);
                break;
            }
            if (this.options.locations) {
              ++this.curLine;
              this.lineStart = this.pos;
            }
            Se = this.pos;
          } else {
            ++this.pos;
          }
        }
      };
      fs.readInvalidTemplateToken = function () {
        for (; this.pos < this.input.length; this.pos++) {
          switch (this.input[this.pos]) {
            case "\\":
              ++this.pos;
              break;
            case "$":
              if (this.input[this.pos + 1] !== "{") {
                break;
              }
            case "`":
              return this.finishToken(S.invalidTemplate, this.input.slice(this.start, this.pos));
            case "\r":
              if (this.input[this.pos + 1] === `
`) {
                ++this.pos;
              }
            case `
`:
            case "\u2028":
            case "\u2029":
              ++this.curLine;
              this.lineStart = this.pos + 1;
              break;
          }
        }
        this.raise(this.start, "Unterminated template");
      };
      fs.readEscapedChar = function (Y) {
        var Se = this.input.charCodeAt(++this.pos);
        switch (++this.pos, Se) {
          case 110:
            return `
`;
          case 114:
            return "\r";
          case 120:
            return String.fromCharCode(this.readHexChar(2));
          case 117:
            return N(this.readCodePoint());
          case 116:
            return "\t";
          case 98:
            return "\b";
          case 118:
            return "\v";
          case 102:
            return "\f";
          case 13:
            if (this.input.charCodeAt(this.pos) === 10) {
              ++this.pos;
            }
          case 10:
            if (this.options.locations) {
              this.lineStart = this.pos;
              ++this.curLine;
            }
            return "";
          case 56:
          case 57:
            if (this.strict) {
              this.invalidStringToken(this.pos - 1, "Invalid escape sequence");
            }
            if (Y) {
              var qe = this.pos - 1;
              this.invalidStringToken(qe, "Invalid escape sequence in template string");
            }
          default:
            if (Se >= 48 && Se <= 55) {
              var Qe = this.input.substr(this.pos - 1, 3).match(/^[0-7]+/)[0];
              var Ht = parseInt(Qe, 8);
              if (Ht > 255) {
                Qe = Qe.slice(0, -1);
                Ht = parseInt(Qe, 8);
              }
              if (this.pos += Qe.length - 1, Se = this.input.charCodeAt(this.pos), (Qe !== "0" || Se === 56 || Se === 57) && (this.strict || Y)) {
                this.invalidStringToken(this.pos - 1 - Qe.length, Y ? "Octal literal in template string" : "Octal literal in strict mode");
              }
              return String.fromCharCode(Ht);
            }
            if (x(Se)) {
              if (this.options.locations) {
                this.lineStart = this.pos;
                ++this.curLine;
              }
              return "";
            }
            return String.fromCharCode(Se);
        }
      };
      fs.readHexChar = function (Y) {
        var Se = this.pos;
        var qe = this.readInt(16, Y);
        if (qe === null) {
          this.invalidStringToken(Se, "Bad character escape sequence");
        }
        return qe;
      };
      fs.readWord1 = function () {
        this.containsEsc = false;
        var Y = "";
        var Se = true;
        var qe = this.pos;
        var Qe = this.options.ecmaVersion >= 6;
        while (this.pos < this.input.length) {
          var Ht = this.fullCharCodeAtPos();
          if (m(Ht, Qe)) {
            this.pos += Ht <= 65535 ? 1 : 2;
          } else if (Ht === 92) {
            this.containsEsc = true;
            Y += this.input.slice(qe, this.pos);
            var nn = this.pos;
            if (this.input.charCodeAt(++this.pos) !== 117) {
              this.invalidStringToken(this.pos, "Expecting Unicode escape sequence \\uXXXX");
            }
            ++this.pos;
            var qn = this.readCodePoint();
            if (!(Se ? p : m)(qn, Qe)) {
              this.invalidStringToken(nn, "Invalid Unicode escape");
            }
            Y += N(qn);
            qe = this.pos;
          } else {
            break;
          }
          Se = false;
        }
        return Y + this.input.slice(qe, this.pos);
      };
      fs.readWord = function () {
        var Y = this.readWord1();
        var Se = S.name;
        if (this.keywords.test(Y)) {
          Se = _[Y];
        }
        return this.finishToken(Se, Y);
      };
      var Mn = "8.15.0";
      ke.acorn = {
        Parser: ke,
        version: Mn,
        defaultOptions: K,
        Position: j,
        SourceLocation: z,
        getLineInfo: V,
        Node: Ee,
        TokenType: f,
        tokTypes: S,
        keywordTypes: _,
        TokContext: yt,
        tokContexts: gt,
        isIdentifierChar: m,
        isIdentifierStart: p,
        Token: ya,
        isNewLine: x,
        lineBreak: E,
        lineBreakG: C,
        nonASCIIwhitespace: k
      };
      function Un(Y, Se) {
        return ke.parse(Y, Se);
      }
      function Er(Y, Se, qe) {
        return ke.parseExpressionAt(Y, Se, qe);
      }
      function Or(Y, Se) {
        return ke.tokenizer(Y, Se);
      }
      e.Node = Ee;
      e.Parser = ke;
      e.Position = j;
      e.SourceLocation = z;
      e.TokContext = yt;
      e.Token = ya;
      e.TokenType = f;
      e.defaultOptions = K;
      e.getLineInfo = V;
      e.isIdentifierChar = m;
      e.isIdentifierStart = p;
      e.isNewLine = x;
      e.keywordTypes = _;
      e.lineBreak = E;
      e.lineBreakG = C;
      e.nonASCIIwhitespace = k;
      e.parse = Un;
      e.parseExpressionAt = Er;
      e.tokContexts = gt;
      e.tokTypes = S;
      e.tokenizer = Or;
      e.version = Mn;
    });
  });
  var ULo = __commonJS((Qer, gkl) => {
    (function (e, t) {
      typeof Qer === "object" && typeof gkl < "u" ? t(Qer) : typeof define === "function" && define.amd ? define(["exports"], t) : (e = typeof globalThis < "u" ? globalThis : e || self, t((e.acorn = e.acorn || {}, e.acorn.walk = {})));
    })(Qer, function (e) {
      function t(y, _, b, S, E) {
        if (!b) {
          b = g;
        }
        (function C(x, A, k) {
          var I = k || x.type;
          if (h(b, I, x, A, C), _[I]) {
            _[I](x, A);
          }
        })(y, S, E);
      }
      function n(y, _, b, S, E) {
        var C = [];
        if (!b) {
          b = g;
        }
        (function x(A, k, I) {
          var O = I || A.type;
          var M = A !== C[C.length - 1];
          if (M) {
            C.push(A);
          }
          if (h(b, O, A, k, x), _[O]) {
            _[O](A, k || C, C);
          }
          if (M) {
            C.pop();
          }
        })(y, S, E);
      }
      function r(y, _, b, S, E) {
        var C = b ? p(b, S || undefined) : S;
        (function x(A, k, I) {
          C[I || A.type](A, k, x);
        })(y, _, E);
      }
      function o(y) {
        if (typeof y === "string") {
          return function (_) {
            return _ === y;
          };
        } else if (!y) {
          return function () {
            return true;
          };
        } else {
          return y;
        }
      }
      var s = function (_, b) {
        this.node = _;
        this.state = b;
      };
      function i(y, _, b, S, E) {
        if (!b) {
          b = g;
        }
        var C;
        (function x(A, k, I) {
          var O = I || A.type;
          if (h(b, O, A, k, x), C !== A) {
            _(A, k, O);
            C = A;
          }
        })(y, S, E);
      }
      function a(y, _, b, S) {
        if (!b) {
          b = g;
        }
        var E = [];
        var C;
        (function x(A, k, I) {
          var O = I || A.type;
          var M = A !== E[E.length - 1];
          if (M) {
            E.push(A);
          }
          if (h(b, O, A, k, x), C !== A) {
            _(A, k || E, E, O);
            C = A;
          }
          if (M) {
            E.pop();
          }
        })(y, S);
      }
      function l(y, _, b, S, E, C) {
        if (!E) {
          E = g;
        }
        S = o(S);
        try {
          (function x(A, k, I) {
            var O = I || A.type;
            if ((_ == null || A.start <= _) && (b == null || A.end >= b)) {
              h(E, O, A, k, x);
            }
            if ((_ == null || A.start === _) && (b == null || A.end === b) && S(O, A)) {
              throw new s(A, k);
            }
          })(y, C);
        } catch (x) {
          if (x instanceof s) {
            return x;
          }
          throw x;
        }
      }
      function c(y, _, b, S, E) {
        if (b = o(b), !S) {
          S = g;
        }
        try {
          (function C(x, A, k) {
            var I = k || x.type;
            if (x.start > _ || x.end < _) {
              return;
            }
            if (h(S, I, x, A, C), b(I, x)) {
              throw new s(x, A);
            }
          })(y, E);
        } catch (C) {
          if (C instanceof s) {
            return C;
          }
          throw C;
        }
      }
      function u(y, _, b, S, E) {
        if (b = o(b), !S) {
          S = g;
        }
        try {
          (function C(x, A, k) {
            if (x.end < _) {
              return;
            }
            var I = k || x.type;
            if (x.start >= _ && b(I, x)) {
              throw new s(x, A);
            }
            h(S, I, x, A, C);
          })(y, E);
        } catch (C) {
          if (C instanceof s) {
            return C;
          }
          throw C;
        }
      }
      function d(y, _, b, S, E) {
        if (b = o(b), !S) {
          S = g;
        }
        var C;
        (function x(A, k, I) {
          if (A.start > _) {
            return;
          }
          var O = I || A.type;
          if (A.end <= _ && (!C || C.node.end < A.end) && b(O, A)) {
            C = new s(A, k);
          }
          h(S, O, A, k, x);
        })(y, E);
        return C;
      }
      function p(y, _) {
        var b = Object.create(_ || g);
        for (var S in y) {
          b[S] = y[S];
        }
        return b;
      }
      function m(y, _, b) {
        b(y, _);
      }
      function f(y, _, b) {}
      function h(y, _, b, S, E) {
        if (y[_] == null) {
          throw Error("No walker function defined for node type " + _);
        }
        y[_](b, S, E);
      }
      var g = {};
      g.Program = g.BlockStatement = g.StaticBlock = function (y, _, b) {
        for (var S = 0, E = y.body; S < E.length; S += 1) {
          var C = E[S];
          b(C, _, "Statement");
        }
      };
      g.Statement = m;
      g.EmptyStatement = f;
      g.ExpressionStatement = g.ParenthesizedExpression = g.ChainExpression = function (y, _, b) {
        return b(y.expression, _, "Expression");
      };
      g.IfStatement = function (y, _, b) {
        if (b(y.test, _, "Expression"), b(y.consequent, _, "Statement"), y.alternate) {
          b(y.alternate, _, "Statement");
        }
      };
      g.LabeledStatement = function (y, _, b) {
        return b(y.body, _, "Statement");
      };
      g.BreakStatement = g.ContinueStatement = f;
      g.WithStatement = function (y, _, b) {
        b(y.object, _, "Expression");
        b(y.body, _, "Statement");
      };
      g.SwitchStatement = function (y, _, b) {
        b(y.discriminant, _, "Expression");
        for (var S = 0, E = y.cases; S < E.length; S += 1) {
          var C = E[S];
          b(C, _);
        }
      };
      g.SwitchCase = function (y, _, b) {
        if (y.test) {
          b(y.test, _, "Expression");
        }
        for (var S = 0, E = y.consequent; S < E.length; S += 1) {
          var C = E[S];
          b(C, _, "Statement");
        }
      };
      g.ReturnStatement = g.YieldExpression = g.AwaitExpression = function (y, _, b) {
        if (y.argument) {
          b(y.argument, _, "Expression");
        }
      };
      g.ThrowStatement = g.SpreadElement = function (y, _, b) {
        return b(y.argument, _, "Expression");
      };
      g.TryStatement = function (y, _, b) {
        if (b(y.block, _, "Statement"), y.handler) {
          b(y.handler, _);
        }
        if (y.finalizer) {
          b(y.finalizer, _, "Statement");
        }
      };
      g.CatchClause = function (y, _, b) {
        if (y.param) {
          b(y.param, _, "Pattern");
        }
        b(y.body, _, "Statement");
      };
      g.WhileStatement = g.DoWhileStatement = function (y, _, b) {
        b(y.test, _, "Expression");
        b(y.body, _, "Statement");
      };
      g.ForStatement = function (y, _, b) {
        if (y.init) {
          b(y.init, _, "ForInit");
        }
        if (y.test) {
          b(y.test, _, "Expression");
        }
        if (y.update) {
          b(y.update, _, "Expression");
        }
        b(y.body, _, "Statement");
      };
      g.ForInStatement = g.ForOfStatement = function (y, _, b) {
        b(y.left, _, "ForInit");
        b(y.right, _, "Expression");
        b(y.body, _, "Statement");
      };
      g.ForInit = function (y, _, b) {
        if (y.type === "VariableDeclaration") {
          b(y, _);
        } else {
          b(y, _, "Expression");
        }
      };
      g.DebuggerStatement = f;
      g.FunctionDeclaration = function (y, _, b) {
        return b(y, _, "Function");
      };
      g.VariableDeclaration = function (y, _, b) {
        for (var S = 0, E = y.declarations; S < E.length; S += 1) {
          var C = E[S];
          b(C, _);
        }
      };
      g.VariableDeclarator = function (y, _, b) {
        if (b(y.id, _, "Pattern"), y.init) {
          b(y.init, _, "Expression");
        }
      };
      g.Function = function (y, _, b) {
        if (y.id) {
          b(y.id, _, "Pattern");
        }
        for (var S = 0, E = y.params; S < E.length; S += 1) {
          var C = E[S];
          b(C, _, "Pattern");
        }
        b(y.body, _, y.expression ? "Expression" : "Statement");
      };
      g.Pattern = function (y, _, b) {
        if (y.type === "Identifier") {
          b(y, _, "VariablePattern");
        } else if (y.type === "MemberExpression") {
          b(y, _, "MemberPattern");
        } else {
          b(y, _);
        }
      };
      g.VariablePattern = f;
      g.MemberPattern = m;
      g.RestElement = function (y, _, b) {
        return b(y.argument, _, "Pattern");
      };
      g.ArrayPattern = function (y, _, b) {
        for (var S = 0, E = y.elements; S < E.length; S += 1) {
          var C = E[S];
          if (C) {
            b(C, _, "Pattern");
          }
        }
      };
      g.ObjectPattern = function (y, _, b) {
        for (var S = 0, E = y.properties; S < E.length; S += 1) {
          var C = E[S];
          if (C.type === "Property") {
            if (C.computed) {
              b(C.key, _, "Expression");
            }
            b(C.value, _, "Pattern");
          } else if (C.type === "RestElement") {
            b(C.argument, _, "Pattern");
          }
        }
      };
      g.Expression = m;
      g.ThisExpression = g.Super = g.MetaProperty = f;
      g.ArrayExpression = function (y, _, b) {
        for (var S = 0, E = y.elements; S < E.length; S += 1) {
          var C = E[S];
          if (C) {
            b(C, _, "Expression");
          }
        }
      };
      g.ObjectExpression = function (y, _, b) {
        for (var S = 0, E = y.properties; S < E.length; S += 1) {
          var C = E[S];
          b(C, _);
        }
      };
      g.FunctionExpression = g.ArrowFunctionExpression = g.FunctionDeclaration;
      g.SequenceExpression = function (y, _, b) {
        for (var S = 0, E = y.expressions; S < E.length; S += 1) {
          var C = E[S];
          b(C, _, "Expression");
        }
      };
      g.TemplateLiteral = function (y, _, b) {
        for (var S = 0, E = y.quasis; S < E.length; S += 1) {
          var C = E[S];
          b(C, _);
        }
        for (var x = 0, A = y.expressions; x < A.length; x += 1) {
          var k = A[x];
          b(k, _, "Expression");
        }
      };
      g.TemplateElement = f;
      g.UnaryExpression = g.UpdateExpression = function (y, _, b) {
        b(y.argument, _, "Expression");
      };
      g.BinaryExpression = g.LogicalExpression = function (y, _, b) {
        b(y.left, _, "Expression");
        b(y.right, _, "Expression");
      };
      g.AssignmentExpression = g.AssignmentPattern = function (y, _, b) {
        b(y.left, _, "Pattern");
        b(y.right, _, "Expression");
      };
      g.ConditionalExpression = function (y, _, b) {
        b(y.test, _, "Expression");
        b(y.consequent, _, "Expression");
        b(y.alternate, _, "Expression");
      };
      g.NewExpression = g.CallExpression = function (y, _, b) {
        if (b(y.callee, _, "Expression"), y.arguments) {
          for (var S = 0, E = y.arguments; S < E.length; S += 1) {
            var C = E[S];
            b(C, _, "Expression");
          }
        }
      };
      g.MemberExpression = function (y, _, b) {
        if (b(y.object, _, "Expression"), y.computed) {
          b(y.property, _, "Expression");
        }
      };
      g.ExportNamedDeclaration = g.ExportDefaultDeclaration = function (y, _, b) {
        if (y.declaration) {
          b(y.declaration, _, y.type === "ExportNamedDeclaration" || y.declaration.id ? "Statement" : "Expression");
        }
        if (y.source) {
          b(y.source, _, "Expression");
        }
        if (y.attributes) {
          for (var S = 0, E = y.attributes; S < E.length; S += 1) {
            var C = E[S];
            b(C, _);
          }
        }
      };
      g.ExportAllDeclaration = function (y, _, b) {
        if (y.exported) {
          b(y.exported, _);
        }
        if (b(y.source, _, "Expression"), y.attributes) {
          for (var S = 0, E = y.attributes; S < E.length; S += 1) {
            var C = E[S];
            b(C, _);
          }
        }
      };
      g.ImportAttribute = function (y, _, b) {
        b(y.value, _, "Expression");
      };
      g.ImportDeclaration = function (y, _, b) {
        for (var S = 0, E = y.specifiers; S < E.length; S += 1) {
          var C = E[S];
          b(C, _);
        }
        if (b(y.source, _, "Expression"), y.attributes) {
          for (var x = 0, A = y.attributes; x < A.length; x += 1) {
            var k = A[x];
            b(k, _);
          }
        }
      };
      g.ImportExpression = function (y, _, b) {
        if (b(y.source, _, "Expression"), y.options) {
          b(y.options, _, "Expression");
        }
      };
      g.ImportSpecifier = g.ImportDefaultSpecifier = g.ImportNamespaceSpecifier = g.Identifier = g.PrivateIdentifier = g.Literal = f;
      g.TaggedTemplateExpression = function (y, _, b) {
        b(y.tag, _, "Expression");
        b(y.quasi, _, "Expression");
      };
      g.ClassDeclaration = g.ClassExpression = function (y, _, b) {
        return b(y, _, "Class");
      };
      g.Class = function (y, _, b) {
        if (y.id) {
          b(y.id, _, "Pattern");
        }
        if (y.superClass) {
          b(y.superClass, _, "Expression");
        }
        b(y.body, _);
      };
      g.ClassBody = function (y, _, b) {
        for (var S = 0, E = y.body; S < E.length; S += 1) {
          var C = E[S];
          b(C, _);
        }
      };
      g.MethodDefinition = g.PropertyDefinition = g.Property = function (y, _, b) {
        if (y.computed) {
          b(y.key, _, "Expression");
        }
        if (y.value) {
          b(y.value, _, "Expression");
        }
      };
      e.ancestor = n;
      e.base = g;
      e.findNodeAfter = u;
      e.findNodeAround = c;
      e.findNodeAt = l;
      e.findNodeBefore = d;
      e.full = i;
      e.fullAncestor = a;
      e.make = p;
      e.recursive = r;
      e.simple = t;
    });
  });