package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m2i {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public m2i(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final m2i a(long j, long j2, long j3, long j4, long j5, long j6) {
        return new m2i(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m2i)) {
            return false;
        }
        m2i m2iVar = (m2i) obj;
        return d54.c(this.a, m2iVar.a) && d54.c(this.b, m2iVar.b) && d54.c(this.c, m2iVar.c) && d54.c(this.d, m2iVar.d) && d54.c(this.e, m2iVar.e) && d54.c(this.f, m2iVar.f);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.f) + vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
