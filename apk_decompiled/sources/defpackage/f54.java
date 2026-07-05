package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f54 {
    public static final f54 h = new f54(1, 2, 3, null, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        ebh.w(0, 1, 2, 3, 4);
        tpi.w(5);
    }

    public f54(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? grc.p(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? grc.p(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? grc.p(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(f54 f54Var) {
        if (f54Var == null) {
            return true;
        }
        int i = f54Var.a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = f54Var.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = f54Var.c;
        if ((i3 != -1 && i3 != 3) || f54Var.d != null) {
            return false;
        }
        int i4 = f54Var.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = f54Var.e;
        return i5 == -1 || i5 == 8;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f54.class == obj.getClass()) {
            f54 f54Var = (f54) obj;
            if (this.a == f54Var.a && this.b == f54Var.b && this.c == f54Var.c && Arrays.equals(this.d, f54Var.d) && this.e == f54Var.e && this.f == f54Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((((Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return ij0.m(sb, str2, ")");
    }
}
