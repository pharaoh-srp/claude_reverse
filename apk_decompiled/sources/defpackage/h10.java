package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h10 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ long F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ h10(qcc qccVar, iqb iqbVar, long j, int i, int i2) {
        this.I = qccVar;
        this.J = iqbVar;
        this.F = j;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj3 = this.J;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                l10.a((qcc) obj4, (iqb) obj3, this.F, (ld4) obj, x44.p0(i2 | 1), this.H);
                break;
            default:
                String str = (String) obj4;
                String str2 = (String) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).k;
                    long j = gm3.a(e18Var).O;
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fqb.E);
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
                    tjh.b(str, null, this.F, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tkhVar, e18Var, 0, 24576, 114682);
                    tjh.b(" · ", null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 6, 0, 131066);
                    tjh.b(str2, new hw9(1.0f, false), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, 0, 24960, 110584);
                    tjh.b(" ·", null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 6, 0, 131066);
                    xsc.a(i2, this.H, tkhVar, e18Var, 0);
                    e18Var.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ h10(String str, long j, String str2, int i, int i2) {
        this.I = str;
        this.F = j;
        this.J = str2;
        this.G = i;
        this.H = i2;
    }
}
