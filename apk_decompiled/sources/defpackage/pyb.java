package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pyb implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ pyb(kyb kybVar, boolean z, boolean z2, yig yigVar, pz7 pz7Var, boolean z3, ta4 ta4Var) {
        this.I = kybVar;
        this.F = z;
        this.G = z2;
        this.J = yigVar;
        this.K = pz7Var;
        this.H = z3;
        this.L = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        switch (i) {
            case 0:
                kyb kybVar = (kyb) obj6;
                yig yigVar = (yig) obj5;
                pz7 pz7Var = (pz7) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean z = this.F;
                    wlg wlgVarA = f8g.a(!this.G ? kybVar.f : z ? kybVar.a : kybVar.d, yigVar, null, e18Var, 0, 12);
                    iqb iqbVarA = fqb.E;
                    if (pz7Var == null || !(this.H || z)) {
                        e18Var.a0(-634793532);
                    } else {
                        e18Var.a0(-634794445);
                        Object objN = e18Var.N();
                        if (objN == jd4.a) {
                            objN = new jua(23);
                            e18Var.k0(objN);
                        }
                        iqbVarA = tjf.a(iqbVarA, (bz7) objN);
                    }
                    e18Var.p(false);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarA);
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
                    j8.c(sq6.m(((d54) wlgVarA.getValue()).a, on4.a), ta4Var, e18Var, 8);
                    e18Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ghk.e((String) obj6, (String) obj5, (String) obj4, this.F, this.G, this.H, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ pyb(String str, String str2, String str3, boolean z, boolean z2, boolean z3, iqb iqbVar, int i) {
        this.I = str;
        this.J = str2;
        this.K = str3;
        this.F = z;
        this.G = z2;
        this.H = z3;
        this.L = iqbVar;
    }
}
