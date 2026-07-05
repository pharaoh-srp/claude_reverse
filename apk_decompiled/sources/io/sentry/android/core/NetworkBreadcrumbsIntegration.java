package io.sentry.android.core;

import android.content.Context;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements io.sentry.x1, Closeable {
    public final Context E;
    public final l0 F;
    public final io.sentry.util.a G = new io.sentry.util.a();
    public volatile g1 H;

    public NetworkBreadcrumbsIntegration(Context context, l0 l0Var) {
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
        this.F = l0Var;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        io.sentry.a1 logger = w6Var.getLogger();
        t5 t5Var = t5.DEBUG;
        logger.h(t5Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.F.getClass();
            io.sentry.v vVarA = this.G.a();
            try {
                this.H = new g1(this.F, w6Var.getDateProvider());
                if (io.sentry.android.core.internal.util.c.c(this.E, w6Var.getLogger(), this.F, this.H)) {
                    w6Var.getLogger().h(t5Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.p.a("NetworkBreadcrumbs");
                } else {
                    w6Var.getLogger().h(t5Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.v vVarA = this.G.a();
        try {
            g1 g1Var = this.H;
            this.H = null;
            vVarA.close();
            if (g1Var != null) {
                io.sentry.v vVarA2 = io.sentry.android.core.internal.util.c.R.a();
                try {
                    io.sentry.android.core.internal.util.c.S.remove(g1Var);
                    vVarA2.close();
                } catch (Throwable th) {
                    try {
                        vVarA2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                vVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
