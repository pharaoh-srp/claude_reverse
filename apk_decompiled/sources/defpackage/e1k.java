package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e1k extends ppk {
    @Override // defpackage.ppk
    public final z0k g(l4k l4kVar) {
        z0k z0kVar;
        z0k z0kVar2 = z0k.d;
        synchronized (l4kVar) {
            try {
                z0kVar = l4kVar.F;
                if (z0kVar != z0kVar2) {
                    l4kVar.F = z0kVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z0kVar;
    }

    @Override // defpackage.ppk
    public final g1k h(l4k l4kVar) {
        g1k g1kVar;
        g1k g1kVar2 = g1k.c;
        synchronized (l4kVar) {
            try {
                g1kVar = l4kVar.G;
                if (g1kVar != g1kVar2) {
                    l4kVar.G = g1kVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g1kVar;
    }

    @Override // defpackage.ppk
    public final void i(g1k g1kVar, g1k g1kVar2) {
        g1kVar.b = g1kVar2;
    }

    @Override // defpackage.ppk
    public final void j(g1k g1kVar, Thread thread) {
        g1kVar.a = thread;
    }

    @Override // defpackage.ppk
    public final boolean k(l4k l4kVar, z0k z0kVar, z0k z0kVar2) {
        synchronized (l4kVar) {
            try {
                if (l4kVar.F != z0kVar) {
                    return false;
                }
                l4kVar.F = z0kVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ppk
    public final boolean l(j1k j1kVar, Object obj, Object obj2) {
        synchronized (j1kVar) {
            try {
                if (j1kVar.E != obj) {
                    return false;
                }
                j1kVar.E = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ppk
    public final boolean m(j1k j1kVar, g1k g1kVar, g1k g1kVar2) {
        synchronized (j1kVar) {
            try {
                if (j1kVar.G != g1kVar) {
                    return false;
                }
                j1kVar.G = g1kVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
