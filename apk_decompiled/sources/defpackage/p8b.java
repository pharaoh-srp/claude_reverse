package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class p8b {
    public static final ide e = new ide("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final ide f = new ide(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public p8b(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int iX = iv1.x(0, strArr.length - 1, 2);
        if (iX < 0) {
            str = null;
            break;
        }
        while (!isg.j0(strArr[i], "charset")) {
            if (i == iX) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p8b) && x44.r(((p8b) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
