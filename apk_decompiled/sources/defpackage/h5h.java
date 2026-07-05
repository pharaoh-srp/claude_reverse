package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h5h implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ta4 F;
    public final /* synthetic */ ta4 G;

    public /* synthetic */ h5h(ta4 ta4Var, ta4 ta4Var2, int i) {
        this.E = i;
        this.F = ta4Var;
        this.G = ta4Var2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.G;
        ta4 ta4Var2 = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    ta4Var2.invoke(e18Var, 0);
                    ta4Var.invoke(e18Var, 0);
                }
                break;
            default:
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    ta4Var2.invoke(e18Var2, 0);
                    ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
                    iqb iqbVarA = dxeVar.a(fqb.E, 1.0f, true);
                    q64 q64VarA = p64.a(ho0Var, lja.S, e18Var2, 6);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarA);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    ta4Var.invoke(s64.a, e18Var2, 6);
                    e18Var2.p(true);
                    e18Var2.a0(-885145945);
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
