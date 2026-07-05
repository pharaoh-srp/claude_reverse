package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.caverock.androidsvg.SVGParseException;
import com.caverock.androidsvg.a;
import com.caverock.androidsvg.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class q2f {
    public lrb a;
    public f1f b;
    public boolean c;
    public int d;
    public boolean e;
    public o2f f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0650  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void C(defpackage.b1f r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 1944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q2f.C(b1f, java.lang.String, java.lang.String):void");
    }

    public static int b(float f) {
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = MTTypesetterKt.kLineSkipLimitMultiplier;
        float f5 = f % 360.0f;
        if (f < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return b(e(f10, f9, f6 - 2.0f) * 256.0f) | (b(e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f6) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < MTTypesetterKt.kLineSkipLimitMultiplier) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? sq6.k(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? sq6.k(4.0f, f3, f2 - f, f) : f;
    }

    public static void f(d1f d1fVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iO = gid.o(attributes, i);
            if (iO != 73) {
                switch (iO) {
                    case 52:
                        bi0 bi0Var = new bi0(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!bi0Var.q()) {
                            String strF = bi0Var.F();
                            if (strF.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strF.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            bi0Var.S();
                        }
                        d1fVar.e(hashSet);
                        break;
                    case 53:
                        d1fVar.i(strTrim);
                        break;
                    case 54:
                        bi0 bi0Var2 = new bi0(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!bi0Var2.q()) {
                            hashSet2.add(bi0Var2.F());
                            bi0Var2.S();
                        }
                        d1fVar.j(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListQ = q(strTrim);
                        d1fVar.h(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                bi0 bi0Var3 = new bi0(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!bi0Var3.q()) {
                    String strF2 = bi0Var3.F();
                    int iIndexOf = strF2.indexOf(45);
                    if (iIndexOf != -1) {
                        strF2 = strF2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strF2, "", "").getLanguage());
                    bi0Var3.S();
                }
                d1fVar.k(hashSet3);
            }
        }
    }

    public static void g(h1f h1fVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                h1fVar.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    h1fVar.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SVGParseException(ij0.i("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    h1fVar.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(i0f i0fVar, Attributes attributes) throws SVGParseException {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iO = gid.o(attributes, i2);
            if (iO == 23) {
                i0fVar.j = z(strTrim);
            } else if (iO != 24) {
                if (iO != 26) {
                    if (iO == 60) {
                        if (strTrim != null) {
                            try {
                                if (strTrim.equals("pad")) {
                                    i = 1;
                                } else if (strTrim.equals("reflect")) {
                                    i = 2;
                                } else if (strTrim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    sz6.p("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(strTrim));
                                }
                                i0fVar.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new SVGParseException(ij0.j("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                            }
                        } else {
                            mr9.h("Name is null");
                        }
                        i = 0;
                        i0fVar.k = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    i0fVar.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                i0fVar.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    poc.l("Invalid value for attribute gradientUnits");
                    return;
                }
                i0fVar.i = Boolean.TRUE;
            }
        }
    }

    public static void i(w0f w0fVar, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (n2f.a(attributes.getLocalName(i)) == n2f.F) {
                bi0 bi0Var = new bi0(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                bi0Var.S();
                while (!bi0Var.q()) {
                    float fC = bi0Var.C();
                    if (Float.isNaN(fC)) {
                        throw new SVGParseException(ij0.j("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    bi0Var.R();
                    float fC2 = bi0Var.C();
                    if (Float.isNaN(fC2)) {
                        throw new SVGParseException(ij0.j("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    bi0Var.R();
                    arrayList.add(Float.valueOf(fC));
                    arrayList.add(Float.valueOf(fC2));
                }
                w0fVar.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    w0fVar.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void j(h1f h1fVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iO = gid.o(attributes, i);
                if (iO == 0) {
                    a aVar = new a(strTrim);
                    ArrayList arrayList = null;
                    while (!aVar.q()) {
                        String strF = aVar.F();
                        if (strF != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strF);
                            aVar.S();
                        }
                    }
                    h1fVar.g = arrayList;
                } else if (iO != 72) {
                    if (h1fVar.e == null) {
                        h1fVar.e = new b1f();
                    }
                    C(h1fVar.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    bi0 bi0Var = new bi0(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strG = bi0Var.G(false, ':');
                        bi0Var.S();
                        if (!bi0Var.m(':')) {
                            break;
                        }
                        bi0Var.S();
                        String strG2 = bi0Var.G(true, ';');
                        if (strG2 == null) {
                            break;
                        }
                        bi0Var.S();
                        if (bi0Var.q() || bi0Var.m(';')) {
                            if (h1fVar.f == null) {
                                h1fVar.f = new b1f();
                            }
                            C(h1fVar.f, strG, strG2);
                            bi0Var.S();
                        }
                    }
                }
            }
        }
    }

    public static void k(w1f w1fVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iO = gid.o(attributes, i);
            if (iO == 9) {
                w1fVar.p = t(strTrim);
            } else if (iO == 10) {
                w1fVar.q = t(strTrim);
            } else if (iO == 82) {
                w1fVar.n = t(strTrim);
            } else if (iO == 83) {
                w1fVar.o = t(strTrim);
            }
        }
    }

    public static void l(l0f l0fVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (n2f.a(attributes.getLocalName(i)) == n2f.G) {
                l0fVar.l(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(n1f n1fVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iO = gid.o(attributes, i);
            if (iO == 48) {
                x(n1fVar, strTrim);
            } else if (iO != 80) {
                continue;
            } else {
                bi0 bi0Var = new bi0(strTrim);
                bi0Var.S();
                float fC = bi0Var.C();
                bi0Var.R();
                float fC2 = bi0Var.C();
                bi0Var.R();
                float fC3 = bi0Var.C();
                bi0Var.R();
                float fC4 = bi0Var.C();
                if (Float.isNaN(fC) || Float.isNaN(fC2) || Float.isNaN(fC3) || Float.isNaN(fC4)) {
                    poc.l("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fC3 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    poc.l("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fC4 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                        poc.l("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    n1fVar.o = new sp0(fC, fC2, fC3, fC4, 2);
                }
            }
        }
    }

    public static e0f n(String str) throws SVGParseException {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            k79 k79Var = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j = j2 * 16;
                            i = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = cCharAt - 'a';
                        }
                        j2 = j + ((long) i) + 10;
                    } else {
                        j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    k79Var = new k79(j2, i2);
                }
            }
            if (k79Var == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j3 = k79Var.b;
            int i3 = k79Var.a;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new e0f(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new e0f(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new e0f((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new e0f((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            bi0 bi0Var = new bi0(str.substring(zStartsWith ? 5 : 4));
            bi0Var.S();
            float fC = bi0Var.C();
            if (!Float.isNaN(fC) && bi0Var.m('%')) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fL = bi0Var.l(fC);
            if (!Float.isNaN(fL) && bi0Var.m('%')) {
                fL = (fL * 256.0f) / 100.0f;
            }
            float fL2 = bi0Var.l(fL);
            if (!Float.isNaN(fL2) && bi0Var.m('%')) {
                fL2 = (fL2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                bi0Var.S();
                if (Float.isNaN(fL2) || !bi0Var.m(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new e0f((b(fC) << 16) | (-16777216) | (b(fL) << 8) | b(fL2));
            }
            float fL3 = bi0Var.l(fL2);
            bi0Var.S();
            if (Float.isNaN(fL3) || !bi0Var.m(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new e0f((b(fL3 * 256.0f) << 24) | (b(fC) << 16) | (b(fL) << 8) | b(fL2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) j2f.a.get(lowerCase);
            if (num != null) {
                return new e0f(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        bi0 bi0Var2 = new bi0(str.substring(zStartsWith2 ? 5 : 4));
        bi0Var2.S();
        float fC2 = bi0Var2.C();
        float fL4 = bi0Var2.l(fC2);
        if (!Float.isNaN(fL4)) {
            bi0Var2.m('%');
        }
        float fL5 = bi0Var2.l(fL4);
        if (!Float.isNaN(fL5)) {
            bi0Var2.m('%');
        }
        if (!zStartsWith2) {
            bi0Var2.S();
            if (Float.isNaN(fL5) || !bi0Var2.m(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new e0f(d(fC2, fL4, fL5) | (-16777216));
        }
        float fL6 = bi0Var2.l(fL5);
        bi0Var2.S();
        if (Float.isNaN(fL6) || !bi0Var2.m(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new e0f((b(fL6 * 256.0f) << 24) | d(fC2, fL4, fL5));
    }

    public static float o(int i, String str) throws SVGParseException {
        float fH = new x9c(0).h(0, i, str);
        if (Float.isNaN(fH)) {
            throw new SVGParseException(ij0.i("Invalid float value: ", str));
        }
        return fH;
    }

    public static float p(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        poc.l("Invalid float value (empty string)");
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public static ArrayList q(String str) {
        bi0 bi0Var = new bi0(str);
        ArrayList arrayList = null;
        do {
            String strE = bi0Var.E();
            if (strE == null) {
                strE = bi0Var.G(true, ',');
            }
            if (strE == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strE);
            bi0Var.R();
        } while (!bi0Var.q());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static n0f s(String str) throws SVGParseException {
        int iF;
        if (str.length() == 0) {
            poc.l("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iF = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iF = gid.F(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iF = 1;
        }
        try {
            return new n0f(iF, o(length, str));
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList t(String str) throws SVGParseException {
        if (str.length() == 0) {
            poc.l("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        bi0 bi0Var = new bi0(str);
        bi0Var.S();
        while (!bi0Var.q()) {
            float fC = bi0Var.C();
            if (Float.isNaN(fC)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) bi0Var.d;
                int i = bi0Var.b;
                while (!bi0Var.q() && !bi0.z(str2.charAt(bi0Var.b))) {
                    bi0Var.b++;
                }
                String strSubstring = str2.substring(i, bi0Var.b);
                bi0Var.b = i;
                sb.append(strSubstring);
                throw new SVGParseException(sb.toString());
            }
            int iH = bi0Var.H();
            if (iH == 0) {
                iH = 1;
            }
            arrayList.add(new n0f(iH, fC));
            bi0Var.R();
        }
        return arrayList;
    }

    public static n0f u(bi0 bi0Var) {
        return bi0Var.n("auto") ? new n0f(MTTypesetterKt.kLineSkipLimitMultiplier) : bi0Var.D();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (fP < MTTypesetterKt.kLineSkipLimitMultiplier) {
                fP = f;
            } else {
                f = 1.0f;
                if (fP > 1.0f) {
                    fP = f;
                }
            }
            return Float.valueOf(fP);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static k1f w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        k1f k1fVarN = e0f.G;
        f0f f0fVar = f0f.E;
        k1f k1fVar = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return k1fVarN;
            }
            if (str.equals("currentColor")) {
                return f0fVar;
            }
            try {
                return n(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new s0f(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    k1fVarN = f0fVar;
                } else {
                    try {
                        k1fVarN = n(strTrim2);
                    } catch (SVGParseException unused2) {
                        k1fVarN = null;
                    }
                }
            }
            k1fVar = k1fVarN;
        }
        return new s0f(strTrim, k1fVar);
    }

    public static void x(l1f l1fVar, String str) throws SVGParseException {
        int i;
        bi0 bi0Var = new bi0(str);
        bi0Var.S();
        String strF = bi0Var.F();
        if ("defer".equals(strF)) {
            bi0Var.S();
            strF = bi0Var.F();
        }
        fdd fddVar = (fdd) i2f.a.get(strF);
        bi0Var.S();
        if (bi0Var.q()) {
            i = 0;
        } else {
            String strF2 = bi0Var.F();
            strF2.getClass();
            if (strF2.equals("meet")) {
                i = 1;
            } else {
                if (!strF2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        l1fVar.n = new gdd(fddVar, i);
    }

    public static HashMap y(bi0 bi0Var) {
        HashMap map = new HashMap();
        bi0Var.S();
        String strG = bi0Var.G(false, '=');
        while (strG != null) {
            bi0Var.m('=');
            map.put(strG, bi0Var.E());
            bi0Var.S();
            strG = bi0Var.G(false, '=');
        }
        return map;
    }

    public static Matrix z(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        bi0 bi0Var = new bi0(str);
        bi0Var.S();
        while (!bi0Var.q()) {
            String str2 = (String) bi0Var.d;
            String strSubstring = null;
            if (!bi0Var.q()) {
                int i = bi0Var.b;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = bi0Var.h();
                    }
                }
                int i2 = bi0Var.b;
                while (bi0.z(iCharAt)) {
                    iCharAt = bi0Var.h();
                }
                if (iCharAt == 40) {
                    bi0Var.b++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    bi0Var.b = i;
                }
            }
            if (strSubstring == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    bi0Var.S();
                    float fC = bi0Var.C();
                    bi0Var.R();
                    float fC2 = bi0Var.C();
                    bi0Var.R();
                    float fC3 = bi0Var.C();
                    bi0Var.R();
                    float fC4 = bi0Var.C();
                    bi0Var.R();
                    float fC5 = bi0Var.C();
                    bi0Var.R();
                    float fC6 = bi0Var.C();
                    bi0Var.S();
                    if (Float.isNaN(fC6) || !bi0Var.m(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fC, fC3, fC5, fC2, fC4, fC6, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    bi0Var.S();
                    float fC7 = bi0Var.C();
                    float fM = bi0Var.M();
                    float fM2 = bi0Var.M();
                    bi0Var.S();
                    if (Float.isNaN(fC7) || !bi0Var.m(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fM)) {
                        matrix.preRotate(fC7);
                    } else {
                        if (Float.isNaN(fM2)) {
                            throw new SVGParseException("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fC7, fM, fM2);
                    }
                    break;
                    break;
                case "scale":
                    bi0Var.S();
                    float fC8 = bi0Var.C();
                    float fM3 = bi0Var.M();
                    bi0Var.S();
                    if (Float.isNaN(fC8) || !bi0Var.m(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM3)) {
                        matrix.preScale(fC8, fM3);
                    } else {
                        matrix.preScale(fC8, fC8);
                    }
                    break;
                    break;
                case "skewX":
                    bi0Var.S();
                    float fC9 = bi0Var.C();
                    bi0Var.S();
                    if (Float.isNaN(fC9) || !bi0Var.m(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fC9)), MTTypesetterKt.kLineSkipLimitMultiplier);
                    break;
                    break;
                case "skewY":
                    bi0Var.S();
                    float fC10 = bi0Var.C();
                    bi0Var.S();
                    if (Float.isNaN(fC10) || !bi0Var.m(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(MTTypesetterKt.kLineSkipLimitMultiplier, (float) Math.tan(Math.toRadians(fC10)));
                    break;
                    break;
                case "translate":
                    bi0Var.S();
                    float fC11 = bi0Var.C();
                    float fM4 = bi0Var.M();
                    bi0Var.S();
                    if (Float.isNaN(fC11) || !bi0Var.m(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fM4)) {
                        matrix.preTranslate(fC11, fM4);
                    } else {
                        matrix.preTranslate(fC11, MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException(ij0.j("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (bi0Var.q()) {
                return matrix;
            }
            bi0Var.R();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws SVGParseException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            m2f m2fVar = new m2f(this);
            xMLReader.setContentHandler(m2fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", m2fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    public final void B(InputStream inputStream) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                p2f p2fVar = new p2f();
                p2fVar.a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        bi0 bi0Var = new bi0(xmlPullParserNewPullParser.getText());
                        String strF = bi0Var.F();
                        y(bi0Var);
                        strF.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((c1f) this.a.F) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        E(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, p2fVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (XmlPullParserException e) {
                throw new SVGParseException("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        }
    }

    public final void D() {
        lrb lrbVar = new lrb(12, false);
        lrbVar.F = null;
        lrbVar.G = new d80(2);
        lrbVar.H = new HashMap();
        this.a = lrbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:467:0x094b, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r4) + " path segment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x0451, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x05f4, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0a09, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x0c17, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x0e34, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06cb A[PHI: r1
      0x06cb: PHI (r1v51 int) = 
      (r1v50 int)
      (r1v52 int)
      (r1v52 int)
      (r1v52 int)
      (r1v52 int)
      (r1v52 int)
      (r1v52 int)
      (r1v52 int)
      (r1v52 int)
      (r1v50 int)
     binds: [B:360:0x0673, B:828:0x06cb, B:424:0x0835, B:418:0x0804, B:404:0x07bb, B:397:0x0786, B:389:0x0737, B:382:0x06f3, B:374:0x06b8, B:364:0x0682] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x095e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r25, java.lang.String r26, java.lang.String r27, org.xml.sax.Attributes r28) throws com.caverock.androidsvg.SVGParseException {
        /*
            Method dump skipped, instruction units count: 3912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q2f.E(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof u1f) {
            a(str);
        }
    }

    public final void G(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.b instanceof u1f) {
            a(new String(cArr, i, i2));
        }
    }

    public final void a(String str) {
        e1f e1fVar = (e1f) this.b;
        int size = e1fVar.i.size();
        j1f j1fVar = size == 0 ? null : (j1f) e1fVar.i.get(size - 1);
        if (j1fVar instanceof x1f) {
            x1f x1fVar = (x1f) j1fVar;
            x1fVar.c = ij0.m(new StringBuilder(), x1fVar.c, str);
        } else {
            f1f f1fVar = this.b;
            x1f x1fVar2 = new x1f();
            x1fVar2.c = str;
            f1fVar.f(x1fVar2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            o2f o2fVar = (o2f) o2f.I.get(str2);
            if (o2fVar == null) {
                o2fVar = o2f.H;
            }
            switch (o2fVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case g.MAX_FIELD_NUMBER /* 17 */:
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case BuildConfig.VERSION_CODE /* 25 */:
                case 28:
                case 29:
                case 30:
                    this.b = ((j1f) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        o2f o2fVar2 = this.f;
                        if (o2fVar2 == o2f.G || o2fVar2 == o2f.E) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        b bVar = new b(1);
                        lrb lrbVar = this.a;
                        a aVar = new a(string);
                        aVar.S();
                        ((d80) lrbVar.G).e(bVar.e(aVar));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }
}
