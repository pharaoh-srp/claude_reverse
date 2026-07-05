package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rz2 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ float G;
    public final /* synthetic */ pz7 H;

    public /* synthetic */ rz2(pz7 pz7Var, String str, float f) {
        this.H = pz7Var;
        this.F = str;
        this.G = f;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        fo0 fo0Var = ko0.a;
        fqb fqbVar = fqb.E;
        pz7 pz7Var = this.H;
        float f = this.G;
        String str = this.F;
        ia0 ia0Var = (ia0) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                ia0Var.getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    cxe cxeVarA = axe.a(fo0Var, lja.P, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    if (pz7Var == null) {
                        e18Var.a0(148130558);
                    } else {
                        e18Var.a0(2082988387);
                        pz7Var.invoke(e18Var, 0);
                    }
                    e18Var.p(false);
                    if (str.length() > 0) {
                        ij0.r(f, 148189211, e18Var, e18Var, fqbVar);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(148292999);
                        e18Var.p(false);
                    }
                    e18Var.p(true);
                }
                break;
            default:
                ia0Var.getClass();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var2.T();
                } else {
                    cxe cxeVarA2 = axe.a(fo0Var, lja.P, e18Var2, 0);
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var2);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, cxeVarA2);
                    d4c.i0(e18Var2, cd4.e, hycVarL2);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE2);
                    if (str.length() > 0) {
                        ij0.r(f, -448480380, e18Var2, e18Var2, fqbVar);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-448376592);
                        e18Var2.p(false);
                    }
                    if (pz7Var == null) {
                        e18Var2.a0(-448342617);
                    } else {
                        e18Var2.a0(-984293990);
                        pz7Var.invoke(e18Var2, 0);
                    }
                    e18Var2.p(false);
                    e18Var2.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ rz2(String str, float f, pz7 pz7Var) {
        this.F = str;
        this.G = f;
        this.H = pz7Var;
    }
}
