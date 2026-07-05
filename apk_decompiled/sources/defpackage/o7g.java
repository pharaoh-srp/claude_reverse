package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o7g implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ s64 F;
    public final /* synthetic */ mtc G;
    public final /* synthetic */ kg3 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ g93 K;
    public final /* synthetic */ m83 L;
    public final /* synthetic */ String M;
    public final /* synthetic */ lvh N;

    public /* synthetic */ o7g(s64 s64Var, mtc mtcVar, kg3 kg3Var, boolean z, boolean z2, g93 g93Var, m83 m83Var, String str, lvh lvhVar) {
        this.E = 0;
        this.F = s64Var;
        this.G = mtcVar;
        this.H = kg3Var;
        this.I = z;
        this.J = z2;
        this.K = g93Var;
        this.L = m83Var;
        this.M = str;
        this.N = lvhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    hvj.e(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, e18Var, 512);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                hvj.e(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (ld4) obj, x44.p0(513));
                break;
            default:
                ((Integer) obj2).getClass();
                hvj.d(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, (ld4) obj, x44.p0(513));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ o7g(s64 s64Var, mtc mtcVar, kg3 kg3Var, boolean z, boolean z2, g93 g93Var, m83 m83Var, String str, lvh lvhVar, int i, int i2) {
        this.E = i2;
        this.F = s64Var;
        this.G = mtcVar;
        this.H = kg3Var;
        this.I = z;
        this.J = z2;
        this.K = g93Var;
        this.L = m83Var;
        this.M = str;
        this.N = lvhVar;
    }
}
