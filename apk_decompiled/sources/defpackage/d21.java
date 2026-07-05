package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d21 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public d21(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d21)) {
            return false;
        }
        d21 d21Var = (d21) obj;
        return d54.c(this.a, d21Var.a) && d54.c(this.b, d21Var.b) && d54.c(this.c, d21Var.c) && d54.c(this.d, d21Var.d) && d54.c(this.e, d21Var.e) && d54.c(this.f, d21Var.f) && d54.c(this.g, d21Var.g) && d54.c(this.h, d21Var.h);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.h) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
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
        StringBuilder sbR = kgh.r("AttachmentButtonColors(borderColor=", strI, ", containerColor=", strI2, ", iconColor=");
        kgh.u(sbR, strI3, ", textColor=", strI4, ", disabledBorderColor=");
        kgh.u(sbR, strI5, ", disabledContainerColor=", strI6, ", disabledIconColor=");
        return vb7.t(sbR, strI7, ", disabledTextColor=", strI8, ")");
    }
}
