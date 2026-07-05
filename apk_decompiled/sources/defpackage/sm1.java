package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sm1 implements zy7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ l45 F;
    public final /* synthetic */ op3 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;

    public /* synthetic */ sm1(l45 l45Var, op3 op3Var, String str, String str2) {
        this.F = l45Var;
        this.G = op3Var;
        this.H = str;
        this.I = str2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.I;
        String str2 = this.H;
        op3 op3Var = this.G;
        l45 l45Var = this.F;
        switch (i) {
            case 0:
                gb9.D(l45Var, null, null, new tm1(str2, str, op3Var, (tp4) null), 3);
                break;
            default:
                gb9.D(l45Var, null, null, new tm1(op3Var, str2, str, (tp4) null), 3);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ sm1(l45 l45Var, String str, String str2, op3 op3Var) {
        this.F = l45Var;
        this.H = str;
        this.I = str2;
        this.G = op3Var;
    }
}
