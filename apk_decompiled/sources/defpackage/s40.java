package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class s40 extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ r9d G;
    public final /* synthetic */ nwb H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s40(r9d r9dVar, nwb nwbVar, int i) {
        super(2);
        this.F = i;
        this.G = r9dVar;
        this.H = nwbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        nwb nwbVar = this.H;
        r9d r9dVar = this.G;
        int i2 = 0;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Number) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = ex.M;
                        e18Var.k0(objN);
                    }
                    iqb iqbVarB = tjf.b(fqb.E, false, (bz7) objN);
                    boolean zH = e18Var.h(r9dVar);
                    Object objN2 = e18Var.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new p40(r9dVar, 1);
                        e18Var.k0(objN2);
                    }
                    iqb iqbVarS = xn5.S(wd6.v0(iqbVarB, (bz7) objN2), r9dVar.getCanCalculatePosition() ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier);
                    xe4 xe4Var = u40.a;
                    pz7 pz7Var = (pz7) nwbVar.getValue();
                    Object objN3 = e18Var.N();
                    if (objN3 == lz1Var) {
                        objN3 = t10.c;
                        e18Var.k0(objN3);
                    }
                    o5b o5bVar = (o5b) objN3;
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarS);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, o5bVar);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    sq6.B(0, pz7Var, e18Var, true);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    j8.c(u40.b.a(Boolean.TRUE), fd9.q0(1022273628, new s40(r9dVar, nwbVar, i2), e18Var2), e18Var2, 56);
                }
                break;
        }
        return ieiVar;
    }
}
