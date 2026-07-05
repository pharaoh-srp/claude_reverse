package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends ijk {
    @Override // defpackage.ijk
    public final boolean b(w1 w1Var, k1 k1Var, k1 k1Var2) {
        synchronized (w1Var) {
            try {
                if (w1Var.F != k1Var) {
                    return false;
                }
                w1Var.F = k1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ijk
    public final boolean c(w1 w1Var, Object obj, Object obj2) {
        synchronized (w1Var) {
            try {
                if (w1Var.E != obj) {
                    return false;
                }
                w1Var.E = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ijk
    public final boolean d(w1 w1Var, v1 v1Var, v1 v1Var2) {
        synchronized (w1Var) {
            try {
                if (w1Var.G != v1Var) {
                    return false;
                }
                w1Var.G = v1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ijk
    public final k1 g(w1 w1Var) {
        k1 k1Var;
        k1 k1Var2 = k1.d;
        synchronized (w1Var) {
            try {
                k1Var = w1Var.F;
                if (k1Var != k1Var2) {
                    w1Var.F = k1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k1Var;
    }

    @Override // defpackage.ijk
    public final v1 h(w1 w1Var) {
        v1 v1Var;
        v1 v1Var2 = v1.c;
        synchronized (w1Var) {
            try {
                v1Var = w1Var.G;
                if (v1Var != v1Var2) {
                    w1Var.G = v1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v1Var;
    }

    @Override // defpackage.ijk
    public final void i(v1 v1Var, v1 v1Var2) {
        v1Var.b = v1Var2;
    }

    @Override // defpackage.ijk
    public final void j(v1 v1Var, Thread thread) {
        v1Var.a = thread;
    }
}
