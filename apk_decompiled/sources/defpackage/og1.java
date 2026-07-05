package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class og1 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ ta4 G;

    public /* synthetic */ og1(String str, ta4 ta4Var) {
        this.F = str;
        this.G = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ta4 ta4Var = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zF = e18Var.f(str);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new o8(str, 16);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarB = tjf.b(fqb.E, false, (bz7) objN);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarB);
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
            default:
                num.getClass();
                wi4.g(str, ta4Var, ld4Var, x44.p0(49));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ og1(String str, ta4 ta4Var, int i) {
        this.F = str;
        this.G = ta4Var;
    }
}
