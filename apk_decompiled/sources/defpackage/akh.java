package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class akh {
    public final ahh a;
    public final ahh b;
    public final lsc c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final qx1 g;

    public akh() {
        ahh ahhVar = new ahh();
        this.a = ahhVar;
        this.b = ahhVar;
        ql8 ql8Var = ql8.J;
        this.c = new lsc(null, ql8Var);
        this.d = new lsc(null, ql8Var);
        this.e = new lsc(null, ql8Var);
        this.f = mpk.P(new va6(MTTypesetterKt.kLineSkipLimitMultiplier));
        this.g = new qx1();
    }

    public final long a(long j) {
        l9e l9eVarJ;
        cu9 cu9VarE = e();
        l9e l9eVar = l9e.e;
        if (cu9VarE != null) {
            if (cu9VarE.n()) {
                cu9 cu9VarB = b();
                l9eVarJ = cu9VarB != null ? cu9VarB.J(cu9VarE, true) : null;
            } else {
                l9eVarJ = l9eVar;
            }
            if (l9eVarJ != null) {
                l9eVar = l9eVarJ;
            }
        }
        return aqk.b(j, l9eVar);
    }

    public final cu9 b() {
        return (cu9) this.e.getValue();
    }

    public final yjh c() {
        return (yjh) this.b.getValue();
    }

    public final int d(long j, boolean z) {
        yjh yjhVarC = c();
        if (yjhVarC == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return yjhVarC.b.g(aqk.c(this, j));
    }

    public final cu9 e() {
        return (cu9) this.c.getValue();
    }

    public final boolean f(long j) {
        yjh yjhVarC = c();
        if (yjhVarC == null) {
            return false;
        }
        long jC = aqk.c(this, a(j));
        int iE = yjhVarC.b.e(Float.intBitsToFloat((int) (4294967295L & jC)));
        int i = (int) (jC >> 32);
        return Float.intBitsToFloat(i) >= yjhVarC.f(iE) && Float.intBitsToFloat(i) <= yjhVarC.g(iE);
    }
}
