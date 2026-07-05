package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import defpackage.j01;
import defpackage.pya;
import io.sentry.t5;
import io.sentry.z2;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Closeable {
    public static final f0 I = new f0();
    public volatile e0 F;
    public final io.sentry.util.a E = new io.sentry.util.a();
    public final q0 G = new q0();
    public volatile Boolean H = null;

    public final void c(c0 c0Var) {
        io.sentry.v vVarA = this.E.a();
        try {
            e(z2.E);
            if (this.F != null) {
                this.F.E.add(c0Var);
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i();
    }

    public final void d(io.sentry.a1 a1Var) {
        e0 e0Var = this.F;
        if (e0Var != null) {
            try {
                ProcessLifecycleOwner.M.J.a(e0Var);
            } catch (Throwable th) {
                this.F = null;
                a1Var.d(t5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    public final void e(io.sentry.a1 a1Var) {
        if (this.F != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.M;
            this.F = new e0(this);
            if (io.sentry.android.core.internal.util.f.a.c()) {
                d(a1Var);
                return;
            }
            q0 q0Var = this.G;
            ((Handler) q0Var.a).post(new j01(this, 19, a1Var));
        } catch (ClassNotFoundException unused) {
            a1Var.h(t5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            a1Var.d(t5.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    public final void f(c0 c0Var) {
        io.sentry.v vVarA = this.E.a();
        try {
            if (this.F != null) {
                this.F.E.remove(c0Var);
            }
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i() {
        if (this.F == null) {
            return;
        }
        io.sentry.v vVarA = this.E.a();
        try {
            e0 e0Var = this.F;
            this.F.E.clear();
            this.F = null;
            vVarA.close();
            if (io.sentry.android.core.internal.util.f.a.c()) {
                if (e0Var != null) {
                    ProcessLifecycleOwner.M.J.c(e0Var);
                }
            } else {
                q0 q0Var = this.G;
                ((Handler) q0Var.a).post(new pya(this, e0Var));
            }
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
