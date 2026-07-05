package io.sentry;

import defpackage.lf5;
import defpackage.sz6;
import defpackage.tui;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class m4 implements h1 {
    public final f1 a;
    public final f1 b;
    public final f1 c;
    public final n d;
    public final m e;
    public final d f;

    public m4(f1 f1Var, f1 f1Var2, f1 f1Var3) {
        this.e = new m(f1Var3, f1Var2, f1Var, 0);
        this.a = f1Var;
        this.b = f1Var2;
        this.c = f1Var3;
        w6 w6VarR = r();
        p.v("SentryOptions is required.", w6VarR);
        if (w6VarR.getDsn() == null || w6VarR.getDsn().isEmpty()) {
            sz6.p("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
            throw null;
        }
        this.d = w6VarR.getCompositePerformanceCollector();
        this.f = new d(this);
    }

    @Override // io.sentry.h1
    public final y0 A() {
        return this.f;
    }

    @Override // io.sentry.h1
    public final void B(j4 j4Var) {
        if (!isEnabled()) {
            try {
                j4Var.i(c3.b());
                return;
            } catch (Throwable th) {
                r().getLogger().d(t5.ERROR, "Error in the 'withScope' callback.", th);
                return;
            }
        }
        f1 f1VarClone = this.a.clone();
        try {
            m1 m1VarA = t4.a.a(new m4(f1VarClone, this.b, this.c));
            try {
                j4Var.i(f1VarClone);
                m1VarA.close();
            } finally {
            }
        } catch (Throwable th2) {
            r().getLogger().d(t5.ERROR, "Error in the 'withScope' callback.", th2);
        }
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w D(Exception exc, n0 n0Var) {
        return J(exc, n0Var, null);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w E(io.sentry.protocol.e0 e0Var, p7 p7Var, n0 n0Var, y3 y3Var) {
        io.sentry.protocol.e0 e0Var2;
        f1 f1Var = this.e;
        ArrayList arrayList = e0Var.W;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (e0Var.V == null) {
            r().getLogger().h(t5.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", e0Var.E);
            return wVar;
        }
        Boolean bool = Boolean.TRUE;
        j7 j7VarI = e0Var.F.i();
        r7 r7Var = j7VarI == null ? null : j7VarI.H;
        if (!bool.equals(Boolean.valueOf(r7Var != null ? r7Var.a.booleanValue() : false))) {
            r().getLogger().h(t5.DEBUG, "Transaction %s was dropped due to sampling decision.", e0Var.E);
            if (r().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.g clientReportRecorder = r().getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
                clientReportRecorder.a(dVar, o.Transaction);
                r().getClientReportRecorder().g(dVar, o.Span, arrayList.size() + 1);
                return wVar;
            }
            io.sentry.clientreport.g clientReportRecorder2 = r().getClientReportRecorder();
            io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
            clientReportRecorder2.a(dVar2, o.Transaction);
            r().getClientReportRecorder().g(dVar2, o.Span, arrayList.size() + 1);
            return wVar;
        }
        try {
            e0Var2 = e0Var;
            try {
                return f1Var.G().e(e0Var2, p7Var, f1Var, n0Var, y3Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                this.r().getLogger().d(t5.ERROR, "Error while capturing transaction with id: " + e0Var2.E, th2);
                return wVar;
            }
        } catch (Throwable th3) {
            th = th3;
            e0Var2 = e0Var;
        }
    }

    @Override // io.sentry.h1
    public final h1 F(String str) {
        return new m4(this.a.clone(), this.b.clone(), this.c);
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w G(io.sentry.protocol.k kVar) {
        f1 f1Var = this.e;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (kVar.E.isEmpty()) {
            r().getLogger().h(t5.WARNING, "captureFeedback called with empty message.", new Object[0]);
            return wVar;
        }
        try {
            return f1Var.G().f(kVar, f1Var);
        } catch (Throwable th) {
            this.r().getLogger().d(t5.ERROR, "Error while capturing feedback: " + kVar.E, th);
            return wVar;
        }
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w H(t5 t5Var) {
        io.sentry.protocol.w wVarI = io.sentry.protocol.w.F;
        boolean zIsEnabled = isEnabled();
        f1 f1Var = this.e;
        if (zIsEnabled) {
            try {
                k1 k1VarG = f1Var.G();
                k1VarG.getClass();
                j5 j5Var = new j5();
                io.sentry.protocol.p pVar = new io.sentry.protocol.p();
                pVar.E = "MainActivity launched without Koin";
                j5Var.U = pVar;
                j5Var.Y = t5Var;
                wVarI = k1VarG.i(j5Var, f1Var, null);
            } catch (Throwable th) {
                r().getLogger().d(t5.ERROR, "Error while capturing message: ".concat("MainActivity launched without Koin"), th);
            }
        } else {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        }
        f1Var.P(wVarI);
        return wVarI;
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w I(j5 j5Var, n0 n0Var) {
        f1 f1Var = this.e;
        io.sentry.protocol.w wVarI = io.sentry.protocol.w.F;
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return wVarI;
        }
        if (j5Var == null) {
            r().getLogger().h(t5.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return wVarI;
        }
        try {
            f1Var.K(j5Var);
            wVarI = f1Var.G().i(j5Var, f1Var, n0Var);
            f1Var.P(wVarI);
            return wVarI;
        } catch (Throwable th) {
            r().getLogger().d(t5.ERROR, "Error while capturing event with id: " + j5Var.E, th);
            return wVarI;
        }
    }

    public final io.sentry.protocol.w J(Throwable th, n0 n0Var, j4 j4Var) {
        f1 f1VarClone;
        io.sentry.protocol.w wVarI = io.sentry.protocol.w.F;
        boolean zIsEnabled = isEnabled();
        m mVar = this.e;
        if (!zIsEnabled) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th == null) {
            r().getLogger().h(t5.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                j5 j5Var = new j5(th);
                mVar.K(j5Var);
                if (j4Var != null) {
                    try {
                        f1VarClone = mVar.clone();
                        j4Var.i(f1VarClone);
                    } catch (Throwable th2) {
                        r().getLogger().d(t5.ERROR, "Error in the 'ScopeCallback' callback.", th2);
                        f1VarClone = mVar;
                    }
                    wVarI = mVar.G().i(j5Var, f1VarClone, n0Var);
                } else {
                    f1VarClone = mVar;
                    wVarI = mVar.G().i(j5Var, f1VarClone, n0Var);
                }
            } catch (Throwable th3) {
                r().getLogger().d(t5.ERROR, "Error while capturing exception: " + th.getMessage(), th3);
            }
        }
        mVar.P(wVarI);
        return wVarI;
    }

    @Override // io.sentry.h1
    public final void a(boolean z) {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (x1 x1Var : r().getIntegrations()) {
                if (x1Var instanceof Closeable) {
                    try {
                        ((Closeable) x1Var).close();
                    } catch (Throwable th) {
                        r().getLogger().h(t5.WARNING, "Failed to close the integration {}.", x1Var, th);
                    }
                }
            }
            for (i0 i0Var : r().getEventProcessors()) {
                if (i0Var instanceof Closeable) {
                    try {
                        ((Closeable) i0Var).close();
                    } catch (Throwable th2) {
                        r().getLogger().h(t5.WARNING, "Failed to close the event processor {}.", i0Var, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            m mVar = this.e;
            if (zIsEnabled) {
                try {
                    mVar.V(null).clear();
                } catch (Throwable th3) {
                    r().getLogger().d(t5.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                r().getLogger().h(t5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            l4 l4Var = l4.ISOLATION;
            if (isEnabled()) {
                try {
                    mVar.V(l4Var).clear();
                } catch (Throwable th4) {
                    r().getLogger().d(t5.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                r().getLogger().h(t5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            r().getBackpressureMonitor().close();
            r().getTransactionProfiler().close();
            r().getContinuousProfiler().a(true);
            r().getCompositePerformanceCollector().close();
            r().getConnectionStatusProvider().close();
            l1 executorService = r().getExecutorService();
            if (z) {
                try {
                    executorService.submit(new tui(this, 7, executorService));
                } catch (RejectedExecutionException e) {
                    r().getLogger().d(t5.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
                    executorService.a(r().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(r().getShutdownTimeoutMillis());
            }
            l4 l4Var2 = l4.CURRENT;
            if (isEnabled()) {
                try {
                    mVar.V(l4Var2).G().a(z);
                } catch (Throwable th5) {
                    r().getLogger().d(t5.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                r().getLogger().h(t5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            l4 l4Var3 = l4.ISOLATION;
            if (isEnabled()) {
                try {
                    mVar.V(l4Var3).G().a(z);
                } catch (Throwable th6) {
                    r().getLogger().d(t5.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                r().getLogger().h(t5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            l4 l4Var4 = l4.GLOBAL;
            if (!isEnabled()) {
                r().getLogger().h(t5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                mVar.V(l4Var4).G().a(z);
            } catch (Throwable th7) {
                r().getLogger().d(t5.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            r().getLogger().d(t5.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.h1
    public final void b(long j) {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.e.G().b(j);
        } catch (Throwable th) {
            r().getLogger().d(t5.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.h1
    public final p1 c() {
        if (isEnabled()) {
            return this.e.c();
        }
        r().getLogger().h(t5.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.h1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final z0 m1188clone() {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new r0((m4) F("scopes clone"));
    }

    @Override // io.sentry.h1
    public final void d(String str, Boolean bool) {
        this.e.d(str, bool);
    }

    @Override // io.sentry.h1
    public final void e(io.sentry.protocol.i0 i0Var) {
        if (isEnabled()) {
            this.e.e(i0Var);
        } else {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.h1
    public final void f(String str, String str2) {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            r().getLogger().h(t5.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.e.f(str, str2);
        }
    }

    @Override // io.sentry.h1
    public final lf5 g() {
        return this.e.G().g();
    }

    @Override // io.sentry.h1
    public final boolean h() {
        return this.e.G().h();
    }

    @Override // io.sentry.h1
    public final void i(Throwable th, i7 i7Var, String str) {
        this.e.i(th, i7Var, str);
    }

    @Override // io.sentry.h1
    public final boolean isEnabled() {
        return this.e.G().isEnabled();
    }

    @Override // io.sentry.h1
    public final void j(g gVar, n0 n0Var) {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (gVar == null) {
            r().getLogger().h(t5.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            this.e.j(gVar, n0Var);
        }
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w k(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            io.sentry.protocol.w wVarK = this.e.G().k(cVar, n0Var);
            return wVarK != null ? wVarK : wVar;
        } catch (Throwable th) {
            this.r().getLogger().d(t5.ERROR, "Error while capturing envelope.", th);
            return wVar;
        }
    }

    @Override // io.sentry.h1
    public final void m(g gVar) {
        j(gVar, new n0());
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w n(v3 v3Var) {
        p.v("profilingContinuousData is required", v3Var);
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return this.e.G().n(v3Var);
        } catch (Throwable th) {
            this.r().getLogger().d(t5.ERROR, "Error while capturing profile chunk with id: " + v3Var.G, th);
            return wVar;
        }
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w o(Throwable th, n0 n0Var, j4 j4Var) {
        return J(th, n0Var, j4Var);
    }

    @Override // io.sentry.h1
    public final void q() {
        if (r().isEnableTimeToFullDisplayTracing()) {
            CopyOnWriteArrayList<io.sentry.android.core.d> copyOnWriteArrayList = r().getFullyDisplayedReporter().a;
            copyOnWriteArrayList.clear();
            for (io.sentry.android.core.d dVar : copyOnWriteArrayList) {
                ActivityLifecycleIntegration activityLifecycleIntegration = dVar.a;
                p1 p1Var = dVar.b;
                p1 p1Var2 = dVar.c;
                Future future = activityLifecycleIntegration.S;
                if (future != null) {
                    future.cancel(false);
                    activityLifecycleIntegration.S = null;
                }
                v vVarA = activityLifecycleIntegration.X.a();
                try {
                    if (p1Var.h()) {
                        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.H;
                        if (sentryAndroidOptions != null) {
                            a5 a5VarC = sentryAndroidOptions.getDateProvider().c();
                            p1Var2.x("time_to_full_display", Long.valueOf(a5VarC.b(p1Var2.D()) / 1000000), q2.MILLISECOND);
                            ActivityLifecycleIntegration.e(p1Var2, a5VarC, null);
                        } else if (!p1Var2.h()) {
                            p1Var2.p();
                        }
                    } else {
                        activityLifecycleIntegration.W = true;
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
        }
    }

    @Override // io.sentry.h1
    public final w6 r() {
        return ((f1) this.e.b).r();
    }

    @Override // io.sentry.h1
    public final r1 s() {
        if (isEnabled()) {
            return this.e.s();
        }
        r().getLogger().h(t5.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.h1
    public final r1 t(s7 s7Var, t7 t7Var) {
        Double dValueOf;
        s7Var.M = (String) t7Var.f;
        boolean zIsEnabled = isEnabled();
        r1 r1VarA = m3.a;
        if (!zIsEnabled) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.n.a(s7Var.M, r().getIgnoredSpanOrigins())) {
            r().getLogger().h(t5.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", s7Var.M);
        } else if (!r().getInstrumenter().equals(s7Var.P)) {
            r().getLogger().h(t5.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", s7Var.P, r().getInstrumenter());
        } else if (r().isTracingEnabled()) {
            c cVar = s7Var.Q;
            if (cVar == null || (dValueOf = cVar.d) == null) {
                Double d = ((c) this.e.D().d).d;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            r7 r7VarA = r().getInternalTracesSampler().a(new y(s7Var, 3, dValueOf));
            Boolean bool = r7VarA.a;
            s7Var.a(r7VarA);
            q1 spanFactory = r().getSpanFactory();
            if (bool.booleanValue() && r().isContinuousProfilingEnabled()) {
                x3 profileLifecycle = r().getProfileLifecycle();
                x3 x3Var = x3.TRACE;
                if (profileLifecycle == x3Var && s7Var.S.equals(io.sentry.protocol.w.F)) {
                    r().getContinuousProfiler().c(x3Var, r().getInternalTracesSampler());
                }
            }
            r1VarA = spanFactory.a(s7Var, this, t7Var, this.d);
            if (bool.booleanValue() && r7VarA.d.booleanValue()) {
                s1 transactionProfiler = r().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.b(r1VarA);
                } else if (t7Var.g) {
                    transactionProfiler.b(r1VarA);
                }
            }
        } else {
            r().getLogger().h(t5.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (i4.ON == ((i4) t7Var.e)) {
            r1VarA.q();
        }
        return r1VarA;
    }

    @Override // io.sentry.h1
    public final void u() {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        m mVar = this.e;
        h7 h7VarU = mVar.u();
        if (h7VarU != null) {
            mVar.G().c(h7VarU, io.sentry.util.c.a(new io.sentry.hints.j()));
        }
    }

    @Override // io.sentry.h1
    public final void v() {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        m mVar = this.e;
        io.sentry.internal.debugmeta.c cVarV = mVar.v();
        if (cVarV == null) {
            r().getLogger().h(t5.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (cVarV.h() != null) {
            mVar.G().c(cVarV.h(), io.sentry.util.c.a(new io.sentry.hints.j()));
        }
        mVar.G().c(cVarV.d(), io.sentry.util.c.a(new io.sentry.hints.j()));
    }

    @Override // io.sentry.h1
    public final void w(j4 j4Var) {
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            j4Var.i(this.e.V(null));
        } catch (Throwable th) {
            r().getLogger().d(t5.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.h1
    public final Boolean x() {
        z4 z4Var = z4.d;
        String cacheDirPath = r().getCacheDirPath();
        boolean zIsEnableAutoSessionTracking = r().isEnableAutoSessionTracking();
        v vVarA = z4Var.c.a();
        try {
            if (z4Var.a) {
                Boolean bool = z4Var.b;
                vVarA.close();
                return bool;
            }
            if (cacheDirPath == null) {
                vVarA.close();
                return null;
            }
            boolean z = true;
            z4Var.a = true;
            File file = new File(cacheDirPath, "last_crash");
            File file2 = new File(cacheDirPath, ".sentry-native/last_crash");
            if (!file.exists()) {
                if (!file2.exists()) {
                    z = false;
                } else if (!zIsEnableAutoSessionTracking) {
                    file2.delete();
                }
                z4Var.b = Boolean.valueOf(z);
                vVarA.close();
                return z4Var.b;
            }
            file.delete();
            z4Var.b = Boolean.valueOf(z);
            vVarA.close();
            return z4Var.b;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.h1
    public final io.sentry.protocol.w y(y6 y6Var, n0 n0Var) {
        f1 f1Var = this.e;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        if (!isEnabled()) {
            r().getLogger().h(t5.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return f1Var.G().d(y6Var, f1Var, n0Var);
        } catch (Throwable th) {
            this.r().getLogger().d(t5.ERROR, "Error while capturing replay", th);
            return wVar;
        }
    }

    @Override // io.sentry.h1
    public final f1 z() {
        return this.a;
    }
}
