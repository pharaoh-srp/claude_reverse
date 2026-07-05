package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vj4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ yih F;

    public /* synthetic */ vj4(yih yihVar, int i) {
        this.E = i;
        this.F = yihVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        CharSequence charSequence;
        int i = this.E;
        iei ieiVar = iei.a;
        yih yihVar = this.F;
        int i2 = 2;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ypk.d(0, 2, e18Var, null, yihVar.d().G.toString());
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    wd6.M(yihVar.d().G.length() > 0, null, gp6.e(null, 3), gp6.f(null, 3), null, fd9.q0(-1109335382, new qu(yihVar, i2), e18Var2), e18Var2, 200064, 18);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    String string = (yihVar == null || (charSequence = yihVar.d().G) == null) ? null : charSequence.toString();
                    if (string == null || bsg.I0(string)) {
                        e18Var3.a0(997071860);
                        fhk.c(null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 1);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(996959206);
                        xb5.b(string, null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 2);
                        e18Var3.p(false);
                    }
                }
                break;
        }
        return ieiVar;
    }
}
