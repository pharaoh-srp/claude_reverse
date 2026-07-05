package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mk implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fk F;

    public /* synthetic */ mk(fk fkVar, int i) {
        this.E = i;
        this.F = fkVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fk fkVar = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    jwk.o(uaj.a(fkVar.b()), 0, 2, e18Var, null);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    jwk.o(uaj.a(fkVar.b()), 0, 2, e18Var2, null);
                }
                break;
        }
        return ieiVar;
    }
}
