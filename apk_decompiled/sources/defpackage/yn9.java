package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yn9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ zn9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn9(zn9 zn9Var, int i) {
        super(0);
        this.F = i;
        this.G = zn9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        zn9 zn9Var = this.G;
        switch (i) {
            case 0:
                return rta.g(zn9Var, true);
            default:
                krd krdVarB = zn9Var.x().t().b();
                return krdVarB == null ? xzk.p(zn9Var.x().t(), dd8.F) : krdVarB;
        }
    }
}
