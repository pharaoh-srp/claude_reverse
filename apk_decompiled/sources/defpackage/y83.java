package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y83 implements pz7 {
    public final /* synthetic */ yhb E;
    public final /* synthetic */ uhd F;
    public final /* synthetic */ s64 G;
    public final /* synthetic */ kg3 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ g93 K;
    public final /* synthetic */ m83 L;
    public final /* synthetic */ lvh M;

    public y83(yhb yhbVar, uhd uhdVar, s64 s64Var, kg3 kg3Var, boolean z, boolean z2, g93 g93Var, m83 m83Var, lvh lvhVar) {
        this.E = yhbVar;
        this.F = uhdVar;
        this.G = s64Var;
        this.H = kg3Var;
        this.I = z;
        this.J = z2;
        this.K = g93Var;
        this.L = m83Var;
        this.M = lvhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Number) obj2).intValue();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
            hvj.d(this.G, this.E.a, this.H, this.I, this.J, this.K, this.L, this.F.a, this.M, e18Var, 512);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
