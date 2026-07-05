package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ui7 {
    public static final List a = x44.W("*/*");

    public static final ti7 a(List list, bz7 bz7Var, ld4 ld4Var, int i, int i2) {
        bz7Var.getClass();
        boolean z = true;
        if ((i2 & 1) != 0) {
            list = a;
        }
        if ((((i & 14) ^ 6) <= 4 || !((e18) ld4Var).f(list)) && (i & 6) != 4) {
            z = false;
        }
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (z || objN == lz1Var) {
            objN = new z38(list);
            e18Var.k0(objN);
        }
        xpa xpaVarD0 = sf5.d0((z38) objN, bz7Var, e18Var, i & 112);
        boolean zF = e18Var.f(xpaVarD0);
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new ti7(xpaVarD0);
            e18Var.k0(objN2);
        }
        return (ti7) objN2;
    }
}
