package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yq5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public yq5(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5)) {
            return false;
        }
        yq5 yq5Var = (yq5) obj;
        if (d54.c(this.a, yq5Var.a) && d54.c(this.b, yq5Var.b) && d54.c(this.c, yq5Var.c) && d54.c(this.d, yq5Var.d) && d54.c(this.e, yq5Var.e) && d54.c(this.f, yq5Var.f) && d54.c(this.g, yq5Var.g)) {
            return d54.c(this.h, yq5Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.h) + vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
