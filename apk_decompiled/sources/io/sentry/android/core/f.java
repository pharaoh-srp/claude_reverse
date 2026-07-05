package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import io.sentry.b3;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.f6;
import io.sentry.g4;
import io.sentry.g6;
import io.sentry.j3;
import io.sentry.l4;
import io.sentry.o3;
import io.sentry.s2;
import io.sentry.s4;
import io.sentry.t2;
import io.sentry.t5;
import io.sentry.u2;
import io.sentry.v2;
import io.sentry.w6;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements g4, s4 {
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3) {
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
    }

    @Override // io.sentry.g4
    public void c(io.sentry.r1 r1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.E;
        io.sentry.f1 f1Var = (io.sentry.f1) this.F;
        io.sentry.r1 r1Var2 = (io.sentry.r1) this.G;
        if (r1Var == null) {
            f1Var.Q(r1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.H;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", r1Var2.getName());
        }
    }

    @Override // io.sentry.s4
    public void d(w6 w6Var) {
        long j;
        io.sentry.v vVarA;
        t tVar = (t) this.E;
        Context context = (Context) this.F;
        s4 s4Var = (s4) this.G;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w6Var;
        boolean zD = io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "timber.log.Timber");
        boolean z = io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z2 = zD && io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zD2 = io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zD3 = io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        l0 l0Var = new l0(tVar);
        io.sentry.android.core.internal.gestures.h hVar = new io.sentry.android.core.internal.gestures.h();
        c cVar = new c(hVar, sentryAndroidOptions);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(tVar);
        sentryAndroidOptions.setFatalLogger(new t(2));
        sentryAndroidOptions.setDefaultScopeType(l4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(f6.OFF);
        sentryAndroidOptions.setDateProvider(new k1());
        sentryAndroidOptions.getLogs().b = new t(4);
        sentryAndroidOptions.getMetrics().b = new t(5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.p(applicationContext, tVar, l0Var));
        p0.a(applicationContext, l0Var, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        io.sentry.android.core.anr.f.a.set(true);
        PackageInfo packageInfoD = p0.d(applicationContext, l0Var);
        if (packageInfoD != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoD.packageName + "@" + packageInfoD.versionName + "+" + p0.e(packageInfoD, l0Var));
            }
            String str = packageInfoD.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(z0.a(applicationContext));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().d(t5.ERROR, "Could not generate distinct Id.", e);
            }
        }
        f0 f0Var = f0.I;
        if (f0Var.F == null) {
            vVarA = f0Var.E.a();
            try {
                f0Var.e(sentryAndroidOptions.getLogger());
                vVarA.close();
            } finally {
            }
        }
        sentryAndroidOptions.activate();
        q.a(context, sentryAndroidOptions, l0Var, hVar, cVar, z, z2, zD2, zD3);
        try {
            s4Var.d(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(t5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.i iVar = hVarC.H;
            j = 0;
            if (iVar.G == 0) {
                iVar.c(Process.getStartUptimeMillis());
            }
        } else {
            j = 0;
        }
        if (context.getApplicationContext() instanceof Application) {
            hVarC.e((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.i iVar2 = hVarC.I;
        if (iVar2.G == j) {
            iVar2.c(j1.a);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.h)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof t2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.c(context, sentryAndroidOptions, l0Var));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.g(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.q(sentryAndroidOptions, 0));
        sentryAndroidOptions.addEventProcessor(new r0(context, l0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new h1(sentryAndroidOptions, cVar));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, l0Var, zD2));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new h0(context, l0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.j) {
            sentryAndroidOptions.setTransportGate(new q0(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.h hVarC2 = io.sentry.android.core.performance.h.c();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.android.core.internal.modules.a(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.y(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof o3) {
            sentryAndroidOptions.setVersionDetector(new io.sentry.x(sentryAndroidOptions));
        }
        io.sentry.util.h hVar2 = new io.sentry.util.h(new g6(hVar, sentryAndroidOptions));
        boolean zD4 = io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(hVar2));
            if (zD4 && io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zD4 && io.sentry.android.core.internal.gestures.h.d(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.f.a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof j3) {
            sentryAndroidOptions.setSocketTagger(t.F);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new n());
            sentryAndroidOptions.addPerformanceCollector(new i(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.p frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                io.sentry.p.v("options.getFrameMetricsCollector is required", frameMetricsCollector);
                sentryAndroidOptions.addPerformanceCollector(new x1(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof s2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.u(sentryAndroidOptions));
        }
        if (zD2 && (sentryAndroidOptions.getReplayController().getR() instanceof b3)) {
            sentryAndroidOptions.getReplayController().j(new io.sentry.android.replay.d(sentryAndroidOptions));
        }
        vVarA = io.sentry.android.core.performance.h.V.a();
        try {
            u uVar = hVarC2.M;
            h hVar3 = hVarC2.N;
            hVarC2.M = null;
            hVarC2.N = null;
            vVarA.close();
            io.sentry.n compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(u2.E);
                if (hVar3 != null) {
                    hVar3.a(true);
                }
                if (uVar != null) {
                    sentryAndroidOptions.setTransactionProfiler(uVar);
                } else {
                    io.sentry.android.core.internal.util.p frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.p.v("options.getFrameMetricsCollector is required", frameMetricsCollector2);
                    sentryAndroidOptions.setTransactionProfiler(new u(context, sentryAndroidOptions, l0Var, frameMetricsCollector2));
                }
            } else {
                sentryAndroidOptions.setTransactionProfiler(v2.G);
                if (uVar != null) {
                    uVar.close();
                }
                if (hVar3 != null) {
                    sentryAndroidOptions.setContinuousProfiler(hVar3);
                    io.sentry.protocol.w wVar = hVar3.S;
                    if (hVar3.M && !wVar.equals(io.sentry.protocol.w.F)) {
                        compositePerformanceCollector.b(wVar.toString());
                    }
                } else {
                    io.sentry.android.core.internal.util.p frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                    io.sentry.p.v("options.getFrameMetricsCollector is required", frameMetricsCollector3);
                    sentryAndroidOptions.setContinuousProfiler(new h(l0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new p(sentryAndroidOptions, 0)));
                }
            }
            j1.a(sentryAndroidOptions, z, z2);
        } finally {
        }
    }
}
