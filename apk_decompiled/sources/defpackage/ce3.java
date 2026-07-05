package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ce3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public ce3(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public static yig a(wrh wrhVar, ld4 ld4Var) {
        if (wrhVar == wrh.F) {
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(1539238463);
            yig yigVarP = u00.P(asb.H, e18Var);
            e18Var.p(false);
            return yigVarP;
        }
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.a0(1539331773);
        yig yigVarP2 = u00.P(asb.G, e18Var2);
        e18Var2.p(false);
        return yigVarP2;
    }

    public final ce3 b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28 = j != 16 ? j : this.a;
        long j29 = j2 != 16 ? j2 : this.b;
        long j30 = j3 != 16 ? j3 : this.c;
        long j31 = j4 != 16 ? j4 : this.d;
        long j32 = j5 != 16 ? j5 : this.e;
        long j33 = j6 != 16 ? j6 : this.f;
        if (j7 != 16) {
            j14 = 16;
            j15 = j7;
        } else {
            j14 = 16;
            j15 = this.g;
        }
        if (j8 != j14) {
            j16 = j15;
            j17 = j8;
        } else {
            j16 = j15;
            j17 = this.h;
        }
        if (j9 != j14) {
            j18 = j17;
            j19 = j9;
        } else {
            j18 = j17;
            j19 = this.i;
        }
        if (j10 != j14) {
            j20 = j19;
            j21 = j10;
        } else {
            j20 = j19;
            j21 = this.j;
        }
        if (j11 != j14) {
            j22 = j21;
            j23 = j11;
        } else {
            j22 = j21;
            j23 = this.k;
        }
        if (j12 != j14) {
            j24 = j23;
            j25 = j12;
        } else {
            j24 = j23;
            j25 = this.l;
        }
        if (j13 != j14) {
            j26 = j25;
            j27 = j13;
        } else {
            j26 = j25;
            j27 = this.m;
        }
        return new ce3(j28, j29, j30, j31, j32, j33, j16, j18, j20, j22, j24, j26, j27);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ce3)) {
            return false;
        }
        ce3 ce3Var = (ce3) obj;
        return d54.c(this.a, ce3Var.a) && d54.c(this.b, ce3Var.b) && d54.c(this.m, ce3Var.m) && d54.c(this.c, ce3Var.c) && d54.c(this.d, ce3Var.d) && d54.c(this.e, ce3Var.e) && d54.c(this.f, ce3Var.f) && d54.c(this.g, ce3Var.g) && d54.c(this.h, ce3Var.h) && d54.c(this.i, ce3Var.i) && d54.c(this.j, ce3Var.j) && d54.c(this.k, ce3Var.k) && d54.c(this.l, ce3Var.l);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.l) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.m), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
