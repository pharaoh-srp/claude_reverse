package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class n8f implements zs1 {
    public final gg8 a;

    public n8f(gg8 gg8Var) {
        this.a = gg8Var;
    }

    @Override // defpackage.zs1
    public final void d(cv9 cv9Var) {
        kw9 kw9Var = ig8.a;
        gg8 gg8Var = this.a;
        qg8 qg8Var = gg8Var.i0;
        qg8 qg8VarB = null;
        if (!qg8Var.a()) {
            qg8Var = null;
        }
        if (qg8Var == null) {
            qg8Var = gg8Var.X.e;
            if (!qg8Var.a()) {
                qg8Var = null;
            }
            if (qg8Var == null) {
                qg8Var = gg8Var.W.e;
            }
        }
        if (!qg8Var.a()) {
            qg8Var = null;
        }
        if (qg8Var == null) {
            qg8 qg8Var2 = (qg8) w44.N0(ig8.e(gg8Var));
            if (qg8Var2 != null) {
                float fC = ig8.c(gg8Var);
                if (Float.isNaN(fC)) {
                    fC = MTTypesetterKt.kLineSkipLimitMultiplier;
                }
                qg8VarB = csk.b(qg8Var2, fC);
            }
            if (qg8VarB == null) {
                return;
            }
        } else {
            qg8VarB = qg8Var;
        }
        float f = gg8Var.j0;
        if (f >= 1.0f) {
            u00.p(cv9Var, qg8VarB, gg8Var, 0L, cv9Var.g());
            return;
        }
        ga8 ga8Var = (ga8) yb5.o(gg8Var, ve4.g);
        ja8 ja8VarC = ga8Var.c();
        try {
            ja8VarC.getClass();
            ja8VarC.g(f);
            xd6.Q0(cv9Var, ja8VarC, new zkd(qg8VarB, 5, this));
            csg.t(cv9Var, ja8VarC);
        } finally {
            ga8Var.a(ja8VarC);
        }
    }
}
