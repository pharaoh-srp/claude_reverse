package io.sentry;

import defpackage.qz;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements l1 {
    public final ScheduledThreadPoolExecutor a;
    public final io.sentry.util.a b;
    public final qz c;
    public final w6 d;

    public n5(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, w6 w6Var) {
        this.b = new io.sentry.util.a();
        this.c = new qz(1);
        this.a = scheduledThreadPoolExecutor;
        this.d = w6Var;
    }

    @Override // io.sentry.l1
    public final void a(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        v vVarA = this.b.a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
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

    @Override // io.sentry.l1
    public final void b() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        try {
            scheduledThreadPoolExecutor.submit(new defpackage.y0(14, this));
        } catch (RejectedExecutionException e) {
            w6 w6Var = this.d;
            if (w6Var != null) {
                w6Var.getLogger().d(t5.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e);
            }
        }
    }

    @Override // io.sentry.l1
    public final Future c(Runnable runnable, long j) {
        return this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.l1
    public final boolean isClosed() {
        v vVarA = this.b.a();
        try {
            boolean zIsShutdown = this.a.isShutdown();
            vVarA.close();
            return zIsShutdown;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.l1
    public final Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        w6 w6Var = this.d;
        if (w6Var != null) {
            w6Var.getLogger().h(t5.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new l5();
    }

    public n5(w6 w6Var) {
        this(new ScheduledThreadPoolExecutor(1, new m5(0)), w6Var);
    }

    public n5() {
        this(new ScheduledThreadPoolExecutor(1, new m5(0)), null);
    }
}
