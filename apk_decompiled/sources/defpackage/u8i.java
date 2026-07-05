package defpackage;

import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class u8i implements dxg {
    public static final Pattern F = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern G = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern H = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern I = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern J = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern K = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern L = Pattern.compile("^(\\d+) (\\d+)$");
    public static final t8i M = new t8i(30.0f, 1, 1);
    public final XmlPullParserFactory E;

    public u8i() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.E = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            xh6.f("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static w8i c(w8i w8iVar) {
        return w8iVar == null ? new w8i() : w8iVar;
    }

    public static boolean d(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = L.matcher(attributeValue);
        if (!matcher.matches()) {
            ysj.u("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i2 = Integer.parseInt(strGroup2);
            if (i == 0 || i2 == 0) {
                z = false;
            }
            fd9.A("Invalid cell resolution %s %s", i, i2, z);
            return i2;
        } catch (NumberFormatException unused) {
            ysj.u("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void f(String str, w8i w8iVar) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        String str2 = tpi.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = H;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(vb7.l(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            ysj.u("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(ij0.j("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                w8iVar.j = 3;
                break;
            case "em":
                w8iVar.j = 2;
                break;
            case "px":
                w8iVar.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(ij0.j("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        w8iVar.k = Float.parseFloat(strGroup2);
    }

    public static t8i g(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = tpi.a;
            fd9.C("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        t8i t8iVar = M;
        int i2 = t8iVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = t8iVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new t8i(i * f, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.l42 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8i.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, l42, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.s8i i(org.xmlpull.v1.XmlPullParser r21, defpackage.s8i r22, java.util.HashMap r23, defpackage.t8i r24) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8i.i(org.xmlpull.v1.XmlPullParser, s8i, java.util.HashMap, t8i):s8i");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w8i j(org.xmlpull.v1.XmlPullParser r18, defpackage.w8i r19) {
        /*
            Method dump skipped, instruction units count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8i.j(org.xmlpull.v1.XmlPullParser, w8i):w8i");
    }

    public static long k(String str, t8i t8iVar) throws SubtitleDecoderException {
        double d;
        double d2;
        double d3;
        Matcher matcher = F.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d4 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d5 = d4 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d6 = d5 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d6 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / t8iVar.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) t8iVar.b)) / ((double) t8iVar.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = G.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(ij0.i("Malformed time expression: ", str));
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        d = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d2 = t8iVar.a;
                d /= d2;
                return (long) (d * 1000000.0d);
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = t8iVar.c;
                d /= d2;
                return (long) (d * 1000000.0d);
            case "ms":
                d2 = 1000.0d;
                d /= d2;
                return (long) (d * 1000000.0d);
            default:
                return (long) (d * 1000000.0d);
        }
        d *= d3;
        return (long) (d * 1000000.0d);
    }

    public static l42 l(XmlPullParser xmlPullParser) {
        String strG = pmk.g(xmlPullParser, "extent");
        if (strG == null) {
            return null;
        }
        Matcher matcher = K.matcher(strG);
        if (!matcher.matches()) {
            ysj.u("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strG));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new l42(i, Integer.parseInt(strGroup2), 5);
        } catch (NumberFormatException unused) {
            ysj.u("TtmlParser", "Ignoring malformed tts extent: ".concat(strG));
            return null;
        }
    }

    @Override // defpackage.dxg
    public final xwg a(byte[] bArr, int i, int i2) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.E.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new v8i("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            l42 l42VarL = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            t8i t8iVarG = M;
            int i3 = 0;
            int iE = 15;
            h80 h80Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                s8i s8iVar = (s8i) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            t8iVarG = g(xmlPullParserNewPullParser);
                            iE = e(xmlPullParserNewPullParser);
                            l42VarL = l(xmlPullParserNewPullParser);
                        }
                        t8i t8iVar = t8iVarG;
                        l42 l42Var = l42VarL;
                        int i4 = iE;
                        if (d(name)) {
                            if ("head".equals(name)) {
                                h(xmlPullParserNewPullParser, map, i4, l42Var, map2, map3);
                            } else {
                                try {
                                    s8i s8iVarI = i(xmlPullParserNewPullParser, s8iVar, map2, t8iVar);
                                    arrayDeque.push(s8iVarI);
                                    if (s8iVar != null) {
                                        if (s8iVar.m == null) {
                                            s8iVar.m = new ArrayList();
                                        }
                                        s8iVar.m.add(s8iVarI);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    ysj.v("TtmlParser", "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            iE = i4;
                            l42VarL = l42Var;
                            t8iVarG = t8iVar;
                        } else {
                            ysj.n("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i3++;
                        iE = i4;
                        l42VarL = l42Var;
                        t8iVarG = t8iVar;
                    } else if (eventType == 4) {
                        s8iVar.getClass();
                        s8i s8iVarA = s8i.a(xmlPullParserNewPullParser.getText());
                        if (s8iVar.m == null) {
                            s8iVar.m = new ArrayList();
                        }
                        s8iVar.m.add(s8iVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            s8i s8iVar2 = (s8i) arrayDeque.peek();
                            s8iVar2.getClass();
                            h80Var = new h80(s8iVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            h80Var.getClass();
            return h80Var;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // defpackage.dxg
    public final void b(byte[] bArr, int i, int i2, cxg cxgVar, gm4 gm4Var) {
        wvj.i(a(bArr, i, i2), cxgVar, gm4Var);
    }
}
