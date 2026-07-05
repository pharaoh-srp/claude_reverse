package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public abstract class do9 extends ol9 implements wn9 {
    public static final Object P = new Object();
    public final im9 J;
    public final String K;
    public final String L;
    public final Object M;
    public final kw9 N;
    public final ece O;

    public do9(im9 im9Var, String str, String str2, hrd hrdVar, Object obj) {
        this.J = im9Var;
        this.K = str;
        this.L = str2;
        this.M = obj;
        this.N = yb5.w(w1a.F, new co9(this, 1));
        this.O = csg.C(hrdVar, new co9(this, 0));
    }

    public final boolean equals(Object obj) {
        do9 do9VarC = vpi.c(obj);
        return do9VarC != null && x44.r(this.J, do9VarC.J) && x44.r(this.K, do9VarC.K) && x44.r(this.L, do9VarC.L) && x44.r(this.M, do9VarC.M);
    }

    @Override // defpackage.ll9
    public final String getName() {
        return this.K;
    }

    public final int hashCode() {
        return this.L.hashCode() + kgh.l(this.J.hashCode() * 31, 31, this.K);
    }

    @Override // defpackage.ll9
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.ol9
    public final q92 q() {
        return z().q();
    }

    @Override // defpackage.ol9
    public final im9 r() {
        return this.J;
    }

    @Override // defpackage.ol9
    public final q92 s() {
        z().getClass();
        return null;
    }

    public final String toString() {
        g06 g06Var = pce.a;
        return pce.d(t());
    }

    @Override // defpackage.ol9
    public final boolean v() {
        return !x44.r(this.M, g92.NO_RECEIVER);
    }

    public final Member w() {
        if (!t().A()) {
            return null;
        }
        gh3 gh3Var = jze.a;
        ne5 ne5VarB = jze.b(t());
        if (ne5VarB instanceof qk9) {
            qk9 qk9Var = (qk9) ne5VarB;
            if ((qk9Var.o().F & 16) == 16) {
                wk9 wk9Var = qk9Var.o().K;
                int i = wk9Var.F;
                if ((i & 1) != 1 || (i & 2) != 2) {
                    return null;
                }
                return this.J.j(qk9Var.m().getString(wk9Var.G), qk9Var.m().getString(wk9Var.H));
            }
        }
        return (Field) this.N.getValue();
    }

    public final Object x() {
        return kvk.c(this.M, t());
    }

    @Override // defpackage.ol9
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final hrd t() {
        Object objA = this.O.a();
        objA.getClass();
        return (hrd) objA;
    }

    public abstract zn9 z();

    /* JADX WARN: Illegal instructions before constructor call */
    public do9(im9 im9Var, hrd hrdVar) {
        hrdVar.getClass();
        String strB = hrdVar.getName().b();
        strB.getClass();
        this(im9Var, strB, jze.b(hrdVar).e(), hrdVar, g92.NO_RECEIVER);
    }
}
