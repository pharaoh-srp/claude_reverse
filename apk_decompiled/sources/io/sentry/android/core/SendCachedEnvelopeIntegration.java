package io.sentry.android.core;

import io.sentry.n4;
import io.sentry.p4;
import io.sentry.q4;
import io.sentry.t5;
import io.sentry.w6;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class SendCachedEnvelopeIntegration implements io.sentry.x1, io.sentry.t0, Closeable {
    public final q4 E;
    public final io.sentry.util.h F;
    public io.sentry.u0 H;
    public n4 I;
    public SentryAndroidOptions J;
    public p4 K;
    public final AtomicBoolean G = new AtomicBoolean(false);
    public final AtomicBoolean L = new AtomicBoolean(false);
    public final AtomicBoolean M = new AtomicBoolean(false);
    public final io.sentry.util.a N = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(q4 q4Var, io.sentry.util.h hVar) {
        this.E = q4Var;
        this.F = hVar;
    }

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        n4 n4Var = n4.a;
        this.I = n4Var;
        SentryAndroidOptions sentryAndroidOptions = w6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w6Var : null;
        io.sentry.p.v("SentryAndroidOptions is required", sentryAndroidOptions);
        this.J = sentryAndroidOptions;
        String cacheDirPath = w6Var.getCacheDirPath();
        io.sentry.a1 logger = w6Var.getLogger();
        this.E.getClass();
        if (!q4.b(logger, cacheDirPath)) {
            w6Var.getLogger().h(t5.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            io.sentry.p.a("SendCachedEnvelope");
            c(n4Var, this.J);
        }
    }

    public final void c(n4 n4Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.v vVarA = this.N.a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new i1(this, sentryAndroidOptions, n4Var, 0));
                if (((Boolean) this.F.a()).booleanValue() && this.G.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().h(t5.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().h(t5.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().h(t5.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                vVarA.close();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(t5.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.M.set(true);
        io.sentry.u0 u0Var = this.H;
        if (u0Var != null) {
            u0Var.y0(this);
        }
    }

    @Override // io.sentry.t0
    public final void e(io.sentry.s0 s0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        n4 n4Var = this.I;
        if (n4Var == null || (sentryAndroidOptions = this.J) == null || s0Var == io.sentry.s0.DISCONNECTED) {
            return;
        }
        c(n4Var, sentryAndroidOptions);
    }
}
