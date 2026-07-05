package io.sentry.android.core;

import android.content.Context;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class TombstoneIntegration implements io.sentry.x1, Closeable {
    public final Context E;
    public final io.sentry.transport.c F;
    public SentryAndroidOptions G;

    public TombstoneIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = io.sentry.transport.c.E;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.G = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().h(t5.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.G.isTombstoneEnabled()));
        if (this.G.isTombstoneEnabled()) {
            if (this.G.getCacheDirPath() == null) {
                this.G.getLogger().h(t5.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.l1 executorService = w6Var.getExecutorService();
                Context context = this.E;
                SentryAndroidOptions sentryAndroidOptions2 = this.G;
                executorService.submit(new k0(context, sentryAndroidOptions2, this.F, new io.sentry.m(context, sentryAndroidOptions2)));
            } catch (Throwable th) {
                w6Var.getLogger().d(t5.DEBUG, "Failed to start tombstone processor.", th);
            }
            w6Var.getLogger().h(t5.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.p.a("Tombstone");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.G;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().h(t5.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }
}
