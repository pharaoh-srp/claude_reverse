package defpackage;

import com.anthropic.claude.api.account.RavenType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jhf implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ pvg F;
    public final /* synthetic */ RavenType G;

    public /* synthetic */ jhf(pvg pvgVar, RavenType ravenType) {
        this.F = pvgVar;
        this.G = ravenType;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        RavenType ravenType = this.G;
        pvg pvgVar = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                uvk.c(pvgVar, ravenType, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarK = gb9.K(fqb.E, 8.0f, 6.5f);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
                    tjh.b(xik.f(pvgVar, ravenType, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, (tkh) gm3.c(e18Var).f.J, e18Var, 0, 24576, 114686);
                    e18Var.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jhf(pvg pvgVar, RavenType ravenType, int i) {
        this.F = pvgVar;
        this.G = ravenType;
    }
}
