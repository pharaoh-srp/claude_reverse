package defpackage;

import io.sentry.e0;

/* JADX INFO: loaded from: classes.dex */
public final class a5i {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;

    public a5i(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            sz6.p("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            e0.c(d5, "Parameter d must be in the range [0..1], was ");
            throw null;
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            sz6.p("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            sz6.p("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            sz6.p("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            sz6.p("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            sz6.p("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5i)) {
            return false;
        }
        a5i a5iVar = (a5i) obj;
        return Double.compare(this.a, a5iVar.a) == 0 && Double.compare(this.b, a5iVar.b) == 0 && Double.compare(this.c, a5iVar.c) == 0 && Double.compare(this.d, a5iVar.d) == 0 && Double.compare(this.e, a5iVar.e) == 0 && Double.compare(this.f, a5iVar.f) == 0 && Double.compare(this.g, a5iVar.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + fsh.o(this.f, fsh.o(this.e, fsh.o(this.d, fsh.o(this.c, fsh.o(this.b, Double.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.a + ", a=" + this.b + ", b=" + this.c + ", c=" + this.d + ", d=" + this.e + ", e=" + this.f + ", f=" + this.g + ')';
    }

    public /* synthetic */ a5i(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
