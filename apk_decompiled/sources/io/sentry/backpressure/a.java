package io.sentry.backpressure;

import defpackage.yr6;
import io.sentry.l1;
import io.sentry.n4;
import io.sentry.t5;
import io.sentry.v;
import io.sentry.w6;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, Runnable {
    public final w6 E;
    public final n4 F;
    public int G;
    public volatile Future H;
    public final io.sentry.util.a I;

    public a(w6 w6Var) {
        n4 n4Var = n4.a;
        this.G = 0;
        this.H = null;
        this.I = new io.sentry.util.a();
        this.E = w6Var;
        this.F = n4Var;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.G;
    }

    public final void b(int i) {
        l1 executorService = this.E.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        v vVarA = this.I.a();
        try {
            try {
                this.H = executorService.c(this, i);
            } catch (RejectedExecutionException e) {
                this.E.getLogger().d(t5.WARNING, "Backpressure monitor reschedule task rejected", e);
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

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.H;
        if (future != null) {
            v vVarA = this.I.a();
            try {
                future.cancel(true);
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean zH = this.F.h();
        int i = this.G;
        w6 w6Var = this.E;
        if (zH) {
            if (i > 0) {
                w6Var.getLogger().h(t5.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.G = 0;
        } else if (i < 10) {
            this.G = i + 1;
            w6Var.getLogger().h(t5.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.G));
        }
        b(yr6.INVALID_OWNERSHIP);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}
