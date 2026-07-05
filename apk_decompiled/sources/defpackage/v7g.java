package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v7g extends kxk {
    public final tk5 l;
    public final lsc m = mpk.P(null);

    public v7g(tk5 tk5Var) {
        this.l = tk5Var;
    }

    public final void Q(tk5 tk5Var, Object obj) {
        if (tk5Var != this.l) {
            b39.c("Check failed.");
        }
        this.m.setValue(obj);
    }

    @Override // defpackage.kxk
    public final boolean q(tk5 tk5Var) {
        return tk5Var == this.l;
    }

    @Override // defpackage.kxk
    public final Object x(tk5 tk5Var) {
        if (tk5Var != this.l) {
            b39.c("Check failed.");
        }
        Object value = this.m.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
