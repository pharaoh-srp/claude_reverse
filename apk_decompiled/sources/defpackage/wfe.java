package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wfe implements zs1 {
    public final gg8 a;
    public vfe b;

    public wfe(gg8 gg8Var) {
        this.a = gg8Var;
    }

    @Override // defpackage.zs1
    public final void d(cv9 cv9Var) {
        a21 a21Var = new a21(17, this);
        gg8 gg8Var = this.a;
        float fA = ig8.a(gg8Var);
        boolean z = gg8Var.n0 != null;
        ga8 ga8Var = (ga8) yb5.o(gg8Var, ve4.g);
        ja8 ja8VarK = u00.k(cv9Var, gg8Var, fA, gg8Var.c0, gg8Var.d0);
        if (ja8VarK != null) {
            ja8VarK.h(z);
            u00.o(cv9Var, gg8Var.d0 ^ (-9223372034707292160L), k8g.g(fA, cv9Var.E.g()), z, new o5(a21Var, 2, ja8VarK));
            ga8Var.a(ja8VarK);
        }
    }
}
