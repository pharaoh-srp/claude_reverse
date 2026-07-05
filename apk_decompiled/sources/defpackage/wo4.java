package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo4 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ ta4 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qz7 M;
    public final /* synthetic */ Object N;

    public /* synthetic */ wo4(hp4 hp4Var, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, boolean z, zy7 zy7Var2, ta4 ta4Var, int i, int i2) {
        this.L = hp4Var;
        this.G = zy7Var;
        this.N = bz7Var;
        this.H = iqbVar;
        this.F = z;
        this.M = zy7Var2;
        this.I = ta4Var;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        Object obj3 = this.N;
        qz7 qz7Var = this.M;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                d4c.r((hp4) obj4, this.G, (bz7) obj3, this.H, this.F, (zy7) qz7Var, this.I, (ld4) obj, iP0, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                iuj.c(this.F, this.G, this.H, (mxd) obj4, (rz7) qz7Var, (pl3) obj3, this.I, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wo4(boolean z, zy7 zy7Var, iqb iqbVar, mxd mxdVar, rz7 rz7Var, pl3 pl3Var, ta4 ta4Var, int i, int i2) {
        this.F = z;
        this.G = zy7Var;
        this.H = iqbVar;
        this.L = mxdVar;
        this.M = rz7Var;
        this.N = pl3Var;
        this.I = ta4Var;
        this.J = i;
        this.K = i2;
    }
}
