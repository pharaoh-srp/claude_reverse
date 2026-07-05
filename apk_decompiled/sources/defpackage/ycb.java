package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ycb {
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

    public ycb(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = d54.h;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j7;
        this.i = j7;
        this.j = j7;
        this.k = j7;
        this.l = j7;
    }

    public final long a(boolean z) {
        return z ? this.g : this.h;
    }

    public final ycb b(long j, long j2, long j3, long j4, long j5, long j6) {
        return new ycb(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f);
    }

    public final long c(boolean z) {
        return z ? this.b : this.e;
    }

    public final long d(boolean z) {
        return z ? this.a : this.d;
    }

    public final long e(boolean z) {
        return z ? this.c : this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ycb)) {
            return false;
        }
        ycb ycbVar = (ycb) obj;
        return d54.c(this.a, ycbVar.a) && d54.c(this.g, ycbVar.g) && d54.c(this.b, ycbVar.b) && d54.c(this.c, ycbVar.c) && d54.c(this.d, ycbVar.d) && d54.c(this.e, ycbVar.e) && d54.c(this.f, ycbVar.f) && d54.c(this.h, ycbVar.h) && d54.c(this.i, ycbVar.i) && d54.c(this.j, ycbVar.j) && d54.c(this.k, ycbVar.k) && d54.c(this.l, ycbVar.l);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.l) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.g), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
