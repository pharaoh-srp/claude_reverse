package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kyb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public kyb(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kyb)) {
            return false;
        }
        kyb kybVar = (kyb) obj;
        return d54.c(this.a, kybVar.a) && d54.c(this.d, kybVar.d) && d54.c(this.b, kybVar.b) && d54.c(this.e, kybVar.e) && d54.c(this.c, kybVar.c) && d54.c(this.f, kybVar.f) && d54.c(this.g, kybVar.g);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.g) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.d), 31, this.b), 31, this.e), 31, this.c), 31, this.f);
    }
}
