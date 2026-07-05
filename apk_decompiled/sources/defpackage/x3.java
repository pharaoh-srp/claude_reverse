package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 extends gb9 {
    @Override // defpackage.gb9
    public final void P(y3 y3Var, y3 y3Var2) {
        y3Var.b = y3Var2;
    }

    @Override // defpackage.gb9
    public final void Q(y3 y3Var, Thread thread) {
        y3Var.a = thread;
    }

    @Override // defpackage.gb9
    public final boolean n(z3 z3Var, v3 v3Var, v3 v3Var2) {
        synchronized (z3Var) {
            try {
                if (z3Var.F != v3Var) {
                    return false;
                }
                z3Var.F = v3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gb9
    public final boolean o(z3 z3Var, Object obj, Object obj2) {
        synchronized (z3Var) {
            try {
                if (z3Var.E != obj) {
                    return false;
                }
                z3Var.E = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gb9
    public final boolean p(z3 z3Var, y3 y3Var, y3 y3Var2) {
        synchronized (z3Var) {
            try {
                if (z3Var.G != y3Var) {
                    return false;
                }
                z3Var.G = y3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
