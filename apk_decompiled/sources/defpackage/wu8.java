package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wu8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public wu8(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final wu8 a(long j, long j2, long j3, long j4) {
        return new wu8(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wu8)) {
            return false;
        }
        wu8 wu8Var = (wu8) obj;
        return d54.c(this.a, wu8Var.a) && d54.c(this.b, wu8Var.b) && d54.c(this.c, wu8Var.c) && d54.c(this.d, wu8Var.d);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.d) + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
