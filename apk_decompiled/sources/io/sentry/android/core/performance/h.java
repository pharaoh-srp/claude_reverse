package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.tn5;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.l0;
import io.sentry.android.core.q0;
import io.sentry.android.core.u;
import io.sentry.r7;
import io.sentry.v;
import io.sentry.z2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Application.ActivityLifecycleCallbacks {
    public static volatile h U;
    public static long T = SystemClock.uptimeMillis();
    public static final io.sentry.util.a V = new io.sentry.util.a();
    public g E = g.UNKNOWN;
    public final io.sentry.util.h F = new io.sentry.util.h(new io.sentry.android.core.internal.gestures.h());
    public volatile long G = -1;
    public u M = null;
    public io.sentry.android.core.h N = null;
    public r7 O = null;
    public boolean P = false;
    public boolean Q = true;
    public final AtomicInteger R = new AtomicInteger();
    public final AtomicBoolean S = new AtomicBoolean(false);
    public final i H = new i();
    public final i I = new i();
    public final i J = new i();
    public final HashMap K = new HashMap();
    public final ArrayList L = new ArrayList();

    public static void a(h hVar) {
        if (hVar.R.get() == 0) {
            hVar.F.c(Boolean.FALSE);
            u uVar = hVar.M;
            if (uVar != null && uVar.isRunning()) {
                hVar.M.close();
                hVar.M = null;
            }
            io.sentry.android.core.h hVar2 = hVar.N;
            if (hVar2 == null || !hVar2.M) {
                return;
            }
            hVar2.a(true);
            hVar.N = null;
        }
    }

    public static h c() {
        if (U == null) {
            v vVarA = V.a();
            try {
                if (U == null) {
                    U = new h();
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
        return U;
    }

    public final i b(SentryAndroidOptions sentryAndroidOptions) {
        if (this.E != g.UNKNOWN && ((Boolean) this.F.a()).booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                i iVar = this.H;
                if (iVar.b() && iVar.a() <= 60000) {
                    return iVar;
                }
            }
            i iVar2 = this.I;
            if (iVar2.b() && iVar2.a() <= 60000) {
                return iVar2;
            }
        }
        return new i();
    }

    public final synchronized void d() {
        if (!this.S.getAndSet(true)) {
            h hVarC = c();
            i iVar = hVarC.I;
            iVar.getClass();
            iVar.H = SystemClock.uptimeMillis();
            i iVar2 = hVarC.H;
            iVar2.getClass();
            iVar2.H = SystemClock.uptimeMillis();
        }
    }

    public final void e(Application application) {
        ActivityManager activityManager;
        if (this.P) {
            return;
        }
        this.P = true;
        this.F.b();
        application.registerActivityLifecycleCallbacks(U);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo applicationStartInfoA = tn5.a(historicalProcessStartReasons.get(0));
                if (applicationStartInfoA.getStartupState() == 0) {
                    if (applicationStartInfoA.getStartType() == 1) {
                        this.E = g.COLD;
                    } else {
                        this.E = g.WARM;
                    }
                }
            }
        }
        g gVar = this.E;
        g gVar2 = g.UNKNOWN;
        if (gVar == gVar2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new e(this));
        } else if (gVar == gVar2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new f(this, handler));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        q0.b.c(activity);
        if (this.R.incrementAndGet() == 1 && !this.S.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.H.G;
            if (!((Boolean) this.F.a()).booleanValue() || jUptimeMillis2 > 60000) {
                this.E = g.WARM;
                this.Q = true;
                i iVar = this.H;
                iVar.E = null;
                iVar.G = 0L;
                iVar.H = 0L;
                iVar.F = 0L;
                iVar.c(jUptimeMillis);
                T = jUptimeMillis;
                this.K.clear();
                i iVar2 = this.J;
                iVar2.E = null;
                iVar2.G = 0L;
                iVar2.H = 0L;
                iVar2.F = 0L;
            } else if (this.E == g.UNKNOWN) {
                if (bundle != null) {
                    this.E = g.WARM;
                } else if (this.G == -1 || jUptimeMillis <= this.G) {
                    this.E = g.COLD;
                } else {
                    this.E = g.WARM;
                }
            }
        }
        this.F.c(Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        q0 q0Var = q0.b;
        WeakReference weakReference = (WeakReference) q0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            q0Var.a = null;
        }
        if (this.R.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.E = g.WARM;
        this.F.c(Boolean.TRUE);
        this.Q = true;
        this.S.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        q0 q0Var = q0.b;
        WeakReference weakReference = (WeakReference) q0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            q0Var.a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        q0.b.c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        q0.b.c(activity);
        if (this.S.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final int i = 0;
            io.sentry.android.core.internal.util.j.a(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.d
                public final /* synthetic */ h F;

                {
                    this.F = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    h hVar = this.F;
                    switch (i2) {
                        case 0:
                            hVar.d();
                            break;
                        default:
                            hVar.d();
                            break;
                    }
                }
            }, new l0(z2.E));
        } else {
            final int i2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.d
                public final /* synthetic */ h F;

                {
                    this.F = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    h hVar = this.F;
                    switch (i22) {
                        case 0:
                            hVar.d();
                            break;
                        default:
                            hVar.d();
                            break;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        q0 q0Var = q0.b;
        WeakReference weakReference = (WeakReference) q0Var.a;
        if (weakReference == null || weakReference.get() == activity) {
            q0Var.a = null;
        }
    }
}
