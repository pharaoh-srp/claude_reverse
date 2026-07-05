package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf9 extends nf9 {
    public final vf9 L;
    public final rf9 M;
    public final ne3 N;
    public final Object O;

    public qf9(vf9 vf9Var, rf9 rf9Var, ne3 ne3Var, Object obj) {
        this.L = vf9Var;
        this.M = rf9Var;
        this.N = ne3Var;
        this.O = obj;
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return false;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        ne3 ne3Var = this.N;
        ne3 ne3VarF0 = vf9.f0(ne3Var);
        vf9 vf9Var = this.L;
        rf9 rf9Var = this.M;
        Object obj = this.O;
        if (ne3VarF0 == null || !vf9Var.t0(rf9Var, ne3VarF0, obj)) {
            rf9Var.E.e(new f8a(2), 2);
            ne3 ne3VarF02 = vf9.f0(ne3Var);
            if (ne3VarF02 == null || !vf9Var.t0(rf9Var, ne3VarF02, obj)) {
                vf9Var.t(vf9Var.G(rf9Var, obj));
            }
        }
    }
}
