package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class op1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ ta4 H;
    public final /* synthetic */ int I;

    public /* synthetic */ op1(zy7 zy7Var, iqb iqbVar, ta4 ta4Var, int i, int i2) {
        this.E = i2;
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = ta4Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        ta4 ta4Var = this.H;
        iqb iqbVar = this.G;
        zy7 zy7Var = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xzk.e(zy7Var, iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            case 1:
                otj.c(zy7Var, iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                x41.b(zy7Var, iqbVar, ta4Var, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
