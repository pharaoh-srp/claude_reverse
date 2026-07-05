package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Window;
import defpackage.ed9;
import defpackage.j01;
import defpackage.tui;
import io.sentry.a1;
import io.sentry.android.core.l0;
import io.sentry.t5;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Application.ActivityLifecycleCallbacks {
    public final l0 E;
    public final CopyOnWriteArraySet F;
    public final a1 G;
    public final Handler H;
    public WeakReference I;
    public final ConcurrentHashMap J;
    public final boolean K;
    public final d L;
    public final ed9 M;
    public Choreographer N;
    public final Field O;
    public long P;
    public long Q;
    public final ConcurrentSkipListSet R;

    public p(Context context, final a1 a1Var, l0 l0Var) {
        d dVar = new d();
        this.F = new CopyOnWriteArraySet();
        this.J = new ConcurrentHashMap();
        this.K = false;
        this.P = 0L;
        this.Q = 0L;
        this.R = new ConcurrentSkipListSet();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        io.sentry.p.v("Logger is required", a1Var);
        this.G = a1Var;
        io.sentry.p.v("BuildInfoProvider is required", l0Var);
        this.E = l0Var;
        this.L = dVar;
        if (context instanceof Application) {
            this.K = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.m
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    a1Var.d(t5.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.H = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new j01(this, 21, a1Var));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.O = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                a1Var.d(t5.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
            }
            this.M = new ed9(this, 1, l0Var);
        }
    }

    public final void a(String str) {
        if (this.K) {
            ConcurrentHashMap concurrentHashMap = this.J;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.I;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new tui(this, 14, window));
        }
    }

    public final void b() {
        WeakReference weakReference = this.I;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.K || this.J.isEmpty() || this.H == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new j01(this, 20, window));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.I;
        if (weakReference == null || weakReference.get() != window) {
            this.I = new WeakReference(window);
            b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new tui(this, 14, activity.getWindow()));
        WeakReference weakReference = this.I;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.I = null;
    }
}
