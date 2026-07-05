package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class t8j {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final ssc a = new ssc();
    public final StringBuilder b = new StringBuilder();

    public static String a(ssc sscVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = sscVar.b;
        int i2 = sscVar.c;
        while (i < i2 && !z) {
            char c2 = (char) sscVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        sscVar.N(i - sscVar.b);
        return sb.toString();
    }

    public static String b(ssc sscVar, StringBuilder sb) {
        c(sscVar);
        if (sscVar.a() == 0) {
            return null;
        }
        String strA = a(sscVar, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) sscVar.z());
    }

    public static void c(ssc sscVar) {
        while (true) {
            for (boolean z = true; sscVar.a() > 0 && z; z = false) {
                int i = sscVar.b;
                byte[] bArr = sscVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    sscVar.N(1);
                } else {
                    int i2 = sscVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            sscVar.N(i2 - sscVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
