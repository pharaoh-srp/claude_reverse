package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yc6 {
    public final long a;
    public final long b;
    public final long c;

    public yc6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yc6)) {
            return false;
        }
        yc6 yc6Var = (yc6) obj;
        return za6.b(this.a, yc6Var.a) && za6.b(this.b, yc6Var.b) && za6.b(this.c, yc6Var.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
