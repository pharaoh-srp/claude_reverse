package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class km5 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ zy7 L;
    public final /* synthetic */ int M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ km5(iqb iqbVar, String str, ta4 ta4Var, boolean z, boolean z2, boolean z3, boolean z4, zy7 zy7Var, pz7 pz7Var, int i) {
        this.F = iqbVar;
        this.G = str;
        this.N = ta4Var;
        this.H = z;
        this.I = z2;
        this.J = z3;
        this.K = z4;
        this.L = zy7Var;
        this.O = pz7Var;
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
                cn5.e(this.G, this.F, this.H, this.L, this.I, this.J, this.K, (String) obj4, (wl5) obj3, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                svh.c(this.F, this.G, (ta4) obj4, this.H, this.I, this.J, this.K, this.L, (pz7) obj3, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ km5(String str, iqb iqbVar, boolean z, zy7 zy7Var, boolean z2, boolean z3, boolean z4, String str2, wl5 wl5Var, int i) {
        this.G = str;
        this.F = iqbVar;
        this.H = z;
        this.L = zy7Var;
        this.I = z2;
        this.J = z3;
        this.K = z4;
        this.N = str2;
        this.O = wl5Var;
        this.M = i;
    }
}
