package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hgf {
    public final boolean a;
    public final boolean b;
    public final zy7 c;

    public hgf(boolean z, boolean z2, zy7 zy7Var) {
        zy7Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = zy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgf)) {
            return false;
        }
        hgf hgfVar = (hgf) obj;
        return this.a == hgfVar.a && this.b == hgfVar.b && x44.r(this.c, hgfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "SelectOptionPaginationState(hasMore=" + this.a + ", isPaginating=" + this.b + ", onLoadMore=" + this.c + ")";
    }
}
