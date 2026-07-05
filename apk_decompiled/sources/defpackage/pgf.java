package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pgf {
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

    public pgf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pgf)) {
            return false;
        }
        pgf pgfVar = (pgf) obj;
        return d54.c(this.a, pgfVar.a) && d54.c(this.b, pgfVar.b) && d54.c(this.c, pgfVar.c) && d54.c(this.d, pgfVar.d) && d54.c(this.e, pgfVar.e) && d54.c(this.f, pgfVar.f) && d54.c(this.g, pgfVar.g) && d54.c(this.h, pgfVar.h) && d54.c(this.i, pgfVar.i) && d54.c(this.j, pgfVar.j) && d54.c(this.k, pgfVar.k) && d54.c(this.l, pgfVar.l) && d54.c(this.m, pgfVar.m);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.m) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
