package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ss5 {
    public static final ss5 a = new ss5();

    public final void a(hw1 hw1Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(882141204);
        int i2 = (e18Var.f(hw1Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            pzg.a(fqb.E, null, hw1Var.E, hw1Var.F, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(1991263321, new mk4(11, hw1Var), e18Var), e18Var, 12582912, 98);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(this, hw1Var, i, 4);
        }
    }
}
