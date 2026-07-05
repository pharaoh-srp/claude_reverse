package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nu2 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ ta4 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ ta4 I;
    public final /* synthetic */ pz7 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ nu2(dxe dxeVar, boolean z, boolean z2, boolean z3, boolean z4, ta4 ta4Var, ta4 ta4Var2, pz7 pz7Var, zy7 zy7Var, int i) {
        this.N = dxeVar;
        this.F = z;
        this.H = z2;
        this.K = z3;
        this.L = z4;
        this.G = ta4Var;
        this.I = ta4Var2;
        this.J = pz7Var;
        this.O = zy7Var;
        this.M = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.M;
        Object obj3 = this.O;
        Object obj4 = this.N;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ev2.b((dxe) obj4, this.F, this.H, this.K, this.L, this.G, this.I, this.J, (zy7) obj3, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ev2.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ta4) obj4, (iqb) obj3, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ nu2(boolean z, ta4 ta4Var, boolean z2, ta4 ta4Var2, pz7 pz7Var, boolean z3, boolean z4, ta4 ta4Var3, iqb iqbVar, int i) {
        this.F = z;
        this.G = ta4Var;
        this.H = z2;
        this.I = ta4Var2;
        this.J = pz7Var;
        this.K = z3;
        this.L = z4;
        this.N = ta4Var3;
        this.O = iqbVar;
        this.M = i;
    }
}
