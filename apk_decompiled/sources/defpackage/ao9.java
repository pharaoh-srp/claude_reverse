package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ao9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ bo9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao9(bo9 bo9Var, int i) {
        super(0);
        this.F = i;
        this.G = bo9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        bo9 bo9Var = this.G;
        switch (i) {
            case 0:
                return rta.g(bo9Var, false);
            default:
                prd prdVarC = bo9Var.x().t().c();
                return prdVarC == null ? xzk.q(bo9Var.x().t(), dd8.F) : prdVarC;
        }
    }
}
