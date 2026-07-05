package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u48 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    public /* synthetic */ u48(boolean z, zy7 zy7Var, iqb iqbVar, boolean z2, int i, int i2) {
        this.F = z;
        this.H = zy7Var;
        this.I = iqbVar;
        this.G = z2;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                eve.e(x44.p0(i2 | 1), this.K, (ld4) obj, this.H, this.I, this.F, this.G);
                break;
            default:
                ((Integer) obj2).getClass();
                u00.b(x44.p0(i2 | 1), this.K, (ld4) obj, this.H, this.I, this.F, this.G);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ u48(boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.I = iqbVar;
        this.J = i;
        this.K = i2;
    }
}
