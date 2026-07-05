package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ixf implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ pz7 G;
    public final /* synthetic */ mnc H;
    public final /* synthetic */ long I;
    public final /* synthetic */ tkh J;
    public final /* synthetic */ int K;

    public /* synthetic */ ixf(String str, pz7 pz7Var, mnc mncVar, long j, tkh tkhVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = pz7Var;
        this.H = mncVar;
        this.I = j;
        this.J = tkhVar;
        this.K = i;
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
                    pqi.d(this.F, this.G, null, this.H, this.I, this.J, this.K, e18Var, 0, 4);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    pqi.d(this.F, this.G, null, this.H, this.I, this.J, this.K, e18Var2, 0, 4);
                }
                break;
        }
        return ieiVar;
    }
}
