package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u7b {
    public final z7b a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public u7b(z7b z7bVar, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        fd9.E(!z5 || z3);
        fd9.E(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        fd9.E(z6);
        this.a = z7bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public final u7b a(long j) {
        if (j == this.d) {
            return this;
        }
        return new u7b(this.a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final u7b b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new u7b(this.a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u7b.class == obj.getClass()) {
            u7b u7bVar = (u7b) obj;
            if (this.b == u7bVar.b && this.d == u7bVar.d && this.e == u7bVar.e && this.f == u7bVar.f && this.g == u7bVar.g && this.h == u7bVar.h && this.i == u7bVar.i && this.j == u7bVar.j && this.k == u7bVar.k && Objects.equals(this.a, u7bVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0);
    }
}
