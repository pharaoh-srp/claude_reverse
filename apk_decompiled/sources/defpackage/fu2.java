package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fu2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ ta4 G;

    public /* synthetic */ fu2(iqb iqbVar, ta4 ta4Var, int i) {
        this.E = 2;
        this.F = iqbVar;
        this.G = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.G;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVar);
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
                    vb7.y(6, ta4Var, e18Var, true);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVar);
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
                    vb7.y(6, ta4Var, e18Var2, true);
                }
                break;
            case 2:
                num.getClass();
                dtk.b(iqbVar, ta4Var, ld4Var, x44.p0(49));
                break;
            default:
                int iIntValue3 = num.intValue();
                e18 e18Var3 = (e18) ld4Var;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    xvk.c(iqbVar, fd9.q0(13037873, new rx0(ta4Var, 25), e18Var3), e18Var3, 48, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ fu2(iqb iqbVar, ta4 ta4Var, int i, byte b) {
        this.E = i;
        this.F = iqbVar;
        this.G = ta4Var;
    }
}
