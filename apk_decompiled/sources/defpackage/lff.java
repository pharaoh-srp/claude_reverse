package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class lff extends gf4 implements q6c {
    public static final /* synthetic */ AtomicIntegerFieldUpdater J = AtomicIntegerFieldUpdater.newUpdater(lff.class, "cleanedAndPointers$volatile");
    public final long I;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public lff(long j, lff lffVar, int i) {
        super(lffVar);
        this.I = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // defpackage.gf4
    public final boolean g() {
        return J.get(this) == l() && d() != null;
    }

    public final boolean k() {
        return J.addAndGet(this, -65536) == l() && d() != null;
    }

    public abstract int l();

    public abstract void m(int i, c45 c45Var);

    public final void n() {
        if (J.incrementAndGet(this) == l()) {
            i();
        }
    }

    public final boolean o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = J;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == l() && d() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
