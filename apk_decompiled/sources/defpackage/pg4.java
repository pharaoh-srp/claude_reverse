package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pg4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ eyh F;

    public /* synthetic */ pg4(eyh eyhVar, int i) {
        this.E = i;
        this.F = eyhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        eyh eyhVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(ah4.e(eyhVar, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, e18Var, 0, 24576, 245758);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(ah4.e(eyhVar, e18Var2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 0, 0, 262142);
                }
                break;
        }
        return ieiVar;
    }
}
