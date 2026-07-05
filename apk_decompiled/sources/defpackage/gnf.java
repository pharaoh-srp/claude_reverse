package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class gnf implements Executor {
    public static final Logger J = Logger.getLogger(gnf.class.getName());
    public final Executor E;
    public final ArrayDeque F = new ArrayDeque();
    public int G = 1;
    public long H = 0;
    public final c5a I = new c5a(this);

    public gnf(Executor executor) {
        dgj.v(executor);
        this.E = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dgj.v(runnable);
        synchronized (this.F) {
            int i = this.G;
            if (i != 4 && i != 3) {
                long j = this.H;
                boolean z = true;
                i3f i3fVar = new i3f(runnable, 1);
                this.F.add(i3fVar);
                this.G = 2;
                try {
                    this.E.execute(this.I);
                    if (this.G != 2) {
                        return;
                    }
                    synchronized (this.F) {
                        try {
                            if (this.H == j && this.G == 2) {
                                this.G = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.F) {
                        try {
                            int i2 = this.G;
                            if ((i2 != 1 && i2 != 2) || !this.F.removeLastOccurrence(i3fVar)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.F.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.E + "}";
    }
}
