package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l4d implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jz0 F;

    public /* synthetic */ l4d(jz0 jz0Var, int i) {
        this.E = i;
        this.F = jz0Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    jlk.f(this.F, null, null, null, null, null, null, e18Var, 0, 254);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    jlk.f(this.F, gb9.K(fqb.E, 16.0f, 10.0f), ((jm3) gm3.c(e18Var2).e.E).g, null, null, null, null, e18Var2, 48, 248);
                }
                break;
            case 2:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    jlk.f(this.F, null, null, null, null, null, null, e18Var3, 0, 254);
                }
                break;
            default:
                e18 e18Var4 = (e18) ld4Var;
                if (!e18Var4.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var4.T();
                } else {
                    jlk.f(this.F, null, null, null, null, null, null, e18Var4, 0, 254);
                }
                break;
        }
        return ieiVar;
    }
}
