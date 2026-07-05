package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k57 extends j57 implements gw5 {
    public final Executor G;

    public k57(Executor executor) {
        Method method;
        this.G = executor;
        Method method2 = ef4.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = ef4.a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        try {
            this.G.execute(runnable);
        } catch (RejectedExecutionException e) {
            knk.o(c45Var, gjk.b("The task was rejected", e));
            ft5 ft5Var = g86.a;
            vr5.G.O0(c45Var, runnable);
        }
    }

    @Override // defpackage.gw5
    public final y86 P(long j, Runnable runnable, c45 c45Var) {
        Executor executor = this.G;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                knk.o(c45Var, gjk.b("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new x86(scheduledFutureSchedule) : dr5.P.P(j, runnable, c45Var);
    }

    @Override // defpackage.j57
    public final Executor S0() {
        return this.G;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.G;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k57) && ((k57) obj).G == this.G;
    }

    public final int hashCode() {
        return System.identityHashCode(this.G);
    }

    @Override // defpackage.gw5
    public final void l0(long j, ua2 ua2Var) {
        Executor executor = this.G;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            t08 t08Var = new t08(this, 6, ua2Var);
            c45 c45Var = ua2Var.I;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(t08Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                knk.o(c45Var, gjk.b("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            ua2Var.x(new na2(scheduledFutureSchedule));
        } else {
            dr5.P.l0(j, ua2Var);
        }
    }

    @Override // defpackage.e45
    public final String toString() {
        return this.G.toString();
    }
}
