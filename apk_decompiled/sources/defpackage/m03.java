package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m03 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ uj4 F;

    public /* synthetic */ m03(uj4 uj4Var, int i) {
        this.E = i;
        this.F = uj4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        uj4 uj4Var = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ypk.f(uj4Var, null, e18Var, 8);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ypk.f(uj4Var, null, e18Var2, 8);
                }
                break;
        }
        return ieiVar;
    }
}
