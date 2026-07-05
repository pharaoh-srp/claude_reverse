package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uc6 {
    public final long a;
    public final long b;
    public final long c;

    public uc6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uc6)) {
            return false;
        }
        uc6 uc6Var = (uc6) obj;
        return d54.c(this.a, uc6Var.a) && d54.c(this.b, uc6Var.b) && d54.c(this.c, uc6Var.c);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
