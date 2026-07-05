package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pf2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mnc F;
    public final /* synthetic */ ta4 G;

    public /* synthetic */ pf2(mnc mncVar, ta4 ta4Var, int i) {
        this.E = i;
        this.F = mncVar;
        this.G = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        ta4 ta4Var = this.G;
        mnc mncVar = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarI = gb9.I(fqbVar, mncVar);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, o5bVarD);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    vb7.y(0, ta4Var, e18Var, true);
                }
                break;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    iqb iqbVarI2 = gb9.I(fqbVar, mncVar);
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVarI2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD2);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    vb7.y(0, ta4Var, e18Var2, true);
                }
                break;
            default:
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var3.T();
                } else {
                    iqb iqbVarI3 = gb9.I(fqbVar, mncVar);
                    o5b o5bVarD3 = dw1.d(lja.K, false);
                    int iHashCode3 = Long.hashCode(e18Var3.T);
                    hyc hycVarL3 = e18Var3.l();
                    iqb iqbVarE3 = kxk.E(e18Var3, iqbVarI3);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var3);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, o5bVarD3);
                    d4c.i0(e18Var3, cd4.e, hycVarL3);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE3);
                    vb7.y(0, ta4Var, e18Var3, true);
                }
                break;
        }
        return ieiVar;
    }
}
