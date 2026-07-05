package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n02 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public n02(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final n02 a(long j, long j2, long j3, long j4) {
        return new n02(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n02)) {
            return false;
        }
        n02 n02Var = (n02) obj;
        return d54.c(this.a, n02Var.a) && d54.c(this.b, n02Var.b) && d54.c(this.c, n02Var.c) && d54.c(this.d, n02Var.d);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
