package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class dr5 extends a07 implements Runnable {
    public static final dr5 P;
    public static final long Q;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        dr5 dr5Var = new dr5();
        P = dr5Var;
        dr5Var.U0(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        Q = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.gw5
    public final y86 P(long j, Runnable runnable, c45 c45Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return d6c.E;
        }
        long jNanoTime = System.nanoTime();
        xz6 xz6Var = new xz6(runnable, j2 + jNanoTime);
        i1(jNanoTime, xz6Var);
        return xz6Var;
    }

    @Override // defpackage.a07
    public final void Z0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Z0(runnable);
    }

    @Override // defpackage.a07
    public final Thread d1() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(P.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.a07
    public final void f1(long j, yz6 yz6Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void l1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            h1();
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zE1;
        vnh.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zE1) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jV0 = V0();
                    if (jV0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = Q + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            l1();
                            if (e1()) {
                                return;
                            }
                            d1();
                            return;
                        }
                        if (jV0 > j2) {
                            jV0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jV0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            l1();
                            if (e1()) {
                                return;
                            }
                            d1();
                            return;
                        }
                        LockSupport.parkNanos(this, jV0);
                    }
                }
            }
        } finally {
            _thread = null;
            l1();
            if (!e1()) {
                d1();
            }
        }
    }

    @Override // defpackage.a07, defpackage.vz6
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.e45
    public final String toString() {
        return "DefaultExecutor";
    }
}
