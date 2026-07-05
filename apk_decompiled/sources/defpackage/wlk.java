package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class wlk extends pqk {
    public static final AtomicLong O = new AtomicLong(Long.MIN_VALUE);
    public kmk G;
    public kmk H;
    public final PriorityBlockingQueue I;
    public final LinkedBlockingQueue J;
    public final emk K;
    public final emk L;
    public final Object M;
    public final Semaphore N;

    public wlk(umk umkVar) {
        super(umkVar);
        this.M = new Object();
        this.N = new Semaphore(2);
        this.I = new PriorityBlockingQueue();
        this.J = new LinkedBlockingQueue();
        this.K = new emk(this, "Thread death: Uncaught exception on worker thread");
        this.L = new emk(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // defpackage.rok
    public final void K0() {
        if (Thread.currentThread() == this.G) {
            return;
        }
        sz6.j("Call expected from worker thread");
    }

    @Override // defpackage.pqk
    public final boolean N0() {
        return false;
    }

    public final Object O0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            O().T0(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                b0().M.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            b0().M.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final nmk P0(Callable callable) {
        L0();
        nmk nmkVar = new nmk(this, callable, false);
        if (Thread.currentThread() != this.G) {
            Q0(nmkVar);
            return nmkVar;
        }
        if (!this.I.isEmpty()) {
            b0().M.b("Callable skipped the worker queue.");
        }
        nmkVar.run();
        return nmkVar;
    }

    public final void Q0(nmk nmkVar) {
        synchronized (this.M) {
            try {
                this.I.add(nmkVar);
                kmk kmkVar = this.G;
                if (kmkVar == null) {
                    kmk kmkVar2 = new kmk(this, "Measurement Worker", this.I);
                    this.G = kmkVar2;
                    kmkVar2.setUncaughtExceptionHandler(this.K);
                    this.G.start();
                } else {
                    synchronized (kmkVar.E) {
                        kmkVar.E.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R0(Runnable runnable) {
        L0();
        nmk nmkVar = new nmk(this, runnable, false, "Task exception on network thread");
        synchronized (this.M) {
            try {
                this.J.add(nmkVar);
                kmk kmkVar = this.H;
                if (kmkVar == null) {
                    kmk kmkVar2 = new kmk(this, "Measurement Network", this.J);
                    this.H = kmkVar2;
                    kmkVar2.setUncaughtExceptionHandler(this.L);
                    this.H.start();
                } else {
                    synchronized (kmkVar.E) {
                        kmkVar.E.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final nmk S0(Callable callable) {
        L0();
        nmk nmkVar = new nmk(this, callable, true);
        if (Thread.currentThread() == this.G) {
            nmkVar.run();
            return nmkVar;
        }
        Q0(nmkVar);
        return nmkVar;
    }

    public final void T0(Runnable runnable) {
        L0();
        dgj.v(runnable);
        Q0(new nmk(this, runnable, false, "Task exception on worker thread"));
    }

    public final void U0(Runnable runnable) {
        L0();
        Q0(new nmk(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean V0() {
        return Thread.currentThread() == this.G;
    }

    public final void W0() {
        if (Thread.currentThread() == this.H) {
            return;
        }
        sz6.j("Call expected from network thread");
    }
}
