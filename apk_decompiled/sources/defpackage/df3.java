package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class df3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bf3 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ ojg H;
    public final /* synthetic */ ta4 I;
    public final /* synthetic */ int J;

    public /* synthetic */ df3(bf3 bf3Var, iqb iqbVar, ojg ojgVar, ta4 ta4Var, int i, int i2) {
        this.E = i2;
        this.F = bf3Var;
        this.G = iqbVar;
        this.H = ojgVar;
        this.I = ta4Var;
        this.J = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                yb5.b(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                mwa.k(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
