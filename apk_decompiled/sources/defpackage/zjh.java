package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zjh {
    public final yjh a;
    public cu9 b = null;
    public cu9 c;

    public zjh(yjh yjhVar, cu9 cu9Var) {
        this.a = yjhVar;
        this.c = cu9Var;
    }

    public final long a(long j) {
        l9e l9eVarJ;
        cu9 cu9Var = this.b;
        l9e l9eVar = l9e.e;
        if (cu9Var != null) {
            if (cu9Var.n()) {
                cu9 cu9Var2 = this.c;
                l9eVarJ = cu9Var2 != null ? cu9Var2.J(cu9Var, true) : null;
            } else {
                l9eVarJ = l9eVar;
            }
            if (l9eVarJ != null) {
                l9eVar = l9eVarJ;
            }
        }
        return ypk.l(j, l9eVar);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        yjh yjhVar = this.a;
        int iE = yjhVar.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= yjhVar.f(iE) && Float.intBitsToFloat(i) <= yjhVar.g(iE);
    }

    public final long d(long j) {
        cu9 cu9Var;
        cu9 cu9Var2 = this.b;
        if (cu9Var2 != null) {
            if (!cu9Var2.n()) {
                cu9Var2 = null;
            }
            if (cu9Var2 != null && (cu9Var = this.c) != null) {
                cu9 cu9Var3 = cu9Var.n() ? cu9Var : null;
                if (cu9Var3 != null) {
                    return cu9Var2.G(cu9Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        cu9 cu9Var;
        cu9 cu9Var2 = this.b;
        if (cu9Var2 != null) {
            if (!cu9Var2.n()) {
                cu9Var2 = null;
            }
            if (cu9Var2 != null && (cu9Var = this.c) != null) {
                cu9 cu9Var3 = cu9Var.n() ? cu9Var : null;
                if (cu9Var3 != null) {
                    return cu9Var3.G(cu9Var2, j);
                }
            }
        }
        return j;
    }
}
