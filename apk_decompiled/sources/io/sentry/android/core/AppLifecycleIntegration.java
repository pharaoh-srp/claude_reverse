package io.sentry.android.core;

import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class AppLifecycleIntegration implements io.sentry.x1, Closeable {
    public final io.sentry.util.a E = new io.sentry.util.a();
    public volatile a1 F;
    public SentryAndroidOptions G;

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        io.sentry.a1 logger = sentryAndroidOptions.getLogger();
        t5 t5Var = t5.DEBUG;
        logger.h(t5Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.G.isEnableAutoSessionTracking()));
        this.G.getLogger().h(t5Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.G.isEnableAppLifecycleBreadcrumbs()));
        if (this.G.isEnableAutoSessionTracking() || this.G.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.v vVarA = this.E.a();
            try {
                if (this.F != null) {
                    vVarA.close();
                    return;
                }
                this.F = new a1(this.G.getSessionTrackingIntervalMillis(), this.G.isEnableAutoSessionTracking(), this.G.isEnableAppLifecycleBreadcrumbs());
                f0.I.c(this.F);
                vVarA.close();
                w6Var.getLogger().h(t5Var, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.p.a("AppLifecycle");
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.v vVarA = this.E.a();
        try {
            a1 a1Var = this.F;
            this.F = null;
            vVarA.close();
            if (a1Var != null) {
                f0.I.f(a1Var);
                SentryAndroidOptions sentryAndroidOptions = this.G;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(t5.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            f0.I.i();
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
