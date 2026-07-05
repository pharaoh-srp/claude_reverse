package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class knf implements Executor {
    public final /* synthetic */ int E;
    public final Executor F;
    public final ArrayDeque G;
    public Runnable H;
    public final Object I;

    public knf(Executor executor, int i) {
        this.E = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.F = executor;
                this.G = new ArrayDeque();
                this.I = new Object();
                break;
            default:
                this.F = executor;
                this.G = new ArrayDeque();
                this.I = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.E) {
            case 0:
                Runnable runnable = (Runnable) this.G.poll();
                this.H = runnable;
                if (runnable != null) {
                    this.F.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.I) {
                    Object objPoll = this.G.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.H = runnable2;
                    if (objPoll != null) {
                        this.F.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.E) {
            case 0:
                synchronized (this.I) {
                    try {
                        this.G.add(new c5a(this, 2, runnable));
                        if (this.H == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.I) {
                    this.G.offer(new yw5(runnable, 27, this));
                    if (this.H == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }
}
