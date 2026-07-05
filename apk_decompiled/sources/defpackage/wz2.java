package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wz2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public wz2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz2)) {
            return false;
        }
        wz2 wz2Var = (wz2) obj;
        return d54.c(this.a, wz2Var.a) && d54.c(this.b, wz2Var.b) && d54.c(this.c, wz2Var.c) && d54.c(this.d, wz2Var.d) && d54.c(this.e, wz2Var.e) && d54.c(this.f, wz2Var.f) && d54.c(this.g, wz2Var.g) && d54.c(this.h, wz2Var.h) && d54.c(this.i, wz2Var.i);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.i) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strI = d54.i(this.a);
        String strI2 = d54.i(this.b);
        String strI3 = d54.i(this.c);
        String strI4 = d54.i(this.d);
        String strI5 = d54.i(this.e);
        String strI6 = d54.i(this.f);
        String strI7 = d54.i(this.g);
        String strI8 = d54.i(this.h);
        String strI9 = d54.i(this.i);
        StringBuilder sbR = kgh.r("ChatOptionButtonColors(contentColor=", strI, ", backgroundColor=", strI2, ", borderColor=");
        kgh.u(sbR, strI3, ", inactiveContentColor=", strI4, ", inactiveBackgroundColor=");
        kgh.u(sbR, strI5, ", inactiveBorderColor=", strI6, ", disabledContentColor=");
        kgh.u(sbR, strI7, ", disabledBackgroundColor=", strI8, ", disabledBorderColor=");
        return ij0.m(sbR, strI9, ")");
    }
}
