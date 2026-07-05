package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a4e implements ylg, wa2, r08 {
    public final /* synthetic */ ylg E;
    private final lf9 job;

    public a4e(amg amgVar, fkg fkgVar) {
        this.E = amgVar;
        this.job = fkgVar;
    }

    @Override // defpackage.kp7
    public final Object a(lp7 lp7Var, tp4 tp4Var) {
        return this.E.a(lp7Var, tp4Var);
    }

    @Override // defpackage.r08
    public final kp7 b(c45 c45Var, int i, py1 py1Var) {
        return (((i < 0 || i >= 2) && i != -2) || py1Var != py1.F) ? o2g.d(this, c45Var, i, py1Var) : this;
    }

    @Override // defpackage.ylg
    public final Object getValue() {
        return this.E.getValue();
    }
}
