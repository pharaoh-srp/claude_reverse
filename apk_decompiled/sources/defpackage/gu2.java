package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gu2 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ pz7 G;

    public /* synthetic */ gu2(iqb iqbVar, pz7 pz7Var) {
        this.F = iqbVar;
        this.G = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.G;
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
                    sq6.B(0, pz7Var, e18Var, true);
                }
                break;
            default:
                num.getClass();
                q4g.a(iqbVar, pz7Var, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gu2(iqb iqbVar, pz7 pz7Var, int i) {
        this.F = iqbVar;
        this.G = pz7Var;
    }
}
