package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import defpackage.hvd;
import defpackage.j01;
import defpackage.ja4;
import defpackage.jke;
import defpackage.pya;
import io.sentry.a5;
import io.sentry.a6;
import io.sentry.d6;
import io.sentry.l7;
import io.sentry.m3;
import io.sentry.n4;
import io.sentry.n7;
import io.sentry.q2;
import io.sentry.r7;
import io.sentry.s7;
import io.sentry.t4;
import io.sentry.t5;
import io.sentry.t7;
import io.sentry.w6;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements io.sentry.x1, Closeable, Application.ActivityLifecycleCallbacks {
    public final Application E;
    public final l0 F;
    public n4 G;
    public SentryAndroidOptions H;
    public final boolean K;
    public io.sentry.p1 N;
    public final c U;
    public boolean I = false;
    public boolean J = false;
    public boolean L = false;
    public io.sentry.m0 M = null;
    public final WeakHashMap O = new WeakHashMap();
    public final WeakHashMap P = new WeakHashMap();
    public final WeakHashMap Q = new WeakHashMap();
    public a5 R = new d6(new Date(0), 0);
    public Future S = null;
    public final WeakHashMap T = new WeakHashMap();
    public final io.sentry.util.a V = new io.sentry.util.a();
    public boolean W = false;
    public final io.sentry.util.a X = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, l0 l0Var, c cVar) {
        this.E = application;
        this.F = l0Var;
        this.U = cVar;
        if (Build.VERSION.SDK_INT >= 29) {
            this.K = true;
        }
    }

    public static void d(io.sentry.p1 p1Var, io.sentry.p1 p1Var2) {
        if (p1Var == null || p1Var.h()) {
            return;
        }
        String description = p1Var.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = p1Var.getDescription() + " - Deadline Exceeded";
        }
        p1Var.s(description);
        a5 a5VarZ = p1Var2 != null ? p1Var2.z() : null;
        if (a5VarZ == null) {
            a5VarZ = p1Var.D();
        }
        e(p1Var, a5VarZ, n7.DEADLINE_EXCEEDED);
    }

    public static void e(io.sentry.p1 p1Var, a5 a5Var, n7 n7Var) {
        if (p1Var == null || p1Var.h()) {
            return;
        }
        if (n7Var == null) {
            n7Var = p1Var.e() != null ? p1Var.e() : n7.OK;
        }
        p1Var.A(n7Var, a5Var);
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.H = sentryAndroidOptions;
        this.G = n4.a;
        this.I = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.M = this.H.getFullyDisplayedReporter();
        this.J = this.H.isEnableTimeToFullDisplayTracing();
        this.E.registerActivityLifecycleCallbacks(this);
        this.H.getLogger().h(t5.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        io.sentry.p.a("ActivityLifecycle");
    }

    public final void c() {
        a6 a6Var;
        io.sentry.android.core.performance.i iVarB = io.sentry.android.core.performance.h.c().b(this.H);
        if (iVarB.H != 0) {
            a6Var = new a6((iVarB.b() ? iVarB.F + iVarB.a() : 0L) * 1000000);
        } else {
            a6Var = null;
        }
        if (!this.I || a6Var == null) {
            return;
        }
        e(this.N, a6Var, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.H;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        c cVar = this.U;
        io.sentry.v vVarA = cVar.f.a();
        try {
            if (cVar.c()) {
                cVar.d(new pya(16, cVar), "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) cVar.a.a()).a.h();
            }
            cVar.c.clear();
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

    public final void f(io.sentry.r1 r1Var, io.sentry.p1 p1Var, io.sentry.p1 p1Var2) {
        if (r1Var == null || r1Var.h()) {
            return;
        }
        n7 n7Var = n7.DEADLINE_EXCEEDED;
        if (p1Var != null && !p1Var.h()) {
            p1Var.m(n7Var);
        }
        d(p1Var2, p1Var);
        Future future = this.S;
        if (future != null) {
            future.cancel(false);
            this.S = null;
        }
        n7 n7VarE = r1Var.e();
        if (n7VarE == null) {
            n7VarE = n7.OK;
        }
        r1Var.m(n7VarE);
        if (this.G != null) {
            t4.e(new jke(this, r1Var));
        }
    }

    public final void i(io.sentry.p1 p1Var, io.sentry.p1 p1Var2) {
        io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
        io.sentry.android.core.performance.i iVar = hVarC.H;
        io.sentry.android.core.performance.i iVar2 = hVarC.I;
        if (iVar.b() && iVar.H == 0) {
            iVar.H = SystemClock.uptimeMillis();
        }
        if (iVar2.b() && iVar2.H == 0) {
            iVar2.H = SystemClock.uptimeMillis();
        }
        c();
        io.sentry.v vVarA = this.X.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.H;
            if (sentryAndroidOptions == null || p1Var2 == null) {
                if (p1Var2 != null && !p1Var2.h()) {
                    p1Var2.p();
                }
                if (this.W && p1Var != null && !p1Var.h()) {
                    p1Var.p();
                }
            } else {
                a5 a5VarC = sentryAndroidOptions.getDateProvider().c();
                long jB = a5VarC.b(p1Var2.D()) / 1000000;
                Long lValueOf = Long.valueOf(jB);
                q2 q2Var = q2.MILLISECOND;
                p1Var2.x("time_to_initial_display", lValueOf, q2Var);
                if (p1Var != null && this.W) {
                    this.W = false;
                    p1Var2.x("time_to_full_display", Long.valueOf(jB), q2Var);
                    p1Var.x("time_to_full_display", Long.valueOf(jB), q2Var);
                    e(p1Var, a5VarC, null);
                }
                e(p1Var2, a5VarC, null);
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

    public final void j(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        a6 a6Var;
        a5 a5Var;
        hvd hvdVar;
        io.sentry.r1 r1Var;
        WeakReference weakReference = new WeakReference(activity);
        if (this.G != null) {
            WeakHashMap weakHashMap3 = this.T;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.I) {
                weakHashMap3.put(activity, m3.a);
                if (this.H.isEnableAutoTraceIdGeneration()) {
                    this.G.w(new io.sentry.b2(13));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.P;
                weakHashMap2 = this.O;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                f((io.sentry.r1) entry.getValue(), (io.sentry.p1) weakHashMap2.get(entry.getKey()), (io.sentry.p1) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.i iVarB = io.sentry.android.core.performance.h.c().b(this.H);
            r7 r7Var = null;
            if (p0.f() && iVarB.b()) {
                a6 a6Var2 = iVarB.b() ? new a6(iVarB.F * 1000000) : null;
                boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.h.c().E == io.sentry.android.core.performance.g.COLD);
                a6Var = a6Var2;
            } else {
                boolValueOf = null;
                a6Var = null;
            }
            t7 t7Var = new t7();
            long deadlineTimeout = this.H.getDeadlineTimeout();
            t7Var.j = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.H.isEnableActivityLifecycleTracingAutoFinish()) {
                t7Var.i = this.H.getIdleTimeout();
                t7Var.b = true;
            }
            t7Var.h = true;
            t7Var.k = new f(this, weakReference, simpleName);
            if (this.L || a6Var == null || boolValueOf == null) {
                a5Var = this.R;
            } else {
                r7 r7Var2 = io.sentry.android.core.performance.h.c().O;
                io.sentry.android.core.performance.h.c().O = null;
                r7Var = r7Var2;
                a5Var = a6Var;
            }
            t7Var.d = a5Var;
            t7Var.g = r7Var != null;
            t7Var.f = "auto.ui.activity";
            io.sentry.r1 r1VarT = this.G.t(new s7(simpleName, io.sentry.protocol.h0.COMPONENT, "ui.load", r7Var), t7Var);
            hvd hvdVar2 = new hvd();
            hvdVar2.f = "auto.ui.activity";
            if (this.L || a6Var == null || boolValueOf == null) {
                hvdVar = hvdVar2;
            } else {
                io.sentry.p1 p1VarU = r1VarT.u(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", a6Var, io.sentry.w1.SENTRY, hvdVar2);
                r1VarT = r1VarT;
                hvdVar = hvdVar2;
                this.N = p1VarU;
                c();
            }
            String strConcat = simpleName.concat(" initial display");
            io.sentry.w1 w1Var = io.sentry.w1.SENTRY;
            a5 a5Var2 = a5Var;
            io.sentry.p1 p1VarU2 = r1VarT.u("ui.load.initial_display", strConcat, a5Var2, w1Var, hvdVar);
            weakHashMap2.put(activity, p1VarU2);
            if (!this.J || this.M == null || this.H == null) {
                r1Var = r1VarT;
            } else {
                io.sentry.p1 p1VarU3 = r1VarT.u("ui.load.full_display", simpleName.concat(" full display"), a5Var2, w1Var, hvdVar);
                r1Var = r1VarT;
                try {
                    weakHashMap.put(activity, p1VarU3);
                    this.S = this.H.getExecutorService().c(new j01(this, p1VarU3, p1VarU2), 25000L);
                } catch (RejectedExecutionException e) {
                    this.H.getLogger().d(t5.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e);
                }
            }
            n4 n4Var = this.G;
            ja4 ja4Var = new ja4(this, 7, r1Var);
            n4Var.getClass();
            t4.e(ja4Var);
            weakHashMap3.put(activity, r1Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.m0 m0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.K) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.v vVarA = this.V.a();
        try {
            if (this.G != null && (sentryAndroidOptions = this.H) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                String strJ = io.sentry.p.j(activity);
                n4 n4Var = this.G;
                l7 l7Var = new l7(strJ, 1);
                n4Var.getClass();
                t4.e(l7Var);
            }
            j(activity);
            io.sentry.p1 p1Var = (io.sentry.p1) this.O.get(activity);
            io.sentry.p1 p1Var2 = (io.sentry.p1) this.P.get(activity);
            this.L = true;
            if (this.I && p1Var != null && p1Var2 != null && (m0Var = this.M) != null) {
                m0Var.a.add(new d(this, p1Var, p1Var2));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.P;
        WeakHashMap weakHashMap2 = this.O;
        WeakHashMap weakHashMap3 = this.Q;
        io.sentry.v vVarA = this.V.a();
        try {
            io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) weakHashMap3.remove(activity);
            if (aVar != null) {
                io.sentry.p1 p1Var = aVar.d;
                if (p1Var != null && !p1Var.h()) {
                    aVar.d.m(n7.CANCELLED);
                }
                aVar.d = null;
                io.sentry.p1 p1Var2 = aVar.e;
                if (p1Var2 != null && !p1Var2.h()) {
                    aVar.e.m(n7.CANCELLED);
                }
                aVar.e = null;
            }
            boolean z = this.I;
            WeakHashMap weakHashMap4 = this.T;
            if (z) {
                io.sentry.p1 p1Var3 = this.N;
                n7 n7Var = n7.CANCELLED;
                if (p1Var3 != null && !p1Var3.h()) {
                    p1Var3.m(n7Var);
                }
                io.sentry.p1 p1Var4 = (io.sentry.p1) weakHashMap2.get(activity);
                io.sentry.p1 p1Var5 = (io.sentry.p1) weakHashMap.get(activity);
                n7 n7Var2 = n7.DEADLINE_EXCEEDED;
                if (p1Var4 != null && !p1Var4.h()) {
                    p1Var4.m(n7Var2);
                }
                d(p1Var5, p1Var4);
                Future future = this.S;
                if (future != null) {
                    future.cancel(false);
                    this.S = null;
                }
                if (this.I) {
                    f((io.sentry.r1) weakHashMap4.get(activity), null, null);
                }
                this.N = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.L = false;
                this.R = new d6(new Date(0L), 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.v vVarA = this.V.a();
        try {
            if (!this.K) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) this.Q.get(activity);
        if (aVar != null) {
            io.sentry.p1 p1Var = this.N;
            if (p1Var == null) {
                p1Var = (io.sentry.p1) this.T.get(activity);
            }
            if (aVar.b == null || p1Var == null) {
                return;
            }
            io.sentry.p1 p1VarA = io.sentry.android.core.performance.a.a(p1Var, aVar.a.concat(".onCreate"), aVar.b);
            aVar.d = p1VarA;
            p1VarA.p();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) this.Q.get(activity);
        if (aVar != null) {
            io.sentry.p1 p1Var = this.N;
            if (p1Var == null) {
                p1Var = (io.sentry.p1) this.T.get(activity);
            }
            if (aVar.c != null && p1Var != null) {
                io.sentry.p1 p1VarA = io.sentry.android.core.performance.a.a(p1Var, aVar.a.concat(".onStart"), aVar.c);
                aVar.e = p1VarA;
                p1VarA.p();
            }
            io.sentry.p1 p1Var2 = aVar.d;
            if (p1Var2 == null || aVar.e == null) {
                return;
            }
            a5 a5VarZ = p1Var2.z();
            a5 a5VarZ2 = aVar.e.z();
            if (a5VarZ == null || a5VarZ2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            j.a.getClass();
            d6 d6Var = new d6();
            long jB = d6Var.b(aVar.d.D()) / 1000000;
            long jB2 = d6Var.b(a5VarZ) / 1000000;
            long jB3 = d6Var.b(aVar.e.D()) / 1000000;
            long jB4 = d6Var.b(a5VarZ2) / 1000000;
            io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b();
            String description = aVar.d.getDescription();
            long jD = aVar.d.D().d() / 1000000;
            io.sentry.android.core.performance.i iVar = bVar.E;
            iVar.E = description;
            iVar.F = jD;
            iVar.G = jUptimeMillis - jB;
            iVar.H = jUptimeMillis - jB2;
            String description2 = aVar.e.getDescription();
            long jD2 = aVar.e.D().d() / 1000000;
            long j = jUptimeMillis - jB3;
            long j2 = jUptimeMillis - jB4;
            io.sentry.android.core.performance.i iVar2 = bVar.F;
            iVar2.E = description2;
            iVar2.F = jD2;
            iVar2.G = j;
            iVar2.H = j2;
            io.sentry.android.core.performance.h.c().L.add(bVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        a5 d6Var;
        io.sentry.android.core.performance.a aVar = new io.sentry.android.core.performance.a(activity.getClass().getName());
        this.Q.put(activity, aVar);
        if (this.L) {
            return;
        }
        n4 n4Var = this.G;
        if (n4Var != null) {
            d6Var = n4Var.r().getDateProvider().c();
        } else {
            j.a.getClass();
            d6Var = new d6();
        }
        this.R = d6Var;
        aVar.b = d6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        a5 d6Var;
        this.L = true;
        n4 n4Var = this.G;
        if (n4Var != null) {
            d6Var = n4Var.r().getDateProvider().c();
        } else {
            j.a.getClass();
            d6Var = new d6();
        }
        this.R = d6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        a5 d6Var;
        io.sentry.android.core.performance.a aVar = (io.sentry.android.core.performance.a) this.Q.get(activity);
        if (aVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.H;
            if (sentryAndroidOptions != null) {
                d6Var = sentryAndroidOptions.getDateProvider().c();
            } else {
                j.a.getClass();
                d6Var = new d6();
            }
            aVar.c = d6Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.v vVarA = this.V.a();
        try {
            if (!this.K) {
                onActivityPostStarted(activity);
            }
            if (this.I) {
                final io.sentry.p1 p1Var = (io.sentry.p1) this.O.get(activity);
                final io.sentry.p1 p1Var2 = (io.sentry.p1) this.P.get(activity);
                if (activity.getWindow() != null) {
                    final int i = 0;
                    io.sentry.android.core.internal.util.j.a(activity, new Runnable(this) { // from class: io.sentry.android.core.e
                        public final /* synthetic */ ActivityLifecycleIntegration F;

                        {
                            this.F = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            io.sentry.p1 p1Var3 = p1Var;
                            io.sentry.p1 p1Var4 = p1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.F;
                            switch (i2) {
                                case 0:
                                    activityLifecycleIntegration.i(p1Var4, p1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.i(p1Var4, p1Var3);
                                    break;
                            }
                        }
                    }, this.F);
                } else {
                    final int i2 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.e
                        public final /* synthetic */ ActivityLifecycleIntegration F;

                        {
                            this.F = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i22 = i2;
                            io.sentry.p1 p1Var3 = p1Var;
                            io.sentry.p1 p1Var4 = p1Var2;
                            ActivityLifecycleIntegration activityLifecycleIntegration = this.F;
                            switch (i22) {
                                case 0:
                                    activityLifecycleIntegration.i(p1Var4, p1Var3);
                                    break;
                                default:
                                    activityLifecycleIntegration.i(p1Var4, p1Var3);
                                    break;
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.v vVarA = this.V.a();
        try {
            if (!this.K) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.I) {
                this.U.a(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
