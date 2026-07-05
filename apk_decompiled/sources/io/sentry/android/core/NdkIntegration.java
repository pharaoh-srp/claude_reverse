package io.sentry.android.core;

import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NdkIntegration implements io.sentry.x1, Closeable {
    public final Class E;
    public SentryAndroidOptions F;

    public NdkIntegration(Class cls) {
        this.E = cls;
    }

    public static void c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.F = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.a1 logger = this.F.getLogger();
        t5 t5Var = t5.DEBUG;
        logger.h(t5Var, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.E) == null) {
            c(this.F);
            return;
        }
        if (this.F.getCacheDirPath() == null) {
            this.F.getLogger().h(t5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            c(this.F);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.F);
            this.F.getLogger().h(t5Var, "NdkIntegration installed.", new Object[0]);
            io.sentry.p.a("Ndk");
        } catch (NoSuchMethodException e) {
            c(this.F);
            this.F.getLogger().d(t5.ERROR, "Failed to invoke the SentryNdk.init method.", e);
        } catch (Throwable th) {
            c(this.F);
            this.F.getLogger().d(t5.ERROR, "Failed to initialize SentryNdk.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.F;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.E;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.F.getLogger().h(t5.DEBUG, "NdkIntegration removed.", new Object[0]);
                        c(this.F);
                    } catch (NoSuchMethodException e) {
                        this.F.getLogger().d(t5.ERROR, "Failed to invoke the SentryNdk.close method.", e);
                        c(this.F);
                    }
                } catch (Throwable th) {
                    this.F.getLogger().d(t5.ERROR, "Failed to close SentryNdk.", th);
                    c(this.F);
                }
            }
        } catch (Throwable th2) {
            c(this.F);
            throw th2;
        }
    }
}
