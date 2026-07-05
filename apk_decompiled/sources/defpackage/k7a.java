package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k7a extends j8 {
    public final pl9 j;
    public final Object k;
    public final j8 l;

    public k7a(pl9 pl9Var, Object obj, j8 j8Var) {
        obj.getClass();
        j8Var.getClass();
        this.j = pl9Var;
        this.k = obj;
        this.l = j8Var;
    }

    @Override // defpackage.j8
    public final Object N(pl9 pl9Var) {
        return pl9Var.equals(this.j) ? ez1.I(pl9Var).cast(this.k) : this.l.N(pl9Var);
    }

    @Override // defpackage.j8
    public final j8 a0(pl9 pl9Var, Object obj) {
        pl9 pl9Var2 = this.j;
        boolean zEquals = pl9Var.equals(pl9Var2);
        j8 j8Var = this.l;
        if (!zEquals) {
            j8 j8VarA0 = j8Var.a0(pl9Var, null);
            if (j8VarA0 != j8Var) {
                this = new k7a(pl9Var2, this.k, j8VarA0);
            }
            j8Var = this;
        }
        return obj != null ? new k7a(pl9Var, obj, j8Var) : j8Var;
    }

    public final String toString() {
        return w44.S0(w44.c1(bnf.e0(bnf.Z(new e69(13), this))), null, "{", "}", new e69(14), 25);
    }
}
