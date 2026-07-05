package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class re2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ re2(zy7 zy7Var, String str, String str2) {
        this.E = 2;
        this.H = zy7Var;
        this.F = str;
        this.G = str2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        zy7 zy7Var = this.H;
        String str = this.G;
        String str2 = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                x2k.d(str2, str, zy7Var, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                tvj.a(str2, str, zy7Var, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    ho0 ho0Var = new ho0(10.0f, true, new sz6(1));
                    iqb iqbVarM = gb9.M(fqb.E, 14.0f, 8.0f, 12.0f, 8.0f);
                    cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarM);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var, z80Var, cxeVarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var, z80Var4, iqbVarE);
                    iv1.b(ud0.H1, null, null, null, gm3.a(e18Var).x, e18Var, 48, 12);
                    hw9 hw9Var = new hw9(1.0f, true);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, q64VarA);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE2);
                    tjh.b(this.F, null, gm3.a(e18Var).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
                    tjh.b(this.G, null, gm3.a(e18Var).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                    e18Var.p(true);
                    yjk.a(this.H, null, gm3.a(e18Var).x, e18Var, 0, 2);
                    e18Var.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ re2(String str, String str2, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.H = zy7Var;
    }
}
