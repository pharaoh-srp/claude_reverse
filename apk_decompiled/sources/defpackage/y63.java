package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y63 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ybg F;

    public /* synthetic */ y63(ybg ybgVar, int i) {
        this.E = i;
        this.F = ybgVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ybg ybgVar = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iv1.c(ybgVar, null, e18Var, 6, 2);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    iv1.c(ybgVar, null, e18Var2, 6, 2);
                }
                break;
            default:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    iv1.c(ybgVar, mpk.k0(fqb.E, mpk.n), e18Var3, 6, 0);
                }
                break;
        }
        return ieiVar;
    }
}
