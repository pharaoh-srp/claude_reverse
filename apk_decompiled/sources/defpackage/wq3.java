package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wq3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ta4 F;
    public final /* synthetic */ cte G;

    public /* synthetic */ wq3(ta4 ta4Var, cte cteVar, int i) {
        this.E = i;
        this.F = ta4Var;
        this.G = cteVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        cte cteVar = this.G;
        ta4 ta4Var = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ta4Var.invoke(cteVar, e18Var, 0);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ta4Var.invoke(cteVar, e18Var2, 0);
                }
                break;
        }
        return ieiVar;
    }
}
