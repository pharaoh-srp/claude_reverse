package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class l8i extends AtomicReference implements Runnable {
    public static final wmj G = new wmj(3);
    public static final wmj H = new wmj(3);
    public final Callable E;
    public final /* synthetic */ m8i F;

    public l8i(m8i m8iVar, Callable callable) {
        this.F = m8iVar;
        callable.getClass();
        this.E = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        oa9 oa9Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof oa9;
            wmj wmjVar = H;
            if (!z2 && runnable != wmjVar) {
                break;
            }
            if (z2) {
                oa9Var = (oa9) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == wmjVar || compareAndSet(runnable, wmjVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(oa9Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            m8i m8iVar = this.F;
            boolean zIsDone = m8iVar.isDone();
            wmj wmjVar = G;
            if (!zIsDone) {
                try {
                    objCall = this.E.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, wmjVar)) {
                            a(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        m8iVar.m(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, wmjVar)) {
                            a(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            m8iVar.l(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == G) {
            str = "running=[DONE]";
        } else if (runnable instanceof oa9) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + this.E.toString();
    }
}
