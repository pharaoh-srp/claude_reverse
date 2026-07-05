package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends ijk {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    public l1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicReferenceFieldUpdater2;
        this.g = atomicReferenceFieldUpdater3;
        this.h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ijk
    public final boolean b(w1 w1Var, k1 k1Var, k1 k1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(w1Var, k1Var, k1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w1Var) == k1Var);
        return false;
    }

    @Override // defpackage.ijk
    public final boolean c(w1 w1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(w1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w1Var) == obj);
        return false;
    }

    @Override // defpackage.ijk
    public final boolean d(w1 w1Var, v1 v1Var, v1 v1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(w1Var, v1Var, v1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(w1Var) == v1Var);
        return false;
    }

    @Override // defpackage.ijk
    public final k1 g(w1 w1Var) {
        return (k1) this.h.getAndSet(w1Var, k1.d);
    }

    @Override // defpackage.ijk
    public final v1 h(w1 w1Var) {
        return (v1) this.g.getAndSet(w1Var, v1.c);
    }

    @Override // defpackage.ijk
    public final void i(v1 v1Var, v1 v1Var2) {
        this.f.lazySet(v1Var, v1Var2);
    }

    @Override // defpackage.ijk
    public final void j(v1 v1Var, Thread thread) {
        this.e.lazySet(v1Var, thread);
    }
}
