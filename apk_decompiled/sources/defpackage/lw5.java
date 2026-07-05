package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lw5 implements ekf, oe4 {
    public final /* synthetic */ ekf E;
    public final /* synthetic */ mw5 F;
    public final /* synthetic */ mw5 G;

    public lw5(ekf ekfVar, mw5 mw5Var) {
        this.G = mw5Var;
        this.E = ekfVar;
        this.F = mw5Var;
    }

    @Override // defpackage.ekf
    public final void a(dkf dkfVar, Object obj) {
        this.E.a(dkfVar, obj);
    }

    @Override // defpackage.nw5
    public final hqb x0() {
        return this.F.E;
    }
}
