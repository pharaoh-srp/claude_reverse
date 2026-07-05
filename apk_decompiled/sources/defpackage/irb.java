package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class irb extends frb implements ScheduledExecutorService {
    public final ScheduledExecutorService F;

    public irb(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.F = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        m8i m8iVar = new m8i(Executors.callable(runnable, null));
        return new grb(m8iVar, this.F.schedule(m8iVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        hrb hrbVar = new hrb(runnable);
        return new grb(hrbVar, this.F.scheduleAtFixedRate(hrbVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        hrb hrbVar = new hrb(runnable);
        return new grb(hrbVar, this.F.scheduleWithFixedDelay(hrbVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        m8i m8iVar = new m8i(callable);
        return new grb(m8iVar, this.F.schedule(m8iVar, j, timeUnit));
    }
}
