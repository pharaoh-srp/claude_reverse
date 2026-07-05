package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j5h {
    public final r5l a = new r5l();

    public j5h(fnf fnfVar) {
        fnfVar.j(new p7k(this));
    }

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final void b(Object obj) {
        this.a.n(obj);
    }

    public final boolean c(Exception exc) {
        r5l r5lVar = this.a;
        r5lVar.getClass();
        dgj.w("Exception must not be null", exc);
        synchronized (r5lVar.a) {
            try {
                if (r5lVar.c) {
                    return false;
                }
                r5lVar.c = true;
                r5lVar.f = exc;
                r5lVar.b.l(r5lVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.p(obj);
    }

    public j5h() {
    }
}
