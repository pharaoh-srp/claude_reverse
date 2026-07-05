package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tp6 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rp6 F;
    public final /* synthetic */ qi3 G;

    public /* synthetic */ tp6(rp6 rp6Var, qi3 qi3Var, int i) {
        this.E = i;
        this.F = rp6Var;
        this.G = qi3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        qi3 qi3Var = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
                    boolean zH = e18Var.h(qi3Var);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new au2(qi3Var, 1);
                        e18Var.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    boolean zH2 = e18Var.h(qi3Var);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new au2(qi3Var, 2);
                        e18Var.k0(objN2);
                    }
                    ztk.b(iqbVarN, this.F, bz7Var, (bz7) objN2, e18Var, 6);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    iqb iqbVarN2 = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
                    boolean zH3 = e18Var2.h(qi3Var);
                    Object objN3 = e18Var2.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new au2(qi3Var, 3);
                        e18Var2.k0(objN3);
                    }
                    bz7 bz7Var2 = (bz7) objN3;
                    boolean zH4 = e18Var2.h(qi3Var);
                    Object objN4 = e18Var2.N();
                    if (zH4 || objN4 == lz1Var) {
                        objN4 = new au2(qi3Var, 4);
                        e18Var2.k0(objN4);
                    }
                    ztk.b(iqbVarN2, this.F, bz7Var2, (bz7) objN4, e18Var2, 6);
                }
                break;
        }
        return ieiVar;
    }
}
