package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kf2 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ e6i F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ float H;
    public final /* synthetic */ long I;
    public final /* synthetic */ tkh J;

    public /* synthetic */ kf2(e6i e6iVar, boolean z, float f, long j, tkh tkhVar) {
        this.F = e6iVar;
        this.G = z;
        this.H = f;
        this.I = j;
        this.J = tkhVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        e6i e6iVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    hac hacVar = (hac) e6iVar.b.getValue();
                    boolean z = hacVar instanceof fac;
                    tkh tkhVar = this.J;
                    long j = this.I;
                    if (z) {
                        e18Var.a0(-852414957);
                        thk.c(((fac) hacVar).a, this.G, tkhVar, j, this.H, e18Var, 0);
                        e18Var.p(false);
                    } else {
                        if (!(hacVar instanceof gac)) {
                            throw ebh.u(e18Var, -852417507, false);
                        }
                        e18Var.a0(-654702490);
                        tjh.b(((gac) hacVar).a, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, tkhVar, e18Var, 0, 27648, 106490);
                        e18Var.p(false);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Character ch = (Character) e6iVar.b.getValue();
                    ch.getClass();
                    iqb iqbVarW = xn5.W(fqb.E);
                    boolean z2 = this.G;
                    boolean zG = e18Var2.g(z2);
                    Object objN = e18Var2.N();
                    if (zG || objN == jd4.a) {
                        objN = new q8(z2, 17);
                        e18Var2.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    final float f = this.H;
                    final long j2 = this.I;
                    final tkh tkhVar2 = this.J;
                    xn5.G(ch, iqbVarW, bz7Var, null, "numericTextChar", null, fd9.q0(1651728450, new sz7() { // from class: hf2
                        @Override // defpackage.sz7
                        public final Object i(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i2;
                            Character ch2 = (Character) obj5;
                            char cCharValue = ch2.charValue();
                            ld4 ld4Var3 = (ld4) obj6;
                            int iIntValue3 = ((Integer) obj7).intValue();
                            ((c90) obj4).getClass();
                            if ((iIntValue3 & 48) == 0) {
                                e18 e18Var3 = (e18) ld4Var3;
                                Object objF = e18Var3.F();
                                if ((objF instanceof Character) && cCharValue == ((Character) objF).charValue()) {
                                    i2 = 16;
                                } else {
                                    e18Var3.l0(ch2);
                                    i2 = 32;
                                }
                                iIntValue3 |= i2;
                            }
                            e18 e18Var4 = (e18) ld4Var3;
                            if (e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                String strValueOf = String.valueOf(cCharValue);
                                boolean zJ = thk.j(cCharValue);
                                iqb iqbVarT = fqb.E;
                                if (zJ) {
                                    iqbVarT = b.t(iqbVarT, f);
                                }
                                tjh.b(strValueOf, iqbVarT, j2, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 1, 0, null, tkhVar2, e18Var4, 0, 27648, 105464);
                            } else {
                                e18Var4.T();
                            }
                            return iei.a;
                        }
                    }, e18Var2), e18Var2, 1597488, 40);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ kf2(e6i e6iVar, boolean z, tkh tkhVar, long j, float f) {
        this.F = e6iVar;
        this.G = z;
        this.J = tkhVar;
        this.I = j;
        this.H = f;
    }
}
