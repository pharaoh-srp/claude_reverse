package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lo4 implements zy7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ l45 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ op3 H;
    public final /* synthetic */ String I;

    public /* synthetic */ lo4(l45 l45Var, zy7 zy7Var, op3 op3Var, String str) {
        this.F = l45Var;
        this.G = zy7Var;
        this.H = op3Var;
        this.I = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.I;
        op3 op3Var = this.H;
        zy7 zy7Var = this.G;
        l45 l45Var = this.F;
        switch (i) {
            case 0:
                zy7Var.a();
                gb9.D(l45Var, null, null, new no4(op3Var, str, null, 0), 3);
                break;
            default:
                gb9.D(l45Var, null, null, new no4(op3Var, str, null, 2), 3);
                zy7Var.a();
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lo4(zy7 zy7Var, l45 l45Var, op3 op3Var, String str) {
        this.G = zy7Var;
        this.F = l45Var;
        this.H = op3Var;
        this.I = str;
    }
}
