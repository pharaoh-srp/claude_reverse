package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.n4;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityBreadcrumbsIntegration implements io.sentry.x1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application E;
    public n4 F;
    public boolean G;
    public final io.sentry.util.a H = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.E = application;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.F = n4.a;
        this.G = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        io.sentry.a1 logger = w6Var.getLogger();
        t5 t5Var = t5.DEBUG;
        logger.h(t5Var, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.G));
        if (this.G) {
            this.E.registerActivityLifecycleCallbacks(this);
            w6Var.getLogger().h(t5Var, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            io.sentry.p.a("ActivityBreadcrumbs");
        }
    }

    public final void c(Activity activity, String str) {
        if (this.F == null) {
            return;
        }
        io.sentry.g gVar = new io.sentry.g();
        gVar.I = "navigation";
        gVar.c("state", str);
        gVar.c("screen", activity.getClass().getSimpleName());
        gVar.K = "ui.lifecycle";
        gVar.M = t5.INFO;
        io.sentry.n0 n0Var = new io.sentry.n0();
        n0Var.d("android:activity", activity);
        this.F.j(gVar, n0Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.G) {
            this.E.unregisterActivityLifecycleCallbacks(this);
            n4 n4Var = this.F;
            if (n4Var != null) {
                n4Var.r().getLogger().h(t5.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.v vVarA = this.H.a();
        try {
            c(activity, "created");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        io.sentry.v vVarA = this.H.a();
        try {
            c(activity, "destroyed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.v vVarA = this.H.a();
        try {
            c(activity, "paused");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.v vVarA = this.H.a();
        try {
            c(activity, "resumed");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.v vVarA = this.H.a();
        try {
            c(activity, "saveInstanceState");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.v vVarA = this.H.a();
        try {
            c(activity, "started");
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        io.sentry.v vVarA = this.H.a();
        try {
            c(activity, "stopped");
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
}
