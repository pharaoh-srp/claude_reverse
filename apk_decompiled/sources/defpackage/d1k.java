package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class d1k extends ppk {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(g1k.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(g1k.class, g1k.class, "b");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(j1k.class, g1k.class, "G");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(j1k.class, z0k.class, "F");
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(j1k.class, Object.class, "E");

    @Override // defpackage.ppk
    public final z0k g(l4k l4kVar) {
        return (z0k) e.getAndSet(l4kVar, z0k.d);
    }

    @Override // defpackage.ppk
    public final g1k h(l4k l4kVar) {
        return (g1k) d.getAndSet(l4kVar, g1k.c);
    }

    @Override // defpackage.ppk
    public final void i(g1k g1kVar, g1k g1kVar2) {
        c.lazySet(g1kVar, g1kVar2);
    }

    @Override // defpackage.ppk
    public final void j(g1k g1kVar, Thread thread) {
        b.lazySet(g1kVar, thread);
    }

    @Override // defpackage.ppk
    public final boolean k(l4k l4kVar, z0k z0kVar, z0k z0kVar2) {
        return qpk.h(e, l4kVar, z0kVar, z0kVar2);
    }

    @Override // defpackage.ppk
    public final boolean l(j1k j1kVar, Object obj, Object obj2) {
        return qpk.h(f, j1kVar, obj, obj2);
    }

    @Override // defpackage.ppk
    public final boolean m(j1k j1kVar, g1k g1kVar, g1k g1kVar2) {
        return qpk.h(d, j1kVar, g1kVar, g1kVar2);
    }
}
