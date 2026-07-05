package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import defpackage.a4a;
import defpackage.m4a;
import io.sentry.n4;
import io.sentry.n7;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class UserInteractionIntegration implements io.sentry.x1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application E;
    public n4 F;
    public final WeakHashMap I = new WeakHashMap();
    public final Object J = new Object();
    public SentryAndroidOptions G;
    public final boolean H = io.sentry.android.core.internal.gestures.h.d(this.G, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(Application application) {
        this.E = application;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        this.F = n4.a;
        boolean z = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.G.isEnableUserInteractionTracing();
        io.sentry.a1 logger = this.G.getLogger();
        t5 t5Var = t5.DEBUG;
        logger.h(t5Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            this.E.registerActivityLifecycleCallbacks(this);
            this.G.getLogger().h(t5Var, "UserInteractionIntegration installed.", new Object[0]);
            io.sentry.p.a("UserInteraction");
            if (this.H) {
                WeakReference weakReference = (WeakReference) q0.b.a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof m4a) && ((m4a) activity).a().b() == a4a.I) {
                    c(activity);
                }
            }
        }
    }

    public final void c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.G;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().h(t5.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.F == null || this.G == null) {
            return;
        }
        synchronized (this.J) {
            try {
                WeakReference weakReference = (WeakReference) this.I.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new io.sentry.android.core.internal.gestures.b();
                    }
                    io.sentry.android.core.internal.gestures.i iVar = new io.sentry.android.core.internal.gestures.i(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.F, this.G), this.G);
                    window.setCallback(iVar);
                    synchronized (this.J) {
                        this.I.put(window, new WeakReference(iVar));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList<Window> arrayList;
        this.E.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.J) {
            arrayList = new ArrayList(this.I.keySet());
        }
        for (Window window : arrayList) {
            if (window != null) {
                d(window);
            }
        }
        synchronized (this.J) {
            this.I.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    public final void d(Window window) {
        io.sentry.android.core.internal.gestures.i iVar;
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.i) {
            io.sentry.android.core.internal.gestures.i iVar2 = (io.sentry.android.core.internal.gestures.i) callback;
            iVar2.K = true;
            iVar2.G.d(n7.CANCELLED);
            iVar2.H.a();
            Window.Callback callback2 = iVar2.F;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
            synchronized (this.J) {
                this.I.remove(window);
            }
            return;
        }
        synchronized (this.J) {
            try {
                WeakReference weakReference = (WeakReference) this.I.remove(window);
                iVar = weakReference != null ? (io.sentry.android.core.internal.gestures.i) weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVar != null) {
            iVar.K = true;
            iVar.G.d(n7.CANCELLED);
            iVar.H.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            d(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(t5.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
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
