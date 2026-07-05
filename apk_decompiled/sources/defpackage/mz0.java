package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mz0 {
    public final jz0 a;
    public final boolean b;
    public final Integer c;

    public mz0(jz0 jz0Var, boolean z, Integer num) {
        jz0Var.getClass();
        this.a = jz0Var;
        this.b = z;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0)) {
            return false;
        }
        mz0 mz0Var = (mz0) obj;
        return x44.r(this.a, mz0Var.a) && this.b == mz0Var.b && x44.r(this.c, mz0Var.c);
    }

    public final int hashCode() {
        int iP = fsh.p(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iP + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AstNodeTraversalEntry(astNode=" + this.a + ", isVisited=" + this.b + ", formatIndex=" + this.c + ")";
    }
}
