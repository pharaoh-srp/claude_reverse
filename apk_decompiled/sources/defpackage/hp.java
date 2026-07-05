package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hp implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ n6e F;

    public /* synthetic */ hp(n6e n6eVar, int i) {
        this.E = i;
        this.F = n6eVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        n6e n6eVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    gok.b(d4c.j0(n6eVar.E, e18Var), null, e18Var, 0);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    owj.b(d4c.j0(n6eVar.E, e18Var2), null, 0L, ((jm3) gm3.c(e18Var2).e.E).g, new qnc(28.0f, 16.0f, 28.0f, 16.0f), e18Var2, 24576, 6);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    owj.b(d4c.j0(n6eVar.E, e18Var3), null, 0L, null, null, e18Var3, 0, 30);
                }
                break;
        }
        return ieiVar;
    }
}
