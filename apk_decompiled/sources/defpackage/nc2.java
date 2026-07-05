package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nc2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public nc2(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nc2)) {
            return false;
        }
        nc2 nc2Var = (nc2) obj;
        return d54.c(this.a, nc2Var.a) && d54.c(this.b, nc2Var.b) && d54.c(this.c, nc2Var.c) && d54.c(this.d, nc2Var.d);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
