package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v9g {
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

    public v9g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v9g)) {
            return false;
        }
        v9g v9gVar = (v9g) obj;
        return d54.c(this.a, v9gVar.a) && d54.c(this.b, v9gVar.b) && d54.c(this.c, v9gVar.c) && d54.c(this.d, v9gVar.d) && d54.c(this.e, v9gVar.e) && d54.c(this.f, v9gVar.f) && d54.c(this.g, v9gVar.g) && d54.c(this.h, v9gVar.h) && d54.c(this.i, v9gVar.i) && d54.c(this.j, v9gVar.j);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.j) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
