package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class pbd {
    public static final ad5 a = new ad5(0.1f, 0.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);

    public static final void a(s8a s8aVar, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1579880526);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(s8aVar) : e18Var.h(s8aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            e18Var.X(2141740905, s8aVar);
            boolean zBooleanValue = ((Boolean) s8aVar.d.getValue()).booleanValue();
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !e18Var.h(s8aVar))) {
                z = false;
            }
            boolean zF = e18Var.f(nwbVarZ) | z;
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new cx(s8aVar, nwbVarZ, (tp4) null, 25);
                e18Var.k0(objN);
            }
            mpk.g(zBooleanValue, (pz7) objN, e18Var, 0);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(s8aVar, zy7Var, i, 12);
        }
    }
}
