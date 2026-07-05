package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x0e {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public x0e(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x0e)) {
            return false;
        }
        x0e x0eVar = (x0e) obj;
        return d54.c(this.a, x0eVar.a) && d54.c(this.b, x0eVar.b) && d54.c(this.c, x0eVar.c) && d54.c(this.d, x0eVar.d);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
