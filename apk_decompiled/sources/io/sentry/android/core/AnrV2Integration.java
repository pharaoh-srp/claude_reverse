package io.sentry.android.core;

import android.content.Context;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class AnrV2Integration implements io.sentry.x1, Closeable {
    public final Context E;
    public final io.sentry.transport.c F;
    public SentryAndroidOptions G;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = io.sentry.transport.c.E;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(t5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.G.isAnrEnabled()));
        String cacheDirPath = this.G.getCacheDirPath();
        SentryAndroidOptions sentryAndroidOptions2 = this.G;
        if (cacheDirPath == null) {
            sentryAndroidOptions2.getLogger().h(t5.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (sentryAndroidOptions2.isAnrEnabled()) {
            try {
                io.sentry.l1 executorService = w6Var.getExecutorService();
                Context context = this.E;
                SentryAndroidOptions sentryAndroidOptions3 = this.G;
                executorService.submit(new k0(context, sentryAndroidOptions3, this.F, new q0(sentryAndroidOptions3)));
            } catch (Throwable th) {
                w6Var.getLogger().d(t5.DEBUG, "Failed to start ANR processor.", th);
            }
            w6Var.getLogger().h(t5.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.p.a("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }
}
