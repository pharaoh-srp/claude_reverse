package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p03 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public p03(int i, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public static p03 a(p03 p03Var, boolean z, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = p03Var.a;
        }
        if ((i2 & 2) != 0) {
            z2 = p03Var.b;
        }
        if ((i2 & 4) != 0) {
            z3 = p03Var.c;
        }
        if ((i2 & 8) != 0) {
            i = p03Var.d;
        }
        p03Var.getClass();
        return new p03(i, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p03)) {
            return false;
        }
        p03 p03Var = (p03) obj;
        return this.a == p03Var.a && this.b == p03Var.b && this.c == p03Var.c && this.d == p03Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fsh.p(fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ChatPaginationState(hasMore=" + this.a + ", isLoadingMore=" + this.b + ", error=" + this.c + ", currentOffset=" + this.d + ")";
    }
}
