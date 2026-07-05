package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class grb extends uok implements ScheduledFuture, saa, Future {
    public final w1 G;
    public final ScheduledFuture H;

    public grb(w1 w1Var, ScheduledFuture scheduledFuture) {
        this.G = w1Var;
        this.H = scheduledFuture;
    }

    @Override // defpackage.saa
    public final void a(Runnable runnable, Executor executor) {
        this.G.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zO = o(z);
        if (zO) {
            this.H.cancel(z);
        }
        return zO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.H.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.G.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.H.getDelay(timeUnit);
    }

    @Override // defpackage.uok
    public final Object h() {
        return this.G;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.G.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.G.isDone();
    }

    public final boolean o(boolean z) {
        return this.G.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.G.get(j, timeUnit);
    }
}
