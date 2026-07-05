package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r5l extends d5h {
    public final Object a = new Object();
    public final i99 b;
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public r5l() {
        i99 i99Var = new i99();
        i99Var.F = new Object();
        this.b = i99Var;
    }

    @Override // defpackage.d5h
    public final r5l a(cec cecVar) {
        b(y5h.a, cecVar);
        return this;
    }

    @Override // defpackage.d5h
    public final r5l b(Executor executor, cec cecVar) {
        this.b.k(new njk(executor, cecVar));
        q();
        return this;
    }

    @Override // defpackage.d5h
    public final r5l c(Executor executor, mec mecVar) {
        this.b.k(new njk(executor, mecVar));
        q();
        return this;
    }

    @Override // defpackage.d5h
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.d5h
    public final Object e() {
        Object obj;
        synchronized (this.a) {
            try {
                dgj.x("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.d5h
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.d5h
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final r5l h(zdc zdcVar) {
        this.b.k(new njk(y5h.a, zdcVar));
        q();
        return this;
    }

    public final r5l i(Executor executor, zdc zdcVar) {
        this.b.k(new njk(executor, zdcVar));
        q();
        return this;
    }

    public final r5l j(Executor executor, up4 up4Var) {
        r5l r5lVar = new r5l();
        this.b.k(new g3k(executor, up4Var, r5lVar, 0));
        q();
        return r5lVar;
    }

    public final r5l k(Executor executor, up4 up4Var) {
        r5l r5lVar = new r5l();
        this.b.k(new g3k(executor, up4Var, r5lVar, 1));
        q();
        return r5lVar;
    }

    public final r5l l(Executor executor, gxg gxgVar) {
        r5l r5lVar = new r5l();
        this.b.k(new njk(executor, gxgVar, r5lVar));
        q();
        return r5lVar;
    }

    public final void m(Exception exc) {
        dgj.w("Exception must not be null", exc);
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.f = exc;
        }
        this.b.l(this);
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                throw DuplicateTaskCompletionException.a(this);
            }
            this.c = true;
            this.e = obj;
        }
        this.b.l(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.l(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.l(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.l(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
