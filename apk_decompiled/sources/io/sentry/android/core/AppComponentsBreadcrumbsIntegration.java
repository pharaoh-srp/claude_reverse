package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.sd6;
import defpackage.uui;
import io.sentry.n4;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AppComponentsBreadcrumbsIntegration implements io.sentry.x1, Closeable, ComponentCallbacks2 {
    public static final io.sentry.n0 I = new io.sentry.n0();
    public final Context E;
    public n4 F;
    public SentryAndroidOptions G;
    public final sd6 H = new sd6(60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        this.F = n4.a;
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        io.sentry.a1 logger = sentryAndroidOptions.getLogger();
        t5 t5Var = t5.DEBUG;
        logger.h(t5Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.G.isEnableAppComponentBreadcrumbs()));
        if (this.G.isEnableAppComponentBreadcrumbs()) {
            try {
                this.E.registerComponentCallbacks(this);
                w6Var.getLogger().h(t5Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.p.a("AppComponentsBreadcrumbs");
            } catch (Throwable th) {
                this.G.setEnableAppComponentBreadcrumbs(false);
                w6Var.getLogger().b(t5.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    public final void c(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.G.getLogger().b(t5.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.E.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.G;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().b(t5.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.G;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().h(t5.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        c(new uui(this, System.currentTimeMillis(), configuration));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        if (i >= 40 && !this.H.a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c(new Runnable() { // from class: io.sentry.android.core.b0
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.E;
                    if (appComponentsBreadcrumbsIntegration.F != null) {
                        io.sentry.g gVar = new io.sentry.g(jCurrentTimeMillis);
                        gVar.I = "system";
                        gVar.K = "device.event";
                        gVar.H = "Low memory";
                        gVar.c("action", "LOW_MEMORY");
                        gVar.c("level", Integer.valueOf(i));
                        gVar.M = t5.WARNING;
                        appComponentsBreadcrumbsIntegration.F.j(gVar, AppComponentsBreadcrumbsIntegration.I);
                    }
                }
            });
        }
    }
}
