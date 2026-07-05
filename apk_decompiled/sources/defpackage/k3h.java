package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class k3h {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public k3h(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = bsg.u0(upperCase, "INT", false) ? 3 : (bsg.u0(upperCase, "CHAR", false) || bsg.u0(upperCase, "CLOB", false) || bsg.u0(upperCase, "TEXT", false)) ? 2 : bsg.u0(upperCase, "BLOB", false) ? 5 : (bsg.u0(upperCase, "REAL", false) || bsg.u0(upperCase, "FLOA", false) || bsg.u0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k3h) {
                boolean z = this.d > 0;
                k3h k3hVar = (k3h) obj;
                int i = k3hVar.f;
                if (z == (k3hVar.d > 0) && x44.r(this.a, k3hVar.a) && this.c == k3hVar.c) {
                    String str = k3hVar.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || akk.e(str2, str)) && ((i2 != 2 || i != 1 || str == null || akk.e(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : akk.e(str2, str))) && this.g == k3hVar.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return csg.I(csg.W(sb.toString()), "    ");
    }
}
