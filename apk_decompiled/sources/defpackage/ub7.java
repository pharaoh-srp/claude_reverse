package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ub7 {
    public static final ub7 a = new ub7();

    static {
        gb9.a(16.0f, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final void a(int i, ld4 ld4Var, iqb iqbVar, boolean z) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1732824199);
        int i2 = (e18Var.g(z) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            py8 py8VarE = rtk.e();
            float f = z ? 180.0f : MTTypesetterKt.kLineSkipLimitMultiplier;
            fqb fqbVar = fqb.E;
            cv8.a(py8VarE, null, ysk.f(fqbVar, f), 0L, e18Var, 48, 8);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(this, z, iqbVar2, i, 16);
        }
    }
}
