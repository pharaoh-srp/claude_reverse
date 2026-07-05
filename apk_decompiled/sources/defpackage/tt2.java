package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tt2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hw2 F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ tt2(hw2 hw2Var, zy7 zy7Var, int i) {
        this.E = i;
        this.F = hw2Var;
        this.G = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        hw2 hw2Var = this.F;
        switch (i) {
            case 0:
                hw2Var.d.t(true);
                hw2Var.m0(false);
                zy7Var.a();
                break;
            case 1:
                if (hw2Var.c0() && !hw2Var.f0() && hw2Var.Z() == null) {
                    zy7Var.a();
                }
                break;
            default:
                if (hw2Var.Z() == null && zy7Var != null) {
                    zy7Var.a();
                }
                break;
        }
        return ieiVar;
    }
}
