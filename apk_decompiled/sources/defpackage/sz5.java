package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sz5 {
    public static final sz5 c = new sz5(0, 0);
    public final long a;
    public final long b;

    public sz5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz5)) {
            return false;
        }
        sz5 sz5Var = (sz5) obj;
        return g79.b(this.a, sz5Var.a) && za6.b(this.b, sz5Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
