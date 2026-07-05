package okio;

import defpackage.mdj;
import defpackage.mp0;
import defpackage.mr9;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "Watchdog", "Companion", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public class AsyncTimeout extends Timeout {
    public static final PriorityQueue i;
    public static AsyncTimeout j;
    public static final ReentrantLock k;
    public static final Condition l;
    public static final long m;
    public static final long n;
    public int f;
    public int g = -1;
    public long h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "", "TIMEOUT_WRITE_SIZE", "I", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public static final void a(AsyncTimeout asyncTimeout) {
            PriorityQueue priorityQueue = AsyncTimeout.i;
            if (AsyncTimeout.j == null) {
                AsyncTimeout.j = new AsyncTimeout();
                Watchdog watchdog = new Watchdog("Okio Watchdog");
                watchdog.setDaemon(true);
                watchdog.start();
            }
            long jNanoTime = System.nanoTime();
            long j = asyncTimeout.c;
            boolean z = asyncTimeout.a;
            if (j != 0 && z) {
                asyncTimeout.h = Math.min(j, asyncTimeout.e() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                asyncTimeout.h = jNanoTime + j;
            } else {
                if (!z) {
                    mr9.u();
                    return;
                }
                asyncTimeout.h = asyncTimeout.e();
            }
            PriorityQueue priorityQueue2 = AsyncTimeout.i;
            int i = priorityQueue2.a + 1;
            priorityQueue2.a = i;
            AsyncTimeout[] asyncTimeoutArr = priorityQueue2.b;
            if (i == asyncTimeoutArr.length) {
                AsyncTimeout[] asyncTimeoutArr2 = new AsyncTimeout[i * 2];
                mp0.v0(0, 0, 14, asyncTimeoutArr, asyncTimeoutArr2);
                priorityQueue2.b = asyncTimeoutArr2;
            }
            priorityQueue2.a(i, asyncTimeout);
            if (asyncTimeout.g == 1) {
                AsyncTimeout.l.signal();
            }
        }

        public static AsyncTimeout b() throws InterruptedException {
            PriorityQueue priorityQueue = AsyncTimeout.i;
            AsyncTimeout asyncTimeout = priorityQueue.b[1];
            if (asyncTimeout == null) {
                long jNanoTime = System.nanoTime();
                AsyncTimeout.l.await(AsyncTimeout.m, TimeUnit.MILLISECONDS);
                if (priorityQueue.b[1] != null || System.nanoTime() - jNanoTime < AsyncTimeout.n) {
                    return null;
                }
                return AsyncTimeout.j;
            }
            long jNanoTime2 = asyncTimeout.h - System.nanoTime();
            if (jNanoTime2 > 0) {
                AsyncTimeout.l.await(jNanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            priorityQueue.b(asyncTimeout);
            asyncTimeout.f = 2;
            return asyncTimeout;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "okio"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Watchdog extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            AsyncTimeout asyncTimeoutB;
            while (true) {
                try {
                    PriorityQueue priorityQueue = AsyncTimeout.i;
                    reentrantLock = AsyncTimeout.k;
                    reentrantLock.lock();
                    try {
                        asyncTimeoutB = Companion.b();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (asyncTimeoutB == AsyncTimeout.j) {
                    AsyncTimeout.j = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (asyncTimeoutB != null) {
                        asyncTimeoutB.n();
                    }
                }
            }
        }
    }

    static {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.b = new AsyncTimeout[8];
        i = priorityQueue;
        ReentrantLock reentrantLock = new ReentrantLock();
        k = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        l = conditionNewCondition;
        m = 60000L;
        n = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    @Override // okio.Timeout
    public final void b() {
        super.b();
        ReentrantLock reentrantLock = k;
        reentrantLock.lock();
        try {
            if (this.f == 1) {
                i.b(this);
                this.f = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void k() {
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = k;
            reentrantLock.lock();
            try {
                if (this.f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f = 1;
                Companion.a(this);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean l() {
        ReentrantLock reentrantLock = k;
        reentrantLock.lock();
        try {
            int i2 = this.f;
            this.f = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            i.b(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException m(IOException iOException) {
        throw null;
    }

    public void n() {
    }
}
