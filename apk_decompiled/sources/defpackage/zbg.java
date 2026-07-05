package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zbg implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ ta4 F;
    public final /* synthetic */ pz7 G;
    public final /* synthetic */ pz7 H;
    public final /* synthetic */ tkh I;
    public final /* synthetic */ long J;
    public final /* synthetic */ long K;

    public /* synthetic */ zbg(ta4 ta4Var, pz7 pz7Var, pz7 pz7Var2, tkh tkhVar, long j, long j2, int i) {
        this.F = ta4Var;
        this.G = pz7Var;
        this.H = pz7Var2;
        this.I = tkhVar;
        this.J = j;
        this.K = j2;
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
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    e18Var.a0(-168956728);
                    e18Var.a0(-942207887);
                    xvj.a(this.F, this.G, this.H, this.I, this.J, this.K, e18Var, 0);
                    e18Var.p(false);
                    e18Var.p(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                xvj.a(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ zbg(pz7 pz7Var, ta4 ta4Var, pz7 pz7Var2, tkh tkhVar, long j, long j2) {
        this.G = pz7Var;
        this.F = ta4Var;
        this.H = pz7Var2;
        this.I = tkhVar;
        this.J = j;
        this.K = j2;
    }
}
