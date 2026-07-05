package io.sentry.android.core;

import android.content.Context;
import defpackage.tui;
import defpackage.u95;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements io.sentry.x1, Closeable {
    public static a I;
    public static final io.sentry.util.a J = new io.sentry.util.a();
    public final Context E;
    public boolean F = false;
    public final io.sentry.util.a G = new io.sentry.util.a();
    public w6 H;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext != null ? applicationContext : context;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        this.H = w6Var;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w6Var;
        sentryAndroidOptions.getLogger().h(t5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.p.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new tui(this, 9, sentryAndroidOptions));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(t5.DEBUG, "Failed to start AnrIntegration on executor thread.", th);
            }
        }
    }

    public final void c(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.v vVarA = J.a();
        try {
            if (I == null) {
                io.sentry.a1 logger = sentryAndroidOptions.getLogger();
                t5 t5Var = t5.DEBUG;
                logger.h(t5Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new u95(this, 25, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.E);
                I = aVar;
                aVar.start();
                sentryAndroidOptions.getLogger().h(t5Var, "AnrIntegration installed.", new Object[0]);
            }
            vVarA.close();
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.v vVarA = this.G.a();
        try {
            this.F = true;
            vVarA.close();
            vVarA = J.a();
            try {
                a aVar = I;
                if (aVar != null) {
                    aVar.interrupt();
                    I = null;
                    w6 w6Var = this.H;
                    if (w6Var != null) {
                        w6Var.getLogger().h(t5.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                vVarA.close();
            } finally {
                try {
                    vVarA.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
