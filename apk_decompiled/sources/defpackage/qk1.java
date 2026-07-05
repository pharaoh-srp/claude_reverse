package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qk1 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;

    public /* synthetic */ qk1(String str, boolean z) {
        this.E = 2;
        this.G = str;
        this.F = z;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        boolean z = this.F;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    String str = this.G;
                    if (objN == lz1Var) {
                        objN = mpk.P(str);
                        e18Var.k0(objN);
                    }
                    nwb nwbVar = (nwb) objN;
                    if (z) {
                        nwbVar.setValue(str);
                    }
                    tjh.b((String) nwbVar.getValue(), gb9.J(fqbVar, 32.0f), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 48, 0, 131064);
                }
                break;
            case 1:
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    String str2 = this.G;
                    if (!z) {
                        e18Var2.a0(140366291);
                        tjh.b(str2, dxeVar.a(fqbVar, 1.0f, false), gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 24960, 110584);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(140000522);
                        fhk.b(str2, dxeVar.a(fqbVar, 1.0f, false), ((jm3) gm3.c(e18Var2).e.E).g, gm3.a(e18Var2).O, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 1, 2, null, true, e18Var2, 14155776, 6, 816);
                        e18Var2.p(false);
                    }
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var3, 48);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, cxeVarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    tjh.b(this.G, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 0, 0, 262142);
                    wd6.K(fxe.a, this.F, null, null, null, null, gok.a, e18Var3, 1572870, 30);
                    e18Var3.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qk1(boolean z, String str, int i) {
        this.E = i;
        this.F = z;
        this.G = str;
    }
}
