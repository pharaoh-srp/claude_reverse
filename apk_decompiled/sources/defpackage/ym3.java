package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ym3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ exe F;
    public final /* synthetic */ ukg G;
    public final /* synthetic */ vm3 H;
    public final /* synthetic */ q68 I;
    public final /* synthetic */ int J;

    public /* synthetic */ ym3(exe exeVar, ukg ukgVar, vm3 vm3Var, q68 q68Var, int i, int i2) {
        this.E = i2;
        this.F = exeVar;
        this.G = ukgVar;
        this.H = vm3Var;
        this.I = q68Var;
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
                dlk.i(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                dlk.a(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
