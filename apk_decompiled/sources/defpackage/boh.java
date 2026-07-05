package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class boh extends nf9 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater N = AtomicIntegerFieldUpdater.newUpdater(boh.class, "_state$volatile");
    public final Thread L = Thread.currentThread();
    public y86 M;
    private volatile /* synthetic */ int _state$volatile;

    public static void u(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.nf9
    public final boolean r() {
        return true;
    }

    @Override // defpackage.nf9
    public final void s(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = N;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                u(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.L.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void t() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = N;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        u(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                y86 y86Var = this.M;
                if (y86Var != null) {
                    y86Var.a();
                    return;
                }
                return;
            }
        }
    }
}
