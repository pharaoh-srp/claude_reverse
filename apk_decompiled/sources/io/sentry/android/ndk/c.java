package io.sentry.android.ndk;

import defpackage.f60;
import defpackage.fy1;
import defpackage.j01;
import defpackage.pya;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.g;
import io.sentry.h4;
import io.sentry.j7;
import io.sentry.k4;
import io.sentry.ndk.NativeScope;
import io.sentry.p;
import io.sentry.protocol.i0;
import io.sentry.t5;
import io.sentry.w6;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k4 {
    public final w6 a;
    public final NativeScope b;

    public c(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        p.v("The SentryOptions object is required.", sentryAndroidOptions);
        this.a = sentryAndroidOptions;
        this.b = nativeScope;
    }

    @Override // io.sentry.g1
    public final void e(i0 i0Var) {
        w6 w6Var = this.a;
        try {
            w6Var.getExecutorService().submit(new j01(this, 22, i0Var));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void f(String str, String str2) {
        w6 w6Var = this.a;
        try {
            w6Var.getExecutorService().submit(new fy1(this, str, str2, 5));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.g1
    public final void m(g gVar) {
        w6 w6Var = this.a;
        try {
            w6Var.getExecutorService().submit(new j01(this, 23, gVar));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void p(String str, String str2) {
        w6 w6Var = this.a;
        try {
            w6Var.getExecutorService().submit(new f60(this, str, str2, 14));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void r() {
        w6 w6Var = this.a;
        try {
            w6Var.getExecutorService().submit(new pya(23, this));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void s(String str) {
        w6 w6Var = this.a;
        try {
            w6Var.getExecutorService().submit(new b(this, str, 1));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.k4, io.sentry.g1
    public final void t(String str) {
        w6 w6Var = this.a;
        try {
            w6Var.getExecutorService().submit(new b(this, str, 0));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.g1
    public final void v(j7 j7Var, h4 h4Var) {
        w6 w6Var = this.a;
        if (j7Var == null) {
            return;
        }
        try {
            w6Var.getExecutorService().submit(new j01(this, 24, j7Var));
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
