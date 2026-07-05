package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vq3 implements sz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ vq3(iqb iqbVar, float f, tkh tkhVar, ta4 ta4Var) {
        this.G = iqbVar;
        this.F = f;
        this.H = tkhVar;
        this.I = ta4Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj5 = this.I;
        float f = this.F;
        Object obj6 = this.H;
        Object obj7 = this.G;
        int i2 = 0;
        switch (i) {
            case 0:
                iqb iqbVar = (iqb) obj7;
                tkh tkhVar = (tkh) obj6;
                ta4 ta4Var = (ta4) obj5;
                cte cteVar = (cte) obj;
                iqb iqbVar2 = (iqb) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                cteVar.getClass();
                iqbVar2.getClass();
                int i3 = (iIntValue & 6) == 0 ? (((e18) ld4Var).f(cteVar) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i3 |= ((e18) ld4Var).f(iqbVar2) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
                    e18Var.T();
                } else {
                    iqb iqbVarJ = gb9.J(iqbVar2.B(iqbVar), f);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
                    ((rte) e18Var.j(ste.a)).b.i(tkhVar, fd9.q0(-375984849, new wq3(ta4Var, cteVar, i2), e18Var), e18Var, 48);
                    e18Var.p(true);
                }
                break;
            default:
                mdg mdgVar = (mdg) obj7;
                md9 md9Var = (md9) obj6;
                nwb nwbVar = (nwb) obj5;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((c90) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).g(zBooleanValue) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    e18Var2.T();
                } else if (!zBooleanValue) {
                    e18Var2.a0(161570345);
                    rwk.c(rwk.j(f, gm3.a(e18Var2)), f, e18Var2, 0);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(161331149);
                    Set set = (Set) nwbVar.getValue();
                    boolean zH = e18Var2.h(md9Var);
                    Object objN = e18Var2.N();
                    if (zH || objN == jd4.a) {
                        objN = new xi4(24, md9Var);
                        e18Var2.k0(objN);
                    }
                    rwk.e(mdgVar, set, (zy7) objN, e18Var2, 6);
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vq3(mdg mdgVar, md9 md9Var, float f, nwb nwbVar) {
        this.G = mdgVar;
        this.H = md9Var;
        this.F = f;
        this.I = nwbVar;
    }
}
