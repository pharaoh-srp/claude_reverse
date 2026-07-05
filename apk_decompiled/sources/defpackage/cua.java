package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cua implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ ote G;
    public final /* synthetic */ ta4 H;

    public /* synthetic */ cua(iqb iqbVar, ote oteVar, ta4 ta4Var, int i) {
        this.E = 2;
        this.F = iqbVar;
        this.G = oteVar;
        this.H = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        ta4 ta4Var = this.H;
        ote oteVar = this.G;
        iqb iqbVar = this.F;
        iei ieiVar = iei.a;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    zse.a(iqbVar, oteVar, ta4Var, e18Var, 0);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    xvk.a(this.F, this.G, this.H, e18Var2, 0, 0);
                }
                break;
            default:
                num.getClass();
                zse.a(iqbVar, oteVar, ta4Var, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ cua(iqb iqbVar, ote oteVar, ta4 ta4Var, int i, byte b) {
        this.E = i;
        this.F = iqbVar;
        this.G = oteVar;
        this.H = ta4Var;
    }
}
