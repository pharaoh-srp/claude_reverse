package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.HandlerThread;
import defpackage.jke;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.z2;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class FeedbackShakeIntegration implements io.sentry.x1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application E;
    public SentryAndroidOptions G;
    public volatile WeakReference H;
    public volatile Runnable J;
    public volatile boolean I = false;
    public final p1 F = new p1(z2.E);

    public FeedbackShakeIntegration(Application application) {
        this.E = application;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        if (sentryAndroidOptions.getFeedbackOptions().g) {
            p1 p1Var = this.F;
            Application application = this.E;
            p1Var.f = this.G.getLogger();
            p1Var.a(application);
            io.sentry.p.a("FeedbackShake");
            this.E.registerActivityLifecycleCallbacks(this);
            this.G.getLogger().h(t5.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
            WeakReference weakReference = (WeakReference) q0.b.a;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null) {
                this.H = new WeakReference(activity);
                p1 p1Var2 = this.F;
                if (this.G == null) {
                    return;
                }
                p1Var2.c();
                p1Var2.b(activity, new jke(16, this));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.unregisterActivityLifecycleCallbacks(this);
        p1 p1Var = this.F;
        p1Var.c();
        HandlerThread handlerThread = p1Var.c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            p1Var.c = null;
            p1Var.d = null;
        }
        if (this.I) {
            this.I = false;
            SentryAndroidOptions sentryAndroidOptions = this.G;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.J;
            }
            this.J = null;
        }
        this.H = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.H != null ? (Activity) this.H.get() : null;
        if (this.I && activity == activity2) {
            this.I = false;
            this.H = null;
            SentryAndroidOptions sentryAndroidOptions = this.G;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.J;
            }
            this.J = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity == (this.H != null ? (Activity) this.H.get() : null)) {
            this.F.c();
            if (this.I) {
                return;
            }
            this.H = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2 = this.H != null ? (Activity) this.H.get() : null;
        if (this.I && activity2 != null && activity2 != activity) {
            this.I = false;
            SentryAndroidOptions sentryAndroidOptions = this.G;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().h = this.J;
            }
            this.J = null;
        }
        this.H = new WeakReference(activity);
        p1 p1Var = this.F;
        if (this.G == null) {
            return;
        }
        p1Var.c();
        p1Var.b(activity, new jke(16, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
