package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class lkf extends lff {
    public final /* synthetic */ AtomicReferenceArray K;

    public lkf(long j, lkf lkfVar, int i) {
        super(j, lkfVar, i);
        this.K = new AtomicReferenceArray(kkf.f);
    }

    @Override // defpackage.lff
    public final int l() {
        return kkf.f;
    }

    @Override // defpackage.lff
    public final void m(int i, c45 c45Var) {
        this.K.set(i, kkf.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.I + ", hashCode=" + hashCode() + ']';
    }
}
