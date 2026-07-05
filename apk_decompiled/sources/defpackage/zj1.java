package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zj1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ zy7 K;
    public final /* synthetic */ iqb L;
    public final /* synthetic */ int M;

    public /* synthetic */ zj1(boolean z, boolean z2, boolean z3, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = z;
        this.G = z2;
        this.H = z3;
        this.I = zy7Var;
        this.J = zy7Var2;
        this.K = zy7Var3;
        this.L = iqbVar;
        this.M = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.M;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                jwk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                jpi.d(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
