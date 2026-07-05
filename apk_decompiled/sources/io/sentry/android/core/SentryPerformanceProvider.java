package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import defpackage.jke;
import defpackage.sz6;
import io.sentry.n2;
import io.sentry.n5;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.t5;
import io.sentry.u4;
import io.sentry.w6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public final class SentryPerformanceProvider extends v0 {
    public static final long I = SystemClock.uptimeMillis();
    public static final /* synthetic */ int J = 0;
    public Application F;
    public final io.sentry.a1 G;
    public final l0 H;

    public SentryPerformanceProvider() {
        new io.sentry.util.a();
        t tVar = new t(3);
        this.G = tVar;
        this.H = new l0(tVar);
    }

    public final void a(Context context, u4 u4Var, io.sentry.android.core.performance.h hVar) {
        boolean z = u4Var.M;
        io.sentry.a1 a1Var = this.G;
        if (!z) {
            a1Var.h(t5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        h hVar2 = new h(this.H, new io.sentry.android.core.internal.util.p(context.getApplicationContext(), a1Var, this.H), this.G, u4Var.I, u4Var.L, new jke(17, new n5()));
        hVar.M = null;
        hVar.N = hVar2;
        a1Var.h(t5.DEBUG, "App start continuous profiling started.", new Object[0]);
        w6 w6VarEmpty = w6.empty();
        w6VarEmpty.setProfileSessionSampleRate(Double.valueOf(u4Var.M ? 1.0d : 0.0d));
        hVar2.c(u4Var.P, new q7(w6VarEmpty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            sz6.j("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    public final void b(Context context, u4 u4Var, io.sentry.android.core.performance.h hVar) {
        boolean z = u4Var.G;
        r7 r7Var = new r7(Boolean.valueOf(z), u4Var.H, null, Boolean.valueOf(u4Var.E), u4Var.F);
        hVar.O = r7Var;
        boolean zBooleanValue = r7Var.d.booleanValue();
        io.sentry.a1 a1Var = this.G;
        if (!zBooleanValue || !z) {
            a1Var.h(t5.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        n5 n5Var = new n5();
        l0 l0Var = this.H;
        u uVar = new u(context, l0Var, new io.sentry.android.core.internal.util.p(context, a1Var, l0Var), this.G, u4Var.I, u4Var.J, u4Var.L, new jke(17, n5Var));
        hVar.N = null;
        hVar.M = uVar;
        a1Var.h(t5.DEBUG, "App start profiling started.", new Object[0]);
        uVar.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.h hVarC = io.sentry.android.core.performance.h.c();
        Context context = getContext();
        hVarC.I.c(I);
        this.H.getClass();
        hVarC.H.c(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.F = (Application) context;
        }
        Application application = this.F;
        if (application != null) {
            hVarC.e(application);
        }
        Context context2 = getContext();
        io.sentry.a1 a1Var = this.G;
        if (context2 == null) {
            a1Var.h(t5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (!file.exists() || !file.canRead()) {
            return true;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                u4 u4Var = (u4) new n2(w6.empty()).c(bufferedReader, u4.class);
                if (u4Var == null) {
                    a1Var.h(t5.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                } else if (u4Var.K && u4Var.O) {
                    a(context2, u4Var, hVarC);
                } else if (!u4Var.J) {
                    a1Var.h(t5.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                } else if (u4Var.N) {
                    b(context2, u4Var, hVarC);
                }
                bufferedReader.close();
                return true;
            } finally {
            }
        } catch (FileNotFoundException e) {
            a1Var.d(t5.ERROR, "App start profiling config file not found. ", e);
            return true;
        } catch (Throwable th) {
            a1Var.d(t5.ERROR, "Error reading app start profiling config file. ", th);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        io.sentry.v vVarA = io.sentry.android.core.performance.h.V.a();
        try {
            u uVar = io.sentry.android.core.performance.h.c().M;
            if (uVar != null) {
                uVar.close();
            }
            h hVar = io.sentry.android.core.performance.h.c().N;
            if (hVar != null) {
                hVar.a(true);
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

    public SentryPerformanceProvider(io.sentry.a1 a1Var, l0 l0Var) {
        new io.sentry.util.a();
        this.G = a1Var;
        this.H = l0Var;
    }
}
