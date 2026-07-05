package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d4g implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rz7 F;
    public final /* synthetic */ i4g G;

    public /* synthetic */ d4g(rz7 rz7Var, i4g i4gVar, int i) {
        this.E = i;
        this.F = rz7Var;
        this.G = i4gVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        i4g i4gVar = this.G;
        rz7 rz7Var = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
                    rz7Var.invoke(i4gVar, e18Var, 0);
                    e18Var.p(true);
                }
                break;
            default:
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    if (rz7Var == null) {
                        e18Var2.a0(2109671962);
                    } else {
                        e18Var2.a0(2109671963);
                        iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                        o5b o5bVarD2 = dw1.d(lja.G, false);
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, iqbVarC2);
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
                        rz7Var.invoke(i4gVar, e18Var2, 0);
                        e18Var2.p(true);
                    }
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
