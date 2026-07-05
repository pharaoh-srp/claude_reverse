package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends gb9 {
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;

    public w3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.c = atomicReferenceFieldUpdater;
        this.d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
        this.g = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.gb9
    public final void P(y3 y3Var, y3 y3Var2) {
        this.d.lazySet(y3Var, y3Var2);
    }

    @Override // defpackage.gb9
    public final void Q(y3 y3Var, Thread thread) {
        this.c.lazySet(y3Var, thread);
    }

    @Override // defpackage.gb9
    public final boolean n(z3 z3Var, v3 v3Var, v3 v3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(z3Var, v3Var, v3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z3Var) == v3Var);
        return false;
    }

    @Override // defpackage.gb9
    public final boolean o(z3 z3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(z3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z3Var) == obj);
        return false;
    }

    @Override // defpackage.gb9
    public final boolean p(z3 z3Var, y3 y3Var, y3 y3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(z3Var, y3Var, y3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z3Var) == y3Var);
        return false;
    }
}
