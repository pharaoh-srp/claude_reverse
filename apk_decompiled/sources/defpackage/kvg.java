package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class kvg implements dxg {
    public static final Pattern H = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern I = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder E = new StringBuilder();
    public final ArrayList F = new ArrayList();
    public final ssc G = new ssc();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dd5 c(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvg.c(android.text.Spanned, java.lang.String):dd5");
    }

    public static long d(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.dxg
    public final void b(byte[] bArr, int i, int i2, cxg cxgVar, gm4 gm4Var) {
        String strN;
        String str;
        kvg kvgVar = this;
        long j = cxgVar.b;
        ssc sscVar = kvgVar.G;
        sscVar.K(bArr, i + i2);
        sscVar.M(i);
        Charset charsetI = sscVar.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !cxgVar.a) ? null : new ArrayList();
        while (true) {
            String strN2 = sscVar.n(charsetI);
            if (strN2 == null) {
                break;
            }
            if (!strN2.isEmpty()) {
                try {
                    Integer.parseInt(strN2);
                    strN = sscVar.n(charsetI);
                } catch (NumberFormatException unused) {
                    ysj.u("SubripParser", "Skipping invalid index: ".concat(strN2));
                }
                if (strN == null) {
                    ysj.u("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = H.matcher(strN);
                if (matcher.matches()) {
                    long jD = d(matcher, 1);
                    long jD2 = d(matcher, 6);
                    StringBuilder sb = kvgVar.E;
                    long j3 = j2;
                    sb.setLength(0);
                    ArrayList arrayList2 = kvgVar.F;
                    arrayList2.clear();
                    for (String strN3 = sscVar.n(charsetI); !TextUtils.isEmpty(strN3); strN3 = sscVar.n(charsetI)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strN3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = I.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            Matcher matcher3 = matcher2;
                            String strGroup = matcher3.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher3.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            matcher2 = matcher3;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || jD2 >= j4) {
                        gm4Var.accept(new hd5(jD, jD2 - jD, nz8.u(c(spannedFromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new hd5(jD, jD2 - jD, nz8.u(c(spannedFromHtml, str))));
                    }
                    kvgVar = this;
                    j2 = j3;
                    j = j4;
                } else {
                    ysj.u("SubripParser", "Skipping invalid timing: ".concat(strN));
                    kvgVar = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gm4Var.accept((hd5) it.next());
            }
        }
    }
}
