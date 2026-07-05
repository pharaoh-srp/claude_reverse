package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class vqk extends wpk {
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    public vqk(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.b = atomicReferenceFieldUpdater;
        this.c = atomicReferenceFieldUpdater2;
        this.d = atomicReferenceFieldUpdater3;
        this.e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.wpk
    public final void m(yyk yykVar, yyk yykVar2) {
        this.c.lazySet(yykVar, yykVar2);
    }

    @Override // defpackage.wpk
    public final void n(yyk yykVar, Thread thread) {
        this.b.lazySet(yykVar, thread);
    }

    @Override // defpackage.wpk
    public final boolean o(x0l x0lVar, tjk tjkVar, tjk tjkVar2) {
        return urk.k(this.e, x0lVar, tjkVar, tjkVar2);
    }

    @Override // defpackage.wpk
    public final boolean p(x0l x0lVar, Object obj, Object obj2) {
        return urk.k(this.f, x0lVar, obj, obj2);
    }

    @Override // defpackage.wpk
    public final boolean q(x0l x0lVar, yyk yykVar, yyk yykVar2) {
        return urk.k(this.d, x0lVar, yykVar, yykVar2);
    }
}
