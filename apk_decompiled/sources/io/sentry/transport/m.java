package io.sentry.transport;

import defpackage.pga;
import io.sentry.a1;
import io.sentry.a5;
import io.sentry.b5;
import io.sentry.m5;
import io.sentry.t5;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m extends ThreadPoolExecutor implements AutoCloseable {
    public final int E;
    public a5 F;
    public final a1 G;
    public final b5 H;
    public final io.sentry.d I;

    public m(int i, m5 m5Var, pga pgaVar, a1 a1Var, b5 b5Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), m5Var, pgaVar);
        this.F = null;
        this.I = new io.sentry.d(7, false);
        this.E = i;
        this.G = a1Var;
        this.H = b5Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        io.sentry.d dVar = this.I;
        try {
            super.afterExecute(runnable, th);
        } finally {
            o oVar = (o) dVar.E;
            int i = o.E;
            oVar.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        io.sentry.d dVar = this.I;
        o oVar = (o) dVar.E;
        o oVar2 = (o) dVar.E;
        int iA = o.a(oVar);
        int i = this.E;
        a1 a1Var = this.G;
        b5 b5Var = this.H;
        if (iA >= i) {
            this.F = b5Var.c();
            a1Var.h(t5.WARNING, "Submit cancelled", new Object[0]);
            return new l();
        }
        o.b(oVar2);
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e) {
            oVar2.releaseShared(1);
            this.F = b5Var.c();
            a1Var.d(t5.WARNING, "Submit rejected by thread pool executor", e);
            return new l();
        }
    }
}
